
long FUN_00426120(void)

{
  long lVar1;
  long lVar2;
  char acStack_88 [8];
  short *psStack_80;
  long lStack_78;
  undefined1 auStack_50 [16];
  undefined1 uStack_40;
  undefined2 uStack_18;
  undefined1 uStack_16;
  
  auStack_50 = func_0x007a28b0();
  if (auStack_50._8_8_ == 0) {
    uStack_16 = false;
  }
  else {
    uStack_16 = *auStack_50._0_8_ == '/';
  }
  uStack_40 = 6;
  uStack_18 = 0x200;
  func_0x004248f4(acStack_88,auStack_50);
  if ((acStack_88[0] == '\t') && ((lStack_78 != 2 || (*psStack_80 != 0x2e2e)))) {
    do {
      lVar2 = lStack_78;
      if ((short *)((long)psStack_80 + lVar2) == psStack_80) goto LAB_0042619c;
      lStack_78 = lVar2 + -1;
    } while (*(char *)((long)psStack_80 + lVar2 + -1) != '.');
    lVar1 = 0;
    if (lVar2 + -1 != 0) {
      lVar1 = (long)psStack_80 + lVar2;
    }
  }
  else {
LAB_0042619c:
    lVar1 = 0;
  }
  return lVar1;
}

