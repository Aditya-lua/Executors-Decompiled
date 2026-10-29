/* 7ff70c933f60 FUN_7ff70c933f60 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulonglong FUN_7ff70c933f60(undefined4 *param_1,undefined4 *param_2,undefined4 *param_3,char param_4)

{
  uint uVar1;
  longlong lVar2;
  code *pcVar3;
  uint uVar4;
  int iVar5;
  char cVar6;
  int iVar7;
  uint uVar8;
  uint uVar9;
  ulonglong uVar10;
  undefined4 uStack_78;
  undefined4 uStack_74;
  undefined4 uStack_70;
  undefined4 uStack_6c;
  undefined4 uStack_68;
  undefined4 uStack_64;
  undefined4 uStack_60;
  undefined4 uStack_5c;
  undefined4 uStack_58;
  undefined4 uStack_54;
  undefined4 uStack_50;
  undefined4 uStack_4c;
  
  lVar2 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)_DAT_7ff70cc1a960 * 8);
  uVar1 = *(uint *)(lVar2 + 0x140);
  iVar7 = FUN_7ff70cb12570(0x7ff70cbec748);
  uVar8 = _DAT_7ff70cc1ab24;
  iVar5 = _DAT_7ff70cc1ab20;
  if (iVar7 != 0) {
    FUN_7ff70cb124d0(5);
LAB_7ff70c934065:
    _DAT_7ff70cbec794 = 0x7ffffffe;
    FUN_7ff70cb124d0(6);
    pcVar3 = (code *)swi(3);
    uVar10 = (*pcVar3)();
    return uVar10;
  }
  if (_DAT_7ff70cbec794 == 0x7fffffff) goto LAB_7ff70c934065;
  FUN_7ff70cb12580(0x7ff70cbec748);
  if (iVar5 == 1) {
    uVar8 = 0;
  }
  else if (iVar5 != 2) {
    if (iVar5 != 0) goto LAB_7ff70c934048;
    uStack_58 = *param_1;
    uStack_54 = param_1[1];
    uStack_50 = param_1[2];
    uStack_4c = param_1[3];
    uVar8 = FUN_7ff70c923c98(&uStack_58);
    uStack_68 = *param_2;
    uStack_64 = param_2[1];
    uStack_60 = param_2[2];
    uStack_5c = param_2[3];
    uVar9 = FUN_7ff70c923c98(&uStack_68);
    uVar4 = uVar9 | uVar8 | 8;
    if (param_4 == '\0') {
      uVar4 = uVar9 | uVar8;
    }
    uStack_78 = *param_3;
    uStack_74 = param_3[1];
    uStack_70 = param_3[2];
    uStack_6c = param_3[3];
    cVar6 = FUN_7ff70c923d03(&uStack_78);
    uVar8 = uVar4 | 4;
    if (cVar6 == '\0') {
      uVar8 = uVar4;
    }
  }
  *(uint *)(lVar2 + 0x140) = uVar8;
LAB_7ff70c934048:
  return (ulonglong)uVar1;
}


