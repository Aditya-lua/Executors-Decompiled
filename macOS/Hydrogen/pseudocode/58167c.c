
void FUN_0058167c(void)

{
  long lVar1;
  long *plVar2;
  long unaff_x19;
  long *unaff_x20;
  long unaff_x21;
  long unaff_x22;
  long unaff_x23;
  
  do {
    func_0x005d2ac4();
    do {
      unaff_x21 = unaff_x21 + 1;
      unaff_x22 = unaff_x22 + 0x10;
      if (unaff_x21 == 1) {
        if (*unaff_x20 == 0) {
          return;
        }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(code *)PTR__free_00a24e58)();
        return;
      }
      plVar2 = *(long **)(unaff_x19 + unaff_x22 + 8);
      lVar1 = *plVar2;
      *plVar2 = lVar1 + unaff_x23;
      LORelease();
    } while (lVar1 != 1);
  } while( true );
}

