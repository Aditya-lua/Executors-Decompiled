
void FUN_00525754(void)

{
  ulong uVar1;
  undefined1 uVar2;
  code *pcVar3;
  undefined8 *puVar4;
  ulong uVar5;
  undefined8 *puVar6;
  long lVar7;
  undefined8 *puVar8;
  undefined8 *puVar9;
  long lVar10;
  undefined8 in_x16;
  ulong unaff_x19;
  undefined8 *unaff_x20;
  long unaff_x21;
  undefined8 unaff_x22;
  undefined8 *puVar11;
  undefined8 unaff_x23;
  undefined1 unaff_w24;
  ulong uVar12;
  undefined8 uVar13;
  undefined8 unaff_x28;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  
  uVar12 = unaff_x19 * 0x10;
  if (unaff_x19 >> 0x3c != 0 || 0x7ffffffffffffff8 < uVar12) {
    uVar13 = 0;
LAB_00525904:
    func_0x007a1f00(uVar13,uVar12,&UNK_009e7fc8);
                    /* WARNING: Does not return */
    pcVar3 = (code *)SoftwareBreakpoint(1,0x52591c);
    (*pcVar3)();
  }
  if (uVar12 == 0) {
    puVar4 = (undefined8 *)0x8;
    goto LAB_00525878;
  }
  puVar11 = *(undefined8 **)(unaff_x21 + 0x38);
  uVar13 = 8;
  puVar4 = (undefined8 *)func_0x00187bd0(uVar12,8);
  if (puVar4 == (undefined8 *)0x0) goto LAB_00525904;
  if (unaff_x19 == 0) goto LAB_00525878;
  uVar5 = unaff_x19 - 1;
  uVar12 = unaff_x19;
  if (uVar5 <= unaff_x19) {
    uVar12 = uVar5;
  }
  if (uVar12 < 8) {
LAB_00525838:
    lVar7 = 0;
    uVar12 = unaff_x19;
    puVar6 = puVar11;
  }
  else {
    uVar1 = unaff_x19;
    if (uVar5 <= unaff_x19) {
      uVar1 = uVar5;
    }
    if (puVar4 < puVar11 + uVar1 * 2 + 2 && puVar11 < puVar4 + uVar1 * 2 + 2) goto LAB_00525838;
    uVar5 = uVar12 + 1 & 3;
    uVar1 = 4;
    if (uVar5 != 0) {
      uVar1 = uVar5;
    }
    lVar7 = (uVar12 + 1) - uVar1;
    uVar12 = unaff_x19 - lVar7;
    puVar6 = puVar11 + lVar7 * 2;
    puVar8 = puVar4 + 4;
    puVar9 = puVar11 + 4;
    lVar10 = lVar7;
    do {
      uVar14 = puVar9[-3];
      uVar13 = puVar9[-2];
      uVar15 = puVar9[-1];
      uVar16 = *puVar9;
      uVar18 = puVar9[1];
      uVar17 = puVar9[2];
      uVar19 = puVar9[3];
      puVar8[-4] = puVar9[-4];
      puVar8[-3] = uVar14;
      puVar8[-2] = uVar13;
      puVar8[-1] = uVar15;
      *puVar8 = uVar16;
      puVar8[1] = uVar18;
      puVar8[2] = uVar17;
      puVar8[3] = uVar19;
      puVar8 = puVar8 + 8;
      puVar9 = puVar9 + 8;
      lVar10 = lVar10 + -4;
    } while (lVar10 != 0);
  }
  puVar8 = puVar4 + lVar7 * 2 + 1;
  do {
    if (puVar6 == puVar11 + unaff_x19 * 2) break;
    uVar13 = puVar6[1];
    puVar8[-1] = *puVar6;
    *puVar8 = uVar13;
    puVar8 = puVar8 + 2;
    uVar12 = uVar12 - 1;
    puVar6 = puVar6 + 2;
  } while (uVar12 != 0);
LAB_00525878:
  uVar2 = *(undefined1 *)(unaff_x21 + 0x59);
  unaff_x20[9] = in_stack_00000020;
  unaff_x20[10] = in_stack_00000028;
  *unaff_x20 = unaff_x23;
  unaff_x20[1] = unaff_x22;
  *(undefined1 *)(unaff_x20 + 0xb) = unaff_w24;
  unaff_x20[2] = unaff_x23;
  unaff_x20[3] = unaff_x28;
  unaff_x20[4] = in_x16;
  unaff_x20[5] = unaff_x28;
  unaff_x20[6] = unaff_x19;
  unaff_x20[7] = puVar4;
  unaff_x20[8] = unaff_x19;
  *(undefined1 *)((long)unaff_x20 + 0x59) = uVar2;
  return;
}

