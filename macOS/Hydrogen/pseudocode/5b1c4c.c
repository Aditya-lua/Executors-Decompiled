
/* WARNING: Possible PIC construction at 0x005ae1ec: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x005ae1f0) */
/* WARNING: Removing unreachable block (ram,0x005ae1fc) */
/* WARNING: Removing unreachable block (ram,0x005ae214) */
/* WARNING: Removing unreachable block (ram,0x005ae23c) */
/* WARNING: Removing unreachable block (ram,0x005ae21c) */
/* WARNING: Removing unreachable block (ram,0x005ae204) */

void FUN_005b1c4c(undefined8 *param_1,long param_2)

{
  long in_x9;
  undefined8 uVar1;
  
  param_1[1] = in_x9 + 0xf9a;
  param_1[2] = 0x26;
  *param_1 = 1;
  uVar1 = *(undefined8 *)(param_2 + 0x20);
  func_0x005adc80(uVar1);
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(uVar1,0x40,8);
  return;
}

