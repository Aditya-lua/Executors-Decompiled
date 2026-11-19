/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0084f8b0
 */

void FUN_0084f8b0(undefined8 *param_1,undefined8 *param_2,undefined8 param_3,undefined8 param_4,
                 undefined8 param_5,undefined8 *param_6,undefined8 *param_7)

{
  undefined4 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  
  uVar1 = DAT_00d1b100;
  *param_1 = &PTR___cxa_pure_virtual_00c4a508;
  *(undefined4 *)(param_1 + 1) = uVar1;
  uVar3 = param_2[1];
  uVar2 = *param_2;
  *(undefined1 *)((long)param_1 + 0x1c) = 0;
  *param_1 = &PTR_FUN_00c49768;
  param_1[4] = param_3;
  param_1[5] = param_4;
  *(undefined8 *)((long)param_1 + 0x14) = uVar3;
  *(undefined8 *)((long)param_1 + 0xc) = uVar2;
  param_1[6] = param_5;
  uVar3 = param_6[1];
  uVar2 = *param_6;
  *(undefined4 *)(param_1 + 9) = *(undefined4 *)(param_6 + 2);
  param_1[8] = uVar3;
  param_1[7] = uVar2;
  uVar3 = param_7[1];
  uVar2 = *param_7;
  uVar1 = *(undefined4 *)(param_7 + 2);
  param_1[0xc] = 0;
  *(undefined1 *)(param_1 + 0xd) = 0;
  *(undefined8 *)((long)param_1 + 0x54) = uVar3;
  *(undefined8 *)((long)param_1 + 0x4c) = uVar2;
  *(undefined4 *)((long)param_1 + 0x5c) = uVar1;
  *(undefined1 *)((long)param_1 + 0x6c) = 0;
  *(undefined1 *)((long)param_1 + 0x7c) = 0;
  *(undefined1 *)(param_1 + 0x10) = 0;
  *(undefined1 *)(param_1 + 0x12) = 0;
  return;
}

