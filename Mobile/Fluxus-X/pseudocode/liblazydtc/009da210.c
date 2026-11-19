/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009da210
 */

undefined4 SSL_get_state(long param_1)

{
  return *(undefined4 *)(param_1 + 0x5c);
}

