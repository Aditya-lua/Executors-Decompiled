
undefined1  [16] FUN_0041a02c(long param_1)

{
  undefined1 auVar1 [16];
  ulong uVar2;
  long *plVar3;
  long in_x9;
  long lVar4;
  long in_x10;
  long in_x11;
  long in_x12;
  long *in_x13;
  long in_x14;
  long in_x15;
  long unaff_x19;
  long unaff_x20;
  
  while( true ) {
    in_x9 = in_x15 + in_x9;
    in_x10 = in_x13[-2] + in_x10;
    in_x11 = *in_x13 + in_x11;
    in_x12 = in_x13[2] + in_x12;
    in_x14 = in_x14 + -4;
    if (in_x14 == 0) break;
    in_x15 = in_x13[4];
    in_x13 = in_x13 + 8;
  }
  uVar2 = in_x12 + in_x11 + in_x10 + in_x9;
  if (unaff_x20 != param_1) {
    lVar4 = unaff_x20 - param_1;
    plVar3 = (long *)(unaff_x19 + param_1 * 0x10 + 8);
    do {
      uVar2 = *plVar3 + uVar2;
      lVar4 = lVar4 + -1;
      plVar3 = plVar3 + 2;
    } while (lVar4 != 0);
  }
  auVar1._8_8_ = 0;
  auVar1._0_8_ = uVar2;
  return auVar1 << 0x40;
}

