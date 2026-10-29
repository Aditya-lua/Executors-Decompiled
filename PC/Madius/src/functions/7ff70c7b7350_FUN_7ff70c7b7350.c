/* 7ff70c7b7350 FUN_7ff70c7b7350 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c7b7350(uint *param_1)

{
  bool bVar1;
  code *pcVar2;
  uint uVar3;
  uint uVar4;
  undefined1 auStack_28 [32];
  ulonglong uStack_8;
  
  uStack_8 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_28;
  if (0 < (int)*param_1) {
    uVar3 = *param_1;
    do {
      if ((*(int *)(*(longlong *)(param_1 + 2) + -0x20 + (ulonglong)uVar3 * 0x48) != 0) ||
         (*(longlong *)(*(longlong *)(param_1 + 2) + (ulonglong)uVar3 * 0x48 + -0x18) != 0)) break;
      uVar4 = uVar3 - 1;
      *param_1 = uVar4;
      bVar1 = 0 < (int)uVar3;
      uVar3 = uVar4;
    } while (uVar4 != 0 && bVar1);
  }
  if (_DAT_7ff70cbebd80 == (uStack_8 ^ (ulonglong)auStack_28)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_8 ^ (ulonglong)auStack_28);
  pcVar2 = (code *)swi(3);
  (*pcVar2)();
  return;
}


