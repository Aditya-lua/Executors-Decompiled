
/* WARNING: Possible PIC construction at 0x002cc414: Changing call to branch */
/* WARNING: Possible PIC construction at 0x002a37cc: Changing call to branch */
/* WARNING: Possible PIC construction at 0x002a3880: Changing call to branch */
/* WARNING: Possible PIC construction at 0x002a3ef8: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x002a3884) */
/* WARNING: Removing unreachable block (ram,0x002a3888) */
/* WARNING: Removing unreachable block (ram,0x002a3898) */
/* WARNING: Removing unreachable block (ram,0x002a37d0) */
/* WARNING: Removing unreachable block (ram,0x002a37dc) */
/* WARNING: Removing unreachable block (ram,0x002a3808) */
/* WARNING: Removing unreachable block (ram,0x002cc418) */
/* WARNING: Removing unreachable block (ram,0x002cc448) */
/* WARNING: Removing unreachable block (ram,0x002a3efc) */
/* WARNING: Removing unreachable block (ram,0x002a3740) */
/* WARNING: Type propagation algorithm not settling */

ulong FUN_002cc394(char *param_1,char *param_2,undefined1 *param_3,char *param_4,char *param_5)

{
  ulong uVar1;
  ulong uVar2;
  uint uVar3;
  bool bVar4;
  undefined1 auVar5 [16];
  segment_command *psVar6;
  char *pcVar7;
  bool in_CY;
  bool bVar8;
  int iVar9;
  int iVar10;
  long lVar11;
  char *pcVar12;
  char *pcVar13;
  char *pcVar14;
  char *pcVar15;
  char *pcVar16;
  char *pcVar17;
  ulong uVar18;
  uint uVar19;
  uint uVar20;
  uint uVar21;
  ulong uVar22;
  undefined1 *puVar23;
  undefined1 *puVar24;
  char *pcVar25;
  char *unaff_x19;
  char *unaff_x20;
  char *pcVar26;
  char *unaff_x21;
  char *pcVar27;
  char *unaff_x22;
  ulong uVar28;
  char *unaff_x23;
  ulong uVar29;
  char *pcVar30;
  undefined1 *unaff_x27;
  char *unaff_x28;
  undefined8 *******unaff_x29;
  undefined *puVar31;
  undefined1 auVar32 [16];
  undefined1 auVar33 [16];
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000058;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000078;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000088;
  char acStack_730 [152];
  long lStack_698;
  char *pcStack_690;
  char *pcStack_688;
  char *pcStack_680;
  char *pcStack_678;
  undefined8 *******pppppppuStack_670;
  undefined *puStack_668;
  undefined1 auStack_660 [8];
  long lStack_658;
  char *pcStack_650;
  long lStack_648;
  char *pcStack_640;
  undefined1 *puStack_638;
  char *pcStack_630;
  char *pcStack_628;
  char *pcStack_620;
  uint uStack_614;
  char acStack_610 [1152];
  char acStack_190 [144];
  undefined8 auStack_100 [18];
  long lStack_70;
  undefined8 ******ppppppuStack_68;
  
  auVar32._8_8_ = param_2;
  auVar32._0_8_ = param_2;
  if (!in_CY) {
_aws_lc_0_24_0_bn_mod_exp_mont_small:
    _abort();
    auVar33 = ___stack_chk_fail();
    pcVar26 = auVar33._8_8_;
    auVar32._8_8_ = pcVar26;
    auVar32._0_8_ = pcVar26;
    auVar5._8_8_ = pcVar26;
    auVar5._0_8_ = pcVar26;
    lVar11 = auVar33._0_8_;
    pcVar17 = (char *)(lVar11 + 0x128);
    pcVar16 = (char *)(long)*(int *)(lVar11 + 0x148);
    unaff_x29 = (undefined8 *******)(auStack_100 + 0x1e);
    pcVar7 = auStack_660;
    lStack_70 = *(long *)PTR____stack_chk_guard_009b01e8;
    pcVar12 = pcVar16;
    pcVar13 = unaff_x28;
    if ((((ulong)param_5 >> 0x3a == 0) &&
        (unaff_x19 = pcVar16, pcVar16 <= (undefined1 *)((long)&MACH_HEADER.cpusubtype + 1))) &&
       (unaff_x20 = pcVar17, (undefined1 *)(long)*(int *)(lVar11 + 0x148) == pcVar16)) {
      if ((0 < *(int *)(lVar11 + 0x148)) && ((**(byte **)(lVar11 + 0x140) & 1) != 0)) {
        uVar28 = (long)param_5 * -0x40;
        do {
          pcVar25 = param_5;
          unaff_x21 = pcVar26;
          if (pcVar25 == (char *)0x0) {
            param_5 = (char *)0x0;
            if ((long)pcVar16 < 0) goto code_r0x002a3f90;
            unaff_x22 = (char *)((long)pcVar16 << 1);
            acStack_610[0x78] = '\0';
            acStack_610[0x79] = '\0';
            acStack_610[0x7a] = '\0';
            acStack_610[0x7b] = '\0';
            acStack_610[0x7c] = '\0';
            acStack_610[0x7d] = '\0';
            acStack_610[0x7e] = '\0';
            acStack_610[0x7f] = '\0';
            acStack_610[0x70] = '\0';
            acStack_610[0x71] = '\0';
            acStack_610[0x72] = '\0';
            acStack_610[0x73] = '\0';
            acStack_610[0x74] = '\0';
            acStack_610[0x75] = '\0';
            acStack_610[0x76] = '\0';
            acStack_610[0x77] = '\0';
            acStack_610[0x88] = '\0';
            acStack_610[0x89] = '\0';
            acStack_610[0x8a] = '\0';
            acStack_610[0x8b] = '\0';
            acStack_610[0x8c] = '\0';
            acStack_610[0x8d] = '\0';
            acStack_610[0x8e] = '\0';
            acStack_610[0x8f] = '\0';
            acStack_610[0x80] = '\0';
            acStack_610[0x81] = '\0';
            acStack_610[0x82] = '\0';
            acStack_610[0x83] = '\0';
            acStack_610[0x84] = '\0';
            acStack_610[0x85] = '\0';
            acStack_610[0x86] = '\0';
            acStack_610[0x87] = '\0';
            acStack_610[0x58] = '\0';
            acStack_610[0x59] = '\0';
            acStack_610[0x5a] = '\0';
            acStack_610[0x5b] = '\0';
            acStack_610[0x5c] = '\0';
            acStack_610[0x5d] = '\0';
            acStack_610[0x5e] = '\0';
            acStack_610[0x5f] = '\0';
            acStack_610[0x50] = '\0';
            acStack_610[0x51] = '\0';
            acStack_610[0x52] = '\0';
            acStack_610[0x53] = '\0';
            acStack_610[0x54] = '\0';
            acStack_610[0x55] = '\0';
            acStack_610[0x56] = '\0';
            acStack_610[0x57] = '\0';
            acStack_610[0x68] = '\0';
            acStack_610[0x69] = '\0';
            acStack_610[0x6a] = '\0';
            acStack_610[0x6b] = '\0';
            acStack_610[0x6c] = '\0';
            acStack_610[0x6d] = '\0';
            acStack_610[0x6e] = '\0';
            acStack_610[0x6f] = '\0';
            acStack_610[0x60] = '\0';
            acStack_610[0x61] = '\0';
            acStack_610[0x62] = '\0';
            acStack_610[99] = '\0';
            acStack_610[100] = '\0';
            acStack_610[0x65] = '\0';
            acStack_610[0x66] = '\0';
            acStack_610[0x67] = '\0';
            acStack_610[0x38] = '\0';
            acStack_610[0x39] = '\0';
            acStack_610[0x3a] = '\0';
            acStack_610[0x3b] = '\0';
            acStack_610[0x3c] = '\0';
            acStack_610[0x3d] = '\0';
            acStack_610[0x3e] = '\0';
            acStack_610[0x3f] = '\0';
            acStack_610[0x30] = '\0';
            acStack_610[0x31] = '\0';
            acStack_610[0x32] = '\0';
            acStack_610[0x33] = '\0';
            acStack_610[0x34] = '\0';
            acStack_610[0x35] = '\0';
            acStack_610[0x36] = '\0';
            acStack_610[0x37] = '\0';
            acStack_610[0x48] = '\0';
            acStack_610[0x49] = '\0';
            acStack_610[0x4a] = '\0';
            acStack_610[0x4b] = '\0';
            acStack_610[0x4c] = '\0';
            acStack_610[0x4d] = '\0';
            acStack_610[0x4e] = '\0';
            acStack_610[0x4f] = '\0';
            acStack_610[0x40] = '\0';
            acStack_610[0x41] = '\0';
            acStack_610[0x42] = '\0';
            acStack_610[0x43] = '\0';
            acStack_610[0x44] = '\0';
            acStack_610[0x45] = '\0';
            acStack_610[0x46] = '\0';
            acStack_610[0x47] = '\0';
            acStack_610[0x18] = '\0';
            acStack_610[0x19] = '\0';
            acStack_610[0x1a] = '\0';
            acStack_610[0x1b] = '\0';
            acStack_610[0x1c] = '\0';
            acStack_610[0x1d] = '\0';
            acStack_610[0x1e] = '\0';
            acStack_610[0x1f] = '\0';
            acStack_610[0x10] = '\0';
            acStack_610[0x11] = '\0';
            acStack_610[0x12] = '\0';
            acStack_610[0x13] = '\0';
            acStack_610[0x14] = '\0';
            acStack_610[0x15] = '\0';
            acStack_610[0x16] = '\0';
            acStack_610[0x17] = '\0';
            acStack_610[0x28] = '\0';
            acStack_610[0x29] = '\0';
            acStack_610[0x2a] = '\0';
            acStack_610[0x2b] = '\0';
            acStack_610[0x2c] = '\0';
            acStack_610[0x2d] = '\0';
            acStack_610[0x2e] = '\0';
            acStack_610[0x2f] = '\0';
            acStack_610[0x20] = '\0';
            acStack_610[0x21] = '\0';
            acStack_610[0x22] = '\0';
            acStack_610[0x23] = '\0';
            acStack_610[0x24] = '\0';
            acStack_610[0x25] = '\0';
            acStack_610[0x26] = '\0';
            acStack_610[0x27] = '\0';
            acStack_610[8] = '\0';
            acStack_610[9] = '\0';
            acStack_610[10] = '\0';
            acStack_610[0xb] = '\0';
            acStack_610[0xc] = '\0';
            acStack_610[0xd] = '\0';
            acStack_610[0xe] = '\0';
            acStack_610[0xf] = '\0';
            acStack_610[0] = '\0';
            acStack_610[1] = '\0';
            acStack_610[2] = '\0';
            acStack_610[3] = '\0';
            acStack_610[4] = '\0';
            acStack_610[5] = '\0';
            acStack_610[6] = '\0';
            acStack_610[7] = '\0';
            if (pcVar16 != (char *)0x0) {
              ___memcpy_chk(acStack_610,*(undefined8 *)pcVar17,(long)pcVar16 << 3,0x90);
            }
            pcVar12 = acStack_610;
            param_4 = unaff_x22;
            param_5 = pcVar17;
            iVar10 = func_0x002ab2b0(pcVar26,pcVar16);
            if (iVar10 == 0) goto code_r0x002a3f90;
            lVar11 = (long)pcVar16 << 4;
            goto code_r0x002a3f48;
          }
          param_5 = pcVar25 + -1;
          uVar22 = *(ulong *)(param_4 + (long)(pcVar25 + -1) * 8);
          uVar28 = uVar28 + 0x40;
        } while (uVar22 == 0);
        uVar18 = uVar22 >> 0x20;
        uVar1 = uVar18;
        if (uVar18 == 0) {
          uVar1 = uVar22;
        }
        psVar6 = &segment_command_00000020;
        if (uVar18 == 0) {
          psVar6 = (segment_command *)&MACH_HEADER;
        }
        pcStack_628 = (char *)((long)&psVar6->cmd + 1);
        uVar18 = uVar1 >> 0x10;
        uVar22 = uVar18;
        if (uVar18 == 0) {
          uVar22 = uVar1;
        }
        uVar18 = (ulong)(uVar18 != 0);
        uVar1 = uVar22 >> 8;
        if (uVar22 < 0x100) {
          uVar1 = uVar22;
        }
        uVar29 = (ulong)(0xff < uVar22);
        uVar22 = uVar1 >> 4;
        if (uVar1 < 0x10) {
          uVar22 = uVar1;
        }
        uVar2 = uVar22 >> 2;
        if (uVar22 < 4) {
          uVar2 = uVar22;
        }
        unaff_x27 = (undefined1 *)(ulong)(3 < uVar22);
        pcStack_630 = (char *)(ulong)(1 < uVar2);
        uVar22 = (ulong)pcStack_628 & 0xffffffffffffffe0 | uVar18 << 4 | uVar29 << 3 |
                 (ulong)(0xf < uVar1) << 2 | (ulong)pcStack_628 & 0x1f | (long)unaff_x27 << 1;
        if (1 < uVar2) {
          uVar22 = uVar22 + 1;
        }
        uVar22 = uVar22 - uVar28;
        if (uVar22 < 0x2a0) {
          if (uVar22 < 0xf0) {
            if (uVar22 < 0x50) {
              uStack_614 = 3;
              if (uVar22 < 0x18) {
                uStack_614 = 1;
              }
              if (4 < uStack_614) {
                uStack_614 = 5;
              }
            }
            else {
              uStack_614 = 4;
            }
          }
          else {
            uStack_614 = 5;
          }
        }
        else {
          uStack_614 = 5;
        }
        pcVar27 = param_4;
        pcStack_620 = param_4;
        if (pcVar16 != (char *)0x0) {
          pcVar12 = (char *)((long)pcVar16 << 3);
          pcVar27 = segment_command_00000478.segname;
          ___memcpy_chk(acStack_610,param_3);
        }
        unaff_x22 = pcStack_620;
        pcStack_640 = (char *)((long)pcVar16 << 3);
        unaff_x28 = (char *)((ulong)(0xf < uVar1) * 4);
        puStack_638 = (undefined1 *)(ulong)(uStack_614 - 2);
        param_2 = pcVar16;
        param_1 = pcVar17;
        if (uStack_614 < 2) {
          bVar4 = false;
          pcVar30 = pcStack_630 + ~uVar28 + (long)unaff_x27 * 2 +
                    (long)(pcStack_628 + uVar18 * 0x10 + (long)(unaff_x28 + uVar29 * 8));
          unaff_x28 = (char *)((long)pcVar16 << 1);
          pcStack_628 = (char *)(lVar11 + 0x158);
          pcVar13 = (char *)((long)pcVar16 << 4);
code_r0x002a3850:
          if (bVar4) {
            if ((pcVar25 <= (undefined1 *)((ulong)pcVar30 >> 6)) ||
               ((*(ulong *)(unaff_x22 + (long)((ulong)pcVar30 >> 6) * 8) >> ((ulong)pcVar30 & 0x3f)
                & 1) == 0)) {
              puVar31 = &UNK_002a3884;
              pcVar7 = auStack_660;
              pcVar13 = pcVar26;
              auVar32 = auVar5;
              goto code_r0x002a4078;
            }
          }
          else {
            for (; (pcVar25 <= (undefined1 *)((ulong)pcVar30 >> 6) ||
                   ((*(ulong *)(unaff_x22 + (long)((ulong)pcVar30 >> 6) * 8) >>
                     ((ulong)pcVar30 & 0x3f) & 1) == 0)); pcVar30 = pcVar30 + -1) {
              if (pcVar30 == (char *)0x0) {
                if (bVar4) goto code_r0x002a3f40;
                func_0x0079dd40();
                goto code_r0x002a3f88;
              }
            }
          }
          pcStack_630 = pcVar13;
          if ((uStack_614 < 2) || (pcVar30 == (char *)0x0)) {
            unaff_x27 = (undefined1 *)0x0;
            uVar19 = 1;
            if (!bVar4) {
code_r0x002a3f00:
              if (pcVar16 != (char *)0x0) {
                pcVar12 = pcStack_640;
                _memcpy(pcVar26,acStack_610 + (ulong)(uVar19 >> 1) * 0x48);
              }
              bVar8 = pcVar30 == unaff_x27;
              pcVar30 = pcVar30 + -(ulong)((int)unaff_x27 + 1);
              bVar4 = true;
              pcVar13 = pcStack_630;
              if (bVar8) goto code_r0x002a3f40;
              goto code_r0x002a3850;
            }
code_r0x002a3a0c:
            lStack_648 = CONCAT44(lStack_648._4_4_,uVar19);
            iVar10 = (int)unaff_x27;
            pcVar13 = unaff_x28;
            param_4 = pcVar27;
            if (pcVar16 < (undefined1 *)((long)&MACH_HEADER.magic + 2)) {
              if ((undefined1 *)(long)*(int *)(lVar11 + 0x148) != pcVar16) goto code_r0x002a3f90;
              func_0x002ac3fc(acStack_190,pcVar26,pcVar16,auStack_100);
              pcVar13 = pcStack_630;
              func_0x0036e464(auStack_100,pcStack_630);
              pcVar12 = acStack_190;
              param_5 = pcVar17;
              pcStack_650 = unaff_x28;
              iVar9 = func_0x002ab2b0(pcVar26,pcVar16);
              param_4 = unaff_x28;
              if (iVar9 == 0) goto code_r0x002a3f90;
              func_0x0036e464(acStack_190,pcVar13);
              pcVar14 = pcStack_650;
              pcVar27 = unaff_x28;
              if (iVar10 != 0) {
                param_4 = unaff_x28;
                if ((undefined1 *)(long)*(int *)(lVar11 + 0x148) != pcVar16) goto code_r0x002a3f90;
                func_0x002ac3fc(acStack_190,pcVar26,pcVar16,auStack_100);
                pcVar13 = pcStack_630;
                func_0x0036e464(auStack_100,pcStack_630);
                pcVar12 = acStack_190;
                param_5 = pcVar17;
                iVar9 = func_0x002ab2b0(pcVar26,pcVar16);
                param_4 = pcVar14;
                if (iVar9 == 0) goto code_r0x002a3f90;
                func_0x0036e464(acStack_190,pcVar13);
                pcVar15 = pcStack_650;
                pcVar27 = pcVar14;
                if (iVar10 != 1) {
                  param_4 = pcVar14;
                  if ((undefined1 *)(long)*(int *)(lVar11 + 0x148) != pcVar16)
                  goto code_r0x002a3f90;
                  func_0x002ac3fc(acStack_190,pcVar26,pcVar16,auStack_100);
                  pcVar13 = pcStack_630;
                  func_0x0036e464(auStack_100,pcStack_630);
                  pcVar12 = acStack_190;
                  param_5 = pcVar17;
                  iVar9 = func_0x002ab2b0(pcVar26,pcVar16);
                  param_4 = pcVar15;
                  if (iVar9 == 0) goto code_r0x002a3f90;
                  func_0x0036e464(acStack_190,pcVar13);
                  pcVar14 = pcStack_650;
                  pcVar27 = pcVar15;
                  if (iVar10 != 2) {
                    param_4 = pcVar15;
                    if ((undefined1 *)(long)*(int *)(lVar11 + 0x148) != pcVar16)
                    goto code_r0x002a3f90;
                    func_0x002ac3fc(acStack_190,pcVar26,pcVar16,auStack_100);
                    pcVar13 = pcStack_630;
                    func_0x0036e464(auStack_100,pcStack_630);
                    pcVar12 = acStack_190;
                    param_5 = pcVar17;
                    iVar9 = func_0x002ab2b0(pcVar26,pcVar16);
                    param_4 = pcVar14;
                    if (iVar9 == 0) goto code_r0x002a3f90;
                    func_0x0036e464(acStack_190,pcVar13);
                    pcVar15 = pcStack_650;
                    pcVar27 = pcVar14;
                    if (iVar10 != 3) {
                      param_4 = pcVar14;
                      if ((undefined1 *)(long)*(int *)(lVar11 + 0x148) != pcVar16)
                      goto code_r0x002a3f90;
                      func_0x002ac3fc(acStack_190,pcVar26,pcVar16,auStack_100);
                      pcVar13 = pcStack_630;
                      func_0x0036e464(auStack_100,pcStack_630);
                      pcVar12 = acStack_190;
                      param_5 = pcVar17;
                      iVar9 = func_0x002ab2b0(pcVar26,pcVar16);
                      param_4 = pcVar15;
                      if (iVar9 == 0) goto code_r0x002a3f90;
                      func_0x0036e464(acStack_190,pcVar13);
                      pcVar14 = pcStack_650;
                      pcVar27 = pcVar15;
                      if (iVar10 != 4) {
                        param_4 = pcVar15;
                        if ((undefined1 *)(long)*(int *)(lVar11 + 0x148) != pcVar16)
                        goto code_r0x002a3f90;
                        func_0x002ac3fc(acStack_190,pcVar26,pcVar16,auStack_100);
                        pcVar13 = pcStack_630;
                        func_0x0036e464(auStack_100,pcStack_630);
                        pcVar12 = acStack_190;
                        param_5 = pcVar17;
                        iVar10 = func_0x002ab2b0(pcVar26,pcVar16);
                        param_4 = pcVar14;
                        if ((iVar10 == 0) ||
                           (func_0x0036e464(acStack_190,pcVar13), pcVar15 = pcStack_650,
                           param_4 = pcVar14,
                           (undefined1 *)(long)*(int *)(lVar11 + 0x148) != pcVar16))
                        goto code_r0x002a3f90;
                        func_0x002ac3fc(acStack_190,pcVar26,pcVar16,auStack_100);
                        pcVar13 = pcStack_630;
                        func_0x0036e464(auStack_100,pcStack_630);
                        pcVar12 = acStack_190;
                        param_5 = pcVar17;
                        iVar10 = func_0x002ab2b0(pcVar26,pcVar16);
                        param_4 = pcVar15;
                        if ((iVar10 == 0) ||
                           (func_0x0036e464(acStack_190,pcVar13), pcVar27 = pcStack_650,
                           param_4 = pcVar15,
                           (undefined1 *)(long)*(int *)(lVar11 + 0x148) != pcVar16))
                        goto code_r0x002a3f90;
                        func_0x002ac3fc(acStack_190,pcVar26,pcVar16,auStack_100);
                        pcVar13 = pcStack_630;
                        func_0x0036e464(auStack_100,pcStack_630);
                        pcVar12 = acStack_190;
                        param_5 = pcVar17;
                        iVar10 = func_0x002ab2b0(pcVar26,pcVar16);
                        param_4 = pcVar27;
                        if (iVar10 == 0) goto code_r0x002a3f90;
                        func_0x0036e464(acStack_190,pcVar13);
                      }
                    }
                  }
                }
              }
              unaff_x28 = pcStack_650;
              uVar19 = (uint)lStack_648;
            }
            else {
              if ((undefined1 *)(long)*(int *)(lVar11 + 0x148) != pcVar16) goto code_r0x002a3f90;
              param_4 = *(char **)(lVar11 + 0x140);
              pcVar12 = pcVar26;
              param_5 = pcStack_628;
              iVar9 = func_0x00381a00(pcVar26,pcVar26);
              if (iVar9 == 0) goto code_r0x002a3f90;
              pcVar27 = param_4;
              uVar19 = (uint)lStack_648;
              if (iVar10 == 0) goto code_r0x002a3ec4;
              if ((undefined1 *)(long)*(int *)(lVar11 + 0x148) != pcVar16) goto code_r0x002a3f90;
              param_4 = *(char **)(lVar11 + 0x140);
              pcVar12 = pcVar26;
              param_5 = pcStack_628;
              iVar9 = func_0x00381a00(pcVar26,pcVar26);
              if (iVar9 == 0) goto code_r0x002a3f90;
              pcVar27 = param_4;
              uVar19 = (uint)lStack_648;
              if (iVar10 != 1) {
                if ((undefined1 *)(long)*(int *)(lVar11 + 0x148) != pcVar16) goto code_r0x002a3f90;
                param_4 = *(char **)(lVar11 + 0x140);
                pcVar12 = pcVar26;
                param_5 = pcStack_628;
                iVar9 = func_0x00381a00(pcVar26,pcVar26);
                if (iVar9 == 0) goto code_r0x002a3f90;
                pcVar27 = param_4;
                uVar19 = (uint)lStack_648;
                if (iVar10 != 2) {
                  if ((undefined1 *)(long)*(int *)(lVar11 + 0x148) != pcVar16)
                  goto code_r0x002a3f90;
                  param_4 = *(char **)(lVar11 + 0x140);
                  pcVar12 = pcVar26;
                  param_5 = pcStack_628;
                  iVar9 = func_0x00381a00(pcVar26,pcVar26);
                  if (iVar9 == 0) goto code_r0x002a3f90;
                  pcVar27 = param_4;
                  uVar19 = (uint)lStack_648;
                  if (iVar10 != 3) {
                    if ((undefined1 *)(long)*(int *)(lVar11 + 0x148) != pcVar16)
                    goto code_r0x002a3f90;
                    param_4 = *(char **)(lVar11 + 0x140);
                    pcVar12 = pcVar26;
                    param_5 = pcStack_628;
                    iVar9 = func_0x00381a00(pcVar26,pcVar26);
                    if (iVar9 == 0) goto code_r0x002a3f90;
                    pcVar27 = param_4;
                    uVar19 = (uint)lStack_648;
                    if (iVar10 != 4) {
                      if ((undefined1 *)(long)*(int *)(lVar11 + 0x148) != pcVar16)
                      goto code_r0x002a3f90;
                      param_4 = *(char **)(lVar11 + 0x140);
                      pcVar12 = pcVar26;
                      param_5 = pcStack_628;
                      iVar10 = func_0x00381a00(pcVar26,pcVar26);
                      if ((iVar10 == 0) || ((undefined1 *)(long)*(int *)(lVar11 + 0x148) != pcVar16)
                         ) goto code_r0x002a3f90;
                      param_4 = *(char **)(lVar11 + 0x140);
                      pcVar12 = pcVar26;
                      param_5 = pcStack_628;
                      iVar10 = func_0x00381a00(pcVar26,pcVar26);
                      if ((iVar10 == 0) || ((undefined1 *)(long)*(int *)(lVar11 + 0x148) != pcVar16)
                         ) goto code_r0x002a3f90;
                      param_4 = *(char **)(lVar11 + 0x140);
                      pcVar12 = pcVar26;
                      param_5 = pcStack_628;
                      iVar10 = func_0x00381a00(pcVar26,pcVar26);
                      pcVar27 = param_4;
                      uVar19 = (uint)lStack_648;
                      if (iVar10 == 0) goto code_r0x002a3f90;
                    }
                  }
                }
              }
            }
          }
          else {
            puVar23 = pcVar30 + -1;
            puVar24 = puVar23;
            if (puStack_638 <= puVar23) {
              puVar24 = puStack_638;
            }
            if ((undefined1 *)((ulong)puVar23 >> 6) < pcVar25) {
              uVar28 = *(ulong *)(unaff_x22 + (long)((ulong)puVar23 >> 6) * 8) >>
                       ((ulong)puVar23 & 0x3f);
              unaff_x27 = (undefined1 *)(ulong)((uint)uVar28 & 1);
              uVar19 = 3;
              if ((uVar28 & 1) == 0) {
                uVar19 = 1;
              }
            }
            else {
              unaff_x27 = (undefined1 *)0x0;
              uVar19 = 1;
            }
            if (puVar24 != (undefined1 *)0x0) {
              puVar23 = (undefined1 *)((ulong)(pcVar30 + -2) >> 6);
              if (puVar23 < pcVar25) {
                uVar20 = (uint)(*(ulong *)(unaff_x22 + (long)puVar23 * 8) >>
                               ((ulong)(pcVar30 + -2) & 0x3f)) & 1;
              }
              else {
                uVar20 = 0;
              }
              uVar21 = (uint)unaff_x27;
              uVar3 = 2 - uVar21;
              if (uVar20 != 0) {
                uVar21 = 2;
                uVar19 = uVar19 << (ulong)(uVar3 & 0x1f) | 1;
              }
              unaff_x27 = (undefined1 *)(ulong)uVar21;
              if (puVar24 != (undefined1 *)((long)&MACH_HEADER.magic + 1)) {
                puVar23 = (undefined1 *)((ulong)(pcVar30 + -3) >> 6);
                if (puVar23 < pcVar25) {
                  uVar20 = (uint)(*(ulong *)(unaff_x22 + (long)puVar23 * 8) >>
                                 ((ulong)(pcVar30 + -3) & 0x3f)) & 1;
                }
                else {
                  uVar20 = 0;
                }
                uVar3 = uVar21 ^ 3;
                if (uVar20 != 0) {
                  uVar21 = 3;
                  uVar19 = uVar19 << (ulong)uVar3 | 1;
                }
                unaff_x27 = (undefined1 *)(ulong)uVar21;
                if (puVar24 != (undefined1 *)((long)&MACH_HEADER.magic + 2)) {
                  puVar24 = (undefined1 *)((ulong)(pcVar30 + -4) >> 6);
                  if (puVar24 < pcVar25) {
                    uVar20 = (uint)(*(ulong *)(unaff_x22 + (long)puVar24 * 8) >>
                                   ((ulong)(pcVar30 + -4) & 0x3f)) & 1;
                  }
                  else {
                    uVar20 = 0;
                  }
                  uVar3 = 4 - uVar21;
                  if (uVar20 != 0) {
                    uVar21 = 4;
                    uVar19 = uVar19 << (ulong)(uVar3 & 0x1f) | 1;
                  }
                  unaff_x27 = (undefined1 *)(ulong)uVar21;
                }
              }
            }
            if (bVar4) goto code_r0x002a3a0c;
          }
code_r0x002a3ec4:
          if ((uVar19 & 1) == 0) {
code_r0x002a3f88:
            func_0x0079dd68();
          }
          else if (uVar19 >> (ulong)(uStack_614 & 0x1f) == 0) {
            if (!bVar4) goto code_r0x002a3f00;
            pcVar13 = acStack_610 + (ulong)(uVar19 >> 1) * 0x48;
            puVar31 = &UNK_002a3efc;
            goto code_r0x002a4078;
          }
          func_0x0079dd90();
          param_4 = pcVar27;
          pcVar13 = unaff_x28;
          goto code_r0x002a3f90;
        }
        auVar32._8_8_ = acStack_610;
        auVar32._0_8_ = auStack_100;
        puVar31 = &UNK_002a37d0;
        pcVar7 = auStack_660;
        pcVar13 = acStack_610;
        lStack_658 = uVar29 * 8;
        pcStack_650 = (char *)(uVar18 * 0x10);
        lStack_648 = (long)unaff_x27 * 2;
        goto code_r0x002a4078;
      }
    }
    else {
code_r0x002a3f90:
      _abort();
      unaff_x28 = pcVar13;
    }
    pcVar26 = unaff_x21;
    func_0x0079dd18();
    goto code_r0x002a3f98;
  }
  in_stack_00000078 = 0;
  in_stack_00000070 = 0;
  in_stack_00000088 = 0;
  in_stack_00000080 = 0;
  pcVar17 = param_1 + 0x128;
  in_stack_00000058 = 0;
  in_stack_00000050 = 0;
  in_stack_00000068 = 0;
  in_stack_00000060 = 0;
  in_stack_00000038 = 0;
  in_stack_00000030 = 0;
  in_stack_00000048 = 0;
  in_stack_00000040 = 0;
  in_stack_00000018 = 0;
  in_stack_00000010 = 0;
  in_stack_00000028 = 0;
  in_stack_00000020 = 0;
  in_stack_00000008 = 0;
  in_stack_00000000 = 0;
  if (param_4 != (char *)0x0) {
    ___memcpy_chk();
  }
  param_3 = (undefined1 *)register0x00000008;
  param_5 = pcVar17;
  iVar10 = func_0x002ab2b0(param_2);
  param_4 = unaff_x23;
  unaff_x19 = param_2;
  unaff_x20 = param_1;
  unaff_x21 = pcVar17;
  if (iVar10 == 0) goto _aws_lc_0_24_0_bn_mod_exp_mont_small;
  func_0x0036e464();
  pcVar16 = (char *)(long)*(int *)(param_1 + 0x148);
  puVar31 = &UNK_002cc418;
  pcVar7 = (char *)register0x00000008;
  pcVar13 = *(char **)(param_1 + 0x128);
  pcVar26 = pcVar17;
  goto code_r0x002a4078;
code_r0x002a3f40:
  lVar11 = 0x480;
  param_4 = pcVar27;
code_r0x002a3f48:
  uVar28 = func_0x0036e464(acStack_610,lVar11);
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_70) {
    return uVar28;
  }
