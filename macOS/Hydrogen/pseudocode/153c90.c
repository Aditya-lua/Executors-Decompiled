
/* WARNING: Type propagation algorithm not settling */

undefined *
FUN_00153c90(undefined8 *param_1,undefined8 param_2,undefined8 param_3,undefined8 *param_4,
            ulong *param_5,undefined8 *param_6)

{
  long lVar1;
  long lVar2;
  long lVar3;
  ushort *puVar4;
  ushort *puVar5;
  ushort *puVar6;
  undefined4 *puVar7;
  uint uVar8;
  byte bVar9;
  byte bVar10;
  byte bVar11;
  int iVar12;
  undefined1 in_CY;
  bool bVar13;
  undefined8 *puVar14;
  long *plVar15;
  ulong uVar16;
  ulong uVar17;
  undefined *puVar18;
  ulong *puVar19;
  ulong uVar20;
  undefined1 *puVar21;
  ulong uVar22;
  undefined8 *puVar23;
  long lVar24;
  undefined8 *puVar25;
  undefined8 *puVar26;
  int iVar27;
  ulong *puVar28;
  undefined1 *puVar29;
  ulong uVar30;
  undefined8 *puVar31;
  ulong *puVar32;
  uint uVar33;
  undefined *puVar34;
  undefined1 *puVar35;
  long lVar36;
  ulong uVar37;
  undefined *puVar38;
  undefined1 *puVar39;
  uint unaff_w19;
  undefined8 *puVar40;
  undefined8 *unaff_x20;
  undefined *unaff_x21;
  long lVar41;
  undefined8 *puVar42;
  undefined8 *puVar43;
  int iVar44;
  undefined *unaff_x24;
  long unaff_x25;
  undefined8 *puVar45;
  undefined8 *unaff_x26;
  int iVar46;
  undefined8 *unaff_x27;
  undefined8 *unaff_x28;
  ulong uVar47;
  long unaff_x29;
  undefined8 uVar48;
  ulong uVar49;
  undefined8 uVar50;
  undefined8 uVar51;
  undefined8 uVar52;
  undefined8 uVar53;
  undefined8 uVar54;
  undefined8 uVar55;
  undefined1 auVar56 [16];
  long in_stack_00000020;
  long in_stack_00000038;
  undefined8 in_stack_00000050;
  undefined8 *in_stack_00000060;
  undefined8 *in_stack_00000068;
  long in_stack_00000070;
  long in_stack_00000078;
  undefined8 *in_stack_00000080;
  undefined8 *in_stack_00000090;
  undefined8 *in_stack_00000098;
  undefined8 *in_stack_000000a0;
  undefined *in_stack_000000a8;
  undefined4 in_stack_00000108;
  undefined4 in_stack_00000110;
  undefined4 in_stack_00000118;
  ulong uStack0000000000000120;
  ulong uStack0000000000000128;
  undefined8 *in_stack_00000130;
  undefined8 *in_stack_00000138;
  ulong uStack_f8;
  uint uStack_f0;
  ulong *puStack_e8;
  ulong uStack_d0;
  ulong uStack_c0;
  ulong uStack_b0;
  ulong auStack_a0 [3];
  undefined8 *puStack_88;
  ulong uStack_80;
  ulong uStack_78;
  ulong uStack_70;
  undefined8 *puStack_60;
  undefined8 *puStack_58;
  undefined8 *puStack_50;
  long lStack_48;
  undefined *puStack_40;
  undefined8 uStack_38;
  undefined8 *puStack_30;
  
  do {
    param_4 = param_4;
    puVar45 = unaff_x26;
    puVar31 = unaff_x28;
    puVar14 = in_stack_00000080;
    uVar20 = uStack0000000000000128;
    if ((bool)in_CY) {
      puVar40 = param_1 + 1;
      puVar43 = unaff_x20 + 1;
      if ((long)puVar43 - (long)puVar40 < 0x10) {
        do {
          puVar42 = puVar43 + 1;
          *puVar43 = *puVar40;
          puVar40 = puVar40 + 1;
          puVar43 = puVar42;
          param_4 = param_4;
        } while (puVar42 < (undefined8 *)((long)unaff_x20 + (long)unaff_x28));
      }
      else {
        uVar48 = *puVar40;
        unaff_x20[2] = param_1[2];
        *puVar43 = uVar48;
        param_4 = param_4;
        if (&MACH_HEADER.ncmds < unaff_x28 + -1) {
          puVar40 = unaff_x20 + 3;
          puVar43 = param_1 + 5;
          do {
            uVar48 = puVar43[-2];
            puVar40[1] = puVar43[-1];
            *puVar40 = uVar48;
            uVar48 = *puVar43;
            puVar40[3] = puVar43[1];
            puVar40[2] = uVar48;
            puVar40 = puVar40 + 4;
            puVar43 = puVar43 + 4;
            param_4 = param_4;
          } while (puVar40 < (undefined8 *)((long)unaff_x20 + (long)unaff_x28));
        }
      }
    }
joined_r0x001537bc:
    in_stack_00000080 = param_4;
    uVar22 = (ulong)in_stack_00000050._4_4_;
    uStack0000000000000128 = uVar20;
    if ((undefined *)0xffffffffffffff88 < unaff_x24) {
code_r0x00153e60:
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
        return unaff_x24;
      }
      auVar56 = ___stack_chk_fail();
      puVar14 = auVar56._8_8_;
      plVar15 = auVar56._0_8_;
      puStack_60 = puVar31;
      puStack_58 = unaff_x27;
      puStack_50 = puVar45;
      lStack_48 = unaff_x25;
      puStack_40 = unaff_x24;
      uStack_38 = 0x18;
      puStack_30 = in_stack_00000068;
      puVar21 = (undefined1 *)
                ((long)puVar14 +
                ((ulong)in_stack_00000080 & ((long)in_stack_00000080 >> 0x3f ^ 0xffffffffffffffffU))
                );
      puStack_88 = (undefined8 *)plVar15[0xeb5];
      puVar45 = (undefined8 *)plVar15[0xed3];
      puVar31 = puVar14;
      if ((int)uVar22 == 0) {
        iVar27 = (int)plVar15[0xed4];
        puVar40 = (undefined8 *)plVar15[0xeb5];
        goto joined_r0x00153fc8;
      }
      puVar40 = (undefined8 *)plVar15[0xe99];
      lVar24 = plVar15[0xe9a];
      uVar20 = plVar15[0xe9b];
      *(undefined4 *)((long)plVar15 + 0x7534) = 1;
      uVar49 = *(ulong *)((long)plVar15 + 0x683c);
      auStack_a0[1] = uVar49 >> 0x20;
      auStack_a0[0] = uVar49 & 0xffffffff;
      auStack_a0[2] = (ulong)*(uint *)((long)plVar15 + 0x6844);
      if (param_6 == (undefined8 *)0x0) {
        return (undefined1 *)0xffffffffffffffec;
      }
      puVar19 = param_5 + 1;
      puVar43 = param_6 + -1;
      if (param_6 < &MACH_HEADER.cpusubtype) {
        uStack_f8 = (ulong)(byte)*param_5;
        switch(param_6) {
        case (undefined8 *)0x7:
          uStack_f8 = uStack_f8 | (ulong)*(byte *)((long)param_5 + 6) << 0x30;
        case (undefined8 *)0x6:
          uStack_f8 = uStack_f8 + ((ulong)*(byte *)((long)param_5 + 5) << 0x28);
        case (undefined8 *)0x5:
          uStack_f8 = uStack_f8 + ((ulong)*(byte *)((long)param_5 + 4) << 0x20);
        case (undefined8 *)0x4:
          uStack_f8 = uStack_f8 + (ulong)*(byte *)((long)param_5 + 3) * 0x1000000;
        case (undefined8 *)0x3:
          uStack_f8 = uStack_f8 + (ulong)*(byte *)((long)param_5 + 2) * 0x10000;
        case (undefined8 *)0x2:
          uStack_f8 = uStack_f8 + (ulong)*(byte *)((long)param_5 + 1) * 0x100;
        }
        if (((byte *)((long)param_6 + (long)param_5))[-1] == 0) {
          return (undefined1 *)0xffffffffffffffec;
        }
        puVar43 = (undefined8 *)0x0;
        iVar27 = (int)LZCOUNT((uint)((byte *)((long)param_6 + (long)param_5))[-1]) +
                 (int)param_6 * -8 + 0x29;
        puStack_e8 = param_5;
      }
      else {
        puStack_e8 = (ulong *)((long)param_5 + (long)puVar43);
        uStack_f8 = *puStack_e8;
        if (uStack_f8 >> 0x38 == 0) {
          return (undefined1 *)0xffffffffffffffec;
        }
        if ((undefined8 *)0xffffffffffffff88 < param_6) {
          return (undefined1 *)0xffffffffffffffec;
        }
        iVar27 = (int)LZCOUNT((uint)(byte)(uStack_f8 >> 0x38)) + -0x17;
      }
      uVar8 = *(uint *)(*plVar15 + 4);
      uStack_f0 = uVar8 + iVar27;
      uStack_d0 = uStack_f8 >> ((ulong)-uStack_f0 & 0x3f) &
                  (ulong)*(uint *)(&UNK_00814304 + (ulong)uVar8 * 4);
      if (uStack_f0 < 0x41) {
        if ((long)puVar43 < 8) {
          puVar28 = param_5;
          if (puVar43 == (undefined8 *)0x0) goto LAB_00154138;
          uVar8 = (uint)puVar43;
          if (param_5 <= (byte *)((long)param_5 + (long)puVar43) + -(ulong)(uStack_f0 >> 3)) {
            uVar8 = uStack_f0 >> 3;
          }
          uStack_f0 = uStack_f0 + uVar8 * -8;
        }
        else {
          uVar8 = uStack_f0 >> 3;
          uStack_f0 = uStack_f0 & 7;
        }
        puStack_e8 = (ulong *)((byte *)((long)param_5 + (long)puVar43) + -(ulong)uVar8);
        uStack_f8 = *puStack_e8;
        puVar28 = puStack_e8;
      }
      else {
        puVar28 = (ulong *)&UNK_00814388;
        puStack_e8 = (ulong *)&UNK_00814388;
      }
LAB_00154138:
      lVar1 = *plVar15 + 8;
      uVar8 = *(uint *)(plVar15[2] + 4);
      uStack_f0 = uVar8 + uStack_f0;
      uStack_c0 = uStack_f8 >> ((ulong)-uStack_f0 & 0x3f) &
                  (ulong)*(uint *)(&UNK_00814304 + (ulong)uVar8 * 4);
      iVar27 = (int)param_5;
      if (uStack_f0 < 0x41) {
        if (puVar28 < puVar19) {
          puVar32 = param_5;
          if (puVar28 == param_5) goto LAB_001541c4;
          uVar8 = (int)puVar28 - iVar27;
          if (param_5 <= (ulong *)((long)puVar28 - (ulong)(uStack_f0 >> 3))) {
            uVar8 = uStack_f0 >> 3;
          }
          puVar32 = (ulong *)((long)puVar28 - (ulong)uVar8);
          uStack_f8 = *puVar32;
          uStack_f0 = uStack_f0 + uVar8 * -8;
        }
        else {
          puVar32 = (ulong *)((long)puVar28 - (ulong)(uStack_f0 >> 3));
          uStack_f8 = *puVar32;
          uStack_f0 = uStack_f0 & 7;
        }
        puStack_e8 = puVar32;
      }
      else {
        puVar32 = (ulong *)&UNK_00814388;
        puStack_e8 = (ulong *)&UNK_00814388;
      }
LAB_001541c4:
      puVar43 = (undefined8 *)((long)plVar15 + 0x76a4);
      lVar2 = plVar15[2] + 8;
      uVar8 = *(uint *)(plVar15[1] + 4);
      uStack_f0 = uVar8 + uStack_f0;
      uStack_b0 = uStack_f8 >> ((ulong)-uStack_f0 & 0x3f) &
                  (ulong)*(uint *)(&UNK_00814304 + (ulong)uVar8 * 4);
      if (uStack_f0 < 0x41) {
        if (puVar32 < puVar19) {
          if (puVar32 != param_5) {
            uVar8 = (int)puVar32 - iVar27;
            if (param_5 <= (ulong *)((long)puVar32 - (ulong)(uStack_f0 >> 3))) {
              uVar8 = uStack_f0 >> 3;
            }
            puStack_e8 = (ulong *)((long)puVar32 - (ulong)uVar8);
            uStack_f0 = uStack_f0 + uVar8 * -8;
            uStack_f8 = *puStack_e8;
          }
        }
        else {
          puStack_e8 = (ulong *)((long)puVar32 - (ulong)(uStack_f0 >> 3));
          uStack_f0 = uStack_f0 & 7;
          uStack_f8 = *puStack_e8;
        }
      }
      else {
        puStack_e8 = (ulong *)&UNK_00814388;
      }
      lVar3 = plVar15[1] + 8;
      goto LAB_00154284;
    }
    unaff_x26 = (undefined8 *)((long)puVar45 + (long)unaff_x24);
    param_4 = in_stack_00000080;
    in_stack_00000080 = puVar14;
    puVar40 = (undefined8 *)uStack0000000000000120;
joined_r0x001537cc:
    unaff_w19 = unaff_w19 + 1;
    puVar45 = unaff_x26;
    uStack0000000000000120 = (ulong)puVar40;
    uStack0000000000000128 = uVar20;
    if (unaff_w19 == in_stack_00000050._4_4_) {
      uVar22 = (ulong)in_stack_00000050._4_4_;
      *in_stack_00000068 = CONCAT44(in_stack_00000110,in_stack_00000108);
      *(undefined4 *)(in_stack_00000068 + 1) = in_stack_00000118;
      unaff_x25 = in_stack_00000038;
      if (*(int *)((long)in_stack_00000068 + 0xe64) == 2) {
        uVar20 = (long)in_stack_00000080 - (long)puVar40;
        if (uVar20 <= (ulong)(in_stack_00000078 - (long)unaff_x26)) {
          if (unaff_x26 != (undefined8 *)0x0) {
            _memmove(unaff_x26,puVar40,uVar20);
            unaff_x26 = (undefined8 *)((long)unaff_x26 + uVar20);
          }
          puVar40 = (undefined8 *)(&UNK_000076a4 + in_stack_00000038);
          in_stack_00000080 = (undefined8 *)(&UNK_000176a4 + in_stack_00000038);
          puVar45 = unaff_x26;
          goto code_r0x00152000;
        }
      }
      else {
code_r0x00152000:
        puVar40 = (undefined8 *)((long)in_stack_00000080 - (long)puVar40);
        if (puVar40 <= (undefined8 *)(in_stack_00000078 - (long)puVar45)) {
          if (puVar45 == (undefined8 *)0x0) {
            puVar18 = (undefined *)0x0;
          }
          else {
            in_stack_00000080 = puVar40;
            _memmove(puVar45);
            puVar18 = (undefined *)((long)puVar45 + (long)puVar40);
          }
          unaff_x24 = puVar18 + -in_stack_00000020;
          goto code_r0x00153e60;
        }
      }
code_r0x00152014:
      unaff_x24 = (undefined *)0xffffffffffffffba;
      goto code_r0x00153e60;
    }
    uVar22 = (ulong)in_stack_00000050._4_4_;
    puVar19 = (ulong *)(unaff_x25 + (ulong)(unaff_w19 & 7) * 0x18);
    puVar14 = in_stack_00000080;
    if (*(int *)((long)in_stack_00000068 + 0xe64) == 2) {
      uStack0000000000000128 = *puVar19;
      puVar43 = *(undefined8 **)(&UNK_00007698 + in_stack_00000038);
      uStack0000000000000120 = (long)puVar40 + uStack0000000000000128;
      if (puVar43 < uStack0000000000000120) {
        uVar49 = (long)puVar43 - (long)puVar40;
        if (uVar49 != 0) {
          in_stack_00000080 = param_4;
          uStack0000000000000120 = (ulong)puVar40;
          uStack0000000000000128 = uVar20;
          if ((ulong)(in_stack_00000078 - (long)unaff_x26) < uVar49) goto code_r0x00152014;
          uVar47 = (long)unaff_x26 - (long)puVar40;
          puVar45 = (undefined8 *)((long)unaff_x26 + uVar49);
          if (((long)uVar47 < -7) && (7 < uVar49)) {
            if (uVar47 < 0xfffffffffffffff0) {
              puVar31 = puVar45 + -4;
              if (puVar31 < unaff_x26) goto code_r0x001537d4;
              uVar48 = *puVar40;
              unaff_x26[1] = puVar40[1];
              *unaff_x26 = uVar48;
              if (0x10 < (ulong)((long)puVar31 - (long)unaff_x26)) {
                puVar14 = unaff_x26 + 2;
                puVar43 = puVar40;
                do {
                  uVar48 = puVar43[2];
                  puVar14[1] = puVar43[3];
                  *puVar14 = uVar48;
                  uVar48 = puVar43[4];
                  puVar14[3] = puVar43[5];
                  puVar14[2] = uVar48;
                  puVar14 = puVar14 + 4;
                  puVar43 = puVar43 + 4;
                } while (puVar14 < puVar31);
              }
              puVar40 = (undefined8 *)((long)puVar40 + ((long)puVar31 - (long)unaff_x26));
            }
            else {
code_r0x001537d4:
              puVar31 = unaff_x26;
              if ((long)uVar49 < 1) goto code_r0x00153934;
            }
            puVar18 = (undefined *)((long)unaff_x26 + (uVar49 - (long)puVar31));
            if ((puVar18 < (undefined *)0x8) || ((ulong)((long)puVar31 - (long)puVar40) < 0x40)) {
              puVar14 = puVar31;
            }
            else {
              if (puVar18 < (undefined *)0x40) {
                puVar34 = (undefined *)0x0;
              }
              else {
                puVar34 = (undefined *)((ulong)puVar18 & 0xffffffffffffffc0);
                puVar14 = puVar31 + 4;
                puVar43 = puVar40 + 4;
                puVar38 = puVar34;
                do {
                  uVar48 = puVar43[-4];
                  uVar51 = puVar43[-1];
                  uVar50 = puVar43[-2];
                  uVar53 = puVar43[1];
                  uVar52 = *puVar43;
                  uVar55 = puVar43[3];
                  uVar54 = puVar43[2];
                  puVar14[-3] = puVar43[-3];
                  puVar14[-4] = uVar48;
                  puVar14[-1] = uVar51;
                  puVar14[-2] = uVar50;
                  puVar14[1] = uVar53;
                  *puVar14 = uVar52;
                  puVar14[3] = uVar55;
                  puVar14[2] = uVar54;
                  puVar38 = puVar38 + -0x40;
                  puVar14 = puVar14 + 8;
                  puVar43 = puVar43 + 8;
                } while (puVar38 != (undefined *)0x0);
                if (puVar18 == puVar34) goto code_r0x00153934;
                if (((ulong)puVar18 & 0x38) == 0) {
                  puVar40 = (undefined8 *)((long)puVar40 + (long)puVar34);
                  puVar14 = (undefined8 *)((long)puVar31 + (long)puVar34);
                  goto code_r0x00153904;
                }
              }
              puVar38 = (undefined *)((ulong)puVar18 & 0xfffffffffffffff8);
              lVar24 = (long)puVar34 - (long)puVar38;
              puVar14 = (undefined8 *)((long)puVar31 + (long)puVar34);
              puVar43 = (undefined8 *)((long)puVar40 + (long)puVar34);
              do {
                *puVar14 = *puVar43;
                lVar24 = lVar24 + 8;
                puVar14 = puVar14 + 1;
                puVar43 = puVar43 + 1;
              } while (lVar24 != 0);
              puVar14 = (undefined8 *)((long)puVar31 + (long)puVar38);
              puVar40 = (undefined8 *)((long)puVar40 + (long)puVar38);
              if (puVar18 == puVar38) goto code_r0x00153934;
            }
code_r0x00153904:
            do {
              puVar43 = (undefined8 *)((long)puVar14 + 1);
              *(undefined1 *)puVar14 = *(undefined1 *)puVar40;
              puVar14 = puVar43;
              puVar40 = (undefined8 *)((long)puVar40 + 1);
            } while (puVar43 != (undefined8 *)((long)puVar31 + (long)puVar18));
          }
          else if (0 < (long)uVar49) {
            puVar18 = (undefined *)((long)unaff_x26 + (long)puVar43) + -(long)puVar40;
            if (puVar18 <= (undefined *)((long)unaff_x26 + 1)) {
              puVar18 = (undefined *)((long)unaff_x26 + 1);
            }
            uVar17 = (long)puVar18 - (long)unaff_x26;
            if ((7 < uVar17) && (0x3f < uVar47)) {
              if (uVar17 < 0x40) {
                uVar16 = 0;
              }
              else {
                uVar16 = uVar17 & 0xffffffffffffffc0;
                puVar31 = unaff_x26 + 4;
                puVar14 = puVar40 + 4;
                uVar47 = uVar16;
                do {
                  uVar48 = puVar14[-4];
                  uVar51 = puVar14[-1];
                  uVar50 = puVar14[-2];
                  uVar53 = puVar14[1];
                  uVar52 = *puVar14;
                  uVar55 = puVar14[3];
                  uVar54 = puVar14[2];
                  puVar31[-3] = puVar14[-3];
                  puVar31[-4] = uVar48;
                  puVar31[-1] = uVar51;
                  puVar31[-2] = uVar50;
                  puVar31[1] = uVar53;
                  *puVar31 = uVar52;
                  puVar31[3] = uVar55;
                  puVar31[2] = uVar54;
                  uVar47 = uVar47 - 0x40;
                  puVar31 = puVar31 + 8;
                  puVar14 = puVar14 + 8;
                } while (uVar47 != 0);
                if (uVar17 == uVar16) goto code_r0x00153934;
                if ((uVar17 & 0x38) == 0) {
                  puVar40 = (undefined8 *)((long)puVar40 + uVar16);
                  unaff_x26 = (undefined8 *)((long)unaff_x26 + uVar16);
                  goto code_r0x00153924;
                }
              }
              uVar47 = uVar17 & 0xfffffffffffffff8;
              lVar24 = uVar16 - uVar47;
              puVar31 = (undefined8 *)((long)puVar40 + uVar16);
              puVar14 = (undefined8 *)((long)unaff_x26 + uVar16);
              do {
                *puVar14 = *puVar31;
                lVar24 = lVar24 + 8;
                puVar31 = puVar31 + 1;
                puVar14 = puVar14 + 1;
              } while (lVar24 != 0);
              unaff_x26 = (undefined8 *)((long)unaff_x26 + uVar47);
              puVar40 = (undefined8 *)((long)puVar40 + uVar47);
              if (uVar17 == uVar47) goto code_r0x00153934;
            }
code_r0x00153924:
            do {
              puVar31 = (undefined8 *)((long)unaff_x26 + 1);
              *(undefined1 *)unaff_x26 = *(undefined1 *)puVar40;
              unaff_x26 = puVar31;
              puVar40 = (undefined8 *)((long)puVar40 + 1);
            } while (puVar31 < puVar45);
          }
code_r0x00153934:
          uStack0000000000000128 = *puVar19 - uVar49;
          *puVar19 = uStack0000000000000128;
        }
        *(undefined4 *)((long)in_stack_00000068 + 0xe64) = 0;
        puVar14 = (undefined8 *)puVar19[1];
        puVar31 = (undefined8 *)puVar19[2];
        unaff_x27 = (undefined8 *)((long)puVar45 + uStack0000000000000128);
        puVar40 = (undefined8 *)((long)unaff_x27 - (long)puVar31);
        Hint_Prefetch(puVar40,0,0,0);
        unaff_x24 = (undefined *)((long)puVar14 + uStack0000000000000128);
        uStack0000000000000120 = (long)in_stack_00000060 + uStack0000000000000128;
        if (in_stack_00000098 < uStack0000000000000120 ||
            unaff_x21 < (undefined *)((long)puVar45 + (long)unaff_x24)) {
          in_stack_00000080 = &uStack0000000000000128;
          param_5 = &uStack0000000000000120;
          param_6 = in_stack_00000098;
          uStack0000000000000120 = (ulong)in_stack_00000060;
          in_stack_00000130 = puVar14;
          in_stack_00000138 = puVar31;
          unaff_x24 = (undefined *)func_0x00155c78(puVar45,in_stack_00000078);
          uVar20 = uStack0000000000000128;
        }
        else {
          uVar48 = *in_stack_00000060;
          puVar45[1] = in_stack_00000060[1];
          *puVar45 = uVar48;
          if (0x10 < uStack0000000000000128) {
            uVar48 = in_stack_00000060[2];
            puVar45[3] = in_stack_00000060[3];
            puVar45[2] = uVar48;
            if (0x10 < uStack0000000000000128 - 0x10) {
              puVar43 = puVar45 + 4;
              puVar42 = in_stack_00000090;
              do {
                uVar48 = puVar42[-2];
                puVar43[1] = puVar42[-1];
                *puVar43 = uVar48;
                uVar48 = *puVar42;
                puVar43[3] = puVar42[1];
                puVar43[2] = uVar48;
                puVar43 = puVar43 + 4;
                puVar42 = puVar42 + 4;
              } while (puVar43 < unaff_x27);
            }
          }
          uStack0000000000000128 = uVar20;
          if ((undefined8 *)((long)unaff_x27 - (long)in_stack_000000a0) < puVar31) {
            if ((undefined8 *)((long)unaff_x27 - in_stack_00000070) < puVar31)
            goto code_r0x00153e5c;
            lVar24 = (long)puVar40 - (long)in_stack_000000a0;
            if (in_stack_000000a8 + lVar24 + (long)puVar14 <= in_stack_000000a8) {
              _memmove(unaff_x27);
              in_stack_00000080 = puVar14;
              uVar20 = uStack0000000000000128;
              goto joined_r0x00153b5c;
            }
            param_4 = (undefined8 *)-lVar24;
            _memmove(unaff_x27);
            unaff_x27 = (undefined8 *)((long)unaff_x27 - lVar24);
            puVar14 = (undefined8 *)(lVar24 + (long)puVar14);
            puVar40 = in_stack_000000a0;
          }
          uVar20 = uStack0000000000000128;
          if (puVar31 < &MACH_HEADER.ncmds) {
            if ((undefined8 *)((long)&MACH_HEADER.cputype + 3) < puVar31) {
              *unaff_x27 = *puVar40;
            }
            else {
              iVar27 = *(int *)(&UNK_008143b0 + (long)puVar31 * 4);
              *(undefined1 *)unaff_x27 = *(undefined1 *)puVar40;
              *(undefined1 *)((long)unaff_x27 + 1) = *(undefined1 *)((long)puVar40 + 1);
              *(undefined1 *)((long)unaff_x27 + 2) = *(undefined1 *)((long)puVar40 + 2);
              *(undefined1 *)((long)unaff_x27 + 3) = *(undefined1 *)((long)puVar40 + 3);
              puVar7 = (undefined4 *)
                       ((long)puVar40 + (ulong)*(uint *)(&UNK_00814390 + (long)puVar31 * 4));
              puVar40 = (undefined8 *)((long)puVar7 - (long)iVar27);
              *(undefined4 *)((long)unaff_x27 + 4) = *puVar7;
            }
            in_stack_00000080 = param_4;
            if (&MACH_HEADER.cpusubtype < puVar14) {
              puVar43 = puVar40 + 1;
              puVar42 = unaff_x27 + 1;
              if ((long)puVar42 - (long)puVar43 < 0x10) {
                do {
                  puVar40 = puVar42 + 1;
                  *puVar42 = *puVar43;
                  puVar43 = puVar43 + 1;
                  puVar42 = puVar40;
                } while (puVar40 < (undefined8 *)((long)unaff_x27 + (long)puVar14));
              }
              else {
                uVar48 = *puVar43;
                unaff_x27[2] = puVar40[2];
                *puVar42 = uVar48;
                if (&MACH_HEADER.ncmds < puVar14 + -1) {
                  puVar43 = unaff_x27 + 3;
                  puVar40 = puVar40 + 5;
                  do {
                    uVar48 = puVar40[-2];
                    puVar43[1] = puVar40[-1];
                    *puVar43 = uVar48;
                    uVar48 = *puVar40;
                    puVar43[3] = puVar40[1];
                    puVar43[2] = uVar48;
                    puVar43 = puVar43 + 4;
                    puVar40 = puVar40 + 4;
                  } while (puVar43 < (undefined8 *)((long)unaff_x27 + (long)puVar14));
                }
              }
            }
          }
          else {
            uVar48 = *puVar40;
            unaff_x27[1] = puVar40[1];
            *unaff_x27 = uVar48;
            in_stack_00000080 = param_4;
            if (&MACH_HEADER.ncmds < puVar14) {
              puVar43 = unaff_x27 + 2;
              do {
                uVar48 = puVar40[2];
                puVar43[1] = puVar40[3];
                *puVar43 = uVar48;
                uVar48 = puVar40[4];
                puVar43[3] = puVar40[5];
                puVar43[2] = uVar48;
                puVar43 = puVar43 + 4;
                puVar40 = puVar40 + 4;
                in_stack_00000080 = param_4;
              } while (puVar43 < (undefined8 *)((long)unaff_x27 + (long)puVar14));
            }
          }
        }
joined_r0x00153b5c:
        uVar22 = (ulong)in_stack_00000050._4_4_;
        uStack0000000000000128 = uVar20;
        if (unaff_x24 < (undefined *)0xffffffffffffff89) break;
        goto code_r0x00153e60;
      }
      param_4 = (undefined8 *)(uStack0000000000000120 + -0x20);
      unaff_x28 = (undefined8 *)puVar19[1];
      unaff_x27 = (undefined8 *)puVar19[2];
      unaff_x24 = (undefined *)((long)unaff_x28 + uStack0000000000000128);
      if (in_stack_00000080 < uStack0000000000000120 ||
          param_4 < (undefined8 *)((long)unaff_x26 + (long)unaff_x24)) {
        param_5 = &uStack0000000000000128;
        param_6 = &uStack0000000000000120;
        uStack0000000000000120 = (ulong)puVar40;
        in_stack_00000130 = unaff_x28;
        in_stack_00000138 = unaff_x27;
        unaff_x24 = (undefined *)func_0x00156308(unaff_x26,in_stack_00000078);
        uVar20 = uStack0000000000000128;
      }
      else {
        unaff_x20 = (undefined8 *)((long)unaff_x26 + uStack0000000000000128);
        uVar48 = *puVar40;
        unaff_x26[1] = puVar40[1];
        *unaff_x26 = uVar48;
        if (0x10 < uStack0000000000000128) {
          uVar48 = puVar40[2];
          unaff_x26[3] = puVar40[3];
          unaff_x26[2] = uVar48;
          if (0x10 < uStack0000000000000128 - 0x10) {
            puVar31 = unaff_x26 + 4;
            puVar40 = puVar40 + 6;
            do {
              uVar48 = puVar40[-2];
              puVar31[1] = puVar40[-1];
              *puVar31 = uVar48;
              uVar48 = *puVar40;
              puVar31[3] = puVar40[1];
              puVar31[2] = uVar48;
              puVar31 = puVar31 + 4;
              puVar40 = puVar40 + 4;
            } while (puVar31 < unaff_x20);
          }
        }
        puVar40 = (undefined8 *)((long)unaff_x20 - (long)unaff_x27);
        uStack0000000000000128 = uVar20;
        if ((undefined8 *)((long)unaff_x20 - (long)in_stack_000000a0) < unaff_x27) {
          puVar31 = unaff_x20;
          if ((undefined8 *)((long)unaff_x20 - in_stack_00000070) < unaff_x27) {
code_r0x00153e5c:
            in_stack_00000080 = param_4;
            unaff_x24 = (undefined *)0xffffffffffffffec;
            uStack0000000000000128 = uVar20;
            goto code_r0x00153e60;
          }
          lVar24 = ((long)unaff_x20 - (long)unaff_x27) - (long)in_stack_000000a0;
          if (in_stack_000000a8 + lVar24 + (long)unaff_x28 <= in_stack_000000a8) {
code_r0x001537a0:
            uStack0000000000000128 = uVar20;
            _memmove(unaff_x20);
            param_4 = unaff_x28;
            uVar20 = uStack0000000000000128;
            goto joined_r0x001537bc;
          }
          param_4 = (undefined8 *)-lVar24;
          _memmove(unaff_x20);
          unaff_x20 = (undefined8 *)((long)unaff_x20 - lVar24);
          unaff_x28 = (undefined8 *)(lVar24 + (long)unaff_x28);
          puVar40 = in_stack_000000a0;
        }
        puVar31 = unaff_x20;
        uVar20 = uStack0000000000000128;
        if (unaff_x27 < &MACH_HEADER.ncmds) {
          if ((undefined8 *)((long)&MACH_HEADER.cputype + 3) < unaff_x27) {
            *unaff_x20 = *puVar40;
          }
          else {
            iVar27 = *(int *)(&UNK_008143b0 + (long)unaff_x27 * 4);
            *(undefined1 *)unaff_x20 = *(undefined1 *)puVar40;
            *(undefined1 *)((long)unaff_x20 + 1) = *(undefined1 *)((long)puVar40 + 1);
            *(undefined1 *)((long)unaff_x20 + 2) = *(undefined1 *)((long)puVar40 + 2);
            *(undefined1 *)((long)unaff_x20 + 3) = *(undefined1 *)((long)puVar40 + 3);
            puVar7 = (undefined4 *)
                     ((long)puVar40 + (ulong)*(uint *)(&UNK_00814390 + (long)unaff_x27 * 4));
            puVar40 = (undefined8 *)((long)puVar7 - (long)iVar27);
            *(undefined4 *)((long)unaff_x20 + 4) = *puVar7;
          }
          if (&MACH_HEADER.cpusubtype < unaff_x28) {
            puVar43 = puVar40 + 1;
            puVar42 = unaff_x20 + 1;
            if ((long)puVar42 - (long)puVar43 < 0x10) {
              do {
                puVar40 = puVar42 + 1;
                *puVar42 = *puVar43;
                puVar43 = puVar43 + 1;
                puVar42 = puVar40;
              } while (puVar40 < (undefined8 *)((long)unaff_x20 + (long)unaff_x28));
            }
            else {
              uVar48 = *puVar43;
              unaff_x20[2] = puVar40[2];
              *puVar42 = uVar48;
              if (&MACH_HEADER.ncmds < unaff_x28 + -1) {
                puVar43 = unaff_x20 + 3;
                puVar40 = puVar40 + 5;
                do {
                  uVar48 = puVar40[-2];
                  puVar43[1] = puVar40[-1];
                  *puVar43 = uVar48;
                  uVar48 = *puVar40;
                  puVar43[3] = puVar40[1];
                  puVar43[2] = uVar48;
                  puVar43 = puVar43 + 4;
                  puVar40 = puVar40 + 4;
                } while (puVar43 < (undefined8 *)((long)unaff_x20 + (long)unaff_x28));
              }
            }
          }
        }
        else {
          uVar48 = *puVar40;
          unaff_x20[1] = puVar40[1];
          *unaff_x20 = uVar48;
          if (&MACH_HEADER.ncmds < unaff_x28) {
            puVar43 = unaff_x20 + 2;
            do {
              uVar48 = puVar40[2];
              puVar43[1] = puVar40[3];
              *puVar43 = uVar48;
              uVar48 = puVar40[4];
              puVar43[3] = puVar40[5];
              puVar43[2] = uVar48;
              puVar43 = puVar43 + 4;
              puVar40 = puVar40 + 4;
            } while (puVar43 < (undefined8 *)((long)unaff_x20 + (long)unaff_x28));
          }
        }
      }
      goto joined_r0x001537bc;
    }
    uStack0000000000000128 = *puVar19;
    unaff_x28 = (undefined8 *)puVar19[1];
    unaff_x27 = (undefined8 *)puVar19[2];
    unaff_x20 = (undefined8 *)((long)unaff_x26 + uStack0000000000000128);
    param_1 = (undefined8 *)((long)unaff_x20 - (long)unaff_x27);
    Hint_Prefetch(param_1,0,0,0);
    unaff_x24 = (undefined *)((long)unaff_x28 + uStack0000000000000128);
    uStack0000000000000120 = (long)puVar40 + uStack0000000000000128;
    puVar31 = unaff_x28;
    if (in_stack_00000080 < uStack0000000000000120 ||
        unaff_x21 < (undefined *)((long)unaff_x26 + (long)unaff_x24)) {
      param_4 = &uStack0000000000000128;
      param_5 = &uStack0000000000000120;
      param_6 = in_stack_00000080;
      uStack0000000000000120 = (ulong)puVar40;
      in_stack_00000130 = unaff_x28;
      in_stack_00000138 = unaff_x27;
      unaff_x24 = (undefined *)func_0x00155c78(unaff_x26,in_stack_00000078);
      uVar20 = uStack0000000000000128;
      goto joined_r0x001537bc;
    }
    uVar48 = *puVar40;
    unaff_x26[1] = puVar40[1];
    *unaff_x26 = uVar48;
    if (0x10 < uStack0000000000000128) {
      uVar48 = puVar40[2];
      unaff_x26[3] = puVar40[3];
      unaff_x26[2] = uVar48;
      if (0x10 < uStack0000000000000128 - 0x10) {
        puVar43 = unaff_x26 + 4;
        puVar40 = puVar40 + 6;
        do {
          uVar48 = puVar40[-2];
          puVar43[1] = puVar40[-1];
          *puVar43 = uVar48;
          uVar48 = *puVar40;
          puVar43[3] = puVar40[1];
          puVar43[2] = uVar48;
          puVar43 = puVar43 + 4;
          puVar40 = puVar40 + 4;
        } while (puVar43 < unaff_x20);
      }
    }
    uStack0000000000000128 = uVar20;
    if ((undefined8 *)((long)unaff_x20 - (long)in_stack_000000a0) < unaff_x27) {
      if (unaff_x27 <= (undefined8 *)((long)unaff_x20 - in_stack_00000070)) {
        lVar24 = (long)param_1 - (long)in_stack_000000a0;
        if (in_stack_000000a8 < in_stack_000000a8 + lVar24 + (long)unaff_x28) {
          param_4 = (undefined8 *)-lVar24;
          _memmove(unaff_x20);
          unaff_x20 = (undefined8 *)((long)unaff_x20 - lVar24);
          unaff_x28 = (undefined8 *)(lVar24 + (long)unaff_x28);
          param_1 = in_stack_000000a0;
          goto code_r0x00153628;
        }
        goto code_r0x001537a0;
      }
      goto code_r0x00153e5c;
    }
code_r0x00153628:
    if (&MACH_HEADER.ncmds <= unaff_x27) {
      uVar48 = *param_1;
      unaff_x20[1] = param_1[1];
      *unaff_x20 = uVar48;
      param_4 = param_4;
      puVar31 = unaff_x28;
      uVar20 = uStack0000000000000128;
      if (&MACH_HEADER.ncmds < unaff_x28) {
        puVar40 = unaff_x20 + 2;
        do {
          uVar48 = param_1[2];
          puVar40[1] = param_1[3];
          *puVar40 = uVar48;
          uVar48 = param_1[4];
          puVar40[3] = param_1[5];
          puVar40[2] = uVar48;
          puVar40 = puVar40 + 4;
          param_1 = param_1 + 4;
          param_4 = param_4;
        } while (puVar40 < (undefined8 *)((long)unaff_x20 + (long)unaff_x28));
      }
      goto joined_r0x001537bc;
    }
    if ((undefined8 *)((long)&MACH_HEADER.cputype + 3) < unaff_x27) {
      *unaff_x20 = *param_1;
    }
    else {
      iVar27 = *(int *)(&UNK_008143b0 + (long)unaff_x27 * 4);
      *(undefined1 *)unaff_x20 = *(undefined1 *)param_1;
      *(undefined1 *)((long)unaff_x20 + 1) = *(undefined1 *)((long)param_1 + 1);
      *(undefined1 *)((long)unaff_x20 + 2) = *(undefined1 *)((long)param_1 + 2);
      *(undefined1 *)((long)unaff_x20 + 3) = *(undefined1 *)((long)param_1 + 3);
      puVar7 = (undefined4 *)((long)param_1 + (ulong)*(uint *)(&UNK_00814390 + (long)unaff_x27 * 4))
      ;
      param_1 = (undefined8 *)((long)puVar7 - (long)iVar27);
      *(undefined4 *)((long)unaff_x20 + 4) = *puVar7;
    }
    in_CY = &MACH_HEADER.cpusubtype < unaff_x28;
  } while( true );
  unaff_x26 = (undefined8 *)((long)puVar45 + (long)unaff_x24);
  param_4 = in_stack_00000080;
  in_stack_00000080 = in_stack_00000098;
  puVar40 = (undefined8 *)uStack0000000000000120;
  goto joined_r0x001537cc;
