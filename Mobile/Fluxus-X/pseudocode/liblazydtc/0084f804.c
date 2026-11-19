/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0084f804
 */

void FUN_0084f804(undefined8 *param_1,undefined8 *param_2,undefined8 *param_3,undefined1 param_4)

{
  undefined4 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  
  uVar1 = DAT_00d1b0f0;
  *param_1 = &PTR___cxa_pure_virtual_00c4a508;
  *(undefined4 *)(param_1 + 1) = uVar1;
  uVar3 = param_2[1];
  uVar2 = *param_2;
  *(undefined1 *)((long)param_1 + 0x1c) = 0;
  *param_1 = &PTR_FUN_00c49730;
  *(undefined8 *)((long)param_1 + 0x14) = uVar3;
  *(undefined8 *)((long)param_1 + 0xc) = uVar2;
  uVar3 = param_3[1];
  uVar2 = *param_3;
  *(undefined1 *)(param_1 + 6) = param_4;
  param_1[5] = uVar3;
  param_1[4] = uVar2;
  return;
}

