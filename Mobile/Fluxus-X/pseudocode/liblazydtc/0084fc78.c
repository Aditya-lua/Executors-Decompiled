/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0084fc78
 */

void FUN_0084fc78(undefined8 *param_1,undefined8 *param_2)

{
  undefined4 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  
  uVar1 = DAT_00d1b130;
  *param_1 = &PTR___cxa_pure_virtual_00c4a508;
  *(undefined4 *)(param_1 + 1) = uVar1;
  uVar3 = param_2[1];
  uVar2 = *param_2;
  *(undefined1 *)((long)param_1 + 0x1c) = 0;
  *param_1 = &PTR_LAB_00c49810;
  *(undefined8 *)((long)param_1 + 0x14) = uVar3;
  *(undefined8 *)((long)param_1 + 0xc) = uVar2;
  return;
}

