/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0084fac4
 */

void FUN_0084fac4(undefined8 *param_1,undefined8 *param_2,undefined8 param_3,undefined8 param_4,
                 undefined1 param_5,undefined8 *param_6,undefined8 param_7,undefined1 param_8,
                 undefined8 *param_9,undefined8 *param_10)

{
  undefined4 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  
  uVar1 = DAT_00d1b110;
  *param_1 = &PTR___cxa_pure_virtual_00c4a508;
  *(undefined4 *)(param_1 + 1) = uVar1;
  uVar3 = param_2[1];
  uVar2 = *param_2;
  *(undefined1 *)((long)param_1 + 0x1c) = 0;
  *param_1 = &PTR_FUN_00c497a0;
  *(undefined8 *)((long)param_1 + 0x14) = uVar3;
  *(undefined8 *)((long)param_1 + 0xc) = uVar2;
  param_1[4] = param_3;
  param_1[5] = param_4;
  *(undefined1 *)(param_1 + 6) = param_5;
  uVar3 = param_6[1];
  uVar2 = *param_6;
  param_1[9] = param_7;
  *(undefined1 *)(param_1 + 10) = param_8;
  *(undefined8 *)((long)param_1 + 0x3c) = uVar3;
  *(undefined8 *)((long)param_1 + 0x34) = uVar2;
  uVar2 = *param_9;
  uVar1 = *(undefined4 *)(param_9 + 2);
  *(undefined8 *)((long)param_1 + 0x5c) = param_9[1];
  *(undefined8 *)((long)param_1 + 0x54) = uVar2;
  *(undefined4 *)((long)param_1 + 100) = uVar1;
  uVar2 = *param_10;
  uVar1 = *(undefined4 *)(param_10 + 2);
  param_1[0xe] = param_10[1];
  param_1[0xd] = uVar2;
  *(undefined4 *)(param_1 + 0xf) = uVar1;
  return;
}

