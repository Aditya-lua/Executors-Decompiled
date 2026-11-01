
/* WARNING: Type propagation algorithm not settling */

undefined * FUN_001535fc(void)

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
  undefined1 in_ZR;
  undefined1 in_CY;
  bool bVar13;
  undefined8 *puVar14;
  long *plVar15;
  undefined8 *puVar16;
  ulong uVar17;
  undefined8 *puVar18;
  ulong uVar19;
  ulong *in_x3;
  undefined8 *in_x4;
  undefined *puVar20;
  ulong *puVar21;
  ulong uVar22;
  undefined1 *puVar23;
  ulong uVar24;
  undefined8 *puVar25;
  long lVar26;
  undefined8 *puVar27;
  undefined8 *puVar28;
  int iVar29;
  ulong *puVar30;
  undefined1 *puVar31;
  ulong uVar32;
  ulong *puVar33;
  uint uVar34;
  undefined *puVar35;
  undefined1 *puVar36;
  long lVar37;
  ulong uVar38;
  undefined *puVar39;
  undefined1 *puVar40;
  uint unaff_w19;
  undefined8 *puVar41;
  undefined8 *unaff_x20;
  undefined *unaff_x21;
  long unaff_x22;
  long lVar42;
  undefined8 *unaff_x23;
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
    if (!(bool)in_CY || (bool)in_ZR) {
      puVar45 = unaff_x28;
      goto LAB_001537a0;
    }
    puVar18 = (undefined8 *)-unaff_x22;
    _memmove(unaff_x20);
    unaff_x20 = (undefined8 *)((long)unaff_x20 - unaff_x22);
    puVar45 = (undefined8 *)(unaff_x22 + (long)unaff_x28);
    puVar16 = unaff_x23;
    do {
      puVar43 = unaff_x26;
      uVar22 = uStack0000000000000128;
      puVar14 = in_stack_00000080;
      if (unaff_x27 < &MACH_HEADER.ncmds) {
        if ((undefined8 *)((long)&MACH_HEADER.cputype + 3) < unaff_x27) {
          *unaff_x20 = *unaff_x23;
        }
        else {
          iVar29 = *(int *)(&UNK_008143b0 + (long)unaff_x27 * 4);
          *(undefined1 *)unaff_x20 = *(undefined1 *)unaff_x23;
          *(undefined1 *)((long)unaff_x20 + 1) = *(undefined1 *)((long)unaff_x23 + 1);
          *(undefined1 *)((long)unaff_x20 + 2) = *(undefined1 *)((long)unaff_x23 + 2);
          *(undefined1 *)((long)unaff_x20 + 3) = *(undefined1 *)((long)unaff_x23 + 3);
          puVar7 = (undefined4 *)
                   ((long)unaff_x23 + (ulong)*(uint *)(&UNK_00814390 + (long)unaff_x27 * 4));
          unaff_x23 = (undefined8 *)((long)puVar7 - (long)iVar29);
          *(undefined4 *)((long)unaff_x20 + 4) = *puVar7;
        }
        puVar16 = in_stack_000000a0;
        if ((undefined8 *)((long)&MACH_HEADER.cpusubtype + 1) <= puVar45) {
          puVar41 = unaff_x23 + 1;
          puVar27 = unaff_x20 + 1;
          if ((long)puVar27 - (long)puVar41 < 0x10) {
            do {
              puVar25 = puVar27 + 1;
              *puVar27 = *puVar41;
              puVar41 = puVar41 + 1;
              puVar27 = puVar25;
            } while (puVar25 < (undefined8 *)((long)unaff_x20 + (long)puVar45));
          }
          else {
            uVar48 = *puVar41;
            unaff_x20[2] = unaff_x23[2];
            *puVar27 = uVar48;
            if ((undefined8 *)((long)&MACH_HEADER.ncmds + 1) <= puVar45 + -1) {
              puVar41 = unaff_x20 + 3;
              puVar27 = unaff_x23 + 5;
              do {
                uVar48 = puVar27[-2];
                puVar41[1] = puVar27[-1];
                *puVar41 = uVar48;
                uVar48 = *puVar27;
                puVar41[3] = puVar27[1];
                puVar41[2] = uVar48;
                puVar41 = puVar41 + 4;
                puVar27 = puVar27 + 4;
              } while (puVar41 < (undefined8 *)((long)unaff_x20 + (long)puVar45));
            }
          }
        }
      }
      else {
        uVar48 = *unaff_x23;
        unaff_x20[1] = unaff_x23[1];
        *unaff_x20 = uVar48;
        if (&MACH_HEADER.ncmds < puVar45) {
          puVar41 = unaff_x20 + 2;
          do {
            uVar48 = unaff_x23[2];
            puVar41[1] = unaff_x23[3];
            *puVar41 = uVar48;
            uVar48 = unaff_x23[4];
            puVar41[3] = unaff_x23[5];
            puVar41[2] = uVar48;
            puVar41 = puVar41 + 4;
            unaff_x23 = unaff_x23 + 4;
          } while (puVar41 < (undefined8 *)((long)unaff_x20 + (long)puVar45));
        }
      }
joined_r0x001537bc:
      in_stack_00000080 = puVar18;
      uVar24 = (ulong)in_stack_00000050._4_4_;
      uStack0000000000000128 = uVar22;
      if ((undefined *)0xffffffffffffff88 < unaff_x24) goto LAB_00153e60;
      unaff_x26 = (undefined8 *)((long)puVar43 + (long)unaff_x24);
      puVar18 = in_stack_00000080;
      in_stack_00000080 = puVar14;
      puVar41 = (undefined8 *)uStack0000000000000120;
joined_r0x001537cc:
      unaff_w19 = unaff_w19 + 1;
      puVar43 = unaff_x26;
      uStack0000000000000120 = (ulong)puVar41;
      uStack0000000000000128 = uVar22;
      if (unaff_w19 == in_stack_00000050._4_4_) {
        uVar24 = (ulong)in_stack_00000050._4_4_;
        *in_stack_00000068 = CONCAT44(in_stack_00000110,in_stack_00000108);
        *(undefined4 *)(in_stack_00000068 + 1) = in_stack_00000118;
        unaff_x25 = in_stack_00000038;
        if (*(int *)((long)in_stack_00000068 + 0xe64) == 2) {
          uVar22 = (long)in_stack_00000080 - (long)puVar41;
          if (uVar22 <= (ulong)(in_stack_00000078 - (long)unaff_x26)) {
            if (unaff_x26 != (undefined8 *)0x0) {
              _memmove(unaff_x26,puVar41,uVar22);
              unaff_x26 = (undefined8 *)((long)unaff_x26 + uVar22);
            }
            puVar41 = (undefined8 *)(&UNK_000076a4 + in_stack_00000038);
            in_stack_00000080 = (undefined8 *)(&UNK_000176a4 + in_stack_00000038);
            puVar43 = unaff_x26;
            goto code_r0x00152000;
          }
        }
        else {
code_r0x00152000:
          puVar41 = (undefined8 *)((long)in_stack_00000080 - (long)puVar41);
          if (puVar41 <= (undefined8 *)(in_stack_00000078 - (long)puVar43)) {
            if (puVar43 == (undefined8 *)0x0) {
              puVar20 = (undefined *)0x0;
            }
            else {
              in_stack_00000080 = puVar41;
              _memmove(puVar43);
              puVar20 = (undefined *)((long)puVar43 + (long)puVar41);
            }
            unaff_x24 = puVar20 + -in_stack_00000020;
            goto LAB_00153e60;
          }
        }
code_r0x00152014:
        unaff_x24 = (undefined *)0xffffffffffffffba;
        goto LAB_00153e60;
      }
      uVar24 = (ulong)in_stack_00000050._4_4_;
      puVar21 = (ulong *)(unaff_x25 + (ulong)(unaff_w19 & 7) * 0x18);
      puVar14 = in_stack_00000080;
      if (*(int *)((long)in_stack_00000068 + 0xe64) == 2) {
        uStack0000000000000128 = *puVar21;
        puVar27 = *(undefined8 **)(&UNK_00007698 + in_stack_00000038);
        uStack0000000000000120 = (long)puVar41 + uStack0000000000000128;
        if (puVar27 < uStack0000000000000120) {
          uVar49 = (long)puVar27 - (long)puVar41;
          if (uVar49 != 0) {
            in_stack_00000080 = puVar18;
            uStack0000000000000120 = (ulong)puVar41;
            uStack0000000000000128 = uVar22;
            if ((ulong)(in_stack_00000078 - (long)unaff_x26) < uVar49) goto code_r0x00152014;
            uVar47 = (long)unaff_x26 - (long)puVar41;
            puVar43 = (undefined8 *)((long)unaff_x26 + uVar49);
            if (((long)uVar47 < -7) && (7 < uVar49)) {
              if (uVar47 < 0xfffffffffffffff0) {
                puVar45 = puVar43 + -4;
                if (puVar45 < unaff_x26) goto code_r0x001537d4;
                uVar48 = *puVar41;
                unaff_x26[1] = puVar41[1];
                *unaff_x26 = uVar48;
                if (0x10 < (ulong)((long)puVar45 - (long)unaff_x26)) {
                  puVar14 = unaff_x26 + 2;
                  puVar27 = puVar41;
                  do {
                    uVar48 = puVar27[2];
                    puVar14[1] = puVar27[3];
                    *puVar14 = uVar48;
                    uVar48 = puVar27[4];
                    puVar14[3] = puVar27[5];
                    puVar14[2] = uVar48;
                    puVar14 = puVar14 + 4;
                    puVar27 = puVar27 + 4;
                  } while (puVar14 < puVar45);
                }
                puVar41 = (undefined8 *)((long)puVar41 + ((long)puVar45 - (long)unaff_x26));
              }
              else {
code_r0x001537d4:
                puVar45 = unaff_x26;
                if ((long)uVar49 < 1) goto LAB_00153934;
              }
              puVar20 = (undefined *)((long)unaff_x26 + (uVar49 - (long)puVar45));
              if ((puVar20 < (undefined *)0x8) || ((ulong)((long)puVar45 - (long)puVar41) < 0x40)) {
                puVar14 = puVar45;
              }
              else {
                if (puVar20 < (undefined *)0x40) {
                  puVar35 = (undefined *)0x0;
                }
                else {
                  puVar35 = (undefined *)((ulong)puVar20 & 0xffffffffffffffc0);
                  puVar14 = puVar45 + 4;
                  puVar27 = puVar41 + 4;
                  puVar39 = puVar35;
                  do {
                    uVar48 = puVar27[-4];
                    uVar51 = puVar27[-1];
                    uVar50 = puVar27[-2];
                    uVar53 = puVar27[1];
                    uVar52 = *puVar27;
                    uVar55 = puVar27[3];
                    uVar54 = puVar27[2];
                    puVar14[-3] = puVar27[-3];
                    puVar14[-4] = uVar48;
                    puVar14[-1] = uVar51;
                    puVar14[-2] = uVar50;
                    puVar14[1] = uVar53;
                    *puVar14 = uVar52;
                    puVar14[3] = uVar55;
                    puVar14[2] = uVar54;
                    puVar39 = puVar39 + -0x40;
                    puVar14 = puVar14 + 8;
                    puVar27 = puVar27 + 8;
                  } while (puVar39 != (undefined *)0x0);
                  if (puVar20 == puVar35) goto LAB_00153934;
                  if (((ulong)puVar20 & 0x38) == 0) {
                    puVar41 = (undefined8 *)((long)puVar41 + (long)puVar35);
                    puVar14 = (undefined8 *)((long)puVar45 + (long)puVar35);
                    goto LAB_00153904;
                  }
                }
                puVar39 = (undefined *)((ulong)puVar20 & 0xfffffffffffffff8);
                lVar26 = (long)puVar35 - (long)puVar39;
                puVar14 = (undefined8 *)((long)puVar45 + (long)puVar35);
                puVar27 = (undefined8 *)((long)puVar41 + (long)puVar35);
                do {
                  *puVar14 = *puVar27;
                  lVar26 = lVar26 + 8;
                  puVar14 = puVar14 + 1;
                  puVar27 = puVar27 + 1;
                } while (lVar26 != 0);
                puVar14 = (undefined8 *)((long)puVar45 + (long)puVar39);
                puVar41 = (undefined8 *)((long)puVar41 + (long)puVar39);
                if (puVar20 == puVar39) goto LAB_00153934;
              }
LAB_00153904:
              do {
                puVar27 = (undefined8 *)((long)puVar14 + 1);
                *(undefined1 *)puVar14 = *(undefined1 *)puVar41;
                puVar14 = puVar27;
                puVar41 = (undefined8 *)((long)puVar41 + 1);
              } while (puVar27 != (undefined8 *)((long)puVar45 + (long)puVar20));
            }
            else if (0 < (long)uVar49) {
              puVar20 = (undefined *)((long)unaff_x26 + (long)puVar27) + -(long)puVar41;
              if (puVar20 <= (undefined *)((long)unaff_x26 + 1)) {
                puVar20 = (undefined *)((long)unaff_x26 + 1);
              }
              uVar19 = (long)puVar20 - (long)unaff_x26;
              if ((7 < uVar19) && (0x3f < uVar47)) {
                if (uVar19 < 0x40) {
                  uVar17 = 0;
                }
                else {
                  uVar17 = uVar19 & 0xffffffffffffffc0;
                  puVar45 = unaff_x26 + 4;
                  puVar14 = puVar41 + 4;
                  uVar47 = uVar17;
                  do {
                    uVar48 = puVar14[-4];
                    uVar51 = puVar14[-1];
                    uVar50 = puVar14[-2];
                    uVar53 = puVar14[1];
                    uVar52 = *puVar14;
                    uVar55 = puVar14[3];
                    uVar54 = puVar14[2];
                    puVar45[-3] = puVar14[-3];
                    puVar45[-4] = uVar48;
                    puVar45[-1] = uVar51;
                    puVar45[-2] = uVar50;
                    puVar45[1] = uVar53;
                    *puVar45 = uVar52;
                    puVar45[3] = uVar55;
                    puVar45[2] = uVar54;
                    uVar47 = uVar47 - 0x40;
                    puVar45 = puVar45 + 8;
                    puVar14 = puVar14 + 8;
                  } while (uVar47 != 0);
                  if (uVar19 == uVar17) goto LAB_00153934;
                  if ((uVar19 & 0x38) == 0) {
                    puVar41 = (undefined8 *)((long)puVar41 + uVar17);
                    unaff_x26 = (undefined8 *)((long)unaff_x26 + uVar17);
                    goto code_r0x00153924;
                  }
                }
                uVar47 = uVar19 & 0xfffffffffffffff8;
                lVar26 = uVar17 - uVar47;
                puVar45 = (undefined8 *)((long)puVar41 + uVar17);
                puVar14 = (undefined8 *)((long)unaff_x26 + uVar17);
                do {
                  *puVar14 = *puVar45;
                  lVar26 = lVar26 + 8;
                  puVar45 = puVar45 + 1;
                  puVar14 = puVar14 + 1;
                } while (lVar26 != 0);
                unaff_x26 = (undefined8 *)((long)unaff_x26 + uVar47);
                puVar41 = (undefined8 *)((long)puVar41 + uVar47);
                if (uVar19 == uVar47) goto LAB_00153934;
              }
code_r0x00153924:
              do {
                puVar45 = (undefined8 *)((long)unaff_x26 + 1);
                *(undefined1 *)unaff_x26 = *(undefined1 *)puVar41;
                unaff_x26 = puVar45;
                puVar41 = (undefined8 *)((long)puVar41 + 1);
              } while (puVar45 < puVar43);
            }
LAB_00153934:
            uStack0000000000000128 = *puVar21 - uVar49;
            *puVar21 = uStack0000000000000128;
          }
          *(undefined4 *)((long)in_stack_00000068 + 0xe64) = 0;
          puVar14 = (undefined8 *)puVar21[1];
          puVar45 = (undefined8 *)puVar21[2];
          unaff_x27 = (undefined8 *)((long)puVar43 + uStack0000000000000128);
          puVar41 = (undefined8 *)((long)unaff_x27 - (long)puVar45);
          Hint_Prefetch(puVar41,0,0,0);
          unaff_x24 = (undefined *)((long)puVar14 + uStack0000000000000128);
          uStack0000000000000120 = (long)in_stack_00000060 + uStack0000000000000128;
          if (in_stack_00000098 < uStack0000000000000120 ||
              unaff_x21 < (undefined *)((long)puVar43 + (long)unaff_x24)) {
            in_stack_00000080 = &uStack0000000000000128;
            in_x3 = &uStack0000000000000120;
            in_x4 = in_stack_00000098;
            uStack0000000000000120 = (ulong)in_stack_00000060;
            in_stack_00000130 = puVar14;
            in_stack_00000138 = puVar45;
            unaff_x24 = (undefined *)func_0x00155c78(puVar43,in_stack_00000078);
            uVar22 = uStack0000000000000128;
            puVar16 = in_stack_000000a0;
          }
          else {
            uVar48 = *in_stack_00000060;
            puVar43[1] = in_stack_00000060[1];
            *puVar43 = uVar48;
            if (0x10 < uStack0000000000000128) {
              uVar48 = in_stack_00000060[2];
              puVar43[3] = in_stack_00000060[3];
              puVar43[2] = uVar48;
              if (0x10 < uStack0000000000000128 - 0x10) {
                puVar27 = puVar43 + 4;
                puVar25 = in_stack_00000090;
                do {
                  uVar48 = puVar25[-2];
                  puVar27[1] = puVar25[-1];
                  *puVar27 = uVar48;
                  uVar48 = *puVar25;
                  puVar27[3] = puVar25[1];
                  puVar27[2] = uVar48;
                  puVar27 = puVar27 + 4;
                  puVar25 = puVar25 + 4;
                } while (puVar27 < unaff_x27);
              }
            }
            uStack0000000000000128 = uVar22;
            if ((undefined8 *)((long)unaff_x27 - (long)puVar16) < puVar45) {
              if ((undefined8 *)((long)unaff_x27 - in_stack_00000070) < puVar45) goto LAB_00153e5c;
              lVar26 = (long)puVar41 - (long)puVar16;
              if (in_stack_000000a8 + lVar26 + (long)puVar14 <= in_stack_000000a8) {
                _memmove(unaff_x27);
                in_stack_00000080 = puVar14;
                uVar22 = uStack0000000000000128;
                goto joined_r0x00153b5c;
              }
              puVar18 = (undefined8 *)-lVar26;
              _memmove(unaff_x27);
              unaff_x27 = (undefined8 *)((long)unaff_x27 - lVar26);
              puVar14 = (undefined8 *)(lVar26 + (long)puVar14);
              puVar41 = puVar16;
            }
            in_stack_00000080 = puVar18;
            uVar22 = uStack0000000000000128;
            if (puVar45 < &MACH_HEADER.ncmds) {
              if ((undefined8 *)((long)&MACH_HEADER.cputype + 3) < puVar45) {
                *unaff_x27 = *puVar41;
              }
              else {
                iVar29 = *(int *)(&UNK_008143b0 + (long)puVar45 * 4);
                *(undefined1 *)unaff_x27 = *(undefined1 *)puVar41;
                *(undefined1 *)((long)unaff_x27 + 1) = *(undefined1 *)((long)puVar41 + 1);
                *(undefined1 *)((long)unaff_x27 + 2) = *(undefined1 *)((long)puVar41 + 2);
                *(undefined1 *)((long)unaff_x27 + 3) = *(undefined1 *)((long)puVar41 + 3);
                puVar7 = (undefined4 *)
                         ((long)puVar41 + (ulong)*(uint *)(&UNK_00814390 + (long)puVar45 * 4));
                puVar41 = (undefined8 *)((long)puVar7 - (long)iVar29);
                *(undefined4 *)((long)unaff_x27 + 4) = *puVar7;
              }
              puVar16 = in_stack_000000a0;
              if (&MACH_HEADER.cpusubtype < puVar14) {
                puVar18 = puVar41 + 1;
                puVar27 = unaff_x27 + 1;
                if ((long)puVar27 - (long)puVar18 < 0x10) {
                  do {
                    puVar41 = puVar27 + 1;
                    *puVar27 = *puVar18;
                    puVar18 = puVar18 + 1;
                    puVar27 = puVar41;
                  } while (puVar41 < (undefined8 *)((long)unaff_x27 + (long)puVar14));
                }
                else {
                  uVar48 = *puVar18;
                  unaff_x27[2] = puVar41[2];
                  *puVar27 = uVar48;
                  if (&MACH_HEADER.ncmds < puVar14 + -1) {
                    puVar18 = unaff_x27 + 3;
                    puVar41 = puVar41 + 5;
                    do {
                      uVar48 = puVar41[-2];
                      puVar18[1] = puVar41[-1];
                      *puVar18 = uVar48;
                      uVar48 = *puVar41;
                      puVar18[3] = puVar41[1];
                      puVar18[2] = uVar48;
                      puVar18 = puVar18 + 4;
                      puVar41 = puVar41 + 4;
                    } while (puVar18 < (undefined8 *)((long)unaff_x27 + (long)puVar14));
                  }
                }
              }
            }
            else {
              uVar48 = *puVar41;
              unaff_x27[1] = puVar41[1];
              *unaff_x27 = uVar48;
              if (&MACH_HEADER.ncmds < puVar14) {
                puVar18 = unaff_x27 + 2;
                do {
                  uVar48 = puVar41[2];
                  puVar18[1] = puVar41[3];
                  *puVar18 = uVar48;
                  uVar48 = puVar41[4];
                  puVar18[3] = puVar41[5];
                  puVar18[2] = uVar48;
                  puVar18 = puVar18 + 4;
                  puVar41 = puVar41 + 4;
                } while (puVar18 < (undefined8 *)((long)unaff_x27 + (long)puVar14));
              }
            }
          }
joined_r0x00153b5c:
          uVar24 = (ulong)in_stack_00000050._4_4_;
          uStack0000000000000128 = uVar22;
          if (unaff_x24 < (undefined *)0xffffffffffffff89) goto code_r0x00153a58;
          goto LAB_00153e60;
        }
        puVar18 = (undefined8 *)(uStack0000000000000120 + -0x20);
        unaff_x28 = (undefined8 *)puVar21[1];
        unaff_x27 = (undefined8 *)puVar21[2];
        unaff_x24 = (undefined *)((long)unaff_x28 + uStack0000000000000128);
        if (!(in_stack_00000080 < uStack0000000000000120 ||
             puVar18 < (undefined8 *)((long)unaff_x26 + (long)unaff_x24))) {
          unaff_x20 = (undefined8 *)((long)unaff_x26 + uStack0000000000000128);
          uVar48 = *puVar41;
          unaff_x26[1] = puVar41[1];
          *unaff_x26 = uVar48;
          if (0x10 < uStack0000000000000128) {
            uVar48 = puVar41[2];
            unaff_x26[3] = puVar41[3];
            unaff_x26[2] = uVar48;
            if (0x10 < uStack0000000000000128 - 0x10) {
              puVar45 = unaff_x26 + 4;
              puVar41 = puVar41 + 6;
              do {
                uVar48 = puVar41[-2];
                puVar45[1] = puVar41[-1];
                *puVar45 = uVar48;
                uVar48 = *puVar41;
                puVar45[3] = puVar41[1];
                puVar45[2] = uVar48;
                puVar45 = puVar45 + 4;
                puVar41 = puVar41 + 4;
              } while (puVar45 < unaff_x20);
            }
          }
          puVar41 = (undefined8 *)((long)unaff_x20 - (long)unaff_x27);
          uStack0000000000000128 = uVar22;
          if ((undefined8 *)((long)unaff_x20 - (long)puVar16) < unaff_x27) {
            puVar45 = unaff_x20;
            if ((undefined8 *)((long)unaff_x20 - in_stack_00000070) < unaff_x27) goto LAB_00153e5c;
            lVar26 = ((long)unaff_x20 - (long)unaff_x27) - (long)puVar16;
            if (in_stack_000000a8 + lVar26 + (long)unaff_x28 <= in_stack_000000a8) {
              unaff_x23 = puVar16;
LAB_001537a0:
              _memmove(unaff_x20);
              puVar18 = unaff_x28;
              puVar43 = unaff_x26;
              puVar16 = unaff_x23;
              puVar14 = in_stack_00000080;
              uVar22 = uStack0000000000000128;
              goto joined_r0x001537bc;
            }
            puVar18 = (undefined8 *)-lVar26;
            _memmove(unaff_x20);
            unaff_x20 = (undefined8 *)((long)unaff_x20 - lVar26);
            unaff_x28 = (undefined8 *)(lVar26 + (long)unaff_x28);
            puVar41 = puVar16;
          }
          puVar45 = unaff_x20;
          uVar22 = uStack0000000000000128;
          if (unaff_x27 < &MACH_HEADER.ncmds) {
            if ((undefined8 *)((long)&MACH_HEADER.cputype + 3) < unaff_x27) {
              *unaff_x20 = *puVar41;
            }
            else {
              iVar29 = *(int *)(&UNK_008143b0 + (long)unaff_x27 * 4);
              *(undefined1 *)unaff_x20 = *(undefined1 *)puVar41;
              *(undefined1 *)((long)unaff_x20 + 1) = *(undefined1 *)((long)puVar41 + 1);
              *(undefined1 *)((long)unaff_x20 + 2) = *(undefined1 *)((long)puVar41 + 2);
              *(undefined1 *)((long)unaff_x20 + 3) = *(undefined1 *)((long)puVar41 + 3);
              puVar7 = (undefined4 *)
                       ((long)puVar41 + (ulong)*(uint *)(&UNK_00814390 + (long)unaff_x27 * 4));
              puVar41 = (undefined8 *)((long)puVar7 - (long)iVar29);
              *(undefined4 *)((long)unaff_x20 + 4) = *puVar7;
            }
            puVar16 = in_stack_000000a0;
            if (&MACH_HEADER.cpusubtype < unaff_x28) {
              puVar27 = puVar41 + 1;
              puVar25 = unaff_x20 + 1;
              if ((long)puVar25 - (long)puVar27 < 0x10) {
                do {
                  puVar41 = puVar25 + 1;
                  *puVar25 = *puVar27;
                  puVar27 = puVar27 + 1;
                  puVar25 = puVar41;
                } while (puVar41 < (undefined8 *)((long)unaff_x20 + (long)unaff_x28));
              }
              else {
                uVar48 = *puVar27;
                unaff_x20[2] = puVar41[2];
                *puVar25 = uVar48;
                if (&MACH_HEADER.ncmds < unaff_x28 + -1) {
                  puVar27 = unaff_x20 + 3;
                  puVar41 = puVar41 + 5;
                  do {
                    uVar48 = puVar41[-2];
                    puVar27[1] = puVar41[-1];
                    *puVar27 = uVar48;
                    uVar48 = *puVar41;
                    puVar27[3] = puVar41[1];
                    puVar27[2] = uVar48;
                    puVar27 = puVar27 + 4;
                    puVar41 = puVar41 + 4;
                  } while (puVar27 < (undefined8 *)((long)unaff_x20 + (long)unaff_x28));
                }
              }
            }
          }
          else {
            uVar48 = *puVar41;
            unaff_x20[1] = puVar41[1];
            *unaff_x20 = uVar48;
            if (&MACH_HEADER.ncmds < unaff_x28) {
              puVar27 = unaff_x20 + 2;
              do {
                uVar48 = puVar41[2];
                puVar27[1] = puVar41[3];
                *puVar27 = uVar48;
                uVar48 = puVar41[4];
                puVar27[3] = puVar41[5];
                puVar27[2] = uVar48;
                puVar27 = puVar27 + 4;
                puVar41 = puVar41 + 4;
              } while (puVar27 < (undefined8 *)((long)unaff_x20 + (long)unaff_x28));
            }
          }
          goto joined_r0x001537bc;
        }
        in_x3 = &uStack0000000000000128;
        in_x4 = &uStack0000000000000120;
        uStack0000000000000120 = (ulong)puVar41;
        in_stack_00000130 = unaff_x28;
        in_stack_00000138 = unaff_x27;
        unaff_x24 = (undefined *)func_0x00156308(unaff_x26,in_stack_00000078);
        puVar16 = in_stack_000000a0;
        uVar22 = uStack0000000000000128;
        goto joined_r0x001537bc;
      }
      uStack0000000000000128 = *puVar21;
      puVar45 = (undefined8 *)puVar21[1];
      unaff_x27 = (undefined8 *)puVar21[2];
      unaff_x20 = (undefined8 *)((long)unaff_x26 + uStack0000000000000128);
      unaff_x23 = (undefined8 *)((long)unaff_x20 - (long)unaff_x27);
      Hint_Prefetch(unaff_x23,0,0,0);
      unaff_x24 = (undefined *)((long)puVar45 + uStack0000000000000128);
      uStack0000000000000120 = (long)puVar41 + uStack0000000000000128;
      if (in_stack_00000080 < uStack0000000000000120 ||
          unaff_x21 < (undefined *)((long)unaff_x26 + (long)unaff_x24)) {
        puVar18 = &uStack0000000000000128;
        in_x3 = &uStack0000000000000120;
        in_x4 = in_stack_00000080;
        uStack0000000000000120 = (ulong)puVar41;
        in_stack_00000130 = puVar45;
        in_stack_00000138 = unaff_x27;
        unaff_x24 = (undefined *)func_0x00155c78(unaff_x26,in_stack_00000078);
        puVar16 = in_stack_000000a0;
        uVar22 = uStack0000000000000128;
        goto joined_r0x001537bc;
      }
      uVar48 = *puVar41;
      unaff_x26[1] = puVar41[1];
      *unaff_x26 = uVar48;
      if (0x10 < uStack0000000000000128) {
        uVar48 = puVar41[2];
        unaff_x26[3] = puVar41[3];
        unaff_x26[2] = uVar48;
        if (0x10 < uStack0000000000000128 - 0x10) {
          puVar14 = unaff_x26 + 4;
          puVar41 = puVar41 + 6;
          do {
            uVar48 = puVar41[-2];
            puVar14[1] = puVar41[-1];
            *puVar14 = uVar48;
            uVar48 = *puVar41;
            puVar14[3] = puVar41[1];
            puVar14[2] = uVar48;
            puVar14 = puVar14 + 4;
            puVar41 = puVar41 + 4;
          } while (puVar14 < unaff_x20);
        }
      }
      uStack0000000000000128 = uVar22;
    } while (unaff_x27 <= (undefined8 *)((long)unaff_x20 - (long)puVar16));
    if ((undefined8 *)((long)unaff_x20 - in_stack_00000070) < unaff_x27) goto LAB_00153e5c;
    unaff_x22 = (long)unaff_x23 - (long)puVar16;
    in_CY = in_stack_000000a8 <= in_stack_000000a8 + unaff_x22 + (long)puVar45;
    in_ZR = in_stack_000000a8 + unaff_x22 + (long)puVar45 == in_stack_000000a8;
    unaff_x23 = puVar16;
    unaff_x28 = puVar45;
  } while( true );
