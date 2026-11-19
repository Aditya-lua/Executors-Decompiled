/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bbd630
 */

void FUN_00bbd630(long *param_1,undefined8 *param_2,ulong param_3,ulong *param_4,ulong param_5,
                 int param_6)

{
  ulong *puVar1;
  long lVar2;
  long lVar3;
  int iVar4;
  ushort *puVar5;
  ushort *puVar6;
  ushort *puVar7;
  void *pvVar8;
  uint uVar9;
  uint uVar10;
  byte bVar11;
  byte bVar12;
  uint uVar13;
  long lVar14;
  undefined8 *puVar15;
  undefined8 *puVar16;
  int iVar17;
  ulong uVar18;
  undefined8 *puVar19;
  ulong uVar20;
  uint uVar21;
  undefined8 *puVar22;
  ulong uVar23;
  undefined1 *puVar24;
  undefined8 *puVar25;
  ulong uVar26;
  ulong uVar27;
  undefined8 *puVar28;
  undefined8 *puVar29;
  long lVar30;
  int iVar31;
  long lVar32;
  undefined8 *puVar33;
  uint uVar34;
  undefined1 *puVar35;
  undefined1 *puVar36;
  ulong uVar37;
  ulong uVar38;
  size_t sVar39;
  ulong uVar40;
  undefined1 *puVar41;
  int iVar42;
  undefined8 *puVar43;
  ulong uVar44;
  ulong uVar45;
  long lVar46;
  ulong uVar47;
  ulong uVar48;
  undefined8 uVar49;
  undefined8 uVar50;
  undefined8 uVar51;
  ulong local_e0;
  ulong local_b8;
  ulong *local_a0;
  ulong local_98;
  undefined8 *local_90;
  ulong local_88;
  size_t sStack_80;
  ulong local_78;
  long local_70;
  
  lVar14 = tpidr_el0;
  local_70 = *(long *)(lVar14 + 0x28);
  local_90 = (undefined8 *)param_1[0xeb5];
  puVar19 = (undefined8 *)param_1[0xed3];
  puVar24 = (undefined1 *)
            ((long)param_2 + (param_3 & ((long)param_3 >> 0x3f ^ 0xffffffffffffffffU)));
  puVar16 = param_2;
  if (param_6 != 0) {
    puVar22 = (undefined8 *)param_1[0xe99];
    lVar32 = param_1[0xe9a];
    uVar26 = param_1[0xe9b];
    *(undefined4 *)((long)param_1 + 0x7534) = 1;
    if (param_5 == 0) {
LAB_00bbd850:
      uVar27 = 0xffffffffffffffec;
      goto LAB_00bbebc4;
    }
    uVar47 = (ulong)*(uint *)((long)param_1 + 0x683c);
    uVar20 = (ulong)*(uint *)(param_1 + 0xd08);
    local_e0 = (ulong)*(uint *)((long)param_1 + 0x6844);
    lVar30 = param_5 - 8;
    if (param_5 < 8) {
      uVar27 = (ulong)(byte)*param_4;
      if ((long)param_5 < 5) {
        if (param_5 != 2) {
          if (param_5 != 3) {
            if (param_5 != 4) goto LAB_00bbd7cc;
            goto LAB_00bbd7b4;
          }
          goto LAB_00bbd7bc;
        }
LAB_00bbd7c4:
        uVar27 = uVar27 + (ulong)*(byte *)((long)param_4 + 1) * 0x100;
      }
      else {
        if (param_5 == 5) {
LAB_00bbd7ac:
          uVar27 = uVar27 + ((ulong)*(byte *)((long)param_4 + 4) << 0x20);
LAB_00bbd7b4:
          uVar27 = uVar27 + (ulong)*(byte *)((long)param_4 + 3) * 0x1000000;
LAB_00bbd7bc:
          uVar27 = uVar27 + (ulong)*(byte *)((long)param_4 + 2) * 0x10000;
          goto LAB_00bbd7c4;
        }
        if (param_5 == 6) {
LAB_00bbd7a4:
          uVar27 = uVar27 + ((ulong)*(byte *)((long)param_4 + 5) << 0x28);
          goto LAB_00bbd7ac;
        }
        if (param_5 == 7) {
          uVar27 = uVar27 | (ulong)*(byte *)((long)param_4 + 6) << 0x30;
          goto LAB_00bbd7a4;
        }
      }
LAB_00bbd7cc:
      uVar21 = (uint)*(byte *)((long)param_4 + (param_5 - 1));
      if (uVar21 == 0) goto LAB_00bbd850;
      lVar30 = 0;
      iVar31 = (int)LZCOUNT(uVar21) + (int)param_5 * -8 + 0x29;
    }
    else {
      uVar27 = *(ulong *)((long)param_4 + lVar30);
      if ((uVar27 >> 0x38 == 0) || (0xffffffffffffff88 < param_5)) goto LAB_00bbd850;
      iVar31 = 8 - ((uint)LZCOUNT((uint)(byte)(uVar27 >> 0x38)) ^ 0x1f);
    }
    uVar9 = *(uint *)(*param_1 + 4);
    uVar21 = uVar9 + iVar31;
    uVar34 = -uVar21;
    uVar48 = uVar27;
    if (uVar21 < 0x41) {
      if (lVar30 < 8) {
        local_a0 = param_4;
        if (lVar30 != 0) {
          uVar10 = (uint)lVar30;
          if (param_4 <= (ulong *)((long)param_4 + (lVar30 - (ulong)(uVar21 >> 3)))) {
            uVar10 = uVar21 >> 3;
          }
          local_a0 = (ulong *)((long)param_4 + (lVar30 - (ulong)uVar10));
          uVar21 = uVar21 + uVar10 * -8;
          uVar48 = *local_a0;
        }
      }
      else {
        uVar10 = uVar21 >> 3;
        uVar21 = uVar21 & 7;
        local_a0 = (ulong *)((long)param_4 + (lVar30 - (ulong)uVar10));
        uVar48 = *local_a0;
      }
    }
    else {
      local_a0 = (ulong *)&DAT_00789ab0;
    }
    puVar1 = param_4 + 1;
    uVar10 = *(uint *)(param_1[2] + 4);
    uVar21 = uVar10 + uVar21;
    local_b8 = uVar48 >> ((ulong)-uVar21 & 0x3f);
    iVar31 = (int)param_4;
    if (uVar21 < 0x41) {
      if (local_a0 < puVar1) {
        if (local_a0 == param_4) goto LAB_00bbd8f4;
        uVar13 = (int)local_a0 - iVar31;
        if (param_4 <= (ulong *)((long)local_a0 - (ulong)(uVar21 >> 3))) {
          uVar13 = uVar21 >> 3;
        }
        uVar21 = uVar21 + uVar13 * -8;
      }
      else {
        uVar13 = uVar21 >> 3;
        uVar21 = uVar21 & 7;
      }
      local_a0 = (ulong *)((long)local_a0 - (ulong)uVar13);
      uVar48 = *local_a0;
    }
    else {
      local_a0 = (ulong *)&DAT_00789ab0;
    }
LAB_00bbd8f4:
    uVar18 = uVar27 >> ((ulong)uVar34 & 0x3f) & (ulong)*(uint *)(&DAT_00789a30 + (ulong)uVar9 * 4);
    uVar9 = *(uint *)(param_1[1] + 4);
    uVar21 = uVar9 + uVar21;
    local_98 = (ulong)uVar21;
    local_b8 = local_b8 & *(uint *)(&DAT_00789a30 + (ulong)uVar10 * 4);
    uVar45 = uVar48 >> ((ulong)-uVar21 & 0x3f) & (ulong)*(uint *)(&DAT_00789a30 + (ulong)uVar9 * 4);
    if (uVar21 < 0x41) {
      if (local_a0 < puVar1) {
        if (local_a0 == param_4) goto LAB_00bbd978;
        uVar9 = (int)local_a0 - iVar31;
        if (param_4 <= (ulong *)((long)local_a0 - (ulong)(uVar21 >> 3))) {
          uVar9 = uVar21 >> 3;
        }
        uVar21 = uVar21 + uVar9 * -8;
      }
      else {
        uVar9 = uVar21 >> 3;
        uVar21 = uVar21 & 7;
      }
      local_98 = (ulong)uVar21;
      local_a0 = (ulong *)((long)local_a0 - (ulong)uVar9);
      uVar48 = *local_a0;
    }
    else {
      local_a0 = (ulong *)&DAT_00789ab0;
    }
LAB_00bbd978:
    lVar30 = *param_1 + 8;
    lVar2 = param_1[2] + 8;
    lVar3 = param_1[1] + 8;
LAB_00bbd9a8:
    puVar5 = (ushort *)(lVar2 + local_b8 * 8);
    puVar6 = (ushort *)(lVar30 + uVar18 * 8);
    bVar11 = (byte)puVar5[1];
    uVar9 = *(uint *)(puVar6 + 2);
    uVar23 = (ulong)uVar9;
    uVar21 = *(uint *)(puVar5 + 2);
    uVar34 = (uint)bVar11;
    if (bVar11 < 2) {
      if (bVar11 != 0) {
        if (uVar9 == 0) {
          uVar21 = uVar21 + 1;
        }
        uVar44 = (long)(uVar48 << (local_98 & 0x3f)) >> 0x3f;
        lVar46 = uVar21 - uVar44;
        uVar27 = uVar20;
        if (lVar46 != 1) {
          if (lVar46 == 3) {
            uVar27 = uVar47 - 1;
          }
          else {
            uVar27 = uVar47;
            if (uVar21 != uVar44) {
              uVar27 = local_e0;
            }
          }
          local_e0 = uVar20;
        }
        uVar21 = 1;
        if (uVar27 == 0) {
          uVar27 = 0xffffffffffffffff;
        }
        goto LAB_00bbd9e0;
      }
      uVar27 = uVar20;
      if (uVar9 != 0) {
        uVar27 = uVar47;
        uVar47 = uVar20;
      }
      uVar20 = uVar47;
      uVar47 = uVar27;
    }
    else {
      uVar27 = ((uVar48 << (local_98 & 0x3f)) >> ((ulong)-uVar34 & 0x3f)) + (ulong)uVar21;
      uVar21 = uVar34;
      local_e0 = uVar20;
LAB_00bbd9e0:
      local_98 = (ulong)((int)local_98 + uVar21);
      uVar20 = uVar47;
      uVar47 = uVar27;
    }
    puVar7 = (ushort *)(lVar3 + uVar45 * 8);
    bVar11 = (byte)puVar7[1];
    sVar39 = (size_t)*(uint *)(puVar7 + 2);
    if (bVar11 != 0) {
      uVar27 = local_98 & 0x3f;
      local_98 = (ulong)((int)local_98 + (uint)bVar11);
      sVar39 = ((uVar48 << uVar27) >> ((ulong)-(uint)bVar11 & 0x3f)) + sVar39;
    }
    bVar12 = (byte)puVar6[1];
    if (0x1e < ((uint)bVar11 + (uint)bVar12 + uVar34 & 0xff)) {
      uVar21 = (uint)local_98;
      if (uVar21 < 0x41) {
        if (local_a0 < puVar1) {
          if (local_a0 != param_4) {
            uVar9 = (int)local_a0 - iVar31;
            if (param_4 <= (ulong *)((long)local_a0 - (ulong)(uVar21 >> 3))) {
              uVar9 = uVar21 >> 3;
            }
            local_a0 = (ulong *)((long)local_a0 - (ulong)uVar9);
            local_98 = (ulong)(uVar21 + uVar9 * -8);
            uVar48 = *local_a0;
          }
        }
        else {
          local_98 = (ulong)(uVar21 & 7);
          local_a0 = (ulong *)((long)local_a0 - (ulong)(uVar21 >> 3));
          uVar48 = *local_a0;
        }
      }
      else {
        local_a0 = (ulong *)&DAT_00789ab0;
      }
    }
    if (bVar12 != 0) {
      uVar27 = local_98 & 0x3f;
      local_98 = (ulong)((int)local_98 + (uint)bVar12);
      uVar23 = ((uVar48 << uVar27) >> ((ulong)-(uint)bVar12 & 0x3f)) + uVar23;
    }
    iVar17 = param_6 + -1;
    uVar44 = uVar48;
    if (iVar17 != 0) {
      iVar42 = (int)local_98 + (uint)*(byte *)((long)puVar6 + 3);
      iVar4 = iVar42 + (uint)*(byte *)((long)puVar7 + 3);
      uVar21 = iVar4 + (uint)*(byte *)((long)puVar5 + 3);
      if (uVar21 < 0x41) {
        if (local_a0 < puVar1) {
          if (local_a0 == param_4) goto LAB_00bbdea0;
          uVar34 = (int)local_a0 - iVar31;
          if (param_4 <= (ulong *)((long)local_a0 - (ulong)(uVar21 >> 3))) {
            uVar34 = uVar21 >> 3;
          }
          uVar9 = uVar21 + uVar34 * -8;
        }
        else {
          uVar34 = uVar21 >> 3;
          uVar9 = uVar21 & 7;
        }
        local_a0 = (ulong *)((long)local_a0 - (ulong)uVar34);
        uVar44 = *local_a0;
      }
      else {
        local_a0 = (ulong *)&DAT_00789ab0;
LAB_00bbdea0:
        uVar9 = uVar21;
      }
      local_98 = (ulong)uVar9;
      puVar35 = (undefined1 *)param_1[0xed3];
      uVar18 = (uVar48 >> ((ulong)(uint)-iVar42 & 0x3f) &
               (ulong)*(uint *)(&DAT_00789a30 + (ulong)(uint)*(byte *)((long)puVar6 + 3) * 4)) +
               (ulong)*puVar6;
      uVar45 = (uVar48 >> ((ulong)(uint)-iVar4 & 0x3f) &
               (ulong)*(uint *)(&DAT_00789a30 + (ulong)(uint)*(byte *)((long)puVar7 + 3) * 4)) +
               (ulong)*puVar7;
      local_b8 = (uVar48 >> ((ulong)-uVar21 & 0x3f) &
                 (ulong)*(uint *)(&DAT_00789a30 + (ulong)(uint)*(byte *)((long)puVar5 + 3) * 4)) +
                 (ulong)*puVar5;
      if ((undefined1 *)((long)local_90 + uVar23) <= puVar35) {
LAB_00bbdb98:
        puVar29 = (undefined8 *)((long)local_90 + uVar23);
        if ((puVar19 < puVar29) ||
           (uVar27 = uVar23 + sVar39, puVar29 + -4 < (undefined8 *)((long)puVar16 + uVar27))) {
          local_88 = uVar23;
          sStack_80 = sVar39;
          local_78 = uVar47;
          uVar27 = FUN_00bc006c(puVar16,puVar24,puVar29 + -4,&local_88,&local_90,puVar19,puVar22,
                                lVar32,uVar26);
        }
        else {
          uVar49 = *local_90;
          puVar43 = (undefined8 *)((long)puVar16 + uVar23);
          puVar16[1] = local_90[1];
          *puVar16 = uVar49;
          if (0x10 < uVar23) {
            uVar49 = local_90[2];
            puVar16[3] = local_90[3];
            puVar16[2] = uVar49;
            if (0x10 < uVar23 - 0x10) {
              puVar28 = puVar16 + 4;
              puVar25 = local_90 + 6;
              do {
                uVar49 = puVar25[-2];
                puVar28[1] = puVar25[-1];
                *puVar28 = uVar49;
                uVar49 = *puVar25;
                puVar28[3] = puVar25[1];
                puVar28[2] = uVar49;
                puVar28 = puVar28 + 4;
                puVar25 = puVar25 + 4;
              } while (puVar28 < puVar43);
            }
          }
          uVar48 = (long)puVar43 - (long)puVar22;
          puVar28 = (undefined8 *)((long)puVar43 - uVar47);
          local_90 = puVar29;
          if (uVar48 < uVar47) {
            if ((ulong)((long)puVar43 - lVar32) < uVar47) goto LAB_00bbebbc;
            lVar46 = (long)puVar28 - (long)puVar22;
            pvVar8 = (void *)(uVar26 + lVar46);
            if ((long)pvVar8 + sVar39 <= uVar26) {
              memmove(puVar43,pvVar8,sVar39);
              goto LAB_00bbdd10;
            }
            memmove(puVar43,pvVar8,-lVar46);
            puVar43 = (undefined8 *)((long)puVar43 - lVar46);
            puVar28 = puVar22;
            uVar23 = lVar46 + sVar39;
          }
          else {
            uVar23 = sVar39;
          }
          if (uVar47 < 0x10) {
            if (uVar47 < 8) {
              iVar17 = *(int *)(&DAT_00364d10 + uVar47 * 4);
              *(undefined1 *)puVar43 = *(undefined1 *)puVar28;
              *(undefined1 *)((long)puVar43 + 1) = *(undefined1 *)((long)puVar28 + 1);
              *(undefined1 *)((long)puVar43 + 2) = *(undefined1 *)((long)puVar28 + 2);
              *(undefined1 *)((long)puVar43 + 3) = *(undefined1 *)((long)puVar28 + 3);
              uVar21 = *(uint *)(&DAT_00364e10 + uVar47 * 4);
              *(undefined4 *)((long)puVar43 + 4) = *(undefined4 *)((long)puVar28 + (ulong)uVar21);
              puVar28 = (undefined8 *)((long)((long)puVar28 + (ulong)uVar21) - (long)iVar17);
            }
            else {
              *puVar43 = *puVar28;
            }
            if (8 < uVar23) {
              puVar29 = puVar28 + 1;
              puVar25 = puVar43 + 1;
              if ((long)puVar25 - (long)puVar29 < 0x10) {
                uVar37 = uVar47;
                if (uVar48 <= uVar47) {
                  uVar37 = uVar48;
                }
                uVar40 = uVar47;
                if (uVar47 <= uVar48) {
                  uVar40 = uVar48;
                }
                puVar35 = (undefined1 *)((long)puVar22 + uVar40 + 0x10);
                puVar36 = (undefined1 *)((long)puVar22 + ((uVar40 + uVar37 + sVar39) - uVar47));
                if (puVar36 <= puVar35) {
                  puVar36 = puVar35;
                }
                if ((undefined1 *)0x17 < puVar36 + (-9 - (long)(uVar40 + (long)puVar22))) {
                  if (0x1f < (ulong)((long)puVar25 - (long)puVar29)) {
                    puVar28 = puVar28 + 3;
                    uVar48 = ((ulong)(puVar36 + (-9 - (long)(uVar40 + (long)puVar22))) >> 3) + 1;
                    uVar38 = uVar48 & 0x3ffffffffffffffc;
                    puVar33 = (undefined8 *)((long)puVar22 + uVar40 + 0x18);
                    uVar37 = uVar38;
                    do {
                      puVar15 = puVar28 + -1;
                      uVar49 = puVar28[-2];
                      uVar51 = puVar28[1];
                      uVar50 = *puVar28;
                      uVar37 = uVar37 - 4;
                      puVar28 = puVar28 + 4;
                      puVar33[-1] = *puVar15;
                      puVar33[-2] = uVar49;
                      puVar33[1] = uVar51;
                      *puVar33 = uVar50;
                      puVar33 = puVar33 + 4;
                    } while (uVar37 != 0);
                    puVar25 = puVar25 + uVar38;
                    puVar29 = puVar29 + uVar38;
                    if (uVar48 == uVar38) goto LAB_00bbdd10;
                  }
                }
                do {
                  puVar28 = puVar25 + 1;
                  *puVar25 = *puVar29;
                  puVar25 = puVar28;
                  puVar29 = puVar29 + 1;
                } while (puVar28 < (undefined8 *)((long)puVar43 + uVar23));
              }
              else {
                uVar49 = *puVar29;
                puVar43[2] = puVar28[2];
                *puVar25 = uVar49;
                if (0x10 < uVar23 - 8) {
                  puVar29 = puVar43 + 3;
                  puVar28 = puVar28 + 5;
                  do {
                    uVar49 = puVar28[-2];
                    puVar29[1] = puVar28[-1];
                    *puVar29 = uVar49;
                    uVar49 = *puVar28;
                    puVar29[3] = puVar28[1];
                    puVar29[2] = uVar49;
                    puVar29 = puVar29 + 4;
                    puVar28 = puVar28 + 4;
                  } while (puVar29 < (undefined8 *)((long)puVar43 + uVar23));
                }
              }
            }
          }
          else {
            uVar49 = *puVar28;
            puVar43[1] = puVar28[1];
            *puVar43 = uVar49;
            if (0x10 < uVar23) {
              puVar29 = puVar43 + 2;
              do {
                uVar49 = puVar28[2];
                puVar29[1] = puVar28[3];
                *puVar29 = uVar49;
                uVar49 = puVar28[4];
                puVar29[3] = puVar28[5];
                puVar29[2] = uVar49;
                puVar29 = puVar29 + 4;
                puVar28 = puVar28 + 4;
              } while (puVar29 < (undefined8 *)((long)puVar43 + uVar23));
            }
          }
        }
LAB_00bbdd10:
        if (uVar27 < 0xffffffffffffff89) goto code_r0x00bbdd18;
        goto LAB_00bbebc4;
      }
      if (0 < param_6) goto LAB_00bbe0a8;
      goto LAB_00bbebbc;
    }
    puVar35 = (undefined1 *)param_1[0xed3];
    if ((undefined1 *)((long)local_90 + uVar23) <= puVar35) goto LAB_00bbdb98;
LAB_00bbe0a8:
    uVar27 = (long)puVar35 - (long)local_90;
    if (uVar27 == 0) goto LAB_00bbe32c;
    if ((ulong)((long)puVar24 - (long)puVar16) < uVar27) {
      uVar27 = 0xffffffffffffffba;
      goto LAB_00bbebc4;
    }
    uVar48 = (long)puVar16 - (long)local_90;
    puVar19 = (undefined8 *)((long)puVar16 + uVar27);
    if (((long)uVar48 < -7) && (7 < uVar27)) {
      if (uVar48 < 0xfffffffffffffff0) {
        puVar29 = puVar19 + -4;
        if (puVar29 < puVar16) {
          puVar29 = puVar16;
        }
        else {
          uVar49 = *local_90;
          puVar16[1] = local_90[1];
          *puVar16 = uVar49;
          if (0x10 < (ulong)((long)puVar29 - (long)puVar16)) {
            puVar43 = puVar16 + 2;
            puVar28 = local_90;
            do {
              uVar49 = puVar28[2];
              puVar43[1] = puVar28[3];
              *puVar43 = uVar49;
              uVar49 = puVar28[4];
              puVar43[3] = puVar28[5];
              puVar43[2] = uVar49;
              puVar43 = puVar43 + 4;
              puVar28 = puVar28 + 4;
            } while (puVar43 < puVar29);
          }
          local_90 = (undefined8 *)((long)local_90 + ((long)puVar29 - (long)puVar16));
        }
      }
      else {
        puVar29 = puVar16;
      }
      puVar35 = (undefined1 *)((long)puVar16 + (uVar27 - (long)puVar29));
      if ((puVar35 < (undefined1 *)0x8) || ((ulong)((long)puVar29 - (long)local_90) < 0x20)) {
        puVar16 = puVar29;
      }
      else {
        if (puVar35 < (undefined1 *)0x20) {
          puVar41 = (undefined1 *)0x0;
        }
        else {
          puVar41 = (undefined1 *)((ulong)puVar35 & 0xffffffffffffffe0);
          puVar16 = local_90 + 2;
          puVar43 = puVar29 + 2;
          puVar36 = puVar41;
          do {
            puVar28 = puVar16 + -1;
            uVar49 = puVar16[-2];
            uVar51 = puVar16[1];
            uVar50 = *puVar16;
            puVar36 = puVar36 + -0x20;
            puVar16 = puVar16 + 4;
            puVar43[-1] = *puVar28;
            puVar43[-2] = uVar49;
            puVar43[1] = uVar51;
            *puVar43 = uVar50;
            puVar43 = puVar43 + 4;
          } while (puVar36 != (undefined1 *)0x0);
          if (puVar35 == puVar41) goto LAB_00bbe31c;
          if (((ulong)puVar35 & 0x18) == 0) {
            local_90 = (undefined8 *)((long)local_90 + (long)puVar41);
            puVar16 = (undefined8 *)((long)puVar29 + (long)puVar41);
            goto LAB_00bbe308;
          }
        }
        puVar36 = (undefined1 *)((ulong)puVar35 & 0xfffffffffffffff8);
        lVar46 = (long)puVar41 - (long)puVar36;
        puVar16 = (undefined8 *)((long)puVar29 + (long)puVar41);
        puVar43 = (undefined8 *)((long)local_90 + (long)puVar41);
        do {
          lVar46 = lVar46 + 8;
          *puVar16 = *puVar43;
          puVar16 = puVar16 + 1;
          puVar43 = puVar43 + 1;
        } while (lVar46 != 0);
        puVar16 = (undefined8 *)((long)puVar29 + (long)puVar36);
        local_90 = (undefined8 *)((long)local_90 + (long)puVar36);
        if (puVar35 == puVar36) goto LAB_00bbe31c;
      }
LAB_00bbe308:
      do {
        puVar43 = (undefined8 *)((long)puVar16 + 1);
        *(undefined1 *)puVar16 = *(undefined1 *)local_90;
        puVar16 = puVar43;
        local_90 = (undefined8 *)((long)local_90 + 1);
      } while (puVar43 != (undefined8 *)((long)puVar29 + (long)puVar35));
    }
    else {
      puVar35 = (undefined1 *)((long)puVar16 + (long)puVar35) + -(long)local_90;
      if (puVar35 <= (undefined1 *)((long)puVar16 + 1U)) {
        puVar35 = (undefined1 *)((long)puVar16 + 1);
      }
      uVar37 = (long)puVar35 - (long)puVar16;
      if ((uVar37 < 8) || (uVar48 < 0x20)) goto LAB_00bbe2ec;
      if (uVar37 < 0x20) {
        uVar48 = 0;
        goto LAB_00bbe1fc;
      }
      uVar48 = uVar37 & 0xffffffffffffffe0;
      puVar29 = local_90 + 2;
      puVar43 = puVar16 + 2;
      uVar40 = uVar48;
      do {
        puVar28 = puVar29 + -1;
        uVar49 = puVar29[-2];
        uVar51 = puVar29[1];
        uVar50 = *puVar29;
        uVar40 = uVar40 - 0x20;
        puVar29 = puVar29 + 4;
        puVar43[-1] = *puVar28;
        puVar43[-2] = uVar49;
        puVar43[1] = uVar51;
        *puVar43 = uVar50;
        puVar43 = puVar43 + 4;
      } while (uVar40 != 0);
      if (uVar37 != uVar48) {
        if ((uVar37 & 0x18) == 0) {
          puVar16 = (undefined8 *)((long)puVar16 + uVar48);
          local_90 = (undefined8 *)((long)local_90 + uVar48);
        }
        else {
LAB_00bbe1fc:
          uVar40 = uVar37 & 0xfffffffffffffff8;
          lVar46 = uVar48 - uVar40;
          puVar29 = (undefined8 *)((long)local_90 + uVar48);
          puVar43 = (undefined8 *)((long)puVar16 + uVar48);
          do {
            lVar46 = lVar46 + 8;
            *puVar43 = *puVar29;
            puVar29 = puVar29 + 1;
            puVar43 = puVar43 + 1;
          } while (lVar46 != 0);
          puVar16 = (undefined8 *)((long)puVar16 + uVar40);
          local_90 = (undefined8 *)((long)local_90 + uVar40);
          if (uVar37 == uVar40) goto LAB_00bbe31c;
        }
LAB_00bbe2ec:
        do {
          puVar29 = (undefined8 *)((long)puVar16 + 1);
          *(undefined1 *)puVar16 = *(undefined1 *)local_90;
          puVar16 = puVar29;
          local_90 = (undefined8 *)((long)local_90 + 1);
        } while (puVar29 < puVar19);
      }
    }
LAB_00bbe31c:
    uVar23 = uVar23 - uVar27;
    puVar16 = puVar19;
LAB_00bbe32c:
    puVar43 = (undefined8 *)((long)puVar16 + uVar23);
    puVar19 = (undefined8 *)((long)param_1 + 0x176a4);
    puVar29 = (undefined8 *)((long)puVar43 - uVar47);
    local_90 = (undefined8 *)((long)param_1 + 0x76a4);
    *(undefined4 *)(param_1 + 0xed4) = 0;
    Hint_Prefetch(puVar29,0,0,0);
    if (((long)uVar23 < 0x10001) &&
       (uVar27 = uVar23 + sVar39, (undefined1 *)((long)puVar16 + uVar27) <= puVar24 + -0x20)) {
      uVar49 = *local_90;
      local_90 = (undefined8 *)((long)param_1 + uVar23 + 0x76a4);
      puVar16[1] = *(undefined8 *)((long)param_1 + 0x76ac);
      *puVar16 = uVar49;
      if (0x10 < uVar23) {
        uVar49 = *(undefined8 *)((long)param_1 + 0x76b4);
        puVar16[3] = *(undefined8 *)((long)param_1 + 0x76bc);
        puVar16[2] = uVar49;
        if (0x10 < uVar23 - 0x10) {
          puVar28 = puVar16 + 4;
          puVar25 = (undefined8 *)((long)param_1 + 0x76d4);
          do {
            uVar49 = puVar25[-2];
            puVar28[1] = puVar25[-1];
            *puVar28 = uVar49;
            uVar49 = *puVar25;
            puVar28[3] = puVar25[1];
            puVar28[2] = uVar49;
            puVar28 = puVar28 + 4;
            puVar25 = puVar25 + 4;
          } while (puVar28 < puVar43);
        }
      }
      uVar48 = (long)puVar43 - (long)puVar22;
      if (uVar47 <= uVar48) {
        uVar23 = sVar39;
LAB_00bbe448:
        if (uVar47 < 0x10) {
          if (uVar47 < 8) {
            iVar42 = *(int *)(&DAT_00364d10 + uVar47 * 4);
            *(undefined1 *)puVar43 = *(undefined1 *)puVar29;
            *(undefined1 *)((long)puVar43 + 1) = *(undefined1 *)((long)puVar29 + 1);
            *(undefined1 *)((long)puVar43 + 2) = *(undefined1 *)((long)puVar29 + 2);
            *(undefined1 *)((long)puVar43 + 3) = *(undefined1 *)((long)puVar29 + 3);
            uVar21 = *(uint *)(&DAT_00364e10 + uVar47 * 4);
            *(undefined4 *)((long)puVar43 + 4) = *(undefined4 *)((long)puVar29 + (ulong)uVar21);
            puVar29 = (undefined8 *)((long)((long)puVar29 + (ulong)uVar21) - (long)iVar42);
          }
          else {
            *puVar43 = *puVar29;
          }
          if (8 < uVar23) {
            puVar28 = puVar29 + 1;
            puVar25 = puVar43 + 1;
            if ((long)puVar25 - (long)puVar28 < 0x10) {
              uVar37 = uVar47;
              if (uVar48 <= uVar47) {
                uVar37 = uVar48;
              }
              uVar40 = uVar47;
              if (uVar47 <= uVar48) {
                uVar40 = uVar48;
              }
              puVar36 = (undefined1 *)((long)puVar22 + ((uVar40 + uVar37 + sVar39) - uVar47));
              puVar35 = (undefined1 *)(uVar40 + (long)puVar22) + 0x10;
              if (puVar36 <= puVar35) {
                puVar36 = puVar35;
              }
              if ((undefined1 *)0x17 < puVar36 + (-9 - (long)(uVar40 + (long)puVar22))) {
                if (0x1f < (ulong)((long)puVar25 - (long)puVar28)) {
                  puVar29 = puVar29 + 3;
                  uVar48 = ((ulong)(puVar36 + (-9 - (long)(uVar40 + (long)puVar22))) >> 3) + 1;
                  uVar38 = uVar48 & 0x3ffffffffffffffc;
                  puVar33 = (undefined8 *)((long)puVar22 + uVar40 + 0x18);
                  uVar37 = uVar38;
                  do {
                    puVar15 = puVar29 + -1;
                    uVar49 = puVar29[-2];
                    uVar51 = puVar29[1];
                    uVar50 = *puVar29;
                    uVar37 = uVar37 - 4;
                    puVar29 = puVar29 + 4;
                    puVar33[-1] = *puVar15;
                    puVar33[-2] = uVar49;
                    puVar33[1] = uVar51;
                    *puVar33 = uVar50;
                    puVar33 = puVar33 + 4;
                  } while (uVar37 != 0);
                  puVar25 = puVar25 + uVar38;
                  puVar28 = puVar28 + uVar38;
                  if (uVar48 == uVar38) goto LAB_00bbe4e4;
                }
              }
              do {
                puVar29 = puVar25 + 1;
                *puVar25 = *puVar28;
                puVar25 = puVar29;
                puVar28 = puVar28 + 1;
              } while (puVar29 < (undefined8 *)((long)puVar43 + uVar23));
            }
            else {
              uVar49 = *puVar28;
              puVar43[2] = puVar29[2];
              *puVar25 = uVar49;
              if (0x10 < uVar23 - 8) {
                puVar28 = puVar43 + 3;
                puVar29 = puVar29 + 5;
                do {
                  uVar49 = puVar29[-2];
                  puVar28[1] = puVar29[-1];
                  *puVar28 = uVar49;
                  uVar49 = *puVar29;
                  puVar28[3] = puVar29[1];
                  puVar28[2] = uVar49;
                  puVar28 = puVar28 + 4;
                  puVar29 = puVar29 + 4;
                } while (puVar28 < (undefined8 *)((long)puVar43 + uVar23));
              }
            }
          }
        }
        else {
          uVar49 = *puVar29;
          puVar43[1] = puVar29[1];
          *puVar43 = uVar49;
          if (0x10 < uVar23) {
            puVar28 = puVar43 + 2;
            do {
              uVar49 = puVar29[2];
              puVar28[1] = puVar29[3];
              *puVar28 = uVar49;
              uVar49 = puVar29[4];
              puVar28[3] = puVar29[5];
              puVar28[2] = uVar49;
              puVar28 = puVar28 + 4;
              puVar29 = puVar29 + 4;
            } while (puVar28 < (undefined8 *)((long)puVar43 + uVar23));
          }
        }
        goto LAB_00bbe4e4;
      }
      if (uVar47 <= (ulong)((long)puVar43 - lVar32)) {
        lVar46 = (long)puVar29 - (long)puVar22;
        pvVar8 = (void *)(uVar26 + lVar46);
        if ((long)pvVar8 + sVar39 <= uVar26) {
          memmove(puVar43,pvVar8,sVar39);
          goto LAB_00bbe4e4;
        }
        memmove(puVar43,pvVar8,-lVar46);
        puVar43 = (undefined8 *)((long)puVar43 - lVar46);
        puVar29 = puVar22;
        uVar23 = lVar46 + sVar39;
        goto LAB_00bbe448;
      }
LAB_00bbebbc:
      uVar27 = 0xffffffffffffffec;
      goto LAB_00bbebc4;
    }
    local_88 = uVar23;
    sStack_80 = sVar39;
    local_78 = uVar47;
    uVar27 = FUN_00bbf92c(puVar16,puVar24,&local_88,&local_90,puVar19,puVar22,lVar32,uVar26);
LAB_00bbe4e4:
    iVar42 = (int)local_98;
    if (0xffffffffffffff88 < uVar27) goto LAB_00bbebc4;
    puVar16 = (undefined8 *)((long)puVar16 + uVar27);
    if (param_6 != 1) {
      do {
        puVar5 = (ushort *)(lVar2 + local_b8 * 8);
        puVar6 = (ushort *)(lVar30 + uVar18 * 8);
        bVar11 = (byte)puVar5[1];
        uVar9 = *(uint *)(puVar6 + 2);
        uVar48 = (ulong)uVar9;
        uVar21 = *(uint *)(puVar5 + 2);
        uVar34 = (uint)bVar11;
        uVar27 = uVar47;
        if (bVar11 < 2) {
          if (bVar11 == 0) {
            uVar23 = uVar20;
            if (uVar9 != 0) {
              uVar23 = uVar47;
              uVar47 = uVar20;
            }
            uVar27 = uVar47;
            uVar47 = uVar23;
          }
          else {
            if (uVar9 == 0) {
              uVar21 = uVar21 + 1;
            }
            uVar37 = (long)(uVar44 << (local_98 & 0x3f)) >> 0x3f;
            lVar46 = uVar21 - uVar37;
            uVar23 = uVar20;
            if (lVar46 != 1) {
              if (lVar46 == 3) {
                uVar23 = uVar47 - 1;
              }
              else {
                uVar23 = uVar47;
                if (uVar21 != uVar37) {
                  uVar23 = local_e0;
                }
              }
              local_e0 = uVar20;
            }
            if (uVar23 == 0) {
              uVar23 = 0xffffffffffffffff;
            }
            local_98 = (ulong)((int)local_98 + 1);
            uVar47 = uVar23;
          }
        }
        else {
          uVar47 = local_98 & 0x3f;
          local_98 = (ulong)((int)local_98 + uVar34);
          uVar47 = ((uVar44 << uVar47) >> ((ulong)-uVar34 & 0x3f)) + (ulong)uVar21;
          local_e0 = uVar20;
        }
        uVar20 = uVar27;
        puVar7 = (ushort *)(lVar3 + uVar45 * 8);
        bVar11 = (byte)puVar7[1];
        sVar39 = (size_t)*(uint *)(puVar7 + 2);
        if (bVar11 != 0) {
          uVar27 = local_98 & 0x3f;
          local_98 = (ulong)((int)local_98 + (uint)bVar11);
          sVar39 = ((uVar44 << uVar27) >> ((ulong)-(uint)bVar11 & 0x3f)) + sVar39;
        }
        bVar12 = (byte)puVar6[1];
        if (0x1e < ((uint)bVar11 + (uint)bVar12 + uVar34 & 0xff)) {
          uVar21 = (uint)local_98;
          if (uVar21 < 0x41) {
            if (local_a0 < puVar1) {
              if (local_a0 == param_4) goto joined_r0x00bbea0c;
              uVar9 = (int)local_a0 - iVar31;
              if (param_4 <= (ulong *)((long)local_a0 - (ulong)(uVar21 >> 3))) {
                uVar9 = uVar21 >> 3;
              }
              uVar21 = uVar21 + uVar9 * -8;
            }
            else {
              uVar9 = uVar21 >> 3;
              uVar21 = uVar21 & 7;
            }
            local_a0 = (ulong *)((long)local_a0 - (ulong)uVar9);
            local_98 = (ulong)uVar21;
            uVar44 = *local_a0;
          }
          else {
            local_a0 = (ulong *)&DAT_00789ab0;
          }
        }
joined_r0x00bbea0c:
        if (bVar12 != 0) {
          uVar27 = local_98 & 0x3f;
          local_98 = (ulong)((int)local_98 + (uint)bVar12);
          uVar48 = ((uVar44 << uVar27) >> ((ulong)-(uint)bVar12 & 0x3f)) + uVar48;
        }
        if (iVar17 != 1) {
          iVar42 = (int)local_98 + (uint)*(byte *)((long)puVar6 + 3);
          iVar4 = iVar42 + (uint)*(byte *)((long)puVar7 + 3);
          uVar21 = iVar4 + (uint)*(byte *)((long)puVar5 + 3);
          local_98 = (ulong)uVar21;
          uVar18 = (uVar44 >> ((ulong)(uint)-iVar42 & 0x3f) &
                   (ulong)*(uint *)(&DAT_00789a30 + (ulong)(uint)*(byte *)((long)puVar6 + 3) * 4)) +
                   (ulong)*puVar6;
          uVar45 = (uVar44 >> ((ulong)(uint)-iVar4 & 0x3f) &
                   (ulong)*(uint *)(&DAT_00789a30 + (ulong)(uint)*(byte *)((long)puVar7 + 3) * 4)) +
                   (ulong)*puVar7;
          local_b8 = (uVar44 >> ((ulong)-uVar21 & 0x3f) &
                     (ulong)*(uint *)(&DAT_00789a30 + (ulong)(uint)*(byte *)((long)puVar5 + 3) * 4))
                     + (ulong)*puVar5;
          if (uVar21 < 0x41) {
            if (local_a0 < puVar1) {
              if (local_a0 == param_4) goto LAB_00bbe6ac;
              uVar9 = (int)local_a0 - iVar31;
              if (param_4 <= (ulong *)((long)local_a0 - (ulong)(uVar21 >> 3))) {
                uVar9 = uVar21 >> 3;
              }
              uVar21 = uVar21 + uVar9 * -8;
            }
            else {
              uVar9 = uVar21 >> 3;
              uVar21 = uVar21 & 7;
            }
            local_a0 = (ulong *)((long)local_a0 - (ulong)uVar9);
            local_98 = (ulong)uVar21;
            uVar44 = *local_a0;
          }
          else {
            local_a0 = (ulong *)&DAT_00789ab0;
          }
        }
LAB_00bbe6ac:
        puVar43 = (undefined8 *)((long)puVar16 + uVar48);
        puVar29 = (undefined8 *)((long)puVar43 - uVar47);
        puVar28 = (undefined8 *)((long)local_90 + uVar48);
        Hint_Prefetch(puVar29,0,0,0);
        if ((puVar19 < puVar28) ||
           (uVar27 = uVar48 + sVar39, puVar24 + -0x20 < (undefined1 *)((long)puVar16 + uVar27))) {
          local_88 = uVar48;
          sStack_80 = sVar39;
          local_78 = uVar47;
          uVar27 = FUN_00bbf92c(puVar16,puVar24,&local_88,&local_90,puVar19,puVar22,lVar32,uVar26);
        }
        else {
          uVar49 = *local_90;
          puVar16[1] = local_90[1];
          *puVar16 = uVar49;
          if (0x10 < uVar48) {
            uVar49 = local_90[2];
            puVar16[3] = local_90[3];
            puVar16[2] = uVar49;
            if (0x10 < uVar48 - 0x10) {
              puVar25 = puVar16 + 4;
              puVar33 = local_90 + 6;
              do {
                uVar49 = puVar33[-2];
                puVar25[1] = puVar33[-1];
                *puVar25 = uVar49;
                uVar49 = *puVar33;
                puVar25[3] = puVar33[1];
                puVar25[2] = uVar49;
                puVar25 = puVar25 + 4;
                puVar33 = puVar33 + 4;
              } while (puVar25 < puVar43);
            }
          }
          uVar48 = (long)puVar43 - (long)puVar22;
          local_90 = puVar28;
          if (uVar48 < uVar47) {
            if ((ulong)((long)puVar43 - lVar32) < uVar47) goto LAB_00bbebbc;
            lVar46 = (long)puVar29 - (long)puVar22;
            pvVar8 = (void *)(uVar26 + lVar46);
            if ((long)pvVar8 + sVar39 <= uVar26) {
              memmove(puVar43,pvVar8,sVar39);
              goto joined_r0x00bbe8a4;
            }
            memmove(puVar43,pvVar8,-lVar46);
            puVar43 = (undefined8 *)((long)puVar43 - lVar46);
            puVar29 = puVar22;
            uVar23 = lVar46 + sVar39;
          }
          else {
            uVar23 = sVar39;
          }
          if (uVar47 < 0x10) {
            if (uVar47 < 8) {
              iVar42 = *(int *)(&DAT_00364d10 + uVar47 * 4);
              *(undefined1 *)puVar43 = *(undefined1 *)puVar29;
              *(undefined1 *)((long)puVar43 + 1) = *(undefined1 *)((long)puVar29 + 1);
              *(undefined1 *)((long)puVar43 + 2) = *(undefined1 *)((long)puVar29 + 2);
              *(undefined1 *)((long)puVar43 + 3) = *(undefined1 *)((long)puVar29 + 3);
              uVar21 = *(uint *)(&DAT_00364e10 + uVar47 * 4);
              *(undefined4 *)((long)puVar43 + 4) = *(undefined4 *)((long)puVar29 + (ulong)uVar21);
              puVar29 = (undefined8 *)((long)((long)puVar29 + (ulong)uVar21) - (long)iVar42);
            }
            else {
              *puVar43 = *puVar29;
            }
            if (8 < uVar23) {
              puVar28 = puVar29 + 1;
              puVar25 = puVar43 + 1;
              if ((long)puVar25 - (long)puVar28 < 0x10) {
                uVar37 = uVar47;
                if (uVar48 <= uVar47) {
                  uVar37 = uVar48;
                }
                uVar40 = uVar47;
                if (uVar47 <= uVar48) {
                  uVar40 = uVar48;
                }
                puVar35 = (undefined1 *)((long)puVar22 + uVar40 + 0x10);
                puVar36 = (undefined1 *)((long)puVar22 + ((uVar40 + uVar37 + sVar39) - uVar47));
                if (puVar36 <= puVar35) {
                  puVar36 = puVar35;
                }
                if ((undefined1 *)0x17 < puVar36 + (-9 - (long)(uVar40 + (long)puVar22))) {
                  if (0x1f < (ulong)((long)puVar25 - (long)puVar28)) {
                    puVar29 = puVar29 + 3;
                    uVar48 = ((ulong)(puVar36 + (-9 - (long)(uVar40 + (long)puVar22))) >> 3) + 1;
                    uVar38 = uVar48 & 0x3ffffffffffffffc;
                    puVar33 = (undefined8 *)((long)puVar22 + uVar40 + 0x18);
                    uVar37 = uVar38;
                    do {
                      puVar15 = puVar29 + -1;
                      uVar49 = puVar29[-2];
                      uVar51 = puVar29[1];
                      uVar50 = *puVar29;
                      uVar37 = uVar37 - 4;
                      puVar29 = puVar29 + 4;
                      puVar33[-1] = *puVar15;
                      puVar33[-2] = uVar49;
                      puVar33[1] = uVar51;
                      *puVar33 = uVar50;
                      puVar33 = puVar33 + 4;
                    } while (uVar37 != 0);
                    puVar25 = puVar25 + uVar38;
                    puVar28 = puVar28 + uVar38;
                    if (uVar48 == uVar38) goto joined_r0x00bbe8a4;
                  }
                }
                do {
                  puVar29 = puVar25 + 1;
                  *puVar25 = *puVar28;
                  puVar25 = puVar29;
                  puVar28 = puVar28 + 1;
                } while (puVar29 < (undefined8 *)((long)puVar43 + uVar23));
              }
              else {
                uVar49 = *puVar28;
                puVar43[2] = puVar29[2];
                *puVar25 = uVar49;
                if (0x10 < uVar23 - 8) {
                  puVar28 = puVar43 + 3;
                  puVar29 = puVar29 + 5;
                  do {
                    uVar49 = puVar29[-2];
                    puVar28[1] = puVar29[-1];
                    *puVar28 = uVar49;
                    uVar49 = *puVar29;
                    puVar28[3] = puVar29[1];
                    puVar28[2] = uVar49;
                    puVar28 = puVar28 + 4;
                    puVar29 = puVar29 + 4;
                  } while (puVar28 < (undefined8 *)((long)puVar43 + uVar23));
                }
              }
            }
          }
          else {
            uVar49 = *puVar29;
            puVar43[1] = puVar29[1];
            *puVar43 = uVar49;
            if (0x10 < uVar23) {
              puVar28 = puVar43 + 2;
              do {
                uVar49 = puVar29[2];
                puVar28[1] = puVar29[3];
                *puVar28 = uVar49;
                uVar49 = puVar29[4];
                puVar28[3] = puVar29[5];
                puVar28[2] = uVar49;
                puVar28 = puVar28 + 4;
                puVar29 = puVar29 + 4;
              } while (puVar28 < (undefined8 *)((long)puVar43 + uVar23));
            }
          }
        }
joined_r0x00bbe8a4:
        if (0xffffffffffffff88 < uVar27) goto LAB_00bbebc4;
        iVar17 = iVar17 + -1;
        puVar16 = (undefined8 *)((long)puVar16 + uVar27);
      } while (iVar17 != 0);
      iVar42 = (int)local_98;
    }
LAB_00bbe030:
    if (local_a0 != param_4) goto LAB_00bbebbc;
    uVar27 = 0xffffffffffffffec;
    if (iVar42 != 0x40) goto LAB_00bbebc4;
    *(uint *)((long)param_1 + 0x683c) = (uint)uVar47;
    *(int *)(param_1 + 0xd08) = (int)uVar20;
    *(int *)((long)param_1 + 0x6844) = (int)local_e0;
  }
  puVar22 = local_90;
  if ((int)param_1[0xed4] == 2) {
    sVar39 = (long)puVar19 - (long)local_90;
    if (sVar39 <= (ulong)((long)puVar24 - (long)puVar16)) {
      if (puVar16 != (undefined8 *)0x0) {
        memmove(puVar16,local_90,sVar39);
        puVar16 = (undefined8 *)((long)puVar16 + sVar39);
      }
      *(undefined4 *)(param_1 + 0xed4) = 0;
      puVar22 = (undefined8 *)((long)param_1 + 0x76a4);
      puVar19 = (undefined8 *)((long)param_1 + 0x176a4);
      goto LAB_00bbd72c;
    }
  }
  else {
LAB_00bbd72c:
    sVar39 = (long)puVar19 - (long)puVar22;
    if (sVar39 <= (ulong)((long)puVar24 - (long)puVar16)) {
      if (puVar16 == (undefined8 *)0x0) {
        puVar24 = (undefined1 *)0x0;
      }
      else {
        memcpy(puVar16,puVar22,sVar39);
        puVar24 = (undefined1 *)((long)puVar16 + sVar39);
      }
      uVar27 = (long)puVar24 - (long)param_2;
      goto LAB_00bbebc4;
    }
  }
  uVar27 = 0xffffffffffffffba;
LAB_00bbebc4:
  if (*(long *)(lVar14 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar27);
  }
  return;
code_r0x00bbdd18:
  iVar42 = (int)local_98;
  param_6 = param_6 + -1;
  puVar16 = (undefined8 *)((long)puVar16 + uVar27);
  uVar48 = uVar44;
  if (param_6 == 0) goto LAB_00bbe030;
  goto LAB_00bbd9a8;
}

