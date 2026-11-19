/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e51e4
 */

undefined8 FUN_008e51e4(long *param_1,undefined8 param_2)

{
  uint uVar1;
  uint uVar2;
  
  uVar1 = *(uint *)(param_1 + 3);
  uVar2 = uVar1 + 1;
  if (*(uint *)((long)param_1 + 0x1c) < uVar2) {
    uVar1 = (**(code **)(*param_1 + 0x20))(param_1,uVar2);
    if (uVar1 < uVar2) {
      return 0;
    }
    uVar1 = *(uint *)(param_1 + 3);
    uVar2 = uVar1 + 1;
  }
  *(undefined8 *)(param_1[2] + (ulong)uVar1 * 8) = param_2;
  *(uint *)(param_1 + 3) = uVar2;
  return 1;
}

