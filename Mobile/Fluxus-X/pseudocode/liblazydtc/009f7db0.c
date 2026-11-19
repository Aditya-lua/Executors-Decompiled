/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f7db0
 */

undefined4 ossl_asn1_get_choice_selector_const(long *param_1,long param_2)

{
  return *(undefined4 *)(*param_1 + *(long *)(param_2 + 8));
}

