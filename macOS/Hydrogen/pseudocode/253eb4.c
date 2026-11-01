
void FUN_00253eb4(long *param_1,long param_2)

{
  long lVar1;
  long lVar2;
  long unaff_x23;
  long in_stack_00000000;
  long in_stack_00000008;
  undefined8 uStack0000000000000018;
  long in_stack_00000020;
  long in_stack_00000028;
  
  lVar2 = *(long *)(param_2 + 8);
  lVar1 = -0x7fffffffffffffff;
  switch(lVar2) {
  case -0x7fffffffffffffff:
    break;
  case -0x7ffffffffffffffe:
    lVar1 = unaff_x23 + -0xf;
    break;
  case -0x7ffffffffffffffd:
    lVar1 = -0x7ffffffffffffffd;
    break;
  case -0x7ffffffffffffffc:
    lVar1 = unaff_x23 + -0xd;
    break;
  case -0x7ffffffffffffffb:
    lVar1 = unaff_x23 + -0xc;
    break;
  case -0x7ffffffffffffffa:
    lVar1 = unaff_x23 + -0xb;
    break;
  case -0x7ffffffffffffff9:
    lVar1 = -0x7ffffffffffffff9;
    break;
  case -0x7ffffffffffffff8:
    lVar1 = unaff_x23 + -9;
    break;
  case -0x7ffffffffffffff7:
    lVar1 = unaff_x23 + -8;
    break;
  case -0x7ffffffffffffff6:
    lVar1 = unaff_x23 + -7;
    break;
  case -0x7ffffffffffffff5:
    lVar1 = unaff_x23 + -6;
    break;
  case -0x7ffffffffffffff4:
    lVar1 = unaff_x23 + -5;
    break;
  case -0x7ffffffffffffff3:
    lVar1 = unaff_x23 + -4;
    break;
  case -0x7ffffffffffffff2:
    lVar1 = unaff_x23 + -3;
    break;
  case -0x7ffffffffffffff1:
    lVar1 = -0x7ffffffffffffff1;
    break;
  case -0x7ffffffffffffff0:
    lVar1 = unaff_x23 + -1;
    break;
  case -0x7fffffffffffffef:
    lVar1 = -0x7fffffffffffffef;
    break;
  case -0x7fffffffffffffee:
    lVar1 = unaff_x23 + 1;
    break;
  case -0x7fffffffffffffed:
    lVar1 = unaff_x23 + 2;
    break;
  case -0x7fffffffffffffec:
    lVar1 = unaff_x23 + 3;
    break;
  case -0x7fffffffffffffeb:
    lVar1 = unaff_x23 + 4;
    break;
  default:
    lVar1 = -0x8000000000000000;
    if (lVar2 != -0x8000000000000000) {
      func_0x001a24cc(&uStack0000000000000018,(long *)(param_2 + 8),&UNK_009ca6e0);
      in_stack_00000008 = in_stack_00000028;
      in_stack_00000000 = in_stack_00000020;
      lVar1 = uStack0000000000000018;
    }
  }
  param_1[3] = in_stack_00000008;
  param_1[2] = in_stack_00000000;
  *param_1 = unaff_x23 + 8;
  param_1[1] = lVar1;
  return;
}

