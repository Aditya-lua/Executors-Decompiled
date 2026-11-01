
undefined8 FUN_006a40e4(void)

{
  uint in_w8;
  long unaff_x19;
  byte *pbVar1;
  byte *unaff_x20;
  long unaff_x21;
  uint unaff_w22;
  ulong unaff_x23;
  double dVar2;
  
  do {
    dVar2 = (double)_log((double)in_w8);
    *(double *)(unaff_x21 + 0x18) = *(double *)(unaff_x21 + 0x18) + dVar2;
    pbVar1 = unaff_x20;
    do {
      *(uint *)(unaff_x21 + unaff_x23 * 4 + 0x24) = unaff_w22;
      unaff_w22 = unaff_w22 + 1;
      *(uint *)(unaff_x21 + 0x20) = unaff_w22;
      unaff_x19 = unaff_x19 + -1;
      if (unaff_x19 == 0) {
        return 0;
      }
      unaff_x20 = pbVar1 + 1;
      unaff_x23 = (ulong)*pbVar1;
      pbVar1 = unaff_x20;
    } while (unaff_w22 < 2000);
    in_w8 = unaff_w22 - *(int *)(unaff_x21 + unaff_x23 * 4 + 0x24);
  } while( true );
}

