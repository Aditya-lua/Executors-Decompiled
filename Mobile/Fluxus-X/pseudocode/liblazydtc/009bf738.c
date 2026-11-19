/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bf738
 */

char * SSL_alert_type_string_long(int value)

{
  char *pcVar1;
  char *pcVar2;
  
  pcVar1 = "fatal";
  if (value >> 8 != 2) {
    pcVar1 = "unknown";
  }
  pcVar2 = "warning";
  if (value >> 8 != 1) {
    pcVar2 = pcVar1;
  }
  return pcVar2;
}

