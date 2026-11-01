
undefined8 FUN_005211c8(long *param_1)

{
  undefined8 *puVar1;
  long *plVar2;
  undefined1 uStack0000000000000008;
  
  if (*param_1 != 0) {
    plVar2 = param_1 + 3;
    _uStack0000000000000008 = param_1;
    if ((*plVar2 != 0) &&
       (puVar1 = (undefined8 *)func_0x0051fe6c(plVar2,&uStack0000000000000008),
       puVar1 != (undefined8 *)0x0)) goto LAB_00521260;
    param_1[3] = 0;
    if ((param_1[7] != 0) &&
       (puVar1 = (undefined8 *)func_0x00520618(param_1 + 7,&uStack0000000000000008,plVar2),
       puVar1 != (undefined8 *)0x0)) goto LAB_00521260;
    param_1[3] = 0;
    if ((param_1[5] != 0) &&
       (puVar1 = (undefined8 *)func_0x0051fe6c(param_1 + 5,&uStack0000000000000008),
       puVar1 != (undefined8 *)0x0)) goto LAB_00521260;
    param_1[5] = 0;
    *param_1 = 0;
  }
  puVar1 = (undefined8 *)param_1[10];
  if (puVar1 == (undefined8 *)0x0 || puVar1 == (undefined8 *)param_1[0xb]) {
    return 0;
  }
  param_1[10] = (long)(puVar1 + 2);
LAB_00521260:
  return *puVar1;
}