LAB_00154284:
  puVar4 = (ushort *)(lVar1 + uStack_d0 * 8);
  puVar5 = (ushort *)(lVar3 + uStack_b0 * 8);
  puVar6 = (ushort *)(lVar2 + uStack_c0 * 8);
  uVar47 = (ulong)*(uint *)(puVar5 + 2);
  uVar49 = (ulong)*(uint *)(puVar4 + 2);
  uVar8 = *(uint *)(puVar6 + 2);
  bVar9 = (byte)puVar4[1];
  bVar10 = (byte)puVar5[1];
  bVar11 = (byte)puVar6[1];
  uVar33 = (uint)bVar11;
  puVar28 = auStack_a0;
  if (bVar11 < 2) {
    bVar13 = *(uint *)(puVar4 + 2) == 0;
    if (bVar11 != 0) {
      if (bVar13) {
        uVar8 = uVar8 + 1;
      }
      uVar17 = (ulong)uStack_f0;
      uStack_f0 = uStack_f0 + 1;
      lVar36 = (ulong)uVar8 - ((long)(uStack_f8 << (uVar17 & 0x3f)) >> 0x3f);
      if (lVar36 == 3) {
        uVar17 = (auStack_a0[0] - 1) - (ulong)(auStack_a0[0] - 1 == 0);
      }
      else {
        uVar17 = auStack_a0[lVar36] - (ulong)(auStack_a0[lVar36] == 0);
        if (lVar36 == 1) goto LAB_00154320;
      }
      goto code_r0x001542f4;
    }
    uVar17 = auStack_a0[bVar13];
    puVar28 = auStack_a0 + !bVar13;
  }
  else {
    uVar17 = (ulong)uStack_f0;
    uStack_f0 = uStack_f0 + uVar33;
    uVar17 = ((uStack_f8 << (uVar17 & 0x3f)) >> ((ulong)-uVar33 & 0x3f)) + (ulong)uVar8;
code_r0x001542f4:
    auStack_a0[2] = auStack_a0[1];
  }
