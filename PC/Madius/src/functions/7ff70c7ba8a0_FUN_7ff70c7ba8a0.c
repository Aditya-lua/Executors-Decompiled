/* 7ff70c7ba8a0 FUN_7ff70c7ba8a0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c7ba8a0(longlong param_1,float *param_2,float param_3,undefined8 param_4,int param_5,
                     uint param_6)

{
  float *pfVar1;
  int iVar2;
  longlong lVar3;
  undefined8 uVar4;
  code *pcVar5;
  longlong lVar6;
  float *pfVar7;
  ushort uVar8;
  int iVar9;
  uint uVar10;
  uint uVar11;
  int iVar12;
  longlong *plVar13;
  uint uVar14;
  uint uVar15;
  uint uVar16;
  undefined4 uVar17;
  int iVar18;
  float fVar19;
  undefined1 auVar20 [16];
  longlong lStack_a0;
  undefined1 auStack_98 [56];
  ulonglong uStack_60;
  
  plVar13 = (longlong *)auStack_98;
  uStack_60 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_98;
  if (_DAT_7ff70cb1ba70 <= param_3) {
    plVar13 = (longlong *)auStack_98;
    if ((int)param_6 < 1) {
      lVar6 = *(longlong *)(param_1 + 0x38);
      if ((uint)(int)(_DAT_7ff70cb1ba30 + param_3) < 0x40) {
        uVar8 = (ushort)*(byte *)(lVar6 + 500 + (ulonglong)(uint)(int)(_DAT_7ff70cb1ba30 + param_3))
        ;
        plVar13 = (longlong *)auStack_98;
      }
      else {
        fVar19 = *(float *)(lVar6 + 0x2c);
        if (param_3 <= *(float *)(lVar6 + 0x2c)) {
          fVar19 = param_3;
        }
        lStack_a0 = lVar6;
        fVar19 = (float)func_0x7ff70d6bccc9(_DAT_7ff70cb1ba2c - fVar19 / param_3);
        auVar20 = roundss(ZEXT816(0),ZEXT416((uint)(_DAT_7ff70cb1ba20 / fVar19)),10);
        uVar11 = ((int)auVar20._0_4_ - ((int)auVar20._0_4_ + 1 >> 0x1f)) + 1U & 0xfffffffe;
        uVar10 = 4;
        if (4 < (int)uVar11) {
          uVar10 = uVar11;
        }
        uVar8 = 0x200;
        plVar13 = &lStack_a0;
        if ((int)uVar10 < 0x200) {
          uVar8 = (ushort)uVar10;
          plVar13 = &lStack_a0;
        }
      }
      param_6 = 0x30 / uVar8;
    }
    uVar10 = 0xc;
    if (param_6 < 0xc) {
      uVar10 = param_6;
    }
    uVar11 = 1;
    uVar14 = uVar10;
    if (param_6 == 0) {
      uVar14 = 1;
    }
    iVar12 = (int)param_4;
    uVar16 = iVar12 - param_5;
    if (iVar12 < param_5) {
      uVar16 = param_5 - iVar12;
    }
    if (uVar14 < 2) {
      iVar12 = uVar16 + 1;
      uVar17 = 0;
    }
    else {
      uVar17 = 0;
      if ((int)((ulonglong)uVar16 % (ulonglong)uVar14) == 0) {
        iVar12 = uVar16 / uVar14 + 1;
        uVar11 = uVar10;
      }
      else {
        iVar12 = uVar16 / uVar14 + 2;
        uVar17 = 1;
        uVar11 = (int)(char)-((char)((char)uVar14 - (char)((ulonglong)uVar16 % (ulonglong)uVar14)) /
                             '\x02') + uVar14;
      }
    }
    iVar9 = *(int *)(param_1 + 0x50);
    iVar12 = iVar12 + iVar9;
    iVar18 = *(int *)(param_1 + 0x54);
    if (iVar18 < iVar12) {
      *(uint *)((longlong)plVar13 + 0x28) = uVar11;
      *(undefined8 *)((longlong)plVar13 + 0x30) = param_4;
      *(undefined4 *)((longlong)plVar13 + 0x2c) = uVar17;
      if (iVar18 == 0) {
        iVar18 = 8;
      }
      else {
        iVar18 = iVar18 / 2 + iVar18;
      }
      if (iVar18 <= iVar12) {
        iVar18 = iVar12;
      }
      *(undefined8 *)((longlong)plVar13 + -8) = 0x7ff70c7baac0;
      lVar6 = FUN_7ff70c802100((longlong)iVar18 << 3);
      lVar3 = *(longlong *)(param_1 + 0x58);
      if (lVar3 != 0) {
        iVar2 = *(int *)(param_1 + 0x50);
        *(undefined8 *)((longlong)plVar13 + -8) = 0x7ff70c7baadc;
        FUN_7ff70cb12b60(lVar6,lVar3,(longlong)iVar2 << 3);
        uVar4 = *(undefined8 *)(param_1 + 0x58);
        *(undefined8 *)((longlong)plVar13 + -8) = 0x7ff70c7baae5;
        FUN_7ff70c802510(uVar4);
      }
      *(longlong *)(param_1 + 0x58) = lVar6;
      *(int *)(param_1 + 0x54) = iVar18;
      param_4 = *(undefined8 *)((longlong)plVar13 + 0x30);
      uVar17 = *(undefined4 *)((longlong)plVar13 + 0x2c);
      uVar11 = *(uint *)((longlong)plVar13 + 0x28);
    }
    else {
      lVar6 = *(longlong *)(param_1 + 0x58);
    }
    *(int *)(param_1 + 0x50) = iVar12;
    pfVar1 = (float *)(lVar6 + (longlong)iVar9 * 8);
    uVar16 = (uint)param_4;
    uVar10 = uVar16;
    if (0x2f < uVar16) {
      iVar12 = ((uint)((int)uVar16 / 6 + ((int)uVar16 >> 0x1f)) >> 3) - ((int)uVar16 >> 0x1f);
      uVar15 = uVar16 + iVar12 * -0x30;
      uVar10 = uVar16 + 0x30 + iVar12 * -0x30;
      if (-1 < (int)uVar15) {
        uVar10 = uVar15;
      }
    }
    pfVar7 = pfVar1 + 2;
    lVar6 = *(longlong *)(param_1 + 0x38);
    if (param_5 < (int)uVar16) {
      fVar19 = *(float *)(lVar6 + 0x74 + (ulonglong)uVar10 * 8);
      *pfVar1 = *(float *)(lVar6 + 0x70 + (ulonglong)uVar10 * 8) * param_3 + *param_2;
      pfVar1[1] = fVar19 * param_3 + param_2[1];
      iVar12 = uVar16 - uVar11;
      if (param_5 <= iVar12) {
        iVar9 = uVar10 - uVar11;
        do {
          iVar18 = iVar9 + 0x30;
          if (-1 < iVar9) {
            iVar18 = iVar9;
          }
          fVar19 = *(float *)(*(longlong *)(param_1 + 0x38) + 0x74 + (longlong)iVar18 * 8);
          *pfVar7 = *(float *)(*(longlong *)(param_1 + 0x38) + 0x70 + (longlong)iVar18 * 8) *
                    param_3 + *param_2;
          pfVar7[1] = fVar19 * param_3 + param_2[1];
          pfVar7 = pfVar7 + 2;
          iVar12 = iVar12 - uVar14;
          iVar9 = iVar18 - uVar14;
        } while (param_5 <= iVar12);
      }
    }
    else {
      fVar19 = *(float *)(lVar6 + 0x74 + (longlong)(int)uVar10 * 8);
      *pfVar1 = *(float *)(lVar6 + 0x70 + (longlong)(int)uVar10 * 8) * param_3 + *param_2;
      pfVar1[1] = fVar19 * param_3 + param_2[1];
      iVar12 = uVar16 + uVar11;
      if (iVar12 <= param_5) {
        iVar9 = uVar10 + uVar11;
        do {
          iVar18 = iVar9 + -0x30;
          if (iVar9 < 0x30) {
            iVar18 = iVar9;
          }
          fVar19 = *(float *)(*(longlong *)(param_1 + 0x38) + 0x74 + (longlong)iVar18 * 8);
          *pfVar7 = *(float *)(*(longlong *)(param_1 + 0x38) + 0x70 + (longlong)iVar18 * 8) *
                    param_3 + *param_2;
          pfVar7[1] = fVar19 * param_3 + param_2[1];
          pfVar7 = pfVar7 + 2;
          iVar9 = iVar18 + uVar14;
          iVar12 = iVar12 + uVar14;
        } while (iVar12 <= param_5);
      }
    }
    if ((char)uVar17 != '\0') {
      iVar12 = ((uint)(param_5 / 6 + (param_5 >> 0x1f)) >> 3) - (param_5 >> 0x1f);
      uVar11 = param_5 + iVar12 * -0x30;
      uVar10 = param_5 + 0x30 + iVar12 * -0x30;
      if (-1 < (int)uVar11) {
        uVar10 = uVar11;
      }
      fVar19 = *(float *)(*(longlong *)(param_1 + 0x38) + 0x74 + (ulonglong)uVar10 * 8);
      *pfVar7 = *(float *)(*(longlong *)(param_1 + 0x38) + 0x70 + (ulonglong)uVar10 * 8) * param_3 +
                *param_2;
      pfVar7[1] = param_3 * fVar19 + param_2[1];
    }
  }
  else {
    iVar12 = *(int *)(param_1 + 0x50);
    if (iVar12 == *(int *)(param_1 + 0x54)) {
      if (iVar12 == 0) {
        iVar9 = 8;
      }
      else {
        iVar9 = iVar12 / 2 + iVar12;
      }
      iVar18 = iVar12 + 1;
      if (iVar12 + 1 < iVar9) {
        iVar18 = iVar9;
      }
      lStack_a0 = 0x7ff70c7ba94e;
      lVar6 = FUN_7ff70c802100((longlong)iVar18 << 3);
      if (*(longlong *)(param_1 + 0x58) != 0) {
        lStack_a0 = 0x7ff70c7ba96a;
        FUN_7ff70cb12b60(lVar6,*(longlong *)(param_1 + 0x58),(longlong)*(int *)(param_1 + 0x50) << 3
                        );
        lStack_a0 = 0x7ff70c7ba973;
        FUN_7ff70c802510(*(undefined8 *)(param_1 + 0x58));
      }
      *(longlong *)(param_1 + 0x58) = lVar6;
      *(int *)(param_1 + 0x54) = iVar18;
      iVar12 = *(int *)(param_1 + 0x50);
    }
    else {
      lVar6 = *(longlong *)(param_1 + 0x58);
    }
    *(undefined8 *)(lVar6 + (longlong)iVar12 * 8) = *(undefined8 *)param_2;
    *(int *)(param_1 + 0x50) = *(int *)(param_1 + 0x50) + 1;
  }
  if (_DAT_7ff70cbebd80 != (*(ulonglong *)((longlong)plVar13 + 0x38) ^ (ulonglong)plVar13)) {
    *(undefined8 *)((longlong)plVar13 + -8) = 0x7ff70c7bace5;
    FUN_7ff70caa97e0(*(ulonglong *)((longlong)plVar13 + 0x38) ^ (ulonglong)plVar13);
    pcVar5 = (code *)swi(3);
    (*pcVar5)();
    return;
  }
  return;
}


