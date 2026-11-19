/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008c8f9c
 */

void FUN_008c8f9c(undefined8 param_1,long param_2)

{
  int iVar1;
  
  iVar1 = *(int *)(param_2 + 0x20) + -1;
  *(int *)(param_2 + 0x20) = iVar1;
  if (iVar1 != 0) {
    return;
  }
  if (*(code **)(param_2 + 0x18) != (code *)0x0) {
    (**(code **)(param_2 + 0x18))(*(undefined8 *)(param_2 + 0x10));
  }
  FUN_008b7a9c(param_1,*(undefined8 *)(param_2 + 0x60),(ulong)*(uint *)(param_2 + 0x68) << 2,
               *(undefined1 *)(param_2 + 0x38));
  FUN_008b7a9c(param_1,*(undefined8 *)(param_2 + 0x70),(ulong)*(uint *)(param_2 + 0x78) << 2,
               *(undefined1 *)(param_2 + 0x38));
  FUN_008b7a9c(param_1,param_2,0x80,*(undefined1 *)(param_2 + 0x38));
  return;
}

