
void FUN_00677c00(long param_1)

{
  long lVar1;
  long lVar2;
  ulong uVar3;
  long lVar4;
  ulong uVar5;
  long unaff_x19;
  long unaff_x20;
  long lVar6;
  int unaff_w25;
  
  uVar3 = 0;
  do {
    uVar5 = *(ulong *)(unaff_x20 + param_1 * 8);
    *(ulong *)(unaff_x20 + param_1 * 8) = uVar3 | uVar5 << 1;
    uVar3 = uVar5 >> 0x3f;
    param_1 = param_1 + 1;
  } while (unaff_w25 != (int)param_1);
  if (-1 < (long)uVar5) {
    return;
  }
  lVar6 = *(long *)(unaff_x19 + 0x10);
  lVar1 = lVar6 + 1;
  if (lVar6 == -1) {
    lVar6 = -2;
    lVar2 = unaff_x20;
    goto LAB_00677edc;
  }
  func_0x006108a0(lVar1);
  lVar2 = func_0x006115d0(lVar1 * 8);
  if ((unaff_x20 == 0) || (lVar2 == 0)) {
    if (unaff_x20 != 0) goto LAB_00677eb8;
  }
  else {
    _memcpy(lVar2);
LAB_00677eb8:
    if (lVar6 != 0) {
      lVar4 = lVar6;
      do {
        *(undefined8 *)(unaff_x20 + -8 + lVar4 * 8) = 0;
        lVar4 = lVar4 + -1;
      } while (lVar4 != 0);
    }
    func_0x00611644();
  }
  *(long *)(unaff_x19 + 0x10) = lVar1;
  *(long *)(unaff_x19 + 0x18) = lVar2;
LAB_00677edc:
  *(undefined8 *)(unaff_x19 + 8) = 0x1fffffffffffffff;
  *(undefined8 *)(lVar2 + lVar6 * 8) = 1;
  return;
}

