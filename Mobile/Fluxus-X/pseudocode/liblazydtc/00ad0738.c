/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad0738
 */

int RSA_bits(long param_1)

{
  int iVar1;
  
  iVar1 = BN_num_bits(*(BIGNUM **)(param_1 + 0x28));
  return iVar1;
}

