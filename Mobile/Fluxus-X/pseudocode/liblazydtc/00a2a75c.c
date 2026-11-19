/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2a75c
 */

void ossl_ec_GF2m_simple_is_at_infinity(undefined8 param_1,long param_2)

{
  BN_is_zero(*(undefined8 *)(param_2 + 0x20));
  return;
}

