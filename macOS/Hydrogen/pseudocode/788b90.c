
long FUN_00788b90(undefined8 param_1,byte *param_2,undefined8 param_3,byte param_4)

{
  byte bVar1;
  long lVar2;
  undefined1 *unaff_x19;
  long lVar3;
  
  if (unaff_x19 != (undefined1 *)0x0) {
    *unaff_x19 = 0;
  }
  if ((*param_2 & 0xffffffdf) - 0x41 < 0x1a) {
    lVar3 = 1;
    do {
      bVar1 = param_2[lVar3];
      if (bVar1 == 0) {
        return 0;
      }
      if ((9 < (byte)(bVar1 - 0x30) && 0x19 < (byte)((bVar1 & 0xdf) + 0xbf)) &&
         (0x2e < bVar1 || (1L << ((ulong)bVar1 & 0x3f) & 0x680000000000U) == 0))
      goto joined_r0x00788c68;
      lVar3 = lVar3 + 1;
    } while (lVar3 != 0x28);
    bVar1 = param_2[0x28];
joined_r0x00788c68:
    if (bVar1 == 0x3a) {
      param_4 = param_2[lVar3 + 1] != 0x2f & param_4;
      lVar2 = 0;
      if (param_4 == 0) {
        lVar2 = lVar3;
      }
      if ((unaff_x19 != (undefined1 *)0x0) && (param_4 == 0)) {
        func_0x0077e82c();
        unaff_x19[lVar3] = 0;
        lVar2 = lVar3;
      }
      return lVar2;
    }
  }
  return 0;
}

