
void FUN_000f2434(void)

{
  long unaff_x19;
  undefined8 *unaff_x20;
  long unaff_x21;
  undefined4 unaff_w22;
  
  _memcpy();
  func_0x000b83d4(*(undefined8 *)(unaff_x19 + 0x80));
  *(long *)(unaff_x19 + 0x80) = unaff_x21;
  *(undefined4 *)(unaff_x19 + 0x7c) = unaff_w22;
  *(undefined8 *)(unaff_x21 + (long)*(int *)(unaff_x19 + 0x78) * 8) = *unaff_x20;
  *(int *)(unaff_x19 + 0x78) = *(int *)(unaff_x19 + 0x78) + 1;
  return;
}

