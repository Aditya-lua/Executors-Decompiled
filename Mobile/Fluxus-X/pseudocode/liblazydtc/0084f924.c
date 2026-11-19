/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0084f924
 */

void FUN_0084f924(undefined8 *param_1,undefined8 *param_2,undefined8 param_3,undefined8 param_4,
                 undefined8 param_5,undefined8 *param_6,undefined8 *param_7,undefined8 param_8,
                 undefined1 param_9,undefined8 *param_10,undefined8 *param_11)

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
  *(undefined8 *)((long)param_1 + 0x14) = uVar3;
  *(undefined8 *)((long)param_1 + 0xc) = uVar2;
  param_1[4] = param_3;
  param_1[5] = param_4;
  param_1[6] = param_5;
  uVar3 = param_6[1];
  uVar2 = *param_6;
  *(undefined4 *)(param_1 + 9) = *(undefined4 *)(param_6 + 2);
  param_1[8] = uVar3;
  param_1[7] = uVar2;
  uVar3 = param_7[1];
  uVar2 = *param_7;
  uVar1 = *(undefined4 *)(param_7 + 2);
  param_1[0xc] = param_8;
  *(undefined1 *)(param_1 + 0xd) = param_9;
  *(undefined8 *)((long)param_1 + 0x54) = uVar3;
  *(undefined8 *)((long)param_1 + 0x4c) = uVar2;
  *(undefined4 *)((long)param_1 + 0x5c) = uVar1;
  uVar3 = param_10[1];
  uVar2 = *param_10;
  *(undefined4 *)((long)param_1 + 0x7c) = *(undefined4 *)(param_10 + 2);
  *(undefined8 *)((long)param_1 + 0x74) = uVar3;
  *(undefined8 *)((long)param_1 + 0x6c) = uVar2;
  uVar2 = *param_11;
  uVar1 = *(undefined4 *)(param_11 + 2);
  param_1[0x11] = param_11[1];
  param_1[0x10] = uVar2;
  *(undefined4 *)(param_1 + 0x12) = uVar1;
  return;
}

