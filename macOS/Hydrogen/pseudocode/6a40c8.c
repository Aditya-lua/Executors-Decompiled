
undefined8 FUN_006a40c8(void)

{
  byte bVar1;
  long unaff_x19;
  byte *unaff_x20;
  long unaff_x21;
  uint unaff_w22;
  double dVar2;
  
  for (; unaff_x19 != 0; unaff_x19 = unaff_x19 + -1) {
    bVar1 = *unaff_x20;
    if (1999 < unaff_w22) {
      dVar2 = (double)_log((double)(unaff_w22 - *(int *)(unaff_x21 + (ulong)bVar1 * 4 + 0x24)));
      *(double *)(unaff_x21 + 0x18) = *(double *)(unaff_x21 + 0x18) + dVar2;
    }
    *(uint *)(unaff_x21 + (ulong)bVar1 * 4 + 0x24) = unaff_w22;
    unaff_w22 = unaff_w22 + 1;
    *(uint *)(unaff_x21 + 0x20) = unaff_w22;
    unaff_x20 = unaff_x20 + 1;
  }
  return 0;
}

