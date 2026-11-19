/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9dfd4
 */

bool OSSL_PARAM_modified(long param_1)

{
  bool bVar1;
  
  bVar1 = false;
  if (param_1 != 0) {
    bVar1 = *(long *)(param_1 + 0x20) != -1;
  }
  return bVar1;
}

