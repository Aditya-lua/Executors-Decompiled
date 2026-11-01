
void FUN_004b3e7c(void)

{
  long unaff_x20;
  undefined8 uVar1;
  long unaff_x22;
  long unaff_x23;
  long unaff_x24;
  
  for (; unaff_x24 != unaff_x23; unaff_x23 = unaff_x23 + 8) {
    uVar1 = *(undefined8 *)(unaff_x20 + unaff_x23);
    func_0x004b27b8();
    func_0x004b23e4(uVar1);
  }
  if (unaff_x22 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

