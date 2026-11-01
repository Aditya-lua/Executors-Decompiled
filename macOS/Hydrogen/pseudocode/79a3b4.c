
undefined8 FUN_0079a3b4(undefined8 param_1,undefined8 param_2)

{
  undefined8 uVar1;
  undefined1 auVar2 [16];
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined1 auStack_48 [16];
  long lStack_38;
  undefined8 uStack_30;
  
  func_0x007a1f00(param_1,param_2,&UNK_009c0210);
  auVar2 = func_0x007a1f00(in_stack_00000008,in_stack_00000010,&UNK_009c0210);
  uVar1 = *auVar2._0_8_;
  func_0x00469240(auStack_48,auVar2._8_8_,&UNK_0081b47d,0xe);
  func_0x00193394(&lStack_38,uVar1);
  func_0x004653b0(auStack_48,&UNK_0081b48b,7,&lStack_38,&UNK_009c1390);
  uVar1 = func_0x00465628();
  if (lStack_38 != 0) {
    func_0x00187bd4(uStack_30,lStack_38,1);
  }
  return uVar1;
}

