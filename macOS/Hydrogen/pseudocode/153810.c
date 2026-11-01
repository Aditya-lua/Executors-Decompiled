
/* WARNING: Type propagation algorithm not settling */

undefined *
FUN_00153810(ulong *param_1,undefined8 param_2,undefined8 *param_3,undefined8 *param_4,
            ulong *param_5,undefined8 *param_6,ulong param_7)

{
  ulong *puVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  ushort *puVar5;
  ushort *puVar6;
  ushort *puVar7;
  undefined4 *puVar8;
  uint uVar9;
  byte bVar10;
  byte bVar11;
  byte bVar12;
  int iVar13;
  bool bVar14;
  long *plVar15;
  ulong uVar16;
  ulong uVar17;
  undefined8 *puVar18;
  undefined8 *puVar19;
  undefined1 *puVar20;
  undefined8 *puVar21;
  ulong in_x9;
  undefined8 *puVar22;
  undefined8 *in_x10;
  undefined8 *puVar23;
  int iVar24;
  undefined8 *in_x11;
  ulong *puVar25;
  undefined8 *in_x12;
  ulong uVar26;
  undefined1 *puVar27;
  ulong uVar28;
  undefined *in_x13;
  ulong uVar29;
  undefined8 *in_x14;
  undefined8 *puVar30;
  ulong *puVar31;
  uint uVar32;
  undefined *puVar33;
  undefined1 *puVar34;
  long lVar35;
  ulong uVar36;
  undefined1 *puVar37;
  uint unaff_w19;
  undefined8 *puVar38;
  undefined *unaff_x21;
  undefined8 *unaff_x22;
  long lVar39;
  long lVar40;
  ulong unaff_x23;
  undefined8 *puVar41;
  int iVar42;
  undefined *puVar43;
  long unaff_x25;
  undefined8 *puVar44;
  int iVar45;
  ulong uVar46;
  long unaff_x29;
  undefined8 *unaff_x30;
  undefined8 uVar47;
  ulong uVar48;
  undefined8 uVar49;
  undefined8 uVar50;
  undefined8 uVar51;
  undefined8 uVar52;
  undefined8 uVar53;
  undefined8 uVar54;
  undefined1 auVar55 [16];
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
  
  uStack0000000000000120 = (ulong)in_x11;
code_r0x00153810:
  puVar44 = (undefined8 *)uStack0000000000000120;
LAB_00153904:
  do {
    puVar30 = (undefined8 *)((long)in_x14 + 1);
    *(undefined1 *)in_x14 = *(undefined1 *)puVar44;
    in_x14 = puVar30;
    puVar44 = (undefined8 *)((long)puVar44 + 1);
  } while (puVar30 != (undefined8 *)((long)in_x12 + (long)in_x13));
LAB_00153934:
  uVar26 = *param_1 - in_x9;
  *param_1 = uVar26;
  puVar44 = in_x10;
code_r0x00153944:
  *(undefined4 *)((long)unaff_x22 + 0xe64) = 0;
  puVar38 = (undefined8 *)param_1[1];
  puVar18 = (undefined8 *)param_1[2];
  puVar30 = (undefined8 *)((long)puVar44 + uVar26);
  puVar19 = (undefined8 *)((long)puVar30 - (long)puVar18);
  Hint_Prefetch(puVar19,0,0,0);
  puVar43 = (undefined *)((long)puVar38 + uVar26);
  uStack0000000000000120 = (long)param_3 + uVar26;
  if (in_stack_00000098 < uStack0000000000000120 ||
      unaff_x21 < (undefined *)((long)puVar44 + (long)puVar43)) {
    param_4 = &uStack0000000000000128;
    param_5 = &uStack0000000000000120;
    param_6 = in_stack_00000098;
    uStack0000000000000120 = (ulong)param_3;
    uStack0000000000000128 = uVar26;
    in_stack_00000130 = puVar38;
    in_stack_00000138 = puVar18;
    puVar43 = (undefined *)func_0x00155c78(puVar44,in_stack_00000078);
    param_7 = (ulong)in_stack_00000050._4_4_;
    unaff_x30 = in_stack_000000a0;
    param_3 = in_stack_00000060;
  }
  else {
    uVar47 = *param_3;
    puVar44[1] = param_3[1];
    *puVar44 = uVar47;
    if (0x10 < uVar26) {
      uVar47 = param_3[2];
      puVar44[3] = param_3[3];
      puVar44[2] = uVar47;
      if (0x10 < uVar26 - 0x10) {
        puVar41 = puVar44 + 4;
        puVar22 = in_stack_00000090;
        do {
          uVar47 = puVar22[-2];
          puVar41[1] = puVar22[-1];
          *puVar41 = uVar47;
          uVar47 = *puVar22;
          puVar41[3] = puVar22[1];
          puVar41[2] = uVar47;
          puVar41 = puVar41 + 4;
          puVar22 = puVar22 + 4;
        } while (puVar41 < puVar30);
      }
    }
    puVar41 = puVar38;
    if ((undefined8 *)((long)puVar30 - (long)unaff_x30) < puVar18) {
      if ((undefined8 *)((long)puVar30 - in_stack_00000070) < puVar18) {
LAB_00153e5c:
        puVar43 = (undefined *)0xffffffffffffffec;
        goto LAB_00153e60;
      }
      lVar39 = (long)puVar19 - (long)unaff_x30;
      if (in_stack_000000a8 < in_stack_000000a8 + lVar39 + (long)puVar38) {
        param_4 = (undefined8 *)-lVar39;
        _memmove(puVar30);
        puVar30 = (undefined8 *)((long)puVar30 - lVar39);
        puVar41 = (undefined8 *)(lVar39 + (long)puVar38);
        param_7 = (ulong)in_stack_00000050._4_4_;
        unaff_x23 = 0x18;
        param_3 = in_stack_00000060;
        puVar19 = unaff_x30;
        unaff_x22 = in_stack_00000068;
        goto LAB_001539ec;
      }
      _memmove(puVar30);
    }
    else {
LAB_001539ec:
      puVar38 = param_4;
      if (&MACH_HEADER.ncmds <= puVar18) {
        uVar47 = *puVar19;
        puVar30[1] = puVar19[1];
        *puVar30 = uVar47;
        param_4 = puVar38;
        if (&MACH_HEADER.ncmds < puVar41) {
          puVar38 = puVar30 + 2;
          do {
            uVar47 = puVar19[2];
            puVar38[1] = puVar19[3];
            *puVar38 = uVar47;
            uVar47 = puVar19[4];
            puVar38[3] = puVar19[5];
            puVar38[2] = uVar47;
            puVar38 = puVar38 + 4;
            puVar19 = puVar19 + 4;
          } while (puVar38 < (undefined8 *)((long)puVar30 + (long)puVar41));
        }
        goto joined_r0x00153b5c;
      }
      if ((undefined8 *)((long)&MACH_HEADER.cputype + 3) < puVar18) {
        *puVar30 = *puVar19;
      }
      else {
        iVar24 = *(int *)(&UNK_008143b0 + (long)puVar18 * 4);
        *(undefined1 *)puVar30 = *(undefined1 *)puVar19;
        *(undefined1 *)((long)puVar30 + 1) = *(undefined1 *)((long)puVar19 + 1);
        *(undefined1 *)((long)puVar30 + 2) = *(undefined1 *)((long)puVar19 + 2);
        *(undefined1 *)((long)puVar30 + 3) = *(undefined1 *)((long)puVar19 + 3);
        puVar8 = (undefined4 *)((long)puVar19 + (ulong)*(uint *)(&UNK_00814390 + (long)puVar18 * 4))
        ;
        puVar19 = (undefined8 *)((long)puVar8 - (long)iVar24);
        *(undefined4 *)((long)puVar30 + 4) = *puVar8;
      }
      if (&MACH_HEADER.cpusubtype < puVar41) {
        puVar22 = puVar19 + 1;
        puVar21 = puVar30 + 1;
        if ((long)puVar21 - (long)puVar22 < 0x10) {
          do {
            puVar19 = puVar21 + 1;
            *puVar21 = *puVar22;
            puVar22 = puVar22 + 1;
            puVar21 = puVar19;
          } while (puVar19 < (undefined8 *)((long)puVar30 + (long)puVar41));
        }
        else {
          uVar47 = *puVar22;
          puVar30[2] = puVar19[2];
          *puVar21 = uVar47;
          if (&MACH_HEADER.ncmds < puVar41 + -1) {
            puVar22 = puVar30 + 3;
            puVar19 = puVar19 + 5;
            do {
              uVar47 = puVar19[-2];
              puVar22[1] = puVar19[-1];
              *puVar22 = uVar47;
              uVar47 = *puVar19;
              puVar22[3] = puVar19[1];
              puVar22[2] = uVar47;
              puVar22 = puVar22 + 4;
              puVar19 = puVar19 + 4;
            } while (puVar22 < (undefined8 *)((long)puVar30 + (long)puVar41));
          }
        }
      }
      unaff_x30 = in_stack_000000a0;
    }
    param_7 = (ulong)in_stack_00000050._4_4_;
    unaff_x23 = 0x18;
    param_4 = puVar38;
    unaff_x22 = in_stack_00000068;
    param_3 = in_stack_00000060;
  }
joined_r0x00153b5c:
  if ((undefined *)0xffffffffffffff88 < puVar43) goto LAB_00153e60;
  puVar44 = (undefined8 *)((long)puVar44 + (long)puVar43);
  unaff_w19 = unaff_w19 + 1;
  if (unaff_w19 != (uint)param_7) {
    do {
      param_1 = (ulong *)(unaff_x25 + (ulong)(unaff_w19 & 7) * (unaff_x23 & 0xffffffff));
      if (*(int *)((long)unaff_x22 + 0xe64) == 2) {
        uVar26 = *param_1;
        puVar19 = *(undefined8 **)(&UNK_00007698 + in_stack_00000038);
        puVar38 = (undefined8 *)(uStack0000000000000120 + uVar26);
        if (puVar19 < puVar38) goto code_r0x00153500;
        param_4 = puVar38 + -4;
        puVar41 = (undefined8 *)param_1[1];
        puVar30 = (undefined8 *)param_1[2];
        puVar43 = (undefined *)((long)puVar41 + uVar26);
        if (in_stack_00000098 < puVar38 || param_4 < (undefined8 *)((long)puVar44 + (long)puVar43))
        {
          param_5 = &uStack0000000000000128;
          param_6 = &uStack0000000000000120;
          uStack0000000000000128 = uVar26;
          in_stack_00000130 = puVar41;
          in_stack_00000138 = puVar30;
          puVar43 = (undefined *)func_0x00156308(puVar44,in_stack_00000078);
          puVar41 = puVar18;
          goto code_r0x00153acc;
        }
        puVar19 = (undefined8 *)((long)puVar44 + uVar26);
        uVar47 = *(undefined8 *)uStack0000000000000120;
        puVar44[1] = *(undefined8 *)(uStack0000000000000120 + 8);
        *puVar44 = uVar47;
        if (0x10 < uVar26) {
          uVar47 = *(undefined8 *)(uStack0000000000000120 + 0x10);
          puVar44[3] = *(undefined8 *)(uStack0000000000000120 + 0x18);
          puVar44[2] = uVar47;
          if (0x10 < uVar26 - 0x10) {
            puVar18 = puVar44 + 4;
            puVar22 = (undefined8 *)(uStack0000000000000120 + 0x30);
            do {
              uVar47 = puVar22[-2];
              puVar18[1] = puVar22[-1];
              *puVar18 = uVar47;
              uVar47 = *puVar22;
              puVar18[3] = puVar22[1];
              puVar18[2] = uVar47;
              puVar18 = puVar18 + 4;
              puVar22 = puVar22 + 4;
            } while (puVar18 < puVar19);
          }
        }
        puVar22 = (undefined8 *)((long)puVar19 - (long)puVar30);
        uStack0000000000000120 = (ulong)puVar38;
        if ((undefined8 *)((long)puVar19 - (long)unaff_x30) < puVar30) {
          puVar18 = puVar19;
          if ((undefined8 *)((long)puVar19 - in_stack_00000070) < puVar30) goto LAB_00153e5c;
          lVar39 = ((long)puVar19 - (long)puVar30) - (long)unaff_x30;
          if (in_stack_000000a8 + lVar39 + (long)puVar41 <= in_stack_000000a8)
          goto code_r0x001537a0;
          param_4 = (undefined8 *)-lVar39;
          _memmove(puVar19);
          puVar19 = (undefined8 *)((long)puVar19 - lVar39);
          puVar41 = (undefined8 *)(lVar39 + (long)puVar41);
          param_7 = (ulong)in_stack_00000050._4_4_;
          unaff_x23 = 0x18;
          param_3 = in_stack_00000060;
          puVar22 = unaff_x30;
          unaff_x22 = in_stack_00000068;
        }
        puVar18 = puVar19;
        if (&MACH_HEADER.ncmds <= puVar30) {
          uVar47 = *puVar22;
          puVar19[1] = puVar22[1];
          *puVar19 = uVar47;
          if (&MACH_HEADER.ncmds < puVar41) {
            puVar38 = puVar19 + 2;
            do {
              uVar47 = puVar22[2];
              puVar38[1] = puVar22[3];
              *puVar38 = uVar47;
              uVar47 = puVar22[4];
              puVar38[3] = puVar22[5];
              puVar38[2] = uVar47;
              puVar38 = puVar38 + 4;
              puVar22 = puVar22 + 4;
            } while (puVar38 < (undefined8 *)((long)puVar19 + (long)puVar41));
          }
          goto joined_r0x00153ae0;
        }
        if ((undefined8 *)((long)&MACH_HEADER.cputype + 3) < puVar30) {
          *puVar19 = *puVar22;
        }
        else {
          iVar24 = *(int *)(&UNK_008143b0 + (long)puVar30 * 4);
          *(undefined1 *)puVar19 = *(undefined1 *)puVar22;
          *(undefined1 *)((long)puVar19 + 1) = *(undefined1 *)((long)puVar22 + 1);
          *(undefined1 *)((long)puVar19 + 2) = *(undefined1 *)((long)puVar22 + 2);
          *(undefined1 *)((long)puVar19 + 3) = *(undefined1 *)((long)puVar22 + 3);
          puVar8 = (undefined4 *)
                   ((long)puVar22 + (ulong)*(uint *)(&UNK_00814390 + (long)puVar30 * 4));
          puVar22 = (undefined8 *)((long)puVar8 - (long)iVar24);
          *(undefined4 *)((long)puVar19 + 4) = *puVar8;
        }
        if (&MACH_HEADER.cpusubtype < puVar41) {
          puVar38 = puVar22 + 1;
          puVar21 = puVar19 + 1;
          if ((long)puVar21 - (long)puVar38 < 0x10) {
            do {
              puVar22 = puVar21 + 1;
              *puVar21 = *puVar38;
              puVar38 = puVar38 + 1;
              puVar21 = puVar22;
            } while (puVar22 < (undefined8 *)((long)puVar19 + (long)puVar41));
          }
          else {
            uVar47 = *puVar38;
            puVar19[2] = puVar22[2];
            *puVar21 = uVar47;
            if (&MACH_HEADER.ncmds < puVar41 + -1) {
              puVar38 = puVar19 + 3;
              puVar22 = puVar22 + 5;
              do {
                uVar47 = puVar22[-2];
                puVar38[1] = puVar22[-1];
                *puVar38 = uVar47;
                uVar47 = *puVar22;
                puVar38[3] = puVar22[1];
                puVar38[2] = uVar47;
                puVar38 = puVar38 + 4;
                puVar22 = puVar22 + 4;
              } while (puVar38 < (undefined8 *)((long)puVar19 + (long)puVar41));
            }
          }
        }
LAB_00153e04:
        puVar41 = param_4;
        unaff_x30 = in_stack_000000a0;
LAB_001537b0:
        param_7 = (ulong)in_stack_00000050._4_4_;
        unaff_x23 = 0x18;
        param_4 = puVar41;
        unaff_x22 = in_stack_00000068;
        param_3 = in_stack_00000060;
      }
      else {
        uVar26 = *param_1;
        puVar41 = (undefined8 *)param_1[1];
        puVar30 = (undefined8 *)param_1[2];
        puVar19 = (undefined8 *)((long)puVar44 + uVar26);
        puVar22 = (undefined8 *)((long)puVar19 - (long)puVar30);
        Hint_Prefetch(puVar22,0,0,0);
        puVar43 = (undefined *)((long)puVar41 + uVar26);
        puVar38 = (undefined8 *)(uStack0000000000000120 + uVar26);
        if (in_stack_00000098 < puVar38 || unaff_x21 < (undefined *)((long)puVar44 + (long)puVar43))
        {
          param_4 = &uStack0000000000000128;
          param_5 = &uStack0000000000000120;
          param_6 = in_stack_00000098;
          uStack0000000000000128 = uVar26;
          in_stack_00000130 = puVar41;
          in_stack_00000138 = puVar30;
          puVar43 = (undefined *)func_0x00155c78(puVar44,in_stack_00000078);
code_r0x00153acc:
          param_7 = (ulong)in_stack_00000050._4_4_;
          puVar18 = puVar41;
          unaff_x30 = in_stack_000000a0;
          param_3 = in_stack_00000060;
        }
        else {
          uVar47 = *(undefined8 *)uStack0000000000000120;
          puVar44[1] = *(undefined8 *)(uStack0000000000000120 + 8);
          *puVar44 = uVar47;
          if (0x10 < uVar26) {
            uVar47 = *(undefined8 *)(uStack0000000000000120 + 0x10);
            puVar44[3] = *(undefined8 *)(uStack0000000000000120 + 0x18);
            puVar44[2] = uVar47;
            if (0x10 < uVar26 - 0x10) {
              puVar18 = puVar44 + 4;
              puVar21 = (undefined8 *)(uStack0000000000000120 + 0x30);
              do {
                uVar47 = puVar21[-2];
                puVar18[1] = puVar21[-1];
                *puVar18 = uVar47;
                uVar47 = *puVar21;
                puVar18[3] = puVar21[1];
                puVar18[2] = uVar47;
                puVar18 = puVar18 + 4;
                puVar21 = puVar21 + 4;
              } while (puVar18 < puVar19);
            }
          }
          uStack0000000000000120 = (ulong)puVar38;
          if ((undefined8 *)((long)puVar19 - (long)unaff_x30) < puVar30) {
            puVar18 = puVar41;
            if (puVar30 <= (undefined8 *)((long)puVar19 - in_stack_00000070)) {
              lVar39 = (long)puVar22 - (long)unaff_x30;
              if (in_stack_000000a8 < in_stack_000000a8 + lVar39 + (long)puVar41) {
                param_4 = (undefined8 *)-lVar39;
                _memmove(puVar19);
                puVar19 = (undefined8 *)((long)puVar19 - lVar39);
                puVar41 = (undefined8 *)(lVar39 + (long)puVar41);
                param_7 = (ulong)in_stack_00000050._4_4_;
                unaff_x23 = 0x18;
                param_3 = in_stack_00000060;
                puVar22 = unaff_x30;
                unaff_x22 = in_stack_00000068;
                goto code_r0x00153628;
              }
code_r0x001537a0:
              _memmove(puVar19);
              goto LAB_001537b0;
            }
            goto LAB_00153e5c;
          }
code_r0x00153628:
          puVar18 = puVar41;
          if (puVar30 < &MACH_HEADER.ncmds) {
            if ((undefined8 *)((long)&MACH_HEADER.cputype + 3) < puVar30) {
              *puVar19 = *puVar22;
            }
            else {
              iVar24 = *(int *)(&UNK_008143b0 + (long)puVar30 * 4);
              *(undefined1 *)puVar19 = *(undefined1 *)puVar22;
              *(undefined1 *)((long)puVar19 + 1) = *(undefined1 *)((long)puVar22 + 1);
              *(undefined1 *)((long)puVar19 + 2) = *(undefined1 *)((long)puVar22 + 2);
              *(undefined1 *)((long)puVar19 + 3) = *(undefined1 *)((long)puVar22 + 3);
              puVar8 = (undefined4 *)
                       ((long)puVar22 + (ulong)*(uint *)(&UNK_00814390 + (long)puVar30 * 4));
              puVar22 = (undefined8 *)((long)puVar8 - (long)iVar24);
              *(undefined4 *)((long)puVar19 + 4) = *puVar8;
            }
            if (&MACH_HEADER.cpusubtype < puVar41) {
              puVar38 = puVar22 + 1;
              puVar21 = puVar19 + 1;
              if ((long)puVar21 - (long)puVar38 < 0x10) {
                do {
                  puVar22 = puVar21 + 1;
                  *puVar21 = *puVar38;
                  puVar38 = puVar38 + 1;
                  puVar21 = puVar22;
                } while (puVar22 < (undefined8 *)((long)puVar19 + (long)puVar41));
              }
              else {
                uVar47 = *puVar38;
                puVar19[2] = puVar22[2];
                *puVar21 = uVar47;
                if (&MACH_HEADER.ncmds < puVar41 + -1) {
                  puVar38 = puVar19 + 3;
                  puVar22 = puVar22 + 5;
                  do {
                    uVar47 = puVar22[-2];
                    puVar38[1] = puVar22[-1];
                    *puVar38 = uVar47;
                    uVar47 = *puVar22;
                    puVar38[3] = puVar22[1];
                    puVar38[2] = uVar47;
                    puVar38 = puVar38 + 4;
                    puVar22 = puVar22 + 4;
                  } while (puVar38 < (undefined8 *)((long)puVar19 + (long)puVar41));
                }
              }
            }
            goto LAB_00153e04;
          }
          uVar47 = *puVar22;
          puVar19[1] = puVar22[1];
          *puVar19 = uVar47;
          if (&MACH_HEADER.ncmds < puVar41) {
            puVar38 = puVar19 + 2;
            do {
              uVar47 = puVar22[2];
              puVar38[1] = puVar22[3];
              *puVar38 = uVar47;
              uVar47 = puVar22[4];
              puVar38[3] = puVar22[5];
              puVar38[2] = uVar47;
              puVar38 = puVar38 + 4;
              puVar22 = puVar22 + 4;
            } while (puVar38 < (undefined8 *)((long)puVar19 + (long)puVar41));
          }
        }
      }
joined_r0x00153ae0:
      if ((undefined *)0xffffffffffffff88 < puVar43) goto LAB_00153e60;
      puVar44 = (undefined8 *)((long)puVar44 + (long)puVar43);
      unaff_w19 = unaff_w19 + 1;
      if (unaff_w19 == (uint)param_7) break;
    } while( true );
  }
  *unaff_x22 = CONCAT44(in_stack_00000110,in_stack_00000108);
  *(undefined4 *)(unaff_x22 + 1) = in_stack_00000118;
  puVar38 = (undefined8 *)uStack0000000000000120;
  param_4 = in_stack_00000098;
  unaff_x25 = in_stack_00000038;
  if (*(int *)((long)unaff_x22 + 0xe64) == 2) {
    uVar26 = (long)in_stack_00000098 - uStack0000000000000120;
    if ((ulong)(in_stack_00000078 - (long)puVar44) < uVar26) goto code_r0x00152014;
    if (puVar44 != (undefined8 *)0x0) {
      _memmove(puVar44,uStack0000000000000120,uVar26);
      puVar44 = (undefined8 *)((long)puVar44 + uVar26);
    }
    puVar38 = (undefined8 *)(&UNK_000076a4 + in_stack_00000038);
    param_4 = (undefined8 *)(&UNK_000176a4 + in_stack_00000038);
  }
  puVar38 = (undefined8 *)((long)param_4 - (long)puVar38);
  if ((undefined8 *)(in_stack_00000078 - (long)puVar44) < puVar38) goto code_r0x00152014;
  if (puVar44 == (undefined8 *)0x0) {
    puVar43 = (undefined *)0x0;
  }
  else {
    param_4 = puVar38;
    _memmove(puVar44);
    puVar43 = (undefined *)((long)puVar44 + (long)puVar38);
  }
  puVar43 = puVar43 + -in_stack_00000020;
  goto LAB_00153e60;
code_r0x00153500:
  in_x9 = (long)puVar19 - uStack0000000000000120;
  if (in_x9 != 0) goto code_r0x00153508;
  goto code_r0x00153944;
code_r0x00153508:
  if ((ulong)(in_stack_00000078 - (long)puVar44) < in_x9) goto code_r0x00152014;
  uVar26 = (long)puVar44 - uStack0000000000000120;
  in_x10 = (undefined8 *)((long)puVar44 + in_x9);
  if ((-8 < (long)uVar26) || (in_x9 < 8)) {
    if ((long)in_x9 < 1) goto LAB_00153934;
    puVar43 = (undefined *)((long)puVar44 + (long)puVar19) + -uStack0000000000000120;
    if (puVar43 <= (undefined *)((long)puVar44 + 1)) {
      puVar43 = (undefined *)((long)puVar44 + 1);
    }
    uVar48 = (long)puVar43 - (long)puVar44;
    if ((7 < uVar48) && (0x3f < uVar26)) {
      if (uVar48 < 0x40) {
        uVar46 = 0;
      }
      else {
        uVar46 = uVar48 & 0xffffffffffffffc0;
        puVar30 = puVar44 + 4;
        puVar38 = (undefined8 *)(uStack0000000000000120 + 0x20);
        uVar26 = uVar46;
        do {
          uVar47 = puVar38[-4];
          uVar50 = puVar38[-1];
          uVar49 = puVar38[-2];
          uVar52 = puVar38[1];
          uVar51 = *puVar38;
          uVar54 = puVar38[3];
          uVar53 = puVar38[2];
          puVar30[-3] = puVar38[-3];
          puVar30[-4] = uVar47;
          puVar30[-1] = uVar50;
          puVar30[-2] = uVar49;
          puVar30[1] = uVar52;
          *puVar30 = uVar51;
          puVar30[3] = uVar54;
          puVar30[2] = uVar53;
          uVar26 = uVar26 - 0x40;
          puVar30 = puVar30 + 8;
          puVar38 = puVar38 + 8;
        } while (uVar26 != 0);
        if (uVar48 == uVar46) goto LAB_00153934;
        if ((uVar48 & 0x38) == 0) {
          uStack0000000000000120 = uStack0000000000000120 + uVar46;
          puVar44 = (undefined8 *)((long)puVar44 + uVar46);
          goto code_r0x00153924;
        }
      }
      uVar26 = uVar48 & 0xfffffffffffffff8;
      lVar39 = uVar46 - uVar26;
      puVar30 = (undefined8 *)(uStack0000000000000120 + uVar46);
      puVar38 = (undefined8 *)((long)puVar44 + uVar46);
      do {
        *puVar38 = *puVar30;
        lVar39 = lVar39 + 8;
        puVar30 = puVar30 + 1;
        puVar38 = puVar38 + 1;
      } while (lVar39 != 0);
      puVar44 = (undefined8 *)((long)puVar44 + uVar26);
      uStack0000000000000120 = (ulong)(uStack0000000000000120 + uVar26);
      if (uVar48 == uVar26) goto LAB_00153934;
    }
code_r0x00153924:
    do {
      puVar30 = (undefined8 *)((long)puVar44 + 1);
      *(undefined1 *)puVar44 = *(undefined1 *)uStack0000000000000120;
      puVar44 = puVar30;
      uStack0000000000000120 = (ulong)(uStack0000000000000120 + 1);
    } while (puVar30 < in_x10);
    goto LAB_00153934;
  }
  if (uVar26 < 0xfffffffffffffff0) {
    in_x12 = in_x10 + -4;
    if (puVar44 <= in_x12) {
      uVar47 = *(undefined8 *)uStack0000000000000120;
      puVar44[1] = *(undefined8 *)(uStack0000000000000120 + 8);
      *puVar44 = uVar47;
      if (0x10 < (ulong)((long)in_x12 - (long)puVar44)) {
        puVar30 = puVar44 + 2;
        puVar38 = (undefined8 *)uStack0000000000000120;
        do {
          uVar47 = puVar38[2];
          puVar30[1] = puVar38[3];
          *puVar30 = uVar47;
          uVar47 = puVar38[4];
          puVar30[3] = puVar38[5];
          puVar30[2] = uVar47;
          puVar30 = puVar30 + 4;
          puVar38 = puVar38 + 4;
        } while (puVar30 < in_x12);
      }
      uStack0000000000000120 = uStack0000000000000120 + ((long)in_x12 - (long)puVar44);
      goto code_r0x001537e0;
    }
  }
  in_x12 = puVar44;
  if ((long)in_x9 < 1) goto LAB_00153934;
code_r0x001537e0:
  in_x13 = (undefined *)((long)puVar44 + (in_x9 - (long)in_x12));
  if ((in_x13 < (undefined *)0x8) || ((long)in_x12 - uStack0000000000000120 < 0x40)) {
    in_x14 = in_x12;
    goto code_r0x00153810;
  }
  if (in_x13 < (undefined *)0x40) {
    puVar33 = (undefined *)0x0;
  }
  else {
    puVar33 = (undefined *)((ulong)in_x13 & 0xffffffffffffffc0);
    puVar44 = in_x12 + 4;
    puVar30 = (undefined8 *)(uStack0000000000000120 + 0x20);
    puVar43 = puVar33;
    do {
      uVar47 = puVar30[-4];
      uVar50 = puVar30[-1];
      uVar49 = puVar30[-2];
      uVar52 = puVar30[1];
      uVar51 = *puVar30;
      uVar54 = puVar30[3];
      uVar53 = puVar30[2];
      puVar44[-3] = puVar30[-3];
      puVar44[-4] = uVar47;
      puVar44[-1] = uVar50;
      puVar44[-2] = uVar49;
      puVar44[1] = uVar52;
      *puVar44 = uVar51;
      puVar44[3] = uVar54;
      puVar44[2] = uVar53;
      puVar43 = puVar43 + -0x40;
      puVar44 = puVar44 + 8;
      puVar30 = puVar30 + 8;
    } while (puVar43 != (undefined *)0x0);
    if (in_x13 == puVar33) goto LAB_00153934;
    if (((ulong)in_x13 & 0x38) == 0) {
      puVar44 = (undefined8 *)(uStack0000000000000120 + (long)puVar33);
      in_x14 = (undefined8 *)((long)in_x12 + (long)puVar33);
      goto LAB_00153904;
    }
  }
  puVar43 = (undefined *)((ulong)in_x13 & 0xfffffffffffffff8);
  in_x14 = (undefined8 *)((long)in_x12 + (long)puVar43);
  puVar44 = (undefined8 *)(uStack0000000000000120 + (long)puVar43);
  lVar39 = (long)puVar33 - (long)puVar43;
  puVar30 = (undefined8 *)((long)in_x12 + (long)puVar33);
  puVar38 = (undefined8 *)(uStack0000000000000120 + (long)puVar33);
  do {
    *puVar30 = *puVar38;
    lVar39 = lVar39 + 8;
    puVar30 = puVar30 + 1;
    puVar38 = puVar38 + 1;
  } while (lVar39 != 0);
  if (in_x13 != puVar43) goto LAB_00153904;
  goto LAB_00153934;
code_r0x00152014:
  puVar43 = (undefined *)0xffffffffffffffba;
LAB_00153e60:
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
    return puVar43;
  }
  auVar55 = ___stack_chk_fail();
  puVar38 = auVar55._8_8_;
  plVar15 = auVar55._0_8_;
  puStack_60 = puVar18;
  puStack_58 = puVar30;
  puStack_50 = puVar44;
  lStack_48 = unaff_x25;
  puStack_40 = puVar43;
  uStack_38 = unaff_x23;
  puStack_30 = unaff_x22;
  puVar20 = (undefined1 *)
            ((long)puVar38 + ((ulong)param_4 & ((long)param_4 >> 0x3f ^ 0xffffffffffffffffU)));
  puStack_88 = (undefined8 *)plVar15[0xeb5];
  puVar44 = (undefined8 *)plVar15[0xed3];
  puVar30 = puVar38;
  if ((int)param_7 == 0) {
    iVar24 = (int)plVar15[0xed4];
    puVar18 = (undefined8 *)plVar15[0xeb5];
    goto joined_r0x00153fc8;
  }
  puVar18 = (undefined8 *)plVar15[0xe99];
  lVar39 = plVar15[0xe9a];
  uVar26 = plVar15[0xe9b];
  *(undefined4 *)((long)plVar15 + 0x7534) = 1;
  uVar48 = *(ulong *)((long)plVar15 + 0x683c);
  auStack_a0[1] = uVar48 >> 0x20;
  auStack_a0[0] = uVar48 & 0xffffffff;
  auStack_a0[2] = (ulong)*(uint *)((long)plVar15 + 0x6844);
  if (param_6 == (undefined8 *)0x0) {
    return (undefined1 *)0xffffffffffffffec;
  }
  puVar1 = param_5 + 1;
  puVar19 = param_6 + -1;
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
    puVar19 = (undefined8 *)0x0;
    iVar24 = (int)LZCOUNT((uint)((byte *)((long)param_6 + (long)param_5))[-1]) + (int)param_6 * -8 +
             0x29;
    puStack_e8 = param_5;
  }
  else {
    puStack_e8 = (ulong *)((long)param_5 + (long)puVar19);
    uStack_f8 = *puStack_e8;
    if (uStack_f8 >> 0x38 == 0) {
      return (undefined1 *)0xffffffffffffffec;
    }
    if ((undefined8 *)0xffffffffffffff88 < param_6) {
      return (undefined1 *)0xffffffffffffffec;
    }
    iVar24 = (int)LZCOUNT((uint)(byte)(uStack_f8 >> 0x38)) + -0x17;
  }
  uVar9 = *(uint *)(*plVar15 + 4);
  uStack_f0 = uVar9 + iVar24;
  uStack_d0 = uStack_f8 >> ((ulong)-uStack_f0 & 0x3f) &
              (ulong)*(uint *)(&UNK_00814304 + (ulong)uVar9 * 4);
  if (uStack_f0 < 0x41) {
    if ((long)puVar19 < 8) {
      puVar25 = param_5;
      if (puVar19 == (undefined8 *)0x0) goto LAB_00154138;
      uVar9 = (uint)puVar19;
      if (param_5 <= (byte *)((long)param_5 + (long)puVar19) + -(ulong)(uStack_f0 >> 3)) {
        uVar9 = uStack_f0 >> 3;
      }
      uStack_f0 = uStack_f0 + uVar9 * -8;
    }
    else {
      uVar9 = uStack_f0 >> 3;
      uStack_f0 = uStack_f0 & 7;
    }
    puStack_e8 = (ulong *)((byte *)((long)param_5 + (long)puVar19) + -(ulong)uVar9);
    uStack_f8 = *puStack_e8;
    puVar25 = puStack_e8;
  }
  else {
    puVar25 = (ulong *)&UNK_00814388;
    puStack_e8 = (ulong *)&UNK_00814388;
  }
