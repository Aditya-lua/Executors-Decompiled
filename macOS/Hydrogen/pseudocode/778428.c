
undefined8 FUN_00778428(long param_1)

{
  long *plVar1;
  long unaff_x19;
  long *unaff_x21;
  long lVar2;
  long lVar3;
  
  lVar2 = 0x18;
  if ((*(uint *)(unaff_x21 + 2) & 1) != 0) {
    lVar2 = param_1 + 0x18;
  }
  plVar1 = (long *)(*pcRam0000000000a2b5e8)(lVar2);
  if (plVar1 == (long *)0x0) {
    return 0x1b;
  }
  lVar3 = unaff_x21[1];
  lVar2 = *unaff_x21;
  plVar1[2] = unaff_x21[2];
  plVar1[1] = lVar3;
  *plVar1 = lVar2;
  if ((*(byte *)(unaff_x21 + 2) & 1) != 0) {
    *plVar1 = (long)(plVar1 + 3);
    _memcpy(plVar1 + 3,*unaff_x21,unaff_x21[1]);
  }
  *(long **)(unaff_x19 + 0x928) = plVar1;
  return 0;
}

