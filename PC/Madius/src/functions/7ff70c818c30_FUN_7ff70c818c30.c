/* 7ff70c818c30 FUN_7ff70c818c30 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c818c30(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  float *pfVar1;
  longlong lVar2;
  code *pcVar3;
  longlong lVar4;
  short sVar5;
  uint uVar6;
  undefined *puVar7;
  float fVar8;
  float fVar9;
  undefined8 uVar10;
  float fVar11;
  undefined8 uStackX_10;
  undefined8 uStackX_18;
  undefined8 uStackX_20;
  undefined1 auStack_78 [40];
  undefined8 *puStack_50;
  undefined1 auStack_48 [32];
  ulonglong uStack_28;
  
  lVar4 = _DAT_7ff70cc1a3c0;
  uStack_28 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_78;
  if ((*(char *)(_DAT_7ff70cc1a3c0 + 0x21b1) == '\0') &&
     (*(char *)(_DAT_7ff70cc1a3c0 + 0x21b2) != '\x01')) {
    puVar7 = &UNK_7ff70cb88969;
  }
  else {
    uVar6 = *(uint *)(_DAT_7ff70cc1a3c0 + 0x1e70);
    if ((uVar6 & 1) == 0) {
      fVar8 = *(float *)(_DAT_7ff70cc1a3c0 + 0xd44);
      pfVar1 = (float *)(_DAT_7ff70cc1a3c0 + 0xe4);
      if (*(int *)(_DAT_7ff70cc1a3c0 + 0xf8) == 1) {
        fVar11 = fVar8 * 0.0;
        uVar10 = _DAT_7ff70cb1d730;
        fVar9 = _DAT_7ff70cb1d728;
      }
      else {
        fVar11 = fVar8 * _DAT_7ff70cb1d724;
        uVar10 = 0;
        fVar9 = _DAT_7ff70cb1d720;
      }
      uVar6 = uVar6 | 1;
      *(float *)(_DAT_7ff70cc1a3c0 + 0x1e80) = *(float *)(_DAT_7ff70cc1a3c0 + 0xe0) + fVar11;
      *(float *)(lVar4 + 0x1e84) = *pfVar1 + fVar9 * fVar8;
      *(undefined8 *)(lVar4 + 0x1e88) = uVar10;
      *(undefined4 *)(lVar4 + 0x1e74) = 1;
    }
    fVar8 = *(float *)(lVar4 + 0xda0) * _DAT_7ff70cb1d740;
    *(uint *)(lVar4 + 0x1e70) = uVar6 | 0x40;
    *(float *)(lVar4 + 0x1ed8) = fVar8;
    puVar7 = &UNK_7ff70cb88951;
  }
  uStackX_10 = param_2;
  uStackX_18 = param_3;
  uStackX_20 = param_4;
  puStack_50 = &uStackX_10;
  FUN_7ff70c802a20(auStack_48,0x20,puVar7,(int)*(short *)(lVar4 + 0x25a2));
  lVar2 = *(longlong *)(lVar4 + 0x25a8);
  if ((lVar2 != 0) && (*(char *)(lVar2 + 0xcc) == '\x01')) {
    *(undefined1 *)(lVar2 + 0xd1) = 1;
    *(undefined1 *)(lVar2 + 0xd4) = 1;
    *(undefined1 *)(lVar2 + 0xec) = 1;
    sVar5 = *(short *)(lVar4 + 0x25a2) + 1;
    *(short *)(lVar4 + 0x25a2) = sVar5;
    FUN_7ff70c802a20(auStack_48,0x20,puVar7,(int)sVar5);
  }
  FUN_7ff70c826d00(auStack_48,0,0x2030347);
  FUN_7ff70c876ee0(param_1,&uStackX_10);
  FUN_7ff70c833070();
  if (_DAT_7ff70cbebd80 == (uStack_28 ^ (ulonglong)auStack_78)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_28 ^ (ulonglong)auStack_78);
  pcVar3 = (code *)swi(3);
  (*pcVar3)();
  return;
}


