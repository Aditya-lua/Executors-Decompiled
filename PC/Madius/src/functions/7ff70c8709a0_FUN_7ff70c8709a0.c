/* 7ff70c8709a0 FUN_7ff70c8709a0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c8709a0(longlong param_1,uint param_2)

{
  int iVar1;
  longlong lVar2;
  longlong lVar3;
  code *pcVar4;
  longlong lVar5;
  undefined1 auStack_48 [32];
  ulonglong uStack_28;
  
  uStack_28 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_48;
  lVar2 = **(longlong **)(_DAT_7ff70cc1a3c0 + 0x1f88);
  *(int *)(_DAT_7ff70cc1a3c0 + 0xc4) = *(int *)(_DAT_7ff70cc1a3c0 + 0xc4) + 1;
  lVar5 = *(longlong *)(param_1 + 0x2c8);
  if (1 < *(int *)(lVar5 + 0x8c)) {
    FUN_7ff70c7b6530(lVar5 + 0x88,lVar5);
    lVar5 = *(longlong *)(param_1 + 0x2c8);
  }
  FUN_7ff70c7c6a60(lVar2 + 0x58,*(undefined8 *)(lVar2 + 0xa0 + (ulonglong)param_2 * 8),lVar5);
  iVar1 = *(int *)(param_1 + 0x1b0);
  if ((longlong)iVar1 != 0) {
    lVar2 = *(longlong *)(param_1 + 0x1b8);
    lVar5 = 0;
    do {
      lVar3 = *(longlong *)(lVar2 + lVar5);
      if ((*(char *)(lVar3 + 0xcc) == '\x01') && (*(char *)(lVar3 + 0xd4) == '\0')) {
        FUN_7ff70c8709a0(lVar3,param_2);
      }
      lVar5 = lVar5 + 8;
    } while ((longlong)iVar1 * 8 != lVar5);
  }
  if (_DAT_7ff70cbebd80 == (uStack_28 ^ (ulonglong)auStack_48)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_28 ^ (ulonglong)auStack_48);
  pcVar4 = (code *)swi(3);
  (*pcVar4)();
  return;
}


