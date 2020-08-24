public class withoutX2 {

  public String withoutX2(String str) {
    int len = str.length();

    if (len == 1 && str.charAt(0) == 'x') {
      return "";
    }
    if (len < 2) {
      return str;
    }
    if (str.charAt(0) == 'x' && str.charAt(1) != 'x') {
      return str.substring(1, len);
    } else if (str.charAt(0) != 'x' && str.charAt(1) == 'x') {
      return str.substring(0, 1) + str.substring(2, len);
    } else if (str.charAt(0) == 'x' && str.charAt(1) == 'x') {
      return str.substring(2, len);
    } else {
      return str;
    }
  }

  // more concise
// int len = str.length();
// String result = "";

// if (len > 0 && str.charAt(0) != 'x') {
//   result += str.charAt(0);
// }
// if (len > 1 && str.charAt(1) != 'x') {
//   result += str.charAt(1);
// }
// if (len > 2) {
//   result += str.substring(2);
// }
// return result;
// }


}
