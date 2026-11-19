/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac2320
 */

size_t FUN_00ac2320(undefined8 param_1,char *param_2)

{
  size_t sVar1;
  
  if (param_2 == (char *)0x0) {
    return 0;
  }
  sVar1 = strlen(param_2);
  return sVar1;
}

