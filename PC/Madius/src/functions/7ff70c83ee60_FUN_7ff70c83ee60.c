/* 7ff70c83ee60 FUN_7ff70c83ee60 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c83ee60(longlong *param_1)

{
  undefined8 *puVar1;
  undefined8 uVar2;
  uint uVar4;
  longlong lVar5;
  code *pcVar6;
  float fVar7;
  float fVar8;
  float fVar9;
  longlong lVar10;
  undefined1 uVar11;
  undefined1 auStack_28 [32];
  ulonglong uStack_8;
  undefined8 uVar3;
  
  lVar10 = _DAT_7ff70cc1a3c0;
  uStack_8 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_28;
  *(undefined1 *)(_DAT_7ff70cc1a3c0 + 0x2029) = 0;
  lVar5 = *(longlong *)(lVar10 + 0x1440);
  *param_1 = lVar5;
  *(undefined4 *)(param_1 + 1) = *(undefined4 *)(lVar10 + 0x1e20);
  *(undefined4 *)((longlong)param_1 + 0xc) = *(undefined4 *)(lVar10 + 0x1ddc);
  uVar4 = *(uint *)(lVar10 + 0x1e24);
  *(uint *)(param_1 + 4) = uVar4;
  puVar1 = (undefined8 *)(lVar5 + 0x128);
  uVar2 = *puVar1;
  uVar3 = *puVar1;
  fVar7 = *(float *)(lVar10 + 0x1e40);
  fVar8 = *(float *)(lVar10 + 0x1e44);
  fVar9 = *(float *)(lVar10 + 0x1e48);
  *(float *)(param_1 + 2) = *(float *)(lVar10 + 0x1e3c) - (float)uVar2;
  *(float *)((longlong)param_1 + 0x14) = fVar7 - (float)((ulonglong)uVar2 >> 0x20);
  *(float *)(param_1 + 3) = fVar8 - (float)uVar3;
  *(float *)((longlong)param_1 + 0x1c) = fVar9 - (float)((ulonglong)uVar3 >> 0x20);
  if ((uVar4 & 0x200000) != 0) {
    param_1[6] = *(longlong *)(lVar10 + 0x1df8);
  }
  uVar11 = 1;
  if (*(char *)(_DAT_7ff70cc1a3c0 + 0x2029) == '\0') {
    uVar11 = *(undefined1 *)(_DAT_7ff70cc1a3c0 + 0x1fea);
  }
  *(undefined1 *)(_DAT_7ff70cc1a3c0 + 0x1fe9) = uVar11;
  if (_DAT_7ff70cbebd80 == (uStack_8 ^ (ulonglong)auStack_28)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_8 ^ (ulonglong)auStack_28);
  pcVar6 = (code *)swi(3);
  (*pcVar6)();
  return;
}


