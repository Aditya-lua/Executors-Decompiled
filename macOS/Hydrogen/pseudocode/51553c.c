
undefined8 FUN_0051553c(short *param_1)

{
  int in_w8;
  int in_w9;
  int in_w10;
  undefined8 uVar1;
  long in_stack_00000008;
  
  if (in_w8 == in_w10 && in_w9 == 0x73) {
    uVar1 = 1;
  }
  else if (*param_1 == 0x666f && (char)param_1[1] == 'f') {
    uVar1 = 0;
  }
  else {
    uVar1 = 2;
  }
  if (in_stack_00000008 != 0) {
    func_0x00187bd4(param_1,in_stack_00000008,1);
  }
  return uVar1;
}

