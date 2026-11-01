
void FUN_00553924(void)

{
  undefined8 *puVar1;
  long lVar2;
  long *plVar3;
  long *unaff_x20;
  undefined8 *unaff_x21;
  long unaff_x22;
  long unaff_x23;
  
  while( true ) {
    puVar1 = unaff_x21 + 2;
    unaff_x23 = unaff_x23 + -1;
    if (unaff_x23 == 0) break;
    lVar2 = *(long *)unaff_x21[1];
    *(long *)unaff_x21[1] = lVar2 + unaff_x22;
    LORelease();
    if (lVar2 == 1) {
      func_0x005d2ac4();
    }
    plVar3 = (long *)*puVar1;
    unaff_x21 = puVar1;
    if (plVar3 != (long *)0x0) {
      lVar2 = *plVar3;
      *plVar3 = lVar2 + unaff_x22;
      LORelease();
      if (lVar2 == 1) {
        func_0x005d2ac4(puVar1);
      }
    }
  }
  if (*unaff_x20 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

