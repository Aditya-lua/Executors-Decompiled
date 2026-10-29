/* 7ff70c80c4c0 FUN_7ff70c80c4c0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c80c4c0(int param_1)

{
  longlong lVar1;
  code *pcVar2;
  longlong lVar3;
  int iVar4;
  ulonglong uVar5;
  undefined1 auStack_38 [32];
  ulonglong uStack_18;
  
  lVar3 = _DAT_7ff70cc1a3c0;
  uStack_18 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_38;
  iVar4 = *(int *)(_DAT_7ff70cc1a3c0 + 0x1f00);
  if (*(int *)(_DAT_7ff70cc1a3c0 + 0x1f00) < param_1) {
    FUN_7ff70c80af70(&UNK_7ff70cb90097);
    param_1 = *(int *)(lVar3 + 0x1f00);
    iVar4 = param_1;
  }
  if (0 < param_1) {
    param_1 = param_1 + 1;
    do {
      lVar1 = *(longlong *)(lVar3 + 0x1f08) + (longlong)iVar4 * 0xc;
      iVar4 = *(int *)(*(longlong *)(lVar3 + 0x1f08) + -0xc + (longlong)iVar4 * 0xc);
      uVar5 = (ulonglong)*(ushort *)(&UNK_7ff70cb1d062 + (longlong)iVar4 * 4);
      if ((0x26ffd379bU >> ((longlong)iVar4 & 0x3fU) & 1) == 0) {
        if ((1L << ((byte)iVar4 & 0x3f) & 0xd9002c864U) != 0) {
          *(undefined4 *)(lVar3 + 0xc40 + uVar5) = *(undefined4 *)(lVar1 + -8);
          *(undefined4 *)(lVar3 + 0xc44 + uVar5) = *(undefined4 *)(lVar1 + -4);
        }
      }
      else {
        *(undefined4 *)(lVar3 + 0xc40 + uVar5) = *(undefined4 *)(lVar1 + -8);
      }
      iVar4 = *(int *)(lVar3 + 0x1f00) + -1;
      *(int *)(lVar3 + 0x1f00) = iVar4;
      param_1 = param_1 + -1;
    } while (1 < param_1);
  }
  if (_DAT_7ff70cbebd80 == (uStack_18 ^ (ulonglong)auStack_38)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_18 ^ (ulonglong)auStack_38);
  pcVar2 = (code *)swi(3);
  (*pcVar2)();
  return;
}


