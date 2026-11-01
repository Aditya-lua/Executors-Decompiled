
undefined1  [16] FUN_0041c97c(undefined8 param_1,undefined8 param_2)

{
  undefined1 auVar1 [16];
  ulong uVar2;
  long in_x9;
  long unaff_x20;
  ulong unaff_x21;
  long unaff_x22;
  long unaff_x23;
  
  uVar2 = *(long *)(unaff_x23 + 0x20) - unaff_x20;
  if (uVar2 <= unaff_x21) {
    unaff_x21 = uVar2;
  }
  _memcpy(in_x9 + unaff_x20,param_2,unaff_x21);
  *(ulong *)(unaff_x23 + 0x30) = unaff_x21 + unaff_x20;
  *(long *)(unaff_x23 + 0x18) = *(long *)(unaff_x23 + 0x18) + 1;
  auVar1._8_8_ = 0;
  auVar1._0_8_ = unaff_x21 + unaff_x22;
  return auVar1 << 0x40;
}

