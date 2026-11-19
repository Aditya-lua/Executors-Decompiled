/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b67070
 */

undefined8
ossl_ccm_cipher(undefined8 param_1,undefined8 param_2,ulong *param_3,ulong param_4,
               undefined8 param_5,ulong param_6)

{
  int iVar1;
  undefined8 uVar2;
  
  uVar2 = ossl_prov_is_running();
  if ((int)uVar2 != 0) {
    if (param_4 < param_6) {
      ERR_new();
      ERR_set_debug("providers/implementations/ciphers/ciphercommon_ccm.c",0x139,"ossl_ccm_cipher");
      ERR_set_error(0x39,0x6a,0);
    }
    else {
      iVar1 = FUN_00b66d70(param_1,param_2,param_3,param_5,param_6);
      if (0 < iVar1) {
        *param_3 = param_6;
        return 1;
      }
    }
    uVar2 = 0;
  }
  return uVar2;
}

