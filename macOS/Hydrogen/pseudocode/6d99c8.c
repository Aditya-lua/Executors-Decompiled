
undefined8 FUN_006d99c8(undefined8 param_1,undefined8 param_2)

{
  ulong uVar1;
  long *plVar2;
  ulong uVar3;
  long unaff_x19;
  long unaff_x20;
  undefined8 unaff_x22;
  ulong unaff_x25;
  undefined1 auVar4 [16];
  
  auVar4._8_8_ = param_2;
  auVar4._0_8_ = unaff_x22;
  while( true ) {
    if ((auVar4._8_8_ != 0) && (unaff_x25 < *(ulong *)(unaff_x19 + 0x28))) {
      plVar2 = (long *)func_0x006d9030();
      *plVar2 = auVar4._8_8_;
    }
    uVar1 = *(long *)(unaff_x20 + 0x40) + auVar4._0_8_;
    uVar3 = uVar1 & 0x8080808080808080;
    *(ulong *)(unaff_x20 + 0x40) = uVar3 - (uVar3 >> 7) | uVar1 & 0x7f7f7f7f7f7f7f7f;
    *(undefined8 *)(unaff_x20 + 0x48) = 0;
    unaff_x25 = unaff_x25 + 1;
    if (*(ulong *)(unaff_x19 + 0x38) <= unaff_x25) break;
    auVar4 = func_0x006da0e0();
  }
  return 0;
}

