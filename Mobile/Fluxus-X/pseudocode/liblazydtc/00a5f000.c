/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5f000
 */

undefined4 EVP_CIPHER_get_block_size(long param_1)

{
  return *(undefined4 *)(param_1 + 4);
}

