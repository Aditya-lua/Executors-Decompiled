
ulong FUN_00741708(int param_1)

{
  bool bVar1;
  int iVar2;
  long lVar3;
  uint uVar4;
  long unaff_x19;
  undefined8 unaff_x20;
  ulong unaff_x21;
  
  if (param_1 != 0) {
    func_0x00767f14();
    uVar4 = 0x1b;
    if ((int)unaff_x21 != 3) {
      uVar4 = 2;
    }
    return (ulong)uVar4;
  }
  *(undefined8 *)(unaff_x19 + 0xd8) = unaff_x20;
  do {
    iVar2 = func_0x007691e0();
    if (iVar2 != 0) {
      uVar4 = 0x1b;
      if (iVar2 != 3) {
        uVar4 = 0x2b;
      }
      unaff_x21 = (ulong)uVar4;
      goto LAB_0074180c;
    }
    iVar2 = func_0x00769368();
    if (iVar2 == 0) {
      lVar3 = func_0x0076aae4();
      bVar1 = lVar3 != 0;
      if (lVar3 != 0) {
        unaff_x21 = (ulong)*(uint *)(lVar3 + 0x10);
      }
    }
    else {
      bVar1 = false;
    }
  } while ((iVar2 == 0) && (!bVar1));
  uVar4 = 0x1b;
  if (iVar2 != 3) {
    uVar4 = 0x2b;
  }
  if (iVar2 != 0) {
    unaff_x21 = (ulong)uVar4;
  }
LAB_0074180c:
  func_0x00768434();
  return unaff_x21;
}

