
void FUN_00686b20(void)

{
  long lVar1;
  undefined8 uVar2;
  long lVar3;
  long unaff_x19;
  long unaff_x20;
  
  *(undefined8 *)(unaff_x19 + 0x20) = 0xffffffffffffffff;
  lVar3 = *(long *)(unaff_x19 + 0x48);
  lVar1 = *(long *)(unaff_x19 + 0x50);
  if (lVar3 == unaff_x20) {
    *(long *)(unaff_x19 + 0x48) = unaff_x20;
    *(long *)(unaff_x19 + 0x50) = lVar1;
    *(undefined8 *)(unaff_x19 + 0x40) = 0xffffffffffffffff;
    return;
  }
  if (lVar1 != 0) {
    if (lVar3 != 0) {
      do {
        *(undefined1 *)(lVar1 + -1 + lVar3) = 0;
        lVar3 = lVar3 + -1;
      } while (lVar3 != 0);
    }
    func_0x00611644();
  }
  if ((int)unaff_x20 == 0) {
    *(long *)(unaff_x19 + 0x48) = unaff_x20;
    *(undefined8 *)(unaff_x19 + 0x50) = 0;
    *(undefined8 *)(unaff_x19 + 0x40) = 0xffffffffffffffff;
    return;
  }
  uVar2 = func_0x006115d0();
  *(long *)(unaff_x19 + 0x48) = unaff_x20;
  *(undefined8 *)(unaff_x19 + 0x50) = uVar2;
  *(undefined8 *)(unaff_x19 + 0x40) = 0xffffffffffffffff;
  return;
}