code_r0x002a3f98:
  auVar33 = ___stack_chk_fail();
  pcVar30 = auVar33._8_8_;
  pcVar7 = acStack_730;
  pcVar13 = acStack_730;
  puStack_668 = &_aws_lc_0_24_0_bn_from_montgomery_small;
  lStack_698 = *(long *)PTR____stack_chk_guard_009b01e8;
  pcVar16 = param_4;
  pcVar17 = param_5;
  pcVar25 = unaff_x19;
  param_1 = unaff_x20;
  pcVar27 = unaff_x22;
  pcStack_690 = unaff_x22;
  pcStack_688 = pcVar26;
  pcStack_680 = unaff_x20;
  pcStack_678 = unaff_x19;
  pppppppuStack_670 = unaff_x29;
  if (((undefined1 *)((long)&MACH_HEADER.cpusubtype + 1) < pcVar30) ||
     (pcVar27 = (char *)((long)pcVar30 << 1), pcVar25 = pcVar30, param_1 = param_5,
     (undefined1 *)(long)(int)*(qword *)(param_5 + 0x20) != pcVar30 || pcVar27 < param_4)) {
code_r0x002a4070:
    pcVar13 = pcVar12;
    auVar33._8_8_ = pcVar25;
    auVar33._0_8_ = pcVar26;
    _abort();
    unaff_x22 = pcVar27;
  }
  else {
    acStack_730[0x78] = '\0';
    acStack_730[0x79] = '\0';
    acStack_730[0x7a] = '\0';
    acStack_730[0x7b] = '\0';
    acStack_730[0x7c] = '\0';
    acStack_730[0x7d] = '\0';
    acStack_730[0x7e] = '\0';
    acStack_730[0x7f] = '\0';
    acStack_730[0x70] = '\0';
    acStack_730[0x71] = '\0';
    acStack_730[0x72] = '\0';
    acStack_730[0x73] = '\0';
    acStack_730[0x74] = '\0';
    acStack_730[0x75] = '\0';
    acStack_730[0x76] = '\0';
    acStack_730[0x77] = '\0';
    acStack_730[0x88] = '\0';
    acStack_730[0x89] = '\0';
    acStack_730[0x8a] = '\0';
    acStack_730[0x8b] = '\0';
    acStack_730[0x8c] = '\0';
    acStack_730[0x8d] = '\0';
    acStack_730[0x8e] = '\0';
    acStack_730[0x8f] = '\0';
    acStack_730[0x80] = '\0';
    acStack_730[0x81] = '\0';
    acStack_730[0x82] = '\0';
    acStack_730[0x83] = '\0';
    acStack_730[0x84] = '\0';
    acStack_730[0x85] = '\0';
    acStack_730[0x86] = '\0';
    acStack_730[0x87] = '\0';
    acStack_730[0x58] = '\0';
    acStack_730[0x59] = '\0';
    acStack_730[0x5a] = '\0';
    acStack_730[0x5b] = '\0';
    acStack_730[0x5c] = '\0';
    acStack_730[0x5d] = '\0';
    acStack_730[0x5e] = '\0';
    acStack_730[0x5f] = '\0';
    acStack_730[0x50] = '\0';
    acStack_730[0x51] = '\0';
    acStack_730[0x52] = '\0';
    acStack_730[0x53] = '\0';
    acStack_730[0x54] = '\0';
    acStack_730[0x55] = '\0';
    acStack_730[0x56] = '\0';
    acStack_730[0x57] = '\0';
    acStack_730[0x68] = '\0';
    acStack_730[0x69] = '\0';
    acStack_730[0x6a] = '\0';
    acStack_730[0x6b] = '\0';
    acStack_730[0x6c] = '\0';
    acStack_730[0x6d] = '\0';
    acStack_730[0x6e] = '\0';
    acStack_730[0x6f] = '\0';
    acStack_730[0x60] = '\0';
    acStack_730[0x61] = '\0';
    acStack_730[0x62] = '\0';
    acStack_730[99] = '\0';
    acStack_730[100] = '\0';
    acStack_730[0x65] = '\0';
    acStack_730[0x66] = '\0';
    acStack_730[0x67] = '\0';
    acStack_730[0x38] = '\0';
    acStack_730[0x39] = '\0';
    acStack_730[0x3a] = '\0';
    acStack_730[0x3b] = '\0';
    acStack_730[0x3c] = '\0';
    acStack_730[0x3d] = '\0';
    acStack_730[0x3e] = '\0';
    acStack_730[0x3f] = '\0';
    acStack_730[0x30] = '\0';
    acStack_730[0x31] = '\0';
    acStack_730[0x32] = '\0';
    acStack_730[0x33] = '\0';
    acStack_730[0x34] = '\0';
    acStack_730[0x35] = '\0';
    acStack_730[0x36] = '\0';
    acStack_730[0x37] = '\0';
    acStack_730[0x48] = '\0';
    acStack_730[0x49] = '\0';
    acStack_730[0x4a] = '\0';
    acStack_730[0x4b] = '\0';
    acStack_730[0x4c] = '\0';
    acStack_730[0x4d] = '\0';
    acStack_730[0x4e] = '\0';
    acStack_730[0x4f] = '\0';
    acStack_730[0x40] = '\0';
    acStack_730[0x41] = '\0';
    acStack_730[0x42] = '\0';
    acStack_730[0x43] = '\0';
    acStack_730[0x44] = '\0';
    acStack_730[0x45] = '\0';
    acStack_730[0x46] = '\0';
    acStack_730[0x47] = '\0';
    acStack_730[0x18] = '\0';
    acStack_730[0x19] = '\0';
    acStack_730[0x1a] = '\0';
    acStack_730[0x1b] = '\0';
    acStack_730[0x1c] = '\0';
    acStack_730[0x1d] = '\0';
    acStack_730[0x1e] = '\0';
    acStack_730[0x1f] = '\0';
    acStack_730[0x10] = '\0';
    acStack_730[0x11] = '\0';
    acStack_730[0x12] = '\0';
    acStack_730[0x13] = '\0';
    acStack_730[0x14] = '\0';
    acStack_730[0x15] = '\0';
    acStack_730[0x16] = '\0';
    acStack_730[0x17] = '\0';
    acStack_730[0x28] = '\0';
    acStack_730[0x29] = '\0';
    acStack_730[0x2a] = '\0';
    acStack_730[0x2b] = '\0';
    acStack_730[0x2c] = '\0';
    acStack_730[0x2d] = '\0';
    acStack_730[0x2e] = '\0';
    acStack_730[0x2f] = '\0';
    acStack_730[0x20] = '\0';
    acStack_730[0x21] = '\0';
    acStack_730[0x22] = '\0';
    acStack_730[0x23] = '\0';
    acStack_730[0x24] = '\0';
    acStack_730[0x25] = '\0';
    acStack_730[0x26] = '\0';
    acStack_730[0x27] = '\0';
    acStack_730[8] = '\0';
    acStack_730[9] = '\0';
    acStack_730[10] = '\0';
    acStack_730[0xb] = '\0';
    acStack_730[0xc] = '\0';
    acStack_730[0xd] = '\0';
    acStack_730[0xe] = '\0';
    acStack_730[0xf] = '\0';
    acStack_730[0] = '\0';
    acStack_730[1] = '\0';
    acStack_730[2] = '\0';
    acStack_730[3] = '\0';
    acStack_730[4] = '\0';
    acStack_730[5] = '\0';
    acStack_730[6] = '\0';
    acStack_730[7] = '\0';
    if (param_4 != (char *)0x0) {
      ___memcpy_chk(acStack_730,pcVar12,(long)param_4 << 3,0x90);
    }
    pcVar16 = pcVar27;
    iVar10 = func_0x002ab2b0(auVar33._0_8_,pcVar30);
    pcVar12 = pcVar13;
    pcVar26 = auVar33._0_8_;
    if (iVar10 == 0) goto code_r0x002a4070;
    uVar28 = func_0x0036e464(acStack_730,(long)pcVar30 << 4);
    unaff_x22 = pcVar27;
    if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_698) {
      return uVar28;
    }
  }
  pcVar26 = auVar33._0_8_;
  puVar31 = &_aws_lc_0_24_0_bn_mod_mul_montgomery_small;
  auVar32 = ___stack_chk_fail();
  param_2 = auVar33._8_8_;
  unaff_x29 = &pppppppuStack_670;
