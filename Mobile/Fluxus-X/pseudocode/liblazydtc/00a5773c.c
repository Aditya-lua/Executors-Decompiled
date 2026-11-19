/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5773c
 */

void EVP_MD_CTX_new(void)

{
  CRYPTO_zalloc(0x48,"crypto/evp/digest.c",0x84);
  return;
}

