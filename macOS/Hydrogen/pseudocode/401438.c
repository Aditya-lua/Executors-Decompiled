
void FUN_00401438(long param_1)

{
  long in_x9;
  long *plVar1;
  long in_x10;
  undefined8 *in_x12;
  long in_x13;
  long unaff_x26;
  
  while (in_x10 != 0x46) {
    plVar1 = *(long **)(unaff_x26 + param_1 * 8);
    *plVar1 = unaff_x26;
    *(short *)(plVar1 + 0x43) = (short)param_1 + -0x44;
    param_1 = param_1 + 1;
    in_x10 = in_x9 + param_1;
  }
  *(long *)(in_x13 + 0x10) = *(long *)(in_x13 + 0x10) + 1;
  *in_x12 = 0x8000000000000001;
  return;
}

