/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9ca50
 */

undefined8 WPACKET_set_flags(long param_1,undefined4 param_2)

{
  if (*(long *)(param_1 + 0x28) == 0) {
    return 0;
  }
  *(undefined4 *)(*(long *)(param_1 + 0x28) + 0x20) = param_2;
  return 1;
}

