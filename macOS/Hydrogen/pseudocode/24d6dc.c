
void FUN_0024d6dc(long param_1,long param_2)

{
  long in_x6;
  long in_x9;
  long in_x11;
  undefined4 unaff_w19;
  long unaff_x20;
  undefined8 unaff_x21;
  undefined2 unaff_w22;
  undefined8 unaff_x23;
  undefined8 *unaff_x25;
  
  *(long *)(in_x6 + 8) = in_x9 + in_x11;
  *(undefined8 *)(unaff_x20 + 0x3d8) = 0;
  param_1 = param_1 + -1;
  if (param_1 != 0) {
    _memmove(param_2,param_2 + 0x28,param_1 * 0x28);
    *(long *)(unaff_x20 + 0x3d8) = param_1;
  }
  unaff_x25[1] = unaff_x21;
  unaff_x25[2] = unaff_x23;
  *(undefined1 *)(unaff_x25 + 3) = 2;
  *(undefined2 *)((long)unaff_x25 + 0x1a) = unaff_w22;
  *(undefined4 *)((long)unaff_x25 + 0x1c) = unaff_w19;
  *unaff_x25 = 0x8000000000000027;
  return;
}

