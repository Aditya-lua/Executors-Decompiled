
bool FUN_0047162c(undefined8 param_1)

{
  undefined8 uVar1;
  undefined1 auVar2 [16];
  
  func_0x007a28b0(param_1,3);
  uVar1 = func_0x007a20e8(&UNK_009e0b90);
  func_0x007a2570(uVar1,3,&UNK_009e0b90);
  auVar2 = func_0x007a247c(&UNK_00894ddb,0x1e,&UNK_009e0b90);
  return *(short *)(auVar2._0_8_ + 8) == *(short *)(auVar2._8_8_ + 8) &&
         *(char *)(auVar2._0_8_ + 10) == *(char *)(auVar2._8_8_ + 10);
}

