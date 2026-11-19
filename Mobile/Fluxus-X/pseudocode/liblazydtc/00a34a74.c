/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a34a74
 */

bool ossl_ec_wNAF_have_precompute_mult(long param_1)

{
  bool bVar1;
  
  bVar1 = false;
  if (*(int *)(param_1 + 0x98) == 5) {
    bVar1 = *(long *)(param_1 + 0xa0) != 0;
  }
  return bVar1;
}

