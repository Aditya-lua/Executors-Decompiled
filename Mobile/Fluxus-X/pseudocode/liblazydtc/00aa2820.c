/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa2820
 */

undefined8 ossl_provider_disable_fallback_loading(undefined8 param_1)

{
  long lVar1;
  undefined8 uVar2;
  
  lVar1 = ossl_lib_ctx_get_data(param_1,1,&DAT_00c6d4c8);
  if (lVar1 == 0) {
    ERR_new();
    ERR_set_debug("crypto/provider_core.c",0x156,"get_provider_store");
    ERR_set_error(0xf,0xc0103,0);
    uVar2 = 0;
  }
  else {
    uVar2 = CRYPTO_THREAD_write_lock(*(undefined8 *)(lVar1 + 0x20));
    if ((int)uVar2 != 0) {
      *(byte *)(lVar1 + 0x48) = *(byte *)(lVar1 + 0x48) & 0xfe;
      CRYPTO_THREAD_unlock(*(undefined8 *)(lVar1 + 0x20));
      uVar2 = 1;
    }
  }
  return uVar2;
}

