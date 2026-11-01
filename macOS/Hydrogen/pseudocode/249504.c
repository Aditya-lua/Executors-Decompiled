
void FUN_00249504(undefined8 param_1,undefined8 param_2,int param_3,undefined1 param_4)

{
  long lVar1;
  undefined8 *extraout_x8;
  undefined1 auVar2 [12];
  undefined8 uStack_f0;
  uint uStack_e8;
  undefined2 uStack_38;
  
  func_0x00245b38();
  __Unwind_Resume();
  auVar2 = func_0x007a2668();
  lVar1 = auVar2._0_8_;
  uStack_e8 = (auVar2._8_4_ & 0xff) << 0x10 | param_3 << 0x18 | 1;
  uStack_38 = 4;
  uStack_f0 = 0x8000000000000001;
  func_0x00248ae4(lVar1,&uStack_f0,*(char *)(lVar1 + 0x49) == '\x02');
  *(undefined1 *)(lVar1 + 0x335) = 1;
  *(undefined1 *)(extraout_x8 + 1) = param_4;
  *extraout_x8 = 0x800000000000001a;
  return;
}

