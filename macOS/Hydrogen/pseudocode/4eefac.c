
undefined8 FUN_004eefac(long param_1)

{
  undefined1 auVar1 [16];
  code *pcVar2;
  undefined8 uVar3;
  long in_x9;
  undefined8 unaff_x25;
  undefined8 unaff_x26;
  long unaff_x29;
  undefined1 auVar4 [16];
  undefined8 uStack0000000000000020;
  
  auVar1._8_8_ = unaff_x25;
  auVar1._0_8_ = unaff_x26;
  auVar4 = (**(code **)(param_1 + 0x18))
                     (in_x9 + (*(long *)(param_1 + 0x10) - 1U & 0xfffffffffffffff0) + 0x10);
  if (auVar4 != auVar1) {
    func_0x007a23d8(&UNK_008a6820,0x22,&UNK_009e9990);
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x4ef8e8);
    (*pcVar2)();
  }
  func_0x00525f7c(unaff_x29 + -0x70,&uStack0000000000000020,8,0);
  uVar3 = func_0x0051dd78();
  if ((*(ulong *)(unaff_x29 + -0x88) | 0x8000000000000000) != 0x8000000000000000) {
    func_0x00187bd4();
  }
  return uVar3;
}

