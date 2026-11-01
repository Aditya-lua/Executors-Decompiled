
long * FUN_0061f9cc(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  int iVar1;
  long *plVar2;
  undefined1 auVar3 [16];
  
  __Unwind_Resume();
  auVar3 = func_0x0001753c();
  plVar2 = auVar3._0_8_;
  *plVar2 = (long)&UNK_009f46d8;
  func_0x005edf2c(plVar2 + 1,1);
  plVar2[5] = 0;
  plVar2[6] = 0;
  plVar2[4] = -1;
  plVar2[9] = 0;
  plVar2[10] = 0;
  plVar2[8] = -1;
  plVar2[0xd] = 0;
  plVar2[0xe] = 0;
  plVar2[0xc] = -1;
  *plVar2 = (long)&UNK_009f9c38;
  plVar2[1] = (long)&UNK_009f9d28;
  plVar2[2] = 0;
  func_0x005ee684(plVar2,param_3);
  plVar2[2] = auVar3._8_8_;
  (**(code **)(*plVar2 + 0x98))(plVar2);
  (**(code **)(*plVar2 + 0x90))(plVar2,param_4);
  iVar1 = (**(code **)(*plVar2 + 0x40))(plVar2);
  if (iVar1 < 4) {
    (**(code **)(*plVar2 + 0x60))(plVar2,param_3,0xffffffff);
  }
  return plVar2;
}

