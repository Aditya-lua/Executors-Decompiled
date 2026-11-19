/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b80ac
 */

undefined8 SSL_get_options(long param_1)

{
  return *(undefined8 *)(param_1 + 0x9e8);
}

