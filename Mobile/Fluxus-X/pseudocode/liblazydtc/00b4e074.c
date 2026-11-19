/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b4e074
 */

void ossl_dsa_check_priv_key(long param_1,undefined8 param_2,undefined4 *param_3)

{
  int iVar1;
  
  *param_3 = 0;
  iVar1 = FUN_00b4ded4(param_1,param_3);
  if (iVar1 == 0) {
    return;
  }
  ossl_ffc_validate_private_key(*(undefined8 *)(param_1 + 0x10),param_2,param_3);
  return;
}