code_r0x00153a58:
  unaff_x26 = (undefined8 *)((long)puVar43 + (long)unaff_x24);
  puVar18 = in_stack_00000080;
  in_stack_00000080 = in_stack_00000098;
  puVar41 = (undefined8 *)uStack0000000000000120;
  goto joined_r0x001537cc;
LAB_00153e5c:
  in_stack_00000080 = puVar18;
  unaff_x24 = (undefined *)0xffffffffffffffec;
  uStack0000000000000128 = uVar22;
LAB_00153e60:
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
    return unaff_x24;
  }
  auVar56 = ___stack_chk_fail();
  puVar14 = auVar56._8_8_;
  plVar15 = auVar56._0_8_;
  puStack_60 = puVar45;
  puStack_58 = unaff_x27;
  puStack_50 = puVar43;
  lStack_48 = unaff_x25;
  puStack_40 = unaff_x24;
  uStack_38 = 0x18;
  puStack_30 = in_stack_00000068;
  puVar23 = (undefined1 *)
            ((long)puVar14 +
            ((ulong)in_stack_00000080 & ((long)in_stack_00000080 >> 0x3f ^ 0xffffffffffffffffU)));
  puVar16 = (undefined8 *)plVar15[0xeb5];
  puStack_88 = puVar16;
  puVar45 = (undefined8 *)plVar15[0xed3];
  puVar18 = puVar14;
  if ((int)uVar24 == 0) {
    iVar29 = (int)plVar15[0xed4];
joined_r0x001550b0:
    puStack_88 = puVar16;
    if (iVar29 == 2) {
      uVar22 = (long)puVar45 - (long)puVar16;
      if ((ulong)((long)puVar23 - (long)puVar18) < uVar22) {
        return (undefined1 *)0xffffffffffffffba;
      }
      if (puVar18 != (undefined8 *)0x0) {
        _memmove(puVar18,puVar16,uVar22);
        puVar18 = (undefined8 *)((long)puVar18 + uVar22);
      }
      puVar16 = (undefined8 *)((long)plVar15 + 0x76a4);
      puVar45 = (undefined8 *)((long)plVar15 + 0x176a4);
      *(undefined4 *)(plVar15 + 0xed4) = 0;
    }
    uVar22 = (long)puVar45 - (long)puVar16;
    if ((ulong)((long)puVar23 - (long)puVar18) < uVar22) {
      return (undefined1 *)0xffffffffffffffba;
    }
    if (puVar18 == (undefined8 *)0x0) {
      puVar23 = (undefined1 *)0x0;
    }
    else {
      _memcpy(puVar18,puVar16,uVar22);
      puVar23 = (undefined1 *)((long)puVar18 + uVar22);
    }
    return puVar23 + -(long)puVar14;
  }
  puVar16 = (undefined8 *)plVar15[0xe99];
  lVar26 = plVar15[0xe9a];
  uVar22 = plVar15[0xe9b];
  *(undefined4 *)((long)plVar15 + 0x7534) = 1;
  uVar49 = *(ulong *)((long)plVar15 + 0x683c);
  auStack_a0[1] = uVar49 >> 0x20;
  auStack_a0[0] = uVar49 & 0xffffffff;
  auStack_a0[2] = (ulong)*(uint *)((long)plVar15 + 0x6844);
  if (in_x4 == (undefined8 *)0x0) {
    return (undefined1 *)0xffffffffffffffec;
  }
  puVar21 = in_x3 + 1;
  puVar43 = in_x4 + -1;
  if (in_x4 < &MACH_HEADER.cpusubtype) {
    uStack_f8 = (ulong)(byte)*in_x3;
    switch(in_x4) {
    case (undefined8 *)0x7:
      uStack_f8 = uStack_f8 | (ulong)*(byte *)((long)in_x3 + 6) << 0x30;
    case (undefined8 *)0x6:
      uStack_f8 = uStack_f8 + ((ulong)*(byte *)((long)in_x3 + 5) << 0x28);
    case (undefined8 *)0x5:
      uStack_f8 = uStack_f8 + ((ulong)*(byte *)((long)in_x3 + 4) << 0x20);
    case (undefined8 *)0x4:
      uStack_f8 = uStack_f8 + (ulong)*(byte *)((long)in_x3 + 3) * 0x1000000;
    case (undefined8 *)0x3:
      uStack_f8 = uStack_f8 + (ulong)*(byte *)((long)in_x3 + 2) * 0x10000;
    case (undefined8 *)0x2:
      uStack_f8 = uStack_f8 + (ulong)*(byte *)((long)in_x3 + 1) * 0x100;
    }
    if (((byte *)((long)in_x4 + (long)in_x3))[-1] == 0) {
      return (undefined1 *)0xffffffffffffffec;
    }
    puVar43 = (undefined8 *)0x0;
    iVar29 = (int)LZCOUNT((uint)((byte *)((long)in_x4 + (long)in_x3))[-1]) + (int)in_x4 * -8 + 0x29;
    puStack_e8 = in_x3;
  }
  else {
    puStack_e8 = (ulong *)((long)in_x3 + (long)puVar43);
    uStack_f8 = *puStack_e8;
    if (uStack_f8 >> 0x38 == 0) {
      return (undefined1 *)0xffffffffffffffec;
    }
    if ((undefined8 *)0xffffffffffffff88 < in_x4) {
      return (undefined1 *)0xffffffffffffffec;
    }
    iVar29 = (int)LZCOUNT((uint)(byte)(uStack_f8 >> 0x38)) + -0x17;
  }
  uVar8 = *(uint *)(*plVar15 + 4);
  uStack_f0 = uVar8 + iVar29;
  uStack_d0 = uStack_f8 >> ((ulong)-uStack_f0 & 0x3f) &
              (ulong)*(uint *)(&UNK_00814304 + (ulong)uVar8 * 4);
  if (uStack_f0 < 0x41) {
    if ((long)puVar43 < 8) {
      puVar30 = in_x3;
      if (puVar43 == (undefined8 *)0x0) goto LAB_00154138;
      uVar8 = (uint)puVar43;
      if (in_x3 <= (byte *)((long)in_x3 + (long)puVar43) + -(ulong)(uStack_f0 >> 3)) {
        uVar8 = uStack_f0 >> 3;
      }
      uStack_f0 = uStack_f0 + uVar8 * -8;
    }
    else {
      uVar8 = uStack_f0 >> 3;
      uStack_f0 = uStack_f0 & 7;
    }
    puStack_e8 = (ulong *)((byte *)((long)in_x3 + (long)puVar43) + -(ulong)uVar8);
    uStack_f8 = *puStack_e8;
    puVar30 = puStack_e8;
  }
  else {
    puVar30 = (ulong *)&UNK_00814388;
    puStack_e8 = (ulong *)&UNK_00814388;
  }
