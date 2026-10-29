/* 7ff70c7bb0c0 FUN_7ff70c7bb0c0 */

/* WARNING: Instruction at (ram,0x7ff70c7bb229) overlaps instruction at (ram,0x7ff70c7bb227)
    */
/* WARNING: Control flow encountered bad instruction data */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c7bb0c0(longlong param_1,float *param_2,float param_3,undefined8 param_4,float param_5
                     ,int param_6)

{
  longlong lVar1;
  undefined8 uVar2;
  undefined1 auVar3 [16];
  int iVar4;
  uint uVar5;
  float *pfVar6;
  longlong lVar7;
  undefined8 uVar8;
  int iVar9;
  float **ppfVar10;
  uint uVar11;
  code *unaff_R12;
  int iVar12;
  code *pcVar13;
  bool bVar14;
  bool bVar15;
  int iVar16;
  int iVar17;
  float fVar18;
  float fVar19;
  float fVar20;
  undefined1 auVar21 [16];
  undefined1 auVar22 [16];
  undefined1 auVar24 [16];
  undefined1 auVar25 [16];
  undefined4 in_XMM3_Dc;
  undefined4 in_XMM3_Dd;
  float fVar26;
  float *pfStack_118;
  float *pfStack_110;
  undefined1 auStack_108 [32];
  int iStack_e8;
  undefined4 uStack_e0;
  int iStack_d4;
  ulonglong uStack_d0;
  undefined1 auVar23 [16];
  
  fVar26 = (float)param_4;
  ppfVar10 = (float **)auStack_108;
  uStack_d0 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_108;
  if (_DAT_7ff70cb1ba70 <= param_3) {
    if (0 < param_6) {
      pfStack_110 = (float *)(longlong)*(int *)(param_1 + 0x50);
      pcVar13 = (code *)((longlong)(param_6 + 1) + (longlong)pfStack_110);
      if (*(int *)(param_1 + 0x54) < (int)pcVar13) {
        pfStack_110 = (float *)0x7ff70c7bb197;
        pfVar6 = (float *)FUN_7ff70c802100((longlong)pcVar13 * 8);
        pfStack_110 = pfVar6;
        if (*(longlong *)(param_1 + 0x58) != 0) {
          pfStack_110 = (float *)0x7ff70c7bb1b3;
          FUN_7ff70cb12b60(pfVar6,*(longlong *)(param_1 + 0x58),
                           (longlong)*(int *)(param_1 + 0x50) << 3);
          pfStack_110 = (float *)0x7ff70c7bb1bc;
          pfStack_110 = (float *)FUN_7ff70c802510(*(undefined8 *)(param_1 + 0x58));
        }
        *(float **)(param_1 + 0x58) = pfVar6;
        *(int *)(param_1 + 0x54) = (int)pcVar13;
      }
      bVar14 = false;
      iVar12 = 0;
      bVar15 = true;
      pfStack_118 = (float *)0x7ff70c7bb1db;
      func_0x7ff70d7d777e();
      if (bVar14 || bVar15) {
        ppfVar10 = (float **)(ulonglong)_DAT_7ff70cb965c8;
      }
      else {
        ppfVar10 = &pfStack_118;
        pfStack_118 = param_2;
      }
      do {
        fVar26 = param_2[1];
        *(undefined8 *)((longlong)ppfVar10 + -8) = 0x7ff70c7bb24c;
        fVar18 = (float)(*pcVar13)();
        fVar20 = *param_2;
        *(undefined8 *)((longlong)ppfVar10 + -8) = 0x7ff70c7bb25c;
        fVar19 = (float)(*unaff_R12)();
        iVar9 = *(int *)(param_1 + 0x50);
        if (iVar9 == *(int *)(param_1 + 0x54)) {
          if (iVar9 == 0) {
            iVar4 = 8;
          }
          else {
            iVar4 = iVar9 / 2 + iVar9;
          }
          iVar16 = iVar9 + 1;
          if (iVar9 + 1 < iVar4) {
            iVar16 = iVar4;
          }
          *(undefined8 *)((longlong)ppfVar10 + -8) = 0x7ff70c7bb29a;
          lVar7 = FUN_7ff70c802100((longlong)iVar16 << 3);
          lVar1 = *(longlong *)(param_1 + 0x58);
          if (lVar1 != 0) {
            iVar9 = *(int *)(param_1 + 0x50);
            *(undefined8 *)((longlong)ppfVar10 + -8) = 0x7ff70c7bb2b6;
            FUN_7ff70cb12b60(lVar7,lVar1,(longlong)iVar9 << 3);
            uVar8 = *(undefined8 *)(param_1 + 0x58);
            *(undefined8 *)((longlong)ppfVar10 + -8) = 0x7ff70c7bb2bf;
            FUN_7ff70c802510(uVar8);
          }
          *(longlong *)(param_1 + 0x58) = lVar7;
          *(int *)(param_1 + 0x54) = iVar16;
          iVar9 = *(int *)(param_1 + 0x50);
        }
        else {
          lVar7 = *(longlong *)(param_1 + 0x58);
        }
        *(float *)(lVar7 + (longlong)iVar9 * 8) = fVar20 + fVar19 * param_3;
        *(float *)(lVar7 + 4 + (longlong)iVar9 * 8) = fVar26 + fVar18 * param_3;
        *(int *)(param_1 + 0x50) = *(int *)(param_1 + 0x50) + 1;
        iVar12 = iVar12 + 1;
      } while (param_6 + 1 != iVar12);
      goto LAB_7ff70c7bb378;
    }
    lVar7 = *(longlong *)(param_1 + 0x38);
    if (*(float *)(lVar7 + 0x1f0) < param_3) {
      fVar26 = (float)(_DAT_7ff70cb1bac0 & (uint)(param_5 - fVar26));
      if ((uint)(int)(_DAT_7ff70cb1ba30 + param_3) < 0x40) {
        ppfVar10 = (float **)auStack_108;
        uVar5 = (uint)*(byte *)(lVar7 + 500 + (ulonglong)(uint)(int)(_DAT_7ff70cb1ba30 + param_3));
      }
      else {
        fVar20 = *(float *)(lVar7 + 0x2c);
        if (param_3 <= *(float *)(lVar7 + 0x2c)) {
          fVar20 = param_3;
        }
        pfStack_118 = (float *)0x7ff70c7bb47b;
        pfStack_110 = param_2;
        fVar20 = (float)func_0x7ff70d928ac2(_DAT_7ff70cb1ba2c - fVar20 / param_3);
        auVar21 = roundss(ZEXT816(0),ZEXT416((uint)(_DAT_7ff70cb1ba20 / fVar20)),10);
        uVar5 = ((int)auVar21._0_4_ - ((int)auVar21._0_4_ + 1 >> 0x1f)) + 1U & 0xfffffffe;
        uVar11 = 4;
        if (4 < (int)uVar5) {
          uVar11 = uVar5;
        }
        ppfVar10 = &pfStack_110;
        uVar5 = 0x200;
        if ((int)uVar11 < 0x200) {
          ppfVar10 = &pfStack_110;
          uVar5 = uVar11;
        }
      }
      iVar12 = (int)(_DAT_7ff70cb1ba98 / fVar26);
      auVar21 = roundss(ZEXT816(0),ZEXT416((uint)(((float)(int)uVar5 * fVar26) / _DAT_7ff70cb1ba98))
                        ,10);
      if (iVar12 < (int)auVar21._0_4_) {
        iVar12 = (int)auVar21._0_4_;
      }
      iVar9 = *(int *)(param_1 + 0x50) + iVar12 + 1;
      if (*(int *)(param_1 + 0x54) < iVar9) {
        *(undefined8 *)((longlong)ppfVar10 + -8) = 0x7ff70c7bb50e;
        uVar8 = FUN_7ff70c802100((longlong)iVar9 << 3);
        lVar7 = *(longlong *)(param_1 + 0x58);
        if (lVar7 != 0) {
          iVar4 = *(int *)(param_1 + 0x50);
          *(undefined8 *)((longlong)ppfVar10 + -8) = 0x7ff70c7bb52a;
          FUN_7ff70cb12b60(uVar8,lVar7,(longlong)iVar4 << 3);
          uVar2 = *(undefined8 *)(param_1 + 0x58);
          *(undefined8 *)((longlong)ppfVar10 + -8) = 0x7ff70c7bb533;
          FUN_7ff70c802510(uVar2);
        }
        *(undefined8 *)(param_1 + 0x58) = uVar8;
        *(int *)(param_1 + 0x54) = iVar9;
      }
      if (-1 < iVar12) {
        *(undefined8 *)((longlong)ppfVar10 + -8) = 0;
        *(undefined **)((longlong)ppfVar10 + -0x10) = &UNK_7ff70c7bb553;
        func_0x7ff70d89ae2d();
                    /* WARNING: Bad instruction - Truncating control flow here */
        halt_baddata();
      }
      goto LAB_7ff70c7bb378;
    }
    auVar21._8_4_ = in_XMM3_Dc;
    auVar21._0_8_ = param_4;
    auVar21._12_4_ = in_XMM3_Dd;
    auVar25._4_12_ = auVar21._4_12_;
    auVar25._0_4_ = (fVar26 * _DAT_7ff70cb1ba24) / _DAT_7ff70cb1ba98;
    fVar20 = (_DAT_7ff70cb1ba24 * param_5) / _DAT_7ff70cb1ba98;
    if (fVar26 <= param_5) {
      auVar21 = roundss(auVar25,auVar25,10);
      auVar21 = insertps(ZEXT416((uint)(float)(int)((int)fVar20 -
                                                   (uint)((float)(int)fVar20 != fVar20 &&
                                                         fVar20 < 0.0))),auVar21,0x10);
      iVar12 = (int)auVar21._0_4_;
      iStack_d4 = (int)auVar21._4_4_;
      fVar26 = auVar21._8_4_;
      fVar20 = auVar21._12_4_;
      iVar9 = iVar12 - iStack_d4;
    }
    else {
      auVar21 = roundss(ZEXT416((uint)fVar20),ZEXT416((uint)fVar20),10);
      auVar21 = insertps(auVar21,ZEXT416((uint)(float)(int)((int)auVar25._0_4_ -
                                                           (uint)((float)(int)auVar25._0_4_ !=
                                                                  auVar25._0_4_ &&
                                                                 auVar25._0_4_ < 0.0))),0x10);
      iVar12 = (int)auVar21._0_4_;
      iStack_d4 = (int)auVar21._4_4_;
      fVar26 = auVar21._8_4_;
      fVar20 = auVar21._12_4_;
      iVar9 = iStack_d4 - iVar12;
    }
    iVar4 = 0;
    if (0 < iVar9) {
      iVar4 = iVar9;
    }
    auVar22._0_4_ = (float)iVar12 * _DAT_7ff70cb1baa0 + (float)iVar12 * _DAT_7ff70cb1baa0;
    auVar22._4_4_ = (float)iStack_d4 * _UNK_7ff70cb1baa4 + (float)iStack_d4 * _UNK_7ff70cb1baa4;
    auVar22._8_4_ = (float)(int)fVar26 * _UNK_7ff70cb1baa8 + (float)(int)fVar26 * _UNK_7ff70cb1baa8;
    auVar22._12_4_ = (float)(int)fVar20 * _UNK_7ff70cb1baac + (float)(int)fVar20 * _UNK_7ff70cb1baac
    ;
    auVar21 = divps(auVar22,_DAT_7ff70cb1bab0);
    auVar3._8_4_ = in_XMM3_Dc;
    auVar3._0_8_ = param_4;
    auVar3._12_4_ = in_XMM3_Dd;
    auVar25 = insertps(ZEXT416((uint)param_5),auVar3,0x10);
    iVar16 = -(uint)(_DAT_7ff70cb1bad0 <=
                    (float)((uint)(auVar25._0_4_ + auVar21._0_4_) & _DAT_7ff70cb1bac0));
    iVar17 = -(uint)(_UNK_7ff70cb1bad4 <=
                    (float)((uint)(auVar25._4_4_ + auVar21._4_4_) & _UNK_7ff70cb1bac4));
    auVar24._4_4_ = iVar17;
    auVar24._0_4_ = iVar16;
    auVar24._8_4_ = iVar17;
    auVar24._12_4_ = iVar17;
    auVar23._8_8_ = auVar24._8_8_;
    auVar23._4_4_ = iVar16;
    auVar23._0_4_ = iVar16;
    uVar11 = movmskpd((int)unaff_R12,auVar23);
    iVar4 = (uint)(byte)((byte)uVar11 >> 1) + (uVar11 & 1) + iVar4 + *(int *)(param_1 + 0x50) + 1;
    if (*(int *)(param_1 + 0x54) < iVar4) {
      pfStack_110 = (float *)0x7ff70c7bb6fe;
      uVar8 = FUN_7ff70c802100((longlong)iVar4 << 3);
      if (*(longlong *)(param_1 + 0x58) != 0) {
        pfStack_110 = (float *)0x7ff70c7bb71a;
        FUN_7ff70cb12b60(uVar8,*(longlong *)(param_1 + 0x58),(longlong)*(int *)(param_1 + 0x50) << 3
                        );
        pfStack_110 = (float *)0x7ff70c7bb723;
        FUN_7ff70c802510(*(undefined8 *)(param_1 + 0x58));
      }
      *(undefined8 *)(param_1 + 0x58) = uVar8;
      *(int *)(param_1 + 0x54) = iVar4;
    }
    if ((byte)((byte)uVar11 >> 1) != 0) {
      fVar26 = param_2[1];
      pfStack_110 = (float *)0x7ff70c7bb7cc;
      fVar18 = (float)func_0x7ff70d86a1f5();
      fVar20 = *param_2;
      pfStack_110 = (float *)0x7ff70c7bb7ea;
      fVar19 = (float)(*(code *)CONCAT44(_UNK_7ff70cb965cc,_DAT_7ff70cb965c8))();
      iVar4 = *(int *)(param_1 + 0x50);
      if (iVar4 == *(int *)(param_1 + 0x54)) {
        if (iVar4 == 0) {
          iVar16 = 8;
        }
        else {
          iVar16 = iVar4 / 2 + iVar4;
        }
        iVar17 = iVar4 + 1;
        if (iVar4 + 1 < iVar16) {
          iVar17 = iVar16;
        }
        pfStack_110 = (float *)0x7ff70c7bb894;
        lVar7 = FUN_7ff70c802100((longlong)iVar17 << 3);
        if (*(longlong *)(param_1 + 0x58) != 0) {
          pfStack_110 = (float *)0x7ff70c7bb8b0;
          FUN_7ff70cb12b60(lVar7,*(longlong *)(param_1 + 0x58),
                           (longlong)*(int *)(param_1 + 0x50) << 3);
          pfStack_110 = (float *)0x7ff70c7bb8b9;
          FUN_7ff70c802510(*(undefined8 *)(param_1 + 0x58));
        }
        *(longlong *)(param_1 + 0x58) = lVar7;
        *(int *)(param_1 + 0x54) = iVar17;
        iVar4 = *(int *)(param_1 + 0x50);
      }
      else {
        lVar7 = *(longlong *)(param_1 + 0x58);
      }
      *(float *)(lVar7 + (longlong)iVar4 * 8) = fVar19 * param_3 + fVar20;
      *(float *)(lVar7 + 4 + (longlong)iVar4 * 8) = fVar18 * param_3 + fVar26;
      *(int *)(param_1 + 0x50) = *(int *)(param_1 + 0x50) + 1;
    }
    if (0 < iVar9) {
      uStack_e0 = 0;
      pfStack_110 = (float *)0x7ff70c7bb757;
      iStack_e8 = iVar12;
      FUN_7ff70c7ba8a0(param_1,param_2,param_3,iStack_d4);
    }
    if ((uVar11 & 1) == 0) goto LAB_7ff70c7bb378;
    fVar26 = param_2[1];
    pfStack_110 = (float *)0x7ff70c7bb76f;
    fVar18 = (float)func_0x7ff70d72a5d4();
    fVar20 = *param_2;
    pfStack_110 = (float *)0x7ff70c7bb78c;
    fVar19 = (float)(*(code *)CONCAT44(_UNK_7ff70cb965cc,_DAT_7ff70cb965c8))();
    iVar12 = *(int *)(param_1 + 0x50);
    if (iVar12 == *(int *)(param_1 + 0x54)) {
      if (iVar12 == 0) {
        iVar9 = 8;
      }
      else {
        iVar9 = iVar12 / 2 + iVar12;
      }
      iVar4 = iVar12 + 1;
      if (iVar12 + 1 < iVar9) {
        iVar4 = iVar9;
      }
      pfStack_110 = (float *)0x7ff70c7bb83a;
      lVar7 = FUN_7ff70c802100((longlong)iVar4 << 3);
      if (*(longlong *)(param_1 + 0x58) != 0) {
        pfStack_110 = (float *)0x7ff70c7bb856;
        FUN_7ff70cb12b60(lVar7,*(longlong *)(param_1 + 0x58),(longlong)*(int *)(param_1 + 0x50) << 3
                        );
        pfStack_110 = (float *)0x7ff70c7bb85f;
        FUN_7ff70c802510(*(undefined8 *)(param_1 + 0x58));
      }
      *(longlong *)(param_1 + 0x58) = lVar7;
      *(int *)(param_1 + 0x54) = iVar4;
      iVar12 = *(int *)(param_1 + 0x50);
    }
    else {
      lVar7 = *(longlong *)(param_1 + 0x58);
    }
    *(float *)(lVar7 + (longlong)iVar12 * 8) = fVar19 * param_3 + fVar20;
    *(float *)(lVar7 + 4 + (longlong)iVar12 * 8) = fVar18 * param_3 + fVar26;
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
      iVar4 = iVar12 + 1;
      if (iVar12 + 1 < iVar9) {
        iVar4 = iVar9;
      }
      pfStack_110 = (float *)0x7ff70c7bb33d;
      lVar7 = FUN_7ff70c802100((longlong)iVar4 << 3);
      if (*(longlong *)(param_1 + 0x58) != 0) {
        pfStack_110 = (float *)0x7ff70c7bb359;
        FUN_7ff70cb12b60(lVar7,*(longlong *)(param_1 + 0x58),(longlong)*(int *)(param_1 + 0x50) << 3
                        );
        pfStack_110 = (float *)0x7ff70c7bb362;
        FUN_7ff70c802510(*(undefined8 *)(param_1 + 0x58));
      }
      *(longlong *)(param_1 + 0x58) = lVar7;
      *(int *)(param_1 + 0x54) = iVar4;
      iVar12 = *(int *)(param_1 + 0x50);
    }
    else {
      lVar7 = *(longlong *)(param_1 + 0x58);
    }
    *(undefined8 *)(lVar7 + (longlong)iVar12 * 8) = *(undefined8 *)param_2;
  }
  *(int *)(param_1 + 0x50) = *(int *)(param_1 + 0x50) + 1;
  ppfVar10 = (float **)auStack_108;
LAB_7ff70c7bb378:
  if (_DAT_7ff70cbebd80 != (*(ulonglong *)((longlong)ppfVar10 + 0x38) ^ (ulonglong)ppfVar10)) {
    *(undefined8 *)((longlong)ppfVar10 + -8) = 0x7ff70c7bb8f1;
    FUN_7ff70caa97e0(*(ulonglong *)((longlong)ppfVar10 + 0x38) ^ (ulonglong)ppfVar10);
    pcVar13 = (code *)swi(3);
    (*pcVar13)();
    return;
  }
  return;
}


