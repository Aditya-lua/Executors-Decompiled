
void FUN_0022cb98(undefined8 param_1,undefined8 param_2)

{
  undefined1 uVar1;
  undefined1 in_w9;
  undefined4 in_w10;
  undefined4 in_register_00004054;
  undefined1 in_w11;
  ulong in_x12;
  undefined8 *unaff_x21;
  long unaff_x22;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000058;
  undefined6 in_stack_00000060;
  
  uVar1 = 2;
  if (1 < in_x12) {
    uVar1 = in_w9;
  }
  if (unaff_x22 == CONCAT44(in_register_00004054,in_w10) ||
      unaff_x22 < CONCAT44(in_register_00004054,in_w10)) {
    in_w11 = uVar1;
  }
  unaff_x21[2] = param_2;
  unaff_x21[3] = 1;
  *(undefined1 *)(unaff_x21 + 4) = in_w11;
  *(char *)((long)unaff_x21 + 0x21) = (char)in_w10;
  *(undefined8 *)((long)unaff_x21 + 0x2a) = in_stack_00000058;
  *(undefined8 *)((long)unaff_x21 + 0x22) = in_stack_00000050;
  unaff_x21[6] = CONCAT62(in_stack_00000060,in_stack_00000058._6_2_);
  *unaff_x21 = param_1;
  unaff_x21[1] = 1;
  func_0x0022200c();
  func_0x00222d04();
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

