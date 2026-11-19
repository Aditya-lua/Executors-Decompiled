/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2abd8
 */

void ossl_ec_GF2m_simple_field_sqr(long param_1,undefined8 param_2,undefined8 param_3)

{
  BN_GF2m_mod_sqr_arr(param_2,param_3,param_1 + 0x48);
  return;
}

