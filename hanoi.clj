(ns my-clojure-warehouse.hanoi)

(defn- hanoi [^long n a b c]
  (when (pos? n)
    (hanoi (dec n) a c b)
    (println a "=>" c)
    (recur (dec n) b a c)))

(defn run-hanoi [^long n]
  (hanoi n \A \B \C))
