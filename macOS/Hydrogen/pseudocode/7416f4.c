
ulong FUN_007416f4(void)

{
  bool bVar1;
  int iVar2;
  ulong uVar3;
  long lVar4;
  uint uVar5;
  long unaff_x19;
  undefined8 unaff_x20;
  
  *(undefined8 *)(unaff_x19 + 0xd8) = 0;
  uVar3 = func_0x00767d80();
  if ((int)uVar3 != 0) {
    func_0x00767f14();
    uVar5 = 0x1b;
    if ((int)uVar3 != 3) {
      uVar5 = 2;
    }
    return (ulong)uVar5;
  }
  *(undefined8 *)(unaff_x19 + 0xd8) = unaff_x20;
  do {
    iVar2 = func_0x007691e0();
    if (iVar2 != 0) {
      uVar5 = 0x1b;
      if (iVar2 != 3) {
        uVar5 = 0x2b;
      }
      uVar3 = (ulong)uVar5;
      goto LAB_0074180c;
    }
    iVar2 = func_0x00769368();
    if (iVar2 == 0) {
      lVar4 = func_0x0076aae4();
      bVar1 = lVar4 != 0;
      if (lVar4 != 0) {
        uVar3 = (ulong)*(uint *)(lVar4 + 0x10);
      }
    }
    else {
      bVar1 = false;
    }
  } while ((iVar2 == 0) && (!bVar1));
  uVar5 = 0x1b;
  if (iVar2 != 3) {
    uVar5 = 0x2b;
  }
  if (iVar2 != 0) {
    uVar3 = (ulong)uVar5;
  }
LAB_0074180c:
  func_0x00768434();
  return uVar3;
}

