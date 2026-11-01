
/* WARNING: Type propagation algorithm not settling */

byte * FUN_00152e30(ulong *param_1,undefined8 param_2,undefined8 param_3,ulong *param_4,
                   ulong *param_5,ulong *param_6,ulong *param_7,undefined1 *param_8,ulong param_9,
                   undefined8 param_10,undefined8 param_11,ulong *param_12,undefined8 param_13,
                   byte *param_14,undefined8 param_15,ulong *param_16,undefined1 *param_17,
                   long param_18,byte *param_19,undefined8 param_20,undefined8 *param_21,
                   ulong *param_22,ulong *param_23,long param_24,long param_25,ulong *param_26,
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
  ulong *puVar22;
  int iVar23;
  ulong *puVar24;
  ulong uVar25;
  byte *pbVar26;
  ulong uVar27;
  ulong *puVar28;
  ulong *puVar29;
  byte *pbVar30;
  ulong uVar31;
  ulong *puVar32;
  ulong *puVar33;
  uint uVar34;
  uint uVar35;
  byte *pbVar36;
  long lVar37;
  byte *pbVar38;
  long lVar39;
  ulong uVar40;
  byte *pbVar41;
  byte *pbVar42;
  uint uVar43;
  byte *unaff_x19;
  ulong *unaff_x20;
  byte *unaff_x21;
  ulong *unaff_x22;
  long lVar44;
  long lVar45;
  ulong unaff_x23;
  byte *pbVar46;
  int iVar47;
  byte *unaff_x24;
  undefined1 *unaff_x25;
  ulong *unaff_x26;
  int iVar48;
  ulong *unaff_x27;
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
  ulong uVar57;
  undefined8 uVar58;
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
  
  param_28 = param_4;
  puVar17 = unaff_x30;
code_r0x00152e30:
  param_46 = (ulong)in_x9;
  puVar33 = param_5;
  if ((ulong *)((long)unaff_x20 - (long)puVar17) < unaff_x27) {
    if ((ulong *)((long)unaff_x20 - param_24) < unaff_x27) goto LAB_00153e5c;
    lVar44 = (long)param_1 - (long)puVar17;
    pbVar30 = (byte *)((long)param_31 + lVar44);
    if (pbVar30 + (long)unaff_x28 <= param_31) {
      _memmove(unaff_x20,pbVar30,unaff_x28);
      unaff_x23 = 0x18;
      unaff_x21 = param_19;
      unaff_x22 = param_23;
      goto code_r0x00152f40;
    }
    _memmove(unaff_x20,pbVar30,-lVar44);
    unaff_x20 = (ulong *)((long)unaff_x20 - lVar44);
    unaff_x28 = (ulong *)(lVar44 + (long)unaff_x28);
    param_7 = (ulong *)(ulong)param_20._4_4_;
    unaff_x23 = 0x18;
    param_8 = &param_50;
    puVar33 = param_22;
    param_1 = puVar17;
    unaff_x21 = param_19;
    unaff_x22 = param_23;
  }
  if (unaff_x27 < &MACH_HEADER.ncmds) {
    if ((ulong *)((long)&MACH_HEADER.cputype + 3) < unaff_x27) {
      *unaff_x20 = *param_1;
    }
    else {
      iVar23 = *(int *)(&UNK_008143b0 + (long)unaff_x27 * 4);
      *(byte *)unaff_x20 = (byte)*param_1;
      *(byte *)((long)unaff_x20 + 1) = *(byte *)((long)param_1 + 1);
      *(byte *)((long)unaff_x20 + 2) = *(byte *)((long)param_1 + 2);
      *(byte *)((long)unaff_x20 + 3) = *(byte *)((long)param_1 + 3);
      pbVar30 = (byte *)((long)param_1 + (ulong)*(uint *)(&UNK_00814390 + (long)unaff_x27 * 4));
      param_1 = (ulong *)(pbVar30 + -(long)iVar23);
      *(undefined4 *)((long)unaff_x20 + 4) = *(undefined4 *)pbVar30;
    }
    if (&MACH_HEADER.cpusubtype < unaff_x28) {
      puVar17 = param_1 + 1;
      puVar33 = unaff_x20 + 1;
      if ((long)puVar33 - (long)puVar17 < 0x10) {
        do {
          puVar24 = puVar33 + 1;
          *puVar33 = *puVar17;
          puVar17 = puVar17 + 1;
          puVar33 = puVar24;
        } while (puVar24 < (ulong *)((long)unaff_x20 + (long)unaff_x28));
      }
      else {
        uVar25 = *puVar17;
        unaff_x20[2] = param_1[2];
        *puVar33 = uVar25;
        if (&MACH_HEADER.ncmds < unaff_x28 + -1) {
          puVar17 = unaff_x20 + 3;
          puVar33 = param_1 + 5;
          do {
            uVar25 = puVar33[-2];
            puVar17[1] = puVar33[-1];
            *puVar17 = uVar25;
            uVar25 = *puVar33;
            puVar17[3] = puVar33[1];
            puVar17[2] = uVar25;
            puVar17 = puVar17 + 4;
            puVar33 = puVar33 + 4;
          } while (puVar17 < (ulong *)((long)unaff_x20 + (long)unaff_x28));
        }
      }
      param_7 = (ulong *)(ulong)param_20._4_4_;
      unaff_x23 = 0x18;
      param_8 = &param_50;
      puVar33 = param_22;
      unaff_x21 = param_19;
      unaff_x22 = param_23;
      unaff_x25 = param_17;
    }
  }
  else {
    uVar25 = *param_1;
    unaff_x20[1] = param_1[1];
    *unaff_x20 = uVar25;
    if (&MACH_HEADER.ncmds < unaff_x28) {
      puVar17 = unaff_x20 + 2;
      do {
        uVar25 = param_1[2];
        puVar17[1] = param_1[3];
        *puVar17 = uVar25;
        uVar25 = param_1[4];
        puVar17[3] = param_1[5];
        puVar17[2] = uVar25;
        puVar17 = puVar17 + 4;
        param_1 = param_1 + 4;
      } while (puVar17 < (ulong *)((long)unaff_x20 + (long)unaff_x28));
    }
  }
LAB_00152f44:
  param_5 = puVar33;
  puVar17 = unaff_x26;
  if (unaff_x24 < (byte *)0xffffffffffffff89) {
    puVar17 = (ulong *)((long)param_29 + (long)unaff_x19);
    puVar24 = param_31;
    if (param_28 <= puVar17) {
      puVar24 = param_30;
    }
    lVar44 = (long)((long)puVar24 + (long)puVar17) - (long)param_28;
    Hint_Prefetch(lVar44,0,0,0);
    Hint_Prefetch(lVar44 + 0x40,0,0,0);
    puVar20 = (undefined8 *)(param_8 + (ulong)((uint)param_6 & 7) * (unaff_x23 & 0xffffffff));
    *puVar20 = param_29;
    puVar20[1] = param_9;
    puVar20[2] = param_28;
    unaff_x26 = (ulong *)((long)unaff_x26 + (long)unaff_x24);
    unaff_x19 = (byte *)((long)puVar17 + param_9);
    uVar43 = (uint)param_6 + 1;
    param_6 = param_7;
    if (uVar43 != (uint)param_7) {
      do {
        param_6 = (ulong *)(ulong)uVar43;
        puVar3 = (ushort *)(param_38 + param_37 * 8);
        puVar4 = (ushort *)(param_42 + param_41 * 8);
        puVar5 = (ushort *)(param_40 + param_39 * 8);
        param_9 = (ulong)*(uint *)(puVar4 + 2);
        param_29 = (ulong *)(ulong)*(uint *)(puVar3 + 2);
        uVar35 = *(uint *)(puVar5 + 2);
        bVar6 = (byte)puVar3[1];
        bVar7 = (byte)puVar4[1];
        bVar8 = (byte)puVar5[1];
        uVar34 = (uint)bVar8;
        puVar20 = param_21;
        if (bVar8 < 2) {
          bVar10 = *(uint *)(puVar3 + 2) == 0;
          if (bVar8 != 0) {
            if (bVar10) {
              uVar35 = uVar35 + 1;
            }
            uVar25 = (ulong)param_33;
            param_33 = param_33 + 1;
            lVar44 = (ulong)uVar35 - ((long)(param_32 << (uVar25 & 0x3f)) >> 0x3f);
            if (lVar44 == 3) {
              param_28 = (ulong *)((byte *)((long)param_43 + -1) +
                                  -(ulong)((byte *)((long)param_43 + -1) == (byte *)0x0));
            }
            else {
              param_28 = (ulong *)((long)(&param_43)[lVar44] -
                                  (ulong)((&param_43)[lVar44] == (ulong *)0x0));
              if (lVar44 == 1) goto code_r0x001526cc;
            }
            goto code_r0x001526a0;
          }
          param_28 = *(ulong **)(param_18 + (ulong)bVar10 * 8);
          puVar20 = (undefined8 *)(param_18 + (ulong)!bVar10 * 8);
        }
        else {
          uVar25 = (ulong)param_33;
          param_33 = param_33 + uVar34;
          param_28 = (ulong *)(((param_32 << (uVar25 & 0x3f)) >> ((ulong)-uVar34 & 0x3f)) +
                              (ulong)uVar35);
code_r0x001526a0:
          param_45 = param_44;
        }
code_r0x001526cc:
        param_43 = param_28;
        param_44 = *puVar20;
        if (bVar7 != 0) {
          uVar25 = (ulong)param_33;
          param_33 = param_33 + bVar7;
          param_9 = ((param_32 << (uVar25 & 0x3f)) >> ((ulong)-(uint)bVar7 & 0x3f)) + param_9;
        }
        if (0x1e < ((uint)bVar7 + (uint)bVar6 + uVar34 & 0xff)) {
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
          uVar25 = (ulong)param_33;
          param_33 = param_33 + bVar6;
          param_29 = (ulong *)(((param_32 << (uVar25 & 0x3f)) >> ((ulong)-(uint)bVar6 & 0x3f)) +
                              (long)param_29);
        }
        if (uVar43 == (uint)unaff_x21) {
code_r0x00152804:
          iVar23 = *(int *)((long)unaff_x22 + 0xe64);
        }
        else {
          iVar23 = param_33 + *(byte *)((long)puVar3 + 3);
          param_37 = (param_32 >> ((ulong)(uint)-iVar23 & 0x3f) &
                     (ulong)*(uint *)(&UNK_00814304 + (ulong)(uint)*(byte *)((long)puVar3 + 3) * 4))
                     + (ulong)*puVar3;
          iVar23 = iVar23 + (uint)*(byte *)((long)puVar4 + 3);
          param_41 = (param_32 >> ((ulong)(uint)-iVar23 & 0x3f) &
                     (ulong)*(uint *)(&UNK_00814304 + (ulong)(uint)*(byte *)((long)puVar4 + 3) * 4))
                     + (ulong)*puVar4;
          param_33 = iVar23 + (uint)*(byte *)((long)puVar5 + 3);
          param_39 = (param_32 >> ((ulong)-param_33 & 0x3f) &
                     (ulong)*(uint *)(&UNK_00814304 + (ulong)(uint)*(byte *)((long)puVar5 + 3) * 4))
                     + (ulong)*puVar5;
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
          iVar23 = *(int *)((long)unaff_x22 + 0xe64);
        }
        if (iVar23 != 2) {
          puVar17 = (ulong *)(param_8 + (ulong)(uVar43 & 7) * (unaff_x23 & 0xffffffff));
          uVar25 = *puVar17;
          unaff_x28 = (ulong *)puVar17[1];
          unaff_x27 = (ulong *)puVar17[2];
          unaff_x20 = (ulong *)((long)unaff_x26 + uVar25);
          param_1 = (ulong *)((long)unaff_x20 - (long)unaff_x27);
          Hint_Prefetch(param_1,0,0,0);
          in_x9 = (ulong *)(param_46 + uVar25);
          if ((in_x9 <= param_26) &&
             (unaff_x24 = (byte *)((long)unaff_x28 + uVar25),
             (byte *)((long)unaff_x26 + (long)unaff_x24) <= param_27)) {
            uVar50 = *(ulong *)param_46;
            unaff_x26[1] = *(ulong *)(param_46 + 8);
            *unaff_x26 = uVar50;
            puVar17 = param_30;
            if (0x10 < uVar25) {
              uVar50 = *(ulong *)(param_46 + 0x10);
              unaff_x26[3] = *(ulong *)(param_46 + 0x18);
              unaff_x26[2] = uVar50;
              if (0x10 < uVar25 - 0x10) {
                puVar33 = unaff_x26 + 4;
                puVar24 = (ulong *)(param_46 + 0x30);
                do {
                  uVar25 = puVar24[-2];
                  puVar33[1] = puVar24[-1];
                  *puVar33 = uVar25;
                  uVar25 = *puVar24;
                  puVar33[3] = puVar24[1];
                  puVar33[2] = uVar25;
                  puVar33 = puVar33 + 4;
                  puVar24 = puVar24 + 4;
                } while (puVar33 < unaff_x20);
              }
            }
            goto code_r0x00152e30;
          }
          param_47 = uVar25;
          param_48 = unaff_x28;
          param_49 = unaff_x27;
          unaff_x24 = (byte *)func_0x00155c78(unaff_x26,param_25,&param_47,&param_46,param_26,
                                              param_30,param_24,param_31);
          param_8 = &param_50;
          param_7 = (ulong *)(ulong)param_20._4_4_;
          puVar33 = param_22;
          unaff_x20 = param_6;
          unaff_x27 = param_28;
          goto LAB_00152f44;
        }
        unaff_x28 = (ulong *)(param_8 + (ulong)(uVar43 & 7) * (unaff_x23 & 0xffffffff));
        uVar25 = *unaff_x28;
        puVar33 = *(ulong **)(unaff_x25 + 0x7698);
        puVar17 = (ulong *)(param_46 + uVar25);
        if (puVar17 <= puVar33) goto code_r0x001528b4;
        uVar50 = (long)puVar33 - param_46;
        puVar17 = unaff_x26;
        if (uVar50 != 0) {
          unaff_x20 = param_29;
          if ((ulong)(param_25 - (long)unaff_x26) < uVar50) goto code_r0x00152014;
          uVar25 = (long)unaff_x26 - param_46;
          puVar17 = (ulong *)((long)unaff_x26 + uVar50);
          if (((long)uVar25 < -7) && (7 < uVar50)) {
            if (uVar25 < 0xfffffffffffffff0) {
              puVar33 = puVar17 + -4;
              if (puVar33 < unaff_x26) goto code_r0x00152a24;
              uVar25 = *(ulong *)param_46;
              unaff_x26[1] = *(ulong *)(param_46 + 8);
              *unaff_x26 = uVar25;
              if (0x10 < (ulong)((long)puVar33 - (long)unaff_x26)) {
                puVar24 = unaff_x26 + 2;
                puVar28 = (ulong *)param_46;
                do {
                  uVar25 = puVar28[2];
                  puVar24[1] = puVar28[3];
                  *puVar24 = uVar25;
                  uVar25 = puVar28[4];
                  puVar24[3] = puVar28[5];
                  puVar24[2] = uVar25;
                  puVar24 = puVar24 + 4;
                  puVar28 = puVar28 + 4;
                } while (puVar24 < puVar33);
              }
              param_46 = param_46 + ((long)puVar33 - (long)unaff_x26);
            }
            else {
code_r0x00152a24:
              puVar33 = unaff_x26;
              if ((long)uVar50 < 1) goto code_r0x00152b84;
            }
            pbVar30 = (byte *)((long)unaff_x26 + (uVar50 - (long)puVar33));
            if ((pbVar30 < (byte *)0x8) || ((long)puVar33 - param_46 < 0x40)) {
              puVar24 = puVar33;
            }
            else {
              if (pbVar30 < (byte *)0x40) {
                pbVar36 = (byte *)0x0;
              }
              else {
                pbVar36 = (byte *)((ulong)pbVar30 & 0xffffffffffffffc0);
                puVar24 = puVar33 + 4;
                puVar28 = (ulong *)(param_46 + 0x20);
                pbVar11 = pbVar36;
                do {
                  uVar25 = puVar28[-4];
                  uVar16 = puVar28[-1];
                  uVar49 = puVar28[-2];
                  uVar31 = puVar28[1];
                  uVar15 = *puVar28;
                  uVar40 = puVar28[3];
                  uVar27 = puVar28[2];
                  puVar24[-3] = puVar28[-3];
                  puVar24[-4] = uVar25;
                  puVar24[-1] = uVar16;
                  puVar24[-2] = uVar49;
                  puVar24[1] = uVar31;
                  *puVar24 = uVar15;
                  puVar24[3] = uVar40;
                  puVar24[2] = uVar27;
                  pbVar11 = pbVar11 + -0x40;
                  puVar24 = puVar24 + 8;
                  puVar28 = puVar28 + 8;
                } while (pbVar11 != (byte *)0x0);
                if (pbVar30 == pbVar36) goto code_r0x00152b84;
                if (((ulong)pbVar30 & 0x38) == 0) {
                  param_46 = param_46 + (long)pbVar36;
                  puVar24 = (ulong *)((long)puVar33 + (long)pbVar36);
                  goto code_r0x00152b54;
                }
              }
              pbVar41 = (byte *)((ulong)pbVar30 & 0xfffffffffffffff8);
              lVar44 = (long)pbVar36 - (long)pbVar41;
              pbVar11 = (byte *)(param_46 + (long)pbVar36);
              pbVar36 = (byte *)((long)puVar33 + (long)pbVar36);
              do {
                *(undefined8 *)pbVar36 = *(undefined8 *)pbVar11;
                lVar44 = lVar44 + 8;
                pbVar11 = pbVar11 + 8;
                pbVar36 = pbVar36 + 8;
              } while (lVar44 != 0);
              puVar24 = (ulong *)((long)puVar33 + (long)pbVar41);
              param_46 = (ulong)(param_46 + (long)pbVar41);
              if (pbVar30 == pbVar41) goto code_r0x00152b84;
            }
code_r0x00152b54:
            do {
              puVar28 = (ulong *)((long)puVar24 + 1);
              *(byte *)puVar24 = (byte)*(ulong *)param_46;
              puVar24 = puVar28;
              param_46 = (ulong)(param_46 + 1);
            } while (puVar28 != (ulong *)((long)puVar33 + (long)pbVar30));
          }
          else if (0 < (long)uVar50) {
            pbVar30 = (byte *)((long)unaff_x26 + (long)puVar33) + -param_46;
            if (pbVar30 <= (byte *)((long)unaff_x26 + 1)) {
              pbVar30 = (byte *)((long)unaff_x26 + 1);
            }
            uVar49 = (long)pbVar30 - (long)unaff_x26;
            if ((7 < uVar49) && (0x3f < uVar25)) {
              if (uVar49 < 0x40) {
                uVar16 = 0;
              }
              else {
                uVar16 = uVar49 & 0xffffffffffffffc0;
                puVar33 = unaff_x26 + 4;
                puVar24 = (ulong *)(param_46 + 0x20);
                uVar25 = uVar16;
                do {
                  uVar15 = puVar24[-4];
                  uVar27 = puVar24[-1];
                  uVar31 = puVar24[-2];
                  uVar55 = puVar24[1];
                  uVar40 = *puVar24;
                  uVar59 = puVar24[3];
                  uVar57 = puVar24[2];
                  puVar33[-3] = puVar24[-3];
                  puVar33[-4] = uVar15;
                  puVar33[-1] = uVar27;
                  puVar33[-2] = uVar31;
                  puVar33[1] = uVar55;
                  *puVar33 = uVar40;
                  puVar33[3] = uVar59;
                  puVar33[2] = uVar57;
                  uVar25 = uVar25 - 0x40;
                  puVar33 = puVar33 + 8;
                  puVar24 = puVar24 + 8;
                } while (uVar25 != 0);
                if (uVar49 == uVar16) goto code_r0x00152b84;
                if ((uVar49 & 0x38) == 0) {
                  param_46 = param_46 + uVar16;
                  unaff_x26 = (ulong *)((long)unaff_x26 + uVar16);
                  goto code_r0x00152b74;
                }
              }
              uVar25 = uVar49 & 0xfffffffffffffff8;
              lVar44 = uVar16 - uVar25;
              pbVar30 = (byte *)(param_46 + uVar16);
              pbVar11 = (byte *)((long)unaff_x26 + uVar16);
              do {
                *(undefined8 *)pbVar11 = *(undefined8 *)pbVar30;
                lVar44 = lVar44 + 8;
                pbVar30 = pbVar30 + 8;
                pbVar11 = pbVar11 + 8;
              } while (lVar44 != 0);
              unaff_x26 = (ulong *)((long)unaff_x26 + uVar25);
              param_46 = (ulong)(param_46 + uVar25);
              if (uVar49 == uVar25) goto code_r0x00152b84;
            }
code_r0x00152b74:
            do {
              puVar33 = (ulong *)((long)unaff_x26 + 1);
              *(byte *)unaff_x26 = (byte)*(ulong *)param_46;
              unaff_x26 = puVar33;
              param_46 = (ulong)(param_46 + 1);
            } while (puVar33 < puVar17);
          }
code_r0x00152b84:
          uVar25 = *unaff_x28 - uVar50;
          *unaff_x28 = uVar25;
        }
        param_46 = (ulong)param_5;
        pbVar30 = (byte *)((long)unaff_x22 + 0xe64);
        pbVar30[0] = 0;
        pbVar30[1] = 0;
        pbVar30[2] = 0;
        pbVar30[3] = 0;
        unaff_x20 = (ulong *)unaff_x28[1];
        unaff_x22 = (ulong *)unaff_x28[2];
        unaff_x27 = (ulong *)((long)puVar17 + uVar25);
        puVar33 = (ulong *)((long)unaff_x27 - (long)unaff_x22);
        Hint_Prefetch(puVar33,0,0,0);
        unaff_x24 = (byte *)((long)unaff_x20 + uVar25);
        if (param_16 < (ulong *)((long)param_5 + uVar25) ||
            param_27 < (byte *)((long)puVar17 + (long)unaff_x24)) {
          param_5 = &param_46;
          param_47 = uVar25;
          param_48 = unaff_x20;
          param_49 = unaff_x22;
          unaff_x24 = (byte *)func_0x00155c78(puVar17,param_25,&param_47,param_5,param_16,param_30,
                                              param_24,param_31);
          param_8 = &param_50;
          param_7 = (ulong *)(ulong)param_20._4_4_;
          unaff_x20 = param_6;
        }
        else {
          uVar50 = *param_5;
          puVar17[1] = param_5[1];
          *puVar17 = uVar50;
          if (0x10 < uVar25) {
            uVar50 = param_5[2];
            puVar17[3] = param_5[3];
            puVar17[2] = uVar50;
            if (0x10 < uVar25 - 0x10) {
              puVar24 = puVar17 + 4;
              puVar28 = param_12;
              do {
                uVar50 = puVar28[-2];
                puVar24[1] = puVar28[-1];
                *puVar24 = uVar50;
                uVar50 = *puVar28;
                puVar24[3] = puVar28[1];
                puVar24[2] = uVar50;
                puVar24 = puVar24 + 4;
                puVar28 = puVar28 + 4;
              } while (puVar24 < unaff_x27);
            }
          }
          param_46 = (long)param_5 + uVar25;
          if ((ulong *)((long)unaff_x27 - (long)param_30) < unaff_x22) {
            unaff_x26 = puVar17;
            if ((ulong *)((long)unaff_x27 - param_24) < unaff_x22) goto LAB_00153e5c;
            lVar44 = (long)puVar33 - (long)param_30;
            pbVar30 = (byte *)((long)param_31 + lVar44);
            if (pbVar30 + (long)unaff_x20 <= param_31) {
              _memmove(unaff_x27,pbVar30,unaff_x20);
              param_7 = (ulong *)(ulong)param_20._4_4_;
              unaff_x23 = 0x18;
              param_8 = &param_50;
              unaff_x21 = param_19;
              unaff_x25 = param_17;
              goto code_r0x00152cdc;
            }
            _memmove(unaff_x27,pbVar30,-lVar44);
            unaff_x27 = (ulong *)((long)unaff_x27 - lVar44);
            unaff_x20 = (ulong *)(lVar44 + (long)unaff_x20);
            param_7 = (ulong *)(ulong)param_20._4_4_;
            unaff_x23 = 0x18;
            param_8 = &param_50;
            puVar33 = param_30;
            unaff_x21 = param_19;
            unaff_x25 = param_17;
          }
          if (unaff_x22 < &MACH_HEADER.ncmds) {
            if ((ulong *)((long)&MACH_HEADER.cputype + 3) < unaff_x22) {
              *unaff_x27 = *puVar33;
            }
            else {
              iVar23 = *(int *)(&UNK_008143b0 + (long)unaff_x22 * 4);
              *(byte *)unaff_x27 = (byte)*puVar33;
              *(byte *)((long)unaff_x27 + 1) = *(byte *)((long)puVar33 + 1);
              *(byte *)((long)unaff_x27 + 2) = *(byte *)((long)puVar33 + 2);
              *(byte *)((long)unaff_x27 + 3) = *(byte *)((long)puVar33 + 3);
              pbVar30 = (byte *)((long)puVar33 +
                                (ulong)*(uint *)(&UNK_00814390 + (long)unaff_x22 * 4));
              puVar33 = (ulong *)(pbVar30 + -(long)iVar23);
              *(undefined4 *)((long)unaff_x27 + 4) = *(undefined4 *)pbVar30;
            }
            if (&MACH_HEADER.cpusubtype < unaff_x20) {
              puVar24 = puVar33 + 1;
              puVar28 = unaff_x27 + 1;
              if ((long)puVar28 - (long)puVar24 < 0x10) {
                do {
                  puVar33 = puVar28 + 1;
                  *puVar28 = *puVar24;
                  puVar24 = puVar24 + 1;
                  puVar28 = puVar33;
                } while (puVar33 < (ulong *)((long)unaff_x27 + (long)unaff_x20));
              }
              else {
                uVar25 = *puVar24;
                unaff_x27[2] = puVar33[2];
                *puVar28 = uVar25;
                if (&MACH_HEADER.ncmds < unaff_x20 + -1) {
                  puVar24 = unaff_x27 + 3;
                  puVar33 = puVar33 + 5;
                  do {
                    uVar25 = puVar33[-2];
                    puVar24[1] = puVar33[-1];
                    *puVar24 = uVar25;
                    uVar25 = *puVar33;
                    puVar24[3] = puVar33[1];
                    puVar24[2] = uVar25;
                    puVar24 = puVar24 + 4;
                    puVar33 = puVar33 + 4;
                  } while (puVar24 < (ulong *)((long)unaff_x27 + (long)unaff_x20));
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
            uVar25 = *puVar33;
            unaff_x27[1] = puVar33[1];
            *unaff_x27 = uVar25;
            if (&MACH_HEADER.ncmds < unaff_x20) {
              puVar24 = unaff_x27 + 2;
              do {
                uVar25 = puVar33[2];
                puVar24[1] = puVar33[3];
                *puVar24 = uVar25;
                uVar25 = puVar33[4];
                puVar24[3] = puVar33[5];
                puVar24[2] = uVar25;
                puVar24 = puVar24 + 4;
                puVar33 = puVar33 + 4;
              } while (puVar24 < (ulong *)((long)unaff_x27 + (long)unaff_x20));
            }
            else {
            }
          }
        }
code_r0x00152cdc:
        unaff_x22 = param_23;
        if ((byte *)0xffffffffffffff88 < unaff_x24) goto LAB_00153e60;
        puVar33 = (ulong *)((long)param_29 + (long)unaff_x19);
        puVar24 = param_31;
        if (param_28 <= puVar33) {
          puVar24 = param_30;
        }
        lVar44 = (long)((long)puVar24 + (long)puVar33) - (long)param_28;
        Hint_Prefetch(lVar44,0,0,0);
        Hint_Prefetch(lVar44 + 0x40,0,0,0);
        *unaff_x28 = (ulong)param_29;
        unaff_x28[1] = param_9;
        unaff_x28[2] = (ulong)param_28;
        unaff_x26 = (ulong *)((long)puVar17 + (long)unaff_x24);
        param_26 = param_16;
        unaff_x19 = (byte *)((long)puVar33 + param_9);
        uVar43 = uVar43 + 1;
        param_5 = param_22;
        puVar33 = param_22;
        param_6 = param_7;
        if (uVar43 == (uint)param_7) break;
      } while( true );
    }
    unaff_x24 = (byte *)0xffffffffffffffec;
    param_5 = param_35;
    param_7 = param_6;
    puVar17 = unaff_x26;
    if (param_34 != param_35) goto LAB_00153e60;
    if (param_33 != 0x40) goto LAB_00153e60;
    uVar43 = (int)param_6 - param_13._4_4_;
    unaff_x19 = (byte *)(ulong)uVar43;
    if ((int)param_6 <= (int)uVar43) goto LAB_00153e9c;
    unaff_x21 = (byte *)(param_25 + -0x20);
    puVar24 = (ulong *)(unaff_x25 + 0x176a4);
    puVar28 = puVar33 + 6;
    unaff_x25 = &param_50;
    goto LAB_001534d0;
  }
  goto LAB_00153e60;
code_r0x001528b4:
  unaff_x20 = (ulong *)unaff_x28[1];
  unaff_x27 = (ulong *)unaff_x28[2];
  if ((param_26 < puVar17) ||
     (unaff_x24 = (byte *)((long)unaff_x20 + uVar25),
     puVar17 + -4 < (ulong *)((long)unaff_x26 + (long)unaff_x24))) {
    param_47 = uVar25;
    param_48 = unaff_x20;
    param_49 = unaff_x27;
    unaff_x24 = (byte *)func_0x00156308(unaff_x26,param_25,puVar17 + -4,&param_47,&param_46,param_26
                                        ,param_30,param_24);
    unaff_x20 = param_6;
  }
  else {
    unaff_x28 = (ulong *)((long)unaff_x26 + uVar25);
    uVar50 = *(ulong *)param_46;
    unaff_x26[1] = *(ulong *)(param_46 + 8);
    *unaff_x26 = uVar50;
    if (0x10 < uVar25) {
      uVar50 = *(ulong *)(param_46 + 0x10);
      unaff_x26[3] = *(ulong *)(param_46 + 0x18);
      unaff_x26[2] = uVar50;
      if (0x10 < uVar25 - 0x10) {
        puVar33 = unaff_x26 + 4;
        puVar24 = (ulong *)(param_46 + 0x30);
        do {
          uVar25 = puVar24[-2];
          puVar33[1] = puVar24[-1];
          *puVar33 = uVar25;
          uVar25 = *puVar24;
          puVar33[3] = puVar24[1];
          puVar33[2] = uVar25;
          puVar33 = puVar33 + 4;
          puVar24 = puVar24 + 4;
        } while (puVar33 < unaff_x28);
      }
    }
    param_46 = (ulong)puVar17;
    puVar33 = param_5;
    puVar17 = (ulong *)((long)unaff_x28 - (long)unaff_x27);
    if ((ulong *)((long)unaff_x28 - (long)param_30) < unaff_x27) {
      if ((ulong *)((long)unaff_x28 - param_24) < unaff_x27) goto LAB_00153e5c;
      lVar44 = ((long)unaff_x28 - (long)unaff_x27) - (long)param_30;
      pbVar30 = (byte *)((long)param_31 + lVar44);
      if (pbVar30 + (long)unaff_x20 <= param_31) {
        _memmove(unaff_x28,pbVar30,unaff_x20);
        unaff_x23 = 0x18;
        unaff_x21 = param_19;
        unaff_x22 = param_23;
        goto code_r0x00152f40;
      }
      _memmove(unaff_x28,pbVar30,-lVar44);
      unaff_x28 = (ulong *)((long)unaff_x28 - lVar44);
      unaff_x20 = (ulong *)(lVar44 + (long)unaff_x20);
      param_7 = (ulong *)(ulong)param_20._4_4_;
      unaff_x23 = 0x18;
      param_8 = &param_50;
      puVar33 = param_22;
      puVar17 = param_30;
      unaff_x21 = param_19;
      unaff_x22 = param_23;
    }
    if ((ulong *)((long)&MACH_HEADER.filetype + 3) < unaff_x27) {
      uVar25 = *puVar17;
      unaff_x28[1] = puVar17[1];
      *unaff_x28 = uVar25;
      if (&MACH_HEADER.ncmds < unaff_x20) {
        puVar24 = unaff_x28 + 2;
        do {
          uVar25 = puVar17[2];
          puVar24[1] = puVar17[3];
          *puVar24 = uVar25;
          uVar25 = puVar17[4];
          puVar24[3] = puVar17[5];
          puVar24[2] = uVar25;
          puVar24 = puVar24 + 4;
          puVar17 = puVar17 + 4;
        } while (puVar24 < (ulong *)((long)unaff_x28 + (long)unaff_x20));
      }
      goto LAB_00152f44;
    }
    if ((ulong *)((long)&MACH_HEADER.cputype + 3) < unaff_x27) {
      *unaff_x28 = *puVar17;
    }
    else {
      iVar23 = *(int *)(&UNK_008143b0 + (long)unaff_x27 * 4);
      *(byte *)unaff_x28 = (byte)*puVar17;
      *(byte *)((long)unaff_x28 + 1) = *(byte *)((long)puVar17 + 1);
      *(byte *)((long)unaff_x28 + 2) = *(byte *)((long)puVar17 + 2);
      *(byte *)((long)unaff_x28 + 3) = *(byte *)((long)puVar17 + 3);
      pbVar30 = (byte *)((long)puVar17 + (ulong)*(uint *)(&UNK_00814390 + (long)unaff_x27 * 4));
      puVar17 = (ulong *)(pbVar30 + -(long)iVar23);
      *(undefined4 *)((long)unaff_x28 + 4) = *(undefined4 *)pbVar30;
    }
    if (&MACH_HEADER.cpusubtype < unaff_x20) {
      puVar33 = puVar17 + 1;
      puVar24 = unaff_x28 + 1;
      if ((long)puVar24 - (long)puVar33 < 0x10) {
        do {
          puVar17 = puVar24 + 1;
          *puVar24 = *puVar33;
          puVar33 = puVar33 + 1;
          puVar24 = puVar17;
        } while (puVar17 < (ulong *)((long)unaff_x28 + (long)unaff_x20));
      }
      else {
        uVar25 = *puVar33;
        unaff_x28[2] = puVar17[2];
        *puVar24 = uVar25;
        if (&MACH_HEADER.ncmds < unaff_x20 + -1) {
          puVar33 = unaff_x28 + 3;
          puVar17 = puVar17 + 5;
          do {
            uVar25 = puVar17[-2];
            puVar33[1] = puVar17[-1];
            *puVar33 = uVar25;
            uVar25 = *puVar17;
            puVar33[3] = puVar17[1];
            puVar33[2] = uVar25;
            puVar33 = puVar33 + 4;
            puVar17 = puVar17 + 4;
          } while (puVar33 < (ulong *)((long)unaff_x28 + (long)unaff_x20));
        }
      }
    }
    unaff_x23 = 0x18;
    unaff_x21 = param_19;
    unaff_x22 = param_23;
    unaff_x25 = param_17;
  }
code_r0x00152f40:
  param_7 = (ulong *)(ulong)param_20._4_4_;
  param_8 = &param_50;
  puVar33 = param_22;
  goto LAB_00152f44;
  while( true ) {
    unaff_x23 = 0x18;
    if ((byte *)0xffffffffffffff88 < unaff_x24) goto LAB_00153e60;
    unaff_x23 = 0x18;
    unaff_x26 = (ulong *)((long)unaff_x26 + (long)unaff_x24);
    unaff_x19 = (byte *)(ulong)(uVar43 + 1);
    if (uVar43 + 1 == (uint)param_7) break;
LAB_001534d0:
    unaff_x23 = 0x18;
    uVar43 = (uint)unaff_x19;
    lVar44 = (ulong)(uVar43 & 7) * 0x18;
    puVar18 = (ulong *)(unaff_x25 + lVar44);
    puVar17 = unaff_x26;
    if (*(int *)((long)unaff_x22 + 0xe64) == 2) {
      uVar25 = *puVar18;
      puVar29 = *(ulong **)(param_17 + 0x7698);
      puVar19 = (ulong *)(param_46 + uVar25);
      if (puVar29 < puVar19) {
        uVar50 = (long)puVar29 - param_46;
        if (uVar50 != 0) {
          if ((ulong)(param_25 - (long)unaff_x26) < uVar50) goto code_r0x00152014;
          uVar25 = (long)unaff_x26 - param_46;
          puVar17 = (ulong *)((long)unaff_x26 + uVar50);
          if (((long)uVar25 < -7) && (7 < uVar50)) {
            if (uVar25 < 0xfffffffffffffff0) {
              puVar29 = puVar17 + -4;
              if (puVar29 < unaff_x26) goto code_r0x001537d4;
              uVar25 = *(ulong *)param_46;
              unaff_x26[1] = *(ulong *)(param_46 + 8);
              *unaff_x26 = uVar25;
              if (0x10 < (ulong)((long)puVar29 - (long)unaff_x26)) {
                puVar19 = unaff_x26 + 2;
                puVar32 = (ulong *)param_46;
                do {
                  uVar25 = puVar32[2];
                  puVar19[1] = puVar32[3];
                  *puVar19 = uVar25;
                  uVar25 = puVar32[4];
                  puVar19[3] = puVar32[5];
                  puVar19[2] = uVar25;
                  puVar19 = puVar19 + 4;
                  puVar32 = puVar32 + 4;
                } while (puVar19 < puVar29);
              }
              param_46 = param_46 + ((long)puVar29 - (long)unaff_x26);
            }
            else {
code_r0x001537d4:
              puVar29 = unaff_x26;
              if ((long)uVar50 < 1) goto LAB_00153934;
            }
            pbVar30 = (byte *)((long)unaff_x26 + (uVar50 - (long)puVar29));
            if ((pbVar30 < (byte *)0x8) || ((long)puVar29 - param_46 < 0x40)) {
              puVar19 = puVar29;
            }
            else {
              if (pbVar30 < (byte *)0x40) {
                pbVar36 = (byte *)0x0;
              }
              else {
                pbVar36 = (byte *)((ulong)pbVar30 & 0xffffffffffffffc0);
                puVar19 = puVar29 + 4;
                puVar32 = (ulong *)(param_46 + 0x20);
                pbVar11 = pbVar36;
                do {
                  uVar25 = puVar32[-4];
                  uVar16 = puVar32[-1];
                  uVar49 = puVar32[-2];
                  uVar31 = puVar32[1];
                  uVar15 = *puVar32;
                  uVar40 = puVar32[3];
                  uVar27 = puVar32[2];
                  puVar19[-3] = puVar32[-3];
                  puVar19[-4] = uVar25;
                  puVar19[-1] = uVar16;
                  puVar19[-2] = uVar49;
                  puVar19[1] = uVar31;
                  *puVar19 = uVar15;
                  puVar19[3] = uVar40;
                  puVar19[2] = uVar27;
                  pbVar11 = pbVar11 + -0x40;
                  puVar19 = puVar19 + 8;
                  puVar32 = puVar32 + 8;
                } while (pbVar11 != (byte *)0x0);
                if (pbVar30 == pbVar36) goto LAB_00153934;
                if (((ulong)pbVar30 & 0x38) == 0) {
                  param_46 = param_46 + (long)pbVar36;
                  puVar19 = (ulong *)((long)puVar29 + (long)pbVar36);
                  goto LAB_00153904;
                }
              }
              pbVar41 = (byte *)((ulong)pbVar30 & 0xfffffffffffffff8);
              lVar37 = (long)pbVar36 - (long)pbVar41;
              pbVar11 = (byte *)((long)puVar29 + (long)pbVar36);
              pbVar36 = (byte *)(param_46 + (long)pbVar36);
              do {
                *(undefined8 *)pbVar11 = *(undefined8 *)pbVar36;
                lVar37 = lVar37 + 8;
                pbVar11 = pbVar11 + 8;
                pbVar36 = pbVar36 + 8;
              } while (lVar37 != 0);
              puVar19 = (ulong *)((long)puVar29 + (long)pbVar41);
              param_46 = (ulong)(param_46 + (long)pbVar41);
              if (pbVar30 == pbVar41) goto LAB_00153934;
            }
LAB_00153904:
            do {
              puVar32 = (ulong *)((long)puVar19 + 1);
              *(byte *)puVar19 = (byte)*(ulong *)param_46;
              puVar19 = puVar32;
              param_46 = (ulong)(param_46 + 1);
            } while (puVar32 != (ulong *)((long)puVar29 + (long)pbVar30));
          }
          else if (0 < (long)uVar50) {
            pbVar30 = (byte *)((long)unaff_x26 + (long)puVar29) + -param_46;
            if (pbVar30 <= (byte *)((long)unaff_x26 + 1)) {
              pbVar30 = (byte *)((long)unaff_x26 + 1);
            }
            uVar49 = (long)pbVar30 - (long)unaff_x26;
            if ((7 < uVar49) && (0x3f < uVar25)) {
              if (uVar49 < 0x40) {
                uVar16 = 0;
              }
              else {
                uVar16 = uVar49 & 0xffffffffffffffc0;
                puVar29 = unaff_x26 + 4;
                puVar19 = (ulong *)(param_46 + 0x20);
                uVar25 = uVar16;
                do {
                  uVar15 = puVar19[-4];
                  uVar27 = puVar19[-1];
                  uVar31 = puVar19[-2];
                  uVar55 = puVar19[1];
                  uVar40 = *puVar19;
                  uVar59 = puVar19[3];
                  uVar57 = puVar19[2];
                  puVar29[-3] = puVar19[-3];
                  puVar29[-4] = uVar15;
                  puVar29[-1] = uVar27;
                  puVar29[-2] = uVar31;
                  puVar29[1] = uVar55;
                  *puVar29 = uVar40;
                  puVar29[3] = uVar59;
                  puVar29[2] = uVar57;
                  uVar25 = uVar25 - 0x40;
                  puVar29 = puVar29 + 8;
                  puVar19 = puVar19 + 8;
                } while (uVar25 != 0);
                if (uVar49 == uVar16) goto LAB_00153934;
                if ((uVar49 & 0x38) == 0) {
                  param_46 = param_46 + uVar16;
                  unaff_x26 = (ulong *)((long)unaff_x26 + uVar16);
                  goto code_r0x00153924;
                }
              }
              uVar25 = uVar49 & 0xfffffffffffffff8;
              lVar37 = uVar16 - uVar25;
              pbVar30 = (byte *)(param_46 + uVar16);
              pbVar11 = (byte *)((long)unaff_x26 + uVar16);
              do {
                *(undefined8 *)pbVar11 = *(undefined8 *)pbVar30;
                lVar37 = lVar37 + 8;
                pbVar30 = pbVar30 + 8;
                pbVar11 = pbVar11 + 8;
              } while (lVar37 != 0);
              unaff_x26 = (ulong *)((long)unaff_x26 + uVar25);
              param_46 = (ulong)(param_46 + uVar25);
              if (uVar49 == uVar25) goto LAB_00153934;
            }
code_r0x00153924:
            do {
              puVar29 = (ulong *)((long)unaff_x26 + 1);
              *(byte *)unaff_x26 = (byte)*(ulong *)param_46;
              unaff_x26 = puVar29;
              param_46 = (ulong)(param_46 + 1);
            } while (puVar29 < puVar17);
          }
LAB_00153934:
          uVar25 = *puVar18 - uVar50;
          *puVar18 = uVar25;
        }
        param_46 = (ulong)puVar33;
        pbVar30 = (byte *)((long)unaff_x22 + 0xe64);
        pbVar30[0] = 0;
        pbVar30[1] = 0;
        pbVar30[2] = 0;
        pbVar30[3] = 0;
        unaff_x20 = *(ulong **)(&param_51 + lVar44);
        unaff_x28 = *(ulong **)(&param_52 + lVar44);
        unaff_x27 = (ulong *)((long)puVar17 + uVar25);
        puVar18 = (ulong *)((long)unaff_x27 - (long)unaff_x28);
        Hint_Prefetch(puVar18,0,0,0);
        unaff_x24 = (byte *)((long)unaff_x20 + uVar25);
        if (puVar24 < (ulong *)((long)puVar33 + uVar25) ||
            unaff_x21 < (byte *)((long)puVar17 + (long)unaff_x24)) {
          param_28 = &param_47;
          param_5 = &param_46;
          param_6 = puVar24;
          param_47 = uVar25;
          param_48 = unaff_x20;
          param_49 = unaff_x28;
          unaff_x24 = (byte *)func_0x00155c78(puVar17,param_25);
          param_7 = (ulong *)(ulong)param_20._4_4_;
          puVar33 = param_22;
        }
        else {
          uVar50 = *puVar33;
          puVar17[1] = puVar33[1];
          *puVar17 = uVar50;
          if (0x10 < uVar25) {
            uVar50 = puVar33[2];
            puVar17[3] = puVar33[3];
            puVar17[2] = uVar50;
            if (0x10 < uVar25 - 0x10) {
              puVar29 = puVar17 + 4;
              puVar19 = puVar28;
              do {
                uVar50 = puVar19[-2];
                puVar29[1] = puVar19[-1];
                *puVar29 = uVar50;
                uVar50 = *puVar19;
                puVar29[3] = puVar19[1];
                puVar29[2] = uVar50;
                puVar29 = puVar29 + 4;
                puVar19 = puVar19 + 4;
              } while (puVar29 < unaff_x27);
            }
          }
          param_46 = (long)puVar33 + uVar25;
          if ((ulong *)((long)unaff_x27 - (long)param_30) < unaff_x28) {
            unaff_x26 = puVar17;
            if ((ulong *)((long)unaff_x27 - param_24) < unaff_x28) goto LAB_00153e5c;
            lVar44 = (long)puVar18 - (long)param_30;
            if (param_31 < (byte *)((long)param_31 + lVar44) + (long)unaff_x20) {
              param_28 = (ulong *)-lVar44;
              _memmove(unaff_x27);
              unaff_x27 = (ulong *)((long)unaff_x27 - lVar44);
              unaff_x20 = (ulong *)(lVar44 + (long)unaff_x20);
              param_7 = (ulong *)(ulong)param_20._4_4_;
              puVar33 = param_22;
              puVar18 = param_30;
              unaff_x22 = param_23;
              goto LAB_001539ec;
            }
            param_28 = unaff_x20;
            _memmove(unaff_x27);
          }
          else {
LAB_001539ec:
            if (&MACH_HEADER.ncmds <= unaff_x28) {
              uVar25 = *puVar18;
              unaff_x27[1] = puVar18[1];
              *unaff_x27 = uVar25;
              if (&MACH_HEADER.ncmds < unaff_x20) {
                puVar29 = unaff_x27 + 2;
                do {
                  uVar25 = puVar18[2];
                  puVar29[1] = puVar18[3];
                  *puVar29 = uVar25;
                  uVar25 = puVar18[4];
                  puVar29[3] = puVar18[5];
                  puVar29[2] = uVar25;
                  puVar29 = puVar29 + 4;
                  puVar18 = puVar18 + 4;
                } while (puVar29 < (ulong *)((long)unaff_x27 + (long)unaff_x20));
              }
              goto joined_r0x00153b5c;
            }
            if ((ulong *)((long)&MACH_HEADER.cputype + 3) < unaff_x28) {
              *unaff_x27 = *puVar18;
            }
            else {
              iVar23 = *(int *)(&UNK_008143b0 + (long)unaff_x28 * 4);
              *(byte *)unaff_x27 = (byte)*puVar18;
              *(byte *)((long)unaff_x27 + 1) = *(byte *)((long)puVar18 + 1);
              *(byte *)((long)unaff_x27 + 2) = *(byte *)((long)puVar18 + 2);
              *(byte *)((long)unaff_x27 + 3) = *(byte *)((long)puVar18 + 3);
              pbVar30 = (byte *)((long)puVar18 +
                                (ulong)*(uint *)(&UNK_00814390 + (long)unaff_x28 * 4));
              puVar18 = (ulong *)(pbVar30 + -(long)iVar23);
              *(undefined4 *)((long)unaff_x27 + 4) = *(undefined4 *)pbVar30;
            }
            if (&MACH_HEADER.cpusubtype < unaff_x20) {
              puVar33 = puVar18 + 1;
              puVar29 = unaff_x27 + 1;
              if ((long)puVar29 - (long)puVar33 < 0x10) {
                do {
                  puVar18 = puVar29 + 1;
                  *puVar29 = *puVar33;
                  puVar33 = puVar33 + 1;
                  puVar29 = puVar18;
                } while (puVar18 < (ulong *)((long)unaff_x27 + (long)unaff_x20));
              }
              else {
                uVar25 = *puVar33;
                unaff_x27[2] = puVar18[2];
                *puVar29 = uVar25;
                if (&MACH_HEADER.ncmds < unaff_x20 + -1) {
                  puVar33 = unaff_x27 + 3;
                  puVar18 = puVar18 + 5;
                  do {
                    uVar25 = puVar18[-2];
                    puVar33[1] = puVar18[-1];
                    *puVar33 = uVar25;
                    uVar25 = *puVar18;
                    puVar33[3] = puVar18[1];
                    puVar33[2] = uVar25;
                    puVar33 = puVar33 + 4;
                    puVar18 = puVar18 + 4;
                  } while (puVar33 < (ulong *)((long)unaff_x27 + (long)unaff_x20));
                }
              }
            }
          }
          param_7 = (ulong *)(ulong)param_20._4_4_;
          unaff_x22 = param_23;
          puVar33 = param_22;
        }
joined_r0x00153b5c:
        unaff_x23 = 0x18;
        if ((byte *)0xffffffffffffff88 < unaff_x24) goto LAB_00153e60;
        unaff_x23 = 0x18;
        unaff_x26 = (ulong *)((long)puVar17 + (long)unaff_x24);
        unaff_x19 = (byte *)(ulong)(uVar43 + 1);
        param_26 = puVar24;
        if (uVar43 + 1 == (uint)param_7) break;
        goto LAB_001534d0;
      }
      param_28 = puVar19 + -4;
      puVar29 = *(ulong **)(&param_51 + lVar44);
      unaff_x27 = *(ulong **)(&param_52 + lVar44);
      unaff_x24 = (byte *)((long)puVar29 + uVar25);
      if (param_26 < puVar19 || param_28 < (ulong *)((long)unaff_x26 + (long)unaff_x24)) {
        param_5 = &param_47;
        param_6 = &param_46;
        param_47 = uVar25;
        param_48 = puVar29;
        param_49 = unaff_x27;
        unaff_x24 = (byte *)func_0x00156308(unaff_x26,param_25);
        puVar18 = puVar29;
        puVar29 = unaff_x28;
        goto code_r0x00153acc;
      }
      puVar18 = (ulong *)((long)unaff_x26 + uVar25);
      uVar50 = *(ulong *)param_46;
      unaff_x26[1] = *(ulong *)(param_46 + 8);
      *unaff_x26 = uVar50;
      if (0x10 < uVar25) {
        uVar50 = *(ulong *)(param_46 + 0x10);
        unaff_x26[3] = *(ulong *)(param_46 + 0x18);
        unaff_x26[2] = uVar50;
        if (0x10 < uVar25 - 0x10) {
          puVar32 = unaff_x26 + 4;
          puVar22 = (ulong *)(param_46 + 0x30);
          do {
            uVar25 = puVar22[-2];
            puVar32[1] = puVar22[-1];
            *puVar32 = uVar25;
            uVar25 = *puVar22;
            puVar32[3] = puVar22[1];
            puVar32[2] = uVar25;
            puVar32 = puVar32 + 4;
            puVar22 = puVar22 + 4;
          } while (puVar32 < puVar18);
        }
      }
      param_46 = (ulong)puVar19;
      puVar19 = (ulong *)((long)puVar18 - (long)unaff_x27);
      if ((ulong *)((long)puVar18 - (long)param_30) < unaff_x27) {
        unaff_x20 = puVar29;
        unaff_x28 = puVar18;
        if ((ulong *)((long)puVar18 - param_24) < unaff_x27) goto LAB_00153e5c;
        lVar44 = ((long)puVar18 - (long)unaff_x27) - (long)param_30;
        if ((byte *)((long)param_31 + lVar44) + (long)puVar29 <= param_31) {
          puVar33 = puVar29;
          goto LAB_001537a0;
        }
        param_28 = (ulong *)-lVar44;
        _memmove(puVar18);
        puVar18 = (ulong *)((long)puVar18 - lVar44);
        puVar29 = (ulong *)(lVar44 + (long)puVar29);
        param_7 = (ulong *)(ulong)param_20._4_4_;
        puVar33 = param_22;
        puVar19 = param_30;
        unaff_x22 = param_23;
      }
      unaff_x28 = puVar18;
      if (unaff_x27 < &MACH_HEADER.ncmds) {
        if ((ulong *)((long)&MACH_HEADER.cputype + 3) < unaff_x27) {
          *puVar18 = *puVar19;
        }
        else {
          iVar23 = *(int *)(&UNK_008143b0 + (long)unaff_x27 * 4);
          *(byte *)puVar18 = (byte)*puVar19;
          *(byte *)((long)puVar18 + 1) = *(byte *)((long)puVar19 + 1);
          *(byte *)((long)puVar18 + 2) = *(byte *)((long)puVar19 + 2);
          *(byte *)((long)puVar18 + 3) = *(byte *)((long)puVar19 + 3);
          pbVar30 = (byte *)((long)puVar19 + (ulong)*(uint *)(&UNK_00814390 + (long)unaff_x27 * 4));
          puVar19 = (ulong *)(pbVar30 + -(long)iVar23);
          *(undefined4 *)((long)puVar18 + 4) = *(undefined4 *)pbVar30;
        }
        if (&MACH_HEADER.cpusubtype < puVar29) {
          puVar33 = puVar19 + 1;
          puVar32 = puVar18 + 1;
          if ((long)puVar32 - (long)puVar33 < 0x10) {
            do {
              puVar19 = puVar32 + 1;
              *puVar32 = *puVar33;
              puVar33 = puVar33 + 1;
              puVar32 = puVar19;
            } while (puVar19 < (ulong *)((long)puVar18 + (long)puVar29));
          }
          else {
            uVar25 = *puVar33;
            puVar18[2] = puVar19[2];
            *puVar32 = uVar25;
            if (&MACH_HEADER.ncmds < puVar29 + -1) {
              puVar33 = puVar18 + 3;
              puVar19 = puVar19 + 5;
              do {
                uVar25 = puVar19[-2];
                puVar33[1] = puVar19[-1];
                *puVar33 = uVar25;
                uVar25 = *puVar19;
                puVar33[3] = puVar19[1];
                puVar33[2] = uVar25;
                puVar33 = puVar33 + 4;
                puVar19 = puVar19 + 4;
              } while (puVar33 < (ulong *)((long)puVar18 + (long)puVar29));
            }
          }
        }
        goto LAB_001537b0;
      }
      uVar25 = *puVar19;
      puVar18[1] = puVar19[1];
      *puVar18 = uVar25;
      unaff_x20 = puVar29;
      if (&MACH_HEADER.ncmds < puVar29) {
        puVar32 = puVar18 + 2;
        do {
          uVar25 = puVar19[2];
          puVar32[1] = puVar19[3];
          *puVar32 = uVar25;
          uVar25 = puVar19[4];
          puVar32[3] = puVar19[5];
          puVar32[2] = uVar25;
          puVar32 = puVar32 + 4;
          puVar19 = puVar19 + 4;
        } while (puVar32 < (ulong *)((long)puVar18 + (long)puVar29));
      }
    }
    else {
      uVar25 = *puVar18;
      puVar29 = *(ulong **)(&param_51 + lVar44);
      unaff_x27 = *(ulong **)(&param_52 + lVar44);
      puVar18 = (ulong *)((long)unaff_x26 + uVar25);
      puVar19 = (ulong *)((long)puVar18 - (long)unaff_x27);
      Hint_Prefetch(puVar19,0,0,0);
      unaff_x24 = (byte *)((long)puVar29 + uVar25);
      if (param_26 < (ulong *)(param_46 + uVar25) ||
          unaff_x21 < (byte *)((long)unaff_x26 + (long)unaff_x24)) {
        param_28 = &param_47;
        param_5 = &param_46;
        param_6 = param_26;
        param_47 = uVar25;
        param_48 = puVar29;
        param_49 = unaff_x27;
        unaff_x24 = (byte *)func_0x00155c78(unaff_x26,param_25);
code_r0x00153acc:
        param_7 = (ulong *)(ulong)param_20._4_4_;
        unaff_x20 = puVar18;
        unaff_x28 = puVar29;
        puVar33 = param_22;
      }
      else {
        uVar50 = *(ulong *)param_46;
        unaff_x26[1] = *(ulong *)(param_46 + 8);
        *unaff_x26 = uVar50;
        if (0x10 < uVar25) {
          uVar50 = *(ulong *)(param_46 + 0x10);
          unaff_x26[3] = *(ulong *)(param_46 + 0x18);
          unaff_x26[2] = uVar50;
          if (0x10 < uVar25 - 0x10) {
            puVar32 = unaff_x26 + 4;
            puVar22 = (ulong *)(param_46 + 0x30);
            do {
              uVar50 = puVar22[-2];
              puVar32[1] = puVar22[-1];
              *puVar32 = uVar50;
              uVar50 = *puVar22;
              puVar32[3] = puVar22[1];
              puVar32[2] = uVar50;
              puVar32 = puVar32 + 4;
              puVar22 = puVar22 + 4;
            } while (puVar32 < puVar18);
          }
        }
        param_46 = param_46 + uVar25;
        unaff_x28 = puVar29;
        if ((ulong *)((long)puVar18 - (long)param_30) < unaff_x27) {
          unaff_x20 = puVar18;
          if ((ulong *)((long)puVar18 - param_24) < unaff_x27) goto LAB_00153e5c;
          lVar44 = (long)puVar19 - (long)param_30;
          if ((byte *)((long)param_31 + lVar44) + (long)puVar29 <= param_31) {
            puVar33 = puVar18;
LAB_001537a0:
            _memmove(puVar18);
            param_28 = puVar29;
            puVar29 = puVar33;
            goto LAB_001537b0;
          }
          param_28 = (ulong *)-lVar44;
          _memmove(puVar18);
          puVar18 = (ulong *)((long)puVar18 - lVar44);
          unaff_x28 = (ulong *)(lVar44 + (long)puVar29);
          param_7 = (ulong *)(ulong)param_20._4_4_;
          puVar33 = param_22;
          puVar19 = param_30;
          unaff_x22 = param_23;
        }
        if ((ulong *)((long)&MACH_HEADER.filetype + 3) < unaff_x27) {
          uVar25 = *puVar19;
          puVar18[1] = puVar19[1];
          *puVar18 = uVar25;
          unaff_x20 = puVar18;
          if (&MACH_HEADER.ncmds < unaff_x28) {
            puVar29 = puVar18 + 2;
            do {
              uVar25 = puVar19[2];
              puVar29[1] = puVar19[3];
              *puVar29 = uVar25;
              uVar25 = puVar19[4];
              puVar29[3] = puVar19[5];
              puVar29[2] = uVar25;
              puVar29 = puVar29 + 4;
              puVar19 = puVar19 + 4;
            } while (puVar29 < (ulong *)((long)puVar18 + (long)unaff_x28));
          }
        }
        else {
          if ((ulong *)((long)&MACH_HEADER.cputype + 3) < unaff_x27) {
            *puVar18 = *puVar19;
          }
          else {
            iVar23 = *(int *)(&UNK_008143b0 + (long)unaff_x27 * 4);
            *(byte *)puVar18 = (byte)*puVar19;
            *(byte *)((long)puVar18 + 1) = *(byte *)((long)puVar19 + 1);
            *(byte *)((long)puVar18 + 2) = *(byte *)((long)puVar19 + 2);
            *(byte *)((long)puVar18 + 3) = *(byte *)((long)puVar19 + 3);
            pbVar30 = (byte *)((long)puVar19 + (ulong)*(uint *)(&UNK_00814390 + (long)unaff_x27 * 4)
                              );
            puVar19 = (ulong *)(pbVar30 + -(long)iVar23);
            *(undefined4 *)((long)puVar18 + 4) = *(undefined4 *)pbVar30;
          }
          puVar29 = puVar18;
          if (&MACH_HEADER.cpusubtype < unaff_x28) {
            puVar33 = puVar19 + 1;
            puVar32 = puVar18 + 1;
            if ((long)puVar32 - (long)puVar33 < 0x10) {
              do {
                puVar19 = puVar32 + 1;
                *puVar32 = *puVar33;
                puVar33 = puVar33 + 1;
                puVar32 = puVar19;
              } while (puVar19 < (ulong *)((long)puVar18 + (long)unaff_x28));
            }
            else {
              uVar25 = *puVar33;
              puVar18[2] = puVar19[2];
              *puVar32 = uVar25;
              if (&MACH_HEADER.ncmds < unaff_x28 + -1) {
                puVar33 = puVar18 + 3;
                puVar19 = puVar19 + 5;
                do {
                  uVar25 = puVar19[-2];
                  puVar33[1] = puVar19[-1];
                  *puVar33 = uVar25;
                  uVar25 = *puVar19;
                  puVar33[3] = puVar19[1];
                  puVar33[2] = uVar25;
                  puVar33 = puVar33 + 4;
                  puVar19 = puVar19 + 4;
                } while (puVar33 < (ulong *)((long)puVar18 + (long)unaff_x28));
              }
            }
          }
LAB_001537b0:
          param_7 = (ulong *)(ulong)param_20._4_4_;
          unaff_x20 = puVar29;
          unaff_x22 = param_23;
          puVar33 = param_22;
        }
      }
    }
  }
LAB_00153e9c:
  *unaff_x22 = CONCAT44((int)param_44,(int)param_43);
  *(int *)(unaff_x22 + 1) = (int)param_45;
  puVar17 = (ulong *)param_46;
  param_28 = param_26;
  unaff_x19 = param_14;
  if (*(int *)((long)unaff_x22 + 0xe64) == 2) {
    unaff_x20 = (ulong *)((long)param_26 - param_46);
    unaff_x25 = param_17;
    if (unaff_x20 <= (ulong *)(param_25 - (long)unaff_x26)) {
      if (unaff_x26 != (ulong *)0x0) {
        _memmove(unaff_x26,param_46,unaff_x20);
        unaff_x26 = (ulong *)((long)unaff_x26 + (long)unaff_x20);
      }
      param_28 = (ulong *)(param_17 + 0x176a4);
      puVar17 = (ulong *)(param_17 + 0x76a4);
      goto code_r0x00152000;
    }
  }
  else {
code_r0x00152000:
    unaff_x20 = (ulong *)((long)param_28 - (long)puVar17);
    unaff_x25 = param_17;
    if (unaff_x20 <= (ulong *)(param_25 - (long)unaff_x26)) {
      if (unaff_x26 == (ulong *)0x0) {
        pbVar30 = (byte *)0x0;
      }
      else {
        param_28 = unaff_x20;
        _memmove(unaff_x26);
        pbVar30 = (byte *)((long)unaff_x26 + (long)unaff_x20);
      }
      unaff_x24 = pbVar30 + -(long)param_14;
      puVar17 = unaff_x26;
      goto LAB_00153e60;
    }
  }
code_r0x00152014:
  unaff_x24 = (byte *)0xffffffffffffffba;
  puVar17 = unaff_x26;
LAB_00153e60:
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
    return unaff_x24;
  }
  auVar61 = ___stack_chk_fail();
  pbVar14 = auVar61._8_8_;
  plVar12 = auVar61._0_8_;
  puStack_60 = unaff_x28;
  puStack_58 = unaff_x27;
  puStack_50 = puVar17;
  puStack_48 = unaff_x25;
  pbStack_40 = unaff_x24;
  uStack_38 = unaff_x23;
  puStack_30 = unaff_x22;
  pbStack_28 = unaff_x21;
  puStack_20 = unaff_x20;
  pbStack_18 = unaff_x19;
  pbVar11 = pbVar14 + ((ulong)param_28 & ((long)param_28 >> 0x3f ^ 0xffffffffffffffffU));
  pbVar36 = (byte *)plVar12[0xeb5];
  pbStack_88 = pbVar36;
  pbVar30 = (byte *)plVar12[0xed3];
  pbVar41 = pbVar14;
  if ((int)param_7 == 0) {
    iVar23 = (int)plVar12[0xed4];
joined_r0x001550b0:
    pbStack_88 = pbVar36;
    if (iVar23 == 2) {
      uVar25 = (long)pbVar30 - (long)pbVar36;
      if ((ulong)((long)pbVar11 - (long)pbVar41) < uVar25) {
        return (byte *)0xffffffffffffffba;
      }
      if (pbVar41 != (byte *)0x0) {
        _memmove(pbVar41,pbVar36,uVar25);
        pbVar41 = pbVar41 + uVar25;
      }
      pbVar36 = (byte *)((long)plVar12 + 0x76a4);
      pbVar30 = (byte *)((long)plVar12 + 0x176a4);
      *(undefined4 *)(plVar12 + 0xed4) = 0;
    }
    uVar25 = (long)pbVar30 - (long)pbVar36;
    if ((ulong)((long)pbVar11 - (long)pbVar41) < uVar25) {
      return (byte *)0xffffffffffffffba;
    }
    if (pbVar41 == (byte *)0x0) {
      pbVar41 = (byte *)0x0;
    }
    else {
      _memcpy(pbVar41,pbVar36,uVar25);
      pbVar41 = pbVar41 + uVar25;
    }
    return pbVar41 + -(long)pbVar14;
  }
  pbVar36 = (byte *)plVar12[0xe99];
  lVar44 = plVar12[0xe9a];
  uVar25 = plVar12[0xe9b];
  *(undefined4 *)((long)plVar12 + 0x7534) = 1;
  uVar50 = *(ulong *)((long)plVar12 + 0x683c);
  auStack_a0[1] = uVar50 >> 0x20;
  auStack_a0[0] = uVar50 & 0xffffffff;
  auStack_a0[2] = (ulong)*(uint *)((long)plVar12 + 0x6844);
  if (param_6 == (ulong *)0x0) {
    return (byte *)0xffffffffffffffec;
  }
  puVar17 = param_5 + 1;
  puVar33 = param_6 + -1;
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
    puVar33 = (ulong *)0x0;
    iVar23 = (int)LZCOUNT((uint)((byte *)((long)param_6 + (long)param_5))[-1]) + (int)param_6 * -8 +
             0x29;
    puStack_e8 = param_5;
  }
  else {
    puStack_e8 = (ulong *)((long)param_5 + (long)puVar33);
    uStack_f8 = *puStack_e8;
    if (uStack_f8 >> 0x38 == 0) {
      return (byte *)0xffffffffffffffec;
    }
    if ((ulong *)0xffffffffffffff88 < param_6) {
      return (byte *)0xffffffffffffffec;
    }
    iVar23 = (int)LZCOUNT((uint)(byte)(uStack_f8 >> 0x38)) + -0x17;
  }
  uVar43 = *(uint *)(*plVar12 + 4);
  uStack_f0 = uVar43 + iVar23;
  uStack_d0 = uStack_f8 >> ((ulong)-uStack_f0 & 0x3f) &
              (ulong)*(uint *)(&UNK_00814304 + (ulong)uVar43 * 4);
  if (uStack_f0 < 0x41) {
    if ((long)puVar33 < 8) {
      puVar24 = param_5;
      if (puVar33 == (ulong *)0x0) goto LAB_00154138;
      uVar43 = (uint)puVar33;
      if (param_5 <= (byte *)((long)param_5 + (long)puVar33) + -(ulong)(uStack_f0 >> 3)) {
        uVar43 = uStack_f0 >> 3;
      }
      uStack_f0 = uStack_f0 + uVar43 * -8;
    }
    else {
      uVar43 = uStack_f0 >> 3;
      uStack_f0 = uStack_f0 & 7;
    }
    puStack_e8 = (ulong *)((byte *)((long)param_5 + (long)puVar33) + -(ulong)uVar43);
    uStack_f8 = *puStack_e8;
    puVar24 = puStack_e8;
  }
  else {
    puVar24 = (ulong *)&UNK_00814388;
    puStack_e8 = (ulong *)&UNK_00814388;
  }
LAB_00154138:
  lVar37 = *plVar12 + 8;
  uVar43 = *(uint *)(plVar12[2] + 4);
  uStack_f0 = uVar43 + uStack_f0;
  uStack_c0 = uStack_f8 >> ((ulong)-uStack_f0 & 0x3f) &
              (ulong)*(uint *)(&UNK_00814304 + (ulong)uVar43 * 4);
  iVar23 = (int)param_5;
  if (uStack_f0 < 0x41) {
    if (puVar24 < puVar17) {
      puVar33 = param_5;
      if (puVar24 == param_5) goto LAB_001541c4;
      uVar43 = (int)puVar24 - iVar23;
      if (param_5 <= (ulong *)((long)puVar24 - (ulong)(uStack_f0 >> 3))) {
        uVar43 = uStack_f0 >> 3;
      }
      puVar33 = (ulong *)((long)puVar24 - (ulong)uVar43);
      uStack_f8 = *puVar33;
      uStack_f0 = uStack_f0 + uVar43 * -8;
    }
    else {
      puVar33 = (ulong *)((long)puVar24 - (ulong)(uStack_f0 >> 3));
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
  pbVar46 = (byte *)((long)plVar12 + 0x76a4);
  lVar1 = plVar12[2] + 8;
  uVar43 = *(uint *)(plVar12[1] + 4);
  uStack_f0 = uVar43 + uStack_f0;
  uStack_b0 = uStack_f8 >> ((ulong)-uStack_f0 & 0x3f) &
              (ulong)*(uint *)(&UNK_00814304 + (ulong)uVar43 * 4);
  if (uStack_f0 < 0x41) {
    if (puVar33 < puVar17) {
      if (puVar33 != param_5) {
        uVar43 = (int)puVar33 - iVar23;
        if (param_5 <= (ulong *)((long)puVar33 - (ulong)(uStack_f0 >> 3))) {
          uVar43 = uStack_f0 >> 3;
        }
        puStack_e8 = (ulong *)((long)puVar33 - (ulong)uVar43);
        uStack_f0 = uStack_f0 + uVar43 * -8;
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
  lVar2 = plVar12[1] + 8;
  do {
    puVar3 = (ushort *)(lVar37 + uStack_d0 * 8);
    puVar4 = (ushort *)(lVar2 + uStack_b0 * 8);
    puVar5 = (ushort *)(lVar1 + uStack_c0 * 8);
    uVar49 = (ulong)*(uint *)(puVar4 + 2);
    uVar50 = (ulong)*(uint *)(puVar3 + 2);
    uVar43 = *(uint *)(puVar5 + 2);
    bVar6 = (byte)puVar3[1];
    bVar7 = (byte)puVar4[1];
    bVar8 = (byte)puVar5[1];
    uVar35 = (uint)bVar8;
    puVar33 = auStack_a0;
    if (bVar8 < 2) {
      bVar10 = *(uint *)(puVar3 + 2) == 0;
      if (bVar8 != 0) {
        if (bVar10) {
          uVar43 = uVar43 + 1;
        }
        uVar16 = (ulong)uStack_f0;
        uStack_f0 = uStack_f0 + 1;
        lVar39 = (ulong)uVar43 - ((long)(uStack_f8 << (uVar16 & 0x3f)) >> 0x3f);
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
      puVar33 = auStack_a0 + !bVar10;
    }
    else {
      uVar16 = (ulong)uStack_f0;
      uStack_f0 = uStack_f0 + uVar35;
      uVar16 = ((uStack_f8 << (uVar16 & 0x3f)) >> ((ulong)-uVar35 & 0x3f)) + (ulong)uVar43;
code_r0x001542f4:
      auStack_a0[2] = auStack_a0[1];
    }
LAB_00154320:
    auStack_a0[0] = uVar16;
    auStack_a0[1] = *puVar33;
    if (bVar7 != 0) {
      uVar15 = (ulong)uStack_f0;
      uStack_f0 = uStack_f0 + bVar7;
      uVar49 = ((uStack_f8 << (uVar15 & 0x3f)) >> ((ulong)-(uint)bVar7 & 0x3f)) + uVar49;
    }
    if (0x1e < ((uint)bVar7 + (uint)bVar6 + uVar35 & 0xff)) {
      if (uStack_f0 < 0x41) {
        if (puStack_e8 < puVar17) {
          if (puStack_e8 == param_5) goto code_r0x00154360;
          uVar43 = (int)puStack_e8 - iVar23;
          if (param_5 <= (ulong *)((long)puStack_e8 - (ulong)(uStack_f0 >> 3))) {
            uVar43 = uStack_f0 >> 3;
          }
          uStack_f0 = uStack_f0 + uVar43 * -8;
        }
        else {
          uVar43 = uStack_f0 >> 3;
          uStack_f0 = uStack_f0 & 7;
        }
        puStack_e8 = (ulong *)((long)puStack_e8 - (ulong)uVar43);
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
    iVar48 = (int)param_7;
    iVar47 = iVar48 + -1;
    if (iVar47 != 0) {
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
        if (puStack_e8 < puVar17) {
          if (puStack_e8 != param_5) {
            uVar43 = (int)puStack_e8 - iVar23;
            if (param_5 <= (ulong *)((long)puStack_e8 - (ulong)(uStack_f0 >> 3))) {
              uVar43 = uStack_f0 >> 3;
            }
            uStack_f0 = uStack_f0 + uVar43 * -8;
            goto code_r0x00154464;
          }
        }
        else {
          uVar43 = uStack_f0 >> 3;
          uStack_f0 = uStack_f0 & 7;
code_r0x00154464:
          puStack_e8 = (ulong *)((long)puStack_e8 - (ulong)uVar43);
          uStack_f8 = *puStack_e8;
        }
        pbVar26 = (byte *)plVar12[0xed3];
        if (pbStack_88 + uVar50 <= pbVar26) goto code_r0x00154484;
      }
      else {
        puStack_e8 = (ulong *)&UNK_00814388;
        pbVar26 = (byte *)plVar12[0xed3];
        if (pbStack_88 + uVar50 <= pbVar26) goto code_r0x00154484;
      }
      if (iVar48 < 1) {
        return (byte *)0xffffffffffffffec;
      }
code_r0x001547d8:
      uVar15 = (long)pbVar26 - (long)pbStack_88;
      if (uVar15 == 0) goto code_r0x00154a08;
      if ((ulong)((long)pbVar11 - (long)pbVar41) < uVar15) {
        return (byte *)0xffffffffffffffba;
      }
      uVar31 = (long)pbVar41 - (long)pbStack_88;
      pbVar30 = pbVar41 + uVar15;
      if (((long)uVar31 < -7) && (7 < uVar15)) {
        if (uVar31 < 0xfffffffffffffff0) {
          pbVar26 = pbVar30 + -0x20;
          if (pbVar41 <= pbVar26) {
            uVar51 = *(undefined8 *)pbStack_88;
            *(undefined8 *)(pbVar41 + 8) = *(undefined8 *)(pbStack_88 + 8);
            *(undefined8 *)pbVar41 = uVar51;
            if (0x10 < (ulong)((long)pbVar26 - (long)pbVar41)) {
              pbVar21 = pbVar41 + 0x10;
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
              } while (pbVar21 < pbVar26);
            }
            pbStack_88 = pbStack_88 + ((long)pbVar26 - (long)pbVar41);
code_r0x001548ac:
            pbVar41 = pbVar41 + (uVar15 - (long)pbVar26);
            if ((pbVar41 < (byte *)0x8) || ((ulong)((long)pbVar26 - (long)pbStack_88) < 0x40)) {
              pbVar21 = pbVar26;
            }
            else {
              if (pbVar41 < (byte *)0x40) {
                pbVar38 = (byte *)0x0;
              }
              else {
                pbVar38 = (byte *)((ulong)pbVar41 & 0xffffffffffffffc0);
                pbVar13 = pbVar26 + 0x20;
                pbVar42 = pbStack_88 + 0x20;
                pbVar21 = pbVar38;
                do {
                  uVar51 = *(undefined8 *)(pbVar42 + -0x20);
                  uVar53 = *(undefined8 *)(pbVar42 + -8);
                  uVar52 = *(undefined8 *)(pbVar42 + -0x10);
                  uVar56 = *(undefined8 *)(pbVar42 + 8);
                  uVar54 = *(undefined8 *)pbVar42;
                  uVar60 = *(undefined8 *)(pbVar42 + 0x18);
                  uVar58 = *(undefined8 *)(pbVar42 + 0x10);
                  *(undefined8 *)(pbVar13 + -0x18) = *(undefined8 *)(pbVar42 + -0x18);
                  *(undefined8 *)(pbVar13 + -0x20) = uVar51;
                  *(undefined8 *)(pbVar13 + -8) = uVar53;
                  *(undefined8 *)(pbVar13 + -0x10) = uVar52;
                  *(undefined8 *)(pbVar13 + 8) = uVar56;
                  *(undefined8 *)pbVar13 = uVar54;
                  *(undefined8 *)(pbVar13 + 0x18) = uVar60;
                  *(undefined8 *)(pbVar13 + 0x10) = uVar58;
                  pbVar21 = pbVar21 + -0x40;
                  pbVar13 = pbVar13 + 0x40;
                  pbVar42 = pbVar42 + 0x40;
                } while (pbVar21 != (byte *)0x0);
                if (pbVar41 == pbVar38) goto code_r0x00154a00;
                if (((ulong)pbVar41 & 0x38) == 0) {
                  pbStack_88 = pbStack_88 + (long)pbVar38;
                  pbVar21 = pbVar26 + (long)pbVar38;
                  goto code_r0x001549d0;
                }
              }
              pbVar42 = (byte *)((ulong)pbVar41 & 0xfffffffffffffff8);
              lVar39 = (long)pbVar38 - (long)pbVar42;
              pbVar21 = pbVar26 + (long)pbVar38;
              pbVar13 = pbStack_88 + (long)pbVar38;
              do {
                *(undefined8 *)pbVar21 = *(undefined8 *)pbVar13;
                lVar39 = lVar39 + 8;
                pbVar21 = pbVar21 + 8;
                pbVar13 = pbVar13 + 8;
              } while (lVar39 != 0);
              pbVar21 = pbVar26 + (long)pbVar42;
              pbStack_88 = pbStack_88 + (long)pbVar42;
              if (pbVar41 == pbVar42) goto code_r0x00154a00;
            }
code_r0x001549d0:
            do {
              pbVar13 = pbVar21 + 1;
              *pbVar21 = *pbStack_88;
              pbVar21 = pbVar13;
              pbStack_88 = pbStack_88 + 1;
            } while (pbVar13 != pbVar26 + (long)pbVar41);
            goto code_r0x00154a00;
          }
        }
        pbVar26 = pbVar41;
        if (0 < (long)uVar15) goto code_r0x001548ac;
        goto code_r0x00154a00;
      }
      if ((long)uVar15 < 1) goto code_r0x00154a00;
      pbVar26 = pbVar41 + (long)pbVar26 + -(long)pbStack_88;
      if (pbVar26 <= pbVar41 + 1) {
        pbVar26 = pbVar41 + 1;
      }
      uVar27 = (long)pbVar26 - (long)pbVar41;
      if ((uVar27 < 8) || (uVar31 < 0x40)) goto code_r0x001549f0;
      if (uVar27 < 0x40) {
        uVar31 = 0;
        goto code_r0x00154994;
      }
      uVar31 = uVar27 & 0xffffffffffffffc0;
      pbVar26 = pbVar41 + 0x20;
      pbVar21 = pbStack_88 + 0x20;
      uVar40 = uVar31;
      do {
        uVar51 = *(undefined8 *)(pbVar21 + -0x20);
        uVar53 = *(undefined8 *)(pbVar21 + -8);
        uVar52 = *(undefined8 *)(pbVar21 + -0x10);
        uVar56 = *(undefined8 *)(pbVar21 + 8);
        uVar54 = *(undefined8 *)pbVar21;
        uVar60 = *(undefined8 *)(pbVar21 + 0x18);
        uVar58 = *(undefined8 *)(pbVar21 + 0x10);
        *(undefined8 *)(pbVar26 + -0x18) = *(undefined8 *)(pbVar21 + -0x18);
        *(undefined8 *)(pbVar26 + -0x20) = uVar51;
        *(undefined8 *)(pbVar26 + -8) = uVar53;
        *(undefined8 *)(pbVar26 + -0x10) = uVar52;
        *(undefined8 *)(pbVar26 + 8) = uVar56;
        *(undefined8 *)pbVar26 = uVar54;
        *(undefined8 *)(pbVar26 + 0x18) = uVar60;
        *(undefined8 *)(pbVar26 + 0x10) = uVar58;
        uVar40 = uVar40 - 0x40;
        pbVar26 = pbVar26 + 0x40;
        pbVar21 = pbVar21 + 0x40;
      } while (uVar40 != 0);
      if (uVar27 != uVar31) {
        if ((uVar27 & 0x38) == 0) {
          pbStack_88 = pbStack_88 + uVar31;
          pbVar41 = pbVar41 + uVar31;
        }
        else {
code_r0x00154994:
          uVar40 = uVar27 & 0xfffffffffffffff8;
          lVar39 = uVar31 - uVar40;
          pbVar26 = pbStack_88 + uVar31;
          pbVar21 = pbVar41 + uVar31;
          do {
            *(undefined8 *)pbVar21 = *(undefined8 *)pbVar26;
            lVar39 = lVar39 + 8;
            pbVar26 = pbVar26 + 8;
            pbVar21 = pbVar21 + 8;
          } while (lVar39 != 0);
          pbVar41 = pbVar41 + uVar40;
          pbStack_88 = pbStack_88 + uVar40;
          if (uVar27 == uVar40) goto code_r0x00154a00;
        }
code_r0x001549f0:
        do {
          pbVar26 = pbVar41 + 1;
          *pbVar41 = *pbStack_88;
          pbVar41 = pbVar26;
          pbStack_88 = pbStack_88 + 1;
        } while (pbVar26 < pbVar30);
      }
code_r0x00154a00:
      uVar50 = uVar50 - uVar15;
      pbVar41 = pbVar30;
code_r0x00154a08:
      pbVar30 = (byte *)((long)plVar12 + 0x176a4);
      *(undefined4 *)(plVar12 + 0xed4) = 0;
      pbVar26 = pbVar41 + uVar50;
      pbVar21 = pbVar26 + -uVar16;
      Hint_Prefetch(pbVar21,0,0,0);
      if ((pbVar30 < pbVar46 + uVar50) ||
         (pbVar13 = (byte *)(uVar50 + uVar49), pbVar11 + -0x20 < pbVar41 + (long)pbVar13)) {
        pbStack_88 = pbVar46;
        uStack_80 = uVar50;
        uStack_78 = uVar49;
        uStack_70 = uVar16;
        pbVar13 = (byte *)func_0x00155c78(pbVar41,pbVar11,&uStack_80,&pbStack_88,pbVar30,pbVar36,
                                          lVar44,uVar25);
      }
      else {
        uVar51 = *(undefined8 *)pbVar46;
        *(undefined8 *)(pbVar41 + 8) = *(undefined8 *)((long)plVar12 + 0x76ac);
        *(undefined8 *)pbVar41 = uVar51;
        if (0x10 < uVar50) {
          uVar51 = *(undefined8 *)((long)plVar12 + 0x76b4);
          *(undefined8 *)(pbVar41 + 0x18) = *(undefined8 *)((long)plVar12 + 0x76bc);
          *(undefined8 *)(pbVar41 + 0x10) = uVar51;
          if (0x10 < uVar50 - 0x10) {
            pbVar42 = pbVar41 + 0x20;
            puVar20 = (undefined8 *)((long)plVar12 + 0x76d4);
            do {
              uVar51 = puVar20[-2];
              *(undefined8 *)(pbVar42 + 8) = puVar20[-1];
              *(undefined8 *)pbVar42 = uVar51;
              uVar51 = *puVar20;
              *(undefined8 *)(pbVar42 + 0x18) = puVar20[1];
              *(undefined8 *)(pbVar42 + 0x10) = uVar51;
              pbVar42 = pbVar42 + 0x20;
              puVar20 = puVar20 + 4;
            } while (pbVar42 < pbVar26);
          }
        }
        pbStack_88 = pbVar46 + uVar50;
        if ((ulong)((long)pbVar26 - (long)pbVar36) < uVar16) {
          if ((ulong)((long)pbVar26 - lVar44) < uVar16) {
            return (byte *)0xffffffffffffffec;
          }
          lVar45 = (long)pbVar21 - (long)pbVar36;
          lVar39 = uVar25 + lVar45;
          if (lVar39 + uVar49 <= uVar25) {
            _memmove(pbVar26,lVar39,uVar49);
            goto joined_r0x00154b24;
          }
          _memmove(pbVar26,lVar39,-lVar45);
          pbVar26 = pbVar26 + -lVar45;
          uVar49 = lVar45 + uVar49;
          pbVar21 = pbVar36;
        }
        if (uVar16 < 0x10) {
          if (uVar16 < 8) {
            iVar9 = *(int *)(&UNK_008143b0 + uVar16 * 4);
            *pbVar26 = *pbVar21;
            pbVar26[1] = pbVar21[1];
            pbVar26[2] = pbVar21[2];
            pbVar26[3] = pbVar21[3];
            pbVar46 = pbVar21 + *(uint *)(&UNK_00814390 + uVar16 * 4);
            pbVar21 = pbVar46 + -(long)iVar9;
            *(undefined4 *)(pbVar26 + 4) = *(undefined4 *)pbVar46;
          }
          else {
            *(undefined8 *)pbVar26 = *(undefined8 *)pbVar21;
          }
          if (8 < uVar49) {
            pbVar46 = pbVar21 + 8;
            pbVar42 = pbVar26 + 8;
            if ((long)pbVar42 - (long)pbVar46 < 0x10) {
              do {
                pbVar21 = pbVar42 + 8;
                *(undefined8 *)pbVar42 = *(undefined8 *)pbVar46;
                pbVar46 = pbVar46 + 8;
                pbVar42 = pbVar21;
              } while (pbVar21 < pbVar26 + uVar49);
            }
            else {
              uVar51 = *(undefined8 *)pbVar46;
              *(undefined8 *)(pbVar26 + 0x10) = *(undefined8 *)(pbVar21 + 0x10);
              *(undefined8 *)pbVar42 = uVar51;
              if (0x10 < uVar49 - 8) {
                pbVar46 = pbVar26 + 0x18;
                pbVar21 = pbVar21 + 0x28;
                do {
                  uVar51 = *(undefined8 *)(pbVar21 + -0x10);
                  *(undefined8 *)(pbVar46 + 8) = *(undefined8 *)(pbVar21 + -8);
                  *(undefined8 *)pbVar46 = uVar51;
                  uVar51 = *(undefined8 *)pbVar21;
                  *(undefined8 *)(pbVar46 + 0x18) = *(undefined8 *)(pbVar21 + 8);
                  *(undefined8 *)(pbVar46 + 0x10) = uVar51;
                  pbVar46 = pbVar46 + 0x20;
                  pbVar21 = pbVar21 + 0x20;
                } while (pbVar46 < pbVar26 + uVar49);
              }
            }
          }
        }
        else {
          uVar51 = *(undefined8 *)pbVar21;
          *(undefined8 *)(pbVar26 + 8) = *(undefined8 *)(pbVar21 + 8);
          *(undefined8 *)pbVar26 = uVar51;
          if (0x10 < uVar49) {
            pbVar46 = pbVar26 + 0x10;
            do {
              uVar51 = *(undefined8 *)(pbVar21 + 0x10);
              *(undefined8 *)(pbVar46 + 8) = *(undefined8 *)(pbVar21 + 0x18);
              *(undefined8 *)pbVar46 = uVar51;
              uVar51 = *(undefined8 *)(pbVar21 + 0x20);
              *(undefined8 *)(pbVar46 + 0x18) = *(undefined8 *)(pbVar21 + 0x28);
              *(undefined8 *)(pbVar46 + 0x10) = uVar51;
              pbVar46 = pbVar46 + 0x20;
              pbVar21 = pbVar21 + 0x20;
            } while (pbVar46 < pbVar26 + uVar49);
          }
        }
      }
joined_r0x00154b24:
      if ((byte *)0xffffffffffffff88 < pbVar13) {
        return pbVar13;
      }
      pbVar41 = pbVar41 + (long)pbVar13;
      if (iVar48 < 2) {
        if (iVar47 != 0) {
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
          uVar43 = *(uint *)(puVar5 + 2);
          bVar6 = (byte)puVar3[1];
          bVar7 = (byte)puVar4[1];
          bVar8 = (byte)puVar5[1];
          uVar35 = (uint)bVar8;
          puVar33 = auStack_a0;
          if (bVar8 < 2) {
            bVar10 = *(uint *)(puVar3 + 2) == 0;
            if (bVar8 != 0) {
              if (bVar10) {
                uVar43 = uVar43 + 1;
              }
              uVar16 = (ulong)uStack_f0;
              uStack_f0 = uStack_f0 + 1;
              lVar39 = (ulong)uVar43 - ((long)(uStack_f8 << (uVar16 & 0x3f)) >> 0x3f);
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
            puVar33 = auStack_a0 + !bVar10;
          }
          else {
            uVar16 = (ulong)uStack_f0;
            uStack_f0 = uStack_f0 + uVar35;
            uVar16 = ((uStack_f8 << (uVar16 & 0x3f)) >> ((ulong)-uVar35 & 0x3f)) + (ulong)uVar43;
code_r0x00154bb0:
            auStack_a0[2] = auStack_a0[1];
          }
LAB_00154bdc:
          auStack_a0[0] = uVar16;
          auStack_a0[1] = *puVar33;
          if (bVar7 != 0) {
            uVar15 = (ulong)uStack_f0;
            uStack_f0 = uStack_f0 + bVar7;
            uVar49 = ((uStack_f8 << (uVar15 & 0x3f)) >> ((ulong)-(uint)bVar7 & 0x3f)) + uVar49;
          }
          if (0x1e < ((uint)bVar7 + (uint)bVar6 + uVar35 & 0xff)) {
            if (uStack_f0 < 0x41) {
              if (puStack_e8 < puVar17) {
                if (puStack_e8 != param_5) {
                  uVar43 = (int)puStack_e8 - iVar23;
                  if (param_5 <= (ulong *)((long)puStack_e8 - (ulong)(uStack_f0 >> 3))) {
                    uVar43 = uStack_f0 >> 3;
                  }
                  puStack_e8 = (ulong *)((long)puStack_e8 - (ulong)uVar43);
                  uStack_f0 = uStack_f0 + uVar43 * -8;
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
          if (iVar47 != 1) {
            iVar48 = uStack_f0 + *(byte *)((long)puVar3 + 3);
            uStack_d0 = (uStack_f8 >> ((ulong)(uint)-iVar48 & 0x3f) &
                        (ulong)*(uint *)(&UNK_00814304 +
                                        (ulong)(uint)*(byte *)((long)puVar3 + 3) * 4)) +
                        (ulong)*puVar3;
            iVar48 = iVar48 + (uint)*(byte *)((long)puVar4 + 3);
            uStack_b0 = (uStack_f8 >> ((ulong)(uint)-iVar48 & 0x3f) &
                        (ulong)*(uint *)(&UNK_00814304 +
                                        (ulong)(uint)*(byte *)((long)puVar4 + 3) * 4)) +
                        (ulong)*puVar4;
            uStack_f0 = iVar48 + (uint)*(byte *)((long)puVar5 + 3);
            uStack_c0 = (uStack_f8 >> ((ulong)-uStack_f0 & 0x3f) &
                        (ulong)*(uint *)(&UNK_00814304 +
                                        (ulong)(uint)*(byte *)((long)puVar5 + 3) * 4)) +
                        (ulong)*puVar5;
            if (uStack_f0 < 0x41) {
              if (puStack_e8 < puVar17) {
                if (puStack_e8 == param_5) goto LAB_00154d14;
                uVar43 = (int)puStack_e8 - iVar23;
                if (param_5 <= (ulong *)((long)puStack_e8 - (ulong)(uStack_f0 >> 3))) {
                  uVar43 = uStack_f0 >> 3;
                }
                uStack_f0 = uStack_f0 + uVar43 * -8;
              }
              else {
                uVar43 = uStack_f0 >> 3;
                uStack_f0 = uStack_f0 & 7;
              }
              puStack_e8 = (ulong *)((long)puStack_e8 - (ulong)uVar43);
              uStack_f8 = *puStack_e8;
            }
            else {
              puStack_e8 = (ulong *)&UNK_00814388;
            }
          }
LAB_00154d14:
          pbVar46 = pbVar41 + uVar50;
          pbVar26 = pbVar46 + -uVar16;
          Hint_Prefetch(pbVar26,0,0,0);
          if ((pbVar30 < pbStack_88 + uVar50) ||
             (pbVar21 = (byte *)(uVar50 + uVar49), pbVar11 + -0x20 < pbVar41 + (long)pbVar21)) {
            uStack_80 = uVar50;
            uStack_78 = uVar49;
            uStack_70 = uVar16;
            pbVar21 = (byte *)func_0x00155c78(pbVar41,pbVar11,&uStack_80,&pbStack_88,pbVar30,pbVar36
                                              ,lVar44,uVar25);
          }
          else {
            uVar51 = *(undefined8 *)pbStack_88;
            *(undefined8 *)(pbVar41 + 8) = *(undefined8 *)(pbStack_88 + 8);
            *(undefined8 *)pbVar41 = uVar51;
            if (0x10 < uVar50) {
              uVar51 = *(undefined8 *)(pbStack_88 + 0x10);
              *(undefined8 *)(pbVar41 + 0x18) = *(undefined8 *)(pbStack_88 + 0x18);
              *(undefined8 *)(pbVar41 + 0x10) = uVar51;
              if (0x10 < uVar50 - 0x10) {
                pbVar13 = pbVar41 + 0x20;
                pbVar42 = pbStack_88 + 0x30;
                do {
                  uVar51 = *(undefined8 *)(pbVar42 + -0x10);
                  *(undefined8 *)(pbVar13 + 8) = *(undefined8 *)(pbVar42 + -8);
                  *(undefined8 *)pbVar13 = uVar51;
                  uVar51 = *(undefined8 *)pbVar42;
                  *(undefined8 *)(pbVar13 + 0x18) = *(undefined8 *)(pbVar42 + 8);
                  *(undefined8 *)(pbVar13 + 0x10) = uVar51;
                  pbVar13 = pbVar13 + 0x20;
                  pbVar42 = pbVar42 + 0x20;
                } while (pbVar13 < pbVar46);
              }
            }
            pbStack_88 = pbStack_88 + uVar50;
            if ((ulong)((long)pbVar46 - (long)pbVar36) < uVar16) {
              if ((ulong)((long)pbVar46 - lVar44) < uVar16) {
                return (byte *)0xffffffffffffffec;
              }
              lVar45 = (long)pbVar26 - (long)pbVar36;
              lVar39 = uVar25 + lVar45;
              if (lVar39 + uVar49 <= uVar25) {
                _memmove(pbVar46,lVar39,uVar49);
                goto joined_r0x00154e58;
              }
              _memmove(pbVar46,lVar39,-lVar45);
              pbVar46 = pbVar46 + -lVar45;
              uVar49 = lVar45 + uVar49;
              pbVar26 = pbVar36;
            }
            if (uVar16 < 0x10) {
              if (uVar16 < 8) {
                iVar48 = *(int *)(&UNK_008143b0 + uVar16 * 4);
                *pbVar46 = *pbVar26;
                pbVar46[1] = pbVar26[1];
                pbVar46[2] = pbVar26[2];
                pbVar46[3] = pbVar26[3];
                pbVar13 = pbVar26 + *(uint *)(&UNK_00814390 + uVar16 * 4);
                pbVar26 = pbVar13 + -(long)iVar48;
                *(undefined4 *)(pbVar46 + 4) = *(undefined4 *)pbVar13;
              }
              else {
                *(undefined8 *)pbVar46 = *(undefined8 *)pbVar26;
              }
              if (8 < uVar49) {
                pbVar13 = pbVar26 + 8;
                pbVar42 = pbVar46 + 8;
                if ((long)pbVar42 - (long)pbVar13 < 0x10) {
                  do {
                    pbVar26 = pbVar42 + 8;
                    *(undefined8 *)pbVar42 = *(undefined8 *)pbVar13;
                    pbVar13 = pbVar13 + 8;
                    pbVar42 = pbVar26;
                  } while (pbVar26 < pbVar46 + uVar49);
                }
                else {
                  uVar51 = *(undefined8 *)pbVar13;
                  *(undefined8 *)(pbVar46 + 0x10) = *(undefined8 *)(pbVar26 + 0x10);
                  *(undefined8 *)pbVar42 = uVar51;
                  if (0x10 < uVar49 - 8) {
                    pbVar13 = pbVar46 + 0x18;
                    pbVar26 = pbVar26 + 0x28;
                    do {
                      uVar51 = *(undefined8 *)(pbVar26 + -0x10);
                      *(undefined8 *)(pbVar13 + 8) = *(undefined8 *)(pbVar26 + -8);
                      *(undefined8 *)pbVar13 = uVar51;
                      uVar51 = *(undefined8 *)pbVar26;
                      *(undefined8 *)(pbVar13 + 0x18) = *(undefined8 *)(pbVar26 + 8);
                      *(undefined8 *)(pbVar13 + 0x10) = uVar51;
                      pbVar13 = pbVar13 + 0x20;
                      pbVar26 = pbVar26 + 0x20;
                    } while (pbVar13 < pbVar46 + uVar49);
                  }
                }
              }
            }
            else {
              uVar51 = *(undefined8 *)pbVar26;
              *(undefined8 *)(pbVar46 + 8) = *(undefined8 *)(pbVar26 + 8);
              *(undefined8 *)pbVar46 = uVar51;
              if (0x10 < uVar49) {
                pbVar13 = pbVar46 + 0x10;
                do {
                  uVar51 = *(undefined8 *)(pbVar26 + 0x10);
                  *(undefined8 *)(pbVar13 + 8) = *(undefined8 *)(pbVar26 + 0x18);
                  *(undefined8 *)pbVar13 = uVar51;
                  uVar51 = *(undefined8 *)(pbVar26 + 0x20);
                  *(undefined8 *)(pbVar13 + 0x18) = *(undefined8 *)(pbVar26 + 0x28);
                  *(undefined8 *)(pbVar13 + 0x10) = uVar51;
                  pbVar13 = pbVar13 + 0x20;
                  pbVar26 = pbVar26 + 0x20;
                } while (pbVar13 < pbVar46 + uVar49);
              }
            }
          }
joined_r0x00154e58:
          if ((byte *)0xffffffffffffff88 < pbVar21) {
            return pbVar21;
          }
          pbVar41 = pbVar41 + (long)pbVar21;
          iVar47 = iVar47 + -1;
        } while (iVar47 != 0);
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
      iVar23 = (int)plVar12[0xed4];
      pbVar36 = pbStack_88;
      goto joined_r0x001550b0;
    }
    pbVar26 = (byte *)plVar12[0xed3];
    if (pbVar26 < pbStack_88 + uVar50) goto code_r0x001547d8;
code_r0x00154484:
    pbVar26 = pbStack_88 + uVar50;
    if ((pbVar30 < pbVar26) ||
       (pbVar21 = (byte *)(uVar50 + uVar49), pbVar26 + -0x20 < pbVar41 + (long)pbVar21)) {
      uStack_80 = uVar50;
      uStack_78 = uVar49;
      uStack_70 = uVar16;
      pbVar21 = (byte *)func_0x00156308(pbVar41,pbVar11,pbVar26 + -0x20,&uStack_80,&pbStack_88,
                                        pbVar30,pbVar36,lVar44,uVar25);
    }
    else {
      pbVar13 = pbVar41 + uVar50;
      uVar51 = *(undefined8 *)pbStack_88;
      *(undefined8 *)(pbVar41 + 8) = *(undefined8 *)(pbStack_88 + 8);
      *(undefined8 *)pbVar41 = uVar51;
      if (0x10 < uVar50) {
        uVar51 = *(undefined8 *)(pbStack_88 + 0x10);
        *(undefined8 *)(pbVar41 + 0x18) = *(undefined8 *)(pbStack_88 + 0x18);
        *(undefined8 *)(pbVar41 + 0x10) = uVar51;
        if (0x10 < uVar50 - 0x10) {
          pbVar42 = pbVar41 + 0x20;
          pbVar38 = pbStack_88 + 0x30;
          do {
            uVar51 = *(undefined8 *)(pbVar38 + -0x10);
            *(undefined8 *)(pbVar42 + 8) = *(undefined8 *)(pbVar38 + -8);
            *(undefined8 *)pbVar42 = uVar51;
            uVar51 = *(undefined8 *)pbVar38;
            *(undefined8 *)(pbVar42 + 0x18) = *(undefined8 *)(pbVar38 + 8);
            *(undefined8 *)(pbVar42 + 0x10) = uVar51;
            pbVar42 = pbVar42 + 0x20;
            pbVar38 = pbVar38 + 0x20;
          } while (pbVar42 < pbVar13);
        }
      }
      pbStack_88 = pbVar26;
      pbVar26 = pbVar13 + -uVar16;
      if ((ulong)((long)pbVar13 - (long)pbVar36) < uVar16) {
        if ((ulong)((long)pbVar13 - lVar44) < uVar16) {
          return (byte *)0xffffffffffffffec;
        }
        lVar45 = (long)(pbVar13 + -uVar16) - (long)pbVar36;
        lVar39 = uVar25 + lVar45;
        if (lVar39 + uVar49 <= uVar25) {
          _memmove(pbVar13,lVar39,uVar49);
          goto LAB_00154570;
        }
        _memmove(pbVar13,lVar39,-lVar45);
        pbVar13 = pbVar13 + -lVar45;
        uVar49 = lVar45 + uVar49;
        pbVar26 = pbVar36;
      }
      if (uVar16 < 0x10) {
        if (uVar16 < 8) {
          iVar47 = *(int *)(&UNK_008143b0 + uVar16 * 4);
          *pbVar13 = *pbVar26;
          pbVar13[1] = pbVar26[1];
          pbVar13[2] = pbVar26[2];
          pbVar13[3] = pbVar26[3];
          pbVar42 = pbVar26 + *(uint *)(&UNK_00814390 + uVar16 * 4);
          pbVar26 = pbVar42 + -(long)iVar47;
          *(undefined4 *)(pbVar13 + 4) = *(undefined4 *)pbVar42;
        }
        else {
          *(undefined8 *)pbVar13 = *(undefined8 *)pbVar26;
        }
        if (8 < uVar49) {
          pbVar42 = pbVar26 + 8;
          pbVar38 = pbVar13 + 8;
          if ((long)pbVar38 - (long)pbVar42 < 0x10) {
            do {
              pbVar26 = pbVar38 + 8;
              *(undefined8 *)pbVar38 = *(undefined8 *)pbVar42;
              pbVar42 = pbVar42 + 8;
              pbVar38 = pbVar26;
            } while (pbVar26 < pbVar13 + uVar49);
          }
          else {
            uVar51 = *(undefined8 *)pbVar42;
            *(undefined8 *)(pbVar13 + 0x10) = *(undefined8 *)(pbVar26 + 0x10);
            *(undefined8 *)pbVar38 = uVar51;
            if (0x10 < uVar49 - 8) {
              pbVar42 = pbVar13 + 0x18;
              pbVar26 = pbVar26 + 0x28;
              do {
                uVar51 = *(undefined8 *)(pbVar26 + -0x10);
                *(undefined8 *)(pbVar42 + 8) = *(undefined8 *)(pbVar26 + -8);
                *(undefined8 *)pbVar42 = uVar51;
                uVar51 = *(undefined8 *)pbVar26;
                *(undefined8 *)(pbVar42 + 0x18) = *(undefined8 *)(pbVar26 + 8);
                *(undefined8 *)(pbVar42 + 0x10) = uVar51;
                pbVar42 = pbVar42 + 0x20;
                pbVar26 = pbVar26 + 0x20;
              } while (pbVar42 < pbVar13 + uVar49);
            }
          }
        }
      }
      else {
        uVar51 = *(undefined8 *)pbVar26;
        *(undefined8 *)(pbVar13 + 8) = *(undefined8 *)(pbVar26 + 8);
        *(undefined8 *)pbVar13 = uVar51;
        if (0x10 < uVar49) {
          pbVar42 = pbVar13 + 0x10;
          do {
            uVar51 = *(undefined8 *)(pbVar26 + 0x10);
            *(undefined8 *)(pbVar42 + 8) = *(undefined8 *)(pbVar26 + 0x18);
            *(undefined8 *)pbVar42 = uVar51;
            uVar51 = *(undefined8 *)(pbVar26 + 0x20);
            *(undefined8 *)(pbVar42 + 0x18) = *(undefined8 *)(pbVar26 + 0x28);
            *(undefined8 *)(pbVar42 + 0x10) = uVar51;
            pbVar42 = pbVar42 + 0x20;
            pbVar26 = pbVar26 + 0x20;
          } while (pbVar42 < pbVar13 + uVar49);
        }
      }
    }
LAB_00154570:
    if ((byte *)0xffffffffffffff88 < pbVar21) {
      return pbVar21;
    }
    pbVar41 = pbVar41 + (long)pbVar21;
    param_7 = (ulong *)(ulong)(iVar48 - 1U);
    if (iVar48 - 1U == 0) goto code_r0x00155070;
  } while( true );
LAB_00153e5c:
  unaff_x24 = (byte *)0xffffffffffffffec;
  puVar17 = unaff_x26;
  goto LAB_00153e60;
}

