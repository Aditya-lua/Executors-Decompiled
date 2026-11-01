
undefined1  [16] FUN_002163dc(long param_1,undefined8 param_2)

{
  undefined8 *unaff_x19;
  undefined8 *puVar1;
  undefined8 *puVar2;
  undefined1 auVar3 [16];
  undefined8 uStack0000000000000000;
  undefined8 *puStack0000000000000008;
  undefined8 uStack0000000000000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined1 uStack0000000000000040;
  undefined8 uStack0000000000000048;
  undefined8 uStack0000000000000050;
  undefined8 uStack0000000000000058;
  undefined8 uStack0000000000000060;
  undefined8 uStack0000000000000068;
  
  puVar1 = *(undefined8 **)(param_1 + 0x18);
  puVar2 = *(undefined8 **)(param_1 + 8);
  while (puVar2 != puVar1) {
    uStack0000000000000048 = puVar2[1];
    _uStack0000000000000040 = *puVar2;
    uStack0000000000000058 = puVar2[3];
    uStack0000000000000050 = puVar2[2];
    uStack0000000000000068 = puVar2[5];
    uStack0000000000000060 = puVar2[4];
    puVar2 = puVar2 + 6;
    *(undefined8 **)(param_1 + 8) = puVar2;
    uStack0000000000000000 = param_2;
    puStack0000000000000008 = unaff_x19;
    func_0x001b5b1c(&uStack0000000000000010,&uStack0000000000000040);
    unaff_x19[1] = in_stack_00000018;
    *unaff_x19 = uStack0000000000000010;
    unaff_x19[3] = in_stack_00000028;
    unaff_x19[2] = in_stack_00000020;
    unaff_x19[5] = in_stack_00000038;
    unaff_x19[4] = in_stack_00000030;
    unaff_x19 = unaff_x19 + 6;
  }
  auVar3._8_8_ = unaff_x19;
  auVar3._0_8_ = param_2;
  return auVar3;
}

