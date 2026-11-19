/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00932ea0
 */

undefined8 FUN_00932ea0(long param_1)

{
  undefined8 uVar1;
  
  if (*(char *)(param_1 + 0x1b1) < '\0') {
    return 0;
  }
  FUN_00924348(param_1 + 0x140);
  *(uint *)(param_1 + 0x1b1) = *(uint *)(param_1 + 0x1b1) | 0x100;
  uVar1 = FUN_00932ef0(param_1);
  return uVar1;
}

