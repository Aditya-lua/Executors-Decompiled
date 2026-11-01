
/* WARNING: Type propagation algorithm not settling */

undefined *
FUN_00153a04(undefined8 *param_1,undefined8 param_2,undefined8 *param_3,undefined8 *param_4,
            ulong *param_5,undefined8 *param_6,ulong param_7)

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
  bool bVar13;
  long *plVar14;
  undefined8 *puVar15;
  ulong uVar16;
  ulong uVar17;
  undefined8 *puVar18;
  undefined *puVar19;
  ulong *puVar20;
  ulong uVar21;
  undefined1 *puVar22;
  undefined8 *puVar23;
  long lVar24;
  undefined8 *puVar25;
  undefined8 *puVar26;
  int iVar27;
  ulong *puVar28;
  undefined1 *puVar29;
  ulong uVar30;
  ulong uVar31;
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
  undefined8 *unaff_x22;
  long lVar41;
  ulong unaff_x23;
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
  undefined8 *unaff_x30;
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
  ulong uStack_38;
  undefined8 *puStack_30;
  
code_r0x00153a04:
  puVar45 = unaff_x27 + 2;
  do {
    uVar48 = param_1[2];
    puVar45[1] = param_1[3];
    *puVar45 = uVar48;
    uVar48 = param_1[4];
    puVar45[3] = param_1[5];
    puVar45[2] = uVar48;
    puVar45 = puVar45 + 4;
    param_1 = param_1 + 4;
  } while (puVar45 < (undefined8 *)((long)unaff_x27 + (long)unaff_x20));
