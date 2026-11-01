
void FUN_0051ac00(undefined1 param_1 [16],undefined1 param_2 [16],undefined1 param_3 [16])

{
  byte bVar1;
  uint uVar2;
  long lVar3;
  byte bVar4;
  long unaff_x19;
  long unaff_x20;
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  
  *(long *)(unaff_x19 + 0xa0) = param_3._8_8_;
  *(long *)(unaff_x19 + 0x98) = param_3._0_8_;
  *(long *)(unaff_x19 + 0x90) = param_2._8_8_;
  *(long *)(unaff_x19 + 0x88) = param_2._0_8_;
  *(long *)(unaff_x19 + 0x80) = param_1._8_8_;
  *(long *)(unaff_x19 + 0x78) = param_1._0_8_;
  uVar2 = *(uint *)(unaff_x20 + 700);
  if ((uVar2 >> 0x1d & 1) == 0) {
    bVar1 = 2;
    if ((*(uint *)(unaff_x20 + 0x2c0) & 0x20000000) == 0) {
      bVar1 = (byte)((byte)(*(uint *)(unaff_x20 + 0x2c0) >> 0x18) | (byte)(uVar2 >> 0x18)) >> 4 & 1;
    }
    *(byte *)(unaff_x19 + 0xdb) = bVar1;
  }
  else {
    *(undefined1 *)(unaff_x19 + 0xdb) = 2;
  }
  if ((uVar2 >> 0x12 & 1) == 0) {
    uVar2 = *(uint *)(unaff_x20 + 0x2c0) | uVar2;
    bVar1 = 2;
    if ((uVar2 & 0x20000000) == 0) {
      bVar1 = (byte)(uVar2 >> 0x1c) & 1;
    }
    bVar4 = 2;
    if ((*(uint *)(unaff_x20 + 0x2c0) & 0x40000) == 0) {
      bVar4 = bVar1;
    }
  }
  else {
    bVar4 = 2;
  }
  *(byte *)(unaff_x19 + 0xdc) = bVar4;
  func_0x00530da8(&uStack0000000000000008);
  lVar3 = *(long *)(unaff_x19 + 0x50);
  if ((-0x7fffffffffffffff < lVar3) && (lVar3 != 0)) {
    func_0x00187bd4(*(undefined8 *)(unaff_x19 + 0x58),lVar3,1);
  }
  *(undefined8 *)(unaff_x19 + 0x58) = in_stack_00000010;
  *(long *)(unaff_x19 + 0x50) = uStack0000000000000008;
  *(undefined8 *)(unaff_x19 + 0x60) = in_stack_00000018;
  return;
}

