
void FUN_00070cfc(void)

{
  char cVar1;
  long *plVar2;
  long lVar3;
  long *in_x9;
  undefined8 *unaff_x19;
  
  plVar2 = (long *)unaff_x19[0x16];
  if (plVar2 == in_x9) {
    lVar3 = 4;
  }
  else {
    if (plVar2 == (long *)0x0) goto LAB_00070d28;
    lVar3 = 5;
    in_x9 = plVar2;
  }
  (**(code **)(*in_x9 + lVar3 * 8))();
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
    lVar3 = *plVar2;
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
    plVar2 = (long *)lVar3;
  }
  lVar3 = unaff_x19[7];
  unaff_x19[7] = 0;
  if (lVar3 != 0) {
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

