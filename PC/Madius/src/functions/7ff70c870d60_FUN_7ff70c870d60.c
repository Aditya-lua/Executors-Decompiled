/* 7ff70c870d60 FUN_7ff70c870d60 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c870d60(undefined1 (*param_1) [16],longlong param_2,undefined4 param_3,
                     undefined8 param_4,float param_5)

{
  undefined8 uVar1;
  code *pcVar2;
  uint uVar3;
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  float fVar6;
  float fVar8;
  undefined1 auVar7 [16];
  undefined1 auVar9 [16];
  undefined1 auVar10 [16];
  undefined1 in_XMM3 [16];
  float fVar11;
  float fVar14;
  undefined1 auVar12 [16];
  undefined1 auVar13 [16];
  undefined1 auVar15 [16];
  undefined1 auStack_48 [40];
  ulonglong uStack_20;
  
  uStack_20 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_48;
  uVar3 = (uint)(param_5 == 0.0);
  uVar1 = *(undefined8 *)(param_2 + 0x28);
  auVar9._0_4_ = (float)uVar1;
  auVar12._0_4_ = (float)*(undefined8 *)(param_2 + 0x30) + auVar9._0_4_;
  fVar6 = (float)((ulonglong)uVar1 >> 0x20);
  auVar12._4_4_ = (float)((ulonglong)*(undefined8 *)(param_2 + 0x30) >> 0x20) + fVar6;
  auVar12._8_8_ = 0;
  auVar7._0_4_ = uVar3 * -0x80000000;
  auVar7._4_4_ = uVar3 * -0x80000000;
  auVar7._8_4_ = uVar3 * -0x80000000;
  auVar7._12_4_ = uVar3 * -0x80000000;
  auVar13._4_4_ = _UNK_7ff70cb1d554 + auVar12._4_4_;
  auVar13._0_4_ = _DAT_7ff70cb1d550 + auVar12._0_4_;
  auVar13._8_4_ = _UNK_7ff70cb1d558 + 0.0;
  auVar13._12_4_ = _UNK_7ff70cb1d55c + 0.0;
  auVar13 = blendvps(auVar12,auVar13,auVar7);
  fVar11 = auVar13._0_4_;
  fVar14 = auVar13._4_4_;
  fVar8 = in_XMM3._0_4_;
  switch(param_3) {
  case 0:
    *(float *)*param_1 = auVar9._0_4_ - param_5;
    *(float *)(*param_1 + 4) = fVar6 + fVar8;
    *(float *)(*param_1 + 8) = param_5 + auVar9._0_4_;
    *(float *)(*param_1 + 0xc) = fVar14 - fVar8;
    break;
  case 1:
    auVar15._0_4_ = fVar11 - fVar8;
    auVar15._4_4_ = fVar14 - fVar8;
    auVar15._8_4_ = auVar13._8_4_ - in_XMM3._8_4_;
    auVar15._12_4_ = auVar13._12_4_ - in_XMM3._8_4_;
    auVar5._4_4_ = fVar14 + 0.0;
    auVar5._0_4_ = fVar11 + param_5;
    auVar5._8_4_ = auVar13._8_4_ + 0.0;
    auVar5._12_4_ = auVar13._12_4_ + 0.0;
    auVar13 = blendps(auVar15,auVar5,0xd);
    *(float *)*param_1 = fVar11 - param_5;
    *(float *)(*param_1 + 4) = fVar6 + fVar8;
    *(longlong *)(*param_1 + 8) = auVar13._0_8_;
    break;
  case 2:
    auVar9._8_4_ = fVar11;
    auVar9._0_8_ = uVar1;
    auVar9._12_4_ = fVar6;
    goto code_r0x7ff70c870e16;
  case 3:
    auVar9._4_4_ = fVar14;
    auVar9._8_4_ = fVar11;
    auVar9._12_4_ = fVar14;
code_r0x7ff70c870e16:
    auVar13 = insertps(in_XMM3,ZEXT416((uint)param_5),0x10);
    fVar6 = auVar13._0_4_;
    fVar8 = auVar13._4_4_;
    auVar10._0_4_ = auVar9._0_4_ - fVar6;
    auVar10._4_4_ = auVar9._4_4_ - fVar8;
    auVar10._8_4_ = auVar9._8_4_ - fVar6;
    auVar10._12_4_ = auVar9._12_4_ - fVar8;
    auVar4._4_4_ = auVar9._4_4_ + fVar8;
    auVar4._0_4_ = auVar9._0_4_ + fVar6;
    auVar4._8_4_ = auVar9._8_4_ + fVar6;
    auVar4._12_4_ = auVar9._12_4_ + fVar8;
    auVar13 = blendps(auVar10,auVar4,9);
    *param_1 = auVar13;
    break;
  default:
    *param_1 = (undefined1  [16])0x0;
  }
  if (_DAT_7ff70cbebd80 != (uStack_20 ^ (ulonglong)auStack_48)) {
    FUN_7ff70caa97e0(uStack_20 ^ (ulonglong)auStack_48);
    pcVar2 = (code *)swi(3);
    (*pcVar2)();
    return;
  }
  return;
}


