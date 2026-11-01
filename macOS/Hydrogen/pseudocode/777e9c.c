
undefined8 FUN_00777e9c(undefined8 param_1)

{
  undefined8 uVar1;
  long *plVar2;
  code *in_x9;
  ulong in_x10;
  long unaff_x19;
  long *unaff_x21;
  long lVar3;
  long lVar4;
  
  uVar1 = 0x18;
  if ((in_x10 & 1) != 0) {
    uVar1 = param_1;
  }
  plVar2 = (long *)(*in_x9)(uVar1);
  if (plVar2 == (long *)0x0) {
    return 0x1b;
  }
  lVar4 = unaff_x21[1];
  lVar3 = *unaff_x21;
  plVar2[2] = unaff_x21[2];
  plVar2[1] = lVar4;
  *plVar2 = lVar3;
  if ((*(byte *)(unaff_x21 + 2) & 1) != 0) {
    *plVar2 = (long)(plVar2 + 3);
    _memcpy(plVar2 + 3,*unaff_x21,unaff_x21[1]);
  }
  *(long **)(unaff_x19 + 0x930) = plVar2;
  return 0;
}

