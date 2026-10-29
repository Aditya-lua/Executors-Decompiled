/* 7ff70c84bfb0 FUN_7ff70c84bfb0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulonglong FUN_7ff70c84bfb0(void)

{
  longlong lVar1;
  code *pcVar2;
  longlong lVar3;
  float fVar4;
  float fVar5;
  ulonglong uVar6;
  undefined1 auStack_28 [32];
  ulonglong uStack_8;
  
  uStack_8 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_28;
  if ((*(byte *)(_DAT_7ff70cc1a3c0 + 0x1de8) & 1) == 0) {
    fVar5 = *(float *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440) + 0x1e8);
  }
  else {
    fVar5 = *(float *)(_DAT_7ff70cc1a3c0 + 0x1e00);
  }
  if (fVar5 < 0.0) {
    lVar1 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
    lVar3 = 0x248;
    if ((*(longlong *)(lVar1 + 0x1c8) == 0) && (*(longlong *)(_DAT_7ff70cc1a3c0 + 0x2278) == 0)) {
      lVar3 = 0x278;
    }
    fVar4 = fVar5 + (*(float *)(lVar1 + lVar3) - *(float *)(lVar1 + 0x118));
    fVar5 = _DAT_7ff70cb1ba2c;
    if (_DAT_7ff70cb1ba2c <= fVar4) {
      fVar5 = fVar4;
    }
  }
  if (_DAT_7ff70cbebd80 == (uStack_8 ^ (ulonglong)auStack_28)) {
    return (ulonglong)(uint)(float)(int)fVar5;
  }
  FUN_7ff70caa97e0(uStack_8 ^ (ulonglong)auStack_28);
  pcVar2 = (code *)swi(3);
  uVar6 = (*pcVar2)();
  return uVar6;
}


