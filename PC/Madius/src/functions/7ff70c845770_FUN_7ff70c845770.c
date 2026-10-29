/* 7ff70c845770 FUN_7ff70c845770 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulonglong FUN_7ff70c845770(undefined8 param_1,float param_2,float param_3)

{
  code *pcVar1;
  undefined1 auVar2 [16];
  ulonglong uVar3;
  float fVar4;
  undefined4 in_XMM0_Dc;
  undefined4 in_XMM0_Dd;
  float fVar5;
  undefined1 in_XMM1 [16];
  float in_XMM2_Dc;
  undefined4 in_XMM3_Dc;
  undefined1 auVar6 [16];
  undefined1 auVar7 [16];
  undefined1 auStack_28 [32];
  ulonglong uStack_8;
  
  fVar4 = (float)param_1;
  uStack_8 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_28;
  uVar3 = 1;
  fVar5 = in_XMM1._0_4_;
  if (((fVar5 != 0.0) || (NAN(fVar5))) && (uVar3 = 0, fVar4 < fVar5)) {
    if (param_3 <= 0.0) {
      uVar3 = (ulonglong)(-(uint)(param_2 <= fVar5 && fVar4 < param_2) & 1);
    }
    else {
      auVar6._8_4_ = in_XMM0_Dc;
      auVar6._0_8_ = param_1;
      auVar6._12_4_ = in_XMM0_Dd;
      auVar6 = insertps(in_XMM1,auVar6,0x10);
      auVar7._0_4_ = auVar6._0_4_ - param_2;
      auVar7._4_4_ = auVar6._4_4_ - param_2;
      auVar7._8_4_ = auVar6._8_4_ - in_XMM2_Dc;
      auVar7._12_4_ = auVar6._12_4_ - in_XMM2_Dc;
      auVar2._4_4_ = param_3;
      auVar2._0_4_ = param_3;
      auVar2._8_4_ = in_XMM3_Dc;
      auVar2._12_4_ = in_XMM3_Dc;
      auVar6 = divps(auVar7,auVar2);
      uVar3 = (ulonglong)
              (uint)(((int)((uint)(fVar5 < param_2) << 0x1f) >> 0x1f | (int)auVar6._0_4_) -
                    ((int)((uint)(fVar4 < param_2) << 0x1f) >> 0x1f | (int)auVar6._4_4_));
    }
  }
  if (_DAT_7ff70cbebd80 == (uStack_8 ^ (ulonglong)auStack_28)) {
    return uVar3;
  }
  FUN_7ff70caa97e0(uStack_8 ^ (ulonglong)auStack_28);
  pcVar1 = (code *)swi(3);
  uVar3 = (*pcVar1)();
  return uVar3;
}


