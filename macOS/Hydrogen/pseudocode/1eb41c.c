
undefined8
FUN_001eb41c(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
            undefined8 param_5,ulong param_6,undefined8 param_7,undefined8 param_8)

{
  long lVar1;
  undefined8 uVar2;
  undefined1 auVar3 [16];
  long lStack_c0;
  undefined8 uStack_b8;
  undefined8 uStack_b0;
  undefined *puStack_a8;
  undefined8 uStack_a0;
  undefined8 uStack_98;
  undefined8 uStack_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  long lStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  
  auVar3 = __Unwind_Resume();
  func_0x001ebb0c(&lStack_68,param_3);
  lVar1 = (param_6 & 0xff) * 8;
  uStack_80 = *(undefined8 *)(&UNK_0081f6e8 + lVar1);
  uStack_88 = *(undefined8 *)(&UNK_009c4240 + lVar1);
  puStack_a8 = &UNK_0081f5b0;
  uStack_a0 = 7;
  uStack_98 = uStack_60;
  uStack_90 = uStack_58;
  uStack_78 = param_7;
  uStack_70 = param_8;
  func_0x001e1508(&lStack_c0,&puStack_a8,4);
  if (lStack_68 != 0) {
    func_0x00187bd4(uStack_60,lStack_68,1);
  }
  uVar2 = (**(code **)(auVar3._8_8_ + 0x20))(auVar3._0_8_,param_4,param_5,uStack_b8,uStack_b0);
  if (lStack_c0 != 0) {
    func_0x00187bd4(uStack_b8,lStack_c0,1);
  }
  return uVar2;
}

