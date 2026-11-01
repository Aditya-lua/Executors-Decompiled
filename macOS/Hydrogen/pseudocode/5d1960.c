
bool FUN_005d1960(undefined8 *param_1)

{
  long *plVar1;
  long *plVar2;
  ulong uVar3;
  long lVar4;
  undefined8 *unaff_x19;
  undefined8 unaff_x20;
  long *unaff_x21;
  long *plVar5;
  undefined8 uStack0000000000000008;
  
  plVar1 = (long *)param_1[1];
  plVar2 = (long *)*param_1;
  do {
    plVar5 = plVar2;
    if (plVar5 == plVar1) break;
    lVar4 = *plVar5;
    *unaff_x21 = (long)(plVar5 + 0x10);
    unaff_x19[2] = 1;
    unaff_x19[3] = plVar5 + 8;
    *unaff_x19 = 1;
    unaff_x19[1] = 0;
    if ((lVar4 != 0xc) && (uVar3 = func_0x005d7e94(param_1,plVar5), (uVar3 & 1) != 0)) break;
    *unaff_x19 = 0;
    unaff_x19[3] = 0;
    uStack0000000000000008 = unaff_x20;
    param_1 = (undefined8 *)func_0x005d7e94(&uStack0000000000000008,plVar5 + 8);
    plVar2 = plVar5 + 0x10;
  } while ((int)param_1 == 0);
  return plVar5 != plVar1;
}

