ssh-keygen -t rsa  (Press Enter-3 key )

cat  ~/.ssh/id_rsa.pub >>  ~/.ssh/authorized_keys

chmod 0600 ~/.ssh/authorized_keys
