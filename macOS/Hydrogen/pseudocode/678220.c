
void FUN_00678220(void)

{
  bool bVar1;
  long lVar2;
  long lVar3;
  ulong uVar4;
  ulong uVar5;
  uint uVar6;
  int in_w8;
  ulong *puVar7;
  int iVar8;
  ulong in_x9;
  ulong uVar9;
  long lVar10;
  ulong uVar11;
  uint uVar12;
  uint uVar13;
  int iVar14;
  long in_x10;
  uint uVar15;
  int iVar16;
  long lVar17;
  uint uVar18;
  long lVar19;
  long lVar20;
  uint uVar21;
  long unaff_x20;
  long unaff_x22;
  ulong uVar22;
  long unaff_x25;
  long unaff_x28;
  
  uVar9 = *(ulong *)(in_x10 + (in_x9 & 0xffffffff) * 8);
  if (uVar9 == 0) {
    uVar13 = 0;
  }
  else {
    uVar15 = 0;
    uVar12 = 0x40;
    do {
      uVar18 = uVar15 + uVar12 >> 1;
      uVar13 = uVar18;
      if (uVar9 >> ((ulong)uVar18 & 0x3f) != 0) {
        uVar13 = uVar12;
        uVar15 = uVar18;
      }
      uVar12 = uVar13;
    } while (1 < uVar13 - uVar15);
  }
  uVar13 = uVar13 - in_w8;
  uVar22 = (long)(int)uVar13 + 0x40U >> 6;
  uVar9 = *(ulong *)(unaff_x22 + 0x10);
  lVar19 = *(long *)(unaff_x22 + 0x18);
  if (uVar9 == uVar22) {
LAB_006782c0:
    *(ulong *)(unaff_x22 + 0x10) = uVar22;
    *(long *)(unaff_x22 + 0x18) = lVar19;
    if (lVar19 != 0) {
      _bzero(lVar19,uVar22 << 3);
    }
  }
  else {
    if (lVar19 != 0) {
      if (uVar9 != 0) {
        do {
          *(undefined8 *)(lVar19 + -8 + uVar9 * 8) = 0;
          uVar9 = uVar9 - 1;
        } while (uVar9 != 0);
      }
      func_0x00611644();
    }
    func_0x006108a0(uVar22);
    if (uVar13 < 0xffffffc0) {
      lVar19 = func_0x006115d0(uVar22 << 3);
      goto LAB_006782c0;
    }
    *(ulong *)(unaff_x22 + 0x10) = 0;
    *(undefined8 *)(unaff_x22 + 0x18) = 0;
  }
  lVar17 = 0;
  *(undefined8 *)(unaff_x22 + 8) = 0x1fffffffffffffff;
  lVar19 = *(long *)(unaff_x20 + 0x10);
  lVar10 = *(long *)(unaff_x20 + 0x18);
  iVar8 = (int)lVar19;
  iVar14 = iVar8 * -0x40;
  do {
    if (lVar19 + lVar17 == 0) goto LAB_0067834c;
    lVar2 = lVar17 * 8;
    iVar14 = iVar14 + 0x40;
    lVar17 = lVar17 + -1;
  } while (*(long *)(lVar10 + lVar19 * 8 + -8 + lVar2) == 0);
  if (iVar8 + (int)lVar17 == -1) {
LAB_0067834c:
    uVar15 = 0;
  }
  else {
    uVar9 = *(ulong *)(lVar10 + (ulong)(uint)(iVar8 + (int)lVar17) * 8);
    if (uVar9 == 0) {
      uVar15 = 0;
    }
    else {
      uVar12 = 0;
      uVar18 = 0x40;
      do {
        uVar21 = uVar12 + uVar18 >> 1;
        uVar15 = uVar21;
        if (uVar9 >> ((ulong)uVar21 & 0x3f) != 0) {
          uVar15 = uVar18;
          uVar12 = uVar21;
        }
        uVar18 = uVar15;
      } while (1 < uVar15 - uVar12);
    }
    uVar15 = uVar15 - iVar14;
  }
  lVar20 = 0;
  lVar17 = *(long *)(unaff_x25 + 0x10);
  lVar2 = *(long *)(unaff_x25 + 0x18);
  iVar16 = (int)lVar17;
  iVar14 = iVar16 * -0x40;
  do {
    if (lVar17 + lVar20 == 0) goto code_r0x006783d8;
    lVar3 = lVar20 * 8;
    iVar14 = iVar14 + 0x40;
    lVar20 = lVar20 + -1;
  } while (*(long *)(lVar2 + lVar17 * 8 + -8 + lVar3) == 0);
  if (iVar16 + (int)lVar20 == -1) {
code_r0x006783d8:
    lVar20 = 0;
    iVar14 = iVar8 * -0x40;
    do {
      if (lVar19 + lVar20 == 0) goto code_r0x00678480;
      lVar3 = lVar20 * 8;
      iVar14 = iVar14 + 0x40;
      lVar20 = lVar20 + -1;
    } while (*(long *)(lVar10 + lVar19 * 8 + -8 + lVar3) == 0);
    if (iVar8 + (int)lVar20 == -1) {
code_r0x00678480:
      iVar14 = 0;
    }
    else {
      uVar9 = *(ulong *)(lVar10 + (ulong)(uint)(iVar8 + (int)lVar20) * 8);
      if (uVar9 == 0) {
        uVar15 = 0;
      }
      else {
        uVar12 = 0;
        uVar18 = 0x40;
        do {
          uVar21 = uVar12 + uVar18 >> 1;
          uVar15 = uVar21;
          if (uVar9 >> ((ulong)uVar21 & 0x3f) != 0) {
            uVar15 = uVar18;
            uVar12 = uVar21;
          }
          uVar18 = uVar15;
        } while (1 < uVar15 - uVar12);
      }
      iVar14 = uVar15 - iVar14;
    }
    lVar19 = 0;
    iVar8 = iVar16 * -0x40;
    do {
      if (lVar17 + lVar19 == 0) goto code_r0x00678514;
      lVar10 = lVar19 * 8;
      iVar8 = iVar8 + 0x40;
      lVar19 = lVar19 + -1;
    } while (*(long *)(lVar2 + lVar17 * 8 + -8 + lVar10) == 0);
    if (iVar16 + (int)lVar19 == -1) {
code_r0x00678514:
      iVar8 = 0;
    }
    else {
      uVar9 = *(ulong *)(lVar2 + (ulong)(uint)(iVar16 + (int)lVar19) * 8);
      if (uVar9 == 0) {
        uVar15 = 0;
      }
      else {
        uVar12 = 0;
        uVar18 = 0x40;
        do {
          uVar21 = uVar12 + uVar18 >> 1;
          uVar15 = uVar21;
          if (uVar9 >> ((ulong)uVar21 & 0x3f) != 0) {
            uVar15 = uVar18;
            uVar12 = uVar21;
          }
          uVar18 = uVar15;
        } while (1 < uVar15 - uVar12);
      }
      iVar8 = uVar15 - iVar8;
    }
    uVar15 = (iVar14 - iVar8) + 1;
    uVar22 = (ulong)uVar15 + 0x3f >> 6;
    uVar9 = *(ulong *)(unaff_x28 + 0x10);
    lVar19 = *(long *)(unaff_x28 + 0x18);
    if (uVar9 != uVar22) {
      if (lVar19 != 0) {
        if (uVar9 != 0) {
          do {
            *(undefined8 *)(lVar19 + -8 + uVar9 * 8) = 0;
            uVar9 = uVar9 - 1;
          } while (uVar9 != 0);
        }
        func_0x00611644();
      }
      func_0x006108a0(uVar22);
      if (uVar15 == 0) goto LAB_00678588;
      lVar19 = func_0x006115d0(uVar22 << 3);
    }
    *(ulong *)(unaff_x28 + 0x10) = uVar22;
    *(long *)(unaff_x28 + 0x18) = lVar19;
    if (lVar19 != 0) {
      _bzero(lVar19,uVar22 << 3);
    }
  }
  else {
    uVar9 = *(ulong *)(lVar2 + (ulong)(uint)(iVar16 + (int)lVar20) * 8);
    if (uVar9 == 0) {
      uVar12 = -iVar14;
    }
    else {
      uVar18 = 0;
      uVar21 = 0x40;
      do {
        uVar6 = uVar18 + uVar21 >> 1;
        uVar12 = uVar6;
        if (uVar9 >> ((ulong)uVar6 & 0x3f) != 0) {
          uVar12 = uVar21;
          uVar18 = uVar6;
        }
        uVar21 = uVar12;
      } while (1 < uVar12 - uVar18);
      uVar12 = uVar12 - iVar14;
    }
    if (uVar12 <= uVar15) goto code_r0x006783d8;
    lVar19 = *(long *)(unaff_x28 + 0x10);
    if (lVar19 != 0) {
      lVar10 = *(long *)(unaff_x28 + 0x18);
      if (lVar10 != 0) {
        do {
          *(undefined8 *)(lVar10 + lVar19 * 8 + -8) = 0;
          lVar19 = lVar19 + -1;
        } while (lVar19 != 0);
        func_0x00611644();
      }
LAB_00678588:
      *(undefined8 *)(unaff_x28 + 0x18) = 0;
    }
    *(undefined8 *)(unaff_x28 + 0x10) = 0;
  }
  lVar10 = 0;
  *(undefined8 *)(unaff_x28 + 8) = 0x1fffffffffffffff;
  lVar19 = *(long *)(unaff_x20 + 0x10);
  iVar8 = (int)lVar19;
  iVar14 = iVar8 * -0x40 + 1;
  do {
    if (lVar19 + lVar10 == 0) {
      return;
    }
    lVar17 = lVar10 * 8;
    iVar14 = iVar14 + 0x40;
    lVar10 = lVar10 + -1;
  } while (*(long *)(*(long *)(unaff_x20 + 0x18) + lVar19 * 8 + -8 + lVar17) == 0);
  if (iVar8 + (int)lVar10 != -1) {
    uVar9 = *(ulong *)(*(long *)(unaff_x20 + 0x18) + (ulong)(uint)(iVar8 + (int)lVar10) * 8);
    if (uVar9 == 0) {
      uVar15 = -iVar14;
    }
    else {
      uVar12 = 0;
      uVar18 = 0x40;
      do {
        uVar21 = uVar12 + uVar18 >> 1;
        uVar15 = uVar21;
        if (uVar9 >> ((ulong)uVar21 & 0x3f) != 0) {
          uVar15 = uVar18;
          uVar12 = uVar21;
        }
        uVar18 = uVar15;
      } while (1 < uVar15 - uVar12);
      uVar15 = uVar15 - iVar14;
    }
    if (-1 < (int)uVar15) {
      uVar9 = (ulong)uVar15;
      do {
        func_0x00677bc4();
        uVar22 = uVar9 >> 6;
        if (uVar22 < *(ulong *)(unaff_x20 + 0x10)) {
          uVar11 = *(ulong *)(*(long *)(unaff_x20 + 0x18) + uVar22 * 8) >> (uVar9 & 0x3f) & 1;
        }
        else {
          uVar11 = 0;
        }
        puVar7 = *(ulong **)(unaff_x22 + 0x18);
        *puVar7 = *puVar7 | uVar11;
        if (((ulong)(uVar13 >> 6) < *(ulong *)(unaff_x22 + 0x10)) &&
           ((puVar7[uVar13 >> 6] & 1L << ((ulong)uVar13 & 0x3f)) != 0)) {
          func_0x00677320();
          uVar11 = *(ulong *)(unaff_x28 + 0x10);
          lVar19 = *(long *)(unaff_x28 + 0x18);
          if (uVar11 <= uVar22) {
            uVar4 = uVar22 + 1;
            func_0x006108a0(uVar4);
            lVar10 = func_0x006115d0(uVar4 * 8);
            if ((lVar19 == 0) || (lVar10 == 0)) {
              if (lVar19 != 0) goto LAB_00678758;
            }
            else {
              uVar5 = uVar4;
              if (uVar11 <= uVar4) {
                uVar5 = uVar11;
              }
              _memcpy(lVar10,lVar19,uVar5 << 3);
LAB_00678758:
              if (uVar11 != 0) {
                do {
                  *(undefined8 *)(lVar19 + -8 + uVar11 * 8) = 0;
                  uVar11 = uVar11 - 1;
                } while (uVar11 != 0);
              }
              func_0x00611644(lVar19);
            }
            *(long *)(unaff_x28 + 0x18) = lVar10;
            _bzero(lVar10 + *(long *)(unaff_x28 + 0x10) * 8,
                   (uVar4 - *(long *)(unaff_x28 + 0x10)) * 8);
            lVar19 = *(long *)(unaff_x28 + 0x18);
            *(ulong *)(unaff_x28 + 0x10) = uVar4;
          }
          *(undefined8 *)(unaff_x28 + 8) = 0x1fffffffffffffff;
          *(ulong *)(lVar19 + uVar22 * 8) = *(ulong *)(lVar19 + uVar22 * 8) | 1L << (uVar9 & 0x3f);
        }
        bVar1 = 0 < (long)uVar9;
        uVar9 = uVar9 - 1;
      } while (bVar1);
    }
  }
  return;
}

