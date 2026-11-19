/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b585fc
 */

ulong ossl_drbg_get_seed(long param_1,long *param_2,int param_3,ulong param_4,ulong param_5,
                        undefined4 param_6)

{
  uint uVar1;
  int iVar2;
  long lVar3;
  undefined8 uVar4;
  ulong uVar5;
  long local_38;
  
  if (param_3 < 0) {
    uVar5 = 0;
  }
  else {
    uVar1 = param_3 + 0xe;
    if (-1 < (int)(param_3 + 7U)) {
      uVar1 = param_3 + 7U;
    }
    uVar5 = (long)((ulong)uVar1 << 0x20) >> 0x23;
  }
  if (param_4 <= uVar5) {
    param_4 = uVar5;
  }
  if (param_4 <= param_5) {
    param_5 = param_4;
  }
  local_38 = param_1;
  lVar3 = CRYPTO_secure_malloc(param_5,"providers/implementations/rands/drbg.c",0xa1);
  if (lVar3 == 0) {
    ERR_new();
    ERR_set_debug("providers/implementations/rands/drbg.c",0xa3,"ossl_drbg_get_seed");
    uVar4 = 0xc0100;
  }
  else {
    iVar2 = ossl_prov_drbg_generate
                      (param_1,lVar3,param_5,*(undefined4 *)(param_1 + 0x80),param_6,&local_38,8);
    if (iVar2 != 0) {
      *param_2 = lVar3;
      return param_5;
    }
    CRYPTO_secure_clear_free(lVar3,param_5,"providers/implementations/rands/drbg.c",0xb3);
    ERR_new();
    ERR_set_debug("providers/implementations/rands/drbg.c",0xb4,"ossl_drbg_get_seed");
    uVar4 = 0xbf;
  }
  ERR_set_error(0x39,uVar4,0);
  return 0;
}

