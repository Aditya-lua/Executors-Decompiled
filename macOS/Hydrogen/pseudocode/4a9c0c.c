
void FUN_004a9c0c(void)

{
  long unaff_x20;
  undefined8 unaff_x21;
  long unaff_x22;
  long unaff_x23;
  long unaff_x24;
  
  while( true ) {
    func_0x004ad4c8();
    unaff_x23 = unaff_x23 + 8;
    func_0x004aceb8(unaff_x21);
    if (unaff_x24 == unaff_x23) break;
    unaff_x21 = *(undefined8 *)(unaff_x20 + unaff_x23);
  }
  if (unaff_x22 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

