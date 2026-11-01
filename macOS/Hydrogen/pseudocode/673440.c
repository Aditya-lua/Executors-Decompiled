
undefined8 FUN_00673440(ulong param_1)

{
  undefined8 uVar1;
  undefined8 uVar2;
  ulong in_x9;
  uint *unaff_x19;
  uint *unaff_x21;
  undefined8 *unaff_x22;
  long unaff_x29;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  
  if (param_1 < in_x9) {
    uVar2 = *(undefined8 *)(unaff_x21 + 2);
    uVar1 = *(undefined8 *)unaff_x21;
    *(undefined8 *)(unaff_x29 + -0x30) = *(undefined8 *)(unaff_x21 + 4);
    *(undefined8 *)(unaff_x29 + -0x38) = uVar2;
    *(undefined8 *)(unaff_x29 + -0x40) = uVar1;
    uVar2 = unaff_x22[1];
    uVar1 = *unaff_x22;
    *(undefined8 *)(unaff_x21 + 4) = unaff_x22[2];
    *(undefined8 *)(unaff_x21 + 2) = uVar2;
    *(undefined8 *)unaff_x21 = uVar1;
    uVar1 = *(undefined8 *)(unaff_x29 + -0x40);
    unaff_x22[1] = *(undefined8 *)(unaff_x29 + -0x38);
    *unaff_x22 = uVar1;
    unaff_x22[2] = *(undefined8 *)(unaff_x29 + -0x30);
    if ((*unaff_x21 < *unaff_x19) ||
       ((*unaff_x21 == *unaff_x19 && (*(ulong *)(unaff_x21 + 2) < *(ulong *)(unaff_x19 + 2))))) {
      uVar4 = *(undefined8 *)(unaff_x19 + 2);
      uVar3 = *(undefined8 *)unaff_x19;
      *(undefined8 *)(unaff_x29 + -0x38) = uVar4;
      *(undefined8 *)(unaff_x29 + -0x40) = uVar3;
      uVar1 = *(undefined8 *)(unaff_x19 + 4);
      *(undefined8 *)(unaff_x29 + -0x30) = uVar1;
      uVar2 = *(undefined8 *)(unaff_x21 + 4);
      uVar5 = *(undefined8 *)unaff_x21;
      *(undefined8 *)(unaff_x19 + 2) = *(undefined8 *)(unaff_x21 + 2);
      *(undefined8 *)unaff_x19 = uVar5;
      *(undefined8 *)(unaff_x19 + 4) = uVar2;
      *(undefined8 *)(unaff_x21 + 4) = uVar1;
      *(undefined8 *)(unaff_x21 + 2) = uVar4;
      *(undefined8 *)unaff_x21 = uVar3;
    }
  }
  return 1;
}

