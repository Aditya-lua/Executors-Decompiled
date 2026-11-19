/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a74864
 */

void EVP_PKEY_CTX_set_cb(EVP_PKEY_CTX *ctx,undefined1 *cb)

{
  *(undefined1 **)(ctx + 0x60) = cb;
  return;
}

