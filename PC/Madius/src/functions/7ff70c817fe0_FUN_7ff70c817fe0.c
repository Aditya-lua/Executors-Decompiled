/* 7ff70c817fe0 FUN_7ff70c817fe0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c817fe0(void)

{
  code *pcVar1;
  longlong lVar2;
  int iVar3;
  undefined *puVar4;
  undefined1 auStack_38 [32];
  undefined *puStack_18;
  ulonglong uStack_10;
  
  lVar2 = _DAT_7ff70cc1a3c0;
  uStack_10 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_38;
  iVar3 = *(int *)(_DAT_7ff70cc1a3c0 + 0x14b4);
  if (iVar3 == 0) {
    *(undefined1 *)(_DAT_7ff70cc1a3c0 + 0x14c0) = 0;
  }
  else {
    if ((*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1460) != 0) &&
       (iVar3 == *(int *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1460) + 0x8c))) {
      if ((*(byte *)(_DAT_7ff70cc1a3c0 + 0x27b4) & 2) != 0) {
        FUN_7ff70c800cf0(&UNK_7ff70cb90e0d);
        iVar3 = *(int *)(lVar2 + 0x14b4);
      }
      *(undefined8 *)(lVar2 + 0x1460) = 0;
    }
    *(int *)(lVar2 + 0x14e8) = iVar3;
    *(uint *)(lVar2 + 0x14ec) = (uint)(*(int *)(lVar2 + 0x1e20) != iVar3) + *(int *)(lVar2 + 5000);
    *(undefined1 *)(lVar2 + 0x14f0) = *(undefined1 *)(lVar2 + 0x14c4);
    *(bool *)(lVar2 + 0x14f1) = *(int *)(lVar2 + 0x14b8) == iVar3;
    if (*(int *)(lVar2 + 0x241c) == iVar3) {
      FUN_7ff70c8934e0(iVar3);
      iVar3 = *(int *)(lVar2 + 0x14b4);
    }
    *(bool *)(lVar2 + 0x14c0) = iVar3 != 0;
    if (iVar3 != 0) {
      if ((*(byte *)(lVar2 + 0x27b4) & 2) != 0) {
        puVar4 = &UNK_7ff70cb923a7;
        if (*(longlong *)(lVar2 + 0x14d8) != 0) {
          puVar4 = *(undefined **)(*(longlong *)(lVar2 + 0x14d8) + 8);
        }
        puStack_18 = &UNK_7ff70cb923a7;
        FUN_7ff70c800cf0(&UNK_7ff70cb91b7f,iVar3,puVar4,0);
      }
      *(undefined4 *)(lVar2 + 0x14bc) = 0;
      *(undefined2 *)(lVar2 + 0x14c3) = 0;
      *(undefined1 *)(lVar2 + 0x14c8) = 0xff;
    }
  }
  *(undefined4 *)(lVar2 + 0x14b4) = 0;
  *(undefined2 *)(lVar2 + 0x14c1) = 0;
  *(undefined8 *)(lVar2 + 0x14d8) = 0;
  *(undefined2 *)(lVar2 + 0x14c5) = 0;
  *(undefined4 *)(lVar2 + 0x1dd0) = 0;
  *(undefined1 *)(lVar2 + 0x1dd4) = 0;
  if (_DAT_7ff70cbebd80 == (uStack_10 ^ (ulonglong)auStack_38)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_10 ^ (ulonglong)auStack_38);
  pcVar1 = (code *)swi(3);
  (*pcVar1)();
  return;
}


