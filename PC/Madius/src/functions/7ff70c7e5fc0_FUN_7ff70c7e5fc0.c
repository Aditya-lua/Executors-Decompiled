/* 7ff70c7e5fc0 FUN_7ff70c7e5fc0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8
FUN_7ff70c7e5fc0(byte *param_1,uint param_2,undefined8 *param_3,undefined8 *param_4,
                undefined8 *param_5,undefined8 *param_6)

{
  longlong lVar1;
  undefined8 uVar2;
  code *pcVar3;
  undefined8 uVar4;
  ulonglong uVar5;
  float fVar6;
  float fVar8;
  undefined1 auVar7 [16];
  float fVar9;
  float fVar11;
  float fVar12;
  float fVar13;
  float fVar14;
  float fVar15;
  undefined1 auVar10 [16];
  float fVar16;
  float fVar17;
  undefined1 auStack_48 [32];
  ulonglong uStack_28;
  
  uStack_28 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_48;
  if ((param_2 < 0xb) && ((*param_1 & 2) == 0)) {
    lVar1 = *(longlong *)(param_1 + 0x2b0);
    uVar5 = (ulonglong)param_2;
    uVar2 = *(undefined8 *)(&UNK_7ff70cb15340 + uVar5 * 0x18);
    auVar7 = ZEXT416(*(uint *)(*(longlong *)(lVar1 + 0x68) +
                              ((longlong)
                               ((ulonglong)
                                *(uint *)(*(longlong *)(lVar1 + 0x78) +
                                         (ulonglong)(*(uint *)(lVar1 + 0xec) & 0xfffff) * 4) << 0x2c
                               ) >> 0x2c) * 8));
    auVar7 = pmovzxwd(auVar7,auVar7);
    fVar9 = (float)*(undefined8 *)(&UNK_7ff70cb15330 + uVar5 * 0x18) + (float)auVar7._0_4_;
    fVar11 = (float)((ulonglong)*(undefined8 *)(&UNK_7ff70cb15330 + uVar5 * 0x18) >> 0x20) +
             (float)auVar7._4_4_;
    fVar12 = (float)auVar7._8_4_ + 0.0;
    fVar14 = (float)auVar7._12_4_ + 0.0;
    uVar4 = *(undefined8 *)(&UNK_7ff70cb15338 + uVar5 * 0x18);
    *param_4 = *(undefined8 *)(&UNK_7ff70cb15338 + uVar5 * 0x18);
    *param_3 = uVar2;
    *param_5 = CONCAT44((float)((ulonglong)*(undefined8 *)(param_1 + 0x54) >> 0x20) * fVar11,
                        (float)*(undefined8 *)(param_1 + 0x54) * fVar9);
    fVar6 = (float)uVar4;
    fVar16 = fVar9 + fVar6;
    fVar8 = (float)((ulonglong)uVar4 >> 0x20);
    fVar17 = fVar11 + fVar8;
    param_5[1] = CONCAT44((float)((ulonglong)*(undefined8 *)(param_1 + 0x54) >> 0x20) * fVar17,
                          (float)*(undefined8 *)(param_1 + 0x54) * fVar16);
    fVar9 = fVar9 + _DAT_7ff70cb1c5f0;
    fVar11 = fVar11 + _UNK_7ff70cb1c5f4;
    fVar13 = fVar12 + _UNK_7ff70cb1c5f8;
    fVar15 = fVar14 + _UNK_7ff70cb1c5fc;
    *param_6 = CONCAT44((float)((ulonglong)*(undefined8 *)(param_1 + 0x54) >> 0x20) * fVar11,
                        (float)*(undefined8 *)(param_1 + 0x54) * fVar9);
    auVar10._0_4_ = fVar9 + fVar6;
    auVar10._4_4_ = fVar11 + fVar8;
    auVar10._8_4_ = fVar13 + 0.0;
    auVar10._12_4_ = fVar15 + 0.0;
    auVar7._4_4_ = fVar17;
    auVar7._0_4_ = fVar16;
    auVar7._8_4_ = fVar12 + 0.0;
    auVar7._12_4_ = fVar14 + 0.0;
    auVar7 = blendps(auVar10,auVar7,2);
    param_6[1] = CONCAT44(auVar7._4_4_ * (float)((ulonglong)*(undefined8 *)(param_1 + 0x54) >> 0x20)
                          ,auVar7._0_4_ * (float)*(undefined8 *)(param_1 + 0x54));
    uVar4 = 1;
  }
  else {
    uVar4 = 0;
  }
  if (_DAT_7ff70cbebd80 == (uStack_28 ^ (ulonglong)auStack_48)) {
    return uVar4;
  }
  FUN_7ff70caa97e0(uStack_28 ^ (ulonglong)auStack_48);
  pcVar3 = (code *)swi(3);
  uVar4 = (*pcVar3)();
  return uVar4;
}


