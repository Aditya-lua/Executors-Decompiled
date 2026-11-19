/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa35fc
 */

ulong ossl_provider_activate(long param_1,undefined4 param_2,int param_3)

{
  byte bVar1;
  int iVar2;
  int iVar3;
  int iVar4;
  int iVar5;
  long lVar6;
  ulong uVar7;
  
  if (param_1 == 0) {
    return 0;
  }
  if ((param_3 == 0) || ((*(byte *)(param_1 + 200) & 1) != 0)) {
    iVar2 = FUN_00aa3714(param_1,1,param_2);
    if (iVar2 < 1) {
      return 0;
    }
    if (iVar2 == 1) {
      lVar6 = ossl_lib_ctx_get_data(*(undefined8 *)(param_1 + 0x50),1,&DAT_00c6d4c8);
      if (lVar6 == 0) {
        ERR_new();
        ERR_set_debug("crypto/provider_core.c",0x156,"get_provider_store");
        ERR_set_error(0xf,0xc0103,0);
        return 0;
      }
      uVar7 = CRYPTO_THREAD_read_lock(*(undefined8 *)(lVar6 + 0x20));
      if ((int)uVar7 == 0) {
        return uVar7;
      }
      bVar1 = *(byte *)(lVar6 + 0x48);
      CRYPTO_THREAD_unlock(*(undefined8 *)(lVar6 + 0x20));
      if ((bVar1 >> 1 & 1) == 0) {
        iVar2 = evp_method_store_cache_flush(*(undefined8 *)(param_1 + 0x50));
        iVar3 = ossl_encoder_store_cache_flush(*(undefined8 *)(param_1 + 0x50));
        iVar4 = ossl_decoder_store_cache_flush(*(undefined8 *)(param_1 + 0x50));
        iVar5 = ossl_store_loader_store_cache_flush(*(undefined8 *)(param_1 + 0x50));
        return (ulong)(iVar3 + iVar2 + iVar4 + iVar5 == 4);
      }
    }
  }
  return 1;
}

