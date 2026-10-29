/* 7ff70c847630 FUN_7ff70c847630 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulonglong FUN_7ff70c847630(int param_1,ulonglong param_2,int param_3)

{
  longlong lVar1;
  float fVar2;
  float fVar3;
  float fVar4;
  code *pcVar5;
  uint uVar6;
  uint uVar7;
  ulonglong uVar8;
  ulonglong uVar9;
  ulonglong uVar10;
  uint uVar11;
  float fVar12;
  undefined1 auVar13 [16];
  undefined1 auVar14 [16];
  undefined1 auStack_28 [32];
  ulonglong uStack_8;
  
  uStack_8 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_28;
  uVar8 = (ulonglong)param_1;
  if ((*(char *)(_DAT_7ff70cc1a3c0 + 0xe8 + uVar8) == '\x01') &&
     (fVar2 = *(float *)(_DAT_7ff70cc1a3c0 + 0xb6c + uVar8 * 4), 0.0 <= fVar2)) {
    if ((fVar2 != 0.0) || (NAN(fVar2))) {
      if ((((param_2 & 1) == 0) || (fVar3 = *(float *)(_DAT_7ff70cc1a3c0 + 0x74), fVar2 <= fVar3))
         || (fVar12 = fVar2 - *(float *)(_DAT_7ff70cc1a3c0 + 0x20), fVar2 <= fVar12))
      goto LAB_7ff70c84766a;
      fVar4 = *(float *)(_DAT_7ff70cc1a3c0 + 0x78);
      uVar8 = 0;
      if (fVar4 <= 0.0) {
        uVar9 = uVar8;
        if ((fVar2 < fVar3) || (uVar9 = 0, fVar3 <= fVar12)) goto LAB_7ff70c84766c;
      }
      else {
        auVar13 = insertps(ZEXT416((uint)fVar2),ZEXT416((uint)fVar12),0x10);
        auVar14._0_4_ = auVar13._0_4_ - fVar3;
        auVar14._4_4_ = auVar13._4_4_ - fVar3;
        auVar14._8_4_ = auVar13._8_4_ - 0.0;
        auVar14._12_4_ = auVar13._12_4_ - 0.0;
        auVar13._4_4_ = fVar4;
        auVar13._0_4_ = fVar4;
        auVar13._8_8_ = 0;
        auVar13 = divps(auVar14,auVar13);
        uVar11 = -(uint)(((int)((uint)(fVar12 < fVar3) << 0x1f) >> 0x1f | (int)auVar13._4_4_) <
                        ((int)((uint)(fVar2 < fVar3) << 0x1f) >> 0x1f | (int)auVar13._0_4_));
        uVar8 = (ulonglong)uVar11;
        if ((uVar11 & 1) == 0) goto LAB_7ff70c84766a;
      }
    }
    uVar11 = param_1 + 0x290;
    uVar10 = (ulonglong)uVar11;
    if (0x9a < param_1 + 0x90U) {
      uVar9 = CONCAT71((int7)(uVar8 >> 8),1);
      if (POPCOUNT(uVar11) != 1) goto LAB_7ff70c84766c;
      uVar6 = 0;
      for (uVar7 = uVar11; (uVar7 & 1) == 0; uVar7 = uVar7 >> 1 | 0x80000000) {
        uVar6 = uVar6 + 1;
      }
      if ((uVar6 & 0x1c) != 0xc) goto LAB_7ff70c84766c;
    }
    if (((*(char *)(_DAT_7ff70cc1a3c0 + 0x1dd4) != '\x01') || (0x77 < param_1 + 0x90U)) ||
       ((param_3 == 0 || (param_3 == *(int *)(_DAT_7ff70cc1a3c0 + 0x14b4))))) {
      if (POPCOUNT(uVar11) == 1 && (uVar11 & 0xf000) != 0) {
        uVar6 = 0;
        for (; (uVar11 & 1) == 0; uVar11 = uVar11 >> 1 | 0x80000000) {
          uVar6 = uVar6 + 1;
        }
        if ((uVar6 & 0x1c) == 0xc) {
          uVar10 = (ulonglong)(uVar6 + 0x28b);
        }
      }
      uVar9 = uVar10 * 3;
      lVar1 = _DAT_7ff70cc1a3c0 + uVar10 * 0xc;
      if (param_3 == 0) {
        uVar9 = CONCAT71((int7)(uVar9 >> 8),*(char *)(lVar1 + -0x2c4) == '\0');
      }
      else if ((*(int *)(lVar1 + -0x2cc) == param_3) ||
              ((uVar9 = 0, *(int *)(lVar1 + -0x2cc) == -1 && (*(char *)(lVar1 + -0x2c4) == '\0'))))
      {
        uVar9 = CONCAT71((int7)(uVar9 >> 8),1);
      }
      goto LAB_7ff70c84766c;
    }
  }
LAB_7ff70c84766a:
  uVar9 = 0;
LAB_7ff70c84766c:
  if (_DAT_7ff70cbebd80 != (uStack_8 ^ (ulonglong)auStack_28)) {
    FUN_7ff70caa97e0(uStack_8 ^ (ulonglong)auStack_28);
    pcVar5 = (code *)swi(3);
    uVar8 = (*pcVar5)();
    return uVar8;
  }
  return uVar9;
}


