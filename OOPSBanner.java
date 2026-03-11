public class OOPSBanner {

    // Inner class to store character pattern
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        CharacterPattern O = new CharacterPattern('O', new String[]{
                "*****",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*****"
        });

        CharacterPattern P = new CharacterPattern('P', new String[]{
                "*****",
                "*   *",
                "*   *",
                "*****",
                "*    ",
                "*    ",
                "*    "
        });

        CharacterPattern S = new CharacterPattern('S', new String[]{
                "*****",
                "*    ",
                "*    ",
                "*****",
                "    *",
                "    *",
                "*****"
        });

        String word = "OOPS";

        CharacterPattern[] patterns = {O, O, P, S};

        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();

            for (CharacterPattern cp : patterns) {
                line.append(cp.getPattern()[i]).append(" ");
            }

            System.out.println(line.toString());
        }
    }
}