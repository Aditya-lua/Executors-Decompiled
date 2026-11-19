/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0087a7a0
 */

void FUN_0087a7a0(undefined1 (*param_1) [16],undefined1 (*param_2) [16],long param_3,uint param_4)

{
  bool bVar1;
  long lVar2;
  ulong uVar3;
  undefined8 *puVar4;
  uint *puVar5;
  uint uVar6;
  uint uVar7;
  uint uVar8;
  ulong uVar9;
  uint uVar10;
  ulong uVar11;
  undefined8 uVar12;
  ulong uVar13;
  undefined1 (*pauVar14) [16];
  undefined1 (*pauVar15) [16];
  undefined8 uVar16;
  undefined1 (*pauVar17) [16];
  long lVar18;
  uint *puVar19;
  uint *puVar20;
  long lVar21;
  undefined1 (*pauVar22) [16];
  ulong uVar23;
  uint *puVar24;
  undefined1 (*pauVar25) [16];
  undefined1 auVar26 [16];
  
  do {
    pauVar15 = param_1;
LAB_0087a7cc:
    param_1 = pauVar15;
    uVar11 = (long)param_2 - (long)param_1 >> 3;
    if (uVar11 - 2 == 0 || (long)uVar11 < 2) {
      if (uVar11 < 2) {
        return;
      }
      if (uVar11 == 2) {
        if (*(uint *)(param_2[-1] + 8) < *(uint *)*param_1) {
          uVar12 = *(undefined8 *)*param_1;
          *(undefined8 *)*param_1 = *(undefined8 *)(param_2[-1] + 8);
          *(undefined8 *)(param_2[-1] + 8) = uVar12;
          return;
        }
        return;
      }
    }
    else {
      if (uVar11 == 3) {
        uVar10 = *(uint *)(*param_1 + 8);
        if (*(uint *)*param_1 <= uVar10) {
          if (uVar10 <= *(uint *)(param_2[-1] + 8)) {
            return;
          }
          uVar12 = *(undefined8 *)(*param_1 + 8);
          *(undefined8 *)(*param_1 + 8) = *(undefined8 *)(param_2[-1] + 8);
          *(undefined8 *)(param_2[-1] + 8) = uVar12;
          if (*(uint *)(*param_1 + 8) < *(uint *)*param_1) {
            auVar26 = NEON_ext(*param_1,*param_1,8,1);
            *(long *)(*param_1 + 8) = auVar26._8_8_;
            *(long *)*param_1 = auVar26._0_8_;
            return;
          }
          return;
        }
        uVar12 = *(undefined8 *)*param_1;
        if (*(uint *)(param_2[-1] + 8) < uVar10) {
          *(undefined8 *)*param_1 = *(undefined8 *)(param_2[-1] + 8);
          *(undefined8 *)(param_2[-1] + 8) = uVar12;
          return;
        }
        *(undefined8 *)*param_1 = *(undefined8 *)(*param_1 + 8);
        *(undefined8 *)(*param_1 + 8) = uVar12;
        if (*(uint *)(param_2[-1] + 8) < (uint)uVar12) {
          *(undefined8 *)(*param_1 + 8) = *(undefined8 *)(param_2[-1] + 8);
          *(undefined8 *)(param_2[-1] + 8) = uVar12;
          return;
        }
        return;
      }
      if (uVar11 == 4) {
        uVar10 = *(uint *)(*param_1 + 8);
        uVar6 = *(uint *)*param_1;
        uVar7 = *(uint *)param_1[1];
        uVar11 = (ulong)uVar7;
        if (uVar10 < uVar6) {
          uVar9 = *(ulong *)*param_1;
          if (uVar7 < uVar10) {
            uVar12 = *(undefined8 *)param_1[1];
            *(ulong *)param_1[1] = uVar9;
            *(undefined8 *)*param_1 = uVar12;
          }
          else {
            *(undefined8 *)*param_1 = *(undefined8 *)(*param_1 + 8);
            *(ulong *)(*param_1 + 8) = uVar9;
            if ((uint)uVar9 <= uVar7) goto LAB_0087b0d0;
            *(undefined8 *)(*param_1 + 8) = *(undefined8 *)param_1[1];
            *(ulong *)param_1[1] = uVar9;
          }
          uVar11 = uVar9 & 0xffffffff;
        }
        else if (uVar7 < uVar10) {
          uVar11 = *(ulong *)(*param_1 + 8);
          uVar12 = *(undefined8 *)param_1[1];
          *(undefined8 *)(*param_1 + 8) = uVar12;
          *(ulong *)param_1[1] = uVar11;
          if ((uint)uVar12 < uVar6) {
            uVar16 = *(undefined8 *)*param_1;
            *(undefined8 *)*param_1 = uVar12;
            *(undefined8 *)(*param_1 + 8) = uVar16;
          }
        }
LAB_0087b0d0:
        if ((uint)uVar11 <= *(uint *)(param_2[-1] + 8)) {
          return;
        }
        uVar12 = *(undefined8 *)param_1[1];
        *(undefined8 *)param_1[1] = *(undefined8 *)(param_2[-1] + 8);
        *(undefined8 *)(param_2[-1] + 8) = uVar12;
        if (*(uint *)(*param_1 + 8) <= *(uint *)param_1[1]) {
          return;
        }
        uVar12 = *(undefined8 *)(*param_1 + 8);
        uVar16 = *(undefined8 *)param_1[1];
        uVar10 = *(uint *)*param_1;
        *(undefined8 *)(*param_1 + 8) = uVar16;
        *(undefined8 *)param_1[1] = uVar12;
        if ((uint)uVar16 < uVar10) {
          uVar12 = *(undefined8 *)*param_1;
          *(undefined8 *)*param_1 = uVar16;
          *(undefined8 *)(*param_1 + 8) = uVar12;
          return;
        }
        return;
      }
      if (uVar11 == 5) {
        FUN_0087b130(param_1,*param_1 + 8,param_1 + 1,param_1[1] + 8,param_2[-1] + 8);
        return;
      }
    }
    if ((long)uVar11 < 0x18) {
      pauVar15 = (undefined1 (*) [16])(*param_1 + 8);
      if ((param_4 & 1) == 0) {
        if (!(param_1 == param_2 || pauVar15 == param_2)) {
          do {
            pauVar14 = pauVar15;
            if (*(uint *)(*param_1 + 8) < *(uint *)*param_1) {
              uVar12 = *(undefined8 *)*pauVar14;
              pauVar15 = pauVar14;
              do {
                pauVar25 = pauVar15 + -1;
                pauVar17 = (undefined1 (*) [16])(pauVar15[-1] + 8);
                *(undefined8 *)*pauVar15 = *(undefined8 *)*pauVar17;
                pauVar15 = pauVar17;
              } while ((uint)uVar12 < *(uint *)*pauVar25);
              *(undefined8 *)*pauVar17 = uVar12;
            }
            pauVar15 = (undefined1 (*) [16])(*pauVar14 + 8);
            param_1 = pauVar14;
          } while ((undefined1 (*) [16])(*pauVar14 + 8) != param_2);
          return;
        }
        return;
      }
      if (param_1 == param_2 || pauVar15 == param_2) {
        return;
      }
      lVar21 = 0;
      pauVar14 = param_1;
      break;
    }
    if (param_3 == 0) {
      if (param_1 == param_2) {
        return;
      }
      uVar13 = uVar11 - 2 >> 1;
      uVar9 = uVar13;
      goto LAB_0087ae24;
    }
    uVar10 = *(uint *)(param_2[-1] + 8);
    puVar19 = (uint *)(*param_1 + (uVar11 >> 1) * 8);
    if (uVar11 < 0x81) {
      uVar6 = *(uint *)*param_1;
      if (uVar6 < *puVar19) {
        uVar12 = *(undefined8 *)puVar19;
        if (uVar10 < uVar6) {
          *(undefined8 *)puVar19 = *(undefined8 *)(param_2[-1] + 8);
        }
        else {
          *(undefined8 *)puVar19 = *(undefined8 *)*param_1;
          *(undefined8 *)*param_1 = uVar12;
          if ((uint)uVar12 <= *(uint *)(param_2[-1] + 8)) goto LAB_0087a9a8;
          *(undefined8 *)*param_1 = *(undefined8 *)(param_2[-1] + 8);
        }
        *(undefined8 *)(param_2[-1] + 8) = uVar12;
      }
      else if (uVar10 < uVar6) {
        uVar12 = *(undefined8 *)*param_1;
        *(undefined8 *)*param_1 = *(undefined8 *)(param_2[-1] + 8);
        *(undefined8 *)(param_2[-1] + 8) = uVar12;
        if (*(uint *)*param_1 < *puVar19) {
          uVar12 = *(undefined8 *)puVar19;
          *(undefined8 *)puVar19 = *(undefined8 *)*param_1;
          *(undefined8 *)*param_1 = uVar12;
          goto joined_r0x0087aaf0;
        }
      }
LAB_0087a9a8:
      if ((param_4 & 1) == 0) goto LAB_0087aaf4;
LAB_0087a9b0:
      uVar12 = *(undefined8 *)*param_1;
    }
    else {
      uVar6 = *puVar19;
      if (uVar6 < *(uint *)*param_1) {
        uVar12 = *(undefined8 *)*param_1;
        if (uVar10 < uVar6) {
          *(undefined8 *)*param_1 = *(undefined8 *)(param_2[-1] + 8);
        }
        else {
          *(undefined8 *)*param_1 = *(undefined8 *)puVar19;
          *(undefined8 *)puVar19 = uVar12;
          if ((uint)uVar12 <= *(uint *)(param_2[-1] + 8)) goto LAB_0087a91c;
          *(undefined8 *)puVar19 = *(undefined8 *)(param_2[-1] + 8);
        }
        *(undefined8 *)(param_2[-1] + 8) = uVar12;
      }
      else if (uVar10 < uVar6) {
        uVar12 = *(undefined8 *)puVar19;
        *(undefined8 *)puVar19 = *(undefined8 *)(param_2[-1] + 8);
        *(undefined8 *)(param_2[-1] + 8) = uVar12;
        if (*puVar19 < *(uint *)*param_1) {
          uVar12 = *(undefined8 *)*param_1;
          *(undefined8 *)*param_1 = *(undefined8 *)puVar19;
          *(undefined8 *)puVar19 = uVar12;
        }
      }
LAB_0087a91c:
      uVar10 = puVar19[-2];
      if (uVar10 < *(uint *)(*param_1 + 8)) {
        uVar12 = *(undefined8 *)(*param_1 + 8);
        if (*(uint *)param_2[-1] < uVar10) {
          *(undefined8 *)(*param_1 + 8) = *(undefined8 *)param_2[-1];
        }
        else {
          *(undefined8 *)(*param_1 + 8) = *(undefined8 *)(puVar19 + -2);
          *(undefined8 *)(puVar19 + -2) = uVar12;
          if ((uint)uVar12 <= *(uint *)param_2[-1]) goto LAB_0087a9dc;
          *(undefined8 *)(puVar19 + -2) = *(undefined8 *)param_2[-1];
        }
        *(undefined8 *)param_2[-1] = uVar12;
      }
      else if (*(uint *)param_2[-1] < uVar10) {
        uVar12 = *(undefined8 *)(puVar19 + -2);
        *(undefined8 *)(puVar19 + -2) = *(undefined8 *)param_2[-1];
        *(undefined8 *)param_2[-1] = uVar12;
        if (puVar19[-2] < *(uint *)(*param_1 + 8)) {
          uVar12 = *(undefined8 *)(*param_1 + 8);
          *(undefined8 *)(*param_1 + 8) = *(undefined8 *)(puVar19 + -2);
          *(undefined8 *)(puVar19 + -2) = uVar12;
        }
      }
LAB_0087a9dc:
      uVar10 = puVar19[2];
      if (uVar10 < *(uint *)param_1[1]) {
        uVar12 = *(undefined8 *)param_1[1];
        if (*(uint *)(param_2[-2] + 8) < uVar10) {
          *(undefined8 *)param_1[1] = *(undefined8 *)(param_2[-2] + 8);
        }
        else {
          *(undefined8 *)param_1[1] = *(undefined8 *)(puVar19 + 2);
          *(undefined8 *)(puVar19 + 2) = uVar12;
          if ((uint)uVar12 <= *(uint *)(param_2[-2] + 8)) goto LAB_0087aa68;
          *(undefined8 *)(puVar19 + 2) = *(undefined8 *)(param_2[-2] + 8);
        }
        *(undefined8 *)(param_2[-2] + 8) = uVar12;
      }
      else if (*(uint *)(param_2[-2] + 8) < uVar10) {
        uVar12 = *(undefined8 *)(puVar19 + 2);
        *(undefined8 *)(puVar19 + 2) = *(undefined8 *)(param_2[-2] + 8);
        *(undefined8 *)(param_2[-2] + 8) = uVar12;
        if (puVar19[2] < *(uint *)param_1[1]) {
          uVar12 = *(undefined8 *)param_1[1];
          *(undefined8 *)param_1[1] = *(undefined8 *)(puVar19 + 2);
          *(undefined8 *)(puVar19 + 2) = uVar12;
        }
      }
LAB_0087aa68:
      uVar10 = *puVar19;
      uVar6 = puVar19[2];
      if (uVar10 < puVar19[-2]) {
        uVar12 = *(undefined8 *)(puVar19 + -2);
        if (uVar6 < uVar10) {
          uVar16 = *(undefined8 *)(puVar19 + 2);
          *(undefined8 *)(puVar19 + 2) = uVar12;
          uVar12 = *(undefined8 *)puVar19;
          *(undefined8 *)(puVar19 + -2) = uVar16;
        }
        else {
          *(undefined8 *)(puVar19 + -2) = *(undefined8 *)puVar19;
          *(undefined8 *)puVar19 = uVar12;
          if (uVar6 < (uint)uVar12) {
            uVar16 = *(undefined8 *)(puVar19 + 2);
            *(undefined8 *)puVar19 = uVar16;
            *(undefined8 *)(puVar19 + 2) = uVar12;
            uVar12 = uVar16;
          }
        }
      }
      else {
        uVar12 = *(undefined8 *)puVar19;
        if (uVar6 < uVar10) {
          uVar16 = *(undefined8 *)(puVar19 + 2);
          *(undefined8 *)puVar19 = uVar16;
          *(undefined8 *)(puVar19 + 2) = uVar12;
          uVar12 = uVar16;
          if ((uint)uVar16 < puVar19[-2]) {
            uVar12 = *(undefined8 *)(puVar19 + -2);
            *(undefined8 *)(puVar19 + -2) = uVar16;
            *(undefined8 *)puVar19 = uVar12;
          }
        }
      }
      uVar16 = *(undefined8 *)*param_1;
      *(undefined8 *)*param_1 = uVar12;
      *(undefined8 *)puVar19 = uVar16;
joined_r0x0087aaf0:
      if ((param_4 & 1) != 0) goto LAB_0087a9b0;
LAB_0087aaf4:
      uVar12 = *(undefined8 *)*param_1;
      if (*(uint *)*param_1 <= *(uint *)(param_1[-1] + 8)) {
        uVar10 = (uint)uVar12;
        pauVar15 = param_1;
        if (uVar10 < *(uint *)(param_2[-1] + 8)) {
          do {
            pauVar15 = (undefined1 (*) [16])(*pauVar15 + 8);
          } while (*(uint *)*pauVar15 <= uVar10);
        }
        else {
          do {
            pauVar15 = (undefined1 (*) [16])(*pauVar15 + 8);
            if (param_2 <= pauVar15) break;
          } while (*(uint *)*pauVar15 <= uVar10);
        }
        pauVar14 = param_2;
        if (pauVar15 < param_2) {
          do {
            pauVar14 = (undefined1 (*) [16])(pauVar14[-1] + 8);
          } while (uVar10 < *(uint *)*pauVar14);
        }
        while (pauVar15 < pauVar14) {
          uVar16 = *(undefined8 *)*pauVar15;
          *(undefined8 *)*pauVar15 = *(undefined8 *)*pauVar14;
          *(undefined8 *)*pauVar14 = uVar16;
          do {
            pauVar15 = (undefined1 (*) [16])(*pauVar15 + 8);
          } while (*(uint *)*pauVar15 <= uVar10);
          do {
            pauVar14 = (undefined1 (*) [16])(pauVar14[-1] + 8);
          } while (uVar10 < *(uint *)*pauVar14);
        }
        pauVar14 = (undefined1 (*) [16])(pauVar15[-1] + 8);
        if (param_1 != pauVar14) {
          *(undefined8 *)*param_1 = *(undefined8 *)*pauVar14;
        }
        param_4 = 0;
        *(undefined8 *)*pauVar14 = uVar12;
        param_3 = param_3 + -1;
        goto LAB_0087a7cc;
      }
    }
    param_3 = param_3 + -1;
    lVar21 = 0;
    do {
      lVar2 = lVar21 + 8;
      lVar18 = lVar21 + 8;
      uVar10 = (uint)uVar12;
      lVar21 = lVar2;
    } while (*(uint *)(*param_1 + lVar18) < uVar10);
    pauVar15 = (undefined1 (*) [16])(*param_1 + lVar2);
    pauVar14 = param_2;
    if (lVar2 == 8) {
      do {
        if (pauVar14 <= pauVar15) break;
        pauVar14 = (undefined1 (*) [16])(pauVar14[-1] + 8);
      } while (uVar10 <= *(uint *)*pauVar14);
    }
    else {
      do {
        pauVar14 = (undefined1 (*) [16])(pauVar14[-1] + 8);
      } while (uVar10 <= *(uint *)*pauVar14);
    }
    if (pauVar15 < pauVar14) {
      pauVar17 = pauVar15;
      pauVar22 = pauVar14;
      do {
        uVar16 = *(undefined8 *)*pauVar17;
        *(undefined8 *)*pauVar17 = *(undefined8 *)*pauVar22;
        *(undefined8 *)*pauVar22 = uVar16;
        do {
          pauVar25 = pauVar17;
          pauVar17 = (undefined1 (*) [16])(*pauVar25 + 8);
        } while (*(uint *)*pauVar17 < uVar10);
        do {
          pauVar22 = (undefined1 (*) [16])(pauVar22[-1] + 8);
        } while (uVar10 <= *(uint *)*pauVar22);
      } while (pauVar17 < pauVar22);
    }
    else {
      pauVar25 = (undefined1 (*) [16])(pauVar15[-1] + 8);
    }
    if (param_1 != pauVar25) {
      *(undefined8 *)*param_1 = *(undefined8 *)*pauVar25;
    }
    *(undefined8 *)*pauVar25 = uVar12;
    if (pauVar15 < pauVar14) goto LAB_0087abf0;
    uVar11 = FUN_0087b2a4(param_1,pauVar25);
    uVar9 = FUN_0087b2a4((undefined1 (*) [16])(*pauVar25 + 8),param_2);
    if ((uVar9 & 1) == 0) goto code_r0x0087abec;
    param_2 = pauVar25;
    if ((uVar11 & 1) != 0) {
      return;
    }
  } while( true );
LAB_0087adb8:
  pauVar25 = pauVar15;
  if (*(uint *)(*pauVar14 + 8) < *(uint *)*pauVar14) {
    uVar12 = *(undefined8 *)*pauVar25;
    lVar2 = lVar21;
    do {
      lVar18 = lVar2;
      puVar4 = (undefined8 *)(*param_1 + lVar18);
      puVar4[1] = *puVar4;
      if (lVar18 == 0) {
        pauVar15 = param_1;
        goto LAB_0087ada4;
      }
      lVar2 = lVar18 + -8;
    } while ((uint)uVar12 < *(uint *)(puVar4 + -1));
    pauVar15 = (undefined1 (*) [16])(*param_1 + lVar18);
LAB_0087ada4:
    *(undefined8 *)*pauVar15 = uVar12;
  }
  lVar21 = lVar21 + 8;
  pauVar15 = (undefined1 (*) [16])(*pauVar25 + 8);
  pauVar14 = pauVar25;
  if ((undefined1 (*) [16])(*pauVar25 + 8) == param_2) {
    return;
  }
  goto LAB_0087adb8;
LAB_0087ae24:
  do {
    if (uVar9 <= uVar13) {
      uVar23 = (uVar9 & 0x3fffffffffffffff) << 1 | 1;
      uVar3 = uVar9 * 2 + 2;
      puVar19 = (uint *)(*param_1 + uVar23 * 8);
      if ((long)uVar3 < (long)uVar11) {
        uVar6 = *puVar19;
        uVar7 = puVar19[2];
        uVar10 = uVar6;
        if (uVar6 <= uVar7) {
          uVar10 = uVar7;
        }
        puVar24 = puVar19 + 2;
        if (uVar7 <= uVar6) {
          uVar3 = uVar23;
          puVar24 = puVar19;
        }
        puVar19 = puVar24;
        uVar23 = uVar3;
      }
      else {
        uVar10 = *puVar19;
      }
      puVar24 = (uint *)(*param_1 + uVar9 * 8);
      if (*puVar24 <= uVar10) {
        uVar12 = *(undefined8 *)puVar24;
        do {
          while( true ) {
            puVar20 = puVar19;
            *(undefined8 *)puVar24 = *(undefined8 *)puVar20;
            if ((long)uVar13 < (long)uVar23) goto LAB_0087ae14;
            uVar3 = uVar23 << 1 | 1;
            uVar23 = uVar23 * 2 + 2;
            puVar5 = (uint *)(*param_1 + uVar3 * 8);
            uVar10 = (uint)uVar12;
            puVar24 = puVar20;
            if ((long)uVar23 < (long)uVar11) break;
            puVar19 = puVar5;
            uVar23 = uVar3;
            if (*puVar5 < uVar10) goto LAB_0087ae14;
          }
          uVar7 = *puVar5;
          uVar8 = puVar5[2];
          uVar6 = uVar7;
          if (uVar7 <= uVar8) {
            uVar6 = uVar8;
          }
          puVar19 = puVar5 + 2;
          if (uVar8 <= uVar7) {
            uVar23 = uVar3;
            puVar19 = puVar5;
          }
        } while (uVar10 <= uVar6);
LAB_0087ae14:
        *(undefined8 *)puVar20 = uVar12;
      }
    }
    bVar1 = 0 < (long)uVar9;
    uVar9 = uVar9 - 1;
  } while (bVar1);
  do {
    uVar12 = *(undefined8 *)*param_1;
    uVar9 = 0;
    pauVar15 = param_1;
    do {
      uVar3 = uVar9 << 1 | 1;
      uVar13 = uVar9 * 2 + 2;
      pauVar14 = (undefined1 (*) [16])(*pauVar15 + uVar9 * 8 + 8);
      if ((long)uVar13 < (long)uVar11) {
        lVar21 = uVar9 * 8;
        lVar2 = uVar9 * 8;
        uVar9 = uVar13;
        pauVar25 = (undefined1 (*) [16])(pauVar15[1] + lVar21);
        if (*(uint *)*(undefined1 (*) [16])(pauVar15[1] + lVar21) <=
            *(uint *)(*pauVar15 + lVar2 + 8)) {
          uVar9 = uVar3;
          pauVar25 = pauVar14;
        }
        pauVar14 = pauVar25;
      }
      else {
        uVar9 = uVar3;
      }
      *(undefined8 *)*pauVar15 = *(undefined8 *)*pauVar14;
      pauVar15 = pauVar14;
    } while ((long)uVar9 <= (long)(uVar11 - 2 >> 1));
    param_2 = (undefined1 (*) [16])(param_2[-1] + 8);
    if (pauVar14 == param_2) {
      *(undefined8 *)*pauVar14 = uVar12;
    }
    else {
      lVar21 = (long)((long)pauVar14 + (8 - (long)param_1)) >> 3;
      *(undefined8 *)*pauVar14 = *(undefined8 *)*param_2;
      *(undefined8 *)*param_2 = uVar12;
      if (1 < lVar21) {
        uVar9 = lVar21 - 2U >> 1;
        if (*(uint *)*(undefined1 (*) [16])(*param_1 + uVar9 * 8) < *(uint *)*pauVar14) {
          uVar12 = *(undefined8 *)*pauVar14;
          pauVar15 = (undefined1 (*) [16])(*param_1 + uVar9 * 8);
          do {
            pauVar25 = pauVar15;
            *(undefined8 *)*pauVar14 = *(undefined8 *)*pauVar25;
            if (uVar9 == 0) break;
            uVar9 = uVar9 - 1 >> 1;
            pauVar14 = pauVar25;
            pauVar15 = (undefined1 (*) [16])(*param_1 + uVar9 * 8);
          } while (*(uint *)*(undefined1 (*) [16])(*param_1 + uVar9 * 8) < (uint)uVar12);
          *(undefined8 *)*pauVar25 = uVar12;
        }
      }
    }
    bVar1 = (long)uVar11 < 3;
    uVar11 = uVar11 - 1;
    if (bVar1) {
      return;
    }
  } while( true );
code_r0x0087abec:
  pauVar15 = (undefined1 (*) [16])(*pauVar25 + 8);
  if ((uVar11 & 1) == 0) {
LAB_0087abf0:
    FUN_0087a7a0(param_1,pauVar25,param_3,param_4 & 1);
    param_4 = 0;
    pauVar15 = (undefined1 (*) [16])(*pauVar25 + 8);
  }
  goto LAB_0087a7cc;
}

