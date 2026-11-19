/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5a5fc
 */

void EVP_CIPHER_CTX_free(EVP_CIPHER_CTX *a)

{
  if (a == (EVP_CIPHER_CTX *)0x0) {
    return;
  }
  EVP_CIPHER_CTX_reset();
  CRYPTO_free(a);
  return;
}

