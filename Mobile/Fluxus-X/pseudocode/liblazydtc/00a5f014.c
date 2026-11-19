/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5f014
 */

undefined4 EVP_CIPHER_impl_ctx_size(long param_1)

{
  return *(undefined4 *)(param_1 + 0x38);
}