LAB_00154138:
  lVar2 = *plVar15 + 8;
  uVar9 = *(uint *)(plVar15[2] + 4);
  uStack_f0 = uVar9 + uStack_f0;
  uStack_c0 = uStack_f8 >> ((ulong)-uStack_f0 & 0x3f) &
              (ulong)*(uint *)(&UNK_00814304 + (ulong)uVar9 * 4);
  iVar24 = (int)param_5;
  if (uStack_f0 < 0x41) {
    if (puVar25 < puVar1) {
      puVar31 = param_5;
      if (puVar25 == param_5) goto LAB_001541c4;
      uVar9 = (int)puVar25 - iVar24;
      if (param_5 <= (ulong *)((long)puVar25 - (ulong)(uStack_f0 >> 3))) {
        uVar9 = uStack_f0 >> 3;
      }
      puVar31 = (ulong *)((long)puVar25 - (ulong)uVar9);
      uStack_f8 = *puVar31;
      uStack_f0 = uStack_f0 + uVar9 * -8;
    }
    else {
      puVar31 = (ulong *)((long)puVar25 - (ulong)(uStack_f0 >> 3));
      uStack_f8 = *puVar31;
      uStack_f0 = uStack_f0 & 7;
    }
    puStack_e8 = puVar31;
  }
  else {
    puVar31 = (ulong *)&UNK_00814388;
    puStack_e8 = (ulong *)&UNK_00814388;
  }
