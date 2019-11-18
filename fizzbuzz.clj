(defn fizzbuzz [n]
  (let [fizz? (zero? (mod n 3))
        buzz? (zero? (mod n 5))]
    (cond
      (and fizz? buzz?) "Fizzbuzz"
      fizz? "Fizz"
      buzz? "Buzz"
      :else n)))

(defn run-fizzbuzz [cnt]
  (doseq [i (range 0 cnt)]
    (println (fizzbuzz i))))
