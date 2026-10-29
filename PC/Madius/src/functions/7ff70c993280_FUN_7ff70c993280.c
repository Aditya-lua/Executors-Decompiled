/* 7ff70c993280 FUN_7ff70c993280 */

longlong * FUN_7ff70c993280(longlong *param_1,longlong *param_2,undefined8 *param_3)

{
  longlong lVar1;
  longlong *plVar2;
  longlong *plVar3;
  longlong *plVar4;
  longlong *plVar5;
  longlong lStack_38;
  longlong lStack_30;
  
  plVar5 = &lStack_38;
  if (param_2 == (longlong *)0x0) {
    *param_3 = 0;
    return (longlong *)0x0;
  }
  lStack_38 = 0;
  lStack_30 = 0;
  lVar1 = param_2[4];
  plVar3 = &lStack_38;
  do {
    while (plVar4 = param_2, lVar1 < 1) {
      if (-1 < lVar1) {
        if (0 < (int)plVar4[5]) break;
        if (-1 < (int)plVar4[5]) goto LAB_7ff70c993354;
      }
      plVar2 = (longlong *)plVar4[1];
      if (plVar2 == (longlong *)0x0) goto LAB_7ff70c993354;
      if ((plVar2[4] < 1) && ((plVar2[4] < 0 || ((int)plVar2[5] < 0)))) {
        plVar4[1] = *plVar2;
        *plVar2 = (longlong)plVar4;
        plVar4 = plVar2;
        if (plVar2[1] == 0) goto LAB_7ff70c993354;
      }
      plVar5[1] = (longlong)plVar4;
      param_2 = (longlong *)plVar4[1];
      plVar5 = plVar4;
      lVar1 = ((longlong *)plVar4[1])[4];
    }
    plVar2 = (longlong *)*plVar4;
    if (plVar2 == (longlong *)0x0) {
LAB_7ff70c993354:
      plVar5[1] = *plVar4;
      *plVar3 = plVar4[1];
      *plVar4 = lStack_30;
      plVar4[1] = lStack_38;
      if ((plVar4[4] <= *param_1) && ((plVar4[4] < *param_1 || ((int)plVar4[5] <= (int)param_1[1])))
         ) {
        plVar5 = (longlong *)plVar4[2];
        if (plVar5 != plVar4) {
          lVar1 = plVar4[5];
          plVar5[4] = plVar4[4];
          plVar5[5] = lVar1;
          plVar5[1] = plVar4[1];
          *plVar5 = *plVar4;
          lVar1 = plVar4[3];
          plVar5[3] = lVar1;
          *(longlong **)(lVar1 + 0x10) = plVar5;
          *param_3 = plVar4;
          return plVar5;
        }
        plVar5 = (longlong *)plVar4[1];
        *param_3 = plVar4;
        return plVar5;
      }
      *param_3 = 0;
      return plVar4;
    }
    if ((0 < plVar2[4]) || ((-1 < plVar2[4] && (0 < (int)plVar2[5])))) {
      *plVar4 = plVar2[1];
      plVar2[1] = (longlong)plVar4;
      plVar4 = plVar2;
      if (*plVar2 == 0) goto LAB_7ff70c993354;
    }
    *plVar3 = (longlong)plVar4;
    lVar1 = ((longlong *)*plVar4)[4];
    param_2 = (longlong *)*plVar4;
    plVar3 = plVar4;
  } while( true );
}


