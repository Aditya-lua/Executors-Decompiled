/* 7ff70c80d450 FUN_7ff70c80d450 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c80d450(longlong param_1,float *param_2,float *param_3,undefined8 param_4,
                     char *param_5,char *param_6,ulonglong *param_7)

{
  uint uVar1;
  float fVar2;
  char cVar3;
  longlong lVar4;
  code *pcVar5;
  undefined8 uVar6;
  ulonglong uVar7;
  undefined1 auVar8 [16];
  undefined1 auVar9 [16];
  undefined1 auVar10 [16];
  undefined1 auVar11 [16];
  undefined1 auVar12 [16];
  undefined1 auVar13 [16];
  undefined1 auVar14 [16];
  undefined1 auVar15 [16];
  undefined1 auVar16 [16];
  undefined1 auVar17 [16];
  undefined1 auVar18 [16];
  undefined1 auVar19 [16];
  undefined1 auVar20 [16];
  undefined1 auVar21 [16];
  undefined1 auVar22 [16];
  undefined1 auVar23 [16];
  undefined1 auVar24 [16];
  undefined1 auVar25 [16];
  undefined1 auVar26 [16];
  undefined1 auVar27 [16];
  undefined1 auVar28 [16];
  undefined1 auVar29 [16];
  undefined1 auVar30 [16];
  undefined1 auVar31 [16];
  undefined1 auVar32 [16];
  undefined1 auVar33 [16];
  undefined1 auVar34 [16];
  undefined1 auVar35 [16];
  undefined4 in_XMM3_Dc;
  undefined4 in_XMM3_Dd;
  float fVar36;
  undefined1 auStack_f8 [32];
  uint uStack_d8;
  char *pcStack_d0;
  char *pcStack_c8;
  char **ppcStack_c0;
  char *pcStack_b8;
  longlong lStack_b0;
  char *pcStack_a8;
  ulonglong uStack_a0;
  undefined8 uStack_98;
  undefined8 uStack_90;
  undefined8 uStack_88;
  ulonglong uStack_80;
  
  lVar4 = _DAT_7ff70cc1a3c0;
  auVar10._8_4_ = in_XMM3_Dc;
  auVar10._0_8_ = param_4;
  auVar10._12_4_ = in_XMM3_Dd;
  uStack_80 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_f8;
  if (param_6 == (char *)0x0) {
    param_6 = param_5;
    if (param_5 != (char *)0xffffffffffffffff) {
      do {
        if (*param_6 == '#') {
          if (param_6[1] == '#') goto LAB_7ff70c80d4bb;
        }
        else if (*param_6 == '\0') goto LAB_7ff70c80d4bb;
        param_6 = param_6 + 1;
      } while (param_6 != (char *)0xffffffffffffffff);
      param_6 = (char *)0xffffffffffffffff;
      goto LAB_7ff70c80d4bb;
    }
    param_6 = (char *)0xffffffffffffffff;
    if (param_7 == (ulonglong *)0x0) {
      uVar1 = *(uint *)(_DAT_7ff70cc1a3c0 + 0x1130);
      goto LAB_7ff70c80d57c;
    }
LAB_7ff70c80d4c0:
    uStack_a0 = *param_7;
    fVar36 = (float)uStack_a0;
  }
  else {
LAB_7ff70c80d4bb:
    if (param_7 != (ulonglong *)0x0) goto LAB_7ff70c80d4c0;
    uVar1 = *(uint *)(_DAT_7ff70cc1a3c0 + 0x1130);
    if (param_5 == param_6) {
LAB_7ff70c80d57c:
      uStack_a0 = (ulonglong)uVar1 << 0x20;
      fVar36 = 0.0;
    }
    else {
      pcStack_d0 = param_5;
      ppcStack_c0 = (char **)0x0;
      uStack_d8 = 0;
      pcStack_c8 = param_6;
      FUN_7ff70c7f97b0(*(undefined8 *)(_DAT_7ff70cc1a3c0 + 0x1120),&uStack_a0,param_3,
                       _DAT_7ff70cb1c5d8);
      fVar36 = (float)(int)((float)uStack_a0 + _DAT_7ff70cb1d650);
      uStack_a0 = CONCAT44(uStack_a0._4_4_,fVar36);
    }
  }
  fVar2 = *param_3;
  if (fVar36 <= fVar2 - *param_2) {
    uStack_88 = *(undefined8 *)param_2;
    if (fVar2 <= (float)uStack_a0 + (float)uStack_88) {
      fVar36 = param_3[1];
LAB_7ff70c80d9e7:
      uStack_90 = CONCAT44(fVar36,fVar2);
      auVar10 = insertps(_DAT_7ff70cb1d610,*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0xc4c),0x30);
      auVar23._0_4_ = auVar10._0_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0xd54);
      auVar23._4_4_ = auVar10._4_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0xd58);
      auVar23._8_4_ = auVar10._8_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0xd5c);
      auVar23._12_4_ = auVar10._12_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0xd60);
      auVar10 = minps(_DAT_7ff70cb1b2a0,auVar23);
      auVar24._4_4_ = -(uint)(auVar23._4_4_ < 0.0);
      auVar24._0_4_ = -(uint)(auVar23._0_4_ < 0.0);
      auVar24._8_4_ = -(uint)(auVar23._8_4_ < 0.0);
      auVar24._12_4_ = -(uint)(auVar23._12_4_ < 0.0);
      auVar35._0_4_ = auVar10._0_4_ * _DAT_7ff70cb1d5d0 + (float)DAT_7ff70cb1b5a0;
      auVar35._4_4_ = auVar10._4_4_ * _UNK_7ff70cb1d5d4 + DAT_7ff70cb1b5a0._4_4_;
      auVar35._8_4_ = auVar10._8_4_ * _UNK_7ff70cb1d5d8 + DAT_7ff70cb1b5a0._8_4_;
      auVar35._12_4_ = auVar10._12_4_ * _UNK_7ff70cb1d5dc + DAT_7ff70cb1b5a0._12_4_;
      auVar10 = blendvps(auVar35,_DAT_7ff70cb1b5a0,auVar24);
      auVar25._0_4_ = (int)auVar10._0_4_;
      auVar25._4_4_ = (int)auVar10._4_4_;
      auVar25._8_4_ = (int)auVar10._8_4_;
      auVar25._12_4_ = (int)auVar10._12_4_;
      auVar10 = pmulld(auVar25,_DAT_7ff70cb1d5e0);
      auVar30._0_8_ = auVar10._8_8_;
      auVar30._8_4_ = auVar10._8_4_;
      auVar30._12_4_ = auVar10._12_4_;
      uStack_d8 = SUB164(auVar30 | auVar10,4) | SUB164(auVar30 | auVar10,0);
      pcStack_b8 = (char *)&uStack_98;
      uStack_98 = uStack_88;
    }
    else {
      fVar36 = param_3[1];
      if (fVar36 <= (float)(uStack_a0 >> 0x20) + (float)((ulonglong)uStack_88 >> 0x20))
      goto LAB_7ff70c80d9e7;
      auVar10 = insertps(_DAT_7ff70cb1d610,*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0xc4c),0x30);
      auVar14._0_4_ = auVar10._0_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0xd54);
      auVar14._4_4_ = auVar10._4_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0xd58);
      auVar14._8_4_ = auVar10._8_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0xd5c);
      auVar14._12_4_ = auVar10._12_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0xd60);
      auVar10 = minps(_DAT_7ff70cb1b2a0,auVar14);
      auVar15._4_4_ = -(uint)(auVar14._4_4_ < 0.0);
      auVar15._0_4_ = -(uint)(auVar14._0_4_ < 0.0);
      auVar15._8_4_ = -(uint)(auVar14._8_4_ < 0.0);
      auVar15._12_4_ = -(uint)(auVar14._12_4_ < 0.0);
      auVar32._0_4_ = auVar10._0_4_ * _DAT_7ff70cb1d5d0 + (float)DAT_7ff70cb1b5a0;
      auVar32._4_4_ = auVar10._4_4_ * _UNK_7ff70cb1d5d4 + DAT_7ff70cb1b5a0._4_4_;
      auVar32._8_4_ = auVar10._8_4_ * _UNK_7ff70cb1d5d8 + DAT_7ff70cb1b5a0._8_4_;
      auVar32._12_4_ = auVar10._12_4_ * _UNK_7ff70cb1d5dc + DAT_7ff70cb1b5a0._12_4_;
      auVar10 = blendvps(auVar32,_DAT_7ff70cb1b5a0,auVar15);
      auVar16._0_4_ = (int)auVar10._0_4_;
      auVar16._4_4_ = (int)auVar10._4_4_;
      auVar16._8_4_ = (int)auVar10._8_4_;
      auVar16._12_4_ = (int)auVar10._12_4_;
      auVar10 = pmulld(auVar16,_DAT_7ff70cb1d5e0);
      auVar27._0_8_ = auVar10._8_8_;
      auVar27._8_4_ = auVar10._8_4_;
      auVar27._12_4_ = auVar10._12_4_;
      uStack_d8 = SUB164(auVar27 | auVar10,4) | SUB164(auVar27 | auVar10,0);
      pcStack_b8 = (char *)0x0;
    }
    pcStack_d0 = param_5;
    ppcStack_c0 = (char **)((ulonglong)ppcStack_c0 & 0xffffffff00000000);
    pcStack_c8 = param_6;
    FUN_7ff70c7c1190(param_1,0);
    cVar3 = *(char *)(lVar4 + 0x2720);
    goto joined_r0x7ff70c80da99;
  }
  lStack_b0 = lVar4;
  lVar4 = *(longlong *)(*(longlong *)(param_1 + 0x38) + 0x18);
  pcStack_a8 = (char *)0x0;
  uVar6 = FUN_7ff70c7e5630(lVar4);
  FUN_7ff70c7f8ef0(uVar6,*(undefined2 *)(lVar4 + 0x30));
  auVar8._8_4_ = in_XMM3_Dc;
  auVar8._0_8_ = param_4;
  auVar8._12_4_ = in_XMM3_Dd;
  auVar9._4_12_ = auVar8._4_12_;
  auVar9._0_4_ = -(uint)((float)param_4 <= *param_3);
  blendvps(auVar10,ZEXT416((uint)*param_3),auVar9);
  ppcStack_c0 = &pcStack_a8;
  pcStack_d0 = param_5;
  uStack_d8 = 0;
  pcStack_c8 = param_6;
  FUN_7ff70c7f97b0(lVar4);
  fVar36 = (float)uStack_98;
  if (param_5 < pcStack_a8) {
    do {
      if ((pcStack_a8[-1] != ' ') && (pcStack_a8[-1] != '\t')) break;
      pcStack_d0 = pcStack_a8 + -1;
      ppcStack_c0 = (char **)0x0;
      uStack_d8 = 0;
      pcStack_c8 = pcStack_a8;
      pcStack_a8 = pcStack_d0;
      FUN_7ff70c7f97b0(lVar4,&uStack_98);
      fVar36 = fVar36 - (float)uStack_98;
    } while (param_5 < pcStack_a8);
  }
  uStack_88 = *(undefined8 *)param_2;
  if (*param_3 <= (float)uStack_a0 + (float)uStack_88) {
    fVar2 = param_3[1];
    uVar7 = uStack_a0;
LAB_7ff70c80d85b:
    uStack_90 = CONCAT44(fVar2,*param_3);
    auVar10 = insertps(_DAT_7ff70cb1d610,*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0xc4c),0x30);
    auVar17._0_4_ = auVar10._0_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0xd54);
    auVar17._4_4_ = auVar10._4_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0xd58);
    auVar17._8_4_ = auVar10._8_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0xd5c);
    auVar17._12_4_ = auVar10._12_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0xd60);
    auVar10 = minps(_DAT_7ff70cb1b2a0,auVar17);
    auVar18._4_4_ = -(uint)(auVar17._4_4_ < 0.0);
    auVar18._0_4_ = -(uint)(auVar17._0_4_ < 0.0);
    auVar18._8_4_ = -(uint)(auVar17._8_4_ < 0.0);
    auVar18._12_4_ = -(uint)(auVar17._12_4_ < 0.0);
    auVar33._0_4_ = auVar10._0_4_ * _DAT_7ff70cb1d5d0 + (float)DAT_7ff70cb1b5a0;
    auVar33._4_4_ = auVar10._4_4_ * _UNK_7ff70cb1d5d4 + DAT_7ff70cb1b5a0._4_4_;
    auVar33._8_4_ = auVar10._8_4_ * _UNK_7ff70cb1d5d8 + DAT_7ff70cb1b5a0._8_4_;
    auVar33._12_4_ = auVar10._12_4_ * _UNK_7ff70cb1d5dc + DAT_7ff70cb1b5a0._12_4_;
    auVar10 = blendvps(auVar33,_DAT_7ff70cb1b5a0,auVar18);
    auVar19._0_4_ = (int)auVar10._0_4_;
    auVar19._4_4_ = (int)auVar10._4_4_;
    auVar19._8_4_ = (int)auVar10._8_4_;
    auVar19._12_4_ = (int)auVar10._12_4_;
    auVar10 = pmulld(auVar19,_DAT_7ff70cb1d5e0);
    auVar28._0_8_ = auVar10._8_8_;
    auVar28._8_4_ = auVar10._8_4_;
    auVar28._12_4_ = auVar10._12_4_;
    uStack_d8 = SUB164(auVar28 | auVar10,4) | SUB164(auVar28 | auVar10,0);
    pcStack_b8 = (char *)&uStack_98;
    uStack_98 = uStack_88;
  }
  else {
    uVar7 = uStack_a0 >> 0x20;
    fVar2 = param_3[1];
    if (fVar2 <= (float)(uStack_a0 >> 0x20) + (float)((ulonglong)uStack_88 >> 0x20))
    goto LAB_7ff70c80d85b;
    auVar10 = insertps(_DAT_7ff70cb1d610,*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0xc4c),0x30);
    auVar11._0_4_ = auVar10._0_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0xd54);
    auVar11._4_4_ = auVar10._4_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0xd58);
    auVar11._8_4_ = auVar10._8_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0xd5c);
    auVar11._12_4_ = auVar10._12_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0xd60);
    auVar10 = minps(_DAT_7ff70cb1b2a0,auVar11);
    auVar12._4_4_ = -(uint)(auVar11._4_4_ < 0.0);
    auVar12._0_4_ = -(uint)(auVar11._0_4_ < 0.0);
    auVar12._8_4_ = -(uint)(auVar11._8_4_ < 0.0);
    auVar12._12_4_ = -(uint)(auVar11._12_4_ < 0.0);
    auVar31._0_4_ = auVar10._0_4_ * _DAT_7ff70cb1d5d0 + (float)DAT_7ff70cb1b5a0;
    auVar31._4_4_ = auVar10._4_4_ * _UNK_7ff70cb1d5d4 + DAT_7ff70cb1b5a0._4_4_;
    auVar31._8_4_ = auVar10._8_4_ * _UNK_7ff70cb1d5d8 + DAT_7ff70cb1b5a0._8_4_;
    auVar31._12_4_ = auVar10._12_4_ * _UNK_7ff70cb1d5dc + DAT_7ff70cb1b5a0._12_4_;
    auVar10 = blendvps(auVar31,_DAT_7ff70cb1b5a0,auVar12);
    auVar13._0_4_ = (int)auVar10._0_4_;
    auVar13._4_4_ = (int)auVar10._4_4_;
    auVar13._8_4_ = (int)auVar10._8_4_;
    auVar13._12_4_ = (int)auVar10._12_4_;
    auVar10 = pmulld(auVar13,_DAT_7ff70cb1d5e0);
    auVar26._0_8_ = auVar10._8_8_;
    auVar26._8_4_ = auVar10._8_4_;
    auVar26._12_4_ = auVar10._12_4_;
    uStack_d8 = SUB164(auVar26 | auVar10,4) | SUB164(auVar26 | auVar10,0);
    pcStack_b8 = (char *)0x0;
  }
  pcStack_d0 = param_5;
  ppcStack_c0 = (char **)((ulonglong)ppcStack_c0 & 0xffffffff00000000);
  pcStack_c8 = pcStack_a8;
  FUN_7ff70c7c1190(param_1,0,uVar7,&uStack_88);
  uStack_98 = *(undefined8 *)param_2;
  uStack_90 = *(undefined8 *)param_3;
  auVar10 = insertps(ZEXT416((uint)(fVar36 + (float)uStack_98)),param_2[1],0x10);
  uStack_88 = CONCAT44((float)(int)auVar10._4_4_,(float)(int)auVar10._0_4_);
  auVar10 = insertps(_DAT_7ff70cb1d610,*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0xc4c),0x30);
  auVar20._0_4_ = auVar10._0_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0xd54);
  auVar20._4_4_ = auVar10._4_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0xd58);
  auVar20._8_4_ = auVar10._8_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0xd5c);
  auVar20._12_4_ = auVar10._12_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0xd60);
  auVar10 = minps(_DAT_7ff70cb1b2a0,auVar20);
  auVar21._4_4_ = -(uint)(auVar20._4_4_ < 0.0);
  auVar21._0_4_ = -(uint)(auVar20._0_4_ < 0.0);
  auVar21._8_4_ = -(uint)(auVar20._8_4_ < 0.0);
  auVar21._12_4_ = -(uint)(auVar20._12_4_ < 0.0);
  auVar34._0_4_ = auVar10._0_4_ * _DAT_7ff70cb1d5d0 + (float)DAT_7ff70cb1b5a0;
  auVar34._4_4_ = auVar10._4_4_ * _UNK_7ff70cb1d5d4 + DAT_7ff70cb1b5a0._4_4_;
  auVar34._8_4_ = auVar10._8_4_ * _UNK_7ff70cb1d5d8 + DAT_7ff70cb1b5a0._8_4_;
  auVar34._12_4_ = auVar10._12_4_ * _UNK_7ff70cb1d5dc + DAT_7ff70cb1b5a0._12_4_;
  auVar10 = blendvps(auVar34,_DAT_7ff70cb1b5a0,auVar21);
  auVar22._0_4_ = (int)auVar10._0_4_;
  auVar22._4_4_ = (int)auVar10._4_4_;
  auVar22._8_4_ = (int)auVar10._8_4_;
  auVar22._12_4_ = (int)auVar10._12_4_;
  auVar10 = pmulld(auVar22,_DAT_7ff70cb1d5e0);
  auVar29._0_8_ = auVar10._8_8_;
  auVar29._8_4_ = auVar10._8_4_;
  auVar29._12_4_ = auVar10._12_4_;
  uStack_d8 = SUB164(auVar29 | auVar10,4) | SUB164(auVar29 | auVar10,0);
  pcStack_d0 = (char *)CONCAT62(pcStack_d0._2_6_,*(undefined2 *)(lVar4 + 0x30));
  pcStack_c8 = (char *)&uStack_98;
  FUN_7ff70c7f9d40(lVar4,param_1);
  cVar3 = *(char *)(lStack_b0 + 0x2720);
joined_r0x7ff70c80da99:
  if (cVar3 == '\x01') {
    FUN_7ff70c80c840(param_2,param_5,param_6);
  }
  if (_DAT_7ff70cbebd80 == (uStack_80 ^ (ulonglong)auStack_f8)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_80 ^ (ulonglong)auStack_f8);
  pcVar5 = (code *)swi(3);
  (*pcVar5)();
  return;
}


