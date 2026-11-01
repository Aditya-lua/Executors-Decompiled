
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_005ca5d8(void)

{
  undefined8 uVar1;
  ulong uVar2;
  long *unaff_x19;
  long *unaff_x20;
  undefined8 *unaff_x21;
  long *unaff_x22;
  long unaff_x24;
  long unaff_x25;
  long lVar3;
  
  do {
    uVar2 = func_0x005d7e94();
    unaff_x22 = unaff_x22 + 0x10;
    unaff_x25 = unaff_x25 + -0x80;
    if ((uVar2 & 1) != 0) break;
    if (unaff_x25 == 0) {
      *(undefined1 *)(unaff_x21 + 2) = 1;
      uVar1 = _UNK_0089eb10;
      unaff_x21[1] = _UNK_0089eb18;
      *unaff_x21 = uVar1;
      for (; unaff_x24 != 0; unaff_x24 = unaff_x24 + -1) {
        if (*unaff_x19 != 0xc) {
          func_0x0059ce88(unaff_x19);
        }
        func_0x0059ce88(unaff_x19 + 8);
        unaff_x19 = unaff_x19 + 0x10;
      }
      if (*unaff_x20 == 0) {
        return;
      }
      func_0x00187bd4();
      return;
    }
  } while ((*unaff_x22 == 0xc) || (uVar2 = func_0x005d7e94(uVar2,unaff_x22), (uVar2 & 1) == 0));
  lVar3 = *unaff_x20;
  unaff_x21[2] = unaff_x20[1];
  unaff_x21[1] = lVar3;
  unaff_x21[3] = unaff_x20[2];
  *unaff_x21 = 5;
  return;
}

