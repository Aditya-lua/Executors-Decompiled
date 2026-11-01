
void FUN_00629a18(undefined8 param_1)

{
  undefined8 *unaff_x19;
  long *unaff_x20;
  long *unaff_x21;
  
  *unaff_x19 = &UNK_00a0b1e8;
  unaff_x19[1] = &UNK_00a0b2d0;
  unaff_x19[2] = &UNK_00a0b328;
  unaff_x19[3] = param_1;
  (**(code **)(*unaff_x21 + 0x30))();
  (**(code **)(*unaff_x20 + 0x60))();
  return;
}

