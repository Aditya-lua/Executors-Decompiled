
long * FUN_0061f3d4(undefined8 param_1)

{
  long *plVar1;
  undefined1 auVar2 [16];
  
  func_0x00041f4c();
  auVar2 = __Unwind_Resume(param_1);
  plVar1 = auVar2._0_8_;
  *plVar1 = (long)&UNK_009f46d8;
  func_0x005edf2c(plVar1 + 1,1);
  plVar1[5] = 0;
  plVar1[6] = 0;
  plVar1[4] = -1;
  plVar1[9] = 0;
  plVar1[10] = 0;
  plVar1[8] = -1;
  *plVar1 = (long)&UNK_009f9ab0;
  plVar1[1] = (long)&UNK_009f9ba0;
  plVar1[2] = 0;
  func_0x005ee574(plVar1);
  plVar1[2] = auVar2._8_8_;
  (**(code **)(*plVar1 + 0x98))(plVar1);
  return plVar1;
}

