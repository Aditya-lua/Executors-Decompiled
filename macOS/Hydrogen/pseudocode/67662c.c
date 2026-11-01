
void FUN_0067662c(ulong param_1)

{
  ulong uVar1;
  ulong uVar2;
  long lVar3;
  long lVar4;
  long in_x9;
  ulong in_x10;
  ulong uVar5;
  long unaff_x20;
  ulong uVar6;
  ulong unaff_x22;
  ulong unaff_x23;
  long unaff_x25;
  undefined8 unaff_x27;
  ulong in_stack_00000000;
  ulong in_stack_00000008;
  
  *(ulong *)(unaff_x25 + in_x9) = in_x10 | param_1;
  uVar5 = unaff_x23 >> 6;
  uVar6 = *(ulong *)(unaff_x20 + 0x10);
  if (uVar5 < uVar6) {
    lVar3 = unaff_x25;
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
        *(undefined8 *)(unaff_x25 + -8 + uVar6 * 8) = 0;
        uVar6 = uVar6 - 1;
      } while (uVar6 != 0);
    }
    func_0x00611644();
    *(long *)(unaff_x20 + 0x18) = lVar3;
    _bzero(lVar3 + *(long *)(unaff_x20 + 0x10) * 8,(lVar4 - *(long *)(unaff_x20 + 0x10)) * 8);
    *(long *)(unaff_x20 + 0x10) = lVar4;
  }
  *(undefined8 *)(unaff_x20 + 8) = unaff_x27;
  *(ulong *)(lVar3 + uVar5 * 8) = *(ulong *)(lVar3 + uVar5 * 8) | 1L << (unaff_x23 & 0x3f);
  uVar5 = unaff_x22 >> 6;
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
  *(ulong *)(lVar4 + uVar5 * 8) = *(ulong *)(lVar4 + uVar5 * 8) | 1L << (unaff_x22 & 0x3f);
  uVar5 = in_stack_00000008 >> 6;
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
  *(ulong *)(lVar3 + uVar5 * 8) = *(ulong *)(lVar3 + uVar5 * 8) | 1L << (in_stack_00000008 & 0x3f);
  uVar5 = in_stack_00000000 >> 6;
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
  *(ulong *)(lVar4 + uVar5 * 8) = *(ulong *)(lVar4 + uVar5 * 8) | 1L << (in_stack_00000000 & 0x3f);
  return;
}

