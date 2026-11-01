
void FUN_0059ab80(undefined2 *param_1)

{
  undefined2 in_w8;
  undefined8 *unaff_x19;
  undefined2 *unaff_x20;
  
  *(undefined2 *)((long)param_1 + 3) = in_w8;
  *(undefined1 *)((long)param_1 + 5) = *(undefined1 *)((long)unaff_x20 + 5);
  param_1[3] = unaff_x20[3];
  *(undefined1 *)(param_1 + 4) = *(undefined1 *)(unaff_x20 + 4);
  *(undefined2 *)((long)param_1 + 9) = *(undefined2 *)((long)unaff_x20 + 9);
  *(undefined1 *)((long)param_1 + 0xb) = *(undefined1 *)((long)unaff_x20 + 0xb);
  *(undefined1 *)(param_1 + 1) = *(undefined1 *)(unaff_x20 + 1);
  *param_1 = *unaff_x20;
  *unaff_x19 = 4;
  unaff_x19[1] = param_1;
  unaff_x19[2] = 4;
  return;
}

