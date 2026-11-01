
long * FUN_00052ac4(ulong param_1)

{
  byte bVar1;
  int iVar2;
  ulong uVar3;
  ulong unaff_x19;
  long unaff_x20;
  long *unaff_x21;
  ulong unaff_x22;
  ulong unaff_x23;
  ulong unaff_x24;
  
  do {
    uVar3 = 0;
    while (*(char *)((long)unaff_x21 + uVar3 + 0x10) == *(char *)(unaff_x20 + uVar3)) {
      uVar3 = uVar3 + 1;
      if (param_1 == uVar3) {
        return unaff_x21;
      }
    }
    while( true ) {
      do {
        while( true ) {
          unaff_x21 = (long *)*unaff_x21;
          if (unaff_x21 == (long *)0x0) {
            return (long *)0x0;
          }
          if (unaff_x21[1] == unaff_x19) break;
          if ((unaff_x21[1] & unaff_x24) != unaff_x22) {
            return (long *)0x0;
          }
        }
        bVar1 = *(byte *)((long)unaff_x21 + 0x27);
        param_1 = (ulong)bVar1;
        uVar3 = unaff_x21[3];
        if (-1 < (char)bVar1) {
          uVar3 = param_1;
        }
      } while (uVar3 != unaff_x23);
      if (-1 < (char)bVar1) break;
      iVar2 = _memcmp(unaff_x21[2]);
      if (iVar2 == 0) {
        return unaff_x21;
      }
    }
    if (bVar1 == 0) {
      return unaff_x21;
    }
  } while( true );
}

