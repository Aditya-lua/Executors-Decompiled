
void FUN_004a7548(void)

{
  long unaff_x19;
  undefined8 uVar1;
  long unaff_x22;
  long unaff_x23;
  long unaff_x24;
  
  for (; unaff_x23 != unaff_x22; unaff_x22 = unaff_x22 + 8) {
    uVar1 = *(undefined8 *)(unaff_x19 + unaff_x22);
    FUN_004aa3a4();
    func_0x004a9af0(uVar1);
  }
  if (unaff_x24 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

