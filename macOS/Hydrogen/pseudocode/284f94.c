
/* WARNING: Removing unreachable block (ram,0x00285154) */
/* WARNING: Removing unreachable block (ram,0x00285158) */
/* WARNING: Removing unreachable block (ram,0x0028516c) */
/* WARNING: Removing unreachable block (ram,0x00285170) */
/* WARNING: Removing unreachable block (ram,0x00285174) */
/* WARNING: Removing unreachable block (ram,0x0028518c) */
/* WARNING: Removing unreachable block (ram,0x002851a4) */
/* WARNING: Removing unreachable block (ram,0x002851b4) */

undefined8 FUN_00284f94(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  byte bVar1;
  byte bVar2;
  byte bVar3;
  byte bVar4;
  uint uVar5;
  uint uVar6;
  uint uVar7;
  int iVar8;
  int iVar9;
  int iVar10;
  int iVar11;
  int iVar12;
  int iVar13;
  undefined8 uVar14;
  int *piVar15;
  ulong uVar16;
  byte *pbVar17;
  byte *unaff_x20;
  long unaff_x21;
  long unaff_x29;
  long lVar18;
  undefined1 auVar19 [16];
  undefined1 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  undefined1 uStack0000000000000020;
  int iStack_88;
  int iStack_84;
  byte *pbStack_80;
  long lStack_78;
  int iStack_64;
  
  iVar8 = func_0x00282698(param_1,unaff_x29 + -0x40);
  iVar13 = (int)param_3;
  if (iVar8 != 0) {
    while (iVar13 = (int)param_3, unaff_x21 != 0) {
      uVar16 = 0;
      pbVar17 = unaff_x20;
      do {
        if ((unaff_x21 == 0) || (uVar16 >> 0x39 != 0)) goto LAB_00284eb8;
        unaff_x20 = pbVar17 + 1;
        bVar1 = *pbVar17;
        if ((uVar16 == 0) && (bVar1 == 0x80)) goto LAB_00284eb8;
        uVar16 = (ulong)bVar1 & 0x7f | uVar16 << 7;
        unaff_x21 = unaff_x21 + -1;
        pbVar17 = unaff_x20;
      } while ((char)bVar1 < '\0');
      iVar8 = func_0x002824fc(&uStack0000000000000020,0x2e);
      if (iVar8 == 0) goto LAB_00284eb8;
      _snprintf(unaff_x29 + -0x40,0x18,"%llu");
      param_3 = _strlen(unaff_x29 + -0x40);
      iVar8 = func_0x00282698(&uStack0000000000000020,unaff_x29 + -0x40);
      iVar13 = (int)param_3;
      if (iVar8 == 0) goto LAB_00284eb8;
    }
    iVar8 = func_0x002824fc(&uStack0000000000000020,0);
    if (iVar8 != 0) {
      iVar13 = (int)&uStack0000000000000010;
      iVar8 = func_0x00281efc(&uStack0000000000000020,&uStack0000000000000018);
      if (iVar8 != 0) {
        uVar14 = uStack0000000000000018;
        if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x28)) {
          return uStack0000000000000018;
        }
        goto code_r0x0028506c;
      }
    }
  }
LAB_00284eb8:
  func_0x00281ecc(&uStack0000000000000020);
  uVar14 = 0;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x28)) {
    return 0;
  }
