/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a32254
 */

int ossl_ec_group_simple_order_bits(long param_1)

{
  int iVar1;
  
  if (*(BIGNUM **)(param_1 + 0x10) == (BIGNUM *)0x0) {
    return 0;
  }
  iVar1 = BN_num_bits(*(BIGNUM **)(param_1 + 0x10));
  return iVar1;
}

