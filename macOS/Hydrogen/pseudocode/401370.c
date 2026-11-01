
void FUN_00401370(long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  long lVar1;
  long *plVar2;
  ulong unaff_x19;
  long unaff_x20;
  undefined8 unaff_x21;
  ulong unaff_x22;
  undefined8 unaff_x23;
  long unaff_x24;
  undefined8 *unaff_x25;
  long unaff_x26;
  undefined8 unaff_x27;
  undefined2 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  long in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 *in_stack_00000040;
  
  _memmove(param_1 + unaff_x24);
  _memmove(unaff_x26 + 0x110 + unaff_x24,unaff_x26 + 0x110 + (unaff_x22 & 0xffffffff) * 0x18,param_4
          );
  *unaff_x25 = in_stack_00000038;
  unaff_x25[1] = unaff_x23;
  unaff_x25[2] = unaff_x21;
  lVar1 = unaff_x26 + (unaff_x22 & 0xffffffff) * 0x18;
  *(undefined8 *)(lVar1 + 0x110) = in_stack_00000030;
  *(undefined8 *)(lVar1 + 0x118) = in_stack_00000020;
  *(undefined8 *)(lVar1 + 0x120) = unaff_x27;
  lVar1 = unaff_x26 + 0x220;
  if ((uint)unaff_x22 < (uint)unaff_x20) {
    _memmove(lVar1 + unaff_x22 * 8 + 0x10,lVar1 + unaff_x19 * 8,(unaff_x20 - unaff_x22) * 8);
  }
  *(undefined8 *)(lVar1 + unaff_x19 * 8) = in_stack_00000018;
  *(undefined2 *)(unaff_x26 + 0x21a) = in_stack_00000010;
  if (unaff_x19 < unaff_x20 + 2U) {
    lVar1 = unaff_x22 + 0x45;
    do {
      plVar2 = *(long **)(unaff_x26 + lVar1 * 8);
      *plVar2 = unaff_x26;
      *(short *)(plVar2 + 0x43) = (short)lVar1 + -0x44;
      lVar1 = lVar1 + 1;
    } while (lVar1 - unaff_x20 != 0x46);
  }
  *(long *)(in_stack_00000028 + 0x10) = *(long *)(in_stack_00000028 + 0x10) + 1;
  *in_stack_00000040 = 0x8000000000000001;
  return;
}

