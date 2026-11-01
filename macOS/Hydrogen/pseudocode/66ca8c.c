
void FUN_0066ca8c(void)

{
  undefined4 in_w8;
  long unaff_x19;
  long *in_stack_00000008;
  undefined1 uStack000000000000001c;
  
  *(undefined4 *)(unaff_x19 + 0xcc) = in_w8;
  func_0x0066cbdc("BlockPaddingScheme",&uStack000000000000001c,1);
  func_0x0066b7cc();
  if (in_stack_00000008 != (long *)0x0) {
    (**(code **)(*in_stack_00000008 + 8))();
  }
  return;
}

