
void FUN_004a7724(void)

{
  long unaff_x19;
  undefined8 unaff_x21;
  long unaff_x22;
  long unaff_x23;
  long unaff_x24;
  
  while( true ) {
    FUN_004aa3a4();
    unaff_x22 = unaff_x22 + 8;
    func_0x004a9af0(unaff_x21);
    if (unaff_x23 == unaff_x22) break;
    unaff_x21 = *(undefined8 *)(unaff_x19 + unaff_x22);
  }
  if (unaff_x24 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

