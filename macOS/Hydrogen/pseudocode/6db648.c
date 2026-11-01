
undefined8 FUN_006db648(long param_1,long param_2,long param_3)

{
  bool bVar1;
  bool bVar2;
  int *piVar3;
  int in_w9;
  long in_x10;
  long in_x11;
  double dVar4;
  
  if (in_w9 != *(int *)(in_x11 + 0xa78)) {
    param_1 = 0;
  }
  if (*(int *)(in_x10 + 8) != *(int *)(in_x11 + 0xa78)) {
    in_x10 = 0;
  }
  if ((param_1 != 0 && in_x10 != 0) && (*(double *)(param_1 + 0x20) == 1.0)) {
    dVar4 = *(double *)(in_x10 + 0x20);
    bVar1 = false;
    bVar2 = true;
    if (1.0 <= dVar4) {
      bVar1 = false;
      bVar2 = true;
      if (!NAN(dVar4)) {
        bVar1 = dVar4 == 16.0;
        bVar2 = 16.0 <= dVar4;
      }
    }
    if ((!bVar2 || bVar1) && (*(long *)(param_3 + 0x38) == 0)) {
      piVar3 = (int *)FUN_006dbaf4(param_2 + 0x68,param_3 + 0x20);
      *piVar3 = (int)dVar4;
      return 1;
    }
  }
  return 1;
}

