/* 7ff70c9094d0 FUN_7ff70c9094d0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c9094d0(longlong param_1)

{
  float *pfVar1;
  float fVar2;
  float fVar3;
  short sVar4;
  undefined8 uVar5;
  code *pcVar6;
  undefined4 uVar7;
  int iVar8;
  longlong lVar9;
  uint uVar10;
  uint *puVar11;
  ulonglong uVar12;
  bool bVar13;
  float fVar14;
  float fVar15;
  undefined1 auVar16 [16];
  float fVar17;
  float fVar18;
  undefined1 auStack_f8 [32];
  undefined4 uStack_d8;
  undefined4 uStack_d0;
  undefined4 uStack_c8;
  float fStack_b8;
  float fStack_b4;
  float fStack_b0;
  float fStack_ac;
  undefined8 uStack_a8;
  ulonglong uStack_a0;
  
  uStack_a0 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_f8;
  lVar9 = *(longlong *)(param_1 + 0x180);
  if ((((*(float *)(lVar9 + 0x26c) < *(float *)(param_1 + 0xf4) ||
         *(float *)(lVar9 + 0x26c) == *(float *)(param_1 + 0xf4)) ||
       (*(float *)(param_1 + 0xfc) < *(float *)(lVar9 + 0x264) ||
        *(float *)(param_1 + 0xfc) == *(float *)(lVar9 + 0x264))) ||
      (pfVar1 = (float *)(param_1 + 0xf0),
      *(float *)(lVar9 + 0x268) < *pfVar1 || *(float *)(lVar9 + 0x268) == *pfVar1)) ||
     (*(float *)(param_1 + 0xf8) < *(float *)(lVar9 + 0x260) ||
      *(float *)(param_1 + 0xf8) == *(float *)(lVar9 + 0x260))) goto LAB_7ff70c9099a6;
  uVar5 = *(undefined8 *)(*(longlong *)(param_1 + 0x188) + 0x2c8);
  FUN_7ff70c7c6750(*(undefined8 *)(param_1 + 0x1a0),uVar5,0);
  FUN_7ff70c7b7c50(uVar5,param_1 + 0x140,param_1 + 0x148,0);
  fVar3 = _DAT_7ff70cb1ba2c;
  if ((longlong)*(short *)(param_1 + 0x78) == 0) {
    lVar9 = param_1 + 0x1a8;
  }
  else {
    lVar9 = *(longlong *)(param_1 + 0x1c8) + (longlong)*(short *)(param_1 + 0x78) * 0x18 + -0x18;
  }
  fVar14 = *(float *)(param_1 + 0x104 + (ulonglong)(*(short *)(param_1 + 0x228) < 1) * 0x10);
  fVar15 = *(float *)(param_1 + 0xe8) + fVar14;
  auVar16 = blendvps(ZEXT416((uint)fVar15),ZEXT416((uint)*(float *)(param_1 + 0x104)),
                     ZEXT416(-(uint)(fVar15 <= *(float *)(param_1 + 0x104))));
  uVar10 = *(uint *)(param_1 + 4);
  fVar15 = 0.0;
  if ((uVar10 & 0x100) != 0) {
    fVar15 = _DAT_7ff70cb1ba2c;
  }
  fVar15 = auVar16._0_4_ + fVar15;
  fVar2 = *(float *)(param_1 + 0x10c);
  fVar17 = fVar15;
  if ((*(char *)(param_1 + 0x23b) == '\x01') &&
     (fVar14 = fVar14 + *(float *)(lVar9 + 8), fVar17 = fVar2, fVar14 <= fVar2)) {
    fVar17 = fVar14;
  }
  if (((uVar10 & 0x200) != 0) && (iVar8 = *(int *)(param_1 + 0x6c), 0 < iVar8)) {
    uVar12 = 0;
    do {
      if ((*(uint *)(*(longlong *)(param_1 + 0x48) + (uVar12 >> 5 & 0x7ffffff) * 4) >>
           ((uint)uVar12 & 0x1f) & 1) != 0) {
        sVar4 = *(short *)(*(longlong *)(param_1 + 0x28) + uVar12 * 2);
        if (*(short *)(param_1 + 0x212) == sVar4) {
          bVar13 = *(short *)(param_1 + 0x7a) == *(short *)(param_1 + 0x78);
        }
        else {
          bVar13 = false;
        }
        puVar11 = (uint *)((longlong)sVar4 * 0x74 + *(longlong *)(param_1 + 0x18));
        fVar14 = (float)puVar11[3];
        if ((bool)((fVar14 < *(float *)(param_1 + 0x128) || fVar14 == *(float *)(param_1 + 0x128)) |
                  bVar13)) {
          if (((((short)puVar11[0x17] != -1) || ((*puVar11 & 0x40000020) == 0)) ||
              ((*(uint *)(param_1 + 4) & 0x1e000) == 0x4000)) && ((float)puVar11[9] < fVar14)) {
            fVar18 = fVar2;
            if (((!bVar13 && uVar12 + 1 != (longlong)*(short *)(param_1 + 0x22c)) &&
                 *(short *)(param_1 + 0x20c) != sVar4) && ((*(byte *)(param_1 + 5) & 0x18) != 0)) {
              fVar18 = fVar17;
            }
            if (fVar15 < fVar18) {
              if (*(short *)(param_1 + 0x212) == sVar4) {
                bVar13 = *(short *)(param_1 + 0x7a) == *(short *)(param_1 + 0x78);
              }
              else {
                bVar13 = false;
              }
              if ((bVar13 == false) && (*(short *)(param_1 + 0x20c) != sVar4)) {
                if ((uVar12 + 1 == (longlong)*(short *)(param_1 + 0x22c)) ||
                   ((*(byte *)(param_1 + 5) & 0x18) != 0)) {
                  uVar7 = *(undefined4 *)(param_1 + 0xa4);
                }
                else {
                  uVar7 = *(undefined4 *)(param_1 + 0xa8);
                }
              }
              else {
                uVar7 = FUN_7ff70c80a070(bVar13 | 0x1c,fVar3);
                fVar14 = (float)puVar11[3];
              }
              uStack_a8 = CONCAT44(fVar15,puVar11[3]);
              uStack_d8 = 0x3f800000;
              fStack_b8 = fVar14;
              fStack_b4 = fVar18;
              FUN_7ff70c7bd6c0(uVar5,&uStack_a8,&fStack_b8,uVar7);
              iVar8 = *(int *)(param_1 + 0x6c);
            }
          }
        }
      }
      uVar12 = uVar12 + 1;
    } while ((longlong)uVar12 < (longlong)iVar8);
    uVar10 = *(uint *)(param_1 + 4);
  }
  if ((uVar10 & 0x500) != 0) {
    fStack_b8 = *pfVar1;
    fStack_b4 = *(float *)(param_1 + 0xf4);
    fStack_b0 = *(float *)(param_1 + 0xf8);
    fStack_ac = *(float *)(param_1 + 0xfc);
    uVar7 = *(undefined4 *)(param_1 + 0xa4);
    if ((uVar10 & 0x500) == 0x500) {
      uStack_c8 = 0x3f800000;
      uStack_d0 = 0;
      uStack_d8 = 0;
      FUN_7ff70c7bd870(uVar5,&fStack_b8,&fStack_b0);
    }
    else {
      if ((uVar10 & 0x400) == 0) {
        if ((uVar10 & 0x100) == 0) goto LAB_7ff70c909923;
        uStack_a8 = CONCAT44(fStack_b4,fStack_b0);
        uStack_d8 = 0x3f800000;
        FUN_7ff70c7bd6c0(uVar5,&fStack_b8,&uStack_a8,uVar7);
        fVar14 = fStack_ac;
        fVar3 = fStack_b8;
      }
      else {
        uStack_a8 = CONCAT44(fStack_ac,fStack_b8);
        uStack_d8 = 0x3f800000;
        FUN_7ff70c7bd6c0(uVar5,&fStack_b8,&uStack_a8,uVar7);
        fVar14 = fStack_b4;
        fVar3 = fStack_b0;
      }
      uStack_a8 = CONCAT44(fVar14,fVar3);
      uStack_d8 = 0x3f800000;
      FUN_7ff70c7bd6c0(uVar5,&uStack_a8,&fStack_b0,uVar7);
    }
LAB_7ff70c909923:
    uVar10 = *(uint *)(param_1 + 4);
  }
  if (((((char)uVar10 < '\0') &&
       (fVar3 = *(float *)(param_1 + 0x80), fVar3 < *(float *)(param_1 + 0xfc))) &&
      (*(float *)(param_1 + 0x134) <= fVar3)) && (fVar3 < *(float *)(param_1 + 0x13c))) {
    fStack_b8 = *(float *)(param_1 + 0xb0);
    uStack_a8 = CONCAT44(fVar3,*(undefined4 *)(param_1 + 0xac));
    uStack_d8 = 0x3f800000;
    fStack_b4 = fVar3;
    FUN_7ff70c7bd6c0(uVar5,&uStack_a8,&fStack_b8,*(undefined4 *)(param_1 + 0xa8));
  }
  FUN_7ff70c7b8130(uVar5);
LAB_7ff70c9099a6:
  if (_DAT_7ff70cbebd80 != (uStack_a0 ^ (ulonglong)auStack_f8)) {
    FUN_7ff70caa97e0(uStack_a0 ^ (ulonglong)auStack_f8);
    pcVar6 = (code *)swi(3);
    (*pcVar6)();
    return;
  }
  return;
}


