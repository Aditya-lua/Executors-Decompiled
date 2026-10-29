/* 7ff70c87e8c0 FUN_7ff70c87e8c0 */

/* WARNING: Type propagation algorithm not settling */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulonglong FUN_7ff70c87e8c0(undefined8 param_1,longlong param_2,uint param_3)

{
  longlong lVar1;
  undefined8 uVar2;
  code *pcVar3;
  float fVar4;
  char cVar5;
  undefined4 uVar6;
  undefined4 uVar7;
  uint uVar8;
  uint uVar9;
  longlong lVar10;
  ulonglong uVar11;
  undefined4 extraout_XMM0_Dc;
  undefined4 extraout_XMM0_Dc_00;
  undefined4 extraout_XMM0_Dd;
  undefined4 extraout_XMM0_Dd_00;
  undefined1 auVar12 [16];
  float fVar13;
  undefined1 auVar14 [16];
  undefined1 auVar15 [16];
  float fVar16;
  undefined4 uVar17;
  undefined4 uVar18;
  undefined1 auStack_148 [32];
  undefined8 *puStack_128;
  float *pfStack_120;
  undefined8 uStack_118;
  byte bStack_105;
  undefined4 uStack_104;
  undefined4 uStack_100;
  undefined1 uStack_fa;
  byte bStack_f9;
  float fStack_f8;
  float fStack_f4;
  float fStack_f0;
  undefined4 uStack_ec;
  float fStack_e8;
  float fStack_e4;
  float fStack_e0;
  float fStack_dc;
  float fStack_d8;
  float fStack_d4;
  undefined8 uStack_d0;
  undefined1 auStack_c8 [8];
  undefined8 uStack_c0;
  undefined8 uStack_b0;
  undefined8 uStack_a8;
  ulonglong uStack_90;
  
  lVar10 = _DAT_7ff70cc1a3c0;
  uStack_90 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_148;
  *(undefined1 *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440) + 0xce) = 1;
  lVar1 = *(longlong *)(lVar10 + 0x1440);
  uVar7 = *(undefined4 *)(lVar10 + 0x1e70);
  *(undefined4 *)(lVar10 + 0x1e70) = 0;
  if (*(char *)(lVar1 + 0xd1) != '\0') {
LAB_7ff70c87e93f:
    uVar9 = 0;
    goto LAB_7ff70c87f0a5;
  }
  uVar6 = FUN_7ff70c8165d0(lVar1,param_1,0);
  uVar11 = 0;
  uVar17 = 0;
  uVar18 = 0;
  if ((param_3 & 0x20) == 0) {
    uVar11 = FUN_7ff70c84c130();
    uVar17 = extraout_XMM0_Dc;
    uVar18 = extraout_XMM0_Dd;
  }
  fVar16 = (float)uVar11;
  puStack_128 = (undefined8 *)CONCAT44(puStack_128._4_4_,0xbf800000);
  FUN_7ff70c80cf40(&fStack_d8,param_1,0,1);
  fVar13 = 0.0;
  if (param_2 != 0 && (char)param_3 < '\0') {
    puStack_128 = (undefined8 *)CONCAT44(puStack_128._4_4_,0xbf800000);
    FUN_7ff70c80cf40(&uStack_a8,param_2,0,1);
    fVar13 = (float)uStack_a8;
  }
  if ((param_3 & 0x40) == 0) {
    if ((char)param_3 < '\0') {
      uVar17 = 0;
      uVar18 = 0;
      uVar11 = (ulonglong)
               (uint)(*(float *)(lVar10 + 0xc8c) + *(float *)(lVar10 + 0xc8c) + fVar13 + fVar16);
    }
    else {
      uVar11 = FUN_7ff70c84bfb0();
      uVar17 = extraout_XMM0_Dc_00;
      uVar18 = extraout_XMM0_Dd_00;
    }
  }
  fStack_f8 = *(float *)(lVar1 + 0x118);
  fStack_f4 = *(float *)(lVar1 + 0x11c);
  auVar12._8_4_ = uVar17;
  auVar12._0_8_ = uVar11;
  auVar12._12_4_ = uVar18;
  auVar12 = insertps(auVar12,ZEXT416((uint)(*(float *)(lVar10 + 0xc90) + *(float *)(lVar10 + 0xc90)
                                           + fStack_d4)),0x10);
  fStack_e0 = auVar12._0_4_ + fStack_f8;
  fStack_dc = auVar12._4_4_ + fStack_f4;
  fVar13 = 0.0;
  if (0.0 < fStack_d8) {
    fVar13 = fStack_d8 + *(float *)(lVar10 + 0xca4);
  }
  auVar14 = blendps(ZEXT816(0),ZEXT416((uint)fVar13),1);
  auVar15._0_4_ = auVar14._0_4_ + fStack_e0;
  auVar15._4_4_ = auVar14._4_4_ + fStack_dc;
  auVar15._8_4_ = auVar14._8_4_ + auVar12._8_4_ + 0.0;
  auVar15._12_4_ = auVar14._12_4_ + auVar12._12_4_ + 0.0;
  uVar2 = extractps(auVar15,1);
  uStack_ec = (undefined4)uVar2;
  fStack_e8 = (float)((ulonglong)uVar2 >> 0x20);
  uStack_a8 = CONCAT44(auVar15._4_4_ - fStack_f4,auVar15._0_4_ - fStack_f8);
  fStack_f0 = auVar15._0_4_;
  fStack_e4 = fStack_f4;
  FUN_7ff70c8375f0(&uStack_a8);
  uVar9 = 0;
  cVar5 = FUN_7ff70c837800(&fStack_f8,uVar6,&fStack_e8,0);
  if (cVar5 == '\0') goto LAB_7ff70c87f0a5;
  puStack_128 = (undefined8 *)((ulonglong)puStack_128 & 0xffffffff00000000);
  uStack_104 = uVar7;
  cVar5 = FUN_7ff70c8782e0(&fStack_e8,uVar6,&bStack_f9,&uStack_fa);
  uVar7 = FUN_7ff70c802f50(&UNK_7ff70cb83d11,0,uVar6);
  bStack_105 = FUN_7ff70c81b700(uVar7,0);
  if ((bStack_105 == 0) && (cVar5 != '\0')) {
    FUN_7ff70c84eb40(uVar7,0);
    bStack_105 = 1;
  }
  uStack_100 = uVar7;
  uVar7 = FUN_7ff70c80a070(bStack_f9 + 7);
  fVar4 = fStack_e0;
  fVar13 = fStack_e8;
  FUN_7ff70c80dff0(&fStack_e8,uVar6,0);
  auVar12 = blendvps(ZEXT416((uint)(fVar4 - fVar16)),ZEXT416((uint)fVar13),
                     ZEXT416(-(uint)(fVar4 - fVar16 <= fVar13)));
  fVar13 = auVar12._0_4_;
  if ((param_3 & 0x40) == 0) {
    uVar17 = 0xf0;
    if ((param_3 & 0x20) == 0) {
      uVar17 = 0x50;
    }
    uStack_a8 = CONCAT44(fStack_dc,fVar13);
    pfStack_120 = (float *)CONCAT44(pfStack_120._4_4_,uVar17);
    puStack_128 = (undefined8 *)CONCAT44(puStack_128._4_4_,*(undefined4 *)(lVar10 + 0xc94));
    FUN_7ff70c7bd960(*(undefined8 *)(lVar1 + 0x2c8),&fStack_e8,&uStack_a8,uVar7);
  }
  if ((param_3 & 0x20) == 0) {
    uVar17 = FUN_7ff70c80a070((bStack_f9 | bStack_105) + 0x15);
    uVar18 = FUN_7ff70c80a070(0);
    uVar7 = 0xa0;
    if ((float)uVar11 <= fVar16) {
      uVar7 = 0xf0;
    }
    uStack_a8 = CONCAT44(fStack_e4,fVar13);
    pfStack_120 = (float *)CONCAT44(pfStack_120._4_4_,uVar7);
    puStack_128 = (undefined8 *)CONCAT44(puStack_128._4_4_,*(undefined4 *)(lVar10 + 0xc94));
    FUN_7ff70c7bd960(*(undefined8 *)(lVar1 + 0x2c8),&uStack_a8,&fStack_e0,uVar17);
    if ((fVar16 + fVar13) - *(float *)(lVar10 + 0xc8c) <= fStack_e0) {
      puStack_128 = (undefined8 *)CONCAT44(puStack_128._4_4_,0x3f800000);
      FUN_7ff70c7fa600(*(undefined8 *)(lVar1 + 0x2c8),
                       CONCAT44(fStack_e4 + *(float *)(lVar10 + 0xc90),
                                *(float *)(lVar10 + 0xc90) + fVar13),uVar18,3);
    }
  }
  FUN_7ff70c80dda0(CONCAT44(fStack_e4,fStack_e8),CONCAT44(fStack_dc,fStack_e0));
  uVar7 = uStack_104;
  if ((param_3 & 0x100000) == 0) {
    if (param_2 != 0 && (char)((param_3 & 0x40) >> 6) == '\0') {
      if (*(char *)(lVar10 + 0x2720) == '\x01') {
        FUN_7ff70c8574b0(&UNK_7ff70cb7fb98,&UNK_7ff70cb7fb4b);
      }
      uStack_a8 = 0;
      uStack_c0 = CONCAT44(fStack_dc,fVar13);
      uStack_b0 = CONCAT44((float)((ulonglong)*(undefined8 *)(lVar10 + 0xc8c) >> 0x20) + fStack_e4,
                           (float)*(undefined8 *)(lVar10 + 0xc8c) + fStack_e8);
      pfStack_120 = (float *)&uStack_a8;
      uStack_118 = 0;
      puStack_128 = (undefined8 *)0x0;
      FUN_7ff70c80d060(&uStack_b0,&uStack_c0,param_2,0);
    }
  }
  else {
    *(ulonglong *)(lVar10 + 0x2540) = CONCAT44(fStack_e4,fStack_e8);
    *(float *)(lVar10 + 0x2548) = fVar13;
    *(float *)(lVar10 + 0x254c) = fStack_dc;
  }
  if (0.0 < fStack_d8) {
    FUN_7ff70c80c6b0(CONCAT44(fStack_e4 + *(float *)(lVar10 + 0xc90),
                              fStack_e0 + *(float *)(lVar10 + 0xca4)),param_1,0,1);
  }
  if (bStack_105 == 0) goto LAB_7ff70c87e93f;
  *(undefined4 *)(lVar10 + 0x1e70) = uVar7;
  lVar1 = _DAT_7ff70cc1a3c0;
  cVar5 = FUN_7ff70c81b700(uStack_100,0);
  if (cVar5 == '\0') {
    *(undefined4 *)(lVar1 + 0x1e70) = 0;
    uVar9 = 0;
    goto LAB_7ff70c87f0a5;
  }
  fVar13 = fStack_e0 - fStack_e8;
  if ((*(uint *)(lVar1 + 0x1e70) & 0x10) == 0) {
    uVar9 = param_3 | 4;
    if ((param_3 & 0x1e) != 0) {
      uVar9 = param_3;
    }
    uVar8 = 8;
    if (((uVar9 & 4) == 0) && (uVar8 = 4, (uVar9 & 2) == 0)) {
      uVar8 = -(uint)((uVar9 & 8) == 0) | 0x14;
    }
    uStack_a8 = 0;
    uStack_c0 = _DAT_7ff70cb1d4f0;
    if ((*(uint *)(lVar1 + 0x1e70) & 2) == 0) {
      uStack_a8 = (ulonglong)(uint)fVar13;
LAB_7ff70c87ef18:
      fVar13 = _DAT_7ff70cb1c5d8;
      if (0 < (int)uVar8) {
        fVar13 = *(float *)(_DAT_7ff70cc1a3c0 + 0xc58) + *(float *)(_DAT_7ff70cc1a3c0 + 0xc58) +
                 ((float)(int)uVar8 *
                  (*(float *)(_DAT_7ff70cc1a3c0 + 0x1130) + *(float *)(_DAT_7ff70cc1a3c0 + 0xca0)) -
                 *(float *)(_DAT_7ff70cc1a3c0 + 0xca0));
      }
      uStack_c0 = CONCAT44(fVar13,(int)_DAT_7ff70cb1d4f0);
    }
    else {
      if (*(float *)(lVar1 + 0x1e90) <= 0.0) {
        uStack_a8 = (ulonglong)(uint)fVar13;
      }
      if (*(float *)(lVar1 + 0x1e94) <= 0.0) goto LAB_7ff70c87ef18;
    }
    FUN_7ff70c83da20(&uStack_a8,&uStack_c0,0,0);
    param_3 = uVar9;
  }
  else {
    auVar12 = blendvps(ZEXT416((uint)fVar13),ZEXT416((uint)*(float *)(lVar1 + 0x1eb4)),
                       ZEXT416(-(uint)(fVar13 <= *(float *)(lVar1 + 0x1eb4))));
    *(int *)(lVar1 + 0x1eb4) = auVar12._0_4_;
  }
  FUN_7ff70c802a20(&uStack_a8,0x10,&UNK_7ff70cb88978,*(undefined4 *)(lVar1 + 0x2514));
  lVar10 = FUN_7ff70c8388f0(&uStack_a8);
  if ((lVar10 != 0) && (*(char *)(lVar10 + 0xcd) == '\x01')) {
    FUN_7ff70c8389e0(&uStack_b0,lVar10);
    *(uint *)(lVar10 + 0xe8) = (uint)((param_3 & 1) == 0) * 3;
    FUN_7ff70c853de0(&uStack_c0,lVar10);
    uStack_d0 = CONCAT44(fStack_dc,fStack_e8);
    pfStack_120 = &fStack_e8;
    uStack_118 = CONCAT44(uStack_118._4_4_,1);
    puStack_128 = &uStack_c0;
    FUN_7ff70c853660(auStack_c8,&uStack_d0,&uStack_b0,lVar10 + 0xe8);
    uStack_d0 = 0;
    FUN_7ff70c83d9b0(auStack_c8,0,&uStack_d0);
  }
  FUN_7ff70c80bcf0(2);
  uVar9 = FUN_7ff70c826d00(&uStack_a8,0,0x4000147);
  FUN_7ff70c80c4c0(1);
  if ((char)uVar9 == '\0') {
    FUN_7ff70c850910();
  }
  else {
    *(int *)(lVar1 + 0x2514) = *(int *)(lVar1 + 0x2514) + 1;
  }
LAB_7ff70c87f0a5:
  if (_DAT_7ff70cbebd80 == (uStack_90 ^ (ulonglong)auStack_148)) {
    return (ulonglong)uVar9;
  }
  FUN_7ff70caa97e0(uStack_90 ^ (ulonglong)auStack_148);
  pcVar3 = (code *)swi(3);
  uVar11 = (*pcVar3)();
  return uVar11;
}


