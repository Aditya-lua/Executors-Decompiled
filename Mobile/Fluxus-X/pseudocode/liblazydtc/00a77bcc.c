/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a77bcc
 */

EVP_PKEY * EVP_PKEY_CTX_get0_pkey(EVP_PKEY_CTX *ctx)

{
  return *(EVP_PKEY **)(ctx + 0x88);
}

