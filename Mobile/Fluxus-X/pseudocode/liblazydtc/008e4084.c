/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e4084
 */

void FUN_008e4084(long param_1,undefined8 param_2)

{
  undefined4 uVar1;
  ulong uVar2;
  undefined8 uVar3;
  
  uVar1 = (**(code **)(**(long **)(param_1 + 8) + 0x20))();
  FUN_008e477c(param_2,uVar1);
  uVar2 = FUN_008e40e4(param_2);
  if ((uVar2 & 1) == 0) {
    return;
  }
  uVar3 = FUN_008e47b0(param_1);
  FUN_008e4100(param_2,uVar3);
  return;
}

