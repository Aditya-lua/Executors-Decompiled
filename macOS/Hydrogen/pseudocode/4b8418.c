
void FUN_004b8418(undefined8 *param_1,undefined1 param_2 [16],undefined1 param_3 [16],long param_4)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  
  param_1[5] = param_2._8_8_;
  param_1[4] = param_2._0_8_;
  param_1[7] = param_3._8_8_;
  param_1[6] = param_3._0_8_;
  uVar1 = *(undefined8 *)(param_4 + 0x48);
  param_1[9] = *(undefined8 *)(param_4 + 0x50);
  param_1[8] = uVar1;
  param_1[10] = *(undefined8 *)(param_4 + 0x58);
  uVar1 = *(undefined8 *)(param_4 + 8);
  uVar3 = *(undefined8 *)(param_4 + 0x20);
  uVar2 = *(undefined8 *)(param_4 + 0x18);
  param_1[1] = *(undefined8 *)(param_4 + 0x10);
  *param_1 = uVar1;
  param_1[3] = uVar3;
  param_1[2] = uVar2;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(param_4,0x60,8);
  return;
}

