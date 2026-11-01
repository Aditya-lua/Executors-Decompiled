
/* WARNING: Type propagation algorithm not settling */

byte * FUN_00152878(ulong param_1,undefined8 param_2,undefined8 param_3,ulong *param_4,
                   ulong *param_5,ulong *param_6,ulong *param_7,undefined1 *param_8,ulong param_9,
                   undefined8 param_10,undefined8 param_11,ulong *param_12,undefined8 param_13,
                   byte *param_14,undefined8 param_15,ulong *param_16,undefined1 *param_17,
                   long param_18,byte *param_19,undefined8 param_20,undefined8 *param_21,
                   ulong *param_22,ulong *param_23,long param_24,long param_25,undefined8 param_26,
                   byte *param_27,undefined8 param_28,ulong *param_29,ulong *param_30,
                   ulong *param_31,ulong param_32,uint param_33,ulong *param_34,ulong *param_35,
                   ulong *param_36,long param_37,long param_38,long param_39,long param_40,
                   long param_41,long param_42,ulong *param_43,undefined8 param_44,
                   undefined8 param_45,ulong param_46,ulong param_47,ulong *param_48,ulong *param_49
                   ,undefined1 param_50,undefined1 param_51,undefined1 param_52)

{
  long lVar1;
  long lVar2;
  ushort *puVar3;
  ushort *puVar4;
  ushort *puVar5;
  byte bVar6;
  byte bVar7;
  byte bVar8;
  int iVar9;
  bool bVar10;
  byte *pbVar11;
  long *plVar12;
  byte *pbVar13;
  byte *pbVar14;
  ulong uVar15;
  ulong uVar16;
  ulong *puVar17;
  ulong *puVar18;
  ulong *puVar19;
  ulong *in_x9;
  undefined8 *puVar20;
  byte *pbVar21;
  ulong *in_x10;
  ulong *puVar22;
  ulong *puVar23;
  int iVar24;
  ulong *in_x11;
  ulong *puVar25;
  ulong uVar26;
  ulong in_x12;
  byte *pbVar27;
  byte *pbVar28;
  ulong uVar29;
  ulong *puVar30;
  ulong uVar31;
  uint uVar32;
  byte *pbVar33;
  long lVar34;
  uint uVar35;
  byte *pbVar36;
  long lVar37;
  byte *pbVar38;
  long lVar39;
  ulong uVar40;
  byte *pbVar41;
  uint uVar42;
  byte *unaff_x19;
  ulong *puVar43;
  byte *unaff_x21;
  ulong *unaff_x22;
  long lVar44;
  ulong unaff_x23;
  byte *pbVar45;
  int iVar46;
  undefined1 *unaff_x25;
  ulong *unaff_x26;
  int iVar47;
  ulong *puVar48;
  ulong *unaff_x28;
  ulong uVar49;
  long unaff_x29;
  ulong *unaff_x30;
  ulong uVar50;
  undefined8 uVar51;
  undefined8 uVar52;
  undefined8 uVar53;
  undefined8 uVar54;
  ulong uVar55;
  undefined8 uVar56;
  undefined8 uVar57;
  ulong uVar58;
  ulong uVar59;
  undefined8 uVar60;
  undefined1 auVar61 [16];
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
  ulong uStack_38;
  ulong *puStack_30;
  byte *pbStack_28;
  ulong *puStack_20;
  byte *pbStack_18;
  
  param_46 = (ulong)in_x10;
code_r0x00152878:
  puVar25 = in_x11;
  uVar26 = *(ulong *)param_46;
  unaff_x26[1] = *(ulong *)(param_46 + 8);
  *unaff_x26 = uVar26;
  if (0x10 < in_x12) {
    puVar48 = unaff_x26 + 2;
    puVar43 = (ulong *)param_46;
    do {
      uVar26 = puVar43[2];
      puVar48[1] = puVar43[3];
      *puVar48 = uVar26;
      uVar26 = puVar43[4];
      puVar48[3] = puVar43[5];
      puVar48[2] = uVar26;
      puVar48 = puVar48 + 4;
      puVar43 = puVar43 + 4;
    } while (puVar48 < puVar25);
  }
  param_46 = param_46 + in_x12;
LAB_00152a30:
  pbVar27 = (byte *)((long)unaff_x26 + (param_1 - (long)puVar25));
  if ((pbVar27 < (byte *)0x8) || ((long)puVar25 - param_46 < 0x40)) {
    puVar48 = puVar25;
  }
  else {
    if (pbVar27 < (byte *)0x40) {
      pbVar33 = (byte *)0x0;
    }
    else {
      pbVar33 = (byte *)((ulong)pbVar27 & 0xffffffffffffffc0);
      puVar48 = puVar25 + 4;
      puVar43 = (ulong *)(param_46 + 0x20);
      pbVar11 = pbVar33;
      do {
        uVar26 = puVar43[-4];
        uVar49 = puVar43[-1];
        uVar50 = puVar43[-2];
        uVar15 = puVar43[1];
        uVar16 = *puVar43;
        uVar29 = puVar43[3];
        uVar31 = puVar43[2];
        puVar48[-3] = puVar43[-3];
        puVar48[-4] = uVar26;
        puVar48[-1] = uVar49;
        puVar48[-2] = uVar50;
        puVar48[1] = uVar15;
        *puVar48 = uVar16;
        puVar48[3] = uVar29;
        puVar48[2] = uVar31;
        pbVar11 = pbVar11 + -0x40;
        puVar48 = puVar48 + 8;
        puVar43 = puVar43 + 8;
      } while (pbVar11 != (byte *)0x0);
      if (pbVar27 == pbVar33) goto LAB_00152b84;
      if (((ulong)pbVar27 & 0x38) == 0) {
        param_46 = param_46 + (long)pbVar33;
        puVar48 = (ulong *)((long)puVar25 + (long)pbVar33);
        goto LAB_00152b54;
      }
    }
    pbVar36 = (byte *)((ulong)pbVar27 & 0xfffffffffffffff8);
    lVar34 = (long)pbVar33 - (long)pbVar36;
    pbVar11 = (byte *)(param_46 + (long)pbVar33);
    pbVar33 = (byte *)((long)puVar25 + (long)pbVar33);
    do {
      *(undefined8 *)pbVar33 = *(undefined8 *)pbVar11;
      lVar34 = lVar34 + 8;
      pbVar11 = pbVar11 + 8;
      pbVar33 = pbVar33 + 8;
    } while (lVar34 != 0);
    puVar48 = (ulong *)((long)puVar25 + (long)pbVar36);
    param_46 = (ulong)(param_46 + (long)pbVar36);
    if (pbVar27 == pbVar36) goto LAB_00152b84;
  }
LAB_00152b54:
  do {
    puVar43 = (ulong *)((long)puVar48 + 1);
    *(byte *)puVar48 = (byte)*(ulong *)param_46;
    puVar48 = puVar43;
    param_46 = (ulong)(param_46 + 1);
  } while (puVar43 != (ulong *)((long)puVar25 + (long)pbVar27));
LAB_00152b84:
  uVar26 = *unaff_x28 - param_1;
  *unaff_x28 = uVar26;
  puVar25 = in_x9;
code_r0x00152b94:
  param_46 = (ulong)param_5;
  pbVar27 = (byte *)((long)unaff_x22 + 0xe64);
  pbVar27[0] = 0;
  pbVar27[1] = 0;
  pbVar27[2] = 0;
  pbVar27[3] = 0;
  puVar43 = (ulong *)unaff_x28[1];
  puVar22 = (ulong *)unaff_x28[2];
  puVar48 = (ulong *)((long)puVar25 + uVar26);
  puVar17 = (ulong *)((long)puVar48 - (long)puVar22);
  Hint_Prefetch(puVar17,0,0,0);
  pbVar27 = (byte *)((long)puVar43 + uVar26);
  if (param_16 < (ulong *)((long)param_5 + uVar26) ||
      param_27 < (byte *)((long)puVar25 + (long)pbVar27)) {
    param_5 = &param_46;
    param_47 = uVar26;
    param_48 = puVar43;
    param_49 = puVar22;
    pbVar27 = (byte *)func_0x00155c78(puVar25,param_25,&param_47,param_5,param_16,unaff_x30,param_24
                                      ,param_31);
    param_8 = &param_50;
    param_7 = (ulong *)(ulong)param_20._4_4_;
    puVar43 = param_6;
  }
  else {
    uVar50 = *param_5;
    puVar25[1] = param_5[1];
    *puVar25 = uVar50;
    if (0x10 < uVar26) {
      uVar50 = param_5[2];
      puVar25[3] = param_5[3];
      puVar25[2] = uVar50;
      if (0x10 < uVar26 - 0x10) {
        puVar18 = puVar25 + 4;
        puVar30 = param_12;
        do {
          uVar50 = puVar30[-2];
          puVar18[1] = puVar30[-1];
          *puVar18 = uVar50;
          uVar50 = *puVar30;
          puVar18[3] = puVar30[1];
          puVar18[2] = uVar50;
          puVar18 = puVar18 + 4;
          puVar30 = puVar30 + 4;
        } while (puVar18 < puVar48);
      }
    }
    param_46 = (long)param_5 + uVar26;
    if ((ulong *)((long)puVar48 - (long)unaff_x30) < puVar22) {
      if ((ulong *)((long)puVar48 - param_24) < puVar22) goto LAB_00153e5c;
      lVar34 = (long)puVar17 - (long)unaff_x30;
      pbVar11 = (byte *)((long)param_31 + lVar34);
      if (pbVar11 + (long)puVar43 <= param_31) {
        _memmove(puVar48,pbVar11,puVar43);
        param_7 = (ulong *)(ulong)param_20._4_4_;
        unaff_x23 = 0x18;
        param_8 = &param_50;
        unaff_x21 = param_19;
        unaff_x25 = param_17;
        goto LAB_00152cdc;
      }
      _memmove(puVar48,pbVar11,-lVar34);
      puVar48 = (ulong *)((long)puVar48 - lVar34);
      puVar43 = (ulong *)(lVar34 + (long)puVar43);
      param_7 = (ulong *)(ulong)param_20._4_4_;
      unaff_x23 = 0x18;
      param_8 = &param_50;
      puVar17 = unaff_x30;
      unaff_x21 = param_19;
      unaff_x25 = param_17;
    }
    if (puVar22 < &MACH_HEADER.ncmds) {
      if ((ulong *)((long)&MACH_HEADER.cputype + 3) < puVar22) {
        *puVar48 = *puVar17;
      }
      else {
        iVar24 = *(int *)(&UNK_008143b0 + (long)puVar22 * 4);
        *(byte *)puVar48 = (byte)*puVar17;
        *(byte *)((long)puVar48 + 1) = *(byte *)((long)puVar17 + 1);
        *(byte *)((long)puVar48 + 2) = *(byte *)((long)puVar17 + 2);
        *(byte *)((long)puVar48 + 3) = *(byte *)((long)puVar17 + 3);
        pbVar11 = (byte *)((long)puVar17 + (ulong)*(uint *)(&UNK_00814390 + (long)puVar22 * 4));
        puVar17 = (ulong *)(pbVar11 + -(long)iVar24);
        *(undefined4 *)((long)puVar48 + 4) = *(undefined4 *)pbVar11;
      }
      if (&MACH_HEADER.cpusubtype < puVar43) {
        puVar22 = puVar17 + 1;
        puVar18 = puVar48 + 1;
        if ((long)puVar18 - (long)puVar22 < 0x10) {
          do {
            puVar17 = puVar18 + 1;
            *puVar18 = *puVar22;
            puVar22 = puVar22 + 1;
            puVar18 = puVar17;
          } while (puVar17 < (ulong *)((long)puVar48 + (long)puVar43));
        }
        else {
          uVar26 = *puVar22;
          puVar48[2] = puVar17[2];
          *puVar18 = uVar26;
          if (&MACH_HEADER.ncmds < puVar43 + -1) {
            puVar22 = puVar48 + 3;
            puVar17 = puVar17 + 5;
            do {
              uVar26 = puVar17[-2];
              puVar22[1] = puVar17[-1];
              *puVar22 = uVar26;
              uVar26 = *puVar17;
              puVar22[3] = puVar17[1];
              puVar22[2] = uVar26;
              puVar22 = puVar22 + 4;
              puVar17 = puVar17 + 4;
            } while (puVar22 < (ulong *)((long)puVar48 + (long)puVar43));
          }
        }
      }
      param_7 = (ulong *)(ulong)param_20._4_4_;
      unaff_x23 = 0x18;
      param_8 = &param_50;
      unaff_x21 = param_19;
      unaff_x25 = param_17;
    }
    else {
      uVar26 = *puVar17;
      puVar48[1] = puVar17[1];
      *puVar48 = uVar26;
      if (&MACH_HEADER.ncmds < puVar43) {
        puVar22 = puVar48 + 2;
        do {
          uVar26 = puVar17[2];
          puVar22[1] = puVar17[3];
          *puVar22 = uVar26;
          uVar26 = puVar17[4];
          puVar22[3] = puVar17[5];
          puVar22[2] = uVar26;
          puVar22 = puVar22 + 4;
          puVar17 = puVar17 + 4;
        } while (puVar22 < (ulong *)((long)puVar48 + (long)puVar43));
      }
      else {
      }
    }
  }
LAB_00152cdc:
  if ((byte *)0xffffffffffffff88 < pbVar27) goto LAB_00153e60;
  puVar22 = (ulong *)((long)param_29 + (long)unaff_x19);
  puVar17 = param_31;
  if (param_4 <= puVar22) {
    puVar17 = param_30;
  }
  lVar34 = (long)((long)puVar17 + (long)puVar22) - (long)param_4;
  Hint_Prefetch(lVar34,0,0,0);
  Hint_Prefetch(lVar34 + 0x40,0,0,0);
  *unaff_x28 = (ulong)param_29;
  unaff_x28[1] = param_9;
  unaff_x28[2] = (ulong)param_4;
  puVar25 = (ulong *)((long)puVar25 + (long)pbVar27);
  param_26 = param_16;
  unaff_x19 = (byte *)((long)puVar22 + param_9);
  uVar42 = (int)param_6 + 1;
  param_6 = param_7;
  puVar22 = param_23;
  if (uVar42 != (uint)param_7) {
    do {
      param_6 = (ulong *)(ulong)uVar42;
      puVar3 = (ushort *)(param_38 + param_37 * 8);
      puVar4 = (ushort *)(param_42 + param_41 * 8);
      puVar5 = (ushort *)(param_40 + param_39 * 8);
      param_9 = (ulong)*(uint *)(puVar4 + 2);
      param_29 = (ulong *)(ulong)*(uint *)(puVar3 + 2);
      uVar35 = *(uint *)(puVar5 + 2);
      bVar6 = (byte)puVar3[1];
      bVar7 = (byte)puVar4[1];
      bVar8 = (byte)puVar5[1];
      uVar32 = (uint)bVar8;
      puVar20 = param_21;
      if (bVar8 < 2) {
        bVar10 = *(uint *)(puVar3 + 2) == 0;
        if (bVar8 != 0) {
          if (bVar10) {
            uVar35 = uVar35 + 1;
          }
          uVar26 = (ulong)param_33;
          param_33 = param_33 + 1;
          lVar34 = (ulong)uVar35 - ((long)(param_32 << (uVar26 & 0x3f)) >> 0x3f);
          if (lVar34 == 3) {
            param_4 = (ulong *)((byte *)((long)param_43 + -1) +
                               -(ulong)((byte *)((long)param_43 + -1) == (byte *)0x0));
          }
          else {
            param_4 = (ulong *)((long)(&param_43)[lVar34] -
                               (ulong)((&param_43)[lVar34] == (ulong *)0x0));
            if (lVar34 == 1) goto code_r0x001526cc;
          }
          goto code_r0x001526a0;
        }
        param_4 = *(ulong **)(param_18 + (ulong)bVar10 * 8);
        puVar20 = (undefined8 *)(param_18 + (ulong)!bVar10 * 8);
      }
      else {
        uVar26 = (ulong)param_33;
        param_33 = param_33 + uVar32;
        param_4 = (ulong *)(((param_32 << (uVar26 & 0x3f)) >> ((ulong)-uVar32 & 0x3f)) +
                           (ulong)uVar35);
code_r0x001526a0:
        param_45 = param_44;
      }
code_r0x001526cc:
      param_43 = param_4;
      param_44 = *puVar20;
      if (bVar7 != 0) {
        uVar26 = (ulong)param_33;
        param_33 = param_33 + bVar7;
        param_9 = ((param_32 << (uVar26 & 0x3f)) >> ((ulong)-(uint)bVar7 & 0x3f)) + param_9;
      }
      if (0x1e < ((uint)bVar7 + (uint)bVar6 + uVar32 & 0xff)) {
        if (param_33 < 0x41) {
          if (param_34 < param_36) {
            if (param_34 == param_35) goto code_r0x0015270c;
            uVar35 = (int)param_34 - (int)param_35;
            if (param_35 <= (ulong *)((long)param_34 - (ulong)(param_33 >> 3))) {
              uVar35 = param_33 >> 3;
            }
            param_33 = param_33 + uVar35 * -8;
          }
          else {
            uVar35 = param_33 >> 3;
            param_33 = param_33 & 7;
          }
          param_34 = (ulong *)((long)param_34 - (ulong)uVar35);
          param_32 = *param_34;
        }
        else {
          param_34 = (ulong *)&UNK_00814388;
        }
      }
code_r0x0015270c:
      if (bVar6 != 0) {
        uVar26 = (ulong)param_33;
        param_33 = param_33 + bVar6;
        param_29 = (ulong *)(((param_32 << (uVar26 & 0x3f)) >> ((ulong)-(uint)bVar6 & 0x3f)) +
                            (long)param_29);
      }
      param_5 = param_22;
      if (uVar42 == (uint)unaff_x21) {
code_r0x00152804:
        if (*(int *)((long)param_23 + 0xe64) == 2) goto code_r0x00152814;
code_r0x00152ddc:
        puVar48 = (ulong *)(param_8 + (ulong)(uVar42 & 7) * (unaff_x23 & 0xffffffff));
        uVar26 = *puVar48;
        unaff_x28 = (ulong *)puVar48[1];
        puVar48 = (ulong *)puVar48[2];
        puVar43 = (ulong *)((long)puVar25 + uVar26);
        puVar17 = (ulong *)((long)puVar43 - (long)puVar48);
        Hint_Prefetch(puVar17,0,0,0);
        if (((ulong *)(param_46 + uVar26) <= param_16) &&
           (pbVar27 = (byte *)((long)unaff_x28 + uVar26),
           (byte *)((long)puVar25 + (long)pbVar27) <= param_27)) {
          uVar50 = *(ulong *)param_46;
          puVar25[1] = *(ulong *)(param_46 + 8);
          *puVar25 = uVar50;
          if (0x10 < uVar26) {
            uVar50 = *(ulong *)(param_46 + 0x10);
            puVar25[3] = *(ulong *)(param_46 + 0x18);
            puVar25[2] = uVar50;
            if (0x10 < uVar26 - 0x10) {
              puVar18 = puVar25 + 4;
              puVar30 = (ulong *)(param_46 + 0x30);
              do {
                uVar50 = puVar30[-2];
                puVar18[1] = puVar30[-1];
                *puVar18 = uVar50;
                uVar50 = *puVar30;
                puVar18[3] = puVar30[1];
                puVar18[2] = uVar50;
                puVar18 = puVar18 + 4;
                puVar30 = puVar30 + 4;
              } while (puVar18 < puVar43);
            }
          }
          param_46 = param_46 + uVar26;
          if (puVar48 <= (ulong *)((long)puVar43 - (long)param_30)) {
LAB_00152ec8:
            if (puVar48 < &MACH_HEADER.ncmds) {
              if ((ulong *)((long)&MACH_HEADER.cputype + 3) < puVar48) {
                *puVar43 = *puVar17;
              }
              else {
                iVar24 = *(int *)(&UNK_008143b0 + (long)puVar48 * 4);
                *(byte *)puVar43 = (byte)*puVar17;
                *(byte *)((long)puVar43 + 1) = *(byte *)((long)puVar17 + 1);
                *(byte *)((long)puVar43 + 2) = *(byte *)((long)puVar17 + 2);
                *(byte *)((long)puVar43 + 3) = *(byte *)((long)puVar17 + 3);
                pbVar11 = (byte *)((long)puVar17 +
                                  (ulong)*(uint *)(&UNK_00814390 + (long)puVar48 * 4));
                puVar17 = (ulong *)(pbVar11 + -(long)iVar24);
                *(undefined4 *)((long)puVar43 + 4) = *(undefined4 *)pbVar11;
              }
              if (&MACH_HEADER.cpusubtype < unaff_x28) {
                puVar18 = puVar17 + 1;
                puVar30 = puVar43 + 1;
                if ((long)puVar30 - (long)puVar18 < 0x10) {
                  do {
                    puVar17 = puVar30 + 1;
                    *puVar30 = *puVar18;
                    puVar18 = puVar18 + 1;
                    puVar30 = puVar17;
                  } while (puVar17 < (ulong *)((long)puVar43 + (long)unaff_x28));
                }
                else {
                  uVar26 = *puVar18;
                  puVar43[2] = puVar17[2];
                  *puVar30 = uVar26;
                  if (&MACH_HEADER.ncmds < unaff_x28 + -1) {
                    puVar18 = puVar43 + 3;
                    puVar17 = puVar17 + 5;
                    do {
                      uVar26 = puVar17[-2];
                      puVar18[1] = puVar17[-1];
                      *puVar18 = uVar26;
                      uVar26 = *puVar17;
                      puVar18[3] = puVar17[1];
                      puVar18[2] = uVar26;
                      puVar18 = puVar18 + 4;
                      puVar17 = puVar17 + 4;
                    } while (puVar18 < (ulong *)((long)puVar43 + (long)unaff_x28));
                  }
                }
                param_7 = (ulong *)(ulong)param_20._4_4_;
                unaff_x23 = 0x18;
                param_8 = &param_50;
                unaff_x21 = param_19;
                unaff_x25 = param_17;
              }
            }
            else {
              uVar26 = *puVar17;
              puVar43[1] = puVar17[1];
              *puVar43 = uVar26;
              if (&MACH_HEADER.ncmds < unaff_x28) {
                puVar18 = puVar43 + 2;
                do {
                  uVar26 = puVar17[2];
                  puVar18[1] = puVar17[3];
                  *puVar18 = uVar26;
                  uVar26 = puVar17[4];
                  puVar18[3] = puVar17[5];
                  puVar18[2] = uVar26;
                  puVar18 = puVar18 + 4;
                  puVar17 = puVar17 + 4;
                } while (puVar18 < (ulong *)((long)puVar43 + (long)unaff_x28));
              }
            }
            goto LAB_00152f44;
          }
          if (puVar48 <= (ulong *)((long)puVar43 - param_24)) {
            lVar34 = (long)puVar17 - (long)param_30;
            pbVar11 = (byte *)((long)param_31 + lVar34);
            if (param_31 < pbVar11 + (long)unaff_x28) {
              _memmove(puVar43,pbVar11,-lVar34);
              puVar43 = (ulong *)((long)puVar43 - lVar34);
              unaff_x28 = (ulong *)(lVar34 + (long)unaff_x28);
              param_7 = (ulong *)(ulong)param_20._4_4_;
              unaff_x23 = 0x18;
              param_8 = &param_50;
              puVar17 = param_30;
              unaff_x21 = param_19;
              goto LAB_00152ec8;
            }
            _memmove(puVar43,pbVar11,unaff_x28);
            unaff_x23 = 0x18;
            unaff_x21 = param_19;
            goto code_r0x00152f40;
          }
          goto LAB_00153e5c;
        }
        param_47 = uVar26;
        param_48 = unaff_x28;
        param_49 = puVar48;
        pbVar27 = (byte *)func_0x00155c78(puVar25,param_25,&param_47,&param_46,param_16,param_30,
                                          param_24,param_31);
        param_8 = &param_50;
        param_7 = (ulong *)(ulong)param_20._4_4_;
        puVar43 = param_6;
        puVar48 = param_4;
      }
      else {
        iVar24 = param_33 + *(byte *)((long)puVar3 + 3);
        param_37 = (param_32 >> ((ulong)(uint)-iVar24 & 0x3f) &
                   (ulong)*(uint *)(&UNK_00814304 + (ulong)(uint)*(byte *)((long)puVar3 + 3) * 4)) +
                   (ulong)*puVar3;
        iVar24 = iVar24 + (uint)*(byte *)((long)puVar4 + 3);
        param_41 = (param_32 >> ((ulong)(uint)-iVar24 & 0x3f) &
                   (ulong)*(uint *)(&UNK_00814304 + (ulong)(uint)*(byte *)((long)puVar4 + 3) * 4)) +
                   (ulong)*puVar4;
        param_33 = iVar24 + (uint)*(byte *)((long)puVar5 + 3);
        param_39 = (param_32 >> ((ulong)-param_33 & 0x3f) &
                   (ulong)*(uint *)(&UNK_00814304 + (ulong)(uint)*(byte *)((long)puVar5 + 3) * 4)) +
                   (ulong)*puVar5;
        if (param_33 < 0x41) {
          if (param_34 < param_36) {
            if (param_34 == param_35) goto code_r0x00152804;
            uVar35 = (int)param_34 - (int)param_35;
            if (param_35 <= (ulong *)((long)param_34 - (ulong)(param_33 >> 3))) {
              uVar35 = param_33 >> 3;
            }
            param_33 = param_33 + uVar35 * -8;
          }
          else {
            uVar35 = param_33 >> 3;
            param_33 = param_33 & 7;
          }
          param_34 = (ulong *)((long)param_34 - (ulong)uVar35);
          param_32 = *param_34;
          goto code_r0x00152804;
        }
        param_34 = (ulong *)&UNK_00814388;
        if (*(int *)((long)param_23 + 0xe64) != 2) goto code_r0x00152ddc;
code_r0x00152814:
        unaff_x28 = (ulong *)(param_8 + (ulong)(uVar42 & 7) * (unaff_x23 & 0xffffffff));
        uVar26 = *unaff_x28;
        puVar18 = *(ulong **)(unaff_x25 + 0x7698);
        puVar17 = (ulong *)(param_46 + uVar26);
        if (puVar18 < puVar17) goto code_r0x00152834;
        puVar43 = (ulong *)unaff_x28[1];
        puVar48 = (ulong *)unaff_x28[2];
        if ((param_16 < puVar17) ||
           (pbVar27 = (byte *)((long)puVar43 + uVar26),
           puVar17 + -4 < (ulong *)((long)puVar25 + (long)pbVar27))) {
          param_47 = uVar26;
          param_48 = puVar43;
          param_49 = puVar48;
          pbVar27 = (byte *)func_0x00156308(puVar25,param_25,puVar17 + -4,&param_47,&param_46,
                                            param_16,param_30,param_24);
          puVar43 = param_6;
        }
        else {
          unaff_x28 = (ulong *)((long)puVar25 + uVar26);
          uVar50 = *(ulong *)param_46;
          puVar25[1] = *(ulong *)(param_46 + 8);
          *puVar25 = uVar50;
          if (0x10 < uVar26) {
            uVar50 = *(ulong *)(param_46 + 0x10);
            puVar25[3] = *(ulong *)(param_46 + 0x18);
            puVar25[2] = uVar50;
            if (0x10 < uVar26 - 0x10) {
              puVar18 = puVar25 + 4;
              puVar30 = (ulong *)(param_46 + 0x30);
              do {
                uVar26 = puVar30[-2];
                puVar18[1] = puVar30[-1];
                *puVar18 = uVar26;
                uVar26 = *puVar30;
                puVar18[3] = puVar30[1];
                puVar18[2] = uVar26;
                puVar18 = puVar18 + 4;
                puVar30 = puVar30 + 4;
              } while (puVar18 < unaff_x28);
            }
          }
          param_46 = (ulong)puVar17;
          puVar17 = (ulong *)((long)unaff_x28 - (long)puVar48);
          if ((ulong *)((long)unaff_x28 - (long)param_30) < puVar48) {
            if ((ulong *)((long)unaff_x28 - param_24) < puVar48) goto LAB_00153e5c;
            lVar34 = ((long)unaff_x28 - (long)puVar48) - (long)param_30;
            pbVar11 = (byte *)((long)param_31 + lVar34);
            if (pbVar11 + (long)puVar43 <= param_31) {
              _memmove(unaff_x28,pbVar11,puVar43);
              unaff_x23 = 0x18;
              unaff_x21 = param_19;
              goto code_r0x00152f40;
            }
            _memmove(unaff_x28,pbVar11,-lVar34);
            unaff_x28 = (ulong *)((long)unaff_x28 - lVar34);
            puVar43 = (ulong *)(lVar34 + (long)puVar43);
            param_7 = (ulong *)(ulong)param_20._4_4_;
            unaff_x23 = 0x18;
            param_8 = &param_50;
            puVar17 = param_30;
            unaff_x21 = param_19;
          }
          if ((ulong *)((long)&MACH_HEADER.filetype + 3) < puVar48) {
            uVar26 = *puVar17;
            unaff_x28[1] = puVar17[1];
            *unaff_x28 = uVar26;
            if (&MACH_HEADER.ncmds < puVar43) {
              puVar18 = unaff_x28 + 2;
              do {
                uVar26 = puVar17[2];
                puVar18[1] = puVar17[3];
                *puVar18 = uVar26;
                uVar26 = puVar17[4];
                puVar18[3] = puVar17[5];
                puVar18[2] = uVar26;
                puVar18 = puVar18 + 4;
                puVar17 = puVar17 + 4;
              } while (puVar18 < (ulong *)((long)unaff_x28 + (long)puVar43));
            }
            goto LAB_00152f44;
          }
          if ((ulong *)((long)&MACH_HEADER.cputype + 3) < puVar48) {
            *unaff_x28 = *puVar17;
          }
          else {
            iVar24 = *(int *)(&UNK_008143b0 + (long)puVar48 * 4);
            *(byte *)unaff_x28 = (byte)*puVar17;
            *(byte *)((long)unaff_x28 + 1) = *(byte *)((long)puVar17 + 1);
            *(byte *)((long)unaff_x28 + 2) = *(byte *)((long)puVar17 + 2);
            *(byte *)((long)unaff_x28 + 3) = *(byte *)((long)puVar17 + 3);
            pbVar11 = (byte *)((long)puVar17 + (ulong)*(uint *)(&UNK_00814390 + (long)puVar48 * 4));
            puVar17 = (ulong *)(pbVar11 + -(long)iVar24);
            *(undefined4 *)((long)unaff_x28 + 4) = *(undefined4 *)pbVar11;
          }
          if (&MACH_HEADER.cpusubtype < puVar43) {
            puVar18 = puVar17 + 1;
            puVar30 = unaff_x28 + 1;
            if ((long)puVar30 - (long)puVar18 < 0x10) {
              do {
                puVar17 = puVar30 + 1;
                *puVar30 = *puVar18;
                puVar18 = puVar18 + 1;
                puVar30 = puVar17;
              } while (puVar17 < (ulong *)((long)unaff_x28 + (long)puVar43));
            }
            else {
              uVar26 = *puVar18;
              unaff_x28[2] = puVar17[2];
              *puVar30 = uVar26;
              if (&MACH_HEADER.ncmds < puVar43 + -1) {
                puVar18 = unaff_x28 + 3;
                puVar17 = puVar17 + 5;
                do {
                  uVar26 = puVar17[-2];
                  puVar18[1] = puVar17[-1];
                  *puVar18 = uVar26;
                  uVar26 = *puVar17;
                  puVar18[3] = puVar17[1];
                  puVar18[2] = uVar26;
                  puVar18 = puVar18 + 4;
                  puVar17 = puVar17 + 4;
                } while (puVar18 < (ulong *)((long)unaff_x28 + (long)puVar43));
              }
            }
          }
          unaff_x23 = 0x18;
          unaff_x21 = param_19;
          unaff_x25 = param_17;
        }
code_r0x00152f40:
        param_7 = (ulong *)(ulong)param_20._4_4_;
        param_8 = &param_50;
      }
LAB_00152f44:
      if ((byte *)0xffffffffffffff88 < pbVar27) goto LAB_00153e60;
      puVar17 = (ulong *)((long)param_29 + (long)unaff_x19);
      puVar18 = param_31;
      if (param_4 <= puVar17) {
        puVar18 = param_30;
      }
      lVar34 = (long)((long)puVar18 + (long)puVar17) - (long)param_4;
      Hint_Prefetch(lVar34,0,0,0);
      Hint_Prefetch(lVar34 + 0x40,0,0,0);
      puVar20 = (undefined8 *)(param_8 + (ulong)(uVar42 & 7) * (unaff_x23 & 0xffffffff));
      *puVar20 = param_29;
      puVar20[1] = param_9;
      puVar20[2] = param_4;
      puVar25 = (ulong *)((long)puVar25 + (long)pbVar27);
      unaff_x19 = (byte *)((long)puVar17 + param_9);
      uVar42 = uVar42 + 1;
      param_6 = param_7;
      if (uVar42 == (uint)param_7) break;
    } while( true );
  }
  pbVar27 = (byte *)0xffffffffffffffec;
  param_5 = param_35;
  param_7 = param_6;
  if (param_34 != param_35) goto LAB_00153e60;
  if (param_33 != 0x40) goto LAB_00153e60;
  uVar42 = (int)param_6 - param_13._4_4_;
  unaff_x19 = (byte *)(ulong)uVar42;
  if ((int)param_6 <= (int)uVar42) goto LAB_00153e9c;
  unaff_x21 = (byte *)(param_25 + -0x20);
  puVar17 = (ulong *)(unaff_x25 + 0x176a4);
  unaff_x25 = &param_50;
  goto LAB_001534d0;
code_r0x00152834:
  param_1 = (long)puVar18 - param_46;
  unaff_x22 = param_23;
  unaff_x30 = param_30;
  if (param_1 != 0) goto code_r0x0015283c;
  goto code_r0x00152b94;
code_r0x0015283c:
  puVar43 = param_29;
  if ((ulong)(param_25 - (long)puVar25) < param_1) goto code_r0x00152014;
  uVar26 = (long)puVar25 - param_46;
  in_x9 = (ulong *)((long)puVar25 + param_1);
  if (((long)uVar26 < -7) && (7 < param_1)) {
    unaff_x26 = puVar25;
    if (uVar26 < 0xfffffffffffffff0) {
      in_x11 = in_x9 + -4;
      in_x12 = (long)in_x11 - (long)puVar25;
      if (puVar25 <= in_x11) goto code_r0x00152878;
    }
    if (0 < (long)param_1) goto LAB_00152a30;
    goto LAB_00152b84;
  }
  if ((long)param_1 < 1) goto LAB_00152b84;
  pbVar27 = (byte *)((long)puVar25 + (long)puVar18) + -param_46;
  if (pbVar27 <= (byte *)((long)puVar25 + 1)) {
    pbVar27 = (byte *)((long)puVar25 + 1);
  }
  uVar50 = (long)pbVar27 - (long)puVar25;
  if ((7 < uVar50) && (0x3f < uVar26)) {
    if (uVar50 < 0x40) {
      uVar49 = 0;
    }
    else {
      uVar49 = uVar50 & 0xffffffffffffffc0;
      puVar48 = puVar25 + 4;
      puVar43 = (ulong *)(param_46 + 0x20);
      uVar26 = uVar49;
      do {
        uVar16 = puVar43[-4];
        uVar31 = puVar43[-1];
        uVar15 = puVar43[-2];
        uVar40 = puVar43[1];
        uVar29 = *puVar43;
        uVar58 = puVar43[3];
        uVar55 = puVar43[2];
        puVar48[-3] = puVar43[-3];
        puVar48[-4] = uVar16;
        puVar48[-1] = uVar31;
        puVar48[-2] = uVar15;
        puVar48[1] = uVar40;
        *puVar48 = uVar29;
        puVar48[3] = uVar58;
        puVar48[2] = uVar55;
        uVar26 = uVar26 - 0x40;
        puVar48 = puVar48 + 8;
        puVar43 = puVar43 + 8;
      } while (uVar26 != 0);
      if (uVar50 == uVar49) goto LAB_00152b84;
      if ((uVar50 & 0x38) == 0) {
        param_46 = param_46 + uVar49;
        puVar25 = (ulong *)((long)puVar25 + uVar49);
        goto code_r0x00152b74;
      }
    }
    uVar26 = uVar50 & 0xfffffffffffffff8;
    lVar34 = uVar49 - uVar26;
    pbVar27 = (byte *)(param_46 + uVar49);
    pbVar11 = (byte *)((long)puVar25 + uVar49);
    do {
      *(undefined8 *)pbVar11 = *(undefined8 *)pbVar27;
      lVar34 = lVar34 + 8;
      pbVar27 = pbVar27 + 8;
      pbVar11 = pbVar11 + 8;
    } while (lVar34 != 0);
    puVar25 = (ulong *)((long)puVar25 + uVar26);
    param_46 = (ulong)(param_46 + uVar26);
    if (uVar50 == uVar26) goto LAB_00152b84;
  }
code_r0x00152b74:
  do {
    puVar48 = (ulong *)((long)puVar25 + 1);
    *(byte *)puVar25 = (byte)*(ulong *)param_46;
    puVar25 = puVar48;
    param_46 = (ulong)(param_46 + 1);
  } while (puVar48 < in_x9);
  goto LAB_00152b84;
LAB_001534d0:
  do {
    unaff_x23 = 0x18;
    uVar42 = (uint)unaff_x19;
    lVar34 = (ulong)(uVar42 & 7) * 0x18;
    puVar18 = (ulong *)(unaff_x25 + lVar34);
    if (*(int *)((long)param_23 + 0xe64) != 2) {
      uVar26 = *puVar18;
      puVar30 = *(ulong **)(&param_51 + lVar34);
      puVar48 = *(ulong **)(&param_52 + lVar34);
      puVar18 = (ulong *)((long)puVar25 + uVar26);
      puVar19 = (ulong *)((long)puVar18 - (long)puVar48);
      Hint_Prefetch(puVar19,0,0,0);
      pbVar27 = (byte *)((long)puVar30 + uVar26);
      if (param_26 < (ulong *)(param_46 + uVar26) ||
          unaff_x21 < (byte *)((long)puVar25 + (long)pbVar27)) {
        param_4 = &param_47;
        param_5 = &param_46;
        param_6 = param_26;
        param_47 = uVar26;
        param_48 = puVar30;
        param_49 = puVar48;
        pbVar27 = (byte *)func_0x00155c78(puVar25,param_25);
code_r0x00153acc:
        param_7 = (ulong *)(ulong)param_20._4_4_;
        puVar43 = puVar18;
        unaff_x28 = puVar30;
      }
      else {
        uVar50 = *(ulong *)param_46;
        puVar25[1] = *(ulong *)(param_46 + 8);
        *puVar25 = uVar50;
        if (0x10 < uVar26) {
          uVar50 = *(ulong *)(param_46 + 0x10);
          puVar25[3] = *(ulong *)(param_46 + 0x18);
          puVar25[2] = uVar50;
          if (0x10 < uVar26 - 0x10) {
            puVar43 = puVar25 + 4;
            puVar23 = (ulong *)(param_46 + 0x30);
            do {
              uVar50 = puVar23[-2];
              puVar43[1] = puVar23[-1];
              *puVar43 = uVar50;
              uVar50 = *puVar23;
              puVar43[3] = puVar23[1];
              puVar43[2] = uVar50;
              puVar43 = puVar43 + 4;
              puVar23 = puVar23 + 4;
            } while (puVar43 < puVar18);
          }
        }
        param_46 = param_46 + uVar26;
        if ((ulong *)((long)puVar18 - (long)param_30) < puVar48) {
          puVar43 = puVar18;
          unaff_x28 = puVar30;
          if ((ulong *)((long)puVar18 - param_24) < puVar48) goto LAB_00153e5c;
          lVar34 = (long)puVar19 - (long)param_30;
          if (param_31 < (byte *)((long)param_31 + lVar34) + (long)puVar30) {
            param_4 = (ulong *)-lVar34;
            _memmove(puVar18);
            puVar18 = (ulong *)((long)puVar18 - lVar34);
            puVar30 = (ulong *)(lVar34 + (long)puVar30);
            param_7 = (ulong *)(ulong)param_20._4_4_;
            puVar19 = param_30;
            goto code_r0x00153628;
          }
LAB_001537a0:
          _memmove(puVar18);
          param_4 = puVar30;
          puVar18 = puVar43;
        }
        else {
code_r0x00153628:
          unaff_x28 = puVar30;
          if (&MACH_HEADER.ncmds <= puVar48) {
            uVar26 = *puVar19;
            puVar18[1] = puVar19[1];
            *puVar18 = uVar26;
            puVar43 = puVar18;
            if (&MACH_HEADER.ncmds < puVar30) {
              puVar23 = puVar18 + 2;
              do {
                uVar26 = puVar19[2];
                puVar23[1] = puVar19[3];
                *puVar23 = uVar26;
                uVar26 = puVar19[4];
                puVar23[3] = puVar19[5];
                puVar23[2] = uVar26;
                puVar23 = puVar23 + 4;
                puVar19 = puVar19 + 4;
              } while (puVar23 < (ulong *)((long)puVar18 + (long)puVar30));
            }
            goto joined_r0x001537bc;
          }
          if ((ulong *)((long)&MACH_HEADER.cputype + 3) < puVar48) {
            *puVar18 = *puVar19;
          }
          else {
            iVar24 = *(int *)(&UNK_008143b0 + (long)puVar48 * 4);
            *(byte *)puVar18 = (byte)*puVar19;
            *(byte *)((long)puVar18 + 1) = *(byte *)((long)puVar19 + 1);
            *(byte *)((long)puVar18 + 2) = *(byte *)((long)puVar19 + 2);
            *(byte *)((long)puVar18 + 3) = *(byte *)((long)puVar19 + 3);
            pbVar11 = (byte *)((long)puVar19 + (ulong)*(uint *)(&UNK_00814390 + (long)puVar48 * 4));
            puVar19 = (ulong *)(pbVar11 + -(long)iVar24);
            *(undefined4 *)((long)puVar18 + 4) = *(undefined4 *)pbVar11;
          }
          if (&MACH_HEADER.cpusubtype < puVar30) {
            puVar43 = puVar19 + 1;
            puVar23 = puVar18 + 1;
            if ((long)puVar23 - (long)puVar43 < 0x10) {
              do {
                puVar19 = puVar23 + 1;
                *puVar23 = *puVar43;
                puVar43 = puVar43 + 1;
                puVar23 = puVar19;
              } while (puVar19 < (ulong *)((long)puVar18 + (long)puVar30));
            }
            else {
              uVar26 = *puVar43;
              puVar18[2] = puVar19[2];
              *puVar23 = uVar26;
              if (&MACH_HEADER.ncmds < puVar30 + -1) {
                puVar43 = puVar18 + 3;
                puVar19 = puVar19 + 5;
                do {
                  uVar26 = puVar19[-2];
                  puVar43[1] = puVar19[-1];
                  *puVar43 = uVar26;
                  uVar26 = *puVar19;
                  puVar43[3] = puVar19[1];
                  puVar43[2] = uVar26;
                  puVar43 = puVar43 + 4;
                  puVar19 = puVar19 + 4;
                } while (puVar43 < (ulong *)((long)puVar18 + (long)puVar30));
              }
            }
          }
        }
LAB_001537b0:
        param_7 = (ulong *)(ulong)param_20._4_4_;
        puVar43 = puVar18;
      }
joined_r0x001537bc:
      unaff_x23 = 0x18;
      if ((byte *)0xffffffffffffff88 < pbVar27) goto LAB_00153e60;
      unaff_x23 = 0x18;
      puVar25 = (ulong *)((long)puVar25 + (long)pbVar27);
      unaff_x19 = (byte *)(ulong)(uVar42 + 1);
      if (uVar42 + 1 == (uint)param_7) break;
      goto LAB_001534d0;
    }
    uVar26 = *puVar18;
    puVar30 = *(ulong **)(param_17 + 0x7698);
    puVar19 = (ulong *)(param_46 + uVar26);
    if (puVar19 <= puVar30) {
      param_4 = puVar19 + -4;
      puVar30 = *(ulong **)(&param_51 + lVar34);
      puVar48 = *(ulong **)(&param_52 + lVar34);
      pbVar27 = (byte *)((long)puVar30 + uVar26);
      if (param_26 < puVar19 || param_4 < (ulong *)((long)puVar25 + (long)pbVar27)) {
        param_5 = &param_47;
        param_6 = &param_46;
        param_47 = uVar26;
        param_48 = puVar30;
        param_49 = puVar48;
        pbVar27 = (byte *)func_0x00156308(puVar25,param_25);
        puVar18 = puVar30;
        puVar30 = unaff_x28;
        goto code_r0x00153acc;
      }
      puVar18 = (ulong *)((long)puVar25 + uVar26);
      uVar50 = *(ulong *)param_46;
      puVar25[1] = *(ulong *)(param_46 + 8);
      *puVar25 = uVar50;
      if (0x10 < uVar26) {
        uVar50 = *(ulong *)(param_46 + 0x10);
        puVar25[3] = *(ulong *)(param_46 + 0x18);
        puVar25[2] = uVar50;
        if (0x10 < uVar26 - 0x10) {
          puVar43 = puVar25 + 4;
          puVar23 = (ulong *)(param_46 + 0x30);
          do {
            uVar26 = puVar23[-2];
            puVar43[1] = puVar23[-1];
            *puVar43 = uVar26;
            uVar26 = *puVar23;
            puVar43[3] = puVar23[1];
            puVar43[2] = uVar26;
            puVar43 = puVar43 + 4;
            puVar23 = puVar23 + 4;
          } while (puVar43 < puVar18);
        }
      }
      param_46 = (ulong)puVar19;
      puVar19 = (ulong *)((long)puVar18 - (long)puVar48);
      unaff_x28 = puVar18;
      if ((ulong *)((long)puVar18 - (long)param_30) < puVar48) {
        puVar43 = puVar30;
        if ((ulong *)((long)puVar18 - param_24) < puVar48) goto LAB_00153e5c;
        lVar34 = ((long)puVar18 - (long)puVar48) - (long)param_30;
        if ((byte *)((long)param_31 + lVar34) + (long)puVar30 <= param_31) {
          goto LAB_001537a0;
        }
        param_4 = (ulong *)-lVar34;
        _memmove(puVar18);
        unaff_x28 = (ulong *)((long)puVar18 - lVar34);
        puVar30 = (ulong *)(lVar34 + (long)puVar30);
        param_7 = (ulong *)(ulong)param_20._4_4_;
        puVar19 = param_30;
      }
      if (puVar48 < &MACH_HEADER.ncmds) {
        if ((ulong *)((long)&MACH_HEADER.cputype + 3) < puVar48) {
          *unaff_x28 = *puVar19;
        }
        else {
          iVar24 = *(int *)(&UNK_008143b0 + (long)puVar48 * 4);
          *(byte *)unaff_x28 = (byte)*puVar19;
          *(byte *)((long)unaff_x28 + 1) = *(byte *)((long)puVar19 + 1);
          *(byte *)((long)unaff_x28 + 2) = *(byte *)((long)puVar19 + 2);
          *(byte *)((long)unaff_x28 + 3) = *(byte *)((long)puVar19 + 3);
          pbVar11 = (byte *)((long)puVar19 + (ulong)*(uint *)(&UNK_00814390 + (long)puVar48 * 4));
          puVar19 = (ulong *)(pbVar11 + -(long)iVar24);
          *(undefined4 *)((long)unaff_x28 + 4) = *(undefined4 *)pbVar11;
        }
        puVar18 = puVar30;
        if (&MACH_HEADER.cpusubtype < puVar30) {
          puVar43 = puVar19 + 1;
          puVar23 = unaff_x28 + 1;
          if ((long)puVar23 - (long)puVar43 < 0x10) {
            do {
              puVar19 = puVar23 + 1;
              *puVar23 = *puVar43;
              puVar43 = puVar43 + 1;
              puVar23 = puVar19;
            } while (puVar19 < (ulong *)((long)unaff_x28 + (long)puVar30));
          }
          else {
            uVar26 = *puVar43;
            unaff_x28[2] = puVar19[2];
            *puVar23 = uVar26;
            if (&MACH_HEADER.ncmds < puVar30 + -1) {
              puVar43 = unaff_x28 + 3;
              puVar19 = puVar19 + 5;
              do {
                uVar26 = puVar19[-2];
                puVar43[1] = puVar19[-1];
                *puVar43 = uVar26;
                uVar26 = *puVar19;
                puVar43[3] = puVar19[1];
                puVar43[2] = uVar26;
                puVar43 = puVar43 + 4;
                puVar19 = puVar19 + 4;
              } while (puVar43 < (ulong *)((long)unaff_x28 + (long)puVar30));
            }
          }
        }
        goto LAB_001537b0;
      }
      uVar26 = *puVar19;
      unaff_x28[1] = puVar19[1];
      *unaff_x28 = uVar26;
      puVar43 = puVar30;
      if (&MACH_HEADER.ncmds < puVar30) {
        puVar18 = unaff_x28 + 2;
        do {
          uVar26 = puVar19[2];
          puVar18[1] = puVar19[3];
          *puVar18 = uVar26;
          uVar26 = puVar19[4];
          puVar18[3] = puVar19[5];
          puVar18[2] = uVar26;
          puVar18 = puVar18 + 4;
          puVar19 = puVar19 + 4;
        } while (puVar18 < (ulong *)((long)unaff_x28 + (long)puVar30));
      }
      goto joined_r0x001537bc;
    }
    uVar50 = (long)puVar30 - param_46;
    puVar19 = puVar25;
    if (uVar50 != 0) {
      if ((ulong)(param_25 - (long)puVar25) < uVar50) goto code_r0x00152014;
      uVar26 = (long)puVar25 - param_46;
      puVar19 = (ulong *)((long)puVar25 + uVar50);
      if (((long)uVar26 < -7) && (7 < uVar50)) {
        if (uVar26 < 0xfffffffffffffff0) {
          puVar48 = puVar19 + -4;
          if (puVar48 < puVar25) goto code_r0x001537d4;
          uVar26 = *(ulong *)param_46;
          puVar25[1] = *(ulong *)(param_46 + 8);
          *puVar25 = uVar26;
          if (0x10 < (ulong)((long)puVar48 - (long)puVar25)) {
            puVar43 = puVar25 + 2;
            puVar30 = (ulong *)param_46;
            do {
              uVar26 = puVar30[2];
              puVar43[1] = puVar30[3];
              *puVar43 = uVar26;
              uVar26 = puVar30[4];
              puVar43[3] = puVar30[5];
              puVar43[2] = uVar26;
              puVar43 = puVar43 + 4;
              puVar30 = puVar30 + 4;
            } while (puVar43 < puVar48);
          }
          param_46 = param_46 + ((long)puVar48 - (long)puVar25);
        }
        else {
code_r0x001537d4:
          puVar48 = puVar25;
          if ((long)uVar50 < 1) goto LAB_00153934;
        }
        pbVar27 = (byte *)((long)puVar25 + (uVar50 - (long)puVar48));
        if ((pbVar27 < (byte *)0x8) || ((long)puVar48 - param_46 < 0x40)) {
          puVar25 = puVar48;
        }
        else {
          if (pbVar27 < (byte *)0x40) {
            pbVar33 = (byte *)0x0;
          }
          else {
            pbVar33 = (byte *)((ulong)pbVar27 & 0xffffffffffffffc0);
            puVar25 = puVar48 + 4;
            puVar43 = (ulong *)(param_46 + 0x20);
            pbVar11 = pbVar33;
            do {
              uVar26 = puVar43[-4];
              uVar16 = puVar43[-1];
              uVar49 = puVar43[-2];
              uVar31 = puVar43[1];
              uVar15 = *puVar43;
              uVar40 = puVar43[3];
              uVar29 = puVar43[2];
              puVar25[-3] = puVar43[-3];
              puVar25[-4] = uVar26;
              puVar25[-1] = uVar16;
              puVar25[-2] = uVar49;
              puVar25[1] = uVar31;
              *puVar25 = uVar15;
              puVar25[3] = uVar40;
              puVar25[2] = uVar29;
              pbVar11 = pbVar11 + -0x40;
              puVar25 = puVar25 + 8;
              puVar43 = puVar43 + 8;
            } while (pbVar11 != (byte *)0x0);
            if (pbVar27 == pbVar33) goto LAB_00153934;
            if (((ulong)pbVar27 & 0x38) == 0) {
              param_46 = param_46 + (long)pbVar33;
              puVar25 = (ulong *)((long)puVar48 + (long)pbVar33);
              goto LAB_00153904;
            }
          }
          pbVar36 = (byte *)((ulong)pbVar27 & 0xfffffffffffffff8);
          lVar37 = (long)pbVar33 - (long)pbVar36;
          pbVar11 = (byte *)((long)puVar48 + (long)pbVar33);
          pbVar33 = (byte *)(param_46 + (long)pbVar33);
          do {
            *(undefined8 *)pbVar11 = *(undefined8 *)pbVar33;
            lVar37 = lVar37 + 8;
            pbVar11 = pbVar11 + 8;
            pbVar33 = pbVar33 + 8;
          } while (lVar37 != 0);
          puVar25 = (ulong *)((long)puVar48 + (long)pbVar36);
          param_46 = (ulong)(param_46 + (long)pbVar36);
          if (pbVar27 == pbVar36) goto LAB_00153934;
        }
LAB_00153904:
        do {
          puVar43 = (ulong *)((long)puVar25 + 1);
          *(byte *)puVar25 = (byte)*(ulong *)param_46;
          puVar25 = puVar43;
          param_46 = (ulong)(param_46 + 1);
        } while (puVar43 != (ulong *)((long)puVar48 + (long)pbVar27));
      }
      else if (0 < (long)uVar50) {
        pbVar27 = (byte *)((long)puVar25 + (long)puVar30) + -param_46;
        if (pbVar27 <= (byte *)((long)puVar25 + 1)) {
          pbVar27 = (byte *)((long)puVar25 + 1);
        }
        uVar49 = (long)pbVar27 - (long)puVar25;
        if ((7 < uVar49) && (0x3f < uVar26)) {
          if (uVar49 < 0x40) {
            uVar16 = 0;
          }
          else {
            uVar16 = uVar49 & 0xffffffffffffffc0;
            puVar48 = puVar25 + 4;
            puVar43 = (ulong *)(param_46 + 0x20);
            uVar26 = uVar16;
            do {
              uVar15 = puVar43[-4];
              uVar29 = puVar43[-1];
              uVar31 = puVar43[-2];
              uVar55 = puVar43[1];
              uVar40 = *puVar43;
              uVar59 = puVar43[3];
              uVar58 = puVar43[2];
              puVar48[-3] = puVar43[-3];
              puVar48[-4] = uVar15;
              puVar48[-1] = uVar29;
              puVar48[-2] = uVar31;
              puVar48[1] = uVar55;
              *puVar48 = uVar40;
              puVar48[3] = uVar59;
              puVar48[2] = uVar58;
              uVar26 = uVar26 - 0x40;
              puVar48 = puVar48 + 8;
              puVar43 = puVar43 + 8;
            } while (uVar26 != 0);
            if (uVar49 == uVar16) goto LAB_00153934;
            if ((uVar49 & 0x38) == 0) {
              param_46 = param_46 + uVar16;
              puVar25 = (ulong *)((long)puVar25 + uVar16);
              goto code_r0x00153924;
            }
          }
          uVar26 = uVar49 & 0xfffffffffffffff8;
          lVar37 = uVar16 - uVar26;
          pbVar27 = (byte *)(param_46 + uVar16);
          pbVar11 = (byte *)((long)puVar25 + uVar16);
          do {
            *(undefined8 *)pbVar11 = *(undefined8 *)pbVar27;
            lVar37 = lVar37 + 8;
            pbVar27 = pbVar27 + 8;
            pbVar11 = pbVar11 + 8;
          } while (lVar37 != 0);
          puVar25 = (ulong *)((long)puVar25 + uVar26);
          param_46 = (ulong)(param_46 + uVar26);
          if (uVar49 == uVar26) goto LAB_00153934;
        }
code_r0x00153924:
        do {
          puVar48 = (ulong *)((long)puVar25 + 1);
          *(byte *)puVar25 = (byte)*(ulong *)param_46;
          puVar25 = puVar48;
          param_46 = (ulong)(param_46 + 1);
        } while (puVar48 < puVar19);
      }
LAB_00153934:
      uVar26 = *puVar18 - uVar50;
      *puVar18 = uVar26;
    }
    param_46 = (ulong)param_22;
    pbVar27 = (byte *)((long)param_23 + 0xe64);
    pbVar27[0] = 0;
    pbVar27[1] = 0;
    pbVar27[2] = 0;
    pbVar27[3] = 0;
    puVar43 = *(ulong **)(&param_51 + lVar34);
    unaff_x28 = *(ulong **)(&param_52 + lVar34);
    puVar48 = (ulong *)((long)puVar19 + uVar26);
    puVar18 = (ulong *)((long)puVar48 - (long)unaff_x28);
    Hint_Prefetch(puVar18,0,0,0);
    pbVar27 = (byte *)((long)puVar43 + uVar26);
    puVar25 = puVar19;
    if (puVar17 < (ulong *)((long)param_22 + uVar26) ||
        unaff_x21 < (byte *)((long)puVar19 + (long)pbVar27)) {
      param_4 = &param_47;
      param_5 = &param_46;
      param_6 = puVar17;
      param_47 = uVar26;
      param_48 = puVar43;
      param_49 = unaff_x28;
      pbVar27 = (byte *)func_0x00155c78(puVar19,param_25);
      param_7 = (ulong *)(ulong)param_20._4_4_;
    }
    else {
      uVar50 = *param_22;
      puVar19[1] = param_22[1];
      *puVar19 = uVar50;
      if (0x10 < uVar26) {
        uVar50 = param_22[2];
        puVar19[3] = param_22[3];
        puVar19[2] = uVar50;
        if (0x10 < uVar26 - 0x10) {
          puVar30 = puVar19 + 4;
          puVar23 = param_22 + 6;
          do {
            uVar50 = puVar23[-2];
            puVar30[1] = puVar23[-1];
            *puVar30 = uVar50;
            uVar50 = *puVar23;
            puVar30[3] = puVar23[1];
            puVar30[2] = uVar50;
            puVar30 = puVar30 + 4;
            puVar23 = puVar23 + 4;
          } while (puVar30 < puVar48);
        }
      }
      param_46 = (long)param_22 + uVar26;
      if ((ulong *)((long)puVar48 - (long)param_30) < unaff_x28) {
        if ((ulong *)((long)puVar48 - param_24) < unaff_x28) goto LAB_00153e5c;
        lVar34 = (long)puVar18 - (long)param_30;
        if (param_31 < (byte *)((long)param_31 + lVar34) + (long)puVar43) {
          param_4 = (ulong *)-lVar34;
          _memmove(puVar48);
          puVar48 = (ulong *)((long)puVar48 - lVar34);
          puVar43 = (ulong *)(lVar34 + (long)puVar43);
          param_7 = (ulong *)(ulong)param_20._4_4_;
          puVar18 = param_30;
          goto LAB_001539ec;
        }
        param_4 = puVar43;
        _memmove(puVar48);
      }
      else {
LAB_001539ec:
        if (&MACH_HEADER.ncmds <= unaff_x28) {
          uVar26 = *puVar18;
          puVar48[1] = puVar18[1];
          *puVar48 = uVar26;
          if (&MACH_HEADER.ncmds < puVar43) {
            puVar30 = puVar48 + 2;
            do {
              uVar26 = puVar18[2];
              puVar30[1] = puVar18[3];
              *puVar30 = uVar26;
              uVar26 = puVar18[4];
              puVar30[3] = puVar18[5];
              puVar30[2] = uVar26;
              puVar30 = puVar30 + 4;
              puVar18 = puVar18 + 4;
            } while (puVar30 < (ulong *)((long)puVar48 + (long)puVar43));
          }
          goto joined_r0x00153b5c;
        }
        if ((ulong *)((long)&MACH_HEADER.cputype + 3) < unaff_x28) {
          *puVar48 = *puVar18;
        }
        else {
          iVar24 = *(int *)(&UNK_008143b0 + (long)unaff_x28 * 4);
          *(byte *)puVar48 = (byte)*puVar18;
          *(byte *)((long)puVar48 + 1) = *(byte *)((long)puVar18 + 1);
          *(byte *)((long)puVar48 + 2) = *(byte *)((long)puVar18 + 2);
          *(byte *)((long)puVar48 + 3) = *(byte *)((long)puVar18 + 3);
          pbVar11 = (byte *)((long)puVar18 + (ulong)*(uint *)(&UNK_00814390 + (long)unaff_x28 * 4));
          puVar18 = (ulong *)(pbVar11 + -(long)iVar24);
          *(undefined4 *)((long)puVar48 + 4) = *(undefined4 *)pbVar11;
        }
        if (&MACH_HEADER.cpusubtype < puVar43) {
          puVar30 = puVar18 + 1;
          puVar23 = puVar48 + 1;
          if ((long)puVar23 - (long)puVar30 < 0x10) {
            do {
              puVar18 = puVar23 + 1;
              *puVar23 = *puVar30;
              puVar30 = puVar30 + 1;
              puVar23 = puVar18;
            } while (puVar18 < (ulong *)((long)puVar48 + (long)puVar43));
          }
          else {
            uVar26 = *puVar30;
            puVar48[2] = puVar18[2];
            *puVar23 = uVar26;
            if (&MACH_HEADER.ncmds < puVar43 + -1) {
              puVar30 = puVar48 + 3;
              puVar18 = puVar18 + 5;
              do {
                uVar26 = puVar18[-2];
                puVar30[1] = puVar18[-1];
                *puVar30 = uVar26;
                uVar26 = *puVar18;
                puVar30[3] = puVar18[1];
                puVar30[2] = uVar26;
                puVar30 = puVar30 + 4;
                puVar18 = puVar18 + 4;
              } while (puVar30 < (ulong *)((long)puVar48 + (long)puVar43));
            }
          }
        }
      }
      param_7 = (ulong *)(ulong)param_20._4_4_;
    }
joined_r0x00153b5c:
    unaff_x23 = 0x18;
    if ((byte *)0xffffffffffffff88 < pbVar27) goto LAB_00153e60;
    unaff_x23 = 0x18;
    puVar25 = (ulong *)((long)puVar19 + (long)pbVar27);
    unaff_x19 = (byte *)(ulong)(uVar42 + 1);
    param_26 = puVar17;
  } while (uVar42 + 1 != (uint)param_7);
LAB_00153e9c:
  *param_23 = CONCAT44((int)param_44,(int)param_43);
  *(int *)(param_23 + 1) = (int)param_45;
  puVar43 = (ulong *)param_46;
  param_4 = param_26;
  unaff_x19 = param_14;
  if (*(int *)((long)param_23 + 0xe64) == 2) {
    puVar43 = (ulong *)((long)param_26 - param_46);
    unaff_x25 = param_17;
    if (puVar43 <= (ulong *)(param_25 - (long)puVar25)) {
      if (puVar25 != (ulong *)0x0) {
        _memmove(puVar25,param_46,puVar43);
        puVar25 = (ulong *)((long)puVar25 + (long)puVar43);
      }
      puVar43 = (ulong *)(param_17 + 0x76a4);
      param_4 = (ulong *)(param_17 + 0x176a4);
      goto code_r0x00152000;
    }
  }
  else {
code_r0x00152000:
    puVar43 = (ulong *)((long)param_4 - (long)puVar43);
    unaff_x25 = param_17;
    if (puVar43 <= (ulong *)(param_25 - (long)puVar25)) {
      if (puVar25 == (ulong *)0x0) {
        pbVar27 = (byte *)0x0;
      }
      else {
        param_4 = puVar43;
        _memmove(puVar25);
        pbVar27 = (byte *)((long)puVar25 + (long)puVar43);
      }
      pbVar27 = pbVar27 + -(long)param_14;
      goto LAB_00153e60;
    }
  }
code_r0x00152014:
  pbVar27 = (byte *)0xffffffffffffffba;
LAB_00153e60:
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
    return pbVar27;
  }
  auVar61 = ___stack_chk_fail();
  pbVar14 = auVar61._8_8_;
  plVar12 = auVar61._0_8_;
  puStack_60 = unaff_x28;
  puStack_58 = puVar48;
  puStack_50 = puVar25;
  puStack_48 = unaff_x25;
  pbStack_40 = pbVar27;
  uStack_38 = unaff_x23;
  puStack_30 = param_23;
  pbStack_28 = unaff_x21;
  puStack_20 = puVar43;
  pbStack_18 = unaff_x19;
  pbVar11 = pbVar14 + ((ulong)param_4 & ((long)param_4 >> 0x3f ^ 0xffffffffffffffffU));
  pbVar33 = (byte *)plVar12[0xeb5];
  pbStack_88 = pbVar33;
  pbVar27 = (byte *)plVar12[0xed3];
  pbVar36 = pbVar14;
  if ((int)param_7 == 0) {
    iVar24 = (int)plVar12[0xed4];
joined_r0x001550b0:
    pbStack_88 = pbVar33;
    if (iVar24 == 2) {
      uVar26 = (long)pbVar27 - (long)pbVar33;
      if ((ulong)((long)pbVar11 - (long)pbVar36) < uVar26) {
        return (byte *)0xffffffffffffffba;
      }
      if (pbVar36 != (byte *)0x0) {
        _memmove(pbVar36,pbVar33,uVar26);
        pbVar36 = pbVar36 + uVar26;
      }
      pbVar33 = (byte *)((long)plVar12 + 0x76a4);
      pbVar27 = (byte *)((long)plVar12 + 0x176a4);
      *(undefined4 *)(plVar12 + 0xed4) = 0;
    }
    uVar26 = (long)pbVar27 - (long)pbVar33;
    if ((ulong)((long)pbVar11 - (long)pbVar36) < uVar26) {
      return (byte *)0xffffffffffffffba;
    }
    if (pbVar36 == (byte *)0x0) {
      pbVar36 = (byte *)0x0;
    }
    else {
      _memcpy(pbVar36,pbVar33,uVar26);
      pbVar36 = pbVar36 + uVar26;
    }
    return pbVar36 + -(long)pbVar14;
  }
  pbVar33 = (byte *)plVar12[0xe99];
  lVar34 = plVar12[0xe9a];
  uVar26 = plVar12[0xe9b];
  *(undefined4 *)((long)plVar12 + 0x7534) = 1;
  uVar50 = *(ulong *)((long)plVar12 + 0x683c);
  auStack_a0[1] = uVar50 >> 0x20;
  auStack_a0[0] = uVar50 & 0xffffffff;
  auStack_a0[2] = (ulong)*(uint *)((long)plVar12 + 0x6844);
  if (param_6 == (ulong *)0x0) {
    return (byte *)0xffffffffffffffec;
  }
  puVar25 = param_5 + 1;
  puVar48 = param_6 + -1;
  if (param_6 < &MACH_HEADER.cpusubtype) {
    uStack_f8 = (ulong)(byte)*param_5;
    switch(param_6) {
    case (ulong *)0x7:
      uStack_f8 = uStack_f8 | (ulong)*(byte *)((long)param_5 + 6) << 0x30;
    case (ulong *)0x6:
      uStack_f8 = uStack_f8 + ((ulong)*(byte *)((long)param_5 + 5) << 0x28);
    case (ulong *)0x5:
      uStack_f8 = uStack_f8 + ((ulong)*(byte *)((long)param_5 + 4) << 0x20);
    case (ulong *)0x4:
      uStack_f8 = uStack_f8 + (ulong)*(byte *)((long)param_5 + 3) * 0x1000000;
    case (ulong *)0x3:
      uStack_f8 = uStack_f8 + (ulong)*(byte *)((long)param_5 + 2) * 0x10000;
    case (ulong *)0x2:
      uStack_f8 = uStack_f8 + (ulong)*(byte *)((long)param_5 + 1) * 0x100;
    }
    if (((byte *)((long)param_6 + (long)param_5))[-1] == 0) {
      return (byte *)0xffffffffffffffec;
    }
    puVar48 = (ulong *)0x0;
    iVar24 = (int)LZCOUNT((uint)((byte *)((long)param_6 + (long)param_5))[-1]) + (int)param_6 * -8 +
             0x29;
    puStack_e8 = param_5;
  }
  else {
    uStack_f8 = *(ulong *)((long)param_5 + (long)puVar48);
    if (uStack_f8 >> 0x38 == 0) {
      return (byte *)0xffffffffffffffec;
    }
    if ((ulong *)0xffffffffffffff88 < param_6) {
      return (byte *)0xffffffffffffffec;
    }
    iVar24 = (int)LZCOUNT((uint)(byte)(uStack_f8 >> 0x38)) + -0x17;
    puStack_e8 = (ulong *)((long)param_5 + (long)puVar48);
  }
  uVar42 = *(uint *)(*plVar12 + 4);
  uStack_f0 = uVar42 + iVar24;
  uStack_d0 = uStack_f8 >> ((ulong)-uStack_f0 & 0x3f) &
              (ulong)*(uint *)(&UNK_00814304 + (ulong)uVar42 * 4);
  if (uStack_f0 < 0x41) {
    if ((long)puVar48 < 8) {
      puVar43 = param_5;
      if (puVar48 == (ulong *)0x0) goto LAB_00154138;
      uVar42 = (uint)puVar48;
      if (param_5 <= (byte *)((long)param_5 + (long)puVar48) + -(ulong)(uStack_f0 >> 3)) {
        uVar42 = uStack_f0 >> 3;
      }
      uStack_f0 = uStack_f0 + uVar42 * -8;
    }
    else {
      uVar42 = uStack_f0 >> 3;
      uStack_f0 = uStack_f0 & 7;
    }
    puStack_e8 = (ulong *)((byte *)((long)param_5 + (long)puVar48) + -(ulong)uVar42);
    uStack_f8 = *puStack_e8;
    puVar43 = puStack_e8;
  }
  else {
    puVar43 = (ulong *)&UNK_00814388;
    puStack_e8 = (ulong *)&UNK_00814388;
  }
