/* 7ff70c7b5930 FUN_7ff70c7b5930 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c7b5930(longlong param_1,longlong param_2)

{
  longlong *plVar1;
  code *pcVar2;
  longlong lVar3;
  int iVar4;
  int iVar5;
  int iVar6;
  longlong *plVar7;
  undefined1 auStack_48 [32];
  ulonglong uStack_28;
  
  uStack_28 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_48;
  lVar3 = *(longlong *)(param_1 + 0x38);
  if (lVar3 != 0) {
    plVar7 = *(longlong **)(lVar3 + 0x60);
    iVar5 = *(int *)(lVar3 + 0x58);
    plVar1 = plVar7 + iVar5;
    if (0 < (longlong)iVar5) {
      do {
        if (*plVar7 == param_1) break;
        plVar7 = plVar7 + 1;
      } while (plVar7 < plVar1);
    }
    if (plVar7 < plVar1) {
      if (plVar7 < plVar1 + -1) {
        *plVar7 = plVar1[-1];
        iVar5 = *(int *)(lVar3 + 0x58);
      }
      *(int *)(lVar3 + 0x58) = iVar5 + -1;
    }
  }
  *(longlong *)(param_1 + 0x38) = param_2;
  if (param_2 != 0) {
    iVar5 = *(int *)(param_2 + 0x58);
    if (iVar5 == *(int *)(param_2 + 0x5c)) {
      if (iVar5 == 0) {
        iVar4 = 8;
      }
      else {
        iVar4 = iVar5 / 2 + iVar5;
      }
      iVar6 = iVar5 + 1;
      if (iVar5 + 1 < iVar4) {
        iVar6 = iVar4;
      }
      lVar3 = FUN_7ff70c802100((longlong)iVar6 << 3);
      if (*(longlong *)(param_2 + 0x60) != 0) {
        FUN_7ff70cb12b60(lVar3,*(longlong *)(param_2 + 0x60),(longlong)*(int *)(param_2 + 0x58) << 3
                        );
        FUN_7ff70c802510(*(undefined8 *)(param_2 + 0x60));
      }
      *(longlong *)(param_2 + 0x60) = lVar3;
      *(int *)(param_2 + 0x5c) = iVar6;
      iVar5 = *(int *)(param_2 + 0x58);
    }
    else {
      lVar3 = *(longlong *)(param_2 + 0x60);
    }
    *(longlong *)(lVar3 + (longlong)iVar5 * 8) = param_1;
    *(int *)(param_2 + 0x58) = *(int *)(param_2 + 0x58) + 1;
  }
  if (_DAT_7ff70cbebd80 != (uStack_28 ^ (ulonglong)auStack_48)) {
    FUN_7ff70caa97e0(uStack_28 ^ (ulonglong)auStack_48);
    pcVar2 = (code *)swi(3);
    (*pcVar2)();
    return;
  }
  return;
}


