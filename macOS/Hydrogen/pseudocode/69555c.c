
void FUN_0069555c(undefined8 param_1,undefined8 param_2,ulong param_3)

{
  long lVar1;
  ulong uVar2;
  undefined1 auVar3 [16];
  undefined *puStack0000000000000000;
  undefined4 in_stack_00000008;
  
  puStack0000000000000000 = &UNK_00a14250;
  _close(in_stack_00000008);
  __Unwind_Resume();
  auVar3 = func_0x0001753c();
  uVar2 = param_3 & 0xffffffff;
  if ((int)param_3 == 0) {
    lVar1 = 0;
  }
  else {
    lVar1 = func_0x006115d0(uVar2);
  }
  func_0x006954a8(auVar3._8_8_,lVar1,uVar2);
  (**(code **)(*auVar3._0_8_ + 0x28))(auVar3._0_8_,lVar1,uVar2);
  if (lVar1 != 0) {
    if ((int)param_3 != 0) {
      do {
        *(undefined1 *)(lVar1 + -1 + uVar2) = 0;
        uVar2 = uVar2 - 1;
      } while (uVar2 != 0);
    }
    func_0x00611644(lVar1);
  }
  return;
}

