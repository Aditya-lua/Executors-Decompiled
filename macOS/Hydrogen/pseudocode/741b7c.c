
undefined4 * FUN_00741b7c(long param_1)

{
  int iVar1;
  long lVar2;
  undefined4 *unaff_x19;
  long unaff_x20;
  
  *(long *)(unaff_x19 + 0x28e) = param_1;
  if (param_1 != 0) {
    if (*(long *)(unaff_x19 + 0x230) != 0) {
      func_0x0072772c();
    }
    if (*(long *)(unaff_x20 + 0xa30) != 0) {
      lVar2 = func_0x0075085c();
      *(long *)(unaff_x19 + 0x28c) = lVar2;
      if (lVar2 == 0) goto LAB_00741a20;
      if (*(long *)(unaff_x19 + 0x232) != 0) {
        func_0x00751194();
      }
      func_0x0075149c();
    }
    iVar1 = func_0x00728998();
    if (iVar1 == 0) {
      func_0x0075e3e8(unaff_x19 + 0x480,0);
      func_0x0074cf44();
      *unaff_x19 = 0xc0dedbad;
      return unaff_x19;
    }
  }
LAB_00741a20:
  (*pcRam0000000000a2b5f0)(*(undefined8 *)(unaff_x19 + 0x28a));
  func_0x00740678(unaff_x19 + 0x304);
  func_0x00727a24(unaff_x19 + 0x28e);
  func_0x007508a4(unaff_x19 + 0x28c);
  func_0x00784314();
  (*pcRam0000000000a2b5f0)();
  return (undefined4 *)0x0;
}

