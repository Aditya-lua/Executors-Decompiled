/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5a5e8
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

EVP_CIPHER_CTX * EVP_CIPHER_CTX_new(void)

{
  EVP_CIPHER_CTX *pEVar1;
  
  pEVar1 = (EVP_CIPHER_CTX *)CRYPTO_zalloc(0xb8,"crypto/evp/evp_enc.c",0x47);
  return pEVar1;
}

