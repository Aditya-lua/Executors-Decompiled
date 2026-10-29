/* 7ff70c819100 FUN_7ff70c819100 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_7ff70c819100(float *param_1,int param_2)

{
  longlong lVar1;
  code *pcVar2;
  undefined8 uVar3;
  undefined1 auStack_28 [32];
  ulonglong uStack_8;
  
  uStack_8 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_28;
  lVar1 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
  if (((((*(float *)(lVar1 + 0x264) <= param_1[3] && param_1[3] != *(float *)(lVar1 + 0x264)) &&
        (param_1[1] <= *(float *)(lVar1 + 0x26c) && *(float *)(lVar1 + 0x26c) != param_1[1])) &&
       (*(float *)(lVar1 + 0x260) <= param_1[2] && param_1[2] != *(float *)(lVar1 + 0x260))) &&
      (*param_1 <= *(float *)(lVar1 + 0x268) && *(float *)(lVar1 + 0x268) != *param_1)) ||
     (((param_2 != 0 &&
       (((param_2 == *(int *)(_DAT_7ff70cc1a3c0 + 0x14b4) ||
         (param_2 == *(int *)(_DAT_7ff70cc1a3c0 + 0x14e4))) ||
        ((param_2 == *(int *)(_DAT_7ff70cc1a3c0 + 0x1f94) ||
         (param_2 == *(int *)(_DAT_7ff70cc1a3c0 + 0x1fa8))))))) ||
      (uVar3 = CONCAT71((int7)((ulonglong)lVar1 >> 8),1),
      *(char *)(_DAT_7ff70cc1a3c0 + 0x14b2) == '\x01')))) {
    uVar3 = 0;
  }
  if (_DAT_7ff70cbebd80 == (uStack_8 ^ (ulonglong)auStack_28)) {
    return uVar3;
  }
  FUN_7ff70caa97e0(uStack_8 ^ (ulonglong)auStack_28);
  pcVar2 = (code *)swi(3);
  uVar3 = (*pcVar2)();
  return uVar3;
}


