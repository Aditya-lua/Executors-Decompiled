/* 7ff70c7cb410 FUN_7ff70c7cb410 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 * FUN_7ff70c7cb410(longlong param_1,longlong param_2)

{
  uint uVar1;
  longlong lVar2;
  short *psVar3;
  longlong lVar4;
  longlong lVar5;
  code *pcVar6;
  char cVar7;
  int iVar8;
  int iVar9;
  undefined8 *puVar10;
  longlong lVar11;
  undefined8 uVar12;
  longlong lVar13;
  int iVar14;
  longlong lVar15;
  longlong lVar16;
  longlong lVar17;
  longlong lVar18;
  int iVar19;
  undefined *puVar20;
  uint uVar21;
  longlong lVar23;
  undefined8 *puVar24;
  uint uVar25;
  undefined4 uVar26;
  undefined4 extraout_XMM0_Da;
  undefined4 extraout_XMM0_Da_00;
  undefined4 extraout_XMM0_Da_01;
  undefined4 extraout_XMM0_Da_02;
  undefined4 extraout_XMM0_Da_03;
  undefined4 extraout_XMM0_Da_04;
  ulonglong uVar22;
  
  if (*(longlong *)(param_1 + 0x2b0) == 0) {
    FUN_7ff70c7cbc20(param_1);
    if (*(char *)(param_2 + 0x35) == '\0') goto LAB_7ff70c7cb469;
LAB_7ff70c7cb436:
    puVar10 = *(undefined8 **)
               (*(longlong *)(param_1 + 0x70) + -8 + (longlong)*(int *)(param_1 + 0x68) * 8);
    iVar9 = *(int *)(param_1 + 0x78);
    if (iVar9 != *(int *)(param_1 + 0x7c)) goto LAB_7ff70c7cb44f;
LAB_7ff70c7cb543:
    if (iVar9 == 0) {
      iVar14 = 8;
    }
    else {
      iVar14 = iVar9 / 2 + iVar9;
    }
    iVar8 = iVar9 + 1;
    if (iVar9 + 1 < iVar14) {
      iVar8 = iVar14;
    }
    lVar11 = FUN_7ff70c802100((longlong)iVar8 * 0x90);
    if (*(longlong *)(param_1 + 0x80) != 0) {
      FUN_7ff70cb12b60(lVar11,*(longlong *)(param_1 + 0x80),
                       (longlong)*(int *)(param_1 + 0x78) * 0x90);
      FUN_7ff70c802510(*(undefined8 *)(param_1 + 0x80));
    }
    *(longlong *)(param_1 + 0x80) = lVar11;
    *(int *)(param_1 + 0x7c) = iVar8;
    iVar9 = *(int *)(param_1 + 0x78);
  }
  else {
    if (*(char *)(param_2 + 0x35) != '\0') goto LAB_7ff70c7cb436;
LAB_7ff70c7cb469:
    puVar10 = (undefined8 *)FUN_7ff70c802100(0x50);
    puVar10[8] = 0;
    puVar10[9] = 0;
    *puVar10 = 0;
    puVar10[1] = 0;
    puVar10[2] = 0;
    puVar10[3] = 0;
    puVar10[4] = 0;
    puVar10[5] = 0;
    puVar10[6] = 0;
    puVar10[7] = 0;
    *(undefined4 *)(puVar10 + 9) = 0x3f800000;
    iVar9 = *(int *)(param_1 + 0x29c);
    *(int *)(param_1 + 0x29c) = iVar9 + 1;
    *(int *)(puVar10 + 3) = iVar9;
    *(undefined4 *)(puVar10 + 2) = *(undefined4 *)(param_2 + 0x74);
    *(undefined4 *)((longlong)puVar10 + 0x1c) = *(undefined4 *)(param_2 + 0x3c);
    *(undefined4 *)((longlong)puVar10 + 0x14) = *(undefined4 *)(param_2 + 0x70);
    iVar9 = *(int *)(param_1 + 0x68);
    if (iVar9 == *(int *)(param_1 + 0x6c)) {
      if (iVar9 == 0) {
        iVar14 = 8;
      }
      else {
        iVar14 = iVar9 / 2 + iVar9;
      }
      iVar8 = iVar9 + 1;
      if (iVar9 + 1 < iVar14) {
        iVar8 = iVar14;
      }
      lVar11 = FUN_7ff70c802100((longlong)iVar8 << 3);
      if (*(longlong *)(param_1 + 0x70) != 0) {
        FUN_7ff70cb12b60(lVar11,*(longlong *)(param_1 + 0x70),
                         (longlong)*(int *)(param_1 + 0x68) << 3);
        FUN_7ff70c802510(*(undefined8 *)(param_1 + 0x70));
      }
      *(longlong *)(param_1 + 0x70) = lVar11;
      *(int *)(param_1 + 0x6c) = iVar8;
      iVar9 = *(int *)(param_1 + 0x68);
    }
    else {
      lVar11 = *(longlong *)(param_1 + 0x70);
    }
    *(undefined8 **)(lVar11 + (longlong)iVar9 * 8) = puVar10;
    *(int *)(param_1 + 0x68) = *(int *)(param_1 + 0x68) + 1;
    iVar9 = *(int *)(param_1 + 0x78);
    if (iVar9 == *(int *)(param_1 + 0x7c)) goto LAB_7ff70c7cb543;
LAB_7ff70c7cb44f:
    lVar11 = *(longlong *)(param_1 + 0x80);
  }
  uVar26 = FUN_7ff70cb12b60((longlong)iVar9 * 0x90 + lVar11,param_2,0x90);
  lVar15 = (longlong)*(int *)(param_1 + 0x78) + 1;
  *(int *)(param_1 + 0x78) = (int)lVar15;
  lVar16 = *(longlong *)(param_1 + 0x80);
  lVar15 = lVar15 * 0x90;
  lVar11 = lVar16 + lVar15;
  if (*(longlong *)(lVar16 + -0x18 + lVar15) == 0) {
    *(undefined8 **)(lVar11 + -0x18) = puVar10;
    lVar16 = lVar16 + lVar15 + -0x90;
    iVar9 = *(int *)(puVar10 + 4);
    if (iVar9 == *(int *)((longlong)puVar10 + 0x24)) goto LAB_7ff70c7cb604;
  }
  else {
    lVar16 = lVar16 + lVar15 + -0x90;
    iVar9 = *(int *)(puVar10 + 4);
    if (iVar9 == *(int *)((longlong)puVar10 + 0x24)) {
LAB_7ff70c7cb604:
      if (iVar9 == 0) {
        iVar14 = 8;
      }
      else {
        iVar14 = iVar9 / 2 + iVar9;
      }
      iVar8 = iVar9 + 1;
      if (iVar9 + 1 < iVar14) {
        iVar8 = iVar14;
      }
      lVar15 = FUN_7ff70c802100((longlong)iVar8 << 3);
      uVar26 = extraout_XMM0_Da;
      if (puVar10[5] != 0) {
        FUN_7ff70cb12b60(lVar15,puVar10[5],(longlong)*(int *)(puVar10 + 4) << 3);
        uVar26 = FUN_7ff70c802510(puVar10[5]);
      }
      puVar10[5] = lVar15;
      *(int *)((longlong)puVar10 + 0x24) = iVar8;
      iVar9 = *(int *)(puVar10 + 4);
      goto LAB_7ff70c7cb687;
    }
  }
  lVar15 = puVar10[5];
LAB_7ff70c7cb687:
  *(longlong *)(lVar15 + (longlong)iVar9 * 8) = lVar16;
  *(int *)(puVar10 + 4) = *(int *)(puVar10 + 4) + 1;
  iVar9 = *(int *)(param_1 + 0x68);
  if ((longlong)iVar9 != 0) {
    lVar15 = *(longlong *)(param_1 + 0x70);
    lVar23 = 0;
    do {
      lVar2 = *(longlong *)(lVar15 + lVar23);
      if (*(int *)(lVar2 + 0x24) < 0) {
        uVar12 = FUN_7ff70c802100(0);
        uVar26 = extraout_XMM0_Da_00;
        if (*(longlong *)(lVar2 + 0x28) != 0) {
          FUN_7ff70cb12b60(uVar12,*(longlong *)(lVar2 + 0x28),(longlong)*(int *)(lVar2 + 0x20) << 3)
          ;
          uVar26 = FUN_7ff70c802510();
        }
        *(undefined8 *)(lVar2 + 0x28) = uVar12;
        *(undefined4 *)(lVar2 + 0x24) = 0;
      }
      *(undefined4 *)(lVar2 + 0x20) = 0;
      lVar23 = lVar23 + 8;
    } while ((longlong)iVar9 * 8 != lVar23);
  }
  iVar9 = *(int *)(param_1 + 0x78);
  if ((longlong)iVar9 != 0) {
    lVar15 = *(longlong *)(param_1 + 0x80);
    lVar23 = 0;
    do {
      lVar2 = *(longlong *)(lVar15 + 0x78 + lVar23);
      iVar14 = *(int *)(lVar2 + 0x20);
      if (iVar14 == *(int *)(lVar2 + 0x24)) {
        if (iVar14 == 0) {
          iVar8 = 8;
        }
        else {
          iVar8 = iVar14 / 2 + iVar14;
        }
        iVar19 = iVar14 + 1;
        if (iVar14 + 1 < iVar8) {
          iVar19 = iVar8;
        }
        lVar13 = FUN_7ff70c802100((longlong)iVar19 << 3);
        uVar26 = extraout_XMM0_Da_01;
        if (*(longlong *)(lVar2 + 0x28) != 0) {
          FUN_7ff70cb12b60(lVar13,*(longlong *)(lVar2 + 0x28),(longlong)*(int *)(lVar2 + 0x20) << 3)
          ;
          uVar26 = FUN_7ff70c802510(*(undefined8 *)(lVar2 + 0x28));
        }
        *(longlong *)(lVar2 + 0x28) = lVar13;
        *(int *)(lVar2 + 0x24) = iVar19;
        iVar14 = *(int *)(lVar2 + 0x20);
      }
      else {
        lVar13 = *(longlong *)(lVar2 + 0x28);
      }
      *(longlong *)(lVar13 + (longlong)iVar14 * 8) = lVar15 + lVar23;
      *(int *)(lVar2 + 0x20) = *(int *)(lVar2 + 0x20) + 1;
      lVar23 = lVar23 + 0x90;
    } while ((longlong)iVar9 * 0x90 != lVar23);
  }
  if (*(char *)(lVar11 + -0x5c) == '\0') {
    *(undefined1 *)(lVar11 + -0x5c) = 1;
    uVar12 = FUN_7ff70c802200(*(undefined8 *)(lVar11 + -0x68),(longlong)*(int *)(lVar11 + -0x60));
    *(undefined8 *)(lVar11 + -0x68) = uVar12;
    uVar26 = extraout_XMM0_Da_02;
  }
  psVar3 = *(short **)(lVar11 + -0x48);
  if (psVar3 != (short *)0x0) {
    if (*psVar3 == 0) {
      iVar9 = 2;
    }
    else {
      iVar9 = FUN_7ff70cb12cf0(psVar3 + 1);
      iVar9 = iVar9 * 2 + 4;
    }
    uVar12 = FUN_7ff70c802200(psVar3,iVar9);
    *(undefined8 *)(lVar11 + -0x48) = uVar12;
    uVar26 = extraout_XMM0_Da_03;
  }
  lVar15 = *(longlong *)(lVar11 + -0x10);
  if (lVar15 == 0) {
    lVar15 = *(longlong *)(param_1 + 0x2b8);
  }
  if ((*(code **)(lVar15 + 0x18) == (code *)0x0) ||
     (cVar7 = (**(code **)(lVar15 + 0x18))(param_1,lVar16), uVar26 = extraout_XMM0_Da_04,
     cVar7 != '\0')) {
    if (*(char *)(lVar11 + -0x5b) == '\0') {
      lVar11 = puVar10[1];
      if (((lVar11 != 0) && (lVar15 = *(longlong *)(lVar11 + 0x2b0), lVar15 != 0)) &&
         (iVar9 = *(int *)(lVar15 + 0xc0), 0 < iVar9)) {
        uVar25 = 0;
        do {
          lVar23 = *(longlong *)(*(longlong *)(lVar15 + 0xd0) + (ulonglong)(uVar25 >> 5) * 8);
          lVar13 = (ulonglong)(uVar25 & 0x1f) * 0x68;
          lVar2 = *(longlong *)(lVar11 + 0x2b0);
          if (((*(int *)(lVar23 + 0x50 + lVar13) <= *(int *)(lVar2 + 0xa4)) &&
              (puVar24 = (undefined8 *)(lVar23 + lVar13), (undefined8 *)puVar24[0xb] == puVar10)) &&
             ((*(byte *)((longlong)puVar24 + 0x4f) & 4) == 0)) {
            if ((_DAT_7ff70cc1a3c0 != 0) && ((*(byte *)(_DAT_7ff70cc1a3c0 + 0x27b5) & 1) != 0)) {
              puVar20 = &UNK_7ff70cb8adf6;
              if (*(int *)(puVar10 + 4) != 0) {
                puVar20 = *(undefined **)puVar10[5];
              }
              FUN_7ff70c800cf0(&UNK_7ff70cb91e39,(double)*(float *)((longlong)puVar24 + 0x14),
                               puVar20);
            }
            iVar9 = *(int *)(puVar24 + 6);
            if ((longlong)iVar9 != 0) {
              lVar23 = puVar24[7];
              lVar13 = 0;
              do {
                uVar21 = *(uint *)(lVar23 + 0x28 + lVar13);
                if (uVar21 != 0xffffffff) {
                  uVar21 = uVar21 & 0xfffff;
                  uVar22 = (ulonglong)uVar21;
                  lVar17 = *(longlong *)(lVar11 + 0x2b0);
                  lVar4 = *(longlong *)(lVar17 + 0x68);
                  lVar5 = *(longlong *)(lVar17 + 0x78);
                  uVar1 = *(uint *)(lVar5 + uVar22 * 4);
                  lVar18 = (longlong)((ulonglong)uVar1 << 0x2c) >> 0x2c;
                  *(uint *)(lVar5 + uVar22 * 4) = uVar1 & 0xbfffffff;
                  *(uint *)(lVar5 + uVar22 * 4) =
                       uVar1 + 0x100000 & 0x3ff00000 | uVar1 & 0x80000000 |
                       *(uint *)(lVar17 + 0x90) & 0xfffff;
                  iVar14 = *(int *)(lVar11 + 8);
                  *(uint *)(lVar17 + 0x90) = uVar21;
                  *(int *)(lVar17 + 0x9c) = *(int *)(lVar17 + 0x9c) + 1;
                  *(int *)(lVar17 + 0xa0) =
                       *(int *)(lVar17 + 0xa0) +
                       ((uint)*(ushort *)(lVar4 + 6 + lVar18 * 8) + iVar14) *
                       ((uint)*(ushort *)(lVar4 + 4 + lVar18 * 8) + iVar14);
                  *(undefined4 *)(lVar4 + 4 + lVar18 * 8) = 0;
                }
                lVar13 = lVar13 + 0x2c;
              } while ((longlong)iVar9 * 0x2c - lVar13 != 0);
            }
            iVar9 = *(int *)(puVar10 + 4);
            lVar23 = puVar24[0xc];
            if ((longlong)iVar9 != 0) {
              lVar13 = puVar10[5];
              lVar17 = 0;
              do {
                lVar4 = *(longlong *)(*(longlong *)(lVar13 + lVar17) + 0x80);
                if (lVar4 == 0) {
                  lVar4 = *(longlong *)(lVar11 + 0x2b8);
                  pcVar6 = *(code **)(lVar4 + 0x38);
                }
                else {
                  pcVar6 = *(code **)(lVar4 + 0x38);
                }
                if (pcVar6 != (code *)0x0) {
                  (*pcVar6)(lVar11,*(longlong *)(lVar13 + lVar17),puVar24,lVar23);
                }
                lVar23 = lVar23 + *(longlong *)(lVar4 + 0x48);
                lVar17 = lVar17 + 8;
              } while ((longlong)iVar9 * 8 != lVar17);
              lVar23 = puVar24[0xc];
            }
            if (lVar23 != 0) {
              FUN_7ff70c802510(lVar23);
              puVar24[0xc] = 0;
            }
            uVar26 = FUN_7ff70c805e60(lVar2 + 0xd8,*(undefined4 *)((longlong)puVar24 + 0x54),0);
            *(int *)(lVar2 + 0xe8) = *(int *)(lVar2 + 0xe8) + 1;
            *(undefined4 *)(puVar24 + 2) = 0;
            if (puVar24[7] != 0) {
              puVar24[6] = 0;
              uVar26 = FUN_7ff70c802510();
              puVar24[7] = 0;
            }
            if (puVar24[1] != 0) {
              *puVar24 = 0;
              uVar26 = FUN_7ff70c802510();
              puVar24[1] = 0;
            }
            if (puVar24[5] != 0) {
              puVar24[4] = 0;
              uVar26 = FUN_7ff70c802510();
              puVar24[5] = 0;
            }
            *(undefined4 *)(puVar24 + 8) = 0xffffffff;
            *(undefined8 *)((longlong)puVar24 + 0x44) = 0;
            *(uint *)((longlong)puVar24 + 0x4c) =
                 *(uint *)((longlong)puVar24 + 0x4c) & 0xf8000000 | 0x4000000;
            *puVar10 = 0;
            iVar9 = *(int *)(lVar15 + 0xc0);
          }
          uVar25 = uVar25 + 1;
        } while ((int)uVar25 < iVar9);
      }
      *(undefined4 *)(puVar10 + 6) = 0;
      *(undefined1 *)((longlong)puVar10 + 0x34) = 0;
      *puVar10 = 0;
      puVar10[1] = param_1;
    }
    *(undefined1 *)(param_1 + 0x52) = 0;
    FUN_7ff70c7e7220(uVar26,puVar10,lVar16);
  }
  else {
    if (*(char *)(lVar11 + -0x5c) == '\x01') {
      FUN_7ff70c802510(*(undefined8 *)(lVar11 + -0x68));
    }
    *(undefined8 *)(lVar11 + -0x68) = 0;
    if (*(longlong *)(lVar11 + -0x48) != 0) {
      FUN_7ff70c802510();
    }
    *(undefined8 *)(lVar11 + -0x48) = 0;
    *(int *)(param_1 + 0x78) = *(int *)(param_1 + 0x78) + -1;
    *(int *)(puVar10 + 4) = *(int *)(puVar10 + 4) + -1;
    if (*(char *)(lVar11 + -0x5b) == '\0') {
      FUN_7ff70c7f71e0(puVar10);
      FUN_7ff70c802510(puVar10);
      *(int *)(param_1 + 0x68) = *(int *)(param_1 + 0x68) + -1;
      puVar10 = (undefined8 *)0x0;
    }
    else {
      puVar10 = (undefined8 *)0x0;
    }
  }
  return puVar10;
}


