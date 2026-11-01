
void FUN_005db33c(undefined8 param_1,long param_2)

{
  long lVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  long lVar4;
  long lVar5;
  long lVar6;
  undefined8 uStack0000000000000040;
  long in_stack_00000048;
  long in_stack_00000050;
  undefined8 uStack0000000000000058;
  long in_stack_00000060;
  long in_stack_00000068;
  undefined8 in_stack_00000070;
  long in_stack_00000078;
  long in_stack_00000080;
  long in_stack_00000088;
  undefined8 in_stack_00000090;
  long in_stack_00000098;
  long in_stack_000000a0;
  long in_stack_000000a8;
  undefined8 in_stack_000000b0;
  long in_stack_000000b8;
  
  func_0x005c3198(&uStack0000000000000058,param_2);
  lVar6 = in_stack_00000068;
  lVar4 = in_stack_00000060;
  uVar2 = uStack0000000000000058;
  func_0x005c3198(&uStack0000000000000058,param_2 + 0x40);
  lVar5 = in_stack_00000060;
  uVar3 = uStack0000000000000058;
  lVar1 = in_stack_00000060 + in_stack_00000068 * 8;
  func_0x005c3198(&uStack0000000000000040,param_2 + 0x80);
  in_stack_00000068 = lVar4;
  in_stack_00000070 = uVar2;
  in_stack_00000088 = lVar5;
  in_stack_00000080 = lVar5;
  in_stack_000000b8 = in_stack_00000048 + in_stack_00000050 * 8;
  in_stack_00000090 = uVar3;
  uStack0000000000000058 = 1;
  in_stack_000000a0 = in_stack_00000048;
  in_stack_000000a8 = in_stack_00000048;
  in_stack_000000b0 = uStack0000000000000040;
  in_stack_00000060 = lVar4;
  in_stack_00000078 = lVar4 + lVar6 * 8;
  in_stack_00000098 = lVar1;
  func_0x005a3308(param_1,&uStack0000000000000058,&UNK_009f30a0);
  return;
}

