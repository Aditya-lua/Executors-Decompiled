
void FUN_005fff7c(void)

{
  ulong uVar1;
  long lVar2;
  ulong unaff_x19;
  ulong unaff_x20;
  long unaff_x21;
  ulong unaff_x22;
  long lVar3;
  ulong unaff_x25;
  
  if (unaff_x22 <= unaff_x25) goto LAB_005ffffc;
  lVar3 = *(long *)(unaff_x21 + 0x20);
  func_0x006108a0();
  lVar2 = func_0x006115d0(unaff_x22 << 3);
  if ((lVar3 == 0) || (lVar2 == 0)) {
    if (lVar3 != 0) goto LAB_005fffc4;
  }
  else {
    uVar1 = unaff_x22;
    if (unaff_x25 <= unaff_x22) {
      uVar1 = unaff_x25;
    }
    _memcpy(lVar2,lVar3,uVar1 << 3);
LAB_005fffc4:
    if (unaff_x25 != 0) {
      do {
        *(undefined8 *)(lVar3 + -8 + unaff_x25 * 8) = 0;
        unaff_x25 = unaff_x25 - 1;
      } while (unaff_x25 != 0);
    }
    func_0x00611644(lVar3);
  }
  *(long *)(unaff_x21 + 0x20) = lVar2;
  _bzero(lVar2 + *(long *)(unaff_x21 + 0x18) * 8,(unaff_x22 - *(long *)(unaff_x21 + 0x18)) * 8);
  *(ulong *)(unaff_x21 + 0x18) = unaff_x22;
LAB_005ffffc:
  *(undefined8 *)(unaff_x21 + 0x10) = 0x1fffffffffffffff;
  lVar2 = (unaff_x20 & 7) << 3;
  *(ulong *)(*(long *)(unaff_x21 + 0x20) + (unaff_x20 & 0xfffffffffffffff8)) =
       *(ulong *)(*(long *)(unaff_x21 + 0x20) + (unaff_x20 & 0xfffffffffffffff8)) &
       (0xffL << lVar2 ^ 0xffffffffffffffffU) | (unaff_x19 & 0xffffffff) << lVar2;
  return;
}

