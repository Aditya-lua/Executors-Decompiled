/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aaee10
 */

long OBJ_length(long param_1)

{
  long lVar1;
  
  lVar1 = 0;
  if (param_1 != 0) {
    lVar1 = (long)*(int *)(param_1 + 0x14);
  }
  return lVar1;
}