LAB_001541c4:
  puVar19 = (undefined8 *)((long)plVar15 + 0x76a4);
  lVar3 = plVar15[2] + 8;
  uVar9 = *(uint *)(plVar15[1] + 4);
  uStack_f0 = uVar9 + uStack_f0;
  uStack_b0 = uStack_f8 >> ((ulong)-uStack_f0 & 0x3f) &
              (ulong)*(uint *)(&UNK_00814304 + (ulong)uVar9 * 4);
  if (uStack_f0 < 0x41) {
    if (puVar31 < puVar1) {
      if (puVar31 != param_5) {
        uVar9 = (int)puVar31 - iVar24;
        if (param_5 <= (ulong *)((long)puVar31 - (ulong)(uStack_f0 >> 3))) {
          uVar9 = uStack_f0 >> 3;
        }
        puStack_e8 = (ulong *)((long)puVar31 - (ulong)uVar9);
        uStack_f0 = uStack_f0 + uVar9 * -8;
        uStack_f8 = *puStack_e8;
      }
    }
    else {
      puStack_e8 = (ulong *)((long)puVar31 - (ulong)(uStack_f0 >> 3));
      uStack_f0 = uStack_f0 & 7;
      uStack_f8 = *puStack_e8;
    }
  }
  else {
    puStack_e8 = (ulong *)&UNK_00814388;
  }
  lVar4 = plVar15[1] + 8;
