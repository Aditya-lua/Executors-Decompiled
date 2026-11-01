
void FUN_005ee418(long *param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                 undefined8 param_5)

{
  ulong uVar1;
  undefined1 uStack0000000000000000;
  undefined8 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  ulong uStack0000000000000020;
  ulong uStack0000000000000028;
  long lStack0000000000000030;
  undefined8 uStack0000000000000038;
  long *in_stack_00000040;
  
  uStack0000000000000028 = 0;
  lStack0000000000000030 = 0;
  uStack0000000000000020 = 0xffffffffffffffff;
  uStack0000000000000000 = 0;
  uStack0000000000000008 = param_4;
  uStack0000000000000010 = param_5;
  func_0x0003f610(&uStack0000000000000038,"IV");
  (**(code **)(*param_1 + 0x38))(param_1,param_2,param_3,&uStack0000000000000038);
  uStack0000000000000038 = &UNK_009f6820;
  if (in_stack_00000040 != (long *)0x0) {
    (**(code **)(*in_stack_00000040 + 8))();
  }
  uVar1 = uStack0000000000000020;
  if (uStack0000000000000028 <= uStack0000000000000020) {
    uVar1 = uStack0000000000000028;
  }
  if (lStack0000000000000030 != 0) {
    if (uVar1 != 0) {
      do {
        *(undefined1 *)(lStack0000000000000030 + -1 + uVar1) = 0;
        uVar1 = uVar1 - 1;
      } while (uVar1 != 0);
    }
    func_0x00611644();
  }
  return;
}

