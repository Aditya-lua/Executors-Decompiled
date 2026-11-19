/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c2d520
 */

undefined8
FUN_00c2d520(undefined8 param_1,long *param_2,long *param_3,long param_4,int param_5,
            undefined4 *param_6)

{
  byte *pbVar1;
  byte bVar2;
  byte bVar3;
  undefined8 *puVar4;
  undefined4 uVar5;
  long lVar6;
  char *__ptr;
  size_t __size;
  uint uVar7;
  byte *pbVar8;
  ulong uVar9;
  byte *pbVar10;
  long lVar11;
  int iVar12;
  ulong uVar13;
  ulong uVar14;
  ulong uVar15;
  ulong uVar16;
  undefined8 *puVar17;
  ulong uVar18;
  long lVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined1 auStack_700 [8];
  undefined8 *local_6f8;
  undefined8 *puStack_6f0;
  undefined8 local_6e8;
  long *local_6e0;
  int local_6d4;
  undefined8 *local_6d0;
  undefined1 *local_6c8;
  undefined1 auStack_6a8 [544];
  undefined8 local_488 [125];
  byte *local_a0;
  ulong local_98 [7];
  
  puVar4 = (undefined8 *)auStack_700;
  lVar19 = 0;
  local_98[0] = param_3[2];
  local_98[1] = param_3[1] + *param_3;
  local_98[2] = 0xffffffffffffffff;
  local_98[3] = param_2[2];
  local_6d4 = param_5;
  local_6e8 = param_1;
  local_6e0 = param_2;
  local_98[4] = param_2[1] + *param_2;
  local_98[5] = param_4 - param_2[3];
  local_6d0 = (undefined8 *)0x0;
  local_6c8 = auStack_6a8;
  local_6f8 = local_488;
  puStack_6f0 = (undefined8 *)(param_6 + 0x8e);
  do {
    local_a0 = *(byte **)((long)local_98 + lVar19);
    pbVar1 = *(byte **)((long)local_98 + lVar19 + 8);
    uVar15 = *(ulong *)((long)local_98 + lVar19 + 0x10);
    if (local_a0 < pbVar1 && uVar15 != 0) {
      uVar16 = 0;
      pbVar10 = local_a0;
      do {
        puVar17 = local_6d0;
        pbVar8 = pbVar10 + 1;
        bVar2 = *pbVar10;
        local_a0 = pbVar8;
        switch((ulong)bVar2) {
        case 0:
          break;
        case 1:
          uVar16 = FUN_00c2e33c(local_6e8,&local_a0,pbVar1,(char)param_3[3],0);
          break;
        case 2:
          uVar7 = (uint)pbVar10[1];
          iVar12 = (int)param_3[5];
          local_a0 = pbVar10 + 2;
          goto LAB_00c2da58;
        case 3:
          uVar7 = (uint)*(ushort *)(pbVar10 + 1);
          iVar12 = (int)param_3[5];
          local_a0 = pbVar10 + 3;
          goto LAB_00c2da58;
        case 4:
          uVar7 = *(uint *)(pbVar10 + 1);
          iVar12 = (int)param_3[5];
          local_a0 = pbVar10 + 5;
LAB_00c2da58:
          uVar16 = uVar16 + iVar12 * uVar7;
          break;
        case 5:
          uVar18 = FUN_00c2e6c8(&local_a0,pbVar1);
          lVar6 = FUN_00c2e6c8(&local_a0,pbVar1);
          if (0x5f < uVar18) {
            __ptr = "libunwind: malformed DW_CFA_offset_extended DWARF unwind, reg too big\n";
            __size = 0x46;
            goto LAB_00c2dee8;
          }
          puVar17 = (undefined8 *)(param_6 + uVar18 * 4 + 6);
          lVar11 = (long)*(int *)((long)param_3 + 0x2c);
          if ((*(byte *)((long)puVar17 + 4) & 1) == 0) {
            uVar20 = *puVar17;
            *(undefined1 *)((long)puVar17 + 4) = 1;
            *(undefined8 *)((long)(local_6c8 + uVar18 * 0x10) + 8) = puVar17[1];
            *(undefined8 *)(local_6c8 + uVar18 * 0x10) = uVar20;
          }
LAB_00c2dd40:
          lVar6 = lVar6 * lVar11;
LAB_00c2dd44:
          uVar5 = 2;
          goto LAB_00c2dd48;
        case 6:
          uVar18 = FUN_00c2e6c8(&local_a0,pbVar1);
          if (0x5f < uVar18) {
            __ptr = "libunwind: malformed DW_CFA_restore_extended DWARF unwind, reg too big\n";
LAB_00c2de54:
            __size = 0x47;
            goto LAB_00c2dee8;
          }
          puVar17 = (undefined8 *)(param_6 + uVar18 * 4 + 6);
          if (*(char *)((long)puVar17 + 4) == '\x01') {
            uVar21 = *(undefined8 *)((long)(local_6c8 + uVar18 * 0x10) + 8);
            uVar20 = *(undefined8 *)(local_6c8 + uVar18 * 0x10);
LAB_00c2dcf4:
            puVar17[1] = uVar21;
            *puVar17 = uVar20;
          }
          break;
        case 7:
          uVar18 = FUN_00c2e6c8(&local_a0,pbVar1);
          if (0x5f < uVar18) {
            __ptr = "libunwind: malformed DW_CFA_undefined DWARF unwind, reg too big\n";
LAB_00c2dedc:
            __size = 0x40;
            goto LAB_00c2dee8;
          }
          puVar17 = (undefined8 *)(param_6 + uVar18 * 4 + 6);
          if ((*(byte *)((long)puVar17 + 4) & 1) == 0) {
            uVar20 = *puVar17;
            *(undefined1 *)((long)puVar17 + 4) = 1;
            *(undefined8 *)((long)(local_6c8 + uVar18 * 0x10) + 8) = puVar17[1];
            *(undefined8 *)(local_6c8 + uVar18 * 0x10) = uVar20;
          }
          *(undefined4 *)puVar17 = 1;
          break;
        case 8:
          uVar18 = FUN_00c2e6c8(&local_a0,pbVar1);
          if (0x5f < uVar18) {
            __ptr = "libunwind: malformed DW_CFA_same_value DWARF unwind, reg too big\n";
LAB_00c2dec0:
            __size = 0x41;
            goto LAB_00c2dee8;
          }
          puVar17 = (undefined8 *)(param_6 + uVar18 * 4 + 6);
          if ((*(byte *)((long)puVar17 + 4) & 1) == 0) {
            uVar20 = *puVar17;
            *(undefined1 *)((long)puVar17 + 4) = 1;
            *(undefined8 *)((long)(local_6c8 + uVar18 * 0x10) + 8) = puVar17[1];
            *(undefined8 *)(local_6c8 + uVar18 * 0x10) = uVar20;
          }
          *(undefined4 *)puVar17 = 0;
          break;
        case 9:
          uVar18 = FUN_00c2e6c8(&local_a0,pbVar1);
          uVar13 = FUN_00c2e6c8(&local_a0,pbVar1);
          if (0x5f < uVar18) {
            __ptr = "libunwind: malformed DW_CFA_register DWARF unwind, reg too big\n";
            __size = 0x3f;
            goto LAB_00c2dee8;
          }
          if (0x5f < uVar13) {
            __ptr = "libunwind: malformed DW_CFA_register DWARF unwind, reg2 too big\n";
            goto LAB_00c2dedc;
          }
          puVar17 = (undefined8 *)(param_6 + uVar18 * 4 + 6);
          if ((*(byte *)((long)puVar17 + 4) & 1) == 0) {
            uVar20 = *puVar17;
            *(undefined1 *)((long)puVar17 + 4) = 1;
            *(undefined8 *)((long)(local_6c8 + uVar18 * 0x10) + 8) = puVar17[1];
            *(undefined8 *)(local_6c8 + uVar18 * 0x10) = uVar20;
          }
          puVar17[1] = uVar13;
          *(undefined4 *)puVar17 = 5;
          break;
        case 10:
          puVar17 = (undefined8 *)((long)puVar4 + -0x630);
          *puVar17 = local_6d0;
          memcpy((undefined1 *)((long)puVar4 + -0x628),param_6,0x620);
          local_6d0 = puVar17;
          puVar4 = puVar17;
          break;
        case 0xb:
          if (local_6d0 == (undefined8 *)0x0) {
            return 0;
          }
          memcpy(param_6,local_6d0 + 1,0x620);
          local_6d0 = (undefined8 *)*puVar17;
          break;
        case 0xc:
          uVar18 = FUN_00c2e6c8(&local_a0,pbVar1);
          uVar5 = FUN_00c2e6c8(&local_a0,pbVar1);
          if (0x5f < uVar18) {
            __ptr = "libunwind: malformed DW_CFA_def_cfa DWARF unwind, reg too big\n";
            __size = 0x3e;
            goto LAB_00c2dee8;
          }
          *param_6 = (int)uVar18;
          param_6[1] = uVar5;
          break;
        case 0xd:
          uVar18 = FUN_00c2e6c8(&local_a0,pbVar1);
          if (0x5f < uVar18) {
            __ptr = "libunwind: malformed DW_CFA_def_cfa_register DWARF unwind, reg too big\n";
            goto LAB_00c2de54;
          }
          *param_6 = (int)uVar18;
          break;
        case 0xe:
          uVar5 = FUN_00c2e6c8(&local_a0,pbVar1);
          param_6[1] = uVar5;
          break;
        case 0xf:
          *param_6 = 0;
          *(byte **)(param_6 + 2) = pbVar8;
          goto LAB_00c2dbf8;
        case 0x10:
          uVar18 = FUN_00c2e6c8(&local_a0,pbVar1);
          if (0x5f < uVar18) {
            __ptr = "libunwind: malformed DW_CFA_expression DWARF unwind, reg too big\n";
            goto LAB_00c2dec0;
          }
          puVar17 = (undefined8 *)(param_6 + uVar18 * 4 + 6);
          if ((*(byte *)((long)puVar17 + 4) & 1) == 0) {
            uVar20 = *puVar17;
            *(undefined1 *)((long)puVar17 + 4) = 1;
            *(undefined8 *)((long)(local_6c8 + uVar18 * 0x10) + 8) = puVar17[1];
            *(undefined8 *)(local_6c8 + uVar18 * 0x10) = uVar20;
          }
          uVar5 = 6;
LAB_00c2dbf0:
          *(undefined4 *)puVar17 = uVar5;
          puVar17[1] = local_a0;
LAB_00c2dbf8:
          lVar6 = FUN_00c2e6c8(&local_a0,pbVar1);
          local_a0 = local_a0 + lVar6;
          break;
        case 0x11:
          uVar18 = FUN_00c2e6c8(&local_a0,pbVar1);
          if (0x5f < uVar18) {
            __ptr = "libunwind: malformed DW_CFA_offset_extended_sf DWARF unwind, reg too big\n";
            __size = 0x49;
            goto LAB_00c2dee8;
          }
          uVar9 = 0;
          uVar13 = 0xfffffffffffffff9;
          pbVar10 = local_a0;
          pbVar8 = local_a0;
          do {
            if (pbVar8 == pbVar1) {
              fprintf((FILE *)sched_yield,"libunwind: %s - %s\n","getSLEB128",
                      "truncated sleb128 expression");
              fflush((FILE *)sched_yield);
                    /* WARNING: Subroutine does not return */
              abort();
            }
            bVar2 = *pbVar8;
            uVar13 = uVar13 + 7;
            pbVar10 = pbVar10 + 1;
            uVar9 = ((ulong)bVar2 & 0x7f) << (uVar13 & 0x3f) | uVar9;
            pbVar8 = pbVar8 + 1;
          } while ((char)bVar2 < '\0');
          puVar17 = (undefined8 *)(param_6 + uVar18 * 4 + 6);
          local_a0 = pbVar10;
          uVar14 = -1L << ((ulong)((int)uVar13 + 7) & 0x3f);
          iVar12 = *(int *)((long)param_3 + 0x2c);
          if (0x38 < uVar13 || bVar2 < 0x40) {
            uVar14 = 0;
          }
          if ((*(byte *)((long)puVar17 + 4) & 1) == 0) {
            uVar20 = *puVar17;
            *(undefined1 *)((long)puVar17 + 4) = 1;
            *(undefined8 *)((long)(local_6c8 + uVar18 * 0x10) + 8) = puVar17[1];
            *(undefined8 *)(local_6c8 + uVar18 * 0x10) = uVar20;
          }
          uVar9 = uVar9 | uVar14;
          uVar5 = 2;
LAB_00c2dba0:
          *(undefined4 *)puVar17 = uVar5;
          puVar17[1] = uVar9 * (long)iVar12;
          break;
        case 0x12:
          uVar13 = FUN_00c2e6c8(&local_a0,pbVar1);
          uVar9 = 0;
          uVar18 = 0xfffffffffffffff9;
          pbVar10 = local_a0;
          pbVar8 = local_a0;
          do {
            uVar14 = uVar18;
            if (pbVar8 == pbVar1) {
              fprintf((FILE *)sched_yield,"libunwind: %s - %s\n","getSLEB128",
                      "truncated sleb128 expression");
              fflush((FILE *)sched_yield);
                    /* WARNING: Subroutine does not return */
              abort();
            }
            bVar2 = *pbVar8;
            uVar18 = uVar14 + 7;
            pbVar10 = pbVar10 + 1;
            uVar9 = ((ulong)bVar2 & 0x7f) << (uVar18 & 0x3f) | uVar9;
            pbVar8 = pbVar8 + 1;
          } while ((char)bVar2 < '\0');
          local_a0 = pbVar10;
          if (0x5f < uVar13) {
            __ptr = "libunwind: malformed DW_CFA_def_cfa_sf DWARF unwind, reg too big\n";
            goto LAB_00c2dec0;
          }
          uVar7 = (uint)(-1L << (uVar14 + 0xe & 0x3f));
          if (0x38 < uVar18 || bVar2 < 0x40) {
            uVar7 = 0;
          }
          iVar12 = *(int *)((long)param_3 + 0x2c);
          *param_6 = (int)uVar13;
          param_6[1] = iVar12 * ((uint)uVar9 | uVar7);
          break;
        case 0x13:
          uVar13 = 0;
          uVar18 = 0xfffffffffffffff9;
          pbVar10 = pbVar8;
          do {
            if (pbVar10 == pbVar1) {
              fprintf((FILE *)sched_yield,"libunwind: %s - %s\n","getSLEB128",
                      "truncated sleb128 expression");
              fflush((FILE *)sched_yield);
                    /* WARNING: Subroutine does not return */
              abort();
            }
            bVar2 = *pbVar10;
            uVar18 = uVar18 + 7;
            pbVar8 = pbVar8 + 1;
            uVar13 = ((ulong)bVar2 & 0x7f) << (uVar18 & 0x3f) | uVar13;
            pbVar10 = pbVar10 + 1;
          } while ((char)bVar2 < '\0');
          local_a0 = pbVar8;
          uVar7 = (uint)(-1L << ((ulong)((int)uVar18 + 7) & 0x3f));
          if (0x38 < uVar18 || bVar2 < 0x40) {
            uVar7 = 0;
          }
          param_6[1] = *(int *)((long)param_3 + 0x2c) * ((uint)uVar13 | uVar7);
          break;
        case 0x14:
          uVar18 = FUN_00c2e6c8(&local_a0,pbVar1);
          if (0x5f < uVar18) {
            fprintf((FILE *)sched_yield,
                    "libunwind: malformed DW_CFA_val_offset DWARF unwind, reg (%lu) out of range\n\n"
                    ,uVar18);
            goto LAB_00c2def0;
          }
          lVar6 = FUN_00c2e6c8(&local_a0,pbVar1);
          puVar17 = (undefined8 *)(param_6 + uVar18 * 4 + 6);
          iVar12 = *(int *)((long)param_3 + 0x2c);
          if ((*(byte *)((long)puVar17 + 4) & 1) == 0) {
            uVar20 = *puVar17;
            *(undefined1 *)((long)puVar17 + 4) = 1;
            *(undefined8 *)((long)(local_6c8 + uVar18 * 0x10) + 8) = puVar17[1];
            *(undefined8 *)(local_6c8 + uVar18 * 0x10) = uVar20;
          }
          lVar6 = lVar6 * iVar12;
          uVar5 = 4;
LAB_00c2dd48:
          *(undefined4 *)puVar17 = uVar5;
          puVar17[1] = lVar6;
          break;
        case 0x15:
          uVar18 = FUN_00c2e6c8(&local_a0,pbVar1);
          if (uVar18 < 0x60) {
            uVar9 = 0;
            uVar13 = 0xfffffffffffffff9;
            pbVar10 = local_a0;
            pbVar8 = local_a0;
            do {
              if (pbVar8 == pbVar1) {
                fprintf((FILE *)sched_yield,"libunwind: %s - %s\n","getSLEB128",
                        "truncated sleb128 expression");
                fflush((FILE *)sched_yield);
                    /* WARNING: Subroutine does not return */
                abort();
              }
              bVar2 = *pbVar8;
              uVar13 = uVar13 + 7;
              pbVar10 = pbVar10 + 1;
              uVar9 = ((ulong)bVar2 & 0x7f) << (uVar13 & 0x3f) | uVar9;
              pbVar8 = pbVar8 + 1;
            } while ((char)bVar2 < '\0');
            puVar17 = (undefined8 *)(param_6 + uVar18 * 4 + 6);
            local_a0 = pbVar10;
            uVar14 = -1L << ((ulong)((int)uVar13 + 7) & 0x3f);
            iVar12 = *(int *)((long)param_3 + 0x2c);
            if (0x38 < uVar13 || bVar2 < 0x40) {
              uVar14 = 0;
            }
            if ((*(byte *)((long)puVar17 + 4) & 1) == 0) {
              uVar20 = *puVar17;
              *(undefined1 *)((long)puVar17 + 4) = 1;
              *(undefined8 *)((long)(local_6c8 + uVar18 * 0x10) + 8) = puVar17[1];
              *(undefined8 *)(local_6c8 + uVar18 * 0x10) = uVar20;
            }
            uVar9 = uVar9 | uVar14;
            uVar5 = 4;
            goto LAB_00c2dba0;
          }
          __ptr = "libunwind: malformed DW_CFA_val_offset_sf DWARF unwind, reg too big\n";
          __size = 0x44;
          goto LAB_00c2dee8;
        case 0x16:
          uVar18 = FUN_00c2e6c8(&local_a0,pbVar1);
          if (uVar18 < 0x60) {
            puVar17 = (undefined8 *)(param_6 + uVar18 * 4 + 6);
            if ((*(byte *)((long)puVar17 + 4) & 1) == 0) {
              uVar20 = *puVar17;
              *(undefined1 *)((long)puVar17 + 4) = 1;
              *(undefined8 *)((long)(local_6c8 + uVar18 * 0x10) + 8) = puVar17[1];
              *(undefined8 *)(local_6c8 + uVar18 * 0x10) = uVar20;
            }
            uVar5 = 7;
            goto LAB_00c2dbf0;
          }
          __ptr = "libunwind: malformed DW_CFA_val_expression DWARF unwind, reg too big\n";
          __size = 0x45;
          goto LAB_00c2dee8;
        default:
          bVar3 = bVar2 >> 6;
          uVar18 = (ulong)bVar2 & 0x3f;
          if (bVar3 < 2) {
            if (bVar3 != 1) {
              return 0;
            }
            uVar16 = uVar16 + (uint)((int)param_3[5] * (int)uVar18);
          }
          else {
            if (bVar3 != 3) {
              lVar6 = FUN_00c2e6c8(&local_a0,pbVar1);
              puVar17 = (undefined8 *)(param_6 + uVar18 * 4 + 6);
              lVar11 = (long)*(int *)((long)param_3 + 0x2c);
              if ((*(byte *)((long)puVar17 + 4) & 1) == 0) {
                uVar20 = *puVar17;
                *(undefined1 *)((long)puVar17 + 4) = 1;
                *(undefined8 *)((long)(local_6c8 + uVar18 * 0x10) + 8) = puVar17[1];
                *(undefined8 *)(local_6c8 + uVar18 * 0x10) = uVar20;
              }
              goto LAB_00c2dd40;
            }
            puVar17 = (undefined8 *)(param_6 + uVar18 * 4 + 6);
            if (*(char *)((long)puVar17 + 4) == '\x01') {
              uVar21 = *(undefined8 *)((long)(local_6c8 + uVar18 * 0x10) + 8);
              uVar20 = *(undefined8 *)(local_6c8 + uVar18 * 0x10);
              goto LAB_00c2dcf4;
            }
          }
          break;
        case 0x2c:
          if ((*(byte *)(param_6 + 0x8f) & 1) == 0) {
            uVar21 = puStack_6f0[1];
            uVar20 = *puStack_6f0;
            *(undefined1 *)(param_6 + 0x8f) = 1;
            local_6f8[1] = uVar21;
            *local_6f8 = uVar20;
          }
          lVar6 = local_6e0[3];
          *(ulong *)(param_6 + 0x90) = *(ulong *)(param_6 + 0x90) ^ 3;
          *(ulong *)(param_6 + 0x186) = uVar16 + lVar6 + -4;
          break;
        case 0x2d:
          if (local_6d4 == 4) {
            if ((*(byte *)(param_6 + 0x8f) & 1) == 0) {
              uVar21 = puStack_6f0[1];
              uVar20 = *puStack_6f0;
              *(undefined1 *)(param_6 + 0x8f) = 1;
              local_6f8[1] = uVar21;
              *local_6f8 = uVar20;
            }
            *(ulong *)(param_6 + 0x90) = *(ulong *)(param_6 + 0x90) ^ 1;
          }
          break;
        case 0x2e:
          uVar5 = FUN_00c2e6c8(&local_a0,pbVar1);
          param_6[4] = uVar5;
          break;
        case 0x2f:
          uVar18 = FUN_00c2e6c8(&local_a0,pbVar1);
          if (uVar18 < 0x60) {
            lVar6 = FUN_00c2e6c8(&local_a0,pbVar1);
            puVar17 = (undefined8 *)(param_6 + uVar18 * 4 + 6);
            iVar12 = *(int *)((long)param_3 + 0x2c);
            if ((*(byte *)((long)puVar17 + 4) & 1) == 0) {
              uVar20 = *puVar17;
              *(undefined1 *)((long)puVar17 + 4) = 1;
              *(undefined8 *)((long)(local_6c8 + uVar18 * 0x10) + 8) = puVar17[1];
              *(undefined8 *)(local_6c8 + uVar18 * 0x10) = uVar20;
            }
            lVar6 = -(lVar6 * iVar12);
            goto LAB_00c2dd44;
          }
          __ptr = 
          "libunwind: malformed DW_CFA_GNU_negative_offset_extended DWARF unwind, reg too big\n";
          __size = 0x53;
LAB_00c2dee8:
          fwrite(__ptr,__size,1,(FILE *)sched_yield);
LAB_00c2def0:
          fflush((FILE *)sched_yield);
          return 0;
        }
      } while ((local_a0 < pbVar1) && (pbVar10 = local_a0, uVar16 < uVar15));
    }
    lVar19 = lVar19 + 0x18;
    if (lVar19 == 0x30) {
      return 1;
    }
  } while( true );
}

