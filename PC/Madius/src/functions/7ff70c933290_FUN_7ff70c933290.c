/* 7ff70c933290 FUN_7ff70c933290 */

byte FUN_7ff70c933290(longlong *param_1,longlong *param_2,longlong *param_3)

{
  longlong lVar1;
  longlong lVar2;
  longlong lVar3;
  ulonglong *puVar4;
  int iVar5;
  int iVar6;
  ulonglong uVar7;
  ulonglong uVar8;
  ulonglong uVar9;
  ulonglong uVar10;
  ulonglong uVar11;
  longlong lVar12;
  ulonglong uVar13;
  longlong lVar14;
  ulonglong uVar15;
  longlong lVar16;
  longlong lVar17;
  ulonglong uVar18;
  ulonglong uVar19;
  longlong lVar20;
  longlong lVar21;
  bool bVar22;
  byte bStack_99;
  
  lVar1 = *param_1;
  uVar8 = *(ulonglong *)param_1[1] + 1;
  *(ulonglong *)param_1[1] = uVar8;
  lVar17 = *(longlong *)param_1[2];
  bStack_99 = 1;
  if (uVar8 < (ulonglong)((((longlong *)param_1[2])[1] - lVar17 >> 3) * -0x5555555555555555)) {
    bStack_99 = 1;
    iVar6 = 0;
    do {
      lVar20 = *param_2;
      uVar8 = param_2[1];
      uVar11 = 0xcbf29ce484222325;
      if (uVar8 != 0) {
        uVar7 = (ulonglong)((uint)uVar8 & 3);
        if (uVar8 < 4) {
          uVar9 = 0;
        }
        else {
          uVar9 = 0;
          do {
            uVar11 = ((ulonglong)*(byte *)(lVar20 + 3 + uVar9) ^
                     ((ulonglong)*(byte *)(lVar20 + 2 + uVar9) ^
                     ((ulonglong)*(byte *)(lVar20 + 1 + uVar9) ^
                     (*(byte *)(lVar20 + uVar9) ^ uVar11) * 0x100000001b3) * 0x100000001b3) *
                     0x100000001b3) * 0x100000001b3;
            uVar9 = uVar9 + 4;
          } while ((uVar8 & 0xfffffffffffffffc) != uVar9);
          if (uVar7 == 0) goto LAB_7ff70c933427;
        }
        uVar18 = 0;
        do {
          uVar11 = (*(byte *)(uVar9 + lVar20 + uVar18) ^ uVar11) * 0x100000001b3;
          uVar18 = uVar18 + 1;
        } while (uVar7 != uVar18);
      }
LAB_7ff70c933427:
      uVar7 = *(ulonglong *)(lVar1 + 0xd8);
      lVar2 = *(longlong *)(lVar1 + 0xb0);
      lVar3 = *(longlong *)(lVar1 + 0xc0);
      lVar12 = (uVar11 & uVar7) * 0x10;
      lVar21 = *(longlong *)(lVar3 + 8 + lVar12);
      if (lVar21 == lVar2) {
LAB_7ff70c9334b0:
        lVar21 = 0;
      }
      else {
        lVar12 = *(longlong *)(lVar3 + lVar12);
        if (uVar8 != 0) {
          uVar11 = *(ulonglong *)(lVar21 + 0x18);
          while( true ) {
            if ((uVar8 == uVar11) &&
               (iVar5 = FUN_7ff70cb12b50(lVar20,*(undefined8 *)(lVar21 + 0x10)), iVar5 == 0))
            goto LAB_7ff70c9334b3;
            if (lVar21 == lVar12) break;
            lVar21 = *(longlong *)(lVar21 + 8);
            uVar11 = *(ulonglong *)(lVar21 + 0x18);
          }
          goto LAB_7ff70c9334b0;
        }
        for (; *(longlong *)(lVar21 + 0x18) != 0; lVar21 = *(longlong *)(lVar21 + 8)) {
          if (lVar21 == lVar12) goto LAB_7ff70c9334b0;
        }
      }
LAB_7ff70c9334b3:
      if ((lVar21 != 0) && (lVar21 != lVar2)) {
        lVar20 = *(longlong *)(lVar21 + 0x20);
        uVar8 = *(ulonglong *)(lVar21 + 0x28);
      }
      puVar4 = (ulonglong *)param_1[1];
      uVar11 = *puVar4;
      lVar21 = *(longlong *)(lVar17 + 8 + uVar11 * 0x18);
      uVar9 = *(ulonglong *)(lVar17 + 0x10 + uVar11 * 0x18);
      uVar18 = uVar9;
      lVar12 = lVar21;
      if (uVar9 == 0) {
        lVar14 = (uVar7 & 0xbf29ce484222325) * 0x10;
        lVar16 = *(longlong *)(lVar3 + 8 + lVar14);
        if (lVar16 != lVar2) {
          if (*(longlong *)(lVar16 + 0x18) != 0) {
            do {
              if (lVar16 == *(longlong *)(lVar3 + lVar14)) goto LAB_7ff70c9336b0;
              lVar16 = *(longlong *)(lVar16 + 8);
            } while (*(longlong *)(lVar16 + 0x18) != 0);
          }
LAB_7ff70c933690:
          if ((lVar16 != 0) && (lVar16 != lVar2)) {
            uVar18 = *(ulonglong *)(lVar16 + 0x28);
            lVar12 = *(longlong *)(lVar16 + 0x20);
          }
        }
      }
      else {
        uVar10 = (ulonglong)((uint)uVar9 & 3);
        if (uVar9 < 4) {
          uVar15 = 0;
          uVar13 = 0xcbf29ce484222325;
LAB_7ff70c9335e1:
          uVar19 = 0;
          do {
            uVar13 = (*(byte *)(uVar15 + lVar21 + uVar19) ^ uVar13) * 0x100000001b3;
            uVar19 = uVar19 + 1;
          } while (uVar10 != uVar19);
        }
        else {
          uVar15 = 0;
          uVar13 = 0xcbf29ce484222325;
          do {
            uVar13 = ((ulonglong)*(byte *)(lVar21 + 3 + uVar15) ^
                     ((ulonglong)*(byte *)(lVar21 + 2 + uVar15) ^
                     ((ulonglong)*(byte *)(lVar21 + 1 + uVar15) ^
                     (*(byte *)(lVar21 + uVar15) ^ uVar13) * 0x100000001b3) * 0x100000001b3) *
                     0x100000001b3) * 0x100000001b3;
            uVar15 = uVar15 + 4;
          } while ((uVar9 & 0xfffffffffffffffc) != uVar15);
          if (uVar10 != 0) goto LAB_7ff70c9335e1;
        }
        lVar14 = (uVar13 & uVar7) * 0x10;
        lVar16 = *(longlong *)(lVar3 + 8 + lVar14);
        if (lVar16 != lVar2) {
          lVar14 = *(longlong *)(lVar3 + lVar14);
          uVar10 = *(ulonglong *)(lVar16 + 0x18);
          while( true ) {
            if ((uVar9 == uVar10) &&
               (iVar5 = FUN_7ff70cb12b50(lVar21,*(undefined8 *)(lVar16 + 0x10)), iVar5 == 0))
            goto LAB_7ff70c933690;
            if (lVar16 == lVar14) break;
            lVar16 = *(longlong *)(lVar16 + 8);
            uVar10 = *(ulonglong *)(lVar16 + 0x18);
          }
        }
      }
LAB_7ff70c9336b0:
      if ((uVar18 == uVar8) &&
         ((uVar8 == 0 || (iVar5 = FUN_7ff70cb12b50(lVar12,lVar20), iVar5 == 0)))) {
        iVar6 = iVar6 + 1;
      }
      else {
        lVar20 = *param_3;
        uVar8 = param_3[1];
        if (uVar8 == 0) {
          lVar16 = (uVar7 & 0xbf29ce484222325) * 0x10;
          lVar12 = *(longlong *)(lVar3 + 8 + lVar16);
          if (lVar12 != lVar2) {
            if (*(longlong *)(lVar12 + 0x18) != 0) {
              do {
                if (lVar12 == *(longlong *)(lVar3 + lVar16)) goto LAB_7ff70c933884;
                lVar12 = *(longlong *)(lVar12 + 8);
              } while (*(longlong *)(lVar12 + 0x18) != 0);
            }
LAB_7ff70c933870:
            if ((lVar12 != 0) && (lVar12 != lVar2)) {
              lVar20 = *(longlong *)(lVar12 + 0x20);
              uVar8 = *(ulonglong *)(lVar12 + 0x28);
            }
          }
        }
        else {
          uVar18 = (ulonglong)((uint)uVar8 & 3);
          if (uVar8 < 4) {
            uVar10 = 0;
            uVar15 = 0xcbf29ce484222325;
LAB_7ff70c9337e1:
            uVar13 = 0;
            do {
              uVar15 = (*(byte *)(uVar10 + lVar20 + uVar13) ^ uVar15) * 0x100000001b3;
              uVar13 = uVar13 + 1;
            } while (uVar18 != uVar13);
          }
          else {
            uVar10 = 0;
            uVar15 = 0xcbf29ce484222325;
            do {
              uVar15 = ((ulonglong)*(byte *)(lVar20 + 3 + uVar10) ^
                       ((ulonglong)*(byte *)(lVar20 + 2 + uVar10) ^
                       ((ulonglong)*(byte *)(lVar20 + 1 + uVar10) ^
                       (*(byte *)(lVar20 + uVar10) ^ uVar15) * 0x100000001b3) * 0x100000001b3) *
                       0x100000001b3) * 0x100000001b3;
              uVar10 = uVar10 + 4;
            } while ((uVar8 & 0xfffffffffffffffc) != uVar10);
            if (uVar18 != 0) goto LAB_7ff70c9337e1;
          }
          lVar16 = (uVar15 & uVar7) * 0x10;
          lVar12 = *(longlong *)(lVar3 + 8 + lVar16);
          if (lVar12 != lVar2) {
            lVar16 = *(longlong *)(lVar3 + lVar16);
            uVar18 = *(ulonglong *)(lVar12 + 0x18);
            while( true ) {
              if ((uVar8 == uVar18) &&
                 (iVar5 = FUN_7ff70cb12b50(lVar20,*(undefined8 *)(lVar12 + 0x10)), iVar5 == 0))
              goto LAB_7ff70c933870;
              if (lVar12 == lVar16) break;
              lVar12 = *(longlong *)(lVar12 + 8);
              uVar18 = *(ulonglong *)(lVar12 + 0x18);
            }
          }
        }
LAB_7ff70c933884:
        if (uVar9 == 0) {
          lVar16 = (uVar7 & 0xbf29ce484222325) * 0x10;
          lVar12 = *(longlong *)(lVar3 + 8 + lVar16);
          if (lVar12 == lVar2) {
            lVar12 = 0;
          }
          else if (*(longlong *)(lVar12 + 0x18) != 0) {
            do {
              if (lVar12 == *(longlong *)(lVar3 + lVar16)) goto LAB_7ff70c933a04;
              lVar12 = *(longlong *)(lVar12 + 8);
            } while (*(longlong *)(lVar12 + 0x18) != 0);
          }
LAB_7ff70c9339f0:
          if ((lVar12 != 0) && (lVar12 != lVar2)) {
            lVar21 = *(longlong *)(lVar12 + 0x20);
            uVar9 = *(ulonglong *)(lVar12 + 0x28);
          }
        }
        else {
          uVar18 = (ulonglong)((uint)uVar9 & 3);
          if (uVar9 < 4) {
            uVar10 = 0;
            uVar15 = 0xcbf29ce484222325;
LAB_7ff70c933971:
            uVar13 = 0;
            do {
              uVar15 = (*(byte *)(uVar10 + lVar21 + uVar13) ^ uVar15) * 0x100000001b3;
              uVar13 = uVar13 + 1;
            } while (uVar18 != uVar13);
          }
          else {
            uVar10 = 0;
            uVar15 = 0xcbf29ce484222325;
            do {
              uVar15 = ((ulonglong)*(byte *)(lVar21 + 3 + uVar10) ^
                       ((ulonglong)*(byte *)(lVar21 + 2 + uVar10) ^
                       ((ulonglong)*(byte *)(lVar21 + 1 + uVar10) ^
                       (*(byte *)(lVar21 + uVar10) ^ uVar15) * 0x100000001b3) * 0x100000001b3) *
                       0x100000001b3) * 0x100000001b3;
              uVar10 = uVar10 + 4;
            } while ((uVar9 & 0xfffffffffffffffc) != uVar10);
            if (uVar18 != 0) goto LAB_7ff70c933971;
          }
          lVar16 = (uVar15 & uVar7) * 0x10;
          lVar12 = *(longlong *)(lVar3 + 8 + lVar16);
          if (lVar12 != lVar2) {
            lVar3 = *(longlong *)(lVar3 + lVar16);
            uVar7 = *(ulonglong *)(lVar12 + 0x18);
            while( true ) {
              if ((uVar9 == uVar7) &&
                 (iVar5 = FUN_7ff70cb12b50(lVar21,*(undefined8 *)(lVar12 + 0x10)), iVar5 == 0))
              goto LAB_7ff70c9339f0;
              if (lVar12 == lVar3) break;
              lVar12 = *(longlong *)(lVar12 + 8);
              uVar7 = *(ulonglong *)(lVar12 + 0x18);
            }
          }
        }
LAB_7ff70c933a04:
        if ((uVar9 == uVar8) &&
           ((uVar8 == 0 || (iVar5 = FUN_7ff70cb12b50(lVar21,lVar20), iVar5 == 0)))) {
          bVar22 = iVar6 == 0;
          iVar6 = iVar6 + -1;
          if (bVar22) {
            return bStack_99;
          }
        }
        else {
          bStack_99 = bStack_99 & *(int *)(lVar17 + uVar11 * 0x18) == 6;
        }
      }
      *puVar4 = uVar11 + 1;
      lVar17 = *(longlong *)param_1[2];
    } while (uVar11 + 1 <
             (ulonglong)((((longlong *)param_1[2])[1] - lVar17 >> 3) * -0x5555555555555555));
  }
  return bStack_99;
}


