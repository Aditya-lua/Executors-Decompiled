
void FUN_006084ec(ulong param_1)

{
  long lVar1;
  long lVar2;
  long unaff_x20;
  long unaff_x21;
  ulong unaff_x24;
  long lVar3;
  
  lVar3 = 1L << (param_1 & 0x3f);
  lVar2 = *(long *)(unaff_x21 + 0x18);
  lVar1 = *(long *)(unaff_x21 + 0x20);
  if (lVar2 != lVar3) {
    if (lVar1 != 0) {
      if (lVar2 != 0) {
        do {
          *(undefined8 *)(lVar1 + -8 + lVar2 * 8) = 0;
          lVar2 = lVar2 + -1;
        } while (lVar2 != 0);
      }
      func_0x00611644();
    }
    func_0x006108a0(lVar3);
    if (lVar3 == 0) {
      *(long *)(unaff_x21 + 0x18) = 0;
      *(undefined8 *)(unaff_x21 + 0x20) = 0;
      goto LAB_0060854c;
    }
    lVar1 = func_0x006115d0(lVar3 << 3);
  }
  *(long *)(unaff_x21 + 0x18) = lVar3;
  *(long *)(unaff_x21 + 0x20) = lVar1;
  if (lVar1 != 0) {
    _bzero(lVar1,lVar3 << 3);
  }
LAB_0060854c:
  *(undefined8 *)(unaff_x21 + 0x10) = 0x1fffffffffffffff;
  *(undefined4 *)(unaff_x21 + 0x28) = 0;
  func_0x006108a0();
  if (unaff_x24 == 0) {
    lVar2 = 0;
  }
  else {
    lVar2 = func_0x006115d0(unaff_x24 << 3);
  }
  func_0x005fc218(*(undefined8 *)(unaff_x21 + 0x20),lVar2,*(undefined8 *)(unaff_x20 + 0x20));
  if (0x1ffffffffffffffe < unaff_x24) {
    unaff_x24 = 0x1fffffffffffffff;
  }
  if (lVar2 != 0) {
    if (unaff_x24 != 0) {
      do {
        *(undefined8 *)(lVar2 + -8 + unaff_x24 * 8) = 0;
        unaff_x24 = unaff_x24 - 1;
      } while (unaff_x24 != 0);
    }
    func_0x00611644(lVar2);
  }
  return;
}

