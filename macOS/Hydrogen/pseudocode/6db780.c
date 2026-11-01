
undefined8 FUN_006db780(void)

{
  long unaff_x19;
  ulong unaff_x21;
  
  for (; unaff_x21 < *(ulong *)(unaff_x19 + 0x38); unaff_x21 = unaff_x21 + 1) {
    (**(code **)**(undefined8 **)(*(long *)(unaff_x19 + 0x30) + unaff_x21 * 8))();
  }
  return 0;
}

