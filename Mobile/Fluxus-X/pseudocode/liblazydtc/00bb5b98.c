/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bb5b98
 */

/* WARNING: Type propagation algorithm not settling */

void HUF_decompress4X_usingDTable
               (ulong *param_1,ulong param_2,ushort *param_3,ulong param_4,uint *param_5,
               uint param_6)

{
  ulong *puVar1;
  ulong *puVar2;
  ulong *puVar3;
  undefined2 *puVar4;
  undefined2 *puVar5;
  undefined2 *puVar6;
  undefined2 *puVar7;
  uint *puVar8;
  ulong *puVar9;
  uint *puVar10;
  uint *puVar11;
  uint *puVar12;
  byte *pbVar13;
  byte *pbVar14;
  byte *pbVar15;
  byte *pbVar16;
  byte bVar17;
  byte bVar18;
  byte bVar19;
  byte bVar20;
  byte bVar21;
  byte bVar22;
  byte bVar23;
  byte bVar24;
  byte bVar25;
  ushort uVar26;
  ushort uVar27;
  ushort uVar28;
  ushort uVar29;
  uint uVar30;
  long lVar31;
  bool bVar32;
  ulong uVar33;
  ulong *puVar34;
  ulong *puVar35;
  long lVar36;
  ulong *puVar37;
  int iVar38;
  uint uVar39;
  ulong *puVar40;
  undefined2 *puVar41;
  ulong *puVar42;
  uint uVar43;
  ulong *puVar44;
  uint uVar45;
  ulong *puVar46;
  uint uVar47;
  uint uVar48;
  ulong *puVar49;
  byte *pbVar50;
  uint uVar51;
  ulong uVar52;
  ulong *puVar53;
  ulong *puVar54;
  long lVar55;
  ulong *puVar56;
  ulong *puVar57;
  int iVar58;
  ulong uVar59;
  ulong uVar60;
  int iVar61;
  ulong uVar62;
  int iVar63;
  ulong uVar64;
  ulong uVar65;
  ulong *puVar66;
  ulong *local_190;
  uint uStack_184;
  ulong *local_168;
  ulong *local_138;
  ulong local_130;
  ulong *local_128;
  ulong local_120;
  ulong local_118;
  ulong *local_108;
  undefined8 local_100;
  ulong *local_f8;
  ulong *local_f0;
  ulong *local_e8 [4];
  ulong local_c8 [4];
  long local_a8;
  ulong *local_a0;
  long local_98;
  long local_90 [4];
  long local_70;
  
  if (*(char *)((long)param_5 + 1) == '\0') {
    lVar31 = tpidr_el0;
    local_70 = *(long *)(lVar31 + 0x28);
    if ((param_6 >> 5 & 1) == 0) {
      uVar33 = FUN_00bba0f0(&local_108,param_1,param_2,param_3,param_4,param_5);
      if (uVar33 - 1 < 0xffffffffffffff87 || uVar33 == 0xffffffffffffff88) {
        uVar33 = (ulong)(local_98 - (long)local_e8[3]) / 5;
        uVar59 = (ulong)((long)local_108 - (long)local_a0) / 7;
        if (uVar59 <= uVar33) {
          uVar33 = uVar59;
        }
        if (uVar33 != 0) {
          puVar41 = (undefined2 *)((long)local_e8[3] + uVar33 * 5);
          do {
            if (((local_100 < local_108) || (local_f8 < local_100)) || (local_f0 < local_f8)) break;
            uVar33 = local_98 - (long)local_e8[3];
            do {
              uVar33 = uVar33 - 5;
              uVar26 = *(ushort *)(local_a8 + (local_c8[0] >> 0x35) * 2);
              local_c8[0] = local_c8[0] << ((ulong)uVar26 & 0x3f);
              *(char *)local_e8[0] = (char)(uVar26 >> 8);
              uVar26 = *(ushort *)(local_a8 + (local_c8[1] >> 0x35) * 2);
              local_c8[1] = local_c8[1] << ((ulong)uVar26 & 0x3f);
              *(char *)local_e8[1] = (char)(uVar26 >> 8);
              uVar26 = *(ushort *)(local_a8 + (local_c8[2] >> 0x35) * 2);
              local_c8[2] = local_c8[2] << ((ulong)uVar26 & 0x3f);
              *(char *)local_e8[2] = (char)(uVar26 >> 8);
              uVar26 = *(ushort *)(local_a8 + (local_c8[3] >> 0x35) * 2);
              local_c8[3] = local_c8[3] << ((ulong)uVar26 & 0x3f);
              *(char *)local_e8[3] = (char)(uVar26 >> 8);
              uVar26 = *(ushort *)(local_a8 + (local_c8[0] >> 0x35) * 2);
              local_c8[0] = local_c8[0] << ((ulong)uVar26 & 0x3f);
              *(char *)((long)local_e8[0] + 1) = (char)(uVar26 >> 8);
              uVar26 = *(ushort *)(local_a8 + (local_c8[1] >> 0x35) * 2);
              local_c8[1] = local_c8[1] << ((ulong)uVar26 & 0x3f);
              *(char *)((long)local_e8[1] + 1) = (char)(uVar26 >> 8);
              uVar26 = *(ushort *)(local_a8 + (local_c8[2] >> 0x35) * 2);
              local_c8[2] = local_c8[2] << ((ulong)uVar26 & 0x3f);
              *(char *)((long)local_e8[2] + 1) = (char)(uVar26 >> 8);
              uVar26 = *(ushort *)(local_a8 + (local_c8[3] >> 0x35) * 2);
              local_c8[3] = local_c8[3] << ((ulong)uVar26 & 0x3f);
              *(char *)((long)local_e8[3] + 1) = (char)(uVar26 >> 8);
              uVar26 = *(ushort *)(local_a8 + (local_c8[0] >> 0x35) * 2);
              local_c8[0] = local_c8[0] << ((ulong)uVar26 & 0x3f);
              *(char *)((long)local_e8[0] + 2) = (char)(uVar26 >> 8);
              uVar26 = *(ushort *)(local_a8 + (local_c8[1] >> 0x35) * 2);
              local_c8[1] = local_c8[1] << ((ulong)uVar26 & 0x3f);
              *(char *)((long)local_e8[1] + 2) = (char)(uVar26 >> 8);
              uVar26 = *(ushort *)(local_a8 + (local_c8[2] >> 0x35) * 2);
              local_c8[2] = local_c8[2] << ((ulong)uVar26 & 0x3f);
              *(char *)((long)local_e8[2] + 2) = (char)(uVar26 >> 8);
              uVar26 = *(ushort *)(local_a8 + (local_c8[3] >> 0x35) * 2);
              local_c8[3] = local_c8[3] << ((ulong)uVar26 & 0x3f);
              *(char *)((long)local_e8[3] + 2) = (char)(uVar26 >> 8);
              uVar26 = *(ushort *)(local_a8 + (local_c8[0] >> 0x35) * 2);
              local_c8[0] = local_c8[0] << ((ulong)uVar26 & 0x3f);
              *(char *)((long)local_e8[0] + 3) = (char)(uVar26 >> 8);
              uVar26 = *(ushort *)(local_a8 + (local_c8[1] >> 0x35) * 2);
              local_c8[1] = local_c8[1] << ((ulong)uVar26 & 0x3f);
              *(char *)((long)local_e8[1] + 3) = (char)(uVar26 >> 8);
              uVar26 = *(ushort *)(local_a8 + (local_c8[2] >> 0x35) * 2);
              local_c8[2] = local_c8[2] << ((ulong)uVar26 & 0x3f);
              *(char *)((long)local_e8[2] + 3) = (char)(uVar26 >> 8);
              uVar26 = *(ushort *)(local_a8 + (local_c8[3] >> 0x35) * 2);
              local_c8[3] = local_c8[3] << ((ulong)uVar26 & 0x3f);
              *(char *)((long)local_e8[3] + 3) = (char)(uVar26 >> 8);
              uVar26 = *(ushort *)(local_a8 + (local_c8[0] >> 0x35) * 2);
              local_c8[0] = local_c8[0] << ((ulong)uVar26 & 0x3f);
              *(char *)((long)local_e8[0] + 4) = (char)(uVar26 >> 8);
              local_e8[0] = (ulong *)((long)local_e8[0] + 5);
              uVar26 = *(ushort *)(local_a8 + (local_c8[1] >> 0x35) * 2);
              local_c8[1] = local_c8[1] << ((ulong)uVar26 & 0x3f);
              *(char *)((long)local_e8[1] + 4) = (char)(uVar26 >> 8);
              uVar59 = (local_c8[1] & 0xaaaaaaaaaaaaaaaa) >> 1 |
                       (local_c8[1] & 0x5555555555555555) << 1;
              uVar59 = (uVar59 & 0xcccccccccccccccc) >> 2 | (uVar59 & 0x3333333333333333) << 2;
              uVar59 = (uVar59 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar59 & 0xf0f0f0f0f0f0f0f) << 4;
              uVar59 = (uVar59 & 0xff00ff00ff00ff00) >> 8 | (uVar59 & 0xff00ff00ff00ff) << 8;
              uVar59 = (uVar59 & 0xffff0000ffff0000) >> 0x10 | (uVar59 & 0xffff0000ffff) << 0x10;
              local_e8[1] = (ulong *)((long)local_e8[1] + 5);
              uVar26 = *(ushort *)(local_a8 + (local_c8[2] >> 0x35) * 2);
              uVar52 = LZCOUNT(uVar59 >> 0x20 | uVar59 << 0x20);
              local_100 = (ulong *)((long)local_100 - (uVar52 >> 3));
              *(char *)((long)local_e8[2] + 4) = (char)(uVar26 >> 8);
              local_c8[2] = local_c8[2] << ((ulong)uVar26 & 0x3f);
              uVar59 = (local_c8[0] & 0xaaaaaaaaaaaaaaaa) >> 1 |
                       (local_c8[0] & 0x5555555555555555) << 1;
              uVar59 = (uVar59 & 0xcccccccccccccccc) >> 2 | (uVar59 & 0x3333333333333333) << 2;
              uVar59 = (uVar59 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar59 & 0xf0f0f0f0f0f0f0f) << 4;
              uVar59 = (uVar59 & 0xff00ff00ff00ff00) >> 8 | (uVar59 & 0xff00ff00ff00ff) << 8;
              uVar59 = (uVar59 & 0xffff0000ffff0000) >> 0x10 | (uVar59 & 0xffff0000ffff) << 0x10;
              uVar26 = *(ushort *)(local_a8 + (local_c8[3] >> 0x35) * 2);
              local_e8[2] = (ulong *)((long)local_e8[2] + 5);
              uVar62 = (local_c8[2] & 0xaaaaaaaaaaaaaaaa) >> 1 |
                       (local_c8[2] & 0x5555555555555555) << 1;
              uVar62 = (uVar62 & 0xcccccccccccccccc) >> 2 | (uVar62 & 0x3333333333333333) << 2;
              uVar62 = (uVar62 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar62 & 0xf0f0f0f0f0f0f0f) << 4;
              uVar62 = (uVar62 & 0xff00ff00ff00ff00) >> 8 | (uVar62 & 0xff00ff00ff00ff) << 8;
              uVar62 = (uVar62 & 0xffff0000ffff0000) >> 0x10 | (uVar62 & 0xffff0000ffff) << 0x10;
              uVar60 = LZCOUNT(uVar59 >> 0x20 | uVar59 << 0x20);
              local_c8[3] = local_c8[3] << ((ulong)uVar26 & 0x3f);
              local_108 = (ulong *)((long)local_108 - (uVar60 >> 3));
              uVar62 = LZCOUNT(uVar62 >> 0x20 | uVar62 << 0x20);
              uVar59 = (local_c8[3] & 0xaaaaaaaaaaaaaaaa) >> 1 |
                       (local_c8[3] & 0x5555555555555555) << 1;
              uVar59 = (uVar59 & 0xcccccccccccccccc) >> 2 | (uVar59 & 0x3333333333333333) << 2;
              uVar59 = (uVar59 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar59 & 0xf0f0f0f0f0f0f0f) << 4;
              uVar59 = (uVar59 & 0xff00ff00ff00ff00) >> 8 | (uVar59 & 0xff00ff00ff00ff) << 8;
              uVar59 = (uVar59 & 0xffff0000ffff0000) >> 0x10 | (uVar59 & 0xffff0000ffff) << 0x10;
              local_f8 = (ulong *)((long)local_f8 - (uVar62 >> 3));
              *(char *)((long)local_e8[3] + 4) = (char)(uVar26 >> 8);
              uVar59 = LZCOUNT(uVar59 >> 0x20 | uVar59 << 0x20);
              local_e8[3] = (ulong *)((long)local_e8[3] + 5);
              local_f0 = (ulong *)((long)local_f0 - (uVar59 >> 3));
              local_c8[0] = (*local_108 | 1) << (uVar60 & 7);
              local_c8[2] = (*local_f8 | 1) << (uVar62 & 7);
              local_c8[1] = (*local_100 | 1) << (uVar52 & 7);
              local_c8[3] = (*local_f0 | 1) << (uVar59 & 7);
            } while (local_e8[3] < puVar41);
            uVar62 = (ulong)((long)local_108 - (long)local_a0) / 7;
            uVar59 = uVar33 / 5;
            if (uVar62 <= uVar33 / 5) {
              uVar59 = uVar62;
            }
            puVar41 = (undefined2 *)((long)local_e8[3] + uVar59 * 5);
          } while (uVar59 != 0);
        }
        lVar55 = 0;
        uVar33 = param_2 + 3 >> 2;
        puVar3 = (ulong *)((long)param_1 + (param_2 & ((long)param_2 >> 0x3f ^ 0xffffffffffffffffU))
                          );
        puVar53 = param_1;
        do {
          uVar59 = (long)puVar3 - (long)puVar53;
          puVar37 = (ulong *)((long)puVar53 + uVar33);
          puVar34 = local_e8[lVar55];
          puVar53 = puVar3;
          if (uVar33 <= uVar59) {
            puVar53 = puVar37;
          }
          if ((puVar53 < puVar34) ||
             (puVar37 = local_e8[lVar55 + -4], puVar37 < (ulong *)(local_90[lVar55] + -8)))
          goto LAB_00bb87ec;
          uVar62 = *puVar37;
          uVar59 = (local_c8[lVar55] & 0xaaaaaaaaaaaaaaaa) >> 1 |
                   (local_c8[lVar55] & 0x5555555555555555) << 1;
          uVar59 = (uVar59 & 0xcccccccccccccccc) >> 2 | (uVar59 & 0x3333333333333333) << 2;
          uVar59 = (uVar59 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar59 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar59 = (uVar59 & 0xff00ff00ff00ff00) >> 8 | (uVar59 & 0xff00ff00ff00ff) << 8;
          uVar59 = (uVar59 & 0xffff0000ffff0000) >> 0x10 | (uVar59 & 0xffff0000ffff) << 0x10;
          lVar36 = (long)puVar53 - (long)puVar34;
          uVar59 = LZCOUNT(uVar59 >> 0x20 | uVar59 << 0x20);
          puVar42 = puVar34;
          if (3 < lVar36) {
            do {
              uVar39 = (uint)uVar59;
              if (puVar37 < local_a0 + 1) {
                if (puVar37 == local_a0) goto joined_r0x00bb8130;
                bVar32 = local_a0 <= (ulong *)((long)puVar37 - (uVar59 >> 3));
                uVar43 = (uint)(uVar59 >> 3);
                if (!bVar32) {
                  uVar43 = (int)puVar37 - (int)local_a0;
                }
                uVar39 = uVar39 + uVar43 * -8;
              }
              else {
                uVar43 = uVar39 >> 3;
                uVar39 = uVar39 & 7;
                bVar32 = true;
              }
              uVar59 = (ulong)uVar39;
              puVar37 = (ulong *)((long)puVar37 - (ulong)uVar43);
              uVar62 = *puVar37;
              if (((ulong *)((long)puVar53 - 3U) <= puVar42) || (!bVar32)) goto joined_r0x00bb8130;
              pbVar50 = (byte *)((long)param_5 + ((uVar62 << (uVar59 & 0x3f)) >> 0x35) * 2 + 4);
              uVar39 = uVar39 + *pbVar50;
              *(byte *)puVar42 = pbVar50[1];
              pbVar50 = (byte *)((long)param_5 +
                                ((uVar62 << ((ulong)uVar39 & 0x3f)) >> 0x35) * 2 + 4);
              uVar39 = uVar39 + *pbVar50;
              *(byte *)((long)puVar42 + 1) = pbVar50[1];
              pbVar50 = (byte *)((long)param_5 +
                                ((uVar62 << ((ulong)uVar39 & 0x3f)) >> 0x35) * 2 + 4);
              uVar39 = uVar39 + *pbVar50;
              *(byte *)((long)puVar42 + 2) = pbVar50[1];
              pbVar50 = (byte *)((long)param_5 +
                                ((uVar62 << ((ulong)uVar39 & 0x3f)) >> 0x35) * 2 + 4);
              puVar40 = (ulong *)((long)puVar42 + 4);
              uVar39 = uVar39 + *pbVar50;
              uVar59 = (ulong)uVar39;
              *(byte *)((long)puVar42 + 3) = pbVar50[1];
              puVar42 = puVar40;
              if (0x40 < uVar39) goto joined_r0x00bb8130;
            } while( true );
          }
          if (puVar37 < local_a0 + 1) {
            if (puVar37 != local_a0) {
              uVar39 = (int)puVar37 - (int)local_a0;
              if (local_a0 <= (ulong *)((long)puVar37 - (uVar59 >> 3))) {
                uVar39 = (uint)(uVar59 >> 3);
              }
              uVar62 = (ulong)uVar39;
              uVar39 = (uint)uVar59 + uVar39 * -8;
              goto LAB_00bb8140;
            }
          }
          else {
            uVar62 = uVar59 >> 3;
            uVar39 = (uint)uVar59 & 7;
LAB_00bb8140:
            uVar59 = (ulong)uVar39;
            uVar62 = *(ulong *)((long)puVar37 - uVar62);
          }
joined_r0x00bb8130:
          if (puVar42 < puVar53) {
            do {
              pbVar50 = (byte *)((long)param_5 + ((uVar62 << (uVar59 & 0x3f)) >> 0x35) * 2 + 4);
              bVar17 = *pbVar50;
              puVar37 = (ulong *)((long)puVar42 + 1);
              *(byte *)puVar42 = pbVar50[1];
              uVar59 = (ulong)((int)uVar59 + (uint)bVar17);
              puVar42 = puVar37;
            } while (puVar37 != puVar53);
            puVar34 = local_e8[lVar55];
          }
          puVar34 = (ulong *)((long)puVar34 + lVar36);
          local_e8[lVar55] = puVar34;
          if (puVar34 != puVar53) goto LAB_00bb87ec;
          lVar55 = lVar55 + 1;
        } while (lVar55 != 4);
        uVar33 = param_2;
      }
      if (uVar33 != 0) goto LAB_00bb87f0;
    }
    uVar33 = 0xffffffffffffffec;
    if ((param_2 < 6) || (param_4 < 10)) goto LAB_00bb87f0;
    uVar26 = *param_3;
    uVar27 = param_3[1];
    uVar28 = param_3[2];
    uVar59 = (ulong)uVar26 + (ulong)uVar27 + (ulong)uVar28 + 6;
    if (param_4 < uVar59) goto LAB_00bb87f0;
    uVar62 = param_2 + 3 >> 2;
    puVar3 = (ulong *)((long)param_1 + param_2);
    puVar53 = (ulong *)((long)param_1 + uVar62);
    puVar37 = (ulong *)((long)puVar53 + uVar62);
    puVar34 = (ulong *)((long)puVar37 + uVar62);
    if (puVar3 < puVar34) goto LAB_00bb87f0;
    if (uVar26 != 0) {
      puVar42 = (ulong *)(param_3 + 3);
      uVar29 = *(ushort *)((long)param_5 + 2);
      puVar40 = (ulong *)((long)puVar42 + (ulong)uVar26);
      uVar39 = (uint)uVar27;
      if (7 < uVar26) {
        if (*(byte *)((long)puVar40 + -1) == 0) {
LAB_00bb83dc:
          uVar33 = 0xffffffffffffffff;
          goto LAB_00bb87f0;
        }
        uVar60 = puVar40[-1];
        uVar43 = 8 - ((uint)LZCOUNT((uint)*(byte *)((long)puVar40 + -1)) ^ 0x1f);
        puVar49 = puVar40 + -1;
        if (uVar39 == 0) goto LAB_00bb83d4;
LAB_00bb82c4:
        uVar52 = (ulong)uVar43;
        puVar9 = (ulong *)((long)puVar40 + (ulong)uVar27);
        if (uVar27 < 8) {
          local_118 = (ulong)(byte)*puVar40;
          if (uVar27 < 5) {
            if (uVar39 != 2) {
              if (uVar39 != 3) {
                if (uVar39 != 4) goto LAB_00bb8368;
                goto LAB_00bb8350;
              }
              goto LAB_00bb8358;
            }
LAB_00bb8360:
            local_118 = local_118 + (ulong)*(byte *)((long)puVar40 + 1) * 0x100;
          }
          else {
            if (uVar27 == 5) {
LAB_00bb8348:
              local_118 = local_118 + ((ulong)*(byte *)((long)puVar40 + 4) << 0x20);
LAB_00bb8350:
              local_118 = local_118 + (ulong)*(byte *)((long)puVar40 + 3) * 0x1000000;
LAB_00bb8358:
              local_118 = local_118 + (ulong)*(byte *)((long)puVar40 + 2) * 0x10000;
              goto LAB_00bb8360;
            }
            if (uVar39 == 6) {
LAB_00bb8340:
              local_118 = local_118 + ((ulong)*(byte *)((long)puVar40 + 5) << 0x28);
              goto LAB_00bb8348;
            }
            if (uVar39 == 7) {
              local_118 = local_118 | (ulong)*(byte *)((long)puVar40 + 6) << 0x30;
              goto LAB_00bb8340;
            }
          }
LAB_00bb8368:
          if (*(byte *)((long)puVar9 + -1) != 0) {
            uVar39 = (int)LZCOUNT((uint)*(byte *)((long)puVar9 + -1)) + uVar39 * -8 + 0x29;
            local_128 = puVar40;
            goto LAB_00bb8380;
          }
LAB_00bb87ec:
          uVar33 = 0xffffffffffffffec;
          goto LAB_00bb87f0;
        }
        if (*(byte *)((long)puVar9 + -1) == 0) goto LAB_00bb83dc;
        local_118 = puVar9[-1];
        uVar39 = 8 - ((uint)LZCOUNT((uint)*(byte *)((long)puVar9 + -1)) ^ 0x1f);
        local_128 = puVar9 + -1;
LAB_00bb8380:
        uVar64 = (ulong)uVar39;
        if (uVar28 == 0) goto LAB_00bb83d4;
        pbVar50 = (byte *)((long)puVar9 + (ulong)uVar28);
        if (uVar28 < 8) {
          local_120 = (ulong)(byte)*puVar9;
          uVar39 = (uint)uVar28;
          if (uVar28 < 5) {
            if (uVar39 != 2) {
              if (uVar39 != 3) {
                if (uVar39 != 4) goto LAB_00bb8488;
                goto LAB_00bb8468;
              }
              goto LAB_00bb8474;
            }
LAB_00bb847c:
            local_120 = local_120 + (ulong)*(byte *)((long)puVar9 + 1) * 0x100;
          }
          else {
            if (uVar28 == 5) {
LAB_00bb845c:
              local_120 = local_120 + ((ulong)*(byte *)((long)puVar9 + 4) << 0x20);
LAB_00bb8468:
              local_120 = local_120 + (ulong)*(byte *)((long)puVar9 + 3) * 0x1000000;
LAB_00bb8474:
              local_120 = local_120 + (ulong)*(byte *)((long)puVar9 + 2) * 0x10000;
              goto LAB_00bb847c;
            }
            if (uVar28 == 6) {
LAB_00bb8454:
              local_120 = local_120 + ((ulong)*(byte *)((long)puVar9 + 5) << 0x28);
              goto LAB_00bb845c;
            }
            if (uVar39 == 7) {
              local_120 = local_120 | (ulong)*(byte *)((long)puVar9 + 6) << 0x30;
              goto LAB_00bb8454;
            }
          }
LAB_00bb8488:
          if (pbVar50[-1] == 0) goto LAB_00bb87ec;
          uVar39 = (int)LZCOUNT((uint)pbVar50[-1]) + uVar39 * -8 + 0x29;
          local_190 = puVar9;
        }
        else {
          if (pbVar50[-1] == 0) goto LAB_00bb83dc;
          local_120 = *(ulong *)(pbVar50 + -8);
          uVar39 = 8 - ((uint)LZCOUNT((uint)pbVar50[-1]) ^ 0x1f);
          local_190 = (ulong *)(pbVar50 + -8);
        }
        uVar65 = (ulong)uVar39;
        uVar33 = FUN_00bb9fd0(&local_108,pbVar50,param_4 - uVar59);
        if (0xffffffffffffff88 < uVar33) goto LAB_00bb87f0;
        puVar54 = (ulong *)((long)puVar3 - 3);
        puVar66 = (ulong *)(param_3 + 7);
        puVar1 = puVar40 + 1;
        puVar2 = puVar9 + 1;
        uStack_184 = (uint)uVar29;
        if (((ulong)((long)puVar3 - (long)puVar34) < 8) || (puVar54 <= puVar34)) {
          puVar46 = puVar34;
          puVar44 = puVar37;
          puVar35 = puVar53;
          puVar56 = param_1;
        }
        else {
          uVar43 = -uStack_184 & 0x3f;
          puVar46 = param_1;
          puVar44 = local_108;
          uVar39 = (uint)local_100;
          do {
            puVar56 = puVar46;
            pbVar50 = (byte *)((long)param_5 + ((uVar60 << (uVar52 & 0x3f)) >> uVar43) * 2 + 4);
            bVar17 = *pbVar50;
            pbVar13 = (byte *)((long)param_5 + ((local_118 << (uVar64 & 0x3f)) >> uVar43) * 2 + 4);
            pbVar14 = (byte *)((long)puVar56 + uVar62);
            *(byte *)puVar56 = pbVar50[1];
            uVar47 = (int)uVar52 + (uint)bVar17;
            bVar17 = *pbVar13;
            pbVar50 = (byte *)((long)param_5 + ((local_120 << (uVar65 & 0x3f)) >> uVar43) * 2 + 4);
            pbVar15 = (byte *)((long)puVar56 + uVar62 * 2);
            *pbVar14 = pbVar13[1];
            uVar48 = (int)uVar64 + (uint)bVar17;
            bVar17 = *pbVar50;
            pbVar13 = (byte *)((long)param_5 +
                              ((ulong)((long)puVar44 << ((ulong)uVar39 & 0x3f)) >> uVar43) * 2 + 4);
            pbVar16 = (byte *)((long)puVar56 + uVar62 * 3);
            *pbVar15 = pbVar50[1];
            uVar45 = (int)uVar65 + (uint)bVar17;
            bVar17 = *pbVar13;
            pbVar50 = (byte *)((long)param_5 +
                              ((uVar60 << ((ulong)uVar47 & 0x3f)) >> uVar43) * 2 + 4);
            *pbVar16 = pbVar13[1];
            uVar39 = uVar39 + bVar17;
            bVar17 = *pbVar50;
            pbVar13 = (byte *)((long)param_5 +
                              ((local_118 << ((ulong)uVar48 & 0x3f)) >> uVar43) * 2 + 4);
            *(byte *)((long)puVar56 + 1) = pbVar50[1];
            uVar47 = uVar47 + bVar17;
            pbVar50 = (byte *)((long)param_5 +
                              ((local_120 << ((ulong)uVar45 & 0x3f)) >> uVar43) * 2 + 4);
            bVar17 = *pbVar13;
            pbVar14[1] = pbVar13[1];
            uVar48 = uVar48 + bVar17;
            pbVar13 = (byte *)((long)param_5 +
                              ((ulong)((long)puVar44 << ((ulong)uVar39 & 0x3f)) >> uVar43) * 2 + 4);
            bVar17 = *pbVar50;
            pbVar15[1] = pbVar50[1];
            uVar45 = uVar45 + bVar17;
            pbVar50 = (byte *)((long)param_5 +
                              ((uVar60 << ((ulong)uVar47 & 0x3f)) >> uVar43) * 2 + 4);
            bVar17 = *pbVar13;
            pbVar16[1] = pbVar13[1];
            uVar39 = uVar39 + bVar17;
            pbVar13 = (byte *)((long)param_5 +
                              ((local_118 << ((ulong)uVar48 & 0x3f)) >> uVar43) * 2 + 4);
            bVar17 = *pbVar50;
            *(byte *)((long)puVar56 + 2) = pbVar50[1];
            uVar47 = uVar47 + bVar17;
            bVar17 = *pbVar13;
            pbVar50 = (byte *)((long)param_5 +
                              ((local_120 << ((ulong)uVar45 & 0x3f)) >> uVar43) * 2 + 4);
            pbVar14[2] = pbVar13[1];
            uVar48 = uVar48 + bVar17;
            pbVar13 = (byte *)((long)param_5 +
                              ((ulong)((long)puVar44 << ((ulong)uVar39 & 0x3f)) >> uVar43) * 2 + 4);
            bVar17 = *pbVar50;
            pbVar15[2] = pbVar50[1];
            uVar45 = uVar45 + bVar17;
            pbVar50 = (byte *)((long)param_5 +
                              ((uVar60 << ((ulong)uVar47 & 0x3f)) >> uVar43) * 2 + 4);
            bVar17 = *pbVar13;
            pbVar16[2] = pbVar13[1];
            uVar39 = uVar39 + bVar17;
            pbVar13 = (byte *)((long)param_5 +
                              ((local_118 << ((ulong)uVar48 & 0x3f)) >> uVar43) * 2 + 4);
            bVar17 = *pbVar50;
            *(byte *)((long)puVar56 + 3) = pbVar50[1];
            pbVar50 = (byte *)((long)param_5 +
                              ((local_120 << ((ulong)uVar45 & 0x3f)) >> uVar43) * 2 + 4);
            bVar18 = *pbVar13;
            pbVar14[3] = pbVar13[1];
            bVar19 = *pbVar50;
            pbVar13 = (byte *)((long)param_5 +
                              ((ulong)((long)puVar44 << ((ulong)uVar39 & 0x3f)) >> uVar43) * 2 + 4);
            pbVar15[3] = pbVar50[1];
            uVar47 = uVar47 + bVar17;
            bVar17 = *pbVar13;
            pbVar16[3] = pbVar13[1];
            if (puVar49 < puVar66) {
              iVar38 = 3;
            }
            else {
              uVar51 = uVar47 >> 3;
              iVar38 = 0;
              uVar47 = uVar47 & 7;
              puVar49 = (ulong *)((long)puVar49 - (ulong)uVar51);
              uVar60 = *puVar49;
            }
            uVar52 = (ulong)uVar47;
            uVar48 = uVar48 + bVar18;
            if (local_128 < puVar1) {
              iVar58 = 3;
            }
            else {
              uVar47 = uVar48 >> 3;
              iVar58 = 0;
              uVar48 = uVar48 & 7;
              local_128 = (ulong *)((long)local_128 - (ulong)uVar47);
              local_118 = *local_128;
            }
            uVar64 = (ulong)uVar48;
            uVar45 = uVar45 + bVar19;
            if (local_190 < puVar2) {
              iVar61 = 3;
            }
            else {
              uVar47 = uVar45 >> 3;
              iVar61 = 0;
              uVar45 = uVar45 & 7;
              local_190 = (ulong *)((long)local_190 - (ulong)uVar47);
              local_120 = *local_190;
            }
            uVar65 = (ulong)uVar45;
            uVar39 = uVar39 + bVar17;
            if (local_f8 < local_e8[0]) {
              iVar63 = 3;
            }
            else {
              uVar47 = uVar39 >> 3;
              iVar63 = 0;
              uVar39 = uVar39 & 7;
              local_f8 = (ulong *)((long)local_f8 - (ulong)uVar47);
              puVar44 = (ulong *)*local_f8;
              local_108 = puVar44;
            }
          } while ((pbVar16 + 4 < puVar54) &&
                  (puVar46 = (ulong *)((long)puVar56 + 4),
                  ((iVar58 == 0 && iVar38 == 0) && iVar61 == 0) && iVar63 == 0));
          puVar56 = (ulong *)((long)puVar56 + 4);
          local_100 = (ulong *)CONCAT44(local_100._4_4_,uVar39);
          puVar46 = (ulong *)((long)puVar56 + uVar62 * 3);
          puVar44 = (ulong *)((long)puVar56 + uVar62 * 2);
          puVar35 = (ulong *)((long)puVar56 + uVar62);
        }
        uVar39 = (uint)uVar52;
        uVar33 = 0xffffffffffffffec;
        if (((puVar53 < puVar56) || (puVar37 < puVar35)) || (puVar34 < puVar44)) goto LAB_00bb87f0;
        if ((long)puVar53 - (long)puVar56 < 4) {
          if (0x40 < uVar39) goto joined_r0x00bb9028;
          if (puVar49 < puVar66) {
            puVar66 = puVar42;
            if (puVar49 != puVar42) {
              uVar43 = (int)puVar49 - (int)puVar42;
              if (puVar42 <= (ulong *)((long)puVar49 - (ulong)(uVar39 >> 3))) {
                uVar43 = uVar39 >> 3;
              }
              uVar39 = uVar39 + uVar43 * -8;
              goto LAB_00bb8a08;
            }
          }
          else {
            uVar43 = uVar39 >> 3;
            uVar39 = uVar39 & 7;
LAB_00bb8a08:
            puVar49 = (ulong *)((long)puVar49 - (ulong)uVar43);
            uVar52 = (ulong)uVar39;
            uVar60 = *puVar49;
LAB_00bb8a14:
            uVar39 = (uint)uVar52;
            puVar66 = puVar49;
          }
          if (puVar56 < puVar53) goto LAB_00bb8a20;
        }
        else {
          if (uVar39 < 0x41) {
            uVar33 = (ulong)(-uStack_184 & 0x3f);
            do {
              uVar39 = (uint)uVar52;
              if (puVar49 < puVar66) {
                if (puVar49 == puVar42) {
                  puVar49 = puVar42;
                  goto LAB_00bb8a14;
                }
                bVar32 = puVar42 <= (ulong *)((long)puVar49 - (uVar52 >> 3));
                uVar43 = (uint)(uVar52 >> 3);
                if (!bVar32) {
                  uVar43 = (int)puVar49 - (int)puVar42;
                }
                uVar39 = uVar39 + uVar43 * -8;
              }
              else {
                uVar43 = uVar39 >> 3;
                uVar39 = uVar39 & 7;
                bVar32 = true;
              }
              uVar52 = (ulong)uVar39;
              puVar49 = (ulong *)((long)puVar49 - (ulong)uVar43);
              uVar60 = *puVar49;
              if (((ulong *)((long)puVar53 - 3U) <= puVar56) || (!bVar32)) goto LAB_00bb8a14;
              pbVar50 = (byte *)((long)param_5 + ((uVar60 << (uVar52 & 0x3f)) >> uVar33) * 2 + 4);
              uVar39 = uVar39 + *pbVar50;
              *(byte *)puVar56 = pbVar50[1];
              pbVar50 = (byte *)((long)param_5 +
                                ((uVar60 << ((ulong)uVar39 & 0x3f)) >> uVar33) * 2 + 4);
              uVar39 = uVar39 + *pbVar50;
              *(byte *)((long)puVar56 + 1) = pbVar50[1];
              pbVar50 = (byte *)((long)param_5 +
                                ((uVar60 << ((ulong)uVar39 & 0x3f)) >> uVar33) * 2 + 4);
              uVar39 = uVar39 + *pbVar50;
              *(byte *)((long)puVar56 + 2) = pbVar50[1];
              pbVar50 = (byte *)((long)param_5 +
                                ((uVar60 << ((ulong)uVar39 & 0x3f)) >> uVar33) * 2 + 4);
              uVar39 = uVar39 + *pbVar50;
              uVar52 = (ulong)uVar39;
              puVar57 = (ulong *)((long)puVar56 + 4);
              *(byte *)((long)puVar56 + 3) = pbVar50[1];
              puVar56 = puVar57;
            } while (uVar39 < 0x41);
          }
joined_r0x00bb9028:
          puVar66 = (ulong *)&DAT_007892b0;
          if (puVar56 < puVar53) {
LAB_00bb8a20:
            pbVar50 = (byte *)((long)param_1 + (uVar62 - (long)puVar56));
            do {
              pbVar50 = pbVar50 + -1;
              pbVar13 = (byte *)((long)param_5 +
                                ((uVar60 << (uVar52 & 0x3f)) >> (-uStack_184 & 0x3f)) * 2 + 4);
              uVar39 = (int)uVar52 + (uint)*pbVar13;
              uVar52 = (ulong)uVar39;
              *(byte *)puVar56 = pbVar13[1];
              puVar56 = (ulong *)((long)puVar56 + 1);
            } while (pbVar50 != (byte *)0x0);
          }
        }
        uVar43 = (uint)uVar64;
        if ((long)puVar37 - (long)puVar35 < 4) {
          if (0x40 < uVar43) goto LAB_00bb9030;
          if (local_128 < puVar1) {
            if (local_128 == puVar40) {
              local_128 = puVar40;
            }
            else {
              uVar47 = (int)local_128 - (int)puVar40;
              if (puVar40 <= (ulong *)((long)local_128 - (ulong)(uVar43 >> 3))) {
                uVar47 = uVar43 >> 3;
              }
              uVar64 = (ulong)(uVar43 + uVar47 * -8);
              local_118 = *(ulong *)((long)local_128 - (ulong)uVar47);
              local_128 = (ulong *)((long)local_128 - (ulong)uVar47);
            }
          }
          else {
            uVar64 = (ulong)(uVar43 & 7);
            local_128 = (ulong *)((long)local_128 - (ulong)(uVar43 >> 3));
            local_118 = *local_128;
          }
        }
        else if (uVar43 < 0x41) {
          uVar43 = -uStack_184 & 0x3f;
          do {
            uVar47 = (uint)uVar64;
            if (local_128 < puVar1) {
              if (local_128 == puVar40) {
                local_128 = puVar40;
                goto LAB_00bb8bf4;
              }
              bVar32 = puVar40 <= (ulong *)((long)local_128 - (uVar64 >> 3));
              uVar48 = (uint)(uVar64 >> 3);
              if (!bVar32) {
                uVar48 = (int)local_128 - (int)puVar40;
              }
              uVar47 = uVar47 + uVar48 * -8;
            }
            else {
              uVar48 = uVar47 >> 3;
              uVar47 = uVar47 & 7;
              bVar32 = true;
            }
            uVar64 = (ulong)uVar47;
            local_128 = (ulong *)((long)local_128 - (ulong)uVar48);
            local_118 = *local_128;
            if (((ulong *)((long)puVar37 - 3U) <= puVar35) || (!bVar32)) goto LAB_00bb8bf4;
            pbVar50 = (byte *)((long)param_5 + ((local_118 << (uVar64 & 0x3f)) >> uVar43) * 2 + 4);
            uVar47 = uVar47 + *pbVar50;
            *(byte *)puVar35 = pbVar50[1];
            pbVar50 = (byte *)((long)param_5 +
                              ((local_118 << ((ulong)uVar47 & 0x3f)) >> uVar43) * 2 + 4);
            uVar47 = uVar47 + *pbVar50;
            *(byte *)((long)puVar35 + 1) = pbVar50[1];
            pbVar50 = (byte *)((long)param_5 +
                              ((local_118 << ((ulong)uVar47 & 0x3f)) >> uVar43) * 2 + 4);
            uVar47 = uVar47 + *pbVar50;
            *(byte *)((long)puVar35 + 2) = pbVar50[1];
            pbVar50 = (byte *)((long)param_5 +
                              ((local_118 << ((ulong)uVar47 & 0x3f)) >> uVar43) * 2 + 4);
            uVar47 = uVar47 + *pbVar50;
            uVar64 = (ulong)uVar47;
            puVar53 = (ulong *)((long)puVar35 + 4);
            *(byte *)((long)puVar35 + 3) = pbVar50[1];
            puVar35 = puVar53;
          } while (uVar47 < 0x41);
          local_128 = (ulong *)&DAT_007892b0;
LAB_00bb8bf4:
        }
        else {
LAB_00bb9030:
          local_128 = (ulong *)&DAT_007892b0;
        }
        uVar43 = (uint)uVar64;
        if (puVar35 < puVar37) {
          do {
            pbVar50 = (byte *)((long)param_5 +
                              ((local_118 << (uVar64 & 0x3f)) >> (-uStack_184 & 0x3f)) * 2 + 4);
            bVar17 = *pbVar50;
            puVar53 = (ulong *)((long)puVar35 + 1);
            *(byte *)puVar35 = pbVar50[1];
            uVar43 = (int)uVar64 + (uint)bVar17;
            uVar64 = (ulong)uVar43;
            puVar35 = puVar53;
          } while (puVar53 < puVar37);
        }
        uVar47 = (uint)uVar65;
        if ((long)puVar34 - (long)puVar44 < 4) {
          if (0x40 < uVar47) goto LAB_00bb9040;
          if (local_190 < puVar2) {
            if (local_190 == puVar9) {
              local_190 = puVar9;
            }
            else {
              uVar48 = (int)local_190 - (int)puVar9;
              if (puVar9 <= (ulong *)((long)local_190 - (ulong)(uVar47 >> 3))) {
                uVar48 = uVar47 >> 3;
              }
              uVar65 = (ulong)(uVar47 + uVar48 * -8);
              local_120 = *(ulong *)((long)local_190 - (ulong)uVar48);
              local_190 = (ulong *)((long)local_190 - (ulong)uVar48);
            }
          }
          else {
            uVar65 = (ulong)(uVar47 & 7);
            local_190 = (ulong *)((long)local_190 - (ulong)(uVar47 >> 3));
            local_120 = *local_190;
          }
        }
        else if (uVar47 < 0x41) {
          uVar47 = -uStack_184 & 0x3f;
          do {
            uVar48 = (uint)uVar65;
            if (local_190 < puVar2) {
              if (local_190 == puVar9) {
                local_190 = puVar9;
                goto LAB_00bb8da0;
              }
              bVar32 = puVar9 <= (ulong *)((long)local_190 - (uVar65 >> 3));
              uVar45 = (uint)(uVar65 >> 3);
              if (!bVar32) {
                uVar45 = (int)local_190 - (int)puVar9;
              }
              uVar48 = uVar48 + uVar45 * -8;
            }
            else {
              uVar45 = uVar48 >> 3;
              uVar48 = uVar48 & 7;
              bVar32 = true;
            }
            uVar65 = (ulong)uVar48;
            local_190 = (ulong *)((long)local_190 - (ulong)uVar45);
            local_120 = *local_190;
            if (((ulong *)((long)puVar34 - 3U) <= puVar44) || (!bVar32)) goto LAB_00bb8da0;
            pbVar50 = (byte *)((long)param_5 + ((local_120 << (uVar65 & 0x3f)) >> uVar47) * 2 + 4);
            uVar48 = uVar48 + *pbVar50;
            *(byte *)puVar44 = pbVar50[1];
            pbVar50 = (byte *)((long)param_5 +
                              ((local_120 << ((ulong)uVar48 & 0x3f)) >> uVar47) * 2 + 4);
            uVar48 = uVar48 + *pbVar50;
            *(byte *)((long)puVar44 + 1) = pbVar50[1];
            pbVar50 = (byte *)((long)param_5 +
                              ((local_120 << ((ulong)uVar48 & 0x3f)) >> uVar47) * 2 + 4);
            uVar48 = uVar48 + *pbVar50;
            *(byte *)((long)puVar44 + 2) = pbVar50[1];
            pbVar50 = (byte *)((long)param_5 +
                              ((local_120 << ((ulong)uVar48 & 0x3f)) >> uVar47) * 2 + 4);
            uVar48 = uVar48 + *pbVar50;
            uVar65 = (ulong)uVar48;
            puVar53 = (ulong *)((long)puVar44 + 4);
            *(byte *)((long)puVar44 + 3) = pbVar50[1];
            puVar44 = puVar53;
          } while (uVar48 < 0x41);
          local_190 = (ulong *)&DAT_007892b0;
LAB_00bb8da0:
        }
        else {
LAB_00bb9040:
          local_190 = (ulong *)&DAT_007892b0;
        }
        uVar47 = (uint)uVar65;
        if (puVar44 < puVar34) {
          do {
            pbVar50 = (byte *)((long)param_5 +
                              ((local_120 << (uVar65 & 0x3f)) >> (-uStack_184 & 0x3f)) * 2 + 4);
            bVar17 = *pbVar50;
            puVar53 = (ulong *)((long)puVar44 + 1);
            *(byte *)puVar44 = pbVar50[1];
            uVar47 = (int)uVar65 + (uint)bVar17;
            uVar65 = (ulong)uVar47;
            puVar44 = puVar53;
          } while (puVar53 < puVar34);
        }
        uVar48 = (uint)local_100;
        if ((long)puVar3 - (long)puVar46 < 4) {
          if ((uint)local_100 < 0x41) {
            if (local_f8 < local_e8[0]) {
              if (local_f8 == local_f0) goto LAB_00bb8f7c;
              uVar45 = (int)local_f8 - (int)local_f0;
              if (local_f0 <= (ulong *)((long)local_f8 - (ulong)((uint)local_100 >> 3))) {
                uVar45 = (uint)local_100 >> 3;
              }
              uVar48 = (uint)local_100 + uVar45 * -8;
              local_100 = (ulong *)CONCAT44(local_100._4_4_,uVar48);
            }
            else {
              uVar45 = (uint)local_100 >> 3;
              uVar48 = (uint)local_100 & 7;
              local_100 = (ulong *)((ulong)local_100 & 0xffffffff00000007);
            }
            local_f8 = (ulong *)((long)local_f8 - (ulong)uVar45);
            local_108 = (ulong *)*local_f8;
          }
          else {
            local_f8 = (ulong *)&DAT_007892b0;
          }
        }
        else {
          if ((uint)local_100 < 0x41) {
            uVar45 = -uStack_184 & 0x3f;
            do {
              if (local_f8 < local_e8[0]) {
                if (local_f8 == local_f0) goto LAB_00bb8f7c;
                bVar32 = local_f0 <= (ulong *)((long)local_f8 - (ulong)(uVar48 >> 3));
                uVar51 = uVar48 >> 3;
                if (!bVar32) {
                  uVar51 = (int)local_f8 - (int)local_f0;
                }
                uVar48 = uVar48 + uVar51 * -8;
              }
              else {
                uVar51 = uVar48 >> 3;
                uVar48 = uVar48 & 7;
                bVar32 = true;
              }
              local_f8 = (ulong *)((long)local_f8 - (ulong)uVar51);
              local_100 = (ulong *)CONCAT44(local_100._4_4_,uVar48);
              local_108 = (ulong *)*local_f8;
              if ((puVar54 <= puVar46) || (!bVar32)) goto LAB_00bb8f7c;
              pbVar50 = (byte *)((long)param_5 +
                                ((ulong)((long)local_108 << ((ulong)uVar48 & 0x3f)) >> uVar45) * 2 +
                                4);
              bVar17 = *pbVar50;
              *(byte *)puVar46 = pbVar50[1];
              uVar48 = uVar48 + bVar17;
              pbVar50 = (byte *)((long)param_5 +
                                ((ulong)((long)local_108 << ((ulong)uVar48 & 0x3f)) >> uVar45) * 2 +
                                4);
              uVar48 = uVar48 + *pbVar50;
              *(byte *)((long)puVar46 + 1) = pbVar50[1];
              pbVar50 = (byte *)((long)param_5 +
                                ((ulong)((long)local_108 << ((ulong)uVar48 & 0x3f)) >> uVar45) * 2 +
                                4);
              uVar48 = uVar48 + *pbVar50;
              *(byte *)((long)puVar46 + 2) = pbVar50[1];
              pbVar50 = (byte *)((long)param_5 +
                                ((ulong)((long)local_108 << ((ulong)uVar48 & 0x3f)) >> uVar45) * 2 +
                                4);
              uVar48 = uVar48 + *pbVar50;
              puVar53 = (ulong *)((long)puVar46 + 4);
              local_100 = (ulong *)CONCAT44(local_100._4_4_,uVar48);
              *(byte *)((long)puVar46 + 3) = pbVar50[1];
              puVar46 = puVar53;
            } while (uVar48 < 0x41);
          }
          else {
          }
          local_f8 = (ulong *)&DAT_007892b0;
        }
LAB_00bb8f7c:
        if (puVar46 < puVar3) {
          pbVar50 = (byte *)((long)param_1 + (param_2 - (long)puVar46));
          do {
            pbVar50 = pbVar50 + -1;
            pbVar13 = (byte *)((long)param_5 +
                              ((ulong)((long)local_108 << ((ulong)local_100 & 0x3f)) >>
                              (-uStack_184 & 0x3f)) * 2 + 4);
            uVar48 = (uint)local_100 + *pbVar13;
            local_100 = (ulong *)CONCAT44(local_100._4_4_,uVar48);
            *(byte *)puVar46 = pbVar13[1];
            puVar46 = (ulong *)((long)puVar46 + 1);
          } while (pbVar50 != (byte *)0x0);
        }
        uVar33 = 0xffffffffffffffec;
        if (((((((uVar48 == 0x40 && local_f8 == local_f0) && uVar47 == 0x40) && local_190 == puVar9)
              && uVar43 == 0x40) && local_128 == puVar40) && uVar39 == 0x40) && puVar66 == puVar42)
        {
          uVar33 = param_2;
        }
        goto LAB_00bb87f0;
      }
      uVar60 = (ulong)(byte)*puVar42;
      uVar43 = (uint)uVar26;
      if (uVar26 < 5) {
        if (uVar43 != 2) {
          if (uVar43 != 3) {
            if (uVar43 != 4) goto LAB_00bb82a8;
            goto LAB_00bb8290;
          }
          goto LAB_00bb8298;
        }
LAB_00bb82a0:
        uVar60 = uVar60 + (ulong)*(byte *)((long)param_3 + 7) * 0x100;
      }
      else {
        if (uVar26 == 5) {
LAB_00bb8288:
          uVar60 = uVar60 + ((ulong)(byte)param_3[5] << 0x20);
LAB_00bb8290:
          uVar60 = uVar60 + (ulong)*(byte *)((long)param_3 + 9) * 0x1000000;
LAB_00bb8298:
          uVar60 = uVar60 + (ulong)(byte)param_3[4] * 0x10000;
          goto LAB_00bb82a0;
        }
        if (uVar26 == 6) {
LAB_00bb8280:
          uVar60 = uVar60 + ((ulong)*(byte *)((long)param_3 + 0xb) << 0x28);
          goto LAB_00bb8288;
        }
        if (uVar43 == 7) {
          uVar60 = uVar60 | (ulong)(byte)param_3[6] << 0x30;
          goto LAB_00bb8280;
        }
      }
LAB_00bb82a8:
      if (*(byte *)((long)puVar40 + -1) == 0) goto LAB_00bb87f0;
      uVar43 = (int)LZCOUNT((uint)*(byte *)((long)puVar40 + -1)) + uVar43 * -8 + 0x29;
      puVar49 = puVar42;
      if (uVar39 != 0) goto LAB_00bb82c4;
    }
LAB_00bb83d4:
    uVar33 = 0xffffffffffffffb8;
LAB_00bb87f0:
    if (*(long *)(lVar31 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
      __stack_chk_fail(uVar33);
    }
    return;
  }
  lVar31 = tpidr_el0;
  local_70 = *(long *)(lVar31 + 0x28);
  if ((param_6 >> 5 & 1) == 0) {
    uVar33 = FUN_00bba0f0(&local_108,param_1,param_2,param_3,param_4,param_5);
    if (uVar33 - 1 < 0xffffffffffffff87 || uVar33 == 0xffffffffffffff88) {
      puVar3 = (ulong *)((long)param_1 + (param_2 & ((long)param_2 >> 0x3f ^ 0xffffffffffffffffU)));
      puVar34 = local_e8[2];
      puVar37 = local_e8[3];
      puVar53 = local_e8[1];
      while( true ) {
        uVar59 = (ulong)((long)local_e8[1] - (long)local_e8[0]) / 10;
        uVar62 = (ulong)((long)local_e8[2] - (long)puVar53) / 10;
        uVar33 = (ulong)((long)local_108 - (long)local_a0) / 7;
        if (uVar59 <= uVar33) {
          uVar33 = uVar59;
        }
        uVar60 = (ulong)(local_98 - (long)puVar37) / 10;
        uVar59 = (ulong)((long)local_e8[3] - (long)puVar34) / 10;
        if (uVar62 <= uVar33) {
          uVar33 = uVar62;
        }
        if (uVar59 <= uVar33) {
          uVar33 = uVar59;
        }
        if (uVar60 <= uVar33) {
          uVar33 = uVar60;
        }
        if (((uVar33 == 0 || local_100 < local_108) || local_f8 < local_100) || local_f0 < local_f8)
        break;
        puVar41 = (undefined2 *)((long)puVar37 + uVar33 * 5);
        do {
          uVar39 = *(uint *)(local_a8 + (local_c8[0] >> 0x35) * 4);
          *(short *)local_e8[0] = (short)uVar39;
          puVar4 = (undefined2 *)((long)local_e8[0] + (ulong)(uVar39 >> 0x18));
          uVar43 = *(uint *)(local_a8 + (local_c8[1] >> 0x35) * 4);
          local_c8[0] = local_c8[0] << ((ulong)(uVar39 >> 0x10) & 0x3f);
          *(short *)puVar53 = (short)uVar43;
          puVar5 = (undefined2 *)((long)puVar53 + (ulong)(uVar43 >> 0x18));
          uVar39 = *(uint *)(local_a8 + (local_c8[2] >> 0x35) * 4);
          local_c8[1] = local_c8[1] << ((ulong)(uVar43 >> 0x10) & 0x3f);
          *(short *)puVar34 = (short)uVar39;
          puVar6 = (undefined2 *)((long)puVar34 + (ulong)(uVar39 >> 0x18));
          uVar43 = *(uint *)(local_a8 + (local_c8[3] >> 0x35) * 4);
          local_c8[2] = local_c8[2] << ((ulong)(uVar39 >> 0x10) & 0x3f);
          *(short *)puVar37 = (short)uVar43;
          puVar7 = (undefined2 *)((long)puVar37 + (ulong)(uVar43 >> 0x18));
          uVar39 = *(uint *)(local_a8 + (local_c8[0] >> 0x35) * 4);
          local_c8[3] = local_c8[3] << ((ulong)(uVar43 >> 0x10) & 0x3f);
          *puVar4 = (short)uVar39;
          puVar4 = (undefined2 *)((long)puVar4 + (ulong)(uVar39 >> 0x18));
          uVar43 = *(uint *)(local_a8 + (local_c8[1] >> 0x35) * 4);
          local_c8[0] = local_c8[0] << ((ulong)(uVar39 >> 0x10) & 0x3f);
          *puVar5 = (short)uVar43;
          puVar5 = (undefined2 *)((long)puVar5 + (ulong)(uVar43 >> 0x18));
          uVar39 = *(uint *)(local_a8 + (local_c8[2] >> 0x35) * 4);
          local_c8[1] = local_c8[1] << ((ulong)(uVar43 >> 0x10) & 0x3f);
          *puVar6 = (short)uVar39;
          puVar6 = (undefined2 *)((long)puVar6 + (ulong)(uVar39 >> 0x18));
          uVar43 = *(uint *)(local_a8 + (local_c8[3] >> 0x35) * 4);
          local_c8[2] = local_c8[2] << ((ulong)(uVar39 >> 0x10) & 0x3f);
          *puVar7 = (short)uVar43;
          puVar7 = (undefined2 *)((long)puVar7 + (ulong)(uVar43 >> 0x18));
          uVar39 = *(uint *)(local_a8 + (local_c8[0] >> 0x35) * 4);
          local_c8[3] = local_c8[3] << ((ulong)(uVar43 >> 0x10) & 0x3f);
          *puVar4 = (short)uVar39;
          puVar4 = (undefined2 *)((long)puVar4 + (ulong)(uVar39 >> 0x18));
          uVar43 = *(uint *)(local_a8 + (local_c8[1] >> 0x35) * 4);
          local_c8[0] = local_c8[0] << ((ulong)(uVar39 >> 0x10) & 0x3f);
          *puVar5 = (short)uVar43;
          puVar5 = (undefined2 *)((long)puVar5 + (ulong)(uVar43 >> 0x18));
          uVar39 = *(uint *)(local_a8 + (local_c8[2] >> 0x35) * 4);
          local_c8[1] = local_c8[1] << ((ulong)(uVar43 >> 0x10) & 0x3f);
          *puVar6 = (short)uVar39;
          uVar43 = *(uint *)(local_a8 + (local_c8[3] >> 0x35) * 4);
          local_c8[2] = local_c8[2] << ((ulong)(uVar39 >> 0x10) & 0x3f);
          *puVar7 = (short)uVar43;
          uVar47 = *(uint *)(local_a8 + (local_c8[0] >> 0x35) * 4);
          local_c8[3] = local_c8[3] << ((ulong)(uVar43 >> 0x10) & 0x3f);
          puVar6 = (undefined2 *)((long)puVar6 + (ulong)(uVar39 >> 0x18));
          *puVar4 = (short)uVar47;
          puVar4 = (undefined2 *)((long)puVar4 + (ulong)(uVar47 >> 0x18));
          uVar39 = *(uint *)(local_a8 + (local_c8[1] >> 0x35) * 4);
          local_c8[0] = local_c8[0] << ((ulong)(uVar47 >> 0x10) & 0x3f);
          puVar7 = (undefined2 *)((long)puVar7 + (ulong)(uVar43 >> 0x18));
          *puVar5 = (short)uVar39;
          puVar5 = (undefined2 *)((long)puVar5 + (ulong)(uVar39 >> 0x18));
          uVar43 = *(uint *)(local_a8 + (local_c8[2] >> 0x35) * 4);
          local_c8[1] = local_c8[1] << ((ulong)(uVar39 >> 0x10) & 0x3f);
          *puVar6 = (short)uVar43;
          uVar39 = *(uint *)(local_a8 + (local_c8[3] >> 0x35) * 4);
          local_c8[2] = local_c8[2] << ((ulong)(uVar43 >> 0x10) & 0x3f);
          *puVar7 = (short)uVar39;
          puVar7 = (undefined2 *)((long)puVar7 + (ulong)(uVar39 >> 0x18));
          uVar47 = *(uint *)(local_a8 + (local_c8[0] >> 0x35) * 4);
          local_c8[3] = local_c8[3] << ((ulong)(uVar39 >> 0x10) & 0x3f);
          puVar6 = (undefined2 *)((long)puVar6 + (ulong)(uVar43 >> 0x18));
          *puVar4 = (short)uVar47;
          uVar39 = *(uint *)(local_a8 + (local_c8[1] >> 0x35) * 4);
          *puVar5 = (short)uVar39;
          uVar43 = *(uint *)(local_a8 + (local_c8[2] >> 0x35) * 4);
          *puVar6 = (short)uVar43;
          local_c8[0] = local_c8[0] << ((ulong)(uVar47 >> 0x10) & 0x3f);
          uVar48 = *(uint *)(local_a8 + (local_c8[3] >> 0x35) * 4);
          puVar53 = (ulong *)((long)puVar5 + (ulong)(uVar39 >> 0x18));
          local_c8[1] = local_c8[1] << ((ulong)(uVar39 >> 0x10) & 0x3f);
          local_e8[0] = (ulong *)((long)puVar4 + (ulong)(uVar47 >> 0x18));
          uVar33 = (local_c8[0] & 0xaaaaaaaaaaaaaaaa) >> 1 | (local_c8[0] & 0x5555555555555555) << 1
          ;
          uVar33 = (uVar33 & 0xcccccccccccccccc) >> 2 | (uVar33 & 0x3333333333333333) << 2;
          uVar33 = (uVar33 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar33 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar33 = (uVar33 & 0xff00ff00ff00ff00) >> 8 | (uVar33 & 0xff00ff00ff00ff) << 8;
          uVar33 = (uVar33 & 0xffff0000ffff0000) >> 0x10 | (uVar33 & 0xffff0000ffff) << 0x10;
          local_c8[2] = local_c8[2] << ((ulong)(uVar43 >> 0x10) & 0x3f);
          *puVar7 = (short)uVar48;
          uVar59 = (local_c8[1] & 0xaaaaaaaaaaaaaaaa) >> 1 | (local_c8[1] & 0x5555555555555555) << 1
          ;
          uVar59 = (uVar59 & 0xcccccccccccccccc) >> 2 | (uVar59 & 0x3333333333333333) << 2;
          uVar59 = (uVar59 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar59 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar59 = (uVar59 & 0xff00ff00ff00ff00) >> 8 | (uVar59 & 0xff00ff00ff00ff) << 8;
          uVar59 = (uVar59 & 0xffff0000ffff0000) >> 0x10 | (uVar59 & 0xffff0000ffff) << 0x10;
          uVar52 = LZCOUNT(uVar33 >> 0x20 | uVar33 << 0x20);
          puVar37 = (ulong *)((long)puVar7 + (ulong)(uVar48 >> 0x18));
          local_c8[3] = local_c8[3] << ((ulong)(uVar48 >> 0x10) & 0x3f);
          uVar33 = (local_c8[2] & 0xaaaaaaaaaaaaaaaa) >> 1 | (local_c8[2] & 0x5555555555555555) << 1
          ;
          uVar33 = (uVar33 & 0xcccccccccccccccc) >> 2 | (uVar33 & 0x3333333333333333) << 2;
          uVar33 = (uVar33 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar33 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar33 = (uVar33 & 0xff00ff00ff00ff00) >> 8 | (uVar33 & 0xff00ff00ff00ff) << 8;
          uVar33 = (uVar33 & 0xffff0000ffff0000) >> 0x10 | (uVar33 & 0xffff0000ffff) << 0x10;
          local_108 = (ulong *)((long)local_108 - (uVar52 >> 3));
          uVar62 = LZCOUNT(uVar59 >> 0x20 | uVar59 << 0x20);
          puVar34 = (ulong *)((long)puVar6 + (ulong)(uVar43 >> 0x18));
          uVar59 = (local_c8[3] & 0xaaaaaaaaaaaaaaaa) >> 1 | (local_c8[3] & 0x5555555555555555) << 1
          ;
          uVar59 = (uVar59 & 0xcccccccccccccccc) >> 2 | (uVar59 & 0x3333333333333333) << 2;
          uVar59 = (uVar59 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar59 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar59 = (uVar59 & 0xff00ff00ff00ff00) >> 8 | (uVar59 & 0xff00ff00ff00ff) << 8;
          uVar59 = (uVar59 & 0xffff0000ffff0000) >> 0x10 | (uVar59 & 0xffff0000ffff) << 0x10;
          local_100 = (ulong *)((long)local_100 - (uVar62 >> 3));
          uVar60 = LZCOUNT(uVar33 >> 0x20 | uVar33 << 0x20);
          local_f8 = (ulong *)((long)local_f8 - (uVar60 >> 3));
          uVar33 = LZCOUNT(uVar59 >> 0x20 | uVar59 << 0x20);
          local_f0 = (ulong *)((long)local_f0 - (uVar33 >> 3));
          local_c8[0] = (*local_108 | 1) << (uVar52 & 7);
          local_c8[1] = (*local_100 | 1) << (uVar62 & 7);
          local_c8[2] = (*local_f8 | 1) << (uVar60 & 7);
          local_c8[3] = (*local_f0 | 1) << (uVar33 & 7);
        } while (puVar37 < puVar41);
      }
      lVar55 = 0;
      local_e8[1] = puVar53;
      local_e8[2] = puVar34;
      local_e8[3] = puVar37;
      uVar33 = param_2 + 3 >> 2;
      puVar53 = param_1;
      do {
        uVar59 = (long)puVar3 - (long)puVar53;
        puVar37 = (ulong *)((long)puVar53 + uVar33);
        puVar34 = local_e8[lVar55];
        puVar53 = puVar3;
        if (uVar33 <= uVar59) {
          puVar53 = puVar37;
        }
        if ((puVar53 < puVar34) ||
           (puVar37 = local_e8[lVar55 + -4], puVar37 < (ulong *)(local_90[lVar55] + -8)))
        goto LAB_00bb6958;
        uVar60 = (long)puVar53 - (long)puVar34;
        uVar62 = *puVar37;
        uVar59 = (local_c8[lVar55] & 0xaaaaaaaaaaaaaaaa) >> 1 |
                 (local_c8[lVar55] & 0x5555555555555555) << 1;
        uVar59 = (uVar59 & 0xcccccccccccccccc) >> 2 | (uVar59 & 0x3333333333333333) << 2;
        uVar59 = (uVar59 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar59 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar59 = (uVar59 & 0xff00ff00ff00ff00) >> 8 | (uVar59 & 0xff00ff00ff00ff) << 8;
        uVar59 = (uVar59 & 0xffff0000ffff0000) >> 0x10 | (uVar59 & 0xffff0000ffff) << 0x10;
        puVar42 = local_a0 + 1;
        uVar59 = LZCOUNT(uVar59 >> 0x20 | uVar59 << 0x20);
        iVar38 = (int)local_a0;
        puVar40 = puVar34;
        if (uVar60 < 8) {
          if (puVar37 < puVar42) {
            if (puVar37 != local_a0) {
              uVar39 = (int)puVar37 - iVar38;
              if (local_a0 <= (ulong *)((long)puVar37 - (uVar59 >> 3))) {
                uVar39 = (uint)(uVar59 >> 3);
              }
              puVar37 = (ulong *)((long)puVar37 - (ulong)uVar39);
              uVar59 = (ulong)((uint)uVar59 + uVar39 * -8);
              uVar62 = *puVar37;
            }
          }
          else {
            puVar37 = (ulong *)((long)puVar37 - (uVar59 >> 3));
            uVar59 = (ulong)((uint)uVar59 & 7);
            uVar62 = *puVar37;
          }
        }
        else {
          do {
            uVar39 = (uint)uVar59;
            if (puVar37 < puVar42) {
              if (puVar37 == local_a0) goto LAB_00bb6150;
              bVar32 = local_a0 <= (ulong *)((long)puVar37 - (uVar59 >> 3));
              uVar43 = (uint)(uVar59 >> 3);
              if (!bVar32) {
                uVar43 = (int)puVar37 - iVar38;
              }
              uVar39 = uVar39 + uVar43 * -8;
            }
            else {
              uVar43 = uVar39 >> 3;
              uVar39 = uVar39 & 7;
              bVar32 = true;
            }
            uVar59 = (ulong)uVar39;
            puVar37 = (ulong *)((long)puVar37 - (ulong)uVar43);
            uVar62 = *puVar37;
            if (((ulong *)((long)puVar53 - 9U) <= puVar40) || (!bVar32)) goto LAB_00bb6150;
            puVar8 = param_5 + ((uVar62 << (uVar59 & 0x3f)) >> 0x35) + 1;
            *(short *)puVar40 = (short)*puVar8;
            uVar39 = uVar39 + *(byte *)((long)puVar8 + 2);
            pbVar50 = (byte *)((long)puVar40 + (ulong)*(byte *)((long)puVar8 + 3));
            puVar8 = param_5 + ((uVar62 << ((ulong)uVar39 & 0x3f)) >> 0x35) + 1;
            *(short *)pbVar50 = (short)*puVar8;
            uVar39 = uVar39 + *(byte *)((long)puVar8 + 2);
            pbVar50 = pbVar50 + *(byte *)((long)puVar8 + 3);
            puVar8 = param_5 + ((uVar62 << ((ulong)uVar39 & 0x3f)) >> 0x35) + 1;
            *(short *)pbVar50 = (short)*puVar8;
            uVar39 = uVar39 + *(byte *)((long)puVar8 + 2);
            pbVar50 = pbVar50 + *(byte *)((long)puVar8 + 3);
            puVar8 = param_5 + ((uVar62 << ((ulong)uVar39 & 0x3f)) >> 0x35) + 1;
            *(short *)pbVar50 = (short)*puVar8;
            bVar17 = *(byte *)((long)puVar8 + 3);
            uVar39 = uVar39 + *(byte *)((long)puVar8 + 2);
            puVar8 = param_5 + ((uVar62 << ((ulong)uVar39 & 0x3f)) >> 0x35) + 1;
            *(short *)(pbVar50 + bVar17) = (short)*puVar8;
            uVar39 = uVar39 + *(byte *)((long)puVar8 + 2);
            uVar59 = (ulong)uVar39;
            puVar40 = (ulong *)(pbVar50 + bVar17 + *(byte *)((long)puVar8 + 3));
          } while (uVar39 < 0x41);
          puVar37 = (ulong *)&DAT_007892b0;
LAB_00bb6150:
          uVar60 = (long)puVar53 - (long)puVar40;
        }
        if (1 < uVar60) {
          if ((uint)uVar59 < 0x41) {
            do {
              uVar39 = (uint)uVar59;
              if (puVar37 < puVar42) {
                if (puVar37 == local_a0) break;
                bVar32 = local_a0 <= (ulong *)((long)puVar37 - (uVar59 >> 3));
                uVar43 = (uint)(uVar59 >> 3);
                if (!bVar32) {
                  uVar43 = (int)puVar37 - iVar38;
                }
                uVar39 = uVar39 + uVar43 * -8;
              }
              else {
                uVar43 = uVar39 >> 3;
                uVar39 = uVar39 & 7;
                bVar32 = true;
              }
              uVar59 = (ulong)uVar39;
              puVar37 = (ulong *)((long)puVar37 - (ulong)uVar43);
              uVar62 = *puVar37;
              if (((ulong *)((long)puVar53 - 2U) < puVar40) || (!bVar32)) break;
              puVar8 = param_5 + ((uVar62 << (uVar59 & 0x3f)) >> 0x35) + 1;
              *(short *)puVar40 = (short)*puVar8;
              uVar39 = uVar39 + *(byte *)((long)puVar8 + 2);
              uVar59 = (ulong)uVar39;
              puVar40 = (ulong *)((long)puVar40 + (ulong)*(byte *)((long)puVar8 + 3));
              if (0x40 < uVar39) break;
            } while( true );
          }
          for (; puVar40 <= (ulong *)((long)puVar53 - 2U);
              puVar40 = (ulong *)((long)puVar40 + (ulong)*(byte *)((long)puVar8 + 3))) {
            puVar8 = param_5 + ((uVar62 << (uVar59 & 0x3f)) >> 0x35) + 1;
            *(short *)puVar40 = (short)*puVar8;
            uVar59 = (ulong)((int)uVar59 + (uint)*(byte *)((long)puVar8 + 2));
          }
        }
        puVar37 = puVar40;
        if (puVar40 < puVar53) {
          puVar37 = (ulong *)((long)puVar40 + 1);
          *(byte *)puVar40 =
               *(byte *)((long)param_5 + ((uVar62 << (uVar59 & 0x3f)) >> 0x33 & 0x1ffc) + 4);
        }
        puVar37 = (ulong *)((long)puVar37 + ((long)local_e8[lVar55] - (long)puVar34));
        local_e8[lVar55] = puVar37;
        if (puVar37 != puVar53) goto LAB_00bb6958;
        lVar55 = lVar55 + 1;
      } while (lVar55 != 4);
      uVar33 = param_2;
    }
    if (uVar33 != 0) goto LAB_00bb695c;
  }
  uVar33 = 0xffffffffffffffec;
  if ((param_2 < 6) || (param_4 < 10)) goto LAB_00bb695c;
  uVar26 = *param_3;
  uVar27 = param_3[1];
  uVar28 = param_3[2];
  uVar59 = (ulong)uVar26 + (ulong)uVar27 + (ulong)uVar28 + 6;
  if (param_4 < uVar59) goto LAB_00bb695c;
  puVar3 = (ulong *)((long)param_1 + param_2);
  uVar62 = param_2 + 3 >> 2;
  puVar53 = (ulong *)((long)param_1 + uVar62);
  puVar37 = (ulong *)((long)puVar53 + uVar62);
  puVar34 = (ulong *)((long)puVar37 + uVar62);
  if (puVar3 < puVar34) goto LAB_00bb695c;
  if (uVar26 != 0) {
    uVar39 = *param_5;
    puVar42 = (ulong *)(param_3 + 3);
    puVar40 = (ulong *)((long)puVar42 + (ulong)uVar26);
    uVar43 = (uint)uVar27;
    if (7 < uVar26) {
      if (*(byte *)((long)puVar40 + -1) == 0) {
LAB_00bb64f4:
        uVar33 = 0xffffffffffffffff;
        goto LAB_00bb695c;
      }
      uVar62 = puVar40[-1];
      uVar47 = 8 - ((uint)LZCOUNT((uint)*(byte *)((long)puVar40 + -1)) ^ 0x1f);
      puVar49 = puVar40 + -1;
      if (uVar43 == 0) goto LAB_00bb64ec;
LAB_00bb63ac:
      uVar60 = (ulong)uVar47;
      puVar9 = (ulong *)((long)puVar40 + (ulong)uVar27);
      if (uVar27 < 8) {
        local_128 = (ulong *)(ulong)(byte)*puVar40;
        if (uVar27 < 5) {
          if (uVar43 != 2) {
            if (uVar43 != 3) {
              if (uVar43 != 4) goto LAB_00bb6488;
              goto LAB_00bb6468;
            }
            goto LAB_00bb6474;
          }
LAB_00bb647c:
          local_128 = (ulong *)((long)local_128 + (ulong)*(byte *)((long)puVar40 + 1) * 0x100);
        }
        else {
          if (uVar27 == 5) {
LAB_00bb645c:
            local_128 = (ulong *)((long)local_128 + ((ulong)*(byte *)((long)puVar40 + 4) << 0x20));
LAB_00bb6468:
            local_128 = (ulong *)((long)local_128 + (ulong)*(byte *)((long)puVar40 + 3) * 0x1000000)
            ;
LAB_00bb6474:
            local_128 = (ulong *)((long)local_128 + (ulong)*(byte *)((long)puVar40 + 2) * 0x10000);
            goto LAB_00bb647c;
          }
          if (uVar43 == 6) {
LAB_00bb6454:
            local_128 = (ulong *)((long)local_128 + ((ulong)*(byte *)((long)puVar40 + 5) << 0x28));
            goto LAB_00bb645c;
          }
          if (uVar43 == 7) {
            local_128 = (ulong *)((ulong)local_128 | (ulong)*(byte *)((long)puVar40 + 6) << 0x30);
            goto LAB_00bb6454;
          }
        }
LAB_00bb6488:
        if (*(byte *)((long)puVar9 + -1) != 0) {
          uVar43 = (int)LZCOUNT((uint)*(byte *)((long)puVar9 + -1)) + uVar43 * -8 + 0x29;
          local_168 = puVar40;
          goto LAB_00bb64a0;
        }
LAB_00bb6958:
        uVar33 = 0xffffffffffffffec;
        goto LAB_00bb695c;
      }
      if (*(byte *)((long)puVar9 + -1) == 0) goto LAB_00bb64f4;
      local_128 = (ulong *)puVar9[-1];
      uVar43 = 8 - ((uint)LZCOUNT((uint)*(byte *)((long)puVar9 + -1)) ^ 0x1f);
      local_168 = puVar9 + -1;
LAB_00bb64a0:
      uVar52 = (ulong)uVar43;
      if (uVar28 == 0) goto LAB_00bb64ec;
      pbVar50 = (byte *)((long)puVar9 + (ulong)uVar28);
      if (uVar28 < 8) {
        local_130 = (ulong)(byte)*puVar9;
        uVar43 = (uint)uVar28;
        if (uVar28 < 5) {
          if (uVar43 != 2) {
            if (uVar43 != 3) {
              if (uVar43 != 4) goto LAB_00bb656c;
              goto LAB_00bb6554;
            }
            goto LAB_00bb655c;
          }
LAB_00bb6564:
          local_130 = local_130 + (ulong)*(byte *)((long)puVar9 + 1) * 0x100;
        }
        else {
          if (uVar28 == 5) {
LAB_00bb654c:
            local_130 = local_130 + ((ulong)*(byte *)((long)puVar9 + 4) << 0x20);
LAB_00bb6554:
            local_130 = local_130 + (ulong)*(byte *)((long)puVar9 + 3) * 0x1000000;
LAB_00bb655c:
            local_130 = local_130 + (ulong)*(byte *)((long)puVar9 + 2) * 0x10000;
            goto LAB_00bb6564;
          }
          if (uVar28 == 6) {
LAB_00bb6544:
            local_130 = local_130 + ((ulong)*(byte *)((long)puVar9 + 5) << 0x28);
            goto LAB_00bb654c;
          }
          if (uVar43 == 7) {
            local_130 = local_130 | (ulong)*(byte *)((long)puVar9 + 6) << 0x30;
            goto LAB_00bb6544;
          }
        }
LAB_00bb656c:
        if (pbVar50[-1] == 0) goto LAB_00bb6958;
        uVar43 = (int)LZCOUNT((uint)pbVar50[-1]) + uVar43 * -8 + 0x29;
        local_138 = puVar9;
      }
      else {
        if (pbVar50[-1] == 0) goto LAB_00bb64f4;
        local_130 = *(ulong *)(pbVar50 + -8);
        uVar43 = 8 - ((uint)LZCOUNT((uint)pbVar50[-1]) ^ 0x1f);
        local_138 = (ulong *)(pbVar50 + -8);
      }
      uVar64 = (ulong)uVar43;
      uVar33 = FUN_00bb9fd0(&local_108,pbVar50,param_4 - uVar59);
      if (0xffffffffffffff88 < uVar33) goto LAB_00bb695c;
      puVar44 = (ulong *)((long)puVar3 - 7);
      puVar66 = (ulong *)(param_3 + 7);
      uVar43 = uVar39 >> 0x10;
      puVar1 = puVar40 + 1;
      puVar2 = puVar9 + 1;
      puVar46 = puVar34;
      puVar56 = puVar37;
      puVar54 = puVar53;
      if ((7 < (ulong)((long)puVar3 - (long)puVar34)) && (puVar34 < puVar44)) {
        uVar33 = (ulong)(-uVar43 & 0x3f);
        puVar35 = local_108;
        puVar57 = local_f8;
        uVar47 = (uint)local_100;
        do {
          puVar8 = param_5 + ((uVar62 << (uVar60 & 0x3f)) >> uVar33) + 1;
          puVar10 = param_5 + ((ulong)((long)puVar35 << ((ulong)uVar47 & 0x3f)) >> uVar33) + 1;
          puVar11 = param_5 + ((ulong)((long)local_128 << (uVar52 & 0x3f)) >> uVar33) + 1;
          puVar12 = param_5 + ((local_130 << (uVar64 & 0x3f)) >> uVar33) + 1;
          *(short *)param_1 = (short)*puVar8;
          bVar17 = *(byte *)((long)puVar8 + 3);
          uVar48 = (int)uVar60 + (uint)*(byte *)((long)puVar8 + 2);
          *(short *)puVar54 = (short)*puVar11;
          pbVar50 = (byte *)((long)param_1 + (ulong)bVar17);
          bVar17 = *(byte *)((long)puVar11 + 3);
          uVar45 = (int)uVar52 + (uint)*(byte *)((long)puVar11 + 2);
          *(short *)puVar56 = (short)*puVar12;
          puVar8 = param_5 + ((uVar62 << ((ulong)uVar48 & 0x3f)) >> uVar33) + 1;
          bVar18 = *(byte *)((long)puVar12 + 3);
          uVar51 = (int)uVar64 + (uint)*(byte *)((long)puVar12 + 2);
          *(short *)puVar46 = (short)*puVar10;
          puVar11 = param_5 + ((ulong)((long)local_128 << ((ulong)uVar45 & 0x3f)) >> uVar33) + 1;
          bVar19 = *(byte *)((long)puVar10 + 3);
          pbVar13 = (byte *)((long)puVar54 + (ulong)bVar17);
          uVar47 = uVar47 + *(byte *)((long)puVar10 + 2);
          *(short *)pbVar50 = (short)*puVar8;
          puVar10 = param_5 + ((local_130 << ((ulong)uVar51 & 0x3f)) >> uVar33) + 1;
          bVar17 = *(byte *)((long)puVar8 + 3);
          uVar48 = uVar48 + *(byte *)((long)puVar8 + 2);
          *(short *)pbVar13 = (short)*puVar11;
          pbVar14 = (byte *)((long)puVar56 + (ulong)bVar18);
          puVar8 = param_5 + ((ulong)((long)puVar35 << ((ulong)uVar47 & 0x3f)) >> uVar33) + 1;
          bVar18 = *(byte *)((long)puVar11 + 3);
          uVar45 = uVar45 + *(byte *)((long)puVar11 + 2);
          *(short *)pbVar14 = (short)*puVar10;
          pbVar15 = (byte *)((long)puVar46 + (ulong)bVar19);
          puVar11 = param_5 + ((uVar62 << ((ulong)uVar48 & 0x3f)) >> uVar33) + 1;
          bVar19 = *(byte *)((long)puVar10 + 3);
          uVar51 = uVar51 + *(byte *)((long)puVar10 + 2);
          *(short *)pbVar15 = (short)*puVar8;
          pbVar50 = pbVar50 + bVar17;
          puVar10 = param_5 + ((ulong)((long)local_128 << ((ulong)uVar45 & 0x3f)) >> uVar33) + 1;
          bVar17 = *(byte *)((long)puVar8 + 3);
          uVar47 = uVar47 + *(byte *)((long)puVar8 + 2);
          *(short *)pbVar50 = (short)*puVar11;
          pbVar13 = pbVar13 + bVar18;
          bVar18 = *(byte *)((long)puVar11 + 2);
          puVar8 = param_5 + ((local_130 << ((ulong)uVar51 & 0x3f)) >> uVar33) + 1;
          bVar20 = *(byte *)((long)puVar11 + 3);
          *(short *)pbVar13 = (short)*puVar10;
          pbVar14 = pbVar14 + bVar19;
          uVar48 = uVar48 + bVar18;
          bVar18 = *(byte *)((long)puVar10 + 2);
          puVar11 = param_5 + ((ulong)((long)puVar35 << ((ulong)uVar47 & 0x3f)) >> uVar33) + 1;
          bVar19 = *(byte *)((long)puVar10 + 3);
          *(short *)pbVar14 = (short)*puVar8;
          uVar45 = uVar45 + bVar18;
          pbVar15 = pbVar15 + bVar17;
          bVar17 = *(byte *)((long)puVar8 + 2);
          bVar18 = *(byte *)((long)puVar8 + 3);
          puVar8 = param_5 + ((uVar62 << ((ulong)uVar48 & 0x3f)) >> uVar33) + 1;
          *(short *)pbVar15 = (short)*puVar11;
          uVar51 = uVar51 + bVar17;
          bVar17 = *(byte *)((long)puVar11 + 3);
          puVar10 = param_5 + ((ulong)((long)local_128 << ((ulong)uVar45 & 0x3f)) >> uVar33) + 1;
          uVar47 = uVar47 + *(byte *)((long)puVar11 + 2);
          *(short *)(pbVar50 + bVar20) = (short)*puVar8;
          puVar11 = param_5 + ((local_130 << ((ulong)uVar51 & 0x3f)) >> uVar33) + 1;
          bVar21 = *(byte *)((long)puVar8 + 2);
          bVar22 = *(byte *)((long)puVar8 + 3);
          *(short *)(pbVar13 + bVar19) = (short)*puVar10;
          puVar8 = param_5 + ((ulong)((long)puVar35 << ((ulong)uVar47 & 0x3f)) >> uVar33) + 1;
          bVar23 = *(byte *)((long)puVar10 + 2);
          bVar24 = *(byte *)((long)puVar10 + 3);
          *(short *)(pbVar14 + bVar18) = (short)*puVar11;
          uVar48 = uVar48 + bVar21;
          bVar21 = *(byte *)((long)puVar11 + 2);
          bVar25 = *(byte *)((long)puVar11 + 3);
          *(short *)(pbVar15 + bVar17) = (short)*puVar8;
          if (puVar49 < puVar66) {
            iVar38 = 3;
          }
          else {
            uVar30 = uVar48 >> 3;
            iVar38 = 0;
            uVar48 = uVar48 & 7;
            puVar49 = (ulong *)((long)puVar49 - (ulong)uVar30);
            uVar62 = *puVar49;
          }
          uVar60 = (ulong)uVar48;
          uVar45 = uVar45 + bVar23;
          if (local_168 < puVar1) {
            iVar58 = 3;
          }
          else {
            uVar48 = uVar45 >> 3;
            iVar58 = 0;
            uVar45 = uVar45 & 7;
            local_168 = (ulong *)((long)local_168 - (ulong)uVar48);
            local_128 = (ulong *)*local_168;
          }
          uVar52 = (ulong)uVar45;
          uVar51 = uVar51 + bVar21;
          if (local_138 < puVar2) {
            iVar61 = 3;
          }
          else {
            uVar48 = uVar51 >> 3;
            iVar61 = 0;
            uVar51 = uVar51 & 7;
            local_138 = (ulong *)((long)local_138 - (ulong)uVar48);
            local_130 = *local_138;
          }
          uVar64 = (ulong)uVar51;
          uVar47 = uVar47 + *(byte *)((long)puVar8 + 2);
          if (puVar57 < local_e8[0]) {
            iVar63 = 3;
          }
          else {
            uVar48 = uVar47 >> 3;
            iVar63 = 0;
            uVar47 = uVar47 & 7;
            puVar57 = (ulong *)((long)puVar57 - (ulong)uVar48);
            puVar35 = (ulong *)*puVar57;
            local_108 = puVar35;
            local_f8 = puVar57;
          }
          puVar46 = (ulong *)(pbVar15 + bVar17 + *(byte *)((long)puVar8 + 3));
          param_1 = (ulong *)(pbVar50 + bVar20 + bVar22);
          puVar54 = (ulong *)(pbVar13 + bVar19 + bVar24);
          puVar56 = (ulong *)(pbVar14 + bVar18 + bVar25);
        } while ((puVar46 < puVar44) &&
                (((iVar58 == 0 && iVar38 == 0) && iVar61 == 0) && iVar63 == 0));
        local_100 = (ulong *)CONCAT44(local_100._4_4_,uVar47);
      }
      uVar33 = 0xffffffffffffffec;
      if (((puVar53 < param_1) || (puVar37 < puVar54)) || (puVar34 < puVar56)) goto LAB_00bb695c;
      uVar39 = uVar39 >> 0x10;
      local_118._0_4_ = uVar39 & 0xff;
      iVar38 = (int)puVar42;
      uVar47 = (uint)uVar60;
      if ((ulong)((long)puVar53 - (long)param_1) < 8) {
        if (uVar47 < 0x41) {
          if (puVar49 < puVar66) {
            if (puVar49 == puVar42) {
LAB_00bb6ccc:
              puVar49 = puVar42;
            }
            else {
              uVar39 = (int)puVar49 - iVar38;
              if (puVar42 <= (ulong *)((long)puVar49 - (ulong)(uVar47 >> 3))) {
                uVar39 = uVar47 >> 3;
              }
              puVar49 = (ulong *)((long)puVar49 - (ulong)uVar39);
              uVar60 = (ulong)(uVar47 + uVar39 * -8);
              uVar62 = *puVar49;
            }
          }
          else {
            uVar60 = (ulong)(uVar47 & 7);
            puVar49 = (ulong *)((long)puVar49 - (ulong)(uVar47 >> 3));
            uVar62 = *puVar49;
          }
        }
        else {
          puVar49 = (ulong *)&DAT_007892b0;
        }
      }
      else {
        if ((uVar39 & 0xff) < 0xc) {
          if (uVar47 < 0x41) {
            uVar33 = (ulong)(-uVar43 & 0x3f);
            do {
              uVar39 = (uint)uVar60;
              if (puVar49 < puVar66) {
                if (puVar49 == puVar42) goto LAB_00bb6ccc;
                bVar32 = puVar42 <= (ulong *)((long)puVar49 - (uVar60 >> 3));
                uVar47 = (uint)(uVar60 >> 3);
                if (!bVar32) {
                  uVar47 = (int)puVar49 - iVar38;
                }
                uVar39 = uVar39 + uVar47 * -8;
              }
              else {
                uVar47 = uVar39 >> 3;
                uVar39 = uVar39 & 7;
                bVar32 = true;
              }
              uVar60 = (ulong)uVar39;
              puVar49 = (ulong *)((long)puVar49 - (ulong)uVar47);
              uVar62 = *puVar49;
              if (((ulong *)((long)puVar53 - 9U) <= param_1) || (!bVar32)) goto LAB_00bb6cac;
              puVar8 = param_5 + ((uVar62 << (uVar60 & 0x3f)) >> uVar33) + 1;
              *(short *)param_1 = (short)*puVar8;
              uVar39 = uVar39 + *(byte *)((long)puVar8 + 2);
              pbVar50 = (byte *)((long)param_1 + (ulong)*(byte *)((long)puVar8 + 3));
              puVar8 = param_5 + ((uVar62 << ((ulong)uVar39 & 0x3f)) >> uVar33) + 1;
              *(short *)pbVar50 = (short)*puVar8;
              uVar39 = uVar39 + *(byte *)((long)puVar8 + 2);
              pbVar50 = pbVar50 + *(byte *)((long)puVar8 + 3);
              puVar8 = param_5 + ((uVar62 << ((ulong)uVar39 & 0x3f)) >> uVar33) + 1;
              *(short *)pbVar50 = (short)*puVar8;
              uVar39 = uVar39 + *(byte *)((long)puVar8 + 2);
              pbVar50 = pbVar50 + *(byte *)((long)puVar8 + 3);
              puVar8 = param_5 + ((uVar62 << ((ulong)uVar39 & 0x3f)) >> uVar33) + 1;
              *(short *)pbVar50 = (short)*puVar8;
              bVar17 = *(byte *)((long)puVar8 + 3);
              uVar39 = uVar39 + *(byte *)((long)puVar8 + 2);
              puVar8 = param_5 + ((uVar62 << ((ulong)uVar39 & 0x3f)) >> uVar33) + 1;
              *(short *)(pbVar50 + bVar17) = (short)*puVar8;
              uVar39 = uVar39 + *(byte *)((long)puVar8 + 2);
              uVar60 = (ulong)uVar39;
              param_1 = (ulong *)(pbVar50 + bVar17 + *(byte *)((long)puVar8 + 3));
            } while (uVar39 < 0x41);
          }
        }
        else if (uVar47 < 0x41) {
          uVar33 = (ulong)(-uVar43 & 0x3f);
          do {
            uVar39 = (uint)uVar60;
            if (puVar49 < puVar66) {
              if (puVar49 == puVar42) goto LAB_00bb6ccc;
              bVar32 = puVar42 <= (ulong *)((long)puVar49 - (uVar60 >> 3));
              uVar47 = (uint)(uVar60 >> 3);
              if (!bVar32) {
                uVar47 = (int)puVar49 - iVar38;
              }
              uVar39 = uVar39 + uVar47 * -8;
            }
            else {
              uVar47 = uVar39 >> 3;
              uVar39 = uVar39 & 7;
              bVar32 = true;
            }
            uVar60 = (ulong)uVar39;
            puVar49 = (ulong *)((long)puVar49 - (ulong)uVar47);
            uVar62 = *puVar49;
            if (((ulong *)((long)puVar53 - 7U) <= param_1) || (!bVar32)) goto LAB_00bb6cac;
            puVar8 = param_5 + ((uVar62 << (uVar60 & 0x3f)) >> uVar33) + 1;
            *(short *)param_1 = (short)*puVar8;
            uVar39 = uVar39 + *(byte *)((long)puVar8 + 2);
            pbVar50 = (byte *)((long)param_1 + (ulong)*(byte *)((long)puVar8 + 3));
            puVar8 = param_5 + ((uVar62 << ((ulong)uVar39 & 0x3f)) >> uVar33) + 1;
            *(short *)pbVar50 = (short)*puVar8;
            uVar39 = uVar39 + *(byte *)((long)puVar8 + 2);
            pbVar50 = pbVar50 + *(byte *)((long)puVar8 + 3);
            puVar8 = param_5 + ((uVar62 << ((ulong)uVar39 & 0x3f)) >> uVar33) + 1;
            *(short *)pbVar50 = (short)*puVar8;
            bVar17 = *(byte *)((long)puVar8 + 3);
            uVar39 = uVar39 + *(byte *)((long)puVar8 + 2);
            puVar8 = param_5 + ((uVar62 << ((ulong)uVar39 & 0x3f)) >> uVar33) + 1;
            *(short *)(pbVar50 + bVar17) = (short)*puVar8;
            uVar39 = uVar39 + *(byte *)((long)puVar8 + 2);
            uVar60 = (ulong)uVar39;
            param_1 = (ulong *)(pbVar50 + bVar17 + *(byte *)((long)puVar8 + 3));
          } while (uVar39 < 0x41);
        }
        puVar49 = (ulong *)&DAT_007892b0;
      }
      goto LAB_00bb6cd0;
    }
    uVar62 = (ulong)(byte)*puVar42;
    uVar47 = (uint)uVar26;
    if (uVar26 < 5) {
      if (uVar47 != 2) {
        if (uVar47 != 3) {
          if (uVar47 != 4) goto LAB_00bb6390;
          goto LAB_00bb6378;
        }
        goto LAB_00bb6380;
      }
LAB_00bb6388:
      uVar62 = uVar62 + (ulong)*(byte *)((long)param_3 + 7) * 0x100;
    }
    else {
      if (uVar26 == 5) {
LAB_00bb6370:
        uVar62 = uVar62 + ((ulong)(byte)param_3[5] << 0x20);
LAB_00bb6378:
        uVar62 = uVar62 + (ulong)*(byte *)((long)param_3 + 9) * 0x1000000;
LAB_00bb6380:
        uVar62 = uVar62 + (ulong)(byte)param_3[4] * 0x10000;
        goto LAB_00bb6388;
      }
      if (uVar26 == 6) {
LAB_00bb6368:
        uVar62 = uVar62 + ((ulong)*(byte *)((long)param_3 + 0xb) << 0x28);
        goto LAB_00bb6370;
      }
      if (uVar47 == 7) {
        uVar62 = uVar62 | (ulong)(byte)param_3[6] << 0x30;
        goto LAB_00bb6368;
      }
    }
LAB_00bb6390:
    if (*(byte *)((long)puVar40 + -1) == 0) goto LAB_00bb695c;
    uVar47 = (int)LZCOUNT((uint)*(byte *)((long)puVar40 + -1)) + uVar47 * -8 + 0x29;
    puVar49 = puVar42;
    if (uVar43 != 0) goto LAB_00bb63ac;
  }
LAB_00bb64ec:
  uVar33 = 0xffffffffffffffb8;
  goto LAB_00bb695c;
LAB_00bb6cac:
LAB_00bb6cd0:
  if (1 < (ulong)((long)puVar53 - (long)param_1)) {
    uVar39 = (uint)uVar60;
    puVar35 = puVar49;
    while (uVar39 < 0x41) {
      uVar39 = (uint)uVar60;
      if (puVar35 < puVar66) {
        puVar49 = puVar42;
        if (puVar35 == puVar42) goto joined_r0x00bb6d98;
        bVar32 = puVar42 <= (ulong *)((long)puVar35 - (uVar60 >> 3));
        uVar47 = (uint)(uVar60 >> 3);
        if (!bVar32) {
          uVar47 = (int)puVar35 - iVar38;
        }
        uVar39 = uVar39 + uVar47 * -8;
      }
      else {
        uVar47 = uVar39 >> 3;
        uVar39 = uVar39 & 7;
        bVar32 = true;
      }
      uVar60 = (ulong)uVar39;
      puVar35 = (ulong *)((long)puVar35 - (ulong)uVar47);
      uVar62 = *puVar35;
      puVar49 = puVar35;
      if (((ulong *)((long)puVar53 - 2U) < param_1) || (!bVar32)) goto joined_r0x00bb6d98;
      puVar8 = param_5 + ((uVar62 << (uVar60 & 0x3f)) >> (-uVar43 & 0x3f)) + 1;
      *(short *)param_1 = (short)*puVar8;
      uVar39 = uVar39 + *(byte *)((long)puVar8 + 2);
      uVar60 = (ulong)uVar39;
      param_1 = (ulong *)((long)param_1 + (ulong)*(byte *)((long)puVar8 + 3));
    }
    puVar49 = (ulong *)&DAT_007892b0;
joined_r0x00bb6d98:
    for (; param_1 <= (ulong *)((long)puVar53 - 2U);
        param_1 = (ulong *)((long)param_1 + (ulong)*(byte *)((long)puVar8 + 3))) {
      puVar8 = param_5 + ((uVar62 << (uVar60 & 0x3f)) >> (-uVar43 & 0x3f)) + 1;
      *(short *)param_1 = (short)*puVar8;
      uVar60 = (ulong)((int)uVar60 + (uint)*(byte *)((long)puVar8 + 2));
    }
  }
  uVar39 = (uint)uVar60;
  if (param_1 < puVar53) {
    puVar8 = param_5 + ((uVar62 << (uVar60 & 0x3f)) >> ((ulong)-uVar43 & 0x3f)) + 1;
    *(byte *)param_1 = (byte)*puVar8;
    if (*(char *)((long)puVar8 + 3) == '\x01') {
      uVar39 = uVar39 + *(byte *)((long)puVar8 + 2);
    }
    else if ((uVar39 < 0x40) && (uVar39 = uVar39 + *(byte *)((long)puVar8 + 2), 0x3f < uVar39)) {
      uVar39 = 0x40;
    }
  }
  iVar38 = (int)puVar40;
  uVar47 = (uint)uVar52;
  if ((ulong)((long)puVar37 - (long)puVar54) < 8) {
    if (0x40 < uVar47) goto LAB_00bb7bd0;
    if (local_168 < puVar1) {
      if (local_168 == puVar40) {
LAB_00bb710c:
        local_168 = puVar40;
      }
      else {
        uVar48 = (int)local_168 - iVar38;
        if (puVar40 <= (ulong *)((long)local_168 - (ulong)(uVar47 >> 3))) {
          uVar48 = uVar47 >> 3;
        }
        local_168 = (ulong *)((long)local_168 - (ulong)uVar48);
        uVar52 = (ulong)(uVar47 + uVar48 * -8);
        local_128 = (ulong *)*local_168;
      }
    }
    else {
      uVar52 = (ulong)(uVar47 & 7);
      local_168 = (ulong *)((long)local_168 - (ulong)(uVar47 >> 3));
      local_128 = (ulong *)*local_168;
    }
  }
  else {
    if ((uint)local_118 < 0xc) {
      if (0x40 < uVar47) goto LAB_00bb7bd0;
      uVar33 = (ulong)(-uVar43 & 0x3f);
      do {
        uVar47 = (uint)uVar52;
        if (local_168 < puVar1) {
          if (local_168 == puVar40) goto LAB_00bb710c;
          bVar32 = puVar40 <= (ulong *)((long)local_168 - (uVar52 >> 3));
          uVar48 = (uint)(uVar52 >> 3);
          if (!bVar32) {
            uVar48 = (int)local_168 - iVar38;
          }
          uVar47 = uVar47 + uVar48 * -8;
        }
        else {
          uVar48 = uVar47 >> 3;
          uVar47 = uVar47 & 7;
          bVar32 = true;
        }
        uVar52 = (ulong)uVar47;
        local_168 = (ulong *)((long)local_168 - (ulong)uVar48);
        local_128 = (ulong *)*local_168;
        if (((ulong *)((long)puVar37 - 9U) <= puVar54) || (!bVar32)) goto LAB_00bb70ec;
        puVar8 = param_5 + ((ulong)((long)local_128 << (uVar52 & 0x3f)) >> uVar33) + 1;
        *(short *)puVar54 = (short)*puVar8;
        uVar47 = uVar47 + *(byte *)((long)puVar8 + 2);
        pbVar50 = (byte *)((long)puVar54 + (ulong)*(byte *)((long)puVar8 + 3));
        puVar8 = param_5 + ((ulong)((long)local_128 << ((ulong)uVar47 & 0x3f)) >> uVar33) + 1;
        *(short *)pbVar50 = (short)*puVar8;
        uVar47 = uVar47 + *(byte *)((long)puVar8 + 2);
        pbVar50 = pbVar50 + *(byte *)((long)puVar8 + 3);
        puVar8 = param_5 + ((ulong)((long)local_128 << ((ulong)uVar47 & 0x3f)) >> uVar33) + 1;
        *(short *)pbVar50 = (short)*puVar8;
        uVar47 = uVar47 + *(byte *)((long)puVar8 + 2);
        pbVar50 = pbVar50 + *(byte *)((long)puVar8 + 3);
        puVar8 = param_5 + ((ulong)((long)local_128 << ((ulong)uVar47 & 0x3f)) >> uVar33) + 1;
        *(short *)pbVar50 = (short)*puVar8;
        bVar17 = *(byte *)((long)puVar8 + 3);
        uVar47 = uVar47 + *(byte *)((long)puVar8 + 2);
        puVar8 = param_5 + ((ulong)((long)local_128 << ((ulong)uVar47 & 0x3f)) >> uVar33) + 1;
        *(short *)(pbVar50 + bVar17) = (short)*puVar8;
        uVar47 = uVar47 + *(byte *)((long)puVar8 + 2);
        uVar52 = (ulong)uVar47;
        puVar54 = (ulong *)(pbVar50 + bVar17 + *(byte *)((long)puVar8 + 3));
      } while (uVar47 < 0x41);
    }
    else {
      if (0x40 < uVar47) {
LAB_00bb7bd0:
        local_168 = (ulong *)&DAT_007892b0;
        goto LAB_00bb7110;
      }
      uVar33 = (ulong)(-uVar43 & 0x3f);
      do {
        uVar47 = (uint)uVar52;
        if (local_168 < puVar1) {
          if (local_168 == puVar40) goto LAB_00bb710c;
          bVar32 = puVar40 <= (ulong *)((long)local_168 - (uVar52 >> 3));
          uVar48 = (uint)(uVar52 >> 3);
          if (!bVar32) {
            uVar48 = (int)local_168 - iVar38;
          }
          uVar47 = uVar47 + uVar48 * -8;
        }
        else {
          uVar48 = uVar47 >> 3;
          uVar47 = uVar47 & 7;
          bVar32 = true;
        }
        uVar52 = (ulong)uVar47;
        local_168 = (ulong *)((long)local_168 - (ulong)uVar48);
        local_128 = (ulong *)*local_168;
        if (((ulong *)((long)puVar37 - 7U) <= puVar54) || (!bVar32)) goto LAB_00bb70ec;
        puVar8 = param_5 + ((ulong)((long)local_128 << (uVar52 & 0x3f)) >> uVar33) + 1;
        *(short *)puVar54 = (short)*puVar8;
        uVar47 = uVar47 + *(byte *)((long)puVar8 + 2);
        pbVar50 = (byte *)((long)puVar54 + (ulong)*(byte *)((long)puVar8 + 3));
        puVar8 = param_5 + ((ulong)((long)local_128 << ((ulong)uVar47 & 0x3f)) >> uVar33) + 1;
        *(short *)pbVar50 = (short)*puVar8;
        uVar47 = uVar47 + *(byte *)((long)puVar8 + 2);
        pbVar50 = pbVar50 + *(byte *)((long)puVar8 + 3);
        puVar8 = param_5 + ((ulong)((long)local_128 << ((ulong)uVar47 & 0x3f)) >> uVar33) + 1;
        *(short *)pbVar50 = (short)*puVar8;
        bVar17 = *(byte *)((long)puVar8 + 3);
        uVar47 = uVar47 + *(byte *)((long)puVar8 + 2);
        puVar8 = param_5 + ((ulong)((long)local_128 << ((ulong)uVar47 & 0x3f)) >> uVar33) + 1;
        *(short *)(pbVar50 + bVar17) = (short)*puVar8;
        uVar47 = uVar47 + *(byte *)((long)puVar8 + 2);
        uVar52 = (ulong)uVar47;
        puVar54 = (ulong *)(pbVar50 + bVar17 + *(byte *)((long)puVar8 + 3));
      } while (uVar47 < 0x41);
    }
    local_168 = (ulong *)&DAT_007892b0;
  }
  goto LAB_00bb7110;
LAB_00bb70ec:
LAB_00bb7110:
  if (1 < (ulong)((long)puVar37 - (long)puVar54)) {
    uVar47 = (uint)uVar52;
    puVar53 = local_168;
    while (uVar47 < 0x41) {
      uVar47 = (uint)uVar52;
      if (puVar53 < puVar1) {
        local_168 = puVar40;
        if (puVar53 == puVar40) goto joined_r0x00bb71dc;
        bVar32 = puVar40 <= (ulong *)((long)puVar53 - (uVar52 >> 3));
        uVar48 = (uint)(uVar52 >> 3);
        if (!bVar32) {
          uVar48 = (int)puVar53 - iVar38;
        }
        uVar47 = uVar47 + uVar48 * -8;
      }
      else {
        uVar48 = uVar47 >> 3;
        uVar47 = uVar47 & 7;
        bVar32 = true;
      }
      uVar52 = (ulong)uVar47;
      puVar53 = (ulong *)((long)puVar53 - (ulong)uVar48);
      local_128 = (ulong *)*puVar53;
      local_168 = puVar53;
      if (((ulong *)((long)puVar37 - 2U) < puVar54) || (!bVar32)) goto joined_r0x00bb71dc;
      puVar8 = param_5 + ((ulong)((long)local_128 << (uVar52 & 0x3f)) >> (-uVar43 & 0x3f)) + 1;
      *(short *)puVar54 = (short)*puVar8;
      uVar47 = uVar47 + *(byte *)((long)puVar8 + 2);
      uVar52 = (ulong)uVar47;
      puVar54 = (ulong *)((long)puVar54 + (ulong)*(byte *)((long)puVar8 + 3));
    }
    local_168 = (ulong *)&DAT_007892b0;
joined_r0x00bb71dc:
    for (; puVar54 <= (ulong *)((long)puVar37 - 2U);
        puVar54 = (ulong *)((long)puVar54 + (ulong)*(byte *)((long)puVar8 + 3))) {
      puVar8 = param_5 + ((ulong)((long)local_128 << (uVar52 & 0x3f)) >> (-uVar43 & 0x3f)) + 1;
      *(short *)puVar54 = (short)*puVar8;
      uVar52 = (ulong)((int)uVar52 + (uint)*(byte *)((long)puVar8 + 2));
    }
  }
  uVar47 = (uint)uVar52;
  if (puVar54 < puVar37) {
    puVar8 = param_5 + ((ulong)((long)local_128 << (uVar52 & 0x3f)) >> ((ulong)-uVar43 & 0x3f)) + 1;
    *(byte *)puVar54 = (byte)*puVar8;
    if (*(char *)((long)puVar8 + 3) == '\x01') {
      uVar47 = uVar47 + *(byte *)((long)puVar8 + 2);
    }
    else if ((uVar47 < 0x40) && (uVar47 = uVar47 + *(byte *)((long)puVar8 + 2), 0x3f < uVar47)) {
      uVar47 = 0x40;
    }
  }
  iVar38 = (int)puVar9;
  uVar48 = (uint)uVar64;
  if ((ulong)((long)puVar34 - (long)puVar56) < 8) {
    if (uVar48 < 0x41) {
      if (local_138 < puVar2) {
        if (local_138 == puVar9) {
          puVar53 = puVar9;
        }
        else {
          uVar45 = (int)local_138 - iVar38;
          if (puVar9 <= (ulong *)((long)local_138 - (ulong)(uVar48 >> 3))) {
            uVar45 = uVar48 >> 3;
          }
          uVar64 = (ulong)(uVar48 + uVar45 * -8);
          local_130 = *(ulong *)((long)local_138 - (ulong)uVar45);
          puVar53 = (ulong *)((long)local_138 - (ulong)uVar45);
        }
      }
      else {
        uVar64 = (ulong)(uVar48 & 7);
        puVar53 = (ulong *)((long)local_138 - (ulong)(uVar48 >> 3));
        local_130 = *puVar53;
      }
    }
    else {
      puVar53 = (ulong *)&DAT_007892b0;
    }
  }
  else {
    if ((uint)local_118 < 0xc) {
      if (uVar48 < 0x41) {
        uVar48 = -uVar43 & 0x3f;
        do {
          uVar45 = (uint)uVar64;
          if (local_138 < puVar2) {
            puVar53 = puVar9;
            if (local_138 == puVar9) goto LAB_00bb7540;
            bVar32 = puVar9 <= (ulong *)((long)local_138 - (uVar64 >> 3));
            uVar51 = (uint)(uVar64 >> 3);
            if (!bVar32) {
              uVar51 = (int)local_138 - iVar38;
            }
            uVar45 = uVar45 + uVar51 * -8;
          }
          else {
            uVar51 = uVar45 >> 3;
            uVar45 = uVar45 & 7;
            bVar32 = true;
          }
          uVar64 = (ulong)uVar45;
          local_138 = (ulong *)((long)local_138 - (ulong)uVar51);
          local_130 = *local_138;
          puVar53 = local_138;
          if (((ulong *)((long)puVar34 - 9U) <= puVar56) || (!bVar32)) goto LAB_00bb7540;
          puVar8 = param_5 + ((local_130 << (uVar64 & 0x3f)) >> uVar48) + 1;
          *(short *)puVar56 = (short)*puVar8;
          uVar45 = uVar45 + *(byte *)((long)puVar8 + 2);
          pbVar50 = (byte *)((long)puVar56 + (ulong)*(byte *)((long)puVar8 + 3));
          puVar8 = param_5 + ((local_130 << ((ulong)uVar45 & 0x3f)) >> uVar48) + 1;
          *(short *)pbVar50 = (short)*puVar8;
          uVar45 = uVar45 + *(byte *)((long)puVar8 + 2);
          pbVar50 = pbVar50 + *(byte *)((long)puVar8 + 3);
          puVar8 = param_5 + ((local_130 << ((ulong)uVar45 & 0x3f)) >> uVar48) + 1;
          *(short *)pbVar50 = (short)*puVar8;
          uVar45 = uVar45 + *(byte *)((long)puVar8 + 2);
          pbVar50 = pbVar50 + *(byte *)((long)puVar8 + 3);
          puVar8 = param_5 + ((local_130 << ((ulong)uVar45 & 0x3f)) >> uVar48) + 1;
          *(short *)pbVar50 = (short)*puVar8;
          bVar17 = *(byte *)((long)puVar8 + 3);
          uVar45 = uVar45 + *(byte *)((long)puVar8 + 2);
          puVar8 = param_5 + ((local_130 << ((ulong)uVar45 & 0x3f)) >> uVar48) + 1;
          *(short *)(pbVar50 + bVar17) = (short)*puVar8;
          uVar45 = uVar45 + *(byte *)((long)puVar8 + 2);
          uVar64 = (ulong)uVar45;
          puVar56 = (ulong *)(pbVar50 + bVar17 + *(byte *)((long)puVar8 + 3));
        } while (uVar45 < 0x41);
        goto LAB_00bb7518;
      }
LAB_00bb7bf0:
      puVar53 = (ulong *)&DAT_007892b0;
    }
    else {
      if (0x40 < uVar48) goto LAB_00bb7bf0;
      uVar48 = -uVar43 & 0x3f;
      do {
        uVar45 = (uint)uVar64;
        if (local_138 < puVar2) {
          puVar53 = puVar9;
          if (local_138 == puVar9) goto LAB_00bb7540;
          bVar32 = puVar9 <= (ulong *)((long)local_138 - (uVar64 >> 3));
          uVar51 = (uint)(uVar64 >> 3);
          if (!bVar32) {
            uVar51 = (int)local_138 - iVar38;
          }
          uVar45 = uVar45 + uVar51 * -8;
        }
        else {
          uVar51 = uVar45 >> 3;
          uVar45 = uVar45 & 7;
          bVar32 = true;
        }
        uVar64 = (ulong)uVar45;
        local_138 = (ulong *)((long)local_138 - (ulong)uVar51);
        local_130 = *local_138;
        puVar53 = local_138;
        if (((ulong *)((long)puVar34 - 7U) <= puVar56) || (!bVar32)) goto LAB_00bb7540;
        puVar8 = param_5 + ((local_130 << (uVar64 & 0x3f)) >> uVar48) + 1;
        *(short *)puVar56 = (short)*puVar8;
        uVar45 = uVar45 + *(byte *)((long)puVar8 + 2);
        pbVar50 = (byte *)((long)puVar56 + (ulong)*(byte *)((long)puVar8 + 3));
        puVar8 = param_5 + ((local_130 << ((ulong)uVar45 & 0x3f)) >> uVar48) + 1;
        *(short *)pbVar50 = (short)*puVar8;
        uVar45 = uVar45 + *(byte *)((long)puVar8 + 2);
        pbVar50 = pbVar50 + *(byte *)((long)puVar8 + 3);
        puVar8 = param_5 + ((local_130 << ((ulong)uVar45 & 0x3f)) >> uVar48) + 1;
        *(short *)pbVar50 = (short)*puVar8;
        bVar17 = *(byte *)((long)puVar8 + 3);
        uVar45 = uVar45 + *(byte *)((long)puVar8 + 2);
        puVar8 = param_5 + ((local_130 << ((ulong)uVar45 & 0x3f)) >> uVar48) + 1;
        *(short *)(pbVar50 + bVar17) = (short)*puVar8;
        uVar45 = uVar45 + *(byte *)((long)puVar8 + 2);
        uVar64 = (ulong)uVar45;
        puVar56 = (ulong *)(pbVar50 + bVar17 + *(byte *)((long)puVar8 + 3));
      } while (uVar45 < 0x41);
LAB_00bb7518:
      puVar53 = (ulong *)&DAT_007892b0;
    }
LAB_00bb7540:
  }
  if (1 < (ulong)((long)puVar34 - (long)puVar56)) {
    if ((uint)uVar64 < 0x41) {
      do {
        uVar48 = (uint)uVar64;
        if (puVar53 < puVar2) {
          puVar37 = puVar9;
          if (puVar53 == puVar9) goto joined_r0x00bb7608;
          bVar32 = puVar9 <= (ulong *)((long)puVar53 - (uVar64 >> 3));
          uVar45 = (uint)(uVar64 >> 3);
          if (!bVar32) {
            uVar45 = (int)puVar53 - iVar38;
          }
          uVar48 = uVar48 + uVar45 * -8;
        }
        else {
          uVar45 = uVar48 >> 3;
          uVar48 = uVar48 & 7;
          bVar32 = true;
        }
        uVar64 = (ulong)uVar48;
        puVar53 = (ulong *)((long)puVar53 - (ulong)uVar45);
        local_130 = *puVar53;
        puVar37 = puVar53;
        if (((ulong *)((long)puVar34 - 2U) < puVar56) || (!bVar32)) goto joined_r0x00bb7608;
        puVar8 = param_5 + ((local_130 << (uVar64 & 0x3f)) >> (-uVar43 & 0x3f)) + 1;
        *(short *)puVar56 = (short)*puVar8;
        uVar48 = uVar48 + *(byte *)((long)puVar8 + 2);
        uVar64 = (ulong)uVar48;
        puVar56 = (ulong *)((long)puVar56 + (ulong)*(byte *)((long)puVar8 + 3));
      } while (uVar48 < 0x41);
      puVar37 = (ulong *)&DAT_007892b0;
    }
    else {
      puVar37 = (ulong *)&DAT_007892b0;
    }
joined_r0x00bb7608:
    for (; puVar53 = puVar37, puVar56 <= (ulong *)((long)puVar34 - 2U);
        puVar56 = (ulong *)((long)puVar56 + (ulong)*(byte *)((long)puVar8 + 3))) {
      puVar8 = param_5 + ((local_130 << (uVar64 & 0x3f)) >> (-uVar43 & 0x3f)) + 1;
      *(short *)puVar56 = (short)*puVar8;
      uVar64 = (ulong)((int)uVar64 + (uint)*(byte *)((long)puVar8 + 2));
      puVar37 = puVar53;
    }
  }
  uVar48 = (uint)uVar64;
  if (puVar56 < puVar34) {
    puVar8 = param_5 + ((local_130 << (uVar64 & 0x3f)) >> ((ulong)-uVar43 & 0x3f)) + 1;
    *(byte *)puVar56 = (byte)*puVar8;
    if (*(char *)((long)puVar8 + 3) == '\x01') {
      uVar48 = uVar48 + *(byte *)((long)puVar8 + 2);
    }
    else if ((uVar48 < 0x40) && (uVar48 = uVar48 + *(byte *)((long)puVar8 + 2), 0x3f < uVar48)) {
      uVar48 = 0x40;
    }
  }
  iVar38 = (int)local_f0;
  if ((ulong)((long)puVar3 - (long)puVar46) < 8) {
    uVar33 = (ulong)local_100 & 0xffffffff;
    if ((uint)local_100 < 0x41) {
      if (local_f8 < local_e8[0]) {
        if (local_f8 == local_f0) goto LAB_00bb79f4;
        uVar51 = (int)local_f8 - iVar38;
        if (local_f0 <= (ulong *)((long)local_f8 - (ulong)((uint)local_100 >> 3))) {
          uVar51 = (uint)local_100 >> 3;
        }
        uVar45 = (uint)local_100 + uVar51 * -8;
        local_f8 = (ulong *)((long)local_f8 - (ulong)uVar51);
        local_100 = (ulong *)CONCAT44(local_100._4_4_,uVar45);
        local_108 = (ulong *)*local_f8;
      }
      else {
        local_f8 = (ulong *)((long)local_f8 - (ulong)((uint)local_100 >> 3));
        uVar45 = (uint)local_100 & 7;
        local_100 = (ulong *)((ulong)local_100 & 0xffffffff00000007);
        local_108 = (ulong *)*local_f8;
      }
      uVar33 = (ulong)uVar45;
    }
    else {
      local_f8 = (ulong *)&DAT_007892b0;
    }
  }
  else {
    uVar33 = (ulong)local_100 & 0xffffffff;
    if ((uint)local_118 < 0xc) {
      if ((uint)local_100 < 0x41) {
        uVar45 = -uVar43 & 0x3f;
        do {
          uVar51 = (uint)uVar33;
          if (local_f8 < local_e8[0]) {
            if (local_f8 == local_f0) goto LAB_00bb79f4;
            bVar32 = local_f0 <= (ulong *)((long)local_f8 - (uVar33 >> 3));
            uVar30 = (uint)(uVar33 >> 3);
            if (!bVar32) {
              uVar30 = (int)local_f8 - iVar38;
            }
            uVar51 = uVar51 + uVar30 * -8;
          }
          else {
            uVar30 = uVar51 >> 3;
            uVar51 = uVar51 & 7;
            bVar32 = true;
          }
          uVar33 = (ulong)uVar51;
          local_f8 = (ulong *)((long)local_f8 - (ulong)uVar30);
          local_100 = (ulong *)CONCAT44(local_100._4_4_,uVar51);
          local_108 = (ulong *)*local_f8;
          if (((ulong *)((long)puVar3 - 9U) <= puVar46) || (!bVar32)) goto LAB_00bb79f4;
          puVar8 = param_5 + ((ulong)((long)local_108 << (uVar33 & 0x3f)) >> uVar45) + 1;
          *(short *)puVar46 = (short)*puVar8;
          uVar51 = uVar51 + *(byte *)((long)puVar8 + 2);
          pbVar50 = (byte *)((long)puVar46 + (ulong)*(byte *)((long)puVar8 + 3));
          puVar8 = param_5 + ((ulong)((long)local_108 << ((ulong)uVar51 & 0x3f)) >> uVar45) + 1;
          *(short *)pbVar50 = (short)*puVar8;
          uVar51 = uVar51 + *(byte *)((long)puVar8 + 2);
          pbVar50 = pbVar50 + *(byte *)((long)puVar8 + 3);
          puVar8 = param_5 + ((ulong)((long)local_108 << ((ulong)uVar51 & 0x3f)) >> uVar45) + 1;
          *(short *)pbVar50 = (short)*puVar8;
          uVar51 = uVar51 + *(byte *)((long)puVar8 + 2);
          pbVar50 = pbVar50 + *(byte *)((long)puVar8 + 3);
          puVar8 = param_5 + ((ulong)((long)local_108 << ((ulong)uVar51 & 0x3f)) >> uVar45) + 1;
          *(short *)pbVar50 = (short)*puVar8;
          uVar51 = uVar51 + *(byte *)((long)puVar8 + 2);
          puVar10 = param_5 + ((ulong)((long)local_108 << ((ulong)uVar51 & 0x3f)) >> uVar45) + 1;
          bVar17 = *(byte *)((long)puVar8 + 3);
          *(short *)(pbVar50 + bVar17) = (short)*puVar10;
          uVar51 = uVar51 + *(byte *)((long)puVar10 + 2);
          uVar33 = (ulong)uVar51;
          local_100 = (ulong *)CONCAT44(local_100._4_4_,uVar51);
          puVar46 = (ulong *)(pbVar50 + bVar17 + *(byte *)((long)puVar10 + 3));
        } while (uVar51 < 0x41);
      }
    }
    else if ((uint)local_100 < 0x41) {
      uVar45 = -uVar43 & 0x3f;
      do {
        uVar51 = (uint)uVar33;
        if (local_f8 < local_e8[0]) {
          if (local_f8 == local_f0) goto LAB_00bb79f4;
          bVar32 = local_f0 <= (ulong *)((long)local_f8 - (uVar33 >> 3));
          uVar30 = (uint)(uVar33 >> 3);
          if (!bVar32) {
            uVar30 = (int)local_f8 - iVar38;
          }
          uVar51 = uVar51 + uVar30 * -8;
        }
        else {
          uVar30 = uVar51 >> 3;
          uVar51 = uVar51 & 7;
          bVar32 = true;
        }
        uVar33 = (ulong)uVar51;
        local_f8 = (ulong *)((long)local_f8 - (ulong)uVar30);
        local_100 = (ulong *)CONCAT44(local_100._4_4_,uVar51);
        local_108 = (ulong *)*local_f8;
        if ((puVar44 <= puVar46) || (!bVar32)) goto LAB_00bb79f4;
        puVar8 = param_5 + ((ulong)((long)local_108 << (uVar33 & 0x3f)) >> uVar45) + 1;
        *(short *)puVar46 = (short)*puVar8;
        uVar51 = uVar51 + *(byte *)((long)puVar8 + 2);
        pbVar50 = (byte *)((long)puVar46 + (ulong)*(byte *)((long)puVar8 + 3));
        puVar8 = param_5 + ((ulong)((long)local_108 << ((ulong)uVar51 & 0x3f)) >> uVar45) + 1;
        *(short *)pbVar50 = (short)*puVar8;
        uVar51 = uVar51 + *(byte *)((long)puVar8 + 2);
        pbVar50 = pbVar50 + *(byte *)((long)puVar8 + 3);
        puVar8 = param_5 + ((ulong)((long)local_108 << ((ulong)uVar51 & 0x3f)) >> uVar45) + 1;
        *(short *)pbVar50 = (short)*puVar8;
        bVar17 = *(byte *)((long)puVar8 + 3);
        uVar51 = uVar51 + *(byte *)((long)puVar8 + 2);
        puVar8 = param_5 + ((ulong)((long)local_108 << ((ulong)uVar51 & 0x3f)) >> uVar45) + 1;
        *(short *)(pbVar50 + bVar17) = (short)*puVar8;
        uVar51 = uVar51 + *(byte *)((long)puVar8 + 2);
        uVar33 = (ulong)uVar51;
        local_100 = (ulong *)CONCAT44(local_100._4_4_,uVar51);
        puVar46 = (ulong *)(pbVar50 + bVar17 + *(byte *)((long)puVar8 + 3));
      } while (uVar51 < 0x41);
    }
    local_f8 = (ulong *)&DAT_007892b0;
  }
LAB_00bb79f4:
  if (1 < (ulong)((long)puVar3 - (long)puVar46)) {
    uVar45 = (uint)uVar33;
    while (uVar45 < 0x41) {
      uVar45 = (uint)uVar33;
      if (local_f8 < local_e8[0]) {
        if (local_f8 == local_f0) goto joined_r0x00bb7ac4;
        bVar32 = local_f0 <= (ulong *)((long)local_f8 - (uVar33 >> 3));
        uVar51 = (uint)(uVar33 >> 3);
        if (!bVar32) {
          uVar51 = (int)local_f8 - iVar38;
        }
        uVar45 = uVar45 + uVar51 * -8;
      }
      else {
        uVar51 = uVar45 >> 3;
        uVar45 = uVar45 & 7;
        bVar32 = true;
      }
      uVar33 = (ulong)uVar45;
      local_f8 = (ulong *)((long)local_f8 - (ulong)uVar51);
      local_100._4_4_ = (undefined4)((ulong)local_100 >> 0x20);
      local_100 = (ulong *)CONCAT44(local_100._4_4_,uVar45);
      local_108 = (ulong *)*local_f8;
      if (((ulong *)((long)puVar3 - 2U) < puVar46) || (!bVar32)) goto joined_r0x00bb7ac4;
      puVar8 = param_5 + ((ulong)((long)local_108 << (uVar33 & 0x3f)) >> (-uVar43 & 0x3f)) + 1;
      *(short *)puVar46 = (short)*puVar8;
      uVar45 = uVar45 + *(byte *)((long)puVar8 + 2);
      uVar33 = (ulong)uVar45;
      puVar46 = (ulong *)((long)puVar46 + (ulong)*(byte *)((long)puVar8 + 3));
      local_100 = (ulong *)CONCAT44(local_100._4_4_,uVar45);
    }
    local_f8 = (ulong *)&DAT_007892b0;
joined_r0x00bb7ac4:
    for (; puVar46 <= (ulong *)((long)puVar3 - 2U);
        puVar46 = (ulong *)((long)puVar46 + (ulong)*(byte *)((long)puVar8 + 3))) {
      puVar8 = param_5 + ((ulong)((long)local_108 << (uVar33 & 0x3f)) >> (-uVar43 & 0x3f)) + 1;
      *(short *)puVar46 = (short)*puVar8;
      uVar45 = (uint)local_100 + *(byte *)((long)puVar8 + 2);
      uVar33 = (ulong)uVar45;
      local_100._4_4_ = (undefined4)((ulong)local_100 >> 0x20);
      local_100 = (ulong *)CONCAT44(local_100._4_4_,uVar45);
    }
  }
  uVar45 = (uint)uVar33;
  if (puVar46 < puVar3) {
    param_5 = param_5 + ((ulong)((long)local_108 << (uVar33 & 0x3f)) >> ((ulong)-uVar43 & 0x3f)) + 1
    ;
    *(byte *)puVar46 = (byte)*param_5;
    if (*(char *)((long)param_5 + 3) == '\x01') {
      uVar45 = (uint)local_100 + *(byte *)((long)param_5 + 2);
    }
    else {
      uVar45 = (uint)local_100;
      if (((uint)local_100 < 0x40) &&
         (uVar45 = (uint)local_100 + *(byte *)((long)param_5 + 2), 0x3f < uVar45)) {
        uVar45 = 0x40;
      }
    }
  }
  uVar33 = 0xffffffffffffffec;
  if (((((((uVar45 == 0x40 && local_f8 == local_f0) && uVar48 == 0x40) && puVar53 == puVar9) &&
        uVar47 == 0x40) && local_168 == puVar40) && uVar39 == 0x40) && puVar49 == puVar42) {
    uVar33 = param_2;
  }
LAB_00bb695c:
  if (*(long *)(lVar31 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar33);
  }
  return;
}

