
undefined8 FUN_0076855c(void)

{
  int iVar1;
  long lVar2;
  long lVar3;
  undefined8 uVar4;
  long unaff_x19;
  long unaff_x20;
  int unaff_w21;
  long in_stack_00000008;
  
  *(undefined8 *)(unaff_x20 + 0xc0) = 0;
  *(undefined4 *)(unaff_x20 + 200) = 0;
  func_0x0074bdf8(&UNK_00001348 + unaff_x20);
  *(undefined4 *)(unaff_x20 + 0x60) = 0x10;
  func_0x007688a8();
  if (*(long *)(unaff_x20 + 0x18) != 0) {
    func_0x0075e5fc(unaff_x20 + 0x40);
  }
  *(undefined8 *)(unaff_x20 + 0x18) = 0;
  if (((((*(byte *)(unaff_x20 + 0xa1a) & 1) != 0) && (*(long *)(unaff_x20 + 0xd8) == 0)) &&
      (iVar1 = func_0x00734f0c(), iVar1 != -1)) && (in_stack_00000008 != 0)) {
    func_0x00732ed0();
  }
  if (*(long *)(unaff_x20 + 0xc00) != -1) {
    func_0x00734798();
  }
  lVar2 = func_0x00740a58(unaff_x19 + 0x10);
  if (lVar2 != 0) {
    do {
      lVar3 = func_0x00156654(lVar2);
      if (*(long *)(lVar3 + 0x28) == unaff_x20) {
        func_0x0075e5fc(lVar2);
        break;
      }
      lVar2 = func_0x006f4058();
    } while (lVar2 != 0);
  }
  *(undefined8 *)(unaff_x20 + 0xd0) = 0;
  *(undefined8 *)(unaff_x20 + 0x10) = 0xffffffffffffffff;
  *(int *)(unaff_x19 + 4) = *(int *)(unaff_x19 + 4) + -1;
  func_0x00768960();
  if ((unaff_w21 == 0) || (uVar4 = func_0x007681c0(), (int)uVar4 == 0)) {
    return 0;
  }
  return uVar4;
}

