
/* WARNING: Type propagation algorithm not settling */

byte * FUN_00152c24(undefined8 param_1,byte *param_2,undefined8 param_3,ulong *param_4)

{
  uint uVar1;
  long lVar2;
  long lVar3;
  ushort *puVar4;
  ushort *puVar5;
  ushort *puVar6;
  byte bVar7;
  byte bVar8;
  byte bVar9;
  int iVar10;
  bool bVar11;
  byte *pbVar12;
  long *plVar13;
  byte *pbVar14;
  byte *pbVar15;
  ulong uVar16;
  ulong uVar17;
  ulong *puVar18;
  ulong *puVar19;
  ulong *puVar20;
  long lVar21;
  byte *pbVar22;
  ulong *puVar23;
  ulong *puVar24;
  int iVar25;
  ulong *puVar26;
  undefined8 *puVar27;
  ulong uVar28;
  byte *pbVar29;
  ulong uVar30;
  ulong *puVar31;
  byte *pbVar32;
  ulong uVar33;
  ulong *puVar34;
  uint uVar35;
  uint uVar36;
  byte *pbVar37;
  long lVar38;
  byte *pbVar39;
  long lVar40;
  ulong uVar41;
  byte *pbVar42;
  byte *pbVar43;
  byte *unaff_x19;
  ulong *unaff_x20;
  ulong *unaff_x21;
  ulong *unaff_x22;
  long lVar44;
  ulong *unaff_x23;
  byte *pbVar45;
  int iVar46;
  byte *unaff_x24;
  long unaff_x25;
  undefined1 *puVar47;
  ulong *unaff_x26;
  int iVar48;
  ulong *unaff_x27;
  ulong *unaff_x28;
  ulong uVar49;
  long unaff_x29;
  ulong uVar50;
  undefined8 uVar51;
  undefined8 uVar52;
  undefined8 uVar53;
  undefined8 uVar54;
  ulong uVar55;
  undefined8 uVar56;
  ulong uVar57;
  undefined8 uVar58;
  ulong uVar59;
  undefined8 uVar60;
  undefined1 auVar61 [16];
  ulong *in_stack_00000010;
  undefined8 in_stack_00000018;
  byte *in_stack_00000020;
  ulong in_stack_00000028;
  ulong *in_stack_00000030;
  undefined1 *in_stack_00000038;
  long in_stack_00000040;
  byte *in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 *in_stack_00000058;
  ulong *in_stack_00000060;
  ulong *in_stack_00000068;
  long in_stack_00000070;
  long in_stack_00000078;
  ulong *puStack0000000000000080;
  byte *in_stack_00000088;
  ulong *in_stack_00000090;
  ulong *in_stack_00000098;
  ulong *in_stack_000000a0;
  ulong *in_stack_000000a8;
  ulong in_stack_000000b0;
  uint in_stack_000000b8;
  ulong *in_stack_000000c0;
  ulong *in_stack_000000c8;
  ulong *in_stack_000000d0;
  long in_stack_000000d8;
  long in_stack_000000e0;
  long in_stack_000000e8;
  long in_stack_000000f0;
  long in_stack_000000f8;
  long in_stack_00000100;
  undefined8 uStack0000000000000108;
  undefined8 in_stack_00000110;
  undefined8 in_stack_00000118;
  ulong uStack0000000000000120;
  ulong uStack0000000000000128;
  ulong *in_stack_00000130;
  ulong *in_stack_00000138;
  undefined1 uStack0000000000000140;
  undefined1 uStack0000000000000148;
  undefined1 uStack0000000000000150;
  ulong uStack_f8;
  uint uStack_f0;
  ulong *puStack_e8;
  ulong uStack_d0;
  ulong uStack_c0;
  ulong uStack_b0;
  ulong auStack_a0 [3];
  byte *pbStack_88;
  ulong uStack_80;
  ulong uStack_78;
  ulong uStack_70;
  ulong *puStack_60;
  ulong *puStack_58;
  ulong *puStack_50;
  undefined1 *puStack_48;
  byte *pbStack_40;
  undefined8 uStack_38;
  ulong *puStack_30;
  byte *pbStack_28;
  ulong *puStack_20;
  byte *pbStack_18;
  
code_r0x00152c24:
  _memmove(unaff_x27,param_2,-unaff_x25);
  unaff_x27 = (ulong *)((long)unaff_x27 - unaff_x25);
  unaff_x20 = (ulong *)(unaff_x25 + (long)unaff_x20);
code_r0x00152c5c:
  if (unaff_x22 < &MACH_HEADER.ncmds) {
    if ((ulong *)((long)&MACH_HEADER.cputype + 3) < unaff_x22) {
      *unaff_x27 = *unaff_x23;
    }
    else {
      iVar25 = *(int *)(&UNK_008143b0 + (long)unaff_x22 * 4);
      *(byte *)unaff_x27 = (byte)*unaff_x23;
      *(byte *)((long)unaff_x27 + 1) = *(byte *)((long)unaff_x23 + 1);
      *(byte *)((long)unaff_x27 + 2) = *(byte *)((long)unaff_x23 + 2);
      *(byte *)((long)unaff_x27 + 3) = *(byte *)((long)unaff_x23 + 3);
      pbVar32 = (byte *)((long)unaff_x23 + (ulong)*(uint *)(&UNK_00814390 + (long)unaff_x22 * 4));
      unaff_x23 = (ulong *)(pbVar32 + -(long)iVar25);
      *(undefined4 *)((long)unaff_x27 + 4) = *(undefined4 *)pbVar32;
    }
    if (&MACH_HEADER.cpusubtype < unaff_x20) {
      puVar23 = unaff_x23 + 1;
      puVar19 = unaff_x27 + 1;
      if ((long)puVar19 - (long)puVar23 < 0x10) {
        do {
          puVar34 = puVar19 + 1;
          *puVar19 = *puVar23;
          puVar23 = puVar23 + 1;
          puVar19 = puVar34;
        } while (puVar34 < (ulong *)((long)unaff_x27 + (long)unaff_x20));
      }
      else {
        uVar28 = *puVar23;
        unaff_x27[2] = unaff_x23[2];
        *puVar19 = uVar28;
        if (&MACH_HEADER.ncmds < unaff_x20 + -1) {
          puVar23 = unaff_x27 + 3;
          puVar19 = unaff_x23 + 5;
          do {
            uVar28 = puVar19[-2];
            puVar23[1] = puVar19[-1];
            *puVar23 = uVar28;
            uVar28 = *puVar19;
            puVar23[3] = puVar19[1];
            puVar23[2] = uVar28;
            puVar23 = puVar23 + 4;
            puVar19 = puVar19 + 4;
          } while (puVar23 < (ulong *)((long)unaff_x27 + (long)unaff_x20));
        }
      }
    }
  }
  else {
    uVar28 = *unaff_x23;
    unaff_x27[1] = unaff_x23[1];
    *unaff_x27 = uVar28;
    if (&MACH_HEADER.ncmds < unaff_x20) {
      puVar23 = unaff_x27 + 2;
      do {
        uVar28 = unaff_x23[2];
        puVar23[1] = unaff_x23[3];
        *puVar23 = uVar28;
        uVar28 = unaff_x23[4];
        puVar23[3] = unaff_x23[5];
        puVar23[2] = uVar28;
        puVar23 = puVar23 + 4;
        unaff_x23 = unaff_x23 + 4;
      } while (puVar23 < (ulong *)((long)unaff_x27 + (long)unaff_x20));
    }
    else {
    }
  }
LAB_00152cdc:
  puVar19 = (ulong *)(ulong)in_stack_00000050._4_4_;
  puVar47 = in_stack_00000038;
  puVar23 = unaff_x26;
  if (unaff_x24 < (byte *)0xffffffffffffff89) {
    puVar19 = (ulong *)((long)in_stack_00000098 + (long)unaff_x19);
    puVar23 = in_stack_000000a8;
    if (in_stack_00000090 <= puVar19) {
      puVar23 = in_stack_000000a0;
    }
    lVar21 = (long)((long)puVar23 + (long)puVar19) - (long)in_stack_00000090;
    Hint_Prefetch(lVar21,0,0,0);
    Hint_Prefetch(lVar21 + 0x40,0,0,0);
    *unaff_x28 = (ulong)in_stack_00000098;
    unaff_x28[1] = in_stack_00000028;
    unaff_x28[2] = (ulong)in_stack_00000090;
    puVar23 = (ulong *)((long)unaff_x26 + (long)unaff_x24);
    puStack0000000000000080 = in_stack_00000030;
    unaff_x19 = (byte *)((long)puVar19 + in_stack_00000028);
    uVar1 = (int)unaff_x21 + 1;
    puVar34 = in_stack_00000068;
    if (uVar1 != in_stack_00000050._4_4_) {
      do {
        puVar19 = (ulong *)(ulong)in_stack_00000050._4_4_;
        unaff_x21 = (ulong *)(ulong)uVar1;
        puVar4 = (ushort *)(in_stack_000000e0 + in_stack_000000d8 * 8);
        puVar5 = (ushort *)(in_stack_00000100 + in_stack_000000f8 * 8);
        puVar6 = (ushort *)(in_stack_000000f0 + in_stack_000000e8 * 8);
        in_stack_00000028 = (ulong)*(uint *)(puVar5 + 2);
        in_stack_00000098 = (ulong *)(ulong)*(uint *)(puVar4 + 2);
        uVar36 = *(uint *)(puVar6 + 2);
        bVar7 = (byte)puVar4[1];
        bVar8 = (byte)puVar5[1];
        bVar9 = (byte)puVar6[1];
        uVar35 = (uint)bVar9;
        puVar27 = in_stack_00000058;
        if (bVar9 < 2) {
          bVar11 = *(uint *)(puVar4 + 2) == 0;
          if (bVar9 != 0) {
            if (bVar11) {
              uVar36 = uVar36 + 1;
            }
            uVar28 = (ulong)in_stack_000000b8;
            in_stack_000000b8 = in_stack_000000b8 + 1;
            lVar21 = (ulong)uVar36 - ((long)(in_stack_000000b0 << (uVar28 & 0x3f)) >> 0x3f);
            if (lVar21 == 3) {
              in_stack_00000090 =
                   (ulong *)((byte *)((long)uStack0000000000000108 + -1) +
                            -(ulong)((byte *)((long)uStack0000000000000108 + -1) == (byte *)0x0));
            }
            else {
              in_stack_00000090 =
                   (ulong *)((&uStack0000000000000108)[lVar21] -
                            (ulong)((&uStack0000000000000108)[lVar21] == 0));
              if (lVar21 == 1) goto code_r0x001526cc;
            }
            goto code_r0x001526a0;
          }
          in_stack_00000090 = *(ulong **)(in_stack_00000040 + (ulong)bVar11 * 8);
          puVar27 = (undefined8 *)(in_stack_00000040 + (ulong)!bVar11 * 8);
        }
        else {
          uVar28 = (ulong)in_stack_000000b8;
          in_stack_000000b8 = in_stack_000000b8 + uVar35;
          in_stack_00000090 =
               (ulong *)(((in_stack_000000b0 << (uVar28 & 0x3f)) >> ((ulong)-uVar35 & 0x3f)) +
                        (ulong)uVar36);
code_r0x001526a0:
          in_stack_00000118 = in_stack_00000110;
        }
code_r0x001526cc:
        uStack0000000000000108 = in_stack_00000090;
        in_stack_00000110 = *puVar27;
        if (bVar8 != 0) {
          uVar28 = (ulong)in_stack_000000b8;
          in_stack_000000b8 = in_stack_000000b8 + bVar8;
          in_stack_00000028 =
               ((in_stack_000000b0 << (uVar28 & 0x3f)) >> ((ulong)-(uint)bVar8 & 0x3f)) +
               in_stack_00000028;
        }
        if (0x1e < ((uint)bVar8 + (uint)bVar7 + uVar35 & 0xff)) {
          if (in_stack_000000b8 < 0x41) {
            if (in_stack_000000c0 < in_stack_000000d0) {
              if (in_stack_000000c0 == in_stack_000000c8) goto code_r0x0015270c;
              uVar36 = (int)in_stack_000000c0 - (int)in_stack_000000c8;
              if (in_stack_000000c8 <=
                  (ulong *)((long)in_stack_000000c0 - (ulong)(in_stack_000000b8 >> 3))) {
                uVar36 = in_stack_000000b8 >> 3;
              }
              in_stack_000000b8 = in_stack_000000b8 + uVar36 * -8;
            }
            else {
              uVar36 = in_stack_000000b8 >> 3;
              in_stack_000000b8 = in_stack_000000b8 & 7;
            }
            in_stack_000000c0 = (ulong *)((long)in_stack_000000c0 - (ulong)uVar36);
            in_stack_000000b0 = *in_stack_000000c0;
          }
          else {
            in_stack_000000c0 = (ulong *)&UNK_00814388;
          }
        }
code_r0x0015270c:
        if (bVar7 != 0) {
          uVar28 = (ulong)in_stack_000000b8;
          in_stack_000000b8 = in_stack_000000b8 + bVar7;
          in_stack_00000098 =
               (ulong *)(((in_stack_000000b0 << (uVar28 & 0x3f)) >> ((ulong)-(uint)bVar7 & 0x3f)) +
                        (long)in_stack_00000098);
        }
        param_4 = in_stack_00000060;
        if (uVar1 == (uint)in_stack_00000048) {
code_r0x00152804:
          if (*(int *)((long)in_stack_00000068 + 0xe64) == 2) goto code_r0x00152814;
code_r0x00152ddc:
          lVar21 = (ulong)(uVar1 & 7) * 0x18;
          uVar28 = *(ulong *)(&uStack0000000000000140 + lVar21);
          unaff_x28 = *(ulong **)(&uStack0000000000000148 + lVar21);
          unaff_x27 = *(ulong **)(&uStack0000000000000150 + lVar21);
          unaff_x20 = (ulong *)((long)puVar23 + uVar28);
          puVar19 = (ulong *)((long)unaff_x20 - (long)unaff_x27);
          Hint_Prefetch(puVar19,0,0,0);
          if (((ulong *)(uStack0000000000000120 + uVar28) <= in_stack_00000030) &&
             (unaff_x24 = (byte *)((long)unaff_x28 + uVar28),
             (byte *)((long)puVar23 + (long)unaff_x24) <= in_stack_00000088)) {
            uVar50 = *(ulong *)uStack0000000000000120;
            puVar23[1] = *(ulong *)(uStack0000000000000120 + 8);
            *puVar23 = uVar50;
            if (0x10 < uVar28) {
              uVar50 = *(ulong *)(uStack0000000000000120 + 0x10);
              puVar23[3] = *(ulong *)(uStack0000000000000120 + 0x18);
              puVar23[2] = uVar50;
              if (0x10 < uVar28 - 0x10) {
                puVar26 = puVar23 + 4;
                puVar18 = (ulong *)(uStack0000000000000120 + 0x30);
                do {
                  uVar50 = puVar18[-2];
                  puVar26[1] = puVar18[-1];
                  *puVar26 = uVar50;
                  uVar50 = *puVar18;
                  puVar26[3] = puVar18[1];
                  puVar26[2] = uVar50;
                  puVar26 = puVar26 + 4;
                  puVar18 = puVar18 + 4;
                } while (puVar26 < unaff_x20);
              }
            }
            uStack0000000000000120 = uStack0000000000000120 + uVar28;
            if (unaff_x27 <= (ulong *)((long)unaff_x20 - (long)in_stack_000000a0)) {
LAB_00152ec8:
              if (unaff_x27 < &MACH_HEADER.ncmds) {
                if ((ulong *)((long)&MACH_HEADER.cputype + 3) < unaff_x27) {
                  *unaff_x20 = *puVar19;
                }
                else {
                  iVar25 = *(int *)(&UNK_008143b0 + (long)unaff_x27 * 4);
                  *(byte *)unaff_x20 = (byte)*puVar19;
                  *(byte *)((long)unaff_x20 + 1) = *(byte *)((long)puVar19 + 1);
                  *(byte *)((long)unaff_x20 + 2) = *(byte *)((long)puVar19 + 2);
                  *(byte *)((long)unaff_x20 + 3) = *(byte *)((long)puVar19 + 3);
                  pbVar32 = (byte *)((long)puVar19 +
                                    (ulong)*(uint *)(&UNK_00814390 + (long)unaff_x27 * 4));
                  puVar19 = (ulong *)(pbVar32 + -(long)iVar25);
                  *(undefined4 *)((long)unaff_x20 + 4) = *(undefined4 *)pbVar32;
                }
                if (&MACH_HEADER.cpusubtype < unaff_x28) {
                  puVar26 = puVar19 + 1;
                  puVar18 = unaff_x20 + 1;
                  if ((long)puVar18 - (long)puVar26 < 0x10) {
                    do {
                      puVar19 = puVar18 + 1;
                      *puVar18 = *puVar26;
                      puVar26 = puVar26 + 1;
                      puVar18 = puVar19;
                    } while (puVar19 < (ulong *)((long)unaff_x20 + (long)unaff_x28));
                  }
                  else {
                    uVar28 = *puVar26;
                    unaff_x20[2] = puVar19[2];
                    *puVar18 = uVar28;
                    if (&MACH_HEADER.ncmds < unaff_x28 + -1) {
                      puVar26 = unaff_x20 + 3;
                      puVar19 = puVar19 + 5;
                      do {
                        uVar28 = puVar19[-2];
                        puVar26[1] = puVar19[-1];
                        *puVar26 = uVar28;
                        uVar28 = *puVar19;
                        puVar26[3] = puVar19[1];
                        puVar26[2] = uVar28;
                        puVar26 = puVar26 + 4;
                        puVar19 = puVar19 + 4;
                      } while (puVar26 < (ulong *)((long)unaff_x20 + (long)unaff_x28));
                    }
                  }
                }
              }
              else {
                uVar28 = *puVar19;
                unaff_x20[1] = puVar19[1];
                *unaff_x20 = uVar28;
                if (&MACH_HEADER.ncmds < unaff_x28) {
                  puVar26 = unaff_x20 + 2;
                  do {
                    uVar28 = puVar19[2];
                    puVar26[1] = puVar19[3];
                    *puVar26 = uVar28;
                    uVar28 = puVar19[4];
                    puVar26[3] = puVar19[5];
                    puVar26[2] = uVar28;
                    puVar26 = puVar26 + 4;
                    puVar19 = puVar19 + 4;
                  } while (puVar26 < (ulong *)((long)unaff_x20 + (long)unaff_x28));
                }
              }
              goto LAB_00152f44;
            }
            if (unaff_x27 <= (ulong *)((long)unaff_x20 - in_stack_00000070)) {
              lVar21 = (long)puVar19 - (long)in_stack_000000a0;
              pbVar32 = (byte *)((long)in_stack_000000a8 + lVar21);
              if (in_stack_000000a8 < pbVar32 + (long)unaff_x28) {
                _memmove(unaff_x20,pbVar32,-lVar21);
                unaff_x20 = (ulong *)((long)unaff_x20 - lVar21);
                unaff_x28 = (ulong *)(lVar21 + (long)unaff_x28);
                puVar19 = in_stack_000000a0;
                goto LAB_00152ec8;
              }
              _memmove(unaff_x20,pbVar32,unaff_x28);
              goto code_r0x00152f40;
            }
            goto LAB_00153e5c;
          }
          uStack0000000000000128 = uVar28;
          in_stack_00000130 = unaff_x28;
          in_stack_00000138 = unaff_x27;
          unaff_x24 = (byte *)func_0x00155c78(puVar23,in_stack_00000078,&uStack0000000000000128,
                                              &uStack0000000000000120,in_stack_00000030,
                                              in_stack_000000a0,in_stack_00000070,in_stack_000000a8)
          ;
          unaff_x20 = unaff_x21;
          unaff_x27 = in_stack_00000090;
        }
        else {
          iVar25 = in_stack_000000b8 + *(byte *)((long)puVar4 + 3);
          in_stack_000000d8 =
               (in_stack_000000b0 >> ((ulong)(uint)-iVar25 & 0x3f) &
               (ulong)*(uint *)(&UNK_00814304 + (ulong)(uint)*(byte *)((long)puVar4 + 3) * 4)) +
               (ulong)*puVar4;
          iVar25 = iVar25 + (uint)*(byte *)((long)puVar5 + 3);
          in_stack_000000f8 =
               (in_stack_000000b0 >> ((ulong)(uint)-iVar25 & 0x3f) &
               (ulong)*(uint *)(&UNK_00814304 + (ulong)(uint)*(byte *)((long)puVar5 + 3) * 4)) +
               (ulong)*puVar5;
          in_stack_000000b8 = iVar25 + (uint)*(byte *)((long)puVar6 + 3);
          in_stack_000000e8 =
               (in_stack_000000b0 >> ((ulong)-in_stack_000000b8 & 0x3f) &
               (ulong)*(uint *)(&UNK_00814304 + (ulong)(uint)*(byte *)((long)puVar6 + 3) * 4)) +
               (ulong)*puVar6;
          if (in_stack_000000b8 < 0x41) {
            if (in_stack_000000c0 < in_stack_000000d0) {
              if (in_stack_000000c0 == in_stack_000000c8) goto code_r0x00152804;
              uVar36 = (int)in_stack_000000c0 - (int)in_stack_000000c8;
              if (in_stack_000000c8 <=
                  (ulong *)((long)in_stack_000000c0 - (ulong)(in_stack_000000b8 >> 3))) {
                uVar36 = in_stack_000000b8 >> 3;
              }
              in_stack_000000b8 = in_stack_000000b8 + uVar36 * -8;
            }
            else {
              uVar36 = in_stack_000000b8 >> 3;
              in_stack_000000b8 = in_stack_000000b8 & 7;
            }
            in_stack_000000c0 = (ulong *)((long)in_stack_000000c0 - (ulong)uVar36);
            in_stack_000000b0 = *in_stack_000000c0;
            goto code_r0x00152804;
          }
          in_stack_000000c0 = (ulong *)&UNK_00814388;
          if (*(int *)((long)in_stack_00000068 + 0xe64) != 2) goto code_r0x00152ddc;
code_r0x00152814:
          lVar21 = (ulong)(uVar1 & 7) * 0x18;
          unaff_x28 = (ulong *)(&uStack0000000000000140 + lVar21);
          uVar28 = *unaff_x28;
          puVar18 = *(ulong **)(in_stack_00000038 + 0x7698);
          puVar26 = (ulong *)(uStack0000000000000120 + uVar28);
          if (puVar18 < puVar26) goto code_r0x00152834;
          unaff_x20 = *(ulong **)(&uStack0000000000000148 + lVar21);
          unaff_x27 = *(ulong **)(&uStack0000000000000150 + lVar21);
          if ((in_stack_00000030 < puVar26) ||
             (unaff_x24 = (byte *)((long)unaff_x20 + uVar28),
             puVar26 + -4 < (ulong *)((long)puVar23 + (long)unaff_x24))) {
            uStack0000000000000128 = uVar28;
            in_stack_00000130 = unaff_x20;
            in_stack_00000138 = unaff_x27;
            unaff_x24 = (byte *)func_0x00156308(puVar23,in_stack_00000078,puVar26 + -4,
                                                &uStack0000000000000128,&uStack0000000000000120,
                                                in_stack_00000030,in_stack_000000a0,
                                                in_stack_00000070);
            unaff_x20 = unaff_x21;
          }
          else {
            unaff_x28 = (ulong *)((long)puVar23 + uVar28);
            uVar50 = *(ulong *)uStack0000000000000120;
            puVar23[1] = *(ulong *)(uStack0000000000000120 + 8);
            *puVar23 = uVar50;
            if (0x10 < uVar28) {
              uVar50 = *(ulong *)(uStack0000000000000120 + 0x10);
              puVar23[3] = *(ulong *)(uStack0000000000000120 + 0x18);
              puVar23[2] = uVar50;
              if (0x10 < uVar28 - 0x10) {
                puVar19 = puVar23 + 4;
                puVar18 = (ulong *)(uStack0000000000000120 + 0x30);
                do {
                  uVar28 = puVar18[-2];
                  puVar19[1] = puVar18[-1];
                  *puVar19 = uVar28;
                  uVar28 = *puVar18;
                  puVar19[3] = puVar18[1];
                  puVar19[2] = uVar28;
                  puVar19 = puVar19 + 4;
                  puVar18 = puVar18 + 4;
                } while (puVar19 < unaff_x28);
              }
            }
            uStack0000000000000120 = (ulong)puVar26;
            puVar19 = (ulong *)((long)unaff_x28 - (long)unaff_x27);
            if ((ulong *)((long)unaff_x28 - (long)in_stack_000000a0) < unaff_x27) {
              if ((ulong *)((long)unaff_x28 - in_stack_00000070) < unaff_x27) goto LAB_00153e5c;
              lVar21 = ((long)unaff_x28 - (long)unaff_x27) - (long)in_stack_000000a0;
              pbVar32 = (byte *)((long)in_stack_000000a8 + lVar21);
              if (pbVar32 + (long)unaff_x20 <= in_stack_000000a8) {
                _memmove(unaff_x28,pbVar32,unaff_x20);
                goto code_r0x00152f40;
              }
              _memmove(unaff_x28,pbVar32,-lVar21);
              unaff_x28 = (ulong *)((long)unaff_x28 - lVar21);
              unaff_x20 = (ulong *)(lVar21 + (long)unaff_x20);
              puVar19 = in_stack_000000a0;
            }
            if ((ulong *)((long)&MACH_HEADER.filetype + 3) < unaff_x27) {
              uVar28 = *puVar19;
              unaff_x28[1] = puVar19[1];
              *unaff_x28 = uVar28;
              if (&MACH_HEADER.ncmds < unaff_x20) {
                puVar26 = unaff_x28 + 2;
                do {
                  uVar28 = puVar19[2];
                  puVar26[1] = puVar19[3];
                  *puVar26 = uVar28;
                  uVar28 = puVar19[4];
                  puVar26[3] = puVar19[5];
                  puVar26[2] = uVar28;
                  puVar26 = puVar26 + 4;
                  puVar19 = puVar19 + 4;
                } while (puVar26 < (ulong *)((long)unaff_x28 + (long)unaff_x20));
              }
              goto LAB_00152f44;
            }
            if ((ulong *)((long)&MACH_HEADER.cputype + 3) < unaff_x27) {
              *unaff_x28 = *puVar19;
            }
            else {
              iVar25 = *(int *)(&UNK_008143b0 + (long)unaff_x27 * 4);
              *(byte *)unaff_x28 = (byte)*puVar19;
              *(byte *)((long)unaff_x28 + 1) = *(byte *)((long)puVar19 + 1);
              *(byte *)((long)unaff_x28 + 2) = *(byte *)((long)puVar19 + 2);
              *(byte *)((long)unaff_x28 + 3) = *(byte *)((long)puVar19 + 3);
              pbVar32 = (byte *)((long)puVar19 +
                                (ulong)*(uint *)(&UNK_00814390 + (long)unaff_x27 * 4));
              puVar19 = (ulong *)(pbVar32 + -(long)iVar25);
              *(undefined4 *)((long)unaff_x28 + 4) = *(undefined4 *)pbVar32;
            }
            if (&MACH_HEADER.cpusubtype < unaff_x20) {
              puVar26 = puVar19 + 1;
              puVar18 = unaff_x28 + 1;
              if ((long)puVar18 - (long)puVar26 < 0x10) {
                do {
                  puVar19 = puVar18 + 1;
                  *puVar18 = *puVar26;
                  puVar26 = puVar26 + 1;
                  puVar18 = puVar19;
                } while (puVar19 < (ulong *)((long)unaff_x28 + (long)unaff_x20));
              }
              else {
                uVar28 = *puVar26;
                unaff_x28[2] = puVar19[2];
                *puVar18 = uVar28;
                if (&MACH_HEADER.ncmds < unaff_x20 + -1) {
                  puVar26 = unaff_x28 + 3;
                  puVar19 = puVar19 + 5;
                  do {
                    uVar28 = puVar19[-2];
                    puVar26[1] = puVar19[-1];
                    *puVar26 = uVar28;
                    uVar28 = *puVar19;
                    puVar26[3] = puVar19[1];
                    puVar26[2] = uVar28;
                    puVar26 = puVar26 + 4;
                    puVar19 = puVar19 + 4;
                  } while (puVar26 < (ulong *)((long)unaff_x28 + (long)unaff_x20));
                }
              }
            }
          }
code_r0x00152f40:
        }
LAB_00152f44:
        puVar19 = (ulong *)(ulong)in_stack_00000050._4_4_;
        if ((byte *)0xffffffffffffff88 < unaff_x24) goto LAB_00153e60;
        puVar19 = (ulong *)((long)in_stack_00000098 + (long)unaff_x19);
        puVar26 = in_stack_000000a8;
        if (in_stack_00000090 <= puVar19) {
          puVar26 = in_stack_000000a0;
        }
        lVar21 = (long)((long)puVar26 + (long)puVar19) - (long)in_stack_00000090;
        Hint_Prefetch(lVar21,0,0,0);
        Hint_Prefetch(lVar21 + 0x40,0,0,0);
        lVar21 = (ulong)(uVar1 & 7) * 0x18;
        *(ulong **)(&uStack0000000000000140 + lVar21) = in_stack_00000098;
        *(ulong *)(&uStack0000000000000148 + lVar21) = in_stack_00000028;
        *(ulong **)(&uStack0000000000000150 + lVar21) = in_stack_00000090;
        puVar23 = (ulong *)((long)puVar23 + (long)unaff_x24);
        unaff_x19 = (byte *)((long)puVar19 + in_stack_00000028);
        uVar1 = uVar1 + 1;
        if (uVar1 == in_stack_00000050._4_4_) break;
      } while( true );
    }
    unaff_x21 = (ulong *)(ulong)in_stack_00000050._4_4_;
    unaff_x24 = (byte *)0xffffffffffffffec;
    param_4 = in_stack_000000c8;
    puVar19 = unaff_x21;
    if (in_stack_000000c0 != in_stack_000000c8) goto LAB_00153e60;
    if (in_stack_000000b8 != 0x40) goto LAB_00153e60;
    uVar1 = in_stack_00000050._4_4_ - in_stack_00000018._4_4_;
    if ((int)in_stack_00000050._4_4_ <= (int)uVar1) goto LAB_00153e9c;
    in_stack_00000048 = (byte *)(in_stack_00000078 + -0x20);
    puVar26 = (ulong *)(in_stack_00000038 + 0x176a4);
    goto LAB_001534d0;
  }
  goto LAB_00153e60;
code_r0x00152834:
  uVar50 = (long)puVar18 - uStack0000000000000120;
  unaff_x26 = puVar23;
  if (uVar50 == 0) goto code_r0x00152b94;
  unaff_x20 = in_stack_00000098;
  if ((ulong)(in_stack_00000078 - (long)puVar23) < uVar50) goto code_r0x00152014;
  uVar28 = (long)puVar23 - uStack0000000000000120;
  unaff_x26 = (ulong *)((long)puVar23 + uVar50);
  if (((long)uVar28 < -7) && (7 < uVar50)) {
    if (uVar28 < 0xfffffffffffffff0) {
      puVar19 = unaff_x26 + -4;
      if (puVar19 < puVar23) goto code_r0x00152a24;
      uVar28 = *(ulong *)uStack0000000000000120;
      puVar23[1] = *(ulong *)(uStack0000000000000120 + 8);
      *puVar23 = uVar28;
      if (0x10 < (ulong)((long)puVar19 - (long)puVar23)) {
        puVar34 = puVar23 + 2;
        puVar26 = (ulong *)uStack0000000000000120;
        do {
          uVar28 = puVar26[2];
          puVar34[1] = puVar26[3];
          *puVar34 = uVar28;
          uVar28 = puVar26[4];
          puVar34[3] = puVar26[5];
          puVar34[2] = uVar28;
          puVar34 = puVar34 + 4;
          puVar26 = puVar26 + 4;
        } while (puVar34 < puVar19);
      }
      uStack0000000000000120 = uStack0000000000000120 + ((long)puVar19 - (long)puVar23);
    }
    else {
code_r0x00152a24:
      puVar19 = puVar23;
      if ((long)uVar50 < 1) goto code_r0x00152b84;
    }
    pbVar32 = (byte *)((long)puVar23 + (uVar50 - (long)puVar19));
    if ((pbVar32 < (byte *)0x8) || ((long)puVar19 - uStack0000000000000120 < 0x40)) {
      puVar23 = puVar19;
    }
    else {
      if (pbVar32 < (byte *)0x40) {
        pbVar37 = (byte *)0x0;
      }
      else {
        pbVar37 = (byte *)((ulong)pbVar32 & 0xffffffffffffffc0);
        puVar23 = puVar19 + 4;
        puVar34 = (ulong *)(uStack0000000000000120 + 0x20);
        pbVar12 = pbVar37;
        do {
          uVar28 = puVar34[-4];
          uVar17 = puVar34[-1];
          uVar49 = puVar34[-2];
          uVar33 = puVar34[1];
          uVar16 = *puVar34;
          uVar41 = puVar34[3];
          uVar30 = puVar34[2];
          puVar23[-3] = puVar34[-3];
          puVar23[-4] = uVar28;
          puVar23[-1] = uVar17;
          puVar23[-2] = uVar49;
          puVar23[1] = uVar33;
          *puVar23 = uVar16;
          puVar23[3] = uVar41;
          puVar23[2] = uVar30;
          pbVar12 = pbVar12 + -0x40;
          puVar23 = puVar23 + 8;
          puVar34 = puVar34 + 8;
        } while (pbVar12 != (byte *)0x0);
        if (pbVar32 == pbVar37) goto code_r0x00152b84;
        if (((ulong)pbVar32 & 0x38) == 0) {
          uStack0000000000000120 = uStack0000000000000120 + (long)pbVar37;
          puVar23 = (ulong *)((long)puVar19 + (long)pbVar37);
          goto code_r0x00152b54;
        }
      }
      pbVar42 = (byte *)((ulong)pbVar32 & 0xfffffffffffffff8);
      lVar38 = (long)pbVar37 - (long)pbVar42;
      pbVar12 = (byte *)(uStack0000000000000120 + (long)pbVar37);
      pbVar37 = (byte *)((long)puVar19 + (long)pbVar37);
      do {
        *(undefined8 *)pbVar37 = *(undefined8 *)pbVar12;
        lVar38 = lVar38 + 8;
        pbVar12 = pbVar12 + 8;
        pbVar37 = pbVar37 + 8;
      } while (lVar38 != 0);
      puVar23 = (ulong *)((long)puVar19 + (long)pbVar42);
      uStack0000000000000120 = (ulong)(uStack0000000000000120 + (long)pbVar42);
      if (pbVar32 == pbVar42) goto code_r0x00152b84;
    }
code_r0x00152b54:
    do {
      puVar34 = (ulong *)((long)puVar23 + 1);
      *(byte *)puVar23 = (byte)*(ulong *)uStack0000000000000120;
      puVar23 = puVar34;
      uStack0000000000000120 = (ulong)(uStack0000000000000120 + 1);
    } while (puVar34 != (ulong *)((long)puVar19 + (long)pbVar32));
  }
  else if (0 < (long)uVar50) {
    pbVar32 = (byte *)((long)puVar23 + (long)puVar18) + -uStack0000000000000120;
    if (pbVar32 <= (byte *)((long)puVar23 + 1)) {
      pbVar32 = (byte *)((long)puVar23 + 1);
    }
    uVar49 = (long)pbVar32 - (long)puVar23;
    if ((7 < uVar49) && (0x3f < uVar28)) {
      if (uVar49 < 0x40) {
        uVar17 = 0;
      }
      else {
        uVar17 = uVar49 & 0xffffffffffffffc0;
        puVar19 = puVar23 + 4;
        puVar34 = (ulong *)(uStack0000000000000120 + 0x20);
        uVar28 = uVar17;
        do {
          uVar16 = puVar34[-4];
          uVar30 = puVar34[-1];
          uVar33 = puVar34[-2];
          uVar55 = puVar34[1];
          uVar41 = *puVar34;
          uVar59 = puVar34[3];
          uVar57 = puVar34[2];
          puVar19[-3] = puVar34[-3];
          puVar19[-4] = uVar16;
          puVar19[-1] = uVar30;
          puVar19[-2] = uVar33;
          puVar19[1] = uVar55;
          *puVar19 = uVar41;
          puVar19[3] = uVar59;
          puVar19[2] = uVar57;
          uVar28 = uVar28 - 0x40;
          puVar19 = puVar19 + 8;
          puVar34 = puVar34 + 8;
        } while (uVar28 != 0);
        if (uVar49 == uVar17) goto code_r0x00152b84;
        if ((uVar49 & 0x38) == 0) {
          uStack0000000000000120 = uStack0000000000000120 + uVar17;
          puVar23 = (ulong *)((long)puVar23 + uVar17);
          goto code_r0x00152b74;
        }
      }
      uVar28 = uVar49 & 0xfffffffffffffff8;
      lVar38 = uVar17 - uVar28;
      pbVar32 = (byte *)(uStack0000000000000120 + uVar17);
      pbVar12 = (byte *)((long)puVar23 + uVar17);
      do {
        *(undefined8 *)pbVar12 = *(undefined8 *)pbVar32;
        lVar38 = lVar38 + 8;
        pbVar32 = pbVar32 + 8;
        pbVar12 = pbVar12 + 8;
      } while (lVar38 != 0);
      puVar23 = (ulong *)((long)puVar23 + uVar28);
      uStack0000000000000120 = (ulong)(uStack0000000000000120 + uVar28);
      if (uVar49 == uVar28) goto code_r0x00152b84;
    }
code_r0x00152b74:
    do {
      puVar19 = (ulong *)((long)puVar23 + 1);
      *(byte *)puVar23 = (byte)*(ulong *)uStack0000000000000120;
      puVar23 = puVar19;
      uStack0000000000000120 = (ulong)(uStack0000000000000120 + 1);
    } while (puVar19 < unaff_x26);
  }
code_r0x00152b84:
  uVar28 = *unaff_x28 - uVar50;
  *unaff_x28 = uVar28;
code_r0x00152b94:
  uStack0000000000000120 = (ulong)in_stack_00000060;
  pbVar32 = (byte *)((long)in_stack_00000068 + 0xe64);
  pbVar32[0] = 0;
  pbVar32[1] = 0;
  pbVar32[2] = 0;
  pbVar32[3] = 0;
  unaff_x20 = *(ulong **)(&uStack0000000000000148 + lVar21);
  unaff_x22 = *(ulong **)(&uStack0000000000000150 + lVar21);
  unaff_x27 = (ulong *)((long)unaff_x26 + uVar28);
  unaff_x23 = (ulong *)((long)unaff_x27 - (long)unaff_x22);
  Hint_Prefetch(unaff_x23,0,0,0);
  unaff_x24 = (byte *)((long)unaff_x20 + uVar28);
  if (!(in_stack_00000030 < (ulong *)((long)in_stack_00000060 + uVar28) ||
       in_stack_00000088 < (byte *)((long)unaff_x26 + (long)unaff_x24))) {
    uVar50 = *in_stack_00000060;
    unaff_x26[1] = in_stack_00000060[1];
    *unaff_x26 = uVar50;
    if (0x10 < uVar28) {
      uVar50 = in_stack_00000060[2];
      unaff_x26[3] = in_stack_00000060[3];
      unaff_x26[2] = uVar50;
      if (0x10 < uVar28 - 0x10) {
        puVar23 = unaff_x26 + 4;
        puVar19 = in_stack_00000010;
        do {
          uVar50 = puVar19[-2];
          puVar23[1] = puVar19[-1];
          *puVar23 = uVar50;
          uVar50 = *puVar19;
          puVar23[3] = puVar19[1];
          puVar23[2] = uVar50;
          puVar23 = puVar23 + 4;
          puVar19 = puVar19 + 4;
        } while (puVar23 < unaff_x27);
      }
    }
    uStack0000000000000120 = (long)in_stack_00000060 + uVar28;
    if ((ulong *)((long)unaff_x27 - (long)in_stack_000000a0) < unaff_x22) {
      puVar34 = unaff_x22;
      puVar23 = unaff_x26;
      if ((ulong *)((long)unaff_x27 - in_stack_00000070) < unaff_x22) goto LAB_00153e5c;
      unaff_x25 = (long)unaff_x23 - (long)in_stack_000000a0;
      param_2 = (byte *)((long)in_stack_000000a8 + unaff_x25);
      if (in_stack_000000a8 < param_2 + (long)unaff_x20) {
        unaff_x23 = in_stack_000000a0;
        goto code_r0x00152c24;
      }
      _memmove(unaff_x27,param_2,unaff_x20);
      goto LAB_00152cdc;
    }
    goto code_r0x00152c5c;
  }
  param_4 = &uStack0000000000000120;
  uStack0000000000000128 = uVar28;
  in_stack_00000130 = unaff_x20;
  in_stack_00000138 = unaff_x22;
  unaff_x24 = (byte *)func_0x00155c78(unaff_x26,in_stack_00000078,&uStack0000000000000128,param_4,
                                      in_stack_00000030,in_stack_000000a0,in_stack_00000070,
                                      in_stack_000000a8);
  unaff_x20 = unaff_x21;
  goto LAB_00152cdc;
LAB_001534d0:
  unaff_x19 = (byte *)(ulong)uVar1;
  puVar19 = (ulong *)(ulong)in_stack_00000050._4_4_;
  lVar21 = (ulong)(uVar1 & 7) * 0x18;
  puVar18 = (ulong *)(&uStack0000000000000140 + lVar21);
  param_4 = in_stack_000000c8;
  puVar47 = &uStack0000000000000140;
  if (*(int *)((long)in_stack_00000068 + 0xe64) == 2) {
    uVar28 = *puVar18;
    puVar31 = *(ulong **)(in_stack_00000038 + 0x7698);
    puVar20 = (ulong *)(uStack0000000000000120 + uVar28);
    if (puVar31 < puVar20) {
      uVar50 = (long)puVar31 - uStack0000000000000120;
      puVar20 = puVar23;
      if (uVar50 != 0) {
        if ((ulong)(in_stack_00000078 - (long)puVar23) < uVar50) goto code_r0x00152014;
        uVar28 = (long)puVar23 - uStack0000000000000120;
        puVar20 = (ulong *)((long)puVar23 + uVar50);
        if (((long)uVar28 < -7) && (7 < uVar50)) {
          if (uVar28 < 0xfffffffffffffff0) {
            puVar19 = puVar20 + -4;
            if (puVar19 < puVar23) goto code_r0x001537d4;
            uVar28 = *(ulong *)uStack0000000000000120;
            puVar23[1] = *(ulong *)(uStack0000000000000120 + 8);
            *puVar23 = uVar28;
            if (0x10 < (ulong)((long)puVar19 - (long)puVar23)) {
              puVar31 = puVar23 + 2;
              puVar24 = (ulong *)uStack0000000000000120;
              do {
                uVar28 = puVar24[2];
                puVar31[1] = puVar24[3];
                *puVar31 = uVar28;
                uVar28 = puVar24[4];
                puVar31[3] = puVar24[5];
                puVar31[2] = uVar28;
                puVar31 = puVar31 + 4;
                puVar24 = puVar24 + 4;
              } while (puVar31 < puVar19);
            }
            uStack0000000000000120 = uStack0000000000000120 + ((long)puVar19 - (long)puVar23);
          }
          else {
code_r0x001537d4:
            puVar19 = puVar23;
            if ((long)uVar50 < 1) goto LAB_00153934;
          }
          pbVar32 = (byte *)((long)puVar23 + (uVar50 - (long)puVar19));
          if ((pbVar32 < (byte *)0x8) || ((long)puVar19 - uStack0000000000000120 < 0x40)) {
            puVar23 = puVar19;
          }
          else {
            if (pbVar32 < (byte *)0x40) {
              pbVar37 = (byte *)0x0;
            }
            else {
              pbVar37 = (byte *)((ulong)pbVar32 & 0xffffffffffffffc0);
              puVar23 = puVar19 + 4;
              puVar31 = (ulong *)(uStack0000000000000120 + 0x20);
              pbVar12 = pbVar37;
              do {
                uVar28 = puVar31[-4];
                uVar17 = puVar31[-1];
                uVar49 = puVar31[-2];
                uVar33 = puVar31[1];
                uVar16 = *puVar31;
                uVar41 = puVar31[3];
                uVar30 = puVar31[2];
                puVar23[-3] = puVar31[-3];
                puVar23[-4] = uVar28;
                puVar23[-1] = uVar17;
                puVar23[-2] = uVar49;
                puVar23[1] = uVar33;
                *puVar23 = uVar16;
                puVar23[3] = uVar41;
                puVar23[2] = uVar30;
                pbVar12 = pbVar12 + -0x40;
                puVar23 = puVar23 + 8;
                puVar31 = puVar31 + 8;
              } while (pbVar12 != (byte *)0x0);
              if (pbVar32 == pbVar37) goto LAB_00153934;
              if (((ulong)pbVar32 & 0x38) == 0) {
                uStack0000000000000120 = uStack0000000000000120 + (long)pbVar37;
                puVar23 = (ulong *)((long)puVar19 + (long)pbVar37);
                goto LAB_00153904;
              }
            }
            pbVar42 = (byte *)((ulong)pbVar32 & 0xfffffffffffffff8);
            lVar38 = (long)pbVar37 - (long)pbVar42;
            pbVar12 = (byte *)((long)puVar19 + (long)pbVar37);
            pbVar37 = (byte *)(uStack0000000000000120 + (long)pbVar37);
            do {
              *(undefined8 *)pbVar12 = *(undefined8 *)pbVar37;
              lVar38 = lVar38 + 8;
              pbVar12 = pbVar12 + 8;
              pbVar37 = pbVar37 + 8;
            } while (lVar38 != 0);
            puVar23 = (ulong *)((long)puVar19 + (long)pbVar42);
            uStack0000000000000120 = (ulong)(uStack0000000000000120 + (long)pbVar42);
            if (pbVar32 == pbVar42) goto LAB_00153934;
          }
LAB_00153904:
          do {
            puVar31 = (ulong *)((long)puVar23 + 1);
            *(byte *)puVar23 = (byte)*(ulong *)uStack0000000000000120;
            puVar23 = puVar31;
            uStack0000000000000120 = (ulong)(uStack0000000000000120 + 1);
          } while (puVar31 != (ulong *)((long)puVar19 + (long)pbVar32));
        }
        else if (0 < (long)uVar50) {
          pbVar32 = (byte *)((long)puVar23 + (long)puVar31) + -uStack0000000000000120;
          if (pbVar32 <= (byte *)((long)puVar23 + 1)) {
            pbVar32 = (byte *)((long)puVar23 + 1);
          }
          uVar49 = (long)pbVar32 - (long)puVar23;
          if ((7 < uVar49) && (0x3f < uVar28)) {
            if (uVar49 < 0x40) {
              uVar17 = 0;
            }
            else {
              uVar17 = uVar49 & 0xffffffffffffffc0;
              puVar19 = puVar23 + 4;
              puVar31 = (ulong *)(uStack0000000000000120 + 0x20);
              uVar28 = uVar17;
              do {
                uVar16 = puVar31[-4];
                uVar30 = puVar31[-1];
                uVar33 = puVar31[-2];
                uVar55 = puVar31[1];
                uVar41 = *puVar31;
                uVar59 = puVar31[3];
                uVar57 = puVar31[2];
                puVar19[-3] = puVar31[-3];
                puVar19[-4] = uVar16;
                puVar19[-1] = uVar30;
                puVar19[-2] = uVar33;
                puVar19[1] = uVar55;
                *puVar19 = uVar41;
                puVar19[3] = uVar59;
                puVar19[2] = uVar57;
                uVar28 = uVar28 - 0x40;
                puVar19 = puVar19 + 8;
                puVar31 = puVar31 + 8;
              } while (uVar28 != 0);
              if (uVar49 == uVar17) goto LAB_00153934;
              if ((uVar49 & 0x38) == 0) {
                uStack0000000000000120 = uStack0000000000000120 + uVar17;
                puVar23 = (ulong *)((long)puVar23 + uVar17);
                goto code_r0x00153924;
              }
            }
            uVar28 = uVar49 & 0xfffffffffffffff8;
            lVar38 = uVar17 - uVar28;
            pbVar32 = (byte *)(uStack0000000000000120 + uVar17);
            pbVar12 = (byte *)((long)puVar23 + uVar17);
            do {
              *(undefined8 *)pbVar12 = *(undefined8 *)pbVar32;
              lVar38 = lVar38 + 8;
              pbVar32 = pbVar32 + 8;
              pbVar12 = pbVar12 + 8;
            } while (lVar38 != 0);
            puVar23 = (ulong *)((long)puVar23 + uVar28);
            uStack0000000000000120 = (ulong)(uStack0000000000000120 + uVar28);
            if (uVar49 == uVar28) goto LAB_00153934;
          }
code_r0x00153924:
          do {
            puVar19 = (ulong *)((long)puVar23 + 1);
            *(byte *)puVar23 = (byte)*(ulong *)uStack0000000000000120;
            puVar23 = puVar19;
            uStack0000000000000120 = (ulong)(uStack0000000000000120 + 1);
          } while (puVar19 < puVar20);
        }
LAB_00153934:
        uVar28 = *puVar18 - uVar50;
        *puVar18 = uVar28;
      }
      uStack0000000000000120 = (ulong)in_stack_00000060;
      pbVar32 = (byte *)((long)in_stack_00000068 + 0xe64);
      pbVar32[0] = 0;
      pbVar32[1] = 0;
      pbVar32[2] = 0;
      pbVar32[3] = 0;
      unaff_x20 = *(ulong **)(&uStack0000000000000148 + lVar21);
      unaff_x28 = *(ulong **)(&uStack0000000000000150 + lVar21);
      unaff_x27 = (ulong *)((long)puVar20 + uVar28);
      puVar19 = (ulong *)((long)unaff_x27 - (long)unaff_x28);
      Hint_Prefetch(puVar19,0,0,0);
      unaff_x24 = (byte *)((long)unaff_x20 + uVar28);
      puVar23 = puVar20;
      if (puVar26 < (ulong *)((long)in_stack_00000060 + uVar28) ||
          in_stack_00000048 < (byte *)((long)puVar20 + (long)unaff_x24)) {
        in_stack_00000090 = &uStack0000000000000128;
        param_4 = &uStack0000000000000120;
        unaff_x21 = puVar26;
        uStack0000000000000128 = uVar28;
        in_stack_00000130 = unaff_x20;
        in_stack_00000138 = unaff_x28;
        unaff_x24 = (byte *)func_0x00155c78(puVar20,in_stack_00000078);
      }
      else {
        uVar50 = *in_stack_00000060;
        puVar20[1] = in_stack_00000060[1];
        *puVar20 = uVar50;
        if (0x10 < uVar28) {
          uVar50 = in_stack_00000060[2];
          puVar20[3] = in_stack_00000060[3];
          puVar20[2] = uVar50;
          if (0x10 < uVar28 - 0x10) {
            puVar18 = puVar20 + 4;
            puVar31 = in_stack_00000060 + 6;
            do {
              uVar50 = puVar31[-2];
              puVar18[1] = puVar31[-1];
              *puVar18 = uVar50;
              uVar50 = *puVar31;
              puVar18[3] = puVar31[1];
              puVar18[2] = uVar50;
              puVar18 = puVar18 + 4;
              puVar31 = puVar31 + 4;
            } while (puVar18 < unaff_x27);
          }
        }
        uStack0000000000000120 = (long)in_stack_00000060 + uVar28;
        if ((ulong *)((long)unaff_x27 - (long)in_stack_000000a0) < unaff_x28) {
          if ((ulong *)((long)unaff_x27 - in_stack_00000070) < unaff_x28) goto LAB_00153e5c;
          lVar21 = (long)puVar19 - (long)in_stack_000000a0;
          if ((byte *)((long)in_stack_000000a8 + lVar21) + (long)unaff_x20 <= in_stack_000000a8) {
            in_stack_00000090 = unaff_x20;
            _memmove(unaff_x27);
            param_4 = in_stack_000000c8;
            goto joined_r0x00153b5c;
          }
          in_stack_00000090 = (ulong *)-lVar21;
          _memmove(unaff_x27);
          unaff_x27 = (ulong *)((long)unaff_x27 - lVar21);
          unaff_x20 = (ulong *)(lVar21 + (long)unaff_x20);
          puVar19 = in_stack_000000a0;
        }
        param_4 = in_stack_000000c8;
        if (unaff_x28 < &MACH_HEADER.ncmds) {
          if ((ulong *)((long)&MACH_HEADER.cputype + 3) < unaff_x28) {
            *unaff_x27 = *puVar19;
          }
          else {
            iVar25 = *(int *)(&UNK_008143b0 + (long)unaff_x28 * 4);
            *(byte *)unaff_x27 = (byte)*puVar19;
            *(byte *)((long)unaff_x27 + 1) = *(byte *)((long)puVar19 + 1);
            *(byte *)((long)unaff_x27 + 2) = *(byte *)((long)puVar19 + 2);
            *(byte *)((long)unaff_x27 + 3) = *(byte *)((long)puVar19 + 3);
            pbVar32 = (byte *)((long)puVar19 + (ulong)*(uint *)(&UNK_00814390 + (long)unaff_x28 * 4)
                              );
            puVar19 = (ulong *)(pbVar32 + -(long)iVar25);
            *(undefined4 *)((long)unaff_x27 + 4) = *(undefined4 *)pbVar32;
          }
          if (&MACH_HEADER.cpusubtype < unaff_x20) {
            puVar18 = puVar19 + 1;
            puVar31 = unaff_x27 + 1;
            if ((long)puVar31 - (long)puVar18 < 0x10) {
              do {
                puVar19 = puVar31 + 1;
                *puVar31 = *puVar18;
                puVar18 = puVar18 + 1;
                puVar31 = puVar19;
              } while (puVar19 < (ulong *)((long)unaff_x27 + (long)unaff_x20));
            }
            else {
              uVar28 = *puVar18;
              unaff_x27[2] = puVar19[2];
              *puVar31 = uVar28;
              if (&MACH_HEADER.ncmds < unaff_x20 + -1) {
                puVar18 = unaff_x27 + 3;
                puVar19 = puVar19 + 5;
                do {
                  uVar28 = puVar19[-2];
                  puVar18[1] = puVar19[-1];
                  *puVar18 = uVar28;
                  uVar28 = *puVar19;
                  puVar18[3] = puVar19[1];
                  puVar18[2] = uVar28;
                  puVar18 = puVar18 + 4;
                  puVar19 = puVar19 + 4;
                } while (puVar18 < (ulong *)((long)unaff_x27 + (long)unaff_x20));
              }
            }
          }
        }
        else {
          uVar28 = *puVar19;
          unaff_x27[1] = puVar19[1];
          *unaff_x27 = uVar28;
          if (&MACH_HEADER.ncmds < unaff_x20) {
            puVar18 = unaff_x27 + 2;
            do {
              uVar28 = puVar19[2];
              puVar18[1] = puVar19[3];
              *puVar18 = uVar28;
              uVar28 = puVar19[4];
              puVar18[3] = puVar19[5];
              puVar18[2] = uVar28;
              puVar18 = puVar18 + 4;
              puVar19 = puVar19 + 4;
            } while (puVar18 < (ulong *)((long)unaff_x27 + (long)unaff_x20));
          }
        }
      }
joined_r0x00153b5c:
      puVar19 = (ulong *)(ulong)in_stack_00000050._4_4_;
      if ((byte *)0xffffffffffffff88 < unaff_x24) goto LAB_00153e60;
      puVar23 = (ulong *)((long)puVar20 + (long)unaff_x24);
      puStack0000000000000080 = puVar26;
      in_stack_000000c8 = param_4;
      goto joined_r0x001537cc;
    }
    in_stack_00000090 = puVar20 + -4;
    puVar18 = *(ulong **)(&uStack0000000000000148 + lVar21);
    unaff_x27 = *(ulong **)(&uStack0000000000000150 + lVar21);
    unaff_x24 = (byte *)((long)puVar18 + uVar28);
    unaff_x20 = puVar18;
    if (!(puStack0000000000000080 < puVar20 ||
         in_stack_00000090 < (ulong *)((long)puVar23 + (long)unaff_x24))) {
      puVar19 = (ulong *)((long)puVar23 + uVar28);
      uVar50 = *(ulong *)uStack0000000000000120;
      puVar23[1] = *(ulong *)(uStack0000000000000120 + 8);
      *puVar23 = uVar50;
      if (0x10 < uVar28) {
        uVar50 = *(ulong *)(uStack0000000000000120 + 0x10);
        puVar23[3] = *(ulong *)(uStack0000000000000120 + 0x18);
        puVar23[2] = uVar50;
        if (0x10 < uVar28 - 0x10) {
          puVar31 = puVar23 + 4;
          puVar24 = (ulong *)(uStack0000000000000120 + 0x30);
          do {
            uVar28 = puVar24[-2];
            puVar31[1] = puVar24[-1];
            *puVar31 = uVar28;
            uVar28 = *puVar24;
            puVar31[3] = puVar24[1];
            puVar31[2] = uVar28;
            puVar31 = puVar31 + 4;
            puVar24 = puVar24 + 4;
          } while (puVar31 < puVar19);
        }
      }
      uStack0000000000000120 = (ulong)puVar20;
      puVar20 = (ulong *)((long)puVar19 - (long)unaff_x27);
      if ((ulong *)((long)puVar19 - (long)in_stack_000000a0) < unaff_x27) {
        unaff_x28 = puVar19;
        if ((ulong *)((long)puVar19 - in_stack_00000070) < unaff_x27) goto LAB_00153e5c;
        lVar21 = ((long)puVar19 - (long)unaff_x27) - (long)in_stack_000000a0;
        if ((byte *)((long)in_stack_000000a8 + lVar21) + (long)puVar18 <= in_stack_000000a8)
        goto LAB_001537a0;
        in_stack_00000090 = (ulong *)-lVar21;
        _memmove(puVar19);
        puVar19 = (ulong *)((long)puVar19 - lVar21);
        puVar18 = (ulong *)(lVar21 + (long)puVar18);
        puVar20 = in_stack_000000a0;
      }
      param_4 = in_stack_000000c8;
      unaff_x20 = puVar18;
      unaff_x28 = puVar19;
      if (unaff_x27 < &MACH_HEADER.ncmds) {
        if ((ulong *)((long)&MACH_HEADER.cputype + 3) < unaff_x27) {
          *puVar19 = *puVar20;
        }
        else {
          iVar25 = *(int *)(&UNK_008143b0 + (long)unaff_x27 * 4);
          *(byte *)puVar19 = (byte)*puVar20;
          *(byte *)((long)puVar19 + 1) = *(byte *)((long)puVar20 + 1);
          *(byte *)((long)puVar19 + 2) = *(byte *)((long)puVar20 + 2);
          *(byte *)((long)puVar19 + 3) = *(byte *)((long)puVar20 + 3);
          pbVar32 = (byte *)((long)puVar20 + (ulong)*(uint *)(&UNK_00814390 + (long)unaff_x27 * 4));
          puVar20 = (ulong *)(pbVar32 + -(long)iVar25);
          *(undefined4 *)((long)puVar19 + 4) = *(undefined4 *)pbVar32;
        }
        if (&MACH_HEADER.cpusubtype < puVar18) {
          puVar31 = puVar20 + 1;
          puVar24 = puVar19 + 1;
          if ((long)puVar24 - (long)puVar31 < 0x10) {
            do {
              puVar20 = puVar24 + 1;
              *puVar24 = *puVar31;
              puVar31 = puVar31 + 1;
              puVar24 = puVar20;
            } while (puVar20 < (ulong *)((long)puVar19 + (long)puVar18));
          }
          else {
            uVar28 = *puVar31;
            puVar19[2] = puVar20[2];
            *puVar24 = uVar28;
            if (&MACH_HEADER.ncmds < puVar18 + -1) {
              puVar31 = puVar19 + 3;
              puVar20 = puVar20 + 5;
              do {
                uVar28 = puVar20[-2];
                puVar31[1] = puVar20[-1];
                *puVar31 = uVar28;
                uVar28 = *puVar20;
                puVar31[3] = puVar20[1];
                puVar31[2] = uVar28;
                puVar31 = puVar31 + 4;
                puVar20 = puVar20 + 4;
              } while (puVar31 < (ulong *)((long)puVar19 + (long)puVar18));
            }
          }
        }
      }
      else {
        uVar28 = *puVar20;
        puVar19[1] = puVar20[1];
        *puVar19 = uVar28;
        if (&MACH_HEADER.ncmds < puVar18) {
          puVar31 = puVar19 + 2;
          do {
            uVar28 = puVar20[2];
            puVar31[1] = puVar20[3];
            *puVar31 = uVar28;
            uVar28 = puVar20[4];
            puVar31[3] = puVar20[5];
            puVar31[2] = uVar28;
            puVar31 = puVar31 + 4;
            puVar20 = puVar20 + 4;
          } while (puVar31 < (ulong *)((long)puVar19 + (long)puVar18));
        }
      }
      goto joined_r0x001537bc;
    }
    param_4 = &uStack0000000000000128;
    unaff_x21 = &uStack0000000000000120;
    uStack0000000000000128 = uVar28;
    in_stack_00000130 = puVar18;
    in_stack_00000138 = unaff_x27;
    unaff_x24 = (byte *)func_0x00156308(puVar23,in_stack_00000078);
  }
  else {
    uVar28 = *puVar18;
    puVar18 = *(ulong **)(&uStack0000000000000148 + lVar21);
    unaff_x27 = *(ulong **)(&uStack0000000000000150 + lVar21);
    puVar19 = (ulong *)((long)puVar23 + uVar28);
    puVar20 = (ulong *)((long)puVar19 - (long)unaff_x27);
    Hint_Prefetch(puVar20,0,0,0);
    unaff_x24 = (byte *)((long)puVar18 + uVar28);
    unaff_x20 = puVar19;
    unaff_x28 = puVar18;
    if (puStack0000000000000080 < (ulong *)(uStack0000000000000120 + uVar28) ||
        in_stack_00000048 < (byte *)((long)puVar23 + (long)unaff_x24)) {
      in_stack_00000090 = &uStack0000000000000128;
      param_4 = &uStack0000000000000120;
      unaff_x21 = puStack0000000000000080;
      uStack0000000000000128 = uVar28;
      in_stack_00000130 = puVar18;
      in_stack_00000138 = unaff_x27;
      unaff_x24 = (byte *)func_0x00155c78(puVar23,in_stack_00000078);
    }
    else {
      uVar50 = *(ulong *)uStack0000000000000120;
      puVar23[1] = *(ulong *)(uStack0000000000000120 + 8);
      *puVar23 = uVar50;
      if (0x10 < uVar28) {
        uVar50 = *(ulong *)(uStack0000000000000120 + 0x10);
        puVar23[3] = *(ulong *)(uStack0000000000000120 + 0x18);
        puVar23[2] = uVar50;
        if (0x10 < uVar28 - 0x10) {
          puVar31 = puVar23 + 4;
          puVar24 = (ulong *)(uStack0000000000000120 + 0x30);
          do {
            uVar50 = puVar24[-2];
            puVar31[1] = puVar24[-1];
            *puVar31 = uVar50;
            uVar50 = *puVar24;
            puVar31[3] = puVar24[1];
            puVar31[2] = uVar50;
            puVar31 = puVar31 + 4;
            puVar24 = puVar24 + 4;
          } while (puVar31 < puVar19);
        }
      }
      uStack0000000000000120 = uStack0000000000000120 + uVar28;
      if ((ulong *)((long)puVar19 - (long)in_stack_000000a0) < unaff_x27) {
        if ((ulong *)((long)puVar19 - in_stack_00000070) < unaff_x27) goto LAB_00153e5c;
        lVar21 = (long)puVar20 - (long)in_stack_000000a0;
        if ((byte *)((long)in_stack_000000a8 + lVar21) + (long)puVar18 <= in_stack_000000a8) {
LAB_001537a0:
          _memmove(puVar19);
          in_stack_00000090 = puVar18;
          param_4 = in_stack_000000c8;
          goto joined_r0x001537bc;
        }
        in_stack_00000090 = (ulong *)-lVar21;
        _memmove(puVar19);
        puVar19 = (ulong *)((long)puVar19 - lVar21);
        puVar18 = (ulong *)(lVar21 + (long)puVar18);
        puVar20 = in_stack_000000a0;
      }
      param_4 = in_stack_000000c8;
      unaff_x20 = puVar19;
      unaff_x28 = puVar18;
      if (unaff_x27 < &MACH_HEADER.ncmds) {
        if ((ulong *)((long)&MACH_HEADER.cputype + 3) < unaff_x27) {
          *puVar19 = *puVar20;
        }
        else {
          iVar25 = *(int *)(&UNK_008143b0 + (long)unaff_x27 * 4);
          *(byte *)puVar19 = (byte)*puVar20;
          *(byte *)((long)puVar19 + 1) = *(byte *)((long)puVar20 + 1);
          *(byte *)((long)puVar19 + 2) = *(byte *)((long)puVar20 + 2);
          *(byte *)((long)puVar19 + 3) = *(byte *)((long)puVar20 + 3);
          pbVar32 = (byte *)((long)puVar20 + (ulong)*(uint *)(&UNK_00814390 + (long)unaff_x27 * 4));
          puVar20 = (ulong *)(pbVar32 + -(long)iVar25);
          *(undefined4 *)((long)puVar19 + 4) = *(undefined4 *)pbVar32;
        }
        if (&MACH_HEADER.cpusubtype < puVar18) {
          puVar31 = puVar20 + 1;
          puVar24 = puVar19 + 1;
          if ((long)puVar24 - (long)puVar31 < 0x10) {
            do {
              puVar20 = puVar24 + 1;
              *puVar24 = *puVar31;
              puVar31 = puVar31 + 1;
              puVar24 = puVar20;
            } while (puVar20 < (ulong *)((long)puVar19 + (long)puVar18));
          }
          else {
            uVar28 = *puVar31;
            puVar19[2] = puVar20[2];
            *puVar24 = uVar28;
            if (&MACH_HEADER.ncmds < puVar18 + -1) {
              puVar31 = puVar19 + 3;
              puVar20 = puVar20 + 5;
              do {
                uVar28 = puVar20[-2];
                puVar31[1] = puVar20[-1];
                *puVar31 = uVar28;
                uVar28 = *puVar20;
                puVar31[3] = puVar20[1];
                puVar31[2] = uVar28;
                puVar31 = puVar31 + 4;
                puVar20 = puVar20 + 4;
              } while (puVar31 < (ulong *)((long)puVar19 + (long)puVar18));
            }
          }
        }
      }
      else {
        uVar28 = *puVar20;
        puVar19[1] = puVar20[1];
        *puVar19 = uVar28;
        if (&MACH_HEADER.ncmds < puVar18) {
          puVar31 = puVar19 + 2;
          do {
            uVar28 = puVar20[2];
            puVar31[1] = puVar20[3];
            *puVar31 = uVar28;
            uVar28 = puVar20[4];
            puVar31[3] = puVar20[5];
            puVar31[2] = uVar28;
            puVar31 = puVar31 + 4;
            puVar20 = puVar20 + 4;
          } while (puVar31 < (ulong *)((long)puVar19 + (long)puVar18));
        }
      }
    }
  }
joined_r0x001537bc:
  puVar19 = (ulong *)(ulong)in_stack_00000050._4_4_;
  if ((byte *)0xffffffffffffff88 < unaff_x24) goto LAB_00153e60;
  puVar23 = (ulong *)((long)puVar23 + (long)unaff_x24);
  in_stack_000000c8 = param_4;
joined_r0x001537cc:
  uVar1 = uVar1 + 1;
  if (uVar1 == in_stack_00000050._4_4_) goto LAB_00153e9c;
  goto LAB_001534d0;
LAB_00153e5c:
  in_stack_00000068 = puVar34;
  puVar19 = (ulong *)(ulong)in_stack_00000050._4_4_;
  unaff_x24 = (byte *)0xffffffffffffffec;
  goto LAB_00153e60;
LAB_00153e9c:
  puVar19 = (ulong *)(ulong)in_stack_00000050._4_4_;
  *in_stack_00000068 = CONCAT44((int)in_stack_00000110,(int)uStack0000000000000108);
  *(int *)(in_stack_00000068 + 1) = (int)in_stack_00000118;
  puVar34 = (ulong *)uStack0000000000000120;
  in_stack_00000090 = puStack0000000000000080;
  param_4 = in_stack_000000c8;
  unaff_x19 = in_stack_00000020;
  if (*(int *)((long)in_stack_00000068 + 0xe64) == 2) {
    unaff_x20 = (ulong *)((long)puStack0000000000000080 - uStack0000000000000120);
    puVar47 = in_stack_00000038;
    if (unaff_x20 <= (ulong *)(in_stack_00000078 - (long)puVar23)) {
      if (puVar23 != (ulong *)0x0) {
        _memmove(puVar23,uStack0000000000000120,unaff_x20);
        puVar23 = (ulong *)((long)puVar23 + (long)unaff_x20);
      }
      puVar34 = (ulong *)(in_stack_00000038 + 0x76a4);
      in_stack_00000090 = (ulong *)(in_stack_00000038 + 0x176a4);
      param_4 = in_stack_000000c8;
      goto code_r0x00152000;
    }
  }
  else {
code_r0x00152000:
    unaff_x20 = (ulong *)((long)in_stack_00000090 - (long)puVar34);
    puVar47 = in_stack_00000038;
    if (unaff_x20 <= (ulong *)(in_stack_00000078 - (long)puVar23)) {
      if (puVar23 == (ulong *)0x0) {
        pbVar32 = (byte *)0x0;
      }
      else {
        in_stack_00000090 = unaff_x20;
        _memmove(puVar23);
        pbVar32 = (byte *)((long)puVar23 + (long)unaff_x20);
      }
      unaff_x24 = pbVar32 + -(long)in_stack_00000020;
      goto LAB_00153e60;
    }
  }
code_r0x00152014:
  unaff_x24 = (byte *)0xffffffffffffffba;
LAB_00153e60:
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
    return unaff_x24;
  }
  auVar61 = ___stack_chk_fail();
  pbVar15 = auVar61._8_8_;
  plVar13 = auVar61._0_8_;
  puStack_60 = unaff_x28;
  puStack_58 = unaff_x27;
  puStack_50 = puVar23;
  puStack_48 = puVar47;
  pbStack_40 = unaff_x24;
  uStack_38 = 0x18;
  puStack_30 = in_stack_00000068;
  pbStack_28 = in_stack_00000048;
  puStack_20 = unaff_x20;
  pbStack_18 = unaff_x19;
  pbVar12 = pbVar15 + ((ulong)in_stack_00000090 &
                      ((long)in_stack_00000090 >> 0x3f ^ 0xffffffffffffffffU));
  pbVar37 = (byte *)plVar13[0xeb5];
  pbStack_88 = pbVar37;
  pbVar32 = (byte *)plVar13[0xed3];
  pbVar42 = pbVar15;
  if ((int)puVar19 == 0) {
    iVar25 = (int)plVar13[0xed4];
joined_r0x001550b0:
    pbStack_88 = pbVar37;
    if (iVar25 == 2) {
      uVar28 = (long)pbVar32 - (long)pbVar37;
      if ((ulong)((long)pbVar12 - (long)pbVar42) < uVar28) {
        return (byte *)0xffffffffffffffba;
      }
      if (pbVar42 != (byte *)0x0) {
        _memmove(pbVar42,pbVar37,uVar28);
        pbVar42 = (byte *)((long)pbVar42 + uVar28);
      }
      pbVar37 = (byte *)((long)plVar13 + 0x76a4);
      pbVar32 = (byte *)((long)plVar13 + 0x176a4);
      *(undefined4 *)(plVar13 + 0xed4) = 0;
    }
    uVar28 = (long)pbVar32 - (long)pbVar37;
    if ((ulong)((long)pbVar12 - (long)pbVar42) < uVar28) {
      return (byte *)0xffffffffffffffba;
    }
    if (pbVar42 == (byte *)0x0) {
      pbVar42 = (byte *)0x0;
    }
    else {
      _memcpy(pbVar42,pbVar37,uVar28);
      pbVar42 = pbVar42 + uVar28;
    }
    return pbVar42 + -(long)pbVar15;
  }
  pbVar37 = (byte *)plVar13[0xe99];
  lVar21 = plVar13[0xe9a];
  uVar28 = plVar13[0xe9b];
  *(undefined4 *)((long)plVar13 + 0x7534) = 1;
  uVar50 = *(ulong *)((long)plVar13 + 0x683c);
  auStack_a0[1] = uVar50 >> 0x20;
  auStack_a0[0] = uVar50 & 0xffffffff;
  auStack_a0[2] = (ulong)*(uint *)((long)plVar13 + 0x6844);
  if (unaff_x21 == (ulong *)0x0) {
    return (byte *)0xffffffffffffffec;
  }
  puVar23 = param_4 + 1;
  puVar34 = unaff_x21 + -1;
  if (unaff_x21 < &MACH_HEADER.cpusubtype) {
    uStack_f8 = (ulong)(byte)*param_4;
    switch(unaff_x21) {
    case (ulong *)0x7:
      uStack_f8 = uStack_f8 | (ulong)*(byte *)((long)param_4 + 6) << 0x30;
    case (ulong *)0x6:
      uStack_f8 = uStack_f8 + ((ulong)*(byte *)((long)param_4 + 5) << 0x28);
    case (ulong *)0x5:
      uStack_f8 = uStack_f8 + ((ulong)*(byte *)((long)param_4 + 4) << 0x20);
    case (ulong *)0x4:
      uStack_f8 = uStack_f8 + (ulong)*(byte *)((long)param_4 + 3) * 0x1000000;
    case (ulong *)0x3:
      uStack_f8 = uStack_f8 + (ulong)*(byte *)((long)param_4 + 2) * 0x10000;
    case (ulong *)0x2:
      uStack_f8 = uStack_f8 + (ulong)*(byte *)((long)param_4 + 1) * 0x100;
    }
    if (((byte *)((long)unaff_x21 + (long)param_4))[-1] == 0) {
      return (byte *)0xffffffffffffffec;
    }
    puVar34 = (ulong *)0x0;
    iVar25 = (int)LZCOUNT((uint)((byte *)((long)unaff_x21 + (long)param_4))[-1]) +
             (int)unaff_x21 * -8 + 0x29;
    puStack_e8 = param_4;
  }
  else {
    uStack_f8 = *(ulong *)((long)param_4 + (long)puVar34);
    if (uStack_f8 >> 0x38 == 0) {
      return (byte *)0xffffffffffffffec;
    }
    if ((ulong *)0xffffffffffffff88 < unaff_x21) {
      return (byte *)0xffffffffffffffec;
    }
    iVar25 = (int)LZCOUNT((uint)(byte)(uStack_f8 >> 0x38)) + -0x17;
    puStack_e8 = (ulong *)((long)param_4 + (long)puVar34);
  }
  uVar1 = *(uint *)(*plVar13 + 4);
  uStack_f0 = uVar1 + iVar25;
  uStack_d0 = uStack_f8 >> ((ulong)-uStack_f0 & 0x3f) &
              (ulong)*(uint *)(&UNK_00814304 + (ulong)uVar1 * 4);
  if (uStack_f0 < 0x41) {
    if ((long)puVar34 < 8) {
      puVar26 = param_4;
      if (puVar34 == (ulong *)0x0) goto LAB_00154138;
      uVar1 = (uint)puVar34;
      if (param_4 <= (byte *)((long)param_4 + (long)puVar34) + -(ulong)(uStack_f0 >> 3)) {
        uVar1 = uStack_f0 >> 3;
      }
      uStack_f0 = uStack_f0 + uVar1 * -8;
    }
    else {
      uVar1 = uStack_f0 >> 3;
      uStack_f0 = uStack_f0 & 7;
    }
    puStack_e8 = (ulong *)((byte *)((long)param_4 + (long)puVar34) + -(ulong)uVar1);
    uStack_f8 = *puStack_e8;
    puVar26 = puStack_e8;
  }
  else {
    puVar26 = (ulong *)&UNK_00814388;
    puStack_e8 = (ulong *)&UNK_00814388;
  }
