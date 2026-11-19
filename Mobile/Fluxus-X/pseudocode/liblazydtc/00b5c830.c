/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b5c830
 */

bool FUN_00b5c830(undefined8 *param_1,DSA *param_2,undefined8 param_3,int param_4)

{
  int iVar1;
  undefined8 uVar2;
  
  iVar1 = ossl_prov_is_running();
  if (param_1 == (undefined8 *)0x0) {
    return false;
  }
  if (iVar1 == 0) {
    return false;
  }
  if (param_2 == (DSA *)0x0) {
    if (param_1[2] == 0) {
      ERR_new(0);
      ERR_set_debug("providers/implementations/signature/dsa_sig.c",0xc4,"dsa_signverify_init");
      uVar2 = 0x72;
      goto LAB_00b5c90c;
    }
  }
  else {
    iVar1 = ossl_dsa_check_key(*param_1,param_2,param_4 == 0x10);
    if (iVar1 == 0) {
      ERR_new();
      ERR_set_debug("providers/implementations/signature/dsa_sig.c",0xcb,"dsa_signverify_init");
      uVar2 = 0x69;
LAB_00b5c90c:
      ERR_set_error(0x39,uVar2,0);
      return false;
    }
    iVar1 = DSA_up_ref(param_2);
    if (iVar1 == 0) {
      return false;
    }
    DSA_free((DSA *)param_1[2]);
    param_1[2] = param_2;
  }
  *(int *)(param_1 + 0x2e) = param_4;
  iVar1 = FUN_00b5c6e8(param_1,param_3);
  return iVar1 != 0;
}

