/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0084e9bc
 */

void FUN_0084e9bc(undefined8 *param_1,undefined8 *param_2,undefined4 param_3,undefined8 param_4,
                 undefined8 param_5,undefined8 param_6)

{
  undefined4 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  
  uVar1 = DAT_00d1af90;
  *param_1 = &PTR___cxa_pure_virtual_00c4a508;
  *(undefined4 *)(param_1 + 1) = uVar1;
  uVar3 = param_2[1];
  uVar2 = *param_2;
  *param_1 = &PTR_LAB_00c49228;
  *(undefined4 *)((long)param_1 + 0x1c) = param_3;
  param_1[4] = param_4;
  param_1[5] = param_5;
  *(undefined8 *)((long)param_1 + 0x14) = uVar3;
  *(undefined8 *)((long)param_1 + 0xc) = uVar2;
  param_1[6] = param_6;
  return;
}

