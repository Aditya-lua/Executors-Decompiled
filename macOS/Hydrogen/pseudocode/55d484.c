
void FUN_0055d484(void)

{
  ulong uVar1;
  long lVar2;
  long *plVar3;
  long unaff_x19;
  ulong unaff_x20;
  long unaff_x21;
  undefined8 unaff_x22;
  undefined8 unaff_x23;
  undefined8 *puVar4;
  undefined8 unaff_x26;
  long lVar5;
  undefined8 unaff_x27;
  undefined8 unaff_x28;
  long lVar6;
  undefined8 *in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  long lStack0000000000000020;
  int iStack0000000000000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000040;
  
  iStack0000000000000028 = (uint)unaff_x19 + 1;
  uVar1 = unaff_x20 + 1;
  puVar4 = (undefined8 *)(unaff_x21 + 8 + (unaff_x20 & 0xffffffff) * 0x18);
  if ((uint)unaff_x20 < (uint)unaff_x19) {
    lStack0000000000000020 = unaff_x19 - unaff_x20;
    _memmove(unaff_x21 + 8 + (uVar1 & 0xffffffff) * 0x18,puVar4,lStack0000000000000020 * 0x18);
    lVar6 = unaff_x20 * 8;
    *puVar4 = unaff_x27;
    puVar4[1] = unaff_x26;
    lVar2 = unaff_x21 + 0x110;
    puVar4[2] = unaff_x23;
    lVar5 = lStack0000000000000020 << 3;
    _memmove(lVar2 + uVar1 * 8,lVar2 + lVar6,lVar5);
    *(undefined8 *)(lVar2 + lVar6) = unaff_x22;
    _memmove(unaff_x21 + 0x170 + lVar6 + 0x10,unaff_x21 + 0x170 + uVar1 * 8,lVar5);
  }
  else {
    *puVar4 = unaff_x27;
    puVar4[1] = unaff_x26;
    puVar4[2] = unaff_x23;
    *(undefined8 *)(unaff_x21 + unaff_x20 * 8 + 0x110) = unaff_x22;
    in_stack_00000030 = unaff_x28;
  }
  *(undefined8 *)(unaff_x21 + uVar1 * 8 + 0x170) = in_stack_00000040;
  *(short *)(unaff_x21 + 0x16a) = (short)iStack0000000000000028;
  if (uVar1 < unaff_x19 + 2U) {
    lVar2 = unaff_x20 + 0x2f;
    do {
      plVar3 = *(long **)(unaff_x21 + lVar2 * 8);
      *plVar3 = unaff_x21;
      *(short *)(plVar3 + 0x2d) = (short)lVar2 + -0x2e;
      lVar2 = lVar2 + 1;
    } while (lVar2 - unaff_x19 != 0x30);
  }
  *in_stack_00000008 = in_stack_00000030;
  in_stack_00000008[1] = in_stack_00000010;
  in_stack_00000008[2] = in_stack_00000018;
  return;
}

