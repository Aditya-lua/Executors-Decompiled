/* 7ff70c943f90 FUN_7ff70c943f90 */

undefined8 FUN_7ff70c943f90(undefined8 *param_1,longlong param_2)

{
  ulonglong uVar1;
  longlong lVar2;
  ulonglong uVar3;
  longlong lVar4;
  
  param_1[2] = 0;
  param_1[3] = 0;
  *param_1 = 0;
  param_1[1] = 0;
  param_1[4] = 0;
  lVar4 = 0;
  if (param_2 != 0) {
    if (*(longlong *)(param_2 + 0x20) == 0) {
      lVar4 = 0;
    }
    else {
      lVar4 = 0;
      uVar3 = 0;
      lVar2 = param_2;
      do {
        uVar1 = FUN_7ff70cb12e80(lVar2);
        if (9 < uVar1) {
          return 2;
        }
        if ((lVar4 + uVar1) - 0x1f < 0xffffffffffffffdf) {
          return 2;
        }
        if (lVar4 == 0) {
          lVar4 = 0;
        }
        else {
          *(undefined1 *)((longlong)param_1 + lVar4) = 0x2c;
          lVar4 = lVar4 + 1;
        }
        FUN_7ff70cb12b60((longlong)param_1 + lVar4,lVar2,uVar1);
        lVar4 = lVar4 + uVar1;
        uVar3 = uVar3 + 1;
        lVar2 = lVar2 + 10;
      } while (uVar3 < *(ulonglong *)(param_2 + 0x20));
    }
  }
  *(undefined1 *)((longlong)param_1 + lVar4) = 0;
  *(int *)((longlong)param_1 + 0x24) = (int)lVar4;
  return 0;
}


