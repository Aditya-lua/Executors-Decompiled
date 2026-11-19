/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b504c
 */

void FUN_008b504c(long param_1,long param_2,undefined8 param_3)

{
  if (*(long *)(param_2 + 0xe8) == 0) {
    FUN_008b7a9c(param_1,*(undefined8 *)(param_2 + 0x30),(long)*(int *)(param_2 + 0xb8) << 2,
                 *(undefined1 *)(param_2 + 1));
  }
  else {
    FUN_008c8f9c(param_1);
  }
  FUN_008b7a9c(param_1,*(undefined8 *)(param_2 + 0x38),(long)*(int *)(param_2 + 0xac) << 3,
               *(undefined1 *)(param_2 + 1));
  FUN_008b7a9c(param_1,*(undefined8 *)(param_2 + 0x28),(long)*(int *)(param_2 + 0x9c) << 4,
               *(undefined1 *)(param_2 + 1));
  if (*(long *)(param_2 + 0x90) != 0) {
    FUN_008b7a9c(param_1,*(long *)(param_2 + 0x90),(long)*(int *)(param_2 + 0xb0),
                 *(undefined1 *)(param_2 + 1));
  }
  FUN_008b7a9c(param_1,*(undefined8 *)(param_2 + 0x80),(long)*(int *)(param_2 + 0xa4) * 0x18,
               *(undefined1 *)(param_2 + 1));
  FUN_008b7a9c(param_1,*(undefined8 *)(param_2 + 0x10),(long)*(int *)(param_2 + 0xb4) << 3,
               *(undefined1 *)(param_2 + 1));
  if (*(long *)(param_2 + 0x60) != 0) {
    FUN_008b7a9c(param_1,*(long *)(param_2 + 0x60),(long)*(int *)(param_2 + 0xb8),
                 *(undefined1 *)(param_2 + 1));
  }
  if (*(long *)(param_2 + 0x50) != 0) {
    (**(code **)(*(long *)(param_1 + 0x60) + 0x6e8))(param_1,param_2);
  }
  if (*(long *)(param_2 + 0x40) != 0) {
    FUN_008b7a9c(param_1,*(long *)(param_2 + 0x40),(long)*(int *)(param_2 + 0xbc),
                 *(undefined1 *)(param_2 + 1));
  }
  if (*(long *)(param_2 + 0xc0) != 0) {
    FUN_008b7a9c(param_1,*(long *)(param_2 + 0xc0),(ulong)*(uint *)(param_2 + 200) << 4,
                 *(undefined1 *)(param_2 + 1));
  }
  FUN_008b7bd4(param_1,param_2,0xf0,*(undefined1 *)(param_2 + 1),param_3);
  return;
}

