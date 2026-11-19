/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6f360
 */

bool EVP_PKEY_get_params(int *param_1,undefined8 param_2)

{
  int iVar1;
  
  if (param_1 == (int *)0x0) {
LAB_00a6f3a8:
    ERR_new();
    ERR_set_debug("crypto/evp/p_lib.c",0x961,"EVP_PKEY_get_params");
    ERR_set_error(6,0xa3,0);
    return false;
  }
  if (*(long *)(param_1 + 0x18) == 0) {
    if (*param_1 == 0) goto LAB_00a6f3a8;
    iVar1 = evp_pkey_get_params_to_ctrl(param_1,param_2);
  }
  else {
    iVar1 = evp_keymgmt_get_params(*(long *)(param_1 + 0x18),*(undefined8 *)(param_1 + 0x1a));
  }
  return 0 < iVar1;
}

