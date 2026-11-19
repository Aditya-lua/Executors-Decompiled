/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b8104
 */

undefined8 SSL_get0_verified_chain(long param_1)

{
  return *(undefined8 *)(param_1 + 0x9b0);
}

