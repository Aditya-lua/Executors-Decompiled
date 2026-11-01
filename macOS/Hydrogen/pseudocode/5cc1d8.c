
undefined1 FUN_005cc1d8(long param_1,long param_2)

{
  undefined1 in_ZR;
  ulong uVar1;
  long unaff_x20;
  
  while( true ) {
    if (unaff_x20 == 0) {
      return in_ZR;
    }
    uVar1 = func_0x005b28d4(param_1,param_2);
    if ((uVar1 & 1) == 0) break;
    unaff_x20 = unaff_x20 + -1;
    in_ZR = unaff_x20 == 0;
    param_1 = param_1 + 0x40;
    param_2 = param_2 + 0x40;
  }
  return in_ZR;
}

