
void FUN_00534c4c(undefined8 *param_1,long param_2,long param_3,undefined8 param_4,
                 undefined4 param_5)

{
  long unaff_x19;
  
  if (unaff_x19 != 0) {
    *param_1 = param_4;
    *(undefined4 *)(param_1 + 1) = param_5;
    param_3 = param_3 + 1;
  }
  *(long *)(param_2 + 0x10) = param_3;
  return;
}

