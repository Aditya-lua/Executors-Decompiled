/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b36c4
 */

undefined8 SSL_get0_param(long param_1)

{
  return *(undefined8 *)(param_1 + 0x4d8);
}

