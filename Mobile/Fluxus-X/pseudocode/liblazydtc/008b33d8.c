/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b33d8
 */

void FUN_008b33d8(undefined8 param_1,long param_2,undefined8 param_3)

{
  if (*(long *)(param_2 + 0x28) != 0) {
    FUN_008b7a9c(param_1,*(long *)(param_2 + 0x28),
                 (ulong)(uint)(*(int *)(param_2 + 0x5c) - *(int *)(param_2 + 0x58)) << 4,
                 *(undefined1 *)(param_2 + 1));
  }
  if (*(long *)(param_2 + 0x40) != 0) {
    FUN_008b7a9c(param_1,*(long *)(param_2 + 0x40),
                 (ulong)(*(int *)(param_2 + 0x5c) - (uint)*(byte *)(param_2 + 0x68)) << 3,
                 *(undefined1 *)(param_2 + 1));
  }
  FUN_008b7bd4(param_1,param_2,0x70,*(undefined1 *)(param_2 + 1),param_3);
  return;
}

