
undefined1  [16] FUN_00083df0(void)

{
  undefined1 uVar1;
  undefined1 *puVar2;
  undefined8 uVar3;
  undefined8 *unaff_x19;
  undefined1 auVar4 [16];
  undefined1 uStack0000000000000010;
  undefined8 in_stack_00000018;
  undefined1 in_stack_00000028;
  undefined1 uStack0000000000000030;
  
  puVar2 = (undefined1 *)*unaff_x19;
  uVar1 = *puVar2;
  *puVar2 = uStack0000000000000010;
  uVar3 = *(undefined8 *)(puVar2 + 8);
  *(undefined8 *)(puVar2 + 8) = in_stack_00000018;
  uStack0000000000000010 = uVar1;
  in_stack_00000018 = uVar3;
  func_0x00078220((ulong)&uStack0000000000000010 | 8);
  uVar3 = *unaff_x19;
  func_0x00078220(&uStack0000000000000030,in_stack_00000028);
  auVar4._8_8_ = uVar3;
  auVar4._0_8_ = 1;
  return auVar4;
}

