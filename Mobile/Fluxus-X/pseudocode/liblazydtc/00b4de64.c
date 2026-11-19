/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b4de64
 */

void ossl_dsa_check_params(long param_1,int param_2,undefined8 param_3)

{
  int iVar1;
  
  iVar1 = FUN_00b4ded4(param_1,param_3);
  if (iVar1 == 0) {
    return;
  }
  if (param_2 == 1) {
    ossl_ffc_params_simple_validate();
    return;
  }
  ossl_ffc_params_full_validate(*(undefined8 *)(param_1 + 0xb8),param_1 + 8,0,param_3);
  return;
}

