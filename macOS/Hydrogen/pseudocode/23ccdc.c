
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_0023ccdc(undefined8 param_1,undefined8 param_2,long param_3,undefined8 param_4,
                 undefined8 param_5)

{
  undefined1 auVar1 [16];
  undefined8 in_stack_00000020;
  undefined1 uStack0000000000000028;
  long in_stack_00000058;
  undefined8 uStack_130;
  undefined8 uStack_128;
  undefined8 uStack_120;
  undefined8 uStack_118;
  undefined1 auStack_110 [120];
  undefined1 uStack_98;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  undefined8 uStack_68;
  long lStack_58;
  long lStack_50;
  undefined8 uStack_48;
  undefined8 uStack_40;
  undefined8 uStack_38;
  
  if (in_stack_00000058 != 0) {
    param_3 = 2;
    func_0x00187bd4(in_stack_00000020,in_stack_00000058 << 2);
  }
  func_0x00231398(&uStack0000000000000028);
  __Unwind_Resume();
  auVar1 = func_0x007a2668();
  lStack_58 = auVar1._8_8_;
  uStack_88 = 1;
  uStack_40 = 0;
  uStack_38 = 0;
  lStack_50 = lStack_58 + param_3 * 0x18;
  uStack_70 = 1;
  uStack_68 = 0;
  uStack_48 = 0;
  uStack_80 = param_4;
  uStack_78 = param_5;
  func_0x001a4cd4(auStack_110,&uStack_88,&UNK_009c2508);
  uStack_120 = 1;
  uStack_118 = 0;
  uStack_98 = 8;
  uStack_128 = _UNK_008296a8;
  uStack_130 = _UNK_008296a0;
  func_0x0024a370(auVar1._0_8_,&uStack_130);
  return;
}