LAB_00153a50:
  puVar45 = param_4;
  if (unaff_x24 < (undefined *)0xffffffffffffff89) {
code_r0x00153a58:
    puVar15 = (undefined8 *)((long)unaff_x26 + (long)unaff_x24);
    unaff_w19 = unaff_w19 + 1;
    if (unaff_w19 != (uint)param_7) {
      do {
        puVar20 = (ulong *)(unaff_x25 + (ulong)(unaff_w19 & 7) * (unaff_x23 & 0xffffffff));
        unaff_x26 = puVar15;
        if (*(int *)((long)unaff_x22 + 0xe64) == 2) {
          uVar21 = *puVar20;
          puVar18 = *(undefined8 **)(&UNK_00007698 + in_stack_00000038);
          puVar40 = (undefined8 *)(uStack0000000000000120 + uVar21);
          if (puVar18 < puVar40) goto code_r0x00153500;
          puVar45 = puVar40 + -4;
          puVar43 = (undefined8 *)puVar20[1];
          unaff_x27 = (undefined8 *)puVar20[2];
          unaff_x24 = (undefined *)((long)puVar43 + uVar21);
          if (in_stack_00000098 < puVar40 ||
              puVar45 < (undefined8 *)((long)puVar15 + (long)unaff_x24)) {
            param_5 = &uStack0000000000000128;
            param_6 = &uStack0000000000000120;
            uStack0000000000000128 = uVar21;
            in_stack_00000130 = puVar43;
            in_stack_00000138 = unaff_x27;
            unaff_x24 = (undefined *)func_0x00156308(puVar15,in_stack_00000078);
            puVar43 = unaff_x28;
            goto code_r0x00153acc;
          }
          puVar18 = (undefined8 *)((long)puVar15 + uVar21);
          uVar48 = *(undefined8 *)uStack0000000000000120;
          puVar15[1] = *(undefined8 *)(uStack0000000000000120 + 8);
          *puVar15 = uVar48;
          if (0x10 < uVar21) {
            uVar48 = *(undefined8 *)(uStack0000000000000120 + 0x10);
            puVar15[3] = *(undefined8 *)(uStack0000000000000120 + 0x18);
            puVar15[2] = uVar48;
            if (0x10 < uVar21 - 0x10) {
              puVar42 = puVar15 + 4;
              puVar25 = (undefined8 *)(uStack0000000000000120 + 0x30);
              do {
                uVar48 = puVar25[-2];
                puVar42[1] = puVar25[-1];
                *puVar42 = uVar48;
                uVar48 = *puVar25;
                puVar42[3] = puVar25[1];
                puVar42[2] = uVar48;
                puVar42 = puVar42 + 4;
                puVar25 = puVar25 + 4;
              } while (puVar42 < puVar18);
            }
          }
          puVar42 = (undefined8 *)((long)puVar18 - (long)unaff_x27);
          uStack0000000000000120 = (ulong)puVar40;
          if ((undefined8 *)((long)puVar18 - (long)unaff_x30) < unaff_x27) {
            unaff_x28 = puVar18;
            if ((undefined8 *)((long)puVar18 - in_stack_00000070) < unaff_x27)
            goto code_r0x00153e5c;
            lVar24 = ((long)puVar18 - (long)unaff_x27) - (long)unaff_x30;
            if (in_stack_000000a8 + lVar24 + (long)puVar43 <= in_stack_000000a8)
            goto code_r0x001537a0;
            puVar45 = (undefined8 *)-lVar24;
            _memmove(puVar18);
            puVar18 = (undefined8 *)((long)puVar18 - lVar24);
            puVar43 = (undefined8 *)(lVar24 + (long)puVar43);
            param_7 = (ulong)in_stack_00000050._4_4_;
            unaff_x23 = 0x18;
            param_3 = in_stack_00000060;
            puVar42 = unaff_x30;
            unaff_x22 = in_stack_00000068;
          }
          unaff_x28 = puVar18;
          if (&MACH_HEADER.ncmds <= unaff_x27) {
            uVar48 = *puVar42;
            puVar18[1] = puVar42[1];
            *puVar18 = uVar48;
            if (&MACH_HEADER.ncmds < puVar43) {
              puVar40 = puVar18 + 2;
              do {
                uVar48 = puVar42[2];
                puVar40[1] = puVar42[3];
                *puVar40 = uVar48;
                uVar48 = puVar42[4];
                puVar40[3] = puVar42[5];
                puVar40[2] = uVar48;
                puVar40 = puVar40 + 4;
                puVar42 = puVar42 + 4;
              } while (puVar40 < (undefined8 *)((long)puVar18 + (long)puVar43));
            }
            goto joined_r0x00153ae0;
          }
          if ((undefined8 *)((long)&MACH_HEADER.cputype + 3) < unaff_x27) {
            *puVar18 = *puVar42;
          }
          else {
            iVar27 = *(int *)(&UNK_008143b0 + (long)unaff_x27 * 4);
            *(undefined1 *)puVar18 = *(undefined1 *)puVar42;
            *(undefined1 *)((long)puVar18 + 1) = *(undefined1 *)((long)puVar42 + 1);
            *(undefined1 *)((long)puVar18 + 2) = *(undefined1 *)((long)puVar42 + 2);
            *(undefined1 *)((long)puVar18 + 3) = *(undefined1 *)((long)puVar42 + 3);
            puVar7 = (undefined4 *)
                     ((long)puVar42 + (ulong)*(uint *)(&UNK_00814390 + (long)unaff_x27 * 4));
            puVar42 = (undefined8 *)((long)puVar7 - (long)iVar27);
            *(undefined4 *)((long)puVar18 + 4) = *puVar7;
          }
          if (&MACH_HEADER.cpusubtype < puVar43) {
            puVar40 = puVar42 + 1;
            puVar25 = puVar18 + 1;
            if ((long)puVar25 - (long)puVar40 < 0x10) {
              do {
                puVar42 = puVar25 + 1;
                *puVar25 = *puVar40;
                puVar40 = puVar40 + 1;
                puVar25 = puVar42;
              } while (puVar42 < (undefined8 *)((long)puVar18 + (long)puVar43));
            }
            else {
              uVar48 = *puVar40;
              puVar18[2] = puVar42[2];
              *puVar25 = uVar48;
              if (&MACH_HEADER.ncmds < puVar43 + -1) {
                puVar40 = puVar18 + 3;
                puVar42 = puVar42 + 5;
                do {
                  uVar48 = puVar42[-2];
                  puVar40[1] = puVar42[-1];
                  *puVar40 = uVar48;
                  uVar48 = *puVar42;
                  puVar40[3] = puVar42[1];
                  puVar40[2] = uVar48;
                  puVar40 = puVar40 + 4;
                  puVar42 = puVar42 + 4;
                } while (puVar40 < (undefined8 *)((long)puVar18 + (long)puVar43));
              }
            }
          }
LAB_00153e04:
          puVar43 = puVar45;
          unaff_x30 = in_stack_000000a0;
LAB_001537b0:
          param_7 = (ulong)in_stack_00000050._4_4_;
          unaff_x23 = 0x18;
          puVar45 = puVar43;
          unaff_x22 = in_stack_00000068;
          param_3 = in_stack_00000060;
        }
        else {
          uVar21 = *puVar20;
          puVar43 = (undefined8 *)puVar20[1];
          unaff_x27 = (undefined8 *)puVar20[2];
          puVar18 = (undefined8 *)((long)puVar15 + uVar21);
          puVar42 = (undefined8 *)((long)puVar18 - (long)unaff_x27);
          Hint_Prefetch(puVar42,0,0,0);
          unaff_x24 = (undefined *)((long)puVar43 + uVar21);
          puVar40 = (undefined8 *)(uStack0000000000000120 + uVar21);
          if (in_stack_00000098 < puVar40 ||
              unaff_x21 < (undefined *)((long)puVar15 + (long)unaff_x24)) {
            puVar45 = &uStack0000000000000128;
            param_5 = &uStack0000000000000120;
            param_6 = in_stack_00000098;
            uStack0000000000000128 = uVar21;
            in_stack_00000130 = puVar43;
            in_stack_00000138 = unaff_x27;
            unaff_x24 = (undefined *)func_0x00155c78(puVar15,in_stack_00000078);
code_r0x00153acc:
            param_7 = (ulong)in_stack_00000050._4_4_;
            unaff_x28 = puVar43;
            unaff_x30 = in_stack_000000a0;
            param_3 = in_stack_00000060;
          }
          else {
            uVar48 = *(undefined8 *)uStack0000000000000120;
            puVar15[1] = *(undefined8 *)(uStack0000000000000120 + 8);
            *puVar15 = uVar48;
            if (0x10 < uVar21) {
              uVar48 = *(undefined8 *)(uStack0000000000000120 + 0x10);
              puVar15[3] = *(undefined8 *)(uStack0000000000000120 + 0x18);
              puVar15[2] = uVar48;
              if (0x10 < uVar21 - 0x10) {
                puVar25 = puVar15 + 4;
                puVar23 = (undefined8 *)(uStack0000000000000120 + 0x30);
                do {
                  uVar48 = puVar23[-2];
                  puVar25[1] = puVar23[-1];
                  *puVar25 = uVar48;
                  uVar48 = *puVar23;
                  puVar25[3] = puVar23[1];
                  puVar25[2] = uVar48;
                  puVar25 = puVar25 + 4;
                  puVar23 = puVar23 + 4;
                } while (puVar25 < puVar18);
              }
            }
            uStack0000000000000120 = (ulong)puVar40;
            if ((undefined8 *)((long)puVar18 - (long)unaff_x30) < unaff_x27) {
              unaff_x28 = puVar43;
              if (unaff_x27 <= (undefined8 *)((long)puVar18 - in_stack_00000070)) {
                lVar24 = (long)puVar42 - (long)unaff_x30;
                if (in_stack_000000a8 < in_stack_000000a8 + lVar24 + (long)puVar43) {
                  puVar45 = (undefined8 *)-lVar24;
                  _memmove(puVar18);
                  puVar18 = (undefined8 *)((long)puVar18 - lVar24);
                  puVar43 = (undefined8 *)(lVar24 + (long)puVar43);
                  param_7 = (ulong)in_stack_00000050._4_4_;
                  unaff_x23 = 0x18;
                  param_3 = in_stack_00000060;
                  puVar42 = unaff_x30;
                  unaff_x22 = in_stack_00000068;
                  goto code_r0x00153628;
                }
code_r0x001537a0:
                _memmove(puVar18);
                goto LAB_001537b0;
              }
              goto code_r0x00153e5c;
            }
code_r0x00153628:
            unaff_x28 = puVar43;
            if (unaff_x27 < &MACH_HEADER.ncmds) {
              if ((undefined8 *)((long)&MACH_HEADER.cputype + 3) < unaff_x27) {
                *puVar18 = *puVar42;
              }
              else {
                iVar27 = *(int *)(&UNK_008143b0 + (long)unaff_x27 * 4);
                *(undefined1 *)puVar18 = *(undefined1 *)puVar42;
                *(undefined1 *)((long)puVar18 + 1) = *(undefined1 *)((long)puVar42 + 1);
                *(undefined1 *)((long)puVar18 + 2) = *(undefined1 *)((long)puVar42 + 2);
                *(undefined1 *)((long)puVar18 + 3) = *(undefined1 *)((long)puVar42 + 3);
                puVar7 = (undefined4 *)
                         ((long)puVar42 + (ulong)*(uint *)(&UNK_00814390 + (long)unaff_x27 * 4));
                puVar42 = (undefined8 *)((long)puVar7 - (long)iVar27);
                *(undefined4 *)((long)puVar18 + 4) = *puVar7;
              }
              if (&MACH_HEADER.cpusubtype < puVar43) {
                puVar40 = puVar42 + 1;
                puVar25 = puVar18 + 1;
                if ((long)puVar25 - (long)puVar40 < 0x10) {
                  do {
                    puVar42 = puVar25 + 1;
                    *puVar25 = *puVar40;
                    puVar40 = puVar40 + 1;
                    puVar25 = puVar42;
                  } while (puVar42 < (undefined8 *)((long)puVar18 + (long)puVar43));
                }
                else {
                  uVar48 = *puVar40;
                  puVar18[2] = puVar42[2];
                  *puVar25 = uVar48;
                  if (&MACH_HEADER.ncmds < puVar43 + -1) {
                    puVar40 = puVar18 + 3;
                    puVar42 = puVar42 + 5;
                    do {
                      uVar48 = puVar42[-2];
                      puVar40[1] = puVar42[-1];
                      *puVar40 = uVar48;
                      uVar48 = *puVar42;
                      puVar40[3] = puVar42[1];
                      puVar40[2] = uVar48;
                      puVar40 = puVar40 + 4;
                      puVar42 = puVar42 + 4;
                    } while (puVar40 < (undefined8 *)((long)puVar18 + (long)puVar43));
                  }
                }
              }
              goto LAB_00153e04;
            }
            uVar48 = *puVar42;
            puVar18[1] = puVar42[1];
            *puVar18 = uVar48;
            if (&MACH_HEADER.ncmds < puVar43) {
              puVar40 = puVar18 + 2;
              do {
                uVar48 = puVar42[2];
                puVar40[1] = puVar42[3];
                *puVar40 = uVar48;
                uVar48 = puVar42[4];
                puVar40[3] = puVar42[5];
                puVar40[2] = uVar48;
                puVar40 = puVar40 + 4;
                puVar42 = puVar42 + 4;
              } while (puVar40 < (undefined8 *)((long)puVar18 + (long)puVar43));
            }
          }
        }
joined_r0x00153ae0:
        if ((undefined *)0xffffffffffffff88 < unaff_x24) goto LAB_00153e60;
        puVar15 = (undefined8 *)((long)puVar15 + (long)unaff_x24);
        unaff_w19 = unaff_w19 + 1;
        if (unaff_w19 == (uint)param_7) break;
      } while( true );
    }
    *unaff_x22 = CONCAT44(in_stack_00000110,in_stack_00000108);
    *(undefined4 *)(unaff_x22 + 1) = in_stack_00000118;
    puVar40 = (undefined8 *)uStack0000000000000120;
    puVar45 = in_stack_00000098;
    unaff_x25 = in_stack_00000038;
    if (*(int *)((long)unaff_x22 + 0xe64) == 2) {
      uVar21 = (long)in_stack_00000098 - uStack0000000000000120;
      if (uVar21 <= (ulong)(in_stack_00000078 - (long)puVar15)) {
        if (puVar15 != (undefined8 *)0x0) {
          _memmove(puVar15,uStack0000000000000120,uVar21);
          puVar15 = (undefined8 *)((long)puVar15 + uVar21);
        }
        puVar40 = (undefined8 *)(&UNK_000076a4 + in_stack_00000038);
        puVar45 = (undefined8 *)(&UNK_000176a4 + in_stack_00000038);
        goto code_r0x00152000;
      }
      goto code_r0x00152014;
    }
code_r0x00152000:
    puVar40 = (undefined8 *)((long)puVar45 - (long)puVar40);
    if (puVar40 <= (undefined8 *)(in_stack_00000078 - (long)puVar15)) {
      if (puVar15 == (undefined8 *)0x0) {
        puVar19 = (undefined *)0x0;
      }
      else {
        puVar45 = puVar40;
        _memmove(puVar15);
        puVar19 = (undefined *)((long)puVar15 + (long)puVar40);
      }
      unaff_x24 = puVar19 + -in_stack_00000020;
      unaff_x26 = puVar15;
      goto LAB_00153e60;
    }
    goto code_r0x00152014;
  }
  goto LAB_00153e60;