code_r0x002a4078:
  puVar24 = auVar32._8_8_;
  *(char **)(pcVar7 + -0x40) = unaff_x28;
  *(undefined1 **)(pcVar7 + -0x38) = unaff_x27;
  *(char **)(pcVar7 + -0x30) = unaff_x22;
  *(char **)(pcVar7 + -0x28) = pcVar26;
  *(char **)(pcVar7 + -0x20) = param_1;
  *(char **)(pcVar7 + -0x18) = param_2;
  *(undefined8 ********)(pcVar7 + -0x10) = unaff_x29;
  *(undefined **)(pcVar7 + -8) = puVar31;
  *(undefined8 *)(pcVar7 + -0x48) = *(undefined8 *)PTR____stack_chk_guard_009b01e8;
  if ((pcVar16 < (undefined1 *)((long)&MACH_HEADER.cpusubtype + 2)) &&
     ((undefined1 *)(long)(int)*(qword *)(pcVar17 + 0x20) == pcVar16)) {
    if (pcVar16 < (undefined1 *)((long)&MACH_HEADER.magic + 2)) {
      if (puVar24 == pcVar13) {
        func_0x002ac3fc(pcVar7 + -0x168,puVar24,pcVar16,pcVar7 + -0xd8);
        func_0x0036e464(pcVar7 + -0xd8,(long)pcVar16 << 4);
      }
      else {
        func_0x002abe4c(pcVar7 + -0x168,puVar24,pcVar16,pcVar13,pcVar16);
      }
      pcVar13 = pcVar7 + -0x168;
      iVar10 = func_0x002ab2b0(auVar32._0_8_,pcVar16,pcVar13,(long)pcVar16 << 1,pcVar17);
      if (iVar10 != 0) {
        uVar28 = func_0x0036e464(pcVar7 + -0x168,(long)pcVar16 << 4);
        goto code_r0x002a4150;
      }
    }
    else {
      uVar28 = func_0x00381a00(auVar32._0_8_,puVar24,pcVar13,*(qword *)(pcVar17 + 0x18),
                               pcVar17 + 0x30,pcVar16);
      if ((int)uVar28 != 0) {
code_r0x002a4150:
        if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(pcVar7 + -0x48)) {
          return uVar28;
        }
        goto code_r0x002a4184;
      }
    }
  }
  _abort();
code_r0x002a4184:
  auVar32 = ___stack_chk_fail();
  if ((ulong)pcVar13 >> 6 < auVar32._8_8_) {
    return (ulong)((uint)(*(ulong *)(auVar32._0_8_ + ((ulong)pcVar13 >> 6) * 8) >>
                         ((ulong)pcVar13 & 0x3f)) & 1);
  }
  return 0;
}

