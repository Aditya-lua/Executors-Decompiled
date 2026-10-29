/* 7ff70c879d70 FUN_7ff70c879d70 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c879d70(uint param_1)

{
  longlong lVar1;
  code *pcVar2;
  undefined4 uVar3;
  undefined *puVar4;
  longlong lVar5;
  float fVar6;
  undefined1 auVar7 [16];
  float fVar8;
  undefined1 auStack_78 [32];
  longlong lStack_58;
  longlong lStack_50;
  uint uStack_48;
  longlong lStack_38;
  float fStack_30;
  float fStack_2c;
  float fStack_28;
  float fStack_24;
  ulonglong uStack_20;
  
  uStack_20 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_78;
  lVar1 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
  puVar4 = &UNK_7ff70cb89610;
  if (param_1 == 0) {
    puVar4 = &UNK_7ff70cb8969e;
  }
  uVar3 = FUN_7ff70c8165d0(lVar1,puVar4,0);
  fStack_30 = (float)(int)(*(float *)(lVar1 + 100) * _DAT_7ff70cb1ba70 + _DAT_7ff70cb1ba70);
  fStack_2c = 0.0;
  if ((*(uint *)(lVar1 + 0x14) & 0x400) != 0) {
    fStack_2c = (float)(int)(*(float *)(_DAT_7ff70cc1a3c0 + 0xc98) * _DAT_7ff70cb1ba70 +
                            _DAT_7ff70cb1ba70);
  }
  fVar6 = *(float *)(lVar1 + 0xc0 + (longlong)(int)(param_1 ^ 1) * 4);
  if (param_1 == 0) {
    fStack_24 = (*(float *)(lVar1 + 0x34) + *(float *)(lVar1 + 0x2c)) - fStack_30;
    fStack_28 = *(float *)(lVar1 + 0x228) - fStack_30;
    fVar6 = fStack_24 - fVar6;
    fVar8 = *(float *)(lVar1 + 0x2c) + fStack_30;
    auVar7 = blendvps(ZEXT416((uint)fVar6),ZEXT416((uint)fVar8),ZEXT416(-(uint)(fVar6 <= fVar8)));
    fStack_2c = auVar7._0_4_;
    fStack_30 = fStack_30 + *(float *)(lVar1 + 0x220);
    uStack_48 = (*(byte *)(lVar1 + 0xc9) ^ 1) << 7 | 0x140;
  }
  else {
    fVar8 = *(float *)(lVar1 + 0x28);
    fStack_24 = *(float *)(lVar1 + 0x22c) - fStack_30;
    fStack_28 = (*(float *)(lVar1 + 0x30) + fVar8) - fStack_30;
    fStack_2c = fStack_2c + *(float *)(lVar1 + 0x224);
    fVar6 = fStack_28 - fVar6;
    auVar7 = blendvps(ZEXT416((uint)fVar6),ZEXT416((uint)fVar8),ZEXT416(-(uint)(fVar6 <= fVar8)));
    fStack_30 = auVar7._0_4_;
    uStack_48 = (*(byte *)(lVar1 + 200) ^ 1) * 0x80 +
                (uint)((*(uint *)(lVar1 + 0x14) & 0x401) == 1) * 0x20 + 0x100;
  }
  lVar5 = (longlong)(int)param_1;
  fVar6 = *(float *)(lVar1 + 0x58 + lVar5 * 4);
  lStack_38 = (longlong)*(float *)(lVar1 + 0x98 + lVar5 * 4);
  lStack_50 = (longlong)(fVar6 + fVar6 + *(float *)(lVar1 + 0x40 + lVar5 * 4));
  lStack_58 = (longlong)
              (*(float *)(lVar1 + 0x228 + lVar5 * 4) - *(float *)(lVar1 + 0x220 + lVar5 * 4));
  FUN_7ff70c879f80(&fStack_30,uVar3,param_1,&lStack_38);
  *(float *)(lVar1 + 0x98 + lVar5 * 4) = (float)lStack_38;
  if (_DAT_7ff70cbebd80 == (uStack_20 ^ (ulonglong)auStack_78)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_20 ^ (ulonglong)auStack_78);
  pcVar2 = (code *)swi(3);
  (*pcVar2)();
  return;
}