LAB_00154138:
  lVar38 = *plVar13 + 8;
  uVar1 = *(uint *)(plVar13[2] + 4);
  uStack_f0 = uVar1 + uStack_f0;
  uStack_c0 = uStack_f8 >> ((ulong)-uStack_f0 & 0x3f) &
              (ulong)*(uint *)(&UNK_00814304 + (ulong)uVar1 * 4);
  iVar25 = (int)param_4;
  if (uStack_f0 < 0x41) {
    if (puVar26 < puVar23) {
      puVar34 = param_4;
      if (puVar26 == param_4) goto LAB_001541c4;
      uVar1 = (int)puVar26 - iVar25;
      if (param_4 <= (ulong *)((long)puVar26 - (ulong)(uStack_f0 >> 3))) {
        uVar1 = uStack_f0 >> 3;
      }
      puVar34 = (ulong *)((long)puVar26 - (ulong)uVar1);
      uStack_f8 = *puVar34;
      uStack_f0 = uStack_f0 + uVar1 * -8;
    }
    else {
      puVar34 = (ulong *)((long)puVar26 - (ulong)(uStack_f0 >> 3));
      uStack_f8 = *puVar34;
      uStack_f0 = uStack_f0 & 7;
    }
    puStack_e8 = puVar34;
  }
  else {
    puVar34 = (ulong *)&UNK_00814388;
    puStack_e8 = (ulong *)&UNK_00814388;
  }
