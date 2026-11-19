/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0092f878
 */

ulong FUN_0092f878(byte *param_1,long param_2,long param_3,long param_4)

{
  uint *puVar1;
  int *piVar2;
  long *plVar3;
  byte bVar4;
  long lVar5;
  int iVar6;
  long lVar7;
  long lVar8;
  char *pcVar9;
  void *pvVar10;
  undefined4 uVar11;
  long lVar12;
  undefined8 uVar13;
  byte *pbVar14;
  uint uVar15;
  byte *pbVar16;
  uint uVar17;
  ulong uVar18;
  ulong uVar19;
  int *piVar20;
  long local_c0;
  char *local_b8;
  byte local_ac [4];
  long local_a8;
  
  lVar5 = tpidr_el0;
  local_a8 = *(long *)(lVar5 + 0x28);
  uVar18 = param_3 * param_2;
  piVar20 = (int *)**(undefined8 **)(*(long *)(param_4 + 0x1320) + 0x30);
  if (piVar20[3] == 0) {
    if ((uVar18 == 0) || (*piVar20 != 0)) {
      if (uVar18 == 0) goto LAB_009306b4;
    }
    else {
      iVar6 = 1;
      if (*param_1 < 0x3a) {
        iVar6 = 2;
      }
      if (*param_1 < 0x30) {
        iVar6 = 1;
      }
      *piVar20 = iVar6;
    }
    puVar1 = (uint *)(piVar20 + 6);
    piVar2 = piVar20 + 2;
    uVar19 = 0;
    plVar3 = (long *)(piVar20 + 4);
    do {
      local_ac[0] = param_1[uVar19];
      lVar7 = *plVar3;
      if (lVar7 == 0) {
        lVar7 = FUN_00930850();
        *plVar3 = lVar7;
        if (lVar7 != 0) {
          piVar20[8] = 0;
          piVar20[9] = 0;
          piVar20[6] = 0;
          FUN_00904528(lVar7 + 0x98,10000);
          lVar7 = *(long *)(piVar20 + 4);
          goto LAB_0092f9b0;
        }
LAB_00930680:
        iVar6 = 0x1b;
        goto LAB_0093069c;
      }
LAB_0092f9b0:
      lVar12 = lVar7 + 0x98;
      iVar6 = FUN_009045fc(lVar12,local_ac,1);
      if (iVar6 != 0) goto LAB_00930680;
      lVar8 = FUN_00904984(lVar12);
      pcVar9 = (char *)FUN_00904974(lVar12);
      if (*piVar20 == 2) {
        switch(piVar20[1]) {
        case 0:
          uVar17 = *puVar1 + 1;
          *puVar1 = uVar17;
          if (uVar17 < 9) {
            if ((ulong)local_ac[0] < 0x40) {
              pvVar10 = (void *)(1L << ((ulong)local_ac[0] & 0x3f) & 0x3ff200000000001);
joined_r0x0092fab0:
              if (pvVar10 != (void *)0x0) break;
            }
          }
          else if ((uVar17 == 9) && (local_ac[0] == 0x20)) {
            piVar20[1] = 1;
            piVar20[2] = 0;
            break;
          }
          goto switchD_0092fce0_caseD_2e;
        case 1:
          uVar17 = *puVar1;
          *puVar1 = uVar17 + 1;
          if (*piVar2 == 1) {
            if (local_ac[0] != 0x20) {
              pvVar10 = memchr("APM0123456789:",(uint)local_ac[0],0xf);
              goto joined_r0x0092fab0;
            }
            *(long *)(piVar20 + 0x10) = *(long *)(piVar20 + 8);
            pcVar9[*(long *)(piVar20 + 8) + (ulong)(uVar17 + 1) + -1] = '\0';
            piVar20[1] = 2;
            piVar20[2] = 0;
            piVar20[6] = 0;
          }
          else if (((*piVar2 == 0) && (local_ac[0] != 9)) && (local_ac[0] != 0x20)) {
LAB_009302f8:
            *piVar2 = 1;
          }
          break;
        case 2:
          iVar6 = *piVar2;
          if (iVar6 != 1) goto LAB_0092fe70;
          uVar17 = *puVar1;
          *puVar1 = uVar17 + 1;
          if (local_ac[0] == 0x20) {
            pcVar9[*(long *)(piVar20 + 8) + (ulong)(uVar17 + 1) + -1] = '\0';
            lVar12 = *(long *)(piVar20 + 8);
            iVar6 = strcmp("<DIR>",pcVar9 + lVar12);
            if (iVar6 == 0) {
              *(undefined4 *)(lVar7 + 8) = 1;
              *(undefined8 *)(lVar7 + 0x28) = 0;
              lVar7 = *plVar3;
            }
            else {
              iVar6 = FUN_00941b6c(pcVar9 + lVar12,&local_b8,10,lVar7 + 0x28);
              if (iVar6 != 0) goto switchD_0092fce0_caseD_2e;
              lVar7 = *plVar3;
              *(undefined4 *)(lVar7 + 8) = 0;
            }
            *(uint *)(lVar7 + 0x60) = *(uint *)(lVar7 + 0x60) | 0x40;
LAB_00930630:
            piVar20[6] = 0;
            piVar20[1] = 3;
            piVar20[2] = 0;
          }
          break;
        case 3:
          iVar6 = *piVar2;
          if (iVar6 == 2) {
            if (local_ac[0] != 10) goto switchD_0092fce0_caseD_2e;
            *(undefined8 *)(piVar20 + 10) = *(undefined8 *)(piVar20 + 8);
          }
          else {
            if (iVar6 != 1) goto LAB_0092fe70;
            *puVar1 = *puVar1 + 1;
            if (local_ac[0] != 10) {
              if (local_ac[0] == 0xd) {
                *piVar2 = 2;
                pcVar9[lVar8 + -1] = '\0';
              }
              break;
            }
            *(undefined8 *)(piVar20 + 10) = *(undefined8 *)(piVar20 + 8);
            pcVar9[lVar8 + -1] = '\0';
          }
          FUN_009306fc(param_4,lVar7);
          piVar20[1] = 0;
          piVar20[2] = 0;
        }
        goto switchD_0092fa10_default;
      }
      if (*piVar20 != 1) {
        uVar18 = uVar18 + 1;
        goto LAB_009306a0;
      }
      switch(piVar20[1]) {
      case 0:
        if (*piVar2 == 1) {
          uVar17 = *puVar1;
          *puVar1 = uVar17 + 1;
          if (local_ac[0] == 10) {
            pcVar9[uVar17] = '\0';
            iVar6 = strncmp("total ",pcVar9,6);
            if (iVar6 == 0) {
              pbVar14 = (byte *)(pcVar9 + 7);
              for (pbVar16 = (byte *)(pcVar9 + 6); (bVar4 = *pbVar16, bVar4 == 9 || (bVar4 == 0x20))
                  ; pbVar16 = pbVar16 + 1) {
                pbVar14 = pbVar14 + 1;
              }
              while (bVar4 - 0x30 < 10) {
                bVar4 = *pbVar14;
                pbVar14 = pbVar14 + 1;
              }
              if (bVar4 == 0) {
                piVar20[1] = 1;
                FUN_0090456c(lVar12);
                break;
              }
            }
            goto switchD_0092fce0_caseD_2e;
          }
          if (local_ac[0] == 0xd) {
            *puVar1 = uVar17;
            FUN_0090498c(lVar12,lVar8 + -1);
          }
          break;
        }
        if (*piVar2 != 0) break;
        if (local_ac[0] == 0x74) {
          *piVar2 = 1;
          *puVar1 = *puVar1 + 1;
          break;
        }
        piVar20[1] = 1;
        FUN_0090456c(lVar12);
        goto joined_r0x009300a0;
      case 1:
        uVar11 = 0;
        switch(local_ac[0]) {
        case 0x2d:
          break;
        default:
          goto switchD_0092fce0_caseD_2e;
        case 0x44:
          uVar11 = 7;
          break;
        case 0x62:
          uVar11 = 3;
          break;
        case 99:
          uVar11 = 4;
          break;
        case 100:
          uVar11 = 1;
          break;
        case 0x6c:
          uVar11 = 2;
          break;
        case 0x70:
          uVar11 = 5;
          break;
        case 0x73:
          uVar11 = 6;
        }
        *(undefined4 *)(lVar7 + 8) = uVar11;
        piVar20[1] = 2;
        piVar20[6] = 0;
        piVar20[8] = 1;
        piVar20[9] = 0;
        break;
      case 2:
        uVar17 = *puVar1 + 1;
        *puVar1 = uVar17;
        if (uVar17 < 10) {
          pvVar10 = memchr("rwx-tTsS",(uint)local_ac[0],9);
          goto joined_r0x0092fab0;
        }
        if (uVar17 == 10) {
          if (local_ac[0] == 0x20) {
            pcVar9[10] = '\0';
            lVar7 = *(long *)(piVar20 + 8);
            pcVar9 = pcVar9 + lVar7;
            uVar17 = 0;
            if (*pcVar9 != '-') {
              uVar17 = 0x1000000;
            }
            uVar15 = 0x100;
            if (*pcVar9 != 'r') {
              uVar15 = uVar17;
            }
            if (pcVar9[1] != '-') {
              if (pcVar9[1] == 'w') {
                uVar15 = uVar15 | 0x80;
              }
              else {
                uVar15 = uVar15 | 0x1000000;
              }
            }
            bVar4 = pcVar9[2];
            if (bVar4 < 0x73) {
              if (bVar4 != 0x2d) {
                if (bVar4 == 0x53) {
                  uVar15 = uVar15 | 0x800;
                }
                else {
LAB_009304ec:
                  uVar15 = uVar15 | 0x1000000;
                }
              }
            }
            else if (bVar4 == 0x73) {
              uVar15 = uVar15 | 0x840;
            }
            else {
              if (bVar4 != 0x78) goto LAB_009304ec;
              uVar15 = uVar15 | 0x40;
            }
            if (pcVar9[3] != '-') {
              if (pcVar9[3] == 'r') {
                uVar15 = uVar15 | 0x20;
              }
              else {
                uVar15 = uVar15 | 0x1000000;
              }
            }
            if (pcVar9[4] != '-') {
              if (pcVar9[4] == 'w') {
                uVar15 = uVar15 | 0x10;
              }
              else {
                uVar15 = uVar15 | 0x1000000;
              }
            }
            bVar4 = pcVar9[5];
            if (bVar4 < 0x73) {
              if (bVar4 != 0x2d) {
                if (bVar4 == 0x53) {
                  uVar15 = uVar15 | 0x400;
                }
                else {
LAB_00930578:
                  uVar15 = uVar15 | 0x1000000;
                }
              }
            }
            else if (bVar4 == 0x73) {
              uVar15 = uVar15 | 0x408;
            }
            else {
              if (bVar4 != 0x78) goto LAB_00930578;
              uVar15 = uVar15 | 8;
            }
            if (pcVar9[6] != '-') {
              if (pcVar9[6] == 'r') {
                uVar15 = uVar15 | 4;
              }
              else {
                uVar15 = uVar15 | 0x1000000;
              }
            }
            if (pcVar9[7] != '-') {
              if (pcVar9[7] == 'w') {
                uVar15 = uVar15 | 2;
              }
              else {
                uVar15 = uVar15 | 0x1000000;
              }
            }
            bVar4 = pcVar9[8];
            if (bVar4 < 0x74) {
              uVar17 = uVar15;
              if (bVar4 != 0x2d) {
                if (bVar4 == 0x54) {
                  uVar17 = uVar15 | 0x200;
                }
                else {
LAB_00930610:
                  uVar17 = uVar15 | 0x1000000;
                  uVar15 = uVar17;
                }
              }
            }
            else if (bVar4 == 0x74) {
              uVar17 = uVar15 | 0x201;
            }
            else {
              if (bVar4 != 0x78) goto LAB_00930610;
              uVar17 = uVar15 | 1;
            }
            if (uVar15 >> 0x18 == 0) {
              lVar12 = *(long *)(piVar20 + 4);
              *(uint *)(lVar12 + 0x18) = uVar17;
              *(uint *)(lVar12 + 0x60) = *(uint *)(lVar12 + 0x60) | 8;
              *(long *)(piVar20 + 0x12) = lVar7;
              goto LAB_00930630;
            }
          }
          goto switchD_0092fce0_caseD_2e;
        }
        break;
      case 3:
        iVar6 = *piVar2;
        if (iVar6 == 1) {
          uVar17 = *puVar1;
          *puVar1 = uVar17 + 1;
          if (local_ac[0] == 0x20) {
            pcVar9[*(long *)(piVar20 + 8) + (ulong)(uVar17 + 1) + -1] = '\0';
            lVar7 = strtol(pcVar9 + *(long *)(piVar20 + 8),&local_b8,10);
            if ((1 < lVar7 + 0x8000000000000001U) && (*local_b8 == '\0')) {
              lVar12 = *plVar3;
              *(long *)(lVar12 + 0x30) = lVar7;
              *(uint *)(lVar12 + 0x60) = *(uint *)(lVar12 + 0x60) | 0x80;
            }
            piVar20[6] = 0;
            piVar20[8] = 0;
            piVar20[9] = 0;
            piVar20[1] = 4;
            piVar20[2] = 0;
          }
          else {
LAB_00930014:
            if (9 < local_ac[0] - 0x30) goto switchD_0092fce0_caseD_2e;
          }
        }
        else {
LAB_0092fe38:
          if ((iVar6 == 0) && (local_ac[0] != 0x20)) {
            if (local_ac[0] - 0x30 < 10) goto LAB_0092fe80;
            goto switchD_0092fce0_caseD_2e;
          }
        }
        break;
      case 4:
        iVar6 = *piVar2;
        if (iVar6 == 1) {
          uVar17 = *puVar1;
          *puVar1 = uVar17 + 1;
          if (local_ac[0] == 0x20) {
            pcVar9[*(long *)(piVar20 + 8) + (ulong)(uVar17 + 1) + -1] = '\0';
            uVar13 = *(undefined8 *)(piVar20 + 8);
            piVar20[1] = 5;
            piVar20[2] = 0;
            piVar20[8] = 0;
            piVar20[9] = 0;
            piVar20[6] = 0;
            *(undefined8 *)(piVar20 + 0xc) = uVar13;
          }
        }
        else {
LAB_0092fe70:
          if (iVar6 == 0) goto switchD_0092fc54_caseD_0;
        }
        break;
      case 5:
        iVar6 = *piVar2;
        if (iVar6 != 1) goto LAB_0092fe70;
        uVar17 = *puVar1;
        *puVar1 = uVar17 + 1;
        if (local_ac[0] == 0x20) {
          pcVar9[*(long *)(piVar20 + 8) + (ulong)(uVar17 + 1) + -1] = '\0';
          uVar13 = *(undefined8 *)(piVar20 + 8);
          piVar20[1] = 6;
          piVar20[2] = 0;
          piVar20[8] = 0;
          piVar20[9] = 0;
          piVar20[6] = 0;
          *(undefined8 *)(piVar20 + 0xe) = uVar13;
        }
        break;
      case 6:
        iVar6 = *piVar2;
        if (iVar6 != 1) goto LAB_0092fe38;
        uVar17 = *puVar1;
        *puVar1 = uVar17 + 1;
        if (local_ac[0] != 0x20) goto LAB_00930014;
        pcVar9[*(long *)(piVar20 + 8) + (ulong)(uVar17 + 1) + -1] = '\0';
        iVar6 = FUN_00941b6c(pcVar9 + *(long *)(piVar20 + 8),&local_b8,10,&local_c0);
        if (iVar6 == 0) {
          if ((*local_b8 == '\0') && (1 < local_c0 + 0x8000000000000001U)) {
            lVar7 = *plVar3;
            *(long *)(lVar7 + 0x28) = local_c0;
            *(uint *)(lVar7 + 0x60) = *(uint *)(lVar7 + 0x60) | 0x40;
          }
          piVar20[6] = 0;
          piVar20[8] = 0;
          piVar20[9] = 0;
          piVar20[1] = 7;
          piVar20[2] = 0;
        }
        break;
      case 7:
        switch(*piVar2) {
        case 0:
          if (local_ac[0] != 0x20) {
            if ((0x19 < (byte)((local_ac[0] & 0xdf) + 0xbf)) && (9 < (byte)(local_ac[0] - 0x30)))
            goto switchD_0092fce0_caseD_2e;
            goto LAB_0092fe80;
          }
          break;
        case 1:
          *puVar1 = *puVar1 + 1;
          if (local_ac[0] == 0x20) {
LAB_009300c4:
            *piVar2 = 2;
          }
          else {
LAB_00930134:
            uVar17 = (uint)local_ac[0];
            if ((((9 < uVar17 - 0x30) && (0x19 < (uVar17 - 0x61 & 0xff))) && (uVar17 != 0x2e)) &&
               (0x19 < (uVar17 - 0x41 & 0xff))) goto switchD_0092fce0_caseD_2e;
          }
          break;
        case 2:
          *puVar1 = *puVar1 + 1;
          if (local_ac[0] != 0x20) {
            if (((byte)((local_ac[0] & 0xdf) + 0xbf) < 0x1a) || ((byte)(local_ac[0] - 0x30) < 10))
            goto LAB_009302bc;
            goto switchD_0092fce0_caseD_2e;
          }
          break;
        case 3:
          *puVar1 = *puVar1 + 1;
          if (local_ac[0] != 0x20) goto LAB_00930134;
LAB_00930308:
          *piVar2 = 4;
          break;
        case 4:
          *puVar1 = *puVar1 + 1;
          if (local_ac[0] != 0x20) {
            if ((0x19 < (byte)((local_ac[0] & 0xdf) + 0xbf)) && (9 < (byte)(local_ac[0] - 0x30)))
            goto switchD_0092fce0_caseD_2e;
            *piVar2 = 5;
          }
          break;
        case 5:
          uVar17 = *puVar1;
          *puVar1 = uVar17 + 1;
          if (local_ac[0] == 0x20) {
            pcVar9[*(long *)(piVar20 + 8) + (ulong)(uVar17 + 1) + -1] = '\0';
            *(undefined8 *)(piVar20 + 0x10) = *(undefined8 *)(piVar20 + 8);
            if (*(int *)(lVar7 + 8) == 2) {
              piVar20[1] = 9;
              piVar20[2] = 0;
            }
            else {
              piVar20[1] = 8;
              piVar20[2] = 0;
            }
          }
          else if ((((0x19 < (byte)((local_ac[0] & 0xdf) + 0xbf)) &&
                    (9 < (byte)(local_ac[0] - 0x30))) && (local_ac[0] != 0x2e)) &&
                  (local_ac[0] != 0x3a)) goto switchD_0092fce0_caseD_2e;
        }
        break;
      case 8:
        iVar6 = *piVar2;
        if (iVar6 == 2) {
          if (local_ac[0] != 10) goto switchD_0092fce0_caseD_2e;
          lVar12 = *(long *)(piVar20 + 8) + (ulong)(uint)piVar20[6];
LAB_00930418:
          pcVar9[lVar12 + -1] = '\0';
          *(undefined8 *)(piVar20 + 10) = *(undefined8 *)(piVar20 + 8);
          piVar20[1] = 1;
          FUN_009306fc(param_4,lVar7);
        }
        else {
          if (iVar6 != 1) goto LAB_0092fe70;
          uVar17 = *puVar1;
          *puVar1 = uVar17 + 1;
          if (local_ac[0] == 10) {
            lVar12 = *(long *)(piVar20 + 8) + (ulong)(uVar17 + 1);
            goto LAB_00930418;
          }
          if (local_ac[0] == 0xd) goto LAB_009300c4;
        }
        break;
      case 9:
        switch(*piVar2) {
        case 0:
switchD_0092fc54_caseD_0:
          if (local_ac[0] != 0x20) {
LAB_0092fe80:
            piVar20[6] = 1;
            *(long *)(piVar20 + 8) = lVar8 + -1;
            piVar20[2] = 1;
          }
          break;
        case 1:
          *puVar1 = *puVar1 + 1;
          if (local_ac[0] == 0x20) goto LAB_009300c4;
          if ((local_ac[0] == 10) || (local_ac[0] == 0xd)) goto switchD_0092fce0_caseD_2e;
          break;
        case 2:
          *puVar1 = *puVar1 + 1;
          if (local_ac[0] != 0x2d) goto LAB_009302e8;
LAB_009302bc:
          *piVar2 = 3;
          break;
        case 3:
          *puVar1 = *puVar1 + 1;
          if (local_ac[0] == 0x3e) goto LAB_00930308;
LAB_009302e8:
          if (local_ac[0] != 10) {
joined_r0x00930298:
            if (local_ac[0] != 0xd) goto LAB_009302f8;
          }
          goto switchD_0092fce0_caseD_2e;
        case 4:
          uVar17 = *puVar1;
          *puVar1 = uVar17 + 1;
          if (local_ac[0] != 0x20) {
            if (local_ac[0] == 10) goto switchD_0092fce0_caseD_2e;
            goto joined_r0x00930298;
          }
          piVar20[2] = 5;
          pcVar9[*(long *)(piVar20 + 8) + (ulong)(uVar17 + 1) + -4] = '\0';
          uVar13 = *(undefined8 *)(piVar20 + 8);
          piVar20[6] = 0;
          piVar20[8] = 0;
          piVar20[9] = 0;
          *(undefined8 *)(piVar20 + 10) = uVar13;
          break;
        case 5:
          if ((local_ac[0] == 10) || (local_ac[0] == 0xd)) goto switchD_0092fce0_caseD_2e;
          piVar20[2] = 6;
          *(long *)(piVar20 + 8) = lVar8 + -1;
          piVar20[6] = 1;
          break;
        case 6:
          uVar17 = *puVar1;
          *puVar1 = uVar17 + 1;
          if (local_ac[0] == 10) {
            lVar12 = *(long *)(piVar20 + 8) + (ulong)(uVar17 + 1);
LAB_00930650:
            pcVar9[lVar12 + -1] = '\0';
            *(undefined8 *)(piVar20 + 0x14) = *(undefined8 *)(piVar20 + 8);
            FUN_009306fc(param_4,lVar7);
            piVar20[1] = 1;
          }
          else if (local_ac[0] == 0xd) {
            *piVar2 = 7;
          }
          break;
        case 7:
          if (local_ac[0] == 10) {
            lVar12 = *(long *)(piVar20 + 8) + (ulong)(uint)piVar20[6];
            goto LAB_00930650;
          }
switchD_0092fce0_caseD_2e:
          iVar6 = 0x57;
LAB_0093069c:
          piVar20[3] = iVar6;
LAB_009306a0:
          lVar7 = *plVar3;
          goto joined_r0x0092f8dc;
        }
      }
switchD_0092fa10_default:
      uVar19 = uVar19 + 1;
joined_r0x009300a0:
    } while (uVar19 < uVar18);
  }
  else {
    lVar7 = *(long *)(piVar20 + 4);
joined_r0x0092f8dc:
    if (lVar7 != 0) {
      FUN_00930868();
      piVar20[4] = 0;
      piVar20[5] = 0;
    }
  }
LAB_009306b4:
  if (*(long *)(lVar5 + 0x28) != local_a8) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return uVar18;
}

