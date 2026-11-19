/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bbb0e8
 */

void FUN_00bbb0e8(long *param_1,undefined8 *param_2,ulong param_3,ulong *param_4,ulong param_5,
                 uint param_6)

{
  ulong *puVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  undefined8 *puVar5;
  int iVar6;
  ushort *puVar7;
  ushort *puVar8;
  ushort *puVar9;
  undefined4 *puVar10;
  ulong uVar11;
  uint uVar12;
  byte bVar13;
  byte bVar14;
  uint uVar15;
  long lVar16;
  undefined8 *puVar17;
  uint uVar18;
  uint uVar19;
  long lVar20;
  ulong uVar21;
  undefined8 *puVar22;
  long lVar23;
  undefined8 *puVar24;
  undefined8 *puVar25;
  uint uVar26;
  undefined8 *puVar27;
  ulong uVar28;
  ulong *puVar29;
  undefined8 *puVar30;
  ulong uVar31;
  undefined8 *puVar32;
  int iVar33;
  uint uVar34;
  ulong uVar35;
  ulong uVar36;
  ulong uVar37;
  ulong uVar38;
  undefined8 *puVar39;
  ulong uVar40;
  ulong uVar41;
  ulong uVar42;
  ulong uVar43;
  ulong *puVar44;
  undefined8 *puVar45;
  undefined1 *puVar46;
  undefined1 *puVar47;
  long lVar48;
  undefined1 *puVar49;
  ulong uVar50;
  size_t sVar51;
  undefined1 *puVar52;
  ulong uVar53;
  int iVar54;
  undefined8 uVar55;
  undefined8 uVar56;
  undefined8 uVar57;
  undefined8 *local_208;
  ulong local_188;
  ulong local_160;
  ulong local_158;
  undefined8 *local_150;
  ulong local_148;
  size_t sStack_140;
  ulong local_138;
  ulong local_130 [24];
  long local_70;
  
  lVar16 = tpidr_el0;
  local_70 = *(long *)(lVar16 + 0x28);
  if ((int)param_1[0xed4] == 1) {
    puVar52 = (undefined1 *)param_1[0xed2];
  }
  else {
    puVar52 = (undefined1 *)
              ((long)param_2 + (param_3 & ((long)param_3 >> 0x3f ^ 0xffffffffffffffffU)));
  }
  local_150 = (undefined8 *)param_1[0xeb5];
  local_208 = (undefined8 *)param_1[0xed3];
  puVar24 = param_2;
  if (param_6 == 0) {
    puVar22 = local_150;
    if ((int)param_1[0xed4] != 2) goto LAB_00bbb1f8;
LAB_00bbb1c4:
    sVar51 = (long)local_208 - (long)local_150;
    if (sVar51 <= (ulong)((long)puVar52 - (long)puVar24)) {
      if (puVar24 != (undefined8 *)0x0) {
        memmove(puVar24,local_150,sVar51);
        puVar24 = (undefined8 *)((long)puVar24 + sVar51);
      }
      local_208 = (undefined8 *)((long)param_1 + 0x176a4);
      puVar22 = (undefined8 *)((long)param_1 + 0x76a4);
      goto LAB_00bbb1f8;
    }
  }
  else {
    puVar27 = (undefined8 *)param_1[0xe9b];
    lVar23 = param_1[0xe9a];
    puVar22 = (undefined8 *)param_1[0xe99];
    uVar26 = param_6;
    if (7 < (int)param_6) {
      uVar26 = 8;
    }
    uVar50 = (ulong)uVar26;
    *(undefined4 *)((long)param_1 + 0x7534) = 1;
    if (param_5 == 0) {
LAB_00bbb318:
      uVar50 = 0xffffffffffffffec;
      goto LAB_00bbd584;
    }
    uVar42 = (ulong)*(uint *)((long)param_1 + 0x683c);
    uVar53 = (ulong)*(uint *)(param_1 + 0xd08);
    local_188 = (ulong)*(uint *)((long)param_1 + 0x6844);
    lVar20 = param_5 - 8;
    if (param_5 < 8) {
      uVar28 = (ulong)(byte)*param_4;
      if ((long)param_5 < 5) {
        if (param_5 != 2) {
          if (param_5 != 3) {
            if (param_5 != 4) goto LAB_00bbb298;
            goto LAB_00bbb280;
          }
          goto LAB_00bbb288;
        }
LAB_00bbb290:
        uVar28 = uVar28 + (ulong)*(byte *)((long)param_4 + 1) * 0x100;
      }
      else {
        if (param_5 == 5) {
LAB_00bbb278:
          uVar28 = uVar28 + ((ulong)*(byte *)((long)param_4 + 4) << 0x20);
LAB_00bbb280:
          uVar28 = uVar28 + (ulong)*(byte *)((long)param_4 + 3) * 0x1000000;
LAB_00bbb288:
          uVar28 = uVar28 + (ulong)*(byte *)((long)param_4 + 2) * 0x10000;
          goto LAB_00bbb290;
        }
        if (param_5 == 6) {
LAB_00bbb270:
          uVar28 = uVar28 + ((ulong)*(byte *)((long)param_4 + 5) << 0x28);
          goto LAB_00bbb278;
        }
        if (param_5 == 7) {
          uVar28 = uVar28 | (ulong)*(byte *)((long)param_4 + 6) << 0x30;
          goto LAB_00bbb270;
        }
      }
LAB_00bbb298:
      uVar19 = (uint)*(byte *)((long)param_4 + (param_5 - 1));
      if (uVar19 == 0) goto LAB_00bbb318;
      lVar20 = 0;
      iVar33 = (int)LZCOUNT(uVar19) + (int)param_5 * -8 + 0x29;
    }
    else {
      uVar28 = *(ulong *)((long)param_4 + lVar20);
      if ((uVar28 >> 0x38 == 0) || (0xffffffffffffff88 < param_5)) goto LAB_00bbb318;
      iVar33 = 8 - ((uint)LZCOUNT((uint)(byte)(uVar28 >> 0x38)) ^ 0x1f);
    }
    uVar12 = *(uint *)(*param_1 + 4);
    uVar19 = uVar12 + iVar33;
    uVar18 = -uVar19;
    uVar21 = uVar28;
    if (uVar19 < 0x41) {
      if (lVar20 < 8) {
        puVar44 = param_4;
        if (lVar20 != 0) {
          uVar34 = (uint)lVar20;
          if (param_4 <= (ulong *)((long)param_4 + (lVar20 - (ulong)(uVar19 >> 3)))) {
            uVar34 = uVar19 >> 3;
          }
          puVar44 = (ulong *)((long)param_4 + (lVar20 - (ulong)uVar34));
          uVar19 = uVar19 + uVar34 * -8;
          uVar21 = *puVar44;
        }
      }
      else {
        uVar34 = uVar19 >> 3;
        uVar19 = uVar19 & 7;
        puVar44 = (ulong *)((long)param_4 + (lVar20 - (ulong)uVar34));
        uVar21 = *puVar44;
      }
    }
    else {
      puVar44 = (ulong *)&DAT_00789ab0;
    }
    uVar34 = *(uint *)(param_1[2] + 4);
    uVar19 = uVar34 + uVar19;
    uVar40 = uVar21 >> ((ulong)-uVar19 & 0x3f);
    puVar1 = param_4 + 1;
    iVar33 = (int)param_4;
    if (uVar19 < 0x41) {
      if (puVar44 < puVar1) {
        if (puVar44 != param_4) {
          uVar15 = (int)puVar44 - iVar33;
          if (param_4 <= (ulong *)((long)puVar44 - (ulong)(uVar19 >> 3))) {
            uVar15 = uVar19 >> 3;
          }
          puVar44 = (ulong *)((long)puVar44 - (ulong)uVar15);
          uVar19 = uVar19 + uVar15 * -8;
          uVar21 = *puVar44;
        }
      }
      else {
        uVar15 = uVar19 >> 3;
        uVar19 = uVar19 & 7;
        puVar44 = (ulong *)((long)puVar44 - (ulong)uVar15);
        uVar21 = *puVar44;
      }
    }
    else {
      puVar44 = (ulong *)&DAT_00789ab0;
    }
    local_158 = uVar28 >> ((ulong)uVar18 & 0x3f) &
                (ulong)*(uint *)(&DAT_00789a30 + (ulong)uVar12 * 4);
    lVar20 = (long)param_2 - (long)puVar22;
    uVar40 = uVar40 & *(uint *)(&DAT_00789a30 + (ulong)uVar34 * 4);
    uVar12 = *(uint *)(param_1[1] + 4);
    uVar19 = uVar12 + uVar19;
    uVar28 = (ulong)uVar19;
    local_160 = uVar21 >> ((ulong)-uVar19 & 0x3f) &
                (ulong)*(uint *)(&DAT_00789a30 + (ulong)uVar12 * 4);
    if (uVar19 < 0x41) {
      if (puVar44 < puVar1) {
        if (puVar44 == param_4) goto LAB_00bbb448;
        uVar12 = (int)puVar44 - iVar33;
        if (param_4 <= (ulong *)((long)puVar44 - (ulong)(uVar19 >> 3))) {
          uVar12 = uVar19 >> 3;
        }
        uVar19 = uVar19 + uVar12 * -8;
      }
      else {
        uVar12 = uVar19 >> 3;
        uVar19 = uVar19 & 7;
      }
      uVar28 = (ulong)uVar19;
      puVar44 = (ulong *)((long)puVar44 - (ulong)uVar12);
      uVar21 = *puVar44;
    }
    else {
      puVar44 = (ulong *)&DAT_00789ab0;
    }
LAB_00bbb448:
    lVar2 = *param_1 + 8;
    uVar35 = (ulong)(param_6 - 1);
    lVar3 = param_1[2] + 8;
    lVar4 = param_1[1] + 8;
    if ((int)param_6 < 1) {
      uVar50 = 0;
    }
    else {
      uVar41 = uVar42;
      puVar29 = local_130 + 2;
      uVar36 = uVar50;
      uVar37 = uVar28;
      do {
        puVar7 = (ushort *)(lVar3 + uVar40 * 8);
        puVar8 = (ushort *)(lVar2 + local_158 * 8);
        bVar13 = (byte)puVar7[1];
        uVar19 = *(uint *)(puVar7 + 2);
        uVar12 = *(uint *)(puVar8 + 2);
        uVar38 = (ulong)uVar12;
        uVar18 = (uint)bVar13;
        if (bVar13 < 2) {
          uVar42 = uVar53;
          if (bVar13 != 0) {
            if (uVar12 == 0) {
              uVar19 = uVar19 + 1;
            }
            uVar37 = (long)(uVar21 << (uVar28 & 0x3f)) >> 0x3f;
            lVar48 = uVar19 - uVar37;
            if (lVar48 != 1) {
              if (lVar48 == 3) {
                uVar42 = uVar41 - 1;
              }
              else {
                uVar42 = uVar41;
                if (uVar19 != uVar37) {
                  uVar42 = local_188;
                }
              }
              local_188 = uVar53;
            }
            uVar12 = (int)uVar28 + 1;
            if (uVar42 == 0) {
              uVar42 = 0xffffffffffffffff;
            }
            goto LAB_00bbb514;
          }
          if (uVar12 != 0) {
            uVar42 = uVar41;
            uVar41 = uVar53;
          }
          uVar53 = uVar41;
        }
        else {
          uVar12 = (int)uVar28 + uVar18;
          uVar42 = ((uVar21 << (uVar28 & 0x3f)) >> ((ulong)-uVar18 & 0x3f)) + (ulong)uVar19;
          local_188 = uVar53;
LAB_00bbb514:
          uVar28 = (ulong)uVar12;
          uVar53 = uVar41;
          uVar37 = uVar28;
        }
        puVar9 = (ushort *)(lVar4 + local_160 * 8);
        bVar13 = (byte)puVar9[1];
        uVar41 = (ulong)*(uint *)(puVar9 + 2);
        if (bVar13 != 0) {
          uVar37 = uVar28 & 0x3f;
          uVar28 = (ulong)((int)uVar28 + (uint)bVar13);
          uVar41 = ((uVar21 << uVar37) >> ((ulong)-(uint)bVar13 & 0x3f)) + uVar41;
          uVar37 = uVar28;
        }
        bVar14 = (byte)puVar8[1];
        if (0x1e < ((uint)bVar13 + (uint)bVar14 + uVar18 & 0xff)) {
          uVar19 = (uint)uVar28;
          if (uVar19 < 0x41) {
            if (puVar44 < puVar1) {
              if (puVar44 == param_4) goto LAB_00bbb580;
              uVar12 = (int)puVar44 - iVar33;
              if (param_4 <= (ulong *)((long)puVar44 - (ulong)(uVar19 >> 3))) {
                uVar12 = uVar19 >> 3;
              }
              uVar19 = uVar19 + uVar12 * -8;
            }
            else {
              uVar12 = uVar19 >> 3;
              uVar19 = uVar19 & 7;
            }
            uVar28 = (ulong)uVar19;
            puVar44 = (ulong *)((long)puVar44 - (ulong)uVar12);
            uVar21 = *puVar44;
            uVar37 = uVar28;
          }
          else {
            puVar44 = (ulong *)&DAT_00789ab0;
          }
        }
LAB_00bbb580:
        if (bVar14 != 0) {
          uVar37 = uVar28 & 0x3f;
          uVar28 = (ulong)((int)uVar28 + (uint)bVar14);
          uVar38 = ((uVar21 << uVar37) >> ((ulong)-(uint)bVar14 & 0x3f)) + uVar38;
          uVar37 = uVar28;
        }
        if (uVar35 != 0) {
          iVar54 = (int)uVar28 + (uint)*(byte *)((long)puVar8 + 3);
          iVar6 = iVar54 + (uint)*(byte *)((long)puVar9 + 3);
          uVar19 = iVar6 + (uint)*(byte *)((long)puVar7 + 3);
          uVar28 = (ulong)uVar19;
          local_158 = (uVar21 >> ((ulong)(uint)-iVar54 & 0x3f) &
                      (ulong)*(uint *)(&DAT_00789a30 + (ulong)(uint)*(byte *)((long)puVar8 + 3) * 4)
                      ) + (ulong)*puVar8;
          local_160 = (uVar21 >> ((ulong)(uint)-iVar6 & 0x3f) &
                      (ulong)*(uint *)(&DAT_00789a30 + (ulong)(uint)*(byte *)((long)puVar9 + 3) * 4)
                      ) + (ulong)*puVar9;
          uVar40 = (uVar21 >> ((ulong)-uVar19 & 0x3f) &
                   (ulong)*(uint *)(&DAT_00789a30 + (ulong)(uint)*(byte *)((long)puVar7 + 3) * 4)) +
                   (ulong)*puVar7;
          if (uVar19 < 0x41) {
            if (puVar44 < puVar1) {
              if (puVar44 == param_4) goto LAB_00bbb64c;
              uVar12 = (int)puVar44 - iVar33;
              if (param_4 <= (ulong *)((long)puVar44 - (ulong)(uVar19 >> 3))) {
                uVar12 = uVar19 >> 3;
              }
              uVar19 = uVar19 + uVar12 * -8;
            }
            else {
              uVar12 = uVar19 >> 3;
              uVar19 = uVar19 & 7;
            }
            uVar28 = (ulong)uVar19;
            puVar44 = (ulong *)((long)puVar44 - (ulong)uVar12);
            uVar21 = *puVar44;
          }
          else {
            puVar44 = (ulong *)&DAT_00789ab0;
          }
LAB_00bbb64c:
          uVar37 = uVar28;
        }
        uVar31 = uVar38 + lVar20;
        uVar36 = uVar36 - 1;
        lVar20 = uVar31 + uVar41;
        uVar35 = uVar35 - 1;
        puVar5 = puVar27;
        if (uVar42 <= uVar31) {
          puVar5 = puVar22;
        }
        puVar46 = (undefined1 *)((long)puVar5 + (uVar31 - uVar42));
        Hint_Prefetch(puVar46,0,0,0);
        Hint_Prefetch(puVar46 + 0x40,0,0,0);
        puVar29[-2] = uVar38;
        puVar29[-1] = uVar41;
        *puVar29 = uVar42;
        uVar41 = uVar42;
        puVar29 = puVar29 + 3;
      } while (uVar36 != 0);
      uVar28 = uVar37;
    }
    iVar54 = (int)uVar28;
    uVar19 = (uint)uVar50;
    if ((int)uVar19 < (int)param_6) {
      puVar5 = (undefined8 *)((long)param_1 + 0x76a4);
      do {
        uVar18 = (uint)uVar50;
        puVar7 = (ushort *)(lVar3 + uVar40 * 8);
        puVar8 = (ushort *)(lVar2 + local_158 * 8);
        bVar13 = (byte)puVar7[1];
        uVar12 = *(uint *)(puVar8 + 2);
        uVar35 = (ulong)uVar12;
        uVar19 = *(uint *)(puVar7 + 2);
        uVar34 = (uint)bVar13;
        if (bVar13 < 2) {
          uVar50 = uVar53;
          if (bVar13 != 0) {
            if (uVar12 == 0) {
              uVar19 = uVar19 + 1;
            }
            uVar41 = (long)(uVar21 << (uVar28 & 0x3f)) >> 0x3f;
            lVar48 = uVar19 - uVar41;
            if (lVar48 != 1) {
              if (lVar48 == 3) {
                uVar50 = uVar42 - 1;
              }
              else {
                uVar50 = uVar42;
                if (uVar19 != uVar41) {
                  uVar50 = local_188;
                }
              }
              local_188 = uVar53;
            }
            uVar19 = 1;
            if (uVar50 == 0) {
              uVar50 = 0xffffffffffffffff;
            }
            goto LAB_00bbb8b4;
          }
          if (uVar12 != 0) {
            uVar50 = uVar42;
            uVar42 = uVar53;
          }
          uVar53 = uVar42;
        }
        else {
          uVar50 = ((uVar21 << (uVar28 & 0x3f)) >> ((ulong)-uVar34 & 0x3f)) + (ulong)uVar19;
          uVar19 = uVar34;
          local_188 = uVar53;
LAB_00bbb8b4:
          uVar28 = (ulong)((int)uVar28 + uVar19);
          uVar53 = uVar42;
        }
        uVar42 = uVar50;
        puVar9 = (ushort *)(lVar4 + local_160 * 8);
        bVar13 = (byte)puVar9[1];
        uVar41 = (ulong)*(uint *)(puVar9 + 2);
        if (bVar13 != 0) {
          uVar50 = uVar28 & 0x3f;
          uVar28 = (ulong)((int)uVar28 + (uint)bVar13);
          uVar41 = ((uVar21 << uVar50) >> ((ulong)-(uint)bVar13 & 0x3f)) + uVar41;
        }
        bVar14 = (byte)puVar8[1];
        if (0x1e < ((uint)bVar13 + (uint)bVar14 + uVar34 & 0xff)) {
          uVar19 = (uint)uVar28;
          if (uVar19 < 0x41) {
            if (puVar44 < puVar1) {
              if (puVar44 != param_4) {
                uVar12 = (int)puVar44 - iVar33;
                if (param_4 <= (ulong *)((long)puVar44 - (ulong)(uVar19 >> 3))) {
                  uVar12 = uVar19 >> 3;
                }
                puVar44 = (ulong *)((long)puVar44 - (ulong)uVar12);
                uVar28 = (ulong)(uVar19 + uVar12 * -8);
                uVar21 = *puVar44;
              }
            }
            else {
              uVar28 = (ulong)(uVar19 & 7);
              puVar44 = (ulong *)((long)puVar44 - (ulong)(uVar19 >> 3));
              uVar21 = *puVar44;
            }
          }
          else {
            puVar44 = (ulong *)&DAT_00789ab0;
          }
        }
        if (bVar14 != 0) {
          uVar50 = uVar28 & 0x3f;
          uVar28 = (ulong)((int)uVar28 + (uint)bVar14);
          uVar35 = ((uVar21 << uVar50) >> ((ulong)-(uint)bVar14 & 0x3f)) + uVar35;
        }
        if (uVar18 != param_6 - 1) {
          iVar54 = (int)uVar28 + (uint)*(byte *)((long)puVar8 + 3);
          iVar6 = iVar54 + (uint)*(byte *)((long)puVar9 + 3);
          uVar19 = iVar6 + (uint)*(byte *)((long)puVar7 + 3);
          uVar28 = (ulong)uVar19;
          local_158 = (uVar21 >> ((ulong)(uint)-iVar54 & 0x3f) &
                      (ulong)*(uint *)(&DAT_00789a30 + (ulong)(uint)*(byte *)((long)puVar8 + 3) * 4)
                      ) + (ulong)*puVar8;
          local_160 = (uVar21 >> ((ulong)(uint)-iVar6 & 0x3f) &
                      (ulong)*(uint *)(&DAT_00789a30 + (ulong)(uint)*(byte *)((long)puVar9 + 3) * 4)
                      ) + (ulong)*puVar9;
          uVar40 = (uVar21 >> ((ulong)-uVar19 & 0x3f) &
                   (ulong)*(uint *)(&DAT_00789a30 + (ulong)(uint)*(byte *)((long)puVar7 + 3) * 4)) +
                   (ulong)*puVar7;
          if (uVar19 < 0x41) {
            if (puVar44 < puVar1) {
              if (puVar44 == param_4) goto LAB_00bbba1c;
              uVar12 = (int)puVar44 - iVar33;
              if (param_4 <= (ulong *)((long)puVar44 - (ulong)(uVar19 >> 3))) {
                uVar12 = uVar19 >> 3;
              }
              uVar19 = uVar19 + uVar12 * -8;
            }
            else {
              uVar12 = uVar19 >> 3;
              uVar19 = uVar19 & 7;
            }
            uVar28 = (ulong)uVar19;
            puVar44 = (ulong *)((long)puVar44 - (ulong)uVar12);
            uVar21 = *puVar44;
          }
          else {
            puVar44 = (ulong *)&DAT_00789ab0;
          }
        }
LAB_00bbba1c:
        iVar54 = (int)uVar28;
        if ((int)param_1[0xed4] == 2) {
          uVar36 = (ulong)(uVar18 & 7);
          puVar29 = local_130 + uVar36 * 3;
          puVar39 = (undefined8 *)param_1[0xed3];
          uVar37 = *puVar29;
          puVar25 = (undefined8 *)((long)local_150 + uVar37);
          if (puVar25 <= puVar39) {
            sVar51 = local_130[uVar36 * 3 + 1];
            uVar36 = local_130[uVar36 * 3 + 2];
            if ((local_208 < puVar25) ||
               (uVar50 = sVar51 + uVar37, puVar25 + -4 < (undefined8 *)((long)puVar24 + uVar50))) {
              local_148 = uVar37;
              sStack_140 = sVar51;
              local_138 = uVar36;
              uVar50 = FUN_00bc006c(puVar24,puVar52,puVar25 + -4,&local_148,&local_150,local_208,
                                    puVar22,lVar23,puVar27);
            }
            else {
              uVar55 = *local_150;
              puVar39 = (undefined8 *)((long)puVar24 + uVar37);
              puVar24[1] = local_150[1];
              *puVar24 = uVar55;
              if (0x10 < uVar37) {
                uVar55 = local_150[2];
                puVar24[3] = local_150[3];
                puVar24[2] = uVar55;
                if (0x10 < uVar37 - 0x10) {
                  puVar45 = puVar24 + 4;
                  puVar30 = local_150 + 6;
                  do {
                    uVar55 = puVar30[-2];
                    puVar45[1] = puVar30[-1];
                    *puVar45 = uVar55;
                    uVar55 = *puVar30;
                    puVar45[3] = puVar30[1];
                    puVar45[2] = uVar55;
                    puVar45 = puVar45 + 4;
                    puVar30 = puVar30 + 4;
                  } while (puVar45 < puVar39);
                }
              }
              uVar37 = (long)puVar39 - (long)puVar22;
              puVar45 = (undefined8 *)((long)puVar39 - uVar36);
              local_150 = puVar25;
              if (uVar37 < uVar36) {
                if ((ulong)((long)puVar39 - lVar23) < uVar36) goto LAB_00bbd5f4;
                lVar48 = (long)puVar45 - (long)puVar22;
                puVar46 = (undefined1 *)((long)puVar27 + lVar48);
                if (puVar46 + sVar51 <= puVar27) {
                  memmove(puVar39,puVar46,sVar51);
                  goto joined_r0x00bbc8d0;
                }
                memmove(puVar39,puVar46,-lVar48);
                puVar39 = (undefined8 *)((long)puVar39 - lVar48);
                puVar45 = puVar22;
                uVar38 = lVar48 + sVar51;
              }
              else {
                uVar38 = sVar51;
              }
              if (uVar36 < 0x10) {
                if (uVar36 < 8) {
                  iVar6 = *(int *)(&DAT_00364d10 + uVar36 * 4);
                  *(undefined1 *)puVar39 = *(undefined1 *)puVar45;
                  *(undefined1 *)((long)puVar39 + 1) = *(undefined1 *)((long)puVar45 + 1);
                  *(undefined1 *)((long)puVar39 + 2) = *(undefined1 *)((long)puVar45 + 2);
                  *(undefined1 *)((long)puVar39 + 3) = *(undefined1 *)((long)puVar45 + 3);
                  uVar19 = *(uint *)(&DAT_00364e10 + uVar36 * 4);
                  *(undefined4 *)((long)puVar39 + 4) =
                       *(undefined4 *)((long)puVar45 + (ulong)uVar19);
                  puVar45 = (undefined8 *)((long)((long)puVar45 + (ulong)uVar19) - (long)iVar6);
                }
                else {
                  *puVar39 = *puVar45;
                }
                if (8 < uVar38) {
                  puVar25 = puVar45 + 1;
                  puVar30 = puVar39 + 1;
                  if ((long)puVar30 - (long)puVar25 < 0x10) {
                    uVar31 = uVar36;
                    if (uVar37 <= uVar36) {
                      uVar31 = uVar37;
                    }
                    uVar43 = uVar36;
                    if (uVar36 <= uVar37) {
                      uVar43 = uVar37;
                    }
                    puVar49 = (undefined1 *)((long)puVar22 + ((uVar43 + uVar31 + sVar51) - uVar36));
                    puVar46 = (undefined1 *)((long)puVar22 + uVar43 + 0x10);
                    if (puVar49 <= puVar46) {
                      puVar49 = puVar46;
                    }
                    if ((undefined1 *)0x17 < puVar49 + (-9 - (long)(uVar43 + (long)puVar22))) {
                      if (0x1f < (ulong)((long)puVar30 - (long)puVar25)) {
                        puVar45 = puVar45 + 3;
                        uVar36 = ((ulong)(puVar49 + (-9 - (long)(uVar43 + (long)puVar22))) >> 3) + 1
                        ;
                        uVar31 = uVar36 & 0x3ffffffffffffffc;
                        puVar32 = (undefined8 *)((long)puVar22 + uVar43 + 0x18);
                        uVar37 = uVar31;
                        do {
                          puVar17 = puVar45 + -1;
                          uVar55 = puVar45[-2];
                          uVar57 = puVar45[1];
                          uVar56 = *puVar45;
                          uVar37 = uVar37 - 4;
                          puVar45 = puVar45 + 4;
                          puVar32[-1] = *puVar17;
                          puVar32[-2] = uVar55;
                          puVar32[1] = uVar57;
                          *puVar32 = uVar56;
                          puVar32 = puVar32 + 4;
                        } while (uVar37 != 0);
                        puVar30 = puVar30 + uVar31;
                        puVar25 = puVar25 + uVar31;
                        if (uVar36 == uVar31) goto joined_r0x00bbc8d0;
                      }
                    }
                    do {
                      puVar45 = puVar30 + 1;
                      *puVar30 = *puVar25;
                      puVar30 = puVar45;
                      puVar25 = puVar25 + 1;
                    } while (puVar45 < (undefined8 *)((long)puVar39 + uVar38));
                  }
                  else {
                    uVar55 = *puVar25;
                    puVar39[2] = puVar45[2];
                    *puVar30 = uVar55;
                    if (0x10 < uVar38 - 8) {
                      puVar25 = puVar39 + 3;
                      puVar45 = puVar45 + 5;
                      do {
                        uVar55 = puVar45[-2];
                        puVar25[1] = puVar45[-1];
                        *puVar25 = uVar55;
                        uVar55 = *puVar45;
                        puVar25[3] = puVar45[1];
                        puVar25[2] = uVar55;
                        puVar25 = puVar25 + 4;
                        puVar45 = puVar45 + 4;
                      } while (puVar25 < (undefined8 *)((long)puVar39 + uVar38));
                    }
                  }
                }
              }
              else {
                uVar55 = *puVar45;
                puVar39[1] = puVar45[1];
                *puVar39 = uVar55;
                if (0x10 < uVar38) {
                  puVar25 = puVar39 + 2;
                  do {
                    uVar55 = puVar45[2];
                    puVar25[1] = puVar45[3];
                    *puVar25 = uVar55;
                    uVar55 = puVar45[4];
                    puVar25[3] = puVar45[5];
                    puVar25[2] = uVar55;
                    puVar25 = puVar25 + 4;
                    puVar45 = puVar45 + 4;
                  } while (puVar25 < (undefined8 *)((long)puVar39 + uVar38));
                }
              }
            }
joined_r0x00bbc8d0:
            if (uVar50 < 0xffffffffffffff89) goto LAB_00bbb81c;
            goto LAB_00bbd584;
          }
          uVar50 = (long)puVar39 - (long)local_150;
          puVar25 = puVar24;
          if (uVar50 != 0) {
            if ((ulong)((long)puVar52 - (long)puVar24) < uVar50) goto LAB_00bbd5e8;
            uVar37 = (long)puVar24 - (long)local_150;
            puVar25 = (undefined8 *)((long)puVar24 + uVar50);
            if (((long)uVar37 < -7) && (7 < uVar50)) {
              if ((uVar37 < 0xfffffffffffffff0) && (puVar39 = puVar25 + -4, puVar24 <= puVar39)) {
                uVar55 = *local_150;
                puVar24[1] = local_150[1];
                *puVar24 = uVar55;
                if (0x10 < (ulong)((long)puVar39 - (long)puVar24)) {
                  puVar45 = puVar24 + 2;
                  puVar30 = local_150;
                  do {
                    uVar55 = puVar30[2];
                    puVar45[1] = puVar30[3];
                    *puVar45 = uVar55;
                    uVar55 = puVar30[4];
                    puVar45[3] = puVar30[5];
                    puVar45[2] = uVar55;
                    puVar45 = puVar45 + 4;
                    puVar30 = puVar30 + 4;
                  } while (puVar45 < puVar39);
                }
                local_150 = (undefined8 *)((long)local_150 + ((long)puVar39 - (long)puVar24));
              }
              else {
                puVar39 = puVar24;
              }
              puVar46 = (undefined1 *)((long)puVar24 + (uVar50 - (long)puVar39));
              if ((puVar46 < (undefined1 *)0x8) || ((ulong)((long)puVar39 - (long)local_150) < 0x20)
                 ) {
                puVar24 = puVar39;
              }
              else {
                if (puVar46 < (undefined1 *)0x20) {
                  puVar47 = (undefined1 *)0x0;
                }
                else {
                  puVar47 = (undefined1 *)((ulong)puVar46 & 0xffffffffffffffe0);
                  puVar24 = local_150 + 2;
                  puVar45 = puVar39 + 2;
                  puVar49 = puVar47;
                  do {
                    puVar30 = puVar24 + -1;
                    uVar55 = puVar24[-2];
                    uVar57 = puVar24[1];
                    uVar56 = *puVar24;
                    puVar49 = puVar49 + -0x20;
                    puVar24 = puVar24 + 4;
                    puVar45[-1] = *puVar30;
                    puVar45[-2] = uVar55;
                    puVar45[1] = uVar57;
                    *puVar45 = uVar56;
                    puVar45 = puVar45 + 4;
                  } while (puVar49 != (undefined1 *)0x0);
                  if (puVar46 == puVar47) goto LAB_00bbbfbc;
                  if (((ulong)puVar46 & 0x18) == 0) {
                    local_150 = (undefined8 *)((long)local_150 + (long)puVar47);
                    puVar24 = (undefined8 *)((long)puVar39 + (long)puVar47);
                    goto LAB_00bbbfa8;
                  }
                }
                puVar49 = (undefined1 *)((ulong)puVar46 & 0xfffffffffffffff8);
                lVar48 = (long)puVar47 - (long)puVar49;
                puVar24 = (undefined8 *)((long)local_150 + (long)puVar47);
                puVar45 = (undefined8 *)((long)puVar39 + (long)puVar47);
                do {
                  lVar48 = lVar48 + 8;
                  *puVar45 = *puVar24;
                  puVar24 = puVar24 + 1;
                  puVar45 = puVar45 + 1;
                } while (lVar48 != 0);
                puVar24 = (undefined8 *)((long)puVar39 + (long)puVar49);
                local_150 = (undefined8 *)((long)local_150 + (long)puVar49);
                if (puVar46 == puVar49) goto LAB_00bbbfbc;
              }
LAB_00bbbfa8:
              do {
                puVar45 = (undefined8 *)((long)puVar24 + 1);
                *(undefined1 *)puVar24 = *(undefined1 *)local_150;
                puVar24 = puVar45;
                local_150 = (undefined8 *)((long)local_150 + 1);
              } while (puVar45 != (undefined8 *)((long)puVar39 + (long)puVar46));
            }
            else {
              puVar46 = (undefined1 *)((long)puVar24 + (long)puVar39) + -(long)local_150;
              if (puVar46 <= (undefined1 *)((long)puVar24 + 1U)) {
                puVar46 = (undefined1 *)((long)puVar24 + 1);
              }
              uVar38 = (long)puVar46 - (long)puVar24;
              if ((7 < uVar38) && (0x1f < uVar37)) {
                if (uVar38 < 0x20) {
                  uVar31 = 0;
                }
                else {
                  uVar31 = uVar38 & 0xffffffffffffffe0;
                  puVar39 = local_150 + 2;
                  puVar45 = puVar24 + 2;
                  uVar37 = uVar31;
                  do {
                    puVar30 = puVar39 + -1;
                    uVar55 = puVar39[-2];
                    uVar57 = puVar39[1];
                    uVar56 = *puVar39;
                    uVar37 = uVar37 - 0x20;
                    puVar39 = puVar39 + 4;
                    puVar45[-1] = *puVar30;
                    puVar45[-2] = uVar55;
                    puVar45[1] = uVar57;
                    *puVar45 = uVar56;
                    puVar45 = puVar45 + 4;
                  } while (uVar37 != 0);
                  if (uVar38 == uVar31) goto LAB_00bbbfbc;
                  if ((uVar38 & 0x18) == 0) {
                    puVar24 = (undefined8 *)((long)puVar24 + uVar31);
                    local_150 = (undefined8 *)((long)local_150 + uVar31);
                    goto LAB_00bbbf88;
                  }
                }
                uVar37 = uVar38 & 0xfffffffffffffff8;
                lVar48 = uVar31 - uVar37;
                puVar39 = (undefined8 *)((long)local_150 + uVar31);
                puVar45 = (undefined8 *)((long)puVar24 + uVar31);
                do {
                  lVar48 = lVar48 + 8;
                  *puVar45 = *puVar39;
                  puVar39 = puVar39 + 1;
                  puVar45 = puVar45 + 1;
                } while (lVar48 != 0);
                puVar24 = (undefined8 *)((long)puVar24 + uVar37);
                local_150 = (undefined8 *)((long)local_150 + uVar37);
                if (uVar38 == uVar37) goto LAB_00bbbfbc;
              }
LAB_00bbbf88:
              do {
                puVar39 = (undefined8 *)((long)puVar24 + 1);
                *(undefined1 *)puVar24 = *(undefined1 *)local_150;
                puVar24 = puVar39;
                local_150 = (undefined8 *)((long)local_150 + 1);
              } while (puVar39 < puVar25);
            }
LAB_00bbbfbc:
            uVar37 = *puVar29 - uVar50;
            *puVar29 = uVar37;
          }
          sVar51 = local_130[uVar36 * 3 + 1];
          uVar38 = local_130[uVar36 * 3 + 2];
          puVar39 = (undefined8 *)((long)puVar25 + uVar37);
          *(undefined4 *)(param_1 + 0xed4) = 0;
          puVar24 = (undefined8 *)((long)puVar39 - uVar38);
          Hint_Prefetch(puVar24,0,0,0);
          if (((long)uVar37 < 0x10001) &&
             (uVar50 = sVar51 + uVar37, (undefined1 *)((long)puVar25 + uVar50) <= puVar52 + -0x20))
          {
            uVar55 = *puVar5;
            puVar25[1] = *(undefined8 *)((long)param_1 + 0x76ac);
            *puVar25 = uVar55;
            if (0x10 < uVar37) {
              uVar55 = *(undefined8 *)((long)param_1 + 0x76b4);
              puVar25[3] = *(undefined8 *)((long)param_1 + 0x76bc);
              puVar25[2] = uVar55;
              if (0x10 < uVar37 - 0x10) {
                puVar45 = puVar25 + 4;
                puVar30 = (undefined8 *)((long)param_1 + 0x76d4);
                do {
                  uVar55 = puVar30[-2];
                  puVar45[1] = puVar30[-1];
                  *puVar45 = uVar55;
                  uVar55 = *puVar30;
                  puVar45[3] = puVar30[1];
                  puVar45[2] = uVar55;
                  puVar45 = puVar45 + 4;
                  puVar30 = puVar30 + 4;
                } while (puVar45 < puVar39);
              }
            }
            uVar31 = (long)puVar39 - (long)puVar22;
            local_150 = (undefined8 *)((long)puVar5 + uVar37);
            if (uVar31 < uVar38) {
              if ((ulong)((long)puVar39 - lVar23) < uVar38) goto LAB_00bbd5f4;
              lVar48 = (long)puVar24 - (long)puVar22;
              puVar46 = (undefined1 *)((long)puVar27 + lVar48);
              if (puVar46 + sVar51 <= puVar27) {
                memmove(puVar39,puVar46,sVar51);
                goto joined_r0x00bbc3a4;
              }
              memmove(puVar39,puVar46,-lVar48);
              puVar39 = (undefined8 *)((long)puVar39 - lVar48);
              puVar24 = puVar22;
              uVar37 = lVar48 + sVar51;
            }
            else {
              uVar37 = sVar51;
            }
            if (uVar38 < 0x10) {
              if (uVar38 < 8) {
                iVar6 = *(int *)(&DAT_00364d10 + uVar38 * 4);
                *(undefined1 *)puVar39 = *(undefined1 *)puVar24;
                *(undefined1 *)((long)puVar39 + 1) = *(undefined1 *)((long)puVar24 + 1);
                *(undefined1 *)((long)puVar39 + 2) = *(undefined1 *)((long)puVar24 + 2);
                *(undefined1 *)((long)puVar39 + 3) = *(undefined1 *)((long)puVar24 + 3);
                puVar10 = (undefined4 *)
                          ((long)puVar24 + (ulong)*(uint *)(&DAT_00364e10 + uVar38 * 4));
                puVar24 = (undefined8 *)((long)puVar10 - (long)iVar6);
                *(undefined4 *)((long)puVar39 + 4) = *puVar10;
              }
              else {
                *puVar39 = *puVar24;
              }
              if (8 < uVar37) {
                puVar45 = puVar24 + 1;
                puVar30 = puVar39 + 1;
                if ((long)puVar30 - (long)puVar45 < 0x10) {
                  uVar43 = uVar38;
                  if (uVar31 <= uVar38) {
                    uVar43 = uVar31;
                  }
                  uVar11 = uVar38;
                  if (uVar38 <= uVar31) {
                    uVar11 = uVar31;
                  }
                  puVar49 = (undefined1 *)((long)puVar22 + ((uVar11 + uVar43 + sVar51) - uVar38));
                  puVar46 = (undefined1 *)((long)puVar22 + uVar11 + 0x10);
                  if (puVar49 <= puVar46) {
                    puVar49 = puVar46;
                  }
                  if ((undefined1 *)0x17 < puVar49 + (-9 - (long)(uVar11 + (long)puVar22))) {
                    if (0x1f < (ulong)((long)puVar30 - (long)puVar45)) {
                      puVar24 = puVar24 + 3;
                      uVar38 = ((ulong)(puVar49 + (-9 - (long)(uVar11 + (long)puVar22))) >> 3) + 1;
                      uVar43 = uVar38 & 0x3ffffffffffffffc;
                      puVar32 = (undefined8 *)((long)puVar22 + uVar11 + 0x18);
                      uVar31 = uVar43;
                      do {
                        puVar17 = puVar24 + -1;
                        uVar55 = puVar24[-2];
                        uVar57 = puVar24[1];
                        uVar56 = *puVar24;
                        uVar31 = uVar31 - 4;
                        puVar24 = puVar24 + 4;
                        puVar32[-1] = *puVar17;
                        puVar32[-2] = uVar55;
                        puVar32[1] = uVar57;
                        *puVar32 = uVar56;
                        puVar32 = puVar32 + 4;
                      } while (uVar31 != 0);
                      puVar30 = puVar30 + uVar43;
                      puVar45 = puVar45 + uVar43;
                      if (uVar38 == uVar43) goto joined_r0x00bbc3a4;
                    }
                  }
                  do {
                    puVar24 = puVar30 + 1;
                    *puVar30 = *puVar45;
                    puVar30 = puVar24;
                    puVar45 = puVar45 + 1;
                  } while (puVar24 < (undefined8 *)((long)puVar39 + uVar37));
                }
                else {
                  uVar55 = *puVar45;
                  puVar39[2] = puVar24[2];
                  *puVar30 = uVar55;
                  if (0x10 < uVar37 - 8) {
                    puVar45 = puVar39 + 3;
                    puVar24 = puVar24 + 5;
                    do {
                      uVar55 = puVar24[-2];
                      puVar45[1] = puVar24[-1];
                      *puVar45 = uVar55;
                      uVar55 = *puVar24;
                      puVar45[3] = puVar24[1];
                      puVar45[2] = uVar55;
                      puVar45 = puVar45 + 4;
                      puVar24 = puVar24 + 4;
                    } while (puVar45 < (undefined8 *)((long)puVar39 + uVar37));
                  }
                }
              }
            }
            else {
              uVar55 = *puVar24;
              puVar39[1] = puVar24[1];
              *puVar39 = uVar55;
              if (0x10 < uVar37) {
                puVar45 = puVar39 + 2;
                do {
                  uVar55 = puVar24[2];
                  puVar45[1] = puVar24[3];
                  *puVar45 = uVar55;
                  uVar55 = puVar24[4];
                  puVar45[3] = puVar24[5];
                  puVar45[2] = uVar55;
                  puVar45 = puVar45 + 4;
                  puVar24 = puVar24 + 4;
                } while (puVar45 < (undefined8 *)((long)puVar39 + uVar37));
              }
            }
          }
          else {
            local_150 = puVar5;
            local_148 = uVar37;
            sStack_140 = sVar51;
            local_138 = uVar38;
            uVar50 = FUN_00bbf92c(puVar25,puVar52,&local_148,&local_150,
                                  (undefined8 *)((long)param_1 + 0x176a4),puVar22,lVar23,puVar27);
          }
joined_r0x00bbc3a4:
          if (0xffffffffffffff88 < uVar50) goto LAB_00bbd584;
          puVar24 = puVar27;
          if (uVar42 <= uVar35 + lVar20) {
            puVar24 = puVar22;
          }
          puVar46 = (undefined1 *)((long)puVar24 + ((uVar35 + lVar20) - uVar42));
          Hint_Prefetch(puVar46,0,0,0);
          Hint_Prefetch(puVar46 + 0x40,0,0,0);
          *puVar29 = uVar35;
          local_130[uVar36 * 3 + 1] = uVar41;
          local_130[uVar36 * 3 + 2] = uVar42;
          puVar24 = (undefined8 *)((long)puVar25 + uVar50);
          local_208 = (undefined8 *)((long)param_1 + 0x176a4);
        }
        else {
          uVar50 = (ulong)(uVar18 & 7);
          uVar36 = local_130[uVar50 * 3];
          sVar51 = local_130[uVar50 * 3 + 1];
          uVar37 = local_130[uVar50 * 3 + 2];
          puVar39 = (undefined8 *)((long)puVar24 + uVar36);
          puVar45 = (undefined8 *)((long)local_150 + uVar36);
          puVar25 = (undefined8 *)((long)puVar39 - uVar37);
          Hint_Prefetch(puVar25,0,0,0);
          if ((local_208 < puVar45) ||
             (uVar50 = sVar51 + uVar36, puVar52 + -0x20 < (undefined1 *)((long)puVar24 + uVar50))) {
            local_148 = uVar36;
            sStack_140 = sVar51;
            local_138 = uVar37;
            uVar50 = FUN_00bbf92c(puVar24,puVar52,&local_148,&local_150,local_208,puVar22,lVar23,
                                  puVar27);
          }
          else {
            uVar55 = *local_150;
            puVar24[1] = local_150[1];
            *puVar24 = uVar55;
            if (0x10 < uVar36) {
              uVar55 = local_150[2];
              puVar24[3] = local_150[3];
              puVar24[2] = uVar55;
              if (0x10 < uVar36 - 0x10) {
                puVar30 = puVar24 + 4;
                puVar32 = local_150 + 6;
                do {
                  uVar55 = puVar32[-2];
                  puVar30[1] = puVar32[-1];
                  *puVar30 = uVar55;
                  uVar55 = *puVar32;
                  puVar30[3] = puVar32[1];
                  puVar30[2] = uVar55;
                  puVar30 = puVar30 + 4;
                  puVar32 = puVar32 + 4;
                } while (puVar30 < puVar39);
              }
            }
            uVar36 = (long)puVar39 - (long)puVar22;
            local_150 = puVar45;
            if (uVar36 < uVar37) {
              if ((ulong)((long)puVar39 - lVar23) < uVar37) goto LAB_00bbd5f4;
              lVar48 = (long)puVar25 - (long)puVar22;
              puVar46 = (undefined1 *)((long)puVar27 + lVar48);
              if (puVar46 + sVar51 <= puVar27) {
                memmove(puVar39,puVar46,sVar51);
                goto joined_r0x00bbc8d0;
              }
              memmove(puVar39,puVar46,-lVar48);
              puVar39 = (undefined8 *)((long)puVar39 - lVar48);
              puVar25 = puVar22;
              uVar38 = lVar48 + sVar51;
            }
            else {
              uVar38 = sVar51;
            }
            if (uVar37 < 0x10) {
              if (uVar37 < 8) {
                iVar6 = *(int *)(&DAT_00364d10 + uVar37 * 4);
                *(undefined1 *)puVar39 = *(undefined1 *)puVar25;
                *(undefined1 *)((long)puVar39 + 1) = *(undefined1 *)((long)puVar25 + 1);
                *(undefined1 *)((long)puVar39 + 2) = *(undefined1 *)((long)puVar25 + 2);
                *(undefined1 *)((long)puVar39 + 3) = *(undefined1 *)((long)puVar25 + 3);
                puVar10 = (undefined4 *)
                          ((long)puVar25 + (ulong)*(uint *)(&DAT_00364e10 + uVar37 * 4));
                puVar25 = (undefined8 *)((long)puVar10 - (long)iVar6);
                *(undefined4 *)((long)puVar39 + 4) = *puVar10;
              }
              else {
                *puVar39 = *puVar25;
              }
              if (8 < uVar38) {
                puVar45 = puVar25 + 1;
                puVar30 = puVar39 + 1;
                if ((long)puVar30 - (long)puVar45 < 0x10) {
                  uVar31 = uVar37;
                  if (uVar36 <= uVar37) {
                    uVar31 = uVar36;
                  }
                  uVar43 = uVar37;
                  if (uVar37 <= uVar36) {
                    uVar43 = uVar36;
                  }
                  puVar46 = (undefined1 *)((long)puVar22 + uVar43 + 0x10);
                  puVar49 = (undefined1 *)((long)puVar22 + ((uVar43 + uVar31 + sVar51) - uVar37));
                  if (puVar49 <= puVar46) {
                    puVar49 = puVar46;
                  }
                  if ((undefined1 *)0x17 < puVar49 + (-9 - (long)(uVar43 + (long)puVar22))) {
                    if (0x1f < (ulong)((long)puVar30 - (long)puVar45)) {
                      puVar25 = puVar25 + 3;
                      uVar36 = ((ulong)(puVar49 + (-9 - (long)(uVar43 + (long)puVar22))) >> 3) + 1;
                      uVar31 = uVar36 & 0x3ffffffffffffffc;
                      puVar32 = (undefined8 *)((long)puVar22 + uVar43 + 0x18);
                      uVar37 = uVar31;
                      do {
                        puVar17 = puVar25 + -1;
                        uVar55 = puVar25[-2];
                        uVar57 = puVar25[1];
                        uVar56 = *puVar25;
                        uVar37 = uVar37 - 4;
                        puVar25 = puVar25 + 4;
                        puVar32[-1] = *puVar17;
                        puVar32[-2] = uVar55;
                        puVar32[1] = uVar57;
                        *puVar32 = uVar56;
                        puVar32 = puVar32 + 4;
                      } while (uVar37 != 0);
                      puVar30 = puVar30 + uVar31;
                      puVar45 = puVar45 + uVar31;
                      if (uVar36 == uVar31) goto joined_r0x00bbc8d0;
                    }
                  }
                  do {
                    puVar25 = puVar30 + 1;
                    *puVar30 = *puVar45;
                    puVar30 = puVar25;
                    puVar45 = puVar45 + 1;
                  } while (puVar25 < (undefined8 *)((long)puVar39 + uVar38));
                }
                else {
                  uVar55 = *puVar45;
                  puVar39[2] = puVar25[2];
                  *puVar30 = uVar55;
                  if (0x10 < uVar38 - 8) {
                    puVar45 = puVar39 + 3;
                    puVar25 = puVar25 + 5;
                    do {
                      uVar55 = puVar25[-2];
                      puVar45[1] = puVar25[-1];
                      *puVar45 = uVar55;
                      uVar55 = *puVar25;
                      puVar45[3] = puVar25[1];
                      puVar45[2] = uVar55;
                      puVar45 = puVar45 + 4;
                      puVar25 = puVar25 + 4;
                    } while (puVar45 < (undefined8 *)((long)puVar39 + uVar38));
                  }
                }
                goto joined_r0x00bbc8d0;
              }
            }
            else {
              uVar55 = *puVar25;
              puVar39[1] = puVar25[1];
              *puVar39 = uVar55;
              if (0x10 < uVar38) {
                puVar45 = puVar39 + 2;
                do {
                  uVar55 = puVar25[2];
                  puVar45[1] = puVar25[3];
                  *puVar45 = uVar55;
                  uVar55 = puVar25[4];
                  puVar45[3] = puVar25[5];
                  puVar45[2] = uVar55;
                  puVar45 = puVar45 + 4;
                  puVar25 = puVar25 + 4;
                } while (puVar45 < (undefined8 *)((long)puVar39 + uVar38));
              }
            }
          }
          if (0xffffffffffffff88 < uVar50) goto LAB_00bbd584;
LAB_00bbb81c:
          uVar36 = (ulong)(uVar18 & 7);
          puVar25 = puVar27;
          if (uVar42 <= uVar35 + lVar20) {
            puVar25 = puVar22;
          }
          puVar46 = (undefined1 *)((long)puVar25 + ((uVar35 + lVar20) - uVar42));
          Hint_Prefetch(puVar46,0,0,0);
          Hint_Prefetch(puVar46 + 0x40,0,0,0);
          local_130[uVar36 * 3] = uVar35;
          local_130[uVar36 * 3 + 1] = uVar41;
          puVar24 = (undefined8 *)((long)puVar24 + uVar50);
          local_130[uVar36 * 3 + 2] = uVar42;
        }
        uVar50 = (ulong)(uVar18 + 1);
        lVar20 = uVar35 + lVar20 + uVar41;
      } while (uVar18 + 1 != param_6);
      uVar19 = param_6;
    }
    uVar50 = 0xffffffffffffffec;
    if ((puVar44 != param_4) || (iVar54 != 0x40)) goto LAB_00bbd584;
    uVar19 = uVar19 - uVar26;
    if ((int)uVar19 < (int)param_6) {
      puVar5 = (undefined8 *)((long)param_1 + 0x76a4);
LAB_00bbc9f4:
      uVar50 = (ulong)(uVar19 & 7);
      puVar44 = local_130 + uVar50 * 3;
      if ((int)param_1[0xed4] == 2) {
        uVar28 = *puVar44;
        puVar39 = (undefined8 *)param_1[0xed3];
        puVar25 = (undefined8 *)((long)local_150 + uVar28);
        if (puVar39 < puVar25) {
          uVar21 = (long)puVar39 - (long)local_150;
          puVar25 = puVar24;
          if (uVar21 != 0) {
            if ((ulong)((long)puVar52 - (long)puVar24) < uVar21) goto LAB_00bbd5e8;
            uVar28 = (long)puVar24 - (long)local_150;
            puVar25 = (undefined8 *)((long)puVar24 + uVar21);
            if (((long)uVar28 < -7) && (7 < uVar21)) {
              if ((uVar28 < 0xfffffffffffffff0) && (puVar39 = puVar25 + -4, puVar24 <= puVar39)) {
                uVar55 = *local_150;
                puVar24[1] = local_150[1];
                *puVar24 = uVar55;
                if (0x10 < (ulong)((long)puVar39 - (long)puVar24)) {
                  puVar45 = puVar24 + 2;
                  puVar30 = local_150;
                  do {
                    uVar55 = puVar30[2];
                    puVar45[1] = puVar30[3];
                    *puVar45 = uVar55;
                    uVar55 = puVar30[4];
                    puVar45[3] = puVar30[5];
                    puVar45[2] = uVar55;
                    puVar45 = puVar45 + 4;
                    puVar30 = puVar30 + 4;
                  } while (puVar45 < puVar39);
                }
                local_150 = (undefined8 *)((long)local_150 + ((long)puVar39 - (long)puVar24));
              }
              else {
                puVar39 = puVar24;
              }
              puVar46 = (undefined1 *)((long)puVar24 + (uVar21 - (long)puVar39));
              if ((puVar46 < (undefined1 *)0x8) || ((ulong)((long)puVar39 - (long)local_150) < 0x20)
                 ) {
                puVar24 = puVar39;
              }
              else {
                if (puVar46 < (undefined1 *)0x20) {
                  puVar47 = (undefined1 *)0x0;
                }
                else {
                  puVar47 = (undefined1 *)((ulong)puVar46 & 0xffffffffffffffe0);
                  puVar24 = local_150 + 2;
                  puVar45 = puVar39 + 2;
                  puVar49 = puVar47;
                  do {
                    puVar30 = puVar24 + -1;
                    uVar55 = puVar24[-2];
                    uVar57 = puVar24[1];
                    uVar56 = *puVar24;
                    puVar49 = puVar49 + -0x20;
                    puVar24 = puVar24 + 4;
                    puVar45[-1] = *puVar30;
                    puVar45[-2] = uVar55;
                    puVar45[1] = uVar57;
                    *puVar45 = uVar56;
                    puVar45 = puVar45 + 4;
                  } while (puVar49 != (undefined1 *)0x0);
                  if (puVar46 == puVar47) goto LAB_00bbce90;
                  if (((ulong)puVar46 & 0x18) == 0) {
                    local_150 = (undefined8 *)((long)local_150 + (long)puVar47);
                    puVar24 = (undefined8 *)((long)puVar39 + (long)puVar47);
                    goto LAB_00bbce7c;
                  }
                }
                puVar49 = (undefined1 *)((ulong)puVar46 & 0xfffffffffffffff8);
                lVar20 = (long)puVar47 - (long)puVar49;
                puVar24 = (undefined8 *)((long)puVar39 + (long)puVar47);
                puVar45 = (undefined8 *)((long)local_150 + (long)puVar47);
                do {
                  lVar20 = lVar20 + 8;
                  *puVar24 = *puVar45;
                  puVar24 = puVar24 + 1;
                  puVar45 = puVar45 + 1;
                } while (lVar20 != 0);
                puVar24 = (undefined8 *)((long)puVar39 + (long)puVar49);
                local_150 = (undefined8 *)((long)local_150 + (long)puVar49);
                if (puVar46 == puVar49) goto LAB_00bbce90;
              }
LAB_00bbce7c:
              do {
                puVar45 = (undefined8 *)((long)puVar24 + 1);
                *(undefined1 *)puVar24 = *(undefined1 *)local_150;
                puVar24 = puVar45;
                local_150 = (undefined8 *)((long)local_150 + 1);
              } while (puVar45 != (undefined8 *)((long)puVar39 + (long)puVar46));
            }
            else {
              puVar46 = (undefined1 *)((long)puVar24 + (long)puVar39) + -(long)local_150;
              if (puVar46 <= (undefined1 *)((long)puVar24 + 1U)) {
                puVar46 = (undefined1 *)((long)puVar24 + 1);
              }
              uVar40 = (long)puVar46 - (long)puVar24;
              if ((7 < uVar40) && (0x1f < uVar28)) {
                if (uVar40 < 0x20) {
                  uVar35 = 0;
                }
                else {
                  uVar35 = uVar40 & 0xffffffffffffffe0;
                  puVar39 = local_150 + 2;
                  puVar45 = puVar24 + 2;
                  uVar28 = uVar35;
                  do {
                    puVar30 = puVar39 + -1;
                    uVar55 = puVar39[-2];
                    uVar57 = puVar39[1];
                    uVar56 = *puVar39;
                    uVar28 = uVar28 - 0x20;
                    puVar39 = puVar39 + 4;
                    puVar45[-1] = *puVar30;
                    puVar45[-2] = uVar55;
                    puVar45[1] = uVar57;
                    *puVar45 = uVar56;
                    puVar45 = puVar45 + 4;
                  } while (uVar28 != 0);
                  if (uVar40 == uVar35) goto LAB_00bbce90;
                  if ((uVar40 & 0x18) == 0) {
                    puVar24 = (undefined8 *)((long)puVar24 + uVar35);
                    local_150 = (undefined8 *)((long)local_150 + uVar35);
                    goto LAB_00bbce60;
                  }
                }
                uVar28 = uVar40 & 0xfffffffffffffff8;
                lVar20 = uVar35 - uVar28;
                puVar39 = (undefined8 *)((long)local_150 + uVar35);
                puVar45 = (undefined8 *)((long)puVar24 + uVar35);
                do {
                  lVar20 = lVar20 + 8;
                  *puVar45 = *puVar39;
                  puVar39 = puVar39 + 1;
                  puVar45 = puVar45 + 1;
                } while (lVar20 != 0);
                puVar24 = (undefined8 *)((long)puVar24 + uVar28);
                local_150 = (undefined8 *)((long)local_150 + uVar28);
                if (uVar40 == uVar28) goto LAB_00bbce90;
              }
LAB_00bbce60:
              do {
                puVar39 = (undefined8 *)((long)puVar24 + 1);
                *(undefined1 *)puVar24 = *(undefined1 *)local_150;
                puVar24 = puVar39;
                local_150 = (undefined8 *)((long)local_150 + 1);
              } while (puVar39 < puVar25);
            }
LAB_00bbce90:
            uVar28 = *puVar44 - uVar21;
            *puVar44 = uVar28;
          }
          sVar51 = local_130[uVar50 * 3 + 1];
          uVar21 = local_130[uVar50 * 3 + 2];
          puVar39 = (undefined8 *)((long)puVar25 + uVar28);
          *(undefined4 *)(param_1 + 0xed4) = 0;
          puVar24 = (undefined8 *)((long)puVar39 - uVar21);
          Hint_Prefetch(puVar24,0,0,0);
          if (((long)uVar28 < 0x10001) &&
             (uVar50 = sVar51 + uVar28, (undefined1 *)((long)puVar25 + uVar50) <= puVar52 + -0x20))
          {
            uVar55 = *puVar5;
            puVar25[1] = *(undefined8 *)((long)param_1 + 0x76ac);
            *puVar25 = uVar55;
            if (0x10 < uVar28) {
              uVar55 = *(undefined8 *)((long)param_1 + 0x76b4);
              puVar25[3] = *(undefined8 *)((long)param_1 + 0x76bc);
              puVar25[2] = uVar55;
              if (0x10 < uVar28 - 0x10) {
                puVar45 = puVar25 + 4;
                puVar30 = (undefined8 *)((long)param_1 + 0x76d4);
                do {
                  uVar55 = puVar30[-2];
                  puVar45[1] = puVar30[-1];
                  *puVar45 = uVar55;
                  uVar55 = *puVar30;
                  puVar45[3] = puVar30[1];
                  puVar45[2] = uVar55;
                  puVar45 = puVar45 + 4;
                  puVar30 = puVar30 + 4;
                } while (puVar45 < puVar39);
              }
            }
            uVar40 = (long)puVar39 - (long)puVar22;
            local_150 = (undefined8 *)((long)puVar5 + uVar28);
            if (uVar40 < uVar21) {
              if ((ulong)((long)puVar39 - lVar23) < uVar21) goto LAB_00bbd5f4;
              lVar20 = (long)puVar24 - (long)puVar22;
              puVar46 = (undefined1 *)((long)puVar27 + lVar20);
              if (puVar46 + sVar51 <= puVar27) {
                memmove(puVar39,puVar46,sVar51);
                goto LAB_00bbc9d0;
              }
              memmove(puVar39,puVar46,-lVar20);
              puVar39 = (undefined8 *)((long)puVar39 - lVar20);
              puVar24 = puVar22;
              uVar28 = lVar20 + sVar51;
            }
            else {
              uVar28 = sVar51;
            }
            if (uVar21 < 0x10) {
              if (uVar21 < 8) {
                iVar33 = *(int *)(&DAT_00364d10 + uVar21 * 4);
                *(undefined1 *)puVar39 = *(undefined1 *)puVar24;
                *(undefined1 *)((long)puVar39 + 1) = *(undefined1 *)((long)puVar24 + 1);
                *(undefined1 *)((long)puVar39 + 2) = *(undefined1 *)((long)puVar24 + 2);
                *(undefined1 *)((long)puVar39 + 3) = *(undefined1 *)((long)puVar24 + 3);
                puVar10 = (undefined4 *)
                          ((long)puVar24 + (ulong)*(uint *)(&DAT_00364e10 + uVar21 * 4));
                puVar24 = (undefined8 *)((long)puVar10 - (long)iVar33);
                *(undefined4 *)((long)puVar39 + 4) = *puVar10;
              }
              else {
                *puVar39 = *puVar24;
              }
              if (8 < uVar28) {
                puVar45 = puVar24 + 1;
                puVar30 = puVar39 + 1;
                if ((long)puVar30 - (long)puVar45 < 0x10) {
                  uVar35 = uVar21;
                  if (uVar40 <= uVar21) {
                    uVar35 = uVar40;
                  }
                  uVar41 = uVar21;
                  if (uVar21 <= uVar40) {
                    uVar41 = uVar40;
                  }
                  puVar46 = (undefined1 *)((long)puVar22 + uVar41 + 0x10);
                  puVar49 = (undefined1 *)((long)puVar22 + ((uVar41 + uVar35 + sVar51) - uVar21));
                  if (puVar49 <= puVar46) {
                    puVar49 = puVar46;
                  }
                  if ((undefined1 *)0x17 < puVar49 + (-9 - (long)(uVar41 + (long)puVar22))) {
                    if (0x1f < (ulong)((long)puVar30 - (long)puVar45)) {
                      puVar24 = puVar24 + 3;
                      uVar21 = ((ulong)(puVar49 + (-9 - (long)(uVar41 + (long)puVar22))) >> 3) + 1;
                      uVar35 = uVar21 & 0x3ffffffffffffffc;
                      puVar32 = (undefined8 *)((long)puVar22 + uVar41 + 0x18);
                      uVar40 = uVar35;
                      do {
                        puVar17 = puVar24 + -1;
                        uVar55 = puVar24[-2];
                        uVar57 = puVar24[1];
                        uVar56 = *puVar24;
                        uVar40 = uVar40 - 4;
                        puVar24 = puVar24 + 4;
                        puVar32[-1] = *puVar17;
                        puVar32[-2] = uVar55;
                        puVar32[1] = uVar57;
                        *puVar32 = uVar56;
                        puVar32 = puVar32 + 4;
                      } while (uVar40 != 0);
                      puVar30 = puVar30 + uVar35;
                      puVar45 = puVar45 + uVar35;
                      if (uVar21 == uVar35) goto LAB_00bbc9d0;
                    }
                  }
                  do {
                    puVar24 = puVar30 + 1;
                    *puVar30 = *puVar45;
                    puVar30 = puVar24;
                    puVar45 = puVar45 + 1;
                  } while (puVar24 < (undefined8 *)((long)puVar39 + uVar28));
                }
                else {
                  uVar55 = *puVar45;
                  puVar39[2] = puVar24[2];
                  *puVar30 = uVar55;
                  if (0x10 < uVar28 - 8) {
                    puVar45 = puVar39 + 3;
                    puVar24 = puVar24 + 5;
                    do {
                      uVar55 = puVar24[-2];
                      puVar45[1] = puVar24[-1];
                      *puVar45 = uVar55;
                      uVar55 = *puVar24;
                      puVar45[3] = puVar24[1];
                      puVar45[2] = uVar55;
                      puVar45 = puVar45 + 4;
                      puVar24 = puVar24 + 4;
                    } while (puVar45 < (undefined8 *)((long)puVar39 + uVar28));
                  }
                }
              }
            }
            else {
              uVar55 = *puVar24;
              puVar39[1] = puVar24[1];
              *puVar39 = uVar55;
              if (0x10 < uVar28) {
                puVar45 = puVar39 + 2;
                do {
                  uVar55 = puVar24[2];
                  puVar45[1] = puVar24[3];
                  *puVar45 = uVar55;
                  uVar55 = puVar24[4];
                  puVar45[3] = puVar24[5];
                  puVar45[2] = uVar55;
                  puVar45 = puVar45 + 4;
                  puVar24 = puVar24 + 4;
                } while (puVar45 < (undefined8 *)((long)puVar39 + uVar28));
              }
            }
          }
          else {
            local_150 = puVar5;
            local_148 = uVar28;
            sStack_140 = sVar51;
            local_138 = uVar21;
            uVar50 = FUN_00bbf92c(puVar25,puVar52,&local_148,&local_150,
                                  (undefined8 *)((long)param_1 + 0x176a4),puVar22,lVar23,puVar27);
          }
LAB_00bbc9d0:
          if (0xffffffffffffff88 < uVar50) goto LAB_00bbd584;
          puVar24 = (undefined8 *)((long)puVar25 + uVar50);
          local_208 = (undefined8 *)((long)param_1 + 0x176a4);
          goto LAB_00bbc9e4;
        }
        sVar51 = local_130[uVar50 * 3 + 1];
        uVar21 = local_130[uVar50 * 3 + 2];
        if ((puVar25 <= local_208) &&
           (uVar50 = sVar51 + uVar28, (undefined8 *)((long)puVar24 + uVar50) <= puVar25 + -4)) {
          uVar55 = *local_150;
          puVar45 = (undefined8 *)((long)puVar24 + uVar28);
          puVar24[1] = local_150[1];
          *puVar24 = uVar55;
          if (0x10 < uVar28) {
            uVar55 = local_150[2];
            puVar24[3] = local_150[3];
            puVar24[2] = uVar55;
            if (0x10 < uVar28 - 0x10) {
              puVar39 = puVar24 + 4;
              puVar30 = local_150 + 6;
              do {
                uVar55 = puVar30[-2];
                puVar39[1] = puVar30[-1];
                *puVar39 = uVar55;
                uVar55 = *puVar30;
                puVar39[3] = puVar30[1];
                puVar39[2] = uVar55;
                puVar39 = puVar39 + 4;
                puVar30 = puVar30 + 4;
              } while (puVar39 < puVar45);
            }
          }
          uVar28 = (long)puVar45 - (long)puVar22;
          puVar39 = (undefined8 *)((long)puVar45 - uVar21);
          local_150 = puVar25;
          if (uVar28 < uVar21) {
            if ((ulong)((long)puVar45 - lVar23) < uVar21) goto LAB_00bbd5f4;
            lVar20 = (long)puVar39 - (long)puVar22;
            puVar46 = (undefined1 *)((long)puVar27 + lVar20);
            if (puVar46 + sVar51 <= puVar27) goto LAB_00bbcd08;
            memmove(puVar45,puVar46,-lVar20);
            puVar45 = (undefined8 *)((long)puVar45 - lVar20);
            puVar39 = puVar22;
            uVar40 = lVar20 + sVar51;
          }
          else {
            uVar40 = sVar51;
          }
          if (uVar21 < 0x10) {
            if (uVar21 < 8) {
              iVar33 = *(int *)(&DAT_00364d10 + uVar21 * 4);
              *(undefined1 *)puVar45 = *(undefined1 *)puVar39;
              *(undefined1 *)((long)puVar45 + 1) = *(undefined1 *)((long)puVar39 + 1);
              *(undefined1 *)((long)puVar45 + 2) = *(undefined1 *)((long)puVar39 + 2);
              *(undefined1 *)((long)puVar45 + 3) = *(undefined1 *)((long)puVar39 + 3);
              uVar26 = *(uint *)(&DAT_00364e10 + uVar21 * 4);
              *(undefined4 *)((long)puVar45 + 4) = *(undefined4 *)((long)puVar39 + (ulong)uVar26);
              puVar39 = (undefined8 *)((long)((long)puVar39 + (ulong)uVar26) - (long)iVar33);
            }
            else {
              *puVar45 = *puVar39;
            }
            if (8 < uVar40) {
              puVar25 = puVar39 + 1;
              puVar30 = puVar45 + 1;
              if ((long)puVar30 - (long)puVar25 < 0x10) {
                uVar35 = uVar21;
                if (uVar28 <= uVar21) {
                  uVar35 = uVar28;
                }
                uVar41 = uVar21;
                if (uVar21 <= uVar28) {
                  uVar41 = uVar28;
                }
                puVar46 = (undefined1 *)((long)puVar22 + uVar41 + 0x10);
                puVar49 = (undefined1 *)((long)puVar22 + ((uVar41 + uVar35 + sVar51) - uVar21));
                if (puVar49 <= puVar46) {
                  puVar49 = puVar46;
                }
                if ((undefined1 *)0x17 < puVar49 + (-9 - (long)(uVar41 + (long)puVar22))) {
                  if (0x1f < (ulong)((long)puVar30 - (long)puVar25)) {
                    puVar39 = puVar39 + 3;
                    uVar28 = ((ulong)(puVar49 + (-9 - (long)(uVar41 + (long)puVar22))) >> 3) + 1;
                    uVar35 = uVar28 & 0x3ffffffffffffffc;
                    puVar32 = (undefined8 *)((long)puVar22 + uVar41 + 0x18);
                    uVar21 = uVar35;
                    do {
                      puVar17 = puVar39 + -1;
                      uVar55 = puVar39[-2];
                      uVar57 = puVar39[1];
                      uVar56 = *puVar39;
                      uVar21 = uVar21 - 4;
                      puVar39 = puVar39 + 4;
                      puVar32[-1] = *puVar17;
                      puVar32[-2] = uVar55;
                      puVar32[1] = uVar57;
                      *puVar32 = uVar56;
                      puVar32 = puVar32 + 4;
                    } while (uVar21 != 0);
                    puVar30 = puVar30 + uVar35;
                    puVar25 = puVar25 + uVar35;
                    if (uVar28 == uVar35) goto LAB_00bbcd28;
                  }
                }
                do {
                  puVar39 = puVar30 + 1;
                  *puVar30 = *puVar25;
                  puVar30 = puVar39;
                  puVar25 = puVar25 + 1;
                } while (puVar39 < (undefined8 *)((long)puVar45 + uVar40));
              }
              else {
                uVar55 = *puVar25;
                puVar45[2] = puVar39[2];
                *puVar30 = uVar55;
                if (0x10 < uVar40 - 8) {
                  puVar25 = puVar45 + 3;
                  puVar39 = puVar39 + 5;
                  do {
                    uVar55 = puVar39[-2];
                    puVar25[1] = puVar39[-1];
                    *puVar25 = uVar55;
                    uVar55 = *puVar39;
                    puVar25[3] = puVar39[1];
                    puVar25[2] = uVar55;
                    puVar25 = puVar25 + 4;
                    puVar39 = puVar39 + 4;
                  } while (puVar25 < (undefined8 *)((long)puVar45 + uVar40));
                }
              }
            }
          }
          else {
            uVar55 = *puVar39;
            puVar45[1] = puVar39[1];
            *puVar45 = uVar55;
            if (0x10 < uVar40) {
              puVar25 = puVar45 + 2;
              do {
                uVar55 = puVar39[2];
                puVar25[1] = puVar39[3];
                *puVar25 = uVar55;
                uVar55 = puVar39[4];
                puVar25[3] = puVar39[5];
                puVar25[2] = uVar55;
                puVar25 = puVar25 + 4;
                puVar39 = puVar39 + 4;
              } while (puVar25 < (undefined8 *)((long)puVar45 + uVar40));
            }
          }
          goto LAB_00bbcd28;
        }
        local_148 = uVar28;
        sStack_140 = sVar51;
        local_138 = uVar21;
        uVar50 = FUN_00bc006c(puVar24,puVar52,puVar25 + -4,&local_148,&local_150,local_208,puVar22,
                              lVar23,puVar27);
      }
      else {
        uVar28 = *puVar44;
        sVar51 = local_130[uVar50 * 3 + 1];
        uVar21 = local_130[uVar50 * 3 + 2];
        uVar50 = sVar51 + uVar28;
        puVar45 = (undefined8 *)((long)puVar24 + uVar28);
        puVar39 = (undefined8 *)((long)local_150 + uVar28);
        puVar25 = (undefined8 *)((long)puVar45 - uVar21);
        Hint_Prefetch(puVar25,0,0,0);
        if (local_208 < puVar39 || puVar52 + -0x20 < (undefined1 *)((long)puVar24 + uVar50)) {
          local_148 = uVar28;
          sStack_140 = sVar51;
          local_138 = uVar21;
          uVar50 = FUN_00bbf92c(puVar24,puVar52,&local_148,&local_150,local_208,puVar22,lVar23,
                                puVar27);
        }
        else {
          uVar55 = *local_150;
          puVar24[1] = local_150[1];
          *puVar24 = uVar55;
          if (0x10 < uVar28) {
            uVar55 = local_150[2];
            puVar24[3] = local_150[3];
            puVar24[2] = uVar55;
            if (0x10 < uVar28 - 0x10) {
              puVar30 = puVar24 + 4;
              puVar32 = local_150 + 6;
              do {
                uVar55 = puVar32[-2];
                puVar30[1] = puVar32[-1];
                *puVar30 = uVar55;
                uVar55 = *puVar32;
                puVar30[3] = puVar32[1];
                puVar30[2] = uVar55;
                puVar30 = puVar30 + 4;
                puVar32 = puVar32 + 4;
              } while (puVar30 < puVar45);
            }
          }
          uVar28 = (long)puVar45 - (long)puVar22;
          local_150 = puVar39;
          if (uVar28 < uVar21) {
            if ((ulong)((long)puVar45 - lVar23) < uVar21) goto LAB_00bbd5f4;
            lVar20 = (long)puVar25 - (long)puVar22;
            puVar46 = (undefined1 *)((long)puVar27 + lVar20);
            if (puVar46 + sVar51 <= puVar27) {
LAB_00bbcd08:
              memmove(puVar45,puVar46,sVar51);
              goto LAB_00bbcd28;
            }
            memmove(puVar45,puVar46,-lVar20);
            puVar45 = (undefined8 *)((long)puVar45 - lVar20);
            puVar25 = puVar22;
            uVar40 = lVar20 + sVar51;
          }
          else {
            uVar40 = sVar51;
          }
          if (uVar21 < 0x10) {
            if (uVar21 < 8) {
              iVar33 = *(int *)(&DAT_00364d10 + uVar21 * 4);
              *(undefined1 *)puVar45 = *(undefined1 *)puVar25;
              *(undefined1 *)((long)puVar45 + 1) = *(undefined1 *)((long)puVar25 + 1);
              *(undefined1 *)((long)puVar45 + 2) = *(undefined1 *)((long)puVar25 + 2);
              *(undefined1 *)((long)puVar45 + 3) = *(undefined1 *)((long)puVar25 + 3);
              puVar10 = (undefined4 *)((long)puVar25 + (ulong)*(uint *)(&DAT_00364e10 + uVar21 * 4))
              ;
              puVar25 = (undefined8 *)((long)puVar10 - (long)iVar33);
              *(undefined4 *)((long)puVar45 + 4) = *puVar10;
            }
            else {
              *puVar45 = *puVar25;
            }
            if (8 < uVar40) {
              puVar39 = puVar25 + 1;
              puVar30 = puVar45 + 1;
              if ((long)puVar30 - (long)puVar39 < 0x10) {
                uVar35 = uVar21;
                if (uVar28 <= uVar21) {
                  uVar35 = uVar28;
                }
                uVar41 = uVar21;
                if (uVar21 <= uVar28) {
                  uVar41 = uVar28;
                }
                puVar46 = (undefined1 *)((long)puVar22 + uVar41 + 0x10);
                puVar49 = (undefined1 *)((long)puVar22 + ((uVar41 + uVar35 + sVar51) - uVar21));
                if (puVar49 <= puVar46) {
                  puVar49 = puVar46;
                }
                if ((undefined1 *)0x17 < puVar49 + (-9 - (long)(uVar41 + (long)puVar22))) {
                  if (0x1f < (ulong)((long)puVar30 - (long)puVar39)) {
                    puVar25 = puVar25 + 3;
                    uVar28 = ((ulong)(puVar49 + (-9 - (long)(uVar41 + (long)puVar22))) >> 3) + 1;
                    uVar35 = uVar28 & 0x3ffffffffffffffc;
                    puVar32 = (undefined8 *)((long)puVar22 + uVar41 + 0x18);
                    uVar21 = uVar35;
                    do {
                      puVar17 = puVar25 + -1;
                      uVar55 = puVar25[-2];
                      uVar57 = puVar25[1];
                      uVar56 = *puVar25;
                      uVar21 = uVar21 - 4;
                      puVar25 = puVar25 + 4;
                      puVar32[-1] = *puVar17;
                      puVar32[-2] = uVar55;
                      puVar32[1] = uVar57;
                      *puVar32 = uVar56;
                      puVar32 = puVar32 + 4;
                    } while (uVar21 != 0);
                    puVar30 = puVar30 + uVar35;
                    puVar39 = puVar39 + uVar35;
                    if (uVar28 == uVar35) goto LAB_00bbcd28;
                  }
                }
                do {
                  puVar25 = puVar30 + 1;
                  *puVar30 = *puVar39;
                  puVar30 = puVar25;
                  puVar39 = puVar39 + 1;
                } while (puVar25 < (undefined8 *)((long)puVar45 + uVar40));
              }
              else {
                uVar55 = *puVar39;
                puVar45[2] = puVar25[2];
                *puVar30 = uVar55;
                if (0x10 < uVar40 - 8) {
                  puVar39 = puVar45 + 3;
                  puVar25 = puVar25 + 5;
                  do {
                    uVar55 = puVar25[-2];
                    puVar39[1] = puVar25[-1];
                    *puVar39 = uVar55;
                    uVar55 = *puVar25;
                    puVar39[3] = puVar25[1];
                    puVar39[2] = uVar55;
                    puVar39 = puVar39 + 4;
                    puVar25 = puVar25 + 4;
                  } while (puVar39 < (undefined8 *)((long)puVar45 + uVar40));
                }
              }
            }
          }
          else {
            uVar55 = *puVar25;
            puVar45[1] = puVar25[1];
            *puVar45 = uVar55;
            if (0x10 < uVar40) {
              puVar39 = puVar45 + 2;
              do {
                uVar55 = puVar25[2];
                puVar39[1] = puVar25[3];
                *puVar39 = uVar55;
                uVar55 = puVar25[4];
                puVar39[3] = puVar25[5];
                puVar39[2] = uVar55;
                puVar39 = puVar39 + 4;
                puVar25 = puVar25 + 4;
              } while (puVar39 < (undefined8 *)((long)puVar45 + uVar40));
            }
          }
        }
      }
LAB_00bbcd28:
      if (0xffffffffffffff88 < uVar50) goto LAB_00bbd584;
      puVar24 = (undefined8 *)((long)puVar24 + uVar50);
LAB_00bbc9e4:
      uVar19 = uVar19 + 1;
      if (uVar19 == param_6) goto LAB_00bbd5b4;
      goto LAB_00bbc9f4;
    }
LAB_00bbd5b4:
    *(uint *)((long)param_1 + 0x683c) = (uint)uVar42;
    *(int *)(param_1 + 0xd08) = (int)uVar53;
    *(int *)((long)param_1 + 0x6844) = (int)local_188;
    puVar22 = local_150;
    if ((int)param_1[0xed4] == 2) goto LAB_00bbb1c4;
LAB_00bbb1f8:
    sVar51 = (long)local_208 - (long)puVar22;
    if (sVar51 <= (ulong)((long)puVar52 - (long)puVar24)) {
      if (puVar24 == (undefined8 *)0x0) {
        puVar52 = (undefined1 *)0x0;
      }
      else {
        memmove(puVar24,puVar22,sVar51);
        puVar52 = (undefined1 *)((long)puVar24 + sVar51);
      }
      uVar50 = (long)puVar52 - (long)param_2;
      goto LAB_00bbd584;
    }
  }
  uVar50 = 0xffffffffffffffba;
LAB_00bbd584:
  if (*(long *)(lVar16 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar50);
  }
  return;
LAB_00bbd5e8:
  uVar50 = 0xffffffffffffffba;
  goto LAB_00bbd584;
LAB_00bbd5f4:
  uVar50 = 0xffffffffffffffec;
  goto LAB_00bbd584;
}

