
undefined8 FUN_005f0144(undefined8 param_1)

{
  long lVar1;
  undefined8 uVar2;
  long unaff_x19;
  long *unaff_x23;
  undefined8 uStack0000000000000008;
  
  uStack0000000000000008 = param_1;
  lVar1 = func_0x006115d0();
  (**(code **)(*unaff_x23 + 0x80))();
  uVar2 = func_0x0068566c(lVar1);
  if (lVar1 != 0) {
    do {
      *(undefined1 *)(lVar1 + unaff_x19 + -1) = 0;
      unaff_x19 = unaff_x19 + -1;
    } while (unaff_x19 != 0);
    func_0x00611644(lVar1);
  }
  return uVar2;
}