LAB_00154320:
  auStack_a0[0] = uVar17;
  auStack_a0[1] = *puVar28;
  if (bVar10 != 0) {
    uVar16 = (ulong)uStack_f0;
    uStack_f0 = uStack_f0 + bVar10;
    uVar47 = ((uStack_f8 << (uVar16 & 0x3f)) >> ((ulong)-(uint)bVar10 & 0x3f)) + uVar47;
  }
  if (0x1e < ((uint)bVar10 + (uint)bVar9 + uVar33 & 0xff)) {
    if (uStack_f0 < 0x41) {
      if (puStack_e8 < puVar19) {
        if (puStack_e8 == param_5) goto code_r0x00154360;
        uVar8 = (int)puStack_e8 - iVar27;
        if (param_5 <= (ulong *)((long)puStack_e8 - (ulong)(uStack_f0 >> 3))) {
          uVar8 = uStack_f0 >> 3;
        }
        uStack_f0 = uStack_f0 + uVar8 * -8;
      }
      else {
        uVar8 = uStack_f0 >> 3;
        uStack_f0 = uStack_f0 & 7;
      }
      puStack_e8 = (ulong *)((long)puStack_e8 - (ulong)uVar8);
      uStack_f8 = *puStack_e8;
    }
    else {
      puStack_e8 = (ulong *)&UNK_00814388;
    }
  }
