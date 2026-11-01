
void FUN_005fb56c(ulong param_1)

{
  ulong *puVar1;
  ulong *puVar2;
  bool bVar3;
  ulong uVar4;
  ulong *in_x9;
  ulong *in_x10;
  ulong *puVar5;
  ulong *in_x11;
  ulong *puVar6;
  ulong uVar7;
  int iVar8;
  ulong in_x12;
  ulong uVar9;
  ulong uVar10;
  long in_x13;
  ulong uVar11;
  ulong uVar12;
  ulong uVar13;
  ulong uVar14;
  ulong uVar15;
  ulong uVar16;
  ulong unaff_x19;
  ulong unaff_x20;
  long unaff_x21;
  ulong *unaff_x22;
  long unaff_x23;
  long in_stack_00000000;
  long in_stack_00000008;
  
  while( true ) {
    in_x9[-1] = in_x12;
    uVar13 = *in_x11 - *in_x10;
    uVar4 = in_x13 + uVar13;
    uVar13 = (ulong)(uVar13 < uVar4);
    if (*in_x11 < *in_x10) {
      uVar13 = uVar13 + 1;
    }
    param_1 = param_1 + 2;
    *in_x9 = uVar4;
    if (unaff_x19 <= param_1) break;
    uVar4 = in_x11[1] - in_x10[1];
    in_x12 = uVar4 - uVar13;
    in_x13 = -(ulong)(uVar4 < uVar13) - (ulong)(in_x11[1] < in_x10[1]);
    in_x9 = in_x9 + 2;
    in_x10 = in_x10 + 2;
    in_x11 = in_x11 + 2;
  }
  puVar1 = unaff_x22 + unaff_x20;
  func_0x005fb3a8(puVar1,unaff_x21 + unaff_x20 * 8);
  func_0x005fb3a8();
  func_0x005fb3a8();
  uVar13 = 0;
  uVar4 = 0;
  puVar5 = puVar1 + 1;
  puVar6 = unaff_x22 + unaff_x19 + 1;
  do {
    uVar9 = puVar5[-1];
    uVar11 = puVar6[-1];
    uVar12 = (ulong)CARRY8(uVar11 + uVar9,uVar13);
    puVar5[-1] = uVar11 + uVar9 + uVar13;
    uVar7 = *puVar6 + *puVar5;
    uVar13 = (ulong)(CARRY8(uVar7,uVar12) || CARRY8(uVar7 + uVar12,(ulong)CARRY8(uVar11,uVar9)));
    if (CARRY8(*puVar6,*puVar5)) {
      uVar13 = uVar13 + 1;
    }
    *puVar5 = uVar7 + uVar12 + (ulong)CARRY8(uVar11,uVar9);
    uVar4 = uVar4 + 2;
    puVar5 = puVar5 + 2;
    puVar6 = puVar6 + 2;
  } while (uVar4 < unaff_x19);
  uVar7 = 0;
  uVar4 = 0;
  do {
    uVar12 = (unaff_x22 + unaff_x20 + 1)[-1];
    uVar14 = *unaff_x22;
    uVar16 = (ulong)CARRY8(uVar14 + uVar12,uVar7);
    unaff_x22[unaff_x19] = uVar14 + uVar12 + uVar7;
    uVar11 = unaff_x22[unaff_x20 + 1];
    uVar9 = unaff_x22[1] + uVar11;
    uVar7 = (ulong)(CARRY8(uVar9,uVar16) || CARRY8(uVar9 + uVar16,(ulong)CARRY8(uVar14,uVar12)));
    if (CARRY8(unaff_x22[1],uVar11)) {
      uVar7 = uVar7 + 1;
    }
    unaff_x22[unaff_x19 + 1] = uVar9 + uVar16 + (ulong)CARRY8(uVar14,uVar12);
    uVar4 = uVar4 + 2;
    unaff_x22 = unaff_x22 + 2;
  } while (uVar4 < unaff_x19);
  uVar9 = 0;
  uVar4 = 0;
  puVar6 = puVar1 + unaff_x19;
  puVar5 = puVar1;
  do {
    uVar16 = puVar5[unaff_x19];
    uVar12 = *puVar5;
    uVar14 = (ulong)CARRY8(uVar16 + uVar12,uVar9);
    *puVar5 = uVar16 + uVar12 + uVar9;
    uVar11 = puVar5[unaff_x19 + 1] + puVar5[1];
    uVar9 = (ulong)(CARRY8(uVar11,uVar14) || CARRY8(uVar11 + uVar14,(ulong)CARRY8(uVar16,uVar12)));
    if (CARRY8(puVar5[unaff_x19 + 1],puVar5[1])) {
      uVar9 = uVar9 + 1;
    }
    puVar5[1] = uVar11 + uVar14 + (ulong)CARRY8(uVar16,uVar12);
    uVar4 = uVar4 + 2;
    puVar5 = puVar5 + 2;
  } while (uVar4 < unaff_x19);
  uVar7 = uVar7 + uVar13;
  if (in_stack_00000008 == in_stack_00000000) {
    uVar11 = 0;
    uVar4 = 0;
    do {
      puVar5 = (ulong *)(unaff_x23 + uVar4 * 8);
      puVar2 = (ulong *)(unaff_x21 + uVar4 * 8);
      uVar15 = *puVar2;
      uVar12 = *puVar5;
      uVar14 = uVar12 - uVar15;
      *puVar5 = uVar14 - uVar11;
      uVar10 = puVar2[1];
      uVar16 = puVar5[1] - uVar10;
      uVar12 = (-(ulong)(uVar14 < uVar11) - (ulong)(uVar12 < uVar15)) + uVar16;
      uVar11 = (ulong)(uVar16 < uVar12);
      if (puVar5[1] < uVar10) {
        uVar11 = uVar11 + 1;
      }
      puVar5[1] = uVar12;
      uVar4 = uVar4 + 2;
    } while (uVar4 < unaff_x20);
    iVar8 = -(int)uVar11;
    uVar4 = *puVar1;
    *puVar1 = uVar7 + uVar4;
  }
  else {
    uVar11 = 0;
    uVar4 = 0;
    do {
      puVar5 = (ulong *)(unaff_x23 + uVar4 * 8);
      puVar2 = (ulong *)(unaff_x21 + uVar4 * 8);
      uVar15 = *puVar2;
      uVar14 = *puVar5;
      uVar16 = (ulong)CARRY8(uVar15 + uVar14,uVar11);
      *puVar5 = uVar15 + uVar14 + uVar11;
      uVar10 = puVar2[1];
      uVar12 = uVar10 + puVar5[1];
      uVar11 = (ulong)(CARRY8(uVar12,uVar16) || CARRY8(uVar12 + uVar16,(ulong)CARRY8(uVar15,uVar14))
                      );
      if (CARRY8(uVar10,puVar5[1])) {
        uVar11 = uVar11 + 1;
      }
      puVar5[1] = uVar12 + uVar16 + (ulong)CARRY8(uVar15,uVar14);
      uVar4 = uVar4 + 2;
    } while (uVar4 < unaff_x20);
    iVar8 = (int)uVar11;
    uVar4 = *puVar1;
    *puVar1 = uVar7 + uVar4;
  }
  iVar8 = (int)uVar9 + (int)uVar13 + iVar8;
  if (CARRY8(uVar7,uVar4)) {
    uVar4 = 2;
    uVar13 = 1;
    do {
      uVar7 = uVar4;
      uVar9 = puVar1[uVar13];
      puVar1[uVar13] = uVar9 + 1;
      uVar4 = (ulong)((int)uVar7 + 1);
      uVar13 = uVar7;
    } while ((uVar9 == 0xffffffffffffffff && uVar7 <= unaff_x19) &&
             (uVar9 != 0xffffffffffffffff || unaff_x19 != uVar7));
    uVar4 = (ulong)(int)((uint)(uVar9 + 1 == 0) + iVar8);
    bVar3 = CARRY8(*puVar6,uVar4);
    *puVar6 = *puVar6 + uVar4;
  }
  else {
    bVar3 = CARRY8(*puVar6,(long)iVar8);
    *puVar6 = *puVar6 + (long)iVar8;
  }
  if (bVar3) {
    uVar4 = 2;
    uVar13 = 1;
    do {
      uVar7 = uVar4;
      uVar9 = puVar6[uVar13];
      puVar6[uVar13] = uVar9 + 1;
      uVar4 = (ulong)((int)uVar7 + 1);
      uVar13 = uVar7;
    } while ((uVar9 == 0xffffffffffffffff && uVar7 <= unaff_x19) &&
             (uVar9 != 0xffffffffffffffff || unaff_x19 != uVar7));
  }
  return;
}

