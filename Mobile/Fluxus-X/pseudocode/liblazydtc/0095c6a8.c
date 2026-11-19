/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0095c6a8
 */

undefined8 FUN_0095c6a8(char *param_1)

{
  char cVar1;
  
  if (param_1 == (char *)0x0) {
    return 1;
  }
  do {
    cVar1 = *param_1;
    if (cVar1 == '\0') {
      return 1;
    }
    param_1 = param_1 + 1;
  } while (-1 < cVar1);
  return 0;
}