LAB_00154284:
  puVar5 = (ushort *)(lVar2 + uStack_d0 * 8);
  puVar6 = (ushort *)(lVar4 + uStack_b0 * 8);
  puVar7 = (ushort *)(lVar3 + uStack_c0 * 8);
  uVar46 = (ulong)*(uint *)(puVar6 + 2);
  uVar48 = (ulong)*(uint *)(puVar5 + 2);
  uVar9 = *(uint *)(puVar7 + 2);
  bVar10 = (byte)puVar5[1];
  bVar11 = (byte)puVar6[1];
  bVar12 = (byte)puVar7[1];
  uVar32 = (uint)bVar12;
  puVar25 = auStack_a0;
  if (bVar12 < 2) {
    bVar14 = *(uint *)(puVar5 + 2) == 0;
    if (bVar12 != 0) {
      if (bVar14) {
        uVar9 = uVar9 + 1;
      }
      uVar17 = (ulong)uStack_f0;
      uStack_f0 = uStack_f0 + 1;
      lVar35 = (ulong)uVar9 - ((long)(uStack_f8 << (uVar17 & 0x3f)) >> 0x3f);
      if (lVar35 == 3) {
        uVar17 = (auStack_a0[0] - 1) - (ulong)(auStack_a0[0] - 1 == 0);
      }
      else {
        uVar17 = auStack_a0[lVar35] - (ulong)(auStack_a0[lVar35] == 0);
        if (lVar35 == 1) goto LAB_00154320;
      }
      goto code_r0x001542f4;
    }
    uVar17 = auStack_a0[bVar14];
    puVar25 = auStack_a0 + !bVar14;
  }
  else {
    uVar17 = (ulong)uStack_f0;
    uStack_f0 = uStack_f0 + uVar32;
    uVar17 = ((uStack_f8 << (uVar17 & 0x3f)) >> ((ulong)-uVar32 & 0x3f)) + (ulong)uVar9;
code_r0x001542f4:
    auStack_a0[2] = auStack_a0[1];
  }
