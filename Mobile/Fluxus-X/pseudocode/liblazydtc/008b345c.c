/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b345c
 */

void FUN_008b345c(undefined8 param_1,long param_2,undefined8 param_3)

{
  if (*(long *)(param_2 + 0x20) != 0) {
    FUN_008b7a9c(param_1,*(long *)(param_2 + 0x20),(ulong)*(uint *)(param_2 + 0x18) << 4,
                 *(undefined1 *)(param_2 + 1));
  }
  FUN_008b7bd4(param_1,param_2,0x28,*(undefined1 *)(param_2 + 1),param_3);
  return;
}

