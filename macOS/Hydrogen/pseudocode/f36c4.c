
void FUN_000f36c4(void)

{
  undefined4 *puVar1;
  long unaff_x19;
  long unaff_x20;
  undefined4 unaff_w21;
  undefined4 unaff_w22;
  undefined4 unaff_w23;
  
  _memcpy();
  func_0x000b83d4(*(undefined8 *)(unaff_x19 + 0x80));
  *(long *)(unaff_x19 + 0x80) = unaff_x20;
  *(undefined4 *)(unaff_x19 + 0x7c) = unaff_w23;
  puVar1 = (undefined4 *)(unaff_x20 + (long)*(int *)(unaff_x19 + 0x78) * 8);
  *puVar1 = unaff_w22;
  puVar1[1] = unaff_w21;
  *(int *)(unaff_x19 + 0x78) = *(int *)(unaff_x19 + 0x78) + 1;
  return;
}

