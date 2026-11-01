
void FUN_005cba84(undefined8 param_1,undefined8 *param_2)

{
  undefined8 uVar1;
  long lVar2;
  long lVar3;
  undefined8 uStack0000000000000040;
  long in_stack_00000048;
  long in_stack_00000050;
  long in_stack_00000058;
  long in_stack_00000060;
  long in_stack_00000068;
  undefined8 in_stack_00000070;
  long in_stack_00000078;
  
  func_0x005c3198(&uStack0000000000000040,*param_2);
  lVar3 = in_stack_00000050;
  lVar2 = in_stack_00000048;
  uVar1 = uStack0000000000000040;
  func_0x005c3198(&uStack0000000000000040,param_2[1]);
  in_stack_00000070 = uStack0000000000000040;
  in_stack_00000058 = lVar2 + lVar3 * 8;
  in_stack_00000078 = in_stack_00000048 + in_stack_00000050 * 8;
  uStack0000000000000040 = lVar2;
  in_stack_00000050 = uVar1;
  in_stack_00000060 = in_stack_00000048;
  in_stack_00000068 = in_stack_00000048;
  in_stack_00000048 = lVar2;
  func_0x005a3d34(param_1,&uStack0000000000000040,&UNK_009f2320);
  return;
}

