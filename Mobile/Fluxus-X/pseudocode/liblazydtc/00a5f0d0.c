/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5f0d0
 */

EVP_CIPHER * EVP_CIPHER_CTX_cipher(EVP_CIPHER_CTX *ctx)

{
  EVP_CIPHER *pEVar1;
  
  pEVar1 = (EVP_CIPHER *)0x0;
  if (ctx != (EVP_CIPHER_CTX *)0x0) {
    pEVar1 = ctx->cipher;
  }
  return pEVar1;
}

