
void FUN_00676694(void)

{
  ulong uVar1;
  ulong uVar2;
  long lVar3;
  long lVar4;
  long unaff_x19;
  ulong uVar5;
  long unaff_x20;
  ulong unaff_x22;
  ulong unaff_x23;
  long unaff_x24;
  long unaff_x26;
  ulong uVar6;
  undefined8 unaff_x27;
  ulong in_stack_00000000;
  ulong in_stack_00000008;
  
  func_0x00611644();
  *(long *)(unaff_x20 + 0x18) = unaff_x24;
  _bzero(unaff_x24 + *(long *)(unaff_x20 + 0x10) * 8,(unaff_x26 - *(long *)(unaff_x20 + 0x10)) * 8);
  *(long *)(unaff_x20 + 0x10) = unaff_x26;
  *(undefined8 *)(unaff_x20 + 8) = unaff_x27;
  *(ulong *)(unaff_x24 + unaff_x19 * 8) =
       *(ulong *)(unaff_x24 + unaff_x19 * 8) | 1L << (unaff_x23 & 0x3f);
  uVar6 = unaff_x22 >> 6;
  uVar5 = *(ulong *)(unaff_x20 + 0x10);
  if (uVar6 < uVar5) {
    lVar4 = unaff_x24;
  }
  else {
    lVar3 = uVar6 + 1;
    func_0x006108a0(lVar3);
    lVar4 = func_0x006115d0(lVar3 * 8);
    if (lVar4 != 0) {
      _memcpy(lVar4);
    }
    if (uVar5 != 0) {
      do {
        *(undefined8 *)(unaff_x24 + -8 + uVar5 * 8) = 0;
        uVar5 = uVar5 - 1;
      } while (uVar5 != 0);
    }
    func_0x00611644();
    *(long *)(unaff_x20 + 0x18) = lVar4;
    _bzero(lVar4 + *(long *)(unaff_x20 + 0x10) * 8,(lVar3 - *(long *)(unaff_x20 + 0x10)) * 8);
    *(long *)(unaff_x20 + 0x10) = lVar3;
  }
  *(undefined8 *)(unaff_x20 + 8) = 0x1fffffffffffffff;
  *(ulong *)(lVar4 + uVar6 * 8) = *(ulong *)(lVar4 + uVar6 * 8) | 1L << (unaff_x22 & 0x3f);
  uVar6 = in_stack_00000008 >> 6;
  uVar5 = *(ulong *)(unaff_x20 + 0x10);
  if (uVar6 < uVar5) {
    lVar3 = lVar4;
  }
  else {
    uVar1 = uVar6 + 1;
    func_0x006108a0(uVar1);
    lVar3 = func_0x006115d0(uVar1 * 8);
    if (lVar3 != 0) {
      uVar2 = uVar1;
      if (uVar5 <= uVar1) {
        uVar2 = uVar5;
      }
      _memcpy(lVar3,lVar4,uVar2 << 3);
    }
    if (uVar5 != 0) {
      do {
        *(undefined8 *)(lVar4 + -8 + uVar5 * 8) = 0;
        uVar5 = uVar5 - 1;
      } while (uVar5 != 0);
    }
    func_0x00611644(lVar4);
    *(long *)(unaff_x20 + 0x18) = lVar3;
    _bzero(lVar3 + *(long *)(unaff_x20 + 0x10) * 8,(uVar1 - *(long *)(unaff_x20 + 0x10)) * 8);
    *(ulong *)(unaff_x20 + 0x10) = uVar1;
  }
  *(undefined8 *)(unaff_x20 + 8) = 0x1fffffffffffffff;
  *(ulong *)(lVar3 + uVar6 * 8) = *(ulong *)(lVar3 + uVar6 * 8) | 1L << (in_stack_00000008 & 0x3f);
  uVar6 = in_stack_00000000 >> 6;
  uVar5 = *(ulong *)(unaff_x20 + 0x10);
  if (uVar6 < uVar5) {
    lVar4 = lVar3;
  }
  else {
    uVar1 = uVar6 + 1;
    func_0x006108a0(uVar1);
    lVar4 = func_0x006115d0(uVar1 * 8);
    if (lVar4 != 0) {
      uVar2 = uVar1;
      if (uVar5 <= uVar1) {
        uVar2 = uVar5;
      }
      _memcpy(lVar4,lVar3,uVar2 << 3);
    }
    if (uVar5 != 0) {
      do {
        *(undefined8 *)(lVar3 + -8 + uVar5 * 8) = 0;
        uVar5 = uVar5 - 1;
      } while (uVar5 != 0);
    }
    func_0x00611644(lVar3);
    *(long *)(unaff_x20 + 0x18) = lVar4;
    _bzero(lVar4 + *(long *)(unaff_x20 + 0x10) * 8,(uVar1 - *(long *)(unaff_x20 + 0x10)) * 8);
    *(ulong *)(unaff_x20 + 0x10) = uVar1;
  }
  *(undefined8 *)(unaff_x20 + 8) = 0x1fffffffffffffff;
  *(ulong *)(lVar4 + uVar6 * 8) = *(ulong *)(lVar4 + uVar6 * 8) | 1L << (in_stack_00000000 & 0x3f);
  return;
}

