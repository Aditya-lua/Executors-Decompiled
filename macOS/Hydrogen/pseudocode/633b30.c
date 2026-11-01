
void FUN_00633b30(long param_1)

{
  long unaff_x19;
  long unaff_x20;
  
  *(undefined8 *)(unaff_x19 + *(long *)(param_1 + -0x70)) = *(undefined8 *)(unaff_x20 + 0x40);
  func_0x00631cc8(unaff_x19 + 0x28);
  *(undefined **)(unaff_x19 + 0x10) = &UNK_00a09aa0;
  if (*(long **)(unaff_x19 + 0x20) != (long *)0x0) {
    (**(code **)(**(long **)(unaff_x19 + 0x20) + 8))();
  }
  if (*(long **)(unaff_x19 + 0x18) != (long *)0x0) {
    (**(code **)(**(long **)(unaff_x19 + 0x18) + 8))();
  }
  return;
}