code_r0x00153500:
  uVar49 = (long)puVar18 - uStack0000000000000120;
  if (uVar49 == 0) goto code_r0x00153944;
  if ((ulong)(in_stack_00000078 - (long)puVar15) < uVar49) {
code_r0x00152014:
    unaff_x24 = (undefined *)0xffffffffffffffba;
    unaff_x26 = puVar15;
    goto LAB_00153e60;
  }
  uVar21 = (long)puVar15 - uStack0000000000000120;
  unaff_x26 = (undefined8 *)((long)puVar15 + uVar49);
  if (((long)uVar21 < -7) && (7 < uVar49)) {
    if (uVar21 < 0xfffffffffffffff0) {
      puVar40 = unaff_x26 + -4;
      if (puVar40 < puVar15) goto code_r0x001537d4;
      uVar48 = *(undefined8 *)uStack0000000000000120;
      puVar15[1] = *(undefined8 *)(uStack0000000000000120 + 8);
      *puVar15 = uVar48;
      if (0x10 < (ulong)((long)puVar40 - (long)puVar15)) {
        puVar18 = puVar15 + 2;
        puVar43 = (undefined8 *)uStack0000000000000120;
        do {
          uVar48 = puVar43[2];
          puVar18[1] = puVar43[3];
          *puVar18 = uVar48;
          uVar48 = puVar43[4];
          puVar18[3] = puVar43[5];
          puVar18[2] = uVar48;
          puVar18 = puVar18 + 4;
          puVar43 = puVar43 + 4;
        } while (puVar18 < puVar40);
      }
      uStack0000000000000120 = uStack0000000000000120 + ((long)puVar40 - (long)puVar15);
    }
    else {
code_r0x001537d4:
      puVar40 = puVar15;
      if ((long)uVar49 < 1) goto code_r0x00153934;
    }
    puVar19 = (undefined *)((long)puVar15 + (uVar49 - (long)puVar40));
    if ((puVar19 < (undefined *)0x8) || ((long)puVar40 - uStack0000000000000120 < 0x40)) {
      puVar15 = puVar40;
    }
    else {
      if (puVar19 < (undefined *)0x40) {
        puVar34 = (undefined *)0x0;
      }
      else {
        puVar34 = (undefined *)((ulong)puVar19 & 0xffffffffffffffc0);
        puVar15 = puVar40 + 4;
        puVar18 = (undefined8 *)(uStack0000000000000120 + 0x20);
        puVar38 = puVar34;
        do {
          uVar48 = puVar18[-4];
          uVar51 = puVar18[-1];
          uVar50 = puVar18[-2];
          uVar53 = puVar18[1];
          uVar52 = *puVar18;
          uVar55 = puVar18[3];
          uVar54 = puVar18[2];
          puVar15[-3] = puVar18[-3];
          puVar15[-4] = uVar48;
          puVar15[-1] = uVar51;
          puVar15[-2] = uVar50;
          puVar15[1] = uVar53;
          *puVar15 = uVar52;
          puVar15[3] = uVar55;
          puVar15[2] = uVar54;
          puVar38 = puVar38 + -0x40;
          puVar15 = puVar15 + 8;
          puVar18 = puVar18 + 8;
        } while (puVar38 != (undefined *)0x0);
        if (puVar19 == puVar34) goto code_r0x00153934;
        if (((ulong)puVar19 & 0x38) == 0) {
          uStack0000000000000120 = uStack0000000000000120 + (long)puVar34;
          puVar15 = (undefined8 *)((long)puVar40 + (long)puVar34);
          goto code_r0x00153904;
        }
      }
      puVar38 = (undefined *)((ulong)puVar19 & 0xfffffffffffffff8);
      lVar24 = (long)puVar34 - (long)puVar38;
      puVar15 = (undefined8 *)((long)puVar40 + (long)puVar34);
      puVar18 = (undefined8 *)(uStack0000000000000120 + (long)puVar34);
      do {
        *puVar15 = *puVar18;
        lVar24 = lVar24 + 8;
        puVar15 = puVar15 + 1;
        puVar18 = puVar18 + 1;
      } while (lVar24 != 0);
      puVar15 = (undefined8 *)((long)puVar40 + (long)puVar38);
      uStack0000000000000120 = (ulong)(uStack0000000000000120 + (long)puVar38);
      if (puVar19 == puVar38) goto code_r0x00153934;
    }
code_r0x00153904:
    do {
      puVar18 = (undefined8 *)((long)puVar15 + 1);
      *(undefined1 *)puVar15 = *(undefined1 *)uStack0000000000000120;
      puVar15 = puVar18;
      uStack0000000000000120 = (ulong)(uStack0000000000000120 + 1);
    } while (puVar18 != (undefined8 *)((long)puVar40 + (long)puVar19));
  }
  else if (0 < (long)uVar49) {
    puVar19 = (undefined *)((long)puVar15 + (long)puVar18) + -uStack0000000000000120;
    if (puVar19 <= (undefined *)((long)puVar15 + 1)) {
      puVar19 = (undefined *)((long)puVar15 + 1);
    }
    uVar47 = (long)puVar19 - (long)puVar15;
    if ((7 < uVar47) && (0x3f < uVar21)) {
      if (uVar47 < 0x40) {
        uVar17 = 0;
      }
      else {
        uVar17 = uVar47 & 0xffffffffffffffc0;
        puVar40 = puVar15 + 4;
        puVar18 = (undefined8 *)(uStack0000000000000120 + 0x20);
        uVar21 = uVar17;
        do {
          uVar48 = puVar18[-4];
          uVar51 = puVar18[-1];
          uVar50 = puVar18[-2];
          uVar53 = puVar18[1];
          uVar52 = *puVar18;
          uVar55 = puVar18[3];
          uVar54 = puVar18[2];
          puVar40[-3] = puVar18[-3];
          puVar40[-4] = uVar48;
          puVar40[-1] = uVar51;
          puVar40[-2] = uVar50;
          puVar40[1] = uVar53;
          *puVar40 = uVar52;
          puVar40[3] = uVar55;
          puVar40[2] = uVar54;
          uVar21 = uVar21 - 0x40;
          puVar40 = puVar40 + 8;
          puVar18 = puVar18 + 8;
        } while (uVar21 != 0);
        if (uVar47 == uVar17) goto code_r0x00153934;
        if ((uVar47 & 0x38) == 0) {
          uStack0000000000000120 = uStack0000000000000120 + uVar17;
          puVar15 = (undefined8 *)((long)puVar15 + uVar17);
          goto code_r0x00153924;
        }
      }
      uVar21 = uVar47 & 0xfffffffffffffff8;
      lVar24 = uVar17 - uVar21;
      puVar40 = (undefined8 *)(uStack0000000000000120 + uVar17);
      puVar18 = (undefined8 *)((long)puVar15 + uVar17);
      do {
        *puVar18 = *puVar40;
        lVar24 = lVar24 + 8;
        puVar40 = puVar40 + 1;
        puVar18 = puVar18 + 1;
      } while (lVar24 != 0);
      puVar15 = (undefined8 *)((long)puVar15 + uVar21);
      uStack0000000000000120 = (ulong)(uStack0000000000000120 + uVar21);
      if (uVar47 == uVar21) goto code_r0x00153934;
    }
code_r0x00153924:
    do {
      puVar40 = (undefined8 *)((long)puVar15 + 1);
      *(undefined1 *)puVar15 = *(undefined1 *)uStack0000000000000120;
      puVar15 = puVar40;
      uStack0000000000000120 = (ulong)(uStack0000000000000120 + 1);
    } while (puVar40 < unaff_x26);
  }
