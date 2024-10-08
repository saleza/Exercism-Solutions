class SqueakyClean {
    static String clean(String identifier) {
        String newIdentifier = identifier.replace(" ", "_");
        String[] arrayIdentifier = newIdentifier.split("-");

        for (int i = 0; i < arrayIdentifier.length; i++) {

            String currentPart = arrayIdentifier[i]; // Prendre la sous-chaîne actuelle
            String newPart = ""; // Chaîne vide pour construire la nouvelle partie

            for (int j = 0; j < currentPart.length(); j++) {

                char currentChar = currentPart.charAt(j); // Obtenir le caractère actuel

                switch (currentChar) {
                    case '4':
                        newPart += 'a'; // Concaténer 'a' à newPart
                        break;
                    case '3':
                        newPart += 'e'; // Concaténer 'e' à newPart
                        break;
                    case '0':
                        newPart += 'o'; // Concaténer 'o' à newPart
                        break;
                    case '1':
                        newPart += 'l'; // Concaténer 'l' à newPart
                        break;
                    case '7':
                        newPart += 't'; // Concaténer 't' à newPart
                        break;
                    default:
                        newPart += currentChar; // Ajouter le caractère tel quel
                        break;
                }
            }
            arrayIdentifier[i] = newPart;
        }

        String result = arrayIdentifier[0];

        for (int i = 1; i < arrayIdentifier.length; i++) {
            result += arrayIdentifier[i].substring(0, 1).toUpperCase() + arrayIdentifier[i].substring(1);
        }

        result = result.replaceAll("[^a-zA-Z_]", "");

        return result;
    }
}