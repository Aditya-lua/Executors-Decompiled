/* 7ff70c7fcff0 FUN_7ff70c7fcff0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

uint * FUN_7ff70c7fcff0(longlong param_1,uint *param_2)

{
  undefined8 *puVar1;
  byte *pbVar2;
  undefined4 uVar3;
  ushort *puVar4;
  code *pcVar5;
  char cVar6;
  ushort uVar7;
  ushort uVar8;
  uint uVar9;
  uint uVar10;
  int iVar11;
  undefined8 uVar12;
  ulonglong uVar13;
  longlong lVar14;
  longlong lVar15;
  uint *puVar16;
  uint uVar17;
  int iVar18;
  ulonglong uVar19;
  int iVar20;
  uint uVar21;
  ushort uVar22;
  uint uVar23;
  ulonglong uVar24;
  ushort uVar25;
  ulonglong uVar26;
  uint uVar27;
  longlong *plVar28;
  longlong lVar29;
  longlong lVar30;
  float fVar31;
  undefined1 auVar32 [16];
  undefined1 auStack_128 [32];
  ushort uStack_108;
  undefined8 *puStack_100;
  undefined8 uStack_f8;
  ulonglong uStack_f0;
  longlong lStack_e8;
  longlong *plStack_e0;
  ulonglong uStack_d8;
  uint *puStack_d0;
  undefined8 uStack_c8;
  undefined8 uStack_c0;
  undefined8 uStack_b8;
  undefined8 uStack_b0;
  undefined8 uStack_a8;
  undefined4 uStack_a0;
  ulonglong uStack_90;
  
  uStack_90 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_128;
  uVar19 = *(ulonglong *)(param_2 + 0x16);
  uVar23 = param_2[8];
  if (uVar23 < 0x2f) {
LAB_7ff70c7fd065:
    *(byte *)((longlong)param_2 + 0x4f) = *(byte *)((longlong)param_2 + 0x4f) | 8;
    lVar30 = *(longlong *)(uVar19 + 8);
    if ((*(char *)(lVar30 + 0x50) != '\0') || ((*(byte *)(uVar19 + 0x10) & 4) != 0)) {
LAB_7ff70c7fd382:
      *(byte *)((longlong)param_2 + 0x4f) = *(byte *)((longlong)param_2 + 0x4f) & 0xf7;
LAB_7ff70c7fd392:
      uVar23 = param_2[8];
      goto LAB_7ff70c7fd395;
    }
    if (*(int *)(uVar19 + 0x38) == 0) {
      uVar7 = 0x2e;
      uVar8 = 0x2e;
      if (*(short *)(uVar19 + 0x30) == 0x2e) goto LAB_7ff70c7fd0c9;
LAB_7ff70c7fd0e7:
      uStack_f0 = uVar19;
      lStack_e8 = param_1;
      if ((longlong)*(int *)(uVar19 + 0x20) != 0) {
        plVar28 = *(longlong **)(uVar19 + 0x28);
        plStack_e0 = plVar28 + *(int *)(uVar19 + 0x20);
        lVar29 = *(longlong *)(param_2 + 0x18);
        uVar23 = 0;
        do {
          lVar14 = *plVar28;
          lVar15 = *(longlong *)(lVar14 + 0x80);
          if (lVar15 == 0) {
            lVar15 = *(longlong *)(lVar30 + 0x2b8);
          }
          puVar4 = *(ushort **)(lVar14 + 0x48);
          if (puVar4 != (ushort *)0x0) {
            uVar8 = *puVar4;
            while (uVar8 != 0) {
              if ((uVar8 <= uVar7) && (uVar7 <= puVar4[1])) goto LAB_7ff70c7fd182;
              uVar8 = puVar4[2];
              puVar4 = puVar4 + 2;
            }
          }
          uStack_b8 = 0;
          uStack_b0 = 0;
          uStack_c8 = 0;
          uStack_c0 = 0;
          uStack_a8 = 0;
          uStack_a0 = 0xffffffff;
          puStack_100 = &uStack_c8;
          uStack_f8 = 0;
          uStack_108 = uVar7;
          cVar6 = (**(code **)(lVar15 + 0x40))(lVar30,lVar14,param_2,lVar29);
          if (cVar6 != '\0') {
            uStack_c8 = CONCAT44(uStack_c8._4_4_,((uint)uStack_c8 & 3) + (uVar23 & 0xf) * 4 + 0xb80)
            ;
            lVar29 = FUN_7ff70c7e5b10(lVar30,param_2,lVar14,&uStack_c8);
            param_1 = lStack_e8;
            uVar19 = uStack_f0;
            goto LAB_7ff70c7fd276;
          }
LAB_7ff70c7fd182:
          lVar29 = lVar29 + *(longlong *)(lVar15 + 0x48);
          uVar23 = uVar23 + 1;
          plVar28 = plVar28 + 1;
        } while (plVar28 != plStack_e0);
      }
      uVar19 = uStack_f0;
      if ((*(byte *)((longlong)param_2 + 0x4f) & 8) == 0) {
        if (param_2[0x10] == 0xffffffff) {
          FUN_7ff70c7fc720(param_2);
        }
        param_1 = lStack_e8;
        if ((int)param_2[8] <= (int)(uint)uVar7) {
          uVar21 = uVar7 + 1;
          uVar23 = param_2[1];
          if ((int)uVar23 <= (int)(uint)uVar7) {
            if (uVar23 == 0) {
              uVar23 = 8;
            }
            else {
              uVar23 = (int)uVar23 / 2 + uVar23;
            }
            if ((int)uVar23 <= (int)uVar21) {
              uVar23 = uVar21;
            }
            uVar12 = FUN_7ff70c802100((ulonglong)uVar23 * 4);
            if (*(longlong *)(param_2 + 2) != 0) {
              FUN_7ff70cb12b60(uVar12,*(longlong *)(param_2 + 2),(longlong)(int)*param_2 << 2);
              FUN_7ff70c802510(*(undefined8 *)(param_2 + 2));
            }
            *(undefined8 *)(param_2 + 2) = uVar12;
            param_2[1] = uVar23;
          }
          uVar13 = (ulonglong)(int)*param_2;
          if ((int)*param_2 <= (int)(uint)uVar7) {
            do {
              *(undefined4 *)(*(longlong *)(param_2 + 2) + uVar13 * 4) = 0xbf800000;
              uVar13 = uVar13 + 1;
            } while (uVar21 != uVar13);
          }
          *param_2 = uVar21;
          uVar23 = param_2[9];
          if ((int)uVar23 <= (int)(uint)uVar7) {
            if (uVar23 == 0) {
              uVar23 = 8;
            }
            else {
              uVar23 = (int)uVar23 / 2 + uVar23;
            }
            if ((int)uVar23 <= (int)uVar21) {
              uVar23 = uVar21;
            }
            uVar12 = FUN_7ff70c802100(uVar23 * 2);
            if (*(longlong *)(param_2 + 10) != 0) {
              FUN_7ff70cb12b60(uVar12,*(longlong *)(param_2 + 10),(longlong)(int)param_2[8] * 2);
              FUN_7ff70c802510(*(undefined8 *)(param_2 + 10));
            }
            *(undefined8 *)(param_2 + 10) = uVar12;
            param_2[9] = uVar23;
          }
          uVar13 = (ulonglong)(int)param_2[8];
          if ((int)param_2[8] <= (int)(uint)uVar7) {
            do {
              *(undefined2 *)(*(longlong *)(param_2 + 10) + uVar13 * 2) = 0xffff;
              uVar13 = uVar13 + 1;
            } while (uVar21 != uVar13);
          }
          param_2[8] = uVar21;
        }
        *(uint *)(*(longlong *)(param_2 + 2) + (ulonglong)uVar7 * 4) = param_2[4];
        *(undefined2 *)(*(longlong *)(param_2 + 10) + (ulonglong)uVar7 * 2) = 0xfffe;
        goto LAB_7ff70c7fd382;
      }
      lVar29 = 0;
      param_1 = lStack_e8;
    }
    else {
      uVar7 = FUN_7ff70c804a30(uVar19 + 0x38,0x2e,0x2e);
      uVar8 = uVar7;
      if (uVar7 != *(ushort *)(uVar19 + 0x30)) goto LAB_7ff70c7fd0e7;
LAB_7ff70c7fd0c9:
      uVar7 = uVar8;
      if ((*(char *)(uVar19 + 0x35) != '\x01') ||
         (lVar29 = FUN_7ff70c7fcff0(lVar30,param_2), lVar29 == 0)) goto LAB_7ff70c7fd0e7;
    }
LAB_7ff70c7fd276:
    *(byte *)((longlong)param_2 + 0x4f) = *(byte *)((longlong)param_2 + 0x4f) & 0xf7;
    if (lVar29 == 0) goto LAB_7ff70c7fd392;
LAB_7ff70c7fd585:
    uVar13 = (ulonglong)(*(uint *)(lVar29 + 0x28) & 0xfffff);
    lVar30 = *(longlong *)(*(longlong *)(param_1 + 0x2b0) + 0x68);
    fVar31 = (*(float *)(lVar29 + 0x10) - *(float *)(lVar29 + 8)) + _DAT_7ff70cb1ba2c;
    lVar14 = (longlong)
             ((ulonglong)
              *(uint *)(*(longlong *)(*(longlong *)(param_1 + 0x2b0) + 0x78) + uVar13 * 4) << 0x2c)
             >> 0x2c;
    uVar8 = *(ushort *)(lVar30 + 4 + lVar14 * 8);
    uVar9 = FUN_7ff70c7d93b0(param_1,(uint)uVar8 + (uint)uVar8 * 2 + 2,
                             *(undefined2 *)(lVar30 + 6 + lVar14 * 8),0);
    plStack_e0 = *(longlong **)(*(longlong *)(param_1 + 0x2b0) + 0x68);
    uVar23 = *(uint *)(*(longlong *)(*(longlong *)(param_1 + 0x2b0) + 0x78) +
                      (ulonglong)(uVar9 & 0xfffff) * 4);
    uVar8 = *(ushort *)(uVar19 + 0x30);
    uVar12 = *(undefined8 *)(lVar29 + 8);
    fVar31 = fVar31 * _DAT_7ff70cb1bae0 + (float)uVar12 + _DAT_7ff70cb1bae8;
    auVar32 = blendvps(ZEXT416((uint)fVar31),ZEXT416((uint)*(float *)(lVar29 + 4)),
                       ZEXT416(-(uint)(fVar31 <= *(float *)(lVar29 + 4))));
    uVar3 = *(undefined4 *)(lVar29 + 0x14);
    uVar21 = param_2[0xc];
    uVar19 = (ulonglong)uVar21;
    lVar30 = (longlong)(int)uVar21;
    lStack_e8 = param_1;
    if (uVar21 == param_2[0xd]) {
      if (uVar21 == 0) {
        uVar10 = 8;
      }
      else {
        uVar10 = (int)uVar21 / 2 + uVar21;
      }
      uVar17 = uVar21 + 1;
      if ((int)(uVar21 + 1) < (int)uVar10) {
        uVar17 = uVar10;
      }
      uStack_f0 = uVar13;
      lVar29 = FUN_7ff70c802100((longlong)(int)uVar17 * 0x2c);
      if (*(longlong *)(param_2 + 0xe) != 0) {
        FUN_7ff70cb12b60(lVar29,*(longlong *)(param_2 + 0xe),(longlong)(int)param_2[0xc] * 0x2c);
        FUN_7ff70c802510(*(undefined8 *)(param_2 + 0xe));
      }
      *(longlong *)(param_2 + 0xe) = lVar29;
      param_2[0xd] = uVar17;
      uVar21 = param_2[0xc];
      uVar13 = uStack_f0;
    }
    else {
      lVar29 = *(longlong *)(param_2 + 0xe);
    }
    lVar14 = lStack_e8;
    lVar15 = (longlong)(int)uVar21 * 0x2c;
    *(uint *)(lVar29 + lVar15) = (uint)uVar8 << 6 | 2;
    *(int *)(lVar29 + 4 + lVar15) = auVar32._0_4_;
    *(undefined8 *)(lVar29 + 8 + lVar15) = uVar12;
    *(float *)(lVar29 + 0x10 + lVar15) = fVar31;
    *(undefined4 *)(lVar29 + 0x14 + lVar15) = uVar3;
    puVar1 = (undefined8 *)(lVar29 + 0x18 + lVar15);
    *puVar1 = 0;
    puVar1[1] = 0;
    *(uint *)(lVar29 + 0x28 + lVar15) = uVar9;
    param_2[0xc] = param_2[0xc] + 1;
    puStack_d0 = (uint *)(*(longlong *)(param_2 + 0xe) + lVar30 * 0x2c);
    uVar21 = *(uint *)(*(longlong *)(param_2 + 0xe) + 0x28 + lVar30 * 0x2c);
    if (uVar21 != 0xffffffff) {
      lVar30 = *(longlong *)(*(longlong *)(lStack_e8 + 0x2b0) + 0x68);
      lVar29 = (longlong)
               ((ulonglong)
                *(uint *)(*(longlong *)(*(longlong *)(lStack_e8 + 0x2b0) + 0x78) +
                         (ulonglong)(uVar21 & 0xfffff) * 4) << 0x2c) >> 0x2c;
      puStack_d0[6] = (uint)((float)*(ushort *)(lVar30 + lVar29 * 8) * *(float *)(lStack_e8 + 0x54))
      ;
      puStack_d0[7] =
           (uint)((float)*(ushort *)(lVar30 + 2 + lVar29 * 8) * *(float *)(lStack_e8 + 0x58));
      puStack_d0[8] =
           (uint)((float)((uint)*(ushort *)(lVar30 + 4 + lVar29 * 8) +
                         (uint)*(ushort *)(lVar30 + lVar29 * 8)) * *(float *)(lStack_e8 + 0x54));
      puStack_d0[9] =
           (uint)((float)((uint)*(ushort *)(lVar30 + 6 + lVar29 * 8) +
                         (uint)*(ushort *)(lVar30 + 2 + lVar29 * 8)) * *(float *)(lStack_e8 + 0x58))
      ;
      param_2[0x13] =
           param_2[0x13] & 0xfc000000 |
           (uint)*(ushort *)(lVar30 + 6 + lVar29 * 8) * (uint)*(ushort *)(lVar30 + 4 + lVar29 * 8) +
           param_2[0x13] & 0x3ffffff;
    }
    uVar21 = *puStack_d0;
    if ((uVar21 & 1) != 0) {
      *(undefined1 *)(*(longlong *)(lStack_e8 + 0x38) + 0x56) = 1;
      *(undefined1 *)(lStack_e8 + 0x53) = 1;
      uVar21 = *puStack_d0;
    }
    uStack_f0 = (longlong)((ulonglong)uVar23 << 0x2c) >> 0x2c;
    uVar23 = uVar21 >> 6;
    uVar24 = (ulonglong)uVar23;
    if ((int)param_2[8] <= (int)uVar23) {
      uVar10 = uVar23 + 1;
      uVar9 = param_2[1];
      uStack_d8 = uVar19;
      if ((int)uVar9 <= (int)uVar23) {
        if (uVar9 == 0) {
          uVar9 = 8;
        }
        else {
          uVar9 = (int)uVar9 / 2 + uVar9;
        }
        if ((int)uVar9 <= (int)uVar10) {
          uVar9 = uVar10;
        }
        uVar12 = FUN_7ff70c802100((ulonglong)uVar9 * 4);
        if (*(longlong *)(param_2 + 2) != 0) {
          FUN_7ff70cb12b60(uVar12,*(longlong *)(param_2 + 2),(longlong)(int)*param_2 << 2);
          FUN_7ff70c802510(*(undefined8 *)(param_2 + 2));
        }
        *(undefined8 *)(param_2 + 2) = uVar12;
        param_2[1] = uVar9;
      }
      uVar9 = *param_2;
      lVar30 = (longlong)(int)uVar9;
      if ((int)uVar9 <= (int)uVar23) {
        uVar19 = uVar24 - lVar30;
        uVar9 = (int)(uVar24 + 1) - uVar9 & 3;
        uVar26 = (ulonglong)uVar9;
        if (uVar9 != 0) {
          do {
            *(undefined4 *)(*(longlong *)(param_2 + 2) + lVar30 * 4) = 0xbf800000;
            lVar30 = lVar30 + 1;
            uVar26 = uVar26 - 1;
          } while (uVar26 != 0);
        }
        if (2 < uVar19) {
          do {
            *(undefined4 *)(*(longlong *)(param_2 + 2) + lVar30 * 4) = 0xbf800000;
            *(undefined4 *)(*(longlong *)(param_2 + 2) + 4 + lVar30 * 4) = 0xbf800000;
            *(undefined4 *)(*(longlong *)(param_2 + 2) + 8 + lVar30 * 4) = 0xbf800000;
            *(undefined4 *)(*(longlong *)(param_2 + 2) + 0xc + lVar30 * 4) = 0xbf800000;
            lVar30 = lVar30 + 4;
          } while (uVar24 + 1 != lVar30);
        }
      }
      *param_2 = uVar10;
      uVar9 = param_2[9];
      if ((int)uVar9 <= (int)uVar23) {
        if (uVar9 == 0) {
          uVar9 = 8;
        }
        else {
          uVar9 = (int)uVar9 / 2 + uVar9;
        }
        if ((int)uVar9 <= (int)uVar10) {
          uVar9 = uVar10;
        }
        uVar12 = FUN_7ff70c802100(uVar9 * 2);
        if (*(longlong *)(param_2 + 10) != 0) {
          FUN_7ff70cb12b60(uVar12,*(longlong *)(param_2 + 10),(longlong)(int)param_2[8] * 2);
          FUN_7ff70c802510(*(undefined8 *)(param_2 + 10));
        }
        *(undefined8 *)(param_2 + 10) = uVar12;
        param_2[9] = uVar9;
      }
      uVar9 = param_2[8];
      lVar30 = (longlong)(int)uVar9;
      if ((int)uVar9 <= (int)uVar23) {
        uVar19 = uVar24 - lVar30;
        uVar23 = (int)(uVar24 + 1) - uVar9 & 3;
        uVar26 = (ulonglong)uVar23;
        if (uVar23 != 0) {
          do {
            *(undefined2 *)(*(longlong *)(param_2 + 10) + lVar30 * 2) = 0xffff;
            lVar30 = lVar30 + 1;
            uVar26 = uVar26 - 1;
          } while (uVar26 != 0);
        }
        if (2 < uVar19) {
          do {
            *(undefined2 *)(*(longlong *)(param_2 + 10) + lVar30 * 2) = 0xffff;
            *(undefined2 *)(*(longlong *)(param_2 + 10) + 2 + lVar30 * 2) = 0xffff;
            *(undefined2 *)(*(longlong *)(param_2 + 10) + 4 + lVar30 * 2) = 0xffff;
            *(undefined2 *)(*(longlong *)(param_2 + 10) + 6 + lVar30 * 2) = 0xffff;
            lVar30 = lVar30 + 4;
          } while (uVar24 + 1 != lVar30);
        }
      }
      param_2[8] = uVar10;
      uVar19 = uStack_d8;
    }
    *(uint *)(*(longlong *)(param_2 + 2) + uVar24 * 4) = puStack_d0[1];
    *(short *)(*(longlong *)(param_2 + 10) + uVar24 * 2) = (short)uVar19;
    pbVar2 = (byte *)(*(longlong *)(param_2 + 0x16) + 0x34 + (ulonglong)(uVar21 >> 0x16));
    *pbVar2 = *pbVar2 | (byte)(1 << ((byte)(uVar21 >> 0x13) & 7));
    uVar19 = *(ulonglong *)(*(longlong *)(lVar14 + 0x2b0) + 0x68);
    lVar29 = (longlong)
             ((ulonglong)*(uint *)(*(longlong *)(*(longlong *)(lVar14 + 0x2b0) + 0x78) + uVar13 * 4)
             << 0x2c) >> 0x2c;
    lVar30 = *(longlong *)(lVar14 + 0x38);
    uVar8 = *(ushort *)(uVar19 + 6 + lVar29 * 8);
    uVar21 = (uint)uVar8;
    uVar7 = *(ushort *)(plStack_e0 + uStack_f0);
    uVar23 = (uint)uVar7;
    uVar25 = *(ushort *)((longlong)plStack_e0 + uStack_f0 * 8 + 2);
    if (uVar8 != 0) {
      uVar9 = (uint)uVar25;
      uVar8 = *(ushort *)(uVar19 + 4 + lVar29 * 8);
      uVar23 = (uint)*(ushort *)(uVar19 + 2 + lVar29 * 8);
      uVar25 = *(ushort *)(uVar19 + lVar29 * 8);
      uStack_d8 = uVar19;
      do {
        iVar11 = *(int *)(lVar30 + 0x24);
        FUN_7ff70cb12b60((longlong)(int)((*(int *)(lVar30 + 0x1c) * uVar9 + (uint)uVar7) * iVar11) +
                         *(longlong *)(lVar30 + 0x28),
                         (longlong)(int)((*(int *)(lVar30 + 0x1c) * uVar23 + (uint)uVar25) * iVar11)
                         + *(longlong *)(lVar30 + 0x28),(longlong)iVar11 * (ulonglong)uVar8);
        uVar23 = uVar23 + 1;
        uVar9 = uVar9 + 1;
        uVar21 = uVar21 - 1;
      } while (uVar21 != 0);
      uVar8 = *(ushort *)(uStack_d8 + 6 + lVar29 * 8);
      uVar21 = (uint)uVar8;
      uVar25 = *(ushort *)((longlong)plStack_e0 + uStack_f0 * 8 + 2);
      uVar7 = *(ushort *)(plStack_e0 + uStack_f0);
      uVar23 = (uint)uVar7;
      lVar14 = lStack_e8;
      if (uVar8 != 0) {
        uVar8 = *(ushort *)(uStack_d8 + 4 + lVar29 * 8);
        uVar23 = (uint)*(ushort *)(uStack_d8 + 2 + lVar29 * 8);
        uVar22 = *(ushort *)(uStack_d8 + lVar29 * 8);
        uVar9 = (uint)uVar25;
        do {
          iVar11 = *(int *)(lVar30 + 0x24);
          FUN_7ff70cb12b60((longlong)
                           (int)((*(int *)(lVar30 + 0x1c) * uVar9 + (uint)uVar8 + (uint)uVar7 + 1) *
                                iVar11) + *(longlong *)(lVar30 + 0x28),
                           (longlong)
                           (int)((*(int *)(lVar30 + 0x1c) * uVar23 + (uint)uVar22) * iVar11) +
                           *(longlong *)(lVar30 + 0x28),(longlong)iVar11 * (ulonglong)uVar8);
          lVar14 = lStack_e8;
          uVar23 = uVar23 + 1;
          uVar9 = uVar9 + 1;
          uVar21 = uVar21 - 1;
        } while (uVar21 != 0);
        uVar8 = *(ushort *)(uStack_d8 + 6 + lVar29 * 8);
        uVar21 = (uint)uVar8;
        uVar25 = *(ushort *)((longlong)plStack_e0 + uStack_f0 * 8 + 2);
        uVar7 = *(ushort *)(plStack_e0 + uStack_f0);
        uVar23 = (uint)uVar7;
        if (uVar8 != 0) {
          uVar8 = *(ushort *)(uStack_d8 + 4 + lVar29 * 8);
          uVar9 = (uint)*(ushort *)(uStack_d8 + 2 + lVar29 * 8);
          uVar22 = *(ushort *)(uStack_d8 + lVar29 * 8);
          uVar23 = (uint)uVar25;
          do {
            iVar11 = *(int *)(lVar30 + 0x24);
            FUN_7ff70cb12b60((longlong)
                             (int)((*(int *)(lVar30 + 0x1c) * uVar23 +
                                   (uint)uVar7 + (uint)uVar8 * 2 + 2) * iVar11) +
                             *(longlong *)(lVar30 + 0x28),
                             (longlong)
                             (int)((*(int *)(lVar30 + 0x1c) * uVar9 + (uint)uVar22) * iVar11) +
                             *(longlong *)(lVar30 + 0x28),(longlong)iVar11 * (ulonglong)uVar8);
            uVar9 = uVar9 + 1;
            uVar23 = uVar23 + 1;
            uVar21 = uVar21 - 1;
          } while (uVar21 != 0);
          uVar23 = (uint)*(ushort *)(plStack_e0 + uStack_f0);
          uVar25 = *(ushort *)((longlong)plStack_e0 + uStack_f0 * 8 + 2);
        }
      }
    }
    puVar16 = puStack_d0;
    uVar21 = *(uint *)((longlong)plStack_e0 + uStack_f0 * 8 + 4);
    uVar8 = (ushort)uVar23;
    uVar10 = (uVar21 & 0xffff) + uVar23;
    uVar9 = uVar10;
    if ((*(ushort *)(lVar30 + 0x3c) != 0) &&
       (uVar9 = (uint)*(ushort *)(lVar30 + 0x38) + (uint)*(ushort *)(lVar30 + 0x3c), uVar9 <= uVar10
       )) {
      uVar9 = uVar10;
    }
    uVar17 = (uVar21 >> 0x10) + (uint)uVar25;
    if (*(ushort *)(lVar30 + 0x3e) == 0) {
      uVar7 = *(ushort *)(lVar30 + 0x3a);
      uVar27 = uVar17;
    }
    else {
      uVar7 = *(ushort *)(lVar30 + 0x3a);
      uVar27 = (uint)*(ushort *)(lVar30 + 0x3e) + (uint)uVar7;
      if (uVar27 <= uVar17) {
        uVar27 = uVar17;
      }
    }
    uVar22 = (ushort)*(undefined4 *)(lVar30 + 0x38);
    if (uVar8 <= uVar22) {
      uVar22 = uVar8;
    }
    *(ushort *)(lVar30 + 0x38) = uVar22;
    if (uVar25 <= uVar7) {
      uVar7 = uVar25;
    }
    *(ushort *)(lVar30 + 0x3a) = uVar7;
    *(ushort *)(lVar30 + 0x3c) = (short)uVar9 - uVar22;
    *(ushort *)(lVar30 + 0x3e) = (short)uVar27 - uVar7;
    uVar9 = *(uint *)(lVar30 + 0x30);
    if (uVar8 <= (ushort)*(uint *)(lVar30 + 0x30)) {
      uVar9 = uVar23;
    }
    *(short *)(lVar30 + 0x30) = (short)uVar9;
    uVar7 = *(ushort *)(lVar30 + 0x32);
    if (uVar25 <= *(ushort *)(lVar30 + 0x32)) {
      uVar7 = uVar25;
    }
    *(ushort *)(lVar30 + 0x32) = uVar7;
    uVar23 = (uint)*(ushort *)(lVar30 + 0x34) + (uVar9 & 0xffff);
    if (uVar23 <= uVar10) {
      uVar23 = uVar10;
    }
    *(short *)(lVar30 + 0x34) = (short)uVar23 - (short)uVar9;
    uVar23 = (uint)*(ushort *)(lVar30 + 0x36) + (uint)uVar7;
    if (uVar23 <= uVar17) {
      uVar23 = uVar17;
    }
    *(ushort *)(lVar30 + 0x36) = (short)uVar23 - uVar7;
    *(undefined1 *)(lVar14 + 0x52) = 0;
    if ((*(int *)(lVar30 + 4) == 3) || (*(int *)(lVar30 + 4) == 0)) {
      *(undefined4 *)(lVar30 + 4) = 3;
      iVar11 = *(int *)(lVar30 + 0x40);
      if (iVar11 == *(int *)(lVar30 + 0x44)) {
        if (iVar11 == 0) {
          iVar18 = 8;
        }
        else {
          iVar18 = iVar11 / 2 + iVar11;
        }
        iVar20 = iVar11 + 1;
        if (iVar11 + 1 < iVar18) {
          iVar20 = iVar18;
        }
        lVar29 = FUN_7ff70c802100((longlong)iVar20 << 3);
        if (*(longlong *)(lVar30 + 0x48) != 0) {
          FUN_7ff70cb12b60(lVar29,*(longlong *)(lVar30 + 0x48),
                           (longlong)*(int *)(lVar30 + 0x40) << 3);
          FUN_7ff70c802510(*(undefined8 *)(lVar30 + 0x48));
        }
        *(longlong *)(lVar30 + 0x48) = lVar29;
        *(int *)(lVar30 + 0x44) = iVar20;
        iVar11 = *(int *)(lVar30 + 0x40);
      }
      else {
        lVar29 = *(longlong *)(lVar30 + 0x48);
      }
      *(ulonglong *)(lVar29 + (longlong)iVar11 * 8) =
           (ulonglong)uVar21 << 0x20 | (ulonglong)uVar8 | (ulonglong)uVar25 << 0x10;
      *(int *)(lVar30 + 0x40) = *(int *)(lVar30 + 0x40) + 1;
    }
  }
  else {
    uVar8 = *(ushort *)(*(longlong *)(param_2 + 10) + 0x5c);
    if (uVar8 != 0xfffe) {
      if (uVar8 == 0xffff) goto LAB_7ff70c7fd065;
      lVar29 = (ulonglong)uVar8 * 0x2c + *(longlong *)(param_2 + 0xe);
      if (lVar29 != 0) goto LAB_7ff70c7fd585;
      goto LAB_7ff70c7fd392;
    }
LAB_7ff70c7fd395:
    if (uVar23 < 0xff0f) {
LAB_7ff70c7fd3b5:
      *(byte *)((longlong)param_2 + 0x4f) = *(byte *)((longlong)param_2 + 0x4f) | 8;
      lVar30 = *(longlong *)(param_2 + 0x16);
      lVar14 = *(longlong *)(lVar30 + 8);
      if ((*(char *)(lVar14 + 0x50) == '\0') && ((*(byte *)(lVar30 + 0x10) & 4) == 0)) {
        if (*(int *)(lVar30 + 0x38) != 0) {
          uVar7 = FUN_7ff70c804a30(lVar30 + 0x38,0xff0e,0xff0e);
          uVar8 = uVar7;
          if (uVar7 == *(ushort *)(lVar30 + 0x30)) goto LAB_7ff70c7fd41b;
LAB_7ff70c7fd438:
          uStack_f0 = uVar19;
          lStack_e8 = param_1;
          if ((longlong)*(int *)(lVar30 + 0x20) != 0) {
            plVar28 = *(longlong **)(lVar30 + 0x28);
            plStack_e0 = plVar28 + *(int *)(lVar30 + 0x20);
            lVar30 = *(longlong *)(param_2 + 0x18);
            uVar23 = 0;
            do {
              lVar29 = *plVar28;
              lVar15 = *(longlong *)(lVar29 + 0x80);
              if (lVar15 == 0) {
                lVar15 = *(longlong *)(lVar14 + 0x2b8);
              }
              puVar4 = *(ushort **)(lVar29 + 0x48);
              if (puVar4 != (ushort *)0x0) {
                uVar8 = *puVar4;
                while (uVar8 != 0) {
                  if ((uVar8 <= uVar7) && (uVar7 <= puVar4[1])) goto LAB_7ff70c7fd4c2;
                  uVar8 = puVar4[2];
                  puVar4 = puVar4 + 2;
                }
              }
              uStack_b8 = 0;
              uStack_b0 = 0;
              uStack_c8 = 0;
              uStack_c0 = 0;
              uStack_a8 = 0;
              uStack_a0 = 0xffffffff;
              puStack_100 = &uStack_c8;
              uStack_f8 = 0;
              uStack_108 = uVar7;
              cVar6 = (**(code **)(lVar15 + 0x40))(lVar14,lVar29,param_2,lVar30);
              if (cVar6 != '\0') {
                uStack_c8 = CONCAT44(uStack_c8._4_4_,
                                     ((uint)uStack_c8 & 3) + (uVar23 & 0xf) * 4 + 0x3fc380);
                lVar29 = FUN_7ff70c7e5b10(lVar14,param_2,lVar29,&uStack_c8);
                goto LAB_7ff70c7fde06;
              }
LAB_7ff70c7fd4c2:
              lVar30 = lVar30 + *(longlong *)(lVar15 + 0x48);
              uVar23 = uVar23 + 1;
              plVar28 = plVar28 + 1;
            } while (plVar28 != plStack_e0);
          }
          param_1 = lStack_e8;
          uVar19 = uStack_f0;
          if ((*(byte *)((longlong)param_2 + 0x4f) & 8) != 0) {
            lVar29 = 0;
LAB_7ff70c7fde06:
            *(byte *)((longlong)param_2 + 0x4f) = *(byte *)((longlong)param_2 + 0x4f) & 0xf7;
            uVar19 = uStack_f0;
            param_1 = lStack_e8;
            goto joined_r0x7ff70c7fde17;
          }
          if (param_2[0x10] == 0xffffffff) {
            FUN_7ff70c7fc720(param_2);
          }
          FUN_7ff70c7f7630(param_2,uVar7 + 1);
          *(uint *)(*(longlong *)(param_2 + 2) + (ulonglong)uVar7 * 4) = param_2[4];
          *(undefined2 *)(*(longlong *)(param_2 + 10) + (ulonglong)uVar7 * 2) = 0xfffe;
          goto LAB_7ff70c7fd575;
        }
        uVar7 = 0xff0e;
        uVar8 = 0xff0e;
        if (*(short *)(lVar30 + 0x30) != -0xf2) goto LAB_7ff70c7fd438;
LAB_7ff70c7fd41b:
        uVar7 = uVar8;
        if ((*(char *)(lVar30 + 0x35) != '\x01') ||
           (lVar29 = FUN_7ff70c7fcff0(lVar14,param_2), lVar29 == 0)) goto LAB_7ff70c7fd438;
      }
      else {
LAB_7ff70c7fd575:
        lVar29 = 0;
      }
      *(byte *)((longlong)param_2 + 0x4f) = *(byte *)((longlong)param_2 + 0x4f) & 0xf7;
joined_r0x7ff70c7fde17:
      if (lVar29 != 0) goto LAB_7ff70c7fd585;
    }
    else {
      uVar8 = *(ushort *)(*(longlong *)(param_2 + 10) + 0x1fe1c);
      if (uVar8 != 0xfffe) {
        if (uVar8 == 0xffff) goto LAB_7ff70c7fd3b5;
        lVar29 = (ulonglong)uVar8 * 0x2c + *(longlong *)(param_2 + 0xe);
        goto joined_r0x7ff70c7fde17;
      }
    }
    puVar16 = (uint *)0x0;
  }
  if (_DAT_7ff70cbebd80 != (uStack_90 ^ (ulonglong)auStack_128)) {
    FUN_7ff70caa97e0(uStack_90 ^ (ulonglong)auStack_128);
    pcVar5 = (code *)swi(3);
    puVar16 = (uint *)(*pcVar5)();
    return puVar16;
  }
  return puVar16;
}


