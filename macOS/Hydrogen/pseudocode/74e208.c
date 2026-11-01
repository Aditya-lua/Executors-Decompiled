
undefined8 FUN_0074e208(code *param_1,undefined8 param_2)

{
  long lVar1;
  long lVar2;
  long lVar3;
  long unaff_x19;
  long unaff_x20;
  undefined1 uStack0000000000000008;
  
  lVar1 = (*param_1)(param_2,8);
  lVar1 = func_0x00740a58(unaff_x20 + lVar1 * 0x20);
  if (lVar1 != 0) {
    do {
      lVar2 = func_0x00156654(lVar1);
      lVar3 = (**(code **)(unaff_x19 + 0x10))
                        (lVar2 + 0x38,*(undefined8 *)(lVar2 + 0x30),&uStack0000000000000008,8);
      if (lVar3 != 0) {
        return *(undefined8 *)(lVar2 + 0x20);
      }
      lVar1 = func_0x006f4058(lVar1);
    } while (lVar1 != 0);
  }
  return 0;
}

