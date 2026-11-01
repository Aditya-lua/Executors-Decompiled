
void FUN_006e4800(undefined8 *param_1)

{
  long lVar1;
  long unaff_x19;
  long *unaff_x20;
  long unaff_x21;
  undefined8 uVar2;
  
  uVar2 = *(undefined8 *)(unaff_x21 + -0x10);
  param_1[1] = *(undefined8 *)(unaff_x21 + -8);
  *param_1 = uVar2;
  lVar1 = *(long *)(unaff_x19 + 8);
  if (((4 < *(int *)(lVar1 + -4)) && ((*(byte *)(*unaff_x20 + 1) >> 2 & 1) != 0)) &&
     ((*(byte *)(*(long *)(lVar1 + -0x10) + 1) & 3) != 0)) {
    func_0x006f0ea0();
    lVar1 = *(long *)(unaff_x19 + 8);
  }
  *(long *)(unaff_x19 + 8) = lVar1 + -0x20;
  return;
}

