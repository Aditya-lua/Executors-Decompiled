
void FUN_00629a28(undefined8 param_1)

{
  long in_x9;
  long unaff_x19;
  long *unaff_x20;
  long *unaff_x21;
  
  *(long *)(unaff_x19 + 0x10) = in_x9 + 0x140;
  *(undefined8 *)(unaff_x19 + 0x18) = param_1;
  (**(code **)(*unaff_x21 + 0x30))();
  (**(code **)(*unaff_x20 + 0x60))();
  return;
}

