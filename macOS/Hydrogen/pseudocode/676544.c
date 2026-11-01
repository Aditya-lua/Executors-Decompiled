
void FUN_00676544(void)

{
  ulong uVar1;
  ulong uVar2;
  long lVar3;
  long lVar4;
  ulong uVar5;
  long unaff_x20;
  long unaff_x21;
  ulong uVar6;
  ulong unaff_x22;
  ulong unaff_x23;
  ulong unaff_x24;
  long unaff_x26;
  long unaff_x27;
  ulong in_stack_00000000;
  ulong in_stack_00000008;
  
  *(undefined8 *)(unaff_x20 + 0x18) = 0;
  func_0x006108a0(0x400000000000000);
  lVar3 = func_0x006115d0(0x2000000000000000);
  if ((unaff_x26 == 0) || (lVar3 == 0)) {
    if (unaff_x26 == 0) goto LAB_006765fc;
  }
  else {
    _memcpy(lVar3);
  }
  if (unaff_x21 != 0) {
    lVar4 = unaff_x21 << 3;
    do {
      *(undefined8 *)(unaff_x26 + -8 + lVar4) = 0;
      lVar4 = lVar4 + -8;
    } while (lVar4 != 0);
  }
  func_0x00611644();
  unaff_x27 = *(long *)(unaff_x20 + 0x10);
LAB_006765fc:
  *(long *)(unaff_x20 + 0x18) = lVar3;
  _bzero(lVar3 + unaff_x27 * 8,(0x400000000000000 - unaff_x27) * 8);
  *(undefined8 *)(unaff_x20 + 0x10) = 0x400000000000000;
  *(undefined8 *)(unaff_x20 + 8) = 0x1fffffffffffffff;
  *(ulong *)(lVar3 + 0x1ffffffffffffff8) =
       *(ulong *)(lVar3 + 0x1ffffffffffffff8) | 1L << (unaff_x24 & 0x3f);
  uVar5 = unaff_x23 >> 6;
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
  *(ulong *)(lVar4 + uVar5 * 8) = *(ulong *)(lVar4 + uVar5 * 8) | 1L << (unaff_x23 & 0x3f);
  uVar5 = unaff_x22 >> 6;
  uVar6 = *(ulong *)(unaff_x20 + 0x10);
  if (uVar5 < uVar6) {
    lVar3 = lVar4;
  }
  else {
    uVar1 = uVar5 + 1;
    func_0x006108a0(uVar1);
    lVar3 = func_0x006115d0(uVar1 * 8);
    if (lVar3 != 0) {
      uVar2 = uVar1;
      if (uVar6 <= uVar1) {
        uVar2 = uVar6;
      }
      _memcpy(lVar3,lVar4,uVar2 << 3);
    }
    if (uVar6 != 0) {
      do {
        *(undefined8 *)(lVar4 + -8 + uVar6 * 8) = 0;
        uVar6 = uVar6 - 1;
      } while (uVar6 != 0);
    }
    func_0x00611644(lVar4);
    *(long *)(unaff_x20 + 0x18) = lVar3;
    _bzero(lVar3 + *(long *)(unaff_x20 + 0x10) * 8,(uVar1 - *(long *)(unaff_x20 + 0x10)) * 8);
    *(ulong *)(unaff_x20 + 0x10) = uVar1;
  }
  *(undefined8 *)(unaff_x20 + 8) = 0x1fffffffffffffff;
  *(ulong *)(lVar3 + uVar5 * 8) = *(ulong *)(lVar3 + uVar5 * 8) | 1L << (unaff_x22 & 0x3f);
  uVar5 = in_stack_00000008 >> 6;
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
  *(ulong *)(lVar4 + uVar5 * 8) = *(ulong *)(lVar4 + uVar5 * 8) | 1L << (in_stack_00000008 & 0x3f);
  uVar5 = in_stack_00000000 >> 6;
  uVar6 = *(ulong *)(unaff_x20 + 0x10);
  if (uVar5 < uVar6) {
    lVar3 = lVar4;
  }
  else {
    uVar1 = uVar5 + 1;
    func_0x006108a0(uVar1);
    lVar3 = func_0x006115d0(uVar1 * 8);
    if (lVar3 != 0) {
      uVar2 = uVar1;
      if (uVar6 <= uVar1) {
        uVar2 = uVar6;
      }
      _memcpy(lVar3,lVar4,uVar2 << 3);
    }
    if (uVar6 != 0) {
      do {
        *(undefined8 *)(lVar4 + -8 + uVar6 * 8) = 0;
        uVar6 = uVar6 - 1;
      } while (uVar6 != 0);
    }
    func_0x00611644(lVar4);
    *(long *)(unaff_x20 + 0x18) = lVar3;
    _bzero(lVar3 + *(long *)(unaff_x20 + 0x10) * 8,(uVar1 - *(long *)(unaff_x20 + 0x10)) * 8);
    *(ulong *)(unaff_x20 + 0x10) = uVar1;
  }
  *(undefined8 *)(unaff_x20 + 8) = 0x1fffffffffffffff;
  *(ulong *)(lVar3 + uVar5 * 8) = *(ulong *)(lVar3 + uVar5 * 8) | 1L << (in_stack_00000000 & 0x3f);
  return;
}

