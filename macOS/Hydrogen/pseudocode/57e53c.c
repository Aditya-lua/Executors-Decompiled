
void FUN_0057e53c(long param_1)

{
  long lVar1;
  long *unaff_x19;
  long unaff_x20;
  undefined8 unaff_x21;
  long unaff_x22;
  
  *(undefined8 *)(param_1 + 0x18) = *(undefined8 *)(unaff_x20 + 0x10);
  *(undefined2 *)(param_1 + 0x16a) = 1;
  *(undefined8 *)(param_1 + 0x110) = unaff_x21;
  *(long *)(unaff_x22 + 0x10) = *(long *)(unaff_x22 + 0x10) + 1;
  lVar1 = *(long *)(unaff_x20 + 0x18);
  *unaff_x19 = param_1;
  unaff_x19[2] = 0;
  unaff_x19[1] = 0;
  unaff_x19[3] = lVar1;
  return;
}

