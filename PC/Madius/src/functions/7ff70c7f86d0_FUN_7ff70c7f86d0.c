/* 7ff70c7f86d0 FUN_7ff70c7f86d0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

longlong FUN_7ff70c7f86d0(uint *param_1,ushort param_2,float *param_3)

{
  ushort uVar1;
  longlong lVar2;
  longlong lVar3;
  ushort *puVar4;
  code *pcVar5;
  uint *puVar6;
  char cVar7;
  ushort uVar8;
  longlong lVar9;
  undefined8 uVar10;
  ulonglong uVar11;
  longlong lVar12;
  uint uVar13;
  longlong *plVar14;
  uint uVar15;
  float fVar16;
  float fVar17;
  undefined1 auVar18 [16];
  float fVar19;
  undefined1 auStack_e8 [32];
  ushort uStack_c8;
  undefined8 *puStack_c0;
  float *pfStack_b8;
  uint *puStack_b0;
  ushort uStack_a2;
  longlong *plStack_a0;
  undefined8 uStack_98;
  undefined8 uStack_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined4 uStack_70;
  ulonglong uStack_60;
  
  uStack_60 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_e8;
  lVar12 = *(longlong *)(param_1 + 0x16);
  lVar2 = *(longlong *)(lVar12 + 8);
  if ((*(char *)(lVar2 + 0x50) == '\0') && ((*(byte *)(lVar12 + 0x10) & 4) == 0)) {
    uVar8 = param_2;
    if (*(int *)(lVar12 + 0x38) != 0) {
      uVar8 = FUN_7ff70c804a30(lVar12 + 0x38,param_2,param_2);
    }
    if (((uVar8 == *(ushort *)(lVar12 + 0x30)) && (*(char *)(lVar12 + 0x35) == '\x01')) &&
       (lVar9 = FUN_7ff70c7fcff0(lVar2,param_1), lVar9 != 0)) goto LAB_7ff70c7f8c34;
    puStack_b0 = param_1;
    uStack_a2 = param_2;
    if ((longlong)*(int *)(lVar12 + 0x20) != 0) {
      plVar14 = *(longlong **)(lVar12 + 0x28);
      plStack_a0 = plVar14 + *(int *)(lVar12 + 0x20);
      lVar12 = *(longlong *)(param_1 + 0x18);
      uVar15 = 0;
LAB_7ff70c7f8832:
      lVar9 = *plVar14;
      lVar3 = *(longlong *)(lVar9 + 0x80);
      if (lVar3 == 0) {
        lVar3 = *(longlong *)(lVar2 + 0x2b8);
        puVar4 = *(ushort **)(lVar9 + 0x48);
      }
      else {
        puVar4 = *(ushort **)(lVar9 + 0x48);
      }
      if (puVar4 != (ushort *)0x0) {
        uVar1 = *puVar4;
        while (uVar1 != 0) {
          if ((uVar1 <= uVar8) && (uVar8 <= puVar4[1])) goto LAB_7ff70c7f881c;
          uVar1 = puVar4[2];
          puVar4 = puVar4 + 2;
        }
      }
      uStack_c8 = uVar8;
      if (param_3 != (float *)0x0) {
        puStack_c0 = (undefined8 *)0x0;
        pfStack_b8 = param_3;
        cVar7 = (**(code **)(lVar3 + 0x40))(lVar2,lVar9,puStack_b0,lVar12);
        puVar6 = puStack_b0;
        if (cVar7 == '\0') goto LAB_7ff70c7f881c;
        fVar19 = *param_3;
        if (lVar9 != 0) {
          fVar17 = *(float *)(**(longlong **)(*(longlong *)(puStack_b0 + 0x16) + 0x28) + 0x3c);
          if ((fVar17 != 0.0) || (fVar16 = _DAT_7ff70cb1ba2c, NAN(fVar17))) {
            fVar16 = (float)puStack_b0[5] / fVar17;
          }
          fVar17 = *(float *)(lVar9 + 0x5c) * fVar16;
          fVar16 = fVar16 * *(float *)(lVar9 + 0x58);
          if (fVar19 <= fVar17) {
            fVar17 = fVar19;
          }
          auVar18 = blendvps(ZEXT416((uint)fVar17),ZEXT416((uint)fVar16),
                             ZEXT416(-(uint)(fVar19 < fVar16)));
          fVar19 = auVar18._0_4_;
          if (*(char *)(lVar9 + 0x36) != '\0') {
            fVar19 = (float)(int)(fVar19 + _DAT_7ff70cb1ba70);
          }
          fVar19 = fVar19 + *(float *)(lVar9 + 0x60);
        }
        if ((int)puStack_b0[8] <= (int)(uint)uVar8) {
          uVar13 = uVar8 + 1;
          uVar15 = puStack_b0[1];
          if ((int)uVar15 <= (int)(uint)uVar8) {
            if (uVar15 == 0) {
              uVar15 = 8;
            }
            else {
              uVar15 = (int)uVar15 / 2 + uVar15;
            }
            if ((int)uVar15 <= (int)uVar13) {
              uVar15 = uVar13;
            }
            uVar10 = FUN_7ff70c802100((ulonglong)uVar15 * 4);
            if (*(longlong *)(puVar6 + 2) != 0) {
              FUN_7ff70cb12b60(uVar10,*(longlong *)(puVar6 + 2),(longlong)(int)*puVar6 << 2);
              FUN_7ff70c802510(*(undefined8 *)(puVar6 + 2));
            }
            *(undefined8 *)(puVar6 + 2) = uVar10;
            puVar6[1] = uVar15;
          }
          uVar11 = (ulonglong)(int)*puVar6;
          if ((int)*puVar6 <= (int)(uint)uVar8) {
            do {
              *(undefined4 *)(*(longlong *)(puVar6 + 2) + uVar11 * 4) = 0xbf800000;
              uVar11 = uVar11 + 1;
            } while (uVar13 != uVar11);
          }
          *puVar6 = uVar13;
          uVar15 = puVar6[9];
          if ((int)uVar15 <= (int)(uint)uVar8) {
            if (uVar15 == 0) {
              uVar15 = 8;
            }
            else {
              uVar15 = (int)uVar15 / 2 + uVar15;
            }
            if ((int)uVar15 <= (int)uVar13) {
              uVar15 = uVar13;
            }
            uVar10 = FUN_7ff70c802100(uVar15 * 2);
            if (*(longlong *)(puVar6 + 10) != 0) {
              FUN_7ff70cb12b60(uVar10,*(longlong *)(puVar6 + 10),(longlong)(int)puVar6[8] * 2);
              FUN_7ff70c802510(*(undefined8 *)(puVar6 + 10));
            }
            *(undefined8 *)(puVar6 + 10) = uVar10;
            puVar6[9] = uVar15;
          }
          uVar11 = (ulonglong)(int)puVar6[8];
          if ((int)puVar6[8] <= (int)(uint)uVar8) {
            do {
              *(undefined2 *)(*(longlong *)(puVar6 + 10) + uVar11 * 2) = 0xffff;
              uVar11 = uVar11 + 1;
            } while (uVar13 != uVar11);
          }
          puVar6[8] = uVar13;
        }
        *(float *)(*(longlong *)(puVar6 + 2) + (ulonglong)uVar8 * 4) = fVar19;
        goto LAB_7ff70c7f8c32;
      }
      uStack_88 = 0;
      uStack_80 = 0;
      uStack_98 = 0;
      uStack_90 = 0;
      uStack_78 = 0;
      uStack_70 = 0xffffffff;
      puStack_c0 = &uStack_98;
      pfStack_b8 = (float *)0x0;
      cVar7 = (**(code **)(lVar3 + 0x40))(lVar2,lVar9,puStack_b0,lVar12);
      if (cVar7 == '\0') goto LAB_7ff70c7f881c;
      uStack_98 = CONCAT44(uStack_98._4_4_,
                           ((uint)uStack_98 & 3 | (uint)uStack_a2 << 6) + (uVar15 & 0xf) * 4);
      lVar9 = FUN_7ff70c7e5b10(lVar2,puStack_b0,lVar9,&uStack_98);
      goto LAB_7ff70c7f8c34;
    }
LAB_7ff70c7f8907:
    puVar6 = puStack_b0;
    if ((*(byte *)((longlong)puStack_b0 + 0x4f) & 8) == 0) {
      if (puStack_b0[0x10] == 0xffffffff) {
        FUN_7ff70c7fc720(puStack_b0);
      }
      if ((int)puVar6[8] <= (int)(uint)uVar8) {
        uVar13 = uVar8 + 1;
        uVar15 = puVar6[1];
        if ((int)uVar15 <= (int)(uint)uVar8) {
          if (uVar15 == 0) {
            uVar15 = 8;
          }
          else {
            uVar15 = (int)uVar15 / 2 + uVar15;
          }
          if ((int)uVar15 <= (int)uVar13) {
            uVar15 = uVar13;
          }
          uVar10 = FUN_7ff70c802100((ulonglong)uVar15 * 4);
          if (*(longlong *)(puVar6 + 2) != 0) {
            FUN_7ff70cb12b60(uVar10,*(longlong *)(puVar6 + 2),(longlong)(int)*puVar6 << 2);
            FUN_7ff70c802510(*(undefined8 *)(puVar6 + 2));
          }
          *(undefined8 *)(puVar6 + 2) = uVar10;
          puVar6[1] = uVar15;
        }
        uVar11 = (ulonglong)(int)*puVar6;
        if ((int)*puVar6 <= (int)(uint)uVar8) {
          do {
            *(undefined4 *)(*(longlong *)(puVar6 + 2) + uVar11 * 4) = 0xbf800000;
            uVar11 = uVar11 + 1;
          } while (uVar13 != uVar11);
        }
        *puVar6 = uVar13;
        uVar15 = puVar6[9];
        if ((int)uVar15 <= (int)(uint)uVar8) {
          if (uVar15 == 0) {
            uVar15 = 8;
          }
          else {
            uVar15 = (int)uVar15 / 2 + uVar15;
          }
          if ((int)uVar15 <= (int)uVar13) {
            uVar15 = uVar13;
          }
          uVar10 = FUN_7ff70c802100(uVar15 * 2);
          if (*(longlong *)(puVar6 + 10) != 0) {
            FUN_7ff70cb12b60(uVar10,*(longlong *)(puVar6 + 10),(longlong)(int)puVar6[8] * 2);
            FUN_7ff70c802510(*(undefined8 *)(puVar6 + 10));
          }
          *(undefined8 *)(puVar6 + 10) = uVar10;
          puVar6[9] = uVar15;
        }
        uVar11 = (ulonglong)(int)puVar6[8];
        if ((int)puVar6[8] <= (int)(uint)uVar8) {
          do {
            *(undefined2 *)(*(longlong *)(puVar6 + 10) + uVar11 * 2) = 0xffff;
            uVar11 = uVar11 + 1;
          } while (uVar13 != uVar11);
        }
        puVar6[8] = uVar13;
      }
      *(uint *)(*(longlong *)(puVar6 + 2) + (ulonglong)uVar8 * 4) = puVar6[4];
      *(undefined2 *)(*(longlong *)(puVar6 + 10) + (ulonglong)uVar8 * 2) = 0xfffe;
    }
  }
  else if ((param_1[0x10] == 0xffffffff) && ((*(byte *)((longlong)param_1 + 0x4f) & 8) == 0)) {
    FUN_7ff70c7fc720();
  }
LAB_7ff70c7f8c32:
  lVar9 = 0;
LAB_7ff70c7f8c34:
  if (_DAT_7ff70cbebd80 == (uStack_60 ^ (ulonglong)auStack_e8)) {
    return lVar9;
  }
  FUN_7ff70caa97e0(uStack_60 ^ (ulonglong)auStack_e8);
  pcVar5 = (code *)swi(3);
  lVar12 = (*pcVar5)();
  return lVar12;
LAB_7ff70c7f881c:
  lVar12 = lVar12 + *(longlong *)(lVar3 + 0x48);
  uVar15 = uVar15 + 1;
  plVar14 = plVar14 + 1;
  if (plVar14 == plStack_a0) goto LAB_7ff70c7f8907;
  goto LAB_7ff70c7f8832;
}


