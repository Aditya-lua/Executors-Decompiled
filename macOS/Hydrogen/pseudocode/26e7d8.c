
void FUN_0026e7d8(void)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 *unaff_x19;
  long unaff_x22;
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  
  uVar6 = in_stack_00000028;
  uVar5 = in_stack_00000020;
  uVar3 = in_stack_00000018;
  uVar1 = in_stack_00000010;
  if (uStack0000000000000008 == unaff_x22) {
    func_0x00263a40(&uStack0000000000000008);
    uVar4 = in_stack_00000018;
    uVar2 = in_stack_00000010;
    if (uStack0000000000000008 == unaff_x22) {
      func_0x00264538(&uStack0000000000000008);
      if (uStack0000000000000008 == unaff_x22) {
        *unaff_x19 = uVar5;
        unaff_x19[1] = uVar6;
        unaff_x19[2] = uVar1;
        unaff_x19[3] = uVar3;
        unaff_x19[4] = uVar2;
        unaff_x19[5] = uVar4;
        unaff_x19[6] = in_stack_00000010;
        unaff_x19[7] = in_stack_00000018;
        return;
      }
      unaff_x19[5] = in_stack_00000028;
      unaff_x19[4] = in_stack_00000020;
      unaff_x19[7] = in_stack_00000038;
      unaff_x19[6] = in_stack_00000030;
      unaff_x19[2] = in_stack_00000010;
      unaff_x19[3] = in_stack_00000018;
      *unaff_x19 = 0;
      unaff_x19[1] = uStack0000000000000008;
      return;
    }
    unaff_x19[5] = in_stack_00000028;
    unaff_x19[4] = in_stack_00000020;
    unaff_x19[7] = in_stack_00000038;
    unaff_x19[6] = in_stack_00000030;
    unaff_x19[2] = in_stack_00000010;
    unaff_x19[3] = in_stack_00000018;
  }
  else {
    unaff_x19[7] = in_stack_00000038;
    unaff_x19[6] = in_stack_00000030;
    unaff_x19[2] = in_stack_00000010;
    unaff_x19[3] = in_stack_00000018;
    unaff_x19[4] = in_stack_00000020;
    unaff_x19[5] = in_stack_00000028;
  }
  *unaff_x19 = 0;
  unaff_x19[1] = uStack0000000000000008;
  return;
}

