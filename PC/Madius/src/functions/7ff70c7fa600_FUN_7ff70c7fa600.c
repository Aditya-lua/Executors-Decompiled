/* 7ff70c7fa600 FUN_7ff70c7fa600 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c7fa600(longlong param_1,undefined8 param_2,uint param_3,uint param_4,float param_5)

{
  code *pcVar1;
  longlong lVar2;
  int iVar3;
  int iVar4;
  int iVar5;
  float fVar6;
  float fVar8;
  undefined1 auVar7 [16];
  float fVar9;
  float fVar10;
  float fVar11;
  float fVar12;
  float fVar13;
  float fVar14;
  undefined1 auStack_c8 [40];
  ulonglong uStack_a0;
  
  uStack_a0 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_c8;
  fVar6 = *(float *)(*(longlong *)(param_1 + 0x38) + 0x20);
  if (param_4 < 4) {
    fVar9 = _DAT_7ff70cb1c644 * fVar6 * param_5;
    switch(param_4) {
    case 0:
      fVar9 = (float)((uint)fVar9 ^ _DAT_7ff70cb1ba60);
    case 1:
      fVar13 = _DAT_7ff70cb1c648 * fVar9;
      fVar14 = fVar9 * 0.0;
      fVar12 = _DAT_7ff70cb1c64c * fVar9;
      fVar10 = _UNK_7ff70cb1c650 * fVar9;
      fVar9 = fVar9 * _UNK_7ff70cb1c654;
      fVar11 = fVar10;
      break;
    case 2:
      fVar9 = (float)((uint)fVar9 ^ _DAT_7ff70cb1ba60);
    case 3:
      fVar13 = fVar9 * _UNK_7ff70cb1c660;
      fVar14 = fVar9 * _UNK_7ff70cb1c664;
      fVar12 = _UNK_7ff70cb1c650 * fVar9;
      fVar11 = _UNK_7ff70cb1c654 * fVar9;
      fVar10 = fVar9 * _DAT_7ff70cb1c64c;
      fVar9 = fVar12;
    }
  }
  else {
    fVar13 = 0.0;
    fVar14 = 0.0;
    fVar10 = 0.0;
    fVar12 = 0.0;
    fVar11 = 0.0;
    fVar9 = fVar12;
  }
  if (0xffffff < param_3) {
    fVar6 = fVar6 * _DAT_7ff70cb1ba70;
    auVar7 = insertps(ZEXT416((uint)fVar6),ZEXT416((uint)(param_5 * fVar6)),0x10);
    fVar6 = auVar7._0_4_ + (float)param_2;
    fVar8 = auVar7._4_4_ + (float)((ulonglong)param_2 >> 0x20);
    iVar4 = *(int *)(param_1 + 0x50);
    if (iVar4 == *(int *)(param_1 + 0x54)) {
      if (iVar4 == 0) {
        iVar3 = 8;
      }
      else {
        iVar3 = iVar4 / 2 + iVar4;
      }
      iVar5 = iVar4 + 1;
      if (iVar4 + 1 < iVar3) {
        iVar5 = iVar3;
      }
      lVar2 = FUN_7ff70c802100((longlong)iVar5 << 3);
      if (*(longlong *)(param_1 + 0x58) != 0) {
        FUN_7ff70cb12b60(lVar2,*(longlong *)(param_1 + 0x58),(longlong)*(int *)(param_1 + 0x50) << 3
                        );
        FUN_7ff70c802510(*(undefined8 *)(param_1 + 0x58));
      }
      *(longlong *)(param_1 + 0x58) = lVar2;
      *(int *)(param_1 + 0x54) = iVar5;
      iVar4 = *(int *)(param_1 + 0x50);
    }
    else {
      lVar2 = *(longlong *)(param_1 + 0x58);
    }
    *(ulonglong *)(lVar2 + (longlong)iVar4 * 8) = CONCAT44(fVar14 + fVar8,fVar13 + fVar6);
    iVar3 = *(int *)(param_1 + 0x50);
    iVar4 = iVar3 + 1;
    *(int *)(param_1 + 0x50) = iVar4;
    if (iVar4 == *(int *)(param_1 + 0x54)) {
      iVar3 = iVar3 + 2;
      if (iVar4 == 0) {
        iVar4 = 8;
      }
      else {
        iVar4 = iVar4 / 2 + iVar4;
      }
      if (iVar3 < iVar4) {
        iVar3 = iVar4;
      }
      lVar2 = FUN_7ff70c802100((longlong)iVar3 << 3);
      if (*(longlong *)(param_1 + 0x58) != 0) {
        FUN_7ff70cb12b60(lVar2,*(longlong *)(param_1 + 0x58),(longlong)*(int *)(param_1 + 0x50) << 3
                        );
        FUN_7ff70c802510(*(undefined8 *)(param_1 + 0x58));
      }
      *(longlong *)(param_1 + 0x58) = lVar2;
      *(int *)(param_1 + 0x54) = iVar3;
      iVar4 = *(int *)(param_1 + 0x50);
    }
    else {
      lVar2 = *(longlong *)(param_1 + 0x58);
    }
    *(float *)(lVar2 + (longlong)iVar4 * 8) = fVar11 + fVar6;
    *(float *)(lVar2 + 4 + (longlong)iVar4 * 8) = fVar12 + fVar8;
    iVar3 = *(int *)(param_1 + 0x50);
    iVar4 = iVar3 + 1;
    *(int *)(param_1 + 0x50) = iVar4;
    if (iVar4 == *(int *)(param_1 + 0x54)) {
      iVar3 = iVar3 + 2;
      if (iVar4 == 0) {
        iVar4 = 8;
      }
      else {
        iVar4 = iVar4 / 2 + iVar4;
      }
      if (iVar3 < iVar4) {
        iVar3 = iVar4;
      }
      lVar2 = FUN_7ff70c802100((longlong)iVar3 << 3);
      if (*(longlong *)(param_1 + 0x58) != 0) {
        FUN_7ff70cb12b60(lVar2,*(longlong *)(param_1 + 0x58),(longlong)*(int *)(param_1 + 0x50) << 3
                        );
        FUN_7ff70c802510(*(undefined8 *)(param_1 + 0x58));
      }
      *(longlong *)(param_1 + 0x58) = lVar2;
      *(int *)(param_1 + 0x54) = iVar3;
      iVar4 = *(int *)(param_1 + 0x50);
    }
    else {
      lVar2 = *(longlong *)(param_1 + 0x58);
    }
    *(float *)(lVar2 + (longlong)iVar4 * 8) = fVar6 + fVar10;
    *(float *)(lVar2 + 4 + (longlong)iVar4 * 8) = fVar8 + fVar9;
    iVar4 = *(int *)(param_1 + 0x50) + 1;
    *(int *)(param_1 + 0x50) = iVar4;
    FUN_7ff70c7b9fb0(param_1,*(undefined8 *)(param_1 + 0x58),iVar4,param_3);
    *(undefined4 *)(param_1 + 0x50) = 0;
  }
  if (_DAT_7ff70cbebd80 == (uStack_a0 ^ (ulonglong)auStack_c8)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_a0 ^ (ulonglong)auStack_c8);
  pcVar1 = (code *)swi(3);
  (*pcVar1)();
  return;
}


