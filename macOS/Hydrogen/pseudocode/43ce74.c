
void FUN_0043ce74(void)

{
  ulong uVar1;
  long lVar2;
  undefined8 *puVar3;
  ulong uVar4;
  ulong uVar5;
  ulong uVar6;
  ulong unaff_x19;
  ulong unaff_x21;
  code *unaff_x22;
  long *unaff_x27;
  long in_stack_00000010;
  undefined8 in_stack_00000020;
  undefined4 uStack0000000000000050;
  undefined8 in_stack_00000058;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000088;
  long in_stack_00000098;
  ulong in_stack_00001e00;
  undefined1 auStack_7ffffffe [2147483646];
  
  while (in_stack_00001e00 < 2) {
    (*unaff_x22)(in_stack_00000020,auStack_7ffffffe + 0x8000177e);
    func_0x0040f900(auStack_7ffffffe + 0x80001dfe,&uStack0000000000000050);
  }
  if ((1 < uStack0000000000000050 - 3U) && (in_stack_00000098 != 0)) {
    func_0x00187bd4(in_stack_00000088,in_stack_00000098 << 3,8);
  }
  if ((1 < unaff_x19) && (uVar4 = unaff_x27[1], uVar4 != 0)) {
    lVar2 = *unaff_x27;
    if (uVar4 == 1) {
      uVar5 = 0;
    }
    else {
      uVar5 = 0;
      uVar6 = uVar4;
      do {
        uVar1 = (uVar6 >> 1) + uVar5;
        if (*(ulong *)(lVar2 + uVar1 * 0x18 + 0x10) <= unaff_x21) {
          uVar5 = uVar1;
        }
        uVar6 = uVar6 - (uVar6 >> 1);
      } while (1 < uVar6);
    }
    uVar6 = *(ulong *)(lVar2 + uVar5 * 0x18 + 0x10);
    if (uVar6 != unaff_x21) {
      if (uVar6 < unaff_x21) {
        uVar5 = uVar5 + 1;
      }
      if (uVar5 == 0) {
        return;
      }
      uVar5 = uVar5 - 1;
    }
    if (uVar5 < uVar4) {
      puVar3 = (undefined8 *)(lVar2 + uVar5 * 0x18);
      in_stack_00000058 = *puVar3;
      in_stack_00000060 = puVar3[1];
      uStack0000000000000050 = 3;
      (**(code **)(in_stack_00000010 + 0x20))(in_stack_00000020,&uStack0000000000000050);
    }
  }
  return;
}

