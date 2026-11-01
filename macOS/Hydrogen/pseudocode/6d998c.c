
undefined8 FUN_006d998c(ulong param_1)

{
  long *plVar1;
  long unaff_x19;
  long unaff_x20;
  ulong unaff_x25;
  undefined1 auVar2 [16];
  
  while( true ) {
    *(ulong *)(unaff_x20 + 0x40) =
         (param_1 & 0x8080808080808080) - ((param_1 & 0x8080808080808080) >> 7) |
         param_1 & 0x7f7f7f7f7f7f7f7f;
    *(undefined8 *)(unaff_x20 + 0x48) = 0;
    unaff_x25 = unaff_x25 + 1;
    if (*(ulong *)(unaff_x19 + 0x38) <= unaff_x25) break;
    auVar2 = func_0x006da0e0();
    if ((auVar2._8_8_ != 0) && (unaff_x25 < *(ulong *)(unaff_x19 + 0x28))) {
      plVar1 = (long *)func_0x006d9030();
      *plVar1 = auVar2._8_8_;
    }
    param_1 = *(long *)(unaff_x20 + 0x40) + auVar2._0_8_;
  }
  return 0;
}

