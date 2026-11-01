
undefined8 FUN_00423aec(void)

{
  long lVar1;
  undefined8 uVar2;
  ulong uVar3;
  undefined8 *unaff_x20;
  undefined1 auVar4 [16];
  
  uVar2 = *unaff_x20;
  lVar1 = unaff_x20[1];
  auVar4 = (**(code **)(lVar1 + 0x18))(uVar2);
  if ((auVar4._0_8_ == -0x4674e48ea859be88 && auVar4._8_8_ == 0x63eb502cd6cb5d6d) ||
     (auVar4 = (**(code **)(lVar1 + 0x18))(uVar2),
     auVar4._0_8_ == -0x6fc1c45dc407a2e1 && auVar4._8_8_ == -0x918ee8033412eb2)) {
    uVar3 = func_0x0046920c();
    if (((uVar3 & 1) != 0) || (uVar2 = func_0x0046920c(), (int)uVar2 != 0)) {
      uVar2 = 1;
    }
  }
  else {
    uVar2 = 0;
  }
  return uVar2;
}

