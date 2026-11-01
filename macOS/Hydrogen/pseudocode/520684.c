
undefined8 FUN_00520684(ulong param_1)

{
  ulong uVar1;
  bool in_CY;
  ulong uVar2;
  ulong uVar3;
  long *unaff_x19;
  long unaff_x23;
  long unaff_x24;
  
  if (in_CY) {
    uVar1 = (param_1 >> 4) + 1;
    uVar2 = uVar1 & 0x1ffffffffffffffc;
    unaff_x23 = unaff_x23 + uVar2 * 0x10;
    uVar3 = uVar2;
    do {
      uVar3 = uVar3 - 4;
    } while (uVar3 != 0);
    if (uVar1 == uVar2) goto LAB_005206b8;
  }
  do {
    unaff_x23 = unaff_x23 + 0x10;
  } while (unaff_x23 != unaff_x24);
LAB_005206b8:
  *unaff_x19 = unaff_x23;
  return 0;
}

