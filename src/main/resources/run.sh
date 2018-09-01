rm ./ipconfig
echo "Selected Env:"
echo $1
if [ "$1" == "COMMERCIAL" ]
then echo "http://google.com" >> ipconfig
echo "URL for ipconfig:"
cat ipconfig
elif [ "$1" == "INDIA" ]
then echo "http://google.in" >> ipconfig
echo "URL for ipconfig:"
cat ipconfig
elif [ "$1" == "YAHOO" ]
then echo "http://yahoo.com" >> ipconfig
echo "URL for ipconfig:"
cat ipconfig
else echo "Enter Valid environment like COMMERCIAL, INDIA, YAHOO"
fi
adb shell rm /sdcard/company_data/ipconfig
adb push ./ipconfig /sdcard/company_data
