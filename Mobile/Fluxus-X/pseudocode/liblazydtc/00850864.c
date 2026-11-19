/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00850864
 */

void FUN_00850864(undefined8 *param_1,undefined8 *param_2,undefined8 *param_3,undefined8 *param_4,
                 undefined8 *param_5,undefined8 *param_6,undefined8 *param_7,undefined8 *param_8,
                 undefined8 *param_9,undefined1 param_10,undefined8 *param_11,undefined8 param_12)

{
  undefined4 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  
  uVar1 = DAT_00d1b210;
  *param_1 = &PTR___cxa_pure_virtual_00c4a508;
  *(undefined4 *)(param_1 + 1) = uVar1;
  uVar3 = param_2[1];
  uVar2 = *param_2;
  *(undefined1 *)((long)param_1 + 0x1c) = 0;
  *param_1 = &PTR_FUN_00c49b20;
  *(undefined8 *)((long)param_1 + 0x14) = uVar3;
  *(undefined8 *)((long)param_1 + 0xc) = uVar2;
  uVar2 = *param_3;
  param_1[5] = param_3[1];
  param_1[4] = uVar2;
  param_1[6] = *param_4;
  uVar2 = *param_5;
  param_1[8] = param_5[1];
  param_1[7] = uVar2;
  uVar2 = *param_6;
  param_1[10] = param_6[1];
  param_1[9] = uVar2;
  uVar2 = *param_7;
  param_1[0xc] = param_7[1];
  param_1[0xb] = uVar2;
  uVar3 = *param_8;
  uVar2 = param_8[2];
  param_1[0xe] = param_8[1];
  param_1[0xd] = uVar3;
  param_1[0xf] = uVar2;
  uVar3 = param_9[1];
  uVar2 = *param_9;
  *(undefined1 *)(param_1 + 0x12) = param_10;
  param_1[0x11] = uVar3;
  param_1[0x10] = uVar2;
  uVar2 = *param_11;
  *(undefined8 *)((long)param_1 + 0x9c) = param_11[1];
  *(undefined8 *)((long)param_1 + 0x94) = uVar2;
  param_1[0x15] = param_12;
  return;
}

