
void FUN_004b451c(undefined8 *param_1,long *param_2)

{
  long lVar1;
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  
  if (*param_2 == -0x8000000000000000) {
    uStack0000000000000008 = 0x8000000000000000;
  }
  else {
    func_0x0048c754(&uStack0000000000000008,param_2,&UNK_009e4e48);
  }
  lVar1 = param_2[3];
  param_1[1] = in_stack_00000010;
  *param_1 = uStack0000000000000008;
  param_1[2] = in_stack_00000018;
  param_1[3] = lVar1;
  return;
}

