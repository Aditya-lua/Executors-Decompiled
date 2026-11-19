/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0084ec44
 */

void FUN_0084ec44(undefined8 param_1,undefined8 *param_2,undefined8 *param_3,undefined4 param_4)

{
  undefined4 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  
  uVar1 = DAT_00d1aff0;
  *param_2 = &PTR___cxa_pure_virtual_00c4a508;
  *(undefined4 *)(param_2 + 1) = uVar1;
  uVar3 = param_3[1];
  uVar2 = *param_3;
  *param_2 = &PTR_LAB_00c49378;
  param_2[4] = param_1;
  *(undefined8 *)((long)param_2 + 0x14) = uVar3;
  *(undefined8 *)((long)param_2 + 0xc) = uVar2;
  *(undefined4 *)(param_2 + 5) = param_4;
  return;
}

