
void FUN_000f041c(int *param_1)

{
  int iVar1;
  int iVar2;
  int iVar3;
  int iVar4;
  long *plVar5;
  int iVar6;
  long lVar7;
  long lVar8;
  long lStack0000000000000000;
  long lStack0000000000000008;
  
  lVar7 = *(long *)(param_1 + 2);
  iVar6 = *param_1;
  iVar4 = iVar6 + -1;
  plVar5 = (long *)(lVar7 + (long)iVar4 * 0x38);
  if ((int)plVar5[4] == 0) {
    if ((((1 < iVar6) &&
         (((*(long *)(param_1 + 0x22) == plVar5[-7] && *(long *)(param_1 + 0x24) == plVar5[-6]) &&
          *(long *)(param_1 + 0x26) == plVar5[-5]) && param_1[0x28] == (int)plVar5[-4])) &&
        ((int)plVar5[-3] + *(int *)((long)plVar5 + -0x1c) ==
         *(int *)(lVar7 + (long)iVar4 * 0x38 + 0x1c))) && (plVar5[-2] == 0)) {
      *param_1 = iVar4;
      return;
    }
  }
  else if (*plVar5 != *(long *)(param_1 + 0x22) || plVar5[1] != *(long *)(param_1 + 0x24)) {
    lStack0000000000000008 = *(long *)(param_1 + 0x24);
    lStack0000000000000000 = *(long *)(param_1 + 0x22);
    lVar8 = *(long *)(param_1 + 0x26);
    iVar4 = param_1[0x28];
    iVar3 = param_1[4];
    if (iVar6 == param_1[1]) {
      iVar1 = iVar6;
      if (iVar6 < 0) {
        iVar1 = iVar6 + 1;
      }
      iVar2 = 8;
      if (iVar6 != 0) {
        iVar2 = iVar6 + (iVar1 >> 1);
      }
      if (iVar2 <= iVar6 + 1) {
        iVar2 = iVar6 + 1;
      }
      lVar7 = func_0x000b810c((long)iVar2 * 0x38);
      if (*(long *)(param_1 + 2) != 0) {
        _memcpy(lVar7,*(long *)(param_1 + 2),(long)*param_1 * 0x38);
        func_0x000b83d4(*(undefined8 *)(param_1 + 2));
      }
      *(long *)(param_1 + 2) = lVar7;
      param_1[1] = iVar2;
      iVar6 = *param_1;
    }
    plVar5 = (long *)(lVar7 + (long)iVar6 * 0x38);
    plVar5[1] = lStack0000000000000008;
    *plVar5 = lStack0000000000000000;
    plVar5[2] = lVar8;
    *(int *)(plVar5 + 3) = iVar4;
    *(int *)((long)plVar5 + 0x1c) = iVar3;
    plVar5[5] = 0;
    plVar5[6] = 0;
    plVar5[4] = 0;
    *param_1 = *param_1 + 1;
    return;
  }
  lVar7 = *(long *)(param_1 + 0x22);
  plVar5[1] = *(long *)(param_1 + 0x24);
  *plVar5 = lVar7;
  return;
}

