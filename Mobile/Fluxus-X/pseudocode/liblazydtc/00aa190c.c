/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa190c
 */

undefined8 OSSL_PROVIDER_add_builtin(undefined8 param_1,char *param_2,long param_3)

{
  undefined4 uVar1;
  int iVar2;
  char *local_48;
  undefined8 local_40;
  long lStack_38;
  undefined8 uStack_30;
  undefined8 uStack_28;
  
  if ((param_2 == (char *)0x0) || (param_3 == 0)) {
    ERR_new();
    ERR_set_debug("crypto/provider.c",0x79,"OSSL_PROVIDER_add_builtin");
    uVar1 = 0xc0102;
  }
  else {
    lStack_38 = 0;
    local_40 = 0;
    uStack_28 = 0;
    uStack_30 = 0;
    local_48 = CRYPTO_strdup(param_2,"crypto/provider.c",0x7d);
    if (local_48 != (char *)0x0) {
      lStack_38 = param_3;
      iVar2 = ossl_provider_info_add_to_store(param_1,&local_48);
      if (iVar2 == 0) {
        ossl_provider_info_clear(&local_48);
        return 0;
      }
      return 1;
    }
    ERR_new();
    ERR_set_debug("crypto/provider.c",0x7f,"OSSL_PROVIDER_add_builtin");
    uVar1 = 0xc0100;
  }
  ERR_set_error(0xf,uVar1,0);
  return 0;
}

