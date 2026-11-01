
undefined8 FUN_005c57a0(undefined8 param_1,long param_2)

{
  long in_x9;
  long lVar1;
  undefined8 in_x10;
  long in_x11;
  long in_x12;
  undefined4 unaff_w19;
  
  *(undefined8 *)(param_2 + 0x10) = in_x10;
  *(long *)(param_2 + 0x18) = in_x11 + 1;
  lVar1 = in_x9 + in_x12 * -0x10;
  *(undefined8 *)(lVar1 + -0x10) = param_1;
  *(undefined4 *)(lVar1 + -8) = unaff_w19;
  return 0;
}

