/* 7ff70c87f8e0 FUN_7ff70c87f8e0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulonglong FUN_7ff70c87f8e0(undefined8 param_1,byte param_2,uint param_3,float *param_4)

{
  undefined4 uVar1;
  undefined8 uVar2;
  longlong lVar4;
  longlong lVar5;
  longlong lVar6;
  longlong lVar7;
  code *pcVar8;
  longlong lVar9;
  longlong lVar10;
  char cVar11;
  uint uVar12;
  uint uVar13;
  undefined4 uVar14;
  float *pfVar15;
  ulonglong uVar16;
  uint uVar17;
  int iVar18;
  undefined7 uVar19;
  ulonglong uVar20;
  uint uVar21;
  uint uVar22;
  bool bVar23;
  undefined1 auVar24 [16];
  float fVar25;
  float fVar26;
  undefined1 auVar27 [16];
  undefined1 auVar28 [16];
  undefined1 auVar29 [16];
  float fVar30;
  float fVar31;
  float fVar32;
  undefined1 auStack_128 [32];
  float *pfStack_108;
  longlong lStack_100;
  undefined8 *puStack_f8;
  undefined4 uStack_f0;
  undefined4 uStack_ec;
  byte *pbStack_e8;
  undefined8 uStack_e0;
  float fStack_d8;
  float fStack_d4;
  float fStack_d0;
  float fStack_cc;
  char cStack_bb;
  byte bStack_ba;
  byte bStack_b9;
  undefined8 uStack_b8;
  undefined8 uStack_b0;
  undefined8 uStack_a0;
  undefined8 uStack_98;
  float fStack_90;
  undefined4 uStack_8c;
  byte bStack_81;
  ulonglong uStack_80;
  undefined8 uVar3;
  
  lVar9 = _DAT_7ff70cc1a3c0;
  uStack_80 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_128;
  *(undefined1 *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440) + 0xce) = 1;
  lVar4 = *(longlong *)(lVar9 + 0x1440);
  bStack_81 = param_2;
  if (*(char *)(lVar4 + 0xd1) != '\0') {
LAB_7ff70c87f94a:
    param_4 = (float *)0x0;
    goto LAB_7ff70c87f94d;
  }
  uVar12 = FUN_7ff70c8165d0(lVar4,param_1,0);
  uVar20 = (ulonglong)uVar12;
  pfStack_108 = (float *)CONCAT44(pfStack_108._4_4_,0xbf800000);
  FUN_7ff70c80cf40(&fStack_90,param_1,0,1);
  uVar16 = *(ulonglong *)param_4;
  auVar24._8_8_ = 0;
  auVar24._0_8_ = uVar16;
  auVar28._4_4_ = -(uint)((float)(uVar16 >> 0x20) != 0.0);
  auVar28._0_4_ = -(uint)((float)uVar16 != 0.0);
  auVar28._8_8_ = 0;
  auVar27._4_4_ = uStack_8c;
  auVar27._0_4_ = fStack_90;
  auVar27._8_8_ = 0;
  auVar28 = blendvps(auVar27,auVar24,auVar28);
  uStack_98 = auVar28._0_8_;
  uStack_e0 = *(undefined8 *)(lVar4 + 0x118);
  fVar32 = (float)((ulonglong)uStack_e0 >> 0x20) + *(float *)(lVar4 + 0x150);
  uStack_a0 = CONCAT44(fVar32,(float)uStack_e0);
  FUN_7ff70c8375f0(&uStack_98);
  pfVar15 = (float *)&uStack_a0;
  if ((param_3 & 2) != 0) {
    pfVar15 = (float *)(lVar4 + 0x250);
  }
  fVar30 = *pfVar15;
  if (((param_3 & 0x1000000) == 0) && ((*param_4 != 0.0 || (NAN(*param_4))))) {
    auVar28 = ZEXT416((uint)(float)uStack_98);
  }
  else {
    pfVar15 = (float *)(lVar4 + 600);
    if ((param_3 & 2) == 0) {
      pfVar15 = (float *)(lVar4 + 0x248);
    }
    auVar28 = blendvps(ZEXT416((uint)(*pfVar15 - fVar30)),ZEXT416((uint)fStack_90),
                       ZEXT416(-(uint)(*pfVar15 - fVar30 <= fStack_90)));
    uStack_98 = CONCAT44(uStack_98._4_4_,auVar28._0_4_);
  }
  auVar24 = insertps(ZEXT416((uint)fVar30),ZEXT416((uint)fVar32),0x10);
  auVar28 = insertps(auVar28,uStack_98._4_4_,0x10);
  fVar25 = auVar28._0_4_ + auVar24._0_4_;
  fVar26 = auVar28._4_4_ + auVar24._4_4_;
  uStack_b0 = CONCAT44(fVar26,fVar25);
  uStack_b8 = CONCAT44(fVar32,fVar30);
  if ((param_3 & 0x4000000) == 0) {
    uVar16 = 0;
    if ((param_3 & 2) == 0) {
      uVar16 = (ulonglong)*(uint *)(lVar9 + 0xc9c);
    }
    auVar29._8_8_ = 0;
    auVar29._0_8_ = uVar16;
    auVar28 = insertps(auVar29,*(undefined4 *)(lVar9 + 0xca0),0x10);
    fVar30 = (float)(int)(_DAT_7ff70cb1ba80 * auVar28._0_4_);
    fVar31 = (float)(int)(_UNK_7ff70cb1ba84 * auVar28._4_4_);
    uStack_b8 = CONCAT44(auVar24._4_4_ - fVar31,auVar24._0_4_ - fVar30);
    uStack_b0 = CONCAT44(fVar26 + (auVar28._4_4_ - fVar31),fVar25 + (auVar28._0_4_ - fVar30));
  }
  uVar21 = param_3 & 8;
  uVar16 = uVar20;
  if ((param_3 & 2) == 0) {
    cVar11 = FUN_7ff70c837800(&uStack_b8,uVar20,0,uVar21 << 7);
  }
  else {
    uVar14 = *(undefined4 *)(lVar4 + 0x260);
    uVar1 = *(undefined4 *)(lVar4 + 0x268);
    *(undefined4 *)(lVar4 + 0x260) = *(undefined4 *)(lVar4 + 0x250);
    *(undefined4 *)(lVar4 + 0x268) = *(undefined4 *)(lVar4 + 600);
    cVar11 = FUN_7ff70c837800(&uStack_b8,uVar20,0,uVar21 << 7);
    *(undefined4 *)(lVar4 + 0x260) = uVar14;
    *(undefined4 *)(lVar4 + 0x268) = uVar1;
  }
  bVar23 = (*(byte *)(lVar9 + 0x1e26) & 0x40) == 0;
  pbStack_e8 = (byte *)(lVar9 + 0x1e24);
  uVar19 = (undefined7)((ulonglong)pbStack_e8 >> 8);
  uStack_ec = (undefined4)CONCAT71(uVar19,1);
  uVar14 = (int)CONCAT71((int7)(uVar16 >> 8),bVar23);
  if (cVar11 == '\0') {
    if ((((bVar23) || (*(char *)(lVar9 + 0x2360) != '\x01')) ||
        (*(float *)(lVar9 + 0x2370) <= uStack_b8._4_4_)) ||
       ((uStack_b0._4_4_ < *(float *)(lVar9 + 0x2368) ||
         uStack_b0._4_4_ == *(float *)(lVar9 + 0x2368) ||
        (*(float *)(lVar9 + 0x236c) <= (float)uStack_b8)))) goto LAB_7ff70c87f94a;
    uStack_ec = 0;
    param_4 = (float *)0x0;
    uVar14 = 0;
    if ((float)uStack_b0 < *(float *)(lVar9 + 0x2364) ||
        (float)uStack_b0 == *(float *)(lVar9 + 0x2364)) goto LAB_7ff70c87f94d;
  }
  uStack_f0 = uVar14;
  uVar22 = *(uint *)(lVar9 + 0x1de0) >> 10;
  if ((uVar22 & 1) == 0 && uVar21 != 0) {
    FUN_7ff70c83c640(CONCAT71(uVar19,1));
  }
  if ((param_3 & 2) != 0) {
    if (*(longlong *)(lVar9 + 0x2278) == 0) {
      if (*(longlong *)(lVar4 + 0x1c8) != 0) {
        FUN_7ff70c911b30();
      }
    }
    else {
      FUN_7ff70c90c3a0();
    }
    *(byte *)(lVar9 + 0x1e29) = *(byte *)(lVar9 + 0x1e29) | 2;
    uVar2 = *(undefined8 *)(lVar4 + 0x268);
    *(undefined8 *)(lVar9 + 0x1e5c) = *(undefined8 *)(lVar4 + 0x260);
    *(undefined8 *)(lVar9 + 0x1e64) = uVar2;
  }
  lVar10 = _DAT_7ff70cc1a3c0;
  uVar17 = param_3 >> 0x10 & 0x80;
  uVar13 = uVar17 + 0x120;
  if ((param_3 & 4) == 0) {
    uVar13 = uVar17;
  }
  uVar13 = uVar13 + (param_3 >> 0x12 & 0x10 | param_3 >> 7 & 0x100000 | param_3 >> 3 & 0x20000);
  if (((param_3 & 0x10) != 0) || ((pbStack_e8[1] & 0x40) != 0)) {
    uVar13 = uVar13 | 0x1000;
  }
  uVar19 = (undefined7)((ulonglong)param_4 >> 8);
  if ((char)uStack_f0 == '\0') {
    lVar5 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x2398);
    if (*(char *)(lVar5 + 0x5a) == '\x01') {
      bStack_81 = *(char *)(lVar5 + 0x58) == '\x01';
      if (*(char *)(lVar5 + 0x58) == -1) {
        bStack_81 = param_2;
      }
      if (*(char *)(lVar5 + 0x5b) == '\x01') {
        lVar6 = *(longlong *)(lVar5 + 0x28);
        lVar7 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1df8);
        if ((*(char *)(lVar5 + 0x5e) == '\0') && (*(uint *)(_DAT_7ff70cc1a3c0 + 0x2154) == uVar12))
        {
          *(undefined1 *)(lVar5 + 0x5e) = 1;
          if (*(longlong *)(lVar6 + 0x18) == -1) {
            *(longlong *)(lVar6 + 0x18) = lVar7;
            *(byte *)(lVar6 + 0x14) = bStack_81;
          }
        }
        else if ((*(longlong *)(lVar6 + 0x18) != lVar7) &&
                (*(char *)(lVar5 + 0x5d) == *(char *)(lVar5 + 0x5e))) {
          if ((*(byte *)(lVar5 + 0x55) & 0x10) == 0) {
            bStack_81 = *(byte *)(lVar5 + 0x34) >> 4 & bStack_81;
          }
          goto LAB_7ff70c87fdfe;
        }
        bStack_81 = *(char *)(lVar6 + 0x14) != '\0';
      }
LAB_7ff70c87fdfe:
      if (bStack_81 == 0) goto LAB_7ff70c87fe1c;
LAB_7ff70c87fe0b:
      if ((*(uint *)(lVar10 + 0x14b4) == uVar12) && (*(char *)(lVar10 + 0x14c3) == '\x01'))
      goto LAB_7ff70c87fe1c;
LAB_7ff70c87fe2e:
      uVar13 = uVar13 | 0x80020;
    }
    else {
      if (param_2 != 0) goto LAB_7ff70c87fe0b;
LAB_7ff70c87fe1c:
      if ((*(byte *)(lVar5 + 0x35) & 0x40) != 0) goto LAB_7ff70c87fe2e;
      uVar13 = uVar13 & 0x17ffcf | 0x80010;
    }
    pfStack_108 = (float *)CONCAT44(pfStack_108._4_4_,uVar13);
    cStack_bb = FUN_7ff70c8782e0(&uStack_b8,uVar20,&bStack_b9,&bStack_ba);
    FUN_7ff70c87b7b0(uVar20,&bStack_81,&cStack_bb);
    param_4 = (float *)CONCAT71(uVar19,1);
    if (cStack_bb != '\0') goto LAB_7ff70c87fe81;
LAB_7ff70c87fe6f:
    param_4 = (float *)0x0;
    if (((param_3 & 0x2000000) != 0) && (bStack_b9 != 0)) goto LAB_7ff70c87fe81;
  }
  else {
    pfStack_108 = (float *)CONCAT44(pfStack_108._4_4_,uVar13);
    cVar11 = FUN_7ff70c8782e0(&uStack_b8,uVar20,&bStack_b9,&bStack_ba);
    if (((((param_3 & 0x200000) == 0) || (*(uint *)(lVar9 + 0x2154) == 0)) ||
        (*(uint *)(lVar9 + 0x2154) != uVar12)) ||
       (*(int *)(lVar9 + 0x2158) != *(int *)(lVar9 + 0x1ddc))) {
      param_4 = (float *)CONCAT71(uVar19,1);
      if (cVar11 == '\0') goto LAB_7ff70c87fe6f;
    }
    else {
      bStack_81 = 1;
      param_4 = (float *)CONCAT71(uVar19,1);
    }
LAB_7ff70c87fe81:
    if (((*(char *)(lVar9 + 0x1f91) == '\0') && (*(longlong *)(lVar9 + 0x1f98) == lVar4)) &&
       (*(int *)(lVar9 + 0x1fa4) == *(int *)(lVar4 + 0x170))) {
      uVar2 = *(undefined8 *)(lVar4 + 0x128);
      uVar3 = *(undefined8 *)(lVar4 + 0x128);
      fStack_d8 = (float)uStack_b8 - (float)uVar2;
      fStack_d4 = uStack_b8._4_4_ - (float)((ulonglong)uVar2 >> 0x20);
      fStack_d0 = (float)uStack_b0 - (float)uVar3;
      fStack_cc = uStack_b0._4_4_ - (float)((ulonglong)uVar3 >> 0x20);
      FUN_7ff70c8544b0(uVar20,*(int *)(lVar9 + 0x1fa4),*(undefined4 *)(lVar9 + 0x1ddc),&fStack_d8);
      if (*(char *)(lVar9 + 0x56) == '\x01') {
        *(undefined1 *)(lVar9 + 0x1f90) = 0;
      }
    }
    if ((char)param_4 == '\0') {
      param_4 = (float *)0x0;
    }
    else {
      FUN_7ff70c818230(uVar20);
      param_4 = (float *)CONCAT71((int7)((ulonglong)param_4 >> 8),1);
    }
  }
  if (bStack_81 != param_2) {
    *(byte *)(lVar9 + 0x1e28) = *(byte *)(lVar9 + 0x1e28) | 8;
  }
  cVar11 = (char)uStack_ec;
  if (cVar11 != '\0') {
    bStack_b9 = (byte)((param_3 & 0x20) >> 5) | bStack_b9;
    if (((bStack_81 | bStack_b9) & 1) != 0) {
      iVar18 = 0x18;
      if (bStack_b9 != 0) {
        iVar18 = bStack_ba + 0x19;
      }
      uVar14 = FUN_7ff70c80a070(iVar18);
      pfStack_108 = (float *)((ulonglong)pfStack_108 & 0xffffffff00000000);
      FUN_7ff70c80db10(uStack_b8,uStack_b0,uVar14,0);
    }
    if (*(uint *)(lVar9 + 0x1f94) == uVar12) {
      FUN_7ff70c80dff0(&uStack_b8,uVar20,(uint)(byte)((byte)uStack_f0 ^ 1) * 4 + 10);
    }
  }
  if ((param_3 & 2) != 0) {
    if (*(longlong *)(lVar9 + 0x2278) == 0) {
      if (*(longlong *)(lVar4 + 0x1c8) != 0) {
        FUN_7ff70c911c00();
      }
    }
    else {
      FUN_7ff70c90c460();
    }
  }
  if (cVar11 != '\0') {
    lStack_100 = lVar9 + 0xd18;
    fStack_d4 = fVar32 + uStack_98._4_4_;
    fStack_d8 = (float)uStack_e0 + (float)uStack_98;
    if (*(float *)(lVar4 + 0x248) <= (float)uStack_e0 + (float)uStack_98) {
      fStack_d8 = *(float *)(lVar4 + 0x248);
    }
    puStack_f8 = &uStack_b8;
    pfStack_108 = &fStack_90;
    FUN_7ff70c80d060(&uStack_a0,&fStack_d8,param_1,0);
  }
  if (((((char)param_4 != '\0') && ((param_3 & 1) == 0)) &&
      ((*(uint *)(lVar4 + 0x14) & 0x4000000) != 0)) && ((*pbStack_e8 & 0x10) != 0)) {
    FUN_7ff70c850380();
  }
  if ((uVar22 & 1) == 0 && uVar21 != 0) {
    FUN_7ff70c83c8a0();
  }
LAB_7ff70c87f94d:
  if (_DAT_7ff70cbebd80 != (uStack_80 ^ (ulonglong)auStack_128)) {
    FUN_7ff70caa97e0(uStack_80 ^ (ulonglong)auStack_128);
    pcVar8 = (code *)swi(3);
    uVar16 = (*pcVar8)();
    return uVar16;
  }
  return (ulonglong)param_4 & 0xffffffff;
}


