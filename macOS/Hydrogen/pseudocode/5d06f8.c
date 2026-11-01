
ulong FUN_005d06f8(ulong param_1,undefined8 param_2)

{
  char *pcVar1;
  long lVar2;
  long *unaff_x19;
  undefined8 *unaff_x21;
  undefined8 uVar3;
  long lVar4;
  long lVar5;
  char in_wzr;
  
  if (((param_1 & 1) == 0) && (*unaff_x19 == 10)) {
    lVar5 = unaff_x19[4];
    pcVar1 = (char *)(lVar5 + 8);
    if (*pcVar1 == '\0') {
      *pcVar1 = '\x01';
      lVar2 = *(long *)(lVar5 + 0x20);
      uVar3 = *unaff_x21;
    }
    else {
      func_0x007aff64(pcVar1,param_2,1000000000);
      lVar2 = *(long *)(lVar5 + 0x20);
      uVar3 = *unaff_x21;
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
  return param_1;
}

