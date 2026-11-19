/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5f59c
 */

undefined4 evp_cipher_get_number(long param_1)

{
  return *(undefined4 *)(param_1 + 0x60);
}

