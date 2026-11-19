/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b53890
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

CMAC_CTX * CMAC_CTX_new(void)

{
  CMAC_CTX *ptr;
  EVP_CIPHER_CTX *pEVar1;
  
  ptr = CRYPTO_malloc(0x90,"crypto/cmac/cmac.c",0x38);
  if (ptr == (CMAC_CTX *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/cmac/cmac.c",0x39,"CMAC_CTX_new");
    ERR_set_error(0xf,0xc0100,0);
  }
  else {
    pEVar1 = EVP_CIPHER_CTX_new();
    *(EVP_CIPHER_CTX **)ptr = pEVar1;
    if (pEVar1 == (EVP_CIPHER_CTX *)0x0) {
      CRYPTO_free(ptr);
      ptr = (CMAC_CTX *)0x0;
    }
    else {
      *(undefined4 *)(ptr + 0x88) = 0xffffffff;
    }
  }
  return ptr;
}

