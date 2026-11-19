/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008907f4
 */

void FUN_008907f4(undefined8 *param_1,long param_2,uint param_3,ulong param_4)

{
  undefined8 *puVar1;
  void *pvVar2;
  uint uVar3;
  long lVar4;
  int iVar5;
  undefined4 uVar6;
  undefined8 uVar7;
  long lVar8;
  ulong uVar9;
  ulong *puVar10;
  long lVar11;
  char *pcVar12;
  uint uVar13;
  long lVar14;
  uint uVar15;
  ulong uVar16;
  ulong uVar17;
  undefined8 *puVar18;
  ulong uVar19;
  char *pcVar20;
  char *pcVar21;
  long lVar22;
  int iVar23;
  uint uVar24;
  long lVar25;
  long lVar26;
  long lVar27;
  long lVar28;
  long lVar29;
  long lVar30;
  long lVar31;
  long lVar32;
  long lVar33;
  long lVar34;
  long lVar35;
  long lVar36;
  long lVar37;
  long lVar38;
  long lVar39;
  long lVar40;
  long lVar41;
  long lVar42;
  long lVar43;
  long lVar44;
  long lVar45;
  long lVar46;
  long lVar47;
  long lVar48;
  long lVar49;
  long lVar50;
  long lVar51;
  long lVar52;
  byte bVar54;
  byte bVar55;
  byte bVar56;
  long lVar53;
  byte bVar57;
  byte bVar60;
  byte bVar61;
  undefined8 uVar58;
  long lVar59;
  byte bVar62;
  byte bVar64;
  undefined8 uVar63;
  byte bVar65;
  byte bVar67;
  undefined8 uVar66;
  byte bVar68;
  undefined8 local_c0;
  ulong local_b8;
  void *local_b0;
  long local_a8;
  
  lVar4 = tpidr_el0;
  local_a8 = *(long *)(lVar4 + 0x28);
  lVar14 = *(long *)(param_2 + 0x28);
  if (lVar14 == 0) {
    uVar16 = 0;
  }
  else {
    puVar18 = *(undefined8 **)(param_2 + 0x20);
    uVar16 = 0;
    puVar1 = puVar18 + lVar14 * 2;
    do {
      uVar19 = puVar18[1];
      if (uVar19 == 0) {
        lVar22 = 0;
      }
      else {
        pcVar20 = (char *)*puVar18;
        if (uVar19 < 8) {
          lVar22 = 0;
          pcVar12 = pcVar20;
        }
        else {
          if (uVar19 < 0x20) {
            uVar17 = 0;
            lVar22 = 0;
          }
          else {
            lVar52 = 0;
            lVar53 = 0;
            lVar30 = 0;
            lVar31 = 0;
            uVar17 = uVar19 & 0xffffffffffffffe0;
            lVar22 = 0;
            lVar8 = 0;
            lVar36 = 0;
            lVar37 = 0;
            pcVar12 = pcVar20 + 0x10;
            lVar26 = 0;
            lVar27 = 0;
            lVar28 = 0;
            lVar29 = 0;
            lVar11 = 0;
            lVar25 = 0;
            lVar44 = 0;
            lVar45 = 0;
            lVar34 = 0;
            lVar35 = 0;
            lVar46 = 0;
            lVar47 = 0;
            lVar32 = 0;
            lVar33 = 0;
            lVar48 = 0;
            lVar49 = 0;
            lVar40 = 0;
            lVar41 = 0;
            lVar42 = 0;
            lVar43 = 0;
            lVar38 = 0;
            lVar39 = 0;
            lVar50 = 0;
            lVar51 = 0;
            uVar9 = uVar17;
            do {
              uVar58 = *(undefined8 *)(pcVar12 + -8);
              uVar7 = *(undefined8 *)(pcVar12 + -0x10);
              uVar66 = *(undefined8 *)(pcVar12 + 8);
              uVar63 = *(undefined8 *)pcVar12;
              uVar9 = uVar9 - 0x20;
              pcVar12 = pcVar12 + 0x20;
              bVar54 = -((char)((ulong)uVar7 >> 8) == '%');
              bVar55 = -((char)((ulong)uVar7 >> 0x18) == '%');
              bVar56 = -((char)((ulong)uVar7 >> 0x28) == '%');
              bVar57 = -((char)((ulong)uVar7 >> 0x38) == '%');
              bVar60 = -((char)((ulong)uVar58 >> 8) == '%');
              bVar61 = -((char)((ulong)uVar58 >> 0x28) == '%');
              bVar62 = -((char)((ulong)uVar58 >> 0x38) == '%');
              bVar64 = -((char)((ulong)uVar63 >> 0x18) == '%');
              bVar65 = -((char)((ulong)uVar63 >> 0x38) == '%');
              bVar67 = -((char)((ulong)uVar66 >> 0x18) == '%');
              bVar68 = -((char)((ulong)uVar66 >> 0x38) == '%');
              lVar44 = lVar44 + ((ulong)CONCAT14(bVar62,(uint)(byte)-((char)((ulong)uVar58 >> 0x30)
                                                                     == '%')) & 0xffffff01);
              lVar45 = lVar45 + ((ulong)bVar62 & 0xffffff01);
              lVar36 = lVar36 + ((ulong)CONCAT14(bVar57,(uint)(byte)-((char)((ulong)uVar7 >> 0x30)
                                                                     == '%')) & 0xffffff01);
              lVar37 = lVar37 + ((ulong)bVar57 & 0xffffff01);
              lVar11 = lVar11 + ((ulong)((uint6)CONCAT14(bVar61,(uint)CONCAT12(bVar61,(ushort)(byte)
                                                  -((char)((ulong)uVar58 >> 0x20) == '%'))) &
                                        0xffff0000ffff) & 0xffffff01);
              lVar25 = lVar25 + ((ulong)bVar61 & 0xffffff01);
              lVar28 = lVar28 + (ulong)(-((char)((ulong)uVar58 >> 0x10) == '%') & 1);
              lVar29 = lVar29 + (ulong)(-((char)((ulong)uVar58 >> 0x18) == '%') & 1);
              lVar26 = lVar26 + ((ulong)((uint6)CONCAT14(bVar60,(uint)CONCAT12(bVar60,(ushort)(byte)
                                                  -((char)uVar58 == '%'))) & 0xffff0000ffff) &
                                0xffffff01);
              lVar27 = lVar27 + ((ulong)bVar60 & 0xffffff01);
              lVar22 = lVar22 + ((ulong)((uint6)CONCAT14(bVar56,(uint)CONCAT12(bVar56,(ushort)(byte)
                                                  -((char)((ulong)uVar7 >> 0x20) == '%'))) &
                                        0xffff0000ffff) & 0xffffff01);
              lVar8 = lVar8 + ((ulong)bVar56 & 0xffffff01);
              lVar30 = lVar30 + ((ulong)CONCAT14(bVar55,(uint)(byte)-((char)((ulong)uVar7 >> 0x10)
                                                                     == '%')) & 0xffffff01);
              lVar31 = lVar31 + ((ulong)bVar55 & 0xffffff01);
              lVar52 = lVar52 + ((ulong)((uint6)CONCAT14(bVar54,(uint)CONCAT12(bVar54,(ushort)(byte)
                                                  -((char)uVar7 == '%'))) & 0xffff0000ffff) &
                                0xffffff01);
              lVar53 = lVar53 + ((ulong)bVar54 & 0xffffff01);
              lVar50 = lVar50 + ((ulong)CONCAT14(bVar68,(uint)(byte)-((char)((ulong)uVar66 >> 0x30)
                                                                     == '%')) & 0xffffff01);
              lVar51 = lVar51 + ((ulong)bVar68 & 0xffffff01);
              lVar38 = lVar38 + (ulong)(-((char)((ulong)uVar66 >> 0x20) == '%') & 1);
              lVar39 = lVar39 + (ulong)(-((char)((ulong)uVar66 >> 0x28) == '%') & 1);
              lVar42 = lVar42 + ((ulong)CONCAT14(bVar67,(uint)(byte)-((char)((ulong)uVar66 >> 0x10)
                                                                     == '%')) & 0xffffff01);
              lVar43 = lVar43 + ((ulong)bVar67 & 0xffffff01);
              lVar48 = lVar48 + ((ulong)CONCAT14(bVar65,(uint)(byte)-((char)((ulong)uVar63 >> 0x30)
                                                                     == '%')) & 0xffffff01);
              lVar49 = lVar49 + ((ulong)bVar65 & 0xffffff01);
              lVar40 = lVar40 + (ulong)(-((char)uVar66 == '%') & 1);
              lVar41 = lVar41 + (ulong)(-((char)((ulong)uVar66 >> 8) == '%') & 1);
              lVar32 = lVar32 + (ulong)(-((char)((ulong)uVar63 >> 0x20) == '%') & 1);
              lVar33 = lVar33 + (ulong)(-((char)((ulong)uVar63 >> 0x28) == '%') & 1);
              lVar46 = lVar46 + ((ulong)CONCAT14(bVar64,(uint)(byte)-((char)((ulong)uVar63 >> 0x10)
                                                                     == '%')) & 0xffffff01);
              lVar47 = lVar47 + ((ulong)bVar64 & 0xffffff01);
              lVar34 = lVar34 + (ulong)(-((char)uVar63 == '%') & 1);
              lVar35 = lVar35 + (ulong)(-((char)((ulong)uVar63 >> 8) == '%') & 1);
            } while (uVar9 != 0);
            lVar22 = lVar34 + lVar52 + lVar40 + lVar26 + lVar32 + lVar22 + lVar38 + lVar11 +
                     lVar46 + lVar30 + lVar42 + lVar28 + lVar48 + lVar36 + lVar50 + lVar44 +
                     lVar35 + lVar53 + lVar41 + lVar27 + lVar33 + lVar8 + lVar39 + lVar25 +
                     lVar47 + lVar31 + lVar43 + lVar29 + lVar49 + lVar37 + lVar51 + lVar45;
            if (uVar19 == uVar17) goto LAB_00890874;
            if ((uVar19 & 0x18) == 0) {
              pcVar12 = pcVar20 + uVar17;
              goto LAB_00890b1c;
            }
          }
          lVar11 = 0;
          lVar25 = 0;
          lVar26 = 0;
          lVar27 = 0;
          lVar28 = 0;
          lVar29 = 0;
          lVar30 = 0;
          uVar9 = uVar19 & 0xfffffffffffffff8;
          pcVar12 = pcVar20 + uVar9;
          lVar8 = uVar17 - uVar9;
          pcVar21 = pcVar20 + uVar17;
          do {
            uVar7 = *(undefined8 *)pcVar21;
            lVar8 = lVar8 + 8;
            lVar29 = lVar29 + (ulong)(-((char)((ulong)uVar7 >> 0x30) == '%') & 1);
            lVar30 = lVar30 + (ulong)(-((char)((ulong)uVar7 >> 0x38) == '%') & 1);
            lVar25 = lVar25 + (ulong)(-((char)((ulong)uVar7 >> 0x10) == '%') & 1);
            lVar26 = lVar26 + (ulong)(-((char)((ulong)uVar7 >> 0x18) == '%') & 1);
            lVar22 = lVar22 + (ulong)(-((char)uVar7 == '%') & 1);
            lVar11 = lVar11 + (ulong)(-((char)((ulong)uVar7 >> 8) == '%') & 1);
            lVar27 = lVar27 + (ulong)(-((char)((ulong)uVar7 >> 0x20) == '%') & 1);
            lVar28 = lVar28 + (ulong)(-((char)((ulong)uVar7 >> 0x28) == '%') & 1);
            pcVar21 = pcVar21 + 8;
          } while (lVar8 != 0);
          lVar22 = lVar22 + lVar27 + lVar25 + lVar29 + lVar11 + lVar28 + lVar26 + lVar30;
          if (uVar19 == uVar9) goto LAB_00890874;
        }
LAB_00890b1c:
        do {
          pcVar21 = pcVar12 + 1;
          if (*pcVar12 == '%') {
            lVar22 = lVar22 + 1;
          }
          pcVar12 = pcVar21;
        } while (pcVar21 != pcVar20 + uVar19);
      }
LAB_00890874:
      puVar18 = puVar18 + 2;
      uVar16 = uVar19 + uVar16 + lVar22;
    } while (puVar18 != puVar1);
  }
  iVar23 = 0;
  if (*(long *)(param_2 + 0x38) != 0) {
    lVar22 = 0;
    iVar23 = 0;
    do {
      if (param_1[0x2e] != 0) {
        uVar19 = *(ulong *)(*(long *)(param_2 + 0x30) + lVar22 * 8);
        uVar9 = ((ulong)(uint)((int)uVar19 << 3) + 8 ^ uVar19 >> 0x20) * -0x622015f714c7d297;
        uVar9 = (uVar19 >> 0x20 ^ uVar9 >> 0x2f ^ uVar9) * -0x622015f714c7d297;
        uVar9 = (uVar9 ^ uVar9 >> 0x2f) * -0x6b622cb0470b6a63 >>
                ((ulong)*(byte *)(param_1 + 0x2f) & 0x3f);
        if ((*(ulong *)(param_1[0x2c] + (uVar9 >> 6) * 8) >> (uVar9 & 0x3f) & 1) != 0) {
LAB_00890bf4:
          puVar10 = (ulong *)(param_1[0x29] + uVar9 * 0x30);
          if (*puVar10 != uVar19) goto code_r0x00890c04;
          if ((int)puVar10[1] == 6) {
            uVar3 = *(uint *)((long)puVar10 + 0xc);
            uVar19 = (ulong)uVar3;
            if (uVar3 == 0) {
              lVar8 = 0;
              goto LAB_00890ee4;
            }
            pcVar20 = (char *)puVar10[2];
            if (uVar3 < 8) {
              lVar8 = 0;
              pcVar12 = pcVar20;
              goto LAB_00890ecc;
            }
            if (uVar3 < 0x20) {
              uVar9 = 0;
              lVar8 = 0;
              goto LAB_00890e38;
            }
            lVar53 = 0;
            lVar59 = 0;
            lVar31 = 0;
            lVar32 = 0;
            lVar8 = 0;
            lVar11 = 0;
            lVar37 = 0;
            lVar38 = 0;
            uVar9 = uVar19 & 0xffffffe0;
            lVar27 = 0;
            lVar28 = 0;
            lVar29 = 0;
            lVar30 = 0;
            pcVar12 = pcVar20 + 0x10;
            lVar25 = 0;
            lVar26 = 0;
            lVar45 = 0;
            lVar46 = 0;
            lVar35 = 0;
            lVar36 = 0;
            lVar47 = 0;
            lVar48 = 0;
            lVar33 = 0;
            lVar34 = 0;
            lVar49 = 0;
            lVar50 = 0;
            lVar41 = 0;
            lVar42 = 0;
            lVar43 = 0;
            lVar44 = 0;
            lVar39 = 0;
            lVar40 = 0;
            lVar51 = 0;
            lVar52 = 0;
            uVar17 = uVar9;
            do {
              uVar58 = *(undefined8 *)(pcVar12 + -8);
              uVar7 = *(undefined8 *)(pcVar12 + -0x10);
              uVar66 = *(undefined8 *)(pcVar12 + 8);
              uVar63 = *(undefined8 *)pcVar12;
              uVar17 = uVar17 - 0x20;
              pcVar12 = pcVar12 + 0x20;
              bVar54 = -((char)((ulong)uVar7 >> 8) == '%');
              bVar55 = -((char)((ulong)uVar7 >> 0x18) == '%');
              bVar56 = -((char)((ulong)uVar7 >> 0x28) == '%');
              bVar57 = -((char)((ulong)uVar7 >> 0x38) == '%');
              bVar60 = -((char)((ulong)uVar58 >> 8) == '%');
              bVar61 = -((char)((ulong)uVar58 >> 0x28) == '%');
              bVar62 = -((char)((ulong)uVar58 >> 0x38) == '%');
              bVar64 = -((char)((ulong)uVar63 >> 0x18) == '%');
              bVar65 = -((char)((ulong)uVar63 >> 0x38) == '%');
              bVar67 = -((char)((ulong)uVar66 >> 0x18) == '%');
              bVar68 = -((char)((ulong)uVar66 >> 0x38) == '%');
              lVar45 = lVar45 + ((ulong)CONCAT14(bVar62,(uint)(byte)-((char)((ulong)uVar58 >> 0x30)
                                                                     == '%')) & 0xffffff01);
              lVar46 = lVar46 + ((ulong)bVar62 & 0xffffff01);
              lVar37 = lVar37 + ((ulong)CONCAT14(bVar57,(uint)(byte)-((char)((ulong)uVar7 >> 0x30)
                                                                     == '%')) & 0xffffff01);
              lVar38 = lVar38 + ((ulong)bVar57 & 0xffffff01);
              lVar25 = lVar25 + ((ulong)((uint6)CONCAT14(bVar61,(uint)CONCAT12(bVar61,(ushort)(byte)
                                                  -((char)((ulong)uVar58 >> 0x20) == '%'))) &
                                        0xffff0000ffff) & 0xffffff01);
              lVar26 = lVar26 + ((ulong)bVar61 & 0xffffff01);
              lVar29 = lVar29 + (ulong)(-((char)((ulong)uVar58 >> 0x10) == '%') & 1);
              lVar30 = lVar30 + (ulong)(-((char)((ulong)uVar58 >> 0x18) == '%') & 1);
              lVar27 = lVar27 + ((ulong)((uint6)CONCAT14(bVar60,(uint)CONCAT12(bVar60,(ushort)(byte)
                                                  -((char)uVar58 == '%'))) & 0xffff0000ffff) &
                                0xffffff01);
              lVar28 = lVar28 + ((ulong)bVar60 & 0xffffff01);
              lVar8 = lVar8 + ((ulong)((uint6)CONCAT14(bVar56,(uint)CONCAT12(bVar56,(ushort)(byte)-(
                                                  (char)((ulong)uVar7 >> 0x20) == '%'))) &
                                      0xffff0000ffff) & 0xffffff01);
              lVar11 = lVar11 + ((ulong)bVar56 & 0xffffff01);
              lVar31 = lVar31 + ((ulong)CONCAT14(bVar55,(uint)(byte)-((char)((ulong)uVar7 >> 0x10)
                                                                     == '%')) & 0xffffff01);
              lVar32 = lVar32 + ((ulong)bVar55 & 0xffffff01);
              lVar53 = lVar53 + ((ulong)((uint6)CONCAT14(bVar54,(uint)CONCAT12(bVar54,(ushort)(byte)
                                                  -((char)uVar7 == '%'))) & 0xffff0000ffff) &
                                0xffffff01);
              lVar59 = lVar59 + ((ulong)bVar54 & 0xffffff01);
              lVar51 = lVar51 + ((ulong)CONCAT14(bVar68,(uint)(byte)-((char)((ulong)uVar66 >> 0x30)
                                                                     == '%')) & 0xffffff01);
              lVar52 = lVar52 + ((ulong)bVar68 & 0xffffff01);
              lVar39 = lVar39 + (ulong)(-((char)((ulong)uVar66 >> 0x20) == '%') & 1);
              lVar40 = lVar40 + (ulong)(-((char)((ulong)uVar66 >> 0x28) == '%') & 1);
              lVar43 = lVar43 + ((ulong)CONCAT14(bVar67,(uint)(byte)-((char)((ulong)uVar66 >> 0x10)
                                                                     == '%')) & 0xffffff01);
              lVar44 = lVar44 + ((ulong)bVar67 & 0xffffff01);
              lVar49 = lVar49 + ((ulong)CONCAT14(bVar65,(uint)(byte)-((char)((ulong)uVar63 >> 0x30)
                                                                     == '%')) & 0xffffff01);
              lVar50 = lVar50 + ((ulong)bVar65 & 0xffffff01);
              lVar41 = lVar41 + (ulong)(-((char)uVar66 == '%') & 1);
              lVar42 = lVar42 + (ulong)(-((char)((ulong)uVar66 >> 8) == '%') & 1);
              lVar33 = lVar33 + (ulong)(-((char)((ulong)uVar63 >> 0x20) == '%') & 1);
              lVar34 = lVar34 + (ulong)(-((char)((ulong)uVar63 >> 0x28) == '%') & 1);
              lVar47 = lVar47 + ((ulong)CONCAT14(bVar64,(uint)(byte)-((char)((ulong)uVar63 >> 0x10)
                                                                     == '%')) & 0xffffff01);
              lVar48 = lVar48 + ((ulong)bVar64 & 0xffffff01);
              lVar35 = lVar35 + (ulong)(-((char)uVar63 == '%') & 1);
              lVar36 = lVar36 + (ulong)(-((char)((ulong)uVar63 >> 8) == '%') & 1);
            } while (uVar17 != 0);
            lVar8 = lVar35 + lVar53 + lVar41 + lVar27 + lVar33 + lVar8 + lVar39 + lVar25 +
                    lVar47 + lVar31 + lVar43 + lVar29 + lVar49 + lVar37 + lVar51 + lVar45 +
                    lVar36 + lVar59 + lVar42 + lVar28 + lVar34 + lVar11 + lVar40 + lVar26 +
                    lVar48 + lVar32 + lVar44 + lVar30 + lVar50 + lVar38 + lVar52 + lVar46;
            if (uVar9 != uVar19) {
              if ((uVar3 & 0x18) == 0) {
                pcVar12 = pcVar20 + uVar9;
              }
              else {
LAB_00890e38:
                lVar25 = 0;
                lVar26 = 0;
                lVar27 = 0;
                lVar28 = 0;
                lVar29 = 0;
                lVar30 = 0;
                lVar31 = 0;
                uVar17 = uVar19 & 0xfffffff8;
                pcVar12 = pcVar20 + uVar17;
                lVar11 = uVar9 - uVar17;
                pcVar21 = pcVar20 + uVar9;
                do {
                  uVar7 = *(undefined8 *)pcVar21;
                  lVar11 = lVar11 + 8;
                  lVar30 = lVar30 + (ulong)(-((char)((ulong)uVar7 >> 0x30) == '%') & 1);
                  lVar31 = lVar31 + (ulong)(-((char)((ulong)uVar7 >> 0x38) == '%') & 1);
                  lVar26 = lVar26 + (ulong)(-((char)((ulong)uVar7 >> 0x10) == '%') & 1);
                  lVar27 = lVar27 + (ulong)(-((char)((ulong)uVar7 >> 0x18) == '%') & 1);
                  lVar8 = lVar8 + (ulong)(-((char)uVar7 == '%') & 1);
                  lVar25 = lVar25 + (ulong)(-((char)((ulong)uVar7 >> 8) == '%') & 1);
                  lVar28 = lVar28 + (ulong)(-((char)((ulong)uVar7 >> 0x20) == '%') & 1);
                  lVar29 = lVar29 + (ulong)(-((char)((ulong)uVar7 >> 0x28) == '%') & 1);
                  pcVar21 = pcVar21 + 8;
                } while (lVar11 != 0);
                lVar8 = lVar8 + lVar28 + lVar26 + lVar30 + lVar25 + lVar29 + lVar27 + lVar31;
                if (uVar17 == uVar19) goto LAB_00890ee4;
              }
LAB_00890ecc:
              do {
                pcVar21 = pcVar12 + 1;
                if (*pcVar12 == '%') {
                  lVar8 = lVar8 + 1;
                }
                pcVar12 = pcVar21;
              } while (pcVar21 != pcVar20 + uVar19);
            }
LAB_00890ee4:
            lVar8 = lVar8 + uVar19;
            iVar23 = iVar23 + 1;
            goto LAB_00890b9c;
          }
        }
      }
LAB_00890b98:
      lVar8 = 2;
LAB_00890b9c:
      lVar22 = lVar22 + 1;
      uVar16 = lVar8 + uVar16;
    } while (lVar22 != *(long *)(param_2 + 0x38));
  }
  local_c0 = 0;
  local_b8 = 0;
  local_b0 = (void *)0x0;
  if (0xfffffffffffffff7 < uVar16) {
    if (*(long *)(lVar4 + 0x28) == local_a8) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00891354 to 00891357 has its CatchHandler @ 008913d4 */
      FUN_007fe124();
    }
    goto LAB_00891434;
  }
  if (0x16 < uVar16) {
    uVar19 = 0x19;
    if ((uVar16 | 7) != 0x17) {
      uVar19 = uVar16 | 7;
    }
                    /* try { // try from 00890f18 to 00890f1f has its CatchHandler @ 008913d4 */
    FUN_00879ca4(&local_c0,uVar19);
    lVar14 = *(long *)(param_2 + 0x28);
  }
  if (lVar14 != 0) {
    uVar16 = 0;
    do {
      puVar18 = (undefined8 *)(*(long *)(param_2 + 0x20) + uVar16 * 0x10);
                    /* try { // try from 00890f68 to 00890f6f has its CatchHandler @ 008913fc */
      FUN_0087fb04(&local_c0,*puVar18,puVar18[1]);
      if (uVar16 < *(ulong *)(param_2 + 0x38)) {
        if (param_1[0x2e] != 0) {
          uVar19 = *(ulong *)(*(long *)(param_2 + 0x30) + uVar16 * 8);
          uVar9 = ((ulong)(uint)((int)uVar19 << 3) + 8 ^ uVar19 >> 0x20) * -0x622015f714c7d297;
          uVar9 = (uVar19 >> 0x20 ^ uVar9 >> 0x2f ^ uVar9) * -0x622015f714c7d297;
          uVar9 = (uVar9 ^ uVar9 >> 0x2f) * -0x6b622cb0470b6a63 >>
                  ((ulong)*(byte *)(param_1 + 0x2f) & 0x3f);
          if ((*(ulong *)(param_1[0x2c] + (uVar9 >> 6) * 8) >> (uVar9 & 0x3f) & 1) != 0) {
            do {
              puVar10 = (ulong *)(param_1[0x29] + uVar9 * 0x30);
              if (*puVar10 == uVar19) {
                if ((int)puVar10[1] == 6) {
                    /* try { // try from 0089101c to 00891023 has its CatchHandler @ 008913e4 */
                  FUN_0087fb04(&local_c0,puVar10[2],*(undefined4 *)((long)puVar10 + 0xc));
                  goto LAB_00890f4c;
                }
                break;
              }
              uVar9 = uVar9 + 1 & param_1[0x2d] - 1;
            } while ((*(ulong *)(param_1[0x2c] + (uVar9 >> 6) * 8) >> (uVar9 & 0x3f) & 1) != 0);
          }
        }
                    /* try { // try from 00890f40 to 00890f4b has its CatchHandler @ 008913e4 */
        std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
        ::append((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
                 &local_c0,"%*");
      }
LAB_00890f4c:
      uVar16 = uVar16 + 1;
    } while (uVar16 < *(ulong *)(param_2 + 0x28));
  }
  uVar16 = local_c0 >> 1 & 0x7f;
  if ((local_c0 & 1) != 0) {
    uVar16 = local_b8;
  }
  if (uVar16 == 0) {
                    /* try { // try from 00891084 to 0089108f has its CatchHandler @ 008913d0 */
    uVar16 = FUN_00875070(*param_1,&DAT_002ab32c);
  }
  else {
    pvVar2 = local_b0;
    if ((local_c0 & 1) == 0) {
      pvVar2 = (void *)((long)&local_c0 + 1);
    }
                    /* try { // try from 00891054 to 0089105b has its CatchHandler @ 008913cc */
    uVar7 = FUN_008530cc(param_1[199],pvVar2);
    uVar16 = local_c0 >> 1 & 0x7f;
    if ((local_c0 & 1) != 0) {
      uVar16 = local_b8;
    }
                    /* try { // try from 00891078 to 0089107b has its CatchHandler @ 008913c8 */
    uVar16 = FUN_00875070(*param_1,uVar7,uVar16);
  }
  uVar19 = uVar16 & 0xffffffff;
  if ((int)uVar16 < 0) {
    if (*(long *)(lVar4 + 0x28) == local_a8) {
                    /* try { // try from 0089136c to 0089137b has its CatchHandler @ 008913d0 */
                    /* WARNING: Subroutine does not return */
      FUN_0087fcd8(param_2 + 0xc,"Exceeded constant limit; simplify the code to compile");
    }
    goto LAB_00891434;
  }
  uVar3 = *(uint *)((long)param_1 + 0x64c);
  iVar5 = *(int *)(param_2 + 0x38) - iVar23;
  if (((param_4 & 1) == 0) || (uVar3 - 1 != (param_3 & 0xff))) {
    iVar5 = iVar5 + 2;
    uVar13 = iVar5 + uVar3;
    if (0xff < uVar13) goto LAB_0089137c;
    uVar15 = *(uint *)(param_1 + 0xca);
    *(uint *)((long)param_1 + 0x64c) = uVar13;
    uVar24 = uVar3;
  }
  else {
    iVar5 = iVar5 + 1;
    uVar13 = iVar5 + uVar3;
    if (0xff < uVar13) {
LAB_0089137c:
      if (*(long *)(lVar4 + 0x28) == local_a8) {
                    /* try { // try from 00891390 to 008913a3 has its CatchHandler @ 008913d8 */
                    /* WARNING: Subroutine does not return */
        FUN_0087fcd8(param_2 + 0xc,
                     "Out of registers when trying to allocate %d registers: exceeded limit %d",
                     iVar5,0xff);
      }
      goto LAB_00891434;
    }
    uVar15 = *(uint *)(param_1 + 0xca);
    *(uint *)((long)param_1 + 0x64c) = uVar13;
    uVar24 = uVar3 - 1;
  }
  if (uVar15 <= uVar13) {
    uVar15 = uVar13;
  }
  *(uint *)(param_1 + 0xca) = uVar15;
  if ((int)(uVar19 >> 0xf) == 0) {
                    /* try { // try from 00891114 to 00891143 has its CatchHandler @ 008913d8 */
    FUN_00875cac(*param_1,5,uVar24,uVar19);
  }
  else {
    FUN_00875cac(*param_1,0x42,uVar24,0);
    FUN_00875d18(*param_1,uVar19);
  }
  uVar16 = *(ulong *)(param_2 + 0x38);
  if (uVar16 != 0) {
    uVar19 = 0;
    iVar5 = 0;
    do {
      uVar9 = *(ulong *)(*(long *)(param_2 + 0x30) + uVar19 * 8);
      if (param_1[0x2e] != 0) {
        uVar17 = ((ulong)(uint)((int)uVar9 << 3) + 8 ^ uVar9 >> 0x20) * -0x622015f714c7d297;
        uVar17 = (uVar9 >> 0x20 ^ uVar17 >> 0x2f ^ uVar17) * -0x622015f714c7d297;
        uVar17 = (uVar17 ^ uVar17 >> 0x2f) * -0x6b622cb0470b6a63 >>
                 ((ulong)*(byte *)(param_1 + 0x2f) & 0x3f);
        if ((*(ulong *)(param_1[0x2c] + (uVar17 >> 6) * 8) >> (uVar17 & 0x3f) & 1) != 0) {
          do {
            puVar10 = (ulong *)(param_1[0x29] + uVar17 * 0x30);
            if (*puVar10 == uVar9) {
              if ((int)puVar10[1] == 6) {
                iVar5 = iVar5 + 1;
                goto LAB_00891168;
              }
              break;
            }
            uVar17 = uVar17 + 1 & param_1[0x2d] - 1;
          } while ((*(ulong *)(param_1[0x2c] + (uVar17 >> 6) * 8) >> (uVar17 & 0x3f) & 1) != 0);
        }
      }
      uVar6 = *(undefined4 *)((long)param_1 + 0x64c);
      uVar13 = (((uVar24 & 0xff) + 2) - iVar5) + (int)uVar19;
      *(uint *)((long)param_1 + 0x64c) = (uVar13 & 0xff) + 1;
                    /* try { // try from 00891224 to 0089122f has its CatchHandler @ 008913e8 */
      FUN_0088d1d0(param_1,uVar9,uVar13,1);
      uVar16 = *(ulong *)(param_2 + 0x38);
      *(undefined4 *)((long)param_1 + 0x64c) = uVar6;
LAB_00891168:
      uVar19 = uVar19 + 1;
    } while (uVar19 < uVar16);
  }
                    /* try { // try from 00891240 to 008912df has its CatchHandler @ 008913dc */
  iVar5 = FUN_00875070(*param_1,"format",6);
  if (iVar5 < 0) {
    if (*(long *)(lVar4 + 0x28) == local_a8) {
                    /* try { // try from 008913b8 to 008913c7 has its CatchHandler @ 008913dc */
                    /* WARNING: Subroutine does not return */
      FUN_0087fcd8(param_2 + 0xc,"Exceeded constant limit; simplify the code to compile");
    }
  }
  else {
    uVar7 = *param_1;
    uVar6 = FUN_00877e08("format",6);
    FUN_00875b54(uVar7,0x14,uVar24,uVar24,uVar6);
    FUN_00875d18(*param_1,iVar5);
    FUN_00875b54(*param_1,0x15,uVar24,(*(int *)(param_2 + 0x38) - iVar23) + 2,2);
    if ((param_3 & 0xff) != (uVar24 & 0xff)) {
      FUN_00875b54(*param_1,6,param_3,uVar24,0);
    }
    *(uint *)((long)param_1 + 0x64c) = uVar3;
    if ((local_c0 & 1) != 0) {
      operator_delete(local_b0,local_c0 & 0xfffffffffffffffe);
    }
    if (*(long *)(lVar4 + 0x28) == local_a8) {
      return;
    }
  }
LAB_00891434:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
code_r0x00890c04:
  uVar9 = uVar9 + 1 & param_1[0x2d] - 1;
  if ((*(ulong *)(param_1[0x2c] + (uVar9 >> 6) * 8) >> (uVar9 & 0x3f) & 1) == 0) goto LAB_00890b98;
  goto LAB_00890bf4;
}

