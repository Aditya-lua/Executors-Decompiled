
undefined8 FUN_005d09a8(void)

{
  char *pcVar1;
  long unaff_x19;
  long *plVar2;
  char *unaff_x20;
  undefined8 *unaff_x21;
  undefined8 uVar3;
  long lVar4;
  long lVar5;
  long unaff_x25;
  long lVar6;
  char in_wzr;
  undefined1 auVar7 [16];
  
  func_0x007a1f18(8,0x10);
  func_0x007aff64();
  uVar3 = *unaff_x21;
  if (*(long *)(unaff_x25 + 0x20) != 0) {
    lVar4 = *(long *)(unaff_x25 + 0x18);
    lVar6 = *(long *)(unaff_x25 + 0x20) << 3;
    do {
      func_0x005d5ff8(uVar3,&UNK_008b5b7f,1,lVar4);
      lVar4 = lVar4 + 8;
      lVar6 = lVar6 + -8;
    } while (lVar6 != 0);
  }
  func_0x005d6394(uVar3,unaff_x25 + 0x28);
  if (*unaff_x20 == '\x01') {
    *unaff_x20 = in_wzr;
  }
  else {
    func_0x007b05dc();
  }
  plVar2 = *(long **)(unaff_x19 + 8);
  auVar7 = func_0x005ccb98(plVar2);
  if ((auVar7._0_8_ & 1) == 0) {
    if (*plVar2 == 10) {
      lVar4 = plVar2[4];
      pcVar1 = (char *)(lVar4 + 8);
      if (*pcVar1 == '\0') {
        *pcVar1 = '\x01';
      }
      else {
        func_0x007aff64(pcVar1,auVar7._8_8_,1000000000);
      }
      uVar3 = *unaff_x21;
      if (*(long *)(lVar4 + 0x20) != 0) {
        lVar6 = *(long *)(lVar4 + 0x18);
        lVar5 = *(long *)(lVar4 + 0x20) << 3;
        do {
          func_0x005d5ff8(uVar3,&UNK_008b5b7f,1,lVar6);
          lVar6 = lVar6 + 8;
          lVar5 = lVar5 + -8;
        } while (lVar5 != 0);
      }
      func_0x005d6394(uVar3,lVar4 + 0x28);
      if (*pcVar1 == '\x01') {
        *pcVar1 = in_wzr;
      }
      else {
        func_0x007b05dc(pcVar1,0);
      }
    }
    uVar3 = 0;
  }
  else {
    uVar3 = 1;
  }
  func_0x00187bd4();
  return uVar3;
}

