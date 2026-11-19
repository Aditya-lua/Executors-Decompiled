/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a29c74
 */

void ossl_ec_GF2m_simple_group_clear_finish(long param_1)

{
  BN_clear_free(*(BIGNUM **)(param_1 + 0x40));
  BN_clear_free(*(BIGNUM **)(param_1 + 0x60));
  BN_clear_free(*(BIGNUM **)(param_1 + 0x68));
  *(undefined8 *)(param_1 + 0x48) = 0;
  *(undefined8 *)(param_1 + 0x50) = 0;
  *(undefined8 *)(param_1 + 0x58) = 0xffffffff00000000;
  return;
}

