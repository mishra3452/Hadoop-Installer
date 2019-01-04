SUCCESS=0
#username=$1   #Env var1
#passwd=$2	   #Env var1
username=hadoop
	# Check if user already exists.
	grep -q "$username" /etc/passwd
	if [ $? -eq $SUCCESS ] 
	then	
	echo "User $username does already exist."
  	echo "please chose another username."
	exit $E_USEREXISTS
	fi  
	adduser  "$username"
        echo "hadoop" | passwd  "$username"  --stdin
        
	echo "the account is setup"
exit 0

#in java ./addUserExam.sh chandan redhat123