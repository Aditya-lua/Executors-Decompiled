/* 7ff70c7fc720 FUN_7ff70c7fc720 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c7fc720(uint *param_1)

{
  undefined4 *puVar1;
  byte *pbVar2;
  ushort *puVar3;
  code *pcVar4;
  char cVar5;
  ushort uVar6;
  ushort uVar7;
  longlong lVar8;
  longlong lVar9;
  longlong lVar10;
  undefined8 uVar11;
  uint *puVar12;
  ulonglong uVar13;
  ulonglong uVar14;
  uint uVar15;
  longlong *plVar16;
  longlong lVar17;
  ulonglong uVar18;
  uint uVar19;
  uint uVar20;
  uint uVar21;
  uint uVar22;
  float fVar23;
  undefined1 auStack_e8 [32];
  ushort uStack_c8;
  undefined8 *puStack_c0;
  undefined8 uStack_b8;
  longlong lStack_b0;
  longlong *plStack_a8;
  longlong *plStack_a0;
  undefined8 uStack_98;
  undefined8 uStack_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined4 uStack_70;
  ulonglong uStack_60;
  
  uStack_60 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_e8;
  lVar17 = *(longlong *)(param_1 + 0x16);
  uVar6 = *(ushort *)(lVar17 + 0x32);
  uVar14 = (ulonglong)uVar6;
  if (uVar14 != 0) {
    if ((uint)uVar6 < param_1[8]) {
      uVar7 = *(ushort *)(*(longlong *)(param_1 + 10) + uVar14 * 2);
      if (uVar7 == 0xfffe) goto LAB_7ff70c7fc94f;
      if (uVar7 == 0xffff) goto LAB_7ff70c7fc781;
      puVar12 = (uint *)((ulonglong)uVar7 * 0x2c + *(longlong *)(param_1 + 0xe));
    }
    else {
LAB_7ff70c7fc781:
      *(byte *)((longlong)param_1 + 0x4f) = *(byte *)((longlong)param_1 + 0x4f) | 8;
      plStack_a8 = *(longlong **)(lVar17 + 8);
      if (((char)plStack_a8[10] == '\0') && ((*(byte *)(lVar17 + 0x10) & 4) == 0)) {
        uVar21 = (uint)uVar6;
        if (*(int *)(lVar17 + 0x38) == 0) {
          if (uVar6 == *(ushort *)(lVar17 + 0x30)) goto LAB_7ff70c7fc7e2;
LAB_7ff70c7fc802:
          lStack_b0 = lVar17;
          if ((longlong)*(int *)(lVar17 + 0x20) != 0) {
            plVar16 = *(longlong **)(lVar17 + 0x28);
            plStack_a0 = plVar16 + *(int *)(lVar17 + 0x20);
            lVar17 = *(longlong *)(param_1 + 0x18);
            uVar20 = 0;
            do {
              lVar9 = *plVar16;
              lVar10 = *(longlong *)(lVar9 + 0x80);
              if (lVar10 == 0) {
                lVar10 = plStack_a8[0x57];
              }
              puVar3 = *(ushort **)(lVar9 + 0x48);
              if (puVar3 != (ushort *)0x0) {
                uVar7 = *puVar3;
                while (uVar7 != 0) {
                  if ((uVar7 <= uVar6) && (uVar6 <= puVar3[1])) goto LAB_7ff70c7fc88e;
                  uVar7 = puVar3[2];
                  puVar3 = puVar3 + 2;
                }
              }
              uStack_88 = 0;
              uStack_80 = 0;
              uStack_98 = 0;
              uStack_90 = 0;
              uStack_78 = 0;
              uStack_70 = 0xffffffff;
              puStack_c0 = &uStack_98;
              uStack_b8 = 0;
              uStack_c8 = uVar6;
              cVar5 = (**(code **)(lVar10 + 0x40))(plStack_a8,lVar9,param_1,lVar17);
              if (cVar5 != '\0') {
                uStack_98 = CONCAT44(uStack_98._4_4_,
                                     ((uint)uStack_98 & 3 | uVar21 << 6) + (uVar20 & 0xf) * 4);
                puVar12 = (uint *)FUN_7ff70c7e5b10(plStack_a8,param_1,lVar9,&uStack_98);
                lVar17 = lStack_b0;
                goto LAB_7ff70c7fc942;
              }
LAB_7ff70c7fc88e:
              lVar17 = lVar17 + *(longlong *)(lVar10 + 0x48);
              uVar20 = uVar20 + 1;
              plVar16 = plVar16 + 1;
            } while (plVar16 != plStack_a0);
          }
          lVar17 = lStack_b0;
          if ((*(byte *)((longlong)param_1 + 0x4f) & 8) == 0) {
            if (param_1[0x10] == 0xffffffff) {
              FUN_7ff70c7fc720(param_1);
            }
            FUN_7ff70c7f7630(param_1,uVar6 + 1);
            *(uint *)(*(longlong *)(param_1 + 2) + (ulonglong)uVar6 * 4) = param_1[4];
            *(undefined2 *)(*(longlong *)(param_1 + 10) + (ulonglong)uVar6 * 2) = 0xfffe;
            goto LAB_7ff70c7fc940;
          }
          puVar12 = (uint *)0x0;
        }
        else {
          uVar6 = FUN_7ff70c804a30(lVar17 + 0x38,uVar14,uVar14);
          if (uVar6 != *(ushort *)(lVar17 + 0x30)) goto LAB_7ff70c7fc802;
LAB_7ff70c7fc7e2:
          if ((*(char *)(lVar17 + 0x35) != '\x01') ||
             (puVar12 = (uint *)FUN_7ff70c7fcff0(plStack_a8,param_1), puVar12 == (uint *)0x0))
          goto LAB_7ff70c7fc802;
        }
      }
      else {
LAB_7ff70c7fc940:
        puVar12 = (uint *)0x0;
      }
LAB_7ff70c7fc942:
      *(byte *)((longlong)param_1 + 0x4f) = *(byte *)((longlong)param_1 + 0x4f) & 0xf7;
    }
    if (puVar12 != (uint *)0x0) goto LAB_7ff70c7fcefe;
  }
LAB_7ff70c7fc94f:
  if (param_1[8] < 0x21) {
LAB_7ff70c7fc97d:
    *(byte *)((longlong)param_1 + 0x4f) = *(byte *)((longlong)param_1 + 0x4f) | 8;
    lVar9 = *(longlong *)(param_1 + 0x16);
    lVar10 = *(longlong *)(lVar9 + 8);
    if ((*(char *)(lVar10 + 0x50) == '\0') && ((*(byte *)(lVar9 + 0x10) & 4) == 0)) {
      if (*(int *)(lVar9 + 0x38) == 0) {
        uVar7 = 0x20;
        uVar6 = 0x20;
        if (*(short *)(lVar9 + 0x30) == 0x20) goto LAB_7ff70c7fc9dc;
LAB_7ff70c7fc9f7:
        lStack_b0 = lVar17;
        if ((longlong)*(int *)(lVar9 + 0x20) != 0) {
          plVar16 = *(longlong **)(lVar9 + 0x28);
          plStack_a8 = plVar16 + *(int *)(lVar9 + 0x20);
          lVar17 = *(longlong *)(param_1 + 0x18);
          uVar21 = 0;
          do {
            lVar9 = *plVar16;
            lVar8 = *(longlong *)(lVar9 + 0x80);
            if (lVar8 == 0) {
              lVar8 = *(longlong *)(lVar10 + 0x2b8);
            }
            puVar3 = *(ushort **)(lVar9 + 0x48);
            if (puVar3 != (ushort *)0x0) {
              uVar6 = *puVar3;
              while (uVar6 != 0) {
                if ((uVar6 <= uVar7) && (uVar7 <= puVar3[1])) goto LAB_7ff70c7fca7c;
                uVar6 = puVar3[2];
                puVar3 = puVar3 + 2;
              }
            }
            uStack_88 = 0;
            uStack_80 = 0;
            uStack_98 = 0;
            uStack_90 = 0;
            uStack_78 = 0;
            uStack_70 = 0xffffffff;
            puStack_c0 = &uStack_98;
            uStack_b8 = 0;
            uStack_c8 = uVar7;
            cVar5 = (**(code **)(lVar8 + 0x40))(lVar10,lVar9,param_1,lVar17);
            if (cVar5 != '\0') {
              uStack_98 = CONCAT44(uStack_98._4_4_,
                                   ((uint)uStack_98 & 3) + (uVar21 & 0xf) * 4 + 0x800);
              lVar8 = FUN_7ff70c7e5b10(lVar10,param_1,lVar9,&uStack_98);
              lVar17 = lStack_b0;
              goto LAB_7ff70c7fcb32;
            }
LAB_7ff70c7fca7c:
            lVar17 = lVar17 + *(longlong *)(lVar8 + 0x48);
            uVar21 = uVar21 + 1;
            plVar16 = plVar16 + 1;
          } while (plVar16 != plStack_a8);
        }
        lVar17 = lStack_b0;
        if ((*(byte *)((longlong)param_1 + 0x4f) & 8) == 0) {
          if (param_1[0x10] == 0xffffffff) {
            FUN_7ff70c7fc720(param_1);
          }
          FUN_7ff70c7f7630(param_1,uVar7 + 1);
          *(uint *)(*(longlong *)(param_1 + 2) + (ulonglong)uVar7 * 4) = param_1[4];
          *(undefined2 *)(*(longlong *)(param_1 + 10) + (ulonglong)uVar7 * 2) = 0xfffe;
          goto LAB_7ff70c7fcb30;
        }
        lVar8 = 0;
      }
      else {
        uVar7 = FUN_7ff70c804a30(lVar9 + 0x38,0x20,0x20);
        uVar6 = uVar7;
        if (uVar7 != *(ushort *)(lVar9 + 0x30)) goto LAB_7ff70c7fc9f7;
LAB_7ff70c7fc9dc:
        uVar7 = uVar6;
        if ((*(char *)(lVar9 + 0x35) != '\x01') ||
           (lVar8 = FUN_7ff70c7fcff0(lVar10,param_1), lVar8 == 0)) goto LAB_7ff70c7fc9f7;
      }
    }
    else {
LAB_7ff70c7fcb30:
      lVar8 = 0;
    }
LAB_7ff70c7fcb32:
    *(byte *)((longlong)param_1 + 0x4f) = *(byte *)((longlong)param_1 + 0x4f) & 0xf7;
LAB_7ff70c7fcb36:
    if (lVar8 == 0) goto LAB_7ff70c7fcb4f;
    fVar23 = *(float *)(lVar8 + 4);
  }
  else {
    uVar6 = *(ushort *)(*(longlong *)(param_1 + 10) + 0x40);
    if (uVar6 == 0xffff) goto LAB_7ff70c7fc97d;
    if (uVar6 != 0xfffe) {
      lVar8 = (ulonglong)uVar6 * 0x2c + *(longlong *)(param_1 + 0xe);
      goto LAB_7ff70c7fcb36;
    }
LAB_7ff70c7fcb4f:
    fVar23 = (float)(int)((float)param_1[5] * _DAT_7ff70cb1c644 + _DAT_7ff70cb1ba70);
  }
  uStack_80 = 0;
  uStack_88 = 0;
  uStack_90 = 0;
  uStack_98 = 0;
  lVar17 = *(longlong *)(lVar17 + 8);
  uVar21 = param_1[0xc];
  if (uVar21 == param_1[0xd]) {
    if (uVar21 == 0) {
      uVar20 = 8;
    }
    else {
      uVar20 = (int)uVar21 / 2 + uVar21;
    }
    uVar19 = uVar21 + 1;
    if ((int)(uVar21 + 1) < (int)uVar20) {
      uVar19 = uVar20;
    }
    lVar9 = FUN_7ff70c802100((longlong)(int)uVar19 * 0x2c);
    if (*(longlong *)(param_1 + 0xe) != 0) {
      FUN_7ff70cb12b60(lVar9,*(longlong *)(param_1 + 0xe),(longlong)(int)param_1[0xc] * 0x2c);
      FUN_7ff70c802510(*(undefined8 *)(param_1 + 0xe));
    }
    *(longlong *)(param_1 + 0xe) = lVar9;
    param_1[0xd] = uVar19;
    uVar20 = param_1[0xc];
  }
  else {
    lVar9 = *(longlong *)(param_1 + 0xe);
    uVar20 = uVar21;
  }
  lVar10 = (longlong)(int)uVar20 * 0x2c;
  *(undefined4 *)(lVar9 + lVar10) = 0;
  *(float *)(lVar9 + 4 + lVar10) = fVar23;
  puVar1 = (undefined4 *)(lVar9 + 8 + lVar10);
  *puVar1 = (uint)uStack_98;
  puVar1[1] = uStack_98._4_4_;
  puVar1[2] = (undefined4)uStack_90;
  puVar1[3] = uStack_90._4_4_;
  puVar1 = (undefined4 *)(lVar9 + 0x18 + lVar10);
  *puVar1 = (undefined4)uStack_88;
  puVar1[1] = uStack_88._4_4_;
  puVar1[2] = (undefined4)uStack_80;
  puVar1[3] = uStack_80._4_4_;
  *(undefined4 *)(lVar9 + 0x28 + lVar10) = 0xffffffff;
  param_1[0xc] = param_1[0xc] + 1;
  puVar12 = (uint *)(*(longlong *)(param_1 + 0xe) + (longlong)(int)uVar21 * 0x2c);
  uVar20 = *(uint *)(*(longlong *)(param_1 + 0xe) + 0x28 + (longlong)(int)uVar21 * 0x2c);
  if (uVar20 != 0xffffffff) {
    lVar9 = *(longlong *)(*(longlong *)(lVar17 + 0x2b0) + 0x68);
    lVar10 = (longlong)
             ((ulonglong)
              *(uint *)(*(longlong *)(*(longlong *)(lVar17 + 0x2b0) + 0x78) +
                       (ulonglong)(uVar20 & 0xfffff) * 4) << 0x2c) >> 0x2c;
    puVar12[6] = (uint)((float)*(ushort *)(lVar9 + lVar10 * 8) * *(float *)(lVar17 + 0x54));
    puVar12[7] = (uint)((float)*(ushort *)(lVar9 + 2 + lVar10 * 8) * *(float *)(lVar17 + 0x58));
    puVar12[8] = (uint)((float)((uint)*(ushort *)(lVar9 + 4 + lVar10 * 8) +
                               (uint)*(ushort *)(lVar9 + lVar10 * 8)) * *(float *)(lVar17 + 0x54));
    puVar12[9] = (uint)((float)((uint)*(ushort *)(lVar9 + 6 + lVar10 * 8) +
                               (uint)*(ushort *)(lVar9 + 2 + lVar10 * 8)) *
                       *(float *)(lVar17 + 0x58));
    param_1[0x13] =
         param_1[0x13] & 0xfc000000 |
         (uint)*(ushort *)(lVar9 + 6 + lVar10 * 8) * (uint)*(ushort *)(lVar9 + 4 + lVar10 * 8) +
         param_1[0x13] & 0x3ffffff;
  }
  uVar20 = *puVar12;
  if ((uVar20 & 1) != 0) {
    *(undefined1 *)(*(longlong *)(lVar17 + 0x38) + 0x56) = 1;
    *(undefined1 *)(lVar17 + 0x53) = 1;
    uVar20 = *puVar12;
  }
  uVar19 = uVar20 >> 6;
  uVar14 = (ulonglong)uVar19;
  if ((int)param_1[8] <= (int)uVar19) {
    uVar15 = uVar19 + 1;
    uVar22 = param_1[1];
    if ((int)uVar22 <= (int)uVar19) {
      if (uVar22 == 0) {
        uVar22 = 8;
      }
      else {
        uVar22 = (int)uVar22 / 2 + uVar22;
      }
      if ((int)uVar22 <= (int)uVar15) {
        uVar22 = uVar15;
      }
      uVar11 = FUN_7ff70c802100((ulonglong)uVar22 * 4);
      if (*(longlong *)(param_1 + 2) != 0) {
        FUN_7ff70cb12b60(uVar11,*(longlong *)(param_1 + 2),(longlong)(int)*param_1 << 2);
        FUN_7ff70c802510(*(undefined8 *)(param_1 + 2));
      }
      *(undefined8 *)(param_1 + 2) = uVar11;
      param_1[1] = uVar22;
    }
    uVar22 = *param_1;
    lVar17 = (longlong)(int)uVar22;
    if ((int)uVar22 <= (int)uVar19) {
      uVar13 = uVar14 - lVar17;
      uVar22 = (int)(uVar14 + 1) - uVar22 & 3;
      uVar18 = (ulonglong)uVar22;
      if (uVar22 != 0) {
        do {
          *(undefined4 *)(*(longlong *)(param_1 + 2) + lVar17 * 4) = 0xbf800000;
          lVar17 = lVar17 + 1;
          uVar18 = uVar18 - 1;
        } while (uVar18 != 0);
      }
      if (2 < uVar13) {
        do {
          *(undefined4 *)(*(longlong *)(param_1 + 2) + lVar17 * 4) = 0xbf800000;
          *(undefined4 *)(*(longlong *)(param_1 + 2) + 4 + lVar17 * 4) = 0xbf800000;
          *(undefined4 *)(*(longlong *)(param_1 + 2) + 8 + lVar17 * 4) = 0xbf800000;
          *(undefined4 *)(*(longlong *)(param_1 + 2) + 0xc + lVar17 * 4) = 0xbf800000;
          lVar17 = lVar17 + 4;
        } while (uVar14 + 1 != lVar17);
      }
    }
    *param_1 = uVar15;
    uVar22 = param_1[9];
    if ((int)uVar22 <= (int)uVar19) {
      if (uVar22 == 0) {
        uVar22 = 8;
      }
      else {
        uVar22 = (int)uVar22 / 2 + uVar22;
      }
      if ((int)uVar22 <= (int)uVar15) {
        uVar22 = uVar15;
      }
      uVar11 = FUN_7ff70c802100(uVar22 * 2);
      if (*(longlong *)(param_1 + 10) != 0) {
        FUN_7ff70cb12b60(uVar11,*(longlong *)(param_1 + 10),(longlong)(int)param_1[8] * 2);
        FUN_7ff70c802510(*(undefined8 *)(param_1 + 10));
      }
      *(undefined8 *)(param_1 + 10) = uVar11;
      param_1[9] = uVar22;
    }
    uVar22 = param_1[8];
    lVar17 = (longlong)(int)uVar22;
    if ((int)uVar22 <= (int)uVar19) {
      uVar13 = uVar14 - lVar17;
      uVar19 = (int)(uVar14 + 1) - uVar22 & 3;
      uVar18 = (ulonglong)uVar19;
      if (uVar19 != 0) {
        do {
          *(undefined2 *)(*(longlong *)(param_1 + 10) + lVar17 * 2) = 0xffff;
          lVar17 = lVar17 + 1;
          uVar18 = uVar18 - 1;
        } while (uVar18 != 0);
      }
      if (2 < uVar13) {
        do {
          *(undefined2 *)(*(longlong *)(param_1 + 10) + lVar17 * 2) = 0xffff;
          *(undefined2 *)(*(longlong *)(param_1 + 10) + 2 + lVar17 * 2) = 0xffff;
          *(undefined2 *)(*(longlong *)(param_1 + 10) + 4 + lVar17 * 2) = 0xffff;
          *(undefined2 *)(*(longlong *)(param_1 + 10) + 6 + lVar17 * 2) = 0xffff;
          lVar17 = lVar17 + 4;
        } while (uVar14 + 1 != lVar17);
      }
    }
    param_1[8] = uVar15;
  }
  *(uint *)(*(longlong *)(param_1 + 2) + uVar14 * 4) = puVar12[1];
  *(short *)(*(longlong *)(param_1 + 10) + uVar14 * 2) = (short)uVar21;
  pbVar2 = (byte *)(*(longlong *)(param_1 + 0x16) + 0x34 + (ulonglong)(uVar20 >> 0x16));
  *pbVar2 = *pbVar2 | (byte)(1 << ((byte)(uVar20 >> 0x13) & 7));
LAB_7ff70c7fcefe:
  param_1[0x10] =
       (int)((ulonglong)((longlong)puVar12 - *(longlong *)(param_1 + 0xe)) >> 2) * -0x45d1745d;
  param_1[4] = puVar12[1];
  if (_DAT_7ff70cbebd80 == (uStack_60 ^ (ulonglong)auStack_e8)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_60 ^ (ulonglong)auStack_e8);
  pcVar4 = (code *)swi(3);
  (*pcVar4)();
  return;
}


