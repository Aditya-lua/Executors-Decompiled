/* 7ff70c992cf0 FUN_7ff70c992cf0 */

void FUN_7ff70c992cf0(longlong *param_1)

{
  longlong lVar1;
  longlong lVar2;
  int iVar3;
  longlong lVar4;
  longlong lVar5;
  
  if ((param_1 != (longlong *)0x0) && (*param_1 != 0)) {
    iVar3 = (int)param_1[4];
    if (0 < iVar3) {
      lVar5 = 0;
      do {
        lVar1 = *param_1;
        lVar4 = *(longlong *)(lVar1 + lVar5 * 0x20);
        if (lVar4 != 0) {
          do {
            lVar2 = *(longlong *)(lVar4 + 0x10);
            FUN_7ff70c991030(lVar1 + lVar5 * 0x20,lVar4,param_1);
            param_1[5] = param_1[5] + -1;
            lVar4 = lVar2;
          } while (lVar2 != 0);
          iVar3 = (int)param_1[4];
        }
        lVar5 = lVar5 + 1;
      } while (lVar5 < iVar3);
    }
  }
  return;
}


