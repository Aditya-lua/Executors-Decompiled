
void FUN_00070f84(void)

{
  char cVar1;
  long *plVar2;
  long lVar3;
  undefined8 *unaff_x19;
  
  plVar2 = (long *)unaff_x19[0xb];
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
  lVar3 = unaff_x19[9];
  unaff_x19[9] = 0;
  if (lVar3 != 0) {
    __ZdlPv();
  }
  func_0x00056a34(unaff_x19 + 6,unaff_x19[7]);
  if (*(char *)((long)unaff_x19 + 0x2f) < '\0') {
    __ZdlPv(unaff_x19[3]);
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

