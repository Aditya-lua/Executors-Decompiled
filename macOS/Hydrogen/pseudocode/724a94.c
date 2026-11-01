
void FUN_00724a94(void)

{
  undefined1 in_ZR;
  long unaff_x19;
  undefined8 *unaff_x20;
  undefined8 *unaff_x21;
  undefined8 *unaff_x22;
  
  while (!(bool)in_ZR) {
    (**(code **)*unaff_x22)(unaff_x20);
    in_ZR = unaff_x20 == unaff_x21;
    unaff_x20 = unaff_x22 + -6;
    unaff_x22 = unaff_x22 + -6;
  }
  *(undefined8 **)(unaff_x19 + 0x10) = unaff_x21;
  __ZdlPv(*(undefined8 *)(unaff_x19 + 8));
  __ZNSt9exceptionD2Ev();
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR___ZdlPv_009b01b8)();
  return;
}

