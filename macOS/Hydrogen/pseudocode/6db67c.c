
undefined8
FUN_006db67c(long param_1,undefined1 param_2 [16],double param_3,long param_4,long param_5)

{
  bool bVar1;
  bool bVar2;
  int *piVar3;
  double dVar4;
  
  dVar4 = *(double *)(param_1 + 0x20);
  bVar1 = false;
  bVar2 = true;
  if (param_3 <= dVar4) {
    bVar1 = false;
    bVar2 = true;
    if (!NAN(dVar4)) {
      bVar1 = dVar4 == 16.0;
      bVar2 = 16.0 <= dVar4;
    }
  }
  if ((!bVar2 || bVar1) && (*(long *)(param_5 + 0x38) == 0)) {
    piVar3 = (int *)FUN_006dbaf4(param_4 + 0x68,param_5 + 0x20);
    *piVar3 = (int)dVar4;
    return 1;
  }
  return 1;
}

