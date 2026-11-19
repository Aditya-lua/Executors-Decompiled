/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b8008
 */

undefined4 SSL_is_server(long param_1)

{
  return *(undefined4 *)(param_1 + 0x38);
}

