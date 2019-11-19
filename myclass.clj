(defprotocol Name
  (getName [this]))

(defprotocol Email
  (getEmail [this]))

(defrecord Dog [name]
  Name
  (getName [this] (println (:name this))))

(defrecord Person [name email]
  Name
  (getName [this] (println (:name this)))
  Email
  (getEmail [this] (println (:email this))))

(defn main []
  (def hachi (->Dog "Hachi"))
  (def tom (->Person "Tom" "tom@tom.com"))
  (getName hachi)
  (getName tom)
  (getEmail tom))
