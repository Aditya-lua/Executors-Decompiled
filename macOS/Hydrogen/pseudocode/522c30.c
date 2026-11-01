
undefined8 FUN_00522c30(long param_1)

{
  undefined8 uVar1;
  undefined8 *puVar2;
  long unaff_x23;
  long unaff_x29;
  long in_stack_00000060;
  undefined8 in_stack_00000068;
  long in_stack_00000078;
  long in_stack_00000080;
  long in_stack_00000088;
  long lStack00000000000000e8;
  
  lStack00000000000000e8 = param_1;
  if (unaff_x23 != 0) {
    lStack00000000000000e8 = unaff_x23;
  }
  func_0x00525f7c(unaff_x29 + -0x70,(long)register0x00000008 + 0xe0,8,0);
  uVar1 = func_0x0051c7e8();
  if (in_stack_00000060 != 0) {
    func_0x00187bd4(in_stack_00000068,in_stack_00000060 << 4,8);
  }
  if (in_stack_00000088 != 0) {
    puVar2 = (undefined8 *)(in_stack_00000080 + 8);
    do {
      if (puVar2[-1] != 0) {
        func_0x00187bd4(*puVar2,puVar2[-1] << 4,8);
      }
      puVar2 = puVar2 + 3;
      in_stack_00000088 = in_stack_00000088 + -1;
    } while (in_stack_00000088 != 0);
  }
  if (in_stack_00000078 != 0) {
    func_0x00187bd4(in_stack_00000080,in_stack_00000078 * 0x18,8);
  }
  return uVar1;
}

