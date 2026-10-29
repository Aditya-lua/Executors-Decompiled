/* 7ff70c83d9b0 FUN_7ff70c83d9b0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c83d9b0(undefined8 *param_1,int param_2,undefined8 *param_3)

{
  code *pcVar1;
  longlong lVar2;
  undefined1 auStack_28 [32];
  ulonglong uStack_8;
  
  lVar2 = _DAT_7ff70cc1a3c0;
  uStack_8 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_28;
  *(uint *)(_DAT_7ff70cc1a3c0 + 0x1e70) = *(uint *)(_DAT_7ff70cc1a3c0 + 0x1e70) | 1;
  *(undefined8 *)(lVar2 + 0x1e80) = *param_1;
  *(undefined8 *)(lVar2 + 0x1e88) = *param_3;
  *(uint *)(lVar2 + 0x1e74) = param_2 + (uint)(param_2 == 0);
  if (_DAT_7ff70cbebd80 == (uStack_8 ^ (ulonglong)auStack_28)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_8 ^ (ulonglong)auStack_28);
  pcVar1 = (code *)swi(3);
  (*pcVar1)();
  return;
}


