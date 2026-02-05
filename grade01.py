


def exam1Final(exam1Grade, exam1Weight):
        return exam1Grade * exam1Weight / 100

def exam2Final(exam2Grade, exam2Weight):
        return exam2Grade * exam2Weight / 100

def homeworkFinal(homeworkGrade, homeworkWeight, totalAssignments, lateAssignments):
        return homeworkWeight * (homeworkGrade * totalAssignments + (totalAssignments - lateAssignments) * 4) / (totalAssignments * 100)
'''
def annoyingPeople_rules(homeworkGrade):
    while True:
        if homeworkGrade > 100:
            print("Please don't be a jerk and enter a valid grade than is less than 100 please... ")
            Grade = float(input("Please enter your grade, 100 is the max can't do more: "))
        elif homeworkGrade < 0:
            print("now lesser than 0? really? fine then... ")
            Grade = float(input("Please enter your grade 100 is the max, AND 0 IS THE MIN can't do more!!!: "))
        else:
            break
    return Grade/10 
'''
def addeditionalRules(lateAssignments, totalAssignments, homeworkOutput):
    #no late attendance = + 5
    #50 percent late = -10%
    if lateAssignments == 0:
        return homeworkOutput + 5
    elif lateAssignments >= totalAssignments / 2:
        return homeworkOutput*(10/100)
    return homeworkOutput


def main():
    exam1Weight = float(input("Please enter the weight for exam 1: "))
    exam2Weight = float(input("Please enter the weight for exam 2: "))
    homeworkWeight = float(input("Please enter the weight for homework and assignments: "))
    totalAssignments = int(input("Please enter the total number of assignments/homework and labs: "))

    homeworkGrade = float(input("Please enter your homework grade 100 is the max can't do more: "))
    lateAssignments = int(input("Please enter the number of no late assignments: "))

    exam1Grade = float(input("Please enter your exam 1 grade 100 is the max can't do more: "))
    exam2Grade = float(input("Please enter your exam 2 grade 100 is the max can't do more: "))
    exam1Output = exam1Final(exam1Grade, exam1Weight)
    exam2Output = exam2Final(exam2Grade, exam2Weight)
    #annoyingPeople_rules(homeworkGrade)
    homeworkOutput = homeworkFinal(homeworkGrade, homeworkWeight, totalAssignments, lateAssignments)
    addeditionalRules(lateAssignments, totalAssignments, homeworkOutput)
    finalGrade = exam1Output + exam2Output + homeworkOutput
    if finalGrade > 100:
         finalGrade = 100
    print(f"Your final output is {finalGrade}")
    


main()
#exam 1 = 20%
#exam 2 = 30%
#assignment and homework = 50%
#user input is asked for total labs and assignments.
#if half the assignments are late, deduct 10% from the homework grade.\
#if there are no late assignments, add 5 points to the homework grade.
#I gave out most of it
# too much rules