
undefined8 FUN_004ef178(long param_1,ulong param_2)

{
  long lVar1;
  undefined1 auVar2 [16];
  code *pcVar3;
  undefined8 uVar4;
  long in_x9;
  long *in_x10;
  long unaff_x24;
  long unaff_x25;
  long unaff_x26;
  long unaff_x29;
  undefined1 auVar5 [16];
  undefined8 uStack0000000000000020;
  
  auVar2._8_8_ = unaff_x25;
  auVar2._0_8_ = unaff_x26;
  do {
    param_2 = param_2 + 1;
    param_1 = param_1 + 0x20;
    in_x9 = in_x9 + -0x10;
    if (*in_x10 == unaff_x26 && in_x10[1] == unaff_x25) {
      if (param_2 < *(ulong *)(unaff_x24 + 0x108)) {
        param_1 = *(long *)(unaff_x24 + 0x100) + param_1;
        lVar1 = *(long *)(param_1 + -0x18);
        auVar5 = (**(code **)(lVar1 + 0x18))
                           (*(long *)(param_1 + -0x20) +
                            (*(long *)(lVar1 + 0x10) - 1U & 0xfffffffffffffff0) + 0x10);
        if (auVar5 == auVar2) break;
        func_0x007a23d8(&UNK_008a6820,0x22,&UNK_009e9990);
      }
      else {
        func_0x007a2570(param_2,*(ulong *)(unaff_x24 + 0x108),&UNK_009e9b68);
      }
                    /* WARNING: Does not return */
      pcVar3 = (code *)SoftwareBreakpoint(1,0x4ef8e8);
      (*pcVar3)();
    }
    in_x10 = in_x10 + 2;
  } while (in_x9 != 0);
  func_0x00525f7c(unaff_x29 + -0x70,&uStack0000000000000020,8,0);
  uVar4 = func_0x0051b4a8();
  if ((*(ulong *)(unaff_x29 + -0xa0) | 0x8000000000000000) != 0x8000000000000000) {
    func_0x00187bd4();
  }
  return uVar4;
}

