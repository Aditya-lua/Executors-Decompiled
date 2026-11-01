
void FUN_004b75b8(long param_1)

{
  long lVar1;
  long unaff_x19;
  long *unaff_x20;
  long lVar2;
  
  if (param_1 != 0) {
    lVar2 = 0;
    param_1 = 1 - param_1;
    do {
      lVar1 = **(long **)(unaff_x19 + lVar2);
      **(long **)(unaff_x19 + lVar2) = lVar1 + -1;
      LORelease();
      if (lVar1 == 1) {
        func_0x005d2ac4(unaff_x19 + lVar2);
      }
      lVar2 = lVar2 + 8;
      param_1 = param_1 + 1;
    } while (param_1 != 1);
  }
  if (*unaff_x20 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

