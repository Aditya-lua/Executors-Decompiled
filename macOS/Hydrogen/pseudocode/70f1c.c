
void FUN_00070f1c(void)

{
  char cVar1;
  long *plVar2;
  long lVar3;
  undefined8 *unaff_x19;
  long *unaff_x20;
  
  while (unaff_x20 != (long *)0x0) {
    lVar3 = *unaff_x20;
    if (*(char *)((long)unaff_x20 + 0x3f) < '\0') {
      __ZdlPv(unaff_x20[5]);
      cVar1 = *(char *)((long)unaff_x20 + 0x27);
    }
    else {
      cVar1 = *(char *)((long)unaff_x20 + 0x27);
    }
    if (cVar1 < '\0') {
      __ZdlPv(unaff_x20[2]);
    }
    __ZdlPv(unaff_x20);
    unaff_x20 = (long *)lVar3;
  }
  lVar3 = unaff_x19[0x33];
  unaff_x19[0x33] = 0;
  if (lVar3 != 0) {
    __ZdlPv();
  }
  if (unaff_x19[0x25] != 0) {
    unaff_x19[0x26] = unaff_x19[0x25];
    __ZdlPv();
  }
  if (unaff_x19[0x22] != 0) {
    unaff_x19[0x23] = unaff_x19[0x22];
    __ZdlPv();
  }
  func_0x0005e914(unaff_x19 + 0x1f,unaff_x19[0x20]);
  if (*(char *)((long)unaff_x19 + 0xf7) < '\0') {
    __ZdlPv(unaff_x19[0x1c]);
    cVar1 = *(char *)((long)unaff_x19 + 0xdf);
  }
  else {
    cVar1 = *(char *)((long)unaff_x19 + 0xdf);
  }
  if (cVar1 < '\0') {
    __ZdlPv(unaff_x19[0x19]);
    cVar1 = *(char *)((long)unaff_x19 + 0xbf);
  }
  else {
    cVar1 = *(char *)((long)unaff_x19 + 0xbf);
  }
  if (cVar1 < '\0') {
    __ZdlPv(unaff_x19[0x15]);
    cVar1 = *(char *)((long)unaff_x19 + 0x9f);
  }
  else {
    cVar1 = *(char *)((long)unaff_x19 + 0x9f);
  }
  if (cVar1 < '\0') {
    __ZdlPv(unaff_x19[0x11]);
    cVar1 = *(char *)((long)unaff_x19 + 0x87);
  }
  else {
    cVar1 = *(char *)((long)unaff_x19 + 0x87);
  }
  if (cVar1 < '\0') {
    __ZdlPv(unaff_x19[0xe]);
    plVar2 = (long *)unaff_x19[0xb];
  }
  else {
    plVar2 = (long *)unaff_x19[0xb];
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

