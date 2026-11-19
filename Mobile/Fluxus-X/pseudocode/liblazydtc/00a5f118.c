/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5f118
 */

undefined4 EVP_CIPHER_CTX_is_encrypting(long param_1)

{
  return *(undefined4 *)(param_1 + 0x10);
}

