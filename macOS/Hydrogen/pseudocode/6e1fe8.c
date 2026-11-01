
void FUN_006e1fe8(long param_1)

{
  byte bVar1;
  long lVar2;
  undefined8 *puVar3;
  long lVar4;
  long unaff_x19;
  int unaff_w20;
  undefined8 uVar5;
  
  if ((*(byte *)(param_1 + 1) >> 2 & 1) != 0) {
    func_0x006f0ed4();
  }
  if (unaff_w20 < 1) {
    if (unaff_w20 < -9999) {
      puVar3 = (undefined8 *)func_0x006e60a0();
    }
    else {
      puVar3 = (undefined8 *)(*(long *)(unaff_x19 + 8) + (long)unaff_w20 * 0x10);
    }
  }
  else {
    puVar3 = (undefined8 *)(*(long *)(unaff_x19 + 0x10) + (ulong)(unaff_w20 - 1) * 0x10);
    if (*(undefined8 **)(unaff_x19 + 8) <= puVar3) {
      lVar2 = __dyld_get_image_header(0);
      puVar3 = (undefined8 *)(lVar2 + 0x4e8dd08);
    }
  }
  if (unaff_w20 == -0x2712) {
    *(undefined8 *)(unaff_x19 + 0x58) = *(undefined8 *)(*(long *)(unaff_x19 + 8) + -0x10);
    *(long *)(unaff_x19 + 8) = *(long *)(unaff_x19 + 8) + -0x10;
    return;
  }
  if (unaff_w20 == -0x2711) {
    lVar4 = **(long **)(*(long *)(unaff_x19 + 0x20) + 8);
    lVar2 = *(long *)(unaff_x19 + 8);
    *(undefined8 *)(lVar4 + 0x10) = *(undefined8 *)(lVar2 + -0x10);
    if (*(int *)(lVar2 + -4) < 5) goto LAB_006e2094;
    bVar1 = *(byte *)(lVar4 + 1);
  }
  else {
    uVar5 = *(undefined8 *)(*(long *)(unaff_x19 + 8) + -0x10);
    puVar3[1] = *(undefined8 *)(*(long *)(unaff_x19 + 8) + -8);
    *puVar3 = uVar5;
    if ((-0x2713 < unaff_w20) || (lVar2 = *(long *)(unaff_x19 + 8), *(int *)(lVar2 + -4) < 5))
    goto LAB_006e2094;
    bVar1 = *(byte *)(**(long **)(*(long *)(unaff_x19 + 0x20) + 8) + 1);
  }
  if (((bVar1 >> 2 & 1) != 0) && ((*(byte *)(*(long *)(lVar2 + -0x10) + 1) & 3) != 0)) {
    func_0x006f0d48();
    *(long *)(unaff_x19 + 8) = *(long *)(unaff_x19 + 8) + -0x10;
    return;
  }
LAB_006e2094:
  *(long *)(unaff_x19 + 8) = *(long *)(unaff_x19 + 8) + -0x10;
  return;
}

