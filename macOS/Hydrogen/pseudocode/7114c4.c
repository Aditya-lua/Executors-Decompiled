
void FUN_007114c4(undefined8 *param_1,undefined8 param_2)

{
  long lVar1;
  undefined1 in_ZR;
  undefined8 uVar2;
  long in_x9;
  undefined8 *in_x10;
  undefined1 uStack0000000000000008;
  undefined1 uStack0000000000000018;
  long *in_stack_00000028;
  long in_stack_00000030;
  
  while (!(bool)in_ZR) {
    *in_x10 = *param_1;
    in_x9 = in_x9 + -1;
    param_1 = param_1 + 1;
    in_x10 = in_x10 + 1;
    in_ZR = in_x9 == 0;
  }
  _uStack0000000000000008 = param_2;
  uVar2 = func_0x00704c24();
  func_0x00706ce8(uVar2,&uStack0000000000000018,&uStack0000000000000008,1);
  lVar1 = *in_stack_00000028 + in_stack_00000030 * 8;
  if (lVar1 != in_stack_00000028[1]) {
    in_stack_00000028[1] = lVar1;
  }
  return;
}

