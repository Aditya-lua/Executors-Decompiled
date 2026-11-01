
void FUN_00712158(long param_1)

{
  undefined1 uVar1;
  long in_x9;
  long unaff_x20;
  undefined8 unaff_x21;
  undefined8 uVar2;
  long unaff_x23;
  long unaff_x26;
  undefined8 unaff_x27;
  ulong unaff_x28;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined4 uStack0000000000000020;
  undefined4 uStack0000000000000024;
  undefined4 in_stack_00000028;
  undefined4 uStack000000000000002c;
  
  if ((ulong)(in_x9 >> 3) < unaff_x28) {
    func_0x006cfeb0();
  }
  else if (unaff_x28 < (ulong)(in_x9 >> 3)) {
    *(ulong *)(unaff_x20 + 0x198) = param_1 + unaff_x28 * 8;
  }
  *(undefined8 *)(unaff_x23 + 0xc) = unaff_x27;
  uVar2 = *(undefined8 *)(unaff_x20 + 0x8c);
  uStack0000000000000020 = 0x126;
  uStack0000000000000024 = (undefined4)in_stack_00000018;
  in_stack_00000028 = (undefined4)((ulong)in_stack_00000018 >> 0x20);
  uVar1 = func_0x00716f30();
  if (unaff_x23 == 0) {
    *(undefined1 *)(unaff_x26 + 0x30) = uVar1;
  }
  else if (*(int *)(unaff_x23 + 8) == iRam0000000000a27b78) {
    *(undefined1 *)(unaff_x23 + 0x30) = uVar1;
  }
  uStack0000000000000020 = (undefined4)unaff_x21;
  uStack0000000000000024 = (undefined4)((ulong)unaff_x21 >> 0x20);
  in_stack_00000028 = (undefined4)uVar2;
  uStack000000000000002c = (undefined4)((ulong)uVar2 >> 0x20);
  uVar2 = func_0x00704c24(*(undefined8 *)(unaff_x20 + 0xd8),0x60);
  func_0x00706d94(uVar2,&uStack0000000000000020,in_stack_00000010);
  return;
}

