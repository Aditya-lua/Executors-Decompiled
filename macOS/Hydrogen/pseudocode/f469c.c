
void FUN_000f469c(void)

{
  long unaff_x19;
  undefined8 *unaff_x21;
  long unaff_x22;
  undefined4 unaff_w23;
  
  _memcpy();
  func_0x000b83d4(*(undefined8 *)(unaff_x19 + 0x80));
  *(long *)(unaff_x19 + 0x80) = unaff_x22;
  *(undefined4 *)(unaff_x19 + 0x7c) = unaff_w23;
  *(undefined8 *)(unaff_x22 + (long)*(int *)(unaff_x19 + 0x78) * 8) = *unaff_x21;
  *(int *)(unaff_x19 + 0x78) = *(int *)(unaff_x19 + 0x78) + 1;
  func_0x000f1888();
  *(undefined4 *)(unaff_x19 + 0x78) = 0;
  return;
}

