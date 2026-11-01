
void FUN_004b6164(long param_1)

{
  long unaff_x19;
  long unaff_x20;
  undefined8 *unaff_x21;
  long unaff_x22;
  
  while( true ) {
    if (param_1 == 1) {
      func_0x005d2ac4(unaff_x21);
    }
    unaff_x21 = unaff_x21 + 1;
    unaff_x20 = unaff_x20 + 1;
    if (unaff_x20 == 1) break;
    param_1 = *(long *)*unaff_x21;
    *(long *)*unaff_x21 = param_1 + unaff_x22;
    LORelease();
  }
  if (*(long *)(unaff_x19 + 8) == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(*(undefined8 *)(unaff_x19 + 0x10),*(long *)(unaff_x19 + 8) << 3,8);
  return;
}

