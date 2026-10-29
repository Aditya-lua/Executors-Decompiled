/* 7ff70c834f40 FUN_7ff70c834f40 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulonglong FUN_7ff70c834f40(int param_1,char param_2)

{
  float fVar1;
  float fVar2;
  float fVar3;
  code *pcVar4;
  uint uVar5;
  uint uVar6;
  ulonglong uVar7;
  undefined7 uVar8;
  ulonglong uVar9;
  uint uVar10;
  float fVar11;
  undefined1 auVar12 [16];
  undefined1 auVar13 [16];
  undefined1 auStack_28 [32];
  ulonglong uStack_8;
  
  uStack_8 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_28;
  uVar7 = (ulonglong)param_1;
  if ((*(char *)(_DAT_7ff70cc1a3c0 + 0xe8 + uVar7) != '\x01') ||
     (fVar1 = *(float *)(_DAT_7ff70cc1a3c0 + 0xb6c + uVar7 * 4), fVar1 < 0.0)) {
LAB_7ff70c834f7a:
    uVar7 = 0;
    goto LAB_7ff70c834f7c;
  }
  if ((fVar1 != 0.0) || (NAN(fVar1))) {
    if (((param_2 == '\0') || (fVar2 = *(float *)(_DAT_7ff70cc1a3c0 + 0x74), fVar1 <= fVar2)) ||
       (fVar11 = fVar1 - *(float *)(_DAT_7ff70cc1a3c0 + 0x20), fVar1 <= fVar11))
    goto LAB_7ff70c834f7a;
    fVar3 = *(float *)(_DAT_7ff70cc1a3c0 + 0x78);
    uVar7 = 0;
    if (fVar3 <= 0.0) {
      if ((fVar1 < fVar2) || (fVar2 <= fVar11)) goto LAB_7ff70c834f7c;
    }
    else {
      auVar12 = insertps(ZEXT416((uint)fVar1),ZEXT416((uint)fVar11),0x10);
      auVar13._0_4_ = auVar12._0_4_ - fVar2;
      auVar13._4_4_ = auVar12._4_4_ - fVar2;
      auVar13._8_4_ = auVar12._8_4_ - 0.0;
      auVar13._12_4_ = auVar12._12_4_ - 0.0;
      auVar12._4_4_ = fVar3;
      auVar12._0_4_ = fVar3;
      auVar12._8_8_ = 0;
      auVar12 = divps(auVar13,auVar12);
      uVar10 = -(uint)(((int)((uint)(fVar11 < fVar2) << 0x1f) >> 0x1f | (int)auVar12._4_4_) <
                      ((int)((uint)(fVar1 < fVar2) << 0x1f) >> 0x1f | (int)auVar12._0_4_));
      uVar7 = (ulonglong)uVar10;
      if ((uVar10 & 1) == 0) goto LAB_7ff70c834f7a;
    }
  }
  uVar10 = param_1 + 0x290;
  uVar9 = (ulonglong)uVar10;
  uVar8 = (undefined7)(uVar7 >> 8);
  uVar7 = CONCAT71(uVar8,POPCOUNT(uVar10) == 1);
  if (0x9a < param_1 + 0x90U) {
    uVar7 = CONCAT71(uVar8,1);
    if (POPCOUNT(uVar10) != 1) goto LAB_7ff70c834f7c;
    uVar5 = 0;
    for (uVar6 = uVar10; (uVar6 & 1) == 0; uVar6 = uVar6 >> 1 | 0x80000000) {
      uVar5 = uVar5 + 1;
    }
    uVar7 = CONCAT71(uVar8,1);
    if ((uVar5 & 0x1c) != 0xc) goto LAB_7ff70c834f7c;
  }
  if (((uVar10 & 0xf000) != 0 & (byte)uVar7) == 1) {
    uVar5 = 0;
    for (uVar6 = uVar10; (uVar6 & 1) == 0; uVar6 = uVar6 >> 1 | 0x80000000) {
      uVar5 = uVar5 + 1;
    }
    uVar9 = (ulonglong)uVar10;
    if ((uVar5 & 0x1c) == 0xc) {
      uVar9 = (ulonglong)(uVar5 + 0x28b);
    }
  }
  uVar7 = CONCAT71((int7)(uVar9 * 3 >> 8),
                   *(char *)(_DAT_7ff70cc1a3c0 + -0x2c4 + uVar9 * 0xc) == '\0');
LAB_7ff70c834f7c:
  if (_DAT_7ff70cbebd80 != (uStack_8 ^ (ulonglong)auStack_28)) {
    FUN_7ff70caa97e0(uStack_8 ^ (ulonglong)auStack_28);
    pcVar4 = (code *)swi(3);
    uVar7 = (*pcVar4)();
    return uVar7;
  }
  return uVar7;
}


