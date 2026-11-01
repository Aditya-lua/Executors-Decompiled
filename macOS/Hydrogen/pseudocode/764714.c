
undefined8 FUN_00764714(undefined8 param_1)

{
  long lVar1;
  undefined8 uVar2;
  long unaff_x29;
  long lStack0000000000000008;
  undefined1 uStack0000000000000010;
  
  lStack0000000000000008 = unaff_x29 + 0x10;
  *(undefined1 **)(unaff_x29 + -0x20) = &uStack0000000000000010;
  func_0x0074066c(&uStack0000000000000010,&UNK_007a1200);
  *(undefined1 *)(unaff_x29 + -0x18) = 0;
  func_0x00763b00(unaff_x29 + -0x20,&DAT_007645e4,param_1,unaff_x29 + 0x10);
  if (*(char *)(unaff_x29 + -0x18) != '\0') {
    func_0x00740678();
    return 0;
  }
  lVar1 = func_0x00156654(*(undefined8 *)(unaff_x29 + -0x20));
  if (lVar1 == 0) {
    uVar2 = (*pcRam0000000000a2b600)("");
    return uVar2;
  }
  uVar2 = func_0x00740a58(*(undefined8 *)(unaff_x29 + -0x20));
  return uVar2;
}

