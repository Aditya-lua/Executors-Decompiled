/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b54bac
 */

int FUN_00b54bac(long param_1,void *param_2,size_t param_3)

{
  size_t sVar1;
  int iVar2;
  void *__dest;
  EVP_MD *md;
  ENGINE *impl;
  HMAC_CTX *ctx;
  
  if (*(long *)(param_1 + 0x28) != 0) {
    CRYPTO_secure_clear_free
              (*(long *)(param_1 + 0x28),*(undefined8 *)(param_1 + 0x30),
               "providers/implementations/macs/hmac_prov.c",0x9d);
  }
  sVar1 = param_3;
  if (param_3 == 0) {
    sVar1 = 1;
  }
  __dest = (void *)CRYPTO_secure_malloc(sVar1,"providers/implementations/macs/hmac_prov.c",0x9f);
  *(void **)(param_1 + 0x28) = __dest;
  iVar2 = 0;
  if (__dest != (void *)0x0) {
    memcpy(__dest,param_2,param_3);
    *(size_t *)(param_1 + 0x30) = param_3;
    md = (EVP_MD *)ossl_prov_digest_md(param_1 + 0x10);
    if ((param_2 != (void *)0x0) ||
       ((iVar2 = 1, md != (EVP_MD *)0x0 && (*(long *)(param_1 + 0x38) == 0)))) {
      ctx = *(HMAC_CTX **)(param_1 + 8);
      impl = (ENGINE *)ossl_prov_digest_engine(param_1 + 0x10);
      iVar2 = HMAC_Init_ex(ctx,param_2,(int)param_3,md,impl);
      return iVar2;
    }
  }
  return iVar2;
}

