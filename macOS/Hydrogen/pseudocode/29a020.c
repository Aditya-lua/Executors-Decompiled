
void FUN_0029a020(ulong param_1)

{
  ulong uVar1;
  undefined4 uVar2;
  undefined1 uVar3;
  undefined4 *in_x5;
  ulong uVar4;
  ulong uVar5;
  undefined8 *puVar6;
  ulong uVar7;
  undefined8 *puVar8;
  ulong uVar9;
  long lVar10;
  ulong *unaff_x19;
  ulong *unaff_x20;
  ulong unaff_x21;
  ulong uVar11;
  ulong *unaff_x22;
  code *unaff_x23;
  ulong *unaff_x25;
  ulong *puVar12;
  ulong *unaff_x26;
  ulong uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined1 uStack0000000000000001;
  long in_stack_00000018;
  
  while( true ) {
    puVar12 = unaff_x25;
    *unaff_x22 = param_1 ^ *unaff_x22;
    uVar11 = unaff_x21 - 0x10;
    unaff_x22[1] = unaff_x26[1] ^ unaff_x22[1];
    unaff_x25 = unaff_x20 + 2;
    unaff_x22 = unaff_x22 + 2;
    if (uVar11 < 0x10) break;
    (*unaff_x23)(unaff_x25,unaff_x22);
    param_1 = *puVar12;
    unaff_x20 = unaff_x25;
    unaff_x21 = uVar11;
    unaff_x26 = puVar12;
  }
  uVar13 = *unaff_x20;
  unaff_x19[1] = unaff_x20[1];
  *unaff_x19 = uVar13;
  if (uVar11 == 0) goto LAB_0029a120;
  (*unaff_x23)(unaff_x25);
  uVar13 = uVar11;
  if (uVar11 < 0x10) {
    uVar13 = 0xf;
  }
  uVar4 = 0xffffffffffffffff;
  do {
    uVar3 = *(undefined1 *)((long)unaff_x25 + uVar4 + 1);
    *(byte *)((long)unaff_x22 + uVar4 + 1) =
         *(byte *)((long)unaff_x19 + uVar4 + 1) ^ (&uStack0000000000000001)[uVar4];
    *(undefined1 *)((long)unaff_x19 + uVar4 + 1) = uVar3;
    uVar4 = uVar4 + 1;
  } while (uVar4 - uVar11 != -1);
  if (0xe < uVar4) goto LAB_0029a120;
  uVar1 = (uVar13 - uVar11) + 1;
  if ((uVar1 < 8) || ((ulong)((long)unaff_x19 - (long)unaff_x25) < 0x40)) {
    uVar5 = uVar11;
  }
  else {
    if (uVar1 < 0x40) {
      uVar7 = 0;
    }
    else {
      uVar7 = uVar1 & 0xffffffffffffffc0;
      puVar6 = (undefined8 *)((long)unaff_x19 + unaff_x21 + 0x10);
      puVar8 = (undefined8 *)((long)unaff_x25 + unaff_x21 + 0x10);
      uVar5 = uVar7;
      do {
        uVar14 = puVar8[-4];
        uVar16 = puVar8[-1];
        uVar15 = puVar8[-2];
        uVar18 = puVar8[1];
        uVar17 = *puVar8;
        uVar20 = puVar8[3];
        uVar19 = puVar8[2];
        puVar6[-3] = puVar8[-3];
        puVar6[-4] = uVar14;
        puVar6[-1] = uVar16;
        puVar6[-2] = uVar15;
        puVar6[1] = uVar18;
        *puVar6 = uVar17;
        puVar6[3] = uVar20;
        puVar6[2] = uVar19;
        uVar5 = uVar5 - 0x40;
        puVar6 = puVar6 + 8;
        puVar8 = puVar8 + 8;
      } while (uVar5 != 0);
      if (uVar1 == uVar7) goto LAB_0029a120;
      if ((uVar1 & 0x38) == 0) {
        uVar5 = uVar11 + uVar7;
        goto LAB_0029a104;
      }
    }
    uVar9 = uVar1 & 0xfffffffffffffff8;
    uVar5 = uVar11 + uVar9;
    lVar10 = uVar7 - uVar9;
    puVar6 = (undefined8 *)((long)unaff_x25 + uVar11 + uVar7);
    puVar8 = (undefined8 *)((long)unaff_x19 + uVar11 + uVar7);
    do {
      *puVar8 = *puVar6;
      lVar10 = lVar10 + 8;
      puVar6 = puVar6 + 1;
      puVar8 = puVar8 + 1;
    } while (lVar10 != 0);
    if (uVar1 == uVar9) goto LAB_0029a120;
  }
LAB_0029a104:
  do {
    *(undefined1 *)((long)unaff_x19 + uVar5) = *(undefined1 *)((long)unaff_x25 + uVar5);
    uVar5 = uVar5 + 1;
  } while ((uVar13 - uVar11) + uVar4 + 2 != uVar5);
LAB_0029a120:
  if (*(long *)PTR____stack_chk_guard_009b01e8 == in_stack_00000018) {
    return;
  }
  ___stack_chk_fail();
  uVar2 = *in_x5;
  func_0x0029a230();
  *in_x5 = uVar2;
  return;
}

