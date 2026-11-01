
void FUN_006762ac(void)

{
  ulong uVar1;
  ulong uVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  ulong unaff_x19;
  long unaff_x20;
  ulong unaff_x21;
  ulong unaff_x22;
  long unaff_x23;
  long unaff_x24;
  ulong unaff_x25;
  ulong uVar6;
  ulong uVar7;
  
  _bzero(unaff_x24 + 8,unaff_x23 + -8);
  uVar7 = unaff_x22 >> 6;
  if (uVar7 < unaff_x25) {
    lVar4 = unaff_x24;
    goto LAB_0067634c;
  }
  lVar3 = uVar7 + 1;
  func_0x006108a0(lVar3);
  lVar4 = func_0x006115d0(lVar3 * 8);
  if ((unaff_x24 == 0) || (lVar4 == 0)) {
    if (unaff_x24 != 0) goto LAB_00676310;
  }
  else {
    _memcpy(lVar4);
LAB_00676310:
    if (unaff_x25 != 0) {
      lVar5 = unaff_x25 << 3;
      do {
        *(undefined8 *)(unaff_x24 + -8 + lVar5) = 0;
        lVar5 = lVar5 + -8;
      } while (lVar5 != 0);
    }
    func_0x00611644();
    unaff_x25 = *(ulong *)(unaff_x20 + 0x10);
  }
  *(long *)(unaff_x20 + 0x18) = lVar4;
  _bzero(lVar4 + unaff_x25 * 8,(lVar3 - unaff_x25) * 8);
  *(long *)(unaff_x20 + 0x10) = lVar3;
LAB_0067634c:
  *(undefined8 *)(unaff_x20 + 8) = 0x1fffffffffffffff;
  *(ulong *)(lVar4 + uVar7 * 8) = *(ulong *)(lVar4 + uVar7 * 8) | 1L << (unaff_x22 & 0x3f);
  uVar6 = unaff_x21 >> 6;
  uVar7 = *(ulong *)(unaff_x20 + 0x10);
  if (uVar6 < uVar7) {
    lVar3 = lVar4;
  }
  else {
    uVar1 = uVar6 + 1;
    func_0x006108a0(uVar1);
    lVar3 = func_0x006115d0(uVar1 * 8);
    if (lVar3 != 0) {
      uVar2 = uVar1;
      if (uVar7 <= uVar1) {
        uVar2 = uVar7;
      }
      _memcpy(lVar3,lVar4,uVar2 << 3);
    }
    if (uVar7 != 0) {
      do {
        *(undefined8 *)(lVar4 + -8 + uVar7 * 8) = 0;
        uVar7 = uVar7 - 1;
      } while (uVar7 != 0);
    }
    func_0x00611644(lVar4);
    *(long *)(unaff_x20 + 0x18) = lVar3;
    _bzero(lVar3 + *(long *)(unaff_x20 + 0x10) * 8,(uVar1 - *(long *)(unaff_x20 + 0x10)) * 8);
    *(ulong *)(unaff_x20 + 0x10) = uVar1;
  }
  *(undefined8 *)(unaff_x20 + 8) = 0x1fffffffffffffff;
  *(ulong *)(lVar3 + uVar6 * 8) = *(ulong *)(lVar3 + uVar6 * 8) | 1L << (unaff_x21 & 0x3f);
  uVar6 = unaff_x19 >> 6;
  uVar7 = *(ulong *)(unaff_x20 + 0x10);
  if (uVar6 < uVar7) {
    lVar4 = lVar3;
  }
  else {
    uVar1 = uVar6 + 1;
    func_0x006108a0(uVar1);
    lVar4 = func_0x006115d0(uVar1 * 8);
    if (lVar4 != 0) {
      uVar2 = uVar1;
      if (uVar7 <= uVar1) {
        uVar2 = uVar7;
      }
      _memcpy(lVar4,lVar3,uVar2 << 3);
    }
    if (uVar7 != 0) {
      do {
        *(undefined8 *)(lVar3 + -8 + uVar7 * 8) = 0;
        uVar7 = uVar7 - 1;
      } while (uVar7 != 0);
    }
    func_0x00611644(lVar3);
    *(long *)(unaff_x20 + 0x18) = lVar4;
    _bzero(lVar4 + *(long *)(unaff_x20 + 0x10) * 8,(uVar1 - *(long *)(unaff_x20 + 0x10)) * 8);
    *(ulong *)(unaff_x20 + 0x10) = uVar1;
  }
  *(undefined8 *)(unaff_x20 + 8) = 0x1fffffffffffffff;
  *(ulong *)(lVar4 + uVar6 * 8) = *(ulong *)(lVar4 + uVar6 * 8) | 1L << (unaff_x19 & 0x3f);
  return;
}