code_r0x00153934:
  uVar21 = *puVar20 - uVar49;
  *puVar20 = uVar21;
code_r0x00153944:
  *(undefined4 *)((long)unaff_x22 + 0xe64) = 0;
  param_4 = (undefined8 *)puVar20[1];
  unaff_x28 = (undefined8 *)puVar20[2];
  unaff_x27 = (undefined8 *)((long)unaff_x26 + uVar21);
  param_1 = (undefined8 *)((long)unaff_x27 - (long)unaff_x28);
  Hint_Prefetch(param_1,0,0,0);
  unaff_x24 = (undefined *)((long)param_4 + uVar21);
  uStack0000000000000120 = (long)param_3 + uVar21;
  if (uStack0000000000000120 <= in_stack_00000098 &&
      (undefined *)((long)unaff_x26 + (long)unaff_x24) <= unaff_x21) goto code_r0x00153978;
  puVar45 = &uStack0000000000000128;
  param_5 = &uStack0000000000000120;
  param_6 = in_stack_00000098;
  uStack0000000000000120 = (ulong)param_3;
  uStack0000000000000128 = uVar21;
  in_stack_00000130 = param_4;
  in_stack_00000138 = unaff_x28;
  unaff_x24 = (undefined *)func_0x00155c78(unaff_x26,in_stack_00000078);
  param_7 = (ulong)in_stack_00000050._4_4_;
  param_3 = in_stack_00000060;
  unaff_x30 = in_stack_000000a0;
  if ((undefined *)0xffffffffffffff88 < unaff_x24) goto LAB_00153e60;
  goto code_r0x00153a58;
