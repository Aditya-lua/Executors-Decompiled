
undefined1  [16]
FUN_0027ad28(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  bool bVar1;
  undefined1 auVar2 [16];
  char acStack_51 [17];
  undefined1 uStack_40;
  undefined8 uStack_3f;
  undefined8 uStack_37;
  
  __Unwind_Resume();
  auVar2 = func_0x007a2668();
  auVar2._8_8_ = auVar2._8_8_;
  bVar1 = (*auVar2._8_8_ & 1) == 0;
  if (bVar1) {
    uStack_37 = *(undefined8 *)(auVar2._8_8_ + 9);
    uStack_3f = *(undefined8 *)(auVar2._8_8_ + 1);
  }
  uStack_40 = !bVar1;
  func_0x0027ab88(acStack_51,auVar2._0_8_,&uStack_40,param_3,param_4);
  if (acStack_51[0] == '\x02') {
    param_3 = 0;
  }
  auVar2._8_8_ = param_4;
  auVar2._0_8_ = param_3;
  return auVar2;
}

