
void FUN_005c6314(undefined8 *param_1)

{
  undefined8 uVar1;
  undefined8 uStack0000000000000008;
  long in_stack_00000018;
  
  uVar1 = *param_1;
  func_0x005c7190(&uStack0000000000000008,uVar1);
  while (uStack0000000000000008 != 0) {
    func_0x005c6384(uStack0000000000000008 + in_stack_00000018 * 0x30);
    func_0x005c7190(&uStack0000000000000008,uVar1);
  }
  return;
}

