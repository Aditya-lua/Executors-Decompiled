/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a20ba4
 */

int DSA_bits(long param_1)

{
  int iVar1;
  
  if (*(BIGNUM **)(param_1 + 8) == (BIGNUM *)0x0) {
    return -1;
  }
  iVar1 = BN_num_bits(*(BIGNUM **)(param_1 + 8));
  return iVar1;
}

