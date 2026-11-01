
long * FUN_006503b0(long *param_1)

{
  long lVar1;
  long lVar2;
  undefined8 *puVar3;
  
  lVar1 = param_1[1];
  lVar2 = param_1[2];
  while (lVar2 != lVar1) {
    puVar3 = *(undefined8 **)(lVar2 + -0x50);
    param_1[2] = (long)(lVar2 + -0x50);
    (*(code *)*puVar3)();
    lVar2 = param_1[2];
  }
  if (*param_1 != 0) {
    __ZdlPv();
  }
  return param_1;
}