LAB_00154138:
  lVar37 = *plVar12 + 8;
  uVar42 = *(uint *)(plVar12[2] + 4);
  uStack_f0 = uVar42 + uStack_f0;
  uStack_c0 = uStack_f8 >> ((ulong)-uStack_f0 & 0x3f) &
              (ulong)*(uint *)(&UNK_00814304 + (ulong)uVar42 * 4);
  iVar24 = (int)param_5;
  if (uStack_f0 < 0x41) {
    if (puVar43 < puVar25) {
      puVar48 = param_5;
      if (puVar43 == param_5) goto LAB_001541c4;
      uVar42 = (int)puVar43 - iVar24;
      if (param_5 <= (ulong *)((long)puVar43 - (ulong)(uStack_f0 >> 3))) {
        uVar42 = uStack_f0 >> 3;
      }
      puVar48 = (ulong *)((long)puVar43 - (ulong)uVar42);
      uStack_f8 = *puVar48;
      uStack_f0 = uStack_f0 + uVar42 * -8;
    }
    else {
      puVar48 = (ulong *)((long)puVar43 - (ulong)(uStack_f0 >> 3));
      uStack_f8 = *puVar48;
      uStack_f0 = uStack_f0 & 7;
    }
    puStack_e8 = puVar48;
  }
  else {
    puVar48 = (ulong *)&UNK_00814388;
    puStack_e8 = (ulong *)&UNK_00814388;
  }
