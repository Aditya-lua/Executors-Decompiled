
void FUN_006762ec(void)

{
  ulong uVar1;
  ulong uVar2;
  long lVar3;
  long lVar4;
  ulong unaff_x19;
  long unaff_x20;
  ulong unaff_x21;
  ulong unaff_x22;
  long unaff_x23;
  long unaff_x24;
  long unaff_x25;
  long unaff_x26;
  ulong uVar5;
  long unaff_x27;
  ulong uVar6;
  long unaff_x28;
  
  if (unaff_x23 == 0) {
    if (unaff_x24 == 0) goto LAB_00676334;
  }
  else {
    _memcpy();
  }
  if (unaff_x28 != 0) {
    lVar4 = unaff_x28 << 3;
    do {
      *(undefined8 *)(unaff_x24 + -8 + lVar4) = 0;
      lVar4 = lVar4 + -8;
    } while (lVar4 != 0);
  }
  func_0x00611644();
  unaff_x25 = *(long *)(unaff_x20 + 0x10);
LAB_00676334:
  *(long *)(unaff_x20 + 0x18) = unaff_x23;
  _bzero(unaff_x23 + unaff_x25 * 8,(unaff_x26 - unaff_x25) * 8);
  *(long *)(unaff_x20 + 0x10) = unaff_x26;
  *(undefined8 *)(unaff_x20 + 8) = 0x1fffffffffffffff;
  *(ulong *)(unaff_x23 + unaff_x27 * 8) =
       *(ulong *)(unaff_x23 + unaff_x27 * 8) | 1L << (unaff_x22 & 0x3f);
  uVar5 = unaff_x21 >> 6;
  uVar6 = *(ulong *)(unaff_x20 + 0x10);
  if (uVar5 < uVar6) {
    lVar3 = unaff_x23;
  }
  else {
    lVar4 = uVar5 + 1;
    func_0x006108a0(lVar4);
    lVar3 = func_0x006115d0(lVar4 * 8);
    if (lVar3 != 0) {
      _memcpy(lVar3);
    }
    if (uVar6 != 0) {
      do {
        *(undefined8 *)(unaff_x23 + -8 + uVar6 * 8) = 0;
        uVar6 = uVar6 - 1;
      } while (uVar6 != 0);
    }
    func_0x00611644();
    *(long *)(unaff_x20 + 0x18) = lVar3;
    _bzero(lVar3 + *(long *)(unaff_x20 + 0x10) * 8,(lVar4 - *(long *)(unaff_x20 + 0x10)) * 8);
    *(long *)(unaff_x20 + 0x10) = lVar4;
  }
  *(undefined8 *)(unaff_x20 + 8) = 0x1fffffffffffffff;
  *(ulong *)(lVar3 + uVar5 * 8) = *(ulong *)(lVar3 + uVar5 * 8) | 1L << (unaff_x21 & 0x3f);
  uVar5 = unaff_x19 >> 6;
  uVar6 = *(ulong *)(unaff_x20 + 0x10);
  if (uVar5 < uVar6) {
    lVar4 = lVar3;
  }
  else {
    uVar1 = uVar5 + 1;
    func_0x006108a0(uVar1);
    lVar4 = func_0x006115d0(uVar1 * 8);
    if (lVar4 != 0) {
      uVar2 = uVar1;
      if (uVar6 <= uVar1) {
        uVar2 = uVar6;
      }
      _memcpy(lVar4,lVar3,uVar2 << 3);
    }
    if (uVar6 != 0) {
      do {
        *(undefined8 *)(lVar3 + -8 + uVar6 * 8) = 0;
        uVar6 = uVar6 - 1;
      } while (uVar6 != 0);
    }
    func_0x00611644(lVar3);
    *(long *)(unaff_x20 + 0x18) = lVar4;
    _bzero(lVar4 + *(long *)(unaff_x20 + 0x10) * 8,(uVar1 - *(long *)(unaff_x20 + 0x10)) * 8);
    *(ulong *)(unaff_x20 + 0x10) = uVar1;
  }
  *(undefined8 *)(unaff_x20 + 8) = 0x1fffffffffffffff;
  *(ulong *)(lVar4 + uVar5 * 8) = *(ulong *)(lVar4 + uVar5 * 8) | 1L << (unaff_x19 & 0x3f);
  return;
}

