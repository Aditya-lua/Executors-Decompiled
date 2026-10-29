/* 7ff70c943ef0 FUN_7ff70c943ef0 */

undefined8 FUN_7ff70c943ef0(undefined8 *param_1,longlong param_2)

{
  ulonglong uVar1;
  longlong lVar2;
  ulonglong uVar3;
  int iVar4;
  
  param_1[2] = 0;
  param_1[3] = 0;
  *param_1 = 0;
  param_1[1] = 0;
  param_1[4] = 0;
  iVar4 = 0;
  if ((param_2 != 0) && (iVar4 = 0, *(longlong *)(param_2 + 0x20) != 0)) {
    iVar4 = 0;
    uVar3 = 0;
    lVar2 = param_2;
    do {
      uVar1 = FUN_7ff70cb12e80(lVar2);
      if (9 < uVar1) {
        return 2;
      }
      if (0x1f < iVar4 + (int)uVar1) {
        return 2;
      }
      *(char *)((longlong)param_1 + (longlong)iVar4) = (char)uVar1;
      FUN_7ff70cb12b60((longlong)param_1 + (longlong)iVar4 + 1,lVar2,uVar1);
      iVar4 = iVar4 + (int)uVar1 + 1;
      uVar3 = uVar3 + 1;
      lVar2 = lVar2 + 10;
    } while (uVar3 < *(ulonglong *)(param_2 + 0x20));
  }
  *(int *)((longlong)param_1 + 0x24) = iVar4;
  return 0;
}


