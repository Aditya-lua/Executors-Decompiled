
void FUN_0031e6e4(void)

{
  bool in_ZR;
  undefined8 in_x4;
  long unaff_x29;
  undefined1 auVar1 [16];
  undefined1 uStack0000000000000004;
  undefined1 uStack0000000000000030;
  
  if (in_ZR) {
    func_0x002dd0c0(&uStack0000000000000004,0x2a,0xa3a728,unaff_x29 + -0x48,in_x4,
                    &uStack0000000000000030,10);
    func_0x002fd75c(&UNK_00878208,&uStack0000000000000004,0x2a,"HKDF-SHA-256 KAT");
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -8)) {
      return;
    }
  }
  else {
    func_0x0079eb04();
  }
  auVar1 = ___stack_chk_fail();
                    /* WARNING: Could not recover jumptable at 0x007b2f8c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR____assert_rtn_00a24af8)(auVar1._0_8_,auVar1._8_8_,0xe5);
  return;
}

