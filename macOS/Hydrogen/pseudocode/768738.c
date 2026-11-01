
ulong FUN_00768738(long param_1)

{
  int iVar1;
  uint uVar2;
  long unaff_x19;
  uint unaff_w21;
  uint uVar3;
  ulong uVar4;
  
  if (*(code **)(param_1 + 0x18) != (code *)0x0) {
    unaff_w21 = (**(code **)(param_1 + 0x18))();
  }
  uVar3 = 0x2a;
  if (unaff_w21 != 0x2a) {
    iVar1 = func_0x007700b8();
    uVar3 = 0x2a;
    if (iVar1 == 0 || unaff_w21 != 0) {
      uVar3 = unaff_w21;
    }
  }
  uVar2 = func_0x0078414c();
  if (uVar3 == 0 && uVar2 != 0) {
    uVar3 = uVar2;
  }
  uVar4 = (ulong)uVar3;
  func_0x00731ec8();
  func_0x00768960(*(undefined8 *)(unaff_x19 + 0xd0));
  if (uVar3 == 0) {
    uVar4 = func_0x007711d0(unaff_x19 + 0xe8);
  }
  func_0x007348e8();
  func_0x0076d000("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                  unaff_x19 + 0x20);
  return uVar4;
}

