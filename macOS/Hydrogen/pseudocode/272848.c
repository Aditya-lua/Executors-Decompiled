
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_00272848(undefined8 *param_1)

{
  undefined8 uVar1;
  undefined2 in_w8;
  undefined8 *unaff_x19;
  long in_stack_00000008;
  undefined8 in_stack_00000010;
  
  *(undefined2 *)(param_1 + 2) = in_w8;
  uVar1 = _UNK_0082ce78;
  param_1[1] = _UNK_0082ce80;
  *param_1 = uVar1;
  unaff_x19[2] = param_1;
  unaff_x19[3] = 0x12;
  uVar1 = _UNK_0082cc80;
  unaff_x19[1] = _UNK_0082cc88;
  *unaff_x19 = uVar1;
  if (in_stack_00000008 != 0) {
    func_0x00187bd4(in_stack_00000010,in_stack_00000008,1);
  }
  return;
}

