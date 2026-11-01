
undefined8 FUN_005f0134(void)

{
  long lVar1;
  undefined8 uVar2;
  ulong unaff_x21;
  long *unaff_x23;
  
  FUN_005f01d4();
  if (unaff_x21 < 2) {
    unaff_x21 = 1;
  }
  lVar1 = func_0x006115d0(unaff_x21);
  (**(code **)(*unaff_x23 + 0x80))();
  uVar2 = func_0x0068566c(lVar1);
  if (lVar1 != 0) {
    do {
      *(undefined1 *)(lVar1 + unaff_x21 + -1) = 0;
      unaff_x21 = unaff_x21 - 1;
    } while (unaff_x21 != 0);
    func_0x00611644(lVar1);
  }
  return uVar2;
}

