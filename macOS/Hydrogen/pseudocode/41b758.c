
undefined1  [16] FUN_0041b758(undefined1 *param_1)

{
  undefined1 auVar1 [16];
  ulong uVar2;
  undefined8 *unaff_x19;
  ulong unaff_x20;
  ulong unaff_x21;
  undefined1 *unaff_x22;
  ulong unaff_x23;
  ulong *unaff_x24;
  long unaff_x25;
  ulong unaff_x26;
  long unaff_x27;
  ulong unaff_x28;
  
  while( true ) {
    if (unaff_x23 == 1) {
      *param_1 = *unaff_x22;
    }
    else {
      _memcpy(param_1,unaff_x22,unaff_x23);
    }
    uVar2 = unaff_x21 - unaff_x23;
    unaff_x22 = unaff_x22 + unaff_x23;
    unaff_x26 = unaff_x23 + unaff_x26;
    unaff_x27 = unaff_x27 + -0x10;
    if ((unaff_x21 <= unaff_x28) || (unaff_x27 == 0)) break;
    param_1 = (undefined1 *)unaff_x19[2];
    unaff_x28 = unaff_x19[3];
    unaff_x23 = uVar2;
    if (unaff_x28 <= uVar2) {
      unaff_x23 = unaff_x28;
    }
    unaff_x19 = unaff_x19 + 2;
    unaff_x21 = uVar2;
  }
  if (unaff_x26 + unaff_x25 <= unaff_x20) {
    unaff_x20 = unaff_x26 + unaff_x25;
  }
  *unaff_x24 = unaff_x20;
  auVar1._8_8_ = 0;
  auVar1._0_8_ = unaff_x26;
  return auVar1 << 0x40;
}

