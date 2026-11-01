
undefined8 FUN_00423b28(void)

{
  undefined8 uVar1;
  ulong uVar2;
  long unaff_x20;
  undefined1 auVar3 [16];
  
  auVar3 = (**(code **)(unaff_x20 + 0x18))();
  if (auVar3._0_8_ == -0x6fc1c45dc407a2e1 && auVar3._8_8_ == -0x918ee8033412eb2) {
    uVar2 = func_0x0046920c();
    if (((uVar2 & 1) != 0) || (uVar1 = func_0x0046920c(), (int)uVar1 != 0)) {
      uVar1 = 1;
    }
  }
  else {
    uVar1 = 0;
  }
  return uVar1;
}

