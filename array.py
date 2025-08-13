marks=[0]*100      # This code initializes an array to store marks for three students,
# but it actually allocates space for 100 students.
marks[0]=int(input("Enter marks for student 1: "))
marks[1]=int(input("Enter marks for student 2: "))
marks[2]=int(input("Enter marks for student 3: "))

print(marks[0], "student 1 marks")
print(marks[1], "student 2 marks")
print(marks[2], "student 3 marks")


percentage=(marks[0]+marks[1]+marks[2])/3
print("Percentage of marks is", percentage)