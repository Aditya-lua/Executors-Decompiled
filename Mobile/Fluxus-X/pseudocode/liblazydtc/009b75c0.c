/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b75c0
 */

undefined8 SSL_get_pending_cipher(long param_1)

{
  return *(undefined8 *)(param_1 + 0x2e0);
}

