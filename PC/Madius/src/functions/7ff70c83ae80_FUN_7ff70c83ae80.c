/* 7ff70c83ae80 FUN_7ff70c83ae80 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c83ae80(void)

{
  int iVar1;
  code *pcVar2;
  longlong lVar3;
  undefined1 auStack_28 [32];
  ulonglong uStack_8;
  
  lVar3 = _DAT_7ff70cc1a3c0;
  uStack_8 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_28;
  *(short *)(_DAT_7ff70cc1a3c0 + 0x25a0) = *(short *)(_DAT_7ff70cc1a3c0 + 0x25a0) + -1;
  iVar1 = *(int *)(lVar3 + 0x1f30);
  *(int *)(lVar3 + 0x1f30) = iVar1 + -1;
  *(undefined4 *)(lVar3 + 0x1de0) =
       *(undefined4 *)(*(longlong *)(lVar3 + 0x1f38) + -8 + (longlong)iVar1 * 4);
  *(undefined4 *)(lVar3 + 0xc4c) =
       *(undefined4 *)
        (*(longlong *)(lVar3 + 0x1418) + -8 + (longlong)*(int *)(lVar3 + 0x1410) * 0x78);
  if (_DAT_7ff70cbebd80 == (uStack_8 ^ (ulonglong)auStack_28)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_8 ^ (ulonglong)auStack_28);
  pcVar2 = (code *)swi(3);
  (*pcVar2)();
  return;
}