LAB_00154320:
  auStack_a0[0] = uVar17;
  auStack_a0[1] = *puVar25;
  if (bVar11 != 0) {
    uVar16 = (ulong)uStack_f0;
    uStack_f0 = uStack_f0 + bVar11;
    uVar46 = ((uStack_f8 << (uVar16 & 0x3f)) >> ((ulong)-(uint)bVar11 & 0x3f)) + uVar46;
  }
  if (0x1e < ((uint)bVar11 + (uint)bVar10 + uVar32 & 0xff)) {
    if (uStack_f0 < 0x41) {
      if (puStack_e8 < puVar1) {
        if (puStack_e8 == param_5) goto code_r0x00154360;
        uVar9 = (int)puStack_e8 - iVar24;
        if (param_5 <= (ulong *)((long)puStack_e8 - (ulong)(uStack_f0 >> 3))) {
          uVar9 = uStack_f0 >> 3;
        }
        uStack_f0 = uStack_f0 + uVar9 * -8;
      }
      else {
        uVar9 = uStack_f0 >> 3;
        uStack_f0 = uStack_f0 & 7;
      }
      puStack_e8 = (ulong *)((long)puStack_e8 - (ulong)uVar9);
      uStack_f8 = *puStack_e8;
    }
    else {
      puStack_e8 = (ulong *)&UNK_00814388;
    }
  }
