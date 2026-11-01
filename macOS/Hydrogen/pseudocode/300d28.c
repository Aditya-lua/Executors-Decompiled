
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_00300d28(void)

{
  undefined8 unaff_x19;
  long unaff_x29;
  undefined8 uStack0000000000000020;
  undefined8 uStack0000000000000028;
  undefined8 uStack0000000000000030;
  undefined8 uStack0000000000000038;
  undefined8 uStack0000000000000040;
  undefined8 uStack0000000000000048;
  undefined8 uStack00000000000000d0;
  
  uStack0000000000000028 = _UNK_0082ff78;
  uStack0000000000000020 = _UNK_0082ff70;
  uStack0000000000000038 = _UNK_0082ff88;
  uStack0000000000000030 = _UNK_0082ff80;
  uStack0000000000000040 = 0;
  uStack0000000000000048 = 0;
  uStack00000000000000d0 = _UNK_00830258;
  func_0x002b603c();
  if (uStack00000000000000d0._4_4_ == 0x1c) {
    func_0x00300ef8();
    func_0x0036e464();
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x18)) {
      return unaff_x19;
    }
  }
  else {
    func_0x0079f1b0();
  }
  ___stack_chk_fail();
  func_0x002b603c();
  return 1;
}

