(ns my-clojure-warehouse.fizzbuzz)

(defn- fizzbuzz [n]
  (let [fizz? (zero? (mod n 3))
        buzz? (zero? (mod n 5))]
    (cond
      (and fizz? buzz?) "Fizzbuzz"
      fizz? "Fizz"
      buzz? "Buzz"
      :else n)))

(defn fzbz [^long n]
  (doseq [i (range 0 n)]
    (println (fizzbuzz i))))
