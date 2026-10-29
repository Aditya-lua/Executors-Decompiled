/* 7ff70c992fc0 FUN_7ff70c992fc0 */

longlong * FUN_7ff70c992fc0(longlong *param_1,longlong *param_2)

{
  longlong lVar1;
  longlong *plVar2;
  longlong *plVar3;
  longlong *plVar4;
  longlong *plVar5;
  longlong *plVar6;
  longlong lVar7;
  bool bVar8;
  bool bVar9;
  bool bVar10;
  longlong lStack_38;
  longlong lStack_30;
  
  plVar4 = &lStack_38;
  plVar5 = &lStack_38;
  if (param_2 == (longlong *)0x0) {
    return (longlong *)0x0;
  }
  lStack_38 = 0;
  lStack_30 = 0;
  lVar7 = *param_1;
  lVar1 = param_2[4];
  bVar10 = SBORROW8(lVar7,lVar1);
  bVar9 = lVar7 - lVar1 < 0;
  bVar8 = lVar7 == lVar1;
  plVar2 = &lStack_38;
  plVar6 = &lStack_38;
  if (lVar7 < lVar1) goto LAB_7ff70c993087;
  while (plVar3 = param_2, plVar6 = plVar5, !bVar8 && bVar10 == bVar9) {
LAB_7ff70c993004:
    plVar2 = (longlong *)plVar3[1];
    if (plVar2 == (longlong *)0x0) goto LAB_7ff70c9930a9;
    if ((plVar2[4] <= lVar7) && ((plVar2[4] < lVar7 || ((int)plVar2[5] < (int)param_1[1])))) {
      plVar3[1] = *plVar2;
      *plVar2 = (longlong)plVar3;
      plVar3 = plVar2;
      if (plVar2[1] != 0) goto LAB_7ff70c99303d;
      goto LAB_7ff70c9930a9;
    }
LAB_7ff70c99303d:
    plVar4[1] = (longlong)plVar3;
    param_2 = (longlong *)plVar3[1];
    lVar7 = *param_1;
    lVar1 = param_2[4];
    bVar10 = SBORROW8(lVar7,lVar1);
    bVar9 = lVar7 - lVar1 < 0;
    bVar8 = lVar7 == lVar1;
    plVar4 = plVar3;
    plVar2 = plVar3;
    if (lVar7 < lVar1) {
LAB_7ff70c993087:
      do {
        plVar4 = plVar2;
        plVar3 = param_2;
        plVar5 = (longlong *)*plVar3;
        if (plVar5 == (longlong *)0x0) goto LAB_7ff70c9930a9;
        if ((lVar7 < plVar5[4]) || ((lVar7 <= plVar5[4] && ((int)param_1[1] < (int)plVar5[5])))) {
          *plVar3 = plVar5[1];
          plVar5[1] = (longlong)plVar3;
          plVar3 = plVar5;
          if (*plVar5 == 0) goto LAB_7ff70c9930a9;
        }
        *plVar6 = (longlong)plVar3;
        param_2 = (longlong *)*plVar3;
        lVar7 = *param_1;
        lVar1 = param_2[4];
        bVar10 = SBORROW8(lVar7,lVar1);
        bVar9 = lVar7 - lVar1 < 0;
        bVar8 = lVar7 == lVar1;
        plVar2 = plVar4;
        plVar5 = plVar3;
        plVar6 = plVar3;
      } while (lVar7 < lVar1);
    }
  }
  param_2 = plVar3;
  plVar2 = plVar4;
  if ((int)param_1[1] < (int)plVar3[5]) goto LAB_7ff70c993087;
  if ((int)plVar3[5] < (int)param_1[1]) goto LAB_7ff70c993004;
LAB_7ff70c9930a9:
  plVar4[1] = *plVar3;
  *plVar6 = plVar3[1];
  *plVar3 = lStack_30;
  plVar3[1] = lStack_38;
  return plVar3;
}


