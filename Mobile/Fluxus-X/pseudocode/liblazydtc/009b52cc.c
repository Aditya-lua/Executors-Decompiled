/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b52cc
 */

undefined4 SSL_get_key_update_type(long param_1)

{
  return *(undefined4 *)(param_1 + 0xba4);
}

