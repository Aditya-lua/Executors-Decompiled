/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa3e00
 */

ulong FUN_00aa3e00(long param_1)

{
  byte bVar1;
  int iVar2;
  int iVar3;
  int iVar4;
  int iVar5;
  long lVar6;
  ulong uVar7;
  
  lVar6 = ossl_lib_ctx_get_data(*(undefined8 *)(param_1 + 0x50),1,&DAT_00c6d4c8);
  if (lVar6 == 0) {
    ERR_new();
    ERR_set_debug("crypto/provider_core.c",0x156,"get_provider_store");
    ERR_set_error(0xf,0xc0103,0);
    uVar7 = 0;
  }
  else {
    uVar7 = CRYPTO_THREAD_read_lock(*(undefined8 *)(lVar6 + 0x20));
    if ((int)uVar7 != 0) {
      bVar1 = *(byte *)(lVar6 + 0x48);
      CRYPTO_THREAD_unlock(*(undefined8 *)(lVar6 + 0x20));
      if ((bVar1 >> 1 & 1) == 0) {
        uVar7 = CRYPTO_THREAD_write_lock(*(undefined8 *)(param_1 + 0xb8));
        if ((int)uVar7 != 0) {
          CRYPTO_free(*(void **)(param_1 + 0xa8));
          *(undefined8 *)(param_1 + 0xa8) = 0;
          *(undefined8 *)(param_1 + 0xb0) = 0;
          CRYPTO_THREAD_unlock(*(undefined8 *)(param_1 + 0xb8));
          iVar2 = evp_method_store_remove_all_provided(param_1);
          iVar3 = ossl_encoder_store_remove_all_provided(param_1);
          iVar4 = ossl_decoder_store_remove_all_provided(param_1);
          iVar5 = ossl_store_loader_store_remove_all_provided(param_1);
          uVar7 = (ulong)(iVar3 + iVar2 + iVar4 + iVar5 == 4);
        }
      }
      else {
        uVar7 = 1;
      }
    }
  }
  return uVar7;
}

