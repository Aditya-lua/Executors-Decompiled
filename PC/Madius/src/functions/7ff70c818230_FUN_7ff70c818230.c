/* 7ff70c818230 FUN_7ff70c818230 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c818230(int param_1)

{
  code *pcVar1;
  longlong lVar2;
  undefined1 auStack_28 [32];
  ulonglong uStack_8;
  
  lVar2 = _DAT_7ff70cc1a3c0;
  uStack_8 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_28;
  if ((*(byte *)(_DAT_7ff70cc1a3c0 + 0x1e26) & 1) == 0) {
    if (((*(int *)(_DAT_7ff70cc1a3c0 + 0x14b4) == param_1) ||
        (*(int *)(_DAT_7ff70cc1a3c0 + 0x14b4) == 0)) &&
       (*(undefined2 *)(_DAT_7ff70cc1a3c0 + 0x14c4) = 0x101, *(int *)(lVar2 + 0x14e8) == param_1)) {
      *(undefined1 *)(lVar2 + 0x14f0) = 1;
    }
    *(byte *)(lVar2 + 0x1e28) = *(byte *)(lVar2 + 0x1e28) | 4;
  }
  if (_DAT_7ff70cbebd80 == (uStack_8 ^ (ulonglong)auStack_28)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_8 ^ (ulonglong)auStack_28);
  pcVar1 = (code *)swi(3);
  (*pcVar1)();
  return;
}


