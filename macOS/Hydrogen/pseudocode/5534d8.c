
void FUN_005534d8(void)

{
  long lVar1;
  long *unaff_x20;
  undefined8 *unaff_x21;
  long unaff_x22;
  long unaff_x23;
  
  do {
    lVar1 = *(long *)unaff_x21[-2];
    *(long *)unaff_x21[-2] = lVar1 + unaff_x22;
    LORelease();
    if (lVar1 == 1) {
      func_0x005d2ac4();
    }
    lVar1 = *(long *)*unaff_x21;
    *(long *)*unaff_x21 = lVar1 + unaff_x22;
    LORelease();
    if (lVar1 == 1) {
      func_0x005d2ac4(unaff_x21);
    }
    unaff_x21 = unaff_x21 + 3;
    unaff_x23 = unaff_x23 + -1;
  } while (unaff_x23 != 0);
  if (*unaff_x20 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

