/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc0e80
 */

void FSE_decompress_wksp_bmi2
               (undefined1 *param_1,long param_2,long param_3,long param_4,uint param_5,long param_6
               ,ulong param_7)

{
  undefined1 *puVar1;
  int iVar2;
  int iVar3;
  ushort *puVar4;
  ushort *puVar5;
  uint uVar6;
  byte bVar7;
  byte bVar8;
  ushort uVar9;
  ushort uVar10;
  long lVar11;
  bool bVar12;
  undefined1 *puVar13;
  undefined1 *puVar14;
  ulong uVar15;
  uint uVar16;
  uint uVar17;
  ulong *puVar18;
  ulong *puVar19;
  ulong uVar20;
  uint uVar21;
  ulong uVar22;
  long lVar23;
  long lVar24;
  int local_a8;
  uint local_a4;
  long local_a0;
  long lStack_98;
  long local_90;
  long lStack_88;
  ulong local_80;
  uint local_78;
  ulong *local_70;
  ulong *local_68;
  ulong *local_60;
  long local_58;
  
  lVar11 = tpidr_el0;
  local_58 = *(long *)(lVar11 + 0x28);
  local_a8 = 0xff;
  if (param_7 < 0x200) {
LAB_00bc0eb8:
    puVar14 = (undefined1 *)0xffffffffffffffff;
    goto LAB_00bc0f40;
  }
  puVar13 = (undefined1 *)FSE_readNCount_bmi2(param_6,&local_a8,&local_a4,param_3,param_4,0);
  puVar14 = puVar13;
  if ((undefined1 *)0xffffffffffffff88 < puVar13) goto LAB_00bc0f40;
  if (local_a4 <= param_5) {
    uVar17 = 1 << (ulong)(local_a4 & 0x1f);
    if (((1L << ((ulong)local_a4 & 0x3f)) + (long)(int)uVar17 * 4 + (ulong)(local_a8 + 1) * 2 + 0x13
        & 0xfffffffffffffffc) + 0x204 <= param_7) {
      lVar24 = param_6 + 0x200;
      lVar23 = (-(ulong)(uVar17 >> 0x1f) & 0xfffffffc00000000 | (ulong)uVar17 << 2) + 4;
      puVar14 = (undefined1 *)
                FUN_00bc0bdc(lVar24,param_6,local_a8,(ulong)local_a4,lVar24 + lVar23,
                             (param_7 - lVar23) + -0x200);
      if ((undefined1 *)0xffffffffffffff88 < puVar14) goto LAB_00bc0f40;
      puVar19 = (ulong *)(puVar13 + param_3);
      puVar14 = (undefined1 *)(param_4 - (long)puVar13);
      if (*(short *)(param_6 + 0x202) == 0) {
        puVar14 = (undefined1 *)FUN_00bc172c(&local_80,puVar19,puVar14);
        if ((undefined1 *)0xffffffffffffff88 < puVar14) goto LAB_00bc0f40;
        FUN_00bc184c(&local_90,&local_80,lVar24);
        FUN_00bc184c(&local_a0,&local_80,lVar24);
        if (0x40 < local_78) goto LAB_00bc1208;
        puVar13 = param_1;
        puVar19 = local_68;
        if (local_70 < local_60) {
          if (local_70 == local_68) {
            puVar19 = local_70;
            goto LAB_00bc1218;
          }
          uVar17 = (int)local_70 - (int)local_68;
          if (local_68 <= (ulong *)((long)local_70 - (ulong)(local_78 >> 3))) {
            uVar17 = local_78 >> 3;
          }
          local_70 = (ulong *)((long)local_70 - (ulong)uVar17);
          local_78 = local_78 + uVar17 * -8;
          uVar20 = (ulong)local_78;
          local_80 = *local_70;
          if (local_78 < 0x41) goto LAB_00bc1228;
          local_70 = (ulong *)&DAT_00789ba8;
        }
        else {
          local_70 = (ulong *)((long)local_70 - (ulong)(local_78 >> 3));
          local_78 = local_78 & 7;
          local_80 = *local_70;
LAB_00bc1218:
          uVar20 = (ulong)local_78;
LAB_00bc1228:
          do {
            uVar17 = (uint)uVar20;
            if (local_70 < local_60) {
              if (local_70 == puVar19) goto LAB_00bc1338;
              bVar12 = puVar19 <= (ulong *)((long)local_70 - (uVar20 >> 3));
              uVar21 = (uint)(uVar20 >> 3);
              if (!bVar12) {
                uVar21 = (int)local_70 - (int)puVar19;
              }
              uVar17 = uVar17 + uVar21 * -8;
            }
            else {
              uVar21 = uVar17 >> 3;
              uVar17 = uVar17 & 7;
              bVar12 = true;
            }
            uVar20 = (ulong)uVar17;
            local_70 = (ulong *)((long)local_70 - (ulong)uVar21);
            local_80 = *local_70;
            if ((param_1 + param_2 + -3 <= puVar13) || (!bVar12)) goto LAB_00bc1338;
            puVar5 = (ushort *)(lStack_88 + local_90 * 4);
            puVar4 = (ushort *)(lStack_98 + local_a0 * 4);
            uVar9 = *puVar5;
            iVar2 = uVar17 + *(byte *)((long)puVar5 + 3);
            uVar17 = *(uint *)(&DAT_00789b24 + (ulong)*(byte *)((long)puVar5 + 3) * 4);
            *puVar13 = (char)puVar5[1];
            uVar10 = *puVar4;
            iVar3 = iVar2 + (uint)*(byte *)((long)puVar4 + 3);
            uVar21 = *(uint *)(&DAT_00789b24 + (ulong)*(byte *)((long)puVar4 + 3) * 4);
            puVar13[1] = (char)puVar4[1];
            puVar5 = (ushort *)
                     (lStack_88 + (local_80 >> ((ulong)(uint)-iVar2 & 0x3f) & (ulong)uVar17) * 4 +
                     (ulong)uVar9 * 4);
            bVar7 = *(byte *)((long)puVar5 + 3);
            uVar9 = *puVar5;
            puVar4 = (ushort *)
                     (lStack_98 + (local_80 >> ((ulong)(uint)-iVar3 & 0x3f) & (ulong)uVar21) * 4 +
                     (ulong)uVar10 * 4);
            uVar21 = *(uint *)(&DAT_00789b24 + (ulong)bVar7 * 4);
            puVar13[2] = (char)puVar5[1];
            iVar3 = iVar3 + (uint)bVar7;
            uVar17 = iVar3 + (uint)*(byte *)((long)puVar4 + 3);
            uVar20 = (ulong)uVar17;
            uVar16 = *(uint *)(&DAT_00789b24 + (ulong)*(byte *)((long)puVar4 + 3) * 4);
            uVar10 = *puVar4;
            local_90 = (local_80 >> ((ulong)(uint)-iVar3 & 0x3f) & (ulong)uVar21) + (ulong)uVar9;
            puVar13[3] = (char)puVar4[1];
            puVar13 = puVar13 + 4;
            local_a0 = (local_80 >> ((ulong)-uVar17 & 0x3f) & (ulong)uVar16) + (ulong)uVar10;
          } while (uVar17 < 0x41);
          local_70 = (ulong *)&DAT_00789ba8;
        }
LAB_00bc1338:
        puVar14 = param_1 + param_2 + -2;
        local_78 = (uint)uVar20;
        if (puVar13 <= puVar14) {
          puVar13 = puVar13 + 1;
          puVar18 = local_70;
          uVar22 = local_80;
          lVar24 = local_a0;
          lVar23 = local_90;
          do {
            puVar5 = (ushort *)(lStack_88 + lVar23 * 4);
            uVar17 = (int)uVar20 + (uint)*(byte *)((long)puVar5 + 3);
            uVar9 = *puVar5;
            uVar21 = *(uint *)(&DAT_00789b24 + (ulong)*(byte *)((long)puVar5 + 3) * 4);
            puVar13[-1] = (char)puVar5[1];
            if (0x40 < uVar17) {
              puVar14 = puVar13 + 1;
              *puVar13 = *(undefined1 *)(lStack_98 + lVar24 * 4 + 2);
LAB_00bc16f4:
              puVar14 = puVar14 + -(long)param_1;
              goto LAB_00bc0f40;
            }
            if (puVar18 < local_60) {
              if (puVar18 == puVar19) {
                uVar15 = uVar22;
                uVar16 = uVar17;
              }
              else {
                uVar16 = (int)puVar18 - (int)puVar19;
                if (puVar19 <= (ulong *)((long)puVar18 - (ulong)(uVar17 >> 3))) {
                  uVar16 = uVar17 >> 3;
                }
                puVar18 = (ulong *)((long)puVar18 - (ulong)uVar16);
                uVar15 = *puVar18;
                uVar16 = uVar17 + uVar16 * -8;
              }
            }
            else {
              uVar16 = uVar17 & 7;
              puVar18 = (ulong *)((long)puVar18 - (ulong)(uVar17 >> 3));
              uVar15 = *puVar18;
            }
            if (puVar14 < puVar13) break;
            puVar5 = (ushort *)(lStack_98 + lVar24 * 4);
            uVar10 = *puVar5;
            uVar16 = uVar16 + *(byte *)((long)puVar5 + 3);
            uVar6 = *(uint *)(&DAT_00789b24 + (ulong)*(byte *)((long)puVar5 + 3) * 4);
            lVar23 = (uVar22 >> ((ulong)-uVar17 & 0x3f) & (ulong)uVar21) + (ulong)uVar9;
            *puVar13 = (char)puVar5[1];
            if (0x40 < uVar16) {
              puVar14 = puVar13 + 2;
              puVar13[1] = *(undefined1 *)(lStack_88 + lVar23 * 4 + 2);
              goto LAB_00bc16f4;
            }
            if (puVar18 < local_60) {
              if (puVar18 != puVar19) {
                uVar21 = (int)puVar18 - (int)puVar19;
                if (puVar19 <= (ulong *)((long)puVar18 - (ulong)(uVar16 >> 3))) {
                  uVar21 = uVar16 >> 3;
                }
                uVar17 = uVar16 + uVar21 * -8;
                goto LAB_00bc136c;
              }
              uVar22 = uVar15;
              uVar17 = uVar16;
            }
            else {
              uVar21 = uVar16 >> 3;
              uVar17 = uVar16 & 7;
LAB_00bc136c:
              puVar18 = (ulong *)((long)puVar18 - (ulong)uVar21);
              uVar22 = *puVar18;
            }
            uVar20 = (ulong)uVar17;
            puVar1 = puVar13 + 1;
            puVar13 = puVar13 + 2;
            lVar24 = (uVar15 >> ((ulong)-uVar16 & 0x3f) & (ulong)uVar6) + (ulong)uVar10;
          } while (puVar1 <= puVar14);
        }
      }
      else {
        if (puVar14 == (undefined1 *)0x0) {
          puVar14 = (undefined1 *)0xffffffffffffffb8;
          goto LAB_00bc0f40;
        }
        local_60 = puVar19 + 1;
        local_68 = puVar19;
        if (puVar14 < (undefined1 *)0x8) {
          local_80 = (ulong)(byte)*puVar19;
          if ((long)puVar14 < 5) {
            if (puVar14 == (undefined1 *)0x2) goto LAB_00bc1124;
            if (puVar14 == (undefined1 *)0x3) goto LAB_00bc111c;
            if (puVar14 == (undefined1 *)0x4) goto LAB_00bc1114;
          }
          else {
            if (puVar14 != (undefined1 *)0x5) {
              if (puVar14 != (undefined1 *)0x6) {
                if (puVar14 != (undefined1 *)0x7) goto LAB_00bc1130;
                local_80 = local_80 | (ulong)*(byte *)((long)puVar19 + 6) << 0x30;
              }
              local_80 = local_80 + ((ulong)*(byte *)((long)puVar19 + 5) << 0x28);
            }
            local_80 = local_80 + ((ulong)*(byte *)((long)puVar19 + 4) << 0x20);
LAB_00bc1114:
            local_80 = local_80 + (ulong)*(byte *)((long)puVar19 + 3) * 0x1000000;
LAB_00bc111c:
            local_80 = local_80 + (ulong)*(byte *)((long)puVar19 + 2) * 0x10000;
LAB_00bc1124:
            local_80 = local_80 + (ulong)*(byte *)((long)puVar19 + 1) * 0x100;
          }
LAB_00bc1130:
          uVar17 = (uint)*(byte *)(param_3 + param_4 + -1);
          local_70 = puVar19;
          if (uVar17 == 0) goto LAB_00bc1208;
          local_78 = (int)LZCOUNT(uVar17) + (int)puVar14 * -8 + 0x29;
        }
        else {
          local_70 = (ulong *)(param_3 + param_4 + -8);
          local_80 = *local_70;
          if (local_80 >> 0x38 == 0) goto LAB_00bc0eb8;
          local_78 = 8 - ((uint)LZCOUNT((uint)(byte)(local_80 >> 0x38)) ^ 0x1f);
          if ((undefined1 *)0xffffffffffffff88 < puVar14) goto LAB_00bc0f40;
        }
        FUN_00bc184c(&local_90,&local_80,lVar24);
        FUN_00bc184c(&local_a0,&local_80,lVar24);
        if (0x40 < local_78) {
LAB_00bc1208:
          puVar14 = (undefined1 *)0xffffffffffffffec;
          goto LAB_00bc0f40;
        }
        puVar19 = local_68;
        puVar13 = param_1;
        if (local_70 < local_60) {
          if (local_70 == local_68) {
            puVar18 = local_70;
            puVar19 = local_70;
            uVar20 = local_80;
            uVar17 = local_78;
            goto LAB_00bc1484;
          }
          uVar17 = (int)local_70 - (int)local_68;
          if (local_68 <= (ulong *)((long)local_70 - (ulong)(local_78 >> 3))) {
            uVar17 = local_78 >> 3;
          }
          puVar18 = (ulong *)((long)local_70 - (ulong)uVar17);
          uVar17 = local_78 + uVar17 * -8;
          uVar22 = (ulong)uVar17;
          uVar20 = *puVar18;
          if (uVar17 < 0x41) goto LAB_00bc1494;
          puVar18 = (ulong *)&DAT_00789ba8;
        }
        else {
          puVar18 = (ulong *)((long)local_70 - (ulong)(local_78 >> 3));
          uVar17 = local_78 & 7;
          uVar20 = *puVar18;
LAB_00bc1484:
          uVar22 = (ulong)uVar17;
LAB_00bc1494:
          do {
            uVar17 = (uint)uVar22;
            if (puVar18 < local_60) {
              if (puVar18 == puVar19) goto LAB_00bc1598;
              bVar12 = puVar19 <= (ulong *)((long)puVar18 - (uVar22 >> 3));
              uVar21 = (uint)(uVar22 >> 3);
              if (!bVar12) {
                uVar21 = (int)puVar18 - (int)puVar19;
              }
              uVar17 = uVar17 + uVar21 * -8;
            }
            else {
              uVar21 = uVar17 >> 3;
              uVar17 = uVar17 & 7;
              bVar12 = true;
            }
            uVar22 = (ulong)uVar17;
            puVar18 = (ulong *)((long)puVar18 - (ulong)uVar21);
            uVar20 = *puVar18;
            if ((param_1 + param_2 + -3 <= puVar13) || (!bVar12)) goto LAB_00bc1598;
            puVar5 = (ushort *)(lStack_88 + local_90 * 4);
            puVar4 = (ushort *)(lStack_98 + local_a0 * 4);
            bVar7 = *(byte *)((long)puVar5 + 3);
            uVar9 = *puVar5;
            *puVar13 = (char)puVar5[1];
            uVar17 = uVar17 + bVar7;
            bVar8 = *(byte *)((long)puVar4 + 3);
            uVar10 = *puVar4;
            uVar21 = uVar17 + bVar8;
            puVar13[1] = (char)puVar4[1];
            puVar5 = (ushort *)
                     (lStack_88 + ((uVar20 << (uVar22 & 0x3f)) >> ((ulong)-(uint)bVar7 & 0x3f)) * 4
                     + (ulong)uVar9 * 4);
            bVar7 = *(byte *)((long)puVar5 + 3);
            uVar9 = *puVar5;
            puVar4 = (ushort *)
                     (lStack_98 +
                      ((uVar20 << ((ulong)uVar17 & 0x3f)) >> ((ulong)-(uint)bVar8 & 0x3f)) * 4 +
                     (ulong)uVar10 * 4);
            puVar13[2] = (char)puVar5[1];
            uVar17 = uVar21 + bVar7;
            bVar8 = *(byte *)((long)puVar4 + 3);
            uVar10 = *puVar4;
            uVar16 = uVar17 + bVar8;
            uVar22 = (ulong)uVar16;
            local_90 = ((uVar20 << ((ulong)uVar21 & 0x3f)) >> ((ulong)-(uint)bVar7 & 0x3f)) +
                       (ulong)uVar9;
            puVar13[3] = (char)puVar4[1];
            puVar13 = puVar13 + 4;
            local_a0 = ((uVar20 << ((ulong)uVar17 & 0x3f)) >> ((ulong)-(uint)bVar8 & 0x3f)) +
                       (ulong)uVar10;
          } while (uVar16 < 0x41);
          puVar18 = (ulong *)&DAT_00789ba8;
        }
LAB_00bc1598:
        puVar14 = param_1 + param_2 + -2;
        local_80 = uVar20;
        if (puVar13 <= puVar14) {
          puVar13 = puVar13 + 1;
          lVar23 = local_90;
          lVar24 = local_a0;
          do {
            puVar5 = (ushort *)(lStack_88 + lVar23 * 4);
            bVar7 = *(byte *)((long)puVar5 + 3);
            uVar9 = *puVar5;
            uVar17 = (int)uVar22 + (uint)bVar7;
            puVar13[-1] = (char)puVar5[1];
            if (0x40 < uVar17) {
              *puVar13 = *(undefined1 *)(lStack_98 + lVar24 * 4 + 2);
              puVar14 = puVar13 + (1 - (long)param_1);
              goto LAB_00bc0f40;
            }
            if (puVar18 < local_60) {
              uVar15 = uVar20;
              if (puVar18 != puVar19) {
                uVar21 = (int)puVar18 - (int)puVar19;
                if (puVar19 <= (ulong *)((long)puVar18 - (ulong)(uVar17 >> 3))) {
                  uVar21 = uVar17 >> 3;
                }
                uVar17 = uVar17 + uVar21 * -8;
                goto LAB_00bc1648;
              }
            }
            else {
              uVar21 = uVar17 >> 3;
              uVar17 = uVar17 & 7;
LAB_00bc1648:
              puVar18 = (ulong *)((long)puVar18 - (ulong)uVar21);
              local_80 = *puVar18;
              uVar15 = local_80;
            }
            if (puVar14 < puVar13) break;
            puVar5 = (ushort *)(lStack_98 + lVar24 * 4);
            bVar8 = *(byte *)((long)puVar5 + 3);
            uVar10 = *puVar5;
            uVar21 = uVar17 + bVar8;
            lVar23 = ((uVar20 << (uVar22 & 0x3f)) >> ((ulong)-(uint)bVar7 & 0x3f)) + (ulong)uVar9;
            *puVar13 = (char)puVar5[1];
            if (0x40 < uVar21) {
              puVar14 = puVar13 + (2 - (long)param_1);
              puVar13[1] = *(undefined1 *)(lStack_88 + lVar23 * 4 + 2);
              goto LAB_00bc0f40;
            }
            if (puVar18 < local_60) {
              if (puVar18 != puVar19) {
                uVar16 = (int)puVar18 - (int)puVar19;
                if (puVar19 <= (ulong *)((long)puVar18 - (ulong)(uVar21 >> 3))) {
                  uVar16 = uVar21 >> 3;
                }
                uVar21 = uVar21 + uVar16 * -8;
                goto LAB_00bc15c8;
              }
              uVar20 = uVar15;
            }
            else {
              uVar16 = uVar21 >> 3;
              uVar21 = uVar21 & 7;
LAB_00bc15c8:
              puVar18 = (ulong *)((long)puVar18 - (ulong)uVar16);
              local_80 = *puVar18;
              uVar20 = local_80;
            }
            uVar22 = (ulong)uVar21;
            puVar1 = puVar13 + 1;
            puVar13 = puVar13 + 2;
            lVar24 = ((uVar15 << ((ulong)uVar17 & 0x3f)) >> ((ulong)-(uint)bVar8 & 0x3f)) +
                     (ulong)uVar10;
          } while (puVar1 <= puVar14);
        }
      }
      puVar14 = (undefined1 *)0xffffffffffffffba;
      goto LAB_00bc0f40;
    }
  }
  puVar14 = (undefined1 *)0xffffffffffffffd4;
LAB_00bc0f40:
  if (*(long *)(lVar11 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(puVar14);
  }
  return;
}

