
void FUN_006b2acc(undefined8 param_1)

{
  undefined8 *puVar1;
  undefined1 in_ZR;
  long in_x9;
  long unaff_x19;
  long unaff_x20;
  long lVar2;
  long *unaff_x21;
  undefined8 unaff_x24;
  long unaff_x26;
  undefined8 uVar3;
  
  while (!(bool)in_ZR) {
    puVar1 = (undefined8 *)(unaff_x20 + -8);
    uVar3 = *(undefined8 *)(unaff_x20 + -0x10);
    unaff_x20 = unaff_x20 + -0x10;
    *(undefined8 *)(in_x9 + -8) = *puVar1;
    *(undefined8 *)(in_x9 + -0x10) = uVar3;
    in_x9 = in_x9 + -0x10;
    in_ZR = unaff_x20 == unaff_x26;
  }
  lVar2 = *unaff_x21;
  *(long *)(unaff_x19 + 0x1f0) = in_x9;
  *(undefined8 *)(unaff_x19 + 0x1f8) = unaff_x24;
  *(undefined8 *)(unaff_x19 + 0x200) = param_1;
  if (lVar2 != 0) {
    __ZdlPv(lVar2);
  }
  *(undefined8 *)(unaff_x19 + 0x1f8) = unaff_x24;
  return;
}