LAB_001541c4:
  pbVar45 = (byte *)((long)plVar13 + 0x76a4);
  lVar2 = plVar13[2] + 8;
  uVar1 = *(uint *)(plVar13[1] + 4);
  uStack_f0 = uVar1 + uStack_f0;
  uStack_b0 = uStack_f8 >> ((ulong)-uStack_f0 & 0x3f) &
              (ulong)*(uint *)(&UNK_00814304 + (ulong)uVar1 * 4);
  if (uStack_f0 < 0x41) {
    if (puVar34 < puVar23) {
      if (puVar34 != param_4) {
        uVar1 = (int)puVar34 - iVar25;
        if (param_4 <= (ulong *)((long)puVar34 - (ulong)(uStack_f0 >> 3))) {
          uVar1 = uStack_f0 >> 3;
        }
        puStack_e8 = (ulong *)((long)puVar34 - (ulong)uVar1);
        uStack_f0 = uStack_f0 + uVar1 * -8;
        uStack_f8 = *puStack_e8;
      }
    }
    else {
      puStack_e8 = (ulong *)((long)puVar34 - (ulong)(uStack_f0 >> 3));
      uStack_f0 = uStack_f0 & 7;
      uStack_f8 = *puStack_e8;
    }
  }
  else {
    puStack_e8 = (ulong *)&UNK_00814388;
  }
  lVar3 = plVar13[1] + 8;
  do {
    puVar4 = (ushort *)(lVar38 + uStack_d0 * 8);
    puVar5 = (ushort *)(lVar3 + uStack_b0 * 8);
    puVar6 = (ushort *)(lVar2 + uStack_c0 * 8);
    uVar49 = (ulong)*(uint *)(puVar5 + 2);
    uVar50 = (ulong)*(uint *)(puVar4 + 2);
    uVar1 = *(uint *)(puVar6 + 2);
    bVar7 = (byte)puVar4[1];
    bVar8 = (byte)puVar5[1];
    bVar9 = (byte)puVar6[1];
    uVar36 = (uint)bVar9;
    puVar34 = auStack_a0;
    if (bVar9 < 2) {
      bVar11 = *(uint *)(puVar4 + 2) == 0;
      if (bVar9 != 0) {
        if (bVar11) {
          uVar1 = uVar1 + 1;
        }
        uVar17 = (ulong)uStack_f0;
        uStack_f0 = uStack_f0 + 1;
        lVar40 = (ulong)uVar1 - ((long)(uStack_f8 << (uVar17 & 0x3f)) >> 0x3f);
        if (lVar40 == 3) {
          uVar17 = (auStack_a0[0] - 1) - (ulong)(auStack_a0[0] - 1 == 0);
        }
        else {
          uVar17 = auStack_a0[lVar40] - (ulong)(auStack_a0[lVar40] == 0);
          if (lVar40 == 1) goto LAB_00154320;
        }
        goto code_r0x001542f4;
      }
      uVar17 = auStack_a0[bVar11];
      puVar34 = auStack_a0 + !bVar11;
    }
    else {
      uVar17 = (ulong)uStack_f0;
      uStack_f0 = uStack_f0 + uVar36;
      uVar17 = ((uStack_f8 << (uVar17 & 0x3f)) >> ((ulong)-uVar36 & 0x3f)) + (ulong)uVar1;
code_r0x001542f4:
      auStack_a0[2] = auStack_a0[1];
    }
LAB_00154320:
    auStack_a0[0] = uVar17;
    auStack_a0[1] = *puVar34;
    if (bVar8 != 0) {
      uVar16 = (ulong)uStack_f0;
      uStack_f0 = uStack_f0 + bVar8;
      uVar49 = ((uStack_f8 << (uVar16 & 0x3f)) >> ((ulong)-(uint)bVar8 & 0x3f)) + uVar49;
    }
    if (0x1e < ((uint)bVar8 + (uint)bVar7 + uVar36 & 0xff)) {
      if (uStack_f0 < 0x41) {
        if (puStack_e8 < puVar23) {
          if (puStack_e8 == param_4) goto code_r0x00154360;
          uVar1 = (int)puStack_e8 - iVar25;
          if (param_4 <= (ulong *)((long)puStack_e8 - (ulong)(uStack_f0 >> 3))) {
            uVar1 = uStack_f0 >> 3;
          }
          uStack_f0 = uStack_f0 + uVar1 * -8;
        }
        else {
          uVar1 = uStack_f0 >> 3;
          uStack_f0 = uStack_f0 & 7;
        }
        puStack_e8 = (ulong *)((long)puStack_e8 - (ulong)uVar1);
        uStack_f8 = *puStack_e8;
      }
      else {
        puStack_e8 = (ulong *)&UNK_00814388;
      }
    }
code_r0x00154360:
    if (bVar7 != 0) {
      uVar16 = (ulong)uStack_f0;
      uStack_f0 = uStack_f0 + bVar7;
      uVar50 = ((uStack_f8 << (uVar16 & 0x3f)) >> ((ulong)-(uint)bVar7 & 0x3f)) + uVar50;
    }
    iVar48 = (int)puVar19;
    iVar46 = iVar48 + -1;
    if (iVar46 != 0) {
      iVar10 = uStack_f0 + *(byte *)((long)puVar4 + 3);
      uStack_d0 = (uStack_f8 >> ((ulong)(uint)-iVar10 & 0x3f) &
                  (ulong)*(uint *)(&UNK_00814304 + (ulong)(uint)*(byte *)((long)puVar4 + 3) * 4)) +
                  (ulong)*puVar4;
      iVar10 = iVar10 + (uint)*(byte *)((long)puVar5 + 3);
      uStack_b0 = (uStack_f8 >> ((ulong)(uint)-iVar10 & 0x3f) &
                  (ulong)*(uint *)(&UNK_00814304 + (ulong)(uint)*(byte *)((long)puVar5 + 3) * 4)) +
                  (ulong)*puVar5;
      uStack_f0 = iVar10 + (uint)*(byte *)((long)puVar6 + 3);
      uStack_c0 = (uStack_f8 >> ((ulong)-uStack_f0 & 0x3f) &
                  (ulong)*(uint *)(&UNK_00814304 + (ulong)(uint)*(byte *)((long)puVar6 + 3) * 4)) +
                  (ulong)*puVar6;
      if (uStack_f0 < 0x41) {
        if (puStack_e8 < puVar23) {
          if (puStack_e8 != param_4) {
            uVar1 = (int)puStack_e8 - iVar25;
            if (param_4 <= (ulong *)((long)puStack_e8 - (ulong)(uStack_f0 >> 3))) {
              uVar1 = uStack_f0 >> 3;
            }
            uStack_f0 = uStack_f0 + uVar1 * -8;
            goto code_r0x00154464;
          }
        }
        else {
          uVar1 = uStack_f0 >> 3;
          uStack_f0 = uStack_f0 & 7;
code_r0x00154464:
          puStack_e8 = (ulong *)((long)puStack_e8 - (ulong)uVar1);
          uStack_f8 = *puStack_e8;
        }
        pbVar29 = (byte *)plVar13[0xed3];
        if (pbStack_88 + uVar50 <= pbVar29) goto code_r0x00154484;
      }
      else {
        puStack_e8 = (ulong *)&UNK_00814388;
        pbVar29 = (byte *)plVar13[0xed3];
        if (pbStack_88 + uVar50 <= pbVar29) goto code_r0x00154484;
      }
      if (iVar48 < 1) {
        return (byte *)0xffffffffffffffec;
      }
code_r0x001547d8:
      uVar16 = (long)pbVar29 - (long)pbStack_88;
      if (uVar16 == 0) goto code_r0x00154a08;
      if ((ulong)((long)pbVar12 - (long)pbVar42) < uVar16) {
        return (byte *)0xffffffffffffffba;
      }
      uVar33 = (long)pbVar42 - (long)pbStack_88;
      pbVar32 = pbVar42 + uVar16;
      if (((long)uVar33 < -7) && (7 < uVar16)) {
        if (uVar33 < 0xfffffffffffffff0) {
          pbVar29 = pbVar32 + -0x20;
          if (pbVar42 <= pbVar29) {
            uVar51 = *(undefined8 *)pbStack_88;
            *(undefined8 *)(pbVar42 + 8) = *(undefined8 *)(pbStack_88 + 8);
            *(undefined8 *)pbVar42 = uVar51;
            if (0x10 < (ulong)((long)pbVar29 - (long)pbVar42)) {
              pbVar22 = pbVar42 + 0x10;
              pbVar14 = pbStack_88;
              do {
                uVar51 = *(undefined8 *)(pbVar14 + 0x10);
                *(undefined8 *)(pbVar22 + 8) = *(undefined8 *)(pbVar14 + 0x18);
                *(undefined8 *)pbVar22 = uVar51;
                uVar51 = *(undefined8 *)(pbVar14 + 0x20);
                *(undefined8 *)(pbVar22 + 0x18) = *(undefined8 *)(pbVar14 + 0x28);
                *(undefined8 *)(pbVar22 + 0x10) = uVar51;
                pbVar22 = pbVar22 + 0x20;
                pbVar14 = pbVar14 + 0x20;
              } while (pbVar22 < pbVar29);
            }
            pbStack_88 = pbStack_88 + ((long)pbVar29 - (long)pbVar42);
code_r0x001548ac:
            pbVar42 = pbVar42 + (uVar16 - (long)pbVar29);
            if ((pbVar42 < (byte *)0x8) || ((ulong)((long)pbVar29 - (long)pbStack_88) < 0x40)) {
              pbVar22 = pbVar29;
            }
            else {
              if (pbVar42 < (byte *)0x40) {
                pbVar39 = (byte *)0x0;
              }
              else {
                pbVar39 = (byte *)((ulong)pbVar42 & 0xffffffffffffffc0);
                pbVar14 = pbVar29 + 0x20;
                pbVar43 = pbStack_88 + 0x20;
                pbVar22 = pbVar39;
                do {
                  uVar51 = *(undefined8 *)(pbVar43 + -0x20);
                  uVar53 = *(undefined8 *)(pbVar43 + -8);
                  uVar52 = *(undefined8 *)(pbVar43 + -0x10);
                  uVar56 = *(undefined8 *)(pbVar43 + 8);
                  uVar54 = *(undefined8 *)pbVar43;
                  uVar60 = *(undefined8 *)(pbVar43 + 0x18);
                  uVar58 = *(undefined8 *)(pbVar43 + 0x10);
                  *(undefined8 *)(pbVar14 + -0x18) = *(undefined8 *)(pbVar43 + -0x18);
                  *(undefined8 *)(pbVar14 + -0x20) = uVar51;
                  *(undefined8 *)(pbVar14 + -8) = uVar53;
                  *(undefined8 *)(pbVar14 + -0x10) = uVar52;
                  *(undefined8 *)(pbVar14 + 8) = uVar56;
                  *(undefined8 *)pbVar14 = uVar54;
                  *(undefined8 *)(pbVar14 + 0x18) = uVar60;
                  *(undefined8 *)(pbVar14 + 0x10) = uVar58;
                  pbVar22 = pbVar22 + -0x40;
                  pbVar14 = pbVar14 + 0x40;
                  pbVar43 = pbVar43 + 0x40;
                } while (pbVar22 != (byte *)0x0);
                if (pbVar42 == pbVar39) goto code_r0x00154a00;
                if (((ulong)pbVar42 & 0x38) == 0) {
                  pbStack_88 = pbStack_88 + (long)pbVar39;
                  pbVar22 = pbVar29 + (long)pbVar39;
                  goto code_r0x001549d0;
                }
              }
              pbVar43 = (byte *)((ulong)pbVar42 & 0xfffffffffffffff8);
              lVar40 = (long)pbVar39 - (long)pbVar43;
              pbVar22 = pbVar29 + (long)pbVar39;
              pbVar14 = pbStack_88 + (long)pbVar39;
              do {
                *(undefined8 *)pbVar22 = *(undefined8 *)pbVar14;
                lVar40 = lVar40 + 8;
                pbVar22 = pbVar22 + 8;
                pbVar14 = pbVar14 + 8;
              } while (lVar40 != 0);
              pbVar22 = pbVar29 + (long)pbVar43;
              pbStack_88 = pbStack_88 + (long)pbVar43;
              if (pbVar42 == pbVar43) goto code_r0x00154a00;
            }
code_r0x001549d0:
            do {
              pbVar14 = pbVar22 + 1;
              *pbVar22 = *pbStack_88;
              pbVar22 = pbVar14;
              pbStack_88 = pbStack_88 + 1;
            } while (pbVar14 != pbVar29 + (long)pbVar42);
            goto code_r0x00154a00;
          }
        }
        pbVar29 = pbVar42;
        if (0 < (long)uVar16) goto code_r0x001548ac;
        goto code_r0x00154a00;
      }
      if ((long)uVar16 < 1) goto code_r0x00154a00;
      pbVar29 = pbVar42 + (long)pbVar29 + -(long)pbStack_88;
      if (pbVar29 <= pbVar42 + 1) {
        pbVar29 = pbVar42 + 1;
      }
      uVar30 = (long)pbVar29 - (long)pbVar42;
      if ((uVar30 < 8) || (uVar33 < 0x40)) goto code_r0x001549f0;
      if (uVar30 < 0x40) {
        uVar33 = 0;
        goto code_r0x00154994;
      }
      uVar33 = uVar30 & 0xffffffffffffffc0;
      pbVar29 = pbVar42 + 0x20;
      pbVar22 = pbStack_88 + 0x20;
      uVar41 = uVar33;
      do {
        uVar51 = *(undefined8 *)(pbVar22 + -0x20);
        uVar53 = *(undefined8 *)(pbVar22 + -8);
        uVar52 = *(undefined8 *)(pbVar22 + -0x10);
        uVar56 = *(undefined8 *)(pbVar22 + 8);
        uVar54 = *(undefined8 *)pbVar22;
        uVar60 = *(undefined8 *)(pbVar22 + 0x18);
        uVar58 = *(undefined8 *)(pbVar22 + 0x10);
        *(undefined8 *)(pbVar29 + -0x18) = *(undefined8 *)(pbVar22 + -0x18);
        *(undefined8 *)(pbVar29 + -0x20) = uVar51;
        *(undefined8 *)(pbVar29 + -8) = uVar53;
        *(undefined8 *)(pbVar29 + -0x10) = uVar52;
        *(undefined8 *)(pbVar29 + 8) = uVar56;
        *(undefined8 *)pbVar29 = uVar54;
        *(undefined8 *)(pbVar29 + 0x18) = uVar60;
        *(undefined8 *)(pbVar29 + 0x10) = uVar58;
        uVar41 = uVar41 - 0x40;
        pbVar29 = pbVar29 + 0x40;
        pbVar22 = pbVar22 + 0x40;
      } while (uVar41 != 0);
      if (uVar30 != uVar33) {
        if ((uVar30 & 0x38) == 0) {
          pbStack_88 = pbStack_88 + uVar33;
          pbVar42 = pbVar42 + uVar33;
        }
        else {
code_r0x00154994:
          uVar41 = uVar30 & 0xfffffffffffffff8;
          lVar40 = uVar33 - uVar41;
          pbVar29 = pbStack_88 + uVar33;
          pbVar22 = pbVar42 + uVar33;
          do {
            *(undefined8 *)pbVar22 = *(undefined8 *)pbVar29;
            lVar40 = lVar40 + 8;
            pbVar29 = pbVar29 + 8;
            pbVar22 = pbVar22 + 8;
          } while (lVar40 != 0);
          pbVar42 = pbVar42 + uVar41;
          pbStack_88 = pbStack_88 + uVar41;
          if (uVar30 == uVar41) goto code_r0x00154a00;
        }
code_r0x001549f0:
        do {
          pbVar29 = pbVar42 + 1;
          *pbVar42 = *pbStack_88;
          pbVar42 = pbVar29;
          pbStack_88 = pbStack_88 + 1;
        } while (pbVar29 < pbVar32);
      }
code_r0x00154a00:
      uVar50 = uVar50 - uVar16;
      pbVar42 = pbVar32;
code_r0x00154a08:
      pbVar32 = (byte *)((long)plVar13 + 0x176a4);
      *(undefined4 *)(plVar13 + 0xed4) = 0;
      pbVar29 = pbVar42 + uVar50;
      pbVar22 = pbVar29 + -uVar17;
      Hint_Prefetch(pbVar22,0,0,0);
      if ((pbVar32 < pbVar45 + uVar50) ||
         (pbVar14 = (byte *)(uVar50 + uVar49), pbVar12 + -0x20 < pbVar42 + (long)pbVar14)) {
        pbStack_88 = pbVar45;
        uStack_80 = uVar50;
        uStack_78 = uVar49;
        uStack_70 = uVar17;
        pbVar14 = (byte *)func_0x00155c78(pbVar42,pbVar12,&uStack_80,&pbStack_88,pbVar32,pbVar37,
                                          lVar21,uVar28);
      }
      else {
        uVar51 = *(undefined8 *)pbVar45;
        *(undefined8 *)(pbVar42 + 8) = *(undefined8 *)((long)plVar13 + 0x76ac);
        *(undefined8 *)pbVar42 = uVar51;
        if (0x10 < uVar50) {
          uVar51 = *(undefined8 *)((long)plVar13 + 0x76b4);
          *(undefined8 *)(pbVar42 + 0x18) = *(undefined8 *)((long)plVar13 + 0x76bc);
          *(undefined8 *)(pbVar42 + 0x10) = uVar51;
          if (0x10 < uVar50 - 0x10) {
            pbVar43 = pbVar42 + 0x20;
            puVar27 = (undefined8 *)((long)plVar13 + 0x76d4);
            do {
              uVar51 = puVar27[-2];
              *(undefined8 *)(pbVar43 + 8) = puVar27[-1];
              *(undefined8 *)pbVar43 = uVar51;
              uVar51 = *puVar27;
              *(undefined8 *)(pbVar43 + 0x18) = puVar27[1];
              *(undefined8 *)(pbVar43 + 0x10) = uVar51;
              pbVar43 = pbVar43 + 0x20;
              puVar27 = puVar27 + 4;
            } while (pbVar43 < pbVar29);
          }
        }
        pbStack_88 = pbVar45 + uVar50;
        if ((ulong)((long)pbVar29 - (long)pbVar37) < uVar17) {
          if ((ulong)((long)pbVar29 - lVar21) < uVar17) {
            return (byte *)0xffffffffffffffec;
          }
          lVar44 = (long)pbVar22 - (long)pbVar37;
          lVar40 = uVar28 + lVar44;
          if (lVar40 + uVar49 <= uVar28) {
            _memmove(pbVar29,lVar40,uVar49);
            goto joined_r0x00154b24;
          }
          _memmove(pbVar29,lVar40,-lVar44);
          pbVar29 = pbVar29 + -lVar44;
          uVar49 = lVar44 + uVar49;
          pbVar22 = pbVar37;
        }
        if (uVar17 < 0x10) {
          if (uVar17 < 8) {
            iVar10 = *(int *)(&UNK_008143b0 + uVar17 * 4);
            *pbVar29 = *pbVar22;
            pbVar29[1] = pbVar22[1];
            pbVar29[2] = pbVar22[2];
            pbVar29[3] = pbVar22[3];
            pbVar45 = pbVar22 + *(uint *)(&UNK_00814390 + uVar17 * 4);
            pbVar22 = pbVar45 + -(long)iVar10;
            *(undefined4 *)(pbVar29 + 4) = *(undefined4 *)pbVar45;
          }
          else {
            *(undefined8 *)pbVar29 = *(undefined8 *)pbVar22;
          }
          if (8 < uVar49) {
            pbVar45 = pbVar22 + 8;
            pbVar43 = pbVar29 + 8;
            if ((long)pbVar43 - (long)pbVar45 < 0x10) {
              do {
                pbVar22 = pbVar43 + 8;
                *(undefined8 *)pbVar43 = *(undefined8 *)pbVar45;
                pbVar45 = pbVar45 + 8;
                pbVar43 = pbVar22;
              } while (pbVar22 < pbVar29 + uVar49);
            }
            else {
              uVar51 = *(undefined8 *)pbVar45;
              *(undefined8 *)(pbVar29 + 0x10) = *(undefined8 *)(pbVar22 + 0x10);
              *(undefined8 *)pbVar43 = uVar51;
              if (0x10 < uVar49 - 8) {
                pbVar45 = pbVar29 + 0x18;
                pbVar22 = pbVar22 + 0x28;
                do {
                  uVar51 = *(undefined8 *)(pbVar22 + -0x10);
                  *(undefined8 *)(pbVar45 + 8) = *(undefined8 *)(pbVar22 + -8);
                  *(undefined8 *)pbVar45 = uVar51;
                  uVar51 = *(undefined8 *)pbVar22;
                  *(undefined8 *)(pbVar45 + 0x18) = *(undefined8 *)(pbVar22 + 8);
                  *(undefined8 *)(pbVar45 + 0x10) = uVar51;
                  pbVar45 = pbVar45 + 0x20;
                  pbVar22 = pbVar22 + 0x20;
                } while (pbVar45 < pbVar29 + uVar49);
              }
            }
          }
        }
        else {
          uVar51 = *(undefined8 *)pbVar22;
          *(undefined8 *)(pbVar29 + 8) = *(undefined8 *)(pbVar22 + 8);
          *(undefined8 *)pbVar29 = uVar51;
          if (0x10 < uVar49) {
            pbVar45 = pbVar29 + 0x10;
            do {
              uVar51 = *(undefined8 *)(pbVar22 + 0x10);
              *(undefined8 *)(pbVar45 + 8) = *(undefined8 *)(pbVar22 + 0x18);
              *(undefined8 *)pbVar45 = uVar51;
              uVar51 = *(undefined8 *)(pbVar22 + 0x20);
              *(undefined8 *)(pbVar45 + 0x18) = *(undefined8 *)(pbVar22 + 0x28);
              *(undefined8 *)(pbVar45 + 0x10) = uVar51;
              pbVar45 = pbVar45 + 0x20;
              pbVar22 = pbVar22 + 0x20;
            } while (pbVar45 < pbVar29 + uVar49);
          }
        }
      }
joined_r0x00154b24:
      if ((byte *)0xffffffffffffff88 < pbVar14) {
        return pbVar14;
      }
      pbVar42 = pbVar42 + (long)pbVar14;
      if (iVar48 < 2) {
        if (iVar46 != 0) {
          return (byte *)0xffffffffffffffec;
        }
      }
      else {
        do {
          puVar4 = (ushort *)(lVar38 + uStack_d0 * 8);
          puVar5 = (ushort *)(lVar3 + uStack_b0 * 8);
          puVar6 = (ushort *)(lVar2 + uStack_c0 * 8);
          uVar49 = (ulong)*(uint *)(puVar5 + 2);
          uVar50 = (ulong)*(uint *)(puVar4 + 2);
          uVar1 = *(uint *)(puVar6 + 2);
          bVar7 = (byte)puVar4[1];
          bVar8 = (byte)puVar5[1];
          bVar9 = (byte)puVar6[1];
          uVar36 = (uint)bVar9;
          puVar19 = auStack_a0;
          if (bVar9 < 2) {
            bVar11 = *(uint *)(puVar4 + 2) == 0;
            if (bVar9 != 0) {
              if (bVar11) {
                uVar1 = uVar1 + 1;
              }
              uVar17 = (ulong)uStack_f0;
              uStack_f0 = uStack_f0 + 1;
              lVar40 = (ulong)uVar1 - ((long)(uStack_f8 << (uVar17 & 0x3f)) >> 0x3f);
              if (lVar40 == 3) {
                uVar17 = (auStack_a0[0] - 1) - (ulong)(auStack_a0[0] - 1 == 0);
              }
              else {
                uVar17 = auStack_a0[lVar40] - (ulong)(auStack_a0[lVar40] == 0);
                if (lVar40 == 1) goto LAB_00154bdc;
              }
              goto code_r0x00154bb0;
            }
            uVar17 = auStack_a0[bVar11];
            puVar19 = auStack_a0 + !bVar11;
          }
          else {
            uVar17 = (ulong)uStack_f0;
            uStack_f0 = uStack_f0 + uVar36;
            uVar17 = ((uStack_f8 << (uVar17 & 0x3f)) >> ((ulong)-uVar36 & 0x3f)) + (ulong)uVar1;
code_r0x00154bb0:
            auStack_a0[2] = auStack_a0[1];
          }
LAB_00154bdc:
          auStack_a0[0] = uVar17;
          auStack_a0[1] = *puVar19;
          if (bVar8 != 0) {
            uVar16 = (ulong)uStack_f0;
            uStack_f0 = uStack_f0 + bVar8;
            uVar49 = ((uStack_f8 << (uVar16 & 0x3f)) >> ((ulong)-(uint)bVar8 & 0x3f)) + uVar49;
          }
          if (0x1e < ((uint)bVar8 + (uint)bVar7 + uVar36 & 0xff)) {
            if (uStack_f0 < 0x41) {
              if (puStack_e8 < puVar23) {
                if (puStack_e8 != param_4) {
                  uVar1 = (int)puStack_e8 - iVar25;
                  if (param_4 <= (ulong *)((long)puStack_e8 - (ulong)(uStack_f0 >> 3))) {
                    uVar1 = uStack_f0 >> 3;
                  }
                  puStack_e8 = (ulong *)((long)puStack_e8 - (ulong)uVar1);
                  uStack_f0 = uStack_f0 + uVar1 * -8;
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
          if (bVar7 != 0) {
            uVar16 = (ulong)uStack_f0;
            uStack_f0 = uStack_f0 + bVar7;
            uVar50 = ((uStack_f8 << (uVar16 & 0x3f)) >> ((ulong)-(uint)bVar7 & 0x3f)) + uVar50;
          }
          if (iVar46 != 1) {
            iVar48 = uStack_f0 + *(byte *)((long)puVar4 + 3);
            uStack_d0 = (uStack_f8 >> ((ulong)(uint)-iVar48 & 0x3f) &
                        (ulong)*(uint *)(&UNK_00814304 +
                                        (ulong)(uint)*(byte *)((long)puVar4 + 3) * 4)) +
                        (ulong)*puVar4;
            iVar48 = iVar48 + (uint)*(byte *)((long)puVar5 + 3);
            uStack_b0 = (uStack_f8 >> ((ulong)(uint)-iVar48 & 0x3f) &
                        (ulong)*(uint *)(&UNK_00814304 +
                                        (ulong)(uint)*(byte *)((long)puVar5 + 3) * 4)) +
                        (ulong)*puVar5;
            uStack_f0 = iVar48 + (uint)*(byte *)((long)puVar6 + 3);
            uStack_c0 = (uStack_f8 >> ((ulong)-uStack_f0 & 0x3f) &
                        (ulong)*(uint *)(&UNK_00814304 +
                                        (ulong)(uint)*(byte *)((long)puVar6 + 3) * 4)) +
                        (ulong)*puVar6;
            if (uStack_f0 < 0x41) {
              if (puStack_e8 < puVar23) {
                if (puStack_e8 == param_4) goto LAB_00154d14;
                uVar1 = (int)puStack_e8 - iVar25;
                if (param_4 <= (ulong *)((long)puStack_e8 - (ulong)(uStack_f0 >> 3))) {
                  uVar1 = uStack_f0 >> 3;
                }
                uStack_f0 = uStack_f0 + uVar1 * -8;
              }
              else {
                uVar1 = uStack_f0 >> 3;
                uStack_f0 = uStack_f0 & 7;
              }
              puStack_e8 = (ulong *)((long)puStack_e8 - (ulong)uVar1);
              uStack_f8 = *puStack_e8;
            }
            else {
              puStack_e8 = (ulong *)&UNK_00814388;
            }
          }
LAB_00154d14:
          pbVar45 = pbVar42 + uVar50;
          pbVar29 = pbVar45 + -uVar17;
          Hint_Prefetch(pbVar29,0,0,0);
          if ((pbVar32 < pbStack_88 + uVar50) ||
             (pbVar22 = (byte *)(uVar50 + uVar49), pbVar12 + -0x20 < pbVar42 + (long)pbVar22)) {
            uStack_80 = uVar50;
            uStack_78 = uVar49;
            uStack_70 = uVar17;
            pbVar22 = (byte *)func_0x00155c78(pbVar42,pbVar12,&uStack_80,&pbStack_88,pbVar32,pbVar37
                                              ,lVar21,uVar28);
          }
          else {
            uVar51 = *(undefined8 *)pbStack_88;
            *(undefined8 *)(pbVar42 + 8) = *(undefined8 *)(pbStack_88 + 8);
            *(undefined8 *)pbVar42 = uVar51;
            if (0x10 < uVar50) {
              uVar51 = *(undefined8 *)(pbStack_88 + 0x10);
              *(undefined8 *)(pbVar42 + 0x18) = *(undefined8 *)(pbStack_88 + 0x18);
              *(undefined8 *)(pbVar42 + 0x10) = uVar51;
              if (0x10 < uVar50 - 0x10) {
                pbVar14 = pbVar42 + 0x20;
                pbVar43 = pbStack_88 + 0x30;
                do {
                  uVar51 = *(undefined8 *)(pbVar43 + -0x10);
                  *(undefined8 *)(pbVar14 + 8) = *(undefined8 *)(pbVar43 + -8);
                  *(undefined8 *)pbVar14 = uVar51;
                  uVar51 = *(undefined8 *)pbVar43;
                  *(undefined8 *)(pbVar14 + 0x18) = *(undefined8 *)(pbVar43 + 8);
                  *(undefined8 *)(pbVar14 + 0x10) = uVar51;
                  pbVar14 = pbVar14 + 0x20;
                  pbVar43 = pbVar43 + 0x20;
                } while (pbVar14 < pbVar45);
              }
            }
            pbStack_88 = pbStack_88 + uVar50;
            if ((ulong)((long)pbVar45 - (long)pbVar37) < uVar17) {
              if ((ulong)((long)pbVar45 - lVar21) < uVar17) {
                return (byte *)0xffffffffffffffec;
              }
              lVar44 = (long)pbVar29 - (long)pbVar37;
              lVar40 = uVar28 + lVar44;
              if (lVar40 + uVar49 <= uVar28) {
                _memmove(pbVar45,lVar40,uVar49);
                goto joined_r0x00154e58;
              }
              _memmove(pbVar45,lVar40,-lVar44);
              pbVar45 = pbVar45 + -lVar44;
              uVar49 = lVar44 + uVar49;
              pbVar29 = pbVar37;
            }
            if (uVar17 < 0x10) {
              if (uVar17 < 8) {
                iVar48 = *(int *)(&UNK_008143b0 + uVar17 * 4);
                *pbVar45 = *pbVar29;
                pbVar45[1] = pbVar29[1];
                pbVar45[2] = pbVar29[2];
                pbVar45[3] = pbVar29[3];
                pbVar14 = pbVar29 + *(uint *)(&UNK_00814390 + uVar17 * 4);
                pbVar29 = pbVar14 + -(long)iVar48;
                *(undefined4 *)(pbVar45 + 4) = *(undefined4 *)pbVar14;
              }
              else {
                *(undefined8 *)pbVar45 = *(undefined8 *)pbVar29;
              }
              if (8 < uVar49) {
                pbVar14 = pbVar29 + 8;
                pbVar43 = pbVar45 + 8;
                if ((long)pbVar43 - (long)pbVar14 < 0x10) {
                  do {
                    pbVar29 = pbVar43 + 8;
                    *(undefined8 *)pbVar43 = *(undefined8 *)pbVar14;
                    pbVar14 = pbVar14 + 8;
                    pbVar43 = pbVar29;
                  } while (pbVar29 < pbVar45 + uVar49);
                }
                else {
                  uVar51 = *(undefined8 *)pbVar14;
                  *(undefined8 *)(pbVar45 + 0x10) = *(undefined8 *)(pbVar29 + 0x10);
                  *(undefined8 *)pbVar43 = uVar51;
                  if (0x10 < uVar49 - 8) {
                    pbVar14 = pbVar45 + 0x18;
                    pbVar29 = pbVar29 + 0x28;
                    do {
                      uVar51 = *(undefined8 *)(pbVar29 + -0x10);
                      *(undefined8 *)(pbVar14 + 8) = *(undefined8 *)(pbVar29 + -8);
                      *(undefined8 *)pbVar14 = uVar51;
                      uVar51 = *(undefined8 *)pbVar29;
                      *(undefined8 *)(pbVar14 + 0x18) = *(undefined8 *)(pbVar29 + 8);
                      *(undefined8 *)(pbVar14 + 0x10) = uVar51;
                      pbVar14 = pbVar14 + 0x20;
                      pbVar29 = pbVar29 + 0x20;
                    } while (pbVar14 < pbVar45 + uVar49);
                  }
                }
              }
            }
            else {
              uVar51 = *(undefined8 *)pbVar29;
              *(undefined8 *)(pbVar45 + 8) = *(undefined8 *)(pbVar29 + 8);
              *(undefined8 *)pbVar45 = uVar51;
              if (0x10 < uVar49) {
                pbVar14 = pbVar45 + 0x10;
                do {
                  uVar51 = *(undefined8 *)(pbVar29 + 0x10);
                  *(undefined8 *)(pbVar14 + 8) = *(undefined8 *)(pbVar29 + 0x18);
                  *(undefined8 *)pbVar14 = uVar51;
                  uVar51 = *(undefined8 *)(pbVar29 + 0x20);
                  *(undefined8 *)(pbVar14 + 0x18) = *(undefined8 *)(pbVar29 + 0x28);
                  *(undefined8 *)(pbVar14 + 0x10) = uVar51;
                  pbVar14 = pbVar14 + 0x20;
                  pbVar29 = pbVar29 + 0x20;
                } while (pbVar14 < pbVar45 + uVar49);
              }
            }
          }
joined_r0x00154e58:
          if ((byte *)0xffffffffffffff88 < pbVar22) {
            return pbVar22;
          }
          pbVar42 = pbVar42 + (long)pbVar22;
          iVar46 = iVar46 + -1;
        } while (iVar46 != 0);
      }
code_r0x00155070:
      if (puStack_e8 != param_4) {
        return (byte *)0xffffffffffffffec;
      }
      if (uStack_f0 != 0x40) {
        return (byte *)0xffffffffffffffec;
      }
      *(ulong *)((long)plVar13 + 0x683c) = CONCAT44((int)auStack_a0[1],(int)auStack_a0[0]);
      *(int *)((long)plVar13 + 0x6844) = (int)auStack_a0[2];
      iVar25 = (int)plVar13[0xed4];
      pbVar37 = pbStack_88;
      goto joined_r0x001550b0;
    }
    pbVar29 = (byte *)plVar13[0xed3];
    if (pbVar29 < pbStack_88 + uVar50) goto code_r0x001547d8;
code_r0x00154484:
    pbVar29 = pbStack_88 + uVar50;
    if ((pbVar32 < pbVar29) ||
       (pbVar22 = (byte *)(uVar50 + uVar49), pbVar29 + -0x20 < pbVar42 + (long)pbVar22)) {
      uStack_80 = uVar50;
      uStack_78 = uVar49;
      uStack_70 = uVar17;
      pbVar22 = (byte *)func_0x00156308(pbVar42,pbVar12,pbVar29 + -0x20,&uStack_80,&pbStack_88,
                                        pbVar32,pbVar37,lVar21,uVar28);
    }
    else {
      pbVar14 = pbVar42 + uVar50;
      uVar51 = *(undefined8 *)pbStack_88;
      *(undefined8 *)(pbVar42 + 8) = *(undefined8 *)(pbStack_88 + 8);
      *(undefined8 *)pbVar42 = uVar51;
      if (0x10 < uVar50) {
        uVar51 = *(undefined8 *)(pbStack_88 + 0x10);
        *(undefined8 *)(pbVar42 + 0x18) = *(undefined8 *)(pbStack_88 + 0x18);
        *(undefined8 *)(pbVar42 + 0x10) = uVar51;
        if (0x10 < uVar50 - 0x10) {
          pbVar43 = pbVar42 + 0x20;
          pbVar39 = pbStack_88 + 0x30;
          do {
            uVar51 = *(undefined8 *)(pbVar39 + -0x10);
            *(undefined8 *)(pbVar43 + 8) = *(undefined8 *)(pbVar39 + -8);
            *(undefined8 *)pbVar43 = uVar51;
            uVar51 = *(undefined8 *)pbVar39;
            *(undefined8 *)(pbVar43 + 0x18) = *(undefined8 *)(pbVar39 + 8);
            *(undefined8 *)(pbVar43 + 0x10) = uVar51;
            pbVar43 = pbVar43 + 0x20;
            pbVar39 = pbVar39 + 0x20;
          } while (pbVar43 < pbVar14);
        }
      }
      pbStack_88 = pbVar29;
      pbVar29 = pbVar14 + -uVar17;
      if ((ulong)((long)pbVar14 - (long)pbVar37) < uVar17) {
        if ((ulong)((long)pbVar14 - lVar21) < uVar17) {
          return (byte *)0xffffffffffffffec;
        }
        lVar44 = (long)(pbVar14 + -uVar17) - (long)pbVar37;
        lVar40 = uVar28 + lVar44;
        if (lVar40 + uVar49 <= uVar28) {
          _memmove(pbVar14,lVar40,uVar49);
          goto LAB_00154570;
        }
        _memmove(pbVar14,lVar40,-lVar44);
        pbVar14 = pbVar14 + -lVar44;
        uVar49 = lVar44 + uVar49;
        pbVar29 = pbVar37;
      }
      if (uVar17 < 0x10) {
        if (uVar17 < 8) {
          iVar46 = *(int *)(&UNK_008143b0 + uVar17 * 4);
          *pbVar14 = *pbVar29;
          pbVar14[1] = pbVar29[1];
          pbVar14[2] = pbVar29[2];
          pbVar14[3] = pbVar29[3];
          pbVar43 = pbVar29 + *(uint *)(&UNK_00814390 + uVar17 * 4);
          pbVar29 = pbVar43 + -(long)iVar46;
          *(undefined4 *)(pbVar14 + 4) = *(undefined4 *)pbVar43;
        }
        else {
          *(undefined8 *)pbVar14 = *(undefined8 *)pbVar29;
        }
        if (8 < uVar49) {
          pbVar43 = pbVar29 + 8;
          pbVar39 = pbVar14 + 8;
          if ((long)pbVar39 - (long)pbVar43 < 0x10) {
            do {
              pbVar29 = pbVar39 + 8;
              *(undefined8 *)pbVar39 = *(undefined8 *)pbVar43;
              pbVar43 = pbVar43 + 8;
              pbVar39 = pbVar29;
            } while (pbVar29 < pbVar14 + uVar49);
          }
          else {
            uVar51 = *(undefined8 *)pbVar43;
            *(undefined8 *)(pbVar14 + 0x10) = *(undefined8 *)(pbVar29 + 0x10);
            *(undefined8 *)pbVar39 = uVar51;
            if (0x10 < uVar49 - 8) {
              pbVar43 = pbVar14 + 0x18;
              pbVar29 = pbVar29 + 0x28;
              do {
                uVar51 = *(undefined8 *)(pbVar29 + -0x10);
                *(undefined8 *)(pbVar43 + 8) = *(undefined8 *)(pbVar29 + -8);
                *(undefined8 *)pbVar43 = uVar51;
                uVar51 = *(undefined8 *)pbVar29;
                *(undefined8 *)(pbVar43 + 0x18) = *(undefined8 *)(pbVar29 + 8);
                *(undefined8 *)(pbVar43 + 0x10) = uVar51;
                pbVar43 = pbVar43 + 0x20;
                pbVar29 = pbVar29 + 0x20;
              } while (pbVar43 < pbVar14 + uVar49);
            }
          }
        }
      }
      else {
        uVar51 = *(undefined8 *)pbVar29;
        *(undefined8 *)(pbVar14 + 8) = *(undefined8 *)(pbVar29 + 8);
        *(undefined8 *)pbVar14 = uVar51;
        if (0x10 < uVar49) {
          pbVar43 = pbVar14 + 0x10;
          do {
            uVar51 = *(undefined8 *)(pbVar29 + 0x10);
            *(undefined8 *)(pbVar43 + 8) = *(undefined8 *)(pbVar29 + 0x18);
            *(undefined8 *)pbVar43 = uVar51;
            uVar51 = *(undefined8 *)(pbVar29 + 0x20);
            *(undefined8 *)(pbVar43 + 0x18) = *(undefined8 *)(pbVar29 + 0x28);
            *(undefined8 *)(pbVar43 + 0x10) = uVar51;
            pbVar43 = pbVar43 + 0x20;
            pbVar29 = pbVar29 + 0x20;
          } while (pbVar43 < pbVar14 + uVar49);
        }
      }
    }
LAB_00154570:
    if ((byte *)0xffffffffffffff88 < pbVar22) {
      return pbVar22;
    }
    pbVar42 = pbVar42 + (long)pbVar22;
    puVar19 = (ulong *)(ulong)(iVar48 - 1U);
    if (iVar48 - 1U == 0) goto code_r0x00155070;
  } while( true );
}

