
void FUN_00070318(void)

{
  char cVar1;
  long unaff_x19;
  
  __ZdlPv();
  if (*(char *)(unaff_x19 + 0x4f) < '\0') {
    __ZdlPv(*(undefined8 *)(unaff_x19 + 0x38));
    cVar1 = *(char *)(unaff_x19 + 0x37);
  }
  else {
    cVar1 = *(char *)(unaff_x19 + 0x37);
  }
  if (cVar1 < '\0') {
    __ZdlPv(*(undefined8 *)(unaff_x19 + 0x20));
  }
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR___ZdlPv_009b01b8)();
  return;
}

