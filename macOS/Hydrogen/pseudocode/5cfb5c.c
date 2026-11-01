
ulong FUN_005cfb5c(long *param_1,undefined8 *param_2)

{
  char *pcVar1;
  long lVar2;
  undefined8 uVar3;
  long lVar4;
  long lVar5;
  char in_wzr;
  undefined1 auVar6 [16];
  
  auVar6 = func_0x005ccb98();
  if (((auVar6._0_8_ & 1) == 0) && (*param_1 == 10)) {
    lVar5 = param_1[4];
    pcVar1 = (char *)(lVar5 + 8);
    if (*pcVar1 == '\0') {
      *pcVar1 = '\x01';
      lVar2 = *(long *)(lVar5 + 0x20);
      uVar3 = *param_2;
    }
    else {
      func_0x007aff64(pcVar1,auVar6._8_8_,1000000000);
      lVar2 = *(long *)(lVar5 + 0x20);
      uVar3 = *param_2;
    }
    if (lVar2 != 0) {
      lVar4 = *(long *)(lVar5 + 0x18);
      lVar2 = lVar2 << 3;
      do {
        func_0x005d5ff8(uVar3,&UNK_008b5b7f,1,lVar4);
        lVar4 = lVar4 + 8;
        lVar2 = lVar2 + -8;
      } while (lVar2 != 0);
    }
    func_0x005d6394(uVar3,lVar5 + 0x28);
    if (*pcVar1 == '\x01') {
      *pcVar1 = in_wzr;
    }
    else {
      func_0x007b05dc(pcVar1,0);
    }
  }
  return auVar6._0_8_;
}

