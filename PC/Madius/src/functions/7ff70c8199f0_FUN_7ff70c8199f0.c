/* 7ff70c8199f0 FUN_7ff70c8199f0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c8199f0(longlong param_1)

{
  undefined8 uVar1;
  int iVar2;
  code *pcVar3;
  longlong lVar4;
  longlong lVar5;
  undefined4 uVar6;
  int iVar7;
  int iVar8;
  undefined *puVar9;
  undefined1 auStack_58 [32];
  undefined8 uStack_38;
  ulonglong uStack_30;
  
  lVar4 = _DAT_7ff70cc1a3c0;
  uStack_30 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_58;
  iVar8 = 0;
  FUN_7ff70c819c70(param_1,0);
  lVar5 = _DAT_7ff70cc1a3c0;
  iVar2 = *(int *)(param_1 + 0x8c);
  iVar7 = *(int *)(_DAT_7ff70cc1a3c0 + 0x14b4);
  if (iVar7 == 0) {
LAB_7ff70c819ac9:
    *(bool *)(lVar5 + 0x14c0) = iVar8 != iVar2;
    if (iVar8 == iVar2) goto LAB_7ff70c819b55;
  }
  else {
    iVar8 = iVar7;
    if ((*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1460) != 0) &&
       (iVar7 == *(int *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1460) + 0x8c))) {
      if ((*(byte *)(_DAT_7ff70cc1a3c0 + 0x27b4) & 2) != 0) {
        FUN_7ff70c800cf0(&UNK_7ff70cb90e0d);
        iVar7 = *(int *)(lVar5 + 0x14b4);
      }
      *(undefined8 *)(lVar5 + 0x1460) = 0;
      iVar8 = iVar7;
    }
    *(int *)(lVar5 + 0x14e8) = iVar8;
    *(uint *)(lVar5 + 0x14ec) = (uint)(*(int *)(lVar5 + 0x1e20) != iVar8) + *(int *)(lVar5 + 5000);
    *(undefined1 *)(lVar5 + 0x14f0) = *(undefined1 *)(lVar5 + 0x14c4);
    *(bool *)(lVar5 + 0x14f1) = *(int *)(lVar5 + 0x14b8) == iVar8;
    if (*(int *)(lVar5 + 0x241c) == iVar8) {
      FUN_7ff70c8934e0();
      iVar8 = *(int *)(lVar5 + 0x14b4);
      goto LAB_7ff70c819ac9;
    }
    *(bool *)(lVar5 + 0x14c0) = iVar8 != iVar2;
    if (iVar8 == iVar2) goto LAB_7ff70c819b55;
  }
  if ((*(byte *)(lVar5 + 0x27b4) & 2) != 0) {
    uStack_38 = *(undefined8 *)(param_1 + 8);
    if (*(longlong *)(lVar5 + 0x14d8) == 0) {
      puVar9 = &UNK_7ff70cb923a7;
    }
    else {
      puVar9 = *(undefined **)(*(longlong *)(lVar5 + 0x14d8) + 8);
    }
    FUN_7ff70c800cf0(&UNK_7ff70cb91b7f,iVar8,puVar9,iVar2);
  }
  *(undefined4 *)(lVar5 + 0x14bc) = 0;
  *(undefined2 *)(lVar5 + 0x14c3) = 0;
  *(undefined1 *)(lVar5 + 0x14c8) = 0xff;
  if (iVar2 != 0) {
    *(int *)(lVar5 + 0x14fc) = iVar2;
    *(undefined4 *)(lVar5 + 0x1500) = 0;
  }
LAB_7ff70c819b55:
  *(int *)(lVar5 + 0x14b4) = iVar2;
  *(undefined2 *)(lVar5 + 0x14c1) = 0;
  *(longlong *)(lVar5 + 0x14d8) = param_1;
  *(undefined2 *)(lVar5 + 0x14c5) = 0;
  if (iVar2 != 0) {
    *(int *)(lVar5 + 0x14b8) = iVar2;
    if ((*(int *)(lVar5 + 0x1fa8) == iVar2) || (uVar6 = 1, *(int *)(lVar5 + 0x2154) == iVar2)) {
      uVar6 = *(undefined4 *)(lVar5 + 0x1fd8);
    }
    *(undefined4 *)(lVar5 + 0x14e0) = uVar6;
  }
  *(undefined4 *)(lVar5 + 0x1dd0) = 0;
  *(undefined1 *)(lVar5 + 0x1dd4) = 0;
  if (*(char *)(lVar4 + 0x56) == '\x01') {
    *(undefined1 *)(lVar4 + 0x1f90) = 0;
  }
  uVar1 = *(undefined8 *)(*(longlong *)(param_1 + 0x3c0) + 0x28);
  *(ulonglong *)(lVar4 + 0x14cc) =
       CONCAT44((float)((ulonglong)*(undefined8 *)(lVar4 + 0xac0) >> 0x20) -
                (float)((ulonglong)uVar1 >> 0x20),
                (float)*(undefined8 *)(lVar4 + 0xac0) - (float)uVar1);
  *(undefined1 *)(lVar4 + 0x14c2) = 1;
  lVar5 = _DAT_7ff70cc1a3c0;
  *(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x1dd0) = 0xf;
  *(undefined1 *)(lVar5 + 0x1dd4) = 1;
  *(undefined2 *)(lVar5 + 0x2028) = 0;
  *(undefined1 *)(lVar5 + 0x1fe9) = *(undefined1 *)(lVar5 + 0x1fea);
  if (((*(byte *)(param_1 + 0x14) & 4) == 0) &&
     ((*(byte *)(*(longlong *)(param_1 + 0x3c0) + 0x14) & 4) == 0)) {
    *(longlong *)(lVar4 + 0x1460) = param_1;
  }
  if (_DAT_7ff70cbebd80 != (uStack_30 ^ (ulonglong)auStack_58)) {
    FUN_7ff70caa97e0(uStack_30 ^ (ulonglong)auStack_58);
    pcVar3 = (code *)swi(3);
    (*pcVar3)();
    return;
  }
  return;
}


