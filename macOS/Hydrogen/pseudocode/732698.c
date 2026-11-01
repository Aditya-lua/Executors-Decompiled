
undefined8 FUN_00732698(long param_1)

{
  long lVar1;
  undefined8 unaff_x19;
  undefined8 unaff_x20;
  long unaff_x21;
  undefined8 unaff_x22;
  
  *(uint *)(&UNK_00001344 + param_1) = *(uint *)(&UNK_00001344 + param_1) | 0x100000;
  lVar1 = *(long *)(unaff_x21 + 0x78);
  *(undefined8 *)(unaff_x21 + 0x90) = unaff_x22;
  *(undefined8 *)(lVar1 + 0xd0) = unaff_x20;
  *(undefined8 *)(unaff_x21 + 0x80) = unaff_x20;
  *(undefined8 *)(unaff_x21 + 0x88) = unaff_x19;
  *(undefined8 *)(lVar1 + 0xe0) = unaff_x19;
  return 0;
}

