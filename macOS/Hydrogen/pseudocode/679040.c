
undefined8 FUN_00679040(void)

{
  long lVar1;
  char *pcVar2;
  ulong uVar3;
  long lVar4;
  uint uVar5;
  bool in_CY;
  long lVar6;
  undefined8 uVar7;
  uint uVar8;
  uint in_w9;
  uint uVar9;
  int iVar10;
  int iVar11;
  uint uVar12;
  long lVar13;
  ulong uVar14;
  uint uVar15;
  uint uVar16;
  long *unaff_x19;
  long unaff_x20;
  undefined1 *puVar17;
  long unaff_x21;
  uint unaff_w24;
  ulong unaff_x25;
  int unaff_w26;
  ulong unaff_x27;
  uint uVar18;
  undefined1 uStack000000000000002f;
  
  if (in_CY) {
    lVar6 = 0;
  }
  else {
    lVar6 = func_0x006115d0();
    in_w9 = *(uint *)((long)unaff_x19 + *(long *)(*unaff_x19 + -0x18) + 8);
  }
  uVar8 = 0;
  pcVar2 = "0123456789abcdef";
  if ((in_w9 & 0x4000) != 0) {
    pcVar2 = "0123456789ABCDEF";
  }
  uVar18 = 0xffffffff;
  while( true ) {
    lVar13 = 0;
    uVar9 = uVar8 * unaff_w26;
    uVar3 = *(ulong *)(unaff_x20 + 0x10);
    lVar4 = *(long *)(unaff_x20 + 0x18);
    iVar10 = (int)uVar3;
    iVar11 = iVar10 * -0x40;
    do {
      if (uVar3 + lVar13 == 0) goto LAB_00679208;
      lVar1 = lVar13 * 8;
      iVar11 = iVar11 + 0x40;
      lVar13 = lVar13 + -1;
    } while (*(long *)(lVar4 + uVar3 * 8 + -8 + lVar1) == 0);
    if (iVar10 + (int)lVar13 == -1) break;
    uVar14 = *(ulong *)(lVar4 + (ulong)(uint)(iVar10 + (int)lVar13) * 8);
    if (uVar14 == 0) {
      uVar12 = -iVar11;
    }
    else {
      uVar16 = 0;
      uVar15 = 0x40;
      do {
        uVar5 = uVar16 + uVar15 >> 1;
        uVar12 = uVar5;
        if (uVar14 >> ((ulong)uVar5 & 0x3f) != 0) {
          uVar12 = uVar15;
          uVar16 = uVar5;
        }
        uVar15 = uVar12;
      } while (1 < uVar12 - uVar16);
      uVar12 = uVar12 - iVar11;
    }
    if (uVar12 <= uVar9) break;
    if (uVar9 >> 6 < uVar3) {
      uVar12 = (uint)(*(ulong *)(lVar4 + (ulong)(uVar9 >> 6) * 8) >> ((ulong)uVar9 & 0x3f)) & 1;
    }
    else {
      uVar12 = 0;
    }
    if ((unaff_x25 & 1) == 0) {
      uVar14 = (ulong)(uVar9 + 1 >> 6);
      if (uVar14 < uVar3) {
        uVar16 = (uint)(*(ulong *)(lVar4 + uVar14 * 8) >> ((ulong)(uVar9 + 1) & 0x3f)) & 1;
        uVar14 = (ulong)(uVar9 + 2 >> 6);
        if (uVar14 < uVar3) goto LAB_006791b4;
LAB_0067918c:
        uVar12 = uVar12 | uVar16 << 1;
      }
      else {
        uVar16 = 0;
        uVar14 = (ulong)(uVar9 + 2 >> 6);
        if (uVar3 <= uVar14) goto LAB_0067918c;
LAB_006791b4:
        uVar12 = uVar12 | uVar16 << 1 |
                 ((uint)(*(ulong *)(lVar4 + uVar14 * 8) >> ((ulong)(uVar9 + 2) & 0x3f)) & 1) << 2;
      }
      if ((unaff_x27 & 1) == 0) {
        uVar14 = (ulong)(uVar9 + 3 >> 6);
        if (uVar14 < uVar3) {
          uVar9 = (uint)(*(ulong *)(lVar4 + uVar14 * 8) >> ((ulong)(uVar9 + 3) & 0x3f)) & 1;
        }
        else {
          uVar9 = 0;
        }
        uVar12 = uVar12 | uVar9 << 3;
      }
    }
    *(char *)(lVar6 + (ulong)uVar8) = pcVar2[uVar12];
    uVar8 = uVar8 + 1;
    uVar18 = uVar18 + 1;
  }
LAB_00679208:
  if (uVar8 != 0) {
    puVar17 = (undefined1 *)(lVar6 + (ulong)uVar18);
    do {
      uStack000000000000002f = *puVar17;
      func_0x00086db4();
      if ((uVar18 != 0) && ((unaff_w24 & uVar18) == 0)) {
        uStack000000000000002f = 0x2c;
        func_0x00086db4();
      }
      uVar18 = uVar18 - 1;
      puVar17 = puVar17 + -1;
    } while (uVar18 != 0xffffffff);
  }
  uVar7 = func_0x00086db4();
  if (lVar6 != 0) {
    if ((int)unaff_x21 != 0) {
      do {
        *(undefined1 *)(lVar6 + -1 + unaff_x21) = 0;
        unaff_x21 = unaff_x21 + -1;
      } while (unaff_x21 != 0);
    }
    func_0x00611644(lVar6);
  }
  return uVar7;
}

