
/* WARNING: Removing unreachable block (ram,0x005942d4) */

ulong FUN_005944b8(void)

{
  long lVar1;
  code *pcVar2;
  ulong uVar3;
  ulong *puVar4;
  long *plVar5;
  long lVar6;
  ulong *puVar7;
  ulong uVar8;
  ulong uVar9;
  ulong *puVar10;
  ulong uVar11;
  ulong *puVar12;
  ulong uVar13;
  ulong unaff_x20;
  long unaff_x21;
  ulong *unaff_x22;
  int unaff_w23;
  ulong unaff_x24;
  ulong unaff_x25;
  long unaff_x28;
  ulong uVar14;
  ulong uVar15;
  ulong uVar16;
  ulong uVar17;
  long in_stack_00000000;
  undefined8 uStack0000000000000060;
  undefined8 in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000078;
  undefined8 in_stack_00000080;
  
code_r0x005944b8:
  _memcpy(unaff_x22);
  uVar3 = unaff_x24 - unaff_x25;
  if (uVar3 == 0) {
    unaff_x22 = unaff_x22 + unaff_x24 * 9;
code_r0x005941f0:
    uVar3 = func_0x00576600(unaff_x22,uVar3);
  }
  else {
    unaff_x22 = (ulong *)((long)unaff_x22 + unaff_x25 * unaff_x28);
    puVar7 = (ulong *)(in_stack_00000000 + unaff_x24 * unaff_x28);
    uVar8 = uVar3;
    puVar4 = unaff_x22;
    do {
      uVar9 = puVar7[4];
      uVar13 = puVar7[7];
      uVar11 = puVar7[6];
      puVar4[5] = puVar7[5];
      puVar4[4] = uVar9;
      puVar4[7] = uVar13;
      puVar4[6] = uVar11;
      puVar4[8] = puVar7[8];
      uVar13 = *puVar7;
      uVar11 = puVar7[3];
      uVar9 = puVar7[2];
      puVar4[1] = puVar7[1];
      *puVar4 = uVar13;
      puVar4[3] = uVar11;
      puVar4[2] = uVar9;
      puVar4 = puVar4 + 9;
      puVar7 = puVar7 + -9;
      uVar8 = uVar8 - 1;
    } while (uVar8 != 0);
    if (unaff_x24 < unaff_x25) {
code_r0x005945a0:
      plVar5 = (long *)func_0x007a28a4(unaff_x25,unaff_x24,&UNK_009f1408);
      return (ulong)(plVar5[1] - *plVar5) >> 3;
    }
    unaff_x25 = 0;
    if (uVar3 < 0x21) goto code_r0x005941f0;
    unaff_x24 = uVar3;
    while (unaff_w23 != 0) {
      if (unaff_x24 < 0x40) {
        uVar8 = *unaff_x22;
        uVar3 = unaff_x22[(unaff_x24 >> 3) * 0x24];
        uVar9 = unaff_x22[(unaff_x24 >> 3) * 0x3f];
        puVar4 = unaff_x22;
        if ((uVar8 < uVar3 == uVar8 < uVar9) &&
           (puVar4 = unaff_x22 + (unaff_x24 >> 3) * 0x3f, uVar8 < uVar3 == uVar3 < uVar9)) {
          puVar4 = unaff_x22 + (unaff_x24 >> 3) * 0x24;
        }
      }
      else {
        puVar4 = (ulong *)func_0x00593b34(unaff_x22);
      }
      unaff_w23 = unaff_w23 + -1;
      uVar8 = ((ulong)((long)puVar4 - (long)unaff_x22) >> 3) * -0x71c71c71c71c71c7;
      if (unaff_x20 < unaff_x24) {
code_r0x00594570:
                    /* WARNING: Does not return */
        pcVar2 = (code *)SoftwareBreakpoint(1,0x594574);
        (*pcVar2)();
      }
      uVar3 = 0;
      lVar6 = unaff_x21 + unaff_x24 * unaff_x28;
      puVar10 = (ulong *)((long)unaff_x22 + uVar8 * unaff_x28);
      puVar7 = unaff_x22;
      uVar9 = uVar8;
      if (puVar10 <= unaff_x22) goto code_r0x00594348;
code_r0x00594308:
      do {
        uVar11 = *puVar7;
        uVar13 = *puVar4;
        lVar6 = lVar6 + -0x48;
        lVar1 = unaff_x21;
        if (uVar13 <= uVar11) {
          lVar1 = lVar6;
        }
        puVar12 = (ulong *)(lVar1 + uVar3 * unaff_x28);
        uVar15 = puVar7[5];
        uVar14 = puVar7[4];
        uVar17 = puVar7[7];
        uVar16 = puVar7[6];
        puVar12[8] = puVar7[8];
        puVar12[5] = uVar15;
        puVar12[4] = uVar14;
        puVar12[7] = uVar17;
        puVar12[6] = uVar16;
        uVar16 = *puVar7;
        uVar15 = puVar7[3];
        uVar14 = puVar7[2];
        puVar12[1] = puVar7[1];
        *puVar12 = uVar16;
        puVar12[3] = uVar15;
        puVar12[2] = uVar14;
        if (uVar13 > uVar11) {
          uVar3 = uVar3 + 1;
        }
        puVar7 = puVar7 + 9;
      } while (puVar7 < puVar10);
code_r0x00594348:
      if (uVar9 != unaff_x24) goto code_r0x00594350;
      _memcpy(unaff_x22);
      lVar6 = unaff_x24 - uVar3;
      if (lVar6 != 0) {
        puVar7 = (ulong *)((long)unaff_x22 + uVar3 * unaff_x28);
        puVar10 = (ulong *)(in_stack_00000000 + unaff_x24 * unaff_x28);
        do {
          uVar9 = puVar10[4];
          uVar13 = puVar10[7];
          uVar11 = puVar10[6];
          puVar7[5] = puVar10[5];
          puVar7[4] = uVar9;
          puVar7[7] = uVar13;
          puVar7[6] = uVar11;
          puVar7[8] = puVar10[8];
          uVar13 = *puVar10;
          uVar11 = puVar10[3];
          uVar9 = puVar10[2];
          puVar7[1] = puVar10[1];
          *puVar7 = uVar13;
          puVar7[3] = uVar11;
          puVar7[2] = uVar9;
          puVar7 = puVar7 + 9;
          puVar10 = puVar10 + -9;
          lVar6 = lVar6 + -1;
        } while (lVar6 != 0);
      }
      if (uVar3 == 0) {
        if (unaff_x20 < unaff_x24) goto code_r0x00594570;
        unaff_x25 = 0;
        lVar6 = unaff_x21 + unaff_x24 * unaff_x28;
        puVar10 = (ulong *)((long)unaff_x22 + uVar8 * unaff_x28);
        puVar7 = unaff_x22;
        if (puVar10 <= unaff_x22) goto code_r0x00594474;
        do {
          do {
            uVar3 = *puVar4;
            uVar9 = *puVar7;
            lVar6 = lVar6 + -0x48;
            lVar1 = unaff_x21;
            if (uVar3 < uVar9) {
              lVar1 = lVar6;
            }
            puVar12 = (ulong *)(lVar1 + unaff_x25 * unaff_x28);
            uVar13 = puVar7[5];
            uVar11 = puVar7[4];
            uVar15 = puVar7[7];
            uVar14 = puVar7[6];
            puVar12[8] = puVar7[8];
            puVar12[5] = uVar13;
            puVar12[4] = uVar11;
            puVar12[7] = uVar15;
            puVar12[6] = uVar14;
            uVar14 = *puVar7;
            uVar13 = puVar7[3];
            uVar11 = puVar7[2];
            puVar12[1] = puVar7[1];
            *puVar12 = uVar14;
            puVar12[3] = uVar13;
            puVar12[2] = uVar11;
            if (uVar3 >= uVar9) {
              unaff_x25 = unaff_x25 + 1;
            }
            puVar7 = puVar7 + 9;
          } while (puVar7 < puVar10);
code_r0x00594474:
          do {
            if (uVar8 == unaff_x24) goto code_r0x005944b8;
            lVar6 = lVar6 + -0x48;
            puVar10 = (ulong *)(unaff_x21 + unaff_x25 * unaff_x28);
            uVar8 = puVar7[1];
            uVar3 = *puVar7;
            uVar11 = puVar7[3];
            uVar9 = puVar7[2];
            uVar14 = puVar7[5];
            uVar13 = puVar7[4];
            uVar16 = puVar7[7];
            uVar15 = puVar7[6];
            puVar10[8] = puVar7[8];
            puVar10[5] = uVar14;
            puVar10[4] = uVar13;
            puVar10[7] = uVar16;
            puVar10[6] = uVar15;
            puVar10[1] = uVar8;
            *puVar10 = uVar3;
            puVar10[3] = uVar11;
            puVar10[2] = uVar9;
            unaff_x25 = unaff_x25 + 1;
            puVar7 = puVar7 + 9;
            puVar10 = (ulong *)((long)unaff_x22 + unaff_x24 * unaff_x28);
            uVar8 = unaff_x24;
          } while (puVar10 <= puVar7);
        } while( true );
      }
      if (unaff_x24 < uVar3) {
        uStack0000000000000060 = &UNK_009f13e0;
        in_stack_00000068 = 1;
        in_stack_00000078 = 0;
        in_stack_00000080 = 0;
        in_stack_00000070 = 8;
        func_0x007a2420(&uStack0000000000000060,&UNK_009f13f0);
        goto code_r0x005945a0;
      }
      func_0x005941b4((ulong *)((long)unaff_x22 + uVar3 * unaff_x28));
      unaff_x24 = uVar3;
      if (uVar3 < 0x21) goto code_r0x005941f0;
    }
    uVar3 = func_0x00593c08(unaff_x22,unaff_x24);
  }
  return uVar3;
code_r0x00594350:
  lVar6 = lVar6 + -0x48;
  puVar10 = (ulong *)(lVar6 + uVar3 * unaff_x28);
  uVar9 = puVar7[4];
  uVar13 = puVar7[7];
  uVar11 = puVar7[6];
  puVar10[5] = puVar7[5];
  puVar10[4] = uVar9;
  puVar10[7] = uVar13;
  puVar10[6] = uVar11;
  puVar10[8] = puVar7[8];
  uVar13 = *puVar7;
  uVar11 = puVar7[3];
  uVar9 = puVar7[2];
  puVar10[1] = puVar7[1];
  *puVar10 = uVar13;
  puVar10[3] = uVar11;
  puVar10[2] = uVar9;
  puVar7 = puVar7 + 9;
  puVar10 = (ulong *)((long)unaff_x22 + unaff_x24 * unaff_x28);
  uVar9 = unaff_x24;
  if (puVar7 < puVar10) goto code_r0x00594308;
  goto code_r0x00594348;
}

