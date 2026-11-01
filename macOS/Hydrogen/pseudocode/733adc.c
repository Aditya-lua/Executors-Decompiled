
undefined8 FUN_00733adc(long param_1,undefined8 param_2)

{
  long lVar1;
  undefined8 uVar2;
  
  lVar1 = func_0x00740a58(param_1 + 0x58);
  if ((lVar1 != 0) && (lVar1 = func_0x00740a58(param_1 + 0x58), lVar1 != 0)) {
    do {
      uVar2 = func_0x00156654(lVar1);
      func_0x00768a04(*(undefined8 *)(param_1 + 0x78),uVar2);
      func_0x007317f8(*(undefined8 *)(param_1 + 0x78));
      func_0x0076891c(*(undefined8 *)(param_1 + 0x78));
      uVar2 = func_0x0077367c(param_2);
      if ((int)uVar2 != 0) {
        func_0x0077355c(param_2);
        return uVar2;
      }
      lVar1 = func_0x006f4058(lVar1);
    } while (lVar1 != 0);
  }
  return 0;
}

