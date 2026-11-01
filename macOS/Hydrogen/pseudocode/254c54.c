
undefined1  [16] FUN_00254c54(long param_1,undefined8 param_2,undefined8 *param_3)

{
  undefined8 *puVar1;
  undefined8 *puVar2;
  undefined1 auVar3 [16];
  undefined8 uStack0000000000000000;
  undefined8 *puStack0000000000000008;
  undefined1 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  undefined8 uStack0000000000000020;
  undefined8 uStack0000000000000028;
  undefined8 *puStack0000000000000030;
  undefined8 uStack0000000000000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  
  puVar1 = *(undefined8 **)(param_1 + 0x18);
  puVar2 = *(undefined8 **)(param_1 + 8);
  while (puVar2 != puVar1) {
    uStack0000000000000018 = puVar2[1];
    _uStack0000000000000010 = *puVar2;
    uStack0000000000000020 = puVar2[2];
    puVar2 = puVar2 + 3;
    *(undefined8 **)(param_1 + 8) = puVar2;
    uStack0000000000000000 = param_2;
    puStack0000000000000008 = param_3;
    uStack0000000000000028 = param_2;
    puStack0000000000000030 = param_3;
    func_0x003f1a7c(&uStack0000000000000038,&uStack0000000000000010);
    param_3[1] = in_stack_00000040;
    *param_3 = uStack0000000000000038;
    param_3[2] = in_stack_00000048;
    param_3 = param_3 + 3;
  }
  auVar3._8_8_ = param_3;
  auVar3._0_8_ = param_2;
  return auVar3;
}

