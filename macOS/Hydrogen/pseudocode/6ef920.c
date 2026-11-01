
void FUN_006ef920(long param_1)

{
  long lVar1;
  undefined8 unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long *unaff_x22;
  
  *(undefined1 *)(param_1 + 2) = *(undefined1 *)(unaff_x20 + 4);
  *(undefined1 *)(param_1 + 3) = 0;
  *(undefined8 *)(param_1 + 8) = unaff_x19;
  *(long *)(param_1 + 0x20) = *unaff_x22;
  *unaff_x22 = param_1;
  *(long *)(param_1 + 0x10) = unaff_x21 + 0x300;
  lVar1 = *(long *)(unaff_x21 + 0x318);
  *(long *)(param_1 + 0x18) = lVar1;
  *(long *)(lVar1 + 0x10) = param_1;
  *(long *)(unaff_x21 + 0x318) = param_1;
  return;
}

