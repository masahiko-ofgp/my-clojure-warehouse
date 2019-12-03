(defn fact-cc [n cont]
  (if (zero? n)
    (cont 1)
    (fact-cc (dec n) (fn [x] (cont (* n x))))))

(defn fact [n]
  (fact-cc n (fn [x] x)))
