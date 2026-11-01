
long * FUN_0064bee0(undefined8 param_1)

{
  long *plVar1;
  long unaff_x20;
  long unaff_x21;
  long lVar2;
  undefined1 uStack0000000000000018;
  
  if (unaff_x21 != -0x30) {
    lVar2 = unaff_x21 + 0x30;
    do {
      (*(code *)**(undefined8 **)(unaff_x20 + lVar2))();
      lVar2 = lVar2 + 0x30;
    } while (lVar2 != 0);
  }
  func_0x0064b2f0(&uStack0000000000000018);
  plVar1 = (long *)__Unwind_Resume(param_1);
  func_0x0064c1b0(plVar1,plVar1[1]);
  if (*plVar1 != 0) {
    __ZdlPv();
  }
  return plVar1;
}

