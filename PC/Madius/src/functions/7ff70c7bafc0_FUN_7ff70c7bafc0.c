/* 7ff70c7bafc0 FUN_7ff70c7bafc0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c7bafc0(longlong param_1,undefined8 *param_2,float param_3,int param_4,int param_5)

{
  code *pcVar1;
  int iVar2;
  longlong lVar3;
  int iVar4;
  int iVar5;
  undefined8 in_R8;
  undefined1 auStack_58 [32];
  int iStack_38;
  undefined4 uStack_30;
  ulonglong uStack_28;
  
  uStack_28 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_58;
  if (_DAT_7ff70cb1ba70 <= param_3) {
    iStack_38 = param_5 << 2;
    uStack_30 = 0;
    FUN_7ff70c7ba8a0(_DAT_7ff70cb1ba70,param_2,in_R8,param_4 << 2);
  }
  else {
    iVar2 = *(int *)(param_1 + 0x50);
    if (iVar2 == *(int *)(param_1 + 0x54)) {
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
      if (*(longlong *)(param_1 + 0x58) != 0) {
        FUN_7ff70cb12b60(lVar3,*(longlong *)(param_1 + 0x58),(longlong)*(int *)(param_1 + 0x50) << 3
                        );
        FUN_7ff70c802510(*(undefined8 *)(param_1 + 0x58));
      }
      *(longlong *)(param_1 + 0x58) = lVar3;
      *(int *)(param_1 + 0x54) = iVar5;
      iVar2 = *(int *)(param_1 + 0x50);
    }
    else {
      lVar3 = *(longlong *)(param_1 + 0x58);
    }
    *(undefined8 *)(lVar3 + (longlong)iVar2 * 8) = *param_2;
    *(int *)(param_1 + 0x50) = *(int *)(param_1 + 0x50) + 1;
  }
  if (_DAT_7ff70cbebd80 == (uStack_28 ^ (ulonglong)auStack_58)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_28 ^ (ulonglong)auStack_58);
  pcVar1 = (code *)swi(3);
  (*pcVar1)();
  return;
}


