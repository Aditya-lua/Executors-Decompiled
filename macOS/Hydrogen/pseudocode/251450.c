
void FUN_00251450(void)

{
  long lVar1;
  ulong uVar2;
  undefined8 *unaff_x19;
  undefined1 unaff_w23;
  undefined1 unaff_w24;
  undefined2 unaff_w25;
  undefined2 unaff_w26;
  undefined1 auVar3 [16];
  undefined8 uStack0000000000000028;
  long in_stack_00000030;
  long in_stack_00000038;
  
  auVar3 = func_0x00278314();
  uVar2 = auVar3._8_8_;
  if ((ulong)(uStack0000000000000028 - in_stack_00000038) < uVar2) {
    func_0x0079b61c(&uStack0000000000000028,in_stack_00000038,uVar2,1,1);
  }
  lVar1 = in_stack_00000038;
  _memcpy(in_stack_00000030 + in_stack_00000038,auVar3._0_8_,uVar2);
  unaff_x19[2] = in_stack_00000030;
  unaff_x19[1] = uStack0000000000000028;
  unaff_x19[3] = lVar1 + uVar2;
  *(undefined2 *)(unaff_x19 + 4) = unaff_w25;
  *(undefined2 *)((long)unaff_x19 + 0x22) = unaff_w26;
  *(undefined1 *)((long)unaff_x19 + 0x24) = unaff_w23;
  *(undefined1 *)((long)unaff_x19 + 0x25) = unaff_w24;
  *unaff_x19 = 0x8000000000000027;
  return;
}

