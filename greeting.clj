(ns my-clojure-warehouse.greeting)

(defn greet
  ([] (greet "world"))
  ([^String name] (println (format "Hello, %s!!" name))))
