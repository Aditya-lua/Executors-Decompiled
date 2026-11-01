
undefined1  [16] FUN_006da43c(ulong param_1,undefined8 param_2,undefined8 param_3)

{
  long lVar1;
  ulong in_x9;
  ulong uVar2;
  ulong uVar3;
  long unaff_x21;
  long unaff_x22;
  ulong unaff_x23;
  undefined1 auVar4 [16];
  
  while( true ) {
    uVar3 = (in_x9 - (in_x9 >> 7) | param_1 & 0x7f7f7f7f7f7f7f7f) + 1;
    uVar2 = uVar3 & 0x8080808080808080;
    param_1 = uVar2 - (uVar2 >> 7) | uVar3 & 0x7f7f7f7f7f7f7f7f;
    unaff_x23 = unaff_x23 + 1;
    unaff_x22 = unaff_x22 + 0x18;
    if (*(ulong *)(unaff_x21 + 0x28) <= unaff_x23) break;
    if (*(long *)(*(long *)(unaff_x21 + 0x20) + unaff_x22 + 8) != 0) {
      lVar1 = func_0x006da0e0();
      uVar3 = lVar1 + param_1 & 0x8080808080808080;
      param_1 = uVar3 - (uVar3 >> 7) | lVar1 + param_1 & 0x7f7f7f7f7f7f7f7f;
    }
    lVar1 = func_0x006da0e0();
    param_3 = 0;
    param_1 = lVar1 + param_1;
    in_x9 = param_1 & 0x8080808080808080;
  }
  auVar4._8_8_ = param_3;
  auVar4._0_8_ = param_1;
  return auVar4;
}

