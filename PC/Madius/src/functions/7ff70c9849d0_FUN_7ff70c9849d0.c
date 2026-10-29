/* 7ff70c9849d0 FUN_7ff70c9849d0 */

void FUN_7ff70c9849d0(longlong param_1,longlong *param_2)

{
  longlong lVar1;
  longlong lVar2;
  int iVar3;
  longlong lVar4;
  longlong lVar5;
  
  if (param_1 == 0) {
    if ((param_2 != (longlong *)0x0) && (*param_2 != 0)) {
      iVar3 = (int)param_2[4];
      if (0 < iVar3) {
        lVar5 = 0;
        do {
          lVar1 = *param_2;
          lVar4 = *(longlong *)(lVar1 + lVar5 * 0x20);
          if (lVar4 != 0) {
            do {
              lVar2 = *(longlong *)(lVar4 + 0x10);
              FUN_7ff70c991030(lVar1 + lVar5 * 0x20,lVar4,param_2);
              param_2[5] = param_2[5] + -1;
              lVar4 = lVar2;
            } while (lVar2 != 0);
            iVar3 = (int)param_2[4];
          }
          lVar5 = lVar5 + 1;
        } while (lVar5 < iVar3);
      }
    }
    return;
  }
  if (*(longlong *)(param_1 + 0xe8) != 0) {
    FUN_7ff70c959850(param_1,3,2);
  }
  FUN_7ff70c992cf0(param_2);
  if (*(longlong *)(param_1 + 0xe8) != 0) {
    FUN_7ff70c959890(param_1,3);
    return;
  }
  return;
}


