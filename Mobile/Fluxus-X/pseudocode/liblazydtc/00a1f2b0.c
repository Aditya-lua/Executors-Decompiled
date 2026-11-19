/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1f2b0
 */

undefined8 DH_set_length(long param_1,undefined4 param_2)

{
  *(undefined4 *)(param_1 + 0x68) = param_2;
  *(long *)(param_1 + 200) = *(long *)(param_1 + 200) + 1;
  return 1;
}

