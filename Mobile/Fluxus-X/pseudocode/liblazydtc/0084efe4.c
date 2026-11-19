/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0084efe4
 */

void FUN_0084efe4(undefined8 *param_1,undefined8 *param_2,undefined8 *param_3,undefined8 *param_4,
                 undefined8 *param_5,undefined8 param_6,undefined8 *param_7,undefined1 param_8,
                 undefined8 *param_9,undefined8 param_10,undefined8 param_11,undefined8 *param_12,
                 undefined8 param_13,undefined8 param_14,undefined8 *param_15)

{
  undefined4 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  
  uVar1 = DAT_00d1b070;
  *param_1 = &PTR___cxa_pure_virtual_00c4a508;
  *(undefined4 *)(param_1 + 1) = uVar1;
  uVar3 = param_2[1];
  uVar2 = *param_2;
  *param_1 = &PTR_FUN_00c49538;
  *(undefined8 *)((long)param_1 + 0x14) = uVar3;
  *(undefined8 *)((long)param_1 + 0xc) = uVar2;
  uVar2 = *param_3;
  param_1[5] = param_3[1];
  param_1[4] = uVar2;
  uVar2 = *param_4;
  param_1[7] = param_4[1];
  param_1[6] = uVar2;
  uVar3 = param_5[1];
  uVar2 = *param_5;
  param_1[10] = param_6;
  param_1[9] = uVar3;
  param_1[8] = uVar2;
  uVar3 = param_7[1];
  uVar2 = *param_7;
  param_1[0xd] = param_13;
  *(undefined1 *)(param_1 + 0xe) = param_8;
  param_1[0xc] = uVar3;
  param_1[0xb] = uVar2;
  uVar2 = *param_9;
  *(undefined8 *)((long)param_1 + 0x7c) = param_9[1];
  *(undefined8 *)((long)param_1 + 0x74) = uVar2;
  param_1[0x11] = param_14;
  param_1[0x12] = param_10;
  uVar2 = *param_12;
  param_1[0x13] = param_11;
  param_1[0x14] = uVar2;
  uVar2 = *param_15;
  uVar1 = *(undefined4 *)(param_15 + 2);
  param_1[0x16] = param_15[1];
  param_1[0x15] = uVar2;
  *(undefined4 *)(param_1 + 0x17) = uVar1;
  return;
}

