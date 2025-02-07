package DSA.HashingMap;
import java.util.*;
public class HashMapImplementation {

    static class HashMap<K, V>{ // generics
        private class Node{
            K key;
            V value;

            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }

        private int n; // n - no. of nodes
        private int N; // N - no. of buckets
        private LinkedList<Node> buckets[]; // Here all the key value will be stored

        @SuppressWarnings("unchecked")

        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];
            for(int i =0; i<4; i++){
                this.buckets[i] = new LinkedList<>(); // Initialization of empty linked list in every index of the array
            }
        }

        // Functions / Methods

        private int hashFunction(K key){
            int bi =key.hashCode();
            return Math.abs(bi) % N;
        }

        private int searchInLL(K key, int bi){
            LinkedList<Node> ll = buckets[bi];

            for(int i =0; i<ll.size(); i++){
                if(ll.get(i).key == key){
                    return  i;
                }
            }
            return -1;
        }

        private void rehash(){
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N*2];

            for(int i =0; i<N*2; i++){
                buckets[i] = new LinkedList<>();
            }

            for(int i = 0; i<oldBucket.length; i++){
                LinkedList<Node> ll = oldBucket[i];
                for(int j =0; i<ll.size(); j++){
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }

        // put()
        public void put(K key, V value){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi); // this will return if data of the key is present or not if not it will return -1

            if(di == -1){
                buckets[bi].add(new Node(key, value)); // adding new node
                n++; // node is added
            } else{
                Node node = buckets[bi].get(di);
                node.value = value;
            }

            double lambda = (double) n/N;
            if(lambda > 2.0){
                // rehashing
                rehash();
            }
        }

        // get()
        public V get(K key, V value){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi); // this will return if data of the key is present or not if not it will return -1

            if(di == -1){
                return null;
            } else{ // key exists
                Node node = buckets[bi].get(di);
                return node.value;
            }
        }

        // containsKey()
        public boolean containsKey(K key, V value){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi); // this will return if data of the key is present or not if not it will return -1

            if(di == -1){
                return false;
            } else{ // key exists
                return true;
            }
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India",190);
        map.put("Us",90);
    }
}
