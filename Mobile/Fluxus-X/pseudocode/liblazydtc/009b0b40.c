/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b0b40
 */

undefined4 SSL_CIPHER_get_protocol_id(long param_1)

{
  return *(undefined4 *)(param_1 + 0x18);
}

