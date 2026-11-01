
void FUN_00647fe4(long param_1,long param_2)

{
  uint uVar1;
  int iVar2;
  ulong uVar3;
  int iVar4;
  long lVar5;
  long lVar6;
  ulong *puVar7;
  long lVar8;
  ulong *puVar9;
  undefined4 uVar10;
  long lVar11;
  long lVar12;
  ulong uVar13;
  ulong uVar14;
  ulong *puVar15;
  ulong uVar16;
  ulong uVar17;
  ulong uVar18;
  ulong uVar19;
  int iVar20;
  uint uVar21;
  long *plVar22;
  uint uVar23;
  int iVar24;
  int iVar25;
  int iVar26;
  
  plVar22 = (long *)(param_2 + -8);
  iVar4 = (**(code **)(*plVar22 + 0xb0))(plVar22);
  lVar5 = (**(code **)(*plVar22 + 0xa0))(plVar22);
  lVar6 = func_0x00604ce4();
  lVar8 = lVar5;
  if (iVar4 == 1) {
    uVar14 = *(ulong *)(lVar5 + 0x18);
    if (*(ulong *)(lVar5 + 0x18) <= *(ulong *)(lVar6 + 0x18)) {
      uVar14 = *(ulong *)(lVar6 + 0x18);
    }
    func_0x006001b4(param_1,0,uVar14);
    if (*(int *)(lVar5 + 0x28) == 1) {
      if (*(int *)(lVar6 + 0x28) != 1) {
        func_0x00606b04(param_1,lVar5,lVar6);
        *(undefined4 *)(param_1 + 0x28) = 1;
        return;
      }
      lVar8 = lVar6;
      lVar6 = lVar5;
    }
    else {
      if (*(int *)(lVar6 + 0x28) == 1) {
        func_0x00606b04(param_1,lVar5,lVar6);
        return;
      }
    }
  }
  else {
    uVar14 = *(ulong *)(lVar5 + 0x18);
    if (*(ulong *)(lVar5 + 0x18) <= *(ulong *)(lVar6 + 0x18)) {
      uVar14 = *(ulong *)(lVar6 + 0x18);
    }
    func_0x006001b4(param_1,0,uVar14);
    if (*(int *)(lVar5 + 0x28) == 1) {
      if (*(int *)(lVar6 + 0x28) == 1) {
        func_0x00606b04(param_1,lVar5,lVar6);
        *(undefined4 *)(param_1 + 0x28) = 1;
        return;
      }
      lVar8 = lVar6;
      lVar6 = lVar5;
    }
    else if (*(int *)(lVar6 + 0x28) != 1) {
      func_0x00606b04(param_1,lVar5,lVar6);
      return;
    }
  }
  uVar14 = *(ulong *)(lVar8 + 0x18);
  lVar8 = *(long *)(lVar8 + 0x20);
  lVar5 = 0;
  uVar13 = uVar14;
  do {
    lVar11 = lVar5;
    uVar21 = (uint)uVar13;
    if (uVar14 + lVar11 == 0) break;
    uVar13 = (ulong)(uVar21 + 1);
    lVar5 = lVar11 + -1;
  } while (*(long *)(lVar8 + uVar14 * 8 + -8 + lVar11 * 8) == 0);
  iVar4 = (int)uVar14;
  uVar23 = iVar4 + (uVar21 & 1);
  uVar14 = (ulong)uVar23 + lVar11;
  iVar2 = -uVar23;
  uVar13 = *(ulong *)(lVar6 + 0x18);
  lVar6 = *(long *)(lVar6 + 0x20);
  lVar5 = 0;
  uVar16 = uVar13;
  uVar17 = uVar13;
  do {
    lVar12 = lVar5;
    uVar23 = (uint)uVar17;
    iVar24 = (int)uVar16;
    if (uVar13 + lVar12 == 0) break;
    uVar17 = (ulong)(uVar23 + 1);
    uVar16 = (ulong)(iVar24 - 1);
    lVar5 = lVar12 + -1;
  } while (*(long *)(lVar6 + uVar13 * 8 + -8 + lVar12 * 8) == 0);
  iVar25 = (int)uVar13;
  uVar1 = iVar25 + (uVar23 & 1);
  iVar26 = (int)lVar12;
  iVar20 = (int)lVar11;
  if ((uint)((ulong)uVar1 + lVar12) < (uint)uVar14) {
    lVar5 = *(long *)(param_1 + 0x20);
    uVar14 = (ulong)uVar1 + lVar12 & 0xffffffff;
    if (-uVar1 == iVar26) {
      uVar16 = 0;
    }
    else {
      uVar16 = 0;
      uVar13 = 0;
      puVar7 = (ulong *)(lVar6 + 8);
      puVar9 = (ulong *)(lVar5 + 8);
      puVar15 = (ulong *)(lVar8 + 8);
      do {
        uVar18 = puVar15[-1];
        uVar19 = puVar7[-1];
        uVar17 = uVar18 - uVar19;
        puVar9[-1] = uVar17 - uVar16;
        uVar3 = *puVar15 - *puVar7;
        uVar17 = (-(ulong)(uVar17 < uVar16) - (ulong)(uVar18 < uVar19)) + uVar3;
        uVar16 = (ulong)(uVar3 < uVar17);
        if (*puVar15 < *puVar7) {
          uVar16 = uVar16 + 1;
        }
        uVar13 = uVar13 + 2;
        *puVar9 = uVar17;
        puVar7 = puVar7 + 2;
        puVar9 = puVar9 + 2;
        puVar15 = puVar15 + 2;
      } while (uVar13 < uVar14);
    }
    uVar13 = (ulong)(((iVar4 + (uVar21 & 1)) - (iVar25 + (uVar23 & 1))) + iVar20) - lVar12;
    lVar6 = uVar14 * 8;
    if (lVar5 != lVar8) {
      _memcpy(lVar5 + lVar6,lVar8 + lVar6,(uVar13 & 0xffffffff) << 3);
      lVar8 = *(long *)(param_1 + 0x20);
    }
    uVar10 = 0;
    uVar14 = *(ulong *)(lVar8 + lVar6);
    *(ulong *)(lVar8 + lVar6) = uVar14 - uVar16;
    uVar21 = (uint)uVar13;
    if ((1 < uVar21) && (uVar14 < uVar16)) {
      lVar8 = lVar8 + (ulong)(iVar25 + iVar26 + (uVar23 & 1)) * 8;
      lVar6 = 1;
      do {
        lVar5 = *(long *)(lVar8 + lVar6 * 8);
        *(long *)(lVar8 + lVar6 * 8) = lVar5 + -1;
        lVar6 = lVar6 + 1;
      } while (lVar5 == 0 && (uint)lVar6 < uVar21);
code_r0x00607168:
      uVar10 = 0;
    }
  }
  else {
    if (((iVar4 + (uVar21 & 1)) - uVar1) + iVar20 == iVar26) {
      lVar5 = (ulong)(iVar4 + iVar20 + (uVar21 & 1)) << 3;
      do {
        if (lVar5 == 0) {
code_r0x006070f8:
          if (iVar2 != iVar20) {
            uVar16 = 0;
            uVar13 = 0;
            puVar7 = (ulong *)(lVar8 + 8);
            puVar9 = (ulong *)(lVar6 + 8);
            puVar15 = (ulong *)(*(long *)(param_1 + 0x20) + 8);
            do {
              uVar18 = puVar7[-1];
              uVar19 = puVar9[-1];
              uVar17 = uVar18 - uVar19;
              puVar15[-1] = uVar17 - uVar16;
              uVar3 = *puVar7 - *puVar9;
              uVar17 = (-(ulong)(uVar17 < uVar16) - (ulong)(uVar18 < uVar19)) + uVar3;
              uVar16 = (ulong)(uVar3 < uVar17);
              if (*puVar7 < *puVar9) {
                uVar16 = uVar16 + 1;
              }
              uVar13 = uVar13 + 2;
              *puVar15 = uVar17;
              puVar7 = puVar7 + 2;
              puVar9 = puVar9 + 2;
              puVar15 = puVar15 + 2;
            } while (uVar13 < (uVar14 & 0xffffffff));
          }
          goto code_r0x00607168;
        }
        uVar13 = *(ulong *)(lVar8 + -8 + lVar5);
        uVar16 = *(ulong *)(lVar6 + -8 + lVar5);
        if (uVar16 < uVar13) goto code_r0x006070f8;
        lVar5 = lVar5 + -8;
      } while (uVar16 <= uVar13);
      uVar16 = 0;
      uVar13 = 0;
      puVar7 = (ulong *)(lVar8 + 8);
      puVar9 = (ulong *)(lVar6 + 8);
      puVar15 = (ulong *)(*(long *)(param_1 + 0x20) + 8);
      do {
        uVar18 = puVar9[-1];
        uVar19 = puVar7[-1];
        uVar17 = uVar18 - uVar19;
        puVar15[-1] = uVar17 - uVar16;
        uVar3 = *puVar9 - *puVar7;
        uVar17 = (-(ulong)(uVar17 < uVar16) - (ulong)(uVar18 < uVar19)) + uVar3;
        uVar16 = (ulong)(uVar3 < uVar17);
        if (*puVar9 < *puVar7) {
          uVar16 = uVar16 + 1;
        }
        uVar13 = uVar13 + 2;
        *puVar15 = uVar17;
        puVar7 = puVar7 + 2;
        puVar9 = puVar9 + 2;
        puVar15 = puVar15 + 2;
      } while (uVar13 < (uVar14 & 0xffffffff));
    }
    else {
      lVar5 = *(long *)(param_1 + 0x20);
      if (iVar2 == iVar20) {
        uVar16 = 0;
      }
      else {
        uVar16 = 0;
        uVar13 = 0;
        puVar7 = (ulong *)(lVar8 + 8);
        puVar9 = (ulong *)(lVar5 + 8);
        puVar15 = (ulong *)(lVar6 + 8);
        do {
          uVar18 = puVar15[-1];
          uVar19 = puVar7[-1];
          uVar17 = uVar18 - uVar19;
          puVar9[-1] = uVar17 - uVar16;
          uVar3 = *puVar15 - *puVar7;
          uVar17 = (-(ulong)(uVar17 < uVar16) - (ulong)(uVar18 < uVar19)) + uVar3;
          uVar16 = (ulong)(uVar3 < uVar17);
          if (*puVar15 < *puVar7) {
            uVar16 = uVar16 + 1;
          }
          uVar13 = uVar13 + 2;
          *puVar9 = uVar17;
          puVar7 = puVar7 + 2;
          puVar9 = puVar9 + 2;
          puVar15 = puVar15 + 2;
        } while (uVar13 < (uVar14 & 0xffffffff));
      }
      lVar8 = (uVar14 & 0xffffffff) * 8;
      if (lVar5 != lVar6) {
        _memcpy(lVar5 + lVar8,lVar6 + lVar8,
                (ulong)(((iVar24 + (uVar23 & 1)) - (iVar4 + (uVar21 & 1))) - iVar20) << 3);
        lVar6 = *(long *)(param_1 + 0x20);
      }
      uVar14 = *(ulong *)(lVar6 + lVar8);
      *(ulong *)(lVar6 + lVar8) = uVar14 - uVar16;
      uVar10 = 1;
      if ((((iVar24 + (uVar23 & 1)) - (iVar4 + (uVar21 & 1))) - iVar20 < 2) || (uVar16 <= uVar14))
      goto code_r0x00607290;
      iVar4 = iVar4 + (uVar21 & 1);
      lVar6 = lVar6 + (ulong)(uint)(iVar4 + iVar20) * 8;
      lVar8 = 1;
      do {
        lVar5 = *(long *)(lVar6 + lVar8 * 8);
        *(long *)(lVar6 + lVar8 * 8) = lVar5 + -1;
        lVar8 = lVar8 + 1;
      } while (lVar5 == 0 && (uint)lVar8 < ((iVar24 + (uVar23 & 1)) - iVar4) - iVar20);
    }
    uVar10 = 1;
  }
code_r0x00607290:
  *(undefined4 *)(param_1 + 0x28) = uVar10;
  return;
}