code_r0x00153978:
  uVar48 = *param_3;
  unaff_x26[1] = param_3[1];
  *unaff_x26 = uVar48;
  if (0x10 < uVar21) {
    uVar48 = param_3[2];
    unaff_x26[3] = param_3[3];
    unaff_x26[2] = uVar48;
    if (0x10 < uVar21 - 0x10) {
      puVar15 = unaff_x26 + 4;
      puVar40 = in_stack_00000090;
      do {
        uVar48 = puVar40[-2];
        puVar15[1] = puVar40[-1];
        *puVar15 = uVar48;
        uVar48 = *puVar40;
        puVar15[3] = puVar40[1];
        puVar15[2] = uVar48;
        puVar15 = puVar15 + 4;
        puVar40 = puVar40 + 4;
      } while (puVar15 < unaff_x27);
    }
  }
  unaff_x20 = param_4;
  if ((undefined8 *)((long)unaff_x27 - (long)unaff_x30) < unaff_x28) {
    puVar15 = unaff_x26;
    if ((undefined8 *)((long)unaff_x27 - in_stack_00000070) < unaff_x28) goto code_r0x00153e5c;
    lVar24 = (long)param_1 - (long)unaff_x30;
    if (in_stack_000000a8 + lVar24 + (long)param_4 <= in_stack_000000a8) {
      _memmove(unaff_x27);
      goto code_r0x00153a48;
    }
    puVar45 = (undefined8 *)-lVar24;
    _memmove(unaff_x27);
    unaff_x27 = (undefined8 *)((long)unaff_x27 - lVar24);
    unaff_x20 = (undefined8 *)(lVar24 + (long)param_4);
    param_7 = (ulong)in_stack_00000050._4_4_;
    unaff_x23 = 0x18;
    param_3 = in_stack_00000060;
    param_1 = unaff_x30;
    unaff_x22 = in_stack_00000068;
  }
  param_4 = puVar45;
  if ((undefined8 *)((long)&MACH_HEADER.filetype + 3) < unaff_x28) {
    uVar48 = *param_1;
    unaff_x27[1] = param_1[1];
    *unaff_x27 = uVar48;
    if (&MACH_HEADER.ncmds < unaff_x20) goto code_r0x00153a04;
    goto LAB_00153a50;
  }
  if ((undefined8 *)((long)&MACH_HEADER.cputype + 3) < unaff_x28) {
    *unaff_x27 = *param_1;
  }
  else {
    iVar27 = *(int *)(&UNK_008143b0 + (long)unaff_x28 * 4);
    *(undefined1 *)unaff_x27 = *(undefined1 *)param_1;
    *(undefined1 *)((long)unaff_x27 + 1) = *(undefined1 *)((long)param_1 + 1);
    *(undefined1 *)((long)unaff_x27 + 2) = *(undefined1 *)((long)param_1 + 2);
    *(undefined1 *)((long)unaff_x27 + 3) = *(undefined1 *)((long)param_1 + 3);
    puVar7 = (undefined4 *)((long)param_1 + (ulong)*(uint *)(&UNK_00814390 + (long)unaff_x28 * 4));
    param_1 = (undefined8 *)((long)puVar7 - (long)iVar27);
    *(undefined4 *)((long)unaff_x27 + 4) = *puVar7;
  }
  if (&MACH_HEADER.cpusubtype < unaff_x20) {
    puVar45 = param_1 + 1;
    puVar15 = unaff_x27 + 1;
    if ((long)puVar15 - (long)puVar45 < 0x10) {
      do {
        puVar40 = puVar15 + 1;
        *puVar15 = *puVar45;
        puVar45 = puVar45 + 1;
        puVar15 = puVar40;
      } while (puVar40 < (undefined8 *)((long)unaff_x27 + (long)unaff_x20));
    }
    else {
      uVar48 = *puVar45;
      unaff_x27[2] = param_1[2];
      *puVar15 = uVar48;
      if (&MACH_HEADER.ncmds < unaff_x20 + -1) {
        puVar45 = unaff_x27 + 3;
        puVar15 = param_1 + 5;
        do {
          uVar48 = puVar15[-2];
          puVar45[1] = puVar15[-1];
          *puVar45 = uVar48;
          uVar48 = *puVar15;
          puVar45[3] = puVar15[1];
          puVar45[2] = uVar48;
          puVar45 = puVar45 + 4;
          puVar15 = puVar15 + 4;
        } while (puVar45 < (undefined8 *)((long)unaff_x27 + (long)unaff_x20));
      }
    }
  }
  unaff_x30 = in_stack_000000a0;
code_r0x00153a48:
  param_7 = (ulong)in_stack_00000050._4_4_;
  unaff_x23 = 0x18;
  param_3 = in_stack_00000060;
  unaff_x22 = in_stack_00000068;
  goto LAB_00153a50;
code_r0x00153e5c:
  unaff_x24 = (undefined *)0xffffffffffffffec;
  unaff_x26 = puVar15;
