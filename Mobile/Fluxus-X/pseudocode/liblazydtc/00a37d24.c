/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a37d24
 */

void ossl_ec_GFp_nist_group_copy(long param_1,long param_2)

{
  *(undefined8 *)(param_1 + 0x88) = *(undefined8 *)(param_2 + 0x88);
  ossl_ec_GFp_simple_group_copy();
  return;
}

