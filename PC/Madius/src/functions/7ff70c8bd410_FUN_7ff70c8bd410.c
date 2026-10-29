/* 7ff70c8bd410 FUN_7ff70c8bd410 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c8bd410(longlong param_1,longlong *param_2)

{
  ulonglong uVar1;
  code *pcVar2;
  int iVar3;
  longlong lVar4;
  float fVar5;
  float fVar6;
  undefined1 auVar7 [16];
  undefined1 auVar8 [16];
  undefined1 auVar9 [16];
  float fVar10;
  undefined1 auVar11 [16];
  undefined1 auVar12 [16];
  undefined1 auStack_b8 [32];
  undefined8 uStack_98;
  float **ppfStack_90;
  undefined4 uStack_88;
  undefined4 uStack_84;
  float *apfStack_80 [2];
  undefined8 uStack_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  ulonglong uStack_40;
  
  uStack_40 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_b8;
  lVar4 = FUN_7ff70c808680();
  if (lVar4 == 0) {
    lVar4 = 0;
  }
  else {
    lVar4 = FUN_7ff70c8194a0();
    lVar4 = *(longlong *)(lVar4 + 0x98);
  }
  uStack_68 = CONCAT44((float)((ulonglong)*(undefined8 *)(param_1 + 0x30) >> 0x20) *
                       (float)((ulonglong)*(undefined8 *)(param_1 + 0x28) >> 0x20),
                       (float)*(undefined8 *)(param_1 + 0x30) *
                       (float)*(undefined8 *)(param_1 + 0x28));
  uStack_60 = _DAT_7ff70cb1d410;
  uStack_70 = 0;
  (**(code **)(*param_2 + 0x160))(param_2,1,&uStack_70);
  ppfStack_90 = apfStack_80;
  uStack_98 = (undefined4 *)((ulonglong)uStack_98._4_4_ << 0x20);
  iVar3 = (**(code **)(*param_2 + 0x70))(param_2,*(undefined8 *)(lVar4 + 0x38),0,4);
  if (iVar3 == 0) {
    uVar1 = *(ulonglong *)(param_1 + 0x20);
    fVar5 = (float)uVar1;
    fVar6 = (float)(uVar1 >> 0x20);
    auVar7._0_4_ = (float)*(undefined8 *)(param_1 + 0x28) + fVar5;
    auVar7._4_4_ = (float)((ulonglong)*(undefined8 *)(param_1 + 0x28) >> 0x20) + fVar6;
    auVar7._8_8_ = 0;
    fVar10 = _DAT_7ff70cb1d670 / (fVar6 - auVar7._4_4_);
    auVar9._0_4_ = fVar5 + auVar7._0_4_;
    auVar9._4_4_ = fVar6 + auVar7._4_4_;
    auVar9._8_8_ = 0;
    auVar11._8_8_ = 0;
    auVar11._0_8_ = uVar1;
    auVar11 = blendps(auVar11,auVar7,2);
    auVar8._8_8_ = 0;
    auVar8._0_8_ = uVar1;
    auVar8 = insertps(auVar7,auVar8,0x50);
    auVar12._0_4_ = auVar11._0_4_ - auVar8._0_4_;
    auVar12._4_4_ = auVar11._4_4_ - auVar8._4_4_;
    auVar12._8_4_ = auVar11._8_4_ - auVar8._8_4_;
    auVar12._12_4_ = auVar11._12_4_ - auVar8._12_4_;
    auVar8 = divps(auVar9,auVar12);
    *apfStack_80[0] = _DAT_7ff70cb1d670 / (auVar7._0_4_ - fVar5);
    apfStack_80[0][1] = 0.0;
    apfStack_80[0][2] = 0.0;
    apfStack_80[0][3] = 0.0;
    apfStack_80[0][4] = 0.0;
    apfStack_80[0][5] = fVar10;
    apfStack_80[0][6] = 0.0;
    apfStack_80[0][7] = 0.0;
    apfStack_80[0][8] = 0.0;
    apfStack_80[0][9] = 0.0;
    apfStack_80[0][10] = _DAT_7ff70cb1ba70;
    apfStack_80[0][0xb] = 0.0;
    apfStack_80[0][0xc] = auVar8._0_4_;
    apfStack_80[0][0xd] = auVar8._4_4_;
    *(undefined8 *)(apfStack_80[0] + 0xe) = _DAT_7ff70cb1d730;
    (**(code **)(*param_2 + 0x78))(param_2,*(undefined8 *)(lVar4 + 0x38),0);
  }
  uStack_84 = 0x14;
  uStack_88 = 0;
  (**(code **)(*param_2 + 0x88))(param_2,*(undefined8 *)(lVar4 + 0x30));
  ppfStack_90 = (float **)&uStack_88;
  uStack_98 = &uStack_84;
  (**(code **)(*param_2 + 0x90))(param_2,0,1,lVar4 + 0x18);
  (**(code **)(*param_2 + 0x98))(param_2,*(undefined8 *)(lVar4 + 0x20),0x39,0);
  (**(code **)(*param_2 + 0xc0))(param_2,4);
  (**(code **)(*param_2 + 0x58))(param_2,*(undefined8 *)(lVar4 + 0x28),0,0);
  (**(code **)(*param_2 + 0x38))(param_2,0,1,(undefined8 *)(lVar4 + 0x38));
  (**(code **)(*param_2 + 0x48))(param_2,*(undefined8 *)(lVar4 + 0x40),0,0);
  (**(code **)(*param_2 + 0x50))(param_2,0,1,lVar4 + 0x48);
  (**(code **)(*param_2 + 0xb8))(param_2,0,0,0);
  (**(code **)(*param_2 + 0x1e0))(param_2,0,0,0);
  (**(code **)(*param_2 + 0x200))(param_2,0,0,0);
  (**(code **)(*param_2 + 0x228))(param_2,0,0,0);
  uStack_58 = 0;
  uStack_50 = 0;
  (**(code **)(*param_2 + 0x118))(param_2,*(undefined8 *)(lVar4 + 0x58),&uStack_58,0xffffffff);
  (**(code **)(*param_2 + 0x120))(param_2,*(undefined8 *)(lVar4 + 0x60),0);
  (**(code **)(*param_2 + 0x158))(param_2,*(undefined8 *)(lVar4 + 0x50));
  if (_DAT_7ff70cbebd80 == (uStack_40 ^ (ulonglong)auStack_b8)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_40 ^ (ulonglong)auStack_b8);
  pcVar2 = (code *)swi(3);
  (*pcVar2)();
  return;
}


