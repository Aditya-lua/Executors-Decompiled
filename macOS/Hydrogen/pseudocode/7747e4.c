
undefined8 FUN_007747e4(void)

{
  long lVar1;
  undefined8 uVar2;
  long *unaff_x19;
  long unaff_x20;
  long *unaff_x21;
  undefined8 *unaff_x22;
  
  do {
    lVar1 = *unaff_x21;
    *(long *)(unaff_x20 + 0x148) = unaff_x21[1];
    (**(code **)(lVar1 + 0x18))();
    (*(code *)*unaff_x22)(unaff_x21);
    unaff_x21 = *(long **)(unaff_x20 + 0x148);
  } while (unaff_x21 != (long *)0x0);
  uVar2 = func_0x007745bc();
  if ((unaff_x19 != (long *)0x0) && ((int)uVar2 != 0)) {
    (**(code **)(*unaff_x19 + 0x18))();
    (*(code *)*unaff_x22)();
  }
  return uVar2;
}

