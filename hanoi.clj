(defn hanoi [n a b c]
  (when (pos? n)
    (hanoi (dec n) a c b)
    (println a "=>" c)
    (recur (dec n) b a c)))

(defn run-hanoi [disks]
  (hanoi disks \A \B \C))
