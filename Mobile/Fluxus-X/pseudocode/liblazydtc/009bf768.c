/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bf768
 */

char * SSL_alert_type_string(int value)

{
  char *pcVar1;
  char *pcVar2;
  
  pcVar1 = "F";
  if (value >> 8 != 2) {
    pcVar1 = "U";
  }
  pcVar2 = "W";
  if (value >> 8 != 1) {
    pcVar2 = pcVar1;
  }
  return pcVar2;
}