code_r0x0028506c:
  auVar19 = ___stack_chk_fail(uVar14);
  piVar15 = auVar19._8_8_;
  lVar18 = auVar19._0_8_[1];
  pbVar17 = (byte *)*auVar19._0_8_;
  if (lVar18 == 0) {
    return 0;
  }
  bVar1 = *pbVar17;
  pbStack_80 = pbVar17;
  lStack_78 = lVar18;
  iVar8 = func_0x0036e898(bVar1);
  if (lVar18 == 1 || iVar8 == 0) {
    return 0;
  }
  bVar2 = pbVar17[1];
  uVar14 = func_0x0036e898(bVar2);
  if ((int)uVar14 == 0) {
    return uVar14;
  }
  if (lVar18 == 2) {
    return 0;
  }
  bVar3 = pbVar17[2];
  lStack_78 = lVar18 + -3;
  iVar8 = func_0x0036e898(bVar3);
  if (lVar18 + -3 == 0) {
    return 0;
  }
  if (iVar8 == 0) {
    return 0;
  }
  bVar4 = pbVar17[3];
  pbStack_80 = pbVar17 + 4;
  uVar14 = func_0x0036e898(bVar4);
  if ((int)uVar14 == 0) {
    return uVar14;
  }
  iVar8 = (uint)bVar3 * 10 + ((uint)bVar2 + (uint)bVar1 * 10 + -0x210) * 100 + (uint)bVar4;
  if (lVar18 == 4) {
    return 0;
  }
  bVar1 = pbVar17[4];
  iVar9 = func_0x0036e898(bVar1);
  if (lVar18 == 5) {
    return 0;
  }
  if (iVar9 == 0) {
    return 0;
  }
  bVar2 = pbVar17[5];
  uVar14 = func_0x0036e898(bVar2);
  if ((int)uVar14 == 0) {
    return uVar14;
  }
  iVar9 = (uint)bVar2 + (uint)bVar1 * 10;
  if (iVar9 - 0x21dU < 0xfffffff4 || lVar18 == 6) {
    return 0;
  }
  bVar1 = pbVar17[6];
  iVar10 = func_0x0036e898(bVar1);
  if (lVar18 == 7) {
    return 0;
  }
  if (iVar10 == 0) {
    return 0;
  }
  bVar2 = pbVar17[7];
  uVar14 = func_0x0036e898(bVar2);
  if ((int)uVar14 == 0) {
    return uVar14;
  }
  uVar6 = ((uint)bVar2 + (uint)bVar1 * 10) - 0x210;
  if ((int)uVar6 < 1) {
    return 0;
  }
  uVar7 = iVar9 - 0x210;
  if (0xc < uVar7) {
    return 0;
  }
  uVar5 = 1 << (ulong)(uVar7 & 0x1f);
  if ((uVar5 & 0x15aa) == 0) {
    if ((uVar5 & 0xa50) == 0) {
      if (uVar7 != 2) {
        return 0;
      }
      uVar7 = (iVar8 - 0x210U) * -0x3d70a3d7 + 0x51eb850;
      if ((uVar7 >> 4 | iVar8 * -0x70000000) < 0xa3d70b ||
          (iVar8 - 0x210U & 3) == 0 && 0x28f5c28 < (uVar7 >> 2 | iVar8 * 0x40000000)) {
        if (0x1d < uVar6) {
          return 0;
        }
      }
      else if (0x1c < uVar6) {
        return 0;
      }
    }
    else if (0x1e < uVar6) {
      return 0;
    }
  }
  else if (0x1f < uVar6) {
    return 0;
  }
  if (lVar18 == 8) {
    return 0;
  }
  bVar1 = pbVar17[8];
  iVar10 = func_0x0036e898(bVar1);
  if (lVar18 == 9) {
    return 0;
  }
  if (iVar10 == 0) {
    return 0;
  }
  bVar2 = pbVar17[9];
  uVar14 = func_0x0036e898(bVar2);
  if ((int)uVar14 == 0) {
    return uVar14;
  }
  iVar10 = (uint)bVar2 + (uint)bVar1 * 10 + -0x210;
  if (0x17 < iVar10) {
    return 0;
  }
  if (lVar18 == 10) {
    return 0;
  }
  bVar1 = pbVar17[10];
  iVar11 = func_0x0036e898(bVar1);
  if (lVar18 == 0xb) {
    return 0;
  }
  if (iVar11 == 0) {
    return 0;
  }
  pbStack_80 = pbVar17 + 0xc;
  lStack_78 = lVar18 + -0xc;
  bVar2 = pbVar17[0xb];
  uVar14 = func_0x0036e898(bVar2);
  if ((int)uVar14 == 0) {
    return uVar14;
  }
  iVar11 = (uint)bVar2 + (uint)bVar1 * 10 + -0x210;
  if (0x3b < iVar11) {
    return 0;
  }
  iVar12 = func_0x0028554c(&pbStack_80,&iStack_64);
  if (iVar12 == 0) {
    return 0;
  }
  if (0x3b < iStack_64) {
    return 0;
  }
  if (lStack_78 == 0) {
    return 0;
  }
  pbVar17 = pbStack_80 + 1;
  bVar1 = *pbStack_80;
  lStack_78 = lStack_78 + -1;
  pbStack_80 = pbVar17;
  if (bVar1 == 0x2b) {
    iVar12 = 1;
  }
  else {
    iVar12 = 0;
    if (bVar1 == 0x5a) goto code_r0x00285484;
    if (bVar1 != 0x2d) {
      return 0;
    }
    iVar12 = -1;
  }
  if (iVar13 == 0) {
    return 0;
  }
  iVar13 = func_0x0028554c(&pbStack_80,&iStack_84);
  if (iVar13 == 0) {
    return 0;
  }
  if (0x17 < iStack_84) {
    return 0;
  }
  iVar13 = func_0x0028554c(&pbStack_80,&iStack_88);
  if (iVar13 == 0) {
    return 0;
  }
  if (0x3b < iStack_88) {
    return 0;
  }
  iVar12 = (iStack_84 * 0xe10 + iStack_88 * 0x3c) * iVar12;
code_r0x00285484:
  if (lStack_78 != 0) {
    return 0;
  }
  if (piVar15 != (int *)0x0) {
    piVar15[4] = iVar9 + -0x211;
    piVar15[5] = iVar8 + -0x97c;
    piVar15[2] = iVar10;
    piVar15[3] = uVar6;
    *piVar15 = iStack_64;
    piVar15[1] = iVar11;
    if ((iVar12 != 0) && (uVar14 = func_0x0027e010(piVar15,0,(long)iVar12), (int)uVar14 == 0)) {
      return uVar14;
    }
  }
  return 1;
}

