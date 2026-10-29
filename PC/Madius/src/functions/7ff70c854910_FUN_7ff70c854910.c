/* 7ff70c854910 FUN_7ff70c854910 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c854910(undefined4 param_1,undefined4 param_2,uint param_3,undefined4 param_4)

{
  code *pcVar1;
  longlong lVar2;
  undefined1 auStack_28 [32];
  ulonglong uStack_8;
  
  lVar2 = _DAT_7ff70cc1a3c0;
  uStack_8 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_28;
  *(undefined2 *)(_DAT_7ff70cc1a3c0 + 0x2029) = 0x100;
  *(undefined1 *)(lVar2 + 0x2028) = 0;
  *(undefined1 *)(lVar2 + 0x1fe9) = *(undefined1 *)(lVar2 + 0x1fea);
  *(undefined4 *)(lVar2 + 0x2038) = param_1;
  *(undefined4 *)(lVar2 + 0x2040) = param_2;
  *(uint *)(lVar2 + 0x202c) = param_3 | 0x80;
  *(undefined4 *)(lVar2 + 0x2030) = param_4;
  if (_DAT_7ff70cbebd80 == (uStack_8 ^ (ulonglong)auStack_28)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_8 ^ (ulonglong)auStack_28);
  pcVar1 = (code *)swi(3);
  (*pcVar1)();
  return;
}


