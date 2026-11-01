
void FUN_00534d58(long param_1,undefined1 param_2 [16],undefined1 param_3 [16],long param_4)

{
  long in_x9;
  long *in_x10;
  long lVar1;
  undefined8 *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  undefined8 unaff_x25;
  long lVar2;
  long lVar3;
  
  lVar3 = param_2._8_8_;
  lVar2 = param_2._0_8_;
  lVar1 = param_1;
  do {
    in_x10[-3] = lVar3;
    in_x10[-4] = lVar2;
    in_x10[-1] = lVar3 + param_3._8_8_;
    in_x10[-2] = lVar2 + param_3._0_8_;
    in_x10[1] = lVar3 + 4;
    *in_x10 = lVar2 + 4;
    in_x10[3] = lVar3 + 6;
    in_x10[2] = lVar2 + 6;
    lVar2 = lVar2 + 8;
    lVar3 = lVar3 + 8;
    lVar1 = lVar1 + -8;
    in_x10 = in_x10 + 8;
  } while (lVar1 != 0);
  if (in_x9 != param_1) {
    do {
      *(long *)(param_4 + param_1 * 8) = unaff_x21;
      unaff_x21 = unaff_x21 + 1;
      param_1 = param_1 + 1;
    } while (unaff_x20 != unaff_x21);
  }
  *unaff_x19 = unaff_x25;
  unaff_x19[1] = param_4;
  unaff_x19[2] = param_1;
  return;
}

