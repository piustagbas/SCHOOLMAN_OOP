package Enum;

public enum Role {
        PRINCIPAL("Principal"),
        TEACHER("Teacher"),
        NON_ACADEMIC_STAFF("Non-Academic Staff"),
        STUDENT("Student"),
        COURSES("Courses"),
        CLASSES("Classes"),
        APPLICANTS("Applicants");

        private final String displayName;

        Role(String displayName) {
            this.displayName = displayName;
        }

        public String getDisplayName() {
            return displayName;
        }
    }

