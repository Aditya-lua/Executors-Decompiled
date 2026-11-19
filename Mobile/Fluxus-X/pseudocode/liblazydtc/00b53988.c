/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b53988
 */

EVP_CIPHER_CTX * CMAC_CTX_get0_cipher_ctx(CMAC_CTX *ctx)

{
  return *(EVP_CIPHER_CTX **)ctx;
}

