/* 7ff70c8797c0 FUN_7ff70c8797c0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulonglong FUN_7ff70c8797c0(undefined4 param_1,undefined8 *param_2)

{
  longlong lVar1;
  code *pcVar2;
  undefined1 auVar3 [16];
  longlong lVar4;
  char cVar5;
  undefined4 uVar6;
  ulonglong uVar7;
  float fVar8;
  float fVar12;
  undefined1 auVar9 [16];
  undefined1 auVar10 [16];
  undefined1 auVar11 [16];
  float fVar13;
  float fVar14;
  float fVar15;
  float fVar16;
  float fVar18;
  float fVar19;
  undefined1 auVar17 [16];
  float fVar20;
  undefined1 auStack_c8 [32];
  undefined4 uStack_a8;
  undefined4 uStack_a0;
  undefined8 uStack_90;
  undefined8 uStack_88;
  byte bStack_7a;
  char cStack_79;
  undefined1 auStack_78 [16];
  undefined8 uStack_60;
  undefined8 uStack_58;
  ulonglong uStack_50;
  
  lVar4 = _DAT_7ff70cc1a3c0;
  uStack_50 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_c8;
  lVar1 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
  uStack_60 = *param_2;
  fVar18 = (float)uStack_60;
  fVar8 = *(float *)(_DAT_7ff70cc1a3c0 + 0x1130) + fVar18;
  fVar19 = (float)((ulonglong)uStack_60 >> 0x20);
  fVar12 = *(float *)(_DAT_7ff70cc1a3c0 + 0x1130) + fVar19;
  uStack_58 = CONCAT44(fVar12,fVar8);
  auStack_78._8_8_ = uStack_58;
  auStack_78._0_8_ = uStack_60;
  if ((((float)((ulonglong)*(undefined8 *)(lVar1 + 0x218) >> 0x20) -
       (float)((ulonglong)*(undefined8 *)(lVar1 + 0x210) >> 0x20)) *
      ((float)*(undefined8 *)(lVar1 + 0x218) - (float)*(undefined8 *)(lVar1 + 0x210))) /
      ((fVar12 - fVar19) * (fVar8 - fVar18)) < _DAT_7ff70cb1e8c8) {
    fVar13 = (float)(int)((fVar8 - fVar18) * _DAT_7ff70cb1e8d0);
    fVar14 = (float)(int)((fVar12 - fVar19) * _UNK_7ff70cb1e8d4);
    fVar15 = (float)(int)((fVar8 - fVar18) * _UNK_7ff70cb1e8d8);
    fVar16 = (float)(int)((fVar12 - fVar19) * _UNK_7ff70cb1e8dc);
    auVar9._0_4_ = fVar18 + fVar13;
    auVar9._4_4_ = fVar19 + fVar14;
    auVar9._8_4_ = fVar8 + fVar15;
    auVar9._12_4_ = fVar12 + fVar16;
    auVar11._4_4_ = fVar19 - fVar14;
    auVar11._0_4_ = fVar18 - fVar13;
    auVar11._8_4_ = fVar8 - fVar15;
    auVar11._12_4_ = fVar12 - fVar16;
    auStack_78 = blendps(auVar9,auVar11,3);
  }
  cVar5 = FUN_7ff70c837800(auStack_78,param_1,0,0);
  uStack_a8 = 0;
  uVar7 = FUN_7ff70c8782e0(auStack_78,param_1,&cStack_79,&bStack_7a);
  if (cVar5 != '\0') {
    uVar7 = uVar7 & 0xffffffff;
    uVar6 = FUN_7ff70c80a070(bStack_7a | 0x16);
    if (cStack_79 == '\x01') {
      uStack_a0 = 0;
      uStack_a8 = 0;
      FUN_7ff70c7bd960(*(undefined8 *)(lVar1 + 0x2c8),&uStack_60,&uStack_58,uVar6);
    }
    FUN_7ff70c80dff0(&uStack_60,param_1,2);
    uVar6 = FUN_7ff70c80a070(0);
    fVar8 = *(float *)(lVar4 + 0x1130) * _DAT_7ff70cb1ba70 * _DAT_7ff70cb1e8e0 + _DAT_7ff70cb1bae8;
    fVar12 = ((float)uStack_58 + (float)uStack_60) * _DAT_7ff70cb1ba80 + _DAT_7ff70cb1baf0;
    fVar18 = ((float)((ulonglong)uStack_58 >> 0x20) + (float)((ulonglong)uStack_60 >> 0x20)) *
             _UNK_7ff70cb1ba84 + _UNK_7ff70cb1baf4;
    fVar19 = _UNK_7ff70cb1ba88 * 0.0 + _UNK_7ff70cb1baf8;
    fVar13 = _UNK_7ff70cb1ba8c * 0.0 + _UNK_7ff70cb1bafc;
    fVar14 = fVar12 - fVar8;
    fVar15 = fVar18 - fVar8;
    fVar16 = fVar19 - 0.0;
    fVar20 = fVar13 - 0.0;
    uStack_88 = CONCAT44(fVar15,fVar14);
    auVar17._0_8_ = CONCAT44(fVar18 + fVar8,fVar12 + fVar8);
    auVar17._8_4_ = fVar19 + 0.0;
    auVar17._12_4_ = fVar13 + 0.0;
    uStack_a8 = 0x3f800000;
    uStack_90 = auVar17._0_8_;
    FUN_7ff70c7bd6c0(*(undefined8 *)(lVar1 + 0x2c8),&uStack_90,&uStack_88,uVar6);
    auVar10._4_4_ = fVar15;
    auVar10._0_4_ = fVar14;
    auVar10._8_4_ = fVar16;
    auVar10._12_4_ = fVar20;
    auVar11 = blendps(auVar10,auVar17,2);
    uStack_88 = auVar11._0_8_;
    auVar3._4_4_ = fVar15;
    auVar3._0_4_ = fVar14;
    auVar3._8_4_ = fVar16;
    auVar3._12_4_ = fVar20;
    auVar11 = blendps(auVar17,auVar3,2);
    uStack_90 = auVar11._0_8_;
    uStack_a8 = 0x3f800000;
    FUN_7ff70c7bd6c0(*(undefined8 *)(lVar1 + 0x2c8),&uStack_90,&uStack_88,uVar6);
  }
  if (_DAT_7ff70cbebd80 == (uStack_50 ^ (ulonglong)auStack_c8)) {
    return uVar7;
  }
  FUN_7ff70caa97e0(uStack_50 ^ (ulonglong)auStack_c8);
  pcVar2 = (code *)swi(3);
  uVar7 = (*pcVar2)();
  return uVar7;
}


