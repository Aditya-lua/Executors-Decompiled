
void FUN_00725648(void)

{
  long unaff_x19;
  
  __ZdlPv();
  if (*(char *)(unaff_x19 + 0x50) != '\0') {
    if (*(long *)(unaff_x19 + 0x30) != 0) {
      *(long *)(unaff_x19 + 0x38) = *(long *)(unaff_x19 + 0x30);
      __ZdlPv();
    }
    if (*(long *)(unaff_x19 + 8) != 0) {
      __ZdlPv();
      *(long *)(unaff_x19 + 8) = 0;
      *(undefined8 *)(unaff_x19 + 0x10) = 0;
    }
  }
  return;
}