code_r0x00154360:
  if (bVar9 != 0) {
    uVar16 = (ulong)uStack_f0;
    uStack_f0 = uStack_f0 + bVar9;
    uVar49 = ((uStack_f8 << (uVar16 & 0x3f)) >> ((ulong)-(uint)bVar9 & 0x3f)) + uVar49;
  }
  iVar46 = (int)uVar22;
  iVar44 = iVar46 + -1;
  if (iVar44 != 0) {
    iVar12 = uStack_f0 + *(byte *)((long)puVar4 + 3);
    uStack_d0 = (uStack_f8 >> ((ulong)(uint)-iVar12 & 0x3f) &
                (ulong)*(uint *)(&UNK_00814304 + (ulong)(uint)*(byte *)((long)puVar4 + 3) * 4)) +
                (ulong)*puVar4;
    iVar12 = iVar12 + (uint)*(byte *)((long)puVar5 + 3);
    uStack_b0 = (uStack_f8 >> ((ulong)(uint)-iVar12 & 0x3f) &
                (ulong)*(uint *)(&UNK_00814304 + (ulong)(uint)*(byte *)((long)puVar5 + 3) * 4)) +
                (ulong)*puVar5;
    uStack_f0 = iVar12 + (uint)*(byte *)((long)puVar6 + 3);
    uStack_c0 = (uStack_f8 >> ((ulong)-uStack_f0 & 0x3f) &
                (ulong)*(uint *)(&UNK_00814304 + (ulong)(uint)*(byte *)((long)puVar6 + 3) * 4)) +
                (ulong)*puVar6;
    if (uStack_f0 < 0x41) {
      if (puStack_e8 < puVar19) {
        if (puStack_e8 != param_5) {
          uVar8 = (int)puStack_e8 - iVar27;
          if (param_5 <= (ulong *)((long)puStack_e8 - (ulong)(uStack_f0 >> 3))) {
            uVar8 = uStack_f0 >> 3;
          }
          uStack_f0 = uStack_f0 + uVar8 * -8;
          goto code_r0x00154464;
        }
      }
      else {
        uVar8 = uStack_f0 >> 3;
        uStack_f0 = uStack_f0 & 7;
code_r0x00154464:
        puStack_e8 = (ulong *)((long)puStack_e8 - (ulong)uVar8);
        uStack_f8 = *puStack_e8;
      }
      puVar29 = (undefined1 *)plVar15[0xed3];
      if ((undefined1 *)((long)puStack_88 + uVar49) <= puVar29) goto code_r0x00154484;
    }
    else {
      puStack_e8 = (ulong *)&UNK_00814388;
      puVar29 = (undefined1 *)plVar15[0xed3];
      if ((undefined1 *)((long)puStack_88 + uVar49) <= puVar29) goto code_r0x00154484;
    }
    if (iVar46 < 1) {
      return (undefined1 *)0xffffffffffffffec;
    }
code_r0x001547d8:
    uVar22 = (long)puVar29 - (long)puStack_88;
    if (uVar22 == 0) goto code_r0x00154a08;
    if ((ulong)((long)puVar21 - (long)puVar31) < uVar22) {
      return (undefined1 *)0xffffffffffffffba;
    }
    uVar16 = (long)puVar31 - (long)puStack_88;
    puVar45 = (undefined8 *)((long)puVar31 + uVar22);
    if (((long)uVar16 < -7) && (7 < uVar22)) {
      if (uVar16 < 0xfffffffffffffff0) {
        puVar42 = puVar45 + -4;
        if (puVar31 <= puVar42) {
          uVar48 = *puStack_88;
          puVar31[1] = puStack_88[1];
          *puVar31 = uVar48;
          if (0x10 < (ulong)((long)puVar42 - (long)puVar31)) {
            puVar25 = puVar31 + 2;
            puVar23 = puStack_88;
            do {
              uVar48 = puVar23[2];
              puVar25[1] = puVar23[3];
              *puVar25 = uVar48;
              uVar48 = puVar23[4];
              puVar25[3] = puVar23[5];
              puVar25[2] = uVar48;
              puVar25 = puVar25 + 4;
              puVar23 = puVar23 + 4;
            } while (puVar25 < puVar42);
          }
          puStack_88 = (undefined8 *)((long)puStack_88 + ((long)puVar42 - (long)puVar31));
code_r0x001548ac:
          puVar29 = (undefined1 *)((long)puVar31 + (uVar22 - (long)puVar42));
          if ((puVar29 < (undefined1 *)0x8) || ((ulong)((long)puVar42 - (long)puStack_88) < 0x40)) {
            puVar31 = puVar42;
          }
          else {
            if (puVar29 < (undefined1 *)0x40) {
              puVar35 = (undefined1 *)0x0;
            }
            else {
              puVar35 = (undefined1 *)((ulong)puVar29 & 0xffffffffffffffc0);
              puVar31 = puVar42 + 4;
              puVar25 = puStack_88 + 4;
              puVar39 = puVar35;
              do {
                uVar48 = puVar25[-4];
                uVar51 = puVar25[-1];
                uVar50 = puVar25[-2];
                uVar53 = puVar25[1];
                uVar52 = *puVar25;
                uVar55 = puVar25[3];
                uVar54 = puVar25[2];
                puVar31[-3] = puVar25[-3];
                puVar31[-4] = uVar48;
                puVar31[-1] = uVar51;
                puVar31[-2] = uVar50;
                puVar31[1] = uVar53;
                *puVar31 = uVar52;
                puVar31[3] = uVar55;
                puVar31[2] = uVar54;
                puVar39 = puVar39 + -0x40;
                puVar31 = puVar31 + 8;
                puVar25 = puVar25 + 8;
              } while (puVar39 != (undefined1 *)0x0);
              if (puVar29 == puVar35) goto code_r0x00154a00;
              if (((ulong)puVar29 & 0x38) == 0) {
                puStack_88 = (undefined8 *)((long)puStack_88 + (long)puVar35);
                puVar31 = (undefined8 *)((long)puVar42 + (long)puVar35);
                goto code_r0x001549d0;
              }
            }
            puVar39 = (undefined1 *)((ulong)puVar29 & 0xfffffffffffffff8);
            lVar36 = (long)puVar35 - (long)puVar39;
            puVar31 = (undefined8 *)((long)puVar42 + (long)puVar35);
            puVar25 = (undefined8 *)((long)puStack_88 + (long)puVar35);
            do {
              *puVar31 = *puVar25;
              lVar36 = lVar36 + 8;
              puVar31 = puVar31 + 1;
              puVar25 = puVar25 + 1;
            } while (lVar36 != 0);
            puVar31 = (undefined8 *)((long)puVar42 + (long)puVar39);
            puStack_88 = (undefined8 *)((long)puStack_88 + (long)puVar39);
            if (puVar29 == puVar39) goto code_r0x00154a00;
          }
code_r0x001549d0:
          do {
            puVar25 = (undefined8 *)((long)puVar31 + 1);
            *(undefined1 *)puVar31 = *(undefined1 *)puStack_88;
            puVar31 = puVar25;
            puStack_88 = (undefined8 *)((long)puStack_88 + 1);
          } while (puVar25 != (undefined8 *)((long)puVar42 + (long)puVar29));
          goto code_r0x00154a00;
        }
      }
      puVar42 = puVar31;
      if ((long)uVar22 < 1) goto code_r0x00154a00;
      goto code_r0x001548ac;
    }
    if ((long)uVar22 < 1) goto code_r0x00154a00;
    puVar29 = (undefined1 *)((long)puVar31 + (long)puVar29) + -(long)puStack_88;
    if (puVar29 <= (undefined1 *)((long)puVar31 + 1U)) {
      puVar29 = (undefined1 *)((long)puVar31 + 1);
    }
    uVar30 = (long)puVar29 - (long)puVar31;
    if ((uVar30 < 8) || (uVar16 < 0x40)) goto code_r0x001549f0;
    if (uVar30 < 0x40) {
      uVar16 = 0;
      goto code_r0x00154994;
    }
    uVar16 = uVar30 & 0xffffffffffffffc0;
    puVar42 = puVar31 + 4;
    puVar25 = puStack_88 + 4;
    uVar37 = uVar16;
    do {
      uVar48 = puVar25[-4];
      uVar51 = puVar25[-1];
      uVar50 = puVar25[-2];
      uVar53 = puVar25[1];
      uVar52 = *puVar25;
      uVar55 = puVar25[3];
      uVar54 = puVar25[2];
      puVar42[-3] = puVar25[-3];
      puVar42[-4] = uVar48;
      puVar42[-1] = uVar51;
      puVar42[-2] = uVar50;
      puVar42[1] = uVar53;
      *puVar42 = uVar52;
      puVar42[3] = uVar55;
      puVar42[2] = uVar54;
      uVar37 = uVar37 - 0x40;
      puVar42 = puVar42 + 8;
      puVar25 = puVar25 + 8;
    } while (uVar37 != 0);
    if (uVar30 != uVar16) {
      if ((uVar30 & 0x38) == 0) {
        puStack_88 = (undefined8 *)((long)puStack_88 + uVar16);
        puVar31 = (undefined8 *)((long)puVar31 + uVar16);
      }
      else {
code_r0x00154994:
        uVar37 = uVar30 & 0xfffffffffffffff8;
        lVar36 = uVar16 - uVar37;
        puVar42 = (undefined8 *)((long)puStack_88 + uVar16);
        puVar25 = (undefined8 *)((long)puVar31 + uVar16);
        do {
          *puVar25 = *puVar42;
          lVar36 = lVar36 + 8;
          puVar42 = puVar42 + 1;
          puVar25 = puVar25 + 1;
        } while (lVar36 != 0);
        puVar31 = (undefined8 *)((long)puVar31 + uVar37);
        puStack_88 = (undefined8 *)((long)puStack_88 + uVar37);
        if (uVar30 == uVar37) goto code_r0x00154a00;
      }
code_r0x001549f0:
      do {
        puVar42 = (undefined8 *)((long)puVar31 + 1);
        *(undefined1 *)puVar31 = *(undefined1 *)puStack_88;
        puVar31 = puVar42;
        puStack_88 = (undefined8 *)((long)puStack_88 + 1);
      } while (puVar42 < puVar45);
    }
code_r0x00154a00:
    uVar49 = uVar49 - uVar22;
    puVar31 = puVar45;
code_r0x00154a08:
    puVar45 = (undefined8 *)((long)plVar15 + 0x176a4);
    *(undefined4 *)(plVar15 + 0xed4) = 0;
    puVar42 = (undefined8 *)((long)puVar31 + uVar49);
    puVar25 = (undefined8 *)((long)puVar42 - uVar17);
    Hint_Prefetch(puVar25,0,0,0);
    if ((puVar45 < (undefined8 *)((long)puVar43 + uVar49)) ||
       (puVar29 = (undefined1 *)(uVar49 + uVar47),
       puVar21 + -0x20 < (undefined1 *)((long)puVar31 + (long)puVar29))) {
      puStack_88 = puVar43;
      uStack_80 = uVar49;
      uStack_78 = uVar47;
      uStack_70 = uVar17;
      puVar29 = (undefined1 *)
                func_0x00155c78(puVar31,puVar21,&uStack_80,&puStack_88,puVar45,puVar40,lVar24,uVar20
                               );
    }
    else {
      uVar48 = *puVar43;
      puVar31[1] = *(undefined8 *)((long)plVar15 + 0x76ac);
      *puVar31 = uVar48;
      if (0x10 < uVar49) {
        uVar48 = *(undefined8 *)((long)plVar15 + 0x76b4);
        puVar31[3] = *(undefined8 *)((long)plVar15 + 0x76bc);
        puVar31[2] = uVar48;
        if (0x10 < uVar49 - 0x10) {
          puVar23 = puVar31 + 4;
          puVar26 = (undefined8 *)((long)plVar15 + 0x76d4);
          do {
            uVar48 = puVar26[-2];
            puVar23[1] = puVar26[-1];
            *puVar23 = uVar48;
            uVar48 = *puVar26;
            puVar23[3] = puVar26[1];
            puVar23[2] = uVar48;
            puVar23 = puVar23 + 4;
            puVar26 = puVar26 + 4;
          } while (puVar23 < puVar42);
        }
      }
      puStack_88 = (undefined8 *)((long)puVar43 + uVar49);
      if ((ulong)((long)puVar42 - (long)puVar40) < uVar17) {
        if ((ulong)((long)puVar42 - lVar24) < uVar17) {
          return (undefined1 *)0xffffffffffffffec;
        }
        lVar41 = (long)puVar25 - (long)puVar40;
        lVar36 = uVar20 + lVar41;
        if (lVar36 + uVar47 <= uVar20) {
          _memmove(puVar42,lVar36,uVar47);
          goto joined_r0x00154b24;
        }
        _memmove(puVar42,lVar36,-lVar41);
        puVar42 = (undefined8 *)((long)puVar42 - lVar41);
        uVar47 = lVar41 + uVar47;
        puVar25 = puVar40;
      }
      if (uVar17 < 0x10) {
        if (uVar17 < 8) {
          iVar12 = *(int *)(&UNK_008143b0 + uVar17 * 4);
          *(undefined1 *)puVar42 = *(undefined1 *)puVar25;
          *(undefined1 *)((long)puVar42 + 1) = *(undefined1 *)((long)puVar25 + 1);
          *(undefined1 *)((long)puVar42 + 2) = *(undefined1 *)((long)puVar25 + 2);
          *(undefined1 *)((long)puVar42 + 3) = *(undefined1 *)((long)puVar25 + 3);
          puVar7 = (undefined4 *)((long)puVar25 + (ulong)*(uint *)(&UNK_00814390 + uVar17 * 4));
          puVar25 = (undefined8 *)((long)puVar7 - (long)iVar12);
          *(undefined4 *)((long)puVar42 + 4) = *puVar7;
        }
        else {
          *puVar42 = *puVar25;
        }
        if (8 < uVar47) {
          puVar43 = puVar25 + 1;
          puVar23 = puVar42 + 1;
          if ((long)puVar23 - (long)puVar43 < 0x10) {
            do {
              puVar25 = puVar23 + 1;
              *puVar23 = *puVar43;
              puVar43 = puVar43 + 1;
              puVar23 = puVar25;
            } while (puVar25 < (undefined8 *)((long)puVar42 + uVar47));
          }
          else {
            uVar48 = *puVar43;
            puVar42[2] = puVar25[2];
            *puVar23 = uVar48;
            if (0x10 < uVar47 - 8) {
              puVar43 = puVar42 + 3;
              puVar25 = puVar25 + 5;
              do {
                uVar48 = puVar25[-2];
                puVar43[1] = puVar25[-1];
                *puVar43 = uVar48;
                uVar48 = *puVar25;
                puVar43[3] = puVar25[1];
                puVar43[2] = uVar48;
                puVar43 = puVar43 + 4;
                puVar25 = puVar25 + 4;
              } while (puVar43 < (undefined8 *)((long)puVar42 + uVar47));
            }
          }
        }
      }
      else {
        uVar48 = *puVar25;
        puVar42[1] = puVar25[1];
        *puVar42 = uVar48;
        if (0x10 < uVar47) {
          puVar43 = puVar42 + 2;
          do {
            uVar48 = puVar25[2];
            puVar43[1] = puVar25[3];
            *puVar43 = uVar48;
            uVar48 = puVar25[4];
            puVar43[3] = puVar25[5];
            puVar43[2] = uVar48;
            puVar43 = puVar43 + 4;
            puVar25 = puVar25 + 4;
          } while (puVar43 < (undefined8 *)((long)puVar42 + uVar47));
        }
      }
    }
joined_r0x00154b24:
    if ((undefined1 *)0xffffffffffffff88 < puVar29) {
      return puVar29;
    }
    puVar31 = (undefined8 *)((long)puVar31 + (long)puVar29);
    if (iVar46 < 2) {
      if (iVar44 != 0) {
        return (undefined1 *)0xffffffffffffffec;
      }
      goto code_r0x00155070;
    }
    do {
      puVar4 = (ushort *)(lVar1 + uStack_d0 * 8);
      puVar5 = (ushort *)(lVar3 + uStack_b0 * 8);
      puVar6 = (ushort *)(lVar2 + uStack_c0 * 8);
      uVar49 = (ulong)*(uint *)(puVar5 + 2);
      uVar22 = (ulong)*(uint *)(puVar4 + 2);
      uVar8 = *(uint *)(puVar6 + 2);
      bVar9 = (byte)puVar4[1];
      bVar10 = (byte)puVar5[1];
      bVar11 = (byte)puVar6[1];
      uVar33 = (uint)bVar11;
      puVar28 = auStack_a0;
      if (bVar11 < 2) {
        bVar13 = *(uint *)(puVar4 + 2) == 0;
        if (bVar11 != 0) {
          if (bVar13) {
            uVar8 = uVar8 + 1;
          }
          uVar47 = (ulong)uStack_f0;
          uStack_f0 = uStack_f0 + 1;
          lVar36 = (ulong)uVar8 - ((long)(uStack_f8 << (uVar47 & 0x3f)) >> 0x3f);
          if (lVar36 == 3) {
            uVar47 = (auStack_a0[0] - 1) - (ulong)(auStack_a0[0] - 1 == 0);
          }
          else {
            uVar47 = auStack_a0[lVar36] - (ulong)(auStack_a0[lVar36] == 0);
            if (lVar36 == 1) goto LAB_00154bdc;
          }
          goto code_r0x00154bb0;
        }
        uVar47 = auStack_a0[bVar13];
        puVar28 = auStack_a0 + !bVar13;
      }
      else {
        uVar47 = (ulong)uStack_f0;
        uStack_f0 = uStack_f0 + uVar33;
        uVar47 = ((uStack_f8 << (uVar47 & 0x3f)) >> ((ulong)-uVar33 & 0x3f)) + (ulong)uVar8;
code_r0x00154bb0:
        auStack_a0[2] = auStack_a0[1];
      }
LAB_00154bdc:
      auStack_a0[0] = uVar47;
      auStack_a0[1] = *puVar28;
      if (bVar10 != 0) {
        uVar17 = (ulong)uStack_f0;
        uStack_f0 = uStack_f0 + bVar10;
        uVar49 = ((uStack_f8 << (uVar17 & 0x3f)) >> ((ulong)-(uint)bVar10 & 0x3f)) + uVar49;
      }
      if (0x1e < ((uint)bVar10 + (uint)bVar9 + uVar33 & 0xff)) {
        if (uStack_f0 < 0x41) {
          if (puStack_e8 < puVar19) {
            if (puStack_e8 != param_5) {
              uVar8 = (int)puStack_e8 - iVar27;
              if (param_5 <= (ulong *)((long)puStack_e8 - (ulong)(uStack_f0 >> 3))) {
                uVar8 = uStack_f0 >> 3;
              }
              puStack_e8 = (ulong *)((long)puStack_e8 - (ulong)uVar8);
              uStack_f0 = uStack_f0 + uVar8 * -8;
              uStack_f8 = *puStack_e8;
            }
          }
          else {
            puStack_e8 = (ulong *)((long)puStack_e8 - (ulong)(uStack_f0 >> 3));
            uStack_f0 = uStack_f0 & 7;
            uStack_f8 = *puStack_e8;
          }
        }
        else {
          puStack_e8 = (ulong *)&UNK_00814388;
        }
      }
      if (bVar9 != 0) {
        uVar17 = (ulong)uStack_f0;
        uStack_f0 = uStack_f0 + bVar9;
        uVar22 = ((uStack_f8 << (uVar17 & 0x3f)) >> ((ulong)-(uint)bVar9 & 0x3f)) + uVar22;
      }
      if (iVar44 != 1) {
        iVar46 = uStack_f0 + *(byte *)((long)puVar4 + 3);
        uStack_d0 = (uStack_f8 >> ((ulong)(uint)-iVar46 & 0x3f) &
                    (ulong)*(uint *)(&UNK_00814304 + (ulong)(uint)*(byte *)((long)puVar4 + 3) * 4))
                    + (ulong)*puVar4;
        iVar46 = iVar46 + (uint)*(byte *)((long)puVar5 + 3);
        uStack_b0 = (uStack_f8 >> ((ulong)(uint)-iVar46 & 0x3f) &
                    (ulong)*(uint *)(&UNK_00814304 + (ulong)(uint)*(byte *)((long)puVar5 + 3) * 4))
                    + (ulong)*puVar5;
        uStack_f0 = iVar46 + (uint)*(byte *)((long)puVar6 + 3);
        uStack_c0 = (uStack_f8 >> ((ulong)-uStack_f0 & 0x3f) &
                    (ulong)*(uint *)(&UNK_00814304 + (ulong)(uint)*(byte *)((long)puVar6 + 3) * 4))
                    + (ulong)*puVar6;
        if (uStack_f0 < 0x41) {
          if (puStack_e8 < puVar19) {
            if (puStack_e8 == param_5) goto LAB_00154d14;
            uVar8 = (int)puStack_e8 - iVar27;
            if (param_5 <= (ulong *)((long)puStack_e8 - (ulong)(uStack_f0 >> 3))) {
              uVar8 = uStack_f0 >> 3;
            }
            uStack_f0 = uStack_f0 + uVar8 * -8;
          }
          else {
            uVar8 = uStack_f0 >> 3;
            uStack_f0 = uStack_f0 & 7;
          }
          puStack_e8 = (ulong *)((long)puStack_e8 - (ulong)uVar8);
          uStack_f8 = *puStack_e8;
        }
        else {
          puStack_e8 = (ulong *)&UNK_00814388;
        }
      }
LAB_00154d14:
      puVar43 = (undefined8 *)((long)puVar31 + uVar22);
      puVar42 = (undefined8 *)((long)puVar43 - uVar47);
      Hint_Prefetch(puVar42,0,0,0);
      if ((puVar45 < (undefined8 *)((long)puStack_88 + uVar22)) ||
         (puVar29 = (undefined1 *)(uVar22 + uVar49),
         puVar21 + -0x20 < (undefined1 *)((long)puVar31 + (long)puVar29))) {
        uStack_80 = uVar22;
        uStack_78 = uVar49;
        uStack_70 = uVar47;
        puVar29 = (undefined1 *)
                  func_0x00155c78(puVar31,puVar21,&uStack_80,&puStack_88,puVar45,puVar40,lVar24,
                                  uVar20);
      }
      else {
        uVar48 = *puStack_88;
        puVar31[1] = puStack_88[1];
        *puVar31 = uVar48;
        if (0x10 < uVar22) {
          uVar48 = puStack_88[2];
          puVar31[3] = puStack_88[3];
          puVar31[2] = uVar48;
          if (0x10 < uVar22 - 0x10) {
            puVar25 = puVar31 + 4;
            puVar23 = puStack_88 + 6;
            do {
              uVar48 = puVar23[-2];
              puVar25[1] = puVar23[-1];
              *puVar25 = uVar48;
              uVar48 = *puVar23;
              puVar25[3] = puVar23[1];
              puVar25[2] = uVar48;
              puVar25 = puVar25 + 4;
              puVar23 = puVar23 + 4;
            } while (puVar25 < puVar43);
          }
        }
        puStack_88 = (undefined8 *)((long)puStack_88 + uVar22);
        if ((ulong)((long)puVar43 - (long)puVar40) < uVar47) {
          if ((ulong)((long)puVar43 - lVar24) < uVar47) {
            return (undefined1 *)0xffffffffffffffec;
          }
          lVar41 = (long)puVar42 - (long)puVar40;
          lVar36 = uVar20 + lVar41;
          if (lVar36 + uVar49 <= uVar20) {
            _memmove(puVar43,lVar36,uVar49);
            goto joined_r0x00154e58;
          }
          _memmove(puVar43,lVar36,-lVar41);
          puVar43 = (undefined8 *)((long)puVar43 - lVar41);
          uVar49 = lVar41 + uVar49;
          puVar42 = puVar40;
        }
        if (uVar47 < 0x10) {
          if (uVar47 < 8) {
            iVar46 = *(int *)(&UNK_008143b0 + uVar47 * 4);
            *(undefined1 *)puVar43 = *(undefined1 *)puVar42;
            *(undefined1 *)((long)puVar43 + 1) = *(undefined1 *)((long)puVar42 + 1);
            *(undefined1 *)((long)puVar43 + 2) = *(undefined1 *)((long)puVar42 + 2);
            *(undefined1 *)((long)puVar43 + 3) = *(undefined1 *)((long)puVar42 + 3);
            puVar7 = (undefined4 *)((long)puVar42 + (ulong)*(uint *)(&UNK_00814390 + uVar47 * 4));
            puVar42 = (undefined8 *)((long)puVar7 - (long)iVar46);
            *(undefined4 *)((long)puVar43 + 4) = *puVar7;
          }
          else {
            *puVar43 = *puVar42;
          }
          if (8 < uVar49) {
            puVar25 = puVar42 + 1;
            puVar23 = puVar43 + 1;
            if ((long)puVar23 - (long)puVar25 < 0x10) {
              do {
                puVar42 = puVar23 + 1;
                *puVar23 = *puVar25;
                puVar25 = puVar25 + 1;
                puVar23 = puVar42;
              } while (puVar42 < (undefined8 *)((long)puVar43 + uVar49));
            }
            else {
              uVar48 = *puVar25;
              puVar43[2] = puVar42[2];
              *puVar23 = uVar48;
              if (0x10 < uVar49 - 8) {
                puVar25 = puVar43 + 3;
                puVar42 = puVar42 + 5;
                do {
                  uVar48 = puVar42[-2];
                  puVar25[1] = puVar42[-1];
                  *puVar25 = uVar48;
                  uVar48 = *puVar42;
                  puVar25[3] = puVar42[1];
                  puVar25[2] = uVar48;
                  puVar25 = puVar25 + 4;
                  puVar42 = puVar42 + 4;
                } while (puVar25 < (undefined8 *)((long)puVar43 + uVar49));
              }
            }
          }
        }
        else {
          uVar48 = *puVar42;
          puVar43[1] = puVar42[1];
          *puVar43 = uVar48;
          if (0x10 < uVar49) {
            puVar25 = puVar43 + 2;
            do {
              uVar48 = puVar42[2];
              puVar25[1] = puVar42[3];
              *puVar25 = uVar48;
              uVar48 = puVar42[4];
              puVar25[3] = puVar42[5];
              puVar25[2] = uVar48;
              puVar25 = puVar25 + 4;
              puVar42 = puVar42 + 4;
            } while (puVar25 < (undefined8 *)((long)puVar43 + uVar49));
          }
        }
      }
joined_r0x00154e58:
      if ((undefined1 *)0xffffffffffffff88 < puVar29) {
        return puVar29;
      }
      puVar31 = (undefined8 *)((long)puVar31 + (long)puVar29);
      iVar44 = iVar44 + -1;
    } while (iVar44 != 0);
code_r0x00155070:
    if (puStack_e8 != param_5) {
      return (undefined1 *)0xffffffffffffffec;
    }
    if (uStack_f0 != 0x40) {
      return (undefined1 *)0xffffffffffffffec;
    }
    *(ulong *)((long)plVar15 + 0x683c) = CONCAT44((int)auStack_a0[1],(int)auStack_a0[0]);
    *(int *)((long)plVar15 + 0x6844) = (int)auStack_a0[2];
    iVar27 = (int)plVar15[0xed4];
    puVar40 = puStack_88;
joined_r0x00153fc8:
    puStack_88 = puVar40;
    if (iVar27 == 2) {
      uVar20 = (long)puVar45 - (long)puVar40;
      if ((ulong)((long)puVar21 - (long)puVar31) < uVar20) {
        return (undefined1 *)0xffffffffffffffba;
      }
      if (puVar31 != (undefined8 *)0x0) {
        _memmove(puVar31,puVar40,uVar20);
        puVar31 = (undefined8 *)((long)puVar31 + uVar20);
      }
      puVar40 = (undefined8 *)((long)plVar15 + 0x76a4);
      puVar45 = (undefined8 *)((long)plVar15 + 0x176a4);
      *(undefined4 *)(plVar15 + 0xed4) = 0;
    }
    uVar20 = (long)puVar45 - (long)puVar40;
    if ((ulong)((long)puVar21 - (long)puVar31) < uVar20) {
      return (undefined1 *)0xffffffffffffffba;
    }
    if (puVar31 == (undefined8 *)0x0) {
      puVar21 = (undefined1 *)0x0;
    }
    else {
      _memcpy(puVar31,puVar40,uVar20);
      puVar21 = (undefined1 *)((long)puVar31 + uVar20);
    }
    return puVar21 + -(long)puVar14;
  }
  puVar29 = (undefined1 *)plVar15[0xed3];
  if (puVar29 < (undefined1 *)((long)puStack_88 + uVar49)) goto code_r0x001547d8;
