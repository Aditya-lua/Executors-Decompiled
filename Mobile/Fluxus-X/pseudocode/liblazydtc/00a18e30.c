/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a18e30
 */

undefined4 bn_get_dmax(long param_1)

{
  return *(undefined4 *)(param_1 + 0xc);
}

