
ulong FUN_005cc140(long param_1,long param_2)

{
  ulong uVar1;
  ulong unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long unaff_x22;
  
  while( true ) {
    uVar1 = func_0x005b28d4(param_1,param_2);
    if ((uVar1 & 1) == 0) {
      return unaff_x19;
    }
    unaff_x20 = unaff_x20 + -1;
    unaff_x19 = (ulong)(unaff_x20 == 0);
    if (unaff_x20 == 0) break;
    param_1 = unaff_x22;
    param_2 = unaff_x21;
    unaff_x21 = unaff_x21 + 0x40;
    unaff_x22 = unaff_x22 + 0x40;
  }
  return 1;
}

