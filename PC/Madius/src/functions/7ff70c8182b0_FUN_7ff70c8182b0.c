/* 7ff70c8182b0 FUN_7ff70c8182b0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_7ff70c8182b0(longlong param_1,ulonglong param_2)

{
  longlong lVar1;
  code *pcVar2;
  undefined8 uVar3;
  longlong lVar4;
  undefined1 auStack_28 [32];
  ulonglong uStack_8;
  
  uStack_8 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_28;
  uVar3 = CONCAT71((int7)((ulonglong)_DAT_7ff70cc1a3c0 >> 8),1);
  if ((((*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1f98) != 0) &&
       (lVar1 = *(longlong *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1f98) + 0x3c0), lVar1 != 0)) &&
      (*(char *)(lVar1 + 0xcd) == '\x01')) &&
     (lVar4 = *(longlong *)(param_1 + 0x3c0), lVar1 != lVar4)) {
    if ((((*(uint *)(lVar1 + 0x14) & 0x8000000) != 0) ||
        (((param_2 & 0x20) == 0 && ((*(uint *)(lVar1 + 0x14) & 0x4000000) != 0)))) &&
       (*(longlong *)(lVar4 + 0x3c0) != lVar1)) {
      do {
        uVar3 = CONCAT71((int7)((ulonglong)uVar3 >> 8),lVar4 == lVar1);
        if (lVar4 == lVar1) break;
        lVar4 = *(longlong *)(lVar4 + 0x3b8);
      } while (lVar4 != 0);
    }
  }
  if (_DAT_7ff70cbebd80 == (uStack_8 ^ (ulonglong)auStack_28)) {
    return uVar3;
  }
  FUN_7ff70caa97e0(uStack_8 ^ (ulonglong)auStack_28);
  pcVar2 = (code *)swi(3);
  uVar3 = (*pcVar2)();
  return uVar3;
}


