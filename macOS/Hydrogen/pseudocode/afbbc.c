
/* WARNING: Removing unreachable block (ram,0x000af684) */
/* WARNING: Removing unreachable block (ram,0x000ae66c) */
/* WARNING: Type propagation algorithm not settling */

int FUN_000afbbc(ulong param_1,ulong param_2,ulong param_3)

{
  uint *puVar1;
  int iVar2;
  uint uVar3;
  uint uVar4;
  ushort uVar5;
  long lVar6;
  long lVar7;
  bool bVar8;
  bool bVar9;
  uint uVar10;
  uint uVar11;
  ulong *puVar12;
  ulong *puVar13;
  ulong uVar14;
  char *pcVar15;
  char *pcVar16;
  char *pcVar17;
  uint uVar18;
  uint uVar19;
  int iVar20;
  ulong *puVar21;
  ulong *puVar22;
  ulong *puVar23;
  ulong *puVar24;
  ulong *puVar25;
  uint uVar26;
  int iVar27;
  ulong *puVar28;
  int in_w6;
  uint *puVar29;
  uint uVar30;
  int iVar31;
  uint uVar32;
  uint in_w8;
  int iVar33;
  uint uVar34;
  long lVar35;
  uint uVar36;
  int iVar37;
  int iVar38;
  ulong *puVar39;
  long lVar40;
  ulong uVar41;
  ulong uVar42;
  int iVar43;
  ulong uVar44;
  ulong *puVar45;
  ulong *in_x15;
  int iVar46;
  long lVar47;
  ulong uVar48;
  ulong *in_x16;
  uint uVar49;
  ulong uVar50;
  ulong *puVar51;
  ulong uVar52;
  long lVar53;
  ulong *puVar54;
  ulong *unaff_x20;
  ulong *unaff_x21;
  ulong unaff_x22;
  long unaff_x23;
  ulong uVar55;
  long lVar56;
  long lVar57;
  char *unaff_x26;
  ulong unaff_x27;
  ulong *unaff_x28;
  long unaff_x29;
  int unaff_w30;
  ulong uVar58;
  ulong uVar59;
  ulong uVar60;
  uint uStack0000000000000050;
  ulong *in_stack_00000058;
  ulong *in_stack_00000060;
  long in_stack_00000068;
  ulong *in_stack_00000078;
  long in_stack_00000080;
  char *in_stack_000000a0;
  char *in_stack_000000b8;
  ulong *puStack00000000000000c8;
  ulong *in_stack_000000e0;
  int *in_stack_000000f0;
  undefined2 uStack0000000000000118;
  ulong uStack0000000000000138;
  ulong *puStack0000000000000148;
  ulong in_stack_00000150;
  int in_stack_00000160;
  undefined8 in_stack_00000168;
  
code_r0x000afbbc:
  uVar30 = in_w8 & ((int)in_w8 >> 0x1f ^ 0xffffffffU);
  param_1 = (ulong)((int)param_1 - uVar30);
  unaff_x21 = (ulong *)((long)unaff_x21 + (ulong)uVar30);
  puStack00000000000000c8 = in_x15;
LAB_000afbd8:
  puVar51 = (ulong *)(in_stack_000000b8 + 1);
  uVar52 = (long)in_x16 - (long)puStack00000000000000c8;
  if ((in_w6 == 0) || ((char *)((long)puVar51 + uVar52 + uVar52 / 0xff + 8) <= in_stack_000000a0)) {
    uVar55 = uVar52 - 0xf;
    if (uVar52 < 0xf) {
      *in_stack_000000b8 = (char)((int)uVar52 << 4);
      uVar55 = param_2;
    }
    else {
      *in_stack_000000b8 = -0x10;
      puVar54 = puVar51;
      if (0xfe < uVar55) {
        *(ulong *)(unaff_x29 + -0xa0) = uVar52 - 0x10e;
        uVar55 = (uVar52 - 0x10e) / 0xff;
        *(int *)(unaff_x29 + -0x90) = (int)param_3;
        _memset(puVar51,0xff,uVar55 + 1);
        param_2 = param_2 & 0xffffffff;
        param_3 = (ulong)*(uint *)(unaff_x29 + -0x90);
        unaff_w30 = -0x61c8864f;
        puVar54 = (ulong *)(in_stack_000000b8 + uVar55 + 2);
        uVar55 = uVar55 * -0xff + *(long *)(unaff_x29 + -0xa0);
        puStack00000000000000c8 = in_stack_00000078;
        in_x16 = in_stack_000000e0;
        in_w6 = in_stack_00000168._4_4_;
      }
      puVar51 = (ulong *)((long)puVar54 + 1);
      *(char *)puVar54 = (char)uVar55;
      uVar55 = param_2;
    }
    puVar54 = (ulong *)((long)puVar51 + uVar52);
    puVar25 = (ulong *)((char *)((long)puVar51 + (long)in_x16) + -(long)puStack00000000000000c8);
    if ((char *)((long)puVar51 + (long)in_x16) + -(long)puStack00000000000000c8 <= puVar51 + 1) {
      puVar25 = puVar51 + 1;
    }
    puVar22 = puStack00000000000000c8;
    puVar28 = puVar51;
    if ((segment_command_00000020.segname + 0xf < (char *)((long)puVar25 + ~(ulong)puVar51)) &&
       (0x3f < (ulong)((long)puVar51 - (long)puStack00000000000000c8))) {
      uVar52 = ((long)puVar25 + ~(ulong)puVar51 >> 3) + 1;
      uVar41 = uVar52 & 0x3ffffffffffffff8;
      puVar25 = puStack00000000000000c8 + 4;
      puVar22 = puVar51 + 4;
      uVar42 = uVar41;
      do {
        uVar14 = puVar25[-4];
        uVar48 = puVar25[-1];
        uVar44 = puVar25[-2];
        uVar50 = puVar25[1];
        uVar58 = *puVar25;
        uVar60 = puVar25[3];
        uVar59 = puVar25[2];
        puVar22[-3] = puVar25[-3];
        puVar22[-4] = uVar14;
        puVar22[-1] = uVar48;
        puVar22[-2] = uVar44;
        puVar22[1] = uVar50;
        *puVar22 = uVar58;
        puVar22[3] = uVar60;
        puVar22[2] = uVar59;
        uVar42 = uVar42 - 8;
        puVar25 = puVar25 + 8;
        puVar22 = puVar22 + 8;
      } while (uVar42 != 0);
      puVar22 = puStack00000000000000c8 + uVar41;
      puVar28 = puVar51 + uVar41;
      if (uVar52 == uVar41) goto LAB_000afd38;
    }
    do {
      puVar25 = puVar28 + 1;
      *puVar28 = *puVar22;
      puVar22 = puVar22 + 1;
      puVar28 = puVar25;
    } while (puVar25 < puVar54);
LAB_000afd38:
    pcVar15 = (char *)((long)puVar54 + 2);
    *(undefined2 *)puVar54 = uStack0000000000000118;
    lVar53 = (long)(int)uStack0000000000000050;
    uVar52 = lVar53 - 4;
    if ((in_w6 == 0) || (pcVar15 + uVar52 / 0xff + 6 <= in_stack_000000a0)) {
      if (uVar52 < 0xf) {
        *in_stack_000000b8 = *in_stack_000000b8 + (char)uVar52;
      }
      else {
        *in_stack_000000b8 = *in_stack_000000b8 + '\x0f';
        uVar52 = lVar53 - 0x13;
        if (0x1fd < uVar52) {
          *(ulong *)(unaff_x29 + -0xa0) = lVar53 - 0x211U;
          uVar52 = (lVar53 - 0x211U) / 0x1fe;
          lVar57 = uVar52 * 2;
          *(int *)(unaff_x29 + -0x90) = (int)param_3;
          *(ulong **)(unaff_x29 + -0xa8) = puVar51;
          _memset(pcVar15,0xff,lVar57 + 2);
          uVar55 = uVar55 & 0xffffffff;
          param_3 = (ulong)*(uint *)(unaff_x29 + -0x90);
          unaff_w30 = -0x61c8864f;
          pcVar15 = (char *)((long)in_stack_000000e0 +
                            *(long *)(unaff_x29 + -0xa8) + (lVar57 - (long)puStack00000000000000c8)
                            + 4);
          uVar52 = *(long *)(unaff_x29 + -0xa0) + uVar52 * -0x1fe;
          in_x16 = in_stack_000000e0;
          in_w6 = in_stack_00000168._4_4_;
        }
        pcVar16 = pcVar15;
        if (0xfe < uVar52) {
          pcVar16 = pcVar15 + 1;
          *pcVar15 = -1;
          uVar52 = uVar52 - 0xff;
        }
        pcVar15 = pcVar16 + 1;
        *pcVar16 = (char)uVar52;
      }
      in_stack_00000078 = (ulong *)((long)in_x16 + lVar53);
      _uStack0000000000000050 = param_1;
      in_x16 = unaff_x21;
      puStack0000000000000148 = unaff_x20;
      in_stack_000000b8 = pcVar15;
LAB_000aeb94:
      uStack0000000000000118 = (undefined2)uVar55;
      uVar30 = uStack0000000000000050;
      if (0x11 < (int)uStack0000000000000050) {
        uVar30 = 0x12;
      }
      lVar53 = (long)(int)uStack0000000000000050;
      puStack00000000000000c8 = (ulong *)((long)in_x16 + lVar53);
      uVar52 = unaff_x27;
      do {
        param_1 = unaff_x22;
        param_2 = param_3;
        iVar43 = (int)in_x16;
        if ((long)puStack0000000000000148 - (long)in_x16 < 0x12) {
          iVar33 = (int)param_1;
          uVar11 = (iVar33 + (int)((long)puStack0000000000000148 - (long)in_x16)) - 4;
          if ((uint *)((long)in_x16 + (long)(int)uVar30) <=
              (uint *)((long)puStack0000000000000148 + (long)iVar33 + -4)) {
            uVar11 = uVar30;
          }
          uVar11 = uVar11 + (iVar43 - (int)puStack0000000000000148);
          uVar11 = uVar11 & ((int)uVar11 >> 0x1f ^ 0xffffffffU);
          param_1 = (ulong)(iVar33 - uVar11);
          unaff_x21 = (ulong *)((long)puStack0000000000000148 + (ulong)uVar11);
        }
        else {
          unaff_x21 = puStack0000000000000148;
        }
        uVar11 = (uint)param_1;
        lVar57 = (long)(int)uVar11;
        puVar51 = (ulong *)((long)unaff_x21 + lVar57);
        iVar33 = (int)unaff_x21;
        unaff_x27 = uVar52;
        if (unaff_x28 < puVar51) {
          param_3 = 0;
          unaff_x22 = 0;
        }
        else {
          puVar29 = (uint *)((long)puVar51 - 3);
          uVar49 = *puVar29;
          lVar35 = *(long *)(unaff_x29 + -0xb8);
          puVar54 = *(ulong **)(lVar35 + 8);
          uVar34 = *(uint *)(lVar35 + 0x18);
          uVar42 = (ulong)uVar34;
          uVar18 = *(uint *)(lVar35 + 0x1c);
          uVar36 = uVar34 + (int)((long)puVar29 - (long)puVar54);
          *(ulong *)(unaff_x29 + -0xa0) = (ulong)uVar18;
          uVar10 = uVar18;
          if (uVar18 + 0x10000 <= uVar36) {
            uVar10 = uVar36 - 0xffff;
          }
          uVar41 = (ulong)*(uint *)(lVar35 + 0x20);
          lVar47 = *(long *)(unaff_x29 + -0x98);
          uVar19 = uVar49;
          if (*(uint *)(lVar35 + 0x20) < uVar36) {
            do {
              lVar35 = (ulong)((uint)(*(int *)((long)puVar54 + (uVar41 - uVar42)) * unaff_w30) >>
                              0x11) * 4;
              uVar19 = (int)uVar41 - *(int *)(lVar47 + lVar35);
              if (0xfffe < uVar19) {
                uVar19 = 0xffff;
              }
              *(short *)(unaff_x23 + (uVar41 & 0xffff) * 2) = (short)uVar19;
              *(int *)(lVar47 + lVar35) = (int)uVar41;
              uVar41 = uVar41 + 1;
            } while (uVar41 < uVar36);
            uVar19 = *puVar29;
          }
          lVar35 = *(long *)(unaff_x29 + -0xb8);
          *(undefined8 *)(unaff_x29 + -0xd8) = *(undefined8 *)(lVar35 + 0x28);
          puVar25 = *(ulong **)(lVar35 + 0x10);
          *(uint *)(lVar35 + 0x20) = uVar36;
          uVar19 = *(uint *)(lVar47 + (ulong)(uVar19 * unaff_w30 >> 0x11) * 4);
          uVar41 = (ulong)uVar19;
          bVar8 = true;
          bVar9 = false;
          if (uVar10 <= uVar19) {
            bVar9 = SBORROW4((int)uVar52,1);
            bVar8 = (int)uVar52 + -1 < 0;
          }
          *(long *)(unaff_x29 + -0xb0) = (long)puVar29 - (long)unaff_x21;
          *(uint **)(unaff_x29 + -0xa8) = puVar29;
          unaff_x22 = param_1;
          if (bVar8 == bVar9) {
            iVar46 = 0;
            param_3 = 0;
            *(undefined4 *)(unaff_x29 + -0x90) = 0;
            lVar35 = uVar42 - *(long *)(unaff_x29 + -0xa0);
            puVar28 = (ulong *)((long)puVar25 + lVar35);
            *(long *)(unaff_x29 + -0xc0) = (long)unaff_x21 + -1;
            *(long *)(unaff_x29 + -0xe0) = (long)unaff_x21 - (long)puVar29;
            puVar22 = (ulong *)((long)puVar51 + 1);
            *(uint *)(unaff_x29 + -200) = uVar34 - 4;
            *(uint *)(unaff_x29 + -0xf0) =
                 (uint)((uVar49 & 0xffff) == uVar49 >> 0x10 && (uVar49 & 0xff) == uVar49 >> 0x18);
            *(uint *)(unaff_x29 + -0xf8) = ~(uVar11 + iVar33);
            uStack0000000000000138 = 0;
            *(long *)(unaff_x29 + -0xd0) = -(long)(int)((long)puVar29 - (long)unaff_x21);
            uVar14 = CONCAT44(uVar49,uVar49);
code_r0x000af134:
            uVar32 = (uint)uVar41;
            uVar19 = uVar34 - uVar32;
            iVar37 = (int)uVar52;
            iVar20 = (int)puVar22;
            uVar26 = (uint)unaff_x22;
            if (uVar34 < uVar32 || uVar19 == 0) {
              uVar52 = (ulong)(uVar32 - uVar34);
              puVar1 = (uint *)((long)puVar54 + uVar52);
              if ((*(short *)(*(long *)(unaff_x29 + -0xc0) + (long)(int)uVar26) !=
                   *(short *)((long)puVar1 + *(long *)(unaff_x29 + -0xd0) + (long)(int)uVar26 + -1))
                 || (*puVar1 != uVar49)) goto code_r0x000af500;
              if ((int)*(undefined8 *)(unaff_x29 + -0xb0) == 0) {
                iVar38 = 0;
                if (puVar22 < unaff_x28) goto code_r0x000af70c;
code_r0x000af360:
                puVar21 = (ulong *)(puVar1 + 1);
                puVar23 = puVar22;
joined_r0x000af738:
                if (puVar23 < unaff_x28) {
                  iVar31 = *(int *)(unaff_x29 + -0xf8) + (int)puVar23;
                  do {
                    uVar52 = *puVar23 ^ *puVar21;
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
                      iVar31 = (int)((ulong)LZCOUNT(uVar52 >> 0x20 | uVar52 << 0x20) >> 3) + iVar31;
                      goto code_r0x000af7d4;
                    }
                    puVar23 = puVar23 + 1;
                    puVar21 = puVar21 + 1;
                    iVar31 = iVar31 + 8;
                  } while (puVar23 < unaff_x28);
                }
                if (puVar23 < in_stack_00000060) {
                  if ((uint)*puVar21 == (uint)*puVar23) {
                    puVar23 = (ulong *)((long)puVar23 + 4);
                    puVar21 = (ulong *)((long)puVar21 + 4);
                  }
                  if (puVar23 < in_stack_00000058) goto code_r0x000afb00;
code_r0x000af79c:
                  if (puVar23 < *(ulong **)(unaff_x29 + -0x88)) {
code_r0x000af7a8:
                    if ((char)*puVar21 == (char)*puVar23) {
                      puVar23 = (ulong *)((long)puVar23 + 1);
                    }
                  }
                }
                else {
                  if (in_stack_00000058 <= puVar23) goto code_r0x000af79c;
code_r0x000afb00:
                  if ((short)*puVar21 == (short)*puVar23) {
                    puVar23 = (ulong *)((long)puVar23 + 2);
                    puVar21 = (ulong *)((long)puVar21 + 2);
                  }
                  if (puVar23 < *(ulong **)(unaff_x29 + -0x88)) goto code_r0x000af7a8;
                }
                iVar31 = (int)puVar23 - iVar20;
              }
              else {
                lVar47 = *(long *)(unaff_x29 + -0xe0);
                if (lVar47 <= (long)-uVar52) {
                  lVar47 = -uVar52;
                }
                iVar31 = (int)lVar47;
                if (iVar31 < -3) {
                  lVar47 = 0;
                  do {
                    uVar4 = *(uint *)((long)puVar1 + lVar47 + -4) ^
                            *(uint *)((long)puVar51 + lVar47 + -7);
                    if (uVar4 != 0) {
                      unaff_x27 = *(ulong *)(unaff_x29 + -0x80);
                      unaff_x26 = *(char **)(unaff_x29 + -0x78);
                      iVar38 = (int)lVar47 - ((uint)LZCOUNT(uVar4) >> 3);
                      goto joined_r0x000af8bc;
                    }
                    lVar47 = lVar47 + -4;
                  } while ((long)iVar31 + 3 < lVar47);
                  unaff_x27 = *(ulong *)(unaff_x29 + -0x80);
                  unaff_x26 = *(char **)(unaff_x29 + -0x78);
                }
                else {
                  lVar47 = 0;
                }
                iVar27 = (int)lVar47;
                lVar47 = (long)iVar27;
                iVar2 = iVar27;
                if (iVar31 <= iVar27) {
                  iVar2 = iVar31;
                }
                iVar27 = iVar27 + 1;
                do {
                  iVar38 = iVar2;
                  if (lVar47 <= iVar31) break;
                  lVar56 = lVar47 + lVar57 + -4;
                  lVar40 = lVar47 + (uVar52 - 1);
                  lVar47 = lVar47 + -1;
                  iVar27 = iVar27 + -1;
                  iVar38 = iVar27;
                } while (*(char *)((long)unaff_x21 + lVar56) == *(char *)((long)puVar54 + lVar40));
joined_r0x000af8bc:
                if (unaff_x28 <= puVar22) goto code_r0x000af360;
code_r0x000af70c:
                uVar52 = *puVar22 ^ *(ulong *)(puVar1 + 1);
                if (uVar52 == 0) {
                  puVar21 = (ulong *)(puVar1 + 3);
                  puVar23 = (ulong *)((long)puVar51 + 9U);
                  goto joined_r0x000af738;
                }
                uVar52 = (uVar52 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar52 & 0x5555555555555555) << 1;
                uVar52 = (uVar52 & 0xcccccccccccccccc) >> 2 | (uVar52 & 0x3333333333333333) << 2;
                uVar52 = (uVar52 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar52 & 0xf0f0f0f0f0f0f0f) << 4;
                uVar52 = (uVar52 & 0xff00ff00ff00ff00) >> 8 | (uVar52 & 0xff00ff00ff00ff) << 8;
                uVar52 = (uVar52 & 0xffff0000ffff0000) >> 0x10 | (uVar52 & 0xffff0000ffff) << 0x10;
                iVar31 = (int)((ulong)LZCOUNT(uVar52 >> 0x20 | uVar52 << 0x20) >> 3);
              }
code_r0x000af7d4:
              uVar4 = (iVar31 - iVar38) + 4;
              if ((int)uVar4 <= (int)uVar26) {
                iVar38 = *(int *)(unaff_x29 + -0x90);
              }
              *(int *)(unaff_x29 + -0x90) = iVar38;
              uVar3 = uVar36 - uVar32;
              if ((int)uVar4 <= (int)uVar26) {
                uVar3 = (uint)param_3;
              }
              param_3 = (ulong)uVar3;
              if ((int)uVar4 <= (int)uVar26) {
                uVar4 = uVar26;
              }
              unaff_x22 = (ulong)uVar4;
              uVar5 = *(ushort *)(unaff_x23 + (ulong)(uVar32 & 0xffff) * 2);
              iVar38 = (int)unaff_x27;
joined_r0x000af804:
              uVar26 = (uint)uVar5;
              uVar52 = (ulong)(iVar37 - 1);
              if (0x80 < iVar38) goto code_r0x000af514;
code_r0x000af808:
              uVar41 = (ulong)(uVar32 - uVar26);
            }
            else {
              if (uVar32 <= *(uint *)(unaff_x29 + -200)) {
                uVar52 = (ulong)(uVar32 - (int)*(undefined8 *)(unaff_x29 + -0xa0));
                puVar1 = (uint *)((long)puVar25 + uVar52);
                if (*puVar1 != uVar49) {
                  unaff_x27 = *(ulong *)(unaff_x29 + -0x80);
                  uVar5 = *(ushort *)(unaff_x23 + (ulong)(uVar32 & 0xffff) * 2);
                  iVar38 = (int)unaff_x27;
                  goto joined_r0x000af804;
                }
                puVar23 = (ulong *)(*(long *)(unaff_x29 + -0xa8) + (ulong)uVar19);
                puVar21 = *(ulong **)(unaff_x29 + -0x88);
                if (puVar23 <= *(ulong **)(unaff_x29 + -0x88)) {
                  puVar21 = puVar23;
                }
                puVar13 = (ulong *)(puVar1 + 1);
                puVar45 = (ulong *)((long)puVar21 - 7);
                puVar12 = puVar22;
                if (puVar22 < puVar45) {
                  uVar41 = *puVar22 ^ *puVar13;
                  if (uVar41 == 0) {
                    puVar13 = (ulong *)(puVar1 + 3);
                    puVar12 = (ulong *)((long)puVar51 + 9U);
                    goto joined_r0x000afb44;
                  }
                  uVar41 = (uVar41 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar41 & 0x5555555555555555) << 1;
                  uVar41 = (uVar41 & 0xcccccccccccccccc) >> 2 | (uVar41 & 0x3333333333333333) << 2;
                  uVar41 = (uVar41 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar41 & 0xf0f0f0f0f0f0f0f) << 4;
                  uVar41 = (uVar41 & 0xff00ff00ff00ff00) >> 8 | (uVar41 & 0xff00ff00ff00ff) << 8;
                  uVar41 = (uVar41 & 0xffff0000ffff0000) >> 0x10 | (uVar41 & 0xffff0000ffff) << 0x10
                  ;
                  iVar38 = (int)((ulong)LZCOUNT(uVar41 >> 0x20 | uVar41 << 0x20) >> 3);
                }
                else {
joined_r0x000afb44:
                  if (puVar12 < puVar45) {
                    iVar38 = *(int *)(unaff_x29 + -0xf8) + (int)puVar12;
                    do {
                      uVar41 = *puVar12 ^ *puVar13;
                      if (uVar41 != 0) {
                        uVar41 = (uVar41 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                                 (uVar41 & 0x5555555555555555) << 1;
                        uVar41 = (uVar41 & 0xcccccccccccccccc) >> 2 |
                                 (uVar41 & 0x3333333333333333) << 2;
                        uVar41 = (uVar41 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                                 (uVar41 & 0xf0f0f0f0f0f0f0f) << 4;
                        uVar41 = (uVar41 & 0xff00ff00ff00ff00) >> 8 |
                                 (uVar41 & 0xff00ff00ff00ff) << 8;
                        uVar41 = (uVar41 & 0xffff0000ffff0000) >> 0x10 |
                                 (uVar41 & 0xffff0000ffff) << 0x10;
                        iVar38 = (int)((ulong)LZCOUNT(uVar41 >> 0x20 | uVar41 << 0x20) >> 3) +
                                 iVar38;
                        goto code_r0x000af2fc;
                      }
                      puVar12 = puVar12 + 1;
                      puVar13 = puVar13 + 1;
                      iVar38 = iVar38 + 8;
                    } while (puVar12 < puVar45);
                  }
                  if (puVar12 < (ulong *)((long)puVar21 - 3U)) {
                    if ((uint)*puVar13 == (uint)*puVar12) {
                      puVar12 = (ulong *)((long)puVar12 + 4);
                      puVar13 = (ulong *)((long)puVar13 + 4);
                    }
                    if (puVar12 < (ulong *)((long)puVar21 - 1U)) goto code_r0x000afa94;
                  }
                  else if (puVar12 < (ulong *)((long)puVar21 - 1U)) {
code_r0x000afa94:
                    if ((short)*puVar13 == (short)*puVar12) {
                      puVar12 = (ulong *)((long)puVar12 + 2);
                      puVar13 = (ulong *)((long)puVar13 + 2);
                    }
                  }
                  if (puVar12 < puVar21) {
                    if ((char)*puVar13 == (char)*puVar12) {
                      puVar12 = (ulong *)((long)puVar12 + 1);
                    }
                  }
                  iVar38 = (int)puVar12 - iVar20;
                }
code_r0x000af2fc:
                iVar38 = iVar38 + 4;
                if (puVar23 < *(ulong **)(unaff_x29 + -0x88)) {
                  unaff_x26 = *(char **)(unaff_x29 + -0x78);
                  if ((ulong *)(*(long *)(unaff_x29 + -0xa8) + (long)iVar38) == puVar21) {
                    puVar12 = puVar54;
                    puVar23 = puVar21;
                    if (puVar21 < unaff_x28) {
                      uVar41 = *puVar21 ^ *puVar54;
                      if (uVar41 == 0) {
                        puVar23 = puVar21 + 1;
                        puVar12 = puVar54 + 1;
                        goto code_r0x000af378;
                      }
                      uVar41 = (uVar41 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                               (uVar41 & 0x5555555555555555) << 1;
                      uVar41 = (uVar41 & 0xcccccccccccccccc) >> 2 |
                               (uVar41 & 0x3333333333333333) << 2;
                      uVar41 = (uVar41 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                               (uVar41 & 0xf0f0f0f0f0f0f0f) << 4;
                      uVar41 = (uVar41 & 0xff00ff00ff00ff00) >> 8 | (uVar41 & 0xff00ff00ff00ff) << 8
                      ;
                      uVar41 = (uVar41 & 0xffff0000ffff0000) >> 0x10 |
                               (uVar41 & 0xffff0000ffff) << 0x10;
                      iVar31 = (int)((ulong)LZCOUNT(uVar41 >> 0x20 | uVar41 << 0x20) >> 3);
                    }
                    else {
code_r0x000af378:
                      if (puVar23 < unaff_x28) {
                        uVar41 = (long)unaff_x21 + (ulong)uVar19 + lVar57 + -3;
                        if (in_stack_00000150 <= uVar41) {
                          uVar41 = in_stack_00000150;
                        }
                        iVar31 = (int)puVar23 - (int)uVar41;
                        do {
                          uVar41 = *puVar23 ^ *puVar12;
                          if (uVar41 != 0) {
                            uVar41 = (uVar41 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                                     (uVar41 & 0x5555555555555555) << 1;
                            uVar41 = (uVar41 & 0xcccccccccccccccc) >> 2 |
                                     (uVar41 & 0x3333333333333333) << 2;
                            uVar41 = (uVar41 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                                     (uVar41 & 0xf0f0f0f0f0f0f0f) << 4;
                            uVar41 = (uVar41 & 0xff00ff00ff00ff00) >> 8 |
                                     (uVar41 & 0xff00ff00ff00ff) << 8;
                            uVar41 = (uVar41 & 0xffff0000ffff0000) >> 0x10 |
                                     (uVar41 & 0xffff0000ffff) << 0x10;
                            iVar31 = (int)((ulong)LZCOUNT(uVar41 >> 0x20 | uVar41 << 0x20) >> 3) +
                                     iVar31;
                            goto code_r0x000af428;
                          }
                          puVar23 = puVar23 + 1;
                          puVar12 = puVar12 + 1;
                          iVar31 = iVar31 + 8;
                        } while (puVar23 < unaff_x28);
                      }
                      if (puVar23 < in_stack_00000060) {
                        if ((uint)*puVar12 == (uint)*puVar23) {
                          puVar23 = (ulong *)((long)puVar23 + 4);
                          puVar12 = (ulong *)((long)puVar12 + 4);
                        }
                        if (puVar23 < in_stack_00000058) goto code_r0x000afac8;
code_r0x000af3f0:
                        if (puVar23 < *(ulong **)(unaff_x29 + -0x88)) {
code_r0x000af3fc:
                          if ((char)*puVar12 == (char)*puVar23) {
                            puVar23 = (ulong *)((long)puVar23 + 1);
                          }
                        }
                      }
                      else {
                        if (in_stack_00000058 <= puVar23) goto code_r0x000af3f0;
code_r0x000afac8:
                        if ((short)*puVar12 == (short)*puVar23) {
                          puVar23 = (ulong *)((long)puVar23 + 2);
                          puVar12 = (ulong *)((long)puVar12 + 2);
                        }
                        if (puVar23 < *(ulong **)(unaff_x29 + -0x88)) goto code_r0x000af3fc;
                      }
                      iVar31 = (int)puVar23 - (int)puVar21;
                    }
code_r0x000af428:
                    iVar38 = iVar31 + iVar38;
                    goto code_r0x000af42c;
                  }
                }
                else {
code_r0x000af42c:
                  unaff_x26 = *(char **)(unaff_x29 + -0x78);
                }
                if ((int)*(undefined8 *)(unaff_x29 + -0xb0) == 0) {
                  unaff_x27 = *(ulong *)(unaff_x29 + -0x80);
                  iVar31 = 0;
                }
                else {
                  lVar47 = *(long *)(unaff_x29 + -0xe0);
                  if (lVar47 <= (long)-uVar52) {
                    lVar47 = -uVar52;
                  }
                  iVar27 = (int)lVar47;
                  if (iVar27 < -3) {
                    lVar47 = 0;
                    do {
                      uVar4 = *(uint *)((long)puVar1 + lVar47 + -4) ^
                              *(uint *)((long)puVar51 + lVar47 + -7);
                      if (uVar4 != 0) {
                        iVar31 = (int)lVar47 - ((uint)LZCOUNT(uVar4) >> 3);
                        unaff_x27 = *(ulong *)(unaff_x29 + -0x80);
                        unaff_x26 = *(char **)(unaff_x29 + -0x78);
                        goto code_r0x000af4e4;
                      }
                      lVar47 = lVar47 + -4;
                    } while ((long)iVar27 + 3 < lVar47);
                  }
                  else {
                    lVar47 = 0;
                  }
                  iVar31 = (int)lVar47;
                  lVar47 = (long)iVar31;
                  iVar2 = iVar31;
                  if (iVar27 <= iVar31) {
                    iVar2 = iVar27;
                  }
                  iVar31 = iVar31 + 1;
                  unaff_x27 = *(ulong *)(unaff_x29 + -0x80);
                  unaff_x26 = *(char **)(unaff_x29 + -0x78);
                  do {
                    if (lVar47 <= iVar27) {
                      iVar31 = iVar2;
                      break;
                    }
                    lVar56 = lVar47 + lVar57 + -4;
                    lVar40 = lVar47 + (uVar52 - 1);
                    lVar47 = lVar47 + -1;
                    iVar31 = iVar31 + -1;
                  } while (*(char *)((long)unaff_x21 + lVar56) == *(char *)((long)puVar25 + lVar40))
                  ;
                }
code_r0x000af4e4:
                uVar4 = iVar38 - iVar31;
                if ((int)uVar4 <= (int)uVar26) {
                  iVar31 = *(int *)(unaff_x29 + -0x90);
                }
                *(int *)(unaff_x29 + -0x90) = iVar31;
                uVar3 = uVar36 - uVar32;
                if ((int)uVar4 <= (int)uVar26) {
                  uVar3 = (uint)param_3;
                }
                param_3 = (ulong)uVar3;
                if ((int)uVar4 <= (int)uVar26) {
                  uVar4 = uVar26;
                }
                unaff_x22 = (ulong)uVar4;
              }
code_r0x000af500:
              uVar52 = (ulong)(iVar37 - 1);
              uVar26 = (uint)*(ushort *)(unaff_x23 + (ulong)(uVar32 & 0xffff) * 2);
              if ((int)unaff_x27 < 0x81) goto code_r0x000af808;
code_r0x000af514:
              if (uVar26 != 1) goto code_r0x000af808;
              if (iVar46 == 0) {
                if (*(int *)(unaff_x29 + -0xf0) != 0) {
                  puVar23 = puVar22;
                  puVar12 = (ulong *)((long)unaff_x21 + lVar57 + 1);
                  for (puVar21 = puVar22; puVar21 < unaff_x28; puVar21 = puVar21 + 1) {
                    uVar41 = *puVar21 ^ uVar14;
                    if (uVar41 != 0) {
                      uVar41 = (uVar41 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                               (uVar41 & 0x5555555555555555) << 1;
                      uVar41 = (uVar41 & 0xcccccccccccccccc) >> 2 |
                               (uVar41 & 0x3333333333333333) << 2;
                      uVar41 = (uVar41 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                               (uVar41 & 0xf0f0f0f0f0f0f0f) << 4;
                      uVar41 = (uVar41 & 0xff00ff00ff00ff00) >> 8 | (uVar41 & 0xff00ff00ff00ff) << 8
                      ;
                      uVar41 = (uVar41 & 0xffff0000ffff0000) >> 0x10 |
                               (uVar41 & 0xffff0000ffff) << 0x10;
                      puVar23 = (ulong *)((long)puVar12 +
                                         ((ulong)LZCOUNT(uVar41 >> 0x20 | uVar41 << 0x20) >> 3));
                      goto code_r0x000af66c;
                    }
                    puVar23 = puVar12 + 1;
                    puVar12 = puVar23;
                  }
                  if (puVar21 < *(ulong **)(unaff_x29 + -0x88)) {
                    lVar47 = (long)*(ulong **)(unaff_x29 + -0x88) - (long)puVar23;
                    puVar12 = (ulong *)((long)puVar21 + lVar47);
                    uVar41 = uVar14;
                    do {
                      puVar23 = puVar21;
                      if ((uint)(byte)*puVar21 != ((uint)uVar41 & 0xff)) goto code_r0x000af66c;
                      puVar21 = (ulong *)((long)puVar21 + 1);
                      uVar41 = uVar41 >> 8;
                      lVar47 = lVar47 + -1;
                    } while (lVar47 != 0);
                    puVar23 = puVar12;
                  }
code_r0x000af66c:
                  uStack0000000000000138 = (ulong)(uint)((int)puVar23 - iVar20) + 4;
                  iVar46 = 2;
                  goto code_r0x000af528;
                }
                iVar46 = 1;
                goto code_r0x000af808;
              }
              if (iVar46 != 2) goto code_r0x000af808;
code_r0x000af528:
              uVar4 = uVar32 - 1;
              if (uVar4 < uVar10) goto code_r0x000af808;
              if (uVar19 < 3) {
                iVar46 = 2;
                goto code_r0x000af808;
              }
              puVar23 = (ulong *)((long)puVar25 +
                                 (ulong)(uVar4 - (int)*(undefined8 *)(unaff_x29 + -0xa0)));
              puVar21 = (ulong *)((long)puVar54 + (ulong)(uVar4 - uVar34));
              if (uVar4 < uVar34) {
                puVar21 = puVar23;
              }
              if ((uint)*puVar21 != uVar49) {
                iVar46 = 2;
                unaff_x27 = *(ulong *)(unaff_x29 + -0x80);
                goto code_r0x000af808;
              }
              puVar13 = *(ulong **)(unaff_x29 + -0x88);
              puVar12 = puVar13;
              if (uVar4 < uVar34) {
                puVar12 = puVar28;
              }
              puVar45 = (ulong *)((long)puVar21 + 4);
              puVar39 = puVar45;
              if (puVar45 < (ulong *)((long)puVar12 - 7U)) {
                iVar46 = (int)*(undefined8 *)(unaff_x29 + -0xb0);
                puVar24 = puVar45;
                do {
                  uVar41 = *puVar39 ^ uVar14;
                  if (uVar41 != 0) {
                    uVar41 = (uVar41 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar41 & 0x5555555555555555) << 1
                    ;
                    uVar41 = (uVar41 & 0xcccccccccccccccc) >> 2 | (uVar41 & 0x3333333333333333) << 2
                    ;
                    uVar41 = (uVar41 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar41 & 0xf0f0f0f0f0f0f0f) << 4;
                    uVar41 = (uVar41 & 0xff00ff00ff00ff00) >> 8 | (uVar41 & 0xff00ff00ff00ff) << 8;
                    uVar41 = (uVar41 & 0xffff0000ffff0000) >> 0x10 |
                             (uVar41 & 0xffff0000ffff) << 0x10;
                    puVar39 = (ulong *)((long)puVar24 +
                                       ((ulong)LZCOUNT(uVar41 >> 0x20 | uVar41 << 0x20) >> 3));
                    goto code_r0x000af6a0;
                  }
                  puVar39 = puVar39 + 1;
                  puVar24 = puVar24 + 1;
                } while (puVar39 < (ulong *)((long)puVar12 - 7U));
              }
              else {
                iVar46 = (int)*(undefined8 *)(unaff_x29 + -0xb0);
              }
              if (puVar39 < puVar12) {
                lVar47 = (long)puVar12 - (long)puVar39;
                uVar41 = uVar14;
                do {
                  if ((uint)(byte)*puVar39 != ((uint)uVar41 & 0xff)) goto code_r0x000af6a0;
                  puVar39 = (ulong *)((long)puVar39 + 1);
                  uVar41 = uVar41 >> 8;
                  lVar47 = lVar47 + -1;
                } while (lVar47 != 0);
                puVar39 = puVar12;
              }
code_r0x000af6a0:
              uVar41 = (long)puVar39 - (long)puVar45;
              uVar44 = (uVar41 & 0xffffffff) + 4;
              if (uVar4 < uVar34) {
                puVar12 = puVar25;
                if ((ulong *)((long)puVar23 + uVar44) == puVar28) {
                  puVar23 = puVar54;
                  puVar45 = puVar54;
                  uVar48 = uVar14;
                  if ((uVar41 & 3) != 0) {
                    uVar19 = (int)uVar41 * -8 & 0x1f;
                    uVar19 = uVar49 >> uVar19 | uVar49 << 0x20 - uVar19;
                    uVar48 = CONCAT44(uVar19,uVar19);
                  }
                  for (; puVar23 < unaff_x28; puVar23 = puVar23 + 1) {
                    uVar41 = *puVar23 ^ uVar48;
                    if (uVar41 != 0) {
                      uVar41 = (uVar41 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                               (uVar41 & 0x5555555555555555) << 1;
                      uVar41 = (uVar41 & 0xcccccccccccccccc) >> 2 |
                               (uVar41 & 0x3333333333333333) << 2;
                      uVar41 = (uVar41 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                               (uVar41 & 0xf0f0f0f0f0f0f0f) << 4;
                      uVar41 = (uVar41 & 0xff00ff00ff00ff00) >> 8 | (uVar41 & 0xff00ff00ff00ff) << 8
                      ;
                      uVar41 = (uVar41 & 0xffff0000ffff0000) >> 0x10 |
                               (uVar41 & 0xffff0000ffff) << 0x10;
                      puVar45 = (ulong *)((long)puVar45 +
                                         ((ulong)LZCOUNT(uVar41 >> 0x20 | uVar41 << 0x20) >> 3));
                      goto code_r0x000af8d0;
                    }
                    puVar45 = puVar45 + 1;
                  }
                  if (puVar23 < puVar13) {
                    lVar47 = (long)puVar13 - (long)puVar45;
                    puVar13 = (ulong *)((long)puVar23 + lVar47);
                    do {
                      puVar45 = puVar23;
                      if ((uint)(byte)*puVar23 != ((uint)uVar48 & 0xff)) goto code_r0x000af8d0;
                      puVar23 = (ulong *)((long)puVar23 + 1);
                      uVar48 = uVar48 >> 8;
                      lVar47 = lVar47 + -1;
                    } while (lVar47 != 0);
                    puVar45 = puVar13;
                  }
code_r0x000af8d0:
                  uVar44 = (uint)((int)puVar45 - (int)puVar54) + uVar44;
                }
              }
              else {
                puVar12 = puVar54;
              }
              *(uint *)(unaff_x29 + -0x6c) = uVar49;
              puVar23 = puVar21;
              do {
                puVar13 = puVar23;
                if (puVar13 < (ulong *)((long)puVar12 + 4U)) break;
                puVar23 = (ulong *)((long)puVar13 + -4);
              } while (*(uint *)((long)puVar13 + -4) == uVar49);
              puVar23 = puVar13;
              if (puVar12 < puVar13) {
                lVar47 = 0;
                do {
                  puVar23 = (ulong *)((long)puVar13 + lVar47);
                  if (*(char *)((long)puVar23 + -1) != unaff_x26[lVar47]) goto code_r0x000af940;
                  lVar47 = lVar47 + -1;
                } while (puVar12 < (ulong *)((long)puVar13 + lVar47));
                puVar23 = puVar12;
              }
code_r0x000af940:
              iVar20 = (int)((long)puVar21 - (long)puVar23);
              if ((uVar4 < uVar34) ||
                 ((ulong *)((long)puVar21 - ((long)puVar21 - (long)puVar23 & 0xffffffffU)) !=
                  puVar54)) {
                unaff_x27 = *(ulong *)(unaff_x29 + -0x80);
              }
              else {
                unaff_x27 = *(ulong *)(unaff_x29 + -0x80);
                if ((uint)*(undefined8 *)(unaff_x29 + -0xa0) < uVar34) {
                  uVar32 = iVar20 * 8 & 0x1f;
                  uVar19 = uVar49;
                  if ((-iVar20 & 3U) != 0) {
                    uVar19 = uVar49 >> uVar32 | uVar49 << 0x20 - uVar32;
                  }
                  *(uint *)(unaff_x29 + -0x6c) = uVar19;
                  lVar47 = lVar35;
                  do {
                    lVar56 = lVar47;
                    if (lVar56 < 4) {
                      puVar23 = (ulong *)((long)puVar25 + lVar56);
                      if (lVar56 < 1) goto code_r0x000af9d4;
                      break;
                    }
                    lVar47 = lVar56 + -4;
                  } while (*(uint *)((long)puVar25 + lVar56 + -4) == uVar19);
                  puVar23 = (ulong *)((long)puVar25 + lVar56);
                  pcVar15 = unaff_x26;
                  do {
                    puVar21 = (ulong *)((long)puVar23 + -1);
                    if (*(char *)puVar21 != *pcVar15) goto code_r0x000af9d4;
                    pcVar15 = pcVar15 + -1;
                    puVar23 = puVar21;
                  } while (puVar25 < puVar21);
                  puVar23 = puVar25;
code_r0x000af9d4:
                  iVar20 = ((int)puVar28 - (int)puVar23) + iVar20;
                }
              }
              uVar19 = uVar4 - iVar20;
              if (uVar4 - iVar20 <= uVar10) {
                uVar19 = uVar10;
              }
              uVar41 = (ulong)uVar19;
              uVar48 = uVar44 + (uVar4 - uVar19);
              if ((uStack0000000000000138 < uVar44) || (uVar48 < uStack0000000000000138)) {
                if (uVar34 + ~uVar19 < 3) {
                  iVar46 = 2;
                  uVar41 = uVar42;
                  goto code_r0x000af80c;
                }
                if (iVar46 != 0) goto code_r0x000afa80;
                if (uStack0000000000000138 <= uVar48) {
                  uVar48 = uStack0000000000000138;
                }
                if ((ulong)(long)(int)unaff_x22 < uVar48) {
                  if ((((long)puVar29 - (long)puVar54) + uVar42) - uVar41 >> 0x10 != 0)
                  goto code_r0x000aed30;
                  param_3 = (ulong)(uVar36 - uVar19);
                  unaff_x22 = uVar48;
                }
                uVar32 = (uint)*(ushort *)(unaff_x23 + (ulong)(uVar19 & 0xffff) * 2);
                uVar41 = (ulong)(uVar19 - uVar32);
                if (uVar19 < uVar32) goto code_r0x000aed30;
              }
              else {
                uVar19 = (uVar4 - (int)uStack0000000000000138) + (int)uVar44;
                uVar32 = uVar34;
                if (2 < uVar34 + ~uVar19) {
                  uVar32 = uVar19;
                }
                uVar41 = (ulong)uVar32;
              }
code_r0x000afa80:
              iVar46 = 2;
            }
code_r0x000af80c:
            if ((uint)uVar41 < uVar10 || iVar37 < 2) goto code_r0x000aed30;
            goto code_r0x000af134;
          }
          *(undefined4 *)(unaff_x29 + -0x90) = 0;
          param_3 = 0;
code_r0x000aed30:
          if (((uVar36 < uVar18 + 0x10000) && (*(int *)(unaff_x29 + -0xe4) == 1)) &&
             (0 < (int)uVar52)) {
            lVar56 = *(long *)(unaff_x29 + -0xd8);
            lVar47 = *(long *)(&UNK_00040008 + lVar56);
            uVar34 = *(uint *)(&UNK_00040018 + lVar56);
            lVar35 = (*(long *)(lVar56 + 0x40000) - lVar47) + (ulong)uVar34;
            uVar18 = *(uint *)(lVar56 + (ulong)((uint)(**(int **)(unaff_x29 + -0xa8) * -0x61c8864f)
                                               >> 0x11) * 4);
            iVar46 = (uVar18 + uVar10) - (int)lVar35;
            uVar10 = uVar36 - iVar46;
            if (uVar10 >> 0x10 == 0) {
              puVar54 = (ulong *)((long)puVar51 + 1);
              lVar56 = (long)unaff_x21 - (long)*(int **)(unaff_x29 + -0xa8);
              do {
                if ((int)uVar52 == 0) break;
                puVar29 = (uint *)((lVar47 - (ulong)uVar34) + (ulong)uVar18);
                if (*puVar29 == uVar49) {
                  puVar25 = (ulong *)(*(long *)(unaff_x29 + -0xa8) + (lVar35 - (ulong)uVar18));
                  puVar22 = *(ulong **)(unaff_x29 + -0x88);
                  if (puVar25 <= *(ulong **)(unaff_x29 + -0x88)) {
                    puVar22 = puVar25;
                  }
                  puVar28 = (ulong *)(puVar29 + 1);
                  puVar23 = (ulong *)((long)puVar22 - 7);
                  puVar25 = puVar54;
                  if (puVar54 < puVar23) {
                    uVar42 = *puVar54 ^ *puVar28;
                    if (uVar42 == 0) {
                      puVar28 = (ulong *)(puVar29 + 3);
                      puVar25 = (ulong *)((long)puVar51 + 9);
                      goto joined_r0x000af018;
                    }
                    uVar42 = (uVar42 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar42 & 0x5555555555555555) << 1
                    ;
                    uVar42 = (uVar42 & 0xcccccccccccccccc) >> 2 | (uVar42 & 0x3333333333333333) << 2
                    ;
                    uVar42 = (uVar42 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar42 & 0xf0f0f0f0f0f0f0f) << 4;
                    uVar42 = (uVar42 & 0xff00ff00ff00ff00) >> 8 | (uVar42 & 0xff00ff00ff00ff) << 8;
                    uVar42 = (uVar42 & 0xffff0000ffff0000) >> 0x10 |
                             (uVar42 & 0xffff0000ffff) << 0x10;
                    iVar20 = (int)((ulong)LZCOUNT(uVar42 >> 0x20 | uVar42 << 0x20) >> 3);
                  }
                  else {
joined_r0x000af018:
                    if (puVar25 < puVar23) {
                      iVar20 = ~(uVar11 + iVar33) + (int)puVar25;
                      do {
                        uVar42 = *puVar25 ^ *puVar28;
                        if (uVar42 != 0) {
                          uVar42 = (uVar42 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                                   (uVar42 & 0x5555555555555555) << 1;
                          uVar42 = (uVar42 & 0xcccccccccccccccc) >> 2 |
                                   (uVar42 & 0x3333333333333333) << 2;
                          uVar42 = (uVar42 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                                   (uVar42 & 0xf0f0f0f0f0f0f0f) << 4;
                          uVar42 = (uVar42 & 0xff00ff00ff00ff00) >> 8 |
                                   (uVar42 & 0xff00ff00ff00ff) << 8;
                          uVar42 = (uVar42 & 0xffff0000ffff0000) >> 0x10 |
                                   (uVar42 & 0xffff0000ffff) << 0x10;
                          iVar20 = (int)((ulong)LZCOUNT(uVar42 >> 0x20 | uVar42 << 0x20) >> 3) +
                                   iVar20;
                          unaff_x26 = *(char **)(unaff_x29 + -0x78);
                          goto code_r0x000aef28;
                        }
                        puVar25 = puVar25 + 1;
                        puVar28 = puVar28 + 1;
                        iVar20 = iVar20 + 8;
                      } while (puVar25 < puVar23);
                    }
                    if (puVar25 < (ulong *)((long)puVar22 - 3U)) {
                      if ((uint)*puVar28 == (uint)*puVar25) {
                        puVar25 = (ulong *)((long)puVar25 + 4);
                        puVar28 = (ulong *)((long)puVar28 + 4);
                      }
                      if (puVar25 < (ulong *)((long)puVar22 - 1U)) goto code_r0x000aefe4;
code_r0x000aeeec:
                      unaff_x26 = *(char **)(unaff_x29 + -0x78);
                    }
                    else {
                      if ((ulong *)((long)puVar22 - 1U) <= puVar25) goto code_r0x000aeeec;
code_r0x000aefe4:
                      if ((short)*puVar28 == (short)*puVar25) {
                        puVar25 = (ulong *)((long)puVar25 + 2);
                        puVar28 = (ulong *)((long)puVar28 + 2);
                      }
                      unaff_x26 = *(char **)(unaff_x29 + -0x78);
                    }
                    if (puVar25 < puVar22) {
                      if ((char)*puVar28 == (char)*puVar25) {
                        puVar25 = (ulong *)((long)puVar25 + 1);
                      }
                    }
                    iVar20 = (int)puVar25 - (int)puVar54;
                  }
code_r0x000aef28:
                  if ((int)*(undefined8 *)(unaff_x29 + -0xb0) == 0) {
                    iVar37 = 0;
                  }
                  else {
                    lVar40 = lVar56;
                    if (lVar56 <= lVar47 - (long)puVar29) {
                      lVar40 = lVar47 - (long)puVar29;
                    }
                    iVar38 = (int)lVar40;
                    if (iVar38 < -3) {
                      lVar40 = 0;
                      do {
                        uVar19 = *(uint *)((long)puVar29 + lVar40 + -4) ^
                                 *(uint *)((long)puVar51 + lVar40 + -7);
                        if (uVar19 != 0) {
                          iVar37 = (int)lVar40 - ((uint)LZCOUNT(uVar19) >> 3);
                          unaff_x27 = *(ulong *)(unaff_x29 + -0x80);
                          unaff_x26 = *(char **)(unaff_x29 + -0x78);
                          goto code_r0x000aedd8;
                        }
                        lVar40 = lVar40 + -4;
                      } while ((long)iVar38 + 3 < lVar40);
                      unaff_x27 = *(ulong *)(unaff_x29 + -0x80);
                    }
                    else {
                      lVar40 = 0;
                    }
                    iVar27 = (int)lVar40;
                    iVar31 = iVar27;
                    if (iVar38 <= iVar27) {
                      iVar31 = iVar38;
                    }
                    iVar37 = iVar27 + 1;
                    unaff_x26 = *(char **)(unaff_x29 + -0x78);
                    lVar40 = (long)iVar27;
                    do {
                      if (lVar40 <= iVar38) {
                        iVar37 = iVar31;
                        break;
                      }
                      lVar6 = lVar40 + lVar57 + -4;
                      lVar7 = lVar40 + -1;
                      iVar37 = iVar37 + -1;
                      unaff_x26 = *(char **)(unaff_x29 + -0x78);
                      lVar40 = lVar40 + -1;
                    } while (*(char *)((long)unaff_x21 + lVar6) == *(char *)((long)puVar29 + lVar7))
                    ;
                  }
code_r0x000aedd8:
                  uVar19 = (iVar20 + 4) - iVar37;
                  uVar32 = (uint)unaff_x22;
                  if ((int)uVar19 <= (int)uVar32) {
                    iVar37 = *(int *)(unaff_x29 + -0x90);
                  }
                  *(int *)(unaff_x29 + -0x90) = iVar37;
                  if ((int)uVar19 <= (int)uVar32) {
                    uVar10 = (uint)param_3;
                  }
                  param_3 = (ulong)uVar10;
                  if ((int)uVar19 <= (int)uVar32) {
                    uVar19 = uVar32;
                  }
                  unaff_x22 = (ulong)uVar19;
                }
                uVar52 = (ulong)((int)uVar52 - 1);
                uVar10 = (uint)*(ushort *)
                                (*(long *)(unaff_x29 + -0xd8) + (ulong)(uVar18 & 0xffff) * 2 +
                                0x20000);
                uVar18 = uVar18 - uVar10;
                iVar46 = iVar46 - uVar10;
                uVar10 = uVar36 - iVar46;
              } while (uVar10 < 0x10000);
            }
          }
          unaff_x20 = (ulong *)(*(long *)(unaff_x29 + -0xa8) + (long)*(int *)(unaff_x29 + -0x90));
          unaff_w30 = -0x61c8864f;
          param_2 = param_2 & 0xffffffff;
          in_w6 = in_stack_00000168._4_4_;
        }
        puStack0000000000000148 = unaff_x21;
        if ((int)(uint)unaff_x22 <= (int)uVar11) goto code_r0x000b01a0;
        if ((ulong *)((long)puStack00000000000000c8 + 3U) <= unaff_x20) {
          in_stack_000000e0 = in_x16;
          _uStack0000000000000118 = uVar55;
          if (puStack00000000000000c8 <= unaff_x21) {
            puStack00000000000000c8 = in_stack_00000078;
            goto LAB_000afbd8;
          }
          _uStack0000000000000050 = (long)unaff_x21 - (long)in_x16;
          if (0x11 < (long)_uStack0000000000000050) {
            puStack00000000000000c8 = in_stack_00000078;
            goto LAB_000afbd8;
          }
          uVar11 = (uVar11 + (int)_uStack0000000000000050) - 4;
          if ((uint *)((long)in_x16 + (long)(int)uVar30) <= (uint *)((long)puVar51 - 4U)) {
            uVar11 = uVar30;
          }
          _uStack0000000000000050 = (ulong)uVar11;
          in_w8 = uVar11 + (iVar43 - iVar33);
          in_x15 = in_stack_00000078;
          goto code_r0x000afbbc;
        }
        puStack0000000000000148 = unaff_x20;
        uVar52 = unaff_x27;
        if (puStack00000000000000c8 <= unaff_x20) {
          puStack0000000000000148 = unaff_x21;
          if (unaff_x21 < puStack00000000000000c8) {
            iVar33 = (int)puStack00000000000000c8 - iVar33;
            uVar11 = uVar11 - iVar33;
            uVar30 = (uint)param_3;
            if (3 < (int)uVar11) {
              uVar30 = (uint)param_2;
            }
            param_2 = (ulong)uVar30;
            uVar30 = (uint)unaff_x22;
            if (3 < (int)uVar11) {
              uVar30 = uVar11;
            }
            param_1 = (ulong)uVar30;
            puStack0000000000000148 = unaff_x20;
            if (3 < (int)uVar11) {
              puStack0000000000000148 = (ulong *)((long)unaff_x21 + (long)iVar33);
            }
          }
          puVar51 = (ulong *)(in_stack_000000b8 + 1);
          uVar52 = (long)in_x16 - (long)in_stack_00000078;
          if ((in_w6 != 0) &&
             (in_stack_000000a0 < (char *)((long)puVar51 + uVar52 + uVar52 / 0xff + 8)))
          goto code_r0x000b4ec8;
          uVar55 = uVar52 - 0xf;
          if (uVar52 < 0xf) {
            *in_stack_000000b8 = (char)((int)uVar52 << 4);
          }
          else {
            *in_stack_000000b8 = -0x10;
            puVar54 = puVar51;
            if (0xfe < uVar55) {
              uVar55 = (uVar52 - 0x10e) / 0xff;
              *(uint *)(unaff_x29 + -0x90) = (uint)param_3;
              _memset(puVar51,0xff,uVar55 + 1);
              param_2 = param_2 & 0xffffffff;
              param_3 = (ulong)*(uint *)(unaff_x29 + -0x90);
              unaff_w30 = -0x61c8864f;
              puVar54 = (ulong *)(in_stack_000000b8 + uVar55 + 2);
              uVar55 = (uVar52 - 0x10e) % 0xff;
              in_w6 = in_stack_00000168._4_4_;
            }
            puVar51 = (ulong *)((long)puVar54 + 1);
            *(char *)puVar54 = (char)uVar55;
          }
          puVar54 = (ulong *)((long)puVar51 + uVar52);
          puVar25 = (ulong *)((char *)((long)puVar51 + (long)in_x16) + -(long)in_stack_00000078);
          if ((char *)((long)puVar51 + (long)in_x16) + -(long)in_stack_00000078 <= puVar51 + 1) {
            puVar25 = puVar51 + 1;
          }
          puVar22 = in_stack_00000078;
          puVar28 = puVar51;
          if (((char *)((long)puVar25 + ~(ulong)puVar51) < &segment_command_00000020.vmaddr) ||
             ((ulong)((long)puVar51 - (long)in_stack_00000078) < 0x40)) goto code_r0x000affd0;
          uVar52 = ((long)puVar25 + ~(ulong)puVar51 >> 3) + 1;
          uVar42 = uVar52 & 0x3ffffffffffffff8;
          puVar25 = in_stack_00000078 + 4;
          puVar22 = puVar51 + 4;
          uVar55 = uVar42;
          do {
            uVar41 = puVar25[-4];
            uVar44 = puVar25[-1];
            uVar14 = puVar25[-2];
            uVar58 = puVar25[1];
            uVar48 = *puVar25;
            uVar59 = puVar25[3];
            uVar50 = puVar25[2];
            puVar22[-3] = puVar25[-3];
            puVar22[-4] = uVar41;
            puVar22[-1] = uVar44;
            puVar22[-2] = uVar14;
            puVar22[1] = uVar58;
            *puVar22 = uVar48;
            puVar22[3] = uVar59;
            puVar22[2] = uVar50;
            uVar55 = uVar55 - 8;
            puVar25 = puVar25 + 8;
            puVar22 = puVar22 + 8;
          } while (uVar55 != 0);
          puVar22 = in_stack_00000078 + uVar42;
          puVar28 = puVar51 + uVar42;
          if (uVar52 != uVar42) {
code_r0x000affd0:
            do {
              puVar25 = puVar28 + 1;
              *puVar28 = *puVar22;
              puVar22 = puVar22 + 1;
              puVar28 = puVar25;
            } while (puVar25 < puVar54);
          }
          pcVar15 = (char *)((long)puVar54 + 2);
          *(undefined2 *)puVar54 = uStack0000000000000118;
          uVar52 = lVar53 - 4;
          if ((in_w6 == 0) || (pcVar15 + uVar52 / 0xff + 6 <= in_stack_000000a0)) {
            if (uVar52 < 0xf) {
              *in_stack_000000b8 = *in_stack_000000b8 + (char)uVar52;
              lVar53 = *(long *)(unaff_x29 + -0x98);
            }
            else {
              *in_stack_000000b8 = *in_stack_000000b8 + '\x0f';
              uVar52 = lVar53 - 0x13;
              if (0x1fd < uVar52) {
                lVar57 = ((lVar53 - 0x211U) / 0x1fe) * 2;
                *(int *)(unaff_x29 + -0x90) = (int)param_3;
                *(ulong **)(unaff_x29 + -0xa0) = puVar51;
                _memset(pcVar15,0xff,lVar57 + 2);
                param_2 = param_2 & 0xffffffff;
                param_3 = (ulong)*(uint *)(unaff_x29 + -0x90);
                unaff_w30 = -0x61c8864f;
                pcVar15 = (char *)((long)in_x16 +
                                  *(long *)(unaff_x29 + -0xa0) + (lVar57 - (long)in_stack_00000078)
                                  + 4);
                uVar52 = (lVar53 - 0x211U) % 0x1fe;
              }
              lVar53 = *(long *)(unaff_x29 + -0x98);
              pcVar16 = pcVar15;
              if (0xfe < uVar52) {
                pcVar16 = pcVar15 + 1;
                *pcVar15 = -1;
                uVar52 = uVar52 - 0xff;
              }
              pcVar15 = pcVar16 + 1;
              *pcVar16 = (char)uVar52;
            }
            uVar52 = param_2 & 0xffffffff | param_1 << 0x20;
            puVar51 = puStack0000000000000148;
            puVar54 = unaff_x20;
            in_stack_000000b8 = pcVar15;
            goto code_r0x000adbb8;
          }
code_r0x000b4ec8:
          puStack00000000000000c8 = in_stack_00000078;
          break;
        }
      } while( true );
    }
  }
  uVar30 = uStack0000000000000050;
code_r0x000b4f20:
  if (in_w6 == 2) {
    uVar52 = (long)in_x16 - (long)puStack00000000000000c8;
    lVar53 = uVar52 + (uVar52 + 0xf0) / 0xff;
    in_w6 = 2;
    if (in_stack_000000b8 + lVar53 + 1 <= (char *)(in_stack_00000068 + -8)) {
      uVar55 = ((in_stack_00000068 + -8) - (long)(in_stack_000000b8 + lVar53 + 1)) * 0xff + 0x12;
      uVar11 = (uint)uVar55;
      if ((ulong)(long)(int)uVar30 <= uVar55) {
        uVar11 = uVar30;
      }
      lVar57 = (long)(int)uVar11;
      if (0xb < (long)(~(ulong)(in_stack_000000b8 + lVar53 + 3) + in_stack_00000068 + lVar57)) {
        puVar51 = (ulong *)(in_stack_000000b8 + 1);
        uVar55 = uVar52 - 0xf;
        if (uVar52 < 0xf) {
          *in_stack_000000b8 = (char)((int)uVar52 << 4);
        }
        else {
          *in_stack_000000b8 = -0x10;
          puVar54 = puVar51;
          if (0xfe < uVar55) {
            uVar55 = (uVar52 - 0x10e) / 0xff;
            _memset(puVar51,0xff,uVar55 + 1);
            puVar54 = (ulong *)(in_stack_000000b8 + uVar55 + 2);
            uVar55 = (uVar52 - 0x10e) % 0xff;
            in_w6 = in_stack_00000168._4_4_;
          }
          puVar51 = (ulong *)((long)puVar54 + 1);
          *(char *)puVar54 = (char)uVar55;
        }
        puVar54 = (ulong *)((long)puVar51 + uVar52);
        puVar25 = (ulong *)((char *)((long)in_x16 + (long)puVar51) + -(long)puStack00000000000000c8)
        ;
        if ((char *)((long)in_x16 + (long)puVar51) + -(long)puStack00000000000000c8 <= puVar51 + 1)
        {
          puVar25 = puVar51 + 1;
        }
        puVar22 = puStack00000000000000c8;
        puVar28 = puVar51;
        if (((char *)((long)puVar25 + ~(ulong)puVar51) < &segment_command_00000020.vmaddr) ||
           ((ulong)((long)puVar51 - (long)puStack00000000000000c8) < 0x40)) {
LAB_000b508c:
          do {
            puVar25 = puVar28 + 1;
            *puVar28 = *puVar22;
            puVar22 = puVar22 + 1;
            puVar28 = puVar25;
          } while (puVar25 < puVar54);
        }
        else {
          uVar52 = ((long)puVar25 + ~(ulong)puVar51 >> 3) + 1;
          uVar42 = uVar52 & 0x3ffffffffffffff8;
          puVar25 = puStack00000000000000c8 + 4;
          puVar22 = puVar51 + 4;
          uVar55 = uVar42;
          do {
            uVar41 = puVar25[-4];
            uVar44 = puVar25[-1];
            uVar14 = puVar25[-2];
            uVar58 = puVar25[1];
            uVar48 = *puVar25;
            uVar59 = puVar25[3];
            uVar50 = puVar25[2];
            puVar22[-3] = puVar25[-3];
            puVar22[-4] = uVar41;
            puVar22[-1] = uVar44;
            puVar22[-2] = uVar14;
            puVar22[1] = uVar58;
            *puVar22 = uVar48;
            puVar22[3] = uVar59;
            puVar22[2] = uVar50;
            uVar55 = uVar55 - 8;
            puVar25 = puVar25 + 8;
            puVar22 = puVar22 + 8;
          } while (uVar55 != 0);
          puVar22 = puStack00000000000000c8 + uVar42;
          puVar28 = puVar51 + uVar42;
          if (uVar52 != uVar42) goto LAB_000b508c;
        }
        pcVar15 = (char *)((long)puVar54 + 2);
        *(undefined2 *)puVar54 = uStack0000000000000118;
        if (lVar57 - 4U < 0xf) {
          *in_stack_000000b8 = *in_stack_000000b8 + (char)(lVar57 - 4U);
          in_stack_000000b8 = pcVar15;
        }
        else {
          *in_stack_000000b8 = *in_stack_000000b8 + '\x0f';
          uVar52 = lVar57 - 0x13;
          if (0x1fd < uVar52) {
            lVar53 = ((lVar57 - 0x211U) / 0x1fe) * 2;
            _memset(pcVar15,0xff,lVar53 + 2);
            pcVar15 = (char *)((long)puVar51 +
                              (long)in_x16 + (lVar53 - (long)puStack00000000000000c8) + 4);
            uVar52 = (lVar57 - 0x211U) % 0x1fe;
            in_w6 = in_stack_00000168._4_4_;
          }
          pcVar16 = pcVar15;
          if (0xfe < uVar52) {
            pcVar16 = pcVar15 + 1;
            *pcVar15 = -1;
            uVar52 = uVar52 - 0xff;
          }
          *pcVar16 = (char)uVar52;
          in_stack_000000b8 = pcVar16 + 1;
        }
        puStack00000000000000c8 = (ulong *)((long)in_x16 + lVar57);
      }
    }
code_r0x000b14b0:
    pcVar15 = (char *)(in_stack_00000080 - (long)puStack00000000000000c8);
    lVar53 = 5;
    if (in_w6 != 2) {
      lVar53 = 0;
    }
    if ((in_w6 != 0) &&
       (in_stack_000000a0 = in_stack_000000a0 + lVar53,
       in_stack_000000a0 < in_stack_000000b8 + (long)(pcVar15 + (ulong)(pcVar15 + 0xf0) / 0xff + 1))
       ) {
      if (in_w6 == 1) goto code_r0x000b4c7c;
      pcVar15 = in_stack_000000a0 +
                (~(ulong)in_stack_000000b8 -
                ((ulong)(in_stack_000000a0 + ~(ulong)in_stack_000000b8 + 0xf1) >> 8));
    }
    iVar43 = (int)pcVar15;
    pcVar16 = pcVar15 + -0xf;
    if (pcVar15 < "") {
      *in_stack_000000b8 = (char)(iVar43 << 4);
    }
    else {
      pcVar17 = in_stack_000000b8 + 1;
      *in_stack_000000b8 = -0x10;
      if ("" < pcVar16) {
        uVar52 = (ulong)(pcVar15 + -0x10e) / 0xff;
        _memset(pcVar17,0xff,uVar52 + 1);
        pcVar16 = (char *)((ulong)(pcVar15 + -0x10e) % 0xff);
        pcVar17 = in_stack_000000b8 + uVar52 + 2;
      }
      *pcVar17 = (char)pcVar16;
      in_stack_000000b8 = pcVar17;
    }
    _memcpy(in_stack_000000b8 + 1,puStack00000000000000c8,pcVar15);
    *in_stack_000000f0 = ((int)puStack00000000000000c8 + iVar43) - in_stack_00000160;
    iVar43 = ((int)(in_stack_000000b8 + 1) + iVar43) - (int)*(undefined8 *)(unaff_x29 + -0x100);
    if (0 < iVar43) {
      return iVar43;
    }
  }
  else {
code_r0x000b4c7c:
    iVar43 = 0;
  }
  *(undefined1 *)(*(long *)(unaff_x29 + -0xb8) + 0x27) = 1;
  return iVar43;
code_r0x000b01a0:
  uVar30 = iVar33 - iVar43;
  if (puStack00000000000000c8 <= unaff_x21) {
    uVar30 = uStack0000000000000050;
  }
  puVar54 = (ulong *)(in_stack_000000b8 + 1);
  uVar52 = (long)in_x16 - (long)in_stack_00000078;
  if ((in_w6 != 0) && (in_stack_000000a0 < (char *)((long)puVar54 + uVar52 + uVar52 / 0xff + 8))) {
    puStack00000000000000c8 = in_stack_00000078;
    goto code_r0x000b4f20;
  }
  uVar55 = uVar52 - 0xf;
  if (uVar52 < 0xf) {
    *in_stack_000000b8 = (char)((int)uVar52 << 4);
  }
  else {
    *in_stack_000000b8 = -0x10;
    puVar25 = puVar54;
    if (0xfe < uVar55) {
      uVar55 = (uVar52 - 0x10e) / 0xff;
      *(ulong *)(unaff_x29 + -0x90) = (ulong)uVar30;
      _memset(puVar54,0xff,uVar55 + 1);
      uVar30 = (uint)*(undefined8 *)(unaff_x29 + -0x90);
      unaff_w30 = -0x61c8864f;
      puVar25 = (ulong *)(in_stack_000000b8 + uVar55 + 2);
      uVar55 = (uVar52 - 0x10e) % 0xff;
      in_w6 = in_stack_00000168._4_4_;
    }
    puVar54 = (ulong *)((long)puVar25 + 1);
    *(char *)puVar25 = (char)uVar55;
  }
  puVar25 = (ulong *)((long)puVar54 + uVar52);
  puVar22 = (ulong *)((char *)((long)puVar54 + (long)in_x16) + -(long)in_stack_00000078);
  if ((char *)((long)puVar54 + (long)in_x16) + -(long)in_stack_00000078 <= puVar54 + 1) {
    puVar22 = puVar54 + 1;
  }
  puVar28 = in_stack_00000078;
  puVar23 = puVar54;
  if (((char *)((long)puVar22 + ~(ulong)puVar54) < &segment_command_00000020.vmaddr) ||
     ((ulong)((long)puVar54 - (long)in_stack_00000078) < 0x40)) {
code_r0x000b0490:
    do {
      puVar22 = puVar23 + 1;
      *puVar23 = *puVar28;
      puVar28 = puVar28 + 1;
      puVar23 = puVar22;
    } while (puVar22 < puVar25);
  }
  else {
    uVar55 = ((long)puVar22 + ~(ulong)puVar54 >> 3) + 1;
    uVar41 = uVar55 & 0x3ffffffffffffff8;
    puVar22 = in_stack_00000078 + 4;
    puVar28 = puVar54 + 4;
    uVar42 = uVar41;
    do {
      uVar14 = puVar22[-4];
      uVar48 = puVar22[-1];
      uVar44 = puVar22[-2];
      uVar50 = puVar22[1];
      uVar58 = *puVar22;
      uVar60 = puVar22[3];
      uVar59 = puVar22[2];
      puVar28[-3] = puVar22[-3];
      puVar28[-4] = uVar14;
      puVar28[-1] = uVar48;
      puVar28[-2] = uVar44;
      puVar28[1] = uVar50;
      *puVar28 = uVar58;
      puVar28[3] = uVar60;
      puVar28[2] = uVar59;
      uVar42 = uVar42 - 8;
      puVar22 = puVar22 + 8;
      puVar28 = puVar28 + 8;
    } while (uVar42 != 0);
    puVar28 = in_stack_00000078 + uVar41;
    puVar23 = puVar54 + uVar41;
    if (uVar55 != uVar41) goto code_r0x000b0490;
  }
  pcVar15 = (char *)((long)puVar25 + 2);
  *(undefined2 *)puVar25 = uStack0000000000000118;
  lVar53 = (long)(int)uVar30;
  uVar55 = lVar53 - 4;
  if ((in_w6 != 0) && (in_stack_000000a0 < pcVar15 + uVar55 / 0xff + 6)) {
    puStack00000000000000c8 = in_stack_00000078;
    goto code_r0x000b4f20;
  }
  if (uVar55 < 0xf) {
    *in_stack_000000b8 = *in_stack_000000b8 + (char)uVar55;
  }
  else {
    *in_stack_000000b8 = *in_stack_000000b8 + '\x0f';
    uVar55 = lVar53 - 0x13;
    if (0x1fd < uVar55) {
      lVar35 = ((lVar53 - 0x211U) / 0x1fe) * 2;
      _memset(pcVar15,0xff,lVar35 + 2);
      param_2 = param_2 & 0xffffffff;
      unaff_w30 = -0x61c8864f;
      pcVar15 = (char *)((long)puVar54 + lVar35 + uVar52 + 4);
      uVar55 = (lVar53 - 0x211U) % 0x1fe;
      in_w6 = in_stack_00000168._4_4_;
    }
    pcVar16 = pcVar15;
    if (0xfe < uVar55) {
      pcVar16 = pcVar15 + 1;
      *pcVar15 = -1;
      uVar55 = uVar55 - 0xff;
    }
    pcVar15 = pcVar16 + 1;
    *pcVar16 = (char)uVar55;
  }
  uStack0000000000000118 = (undefined2)param_2;
  puVar54 = (ulong *)(pcVar15 + 1);
  puStack00000000000000c8 = (ulong *)((long)in_x16 + lVar53);
  uVar52 = (long)unaff_x21 - (long)puStack00000000000000c8;
  if ((in_w6 != 0) && (in_stack_000000a0 < (char *)((long)puVar54 + uVar52 + uVar52 / 0xff + 8)))
  goto code_r0x000b4f1c;
  uVar55 = uVar52 - 0xf;
  if (uVar52 < 0xf) {
    *pcVar15 = (char)((int)uVar52 << 4);
  }
  else {
    *pcVar15 = -0x10;
    puVar25 = puVar54;
    if (0xfe < uVar55) {
      uVar55 = (uVar52 - 0x10e) / 0xff;
      _memset(puVar54,0xff,uVar55 + 1);
      unaff_w30 = -0x61c8864f;
      puVar25 = (ulong *)(pcVar15 + uVar55 + 2);
      uVar55 = (uVar52 - 0x10e) % 0xff;
      in_w6 = in_stack_00000168._4_4_;
    }
    puVar54 = (ulong *)((long)puVar25 + 1);
    *(char *)puVar25 = (char)uVar55;
  }
  puVar25 = (ulong *)((long)puVar54 + uVar52);
  uVar52 = (long)puVar54 - (long)puStack00000000000000c8;
  puVar22 = (ulong *)(uVar52 + (long)unaff_x21);
  if ((ulong *)(uVar52 + (long)unaff_x21) <= puVar54 + 1) {
    puVar22 = puVar54 + 1;
  }
  if (((char *)((long)puVar22 + ~(ulong)puVar54) < &segment_command_00000020.vmaddr) ||
     (uVar52 < 0x40)) {
    unaff_x27 = *(ulong *)(unaff_x29 + -0x80);
    puVar22 = puStack00000000000000c8;
code_r0x000b06d0:
    do {
      puVar28 = puVar54 + 1;
      *puVar54 = *puVar22;
      puVar22 = puVar22 + 1;
      puVar54 = puVar28;
    } while (puVar28 < puVar25);
  }
  else {
    uVar55 = ((long)puVar22 + ~(ulong)puVar54 >> 3) + 1;
    uVar41 = uVar55 & 0x3ffffffffffffff8;
    puVar22 = (ulong *)((long)in_x16 + lVar53 + 0x20);
    puVar28 = puVar54 + 4;
    uVar42 = uVar41;
    do {
      uVar14 = puVar22[-4];
      uVar48 = puVar22[-1];
      uVar44 = puVar22[-2];
      uVar50 = puVar22[1];
      uVar58 = *puVar22;
      uVar60 = puVar22[3];
      uVar59 = puVar22[2];
      puVar28[-3] = puVar22[-3];
      puVar28[-4] = uVar14;
      puVar28[-1] = uVar48;
      puVar28[-2] = uVar44;
      puVar28[1] = uVar50;
      *puVar28 = uVar58;
      puVar28[3] = uVar60;
      puVar28[2] = uVar59;
      uVar42 = uVar42 - 8;
      puVar22 = puVar22 + 8;
      puVar28 = puVar28 + 8;
    } while (uVar42 != 0);
    unaff_x27 = *(ulong *)(unaff_x29 + -0x80);
    puVar22 = puStack00000000000000c8 + uVar41;
    puVar54 = puVar54 + uVar41;
    if (uVar55 != uVar41) goto code_r0x000b06d0;
  }
  in_stack_000000b8 = (char *)((long)puVar25 + 2);
  *(undefined2 *)puVar25 = uStack0000000000000118;
  uVar55 = lVar57 - 4;
  if ((in_w6 == 0) || (in_stack_000000b8 + uVar55 / 0xff + 6 <= in_stack_000000a0)) {
    puStack00000000000000c8 = puVar51;
    if (uVar55 < 0xf) {
      *pcVar15 = *pcVar15 + (char)uVar55;
    }
    else {
      *pcVar15 = *pcVar15 + '\x0f';
      uVar55 = lVar57 - 0x13;
      if (uVar55 < 0x1fe) {
      }
      else {
        lVar53 = ((lVar57 - 0x211U) / 0x1fe) * 2;
        _memset(in_stack_000000b8,0xff,lVar53 + 2);
        unaff_w30 = -0x61c8864f;
        in_stack_000000b8 = (char *)((long)unaff_x21 + lVar53 + uVar52 + 4);
        uVar55 = (lVar57 - 0x211U) % 0x1fe;
        in_w6 = in_stack_00000168._4_4_;
      }
      pcVar15 = in_stack_000000b8;
      if (0xfe < uVar55) {
        pcVar15 = in_stack_000000b8 + 1;
        *in_stack_000000b8 = -1;
        uVar55 = uVar55 - 0xff;
      }
      *pcVar15 = (char)uVar55;
      in_stack_000000b8 = pcVar15 + 1;
    }
joined_r0x000b07fc:
    if (puStack00000000000000c8 <= unaff_x28) {
      lVar53 = *(long *)(unaff_x29 + -0xb8);
      lVar57 = *(long *)(lVar53 + 0x28);
      *(long *)(unaff_x29 + -0xa8) = lVar57;
      uVar30 = *(uint *)(lVar53 + 0x18);
      uVar55 = (ulong)uVar30;
      uVar11 = *(uint *)(lVar53 + 0x1c);
      *(uint *)(unaff_x29 + -0xd8) = uVar11 + 0x10000;
      puVar54 = *(ulong **)(lVar53 + 8);
      puVar25 = *(ulong **)(lVar53 + 0x10);
      *(ulong *)(unaff_x29 + -0xe0) = (long)puVar25 + (uVar55 - uVar11);
      *(uint *)(unaff_x29 + -0x90) = uVar30 - 4;
      *(ulong **)(unaff_x29 + -0xf0) = puVar54 + 1;
      uVar36 = *(uint *)(lVar53 + 0x20);
      *(int *)(unaff_x29 + -0xa0) = -4 - (int)puStack00000000000000c8;
      *(ulong **)(unaff_x29 + -0xb0) = puStack00000000000000c8;
      uVar52 = (ulong)uVar36;
      puVar51 = puStack00000000000000c8;
      uVar42 = unaff_x27;
      do {
        uVar36 = uVar30 + (int)((long)puVar51 - (long)puVar54);
        uVar10 = uVar11;
        if (*(uint *)(unaff_x29 + -0xd8) <= uVar36) {
          uVar10 = uVar36 - 0xffff;
        }
        uVar34 = (uint)*puVar51;
        lVar53 = *(long *)(unaff_x29 + -0x98);
        uVar18 = uVar34;
        if ((uint)uVar52 < uVar36) {
          do {
            lVar35 = (ulong)((uint)(*(int *)((long)puVar54 + (uVar52 - uVar55)) * unaff_w30) >> 0x11
                            ) * 4;
            uVar18 = (int)uVar52 - *(int *)(lVar53 + lVar35);
            if (0xfffe < uVar18) {
              uVar18 = 0xffff;
            }
            *(short *)(unaff_x23 + (uVar52 & 0xffff) * 2) = (short)uVar18;
            *(int *)(lVar53 + lVar35) = (int)uVar52;
            uVar52 = uVar52 + 1;
          } while (uVar52 < uVar36);
          uVar18 = (uint)*puVar51;
        }
        *(uint *)(*(long *)(unaff_x29 + -0xb8) + 0x20) = uVar36;
        uVar18 = *(uint *)(lVar53 + (ulong)(uVar18 * unaff_w30 >> 0x11) * 4);
        uVar52 = (ulong)uVar18;
        bVar8 = true;
        bVar9 = false;
        if (uVar10 <= uVar18) {
          bVar9 = SBORROW4((int)uVar42,1);
          bVar8 = (int)uVar42 + -1 < 0;
        }
        unaff_x27 = uVar42;
        if (bVar8 == bVar9) {
          iVar43 = 0;
          uVar18 = 0;
          *(ulong *)(unaff_x29 + -0xf8) = ((long)puVar51 - (long)puVar54) + uVar55;
          puVar22 = (ulong *)((long)puVar51 + 4);
          *(uint **)(unaff_x29 + -0xd0) = (uint *)((long)puVar51 + 0xc);
          *(undefined8 *)(unaff_x29 + -200) = 0;
          *(uint *)(unaff_x29 + -0xc0) =
               (uint)((uVar34 & 0xffff) == uVar34 >> 0x10 && (uVar34 & 0xff) == uVar34 >> 0x18);
          unaff_x22 = 3;
          uVar41 = CONCAT44(uVar34,uVar34);
          do {
            uVar19 = (uint)uVar52;
            uVar49 = uVar30 - uVar19;
            iVar33 = (int)puVar22;
            uVar32 = (uint)unaff_x22;
            if (uVar30 < uVar19 || uVar49 == 0) {
              puVar29 = (uint *)((long)puVar54 + (ulong)(uVar19 - uVar30));
              if ((*(short *)((long)puVar51 + (long)(int)uVar32 + -1) !=
                   *(short *)((long)puVar29 + (long)(int)uVar32 + -1)) || (*puVar29 != uVar34))
              goto code_r0x000ad654;
              puVar23 = (ulong *)(puVar29 + 1);
              puVar28 = puVar22;
              if (puVar22 < unaff_x28) {
                uVar52 = *puVar22 ^ *puVar23;
                if (uVar52 == 0) {
                  puVar23 = (ulong *)(puVar29 + 3);
                  puVar28 = *(ulong **)(unaff_x29 + -0xd0);
                  goto joined_r0x000adb64;
                }
                uVar52 = (uVar52 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar52 & 0x5555555555555555) << 1;
                uVar52 = (uVar52 & 0xcccccccccccccccc) >> 2 | (uVar52 & 0x3333333333333333) << 2;
                uVar52 = (uVar52 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar52 & 0xf0f0f0f0f0f0f0f) << 4;
                uVar52 = (uVar52 & 0xff00ff00ff00ff00) >> 8 | (uVar52 & 0xff00ff00ff00ff) << 8;
                uVar52 = (uVar52 & 0xffff0000ffff0000) >> 0x10 | (uVar52 & 0xffff0000ffff) << 0x10;
                iVar46 = (int)((ulong)LZCOUNT(uVar52 >> 0x20 | uVar52 << 0x20) >> 3);
              }
              else {
joined_r0x000adb64:
                if (puVar28 < unaff_x28) {
                  iVar46 = *(int *)(unaff_x29 + -0xa0) + (int)puVar28;
                  do {
                    uVar52 = *puVar28 ^ *puVar23;
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
                      iVar46 = (int)((ulong)LZCOUNT(uVar52 >> 0x20 | uVar52 << 0x20) >> 3) + iVar46;
                      goto code_r0x000ad618;
                    }
                    puVar28 = puVar28 + 1;
                    puVar23 = puVar23 + 1;
                    iVar46 = iVar46 + 8;
                  } while (puVar28 < unaff_x28);
                }
                if (puVar28 < in_stack_00000060) {
                  if ((uint)*puVar23 == (uint)*puVar28) {
                    puVar28 = (ulong *)((long)puVar28 + 4);
                    puVar23 = (ulong *)((long)puVar23 + 4);
                  }
                  if (puVar28 < in_stack_00000058) goto code_r0x000adad8;
code_r0x000ad538:
                  if (puVar28 < *(ulong **)(unaff_x29 + -0x88)) {
code_r0x000ad544:
                    if ((char)*puVar23 == (char)*puVar28) {
                      puVar28 = (ulong *)((long)puVar28 + 1);
                    }
                  }
                }
                else {
                  if (in_stack_00000058 <= puVar28) goto code_r0x000ad538;
code_r0x000adad8:
                  if ((short)*puVar23 == (short)*puVar28) {
                    puVar28 = (ulong *)((long)puVar28 + 2);
                    puVar23 = (ulong *)((long)puVar23 + 2);
                  }
                  if (puVar28 < *(ulong **)(unaff_x29 + -0x88)) goto code_r0x000ad544;
                }
                iVar46 = (int)puVar28 - iVar33;
              }
code_r0x000ad618:
              uVar26 = iVar46 + 4U;
              uVar4 = uVar36 - uVar19;
              if ((int)(iVar46 + 4U) <= (int)uVar32) {
                uVar26 = uVar32;
                uVar4 = uVar18;
              }
              uVar18 = uVar4;
              unaff_x22 = (ulong)uVar26;
            }
            else if ((uVar19 <= *(uint *)(unaff_x29 + -0x90)) &&
                    (puVar29 = (uint *)((long)puVar25 + (ulong)(uVar19 - uVar11)),
                    *puVar29 == uVar34)) {
              puVar28 = (ulong *)((long)puVar51 + (ulong)uVar49);
              puVar23 = *(ulong **)(unaff_x29 + -0x88);
              if (puVar28 <= *(ulong **)(unaff_x29 + -0x88)) {
                puVar23 = puVar28;
              }
              puVar12 = (ulong *)(puVar29 + 1);
              puVar13 = (ulong *)((long)puVar23 - 7);
              puVar21 = puVar22;
              if (puVar22 < puVar13) {
                uVar52 = *puVar22 ^ *puVar12;
                if (uVar52 == 0) {
                  puVar12 = (ulong *)(puVar29 + 3);
                  puVar21 = *(ulong **)(unaff_x29 + -0xd0);
                  goto joined_r0x000adb54;
                }
                uVar52 = (uVar52 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar52 & 0x5555555555555555) << 1;
                uVar52 = (uVar52 & 0xcccccccccccccccc) >> 2 | (uVar52 & 0x3333333333333333) << 2;
                uVar52 = (uVar52 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar52 & 0xf0f0f0f0f0f0f0f) << 4;
                uVar52 = (uVar52 & 0xff00ff00ff00ff00) >> 8 | (uVar52 & 0xff00ff00ff00ff) << 8;
                uVar52 = (uVar52 & 0xffff0000ffff0000) >> 0x10 | (uVar52 & 0xffff0000ffff) << 0x10;
                iVar46 = (int)((ulong)LZCOUNT(uVar52 >> 0x20 | uVar52 << 0x20) >> 3);
              }
              else {
joined_r0x000adb54:
                if (puVar21 < puVar13) {
                  iVar46 = *(int *)(unaff_x29 + -0xa0) + (int)puVar21;
                  do {
                    uVar52 = *puVar21 ^ *puVar12;
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
                      iVar46 = (int)((ulong)LZCOUNT(uVar52 >> 0x20 | uVar52 << 0x20) >> 3) + iVar46;
                      goto code_r0x000ad478;
                    }
                    puVar21 = puVar21 + 1;
                    puVar12 = puVar12 + 1;
                    iVar46 = iVar46 + 8;
                  } while (puVar21 < puVar13);
                }
                if (puVar21 < (ulong *)((long)puVar23 - 3U)) {
                  if ((uint)*puVar12 == (uint)*puVar21) {
                    puVar21 = (ulong *)((long)puVar21 + 4);
                    puVar12 = (ulong *)((long)puVar12 + 4);
                  }
                  if (puVar21 < (ulong *)((long)puVar23 - 1U)) goto code_r0x000adaa4;
                }
                else if (puVar21 < (ulong *)((long)puVar23 - 1U)) {
code_r0x000adaa4:
                  if ((short)*puVar12 == (short)*puVar21) {
                    puVar21 = (ulong *)((long)puVar21 + 2);
                    puVar12 = (ulong *)((long)puVar12 + 2);
                  }
                }
                if (puVar21 < puVar23) {
                  if ((char)*puVar12 == (char)*puVar21) {
                    puVar21 = (ulong *)((long)puVar21 + 1);
                  }
                }
                iVar46 = (int)puVar21 - iVar33;
              }
code_r0x000ad478:
              uVar26 = iVar46 + 4;
              if (puVar28 < *(ulong **)(unaff_x29 + -0x88)) {
                unaff_x26 = *(char **)(unaff_x29 + -0x78);
                if ((ulong *)((long)puVar51 + (long)(int)uVar26) == puVar23) {
                  puVar21 = puVar54;
                  puVar28 = puVar23;
                  if (puVar23 < unaff_x28) {
                    uVar52 = *puVar23 ^ *puVar54;
                    if (uVar52 == 0) {
                      puVar28 = puVar23 + 1;
                      puVar21 = *(ulong **)(unaff_x29 + -0xf0);
                      goto code_r0x000ad568;
                    }
                    uVar52 = (uVar52 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar52 & 0x5555555555555555) << 1
                    ;
                    uVar52 = (uVar52 & 0xcccccccccccccccc) >> 2 | (uVar52 & 0x3333333333333333) << 2
                    ;
                    uVar52 = (uVar52 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar52 & 0xf0f0f0f0f0f0f0f) << 4;
                    uVar52 = (uVar52 & 0xff00ff00ff00ff00) >> 8 | (uVar52 & 0xff00ff00ff00ff) << 8;
                    uVar52 = (uVar52 & 0xffff0000ffff0000) >> 0x10 |
                             (uVar52 & 0xffff0000ffff) << 0x10;
                    iVar46 = (int)((ulong)LZCOUNT(uVar52 >> 0x20 | uVar52 << 0x20) >> 3);
                  }
                  else {
code_r0x000ad568:
                    if (puVar28 < unaff_x28) {
                      uVar52 = *(long *)(unaff_x29 + -0xb0) + (ulong)uVar49;
                      uVar14 = in_stack_00000150;
                      if (uVar52 <= in_stack_00000150) {
                        uVar14 = uVar52;
                      }
                      iVar46 = (int)puVar28 - (int)uVar14;
                      do {
                        uVar52 = *puVar28 ^ *puVar21;
                        if (uVar52 != 0) {
                          uVar52 = (uVar52 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                                   (uVar52 & 0x5555555555555555) << 1;
                          uVar52 = (uVar52 & 0xcccccccccccccccc) >> 2 |
                                   (uVar52 & 0x3333333333333333) << 2;
                          uVar52 = (uVar52 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                                   (uVar52 & 0xf0f0f0f0f0f0f0f) << 4;
                          uVar52 = (uVar52 & 0xff00ff00ff00ff00) >> 8 |
                                   (uVar52 & 0xff00ff00ff00ff) << 8;
                          uVar52 = (uVar52 & 0xffff0000ffff0000) >> 0x10 |
                                   (uVar52 & 0xffff0000ffff) << 0x10;
                          iVar46 = (int)((ulong)LZCOUNT(uVar52 >> 0x20 | uVar52 << 0x20) >> 3) +
                                   iVar46;
                          goto code_r0x000ad63c;
                        }
                        puVar28 = puVar28 + 1;
                        puVar21 = puVar21 + 1;
                        iVar46 = iVar46 + 8;
                      } while (puVar28 < unaff_x28);
                    }
                    if (puVar28 < in_stack_00000060) {
                      if ((uint)*puVar21 == (uint)*puVar28) {
                        puVar28 = (ulong *)((long)puVar28 + 4);
                        puVar21 = (ulong *)((long)puVar21 + 4);
                      }
                      if (puVar28 < in_stack_00000058) goto code_r0x000adb10;
code_r0x000ad5e0:
                      if (puVar28 < *(ulong **)(unaff_x29 + -0x88)) {
code_r0x000ad5ec:
                        if ((char)*puVar21 == (char)*puVar28) {
                          puVar28 = (ulong *)((long)puVar28 + 1);
                        }
                      }
                    }
                    else {
                      if (in_stack_00000058 <= puVar28) goto code_r0x000ad5e0;
code_r0x000adb10:
                      if ((short)*puVar21 == (short)*puVar28) {
                        puVar28 = (ulong *)((long)puVar28 + 2);
                        puVar21 = (ulong *)((long)puVar21 + 2);
                      }
                      if (puVar28 < *(ulong **)(unaff_x29 + -0x88)) goto code_r0x000ad5ec;
                    }
                    iVar46 = (int)puVar28 - (int)puVar23;
                  }
code_r0x000ad63c:
                  uVar26 = iVar46 + uVar26;
                  goto code_r0x000ad640;
                }
              }
              else {
code_r0x000ad640:
                unaff_x26 = *(char **)(unaff_x29 + -0x78);
              }
              uVar4 = uVar36 - uVar19;
              if ((int)uVar26 <= (int)uVar32) {
                uVar26 = uVar32;
                uVar4 = uVar18;
              }
              uVar18 = uVar4;
              unaff_x22 = (ulong)uVar26;
              unaff_x27 = *(ulong *)(unaff_x29 + -0x80);
            }
code_r0x000ad654:
            iVar46 = (int)uVar42;
            uVar42 = (ulong)(iVar46 - 1);
            uVar32 = (uint)*(ushort *)(unaff_x23 + (ulong)(uVar19 & 0xffff) * 2);
            if (((int)unaff_x27 < 0x81) || (uVar32 != 1)) {
code_r0x000ad7f0:
              uVar52 = (ulong)(uVar19 - uVar32);
            }
            else {
              if (iVar43 == 0) {
                if (*(int *)(unaff_x29 + -0xc0) != 0) {
                  if (puVar22 < unaff_x28) {
                    lVar53 = 4;
                    do {
                      uVar52 = *(ulong *)((long)puVar51 + lVar53) ^ uVar41;
                      if (uVar52 != 0) {
                        uVar52 = (uVar52 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                                 (uVar52 & 0x5555555555555555) << 1;
                        uVar52 = (uVar52 & 0xcccccccccccccccc) >> 2 |
                                 (uVar52 & 0x3333333333333333) << 2;
                        uVar52 = (uVar52 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                                 (uVar52 & 0xf0f0f0f0f0f0f0f) << 4;
                        uVar52 = (uVar52 & 0xff00ff00ff00ff00) >> 8 |
                                 (uVar52 & 0xff00ff00ff00ff) << 8;
                        uVar52 = (uVar52 & 0xffff0000ffff0000) >> 0x10 |
                                 (uVar52 & 0xffff0000ffff) << 0x10;
                        puVar23 = (ulong *)(*(long *)(unaff_x29 + -0xb0) +
                                            ((ulong)LZCOUNT(uVar52 >> 0x20 | uVar52 << 0x20) >> 3) +
                                           lVar53);
                        goto code_r0x000ad7c8;
                      }
                      lVar53 = lVar53 + 8;
                      puVar28 = (ulong *)((long)puVar51 + lVar53);
                    } while (puVar28 < unaff_x28);
                    puVar23 = (ulong *)(*(long *)(unaff_x29 + -0xb0) + lVar53);
                    puVar21 = *(ulong **)(unaff_x29 + -0x88);
                    if (puVar28 < puVar21) goto code_r0x000ad6e0;
                  }
                  else {
                    puVar21 = *(ulong **)(unaff_x29 + -0x88);
                    puVar23 = puVar22;
                    puVar28 = puVar22;
                    if (puVar22 < puVar21) {
code_r0x000ad6e0:
                      lVar53 = (long)puVar21 - (long)puVar23;
                      puVar23 = (ulong *)((long)puVar28 + lVar53);
                      uVar52 = uVar41;
                      do {
                        if ((uint)(byte)*puVar28 != ((uint)uVar52 & 0xff)) goto code_r0x000ad70c;
                        puVar28 = (ulong *)((long)puVar28 + 1);
                        uVar52 = uVar52 >> 8;
                        lVar53 = lVar53 + -1;
                      } while (lVar53 != 0);
                      puVar28 = puVar23;
code_r0x000ad70c:
                      puVar23 = puVar28;
                    }
                  }
code_r0x000ad7c8:
                  *(ulong *)(unaff_x29 + -200) = (ulong)(uint)((int)puVar23 - iVar33) + 4;
                  iVar43 = 2;
                  goto code_r0x000ad67c;
                }
                iVar43 = 1;
                goto code_r0x000ad7f0;
              }
              if (iVar43 != 2) {
code_r0x000ad7e0:
                unaff_x27 = *(ulong *)(unaff_x29 + -0x80);
                goto code_r0x000ad7f0;
              }
code_r0x000ad67c:
              uVar26 = uVar19 - 1;
              if (uVar26 < uVar10) goto code_r0x000ad7e0;
              if (uVar49 < 3) {
                iVar43 = 2;
                unaff_x27 = *(ulong *)(unaff_x29 + -0x80);
                goto code_r0x000ad7f0;
              }
              puVar28 = (ulong *)((long)puVar25 + (ulong)(uVar26 - uVar11));
              puVar23 = (ulong *)((long)puVar54 + (ulong)(uVar26 - uVar30));
              if (uVar26 < uVar30) {
                puVar23 = puVar28;
              }
              if ((uint)*puVar23 != uVar34) {
                iVar43 = 2;
                unaff_x27 = *(ulong *)(unaff_x29 + -0x80);
                unaff_x26 = *(char **)(unaff_x29 + -0x78);
                goto code_r0x000ad7f0;
              }
              puVar21 = *(ulong **)(unaff_x29 + -0x88);
              if (uVar26 < uVar30) {
                puVar21 = *(ulong **)(unaff_x29 + -0xe0);
              }
              puVar12 = (ulong *)((long)puVar23 + 4);
              puVar13 = puVar12;
              if (puVar12 < (ulong *)((long)puVar21 - 7U)) {
                puVar45 = puVar12;
                do {
                  uVar52 = *puVar13 ^ uVar41;
                  if (uVar52 != 0) {
                    uVar52 = (uVar52 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar52 & 0x5555555555555555) << 1
                    ;
                    uVar52 = (uVar52 & 0xcccccccccccccccc) >> 2 | (uVar52 & 0x3333333333333333) << 2
                    ;
                    uVar52 = (uVar52 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar52 & 0xf0f0f0f0f0f0f0f) << 4;
                    uVar52 = (uVar52 & 0xff00ff00ff00ff00) >> 8 | (uVar52 & 0xff00ff00ff00ff) << 8;
                    uVar52 = (uVar52 & 0xffff0000ffff0000) >> 0x10 |
                             (uVar52 & 0xffff0000ffff) << 0x10;
                    puVar13 = (ulong *)((long)puVar45 +
                                       ((ulong)LZCOUNT(uVar52 >> 0x20 | uVar52 << 0x20) >> 3));
                    goto code_r0x000ad818;
                  }
                  puVar13 = puVar13 + 1;
                  puVar45 = puVar45 + 1;
                } while (puVar13 < (ulong *)((long)puVar21 - 7U));
              }
              if (puVar13 < puVar21) {
                lVar53 = (long)puVar21 - (long)puVar13;
                uVar52 = uVar41;
                do {
                  if ((uint)(byte)*puVar13 != ((uint)uVar52 & 0xff)) goto code_r0x000ad818;
                  puVar13 = (ulong *)((long)puVar13 + 1);
                  uVar52 = uVar52 >> 8;
                  lVar53 = lVar53 + -1;
                } while (lVar53 != 0);
                puVar13 = puVar21;
              }
code_r0x000ad818:
              uVar14 = (long)puVar13 - (long)puVar12;
              uVar52 = (uVar14 & 0xffffffff) + 4;
              if (uVar26 < uVar30) {
                unaff_x26 = *(char **)(unaff_x29 + -0x78);
                puVar21 = puVar25;
                if ((long)puVar28 + uVar52 == *(long *)(unaff_x29 + -0xe0)) {
                  puVar28 = puVar54;
                  puVar12 = puVar54;
                  uVar44 = uVar41;
                  if ((uVar14 & 3) != 0) {
                    uVar49 = (int)uVar14 * -8 & 0x1f;
                    uVar49 = uVar34 >> uVar49 | uVar34 << 0x20 - uVar49;
                    uVar44 = CONCAT44(uVar49,uVar49);
                  }
                  for (; puVar28 < unaff_x28; puVar28 = puVar28 + 1) {
                    uVar14 = *puVar28 ^ uVar44;
                    if (uVar14 != 0) {
                      uVar14 = (uVar14 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                               (uVar14 & 0x5555555555555555) << 1;
                      uVar14 = (uVar14 & 0xcccccccccccccccc) >> 2 |
                               (uVar14 & 0x3333333333333333) << 2;
                      uVar14 = (uVar14 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                               (uVar14 & 0xf0f0f0f0f0f0f0f) << 4;
                      uVar14 = (uVar14 & 0xff00ff00ff00ff00) >> 8 | (uVar14 & 0xff00ff00ff00ff) << 8
                      ;
                      uVar14 = (uVar14 & 0xffff0000ffff0000) >> 0x10 |
                               (uVar14 & 0xffff0000ffff) << 0x10;
                      puVar12 = (ulong *)((long)puVar12 +
                                         ((ulong)LZCOUNT(uVar14 >> 0x20 | uVar14 << 0x20) >> 3));
                      goto code_r0x000ad8dc;
                    }
                    puVar12 = puVar12 + 1;
                  }
                  if (puVar28 < *(ulong **)(unaff_x29 + -0x88)) {
                    lVar53 = (long)*(ulong **)(unaff_x29 + -0x88) - (long)puVar12;
                    puVar13 = (ulong *)((long)puVar28 + lVar53);
                    do {
                      puVar12 = puVar28;
                      if ((uint)(byte)*puVar28 != ((uint)uVar44 & 0xff)) goto code_r0x000ad8dc;
                      puVar28 = (ulong *)((long)puVar28 + 1);
                      uVar44 = uVar44 >> 8;
                      lVar53 = lVar53 + -1;
                    } while (lVar53 != 0);
                    puVar12 = puVar13;
                  }
code_r0x000ad8dc:
                  uVar52 = (uint)((int)puVar12 - (int)puVar54) + uVar52;
                }
              }
              else {
                unaff_x26 = *(char **)(unaff_x29 + -0x78);
                puVar21 = puVar54;
              }
              *(uint *)(unaff_x29 + -0x6c) = uVar34;
              puVar28 = puVar23;
              do {
                puVar12 = puVar28;
                if (puVar12 < (ulong *)((long)puVar21 + 4U)) break;
                puVar28 = (ulong *)((long)puVar12 + -4);
              } while (*(uint *)((long)puVar12 + -4) == uVar34);
              puVar28 = puVar12;
              if (puVar21 < puVar12) {
                lVar53 = 0;
                do {
                  puVar28 = (ulong *)((long)puVar12 + lVar53);
                  if (*(char *)((long)puVar28 + -1) != unaff_x26[lVar53]) goto code_r0x000ad94c;
                  lVar53 = lVar53 + -1;
                } while (puVar21 < (ulong *)((long)puVar12 + lVar53));
                puVar28 = puVar21;
              }
code_r0x000ad94c:
              iVar43 = (int)((long)puVar23 - (long)puVar28);
              uVar14 = *(ulong *)(unaff_x29 + -200);
              if (((uVar30 <= uVar26) &&
                  ((ulong *)((long)puVar23 - ((long)puVar23 - (long)puVar28 & 0xffffffffU)) ==
                   puVar54)) && (uVar11 < uVar30)) {
                uVar19 = iVar43 * 8 & 0x1f;
                uVar49 = uVar34;
                if ((-iVar43 & 3U) != 0) {
                  uVar49 = uVar34 >> uVar19 | uVar34 << 0x20 - uVar19;
                }
                *(uint *)(unaff_x29 + -0x6c) = uVar49;
                lVar53 = uVar55 - uVar11;
                do {
                  lVar35 = lVar53;
                  if (lVar35 < 4) {
                    puVar28 = (ulong *)((long)puVar25 + lVar35);
                    if (lVar35 < 1) goto code_r0x000ad9dc;
                    break;
                  }
                  lVar53 = lVar35 + -4;
                } while (*(uint *)((long)puVar25 + lVar35 + -4) == uVar49);
                pcVar15 = unaff_x26;
                puVar28 = (ulong *)((long)puVar25 + lVar35);
                do {
                  puVar23 = (ulong *)((long)puVar28 - 1);
                  if ((char)*puVar23 != *pcVar15) goto code_r0x000ad9dc;
                  pcVar15 = pcVar15 + -1;
                  puVar28 = puVar23;
                } while (puVar25 < puVar23);
                puVar28 = puVar25;
code_r0x000ad9dc:
                iVar43 = ((int)*(undefined8 *)(unaff_x29 + -0xe0) - (int)puVar28) + iVar43;
                uVar14 = *(ulong *)(unaff_x29 + -200);
              }
              uVar49 = uVar26 - iVar43;
              if (uVar26 - iVar43 <= uVar10) {
                uVar49 = uVar10;
              }
              uVar44 = uVar52 + (uVar26 - uVar49);
              if ((uVar14 < uVar52) || (uVar44 < uVar14)) {
                if (uVar30 + ~uVar49 < 3) {
                  iVar43 = 2;
                  unaff_x27 = *(ulong *)(unaff_x29 + -0x80);
                  uVar52 = uVar55;
                }
                else {
                  if (uVar14 <= uVar44) {
                    uVar44 = uVar14;
                  }
                  unaff_x27 = *(ulong *)(unaff_x29 + -0x80);
                  if ((ulong)(long)(int)unaff_x22 < uVar44) {
                    if (*(long *)(unaff_x29 + -0xf8) - (ulong)uVar49 >> 0x10 != 0)
                    goto code_r0x000ad094;
                    uVar18 = uVar36 - uVar49;
                    unaff_x22 = uVar44;
                  }
                  uVar19 = (uint)*(ushort *)(unaff_x23 + (ulong)(uVar49 & 0xffff) * 2);
                  uVar52 = (ulong)(uVar49 - uVar19);
                  if (uVar49 < uVar19) goto code_r0x000ad094;
                  iVar43 = 2;
                }
              }
              else {
                uVar49 = (uVar26 - (int)uVar14) + (int)uVar52;
                uVar19 = uVar30;
                if (2 < uVar30 + ~uVar49) {
                  uVar19 = uVar49;
                }
                iVar43 = 2;
                unaff_x27 = *(ulong *)(unaff_x29 + -0x80);
                uVar52 = (ulong)uVar19;
              }
            }
            if (((uint)uVar52 < uVar10) || (iVar46 < 2)) goto code_r0x000ad094;
          } while( true );
        }
        uVar18 = 0;
        unaff_x22 = 3;
code_r0x000ad094:
        if (((uVar36 < *(uint *)(unaff_x29 + -0xd8)) && (*(int *)(unaff_x29 + -0xe4) == 1)) &&
           (0 < (int)uVar42)) {
          lVar53 = (*(long *)(lVar57 + 0x40000) - *(long *)(&UNK_00040008 + lVar57)) +
                   (ulong)*(uint *)(&UNK_00040018 + lVar57);
          uVar49 = *(uint *)(*(long *)(unaff_x29 + -0xa8) +
                            (ulong)((uint)*puVar51 * -0x61c8864f >> 0x11) * 4);
          iVar43 = (uVar49 + uVar10) - (int)lVar53;
          uVar10 = uVar36 - iVar43;
          if (uVar10 >> 0x10 == 0) {
            puVar22 = (ulong *)((long)puVar51 + 4);
            do {
              if ((int)uVar42 == 0) break;
              puVar29 = (uint *)((*(long *)(&UNK_00040008 + lVar57) -
                                 (ulong)*(uint *)(&UNK_00040018 + lVar57)) + (ulong)uVar49);
              if (*puVar29 == uVar34) {
                puVar28 = (ulong *)((long)puVar51 + (lVar53 - (ulong)uVar49));
                puVar23 = *(ulong **)(unaff_x29 + -0x88);
                if (puVar28 <= *(ulong **)(unaff_x29 + -0x88)) {
                  puVar23 = puVar28;
                }
                puVar21 = (ulong *)(puVar29 + 1);
                puVar12 = (ulong *)((long)puVar23 - 7);
                puVar28 = puVar22;
                if (puVar22 < puVar12) {
                  uVar52 = *puVar22 ^ *puVar21;
                  if (uVar52 == 0) {
                    puVar21 = (ulong *)(puVar29 + 3);
                    puVar28 = (ulong *)((long)puVar51 + 0xc);
                    goto joined_r0x000ad284;
                  }
                  uVar52 = (uVar52 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar52 & 0x5555555555555555) << 1;
                  uVar52 = (uVar52 & 0xcccccccccccccccc) >> 2 | (uVar52 & 0x3333333333333333) << 2;
                  uVar52 = (uVar52 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar52 & 0xf0f0f0f0f0f0f0f) << 4;
                  uVar52 = (uVar52 & 0xff00ff00ff00ff00) >> 8 | (uVar52 & 0xff00ff00ff00ff) << 8;
                  uVar52 = (uVar52 & 0xffff0000ffff0000) >> 0x10 | (uVar52 & 0xffff0000ffff) << 0x10
                  ;
                  iVar33 = (int)((ulong)LZCOUNT(uVar52 >> 0x20 | uVar52 << 0x20) >> 3);
                }
                else {
joined_r0x000ad284:
                  if (puVar28 < puVar12) {
                    iVar33 = *(int *)(unaff_x29 + -0xa0) + (int)puVar28;
                    do {
                      uVar52 = *puVar28 ^ *puVar21;
                      if (uVar52 != 0) {
                        uVar52 = (uVar52 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                                 (uVar52 & 0x5555555555555555) << 1;
                        uVar52 = (uVar52 & 0xcccccccccccccccc) >> 2 |
                                 (uVar52 & 0x3333333333333333) << 2;
                        uVar52 = (uVar52 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                                 (uVar52 & 0xf0f0f0f0f0f0f0f) << 4;
                        uVar52 = (uVar52 & 0xff00ff00ff00ff00) >> 8 |
                                 (uVar52 & 0xff00ff00ff00ff) << 8;
                        uVar52 = (uVar52 & 0xffff0000ffff0000) >> 0x10 |
                                 (uVar52 & 0xffff0000ffff) << 0x10;
                        iVar33 = (int)((ulong)LZCOUNT(uVar52 >> 0x20 | uVar52 << 0x20) >> 3) +
                                 iVar33;
                        goto code_r0x000ad240;
                      }
                      puVar28 = puVar28 + 1;
                      puVar21 = puVar21 + 1;
                      iVar33 = iVar33 + 8;
                    } while (puVar28 < puVar12);
                  }
                  if (puVar28 < (ulong *)((long)puVar23 - 3U)) {
                    if ((uint)*puVar21 == (uint)*puVar28) {
                      puVar28 = (ulong *)((long)puVar28 + 4);
                      puVar21 = (ulong *)((long)puVar21 + 4);
                    }
                    if (puVar28 < (ulong *)((long)puVar23 - 1U)) goto code_r0x000ad254;
                  }
                  else if (puVar28 < (ulong *)((long)puVar23 - 1U)) {
code_r0x000ad254:
                    if ((short)*puVar21 == (short)*puVar28) {
                      puVar28 = (ulong *)((long)puVar28 + 2);
                      puVar21 = (ulong *)((long)puVar21 + 2);
                    }
                  }
                  if (puVar28 < puVar23) {
                    if ((char)*puVar21 == (char)*puVar28) {
                      puVar28 = (ulong *)((long)puVar28 + 1);
                    }
                  }
                  iVar33 = (int)puVar28 - (int)puVar22;
code_r0x000ad240:
                  unaff_x26 = *(char **)(unaff_x29 + -0x78);
                }
                uVar19 = iVar33 + 4U;
                if ((int)(iVar33 + 4U) <= (int)(uint)unaff_x22) {
                  uVar19 = (uint)unaff_x22;
                  uVar10 = uVar18;
                }
                uVar18 = uVar10;
                unaff_x22 = (ulong)uVar19;
              }
              uVar42 = (ulong)((int)uVar42 - 1);
              uVar10 = (uint)*(ushort *)
                              (*(long *)(unaff_x29 + -0xa8) + (ulong)(uVar49 & 0xffff) * 2 + 0x20000
                              );
              uVar49 = uVar49 - uVar10;
              iVar43 = iVar43 - uVar10;
              uVar10 = uVar36 - iVar43;
            } while (uVar10 < 0x10000);
          }
        }
        if (3 < (int)unaff_x22) goto code_r0x000adb94;
        puVar51 = (ulong *)((long)puVar51 + 1);
        *(int *)(unaff_x29 + -0xa0) = *(int *)(unaff_x29 + -0xa0) + -1;
        *(long *)(unaff_x29 + -0xb0) = *(long *)(unaff_x29 + -0xb0) + 1;
        unaff_w30 = -0x61c8864f;
        uVar52 = (ulong)uVar36;
        uVar42 = unaff_x27;
        in_w6 = in_stack_00000168._4_4_;
        if (unaff_x28 < puVar51) break;
      } while( true );
    }
    goto code_r0x000b14b0;
  }
code_r0x000b4f1c:
  in_x16 = unaff_x21;
  in_stack_000000b8 = pcVar15;
  uVar30 = uVar11;
  goto code_r0x000b4f20;
code_r0x000adb94:
  param_3 = (ulong)uVar18 | unaff_x22 << 0x20;
  lVar53 = *(long *)(unaff_x29 + -0x98);
  unaff_w30 = -0x61c8864f;
  uVar52 = param_3;
  puVar54 = puVar51;
code_r0x000adbb8:
  uVar55 = unaff_x27;
  do {
    uVar42 = param_3;
    uStack0000000000000118 = (undefined2)uVar42;
    uVar30 = (uint)unaff_x22;
    lVar57 = (long)(int)uVar30;
    puVar25 = (ulong *)((long)puVar54 + lVar57);
    unaff_x27 = uVar55;
    if (unaff_x28 < puVar25) {
      param_3 = 0;
      unaff_x22 = 0;
    }
    else {
      puVar29 = (uint *)((long)puVar25 - 2);
      uVar18 = *puVar29;
      lVar35 = *(long *)(unaff_x29 + -0xb8);
      puVar22 = *(ulong **)(lVar35 + 8);
      uVar10 = *(uint *)(lVar35 + 0x18);
      uVar41 = (ulong)uVar10;
      uVar34 = *(uint *)(lVar35 + 0x1c);
      uVar11 = uVar10 + (int)((long)puVar29 - (long)puVar22);
      *(ulong *)(unaff_x29 + -0xa8) = (ulong)uVar34;
      uVar36 = uVar34;
      if (uVar34 + 0x10000 <= uVar11) {
        uVar36 = uVar11 - 0xffff;
      }
      uVar14 = (ulong)*(uint *)(lVar35 + 0x20);
      uVar49 = uVar18;
      if (*(uint *)(lVar35 + 0x20) < uVar11) {
        do {
          lVar35 = (ulong)((uint)(*(int *)((long)puVar22 + (uVar14 - uVar41)) * unaff_w30) >> 0x11)
                   * 4;
          uVar49 = (int)uVar14 - *(int *)(lVar53 + lVar35);
          if (0xfffe < uVar49) {
            uVar49 = 0xffff;
          }
          *(short *)(unaff_x23 + (uVar14 & 0xffff) * 2) = (short)uVar49;
          *(int *)(lVar53 + lVar35) = (int)uVar14;
          uVar14 = uVar14 + 1;
        } while (uVar14 < uVar11);
        uVar49 = *puVar29;
      }
      lVar35 = *(long *)(unaff_x29 + -0xb8);
      *(undefined8 *)(unaff_x29 + -0xf0) = *(undefined8 *)(lVar35 + 0x28);
      puVar28 = *(ulong **)(lVar35 + 0x10);
      *(uint *)(lVar35 + 0x20) = uVar11;
      uVar49 = *(uint *)(lVar53 + (ulong)(uVar49 * unaff_w30 >> 0x11) * 4);
      uVar14 = (ulong)uVar49;
      bVar8 = true;
      bVar9 = false;
      if (uVar36 <= uVar49) {
        bVar9 = SBORROW4((int)uVar55,1);
        bVar8 = (int)uVar55 + -1 < 0;
      }
      *(uint **)(unaff_x29 + -0xb0) = puVar29;
      *(long *)(unaff_x29 + -0xc0) = (long)puVar29 - (long)puVar54;
      if (bVar8 == bVar9) {
        iVar33 = 0;
        *(undefined4 *)(unaff_x29 + -0x90) = 0;
        *(undefined4 *)(unaff_x29 + -0xa0) = 0;
        lVar53 = uVar41 - *(long *)(unaff_x29 + -0xa8);
        puVar23 = (ulong *)((long)puVar28 + lVar53);
        *(long *)(unaff_x29 + -200) = (long)puVar54 + -1;
        *(long *)(unaff_x29 + -0xf8) = (long)puVar54 - (long)puVar29;
        *(ulong *)(unaff_x29 + -0xe0) = (long)puVar25 + 2;
        *(uint *)(unaff_x29 + -0xd0) = uVar10 - 4;
        iVar43 = -2 - (uVar30 + (int)puVar54);
        uVar44 = 0;
        *(long *)(unaff_x29 + -0xd8) = -(long)(int)((long)puVar29 - (long)puVar54);
        uVar48 = CONCAT44(uVar18,uVar18);
code_r0x000ae0f8:
        uVar32 = (uint)uVar14;
        uVar49 = uVar10 - uVar32;
        iVar46 = (int)uVar55;
        uVar19 = (uint)unaff_x22;
        if (uVar10 < uVar32 || uVar49 == 0) {
          uVar55 = (ulong)(uVar32 - uVar10);
          puVar1 = (uint *)((long)puVar22 + uVar55);
          if ((*(short *)(*(long *)(unaff_x29 + -200) + (long)(int)uVar19) !=
               *(short *)((long)puVar1 + (long)(int)uVar19 + *(long *)(unaff_x29 + -0xd8) + -1)) ||
             (*puVar1 != uVar18)) goto code_r0x000ae4e4;
          if ((int)*(undefined8 *)(unaff_x29 + -0xc0) == 0) {
            iVar20 = 0;
            puVar21 = *(ulong **)(unaff_x29 + -0xe0);
            if (puVar21 < unaff_x28) goto code_r0x000ae6ec;
code_r0x000ae338:
            puVar12 = (ulong *)(puVar1 + 1);
joined_r0x000ae340:
            if (puVar21 < unaff_x28) {
              iVar37 = iVar43 + (int)puVar21;
              do {
                uVar55 = *puVar21 ^ *puVar12;
                if (uVar55 != 0) {
                  uVar55 = (uVar55 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar55 & 0x5555555555555555) << 1;
                  uVar55 = (uVar55 & 0xcccccccccccccccc) >> 2 | (uVar55 & 0x3333333333333333) << 2;
                  uVar55 = (uVar55 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar55 & 0xf0f0f0f0f0f0f0f) << 4;
                  uVar55 = (uVar55 & 0xff00ff00ff00ff00) >> 8 | (uVar55 & 0xff00ff00ff00ff) << 8;
                  uVar55 = (uVar55 & 0xffff0000ffff0000) >> 0x10 | (uVar55 & 0xffff0000ffff) << 0x10
                  ;
                  iVar37 = (int)((ulong)LZCOUNT(uVar55 >> 0x20 | uVar55 << 0x20) >> 3) + iVar37;
                  goto code_r0x000ae7c0;
                }
                puVar21 = puVar21 + 1;
                puVar12 = puVar12 + 1;
                iVar37 = iVar37 + 8;
              } while (puVar21 < unaff_x28);
            }
            if (puVar21 < in_stack_00000060) {
              if ((uint)*puVar12 == (uint)*puVar21) {
                puVar21 = (ulong *)((long)puVar21 + 4);
                puVar12 = (ulong *)((long)puVar12 + 4);
              }
              if (puVar21 < in_stack_00000058) goto code_r0x000aeacc;
code_r0x000ae77c:
              if (puVar21 < *(ulong **)(unaff_x29 + -0x88)) {
code_r0x000ae788:
                if ((char)*puVar12 == (char)*puVar21) {
                  puVar21 = (ulong *)((long)puVar21 + 1);
                }
              }
            }
            else {
              if (in_stack_00000058 <= puVar21) goto code_r0x000ae77c;
code_r0x000aeacc:
              if ((short)*puVar12 == (short)*puVar21) {
                puVar21 = (ulong *)((long)puVar21 + 2);
                puVar12 = (ulong *)((long)puVar12 + 2);
              }
              if (puVar21 < *(ulong **)(unaff_x29 + -0x88)) goto code_r0x000ae788;
            }
            iVar37 = (int)puVar21 - (int)*(undefined8 *)(unaff_x29 + -0xe0);
          }
          else {
            lVar35 = *(long *)(unaff_x29 + -0xf8);
            if (lVar35 <= (long)-uVar55) {
              lVar35 = -uVar55;
            }
            iVar37 = (int)lVar35;
            if (iVar37 < -3) {
              lVar35 = 0;
              do {
                uVar26 = *(uint *)((long)puVar1 + lVar35 + -4) ^
                         *(uint *)((long)puVar25 + lVar35 + -6);
                if (uVar26 != 0) {
                  iVar20 = (int)lVar35 - ((uint)LZCOUNT(uVar26) >> 3);
                  unaff_x27 = *(ulong *)(unaff_x29 + -0x80);
                  unaff_x26 = *(char **)(unaff_x29 + -0x78);
                  puVar21 = *(ulong **)(unaff_x29 + -0xe0);
                  goto joined_r0x000ae8bc;
                }
                lVar35 = lVar35 + -4;
              } while ((long)iVar37 + 3 < lVar35);
              unaff_x27 = *(ulong *)(unaff_x29 + -0x80);
              unaff_x26 = *(char **)(unaff_x29 + -0x78);
            }
            else {
              lVar35 = 0;
            }
            iVar20 = (int)lVar35;
            lVar35 = (long)iVar20;
            iVar38 = iVar20;
            if (iVar37 <= iVar20) {
              iVar38 = iVar37;
            }
            iVar20 = iVar20 + 1;
            do {
              if (lVar35 <= iVar37) {
                iVar20 = iVar38;
                break;
              }
              lVar47 = lVar35 + lVar57 + -3;
              lVar56 = lVar35 + (uVar55 - 1);
              lVar35 = lVar35 + -1;
              iVar20 = iVar20 + -1;
            } while (*(char *)((long)puVar54 + lVar47) == *(char *)((long)puVar22 + lVar56));
            puVar21 = *(ulong **)(unaff_x29 + -0xe0);
joined_r0x000ae8bc:
            if (unaff_x28 <= puVar21) goto code_r0x000ae338;
code_r0x000ae6ec:
            uVar55 = *puVar21 ^ *(ulong *)(puVar1 + 1);
            if (uVar55 == 0) {
              puVar12 = (ulong *)(puVar1 + 3);
              puVar21 = (ulong *)((long)puVar25 + 10U);
              goto joined_r0x000ae340;
            }
            uVar55 = (uVar55 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar55 & 0x5555555555555555) << 1;
            uVar55 = (uVar55 & 0xcccccccccccccccc) >> 2 | (uVar55 & 0x3333333333333333) << 2;
            uVar55 = (uVar55 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar55 & 0xf0f0f0f0f0f0f0f) << 4;
            uVar55 = (uVar55 & 0xff00ff00ff00ff00) >> 8 | (uVar55 & 0xff00ff00ff00ff) << 8;
            uVar55 = (uVar55 & 0xffff0000ffff0000) >> 0x10 | (uVar55 & 0xffff0000ffff) << 0x10;
            iVar37 = (int)((ulong)LZCOUNT(uVar55 >> 0x20 | uVar55 << 0x20) >> 3);
          }
code_r0x000ae7c0:
          uVar26 = (iVar37 - iVar20) + 4;
          if ((int)uVar26 <= (int)uVar19) {
            iVar20 = *(int *)(unaff_x29 + -0xa0);
          }
          *(int *)(unaff_x29 + -0xa0) = iVar20;
          iVar20 = uVar11 - uVar32;
          if ((int)uVar26 <= (int)uVar19) {
            iVar20 = *(int *)(unaff_x29 + -0x90);
          }
          *(int *)(unaff_x29 + -0x90) = iVar20;
          if ((int)uVar26 <= (int)uVar19) {
            uVar26 = uVar19;
          }
          unaff_x22 = (ulong)uVar26;
          uVar5 = *(ushort *)(unaff_x23 + (ulong)(uVar32 & 0xffff) * 2);
          iVar20 = (int)unaff_x27;
joined_r0x000ae7f8:
          uVar19 = (uint)uVar5;
          uVar55 = (ulong)(iVar46 - 1);
          if (0x80 < iVar20) goto code_r0x000ae4f8;
code_r0x000ae7fc:
          uVar14 = (ulong)(uVar32 - uVar19);
        }
        else {
          if (uVar32 <= *(uint *)(unaff_x29 + -0xd0)) {
            uVar55 = (ulong)(uVar32 - (int)*(undefined8 *)(unaff_x29 + -0xa8));
            puVar1 = (uint *)((long)puVar28 + uVar55);
            if (*puVar1 != uVar18) {
              unaff_x27 = *(ulong *)(unaff_x29 + -0x80);
              uVar5 = *(ushort *)(unaff_x23 + (ulong)(uVar32 & 0xffff) * 2);
              iVar20 = (int)unaff_x27;
              goto joined_r0x000ae7f8;
            }
            puVar21 = (ulong *)(*(long *)(unaff_x29 + -0xb0) + (ulong)uVar49);
            puVar12 = *(ulong **)(unaff_x29 + -0x88);
            if (puVar21 <= *(ulong **)(unaff_x29 + -0x88)) {
              puVar12 = puVar21;
            }
            puVar45 = (ulong *)(puVar1 + 1);
            puVar39 = (ulong *)((long)puVar12 - 7);
            puVar13 = *(ulong **)(unaff_x29 + -0xe0);
            if (puVar13 < puVar39) {
              uVar14 = *puVar13 ^ *puVar45;
              if (uVar14 == 0) {
                puVar45 = (ulong *)(puVar1 + 3);
                puVar13 = (ulong *)((long)puVar25 + 10U);
                goto code_r0x000ae22c;
              }
              uVar14 = (uVar14 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar14 & 0x5555555555555555) << 1;
              uVar14 = (uVar14 & 0xcccccccccccccccc) >> 2 | (uVar14 & 0x3333333333333333) << 2;
              uVar14 = (uVar14 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar14 & 0xf0f0f0f0f0f0f0f) << 4;
              uVar14 = (uVar14 & 0xff00ff00ff00ff00) >> 8 | (uVar14 & 0xff00ff00ff00ff) << 8;
              uVar14 = (uVar14 & 0xffff0000ffff0000) >> 0x10 | (uVar14 & 0xffff0000ffff) << 0x10;
              iVar20 = (int)((ulong)LZCOUNT(uVar14 >> 0x20 | uVar14 << 0x20) >> 3);
            }
            else {
code_r0x000ae22c:
              if (puVar13 < puVar39) {
                iVar20 = iVar43 + (int)puVar13;
                do {
                  uVar14 = *puVar13 ^ *puVar45;
                  if (uVar14 != 0) {
                    uVar14 = (uVar14 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar14 & 0x5555555555555555) << 1
                    ;
                    uVar14 = (uVar14 & 0xcccccccccccccccc) >> 2 | (uVar14 & 0x3333333333333333) << 2
                    ;
                    uVar14 = (uVar14 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar14 & 0xf0f0f0f0f0f0f0f) << 4;
                    uVar14 = (uVar14 & 0xff00ff00ff00ff00) >> 8 | (uVar14 & 0xff00ff00ff00ff) << 8;
                    uVar14 = (uVar14 & 0xffff0000ffff0000) >> 0x10 |
                             (uVar14 & 0xffff0000ffff) << 0x10;
                    iVar20 = (int)((ulong)LZCOUNT(uVar14 >> 0x20 | uVar14 << 0x20) >> 3) + iVar20;
                    goto code_r0x000ae2cc;
                  }
                  puVar13 = puVar13 + 1;
                  puVar45 = puVar45 + 1;
                  iVar20 = iVar20 + 8;
                } while (puVar13 < puVar39);
              }
              if (puVar13 < (ulong *)((long)puVar12 - 3U)) {
                if ((uint)*puVar45 == (uint)*puVar13) {
                  puVar13 = (ulong *)((long)puVar13 + 4);
                  puVar45 = (ulong *)((long)puVar45 + 4);
                }
                if (puVar13 < (ulong *)((long)puVar12 - 1U)) goto code_r0x000aea98;
              }
              else if (puVar13 < (ulong *)((long)puVar12 - 1U)) {
code_r0x000aea98:
                if ((short)*puVar45 == (short)*puVar13) {
                  puVar13 = (ulong *)((long)puVar13 + 2);
                  puVar45 = (ulong *)((long)puVar45 + 2);
                }
              }
              if (puVar13 < puVar12) {
                if ((char)*puVar45 == (char)*puVar13) {
                  puVar13 = (ulong *)((long)puVar13 + 1);
                }
              }
              iVar20 = (int)puVar13 - (int)*(undefined8 *)(unaff_x29 + -0xe0);
            }
code_r0x000ae2cc:
            iVar20 = iVar20 + 4;
            if (puVar21 < *(ulong **)(unaff_x29 + -0x88)) {
              unaff_x26 = *(char **)(unaff_x29 + -0x78);
              if ((ulong *)(*(long *)(unaff_x29 + -0xb0) + (long)iVar20) == puVar12) {
                puVar13 = puVar22;
                puVar21 = puVar12;
                if (puVar12 < unaff_x28) {
                  uVar14 = *puVar12 ^ *puVar22;
                  if (uVar14 == 0) {
                    puVar21 = puVar12 + 1;
                    puVar13 = puVar22 + 1;
                    goto code_r0x000ae350;
                  }
                  uVar14 = (uVar14 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar14 & 0x5555555555555555) << 1;
                  uVar14 = (uVar14 & 0xcccccccccccccccc) >> 2 | (uVar14 & 0x3333333333333333) << 2;
                  uVar14 = (uVar14 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar14 & 0xf0f0f0f0f0f0f0f) << 4;
                  uVar14 = (uVar14 & 0xff00ff00ff00ff00) >> 8 | (uVar14 & 0xff00ff00ff00ff) << 8;
                  uVar14 = (uVar14 & 0xffff0000ffff0000) >> 0x10 | (uVar14 & 0xffff0000ffff) << 0x10
                  ;
                  iVar37 = (int)((ulong)LZCOUNT(uVar14 >> 0x20 | uVar14 << 0x20) >> 3);
                }
                else {
code_r0x000ae350:
                  if (puVar21 < unaff_x28) {
                    uVar14 = (long)puVar54 + (ulong)uVar49 + lVar57 + -2;
                    if (in_stack_00000150 <= uVar14) {
                      uVar14 = in_stack_00000150;
                    }
                    iVar37 = (int)puVar21 - (int)uVar14;
                    do {
                      uVar14 = *puVar21 ^ *puVar13;
                      if (uVar14 != 0) {
                        uVar14 = (uVar14 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                                 (uVar14 & 0x5555555555555555) << 1;
                        uVar14 = (uVar14 & 0xcccccccccccccccc) >> 2 |
                                 (uVar14 & 0x3333333333333333) << 2;
                        uVar14 = (uVar14 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                                 (uVar14 & 0xf0f0f0f0f0f0f0f) << 4;
                        uVar14 = (uVar14 & 0xff00ff00ff00ff00) >> 8 |
                                 (uVar14 & 0xff00ff00ff00ff) << 8;
                        uVar14 = (uVar14 & 0xffff0000ffff0000) >> 0x10 |
                                 (uVar14 & 0xffff0000ffff) << 0x10;
                        iVar37 = (int)((ulong)LZCOUNT(uVar14 >> 0x20 | uVar14 << 0x20) >> 3) +
                                 iVar37;
                        goto code_r0x000ae400;
                      }
                      puVar21 = puVar21 + 1;
                      puVar13 = puVar13 + 1;
                      iVar37 = iVar37 + 8;
                    } while (puVar21 < unaff_x28);
                  }
                  if (puVar21 < in_stack_00000060) {
                    if ((uint)*puVar13 == (uint)*puVar21) {
                      puVar21 = (ulong *)((long)puVar21 + 4);
                      puVar13 = (ulong *)((long)puVar13 + 4);
                    }
                    if (puVar21 < in_stack_00000058) goto code_r0x000aeb04;
code_r0x000ae3c8:
                    if (puVar21 < *(ulong **)(unaff_x29 + -0x88)) {
code_r0x000ae3d4:
                      if ((char)*puVar13 == (char)*puVar21) {
                        puVar21 = (ulong *)((long)puVar21 + 1);
                      }
                    }
                  }
                  else {
                    if (in_stack_00000058 <= puVar21) goto code_r0x000ae3c8;
code_r0x000aeb04:
                    if ((short)*puVar13 == (short)*puVar21) {
                      puVar21 = (ulong *)((long)puVar21 + 2);
                      puVar13 = (ulong *)((long)puVar13 + 2);
                    }
                    if (puVar21 < *(ulong **)(unaff_x29 + -0x88)) goto code_r0x000ae3d4;
                  }
                  iVar37 = (int)puVar21 - (int)puVar12;
                }
code_r0x000ae400:
                iVar20 = iVar37 + iVar20;
                goto code_r0x000ae404;
              }
            }
            else {
code_r0x000ae404:
              unaff_x26 = *(char **)(unaff_x29 + -0x78);
            }
            if ((int)*(undefined8 *)(unaff_x29 + -0xc0) == 0) {
              unaff_x27 = *(ulong *)(unaff_x29 + -0x80);
              iVar37 = 0;
            }
            else {
              lVar35 = *(long *)(unaff_x29 + -0xf8);
              if (lVar35 <= (long)-uVar55) {
                lVar35 = -uVar55;
              }
              iVar38 = (int)lVar35;
              if (iVar38 < -3) {
                lVar35 = 0;
                do {
                  uVar26 = *(uint *)((long)puVar1 + lVar35 + -4) ^
                           *(uint *)((long)puVar25 + lVar35 + -6);
                  if (uVar26 != 0) {
                    iVar37 = (int)lVar35 - ((uint)LZCOUNT(uVar26) >> 3);
                    unaff_x27 = *(ulong *)(unaff_x29 + -0x80);
                    unaff_x26 = *(char **)(unaff_x29 + -0x78);
                    goto code_r0x000ae4bc;
                  }
                  lVar35 = lVar35 + -4;
                } while ((long)iVar38 + 3 < lVar35);
              }
              else {
                lVar35 = 0;
              }
              iVar37 = (int)lVar35;
              lVar35 = (long)iVar37;
              iVar31 = iVar37;
              if (iVar38 <= iVar37) {
                iVar31 = iVar38;
              }
              iVar37 = iVar37 + 1;
              unaff_x27 = *(ulong *)(unaff_x29 + -0x80);
              unaff_x26 = *(char **)(unaff_x29 + -0x78);
              do {
                if (lVar35 <= iVar38) {
                  iVar37 = iVar31;
                  break;
                }
                lVar47 = lVar35 + lVar57 + -3;
                lVar56 = lVar35 + (uVar55 - 1);
                lVar35 = lVar35 + -1;
                iVar37 = iVar37 + -1;
              } while (*(char *)((long)puVar54 + lVar47) == *(char *)((long)puVar28 + lVar56));
            }
code_r0x000ae4bc:
            uVar26 = iVar20 - iVar37;
            if ((int)uVar26 <= (int)uVar19) {
              iVar37 = *(int *)(unaff_x29 + -0xa0);
            }
            *(int *)(unaff_x29 + -0xa0) = iVar37;
            iVar20 = uVar11 - uVar32;
            if ((int)uVar26 <= (int)uVar19) {
              iVar20 = *(int *)(unaff_x29 + -0x90);
            }
            *(int *)(unaff_x29 + -0x90) = iVar20;
            if ((int)uVar26 <= (int)uVar19) {
              uVar26 = uVar19;
            }
            unaff_x22 = (ulong)uVar26;
          }
code_r0x000ae4e4:
          uVar55 = (ulong)(iVar46 - 1);
          uVar19 = (uint)*(ushort *)(unaff_x23 + (ulong)(uVar32 & 0xffff) * 2);
          if ((int)unaff_x27 < 0x81) goto code_r0x000ae7fc;
code_r0x000ae4f8:
          if (uVar19 != 1) goto code_r0x000ae7fc;
          if (iVar33 == 0) {
            if ((uVar18 & 0xffff) == uVar18 >> 0x10 && (uVar18 & 0xff) == uVar18 >> 0x18) {
              puVar13 = *(ulong **)(unaff_x29 + -0xe0);
              puVar12 = puVar13;
              puVar21 = (ulong *)((long)puVar54 + lVar57 + 2);
              if (puVar13 < unaff_x28) {
                do {
                  uVar14 = *puVar12 ^ uVar48;
                  if (uVar14 != 0) {
                    uVar14 = (uVar14 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar14 & 0x5555555555555555) << 1
                    ;
                    uVar14 = (uVar14 & 0xcccccccccccccccc) >> 2 | (uVar14 & 0x3333333333333333) << 2
                    ;
                    uVar14 = (uVar14 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar14 & 0xf0f0f0f0f0f0f0f) << 4;
                    uVar14 = (uVar14 & 0xff00ff00ff00ff00) >> 8 | (uVar14 & 0xff00ff00ff00ff) << 8;
                    uVar14 = (uVar14 & 0xffff0000ffff0000) >> 0x10 |
                             (uVar14 & 0xffff0000ffff) << 0x10;
                    puVar21 = (ulong *)((long)puVar21 +
                                       ((ulong)LZCOUNT(uVar14 >> 0x20 | uVar14 << 0x20) >> 3));
                    goto code_r0x000ae658;
                  }
                  puVar12 = puVar12 + 1;
                  puVar21 = puVar21 + 1;
                } while (puVar12 < unaff_x28);
                puVar45 = *(ulong **)(unaff_x29 + -0x88);
                if (puVar12 < puVar45) goto code_r0x000ae604;
              }
              else {
                puVar45 = *(ulong **)(unaff_x29 + -0x88);
                puVar21 = puVar13;
                if (puVar13 < puVar45) {
code_r0x000ae604:
                  lVar35 = (long)puVar45 - (long)puVar21;
                  puVar21 = (ulong *)((long)puVar12 + lVar35);
                  uVar14 = uVar48;
                  do {
                    if ((uint)(byte)*puVar12 != ((uint)uVar14 & 0xff)) goto code_r0x000ae630;
                    puVar12 = (ulong *)((long)puVar12 + 1);
                    uVar14 = uVar14 >> 8;
                    lVar35 = lVar35 + -1;
                  } while (lVar35 != 0);
                  puVar12 = puVar21;
code_r0x000ae630:
                  puVar13 = *(ulong **)(unaff_x29 + -0xe0);
                  puVar21 = puVar12;
                }
              }
code_r0x000ae658:
              uVar44 = (ulong)(uint)((int)puVar21 - (int)puVar13) + 4;
              iVar33 = 2;
              goto code_r0x000ae50c;
            }
            iVar33 = 1;
            goto code_r0x000ae7fc;
          }
          if (iVar33 != 2) goto code_r0x000ae7fc;
code_r0x000ae50c:
          uVar26 = uVar32 - 1;
          if (uVar26 < uVar36) goto code_r0x000ae7fc;
          if (uVar49 < 3) {
code_r0x000ae63c:
            iVar33 = 2;
            goto code_r0x000ae7fc;
          }
          puVar21 = (ulong *)((long)puVar28 +
                             (ulong)(uVar26 - (int)*(undefined8 *)(unaff_x29 + -0xa8)));
          puVar12 = (ulong *)((long)puVar22 + (ulong)(uVar26 - uVar10));
          if (uVar26 < uVar10) {
            puVar12 = puVar21;
          }
          if ((uint)*puVar12 != uVar18) goto code_r0x000ae63c;
          puVar13 = *(ulong **)(unaff_x29 + -0x88);
          if (uVar26 < uVar10) {
            puVar13 = puVar23;
          }
          puVar45 = (ulong *)((long)puVar12 + 4);
          puVar39 = puVar45;
          if (puVar45 < (ulong *)((long)puVar13 - 7U)) {
            puVar24 = puVar45;
            do {
              uVar14 = *puVar39 ^ uVar48;
              if (uVar14 != 0) {
                uVar14 = (uVar14 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar14 & 0x5555555555555555) << 1;
                uVar14 = (uVar14 & 0xcccccccccccccccc) >> 2 | (uVar14 & 0x3333333333333333) << 2;
                uVar14 = (uVar14 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar14 & 0xf0f0f0f0f0f0f0f) << 4;
                uVar14 = (uVar14 & 0xff00ff00ff00ff00) >> 8 | (uVar14 & 0xff00ff00ff00ff) << 8;
                uVar14 = (uVar14 & 0xffff0000ffff0000) >> 0x10 | (uVar14 & 0xffff0000ffff) << 0x10;
                puVar39 = (ulong *)((long)puVar24 +
                                   ((ulong)LZCOUNT(uVar14 >> 0x20 | uVar14 << 0x20) >> 3));
                goto code_r0x000ae67c;
              }
              puVar39 = puVar39 + 1;
              puVar24 = puVar24 + 1;
            } while (puVar39 < (ulong *)((long)puVar13 - 7U));
          }
          if (puVar39 < puVar13) {
            lVar35 = (long)puVar13 - (long)puVar39;
            uVar14 = uVar48;
            do {
              if ((uint)(byte)*puVar39 != ((uint)uVar14 & 0xff)) goto code_r0x000ae67c;
              puVar39 = (ulong *)((long)puVar39 + 1);
              uVar14 = uVar14 >> 8;
              lVar35 = lVar35 + -1;
            } while (lVar35 != 0);
            puVar39 = puVar13;
          }
code_r0x000ae67c:
          uVar14 = (long)puVar39 - (long)puVar45;
          uVar58 = (uVar14 & 0xffffffff) + 4;
          if (uVar26 < uVar10) {
            puVar13 = puVar28;
            if ((ulong *)((long)puVar21 + uVar58) == puVar23) {
              puVar21 = puVar22;
              puVar45 = puVar22;
              uVar50 = uVar48;
              if ((uVar14 & 3) != 0) {
                uVar49 = (int)uVar14 * -8 & 0x1f;
                uVar49 = uVar18 >> uVar49 | uVar18 << 0x20 - uVar49;
                uVar50 = CONCAT44(uVar49,uVar49);
              }
              for (; puVar21 < unaff_x28; puVar21 = puVar21 + 1) {
                uVar14 = *puVar21 ^ uVar50;
                if (uVar14 != 0) {
                  uVar14 = (uVar14 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar14 & 0x5555555555555555) << 1;
                  uVar14 = (uVar14 & 0xcccccccccccccccc) >> 2 | (uVar14 & 0x3333333333333333) << 2;
                  uVar14 = (uVar14 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar14 & 0xf0f0f0f0f0f0f0f) << 4;
                  uVar14 = (uVar14 & 0xff00ff00ff00ff00) >> 8 | (uVar14 & 0xff00ff00ff00ff) << 8;
                  uVar14 = (uVar14 & 0xffff0000ffff0000) >> 0x10 | (uVar14 & 0xffff0000ffff) << 0x10
                  ;
                  puVar45 = (ulong *)((long)puVar45 +
                                     ((ulong)LZCOUNT(uVar14 >> 0x20 | uVar14 << 0x20) >> 3));
                  goto code_r0x000ae8d0;
                }
                puVar45 = puVar45 + 1;
              }
              if (puVar21 < *(ulong **)(unaff_x29 + -0x88)) {
                lVar35 = (long)*(ulong **)(unaff_x29 + -0x88) - (long)puVar45;
                puVar39 = (ulong *)((long)puVar21 + lVar35);
                do {
                  puVar45 = puVar21;
                  if ((uint)(byte)*puVar21 != ((uint)uVar50 & 0xff)) goto code_r0x000ae8d0;
                  puVar21 = (ulong *)((long)puVar21 + 1);
                  uVar50 = uVar50 >> 8;
                  lVar35 = lVar35 + -1;
                } while (lVar35 != 0);
                puVar45 = puVar39;
              }
code_r0x000ae8d0:
              uVar58 = (uint)((int)puVar45 - (int)puVar22) + uVar58;
            }
          }
          else {
            puVar13 = puVar22;
          }
          *(uint *)(unaff_x29 + -0x6c) = uVar18;
          puVar21 = puVar12;
          do {
            puVar45 = puVar21;
            if (puVar45 < (ulong *)((long)puVar13 + 4U)) break;
            puVar21 = (ulong *)((long)puVar45 + -4);
          } while (*(uint *)((long)puVar45 + -4) == uVar18);
          puVar21 = puVar45;
          if (puVar13 < puVar45) {
            lVar35 = 0;
            do {
              puVar21 = (ulong *)((long)puVar45 + lVar35);
              if (*(char *)((long)puVar21 + -1) != unaff_x26[lVar35]) goto code_r0x000ae940;
              lVar35 = lVar35 + -1;
            } while (puVar13 < (ulong *)((long)puVar45 + lVar35));
            puVar21 = puVar13;
          }
code_r0x000ae940:
          iVar33 = (int)((long)puVar12 - (long)puVar21);
          if (((uVar10 <= uVar26) &&
              ((ulong *)((long)puVar12 - ((long)puVar12 - (long)puVar21 & 0xffffffffU)) == puVar22))
             && ((uint)*(undefined8 *)(unaff_x29 + -0xa8) < uVar10)) {
            uVar19 = iVar33 * 8 & 0x1f;
            uVar49 = uVar18;
            if ((-iVar33 & 3U) != 0) {
              uVar49 = uVar18 >> uVar19 | uVar18 << 0x20 - uVar19;
            }
            *(uint *)(unaff_x29 + -0x6c) = uVar49;
            lVar35 = lVar53;
            do {
              lVar47 = lVar35;
              if (lVar47 < 4) {
                puVar21 = (ulong *)((long)puVar28 + lVar47);
                if (lVar47 < 1) goto code_r0x000ae9d4;
                break;
              }
              lVar35 = lVar47 + -4;
            } while (*(uint *)((long)puVar28 + lVar47 + -4) == uVar49);
            pcVar15 = unaff_x26;
            puVar21 = (ulong *)((long)puVar28 + lVar47);
            do {
              puVar12 = (ulong *)((long)puVar21 + -1);
              if (*(char *)puVar12 != *pcVar15) goto code_r0x000ae9d4;
              pcVar15 = pcVar15 + -1;
              puVar21 = puVar12;
            } while (puVar28 < puVar12);
            puVar21 = puVar28;
code_r0x000ae9d4:
            iVar33 = ((int)puVar23 - (int)puVar21) + iVar33;
          }
          uVar49 = uVar26 - iVar33;
          if (uVar26 - iVar33 <= uVar36) {
            uVar49 = uVar36;
          }
          uVar14 = (ulong)uVar49;
          uVar50 = uVar58 + (uVar26 - uVar49);
          if ((uVar44 < uVar58) || (uVar50 < uVar44)) {
            if (uVar10 + ~uVar49 < 3) {
              iVar33 = 2;
              uVar14 = uVar41;
              goto code_r0x000ae800;
            }
            if ((int)*(undefined8 *)(unaff_x29 + -0xc0) != 0) goto code_r0x000aea84;
            if (uVar44 <= uVar50) {
              uVar50 = uVar44;
            }
            if ((ulong)(long)(int)unaff_x22 < uVar50) {
              if ((((long)puVar29 - (long)puVar22) + uVar41) - uVar14 >> 0x10 != 0)
              goto code_r0x000adccc;
              *(uint *)(unaff_x29 + -0x90) = uVar11 - uVar49;
              unaff_x22 = uVar50;
            }
            uVar19 = (uint)*(ushort *)(unaff_x23 + (ulong)(uVar49 & 0xffff) * 2);
            uVar14 = (ulong)(uVar49 - uVar19);
            if (uVar49 < uVar19) goto code_r0x000adccc;
          }
          else {
            uVar49 = (uVar26 - (int)uVar44) + (int)uVar58;
            uVar19 = uVar10;
            if (2 < uVar10 + ~uVar49) {
              uVar19 = uVar49;
            }
            uVar14 = (ulong)uVar19;
          }
code_r0x000aea84:
          iVar33 = 2;
        }
code_r0x000ae800:
        if ((uint)uVar14 < uVar36 || iVar46 < 2) goto code_r0x000adccc;
        goto code_r0x000ae0f8;
      }
      *(undefined4 *)(unaff_x29 + -0xa0) = 0;
      *(undefined4 *)(unaff_x29 + -0x90) = 0;
code_r0x000adccc:
      if (((uVar11 < uVar34 + 0x10000) &&
          (puVar22 = *(ulong **)(unaff_x29 + -0x88), *(int *)(unaff_x29 + -0xe4) == 1)) &&
         (0 < (int)uVar55)) {
        lVar47 = *(long *)(unaff_x29 + -0xf0);
        lVar35 = *(long *)(&UNK_00040008 + lVar47);
        uVar10 = *(uint *)(&UNK_00040018 + lVar47);
        lVar53 = (*(long *)(lVar47 + 0x40000) - lVar35) + (ulong)uVar10;
        uVar34 = *(uint *)(lVar47 + (ulong)((uint)(**(int **)(unaff_x29 + -0xb0) * -0x61c8864f) >>
                                           0x11) * 4);
        iVar43 = (uVar34 + uVar36) - (int)lVar53;
        uVar36 = uVar11 - iVar43;
        if (uVar36 >> 0x10 == 0) {
          puVar28 = (ulong *)((long)puVar25 + 2);
          lVar47 = (long)puVar54 - (long)*(int **)(unaff_x29 + -0xb0);
          do {
            if ((int)uVar55 == 0) break;
            puVar29 = (uint *)((lVar35 - (ulong)uVar10) + (ulong)uVar34);
            if (*puVar29 == uVar18) {
              puVar23 = (ulong *)(*(long *)(unaff_x29 + -0xb0) + (lVar53 - (ulong)uVar34));
              puVar21 = puVar22;
              if (puVar23 <= puVar22) {
                puVar21 = puVar23;
              }
              puVar12 = (ulong *)(puVar29 + 1);
              puVar13 = (ulong *)((long)puVar21 - 7);
              puVar23 = puVar28;
              if (puVar28 < puVar13) {
                uVar41 = *puVar28 ^ *puVar12;
                iVar33 = (int)*(undefined8 *)(unaff_x29 + -0xc0);
                if (uVar41 == 0) {
                  puVar12 = (ulong *)(puVar29 + 3);
                  puVar23 = (ulong *)((long)puVar25 + 10);
                  goto joined_r0x000adfbc;
                }
                uVar41 = (uVar41 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar41 & 0x5555555555555555) << 1;
                uVar41 = (uVar41 & 0xcccccccccccccccc) >> 2 | (uVar41 & 0x3333333333333333) << 2;
                uVar41 = (uVar41 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar41 & 0xf0f0f0f0f0f0f0f) << 4;
                uVar41 = (uVar41 & 0xff00ff00ff00ff00) >> 8 | (uVar41 & 0xff00ff00ff00ff) << 8;
                uVar41 = (uVar41 & 0xffff0000ffff0000) >> 0x10 | (uVar41 & 0xffff0000ffff) << 0x10;
                iVar46 = (int)((ulong)LZCOUNT(uVar41 >> 0x20 | uVar41 << 0x20) >> 3);
              }
              else {
joined_r0x000adfbc:
                if (puVar23 < puVar13) {
                  iVar46 = (-2 - (uVar30 + (int)puVar54)) + (int)puVar23;
                  do {
                    uVar41 = *puVar23 ^ *puVar12;
                    if (uVar41 != 0) {
                      uVar41 = (uVar41 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                               (uVar41 & 0x5555555555555555) << 1;
                      uVar41 = (uVar41 & 0xcccccccccccccccc) >> 2 |
                               (uVar41 & 0x3333333333333333) << 2;
                      uVar41 = (uVar41 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                               (uVar41 & 0xf0f0f0f0f0f0f0f) << 4;
                      uVar41 = (uVar41 & 0xff00ff00ff00ff00) >> 8 | (uVar41 & 0xff00ff00ff00ff) << 8
                      ;
                      uVar41 = (uVar41 & 0xffff0000ffff0000) >> 0x10 |
                               (uVar41 & 0xffff0000ffff) << 0x10;
                      iVar46 = (int)((ulong)LZCOUNT(uVar41 >> 0x20 | uVar41 << 0x20) >> 3) + iVar46;
                      iVar33 = (int)*(undefined8 *)(unaff_x29 + -0xc0);
                      goto code_r0x000aded4;
                    }
                    puVar23 = puVar23 + 1;
                    puVar12 = puVar12 + 1;
                    iVar46 = iVar46 + 8;
                  } while (puVar23 < puVar13);
                }
                if (puVar23 < (ulong *)((long)puVar21 - 3U)) {
                  if ((uint)*puVar12 == (uint)*puVar23) {
                    puVar23 = (ulong *)((long)puVar23 + 4);
                    puVar12 = (ulong *)((long)puVar12 + 4);
                  }
                  iVar33 = (int)*(undefined8 *)(unaff_x29 + -0xc0);
                  if (puVar23 < (ulong *)((long)puVar21 - 1U)) goto code_r0x000adf8c;
                }
                else {
                  iVar33 = (int)*(undefined8 *)(unaff_x29 + -0xc0);
                  if (puVar23 < (ulong *)((long)puVar21 - 1U)) {
code_r0x000adf8c:
                    if ((short)*puVar12 == (short)*puVar23) {
                      puVar23 = (ulong *)((long)puVar23 + 2);
                      puVar12 = (ulong *)((long)puVar12 + 2);
                    }
                  }
                }
                if (puVar23 < puVar21) {
                  if ((char)*puVar12 == (char)*puVar23) {
                    puVar23 = (ulong *)((long)puVar23 + 1);
                  }
                }
                iVar46 = (int)puVar23 - (int)puVar28;
              }
code_r0x000aded4:
              if (iVar33 == 0) {
                iVar33 = 0;
              }
              else {
                lVar56 = lVar47;
                if (lVar47 <= lVar35 - (long)puVar29) {
                  lVar56 = lVar35 - (long)puVar29;
                }
                iVar20 = (int)lVar56;
                if (iVar20 < -3) {
                  lVar56 = 0;
                  do {
                    uVar49 = *(uint *)((long)puVar29 + lVar56 + -4) ^
                             *(uint *)((long)puVar25 + lVar56 + -6);
                    if (uVar49 != 0) {
                      iVar33 = (int)lVar56 - ((uint)LZCOUNT(uVar49) >> 3);
                      puVar22 = *(ulong **)(unaff_x29 + -0x88);
                      unaff_x27 = *(ulong *)(unaff_x29 + -0x80);
                      goto code_r0x000add74;
                    }
                    lVar56 = lVar56 + -4;
                  } while ((long)iVar20 + 3 < lVar56);
                  puVar22 = *(ulong **)(unaff_x29 + -0x88);
                }
                else {
                  lVar56 = 0;
                }
                iVar38 = (int)lVar56;
                iVar37 = iVar38;
                if (iVar20 <= iVar38) {
                  iVar37 = iVar20;
                }
                iVar33 = iVar38 + 1;
                unaff_x27 = *(ulong *)(unaff_x29 + -0x80);
                lVar56 = (long)iVar38;
                do {
                  if (lVar56 <= iVar20) {
                    iVar33 = iVar37;
                    break;
                  }
                  lVar40 = lVar56 + lVar57 + -3;
                  lVar6 = lVar56 + -1;
                  iVar33 = iVar33 + -1;
                  lVar56 = lVar56 + -1;
                } while (*(char *)((long)puVar54 + lVar40) == *(char *)((long)puVar29 + lVar6));
              }
code_r0x000add74:
              uVar49 = (iVar46 + 4) - iVar33;
              uVar19 = (uint)unaff_x22;
              if ((int)uVar49 <= (int)uVar19) {
                iVar33 = *(int *)(unaff_x29 + -0xa0);
              }
              *(int *)(unaff_x29 + -0xa0) = iVar33;
              if ((int)uVar49 <= (int)uVar19) {
                uVar36 = *(uint *)(unaff_x29 + -0x90);
              }
              *(uint *)(unaff_x29 + -0x90) = uVar36;
              if ((int)uVar49 <= (int)uVar19) {
                uVar49 = uVar19;
              }
              unaff_x22 = (ulong)uVar49;
              unaff_x26 = *(char **)(unaff_x29 + -0x78);
            }
            uVar55 = (ulong)((int)uVar55 - 1);
            uVar36 = (uint)*(ushort *)
                            (*(long *)(unaff_x29 + -0xf0) + (ulong)(uVar34 & 0xffff) * 2 + 0x20000);
            uVar34 = uVar34 - uVar36;
            iVar43 = iVar43 - uVar36;
            uVar36 = uVar11 - iVar43;
          } while (uVar36 < 0x10000);
        }
      }
      puStack0000000000000148 =
           (ulong *)(*(long *)(unaff_x29 + -0xb0) + (long)*(int *)(unaff_x29 + -0xa0));
      lVar53 = *(long *)(unaff_x29 + -0x98);
      unaff_w30 = -0x61c8864f;
      param_3 = (ulong)*(uint *)(unaff_x29 + -0x90);
    }
    in_x16 = puVar54;
    if ((int)unaff_x22 <= (int)uVar30) break;
    bVar8 = puVar54 <= puVar51;
    bVar9 = (ulong *)((long)puVar54 + ((long)uVar52 >> 0x20)) <= puStack0000000000000148;
    in_x16 = puVar51;
    if (bVar8 || bVar9) {
      in_x16 = puVar54;
    }
    puVar54 = puStack0000000000000148;
    uVar55 = unaff_x27;
    if (2 < (long)puStack0000000000000148 - (long)in_x16) {
      uVar11 = (uint)uVar52;
      if (bVar8 || bVar9) {
        uVar11 = (uint)uVar42;
      }
      uVar55 = (ulong)uVar11;
      uVar11 = (uint)(uVar52 >> 0x20);
      if (bVar8 || bVar9) {
        uVar11 = uVar30;
      }
      _uStack0000000000000050 = (ulong)uVar11;
      in_stack_00000078 = puStack00000000000000c8;
      in_w6 = in_stack_00000168._4_4_;
      goto LAB_000aeb94;
    }
  } while( true );
  puVar51 = (ulong *)(in_stack_000000b8 + 1);
  uVar52 = (long)puVar54 - (long)puStack00000000000000c8;
  if ((in_stack_00000168._4_4_ != 0) &&
     (in_stack_000000a0 < (char *)((long)puVar51 + uVar52 + uVar52 / 0xff + 8))) {
    in_w6 = in_stack_00000168._4_4_;
    goto code_r0x000b4f20;
  }
  uVar55 = uVar52 - 0xf;
  if (uVar52 < 0xf) {
    *in_stack_000000b8 = (char)((int)uVar52 << 4);
  }
  else {
    *in_stack_000000b8 = -0x10;
    puVar22 = puVar51;
    if (0xfe < uVar55) {
      uVar55 = (uVar52 - 0x10e) / 0xff;
      _memset(puVar51,0xff,uVar55 + 1);
      unaff_w30 = -0x61c8864f;
      puVar22 = (ulong *)(in_stack_000000b8 + uVar55 + 2);
      uVar55 = (uVar52 - 0x10e) % 0xff;
    }
    puVar51 = (ulong *)((long)puVar22 + 1);
    *(char *)puVar22 = (char)uVar55;
  }
  puVar22 = (ulong *)((long)puVar51 + uVar52);
  uVar52 = (long)puVar51 - (long)puStack00000000000000c8;
  puVar28 = (ulong *)(uVar52 + (long)puVar54);
  if ((ulong *)(uVar52 + (long)puVar54) <= puVar51 + 1) {
    puVar28 = puVar51 + 1;
  }
  if (((char *)((long)puVar28 + ~(ulong)puVar51) < &segment_command_00000020.vmaddr) ||
     (uVar52 < 0x40)) {
    puVar28 = puStack00000000000000c8;
  }
  else {
    uVar55 = ((long)puVar28 + ~(ulong)puVar51 >> 3) + 1;
    uVar41 = uVar55 & 0x3ffffffffffffff8;
    puVar28 = puStack00000000000000c8 + 4;
    puVar23 = puVar51 + 4;
    uVar42 = uVar41;
    do {
      uVar14 = puVar28[-4];
      uVar48 = puVar28[-1];
      uVar44 = puVar28[-2];
      uVar50 = puVar28[1];
      uVar58 = *puVar28;
      uVar60 = puVar28[3];
      uVar59 = puVar28[2];
      puVar23[-3] = puVar28[-3];
      puVar23[-4] = uVar14;
      puVar23[-1] = uVar48;
      puVar23[-2] = uVar44;
      puVar23[1] = uVar50;
      *puVar23 = uVar58;
      puVar23[3] = uVar60;
      puVar23[2] = uVar59;
      uVar42 = uVar42 - 8;
      puVar28 = puVar28 + 8;
      puVar23 = puVar23 + 8;
    } while (uVar42 != 0);
    puVar28 = puStack00000000000000c8 + uVar41;
    puVar51 = puVar51 + uVar41;
    if (uVar55 == uVar41) goto code_r0x000b0308;
  }
  do {
    puVar23 = puVar51 + 1;
    *puVar51 = *puVar28;
    puVar28 = puVar28 + 1;
    puVar51 = puVar23;
  } while (puVar23 < puVar22);
code_r0x000b0308:
  pcVar15 = (char *)((long)puVar22 + 2);
  *(undefined2 *)puVar22 = uStack0000000000000118;
  uVar55 = lVar57 - 4;
  if ((in_stack_00000168._4_4_ != 0) && (in_stack_000000a0 < pcVar15 + uVar55 / 0xff + 6)) {
    in_w6 = in_stack_00000168._4_4_;
    goto code_r0x000b4f20;
  }
  puStack00000000000000c8 = puVar25;
  if (uVar55 < 0xf) {
    *in_stack_000000b8 = *in_stack_000000b8 + (char)uVar55;
    in_stack_000000b8 = pcVar15;
    in_w6 = in_stack_00000168._4_4_;
  }
  else {
    *in_stack_000000b8 = *in_stack_000000b8 + '\x0f';
    uVar55 = lVar57 - 0x13;
    if (0x1fd < uVar55) {
      lVar53 = ((lVar57 - 0x211U) / 0x1fe) * 2;
      _memset(pcVar15,0xff,lVar53 + 2);
      unaff_w30 = -0x61c8864f;
      unaff_x26 = *(char **)(unaff_x29 + -0x78);
      pcVar15 = (char *)((long)puVar54 + lVar53 + uVar52 + 4);
      uVar55 = (lVar57 - 0x211U) % 0x1fe;
    }
    pcVar16 = pcVar15;
    if (0xfe < uVar55) {
      pcVar16 = pcVar15 + 1;
      *pcVar15 = -1;
      uVar55 = uVar55 - 0xff;
    }
    *pcVar16 = (char)uVar55;
    in_stack_000000b8 = pcVar16 + 1;
    in_w6 = in_stack_00000168._4_4_;
  }
  goto joined_r0x000b07fc;
}

