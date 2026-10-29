/* 7ff70c83ad40 FUN_7ff70c83ad40 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c83ad40(longlong param_1)

{
  int iVar1;
  longlong lVar2;
  longlong lVar3;
  code *pcVar4;
  longlong lVar5;
  undefined1 auStack_48 [40];
  ulonglong uStack_20;
  
  uStack_20 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_48;
  *(undefined1 *)(param_1 + 0xcc) = 1;
  iVar1 = *(int *)(param_1 + 0x1b0);
  if ((longlong)iVar1 != 0) {
    lVar2 = *(longlong *)(param_1 + 0x1b8);
    lVar5 = 0;
    do {
      lVar3 = *(longlong *)(lVar2 + lVar5);
      if (*(char *)(lVar3 + 0xd4) == '\0') {
        *(undefined1 *)(lVar3 + 0xd2) = 1;
        *(undefined1 *)(lVar3 + 0xcc) = 1;
        FUN_7ff70c83ad40();
      }
      lVar5 = lVar5 + 8;
    } while ((longlong)iVar1 * 8 != lVar5);
  }
  if (_DAT_7ff70cbebd80 == (uStack_20 ^ (ulonglong)auStack_48)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_20 ^ (ulonglong)auStack_48);
  pcVar4 = (code *)swi(3);
  (*pcVar4)();
  return;
}


