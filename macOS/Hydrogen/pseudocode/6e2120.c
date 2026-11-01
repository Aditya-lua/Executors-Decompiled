
void FUN_006e2120(void)

{
  byte bVar1;
  undefined8 *puVar2;
  long lVar3;
  long lVar4;
  long unaff_x19;
  int unaff_w20;
  undefined8 uVar5;
  
  puVar2 = (undefined8 *)func_0x006e60a0();
  if (unaff_w20 == -0x2712) {
    *(undefined8 *)(unaff_x19 + 0x58) = *(undefined8 *)(*(long *)(unaff_x19 + 8) + -0x10);
    *(long *)(unaff_x19 + 8) = *(long *)(unaff_x19 + 8) + -0x10;
    return;
  }
  if (unaff_w20 == -0x2711) {
    lVar3 = **(long **)(*(long *)(unaff_x19 + 0x20) + 8);
    lVar4 = *(long *)(unaff_x19 + 8);
    *(undefined8 *)(lVar3 + 0x10) = *(undefined8 *)(lVar4 + -0x10);
    if (*(int *)(lVar4 + -4) < 5) goto code_r0x006e2094;
    bVar1 = *(byte *)(lVar3 + 1);
  }
  else {
    uVar5 = *(undefined8 *)(*(long *)(unaff_x19 + 8) + -0x10);
    puVar2[1] = *(undefined8 *)(*(long *)(unaff_x19 + 8) + -8);
    *puVar2 = uVar5;
    if ((-0x2713 < unaff_w20) || (lVar4 = *(long *)(unaff_x19 + 8), *(int *)(lVar4 + -4) < 5))
    goto code_r0x006e2094;
    bVar1 = *(byte *)(**(long **)(*(long *)(unaff_x19 + 0x20) + 8) + 1);
  }
  if (((bVar1 >> 2 & 1) != 0) && ((*(byte *)(*(long *)(lVar4 + -0x10) + 1) & 3) != 0)) {
    func_0x006f0d48();
    *(long *)(unaff_x19 + 8) = *(long *)(unaff_x19 + 8) + -0x10;
    return;
  }
code_r0x006e2094:
  *(long *)(unaff_x19 + 8) = *(long *)(unaff_x19 + 8) + -0x10;
  return;
}

