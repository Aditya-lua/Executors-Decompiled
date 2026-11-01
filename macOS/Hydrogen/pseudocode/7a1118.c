
bool FUN_007a1118(undefined8 param_1)

{
  long *plVar1;
  long unaff_x29;
  undefined1 uStack0000000000000020;
  undefined8 uStack0000000000000028;
  long lStack0000000000000030;
  undefined8 uStack0000000000000038;
  undefined8 uStack0000000000000040;
  
  uStack0000000000000028 = 4;
  lStack0000000000000030 = unaff_x29 + -0x30;
  uStack0000000000000038 = 3;
  uStack0000000000000040 = 0;
  _uStack0000000000000020 = param_1;
  func_0x007a2420(&uStack0000000000000020,&UNK_009db038);
  plVar1 = (long *)(*pcRam0000000000a2bcb8)();
  return *plVar1 == 0;
}

