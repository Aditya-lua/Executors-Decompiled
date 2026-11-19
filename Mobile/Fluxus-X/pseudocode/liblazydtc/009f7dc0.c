/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f7dc0
 */

undefined4 ossl_asn1_set_choice_selector(long *param_1,undefined4 param_2,long param_3)

{
  undefined4 uVar1;
  
  uVar1 = *(undefined4 *)(*param_1 + *(long *)(param_3 + 8));
  *(undefined4 *)(*param_1 + *(long *)(param_3 + 8)) = param_2;
  return uVar1;
}

