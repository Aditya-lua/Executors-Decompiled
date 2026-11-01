
void FUN_006387e0(undefined1 param_1 [16],long param_2)

{
  undefined8 *unaff_x19;
  
  *(long *)(param_2 + 0x17) = param_1._8_8_;
  *(long *)(param_2 + 0xf) = param_1._0_8_;
  *(undefined1 *)(param_2 + 0x1f) = 0;
  *unaff_x19 = &UNK_009b2ec8;
  *(undefined4 *)(unaff_x19 + 1) = 4;
  func_0x00017634(unaff_x19 + 2);
  *unaff_x19 = &UNK_00a084b0;
  __ZdlPv();
  *unaff_x19 = &UNK_00a09b30;
  return;
}

