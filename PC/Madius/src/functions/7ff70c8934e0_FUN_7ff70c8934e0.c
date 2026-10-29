/* 7ff70c8934e0 FUN_7ff70c8934e0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c8934e0(int param_1)

{
  int iVar1;
  code *pcVar2;
  longlong lVar3;
  undefined8 uVar4;
  int iVar5;
  undefined1 auStack_48 [32];
  ulonglong uStack_28;
  
  lVar3 = _DAT_7ff70cc1a3c0;
  uStack_28 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_48;
  if ((param_1 != 0) && (*(int *)(_DAT_7ff70cc1a3c0 + 0x241c) == param_1)) {
    *(int *)(_DAT_7ff70cc1a3c0 + 0x2480) = param_1;
    if ((*(byte *)(lVar3 + 0x2419) & 2) == 0) {
      iVar5 = *(int *)(lVar3 + 0x248c);
      iVar1 = *(int *)(lVar3 + 0x2420) + 1;
      if (*(int *)(lVar3 + 0x2420) < iVar5) {
        uVar4 = *(undefined8 *)(lVar3 + 0x2490);
        iVar5 = iVar1;
      }
      else {
        if (iVar5 == 0) {
          iVar5 = 8;
        }
        else {
          iVar5 = iVar5 / 2 + iVar5;
        }
        if (iVar5 <= iVar1) {
          iVar5 = iVar1;
        }
        uVar4 = FUN_7ff70c802100((longlong)iVar5);
        if (*(longlong *)(lVar3 + 0x2490) != 0) {
          FUN_7ff70cb12b60(uVar4,*(longlong *)(lVar3 + 0x2490),(longlong)*(int *)(lVar3 + 0x2488));
          FUN_7ff70c802510(*(undefined8 *)(lVar3 + 0x2490));
        }
        *(undefined8 *)(lVar3 + 0x2490) = uVar4;
        *(int *)(lVar3 + 0x248c) = iVar5;
        iVar5 = *(int *)(lVar3 + 0x2420) + 1;
      }
      *(int *)(lVar3 + 0x2488) = iVar1;
      if (_DAT_7ff70cbebd80 == (uStack_28 ^ (ulonglong)auStack_48)) {
        FUN_7ff70cb12b60(uVar4,*(undefined8 *)(lVar3 + 0x2438),(longlong)iVar5);
        return;
      }
      goto LAB_7ff70c893652;
    }
    if (*(int *)(lVar3 + 0x248c) < 0) {
      uVar4 = FUN_7ff70c802100(0);
      if (*(longlong *)(lVar3 + 0x2490) != 0) {
        FUN_7ff70cb12b60(uVar4,*(longlong *)(lVar3 + 0x2490),(longlong)*(int *)(lVar3 + 0x2488));
        FUN_7ff70c802510(*(undefined8 *)(lVar3 + 0x2490));
      }
      *(undefined8 *)(lVar3 + 0x2490) = uVar4;
      *(undefined4 *)(lVar3 + 0x248c) = 0;
    }
    *(undefined4 *)(lVar3 + 0x2488) = 0;
  }
  if (_DAT_7ff70cbebd80 == (uStack_28 ^ (ulonglong)auStack_48)) {
    return;
  }
LAB_7ff70c893652:
  FUN_7ff70caa97e0(uStack_28 ^ (ulonglong)auStack_48);
  pcVar2 = (code *)swi(3);
  (*pcVar2)();
  return;
}


