
undefined8 FUN_005e3d54(void)

{
  ulong uVar1;
  byte *pbVar2;
  long unaff_x20;
  ulong unaff_x21;
  ulong unaff_x22;
  ulong unaff_x23;
  byte *unaff_x24;
  byte *unaff_x25;
  
  do {
    uVar1 = func_0x0046a9ac();
    if ((uVar1 & 1) != 0) {
      return 1;
    }
    while( true ) {
      unaff_x22 = unaff_x22 + 1;
      if (unaff_x21 == unaff_x22) {
        return 0;
      }
      pbVar2 = unaff_x24;
      if ((unaff_x22 >> 5 < unaff_x23) &&
         ((*(uint *)(unaff_x20 + (unaff_x22 >> 5) * 4) >> (ulong)((uint)unaff_x22 & 0x1f) & 1) != 0)
         ) {
        pbVar2 = unaff_x25;
      }
      if ((*pbVar2 & 1) == 0) break;
      uVar1 = func_0x0046a9ac();
      if ((uVar1 & 1) != 0) {
        return 1;
      }
    }
  } while( true );
}

