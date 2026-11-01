
void FUN_00023490(long param_1)

{
  char cVar1;
  undefined8 *unaff_x19;
  
  if (*(long **)(param_1 + 0x30) != (long *)0x0) {
    (**(code **)(**(long **)(param_1 + 0x30) + 8))();
  }
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

