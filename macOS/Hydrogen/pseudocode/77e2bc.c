
void FUN_0077e2bc(undefined8 param_1,undefined8 param_2,long *param_3)

{
  long *plVar1;
  long *plVar2;
  long lVar3;
  long *plVar4;
  long lStack0000000000000008;
  long lStack0000000000000010;
  
  lStack0000000000000008 = 0;
  lStack0000000000000010 = 0;
  plVar1 = &lStack0000000000000008;
  lVar3 = func_0x00782ea8(param_1,param_2,param_3[4],param_3[5]);
  plVar2 = &lStack0000000000000008;
  while( true ) {
    while (plVar4 = param_3, -1 < lVar3) {
      if ((lVar3 == 0) || (lVar3 = param_3[1], lVar3 == 0)) goto LAB_0077e3b0;
      lVar3 = func_0x00782ea8(param_1,param_2,*(undefined8 *)(lVar3 + 0x20),
                              *(undefined8 *)(lVar3 + 0x28));
      if (0 < lVar3) {
        plVar4 = (long *)param_3[1];
        param_3[1] = *plVar4;
        *plVar4 = (long)param_3;
        if (plVar4[1] == 0) goto LAB_0077e3b0;
      }
      plVar1[1] = (long)plVar4;
      param_3 = (long *)plVar4[1];
      lVar3 = func_0x00782ea8(param_1,param_2,param_3[4],param_3[5]);
      plVar1 = plVar4;
    }
    lVar3 = *param_3;
    if (lVar3 == 0) break;
    lVar3 = func_0x00782ea8(param_1,param_2,*(undefined8 *)(lVar3 + 0x20),
                            *(undefined8 *)(lVar3 + 0x28));
    if (lVar3 < 0) {
      plVar4 = (long *)*param_3;
      *param_3 = plVar4[1];
      plVar4[1] = (long)param_3;
      if (*plVar4 == 0) break;
    }
    *plVar2 = (long)plVar4;
    param_3 = (long *)*plVar4;
    lVar3 = func_0x00782ea8(param_1,param_2,param_3[4],param_3[5]);
    plVar2 = plVar4;
  }
LAB_0077e3b0:
  plVar1[1] = *plVar4;
  *plVar2 = plVar4[1];
  *plVar4 = lStack0000000000000010;
  plVar4[1] = lStack0000000000000008;
  return;
}

