
void FUN_0042c350(undefined8 param_1)

{
  ulong uVar1;
  undefined8 uVar2;
  undefined8 *puVar3;
  long unaff_x29;
  undefined *puStack0000000000000000;
  undefined8 uStack0000000000000008;
  undefined1 *puStack0000000000000010;
  undefined8 uStack0000000000000018;
  undefined8 uStack0000000000000020;
  undefined1 uStack0000000000000030;
  
  puStack0000000000000000 = &UNK_009db050;
  uStack0000000000000008 = 2;
  puStack0000000000000010 = &uStack0000000000000030;
  uStack0000000000000018 = 1;
  uStack0000000000000020 = 0;
  _uStack0000000000000030 = param_1;
  uVar1 = func_0x0041f554(unaff_x29 + -0x21);
  if ((uVar1 & 3) == 1) {
    uVar2 = *(undefined8 *)(uVar1 - 1);
    puVar3 = *(undefined8 **)(uVar1 + 7);
    if ((code *)*puVar3 != (code *)0x0) {
      (*(code *)*puVar3)(uVar2);
    }
    if (puVar3[1] != 0) {
      func_0x00187bd4(uVar2,puVar3[1],puVar3[2]);
    }
    func_0x00187bd4((undefined8 *)(uVar1 - 1),0x18,8);
  }
  return;
}

