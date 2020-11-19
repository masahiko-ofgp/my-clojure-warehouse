(ns my-clojure-warehouse.l99)

;; L-01
(defn lst
  "Return the last element of a list." 
  [l]
  (when (list? l)
    (cond
      (empty? l) nil
      (empty? (rest l)) (first l)
      :else (recur (rest l)))))

;; L-02
(defn lst-two
  "Find the last but one (last and penultimate) elements of a list."
  [l]
  (when (list? l)
    (cond
      (empty? (or l (rest l))) nil
      (empty? (rest (rest l))) l
      :else (recur (rest l)))))

;; L-03
(defn at
  "Find the k's element of a list."
  [k l]
  (when (list? l)
    (cond
      (empty? l) nil
      :else (if (= k 1)
              (first l)
              (recur (- k 1) (rest l))))))

;; L-04
(defn leng
  "Find the number of elements of a list."
  [l]
  (when (list? l)
    (defn aux
      [n ls]
      (if (empty? ls)
        n
        (recur (+ n 1) (rest ls))))
    (aux 0 l)))


;; L-05
(defn revrs
  "Reverse a list."
  [l]
  (when (list? l)
    (defn aux
      [acc ls]
      (if (empty? ls)
        acc
        (recur (cons (first ls) acc) (rest ls))))
    (aux '() l)))


;; L-06
(defn palindrome?
  "Find out whether a list is a palindrome."
  [l]
  (when (list? l)
    (= l (revrs l))))


;; L-07
(defn flttn
  "Flatten a nested list structure."
  [l]
  (defn aux
    [acc ls]
    (cond
      (empty? ls) acc
      (not (list? (first ls))) (aux (cons (first ls) acc) (rest ls))
      :else (recur (aux acc (first ls)) (rest ls))))
  (reverse (aux '() l)))

