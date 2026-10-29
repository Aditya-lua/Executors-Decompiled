/* 7ff70c7e7790 FUN_7ff70c7e7790 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

uint * FUN_7ff70c7e7790(longlong param_1,longlong param_2,float param_3,undefined4 param_4,
                       undefined4 param_5)

{
  uint *puVar1;
  uint *puVar2;
  undefined8 *puVar3;
  undefined4 *puVar4;
  ushort uVar5;
  int iVar6;
  int iVar7;
  longlong lVar8;
  longlong lVar9;
  code *pcVar10;
  ushort *puVar11;
  char cVar12;
  ushort uVar13;
  longlong lVar14;
  undefined8 uVar15;
  longlong *plVar16;
  byte *pbVar17;
  undefined8 uVar18;
  longlong lVar19;
  longlong lVar20;
  ulonglong uVar21;
  uint uVar22;
  ulonglong uVar23;
  ulonglong uVar24;
  uint uVar25;
  int iVar26;
  uint uVar27;
  uint uVar28;
  uint uVar29;
  ulonglong unaff_R13;
  float fVar30;
  undefined8 uStack_108;
  undefined8 uStack_100;
  undefined8 uStack_f8;
  undefined8 uStack_f0;
  undefined8 uStack_e8;
  undefined8 uStack_e0;
  undefined8 uStack_d8;
  undefined8 uStack_d0;
  undefined8 uStack_c8;
  undefined8 uStack_c0;
  undefined8 uStack_b8;
  undefined8 uStack_b0;
  undefined8 uStack_a8;
  longlong *plStack_98;
  byte *pbStack_90;
  undefined8 uStack_88;
  longlong lStack_80;
  longlong lStack_78;
  undefined8 uStack_70;
  
  uStack_70 = 0xfffffffffffffffe;
  lStack_78 = param_1;
  if ((_DAT_7ff70cc1a3c0 != 0) && ((*(byte *)(_DAT_7ff70cc1a3c0 + 0x27b5) & 1) != 0)) {
    FUN_7ff70c800cf0(&UNK_7ff70cb90df0,(double)param_3);
  }
  lVar19 = *(longlong *)(lStack_78 + 0x2b0);
  uStack_c0 = 0;
  uStack_b8 = 0;
  uStack_b0 = 0;
  uStack_d8 = 0;
  uStack_d0 = 0;
  uStack_e8 = 0;
  uStack_e0 = 0;
  uStack_f8 = 0;
  uStack_f0 = 0;
  uStack_108 = 0;
  uStack_100 = 0;
  uStack_a8 = 0;
  uStack_c8 = 0xffffffff;
  iVar6 = *(int *)(lVar19 + 0xc0);
  if (iVar6 == *(int *)(lVar19 + 0xc4)) {
    iVar26 = iVar6 + 0x1f;
    if (-1 < iVar6) {
      iVar26 = iVar6;
    }
    iVar26 = iVar26 >> 5;
    uVar28 = (int)(iVar6 + 0x3fU) >> 5;
    unaff_R13 = (ulonglong)uVar28;
    if (iVar26 < (int)uVar28) {
      iVar7 = *(int *)(lVar19 + 0xcc);
      if (iVar7 < (int)uVar28) {
        if (iVar7 == 0) {
          uVar22 = 8;
        }
        else {
          uVar22 = iVar7 / 2 + iVar7;
        }
        if ((int)uVar22 <= (int)uVar28) {
          uVar22 = uVar28;
        }
        lVar14 = FUN_7ff70c802100((longlong)(int)uVar22 << 3);
        if (*(longlong *)(lVar19 + 0xd0) != 0) {
          lStack_80 = lVar14;
          FUN_7ff70cb12b60(lVar14,*(longlong *)(lVar19 + 0xd0),(longlong)*(int *)(lVar19 + 200) << 3
                          );
          FUN_7ff70c802510(*(undefined8 *)(lVar19 + 0xd0));
          lVar14 = lStack_80;
        }
        *(longlong *)(lVar19 + 0xd0) = lVar14;
        *(uint *)(lVar19 + 0xcc) = uVar22;
      }
      *(uint *)(lVar19 + 200) = uVar28;
      uVar23 = (ulonglong)iVar26;
      unaff_R13 = (ulonglong)(int)uVar28;
      do {
        uVar15 = FUN_7ff70c802100(0xd00);
        *(undefined8 *)(*(longlong *)(lVar19 + 0xd0) + uVar23 * 8) = uVar15;
        uVar23 = uVar23 + 1;
      } while (uVar23 != unaff_R13);
      *(uint *)(lVar19 + 0xc4) = iVar6 + 0x3fU & 0xffffffe0;
    }
  }
  else {
    iVar26 = iVar6 + 0x1f;
    if (-1 < iVar6) {
      iVar26 = iVar6;
    }
    iVar26 = iVar26 >> 5;
  }
  lVar14 = *(longlong *)(*(longlong *)(lVar19 + 0xd0) + (longlong)iVar26 * 8);
  lVar20 = (longlong)(iVar6 % 0x20) * 0x68;
  puVar1 = (uint *)(lVar14 + lVar20);
  *(undefined8 *)(lVar14 + 0x60 + lVar20) = uStack_a8;
  puVar3 = (undefined8 *)(lVar14 + 0x50 + lVar20);
  *puVar3 = uStack_b8;
  puVar3[1] = uStack_b0;
  puVar3 = (undefined8 *)(lVar14 + 0x40 + lVar20);
  *puVar3 = uStack_c8;
  puVar3[1] = uStack_c0;
  puVar4 = (undefined4 *)(lVar14 + 0x30 + lVar20);
  *puVar4 = (undefined4)uStack_d8;
  puVar4[1] = uStack_d8._4_4_;
  puVar4[2] = (undefined4)uStack_d0;
  puVar4[3] = uStack_d0._4_4_;
  puVar4 = (undefined4 *)(lVar14 + 0x20 + lVar20);
  *puVar4 = (undefined4)uStack_e8;
  puVar4[1] = uStack_e8._4_4_;
  puVar4[2] = (undefined4)uStack_e0;
  puVar4[3] = uStack_e0._4_4_;
  puVar4 = (undefined4 *)(lVar14 + 0x10 + lVar20);
  *puVar4 = (undefined4)uStack_f8;
  puVar4[1] = uStack_f8._4_4_;
  puVar4[2] = (undefined4)uStack_f0;
  puVar4[3] = uStack_f0._4_4_;
  puVar4 = (undefined4 *)(lVar14 + lVar20);
  *puVar4 = (uint)uStack_108;
  puVar4[1] = uStack_108._4_4_;
  puVar4[2] = (undefined4)uStack_100;
  puVar4[3] = uStack_100._4_4_;
  *(int *)(lVar19 + 0xc0) = *(int *)(lVar19 + 0xc0) + 1;
  *(float *)(lVar14 + 0x14 + lVar20) = param_3;
  *(undefined4 *)(lVar14 + 0x18 + lVar20) = param_4;
  *(undefined4 *)(lVar14 + 0x54 + lVar20) = param_5;
  *(longlong *)(lVar14 + 0x58 + lVar20) = param_2;
  *(undefined4 *)(lVar14 + 0x50 + lVar20) = *(undefined4 *)(*(longlong *)(lStack_78 + 0x2b0) + 0xa4)
  ;
  iVar6 = *(int *)(param_2 + 0x20);
  if ((longlong)iVar6 == 0) {
LAB_7ff70c7e7a98:
    lVar19 = 0;
    puVar1[0x18] = 0;
    puVar1[0x19] = 0;
    iVar6 = *(int *)(param_2 + 0x20);
  }
  else {
    plVar16 = *(longlong **)(param_2 + 0x28);
    if (iVar6 == 1) {
      lVar19 = 0;
LAB_7ff70c7e7a5e:
      lVar14 = *(longlong *)(*plVar16 + 0x80);
      if (lVar14 == 0) {
        lVar14 = *(longlong *)(lStack_78 + 0x2b8);
      }
      lVar19 = lVar19 + *(longlong *)(lVar14 + 0x48);
    }
    else {
      uVar23 = ((longlong)iVar6 - 1U & 0x1fffffffffffffff) + 1;
      uVar21 = uVar23 & 0xfffffffffffffffe;
      lVar19 = 0;
      do {
        lVar14 = *(longlong *)(*plVar16 + 0x80);
        if (lVar14 == 0) {
          lVar14 = *(longlong *)(lStack_78 + 0x2b8);
          lVar20 = *(longlong *)(plVar16[1] + 0x80);
        }
        else {
          lVar20 = *(longlong *)(plVar16[1] + 0x80);
        }
        if (lVar20 == 0) {
          lVar20 = *(longlong *)(lStack_78 + 0x2b8);
        }
        lVar19 = lVar19 + *(longlong *)(lVar14 + 0x48) + *(longlong *)(lVar20 + 0x48);
        plVar16 = plVar16 + 2;
        uVar21 = uVar21 - 2;
      } while (uVar21 != 0);
      if ((uVar23 & 1) != 0) goto LAB_7ff70c7e7a5e;
    }
    if (lVar19 == 0) goto LAB_7ff70c7e7a98;
    lVar19 = FUN_7ff70c802100();
    *(longlong *)(puVar1 + 0x18) = lVar19;
    iVar6 = *(int *)(param_2 + 0x20);
  }
  if ((longlong)iVar6 != 0) {
    lVar14 = *(longlong *)(param_2 + 0x28);
    lVar20 = 0;
    do {
      lVar8 = *(longlong *)(lVar14 + lVar20);
      lVar9 = *(longlong *)(lVar8 + 0x80);
      if (lVar9 == 0) {
        lVar9 = *(longlong *)(lStack_78 + 0x2b8);
        pcVar10 = *(code **)(lVar9 + 0x30);
      }
      else {
        pcVar10 = *(code **)(lVar9 + 0x30);
      }
      if (pcVar10 != (code *)0x0) {
        (*pcVar10)(lStack_78,lVar8,puVar1,lVar19);
      }
      lVar19 = lVar19 + *(longlong *)(lVar9 + 0x48);
      lVar20 = lVar20 + 8;
    } while ((longlong)iVar6 * 8 != lVar20);
  }
  if (puVar1[8] < 0x21) {
LAB_7ff70c7e7b2f:
    *(byte *)((longlong)puVar1 + 0x4f) = *(byte *)((longlong)puVar1 + 0x4f) | 8;
    lVar19 = *(longlong *)(puVar1 + 0x16);
    lStack_80 = *(longlong *)(lVar19 + 8);
    if ((*(char *)(lStack_80 + 0x50) == '\0') && ((*(byte *)(lVar19 + 0x10) & 4) == 0)) {
      if (*(int *)(lVar19 + 0x38) == 0) {
        uVar13 = 0x20;
        uVar5 = 0x20;
        if (*(short *)(lVar19 + 0x30) == 0x20) goto LAB_7ff70c7e7baa;
LAB_7ff70c7e7bc8:
        if ((longlong)*(int *)(lVar19 + 0x20) != 0) {
          plVar16 = *(longlong **)(lVar19 + 0x28);
          plStack_98 = plVar16 + *(int *)(lVar19 + 0x20);
          lVar19 = *(longlong *)(puVar1 + 0x18);
          unaff_R13 = 0;
          do {
            lVar14 = *plVar16;
            lVar20 = *(longlong *)(lVar14 + 0x80);
            if (lVar20 == 0) {
              lVar20 = *(longlong *)(lStack_80 + 0x2b8);
            }
            puVar11 = *(ushort **)(lVar14 + 0x48);
            uVar28 = (uint)unaff_R13;
            if (puVar11 != (ushort *)0x0) {
              uVar5 = *puVar11;
              while (uVar5 != 0) {
                if ((uVar5 <= uVar13) && (uVar13 <= puVar11[1])) goto LAB_7ff70c7e7c37;
                uVar5 = puVar11[2];
                puVar11 = puVar11 + 2;
              }
            }
            uStack_f8 = 0;
            uStack_f0 = 0;
            uStack_108 = 0;
            uStack_100 = 0;
            uStack_e8 = 0;
            uStack_e0 = CONCAT44(uStack_e0._4_4_,0xffffffff);
            cVar12 = (**(code **)(lVar20 + 0x40))
                               (lStack_80,lVar14,puVar1,lVar19,uVar13,&uStack_108,0);
            if (cVar12 != '\0') {
              unaff_R13 = 0;
              uStack_108 = CONCAT44(uStack_108._4_4_,
                                    ((uint)uStack_108 & 3) + (uVar28 & 0xf) * 4 + 0x800);
              pbVar17 = (byte *)FUN_7ff70c7e5b10(lStack_80,puVar1,lVar14,&uStack_108);
              goto LAB_7ff70c7e7e12;
            }
LAB_7ff70c7e7c37:
            lVar19 = lVar19 + *(longlong *)(lVar20 + 0x48);
            unaff_R13 = (ulonglong)(uVar28 + 1);
            plVar16 = plVar16 + 1;
          } while (plVar16 != plStack_98);
        }
        if ((*(byte *)((longlong)puVar1 + 0x4f) & 8) == 0) {
          if (puVar1[0x10] == 0xffffffff) {
            FUN_7ff70c7fc720(puVar1);
          }
          if ((int)puVar1[8] <= (int)(uint)uVar13) {
            uVar22 = uVar13 + 1;
            uVar28 = puVar1[1];
            if ((int)uVar28 <= (int)(uint)uVar13) {
              if (uVar28 == 0) {
                uVar28 = 8;
              }
              else {
                uVar28 = (int)uVar28 / 2 + uVar28;
              }
              if ((int)uVar28 <= (int)uVar22) {
                uVar28 = uVar22;
              }
              uVar15 = FUN_7ff70c802100((ulonglong)uVar28 * 4);
              if (*(longlong *)(puVar1 + 2) != 0) {
                FUN_7ff70cb12b60(uVar15,*(longlong *)(puVar1 + 2),(longlong)(int)*puVar1 << 2);
                FUN_7ff70c802510(*(undefined8 *)(puVar1 + 2));
              }
              *(undefined8 *)(puVar1 + 2) = uVar15;
              puVar1[1] = uVar28;
            }
            uVar23 = (ulonglong)(int)*puVar1;
            if ((int)*puVar1 <= (int)(uint)uVar13) {
              do {
                *(undefined4 *)(*(longlong *)(puVar1 + 2) + uVar23 * 4) = 0xbf800000;
                uVar23 = uVar23 + 1;
              } while (uVar22 != uVar23);
            }
            *puVar1 = uVar22;
            uVar28 = puVar1[9];
            if ((int)uVar28 <= (int)(uint)uVar13) {
              if (uVar28 == 0) {
                uVar28 = 8;
              }
              else {
                uVar28 = (int)uVar28 / 2 + uVar28;
              }
              if ((int)uVar28 <= (int)uVar22) {
                uVar28 = uVar22;
              }
              uVar15 = FUN_7ff70c802100(uVar28 * 2);
              if (*(longlong *)(puVar1 + 10) != 0) {
                FUN_7ff70cb12b60(uVar15,*(longlong *)(puVar1 + 10),(longlong)(int)puVar1[8] * 2);
                FUN_7ff70c802510(*(undefined8 *)(puVar1 + 10));
              }
              *(undefined8 *)(puVar1 + 10) = uVar15;
              puVar1[9] = uVar28;
            }
            uVar23 = (ulonglong)(int)puVar1[8];
            if ((int)puVar1[8] <= (int)(uint)uVar13) {
              do {
                *(undefined2 *)(*(longlong *)(puVar1 + 10) + uVar23 * 2) = 0xffff;
                uVar23 = uVar23 + 1;
              } while (uVar22 != uVar23);
            }
            puVar1[8] = uVar22;
          }
          *(uint *)(*(longlong *)(puVar1 + 2) + (ulonglong)uVar13 * 4) = puVar1[4];
          *(undefined2 *)(*(longlong *)(puVar1 + 10) + (ulonglong)uVar13 * 2) = 0xfffe;
        }
        goto LAB_7ff70c7e7e10;
      }
      uVar13 = FUN_7ff70c804a30(lVar19 + 0x38,0x20,0x20);
      uVar5 = uVar13;
      if (uVar13 != *(ushort *)(lVar19 + 0x30)) goto LAB_7ff70c7e7bc8;
LAB_7ff70c7e7baa:
      uVar13 = uVar5;
      if ((*(char *)(lVar19 + 0x35) != '\x01') ||
         (pbVar17 = (byte *)FUN_7ff70c7fcff0(lStack_80,puVar1), pbVar17 == (byte *)0x0))
      goto LAB_7ff70c7e7bc8;
    }
    else {
LAB_7ff70c7e7e10:
      pbVar17 = (byte *)0x0;
    }
LAB_7ff70c7e7e12:
    *(byte *)((longlong)puVar1 + 0x4f) = *(byte *)((longlong)puVar1 + 0x4f) & 0xf7;
    if (pbVar17 != (byte *)0x0) goto LAB_7ff70c7e7e1f;
LAB_7ff70c7e7b8a:
    uVar15 = 0;
    pbVar17 = (byte *)0x0;
    uVar28 = puVar1[8];
  }
  else {
    uVar5 = *(ushort *)(*(longlong *)(puVar1 + 10) + 0x40);
    if (uVar5 == 0xfffe) goto LAB_7ff70c7e7b8a;
    if (uVar5 == 0xffff) goto LAB_7ff70c7e7b2f;
    pbVar17 = (byte *)((ulonglong)uVar5 * 0x2c + *(longlong *)(puVar1 + 0xe));
    if (pbVar17 == (byte *)0x0) goto LAB_7ff70c7e7b8a;
LAB_7ff70c7e7e1f:
    *pbVar17 = *pbVar17 & 0xfd;
    uVar15 = CONCAT71((int7)(unaff_R13 >> 8),1);
    uVar28 = puVar1[8];
  }
  if (9 < uVar28) {
    uVar5 = *(ushort *)(*(longlong *)(puVar1 + 10) + 0x12);
    if (uVar5 == 0xfffe) {
      lVar19 = 0;
      goto LAB_7ff70c7e8133;
    }
    if (uVar5 != 0xffff) {
      lVar19 = (ulonglong)uVar5 * 0x2c + *(longlong *)(puVar1 + 0xe);
      goto LAB_7ff70c7e8133;
    }
  }
  *(byte *)((longlong)puVar1 + 0x4f) = *(byte *)((longlong)puVar1 + 0x4f) | 8;
  lVar14 = *(longlong *)(puVar1 + 0x16);
  lStack_80 = *(longlong *)(lVar14 + 8);
  if ((*(char *)(lStack_80 + 0x50) == '\0') && ((*(byte *)(lVar14 + 0x10) & 4) == 0)) {
    if (*(int *)(lVar14 + 0x38) == 0) {
      uVar13 = 9;
      uVar5 = 9;
      if (*(short *)(lVar14 + 0x30) == 9) goto LAB_7ff70c7e7eab;
LAB_7ff70c7e7ec6:
      pbStack_90 = pbVar17;
      uStack_88 = uVar15;
      if ((longlong)*(int *)(lVar14 + 0x20) != 0) {
        plVar16 = *(longlong **)(lVar14 + 0x28);
        plStack_98 = plVar16 + *(int *)(lVar14 + 0x20);
        lVar19 = *(longlong *)(puVar1 + 0x18);
        uVar28 = 0;
        do {
          lVar14 = *plVar16;
          lVar20 = *(longlong *)(lVar14 + 0x80);
          if (lVar20 == 0) {
            lVar20 = *(longlong *)(lStack_80 + 0x2b8);
          }
          puVar11 = *(ushort **)(lVar14 + 0x48);
          if (puVar11 != (ushort *)0x0) {
            uVar5 = *puVar11;
            while (uVar5 != 0) {
              if ((uVar5 <= uVar13) && (uVar13 <= puVar11[1])) goto LAB_7ff70c7e7f47;
              uVar5 = puVar11[2];
              puVar11 = puVar11 + 2;
            }
          }
          uStack_f8 = 0;
          uStack_f0 = 0;
          uStack_108 = 0;
          uStack_100 = 0;
          uStack_e8 = 0;
          uStack_e0 = CONCAT44(uStack_e0._4_4_,0xffffffff);
          cVar12 = (**(code **)(lVar20 + 0x40))(lStack_80,lVar14,puVar1,lVar19,uVar13,&uStack_108,0)
          ;
          if (cVar12 != '\0') {
            uStack_108 = CONCAT44(uStack_108._4_4_,
                                  ((uint)uStack_108 & 3) + (uVar28 & 0xf) * 4 + 0x240);
            lVar19 = FUN_7ff70c7e5b10(lStack_80,puVar1,lVar14,&uStack_108);
            pbVar17 = pbStack_90;
            uVar15 = uStack_88;
            goto LAB_7ff70c7e812f;
          }
LAB_7ff70c7e7f47:
          lVar19 = lVar19 + *(longlong *)(lVar20 + 0x48);
          uVar28 = uVar28 + 1;
          plVar16 = plVar16 + 1;
        } while (plVar16 != plStack_98);
      }
      uVar15 = uStack_88;
      if ((*(byte *)((longlong)puVar1 + 0x4f) & 8) == 0) {
        if (puVar1[0x10] == 0xffffffff) {
          FUN_7ff70c7fc720(puVar1);
        }
        pbVar17 = pbStack_90;
        if ((int)puVar1[8] <= (int)(uint)uVar13) {
          uVar22 = uVar13 + 1;
          uVar28 = puVar1[1];
          if ((int)uVar28 <= (int)(uint)uVar13) {
            if (uVar28 == 0) {
              uVar28 = 8;
            }
            else {
              uVar28 = (int)uVar28 / 2 + uVar28;
            }
            if ((int)uVar28 <= (int)uVar22) {
              uVar28 = uVar22;
            }
            uVar18 = FUN_7ff70c802100((ulonglong)uVar28 * 4);
            if (*(longlong *)(puVar1 + 2) != 0) {
              FUN_7ff70cb12b60(uVar18,*(longlong *)(puVar1 + 2),(longlong)(int)*puVar1 << 2);
              FUN_7ff70c802510(*(undefined8 *)(puVar1 + 2));
            }
            *(undefined8 *)(puVar1 + 2) = uVar18;
            puVar1[1] = uVar28;
          }
          uVar23 = (ulonglong)(int)*puVar1;
          if ((int)*puVar1 <= (int)(uint)uVar13) {
            do {
              *(undefined4 *)(*(longlong *)(puVar1 + 2) + uVar23 * 4) = 0xbf800000;
              uVar23 = uVar23 + 1;
            } while (uVar22 != uVar23);
          }
          *puVar1 = uVar22;
          uVar28 = puVar1[9];
          if ((int)uVar28 <= (int)(uint)uVar13) {
            if (uVar28 == 0) {
              uVar28 = 8;
            }
            else {
              uVar28 = (int)uVar28 / 2 + uVar28;
            }
            if ((int)uVar28 <= (int)uVar22) {
              uVar28 = uVar22;
            }
            uVar18 = FUN_7ff70c802100(uVar28 * 2);
            if (*(longlong *)(puVar1 + 10) != 0) {
              FUN_7ff70cb12b60(uVar18,*(longlong *)(puVar1 + 10),(longlong)(int)puVar1[8] * 2);
              FUN_7ff70c802510(*(undefined8 *)(puVar1 + 10));
            }
            *(undefined8 *)(puVar1 + 10) = uVar18;
            puVar1[9] = uVar28;
          }
          uVar23 = (ulonglong)(int)puVar1[8];
          if ((int)puVar1[8] <= (int)(uint)uVar13) {
            do {
              *(undefined2 *)(*(longlong *)(puVar1 + 10) + uVar23 * 2) = 0xffff;
              uVar23 = uVar23 + 1;
            } while (uVar22 != uVar23);
          }
          puVar1[8] = uVar22;
        }
        *(uint *)(*(longlong *)(puVar1 + 2) + (ulonglong)uVar13 * 4) = puVar1[4];
        *(undefined2 *)(*(longlong *)(puVar1 + 10) + (ulonglong)uVar13 * 2) = 0xfffe;
        goto LAB_7ff70c7e812d;
      }
      lVar19 = 0;
      pbVar17 = pbStack_90;
    }
    else {
      uVar13 = FUN_7ff70c804a30(lVar14 + 0x38,9,9);
      uVar5 = uVar13;
      if (uVar13 != *(ushort *)(lVar14 + 0x30)) goto LAB_7ff70c7e7ec6;
LAB_7ff70c7e7eab:
      uVar13 = uVar5;
      if ((*(char *)(lVar14 + 0x35) != '\x01') ||
         (lVar19 = FUN_7ff70c7fcff0(lStack_80,puVar1), lVar19 == 0)) goto LAB_7ff70c7e7ec6;
    }
  }
  else {
LAB_7ff70c7e812d:
    lVar19 = 0;
  }
LAB_7ff70c7e812f:
  *(byte *)((longlong)puVar1 + 0x4f) = *(byte *)((longlong)puVar1 + 0x4f) & 0xf7;
LAB_7ff70c7e8133:
  if ((char)uVar15 == '\x01' && lVar19 == 0) {
    fVar30 = *(float *)(pbVar17 + 4) * _DAT_7ff70cb1bae4;
    uVar28 = puVar1[0xc];
    if (uVar28 == puVar1[0xd]) {
      if (uVar28 == 0) {
        uVar22 = 8;
      }
      else {
        uVar22 = (int)uVar28 / 2 + uVar28;
      }
      uVar27 = uVar28 + 1;
      if ((int)(uVar28 + 1) < (int)uVar22) {
        uVar27 = uVar22;
      }
      lVar19 = FUN_7ff70c802100((longlong)(int)uVar27 * 0x2c);
      if (*(longlong *)(puVar1 + 0xe) != 0) {
        FUN_7ff70cb12b60(lVar19,*(longlong *)(puVar1 + 0xe),(longlong)(int)puVar1[0xc] * 0x2c);
        FUN_7ff70c802510(*(undefined8 *)(puVar1 + 0xe));
      }
      *(longlong *)(puVar1 + 0xe) = lVar19;
      puVar1[0xd] = uVar27;
      uVar22 = puVar1[0xc];
    }
    else {
      lVar19 = *(longlong *)(puVar1 + 0xe);
      uVar22 = uVar28;
    }
    lVar14 = (longlong)(int)uVar22 * 0x2c;
    *(undefined4 *)(lVar19 + lVar14) = 0x240;
    *(float *)(lVar19 + 4 + lVar14) = fVar30;
    puVar3 = (undefined8 *)(lVar19 + 8 + lVar14);
    *puVar3 = 0;
    puVar3[1] = 0;
    puVar3 = (undefined8 *)(lVar19 + 0x18 + lVar14);
    *puVar3 = 0;
    puVar3[1] = 0;
    *(undefined4 *)(lVar19 + 0x28 + lVar14) = 0xffffffff;
    puVar1[0xc] = puVar1[0xc] + 1;
    puVar2 = (uint *)(*(longlong *)(puVar1 + 0xe) + (longlong)(int)uVar28 * 0x2c);
    uVar22 = *(uint *)(*(longlong *)(puVar1 + 0xe) + 0x28 + (longlong)(int)uVar28 * 0x2c);
    if (uVar22 != 0xffffffff) {
      lVar19 = *(longlong *)(*(longlong *)(lStack_78 + 0x2b0) + 0x68);
      lVar14 = (longlong)
               ((ulonglong)
                *(uint *)(*(longlong *)(*(longlong *)(lStack_78 + 0x2b0) + 0x78) +
                         (ulonglong)(uVar22 & 0xfffff) * 4) << 0x2c) >> 0x2c;
      puVar2[6] = (uint)((float)*(ushort *)(lVar19 + lVar14 * 8) * *(float *)(lStack_78 + 0x54));
      puVar2[7] = (uint)((float)*(ushort *)(lVar19 + 2 + lVar14 * 8) * *(float *)(lStack_78 + 0x58))
      ;
      puVar2[8] = (uint)((float)((uint)*(ushort *)(lVar19 + 4 + lVar14 * 8) +
                                (uint)*(ushort *)(lVar19 + lVar14 * 8)) *
                        *(float *)(lStack_78 + 0x54));
      puVar2[9] = (uint)((float)((uint)*(ushort *)(lVar19 + 6 + lVar14 * 8) +
                                (uint)*(ushort *)(lVar19 + 2 + lVar14 * 8)) *
                        *(float *)(lStack_78 + 0x58));
      puVar1[0x13] = puVar1[0x13] & 0xfc000000 |
                     (uint)*(ushort *)(lVar19 + 6 + lVar14 * 8) *
                     (uint)*(ushort *)(lVar19 + 4 + lVar14 * 8) + puVar1[0x13] & 0x3ffffff;
    }
    uVar22 = *puVar2;
    if ((uVar22 & 1) != 0) {
      *(undefined1 *)(*(longlong *)(lStack_78 + 0x38) + 0x56) = 1;
      *(undefined1 *)(lStack_78 + 0x53) = 1;
      uVar22 = *puVar2;
    }
    uVar27 = uVar22 >> 6;
    uVar23 = (ulonglong)uVar27;
    if ((int)puVar1[8] <= (int)uVar27) {
      uVar25 = uVar27 + 1;
      uVar29 = puVar1[1];
      lStack_78 = CONCAT44(lStack_78._4_4_,uVar25);
      if ((int)uVar29 <= (int)uVar27) {
        if (uVar29 == 0) {
          uVar29 = 8;
        }
        else {
          uVar29 = (int)uVar29 / 2 + uVar29;
        }
        if ((int)uVar29 <= (int)uVar25) {
          uVar29 = uVar25;
        }
        uVar15 = FUN_7ff70c802100((ulonglong)uVar29 * 4);
        if (*(longlong *)(puVar1 + 2) != 0) {
          FUN_7ff70cb12b60(uVar15,*(longlong *)(puVar1 + 2),(longlong)(int)*puVar1 << 2);
          FUN_7ff70c802510(*(undefined8 *)(puVar1 + 2));
        }
        *(undefined8 *)(puVar1 + 2) = uVar15;
        puVar1[1] = uVar29;
        uVar25 = (uint)lStack_78;
      }
      uVar29 = *puVar1;
      lVar19 = (longlong)(int)uVar29;
      if ((int)uVar29 <= (int)uVar27) {
        uVar21 = uVar23 - lVar19;
        uVar29 = (int)(uVar23 + 1) - uVar29 & 3;
        uVar24 = (ulonglong)uVar29;
        if (uVar29 != 0) {
          do {
            *(undefined4 *)(*(longlong *)(puVar1 + 2) + lVar19 * 4) = 0xbf800000;
            lVar19 = lVar19 + 1;
            uVar24 = uVar24 - 1;
          } while (uVar24 != 0);
        }
        if (2 < uVar21) {
          do {
            *(undefined4 *)(*(longlong *)(puVar1 + 2) + lVar19 * 4) = 0xbf800000;
            *(undefined4 *)(*(longlong *)(puVar1 + 2) + 4 + lVar19 * 4) = 0xbf800000;
            *(undefined4 *)(*(longlong *)(puVar1 + 2) + 8 + lVar19 * 4) = 0xbf800000;
            *(undefined4 *)(*(longlong *)(puVar1 + 2) + 0xc + lVar19 * 4) = 0xbf800000;
            lVar19 = lVar19 + 4;
          } while (uVar23 + 1 != lVar19);
        }
      }
      *puVar1 = uVar25;
      uVar29 = puVar1[9];
      if ((int)uVar29 <= (int)uVar27) {
        if (uVar29 == 0) {
          uVar29 = 8;
        }
        else {
          uVar29 = (int)uVar29 / 2 + uVar29;
        }
        if ((int)uVar29 <= (int)uVar25) {
          uVar29 = uVar25;
        }
        uVar15 = FUN_7ff70c802100(uVar29 * 2);
        if (*(longlong *)(puVar1 + 10) != 0) {
          FUN_7ff70cb12b60(uVar15,*(longlong *)(puVar1 + 10),(longlong)(int)puVar1[8] * 2);
          FUN_7ff70c802510(*(undefined8 *)(puVar1 + 10));
        }
        *(undefined8 *)(puVar1 + 10) = uVar15;
        puVar1[9] = uVar29;
        uVar25 = (uint)lStack_78;
      }
      uVar29 = puVar1[8];
      lVar19 = (longlong)(int)uVar29;
      if ((int)uVar29 <= (int)uVar27) {
        uVar21 = uVar23 - lVar19;
        uVar27 = (int)(uVar23 + 1) - uVar29 & 3;
        uVar24 = (ulonglong)uVar27;
        if (uVar27 != 0) {
          do {
            *(undefined2 *)(*(longlong *)(puVar1 + 10) + lVar19 * 2) = 0xffff;
            lVar19 = lVar19 + 1;
            uVar24 = uVar24 - 1;
          } while (uVar24 != 0);
        }
        if (2 < uVar21) {
          do {
            *(undefined2 *)(*(longlong *)(puVar1 + 10) + lVar19 * 2) = 0xffff;
            *(undefined2 *)(*(longlong *)(puVar1 + 10) + 2 + lVar19 * 2) = 0xffff;
            *(undefined2 *)(*(longlong *)(puVar1 + 10) + 4 + lVar19 * 2) = 0xffff;
            *(undefined2 *)(*(longlong *)(puVar1 + 10) + 6 + lVar19 * 2) = 0xffff;
            lVar19 = lVar19 + 4;
          } while (uVar23 + 1 != lVar19);
        }
      }
      puVar1[8] = uVar25;
    }
    *(uint *)(*(longlong *)(puVar1 + 2) + uVar23 * 4) = puVar2[1];
    *(short *)(*(longlong *)(puVar1 + 10) + uVar23 * 2) = (short)uVar28;
    pbVar17 = (byte *)(*(longlong *)(puVar1 + 0x16) + 0x34 + (ulonglong)(uVar22 >> 0x16));
    *pbVar17 = *pbVar17 | (byte)(1 << ((byte)(uVar22 >> 0x13) & 7));
  }
  return puVar1;
}