LAB_00154138:
  lVar1 = *plVar15 + 8;
  uVar8 = *(uint *)(plVar15[2] + 4);
  uStack_f0 = uVar8 + uStack_f0;
  uStack_c0 = uStack_f8 >> ((ulong)-uStack_f0 & 0x3f) &
              (ulong)*(uint *)(&UNK_00814304 + (ulong)uVar8 * 4);
  iVar29 = (int)in_x3;
  if (uStack_f0 < 0x41) {
    if (puVar30 < puVar21) {
      puVar33 = in_x3;
      if (puVar30 == in_x3) goto LAB_001541c4;
      uVar8 = (int)puVar30 - iVar29;
      if (in_x3 <= (ulong *)((long)puVar30 - (ulong)(uStack_f0 >> 3))) {
        uVar8 = uStack_f0 >> 3;
      }
      puVar33 = (ulong *)((long)puVar30 - (ulong)uVar8);
      uStack_f8 = *puVar33;
      uStack_f0 = uStack_f0 + uVar8 * -8;
    }
    else {
      puVar33 = (ulong *)((long)puVar30 - (ulong)(uStack_f0 >> 3));
      uStack_f8 = *puVar33;
      uStack_f0 = uStack_f0 & 7;
    }
    puStack_e8 = puVar33;
  }
  else {
    puVar33 = (ulong *)&UNK_00814388;
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
    if (puVar33 < puVar21) {
      if (puVar33 != in_x3) {
        uVar8 = (int)puVar33 - iVar29;
        if (in_x3 <= (ulong *)((long)puVar33 - (ulong)(uStack_f0 >> 3))) {
          uVar8 = uStack_f0 >> 3;
        }
        puStack_e8 = (ulong *)((long)puVar33 - (ulong)uVar8);
        uStack_f0 = uStack_f0 + uVar8 * -8;
        uStack_f8 = *puStack_e8;
      }
    }
    else {
      puStack_e8 = (ulong *)((long)puVar33 - (ulong)(uStack_f0 >> 3));
      uStack_f0 = uStack_f0 & 7;
      uStack_f8 = *puStack_e8;
    }
  }
  else {
    puStack_e8 = (ulong *)&UNK_00814388;
  }
  lVar3 = plVar15[1] + 8;
  do {
    puVar4 = (ushort *)(lVar1 + uStack_d0 * 8);
    puVar5 = (ushort *)(lVar3 + uStack_b0 * 8);
    puVar6 = (ushort *)(lVar2 + uStack_c0 * 8);
    uVar47 = (ulong)*(uint *)(puVar5 + 2);
    uVar49 = (ulong)*(uint *)(puVar4 + 2);
    uVar8 = *(uint *)(puVar6 + 2);
    bVar9 = (byte)puVar4[1];
    bVar10 = (byte)puVar5[1];
    bVar11 = (byte)puVar6[1];
    uVar34 = (uint)bVar11;
    puVar30 = auStack_a0;
    if (bVar11 < 2) {
      bVar13 = *(uint *)(puVar4 + 2) == 0;
      if (bVar11 != 0) {
        if (bVar13) {
          uVar8 = uVar8 + 1;
        }
        uVar19 = (ulong)uStack_f0;
        uStack_f0 = uStack_f0 + 1;
        lVar37 = (ulong)uVar8 - ((long)(uStack_f8 << (uVar19 & 0x3f)) >> 0x3f);
        if (lVar37 == 3) {
          uVar19 = (auStack_a0[0] - 1) - (ulong)(auStack_a0[0] - 1 == 0);
        }
        else {
          uVar19 = auStack_a0[lVar37] - (ulong)(auStack_a0[lVar37] == 0);
          if (lVar37 == 1) goto LAB_00154320;
        }
        goto code_r0x001542f4;
      }
      uVar19 = auStack_a0[bVar13];
      puVar30 = auStack_a0 + !bVar13;
    }
    else {
      uVar19 = (ulong)uStack_f0;
      uStack_f0 = uStack_f0 + uVar34;
      uVar19 = ((uStack_f8 << (uVar19 & 0x3f)) >> ((ulong)-uVar34 & 0x3f)) + (ulong)uVar8;
code_r0x001542f4:
      auStack_a0[2] = auStack_a0[1];
    }
LAB_00154320:
    auStack_a0[0] = uVar19;
    auStack_a0[1] = *puVar30;
    if (bVar10 != 0) {
      uVar17 = (ulong)uStack_f0;
      uStack_f0 = uStack_f0 + bVar10;
      uVar47 = ((uStack_f8 << (uVar17 & 0x3f)) >> ((ulong)-(uint)bVar10 & 0x3f)) + uVar47;
    }
    if (0x1e < ((uint)bVar10 + (uint)bVar9 + uVar34 & 0xff)) {
      if (uStack_f0 < 0x41) {
        if (puStack_e8 < puVar21) {
          if (puStack_e8 == in_x3) goto code_r0x00154360;
          uVar8 = (int)puStack_e8 - iVar29;
          if (in_x3 <= (ulong *)((long)puStack_e8 - (ulong)(uStack_f0 >> 3))) {
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
      uVar17 = (ulong)uStack_f0;
      uStack_f0 = uStack_f0 + bVar9;
      uVar49 = ((uStack_f8 << (uVar17 & 0x3f)) >> ((ulong)-(uint)bVar9 & 0x3f)) + uVar49;
    }
    iVar46 = (int)uVar24;
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
        if (puStack_e8 < puVar21) {
          if (puStack_e8 != in_x3) {
            uVar8 = (int)puStack_e8 - iVar29;
            if (in_x3 <= (ulong *)((long)puStack_e8 - (ulong)(uStack_f0 >> 3))) {
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
        puVar31 = (undefined1 *)plVar15[0xed3];
        if ((undefined1 *)((long)puStack_88 + uVar49) <= puVar31) goto code_r0x00154484;
      }
      else {
        puStack_e8 = (ulong *)&UNK_00814388;
        puVar31 = (undefined1 *)plVar15[0xed3];
        if ((undefined1 *)((long)puStack_88 + uVar49) <= puVar31) goto code_r0x00154484;
      }
      if (iVar46 < 1) {
        return (undefined1 *)0xffffffffffffffec;
      }
code_r0x001547d8:
      uVar24 = (long)puVar31 - (long)puStack_88;
      if (uVar24 == 0) goto code_r0x00154a08;
      if ((ulong)((long)puVar23 - (long)puVar18) < uVar24) {
        return (undefined1 *)0xffffffffffffffba;
      }
      uVar17 = (long)puVar18 - (long)puStack_88;
      puVar45 = (undefined8 *)((long)puVar18 + uVar24);
      if (((long)uVar17 < -7) && (7 < uVar24)) {
        if (uVar17 < 0xfffffffffffffff0) {
          puVar41 = puVar45 + -4;
          if (puVar18 <= puVar41) {
            uVar48 = *puStack_88;
            puVar18[1] = puStack_88[1];
            *puVar18 = uVar48;
            if (0x10 < (ulong)((long)puVar41 - (long)puVar18)) {
              puVar27 = puVar18 + 2;
              puVar25 = puStack_88;
              do {
                uVar48 = puVar25[2];
                puVar27[1] = puVar25[3];
                *puVar27 = uVar48;
                uVar48 = puVar25[4];
                puVar27[3] = puVar25[5];
                puVar27[2] = uVar48;
                puVar27 = puVar27 + 4;
                puVar25 = puVar25 + 4;
              } while (puVar27 < puVar41);
            }
            puStack_88 = (undefined8 *)((long)puStack_88 + ((long)puVar41 - (long)puVar18));
code_r0x001548ac:
            puVar31 = (undefined1 *)((long)puVar18 + (uVar24 - (long)puVar41));
            if ((puVar31 < (undefined1 *)0x8) || ((ulong)((long)puVar41 - (long)puStack_88) < 0x40))
            {
              puVar18 = puVar41;
            }
            else {
              if (puVar31 < (undefined1 *)0x40) {
                puVar36 = (undefined1 *)0x0;
              }
              else {
                puVar36 = (undefined1 *)((ulong)puVar31 & 0xffffffffffffffc0);
                puVar18 = puVar41 + 4;
                puVar27 = puStack_88 + 4;
                puVar40 = puVar36;
                do {
                  uVar48 = puVar27[-4];
                  uVar51 = puVar27[-1];
                  uVar50 = puVar27[-2];
                  uVar53 = puVar27[1];
                  uVar52 = *puVar27;
                  uVar55 = puVar27[3];
                  uVar54 = puVar27[2];
                  puVar18[-3] = puVar27[-3];
                  puVar18[-4] = uVar48;
                  puVar18[-1] = uVar51;
                  puVar18[-2] = uVar50;
                  puVar18[1] = uVar53;
                  *puVar18 = uVar52;
                  puVar18[3] = uVar55;
                  puVar18[2] = uVar54;
                  puVar40 = puVar40 + -0x40;
                  puVar18 = puVar18 + 8;
                  puVar27 = puVar27 + 8;
                } while (puVar40 != (undefined1 *)0x0);
                if (puVar31 == puVar36) goto code_r0x00154a00;
                if (((ulong)puVar31 & 0x38) == 0) {
                  puStack_88 = (undefined8 *)((long)puStack_88 + (long)puVar36);
                  puVar18 = (undefined8 *)((long)puVar41 + (long)puVar36);
                  goto code_r0x001549d0;
                }
              }
              puVar40 = (undefined1 *)((ulong)puVar31 & 0xfffffffffffffff8);
              lVar37 = (long)puVar36 - (long)puVar40;
              puVar18 = (undefined8 *)((long)puVar41 + (long)puVar36);
              puVar27 = (undefined8 *)((long)puStack_88 + (long)puVar36);
              do {
                *puVar18 = *puVar27;
                lVar37 = lVar37 + 8;
                puVar18 = puVar18 + 1;
                puVar27 = puVar27 + 1;
              } while (lVar37 != 0);
              puVar18 = (undefined8 *)((long)puVar41 + (long)puVar40);
              puStack_88 = (undefined8 *)((long)puStack_88 + (long)puVar40);
              if (puVar31 == puVar40) goto code_r0x00154a00;
            }
code_r0x001549d0:
            do {
              puVar27 = (undefined8 *)((long)puVar18 + 1);
              *(undefined1 *)puVar18 = *(undefined1 *)puStack_88;
              puVar18 = puVar27;
              puStack_88 = (undefined8 *)((long)puStack_88 + 1);
            } while (puVar27 != (undefined8 *)((long)puVar41 + (long)puVar31));
            goto code_r0x00154a00;
          }
        }
        puVar41 = puVar18;
        if (0 < (long)uVar24) goto code_r0x001548ac;
        goto code_r0x00154a00;
      }
      if ((long)uVar24 < 1) goto code_r0x00154a00;
      puVar31 = (undefined1 *)((long)puVar18 + (long)puVar31) + -(long)puStack_88;
      if (puVar31 <= (undefined1 *)((long)puVar18 + 1U)) {
        puVar31 = (undefined1 *)((long)puVar18 + 1);
      }
      uVar32 = (long)puVar31 - (long)puVar18;
      if ((uVar32 < 8) || (uVar17 < 0x40)) goto code_r0x001549f0;
      if (uVar32 < 0x40) {
        uVar17 = 0;
        goto code_r0x00154994;
      }
      uVar17 = uVar32 & 0xffffffffffffffc0;
      puVar41 = puVar18 + 4;
      puVar27 = puStack_88 + 4;
      uVar38 = uVar17;
      do {
        uVar48 = puVar27[-4];
        uVar51 = puVar27[-1];
        uVar50 = puVar27[-2];
        uVar53 = puVar27[1];
        uVar52 = *puVar27;
        uVar55 = puVar27[3];
        uVar54 = puVar27[2];
        puVar41[-3] = puVar27[-3];
        puVar41[-4] = uVar48;
        puVar41[-1] = uVar51;
        puVar41[-2] = uVar50;
        puVar41[1] = uVar53;
        *puVar41 = uVar52;
        puVar41[3] = uVar55;
        puVar41[2] = uVar54;
        uVar38 = uVar38 - 0x40;
        puVar41 = puVar41 + 8;
        puVar27 = puVar27 + 8;
      } while (uVar38 != 0);
      if (uVar32 != uVar17) {
        if ((uVar32 & 0x38) == 0) {
          puStack_88 = (undefined8 *)((long)puStack_88 + uVar17);
          puVar18 = (undefined8 *)((long)puVar18 + uVar17);
        }
        else {
code_r0x00154994:
          uVar38 = uVar32 & 0xfffffffffffffff8;
          lVar37 = uVar17 - uVar38;
          puVar41 = (undefined8 *)((long)puStack_88 + uVar17);
          puVar27 = (undefined8 *)((long)puVar18 + uVar17);
          do {
            *puVar27 = *puVar41;
            lVar37 = lVar37 + 8;
            puVar41 = puVar41 + 1;
            puVar27 = puVar27 + 1;
          } while (lVar37 != 0);
          puVar18 = (undefined8 *)((long)puVar18 + uVar38);
          puStack_88 = (undefined8 *)((long)puStack_88 + uVar38);
          if (uVar32 == uVar38) goto code_r0x00154a00;
        }
code_r0x001549f0:
        do {
          puVar41 = (undefined8 *)((long)puVar18 + 1);
          *(undefined1 *)puVar18 = *(undefined1 *)puStack_88;
          puVar18 = puVar41;
          puStack_88 = (undefined8 *)((long)puStack_88 + 1);
        } while (puVar41 < puVar45);
      }
code_r0x00154a00:
      uVar49 = uVar49 - uVar24;
      puVar18 = puVar45;
code_r0x00154a08:
      puVar45 = (undefined8 *)((long)plVar15 + 0x176a4);
      *(undefined4 *)(plVar15 + 0xed4) = 0;
      puVar41 = (undefined8 *)((long)puVar18 + uVar49);
      puVar27 = (undefined8 *)((long)puVar41 - uVar19);
      Hint_Prefetch(puVar27,0,0,0);
      if ((puVar45 < (undefined8 *)((long)puVar43 + uVar49)) ||
         (puVar31 = (undefined1 *)(uVar49 + uVar47),
         puVar23 + -0x20 < (undefined1 *)((long)puVar18 + (long)puVar31))) {
        puStack_88 = puVar43;
        uStack_80 = uVar49;
        uStack_78 = uVar47;
        uStack_70 = uVar19;
        puVar31 = (undefined1 *)
                  func_0x00155c78(puVar18,puVar23,&uStack_80,&puStack_88,puVar45,puVar16,lVar26,
                                  uVar22);
      }
      else {
        uVar48 = *puVar43;
        puVar18[1] = *(undefined8 *)((long)plVar15 + 0x76ac);
        *puVar18 = uVar48;
        if (0x10 < uVar49) {
          uVar48 = *(undefined8 *)((long)plVar15 + 0x76b4);
          puVar18[3] = *(undefined8 *)((long)plVar15 + 0x76bc);
          puVar18[2] = uVar48;
          if (0x10 < uVar49 - 0x10) {
            puVar25 = puVar18 + 4;
            puVar28 = (undefined8 *)((long)plVar15 + 0x76d4);
            do {
              uVar48 = puVar28[-2];
              puVar25[1] = puVar28[-1];
              *puVar25 = uVar48;
              uVar48 = *puVar28;
              puVar25[3] = puVar28[1];
              puVar25[2] = uVar48;
              puVar25 = puVar25 + 4;
              puVar28 = puVar28 + 4;
            } while (puVar25 < puVar41);
          }
        }
        puStack_88 = (undefined8 *)((long)puVar43 + uVar49);
        if ((ulong)((long)puVar41 - (long)puVar16) < uVar19) {
          if ((ulong)((long)puVar41 - lVar26) < uVar19) {
            return (undefined1 *)0xffffffffffffffec;
          }
          lVar42 = (long)puVar27 - (long)puVar16;
          lVar37 = uVar22 + lVar42;
          if (lVar37 + uVar47 <= uVar22) {
            _memmove(puVar41,lVar37,uVar47);
            goto joined_r0x00154b24;
          }
          _memmove(puVar41,lVar37,-lVar42);
          puVar41 = (undefined8 *)((long)puVar41 - lVar42);
          uVar47 = lVar42 + uVar47;
          puVar27 = puVar16;
        }
        if (uVar19 < 0x10) {
          if (uVar19 < 8) {
            iVar12 = *(int *)(&UNK_008143b0 + uVar19 * 4);
            *(undefined1 *)puVar41 = *(undefined1 *)puVar27;
            *(undefined1 *)((long)puVar41 + 1) = *(undefined1 *)((long)puVar27 + 1);
            *(undefined1 *)((long)puVar41 + 2) = *(undefined1 *)((long)puVar27 + 2);
            *(undefined1 *)((long)puVar41 + 3) = *(undefined1 *)((long)puVar27 + 3);
            puVar7 = (undefined4 *)((long)puVar27 + (ulong)*(uint *)(&UNK_00814390 + uVar19 * 4));
            puVar27 = (undefined8 *)((long)puVar7 - (long)iVar12);
            *(undefined4 *)((long)puVar41 + 4) = *puVar7;
          }
          else {
            *puVar41 = *puVar27;
          }
          if (8 < uVar47) {
            puVar43 = puVar27 + 1;
            puVar25 = puVar41 + 1;
            if ((long)puVar25 - (long)puVar43 < 0x10) {
              do {
                puVar27 = puVar25 + 1;
                *puVar25 = *puVar43;
                puVar43 = puVar43 + 1;
                puVar25 = puVar27;
              } while (puVar27 < (undefined8 *)((long)puVar41 + uVar47));
            }
            else {
              uVar48 = *puVar43;
              puVar41[2] = puVar27[2];
              *puVar25 = uVar48;
              if (0x10 < uVar47 - 8) {
                puVar43 = puVar41 + 3;
                puVar27 = puVar27 + 5;
                do {
                  uVar48 = puVar27[-2];
                  puVar43[1] = puVar27[-1];
                  *puVar43 = uVar48;
                  uVar48 = *puVar27;
                  puVar43[3] = puVar27[1];
                  puVar43[2] = uVar48;
                  puVar43 = puVar43 + 4;
                  puVar27 = puVar27 + 4;
                } while (puVar43 < (undefined8 *)((long)puVar41 + uVar47));
              }
            }
          }
        }
        else {
          uVar48 = *puVar27;
          puVar41[1] = puVar27[1];
          *puVar41 = uVar48;
          if (0x10 < uVar47) {
            puVar43 = puVar41 + 2;
            do {
              uVar48 = puVar27[2];
              puVar43[1] = puVar27[3];
              *puVar43 = uVar48;
              uVar48 = puVar27[4];
              puVar43[3] = puVar27[5];
              puVar43[2] = uVar48;
              puVar43 = puVar43 + 4;
              puVar27 = puVar27 + 4;
            } while (puVar43 < (undefined8 *)((long)puVar41 + uVar47));
          }
        }
      }
joined_r0x00154b24:
      if ((undefined1 *)0xffffffffffffff88 < puVar31) {
        return puVar31;
      }
      puVar18 = (undefined8 *)((long)puVar18 + (long)puVar31);
      if (iVar46 < 2) {
        if (iVar44 != 0) {
          return (undefined1 *)0xffffffffffffffec;
        }
      }
      else {
        do {
          puVar4 = (ushort *)(lVar1 + uStack_d0 * 8);
          puVar5 = (ushort *)(lVar3 + uStack_b0 * 8);
          puVar6 = (ushort *)(lVar2 + uStack_c0 * 8);
          uVar49 = (ulong)*(uint *)(puVar5 + 2);
          uVar24 = (ulong)*(uint *)(puVar4 + 2);
          uVar8 = *(uint *)(puVar6 + 2);
          bVar9 = (byte)puVar4[1];
          bVar10 = (byte)puVar5[1];
          bVar11 = (byte)puVar6[1];
          uVar34 = (uint)bVar11;
          puVar30 = auStack_a0;
          if (bVar11 < 2) {
            bVar13 = *(uint *)(puVar4 + 2) == 0;
            if (bVar11 != 0) {
              if (bVar13) {
                uVar8 = uVar8 + 1;
              }
              uVar47 = (ulong)uStack_f0;
              uStack_f0 = uStack_f0 + 1;
              lVar37 = (ulong)uVar8 - ((long)(uStack_f8 << (uVar47 & 0x3f)) >> 0x3f);
              if (lVar37 == 3) {
                uVar47 = (auStack_a0[0] - 1) - (ulong)(auStack_a0[0] - 1 == 0);
              }
              else {
                uVar47 = auStack_a0[lVar37] - (ulong)(auStack_a0[lVar37] == 0);
                if (lVar37 == 1) goto LAB_00154bdc;
              }
              goto code_r0x00154bb0;
            }
            uVar47 = auStack_a0[bVar13];
            puVar30 = auStack_a0 + !bVar13;
          }
          else {
            uVar47 = (ulong)uStack_f0;
            uStack_f0 = uStack_f0 + uVar34;
            uVar47 = ((uStack_f8 << (uVar47 & 0x3f)) >> ((ulong)-uVar34 & 0x3f)) + (ulong)uVar8;
code_r0x00154bb0:
            auStack_a0[2] = auStack_a0[1];
          }
LAB_00154bdc:
          auStack_a0[0] = uVar47;
          auStack_a0[1] = *puVar30;
          if (bVar10 != 0) {
            uVar19 = (ulong)uStack_f0;
            uStack_f0 = uStack_f0 + bVar10;
            uVar49 = ((uStack_f8 << (uVar19 & 0x3f)) >> ((ulong)-(uint)bVar10 & 0x3f)) + uVar49;
          }
          if (0x1e < ((uint)bVar10 + (uint)bVar9 + uVar34 & 0xff)) {
            if (uStack_f0 < 0x41) {
              if (puStack_e8 < puVar21) {
                if (puStack_e8 != in_x3) {
                  uVar8 = (int)puStack_e8 - iVar29;
                  if (in_x3 <= (ulong *)((long)puStack_e8 - (ulong)(uStack_f0 >> 3))) {
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
            uVar19 = (ulong)uStack_f0;
            uStack_f0 = uStack_f0 + bVar9;
            uVar24 = ((uStack_f8 << (uVar19 & 0x3f)) >> ((ulong)-(uint)bVar9 & 0x3f)) + uVar24;
          }
          if (iVar44 != 1) {
            iVar46 = uStack_f0 + *(byte *)((long)puVar4 + 3);
            uStack_d0 = (uStack_f8 >> ((ulong)(uint)-iVar46 & 0x3f) &
                        (ulong)*(uint *)(&UNK_00814304 +
                                        (ulong)(uint)*(byte *)((long)puVar4 + 3) * 4)) +
                        (ulong)*puVar4;
            iVar46 = iVar46 + (uint)*(byte *)((long)puVar5 + 3);
            uStack_b0 = (uStack_f8 >> ((ulong)(uint)-iVar46 & 0x3f) &
                        (ulong)*(uint *)(&UNK_00814304 +
                                        (ulong)(uint)*(byte *)((long)puVar5 + 3) * 4)) +
                        (ulong)*puVar5;
            uStack_f0 = iVar46 + (uint)*(byte *)((long)puVar6 + 3);
            uStack_c0 = (uStack_f8 >> ((ulong)-uStack_f0 & 0x3f) &
                        (ulong)*(uint *)(&UNK_00814304 +
                                        (ulong)(uint)*(byte *)((long)puVar6 + 3) * 4)) +
                        (ulong)*puVar6;
            if (uStack_f0 < 0x41) {
              if (puStack_e8 < puVar21) {
                if (puStack_e8 == in_x3) goto LAB_00154d14;
                uVar8 = (int)puStack_e8 - iVar29;
                if (in_x3 <= (ulong *)((long)puStack_e8 - (ulong)(uStack_f0 >> 3))) {
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
          puVar43 = (undefined8 *)((long)puVar18 + uVar24);
          puVar41 = (undefined8 *)((long)puVar43 - uVar47);
          Hint_Prefetch(puVar41,0,0,0);
          if ((puVar45 < (undefined8 *)((long)puStack_88 + uVar24)) ||
             (puVar31 = (undefined1 *)(uVar24 + uVar49),
             puVar23 + -0x20 < (undefined1 *)((long)puVar18 + (long)puVar31))) {
            uStack_80 = uVar24;
            uStack_78 = uVar49;
            uStack_70 = uVar47;
            puVar31 = (undefined1 *)
                      func_0x00155c78(puVar18,puVar23,&uStack_80,&puStack_88,puVar45,puVar16,lVar26,
                                      uVar22);
          }
          else {
            uVar48 = *puStack_88;
            puVar18[1] = puStack_88[1];
            *puVar18 = uVar48;
            if (0x10 < uVar24) {
              uVar48 = puStack_88[2];
              puVar18[3] = puStack_88[3];
              puVar18[2] = uVar48;
              if (0x10 < uVar24 - 0x10) {
                puVar27 = puVar18 + 4;
                puVar25 = puStack_88 + 6;
                do {
                  uVar48 = puVar25[-2];
                  puVar27[1] = puVar25[-1];
                  *puVar27 = uVar48;
                  uVar48 = *puVar25;
                  puVar27[3] = puVar25[1];
                  puVar27[2] = uVar48;
                  puVar27 = puVar27 + 4;
                  puVar25 = puVar25 + 4;
                } while (puVar27 < puVar43);
              }
            }
            puStack_88 = (undefined8 *)((long)puStack_88 + uVar24);
            if ((ulong)((long)puVar43 - (long)puVar16) < uVar47) {
              if ((ulong)((long)puVar43 - lVar26) < uVar47) {
                return (undefined1 *)0xffffffffffffffec;
              }
              lVar42 = (long)puVar41 - (long)puVar16;
              lVar37 = uVar22 + lVar42;
              if (lVar37 + uVar49 <= uVar22) {
                _memmove(puVar43,lVar37,uVar49);
                goto joined_r0x00154e58;
              }
              _memmove(puVar43,lVar37,-lVar42);
              puVar43 = (undefined8 *)((long)puVar43 - lVar42);
              uVar49 = lVar42 + uVar49;
              puVar41 = puVar16;
            }
            if (uVar47 < 0x10) {
              if (uVar47 < 8) {
                iVar46 = *(int *)(&UNK_008143b0 + uVar47 * 4);
                *(undefined1 *)puVar43 = *(undefined1 *)puVar41;
                *(undefined1 *)((long)puVar43 + 1) = *(undefined1 *)((long)puVar41 + 1);
                *(undefined1 *)((long)puVar43 + 2) = *(undefined1 *)((long)puVar41 + 2);
                *(undefined1 *)((long)puVar43 + 3) = *(undefined1 *)((long)puVar41 + 3);
                puVar7 = (undefined4 *)
                         ((long)puVar41 + (ulong)*(uint *)(&UNK_00814390 + uVar47 * 4));
                puVar41 = (undefined8 *)((long)puVar7 - (long)iVar46);
                *(undefined4 *)((long)puVar43 + 4) = *puVar7;
              }
              else {
                *puVar43 = *puVar41;
              }
              if (8 < uVar49) {
                puVar27 = puVar41 + 1;
                puVar25 = puVar43 + 1;
                if ((long)puVar25 - (long)puVar27 < 0x10) {
                  do {
                    puVar41 = puVar25 + 1;
                    *puVar25 = *puVar27;
                    puVar27 = puVar27 + 1;
                    puVar25 = puVar41;
                  } while (puVar41 < (undefined8 *)((long)puVar43 + uVar49));
                }
                else {
                  uVar48 = *puVar27;
                  puVar43[2] = puVar41[2];
                  *puVar25 = uVar48;
                  if (0x10 < uVar49 - 8) {
                    puVar27 = puVar43 + 3;
                    puVar41 = puVar41 + 5;
                    do {
                      uVar48 = puVar41[-2];
                      puVar27[1] = puVar41[-1];
                      *puVar27 = uVar48;
                      uVar48 = *puVar41;
                      puVar27[3] = puVar41[1];
                      puVar27[2] = uVar48;
                      puVar27 = puVar27 + 4;
                      puVar41 = puVar41 + 4;
                    } while (puVar27 < (undefined8 *)((long)puVar43 + uVar49));
                  }
                }
              }
            }
            else {
              uVar48 = *puVar41;
              puVar43[1] = puVar41[1];
              *puVar43 = uVar48;
              if (0x10 < uVar49) {
                puVar27 = puVar43 + 2;
                do {
                  uVar48 = puVar41[2];
                  puVar27[1] = puVar41[3];
                  *puVar27 = uVar48;
                  uVar48 = puVar41[4];
                  puVar27[3] = puVar41[5];
                  puVar27[2] = uVar48;
                  puVar27 = puVar27 + 4;
                  puVar41 = puVar41 + 4;
                } while (puVar27 < (undefined8 *)((long)puVar43 + uVar49));
              }
            }
          }
joined_r0x00154e58:
          if ((undefined1 *)0xffffffffffffff88 < puVar31) {
            return puVar31;
          }
          puVar18 = (undefined8 *)((long)puVar18 + (long)puVar31);
          iVar44 = iVar44 + -1;
        } while (iVar44 != 0);
      }
code_r0x00155070:
      if (puStack_e8 != in_x3) {
        return (undefined1 *)0xffffffffffffffec;
      }
      if (uStack_f0 != 0x40) {
        return (undefined1 *)0xffffffffffffffec;
      }
      *(ulong *)((long)plVar15 + 0x683c) = CONCAT44((int)auStack_a0[1],(int)auStack_a0[0]);
      *(int *)((long)plVar15 + 0x6844) = (int)auStack_a0[2];
      iVar29 = (int)plVar15[0xed4];
      puVar16 = puStack_88;
      goto joined_r0x001550b0;
    }
    puVar31 = (undefined1 *)plVar15[0xed3];
    if (puVar31 < (undefined1 *)((long)puStack_88 + uVar49)) goto code_r0x001547d8;
code_r0x00154484:
    puVar41 = (undefined8 *)((long)puStack_88 + uVar49);
    if ((puVar45 < puVar41) ||
       (puVar31 = (undefined1 *)(uVar49 + uVar47),
       puVar41 + -4 < (undefined8 *)((long)puVar18 + (long)puVar31))) {
      uStack_80 = uVar49;
      uStack_78 = uVar47;
      uStack_70 = uVar19;
      puVar31 = (undefined1 *)
                func_0x00156308(puVar18,puVar23,puVar41 + -4,&uStack_80,&puStack_88,puVar45,puVar16,
                                lVar26,uVar22);
    }
    else {
      puVar27 = (undefined8 *)((long)puVar18 + uVar49);
      uVar48 = *puStack_88;
      puVar18[1] = puStack_88[1];
      *puVar18 = uVar48;
      if (0x10 < uVar49) {
        uVar48 = puStack_88[2];
        puVar18[3] = puStack_88[3];
        puVar18[2] = uVar48;
        if (0x10 < uVar49 - 0x10) {
          puVar25 = puVar18 + 4;
          puVar28 = puStack_88 + 6;
          do {
            uVar48 = puVar28[-2];
            puVar25[1] = puVar28[-1];
            *puVar25 = uVar48;
            uVar48 = *puVar28;
            puVar25[3] = puVar28[1];
            puVar25[2] = uVar48;
            puVar25 = puVar25 + 4;
            puVar28 = puVar28 + 4;
          } while (puVar25 < puVar27);
        }
      }
      puStack_88 = puVar41;
      puVar41 = (undefined8 *)((long)puVar27 - uVar19);
      if ((ulong)((long)puVar27 - (long)puVar16) < uVar19) {
        if ((ulong)((long)puVar27 - lVar26) < uVar19) {
          return (undefined1 *)0xffffffffffffffec;
        }
        lVar42 = (long)((long)puVar27 - uVar19) - (long)puVar16;
        lVar37 = uVar22 + lVar42;
        if (lVar37 + uVar47 <= uVar22) {
          _memmove(puVar27,lVar37,uVar47);
          goto LAB_00154570;
        }
        _memmove(puVar27,lVar37,-lVar42);
        puVar27 = (undefined8 *)((long)puVar27 - lVar42);
        uVar47 = lVar42 + uVar47;
        puVar41 = puVar16;
      }
      if (uVar19 < 0x10) {
        if (uVar19 < 8) {
          iVar44 = *(int *)(&UNK_008143b0 + uVar19 * 4);
          *(undefined1 *)puVar27 = *(undefined1 *)puVar41;
          *(undefined1 *)((long)puVar27 + 1) = *(undefined1 *)((long)puVar41 + 1);
          *(undefined1 *)((long)puVar27 + 2) = *(undefined1 *)((long)puVar41 + 2);
          *(undefined1 *)((long)puVar27 + 3) = *(undefined1 *)((long)puVar41 + 3);
          puVar7 = (undefined4 *)((long)puVar41 + (ulong)*(uint *)(&UNK_00814390 + uVar19 * 4));
          puVar41 = (undefined8 *)((long)puVar7 - (long)iVar44);
          *(undefined4 *)((long)puVar27 + 4) = *puVar7;
        }
        else {
          *puVar27 = *puVar41;
        }
        if (8 < uVar47) {
          puVar25 = puVar41 + 1;
          puVar28 = puVar27 + 1;
          if ((long)puVar28 - (long)puVar25 < 0x10) {
            do {
              puVar41 = puVar28 + 1;
              *puVar28 = *puVar25;
              puVar25 = puVar25 + 1;
              puVar28 = puVar41;
            } while (puVar41 < (undefined8 *)((long)puVar27 + uVar47));
          }
          else {
            uVar48 = *puVar25;
            puVar27[2] = puVar41[2];
            *puVar28 = uVar48;
            if (0x10 < uVar47 - 8) {
              puVar25 = puVar27 + 3;
              puVar41 = puVar41 + 5;
              do {
                uVar48 = puVar41[-2];
                puVar25[1] = puVar41[-1];
                *puVar25 = uVar48;
                uVar48 = *puVar41;
                puVar25[3] = puVar41[1];
                puVar25[2] = uVar48;
                puVar25 = puVar25 + 4;
                puVar41 = puVar41 + 4;
              } while (puVar25 < (undefined8 *)((long)puVar27 + uVar47));
            }
          }
        }
      }
      else {
        uVar48 = *puVar41;
        puVar27[1] = puVar41[1];
        *puVar27 = uVar48;
        if (0x10 < uVar47) {
          puVar25 = puVar27 + 2;
          do {
            uVar48 = puVar41[2];
            puVar25[1] = puVar41[3];
            *puVar25 = uVar48;
            uVar48 = puVar41[4];
            puVar25[3] = puVar41[5];
            puVar25[2] = uVar48;
            puVar25 = puVar25 + 4;
            puVar41 = puVar41 + 4;
          } while (puVar25 < (undefined8 *)((long)puVar27 + uVar47));
        }
      }
    }
LAB_00154570:
    if ((undefined1 *)0xffffffffffffff88 < puVar31) {
      return puVar31;
    }
    puVar18 = (undefined8 *)((long)puVar18 + (long)puVar31);
    uVar24 = (ulong)(iVar46 - 1U);
    if (iVar46 - 1U == 0) goto code_r0x00155070;
  } while( true );
}

