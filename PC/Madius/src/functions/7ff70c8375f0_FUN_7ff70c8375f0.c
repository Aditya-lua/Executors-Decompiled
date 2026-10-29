/* 7ff70c8375f0 FUN_7ff70c8375f0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c8375f0(float *param_1)

{
  float fVar1;
  float fVar2;
  longlong lVar3;
  code *pcVar4;
  longlong lVar5;
  float fVar6;
  undefined1 in_XMM1 [16];
  float fVar7;
  undefined1 auVar8 [16];
  undefined1 auVar9 [16];
  undefined1 auVar10 [16];
  undefined1 auVar11 [16];
  undefined1 auStack_48 [40];
  ulonglong uStack_20;
  
  lVar5 = _DAT_7ff70cc1a3c0;
  uStack_20 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_48;
  lVar3 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
  if (*(char *)(lVar3 + 0xd1) == '\0') {
    fVar1 = *(float *)(lVar3 + 0x150);
    fVar6 = in_XMM1._0_4_;
    fVar7 = 0.0;
    if (0.0 <= fVar6 && 0.0 < fVar1 - fVar6) {
      fVar7 = fVar1 - fVar6;
    }
    fVar2 = *(float *)(lVar3 + 0x11c + (ulonglong)*(byte *)(lVar3 + 0x158) * 8);
    fVar7 = (*(float *)(lVar3 + 0x11c) - fVar2) + param_1[1] + fVar7;
    auVar8 = blendvps(ZEXT416((uint)fVar7),ZEXT416((uint)*(float *)(lVar3 + 0x144)),
                      ZEXT416(-(uint)(fVar7 <= *(float *)(lVar3 + 0x144))));
    fVar7 = *(float *)(lVar3 + 0x118) + *param_1;
    *(float *)(lVar3 + 0x120) = fVar7;
    *(float *)(lVar3 + 0x124) = fVar2;
    *(float *)(lVar3 + 0x118) =
         (float)(int)(*(float *)(lVar3 + 0x28) + *(float *)(lVar3 + 0x15c) +
                     *(float *)(lVar3 + 0x160));
    auVar9._0_4_ = (float)(int)(auVar8._0_4_ + fVar2 + *(float *)(lVar5 + 0xca0));
    auVar9._4_4_ = (float)(int)auVar8._4_4_;
    auVar9._8_4_ = (float)(int)auVar8._8_4_;
    auVar9._12_4_ = (float)(int)auVar8._12_4_;
    *(float *)(lVar3 + 0x11c) = auVar9._0_4_;
    auVar11 = blendvps(ZEXT416((uint)fVar7),ZEXT416((uint)*(float *)(lVar3 + 0x130)),
                       ZEXT416(-(uint)(fVar7 <= *(float *)(lVar3 + 0x130))));
    *(int *)(lVar3 + 0x130) = auVar11._0_4_;
    auVar10._4_12_ = auVar9._4_12_;
    auVar10._0_4_ = auVar9._0_4_ - *(float *)(lVar5 + 0xca0);
    auVar11._4_4_ = auVar9._4_4_;
    auVar11._0_4_ = -(uint)(auVar10._0_4_ <= *(float *)(lVar3 + 0x134));
    auVar11._8_4_ = auVar9._8_4_;
    auVar11._12_4_ = auVar9._12_4_;
    auVar11 = blendvps(auVar10,ZEXT416((uint)*(float *)(lVar3 + 0x134)),auVar11);
    *(int *)(lVar3 + 0x134) = auVar11._0_4_;
    *(float *)(lVar3 + 0x14c) = auVar8._0_4_;
    *(undefined4 *)(lVar3 + 0x144) = 0;
    auVar8._4_4_ = in_XMM1._4_4_;
    auVar8._0_4_ = -(uint)(fVar6 <= fVar1);
    auVar8._8_4_ = in_XMM1._8_4_;
    auVar8._12_4_ = in_XMM1._12_4_;
    auVar11 = blendvps(in_XMM1,ZEXT416((uint)fVar1),auVar8);
    *(int *)(lVar3 + 0x154) = auVar11._0_4_;
    *(undefined4 *)(lVar3 + 0x150) = 0;
    *(undefined2 *)(lVar3 + 0x158) = 0;
    if ((*(int *)(lVar3 + 0x1d4) == 0) &&
       (lVar3 = *(longlong *)(lVar5 + 0x1440), *(char *)(lVar3 + 0xd1) == '\0')) {
      *(float *)(lVar3 + 0x118) = *(float *)(lVar5 + 0xc9c) + *(float *)(lVar3 + 0x120);
      *(undefined4 *)(lVar3 + 0x11c) = *(undefined4 *)(lVar3 + 0x124);
      *(undefined8 *)(lVar3 + 0x140) = *(undefined8 *)(lVar3 + 0x148);
      *(undefined4 *)(lVar3 + 0x150) = *(undefined4 *)(lVar3 + 0x154);
      *(undefined1 *)(lVar3 + 0x158) = 1;
    }
  }
  if (_DAT_7ff70cbebd80 == (uStack_20 ^ (ulonglong)auStack_48)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_20 ^ (ulonglong)auStack_48);
  pcVar4 = (code *)swi(3);
  (*pcVar4)();
  return;
}


