/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e4ac4
 */

void FUN_008e4ac4(long *param_1)

{
  undefined4 uVar1;
  
  (**(code **)(*param_1 + 0x18))();
  uVar1 = (**(code **)(*(long *)param_1[5] + 0x20))();
  FUN_008e34dc(param_1,uVar1);
  return;
}

