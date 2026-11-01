
void FUN_00070d68(long param_1)

{
  char cVar1;
  undefined8 *unaff_x19;
  
  unaff_x19[7] = 0;
  if (param_1 != 0) {
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

