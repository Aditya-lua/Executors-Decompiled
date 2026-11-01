
void FUN_0071e83c(long param_1)

{
  undefined8 *puVar1;
  long lVar2;
  long in_x9;
  long unaff_x19;
  long *unaff_x20;
  long unaff_x21;
  long unaff_x22;
  long unaff_x23;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  
  *(undefined8 *)(in_x9 + 0x30) = *(undefined8 *)(unaff_x22 + 0x30);
  lVar2 = in_x9 + 0x38;
  if (unaff_x21 != unaff_x23) {
    do {
      uVar4 = *(undefined8 *)(unaff_x21 + -0x30);
      uVar3 = *(undefined8 *)(unaff_x21 + -0x38);
      uVar6 = *(undefined8 *)(unaff_x21 + -0x20);
      uVar5 = *(undefined8 *)(unaff_x21 + -0x28);
      uVar8 = *(undefined8 *)(unaff_x21 + -0x10);
      uVar7 = *(undefined8 *)(unaff_x21 + -0x18);
      puVar1 = (undefined8 *)(unaff_x21 + -8);
      unaff_x21 = unaff_x21 + -0x38;
      *(undefined8 *)(in_x9 + -8) = *puVar1;
      *(undefined8 *)(in_x9 + -0x10) = uVar8;
      *(undefined8 *)(in_x9 + -0x18) = uVar7;
      *(undefined8 *)(in_x9 + -0x20) = uVar6;
      *(undefined8 *)(in_x9 + -0x28) = uVar5;
      *(undefined8 *)(in_x9 + -0x30) = uVar4;
      *(undefined8 *)(in_x9 + -0x38) = uVar3;
      in_x9 = in_x9 + -0x38;
    } while (unaff_x21 != unaff_x23);
    unaff_x21 = *unaff_x20;
  }
  *unaff_x20 = in_x9;
  unaff_x20[1] = lVar2;
  unaff_x20[2] = param_1;
  if (unaff_x21 != 0) {
    __ZdlPv(unaff_x21);
  }
  unaff_x20[1] = lVar2;
  *(long *)(unaff_x19 + 0x10) = *(long *)(unaff_x19 + 0x10) + 1;
  return;
}