LAB_001541c4:
  pbVar45 = (byte *)((long)plVar12 + 0x76a4);
  lVar1 = plVar12[2] + 8;
  uVar42 = *(uint *)(plVar12[1] + 4);
  uStack_f0 = uVar42 + uStack_f0;
  uStack_b0 = uStack_f8 >> ((ulong)-uStack_f0 & 0x3f) &
              (ulong)*(uint *)(&UNK_00814304 + (ulong)uVar42 * 4);
  if (uStack_f0 < 0x41) {
    if (puVar48 < puVar25) {
      if (puVar48 != param_5) {
        uVar42 = (int)puVar48 - iVar24;
        if (param_5 <= (ulong *)((long)puVar48 - (ulong)(uStack_f0 >> 3))) {
          uVar42 = uStack_f0 >> 3;
        }
        puStack_e8 = (ulong *)((long)puVar48 - (ulong)uVar42);
        uStack_f0 = uStack_f0 + uVar42 * -8;
        uStack_f8 = *puStack_e8;
      }
    }
    else {
      puStack_e8 = (ulong *)((long)puVar48 - (ulong)(uStack_f0 >> 3));
      uStack_f0 = uStack_f0 & 7;
      uStack_f8 = *puStack_e8;
    }
  }
  else {
    puStack_e8 = (ulong *)&UNK_00814388;
  }
  lVar2 = plVar12[1] + 8;
  do {
    puVar3 = (ushort *)(lVar37 + uStack_d0 * 8);
    puVar4 = (ushort *)(lVar2 + uStack_b0 * 8);
    puVar5 = (ushort *)(lVar1 + uStack_c0 * 8);
    uVar49 = (ulong)*(uint *)(puVar4 + 2);
    uVar50 = (ulong)*(uint *)(puVar3 + 2);
    uVar42 = *(uint *)(puVar5 + 2);
    bVar6 = (byte)puVar3[1];
    bVar7 = (byte)puVar4[1];
    bVar8 = (byte)puVar5[1];
    uVar35 = (uint)bVar8;
    puVar48 = auStack_a0;
    if (bVar8 < 2) {
      bVar10 = *(uint *)(puVar3 + 2) == 0;
      if (bVar8 != 0) {
        if (bVar10) {
          uVar42 = uVar42 + 1;
        }
        uVar16 = (ulong)uStack_f0;
        uStack_f0 = uStack_f0 + 1;
        lVar39 = (ulong)uVar42 - ((long)(uStack_f8 << (uVar16 & 0x3f)) >> 0x3f);
        if (lVar39 == 3) {
          uVar16 = (auStack_a0[0] - 1) - (ulong)(auStack_a0[0] - 1 == 0);
        }
        else {
          uVar16 = auStack_a0[lVar39] - (ulong)(auStack_a0[lVar39] == 0);
          if (lVar39 == 1) goto LAB_00154320;
        }
        goto code_r0x001542f4;
      }
      uVar16 = auStack_a0[bVar10];
      puVar48 = auStack_a0 + !bVar10;
    }
    else {
      uVar16 = (ulong)uStack_f0;
      uStack_f0 = uStack_f0 + uVar35;
      uVar16 = ((uStack_f8 << (uVar16 & 0x3f)) >> ((ulong)-uVar35 & 0x3f)) + (ulong)uVar42;
code_r0x001542f4:
      auStack_a0[2] = auStack_a0[1];
    }
LAB_00154320:
    auStack_a0[0] = uVar16;
    auStack_a0[1] = *puVar48;
    if (bVar7 != 0) {
      uVar15 = (ulong)uStack_f0;
      uStack_f0 = uStack_f0 + bVar7;
      uVar49 = ((uStack_f8 << (uVar15 & 0x3f)) >> ((ulong)-(uint)bVar7 & 0x3f)) + uVar49;
    }
    if (0x1e < ((uint)bVar7 + (uint)bVar6 + uVar35 & 0xff)) {
      if (uStack_f0 < 0x41) {
        if (puStack_e8 < puVar25) {
          if (puStack_e8 == param_5) goto code_r0x00154360;
          uVar42 = (int)puStack_e8 - iVar24;
          if (param_5 <= (ulong *)((long)puStack_e8 - (ulong)(uStack_f0 >> 3))) {
            uVar42 = uStack_f0 >> 3;
          }
          uStack_f0 = uStack_f0 + uVar42 * -8;
        }
        else {
          uVar42 = uStack_f0 >> 3;
          uStack_f0 = uStack_f0 & 7;
        }
        puStack_e8 = (ulong *)((long)puStack_e8 - (ulong)uVar42);
        uStack_f8 = *puStack_e8;
      }
      else {
        puStack_e8 = (ulong *)&UNK_00814388;
      }
    }
code_r0x00154360:
    if (bVar6 != 0) {
      uVar15 = (ulong)uStack_f0;
      uStack_f0 = uStack_f0 + bVar6;
      uVar50 = ((uStack_f8 << (uVar15 & 0x3f)) >> ((ulong)-(uint)bVar6 & 0x3f)) + uVar50;
    }
    iVar47 = (int)param_7;
    iVar46 = iVar47 + -1;
    if (iVar46 != 0) {
      iVar9 = uStack_f0 + *(byte *)((long)puVar3 + 3);
      uStack_d0 = (uStack_f8 >> ((ulong)(uint)-iVar9 & 0x3f) &
                  (ulong)*(uint *)(&UNK_00814304 + (ulong)(uint)*(byte *)((long)puVar3 + 3) * 4)) +
                  (ulong)*puVar3;
      iVar9 = iVar9 + (uint)*(byte *)((long)puVar4 + 3);
      uStack_b0 = (uStack_f8 >> ((ulong)(uint)-iVar9 & 0x3f) &
                  (ulong)*(uint *)(&UNK_00814304 + (ulong)(uint)*(byte *)((long)puVar4 + 3) * 4)) +
                  (ulong)*puVar4;
      uStack_f0 = iVar9 + (uint)*(byte *)((long)puVar5 + 3);
      uStack_c0 = (uStack_f8 >> ((ulong)-uStack_f0 & 0x3f) &
                  (ulong)*(uint *)(&UNK_00814304 + (ulong)(uint)*(byte *)((long)puVar5 + 3) * 4)) +
                  (ulong)*puVar5;
      if (uStack_f0 < 0x41) {
        if (puStack_e8 < puVar25) {
          if (puStack_e8 != param_5) {
            uVar42 = (int)puStack_e8 - iVar24;
            if (param_5 <= (ulong *)((long)puStack_e8 - (ulong)(uStack_f0 >> 3))) {
              uVar42 = uStack_f0 >> 3;
            }
            uStack_f0 = uStack_f0 + uVar42 * -8;
            goto code_r0x00154464;
          }
        }
        else {
          uVar42 = uStack_f0 >> 3;
          uStack_f0 = uStack_f0 & 7;
code_r0x00154464:
          puStack_e8 = (ulong *)((long)puStack_e8 - (ulong)uVar42);
          uStack_f8 = *puStack_e8;
        }
        pbVar28 = (byte *)plVar12[0xed3];
        if (pbStack_88 + uVar50 <= pbVar28) goto code_r0x00154484;
      }
      else {
        puStack_e8 = (ulong *)&UNK_00814388;
        pbVar28 = (byte *)plVar12[0xed3];
        if (pbStack_88 + uVar50 <= pbVar28) goto code_r0x00154484;
      }
      if (iVar47 < 1) {
        return (byte *)0xffffffffffffffec;
      }
code_r0x001547d8:
      uVar15 = (long)pbVar28 - (long)pbStack_88;
      if (uVar15 == 0) goto code_r0x00154a08;
      if ((ulong)((long)pbVar11 - (long)pbVar36) < uVar15) {
        return (byte *)0xffffffffffffffba;
      }
      uVar31 = (long)pbVar36 - (long)pbStack_88;
      pbVar27 = pbVar36 + uVar15;
      if (((long)uVar31 < -7) && (7 < uVar15)) {
        if (uVar31 < 0xfffffffffffffff0) {
          pbVar28 = pbVar27 + -0x20;
          if (pbVar36 <= pbVar28) {
            uVar51 = *(undefined8 *)pbStack_88;
            *(undefined8 *)(pbVar36 + 8) = *(undefined8 *)(pbStack_88 + 8);
            *(undefined8 *)pbVar36 = uVar51;
            if (0x10 < (ulong)((long)pbVar28 - (long)pbVar36)) {
              pbVar21 = pbVar36 + 0x10;
              pbVar13 = pbStack_88;
              do {
                uVar51 = *(undefined8 *)(pbVar13 + 0x10);
                *(undefined8 *)(pbVar21 + 8) = *(undefined8 *)(pbVar13 + 0x18);
                *(undefined8 *)pbVar21 = uVar51;
                uVar51 = *(undefined8 *)(pbVar13 + 0x20);
                *(undefined8 *)(pbVar21 + 0x18) = *(undefined8 *)(pbVar13 + 0x28);
                *(undefined8 *)(pbVar21 + 0x10) = uVar51;
                pbVar21 = pbVar21 + 0x20;
                pbVar13 = pbVar13 + 0x20;
              } while (pbVar21 < pbVar28);
            }
            pbStack_88 = pbStack_88 + ((long)pbVar28 - (long)pbVar36);
code_r0x001548ac:
            pbVar36 = pbVar36 + (uVar15 - (long)pbVar28);
            if ((pbVar36 < (byte *)0x8) || ((ulong)((long)pbVar28 - (long)pbStack_88) < 0x40)) {
              pbVar21 = pbVar28;
            }
            else {
              if (pbVar36 < (byte *)0x40) {
                pbVar38 = (byte *)0x0;
              }
              else {
                pbVar38 = (byte *)((ulong)pbVar36 & 0xffffffffffffffc0);
                pbVar13 = pbVar28 + 0x20;
                pbVar41 = pbStack_88 + 0x20;
                pbVar21 = pbVar38;
                do {
                  uVar51 = *(undefined8 *)(pbVar41 + -0x20);
                  uVar53 = *(undefined8 *)(pbVar41 + -8);
                  uVar52 = *(undefined8 *)(pbVar41 + -0x10);
                  uVar56 = *(undefined8 *)(pbVar41 + 8);
                  uVar54 = *(undefined8 *)pbVar41;
                  uVar60 = *(undefined8 *)(pbVar41 + 0x18);
                  uVar57 = *(undefined8 *)(pbVar41 + 0x10);
                  *(undefined8 *)(pbVar13 + -0x18) = *(undefined8 *)(pbVar41 + -0x18);
                  *(undefined8 *)(pbVar13 + -0x20) = uVar51;
                  *(undefined8 *)(pbVar13 + -8) = uVar53;
                  *(undefined8 *)(pbVar13 + -0x10) = uVar52;
                  *(undefined8 *)(pbVar13 + 8) = uVar56;
                  *(undefined8 *)pbVar13 = uVar54;
                  *(undefined8 *)(pbVar13 + 0x18) = uVar60;
                  *(undefined8 *)(pbVar13 + 0x10) = uVar57;
                  pbVar21 = pbVar21 + -0x40;
                  pbVar13 = pbVar13 + 0x40;
                  pbVar41 = pbVar41 + 0x40;
                } while (pbVar21 != (byte *)0x0);
                if (pbVar36 == pbVar38) goto code_r0x00154a00;
                if (((ulong)pbVar36 & 0x38) == 0) {
                  pbStack_88 = pbStack_88 + (long)pbVar38;
                  pbVar21 = pbVar28 + (long)pbVar38;
                  goto code_r0x001549d0;
                }
              }
              pbVar41 = (byte *)((ulong)pbVar36 & 0xfffffffffffffff8);
              lVar39 = (long)pbVar38 - (long)pbVar41;
              pbVar21 = pbVar28 + (long)pbVar38;
              pbVar13 = pbStack_88 + (long)pbVar38;
              do {
                *(undefined8 *)pbVar21 = *(undefined8 *)pbVar13;
                lVar39 = lVar39 + 8;
                pbVar21 = pbVar21 + 8;
                pbVar13 = pbVar13 + 8;
              } while (lVar39 != 0);
              pbVar21 = pbVar28 + (long)pbVar41;
              pbStack_88 = pbStack_88 + (long)pbVar41;
              if (pbVar36 == pbVar41) goto code_r0x00154a00;
            }
code_r0x001549d0:
            do {
              pbVar13 = pbVar21 + 1;
              *pbVar21 = *pbStack_88;
              pbVar21 = pbVar13;
              pbStack_88 = pbStack_88 + 1;
            } while (pbVar13 != pbVar28 + (long)pbVar36);
            goto code_r0x00154a00;
          }
        }
        pbVar28 = pbVar36;
        if ((long)uVar15 < 1) goto code_r0x00154a00;
        goto code_r0x001548ac;
      }
      if ((long)uVar15 < 1) goto code_r0x00154a00;
      pbVar28 = pbVar36 + (long)pbVar28 + -(long)pbStack_88;
      if (pbVar28 <= pbVar36 + 1) {
        pbVar28 = pbVar36 + 1;
      }
      uVar29 = (long)pbVar28 - (long)pbVar36;
      if ((uVar29 < 8) || (uVar31 < 0x40)) goto code_r0x001549f0;
      if (uVar29 < 0x40) {
        uVar31 = 0;
        goto code_r0x00154994;
      }
      uVar31 = uVar29 & 0xffffffffffffffc0;
      pbVar28 = pbVar36 + 0x20;
      pbVar21 = pbStack_88 + 0x20;
      uVar40 = uVar31;
      do {
        uVar51 = *(undefined8 *)(pbVar21 + -0x20);
        uVar53 = *(undefined8 *)(pbVar21 + -8);
        uVar52 = *(undefined8 *)(pbVar21 + -0x10);
        uVar56 = *(undefined8 *)(pbVar21 + 8);
        uVar54 = *(undefined8 *)pbVar21;
        uVar60 = *(undefined8 *)(pbVar21 + 0x18);
        uVar57 = *(undefined8 *)(pbVar21 + 0x10);
        *(undefined8 *)(pbVar28 + -0x18) = *(undefined8 *)(pbVar21 + -0x18);
        *(undefined8 *)(pbVar28 + -0x20) = uVar51;
        *(undefined8 *)(pbVar28 + -8) = uVar53;
        *(undefined8 *)(pbVar28 + -0x10) = uVar52;
        *(undefined8 *)(pbVar28 + 8) = uVar56;
        *(undefined8 *)pbVar28 = uVar54;
        *(undefined8 *)(pbVar28 + 0x18) = uVar60;
        *(undefined8 *)(pbVar28 + 0x10) = uVar57;
        uVar40 = uVar40 - 0x40;
        pbVar28 = pbVar28 + 0x40;
        pbVar21 = pbVar21 + 0x40;
      } while (uVar40 != 0);
      if (uVar29 != uVar31) {
        if ((uVar29 & 0x38) == 0) {
          pbStack_88 = pbStack_88 + uVar31;
          pbVar36 = pbVar36 + uVar31;
        }
        else {
code_r0x00154994:
          uVar40 = uVar29 & 0xfffffffffffffff8;
          lVar39 = uVar31 - uVar40;
          pbVar28 = pbStack_88 + uVar31;
          pbVar21 = pbVar36 + uVar31;
          do {
            *(undefined8 *)pbVar21 = *(undefined8 *)pbVar28;
            lVar39 = lVar39 + 8;
            pbVar28 = pbVar28 + 8;
            pbVar21 = pbVar21 + 8;
          } while (lVar39 != 0);
          pbVar36 = pbVar36 + uVar40;
          pbStack_88 = pbStack_88 + uVar40;
          if (uVar29 == uVar40) goto code_r0x00154a00;
        }
code_r0x001549f0:
        do {
          pbVar28 = pbVar36 + 1;
          *pbVar36 = *pbStack_88;
          pbVar36 = pbVar28;
          pbStack_88 = pbStack_88 + 1;
        } while (pbVar28 < pbVar27);
      }
code_r0x00154a00:
      uVar50 = uVar50 - uVar15;
      pbVar36 = pbVar27;
code_r0x00154a08:
      pbVar27 = (byte *)((long)plVar12 + 0x176a4);
      *(undefined4 *)(plVar12 + 0xed4) = 0;
      pbVar28 = pbVar36 + uVar50;
      pbVar21 = pbVar28 + -uVar16;
      Hint_Prefetch(pbVar21,0,0,0);
      if ((pbVar27 < pbVar45 + uVar50) ||
         (pbVar13 = (byte *)(uVar50 + uVar49), pbVar11 + -0x20 < pbVar36 + (long)pbVar13)) {
        pbStack_88 = pbVar45;
        uStack_80 = uVar50;
        uStack_78 = uVar49;
        uStack_70 = uVar16;
        pbVar13 = (byte *)func_0x00155c78(pbVar36,pbVar11,&uStack_80,&pbStack_88,pbVar27,pbVar33,
                                          lVar34,uVar26);
      }
      else {
        uVar51 = *(undefined8 *)pbVar45;
        *(undefined8 *)(pbVar36 + 8) = *(undefined8 *)((long)plVar12 + 0x76ac);
        *(undefined8 *)pbVar36 = uVar51;
        if (0x10 < uVar50) {
          uVar51 = *(undefined8 *)((long)plVar12 + 0x76b4);
          *(undefined8 *)(pbVar36 + 0x18) = *(undefined8 *)((long)plVar12 + 0x76bc);
          *(undefined8 *)(pbVar36 + 0x10) = uVar51;
          if (0x10 < uVar50 - 0x10) {
            pbVar41 = pbVar36 + 0x20;
            puVar20 = (undefined8 *)((long)plVar12 + 0x76d4);
            do {
              uVar51 = puVar20[-2];
              *(undefined8 *)(pbVar41 + 8) = puVar20[-1];
              *(undefined8 *)pbVar41 = uVar51;
              uVar51 = *puVar20;
              *(undefined8 *)(pbVar41 + 0x18) = puVar20[1];
              *(undefined8 *)(pbVar41 + 0x10) = uVar51;
              pbVar41 = pbVar41 + 0x20;
              puVar20 = puVar20 + 4;
            } while (pbVar41 < pbVar28);
          }
        }
        pbStack_88 = pbVar45 + uVar50;
        if ((ulong)((long)pbVar28 - (long)pbVar33) < uVar16) {
          if ((ulong)((long)pbVar28 - lVar34) < uVar16) {
            return (byte *)0xffffffffffffffec;
          }
          lVar44 = (long)pbVar21 - (long)pbVar33;
          lVar39 = uVar26 + lVar44;
          if (lVar39 + uVar49 <= uVar26) {
            _memmove(pbVar28,lVar39,uVar49);
            goto joined_r0x00154b24;
          }
          _memmove(pbVar28,lVar39,-lVar44);
          pbVar28 = pbVar28 + -lVar44;
          uVar49 = lVar44 + uVar49;
          pbVar21 = pbVar33;
        }
        if (uVar16 < 0x10) {
          if (uVar16 < 8) {
            iVar9 = *(int *)(&UNK_008143b0 + uVar16 * 4);
            *pbVar28 = *pbVar21;
            pbVar28[1] = pbVar21[1];
            pbVar28[2] = pbVar21[2];
            pbVar28[3] = pbVar21[3];
            pbVar45 = pbVar21 + *(uint *)(&UNK_00814390 + uVar16 * 4);
            pbVar21 = pbVar45 + -(long)iVar9;
            *(undefined4 *)(pbVar28 + 4) = *(undefined4 *)pbVar45;
          }
          else {
            *(undefined8 *)pbVar28 = *(undefined8 *)pbVar21;
          }
          if (8 < uVar49) {
            pbVar45 = pbVar21 + 8;
            pbVar41 = pbVar28 + 8;
            if ((long)pbVar41 - (long)pbVar45 < 0x10) {
              do {
                pbVar21 = pbVar41 + 8;
                *(undefined8 *)pbVar41 = *(undefined8 *)pbVar45;
                pbVar45 = pbVar45 + 8;
                pbVar41 = pbVar21;
              } while (pbVar21 < pbVar28 + uVar49);
            }
            else {
              uVar51 = *(undefined8 *)pbVar45;
              *(undefined8 *)(pbVar28 + 0x10) = *(undefined8 *)(pbVar21 + 0x10);
              *(undefined8 *)pbVar41 = uVar51;
              if (0x10 < uVar49 - 8) {
                pbVar45 = pbVar28 + 0x18;
                pbVar21 = pbVar21 + 0x28;
                do {
                  uVar51 = *(undefined8 *)(pbVar21 + -0x10);
                  *(undefined8 *)(pbVar45 + 8) = *(undefined8 *)(pbVar21 + -8);
                  *(undefined8 *)pbVar45 = uVar51;
                  uVar51 = *(undefined8 *)pbVar21;
                  *(undefined8 *)(pbVar45 + 0x18) = *(undefined8 *)(pbVar21 + 8);
                  *(undefined8 *)(pbVar45 + 0x10) = uVar51;
                  pbVar45 = pbVar45 + 0x20;
                  pbVar21 = pbVar21 + 0x20;
                } while (pbVar45 < pbVar28 + uVar49);
              }
            }
          }
        }
        else {
          uVar51 = *(undefined8 *)pbVar21;
          *(undefined8 *)(pbVar28 + 8) = *(undefined8 *)(pbVar21 + 8);
          *(undefined8 *)pbVar28 = uVar51;
          if (0x10 < uVar49) {
            pbVar45 = pbVar28 + 0x10;
            do {
              uVar51 = *(undefined8 *)(pbVar21 + 0x10);
              *(undefined8 *)(pbVar45 + 8) = *(undefined8 *)(pbVar21 + 0x18);
              *(undefined8 *)pbVar45 = uVar51;
              uVar51 = *(undefined8 *)(pbVar21 + 0x20);
              *(undefined8 *)(pbVar45 + 0x18) = *(undefined8 *)(pbVar21 + 0x28);
              *(undefined8 *)(pbVar45 + 0x10) = uVar51;
              pbVar45 = pbVar45 + 0x20;
              pbVar21 = pbVar21 + 0x20;
            } while (pbVar45 < pbVar28 + uVar49);
          }
        }
      }
joined_r0x00154b24:
      if ((byte *)0xffffffffffffff88 < pbVar13) {
        return pbVar13;
      }
      pbVar36 = pbVar36 + (long)pbVar13;
      if (iVar47 < 2) {
        if (iVar46 != 0) {
          return (byte *)0xffffffffffffffec;
        }
      }
      else {
        do {
          puVar3 = (ushort *)(lVar37 + uStack_d0 * 8);
          puVar4 = (ushort *)(lVar2 + uStack_b0 * 8);
          puVar5 = (ushort *)(lVar1 + uStack_c0 * 8);
          uVar49 = (ulong)*(uint *)(puVar4 + 2);
          uVar50 = (ulong)*(uint *)(puVar3 + 2);
          uVar42 = *(uint *)(puVar5 + 2);
          bVar6 = (byte)puVar3[1];
          bVar7 = (byte)puVar4[1];
          bVar8 = (byte)puVar5[1];
          uVar35 = (uint)bVar8;
          puVar48 = auStack_a0;
          if (bVar8 < 2) {
            bVar10 = *(uint *)(puVar3 + 2) == 0;
            if (bVar8 != 0) {
              if (bVar10) {
                uVar42 = uVar42 + 1;
              }
              uVar16 = (ulong)uStack_f0;
              uStack_f0 = uStack_f0 + 1;
              lVar39 = (ulong)uVar42 - ((long)(uStack_f8 << (uVar16 & 0x3f)) >> 0x3f);
              if (lVar39 == 3) {
                uVar16 = (auStack_a0[0] - 1) - (ulong)(auStack_a0[0] - 1 == 0);
              }
              else {
                uVar16 = auStack_a0[lVar39] - (ulong)(auStack_a0[lVar39] == 0);
                if (lVar39 == 1) goto LAB_00154bdc;
              }
              goto code_r0x00154bb0;
            }
            uVar16 = auStack_a0[bVar10];
            puVar48 = auStack_a0 + !bVar10;
          }
          else {
            uVar16 = (ulong)uStack_f0;
            uStack_f0 = uStack_f0 + uVar35;
            uVar16 = ((uStack_f8 << (uVar16 & 0x3f)) >> ((ulong)-uVar35 & 0x3f)) + (ulong)uVar42;
code_r0x00154bb0:
            auStack_a0[2] = auStack_a0[1];
          }
LAB_00154bdc:
          auStack_a0[0] = uVar16;
          auStack_a0[1] = *puVar48;
          if (bVar7 != 0) {
            uVar15 = (ulong)uStack_f0;
            uStack_f0 = uStack_f0 + bVar7;
            uVar49 = ((uStack_f8 << (uVar15 & 0x3f)) >> ((ulong)-(uint)bVar7 & 0x3f)) + uVar49;
          }
          if (0x1e < ((uint)bVar7 + (uint)bVar6 + uVar35 & 0xff)) {
            if (uStack_f0 < 0x41) {
              if (puStack_e8 < puVar25) {
                if (puStack_e8 != param_5) {
                  uVar42 = (int)puStack_e8 - iVar24;
                  if (param_5 <= (ulong *)((long)puStack_e8 - (ulong)(uStack_f0 >> 3))) {
                    uVar42 = uStack_f0 >> 3;
                  }
                  puStack_e8 = (ulong *)((long)puStack_e8 - (ulong)uVar42);
                  uStack_f0 = uStack_f0 + uVar42 * -8;
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
          if (bVar6 != 0) {
            uVar15 = (ulong)uStack_f0;
            uStack_f0 = uStack_f0 + bVar6;
            uVar50 = ((uStack_f8 << (uVar15 & 0x3f)) >> ((ulong)-(uint)bVar6 & 0x3f)) + uVar50;
          }
          if (iVar46 != 1) {
            iVar47 = uStack_f0 + *(byte *)((long)puVar3 + 3);
            uStack_d0 = (uStack_f8 >> ((ulong)(uint)-iVar47 & 0x3f) &
                        (ulong)*(uint *)(&UNK_00814304 +
                                        (ulong)(uint)*(byte *)((long)puVar3 + 3) * 4)) +
                        (ulong)*puVar3;
            iVar47 = iVar47 + (uint)*(byte *)((long)puVar4 + 3);
            uStack_b0 = (uStack_f8 >> ((ulong)(uint)-iVar47 & 0x3f) &
                        (ulong)*(uint *)(&UNK_00814304 +
                                        (ulong)(uint)*(byte *)((long)puVar4 + 3) * 4)) +
                        (ulong)*puVar4;
            uStack_f0 = iVar47 + (uint)*(byte *)((long)puVar5 + 3);
            uStack_c0 = (uStack_f8 >> ((ulong)-uStack_f0 & 0x3f) &
                        (ulong)*(uint *)(&UNK_00814304 +
                                        (ulong)(uint)*(byte *)((long)puVar5 + 3) * 4)) +
                        (ulong)*puVar5;
            if (uStack_f0 < 0x41) {
              if (puStack_e8 < puVar25) {
                if (puStack_e8 == param_5) goto LAB_00154d14;
                uVar42 = (int)puStack_e8 - iVar24;
                if (param_5 <= (ulong *)((long)puStack_e8 - (ulong)(uStack_f0 >> 3))) {
                  uVar42 = uStack_f0 >> 3;
                }
                uStack_f0 = uStack_f0 + uVar42 * -8;
              }
              else {
                uVar42 = uStack_f0 >> 3;
                uStack_f0 = uStack_f0 & 7;
              }
              puStack_e8 = (ulong *)((long)puStack_e8 - (ulong)uVar42);
              uStack_f8 = *puStack_e8;
            }
            else {
              puStack_e8 = (ulong *)&UNK_00814388;
            }
          }
LAB_00154d14:
          pbVar45 = pbVar36 + uVar50;
          pbVar28 = pbVar45 + -uVar16;
          Hint_Prefetch(pbVar28,0,0,0);
          if ((pbVar27 < pbStack_88 + uVar50) ||
             (pbVar21 = (byte *)(uVar50 + uVar49), pbVar11 + -0x20 < pbVar36 + (long)pbVar21)) {
            uStack_80 = uVar50;
            uStack_78 = uVar49;
            uStack_70 = uVar16;
            pbVar21 = (byte *)func_0x00155c78(pbVar36,pbVar11,&uStack_80,&pbStack_88,pbVar27,pbVar33
                                              ,lVar34,uVar26);
          }
          else {
            uVar51 = *(undefined8 *)pbStack_88;
            *(undefined8 *)(pbVar36 + 8) = *(undefined8 *)(pbStack_88 + 8);
            *(undefined8 *)pbVar36 = uVar51;
            if (0x10 < uVar50) {
              uVar51 = *(undefined8 *)(pbStack_88 + 0x10);
              *(undefined8 *)(pbVar36 + 0x18) = *(undefined8 *)(pbStack_88 + 0x18);
              *(undefined8 *)(pbVar36 + 0x10) = uVar51;
              if (0x10 < uVar50 - 0x10) {
                pbVar13 = pbVar36 + 0x20;
                pbVar41 = pbStack_88 + 0x30;
                do {
                  uVar51 = *(undefined8 *)(pbVar41 + -0x10);
                  *(undefined8 *)(pbVar13 + 8) = *(undefined8 *)(pbVar41 + -8);
                  *(undefined8 *)pbVar13 = uVar51;
                  uVar51 = *(undefined8 *)pbVar41;
                  *(undefined8 *)(pbVar13 + 0x18) = *(undefined8 *)(pbVar41 + 8);
                  *(undefined8 *)(pbVar13 + 0x10) = uVar51;
                  pbVar13 = pbVar13 + 0x20;
                  pbVar41 = pbVar41 + 0x20;
                } while (pbVar13 < pbVar45);
              }
            }
            pbStack_88 = pbStack_88 + uVar50;
            if ((ulong)((long)pbVar45 - (long)pbVar33) < uVar16) {
              if ((ulong)((long)pbVar45 - lVar34) < uVar16) {
                return (byte *)0xffffffffffffffec;
              }
              lVar44 = (long)pbVar28 - (long)pbVar33;
              lVar39 = uVar26 + lVar44;
              if (lVar39 + uVar49 <= uVar26) {
                _memmove(pbVar45,lVar39,uVar49);
                goto joined_r0x00154e58;
              }
              _memmove(pbVar45,lVar39,-lVar44);
              pbVar45 = pbVar45 + -lVar44;
              uVar49 = lVar44 + uVar49;
              pbVar28 = pbVar33;
            }
            if (uVar16 < 0x10) {
              if (uVar16 < 8) {
                iVar47 = *(int *)(&UNK_008143b0 + uVar16 * 4);
                *pbVar45 = *pbVar28;
                pbVar45[1] = pbVar28[1];
                pbVar45[2] = pbVar28[2];
                pbVar45[3] = pbVar28[3];
                pbVar13 = pbVar28 + *(uint *)(&UNK_00814390 + uVar16 * 4);
                pbVar28 = pbVar13 + -(long)iVar47;
                *(undefined4 *)(pbVar45 + 4) = *(undefined4 *)pbVar13;
              }
              else {
                *(undefined8 *)pbVar45 = *(undefined8 *)pbVar28;
              }
              if (8 < uVar49) {
                pbVar13 = pbVar28 + 8;
                pbVar41 = pbVar45 + 8;
                if ((long)pbVar41 - (long)pbVar13 < 0x10) {
                  do {
                    pbVar28 = pbVar41 + 8;
                    *(undefined8 *)pbVar41 = *(undefined8 *)pbVar13;
                    pbVar13 = pbVar13 + 8;
                    pbVar41 = pbVar28;
                  } while (pbVar28 < pbVar45 + uVar49);
                }
                else {
                  uVar51 = *(undefined8 *)pbVar13;
                  *(undefined8 *)(pbVar45 + 0x10) = *(undefined8 *)(pbVar28 + 0x10);
                  *(undefined8 *)pbVar41 = uVar51;
                  if (0x10 < uVar49 - 8) {
                    pbVar13 = pbVar45 + 0x18;
                    pbVar28 = pbVar28 + 0x28;
                    do {
                      uVar51 = *(undefined8 *)(pbVar28 + -0x10);
                      *(undefined8 *)(pbVar13 + 8) = *(undefined8 *)(pbVar28 + -8);
                      *(undefined8 *)pbVar13 = uVar51;
                      uVar51 = *(undefined8 *)pbVar28;
                      *(undefined8 *)(pbVar13 + 0x18) = *(undefined8 *)(pbVar28 + 8);
                      *(undefined8 *)(pbVar13 + 0x10) = uVar51;
                      pbVar13 = pbVar13 + 0x20;
                      pbVar28 = pbVar28 + 0x20;
                    } while (pbVar13 < pbVar45 + uVar49);
                  }
                }
              }
            }
            else {
              uVar51 = *(undefined8 *)pbVar28;
              *(undefined8 *)(pbVar45 + 8) = *(undefined8 *)(pbVar28 + 8);
              *(undefined8 *)pbVar45 = uVar51;
              if (0x10 < uVar49) {
                pbVar13 = pbVar45 + 0x10;
                do {
                  uVar51 = *(undefined8 *)(pbVar28 + 0x10);
                  *(undefined8 *)(pbVar13 + 8) = *(undefined8 *)(pbVar28 + 0x18);
                  *(undefined8 *)pbVar13 = uVar51;
                  uVar51 = *(undefined8 *)(pbVar28 + 0x20);
                  *(undefined8 *)(pbVar13 + 0x18) = *(undefined8 *)(pbVar28 + 0x28);
                  *(undefined8 *)(pbVar13 + 0x10) = uVar51;
                  pbVar13 = pbVar13 + 0x20;
                  pbVar28 = pbVar28 + 0x20;
                } while (pbVar13 < pbVar45 + uVar49);
              }
            }
          }
joined_r0x00154e58:
          if ((byte *)0xffffffffffffff88 < pbVar21) {
            return pbVar21;
          }
          pbVar36 = pbVar36 + (long)pbVar21;
          iVar46 = iVar46 + -1;
        } while (iVar46 != 0);
      }
code_r0x00155070:
      if (puStack_e8 != param_5) {
        return (byte *)0xffffffffffffffec;
      }
      if (uStack_f0 != 0x40) {
        return (byte *)0xffffffffffffffec;
      }
      *(ulong *)((long)plVar12 + 0x683c) = CONCAT44((int)auStack_a0[1],(int)auStack_a0[0]);
      *(int *)((long)plVar12 + 0x6844) = (int)auStack_a0[2];
      iVar24 = (int)plVar12[0xed4];
      pbVar33 = pbStack_88;
      goto joined_r0x001550b0;
    }
    pbVar28 = (byte *)plVar12[0xed3];
    if (pbVar28 < pbStack_88 + uVar50) goto code_r0x001547d8;
code_r0x00154484:
    pbVar28 = pbStack_88 + uVar50;
    if ((pbVar27 < pbVar28) ||
       (pbVar21 = (byte *)(uVar50 + uVar49), pbVar28 + -0x20 < pbVar36 + (long)pbVar21)) {
      uStack_80 = uVar50;
      uStack_78 = uVar49;
      uStack_70 = uVar16;
      pbVar21 = (byte *)func_0x00156308(pbVar36,pbVar11,pbVar28 + -0x20,&uStack_80,&pbStack_88,
                                        pbVar27,pbVar33,lVar34,uVar26);
    }
    else {
      pbVar13 = pbVar36 + uVar50;
      uVar51 = *(undefined8 *)pbStack_88;
      *(undefined8 *)(pbVar36 + 8) = *(undefined8 *)(pbStack_88 + 8);
      *(undefined8 *)pbVar36 = uVar51;
      if (0x10 < uVar50) {
        uVar51 = *(undefined8 *)(pbStack_88 + 0x10);
        *(undefined8 *)(pbVar36 + 0x18) = *(undefined8 *)(pbStack_88 + 0x18);
        *(undefined8 *)(pbVar36 + 0x10) = uVar51;
        if (0x10 < uVar50 - 0x10) {
          pbVar41 = pbVar36 + 0x20;
          pbVar38 = pbStack_88 + 0x30;
          do {
            uVar51 = *(undefined8 *)(pbVar38 + -0x10);
            *(undefined8 *)(pbVar41 + 8) = *(undefined8 *)(pbVar38 + -8);
            *(undefined8 *)pbVar41 = uVar51;
            uVar51 = *(undefined8 *)pbVar38;
            *(undefined8 *)(pbVar41 + 0x18) = *(undefined8 *)(pbVar38 + 8);
            *(undefined8 *)(pbVar41 + 0x10) = uVar51;
            pbVar41 = pbVar41 + 0x20;
            pbVar38 = pbVar38 + 0x20;
          } while (pbVar41 < pbVar13);
        }
      }
      pbStack_88 = pbVar28;
      pbVar28 = pbVar13 + -uVar16;
      if ((ulong)((long)pbVar13 - (long)pbVar33) < uVar16) {
        if ((ulong)((long)pbVar13 - lVar34) < uVar16) {
          return (byte *)0xffffffffffffffec;
        }
        lVar44 = (long)(pbVar13 + -uVar16) - (long)pbVar33;
        lVar39 = uVar26 + lVar44;
        if (lVar39 + uVar49 <= uVar26) {
          _memmove(pbVar13,lVar39,uVar49);
          goto LAB_00154570;
        }
        _memmove(pbVar13,lVar39,-lVar44);
        pbVar13 = pbVar13 + -lVar44;
        uVar49 = lVar44 + uVar49;
        pbVar28 = pbVar33;
      }
      if (uVar16 < 0x10) {
        if (uVar16 < 8) {
          iVar46 = *(int *)(&UNK_008143b0 + uVar16 * 4);
          *pbVar13 = *pbVar28;
          pbVar13[1] = pbVar28[1];
          pbVar13[2] = pbVar28[2];
          pbVar13[3] = pbVar28[3];
          pbVar41 = pbVar28 + *(uint *)(&UNK_00814390 + uVar16 * 4);
          pbVar28 = pbVar41 + -(long)iVar46;
          *(undefined4 *)(pbVar13 + 4) = *(undefined4 *)pbVar41;
        }
        else {
          *(undefined8 *)pbVar13 = *(undefined8 *)pbVar28;
        }
        if (8 < uVar49) {
          pbVar41 = pbVar28 + 8;
          pbVar38 = pbVar13 + 8;
          if ((long)pbVar38 - (long)pbVar41 < 0x10) {
            do {
              pbVar28 = pbVar38 + 8;
              *(undefined8 *)pbVar38 = *(undefined8 *)pbVar41;
              pbVar41 = pbVar41 + 8;
              pbVar38 = pbVar28;
            } while (pbVar28 < pbVar13 + uVar49);
          }
          else {
            uVar51 = *(undefined8 *)pbVar41;
            *(undefined8 *)(pbVar13 + 0x10) = *(undefined8 *)(pbVar28 + 0x10);
            *(undefined8 *)pbVar38 = uVar51;
            if (0x10 < uVar49 - 8) {
              pbVar41 = pbVar13 + 0x18;
              pbVar28 = pbVar28 + 0x28;
              do {
                uVar51 = *(undefined8 *)(pbVar28 + -0x10);
                *(undefined8 *)(pbVar41 + 8) = *(undefined8 *)(pbVar28 + -8);
                *(undefined8 *)pbVar41 = uVar51;
                uVar51 = *(undefined8 *)pbVar28;
                *(undefined8 *)(pbVar41 + 0x18) = *(undefined8 *)(pbVar28 + 8);
                *(undefined8 *)(pbVar41 + 0x10) = uVar51;
                pbVar41 = pbVar41 + 0x20;
                pbVar28 = pbVar28 + 0x20;
              } while (pbVar41 < pbVar13 + uVar49);
            }
          }
        }
      }
      else {
        uVar51 = *(undefined8 *)pbVar28;
        *(undefined8 *)(pbVar13 + 8) = *(undefined8 *)(pbVar28 + 8);
        *(undefined8 *)pbVar13 = uVar51;
        if (0x10 < uVar49) {
          pbVar41 = pbVar13 + 0x10;
          do {
            uVar51 = *(undefined8 *)(pbVar28 + 0x10);
            *(undefined8 *)(pbVar41 + 8) = *(undefined8 *)(pbVar28 + 0x18);
            *(undefined8 *)pbVar41 = uVar51;
            uVar51 = *(undefined8 *)(pbVar28 + 0x20);
            *(undefined8 *)(pbVar41 + 0x18) = *(undefined8 *)(pbVar28 + 0x28);
            *(undefined8 *)(pbVar41 + 0x10) = uVar51;
            pbVar41 = pbVar41 + 0x20;
            pbVar28 = pbVar28 + 0x20;
          } while (pbVar41 < pbVar13 + uVar49);
        }
      }
    }
LAB_00154570:
    if ((byte *)0xffffffffffffff88 < pbVar21) {
      return pbVar21;
    }
    pbVar36 = pbVar36 + (long)pbVar21;
    param_7 = (ulong *)(ulong)(iVar47 - 1U);
    if (iVar47 - 1U == 0) goto code_r0x00155070;
  } while( true );
LAB_00153e5c:
  param_23 = puVar22;
  pbVar27 = (byte *)0xffffffffffffffec;
  goto LAB_00153e60;
}

