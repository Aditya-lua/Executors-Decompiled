
void FUN_000ef8d8(ulong param_1)

{
  int iVar1;
  int iVar2;
  int iVar3;
  uint uVar4;
  long lVar5;
  long *plVar6;
  undefined8 uVar7;
  int iVar8;
  undefined8 *puVar9;
  long *plVar10;
  ulong uVar11;
  int *piVar12;
  long unaff_x19;
  int *unaff_x20;
  int unaff_w21;
  long lVar13;
  int unaff_w22;
  int unaff_w23;
  long lVar14;
  int iVar15;
  long *unaff_x24;
  long lVar16;
  uint uVar17;
  long unaff_x25;
  long lVar18;
  ulong unaff_x26;
  long lVar19;
  long unaff_x27;
  uint *unaff_x28;
  undefined8 uVar20;
  undefined8 uVar21;
  long lVar22;
  
code_r0x000ef8d8:
  plVar6 = *(long **)(unaff_x28 + 2);
  if ((((*unaff_x24 == *plVar6 && unaff_x24[1] == plVar6[1]) && unaff_x24[2] == plVar6[2]) &&
       (int)unaff_x24[3] == (int)plVar6[3]) && (unaff_x24[5] == 0 && plVar6[5] == 0)) {
    *(int *)(unaff_x24 + 4) = (int)unaff_x24[4] + (int)plVar6[4];
    unaff_w21 = (int)plVar6[4] + unaff_w21;
    _memmove(plVar6,plVar6 + 7,(param_1 & 0xffffffff) * (unaff_x26 & 0xffffffff) + -0x38);
    uVar17 = *unaff_x28 - 1;
    param_1 = (ulong)uVar17;
    *unaff_x28 = uVar17;
    uVar11 = param_1;
    if ((int)uVar17 < 1) goto LAB_000ef860;
  }
LAB_000ef954:
  unaff_x24 = (long *)(*(long *)(unaff_x28 + 2) +
                      (ulong)((int)param_1 - 1) * (unaff_x26 & 0xffffffff));
  uVar17 = *(uint *)(unaff_x27 + unaff_x25 * 0x20 + 0x10);
  uVar11 = param_1 & 0xffffffff;
  piVar12 = (int *)(*(long *)(unaff_x28 + 2) + 0x20);
  do {
    piVar12[-1] = unaff_w21;
    unaff_w21 = *piVar12 + unaff_w21;
    uVar11 = uVar11 - 1;
    piVar12 = piVar12 + 0xe;
  } while (uVar11 != 0);
  do {
    unaff_w22 = (int)param_1 + unaff_w22;
    unaff_w23 = uVar17 + unaff_w23;
    unaff_x25 = unaff_x25 + 1;
    if (*(int *)(unaff_x19 + 4) <= unaff_x25) {
      iVar8 = unaff_x20[1];
      iVar15 = *unaff_x20 + unaff_w22;
      if (iVar8 < iVar15) {
        iVar1 = iVar8;
        if (iVar8 < 0) {
          iVar1 = iVar8 + 1;
        }
        iVar2 = 8;
        if (iVar8 != 0) {
          iVar2 = iVar8 + (iVar1 >> 1);
        }
        if (iVar2 <= iVar15) {
          iVar2 = iVar15;
        }
        uVar7 = func_0x000b810c((long)iVar2 * 0x38);
        if (*(long *)(unaff_x20 + 2) != 0) {
          _memcpy(uVar7,*(long *)(unaff_x20 + 2),(long)*unaff_x20 * 0x38);
          func_0x000b83d4(*(undefined8 *)(unaff_x20 + 2));
        }
        *(undefined8 *)(unaff_x20 + 2) = uVar7;
        *unaff_x20 = iVar15;
        unaff_x20[1] = iVar2;
        iVar8 = unaff_x20[5];
        uVar17 = unaff_x20[4] + unaff_w23;
        if ((int)uVar17 <= iVar8) goto code_r0x000efa04;
LAB_000ef784:
        iVar15 = iVar8;
        if (iVar8 < 0) {
          iVar15 = iVar8 + 1;
        }
        uVar4 = 8;
        if (iVar8 != 0) {
          uVar4 = iVar8 + (iVar15 >> 1);
        }
        if ((int)uVar4 <= (int)uVar17) {
          uVar4 = uVar17;
        }
        lVar13 = func_0x000b810c(-(ulong)(uVar4 >> 0x1f) & 0xfffffffe00000000 | (ulong)uVar4 << 1);
        if (*(long *)(unaff_x20 + 6) != 0) {
          _memcpy(lVar13,*(long *)(unaff_x20 + 6),(long)unaff_x20[4] << 1);
          func_0x000b83d4(*(undefined8 *)(unaff_x20 + 6));
        }
        *(long *)(unaff_x20 + 6) = lVar13;
        unaff_x20[4] = uVar17;
        unaff_x20[5] = uVar4;
        iVar15 = *unaff_x20;
        lVar13 = lVar13 + (long)(int)uVar17 * 2 + (long)unaff_w23 * -2;
        iVar8 = *(int *)(unaff_x19 + 4);
      }
      else {
        *unaff_x20 = iVar15;
        iVar8 = unaff_x20[5];
        uVar17 = unaff_x20[4] + unaff_w23;
        if (iVar8 < (int)uVar17) goto LAB_000ef784;
code_r0x000efa04:
        unaff_x20[4] = uVar17;
        lVar13 = *(long *)(unaff_x20 + 6) + (long)(int)uVar17 * 2 + (long)unaff_w23 * -2;
        iVar8 = *(int *)(unaff_x19 + 4);
      }
      if (iVar8 < 2) {
        *(long *)(unaff_x20 + 0x14) = lVar13;
      }
      else {
        lVar18 = 0;
        lVar22 = *(long *)(unaff_x20 + 2) + (long)iVar15 * 0x38 + (long)unaff_w22 * -0x38;
        lVar16 = 1;
        do {
          lVar19 = *(long *)(unaff_x19 + 0x10);
          lVar14 = lVar19 + lVar18;
          if (*(int *)(lVar14 + 0x20) != 0) {
            lVar5 = (long)*(int *)(lVar14 + 0x20) * 0x38;
            _memcpy(lVar22,*(undefined8 *)(lVar14 + 0x28),lVar5);
            lVar22 = lVar22 + lVar5;
          }
          if (*(int *)(lVar14 + 0x30) != 0) {
            lVar14 = (long)*(int *)(lVar14 + 0x30) * 2;
            _memcpy(lVar13,*(undefined8 *)(lVar19 + lVar18 + 0x38),lVar14);
            lVar13 = lVar13 + lVar14;
          }
          lVar16 = lVar16 + 1;
          lVar18 = lVar18 + 0x20;
        } while (lVar16 < *(int *)(unaff_x19 + 4));
        iVar15 = *unaff_x20;
        *(long *)(unaff_x20 + 0x14) = lVar13;
      }
      if (iVar15 != 0) {
        lVar13 = *(long *)(unaff_x20 + 2);
        lVar16 = (long)iVar15 + -1;
        if (*(long *)(lVar13 + lVar16 * 0x38 + 0x28) == 0) goto LAB_000efb90;
      }
      uVar21 = *(undefined8 *)(unaff_x20 + 0x24);
      uVar20 = *(undefined8 *)(unaff_x20 + 0x22);
      uVar7 = *(undefined8 *)(unaff_x20 + 0x26);
      iVar8 = unaff_x20[0x28];
      iVar1 = unaff_x20[4];
      if (iVar15 == unaff_x20[1]) {
        iVar2 = iVar15;
        if (iVar15 < 0) {
          iVar2 = iVar15 + 1;
        }
        iVar3 = 8;
        if (iVar15 != 0) {
          iVar3 = iVar15 + (iVar2 >> 1);
        }
        if (iVar3 <= iVar15 + 1) {
          iVar3 = iVar15 + 1;
        }
        lVar13 = func_0x000b810c((long)iVar3 * 0x38);
        if (*(long *)(unaff_x20 + 2) != 0) {
          _memcpy(lVar13,*(long *)(unaff_x20 + 2),(long)*unaff_x20 * 0x38);
          func_0x000b83d4(*(undefined8 *)(unaff_x20 + 2));
        }
        *(long *)(unaff_x20 + 2) = lVar13;
        unaff_x20[1] = iVar3;
        iVar15 = *unaff_x20;
      }
      else {
        lVar13 = *(long *)(unaff_x20 + 2);
      }
      puVar9 = (undefined8 *)(lVar13 + (long)iVar15 * 0x38);
      puVar9[1] = uVar21;
      *puVar9 = uVar20;
      puVar9[2] = uVar7;
      *(int *)(puVar9 + 3) = iVar8;
      *(int *)((long)puVar9 + 0x1c) = iVar1;
      puVar9[5] = 0;
      puVar9[6] = 0;
      puVar9[4] = 0;
      lVar16 = (long)*unaff_x20;
      iVar15 = *unaff_x20 + 1;
      *unaff_x20 = iVar15;
      lVar13 = *(long *)(unaff_x20 + 2);
LAB_000efb90:
      plVar10 = (long *)(lVar13 + lVar16 * 0x38);
      plVar6 = (long *)(unaff_x20 + 0x22);
      if ((int)plVar10[4] == 0) {
        lVar16 = *(long *)(unaff_x20 + 0x24);
        lVar13 = *plVar6;
        uVar7 = *(undefined8 *)(unaff_x20 + 0x25);
        *(undefined8 *)((long)plVar10 + 0x14) = *(undefined8 *)(unaff_x20 + 0x27);
        *(undefined8 *)((long)plVar10 + 0xc) = uVar7;
        plVar10[1] = lVar16;
        *plVar10 = lVar13;
      }
      else if (((*plVar10 != *plVar6 || plVar10[1] != *(long *)(unaff_x20 + 0x24)) ||
               plVar10[2] != *(long *)(unaff_x20 + 0x26)) || (int)plVar10[3] != unaff_x20[0x28]) {
        lVar22 = *(long *)(unaff_x20 + 0x24);
        lVar18 = *plVar6;
        lVar16 = *(long *)(unaff_x20 + 0x26);
        iVar8 = unaff_x20[0x28];
        iVar1 = unaff_x20[4];
        if (iVar15 == unaff_x20[1]) {
          iVar2 = iVar15;
          if (iVar15 < 0) {
            iVar2 = iVar15 + 1;
          }
          iVar3 = 8;
          if (iVar15 != 0) {
            iVar3 = iVar15 + (iVar2 >> 1);
          }
          if (iVar3 <= iVar15 + 1) {
            iVar3 = iVar15 + 1;
          }
          lVar13 = func_0x000b810c((long)iVar3 * 0x38);
          if (*(long *)(unaff_x20 + 2) != 0) {
            _memcpy(lVar13,*(long *)(unaff_x20 + 2),(long)*unaff_x20 * 0x38);
            func_0x000b83d4(*(undefined8 *)(unaff_x20 + 2));
          }
          *(long *)(unaff_x20 + 2) = lVar13;
          unaff_x20[1] = iVar3;
          iVar15 = *unaff_x20;
        }
        plVar6 = (long *)(lVar13 + (long)iVar15 * 0x38);
        plVar6[1] = lVar22;
        *plVar6 = lVar18;
        plVar6[2] = lVar16;
        *(int *)(plVar6 + 3) = iVar8;
        *(int *)((long)plVar6 + 0x1c) = iVar1;
        plVar6[5] = 0;
        plVar6[6] = 0;
        plVar6[4] = 0;
        *unaff_x20 = *unaff_x20 + 1;
      }
      *(undefined4 *)(unaff_x19 + 4) = 1;
      return;
    }
    unaff_x27 = *(long *)(unaff_x19 + 0x10);
    unaff_x28 = (uint *)(unaff_x27 + unaff_x25 * 0x20);
    uVar17 = *unaff_x28;
    uVar11 = (ulong)uVar17;
    uVar4 = uVar17 - 1;
    param_1 = (ulong)uVar4;
    if (0 < (int)uVar17) {
      if ((*(int *)(*(long *)(unaff_x28 + 2) + param_1 * (unaff_x26 & 0xffffffff) + 0x20) == 0) &&
         (*(long *)(*(long *)(unaff_x28 + 2) + param_1 * (unaff_x26 & 0xffffffff) + 0x28) == 0)) {
        *unaff_x28 = uVar4;
        if (uVar4 != 0 && unaff_x24 != (long *)0x0) goto code_r0x000ef8d8;
      }
      else {
        param_1 = uVar11;
        if (uVar17 != 0 && unaff_x24 != (long *)0x0) goto code_r0x000ef8d8;
      }
      uVar11 = param_1;
      if (0 < (int)param_1) goto LAB_000ef954;
    }
LAB_000ef860:
    uVar17 = unaff_x28[4];
    param_1 = uVar11;
  } while( true );
}

