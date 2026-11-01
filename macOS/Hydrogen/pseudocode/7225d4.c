
void FUN_007225d4(long param_1)

{
  ulong in_x9;
  ulong uVar1;
  ulong in_x10;
  long in_x11;
  long in_x12;
  long lVar2;
  long unaff_x19;
  undefined8 unaff_x20;
  long unaff_x21;
  
  while( true ) {
    uVar1 = in_x9 & in_x10;
    lVar2 = *(long *)(param_1 + uVar1 * 0x10);
    in_x12 = in_x12 + 1;
    if (lVar2 == in_x11) break;
    if (lVar2 == unaff_x21) goto code_r0x00722600;
    in_x9 = uVar1 + in_x12;
  }
  *(long *)(param_1 + uVar1 * 0x10) = unaff_x21;
  *(long *)(unaff_x19 + 0x428) = *(long *)(unaff_x19 + 0x428) + 1;
code_r0x00722600:
  *(undefined8 *)(param_1 + uVar1 * 0x10 + 8) = unaff_x20;
  return;
}

