/* 7ff70c7b5660 FUN_7ff70c7b5660 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c7b5660(longlong param_1,float param_2)

{
  code *pcVar1;
  float fVar2;
  undefined4 uVar3;
  float fVar4;
  float fVar5;
  float fVar6;
  undefined1 uVar7;
  uint uVar8;
  code **ppcVar9;
  longlong lVar10;
  longlong lVar11;
  float fVar12;
  float fVar13;
  undefined1 auVar14 [16];
  code *pcStack_88;
  undefined1 auStack_80 [32];
  ulonglong uStack_60;
  
  pcVar1 = pcStack_88;
  ppcVar9 = &pcStack_88;
  uStack_60 = _DAT_7ff70cbebd80 ^ (ulonglong)&pcStack_88;
  if ((*(float *)(param_1 + 0x2c) != param_2) || (NAN(*(float *)(param_1 + 0x2c)) || NAN(param_2)))
  {
    *(float *)(param_1 + 0x2c) = param_2;
    *(undefined1 *)(param_1 + 500) = 0x30;
    fVar5 = _DAT_7ff70cb1ba2c;
    ppcVar9 = (code **)auStack_80;
    pcStack_88 = (code *)0x7ff70c7b56b4;
    func_0x7ff70d9b1f76();
    fVar6 = _DAT_7ff70cb1ba2c;
    fVar4 = _DAT_7ff70cb1ba28;
    uVar3 = _DAT_7ff70cb1ba24;
    fVar2 = _DAT_7ff70cb1ba20;
    lVar10 = 0;
    do {
      lVar11 = lVar10 + 1;
      fVar12 = (float)(int)lVar11;
      fVar13 = *(float *)(param_1 + 0x2c);
      if (fVar12 <= *(float *)(param_1 + 0x2c)) {
        fVar13 = fVar12;
      }
      pcStack_88 = (code *)0x7ff70c7b56f3;
      fVar13 = (float)(*pcVar1)(fVar5 - fVar13 / fVar12);
      auVar14._4_4_ = uVar3;
      auVar14._0_4_ = fVar2 / fVar13;
      auVar14._8_4_ = fVar4;
      auVar14._12_4_ = fVar6;
      auVar14 = roundss(ZEXT816(0),auVar14,10);
      uVar8 = ((int)auVar14._0_4_ - ((int)auVar14._0_4_ + 1 >> 0x1f)) + 1U & 0xfffffffe;
      if ((int)uVar8 < 5) {
        uVar8 = 4;
      }
      uVar7 = (undefined1)uVar8;
      if (0x1ff < (int)uVar8) {
        uVar7 = 0;
      }
      *(undefined1 *)(param_1 + 0x1f5 + lVar10) = uVar7;
      lVar10 = lVar11;
    } while (lVar11 != 0x3f);
    *(float *)(param_1 + 0x1f0) = *(float *)(param_1 + 0x2c) / _DAT_7ff70cb1ba28;
  }
  if (_DAT_7ff70cbebd80 == (*(ulonglong *)((longlong)ppcVar9 + 0x28) ^ (ulonglong)ppcVar9)) {
    return;
  }
  *(undefined8 *)((longlong)ppcVar9 + -8) = 0x7ff70c7b577f;
  FUN_7ff70caa97e0(*(ulonglong *)((longlong)ppcVar9 + 0x28) ^ (ulonglong)ppcVar9);
  pcVar1 = (code *)swi(3);
  (*pcVar1)();
  return;
}


