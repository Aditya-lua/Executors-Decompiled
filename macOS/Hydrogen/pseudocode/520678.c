
undefined8 FUN_00520678(void)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  long *unaff_x19;
  long unaff_x23;
  long unaff_x24;
  
  uVar1 = (unaff_x24 - unaff_x23) - 0x10;
  if (0x2f < uVar1) {
    uVar1 = (uVar1 >> 4) + 1;
    uVar2 = uVar1 & 0x1ffffffffffffffc;
    unaff_x23 = unaff_x23 + uVar2 * 0x10;
    uVar3 = uVar2;
    do {
      uVar3 = uVar3 - 4;
    } while (uVar3 != 0);
    if (uVar1 == uVar2) goto code_r0x005206b8;
  }
  do {
    unaff_x23 = unaff_x23 + 0x10;
  } while (unaff_x23 != unaff_x24);
code_r0x005206b8:
  *unaff_x19 = unaff_x23;
  return 0;
}

