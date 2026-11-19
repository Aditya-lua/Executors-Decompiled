/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bb907c
 */

/* WARNING: Type propagation algorithm not settling */

ulong HUF_decompress4X_hufOnly_wksp
                (uint *param_1,ulong *param_2,ulong param_3,long param_4,ulong param_5,
                undefined8 param_6,undefined8 param_7,uint param_8)

{
  long lVar1;
  ulong *puVar2;
  ulong *puVar3;
  ulong *puVar4;
  undefined2 *puVar5;
  undefined2 *puVar6;
  undefined2 *puVar7;
  undefined2 *puVar8;
  uint *puVar9;
  ulong *puVar10;
  uint *puVar11;
  uint *puVar12;
  uint *puVar13;
  byte *pbVar14;
  byte *pbVar15;
  byte *pbVar16;
  byte *pbVar17;
  ushort *puVar18;
  byte bVar19;
  byte bVar20;
  byte bVar21;
  byte bVar22;
  byte bVar23;
  byte bVar24;
  byte bVar25;
  byte bVar26;
  byte bVar27;
  ushort uVar28;
  ushort uVar29;
  ushort uVar30;
  ushort uVar31;
  uint uVar32;
  ulong uVar33;
  bool bVar34;
  ulong *puVar35;
  ulong *puVar36;
  long lVar37;
  ulong *puVar38;
  uint uVar39;
  ulong *puVar40;
  undefined2 *puVar41;
  ulong *puVar42;
  uint uVar43;
  ulong *puVar44;
  ulong uVar45;
  uint uVar46;
  int iVar47;
  ulong *puVar48;
  uint uVar49;
  uint uVar50;
  ulong *puVar51;
  byte *pbVar52;
  uint uVar53;
  ulong uVar54;
  ulong *puVar55;
  ulong *puVar56;
  long lVar57;
  ulong *puVar58;
  ulong *puVar59;
  int iVar60;
  ulong uVar61;
  ulong uVar62;
  int iVar63;
  ulong uVar64;
  int iVar65;
  ulong uVar66;
  ulong uVar67;
  ulong *puVar68;
  ulong *puStack_190;
  uint uStack_184;
  ulong *puStack_168;
  ulong *puStack_138;
  ulong uStack_130;
  ulong *puStack_128;
  ulong uStack_120;
  ulong uStack_118;
  ulong *puStack_108;
  undefined8 uStack_100;
  ulong *puStack_f8;
  ulong *puStack_f0;
  ulong *apuStack_e8 [4];
  ulong auStack_c8 [4];
  long lStack_a8;
  ulong *puStack_a0;
  long lStack_98;
  long alStack_90 [4];
  long lStack_70;
  
  if (param_3 == 0) {
    return 0xffffffffffffffba;
  }
  if (param_5 == 0) {
    return 0xffffffffffffffec;
  }
  if (param_5 < param_3) {
    uVar45 = 0;
    if (param_3 != 0) {
      uVar45 = (param_5 << 4) / param_3;
    }
    uVar45 = uVar45 & 0xffffffff;
  }
  else {
    uVar45 = 0xf;
  }
  lVar1 = uVar45 * 0x10;
  iVar47 = (int)(param_3 >> 8);
  uVar39 = *(int *)(&DAT_007891b4 + lVar1) + *(int *)(&DAT_007891b8 + lVar1) * iVar47;
  if ((uint)(*(int *)(&DAT_007891ac + lVar1) + *(int *)(&DAT_007891b0 + lVar1) * iVar47) <=
      uVar39 + (uVar39 >> 5)) {
    uVar45 = HUF_readDTableX1_wksp(param_1,param_4,param_5,param_6,param_7,param_8);
    if (0xffffffffffffff88 < uVar45) {
      return uVar45;
    }
    uVar33 = param_5 - uVar45;
    if (param_5 < uVar45 || uVar33 == 0) {
      return 0xffffffffffffffb8;
    }
    puVar18 = (ushort *)(param_4 + uVar45);
    lVar1 = tpidr_el0;
    lStack_70 = *(long *)(lVar1 + 0x28);
    if ((param_8 >> 5 & 1) == 0) {
      uVar45 = FUN_00bba0f0(&puStack_108,param_2,param_3,puVar18,uVar33,param_1);
      if (uVar45 - 1 < 0xffffffffffffff87 || uVar45 == 0xffffffffffffff88) {
        uVar45 = (ulong)(lStack_98 - (long)apuStack_e8[3]) / 5;
        uVar61 = (ulong)((long)puStack_108 - (long)puStack_a0) / 7;
        if (uVar61 <= uVar45) {
          uVar45 = uVar61;
        }
        if (uVar45 != 0) {
          puVar41 = (undefined2 *)((long)apuStack_e8[3] + uVar45 * 5);
          do {
            if (((uStack_100 < puStack_108) || (puStack_f8 < uStack_100)) ||
               (puStack_f0 < puStack_f8)) break;
            uVar45 = lStack_98 - (long)apuStack_e8[3];
            do {
              uVar45 = uVar45 - 5;
              uVar28 = *(ushort *)(lStack_a8 + (auStack_c8[0] >> 0x35) * 2);
              auStack_c8[0] = auStack_c8[0] << ((ulong)uVar28 & 0x3f);
              *(char *)apuStack_e8[0] = (char)(uVar28 >> 8);
              uVar28 = *(ushort *)(lStack_a8 + (auStack_c8[1] >> 0x35) * 2);
              auStack_c8[1] = auStack_c8[1] << ((ulong)uVar28 & 0x3f);
              *(char *)apuStack_e8[1] = (char)(uVar28 >> 8);
              uVar28 = *(ushort *)(lStack_a8 + (auStack_c8[2] >> 0x35) * 2);
              auStack_c8[2] = auStack_c8[2] << ((ulong)uVar28 & 0x3f);
              *(char *)apuStack_e8[2] = (char)(uVar28 >> 8);
              uVar28 = *(ushort *)(lStack_a8 + (auStack_c8[3] >> 0x35) * 2);
              auStack_c8[3] = auStack_c8[3] << ((ulong)uVar28 & 0x3f);
              *(char *)apuStack_e8[3] = (char)(uVar28 >> 8);
              uVar28 = *(ushort *)(lStack_a8 + (auStack_c8[0] >> 0x35) * 2);
              auStack_c8[0] = auStack_c8[0] << ((ulong)uVar28 & 0x3f);
              *(char *)((long)apuStack_e8[0] + 1) = (char)(uVar28 >> 8);
              uVar28 = *(ushort *)(lStack_a8 + (auStack_c8[1] >> 0x35) * 2);
              auStack_c8[1] = auStack_c8[1] << ((ulong)uVar28 & 0x3f);
              *(char *)((long)apuStack_e8[1] + 1) = (char)(uVar28 >> 8);
              uVar28 = *(ushort *)(lStack_a8 + (auStack_c8[2] >> 0x35) * 2);
              auStack_c8[2] = auStack_c8[2] << ((ulong)uVar28 & 0x3f);
              *(char *)((long)apuStack_e8[2] + 1) = (char)(uVar28 >> 8);
              uVar28 = *(ushort *)(lStack_a8 + (auStack_c8[3] >> 0x35) * 2);
              auStack_c8[3] = auStack_c8[3] << ((ulong)uVar28 & 0x3f);
              *(char *)((long)apuStack_e8[3] + 1) = (char)(uVar28 >> 8);
              uVar28 = *(ushort *)(lStack_a8 + (auStack_c8[0] >> 0x35) * 2);
              auStack_c8[0] = auStack_c8[0] << ((ulong)uVar28 & 0x3f);
              *(char *)((long)apuStack_e8[0] + 2) = (char)(uVar28 >> 8);
              uVar28 = *(ushort *)(lStack_a8 + (auStack_c8[1] >> 0x35) * 2);
              auStack_c8[1] = auStack_c8[1] << ((ulong)uVar28 & 0x3f);
              *(char *)((long)apuStack_e8[1] + 2) = (char)(uVar28 >> 8);
              uVar28 = *(ushort *)(lStack_a8 + (auStack_c8[2] >> 0x35) * 2);
              auStack_c8[2] = auStack_c8[2] << ((ulong)uVar28 & 0x3f);
              *(char *)((long)apuStack_e8[2] + 2) = (char)(uVar28 >> 8);
              uVar28 = *(ushort *)(lStack_a8 + (auStack_c8[3] >> 0x35) * 2);
              auStack_c8[3] = auStack_c8[3] << ((ulong)uVar28 & 0x3f);
              *(char *)((long)apuStack_e8[3] + 2) = (char)(uVar28 >> 8);
              uVar28 = *(ushort *)(lStack_a8 + (auStack_c8[0] >> 0x35) * 2);
              auStack_c8[0] = auStack_c8[0] << ((ulong)uVar28 & 0x3f);
              *(char *)((long)apuStack_e8[0] + 3) = (char)(uVar28 >> 8);
              uVar28 = *(ushort *)(lStack_a8 + (auStack_c8[1] >> 0x35) * 2);
              auStack_c8[1] = auStack_c8[1] << ((ulong)uVar28 & 0x3f);
              *(char *)((long)apuStack_e8[1] + 3) = (char)(uVar28 >> 8);
              uVar28 = *(ushort *)(lStack_a8 + (auStack_c8[2] >> 0x35) * 2);
              auStack_c8[2] = auStack_c8[2] << ((ulong)uVar28 & 0x3f);
              *(char *)((long)apuStack_e8[2] + 3) = (char)(uVar28 >> 8);
              uVar28 = *(ushort *)(lStack_a8 + (auStack_c8[3] >> 0x35) * 2);
              auStack_c8[3] = auStack_c8[3] << ((ulong)uVar28 & 0x3f);
              *(char *)((long)apuStack_e8[3] + 3) = (char)(uVar28 >> 8);
              uVar28 = *(ushort *)(lStack_a8 + (auStack_c8[0] >> 0x35) * 2);
              auStack_c8[0] = auStack_c8[0] << ((ulong)uVar28 & 0x3f);
              *(char *)((long)apuStack_e8[0] + 4) = (char)(uVar28 >> 8);
              apuStack_e8[0] = (ulong *)((long)apuStack_e8[0] + 5);
              uVar28 = *(ushort *)(lStack_a8 + (auStack_c8[1] >> 0x35) * 2);
              auStack_c8[1] = auStack_c8[1] << ((ulong)uVar28 & 0x3f);
              *(char *)((long)apuStack_e8[1] + 4) = (char)(uVar28 >> 8);
              uVar61 = (auStack_c8[1] & 0xaaaaaaaaaaaaaaaa) >> 1 |
                       (auStack_c8[1] & 0x5555555555555555) << 1;
              uVar61 = (uVar61 & 0xcccccccccccccccc) >> 2 | (uVar61 & 0x3333333333333333) << 2;
              uVar61 = (uVar61 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar61 & 0xf0f0f0f0f0f0f0f) << 4;
              uVar61 = (uVar61 & 0xff00ff00ff00ff00) >> 8 | (uVar61 & 0xff00ff00ff00ff) << 8;
              uVar61 = (uVar61 & 0xffff0000ffff0000) >> 0x10 | (uVar61 & 0xffff0000ffff) << 0x10;
              apuStack_e8[1] = (ulong *)((long)apuStack_e8[1] + 5);
              uVar28 = *(ushort *)(lStack_a8 + (auStack_c8[2] >> 0x35) * 2);
              uVar54 = LZCOUNT(uVar61 >> 0x20 | uVar61 << 0x20);
              uStack_100 = (ulong *)((long)uStack_100 - (uVar54 >> 3));
              *(char *)((long)apuStack_e8[2] + 4) = (char)(uVar28 >> 8);
              auStack_c8[2] = auStack_c8[2] << ((ulong)uVar28 & 0x3f);
              uVar61 = (auStack_c8[0] & 0xaaaaaaaaaaaaaaaa) >> 1 |
                       (auStack_c8[0] & 0x5555555555555555) << 1;
              uVar61 = (uVar61 & 0xcccccccccccccccc) >> 2 | (uVar61 & 0x3333333333333333) << 2;
              uVar61 = (uVar61 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar61 & 0xf0f0f0f0f0f0f0f) << 4;
              uVar61 = (uVar61 & 0xff00ff00ff00ff00) >> 8 | (uVar61 & 0xff00ff00ff00ff) << 8;
              uVar61 = (uVar61 & 0xffff0000ffff0000) >> 0x10 | (uVar61 & 0xffff0000ffff) << 0x10;
              uVar28 = *(ushort *)(lStack_a8 + (auStack_c8[3] >> 0x35) * 2);
              apuStack_e8[2] = (ulong *)((long)apuStack_e8[2] + 5);
              uVar64 = (auStack_c8[2] & 0xaaaaaaaaaaaaaaaa) >> 1 |
                       (auStack_c8[2] & 0x5555555555555555) << 1;
              uVar64 = (uVar64 & 0xcccccccccccccccc) >> 2 | (uVar64 & 0x3333333333333333) << 2;
              uVar64 = (uVar64 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar64 & 0xf0f0f0f0f0f0f0f) << 4;
              uVar64 = (uVar64 & 0xff00ff00ff00ff00) >> 8 | (uVar64 & 0xff00ff00ff00ff) << 8;
              uVar64 = (uVar64 & 0xffff0000ffff0000) >> 0x10 | (uVar64 & 0xffff0000ffff) << 0x10;
              uVar62 = LZCOUNT(uVar61 >> 0x20 | uVar61 << 0x20);
              auStack_c8[3] = auStack_c8[3] << ((ulong)uVar28 & 0x3f);
              puStack_108 = (ulong *)((long)puStack_108 - (uVar62 >> 3));
              uVar64 = LZCOUNT(uVar64 >> 0x20 | uVar64 << 0x20);
              uVar61 = (auStack_c8[3] & 0xaaaaaaaaaaaaaaaa) >> 1 |
                       (auStack_c8[3] & 0x5555555555555555) << 1;
              uVar61 = (uVar61 & 0xcccccccccccccccc) >> 2 | (uVar61 & 0x3333333333333333) << 2;
              uVar61 = (uVar61 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar61 & 0xf0f0f0f0f0f0f0f) << 4;
              uVar61 = (uVar61 & 0xff00ff00ff00ff00) >> 8 | (uVar61 & 0xff00ff00ff00ff) << 8;
              uVar61 = (uVar61 & 0xffff0000ffff0000) >> 0x10 | (uVar61 & 0xffff0000ffff) << 0x10;
              puStack_f8 = (ulong *)((long)puStack_f8 - (uVar64 >> 3));
              *(char *)((long)apuStack_e8[3] + 4) = (char)(uVar28 >> 8);
              uVar61 = LZCOUNT(uVar61 >> 0x20 | uVar61 << 0x20);
              apuStack_e8[3] = (ulong *)((long)apuStack_e8[3] + 5);
              puStack_f0 = (ulong *)((long)puStack_f0 - (uVar61 >> 3));
              auStack_c8[0] = (*puStack_108 | 1) << (uVar62 & 7);
              auStack_c8[2] = (*puStack_f8 | 1) << (uVar64 & 7);
              auStack_c8[1] = (*uStack_100 | 1) << (uVar54 & 7);
              auStack_c8[3] = (*puStack_f0 | 1) << (uVar61 & 7);
            } while (apuStack_e8[3] < puVar41);
            uVar64 = (ulong)((long)puStack_108 - (long)puStack_a0) / 7;
            uVar61 = uVar45 / 5;
            if (uVar64 <= uVar45 / 5) {
              uVar61 = uVar64;
            }
            puVar41 = (undefined2 *)((long)apuStack_e8[3] + uVar61 * 5);
          } while (uVar61 != 0);
        }
        lVar57 = 0;
        uVar45 = param_3 + 3 >> 2;
        puVar4 = (ulong *)((long)param_2 + (param_3 & ((long)param_3 >> 0x3f ^ 0xffffffffffffffffU))
                          );
        puVar55 = param_2;
        do {
          uVar61 = (long)puVar4 - (long)puVar55;
          puVar38 = (ulong *)((long)puVar55 + uVar45);
          puVar35 = apuStack_e8[lVar57];
          puVar55 = puVar4;
          if (uVar45 <= uVar61) {
            puVar55 = puVar38;
          }
          if ((puVar55 < puVar35) ||
             (puVar38 = apuStack_e8[lVar57 + -4], puVar38 < (ulong *)(alStack_90[lVar57] + -8)))
          goto LAB_00bb87ec;
          uVar64 = *puVar38;
          uVar61 = (auStack_c8[lVar57] & 0xaaaaaaaaaaaaaaaa) >> 1 |
                   (auStack_c8[lVar57] & 0x5555555555555555) << 1;
          uVar61 = (uVar61 & 0xcccccccccccccccc) >> 2 | (uVar61 & 0x3333333333333333) << 2;
          uVar61 = (uVar61 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar61 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar61 = (uVar61 & 0xff00ff00ff00ff00) >> 8 | (uVar61 & 0xff00ff00ff00ff) << 8;
          uVar61 = (uVar61 & 0xffff0000ffff0000) >> 0x10 | (uVar61 & 0xffff0000ffff) << 0x10;
          lVar37 = (long)puVar55 - (long)puVar35;
          uVar61 = LZCOUNT(uVar61 >> 0x20 | uVar61 << 0x20);
          puVar42 = puVar35;
          if (3 < lVar37) {
            do {
              uVar39 = (uint)uVar61;
              if (puVar38 < puStack_a0 + 1) {
                if (puVar38 == puStack_a0) goto joined_r0x00bb8130;
                bVar34 = puStack_a0 <= (ulong *)((long)puVar38 - (uVar61 >> 3));
                uVar43 = (uint)(uVar61 >> 3);
                if (!bVar34) {
                  uVar43 = (int)puVar38 - (int)puStack_a0;
                }
                uVar39 = uVar39 + uVar43 * -8;
              }
              else {
                uVar43 = uVar39 >> 3;
                uVar39 = uVar39 & 7;
                bVar34 = true;
              }
              uVar61 = (ulong)uVar39;
              puVar38 = (ulong *)((long)puVar38 - (ulong)uVar43);
              uVar64 = *puVar38;
              if (((ulong *)((long)puVar55 - 3U) <= puVar42) || (!bVar34)) goto joined_r0x00bb8130;
              pbVar52 = (byte *)((long)param_1 + ((uVar64 << (uVar61 & 0x3f)) >> 0x35) * 2 + 4);
              uVar39 = uVar39 + *pbVar52;
              *(byte *)puVar42 = pbVar52[1];
              pbVar52 = (byte *)((long)param_1 +
                                ((uVar64 << ((ulong)uVar39 & 0x3f)) >> 0x35) * 2 + 4);
              uVar39 = uVar39 + *pbVar52;
              *(byte *)((long)puVar42 + 1) = pbVar52[1];
              pbVar52 = (byte *)((long)param_1 +
                                ((uVar64 << ((ulong)uVar39 & 0x3f)) >> 0x35) * 2 + 4);
              uVar39 = uVar39 + *pbVar52;
              *(byte *)((long)puVar42 + 2) = pbVar52[1];
              pbVar52 = (byte *)((long)param_1 +
                                ((uVar64 << ((ulong)uVar39 & 0x3f)) >> 0x35) * 2 + 4);
              puVar40 = (ulong *)((long)puVar42 + 4);
              uVar39 = uVar39 + *pbVar52;
              uVar61 = (ulong)uVar39;
              *(byte *)((long)puVar42 + 3) = pbVar52[1];
              puVar42 = puVar40;
              if (0x40 < uVar39) goto joined_r0x00bb8130;
            } while( true );
          }
          if (puVar38 < puStack_a0 + 1) {
            if (puVar38 != puStack_a0) {
              uVar39 = (int)puVar38 - (int)puStack_a0;
              if (puStack_a0 <= (ulong *)((long)puVar38 - (uVar61 >> 3))) {
                uVar39 = (uint)(uVar61 >> 3);
              }
              uVar64 = (ulong)uVar39;
              uVar39 = (uint)uVar61 + uVar39 * -8;
              goto LAB_00bb8140;
            }
          }
          else {
            uVar64 = uVar61 >> 3;
            uVar39 = (uint)uVar61 & 7;
LAB_00bb8140:
            uVar61 = (ulong)uVar39;
            uVar64 = *(ulong *)((long)puVar38 - uVar64);
          }
joined_r0x00bb8130:
          if (puVar42 < puVar55) {
            do {
              pbVar52 = (byte *)((long)param_1 + ((uVar64 << (uVar61 & 0x3f)) >> 0x35) * 2 + 4);
              bVar19 = *pbVar52;
              puVar38 = (ulong *)((long)puVar42 + 1);
              *(byte *)puVar42 = pbVar52[1];
              uVar61 = (ulong)((int)uVar61 + (uint)bVar19);
              puVar42 = puVar38;
            } while (puVar38 != puVar55);
            puVar35 = apuStack_e8[lVar57];
          }
          puVar35 = (ulong *)((long)puVar35 + lVar37);
          apuStack_e8[lVar57] = puVar35;
          if (puVar35 != puVar55) goto LAB_00bb87ec;
          lVar57 = lVar57 + 1;
        } while (lVar57 != 4);
        uVar45 = param_3;
      }
      if (uVar45 != 0) goto LAB_00bb87f0;
    }
    uVar45 = 0xffffffffffffffec;
    if ((param_3 < 6) || (uVar33 < 10)) goto LAB_00bb87f0;
    uVar28 = *puVar18;
    uVar29 = puVar18[1];
    uVar30 = puVar18[2];
    uVar61 = (ulong)uVar28 + (ulong)uVar29 + (ulong)uVar30 + 6;
    if (uVar33 < uVar61) goto LAB_00bb87f0;
    uVar64 = param_3 + 3 >> 2;
    puVar4 = (ulong *)((long)param_2 + param_3);
    puVar55 = (ulong *)((long)param_2 + uVar64);
    puVar38 = (ulong *)((long)puVar55 + uVar64);
    puVar35 = (ulong *)((long)puVar38 + uVar64);
    if (puVar4 < puVar35) goto LAB_00bb87f0;
    if (uVar28 != 0) {
      puVar42 = (ulong *)(puVar18 + 3);
      uVar31 = *(ushort *)((long)param_1 + 2);
      puVar40 = (ulong *)((long)puVar42 + (ulong)uVar28);
      uVar39 = (uint)uVar29;
      if (7 < uVar28) {
        if (*(byte *)((long)puVar40 + -1) == 0) {
LAB_00bb83dc:
          uVar45 = 0xffffffffffffffff;
          goto LAB_00bb87f0;
        }
        uVar62 = puVar40[-1];
        uVar43 = 8 - ((uint)LZCOUNT((uint)*(byte *)((long)puVar40 + -1)) ^ 0x1f);
        puVar51 = puVar40 + -1;
        if (uVar39 == 0) goto LAB_00bb83d4;
LAB_00bb82c4:
        uVar54 = (ulong)uVar43;
        puVar10 = (ulong *)((long)puVar40 + (ulong)uVar29);
        if (uVar29 < 8) {
          uStack_118 = (ulong)(byte)*puVar40;
          if (uVar29 < 5) {
            if (uVar39 != 2) {
              if (uVar39 != 3) {
                if (uVar39 != 4) goto LAB_00bb8368;
                goto LAB_00bb8350;
              }
              goto LAB_00bb8358;
            }
LAB_00bb8360:
            uStack_118 = uStack_118 + (ulong)*(byte *)((long)puVar40 + 1) * 0x100;
          }
          else {
            if (uVar29 == 5) {
LAB_00bb8348:
              uStack_118 = uStack_118 + ((ulong)*(byte *)((long)puVar40 + 4) << 0x20);
LAB_00bb8350:
              uStack_118 = uStack_118 + (ulong)*(byte *)((long)puVar40 + 3) * 0x1000000;
LAB_00bb8358:
              uStack_118 = uStack_118 + (ulong)*(byte *)((long)puVar40 + 2) * 0x10000;
              goto LAB_00bb8360;
            }
            if (uVar39 == 6) {
LAB_00bb8340:
              uStack_118 = uStack_118 + ((ulong)*(byte *)((long)puVar40 + 5) << 0x28);
              goto LAB_00bb8348;
            }
            if (uVar39 == 7) {
              uStack_118 = uStack_118 | (ulong)*(byte *)((long)puVar40 + 6) << 0x30;
              goto LAB_00bb8340;
            }
          }
LAB_00bb8368:
          if (*(byte *)((long)puVar10 + -1) != 0) {
            uVar39 = (int)LZCOUNT((uint)*(byte *)((long)puVar10 + -1)) + uVar39 * -8 + 0x29;
            puStack_128 = puVar40;
            goto LAB_00bb8380;
          }
LAB_00bb87ec:
          uVar45 = 0xffffffffffffffec;
          goto LAB_00bb87f0;
        }
        if (*(byte *)((long)puVar10 + -1) == 0) goto LAB_00bb83dc;
        uStack_118 = puVar10[-1];
        uVar39 = 8 - ((uint)LZCOUNT((uint)*(byte *)((long)puVar10 + -1)) ^ 0x1f);
        puStack_128 = puVar10 + -1;
LAB_00bb8380:
        uVar66 = (ulong)uVar39;
        if (uVar30 == 0) goto LAB_00bb83d4;
        pbVar52 = (byte *)((long)puVar10 + (ulong)uVar30);
        if (uVar30 < 8) {
          uStack_120 = (ulong)(byte)*puVar10;
          uVar39 = (uint)uVar30;
          if (uVar30 < 5) {
            if (uVar39 != 2) {
              if (uVar39 != 3) {
                if (uVar39 != 4) goto LAB_00bb8488;
                goto LAB_00bb8468;
              }
              goto LAB_00bb8474;
            }
LAB_00bb847c:
            uStack_120 = uStack_120 + (ulong)*(byte *)((long)puVar10 + 1) * 0x100;
          }
          else {
            if (uVar30 == 5) {
LAB_00bb845c:
              uStack_120 = uStack_120 + ((ulong)*(byte *)((long)puVar10 + 4) << 0x20);
LAB_00bb8468:
              uStack_120 = uStack_120 + (ulong)*(byte *)((long)puVar10 + 3) * 0x1000000;
LAB_00bb8474:
              uStack_120 = uStack_120 + (ulong)*(byte *)((long)puVar10 + 2) * 0x10000;
              goto LAB_00bb847c;
            }
            if (uVar30 == 6) {
LAB_00bb8454:
              uStack_120 = uStack_120 + ((ulong)*(byte *)((long)puVar10 + 5) << 0x28);
              goto LAB_00bb845c;
            }
            if (uVar39 == 7) {
              uStack_120 = uStack_120 | (ulong)*(byte *)((long)puVar10 + 6) << 0x30;
              goto LAB_00bb8454;
            }
          }
LAB_00bb8488:
          if (pbVar52[-1] == 0) goto LAB_00bb87ec;
          uVar39 = (int)LZCOUNT((uint)pbVar52[-1]) + uVar39 * -8 + 0x29;
          puStack_190 = puVar10;
        }
        else {
          if (pbVar52[-1] == 0) goto LAB_00bb83dc;
          uStack_120 = *(ulong *)(pbVar52 + -8);
          uVar39 = 8 - ((uint)LZCOUNT((uint)pbVar52[-1]) ^ 0x1f);
          puStack_190 = (ulong *)(pbVar52 + -8);
        }
        uVar67 = (ulong)uVar39;
        uVar45 = FUN_00bb9fd0(&puStack_108,pbVar52,uVar33 - uVar61);
        if (0xffffffffffffff88 < uVar45) goto LAB_00bb87f0;
        puVar56 = (ulong *)((long)puVar4 - 3);
        puVar68 = (ulong *)(puVar18 + 7);
        puVar2 = puVar40 + 1;
        puVar3 = puVar10 + 1;
        uStack_184 = (uint)uVar31;
        if (((ulong)((long)puVar4 - (long)puVar35) < 8) || (puVar56 <= puVar35)) {
          puVar48 = puVar35;
          puVar44 = puVar38;
          puVar36 = puVar55;
          puVar58 = param_2;
        }
        else {
          uVar43 = -uStack_184 & 0x3f;
          puVar48 = param_2;
          puVar44 = puStack_108;
          uVar39 = (uint)uStack_100;
          do {
            puVar58 = puVar48;
            pbVar52 = (byte *)((long)param_1 + ((uVar62 << (uVar54 & 0x3f)) >> uVar43) * 2 + 4);
            bVar19 = *pbVar52;
            pbVar14 = (byte *)((long)param_1 + ((uStack_118 << (uVar66 & 0x3f)) >> uVar43) * 2 + 4);
            pbVar15 = (byte *)((long)puVar58 + uVar64);
            *(byte *)puVar58 = pbVar52[1];
            uVar49 = (int)uVar54 + (uint)bVar19;
            bVar19 = *pbVar14;
            pbVar52 = (byte *)((long)param_1 + ((uStack_120 << (uVar67 & 0x3f)) >> uVar43) * 2 + 4);
            pbVar16 = (byte *)((long)puVar58 + uVar64 * 2);
            *pbVar15 = pbVar14[1];
            uVar50 = (int)uVar66 + (uint)bVar19;
            bVar19 = *pbVar52;
            pbVar14 = (byte *)((long)param_1 +
                              ((ulong)((long)puVar44 << ((ulong)uVar39 & 0x3f)) >> uVar43) * 2 + 4);
            pbVar17 = (byte *)((long)puVar58 + uVar64 * 3);
            *pbVar16 = pbVar52[1];
            uVar46 = (int)uVar67 + (uint)bVar19;
            bVar19 = *pbVar14;
            pbVar52 = (byte *)((long)param_1 +
                              ((uVar62 << ((ulong)uVar49 & 0x3f)) >> uVar43) * 2 + 4);
            *pbVar17 = pbVar14[1];
            uVar39 = uVar39 + bVar19;
            bVar19 = *pbVar52;
            pbVar14 = (byte *)((long)param_1 +
                              ((uStack_118 << ((ulong)uVar50 & 0x3f)) >> uVar43) * 2 + 4);
            *(byte *)((long)puVar58 + 1) = pbVar52[1];
            uVar49 = uVar49 + bVar19;
            pbVar52 = (byte *)((long)param_1 +
                              ((uStack_120 << ((ulong)uVar46 & 0x3f)) >> uVar43) * 2 + 4);
            bVar19 = *pbVar14;
            pbVar15[1] = pbVar14[1];
            uVar50 = uVar50 + bVar19;
            pbVar14 = (byte *)((long)param_1 +
                              ((ulong)((long)puVar44 << ((ulong)uVar39 & 0x3f)) >> uVar43) * 2 + 4);
            bVar19 = *pbVar52;
            pbVar16[1] = pbVar52[1];
            uVar46 = uVar46 + bVar19;
            pbVar52 = (byte *)((long)param_1 +
                              ((uVar62 << ((ulong)uVar49 & 0x3f)) >> uVar43) * 2 + 4);
            bVar19 = *pbVar14;
            pbVar17[1] = pbVar14[1];
            uVar39 = uVar39 + bVar19;
            pbVar14 = (byte *)((long)param_1 +
                              ((uStack_118 << ((ulong)uVar50 & 0x3f)) >> uVar43) * 2 + 4);
            bVar19 = *pbVar52;
            *(byte *)((long)puVar58 + 2) = pbVar52[1];
            uVar49 = uVar49 + bVar19;
            bVar19 = *pbVar14;
            pbVar52 = (byte *)((long)param_1 +
                              ((uStack_120 << ((ulong)uVar46 & 0x3f)) >> uVar43) * 2 + 4);
            pbVar15[2] = pbVar14[1];
            uVar50 = uVar50 + bVar19;
            pbVar14 = (byte *)((long)param_1 +
                              ((ulong)((long)puVar44 << ((ulong)uVar39 & 0x3f)) >> uVar43) * 2 + 4);
            bVar19 = *pbVar52;
            pbVar16[2] = pbVar52[1];
            uVar46 = uVar46 + bVar19;
            pbVar52 = (byte *)((long)param_1 +
                              ((uVar62 << ((ulong)uVar49 & 0x3f)) >> uVar43) * 2 + 4);
            bVar19 = *pbVar14;
            pbVar17[2] = pbVar14[1];
            uVar39 = uVar39 + bVar19;
            pbVar14 = (byte *)((long)param_1 +
                              ((uStack_118 << ((ulong)uVar50 & 0x3f)) >> uVar43) * 2 + 4);
            bVar19 = *pbVar52;
            *(byte *)((long)puVar58 + 3) = pbVar52[1];
            pbVar52 = (byte *)((long)param_1 +
                              ((uStack_120 << ((ulong)uVar46 & 0x3f)) >> uVar43) * 2 + 4);
            bVar20 = *pbVar14;
            pbVar15[3] = pbVar14[1];
            bVar21 = *pbVar52;
            pbVar14 = (byte *)((long)param_1 +
                              ((ulong)((long)puVar44 << ((ulong)uVar39 & 0x3f)) >> uVar43) * 2 + 4);
            pbVar16[3] = pbVar52[1];
            uVar49 = uVar49 + bVar19;
            bVar19 = *pbVar14;
            pbVar17[3] = pbVar14[1];
            if (puVar51 < puVar68) {
              iVar47 = 3;
            }
            else {
              uVar53 = uVar49 >> 3;
              iVar47 = 0;
              uVar49 = uVar49 & 7;
              puVar51 = (ulong *)((long)puVar51 - (ulong)uVar53);
              uVar62 = *puVar51;
            }
            uVar54 = (ulong)uVar49;
            uVar50 = uVar50 + bVar20;
            if (puStack_128 < puVar2) {
              iVar60 = 3;
            }
            else {
              uVar49 = uVar50 >> 3;
              iVar60 = 0;
              uVar50 = uVar50 & 7;
              puStack_128 = (ulong *)((long)puStack_128 - (ulong)uVar49);
              uStack_118 = *puStack_128;
            }
            uVar66 = (ulong)uVar50;
            uVar46 = uVar46 + bVar21;
            if (puStack_190 < puVar3) {
              iVar63 = 3;
            }
            else {
              uVar49 = uVar46 >> 3;
              iVar63 = 0;
              uVar46 = uVar46 & 7;
              puStack_190 = (ulong *)((long)puStack_190 - (ulong)uVar49);
              uStack_120 = *puStack_190;
            }
            uVar67 = (ulong)uVar46;
            uVar39 = uVar39 + bVar19;
            if (puStack_f8 < apuStack_e8[0]) {
              iVar65 = 3;
            }
            else {
              uVar49 = uVar39 >> 3;
              iVar65 = 0;
              uVar39 = uVar39 & 7;
              puStack_f8 = (ulong *)((long)puStack_f8 - (ulong)uVar49);
              puVar44 = (ulong *)*puStack_f8;
              puStack_108 = puVar44;
            }
          } while ((pbVar17 + 4 < puVar56) &&
                  (puVar48 = (ulong *)((long)puVar58 + 4),
                  ((iVar60 == 0 && iVar47 == 0) && iVar63 == 0) && iVar65 == 0));
          puVar58 = (ulong *)((long)puVar58 + 4);
          uStack_100 = (ulong *)CONCAT44(uStack_100._4_4_,uVar39);
          puVar48 = (ulong *)((long)puVar58 + uVar64 * 3);
          puVar44 = (ulong *)((long)puVar58 + uVar64 * 2);
          puVar36 = (ulong *)((long)puVar58 + uVar64);
        }
        uVar39 = (uint)uVar54;
        uVar45 = 0xffffffffffffffec;
        if (((puVar55 < puVar58) || (puVar38 < puVar36)) || (puVar35 < puVar44)) goto LAB_00bb87f0;
        if ((long)puVar55 - (long)puVar58 < 4) {
          if (0x40 < uVar39) goto joined_r0x00bb9028;
          if (puVar51 < puVar68) {
            puVar68 = puVar42;
            if (puVar51 != puVar42) {
              uVar43 = (int)puVar51 - (int)puVar42;
              if (puVar42 <= (ulong *)((long)puVar51 - (ulong)(uVar39 >> 3))) {
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
            puVar51 = (ulong *)((long)puVar51 - (ulong)uVar43);
            uVar54 = (ulong)uVar39;
            uVar62 = *puVar51;
LAB_00bb8a14:
            uVar39 = (uint)uVar54;
            puVar68 = puVar51;
          }
          if (puVar58 < puVar55) goto LAB_00bb8a20;
        }
        else {
          if (uVar39 < 0x41) {
            uVar45 = (ulong)(-uStack_184 & 0x3f);
            do {
              uVar39 = (uint)uVar54;
              if (puVar51 < puVar68) {
                if (puVar51 == puVar42) {
                  puVar51 = puVar42;
                  goto LAB_00bb8a14;
                }
                bVar34 = puVar42 <= (ulong *)((long)puVar51 - (uVar54 >> 3));
                uVar43 = (uint)(uVar54 >> 3);
                if (!bVar34) {
                  uVar43 = (int)puVar51 - (int)puVar42;
                }
                uVar39 = uVar39 + uVar43 * -8;
              }
              else {
                uVar43 = uVar39 >> 3;
                uVar39 = uVar39 & 7;
                bVar34 = true;
              }
              uVar54 = (ulong)uVar39;
              puVar51 = (ulong *)((long)puVar51 - (ulong)uVar43);
              uVar62 = *puVar51;
              if (((ulong *)((long)puVar55 - 3U) <= puVar58) || (!bVar34)) goto LAB_00bb8a14;
              pbVar52 = (byte *)((long)param_1 + ((uVar62 << (uVar54 & 0x3f)) >> uVar45) * 2 + 4);
              uVar39 = uVar39 + *pbVar52;
              *(byte *)puVar58 = pbVar52[1];
              pbVar52 = (byte *)((long)param_1 +
                                ((uVar62 << ((ulong)uVar39 & 0x3f)) >> uVar45) * 2 + 4);
              uVar39 = uVar39 + *pbVar52;
              *(byte *)((long)puVar58 + 1) = pbVar52[1];
              pbVar52 = (byte *)((long)param_1 +
                                ((uVar62 << ((ulong)uVar39 & 0x3f)) >> uVar45) * 2 + 4);
              uVar39 = uVar39 + *pbVar52;
              *(byte *)((long)puVar58 + 2) = pbVar52[1];
              pbVar52 = (byte *)((long)param_1 +
                                ((uVar62 << ((ulong)uVar39 & 0x3f)) >> uVar45) * 2 + 4);
              uVar39 = uVar39 + *pbVar52;
              uVar54 = (ulong)uVar39;
              puVar59 = (ulong *)((long)puVar58 + 4);
              *(byte *)((long)puVar58 + 3) = pbVar52[1];
              puVar58 = puVar59;
            } while (uVar39 < 0x41);
          }
joined_r0x00bb9028:
          puVar68 = (ulong *)&DAT_007892b0;
          if (puVar58 < puVar55) {
LAB_00bb8a20:
            pbVar52 = (byte *)((long)param_2 + (uVar64 - (long)puVar58));
            do {
              pbVar52 = pbVar52 + -1;
              pbVar14 = (byte *)((long)param_1 +
                                ((uVar62 << (uVar54 & 0x3f)) >> (-uStack_184 & 0x3f)) * 2 + 4);
              uVar39 = (int)uVar54 + (uint)*pbVar14;
              uVar54 = (ulong)uVar39;
              *(byte *)puVar58 = pbVar14[1];
              puVar58 = (ulong *)((long)puVar58 + 1);
            } while (pbVar52 != (byte *)0x0);
          }
        }
        uVar43 = (uint)uVar66;
        if ((long)puVar38 - (long)puVar36 < 4) {
          if (0x40 < uVar43) goto LAB_00bb9030;
          if (puStack_128 < puVar2) {
            if (puStack_128 == puVar40) {
              puStack_128 = puVar40;
            }
            else {
              uVar49 = (int)puStack_128 - (int)puVar40;
              if (puVar40 <= (ulong *)((long)puStack_128 - (ulong)(uVar43 >> 3))) {
                uVar49 = uVar43 >> 3;
              }
              uVar66 = (ulong)(uVar43 + uVar49 * -8);
              uStack_118 = *(ulong *)((long)puStack_128 - (ulong)uVar49);
              puStack_128 = (ulong *)((long)puStack_128 - (ulong)uVar49);
            }
          }
          else {
            uVar66 = (ulong)(uVar43 & 7);
            puStack_128 = (ulong *)((long)puStack_128 - (ulong)(uVar43 >> 3));
            uStack_118 = *puStack_128;
          }
        }
        else if (uVar43 < 0x41) {
          uVar43 = -uStack_184 & 0x3f;
          do {
            uVar49 = (uint)uVar66;
            if (puStack_128 < puVar2) {
              if (puStack_128 == puVar40) {
                puStack_128 = puVar40;
                goto LAB_00bb8bf4;
              }
              bVar34 = puVar40 <= (ulong *)((long)puStack_128 - (uVar66 >> 3));
              uVar50 = (uint)(uVar66 >> 3);
              if (!bVar34) {
                uVar50 = (int)puStack_128 - (int)puVar40;
              }
              uVar49 = uVar49 + uVar50 * -8;
            }
            else {
              uVar50 = uVar49 >> 3;
              uVar49 = uVar49 & 7;
              bVar34 = true;
            }
            uVar66 = (ulong)uVar49;
            puStack_128 = (ulong *)((long)puStack_128 - (ulong)uVar50);
            uStack_118 = *puStack_128;
            if (((ulong *)((long)puVar38 - 3U) <= puVar36) || (!bVar34)) goto LAB_00bb8bf4;
            pbVar52 = (byte *)((long)param_1 + ((uStack_118 << (uVar66 & 0x3f)) >> uVar43) * 2 + 4);
            uVar49 = uVar49 + *pbVar52;
            *(byte *)puVar36 = pbVar52[1];
            pbVar52 = (byte *)((long)param_1 +
                              ((uStack_118 << ((ulong)uVar49 & 0x3f)) >> uVar43) * 2 + 4);
            uVar49 = uVar49 + *pbVar52;
            *(byte *)((long)puVar36 + 1) = pbVar52[1];
            pbVar52 = (byte *)((long)param_1 +
                              ((uStack_118 << ((ulong)uVar49 & 0x3f)) >> uVar43) * 2 + 4);
            uVar49 = uVar49 + *pbVar52;
            *(byte *)((long)puVar36 + 2) = pbVar52[1];
            pbVar52 = (byte *)((long)param_1 +
                              ((uStack_118 << ((ulong)uVar49 & 0x3f)) >> uVar43) * 2 + 4);
            uVar49 = uVar49 + *pbVar52;
            uVar66 = (ulong)uVar49;
            puVar55 = (ulong *)((long)puVar36 + 4);
            *(byte *)((long)puVar36 + 3) = pbVar52[1];
            puVar36 = puVar55;
          } while (uVar49 < 0x41);
          puStack_128 = (ulong *)&DAT_007892b0;
LAB_00bb8bf4:
        }
        else {
LAB_00bb9030:
          puStack_128 = (ulong *)&DAT_007892b0;
        }
        uVar43 = (uint)uVar66;
        if (puVar36 < puVar38) {
          do {
            pbVar52 = (byte *)((long)param_1 +
                              ((uStack_118 << (uVar66 & 0x3f)) >> (-uStack_184 & 0x3f)) * 2 + 4);
            bVar19 = *pbVar52;
            puVar55 = (ulong *)((long)puVar36 + 1);
            *(byte *)puVar36 = pbVar52[1];
            uVar43 = (int)uVar66 + (uint)bVar19;
            uVar66 = (ulong)uVar43;
            puVar36 = puVar55;
          } while (puVar55 < puVar38);
        }
        uVar49 = (uint)uVar67;
        if ((long)puVar35 - (long)puVar44 < 4) {
          if (0x40 < uVar49) goto LAB_00bb9040;
          if (puStack_190 < puVar3) {
            if (puStack_190 == puVar10) {
              puStack_190 = puVar10;
            }
            else {
              uVar50 = (int)puStack_190 - (int)puVar10;
              if (puVar10 <= (ulong *)((long)puStack_190 - (ulong)(uVar49 >> 3))) {
                uVar50 = uVar49 >> 3;
              }
              uVar67 = (ulong)(uVar49 + uVar50 * -8);
              uStack_120 = *(ulong *)((long)puStack_190 - (ulong)uVar50);
              puStack_190 = (ulong *)((long)puStack_190 - (ulong)uVar50);
            }
          }
          else {
            uVar67 = (ulong)(uVar49 & 7);
            puStack_190 = (ulong *)((long)puStack_190 - (ulong)(uVar49 >> 3));
            uStack_120 = *puStack_190;
          }
        }
        else if (uVar49 < 0x41) {
          uVar49 = -uStack_184 & 0x3f;
          do {
            uVar50 = (uint)uVar67;
            if (puStack_190 < puVar3) {
              if (puStack_190 == puVar10) {
                puStack_190 = puVar10;
                goto LAB_00bb8da0;
              }
              bVar34 = puVar10 <= (ulong *)((long)puStack_190 - (uVar67 >> 3));
              uVar46 = (uint)(uVar67 >> 3);
              if (!bVar34) {
                uVar46 = (int)puStack_190 - (int)puVar10;
              }
              uVar50 = uVar50 + uVar46 * -8;
            }
            else {
              uVar46 = uVar50 >> 3;
              uVar50 = uVar50 & 7;
              bVar34 = true;
            }
            uVar67 = (ulong)uVar50;
            puStack_190 = (ulong *)((long)puStack_190 - (ulong)uVar46);
            uStack_120 = *puStack_190;
            if (((ulong *)((long)puVar35 - 3U) <= puVar44) || (!bVar34)) goto LAB_00bb8da0;
            pbVar52 = (byte *)((long)param_1 + ((uStack_120 << (uVar67 & 0x3f)) >> uVar49) * 2 + 4);
            uVar50 = uVar50 + *pbVar52;
            *(byte *)puVar44 = pbVar52[1];
            pbVar52 = (byte *)((long)param_1 +
                              ((uStack_120 << ((ulong)uVar50 & 0x3f)) >> uVar49) * 2 + 4);
            uVar50 = uVar50 + *pbVar52;
            *(byte *)((long)puVar44 + 1) = pbVar52[1];
            pbVar52 = (byte *)((long)param_1 +
                              ((uStack_120 << ((ulong)uVar50 & 0x3f)) >> uVar49) * 2 + 4);
            uVar50 = uVar50 + *pbVar52;
            *(byte *)((long)puVar44 + 2) = pbVar52[1];
            pbVar52 = (byte *)((long)param_1 +
                              ((uStack_120 << ((ulong)uVar50 & 0x3f)) >> uVar49) * 2 + 4);
            uVar50 = uVar50 + *pbVar52;
            uVar67 = (ulong)uVar50;
            puVar55 = (ulong *)((long)puVar44 + 4);
            *(byte *)((long)puVar44 + 3) = pbVar52[1];
            puVar44 = puVar55;
          } while (uVar50 < 0x41);
          puStack_190 = (ulong *)&DAT_007892b0;
LAB_00bb8da0:
        }
        else {
LAB_00bb9040:
          puStack_190 = (ulong *)&DAT_007892b0;
        }
        uVar49 = (uint)uVar67;
        if (puVar44 < puVar35) {
          do {
            pbVar52 = (byte *)((long)param_1 +
                              ((uStack_120 << (uVar67 & 0x3f)) >> (-uStack_184 & 0x3f)) * 2 + 4);
            bVar19 = *pbVar52;
            puVar55 = (ulong *)((long)puVar44 + 1);
            *(byte *)puVar44 = pbVar52[1];
            uVar49 = (int)uVar67 + (uint)bVar19;
            uVar67 = (ulong)uVar49;
            puVar44 = puVar55;
          } while (puVar55 < puVar35);
        }
        uVar50 = (uint)uStack_100;
        if ((long)puVar4 - (long)puVar48 < 4) {
          if ((uint)uStack_100 < 0x41) {
            if (puStack_f8 < apuStack_e8[0]) {
              if (puStack_f8 == puStack_f0) goto LAB_00bb8f7c;
              uVar46 = (int)puStack_f8 - (int)puStack_f0;
              if (puStack_f0 <= (ulong *)((long)puStack_f8 - (ulong)((uint)uStack_100 >> 3))) {
                uVar46 = (uint)uStack_100 >> 3;
              }
              uVar50 = (uint)uStack_100 + uVar46 * -8;
              uStack_100 = (ulong *)CONCAT44(uStack_100._4_4_,uVar50);
            }
            else {
              uVar46 = (uint)uStack_100 >> 3;
              uVar50 = (uint)uStack_100 & 7;
              uStack_100 = (ulong *)((ulong)uStack_100 & 0xffffffff00000007);
            }
            puStack_f8 = (ulong *)((long)puStack_f8 - (ulong)uVar46);
            puStack_108 = (ulong *)*puStack_f8;
          }
          else {
            puStack_f8 = (ulong *)&DAT_007892b0;
          }
        }
        else {
          if ((uint)uStack_100 < 0x41) {
            uVar46 = -uStack_184 & 0x3f;
            do {
              if (puStack_f8 < apuStack_e8[0]) {
                if (puStack_f8 == puStack_f0) goto LAB_00bb8f7c;
                bVar34 = puStack_f0 <= (ulong *)((long)puStack_f8 - (ulong)(uVar50 >> 3));
                uVar53 = uVar50 >> 3;
                if (!bVar34) {
                  uVar53 = (int)puStack_f8 - (int)puStack_f0;
                }
                uVar50 = uVar50 + uVar53 * -8;
              }
              else {
                uVar53 = uVar50 >> 3;
                uVar50 = uVar50 & 7;
                bVar34 = true;
              }
              puStack_f8 = (ulong *)((long)puStack_f8 - (ulong)uVar53);
              uStack_100 = (ulong *)CONCAT44(uStack_100._4_4_,uVar50);
              puStack_108 = (ulong *)*puStack_f8;
              if ((puVar56 <= puVar48) || (!bVar34)) goto LAB_00bb8f7c;
              pbVar52 = (byte *)((long)param_1 +
                                ((ulong)((long)puStack_108 << ((ulong)uVar50 & 0x3f)) >> uVar46) * 2
                                + 4);
              bVar19 = *pbVar52;
              *(byte *)puVar48 = pbVar52[1];
              uVar50 = uVar50 + bVar19;
              pbVar52 = (byte *)((long)param_1 +
                                ((ulong)((long)puStack_108 << ((ulong)uVar50 & 0x3f)) >> uVar46) * 2
                                + 4);
              uVar50 = uVar50 + *pbVar52;
              *(byte *)((long)puVar48 + 1) = pbVar52[1];
              pbVar52 = (byte *)((long)param_1 +
                                ((ulong)((long)puStack_108 << ((ulong)uVar50 & 0x3f)) >> uVar46) * 2
                                + 4);
              uVar50 = uVar50 + *pbVar52;
              *(byte *)((long)puVar48 + 2) = pbVar52[1];
              pbVar52 = (byte *)((long)param_1 +
                                ((ulong)((long)puStack_108 << ((ulong)uVar50 & 0x3f)) >> uVar46) * 2
                                + 4);
              uVar50 = uVar50 + *pbVar52;
              puVar55 = (ulong *)((long)puVar48 + 4);
              uStack_100 = (ulong *)CONCAT44(uStack_100._4_4_,uVar50);
              *(byte *)((long)puVar48 + 3) = pbVar52[1];
              puVar48 = puVar55;
            } while (uVar50 < 0x41);
          }
          else {
          }
          puStack_f8 = (ulong *)&DAT_007892b0;
        }
LAB_00bb8f7c:
        if (puVar48 < puVar4) {
          pbVar52 = (byte *)((long)param_2 + (param_3 - (long)puVar48));
          do {
            pbVar52 = pbVar52 + -1;
            pbVar14 = (byte *)((long)param_1 +
                              ((ulong)((long)puStack_108 << ((ulong)uStack_100 & 0x3f)) >>
                              (-uStack_184 & 0x3f)) * 2 + 4);
            uVar50 = (uint)uStack_100 + *pbVar14;
            uStack_100 = (ulong *)CONCAT44(uStack_100._4_4_,uVar50);
            *(byte *)puVar48 = pbVar14[1];
            puVar48 = (ulong *)((long)puVar48 + 1);
          } while (pbVar52 != (byte *)0x0);
        }
        uVar45 = 0xffffffffffffffec;
        if (((((((uVar50 == 0x40 && puStack_f8 == puStack_f0) && uVar49 == 0x40) &&
               puStack_190 == puVar10) && uVar43 == 0x40) && puStack_128 == puVar40) &&
            uVar39 == 0x40) && puVar68 == puVar42) {
          uVar45 = param_3;
        }
        goto LAB_00bb87f0;
      }
      uVar62 = (ulong)(byte)*puVar42;
      uVar43 = (uint)uVar28;
      if (uVar28 < 5) {
        if (uVar43 != 2) {
          if (uVar43 != 3) {
            if (uVar43 != 4) goto LAB_00bb82a8;
            goto LAB_00bb8290;
          }
          goto LAB_00bb8298;
        }
LAB_00bb82a0:
        uVar62 = uVar62 + (ulong)*(byte *)((long)puVar18 + 7) * 0x100;
      }
      else {
        if (uVar28 == 5) {
LAB_00bb8288:
          uVar62 = uVar62 + ((ulong)(byte)puVar18[5] << 0x20);
LAB_00bb8290:
          uVar62 = uVar62 + (ulong)*(byte *)((long)puVar18 + 9) * 0x1000000;
LAB_00bb8298:
          uVar62 = uVar62 + (ulong)(byte)puVar18[4] * 0x10000;
          goto LAB_00bb82a0;
        }
        if (uVar28 == 6) {
LAB_00bb8280:
          uVar62 = uVar62 + ((ulong)*(byte *)((long)puVar18 + 0xb) << 0x28);
          goto LAB_00bb8288;
        }
        if (uVar43 == 7) {
          uVar62 = uVar62 | (ulong)(byte)puVar18[6] << 0x30;
          goto LAB_00bb8280;
        }
      }
LAB_00bb82a8:
      if (*(byte *)((long)puVar40 + -1) == 0) goto LAB_00bb87f0;
      uVar43 = (int)LZCOUNT((uint)*(byte *)((long)puVar40 + -1)) + uVar43 * -8 + 0x29;
      puVar51 = puVar42;
      if (uVar39 != 0) goto LAB_00bb82c4;
    }
LAB_00bb83d4:
    uVar45 = 0xffffffffffffffb8;
LAB_00bb87f0:
    if (*(long *)(lVar1 + 0x28) != lStack_70) {
                    /* WARNING: Subroutine does not return */
      __stack_chk_fail(uVar45);
    }
    return uVar45;
  }
  uVar45 = HUF_readDTableX2_wksp();
  if (0xffffffffffffff88 < uVar45) {
    return uVar45;
  }
  uVar33 = param_5 - uVar45;
  if (param_5 < uVar45 || uVar33 == 0) {
    return 0xffffffffffffffb8;
  }
  puVar18 = (ushort *)(param_4 + uVar45);
  lVar1 = tpidr_el0;
  lStack_70 = *(long *)(lVar1 + 0x28);
  if ((param_8 >> 5 & 1) == 0) {
    uVar45 = FUN_00bba0f0(&puStack_108,param_2,param_3,puVar18,uVar33,param_1);
    if (uVar45 - 1 < 0xffffffffffffff87 || uVar45 == 0xffffffffffffff88) {
      puVar4 = (ulong *)((long)param_2 + (param_3 & ((long)param_3 >> 0x3f ^ 0xffffffffffffffffU)));
      puVar35 = apuStack_e8[2];
      puVar38 = apuStack_e8[3];
      puVar55 = apuStack_e8[1];
      while( true ) {
        uVar61 = (ulong)((long)apuStack_e8[1] - (long)apuStack_e8[0]) / 10;
        uVar64 = (ulong)((long)apuStack_e8[2] - (long)puVar55) / 10;
        uVar45 = (ulong)((long)puStack_108 - (long)puStack_a0) / 7;
        if (uVar61 <= uVar45) {
          uVar45 = uVar61;
        }
        uVar62 = (ulong)(lStack_98 - (long)puVar38) / 10;
        uVar61 = (ulong)((long)apuStack_e8[3] - (long)puVar35) / 10;
        if (uVar64 <= uVar45) {
          uVar45 = uVar64;
        }
        if (uVar61 <= uVar45) {
          uVar45 = uVar61;
        }
        if (uVar62 <= uVar45) {
          uVar45 = uVar62;
        }
        if (((uVar45 == 0 || uStack_100 < puStack_108) || puStack_f8 < uStack_100) ||
            puStack_f0 < puStack_f8) break;
        puVar41 = (undefined2 *)((long)puVar38 + uVar45 * 5);
        do {
          uVar39 = *(uint *)(lStack_a8 + (auStack_c8[0] >> 0x35) * 4);
          *(short *)apuStack_e8[0] = (short)uVar39;
          puVar5 = (undefined2 *)((long)apuStack_e8[0] + (ulong)(uVar39 >> 0x18));
          uVar43 = *(uint *)(lStack_a8 + (auStack_c8[1] >> 0x35) * 4);
          auStack_c8[0] = auStack_c8[0] << ((ulong)(uVar39 >> 0x10) & 0x3f);
          *(short *)puVar55 = (short)uVar43;
          puVar6 = (undefined2 *)((long)puVar55 + (ulong)(uVar43 >> 0x18));
          uVar39 = *(uint *)(lStack_a8 + (auStack_c8[2] >> 0x35) * 4);
          auStack_c8[1] = auStack_c8[1] << ((ulong)(uVar43 >> 0x10) & 0x3f);
          *(short *)puVar35 = (short)uVar39;
          puVar7 = (undefined2 *)((long)puVar35 + (ulong)(uVar39 >> 0x18));
          uVar43 = *(uint *)(lStack_a8 + (auStack_c8[3] >> 0x35) * 4);
          auStack_c8[2] = auStack_c8[2] << ((ulong)(uVar39 >> 0x10) & 0x3f);
          *(short *)puVar38 = (short)uVar43;
          puVar8 = (undefined2 *)((long)puVar38 + (ulong)(uVar43 >> 0x18));
          uVar39 = *(uint *)(lStack_a8 + (auStack_c8[0] >> 0x35) * 4);
          auStack_c8[3] = auStack_c8[3] << ((ulong)(uVar43 >> 0x10) & 0x3f);
          *puVar5 = (short)uVar39;
          puVar5 = (undefined2 *)((long)puVar5 + (ulong)(uVar39 >> 0x18));
          uVar43 = *(uint *)(lStack_a8 + (auStack_c8[1] >> 0x35) * 4);
          auStack_c8[0] = auStack_c8[0] << ((ulong)(uVar39 >> 0x10) & 0x3f);
          *puVar6 = (short)uVar43;
          puVar6 = (undefined2 *)((long)puVar6 + (ulong)(uVar43 >> 0x18));
          uVar39 = *(uint *)(lStack_a8 + (auStack_c8[2] >> 0x35) * 4);
          auStack_c8[1] = auStack_c8[1] << ((ulong)(uVar43 >> 0x10) & 0x3f);
          *puVar7 = (short)uVar39;
          puVar7 = (undefined2 *)((long)puVar7 + (ulong)(uVar39 >> 0x18));
          uVar43 = *(uint *)(lStack_a8 + (auStack_c8[3] >> 0x35) * 4);
          auStack_c8[2] = auStack_c8[2] << ((ulong)(uVar39 >> 0x10) & 0x3f);
          *puVar8 = (short)uVar43;
          puVar8 = (undefined2 *)((long)puVar8 + (ulong)(uVar43 >> 0x18));
          uVar39 = *(uint *)(lStack_a8 + (auStack_c8[0] >> 0x35) * 4);
          auStack_c8[3] = auStack_c8[3] << ((ulong)(uVar43 >> 0x10) & 0x3f);
          *puVar5 = (short)uVar39;
          puVar5 = (undefined2 *)((long)puVar5 + (ulong)(uVar39 >> 0x18));
          uVar43 = *(uint *)(lStack_a8 + (auStack_c8[1] >> 0x35) * 4);
          auStack_c8[0] = auStack_c8[0] << ((ulong)(uVar39 >> 0x10) & 0x3f);
          *puVar6 = (short)uVar43;
          puVar6 = (undefined2 *)((long)puVar6 + (ulong)(uVar43 >> 0x18));
          uVar39 = *(uint *)(lStack_a8 + (auStack_c8[2] >> 0x35) * 4);
          auStack_c8[1] = auStack_c8[1] << ((ulong)(uVar43 >> 0x10) & 0x3f);
          *puVar7 = (short)uVar39;
          uVar43 = *(uint *)(lStack_a8 + (auStack_c8[3] >> 0x35) * 4);
          auStack_c8[2] = auStack_c8[2] << ((ulong)(uVar39 >> 0x10) & 0x3f);
          *puVar8 = (short)uVar43;
          uVar49 = *(uint *)(lStack_a8 + (auStack_c8[0] >> 0x35) * 4);
          auStack_c8[3] = auStack_c8[3] << ((ulong)(uVar43 >> 0x10) & 0x3f);
          puVar7 = (undefined2 *)((long)puVar7 + (ulong)(uVar39 >> 0x18));
          *puVar5 = (short)uVar49;
          puVar5 = (undefined2 *)((long)puVar5 + (ulong)(uVar49 >> 0x18));
          uVar39 = *(uint *)(lStack_a8 + (auStack_c8[1] >> 0x35) * 4);
          auStack_c8[0] = auStack_c8[0] << ((ulong)(uVar49 >> 0x10) & 0x3f);
          puVar8 = (undefined2 *)((long)puVar8 + (ulong)(uVar43 >> 0x18));
          *puVar6 = (short)uVar39;
          puVar6 = (undefined2 *)((long)puVar6 + (ulong)(uVar39 >> 0x18));
          uVar43 = *(uint *)(lStack_a8 + (auStack_c8[2] >> 0x35) * 4);
          auStack_c8[1] = auStack_c8[1] << ((ulong)(uVar39 >> 0x10) & 0x3f);
          *puVar7 = (short)uVar43;
          uVar39 = *(uint *)(lStack_a8 + (auStack_c8[3] >> 0x35) * 4);
          auStack_c8[2] = auStack_c8[2] << ((ulong)(uVar43 >> 0x10) & 0x3f);
          *puVar8 = (short)uVar39;
          puVar8 = (undefined2 *)((long)puVar8 + (ulong)(uVar39 >> 0x18));
          uVar49 = *(uint *)(lStack_a8 + (auStack_c8[0] >> 0x35) * 4);
          auStack_c8[3] = auStack_c8[3] << ((ulong)(uVar39 >> 0x10) & 0x3f);
          puVar7 = (undefined2 *)((long)puVar7 + (ulong)(uVar43 >> 0x18));
          *puVar5 = (short)uVar49;
          uVar39 = *(uint *)(lStack_a8 + (auStack_c8[1] >> 0x35) * 4);
          *puVar6 = (short)uVar39;
          uVar43 = *(uint *)(lStack_a8 + (auStack_c8[2] >> 0x35) * 4);
          *puVar7 = (short)uVar43;
          auStack_c8[0] = auStack_c8[0] << ((ulong)(uVar49 >> 0x10) & 0x3f);
          uVar50 = *(uint *)(lStack_a8 + (auStack_c8[3] >> 0x35) * 4);
          puVar55 = (ulong *)((long)puVar6 + (ulong)(uVar39 >> 0x18));
          auStack_c8[1] = auStack_c8[1] << ((ulong)(uVar39 >> 0x10) & 0x3f);
          apuStack_e8[0] = (ulong *)((long)puVar5 + (ulong)(uVar49 >> 0x18));
          uVar45 = (auStack_c8[0] & 0xaaaaaaaaaaaaaaaa) >> 1 |
                   (auStack_c8[0] & 0x5555555555555555) << 1;
          uVar45 = (uVar45 & 0xcccccccccccccccc) >> 2 | (uVar45 & 0x3333333333333333) << 2;
          uVar45 = (uVar45 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar45 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar45 = (uVar45 & 0xff00ff00ff00ff00) >> 8 | (uVar45 & 0xff00ff00ff00ff) << 8;
          uVar45 = (uVar45 & 0xffff0000ffff0000) >> 0x10 | (uVar45 & 0xffff0000ffff) << 0x10;
          auStack_c8[2] = auStack_c8[2] << ((ulong)(uVar43 >> 0x10) & 0x3f);
          *puVar8 = (short)uVar50;
          uVar61 = (auStack_c8[1] & 0xaaaaaaaaaaaaaaaa) >> 1 |
                   (auStack_c8[1] & 0x5555555555555555) << 1;
          uVar61 = (uVar61 & 0xcccccccccccccccc) >> 2 | (uVar61 & 0x3333333333333333) << 2;
          uVar61 = (uVar61 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar61 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar61 = (uVar61 & 0xff00ff00ff00ff00) >> 8 | (uVar61 & 0xff00ff00ff00ff) << 8;
          uVar61 = (uVar61 & 0xffff0000ffff0000) >> 0x10 | (uVar61 & 0xffff0000ffff) << 0x10;
          uVar54 = LZCOUNT(uVar45 >> 0x20 | uVar45 << 0x20);
          puVar38 = (ulong *)((long)puVar8 + (ulong)(uVar50 >> 0x18));
          auStack_c8[3] = auStack_c8[3] << ((ulong)(uVar50 >> 0x10) & 0x3f);
          uVar45 = (auStack_c8[2] & 0xaaaaaaaaaaaaaaaa) >> 1 |
                   (auStack_c8[2] & 0x5555555555555555) << 1;
          uVar45 = (uVar45 & 0xcccccccccccccccc) >> 2 | (uVar45 & 0x3333333333333333) << 2;
          uVar45 = (uVar45 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar45 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar45 = (uVar45 & 0xff00ff00ff00ff00) >> 8 | (uVar45 & 0xff00ff00ff00ff) << 8;
          uVar45 = (uVar45 & 0xffff0000ffff0000) >> 0x10 | (uVar45 & 0xffff0000ffff) << 0x10;
          puStack_108 = (ulong *)((long)puStack_108 - (uVar54 >> 3));
          uVar64 = LZCOUNT(uVar61 >> 0x20 | uVar61 << 0x20);
          puVar35 = (ulong *)((long)puVar7 + (ulong)(uVar43 >> 0x18));
          uVar61 = (auStack_c8[3] & 0xaaaaaaaaaaaaaaaa) >> 1 |
                   (auStack_c8[3] & 0x5555555555555555) << 1;
          uVar61 = (uVar61 & 0xcccccccccccccccc) >> 2 | (uVar61 & 0x3333333333333333) << 2;
          uVar61 = (uVar61 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar61 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar61 = (uVar61 & 0xff00ff00ff00ff00) >> 8 | (uVar61 & 0xff00ff00ff00ff) << 8;
          uVar61 = (uVar61 & 0xffff0000ffff0000) >> 0x10 | (uVar61 & 0xffff0000ffff) << 0x10;
          uStack_100 = (ulong *)((long)uStack_100 - (uVar64 >> 3));
          uVar62 = LZCOUNT(uVar45 >> 0x20 | uVar45 << 0x20);
          puStack_f8 = (ulong *)((long)puStack_f8 - (uVar62 >> 3));
          uVar45 = LZCOUNT(uVar61 >> 0x20 | uVar61 << 0x20);
          puStack_f0 = (ulong *)((long)puStack_f0 - (uVar45 >> 3));
          auStack_c8[0] = (*puStack_108 | 1) << (uVar54 & 7);
          auStack_c8[1] = (*uStack_100 | 1) << (uVar64 & 7);
          auStack_c8[2] = (*puStack_f8 | 1) << (uVar62 & 7);
          auStack_c8[3] = (*puStack_f0 | 1) << (uVar45 & 7);
        } while (puVar38 < puVar41);
      }
      lVar57 = 0;
      apuStack_e8[1] = puVar55;
      apuStack_e8[2] = puVar35;
      apuStack_e8[3] = puVar38;
      uVar45 = param_3 + 3 >> 2;
      puVar55 = param_2;
      do {
        uVar61 = (long)puVar4 - (long)puVar55;
        puVar38 = (ulong *)((long)puVar55 + uVar45);
        puVar35 = apuStack_e8[lVar57];
        puVar55 = puVar4;
        if (uVar45 <= uVar61) {
          puVar55 = puVar38;
        }
        if ((puVar55 < puVar35) ||
           (puVar38 = apuStack_e8[lVar57 + -4], puVar38 < (ulong *)(alStack_90[lVar57] + -8)))
        goto LAB_00bb6958;
        uVar62 = (long)puVar55 - (long)puVar35;
        uVar64 = *puVar38;
        uVar61 = (auStack_c8[lVar57] & 0xaaaaaaaaaaaaaaaa) >> 1 |
                 (auStack_c8[lVar57] & 0x5555555555555555) << 1;
        uVar61 = (uVar61 & 0xcccccccccccccccc) >> 2 | (uVar61 & 0x3333333333333333) << 2;
        uVar61 = (uVar61 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar61 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar61 = (uVar61 & 0xff00ff00ff00ff00) >> 8 | (uVar61 & 0xff00ff00ff00ff) << 8;
        uVar61 = (uVar61 & 0xffff0000ffff0000) >> 0x10 | (uVar61 & 0xffff0000ffff) << 0x10;
        puVar42 = puStack_a0 + 1;
        uVar61 = LZCOUNT(uVar61 >> 0x20 | uVar61 << 0x20);
        iVar47 = (int)puStack_a0;
        puVar40 = puVar35;
        if (uVar62 < 8) {
          if (puVar38 < puVar42) {
            if (puVar38 != puStack_a0) {
              uVar39 = (int)puVar38 - iVar47;
              if (puStack_a0 <= (ulong *)((long)puVar38 - (uVar61 >> 3))) {
                uVar39 = (uint)(uVar61 >> 3);
              }
              puVar38 = (ulong *)((long)puVar38 - (ulong)uVar39);
              uVar61 = (ulong)((uint)uVar61 + uVar39 * -8);
              uVar64 = *puVar38;
            }
          }
          else {
            puVar38 = (ulong *)((long)puVar38 - (uVar61 >> 3));
            uVar61 = (ulong)((uint)uVar61 & 7);
            uVar64 = *puVar38;
          }
        }
        else {
          do {
            uVar39 = (uint)uVar61;
            if (puVar38 < puVar42) {
              if (puVar38 == puStack_a0) goto LAB_00bb6150;
              bVar34 = puStack_a0 <= (ulong *)((long)puVar38 - (uVar61 >> 3));
              uVar43 = (uint)(uVar61 >> 3);
              if (!bVar34) {
                uVar43 = (int)puVar38 - iVar47;
              }
              uVar39 = uVar39 + uVar43 * -8;
            }
            else {
              uVar43 = uVar39 >> 3;
              uVar39 = uVar39 & 7;
              bVar34 = true;
            }
            uVar61 = (ulong)uVar39;
            puVar38 = (ulong *)((long)puVar38 - (ulong)uVar43);
            uVar64 = *puVar38;
            if (((ulong *)((long)puVar55 - 9U) <= puVar40) || (!bVar34)) goto LAB_00bb6150;
            puVar9 = param_1 + ((uVar64 << (uVar61 & 0x3f)) >> 0x35) + 1;
            *(short *)puVar40 = (short)*puVar9;
            uVar39 = uVar39 + *(byte *)((long)puVar9 + 2);
            pbVar52 = (byte *)((long)puVar40 + (ulong)*(byte *)((long)puVar9 + 3));
            puVar9 = param_1 + ((uVar64 << ((ulong)uVar39 & 0x3f)) >> 0x35) + 1;
            *(short *)pbVar52 = (short)*puVar9;
            uVar39 = uVar39 + *(byte *)((long)puVar9 + 2);
            pbVar52 = pbVar52 + *(byte *)((long)puVar9 + 3);
            puVar9 = param_1 + ((uVar64 << ((ulong)uVar39 & 0x3f)) >> 0x35) + 1;
            *(short *)pbVar52 = (short)*puVar9;
            uVar39 = uVar39 + *(byte *)((long)puVar9 + 2);
            pbVar52 = pbVar52 + *(byte *)((long)puVar9 + 3);
            puVar9 = param_1 + ((uVar64 << ((ulong)uVar39 & 0x3f)) >> 0x35) + 1;
            *(short *)pbVar52 = (short)*puVar9;
            bVar19 = *(byte *)((long)puVar9 + 3);
            uVar39 = uVar39 + *(byte *)((long)puVar9 + 2);
            puVar9 = param_1 + ((uVar64 << ((ulong)uVar39 & 0x3f)) >> 0x35) + 1;
            *(short *)(pbVar52 + bVar19) = (short)*puVar9;
            uVar39 = uVar39 + *(byte *)((long)puVar9 + 2);
            uVar61 = (ulong)uVar39;
            puVar40 = (ulong *)(pbVar52 + bVar19 + *(byte *)((long)puVar9 + 3));
          } while (uVar39 < 0x41);
          puVar38 = (ulong *)&DAT_007892b0;
LAB_00bb6150:
          uVar62 = (long)puVar55 - (long)puVar40;
        }
        if (1 < uVar62) {
          if ((uint)uVar61 < 0x41) {
            do {
              uVar39 = (uint)uVar61;
              if (puVar38 < puVar42) {
                if (puVar38 == puStack_a0) break;
                bVar34 = puStack_a0 <= (ulong *)((long)puVar38 - (uVar61 >> 3));
                uVar43 = (uint)(uVar61 >> 3);
                if (!bVar34) {
                  uVar43 = (int)puVar38 - iVar47;
                }
                uVar39 = uVar39 + uVar43 * -8;
              }
              else {
                uVar43 = uVar39 >> 3;
                uVar39 = uVar39 & 7;
                bVar34 = true;
              }
              uVar61 = (ulong)uVar39;
              puVar38 = (ulong *)((long)puVar38 - (ulong)uVar43);
              uVar64 = *puVar38;
              if (((ulong *)((long)puVar55 - 2U) < puVar40) || (!bVar34)) break;
              puVar9 = param_1 + ((uVar64 << (uVar61 & 0x3f)) >> 0x35) + 1;
              *(short *)puVar40 = (short)*puVar9;
              uVar39 = uVar39 + *(byte *)((long)puVar9 + 2);
              uVar61 = (ulong)uVar39;
              puVar40 = (ulong *)((long)puVar40 + (ulong)*(byte *)((long)puVar9 + 3));
              if (0x40 < uVar39) break;
            } while( true );
          }
          for (; puVar40 <= (ulong *)((long)puVar55 - 2U);
              puVar40 = (ulong *)((long)puVar40 + (ulong)*(byte *)((long)puVar9 + 3))) {
            puVar9 = param_1 + ((uVar64 << (uVar61 & 0x3f)) >> 0x35) + 1;
            *(short *)puVar40 = (short)*puVar9;
            uVar61 = (ulong)((int)uVar61 + (uint)*(byte *)((long)puVar9 + 2));
          }
        }
        puVar38 = puVar40;
        if (puVar40 < puVar55) {
          puVar38 = (ulong *)((long)puVar40 + 1);
          *(byte *)puVar40 =
               *(byte *)((long)param_1 + ((uVar64 << (uVar61 & 0x3f)) >> 0x33 & 0x1ffc) + 4);
        }
        puVar38 = (ulong *)((long)puVar38 + ((long)apuStack_e8[lVar57] - (long)puVar35));
        apuStack_e8[lVar57] = puVar38;
        if (puVar38 != puVar55) goto LAB_00bb6958;
        lVar57 = lVar57 + 1;
      } while (lVar57 != 4);
      uVar45 = param_3;
    }
    if (uVar45 != 0) goto LAB_00bb695c;
  }
  uVar45 = 0xffffffffffffffec;
  if ((param_3 < 6) || (uVar33 < 10)) goto LAB_00bb695c;
  uVar28 = *puVar18;
  uVar29 = puVar18[1];
  uVar30 = puVar18[2];
  uVar61 = (ulong)uVar28 + (ulong)uVar29 + (ulong)uVar30 + 6;
  if (uVar33 < uVar61) goto LAB_00bb695c;
  puVar4 = (ulong *)((long)param_2 + param_3);
  uVar64 = param_3 + 3 >> 2;
  puVar55 = (ulong *)((long)param_2 + uVar64);
  puVar38 = (ulong *)((long)puVar55 + uVar64);
  puVar35 = (ulong *)((long)puVar38 + uVar64);
  if (puVar4 < puVar35) goto LAB_00bb695c;
  if (uVar28 != 0) {
    uVar39 = *param_1;
    puVar42 = (ulong *)(puVar18 + 3);
    puVar40 = (ulong *)((long)puVar42 + (ulong)uVar28);
    uVar43 = (uint)uVar29;
    if (7 < uVar28) {
      if (*(byte *)((long)puVar40 + -1) == 0) {
LAB_00bb64f4:
        uVar45 = 0xffffffffffffffff;
        goto LAB_00bb695c;
      }
      uVar64 = puVar40[-1];
      uVar49 = 8 - ((uint)LZCOUNT((uint)*(byte *)((long)puVar40 + -1)) ^ 0x1f);
      puVar51 = puVar40 + -1;
      if (uVar43 == 0) goto LAB_00bb64ec;
LAB_00bb63ac:
      uVar62 = (ulong)uVar49;
      puVar10 = (ulong *)((long)puVar40 + (ulong)uVar29);
      if (uVar29 < 8) {
        puStack_128 = (ulong *)(ulong)(byte)*puVar40;
        if (uVar29 < 5) {
          if (uVar43 != 2) {
            if (uVar43 != 3) {
              if (uVar43 != 4) goto LAB_00bb6488;
              goto LAB_00bb6468;
            }
            goto LAB_00bb6474;
          }
LAB_00bb647c:
          puStack_128 = (ulong *)((long)puStack_128 + (ulong)*(byte *)((long)puVar40 + 1) * 0x100);
        }
        else {
          if (uVar29 == 5) {
LAB_00bb645c:
            puStack_128 = (ulong *)((long)puStack_128 +
                                   ((ulong)*(byte *)((long)puVar40 + 4) << 0x20));
LAB_00bb6468:
            puStack_128 = (ulong *)((long)puStack_128 +
                                   (ulong)*(byte *)((long)puVar40 + 3) * 0x1000000);
LAB_00bb6474:
            puStack_128 = (ulong *)((long)puStack_128 +
                                   (ulong)*(byte *)((long)puVar40 + 2) * 0x10000);
            goto LAB_00bb647c;
          }
          if (uVar43 == 6) {
LAB_00bb6454:
            puStack_128 = (ulong *)((long)puStack_128 +
                                   ((ulong)*(byte *)((long)puVar40 + 5) << 0x28));
            goto LAB_00bb645c;
          }
          if (uVar43 == 7) {
            puStack_128 = (ulong *)((ulong)puStack_128 | (ulong)*(byte *)((long)puVar40 + 6) << 0x30
                                   );
            goto LAB_00bb6454;
          }
        }
LAB_00bb6488:
        if (*(byte *)((long)puVar10 + -1) != 0) {
          uVar43 = (int)LZCOUNT((uint)*(byte *)((long)puVar10 + -1)) + uVar43 * -8 + 0x29;
          puStack_168 = puVar40;
          goto LAB_00bb64a0;
        }
LAB_00bb6958:
        uVar45 = 0xffffffffffffffec;
        goto LAB_00bb695c;
      }
      if (*(byte *)((long)puVar10 + -1) == 0) goto LAB_00bb64f4;
      puStack_128 = (ulong *)puVar10[-1];
      uVar43 = 8 - ((uint)LZCOUNT((uint)*(byte *)((long)puVar10 + -1)) ^ 0x1f);
      puStack_168 = puVar10 + -1;
LAB_00bb64a0:
      uVar54 = (ulong)uVar43;
      if (uVar30 == 0) goto LAB_00bb64ec;
      pbVar52 = (byte *)((long)puVar10 + (ulong)uVar30);
      if (uVar30 < 8) {
        uStack_130 = (ulong)(byte)*puVar10;
        uVar43 = (uint)uVar30;
        if (uVar30 < 5) {
          if (uVar43 != 2) {
            if (uVar43 != 3) {
              if (uVar43 != 4) goto LAB_00bb656c;
              goto LAB_00bb6554;
            }
            goto LAB_00bb655c;
          }
LAB_00bb6564:
          uStack_130 = uStack_130 + (ulong)*(byte *)((long)puVar10 + 1) * 0x100;
        }
        else {
          if (uVar30 == 5) {
LAB_00bb654c:
            uStack_130 = uStack_130 + ((ulong)*(byte *)((long)puVar10 + 4) << 0x20);
LAB_00bb6554:
            uStack_130 = uStack_130 + (ulong)*(byte *)((long)puVar10 + 3) * 0x1000000;
LAB_00bb655c:
            uStack_130 = uStack_130 + (ulong)*(byte *)((long)puVar10 + 2) * 0x10000;
            goto LAB_00bb6564;
          }
          if (uVar30 == 6) {
LAB_00bb6544:
            uStack_130 = uStack_130 + ((ulong)*(byte *)((long)puVar10 + 5) << 0x28);
            goto LAB_00bb654c;
          }
          if (uVar43 == 7) {
            uStack_130 = uStack_130 | (ulong)*(byte *)((long)puVar10 + 6) << 0x30;
            goto LAB_00bb6544;
          }
        }
LAB_00bb656c:
        if (pbVar52[-1] == 0) goto LAB_00bb6958;
        uVar43 = (int)LZCOUNT((uint)pbVar52[-1]) + uVar43 * -8 + 0x29;
        puStack_138 = puVar10;
      }
      else {
        if (pbVar52[-1] == 0) goto LAB_00bb64f4;
        uStack_130 = *(ulong *)(pbVar52 + -8);
        uVar43 = 8 - ((uint)LZCOUNT((uint)pbVar52[-1]) ^ 0x1f);
        puStack_138 = (ulong *)(pbVar52 + -8);
      }
      uVar66 = (ulong)uVar43;
      uVar45 = FUN_00bb9fd0(&puStack_108,pbVar52,uVar33 - uVar61);
      if (0xffffffffffffff88 < uVar45) goto LAB_00bb695c;
      puVar44 = (ulong *)((long)puVar4 - 7);
      puVar68 = (ulong *)(puVar18 + 7);
      uVar43 = uVar39 >> 0x10;
      puVar2 = puVar40 + 1;
      puVar3 = puVar10 + 1;
      puVar48 = puVar35;
      puVar58 = puVar38;
      puVar56 = puVar55;
      if ((7 < (ulong)((long)puVar4 - (long)puVar35)) && (puVar35 < puVar44)) {
        uVar45 = (ulong)(-uVar43 & 0x3f);
        puVar36 = puStack_108;
        puVar59 = puStack_f8;
        uVar49 = (uint)uStack_100;
        do {
          puVar9 = param_1 + ((uVar64 << (uVar62 & 0x3f)) >> uVar45) + 1;
          puVar11 = param_1 + ((ulong)((long)puVar36 << ((ulong)uVar49 & 0x3f)) >> uVar45) + 1;
          puVar12 = param_1 + ((ulong)((long)puStack_128 << (uVar54 & 0x3f)) >> uVar45) + 1;
          puVar13 = param_1 + ((uStack_130 << (uVar66 & 0x3f)) >> uVar45) + 1;
          *(short *)param_2 = (short)*puVar9;
          bVar19 = *(byte *)((long)puVar9 + 3);
          uVar50 = (int)uVar62 + (uint)*(byte *)((long)puVar9 + 2);
          *(short *)puVar56 = (short)*puVar12;
          pbVar52 = (byte *)((long)param_2 + (ulong)bVar19);
          bVar19 = *(byte *)((long)puVar12 + 3);
          uVar46 = (int)uVar54 + (uint)*(byte *)((long)puVar12 + 2);
          *(short *)puVar58 = (short)*puVar13;
          puVar9 = param_1 + ((uVar64 << ((ulong)uVar50 & 0x3f)) >> uVar45) + 1;
          bVar20 = *(byte *)((long)puVar13 + 3);
          uVar53 = (int)uVar66 + (uint)*(byte *)((long)puVar13 + 2);
          *(short *)puVar48 = (short)*puVar11;
          puVar12 = param_1 + ((ulong)((long)puStack_128 << ((ulong)uVar46 & 0x3f)) >> uVar45) + 1;
          bVar21 = *(byte *)((long)puVar11 + 3);
          pbVar14 = (byte *)((long)puVar56 + (ulong)bVar19);
          uVar49 = uVar49 + *(byte *)((long)puVar11 + 2);
          *(short *)pbVar52 = (short)*puVar9;
          puVar11 = param_1 + ((uStack_130 << ((ulong)uVar53 & 0x3f)) >> uVar45) + 1;
          bVar19 = *(byte *)((long)puVar9 + 3);
          uVar50 = uVar50 + *(byte *)((long)puVar9 + 2);
          *(short *)pbVar14 = (short)*puVar12;
          pbVar15 = (byte *)((long)puVar58 + (ulong)bVar20);
          puVar9 = param_1 + ((ulong)((long)puVar36 << ((ulong)uVar49 & 0x3f)) >> uVar45) + 1;
          bVar20 = *(byte *)((long)puVar12 + 3);
          uVar46 = uVar46 + *(byte *)((long)puVar12 + 2);
          *(short *)pbVar15 = (short)*puVar11;
          pbVar16 = (byte *)((long)puVar48 + (ulong)bVar21);
          puVar12 = param_1 + ((uVar64 << ((ulong)uVar50 & 0x3f)) >> uVar45) + 1;
          bVar21 = *(byte *)((long)puVar11 + 3);
          uVar53 = uVar53 + *(byte *)((long)puVar11 + 2);
          *(short *)pbVar16 = (short)*puVar9;
          pbVar52 = pbVar52 + bVar19;
          puVar11 = param_1 + ((ulong)((long)puStack_128 << ((ulong)uVar46 & 0x3f)) >> uVar45) + 1;
          bVar19 = *(byte *)((long)puVar9 + 3);
          uVar49 = uVar49 + *(byte *)((long)puVar9 + 2);
          *(short *)pbVar52 = (short)*puVar12;
          pbVar14 = pbVar14 + bVar20;
          bVar20 = *(byte *)((long)puVar12 + 2);
          puVar9 = param_1 + ((uStack_130 << ((ulong)uVar53 & 0x3f)) >> uVar45) + 1;
          bVar22 = *(byte *)((long)puVar12 + 3);
          *(short *)pbVar14 = (short)*puVar11;
          pbVar15 = pbVar15 + bVar21;
          uVar50 = uVar50 + bVar20;
          bVar20 = *(byte *)((long)puVar11 + 2);
          puVar12 = param_1 + ((ulong)((long)puVar36 << ((ulong)uVar49 & 0x3f)) >> uVar45) + 1;
          bVar21 = *(byte *)((long)puVar11 + 3);
          *(short *)pbVar15 = (short)*puVar9;
          uVar46 = uVar46 + bVar20;
          pbVar16 = pbVar16 + bVar19;
          bVar19 = *(byte *)((long)puVar9 + 2);
          bVar20 = *(byte *)((long)puVar9 + 3);
          puVar9 = param_1 + ((uVar64 << ((ulong)uVar50 & 0x3f)) >> uVar45) + 1;
          *(short *)pbVar16 = (short)*puVar12;
          uVar53 = uVar53 + bVar19;
          bVar19 = *(byte *)((long)puVar12 + 3);
          puVar11 = param_1 + ((ulong)((long)puStack_128 << ((ulong)uVar46 & 0x3f)) >> uVar45) + 1;
          uVar49 = uVar49 + *(byte *)((long)puVar12 + 2);
          *(short *)(pbVar52 + bVar22) = (short)*puVar9;
          puVar12 = param_1 + ((uStack_130 << ((ulong)uVar53 & 0x3f)) >> uVar45) + 1;
          bVar23 = *(byte *)((long)puVar9 + 2);
          bVar24 = *(byte *)((long)puVar9 + 3);
          *(short *)(pbVar14 + bVar21) = (short)*puVar11;
          puVar9 = param_1 + ((ulong)((long)puVar36 << ((ulong)uVar49 & 0x3f)) >> uVar45) + 1;
          bVar25 = *(byte *)((long)puVar11 + 2);
          bVar26 = *(byte *)((long)puVar11 + 3);
          *(short *)(pbVar15 + bVar20) = (short)*puVar12;
          uVar50 = uVar50 + bVar23;
          bVar23 = *(byte *)((long)puVar12 + 2);
          bVar27 = *(byte *)((long)puVar12 + 3);
          *(short *)(pbVar16 + bVar19) = (short)*puVar9;
          if (puVar51 < puVar68) {
            iVar47 = 3;
          }
          else {
            uVar32 = uVar50 >> 3;
            iVar47 = 0;
            uVar50 = uVar50 & 7;
            puVar51 = (ulong *)((long)puVar51 - (ulong)uVar32);
            uVar64 = *puVar51;
          }
          uVar62 = (ulong)uVar50;
          uVar46 = uVar46 + bVar25;
          if (puStack_168 < puVar2) {
            iVar60 = 3;
          }
          else {
            uVar50 = uVar46 >> 3;
            iVar60 = 0;
            uVar46 = uVar46 & 7;
            puStack_168 = (ulong *)((long)puStack_168 - (ulong)uVar50);
            puStack_128 = (ulong *)*puStack_168;
          }
          uVar54 = (ulong)uVar46;
          uVar53 = uVar53 + bVar23;
          if (puStack_138 < puVar3) {
            iVar63 = 3;
          }
          else {
            uVar50 = uVar53 >> 3;
            iVar63 = 0;
            uVar53 = uVar53 & 7;
            puStack_138 = (ulong *)((long)puStack_138 - (ulong)uVar50);
            uStack_130 = *puStack_138;
          }
          uVar66 = (ulong)uVar53;
          uVar49 = uVar49 + *(byte *)((long)puVar9 + 2);
          if (puVar59 < apuStack_e8[0]) {
            iVar65 = 3;
          }
          else {
            uVar50 = uVar49 >> 3;
            iVar65 = 0;
            uVar49 = uVar49 & 7;
            puVar59 = (ulong *)((long)puVar59 - (ulong)uVar50);
            puVar36 = (ulong *)*puVar59;
            puStack_108 = puVar36;
            puStack_f8 = puVar59;
          }
          puVar48 = (ulong *)(pbVar16 + bVar19 + *(byte *)((long)puVar9 + 3));
          param_2 = (ulong *)(pbVar52 + bVar22 + bVar24);
          puVar56 = (ulong *)(pbVar14 + bVar21 + bVar26);
          puVar58 = (ulong *)(pbVar15 + bVar20 + bVar27);
        } while ((puVar48 < puVar44) &&
                (((iVar60 == 0 && iVar47 == 0) && iVar63 == 0) && iVar65 == 0));
        uStack_100 = (ulong *)CONCAT44(uStack_100._4_4_,uVar49);
      }
      uVar45 = 0xffffffffffffffec;
      if (((puVar55 < param_2) || (puVar38 < puVar56)) || (puVar35 < puVar58)) goto LAB_00bb695c;
      uVar39 = uVar39 >> 0x10;
      uStack_118._0_4_ = uVar39 & 0xff;
      iVar47 = (int)puVar42;
      uVar49 = (uint)uVar62;
      if ((ulong)((long)puVar55 - (long)param_2) < 8) {
        if (uVar49 < 0x41) {
          if (puVar51 < puVar68) {
            if (puVar51 == puVar42) {
LAB_00bb6ccc:
              puVar51 = puVar42;
            }
            else {
              uVar39 = (int)puVar51 - iVar47;
              if (puVar42 <= (ulong *)((long)puVar51 - (ulong)(uVar49 >> 3))) {
                uVar39 = uVar49 >> 3;
              }
              puVar51 = (ulong *)((long)puVar51 - (ulong)uVar39);
              uVar62 = (ulong)(uVar49 + uVar39 * -8);
              uVar64 = *puVar51;
            }
          }
          else {
            uVar62 = (ulong)(uVar49 & 7);
            puVar51 = (ulong *)((long)puVar51 - (ulong)(uVar49 >> 3));
            uVar64 = *puVar51;
          }
        }
        else {
          puVar51 = (ulong *)&DAT_007892b0;
        }
      }
      else {
        if ((uVar39 & 0xff) < 0xc) {
          if (uVar49 < 0x41) {
            uVar45 = (ulong)(-uVar43 & 0x3f);
            do {
              uVar39 = (uint)uVar62;
              if (puVar51 < puVar68) {
                if (puVar51 == puVar42) goto LAB_00bb6ccc;
                bVar34 = puVar42 <= (ulong *)((long)puVar51 - (uVar62 >> 3));
                uVar49 = (uint)(uVar62 >> 3);
                if (!bVar34) {
                  uVar49 = (int)puVar51 - iVar47;
                }
                uVar39 = uVar39 + uVar49 * -8;
              }
              else {
                uVar49 = uVar39 >> 3;
                uVar39 = uVar39 & 7;
                bVar34 = true;
              }
              uVar62 = (ulong)uVar39;
              puVar51 = (ulong *)((long)puVar51 - (ulong)uVar49);
              uVar64 = *puVar51;
              if (((ulong *)((long)puVar55 - 9U) <= param_2) || (!bVar34)) goto LAB_00bb6cac;
              puVar9 = param_1 + ((uVar64 << (uVar62 & 0x3f)) >> uVar45) + 1;
              *(short *)param_2 = (short)*puVar9;
              uVar39 = uVar39 + *(byte *)((long)puVar9 + 2);
              pbVar52 = (byte *)((long)param_2 + (ulong)*(byte *)((long)puVar9 + 3));
              puVar9 = param_1 + ((uVar64 << ((ulong)uVar39 & 0x3f)) >> uVar45) + 1;
              *(short *)pbVar52 = (short)*puVar9;
              uVar39 = uVar39 + *(byte *)((long)puVar9 + 2);
              pbVar52 = pbVar52 + *(byte *)((long)puVar9 + 3);
              puVar9 = param_1 + ((uVar64 << ((ulong)uVar39 & 0x3f)) >> uVar45) + 1;
              *(short *)pbVar52 = (short)*puVar9;
              uVar39 = uVar39 + *(byte *)((long)puVar9 + 2);
              pbVar52 = pbVar52 + *(byte *)((long)puVar9 + 3);
              puVar9 = param_1 + ((uVar64 << ((ulong)uVar39 & 0x3f)) >> uVar45) + 1;
              *(short *)pbVar52 = (short)*puVar9;
              bVar19 = *(byte *)((long)puVar9 + 3);
              uVar39 = uVar39 + *(byte *)((long)puVar9 + 2);
              puVar9 = param_1 + ((uVar64 << ((ulong)uVar39 & 0x3f)) >> uVar45) + 1;
              *(short *)(pbVar52 + bVar19) = (short)*puVar9;
              uVar39 = uVar39 + *(byte *)((long)puVar9 + 2);
              uVar62 = (ulong)uVar39;
              param_2 = (ulong *)(pbVar52 + bVar19 + *(byte *)((long)puVar9 + 3));
            } while (uVar39 < 0x41);
          }
        }
        else if (uVar49 < 0x41) {
          uVar45 = (ulong)(-uVar43 & 0x3f);
          do {
            uVar39 = (uint)uVar62;
            if (puVar51 < puVar68) {
              if (puVar51 == puVar42) goto LAB_00bb6ccc;
              bVar34 = puVar42 <= (ulong *)((long)puVar51 - (uVar62 >> 3));
              uVar49 = (uint)(uVar62 >> 3);
              if (!bVar34) {
                uVar49 = (int)puVar51 - iVar47;
              }
              uVar39 = uVar39 + uVar49 * -8;
            }
            else {
              uVar49 = uVar39 >> 3;
              uVar39 = uVar39 & 7;
              bVar34 = true;
            }
            uVar62 = (ulong)uVar39;
            puVar51 = (ulong *)((long)puVar51 - (ulong)uVar49);
            uVar64 = *puVar51;
            if (((ulong *)((long)puVar55 - 7U) <= param_2) || (!bVar34)) goto LAB_00bb6cac;
            puVar9 = param_1 + ((uVar64 << (uVar62 & 0x3f)) >> uVar45) + 1;
            *(short *)param_2 = (short)*puVar9;
            uVar39 = uVar39 + *(byte *)((long)puVar9 + 2);
            pbVar52 = (byte *)((long)param_2 + (ulong)*(byte *)((long)puVar9 + 3));
            puVar9 = param_1 + ((uVar64 << ((ulong)uVar39 & 0x3f)) >> uVar45) + 1;
            *(short *)pbVar52 = (short)*puVar9;
            uVar39 = uVar39 + *(byte *)((long)puVar9 + 2);
            pbVar52 = pbVar52 + *(byte *)((long)puVar9 + 3);
            puVar9 = param_1 + ((uVar64 << ((ulong)uVar39 & 0x3f)) >> uVar45) + 1;
            *(short *)pbVar52 = (short)*puVar9;
            bVar19 = *(byte *)((long)puVar9 + 3);
            uVar39 = uVar39 + *(byte *)((long)puVar9 + 2);
            puVar9 = param_1 + ((uVar64 << ((ulong)uVar39 & 0x3f)) >> uVar45) + 1;
            *(short *)(pbVar52 + bVar19) = (short)*puVar9;
            uVar39 = uVar39 + *(byte *)((long)puVar9 + 2);
            uVar62 = (ulong)uVar39;
            param_2 = (ulong *)(pbVar52 + bVar19 + *(byte *)((long)puVar9 + 3));
          } while (uVar39 < 0x41);
        }
        puVar51 = (ulong *)&DAT_007892b0;
      }
      goto LAB_00bb6cd0;
    }
    uVar64 = (ulong)(byte)*puVar42;
    uVar49 = (uint)uVar28;
    if (uVar28 < 5) {
      if (uVar49 != 2) {
        if (uVar49 != 3) {
          if (uVar49 != 4) goto LAB_00bb6390;
          goto LAB_00bb6378;
        }
        goto LAB_00bb6380;
      }
LAB_00bb6388:
      uVar64 = uVar64 + (ulong)*(byte *)((long)puVar18 + 7) * 0x100;
    }
    else {
      if (uVar28 == 5) {
LAB_00bb6370:
        uVar64 = uVar64 + ((ulong)(byte)puVar18[5] << 0x20);
LAB_00bb6378:
        uVar64 = uVar64 + (ulong)*(byte *)((long)puVar18 + 9) * 0x1000000;
LAB_00bb6380:
        uVar64 = uVar64 + (ulong)(byte)puVar18[4] * 0x10000;
        goto LAB_00bb6388;
      }
      if (uVar28 == 6) {
LAB_00bb6368:
        uVar64 = uVar64 + ((ulong)*(byte *)((long)puVar18 + 0xb) << 0x28);
        goto LAB_00bb6370;
      }
      if (uVar49 == 7) {
        uVar64 = uVar64 | (ulong)(byte)puVar18[6] << 0x30;
        goto LAB_00bb6368;
      }
    }
LAB_00bb6390:
    if (*(byte *)((long)puVar40 + -1) == 0) goto LAB_00bb695c;
    uVar49 = (int)LZCOUNT((uint)*(byte *)((long)puVar40 + -1)) + uVar49 * -8 + 0x29;
    puVar51 = puVar42;
    if (uVar43 != 0) goto LAB_00bb63ac;
  }
LAB_00bb64ec:
  uVar45 = 0xffffffffffffffb8;
  goto LAB_00bb695c;
LAB_00bb6cac:
LAB_00bb6cd0:
  if (1 < (ulong)((long)puVar55 - (long)param_2)) {
    uVar39 = (uint)uVar62;
    puVar36 = puVar51;
    while (uVar39 < 0x41) {
      uVar39 = (uint)uVar62;
      if (puVar36 < puVar68) {
        puVar51 = puVar42;
        if (puVar36 == puVar42) goto joined_r0x00bb6d98;
        bVar34 = puVar42 <= (ulong *)((long)puVar36 - (uVar62 >> 3));
        uVar49 = (uint)(uVar62 >> 3);
        if (!bVar34) {
          uVar49 = (int)puVar36 - iVar47;
        }
        uVar39 = uVar39 + uVar49 * -8;
      }
      else {
        uVar49 = uVar39 >> 3;
        uVar39 = uVar39 & 7;
        bVar34 = true;
      }
      uVar62 = (ulong)uVar39;
      puVar36 = (ulong *)((long)puVar36 - (ulong)uVar49);
      uVar64 = *puVar36;
      puVar51 = puVar36;
      if (((ulong *)((long)puVar55 - 2U) < param_2) || (!bVar34)) goto joined_r0x00bb6d98;
      puVar9 = param_1 + ((uVar64 << (uVar62 & 0x3f)) >> (-uVar43 & 0x3f)) + 1;
      *(short *)param_2 = (short)*puVar9;
      uVar39 = uVar39 + *(byte *)((long)puVar9 + 2);
      uVar62 = (ulong)uVar39;
      param_2 = (ulong *)((long)param_2 + (ulong)*(byte *)((long)puVar9 + 3));
    }
    puVar51 = (ulong *)&DAT_007892b0;
joined_r0x00bb6d98:
    for (; param_2 <= (ulong *)((long)puVar55 - 2U);
        param_2 = (ulong *)((long)param_2 + (ulong)*(byte *)((long)puVar9 + 3))) {
      puVar9 = param_1 + ((uVar64 << (uVar62 & 0x3f)) >> (-uVar43 & 0x3f)) + 1;
      *(short *)param_2 = (short)*puVar9;
      uVar62 = (ulong)((int)uVar62 + (uint)*(byte *)((long)puVar9 + 2));
    }
  }
  uVar39 = (uint)uVar62;
  if (param_2 < puVar55) {
    puVar9 = param_1 + ((uVar64 << (uVar62 & 0x3f)) >> ((ulong)-uVar43 & 0x3f)) + 1;
    *(byte *)param_2 = (byte)*puVar9;
    if (*(char *)((long)puVar9 + 3) == '\x01') {
      uVar39 = uVar39 + *(byte *)((long)puVar9 + 2);
    }
    else if ((uVar39 < 0x40) && (uVar39 = uVar39 + *(byte *)((long)puVar9 + 2), 0x3f < uVar39)) {
      uVar39 = 0x40;
    }
  }
  iVar47 = (int)puVar40;
  uVar49 = (uint)uVar54;
  if ((ulong)((long)puVar38 - (long)puVar56) < 8) {
    if (0x40 < uVar49) goto LAB_00bb7bd0;
    if (puStack_168 < puVar2) {
      if (puStack_168 == puVar40) {
LAB_00bb710c:
        puStack_168 = puVar40;
      }
      else {
        uVar50 = (int)puStack_168 - iVar47;
        if (puVar40 <= (ulong *)((long)puStack_168 - (ulong)(uVar49 >> 3))) {
          uVar50 = uVar49 >> 3;
        }
        puStack_168 = (ulong *)((long)puStack_168 - (ulong)uVar50);
        uVar54 = (ulong)(uVar49 + uVar50 * -8);
        puStack_128 = (ulong *)*puStack_168;
      }
    }
    else {
      uVar54 = (ulong)(uVar49 & 7);
      puStack_168 = (ulong *)((long)puStack_168 - (ulong)(uVar49 >> 3));
      puStack_128 = (ulong *)*puStack_168;
    }
  }
  else {
    if ((uint)uStack_118 < 0xc) {
      if (0x40 < uVar49) goto LAB_00bb7bd0;
      uVar45 = (ulong)(-uVar43 & 0x3f);
      do {
        uVar49 = (uint)uVar54;
        if (puStack_168 < puVar2) {
          if (puStack_168 == puVar40) goto LAB_00bb710c;
          bVar34 = puVar40 <= (ulong *)((long)puStack_168 - (uVar54 >> 3));
          uVar50 = (uint)(uVar54 >> 3);
          if (!bVar34) {
            uVar50 = (int)puStack_168 - iVar47;
          }
          uVar49 = uVar49 + uVar50 * -8;
        }
        else {
          uVar50 = uVar49 >> 3;
          uVar49 = uVar49 & 7;
          bVar34 = true;
        }
        uVar54 = (ulong)uVar49;
        puStack_168 = (ulong *)((long)puStack_168 - (ulong)uVar50);
        puStack_128 = (ulong *)*puStack_168;
        if (((ulong *)((long)puVar38 - 9U) <= puVar56) || (!bVar34)) goto LAB_00bb70ec;
        puVar9 = param_1 + ((ulong)((long)puStack_128 << (uVar54 & 0x3f)) >> uVar45) + 1;
        *(short *)puVar56 = (short)*puVar9;
        uVar49 = uVar49 + *(byte *)((long)puVar9 + 2);
        pbVar52 = (byte *)((long)puVar56 + (ulong)*(byte *)((long)puVar9 + 3));
        puVar9 = param_1 + ((ulong)((long)puStack_128 << ((ulong)uVar49 & 0x3f)) >> uVar45) + 1;
        *(short *)pbVar52 = (short)*puVar9;
        uVar49 = uVar49 + *(byte *)((long)puVar9 + 2);
        pbVar52 = pbVar52 + *(byte *)((long)puVar9 + 3);
        puVar9 = param_1 + ((ulong)((long)puStack_128 << ((ulong)uVar49 & 0x3f)) >> uVar45) + 1;
        *(short *)pbVar52 = (short)*puVar9;
        uVar49 = uVar49 + *(byte *)((long)puVar9 + 2);
        pbVar52 = pbVar52 + *(byte *)((long)puVar9 + 3);
        puVar9 = param_1 + ((ulong)((long)puStack_128 << ((ulong)uVar49 & 0x3f)) >> uVar45) + 1;
        *(short *)pbVar52 = (short)*puVar9;
        bVar19 = *(byte *)((long)puVar9 + 3);
        uVar49 = uVar49 + *(byte *)((long)puVar9 + 2);
        puVar9 = param_1 + ((ulong)((long)puStack_128 << ((ulong)uVar49 & 0x3f)) >> uVar45) + 1;
        *(short *)(pbVar52 + bVar19) = (short)*puVar9;
        uVar49 = uVar49 + *(byte *)((long)puVar9 + 2);
        uVar54 = (ulong)uVar49;
        puVar56 = (ulong *)(pbVar52 + bVar19 + *(byte *)((long)puVar9 + 3));
      } while (uVar49 < 0x41);
    }
    else {
      if (0x40 < uVar49) {
LAB_00bb7bd0:
        puStack_168 = (ulong *)&DAT_007892b0;
        goto LAB_00bb7110;
      }
      uVar45 = (ulong)(-uVar43 & 0x3f);
      do {
        uVar49 = (uint)uVar54;
        if (puStack_168 < puVar2) {
          if (puStack_168 == puVar40) goto LAB_00bb710c;
          bVar34 = puVar40 <= (ulong *)((long)puStack_168 - (uVar54 >> 3));
          uVar50 = (uint)(uVar54 >> 3);
          if (!bVar34) {
            uVar50 = (int)puStack_168 - iVar47;
          }
          uVar49 = uVar49 + uVar50 * -8;
        }
        else {
          uVar50 = uVar49 >> 3;
          uVar49 = uVar49 & 7;
          bVar34 = true;
        }
        uVar54 = (ulong)uVar49;
        puStack_168 = (ulong *)((long)puStack_168 - (ulong)uVar50);
        puStack_128 = (ulong *)*puStack_168;
        if (((ulong *)((long)puVar38 - 7U) <= puVar56) || (!bVar34)) goto LAB_00bb70ec;
        puVar9 = param_1 + ((ulong)((long)puStack_128 << (uVar54 & 0x3f)) >> uVar45) + 1;
        *(short *)puVar56 = (short)*puVar9;
        uVar49 = uVar49 + *(byte *)((long)puVar9 + 2);
        pbVar52 = (byte *)((long)puVar56 + (ulong)*(byte *)((long)puVar9 + 3));
        puVar9 = param_1 + ((ulong)((long)puStack_128 << ((ulong)uVar49 & 0x3f)) >> uVar45) + 1;
        *(short *)pbVar52 = (short)*puVar9;
        uVar49 = uVar49 + *(byte *)((long)puVar9 + 2);
        pbVar52 = pbVar52 + *(byte *)((long)puVar9 + 3);
        puVar9 = param_1 + ((ulong)((long)puStack_128 << ((ulong)uVar49 & 0x3f)) >> uVar45) + 1;
        *(short *)pbVar52 = (short)*puVar9;
        bVar19 = *(byte *)((long)puVar9 + 3);
        uVar49 = uVar49 + *(byte *)((long)puVar9 + 2);
        puVar9 = param_1 + ((ulong)((long)puStack_128 << ((ulong)uVar49 & 0x3f)) >> uVar45) + 1;
        *(short *)(pbVar52 + bVar19) = (short)*puVar9;
        uVar49 = uVar49 + *(byte *)((long)puVar9 + 2);
        uVar54 = (ulong)uVar49;
        puVar56 = (ulong *)(pbVar52 + bVar19 + *(byte *)((long)puVar9 + 3));
      } while (uVar49 < 0x41);
    }
    puStack_168 = (ulong *)&DAT_007892b0;
  }
  goto LAB_00bb7110;
LAB_00bb70ec:
LAB_00bb7110:
  if (1 < (ulong)((long)puVar38 - (long)puVar56)) {
    uVar49 = (uint)uVar54;
    puVar55 = puStack_168;
    while (uVar49 < 0x41) {
      uVar49 = (uint)uVar54;
      if (puVar55 < puVar2) {
        puStack_168 = puVar40;
        if (puVar55 == puVar40) goto joined_r0x00bb71dc;
        bVar34 = puVar40 <= (ulong *)((long)puVar55 - (uVar54 >> 3));
        uVar50 = (uint)(uVar54 >> 3);
        if (!bVar34) {
          uVar50 = (int)puVar55 - iVar47;
        }
        uVar49 = uVar49 + uVar50 * -8;
      }
      else {
        uVar50 = uVar49 >> 3;
        uVar49 = uVar49 & 7;
        bVar34 = true;
      }
      uVar54 = (ulong)uVar49;
      puVar55 = (ulong *)((long)puVar55 - (ulong)uVar50);
      puStack_128 = (ulong *)*puVar55;
      puStack_168 = puVar55;
      if (((ulong *)((long)puVar38 - 2U) < puVar56) || (!bVar34)) goto joined_r0x00bb71dc;
      puVar9 = param_1 + ((ulong)((long)puStack_128 << (uVar54 & 0x3f)) >> (-uVar43 & 0x3f)) + 1;
      *(short *)puVar56 = (short)*puVar9;
      uVar49 = uVar49 + *(byte *)((long)puVar9 + 2);
      uVar54 = (ulong)uVar49;
      puVar56 = (ulong *)((long)puVar56 + (ulong)*(byte *)((long)puVar9 + 3));
    }
    puStack_168 = (ulong *)&DAT_007892b0;
joined_r0x00bb71dc:
    for (; puVar56 <= (ulong *)((long)puVar38 - 2U);
        puVar56 = (ulong *)((long)puVar56 + (ulong)*(byte *)((long)puVar9 + 3))) {
      puVar9 = param_1 + ((ulong)((long)puStack_128 << (uVar54 & 0x3f)) >> (-uVar43 & 0x3f)) + 1;
      *(short *)puVar56 = (short)*puVar9;
      uVar54 = (ulong)((int)uVar54 + (uint)*(byte *)((long)puVar9 + 2));
    }
  }
  uVar49 = (uint)uVar54;
  if (puVar56 < puVar38) {
    puVar9 = param_1 + ((ulong)((long)puStack_128 << (uVar54 & 0x3f)) >> ((ulong)-uVar43 & 0x3f)) +
                       1;
    *(byte *)puVar56 = (byte)*puVar9;
    if (*(char *)((long)puVar9 + 3) == '\x01') {
      uVar49 = uVar49 + *(byte *)((long)puVar9 + 2);
    }
    else if ((uVar49 < 0x40) && (uVar49 = uVar49 + *(byte *)((long)puVar9 + 2), 0x3f < uVar49)) {
      uVar49 = 0x40;
    }
  }
  iVar47 = (int)puVar10;
  uVar50 = (uint)uVar66;
  if ((ulong)((long)puVar35 - (long)puVar58) < 8) {
    if (uVar50 < 0x41) {
      if (puStack_138 < puVar3) {
        if (puStack_138 == puVar10) {
          puVar55 = puVar10;
        }
        else {
          uVar46 = (int)puStack_138 - iVar47;
          if (puVar10 <= (ulong *)((long)puStack_138 - (ulong)(uVar50 >> 3))) {
            uVar46 = uVar50 >> 3;
          }
          uVar66 = (ulong)(uVar50 + uVar46 * -8);
          uStack_130 = *(ulong *)((long)puStack_138 - (ulong)uVar46);
          puVar55 = (ulong *)((long)puStack_138 - (ulong)uVar46);
        }
      }
      else {
        uVar66 = (ulong)(uVar50 & 7);
        puVar55 = (ulong *)((long)puStack_138 - (ulong)(uVar50 >> 3));
        uStack_130 = *puVar55;
      }
    }
    else {
      puVar55 = (ulong *)&DAT_007892b0;
    }
  }
  else {
    if ((uint)uStack_118 < 0xc) {
      if (uVar50 < 0x41) {
        uVar50 = -uVar43 & 0x3f;
        do {
          uVar46 = (uint)uVar66;
          if (puStack_138 < puVar3) {
            puVar55 = puVar10;
            if (puStack_138 == puVar10) goto LAB_00bb7540;
            bVar34 = puVar10 <= (ulong *)((long)puStack_138 - (uVar66 >> 3));
            uVar53 = (uint)(uVar66 >> 3);
            if (!bVar34) {
              uVar53 = (int)puStack_138 - iVar47;
            }
            uVar46 = uVar46 + uVar53 * -8;
          }
          else {
            uVar53 = uVar46 >> 3;
            uVar46 = uVar46 & 7;
            bVar34 = true;
          }
          uVar66 = (ulong)uVar46;
          puStack_138 = (ulong *)((long)puStack_138 - (ulong)uVar53);
          uStack_130 = *puStack_138;
          puVar55 = puStack_138;
          if (((ulong *)((long)puVar35 - 9U) <= puVar58) || (!bVar34)) goto LAB_00bb7540;
          puVar9 = param_1 + ((uStack_130 << (uVar66 & 0x3f)) >> uVar50) + 1;
          *(short *)puVar58 = (short)*puVar9;
          uVar46 = uVar46 + *(byte *)((long)puVar9 + 2);
          pbVar52 = (byte *)((long)puVar58 + (ulong)*(byte *)((long)puVar9 + 3));
          puVar9 = param_1 + ((uStack_130 << ((ulong)uVar46 & 0x3f)) >> uVar50) + 1;
          *(short *)pbVar52 = (short)*puVar9;
          uVar46 = uVar46 + *(byte *)((long)puVar9 + 2);
          pbVar52 = pbVar52 + *(byte *)((long)puVar9 + 3);
          puVar9 = param_1 + ((uStack_130 << ((ulong)uVar46 & 0x3f)) >> uVar50) + 1;
          *(short *)pbVar52 = (short)*puVar9;
          uVar46 = uVar46 + *(byte *)((long)puVar9 + 2);
          pbVar52 = pbVar52 + *(byte *)((long)puVar9 + 3);
          puVar9 = param_1 + ((uStack_130 << ((ulong)uVar46 & 0x3f)) >> uVar50) + 1;
          *(short *)pbVar52 = (short)*puVar9;
          bVar19 = *(byte *)((long)puVar9 + 3);
          uVar46 = uVar46 + *(byte *)((long)puVar9 + 2);
          puVar9 = param_1 + ((uStack_130 << ((ulong)uVar46 & 0x3f)) >> uVar50) + 1;
          *(short *)(pbVar52 + bVar19) = (short)*puVar9;
          uVar46 = uVar46 + *(byte *)((long)puVar9 + 2);
          uVar66 = (ulong)uVar46;
          puVar58 = (ulong *)(pbVar52 + bVar19 + *(byte *)((long)puVar9 + 3));
        } while (uVar46 < 0x41);
        goto LAB_00bb7518;
      }
LAB_00bb7bf0:
      puVar55 = (ulong *)&DAT_007892b0;
    }
    else {
      if (0x40 < uVar50) goto LAB_00bb7bf0;
      uVar50 = -uVar43 & 0x3f;
      do {
        uVar46 = (uint)uVar66;
        if (puStack_138 < puVar3) {
          puVar55 = puVar10;
          if (puStack_138 == puVar10) goto LAB_00bb7540;
          bVar34 = puVar10 <= (ulong *)((long)puStack_138 - (uVar66 >> 3));
          uVar53 = (uint)(uVar66 >> 3);
          if (!bVar34) {
            uVar53 = (int)puStack_138 - iVar47;
          }
          uVar46 = uVar46 + uVar53 * -8;
        }
        else {
          uVar53 = uVar46 >> 3;
          uVar46 = uVar46 & 7;
          bVar34 = true;
        }
        uVar66 = (ulong)uVar46;
        puStack_138 = (ulong *)((long)puStack_138 - (ulong)uVar53);
        uStack_130 = *puStack_138;
        puVar55 = puStack_138;
        if (((ulong *)((long)puVar35 - 7U) <= puVar58) || (!bVar34)) goto LAB_00bb7540;
        puVar9 = param_1 + ((uStack_130 << (uVar66 & 0x3f)) >> uVar50) + 1;
        *(short *)puVar58 = (short)*puVar9;
        uVar46 = uVar46 + *(byte *)((long)puVar9 + 2);
        pbVar52 = (byte *)((long)puVar58 + (ulong)*(byte *)((long)puVar9 + 3));
        puVar9 = param_1 + ((uStack_130 << ((ulong)uVar46 & 0x3f)) >> uVar50) + 1;
        *(short *)pbVar52 = (short)*puVar9;
        uVar46 = uVar46 + *(byte *)((long)puVar9 + 2);
        pbVar52 = pbVar52 + *(byte *)((long)puVar9 + 3);
        puVar9 = param_1 + ((uStack_130 << ((ulong)uVar46 & 0x3f)) >> uVar50) + 1;
        *(short *)pbVar52 = (short)*puVar9;
        bVar19 = *(byte *)((long)puVar9 + 3);
        uVar46 = uVar46 + *(byte *)((long)puVar9 + 2);
        puVar9 = param_1 + ((uStack_130 << ((ulong)uVar46 & 0x3f)) >> uVar50) + 1;
        *(short *)(pbVar52 + bVar19) = (short)*puVar9;
        uVar46 = uVar46 + *(byte *)((long)puVar9 + 2);
        uVar66 = (ulong)uVar46;
        puVar58 = (ulong *)(pbVar52 + bVar19 + *(byte *)((long)puVar9 + 3));
      } while (uVar46 < 0x41);
LAB_00bb7518:
      puVar55 = (ulong *)&DAT_007892b0;
    }
LAB_00bb7540:
  }
  if (1 < (ulong)((long)puVar35 - (long)puVar58)) {
    if ((uint)uVar66 < 0x41) {
      do {
        uVar50 = (uint)uVar66;
        if (puVar55 < puVar3) {
          puVar38 = puVar10;
          if (puVar55 == puVar10) goto joined_r0x00bb7608;
          bVar34 = puVar10 <= (ulong *)((long)puVar55 - (uVar66 >> 3));
          uVar46 = (uint)(uVar66 >> 3);
          if (!bVar34) {
            uVar46 = (int)puVar55 - iVar47;
          }
          uVar50 = uVar50 + uVar46 * -8;
        }
        else {
          uVar46 = uVar50 >> 3;
          uVar50 = uVar50 & 7;
          bVar34 = true;
        }
        uVar66 = (ulong)uVar50;
        puVar55 = (ulong *)((long)puVar55 - (ulong)uVar46);
        uStack_130 = *puVar55;
        puVar38 = puVar55;
        if (((ulong *)((long)puVar35 - 2U) < puVar58) || (!bVar34)) goto joined_r0x00bb7608;
        puVar9 = param_1 + ((uStack_130 << (uVar66 & 0x3f)) >> (-uVar43 & 0x3f)) + 1;
        *(short *)puVar58 = (short)*puVar9;
        uVar50 = uVar50 + *(byte *)((long)puVar9 + 2);
        uVar66 = (ulong)uVar50;
        puVar58 = (ulong *)((long)puVar58 + (ulong)*(byte *)((long)puVar9 + 3));
      } while (uVar50 < 0x41);
      puVar38 = (ulong *)&DAT_007892b0;
    }
    else {
      puVar38 = (ulong *)&DAT_007892b0;
    }
joined_r0x00bb7608:
    for (; puVar55 = puVar38, puVar58 <= (ulong *)((long)puVar35 - 2U);
        puVar58 = (ulong *)((long)puVar58 + (ulong)*(byte *)((long)puVar9 + 3))) {
      puVar9 = param_1 + ((uStack_130 << (uVar66 & 0x3f)) >> (-uVar43 & 0x3f)) + 1;
      *(short *)puVar58 = (short)*puVar9;
      uVar66 = (ulong)((int)uVar66 + (uint)*(byte *)((long)puVar9 + 2));
      puVar38 = puVar55;
    }
  }
  uVar50 = (uint)uVar66;
  if (puVar58 < puVar35) {
    puVar9 = param_1 + ((uStack_130 << (uVar66 & 0x3f)) >> ((ulong)-uVar43 & 0x3f)) + 1;
    *(byte *)puVar58 = (byte)*puVar9;
    if (*(char *)((long)puVar9 + 3) == '\x01') {
      uVar50 = uVar50 + *(byte *)((long)puVar9 + 2);
    }
    else if ((uVar50 < 0x40) && (uVar50 = uVar50 + *(byte *)((long)puVar9 + 2), 0x3f < uVar50)) {
      uVar50 = 0x40;
    }
  }
  iVar47 = (int)puStack_f0;
  if ((ulong)((long)puVar4 - (long)puVar48) < 8) {
    uVar45 = (ulong)uStack_100 & 0xffffffff;
    if ((uint)uStack_100 < 0x41) {
      if (puStack_f8 < apuStack_e8[0]) {
        if (puStack_f8 == puStack_f0) goto LAB_00bb79f4;
        uVar53 = (int)puStack_f8 - iVar47;
        if (puStack_f0 <= (ulong *)((long)puStack_f8 - (ulong)((uint)uStack_100 >> 3))) {
          uVar53 = (uint)uStack_100 >> 3;
        }
        uVar46 = (uint)uStack_100 + uVar53 * -8;
        puStack_f8 = (ulong *)((long)puStack_f8 - (ulong)uVar53);
        uStack_100 = (ulong *)CONCAT44(uStack_100._4_4_,uVar46);
        puStack_108 = (ulong *)*puStack_f8;
      }
      else {
        puStack_f8 = (ulong *)((long)puStack_f8 - (ulong)((uint)uStack_100 >> 3));
        uVar46 = (uint)uStack_100 & 7;
        uStack_100 = (ulong *)((ulong)uStack_100 & 0xffffffff00000007);
        puStack_108 = (ulong *)*puStack_f8;
      }
      uVar45 = (ulong)uVar46;
    }
    else {
      puStack_f8 = (ulong *)&DAT_007892b0;
    }
  }
  else {
    uVar45 = (ulong)uStack_100 & 0xffffffff;
    if ((uint)uStack_118 < 0xc) {
      if ((uint)uStack_100 < 0x41) {
        uVar46 = -uVar43 & 0x3f;
        do {
          uVar53 = (uint)uVar45;
          if (puStack_f8 < apuStack_e8[0]) {
            if (puStack_f8 == puStack_f0) goto LAB_00bb79f4;
            bVar34 = puStack_f0 <= (ulong *)((long)puStack_f8 - (uVar45 >> 3));
            uVar32 = (uint)(uVar45 >> 3);
            if (!bVar34) {
              uVar32 = (int)puStack_f8 - iVar47;
            }
            uVar53 = uVar53 + uVar32 * -8;
          }
          else {
            uVar32 = uVar53 >> 3;
            uVar53 = uVar53 & 7;
            bVar34 = true;
          }
          uVar45 = (ulong)uVar53;
          puStack_f8 = (ulong *)((long)puStack_f8 - (ulong)uVar32);
          uStack_100 = (ulong *)CONCAT44(uStack_100._4_4_,uVar53);
          puStack_108 = (ulong *)*puStack_f8;
          if (((ulong *)((long)puVar4 - 9U) <= puVar48) || (!bVar34)) goto LAB_00bb79f4;
          puVar9 = param_1 + ((ulong)((long)puStack_108 << (uVar45 & 0x3f)) >> uVar46) + 1;
          *(short *)puVar48 = (short)*puVar9;
          uVar53 = uVar53 + *(byte *)((long)puVar9 + 2);
          pbVar52 = (byte *)((long)puVar48 + (ulong)*(byte *)((long)puVar9 + 3));
          puVar9 = param_1 + ((ulong)((long)puStack_108 << ((ulong)uVar53 & 0x3f)) >> uVar46) + 1;
          *(short *)pbVar52 = (short)*puVar9;
          uVar53 = uVar53 + *(byte *)((long)puVar9 + 2);
          pbVar52 = pbVar52 + *(byte *)((long)puVar9 + 3);
          puVar9 = param_1 + ((ulong)((long)puStack_108 << ((ulong)uVar53 & 0x3f)) >> uVar46) + 1;
          *(short *)pbVar52 = (short)*puVar9;
          uVar53 = uVar53 + *(byte *)((long)puVar9 + 2);
          pbVar52 = pbVar52 + *(byte *)((long)puVar9 + 3);
          puVar9 = param_1 + ((ulong)((long)puStack_108 << ((ulong)uVar53 & 0x3f)) >> uVar46) + 1;
          *(short *)pbVar52 = (short)*puVar9;
          uVar53 = uVar53 + *(byte *)((long)puVar9 + 2);
          puVar11 = param_1 + ((ulong)((long)puStack_108 << ((ulong)uVar53 & 0x3f)) >> uVar46) + 1;
          bVar19 = *(byte *)((long)puVar9 + 3);
          *(short *)(pbVar52 + bVar19) = (short)*puVar11;
          uVar53 = uVar53 + *(byte *)((long)puVar11 + 2);
          uVar45 = (ulong)uVar53;
          uStack_100 = (ulong *)CONCAT44(uStack_100._4_4_,uVar53);
          puVar48 = (ulong *)(pbVar52 + bVar19 + *(byte *)((long)puVar11 + 3));
        } while (uVar53 < 0x41);
      }
    }
    else if ((uint)uStack_100 < 0x41) {
      uVar46 = -uVar43 & 0x3f;
      do {
        uVar53 = (uint)uVar45;
        if (puStack_f8 < apuStack_e8[0]) {
          if (puStack_f8 == puStack_f0) goto LAB_00bb79f4;
          bVar34 = puStack_f0 <= (ulong *)((long)puStack_f8 - (uVar45 >> 3));
          uVar32 = (uint)(uVar45 >> 3);
          if (!bVar34) {
            uVar32 = (int)puStack_f8 - iVar47;
          }
          uVar53 = uVar53 + uVar32 * -8;
        }
        else {
          uVar32 = uVar53 >> 3;
          uVar53 = uVar53 & 7;
          bVar34 = true;
        }
        uVar45 = (ulong)uVar53;
        puStack_f8 = (ulong *)((long)puStack_f8 - (ulong)uVar32);
        uStack_100 = (ulong *)CONCAT44(uStack_100._4_4_,uVar53);
        puStack_108 = (ulong *)*puStack_f8;
        if ((puVar44 <= puVar48) || (!bVar34)) goto LAB_00bb79f4;
        puVar9 = param_1 + ((ulong)((long)puStack_108 << (uVar45 & 0x3f)) >> uVar46) + 1;
        *(short *)puVar48 = (short)*puVar9;
        uVar53 = uVar53 + *(byte *)((long)puVar9 + 2);
        pbVar52 = (byte *)((long)puVar48 + (ulong)*(byte *)((long)puVar9 + 3));
        puVar9 = param_1 + ((ulong)((long)puStack_108 << ((ulong)uVar53 & 0x3f)) >> uVar46) + 1;
        *(short *)pbVar52 = (short)*puVar9;
        uVar53 = uVar53 + *(byte *)((long)puVar9 + 2);
        pbVar52 = pbVar52 + *(byte *)((long)puVar9 + 3);
        puVar9 = param_1 + ((ulong)((long)puStack_108 << ((ulong)uVar53 & 0x3f)) >> uVar46) + 1;
        *(short *)pbVar52 = (short)*puVar9;
        bVar19 = *(byte *)((long)puVar9 + 3);
        uVar53 = uVar53 + *(byte *)((long)puVar9 + 2);
        puVar9 = param_1 + ((ulong)((long)puStack_108 << ((ulong)uVar53 & 0x3f)) >> uVar46) + 1;
        *(short *)(pbVar52 + bVar19) = (short)*puVar9;
        uVar53 = uVar53 + *(byte *)((long)puVar9 + 2);
        uVar45 = (ulong)uVar53;
        uStack_100 = (ulong *)CONCAT44(uStack_100._4_4_,uVar53);
        puVar48 = (ulong *)(pbVar52 + bVar19 + *(byte *)((long)puVar9 + 3));
      } while (uVar53 < 0x41);
    }
    puStack_f8 = (ulong *)&DAT_007892b0;
  }
LAB_00bb79f4:
  if (1 < (ulong)((long)puVar4 - (long)puVar48)) {
    uVar46 = (uint)uVar45;
    while (uVar46 < 0x41) {
      uVar46 = (uint)uVar45;
      if (puStack_f8 < apuStack_e8[0]) {
        if (puStack_f8 == puStack_f0) goto joined_r0x00bb7ac4;
        bVar34 = puStack_f0 <= (ulong *)((long)puStack_f8 - (uVar45 >> 3));
        uVar53 = (uint)(uVar45 >> 3);
        if (!bVar34) {
          uVar53 = (int)puStack_f8 - iVar47;
        }
        uVar46 = uVar46 + uVar53 * -8;
      }
      else {
        uVar53 = uVar46 >> 3;
        uVar46 = uVar46 & 7;
        bVar34 = true;
      }
      uVar45 = (ulong)uVar46;
      puStack_f8 = (ulong *)((long)puStack_f8 - (ulong)uVar53);
      uStack_100._4_4_ = (undefined4)((ulong)uStack_100 >> 0x20);
      uStack_100 = (ulong *)CONCAT44(uStack_100._4_4_,uVar46);
      puStack_108 = (ulong *)*puStack_f8;
      if (((ulong *)((long)puVar4 - 2U) < puVar48) || (!bVar34)) goto joined_r0x00bb7ac4;
      puVar9 = param_1 + ((ulong)((long)puStack_108 << (uVar45 & 0x3f)) >> (-uVar43 & 0x3f)) + 1;
      *(short *)puVar48 = (short)*puVar9;
      uVar46 = uVar46 + *(byte *)((long)puVar9 + 2);
      uVar45 = (ulong)uVar46;
      puVar48 = (ulong *)((long)puVar48 + (ulong)*(byte *)((long)puVar9 + 3));
      uStack_100 = (ulong *)CONCAT44(uStack_100._4_4_,uVar46);
    }
    puStack_f8 = (ulong *)&DAT_007892b0;
joined_r0x00bb7ac4:
    for (; puVar48 <= (ulong *)((long)puVar4 - 2U);
        puVar48 = (ulong *)((long)puVar48 + (ulong)*(byte *)((long)puVar9 + 3))) {
      puVar9 = param_1 + ((ulong)((long)puStack_108 << (uVar45 & 0x3f)) >> (-uVar43 & 0x3f)) + 1;
      *(short *)puVar48 = (short)*puVar9;
      uVar46 = (uint)uStack_100 + *(byte *)((long)puVar9 + 2);
      uVar45 = (ulong)uVar46;
      uStack_100._4_4_ = (undefined4)((ulong)uStack_100 >> 0x20);
      uStack_100 = (ulong *)CONCAT44(uStack_100._4_4_,uVar46);
    }
  }
  uVar46 = (uint)uVar45;
  if (puVar48 < puVar4) {
    param_1 = param_1 + ((ulong)((long)puStack_108 << (uVar45 & 0x3f)) >> ((ulong)-uVar43 & 0x3f)) +
                        1;
    *(byte *)puVar48 = (byte)*param_1;
    if (*(char *)((long)param_1 + 3) == '\x01') {
      uVar46 = (uint)uStack_100 + *(byte *)((long)param_1 + 2);
    }
    else {
      uVar46 = (uint)uStack_100;
      if (((uint)uStack_100 < 0x40) &&
         (uVar46 = (uint)uStack_100 + *(byte *)((long)param_1 + 2), 0x3f < uVar46)) {
        uVar46 = 0x40;
      }
    }
  }
  uVar45 = 0xffffffffffffffec;
  if (((((((uVar46 == 0x40 && puStack_f8 == puStack_f0) && uVar50 == 0x40) && puVar55 == puVar10) &&
        uVar49 == 0x40) && puStack_168 == puVar40) && uVar39 == 0x40) && puVar51 == puVar42) {
    uVar45 = param_3;
  }
LAB_00bb695c:
  if (*(long *)(lVar1 + 0x28) != lStack_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar45);
  }
  return uVar45;
}

