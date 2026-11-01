
void FUN_004d5abc(void)

{
  undefined8 *puVar1;
  int unaff_w19;
  long unaff_x20;
  long unaff_x21;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  
  *(long *)(unaff_x20 + 0x38) = *(long *)(unaff_x20 + 0x38) + 1;
  if (unaff_w19 == -1) {
    if (unaff_x21 == *(long *)(unaff_x20 + 0x18)) {
      func_0x00582e78((long *)(unaff_x20 + 0x18),&UNK_009e6d88);
    }
    puVar1 = (undefined8 *)(*(long *)(unaff_x20 + 0x20) + unaff_x21 * 0x30);
    puVar1[1] = in_stack_00000008;
    *puVar1 = in_stack_00000000;
    puVar1[3] = in_stack_00000018;
    puVar1[2] = in_stack_00000010;
    puVar1[5] = in_stack_00000028;
    puVar1[4] = in_stack_00000020;
    *(long *)(unaff_x20 + 0x28) = unaff_x21 + 1;
  }
  return;
}

