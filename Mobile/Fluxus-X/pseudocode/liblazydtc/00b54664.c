/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b54664
 */

undefined8 * FUN_00b54664(undefined8 *param_1)

{
  int iVar1;
  undefined8 *__dest;
  HMAC_CTX *dctx;
  void *__dest_00;
  long lVar2;
  undefined8 uVar3;
  undefined8 *puVar4;
  
  iVar1 = ossl_prov_is_running();
  if (iVar1 != 0) {
    uVar3 = *param_1;
    iVar1 = ossl_prov_is_running();
    if (iVar1 != 0) {
      __dest = (undefined8 *)CRYPTO_zalloc(0xa0,"providers/implementations/macs/hmac_prov.c",0x50);
      if (__dest != (undefined8 *)0x0) {
        dctx = (HMAC_CTX *)HMAC_CTX_new();
        __dest[1] = dctx;
        if (dctx != (HMAC_CTX *)0x0) {
          *__dest = uVar3;
          memcpy(__dest,param_1,0xa0);
          puVar4 = __dest + 2;
          *puVar4 = 0;
          __dest[1] = dctx;
          __dest[4] = 0;
          __dest[5] = 0;
          __dest[3] = 0;
          iVar1 = HMAC_CTX_copy(dctx,(HMAC_CTX *)param_1[1]);
          if ((iVar1 != 0) && (iVar1 = ossl_prov_digest_copy(puVar4,param_1 + 2), iVar1 != 0)) {
            if (param_1[5] == 0) {
              return __dest;
            }
            lVar2 = param_1[6];
            if (lVar2 == 0) {
              lVar2 = 1;
            }
            __dest_00 = (void *)CRYPTO_secure_malloc
                                          (lVar2,"providers/implementations/macs/hmac_prov.c",0x7f);
            __dest[5] = __dest_00;
            if (__dest_00 != (void *)0x0) {
              memcpy(__dest_00,(void *)param_1[5],param_1[6]);
              return __dest;
            }
          }
          HMAC_CTX_free(__dest[1]);
          ossl_prov_digest_reset(puVar4);
          CRYPTO_secure_clear_free
                    (__dest[5],__dest[6],"providers/implementations/macs/hmac_prov.c",0x61);
        }
      }
      CRYPTO_free(__dest);
    }
  }
  return (undefined8 *)0x0;
}

