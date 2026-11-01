
ulong FUN_002960ac(void)

{
  undefined1 auVar1 [16];
  undefined1 auVar2 [16];
  int iVar3;
  ulong uVar4;
  long unaff_x20;
  long unaff_x25;
  ulong unaff_x26;
  ulong unaff_x27;
  
  do {
    iVar3 = func_0x0027ea28();
    if (iVar3 < 1) {
      return 0;
    }
    uVar4 = func_0x0027f658();
    if ((int)uVar4 == 0) {
      return uVar4;
    }
    do {
      unaff_x26 = unaff_x26 + 1;
      unaff_x20 = unaff_x20 + -1;
      iVar3 = func_0x00280490();
      unaff_x25 = unaff_x25 + -1;
      if (iVar3 < 1) {
        return 0;
      }
      if (unaff_x20 == 0) {
        iVar3 = func_0x0027e76c();
        return (ulong)(0 < iVar3);
      }
      auVar1._8_8_ = 0;
      auVar1._0_8_ = unaff_x26;
      auVar2._8_8_ = 0;
      auVar2._0_8_ = unaff_x27;
    } while (unaff_x25 + (SUB168(auVar1 * auVar2,8) >> 3) * 0xf != 0);
  } while( true );
}

