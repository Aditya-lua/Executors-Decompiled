/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e5188
 */

void FUN_008e5188(undefined8 *param_1,int param_2)

{
  undefined8 uVar1;
  
  *param_1 = &PTR_LAB_00c4e460;
  param_1[1] = &PTR_LAB_00c4e4b8;
  uVar1 = FUN_008e4ff0(param_2 << 3);
  param_1[2] = uVar1;
  *(undefined4 *)(param_1 + 3) = 0;
  *(int *)((long)param_1 + 0x1c) = param_2;
  return;
}

