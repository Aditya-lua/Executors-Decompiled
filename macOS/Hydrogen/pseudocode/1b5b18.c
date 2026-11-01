
void FUN_001b5b18(void)

{
  undefined8 *puVar1;
  undefined8 *extraout_x8;
  undefined8 uStack_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  long lStack_40;
  long lStack_38;
  undefined8 uStack_30;
  long lStack_28;
  
  puVar1 = (undefined8 *)__Unwind_Resume();
  func_0x003f1a7c(&uStack_70,puVar1 + 3);
  uStack_30 = *puVar1;
  lStack_40 = puVar1[1];
  lStack_28 = lStack_40 + puVar1[2] * 0x20;
  lStack_38 = lStack_40;
  func_0x00218adc(&uStack_58,&lStack_40,&UNK_009c2468);
  extraout_x8[4] = uStack_68;
  extraout_x8[3] = uStack_70;
  extraout_x8[5] = uStack_60;
  extraout_x8[1] = uStack_50;
  *extraout_x8 = uStack_58;
  extraout_x8[2] = uStack_48;
  return;
}

