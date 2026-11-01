
void FUN_00143b40(void)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  int iVar5;
  int in_w8;
  uint in_w9;
  long unaff_x19;
  long unaff_x20;
  float fVar6;
  float fVar7;
  float fVar8;
  float fVar9;
  float fVar10;
  float fVar11;
  float fVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  float fVar15;
  
  uVar2 = *(uint *)(unaff_x20 + 0x48);
  uVar3 = (int)((ulong)(*(long *)(unaff_x19 + 0x10) - *(long *)(unaff_x19 + 8)) >> 3) * -0x55555555;
  uVar1 = uVar2;
  if ((int)uVar3 <= (int)uVar2) {
    uVar1 = uVar3;
  }
  if (uVar2 - in_w8 != -2) {
    uVar3 = uVar1;
  }
  uVar1 = *(uint *)(unaff_x19 + 0x6c);
  if ((int)in_w9 <= (int)*(uint *)(unaff_x19 + 0x6c)) {
    uVar1 = in_w9;
  }
  uVar2 = *(uint *)(unaff_x19 + 0x70);
  if ((int)*(uint *)(unaff_x19 + 0x70) <= (int)uVar3) {
    uVar2 = uVar3;
  }
  uVar1 = uVar1 & ((int)uVar1 >> 0x1f ^ 0xffffffffU);
  uVar3 = uVar1;
  if ((int)uVar1 <= (int)uVar2) {
    uVar3 = uVar2;
  }
  *(uint *)(unaff_x19 + 0x6c) = uVar1;
  *(uint *)(unaff_x19 + 0x70) = uVar3;
  *(undefined1 *)(unaff_x19 + 0x248) = 1;
  if (*(char *)(unaff_x20 + 0x17) < '\0') {
    if (*(long *)(unaff_x20 + 8) == 0) goto LAB_00143c48;
  }
  else if (*(char *)(unaff_x20 + 0x17) == '\0') goto LAB_00143c48;
  func_0x00138e48();
  uVar4 = *(int *)(unaff_x20 + 0x18) - 1;
  uVar2 = *(uint *)(unaff_x20 + 0x20);
  uVar3 = (int)((ulong)(*(long *)(unaff_x19 + 0x10) - *(long *)(unaff_x19 + 8)) >> 3) * -0x55555555;
  uVar1 = uVar2;
  if ((int)uVar3 <= (int)uVar2) {
    uVar1 = uVar3;
  }
  if (uVar2 - *(int *)(unaff_x20 + 0x18) != -2) {
    uVar3 = uVar1;
  }
  uVar1 = *(uint *)(unaff_x19 + 0x6c);
  if ((int)uVar4 <= (int)*(uint *)(unaff_x19 + 0x6c)) {
    uVar1 = uVar4;
  }
  uVar2 = *(uint *)(unaff_x19 + 0x70);
  if ((int)*(uint *)(unaff_x19 + 0x70) <= (int)uVar3) {
    uVar2 = uVar3;
  }
  uVar1 = uVar1 & ((int)uVar1 >> 0x1f ^ 0xffffffffU);
  uVar3 = uVar1;
  if ((int)uVar1 <= (int)uVar2) {
    uVar3 = uVar2;
  }
  *(uint *)(unaff_x19 + 0x6c) = uVar1;
  *(uint *)(unaff_x19 + 0x70) = uVar3;
  *(undefined1 *)(unaff_x19 + 0x248) = 1;
LAB_00143c48:
  uVar14 = *(undefined8 *)(unaff_x20 + 0x70);
  uVar13 = *(undefined8 *)(unaff_x20 + 0x68);
  *(undefined8 *)(unaff_x19 + 0x30) = *(undefined8 *)(unaff_x20 + 0x78);
  *(undefined8 *)(unaff_x19 + 0x28) = uVar14;
  *(undefined8 *)(unaff_x19 + 0x20) = uVar13;
  if (*(char *)(unaff_x19 + 0x5a) == '\0') {
    *(undefined1 *)(unaff_x19 + 0x5b) = 1;
  }
  else {
    fVar6 = (float)func_0x000d8c54();
    fVar7 = (float)func_0x000d8c68();
    fVar8 = (float)func_0x000d3c9c();
    fVar9 = (float)func_0x000d3c88();
    fVar10 = *(float *)(unaff_x19 + 0x294);
    fVar15 = *(float *)(unaff_x19 + 0x290);
    iVar5 = func_0x00137dcc();
    fVar11 = (float)func_0x00141ca0();
    if (iVar5 <= (int)(fVar7 / fVar10)) {
      fVar12 = *(float *)(unaff_x19 + 0x294) * (float)(iVar5 + -1);
      if (fVar12 <= 0.0) {
        fVar12 = 0.0;
      }
      func_0x000d8ce0(fVar12);
    }
    if ((int)((fVar7 + fVar8) / fVar10) + -4 < iVar5) {
      fVar8 = (float)(iVar5 + 4) * *(float *)(unaff_x19 + 0x294) - fVar8;
      if (fVar8 <= 0.0) {
        fVar8 = 0.0;
      }
      func_0x000d8ce0(fVar8);
    }
    fVar7 = fVar11 + *(float *)(unaff_x19 + 0x60);
    if (fVar7 < (float)((int)(fVar6 / fVar15) + 4)) {
      fVar7 = fVar7 + -4.0;
      if (fVar7 <= 0.0) {
        fVar7 = 0.0;
      }
      func_0x000d8cc4(fVar7);
      fVar7 = fVar11 + *(float *)(unaff_x19 + 0x60);
    }
    if ((float)((int)((fVar6 + fVar9) / fVar15) + -4) < fVar7) {
      fVar9 = (fVar7 + 4.0) - fVar9;
      if (fVar9 <= 0.0) {
        fVar9 = 0.0;
      }
      func_0x000d8cc4(fVar9);
    }
  }
  return;
}

