/* 7ff70c7f9270 FUN_7ff70c7f9270 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

char * FUN_7ff70c7f9270(undefined8 *param_1,float param_2,char *param_3,char *param_4,float param_5)

{
  float fVar1;
  uint uVar2;
  longlong lVar3;
  longlong lVar4;
  longlong lVar5;
  code *pcVar6;
  char *pcVar7;
  undefined4 uVar8;
  int iVar9;
  undefined8 *puVar10;
  longlong lVar11;
  uint *puVar12;
  char *pcVar13;
  float *pfVar14;
  ulonglong uVar15;
  uint *puVar16;
  uint *puVar17;
  char *pcVar18;
  uint uVar19;
  uint *puVar20;
  longlong lVar21;
  char *pcVar22;
  bool bVar23;
  float fVar24;
  float fVar25;
  float fVar26;
  float fVar27;
  undefined1 auStack_f8 [32];
  undefined4 uStack_d8;
  char *pcStack_c8;
  uint uStack_c0;
  float fStack_bc;
  float fStack_b8;
  float fStack_b4;
  ulonglong uStack_b0;
  
  uStack_b0 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_f8;
  puVar12 = (uint *)*param_1;
  fVar25 = (float)(int)(_DAT_7ff70cb1ba70 + param_2);
  fVar27 = *(float *)((longlong)param_1 + 0x14);
  if (((puVar12 != (uint *)0x0) && ((float)puVar12[5] == fVar25)) &&
     (!NAN((float)puVar12[5]) && !NAN(fVar25))) {
    if (((float)puVar12[6] == fVar27) &&
       (fVar1 = _DAT_7ff70cb1c640, !NAN((float)puVar12[6]) && !NAN(fVar27)))
    goto joined_r0x7ff70c7f978c;
  }
  lVar11 = param_1[1];
  lVar3 = *(longlong *)(lVar11 + 0x2b0);
  fStack_bc = *(float *)(param_1 + 3);
  fStack_b8 = fVar25;
  fStack_b4 = fVar27;
  uVar8 = FUN_7ff70c802e60(&fStack_bc,0xc,0);
  puVar10 = (undefined8 *)FUN_7ff70c805430(*(longlong *)(lVar11 + 0x2b0) + 0xd8,uVar8,0);
  puVar12 = (uint *)*puVar10;
  if ((uint *)*puVar10 != (uint *)0x0) goto LAB_7ff70c7f9359;
  if (((*(byte *)(param_1 + 2) & 8) == 0) && (*(char *)(lVar11 + 0x50) != '\x01')) {
LAB_7ff70c7f975f:
    uStack_d8 = uVar8;
    puVar12 = (uint *)FUN_7ff70c7e7790(lVar11,param_1,fVar25,fVar27);
    *puVar10 = puVar12;
    if (puVar12 != (uint *)0x0) {
LAB_7ff70c7f9359:
      puVar12[0x14] = *(uint *)(lVar3 + 0xa4);
      *param_1 = puVar12;
      fVar1 = _DAT_7ff70cb1c640;
      goto joined_r0x7ff70c7f978c;
    }
  }
  else {
    uVar2 = *(uint *)(*(longlong *)(lVar11 + 0x2b0) + 0xc0);
    if (0 < (int)uVar2) {
      lVar4 = *(longlong *)(*(longlong *)(lVar11 + 0x2b0) + 0xd0);
      uVar19 = 0;
      puVar12 = (uint *)0x0;
      puVar17 = (uint *)0x0;
      do {
        lVar5 = *(longlong *)(lVar4 + (ulonglong)(uVar19 >> 5) * 8);
        lVar21 = (ulonglong)(uVar19 & 0x1f) * 0x68;
        puVar16 = puVar17;
        if ((*(undefined8 **)(lVar5 + 0x58 + lVar21) == param_1) &&
           (puVar20 = (uint *)(lVar5 + lVar21), (*(byte *)((longlong)puVar20 + 0x4f) & 4) == 0)) {
          if (((float)puVar20[6] == fVar27) && (!NAN((float)puVar20[6]) && !NAN(fVar27))) {
            fVar1 = (float)puVar20[5];
            if ((fVar25 < fVar1) && ((puVar12 == (uint *)0x0 || (fVar1 < (float)puVar12[5])))) {
              puVar12 = puVar20;
            }
            if (((fVar1 < fVar25) && (puVar16 = puVar20, puVar17 != (uint *)0x0)) &&
               (fVar1 < (float)puVar17[5] || fVar1 == (float)puVar17[5])) {
              puVar16 = puVar17;
            }
          }
        }
        uVar19 = uVar19 + 1;
        puVar17 = puVar16;
      } while (uVar2 != uVar19);
      if (puVar12 == (uint *)0x0) {
        puVar12 = puVar16;
        if (puVar16 == (uint *)0x0) {
          uVar19 = 0;
          puVar12 = (uint *)0x0;
          puVar17 = (uint *)0x0;
          do {
            lVar5 = *(longlong *)(lVar4 + (ulonglong)(uVar19 >> 5) * 8);
            lVar21 = (ulonglong)(uVar19 & 0x1f) * 0x68;
            puVar16 = puVar17;
            if ((*(undefined8 **)(lVar5 + 0x58 + lVar21) == param_1) &&
               (puVar20 = (uint *)(lVar5 + lVar21), (*(byte *)((longlong)puVar20 + 0x4f) & 4) == 0))
            {
              fVar1 = (float)puVar20[5];
              if ((fVar25 < fVar1) && ((puVar12 == (uint *)0x0 || (fVar1 < (float)puVar12[5])))) {
                puVar12 = puVar20;
              }
              if (((fVar1 < fVar25) && (puVar16 = puVar20, puVar17 != (uint *)0x0)) &&
                 (fVar1 < (float)puVar17[5] || fVar1 == (float)puVar17[5])) {
                puVar16 = puVar17;
              }
            }
            uVar19 = uVar19 + 1;
            puVar17 = puVar16;
          } while (uVar2 != uVar19);
          if (puVar12 != (uint *)0x0) goto LAB_7ff70c7f9681;
          puVar12 = puVar16;
          if (puVar16 == (uint *)0x0) goto LAB_7ff70c7f9758;
        }
      }
      else {
LAB_7ff70c7f9681:
        if ((puVar16 != (uint *)0x0) &&
           (((float)puVar12[5] < fVar25 + fVar25 ||
            ((float)puVar16[5] <= _DAT_7ff70cb1ba70 * fVar25)))) {
          puVar12 = puVar16;
        }
      }
      goto LAB_7ff70c7f9359;
    }
LAB_7ff70c7f9758:
    if (*(char *)(lVar11 + 0x50) == '\0') goto LAB_7ff70c7f975f;
  }
  puVar12 = (uint *)0x0;
  fVar1 = _DAT_7ff70cb1c640;
joined_r0x7ff70c7f978c:
  pcVar13 = param_3;
  _DAT_7ff70cb1c640 = fVar1;
  if (param_3 < param_4) {
    param_5 = param_5 / (param_2 / (float)puVar12[5]);
    bVar23 = true;
    pcStack_c8 = (char *)0x0;
    fVar27 = 0.0;
    fVar26 = 0.0;
    fVar25 = 0.0;
    pcVar18 = param_3;
    do {
      uStack_c0 = (uint)*pcVar13;
      uVar15 = (ulonglong)uStack_c0;
      if (*pcVar13 < '\0') {
        iVar9 = FUN_7ff70c7ff3d0(&uStack_c0,pcVar13,param_4);
        pcVar22 = pcVar13 + iVar9;
        uVar15 = (ulonglong)uStack_c0;
        if (uStack_c0 < 0x20) goto LAB_7ff70c7f941f;
LAB_7ff70c7f9429:
        if ((*puVar12 <= (uint)uVar15) ||
           (fVar24 = *(float *)(*(longlong *)(puVar12 + 2) + uVar15 * 4), fVar24 < 0.0)) {
          if (fVar1 <= (float)puVar12[5]) {
            fStack_bc = 0.0;
            lVar11 = FUN_7ff70c7f86d0(puVar12,uVar15,&fStack_bc);
            pfVar14 = (float *)(lVar11 + 4);
            if (lVar11 == 0) {
              pfVar14 = &fStack_bc;
            }
          }
          else {
            lVar11 = FUN_7ff70c7f86d0(puVar12,uVar15,0);
            pfVar14 = (float *)(lVar11 + 4);
            if (lVar11 == 0) {
              pfVar14 = (float *)(puVar12 + 4);
            }
          }
          fVar24 = *pfVar14;
        }
        if (((uStack_c0 == 9) || (uStack_c0 == 0x3000)) || (uStack_c0 == 0x20)) {
          if (bVar23) {
            fVar25 = fVar25 + fVar27;
          }
          if (bVar23) {
            pcVar18 = pcVar13;
            fVar27 = 0.0;
          }
          fVar27 = fVar27 + fVar24;
          bVar23 = false;
        }
        else {
          fVar26 = fVar26 + fVar24;
          pcVar7 = pcVar22;
          if (!bVar23) {
            fVar25 = fVar25 + fVar27 + fVar26;
            fVar26 = 0.0;
            fVar27 = 0.0;
            pcVar7 = pcVar18;
            pcStack_c8 = pcVar18;
          }
          pcVar18 = pcVar7;
          if (((0x3f < uStack_c0) ||
              (bVar23 = false, (0x8800500600000000U >> ((ulonglong)uStack_c0 & 0x3f) & 1) == 0)) &&
             (bVar23 = false, uStack_c0 != 0x3001)) {
            bVar23 = uStack_c0 != 0x3002;
          }
        }
        if (param_5 < fVar25 + fVar26) {
          if (pcStack_c8 != (char *)0x0) {
            pcVar18 = pcStack_c8;
          }
          if (fVar26 < param_5) {
            pcVar13 = pcVar18;
          }
          break;
        }
      }
      else {
        pcVar22 = pcVar13 + 1;
        if (0x1f < uStack_c0) goto LAB_7ff70c7f9429;
LAB_7ff70c7f941f:
        if ((int)uVar15 == 10) {
          bVar23 = true;
          fVar25 = 0.0;
          fVar26 = 0.0;
          fVar27 = 0.0;
        }
        else if ((int)uVar15 != 0xd) goto LAB_7ff70c7f9429;
      }
      pcVar13 = pcVar22;
    } while (pcVar22 < param_4);
    if (pcVar13 == param_3) {
      iVar9 = FUN_7ff70c803f00(pcVar13,param_4);
      pcVar13 = pcVar13 + iVar9;
    }
  }
  if (_DAT_7ff70cbebd80 == (uStack_b0 ^ (ulonglong)auStack_f8)) {
    return pcVar13;
  }
  FUN_7ff70caa97e0(uStack_b0 ^ (ulonglong)auStack_f8);
  pcVar6 = (code *)swi(3);
  pcVar13 = (char *)(*pcVar6)();
  return pcVar13;
}


