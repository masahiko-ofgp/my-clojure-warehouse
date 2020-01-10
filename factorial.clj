(ns my-clojure-warehouse.factorial)

(defn- fact-cc [n f]
  (if (zero? n)
    (f 1)
    (fact-cc (dec n) (fn [x] (f (* n x))))))

(defn fact [n]
  (fact-cc n (fn [x] x)))
