/* 7ff70c992d80 FUN_7ff70c992d80 */

void FUN_7ff70c992d80(longlong *param_1,undefined8 param_2,code *param_3)

{
  longlong lVar1;
  longlong *plVar2;
  longlong lVar3;
  int iVar4;
  longlong lVar5;
  longlong lVar6;
  longlong *plVar7;
  
  if ((param_1 != (longlong *)0x0) && (*param_1 != 0)) {
    iVar4 = (int)param_1[4];
    if (0 < iVar4) {
      if (param_3 == (code *)0x0) {
        lVar6 = 0;
        do {
          lVar1 = *param_1;
          lVar5 = *(longlong *)(lVar1 + lVar6 * 0x20);
          if (lVar5 != 0) {
            do {
              lVar3 = *(longlong *)(lVar5 + 0x10);
              FUN_7ff70c991030(lVar1 + lVar6 * 0x20,lVar5,param_1);
              param_1[5] = param_1[5] + -1;
              lVar5 = lVar3;
            } while (lVar3 != 0);
            iVar4 = (int)param_1[4];
          }
          lVar6 = lVar6 + 1;
        } while (lVar6 < iVar4);
      }
      else {
        lVar6 = 0;
        do {
          lVar1 = *param_1;
          plVar7 = *(longlong **)(lVar1 + lVar6 * 0x20);
          if (plVar7 != (longlong *)0x0) {
            do {
              plVar2 = (longlong *)plVar7[2];
              iVar4 = (*param_3)(param_2,*(undefined8 *)(*plVar7 + 0x18));
              if (iVar4 != 0) {
                FUN_7ff70c991030(lVar1 + lVar6 * 0x20,plVar7,param_1);
                param_1[5] = param_1[5] + -1;
              }
              plVar7 = plVar2;
            } while (plVar2 != (longlong *)0x0);
            iVar4 = (int)param_1[4];
          }
          lVar6 = lVar6 + 1;
        } while (lVar6 < iVar4);
      }
    }
  }
  return;
}


