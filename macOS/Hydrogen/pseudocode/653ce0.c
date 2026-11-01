
/* WARNING: Removing unreachable block (ram,0x00653dd4) */
/* WARNING: Removing unreachable block (ram,0x00653dd8) */
/* WARNING: Removing unreachable block (ram,0x00653ddc) */
/* WARNING: Removing unreachable block (ram,0x00653de8) */

void FUN_00653ce0(undefined8 param_1)

{
  undefined8 *puVar1;
  long *unaff_x19;
  int unaff_w20;
  long unaff_x21;
  undefined8 uStack0000000000000038;
  long *in_stack_00000040;
  
  puVar1 = (undefined8 *)func_0x0066a6b0(param_1,0);
  *puVar1 = &UNK_00a0eb18;
  puVar1[1] = &UNK_00a0ece0;
  func_0x0066a7f0();
  *unaff_x19 = (long)&UNK_009b3970;
  unaff_x19[1] = (long)&UNK_009b3b38;
  func_0x0003fb68(unaff_x19 + 6,0);
  *unaff_x19 = (long)&UNK_009b3748;
  unaff_x19[1] = (long)&UNK_009b3910;
  if (unaff_x21 != 0) {
    _strlen();
  }
  func_0x0003f610(&uStack0000000000000038,"InputBuffer");
  (**(code **)(*unaff_x19 + 0x58))();
  if (unaff_w20 != 0) {
    (**(code **)(*unaff_x19 + 0x1a8))();
  }
  uStack0000000000000038 = &UNK_009f6820;
  if (in_stack_00000040 != (long *)0x0) {
    (**(code **)(*in_stack_00000040 + 8))();
  }
  return;
}

