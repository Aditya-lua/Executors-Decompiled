
ulong FUN_005d76b4(ulong param_1)

{
  int iVar1;
  ulong unaff_x19;
  long unaff_x20;
  long unaff_x22;
  undefined8 uStack0000000000000008;
  
  while( true ) {
    if ((param_1 & 1) != 0) {
      return unaff_x19;
    }
    iVar1 = func_0x005ab01c(&uStack0000000000000008,unaff_x20);
    unaff_x20 = unaff_x20 + 0x40;
    unaff_x22 = unaff_x22 + -0x40;
    if (iVar1 != 0) break;
    unaff_x19 = (ulong)(unaff_x22 != 0);
    if (unaff_x22 == 0) {
      return 0;
    }
    param_1 = (**(code **)(uStack0000000000000008[1] + 0x18))(*uStack0000000000000008);
  }
  return unaff_x19;
}