code_r0x00154360:
  if (bVar10 != 0) {
    uVar16 = (ulong)uStack_f0;
    uStack_f0 = uStack_f0 + bVar10;
    uVar48 = ((uStack_f8 << (uVar16 & 0x3f)) >> ((ulong)-(uint)bVar10 & 0x3f)) + uVar48;
  }
  iVar45 = (int)param_7;
  iVar42 = iVar45 + -1;
  if (iVar42 != 0) {
    iVar13 = uStack_f0 + *(byte *)((long)puVar5 + 3);
    uStack_d0 = (uStack_f8 >> ((ulong)(uint)-iVar13 & 0x3f) &
                (ulong)*(uint *)(&UNK_00814304 + (ulong)(uint)*(byte *)((long)puVar5 + 3) * 4)) +
                (ulong)*puVar5;
    iVar13 = iVar13 + (uint)*(byte *)((long)puVar6 + 3);
    uStack_b0 = (uStack_f8 >> ((ulong)(uint)-iVar13 & 0x3f) &
                (ulong)*(uint *)(&UNK_00814304 + (ulong)(uint)*(byte *)((long)puVar6 + 3) * 4)) +
                (ulong)*puVar6;
    uStack_f0 = iVar13 + (uint)*(byte *)((long)puVar7 + 3);
    uStack_c0 = (uStack_f8 >> ((ulong)-uStack_f0 & 0x3f) &
                (ulong)*(uint *)(&UNK_00814304 + (ulong)(uint)*(byte *)((long)puVar7 + 3) * 4)) +
                (ulong)*puVar7;
    if (uStack_f0 < 0x41) {
      if (puStack_e8 < puVar1) {
        if (puStack_e8 != param_5) {
          uVar9 = (int)puStack_e8 - iVar24;
          if (param_5 <= (ulong *)((long)puStack_e8 - (ulong)(uStack_f0 >> 3))) {
            uVar9 = uStack_f0 >> 3;
          }
          uStack_f0 = uStack_f0 + uVar9 * -8;
          goto code_r0x00154464;
        }
      }
      else {
        uVar9 = uStack_f0 >> 3;
        uStack_f0 = uStack_f0 & 7;
code_r0x00154464:
        puStack_e8 = (ulong *)((long)puStack_e8 - (ulong)uVar9);
        uStack_f8 = *puStack_e8;
      }
      puVar27 = (undefined1 *)plVar15[0xed3];
      if ((undefined1 *)((long)puStack_88 + uVar48) <= puVar27) goto code_r0x00154484;
    }
    else {
      puStack_e8 = (ulong *)&UNK_00814388;
      puVar27 = (undefined1 *)plVar15[0xed3];
      if ((undefined1 *)((long)puStack_88 + uVar48) <= puVar27) goto code_r0x00154484;
    }
    if (iVar45 < 1) {
      return (undefined1 *)0xffffffffffffffec;
    }
code_r0x001547d8:
    uVar16 = (long)puVar27 - (long)puStack_88;
    if (uVar16 == 0) goto code_r0x00154a08;
    if ((ulong)((long)puVar20 - (long)puVar30) < uVar16) {
      return (undefined1 *)0xffffffffffffffba;
    }
    uVar29 = (long)puVar30 - (long)puStack_88;
    puVar44 = (undefined8 *)((long)puVar30 + uVar16);
    if (((long)uVar29 < -7) && (7 < uVar16)) {
      if (uVar29 < 0xfffffffffffffff0) {
        puVar41 = puVar44 + -4;
        if (puVar30 <= puVar41) {
          uVar47 = *puStack_88;
          puVar30[1] = puStack_88[1];
          *puVar30 = uVar47;
          if (0x10 < (ulong)((long)puVar41 - (long)puVar30)) {
            puVar22 = puVar30 + 2;
            puVar21 = puStack_88;
            do {
              uVar47 = puVar21[2];
              puVar22[1] = puVar21[3];
              *puVar22 = uVar47;
              uVar47 = puVar21[4];
              puVar22[3] = puVar21[5];
              puVar22[2] = uVar47;
              puVar22 = puVar22 + 4;
              puVar21 = puVar21 + 4;
            } while (puVar22 < puVar41);
          }
          puStack_88 = (undefined8 *)((long)puStack_88 + ((long)puVar41 - (long)puVar30));
code_r0x001548ac:
          puVar27 = (undefined1 *)((long)puVar30 + (uVar16 - (long)puVar41));
          if ((puVar27 < (undefined1 *)0x8) || ((ulong)((long)puVar41 - (long)puStack_88) < 0x40)) {
            puVar30 = puVar41;
          }
          else {
            if (puVar27 < (undefined1 *)0x40) {
              puVar34 = (undefined1 *)0x0;
            }
            else {
              puVar34 = (undefined1 *)((ulong)puVar27 & 0xffffffffffffffc0);
              puVar30 = puVar41 + 4;
              puVar22 = puStack_88 + 4;
              puVar37 = puVar34;
              do {
                uVar47 = puVar22[-4];
                uVar50 = puVar22[-1];
                uVar49 = puVar22[-2];
                uVar52 = puVar22[1];
                uVar51 = *puVar22;
                uVar54 = puVar22[3];
                uVar53 = puVar22[2];
                puVar30[-3] = puVar22[-3];
                puVar30[-4] = uVar47;
                puVar30[-1] = uVar50;
                puVar30[-2] = uVar49;
                puVar30[1] = uVar52;
                *puVar30 = uVar51;
                puVar30[3] = uVar54;
                puVar30[2] = uVar53;
                puVar37 = puVar37 + -0x40;
                puVar30 = puVar30 + 8;
                puVar22 = puVar22 + 8;
              } while (puVar37 != (undefined1 *)0x0);
              if (puVar27 == puVar34) goto code_r0x00154a00;
              if (((ulong)puVar27 & 0x38) == 0) {
                puStack_88 = (undefined8 *)((long)puStack_88 + (long)puVar34);
                puVar30 = (undefined8 *)((long)puVar41 + (long)puVar34);
                goto code_r0x001549d0;
              }
            }
            puVar37 = (undefined1 *)((ulong)puVar27 & 0xfffffffffffffff8);
            lVar35 = (long)puVar34 - (long)puVar37;
            puVar30 = (undefined8 *)((long)puVar41 + (long)puVar34);
            puVar22 = (undefined8 *)((long)puStack_88 + (long)puVar34);
            do {
              *puVar30 = *puVar22;
              lVar35 = lVar35 + 8;
              puVar30 = puVar30 + 1;
              puVar22 = puVar22 + 1;
            } while (lVar35 != 0);
            puVar30 = (undefined8 *)((long)puVar41 + (long)puVar37);
            puStack_88 = (undefined8 *)((long)puStack_88 + (long)puVar37);
            if (puVar27 == puVar37) goto code_r0x00154a00;
          }
code_r0x001549d0:
          do {
            puVar22 = (undefined8 *)((long)puVar30 + 1);
            *(undefined1 *)puVar30 = *(undefined1 *)puStack_88;
            puVar30 = puVar22;
            puStack_88 = (undefined8 *)((long)puStack_88 + 1);
          } while (puVar22 != (undefined8 *)((long)puVar41 + (long)puVar27));
          goto code_r0x00154a00;
        }
      }
      puVar41 = puVar30;
      if ((long)uVar16 < 1) goto code_r0x00154a00;
      goto code_r0x001548ac;
    }
    if ((long)uVar16 < 1) goto code_r0x00154a00;
    puVar27 = (undefined1 *)((long)puVar30 + (long)puVar27) + -(long)puStack_88;
    if (puVar27 <= (undefined1 *)((long)puVar30 + 1U)) {
      puVar27 = (undefined1 *)((long)puVar30 + 1);
    }
    uVar28 = (long)puVar27 - (long)puVar30;
    if ((uVar28 < 8) || (uVar29 < 0x40)) goto code_r0x001549f0;
    if (uVar28 < 0x40) {
      uVar29 = 0;
      goto code_r0x00154994;
    }
    uVar29 = uVar28 & 0xffffffffffffffc0;
    puVar41 = puVar30 + 4;
    puVar22 = puStack_88 + 4;
    uVar36 = uVar29;
    do {
      uVar47 = puVar22[-4];
      uVar50 = puVar22[-1];
      uVar49 = puVar22[-2];
      uVar52 = puVar22[1];
      uVar51 = *puVar22;
      uVar54 = puVar22[3];
      uVar53 = puVar22[2];
      puVar41[-3] = puVar22[-3];
      puVar41[-4] = uVar47;
      puVar41[-1] = uVar50;
      puVar41[-2] = uVar49;
      puVar41[1] = uVar52;
      *puVar41 = uVar51;
      puVar41[3] = uVar54;
      puVar41[2] = uVar53;
      uVar36 = uVar36 - 0x40;
      puVar41 = puVar41 + 8;
      puVar22 = puVar22 + 8;
    } while (uVar36 != 0);
    if (uVar28 != uVar29) {
      if ((uVar28 & 0x38) == 0) {
        puStack_88 = (undefined8 *)((long)puStack_88 + uVar29);
        puVar30 = (undefined8 *)((long)puVar30 + uVar29);
      }
      else {
code_r0x00154994:
        uVar36 = uVar28 & 0xfffffffffffffff8;
        lVar35 = uVar29 - uVar36;
        puVar41 = (undefined8 *)((long)puStack_88 + uVar29);
        puVar22 = (undefined8 *)((long)puVar30 + uVar29);
        do {
          *puVar22 = *puVar41;
          lVar35 = lVar35 + 8;
          puVar41 = puVar41 + 1;
          puVar22 = puVar22 + 1;
        } while (lVar35 != 0);
        puVar30 = (undefined8 *)((long)puVar30 + uVar36);
        puStack_88 = (undefined8 *)((long)puStack_88 + uVar36);
        if (uVar28 == uVar36) goto code_r0x00154a00;
      }
code_r0x001549f0:
      do {
        puVar41 = (undefined8 *)((long)puVar30 + 1);
        *(undefined1 *)puVar30 = *(undefined1 *)puStack_88;
        puVar30 = puVar41;
        puStack_88 = (undefined8 *)((long)puStack_88 + 1);
      } while (puVar41 < puVar44);
    }
code_r0x00154a00:
    uVar48 = uVar48 - uVar16;
    puVar30 = puVar44;
code_r0x00154a08:
    puVar44 = (undefined8 *)((long)plVar15 + 0x176a4);
    *(undefined4 *)(plVar15 + 0xed4) = 0;
    puVar41 = (undefined8 *)((long)puVar30 + uVar48);
    puVar22 = (undefined8 *)((long)puVar41 - uVar17);
    Hint_Prefetch(puVar22,0,0,0);
    if ((puVar44 < (undefined8 *)((long)puVar19 + uVar48)) ||
       (puVar27 = (undefined1 *)(uVar48 + uVar46),
       puVar20 + -0x20 < (undefined1 *)((long)puVar30 + (long)puVar27))) {
      puStack_88 = puVar19;
      uStack_80 = uVar48;
      uStack_78 = uVar46;
      uStack_70 = uVar17;
      puVar27 = (undefined1 *)
                func_0x00155c78(puVar30,puVar20,&uStack_80,&puStack_88,puVar44,puVar18,lVar39,uVar26
                               );
    }
    else {
      uVar47 = *puVar19;
      puVar30[1] = *(undefined8 *)((long)plVar15 + 0x76ac);
      *puVar30 = uVar47;
      if (0x10 < uVar48) {
        uVar47 = *(undefined8 *)((long)plVar15 + 0x76b4);
        puVar30[3] = *(undefined8 *)((long)plVar15 + 0x76bc);
        puVar30[2] = uVar47;
        if (0x10 < uVar48 - 0x10) {
          puVar21 = puVar30 + 4;
          puVar23 = (undefined8 *)((long)plVar15 + 0x76d4);
          do {
            uVar47 = puVar23[-2];
            puVar21[1] = puVar23[-1];
            *puVar21 = uVar47;
            uVar47 = *puVar23;
            puVar21[3] = puVar23[1];
            puVar21[2] = uVar47;
            puVar21 = puVar21 + 4;
            puVar23 = puVar23 + 4;
          } while (puVar21 < puVar41);
        }
      }
      puStack_88 = (undefined8 *)((long)puVar19 + uVar48);
      if ((ulong)((long)puVar41 - (long)puVar18) < uVar17) {
        if ((ulong)((long)puVar41 - lVar39) < uVar17) {
          return (undefined1 *)0xffffffffffffffec;
        }
        lVar40 = (long)puVar22 - (long)puVar18;
        lVar35 = uVar26 + lVar40;
        if (lVar35 + uVar46 <= uVar26) {
          _memmove(puVar41,lVar35,uVar46);
          goto joined_r0x00154b24;
        }
        _memmove(puVar41,lVar35,-lVar40);
        puVar41 = (undefined8 *)((long)puVar41 - lVar40);
        uVar46 = lVar40 + uVar46;
        puVar22 = puVar18;
      }
      if (uVar17 < 0x10) {
        if (uVar17 < 8) {
          iVar13 = *(int *)(&UNK_008143b0 + uVar17 * 4);
          *(undefined1 *)puVar41 = *(undefined1 *)puVar22;
          *(undefined1 *)((long)puVar41 + 1) = *(undefined1 *)((long)puVar22 + 1);
          *(undefined1 *)((long)puVar41 + 2) = *(undefined1 *)((long)puVar22 + 2);
          *(undefined1 *)((long)puVar41 + 3) = *(undefined1 *)((long)puVar22 + 3);
          puVar8 = (undefined4 *)((long)puVar22 + (ulong)*(uint *)(&UNK_00814390 + uVar17 * 4));
          puVar22 = (undefined8 *)((long)puVar8 - (long)iVar13);
          *(undefined4 *)((long)puVar41 + 4) = *puVar8;
        }
        else {
          *puVar41 = *puVar22;
        }
        if (8 < uVar46) {
          puVar19 = puVar22 + 1;
          puVar21 = puVar41 + 1;
          if ((long)puVar21 - (long)puVar19 < 0x10) {
            do {
              puVar22 = puVar21 + 1;
              *puVar21 = *puVar19;
              puVar19 = puVar19 + 1;
              puVar21 = puVar22;
            } while (puVar22 < (undefined8 *)((long)puVar41 + uVar46));
          }
          else {
            uVar47 = *puVar19;
            puVar41[2] = puVar22[2];
            *puVar21 = uVar47;
            if (0x10 < uVar46 - 8) {
              puVar19 = puVar41 + 3;
              puVar22 = puVar22 + 5;
              do {
                uVar47 = puVar22[-2];
                puVar19[1] = puVar22[-1];
                *puVar19 = uVar47;
                uVar47 = *puVar22;
                puVar19[3] = puVar22[1];
                puVar19[2] = uVar47;
                puVar19 = puVar19 + 4;
                puVar22 = puVar22 + 4;
              } while (puVar19 < (undefined8 *)((long)puVar41 + uVar46));
            }
          }
        }
      }
      else {
        uVar47 = *puVar22;
        puVar41[1] = puVar22[1];
        *puVar41 = uVar47;
        if (0x10 < uVar46) {
          puVar19 = puVar41 + 2;
          do {
            uVar47 = puVar22[2];
            puVar19[1] = puVar22[3];
            *puVar19 = uVar47;
            uVar47 = puVar22[4];
            puVar19[3] = puVar22[5];
            puVar19[2] = uVar47;
            puVar19 = puVar19 + 4;
            puVar22 = puVar22 + 4;
          } while (puVar19 < (undefined8 *)((long)puVar41 + uVar46));
        }
      }
    }
joined_r0x00154b24:
    if ((undefined1 *)0xffffffffffffff88 < puVar27) {
      return puVar27;
    }
    puVar30 = (undefined8 *)((long)puVar30 + (long)puVar27);
    if (iVar45 < 2) {
      if (iVar42 != 0) {
        return (undefined1 *)0xffffffffffffffec;
      }
      goto code_r0x00155070;
    }
    do {
      puVar5 = (ushort *)(lVar2 + uStack_d0 * 8);
      puVar6 = (ushort *)(lVar4 + uStack_b0 * 8);
      puVar7 = (ushort *)(lVar3 + uStack_c0 * 8);
      uVar46 = (ulong)*(uint *)(puVar6 + 2);
      uVar48 = (ulong)*(uint *)(puVar5 + 2);
      uVar9 = *(uint *)(puVar7 + 2);
      bVar10 = (byte)puVar5[1];
      bVar11 = (byte)puVar6[1];
      bVar12 = (byte)puVar7[1];
      uVar32 = (uint)bVar12;
      puVar25 = auStack_a0;
      if (bVar12 < 2) {
        bVar14 = *(uint *)(puVar5 + 2) == 0;
        if (bVar12 != 0) {
          if (bVar14) {
            uVar9 = uVar9 + 1;
          }
          uVar17 = (ulong)uStack_f0;
          uStack_f0 = uStack_f0 + 1;
          lVar35 = (ulong)uVar9 - ((long)(uStack_f8 << (uVar17 & 0x3f)) >> 0x3f);
          if (lVar35 == 3) {
            uVar17 = (auStack_a0[0] - 1) - (ulong)(auStack_a0[0] - 1 == 0);
          }
          else {
            uVar17 = auStack_a0[lVar35] - (ulong)(auStack_a0[lVar35] == 0);
            if (lVar35 == 1) goto LAB_00154bdc;
          }
          goto code_r0x00154bb0;
        }
        uVar17 = auStack_a0[bVar14];
        puVar25 = auStack_a0 + !bVar14;
      }
      else {
        uVar17 = (ulong)uStack_f0;
        uStack_f0 = uStack_f0 + uVar32;
        uVar17 = ((uStack_f8 << (uVar17 & 0x3f)) >> ((ulong)-uVar32 & 0x3f)) + (ulong)uVar9;
code_r0x00154bb0:
        auStack_a0[2] = auStack_a0[1];
      }
LAB_00154bdc:
      auStack_a0[0] = uVar17;
      auStack_a0[1] = *puVar25;
      if (bVar11 != 0) {
        uVar16 = (ulong)uStack_f0;
        uStack_f0 = uStack_f0 + bVar11;
        uVar46 = ((uStack_f8 << (uVar16 & 0x3f)) >> ((ulong)-(uint)bVar11 & 0x3f)) + uVar46;
      }
      if (0x1e < ((uint)bVar11 + (uint)bVar10 + uVar32 & 0xff)) {
        if (uStack_f0 < 0x41) {
          if (puStack_e8 < puVar1) {
            if (puStack_e8 != param_5) {
              uVar9 = (int)puStack_e8 - iVar24;
              if (param_5 <= (ulong *)((long)puStack_e8 - (ulong)(uStack_f0 >> 3))) {
                uVar9 = uStack_f0 >> 3;
              }
              puStack_e8 = (ulong *)((long)puStack_e8 - (ulong)uVar9);
              uStack_f0 = uStack_f0 + uVar9 * -8;
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
      if (bVar10 != 0) {
        uVar16 = (ulong)uStack_f0;
        uStack_f0 = uStack_f0 + bVar10;
        uVar48 = ((uStack_f8 << (uVar16 & 0x3f)) >> ((ulong)-(uint)bVar10 & 0x3f)) + uVar48;
      }
      if (iVar42 != 1) {
        iVar45 = uStack_f0 + *(byte *)((long)puVar5 + 3);
        uStack_d0 = (uStack_f8 >> ((ulong)(uint)-iVar45 & 0x3f) &
                    (ulong)*(uint *)(&UNK_00814304 + (ulong)(uint)*(byte *)((long)puVar5 + 3) * 4))
                    + (ulong)*puVar5;
        iVar45 = iVar45 + (uint)*(byte *)((long)puVar6 + 3);
        uStack_b0 = (uStack_f8 >> ((ulong)(uint)-iVar45 & 0x3f) &
                    (ulong)*(uint *)(&UNK_00814304 + (ulong)(uint)*(byte *)((long)puVar6 + 3) * 4))
                    + (ulong)*puVar6;
        uStack_f0 = iVar45 + (uint)*(byte *)((long)puVar7 + 3);
        uStack_c0 = (uStack_f8 >> ((ulong)-uStack_f0 & 0x3f) &
                    (ulong)*(uint *)(&UNK_00814304 + (ulong)(uint)*(byte *)((long)puVar7 + 3) * 4))
                    + (ulong)*puVar7;
        if (uStack_f0 < 0x41) {
          if (puStack_e8 < puVar1) {
            if (puStack_e8 == param_5) goto LAB_00154d14;
            uVar9 = (int)puStack_e8 - iVar24;
            if (param_5 <= (ulong *)((long)puStack_e8 - (ulong)(uStack_f0 >> 3))) {
              uVar9 = uStack_f0 >> 3;
            }
            uStack_f0 = uStack_f0 + uVar9 * -8;
          }
          else {
            uVar9 = uStack_f0 >> 3;
            uStack_f0 = uStack_f0 & 7;
          }
          puStack_e8 = (ulong *)((long)puStack_e8 - (ulong)uVar9);
          uStack_f8 = *puStack_e8;
        }
        else {
          puStack_e8 = (ulong *)&UNK_00814388;
        }
      }
LAB_00154d14:
      puVar19 = (undefined8 *)((long)puVar30 + uVar48);
      puVar41 = (undefined8 *)((long)puVar19 - uVar17);
      Hint_Prefetch(puVar41,0,0,0);
      if ((puVar44 < (undefined8 *)((long)puStack_88 + uVar48)) ||
         (puVar27 = (undefined1 *)(uVar48 + uVar46),
         puVar20 + -0x20 < (undefined1 *)((long)puVar30 + (long)puVar27))) {
        uStack_80 = uVar48;
        uStack_78 = uVar46;
        uStack_70 = uVar17;
        puVar27 = (undefined1 *)
                  func_0x00155c78(puVar30,puVar20,&uStack_80,&puStack_88,puVar44,puVar18,lVar39,
                                  uVar26);
      }
      else {
        uVar47 = *puStack_88;
        puVar30[1] = puStack_88[1];
        *puVar30 = uVar47;
        if (0x10 < uVar48) {
          uVar47 = puStack_88[2];
          puVar30[3] = puStack_88[3];
          puVar30[2] = uVar47;
          if (0x10 < uVar48 - 0x10) {
            puVar22 = puVar30 + 4;
            puVar21 = puStack_88 + 6;
            do {
              uVar47 = puVar21[-2];
              puVar22[1] = puVar21[-1];
              *puVar22 = uVar47;
              uVar47 = *puVar21;
              puVar22[3] = puVar21[1];
              puVar22[2] = uVar47;
              puVar22 = puVar22 + 4;
              puVar21 = puVar21 + 4;
            } while (puVar22 < puVar19);
          }
        }
        puStack_88 = (undefined8 *)((long)puStack_88 + uVar48);
        if ((ulong)((long)puVar19 - (long)puVar18) < uVar17) {
          if ((ulong)((long)puVar19 - lVar39) < uVar17) {
            return (undefined1 *)0xffffffffffffffec;
          }
          lVar40 = (long)puVar41 - (long)puVar18;
          lVar35 = uVar26 + lVar40;
          if (lVar35 + uVar46 <= uVar26) {
            _memmove(puVar19,lVar35,uVar46);
            goto joined_r0x00154e58;
          }
          _memmove(puVar19,lVar35,-lVar40);
          puVar19 = (undefined8 *)((long)puVar19 - lVar40);
          uVar46 = lVar40 + uVar46;
          puVar41 = puVar18;
        }
        if (uVar17 < 0x10) {
          if (uVar17 < 8) {
            iVar45 = *(int *)(&UNK_008143b0 + uVar17 * 4);
            *(undefined1 *)puVar19 = *(undefined1 *)puVar41;
            *(undefined1 *)((long)puVar19 + 1) = *(undefined1 *)((long)puVar41 + 1);
            *(undefined1 *)((long)puVar19 + 2) = *(undefined1 *)((long)puVar41 + 2);
            *(undefined1 *)((long)puVar19 + 3) = *(undefined1 *)((long)puVar41 + 3);
            puVar8 = (undefined4 *)((long)puVar41 + (ulong)*(uint *)(&UNK_00814390 + uVar17 * 4));
            puVar41 = (undefined8 *)((long)puVar8 - (long)iVar45);
            *(undefined4 *)((long)puVar19 + 4) = *puVar8;
          }
          else {
            *puVar19 = *puVar41;
          }
          if (8 < uVar46) {
            puVar22 = puVar41 + 1;
            puVar21 = puVar19 + 1;
            if ((long)puVar21 - (long)puVar22 < 0x10) {
              do {
                puVar41 = puVar21 + 1;
                *puVar21 = *puVar22;
                puVar22 = puVar22 + 1;
                puVar21 = puVar41;
              } while (puVar41 < (undefined8 *)((long)puVar19 + uVar46));
            }
            else {
              uVar47 = *puVar22;
              puVar19[2] = puVar41[2];
              *puVar21 = uVar47;
              if (0x10 < uVar46 - 8) {
                puVar22 = puVar19 + 3;
                puVar41 = puVar41 + 5;
                do {
                  uVar47 = puVar41[-2];
                  puVar22[1] = puVar41[-1];
                  *puVar22 = uVar47;
                  uVar47 = *puVar41;
                  puVar22[3] = puVar41[1];
                  puVar22[2] = uVar47;
                  puVar22 = puVar22 + 4;
                  puVar41 = puVar41 + 4;
                } while (puVar22 < (undefined8 *)((long)puVar19 + uVar46));
              }
            }
          }
        }
        else {
          uVar47 = *puVar41;
          puVar19[1] = puVar41[1];
          *puVar19 = uVar47;
          if (0x10 < uVar46) {
            puVar22 = puVar19 + 2;
            do {
              uVar47 = puVar41[2];
              puVar22[1] = puVar41[3];
              *puVar22 = uVar47;
              uVar47 = puVar41[4];
              puVar22[3] = puVar41[5];
              puVar22[2] = uVar47;
              puVar22 = puVar22 + 4;
              puVar41 = puVar41 + 4;
            } while (puVar22 < (undefined8 *)((long)puVar19 + uVar46));
          }
        }
      }
joined_r0x00154e58:
      if ((undefined1 *)0xffffffffffffff88 < puVar27) {
        return puVar27;
      }
      puVar30 = (undefined8 *)((long)puVar30 + (long)puVar27);
      iVar42 = iVar42 + -1;
    } while (iVar42 != 0);
code_r0x00155070:
    if (puStack_e8 != param_5) {
      return (undefined1 *)0xffffffffffffffec;
    }
    if (uStack_f0 != 0x40) {
      return (undefined1 *)0xffffffffffffffec;
    }
    *(ulong *)((long)plVar15 + 0x683c) = CONCAT44((int)auStack_a0[1],(int)auStack_a0[0]);
    *(int *)((long)plVar15 + 0x6844) = (int)auStack_a0[2];
    iVar24 = (int)plVar15[0xed4];
    puVar18 = puStack_88;
joined_r0x00153fc8:
    puStack_88 = puVar18;
    if (iVar24 == 2) {
      uVar26 = (long)puVar44 - (long)puVar18;
      if ((ulong)((long)puVar20 - (long)puVar30) < uVar26) {
        return (undefined1 *)0xffffffffffffffba;
      }
      if (puVar30 != (undefined8 *)0x0) {
        _memmove(puVar30,puVar18,uVar26);
        puVar30 = (undefined8 *)((long)puVar30 + uVar26);
      }
      puVar18 = (undefined8 *)((long)plVar15 + 0x76a4);
      puVar44 = (undefined8 *)((long)plVar15 + 0x176a4);
      *(undefined4 *)(plVar15 + 0xed4) = 0;
    }
    uVar26 = (long)puVar44 - (long)puVar18;
    if ((ulong)((long)puVar20 - (long)puVar30) < uVar26) {
      return (undefined1 *)0xffffffffffffffba;
    }
    if (puVar30 == (undefined8 *)0x0) {
      puVar20 = (undefined1 *)0x0;
    }
    else {
      _memcpy(puVar30,puVar18,uVar26);
      puVar20 = (undefined1 *)((long)puVar30 + uVar26);
    }
    return puVar20 + -(long)puVar38;
  }
  puVar27 = (undefined1 *)plVar15[0xed3];
  if (puVar27 < (undefined1 *)((long)puStack_88 + uVar48)) goto code_r0x001547d8;
code_r0x00154484:
  puVar41 = (undefined8 *)((long)puStack_88 + uVar48);
  if ((puVar44 < puVar41) ||
     (puVar27 = (undefined1 *)(uVar48 + uVar46),
     puVar41 + -4 < (undefined8 *)((long)puVar30 + (long)puVar27))) {
    uStack_80 = uVar48;
    uStack_78 = uVar46;
    uStack_70 = uVar17;
    puVar27 = (undefined1 *)
              func_0x00156308(puVar30,puVar20,puVar41 + -4,&uStack_80,&puStack_88,puVar44,puVar18,
                              lVar39,uVar26);
  }
  else {
    puVar22 = (undefined8 *)((long)puVar30 + uVar48);
    uVar47 = *puStack_88;
    puVar30[1] = puStack_88[1];
    *puVar30 = uVar47;
    if (0x10 < uVar48) {
      uVar47 = puStack_88[2];
      puVar30[3] = puStack_88[3];
      puVar30[2] = uVar47;
      if (0x10 < uVar48 - 0x10) {
        puVar21 = puVar30 + 4;
        puVar23 = puStack_88 + 6;
        do {
          uVar47 = puVar23[-2];
          puVar21[1] = puVar23[-1];
          *puVar21 = uVar47;
          uVar47 = *puVar23;
          puVar21[3] = puVar23[1];
          puVar21[2] = uVar47;
          puVar21 = puVar21 + 4;
          puVar23 = puVar23 + 4;
        } while (puVar21 < puVar22);
      }
    }
    puStack_88 = puVar41;
    puVar41 = (undefined8 *)((long)puVar22 - uVar17);
    if ((ulong)((long)puVar22 - (long)puVar18) < uVar17) {
      if ((ulong)((long)puVar22 - lVar39) < uVar17) {
        return (undefined1 *)0xffffffffffffffec;
      }
      lVar40 = (long)((long)puVar22 - uVar17) - (long)puVar18;
      lVar35 = uVar26 + lVar40;
      if (lVar35 + uVar46 <= uVar26) {
        _memmove(puVar22,lVar35,uVar46);
        goto LAB_00154570;
      }
      _memmove(puVar22,lVar35,-lVar40);
      puVar22 = (undefined8 *)((long)puVar22 - lVar40);
      uVar46 = lVar40 + uVar46;
      puVar41 = puVar18;
    }
    if (uVar17 < 0x10) {
      if (uVar17 < 8) {
        iVar42 = *(int *)(&UNK_008143b0 + uVar17 * 4);
        *(undefined1 *)puVar22 = *(undefined1 *)puVar41;
        *(undefined1 *)((long)puVar22 + 1) = *(undefined1 *)((long)puVar41 + 1);
        *(undefined1 *)((long)puVar22 + 2) = *(undefined1 *)((long)puVar41 + 2);
        *(undefined1 *)((long)puVar22 + 3) = *(undefined1 *)((long)puVar41 + 3);
        puVar8 = (undefined4 *)((long)puVar41 + (ulong)*(uint *)(&UNK_00814390 + uVar17 * 4));
        puVar41 = (undefined8 *)((long)puVar8 - (long)iVar42);
        *(undefined4 *)((long)puVar22 + 4) = *puVar8;
      }
      else {
        *puVar22 = *puVar41;
      }
      if (8 < uVar46) {
        puVar21 = puVar41 + 1;
        puVar23 = puVar22 + 1;
        if ((long)puVar23 - (long)puVar21 < 0x10) {
          do {
            puVar41 = puVar23 + 1;
            *puVar23 = *puVar21;
            puVar21 = puVar21 + 1;
            puVar23 = puVar41;
          } while (puVar41 < (undefined8 *)((long)puVar22 + uVar46));
        }
        else {
          uVar47 = *puVar21;
          puVar22[2] = puVar41[2];
          *puVar23 = uVar47;
          if (0x10 < uVar46 - 8) {
            puVar21 = puVar22 + 3;
            puVar41 = puVar41 + 5;
            do {
              uVar47 = puVar41[-2];
              puVar21[1] = puVar41[-1];
              *puVar21 = uVar47;
              uVar47 = *puVar41;
              puVar21[3] = puVar41[1];
              puVar21[2] = uVar47;
              puVar21 = puVar21 + 4;
              puVar41 = puVar41 + 4;
            } while (puVar21 < (undefined8 *)((long)puVar22 + uVar46));
          }
        }
      }
    }
    else {
      uVar47 = *puVar41;
      puVar22[1] = puVar41[1];
      *puVar22 = uVar47;
      if (0x10 < uVar46) {
        puVar21 = puVar22 + 2;
        do {
          uVar47 = puVar41[2];
          puVar21[1] = puVar41[3];
          *puVar21 = uVar47;
          uVar47 = puVar41[4];
          puVar21[3] = puVar41[5];
          puVar21[2] = uVar47;
          puVar21 = puVar21 + 4;
          puVar41 = puVar41 + 4;
        } while (puVar21 < (undefined8 *)((long)puVar22 + uVar46));
      }
    }
  }
LAB_00154570:
  if ((undefined1 *)0xffffffffffffff88 < puVar27) {
    return puVar27;
  }
  puVar30 = (undefined8 *)((long)puVar30 + (long)puVar27);
  param_7 = (ulong)(iVar45 - 1U);
  if (iVar45 - 1U == 0) goto code_r0x00155070;
  goto LAB_00154284;
}

