
void FUN_006c0eb0(long param_1)

{
  long in_x9;
  long in_x10;
  long *unaff_x19;
  long unaff_x20;
  long lVar1;
  long unaff_x21;
  long unaff_x22;
  undefined8 uVar2;
  
  while (in_x10 != unaff_x22) {
    uVar2 = *(undefined8 *)(unaff_x20 + -0x10);
    *(undefined8 *)(in_x9 + -8) = *(undefined8 *)(unaff_x20 + -8);
    *(undefined8 *)(in_x9 + -0x10) = uVar2;
    in_x9 = in_x9 + -0x10;
    in_x10 = unaff_x20 + -0x10;
    unaff_x20 = in_x10;
  }
  lVar1 = *unaff_x19;
  *unaff_x19 = in_x9;
  unaff_x19[1] = unaff_x21;
  unaff_x19[2] = param_1;
  if (lVar1 == 0) {
    unaff_x19[1] = unaff_x21;
    return;
  }
  __ZdlPv(lVar1);
  unaff_x19[1] = unaff_x21;
  return;
}

