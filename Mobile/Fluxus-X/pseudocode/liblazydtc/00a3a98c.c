/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a3a98c
 */

void ossl_ec_GFp_simple_is_at_infinity(undefined8 param_1,long param_2)

{
  BN_is_zero(*(undefined8 *)(param_2 + 0x20));
  return;
}

