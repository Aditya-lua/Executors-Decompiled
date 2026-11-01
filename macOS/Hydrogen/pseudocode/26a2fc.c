
void FUN_0026a2fc(void)

{
  long lVar1;
  long lVar2;
  ulong uVar3;
  ulong uVar4;
  ulong uVar5;
  uint uVar6;
  uint uVar7;
  code *pcVar8;
  bool bVar9;
  int iVar10;
  long *plVar11;
  undefined *puVar12;
  undefined8 *puVar13;
  undefined8 *extraout_x8;
  undefined8 *puVar14;
  undefined8 *puVar15;
  undefined *puVar16;
  undefined8 *puVar17;
  undefined8 *unaff_x19;
  undefined8 *unaff_x20;
  undefined8 *puVar18;
  long unaff_x21;
  long unaff_x22;
  undefined8 *puVar19;
  undefined8 *unaff_x25;
  undefined8 *unaff_x26;
  long lVar20;
  long unaff_x28;
  long unaff_x29;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  undefined8 uVar25;
  undefined8 uVar26;
  undefined8 uVar27;
  undefined8 uVar28;
  undefined8 uVar29;
  undefined1 auVar30 [16];
  long in_stack_00000008;
  undefined8 *in_stack_00000010;
  undefined8 in_stack_00000018;
  long in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 *in_stack_00000030;
  undefined8 *in_stack_00000038;
  
  do {
    unaff_x22 = unaff_x22 + -0x50;
    puVar13 = (undefined8 *)(unaff_x22 + (long)unaff_x26 * unaff_x28);
    uVar21 = unaff_x20[4];
    uVar23 = unaff_x20[7];
    uVar22 = unaff_x20[6];
    puVar13[5] = unaff_x20[5];
    puVar13[4] = uVar21;
    puVar13[7] = uVar23;
    puVar13[6] = uVar22;
    uVar21 = unaff_x20[8];
    puVar13[9] = unaff_x20[9];
    puVar13[8] = uVar21;
    puVar18 = unaff_x20 + 10;
    uVar23 = *unaff_x20;
    uVar22 = unaff_x20[3];
    uVar21 = unaff_x20[2];
    puVar13[1] = unaff_x20[1];
    *puVar13 = uVar23;
    puVar13[3] = uVar22;
    puVar13[2] = uVar21;
    puVar13 = (undefined8 *)((long)in_stack_00000038 + (long)unaff_x25 * unaff_x28);
    puVar15 = puVar18;
    puVar14 = unaff_x25;
    puVar19 = unaff_x25;
    if (puVar18 < puVar13) goto LAB_0026a2a0;
    while( true ) {
      puVar19 = unaff_x26;
      bVar9 = unaff_x25 != puVar14;
      unaff_x20 = puVar18;
      unaff_x25 = puVar14;
      unaff_x26 = puVar19;
      if (bVar9) break;
      _memcpy(in_stack_00000038);
      lVar20 = (long)puVar14 - (long)puVar19;
      if (lVar20 != 0) {
        puVar18 = (undefined8 *)((long)in_stack_00000038 + (long)puVar19 * unaff_x28);
        puVar15 = (undefined8 *)(in_stack_00000008 + (long)puVar14 * unaff_x28);
        do {
          uVar21 = puVar15[4];
          uVar23 = puVar15[7];
          uVar22 = puVar15[6];
          puVar18[5] = puVar15[5];
          puVar18[4] = uVar21;
          puVar18[7] = uVar23;
          puVar18[6] = uVar22;
          uVar21 = puVar15[8];
          puVar18[9] = puVar15[9];
          puVar18[8] = uVar21;
          uVar23 = *puVar15;
          uVar22 = puVar15[3];
          uVar21 = puVar15[2];
          puVar18[1] = puVar15[1];
          *puVar18 = uVar23;
          puVar18[3] = uVar22;
          puVar18[2] = uVar21;
          lVar20 = lVar20 + -1;
          puVar18 = puVar18 + 10;
          puVar15 = puVar15 + -10;
        } while (lVar20 != 0);
      }
      if (puVar19 == (undefined8 *)0x0) goto code_r0x0026a3c4;
      if (puVar14 < puVar19) {
        *(undefined **)(unaff_x29 + -0x88) = &UNK_009cbb60;
        *(undefined8 *)(unaff_x29 + -0x80) = 1;
        *(undefined8 *)(unaff_x29 + -0x70) = 0;
        *(undefined8 *)(unaff_x29 + -0x68) = 0;
        *(undefined8 *)(unaff_x29 + -0x78) = 8;
        func_0x007a2420(unaff_x29 + -0x88,&UNK_009cbb70);
code_r0x0026a584:
        puVar12 = &UNK_009cbb88;
        auVar30 = func_0x007a28a4(puVar13,puVar14);
        plVar11 = auVar30._0_8_;
        uVar5 = plVar11[2];
        if (uVar5 < (ulong)plVar11[1]) {
          uVar3 = uVar5 + 1;
          plVar11[2] = uVar3;
          uVar6 = *(byte *)(*plVar11 + uVar5) - 0x30;
          if ((uVar6 < 10) && (uVar3 < (ulong)plVar11[1])) {
            plVar11[2] = uVar5 + 2;
            uVar7 = *(byte *)(*plVar11 + uVar3) - 0x30;
            if ((uVar7 < 10) &&
               (puVar16 = (undefined *)((ulong)(uVar7 + uVar6 * 10) & 0xff),
               auVar30._8_8_ <= puVar16 && puVar16 <= puVar12)) {
              extraout_x8[1] = puVar16;
              *extraout_x8 = 0x800000000000002c;
              return;
            }
          }
        }
        *extraout_x8 = 0x8000000000000001;
        return;
      }
      func_0x0026a198((undefined8 *)((long)in_stack_00000038 + (long)puVar19 * unaff_x28));
      if (puVar19 < (undefined8 *)((long)&segment_command_00000020.cmd + 1)) {
code_r0x0026a1d8:
        func_0x002696dc(in_stack_00000038,puVar19);
        return;
      }
      while( true ) {
        if (in_stack_00000028._4_4_ == 0) {
          func_0x0026a948(in_stack_00000038,puVar19);
          return;
        }
        in_stack_00000028._4_4_ = in_stack_00000028._4_4_ + -1;
        unaff_x25 = (undefined8 *)func_0x0026d988(in_stack_00000038,puVar19,in_stack_00000018);
        unaff_x19 = (undefined8 *)((long)in_stack_00000038 + (long)unaff_x25 * unaff_x28);
        in_stack_00000030 = unaff_x25;
        puVar14 = puVar19;
        if (in_stack_00000020 == 0) break;
        uVar3 = *(ulong *)(in_stack_00000020 + 0x10);
        uVar4 = unaff_x19[2];
        uVar5 = uVar3;
        if (uVar4 <= uVar3) {
          uVar5 = uVar4;
        }
        iVar10 = _memcmp(*(undefined8 *)(in_stack_00000020 + 8),unaff_x19[1],uVar5);
        lVar20 = uVar3 - uVar4;
        if (iVar10 != 0) {
          lVar20 = (long)iVar10;
        }
        if (lVar20 < 0) break;
code_r0x0026a3c4:
        if (in_stack_00000010 < puVar14) goto code_r0x0026a554;
        puVar13 = (undefined8 *)0x0;
        lVar20 = unaff_x21 + (long)puVar14 * unaff_x28;
        puVar18 = (undefined8 *)((long)in_stack_00000038 + (long)in_stack_00000030 * unaff_x28);
        puVar19 = in_stack_00000038;
        if (puVar18 <= in_stack_00000038) goto code_r0x0026a448;
code_r0x0026a3ec:
        do {
          uVar3 = puVar19[2];
          uVar4 = unaff_x19[2];
          uVar5 = uVar4;
          if (uVar3 <= uVar4) {
            uVar5 = uVar3;
          }
          iVar10 = _memcmp(unaff_x19[1],puVar19[1],uVar5);
          lVar1 = uVar4 - uVar3;
          if (iVar10 != 0) {
            lVar1 = (long)iVar10;
          }
          lVar20 = lVar20 + -0x50;
          lVar2 = unaff_x21;
          if (lVar1 < 0) {
            lVar2 = lVar20;
          }
          puVar15 = (undefined8 *)(lVar2 + (long)puVar13 * unaff_x28);
          uVar22 = puVar19[5];
          uVar21 = puVar19[4];
          uVar24 = puVar19[7];
          uVar23 = puVar19[6];
          uVar26 = puVar19[9];
          uVar25 = puVar19[8];
          puVar17 = puVar19 + 10;
          uVar27 = *puVar19;
          uVar29 = puVar19[3];
          uVar28 = puVar19[2];
          puVar15[1] = puVar19[1];
          *puVar15 = uVar27;
          puVar15[3] = uVar29;
          puVar15[2] = uVar28;
          puVar15[7] = uVar24;
          puVar15[6] = uVar23;
          puVar15[9] = uVar26;
          puVar15[8] = uVar25;
          puVar15[5] = uVar22;
          puVar15[4] = uVar21;
          puVar13 = (undefined8 *)((long)puVar13 + (ulong)((uint)((ulong)lVar1 >> 0x3f) ^ 1));
          puVar19 = puVar17;
        } while (puVar17 < puVar18);
code_r0x0026a448:
        while (in_stack_00000030 != puVar14) {
          lVar20 = lVar20 + -0x50;
          puVar18 = (undefined8 *)(unaff_x21 + (long)puVar13 * unaff_x28);
          uVar22 = puVar19[1];
          uVar21 = *puVar19;
          uVar24 = puVar19[3];
          uVar23 = puVar19[2];
          uVar25 = puVar19[8];
          puVar18[9] = puVar19[9];
          puVar18[8] = uVar25;
          uVar25 = puVar19[4];
          uVar27 = puVar19[7];
          uVar26 = puVar19[6];
          puVar18[5] = puVar19[5];
          puVar18[4] = uVar25;
          puVar18[7] = uVar27;
          puVar18[6] = uVar26;
          puVar18[1] = uVar22;
          *puVar18 = uVar21;
          puVar18[3] = uVar24;
          puVar18[2] = uVar23;
          puVar13 = (undefined8 *)((long)puVar13 + 1);
          puVar19 = puVar19 + 10;
          puVar18 = (undefined8 *)((long)in_stack_00000038 + (long)puVar14 * unaff_x28);
          in_stack_00000030 = puVar14;
          if (puVar19 < puVar18) goto code_r0x0026a3ec;
        }
        _memcpy(in_stack_00000038);
        puVar19 = (undefined8 *)((long)puVar14 - (long)puVar13);
        if (puVar19 == (undefined8 *)0x0) {
          in_stack_00000038 = in_stack_00000038 + (long)puVar14 * 10;
          goto code_r0x0026a1d8;
        }
        in_stack_00000038 = (undefined8 *)((long)in_stack_00000038 + (long)puVar13 * unaff_x28);
        puVar15 = (undefined8 *)(in_stack_00000008 + (long)puVar14 * unaff_x28);
        puVar18 = puVar19;
        puVar17 = in_stack_00000038;
        do {
          uVar21 = puVar15[4];
          uVar23 = puVar15[7];
          uVar22 = puVar15[6];
          puVar17[5] = puVar15[5];
          puVar17[4] = uVar21;
          puVar17[7] = uVar23;
          puVar17[6] = uVar22;
          uVar21 = puVar15[8];
          puVar17[9] = puVar15[9];
          puVar17[8] = uVar21;
          uVar23 = *puVar15;
          uVar22 = puVar15[3];
          uVar21 = puVar15[2];
          puVar17[1] = puVar15[1];
          *puVar17 = uVar23;
          puVar17[3] = uVar22;
          puVar17[2] = uVar21;
          puVar18 = (undefined8 *)((long)puVar18 - 1);
          puVar15 = puVar15 + -10;
          puVar17 = puVar17 + 10;
        } while (puVar18 != (undefined8 *)0x0);
        if (puVar14 < puVar13) goto code_r0x0026a584;
        in_stack_00000020 = 0;
        if (puVar19 < (undefined8 *)((long)&segment_command_00000020.cmd + 1))
        goto code_r0x0026a1d8;
      }
      if (in_stack_00000010 < puVar19) {
code_r0x0026a554:
                    /* WARNING: Does not return */
        pcVar8 = (code *)SoftwareBreakpoint(1,0x26a558);
        (*pcVar8)();
      }
      unaff_x26 = (undefined8 *)0x0;
      unaff_x22 = unaff_x21 + (long)puVar19 * unaff_x28;
      puVar13 = (undefined8 *)((long)in_stack_00000038 + (long)unaff_x25 * unaff_x28);
      puVar18 = in_stack_00000038;
      puVar15 = in_stack_00000038;
      if (in_stack_00000038 < puVar13) {
LAB_0026a2a0:
        do {
          uVar3 = puVar15[2];
          uVar4 = unaff_x19[2];
          uVar5 = uVar3;
          if (uVar4 <= uVar3) {
            uVar5 = uVar4;
          }
          iVar10 = _memcmp(puVar15[1],unaff_x19[1],uVar5);
          lVar20 = uVar3 - uVar4;
          if (iVar10 != 0) {
            lVar20 = (long)iVar10;
          }
          unaff_x22 = unaff_x22 + -0x50;
          lVar1 = unaff_x21;
          if (-1 < lVar20) {
            lVar1 = unaff_x22;
          }
          puVar14 = (undefined8 *)(lVar1 + (long)unaff_x26 * unaff_x28);
          uVar22 = puVar15[5];
          uVar21 = puVar15[4];
          uVar24 = puVar15[7];
          uVar23 = puVar15[6];
          uVar26 = puVar15[9];
          uVar25 = puVar15[8];
          puVar18 = puVar15 + 10;
          uVar27 = *puVar15;
          uVar29 = puVar15[3];
          uVar28 = puVar15[2];
          puVar14[1] = puVar15[1];
          *puVar14 = uVar27;
          puVar14[3] = uVar29;
          puVar14[2] = uVar28;
          puVar14[7] = uVar24;
          puVar14[6] = uVar23;
          puVar14[9] = uVar26;
          puVar14[8] = uVar25;
          puVar14[5] = uVar22;
          puVar14[4] = uVar21;
          unaff_x26 = (undefined8 *)((long)unaff_x26 - (lVar20 >> 0x3f));
          puVar15 = puVar18;
          puVar14 = puVar19;
        } while (puVar18 < puVar13);
      }
    }
  } while( true );
}

