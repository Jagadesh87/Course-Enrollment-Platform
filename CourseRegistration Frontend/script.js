function showCourses(){
    fetch("http://localhost:8080/Courses") //API End point
    .then((response) => response.json())
    .then((courses) => {
        const dataTable = document.getElementById("coursetable")

        courses.forEach(course => {
            var row = `<tr>
            <td>${course.courseid}</td>
            <td>${course.courseName}</td>
            <td>${course.trainer}</td>
            <td>${course.durationInweeks}</td>
            </tr>`

            dataTable.innerHTML+=row;
        });
    });
}

function showEnrolledStudents(){
    fetch("http://localhost:8080/Courses/enrolled") //API End point
    .then((response) => response.json()) //Http response into json object
    .then((students) => {
        const dataTable = document.getElementById("enrolledtable")

        students.forEach(student => {
            var row = `<tr>
            <td>${student.username}</td>
            <td>${student.emailid}</td>
            <td>${student.coursename}</td>
            </tr>`

            dataTable.innerHTML+=row;
        });
    });
}