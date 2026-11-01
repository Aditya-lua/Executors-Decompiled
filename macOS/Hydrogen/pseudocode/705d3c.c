
void FUN_00705d3c(long param_1)

{
  char cVar1;
  long unaff_x19;
  
  if ((*(char *)(param_1 + 0x40) == '\0') || (-1 < *(char *)(unaff_x19 + 0x3f))) {
    cVar1 = *(char *)(unaff_x19 + 0x20);
  }
  else {
    __ZdlPv(*(undefined8 *)(unaff_x19 + 0x28));
    cVar1 = *(char *)(unaff_x19 + 0x20);
  }
  if ((cVar1 == '\0') || (-1 < *(char *)(unaff_x19 + 0x1f))) {
    return;
  }
  __ZdlPv(*(undefined8 *)(unaff_x19 + 8));
  return;
}

