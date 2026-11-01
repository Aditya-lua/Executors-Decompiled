
undefined8 FUN_005dd3b4(void)

{
  int in_w8;
  undefined8 *unaff_x20;
  undefined8 uVar1;
  char *unaff_x21;
  long lVar2;
  long unaff_x24;
  long lVar3;
  char in_wzr;
  
  if (in_w8 != 0) {
    func_0x007aff64();
  }
  uVar1 = *unaff_x20;
  if (*(long *)(unaff_x24 + 0x20) != 0) {
    lVar2 = *(long *)(unaff_x24 + 0x18);
    lVar3 = *(long *)(unaff_x24 + 0x20) << 3;
    do {
      func_0x005d5ff8(uVar1,&UNK_008b647b,1,lVar2);
      lVar2 = lVar2 + 8;
      lVar3 = lVar3 + -8;
    } while (lVar3 != 0);
  }
  func_0x005d6394(uVar1,unaff_x24 + 0x28);
  if (*unaff_x21 == '\x01') {
    *unaff_x21 = in_wzr;
  }
  else {
    func_0x007b05dc();
  }
  func_0x00187bd4();
  return 0;
}

