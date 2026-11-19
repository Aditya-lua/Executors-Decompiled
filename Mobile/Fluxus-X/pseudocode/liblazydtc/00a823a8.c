/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a823a8
 */

bool ossl_namemap_empty(long param_1)

{
  if (param_1 == 0) {
    return true;
  }
  return *(int *)(param_1 + 0x18) == 0;
}

