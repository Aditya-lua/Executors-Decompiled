/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bbee80
 */

void FUN_00bbee80(long *param_1,undefined8 *param_2,ulong param_3,ulong *param_4,ulong param_5,
                 int param_6)

{
  ulong *puVar1;
  int iVar2;
  undefined8 *puVar3;
  ushort *puVar4;
  ushort *puVar5;
  ushort *puVar6;
  void *__src;
  undefined1 *puVar7;
  ulong uVar8;
  uint uVar9;
  uint uVar10;
  byte bVar11;
  byte bVar12;
  int iVar13;
  uint uVar14;
  long lVar15;
  undefined8 *puVar16;
  undefined8 *puVar17;
  size_t sVar18;
  uint uVar19;
  long lVar20;
  ulong uVar21;
  undefined8 *puVar22;
  ulong uVar23;
  ulong uVar24;
  long lVar25;
  undefined8 *puVar26;
  long lVar27;
  long lVar28;
  undefined8 *puVar29;
  int iVar30;
  undefined8 *puVar31;
  uint uVar32;
  ulong uVar33;
  undefined1 *puVar34;
  ulong uVar35;
  ulong uVar36;
  ulong uVar37;
  long lVar38;
  ulong uVar39;
  undefined8 *__dest;
  ulong uVar40;
  long lVar41;
  ulong uVar42;
  ulong uVar43;
  ulong uVar44;
  undefined8 *puVar45;
  ulong *puVar46;
  undefined8 uVar47;
  undefined8 uVar48;
  undefined8 uVar49;
  ulong local_e8;
  ulong local_98;
  undefined8 *local_90;
  ulong local_88;
  size_t sStack_80;
  ulong local_78;
  long local_70;
  
  lVar15 = tpidr_el0;
  local_70 = *(long *)(lVar15 + 0x28);
  if ((int)param_1[0xed4] == 0) {
    lVar38 = (long)param_2 + (param_3 & ((long)param_3 >> 0x3f ^ 0xffffffffffffffffU));
  }
  else {
    lVar38 = param_1[0xed2];
  }
  local_90 = (undefined8 *)param_1[0xeb5];
  puVar3 = (undefined8 *)((long)local_90 + param_1[0xeb9]);
  puVar45 = param_2;
  if (param_6 != 0) {
    puVar17 = (undefined8 *)param_1[0xe99];
    lVar27 = param_1[0xe9a];
    uVar23 = param_1[0xe9b];
    *(undefined4 *)((long)param_1 + 0x7534) = 1;
    if (param_5 == 0) {
LAB_00bbf05c:
      uVar24 = 0xffffffffffffffec;
      goto LAB_00bbf7c8;
    }
    uVar44 = (ulong)*(uint *)((long)param_1 + 0x683c);
    uVar42 = (ulong)*(uint *)(param_1 + 0xd08);
    local_e8 = (ulong)*(uint *)((long)param_1 + 0x6844);
    lVar28 = param_5 - 8;
    if (param_5 < 8) {
      uVar24 = (ulong)(byte)*param_4;
      if ((long)param_5 < 5) {
        if (param_5 != 2) {
          if (param_5 != 3) {
            if (param_5 != 4) goto LAB_00bbefe8;
            goto LAB_00bbefd0;
          }
          goto LAB_00bbefd8;
        }
LAB_00bbefe0:
        uVar24 = uVar24 + (ulong)*(byte *)((long)param_4 + 1) * 0x100;
      }
      else {
        if (param_5 == 5) {
LAB_00bbefc8:
          uVar24 = uVar24 + ((ulong)*(byte *)((long)param_4 + 4) << 0x20);
LAB_00bbefd0:
          uVar24 = uVar24 + (ulong)*(byte *)((long)param_4 + 3) * 0x1000000;
LAB_00bbefd8:
          uVar24 = uVar24 + (ulong)*(byte *)((long)param_4 + 2) * 0x10000;
          goto LAB_00bbefe0;
        }
        if (param_5 == 6) {
LAB_00bbefc0:
          uVar24 = uVar24 + ((ulong)*(byte *)((long)param_4 + 5) << 0x28);
          goto LAB_00bbefc8;
        }
        if (param_5 == 7) {
          uVar24 = uVar24 | (ulong)*(byte *)((long)param_4 + 6) << 0x30;
          goto LAB_00bbefc0;
        }
      }
LAB_00bbefe8:
      uVar19 = (uint)*(byte *)((long)param_4 + (param_5 - 1));
      if (uVar19 == 0) goto LAB_00bbf05c;
      lVar28 = 0;
      iVar30 = (int)LZCOUNT(uVar19) + (int)param_5 * -8 + 0x29;
    }
    else {
      uVar24 = *(ulong *)((long)param_4 + lVar28);
      if ((uVar24 >> 0x38 == 0) || (0xffffffffffffff88 < param_5)) goto LAB_00bbf05c;
      iVar30 = 8 - ((uint)LZCOUNT((uint)(byte)(uVar24 >> 0x38)) ^ 0x1f);
    }
    lVar20 = *param_1;
    uVar9 = *(uint *)(lVar20 + 4);
    uVar19 = uVar9 + iVar30;
    uVar32 = -uVar19;
    uVar40 = uVar24;
    if (uVar19 < 0x41) {
      if (lVar28 < 8) {
        puVar46 = param_4;
        if (lVar28 == 0) goto LAB_00bbf074;
        uVar10 = (uint)lVar28;
        if (param_4 <= (ulong *)((long)param_4 + (lVar28 - (ulong)(uVar19 >> 3)))) {
          uVar10 = uVar19 >> 3;
        }
        uVar19 = uVar19 + uVar10 * -8;
      }
      else {
        uVar10 = uVar19 >> 3;
        uVar19 = uVar19 & 7;
      }
      puVar46 = (ulong *)((long)param_4 + (lVar28 - (ulong)uVar10));
      uVar40 = *puVar46;
    }
    else {
      puVar46 = (ulong *)&DAT_00789ab0;
    }
LAB_00bbf074:
    lVar28 = param_1[2];
    puVar1 = param_4 + 1;
    uVar10 = *(uint *)(lVar28 + 4);
    uVar19 = uVar10 + uVar19;
    uVar35 = uVar40 >> ((ulong)-uVar19 & 0x3f);
    iVar30 = (int)param_4;
    if (uVar19 < 0x41) {
      if (puVar46 < puVar1) {
        if (puVar46 != param_4) {
          uVar14 = (int)puVar46 - iVar30;
          if (param_4 <= (ulong *)((long)puVar46 - (ulong)(uVar19 >> 3))) {
            uVar14 = uVar19 >> 3;
          }
          puVar46 = (ulong *)((long)puVar46 - (ulong)uVar14);
          uVar19 = uVar19 + uVar14 * -8;
          uVar40 = *puVar46;
        }
      }
      else {
        uVar14 = uVar19 >> 3;
        uVar19 = uVar19 & 7;
        puVar46 = (ulong *)((long)puVar46 - (ulong)uVar14);
        uVar40 = *puVar46;
      }
    }
    else {
      puVar46 = (ulong *)&DAT_00789ab0;
    }
    lVar25 = param_1[1];
    uVar35 = uVar35 & *(uint *)(&DAT_00789a30 + (ulong)uVar10 * 4);
    uVar10 = *(uint *)(lVar25 + 4);
    uVar19 = uVar10 + uVar19;
    local_98 = (ulong)uVar19;
    uVar39 = uVar24 >> ((ulong)uVar32 & 0x3f) & (ulong)*(uint *)(&DAT_00789a30 + (ulong)uVar9 * 4);
    uVar43 = uVar40 >> ((ulong)-uVar19 & 0x3f) & (ulong)*(uint *)(&DAT_00789a30 + (ulong)uVar10 * 4)
    ;
    if (uVar19 < 0x41) {
      if (puVar46 < puVar1) {
        if (puVar46 == param_4) goto LAB_00bbf1a4;
        uVar9 = (int)puVar46 - iVar30;
        if (param_4 <= (ulong *)((long)puVar46 - (ulong)(uVar19 >> 3))) {
          uVar9 = uVar19 >> 3;
        }
        uVar19 = uVar19 + uVar9 * -8;
      }
      else {
        uVar9 = uVar19 >> 3;
        uVar19 = uVar19 & 7;
      }
      puVar46 = (ulong *)((long)puVar46 - (ulong)uVar9);
      local_98 = (ulong)uVar19;
      uVar40 = *puVar46;
    }
    else {
      puVar46 = (ulong *)&DAT_00789ab0;
    }
LAB_00bbf1a4:
    do {
      puVar4 = (ushort *)(lVar28 + 8 + uVar35 * 8);
      puVar5 = (ushort *)(lVar20 + 8 + uVar39 * 8);
      bVar11 = (byte)puVar4[1];
      uVar9 = *(uint *)(puVar5 + 2);
      uVar21 = (ulong)uVar9;
      uVar19 = *(uint *)(puVar4 + 2);
      uVar32 = (uint)bVar11;
      if (bVar11 < 2) {
        if (bVar11 != 0) {
          if (uVar9 == 0) {
            uVar19 = uVar19 + 1;
          }
          uVar33 = (long)(uVar40 << (local_98 & 0x3f)) >> 0x3f;
          lVar41 = uVar19 - uVar33;
          uVar24 = uVar42;
          if (lVar41 != 1) {
            if (lVar41 == 3) {
              uVar24 = uVar44 - 1;
            }
            else {
              uVar24 = uVar44;
              if (uVar19 != uVar33) {
                uVar24 = local_e8;
              }
            }
            local_e8 = uVar42;
          }
          uVar19 = 1;
          if (uVar24 == 0) {
            uVar24 = 0xffffffffffffffff;
          }
          goto LAB_00bbf20c;
        }
        uVar24 = uVar42;
        if (uVar9 != 0) {
          uVar24 = uVar44;
          uVar44 = uVar42;
        }
        uVar42 = uVar44;
        uVar44 = uVar24;
      }
      else {
        uVar24 = ((uVar40 << (local_98 & 0x3f)) >> ((ulong)-uVar32 & 0x3f)) + (ulong)uVar19;
        uVar19 = uVar32;
        local_e8 = uVar42;
LAB_00bbf20c:
        local_98 = (ulong)((int)local_98 + uVar19);
        uVar42 = uVar44;
        uVar44 = uVar24;
      }
      puVar6 = (ushort *)(lVar25 + 8 + uVar43 * 8);
      bVar11 = (byte)puVar6[1];
      sVar18 = (size_t)*(uint *)(puVar6 + 2);
      if (bVar11 != 0) {
        uVar24 = local_98 & 0x3f;
        local_98 = (ulong)((int)local_98 + (uint)bVar11);
        sVar18 = ((uVar40 << uVar24) >> ((ulong)-(uint)bVar11 & 0x3f)) + sVar18;
      }
      bVar12 = (byte)puVar5[1];
      if (0x1e < ((uint)bVar11 + (uint)bVar12 + uVar32 & 0xff)) {
        uVar19 = (uint)local_98;
        if (uVar19 < 0x41) {
          if (puVar46 < puVar1) {
            if (puVar46 != param_4) {
              uVar9 = (int)puVar46 - iVar30;
              if (param_4 <= (ulong *)((long)puVar46 - (ulong)(uVar19 >> 3))) {
                uVar9 = uVar19 >> 3;
              }
              puVar46 = (ulong *)((long)puVar46 - (ulong)uVar9);
              local_98 = (ulong)(uVar19 + uVar9 * -8);
              uVar40 = *puVar46;
            }
          }
          else {
            local_98 = (ulong)(uVar19 & 7);
            puVar46 = (ulong *)((long)puVar46 - (ulong)(uVar19 >> 3));
            uVar40 = *puVar46;
          }
        }
        else {
          puVar46 = (ulong *)&DAT_00789ab0;
        }
      }
      if (bVar12 != 0) {
        uVar24 = local_98 & 0x3f;
        local_98 = (ulong)((int)local_98 + (uint)bVar12);
        uVar21 = ((uVar40 << uVar24) >> ((ulong)-(uint)bVar12 & 0x3f)) + uVar21;
      }
      if (param_6 != 1) {
        iVar13 = (int)local_98 + (uint)*(byte *)((long)puVar5 + 3);
        iVar2 = iVar13 + (uint)*(byte *)((long)puVar6 + 3);
        uVar19 = iVar2 + (uint)*(byte *)((long)puVar4 + 3);
        local_98 = (ulong)uVar19;
        uVar39 = (uVar40 >> ((ulong)(uint)-iVar13 & 0x3f) &
                 (ulong)*(uint *)(&DAT_00789a30 + (ulong)(uint)*(byte *)((long)puVar5 + 3) * 4)) +
                 (ulong)*puVar5;
        uVar43 = (uVar40 >> ((ulong)(uint)-iVar2 & 0x3f) &
                 (ulong)*(uint *)(&DAT_00789a30 + (ulong)(uint)*(byte *)((long)puVar6 + 3) * 4)) +
                 (ulong)*puVar6;
        uVar35 = (uVar40 >> ((ulong)-uVar19 & 0x3f) &
                 (ulong)*(uint *)(&DAT_00789a30 + (ulong)(uint)*(byte *)((long)puVar4 + 3) * 4)) +
                 (ulong)*puVar4;
        if (uVar19 < 0x41) {
          if (puVar46 < puVar1) {
            if (puVar46 != param_4) {
              uVar9 = (int)puVar46 - iVar30;
              if (param_4 <= (ulong *)((long)puVar46 - (ulong)(uVar19 >> 3))) {
                uVar9 = uVar19 >> 3;
              }
              puVar46 = (ulong *)((long)puVar46 - (ulong)uVar9);
              local_98 = (ulong)(uVar19 + uVar9 * -8);
              uVar40 = *puVar46;
            }
          }
          else {
            local_98 = (ulong)(uVar19 & 7);
            puVar46 = (ulong *)((long)puVar46 - (ulong)(uVar19 >> 3));
            uVar40 = *puVar46;
          }
        }
        else {
          puVar46 = (ulong *)&DAT_00789ab0;
        }
      }
      __dest = (undefined8 *)((long)puVar45 + uVar21);
      puVar26 = (undefined8 *)((long)__dest - uVar44);
      puVar29 = (undefined8 *)((long)local_90 + uVar21);
      Hint_Prefetch(puVar26,0,0,0);
      if ((puVar3 < puVar29) || (uVar24 = uVar21 + sVar18, lVar38 - 0x20U < (long)puVar45 + uVar24))
      {
        local_88 = uVar21;
        sStack_80 = sVar18;
        local_78 = uVar44;
        uVar24 = FUN_00bbf92c(puVar45,lVar38,&local_88,&local_90,puVar3,puVar17,lVar27,uVar23);
      }
      else {
        uVar47 = *local_90;
        puVar45[1] = local_90[1];
        *puVar45 = uVar47;
        if (0x10 < uVar21) {
          uVar47 = local_90[2];
          puVar45[3] = local_90[3];
          puVar45[2] = uVar47;
          if (0x10 < uVar21 - 0x10) {
            puVar22 = puVar45 + 4;
            puVar31 = local_90 + 6;
            do {
              uVar47 = puVar31[-2];
              puVar22[1] = puVar31[-1];
              *puVar22 = uVar47;
              uVar47 = *puVar31;
              puVar22[3] = puVar31[1];
              puVar22[2] = uVar47;
              puVar22 = puVar22 + 4;
              puVar31 = puVar31 + 4;
            } while (puVar22 < __dest);
          }
        }
        uVar21 = (long)__dest - (long)puVar17;
        local_90 = puVar29;
        if (uVar21 < uVar44) {
          if ((ulong)((long)__dest - lVar27) < uVar44) {
            uVar24 = 0xffffffffffffffec;
            goto LAB_00bbf7c8;
          }
          lVar41 = (long)puVar26 - (long)puVar17;
          __src = (void *)(uVar23 + lVar41);
          if ((long)__src + sVar18 <= uVar23) {
            memmove(__dest,__src,sVar18);
            goto LAB_00bbf4c8;
          }
          memmove(__dest,__src,-lVar41);
          __dest = (undefined8 *)((long)__dest - lVar41);
          puVar26 = puVar17;
          uVar33 = lVar41 + sVar18;
        }
        else {
          uVar33 = sVar18;
        }
        if (uVar44 < 0x10) {
          if (uVar44 < 8) {
            iVar13 = *(int *)(&DAT_00364d10 + uVar44 * 4);
            *(undefined1 *)__dest = *(undefined1 *)puVar26;
            *(undefined1 *)((long)__dest + 1) = *(undefined1 *)((long)puVar26 + 1);
            *(undefined1 *)((long)__dest + 2) = *(undefined1 *)((long)puVar26 + 2);
            *(undefined1 *)((long)__dest + 3) = *(undefined1 *)((long)puVar26 + 3);
            uVar19 = *(uint *)(&DAT_00364e10 + uVar44 * 4);
            *(undefined4 *)((long)__dest + 4) = *(undefined4 *)((long)puVar26 + (ulong)uVar19);
            puVar26 = (undefined8 *)((long)((long)puVar26 + (ulong)uVar19) - (long)iVar13);
          }
          else {
            *__dest = *puVar26;
          }
          if (8 < uVar33) {
            puVar29 = puVar26 + 1;
            puVar22 = __dest + 1;
            if ((long)puVar22 - (long)puVar29 < 0x10) {
              uVar37 = uVar44;
              if (uVar21 <= uVar44) {
                uVar37 = uVar21;
              }
              uVar8 = uVar44;
              if (uVar44 <= uVar21) {
                uVar8 = uVar21;
              }
              puVar7 = (undefined1 *)((long)puVar17 + uVar8 + 0x10);
              puVar34 = (undefined1 *)((long)puVar17 + ((uVar8 + uVar37 + sVar18) - uVar44));
              if (puVar34 <= puVar7) {
                puVar34 = puVar7;
              }
              if ((undefined1 *)0x17 < puVar34 + (-9 - (long)(uVar8 + (long)puVar17))) {
                if (0x1f < (ulong)((long)puVar22 - (long)puVar29)) {
                  puVar26 = puVar26 + 3;
                  uVar21 = ((ulong)(puVar34 + (-9 - (long)(uVar8 + (long)puVar17))) >> 3) + 1;
                  uVar36 = uVar21 & 0x3ffffffffffffffc;
                  puVar31 = (undefined8 *)((long)puVar17 + uVar8 + 0x18);
                  uVar37 = uVar36;
                  do {
                    puVar16 = puVar26 + -1;
                    uVar47 = puVar26[-2];
                    uVar49 = puVar26[1];
                    uVar48 = *puVar26;
                    uVar37 = uVar37 - 4;
                    puVar26 = puVar26 + 4;
                    puVar31[-1] = *puVar16;
                    puVar31[-2] = uVar47;
                    puVar31[1] = uVar49;
                    *puVar31 = uVar48;
                    puVar31 = puVar31 + 4;
                  } while (uVar37 != 0);
                  puVar22 = puVar22 + uVar36;
                  puVar29 = puVar29 + uVar36;
                  if (uVar21 == uVar36) goto LAB_00bbf4c8;
                }
              }
              do {
                puVar26 = puVar22 + 1;
                *puVar22 = *puVar29;
                puVar22 = puVar26;
                puVar29 = puVar29 + 1;
              } while (puVar26 < (undefined8 *)((long)__dest + uVar33));
            }
            else {
              uVar47 = *puVar29;
              __dest[2] = puVar26[2];
              *puVar22 = uVar47;
              if (0x10 < uVar33 - 8) {
                puVar29 = __dest + 3;
                puVar26 = puVar26 + 5;
                do {
                  uVar47 = puVar26[-2];
                  puVar29[1] = puVar26[-1];
                  *puVar29 = uVar47;
                  uVar47 = *puVar26;
                  puVar29[3] = puVar26[1];
                  puVar29[2] = uVar47;
                  puVar29 = puVar29 + 4;
                  puVar26 = puVar26 + 4;
                } while (puVar29 < (undefined8 *)((long)__dest + uVar33));
              }
            }
          }
        }
        else {
          uVar47 = *puVar26;
          __dest[1] = puVar26[1];
          *__dest = uVar47;
          if (0x10 < uVar33) {
            puVar29 = __dest + 2;
            do {
              uVar47 = puVar26[2];
              puVar29[1] = puVar26[3];
              *puVar29 = uVar47;
              uVar47 = puVar26[4];
              puVar29[3] = puVar26[5];
              puVar29[2] = uVar47;
              puVar29 = puVar29 + 4;
              puVar26 = puVar26 + 4;
            } while (puVar29 < (undefined8 *)((long)__dest + uVar33));
          }
        }
      }
LAB_00bbf4c8:
      if (0xffffffffffffff88 < uVar24) goto LAB_00bbf7c8;
      param_6 = param_6 + -1;
      puVar45 = (undefined8 *)((long)puVar45 + uVar24);
    } while (param_6 != 0);
    uVar24 = 0xffffffffffffffec;
    if ((puVar46 != param_4) || ((int)local_98 != 0x40)) goto LAB_00bbf7c8;
    *(uint *)((long)param_1 + 0x683c) = (uint)uVar44;
    *(int *)(param_1 + 0xd08) = (int)uVar42;
    *(int *)((long)param_1 + 0x6844) = (int)local_e8;
  }
  sVar18 = (long)puVar3 - (long)local_90;
  if ((ulong)(lVar38 - (long)puVar45) < sVar18) {
    uVar24 = 0xffffffffffffffba;
  }
  else {
    if (puVar45 == (undefined8 *)0x0) {
      lVar38 = 0;
    }
    else {
      memcpy(puVar45,local_90,sVar18);
      lVar38 = (long)puVar45 + sVar18;
    }
    uVar24 = lVar38 - (long)param_2;
  }
LAB_00bbf7c8:
  if (*(long *)(lVar15 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar24);
  }
  return;
}

