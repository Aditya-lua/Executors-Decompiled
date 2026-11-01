
void FUN_00278294(long param_1)

{
  undefined1 in_ZR;
  long unaff_x19;
  long unaff_x20;
  undefined1 auVar1 [16];
  undefined1 auStack_30 [16];
  
  while (!(bool)in_ZR) {
    *(undefined1 *)(unaff_x20 + param_1) = 0;
    param_1 = param_1 + 1;
    in_ZR = unaff_x19 == param_1;
  }
  func_0x00187bd4();
  auVar1 = __Unwind_Resume();
  func_0x00469240(auStack_30,auVar1._8_8_,&UNK_0082dda3,0xb);
  func_0x004653b0(auStack_30,&UNK_0082dd30,9,*(undefined8 *)(auVar1._0_8_ + 0x10),&UNK_009cced8);
  func_0x00465628();
  return;
}

