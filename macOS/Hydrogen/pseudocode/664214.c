
undefined8 FUN_00664214(code *param_1)

{
  long lVar1;
  undefined8 uVar2;
  ulong uVar3;
  long unaff_x19;
  long unaff_x21;
  long unaff_x29;
  undefined1 uStack0000000000000008;
  ulong in_stack_00000010;
  ulong in_stack_00000018;
  long in_stack_00000020;
  undefined1 uStack0000000000000028;
  ulong in_stack_00000030;
  ulong in_stack_00000038;
  long in_stack_00000040;
  
  uVar2 = (*param_1)();
  lVar1 = unaff_x21 + 0x28;
  func_0x00677180(lVar1,uVar2);
  func_0x0067a01c(&uStack0000000000000008,*(undefined8 *)(unaff_x19 + 0x10),lVar1);
  func_0x00677180(&uStack0000000000000028,&uStack0000000000000008);
  uVar3 = in_stack_00000010;
  if (in_stack_00000018 <= in_stack_00000010) {
    uVar3 = in_stack_00000018;
  }
  if (in_stack_00000020 != 0) {
    if (uVar3 != 0) {
      do {
        *(undefined8 *)(in_stack_00000020 + -8 + uVar3 * 8) = 0;
        uVar3 = uVar3 - 1;
      } while (uVar3 != 0);
    }
    func_0x00611644();
  }
  func_0x00675e78(&uStack0000000000000028,0,*(byte *)(unaff_x29 + -0x21) & 1);
  uVar2 = (**(code **)(**(long **)(unaff_x19 + 0x10) + 0x80))
                    (*(long **)(unaff_x19 + 0x10),&uStack0000000000000028);
  func_0x00677180(lVar1,uVar2);
  uVar3 = in_stack_00000030;
  if (in_stack_00000038 <= in_stack_00000030) {
    uVar3 = in_stack_00000038;
  }
  if (in_stack_00000040 != 0) {
    if (uVar3 != 0) {
      do {
        *(undefined8 *)(in_stack_00000040 + -8 + uVar3 * 8) = 0;
        uVar3 = uVar3 - 1;
      } while (uVar3 != 0);
    }
    func_0x00611644();
  }
  return 1;
}

