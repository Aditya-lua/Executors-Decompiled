/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a7f9f0
 */

long HMAC_CTX_new(void)

{
  int iVar1;
  long lVar2;
  
  lVar2 = CRYPTO_zalloc(0x20,"crypto/hmac/hmac.c",0x93);
  if ((lVar2 != 0) && (iVar1 = HMAC_CTX_reset(lVar2), iVar1 == 0)) {
    HMAC_CTX_free(lVar2);
    lVar2 = 0;
  }
  return lVar2;
}

