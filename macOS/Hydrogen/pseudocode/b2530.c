
/* WARNING: Removing unreachable block (ram,0x000b1f8c) */
/* WARNING: Removing unreachable block (ram,0x000b34ec) */
/* WARNING: Removing unreachable block (ram,0x000b3ea0) */
/* WARNING: Type propagation algorithm not settling */

int FUN_000b2530(ulong *param_1,undefined8 param_2,undefined8 param_3,uint param_4,
                undefined8 param_5,int param_6,long param_7,undefined8 param_8,ulong *param_9,
                ulong *param_10,undefined8 param_11,undefined8 param_12,ulong param_13,
                ulong param_14,ulong param_15,ulong param_16,undefined8 param_17,int *param_18,
                uint *param_19,undefined8 param_20,long param_21,long param_22,long param_23,
                ulong param_24,undefined8 param_25,ulong param_26,ulong param_27,ulong param_28,
                undefined8 param_29,ulong param_30)

{
  long *plVar1;
  ulong *puVar2;
  uint uVar3;
  ushort uVar4;
  bool bVar5;
  int iVar6;
  char *pcVar7;
  char *pcVar8;
  ulong *puVar9;
  int iVar10;
  uint uVar11;
  long lVar12;
  uint *puVar13;
  int iVar14;
  ulong *puVar15;
  ulong *puVar16;
  uint uVar17;
  uint uVar18;
  ulong *puVar19;
  long lVar20;
  char *pcVar21;
  int *piVar22;
  int iVar23;
  int iVar24;
  ulong *puVar25;
  ulong *puVar26;
  uint *puVar27;
  uint *puVar28;
  ulong *puVar29;
  uint uVar30;
  uint uVar31;
  ulong *puVar32;
  ulong uVar33;
  ulong uVar34;
  uint *puVar35;
  ulong *puVar36;
  int iVar37;
  ulong in_x10;
  ulong uVar38;
  undefined4 *puVar39;
  ulong in_x11;
  ulong uVar40;
  ulong *puVar41;
  ulong uVar42;
  long lVar43;
  uint *puVar44;
  ulong *in_x13;
  ulong uVar45;
  int *piVar46;
  ulong *puVar47;
  int in_w15;
  long lVar48;
  int iVar49;
  int iVar50;
  long lVar51;
  ulong uVar52;
  ulong uVar53;
  int iVar54;
  uint uVar55;
  int iVar56;
  ulong *unaff_x19;
  ulong unaff_x21;
  ulong *unaff_x22;
  uint uVar57;
  int iVar58;
  ulong uVar59;
  ulong *unaff_x24;
  long lVar60;
  uint unaff_w25;
  long unaff_x26;
  int iVar61;
  ulong unaff_x28;
  ulong *puVar62;
  long unaff_x29;
  int unaff_w30;
  int iVar63;
  ulong uVar64;
  ulong uVar65;
  ulong uVar66;
  undefined8 unaff_d8;
  undefined8 uVar67;
  undefined8 uVar68;
  undefined1 auVar69 [16];
  undefined1 auVar70 [16];
  uint uVar71;
  uint uVar72;
  uint uVar73;
  uint uVar74;
  ulong in_d20;
  ulong in_register_00005288;
  int in_s21;
  int in_register_000052a4;
  int in_register_000052a8;
  int in_register_000052ac;
  undefined8 in_d22;
  ulong in_register_000052c8;
  int in_s23;
  int in_register_000052e4;
  int in_register_000052e8;
  int in_register_000052ec;
  ulong uStack00000000000000b0;
  int in_stack_000000c8;
  char *in_stack_000000e8;
  int *in_stack_000000f0;
  char *in_stack_00000110;
  int in_stack_00000118;
  ulong *in_stack_00000138;
  int in_stack_00000158;
  int in_stack_00000160;
  undefined8 in_stack_00000168;
  
  do {
    puVar62 = in_x13 + 4;
    puVar9 = unaff_x19 + 4;
    uVar59 = in_x11;
    do {
      uVar52 = puVar62[-4];
      uVar40 = puVar62[-1];
      uVar33 = puVar62[-2];
      uVar42 = *puVar62;
      uVar30 = *(uint *)((long)puVar62 + 4);
      uVar38 = puVar62[1];
      uVar11 = *(uint *)((long)puVar62 + 0xc);
      uVar34 = puVar62[3];
      uVar53 = puVar62[2];
      puVar9[-3] = puVar62[-3];
      puVar9[-4] = uVar52;
      puVar9[-1] = uVar40;
      puVar9[-2] = uVar33;
      *(uint *)(puVar9 + 1) = (uint)uVar38;
      *(uint *)((long)puVar9 + 0xc) = uVar11;
      *(uint *)puVar9 = (uint)uVar42;
      *(uint *)((long)puVar9 + 4) = uVar30;
      puVar9[3] = uVar34;
      puVar9[2] = uVar53;
      uVar59 = uVar59 - 8;
      puVar62 = puVar62 + 8;
      puVar9 = puVar9 + 8;
    } while (uVar59 != 0);
    in_x13 = in_x13 + in_x11;
    puVar62 = unaff_x19 + in_x11;
    pcVar8 = in_stack_00000110;
    puVar9 = in_stack_00000138;
    uVar59 = unaff_x21;
    if (in_x10 == in_x11) goto LAB_000b2580;
    do {
      do {
        puVar25 = puVar62 + 1;
        *puVar62 = *in_x13;
        in_x13 = in_x13 + 1;
        puVar62 = puVar25;
        pcVar8 = in_stack_00000110;
        puVar9 = in_stack_00000138;
        uVar59 = unaff_x21;
      } while (puVar25 < param_1);
LAB_000b2580:
      in_x13 = puVar9;
      in_stack_00000110 = (char *)((long)param_1 + 2);
      *(short *)param_1 = (short)unaff_w25;
      uVar33 = uVar59 - 4;
      if ((in_w15 != 0) && (in_stack_000000e8 < in_stack_00000110 + uVar33 / 0xff + 6)) {
code_r0x000b49e4:
        if (in_w15 != 2) goto code_r0x000b4acc;
        uVar33 = (long)unaff_x24 - (long)in_x13;
        lVar60 = uVar33 + (uVar33 + 0xf0) / 0xff;
        in_w15 = 2;
        in_stack_00000110 = pcVar8;
        if ((char *)(param_22 + -8) < pcVar8 + lVar60 + 1) goto LAB_000b087c;
        uVar40 = ((param_22 + -8) - (long)(pcVar8 + lVar60 + 1)) * 0xff + 0x12;
        iVar63 = (int)uVar40;
        if ((ulong)(long)(int)uVar59 <= uVar40) {
          iVar63 = (int)uVar59;
        }
        lVar43 = (long)iVar63;
        if ((long)(~(ulong)(pcVar8 + lVar60 + 3) + param_22 + lVar43) < 0xc) goto LAB_000b087c;
        puVar62 = (ulong *)(pcVar8 + 1);
        uVar59 = uVar33 - 0xf;
        if (uVar33 < 0xf) {
          *pcVar8 = (char)((int)uVar33 << 4);
        }
        else {
          *pcVar8 = -0x10;
          puVar9 = puVar62;
          if (0xfe < uVar59) {
            uVar59 = (uVar33 - 0x10e) / 0xff;
            _memset(puVar62,0xff,uVar59 + 1);
            puVar9 = (ulong *)(pcVar8 + uVar59 + 2);
            uVar59 = (uVar33 - 0x10e) % 0xff;
            in_w15 = in_stack_00000168._4_4_;
          }
          puVar62 = (ulong *)((long)puVar9 + 1);
          *(char *)puVar9 = (char)uVar59;
        }
        puVar9 = (ulong *)((long)puVar62 + uVar33);
        puVar25 = (ulong *)((char *)((long)puVar62 + (long)unaff_x24) + -(long)in_x13);
        if ((char *)((long)puVar62 + (long)unaff_x24) + -(long)in_x13 <= puVar62 + 1) {
          puVar25 = puVar62 + 1;
        }
        if (((char *)((long)puVar25 + ~(ulong)puVar62) <= segment_command_00000020.segname + 0xf) ||
           ((ulong)((long)puVar62 - (long)in_x13) < 0x40)) {
          puVar25 = puVar62;
          goto LAB_000b4dfc;
        }
        uVar59 = ((long)puVar25 + ~(ulong)puVar62 >> 3) + 1;
        uVar42 = uVar59 & 0x3ffffffffffffff8;
        puVar25 = in_x13 + 4;
        puVar47 = puVar62 + 4;
        uVar40 = uVar42;
        do {
          uVar45 = puVar25[-4];
          uVar52 = puVar25[-1];
          uVar38 = puVar25[-2];
          uVar53 = *puVar25;
          uVar34 = puVar25[1];
          uVar65 = puVar25[3];
          uVar64 = puVar25[2];
          puVar47[-3] = puVar25[-3];
          puVar47[-4] = uVar45;
          puVar47[-1] = uVar52;
          puVar47[-2] = uVar38;
          puVar47[1] = uVar34;
          *puVar47 = uVar53;
          puVar47[3] = uVar65;
          puVar47[2] = uVar64;
          uVar40 = uVar40 - 8;
          puVar25 = puVar25 + 8;
          puVar47 = puVar47 + 8;
        } while (uVar40 != 0);
        in_x13 = in_x13 + uVar42;
        puVar25 = puVar62 + uVar42;
        if (uVar59 != uVar42) {
LAB_000b4dfc:
          do {
            puVar47 = puVar25 + 1;
            *puVar25 = *in_x13;
            in_x13 = in_x13 + 1;
            puVar25 = puVar47;
          } while (puVar47 < puVar9);
        }
        in_stack_00000110 = (char *)((long)puVar9 + 2);
        *(short *)puVar9 = (short)unaff_w25;
        if (lVar43 - 4U < 0xf) {
          *pcVar8 = *pcVar8 + (char)(lVar43 - 4U);
        }
        else {
          *pcVar8 = *pcVar8 + '\x0f';
          uVar59 = lVar43 - 0x13;
          if (0x1fd < uVar59) {
            lVar60 = ((lVar43 - 0x211U) / 0x1fe) * 2;
            _memset(in_stack_00000110,0xff,lVar60 + 2);
            in_stack_00000110 = (char *)((long)puVar62 + lVar60 + uVar33 + 4);
            uVar59 = (lVar43 - 0x211U) % 0x1fe;
            in_w15 = in_stack_00000168._4_4_;
          }
          pcVar8 = in_stack_00000110;
          if (0xfe < uVar59) {
            pcVar8 = in_stack_00000110 + 1;
            *in_stack_00000110 = -1;
            uVar59 = uVar59 - 0xff;
          }
          in_stack_00000110 = pcVar8 + 1;
          *pcVar8 = (char)uVar59;
        }
        in_x13 = (ulong *)((long)unaff_x24 + lVar43);
LAB_000b087c:
        pcVar8 = (char *)(param_23 - (long)in_x13);
        lVar60 = 5;
        if (in_w15 != 2) {
          lVar60 = 0;
        }
        if ((in_w15 != 0) &&
           (in_stack_000000e8 = in_stack_000000e8 + lVar60,
           in_stack_000000e8 <
           in_stack_00000110 + (long)(pcVar8 + (ulong)(pcVar8 + 0xf0) / 0xff + 1))) {
          if (in_w15 == 1) {
code_r0x000b4acc:
            iVar63 = 0;
            _free(*(undefined8 *)(unaff_x29 + -0xa0));
            goto code_r0x000b4c80;
          }
          pcVar8 = in_stack_000000e8 +
                   (~(ulong)in_stack_00000110 -
                   ((ulong)(in_stack_000000e8 + ~(ulong)in_stack_00000110 + 0xf1) >> 8));
        }
        iVar63 = (int)pcVar8;
        pcVar21 = pcVar8 + -0xf;
        if (pcVar8 < "") {
          *in_stack_00000110 = (char)(iVar63 << 4);
        }
        else {
          pcVar7 = in_stack_00000110 + 1;
          *in_stack_00000110 = -0x10;
          if ("" < pcVar21) {
            uVar59 = (ulong)(pcVar8 + -0x10e) / 0xff;
            _memset(pcVar7,0xff,uVar59 + 1);
            pcVar21 = (char *)((ulong)(pcVar8 + -0x10e) % 0xff);
            pcVar7 = in_stack_00000110 + uVar59 + 2;
          }
          *pcVar7 = (char)pcVar21;
          in_stack_00000110 = pcVar7;
        }
        _memcpy(in_stack_00000110 + 1,in_x13,pcVar8);
        *in_stack_000000f0 = ((int)in_x13 + iVar63) - in_stack_00000160;
        iVar63 = ((int)(in_stack_00000110 + 1) + iVar63) - (int)*(undefined8 *)(unaff_x29 + -0x100);
        _free(*(undefined8 *)(unaff_x29 + -0xa0));
        if (0 < iVar63) {
          return iVar63;
        }
code_r0x000b4c80:
        *(undefined1 *)(*(long *)(unaff_x29 + -0xb8) + 0x27) = 1;
        return iVar63;
      }
      if (uVar33 < 0xf) {
        *pcVar8 = *pcVar8 + (char)uVar33;
        puVar62 = *(ulong **)(unaff_x29 + -0x78);
      }
      else {
        *pcVar8 = *pcVar8 + '\x0f';
        uVar33 = uVar59 - 0x13;
        if (0x1fd < uVar33) {
          lVar60 = ((uVar59 - 0x211) / 0x1fe) * 2;
          _memset(in_stack_00000110,0xff,lVar60 + 2);
          in_s23 = 4;
          in_register_000052e4 = 4;
          in_register_000052e8 = 4;
          in_register_000052ec = 4;
          in_s21 = -0x13;
          in_register_000052a4 = -0x13;
          in_register_000052a8 = -0x13;
          in_register_000052ac = -0x13;
          unaff_w30 = 0x10;
          param_4 = 0xffff;
          param_6 = -0x61c8864f;
          param_7 = *(long *)(unaff_x29 + -0x98);
          unaff_x24 = *(ulong **)(unaff_x29 + -0xd8);
          in_stack_00000110 = (char *)((long)unaff_x19 + lVar60 + unaff_x28 + 4);
          uVar33 = (uVar59 - 0x211) % 0x1fe;
          unaff_x22 = *(ulong **)(unaff_x29 + -200);
          in_d20 = param_27;
          in_register_00005288 = param_28;
          in_d22 = param_25;
          in_register_000052c8 = param_26;
          in_w15 = in_stack_00000168._4_4_;
        }
        puVar62 = *(ulong **)(unaff_x29 + -0x78);
        pcVar8 = in_stack_00000110;
        if (0xfe < uVar33) {
          pcVar8 = in_stack_00000110 + 1;
          *in_stack_00000110 = -1;
          uVar33 = uVar33 - 0xff;
        }
        in_stack_00000110 = pcVar8 + 1;
        *pcVar8 = (char)uVar33;
      }
      in_x13 = (ulong *)((long)unaff_x24 + uVar59);
      puVar9 = in_x13;
LAB_000b1698:
      if (puVar62 < puVar9) goto LAB_000b087c;
      lVar43 = *(long *)(unaff_x29 + -0xb8);
      lVar51 = *(long *)(lVar43 + 8);
      uVar3 = *(uint *)(lVar43 + 0x18);
      uVar59 = (ulong)uVar3;
      uVar11 = *(uint *)(lVar43 + 0x1c);
      lVar60 = (long)puVar9 - lVar51;
      uVar30 = uVar3 + (int)lVar60;
      *(uint *)(unaff_x29 + -0xf0) = uVar11 + 0x10000;
      *(ulong *)(unaff_x29 + -0xa8) = (ulong)uVar11;
      if (uVar11 + 0x10000 <= uVar30) {
        uVar11 = uVar30 - 0xffff;
      }
      uVar31 = (uint)*puVar9;
      uVar55 = *(uint *)(lVar43 + 0x20);
      uVar33 = (ulong)uVar55;
      *(long *)(unaff_x29 + -0x90) = lVar51;
      uVar17 = uVar31;
      if (uVar55 < uVar30) {
        do {
          lVar43 = (ulong)((uint)(*(int *)((lVar51 - uVar59) + uVar33) * param_6) >> 0x11) * 4;
          uVar55 = (int)uVar33 - *(int *)(param_7 + lVar43);
          if (param_4 <= uVar55) {
            uVar55 = param_4;
          }
          *(short *)(unaff_x26 + (uVar33 & 0xffff) * 2) = (short)uVar55;
          *(int *)(param_7 + lVar43) = (int)uVar33;
          uVar33 = uVar33 + 1;
        } while (uVar30 != uVar33);
        uVar17 = (uint)*puVar9;
        lVar51 = *(long *)(unaff_x29 + -0x90);
      }
      lVar43 = *(long *)(unaff_x29 + -0xb8);
      *(undefined8 *)(unaff_x29 + -0xb0) = *(undefined8 *)(lVar43 + 0x28);
      puVar44 = *(uint **)(lVar43 + 0x10);
      lVar48 = uVar59 - *(long *)(unaff_x29 + -0xa8);
      puVar2 = (ulong *)((long)puVar44 + lVar48);
      *(uint *)(lVar43 + 0x20) = uVar30;
      uVar55 = *(uint *)(param_7 + (ulong)(uVar17 * param_6 >> 0x11) * 4);
      uVar33 = (ulong)uVar55;
      puVar25 = (ulong *)((long)puVar9 + 4);
      puVar47 = (ulong *)((long)puVar9 + 0xc);
      *(uint *)(unaff_x29 + -0xd0) = uVar3 - 4;
      puVar36 = (ulong *)(lVar51 + 8);
      *(ulong **)(unaff_x29 + -0xd8) = puVar9;
      iVar63 = (int)puVar25;
      iVar54 = (int)puVar2;
      unaff_x24 = puVar9;
      if (uVar55 < uVar11 || in_stack_00000118 < 1) {
        unaff_w25 = 0;
        uVar52 = 3;
        iVar23 = in_stack_00000118;
      }
      else {
        iVar58 = 0;
        iVar37 = 0;
        uVar40 = 0;
        unaff_w25 = 0;
        *(ulong *)(unaff_x29 + -0xe0) = lVar60 + uVar59;
        *(int *)(unaff_x29 + -0xc0) = -4 - (int)puVar9;
        uVar42 = 3;
        uVar38 = CONCAT44(uVar31,uVar31);
        iVar6 = in_stack_00000118;
        do {
          uVar17 = (uint)uVar33;
          uVar55 = uVar30 - uVar17;
          if ((*(int *)(unaff_x29 + -0x88) == 0) || (7 < uVar55)) {
            uVar18 = uVar3 - uVar17;
            uVar71 = (uint)uVar42;
            if (uVar3 < uVar17 || uVar18 == 0) {
              puVar13 = (uint *)(*(long *)(unaff_x29 + -0x90) + (ulong)(uVar17 - uVar3));
              if (*(short *)((long)puVar9 + (long)(int)uVar71 + -1) !=
                  *(short *)((long)puVar13 + (long)(int)uVar71 + -1)) goto code_r0x000b1b0c;
              unaff_w30 = 0x10;
              if (*puVar13 != uVar31) goto code_r0x000b1a3c;
              puVar16 = (ulong *)(puVar13 + 1);
              puVar32 = puVar25;
              if (puVar25 < puVar62) {
                uVar33 = *puVar25 ^ *puVar16;
                if (uVar33 == 0) {
                  puVar16 = (ulong *)(puVar13 + 3);
                  puVar32 = puVar47;
                  goto joined_r0x000b22e8;
                }
                uVar33 = (uVar33 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar33 & 0x5555555555555555) << 1;
                uVar33 = (uVar33 & 0xcccccccccccccccc) >> 2 | (uVar33 & 0x3333333333333333) << 2;
                uVar33 = (uVar33 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar33 & 0xf0f0f0f0f0f0f0f) << 4;
                uVar33 = (uVar33 & 0xff00ff00ff00ff00) >> 8 | (uVar33 & 0xff00ff00ff00ff) << 8;
                uVar33 = (uVar33 & 0xffff0000ffff0000) >> 0x10 | (uVar33 & 0xffff0000ffff) << 0x10;
                iVar23 = (int)((ulong)LZCOUNT(uVar33 >> 0x20 | uVar33 << 0x20) >> 3);
              }
              else {
joined_r0x000b22e8:
                if (puVar32 < puVar62) {
                  iVar23 = *(int *)(unaff_x29 + -0xc0) + (int)puVar32;
                  do {
                    uVar33 = *puVar32 ^ *puVar16;
                    if (uVar33 != 0) {
                      uVar33 = (uVar33 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                               (uVar33 & 0x5555555555555555) << 1;
                      uVar33 = (uVar33 & 0xcccccccccccccccc) >> 2 |
                               (uVar33 & 0x3333333333333333) << 2;
                      uVar33 = (uVar33 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                               (uVar33 & 0xf0f0f0f0f0f0f0f) << 4;
                      uVar33 = (uVar33 & 0xff00ff00ff00ff00) >> 8 | (uVar33 & 0xff00ff00ff00ff) << 8
                      ;
                      uVar33 = (uVar33 & 0xffff0000ffff0000) >> 0x10 |
                               (uVar33 & 0xffff0000ffff) << 0x10;
                      iVar23 = (int)((ulong)LZCOUNT(uVar33 >> 0x20 | uVar33 << 0x20) >> 3) + iVar23;
                      goto code_r0x000b1d64;
                    }
                    puVar32 = puVar32 + 1;
                    puVar16 = puVar16 + 1;
                    iVar23 = iVar23 + 8;
                  } while (puVar32 < puVar62);
                }
                if (puVar32 < param_10) {
                  if ((uint)*puVar16 == (uint)*puVar32) {
                    puVar32 = (ulong *)((long)puVar32 + 4);
                    puVar16 = (ulong *)((long)puVar16 + 4);
                  }
                }
                if (puVar32 < param_9) {
                  if ((short)*puVar16 == (short)*puVar32) {
                    puVar32 = (ulong *)((long)puVar32 + 2);
                    puVar16 = (ulong *)((long)puVar16 + 2);
                  }
                }
                if (puVar32 < unaff_x22) {
                  if ((char)*puVar16 == (char)*puVar32) {
                    puVar32 = (ulong *)((long)puVar32 + 1);
                  }
                }
                iVar23 = (int)puVar32 - iVar63;
              }
code_r0x000b1d64:
              uVar18 = iVar23 + 4;
              uVar52 = (ulong)uVar18;
              if ((int)uVar18 <= (int)uVar71) {
                uVar18 = uVar71;
                uVar55 = unaff_w25;
              }
              unaff_w25 = uVar55;
              uVar42 = (ulong)uVar18;
            }
            else {
              if ((*(uint *)(unaff_x29 + -0xd0) < uVar17) ||
                 (puVar13 = (uint *)((long)puVar44 +
                                    (ulong)(uVar17 - (int)*(undefined8 *)(unaff_x29 + -0xa8))),
                 *puVar13 != uVar31)) {
code_r0x000b1b0c:
                uVar52 = 0;
              }
              else {
                puVar62 = (ulong *)((long)unaff_x24 + (ulong)uVar18);
                puVar32 = unaff_x22;
                if (puVar62 <= unaff_x22) {
                  puVar32 = puVar62;
                }
                puVar29 = (ulong *)(puVar13 + 1);
                puVar15 = (ulong *)((long)puVar32 - 7);
                puVar16 = puVar25;
                if (puVar25 < puVar15) {
                  uVar33 = *puVar25 ^ *puVar29;
                  if (uVar33 == 0) {
                    puVar29 = (ulong *)(puVar13 + 3);
                    puVar16 = puVar47;
                    goto joined_r0x000b22d8;
                  }
                  uVar33 = (uVar33 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar33 & 0x5555555555555555) << 1;
                  uVar33 = (uVar33 & 0xcccccccccccccccc) >> 2 | (uVar33 & 0x3333333333333333) << 2;
                  uVar33 = (uVar33 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar33 & 0xf0f0f0f0f0f0f0f) << 4;
                  uVar33 = (uVar33 & 0xff00ff00ff00ff00) >> 8 | (uVar33 & 0xff00ff00ff00ff) << 8;
                  uVar33 = (uVar33 & 0xffff0000ffff0000) >> 0x10 | (uVar33 & 0xffff0000ffff) << 0x10
                  ;
                  iVar23 = (int)((ulong)LZCOUNT(uVar33 >> 0x20 | uVar33 << 0x20) >> 3);
code_r0x000b1bbc:
                  unaff_x24 = *(ulong **)(unaff_x29 + -0xd8);
                }
                else {
joined_r0x000b22d8:
                  if (puVar16 < puVar15) {
                    iVar23 = *(int *)(unaff_x29 + -0xc0) + (int)puVar16;
                    do {
                      uVar33 = *puVar16 ^ *puVar29;
                      if (uVar33 != 0) {
                        uVar33 = (uVar33 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                                 (uVar33 & 0x5555555555555555) << 1;
                        uVar33 = (uVar33 & 0xcccccccccccccccc) >> 2 |
                                 (uVar33 & 0x3333333333333333) << 2;
                        uVar33 = (uVar33 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                                 (uVar33 & 0xf0f0f0f0f0f0f0f) << 4;
                        uVar33 = (uVar33 & 0xff00ff00ff00ff00) >> 8 |
                                 (uVar33 & 0xff00ff00ff00ff) << 8;
                        uVar33 = (uVar33 & 0xffff0000ffff0000) >> 0x10 |
                                 (uVar33 & 0xffff0000ffff) << 0x10;
                        iVar23 = (int)((ulong)LZCOUNT(uVar33 >> 0x20 | uVar33 << 0x20) >> 3) +
                                 iVar23;
                        goto code_r0x000b1bbc;
                      }
                      puVar16 = puVar16 + 1;
                      puVar29 = puVar29 + 1;
                      iVar23 = iVar23 + 8;
                    } while (puVar16 < puVar15);
                  }
                  if (puVar16 < (ulong *)((long)puVar32 - 3U)) {
                    if ((uint)*puVar29 == (uint)*puVar16) {
                      puVar16 = (ulong *)((long)puVar16 + 4);
                      puVar29 = (ulong *)((long)puVar29 + 4);
                    }
                    if (puVar16 < (ulong *)((long)puVar32 - 1U)) goto code_r0x000b2230;
                  }
                  else if (puVar16 < (ulong *)((long)puVar32 - 1U)) {
code_r0x000b2230:
                    if ((short)*puVar29 == (short)*puVar16) {
                      puVar16 = (ulong *)((long)puVar16 + 2);
                      puVar29 = (ulong *)((long)puVar29 + 2);
                    }
                  }
                  if (puVar16 < puVar32) {
                    if ((char)*puVar29 == (char)*puVar16) {
                      puVar16 = (ulong *)((long)puVar16 + 1);
                    }
                  }
                  unaff_x24 = *(ulong **)(unaff_x29 + -0xd8);
                  iVar23 = (int)puVar16 - iVar63;
                }
                uVar72 = iVar23 + 4;
                uVar52 = (ulong)uVar72;
                if ((puVar62 < unaff_x22) &&
                   ((ulong *)((long)unaff_x24 + (long)(int)uVar72) == puVar32)) {
                  puVar62 = puVar32;
                  puVar16 = *(ulong **)(unaff_x29 + -0x90);
                  if (puVar32 < *(ulong **)(unaff_x29 + -0x78)) {
                    uVar33 = *puVar32 ^ **(ulong **)(unaff_x29 + -0x90);
                    if (uVar33 == 0) {
                      puVar62 = puVar32 + 1;
                      puVar16 = puVar36;
                      goto code_r0x000b1cac;
                    }
                    uVar33 = (uVar33 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar33 & 0x5555555555555555) << 1
                    ;
                    uVar33 = (uVar33 & 0xcccccccccccccccc) >> 2 | (uVar33 & 0x3333333333333333) << 2
                    ;
                    uVar33 = (uVar33 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar33 & 0xf0f0f0f0f0f0f0f) << 4;
                    uVar33 = (uVar33 & 0xff00ff00ff00ff00) >> 8 | (uVar33 & 0xff00ff00ff00ff) << 8;
                    uVar33 = (uVar33 & 0xffff0000ffff0000) >> 0x10 |
                             (uVar33 & 0xffff0000ffff) << 0x10;
                    iVar23 = (int)((ulong)LZCOUNT(uVar33 >> 0x20 | uVar33 << 0x20) >> 3);
code_r0x000b1d88:
                    unaff_x24 = *(ulong **)(unaff_x29 + -0xd8);
                  }
                  else {
code_r0x000b1cac:
                    if (puVar62 < *(ulong **)(unaff_x29 + -0x78)) {
                      uVar33 = *(long *)(unaff_x29 + -0xd8) + (ulong)uVar18;
                      uVar42 = param_24;
                      if (uVar33 <= param_24) {
                        uVar42 = uVar33;
                      }
                      iVar23 = (int)puVar62 - (int)uVar42;
                      do {
                        uVar33 = *puVar62 ^ *puVar16;
                        if (uVar33 != 0) {
                          uVar33 = (uVar33 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                                   (uVar33 & 0x5555555555555555) << 1;
                          uVar33 = (uVar33 & 0xcccccccccccccccc) >> 2 |
                                   (uVar33 & 0x3333333333333333) << 2;
                          uVar33 = (uVar33 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                                   (uVar33 & 0xf0f0f0f0f0f0f0f) << 4;
                          uVar33 = (uVar33 & 0xff00ff00ff00ff00) >> 8 |
                                   (uVar33 & 0xff00ff00ff00ff) << 8;
                          uVar33 = (uVar33 & 0xffff0000ffff0000) >> 0x10 |
                                   (uVar33 & 0xffff0000ffff) << 0x10;
                          iVar23 = (int)((ulong)LZCOUNT(uVar33 >> 0x20 | uVar33 << 0x20) >> 3) +
                                   iVar23;
                          goto code_r0x000b1d88;
                        }
                        puVar62 = puVar62 + 1;
                        puVar16 = puVar16 + 1;
                        iVar23 = iVar23 + 8;
                      } while (puVar62 < *(ulong **)(unaff_x29 + -0x78));
                    }
                    if (puVar62 < param_10) {
                      if ((uint)*puVar16 == (uint)*puVar62) {
                        puVar62 = (ulong *)((long)puVar62 + 4);
                        puVar16 = (ulong *)((long)puVar16 + 4);
                      }
                    }
                    if (puVar62 < param_9) {
                      if ((short)*puVar16 == (short)*puVar62) {
                        puVar62 = (ulong *)((long)puVar62 + 2);
                        puVar16 = (ulong *)((long)puVar16 + 2);
                      }
                    }
                    if (puVar62 < unaff_x22) {
                      if ((char)*puVar16 == (char)*puVar62) {
                        puVar62 = (ulong *)((long)puVar62 + 1);
                      }
                    }
                    unaff_x24 = *(ulong **)(unaff_x29 + -0xd8);
                    iVar23 = (int)puVar62 - (int)puVar32;
                  }
                  uVar52 = (ulong)(iVar23 + uVar72);
                }
                uVar18 = (uint)uVar52;
                if ((int)(uint)uVar52 <= (int)uVar71) {
                  uVar18 = uVar71;
                  uVar55 = unaff_w25;
                }
                unaff_w25 = uVar55;
                uVar42 = (ulong)uVar18;
              }
              unaff_w30 = 0x10;
            }
          }
          else {
code_r0x000b1a3c:
            uVar52 = 0;
          }
          iVar23 = iVar6 + -1;
          iVar49 = (int)uVar42;
          iVar61 = (int)uVar52;
          if (((iVar61 == iVar49) && (iVar49 + uVar17 <= uVar30)) && (3 < iVar61)) {
            iVar14 = 0;
            uVar55 = 1;
            iVar56 = iVar58;
            iVar24 = 0x10;
            do {
              uVar4 = *(ushort *)(unaff_x26 + (ulong)(iVar14 + uVar17 & 0xffff) * 2);
              uVar18 = (uint)uVar4;
              bVar5 = uVar18 <= uVar55;
              if (uVar55 <= uVar18) {
                uVar55 = (uint)uVar4;
              }
              iVar58 = iVar14;
              if (bVar5) {
                iVar58 = iVar56;
              }
              iVar14 = iVar14 + (iVar24 >> 4);
              iVar10 = unaff_w30;
              if (bVar5) {
                iVar10 = iVar24 + 1;
              }
              iVar56 = iVar58;
              iVar24 = iVar10;
            } while (iVar14 < iVar61 + -3);
            if (uVar55 < 2) goto code_r0x000b1e00;
            if (uVar55 <= uVar17) {
              uVar33 = (ulong)(uVar17 - uVar55);
              goto code_r0x000b1f5c;
            }
            puVar62 = *(ulong **)(unaff_x29 + -0x78);
            break;
          }
code_r0x000b1e00:
          puVar62 = *(ulong **)(unaff_x29 + -0x78);
          if (*(short *)(unaff_x26 + (ulong)(uVar17 & 0xffff) * 2) == 1 && iVar58 == 0) {
            if (iVar37 == 0) {
              puVar32 = puVar25;
              puVar16 = puVar25;
              if ((uVar31 & 0xffff) == uVar31 >> 0x10 && (uVar31 & 0xff) == uVar31 >> 0x18) {
                for (; puVar32 < puVar62; puVar32 = puVar32 + 1) {
                  uVar33 = *puVar32 ^ uVar38;
                  if (uVar33 != 0) {
                    uVar33 = (uVar33 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar33 & 0x5555555555555555) << 1
                    ;
                    uVar33 = (uVar33 & 0xcccccccccccccccc) >> 2 | (uVar33 & 0x3333333333333333) << 2
                    ;
                    uVar33 = (uVar33 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar33 & 0xf0f0f0f0f0f0f0f) << 4;
                    uVar33 = (uVar33 & 0xff00ff00ff00ff00) >> 8 | (uVar33 & 0xff00ff00ff00ff) << 8;
                    uVar33 = (uVar33 & 0xffff0000ffff0000) >> 0x10 |
                             (uVar33 & 0xffff0000ffff) << 0x10;
                    puVar16 = (ulong *)((long)puVar16 +
                                       ((ulong)LZCOUNT(uVar33 >> 0x20 | uVar33 << 0x20) >> 3));
                    goto code_r0x000b1f78;
                  }
                  puVar16 = puVar16 + 1;
                }
                if (puVar32 < unaff_x22) {
                  lVar60 = (long)unaff_x22 - (long)puVar16;
                  puVar62 = (ulong *)((long)puVar32 + lVar60);
                  uVar33 = uVar38;
                  do {
                    puVar16 = puVar32;
                    if ((uint)(byte)*puVar32 != ((uint)uVar33 & 0xff)) goto code_r0x000b1f78;
                    puVar32 = (ulong *)((long)puVar32 + 1);
                    uVar33 = uVar33 >> 8;
                    lVar60 = lVar60 + -1;
                  } while (lVar60 != 0);
                  puVar16 = puVar62;
                }
code_r0x000b1f78:
                uVar40 = (ulong)(uint)((int)puVar16 - iVar63) + 4;
                iVar37 = 2;
                goto code_r0x000b1e24;
              }
              iVar37 = 1;
              goto code_r0x000b1a08;
            }
            if (iVar37 != 2) goto code_r0x000b1a08;
code_r0x000b1e24:
            uVar55 = uVar17 - 1;
            if (uVar55 < uVar11) {
code_r0x000b1a04:
              puVar62 = *(ulong **)(unaff_x29 + -0x78);
              goto code_r0x000b1a08;
            }
            if (uVar3 - uVar17 < 3) {
code_r0x000b1a00:
              iVar37 = 2;
              goto code_r0x000b1a04;
            }
            puVar13 = (uint *)((long)puVar44 +
                              (ulong)(uVar55 - (int)*(undefined8 *)(unaff_x29 + -0xa8)));
            puVar28 = (uint *)(*(long *)(unaff_x29 + -0x90) + (ulong)(uVar55 - uVar3));
            if (uVar55 < uVar3) {
              puVar28 = puVar13;
            }
            if (*puVar28 != uVar31) goto code_r0x000b1a00;
            puVar62 = unaff_x22;
            if (uVar55 < uVar3) {
              puVar62 = puVar2;
            }
            puVar32 = (ulong *)(puVar28 + 1);
            puVar16 = puVar32;
            if (puVar32 < (ulong *)((long)puVar62 - 7U)) {
              puVar29 = puVar32;
              do {
                uVar33 = *puVar16 ^ uVar38;
                if (uVar33 != 0) {
                  uVar33 = (uVar33 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar33 & 0x5555555555555555) << 1;
                  uVar33 = (uVar33 & 0xcccccccccccccccc) >> 2 | (uVar33 & 0x3333333333333333) << 2;
                  uVar33 = (uVar33 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar33 & 0xf0f0f0f0f0f0f0f) << 4;
                  uVar33 = (uVar33 & 0xff00ff00ff00ff00) >> 8 | (uVar33 & 0xff00ff00ff00ff) << 8;
                  uVar33 = (uVar33 & 0xffff0000ffff0000) >> 0x10 | (uVar33 & 0xffff0000ffff) << 0x10
                  ;
                  puVar16 = (ulong *)((long)puVar29 +
                                     ((ulong)LZCOUNT(uVar33 >> 0x20 | uVar33 << 0x20) >> 3));
                  goto code_r0x000b1f9c;
                }
                puVar16 = puVar16 + 1;
                puVar29 = puVar29 + 1;
              } while (puVar16 < (ulong *)((long)puVar62 - 7U));
            }
            if (puVar16 < puVar62) {
              lVar60 = (long)puVar62 - (long)puVar16;
              uVar33 = uVar38;
              do {
                if ((uint)(byte)*puVar16 != ((uint)uVar33 & 0xff)) goto code_r0x000b1f9c;
                puVar16 = (ulong *)((long)puVar16 + 1);
                uVar33 = uVar33 >> 8;
                lVar60 = lVar60 + -1;
              } while (lVar60 != 0);
              puVar16 = puVar62;
            }
code_r0x000b1f9c:
            uVar52 = (long)puVar16 - (long)puVar32;
            uVar33 = (uVar52 & 0xffffffff) + 4;
            if (uVar55 < uVar3) {
              puVar35 = puVar44;
              if ((ulong *)((long)puVar13 + uVar33) == puVar2) {
                uVar53 = uVar38;
                if ((uVar52 & 3) != 0) {
                  uVar17 = (int)uVar52 * -8 & 0x1f;
                  uVar17 = uVar31 >> uVar17 | uVar31 << 0x20 - uVar17;
                  uVar53 = CONCAT44(uVar17,uVar17);
                }
                puVar62 = *(ulong **)(unaff_x29 + -0x90);
                puVar32 = puVar62;
                if (puVar62 < *(ulong **)(unaff_x29 + -0x78)) {
                  do {
                    uVar52 = *puVar32 ^ uVar53;
                    if (uVar52 != 0) {
                      uVar52 = (uVar52 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                               (uVar52 & 0x5555555555555555) << 1;
                      uVar52 = (uVar52 & 0xcccccccccccccccc) >> 2 |
                               (uVar52 & 0x3333333333333333) << 2;
                      uVar52 = (uVar52 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                               (uVar52 & 0xf0f0f0f0f0f0f0f) << 4;
                      uVar52 = (uVar52 & 0xff00ff00ff00ff00) >> 8 | (uVar52 & 0xff00ff00ff00ff) << 8
                      ;
                      uVar52 = (uVar52 & 0xffff0000ffff0000) >> 0x10 |
                               (uVar52 & 0xffff0000ffff) << 0x10;
                      puVar62 = (ulong *)((long)puVar62 +
                                         ((ulong)LZCOUNT(uVar52 >> 0x20 | uVar52 << 0x20) >> 3));
                      goto code_r0x000b205c;
                    }
                    puVar32 = puVar32 + 1;
                    puVar62 = puVar62 + 1;
                  } while (puVar32 < *(ulong **)(unaff_x29 + -0x78));
                }
                if (puVar32 < unaff_x22) {
                  lVar60 = (long)unaff_x22 - (long)puVar62;
                  puVar16 = (ulong *)((long)puVar32 + lVar60);
                  do {
                    puVar62 = puVar32;
                    if ((uint)(byte)*puVar32 != ((uint)uVar53 & 0xff)) goto code_r0x000b205c;
                    puVar32 = (ulong *)((long)puVar32 + 1);
                    uVar53 = uVar53 >> 8;
                    lVar60 = lVar60 + -1;
                  } while (lVar60 != 0);
                  puVar62 = puVar16;
                }
code_r0x000b205c:
                uVar33 = (uint)((int)puVar62 - (int)*(undefined8 *)(unaff_x29 + -0x90)) + uVar33;
              }
            }
            else {
              puVar35 = *(uint **)(unaff_x29 + -0x90);
            }
            *(uint *)(unaff_x29 + -0x6c) = uVar31;
            puVar13 = puVar28;
            do {
              puVar27 = puVar13;
              if (puVar27 < puVar35 + 1) break;
              puVar13 = puVar27 + -1;
            } while (puVar27[-1] == uVar31);
            puVar13 = puVar27;
            if (puVar35 < puVar27) {
              lVar60 = 0;
              do {
                puVar13 = (uint *)((long)puVar27 + lVar60);
                if (*(char *)((long)puVar13 + -1) !=
                    *(char *)(*(long *)(unaff_x29 + -0x80) + lVar60)) goto code_r0x000b20d4;
                lVar60 = lVar60 + -1;
              } while (puVar35 < (uint *)((long)puVar27 + lVar60));
              puVar13 = puVar35;
            }
code_r0x000b20d4:
            iVar58 = (int)((long)puVar28 - (long)puVar13);
            if (((uVar3 <= uVar55) &&
                ((long)puVar28 - ((long)puVar28 - (long)puVar13 & 0xffffffffU) ==
                 *(long *)(unaff_x29 + -0x90))) &&
               ((uint)*(undefined8 *)(unaff_x29 + -0xa8) < uVar3)) {
              uVar18 = iVar58 * 8 & 0x1f;
              uVar17 = uVar31;
              if ((-iVar58 & 3U) != 0) {
                uVar17 = uVar31 >> uVar18 | uVar31 << 0x20 - uVar18;
              }
              *(uint *)(unaff_x29 + -0x6c) = uVar17;
              lVar60 = lVar48;
              do {
                lVar43 = lVar60;
                if (lVar43 < 4) {
                  puVar13 = (uint *)((long)puVar44 + lVar43);
                  if (lVar43 < 1) goto code_r0x000b2168;
                  break;
                }
                lVar60 = lVar43 + -4;
              } while (*(uint *)((long)puVar44 + lVar43 + -4) == uVar17);
              pcVar8 = *(char **)(unaff_x29 + -0x80);
              puVar13 = (uint *)((long)puVar44 + lVar43);
              do {
                puVar28 = (uint *)((long)puVar13 + -1);
                if (*(char *)puVar28 != *pcVar8) goto code_r0x000b2168;
                pcVar8 = pcVar8 + -1;
                puVar13 = puVar28;
              } while (puVar44 < puVar28);
              puVar13 = puVar44;
code_r0x000b2168:
              iVar58 = (iVar54 - (int)puVar13) + iVar58;
            }
            uVar17 = uVar55 - iVar58;
            if (uVar55 - iVar58 <= uVar11) {
              uVar17 = uVar11;
            }
            uVar53 = uVar33 + (uVar55 - uVar17);
            uVar52 = uVar42;
            if ((uVar40 < uVar33) || (uVar53 < uVar40)) {
              if (uVar3 + ~uVar17 < 3) {
                iVar58 = 0;
                iVar37 = 2;
                uVar33 = uVar59;
                goto code_r0x000b1f5c;
              }
              if (uVar40 <= uVar53) {
                uVar53 = uVar40;
              }
              puVar62 = *(ulong **)(unaff_x29 + -0x78);
              if ((ulong)(long)iVar49 < uVar53) {
                if (*(long *)(unaff_x29 + -0xe0) - (ulong)uVar17 >> 0x10 != 0) break;
                unaff_w25 = uVar30 - uVar17;
                uVar52 = uVar53;
              }
              uVar55 = (uint)*(ushort *)(unaff_x26 + (ulong)(uVar17 & 0xffff) * 2);
              uVar33 = (ulong)(uVar17 - uVar55);
              if (uVar17 < uVar55) break;
              iVar58 = 0;
              iVar37 = 2;
              uVar42 = uVar52;
            }
            else {
              iVar58 = 0;
              uVar55 = (uVar55 - (int)uVar40) + (int)uVar33;
              uVar17 = uVar3;
              if (2 < uVar3 + ~uVar55) {
                uVar17 = uVar55;
              }
              iVar37 = 2;
              uVar33 = (ulong)uVar17;
code_r0x000b1f5c:
              puVar62 = *(ulong **)(unaff_x29 + -0x78);
              uVar42 = uVar52;
            }
          }
          else {
code_r0x000b1a08:
            uVar33 = (ulong)(uVar17 - *(ushort *)(unaff_x26 + (ulong)(iVar58 + uVar17 & 0xffff) * 2)
                            );
          }
          bVar5 = 1 < iVar6;
          uVar52 = uVar42;
          iVar6 = iVar23;
        } while (uVar11 <= (uint)uVar33 && bVar5);
      }
      uVar55 = (uint)uVar52;
      lVar60 = *(long *)(unaff_x29 + -0xb0);
      plVar1 = (long *)(lVar60 + 0x40000);
      iVar58 = (int)unaff_x24;
      if (((uVar30 < *(uint *)(unaff_x29 + -0xf0)) && (*(int *)(unaff_x29 + -0xe4) == 1)) &&
         (0 < iVar23)) {
        lVar43 = (*plVar1 - *(long *)(&UNK_00040008 + lVar60)) +
                 (ulong)*(uint *)(&UNK_00040018 + lVar60);
        uVar17 = *(uint *)(*(long *)(unaff_x29 + -0xb0) +
                          (ulong)((uint)*unaff_x24 * -0x61c8864f >> 0x11) * 4);
        iVar6 = (uVar17 + uVar11) - (int)lVar43;
        uVar11 = uVar30 - iVar6;
        if (uVar11 >> 0x10 == 0) {
          do {
            uVar55 = (uint)uVar52;
            if (iVar23 == 0) break;
            puVar13 = (uint *)((*(long *)(&UNK_00040008 + lVar60) -
                               (ulong)*(uint *)(&UNK_00040018 + lVar60)) + (ulong)uVar17);
            if (*puVar13 == uVar31) {
              puVar9 = (ulong *)((long)unaff_x24 + (lVar43 - (ulong)uVar17));
              puVar32 = unaff_x22;
              if (puVar9 <= unaff_x22) {
                puVar32 = puVar9;
              }
              puVar16 = (ulong *)(puVar13 + 1);
              puVar29 = (ulong *)((long)puVar32 - 7);
              puVar9 = puVar25;
              if (puVar25 < puVar29) {
                uVar33 = *puVar25 ^ *puVar16;
                if (uVar33 == 0) {
                  puVar16 = (ulong *)(puVar13 + 3);
                  puVar9 = puVar47;
                  goto joined_r0x000b19c0;
                }
                uVar33 = (uVar33 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar33 & 0x5555555555555555) << 1;
                uVar33 = (uVar33 & 0xcccccccccccccccc) >> 2 | (uVar33 & 0x3333333333333333) << 2;
                uVar33 = (uVar33 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar33 & 0xf0f0f0f0f0f0f0f) << 4;
                uVar33 = (uVar33 & 0xff00ff00ff00ff00) >> 8 | (uVar33 & 0xff00ff00ff00ff) << 8;
                uVar33 = (uVar33 & 0xffff0000ffff0000) >> 0x10 | (uVar33 & 0xffff0000ffff) << 0x10;
                iVar37 = (int)((ulong)LZCOUNT(uVar33 >> 0x20 | uVar33 << 0x20) >> 3);
              }
              else {
joined_r0x000b19c0:
                if (puVar9 < puVar29) {
                  iVar37 = (-4 - iVar58) + (int)puVar9;
                  do {
                    uVar33 = *puVar9 ^ *puVar16;
                    if (uVar33 != 0) {
                      uVar33 = (uVar33 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                               (uVar33 & 0x5555555555555555) << 1;
                      uVar33 = (uVar33 & 0xcccccccccccccccc) >> 2 |
                               (uVar33 & 0x3333333333333333) << 2;
                      uVar33 = (uVar33 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                               (uVar33 & 0xf0f0f0f0f0f0f0f) << 4;
                      uVar33 = (uVar33 & 0xff00ff00ff00ff00) >> 8 | (uVar33 & 0xff00ff00ff00ff) << 8
                      ;
                      uVar33 = (uVar33 & 0xffff0000ffff0000) >> 0x10 |
                               (uVar33 & 0xffff0000ffff) << 0x10;
                      iVar37 = (int)((ulong)LZCOUNT(uVar33 >> 0x20 | uVar33 << 0x20) >> 3) + iVar37;
                      goto code_r0x000b1850;
                    }
                    puVar9 = puVar9 + 1;
                    puVar16 = puVar16 + 1;
                    iVar37 = iVar37 + 8;
                  } while (puVar9 < puVar29);
                }
                if (puVar9 < (ulong *)((long)puVar32 - 3U)) {
                  if ((uint)*puVar16 == (uint)*puVar9) {
                    puVar9 = (ulong *)((long)puVar9 + 4);
                    puVar16 = (ulong *)((long)puVar16 + 4);
                  }
                  if (puVar9 < (ulong *)((long)puVar32 - 1U)) goto code_r0x000b1990;
                }
                else if (puVar9 < (ulong *)((long)puVar32 - 1U)) {
code_r0x000b1990:
                  if ((short)*puVar16 == (short)*puVar9) {
                    puVar9 = (ulong *)((long)puVar9 + 2);
                    puVar16 = (ulong *)((long)puVar16 + 2);
                  }
                }
                if (puVar9 < puVar32) {
                  if ((char)*puVar16 == (char)*puVar9) {
                    puVar9 = (ulong *)((long)puVar9 + 1);
                  }
                }
                iVar37 = (int)puVar9 - iVar63;
              }
code_r0x000b1850:
              uVar18 = iVar37 + 4U;
              if ((int)(iVar37 + 4U) <= (int)uVar55) {
                uVar18 = uVar55;
                uVar11 = unaff_w25;
              }
              unaff_w25 = uVar11;
              uVar52 = (ulong)uVar18;
            }
            uVar55 = (uint)uVar52;
            iVar23 = iVar23 + -1;
            uVar11 = (uint)*(ushort *)
                            (*(long *)(unaff_x29 + -0xb0) + (ulong)(uVar17 & 0xffff) * 2 + 0x20000);
            uVar17 = uVar17 - uVar11;
            iVar6 = iVar6 - uVar11;
            uVar11 = uVar30 - iVar6;
          } while (uVar11 < 0x10000);
        }
      }
      param_6 = -0x61c8864f;
      param_4 = 0xffff;
      if ((int)uVar55 < 4) {
        param_7 = *(long *)(unaff_x29 + -0x98);
        puVar9 = (ulong *)((long)unaff_x24 + 1);
        in_w15 = in_stack_00000168._4_4_;
        goto LAB_000b1698;
      }
      unaff_x28 = (long)unaff_x24 - (long)in_x13;
      unaff_x21 = 0x12;
      if (0x11 < uVar55 - 0x13 || *(int *)(unaff_x29 + -0x88) == 0) {
        unaff_x21 = (ulong)uVar55;
      }
      param_7 = *(long *)(unaff_x29 + -0x98);
      uVar30 = (uint)unaff_x28;
      pcVar8 = in_stack_00000110;
      if (unaff_x21 <= param_30) {
        if (0xe < (int)uVar30) {
          unaff_x28 = (ulong)((uVar30 - 0xf) / 0xff + uVar30 + 1);
        }
        iVar6 = uVar30 + 1;
        puVar39 = *(undefined4 **)(unaff_x29 + -0xa0);
        *(undefined8 *)(puVar39 + 1) = unaff_d8;
        puVar39[3] = uVar30;
        *puVar39 = (int)unaff_x28;
        iVar63 = iVar6;
        if (0xe < iVar6) {
          iVar63 = iVar6 + (uVar30 - 0xe) / 0xff + 1;
        }
        lVar43 = *(long *)(unaff_x29 + -0xa0);
        *(undefined8 *)(lVar43 + 0x14) = unaff_d8;
        *(int *)(lVar43 + 0x1c) = iVar6;
        iVar37 = uVar30 + 2;
        *(int *)(lVar43 + 0x10) = iVar63;
        if ((int)uVar30 < 0xd) {
          lVar43 = *(long *)(unaff_x29 + -0xa0);
          *(undefined8 *)(lVar43 + 0x24) = unaff_d8;
          *(int *)(lVar43 + 0x2c) = iVar37;
          *(int *)(lVar43 + 0x20) = iVar37;
          if (uVar30 == 0xc) {
            iVar63 = 0xf;
            goto code_r0x000b24c0;
          }
          iVar63 = uVar30 + 3;
          iVar37 = iVar63;
        }
        else {
          iVar63 = uVar30 + 3;
          lVar43 = *(long *)(unaff_x29 + -0xa0);
          *(undefined8 *)(lVar43 + 0x24) = unaff_d8;
          *(int *)(lVar43 + 0x2c) = iVar37;
          *(uint *)(lVar43 + 0x20) = (uVar30 - 0xd) / 0xff + iVar63;
code_r0x000b24c0:
          iVar37 = uVar30 + (uVar30 - 0xc) / 0xff + 4;
        }
        lVar43 = *(long *)(unaff_x29 + -0xa0);
        *(undefined8 *)(lVar43 + 0x34) = unaff_d8;
        *(int *)(lVar43 + 0x3c) = iVar63;
        *(int *)(lVar43 + 0x30) = iVar37;
        uVar11 = iVar6 + (uVar30 - 0xf) / 0xff;
        if ((int)uVar30 < 0xf) {
          uVar11 = uVar30;
        }
        uVar31 = uVar11 + 3;
        iVar63 = uVar11 + 4;
        uVar33 = unaff_x21 - 3;
        if (uVar33 < 4) {
          uVar40 = 4;
code_r0x000b2740:
          piVar46 = (int *)(param_21 + uVar40 * 0x10);
          do {
            uVar11 = uVar31;
            if (0x12 < uVar40) {
              uVar11 = iVar63 + ((int)uVar40 - 0x13U) / 0xff;
            }
            *piVar46 = (int)uVar40;
            piVar46[1] = uVar30;
            piVar46[-2] = uVar11;
            piVar46[-1] = unaff_w25;
            uVar40 = uVar40 + 1;
            piVar46 = piVar46 + 4;
          } while (unaff_x21 + 1 != uVar40);
        }
        else {
          uVar45 = uVar33 & 0xfffffffffffffffc;
          uVar40 = uVar45 + 4;
          puVar13 = param_19;
          uVar42 = uVar45;
          uVar38 = param_13;
          uVar52 = param_14;
          uVar53 = param_15;
          uVar34 = param_16;
          uVar67 = param_11;
          uVar68 = param_12;
          do {
            uVar11 = (uint)uVar67;
            uVar55 = (uint)((ulong)uVar67 >> 0x20);
            auVar69._0_8_ = CONCAT44(uVar55 + in_register_000052a4,uVar11 + in_s21);
            uVar17 = (uint)uVar68;
            auVar69._8_4_ = uVar17 + in_register_000052a8;
            uVar18 = (uint)((ulong)uVar68 >> 0x20);
            auVar69._12_4_ = uVar18 + in_register_000052ac;
            auVar70 = NEON_umull(auVar69._0_8_,in_d22,4);
            uVar71 = iVar63 + (auVar70._4_4_ >> 7);
            uVar72 = iVar63 + (auVar70._12_4_ >> 7);
            uVar73 = iVar63 + (uint)((auVar69._8_8_ & 0xffffffff) *
                                     (in_register_000052c8 & 0xffffffff) >> 0x27);
            uVar74 = iVar63 + (uint)((auVar69._8_8_ >> 0x20) * (in_register_000052c8 >> 0x20) >>
                                    0x27);
            *puVar13 = uVar71 ^ (uVar71 ^ uVar31) & -(uint)(uVar38 < in_d20);
            puVar13[1] = unaff_w25;
            puVar13[2] = uVar11;
            puVar13[3] = uVar30;
            puVar13[4] = uVar72 ^ (uVar72 ^ uVar31) & -(uint)(uVar52 < in_register_00005288);
            puVar13[5] = unaff_w25;
            puVar13[6] = uVar55;
            puVar13[7] = uVar30;
            puVar13[8] = uVar73 ^ (uVar73 ^ uVar31) & -(uint)(uVar53 < in_d20);
            puVar13[9] = unaff_w25;
            puVar13[10] = uVar17;
            puVar13[0xb] = uVar30;
            puVar13[0xc] = uVar74 ^ (uVar74 ^ uVar31) & -(uint)(uVar34 < in_register_00005288);
            puVar13[0xd] = unaff_w25;
            puVar13[0xe] = uVar18;
            puVar13[0xf] = uVar30;
            puVar13 = puVar13 + 0x10;
            uVar53 = uVar53 + 4;
            uVar34 = uVar34 + 4;
            uVar38 = uVar38 + 4;
            uVar52 = uVar52 + 4;
            uVar67 = CONCAT44(uVar55 + in_register_000052e4,uVar11 + in_s23);
            uVar68 = CONCAT44(uVar18 + in_register_000052ec,uVar17 + in_register_000052e8);
            uVar42 = uVar42 - 4;
          } while (uVar42 != 0);
          if (uVar33 != uVar45) goto code_r0x000b2740;
        }
        piVar46 = (int *)(*(long *)(unaff_x29 + -0xa0) + unaff_x21 * 0x10);
        *(undefined8 *)(piVar46 + 5) = unaff_d8;
        iVar63 = *piVar46;
        piVar46[4] = iVar63 + 1;
        *(undefined8 *)(piVar46 + 9) = unaff_d8;
        piVar46[7] = 1;
        piVar46[8] = iVar63 + 2;
        *(undefined8 *)(piVar46 + 0xd) = unaff_d8;
        piVar46[0xf] = 3;
        piVar46[0xb] = 2;
        piVar46[0xc] = iVar63 + 3;
        if ((uint)unaff_x21 < 2) {
          puVar62 = *(ulong **)(unaff_x29 + -0x78);
          uVar33 = unaff_x21;
        }
        else {
          lVar43 = *(long *)(unaff_x29 + -0x90);
          lVar51 = lVar43 - uVar59;
          uVar30 = (uVar3 + iVar58) - (int)lVar43;
          *(int *)(unaff_x29 + -0xe0) = -5 - iVar58;
          puVar9 = (ulong *)((long)unaff_x24 + 5);
          *(undefined8 *)(unaff_x29 + -0xc0) = 5;
          puVar62 = *(ulong **)(unaff_x29 + -0x78);
          puVar25 = puVar9;
          piVar46 = param_18;
          uVar40 = 1;
          puVar47 = unaff_x24;
          do {
            uVar30 = uVar30 + 1;
            puVar47 = (ulong *)((long)puVar47 + 1);
            puVar32 = (ulong *)((long)unaff_x24 + uVar40);
            if (puVar62 < puVar32) {
              uVar33 = (long)(int)unaff_x21;
              break;
            }
            uVar42 = uVar40 + 1;
            piVar22 = (int *)(*(long *)(unaff_x29 + -0xa0) + uVar42 * 0x10);
            iVar63 = *piVar22;
            iVar58 = *(int *)(*(long *)(unaff_x29 + -0xa0) + uVar40 * 0x10);
            iVar6 = (int)uVar40;
            if (in_stack_000000c8 < 0xc) {
              if (iVar63 <= iVar58) goto code_r0x000b2834;
              uVar11 = uVar3 + (int)((long)puVar32 - lVar43);
              uVar31 = (uint)*(undefined8 *)(unaff_x29 + -0xa8);
              if (*(uint *)(unaff_x29 + -0xf0) <= uVar11) {
                uVar31 = uVar11 - 0xffff;
              }
              uVar55 = (uint)*puVar32;
              uVar17 = *(uint *)(*(long *)(unaff_x29 + -0xb8) + 0x20);
              uVar33 = (ulong)uVar17;
              uVar18 = uVar55;
              if (uVar17 < uVar11) {
                do {
                  lVar12 = (ulong)((uint)(*(int *)(lVar51 + uVar33) * -0x61c8864f) >> 0x11) * 4;
                  uVar17 = (int)uVar33 - *(int *)(param_7 + lVar12);
                  if (0xfffe < uVar17) {
                    uVar17 = 0xffff;
                  }
                  *(short *)(unaff_x26 + (uVar33 & 0xffff) * 2) = (short)uVar17;
                  *(int *)(param_7 + lVar12) = (int)uVar33;
                  uVar33 = uVar33 + 1;
                } while (uVar30 != uVar33);
                uVar18 = (uint)*puVar32;
              }
              *(ulong *)(unaff_x29 + -0xf8) = unaff_x21;
              uVar71 = (int)unaff_x21 - iVar6;
              uVar53 = (ulong)uVar71;
              *(uint *)(*(long *)(unaff_x29 + -0xb8) + 0x20) = uVar11;
              uVar17 = *(uint *)(param_7 + (ulong)(uVar18 * -0x61c8864f >> 0x11) * 4);
              uVar33 = (ulong)uVar17;
              puVar16 = (ulong *)((long)puVar32 + 4);
              puVar29 = (ulong *)((long)puVar32 + 0xc);
              iVar37 = (int)puVar16;
              if (uVar31 <= uVar17 && 0 < in_stack_00000118) {
                iVar23 = 0;
                iVar61 = 0;
                uStack00000000000000b0 = 0;
                uVar17 = 0;
                uVar52 = CONCAT44(uVar55,uVar55);
                uVar38 = uVar53;
                iVar49 = in_stack_00000118;
code_r0x000b38e0:
                uVar18 = (uint)uVar33;
                uVar72 = (uint)uVar38;
                if ((*(int *)(unaff_x29 + -0x88) == 0) || (7 < uVar11 - uVar18)) {
                  uVar73 = uVar3 - uVar18;
                  if (uVar3 < uVar18 || uVar73 == 0) {
                    puVar13 = (uint *)(*(long *)(unaff_x29 + -0x90) + (ulong)(uVar18 - uVar3));
                    if ((*(short *)((long)puVar32 + (long)(int)uVar72 + -1) !=
                         *(short *)((long)puVar13 + (long)(int)uVar72 + -1)) || (*puVar13 != uVar55)
                       ) goto code_r0x000b39d0;
                    puVar19 = (ulong *)(puVar13 + 1);
                    puVar15 = puVar16;
                    if (puVar16 < puVar62) {
                      uVar33 = *puVar16 ^ *puVar19;
                      if (uVar33 == 0) {
                        puVar19 = (ulong *)(puVar13 + 3);
                        puVar15 = puVar29;
                        goto joined_r0x000b423c;
                      }
                      uVar33 = (uVar33 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                               (uVar33 & 0x5555555555555555) << 1;
                      uVar33 = (uVar33 & 0xcccccccccccccccc) >> 2 |
                               (uVar33 & 0x3333333333333333) << 2;
                      uVar33 = (uVar33 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                               (uVar33 & 0xf0f0f0f0f0f0f0f) << 4;
                      uVar33 = (uVar33 & 0xff00ff00ff00ff00) >> 8 | (uVar33 & 0xff00ff00ff00ff) << 8
                      ;
                      uVar33 = (uVar33 & 0xffff0000ffff0000) >> 0x10 |
                               (uVar33 & 0xffff0000ffff) << 0x10;
                      uVar53 = (ulong)((int)((ulong)LZCOUNT(uVar33 >> 0x20 | uVar33 << 0x20) >> 3) +
                                      4);
                    }
                    else {
joined_r0x000b423c:
                      if (puVar15 < puVar62) {
                        iVar14 = *(int *)(unaff_x29 + -0xe0) + (int)puVar15;
                        do {
                          uVar33 = *puVar15 ^ *puVar19;
                          if (uVar33 != 0) {
                            uVar33 = (uVar33 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                                     (uVar33 & 0x5555555555555555) << 1;
                            uVar33 = (uVar33 & 0xcccccccccccccccc) >> 2 |
                                     (uVar33 & 0x3333333333333333) << 2;
                            uVar33 = (uVar33 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                                     (uVar33 & 0xf0f0f0f0f0f0f0f) << 4;
                            uVar33 = (uVar33 & 0xff00ff00ff00ff00) >> 8 |
                                     (uVar33 & 0xff00ff00ff00ff) << 8;
                            uVar33 = (uVar33 & 0xffff0000ffff0000) >> 0x10 |
                                     (uVar33 & 0xffff0000ffff) << 0x10;
                            param_7 = *(long *)(unaff_x29 + -0x98);
                            uVar53 = (ulong)((int)((ulong)LZCOUNT(uVar33 >> 0x20 | uVar33 << 0x20)
                                                  >> 3) + iVar14 + 4);
                            goto code_r0x000b3cf8;
                          }
                          puVar15 = puVar15 + 1;
                          puVar19 = puVar19 + 1;
                          iVar14 = iVar14 + 8;
                        } while (puVar15 < puVar62);
                      }
                      if (puVar15 < param_10) {
                        if ((uint)*puVar19 == (uint)*puVar15) {
                          puVar15 = (ulong *)((long)puVar15 + 4);
                          puVar19 = (ulong *)((long)puVar19 + 4);
                        }
                        param_7 = *(long *)(unaff_x29 + -0x98);
                        if (puVar15 < param_9) goto code_r0x000b41a8;
code_r0x000b3be0:
                        if (puVar15 < *(ulong **)(unaff_x29 + -200)) {
code_r0x000b3bec:
                          if ((char)*puVar19 == (char)*puVar15) {
                            puVar15 = (ulong *)((long)puVar15 + 1);
                          }
                        }
                      }
                      else {
                        param_7 = *(long *)(unaff_x29 + -0x98);
                        if (param_9 <= puVar15) goto code_r0x000b3be0;
code_r0x000b41a8:
                        if ((short)*puVar19 == (short)*puVar15) {
                          puVar15 = (ulong *)((long)puVar15 + 2);
                          puVar19 = (ulong *)((long)puVar19 + 2);
                        }
                        if (puVar15 < *(ulong **)(unaff_x29 + -200)) goto code_r0x000b3bec;
                      }
                      uVar53 = (ulong)(((int)puVar15 - iVar37) + 4);
                    }
                  }
                  else {
                    if ((*(uint *)(unaff_x29 + -0xd0) < uVar18) ||
                       (puVar13 = (uint *)((long)puVar44 +
                                          (ulong)(uVar18 - (int)*(undefined8 *)(unaff_x29 + -0xa8)))
                       , *puVar13 != uVar55)) goto code_r0x000b39d0;
                    puVar62 = (ulong *)((long)puVar32 + (ulong)uVar73);
                    puVar15 = *(ulong **)(unaff_x29 + -200);
                    if (puVar62 <= *(ulong **)(unaff_x29 + -200)) {
                      puVar15 = puVar62;
                    }
                    puVar41 = (ulong *)(puVar13 + 1);
                    puVar26 = (ulong *)((long)puVar15 - 7);
                    puVar19 = puVar16;
                    if (puVar16 < puVar26) {
                      uVar33 = *puVar16 ^ *puVar41;
                      if (uVar33 == 0) {
                        puVar41 = (ulong *)(puVar13 + 3);
                        puVar19 = puVar29;
                        goto code_r0x000b3a68;
                      }
                      uVar33 = (uVar33 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                               (uVar33 & 0x5555555555555555) << 1;
                      uVar33 = (uVar33 & 0xcccccccccccccccc) >> 2 |
                               (uVar33 & 0x3333333333333333) << 2;
                      uVar33 = (uVar33 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                               (uVar33 & 0xf0f0f0f0f0f0f0f) << 4;
                      uVar33 = (uVar33 & 0xff00ff00ff00ff00) >> 8 | (uVar33 & 0xff00ff00ff00ff) << 8
                      ;
                      uVar33 = (uVar33 & 0xffff0000ffff0000) >> 0x10 |
                               (uVar33 & 0xffff0000ffff) << 0x10;
                      iVar14 = (int)((ulong)LZCOUNT(uVar33 >> 0x20 | uVar33 << 0x20) >> 3);
code_r0x000b3b0c:
                      param_7 = *(long *)(unaff_x29 + -0x98);
                      unaff_x24 = *(ulong **)(unaff_x29 + -0xd8);
                    }
                    else {
code_r0x000b3a68:
                      if (puVar19 < puVar26) {
                        iVar14 = *(int *)(unaff_x29 + -0xe0) + (int)puVar19;
                        do {
                          uVar33 = *puVar19 ^ *puVar41;
                          if (uVar33 != 0) {
                            uVar33 = (uVar33 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                                     (uVar33 & 0x5555555555555555) << 1;
                            uVar33 = (uVar33 & 0xcccccccccccccccc) >> 2 |
                                     (uVar33 & 0x3333333333333333) << 2;
                            uVar33 = (uVar33 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                                     (uVar33 & 0xf0f0f0f0f0f0f0f) << 4;
                            uVar33 = (uVar33 & 0xff00ff00ff00ff00) >> 8 |
                                     (uVar33 & 0xff00ff00ff00ff) << 8;
                            uVar33 = (uVar33 & 0xffff0000ffff0000) >> 0x10 |
                                     (uVar33 & 0xffff0000ffff) << 0x10;
                            iVar14 = (int)((ulong)LZCOUNT(uVar33 >> 0x20 | uVar33 << 0x20) >> 3) +
                                     iVar14;
                            goto code_r0x000b3b0c;
                          }
                          puVar19 = puVar19 + 1;
                          puVar41 = puVar41 + 1;
                          iVar14 = iVar14 + 8;
                        } while (puVar19 < puVar26);
                      }
                      if (puVar19 < (ulong *)((long)puVar15 - 3U)) {
                        if ((uint)*puVar41 == (uint)*puVar19) {
                          puVar19 = (ulong *)((long)puVar19 + 4);
                          puVar41 = (ulong *)((long)puVar41 + 4);
                        }
                        param_7 = *(long *)(unaff_x29 + -0x98);
                        if (puVar19 < (ulong *)((long)puVar15 - 1U)) goto code_r0x000b4170;
                      }
                      else {
                        param_7 = *(long *)(unaff_x29 + -0x98);
                        if (puVar19 < (ulong *)((long)puVar15 - 1U)) {
code_r0x000b4170:
                          if ((short)*puVar41 == (short)*puVar19) {
                            puVar19 = (ulong *)((long)puVar19 + 2);
                            puVar41 = (ulong *)((long)puVar41 + 2);
                          }
                        }
                      }
                      if (puVar19 < puVar15) {
                        if ((char)*puVar41 == (char)*puVar19) {
                          puVar19 = (ulong *)((long)puVar19 + 1);
                        }
                      }
                      unaff_x24 = *(ulong **)(unaff_x29 + -0xd8);
                      iVar14 = (int)puVar19 - iVar37;
                    }
                    uVar74 = iVar14 + 4;
                    uVar53 = (ulong)uVar74;
                    if (puVar62 < *(ulong **)(unaff_x29 + -200)) {
                      puVar62 = *(ulong **)(unaff_x29 + -0x78);
                      if ((ulong *)((long)puVar32 + (long)(int)uVar74) != puVar15)
                      goto code_r0x000b3cf8;
                      puVar41 = *(ulong **)(unaff_x29 + -0x90);
                      puVar19 = puVar15;
                      if (puVar15 < puVar62) {
                        uVar33 = *puVar15 ^ **(ulong **)(unaff_x29 + -0x90);
                        if (uVar33 == 0) {
                          puVar19 = puVar15 + 1;
                          puVar41 = puVar36;
                          goto code_r0x000b3c14;
                        }
                        uVar33 = (uVar33 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                                 (uVar33 & 0x5555555555555555) << 1;
                        uVar33 = (uVar33 & 0xcccccccccccccccc) >> 2 |
                                 (uVar33 & 0x3333333333333333) << 2;
                        uVar33 = (uVar33 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                                 (uVar33 & 0xf0f0f0f0f0f0f0f) << 4;
                        uVar33 = (uVar33 & 0xff00ff00ff00ff00) >> 8 |
                                 (uVar33 & 0xff00ff00ff00ff) << 8;
                        uVar33 = (uVar33 & 0xffff0000ffff0000) >> 0x10 |
                                 (uVar33 & 0xffff0000ffff) << 0x10;
                        iVar14 = (int)((ulong)LZCOUNT(uVar33 >> 0x20 | uVar33 << 0x20) >> 3);
code_r0x000b3cec:
                        unaff_x24 = *(ulong **)(unaff_x29 + -0xd8);
                      }
                      else {
code_r0x000b3c14:
                        if (puVar19 < *(ulong **)(unaff_x29 + -0x78)) {
                          uVar33 = (long)puVar47 + (ulong)uVar73;
                          uVar38 = param_24;
                          if (uVar33 <= param_24) {
                            uVar38 = uVar33;
                          }
                          iVar14 = (int)puVar19 - (int)uVar38;
                          do {
                            uVar33 = *puVar19 ^ *puVar41;
                            if (uVar33 != 0) {
                              uVar33 = (uVar33 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                                       (uVar33 & 0x5555555555555555) << 1;
                              uVar33 = (uVar33 & 0xcccccccccccccccc) >> 2 |
                                       (uVar33 & 0x3333333333333333) << 2;
                              uVar33 = (uVar33 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                                       (uVar33 & 0xf0f0f0f0f0f0f0f) << 4;
                              uVar33 = (uVar33 & 0xff00ff00ff00ff00) >> 8 |
                                       (uVar33 & 0xff00ff00ff00ff) << 8;
                              uVar33 = (uVar33 & 0xffff0000ffff0000) >> 0x10 |
                                       (uVar33 & 0xffff0000ffff) << 0x10;
                              iVar14 = (int)((ulong)LZCOUNT(uVar33 >> 0x20 | uVar33 << 0x20) >> 3) +
                                       iVar14;
                              goto code_r0x000b3cec;
                            }
                            puVar19 = puVar19 + 1;
                            puVar41 = puVar41 + 1;
                            iVar14 = iVar14 + 8;
                          } while (puVar19 < *(ulong **)(unaff_x29 + -0x78));
                        }
                        if (puVar19 < param_10) {
                          if ((uint)*puVar41 == (uint)*puVar19) {
                            puVar19 = (ulong *)((long)puVar19 + 4);
                            puVar41 = (ulong *)((long)puVar41 + 4);
                          }
                          if (puVar19 < param_9) goto code_r0x000b41e0;
code_r0x000b3c94:
                          if (puVar19 < *(ulong **)(unaff_x29 + -200)) {
code_r0x000b3ca0:
                            if ((char)*puVar41 == (char)*puVar19) {
                              puVar19 = (ulong *)((long)puVar19 + 1);
                            }
                          }
                        }
                        else {
                          if (param_9 <= puVar19) goto code_r0x000b3c94;
code_r0x000b41e0:
                          if ((short)*puVar41 == (short)*puVar19) {
                            puVar19 = (ulong *)((long)puVar19 + 2);
                            puVar41 = (ulong *)((long)puVar41 + 2);
                          }
                          if (puVar19 < *(ulong **)(unaff_x29 + -200)) goto code_r0x000b3ca0;
                        }
                        unaff_x24 = *(ulong **)(unaff_x29 + -0xd8);
                        iVar14 = (int)puVar19 - (int)puVar15;
                      }
                      uVar53 = (ulong)(iVar14 + uVar74);
                    }
                    puVar62 = *(ulong **)(unaff_x29 + -0x78);
                  }
code_r0x000b3cf8:
                  uVar57 = (uint)uVar53;
                  uVar73 = uVar57;
                  uVar74 = uVar11 - uVar18;
                  if ((int)uVar57 <= (int)uVar72) {
                    uVar73 = uVar72;
                    uVar74 = uVar17;
                  }
                  uVar17 = uVar74;
                  uVar38 = (ulong)uVar73;
                  if (uVar57 == uVar73) goto code_r0x000b39e0;
code_r0x000b3d10:
                  uVar53 = uVar38;
                  iVar14 = iVar49 + -1;
                  if (*(short *)(unaff_x26 + (ulong)(uVar18 & 0xffff) * 2) == 1 && iVar23 == 0) {
                    if (iVar61 == 0) {
                      if ((uVar55 & 0xffff) == uVar55 >> 0x10 && (uVar55 & 0xff) == uVar55 >> 0x18)
                      {
                        if (puVar16 < puVar62) {
                          lVar12 = 0;
                          do {
                            uVar33 = *(ulong *)((long)puVar25 + lVar12) ^ uVar52;
                            if (uVar33 != 0) {
                              uVar33 = (uVar33 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                                       (uVar33 & 0x5555555555555555) << 1;
                              uVar33 = (uVar33 & 0xcccccccccccccccc) >> 2 |
                                       (uVar33 & 0x3333333333333333) << 2;
                              uVar33 = (uVar33 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                                       (uVar33 & 0xf0f0f0f0f0f0f0f) << 4;
                              uVar33 = (uVar33 & 0xff00ff00ff00ff00) >> 8 |
                                       (uVar33 & 0xff00ff00ff00ff) << 8;
                              uVar33 = (uVar33 & 0xffff0000ffff0000) >> 0x10 |
                                       (uVar33 & 0xffff0000ffff) << 0x10;
                              puVar19 = (ulong *)((long)puVar9 +
                                                 lVar12 + ((ulong)LZCOUNT(uVar33 >> 0x20 |
                                                                          uVar33 << 0x20) >> 3));
                              goto code_r0x000b3e88;
                            }
                            lVar12 = lVar12 + 8;
                            puVar15 = (ulong *)((long)puVar25 + lVar12);
                          } while (puVar15 < puVar62);
                          puVar41 = *(ulong **)(unaff_x29 + -200);
                          puVar19 = (ulong *)((long)puVar9 + lVar12);
                          if (puVar15 < puVar41) goto code_r0x000b3e30;
                        }
                        else {
                          puVar41 = *(ulong **)(unaff_x29 + -200);
                          puVar19 = puVar16;
                          puVar15 = puVar16;
                          if (puVar16 < puVar41) {
code_r0x000b3e30:
                            lVar12 = (long)puVar41 - (long)puVar19;
                            puVar19 = (ulong *)((long)puVar15 + lVar12);
                            uVar33 = uVar52;
                            do {
                              if ((uint)(byte)*puVar15 != ((uint)uVar33 & 0xff))
                              goto code_r0x000b3e5c;
                              puVar15 = (ulong *)((long)puVar15 + 1);
                              uVar33 = uVar33 >> 8;
                              lVar12 = lVar12 + -1;
                            } while (lVar12 != 0);
                            puVar15 = puVar19;
code_r0x000b3e5c:
                            param_7 = *(long *)(unaff_x29 + -0x98);
                            puVar19 = puVar15;
                          }
                        }
code_r0x000b3e88:
                        uStack00000000000000b0 = (ulong)(uint)((int)puVar19 - iVar37) + 4;
                        iVar61 = 2;
                        goto code_r0x000b3d30;
                      }
                      iVar61 = 1;
                    }
                    else if (iVar61 == 2) {
code_r0x000b3d30:
                      uVar72 = uVar18 - 1;
                      if (uVar31 <= uVar72) {
                        if (2 < uVar3 - uVar18) {
                          puVar13 = (uint *)((long)puVar44 +
                                            (ulong)(uVar72 - (int)*(undefined8 *)(unaff_x29 + -0xa8)
                                                   ));
                          puVar28 = (uint *)(*(long *)(unaff_x29 + -0x90) + (ulong)(uVar72 - uVar3))
                          ;
                          if (uVar72 < uVar3) {
                            puVar28 = puVar13;
                          }
                          if (*puVar28 == uVar55) {
                            puVar15 = *(ulong **)(unaff_x29 + -200);
                            if (uVar72 < uVar3) {
                              puVar15 = puVar2;
                            }
                            puVar19 = (ulong *)(puVar28 + 1);
                            puVar41 = puVar19;
                            if (puVar19 < (ulong *)((long)puVar15 - 7U)) {
                              puVar26 = puVar19;
                              do {
                                uVar33 = *puVar41 ^ uVar52;
                                if (uVar33 != 0) {
                                  uVar33 = (uVar33 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                                           (uVar33 & 0x5555555555555555) << 1;
                                  uVar33 = (uVar33 & 0xcccccccccccccccc) >> 2 |
                                           (uVar33 & 0x3333333333333333) << 2;
                                  uVar33 = (uVar33 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                                           (uVar33 & 0xf0f0f0f0f0f0f0f) << 4;
                                  uVar33 = (uVar33 & 0xff00ff00ff00ff00) >> 8 |
                                           (uVar33 & 0xff00ff00ff00ff) << 8;
                                  uVar33 = (uVar33 & 0xffff0000ffff0000) >> 0x10 |
                                           (uVar33 & 0xffff0000ffff) << 0x10;
                                  puVar41 = (ulong *)((long)puVar26 +
                                                     ((ulong)LZCOUNT(uVar33 >> 0x20 | uVar33 << 0x20
                                                                    ) >> 3));
                                  goto code_r0x000b3eb0;
                                }
                                puVar41 = puVar41 + 1;
                                puVar26 = puVar26 + 1;
                              } while (puVar41 < (ulong *)((long)puVar15 - 7U));
                            }
                            if (puVar41 < puVar15) {
                              lVar12 = (long)puVar15 - (long)puVar41;
                              uVar33 = uVar52;
                              do {
                                if ((uint)(byte)*puVar41 != ((uint)uVar33 & 0xff))
                                goto code_r0x000b3eb0;
                                puVar41 = (ulong *)((long)puVar41 + 1);
                                uVar33 = uVar33 >> 8;
                                lVar12 = lVar12 + -1;
                              } while (lVar12 != 0);
                              puVar41 = puVar15;
                            }
code_r0x000b3eb0:
                            uVar38 = (long)puVar41 - (long)puVar19;
                            uVar33 = (uVar38 & 0xffffffff) + 4;
                            if (uVar72 < uVar3) {
                              puVar35 = puVar44;
                              if ((ulong *)((long)puVar13 + uVar33) == puVar2) {
                                uVar34 = uVar52;
                                if ((uVar38 & 3) != 0) {
                                  uVar18 = (int)uVar38 * -8 & 0x1f;
                                  uVar18 = uVar55 >> uVar18 | uVar55 << 0x20 - uVar18;
                                  uVar34 = CONCAT44(uVar18,uVar18);
                                }
                                puVar19 = *(ulong **)(unaff_x29 + -0x90);
                                puVar15 = puVar19;
                                for (; puVar19 < puVar62; puVar19 = puVar19 + 1) {
                                  uVar38 = *puVar19 ^ uVar34;
                                  if (uVar38 != 0) {
                                    uVar38 = (uVar38 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                                             (uVar38 & 0x5555555555555555) << 1;
                                    uVar38 = (uVar38 & 0xcccccccccccccccc) >> 2 |
                                             (uVar38 & 0x3333333333333333) << 2;
                                    uVar38 = (uVar38 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                                             (uVar38 & 0xf0f0f0f0f0f0f0f) << 4;
                                    uVar38 = (uVar38 & 0xff00ff00ff00ff00) >> 8 |
                                             (uVar38 & 0xff00ff00ff00ff) << 8;
                                    uVar38 = (uVar38 & 0xffff0000ffff0000) >> 0x10 |
                                             (uVar38 & 0xffff0000ffff) << 0x10;
                                    puVar15 = (ulong *)((long)puVar15 +
                                                       ((ulong)LZCOUNT(uVar38 >> 0x20 |
                                                                       uVar38 << 0x20) >> 3));
                                    goto code_r0x000b3f90;
                                  }
                                  puVar15 = puVar15 + 1;
                                }
                                if (puVar19 < *(ulong **)(unaff_x29 + -200)) {
                                  lVar12 = *(long *)(unaff_x29 + -200) - (long)puVar15;
                                  puVar62 = (ulong *)((long)puVar19 + lVar12);
                                  do {
                                    puVar15 = puVar19;
                                    if ((uint)(byte)*puVar19 != ((uint)uVar34 & 0xff))
                                    goto code_r0x000b3f64;
                                    puVar19 = (ulong *)((long)puVar19 + 1);
                                    uVar34 = uVar34 >> 8;
                                    lVar12 = lVar12 + -1;
                                  } while (lVar12 != 0);
                                  puVar15 = puVar62;
code_r0x000b3f64:
                                  unaff_x24 = *(ulong **)(unaff_x29 + -0xd8);
                                  puVar62 = *(ulong **)(unaff_x29 + -0x78);
                                  in_s21 = -0x13;
                                  in_register_000052a4 = -0x13;
                                  in_register_000052a8 = -0x13;
                                  in_register_000052ac = -0x13;
                                  in_s23 = 4;
                                  in_register_000052e4 = 4;
                                  in_register_000052e8 = 4;
                                  in_register_000052ec = 4;
                                  in_d20 = param_27;
                                  in_register_00005288 = param_28;
                                  in_d22 = param_25;
                                  in_register_000052c8 = param_26;
                                }
code_r0x000b3f90:
                                uVar33 = (uint)((int)puVar15 -
                                               (int)*(undefined8 *)(unaff_x29 + -0x90)) + uVar33;
                              }
                            }
                            else {
                              puVar35 = *(uint **)(unaff_x29 + -0x90);
                            }
                            *(uint *)(unaff_x29 + -0x6c) = uVar55;
                            puVar13 = puVar28;
                            do {
                              puVar27 = puVar13;
                              if (puVar27 < puVar35 + 1) break;
                              puVar13 = puVar27 + -1;
                            } while (puVar27[-1] == uVar55);
                            puVar13 = puVar27;
                            if (puVar35 < puVar27) {
                              lVar12 = 0;
                              do {
                                puVar13 = (uint *)((long)puVar27 + lVar12);
                                if (*(char *)((long)puVar13 + -1) !=
                                    *(char *)(*(long *)(unaff_x29 + -0x80) + lVar12))
                                goto code_r0x000b4008;
                                lVar12 = lVar12 + -1;
                              } while (puVar35 < (uint *)((long)puVar27 + lVar12));
                              puVar13 = puVar35;
                            }
code_r0x000b4008:
                            iVar23 = (int)((long)puVar28 - (long)puVar13);
                            param_7 = *(long *)(unaff_x29 + -0x98);
                            if (((uVar3 <= uVar72) &&
                                ((long)puVar28 - ((long)puVar28 - (long)puVar13 & 0xffffffffU) ==
                                 *(long *)(unaff_x29 + -0x90))) &&
                               ((uint)*(undefined8 *)(unaff_x29 + -0xa8) < uVar3)) {
                              uVar73 = iVar23 * 8 & 0x1f;
                              uVar18 = uVar55;
                              if ((-iVar23 & 3U) != 0) {
                                uVar18 = uVar55 >> uVar73 | uVar55 << 0x20 - uVar73;
                              }
                              *(uint *)(unaff_x29 + -0x6c) = uVar18;
                              lVar12 = lVar48;
                              do {
                                lVar20 = lVar12;
                                if (lVar20 < 4) {
                                  puVar13 = (uint *)((long)puVar44 + lVar20);
                                  if (lVar20 < 1) goto code_r0x000b40a0;
                                  break;
                                }
                                lVar12 = lVar20 + -4;
                              } while (*(uint *)((long)puVar44 + lVar20 + -4) == uVar18);
                              pcVar21 = *(char **)(unaff_x29 + -0x80);
                              puVar13 = (uint *)((long)puVar44 + lVar20);
                              do {
                                puVar28 = (uint *)((long)puVar13 + -1);
                                if (*(char *)puVar28 != *pcVar21) goto code_r0x000b40a0;
                                pcVar21 = pcVar21 + -1;
                                puVar13 = puVar28;
                              } while (puVar44 < puVar28);
                              puVar13 = puVar44;
code_r0x000b40a0:
                              iVar23 = (iVar54 - (int)puVar13) + iVar23;
                              param_7 = *(long *)(unaff_x29 + -0x98);
                            }
                            uVar18 = uVar72 - iVar23;
                            if (uVar72 - iVar23 <= uVar31) {
                              uVar18 = uVar31;
                            }
                            uVar38 = uVar33 + (uVar72 - uVar18);
                            if ((uVar33 <= uStack00000000000000b0) &&
                               (uStack00000000000000b0 <= uVar38)) {
                              iVar23 = 0;
                              uVar18 = (uVar72 - (int)uStack00000000000000b0) + (int)uVar33;
                              uVar72 = uVar3;
                              if (2 < uVar3 + ~uVar18) {
                                uVar72 = uVar18;
                              }
                              iVar61 = 2;
                              uVar33 = (ulong)uVar72;
                              goto code_r0x000b38d4;
                            }
                            if (uVar3 + ~uVar18 < 3) {
                              iVar23 = 0;
                              iVar61 = 2;
                              uVar33 = uVar59;
                            }
                            else {
                              if (uStack00000000000000b0 <= uVar38) {
                                uVar38 = uStack00000000000000b0;
                              }
                              if ((ulong)(long)(int)uVar53 < uVar38) {
                                if ((((long)puVar32 - lVar43) + uVar59) - (ulong)uVar18 >> 0x10 != 0
                                   ) goto code_r0x000b2994;
                                uVar17 = uVar11 - uVar18;
                                uVar53 = uVar38;
                              }
                              uVar72 = (uint)*(ushort *)(unaff_x26 + (ulong)(uVar18 & 0xffff) * 2);
                              uVar33 = (ulong)(uVar18 - uVar72);
                              if (uVar18 < uVar72) goto code_r0x000b2994;
                              iVar23 = 0;
                              iVar61 = 2;
                            }
                            goto code_r0x000b38d4;
                          }
                        }
                        iVar61 = 2;
                      }
                    }
                  }
                  uVar33 = (ulong)(uVar18 - *(ushort *)
                                             (unaff_x26 + (ulong)(iVar23 + uVar18 & 0xffff) * 2));
                }
                else {
code_r0x000b39d0:
                  uVar53 = 0;
                  if (uVar72 != 0) goto code_r0x000b3d10;
code_r0x000b39e0:
                  iVar14 = iVar49 + -1;
                  if (uVar11 < (int)uVar38 + uVar18) goto code_r0x000b3d10;
                  if ((int)uVar53 < 4) goto code_r0x000b3d10;
                  iVar56 = 0;
                  uVar72 = 1;
                  iVar24 = iVar23;
                  iVar10 = 0x10;
                  do {
                    uVar4 = *(ushort *)(unaff_x26 + (ulong)(iVar56 + uVar18 & 0xffff) * 2);
                    uVar73 = (uint)uVar4;
                    bVar5 = uVar73 <= uVar72;
                    if (uVar72 <= uVar73) {
                      uVar72 = (uint)uVar4;
                    }
                    iVar23 = iVar56;
                    if (bVar5) {
                      iVar23 = iVar24;
                    }
                    iVar56 = iVar56 + (iVar10 >> 4);
                    iVar50 = 0x10;
                    if (bVar5) {
                      iVar50 = iVar10 + 1;
                    }
                    iVar24 = iVar23;
                    iVar10 = iVar50;
                  } while (iVar56 < (int)uVar53 + -3);
                  if (uVar72 < 2) {
                    param_7 = *(long *)(unaff_x29 + -0x98);
                    goto code_r0x000b3d10;
                  }
                  uVar73 = 0;
                  if (uVar72 <= uVar18) {
                    uVar73 = uVar72;
                  }
                  param_7 = *(long *)(unaff_x29 + -0x98);
                  if (uVar18 < uVar72) goto code_r0x000b2994;
                  uVar33 = (ulong)(uVar18 - uVar73);
                }
code_r0x000b38d4:
                iVar14 = iVar49 + -1;
                bVar5 = iVar49 < 2;
                uVar38 = uVar53;
                iVar49 = iVar14;
                if ((uint)uVar33 < uVar31 || bVar5) goto code_r0x000b2994;
                goto code_r0x000b38e0;
              }
              uVar17 = 0;
              iVar14 = in_stack_00000118;
code_r0x000b2994:
              if (((uVar11 < *(uint *)(unaff_x29 + -0xf0)) && (*(int *)(unaff_x29 + -0xe4) == 1)) &&
                 (0 < iVar14)) {
                lVar43 = (*plVar1 - *(long *)(&UNK_00040008 + lVar60)) +
                         (ulong)*(uint *)(&UNK_00040018 + lVar60);
                uVar18 = *(uint *)(*(long *)(unaff_x29 + -0xb0) +
                                  (ulong)((uint)*puVar32 * -0x61c8864f >> 0x11) * 4);
                iVar23 = (uVar18 + uVar31) - (int)lVar43;
                uVar31 = uVar11 - iVar23;
                if (uVar31 >> 0x10 == 0) {
                  do {
                    if (iVar14 == 0) break;
                    puVar13 = (uint *)((*(long *)(&UNK_00040008 + lVar60) -
                                       (ulong)*(uint *)(&UNK_00040018 + lVar60)) + (ulong)uVar18);
                    if (*puVar13 == uVar55) {
                      puVar15 = (ulong *)((long)puVar32 + (lVar43 - (ulong)uVar18));
                      puVar19 = *(ulong **)(unaff_x29 + -200);
                      if (puVar15 <= *(ulong **)(unaff_x29 + -200)) {
                        puVar19 = puVar15;
                      }
                      puVar41 = (ulong *)(puVar13 + 1);
                      puVar26 = (ulong *)((long)puVar19 - 7);
                      puVar15 = puVar16;
                      if (puVar16 < puVar26) {
                        uVar33 = *puVar16 ^ *puVar41;
                        if (uVar33 == 0) {
                          puVar41 = (ulong *)(puVar13 + 3);
                          puVar15 = puVar29;
                          goto joined_r0x000b2ed4;
                        }
                        uVar33 = (uVar33 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                                 (uVar33 & 0x5555555555555555) << 1;
                        uVar33 = (uVar33 & 0xcccccccccccccccc) >> 2 |
                                 (uVar33 & 0x3333333333333333) << 2;
                        uVar33 = (uVar33 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                                 (uVar33 & 0xf0f0f0f0f0f0f0f) << 4;
                        uVar33 = (uVar33 & 0xff00ff00ff00ff00) >> 8 |
                                 (uVar33 & 0xff00ff00ff00ff) << 8;
                        uVar33 = (uVar33 & 0xffff0000ffff0000) >> 0x10 |
                                 (uVar33 & 0xffff0000ffff) << 0x10;
                        iVar49 = (int)((ulong)LZCOUNT(uVar33 >> 0x20 | uVar33 << 0x20) >> 3);
                        param_7 = *(long *)(unaff_x29 + -0x98);
                      }
                      else {
joined_r0x000b2ed4:
                        if (puVar15 < puVar26) {
                          iVar49 = *(int *)(unaff_x29 + -0xe0) + (int)puVar15;
                          do {
                            uVar33 = *puVar15 ^ *puVar41;
                            if (uVar33 != 0) {
                              uVar33 = (uVar33 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                                       (uVar33 & 0x5555555555555555) << 1;
                              uVar33 = (uVar33 & 0xcccccccccccccccc) >> 2 |
                                       (uVar33 & 0x3333333333333333) << 2;
                              uVar33 = (uVar33 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                                       (uVar33 & 0xf0f0f0f0f0f0f0f) << 4;
                              uVar33 = (uVar33 & 0xff00ff00ff00ff00) >> 8 |
                                       (uVar33 & 0xff00ff00ff00ff) << 8;
                              uVar33 = (uVar33 & 0xffff0000ffff0000) >> 0x10 |
                                       (uVar33 & 0xffff0000ffff) << 0x10;
                              iVar49 = (int)((ulong)LZCOUNT(uVar33 >> 0x20 | uVar33 << 0x20) >> 3) +
                                       iVar49;
                              param_7 = *(long *)(unaff_x29 + -0x98);
                              goto code_r0x000b2e80;
                            }
                            puVar15 = puVar15 + 1;
                            puVar41 = puVar41 + 1;
                            iVar49 = iVar49 + 8;
                          } while (puVar15 < puVar26);
                        }
                        if (puVar15 < (ulong *)((long)puVar19 - 3U)) {
                          if ((uint)*puVar41 == (uint)*puVar15) {
                            puVar15 = (ulong *)((long)puVar15 + 4);
                            puVar41 = (ulong *)((long)puVar41 + 4);
                          }
                          param_7 = *(long *)(unaff_x29 + -0x98);
                          if (puVar15 < (ulong *)((long)puVar19 - 1U)) goto code_r0x000b2ea4;
                        }
                        else {
                          param_7 = *(long *)(unaff_x29 + -0x98);
                          if (puVar15 < (ulong *)((long)puVar19 - 1U)) {
code_r0x000b2ea4:
                            if ((short)*puVar41 == (short)*puVar15) {
                              puVar15 = (ulong *)((long)puVar15 + 2);
                              puVar41 = (ulong *)((long)puVar41 + 2);
                            }
                          }
                        }
                        if (puVar15 < puVar19) {
                          if ((char)*puVar41 == (char)*puVar15) {
                            puVar15 = (ulong *)((long)puVar15 + 1);
                          }
                        }
                        iVar49 = (int)puVar15 - iVar37;
                      }
code_r0x000b2e80:
                      uVar72 = iVar49 + 4U;
                      if ((int)(iVar49 + 4U) <= (int)(uint)uVar53) {
                        uVar72 = (uint)uVar53;
                        uVar31 = uVar17;
                      }
                      uVar17 = uVar31;
                      uVar53 = (ulong)uVar72;
                    }
                    iVar14 = iVar14 + -1;
                    uVar31 = (uint)*(ushort *)
                                    (*(long *)(unaff_x29 + -0xb0) + (ulong)(uVar18 & 0xffff) * 2 +
                                    0x20000);
                    uVar18 = uVar18 - uVar31;
                    iVar23 = iVar23 - uVar31;
                    uVar31 = uVar11 - iVar23;
                  } while (uVar31 < 0x10000);
                }
              }
              unaff_x21 = *(ulong *)(unaff_x29 + -0xf8);
              if ((int)uVar71 < (int)uVar53) goto code_r0x000b4270;
code_r0x000b2814:
              unaff_x22 = *(ulong **)(unaff_x29 + -200);
              lVar43 = *(long *)(unaff_x29 + -0x90);
            }
            else if ((iVar58 < iVar63) ||
                    (iVar58 + 3 <= *(int *)(*(long *)(unaff_x29 + -0xa0) + uVar40 * 0x10 + 0x40))) {
              *(ulong *)(unaff_x29 + -0xf8) = unaff_x21;
              uVar11 = uVar3 + (int)((long)puVar32 - lVar43);
              uVar31 = (uint)*(undefined8 *)(unaff_x29 + -0xa8);
              if (*(uint *)(unaff_x29 + -0xf0) <= uVar11) {
                uVar31 = uVar11 - 0xffff;
              }
              uVar55 = (uint)*puVar32;
              uVar17 = *(uint *)(*(long *)(unaff_x29 + -0xb8) + 0x20);
              uVar33 = (ulong)uVar17;
              uVar18 = uVar55;
              if (uVar17 < uVar11) {
                do {
                  lVar12 = (ulong)((uint)(*(int *)(lVar51 + uVar33) * -0x61c8864f) >> 0x11) * 4;
                  uVar17 = (int)uVar33 - *(int *)(param_7 + lVar12);
                  if (0xfffe < uVar17) {
                    uVar17 = 0xffff;
                  }
                  *(short *)(unaff_x26 + (uVar33 & 0xffff) * 2) = (short)uVar17;
                  *(int *)(param_7 + lVar12) = (int)uVar33;
                  uVar33 = uVar33 + 1;
                } while (uVar30 != uVar33);
                uVar18 = (uint)*puVar32;
              }
              *(uint *)(*(long *)(unaff_x29 + -0xb8) + 0x20) = uVar11;
              uVar17 = *(uint *)(param_7 + (ulong)(uVar18 * -0x61c8864f >> 0x11) * 4);
              uVar33 = (ulong)uVar17;
              puVar16 = (ulong *)((long)puVar32 + 4);
              puVar29 = (ulong *)((long)puVar32 + 0xc);
              iVar37 = (int)puVar16;
              if (uVar31 <= uVar17 && 0 < in_stack_00000118) {
                iVar23 = 0;
                iVar61 = 0;
                uStack00000000000000b0 = 0;
                uVar17 = 0;
                uVar52 = CONCAT44(uVar55,uVar55);
                uVar38 = 3;
                iVar49 = in_stack_00000118;
code_r0x000b2f48:
                uVar18 = (uint)uVar33;
                uVar71 = (uint)uVar38;
                if ((*(int *)(unaff_x29 + -0x88) == 0) || (7 < uVar11 - uVar18)) {
                  uVar72 = uVar3 - uVar18;
                  if (uVar3 < uVar18 || uVar72 == 0) {
                    puVar13 = (uint *)(*(long *)(unaff_x29 + -0x90) + (ulong)(uVar18 - uVar3));
                    if ((*(short *)((long)puVar32 + (long)(int)uVar71 + -1) !=
                         *(short *)((long)puVar13 + (long)(int)uVar71 + -1)) || (*puVar13 != uVar55)
                       ) goto code_r0x000b2f60;
                    puVar19 = (ulong *)(puVar13 + 1);
                    puVar15 = puVar16;
                    if (puVar16 < puVar62) {
                      uVar33 = *puVar16 ^ *puVar19;
                      if (uVar33 == 0) {
                        puVar19 = (ulong *)(puVar13 + 3);
                        puVar15 = puVar29;
                        goto joined_r0x000b3878;
                      }
                      uVar33 = (uVar33 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                               (uVar33 & 0x5555555555555555) << 1;
                      uVar33 = (uVar33 & 0xcccccccccccccccc) >> 2 |
                               (uVar33 & 0x3333333333333333) << 2;
                      uVar33 = (uVar33 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                               (uVar33 & 0xf0f0f0f0f0f0f0f) << 4;
                      uVar33 = (uVar33 & 0xff00ff00ff00ff00) >> 8 | (uVar33 & 0xff00ff00ff00ff) << 8
                      ;
                      uVar33 = (uVar33 & 0xffff0000ffff0000) >> 0x10 |
                               (uVar33 & 0xffff0000ffff) << 0x10;
                      uVar53 = (ulong)((int)((ulong)LZCOUNT(uVar33 >> 0x20 | uVar33 << 0x20) >> 3) +
                                      4);
                    }
                    else {
joined_r0x000b3878:
                      if (puVar15 < puVar62) {
                        iVar14 = *(int *)(unaff_x29 + -0xe0) + (int)puVar15;
                        do {
                          uVar33 = *puVar15 ^ *puVar19;
                          if (uVar33 != 0) {
                            uVar33 = (uVar33 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                                     (uVar33 & 0x5555555555555555) << 1;
                            uVar33 = (uVar33 & 0xcccccccccccccccc) >> 2 |
                                     (uVar33 & 0x3333333333333333) << 2;
                            uVar33 = (uVar33 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                                     (uVar33 & 0xf0f0f0f0f0f0f0f) << 4;
                            uVar33 = (uVar33 & 0xff00ff00ff00ff00) >> 8 |
                                     (uVar33 & 0xff00ff00ff00ff) << 8;
                            uVar33 = (uVar33 & 0xffff0000ffff0000) >> 0x10 |
                                     (uVar33 & 0xffff0000ffff) << 0x10;
                            param_7 = *(long *)(unaff_x29 + -0x98);
                            uVar53 = (ulong)((int)((ulong)LZCOUNT(uVar33 >> 0x20 | uVar33 << 0x20)
                                                  >> 3) + iVar14 + 4);
                            goto code_r0x000b3358;
                          }
                          puVar15 = puVar15 + 1;
                          puVar19 = puVar19 + 1;
                          iVar14 = iVar14 + 8;
                        } while (puVar15 < puVar62);
                      }
                      if (puVar15 < param_10) {
                        if ((uint)*puVar19 == (uint)*puVar15) {
                          puVar15 = (ulong *)((long)puVar15 + 4);
                          puVar19 = (ulong *)((long)puVar19 + 4);
                        }
                        if (puVar15 < param_9) goto code_r0x000b37d4;
code_r0x000b323c:
                        if (puVar15 < *(ulong **)(unaff_x29 + -200)) {
code_r0x000b3248:
                          if ((char)*puVar19 == (char)*puVar15) {
                            puVar15 = (ulong *)((long)puVar15 + 1);
                          }
                        }
                      }
                      else {
                        if (param_9 <= puVar15) goto code_r0x000b323c;
code_r0x000b37d4:
                        if ((short)*puVar19 == (short)*puVar15) {
                          puVar15 = (ulong *)((long)puVar15 + 2);
                          puVar19 = (ulong *)((long)puVar19 + 2);
                        }
                        if (puVar15 < *(ulong **)(unaff_x29 + -200)) goto code_r0x000b3248;
                      }
                      param_7 = *(long *)(unaff_x29 + -0x98);
                      uVar53 = (ulong)(((int)puVar15 - iVar37) + 4);
                    }
                  }
                  else {
                    if ((*(uint *)(unaff_x29 + -0xd0) < uVar18) ||
                       (puVar13 = (uint *)((long)puVar44 +
                                          (ulong)(uVar18 - (int)*(undefined8 *)(unaff_x29 + -0xa8)))
                       , *puVar13 != uVar55)) goto code_r0x000b2f60;
                    puVar62 = (ulong *)((long)puVar32 + (ulong)uVar72);
                    puVar15 = *(ulong **)(unaff_x29 + -200);
                    if (puVar62 <= *(ulong **)(unaff_x29 + -200)) {
                      puVar15 = puVar62;
                    }
                    puVar41 = (ulong *)(puVar13 + 1);
                    puVar26 = (ulong *)((long)puVar15 - 7);
                    puVar19 = puVar16;
                    if (puVar16 < puVar26) {
                      uVar33 = *puVar16 ^ *puVar41;
                      if (uVar33 == 0) {
                        puVar41 = (ulong *)(puVar13 + 3);
                        puVar19 = puVar29;
                        goto joined_r0x000b3850;
                      }
                      uVar33 = (uVar33 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                               (uVar33 & 0x5555555555555555) << 1;
                      uVar33 = (uVar33 & 0xcccccccccccccccc) >> 2 |
                               (uVar33 & 0x3333333333333333) << 2;
                      uVar33 = (uVar33 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                               (uVar33 & 0xf0f0f0f0f0f0f0f) << 4;
                      uVar33 = (uVar33 & 0xff00ff00ff00ff00) >> 8 | (uVar33 & 0xff00ff00ff00ff) << 8
                      ;
                      uVar33 = (uVar33 & 0xffff0000ffff0000) >> 0x10 |
                               (uVar33 & 0xffff0000ffff) << 0x10;
                      iVar14 = (int)((ulong)LZCOUNT(uVar33 >> 0x20 | uVar33 << 0x20) >> 3);
code_r0x000b316c:
                      param_7 = *(long *)(unaff_x29 + -0x98);
                      unaff_x24 = *(ulong **)(unaff_x29 + -0xd8);
                    }
                    else {
joined_r0x000b3850:
                      if (puVar19 < puVar26) {
                        iVar14 = *(int *)(unaff_x29 + -0xe0) + (int)puVar19;
                        do {
                          uVar33 = *puVar19 ^ *puVar41;
                          if (uVar33 != 0) {
                            uVar33 = (uVar33 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                                     (uVar33 & 0x5555555555555555) << 1;
                            uVar33 = (uVar33 & 0xcccccccccccccccc) >> 2 |
                                     (uVar33 & 0x3333333333333333) << 2;
                            uVar33 = (uVar33 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                                     (uVar33 & 0xf0f0f0f0f0f0f0f) << 4;
                            uVar33 = (uVar33 & 0xff00ff00ff00ff00) >> 8 |
                                     (uVar33 & 0xff00ff00ff00ff) << 8;
                            uVar33 = (uVar33 & 0xffff0000ffff0000) >> 0x10 |
                                     (uVar33 & 0xffff0000ffff) << 0x10;
                            iVar14 = (int)((ulong)LZCOUNT(uVar33 >> 0x20 | uVar33 << 0x20) >> 3) +
                                     iVar14;
                            goto code_r0x000b316c;
                          }
                          puVar19 = puVar19 + 1;
                          puVar41 = puVar41 + 1;
                          iVar14 = iVar14 + 8;
                        } while (puVar19 < puVar26);
                      }
                      if (puVar19 < (ulong *)((long)puVar15 - 3U)) {
                        if ((uint)*puVar41 == (uint)*puVar19) {
                          puVar19 = (ulong *)((long)puVar19 + 4);
                          puVar41 = (ulong *)((long)puVar41 + 4);
                        }
                        param_7 = *(long *)(unaff_x29 + -0x98);
                        if (puVar19 < (ulong *)((long)puVar15 - 1U)) goto code_r0x000b37a0;
                      }
                      else {
                        param_7 = *(long *)(unaff_x29 + -0x98);
                        if (puVar19 < (ulong *)((long)puVar15 - 1U)) {
code_r0x000b37a0:
                          if ((short)*puVar41 == (short)*puVar19) {
                            puVar19 = (ulong *)((long)puVar19 + 2);
                            puVar41 = (ulong *)((long)puVar41 + 2);
                          }
                        }
                      }
                      if (puVar19 < puVar15) {
                        if ((char)*puVar41 == (char)*puVar19) {
                          puVar19 = (ulong *)((long)puVar19 + 1);
                        }
                      }
                      unaff_x24 = *(ulong **)(unaff_x29 + -0xd8);
                      iVar14 = (int)puVar19 - iVar37;
                    }
                    uVar73 = iVar14 + 4;
                    uVar53 = (ulong)uVar73;
                    if (puVar62 < *(ulong **)(unaff_x29 + -200)) {
                      puVar62 = *(ulong **)(unaff_x29 + -0x78);
                      if ((ulong *)((long)puVar32 + (long)(int)uVar73) != puVar15)
                      goto code_r0x000b3358;
                      puVar41 = *(ulong **)(unaff_x29 + -0x90);
                      puVar19 = puVar15;
                      if (puVar15 < puVar62) {
                        uVar33 = *puVar15 ^ **(ulong **)(unaff_x29 + -0x90);
                        if (uVar33 == 0) {
                          puVar19 = puVar15 + 1;
                          puVar41 = puVar36;
                          goto code_r0x000b3274;
                        }
                        uVar33 = (uVar33 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                                 (uVar33 & 0x5555555555555555) << 1;
                        uVar33 = (uVar33 & 0xcccccccccccccccc) >> 2 |
                                 (uVar33 & 0x3333333333333333) << 2;
                        uVar33 = (uVar33 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                                 (uVar33 & 0xf0f0f0f0f0f0f0f) << 4;
                        uVar33 = (uVar33 & 0xff00ff00ff00ff00) >> 8 |
                                 (uVar33 & 0xff00ff00ff00ff) << 8;
                        uVar33 = (uVar33 & 0xffff0000ffff0000) >> 0x10 |
                                 (uVar33 & 0xffff0000ffff) << 0x10;
                        iVar14 = (int)((ulong)LZCOUNT(uVar33 >> 0x20 | uVar33 << 0x20) >> 3);
code_r0x000b334c:
                        unaff_x24 = *(ulong **)(unaff_x29 + -0xd8);
                      }
                      else {
code_r0x000b3274:
                        if (puVar19 < *(ulong **)(unaff_x29 + -0x78)) {
                          uVar33 = (long)puVar47 + (ulong)uVar72;
                          uVar38 = param_24;
                          if (uVar33 <= param_24) {
                            uVar38 = uVar33;
                          }
                          iVar14 = (int)puVar19 - (int)uVar38;
                          do {
                            uVar33 = *puVar19 ^ *puVar41;
                            if (uVar33 != 0) {
                              uVar33 = (uVar33 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                                       (uVar33 & 0x5555555555555555) << 1;
                              uVar33 = (uVar33 & 0xcccccccccccccccc) >> 2 |
                                       (uVar33 & 0x3333333333333333) << 2;
                              uVar33 = (uVar33 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                                       (uVar33 & 0xf0f0f0f0f0f0f0f) << 4;
                              uVar33 = (uVar33 & 0xff00ff00ff00ff00) >> 8 |
                                       (uVar33 & 0xff00ff00ff00ff) << 8;
                              uVar33 = (uVar33 & 0xffff0000ffff0000) >> 0x10 |
                                       (uVar33 & 0xffff0000ffff) << 0x10;
                              iVar14 = (int)((ulong)LZCOUNT(uVar33 >> 0x20 | uVar33 << 0x20) >> 3) +
                                       iVar14;
                              goto code_r0x000b334c;
                            }
                            puVar19 = puVar19 + 1;
                            puVar41 = puVar41 + 1;
                            iVar14 = iVar14 + 8;
                          } while (puVar19 < *(ulong **)(unaff_x29 + -0x78));
                        }
                        if (puVar19 < param_10) {
                          if ((uint)*puVar41 == (uint)*puVar19) {
                            puVar19 = (ulong *)((long)puVar19 + 4);
                            puVar41 = (ulong *)((long)puVar41 + 4);
                          }
                          if (puVar19 < param_9) goto code_r0x000b380c;
code_r0x000b32f4:
                          if (puVar19 < *(ulong **)(unaff_x29 + -200)) {
code_r0x000b3300:
                            if ((char)*puVar41 == (char)*puVar19) {
                              puVar19 = (ulong *)((long)puVar19 + 1);
                            }
                          }
                        }
                        else {
                          if (param_9 <= puVar19) goto code_r0x000b32f4;
code_r0x000b380c:
                          if ((short)*puVar41 == (short)*puVar19) {
                            puVar19 = (ulong *)((long)puVar19 + 2);
                            puVar41 = (ulong *)((long)puVar41 + 2);
                          }
                          if (puVar19 < *(ulong **)(unaff_x29 + -200)) goto code_r0x000b3300;
                        }
                        unaff_x24 = *(ulong **)(unaff_x29 + -0xd8);
                        iVar14 = (int)puVar19 - (int)puVar15;
                      }
                      uVar53 = (ulong)(iVar14 + uVar73);
                    }
                    puVar62 = *(ulong **)(unaff_x29 + -0x78);
                  }
code_r0x000b3358:
                  uVar74 = (uint)uVar53;
                  uVar72 = uVar74;
                  uVar73 = uVar11 - uVar18;
                  if ((int)uVar74 <= (int)uVar71) {
                    uVar72 = uVar71;
                    uVar73 = uVar17;
                  }
                  uVar17 = uVar73;
                  uVar38 = (ulong)uVar72;
                  if (uVar74 == uVar72) goto code_r0x000b2f70;
code_r0x000b3370:
                  uVar53 = uVar38;
                  iVar14 = iVar49 + -1;
                  if (*(short *)(unaff_x26 + (ulong)(uVar18 & 0xffff) * 2) == 1 && iVar23 == 0) {
                    if (iVar61 == 0) {
                      if ((uVar55 & 0xffff) == uVar55 >> 0x10 && (uVar55 & 0xff) == uVar55 >> 0x18)
                      {
                        puVar15 = puVar9;
                        puVar19 = puVar16;
                        if (puVar16 < puVar62) {
                          do {
                            uVar33 = *puVar19 ^ uVar52;
                            if (uVar33 != 0) {
                              uVar33 = (uVar33 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                                       (uVar33 & 0x5555555555555555) << 1;
                              uVar33 = (uVar33 & 0xcccccccccccccccc) >> 2 |
                                       (uVar33 & 0x3333333333333333) << 2;
                              uVar33 = (uVar33 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                                       (uVar33 & 0xf0f0f0f0f0f0f0f) << 4;
                              uVar33 = (uVar33 & 0xff00ff00ff00ff00) >> 8 |
                                       (uVar33 & 0xff00ff00ff00ff) << 8;
                              uVar33 = (uVar33 & 0xffff0000ffff0000) >> 0x10 |
                                       (uVar33 & 0xffff0000ffff) << 0x10;
                              puVar15 = (ulong *)((long)puVar15 +
                                                 ((ulong)LZCOUNT(uVar33 >> 0x20 | uVar33 << 0x20) >>
                                                 3));
                              goto code_r0x000b34d4;
                            }
                            puVar19 = puVar19 + 1;
                            puVar15 = puVar15 + 1;
                          } while (puVar19 < puVar62);
                          puVar41 = *(ulong **)(unaff_x29 + -200);
                          if (puVar19 < puVar41) goto code_r0x000b3488;
                        }
                        else {
                          puVar41 = *(ulong **)(unaff_x29 + -200);
                          puVar15 = puVar16;
                          if (puVar16 < puVar41) {
code_r0x000b3488:
                            lVar12 = (long)puVar41 - (long)puVar15;
                            puVar15 = (ulong *)((long)puVar19 + lVar12);
                            uVar33 = uVar52;
                            do {
                              if ((uint)(byte)*puVar19 != ((uint)uVar33 & 0xff))
                              goto code_r0x000b34b4;
                              puVar19 = (ulong *)((long)puVar19 + 1);
                              uVar33 = uVar33 >> 8;
                              lVar12 = lVar12 + -1;
                            } while (lVar12 != 0);
                            puVar19 = puVar15;
code_r0x000b34b4:
                            param_7 = *(long *)(unaff_x29 + -0x98);
                            puVar15 = puVar19;
                          }
                        }
code_r0x000b34d4:
                        uStack00000000000000b0 = (ulong)(uint)((int)puVar15 - iVar37) + 4;
                        iVar61 = 2;
                        goto code_r0x000b3390;
                      }
                      iVar61 = 1;
                    }
                    else if (iVar61 == 2) {
code_r0x000b3390:
                      uVar71 = uVar18 - 1;
                      if (uVar31 <= uVar71) {
                        if (2 < uVar3 - uVar18) {
                          puVar13 = (uint *)((long)puVar44 +
                                            (ulong)(uVar71 - (int)*(undefined8 *)(unaff_x29 + -0xa8)
                                                   ));
                          puVar28 = (uint *)(*(long *)(unaff_x29 + -0x90) + (ulong)(uVar71 - uVar3))
                          ;
                          if (uVar71 < uVar3) {
                            puVar28 = puVar13;
                          }
                          if (*puVar28 == uVar55) {
                            puVar15 = *(ulong **)(unaff_x29 + -200);
                            if (uVar71 < uVar3) {
                              puVar15 = puVar2;
                            }
                            puVar19 = (ulong *)(puVar28 + 1);
                            puVar41 = puVar19;
                            if (puVar19 < (ulong *)((long)puVar15 - 7U)) {
                              puVar26 = puVar19;
                              do {
                                uVar33 = *puVar41 ^ uVar52;
                                if (uVar33 != 0) {
                                  uVar33 = (uVar33 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                                           (uVar33 & 0x5555555555555555) << 1;
                                  uVar33 = (uVar33 & 0xcccccccccccccccc) >> 2 |
                                           (uVar33 & 0x3333333333333333) << 2;
                                  uVar33 = (uVar33 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                                           (uVar33 & 0xf0f0f0f0f0f0f0f) << 4;
                                  uVar33 = (uVar33 & 0xff00ff00ff00ff00) >> 8 |
                                           (uVar33 & 0xff00ff00ff00ff) << 8;
                                  uVar33 = (uVar33 & 0xffff0000ffff0000) >> 0x10 |
                                           (uVar33 & 0xffff0000ffff) << 0x10;
                                  puVar41 = (ulong *)((long)puVar26 +
                                                     ((ulong)LZCOUNT(uVar33 >> 0x20 | uVar33 << 0x20
                                                                    ) >> 3));
                                  goto code_r0x000b34fc;
                                }
                                puVar41 = puVar41 + 1;
                                puVar26 = puVar26 + 1;
                              } while (puVar41 < (ulong *)((long)puVar15 - 7U));
                            }
                            if (puVar41 < puVar15) {
                              lVar12 = (long)puVar15 - (long)puVar41;
                              uVar33 = uVar52;
                              do {
                                if ((uint)(byte)*puVar41 != ((uint)uVar33 & 0xff))
                                goto code_r0x000b34fc;
                                puVar41 = (ulong *)((long)puVar41 + 1);
                                uVar33 = uVar33 >> 8;
                                lVar12 = lVar12 + -1;
                              } while (lVar12 != 0);
                              puVar41 = puVar15;
                            }
code_r0x000b34fc:
                            uVar38 = (long)puVar41 - (long)puVar19;
                            uVar33 = (uVar38 & 0xffffffff) + 4;
                            if (uVar71 < uVar3) {
                              puVar35 = puVar44;
                              if ((ulong *)((long)puVar13 + uVar33) == puVar2) {
                                uVar34 = uVar52;
                                if ((uVar38 & 3) != 0) {
                                  uVar18 = (int)uVar38 * -8 & 0x1f;
                                  uVar18 = uVar55 >> uVar18 | uVar55 << 0x20 - uVar18;
                                  uVar34 = CONCAT44(uVar18,uVar18);
                                }
                                puVar19 = *(ulong **)(unaff_x29 + -0x90);
                                puVar15 = puVar19;
                                for (; puVar19 < puVar62; puVar19 = puVar19 + 1) {
                                  uVar38 = *puVar19 ^ uVar34;
                                  if (uVar38 != 0) {
                                    uVar38 = (uVar38 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                                             (uVar38 & 0x5555555555555555) << 1;
                                    uVar38 = (uVar38 & 0xcccccccccccccccc) >> 2 |
                                             (uVar38 & 0x3333333333333333) << 2;
                                    uVar38 = (uVar38 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                                             (uVar38 & 0xf0f0f0f0f0f0f0f) << 4;
                                    uVar38 = (uVar38 & 0xff00ff00ff00ff00) >> 8 |
                                             (uVar38 & 0xff00ff00ff00ff) << 8;
                                    uVar38 = (uVar38 & 0xffff0000ffff0000) >> 0x10 |
                                             (uVar38 & 0xffff0000ffff) << 0x10;
                                    puVar15 = (ulong *)((long)puVar15 +
                                                       ((ulong)LZCOUNT(uVar38 >> 0x20 |
                                                                       uVar38 << 0x20) >> 3));
                                    goto code_r0x000b35c0;
                                  }
                                  puVar15 = puVar15 + 1;
                                }
                                if (puVar19 < *(ulong **)(unaff_x29 + -200)) {
                                  lVar12 = (long)*(ulong **)(unaff_x29 + -200) - (long)puVar15;
                                  puVar41 = (ulong *)((long)puVar19 + lVar12);
                                  do {
                                    puVar15 = puVar19;
                                    if ((uint)(byte)*puVar19 != ((uint)uVar34 & 0xff))
                                    goto code_r0x000b35c0;
                                    puVar19 = (ulong *)((long)puVar19 + 1);
                                    uVar34 = uVar34 >> 8;
                                    lVar12 = lVar12 + -1;
                                  } while (lVar12 != 0);
                                  puVar15 = puVar41;
                                }
code_r0x000b35c0:
                                uVar33 = (uint)((int)puVar15 -
                                               (int)*(undefined8 *)(unaff_x29 + -0x90)) + uVar33;
                              }
                            }
                            else {
                              puVar35 = *(uint **)(unaff_x29 + -0x90);
                            }
                            *(uint *)(unaff_x29 + -0x6c) = uVar55;
                            puVar13 = puVar28;
                            do {
                              puVar27 = puVar13;
                              if (puVar27 < puVar35 + 1) break;
                              puVar13 = puVar27 + -1;
                            } while (puVar27[-1] == uVar55);
                            puVar13 = puVar27;
                            if (puVar35 < puVar27) {
                              lVar12 = 0;
                              do {
                                puVar13 = (uint *)((long)puVar27 + lVar12);
                                if (*(char *)((long)puVar13 + -1) !=
                                    *(char *)(*(long *)(unaff_x29 + -0x80) + lVar12))
                                goto code_r0x000b3638;
                                lVar12 = lVar12 + -1;
                              } while (puVar35 < (uint *)((long)puVar27 + lVar12));
                              puVar13 = puVar35;
                            }
code_r0x000b3638:
                            iVar23 = (int)((long)puVar28 - (long)puVar13);
                            param_7 = *(long *)(unaff_x29 + -0x98);
                            if (((uVar3 <= uVar71) &&
                                ((long)puVar28 - ((long)puVar28 - (long)puVar13 & 0xffffffffU) ==
                                 *(long *)(unaff_x29 + -0x90))) &&
                               ((uint)*(undefined8 *)(unaff_x29 + -0xa8) < uVar3)) {
                              uVar72 = iVar23 * 8 & 0x1f;
                              uVar18 = uVar55;
                              if ((-iVar23 & 3U) != 0) {
                                uVar18 = uVar55 >> uVar72 | uVar55 << 0x20 - uVar72;
                              }
                              *(uint *)(unaff_x29 + -0x6c) = uVar18;
                              lVar12 = lVar48;
                              do {
                                lVar20 = lVar12;
                                if (lVar20 < 4) {
                                  puVar13 = (uint *)((long)puVar44 + lVar20);
                                  if (lVar20 < 1) goto code_r0x000b36d0;
                                  break;
                                }
                                lVar12 = lVar20 + -4;
                              } while (*(uint *)((long)puVar44 + lVar20 + -4) == uVar18);
                              pcVar21 = *(char **)(unaff_x29 + -0x80);
                              puVar13 = (uint *)((long)puVar44 + lVar20);
                              do {
                                puVar28 = (uint *)((long)puVar13 + -1);
                                if (*(char *)puVar28 != *pcVar21) goto code_r0x000b36d0;
                                pcVar21 = pcVar21 + -1;
                                puVar13 = puVar28;
                              } while (puVar44 < puVar28);
                              puVar13 = puVar44;
code_r0x000b36d0:
                              iVar23 = (iVar54 - (int)puVar13) + iVar23;
                              param_7 = *(long *)(unaff_x29 + -0x98);
                            }
                            uVar18 = uVar71 - iVar23;
                            if (uVar71 - iVar23 <= uVar31) {
                              uVar18 = uVar31;
                            }
                            uVar38 = uVar33 + (uVar71 - uVar18);
                            if ((uVar33 <= uStack00000000000000b0) &&
                               (uStack00000000000000b0 <= uVar38)) {
                              iVar23 = 0;
                              uVar18 = (uVar71 - (int)uStack00000000000000b0) + (int)uVar33;
                              uVar71 = uVar3;
                              if (2 < uVar3 + ~uVar18) {
                                uVar71 = uVar18;
                              }
                              iVar61 = 2;
                              uVar33 = (ulong)uVar71;
                              goto code_r0x000b2f3c;
                            }
                            if (uVar3 + ~uVar18 < 3) {
                              iVar23 = 0;
                              iVar61 = 2;
                              uVar33 = uVar59;
                            }
                            else {
                              if (uStack00000000000000b0 <= uVar38) {
                                uVar38 = uStack00000000000000b0;
                              }
                              if ((ulong)(long)(int)uVar53 < uVar38) {
                                if ((((long)puVar32 - lVar43) + uVar59) - (ulong)uVar18 >> 0x10 != 0
                                   ) goto code_r0x000b2b04;
                                uVar17 = uVar11 - uVar18;
                                uVar53 = uVar38;
                              }
                              uVar71 = (uint)*(ushort *)(unaff_x26 + (ulong)(uVar18 & 0xffff) * 2);
                              uVar33 = (ulong)(uVar18 - uVar71);
                              if (uVar18 < uVar71) goto code_r0x000b2b04;
                              iVar23 = 0;
                              iVar61 = 2;
                            }
                            goto code_r0x000b2f3c;
                          }
                        }
                        iVar61 = 2;
                      }
                    }
                  }
                  uVar33 = (ulong)(uVar18 - *(ushort *)
                                             (unaff_x26 + (ulong)(iVar23 + uVar18 & 0xffff) * 2));
                }
                else {
code_r0x000b2f60:
                  uVar53 = 0;
                  if (uVar71 != 0) goto code_r0x000b3370;
code_r0x000b2f70:
                  iVar14 = iVar49 + -1;
                  if (uVar11 < (int)uVar38 + uVar18) goto code_r0x000b3370;
                  if ((int)uVar53 < 4) goto code_r0x000b3370;
                  iVar56 = 0;
                  uVar71 = 1;
                  iVar24 = iVar23;
                  iVar10 = 0x10;
                  do {
                    uVar4 = *(ushort *)(unaff_x26 + (ulong)(iVar56 + uVar18 & 0xffff) * 2);
                    uVar72 = (uint)uVar4;
                    bVar5 = uVar72 <= uVar71;
                    if (uVar71 <= uVar72) {
                      uVar71 = (uint)uVar4;
                    }
                    iVar23 = iVar56;
                    if (bVar5) {
                      iVar23 = iVar24;
                    }
                    iVar56 = iVar56 + (iVar10 >> 4);
                    iVar50 = 0x10;
                    if (bVar5) {
                      iVar50 = iVar10 + 1;
                    }
                    iVar24 = iVar23;
                    iVar10 = iVar50;
                  } while (iVar56 < (int)uVar53 + -3);
                  if (uVar71 < 2) {
                    param_7 = *(long *)(unaff_x29 + -0x98);
                    goto code_r0x000b3370;
                  }
                  uVar72 = 0;
                  if (uVar71 <= uVar18) {
                    uVar72 = uVar71;
                  }
                  param_7 = *(long *)(unaff_x29 + -0x98);
                  if (uVar18 < uVar71) goto code_r0x000b2b04;
                  uVar33 = (ulong)(uVar18 - uVar72);
                }
code_r0x000b2f3c:
                iVar14 = iVar49 + -1;
                bVar5 = iVar49 < 2;
                uVar38 = uVar53;
                iVar49 = iVar14;
                if ((uint)uVar33 < uVar31 || bVar5) goto code_r0x000b2b04;
                goto code_r0x000b2f48;
              }
              uVar17 = 0;
              uVar53 = 3;
              iVar14 = in_stack_00000118;
code_r0x000b2b04:
              if (((uVar11 < *(uint *)(unaff_x29 + -0xf0)) && (*(int *)(unaff_x29 + -0xe4) == 1)) &&
                 (0 < iVar14)) {
                lVar43 = (*plVar1 - *(long *)(&UNK_00040008 + lVar60)) +
                         (ulong)*(uint *)(&UNK_00040018 + lVar60);
                uVar18 = *(uint *)(*(long *)(unaff_x29 + -0xb0) +
                                  (ulong)((uint)*puVar32 * -0x61c8864f >> 0x11) * 4);
                iVar23 = (uVar18 + uVar31) - (int)lVar43;
                uVar31 = uVar11 - iVar23;
                if (uVar31 >> 0x10 != 0) goto code_r0x000b2edc;
                unaff_x21 = *(ulong *)(unaff_x29 + -0xf8);
                do {
                  if (iVar14 == 0) break;
                  puVar13 = (uint *)((*(long *)(&UNK_00040008 + lVar60) -
                                     (ulong)*(uint *)(&UNK_00040018 + lVar60)) + (ulong)uVar18);
                  if (*puVar13 == uVar55) {
                    puVar15 = (ulong *)((long)puVar32 + (lVar43 - (ulong)uVar18));
                    puVar19 = *(ulong **)(unaff_x29 + -200);
                    if (puVar15 <= *(ulong **)(unaff_x29 + -200)) {
                      puVar19 = puVar15;
                    }
                    puVar41 = (ulong *)(puVar13 + 1);
                    puVar26 = (ulong *)((long)puVar19 - 7);
                    puVar15 = puVar16;
                    if (puVar16 < puVar26) {
                      uVar33 = *puVar16 ^ *puVar41;
                      if (uVar33 == 0) {
                        puVar41 = (ulong *)(puVar13 + 3);
                        puVar15 = puVar29;
                        goto joined_r0x000b2d18;
                      }
                      uVar33 = (uVar33 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                               (uVar33 & 0x5555555555555555) << 1;
                      uVar33 = (uVar33 & 0xcccccccccccccccc) >> 2 |
                               (uVar33 & 0x3333333333333333) << 2;
                      uVar33 = (uVar33 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                               (uVar33 & 0xf0f0f0f0f0f0f0f) << 4;
                      uVar33 = (uVar33 & 0xff00ff00ff00ff00) >> 8 | (uVar33 & 0xff00ff00ff00ff) << 8
                      ;
                      uVar33 = (uVar33 & 0xffff0000ffff0000) >> 0x10 |
                               (uVar33 & 0xffff0000ffff) << 0x10;
                      iVar49 = (int)((ulong)LZCOUNT(uVar33 >> 0x20 | uVar33 << 0x20) >> 3);
                      param_7 = *(long *)(unaff_x29 + -0x98);
                    }
                    else {
joined_r0x000b2d18:
                      if (puVar15 < puVar26) {
                        iVar49 = *(int *)(unaff_x29 + -0xe0) + (int)puVar15;
                        do {
                          uVar33 = *puVar15 ^ *puVar41;
                          if (uVar33 != 0) {
                            uVar33 = (uVar33 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                                     (uVar33 & 0x5555555555555555) << 1;
                            uVar33 = (uVar33 & 0xcccccccccccccccc) >> 2 |
                                     (uVar33 & 0x3333333333333333) << 2;
                            uVar33 = (uVar33 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                                     (uVar33 & 0xf0f0f0f0f0f0f0f) << 4;
                            uVar33 = (uVar33 & 0xff00ff00ff00ff00) >> 8 |
                                     (uVar33 & 0xff00ff00ff00ff) << 8;
                            uVar33 = (uVar33 & 0xffff0000ffff0000) >> 0x10 |
                                     (uVar33 & 0xffff0000ffff) << 0x10;
                            iVar49 = (int)((ulong)LZCOUNT(uVar33 >> 0x20 | uVar33 << 0x20) >> 3) +
                                     iVar49;
                            param_7 = *(long *)(unaff_x29 + -0x98);
                            unaff_x21 = *(ulong *)(unaff_x29 + -0xf8);
                            goto code_r0x000b2cc4;
                          }
                          puVar15 = puVar15 + 1;
                          puVar41 = puVar41 + 1;
                          iVar49 = iVar49 + 8;
                        } while (puVar15 < puVar26);
                      }
                      if (puVar15 < (ulong *)((long)puVar19 - 3U)) {
                        if ((uint)*puVar41 == (uint)*puVar15) {
                          puVar15 = (ulong *)((long)puVar15 + 4);
                          puVar41 = (ulong *)((long)puVar41 + 4);
                        }
                        param_7 = *(long *)(unaff_x29 + -0x98);
                        if (puVar15 < (ulong *)((long)puVar19 - 1U)) goto code_r0x000b2ce8;
                      }
                      else {
                        param_7 = *(long *)(unaff_x29 + -0x98);
                        if (puVar15 < (ulong *)((long)puVar19 - 1U)) {
code_r0x000b2ce8:
                          if ((short)*puVar41 == (short)*puVar15) {
                            puVar15 = (ulong *)((long)puVar15 + 2);
                            puVar41 = (ulong *)((long)puVar41 + 2);
                          }
                        }
                      }
                      if (puVar15 < puVar19) {
                        if ((char)*puVar41 == (char)*puVar15) {
                          puVar15 = (ulong *)((long)puVar15 + 1);
                        }
                      }
                      iVar49 = (int)puVar15 - iVar37;
                      unaff_x21 = *(ulong *)(unaff_x29 + -0xf8);
                    }
code_r0x000b2cc4:
                    uVar71 = iVar49 + 4U;
                    if ((int)(iVar49 + 4U) <= (int)(uint)uVar53) {
                      uVar71 = (uint)uVar53;
                      uVar31 = uVar17;
                    }
                    uVar17 = uVar31;
                    uVar53 = (ulong)uVar71;
                  }
                  else {
                    param_7 = *(long *)(unaff_x29 + -0x98);
                  }
                  iVar14 = iVar14 + -1;
                  uVar31 = (uint)*(ushort *)
                                  (*(long *)(unaff_x29 + -0xb0) + (ulong)(uVar18 & 0xffff) * 2 +
                                  0x20000);
                  uVar18 = uVar18 - uVar31;
                  iVar23 = iVar23 - uVar31;
                  uVar31 = uVar11 - iVar23;
                } while (uVar31 < 0x10000);
              }
              else {
code_r0x000b2edc:
                unaff_x21 = *(ulong *)(unaff_x29 + -0xf8);
              }
              if ((int)uVar53 < 4) goto code_r0x000b2814;
code_r0x000b4270:
              uVar33 = 0x1200000000;
              if (0x11 < (int)uVar53 - 0x13U || *(int *)(unaff_x29 + -0x88) == 0) {
                uVar33 = uVar53 << 0x20;
              }
              uVar38 = uVar33 >> 0x20;
              unaff_x22 = *(ulong **)(unaff_x29 + -200);
              iVar37 = (int)(uVar33 >> 0x20);
              if (iVar37 == 0) {
                lVar43 = *(long *)(unaff_x29 + -0x90);
              }
              else {
                if ((param_30 < (ulong)((long)uVar33 >> 0x20)) || (0xfff < iVar37 + iVar6)) {
                  unaff_x21 = (ulong)(iVar6 + 1);
                  goto code_r0x000b45b8;
                }
                iVar61 = *(int *)(*(long *)(unaff_x29 + -0xa0) + uVar40 * 0x10 + 0xc);
                iVar23 = iVar61 + 1;
                iVar49 = (iVar61 - 0xfU) / 0xff + iVar23;
                if (iVar61 - 0xeU == 0 || iVar61 < 0xe) {
                  iVar49 = iVar61;
                }
                if (iVar61 < 0xe) {
                  iVar56 = iVar58 - iVar49;
                  iVar14 = iVar23 + iVar56;
                }
                else {
                  iVar56 = iVar58 - iVar49;
                  iVar14 = iVar61 + (iVar61 - 0xeU) / 0xff + 2 + iVar56;
                }
                if (iVar14 < iVar63) {
                  lVar43 = *(long *)(unaff_x29 + -0xa0) + uVar42 * 0x10;
                  *(undefined8 *)(lVar43 + 4) = unaff_d8;
                  *(int *)(lVar43 + 0xc) = iVar23;
                  *piVar22 = iVar14;
                }
                iVar63 = iVar61 + 2;
                if (0xc < iVar61) {
                  iVar63 = iVar61 + (iVar61 - 0xdU) / 0xff + 3;
                }
                piVar22 = (int *)(*(long *)(unaff_x29 + -0xa0) + (uVar40 + 2) * 0x10);
                if (iVar63 + iVar56 < *piVar22) {
                  *(undefined8 *)(piVar22 + 1) = unaff_d8;
                  piVar22[3] = iVar61 + 2;
                  *piVar22 = iVar63 + iVar56;
                }
                iVar63 = iVar61 + 3;
                if (0xb < iVar61) {
                  iVar63 = iVar61 + (iVar61 - 0xcU) / 0xff + 4;
                }
                piVar22 = (int *)(*(long *)(unaff_x29 + -0xa0) + (uVar40 + 3) * 0x10);
                if (iVar63 + iVar56 < *piVar22) {
                  *(undefined8 *)(piVar22 + 1) = unaff_d8;
                  piVar22[3] = iVar61 + 3;
                  *piVar22 = iVar63 + iVar56;
                }
                if (3 < iVar37) {
                  lVar43 = *(long *)(unaff_x29 + -0xa0);
                  iVar63 = *(int *)(lVar43 + uVar40 * 0x10 + 8);
                  uVar33 = 4;
                  piVar22 = piVar46;
                  do {
                    while( true ) {
                      iVar23 = (int)uVar33;
                      if (iVar63 == 1) {
                        if ((long)iVar61 < (long)uVar40) {
                          iVar56 = *(int *)(lVar43 + (long)(iVar6 - iVar61) * 0x10);
                        }
                        else {
                          iVar56 = 0;
                        }
                        iVar14 = iVar49 + 3;
                        if (0x12 < uVar33) {
                          iVar14 = iVar49 + 4 + (iVar23 - 0x13U) / 0xff;
                        }
                        iVar14 = iVar14 + iVar56;
                        iVar56 = iVar61;
                      }
                      else {
                        iVar56 = 0;
                        iVar14 = 3;
                        if (0x12 < uVar33) {
                          iVar14 = (iVar23 - 0x13U) / 0xff + 4;
                        }
                        iVar14 = iVar14 + iVar58;
                      }
                      uVar31 = (uint)unaff_x21;
                      uVar11 = ((int)*(undefined8 *)(unaff_x29 + -0xc0) + iVar23) - 4;
                      if (((int)(uVar31 + 3) < (int)uVar11) ||
                         (iVar14 <= *piVar22 + in_stack_00000158)) break;
                      param_7 = *(long *)(unaff_x29 + -0x98);
                      uVar33 = uVar33 + 1;
                      piVar22 = piVar22 + 4;
                      if (iVar37 + 1 == uVar33) goto code_r0x000b43c4;
                    }
                    if ((int)uVar11 <= (int)uVar31 || uVar38 != uVar33) {
                      uVar11 = uVar31;
                    }
                    unaff_x21 = (ulong)uVar11;
                    piVar22[2] = iVar23;
                    piVar22[3] = iVar56;
                    *piVar22 = iVar14;
                    piVar22[1] = uVar17;
                    param_7 = *(long *)(unaff_x29 + -0x98);
                    uVar33 = uVar33 + 1;
                    piVar22 = piVar22 + 4;
                  } while (iVar37 + 1 != uVar33);
                }
code_r0x000b43c4:
                piVar22 = (int *)(*(long *)(unaff_x29 + -0xa0) + (long)(int)unaff_x21 * 0x10);
                *(undefined8 *)(piVar22 + 5) = unaff_d8;
                iVar63 = *piVar22;
                piVar22[4] = iVar63 + 1;
                *(undefined8 *)(piVar22 + 9) = unaff_d8;
                piVar22[7] = 1;
                piVar22[8] = iVar63 + 2;
                *(undefined8 *)(piVar22 + 0xd) = unaff_d8;
                piVar22[0xf] = 3;
                piVar22[0xb] = 2;
                piVar22[0xc] = iVar63 + 3;
                lVar43 = *(long *)(unaff_x29 + -0x90);
              }
            }
code_r0x000b2834:
            *(int *)(unaff_x29 + -0xe0) = *(int *)(unaff_x29 + -0xe0) + -1;
            puVar9 = (ulong *)((long)puVar9 + 1);
            puVar25 = (ulong *)((long)puVar25 + 1);
            *(long *)(unaff_x29 + -0xc0) = *(long *)(unaff_x29 + -0xc0) + 1;
            piVar46 = piVar46 + 4;
            uVar33 = (long)(int)unaff_x21;
            uVar40 = uVar42;
          } while ((long)uVar42 < (long)(int)unaff_x21);
        }
        lVar60 = *(long *)(unaff_x29 + -0xa0) + uVar33 * 0x10;
        uVar17 = *(uint *)(lVar60 + 4);
        uVar30 = *(uint *)(lVar60 + 8);
        uVar38 = (ulong)uVar30;
        uVar40 = (ulong)((int)unaff_x21 - uVar30);
code_r0x000b45b8:
        param_6 = -0x61c8864f;
        param_4 = 0xffff;
        do {
          iVar63 = (int)uVar40;
          lVar60 = *(long *)(unaff_x29 + -0xa0) + (long)iVar63 * 0x10;
          uVar30 = *(uint *)(lVar60 + 4);
          uVar11 = *(uint *)(lVar60 + 8);
          *(uint *)(lVar60 + 4) = uVar17;
          *(int *)(lVar60 + 8) = (int)uVar38;
          uVar40 = (ulong)(iVar63 - uVar11);
          uVar38 = (ulong)uVar11;
          uVar17 = uVar30;
        } while ((int)uVar11 <= iVar63);
        if ((int)unaff_x21 < 1) {
          unaff_w30 = 0x10;
          puVar9 = unaff_x24;
          in_w15 = in_stack_00000168._4_4_;
        }
        else {
          iVar63 = 0;
          *(ulong *)(unaff_x29 + -0xf8) = unaff_x21;
          do {
            while( true ) {
              param_6 = -0x61c8864f;
              unaff_w30 = 0x10;
              param_4 = 0xffff;
              lVar60 = *(long *)(unaff_x29 + -0xa0) + (long)iVar63 * 0x10;
              uVar30 = *(uint *)(lVar60 + 8);
              uVar59 = (ulong)uVar30;
              if (uVar30 == 1) break;
              unaff_w25 = *(uint *)(lVar60 + 4);
              puVar62 = (ulong *)(pcVar8 + 1);
              uVar33 = (long)unaff_x24 - (long)in_x13;
              if ((in_stack_00000168._4_4_ != 0) &&
                 (in_w15 = in_stack_00000168._4_4_,
                 in_stack_000000e8 < (char *)((long)puVar62 + uVar33 + uVar33 / 0xff + 8)))
              goto code_r0x000b49e4;
              uVar40 = uVar33 - 0xf;
              if (uVar33 < 0xf) {
                *pcVar8 = (char)((int)uVar33 << 4);
              }
              else {
                *pcVar8 = -0x10;
                puVar9 = puVar62;
                if (0xfe < uVar40) {
                  uVar40 = (uVar33 - 0x10e) / 0xff;
                  _memset(puVar62,0xff,uVar40 + 1);
                  in_s23 = 4;
                  in_register_000052e4 = 4;
                  in_register_000052e8 = 4;
                  in_register_000052ec = 4;
                  in_s21 = -0x13;
                  in_register_000052a4 = -0x13;
                  in_register_000052a8 = -0x13;
                  in_register_000052ac = -0x13;
                  unaff_x22 = *(ulong **)(unaff_x29 + -200);
                  param_7 = *(long *)(unaff_x29 + -0x98);
                  puVar9 = (ulong *)(pcVar8 + uVar40 + 2);
                  uVar40 = (uVar33 - 0x10e) % 0xff;
                  in_d20 = param_27;
                  in_register_00005288 = param_28;
                  in_d22 = param_25;
                  in_register_000052c8 = param_26;
                }
                puVar62 = (ulong *)((long)puVar9 + 1);
                *(char *)puVar9 = (char)uVar40;
              }
              puVar9 = (ulong *)((long)puVar62 + uVar33);
              puVar25 = (ulong *)((char *)((long)puVar62 + (long)unaff_x24) + -(long)in_x13);
              if ((char *)((long)puVar62 + (long)unaff_x24) + -(long)in_x13 <= puVar62 + 1) {
                puVar25 = puVar62 + 1;
              }
              puVar47 = in_x13;
              puVar36 = puVar62;
              if (((char *)((long)puVar25 + ~(ulong)puVar62) < &segment_command_00000020.vmaddr) ||
                 ((ulong)((long)puVar62 - (long)in_x13) < 0x40)) {
code_r0x000b4794:
                do {
                  puVar25 = puVar36 + 1;
                  *puVar36 = *puVar47;
                  puVar47 = puVar47 + 1;
                  puVar36 = puVar25;
                } while (puVar25 < puVar9);
              }
              else {
                uVar40 = ((long)puVar25 + ~(ulong)puVar62 >> 3) + 1;
                uVar38 = uVar40 & 0x3ffffffffffffff8;
                puVar25 = in_x13 + 4;
                puVar47 = puVar62 + 4;
                uVar42 = uVar38;
                do {
                  uVar64 = puVar25[-4];
                  uVar53 = puVar25[-1];
                  uVar52 = puVar25[-2];
                  uVar34 = *puVar25;
                  uVar11 = *(uint *)((long)puVar25 + 4);
                  uVar45 = puVar25[1];
                  uVar3 = *(uint *)((long)puVar25 + 0xc);
                  uVar66 = puVar25[3];
                  uVar65 = puVar25[2];
                  puVar47[-3] = puVar25[-3];
                  puVar47[-4] = uVar64;
                  puVar47[-1] = uVar53;
                  puVar47[-2] = uVar52;
                  *(uint *)(puVar47 + 1) = (uint)uVar45;
                  *(uint *)((long)puVar47 + 0xc) = uVar3;
                  *(uint *)puVar47 = (uint)uVar34;
                  *(uint *)((long)puVar47 + 4) = uVar11;
                  puVar47[3] = uVar66;
                  puVar47[2] = uVar65;
                  uVar42 = uVar42 - 8;
                  puVar25 = puVar25 + 8;
                  puVar47 = puVar47 + 8;
                } while (uVar42 != 0);
                puVar47 = in_x13 + uVar38;
                puVar36 = puVar62 + uVar38;
                if (uVar40 != uVar38) goto code_r0x000b4794;
              }
              lVar60 = (long)(int)uVar30;
              in_stack_00000110 = (char *)((long)puVar9 + 2);
              *(short *)puVar9 = (short)unaff_w25;
              uVar40 = lVar60 - 4;
              if ((in_stack_00000168._4_4_ != 0) &&
                 (in_stack_000000e8 < in_stack_00000110 + uVar40 / 0xff + 6)) {
                in_w15 = in_stack_00000168._4_4_;
                goto code_r0x000b49e4;
              }
              if (uVar40 < 0xf) {
                *pcVar8 = *pcVar8 + (char)uVar40;
                puVar62 = *(ulong **)(unaff_x29 + -0x78);
                unaff_x21 = *(ulong *)(unaff_x29 + -0xf8);
              }
              else {
                *pcVar8 = *pcVar8 + '\x0f';
                uVar59 = lVar60 - 0x13;
                if (0x1fd < uVar59) {
                  lVar43 = ((lVar60 - 0x211U) / 0x1fe) * 2;
                  _memset(in_stack_00000110,0xff,lVar43 + 2);
                  in_s23 = 4;
                  in_register_000052e4 = 4;
                  in_register_000052e8 = 4;
                  in_register_000052ec = 4;
                  in_s21 = -0x13;
                  in_register_000052a4 = -0x13;
                  in_register_000052a8 = -0x13;
                  in_register_000052ac = -0x13;
                  param_7 = *(long *)(unaff_x29 + -0x98);
                  in_stack_00000110 = (char *)((long)puVar62 + lVar43 + uVar33 + 4);
                  uVar59 = (lVar60 - 0x211U) % 0x1fe;
                  unaff_x22 = *(ulong **)(unaff_x29 + -200);
                  in_d20 = param_27;
                  in_register_00005288 = param_28;
                  in_d22 = param_25;
                  in_register_000052c8 = param_26;
                }
                puVar62 = *(ulong **)(unaff_x29 + -0x78);
                unaff_x21 = *(ulong *)(unaff_x29 + -0xf8);
                pcVar8 = in_stack_00000110;
                if (0xfe < uVar59) {
                  pcVar8 = in_stack_00000110 + 1;
                  *in_stack_00000110 = -1;
                  uVar59 = uVar59 - 0xff;
                }
                in_stack_00000110 = pcVar8 + 1;
                *pcVar8 = (char)uVar59;
              }
              param_6 = -0x61c8864f;
              unaff_w30 = 0x10;
              param_4 = 0xffff;
              iVar63 = uVar30 + iVar63;
              in_x13 = (ulong *)((long)unaff_x24 + lVar60);
              pcVar8 = in_stack_00000110;
              unaff_x24 = in_x13;
              puVar9 = in_x13;
              in_w15 = in_stack_00000168._4_4_;
              if ((int)unaff_x21 <= iVar63) goto LAB_000b1698;
            }
            unaff_x24 = (ulong *)((long)unaff_x24 + 1);
            iVar63 = iVar63 + 1;
            in_stack_00000110 = pcVar8;
            puVar9 = unaff_x24;
            in_w15 = in_stack_00000168._4_4_;
          } while (iVar63 < (int)unaff_x21);
        }
        goto LAB_000b1698;
      }
      puVar62 = (ulong *)(in_stack_00000110 + 1);
      if ((in_stack_00000168._4_4_ != 0) &&
         (in_stack_000000e8 < (char *)((long)puVar62 + unaff_x28 + unaff_x28 / 0xff + 8))) {
        uVar59 = unaff_x21;
        in_w15 = in_stack_00000168._4_4_;
        goto code_r0x000b49e4;
      }
      uVar59 = unaff_x28 - 0xf;
      if (unaff_x28 < 0xf) {
        *in_stack_00000110 = (char)(uVar30 << 4);
      }
      else {
        *in_stack_00000110 = -0x10;
        puVar9 = puVar62;
        if (0xfe < uVar59) {
          uVar59 = (unaff_x28 - 0x10e) / 0xff;
          _memset(puVar62,0xff,uVar59 + 1);
          in_s23 = 4;
          in_register_000052e4 = 4;
          in_register_000052e8 = 4;
          in_register_000052ec = 4;
          in_s21 = -0x13;
          in_register_000052a4 = -0x13;
          in_register_000052a8 = -0x13;
          in_register_000052ac = -0x13;
          unaff_w30 = 0x10;
          param_7 = *(long *)(unaff_x29 + -0x98);
          unaff_x24 = *(ulong **)(unaff_x29 + -0xd8);
          puVar9 = (ulong *)(in_stack_00000110 + uVar59 + 2);
          uVar59 = (unaff_x28 - 0x10e) % 0xff;
          in_d20 = param_27;
          in_register_00005288 = param_28;
          in_d22 = param_25;
          in_register_000052c8 = param_26;
        }
        puVar62 = (ulong *)((long)puVar9 + 1);
        *(char *)puVar9 = (char)uVar59;
      }
      param_6 = -0x61c8864f;
      param_4 = 0xffff;
      param_1 = (ulong *)((long)puVar62 + unaff_x28);
      puVar9 = (ulong *)((char *)((long)puVar62 + (long)unaff_x24) + -(long)in_x13);
      if ((char *)((long)puVar62 + (long)unaff_x24) + -(long)in_x13 <= puVar62 + 1) {
        puVar9 = puVar62 + 1;
      }
      in_stack_00000138 = in_x13;
      unaff_x19 = puVar62;
      in_w15 = in_stack_00000168._4_4_;
    } while (((char *)((long)puVar9 + ~(ulong)puVar62) < &segment_command_00000020.vmaddr) ||
            ((ulong)((long)puVar62 - (long)in_x13) < 0x40));
    in_x10 = ((long)puVar9 + ~(ulong)puVar62 >> 3) + 1;
    in_x11 = in_x10 & 0x3ffffffffffffff8;
  } while( true );
}

