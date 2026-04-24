import { useState, useEffect } from "react";
import "./App.css";

function App() {
  const [courses, setCourses] = useState([]);

  useEffect(() => {
    fetch("http://localhost:8080/api/courses")
      .then((res) => res.json())
      .then((data) => setCourses(data));
  }, []);
  return (
    <div>
      {courses.map((course) => (
        <h1 key={course.id}>{course.title}</h1>
      ))}
    </div>
  );
}

export default App;
