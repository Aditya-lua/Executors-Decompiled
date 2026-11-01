
void FUN_006df584(long param_1)

{
  ulong in_x9;
  ulong in_x10;
  long in_x11;
  long lVar1;
  long in_x13;
  long unaff_x19;
  long unaff_x20;
  undefined4 unaff_w21;
  
  if (in_x13 != in_x11) {
    lVar1 = 1;
    do {
      if (in_x13 == unaff_x19) goto LAB_006df5c8;
      in_x9 = in_x9 + lVar1 & in_x10;
      in_x13 = *(long *)(param_1 + in_x9 * 0x10);
      lVar1 = lVar1 + 1;
    } while (in_x13 != in_x11);
  }
  *(long *)(param_1 + in_x9 * 0x10) = unaff_x19;
  *(long *)(unaff_x20 + 0x10) = *(long *)(unaff_x20 + 0x10) + 1;
LAB_006df5c8:
  *(undefined4 *)(param_1 + in_x9 * 0x10 + 8) = unaff_w21;
  return;
}

