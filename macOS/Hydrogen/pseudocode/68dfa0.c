
long FUN_0068dfa0(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                 undefined4 param_5)

{
  long lVar1;
  long lVar2;
  
  __Unwind_Resume();
  lVar1 = func_0x0001753c();
  lVar2 = func_0x005fe0b4();
  func_0x005fe0b4(lVar2 + 0x30,param_3);
  func_0x005fe0b4(lVar1 + 0x60,param_4);
  *(undefined4 *)(lVar1 + 0x90) = param_5;
  *(undefined8 *)(lVar1 + 0xa0) = 0;
  *(undefined8 *)(lVar1 + 0x98) = 0;
  *(undefined8 *)(lVar1 + 0xb0) = 0;
  *(undefined8 *)(lVar1 + 0xa8) = 0;
  func_0x0068e070(lVar1);
  return lVar1;
}

