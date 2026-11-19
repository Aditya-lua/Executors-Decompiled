/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b0da8
 */

undefined8 SSL_COMP_get0_name(long param_1)

{
  return *(undefined8 *)(param_1 + 8);
}

