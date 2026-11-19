/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa2f50
 */

long FUN_00aa2f50(char *param_1,undefined8 param_2,undefined8 param_3)

{
  long lVar1;
  long lVar2;
  char *pcVar3;
  
  lVar1 = CRYPTO_zalloc(0xe0,"crypto/provider_core.c",0x1cb);
  if (lVar1 == 0) {
    CRYPTO_free((void *)0x0);
    ERR_new();
    ERR_set_debug("crypto/provider_core.c",0x1d1,"provider_new");
    ERR_set_error(0xf,0xc0100,0);
  }
  else {
    *(undefined4 *)(lVar1 + 0x10) = 1;
    lVar2 = CRYPTO_THREAD_lock_new();
    *(long *)(lVar1 + 0xb8) = lVar2;
    if (lVar2 != 0) {
      lVar2 = CRYPTO_THREAD_lock_new();
      *(long *)(lVar1 + 8) = lVar2;
      if (lVar2 != 0) {
        pcVar3 = CRYPTO_strdup(param_1,"crypto/provider_core.c",0x1d9);
        *(char **)(lVar1 + 0x28) = pcVar3;
        if (pcVar3 != (char *)0x0) {
          lVar2 = OPENSSL_sk_deep_copy(param_3,FUN_00aa48fc,FUN_00aa27d0);
          *(long *)(lVar1 + 0x48) = lVar2;
          if (lVar2 != 0) {
            *(undefined8 *)(lVar1 + 0x40) = param_2;
            return lVar1;
          }
        }
      }
    }
    ossl_provider_free(lVar1);
    ERR_new();
    ERR_set_debug("crypto/provider_core.c",0x1de,"provider_new");
    ERR_set_error(0xf,0xc0100,0);
  }
  return 0;
}

