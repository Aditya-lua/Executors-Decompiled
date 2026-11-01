
void FUN_006b2f58(long param_1)

{
  long lVar1;
  undefined8 *puVar2;
  long in_x9;
  long unaff_x19;
  long unaff_x20;
  undefined4 unaff_w21;
  undefined4 unaff_w22;
  long *unaff_x23;
  long unaff_x26;
  long unaff_x28;
  undefined8 uVar3;
  
  *(undefined4 *)(in_x9 + 8) = unaff_w22;
  *(undefined4 *)(in_x9 + 0xc) = unaff_w21;
  lVar1 = in_x9 + 0x10;
  if (unaff_x20 != unaff_x26) {
    do {
      puVar2 = (undefined8 *)(unaff_x20 + -8);
      uVar3 = *(undefined8 *)(unaff_x20 + -0x10);
      unaff_x20 = unaff_x20 + -0x10;
      *(undefined8 *)(in_x9 + -8) = *puVar2;
      *(undefined8 *)(in_x9 + -0x10) = uVar3;
      in_x9 = in_x9 + -0x10;
    } while (unaff_x20 != unaff_x26);
    unaff_x20 = *unaff_x23;
  }
  *(long *)(unaff_x19 + 0x1c0) = in_x9;
  *(long *)(unaff_x19 + 0x1c8) = lVar1;
  *(long *)(unaff_x19 + 0x1d0) = param_1 + unaff_x28 * 0x10;
  if (unaff_x20 != 0) {
    __ZdlPv(unaff_x20);
  }
  *(long *)(unaff_x19 + 0x1c8) = lVar1;
  return;
}

