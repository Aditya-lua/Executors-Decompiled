
/* WARNING: Possible PIC construction at 0x005c98cc: Changing call to branch */

void FUN_005c97a4(void)

{
  undefined1 in_ZR;
  long lVar1;
  long *plVar2;
  long *plVar3;
  long unaff_x19;
  long *unaff_x21;
  undefined8 *unaff_x22;
  long unaff_x23;
  long unaff_x24;
  long *plVar4;
  
  while( true ) {
    if ((bool)in_ZR) {
      func_0x005d2ac4(unaff_x22);
    }
    unaff_x22 = unaff_x22 + 2;
    unaff_x23 = unaff_x23 + -1;
    if (unaff_x23 == 0) break;
    lVar1 = *(long *)*unaff_x22;
    *(long *)*unaff_x22 = lVar1 + unaff_x24;
    LORelease();
    in_ZR = lVar1 == 1;
  }
  if (*unaff_x21 == 0) {
    __Unwind_Resume();
    plVar3 = (long *)func_0x007a2668();
    plVar2 = (long *)plVar3[1];
    plVar4 = plVar2;
    for (lVar1 = plVar3[2]; lVar1 != 0; lVar1 = lVar1 + -1) {
      if (*plVar4 != 0xc) {
        func_0x0059ce88(plVar4);
      }
      func_0x0059ce88(plVar4 + 8);
      plVar4 = plVar4 + 0x10;
    }
    if (*plVar3 == 0) {
      return;
    }
    lVar1 = *plVar3 << 7;
  }
  else {
    plVar2 = *(long **)(unaff_x19 + 0x10);
    lVar1 = *unaff_x21 << 4;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(plVar2,lVar1,8);
  return;
}

