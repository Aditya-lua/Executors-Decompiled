
void FUN_00629a10(long param_1)

{
  undefined8 in_x9;
  undefined8 *unaff_x19;
  long *unaff_x20;
  long *unaff_x21;
  
  unaff_x19[4] = in_x9;
  unaff_x19[5] = param_1 + 0x180;
  *unaff_x19 = &UNK_00a0b1e8;
  unaff_x19[1] = &UNK_00a0b2d0;
  unaff_x19[2] = &UNK_00a0b328;
  unaff_x19[3] = param_1;
  (**(code **)(*unaff_x21 + 0x30))();
  (**(code **)(*unaff_x20 + 0x60))();
  return;
}

