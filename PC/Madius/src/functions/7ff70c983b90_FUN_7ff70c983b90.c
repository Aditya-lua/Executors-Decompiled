/* 7ff70c983b90 FUN_7ff70c983b90 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c983b90(longlong param_1)

{
  longlong lVar1;
  int iVar2;
  undefined8 uStack_48;
  undefined8 uStack_40;
  longlong lStack_38;
  int iStack_30;
  
  if (*(longlong *)(param_1 + 200) != 0) {
    iVar2 = *(int *)(param_1 + 0x6b8);
    if (*(longlong *)(param_1 + 0xe8) != 0) {
      FUN_7ff70c959850(param_1,3,2);
    }
    (*_DAT_7ff70cb96630)(&uStack_48);
    lVar1 = *(longlong *)(param_1 + 200);
    do {
      uStack_40 = uStack_48;
      lStack_38 = 0;
      iStack_30 = iVar2;
      FUN_7ff70c992d80(lVar1,&uStack_40,&UNK_7ff70c9850c0);
      iVar2 = (int)lStack_38;
      if (0x7ffffffe < lStack_38) {
        iVar2 = 0x7ffffffe;
      }
    } while ((iVar2 != 0) &&
            (lVar1 = *(longlong *)(param_1 + 200), 29999 < *(ulonglong *)(lVar1 + 0x28)));
    if (*(longlong *)(param_1 + 0xe8) != 0) {
      FUN_7ff70c959890(param_1,3);
    }
  }
  return;
}


