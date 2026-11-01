
void FUN_00400440(void)

{
  long lVar1;
  long lVar2;
  undefined8 in_x10;
  undefined8 unaff_x19;
  ulong unaff_x20;
  undefined8 unaff_x21;
  long unaff_x22;
  undefined8 unaff_x23;
  ulong unaff_x24;
  long unaff_x25;
  undefined8 *puVar3;
  undefined8 unaff_x27;
  undefined8 unaff_x28;
  long in_stack_00000028;
  undefined8 uStack0000000000000030;
  undefined8 *in_stack_00000040;
  
  puVar3 = (undefined8 *)(unaff_x25 + unaff_x20 * 0x18);
  if (unaff_x20 <= unaff_x24 && unaff_x24 - unaff_x20 != 0) {
    lVar2 = unaff_x20 * 0x18 + 0x18;
    lVar1 = (unaff_x24 - unaff_x20) * 0x18;
    uStack0000000000000030 = in_x10;
    _memmove(unaff_x25 + lVar2,puVar3,lVar1);
    _memmove(unaff_x22 + 0x110 + lVar2,unaff_x22 + 0x110 + unaff_x20 * 0x18,lVar1);
    in_x10 = uStack0000000000000030;
  }
  *puVar3 = unaff_x23;
  puVar3[1] = unaff_x21;
  puVar3[2] = unaff_x28;
  lVar2 = unaff_x22 + unaff_x20 * 0x18;
  *(undefined8 *)(lVar2 + 0x110) = unaff_x27;
  *(undefined8 *)(lVar2 + 0x118) = in_x10;
  *(undefined8 *)(lVar2 + 0x120) = unaff_x19;
  *(short *)(unaff_x22 + 0x21a) = (short)unaff_x24 + 1;
  *(long *)(in_stack_00000028 + 0x10) = *(long *)(in_stack_00000028 + 0x10) + 1;
  *in_stack_00000040 = 0x8000000000000000;
  return;
}

