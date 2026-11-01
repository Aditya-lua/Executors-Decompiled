
void FUN_006e2050(undefined8 *param_1)

{
  byte bVar1;
  long lVar2;
  long lVar3;
  long unaff_x19;
  int unaff_w20;
  undefined8 uVar4;
  
  if (unaff_w20 == -0x2712) {
    *(undefined8 *)(unaff_x19 + 0x58) = *(undefined8 *)(*(long *)(unaff_x19 + 8) + -0x10);
    *(long *)(unaff_x19 + 8) = *(long *)(unaff_x19 + 8) + -0x10;
    return;
  }
  if (unaff_w20 == -0x2711) {
    lVar2 = **(long **)(*(long *)(unaff_x19 + 0x20) + 8);
    lVar3 = *(long *)(unaff_x19 + 8);
    *(undefined8 *)(lVar2 + 0x10) = *(undefined8 *)(lVar3 + -0x10);
    if (*(int *)(lVar3 + -4) < 5) goto LAB_006e2094;
    bVar1 = *(byte *)(lVar2 + 1);
  }
  else {
    uVar4 = *(undefined8 *)(*(long *)(unaff_x19 + 8) + -0x10);
    param_1[1] = *(undefined8 *)(*(long *)(unaff_x19 + 8) + -8);
    *param_1 = uVar4;
    if ((-0x2713 < unaff_w20) || (lVar3 = *(long *)(unaff_x19 + 8), *(int *)(lVar3 + -4) < 5))
    goto LAB_006e2094;
    bVar1 = *(byte *)(**(long **)(*(long *)(unaff_x19 + 0x20) + 8) + 1);
  }
  if (((bVar1 >> 2 & 1) != 0) && ((*(byte *)(*(long *)(lVar3 + -0x10) + 1) & 3) != 0)) {
    func_0x006f0d48();
    *(long *)(unaff_x19 + 8) = *(long *)(unaff_x19 + 8) + -0x10;
    return;
  }
LAB_006e2094:
  *(long *)(unaff_x19 + 8) = *(long *)(unaff_x19 + 8) + -0x10;
  return;
}

