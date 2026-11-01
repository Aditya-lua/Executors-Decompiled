
void FUN_0022e764(undefined8 param_1)

{
  undefined8 unaff_x20;
  undefined8 *unaff_x21;
  undefined1 unaff_w22;
  undefined8 unaff_x23;
  undefined1 unaff_w25;
  
  unaff_x21[3] = param_1;
  *(undefined1 *)(unaff_x21 + 4) = unaff_w22;
  *(undefined1 *)((long)unaff_x21 + 0x21) = unaff_w25;
  *unaff_x21 = unaff_x23;
  unaff_x21[1] = param_1;
  *(int *)(unaff_x21 + 2) = (int)unaff_x20;
  *(int *)((long)unaff_x21 + 0x14) = (int)((ulong)unaff_x20 >> 0x20);
  func_0x002220d4();
  func_0x00187bd4();
  return;
}

