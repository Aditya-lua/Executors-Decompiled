/* 7ff70c9933f0 FUN_7ff70c9933f0 */

undefined8 FUN_7ff70c9933f0(longlong *param_1,longlong *param_2,undefined8 *param_3)

{
  int iVar1;
  longlong lVar2;
  longlong lVar3;
  longlong *plVar4;
  longlong *plVar5;
  longlong *plVar6;
  longlong *plVar8;
  longlong lStack_48;
  longlong lStack_40;
  longlong *plVar7;
  
  plVar6 = &lStack_48;
  plVar7 = &lStack_48;
  if (param_2 == (longlong *)0x0 || param_1 == (longlong *)0x0) {
    return 1;
  }
  lVar2 = param_2[4];
  iVar1 = (int)param_2[5];
  if (iVar1 == -1 && lVar2 == -1) {
    if ((longlong *)param_2[2] == param_2) {
      return 3;
    }
    *(longlong **)(param_2[3] + 0x10) = (longlong *)param_2[2];
    *(longlong *)(param_2[2] + 0x18) = param_2[3];
    param_2[2] = (longlong)param_2;
  }
  else {
    lStack_48 = 0;
    lStack_40 = 0;
    lVar3 = param_1[4];
    plVar5 = &lStack_48;
joined_r0x7ff70c99346e:
    while (plVar8 = param_1, lVar3 <= lVar2) {
      if (lVar2 <= lVar3) {
        if (iVar1 < (int)plVar8[5]) break;
        if (iVar1 <= (int)plVar8[5]) goto LAB_7ff70c99351e;
      }
      plVar4 = (longlong *)plVar8[1];
      if (plVar4 == (longlong *)0x0) goto LAB_7ff70c99351e;
      if ((plVar4[4] <= lVar2) && ((plVar4[4] < lVar2 || ((int)plVar4[5] < iVar1)))) {
        plVar8[1] = *plVar4;
        *plVar4 = (longlong)plVar8;
        plVar8 = plVar4;
        if (plVar4[1] == 0) goto LAB_7ff70c99351e;
      }
      plVar5[1] = (longlong)plVar8;
      param_1 = (longlong *)plVar8[1];
      plVar5 = plVar8;
      lVar3 = ((longlong *)plVar8[1])[4];
    }
    plVar4 = (longlong *)*plVar8;
    if (plVar4 != (longlong *)0x0) {
      if ((lVar2 < plVar4[4]) || ((lVar2 <= plVar4[4] && (iVar1 < (int)plVar4[5])))) {
        *plVar8 = plVar4[1];
        plVar4[1] = (longlong)plVar8;
        plVar8 = plVar4;
        if (*plVar4 == 0) goto LAB_7ff70c99351e;
      }
      *plVar6 = (longlong)plVar8;
      lVar3 = ((longlong *)*plVar8)[4];
      param_1 = (longlong *)*plVar8;
      plVar6 = plVar8;
      goto joined_r0x7ff70c99346e;
    }
LAB_7ff70c99351e:
    plVar5[1] = *plVar8;
    *plVar6 = plVar8[1];
    *plVar8 = lStack_40;
    plVar8[1] = lStack_48;
    if (plVar8 != param_2) {
      return 2;
    }
    param_1 = (longlong *)plVar8[2];
    if (param_1 == param_2) {
      plVar6 = (longlong *)*plVar8;
      if (plVar6 == (longlong *)0x0) {
        param_1 = (longlong *)plVar8[1];
      }
      else {
        lVar2 = param_2[4];
        iVar1 = (int)param_2[5];
        lStack_48 = 0;
        lStack_40 = 0;
        lVar3 = plVar6[4];
        plVar5 = &lStack_48;
joined_r0x7ff70c9935af:
        while (param_1 = plVar6, lVar3 <= lVar2) {
          if (lVar2 <= lVar3) {
            if (iVar1 < (int)param_1[5]) break;
            if (iVar1 <= (int)param_1[5]) goto LAB_7ff70c99364b;
          }
          plVar6 = (longlong *)param_1[1];
          if (plVar6 == (longlong *)0x0) goto LAB_7ff70c99364b;
          if ((plVar6[4] <= lVar2) && ((plVar6[4] < lVar2 || ((int)plVar6[5] < iVar1)))) {
            param_1[1] = *plVar6;
            *plVar6 = (longlong)param_1;
            param_1 = plVar6;
            if (plVar6[1] == 0) goto LAB_7ff70c99364b;
          }
          plVar5[1] = (longlong)param_1;
          plVar6 = (longlong *)param_1[1];
          plVar5 = param_1;
          lVar3 = ((longlong *)param_1[1])[4];
        }
        plVar6 = (longlong *)*param_1;
        if (plVar6 != (longlong *)0x0) {
          if ((lVar2 < plVar6[4]) || ((lVar2 <= plVar6[4] && (iVar1 < (int)plVar6[5])))) {
            *param_1 = plVar6[1];
            plVar6[1] = (longlong)param_1;
            param_1 = plVar6;
            if (*plVar6 == 0) goto LAB_7ff70c99364b;
          }
          *plVar7 = (longlong)param_1;
          lVar3 = ((longlong *)*param_1)[4];
          plVar6 = (longlong *)*param_1;
          plVar7 = param_1;
          goto joined_r0x7ff70c9935af;
        }
LAB_7ff70c99364b:
        plVar5[1] = *param_1;
        *plVar7 = param_1[1];
        *param_1 = lStack_40;
        param_1[1] = lStack_48;
        param_1[1] = plVar8[1];
      }
    }
    else {
      lVar2 = plVar8[5];
      param_1[4] = plVar8[4];
      param_1[5] = lVar2;
      param_1[1] = plVar8[1];
      *param_1 = *plVar8;
      lVar2 = plVar8[3];
      param_1[3] = lVar2;
      *(longlong **)(lVar2 + 0x10) = param_1;
    }
  }
  *param_3 = param_1;
  return 0;
}


