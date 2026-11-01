
void FUN_00712bfc(long param_1)

{
  ulong in_x9;
  ulong in_x10;
  long in_x11;
  long in_x12;
  long lVar1;
  long unaff_x19;
  long unaff_x20;
  undefined8 unaff_x21;
  
  do {
    in_x9 = in_x9 + in_x12 & in_x10;
    lVar1 = *(long *)(param_1 + in_x9 * 0x10);
    in_x12 = in_x12 + 1;
    if (lVar1 == in_x11) {
      *(long *)(param_1 + in_x9 * 0x10) = unaff_x20;
      *(long *)(unaff_x19 + 0x428) = *(long *)(unaff_x19 + 0x428) + 1;
      break;
    }
  } while (lVar1 != unaff_x20);
  *(undefined8 *)(param_1 + in_x9 * 0x10 + 8) = unaff_x21;
  return;
}

