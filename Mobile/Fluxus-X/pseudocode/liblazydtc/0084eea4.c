/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0084eea4
 */

void FUN_0084eea4(undefined8 *param_1,undefined8 *param_2,undefined8 param_3,undefined8 *param_4,
                 undefined8 *param_5,undefined8 *param_6,undefined1 param_7,undefined1 param_8)

{
  undefined4 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  
  uVar1 = DAT_00d1b050;
  *param_1 = &PTR___cxa_pure_virtual_00c4a508;
  *(undefined4 *)(param_1 + 1) = uVar1;
  uVar3 = param_2[1];
  uVar2 = *param_2;
  *param_1 = &PTR_FUN_00c494c8;
  *(undefined8 *)((long)param_1 + 0x14) = uVar3;
  *(undefined8 *)((long)param_1 + 0xc) = uVar2;
  uVar2 = *param_4;
  param_1[4] = param_3;
  param_1[5] = uVar2;
  uVar2 = *param_5;
  param_1[7] = param_5[1];
  param_1[6] = uVar2;
  uVar2 = *param_6;
  *(undefined1 *)(param_1 + 9) = param_7;
  *(undefined1 *)((long)param_1 + 0x49) = param_8;
  param_1[8] = uVar2;
  return;
}

