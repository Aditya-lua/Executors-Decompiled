
/* WARNING: Possible PIC construction at 0x005ae4d8: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x005ae4dc) */

void FUN_005b0ae0(undefined8 *param_1,long param_2)

{
  long in_x9;
  undefined8 uVar1;
  
  param_1[1] = in_x9 + 0x815;
  param_1[2] = 0x2d;
  *param_1 = 0x8000000000000000;
  uVar1 = *(undefined8 *)(param_2 + 8);
  func_0x005adc80(uVar1);
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(uVar1,0x40,8);
  return;
}

