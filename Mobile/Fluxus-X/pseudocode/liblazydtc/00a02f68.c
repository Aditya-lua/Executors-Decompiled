/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a02f68
 */

undefined8 BN_GENCB_get_arg(long param_1)

{
  return *(undefined8 *)(param_1 + 8);
}

