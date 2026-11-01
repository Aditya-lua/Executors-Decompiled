
void FUN_0067613c(void)

{
  long lVar1;
  long lVar2;
  long lVar3;
  long unaff_x19;
  ulong unaff_x20;
  long unaff_x21;
  ulong unaff_x22;
  long unaff_x23;
  ulong uVar4;
  
  _bzero(unaff_x21 + 8,unaff_x23 + -8);
  uVar4 = unaff_x20 >> 6;
  if (uVar4 < unaff_x22) {
    lVar2 = unaff_x21;
    goto LAB_006761dc;
  }
  lVar1 = uVar4 + 1;
  func_0x006108a0(lVar1);
  lVar2 = func_0x006115d0(lVar1 * 8);
  if ((unaff_x21 == 0) || (lVar2 == 0)) {
    if (unaff_x21 != 0) goto LAB_006761a0;
  }
  else {
    _memcpy(lVar2);
LAB_006761a0:
    if (unaff_x22 != 0) {
      lVar3 = unaff_x22 << 3;
      do {
        *(undefined8 *)(unaff_x21 + -8 + lVar3) = 0;
        lVar3 = lVar3 + -8;
      } while (lVar3 != 0);
    }
    func_0x00611644();
    unaff_x22 = *(ulong *)(unaff_x19 + 0x10);
  }
  *(long *)(unaff_x19 + 0x18) = lVar2;
  _bzero(lVar2 + unaff_x22 * 8,(lVar1 - unaff_x22) * 8);
  *(long *)(unaff_x19 + 0x10) = lVar1;
LAB_006761dc:
  *(undefined8 *)(unaff_x19 + 8) = 0x1fffffffffffffff;
  *(ulong *)(lVar2 + uVar4 * 8) = *(ulong *)(lVar2 + uVar4 * 8) | 1L << (unaff_x20 & 0x3f);
  return;
}

