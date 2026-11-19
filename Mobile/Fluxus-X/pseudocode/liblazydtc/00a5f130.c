/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5f130
 */

undefined8 EVP_CIPHER_CTX_get_cipher_data(long param_1)

{
  return *(undefined8 *)(param_1 + 0x78);
}

