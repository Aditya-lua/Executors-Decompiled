
void FUN_0042fc04(long param_1)

{
  ulong uVar1;
  undefined8 uVar2;
  undefined8 *puVar3;
  long unaff_x29;
  undefined1 uStack0000000000000018;
  undefined8 uStack0000000000000020;
  long lStack0000000000000028;
  undefined8 uStack0000000000000030;
  undefined8 uStack0000000000000038;
  
  _uStack0000000000000018 = param_1 + 0x788;
  uStack0000000000000020 = 2;
  lStack0000000000000028 = unaff_x29 + -0x38;
  uStack0000000000000030 = 1;
  uStack0000000000000038 = 0;
  uVar1 = func_0x0041f554(unaff_x29 + -0x21,&uStack0000000000000018);
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

