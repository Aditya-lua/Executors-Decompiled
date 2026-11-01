
void FUN_00070ca4(void)

{
  char cVar1;
  long *plVar2;
  long *plVar3;
  long lVar4;
  undefined8 *unaff_x19;
  long *unaff_x20;
  
  plVar2 = (long *)unaff_x19[0x1a];
  if (plVar2 == unaff_x20) {
    lVar4 = 4;
LAB_00070cec:
    (**(code **)(*unaff_x20 + lVar4 * 8))();
  }
  else if (plVar2 != (long *)0x0) {
    lVar4 = 5;
    unaff_x20 = plVar2;
    goto LAB_00070cec;
  }
  plVar2 = unaff_x19 + 0x13;
  plVar3 = (long *)unaff_x19[0x16];
  if (plVar3 == plVar2) {
    lVar4 = 4;
  }
  else {
    if (plVar3 == (long *)0x0) goto LAB_00070d28;
    lVar4 = 5;
    plVar2 = plVar3;
  }
  (**(code **)(*plVar2 + lVar4 * 8))();
LAB_00070d28:
  if (*(char *)((long)unaff_x19 + 0x8f) < '\0') {
    __ZdlPv(unaff_x19[0xf]);
    cVar1 = *(char *)((long)unaff_x19 + 0x77);
  }
  else {
    cVar1 = *(char *)((long)unaff_x19 + 0x77);
  }
  if (cVar1 < '\0') {
    __ZdlPv(unaff_x19[0xc]);
    plVar2 = (long *)unaff_x19[9];
  }
  else {
    plVar2 = (long *)unaff_x19[9];
  }
  while (plVar2 != (long *)0x0) {
    lVar4 = *plVar2;
    if (*(char *)((long)plVar2 + 0x3f) < '\0') {
      __ZdlPv(plVar2[5]);
      cVar1 = *(char *)((long)plVar2 + 0x27);
    }
    else {
      cVar1 = *(char *)((long)plVar2 + 0x27);
    }
    if (cVar1 < '\0') {
      __ZdlPv(plVar2[2]);
    }
    __ZdlPv(plVar2);
    plVar2 = (long *)lVar4;
  }
  lVar4 = unaff_x19[7];
  unaff_x19[7] = 0;
  if (lVar4 != 0) {
    __ZdlPv();
  }
  if (*(char *)((long)unaff_x19 + 0x37) < '\0') {
    __ZdlPv(unaff_x19[4]);
    cVar1 = *(char *)((long)unaff_x19 + 0x17);
  }
  else {
    cVar1 = *(char *)((long)unaff_x19 + 0x17);
  }
  if (cVar1 < '\0') {
    __ZdlPv(*unaff_x19);
    return;
  }
  return;
}

