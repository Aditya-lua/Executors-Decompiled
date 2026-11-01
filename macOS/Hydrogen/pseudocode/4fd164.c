
undefined8 FUN_004fd164(undefined8 *param_1,long *param_2)

{
  int iVar1;
  long lVar2;
  long lVar3;
  long *plVar4;
  
  lVar2 = *(long *)(*param_2 + 0x10);
  if (lVar2 != 0) {
    param_1 = (undefined8 *)*param_1;
    lVar3 = param_1[1];
    lVar2 = lVar2 << 4;
    plVar4 = (long *)(*(long *)(*param_2 + 8) + 8);
    do {
      if ((*plVar4 == lVar3) && (iVar1 = _memcmp(plVar4[-1],*param_1,lVar3), iVar1 == 0)) {
        return 1;
      }
      lVar2 = lVar2 + -0x10;
      plVar4 = plVar4 + 2;
    } while (lVar2 != 0);
  }
  return 0;
}

