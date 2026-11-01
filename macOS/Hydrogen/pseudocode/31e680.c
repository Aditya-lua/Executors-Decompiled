
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_0031e680(void)

{
  long lVar1;
  long unaff_x29;
  undefined1 auVar2 [16];
  undefined8 uStack0000000000000000;
  undefined1 uStack0000000000000030;
  undefined2 uStack0000000000000038;
  undefined1 uStack0000000000000040;
  undefined1 uStack0000000000000050;
  
  _uStack0000000000000030 = _UNK_008781fe;
  uStack0000000000000038 = 0xf9f8;
  func_0x00373e9c(0xa296c8,&DAT_002c21e4);
  lVar1 = func_0x002dd408(0xa3a728,&uStack0000000000000040,0xd,&uStack0000000000000050,0x16,
                          unaff_x29 + -0x48,(long)&uStack0000000000000000 + 4);
  if (lVar1 == 0) {
    func_0x0028f83c(0x1f,0,0x1c,"/aws-lc/crypto/fipsmodule/hkdf/hkdf.c",0x49);
  }
  else {
    if (iRam0000000000a3a72c != uStack0000000000000000._4_4_) {
      func_0x0079eb04();
      goto code_r0x0031e76c;
    }
    func_0x002dd0c0((long)&uStack0000000000000000 + 4,0x2a,0xa3a728,unaff_x29 + -0x48,
                    uStack0000000000000000._4_4_,&uStack0000000000000030,10);
  }
  func_0x002fd75c(&UNK_00878208,(long)&uStack0000000000000000 + 4,0x2a,"HKDF-SHA-256 KAT");
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -8)) {
    return;
  }
code_r0x0031e76c:
  auVar2 = ___stack_chk_fail();
                    /* WARNING: Could not recover jumptable at 0x007b2f8c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR____assert_rtn_00a24af8)(auVar2._0_8_,auVar2._8_8_,0xe5);
  return;
}

