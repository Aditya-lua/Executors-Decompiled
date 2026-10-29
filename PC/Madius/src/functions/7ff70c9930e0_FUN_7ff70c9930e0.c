/* 7ff70c9930e0 FUN_7ff70c9930e0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

longlong * FUN_7ff70c9930e0(longlong *param_1,longlong *param_2,longlong *param_3)

{
  int iVar1;
  longlong lVar2;
  longlong lVar3;
  longlong *plVar4;
  longlong *plVar5;
  longlong lVar6;
  longlong *plVar7;
  longlong *plVar8;
  longlong lStack_48;
  longlong lStack_40;
  
  plVar7 = &lStack_48;
  if (param_3 == (longlong *)0x0) {
    return param_2;
  }
  if (param_2 == (longlong *)0x0) {
    *param_3 = 0;
    param_3[1] = 0;
  }
  else {
    lVar2 = *param_1;
    iVar1 = (int)param_1[1];
    lStack_48 = 0;
    lStack_40 = 0;
    lVar3 = param_2[4];
    plVar5 = &lStack_48;
joined_r0x7ff70c993112:
    while (plVar8 = param_2, lVar3 <= lVar2) {
      if (lVar2 <= lVar3) {
        if (iVar1 < (int)plVar8[5]) break;
        if (iVar1 <= (int)plVar8[5]) goto LAB_7ff70c9931c8;
      }
      plVar4 = (longlong *)plVar8[1];
      if (plVar4 == (longlong *)0x0) goto LAB_7ff70c9931c8;
      if ((plVar4[4] <= lVar2) && ((plVar4[4] < lVar2 || ((int)plVar4[5] < iVar1)))) {
        plVar8[1] = *plVar4;
        *plVar4 = (longlong)plVar8;
        plVar8 = plVar4;
        if (plVar4[1] == 0) goto LAB_7ff70c9931c8;
      }
      plVar5[1] = (longlong)plVar8;
      param_2 = (longlong *)plVar8[1];
      plVar5 = plVar8;
      lVar3 = ((longlong *)plVar8[1])[4];
    }
    plVar4 = (longlong *)*plVar8;
    if (plVar4 != (longlong *)0x0) {
      if ((lVar2 < plVar4[4]) || ((lVar2 <= plVar4[4] && (iVar1 < (int)plVar4[5])))) {
        *plVar8 = plVar4[1];
        plVar4[1] = (longlong)plVar8;
        plVar8 = plVar4;
        if (*plVar4 == 0) goto LAB_7ff70c9931c8;
      }
      *plVar7 = (longlong)plVar8;
      lVar3 = ((longlong *)*plVar8)[4];
      param_2 = (longlong *)*plVar8;
      plVar7 = plVar8;
      goto joined_r0x7ff70c993112;
    }
LAB_7ff70c9931c8:
    plVar5[1] = *plVar8;
    *plVar7 = plVar8[1];
    *plVar8 = lStack_40;
    plVar8[1] = lStack_48;
    lVar6 = _UNK_7ff70cb535d0;
    lVar2 = *param_1;
    lVar3 = plVar8[4];
    if ((lVar2 == lVar3) && ((int)param_1[1] == (int)plVar8[5])) {
      param_3[4] = _DAT_7ff70cb535c8;
      param_3[5] = lVar6;
      param_3[2] = (longlong)plVar8;
      lVar2 = plVar8[3];
      param_3[3] = lVar2;
      *(longlong **)(lVar2 + 0x10) = param_3;
      plVar8[3] = (longlong)param_3;
      return plVar8;
    }
    if ((lVar2 < lVar3) || ((lVar2 <= lVar3 && ((int)param_1[1] < (int)plVar8[5])))) {
      *param_3 = *plVar8;
      param_3[1] = (longlong)plVar8;
      *plVar8 = 0;
    }
    else {
      param_3[1] = plVar8[1];
      *param_3 = (longlong)plVar8;
      plVar8[1] = 0;
    }
  }
  lVar2 = param_1[1];
  param_3[4] = *param_1;
  param_3[5] = lVar2;
  param_3[2] = (longlong)param_3;
  param_3[3] = (longlong)param_3;
  return param_3;
}