code_r0x00154484:
  puVar42 = (undefined8 *)((long)puStack_88 + uVar49);
  if ((puVar45 < puVar42) ||
     (puVar29 = (undefined1 *)(uVar49 + uVar47),
     puVar42 + -4 < (undefined8 *)((long)puVar31 + (long)puVar29))) {
    uStack_80 = uVar49;
    uStack_78 = uVar47;
    uStack_70 = uVar17;
    puVar29 = (undefined1 *)
              func_0x00156308(puVar31,puVar21,puVar42 + -4,&uStack_80,&puStack_88,puVar45,puVar40,
                              lVar24,uVar20);
  }
  else {
    puVar25 = (undefined8 *)((long)puVar31 + uVar49);
    uVar48 = *puStack_88;
    puVar31[1] = puStack_88[1];
    *puVar31 = uVar48;
    if (0x10 < uVar49) {
      uVar48 = puStack_88[2];
      puVar31[3] = puStack_88[3];
      puVar31[2] = uVar48;
      if (0x10 < uVar49 - 0x10) {
        puVar23 = puVar31 + 4;
        puVar26 = puStack_88 + 6;
        do {
          uVar48 = puVar26[-2];
          puVar23[1] = puVar26[-1];
          *puVar23 = uVar48;
          uVar48 = *puVar26;
          puVar23[3] = puVar26[1];
          puVar23[2] = uVar48;
          puVar23 = puVar23 + 4;
          puVar26 = puVar26 + 4;
        } while (puVar23 < puVar25);
      }
    }
    puStack_88 = puVar42;
    puVar42 = (undefined8 *)((long)puVar25 - uVar17);
    if ((ulong)((long)puVar25 - (long)puVar40) < uVar17) {
      if ((ulong)((long)puVar25 - lVar24) < uVar17) {
        return (undefined1 *)0xffffffffffffffec;
      }
      lVar41 = (long)((long)puVar25 - uVar17) - (long)puVar40;
      lVar36 = uVar20 + lVar41;
      if (lVar36 + uVar47 <= uVar20) {
        _memmove(puVar25,lVar36,uVar47);
        goto LAB_00154570;
      }
      _memmove(puVar25,lVar36,-lVar41);
      puVar25 = (undefined8 *)((long)puVar25 - lVar41);
      uVar47 = lVar41 + uVar47;
      puVar42 = puVar40;
    }
    if (uVar17 < 0x10) {
      if (uVar17 < 8) {
        iVar44 = *(int *)(&UNK_008143b0 + uVar17 * 4);
        *(undefined1 *)puVar25 = *(undefined1 *)puVar42;
        *(undefined1 *)((long)puVar25 + 1) = *(undefined1 *)((long)puVar42 + 1);
        *(undefined1 *)((long)puVar25 + 2) = *(undefined1 *)((long)puVar42 + 2);
        *(undefined1 *)((long)puVar25 + 3) = *(undefined1 *)((long)puVar42 + 3);
        puVar7 = (undefined4 *)((long)puVar42 + (ulong)*(uint *)(&UNK_00814390 + uVar17 * 4));
        puVar42 = (undefined8 *)((long)puVar7 - (long)iVar44);
        *(undefined4 *)((long)puVar25 + 4) = *puVar7;
      }
      else {
        *puVar25 = *puVar42;
      }
      if (8 < uVar47) {
        puVar23 = puVar42 + 1;
        puVar26 = puVar25 + 1;
        if ((long)puVar26 - (long)puVar23 < 0x10) {
          do {
            puVar42 = puVar26 + 1;
            *puVar26 = *puVar23;
            puVar23 = puVar23 + 1;
            puVar26 = puVar42;
          } while (puVar42 < (undefined8 *)((long)puVar25 + uVar47));
        }
        else {
          uVar48 = *puVar23;
          puVar25[2] = puVar42[2];
          *puVar26 = uVar48;
          if (0x10 < uVar47 - 8) {
            puVar23 = puVar25 + 3;
            puVar42 = puVar42 + 5;
            do {
              uVar48 = puVar42[-2];
              puVar23[1] = puVar42[-1];
              *puVar23 = uVar48;
              uVar48 = *puVar42;
              puVar23[3] = puVar42[1];
              puVar23[2] = uVar48;
              puVar23 = puVar23 + 4;
              puVar42 = puVar42 + 4;
            } while (puVar23 < (undefined8 *)((long)puVar25 + uVar47));
          }
        }
      }
    }
    else {
      uVar48 = *puVar42;
      puVar25[1] = puVar42[1];
      *puVar25 = uVar48;
      if (0x10 < uVar47) {
        puVar23 = puVar25 + 2;
        do {
          uVar48 = puVar42[2];
          puVar23[1] = puVar42[3];
          *puVar23 = uVar48;
          uVar48 = puVar42[4];
          puVar23[3] = puVar42[5];
          puVar23[2] = uVar48;
          puVar23 = puVar23 + 4;
          puVar42 = puVar42 + 4;
        } while (puVar23 < (undefined8 *)((long)puVar25 + uVar47));
      }
    }
  }
LAB_00154570:
  if ((undefined1 *)0xffffffffffffff88 < puVar29) {
    return puVar29;
  }
  puVar31 = (undefined8 *)((long)puVar31 + (long)puVar29);
  uVar22 = (ulong)(iVar46 - 1U);
  if (iVar46 - 1U == 0) goto code_r0x00155070;
  goto LAB_00154284;
}

