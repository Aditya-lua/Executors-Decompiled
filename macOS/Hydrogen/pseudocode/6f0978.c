
long FUN_006f0978(void)

{
  long unaff_x20;
  long unaff_x22;
  long unaff_x23;
  long unaff_x24;
  long unaff_x25;
  long unaff_x26;
  long unaff_x27;
  double dVar1;
  double unaff_d9;
  
  dVar1 = (double)func_0x006f5d58();
  *(double *)(&UNK_00001b70 + unaff_x20) =
       *(double *)(&UNK_00001b70 + unaff_x20) + (dVar1 - unaff_d9);
  *(byte *)(unaff_x20 + 0x20) = *(byte *)(unaff_x20 + 0x20) ^ 3;
  *(undefined8 *)(unaff_x20 + 0x2f0) = *(undefined8 *)(unaff_x20 + 0x2e8);
  *(undefined1 *)(unaff_x20 + 0x21) = 4;
  return unaff_x23 + unaff_x22 + unaff_x24 + unaff_x25 + unaff_x26 + unaff_x27;
}

