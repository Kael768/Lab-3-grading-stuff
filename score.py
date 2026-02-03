result = 0
count = float(input("count: "))
number = float(input("Exam Score: "))
def calculate_average(number, count):
    while True:
        if number == 0 and count == 0:
            print ("No scores were entered")
            number = float(input("Exam Score: "))
            count = float(input("count: "))
        elif number == -1 or count == -1:
            break
        else: 
            print(f"number/count = {number/count}")
            number = float(input("Exam Score: "))
            count = float(input("count: "))
calculate_average(number, count)

#use while true until user type -1 then break
# inside the while loop, ask user to input score