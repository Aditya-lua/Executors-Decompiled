
void FUN_00422340(undefined1 param_1 [16],undefined1 param_2 [16],undefined1 param_3 [16],
                 undefined1 param_4 [16],undefined1 param_5 [16],undefined1 param_6 [16],
                 undefined8 param_7)

{
  undefined4 in_w8;
  undefined8 in_x9;
  undefined8 *unaff_x19;
  undefined4 in_stack_00000060;
  
  *(long *)((long)unaff_x19 + 0x54) = param_1._8_8_;
  *(long *)((long)unaff_x19 + 0x4c) = param_1._0_8_;
  *(long *)((long)unaff_x19 + 100) = param_2._8_8_;
  *(long *)((long)unaff_x19 + 0x5c) = param_2._0_8_;
  *(long *)((long)unaff_x19 + 0x74) = param_3._8_8_;
  *(long *)((long)unaff_x19 + 0x6c) = param_3._0_8_;
  *(undefined4 *)((long)unaff_x19 + 0x7c) = in_stack_00000060;
  *(long *)((long)unaff_x19 + 0x24) = param_4._8_8_;
  *(long *)((long)unaff_x19 + 0x1c) = param_4._0_8_;
  *(long *)((long)unaff_x19 + 0x34) = param_5._8_8_;
  *(long *)((long)unaff_x19 + 0x2c) = param_5._0_8_;
  *(long *)((long)unaff_x19 + 0x44) = param_6._8_8_;
  *(long *)((long)unaff_x19 + 0x3c) = param_6._0_8_;
  *(undefined4 *)(unaff_x19 + 2) = in_w8;
  *(undefined8 *)((long)unaff_x19 + 0x14) = in_x9;
  *unaff_x19 = 0;
  unaff_x19[1] = param_7;
  return;
}

