/* 7ff70c9dde80 FUN_7ff70c9dde80 */

/* WARNING: Control flow encountered bad instruction data */

uint FUN_7ff70c9dde80(longlong param_1,longlong param_2,undefined1 *param_3,uint param_4)

{
  short sVar1;
  uint uVar2;
  int *piVar3;
  code *pcVar4;
  char cVar5;
  int iVar6;
  undefined8 uVar7;
  char *pcVar8;
  longlong lVar9;
  longlong lVar10;
  undefined *puVar11;
  uint uVar12;
  undefined1 *puVar13;
  code **ppcVar14;
  longlong *plVar15;
  code *unaff_R12;
  uint *unaff_R13;
  ulonglong uVar16;
  ulonglong uVar17;
  short *psVar18;
  byte bVar19;
  char in_AF;
  bool bVar20;
  bool bVar21;
  char cVar22;
  char cVar23;
  longlong alStack_c8 [2];
  code *apcStack_b8 [4];
  undefined1 *puStack_98;
  undefined8 *puStack_90;
  uint **ppuStack_88;
  undefined4 *puStack_80;
  uint *puStack_70;
  undefined4 uStack_64;
  ulonglong uStack_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  
  uVar16 = (ulonglong)param_4;
  uStack_58 = 0;
  uStack_50 = 0;
  uStack_48 = 0;
  puStack_70 = (uint *)0x0;
  uStack_64 = 0;
  puStack_98._0_4_ = 3;
  cVar5 = FUN_7ff70c983220(6,2,0,2);
  if (cVar5 != '\0') {
    puStack_90 = (undefined8 *)CONCAT44(puStack_90._4_4_,param_4);
    puStack_98 = param_3;
    func_0x7ff70d5afcfb(param_2,6,0x10002,0);
                    /* WARNING: Bad instruction - Truncating control flow here */
    halt_baddata();
  }
  bVar20 = param_3 == (undefined1 *)0x0;
  bVar21 = param_4 == 0;
  if (!bVar21 && !bVar20) {
    *param_3 = 0;
  }
  if (param_2 == 0) {
    puVar11 = &UNK_7ff70cb8c141;
  }
  else {
    lVar9 = *(longlong *)(param_2 + 0x18);
    if (lVar9 == 0) {
      puVar11 = &UNK_7ff70cb8cb1d;
    }
    else {
      uVar7 = func_0x7ff70d9d8dd2(&UNK_7ff70cb8b36e,*(undefined4 *)(lVar9 + 0xc0),
                                  *(undefined8 *)(lVar9 + 200));
      lVar9 = CONCAT71((int7)((ulonglong)uVar7 >> 8),0x48);
      if ((int)lVar9 != 0) {
        uStack_58 = CONCAT44(uStack_58._4_4_,0x18);
        puStack_80 = &uStack_64;
        ppuStack_88 = &puStack_70;
        puStack_90 = &uStack_58;
        puStack_98 = (undefined1 *)CONCAT44(puStack_98._4_4_,0x8001);
        lVar10 = 0x10001;
        pcVar8 = (char *)func_0x7ff70d5931e7(0x10001,&UNK_7ff70cb8b36e,*(undefined8 *)(lVar9 + 0x18)
                                             ,*(undefined4 *)(lVar9 + 0x10));
        *pcVar8 = *pcVar8 + (char)pcVar8;
        pcVar8 = (char *)(uVar16 + 0x6c + lVar10 * 4);
        *pcVar8 = *pcVar8 + (char)lVar10;
        uVar2 = *unaff_R13;
        uVar17 = (ulonglong)uVar2;
        if (uVar17 == 0) {
          uVar12 = 1;
        }
        else if (bVar21 || bVar20) {
          if (param_1 == 0) {
            piVar3 = *(int **)(unaff_R13 + 2);
            uVar12 = 1;
            if (*piVar3 == 3) {
              uVar16 = *(ulonglong *)(piVar3 + 2);
              bVar19 = 0;
              cVar23 = (longlong)uVar16 < 0;
              cVar22 = uVar16 == 0;
              cVar5 = (POPCOUNT(uVar16 & 0xff) & 1U) == 0;
              if (!(bool)cVar22) {
                uVar7 = func_0x7ff70d7f5733();
                uVar12 = (int)CONCAT62((int6)((ulonglong)uVar7 >> 0x10),
                                       CONCAT11(cVar23 << 7 | cVar22 << 6 | in_AF << 4 | cVar5 << 2
                                                | 2U | bVar19,(char)uVar7)) + 2;
              }
            }
            pcVar4 = apcStack_b8[0];
            if (uVar2 == 1) {
              return uVar12;
            }
            plVar15 = (longlong *)(piVar3 + 8);
            lVar9 = uVar17 - 1;
            apcStack_b8[0] = (code *)0x7ff70c9de202;
            func_0x7ff70d5a1414();
            do {
              if (((int)plVar15[-1] == 3) && (*plVar15 != 0)) {
                apcStack_b8[0] = (code *)0x7ff70c9de222;
                iVar6 = (*pcVar4)();
                uVar12 = uVar12 + iVar6 + 1;
              }
              plVar15 = plVar15 + 3;
              lVar9 = lVar9 + -1;
            } while (lVar9 != 0);
          }
          else {
            uVar12 = 1;
            lVar9 = 8;
            uVar16 = 0;
            ppcVar14 = apcStack_b8;
            do {
              puVar13 = (undefined1 *)ppcVar14;
              if (*(int *)(*(longlong *)(unaff_R13 + 2) + -8 + lVar9) == 3) {
                lVar10 = *(longlong *)(*(longlong *)(unaff_R13 + 2) + lVar9);
                if (lVar10 == 0) {
                  if (*(char *)(param_1 + 0xa37) == '\x01') {
                    *(undefined8 *)((longlong)ppcVar14 + -8) = 0x7ff70c9de12f;
                    FUN_7ff70c941400(param_1,&UNK_7ff70cb8d393);
                    unaff_R13 = *(uint **)((longlong)ppcVar14 + 0x48);
                    uVar17 = (ulonglong)*unaff_R13;
                  }
                }
                else {
                  puVar13 = (undefined1 *)((longlong)ppcVar14 + -8);
                  *(longlong *)((longlong)ppcVar14 + -8) = lVar10;
                  *(undefined8 *)((longlong)ppcVar14 + -0x10) = 0x7ff70c9de0ef;
                  iVar6 = func_0x7ff70d5dad83();
                  uVar12 = uVar12 + iVar6 + 1;
                }
              }
              uVar16 = uVar16 + 1;
              lVar9 = lVar9 + 0x18;
              ppcVar14 = (code **)puVar13;
            } while (uVar16 < uVar17);
          }
        }
        else {
          uVar12 = 1;
          uStack_60 = uVar16;
          if (param_1 == 0) {
            uVar16 = 0;
            do {
              if ((*(int *)(*(longlong *)(unaff_R13 + 2) + uVar16 * 0x18) == 3) &&
                 (psVar18 = *(short **)(*(longlong *)(unaff_R13 + 2) + uVar16 * 0x18 + 8),
                 psVar18 != (short *)0x0)) {
                lVar9 = func_0x7ff70d9084c2(psVar18);
                if (uStack_60 < (ulonglong)uVar12 + lVar9 + 1) goto LAB_7ff70c9de228;
                sVar1 = *psVar18;
                while (sVar1 != 0) {
                  psVar18 = psVar18 + 1;
                  *param_3 = (char)sVar1;
                  param_3 = param_3 + 1;
                  sVar1 = *psVar18;
                }
                *param_3 = 0;
                param_3 = param_3 + 1;
                uVar12 = uVar12 + (int)lVar9 + 1;
                uVar17 = (ulonglong)*puStack_70;
                unaff_R13 = puStack_70;
              }
              uVar16 = uVar16 + 1;
            } while (uVar16 < uVar17);
          }
          else {
            uVar16 = 0;
            func_0x7ff70d598203();
            do {
              if (*(int *)(*(longlong *)(unaff_R13 + 2) + uVar16 * 0x18) == 3) {
                psVar18 = *(short **)(*(longlong *)(unaff_R13 + 2) + uVar16 * 0x18 + 8);
                if (psVar18 == (short *)0x0) {
                  if (*(char *)(param_1 + 0xa37) == '\x01') {
                    FUN_7ff70c941400(param_1,&UNK_7ff70cb8d393);
                  }
                }
                else {
                  lVar9 = (*unaff_R12)(psVar18);
                  if (uStack_60 < (ulonglong)uVar12 + lVar9 + 1) goto LAB_7ff70c9de228;
                  sVar1 = *psVar18;
                  while (sVar1 != 0) {
                    psVar18 = psVar18 + 1;
                    *param_3 = (char)sVar1;
                    param_3 = param_3 + 1;
                    sVar1 = *psVar18;
                  }
                  *param_3 = 0;
                  param_3 = param_3 + 1;
                  uVar12 = uVar12 + (int)lVar9 + 1;
                }
              }
              uVar16 = uVar16 + 1;
              unaff_R13 = puStack_70;
            } while (uVar16 < *puStack_70);
          }
        }
        if (bVar21 || bVar20) {
          return uVar12;
        }
        goto LAB_7ff70c9de0cb;
      }
      puVar11 = &UNK_7ff70cb8cc89;
    }
  }
  FUN_7ff70c9412d0(param_1,puVar11);
  return 1;
LAB_7ff70c9de228:
  FUN_7ff70c9412d0(param_1,&UNK_7ff70cb8c78e);
LAB_7ff70c9de0cb:
  *param_3 = 0;
  return uVar12;
}


