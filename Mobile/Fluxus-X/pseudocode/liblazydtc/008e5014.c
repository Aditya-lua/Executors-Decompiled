/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e5014
 */

undefined8 FUN_008e5014(long param_1,long *param_2)

{
  undefined8 uVar1;
  
  uVar1 = FUN_008e4ff0(4);
  *(undefined8 *)(param_1 + 0x10) = uVar1;
  (**(code **)(*param_2 + 0x28))(param_2,uVar1);
  *(long **)(param_1 + 8) = param_2;
  return 1;
}

