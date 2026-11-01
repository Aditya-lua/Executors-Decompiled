
void FUN_0023dd20(undefined8 param_1,undefined8 *param_2)

{
  long unaff_x20;
  
  if ((code *)*param_2 != (code *)0x0) {
    (*(code *)*param_2)(param_1);
  }
  if (*(long *)(unaff_x20 + 8) == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(param_1,*(long *)(unaff_x20 + 8),*(undefined8 *)(unaff_x20 + 0x10));
  return;
}

