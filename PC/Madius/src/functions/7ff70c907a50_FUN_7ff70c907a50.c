/* 7ff70c907a50 FUN_7ff70c907a50 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c907a50(longlong param_1)

{
  byte bVar1;
  longlong lVar2;
  code *pcVar3;
  short sVar4;
  uint uVar5;
  undefined8 uVar6;
  uint uVar7;
  longlong lVar8;
  ulonglong uVar9;
  int iVar10;
  ulonglong uVar11;
  ulonglong uVar12;
  longlong lVar13;
  longlong lVar14;
  short *psVar15;
  longlong lVar16;
  int iVar17;
  bool bVar18;
  undefined1 auStack_58 [40];
  ulonglong uStack_30;
  
  uStack_30 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_58;
  bVar1 = *(byte *)(param_1 + 0x23a);
  if (bVar1 != 1) goto LAB_7ff70c907cf4;
  uVar12 = (ulonglong)*(uint *)(param_1 + 0x6c);
  if ((int)*(uint *)(param_1 + 0x6c) < 1) {
LAB_7ff70c907bf1:
    uVar5 = 0;
    if (((*(byte *)(param_1 + 7) & 8) == 0) && (0 < (int)uVar12)) {
      lVar13 = *(longlong *)(param_1 + 0x18);
      lVar16 = 0;
      do {
        if ((*(char *)(lVar13 + 0x66 + lVar16) == '\x01') &&
           ((*(byte *)(lVar13 + 1 + lVar16) & 2) == 0)) {
          *(undefined2 *)(lVar13 + 0x5e + lVar16) = 0;
          *(byte *)(lVar13 + 0x71 + lVar16) =
               *(byte *)(lVar13 + 0x71 + lVar16) & 0xfc | *(byte *)(lVar13 + 0x72 + lVar16) & 3;
          uVar5 = 1;
          goto LAB_7ff70c907c50;
        }
        lVar16 = lVar16 + 0x74;
      } while (uVar12 * 0x74 - lVar16 != 0);
      uVar5 = 0;
    }
  }
  else {
    lVar13 = 0x5e;
    lVar16 = 0;
    uVar5 = 0;
    uVar11 = 0;
    do {
      lVar8 = *(longlong *)(param_1 + 0x18);
      sVar4 = *(short *)(lVar8 + lVar13);
      if (sVar4 == -1) {
LAB_7ff70c907aa0:
        sVar4 = -1;
      }
      else if (*(char *)(lVar8 + 8 + lVar13) == '\0') {
        *(undefined2 *)(lVar8 + lVar13) = 0xffff;
        uVar12 = (ulonglong)*(uint *)(param_1 + 0x6c);
        goto LAB_7ff70c907aa0;
      }
      uVar9 = 1L << ((byte)sVar4 & 0x3f);
      if (sVar4 == -1) {
        uVar9 = 0;
      }
      uVar11 = uVar11 | uVar9;
      uVar5 = uVar5 + (sVar4 != -1);
      lVar16 = lVar16 + 1;
      uVar7 = (uint)uVar12;
      lVar13 = lVar13 + 0x74;
    } while (lVar16 < (int)uVar7);
    lVar13 = 1L << ((byte)uVar5 & 0x3f);
    if (uVar5 < 2) {
      if ((uVar5 == 0) || (lVar13 == uVar11 + 1)) {
        bVar18 = uVar5 == 0;
        uVar5 = 1;
        if (bVar18) goto LAB_7ff70c907bf1;
      }
      else {
LAB_7ff70c907b5b:
        uVar12 = 0;
        uVar7 = 0;
        do {
          uVar11 = 0xffffffff;
          if (0 < (longlong)*(int *)(param_1 + 0x6c)) {
            lVar13 = 0x5e;
            uVar9 = 0;
            do {
              if ((uVar12 >> (uVar9 & 0x3f) & 1) == 0) {
                sVar4 = *(short *)(*(longlong *)(param_1 + 0x18) + lVar13);
                if ((sVar4 != -1) &&
                   (((int)uVar11 == -1 ||
                    (sVar4 < *(short *)(*(longlong *)(param_1 + 0x18) + 0x5e +
                                       (longlong)(int)uVar11 * 0x74))))) {
                  uVar11 = uVar9 & 0xffffffff;
                }
              }
              uVar9 = uVar9 + 1;
              lVar13 = lVar13 + 0x74;
            } while ((longlong)*(int *)(param_1 + 0x6c) != uVar9);
          }
          uVar12 = uVar12 | 1L << (uVar11 & 0x3f);
          *(short *)(*(longlong *)(param_1 + 0x18) + 0x5e + (longlong)(int)uVar11 * 0x74) =
               (short)uVar7;
          uVar7 = uVar7 + 1;
        } while (uVar7 != uVar5);
      }
    }
    else if ((*(uint *)(param_1 + 4) & 0x4000000) == 0 || lVar13 != uVar11 + 1) {
      if ((*(uint *)(param_1 + 4) & 0x4000000) != 0) goto LAB_7ff70c907b5b;
      lVar13 = *(longlong *)(param_1 + 0x18);
      if ((int)uVar7 < 1) {
        uVar11 = 0xffffffff;
      }
      else {
        if (uVar7 == 1) {
          uVar11 = 0xffffffff;
          uVar9 = 0;
        }
        else {
          psVar15 = (short *)(lVar13 + 0xd2);
          uVar11 = 0xffffffff;
          uVar9 = 0;
          do {
            if ((psVar15[-0x3a] != -1) &&
               (((int)uVar11 == -1 ||
                (psVar15[-0x3a] < *(short *)(lVar13 + 0x5e + (longlong)(int)uVar11 * 0x74))))) {
              uVar11 = uVar9 & 0xffffffff;
            }
            if ((*psVar15 != -1) &&
               (((int)uVar11 == -1 ||
                (*psVar15 < *(short *)(lVar13 + 0x5e + (longlong)(int)uVar11 * 0x74))))) {
              uVar11 = (ulonglong)((int)uVar9 + 1);
            }
            uVar9 = uVar9 + 2;
            psVar15 = psVar15 + 0x74;
          } while ((uVar7 & 0x7ffffffe) != uVar9);
          if ((uVar12 & 1) == 0) goto LAB_7ff70c907e76;
        }
        sVar4 = *(short *)(lVar13 + 0x5e + uVar9 * 0x74);
        if ((sVar4 != -1) &&
           (((int)uVar11 == -1 || (sVar4 < *(short *)(lVar13 + 0x5e + (longlong)(int)uVar11 * 0x74))
            ))) {
          uVar11 = uVar9 & 0xffffffff;
        }
      }
LAB_7ff70c907e76:
      *(undefined2 *)(lVar13 + 0x5e + (longlong)(int)uVar11 * 0x74) = 0;
      iVar10 = *(int *)(param_1 + 0x6c);
      uVar5 = 1;
      if (0 < iVar10) {
        lVar13 = 0x5e;
        uVar12 = 0;
        do {
          if (uVar11 != uVar12) {
            *(undefined2 *)(*(longlong *)(param_1 + 0x18) + lVar13) = 0xffff;
            iVar10 = *(int *)(param_1 + 0x6c);
          }
          uVar12 = uVar12 + 1;
          lVar13 = lVar13 + 0x74;
        } while ((longlong)uVar12 < (longlong)iVar10);
      }
    }
  }
LAB_7ff70c907c50:
  sVar4 = (short)uVar5;
  *(short *)(param_1 + 0x200) = sVar4;
  iVar10 = (int)sVar4;
  if (sVar4 < 2) {
    iVar10 = 0;
  }
  iVar17 = *(int *)(param_1 + 0x1e4);
  if (iVar17 < iVar10) {
    if (iVar17 == 0) {
      iVar17 = 8;
    }
    else {
      iVar17 = iVar17 / 2 + iVar17;
    }
    if (iVar17 <= iVar10) {
      iVar17 = iVar10;
    }
    uVar6 = FUN_7ff70c802100((longlong)iVar17 * 0xc);
    if (*(longlong *)(param_1 + 0x1e8) != 0) {
      FUN_7ff70cb12b60(uVar6,*(longlong *)(param_1 + 0x1e8),
                       (longlong)*(int *)(param_1 + 0x1e0) * 0xc);
      FUN_7ff70c802510(*(undefined8 *)(param_1 + 0x1e8));
    }
    *(undefined8 *)(param_1 + 0x1e8) = uVar6;
    *(int *)(param_1 + 0x1e4) = iVar17;
  }
  *(int *)(param_1 + 0x1e0) = iVar10;
  *(undefined1 *)(param_1 + 0x1fc) = 1;
  *(undefined1 *)(param_1 + 0x23a) = 0;
LAB_7ff70c907cf4:
  sVar4 = *(short *)(param_1 + 0x200);
  if (sVar4 == 0) {
    lVar13 = 0;
  }
  else {
    if (sVar4 == 1) {
      lVar13 = param_1 + 0x1d0;
    }
    else {
      lVar13 = *(longlong *)(param_1 + 0x1e8);
    }
    if (((bVar1 & lVar13 != 0) == 1) && (iVar10 = *(int *)(param_1 + 0x6c), 0 < iVar10)) {
      lVar16 = 0x71;
      lVar8 = 0;
      do {
        lVar2 = *(longlong *)(param_1 + 0x18);
        lVar14 = (longlong)*(short *)(lVar2 + -0x13 + lVar16);
        if (lVar14 != -1) {
          *(undefined4 *)(lVar13 + lVar14 * 0xc) = *(undefined4 *)(lVar2 + -0x3d + lVar16);
          *(short *)(lVar13 + 4 + lVar14 * 0xc) = (short)lVar8;
          *(undefined2 *)(lVar13 + 6 + lVar14 * 0xc) = *(undefined2 *)(lVar2 + -0x13 + lVar16);
          *(byte *)(lVar13 + 8 + lVar14 * 0xc) = *(byte *)(lVar2 + lVar16) & 3;
          iVar10 = *(int *)(param_1 + 0x6c);
        }
        lVar8 = lVar8 + 1;
        lVar16 = lVar16 + 0x74;
      } while (lVar8 < iVar10);
      sVar4 = *(short *)(param_1 + 0x200);
    }
  }
  *(longlong *)(param_1 + 0x1f0) = lVar13;
  *(int *)(param_1 + 0x1f8) = (int)sVar4;
  if (_DAT_7ff70cbebd80 != (uStack_30 ^ (ulonglong)auStack_58)) {
    FUN_7ff70caa97e0(uStack_30 ^ (ulonglong)auStack_58);
    pcVar3 = (code *)swi(3);
    (*pcVar3)();
    return;
  }
  return;
}


