
void FUN_004b617c(void)

{
  long lVar1;
  long unaff_x19;
  long unaff_x20;
  undefined8 *unaff_x21;
  long unaff_x22;
  
  while( true ) {
    unaff_x21 = unaff_x21 + 1;
    unaff_x20 = unaff_x20 + 1;
    if (unaff_x20 == 1) break;
    lVar1 = *(long *)*unaff_x21;
    *(long *)*unaff_x21 = lVar1 + unaff_x22;
    LORelease();
    if (lVar1 == 1) {
      func_0x005d2ac4(unaff_x21);
    }
  }
  if (*(long *)(unaff_x19 + 8) == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(*(undefined8 *)(unaff_x19 + 0x10),*(long *)(unaff_x19 + 8) << 3,8);
  return;
}

