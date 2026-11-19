/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a77bd4
 */

EVP_PKEY * EVP_PKEY_CTX_get0_peerkey(EVP_PKEY_CTX *ctx)

{
  return *(EVP_PKEY **)(ctx + 0x90);
}

