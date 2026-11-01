
/* WARNING: Possible PIC construction at 0x005ae858: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x005ae85c) */
/* WARNING: Removing unreachable block (ram,0x005ae864) */
/* WARNING: Removing unreachable block (ram,0x005ae870) */
/* WARNING: Removing unreachable block (ram,0x005ae87c) */
/* WARNING: Removing unreachable block (ram,0x005ae894) */
/* WARNING: Removing unreachable block (ram,0x005ae8bc) */
/* WARNING: Removing unreachable block (ram,0x005ae89c) */
/* WARNING: Removing unreachable block (ram,0x005ae884) */

void FUN_005b95e4(undefined8 *param_1)

{
  long unaff_x19;
  undefined8 uVar1;
  
  *param_1 = 0x8000000000000000;
  uVar1 = *(undefined8 *)(unaff_x19 + 0x50);
  func_0x005adc80(uVar1);
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(uVar1,0x40,8);
  return;
}

