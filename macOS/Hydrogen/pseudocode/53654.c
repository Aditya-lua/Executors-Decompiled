
void FUN_00053654(ulong param_1)

{
  undefined1 *puVar1;
  undefined1 *puVar2;
  undefined1 *puVar3;
  ulong uVar4;
  ulong uVar5;
  undefined8 *puVar6;
  undefined8 *puVar7;
  ulong uVar8;
  undefined8 *unaff_x19;
  undefined1 *unaff_x21;
  undefined1 *unaff_x22;
  long unaff_x23;
  long unaff_x24;
  ulong unaff_x25;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 in_stack_00000010;
  long in_stack_00000020;
  
  if ((unaff_x25 | 7) != 0x17) {
    param_1 = unaff_x25 | 7;
  }
  puVar1 = (undefined1 *)__Znwm(param_1 + 1);
  unaff_x19[1] = unaff_x25;
  unaff_x19[2] = param_1 + 1 | 0x8000000000000000;
  *unaff_x19 = puVar1;
  if (unaff_x22 == unaff_x21) {
    *puVar1 = 0;
    goto joined_r0x000536e0;
  }
  uVar4 = (unaff_x23 + unaff_x24) - (long)unaff_x22;
  if ((uVar4 < 0x40) || ((ulong)((long)puVar1 - (long)unaff_x22) < 0x40)) {
code_r0x000536c8:
    do {
      puVar3 = unaff_x22 + 1;
      puVar2 = puVar1 + 1;
      *puVar1 = *unaff_x22;
      puVar1 = puVar2;
      unaff_x22 = puVar3;
    } while (puVar3 != unaff_x21);
  }
  else {
    uVar5 = uVar4 & 0xffffffffffffffc0;
    puVar2 = puVar1 + uVar5;
    puVar6 = (undefined8 *)(puVar1 + 0x20);
    puVar7 = (undefined8 *)(unaff_x22 + 0x20);
    uVar8 = uVar5;
    do {
      uVar9 = puVar7[-4];
      uVar11 = puVar7[-1];
      uVar10 = puVar7[-2];
      uVar13 = puVar7[1];
      uVar12 = *puVar7;
      uVar15 = puVar7[3];
      uVar14 = puVar7[2];
      puVar6[-3] = puVar7[-3];
      puVar6[-4] = uVar9;
      puVar6[-1] = uVar11;
      puVar6[-2] = uVar10;
      puVar6[1] = uVar13;
      *puVar6 = uVar12;
      puVar6[3] = uVar15;
      puVar6[2] = uVar14;
      uVar8 = uVar8 - 0x40;
      puVar6 = puVar6 + 8;
      puVar7 = puVar7 + 8;
    } while (uVar8 != 0);
    puVar1 = puVar2;
    unaff_x22 = unaff_x22 + uVar5;
    if (uVar4 != uVar5) goto code_r0x000536c8;
  }
  *puVar2 = 0;
joined_r0x000536e0:
  if (in_stack_00000020 < 0) {
    __ZdlPv(in_stack_00000010);
  }
  return;
}

