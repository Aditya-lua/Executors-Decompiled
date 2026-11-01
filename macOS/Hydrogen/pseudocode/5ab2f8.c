
undefined8 FUN_005ab2f8(undefined8 *param_1,undefined8 *param_2)

{
  ulong uVar1;
  undefined8 uVar2;
  undefined8 *puVar3;
  undefined8 uStack0000000000000080;
  undefined8 in_stack_00000088;
  undefined8 *in_stack_00000090;
  undefined8 in_stack_00000098;
  undefined8 in_stack_000000a0;
  undefined8 uStack00000000000000b0;
  undefined *in_stack_000000b8;
  undefined8 in_stack_000000c0;
  undefined8 in_stack_000000c8;
  undefined8 in_stack_000000d0;
  undefined8 in_stack_000000d8;
  
  uVar1 = func_0x005c1e94(param_2);
  uVar2 = *param_2;
  if ((uVar1 & 1) == 0) {
    uVar1 = func_0x005ab01c(param_1,uVar2);
    if ((uVar1 & 1) != 0) {
      return 1;
    }
    puVar3 = (undefined8 *)*param_1;
  }
  else {
    uVar1 = (**(code **)(((undefined8 *)*param_1)[1] + 0x18))
                      (*(undefined8 *)*param_1,&UNK_008aec78,1);
    if ((uVar1 & 1) != 0) {
      return 1;
    }
    uVar1 = func_0x005ab01c(param_1,uVar2);
    if ((uVar1 & 1) != 0) {
      return 1;
    }
    puVar3 = (undefined8 *)*param_1;
    uVar1 = (**(code **)(puVar3[1] + 0x18))(*puVar3,&UNK_008aec79,1);
    if ((uVar1 & 1) != 0) {
      return 1;
    }
  }
  uStack00000000000000b0 = param_2 + 2;
  in_stack_000000b8 =
       &
       __ZN67__LT_ast__binary__BinaryOperation_u20_as_u20_core__fmt__Display_GT_3fmt17hf60dec31652a6d56E
  ;
  uStack0000000000000080 = &UNK_009f1df0;
  in_stack_00000088 = 2;
  in_stack_00000090 = &uStack00000000000000b0;
  in_stack_00000098 = 1;
  in_stack_000000a0 = 0;
  uVar1 = func_0x0046849c(*puVar3,puVar3[1],&uStack0000000000000080);
  if ((uVar1 & 1) != 0) {
    return 1;
  }
  uVar1 = func_0x005c1fd8(param_2);
  uVar2 = param_2[1];
  if ((uVar1 & 1) == 0) {
    uVar2 = func_0x005ab01c(param_1,uVar2);
  }
  else {
    uVar1 = (**(code **)(puVar3[1] + 0x18))(*puVar3,&UNK_008aec78,1);
    if ((uVar1 & 1) != 0) {
      return 1;
    }
    uVar1 = func_0x005ab01c(param_1,uVar2);
    if ((uVar1 & 1) != 0) {
      return 1;
    }
    uVar2 = (**(code **)(((undefined8 *)*param_1)[1] + 0x18))
                      (*(undefined8 *)*param_1,&UNK_008aec79,1);
  }
  return uVar2;
}

