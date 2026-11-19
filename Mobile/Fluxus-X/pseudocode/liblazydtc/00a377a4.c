/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a377a4
 */

void ossl_ec_GFp_mont_group_init(long param_1)

{
  ossl_ec_GFp_simple_group_init();
  *(undefined8 *)(param_1 + 0x78) = 0;
  *(undefined8 *)(param_1 + 0x80) = 0;
  return;
}

