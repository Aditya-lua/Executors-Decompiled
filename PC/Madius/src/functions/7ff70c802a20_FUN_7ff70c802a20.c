/* 7ff70c802a20 FUN_7ff70c802a20 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c802a20(longlong param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  code *pcVar1;
  int iVar2;
  int iVar3;
  ulonglong *puVar4;
  int iVar5;
  ulonglong unaff_RBX;
  undefined8 uStackX_20;
  undefined8 uStack_68;
  undefined1 auStack_60 [24];
  undefined8 uStack_48;
  undefined8 *puStack_40;
  undefined8 *puStack_30;
  ulonglong uStack_28;
  
  uStack_28 = _DAT_7ff70cbebd80 ^ (ulonglong)&uStack_68;
  uStackX_20 = param_4;
  puStack_30 = &uStackX_20;
  puVar4 = (ulonglong *)FUN_7ff70ca421b0();
  uStack_48 = 0;
  puStack_40 = &uStackX_20;
  iVar2 = func_0x7ff70d964fed(*puVar4 | 1,param_1,param_2,param_3);
  iVar3 = -1;
  if (-1 < iVar2) {
    iVar3 = iVar2;
  }
  if (param_1 != 0) {
    iVar5 = (int)param_2 + -1;
    if ((int)param_2 <= iVar3) {
      iVar3 = iVar5;
    }
    if (iVar2 < 0) {
      iVar3 = iVar5;
    }
    *(undefined1 *)(param_1 + iVar3) = 0;
  }
  if (_DAT_7ff70cbebd80 == (unaff_RBX ^ (ulonglong)auStack_60)) {
    return;
  }
  uStack_68 = 0x7ff70c802acf;
  FUN_7ff70caa97e0(unaff_RBX ^ (ulonglong)auStack_60);
  pcVar1 = (code *)swi(3);
  (*pcVar1)();
  return;
}


