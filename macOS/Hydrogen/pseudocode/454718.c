
void FUN_00454718(undefined1 *param_1,long *param_2,char param_3)

{
  ulong uVar1;
  undefined1 uVar2;
  ulong in_stack_00000000;
  long in_stack_00000008;
  
  uVar1 = param_2[2];
  if ((uVar1 < (ulong)param_2[1]) && (*(char *)(*param_2 + uVar1) == param_3)) {
    param_2[2] = uVar1 + 1;
    func_0x00454618();
    if ((in_stack_00000000 & 1) == 0) {
      if (in_stack_00000008 != -1) {
        uVar2 = 0;
        *(long *)(param_1 + 8) = in_stack_00000008 + 1;
        goto LAB_0045476c;
      }
      param_1[1] = 0;
    }
    else {
      param_1[1] = in_stack_00000000._1_1_;
    }
    uVar2 = 1;
  }
  else {
    uVar2 = 0;
    *(undefined8 *)(param_1 + 8) = 0;
  }
LAB_0045476c:
  *param_1 = uVar2;
  return;
}

