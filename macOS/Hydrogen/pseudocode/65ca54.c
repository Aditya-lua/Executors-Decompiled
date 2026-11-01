
undefined8 * FUN_0065ca54(ulong param_1,long param_2,undefined8 param_3,undefined8 param_4)

{
  undefined8 uVar1;
  undefined8 *puVar2;
  long lVar3;
  ulong in_x9;
  undefined1 auVar4 [16];
  undefined1 uStack0000000000000008;
  
  if (in_x9 <= param_1) {
    param_1 = in_x9;
  }
  if (param_2 != 0) {
    if (param_1 != 0) {
      do {
        *(undefined8 *)(param_2 + -8 + param_1 * 8) = 0;
        param_1 = param_1 - 1;
      } while (param_1 != 0);
    }
    func_0x00611644();
  }
  __Unwind_Resume();
  uVar1 = func_0x0001753c();
  func_0x006338bc(&uStack0000000000000008);
  uVar1 = __Unwind_Resume(uVar1);
  func_0x006338bc(&uStack0000000000000008);
  auVar4 = __Unwind_Resume(uVar1);
  lVar3 = auVar4._8_8_;
  puVar2 = auVar4._0_8_;
  *puVar2 = &UNK_00a09a40;
  func_0x005fe0b4(puVar2 + 1,lVar3 + 8);
  func_0x005fe0b4(puVar2 + 7,lVar3 + 0x38);
  *(undefined1 *)(puVar2 + 0xd) = *(undefined1 *)(lVar3 + 0x68);
  func_0x005fe0b4(puVar2 + 0xe,param_4);
  return puVar2;
}