LAB_00153e60:
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
    return unaff_x24;
  }
  auVar56 = ___stack_chk_fail();
  puVar40 = auVar56._8_8_;
  plVar14 = auVar56._0_8_;
  puStack_60 = unaff_x28;
  puStack_58 = unaff_x27;
  puStack_50 = unaff_x26;
  lStack_48 = unaff_x25;
  puStack_40 = unaff_x24;
  uStack_38 = unaff_x23;
  puStack_30 = unaff_x22;
  puVar22 = (undefined1 *)
            ((long)puVar40 + ((ulong)puVar45 & ((long)puVar45 >> 0x3f ^ 0xffffffffffffffffU)));
  puStack_88 = (undefined8 *)plVar14[0xeb5];
  puVar45 = (undefined8 *)plVar14[0xed3];
  puVar15 = puVar40;
  if ((int)param_7 == 0) {
    iVar27 = (int)plVar14[0xed4];
    puVar18 = (undefined8 *)plVar14[0xeb5];
    goto joined_r0x00153fc8;
  }
  puVar18 = (undefined8 *)plVar14[0xe99];
  lVar24 = plVar14[0xe9a];
  uVar21 = plVar14[0xe9b];
  *(undefined4 *)((long)plVar14 + 0x7534) = 1;
  uVar49 = *(ulong *)((long)plVar14 + 0x683c);
  auStack_a0[1] = uVar49 >> 0x20;
  auStack_a0[0] = uVar49 & 0xffffffff;
  auStack_a0[2] = (ulong)*(uint *)((long)plVar14 + 0x6844);
  if (param_6 == (undefined8 *)0x0) {
    return (undefined1 *)0xffffffffffffffec;
  }
  puVar20 = param_5 + 1;
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
    iVar27 = (int)LZCOUNT((uint)((byte *)((long)param_6 + (long)param_5))[-1]) + (int)param_6 * -8 +
             0x29;
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
  uVar8 = *(uint *)(*plVar14 + 4);
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
  lVar1 = *plVar14 + 8;
  uVar8 = *(uint *)(plVar14[2] + 4);
  uStack_f0 = uVar8 + uStack_f0;
  uStack_c0 = uStack_f8 >> ((ulong)-uStack_f0 & 0x3f) &
              (ulong)*(uint *)(&UNK_00814304 + (ulong)uVar8 * 4);
  iVar27 = (int)param_5;
  if (uStack_f0 < 0x41) {
    if (puVar28 < puVar20) {
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
  puVar43 = (undefined8 *)((long)plVar14 + 0x76a4);
  lVar2 = plVar14[2] + 8;
  uVar8 = *(uint *)(plVar14[1] + 4);
  uStack_f0 = uVar8 + uStack_f0;
  uStack_b0 = uStack_f8 >> ((ulong)-uStack_f0 & 0x3f) &
              (ulong)*(uint *)(&UNK_00814304 + (ulong)uVar8 * 4);
  if (uStack_f0 < 0x41) {
    if (puVar32 < puVar20) {
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
  lVar3 = plVar14[1] + 8;
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
      if (puStack_e8 < puVar20) {
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
  iVar46 = (int)param_7;
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
      if (puStack_e8 < puVar20) {
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
      puVar29 = (undefined1 *)plVar14[0xed3];
      if ((undefined1 *)((long)puStack_88 + uVar49) <= puVar29) goto code_r0x00154484;
    }
    else {
      puStack_e8 = (ulong *)&UNK_00814388;
      puVar29 = (undefined1 *)plVar14[0xed3];
      if ((undefined1 *)((long)puStack_88 + uVar49) <= puVar29) goto code_r0x00154484;
    }
    if (iVar46 < 1) {
      return (undefined1 *)0xffffffffffffffec;
    }
code_r0x001547d8:
    uVar16 = (long)puVar29 - (long)puStack_88;
    if (uVar16 == 0) goto code_r0x00154a08;
    if ((ulong)((long)puVar22 - (long)puVar15) < uVar16) {
      return (undefined1 *)0xffffffffffffffba;
    }
    uVar31 = (long)puVar15 - (long)puStack_88;
    puVar45 = (undefined8 *)((long)puVar15 + uVar16);
    if (((long)uVar31 < -7) && (7 < uVar16)) {
      if (uVar31 < 0xfffffffffffffff0) {
        puVar42 = puVar45 + -4;
        if (puVar15 <= puVar42) {
          uVar48 = *puStack_88;
          puVar15[1] = puStack_88[1];
          *puVar15 = uVar48;
          if (0x10 < (ulong)((long)puVar42 - (long)puVar15)) {
            puVar25 = puVar15 + 2;
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
          puStack_88 = (undefined8 *)((long)puStack_88 + ((long)puVar42 - (long)puVar15));
code_r0x001548ac:
          puVar29 = (undefined1 *)((long)puVar15 + (uVar16 - (long)puVar42));
          if ((puVar29 < (undefined1 *)0x8) || ((ulong)((long)puVar42 - (long)puStack_88) < 0x40)) {
            puVar15 = puVar42;
          }
          else {
            if (puVar29 < (undefined1 *)0x40) {
              puVar35 = (undefined1 *)0x0;
            }
            else {
              puVar35 = (undefined1 *)((ulong)puVar29 & 0xffffffffffffffc0);
              puVar15 = puVar42 + 4;
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
                puVar15[-3] = puVar25[-3];
                puVar15[-4] = uVar48;
                puVar15[-1] = uVar51;
                puVar15[-2] = uVar50;
                puVar15[1] = uVar53;
                *puVar15 = uVar52;
                puVar15[3] = uVar55;
                puVar15[2] = uVar54;
                puVar39 = puVar39 + -0x40;
                puVar15 = puVar15 + 8;
                puVar25 = puVar25 + 8;
              } while (puVar39 != (undefined1 *)0x0);
              if (puVar29 == puVar35) goto code_r0x00154a00;
              if (((ulong)puVar29 & 0x38) == 0) {
                puStack_88 = (undefined8 *)((long)puStack_88 + (long)puVar35);
                puVar15 = (undefined8 *)((long)puVar42 + (long)puVar35);
                goto code_r0x001549d0;
              }
            }
            puVar39 = (undefined1 *)((ulong)puVar29 & 0xfffffffffffffff8);
            lVar36 = (long)puVar35 - (long)puVar39;
            puVar15 = (undefined8 *)((long)puVar42 + (long)puVar35);
            puVar25 = (undefined8 *)((long)puStack_88 + (long)puVar35);
            do {
              *puVar15 = *puVar25;
              lVar36 = lVar36 + 8;
              puVar15 = puVar15 + 1;
              puVar25 = puVar25 + 1;
            } while (lVar36 != 0);
            puVar15 = (undefined8 *)((long)puVar42 + (long)puVar39);
            puStack_88 = (undefined8 *)((long)puStack_88 + (long)puVar39);
            if (puVar29 == puVar39) goto code_r0x00154a00;
          }
code_r0x001549d0:
          do {
            puVar25 = (undefined8 *)((long)puVar15 + 1);
            *(undefined1 *)puVar15 = *(undefined1 *)puStack_88;
            puVar15 = puVar25;
            puStack_88 = (undefined8 *)((long)puStack_88 + 1);
          } while (puVar25 != (undefined8 *)((long)puVar42 + (long)puVar29));
          goto code_r0x00154a00;
        }
      }
      puVar42 = puVar15;
      if ((long)uVar16 < 1) goto code_r0x00154a00;
      goto code_r0x001548ac;
    }
    if ((long)uVar16 < 1) goto code_r0x00154a00;
    puVar29 = (undefined1 *)((long)puVar15 + (long)puVar29) + -(long)puStack_88;
    if (puVar29 <= (undefined1 *)((long)puVar15 + 1U)) {
      puVar29 = (undefined1 *)((long)puVar15 + 1);
    }
    uVar30 = (long)puVar29 - (long)puVar15;
    if ((uVar30 < 8) || (uVar31 < 0x40)) goto code_r0x001549f0;
    if (uVar30 < 0x40) {
      uVar31 = 0;
      goto code_r0x00154994;
    }
    uVar31 = uVar30 & 0xffffffffffffffc0;
    puVar42 = puVar15 + 4;
    puVar25 = puStack_88 + 4;
    uVar37 = uVar31;
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
    if (uVar30 != uVar31) {
      if ((uVar30 & 0x38) == 0) {
        puStack_88 = (undefined8 *)((long)puStack_88 + uVar31);
        puVar15 = (undefined8 *)((long)puVar15 + uVar31);
      }
      else {
code_r0x00154994:
        uVar37 = uVar30 & 0xfffffffffffffff8;
        lVar36 = uVar31 - uVar37;
        puVar42 = (undefined8 *)((long)puStack_88 + uVar31);
        puVar25 = (undefined8 *)((long)puVar15 + uVar31);
        do {
          *puVar25 = *puVar42;
          lVar36 = lVar36 + 8;
          puVar42 = puVar42 + 1;
          puVar25 = puVar25 + 1;
        } while (lVar36 != 0);
        puVar15 = (undefined8 *)((long)puVar15 + uVar37);
        puStack_88 = (undefined8 *)((long)puStack_88 + uVar37);
        if (uVar30 == uVar37) goto code_r0x00154a00;
      }
code_r0x001549f0:
      do {
        puVar42 = (undefined8 *)((long)puVar15 + 1);
        *(undefined1 *)puVar15 = *(undefined1 *)puStack_88;
        puVar15 = puVar42;
        puStack_88 = (undefined8 *)((long)puStack_88 + 1);
      } while (puVar42 < puVar45);
    }
code_r0x00154a00:
    uVar49 = uVar49 - uVar16;
    puVar15 = puVar45;
code_r0x00154a08:
    puVar45 = (undefined8 *)((long)plVar14 + 0x176a4);
    *(undefined4 *)(plVar14 + 0xed4) = 0;
    puVar42 = (undefined8 *)((long)puVar15 + uVar49);
    puVar25 = (undefined8 *)((long)puVar42 - uVar17);
    Hint_Prefetch(puVar25,0,0,0);
    if ((puVar45 < (undefined8 *)((long)puVar43 + uVar49)) ||
       (puVar29 = (undefined1 *)(uVar49 + uVar47),
       puVar22 + -0x20 < (undefined1 *)((long)puVar15 + (long)puVar29))) {
      puStack_88 = puVar43;
      uStack_80 = uVar49;
      uStack_78 = uVar47;
      uStack_70 = uVar17;
      puVar29 = (undefined1 *)
                func_0x00155c78(puVar15,puVar22,&uStack_80,&puStack_88,puVar45,puVar18,lVar24,uVar21
                               );
    }
    else {
      uVar48 = *puVar43;
      puVar15[1] = *(undefined8 *)((long)plVar14 + 0x76ac);
      *puVar15 = uVar48;
      if (0x10 < uVar49) {
        uVar48 = *(undefined8 *)((long)plVar14 + 0x76b4);
        puVar15[3] = *(undefined8 *)((long)plVar14 + 0x76bc);
        puVar15[2] = uVar48;
        if (0x10 < uVar49 - 0x10) {
          puVar23 = puVar15 + 4;
          puVar26 = (undefined8 *)((long)plVar14 + 0x76d4);
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
      if ((ulong)((long)puVar42 - (long)puVar18) < uVar17) {
        if ((ulong)((long)puVar42 - lVar24) < uVar17) {
          return (undefined1 *)0xffffffffffffffec;
        }
        lVar41 = (long)puVar25 - (long)puVar18;
        lVar36 = uVar21 + lVar41;
        if (lVar36 + uVar47 <= uVar21) {
          _memmove(puVar42,lVar36,uVar47);
          goto joined_r0x00154b24;
        }
        _memmove(puVar42,lVar36,-lVar41);
        puVar42 = (undefined8 *)((long)puVar42 - lVar41);
        uVar47 = lVar41 + uVar47;
        puVar25 = puVar18;
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
    puVar15 = (undefined8 *)((long)puVar15 + (long)puVar29);
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
            if (lVar36 == 1) goto LAB_00154bdc;
          }
          goto code_r0x00154bb0;
        }
        uVar17 = auStack_a0[bVar13];
        puVar28 = auStack_a0 + !bVar13;
      }
      else {
        uVar17 = (ulong)uStack_f0;
        uStack_f0 = uStack_f0 + uVar33;
        uVar17 = ((uStack_f8 << (uVar17 & 0x3f)) >> ((ulong)-uVar33 & 0x3f)) + (ulong)uVar8;
code_r0x00154bb0:
        auStack_a0[2] = auStack_a0[1];
      }
LAB_00154bdc:
      auStack_a0[0] = uVar17;
      auStack_a0[1] = *puVar28;
      if (bVar10 != 0) {
        uVar16 = (ulong)uStack_f0;
        uStack_f0 = uStack_f0 + bVar10;
        uVar47 = ((uStack_f8 << (uVar16 & 0x3f)) >> ((ulong)-(uint)bVar10 & 0x3f)) + uVar47;
      }
      if (0x1e < ((uint)bVar10 + (uint)bVar9 + uVar33 & 0xff)) {
        if (uStack_f0 < 0x41) {
          if (puStack_e8 < puVar20) {
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
        uVar16 = (ulong)uStack_f0;
        uStack_f0 = uStack_f0 + bVar9;
        uVar49 = ((uStack_f8 << (uVar16 & 0x3f)) >> ((ulong)-(uint)bVar9 & 0x3f)) + uVar49;
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
          if (puStack_e8 < puVar20) {
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
      puVar43 = (undefined8 *)((long)puVar15 + uVar49);
      puVar42 = (undefined8 *)((long)puVar43 - uVar17);
      Hint_Prefetch(puVar42,0,0,0);
      if ((puVar45 < (undefined8 *)((long)puStack_88 + uVar49)) ||
         (puVar29 = (undefined1 *)(uVar49 + uVar47),
         puVar22 + -0x20 < (undefined1 *)((long)puVar15 + (long)puVar29))) {
        uStack_80 = uVar49;
        uStack_78 = uVar47;
        uStack_70 = uVar17;
        puVar29 = (undefined1 *)
                  func_0x00155c78(puVar15,puVar22,&uStack_80,&puStack_88,puVar45,puVar18,lVar24,
                                  uVar21);
      }
      else {
        uVar48 = *puStack_88;
        puVar15[1] = puStack_88[1];
        *puVar15 = uVar48;
        if (0x10 < uVar49) {
          uVar48 = puStack_88[2];
          puVar15[3] = puStack_88[3];
          puVar15[2] = uVar48;
          if (0x10 < uVar49 - 0x10) {
            puVar25 = puVar15 + 4;
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
        puStack_88 = (undefined8 *)((long)puStack_88 + uVar49);
        if ((ulong)((long)puVar43 - (long)puVar18) < uVar17) {
          if ((ulong)((long)puVar43 - lVar24) < uVar17) {
            return (undefined1 *)0xffffffffffffffec;
          }
          lVar41 = (long)puVar42 - (long)puVar18;
          lVar36 = uVar21 + lVar41;
          if (lVar36 + uVar47 <= uVar21) {
            _memmove(puVar43,lVar36,uVar47);
            goto joined_r0x00154e58;
          }
          _memmove(puVar43,lVar36,-lVar41);
          puVar43 = (undefined8 *)((long)puVar43 - lVar41);
          uVar47 = lVar41 + uVar47;
          puVar42 = puVar18;
        }
        if (uVar17 < 0x10) {
          if (uVar17 < 8) {
            iVar46 = *(int *)(&UNK_008143b0 + uVar17 * 4);
            *(undefined1 *)puVar43 = *(undefined1 *)puVar42;
            *(undefined1 *)((long)puVar43 + 1) = *(undefined1 *)((long)puVar42 + 1);
            *(undefined1 *)((long)puVar43 + 2) = *(undefined1 *)((long)puVar42 + 2);
            *(undefined1 *)((long)puVar43 + 3) = *(undefined1 *)((long)puVar42 + 3);
            puVar7 = (undefined4 *)((long)puVar42 + (ulong)*(uint *)(&UNK_00814390 + uVar17 * 4));
            puVar42 = (undefined8 *)((long)puVar7 - (long)iVar46);
            *(undefined4 *)((long)puVar43 + 4) = *puVar7;
          }
          else {
            *puVar43 = *puVar42;
          }
          if (8 < uVar47) {
            puVar25 = puVar42 + 1;
            puVar23 = puVar43 + 1;
            if ((long)puVar23 - (long)puVar25 < 0x10) {
              do {
                puVar42 = puVar23 + 1;
                *puVar23 = *puVar25;
                puVar25 = puVar25 + 1;
                puVar23 = puVar42;
              } while (puVar42 < (undefined8 *)((long)puVar43 + uVar47));
            }
            else {
              uVar48 = *puVar25;
              puVar43[2] = puVar42[2];
              *puVar23 = uVar48;
              if (0x10 < uVar47 - 8) {
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
                } while (puVar25 < (undefined8 *)((long)puVar43 + uVar47));
              }
            }
          }
        }
        else {
          uVar48 = *puVar42;
          puVar43[1] = puVar42[1];
          *puVar43 = uVar48;
          if (0x10 < uVar47) {
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
            } while (puVar25 < (undefined8 *)((long)puVar43 + uVar47));
          }
        }
      }
joined_r0x00154e58:
      if ((undefined1 *)0xffffffffffffff88 < puVar29) {
        return puVar29;
      }
      puVar15 = (undefined8 *)((long)puVar15 + (long)puVar29);
      iVar44 = iVar44 + -1;
    } while (iVar44 != 0);
code_r0x00155070:
    if (puStack_e8 != param_5) {
      return (undefined1 *)0xffffffffffffffec;
    }
    if (uStack_f0 != 0x40) {
      return (undefined1 *)0xffffffffffffffec;
    }
    *(ulong *)((long)plVar14 + 0x683c) = CONCAT44((int)auStack_a0[1],(int)auStack_a0[0]);
    *(int *)((long)plVar14 + 0x6844) = (int)auStack_a0[2];
    iVar27 = (int)plVar14[0xed4];
    puVar18 = puStack_88;
joined_r0x00153fc8:
    puStack_88 = puVar18;
    if (iVar27 == 2) {
      uVar21 = (long)puVar45 - (long)puVar18;
      if ((ulong)((long)puVar22 - (long)puVar15) < uVar21) {
        return (undefined1 *)0xffffffffffffffba;
      }
      if (puVar15 != (undefined8 *)0x0) {
        _memmove(puVar15,puVar18,uVar21);
        puVar15 = (undefined8 *)((long)puVar15 + uVar21);
      }
      puVar18 = (undefined8 *)((long)plVar14 + 0x76a4);
      puVar45 = (undefined8 *)((long)plVar14 + 0x176a4);
      *(undefined4 *)(plVar14 + 0xed4) = 0;
    }
    uVar21 = (long)puVar45 - (long)puVar18;
    if ((ulong)((long)puVar22 - (long)puVar15) < uVar21) {
      return (undefined1 *)0xffffffffffffffba;
    }
    if (puVar15 == (undefined8 *)0x0) {
      puVar22 = (undefined1 *)0x0;
    }
    else {
      _memcpy(puVar15,puVar18,uVar21);
      puVar22 = (undefined1 *)((long)puVar15 + uVar21);
    }
    return puVar22 + -(long)puVar40;
  }
  puVar29 = (undefined1 *)plVar14[0xed3];
  if (puVar29 < (undefined1 *)((long)puStack_88 + uVar49)) goto code_r0x001547d8;
code_r0x00154484:
  puVar42 = (undefined8 *)((long)puStack_88 + uVar49);
  if ((puVar45 < puVar42) ||
     (puVar29 = (undefined1 *)(uVar49 + uVar47),
     puVar42 + -4 < (undefined8 *)((long)puVar15 + (long)puVar29))) {
    uStack_80 = uVar49;
    uStack_78 = uVar47;
    uStack_70 = uVar17;
    puVar29 = (undefined1 *)
              func_0x00156308(puVar15,puVar22,puVar42 + -4,&uStack_80,&puStack_88,puVar45,puVar18,
                              lVar24,uVar21);
  }
  else {
    puVar25 = (undefined8 *)((long)puVar15 + uVar49);
    uVar48 = *puStack_88;
    puVar15[1] = puStack_88[1];
    *puVar15 = uVar48;
    if (0x10 < uVar49) {
      uVar48 = puStack_88[2];
      puVar15[3] = puStack_88[3];
      puVar15[2] = uVar48;
      if (0x10 < uVar49 - 0x10) {
        puVar23 = puVar15 + 4;
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
    if ((ulong)((long)puVar25 - (long)puVar18) < uVar17) {
      if ((ulong)((long)puVar25 - lVar24) < uVar17) {
        return (undefined1 *)0xffffffffffffffec;
      }
      lVar41 = (long)((long)puVar25 - uVar17) - (long)puVar18;
      lVar36 = uVar21 + lVar41;
      if (lVar36 + uVar47 <= uVar21) {
        _memmove(puVar25,lVar36,uVar47);
        goto LAB_00154570;
      }
      _memmove(puVar25,lVar36,-lVar41);
      puVar25 = (undefined8 *)((long)puVar25 - lVar41);
      uVar47 = lVar41 + uVar47;
      puVar42 = puVar18;
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
  puVar15 = (undefined8 *)((long)puVar15 + (long)puVar29);
  param_7 = (ulong)(iVar46 - 1U);
  if (iVar46 - 1U == 0) goto code_r0x00155070;
  goto LAB_00154284;
}

