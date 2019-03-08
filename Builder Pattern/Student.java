package com.p3arl.java.examples;

/**
 * 
 * @author p3arl
 * A less verbose builder pattern example
 */
public class Student {
	private int id;
	private String name;
	private String hobby;

	private Student() {
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getHobby() {
		return hobby;
	}

	@Override
	public String toString() {
		StringBuilder builder2 = new StringBuilder();
		builder2.append("Student [id=").append(id).append(", name=").append(name).append(", hobby=").append(hobby)
				.append("]");
		return builder2.toString();
	}

	static class Builder {
		private Student student;

		Builder() {
			this.student = new Student();
		}

		Builder id(int id) {
			this.student.id = id;
			return this;
		}

		Builder name(String name) {
			this.student.name = name;
			return this;
		}

		Builder hobby(String hobby) {
			this.student.hobby = hobby;
			return this;
		}

		Student build() {
			return this.student;
		}
	}
}

class TestStudentBuilder {
	public static void main(String[] args) {
		Student st = new Student.Builder().id(1).name("Praveen").hobby("Coding").build();
		System.out.println(st);
	}
}
