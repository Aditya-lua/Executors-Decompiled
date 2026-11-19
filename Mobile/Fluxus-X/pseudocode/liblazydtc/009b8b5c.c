/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b8b5c
 */

undefined8 SSL_CTX_get_keylog_callback(long param_1)

{
  return *(undefined8 *)(param_1 + 0x3d0);
}

