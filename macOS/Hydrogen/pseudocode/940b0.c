
void FUN_000940b0(void)

{
  uint uVar1;
  bool in_ZR;
  ulong *puVar2;
  ulong *puVar3;
  ulong uVar4;
  ulong uVar5;
  ulong uVar6;
  ulong *puVar7;
  long lVar8;
  long lVar9;
  ulong uVar10;
  ulong uVar11;
  long *plVar12;
  ulong uVar13;
  ulong uVar14;
  ulong uVar15;
  long unaff_x19;
  long unaff_x20;
  ulong uVar16;
  undefined8 unaff_x24;
  long unaff_x26;
  ulong uVar17;
  ulong uVar18;
  ulong uVar19;
  ulong uVar20;
  ulong uVar21;
  ulong uVar22;
  long in_stack_00000028;
  
  if (!in_ZR) {
    unaff_x24 = 0xffffffffffffffff;
  }
  puVar2 = (ulong *)__Znam(unaff_x24);
  lVar9 = *(ulong *)(unaff_x26 + 0x2d8) << 3;
  if (*(ulong *)(unaff_x26 + 0x2d8) >> 0x3d != 0) {
    lVar9 = -1;
  }
  puVar3 = (ulong *)__Znam(lVar9);
  _memcpy();
  if (unaff_x20 != 0) {
    lVar9 = 0;
    uVar1 = *(uint *)(unaff_x26 + 0x2c0);
    uVar17 = *(ulong *)(unaff_x26 + 0x2d0);
    uVar10 = uVar17 & 0xfffffffffffffff8;
    uVar16 = *(ulong *)(unaff_x26 + 0x2d8);
    do {
      _memcpy(puVar3,*(undefined8 *)(in_stack_00000028 + lVar9 * 8),(ulong)uVar1 << 3);
      if (0x10 < uVar16) {
        puVar7 = puVar3 + 0x10;
        lVar8 = uVar16 - 0x10;
        uVar11 = *puVar3;
        do {
          uVar13 = puVar7[-0xf];
          uVar14 = puVar7[-2];
          *puVar7 = puVar7[-7] + uVar11 +
                    ((uVar13 >> 1 | uVar13 << 0x3f) ^ (uVar13 >> 8 | uVar13 << 0x38) ^ uVar13 >> 7)
                    + ((uVar14 >> 0x13 | uVar14 << 0x2d) ^ (uVar14 >> 0x3d | uVar14 << 3) ^
                      uVar14 >> 6);
          lVar8 = lVar8 + -1;
          puVar7 = puVar7 + 1;
          uVar11 = uVar13;
        } while (lVar8 != 0);
      }
      _memcpy(puVar2);
      if (uVar16 != 0) {
        uVar11 = puVar2[4];
        uVar13 = *puVar2;
        uVar18 = puVar2[1];
        uVar19 = puVar2[6];
        uVar20 = puVar2[5];
        uVar21 = puVar2[2];
        uVar22 = puVar2[7];
        plVar12 = (long *)(unaff_x26 + 0x40);
        puVar7 = puVar3;
        uVar14 = uVar16;
        uVar15 = puVar2[3];
        do {
          uVar6 = uVar21;
          uVar5 = uVar20;
          uVar4 = uVar19;
          uVar21 = uVar18;
          uVar18 = uVar13;
          uVar20 = uVar11;
          lVar8 = (uVar5 & uVar20) + uVar22 + (uVar4 & (uVar20 ^ 0xffffffffffffffff)) + *plVar12 +
                  *puVar7 + ((uVar20 >> 0xe | uVar20 << 0x32) ^ (uVar20 >> 0x12 | uVar20 << 0x2e) ^
                            (uVar20 >> 0x29 | uVar20 << 0x17));
          uVar11 = uVar15 + lVar8;
          uVar13 = ((uVar18 >> 0x1c | uVar18 << 0x24) ^ (uVar18 >> 0x22 | uVar18 << 0x1e) ^
                   (uVar18 >> 0x27 | uVar18 << 0x19)) + ((uVar6 ^ uVar21) & uVar18 ^ uVar6 & uVar21)
                   + lVar8;
          uVar14 = uVar14 - 1;
          uVar19 = uVar5;
          uVar22 = uVar4;
          plVar12 = plVar12 + 1;
          puVar7 = puVar7 + 1;
          uVar15 = uVar6;
        } while (uVar14 != 0);
        puVar2[4] = uVar11;
        puVar2[5] = uVar20;
        puVar2[6] = uVar5;
        puVar2[7] = uVar4;
        *puVar2 = uVar13;
        puVar2[1] = uVar18;
        puVar2[2] = uVar21;
        puVar2[3] = uVar6;
      }
      if (uVar17 != 0) {
        if (uVar17 < 8) {
          uVar11 = 0;
        }
        else {
          puVar7 = puVar2 + 4;
          plVar12 = (long *)(unaff_x19 + 0x20);
          uVar11 = uVar10;
          do {
            uVar13 = puVar7[-4];
            uVar18 = puVar7[-1];
            uVar14 = puVar7[-2];
            uVar20 = puVar7[1];
            uVar19 = *puVar7;
            uVar22 = puVar7[3];
            uVar21 = puVar7[2];
            plVar12[-3] = plVar12[-3] + puVar7[-3];
            plVar12[-4] = plVar12[-4] + uVar13;
            plVar12[-1] = plVar12[-1] + uVar18;
            plVar12[-2] = plVar12[-2] + uVar14;
            plVar12[1] = plVar12[1] + uVar20;
            *plVar12 = *plVar12 + uVar19;
            plVar12[3] = plVar12[3] + uVar22;
            plVar12[2] = plVar12[2] + uVar21;
            uVar11 = uVar11 - 8;
            puVar7 = puVar7 + 8;
            plVar12 = plVar12 + 8;
          } while (uVar11 != 0);
          uVar11 = uVar10;
          if (uVar17 == uVar10) goto code_r0x00094130;
        }
        lVar8 = uVar17 - uVar11;
        plVar12 = (long *)(unaff_x19 + uVar11 * 8);
        puVar7 = puVar2 + uVar11;
        do {
          *plVar12 = *plVar12 + *puVar7;
          lVar8 = lVar8 + -1;
          plVar12 = plVar12 + 1;
          puVar7 = puVar7 + 1;
        } while (lVar8 != 0);
      }
code_r0x00094130:
      lVar9 = lVar9 + 1;
    } while (lVar9 != unaff_x20);
  }
  __ZdaPv(puVar2);
                    /* WARNING: Could not recover jumptable at 0x007b2f5c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR___ZdaPv_009b01b0)(puVar3);
  return;
}

