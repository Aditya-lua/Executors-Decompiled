/* 7ff70c8a0a60 FUN_7ff70c8a0a60 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c8a0a60(undefined4 param_1,longlong param_2)

{
  undefined8 uVar1;
  code *pcVar2;
  longlong lVar3;
  float fVar4;
  float fVar5;
  undefined1 auStack_28 [32];
  ulonglong uStack_8;
  
  lVar3 = _DAT_7ff70cc1a3c0;
  uStack_8 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_28;
  *(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2330) = param_1;
  *(undefined1 *)(lVar3 + 0x2335) = 1;
  *(bool *)(lVar3 + 0x2336) = param_2 == -1;
  *(bool *)(lVar3 + 0x2337) = param_2 == -1;
  *(undefined2 *)(lVar3 + 0x233c) = *(undefined2 *)(lVar3 + 0x100);
  uVar1 = *(undefined8 *)(*(longlong *)(lVar3 + 0x1440) + 0x128);
  fVar4 = (float)*(undefined8 *)(lVar3 + 0xe0) - (float)uVar1;
  fVar5 = (float)((ulonglong)*(undefined8 *)(lVar3 + 0xe0) >> 0x20) -
          (float)((ulonglong)uVar1 >> 0x20);
  *(float *)(lVar3 + 0x2340) = fVar4;
  *(float *)(lVar3 + 0x2344) = fVar5;
  *(float *)(lVar3 + 0x2348) = fVar4;
  *(float *)(lVar3 + 0x234c) = fVar5;
  *(undefined8 *)(lVar3 + 0x2350) = 0;
  if (_DAT_7ff70cbebd80 == (uStack_8 ^ (ulonglong)auStack_28)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_8 ^ (ulonglong)auStack_28);
  pcVar2 = (code *)swi(3);
  (*pcVar2)();
  return;
}


