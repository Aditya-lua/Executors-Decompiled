
void FUN_00678544(long param_1,long param_2)

{
  bool bVar1;
  long lVar2;
  ulong uVar3;
  ulong uVar4;
  uint uVar5;
  uint uVar6;
  long lVar7;
  int iVar8;
  ulong *puVar9;
  long lVar10;
  ulong uVar11;
  ulong uVar12;
  uint uVar13;
  int iVar14;
  uint uVar15;
  undefined8 *unaff_x19;
  ulong uVar16;
  long unaff_x20;
  int unaff_w21;
  long unaff_x22;
  long unaff_x23;
  ulong unaff_x24;
  ulong uVar17;
  long unaff_x28;
  
  if (param_2 != 0) {
    if (param_1 != 0) {
      do {
        *(undefined8 *)(param_2 + -8 + param_1 * 8) = 0;
        param_1 = param_1 + -1;
      } while (param_1 != 0);
    }
    func_0x00611644();
  }
  func_0x006108a0();
  if (unaff_w21 == 0) {
    unaff_x19[1] = 0;
    *unaff_x19 = 0;
  }
  else {
    lVar7 = func_0x006115d0(unaff_x23 << 3);
    *(long *)(unaff_x28 + 0x10) = unaff_x23;
    *(long *)(unaff_x28 + 0x18) = lVar7;
    if (lVar7 != 0) {
      _bzero(lVar7,unaff_x23 << 3);
    }
  }
  lVar10 = 0;
  *(undefined8 *)(unaff_x28 + 8) = 0x1fffffffffffffff;
  lVar7 = *(long *)(unaff_x20 + 0x10);
  iVar14 = (int)lVar7;
  iVar8 = iVar14 * -0x40 + 1;
  do {
    if (lVar7 + lVar10 == 0) {
      return;
    }
    lVar2 = lVar10 * 8;
    iVar8 = iVar8 + 0x40;
    lVar10 = lVar10 + -1;
  } while (*(long *)(*(long *)(unaff_x20 + 0x18) + lVar7 * 8 + -8 + lVar2) == 0);
  if (iVar14 + (int)lVar10 != -1) {
    uVar11 = *(ulong *)(*(long *)(unaff_x20 + 0x18) + (ulong)(uint)(iVar14 + (int)lVar10) * 8);
    if (uVar11 == 0) {
      uVar6 = -iVar8;
    }
    else {
      uVar15 = 0;
      uVar13 = 0x40;
      do {
        uVar5 = uVar15 + uVar13 >> 1;
        uVar6 = uVar5;
        if (uVar11 >> ((ulong)uVar5 & 0x3f) != 0) {
          uVar6 = uVar13;
          uVar15 = uVar5;
        }
        uVar13 = uVar6;
      } while (1 < uVar6 - uVar15);
      uVar6 = uVar6 - iVar8;
    }
    if (-1 < (int)uVar6) {
      uVar17 = (unaff_x24 & 0xffffffff) >> 6;
      uVar11 = (ulong)uVar6;
      do {
        func_0x00677bc4();
        uVar16 = uVar11 >> 6;
        if (uVar16 < *(ulong *)(unaff_x20 + 0x10)) {
          uVar12 = *(ulong *)(*(long *)(unaff_x20 + 0x18) + uVar16 * 8) >> (uVar11 & 0x3f) & 1;
        }
        else {
          uVar12 = 0;
        }
        puVar9 = *(ulong **)(unaff_x22 + 0x18);
        *puVar9 = *puVar9 | uVar12;
        if ((uVar17 < *(ulong *)(unaff_x22 + 0x10)) &&
           ((puVar9[uVar17] & 1L << (unaff_x24 & 0x3f)) != 0)) {
          func_0x00677320();
          uVar12 = *(ulong *)(unaff_x28 + 0x10);
          lVar7 = *(long *)(unaff_x28 + 0x18);
          if (uVar12 <= uVar16) {
            uVar3 = uVar16 + 1;
            func_0x006108a0(uVar3);
            lVar10 = func_0x006115d0(uVar3 * 8);
            if ((lVar7 == 0) || (lVar10 == 0)) {
              if (lVar7 != 0) goto LAB_00678758;
            }
            else {
              uVar4 = uVar3;
              if (uVar12 <= uVar3) {
                uVar4 = uVar12;
              }
              _memcpy(lVar10,lVar7,uVar4 << 3);
LAB_00678758:
              if (uVar12 != 0) {
                do {
                  *(undefined8 *)(lVar7 + -8 + uVar12 * 8) = 0;
                  uVar12 = uVar12 - 1;
                } while (uVar12 != 0);
              }
              func_0x00611644(lVar7);
            }
            *(long *)(unaff_x28 + 0x18) = lVar10;
            _bzero(lVar10 + *(long *)(unaff_x28 + 0x10) * 8,
                   (uVar3 - *(long *)(unaff_x28 + 0x10)) * 8);
            lVar7 = *(long *)(unaff_x28 + 0x18);
            *(ulong *)(unaff_x28 + 0x10) = uVar3;
          }
          *(undefined8 *)(unaff_x28 + 8) = 0x1fffffffffffffff;
          *(ulong *)(lVar7 + uVar16 * 8) = *(ulong *)(lVar7 + uVar16 * 8) | 1L << (uVar11 & 0x3f);
        }
        bVar1 = 0 < (long)uVar11;
        uVar11 = uVar11 - 1;
      } while (bVar1);
    }
  }
  return;
}

