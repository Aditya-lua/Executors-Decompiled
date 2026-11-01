
void FUN_0042ce64(undefined8 param_1,long param_2)

{
  ulong uVar1;
  code *pcVar2;
  long unaff_x20;
  undefined8 uVar3;
  undefined8 unaff_x22;
  undefined8 *puVar4;
  undefined8 unaff_x23;
  undefined8 unaff_x24;
  undefined8 unaff_x25;
  undefined8 unaff_x26;
  long unaff_x29;
  
  if (param_2 != 0) {
    func_0x00187bd4();
  }
  func_0x00187bd4();
  uVar3 = *(undefined8 *)(unaff_x20 + 0x10);
  pcVar2 = *(code **)(*(long *)(unaff_x20 + 0x18) + 0x48);
  *(BADSPACEBASE **)(unaff_x29 + -0x80) = register0x00000008;
  *(undefined8 *)(unaff_x29 + -0x78) = unaff_x24;
  *(undefined8 *)(unaff_x29 + -0x70) = unaff_x23;
  *(undefined8 *)(unaff_x29 + -0x68) = unaff_x25;
  *(undefined8 *)(unaff_x29 + -0x60) = unaff_x22;
  *(undefined8 *)(unaff_x29 + -0x58) = unaff_x24;
  *(undefined8 *)(unaff_x29 + -0xb0) = unaff_x26;
  *(undefined8 *)(unaff_x29 + -0xa8) = 4;
  *(long *)(unaff_x29 + -0xa0) = unaff_x29 + -0x80;
  *(undefined8 *)(unaff_x29 + -0x98) = 3;
  *(undefined8 *)(unaff_x29 + -0x90) = 0;
  uVar1 = (*pcVar2)(uVar3,unaff_x29 + -0xb0);
  if ((uVar1 & 3) == 1) {
    uVar3 = *(undefined8 *)(uVar1 - 1);
    puVar4 = *(undefined8 **)(uVar1 + 7);
    if ((code *)*puVar4 != (code *)0x0) {
      (*(code *)*puVar4)(uVar3);
    }
    if (puVar4[1] != 0) {
      func_0x00187bd4(uVar3,puVar4[1],puVar4[2]);
    }
    func_0x00187bd4((undefined8 *)(uVar1 - 1),0x18,8);
  }
  return;
}

