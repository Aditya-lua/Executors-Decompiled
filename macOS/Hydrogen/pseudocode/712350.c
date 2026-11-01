
void FUN_00712350(void)

{
  undefined1 uVar1;
  long unaff_x20;
  long unaff_x21;
  undefined8 unaff_x24;
  undefined8 uVar2;
  undefined4 uStack0000000000000000;
  undefined4 uStack0000000000000004;
  undefined4 uStack0000000000000008;
  undefined4 uStack000000000000000c;
  undefined4 uStack0000000000000010;
  
  *(int *)(*(long *)(unaff_x20 + 0x150) + -4) = *(int *)(*(long *)(unaff_x20 + 0x150) + -4) + -1;
  uVar2 = *(undefined8 *)(unaff_x20 + 0x8c);
  uStack0000000000000000 = uStack0000000000000010;
  uStack0000000000000004 = uStack0000000000000010._4_4_;
  uStack0000000000000008 = uStack0000000000000010._8_4_;
  uVar1 = func_0x00716f30();
  *(undefined1 *)(unaff_x21 + 0x30) = uVar1;
  uStack0000000000000000 = (undefined4)unaff_x24;
  uStack0000000000000004 = (undefined4)((ulong)unaff_x24 >> 0x20);
  uStack0000000000000008 = (undefined4)uVar2;
  uStack000000000000000c = (undefined4)((ulong)uVar2 >> 0x20);
  func_0x00704c24(*(undefined8 *)(unaff_x20 + 0xd8),0x48);
  func_0x00706e70();
  return;
}

