
void FUN_001abf18(ulong param_1)

{
  long *plVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  ulong in_x9;
  undefined8 *unaff_x19;
  long lVar5;
  undefined8 *puVar6;
  long unaff_x23;
  long unaff_x24;
  ulong in_stack_00000008;
  ulong in_stack_00000010;
  undefined8 uStack0000000000000018;
  long in_stack_00000020;
  long in_stack_00000028;
  long in_stack_00000030;
  long in_stack_00000038;
  undefined8 uStack0000000000000040;
  long in_stack_00000048;
  
  while( true ) {
    if (in_x9 <= param_1) {
      unaff_x19[2] = in_stack_00000020;
      unaff_x19[1] = uStack0000000000000018;
      unaff_x19[3] = in_stack_00000028;
      *unaff_x19 = 0;
      return;
    }
    func_0x001b932c(&uStack0000000000000040);
    lVar3 = in_stack_00000048;
    lVar4 = uStack0000000000000040;
    lVar5 = in_stack_00000028;
    lVar2 = in_stack_00000020;
    in_stack_00000038 = *(long *)(unaff_x24 + 0x18);
    in_stack_00000030 = *(long *)(unaff_x24 + 0x10);
    if (uStack0000000000000040 == unaff_x23) break;
    if (in_stack_00000028 == uStack0000000000000018) {
      func_0x001d8840(&uStack0000000000000018);
    }
    plVar1 = (long *)(in_stack_00000020 + lVar5 * 0x20);
    *plVar1 = lVar4;
    plVar1[1] = lVar3;
    plVar1[3] = in_stack_00000038;
    plVar1[2] = in_stack_00000030;
    in_stack_00000028 = lVar5 + 1;
    param_1 = in_stack_00000010;
    in_x9 = in_stack_00000008;
  }
  unaff_x19[3] = in_stack_00000038;
  unaff_x19[2] = in_stack_00000030;
  *unaff_x19 = 1;
  unaff_x19[1] = in_stack_00000048;
  if (in_stack_00000028 != 0) {
    puVar6 = (undefined8 *)(in_stack_00000020 + 8);
    do {
      lVar4 = puVar6[-1];
      if (unaff_x23 <= lVar4 && lVar4 != 0) {
        func_0x00187bd4(*puVar6,lVar4,1);
      }
      puVar6 = puVar6 + 4;
      lVar5 = lVar5 + -1;
    } while (lVar5 != 0);
  }
  if (uStack0000000000000018 == 0) {
    return;
  }
  func_0x00187bd4(lVar2,uStack0000000000000018 << 5,8);
  return;
}

