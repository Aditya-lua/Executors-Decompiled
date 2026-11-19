/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b5d42c
 */

ulong FUN_00b5d42c(undefined8 *param_1,EC_KEY *param_2,undefined8 param_3,int param_4)

{
  int iVar1;
  ulong uVar2;
  
  iVar1 = ossl_prov_is_running();
  if (param_1 == (undefined8 *)0x0) {
    return 0;
  }
  if (iVar1 == 0) {
    return 0;
  }
  if (param_2 == (EC_KEY *)0x0) {
    if (param_1[2] == 0) {
      ERR_new(0);
      ERR_set_debug("providers/implementations/signature/ecdsa_sig.c",0x8a,"ecdsa_signverify_init");
      ERR_set_error(0x39,0x72,0);
      return 0;
    }
  }
  else {
    uVar2 = ossl_ec_check_key(*param_1,param_2,param_4 == 0x10);
    if ((int)uVar2 == 0) {
      return uVar2;
    }
    iVar1 = EC_KEY_up_ref(param_2);
    if (iVar1 == 0) {
      return 0;
    }
    EC_KEY_free((EC_KEY *)param_1[2]);
    param_1[2] = param_2;
  }
  *(int *)(param_1 + 0x2d) = param_4;
  iVar1 = FUN_00b5d2a0(param_1,param_3);
  return (ulong)(iVar1 != 0);
}

