/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a29f0c
 */

int ossl_ec_GF2m_simple_group_get_degree(long param_1)

{
  int iVar1;
  
  iVar1 = BN_num_bits(*(BIGNUM **)(param_1 + 0x40));
  return iVar1 + -1;
}

