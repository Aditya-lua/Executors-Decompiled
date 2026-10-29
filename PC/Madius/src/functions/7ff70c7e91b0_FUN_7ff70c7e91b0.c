/* 7ff70c7e91b0 FUN_7ff70c7e91b0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c7e91b0(longlong param_1,undefined8 param_2)

{
  code *pcVar1;
  int iVar2;
  longlong lVar3;
  int iVar4;
  int iVar5;
  undefined1 auStack_48 [32];
  ulonglong uStack_28;
  
  uStack_28 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_48;
  iVar2 = *(int *)(param_1 + 0x2a0);
  if (iVar2 == *(int *)(param_1 + 0x2a4)) {
    if (iVar2 == 0) {
      iVar4 = 8;
    }
    else {
      iVar4 = iVar2 / 2 + iVar2;
    }
    iVar5 = iVar2 + 1;
    if (iVar2 + 1 < iVar4) {
      iVar5 = iVar4;
    }
    lVar3 = FUN_7ff70c802100((longlong)iVar5 << 3);
    if (*(longlong *)(param_1 + 0x2a8) != 0) {
      FUN_7ff70cb12b60(lVar3,*(longlong *)(param_1 + 0x2a8),(longlong)*(int *)(param_1 + 0x2a0) << 3
                      );
      FUN_7ff70c802510(*(undefined8 *)(param_1 + 0x2a8));
    }
    *(longlong *)(param_1 + 0x2a8) = lVar3;
    *(int *)(param_1 + 0x2a4) = iVar5;
    iVar2 = *(int *)(param_1 + 0x2a0);
  }
  else {
    lVar3 = *(longlong *)(param_1 + 0x2a8);
  }
  *(undefined8 *)(lVar3 + (longlong)iVar2 * 8) = param_2;
  *(int *)(param_1 + 0x2a0) = *(int *)(param_1 + 0x2a0) + 1;
  if (_DAT_7ff70cbebd80 == (uStack_28 ^ (ulonglong)auStack_48)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_28 ^ (ulonglong)auStack_48);
  pcVar1 = (code *)swi(3);
  (*pcVar1)();
  return;
}


