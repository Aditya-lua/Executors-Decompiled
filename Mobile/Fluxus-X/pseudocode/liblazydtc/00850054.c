/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00850054
 */

void FUN_00850054(undefined8 *param_1,undefined8 *param_2,undefined8 *param_3,undefined8 *param_4,
                 undefined8 param_5,undefined1 param_6,undefined8 *param_7,undefined1 param_8,
                 undefined8 *param_9)

{
  undefined4 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  
  uVar1 = DAT_00d1b190;
  *param_1 = &PTR___cxa_pure_virtual_00c4a508;
  *(undefined4 *)(param_1 + 1) = uVar1;
  uVar3 = param_2[1];
  uVar2 = *param_2;
  *(undefined1 *)((long)param_1 + 0x1c) = 0;
  *param_1 = &PTR_FUN_00c49960;
  *(undefined8 *)((long)param_1 + 0x14) = uVar3;
  *(undefined8 *)((long)param_1 + 0xc) = uVar2;
  uVar2 = *param_3;
  param_1[5] = param_3[1];
  param_1[4] = uVar2;
  uVar3 = param_4[1];
  uVar2 = *param_4;
  param_1[8] = param_5;
  *(undefined1 *)(param_1 + 9) = param_6;
  param_1[7] = uVar3;
  param_1[6] = uVar2;
  uVar3 = param_7[1];
  uVar2 = *param_7;
  *(undefined1 *)((long)param_1 + 0x5c) = param_8;
  *(undefined8 *)((long)param_1 + 0x54) = uVar3;
  *(undefined8 *)((long)param_1 + 0x4c) = uVar2;
  uVar2 = *param_9;
  param_1[0xd] = param_9[1];
  param_1[0xc] = uVar2;
  return;
}

