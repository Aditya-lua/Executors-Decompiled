/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f80fc
 */

long ossl_asn1_get_const_field_ptr(long *param_1,long param_2)

{
  return *param_1 + *(long *)(param_2 + 0x10);
}

