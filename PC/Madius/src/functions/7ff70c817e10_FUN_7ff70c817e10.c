/* 7ff70c817e10 FUN_7ff70c817e10 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c817e10(int param_1,longlong param_2)

{
  code *pcVar1;
  longlong lVar2;
  undefined4 uVar3;
  int iVar4;
  undefined *puVar5;
  undefined1 auStack_48 [32];
  undefined *puStack_28;
  ulonglong uStack_20;
  
  lVar2 = _DAT_7ff70cc1a3c0;
  uStack_20 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_48;
  iVar4 = *(int *)(_DAT_7ff70cc1a3c0 + 0x14b4);
  if (iVar4 == 0) {
    iVar4 = 0;
    *(bool *)(_DAT_7ff70cc1a3c0 + 0x14c0) = param_1 != 0;
    if (param_1 == 0) goto LAB_7ff70c817f4e;
  }
  else {
    if ((*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1460) != 0) &&
       (iVar4 == *(int *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1460) + 0x8c))) {
      if ((*(byte *)(_DAT_7ff70cc1a3c0 + 0x27b4) & 2) != 0) {
        FUN_7ff70c800cf0(&UNK_7ff70cb90e0d);
        iVar4 = *(int *)(lVar2 + 0x14b4);
      }
      *(undefined8 *)(lVar2 + 0x1460) = 0;
    }
    *(int *)(lVar2 + 0x14e8) = iVar4;
    *(uint *)(lVar2 + 0x14ec) = (uint)(*(int *)(lVar2 + 0x1e20) != iVar4) + *(int *)(lVar2 + 5000);
    *(undefined1 *)(lVar2 + 0x14f0) = *(undefined1 *)(lVar2 + 0x14c4);
    *(bool *)(lVar2 + 0x14f1) = *(int *)(lVar2 + 0x14b8) == iVar4;
    if (*(int *)(lVar2 + 0x241c) == iVar4) {
      FUN_7ff70c8934e0(iVar4);
      iVar4 = *(int *)(lVar2 + 0x14b4);
    }
    *(bool *)(lVar2 + 0x14c0) = iVar4 != param_1;
    if (iVar4 == param_1) goto LAB_7ff70c817f4e;
  }
  if ((*(byte *)(lVar2 + 0x27b4) & 2) != 0) {
    puVar5 = &UNK_7ff70cb923a7;
    puStack_28 = &UNK_7ff70cb923a7;
    if (param_2 != 0) {
      puStack_28 = *(undefined **)(param_2 + 8);
    }
    if (*(longlong *)(lVar2 + 0x14d8) != 0) {
      puVar5 = *(undefined **)(*(longlong *)(lVar2 + 0x14d8) + 8);
    }
    FUN_7ff70c800cf0(&UNK_7ff70cb91b7f,iVar4,puVar5,param_1);
  }
  *(undefined4 *)(lVar2 + 0x14bc) = 0;
  *(undefined2 *)(lVar2 + 0x14c3) = 0;
  *(undefined1 *)(lVar2 + 0x14c8) = 0xff;
  if (param_1 != 0) {
    *(int *)(lVar2 + 0x14fc) = param_1;
    *(undefined4 *)(lVar2 + 0x1500) = 0;
  }
LAB_7ff70c817f4e:
  *(int *)(lVar2 + 0x14b4) = param_1;
  *(undefined2 *)(lVar2 + 0x14c1) = 0;
  *(longlong *)(lVar2 + 0x14d8) = param_2;
  *(undefined2 *)(lVar2 + 0x14c5) = 0;
  if (param_1 != 0) {
    *(int *)(lVar2 + 0x14b8) = param_1;
    if ((*(int *)(lVar2 + 0x1fa8) == param_1) || (uVar3 = 1, *(int *)(lVar2 + 0x2154) == param_1)) {
      uVar3 = *(undefined4 *)(lVar2 + 0x1fd8);
    }
    *(undefined4 *)(lVar2 + 0x14e0) = uVar3;
  }
  *(undefined4 *)(lVar2 + 0x1dd0) = 0;
  *(undefined1 *)(lVar2 + 0x1dd4) = 0;
  if (_DAT_7ff70cbebd80 != (uStack_20 ^ (ulonglong)auStack_48)) {
    FUN_7ff70caa97e0(uStack_20 ^ (ulonglong)auStack_48);
    pcVar1 = (code *)swi(3);
    (*pcVar1)();
    return;
  }
  return;
}


