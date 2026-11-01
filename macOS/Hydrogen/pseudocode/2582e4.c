
ulong FUN_002582e4(void)

{
  long lVar1;
  ulong uVar2;
  undefined8 uVar3;
  undefined8 *unaff_x19;
  long unaff_x20;
  long unaff_x22;
  long unaff_x28;
  undefined1 uStack0000000000000010;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000058;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000078;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000088;
  undefined8 in_stack_00000090;
  undefined8 in_stack_00000098;
  undefined8 in_stack_000000a0;
  undefined8 in_stack_000000a8;
  undefined8 in_stack_000000b0;
  long in_stack_000000c8;
  undefined8 in_stack_000000d0;
  undefined8 uStack0000000000000100;
  undefined8 in_stack_00000108;
  undefined8 in_stack_00000110;
  
  func_0x00187bd4();
  func_0x00276f14(&uStack0000000000000010);
  *(undefined8 *)(unaff_x28 + 0x20) = in_stack_000000a8;
  *(undefined8 *)(unaff_x28 + 0x18) = in_stack_000000a0;
  if (unaff_x22 == 0) {
    lVar1 = 1;
  }
  else {
    lVar1 = func_0x00187bd0();
    if (lVar1 == 0) {
      uVar3 = func_0x007a1f00(1);
      if (in_stack_000000c8 != 0) {
        func_0x00187bd4(in_stack_000000d0,in_stack_000000c8,1);
      }
      func_0x002c398c();
      if (unaff_x20 != 0) {
        func_0x00187bd4();
      }
      func_0x00276f14(&uStack0000000000000010);
      __Unwind_Resume(uVar3);
      lVar1 = func_0x007a2668();
      return (ulong)*(ushort *)(lVar1 + 8);
    }
  }
  uVar2 = _memcpy(lVar1,&uStack0000000000000100);
  unaff_x19[2] = lVar1;
  unaff_x19[3] = unaff_x22;
  *unaff_x19 = 0x8000000000000027;
  unaff_x19[1] = unaff_x22;
  return uVar2;
}

