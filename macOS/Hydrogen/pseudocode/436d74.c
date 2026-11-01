
void FUN_00436d74(undefined8 param_1)

{
  undefined1 *puVar1;
  undefined4 *unaff_x19;
  undefined4 unaff_w21;
  long *plVar2;
  undefined8 unaff_x22;
  uint unaff_w25;
  uint unaff_w27;
  undefined8 in_stack_00000008;
  long in_stack_00000010;
  long in_stack_00000018;
  long in_stack_00000020;
  long in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000058;
  undefined8 in_stack_00000060;
  
  *(undefined8 *)(unaff_x19 + 3) = param_1;
  unaff_x19[5] = in_stack_00000048._4_4_;
  *unaff_x19 = unaff_w21;
  *(undefined8 *)(unaff_x19 + 1) = unaff_x22;
  if (1 < unaff_w25) {
    _close(in_stack_00000050._4_4_);
  }
  if (1 < unaff_w27) {
    _close(in_stack_00000058._4_4_);
  }
  if (1 < in_stack_00000008._4_4_) {
    _close(in_stack_00000060._4_4_);
  }
  if (in_stack_00000010 != -0x8000000000000000) {
    if (in_stack_00000020 != 0) {
      plVar2 = (long *)(in_stack_00000018 + 8);
      do {
        puVar1 = (undefined1 *)plVar2[-1];
        *puVar1 = 0;
        if (*plVar2 != 0) {
          func_0x00187bd4(puVar1,*plVar2,1);
        }
        plVar2 = plVar2 + 2;
        in_stack_00000020 = in_stack_00000020 + -1;
      } while (in_stack_00000020 != 0);
    }
    if (in_stack_00000010 != 0) {
      func_0x00187bd4(in_stack_00000018,in_stack_00000010 << 4,8);
    }
    if (in_stack_00000028 != 0) {
      func_0x00187bd4(in_stack_00000030,in_stack_00000028 << 3,8);
    }
  }
  return;
}

