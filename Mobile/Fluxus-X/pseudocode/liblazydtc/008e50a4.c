/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e50a4
 */

undefined8 FUN_008e50a4(long param_1,int param_2)

{
  undefined8 uVar1;
  
  if (param_2 == 0) {
    return 0;
  }
  uVar1 = FUN_008e4ff0(param_2);
  *(undefined8 *)(param_1 + 8) = uVar1;
  *(undefined8 *)(param_1 + 0x10) = uVar1;
  *(int *)(param_1 + 0x18) = param_2;
  return 1;
}

