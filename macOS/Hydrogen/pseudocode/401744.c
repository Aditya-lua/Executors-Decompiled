
void FUN_00401744(void)

{
  undefined8 uVar1;
  long *plVar2;
  undefined8 *unaff_x19;
  long *unaff_x20;
  long unaff_x21;
  
  if ((long *)*unaff_x20 != (long *)0x0) {
    plVar2 = (long *)*unaff_x20;
    do {
      unaff_x20 = plVar2;
      unaff_x21 = unaff_x21 + 1;
      func_0x00187bd4();
      plVar2 = (long *)*unaff_x20;
    } while ((long *)*unaff_x20 != (long *)0x0);
  }
  uVar1 = 0x220;
  if (unaff_x21 != 0) {
    uVar1 = 0x280;
  }
  func_0x00187bd4(unaff_x20,uVar1,8);
  *unaff_x19 = 0;
  return;
}

