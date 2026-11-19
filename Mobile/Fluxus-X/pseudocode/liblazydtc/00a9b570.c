/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9b570
 */

long OPENSSL_strnlen(char *param_1,long param_2)

{
  char *pcVar1;
  
  pcVar1 = param_1;
  if (param_2 != 0) {
    do {
      if (*pcVar1 == '\0') break;
      param_2 = param_2 + -1;
      pcVar1 = pcVar1 + 1;
    } while (param_2 != 0);
  }
  return (long)pcVar1 - (long)param_1;
}

