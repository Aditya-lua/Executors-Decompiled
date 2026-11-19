/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a7486c
 */

undefined1 * EVP_PKEY_CTX_get_cb(EVP_PKEY_CTX *ctx)

{
  return *(undefined1 **)(ctx + 0x60);
}

