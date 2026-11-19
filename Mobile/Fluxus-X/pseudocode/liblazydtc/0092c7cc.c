/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0092c7cc
 */

/* WARNING: Removing unreachable block (ram,0x0092ce5c) */
/* WARNING: Removing unreachable block (ram,0x0092d55c) */
/* WARNING: Type propagation algorithm not settling */

void FUN_0092c7cc(long param_1,undefined1 (*param_2) [16],int *param_3)

{
  long *plVar1;
  int *piVar2;
  uint *puVar3;
  long *plVar4;
  long *plVar5;
  long *plVar6;
  byte bVar7;
  long lVar8;
  bool bVar9;
  int iVar10;
  int iVar11;
  uint uVar12;
  ulong uVar13;
  undefined8 uVar14;
  undefined1 (*extraout_x1) [16];
  undefined1 (*extraout_x1_00) [16];
  undefined1 (*extraout_x1_01) [16];
  undefined1 (*extraout_x1_02) [16];
  undefined1 (*extraout_x1_03) [16];
  undefined1 (*extraout_x1_04) [16];
  undefined1 (*extraout_x1_05) [16];
  undefined1 (*extraout_x1_06) [16];
  undefined1 (*extraout_x1_07) [16];
  undefined1 (*extraout_x1_08) [16];
  undefined1 (*extraout_x1_09) [16];
  undefined1 (*extraout_x1_10) [16];
  undefined1 (*pauVar15) [16];
  undefined1 (*extraout_x1_11) [16];
  undefined1 (*extraout_x1_12) [16];
  undefined1 (*extraout_x1_13) [16];
  undefined1 (*extraout_x1_14) [16];
  undefined1 (*extraout_x1_15) [16];
  undefined1 (*extraout_x1_16) [16];
  undefined1 (*extraout_x1_17) [16];
  undefined1 (*extraout_x1_18) [16];
  undefined1 (*extraout_x1_19) [16];
  undefined1 (*extraout_x1_20) [16];
  undefined1 (*extraout_x1_21) [16];
  undefined1 (*extraout_x1_22) [16];
  undefined1 (*extraout_x1_23) [16];
  undefined1 (*extraout_x1_24) [16];
  undefined1 (*extraout_x1_25) [16];
  undefined1 (*extraout_x1_26) [16];
  undefined1 (*extraout_x1_27) [16];
  undefined1 (*extraout_x1_28) [16];
  undefined1 (*extraout_x1_29) [16];
  undefined1 (*extraout_x1_30) [16];
  undefined1 (*extraout_x1_31) [16];
  undefined1 (*extraout_x1_32) [16];
  undefined1 (*extraout_x1_33) [16];
  undefined1 (*extraout_x1_34) [16];
  undefined1 (*extraout_x1_35) [16];
  uint uVar16;
  long lVar17;
  code *pcVar18;
  long lVar19;
  undefined8 *puVar20;
  long lVar21;
  uint *puVar22;
  long lVar23;
  undefined1 auVar24 [16];
  long local_b8;
  char local_ac [4];
  int local_a8;
  uint local_a4;
  char local_a0 [4];
  char local_9c [4];
  char local_98 [4];
  char local_94 [4];
  long local_90;
  undefined8 uStack_88;
  undefined8 local_80;
  undefined8 uStack_78;
  long local_70;
  
  lVar8 = tpidr_el0;
  local_70 = *(long *)(lVar8 + 0x28);
  local_9c[0] = '\0';
  local_a0[0] = '\0';
  local_a4 = 0;
  if ((param_3 == (int *)0x0) || (*param_3 != -0x3f212453)) {
    uVar14 = 2;
  }
  else {
    pauVar15 = param_2;
    if ((*(byte *)(param_1 + 0x231) >> 4 & 1) != 0) {
      local_a4 = 0x2a;
      FUN_0092b674(param_3,0x2a,0);
      pauVar15 = extraout_x1;
      if (param_3[0x16] != 0x10) {
        lVar21 = *(long *)(param_3 + 0x30);
        param_3[0x16] = 0x10;
        iVar10 = *(int *)(lVar21 + 0x1c) + -1;
        *(int *)(lVar21 + 0x1c) = iVar10;
        if (iVar10 == 0) {
          (*(code *)PTR_free_00cc4678)(*(undefined8 *)(lVar21 + 0xd8));
          *(undefined8 *)(lVar21 + 0xd8) = 0;
          *(undefined8 *)(lVar21 + 0xe0) = 0;
          *(byte *)(lVar21 + 0x231) = *(byte *)(lVar21 + 0x231) & 0xdf;
          (*(code *)PTR_free_00cc4678)(*(undefined8 *)(lVar21 + 0xe8));
          *(undefined8 *)(lVar21 + 0xe8) = 0;
          *(undefined8 *)(lVar21 + 0xf0) = 0;
          *(byte *)(lVar21 + 0x231) = *(byte *)(lVar21 + 0x231) & 0xbf;
        }
        lVar21 = *(long *)(param_3 + 8);
        if (lVar21 != 0) {
          FUN_00907e2c(lVar21,param_3);
          FUN_00925d80(lVar21 + 0x3d0,param_3 + 0x10,0);
        }
        param_3[8] = 0;
        param_3[9] = 0;
        FUN_0092ba18(param_3);
        pauVar15 = extraout_x1_00;
      }
    }
    puVar22 = (uint *)(param_3 + 0x16);
    lVar21 = param_1 + 0x40;
    plVar1 = (long *)(param_3 + 4);
    piVar2 = param_3 + 0x10;
    puVar3 = (uint *)((long)param_3 + 0x1b1);
    plVar4 = (long *)(param_3 + 8);
    plVar5 = (long *)(param_1 + 0x10);
    do {
      local_ac[0] = '\0';
      bVar7 = *(byte *)(param_1 + 0x231);
      *(byte *)(param_1 + 0x231) = bVar7 & 0xfd;
      if (((bVar7 >> 1 & 1) != 0) && (*(long **)(param_1 + 0x40) != (long *)0x0)) {
        lVar23 = **(long **)(param_1 + 0x40);
        *(undefined8 *)(lVar23 + 0x10) = 0;
        if (*(long *)(param_1 + 8) == 0) {
          *(undefined8 *)(lVar23 + 0x18) = 0;
          *(long *)(param_1 + 8) = lVar23;
        }
        else {
          lVar17 = *plVar5;
          *(long *)(lVar17 + 0x10) = lVar23;
          *(long *)(lVar23 + 0x18) = lVar17;
        }
        *plVar5 = lVar23;
        if (*(int *)(lVar23 + 0x58) != 3) {
          *(undefined4 *)(lVar23 + 0x58) = 3;
          FUN_009425cc(lVar23,pauVar15);
        }
        FUN_00925d80(lVar21,lVar23 + 0x28,0);
        FUN_0092aff8(lVar23,0,8);
        pauVar15 = extraout_x1_05;
      }
      uVar12 = *puVar22;
      if (uVar12 - 4 < 0xc) {
        if (*plVar4 != 0) goto LAB_0092cdf8;
switchD_0092ce30_default:
        uVar14 = 4;
        goto LAB_0092c83c;
      }
      if (uVar12 - 3 < 0xd) {
LAB_0092cdf8:
        auVar24 = FUN_0092ddf8(param_3,param_2,local_ac,&local_a4);
        pauVar15 = auVar24._8_8_;
        iVar10 = 0;
        if ((auVar24._0_8_ & 1) == 0) {
          uVar12 = *puVar22;
          goto LAB_0092ce18;
        }
        goto LAB_0092db80;
      }
LAB_0092ce18:
      iVar10 = 0;
      switch(uVar12) {
      case 0:
        local_a4 = FUN_009425fc(param_3);
        iVar10 = 0;
        pauVar15 = extraout_x1_07;
        if (local_a4 == 0) {
          if (*puVar22 != 2) {
            *puVar22 = 2;
          }
          FUN_00931d94(param_3,1);
          goto switchD_0092ce30_caseD_2;
        }
        break;
      case 1:
      case 0x10:
      case 0x11:
        if (uVar12 < 3) goto LAB_0092db80;
        goto LAB_0092db4c;
      case 2:
switchD_0092ce30_caseD_2:
        auVar24 = FUN_00931d94(param_3,2);
        *param_2 = auVar24;
        if (param_3[0xb8] != 0) {
          FUN_0092aff8(param_3,param_3[0xb8],10);
        }
        if (param_3[0xb9] != 0) {
          FUN_0092aff8(param_3,param_3[0xb9],2);
        }
        if (*puVar22 != 3) {
          param_3[0x16] = 3;
          FUN_009425cc(param_3);
        }
      case 3:
        local_a4 = FUN_009471c0(param_3,local_98,local_94);
        if (local_a4 == 0x59) {
          if (*puVar22 != 1) {
            *puVar22 = 1;
          }
          FUN_00925d10(lVar21,param_3,param_3 + 10);
          lVar23 = *(long *)(param_3 + 4);
          lVar17 = *(long *)(param_3 + 6);
          if (lVar17 == 0) {
            *(long *)(param_1 + 8) = lVar23;
          }
          else {
            *(long *)(lVar17 + 0x10) = lVar23;
            lVar23 = *plVar1;
          }
          plVar6 = plVar5;
          if (lVar23 != 0) {
            plVar6 = (long *)(lVar23 + 0x18);
          }
          iVar10 = 0;
          *plVar6 = lVar17;
          *plVar1 = 0;
          param_3[6] = 0;
          param_3[7] = 0;
          local_a4 = 0;
          pauVar15 = extraout_x1_09;
          break;
        }
        lVar23 = *(long *)(param_3 + 0x30);
        pauVar15 = extraout_x1_08;
        if (*(long **)(lVar23 + 0x40) != (long *)0x0) {
          lVar17 = **(long **)(lVar23 + 0x40);
          *(undefined8 *)(lVar17 + 0x10) = 0;
          if (*(long *)(lVar23 + 8) == 0) {
            *(undefined8 *)(lVar17 + 0x18) = 0;
            *(long *)(lVar23 + 8) = lVar17;
          }
          else {
            lVar19 = *(long *)(lVar23 + 0x10);
            *(long *)(lVar19 + 0x10) = lVar17;
            *(long *)(lVar17 + 0x18) = lVar19;
          }
          *(long *)(lVar23 + 0x10) = lVar17;
          if (*(int *)(lVar17 + 0x58) != 3) {
            *(undefined4 *)(lVar17 + 0x58) = 3;
            FUN_009425cc(lVar17);
          }
          FUN_00925d80(lVar23 + 0x40,lVar17 + 0x28,0);
          FUN_0092aff8(lVar17,0,8);
          pauVar15 = extraout_x1_18;
        }
        iVar10 = 0;
        if (local_a4 != 0) break;
        auVar24 = FUN_00931d94(param_3,3);
        pauVar15 = auVar24._8_8_;
        *param_2 = auVar24;
        if (local_98[0] == '\0') {
          if (local_94[0] == '\0') {
            if (*puVar22 != 5) {
              uVar12 = 5;
              goto LAB_0092d810;
            }
          }
          else if (*puVar22 != 7) {
LAB_0092d1d8:
            uVar12 = 7;
LAB_0092d810:
            *puVar22 = uVar12;
          }
          goto LAB_0092d814;
        }
        iVar10 = 0;
        uVar16 = 4;
        uVar12 = 4;
        if (*puVar22 == 4) goto LAB_0092db4c;
        *puVar22 = 4;
        goto LAB_0092db54;
      case 4:
        local_b8 = 0;
        lVar23 = *plVar4;
        if ((*(ulong *)(lVar23 + 0x3a0) & 1) == 0) {
          if (((uint)*(ulong *)(lVar23 + 0x3a0) >> 9 & 1) == 0) {
            puVar20 = (undefined8 *)(lVar23 + 0x50);
          }
          else {
            puVar20 = (undefined8 *)(lVar23 + 0x80);
          }
        }
        else {
          puVar20 = (undefined8 *)(lVar23 + 0xd8);
        }
        uVar14 = *puVar20;
        local_b8 = FUN_00916ce4(param_3,uVar14,*(undefined4 *)(lVar23 + 0x15c));
        if (local_b8 == 0) {
LAB_0092d5d0:
          local_a4 = FUN_00917850(param_3,&local_b8);
        }
        else {
          *(long *)(param_3 + 0x366) = local_b8;
          *(byte *)(param_3 + 0x36e) = *(byte *)(param_3 + 0x36e) | 1;
          local_a4 = 0;
          if (((*(byte *)((long)param_3 + 0xa85) >> 4 & 1) != 0) &&
             (((*(long *)(param_3 + 0x4a8) == 0 || (0 < *(int *)(*(long *)(param_3 + 0x4a8) + 8)))
              && (FUN_00904c98(param_3,"Hostname \'%s\' was found in DNS cache",uVar14),
                 local_b8 == 0)))) goto LAB_0092d5d0;
        }
        FUN_0092bcf8(param_3,&local_90);
        auVar24 = FUN_0092dfc0(param_1,param_3,&local_90,param_3 + 0x24);
        pauVar15 = auVar24._8_8_;
        uVar14 = auVar24._0_8_;
        if (auVar24._0_4_ == 0) {
          *(undefined8 *)(param_3 + 0x2a) = uStack_78;
          *(undefined8 *)(param_3 + 0x28) = local_80;
          *(undefined8 *)(param_3 + 0x26) = uStack_88;
          *(long *)(param_3 + 0x24) = local_90;
          if (local_b8 == 0) {
            if (local_a4 == 0) goto LAB_0092d688;
          }
          else {
            local_a4 = FUN_00918228(param_3,local_94);
            pauVar15 = extraout_x1_19;
            if (local_a4 == 0) {
              if (local_94[0] == '\0') {
                if (*puVar22 != 5) {
                  *puVar22 = 5;
                }
              }
              else if (*puVar22 != 7) {
                *puVar22 = 7;
              }
LAB_0092db3c:
              iVar10 = -1;
              break;
            }
            *plVar4 = 0;
          }
          goto LAB_0092d644;
        }
        goto LAB_0092c83c;
      case 5:
        local_a4 = FUN_00907508(param_3,0,0,local_94);
        pauVar15 = (undefined1 (*) [16])(ulong)local_a4;
        if ((local_a4 != 0) || (local_94[0] == '\0')) {
LAB_0092d2e8:
          if ((int)pauVar15 != 0) goto LAB_0092d2ec;
LAB_0092d688:
          iVar10 = 0;
          break;
        }
LAB_0092d1cc:
        if (*puVar22 == 7) goto LAB_0092d814;
        goto LAB_0092d1d8;
      case 6:
        local_a4 = FUN_009197ec(param_3,local_9c);
        if ((*(byte *)(*(long *)(param_3 + 8) + 0x3a0) >> 4 & 1) != 0) {
          local_a4 = 0;
          FUN_0092b674(param_3,0,0);
          pauVar15 = extraout_x1_14;
          if (param_3[0x16] == 3) goto LAB_0092d814;
          param_3[0x16] = 3;
          FUN_009425cc(param_3);
          pauVar15 = extraout_x1_15;
          goto LAB_0092db3c;
        }
        pauVar15 = extraout_x1_10;
        if (local_a4 == 0) goto LAB_0092d1cc;
LAB_0092d644:
        iVar10 = 0;
        local_ac[0] = '\x01';
        break;
      case 7:
        pauVar15 = (undefined1 (*) [16])(ulong)local_a4;
        if (local_a4 != 0) {
LAB_0092d2ec:
          FUN_0092b674(param_3,pauVar15,1);
          pauVar15 = extraout_x1_13;
          goto LAB_0092d644;
        }
        lVar23 = *plVar4;
        pauVar15 = (undefined1 (*) [16])0x0;
        if (*(char *)(lVar23 + 0x3a0) < '\0') {
LAB_0092d224:
          uVar12 = 9;
          goto LAB_0092d810;
        }
        local_9c[0] = '\0';
        auVar24 = FUN_009077cc(lVar23,0);
        pauVar15 = auVar24._8_8_;
        uVar13 = *(ulong *)(lVar23 + 0x3a0);
        if ((((uint)uVar13 >> 0xe & 1) == 0) || ((auVar24._0_8_ & 1) == 0)) {
          if (((uint)uVar13 >> 0xe & 1) == 0) {
            pcVar18 = *(code **)(*(long *)(lVar23 + 0x3a8) + 0x28);
            if (pcVar18 == (code *)0x0) {
              local_9c[0] = '\x01';
            }
            else {
              local_a4 = (*pcVar18)(param_3,local_9c);
              pauVar15 = (undefined1 (*) [16])(ulong)local_a4;
              if (local_a4 != 0) goto LAB_0092d2ec;
              uVar13 = *(ulong *)(lVar23 + 0x3a0);
              pauVar15 = (undefined1 (*) [16])0x0;
            }
            *(ulong *)(lVar23 + 0x3a0) = uVar13 | 0x4000;
          }
        }
        else if (*(long *)(*(long *)(lVar23 + 0x3a8) + 0x30) == 0) {
          local_9c[0] = '\x01';
          local_a4 = 0;
          goto LAB_0092d218;
        }
        local_a4 = 0;
        if (local_9c[0] != '\0') {
          if (*puVar22 == 9) goto LAB_0092d814;
          goto LAB_0092d224;
        }
        if (*puVar22 != 8) {
          uVar12 = 8;
          goto LAB_0092d810;
        }
        iVar10 = -1;
        lVar23 = *plVar4;
        goto joined_r0x0092cc88;
      case 8:
        if ((*plVar4 == 0) ||
           (pcVar18 = *(code **)(*(long *)(*plVar4 + 0x3a8) + 0x30), pcVar18 == (code *)0x0)) {
          pauVar15 = (undefined1 (*) [16])0x0;
          local_9c[0] = '\x01';
          local_a4 = 0;
        }
        else {
          local_9c[0] = '\0';
          local_a4 = (*pcVar18)(param_3,local_9c);
          pauVar15 = (undefined1 (*) [16])(ulong)local_a4;
          if (local_a4 != 0) goto LAB_0092d2e8;
        }
        if (local_9c[0] == '\0') goto LAB_0092d2e8;
LAB_0092d218:
        if (*puVar22 != 9) goto LAB_0092d224;
        goto LAB_0092d814;
      case 9:
        pcVar18 = *(code **)(param_3 + 0xa6);
        if (pcVar18 != (code *)0x0) {
          lVar23 = *(long *)(param_3 + 0x30);
          if (lVar23 != 0) {
            *(byte *)(lVar23 + 0x231) = *(byte *)(lVar23 + 0x231) | 4;
            pcVar18 = *(code **)(param_3 + 0xa6);
          }
          iVar10 = (*pcVar18)(*(undefined8 *)(param_3 + 0xa8),param_3 + 0x4df,(long)param_3 + 0x13aa
                              ,param_3[0x4f6],param_3[0x4f7]);
          lVar23 = *(long *)(param_3 + 0x30);
          if (lVar23 != 0) {
            *(byte *)(lVar23 + 0x231) = *(byte *)(lVar23 + 0x231) & 0xfb;
          }
          pauVar15 = extraout_x1_06;
          if (iVar10 == 0) goto LAB_0092d268;
          FUN_00904b80(param_3,"operation aborted by pre-request callback");
          pauVar15 = (undefined1 (*) [16])0x2a;
          local_a4 = 0x2a;
LAB_0092d258:
          FUN_0092b674(param_3,pauVar15,0);
          pauVar15 = extraout_x1_11;
          goto LAB_0092d644;
        }
LAB_0092d268:
        if (*(char *)((long)param_3 + 0xa81) == '\x01') {
          FUN_00908c4c(*(long *)(param_3 + 8),0);
          if (*puVar22 != 0xf) {
            *puVar22 = 0xf;
          }
          local_a4 = 0;
          pauVar15 = extraout_x1_12;
          goto LAB_0092db3c;
        }
        pcVar18 = *(code **)(*(long *)(*(long *)(param_3 + 8) + 0x3a8) + 0x10);
        if (pcVar18 == (code *)0x0) {
          local_a4 = 0;
        }
        else {
          local_a4 = (*pcVar18)(param_3,local_a0);
          pauVar15 = (undefined1 (*) [16])(ulong)local_a4;
          if (local_a4 != 0) {
            if (local_a4 == 0x37) {
              lVar23 = *plVar4;
              if (*(char *)(lVar23 + 0x3a0) < '\0') {
                local_90 = 0;
                uVar12 = FUN_0094300c(param_3,&local_90);
                if (uVar12 != 0) {
                  local_ac[0] = '\x01';
                  local_a4 = uVar12;
                }
                uVar12 = FUN_0092b674(param_3,local_a4,0);
                if (local_90 == 0) {
                  iVar10 = 0;
                  local_ac[0] = '\x01';
                }
                else if (((uVar12 == 0x37) || (uVar12 == 0)) &&
                        (uVar12 = FUN_0094299c(param_3,local_90,2), uVar12 == 0)) {
                  if (*puVar22 != 2) {
                    *puVar22 = 2;
                  }
                  local_a4 = 0;
                  iVar10 = -1;
                }
                else {
                  iVar10 = 0;
                  local_a4 = uVar12;
                }
                goto LAB_0092d6fc;
              }
            }
            else {
              lVar23 = *plVar4;
            }
            if (lVar23 == 0) goto LAB_0092d644;
            goto LAB_0092d258;
          }
        }
        if (local_a0[0] != '\0') {
          if ((*(byte *)(*plVar4 + 0x3a1) >> 5 & 1) == 0) {
            if (*puVar22 != 0xc) {
              param_3[0x16] = 0xc;
              *puVar3 = *puVar3 & 0xfffff7ff;
              FUN_00931d94(param_3,7);
              pauVar15 = extraout_x1_27;
              goto LAB_0092db3c;
            }
          }
          else if (*puVar22 != 0xb) {
            uVar12 = 0xb;
            goto LAB_0092d810;
          }
          goto LAB_0092d814;
        }
        if (((*(byte *)(param_3 + 0x4c7) >> 6 & 1) != 0) &&
           ((*(byte *)(*(long *)(param_3 + 0x4c8) + 0x40) | 2) == 7)) {
          FUN_0092b674(param_3,0,0);
          uVar12 = 0xf;
          if (*(long *)(param_3 + 8) == 0) {
            uVar12 = 0x10;
          }
          pauVar15 = extraout_x1_01;
          if (param_3[0x16] != uVar12) {
            *puVar22 = uVar12;
            if (*(long *)(param_3 + 8) == 0) {
              lVar23 = *(long *)(param_3 + 0x30);
              iVar10 = *(int *)(lVar23 + 0x1c) + -1;
              *(int *)(lVar23 + 0x1c) = iVar10;
              if (iVar10 == 0) {
                (*(code *)PTR_free_00cc4678)(*(undefined8 *)(lVar23 + 0xd8));
                *(undefined8 *)(lVar23 + 0xd8) = 0;
                *(undefined8 *)(lVar23 + 0xe0) = 0;
                *(byte *)(lVar23 + 0x231) = *(byte *)(lVar23 + 0x231) & 0xdf;
                (*(code *)PTR_free_00cc4678)(*(undefined8 *)(lVar23 + 0xe8));
                *(undefined8 *)(lVar23 + 0xe8) = 0;
                *(undefined8 *)(lVar23 + 0xf0) = 0;
                *(byte *)(lVar23 + 0x231) = *(byte *)(lVar23 + 0x231) & 0xbf;
                pauVar15 = extraout_x1_02;
              }
            }
            if ((0x11008U >> (ulong)uVar12 & 1) != 0) {
              (**(code **)(&DAT_00c4f8a0 + (ulong)uVar12 * 8))(param_3);
              pauVar15 = extraout_x1_03;
            }
            iVar10 = -1;
            break;
          }
          goto LAB_0092db3c;
        }
        if (*puVar22 == 10) goto LAB_0092d814;
        uVar12 = 10;
        goto LAB_0092d810;
      case 10:
        lVar23 = *plVar4;
        if ((lVar23 != 0) &&
           (pcVar18 = *(code **)(*(long *)(lVar23 + 0x3a8) + 0x38), pcVar18 != (code *)0x0)) {
          local_a0[0] = '\0';
          local_a4 = (*pcVar18)(param_3,local_a0);
          pauVar15 = (undefined1 (*) [16])(ulong)local_a4;
          if (local_a4 != 0) goto LAB_0092d258;
          pauVar15 = (undefined1 (*) [16])0x0;
          if (local_a0[0] != '\0') {
            lVar23 = *plVar4;
            uVar16 = *puVar22;
            goto LAB_0092d2ac;
          }
          goto LAB_0092d688;
        }
        local_a0[0] = '\x01';
        local_a4 = 0;
        uVar16 = 10;
LAB_0092d2ac:
        uVar12 = 0xc - (*(uint *)(lVar23 + 0x3a0) >> 0xd & 1);
        uVar13 = (ulong)uVar12;
        if (uVar16 == uVar12) {
          iVar10 = -1;
          uVar12 = uVar16;
        }
        else {
          *puVar22 = uVar12;
          if ((0x11008U >> (uVar13 & 0x3f) & 1) != 0) {
LAB_0092db28:
            (**(code **)(&DAT_00c4f8a0 + uVar13 * 8))(param_3);
            pauVar15 = extraout_x1_30;
            goto LAB_0092db3c;
          }
          iVar10 = -1;
        }
        goto joined_r0x0092d2cc;
      case 0xb:
        local_a8 = 0;
        pcVar18 = *(code **)(*(long *)(*plVar4 + 0x3a8) + 0x20);
        if (pcVar18 == (code *)0x0) {
          iVar10 = 0;
          local_a4 = 0;
          break;
        }
        local_a4 = (*pcVar18)(param_3,&local_a8);
        pauVar15 = (undefined1 (*) [16])(ulong)local_a4;
        if (local_a4 != 0) goto LAB_0092d258;
        pauVar15 = (undefined1 (*) [16])0x0;
        if (local_a8 == 0) goto LAB_0092d688;
        uVar16 = *puVar22;
        uVar12 = 0xc;
        if (local_a8 != 1) {
          uVar12 = 10;
        }
        uVar13 = (ulong)uVar12;
        if (uVar16 != uVar12) {
          *puVar22 = uVar12;
          if ((0x11008U >> uVar13 & 1) == 0) goto LAB_0092d814;
          goto LAB_0092db28;
        }
        iVar10 = -1;
        goto joined_r0x0092d680;
      case 0xc:
        lVar23 = *plVar4;
        if (((*(byte *)(lVar23 + 0x3a2) >> 6 & 1) != 0) &&
           (*(long **)(param_1 + 0x40) != (long *)0x0)) {
          lVar23 = **(long **)(param_1 + 0x40);
          *(undefined8 *)(lVar23 + 0x10) = 0;
          if (*(long *)(param_1 + 8) == 0) {
            *(undefined8 *)(lVar23 + 0x18) = 0;
            *(long *)(param_1 + 8) = lVar23;
          }
          else {
            lVar17 = *plVar5;
            *(long *)(lVar17 + 0x10) = lVar23;
            *(long *)(lVar23 + 0x18) = lVar17;
          }
          *plVar5 = lVar23;
          if (*(int *)(lVar23 + 0x58) != 3) {
            *(undefined4 *)(lVar23 + 0x58) = 3;
            FUN_009425cc(lVar23);
          }
          FUN_00925d80(lVar21,lVar23 + 0x28,0);
          FUN_0092aff8(lVar23,0,8);
          lVar23 = *plVar4;
          pauVar15 = extraout_x1_22;
        }
        if ((*(int *)(lVar23 + 0x3c8) == -1) && (*(int *)(lVar23 + 0x3cc) == -1)) {
          if (((*(byte *)(param_3 + 0x4c7) >> 6 & 1) != 0) &&
             ((*(byte *)(*(long *)(lVar23 + 0x3a8) + 0x95) >> 4 & 1) == 0)) {
            *(undefined1 *)(*(long *)(param_3 + 0x4c8) + 0x40) = 7;
          }
          if (*puVar22 != 0xf) {
            uVar12 = 0xf;
            goto LAB_0092d810;
          }
        }
        else if (*puVar22 != 0xd) {
          uVar12 = 0xd;
          goto LAB_0092d810;
        }
LAB_0092d814:
        iVar10 = -1;
        goto joined_r0x0092d81c;
      case 0xd:
        local_90 = 0;
        if (*(long *)(param_3 + 0xca) == 0) {
          lVar23 = 0;
          lVar17 = *(long *)(param_3 + 0xcc);
          if (lVar17 == 0) goto LAB_0092d3bc;
LAB_0092cfc0:
          lVar17 = FUN_00931f58(*(undefined8 *)(param_3 + 0x2b0),*(undefined8 *)(param_3 + 0x2e6),
                                lVar17,*(undefined8 *)(param_3 + 0x2e2),
                                *(undefined8 *)(param_3 + 0x2e4),*(undefined8 *)*param_2,
                                *(undefined8 *)(*param_2 + 8));
          if (!(lVar17 == 0 && lVar23 == 0)) goto LAB_0092cfe4;
LAB_0092d3c8:
          local_a4 = FUN_00941fa4(param_3);
          if ((local_a4 == 0x38) || ((*puVar3 >> 1 & 1) != 0)) {
            uVar12 = FUN_0094300c(param_3,&local_90);
            if (uVar12 == 0) {
              if (local_90 != 0) {
                local_a4 = 0;
                bVar9 = true;
                *puVar3 = *puVar3 | 2;
                if ((*(byte *)puVar3 >> 1 & 1) != 0) goto LAB_0092c9b8;
                goto LAB_0092c9c4;
              }
              if (local_a4 == 0) goto LAB_0092d3fc;
LAB_0092d6c8:
              uVar12 = local_a4;
            }
            else if (local_a4 != 0) goto LAB_0092d6c8;
            local_a4 = uVar12;
            if ((local_a4 != 0x5c) && ((*(uint *)(*(long *)(*plVar4 + 0x3a8) + 0x94) >> 1 & 1) == 0)
               ) {
              FUN_00908c4c(*plVar4,2);
            }
            FUN_0092b674(param_3,local_a4,1);
LAB_0092d6f8:
            iVar10 = 0;
          }
          else {
            if (local_a4 != 0) goto LAB_0092d6c8;
LAB_0092d3fc:
            bVar9 = false;
            if ((*(byte *)puVar3 >> 1 & 1) == 0) {
LAB_0092c9c4:
              if (*(char *)((long)param_3 + 0x131b) != '\0') {
                uVar13 = FUN_00943630(param_3);
                iVar10 = 0;
                if ((uVar13 & 1) != 0) goto LAB_0092d6fc;
                FUN_0092aff8(param_3,0,8);
              }
              goto LAB_0092d6f8;
            }
LAB_0092c9b8:
            uVar13 = thunk_FUN_00937204(param_3);
            if ((uVar13 & 1) != 0) goto LAB_0092c9c4;
            if ((bool)(*(long *)(param_3 + 0x66) == 0 & (bVar9 ^ 1U))) {
              if (*(long *)(param_3 + 100) == 0) {
joined_r0x0092cd04:
                iVar10 = 0;
                if (local_a4 != 0) goto LAB_0092d6fc;
              }
              else {
                (*(code *)PTR_free_00cc4678)(local_90);
                local_90 = *(long *)(param_3 + 100);
                param_3[100] = 0;
                param_3[0x65] = 0;
                local_a4 = FUN_0094299c(param_3,local_90,1);
                if (local_a4 != 0) {
                  local_ac[0] = '\x01';
                  local_a4 = FUN_0092b674(param_3,local_a4,1);
                  goto joined_r0x0092cd04;
                }
              }
              if (*puVar22 != 0xf) {
                uVar12 = 0xf;
                goto LAB_0092cd40;
              }
LAB_0092cd14:
              iVar10 = -1;
            }
            else {
              if (bVar9) {
                uVar14 = 2;
              }
              else {
                (*(code *)PTR_free_00cc4678)(local_90);
                local_90 = *(long *)(param_3 + 0x66);
                uVar14 = 3;
                param_3[0x66] = 0;
                param_3[0x67] = 0;
              }
              FUN_0092b674(param_3,0,0);
              local_a4 = FUN_0094299c(param_3,local_90,uVar14);
              iVar10 = 0;
              if (local_a4 == 0) {
                if (*puVar22 == 2) goto LAB_0092cd14;
                uVar12 = 2;
LAB_0092cd40:
                *puVar22 = uVar12;
                iVar10 = -1;
              }
            }
          }
LAB_0092d6fc:
          (*(code *)PTR_free_00cc4678)(local_90);
          pauVar15 = extraout_x1_20;
        }
        else {
          lVar23 = FUN_00931f58(*(undefined8 *)(param_3 + 0x2b2),*(undefined8 *)(param_3 + 0x2e0),
                                *(long *)(param_3 + 0xca),*(undefined8 *)(param_3 + 0x2dc),
                                *(undefined8 *)(param_3 + 0x2de),*(undefined8 *)*param_2,
                                *(undefined8 *)(*param_2 + 8));
          lVar17 = *(long *)(param_3 + 0xcc);
          if (lVar17 != 0) goto LAB_0092cfc0;
LAB_0092d3bc:
          lVar17 = 0;
          if (lVar23 == 0) goto LAB_0092d3c8;
LAB_0092cfe4:
          FUN_00931ec4(param_3,*(undefined8 *)*param_2,*(undefined8 *)(*param_2 + 8));
          if (param_3[0x16] != 0xe) {
            *puVar22 = 0xe;
          }
          if (lVar23 < lVar17) {
            lVar23 = lVar17;
          }
          FUN_0092aff8(param_3,lVar23,0xb);
          iVar10 = 0;
          pauVar15 = extraout_x1_17;
        }
        break;
      case 0xe:
        iVar10 = FUN_009314dc(param_3);
        if (iVar10 == 0) {
          local_a4 = FUN_00941244(param_3,*(undefined8 *)*param_2,*(undefined8 *)(*param_2 + 8));
          if (local_a4 == 0) {
            if (*(long *)(param_3 + 0xca) == 0) {
              lVar23 = 0;
              lVar17 = *(long *)(param_3 + 0xcc);
              if (lVar17 == 0) goto LAB_0092cb08;
LAB_0092d758:
              lVar17 = FUN_00931f58(*(undefined8 *)(param_3 + 0x2b0),
                                    *(undefined8 *)(param_3 + 0x2e6),lVar17,
                                    *(undefined8 *)(param_3 + 0x2e2),
                                    *(undefined8 *)(param_3 + 0x2e4),*(undefined8 *)*param_2,
                                    *(undefined8 *)(*param_2 + 8));
              if (lVar17 == 0 && lVar23 == 0) {
LAB_0092cb14:
                if (*puVar22 != 0xd) {
                  *puVar22 = 0xd;
                }
                FUN_00931ec4(param_3,*(undefined8 *)*param_2,*(undefined8 *)(*param_2 + 8));
                iVar10 = 0;
                pauVar15 = extraout_x1_04;
                break;
              }
            }
            else {
              lVar23 = FUN_00931f58(*(undefined8 *)(param_3 + 0x2b2),
                                    *(undefined8 *)(param_3 + 0x2e0),*(long *)(param_3 + 0xca),
                                    *(undefined8 *)(param_3 + 0x2dc),
                                    *(undefined8 *)(param_3 + 0x2de),*(undefined8 *)*param_2,
                                    *(undefined8 *)(*param_2 + 8));
              lVar17 = *(long *)(param_3 + 0xcc);
              if (lVar17 != 0) goto LAB_0092d758;
LAB_0092cb08:
              lVar17 = 0;
              if (lVar23 == 0) goto LAB_0092cb14;
            }
            if (lVar17 <= lVar23) {
              lVar17 = lVar23;
            }
            FUN_0092aff8(param_3,lVar17,0xb);
            iVar10 = 0;
            pauVar15 = extraout_x1_21;
            break;
          }
          if (local_a4 != 0x5c) goto LAB_0092d380;
        }
        else {
          local_a4 = 0x2a;
LAB_0092d380:
          if ((*(uint *)(*(long *)(*plVar4 + 0x3a8) + 0x94) >> 1 & 1) == 0) {
            FUN_00908c4c(*plVar4,2);
          }
        }
        FUN_0092b674(param_3,local_a4,1);
        iVar10 = 0;
        pauVar15 = extraout_x1_16;
        break;
      case 0xf:
        if (*plVar4 != 0) {
          if (((*(byte *)(*plVar4 + 0x3a2) >> 6 & 1) != 0) &&
             (*(long **)(param_1 + 0x40) != (long *)0x0)) {
            lVar23 = **(long **)(param_1 + 0x40);
            *(undefined8 *)(lVar23 + 0x10) = 0;
            if (*(long *)(param_1 + 8) == 0) {
              *(undefined8 *)(lVar23 + 0x18) = 0;
              *(long *)(param_1 + 8) = lVar23;
            }
            else {
              lVar17 = *plVar5;
              *(long *)(lVar17 + 0x10) = lVar23;
              *(long *)(lVar23 + 0x18) = lVar17;
            }
            *plVar5 = lVar23;
            if (*(int *)(lVar23 + 0x58) != 3) {
              *(undefined4 *)(lVar23 + 0x58) = 3;
              FUN_009425cc(lVar23);
            }
            FUN_00925d80(lVar21,lVar23 + 0x28,0);
            FUN_0092aff8(lVar23,0,8);
          }
          uVar12 = FUN_0092b674(param_3,local_a4,0);
          pauVar15 = extraout_x1_28;
          if (local_a4 == 0) {
            local_a4 = uVar12;
          }
        }
        if (((*(byte *)(param_3 + 0x4c7) >> 6 & 1) != 0) &&
           (*(char *)(*(long *)(param_3 + 0x4c8) + 0x40) != '\a')) {
          if (*puVar22 != 0) {
            *puVar22 = 0;
          }
          goto LAB_0092d814;
        }
        if (*puVar22 != 0x10) {
          lVar23 = *(long *)(param_3 + 0x30);
          param_3[0x16] = 0x10;
          iVar10 = *(int *)(lVar23 + 0x1c) + -1;
          *(int *)(lVar23 + 0x1c) = iVar10;
          if (iVar10 == 0) {
            (*(code *)PTR_free_00cc4678)(*(undefined8 *)(lVar23 + 0xd8));
            *(undefined8 *)(lVar23 + 0xd8) = 0;
            *(undefined8 *)(lVar23 + 0xe0) = 0;
            *(byte *)(lVar23 + 0x231) = *(byte *)(lVar23 + 0x231) & 0xdf;
            (*(code *)PTR_free_00cc4678)(*(undefined8 *)(lVar23 + 0xe8));
            *(undefined8 *)(lVar23 + 0xe8) = 0;
            *(undefined8 *)(lVar23 + 0xf0) = 0;
            *(byte *)(lVar23 + 0x231) = *(byte *)(lVar23 + 0x231) & 0xbf;
          }
          lVar23 = *plVar4;
          if (lVar23 != 0) {
            FUN_00907e2c(lVar23,param_3);
            FUN_00925d80(lVar23 + 0x3d0,piVar2,0);
          }
          param_3[8] = 0;
          param_3[9] = 0;
          FUN_0092ba18(param_3);
          pauVar15 = extraout_x1_29;
          goto LAB_0092db3c;
        }
        goto LAB_0092dd40;
      default:
        goto switchD_0092ce30_default;
      }
      uVar12 = *puVar22;
joined_r0x0092d2cc:
      if (2 < uVar12) {
LAB_0092db4c:
        uVar16 = uVar12;
        if (iVar10 != -1) {
LAB_0092db54:
          if ((uVar16 < 9) && (iVar10 = 0, (*(byte *)(param_1 + 0x231) >> 1 & 1) == 0)) {
            FUN_0092ddf8(param_3,param_2,local_ac,&local_a4);
            iVar10 = 0;
            pauVar15 = extraout_x1_31;
          }
        }
      }
LAB_0092db80:
      uVar16 = *puVar22;
joined_r0x0092d680:
      if (uVar16 < 0x10) {
joined_r0x0092d81c:
        if (local_a4 == 0) {
          lVar23 = *plVar4;
joined_r0x0092cc88:
          if (lVar23 != 0) {
            iVar11 = FUN_009314dc(param_3);
            pauVar15 = extraout_x1_23;
            if (iVar11 != 0) {
              local_a4 = 0x2a;
              FUN_00908c4c(*plVar4,2);
              uVar16 = *puVar22;
              uVar12 = 0xf;
              if (0xe < uVar16) {
                uVar12 = 0x10;
              }
              pauVar15 = extraout_x1_24;
              if (uVar16 == uVar12) {
                iVar10 = -1;
                goto joined_r0x0092d868;
              }
              *puVar22 = uVar12;
              if (0xe < uVar16) {
                lVar23 = *(long *)(param_3 + 0x30);
                iVar10 = *(int *)(lVar23 + 0x1c) + -1;
                *(int *)(lVar23 + 0x1c) = iVar10;
                if (iVar10 == 0) {
                  (*(code *)PTR_free_00cc4678)(*(undefined8 *)(lVar23 + 0xd8));
                  *(undefined8 *)(lVar23 + 0xd8) = 0;
                  *(undefined8 *)(lVar23 + 0xe0) = 0;
                  *(byte *)(lVar23 + 0x231) = *(byte *)(lVar23 + 0x231) & 0xdf;
                  (*(code *)PTR_free_00cc4678)(*(undefined8 *)(lVar23 + 0xe8));
                  *(undefined8 *)(lVar23 + 0xe8) = 0;
                  *(undefined8 *)(lVar23 + 0xf0) = 0;
                  *(byte *)(lVar23 + 0x231) = *(byte *)(lVar23 + 0x231) & 0xbf;
                  pauVar15 = extraout_x1_25;
                }
              }
              if ((0x11008U >> (ulong)uVar12 & 1) != 0) {
                (**(code **)(&DAT_00c4f8a0 + (ulong)uVar12 * 8))(param_3);
                pauVar15 = extraout_x1_26;
              }
              iVar10 = -1;
            }
          }
        }
        else {
          if (*(long **)(param_1 + 0x40) != (long *)0x0) {
            lVar23 = **(long **)(param_1 + 0x40);
            *(undefined8 *)(lVar23 + 0x10) = 0;
            if (*(long *)(param_1 + 8) == 0) {
              *(undefined8 *)(lVar23 + 0x18) = 0;
              *(long *)(param_1 + 8) = lVar23;
            }
            else {
              lVar17 = *plVar5;
              *(long *)(lVar17 + 0x10) = lVar23;
              *(long *)(lVar23 + 0x18) = lVar17;
            }
            *plVar5 = lVar23;
            if (*(int *)(lVar23 + 0x58) != 3) {
              *(undefined4 *)(lVar23 + 0x58) = 3;
              FUN_009425cc(lVar23);
            }
            FUN_00925d80(lVar21,lVar23 + 0x28,0);
            FUN_0092aff8(lVar23,0,8);
            pauVar15 = extraout_x1_32;
          }
          lVar23 = *plVar4;
          if (lVar23 == 0) {
            uVar12 = *puVar22;
            if (uVar12 == 3) {
              FUN_009321e8(param_3);
              pauVar15 = extraout_x1_34;
              goto LAB_0092dc84;
            }
          }
          else {
            if (local_ac[0] != '\0') {
              bVar9 = local_a4 == 0x1c;
              FUN_00907e2c(lVar23,param_3);
              FUN_00925d80(lVar23 + 0x3d0,piVar2,0);
              param_3[8] = 0;
              param_3[9] = 0;
              FUN_0090fe90(param_3,lVar23,1);
              FUN_00946cfc(param_3,lVar23,bVar9);
              pauVar15 = extraout_x1_33;
            }
LAB_0092dc84:
            uVar12 = *puVar22;
          }
          if (uVar12 == 0x10) {
            iVar10 = -1;
          }
          else {
            lVar23 = *(long *)(param_3 + 0x30);
            param_3[0x16] = 0x10;
            iVar10 = *(int *)(lVar23 + 0x1c) + -1;
            *(int *)(lVar23 + 0x1c) = iVar10;
            if (iVar10 == 0) {
              (*(code *)PTR_free_00cc4678)(*(undefined8 *)(lVar23 + 0xd8));
              *(undefined8 *)(lVar23 + 0xd8) = 0;
              *(undefined8 *)(lVar23 + 0xe0) = 0;
              *(byte *)(lVar23 + 0x231) = *(byte *)(lVar23 + 0x231) & 0xdf;
              (*(code *)PTR_free_00cc4678)(*(undefined8 *)(lVar23 + 0xe8));
              *(undefined8 *)(lVar23 + 0xe8) = 0;
              *(undefined8 *)(lVar23 + 0xf0) = 0;
              *(byte *)(lVar23 + 0x231) = *(byte *)(lVar23 + 0x231) & 0xbf;
            }
            lVar23 = *plVar4;
            if (lVar23 != 0) {
              FUN_00907e2c(lVar23,param_3);
              FUN_00925d80(lVar23 + 0x3d0,piVar2,0);
            }
            param_3[8] = 0;
            param_3[9] = 0;
            FUN_0092ba18(param_3);
            iVar10 = -1;
            pauVar15 = extraout_x1_35;
          }
        }
        uVar16 = *puVar22;
      }
joined_r0x0092d868:
      if (uVar16 == 0x10) {
LAB_0092dd40:
        if (*(code **)(param_3 + 0x290) == (code *)0x0) {
          *(int **)(param_3 + 0x20) = param_3;
          param_3[0x1e] = 1;
          param_3[0x22] = local_a4;
          FUN_00925d10(param_1 + 0x20,param_3 + 0x18,param_3 + 0x18);
        }
        else {
          (**(code **)(param_3 + 0x290))(param_3,local_a4);
        }
        if (*puVar22 != 0x11) {
          *puVar22 = 0x11;
        }
        FUN_00925d10(param_1 + 0x60,param_3,param_3 + 10);
        lVar21 = *(long *)(param_3 + 4);
        lVar23 = *(long *)(param_3 + 6);
        if (lVar23 == 0) {
          *(long *)(param_1 + 8) = lVar21;
        }
        else {
          *(long *)(lVar23 + 0x10) = lVar21;
          lVar21 = *plVar1;
        }
        if (lVar21 != 0) {
          plVar5 = (long *)(lVar21 + 0x18);
        }
        uVar14 = 0;
        *plVar5 = lVar23;
        *plVar1 = 0;
        param_3[6] = 0;
        param_3[7] = 0;
        goto LAB_0092c83c;
      }
    } while ((iVar10 == -1) || ((*(byte *)(param_1 + 0x231) >> 1 & 1) != 0));
    uVar14 = 0;
    param_3[0x17] = local_a4;
  }
LAB_0092c83c:
  if (*(long *)(lVar8 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar14);
  }
  return;
}

