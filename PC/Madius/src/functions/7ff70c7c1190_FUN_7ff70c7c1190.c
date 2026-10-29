/* 7ff70c7c1190 FUN_7ff70c7c1190 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c7c1190(longlong param_1,longlong param_2,float param_3,undefined8 param_4,
                     uint param_5,char *param_6,char *param_7,undefined4 param_8,
                     undefined1 (*param_9) [16])

{
  undefined1 auVar1 [16];
  code *pcVar2;
  float fVar3;
  float fVar4;
  float fVar5;
  float fVar6;
  undefined8 uVar7;
  undefined1 auVar8 [16];
  undefined1 auVar9 [16];
  undefined1 auStack_78 [32];
  uint uStack_58;
  undefined1 *puStack_50;
  char *pcStack_48;
  char *pcStack_40;
  undefined4 uStack_38;
  undefined1 uStack_30;
  undefined1 auStack_28 [16];
  ulonglong uStack_18;
  
  uStack_18 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_78;
  if ((param_6 != param_7 && 0xffffff < param_5) && (*param_6 != '\0')) {
    if (param_2 == 0) {
      param_2 = *(longlong *)(*(longlong *)(param_1 + 0x38) + 0x18);
    }
    if ((param_3 == 0.0) && (!NAN(param_3))) {
      param_3 = *(float *)(*(longlong *)(param_1 + 0x38) + 0x20);
    }
    uVar7 = *(undefined8 *)*(undefined1 (*) [16])(param_1 + 0x60);
    auStack_28 = *(undefined1 (*) [16])(param_1 + 0x60);
    if (param_9 != (undefined1 (*) [16])0x0) {
      auVar1 = *param_9;
      fVar3 = (float)uVar7;
      fVar4 = (float)((ulonglong)uVar7 >> 0x20);
      fVar5 = (float)*(undefined8 *)(param_1 + 0x68);
      fVar6 = (float)((ulonglong)*(undefined8 *)(param_1 + 0x68) >> 0x20);
      auVar8._4_4_ = -(uint)(fVar4 < auVar1._4_4_);
      auVar8._0_4_ = -(uint)(fVar3 < auVar1._0_4_);
      auVar8._8_4_ = -(uint)(fVar5 < auVar1._8_4_);
      auVar8._12_4_ = -(uint)(fVar6 < auVar1._12_4_);
      auVar9._4_4_ = -(uint)(auVar1._4_4_ <= fVar4);
      auVar9._0_4_ = -(uint)(auVar1._0_4_ <= fVar3);
      auVar9._8_4_ = -(uint)(auVar1._8_4_ <= fVar5);
      auVar9._12_4_ = -(uint)(auVar1._12_4_ <= fVar6);
      auVar9 = blendps(auVar8,auVar9,3);
      auStack_28 = blendvps(auVar1,auStack_28,auVar9);
    }
    uStack_30 = param_9 != (undefined1 (*) [16])0x0;
    uStack_38 = param_8;
    pcStack_40 = param_7;
    pcStack_48 = param_6;
    puStack_50 = auStack_28;
    uStack_58 = param_5;
    FUN_7ff70c7c12b0(param_2,param_1,param_3);
  }
  if (_DAT_7ff70cbebd80 == (uStack_18 ^ (ulonglong)auStack_78)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_18 ^ (ulonglong)auStack_78);
  pcVar2 = (code *)swi(3);
  (*pcVar2)();
  return;
}


