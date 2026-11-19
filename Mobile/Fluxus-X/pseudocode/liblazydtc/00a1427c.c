/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1427c
 */

undefined4 SCT_get_source(long param_1)

{
  return *(undefined4 *)(param_1 + 0x5c);
}

