
/* WARNING: Removing unreachable block (ram,0x000ae66c) */
/* WARNING: Removing unreachable block (ram,0x000af684) */

int FUN_000b0220(ulong param_1,ulong param_2,long param_3)

{
  uint *puVar1;
  int iVar2;
  uint uVar3;
  uint uVar4;
  uint uVar5;
  ushort uVar6;
  long lVar7;
  long lVar8;
  bool bVar9;
  bool bVar10;
  uint uVar11;
  int iVar12;
  uint uVar13;
  ulong *puVar14;
  ulong *puVar15;
  long lVar16;
  ulong uVar17;
  ulong *puVar18;
  char *pcVar19;
  uint uVar20;
  uint uVar21;
  int iVar22;
  uint uVar23;
  ulong *puVar24;
  ulong *puVar25;
  ulong uVar26;
  uint uVar27;
  int iVar28;
  ulong *puVar29;
  ulong *puVar30;
  uint *puVar31;
  uint uVar32;
  int iVar33;
  uint uVar34;
  int iVar35;
  ulong *puVar36;
  ulong uVar37;
  uint uVar38;
  int iVar39;
  int iVar40;
  long lVar41;
  ulong *puVar42;
  ulong uVar43;
  ulong uVar44;
  ulong uVar45;
  int iVar46;
  ulong uVar47;
  long lVar48;
  ulong uVar49;
  char *pcVar50;
  char *pcVar51;
  ulong *unaff_x19;
  ulong *unaff_x20;
  ulong *puVar52;
  ulong unaff_x21;
  ulong uVar53;
  ulong unaff_x22;
  long unaff_x23;
  int iVar54;
  ulong unaff_x24;
  ulong *puVar55;
  long lVar56;
  char *unaff_x26;
  char *unaff_x27;
  long lVar57;
  ulong *unaff_x28;
  long unaff_x29;
  ulong uVar58;
  ulong uVar59;
  ulong uVar60;
  ulong uVar61;
  uint uStack0000000000000050;
  ulong *in_stack_00000058;
  ulong *in_stack_00000060;
  long in_stack_00000068;
  ulong *in_stack_00000078;
  long in_stack_00000080;
  char *in_stack_000000a0;
  ulong *puStack00000000000000a8;
  char *in_stack_000000b8;
  ulong *puStack00000000000000c8;
  ulong *in_stack_000000e0;
  int *in_stack_000000f0;
  undefined2 uStack0000000000000118;
  long in_stack_00000120;
  ulong uStack0000000000000138;
  ulong *in_stack_00000148;
  ulong in_stack_00000150;
  ulong *in_stack_00000158;
  int in_stack_00000160;
  undefined8 in_stack_00000168;
  
code_r0x000b0220:
  _memset(unaff_x19,0xff,param_3);
  uVar26 = *(ulong *)(unaff_x29 + -0x90);
  unaff_x19 = (ulong *)(unaff_x27 + unaff_x24 + 2);
  uVar37 = unaff_x24 * -0xff + unaff_x21;
code_r0x000b0264:
  *(char *)unaff_x19 = (char)uVar37;
  unaff_x19 = (ulong *)((long)unaff_x19 + 1);
LAB_000b0408:
  uStack0000000000000050 = (uint)uVar26;
  puVar18 = (ulong *)((long)unaff_x19 + unaff_x22);
  puVar25 = (ulong *)((char *)((long)unaff_x19 + (long)in_stack_000000e0) + -(long)in_stack_00000078
                     );
  if ((char *)((long)unaff_x19 + (long)in_stack_000000e0) + -(long)in_stack_00000078 <=
      unaff_x19 + 1) {
    puVar25 = unaff_x19 + 1;
  }
  puVar29 = in_stack_00000078;
  puVar15 = unaff_x19;
  if (((char *)((long)puVar25 + ~(ulong)unaff_x19) < &segment_command_00000020.vmaddr) ||
     ((ulong)((long)unaff_x19 - (long)in_stack_00000078) < 0x40)) {
LAB_000b0490:
    do {
      puVar25 = puVar15 + 1;
      *puVar15 = *puVar29;
      puVar29 = puVar29 + 1;
      puVar15 = puVar25;
    } while (puVar25 < puVar18);
  }
  else {
    uVar37 = ((long)puVar25 + ~(ulong)unaff_x19 >> 3) + 1;
    uVar44 = uVar37 & 0x3ffffffffffffff8;
    puVar25 = in_stack_00000078 + 4;
    puVar29 = unaff_x19 + 4;
    uVar26 = uVar44;
    do {
      uVar45 = puVar25[-4];
      uVar43 = puVar25[-1];
      uVar53 = puVar25[-2];
      uVar47 = puVar25[1];
      uVar17 = *puVar25;
      uVar49 = puVar25[3];
      uVar58 = puVar25[2];
      puVar29[-3] = puVar25[-3];
      puVar29[-4] = uVar45;
      puVar29[-1] = uVar43;
      puVar29[-2] = uVar53;
      puVar29[1] = uVar47;
      *puVar29 = uVar17;
      puVar29[3] = uVar49;
      puVar29[2] = uVar58;
      uVar26 = uVar26 - 8;
      puVar25 = puVar25 + 8;
      puVar29 = puVar29 + 8;
    } while (uVar26 != 0);
    puVar29 = in_stack_00000078 + uVar44;
    puVar15 = unaff_x19 + uVar44;
    if (uVar37 != uVar44) goto LAB_000b0490;
  }
  pcVar50 = (char *)((long)puVar18 + 2);
  *(undefined2 *)puVar18 = uStack0000000000000118;
  lVar57 = (long)(int)uStack0000000000000050;
  uVar37 = lVar57 - 4;
  if ((in_stack_00000168._4_4_ == 0) || (pcVar50 + uVar37 / 0xff + 6 <= in_stack_000000a0)) {
    if (uVar37 < 0xf) {
      *in_stack_000000b8 = *in_stack_000000b8 + (char)uVar37;
    }
    else {
      *in_stack_000000b8 = *in_stack_000000b8 + '\x0f';
      uVar37 = lVar57 - 0x13;
      if (0x1fd < uVar37) {
        lVar56 = ((lVar57 - 0x211U) / 0x1fe) * 2;
        _memset(pcVar50,0xff,lVar56 + 2);
        pcVar50 = (char *)((long)unaff_x19 + lVar56 + unaff_x22 + 4);
        uVar37 = (lVar57 - 0x211U) % 0x1fe;
      }
      pcVar51 = pcVar50;
      if (0xfe < uVar37) {
        pcVar51 = pcVar50 + 1;
        *pcVar50 = -1;
        uVar37 = uVar37 - 0xff;
      }
      pcVar50 = pcVar51 + 1;
      *pcVar51 = (char)uVar37;
    }
    puVar18 = (ulong *)(pcVar50 + 1);
    puVar25 = (ulong *)((long)in_stack_000000e0 + lVar57);
    uVar37 = (long)in_stack_00000148 - (long)puVar25;
    if ((in_stack_00000168._4_4_ == 0) ||
       ((char *)((long)puVar18 + uVar37 + uVar37 / 0xff + 8) <= in_stack_000000a0)) {
      uVar26 = uVar37 - 0xf;
      if (uVar37 < 0xf) {
        *pcVar50 = (char)((int)uVar37 << 4);
      }
      else {
        *pcVar50 = -0x10;
        puVar29 = puVar18;
        if (0xfe < uVar26) {
          uVar26 = (uVar37 - 0x10e) / 0xff;
          _memset(puVar18,0xff,uVar26 + 1);
          puVar29 = (ulong *)(pcVar50 + uVar26 + 2);
          uVar26 = (uVar37 - 0x10e) % 0xff;
        }
        puVar18 = (ulong *)((long)puVar29 + 1);
        *(char *)puVar29 = (char)uVar26;
      }
      puVar29 = (ulong *)((long)puVar18 + uVar37);
      uVar37 = (long)puVar18 - (long)puVar25;
      puVar15 = (ulong *)(uVar37 + (long)in_stack_00000148);
      if ((ulong *)(uVar37 + (long)in_stack_00000148) <= puVar18 + 1) {
        puVar15 = puVar18 + 1;
      }
      if (((char *)((long)puVar15 + ~(ulong)puVar18) < &segment_command_00000020.vmaddr) ||
         (uVar37 < 0x40)) {
        uVar26 = *(ulong *)(unaff_x29 + -0x80);
        puVar15 = puVar25;
LAB_000b06d0:
        do {
          puVar55 = puVar18 + 1;
          *puVar18 = *puVar15;
          puVar15 = puVar15 + 1;
          puVar18 = puVar55;
        } while (puVar55 < puVar29);
      }
      else {
        uVar44 = ((long)puVar15 + ~(ulong)puVar18 >> 3) + 1;
        uVar45 = uVar44 & 0x3ffffffffffffff8;
        puVar15 = (ulong *)((long)in_stack_000000e0 + lVar57 + 0x20);
        puVar55 = puVar18 + 4;
        uVar26 = uVar45;
        do {
          uVar53 = puVar15[-4];
          uVar17 = puVar15[-1];
          uVar43 = puVar15[-2];
          uVar58 = puVar15[1];
          uVar47 = *puVar15;
          uVar59 = puVar15[3];
          uVar49 = puVar15[2];
          puVar55[-3] = puVar15[-3];
          puVar55[-4] = uVar53;
          puVar55[-1] = uVar17;
          puVar55[-2] = uVar43;
          puVar55[1] = uVar58;
          *puVar55 = uVar47;
          puVar55[3] = uVar59;
          puVar55[2] = uVar49;
          uVar26 = uVar26 - 8;
          puVar15 = puVar15 + 8;
          puVar55 = puVar55 + 8;
        } while (uVar26 != 0);
        uVar26 = *(ulong *)(unaff_x29 + -0x80);
        puVar15 = puVar25 + uVar45;
        puVar18 = puVar18 + uVar45;
        if (uVar44 != uVar45) goto LAB_000b06d0;
      }
      in_stack_000000b8 = (char *)((long)puVar29 + 2);
      *(short *)puVar29 = (short)param_2;
      uVar44 = in_stack_00000120 - 4;
      if ((in_stack_00000168._4_4_ == 0) ||
         (in_stack_000000b8 + uVar44 / 0xff + 6 <= in_stack_000000a0)) {
        puStack00000000000000a8 = unaff_x20;
        if (uVar44 < 0xf) {
          *pcVar50 = *pcVar50 + (char)uVar44;
          goto joined_r0x000b07b4;
        }
        *pcVar50 = *pcVar50 + '\x0f';
        uVar44 = in_stack_00000120 - 0x13;
        if (0x1fd < uVar44) {
          lVar57 = ((in_stack_00000120 - 0x211U) / 0x1fe) * 2;
          _memset(in_stack_000000b8,0xff,lVar57 + 2);
          in_stack_000000b8 = (char *)((long)in_stack_00000148 + lVar57 + uVar37 + 4);
          uVar44 = (in_stack_00000120 - 0x211U) % 0x1fe;
        }
        pcVar50 = in_stack_000000b8;
        if (0xfe < uVar44) {
          pcVar50 = in_stack_000000b8 + 1;
          *in_stack_000000b8 = -1;
          uVar44 = uVar44 - 0xff;
        }
        in_stack_000000b8 = pcVar50 + 1;
        *pcVar50 = (char)uVar44;
        if (in_stack_00000158 <= unaff_x28) {
LAB_000acf98:
          lVar57 = *(long *)(unaff_x29 + -0xb8);
          lVar56 = *(long *)(lVar57 + 0x28);
          *(long *)(unaff_x29 + -0xa8) = lVar56;
          uVar32 = *(uint *)(lVar57 + 0x18);
          uVar44 = (ulong)uVar32;
          uVar38 = *(uint *)(lVar57 + 0x1c);
          *(uint *)(unaff_x29 + -0xd8) = uVar38 + 0x10000;
          puVar18 = *(ulong **)(lVar57 + 8);
          puVar25 = *(ulong **)(lVar57 + 0x10);
          *(ulong *)(unaff_x29 + -0xe0) = (long)puVar25 + (uVar44 - uVar38);
          *(uint *)(unaff_x29 + -0x90) = uVar32 - 4;
          *(ulong **)(unaff_x29 + -0xf0) = puVar18 + 1;
          uVar23 = *(uint *)(lVar57 + 0x20);
          *(int *)(unaff_x29 + -0xa0) = -4 - (int)in_stack_00000158;
          *(ulong **)(unaff_x29 + -0xb0) = in_stack_00000158;
          uVar37 = (ulong)uVar23;
          unaff_x20 = in_stack_00000158;
          uVar45 = uVar26;
          do {
            uVar23 = uVar32 + (int)((long)unaff_x20 - (long)puVar18);
            uVar11 = uVar38;
            if (*(uint *)(unaff_x29 + -0xd8) <= uVar23) {
              uVar11 = uVar23 - 0xffff;
            }
            uVar5 = (uint)*unaff_x20;
            lVar57 = *(long *)(unaff_x29 + -0x98);
            uVar20 = uVar5;
            if ((uint)uVar37 < uVar23) {
              do {
                lVar48 = (ulong)((uint)(*(int *)((long)puVar18 + (uVar37 - uVar44)) * -0x61c8864f)
                                >> 0x11) * 4;
                uVar20 = (int)uVar37 - *(int *)(lVar57 + lVar48);
                if (0xfffe < uVar20) {
                  uVar20 = 0xffff;
                }
                *(short *)(unaff_x23 + (uVar37 & 0xffff) * 2) = (short)uVar20;
                *(int *)(lVar57 + lVar48) = (int)uVar37;
                uVar37 = uVar37 + 1;
              } while (uVar37 < uVar23);
              uVar20 = (uint)*unaff_x20;
            }
            *(uint *)(*(long *)(unaff_x29 + -0xb8) + 0x20) = uVar23;
            uVar20 = *(uint *)(lVar57 + (ulong)(uVar20 * -0x61c8864f >> 0x11) * 4);
            uVar37 = (ulong)uVar20;
            bVar9 = true;
            bVar10 = false;
            if (uVar11 <= uVar20) {
              bVar10 = SBORROW4((int)uVar45,1);
              bVar9 = (int)uVar45 + -1 < 0;
            }
            uVar26 = uVar45;
            if (bVar9 == bVar10) {
              iVar46 = 0;
              uVar20 = 0;
              *(ulong *)(unaff_x29 + -0xf8) = ((long)unaff_x20 - (long)puVar18) + uVar44;
              puVar29 = (ulong *)((long)unaff_x20 + 4);
              *(uint **)(unaff_x29 + -0xd0) = (uint *)((long)unaff_x20 + 0xc);
              *(undefined8 *)(unaff_x29 + -200) = 0;
              *(uint *)(unaff_x29 + -0xc0) =
                   (uint)((uVar5 & 0xffff) == uVar5 >> 0x10 && (uVar5 & 0xff) == uVar5 >> 0x18);
              uVar53 = 3;
              uVar43 = CONCAT44(uVar5,uVar5);
              do {
                uVar13 = (uint)uVar37;
                uVar21 = uVar32 - uVar13;
                iVar12 = (int)puVar29;
                uVar34 = (uint)uVar53;
                if (uVar32 < uVar13 || uVar21 == 0) {
                  puVar31 = (uint *)((long)puVar18 + (ulong)(uVar13 - uVar32));
                  if ((*(short *)((long)unaff_x20 + (long)(int)uVar34 + -1) !=
                       *(short *)((long)puVar31 + (long)(int)uVar34 + -1)) || (*puVar31 != uVar5))
                  goto code_r0x000ad654;
                  puVar55 = (ulong *)(puVar31 + 1);
                  puVar15 = puVar29;
                  if (puVar29 < unaff_x28) {
                    uVar37 = *puVar29 ^ *puVar55;
                    if (uVar37 == 0) {
                      puVar55 = (ulong *)(puVar31 + 3);
                      puVar15 = *(ulong **)(unaff_x29 + -0xd0);
                      goto joined_r0x000adb64;
                    }
                    uVar37 = (uVar37 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar37 & 0x5555555555555555) << 1
                    ;
                    uVar37 = (uVar37 & 0xcccccccccccccccc) >> 2 | (uVar37 & 0x3333333333333333) << 2
                    ;
                    uVar37 = (uVar37 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar37 & 0xf0f0f0f0f0f0f0f) << 4;
                    uVar37 = (uVar37 & 0xff00ff00ff00ff00) >> 8 | (uVar37 & 0xff00ff00ff00ff) << 8;
                    uVar37 = (uVar37 & 0xffff0000ffff0000) >> 0x10 |
                             (uVar37 & 0xffff0000ffff) << 0x10;
                    iVar35 = (int)((ulong)LZCOUNT(uVar37 >> 0x20 | uVar37 << 0x20) >> 3);
                  }
                  else {
joined_r0x000adb64:
                    if (puVar15 < unaff_x28) {
                      iVar35 = *(int *)(unaff_x29 + -0xa0) + (int)puVar15;
                      do {
                        uVar37 = *puVar15 ^ *puVar55;
                        if (uVar37 != 0) {
                          uVar37 = (uVar37 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                                   (uVar37 & 0x5555555555555555) << 1;
                          uVar37 = (uVar37 & 0xcccccccccccccccc) >> 2 |
                                   (uVar37 & 0x3333333333333333) << 2;
                          uVar37 = (uVar37 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                                   (uVar37 & 0xf0f0f0f0f0f0f0f) << 4;
                          uVar37 = (uVar37 & 0xff00ff00ff00ff00) >> 8 |
                                   (uVar37 & 0xff00ff00ff00ff) << 8;
                          uVar37 = (uVar37 & 0xffff0000ffff0000) >> 0x10 |
                                   (uVar37 & 0xffff0000ffff) << 0x10;
                          iVar35 = (int)((ulong)LZCOUNT(uVar37 >> 0x20 | uVar37 << 0x20) >> 3) +
                                   iVar35;
                          goto code_r0x000ad618;
                        }
                        puVar15 = puVar15 + 1;
                        puVar55 = puVar55 + 1;
                        iVar35 = iVar35 + 8;
                      } while (puVar15 < unaff_x28);
                    }
                    if (puVar15 < in_stack_00000060) {
                      if ((uint)*puVar55 == (uint)*puVar15) {
                        puVar15 = (ulong *)((long)puVar15 + 4);
                        puVar55 = (ulong *)((long)puVar55 + 4);
                      }
                      if (puVar15 < in_stack_00000058) goto code_r0x000adad8;
code_r0x000ad538:
                      if (puVar15 < *(ulong **)(unaff_x29 + -0x88)) {
code_r0x000ad544:
                        if ((char)*puVar55 == (char)*puVar15) {
                          puVar15 = (ulong *)((long)puVar15 + 1);
                        }
                      }
                    }
                    else {
                      if (in_stack_00000058 <= puVar15) goto code_r0x000ad538;
code_r0x000adad8:
                      if ((short)*puVar55 == (short)*puVar15) {
                        puVar15 = (ulong *)((long)puVar15 + 2);
                        puVar55 = (ulong *)((long)puVar55 + 2);
                      }
                      if (puVar15 < *(ulong **)(unaff_x29 + -0x88)) goto code_r0x000ad544;
                    }
                    iVar35 = (int)puVar15 - iVar12;
                  }
code_r0x000ad618:
                  uVar27 = iVar35 + 4U;
                  uVar4 = uVar23 - uVar13;
                  if ((int)(iVar35 + 4U) <= (int)uVar34) {
                    uVar27 = uVar34;
                    uVar4 = uVar20;
                  }
                  uVar20 = uVar4;
                  uVar53 = (ulong)uVar27;
                }
                else if ((uVar13 <= *(uint *)(unaff_x29 + -0x90)) &&
                        (puVar31 = (uint *)((long)puVar25 + (ulong)(uVar13 - uVar38)),
                        *puVar31 == uVar5)) {
                  puVar15 = (ulong *)((long)unaff_x20 + (ulong)uVar21);
                  puVar55 = *(ulong **)(unaff_x29 + -0x88);
                  if (puVar15 <= *(ulong **)(unaff_x29 + -0x88)) {
                    puVar55 = puVar15;
                  }
                  puVar14 = (ulong *)(puVar31 + 1);
                  puVar52 = (ulong *)((long)puVar55 - 7);
                  puVar30 = puVar29;
                  if (puVar29 < puVar52) {
                    uVar37 = *puVar29 ^ *puVar14;
                    if (uVar37 == 0) {
                      puVar14 = (ulong *)(puVar31 + 3);
                      puVar30 = *(ulong **)(unaff_x29 + -0xd0);
                      goto joined_r0x000adb54;
                    }
                    uVar37 = (uVar37 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar37 & 0x5555555555555555) << 1
                    ;
                    uVar37 = (uVar37 & 0xcccccccccccccccc) >> 2 | (uVar37 & 0x3333333333333333) << 2
                    ;
                    uVar37 = (uVar37 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar37 & 0xf0f0f0f0f0f0f0f) << 4;
                    uVar37 = (uVar37 & 0xff00ff00ff00ff00) >> 8 | (uVar37 & 0xff00ff00ff00ff) << 8;
                    uVar37 = (uVar37 & 0xffff0000ffff0000) >> 0x10 |
                             (uVar37 & 0xffff0000ffff) << 0x10;
                    iVar35 = (int)((ulong)LZCOUNT(uVar37 >> 0x20 | uVar37 << 0x20) >> 3);
                  }
                  else {
joined_r0x000adb54:
                    if (puVar30 < puVar52) {
                      iVar35 = *(int *)(unaff_x29 + -0xa0) + (int)puVar30;
                      do {
                        uVar37 = *puVar30 ^ *puVar14;
                        if (uVar37 != 0) {
                          uVar37 = (uVar37 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                                   (uVar37 & 0x5555555555555555) << 1;
                          uVar37 = (uVar37 & 0xcccccccccccccccc) >> 2 |
                                   (uVar37 & 0x3333333333333333) << 2;
                          uVar37 = (uVar37 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                                   (uVar37 & 0xf0f0f0f0f0f0f0f) << 4;
                          uVar37 = (uVar37 & 0xff00ff00ff00ff00) >> 8 |
                                   (uVar37 & 0xff00ff00ff00ff) << 8;
                          uVar37 = (uVar37 & 0xffff0000ffff0000) >> 0x10 |
                                   (uVar37 & 0xffff0000ffff) << 0x10;
                          iVar35 = (int)((ulong)LZCOUNT(uVar37 >> 0x20 | uVar37 << 0x20) >> 3) +
                                   iVar35;
                          goto code_r0x000ad478;
                        }
                        puVar30 = puVar30 + 1;
                        puVar14 = puVar14 + 1;
                        iVar35 = iVar35 + 8;
                      } while (puVar30 < puVar52);
                    }
                    if (puVar30 < (ulong *)((long)puVar55 - 3U)) {
                      if ((uint)*puVar14 == (uint)*puVar30) {
                        puVar30 = (ulong *)((long)puVar30 + 4);
                        puVar14 = (ulong *)((long)puVar14 + 4);
                      }
                      if (puVar30 < (ulong *)((long)puVar55 - 1U)) goto code_r0x000adaa4;
                    }
                    else if (puVar30 < (ulong *)((long)puVar55 - 1U)) {
code_r0x000adaa4:
                      if ((short)*puVar14 == (short)*puVar30) {
                        puVar30 = (ulong *)((long)puVar30 + 2);
                        puVar14 = (ulong *)((long)puVar14 + 2);
                      }
                    }
                    if (puVar30 < puVar55) {
                      if ((char)*puVar14 == (char)*puVar30) {
                        puVar30 = (ulong *)((long)puVar30 + 1);
                      }
                    }
                    iVar35 = (int)puVar30 - iVar12;
                  }
code_r0x000ad478:
                  uVar27 = iVar35 + 4;
                  if (puVar15 < *(ulong **)(unaff_x29 + -0x88)) {
                    unaff_x26 = *(char **)(unaff_x29 + -0x78);
                    if ((ulong *)((long)unaff_x20 + (long)(int)uVar27) == puVar55) {
                      puVar30 = puVar18;
                      puVar15 = puVar55;
                      if (puVar55 < unaff_x28) {
                        uVar37 = *puVar55 ^ *puVar18;
                        if (uVar37 == 0) {
                          puVar15 = puVar55 + 1;
                          puVar30 = *(ulong **)(unaff_x29 + -0xf0);
                          goto code_r0x000ad568;
                        }
                        uVar37 = (uVar37 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                                 (uVar37 & 0x5555555555555555) << 1;
                        uVar37 = (uVar37 & 0xcccccccccccccccc) >> 2 |
                                 (uVar37 & 0x3333333333333333) << 2;
                        uVar37 = (uVar37 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                                 (uVar37 & 0xf0f0f0f0f0f0f0f) << 4;
                        uVar37 = (uVar37 & 0xff00ff00ff00ff00) >> 8 |
                                 (uVar37 & 0xff00ff00ff00ff) << 8;
                        uVar37 = (uVar37 & 0xffff0000ffff0000) >> 0x10 |
                                 (uVar37 & 0xffff0000ffff) << 0x10;
                        iVar35 = (int)((ulong)LZCOUNT(uVar37 >> 0x20 | uVar37 << 0x20) >> 3);
                      }
                      else {
code_r0x000ad568:
                        if (puVar15 < unaff_x28) {
                          uVar37 = *(long *)(unaff_x29 + -0xb0) + (ulong)uVar21;
                          uVar26 = in_stack_00000150;
                          if (uVar37 <= in_stack_00000150) {
                            uVar26 = uVar37;
                          }
                          iVar35 = (int)puVar15 - (int)uVar26;
                          do {
                            uVar37 = *puVar15 ^ *puVar30;
                            if (uVar37 != 0) {
                              uVar37 = (uVar37 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                                       (uVar37 & 0x5555555555555555) << 1;
                              uVar37 = (uVar37 & 0xcccccccccccccccc) >> 2 |
                                       (uVar37 & 0x3333333333333333) << 2;
                              uVar37 = (uVar37 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                                       (uVar37 & 0xf0f0f0f0f0f0f0f) << 4;
                              uVar37 = (uVar37 & 0xff00ff00ff00ff00) >> 8 |
                                       (uVar37 & 0xff00ff00ff00ff) << 8;
                              uVar37 = (uVar37 & 0xffff0000ffff0000) >> 0x10 |
                                       (uVar37 & 0xffff0000ffff) << 0x10;
                              iVar35 = (int)((ulong)LZCOUNT(uVar37 >> 0x20 | uVar37 << 0x20) >> 3) +
                                       iVar35;
                              goto code_r0x000ad63c;
                            }
                            puVar15 = puVar15 + 1;
                            puVar30 = puVar30 + 1;
                            iVar35 = iVar35 + 8;
                          } while (puVar15 < unaff_x28);
                        }
                        if (puVar15 < in_stack_00000060) {
                          if ((uint)*puVar30 == (uint)*puVar15) {
                            puVar15 = (ulong *)((long)puVar15 + 4);
                            puVar30 = (ulong *)((long)puVar30 + 4);
                          }
                          if (puVar15 < in_stack_00000058) goto code_r0x000adb10;
code_r0x000ad5e0:
                          if (puVar15 < *(ulong **)(unaff_x29 + -0x88)) {
code_r0x000ad5ec:
                            if ((char)*puVar30 == (char)*puVar15) {
                              puVar15 = (ulong *)((long)puVar15 + 1);
                            }
                          }
                        }
                        else {
                          if (in_stack_00000058 <= puVar15) goto code_r0x000ad5e0;
code_r0x000adb10:
                          if ((short)*puVar30 == (short)*puVar15) {
                            puVar15 = (ulong *)((long)puVar15 + 2);
                            puVar30 = (ulong *)((long)puVar30 + 2);
                          }
                          if (puVar15 < *(ulong **)(unaff_x29 + -0x88)) goto code_r0x000ad5ec;
                        }
                        iVar35 = (int)puVar15 - (int)puVar55;
                      }
code_r0x000ad63c:
                      uVar27 = iVar35 + uVar27;
                      goto code_r0x000ad640;
                    }
                  }
                  else {
code_r0x000ad640:
                    unaff_x26 = *(char **)(unaff_x29 + -0x78);
                  }
                  uVar4 = uVar23 - uVar13;
                  if ((int)uVar27 <= (int)uVar34) {
                    uVar27 = uVar34;
                    uVar4 = uVar20;
                  }
                  uVar20 = uVar4;
                  uVar53 = (ulong)uVar27;
                  uVar26 = *(ulong *)(unaff_x29 + -0x80);
                }
code_r0x000ad654:
                iVar35 = (int)uVar45;
                uVar45 = (ulong)(iVar35 - 1);
                uVar34 = (uint)*(ushort *)(unaff_x23 + (ulong)(uVar13 & 0xffff) * 2);
                if (((int)uVar26 < 0x81) || (uVar34 != 1)) {
code_r0x000ad7f0:
                  uVar37 = (ulong)(uVar13 - uVar34);
                }
                else {
                  if (iVar46 == 0) {
                    if (*(int *)(unaff_x29 + -0xc0) != 0) {
                      if (puVar29 < unaff_x28) {
                        lVar57 = 4;
                        do {
                          uVar37 = *(ulong *)((long)unaff_x20 + lVar57) ^ uVar43;
                          if (uVar37 != 0) {
                            uVar37 = (uVar37 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                                     (uVar37 & 0x5555555555555555) << 1;
                            uVar37 = (uVar37 & 0xcccccccccccccccc) >> 2 |
                                     (uVar37 & 0x3333333333333333) << 2;
                            uVar37 = (uVar37 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                                     (uVar37 & 0xf0f0f0f0f0f0f0f) << 4;
                            uVar37 = (uVar37 & 0xff00ff00ff00ff00) >> 8 |
                                     (uVar37 & 0xff00ff00ff00ff) << 8;
                            uVar37 = (uVar37 & 0xffff0000ffff0000) >> 0x10 |
                                     (uVar37 & 0xffff0000ffff) << 0x10;
                            puVar55 = (ulong *)(*(long *)(unaff_x29 + -0xb0) +
                                                ((ulong)LZCOUNT(uVar37 >> 0x20 | uVar37 << 0x20) >>
                                                3) + lVar57);
                            goto code_r0x000ad7c8;
                          }
                          lVar57 = lVar57 + 8;
                          puVar15 = (ulong *)((long)unaff_x20 + lVar57);
                        } while (puVar15 < unaff_x28);
                        puVar55 = (ulong *)(*(long *)(unaff_x29 + -0xb0) + lVar57);
                        puVar30 = *(ulong **)(unaff_x29 + -0x88);
                        if (puVar15 < puVar30) goto code_r0x000ad6e0;
                      }
                      else {
                        puVar30 = *(ulong **)(unaff_x29 + -0x88);
                        puVar55 = puVar29;
                        puVar15 = puVar29;
                        if (puVar29 < puVar30) {
code_r0x000ad6e0:
                          lVar57 = (long)puVar30 - (long)puVar55;
                          puVar55 = (ulong *)((long)puVar15 + lVar57);
                          uVar37 = uVar43;
                          do {
                            if ((uint)(byte)*puVar15 != ((uint)uVar37 & 0xff))
                            goto code_r0x000ad70c;
                            puVar15 = (ulong *)((long)puVar15 + 1);
                            uVar37 = uVar37 >> 8;
                            lVar57 = lVar57 + -1;
                          } while (lVar57 != 0);
                          puVar15 = puVar55;
code_r0x000ad70c:
                          puVar55 = puVar15;
                        }
                      }
code_r0x000ad7c8:
                      *(ulong *)(unaff_x29 + -200) = (ulong)(uint)((int)puVar55 - iVar12) + 4;
                      iVar46 = 2;
                      goto code_r0x000ad67c;
                    }
                    iVar46 = 1;
                    goto code_r0x000ad7f0;
                  }
                  if (iVar46 != 2) {
code_r0x000ad7e0:
                    uVar26 = *(ulong *)(unaff_x29 + -0x80);
                    goto code_r0x000ad7f0;
                  }
code_r0x000ad67c:
                  uVar27 = uVar13 - 1;
                  if (uVar27 < uVar11) goto code_r0x000ad7e0;
                  if (uVar21 < 3) {
                    iVar46 = 2;
                    uVar26 = *(ulong *)(unaff_x29 + -0x80);
                    goto code_r0x000ad7f0;
                  }
                  puVar15 = (ulong *)((long)puVar25 + (ulong)(uVar27 - uVar38));
                  puVar55 = (ulong *)((long)puVar18 + (ulong)(uVar27 - uVar32));
                  if (uVar27 < uVar32) {
                    puVar55 = puVar15;
                  }
                  if ((uint)*puVar55 != uVar5) {
                    iVar46 = 2;
                    uVar26 = *(ulong *)(unaff_x29 + -0x80);
                    unaff_x26 = *(char **)(unaff_x29 + -0x78);
                    goto code_r0x000ad7f0;
                  }
                  puVar30 = *(ulong **)(unaff_x29 + -0x88);
                  if (uVar27 < uVar32) {
                    puVar30 = *(ulong **)(unaff_x29 + -0xe0);
                  }
                  puVar14 = (ulong *)((long)puVar55 + 4);
                  puVar52 = puVar14;
                  if (puVar14 < (ulong *)((long)puVar30 - 7U)) {
                    puVar36 = puVar14;
                    do {
                      uVar37 = *puVar52 ^ uVar43;
                      if (uVar37 != 0) {
                        uVar37 = (uVar37 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                                 (uVar37 & 0x5555555555555555) << 1;
                        uVar37 = (uVar37 & 0xcccccccccccccccc) >> 2 |
                                 (uVar37 & 0x3333333333333333) << 2;
                        uVar37 = (uVar37 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                                 (uVar37 & 0xf0f0f0f0f0f0f0f) << 4;
                        uVar37 = (uVar37 & 0xff00ff00ff00ff00) >> 8 |
                                 (uVar37 & 0xff00ff00ff00ff) << 8;
                        uVar37 = (uVar37 & 0xffff0000ffff0000) >> 0x10 |
                                 (uVar37 & 0xffff0000ffff) << 0x10;
                        puVar52 = (ulong *)((long)puVar36 +
                                           ((ulong)LZCOUNT(uVar37 >> 0x20 | uVar37 << 0x20) >> 3));
                        goto code_r0x000ad818;
                      }
                      puVar52 = puVar52 + 1;
                      puVar36 = puVar36 + 1;
                    } while (puVar52 < (ulong *)((long)puVar30 - 7U));
                  }
                  if (puVar52 < puVar30) {
                    lVar57 = (long)puVar30 - (long)puVar52;
                    uVar37 = uVar43;
                    do {
                      if ((uint)(byte)*puVar52 != ((uint)uVar37 & 0xff)) goto code_r0x000ad818;
                      puVar52 = (ulong *)((long)puVar52 + 1);
                      uVar37 = uVar37 >> 8;
                      lVar57 = lVar57 + -1;
                    } while (lVar57 != 0);
                    puVar52 = puVar30;
                  }
code_r0x000ad818:
                  uVar26 = (long)puVar52 - (long)puVar14;
                  uVar37 = (uVar26 & 0xffffffff) + 4;
                  if (uVar27 < uVar32) {
                    unaff_x26 = *(char **)(unaff_x29 + -0x78);
                    puVar30 = puVar25;
                    if ((long)puVar15 + uVar37 == *(long *)(unaff_x29 + -0xe0)) {
                      puVar15 = puVar18;
                      puVar14 = puVar18;
                      uVar17 = uVar43;
                      if ((uVar26 & 3) != 0) {
                        uVar21 = (int)uVar26 * -8 & 0x1f;
                        uVar21 = uVar5 >> uVar21 | uVar5 << 0x20 - uVar21;
                        uVar17 = CONCAT44(uVar21,uVar21);
                      }
                      for (; puVar15 < unaff_x28; puVar15 = puVar15 + 1) {
                        uVar26 = *puVar15 ^ uVar17;
                        if (uVar26 != 0) {
                          uVar26 = (uVar26 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                                   (uVar26 & 0x5555555555555555) << 1;
                          uVar26 = (uVar26 & 0xcccccccccccccccc) >> 2 |
                                   (uVar26 & 0x3333333333333333) << 2;
                          uVar26 = (uVar26 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                                   (uVar26 & 0xf0f0f0f0f0f0f0f) << 4;
                          uVar26 = (uVar26 & 0xff00ff00ff00ff00) >> 8 |
                                   (uVar26 & 0xff00ff00ff00ff) << 8;
                          uVar26 = (uVar26 & 0xffff0000ffff0000) >> 0x10 |
                                   (uVar26 & 0xffff0000ffff) << 0x10;
                          puVar14 = (ulong *)((long)puVar14 +
                                             ((ulong)LZCOUNT(uVar26 >> 0x20 | uVar26 << 0x20) >> 3))
                          ;
                          goto code_r0x000ad8dc;
                        }
                        puVar14 = puVar14 + 1;
                      }
                      if (puVar15 < *(ulong **)(unaff_x29 + -0x88)) {
                        lVar57 = (long)*(ulong **)(unaff_x29 + -0x88) - (long)puVar14;
                        puVar52 = (ulong *)((long)puVar15 + lVar57);
                        do {
                          puVar14 = puVar15;
                          if ((uint)(byte)*puVar15 != ((uint)uVar17 & 0xff)) goto code_r0x000ad8dc;
                          puVar15 = (ulong *)((long)puVar15 + 1);
                          uVar17 = uVar17 >> 8;
                          lVar57 = lVar57 + -1;
                        } while (lVar57 != 0);
                        puVar14 = puVar52;
                      }
code_r0x000ad8dc:
                      uVar37 = (uint)((int)puVar14 - (int)puVar18) + uVar37;
                    }
                  }
                  else {
                    unaff_x26 = *(char **)(unaff_x29 + -0x78);
                    puVar30 = puVar18;
                  }
                  *(uint *)(unaff_x29 + -0x6c) = uVar5;
                  puVar15 = puVar55;
                  do {
                    puVar14 = puVar15;
                    if (puVar14 < (ulong *)((long)puVar30 + 4U)) break;
                    puVar15 = (ulong *)((long)puVar14 + -4);
                  } while (*(uint *)((long)puVar14 + -4) == uVar5);
                  puVar15 = puVar14;
                  if (puVar30 < puVar14) {
                    lVar57 = 0;
                    do {
                      puVar15 = (ulong *)((long)puVar14 + lVar57);
                      if (*(char *)((long)puVar15 + -1) != unaff_x26[lVar57]) goto code_r0x000ad94c;
                      lVar57 = lVar57 + -1;
                    } while (puVar30 < (ulong *)((long)puVar14 + lVar57));
                    puVar15 = puVar30;
                  }
code_r0x000ad94c:
                  iVar46 = (int)((long)puVar55 - (long)puVar15);
                  uVar26 = *(ulong *)(unaff_x29 + -200);
                  if (((uVar32 <= uVar27) &&
                      ((ulong *)((long)puVar55 - ((long)puVar55 - (long)puVar15 & 0xffffffffU)) ==
                       puVar18)) && (uVar38 < uVar32)) {
                    uVar13 = iVar46 * 8 & 0x1f;
                    uVar21 = uVar5;
                    if ((-iVar46 & 3U) != 0) {
                      uVar21 = uVar5 >> uVar13 | uVar5 << 0x20 - uVar13;
                    }
                    *(uint *)(unaff_x29 + -0x6c) = uVar21;
                    lVar57 = uVar44 - uVar38;
                    do {
                      lVar48 = lVar57;
                      if (lVar48 < 4) {
                        puVar15 = (ulong *)((long)puVar25 + lVar48);
                        if (lVar48 < 1) goto code_r0x000ad9dc;
                        break;
                      }
                      lVar57 = lVar48 + -4;
                    } while (*(uint *)((long)puVar25 + lVar48 + -4) == uVar21);
                    pcVar50 = unaff_x26;
                    puVar15 = (ulong *)((long)puVar25 + lVar48);
                    do {
                      puVar55 = (ulong *)((long)puVar15 - 1);
                      if ((char)*puVar55 != *pcVar50) goto code_r0x000ad9dc;
                      pcVar50 = pcVar50 + -1;
                      puVar15 = puVar55;
                    } while (puVar25 < puVar55);
                    puVar15 = puVar25;
code_r0x000ad9dc:
                    iVar46 = ((int)*(undefined8 *)(unaff_x29 + -0xe0) - (int)puVar15) + iVar46;
                    uVar26 = *(ulong *)(unaff_x29 + -200);
                  }
                  uVar21 = uVar27 - iVar46;
                  if (uVar27 - iVar46 <= uVar11) {
                    uVar21 = uVar11;
                  }
                  uVar17 = uVar37 + (uVar27 - uVar21);
                  if ((uVar26 < uVar37) || (uVar17 < uVar26)) {
                    if (uVar32 + ~uVar21 < 3) {
                      iVar46 = 2;
                      uVar26 = *(ulong *)(unaff_x29 + -0x80);
                      uVar37 = uVar44;
                    }
                    else {
                      if (uVar26 <= uVar17) {
                        uVar17 = uVar26;
                      }
                      uVar26 = *(ulong *)(unaff_x29 + -0x80);
                      if ((ulong)(long)(int)uVar53 < uVar17) {
                        if (*(long *)(unaff_x29 + -0xf8) - (ulong)uVar21 >> 0x10 != 0)
                        goto code_r0x000ad094;
                        uVar20 = uVar23 - uVar21;
                        uVar53 = uVar17;
                      }
                      uVar13 = (uint)*(ushort *)(unaff_x23 + (ulong)(uVar21 & 0xffff) * 2);
                      uVar37 = (ulong)(uVar21 - uVar13);
                      if (uVar21 < uVar13) goto code_r0x000ad094;
                      iVar46 = 2;
                    }
                  }
                  else {
                    uVar21 = (uVar27 - (int)uVar26) + (int)uVar37;
                    uVar13 = uVar32;
                    if (2 < uVar32 + ~uVar21) {
                      uVar13 = uVar21;
                    }
                    iVar46 = 2;
                    uVar26 = *(ulong *)(unaff_x29 + -0x80);
                    uVar37 = (ulong)uVar13;
                  }
                }
                if (((uint)uVar37 < uVar11) || (iVar35 < 2)) goto code_r0x000ad094;
              } while( true );
            }
            uVar20 = 0;
            uVar53 = 3;
code_r0x000ad094:
            if (((uVar23 < *(uint *)(unaff_x29 + -0xd8)) && (*(int *)(unaff_x29 + -0xe4) == 1)) &&
               (0 < (int)uVar45)) {
              lVar57 = (*(long *)(lVar56 + 0x40000) - *(long *)(&UNK_00040008 + lVar56)) +
                       (ulong)*(uint *)(&UNK_00040018 + lVar56);
              uVar21 = *(uint *)(*(long *)(unaff_x29 + -0xa8) +
                                (ulong)((uint)*unaff_x20 * -0x61c8864f >> 0x11) * 4);
              iVar46 = (uVar21 + uVar11) - (int)lVar57;
              uVar11 = uVar23 - iVar46;
              if (uVar11 >> 0x10 == 0) {
                puVar29 = (ulong *)((long)unaff_x20 + 4);
                do {
                  if ((int)uVar45 == 0) break;
                  puVar31 = (uint *)((*(long *)(&UNK_00040008 + lVar56) -
                                     (ulong)*(uint *)(&UNK_00040018 + lVar56)) + (ulong)uVar21);
                  if (*puVar31 == uVar5) {
                    puVar15 = (ulong *)((long)unaff_x20 + (lVar57 - (ulong)uVar21));
                    puVar55 = *(ulong **)(unaff_x29 + -0x88);
                    if (puVar15 <= *(ulong **)(unaff_x29 + -0x88)) {
                      puVar55 = puVar15;
                    }
                    puVar30 = (ulong *)(puVar31 + 1);
                    puVar14 = (ulong *)((long)puVar55 - 7);
                    puVar15 = puVar29;
                    if (puVar29 < puVar14) {
                      uVar37 = *puVar29 ^ *puVar30;
                      if (uVar37 == 0) {
                        puVar30 = (ulong *)(puVar31 + 3);
                        puVar15 = (ulong *)((long)unaff_x20 + 0xc);
                        goto joined_r0x000ad284;
                      }
                      uVar37 = (uVar37 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                               (uVar37 & 0x5555555555555555) << 1;
                      uVar37 = (uVar37 & 0xcccccccccccccccc) >> 2 |
                               (uVar37 & 0x3333333333333333) << 2;
                      uVar37 = (uVar37 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                               (uVar37 & 0xf0f0f0f0f0f0f0f) << 4;
                      uVar37 = (uVar37 & 0xff00ff00ff00ff00) >> 8 | (uVar37 & 0xff00ff00ff00ff) << 8
                      ;
                      uVar37 = (uVar37 & 0xffff0000ffff0000) >> 0x10 |
                               (uVar37 & 0xffff0000ffff) << 0x10;
                      iVar12 = (int)((ulong)LZCOUNT(uVar37 >> 0x20 | uVar37 << 0x20) >> 3);
                    }
                    else {
joined_r0x000ad284:
                      if (puVar15 < puVar14) {
                        iVar12 = *(int *)(unaff_x29 + -0xa0) + (int)puVar15;
                        do {
                          uVar37 = *puVar15 ^ *puVar30;
                          if (uVar37 != 0) {
                            uVar37 = (uVar37 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                                     (uVar37 & 0x5555555555555555) << 1;
                            uVar37 = (uVar37 & 0xcccccccccccccccc) >> 2 |
                                     (uVar37 & 0x3333333333333333) << 2;
                            uVar37 = (uVar37 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                                     (uVar37 & 0xf0f0f0f0f0f0f0f) << 4;
                            uVar37 = (uVar37 & 0xff00ff00ff00ff00) >> 8 |
                                     (uVar37 & 0xff00ff00ff00ff) << 8;
                            uVar37 = (uVar37 & 0xffff0000ffff0000) >> 0x10 |
                                     (uVar37 & 0xffff0000ffff) << 0x10;
                            iVar12 = (int)((ulong)LZCOUNT(uVar37 >> 0x20 | uVar37 << 0x20) >> 3) +
                                     iVar12;
                            goto code_r0x000ad240;
                          }
                          puVar15 = puVar15 + 1;
                          puVar30 = puVar30 + 1;
                          iVar12 = iVar12 + 8;
                        } while (puVar15 < puVar14);
                      }
                      if (puVar15 < (ulong *)((long)puVar55 - 3U)) {
                        if ((uint)*puVar30 == (uint)*puVar15) {
                          puVar15 = (ulong *)((long)puVar15 + 4);
                          puVar30 = (ulong *)((long)puVar30 + 4);
                        }
                        if (puVar15 < (ulong *)((long)puVar55 - 1U)) goto code_r0x000ad254;
                      }
                      else if (puVar15 < (ulong *)((long)puVar55 - 1U)) {
code_r0x000ad254:
                        if ((short)*puVar30 == (short)*puVar15) {
                          puVar15 = (ulong *)((long)puVar15 + 2);
                          puVar30 = (ulong *)((long)puVar30 + 2);
                        }
                      }
                      if (puVar15 < puVar55) {
                        if ((char)*puVar30 == (char)*puVar15) {
                          puVar15 = (ulong *)((long)puVar15 + 1);
                        }
                      }
                      iVar12 = (int)puVar15 - (int)puVar29;
code_r0x000ad240:
                      unaff_x26 = *(char **)(unaff_x29 + -0x78);
                    }
                    uVar13 = iVar12 + 4U;
                    if ((int)(iVar12 + 4U) <= (int)(uint)uVar53) {
                      uVar13 = (uint)uVar53;
                      uVar11 = uVar20;
                    }
                    uVar20 = uVar11;
                    uVar53 = (ulong)uVar13;
                  }
                  uVar45 = (ulong)((int)uVar45 - 1);
                  uVar11 = (uint)*(ushort *)
                                  (*(long *)(unaff_x29 + -0xa8) + (ulong)(uVar21 & 0xffff) * 2 +
                                  0x20000);
                  uVar21 = uVar21 - uVar11;
                  iVar46 = iVar46 - uVar11;
                  uVar11 = uVar23 - iVar46;
                } while (uVar11 < 0x10000);
              }
            }
            if (3 < (int)uVar53) goto code_r0x000adb94;
            unaff_x20 = (ulong *)((long)unaff_x20 + 1);
            *(int *)(unaff_x29 + -0xa0) = *(int *)(unaff_x29 + -0xa0) + -1;
            *(long *)(unaff_x29 + -0xb0) = *(long *)(unaff_x29 + -0xb0) + 1;
            uVar37 = (ulong)uVar23;
            uVar45 = uVar26;
            if (unaff_x28 < unaff_x20) break;
          } while( true );
        }
        goto LAB_000b14b0;
      }
    }
    in_stack_00000158 = puVar25;
    in_stack_000000b8 = pcVar50;
    uStack0000000000000050 = (uint)param_1;
    uStack0000000000000118 = (short)param_2;
  }
  else {
    in_stack_00000158 = in_stack_00000078;
    in_stack_00000148 = in_stack_000000e0;
  }
code_r0x000b4f20:
  if (in_stack_00000168._4_4_ != 2) goto LAB_000b4c7c;
  uVar37 = (long)in_stack_00000148 - (long)in_stack_00000158;
  lVar57 = uVar37 + (uVar37 + 0xf0) / 0xff;
  if ((char *)(in_stack_00000068 + -8) < in_stack_000000b8 + lVar57 + 1) goto LAB_000b14b0;
  uVar26 = ((in_stack_00000068 + -8) - (long)(in_stack_000000b8 + lVar57 + 1)) * 0xff + 0x12;
  uVar32 = (uint)uVar26;
  if ((ulong)(long)(int)uStack0000000000000050 <= uVar26) {
    uVar32 = uStack0000000000000050;
  }
  lVar56 = (long)(int)uVar32;
  if ((long)(~(ulong)(in_stack_000000b8 + lVar57 + 3) + in_stack_00000068 + lVar56) < 0xc)
  goto LAB_000b14b0;
  puVar18 = (ulong *)(in_stack_000000b8 + 1);
  uVar26 = uVar37 - 0xf;
  if (uVar37 < 0xf) {
    *in_stack_000000b8 = (char)((int)uVar37 << 4);
  }
  else {
    *in_stack_000000b8 = -0x10;
    puVar25 = puVar18;
    if (0xfe < uVar26) {
      uVar26 = (uVar37 - 0x10e) / 0xff;
      _memset(puVar18,0xff,uVar26 + 1);
      puVar25 = (ulong *)(in_stack_000000b8 + uVar26 + 2);
      uVar26 = (uVar37 - 0x10e) % 0xff;
    }
    puVar18 = (ulong *)((long)puVar25 + 1);
    *(char *)puVar25 = (char)uVar26;
  }
  puVar25 = (ulong *)((long)puVar18 + uVar37);
  puVar29 = (ulong *)((char *)((long)in_stack_00000148 + (long)puVar18) + -(long)in_stack_00000158);
  if ((char *)((long)in_stack_00000148 + (long)puVar18) + -(long)in_stack_00000158 <= puVar18 + 1) {
    puVar29 = puVar18 + 1;
  }
  puVar15 = in_stack_00000158;
  puVar55 = puVar18;
  if (((char *)((long)puVar29 + ~(ulong)puVar18) < &segment_command_00000020.vmaddr) ||
     ((ulong)((long)puVar18 - (long)in_stack_00000158) < 0x40)) goto code_r0x000b508c;
  uVar37 = ((long)puVar29 + ~(ulong)puVar18 >> 3) + 1;
  uVar44 = uVar37 & 0x3ffffffffffffff8;
  puVar29 = in_stack_00000158 + 4;
  puVar15 = puVar18 + 4;
  uVar26 = uVar44;
  do {
    uVar45 = puVar29[-4];
    uVar43 = puVar29[-1];
    uVar53 = puVar29[-2];
    uVar47 = puVar29[1];
    uVar17 = *puVar29;
    uVar49 = puVar29[3];
    uVar58 = puVar29[2];
    puVar15[-3] = puVar29[-3];
    puVar15[-4] = uVar45;
    puVar15[-1] = uVar43;
    puVar15[-2] = uVar53;
    puVar15[1] = uVar47;
    *puVar15 = uVar17;
    puVar15[3] = uVar49;
    puVar15[2] = uVar58;
    uVar26 = uVar26 - 8;
    puVar29 = puVar29 + 8;
    puVar15 = puVar15 + 8;
  } while (uVar26 != 0);
  puVar15 = in_stack_00000158 + uVar44;
  puVar55 = puVar18 + uVar44;
  if (uVar37 != uVar44) {
code_r0x000b508c:
    do {
      puVar29 = puVar55 + 1;
      *puVar55 = *puVar15;
      puVar15 = puVar15 + 1;
      puVar55 = puVar29;
    } while (puVar29 < puVar25);
  }
  pcVar50 = (char *)((long)puVar25 + 2);
  *(undefined2 *)puVar25 = uStack0000000000000118;
  if (lVar56 - 4U < 0xf) {
    *in_stack_000000b8 = *in_stack_000000b8 + (char)(lVar56 - 4U);
    in_stack_000000b8 = pcVar50;
  }
  else {
    *in_stack_000000b8 = *in_stack_000000b8 + '\x0f';
    uVar37 = lVar56 - 0x13;
    if (0x1fd < uVar37) {
      lVar57 = ((lVar56 - 0x211U) / 0x1fe) * 2;
      _memset(pcVar50,0xff,lVar57 + 2);
      pcVar50 = (char *)((long)puVar18 +
                        (long)in_stack_00000148 + (lVar57 - (long)in_stack_00000158) + 4);
      uVar37 = (lVar56 - 0x211U) % 0x1fe;
    }
    pcVar51 = pcVar50;
    if (0xfe < uVar37) {
      pcVar51 = pcVar50 + 1;
      *pcVar50 = -1;
      uVar37 = uVar37 - 0xff;
    }
    *pcVar51 = (char)uVar37;
    in_stack_000000b8 = pcVar51 + 1;
  }
  in_stack_00000158 = (ulong *)((long)in_stack_00000148 + lVar56);
LAB_000b14b0:
  pcVar50 = (char *)(in_stack_00000080 - (long)in_stack_00000158);
  lVar57 = 5;
  if (in_stack_00000168._4_4_ != 2) {
    lVar57 = 0;
  }
  if ((in_stack_00000168._4_4_ != 0) &&
     (in_stack_000000a0 = in_stack_000000a0 + lVar57,
     in_stack_000000a0 < in_stack_000000b8 + (long)(pcVar50 + (ulong)(pcVar50 + 0xf0) / 0xff + 1)))
  {
    if (in_stack_00000168._4_4_ == 1) {
LAB_000b4c7c:
      iVar46 = 0;
      goto LAB_000b4c80;
    }
    pcVar50 = in_stack_000000a0 +
              (~(ulong)in_stack_000000b8 -
              ((ulong)(in_stack_000000a0 + ~(ulong)in_stack_000000b8 + 0xf1) >> 8));
  }
  iVar46 = (int)pcVar50;
  pcVar51 = pcVar50 + -0xf;
  if (pcVar50 < "") {
    *in_stack_000000b8 = (char)(iVar46 << 4);
  }
  else {
    pcVar19 = in_stack_000000b8 + 1;
    *in_stack_000000b8 = -0x10;
    if ("" < pcVar51) {
      uVar37 = (ulong)(pcVar50 + -0x10e) / 0xff;
      _memset(pcVar19,0xff,uVar37 + 1);
      pcVar51 = (char *)((ulong)(pcVar50 + -0x10e) % 0xff);
      pcVar19 = in_stack_000000b8 + uVar37 + 2;
    }
    *pcVar19 = (char)pcVar51;
    in_stack_000000b8 = pcVar19;
  }
  _memcpy(in_stack_000000b8 + 1,in_stack_00000158,pcVar50);
  *in_stack_000000f0 = ((int)in_stack_00000158 + iVar46) - in_stack_00000160;
  iVar46 = ((int)(in_stack_000000b8 + 1) + iVar46) - (int)*(undefined8 *)(unaff_x29 + -0x100);
  if (0 < iVar46) {
    return iVar46;
  }
LAB_000b4c80:
  *(undefined1 *)(*(long *)(unaff_x29 + -0xb8) + 0x27) = 1;
  return iVar46;
code_r0x000adb94:
  uVar37 = (ulong)uVar20 | uVar53 << 0x20;
  lVar57 = *(long *)(unaff_x29 + -0x98);
  param_2 = uVar37;
  puVar18 = unaff_x20;
  puStack00000000000000c8 = in_stack_00000158;
code_r0x000adbb8:
  puVar29 = unaff_x20;
  puVar25 = in_stack_00000148;
  uVar44 = uVar26;
code_r0x000adbcc:
  in_stack_00000148 = puVar29;
  uVar45 = uVar37;
  uStack0000000000000118 = (undefined2)uVar45;
  uStack0000000000000050 = (uint)uVar53;
  lVar56 = (long)(int)uStack0000000000000050;
  in_stack_00000158 = (ulong *)((long)in_stack_00000148 + lVar56);
  uVar26 = uVar44;
  if (unaff_x28 < in_stack_00000158) {
    uVar37 = 0;
    uVar53 = 0;
  }
  else {
    puVar31 = (uint *)((long)in_stack_00000158 - 2);
    uVar5 = *puVar31;
    lVar48 = *(long *)(unaff_x29 + -0xb8);
    puVar25 = *(ulong **)(lVar48 + 8);
    uVar23 = *(uint *)(lVar48 + 0x18);
    uVar37 = (ulong)uVar23;
    uVar11 = *(uint *)(lVar48 + 0x1c);
    uVar32 = uVar23 + (int)((long)puVar31 - (long)puVar25);
    *(ulong *)(unaff_x29 + -0xa8) = (ulong)uVar11;
    uVar38 = uVar11;
    if (uVar11 + 0x10000 <= uVar32) {
      uVar38 = uVar32 - 0xffff;
    }
    uVar43 = (ulong)*(uint *)(lVar48 + 0x20);
    uVar20 = uVar5;
    if (*(uint *)(lVar48 + 0x20) < uVar32) {
      do {
        lVar48 = (ulong)((uint)(*(int *)((long)puVar25 + (uVar43 - uVar37)) * -0x61c8864f) >> 0x11)
                 * 4;
        uVar20 = (int)uVar43 - *(int *)(lVar57 + lVar48);
        if (0xfffe < uVar20) {
          uVar20 = 0xffff;
        }
        *(short *)(unaff_x23 + (uVar43 & 0xffff) * 2) = (short)uVar20;
        *(int *)(lVar57 + lVar48) = (int)uVar43;
        uVar43 = uVar43 + 1;
      } while (uVar43 < uVar32);
      uVar20 = *puVar31;
    }
    lVar48 = *(long *)(unaff_x29 + -0xb8);
    *(undefined8 *)(unaff_x29 + -0xf0) = *(undefined8 *)(lVar48 + 0x28);
    puVar29 = *(ulong **)(lVar48 + 0x10);
    *(uint *)(lVar48 + 0x20) = uVar32;
    uVar20 = *(uint *)(lVar57 + (ulong)(uVar20 * -0x61c8864f >> 0x11) * 4);
    uVar43 = (ulong)uVar20;
    bVar9 = true;
    bVar10 = false;
    if (uVar38 <= uVar20) {
      bVar10 = SBORROW4((int)uVar44,1);
      bVar9 = (int)uVar44 + -1 < 0;
    }
    *(uint **)(unaff_x29 + -0xb0) = puVar31;
    *(long *)(unaff_x29 + -0xc0) = (long)puVar31 - (long)in_stack_00000148;
    if (bVar9 == bVar10) {
      iVar12 = 0;
      *(undefined4 *)(unaff_x29 + -0x90) = 0;
      *(undefined4 *)(unaff_x29 + -0xa0) = 0;
      lVar57 = uVar37 - *(long *)(unaff_x29 + -0xa8);
      puVar15 = (ulong *)((long)puVar29 + lVar57);
      *(long *)(unaff_x29 + -200) = (long)in_stack_00000148 + -1;
      *(long *)(unaff_x29 + -0xf8) = (long)in_stack_00000148 - (long)puVar31;
      *(ulong *)(unaff_x29 + -0xe0) = (long)in_stack_00000158 + 2;
      *(uint *)(unaff_x29 + -0xd0) = uVar23 - 4;
      iVar46 = -2 - (uStack0000000000000050 + (int)in_stack_00000148);
      uVar17 = 0;
      *(long *)(unaff_x29 + -0xd8) = -(long)(int)((long)puVar31 - (long)in_stack_00000148);
      uVar47 = CONCAT44(uVar5,uVar5);
code_r0x000ae0f8:
      uVar13 = (uint)uVar43;
      uVar20 = uVar23 - uVar13;
      iVar35 = (int)uVar44;
      uVar21 = (uint)uVar53;
      if (uVar23 < uVar13 || uVar20 == 0) {
        uVar44 = (ulong)(uVar13 - uVar23);
        puVar1 = (uint *)((long)puVar25 + uVar44);
        if ((*(short *)(*(long *)(unaff_x29 + -200) + (long)(int)uVar21) !=
             *(short *)((long)puVar1 + (long)(int)uVar21 + *(long *)(unaff_x29 + -0xd8) + -1)) ||
           (*puVar1 != uVar5)) goto code_r0x000ae4e4;
        if ((int)*(undefined8 *)(unaff_x29 + -0xc0) == 0) {
          iVar22 = 0;
          puVar55 = *(ulong **)(unaff_x29 + -0xe0);
          if (puVar55 < unaff_x28) goto code_r0x000ae6ec;
code_r0x000ae338:
          puVar30 = (ulong *)(puVar1 + 1);
joined_r0x000ae340:
          if (puVar55 < unaff_x28) {
            iVar39 = iVar46 + (int)puVar55;
            do {
              uVar44 = *puVar55 ^ *puVar30;
              if (uVar44 != 0) {
                uVar44 = (uVar44 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar44 & 0x5555555555555555) << 1;
                uVar44 = (uVar44 & 0xcccccccccccccccc) >> 2 | (uVar44 & 0x3333333333333333) << 2;
                uVar44 = (uVar44 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar44 & 0xf0f0f0f0f0f0f0f) << 4;
                uVar44 = (uVar44 & 0xff00ff00ff00ff00) >> 8 | (uVar44 & 0xff00ff00ff00ff) << 8;
                uVar44 = (uVar44 & 0xffff0000ffff0000) >> 0x10 | (uVar44 & 0xffff0000ffff) << 0x10;
                iVar39 = (int)((ulong)LZCOUNT(uVar44 >> 0x20 | uVar44 << 0x20) >> 3) + iVar39;
                goto code_r0x000ae7c0;
              }
              puVar55 = puVar55 + 1;
              puVar30 = puVar30 + 1;
              iVar39 = iVar39 + 8;
            } while (puVar55 < unaff_x28);
          }
          if (puVar55 < in_stack_00000060) {
            if ((uint)*puVar30 == (uint)*puVar55) {
              puVar55 = (ulong *)((long)puVar55 + 4);
              puVar30 = (ulong *)((long)puVar30 + 4);
            }
            if (puVar55 < in_stack_00000058) goto code_r0x000aeacc;
code_r0x000ae77c:
            if (puVar55 < *(ulong **)(unaff_x29 + -0x88)) {
code_r0x000ae788:
              if ((char)*puVar30 == (char)*puVar55) {
                puVar55 = (ulong *)((long)puVar55 + 1);
              }
            }
          }
          else {
            if (in_stack_00000058 <= puVar55) goto code_r0x000ae77c;
code_r0x000aeacc:
            if ((short)*puVar30 == (short)*puVar55) {
              puVar55 = (ulong *)((long)puVar55 + 2);
              puVar30 = (ulong *)((long)puVar30 + 2);
            }
            if (puVar55 < *(ulong **)(unaff_x29 + -0x88)) goto code_r0x000ae788;
          }
          iVar39 = (int)puVar55 - (int)*(undefined8 *)(unaff_x29 + -0xe0);
        }
        else {
          lVar48 = *(long *)(unaff_x29 + -0xf8);
          if (lVar48 <= (long)-uVar44) {
            lVar48 = -uVar44;
          }
          iVar39 = (int)lVar48;
          if (iVar39 < -3) {
            lVar48 = 0;
            do {
              uVar34 = *(uint *)((long)puVar1 + lVar48 + -4) ^
                       *(uint *)((long)in_stack_00000158 + lVar48 + -6);
              if (uVar34 != 0) {
                iVar22 = (int)lVar48 - ((uint)LZCOUNT(uVar34) >> 3);
                uVar26 = *(ulong *)(unaff_x29 + -0x80);
                unaff_x26 = *(char **)(unaff_x29 + -0x78);
                puVar55 = *(ulong **)(unaff_x29 + -0xe0);
                goto joined_r0x000ae8bc;
              }
              lVar48 = lVar48 + -4;
            } while ((long)iVar39 + 3 < lVar48);
            uVar26 = *(ulong *)(unaff_x29 + -0x80);
            unaff_x26 = *(char **)(unaff_x29 + -0x78);
          }
          else {
            lVar48 = 0;
          }
          iVar22 = (int)lVar48;
          lVar48 = (long)iVar22;
          iVar40 = iVar22;
          if (iVar39 <= iVar22) {
            iVar40 = iVar39;
          }
          iVar22 = iVar22 + 1;
          do {
            if (lVar48 <= iVar39) {
              iVar22 = iVar40;
              break;
            }
            lVar16 = lVar48 + lVar56 + -3;
            lVar41 = lVar48 + (uVar44 - 1);
            lVar48 = lVar48 + -1;
            iVar22 = iVar22 + -1;
          } while (*(char *)((long)in_stack_00000148 + lVar16) == *(char *)((long)puVar25 + lVar41))
          ;
          puVar55 = *(ulong **)(unaff_x29 + -0xe0);
joined_r0x000ae8bc:
          if (unaff_x28 <= puVar55) goto code_r0x000ae338;
code_r0x000ae6ec:
          uVar44 = *puVar55 ^ *(ulong *)(puVar1 + 1);
          if (uVar44 == 0) {
            puVar30 = (ulong *)(puVar1 + 3);
            puVar55 = (ulong *)((long)in_stack_00000158 + 10U);
            goto joined_r0x000ae340;
          }
          uVar44 = (uVar44 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar44 & 0x5555555555555555) << 1;
          uVar44 = (uVar44 & 0xcccccccccccccccc) >> 2 | (uVar44 & 0x3333333333333333) << 2;
          uVar44 = (uVar44 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar44 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar44 = (uVar44 & 0xff00ff00ff00ff00) >> 8 | (uVar44 & 0xff00ff00ff00ff) << 8;
          uVar44 = (uVar44 & 0xffff0000ffff0000) >> 0x10 | (uVar44 & 0xffff0000ffff) << 0x10;
          iVar39 = (int)((ulong)LZCOUNT(uVar44 >> 0x20 | uVar44 << 0x20) >> 3);
        }
code_r0x000ae7c0:
        uVar34 = (iVar39 - iVar22) + 4;
        if ((int)uVar34 <= (int)uVar21) {
          iVar22 = *(int *)(unaff_x29 + -0xa0);
        }
        *(int *)(unaff_x29 + -0xa0) = iVar22;
        iVar22 = uVar32 - uVar13;
        if ((int)uVar34 <= (int)uVar21) {
          iVar22 = *(int *)(unaff_x29 + -0x90);
        }
        *(int *)(unaff_x29 + -0x90) = iVar22;
        if ((int)uVar34 <= (int)uVar21) {
          uVar34 = uVar21;
        }
        uVar53 = (ulong)uVar34;
        uVar6 = *(ushort *)(unaff_x23 + (ulong)(uVar13 & 0xffff) * 2);
        iVar22 = (int)uVar26;
joined_r0x000ae7f8:
        uVar21 = (uint)uVar6;
        uVar44 = (ulong)(iVar35 - 1);
        if (0x80 < iVar22) goto code_r0x000ae4f8;
code_r0x000ae7fc:
        uVar43 = (ulong)(uVar13 - uVar21);
      }
      else {
        if (uVar13 <= *(uint *)(unaff_x29 + -0xd0)) {
          uVar44 = (ulong)(uVar13 - (int)*(undefined8 *)(unaff_x29 + -0xa8));
          puVar1 = (uint *)((long)puVar29 + uVar44);
          if (*puVar1 != uVar5) {
            uVar26 = *(ulong *)(unaff_x29 + -0x80);
            uVar6 = *(ushort *)(unaff_x23 + (ulong)(uVar13 & 0xffff) * 2);
            iVar22 = (int)uVar26;
            goto joined_r0x000ae7f8;
          }
          puVar55 = (ulong *)(*(long *)(unaff_x29 + -0xb0) + (ulong)uVar20);
          puVar30 = *(ulong **)(unaff_x29 + -0x88);
          if (puVar55 <= *(ulong **)(unaff_x29 + -0x88)) {
            puVar30 = puVar55;
          }
          puVar52 = (ulong *)(puVar1 + 1);
          puVar36 = (ulong *)((long)puVar30 - 7);
          puVar14 = *(ulong **)(unaff_x29 + -0xe0);
          if (puVar14 < puVar36) {
            uVar26 = *puVar14 ^ *puVar52;
            if (uVar26 == 0) {
              puVar52 = (ulong *)(puVar1 + 3);
              puVar14 = (ulong *)((long)in_stack_00000158 + 10U);
              goto code_r0x000ae22c;
            }
            uVar26 = (uVar26 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar26 & 0x5555555555555555) << 1;
            uVar26 = (uVar26 & 0xcccccccccccccccc) >> 2 | (uVar26 & 0x3333333333333333) << 2;
            uVar26 = (uVar26 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar26 & 0xf0f0f0f0f0f0f0f) << 4;
            uVar26 = (uVar26 & 0xff00ff00ff00ff00) >> 8 | (uVar26 & 0xff00ff00ff00ff) << 8;
            uVar26 = (uVar26 & 0xffff0000ffff0000) >> 0x10 | (uVar26 & 0xffff0000ffff) << 0x10;
            iVar22 = (int)((ulong)LZCOUNT(uVar26 >> 0x20 | uVar26 << 0x20) >> 3);
          }
          else {
code_r0x000ae22c:
            if (puVar14 < puVar36) {
              iVar22 = iVar46 + (int)puVar14;
              do {
                uVar26 = *puVar14 ^ *puVar52;
                if (uVar26 != 0) {
                  uVar26 = (uVar26 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar26 & 0x5555555555555555) << 1;
                  uVar26 = (uVar26 & 0xcccccccccccccccc) >> 2 | (uVar26 & 0x3333333333333333) << 2;
                  uVar26 = (uVar26 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar26 & 0xf0f0f0f0f0f0f0f) << 4;
                  uVar26 = (uVar26 & 0xff00ff00ff00ff00) >> 8 | (uVar26 & 0xff00ff00ff00ff) << 8;
                  uVar26 = (uVar26 & 0xffff0000ffff0000) >> 0x10 | (uVar26 & 0xffff0000ffff) << 0x10
                  ;
                  iVar22 = (int)((ulong)LZCOUNT(uVar26 >> 0x20 | uVar26 << 0x20) >> 3) + iVar22;
                  goto code_r0x000ae2cc;
                }
                puVar14 = puVar14 + 1;
                puVar52 = puVar52 + 1;
                iVar22 = iVar22 + 8;
              } while (puVar14 < puVar36);
            }
            if (puVar14 < (ulong *)((long)puVar30 - 3U)) {
              if ((uint)*puVar52 == (uint)*puVar14) {
                puVar14 = (ulong *)((long)puVar14 + 4);
                puVar52 = (ulong *)((long)puVar52 + 4);
              }
              if (puVar14 < (ulong *)((long)puVar30 - 1U)) goto code_r0x000aea98;
            }
            else if (puVar14 < (ulong *)((long)puVar30 - 1U)) {
code_r0x000aea98:
              if ((short)*puVar52 == (short)*puVar14) {
                puVar14 = (ulong *)((long)puVar14 + 2);
                puVar52 = (ulong *)((long)puVar52 + 2);
              }
            }
            if (puVar14 < puVar30) {
              if ((char)*puVar52 == (char)*puVar14) {
                puVar14 = (ulong *)((long)puVar14 + 1);
              }
            }
            iVar22 = (int)puVar14 - (int)*(undefined8 *)(unaff_x29 + -0xe0);
          }
code_r0x000ae2cc:
          iVar22 = iVar22 + 4;
          if (puVar55 < *(ulong **)(unaff_x29 + -0x88)) {
            unaff_x26 = *(char **)(unaff_x29 + -0x78);
            if ((ulong *)(*(long *)(unaff_x29 + -0xb0) + (long)iVar22) == puVar30) {
              puVar14 = puVar25;
              puVar55 = puVar30;
              if (puVar30 < unaff_x28) {
                uVar26 = *puVar30 ^ *puVar25;
                if (uVar26 == 0) {
                  puVar55 = puVar30 + 1;
                  puVar14 = puVar25 + 1;
                  goto code_r0x000ae350;
                }
                uVar26 = (uVar26 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar26 & 0x5555555555555555) << 1;
                uVar26 = (uVar26 & 0xcccccccccccccccc) >> 2 | (uVar26 & 0x3333333333333333) << 2;
                uVar26 = (uVar26 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar26 & 0xf0f0f0f0f0f0f0f) << 4;
                uVar26 = (uVar26 & 0xff00ff00ff00ff00) >> 8 | (uVar26 & 0xff00ff00ff00ff) << 8;
                uVar26 = (uVar26 & 0xffff0000ffff0000) >> 0x10 | (uVar26 & 0xffff0000ffff) << 0x10;
                iVar39 = (int)((ulong)LZCOUNT(uVar26 >> 0x20 | uVar26 << 0x20) >> 3);
              }
              else {
code_r0x000ae350:
                if (puVar55 < unaff_x28) {
                  uVar26 = (long)in_stack_00000148 + (ulong)uVar20 + lVar56 + -2;
                  if (in_stack_00000150 <= uVar26) {
                    uVar26 = in_stack_00000150;
                  }
                  iVar39 = (int)puVar55 - (int)uVar26;
                  do {
                    uVar26 = *puVar55 ^ *puVar14;
                    if (uVar26 != 0) {
                      uVar26 = (uVar26 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                               (uVar26 & 0x5555555555555555) << 1;
                      uVar26 = (uVar26 & 0xcccccccccccccccc) >> 2 |
                               (uVar26 & 0x3333333333333333) << 2;
                      uVar26 = (uVar26 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                               (uVar26 & 0xf0f0f0f0f0f0f0f) << 4;
                      uVar26 = (uVar26 & 0xff00ff00ff00ff00) >> 8 | (uVar26 & 0xff00ff00ff00ff) << 8
                      ;
                      uVar26 = (uVar26 & 0xffff0000ffff0000) >> 0x10 |
                               (uVar26 & 0xffff0000ffff) << 0x10;
                      iVar39 = (int)((ulong)LZCOUNT(uVar26 >> 0x20 | uVar26 << 0x20) >> 3) + iVar39;
                      goto code_r0x000ae400;
                    }
                    puVar55 = puVar55 + 1;
                    puVar14 = puVar14 + 1;
                    iVar39 = iVar39 + 8;
                  } while (puVar55 < unaff_x28);
                }
                if (puVar55 < in_stack_00000060) {
                  if ((uint)*puVar14 == (uint)*puVar55) {
                    puVar55 = (ulong *)((long)puVar55 + 4);
                    puVar14 = (ulong *)((long)puVar14 + 4);
                  }
                  if (puVar55 < in_stack_00000058) goto code_r0x000aeb04;
code_r0x000ae3c8:
                  if (puVar55 < *(ulong **)(unaff_x29 + -0x88)) {
code_r0x000ae3d4:
                    if ((char)*puVar14 == (char)*puVar55) {
                      puVar55 = (ulong *)((long)puVar55 + 1);
                    }
                  }
                }
                else {
                  if (in_stack_00000058 <= puVar55) goto code_r0x000ae3c8;
code_r0x000aeb04:
                  if ((short)*puVar14 == (short)*puVar55) {
                    puVar55 = (ulong *)((long)puVar55 + 2);
                    puVar14 = (ulong *)((long)puVar14 + 2);
                  }
                  if (puVar55 < *(ulong **)(unaff_x29 + -0x88)) goto code_r0x000ae3d4;
                }
                iVar39 = (int)puVar55 - (int)puVar30;
              }
code_r0x000ae400:
              iVar22 = iVar39 + iVar22;
              goto code_r0x000ae404;
            }
          }
          else {
code_r0x000ae404:
            unaff_x26 = *(char **)(unaff_x29 + -0x78);
          }
          if ((int)*(undefined8 *)(unaff_x29 + -0xc0) == 0) {
            uVar26 = *(ulong *)(unaff_x29 + -0x80);
            iVar39 = 0;
          }
          else {
            lVar48 = *(long *)(unaff_x29 + -0xf8);
            if (lVar48 <= (long)-uVar44) {
              lVar48 = -uVar44;
            }
            iVar40 = (int)lVar48;
            if (iVar40 < -3) {
              lVar48 = 0;
              do {
                uVar34 = *(uint *)((long)puVar1 + lVar48 + -4) ^
                         *(uint *)((long)in_stack_00000158 + lVar48 + -6);
                if (uVar34 != 0) {
                  iVar39 = (int)lVar48 - ((uint)LZCOUNT(uVar34) >> 3);
                  uVar26 = *(ulong *)(unaff_x29 + -0x80);
                  unaff_x26 = *(char **)(unaff_x29 + -0x78);
                  goto code_r0x000ae4bc;
                }
                lVar48 = lVar48 + -4;
              } while ((long)iVar40 + 3 < lVar48);
            }
            else {
              lVar48 = 0;
            }
            iVar39 = (int)lVar48;
            lVar48 = (long)iVar39;
            iVar54 = iVar39;
            if (iVar40 <= iVar39) {
              iVar54 = iVar40;
            }
            iVar39 = iVar39 + 1;
            uVar26 = *(ulong *)(unaff_x29 + -0x80);
            unaff_x26 = *(char **)(unaff_x29 + -0x78);
            do {
              if (lVar48 <= iVar40) {
                iVar39 = iVar54;
                break;
              }
              lVar16 = lVar48 + lVar56 + -3;
              lVar41 = lVar48 + (uVar44 - 1);
              lVar48 = lVar48 + -1;
              iVar39 = iVar39 + -1;
            } while (*(char *)((long)in_stack_00000148 + lVar16) ==
                     *(char *)((long)puVar29 + lVar41));
          }
code_r0x000ae4bc:
          uVar34 = iVar22 - iVar39;
          if ((int)uVar34 <= (int)uVar21) {
            iVar39 = *(int *)(unaff_x29 + -0xa0);
          }
          *(int *)(unaff_x29 + -0xa0) = iVar39;
          iVar22 = uVar32 - uVar13;
          if ((int)uVar34 <= (int)uVar21) {
            iVar22 = *(int *)(unaff_x29 + -0x90);
          }
          *(int *)(unaff_x29 + -0x90) = iVar22;
          if ((int)uVar34 <= (int)uVar21) {
            uVar34 = uVar21;
          }
          uVar53 = (ulong)uVar34;
        }
code_r0x000ae4e4:
        uVar44 = (ulong)(iVar35 - 1);
        uVar21 = (uint)*(ushort *)(unaff_x23 + (ulong)(uVar13 & 0xffff) * 2);
        if ((int)uVar26 < 0x81) goto code_r0x000ae7fc;
code_r0x000ae4f8:
        if (uVar21 != 1) goto code_r0x000ae7fc;
        if (iVar12 == 0) {
          if ((uVar5 & 0xffff) == uVar5 >> 0x10 && (uVar5 & 0xff) == uVar5 >> 0x18) {
            puVar14 = *(ulong **)(unaff_x29 + -0xe0);
            puVar30 = puVar14;
            puVar55 = (ulong *)((long)in_stack_00000148 + lVar56 + 2);
            if (puVar14 < unaff_x28) {
              do {
                uVar43 = *puVar30 ^ uVar47;
                if (uVar43 != 0) {
                  uVar43 = (uVar43 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar43 & 0x5555555555555555) << 1;
                  uVar43 = (uVar43 & 0xcccccccccccccccc) >> 2 | (uVar43 & 0x3333333333333333) << 2;
                  uVar43 = (uVar43 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar43 & 0xf0f0f0f0f0f0f0f) << 4;
                  uVar43 = (uVar43 & 0xff00ff00ff00ff00) >> 8 | (uVar43 & 0xff00ff00ff00ff) << 8;
                  uVar43 = (uVar43 & 0xffff0000ffff0000) >> 0x10 | (uVar43 & 0xffff0000ffff) << 0x10
                  ;
                  puVar55 = (ulong *)((long)puVar55 +
                                     ((ulong)LZCOUNT(uVar43 >> 0x20 | uVar43 << 0x20) >> 3));
                  goto code_r0x000ae658;
                }
                puVar30 = puVar30 + 1;
                puVar55 = puVar55 + 1;
              } while (puVar30 < unaff_x28);
              puVar52 = *(ulong **)(unaff_x29 + -0x88);
              if (puVar30 < puVar52) goto code_r0x000ae604;
            }
            else {
              puVar52 = *(ulong **)(unaff_x29 + -0x88);
              puVar55 = puVar14;
              if (puVar14 < puVar52) {
code_r0x000ae604:
                lVar48 = (long)puVar52 - (long)puVar55;
                puVar55 = (ulong *)((long)puVar30 + lVar48);
                uVar43 = uVar47;
                do {
                  if ((uint)(byte)*puVar30 != ((uint)uVar43 & 0xff)) goto code_r0x000ae630;
                  puVar30 = (ulong *)((long)puVar30 + 1);
                  uVar43 = uVar43 >> 8;
                  lVar48 = lVar48 + -1;
                } while (lVar48 != 0);
                puVar30 = puVar55;
code_r0x000ae630:
                puVar14 = *(ulong **)(unaff_x29 + -0xe0);
                puVar55 = puVar30;
              }
            }
code_r0x000ae658:
            uVar17 = (ulong)(uint)((int)puVar55 - (int)puVar14) + 4;
            iVar12 = 2;
            goto code_r0x000ae50c;
          }
          iVar12 = 1;
          goto code_r0x000ae7fc;
        }
        if (iVar12 != 2) goto code_r0x000ae7fc;
code_r0x000ae50c:
        uVar34 = uVar13 - 1;
        if (uVar34 < uVar38) goto code_r0x000ae7fc;
        if (uVar20 < 3) {
code_r0x000ae63c:
          iVar12 = 2;
          goto code_r0x000ae7fc;
        }
        puVar55 = (ulong *)((long)puVar29 +
                           (ulong)(uVar34 - (int)*(undefined8 *)(unaff_x29 + -0xa8)));
        puVar30 = (ulong *)((long)puVar25 + (ulong)(uVar34 - uVar23));
        if (uVar34 < uVar23) {
          puVar30 = puVar55;
        }
        if ((uint)*puVar30 != uVar5) goto code_r0x000ae63c;
        puVar14 = *(ulong **)(unaff_x29 + -0x88);
        if (uVar34 < uVar23) {
          puVar14 = puVar15;
        }
        puVar52 = (ulong *)((long)puVar30 + 4);
        puVar36 = puVar52;
        if (puVar52 < (ulong *)((long)puVar14 - 7U)) {
          puVar24 = puVar52;
          do {
            uVar43 = *puVar36 ^ uVar47;
            if (uVar43 != 0) {
              uVar43 = (uVar43 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar43 & 0x5555555555555555) << 1;
              uVar43 = (uVar43 & 0xcccccccccccccccc) >> 2 | (uVar43 & 0x3333333333333333) << 2;
              uVar43 = (uVar43 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar43 & 0xf0f0f0f0f0f0f0f) << 4;
              uVar43 = (uVar43 & 0xff00ff00ff00ff00) >> 8 | (uVar43 & 0xff00ff00ff00ff) << 8;
              uVar43 = (uVar43 & 0xffff0000ffff0000) >> 0x10 | (uVar43 & 0xffff0000ffff) << 0x10;
              puVar36 = (ulong *)((long)puVar24 +
                                 ((ulong)LZCOUNT(uVar43 >> 0x20 | uVar43 << 0x20) >> 3));
              goto code_r0x000ae67c;
            }
            puVar36 = puVar36 + 1;
            puVar24 = puVar24 + 1;
          } while (puVar36 < (ulong *)((long)puVar14 - 7U));
        }
        if (puVar36 < puVar14) {
          lVar48 = (long)puVar14 - (long)puVar36;
          uVar43 = uVar47;
          do {
            if ((uint)(byte)*puVar36 != ((uint)uVar43 & 0xff)) goto code_r0x000ae67c;
            puVar36 = (ulong *)((long)puVar36 + 1);
            uVar43 = uVar43 >> 8;
            lVar48 = lVar48 + -1;
          } while (lVar48 != 0);
          puVar36 = puVar14;
        }
code_r0x000ae67c:
        uVar43 = (long)puVar36 - (long)puVar52;
        uVar58 = (uVar43 & 0xffffffff) + 4;
        if (uVar34 < uVar23) {
          puVar14 = puVar29;
          if ((ulong *)((long)puVar55 + uVar58) == puVar15) {
            puVar55 = puVar25;
            puVar52 = puVar25;
            uVar49 = uVar47;
            if ((uVar43 & 3) != 0) {
              uVar20 = (int)uVar43 * -8 & 0x1f;
              uVar20 = uVar5 >> uVar20 | uVar5 << 0x20 - uVar20;
              uVar49 = CONCAT44(uVar20,uVar20);
            }
            for (; puVar55 < unaff_x28; puVar55 = puVar55 + 1) {
              uVar43 = *puVar55 ^ uVar49;
              if (uVar43 != 0) {
                uVar43 = (uVar43 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar43 & 0x5555555555555555) << 1;
                uVar43 = (uVar43 & 0xcccccccccccccccc) >> 2 | (uVar43 & 0x3333333333333333) << 2;
                uVar43 = (uVar43 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar43 & 0xf0f0f0f0f0f0f0f) << 4;
                uVar43 = (uVar43 & 0xff00ff00ff00ff00) >> 8 | (uVar43 & 0xff00ff00ff00ff) << 8;
                uVar43 = (uVar43 & 0xffff0000ffff0000) >> 0x10 | (uVar43 & 0xffff0000ffff) << 0x10;
                puVar52 = (ulong *)((long)puVar52 +
                                   ((ulong)LZCOUNT(uVar43 >> 0x20 | uVar43 << 0x20) >> 3));
                goto code_r0x000ae8d0;
              }
              puVar52 = puVar52 + 1;
            }
            if (puVar55 < *(ulong **)(unaff_x29 + -0x88)) {
              lVar48 = (long)*(ulong **)(unaff_x29 + -0x88) - (long)puVar52;
              puVar36 = (ulong *)((long)puVar55 + lVar48);
              do {
                puVar52 = puVar55;
                if ((uint)(byte)*puVar55 != ((uint)uVar49 & 0xff)) goto code_r0x000ae8d0;
                puVar55 = (ulong *)((long)puVar55 + 1);
                uVar49 = uVar49 >> 8;
                lVar48 = lVar48 + -1;
              } while (lVar48 != 0);
              puVar52 = puVar36;
            }
code_r0x000ae8d0:
            uVar58 = (uint)((int)puVar52 - (int)puVar25) + uVar58;
          }
        }
        else {
          puVar14 = puVar25;
        }
        *(uint *)(unaff_x29 + -0x6c) = uVar5;
        puVar55 = puVar30;
        do {
          puVar52 = puVar55;
          if (puVar52 < (ulong *)((long)puVar14 + 4U)) break;
          puVar55 = (ulong *)((long)puVar52 + -4);
        } while (*(uint *)((long)puVar52 + -4) == uVar5);
        puVar55 = puVar52;
        if (puVar14 < puVar52) {
          lVar48 = 0;
          do {
            puVar55 = (ulong *)((long)puVar52 + lVar48);
            if (*(char *)((long)puVar55 + -1) != unaff_x26[lVar48]) goto code_r0x000ae940;
            lVar48 = lVar48 + -1;
          } while (puVar14 < (ulong *)((long)puVar52 + lVar48));
          puVar55 = puVar14;
        }
code_r0x000ae940:
        iVar12 = (int)((long)puVar30 - (long)puVar55);
        if (((uVar23 <= uVar34) &&
            ((ulong *)((long)puVar30 - ((long)puVar30 - (long)puVar55 & 0xffffffffU)) == puVar25))
           && ((uint)*(undefined8 *)(unaff_x29 + -0xa8) < uVar23)) {
          uVar21 = iVar12 * 8 & 0x1f;
          uVar20 = uVar5;
          if ((-iVar12 & 3U) != 0) {
            uVar20 = uVar5 >> uVar21 | uVar5 << 0x20 - uVar21;
          }
          *(uint *)(unaff_x29 + -0x6c) = uVar20;
          lVar48 = lVar57;
          do {
            lVar16 = lVar48;
            if (lVar16 < 4) {
              puVar55 = (ulong *)((long)puVar29 + lVar16);
              if (lVar16 < 1) goto code_r0x000ae9d4;
              break;
            }
            lVar48 = lVar16 + -4;
          } while (*(uint *)((long)puVar29 + lVar16 + -4) == uVar20);
          pcVar50 = unaff_x26;
          puVar55 = (ulong *)((long)puVar29 + lVar16);
          do {
            puVar30 = (ulong *)((long)puVar55 + -1);
            if (*(char *)puVar30 != *pcVar50) goto code_r0x000ae9d4;
            pcVar50 = pcVar50 + -1;
            puVar55 = puVar30;
          } while (puVar29 < puVar30);
          puVar55 = puVar29;
code_r0x000ae9d4:
          iVar12 = ((int)puVar15 - (int)puVar55) + iVar12;
        }
        uVar20 = uVar34 - iVar12;
        if (uVar34 - iVar12 <= uVar38) {
          uVar20 = uVar38;
        }
        uVar43 = (ulong)uVar20;
        uVar49 = uVar58 + (uVar34 - uVar20);
        if ((uVar17 < uVar58) || (uVar49 < uVar17)) {
          if (uVar23 + ~uVar20 < 3) {
            iVar12 = 2;
            uVar43 = uVar37;
            goto code_r0x000ae800;
          }
          if ((int)*(undefined8 *)(unaff_x29 + -0xc0) != 0) goto code_r0x000aea84;
          if (uVar17 <= uVar49) {
            uVar49 = uVar17;
          }
          if ((ulong)(long)(int)uVar53 < uVar49) {
            if ((((long)puVar31 - (long)puVar25) + uVar37) - uVar43 >> 0x10 != 0)
            goto code_r0x000adccc;
            *(uint *)(unaff_x29 + -0x90) = uVar32 - uVar20;
            uVar53 = uVar49;
          }
          uVar21 = (uint)*(ushort *)(unaff_x23 + (ulong)(uVar20 & 0xffff) * 2);
          uVar43 = (ulong)(uVar20 - uVar21);
          if (uVar20 < uVar21) goto code_r0x000adccc;
        }
        else {
          uVar20 = (uVar34 - (int)uVar17) + (int)uVar58;
          uVar21 = uVar23;
          if (2 < uVar23 + ~uVar20) {
            uVar21 = uVar20;
          }
          uVar43 = (ulong)uVar21;
        }
code_r0x000aea84:
        iVar12 = 2;
      }
code_r0x000ae800:
      if ((uint)uVar43 < uVar38 || iVar35 < 2) goto code_r0x000adccc;
      goto code_r0x000ae0f8;
    }
    *(undefined4 *)(unaff_x29 + -0xa0) = 0;
    *(undefined4 *)(unaff_x29 + -0x90) = 0;
code_r0x000adccc:
    if (((uVar32 < uVar11 + 0x10000) &&
        (puVar25 = *(ulong **)(unaff_x29 + -0x88), *(int *)(unaff_x29 + -0xe4) == 1)) &&
       (0 < (int)uVar44)) {
      lVar16 = *(long *)(unaff_x29 + -0xf0);
      lVar48 = *(long *)(&UNK_00040008 + lVar16);
      uVar23 = *(uint *)(&UNK_00040018 + lVar16);
      lVar57 = (*(long *)(lVar16 + 0x40000) - lVar48) + (ulong)uVar23;
      uVar11 = *(uint *)(lVar16 + (ulong)((uint)(**(int **)(unaff_x29 + -0xb0) * -0x61c8864f) >>
                                         0x11) * 4);
      iVar46 = (uVar11 + uVar38) - (int)lVar57;
      uVar38 = uVar32 - iVar46;
      if (uVar38 >> 0x10 == 0) {
        puVar29 = (ulong *)((long)in_stack_00000158 + 2);
        lVar16 = (long)in_stack_00000148 - (long)*(int **)(unaff_x29 + -0xb0);
        do {
          if ((int)uVar44 == 0) break;
          puVar31 = (uint *)((lVar48 - (ulong)uVar23) + (ulong)uVar11);
          if (*puVar31 == uVar5) {
            puVar15 = (ulong *)(*(long *)(unaff_x29 + -0xb0) + (lVar57 - (ulong)uVar11));
            puVar55 = puVar25;
            if (puVar15 <= puVar25) {
              puVar55 = puVar15;
            }
            puVar30 = (ulong *)(puVar31 + 1);
            puVar14 = (ulong *)((long)puVar55 - 7);
            puVar15 = puVar29;
            if (puVar29 < puVar14) {
              uVar37 = *puVar29 ^ *puVar30;
              iVar12 = (int)*(undefined8 *)(unaff_x29 + -0xc0);
              if (uVar37 == 0) {
                puVar30 = (ulong *)(puVar31 + 3);
                puVar15 = (ulong *)((long)in_stack_00000158 + 10);
                goto joined_r0x000adfbc;
              }
              uVar37 = (uVar37 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar37 & 0x5555555555555555) << 1;
              uVar37 = (uVar37 & 0xcccccccccccccccc) >> 2 | (uVar37 & 0x3333333333333333) << 2;
              uVar37 = (uVar37 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar37 & 0xf0f0f0f0f0f0f0f) << 4;
              uVar37 = (uVar37 & 0xff00ff00ff00ff00) >> 8 | (uVar37 & 0xff00ff00ff00ff) << 8;
              uVar37 = (uVar37 & 0xffff0000ffff0000) >> 0x10 | (uVar37 & 0xffff0000ffff) << 0x10;
              iVar35 = (int)((ulong)LZCOUNT(uVar37 >> 0x20 | uVar37 << 0x20) >> 3);
            }
            else {
joined_r0x000adfbc:
              if (puVar15 < puVar14) {
                iVar35 = (-2 - (uStack0000000000000050 + (int)in_stack_00000148)) + (int)puVar15;
                do {
                  uVar37 = *puVar15 ^ *puVar30;
                  if (uVar37 != 0) {
                    uVar37 = (uVar37 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar37 & 0x5555555555555555) << 1
                    ;
                    uVar37 = (uVar37 & 0xcccccccccccccccc) >> 2 | (uVar37 & 0x3333333333333333) << 2
                    ;
                    uVar37 = (uVar37 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar37 & 0xf0f0f0f0f0f0f0f) << 4;
                    uVar37 = (uVar37 & 0xff00ff00ff00ff00) >> 8 | (uVar37 & 0xff00ff00ff00ff) << 8;
                    uVar37 = (uVar37 & 0xffff0000ffff0000) >> 0x10 |
                             (uVar37 & 0xffff0000ffff) << 0x10;
                    iVar35 = (int)((ulong)LZCOUNT(uVar37 >> 0x20 | uVar37 << 0x20) >> 3) + iVar35;
                    iVar12 = (int)*(undefined8 *)(unaff_x29 + -0xc0);
                    goto code_r0x000aded4;
                  }
                  puVar15 = puVar15 + 1;
                  puVar30 = puVar30 + 1;
                  iVar35 = iVar35 + 8;
                } while (puVar15 < puVar14);
              }
              if (puVar15 < (ulong *)((long)puVar55 - 3U)) {
                if ((uint)*puVar30 == (uint)*puVar15) {
                  puVar15 = (ulong *)((long)puVar15 + 4);
                  puVar30 = (ulong *)((long)puVar30 + 4);
                }
                iVar12 = (int)*(undefined8 *)(unaff_x29 + -0xc0);
                if (puVar15 < (ulong *)((long)puVar55 - 1U)) goto code_r0x000adf8c;
              }
              else {
                iVar12 = (int)*(undefined8 *)(unaff_x29 + -0xc0);
                if (puVar15 < (ulong *)((long)puVar55 - 1U)) {
code_r0x000adf8c:
                  if ((short)*puVar30 == (short)*puVar15) {
                    puVar15 = (ulong *)((long)puVar15 + 2);
                    puVar30 = (ulong *)((long)puVar30 + 2);
                  }
                }
              }
              if (puVar15 < puVar55) {
                if ((char)*puVar30 == (char)*puVar15) {
                  puVar15 = (ulong *)((long)puVar15 + 1);
                }
              }
              iVar35 = (int)puVar15 - (int)puVar29;
            }
code_r0x000aded4:
            if (iVar12 == 0) {
              iVar12 = 0;
            }
            else {
              lVar41 = lVar16;
              if (lVar16 <= lVar48 - (long)puVar31) {
                lVar41 = lVar48 - (long)puVar31;
              }
              iVar22 = (int)lVar41;
              if (iVar22 < -3) {
                lVar41 = 0;
                do {
                  uVar20 = *(uint *)((long)puVar31 + lVar41 + -4) ^
                           *(uint *)((long)in_stack_00000158 + lVar41 + -6);
                  if (uVar20 != 0) {
                    iVar12 = (int)lVar41 - ((uint)LZCOUNT(uVar20) >> 3);
                    puVar25 = *(ulong **)(unaff_x29 + -0x88);
                    uVar26 = *(ulong *)(unaff_x29 + -0x80);
                    goto code_r0x000add74;
                  }
                  lVar41 = lVar41 + -4;
                } while ((long)iVar22 + 3 < lVar41);
                puVar25 = *(ulong **)(unaff_x29 + -0x88);
              }
              else {
                lVar41 = 0;
              }
              iVar40 = (int)lVar41;
              iVar39 = iVar40;
              if (iVar22 <= iVar40) {
                iVar39 = iVar22;
              }
              iVar12 = iVar40 + 1;
              uVar26 = *(ulong *)(unaff_x29 + -0x80);
              lVar41 = (long)iVar40;
              do {
                if (lVar41 <= iVar22) {
                  iVar12 = iVar39;
                  break;
                }
                lVar7 = lVar41 + lVar56 + -3;
                lVar8 = lVar41 + -1;
                iVar12 = iVar12 + -1;
                lVar41 = lVar41 + -1;
              } while (*(char *)((long)in_stack_00000148 + lVar7) ==
                       *(char *)((long)puVar31 + lVar8));
            }
code_r0x000add74:
            uVar20 = (iVar35 + 4) - iVar12;
            uVar21 = (uint)uVar53;
            if ((int)uVar20 <= (int)uVar21) {
              iVar12 = *(int *)(unaff_x29 + -0xa0);
            }
            *(int *)(unaff_x29 + -0xa0) = iVar12;
            if ((int)uVar20 <= (int)uVar21) {
              uVar38 = *(uint *)(unaff_x29 + -0x90);
            }
            *(uint *)(unaff_x29 + -0x90) = uVar38;
            if ((int)uVar20 <= (int)uVar21) {
              uVar20 = uVar21;
            }
            uVar53 = (ulong)uVar20;
            unaff_x26 = *(char **)(unaff_x29 + -0x78);
          }
          uVar44 = (ulong)((int)uVar44 - 1);
          uVar38 = (uint)*(ushort *)
                          (*(long *)(unaff_x29 + -0xf0) + (ulong)(uVar11 & 0xffff) * 2 + 0x20000);
          uVar11 = uVar11 - uVar38;
          iVar46 = iVar46 - uVar38;
          uVar38 = uVar32 - iVar46;
        } while (uVar38 < 0x10000);
      }
    }
    puVar25 = (ulong *)(*(long *)(unaff_x29 + -0xb0) + (long)*(int *)(unaff_x29 + -0xa0));
    lVar57 = *(long *)(unaff_x29 + -0x98);
    uVar37 = (ulong)*(uint *)(unaff_x29 + -0x90);
  }
  if ((int)uStack0000000000000050 < (int)uVar53) goto code_r0x000adffc;
  puVar18 = (ulong *)(in_stack_000000b8 + 1);
  uVar37 = (long)in_stack_00000148 - (long)puStack00000000000000c8;
  if ((in_stack_00000168._4_4_ != 0) &&
     (in_stack_000000a0 < (char *)((long)puVar18 + uVar37 + uVar37 / 0xff + 8))) {
    in_stack_00000158 = puStack00000000000000c8;
    goto code_r0x000b4f20;
  }
  uVar44 = uVar37 - 0xf;
  if (uVar37 < 0xf) {
    *in_stack_000000b8 = (char)((int)uVar37 << 4);
  }
  else {
    *in_stack_000000b8 = -0x10;
    puVar29 = puVar18;
    if (0xfe < uVar44) {
      uVar44 = (uVar37 - 0x10e) / 0xff;
      _memset(puVar18,0xff,uVar44 + 1);
      puVar29 = (ulong *)(in_stack_000000b8 + uVar44 + 2);
      uVar44 = (uVar37 - 0x10e) % 0xff;
    }
    puVar18 = (ulong *)((long)puVar29 + 1);
    *(char *)puVar29 = (char)uVar44;
  }
  puVar29 = (ulong *)((long)puVar18 + uVar37);
  uVar37 = (long)puVar18 - (long)puStack00000000000000c8;
  puVar15 = (ulong *)(uVar37 + (long)in_stack_00000148);
  if ((ulong *)(uVar37 + (long)in_stack_00000148) <= puVar18 + 1) {
    puVar15 = puVar18 + 1;
  }
  if (((char *)((long)puVar15 + ~(ulong)puVar18) < &segment_command_00000020.vmaddr) ||
     (uVar37 < 0x40)) {
    puVar15 = puStack00000000000000c8;
    goto code_r0x000b02f8;
  }
  uVar44 = ((long)puVar15 + ~(ulong)puVar18 >> 3) + 1;
  uVar53 = uVar44 & 0x3ffffffffffffff8;
  puVar15 = puStack00000000000000c8 + 4;
  puVar55 = puVar18 + 4;
  uVar45 = uVar53;
  do {
    uVar43 = puVar15[-4];
    uVar47 = puVar15[-1];
    uVar17 = puVar15[-2];
    uVar49 = puVar15[1];
    uVar58 = *puVar15;
    uVar60 = puVar15[3];
    uVar59 = puVar15[2];
    puVar55[-3] = puVar15[-3];
    puVar55[-4] = uVar43;
    puVar55[-1] = uVar47;
    puVar55[-2] = uVar17;
    puVar55[1] = uVar49;
    *puVar55 = uVar58;
    puVar55[3] = uVar60;
    puVar55[2] = uVar59;
    uVar45 = uVar45 - 8;
    puVar15 = puVar15 + 8;
    puVar55 = puVar55 + 8;
  } while (uVar45 != 0);
  puVar15 = puStack00000000000000c8 + uVar53;
  puVar18 = puVar18 + uVar53;
  if (uVar44 != uVar53) {
code_r0x000b02f8:
    do {
      puVar55 = puVar18 + 1;
      *puVar18 = *puVar15;
      puVar15 = puVar15 + 1;
      puVar18 = puVar55;
    } while (puVar55 < puVar29);
  }
  pcVar50 = (char *)((long)puVar29 + 2);
  *(undefined2 *)puVar29 = uStack0000000000000118;
  uVar44 = lVar56 - 4;
  if ((in_stack_00000168._4_4_ != 0) && (in_stack_000000a0 < pcVar50 + uVar44 / 0xff + 6)) {
    in_stack_00000158 = puStack00000000000000c8;
    goto code_r0x000b4f20;
  }
  if (uVar44 < 0xf) {
    *in_stack_000000b8 = *in_stack_000000b8 + (char)uVar44;
    in_stack_000000b8 = pcVar50;
    in_stack_00000148 = puVar25;
  }
  else {
    *in_stack_000000b8 = *in_stack_000000b8 + '\x0f';
    uVar44 = lVar56 - 0x13;
    if (0x1fd < uVar44) {
      lVar57 = ((lVar56 - 0x211U) / 0x1fe) * 2;
      _memset(pcVar50,0xff,lVar57 + 2);
      unaff_x26 = *(char **)(unaff_x29 + -0x78);
      pcVar50 = (char *)((long)in_stack_00000148 + lVar57 + uVar37 + 4);
      uVar44 = (lVar56 - 0x211U) % 0x1fe;
    }
    pcVar51 = pcVar50;
    if (0xfe < uVar44) {
      pcVar51 = pcVar50 + 1;
      *pcVar50 = -1;
      uVar44 = uVar44 - 0xff;
    }
    *pcVar51 = (char)uVar44;
    in_stack_000000b8 = pcVar51 + 1;
    in_stack_00000148 = puVar25;
  }
joined_r0x000b07b4:
  if (unaff_x28 < in_stack_00000158) goto LAB_000b14b0;
  goto LAB_000acf98;
code_r0x000adffc:
  bVar9 = in_stack_00000148 <= puVar18;
  bVar10 = (ulong *)((long)in_stack_00000148 + ((long)param_2 >> 0x20)) <= puVar25;
  in_stack_000000e0 = puVar18;
  if (bVar9 || bVar10) {
    in_stack_000000e0 = in_stack_00000148;
  }
  puVar29 = puVar25;
  uVar44 = uVar26;
  if (2 < (long)puVar25 - (long)in_stack_000000e0) goto code_r0x000aeb68;
  goto code_r0x000adbcc;
code_r0x000aeb68:
  uVar32 = (uint)param_2;
  if (bVar9 || bVar10) {
    uVar32 = (uint)uVar45;
  }
  uVar38 = (uint)(param_2 >> 0x20);
  if (bVar9 || bVar10) {
    uVar38 = uStack0000000000000050;
  }
  in_stack_00000078 = puStack00000000000000c8;
  _uStack0000000000000118 = (ulong)uVar32;
  _uStack0000000000000050 = (ulong)uVar38;
code_r0x000aeb94:
  uVar38 = (uint)_uStack0000000000000050;
  uVar32 = uVar38;
  if (0x11 < (int)uVar38) {
    uVar32 = 0x12;
  }
  lVar57 = (long)(int)uVar38;
  puStack00000000000000c8 = (ulong *)((long)in_stack_000000e0 + lVar57);
  unaff_x20 = puStack00000000000000a8;
  uVar44 = uVar26;
  do {
    param_1 = uVar53;
    param_2 = uVar37;
    iVar46 = (int)in_stack_000000e0;
    if ((long)puVar25 - (long)in_stack_000000e0 < 0x12) {
      iVar12 = (int)param_1;
      uVar23 = (iVar12 + (int)((long)puVar25 - (long)in_stack_000000e0)) - 4;
      if ((uint *)((long)in_stack_000000e0 + (long)(int)uVar32) <=
          (uint *)((long)puVar25 + (long)iVar12 + -4)) {
        uVar23 = uVar32;
      }
      uVar23 = uVar23 + (iVar46 - (int)puVar25);
      uVar23 = uVar23 & ((int)uVar23 >> 0x1f ^ 0xffffffffU);
      param_1 = (ulong)(iVar12 - uVar23);
      in_stack_00000148 = (ulong *)((long)puVar25 + (ulong)uVar23);
    }
    else {
      in_stack_00000148 = puVar25;
    }
    iVar12 = (int)param_1;
    in_stack_00000120 = (long)iVar12;
    in_stack_00000158 = (ulong *)((long)in_stack_00000148 + in_stack_00000120);
    iVar35 = (int)in_stack_00000148;
    uVar26 = uVar44;
    if (unaff_x28 < in_stack_00000158) {
      uVar37 = 0;
      uVar53 = 0;
    }
    else {
      puVar31 = (uint *)((long)in_stack_00000158 - 3);
      uVar21 = *puVar31;
      lVar56 = *(long *)(unaff_x29 + -0xb8);
      puVar18 = *(ulong **)(lVar56 + 8);
      uVar5 = *(uint *)(lVar56 + 0x18);
      uVar45 = (ulong)uVar5;
      uVar20 = *(uint *)(lVar56 + 0x1c);
      uVar23 = uVar5 + (int)((long)puVar31 - (long)puVar18);
      *(ulong *)(unaff_x29 + -0xa0) = (ulong)uVar20;
      uVar11 = uVar20;
      if (uVar20 + 0x10000 <= uVar23) {
        uVar11 = uVar23 - 0xffff;
      }
      uVar37 = (ulong)*(uint *)(lVar56 + 0x20);
      lVar48 = *(long *)(unaff_x29 + -0x98);
      uVar13 = uVar21;
      if (*(uint *)(lVar56 + 0x20) < uVar23) {
        do {
          lVar56 = (ulong)((uint)(*(int *)((long)puVar18 + (uVar37 - uVar45)) * -0x61c8864f) >> 0x11
                          ) * 4;
          uVar13 = (int)uVar37 - *(int *)(lVar48 + lVar56);
          if (0xfffe < uVar13) {
            uVar13 = 0xffff;
          }
          *(short *)(unaff_x23 + (uVar37 & 0xffff) * 2) = (short)uVar13;
          *(int *)(lVar48 + lVar56) = (int)uVar37;
          uVar37 = uVar37 + 1;
        } while (uVar37 < uVar23);
        uVar13 = *puVar31;
      }
      lVar56 = *(long *)(unaff_x29 + -0xb8);
      *(undefined8 *)(unaff_x29 + -0xd8) = *(undefined8 *)(lVar56 + 0x28);
      puVar25 = *(ulong **)(lVar56 + 0x10);
      *(uint *)(lVar56 + 0x20) = uVar23;
      uVar13 = *(uint *)(lVar48 + (ulong)(uVar13 * -0x61c8864f >> 0x11) * 4);
      uVar43 = (ulong)uVar13;
      bVar9 = true;
      bVar10 = false;
      if (uVar11 <= uVar13) {
        bVar10 = SBORROW4((int)uVar44,1);
        bVar9 = (int)uVar44 + -1 < 0;
      }
      *(long *)(unaff_x29 + -0xb0) = (long)puVar31 - (long)in_stack_00000148;
      *(uint **)(unaff_x29 + -0xa8) = puVar31;
      uVar53 = param_1;
      if (bVar9 == bVar10) {
        iVar22 = 0;
        uVar37 = 0;
        *(undefined4 *)(unaff_x29 + -0x90) = 0;
        lVar56 = uVar45 - *(long *)(unaff_x29 + -0xa0);
        puVar15 = (ulong *)((long)puVar25 + lVar56);
        *(long *)(unaff_x29 + -0xc0) = (long)in_stack_00000148 + -1;
        *(long *)(unaff_x29 + -0xe0) = (long)in_stack_00000148 - (long)puVar31;
        puVar29 = (ulong *)((long)in_stack_00000158 + 1);
        *(uint *)(unaff_x29 + -200) = uVar5 - 4;
        *(uint *)(unaff_x29 + -0xf0) =
             (uint)((uVar21 & 0xffff) == uVar21 >> 0x10 && (uVar21 & 0xff) == uVar21 >> 0x18);
        *(int *)(unaff_x29 + -0xf8) = ~(iVar12 + iVar35);
        uStack0000000000000138 = 0;
        *(long *)(unaff_x29 + -0xd0) = -(long)(int)((long)puVar31 - (long)in_stack_00000148);
        uVar17 = CONCAT44(uVar21,uVar21);
code_r0x000af134:
        uVar34 = (uint)uVar43;
        uVar13 = uVar5 - uVar34;
        iVar40 = (int)uVar44;
        iVar39 = (int)puVar29;
        uVar27 = (uint)uVar53;
        if (uVar5 < uVar34 || uVar13 == 0) {
          uVar44 = (ulong)(uVar34 - uVar5);
          puVar1 = (uint *)((long)puVar18 + uVar44);
          if ((*(short *)(*(long *)(unaff_x29 + -0xc0) + (long)(int)uVar27) !=
               *(short *)((long)puVar1 + *(long *)(unaff_x29 + -0xd0) + (long)(int)uVar27 + -1)) ||
             (*puVar1 != uVar21)) goto code_r0x000af500;
          if ((int)*(undefined8 *)(unaff_x29 + -0xb0) == 0) {
            iVar54 = 0;
            if (puVar29 < unaff_x28) goto code_r0x000af70c;
code_r0x000af360:
            puVar30 = (ulong *)(puVar1 + 1);
            puVar55 = puVar29;
joined_r0x000af368:
            if (puVar55 < unaff_x28) {
              iVar33 = *(int *)(unaff_x29 + -0xf8) + (int)puVar55;
              do {
                uVar44 = *puVar55 ^ *puVar30;
                if (uVar44 != 0) {
                  uVar44 = (uVar44 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar44 & 0x5555555555555555) << 1;
                  uVar44 = (uVar44 & 0xcccccccccccccccc) >> 2 | (uVar44 & 0x3333333333333333) << 2;
                  uVar44 = (uVar44 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar44 & 0xf0f0f0f0f0f0f0f) << 4;
                  uVar44 = (uVar44 & 0xff00ff00ff00ff00) >> 8 | (uVar44 & 0xff00ff00ff00ff) << 8;
                  uVar44 = (uVar44 & 0xffff0000ffff0000) >> 0x10 | (uVar44 & 0xffff0000ffff) << 0x10
                  ;
                  iVar33 = (int)((ulong)LZCOUNT(uVar44 >> 0x20 | uVar44 << 0x20) >> 3) + iVar33;
                  goto code_r0x000af7d4;
                }
                puVar55 = puVar55 + 1;
                puVar30 = puVar30 + 1;
                iVar33 = iVar33 + 8;
              } while (puVar55 < unaff_x28);
            }
            if (puVar55 < in_stack_00000060) {
              if ((uint)*puVar30 == (uint)*puVar55) {
                puVar55 = (ulong *)((long)puVar55 + 4);
                puVar30 = (ulong *)((long)puVar30 + 4);
              }
              if (puVar55 < in_stack_00000058) goto code_r0x000afb00;
code_r0x000af79c:
              if (puVar55 < *(ulong **)(unaff_x29 + -0x88)) {
code_r0x000af7a8:
                if ((char)*puVar30 == (char)*puVar55) {
                  puVar55 = (ulong *)((long)puVar55 + 1);
                }
              }
            }
            else {
              if (in_stack_00000058 <= puVar55) goto code_r0x000af79c;
code_r0x000afb00:
              if ((short)*puVar30 == (short)*puVar55) {
                puVar55 = (ulong *)((long)puVar55 + 2);
                puVar30 = (ulong *)((long)puVar30 + 2);
              }
              if (puVar55 < *(ulong **)(unaff_x29 + -0x88)) goto code_r0x000af7a8;
            }
            iVar33 = (int)puVar55 - iVar39;
          }
          else {
            lVar48 = *(long *)(unaff_x29 + -0xe0);
            if (lVar48 <= (long)-uVar44) {
              lVar48 = -uVar44;
            }
            iVar33 = (int)lVar48;
            if (iVar33 < -3) {
              lVar48 = 0;
              do {
                uVar4 = *(uint *)((long)puVar1 + lVar48 + -4) ^
                        *(uint *)((long)in_stack_00000158 + lVar48 + -7);
                if (uVar4 != 0) {
                  uVar26 = *(ulong *)(unaff_x29 + -0x80);
                  unaff_x26 = *(char **)(unaff_x29 + -0x78);
                  iVar54 = (int)lVar48 - ((uint)LZCOUNT(uVar4) >> 3);
                  goto joined_r0x000af8bc;
                }
                lVar48 = lVar48 + -4;
              } while ((long)iVar33 + 3 < lVar48);
              uVar26 = *(ulong *)(unaff_x29 + -0x80);
              unaff_x26 = *(char **)(unaff_x29 + -0x78);
            }
            else {
              lVar48 = 0;
            }
            iVar28 = (int)lVar48;
            lVar48 = (long)iVar28;
            iVar2 = iVar28;
            if (iVar33 <= iVar28) {
              iVar2 = iVar33;
            }
            iVar28 = iVar28 + 1;
            do {
              iVar54 = iVar2;
              if (lVar48 <= iVar33) break;
              lVar16 = lVar48 + in_stack_00000120 + -4;
              lVar41 = lVar48 + (uVar44 - 1);
              lVar48 = lVar48 + -1;
              iVar28 = iVar28 + -1;
              iVar54 = iVar28;
            } while (*(char *)((long)in_stack_00000148 + lVar16) ==
                     *(char *)((long)puVar18 + lVar41));
joined_r0x000af8bc:
            if (unaff_x28 <= puVar29) goto code_r0x000af360;
code_r0x000af70c:
            uVar44 = *puVar29 ^ *(ulong *)(puVar1 + 1);
            if (uVar44 == 0) {
              puVar30 = (ulong *)(puVar1 + 3);
              puVar55 = (ulong *)((long)in_stack_00000158 + 9U);
              goto joined_r0x000af368;
            }
            uVar44 = (uVar44 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar44 & 0x5555555555555555) << 1;
            uVar44 = (uVar44 & 0xcccccccccccccccc) >> 2 | (uVar44 & 0x3333333333333333) << 2;
            uVar44 = (uVar44 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar44 & 0xf0f0f0f0f0f0f0f) << 4;
            uVar44 = (uVar44 & 0xff00ff00ff00ff00) >> 8 | (uVar44 & 0xff00ff00ff00ff) << 8;
            uVar44 = (uVar44 & 0xffff0000ffff0000) >> 0x10 | (uVar44 & 0xffff0000ffff) << 0x10;
            iVar33 = (int)((ulong)LZCOUNT(uVar44 >> 0x20 | uVar44 << 0x20) >> 3);
          }
code_r0x000af7d4:
          uVar4 = (iVar33 - iVar54) + 4;
          if ((int)uVar4 <= (int)uVar27) {
            iVar54 = *(int *)(unaff_x29 + -0x90);
          }
          *(int *)(unaff_x29 + -0x90) = iVar54;
          uVar3 = uVar23 - uVar34;
          if ((int)uVar4 <= (int)uVar27) {
            uVar3 = (uint)uVar37;
          }
          uVar37 = (ulong)uVar3;
          if ((int)uVar4 <= (int)uVar27) {
            uVar4 = uVar27;
          }
          uVar53 = (ulong)uVar4;
          uVar6 = *(ushort *)(unaff_x23 + (ulong)(uVar34 & 0xffff) * 2);
          iVar54 = (int)uVar26;
joined_r0x000af804:
          uVar27 = (uint)uVar6;
          uVar44 = (ulong)(iVar40 - 1);
          if (0x80 < iVar54) goto code_r0x000af514;
code_r0x000af808:
          uVar43 = (ulong)(uVar34 - uVar27);
        }
        else {
          if (uVar34 <= *(uint *)(unaff_x29 + -200)) {
            uVar44 = (ulong)(uVar34 - (int)*(undefined8 *)(unaff_x29 + -0xa0));
            puVar1 = (uint *)((long)puVar25 + uVar44);
            if (*puVar1 != uVar21) {
              uVar26 = *(ulong *)(unaff_x29 + -0x80);
              uVar6 = *(ushort *)(unaff_x23 + (ulong)(uVar34 & 0xffff) * 2);
              iVar54 = (int)uVar26;
              goto joined_r0x000af804;
            }
            puVar55 = (ulong *)(*(long *)(unaff_x29 + -0xa8) + (ulong)uVar13);
            puVar30 = *(ulong **)(unaff_x29 + -0x88);
            if (puVar55 <= *(ulong **)(unaff_x29 + -0x88)) {
              puVar30 = puVar55;
            }
            puVar52 = (ulong *)(puVar1 + 1);
            puVar36 = (ulong *)((long)puVar30 - 7);
            puVar14 = puVar29;
            if (puVar29 < puVar36) {
              uVar26 = *puVar29 ^ *puVar52;
              if (uVar26 == 0) {
                puVar52 = (ulong *)(puVar1 + 3);
                puVar14 = (ulong *)((long)in_stack_00000158 + 9U);
                goto joined_r0x000afb44;
              }
              uVar26 = (uVar26 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar26 & 0x5555555555555555) << 1;
              uVar26 = (uVar26 & 0xcccccccccccccccc) >> 2 | (uVar26 & 0x3333333333333333) << 2;
              uVar26 = (uVar26 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar26 & 0xf0f0f0f0f0f0f0f) << 4;
              uVar26 = (uVar26 & 0xff00ff00ff00ff00) >> 8 | (uVar26 & 0xff00ff00ff00ff) << 8;
              uVar26 = (uVar26 & 0xffff0000ffff0000) >> 0x10 | (uVar26 & 0xffff0000ffff) << 0x10;
              iVar54 = (int)((ulong)LZCOUNT(uVar26 >> 0x20 | uVar26 << 0x20) >> 3);
            }
            else {
joined_r0x000afb44:
              if (puVar14 < puVar36) {
                iVar54 = *(int *)(unaff_x29 + -0xf8) + (int)puVar14;
                do {
                  uVar26 = *puVar14 ^ *puVar52;
                  if (uVar26 != 0) {
                    uVar26 = (uVar26 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar26 & 0x5555555555555555) << 1
                    ;
                    uVar26 = (uVar26 & 0xcccccccccccccccc) >> 2 | (uVar26 & 0x3333333333333333) << 2
                    ;
                    uVar26 = (uVar26 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar26 & 0xf0f0f0f0f0f0f0f) << 4;
                    uVar26 = (uVar26 & 0xff00ff00ff00ff00) >> 8 | (uVar26 & 0xff00ff00ff00ff) << 8;
                    uVar26 = (uVar26 & 0xffff0000ffff0000) >> 0x10 |
                             (uVar26 & 0xffff0000ffff) << 0x10;
                    iVar54 = (int)((ulong)LZCOUNT(uVar26 >> 0x20 | uVar26 << 0x20) >> 3) + iVar54;
                    goto code_r0x000af2fc;
                  }
                  puVar14 = puVar14 + 1;
                  puVar52 = puVar52 + 1;
                  iVar54 = iVar54 + 8;
                } while (puVar14 < puVar36);
              }
              if (puVar14 < (ulong *)((long)puVar30 - 3U)) {
                if ((uint)*puVar52 == (uint)*puVar14) {
                  puVar14 = (ulong *)((long)puVar14 + 4);
                  puVar52 = (ulong *)((long)puVar52 + 4);
                }
                if (puVar14 < (ulong *)((long)puVar30 - 1U)) goto code_r0x000afa94;
              }
              else if (puVar14 < (ulong *)((long)puVar30 - 1U)) {
code_r0x000afa94:
                if ((short)*puVar52 == (short)*puVar14) {
                  puVar14 = (ulong *)((long)puVar14 + 2);
                  puVar52 = (ulong *)((long)puVar52 + 2);
                }
              }
              if (puVar14 < puVar30) {
                if ((char)*puVar52 == (char)*puVar14) {
                  puVar14 = (ulong *)((long)puVar14 + 1);
                }
              }
              iVar54 = (int)puVar14 - iVar39;
            }
code_r0x000af2fc:
            iVar54 = iVar54 + 4;
            if (puVar55 < *(ulong **)(unaff_x29 + -0x88)) {
              unaff_x26 = *(char **)(unaff_x29 + -0x78);
              if ((ulong *)(*(long *)(unaff_x29 + -0xa8) + (long)iVar54) == puVar30) {
                puVar14 = puVar18;
                puVar55 = puVar30;
                if (puVar30 < unaff_x28) {
                  uVar26 = *puVar30 ^ *puVar18;
                  if (uVar26 == 0) {
                    puVar55 = puVar30 + 1;
                    puVar14 = puVar18 + 1;
                    goto code_r0x000af378;
                  }
                  uVar26 = (uVar26 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar26 & 0x5555555555555555) << 1;
                  uVar26 = (uVar26 & 0xcccccccccccccccc) >> 2 | (uVar26 & 0x3333333333333333) << 2;
                  uVar26 = (uVar26 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar26 & 0xf0f0f0f0f0f0f0f) << 4;
                  uVar26 = (uVar26 & 0xff00ff00ff00ff00) >> 8 | (uVar26 & 0xff00ff00ff00ff) << 8;
                  uVar26 = (uVar26 & 0xffff0000ffff0000) >> 0x10 | (uVar26 & 0xffff0000ffff) << 0x10
                  ;
                  iVar33 = (int)((ulong)LZCOUNT(uVar26 >> 0x20 | uVar26 << 0x20) >> 3);
                }
                else {
code_r0x000af378:
                  if (puVar55 < unaff_x28) {
                    uVar26 = (long)in_stack_00000148 + (ulong)uVar13 + in_stack_00000120 + -3;
                    if (in_stack_00000150 <= uVar26) {
                      uVar26 = in_stack_00000150;
                    }
                    iVar33 = (int)puVar55 - (int)uVar26;
                    do {
                      uVar26 = *puVar55 ^ *puVar14;
                      if (uVar26 != 0) {
                        uVar26 = (uVar26 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                                 (uVar26 & 0x5555555555555555) << 1;
                        uVar26 = (uVar26 & 0xcccccccccccccccc) >> 2 |
                                 (uVar26 & 0x3333333333333333) << 2;
                        uVar26 = (uVar26 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                                 (uVar26 & 0xf0f0f0f0f0f0f0f) << 4;
                        uVar26 = (uVar26 & 0xff00ff00ff00ff00) >> 8 |
                                 (uVar26 & 0xff00ff00ff00ff) << 8;
                        uVar26 = (uVar26 & 0xffff0000ffff0000) >> 0x10 |
                                 (uVar26 & 0xffff0000ffff) << 0x10;
                        iVar33 = (int)((ulong)LZCOUNT(uVar26 >> 0x20 | uVar26 << 0x20) >> 3) +
                                 iVar33;
                        goto code_r0x000af428;
                      }
                      puVar55 = puVar55 + 1;
                      puVar14 = puVar14 + 1;
                      iVar33 = iVar33 + 8;
                    } while (puVar55 < unaff_x28);
                  }
                  if (puVar55 < in_stack_00000060) {
                    if ((uint)*puVar14 == (uint)*puVar55) {
                      puVar55 = (ulong *)((long)puVar55 + 4);
                      puVar14 = (ulong *)((long)puVar14 + 4);
                    }
                    if (puVar55 < in_stack_00000058) goto code_r0x000afac8;
code_r0x000af3f0:
                    if (puVar55 < *(ulong **)(unaff_x29 + -0x88)) {
code_r0x000af3fc:
                      if ((char)*puVar14 == (char)*puVar55) {
                        puVar55 = (ulong *)((long)puVar55 + 1);
                      }
                    }
                  }
                  else {
                    if (in_stack_00000058 <= puVar55) goto code_r0x000af3f0;
code_r0x000afac8:
                    if ((short)*puVar14 == (short)*puVar55) {
                      puVar55 = (ulong *)((long)puVar55 + 2);
                      puVar14 = (ulong *)((long)puVar14 + 2);
                    }
                    if (puVar55 < *(ulong **)(unaff_x29 + -0x88)) goto code_r0x000af3fc;
                  }
                  iVar33 = (int)puVar55 - (int)puVar30;
                }
code_r0x000af428:
                iVar54 = iVar33 + iVar54;
                goto code_r0x000af42c;
              }
            }
            else {
code_r0x000af42c:
              unaff_x26 = *(char **)(unaff_x29 + -0x78);
            }
            if ((int)*(undefined8 *)(unaff_x29 + -0xb0) == 0) {
              uVar26 = *(ulong *)(unaff_x29 + -0x80);
              iVar33 = 0;
            }
            else {
              lVar48 = *(long *)(unaff_x29 + -0xe0);
              if (lVar48 <= (long)-uVar44) {
                lVar48 = -uVar44;
              }
              iVar28 = (int)lVar48;
              if (iVar28 < -3) {
                lVar48 = 0;
                do {
                  uVar4 = *(uint *)((long)puVar1 + lVar48 + -4) ^
                          *(uint *)((long)in_stack_00000158 + lVar48 + -7);
                  if (uVar4 != 0) {
                    iVar33 = (int)lVar48 - ((uint)LZCOUNT(uVar4) >> 3);
                    uVar26 = *(ulong *)(unaff_x29 + -0x80);
                    unaff_x26 = *(char **)(unaff_x29 + -0x78);
                    goto code_r0x000af4e4;
                  }
                  lVar48 = lVar48 + -4;
                } while ((long)iVar28 + 3 < lVar48);
              }
              else {
                lVar48 = 0;
              }
              iVar33 = (int)lVar48;
              lVar48 = (long)iVar33;
              iVar2 = iVar33;
              if (iVar28 <= iVar33) {
                iVar2 = iVar28;
              }
              iVar33 = iVar33 + 1;
              uVar26 = *(ulong *)(unaff_x29 + -0x80);
              unaff_x26 = *(char **)(unaff_x29 + -0x78);
              do {
                if (lVar48 <= iVar28) {
                  iVar33 = iVar2;
                  break;
                }
                lVar16 = lVar48 + in_stack_00000120 + -4;
                lVar41 = lVar48 + (uVar44 - 1);
                lVar48 = lVar48 + -1;
                iVar33 = iVar33 + -1;
              } while (*(char *)((long)in_stack_00000148 + lVar16) ==
                       *(char *)((long)puVar25 + lVar41));
            }
code_r0x000af4e4:
            uVar4 = iVar54 - iVar33;
            if ((int)uVar4 <= (int)uVar27) {
              iVar33 = *(int *)(unaff_x29 + -0x90);
            }
            *(int *)(unaff_x29 + -0x90) = iVar33;
            uVar3 = uVar23 - uVar34;
            if ((int)uVar4 <= (int)uVar27) {
              uVar3 = (uint)uVar37;
            }
            uVar37 = (ulong)uVar3;
            if ((int)uVar4 <= (int)uVar27) {
              uVar4 = uVar27;
            }
            uVar53 = (ulong)uVar4;
          }
code_r0x000af500:
          uVar44 = (ulong)(iVar40 - 1);
          uVar27 = (uint)*(ushort *)(unaff_x23 + (ulong)(uVar34 & 0xffff) * 2);
          if ((int)uVar26 < 0x81) goto code_r0x000af808;
code_r0x000af514:
          if (uVar27 != 1) goto code_r0x000af808;
          if (iVar22 == 0) {
            if (*(int *)(unaff_x29 + -0xf0) != 0) {
              puVar55 = puVar29;
              puVar14 = (ulong *)((long)in_stack_00000148 + in_stack_00000120 + 1);
              for (puVar30 = puVar29; puVar30 < unaff_x28; puVar30 = puVar30 + 1) {
                uVar43 = *puVar30 ^ uVar17;
                if (uVar43 != 0) {
                  uVar43 = (uVar43 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar43 & 0x5555555555555555) << 1;
                  uVar43 = (uVar43 & 0xcccccccccccccccc) >> 2 | (uVar43 & 0x3333333333333333) << 2;
                  uVar43 = (uVar43 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar43 & 0xf0f0f0f0f0f0f0f) << 4;
                  uVar43 = (uVar43 & 0xff00ff00ff00ff00) >> 8 | (uVar43 & 0xff00ff00ff00ff) << 8;
                  uVar43 = (uVar43 & 0xffff0000ffff0000) >> 0x10 | (uVar43 & 0xffff0000ffff) << 0x10
                  ;
                  puVar55 = (ulong *)((long)puVar14 +
                                     ((ulong)LZCOUNT(uVar43 >> 0x20 | uVar43 << 0x20) >> 3));
                  goto code_r0x000af66c;
                }
                puVar55 = puVar14 + 1;
                puVar14 = puVar55;
              }
              if (puVar30 < *(ulong **)(unaff_x29 + -0x88)) {
                lVar48 = (long)*(ulong **)(unaff_x29 + -0x88) - (long)puVar55;
                puVar14 = (ulong *)((long)puVar30 + lVar48);
                uVar43 = uVar17;
                do {
                  puVar55 = puVar30;
                  if ((uint)(byte)*puVar30 != ((uint)uVar43 & 0xff)) goto code_r0x000af66c;
                  puVar30 = (ulong *)((long)puVar30 + 1);
                  uVar43 = uVar43 >> 8;
                  lVar48 = lVar48 + -1;
                } while (lVar48 != 0);
                puVar55 = puVar14;
              }
code_r0x000af66c:
              uStack0000000000000138 = (ulong)(uint)((int)puVar55 - iVar39) + 4;
              iVar22 = 2;
              goto code_r0x000af528;
            }
            iVar22 = 1;
            goto code_r0x000af808;
          }
          if (iVar22 != 2) goto code_r0x000af808;
code_r0x000af528:
          uVar4 = uVar34 - 1;
          if (uVar4 < uVar11) goto code_r0x000af808;
          if (uVar13 < 3) {
            iVar22 = 2;
            goto code_r0x000af808;
          }
          puVar55 = (ulong *)((long)puVar25 +
                             (ulong)(uVar4 - (int)*(undefined8 *)(unaff_x29 + -0xa0)));
          puVar30 = (ulong *)((long)puVar18 + (ulong)(uVar4 - uVar5));
          if (uVar4 < uVar5) {
            puVar30 = puVar55;
          }
          if ((uint)*puVar30 != uVar21) {
            iVar22 = 2;
            uVar26 = *(ulong *)(unaff_x29 + -0x80);
            goto code_r0x000af808;
          }
          puVar52 = *(ulong **)(unaff_x29 + -0x88);
          puVar14 = puVar52;
          if (uVar4 < uVar5) {
            puVar14 = puVar15;
          }
          puVar36 = (ulong *)((long)puVar30 + 4);
          puVar24 = puVar36;
          if (puVar36 < (ulong *)((long)puVar14 - 7U)) {
            iVar22 = (int)*(undefined8 *)(unaff_x29 + -0xb0);
            puVar42 = puVar36;
            do {
              uVar26 = *puVar24 ^ uVar17;
              if (uVar26 != 0) {
                uVar26 = (uVar26 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar26 & 0x5555555555555555) << 1;
                uVar26 = (uVar26 & 0xcccccccccccccccc) >> 2 | (uVar26 & 0x3333333333333333) << 2;
                uVar26 = (uVar26 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar26 & 0xf0f0f0f0f0f0f0f) << 4;
                uVar26 = (uVar26 & 0xff00ff00ff00ff00) >> 8 | (uVar26 & 0xff00ff00ff00ff) << 8;
                uVar26 = (uVar26 & 0xffff0000ffff0000) >> 0x10 | (uVar26 & 0xffff0000ffff) << 0x10;
                puVar24 = (ulong *)((long)puVar42 +
                                   ((ulong)LZCOUNT(uVar26 >> 0x20 | uVar26 << 0x20) >> 3));
                goto code_r0x000af6a0;
              }
              puVar24 = puVar24 + 1;
              puVar42 = puVar42 + 1;
            } while (puVar24 < (ulong *)((long)puVar14 - 7U));
          }
          else {
            iVar22 = (int)*(undefined8 *)(unaff_x29 + -0xb0);
          }
          if (puVar24 < puVar14) {
            lVar48 = (long)puVar14 - (long)puVar24;
            uVar26 = uVar17;
            do {
              if ((uint)(byte)*puVar24 != ((uint)uVar26 & 0xff)) goto code_r0x000af6a0;
              puVar24 = (ulong *)((long)puVar24 + 1);
              uVar26 = uVar26 >> 8;
              lVar48 = lVar48 + -1;
            } while (lVar48 != 0);
            puVar24 = puVar14;
          }
code_r0x000af6a0:
          uVar26 = (long)puVar24 - (long)puVar36;
          uVar47 = (uVar26 & 0xffffffff) + 4;
          if (uVar4 < uVar5) {
            puVar14 = puVar25;
            if ((ulong *)((long)puVar55 + uVar47) == puVar15) {
              puVar55 = puVar18;
              puVar36 = puVar18;
              uVar43 = uVar17;
              if ((uVar26 & 3) != 0) {
                uVar13 = (int)uVar26 * -8 & 0x1f;
                uVar13 = uVar21 >> uVar13 | uVar21 << 0x20 - uVar13;
                uVar43 = CONCAT44(uVar13,uVar13);
              }
              for (; puVar55 < unaff_x28; puVar55 = puVar55 + 1) {
                uVar26 = *puVar55 ^ uVar43;
                if (uVar26 != 0) {
                  uVar26 = (uVar26 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar26 & 0x5555555555555555) << 1;
                  uVar26 = (uVar26 & 0xcccccccccccccccc) >> 2 | (uVar26 & 0x3333333333333333) << 2;
                  uVar26 = (uVar26 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar26 & 0xf0f0f0f0f0f0f0f) << 4;
                  uVar26 = (uVar26 & 0xff00ff00ff00ff00) >> 8 | (uVar26 & 0xff00ff00ff00ff) << 8;
                  uVar26 = (uVar26 & 0xffff0000ffff0000) >> 0x10 | (uVar26 & 0xffff0000ffff) << 0x10
                  ;
                  puVar36 = (ulong *)((long)puVar36 +
                                     ((ulong)LZCOUNT(uVar26 >> 0x20 | uVar26 << 0x20) >> 3));
                  goto code_r0x000af8d0;
                }
                puVar36 = puVar36 + 1;
              }
              if (puVar55 < puVar52) {
                lVar48 = (long)puVar52 - (long)puVar36;
                puVar52 = (ulong *)((long)puVar55 + lVar48);
                do {
                  puVar36 = puVar55;
                  if ((uint)(byte)*puVar55 != ((uint)uVar43 & 0xff)) goto code_r0x000af8d0;
                  puVar55 = (ulong *)((long)puVar55 + 1);
                  uVar43 = uVar43 >> 8;
                  lVar48 = lVar48 + -1;
                } while (lVar48 != 0);
                puVar36 = puVar52;
              }
code_r0x000af8d0:
              uVar47 = (uint)((int)puVar36 - (int)puVar18) + uVar47;
            }
          }
          else {
            puVar14 = puVar18;
          }
          *(uint *)(unaff_x29 + -0x6c) = uVar21;
          puVar55 = puVar30;
          do {
            puVar52 = puVar55;
            if (puVar52 < (ulong *)((long)puVar14 + 4U)) break;
            puVar55 = (ulong *)((long)puVar52 + -4);
          } while (*(uint *)((long)puVar52 + -4) == uVar21);
          puVar55 = puVar52;
          if (puVar14 < puVar52) {
            lVar48 = 0;
            do {
              puVar55 = (ulong *)((long)puVar52 + lVar48);
              if (*(char *)((long)puVar55 + -1) != unaff_x26[lVar48]) goto code_r0x000af940;
              lVar48 = lVar48 + -1;
            } while (puVar14 < (ulong *)((long)puVar52 + lVar48));
            puVar55 = puVar14;
          }
code_r0x000af940:
          iVar39 = (int)((long)puVar30 - (long)puVar55);
          if ((uVar4 < uVar5) ||
             ((ulong *)((long)puVar30 - ((long)puVar30 - (long)puVar55 & 0xffffffffU)) != puVar18))
          {
            uVar26 = *(ulong *)(unaff_x29 + -0x80);
          }
          else {
            uVar26 = *(ulong *)(unaff_x29 + -0x80);
            if ((uint)*(undefined8 *)(unaff_x29 + -0xa0) < uVar5) {
              uVar34 = iVar39 * 8 & 0x1f;
              uVar13 = uVar21;
              if ((-iVar39 & 3U) != 0) {
                uVar13 = uVar21 >> uVar34 | uVar21 << 0x20 - uVar34;
              }
              *(uint *)(unaff_x29 + -0x6c) = uVar13;
              lVar48 = lVar56;
              do {
                lVar16 = lVar48;
                if (lVar16 < 4) {
                  puVar55 = (ulong *)((long)puVar25 + lVar16);
                  if (lVar16 < 1) goto code_r0x000af9d4;
                  break;
                }
                lVar48 = lVar16 + -4;
              } while (*(uint *)((long)puVar25 + lVar16 + -4) == uVar13);
              puVar55 = (ulong *)((long)puVar25 + lVar16);
              pcVar50 = unaff_x26;
              do {
                puVar30 = (ulong *)((long)puVar55 + -1);
                if (*(char *)puVar30 != *pcVar50) goto code_r0x000af9d4;
                pcVar50 = pcVar50 + -1;
                puVar55 = puVar30;
              } while (puVar25 < puVar30);
              puVar55 = puVar25;
code_r0x000af9d4:
              iVar39 = ((int)puVar15 - (int)puVar55) + iVar39;
            }
          }
          uVar13 = uVar4 - iVar39;
          if (uVar4 - iVar39 <= uVar11) {
            uVar13 = uVar11;
          }
          uVar43 = (ulong)uVar13;
          uVar58 = uVar47 + (uVar4 - uVar13);
          if ((uStack0000000000000138 < uVar47) || (uVar58 < uStack0000000000000138)) {
            if (uVar5 + ~uVar13 < 3) {
              iVar22 = 2;
              uVar43 = uVar45;
              goto code_r0x000af80c;
            }
            if (iVar22 != 0) goto code_r0x000afa80;
            if (uStack0000000000000138 <= uVar58) {
              uVar58 = uStack0000000000000138;
            }
            if ((ulong)(long)(int)uVar53 < uVar58) {
              if ((((long)puVar31 - (long)puVar18) + uVar45) - uVar43 >> 0x10 != 0)
              goto code_r0x000aed30;
              uVar37 = (ulong)(uVar23 - uVar13);
              uVar53 = uVar58;
            }
            uVar34 = (uint)*(ushort *)(unaff_x23 + (ulong)(uVar13 & 0xffff) * 2);
            uVar43 = (ulong)(uVar13 - uVar34);
            if (uVar13 < uVar34) goto code_r0x000aed30;
          }
          else {
            uVar13 = (uVar4 - (int)uStack0000000000000138) + (int)uVar47;
            uVar34 = uVar5;
            if (2 < uVar5 + ~uVar13) {
              uVar34 = uVar13;
            }
            uVar43 = (ulong)uVar34;
          }
code_r0x000afa80:
          iVar22 = 2;
        }
code_r0x000af80c:
        if ((uint)uVar43 < uVar11 || iVar40 < 2) goto code_r0x000aed30;
        goto code_r0x000af134;
      }
      *(undefined4 *)(unaff_x29 + -0x90) = 0;
      uVar37 = 0;
code_r0x000aed30:
      if (((uVar23 < uVar20 + 0x10000) && (*(int *)(unaff_x29 + -0xe4) == 1)) && (0 < (int)uVar44))
      {
        lVar16 = *(long *)(unaff_x29 + -0xd8);
        lVar48 = *(long *)(&UNK_00040008 + lVar16);
        uVar5 = *(uint *)(&UNK_00040018 + lVar16);
        lVar56 = (*(long *)(lVar16 + 0x40000) - lVar48) + (ulong)uVar5;
        uVar20 = *(uint *)(lVar16 + (ulong)((uint)(**(int **)(unaff_x29 + -0xa8) * -0x61c8864f) >>
                                           0x11) * 4);
        iVar22 = (uVar20 + uVar11) - (int)lVar56;
        uVar11 = uVar23 - iVar22;
        if (uVar11 >> 0x10 == 0) {
          puVar18 = (ulong *)((long)in_stack_00000158 + 1);
          lVar16 = (long)in_stack_00000148 - (long)*(int **)(unaff_x29 + -0xa8);
          do {
            if ((int)uVar44 == 0) break;
            puVar31 = (uint *)((lVar48 - (ulong)uVar5) + (ulong)uVar20);
            if (*puVar31 == uVar21) {
              puVar25 = (ulong *)(*(long *)(unaff_x29 + -0xa8) + (lVar56 - (ulong)uVar20));
              puVar29 = *(ulong **)(unaff_x29 + -0x88);
              if (puVar25 <= *(ulong **)(unaff_x29 + -0x88)) {
                puVar29 = puVar25;
              }
              puVar15 = (ulong *)(puVar31 + 1);
              puVar55 = (ulong *)((long)puVar29 - 7);
              puVar25 = puVar18;
              if (puVar18 < puVar55) {
                uVar45 = *puVar18 ^ *puVar15;
                if (uVar45 == 0) {
                  puVar15 = (ulong *)(puVar31 + 3);
                  puVar25 = (ulong *)((long)in_stack_00000158 + 9);
                  goto joined_r0x000af018;
                }
                uVar45 = (uVar45 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar45 & 0x5555555555555555) << 1;
                uVar45 = (uVar45 & 0xcccccccccccccccc) >> 2 | (uVar45 & 0x3333333333333333) << 2;
                uVar45 = (uVar45 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar45 & 0xf0f0f0f0f0f0f0f) << 4;
                uVar45 = (uVar45 & 0xff00ff00ff00ff00) >> 8 | (uVar45 & 0xff00ff00ff00ff) << 8;
                uVar45 = (uVar45 & 0xffff0000ffff0000) >> 0x10 | (uVar45 & 0xffff0000ffff) << 0x10;
                iVar39 = (int)((ulong)LZCOUNT(uVar45 >> 0x20 | uVar45 << 0x20) >> 3);
              }
              else {
joined_r0x000af018:
                if (puVar25 < puVar55) {
                  iVar39 = ~(iVar12 + iVar35) + (int)puVar25;
                  do {
                    uVar45 = *puVar25 ^ *puVar15;
                    if (uVar45 != 0) {
                      uVar45 = (uVar45 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                               (uVar45 & 0x5555555555555555) << 1;
                      uVar45 = (uVar45 & 0xcccccccccccccccc) >> 2 |
                               (uVar45 & 0x3333333333333333) << 2;
                      uVar45 = (uVar45 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                               (uVar45 & 0xf0f0f0f0f0f0f0f) << 4;
                      uVar45 = (uVar45 & 0xff00ff00ff00ff00) >> 8 | (uVar45 & 0xff00ff00ff00ff) << 8
                      ;
                      uVar45 = (uVar45 & 0xffff0000ffff0000) >> 0x10 |
                               (uVar45 & 0xffff0000ffff) << 0x10;
                      iVar39 = (int)((ulong)LZCOUNT(uVar45 >> 0x20 | uVar45 << 0x20) >> 3) + iVar39;
                      unaff_x26 = *(char **)(unaff_x29 + -0x78);
                      goto code_r0x000aef28;
                    }
                    puVar25 = puVar25 + 1;
                    puVar15 = puVar15 + 1;
                    iVar39 = iVar39 + 8;
                  } while (puVar25 < puVar55);
                }
                if (puVar25 < (ulong *)((long)puVar29 - 3U)) {
                  if ((uint)*puVar15 == (uint)*puVar25) {
                    puVar25 = (ulong *)((long)puVar25 + 4);
                    puVar15 = (ulong *)((long)puVar15 + 4);
                  }
                  if (puVar25 < (ulong *)((long)puVar29 - 1U)) goto code_r0x000aefe4;
code_r0x000aeeec:
                  unaff_x26 = *(char **)(unaff_x29 + -0x78);
                }
                else {
                  if ((ulong *)((long)puVar29 - 1U) <= puVar25) goto code_r0x000aeeec;
code_r0x000aefe4:
                  if ((short)*puVar15 == (short)*puVar25) {
                    puVar25 = (ulong *)((long)puVar25 + 2);
                    puVar15 = (ulong *)((long)puVar15 + 2);
                  }
                  unaff_x26 = *(char **)(unaff_x29 + -0x78);
                }
                if (puVar25 < puVar29) {
                  if ((char)*puVar15 == (char)*puVar25) {
                    puVar25 = (ulong *)((long)puVar25 + 1);
                  }
                }
                iVar39 = (int)puVar25 - (int)puVar18;
              }
code_r0x000aef28:
              if ((int)*(undefined8 *)(unaff_x29 + -0xb0) == 0) {
                iVar40 = 0;
              }
              else {
                lVar41 = lVar16;
                if (lVar16 <= lVar48 - (long)puVar31) {
                  lVar41 = lVar48 - (long)puVar31;
                }
                iVar54 = (int)lVar41;
                if (iVar54 < -3) {
                  lVar41 = 0;
                  do {
                    uVar13 = *(uint *)((long)puVar31 + lVar41 + -4) ^
                             *(uint *)((long)in_stack_00000158 + lVar41 + -7);
                    if (uVar13 != 0) {
                      iVar40 = (int)lVar41 - ((uint)LZCOUNT(uVar13) >> 3);
                      uVar26 = *(ulong *)(unaff_x29 + -0x80);
                      unaff_x26 = *(char **)(unaff_x29 + -0x78);
                      goto code_r0x000aedd8;
                    }
                    lVar41 = lVar41 + -4;
                  } while ((long)iVar54 + 3 < lVar41);
                  uVar26 = *(ulong *)(unaff_x29 + -0x80);
                }
                else {
                  lVar41 = 0;
                }
                iVar28 = (int)lVar41;
                iVar33 = iVar28;
                if (iVar54 <= iVar28) {
                  iVar33 = iVar54;
                }
                iVar40 = iVar28 + 1;
                unaff_x26 = *(char **)(unaff_x29 + -0x78);
                lVar41 = (long)iVar28;
                do {
                  if (lVar41 <= iVar54) {
                    iVar40 = iVar33;
                    break;
                  }
                  lVar7 = lVar41 + in_stack_00000120 + -4;
                  lVar8 = lVar41 + -1;
                  iVar40 = iVar40 + -1;
                  unaff_x26 = *(char **)(unaff_x29 + -0x78);
                  lVar41 = lVar41 + -1;
                } while (*(char *)((long)in_stack_00000148 + lVar7) ==
                         *(char *)((long)puVar31 + lVar8));
              }
code_r0x000aedd8:
              uVar13 = (iVar39 + 4) - iVar40;
              uVar34 = (uint)uVar53;
              if ((int)uVar13 <= (int)uVar34) {
                iVar40 = *(int *)(unaff_x29 + -0x90);
              }
              *(int *)(unaff_x29 + -0x90) = iVar40;
              if ((int)uVar13 <= (int)uVar34) {
                uVar11 = (uint)uVar37;
              }
              uVar37 = (ulong)uVar11;
              if ((int)uVar13 <= (int)uVar34) {
                uVar13 = uVar34;
              }
              uVar53 = (ulong)uVar13;
            }
            uVar44 = (ulong)((int)uVar44 - 1);
            uVar11 = (uint)*(ushort *)
                            (*(long *)(unaff_x29 + -0xd8) + (ulong)(uVar20 & 0xffff) * 2 + 0x20000);
            uVar20 = uVar20 - uVar11;
            iVar22 = iVar22 - uVar11;
            uVar11 = uVar23 - iVar22;
          } while (uVar11 < 0x10000);
        }
      }
      unaff_x20 = (ulong *)(*(long *)(unaff_x29 + -0xa8) + (long)*(int *)(unaff_x29 + -0x90));
    }
    uStack0000000000000050 = uVar38;
    if ((int)(uint)uVar53 <= iVar12) {
      uStack0000000000000050 = iVar35 - iVar46;
      if (puStack00000000000000c8 <= in_stack_00000148) {
        uStack0000000000000050 = uVar38;
      }
      uVar26 = (ulong)uStack0000000000000050;
      unaff_x19 = (ulong *)(in_stack_000000b8 + 1);
      unaff_x22 = (long)in_stack_000000e0 - (long)in_stack_00000078;
      if ((in_stack_00000168._4_4_ != 0) &&
         (in_stack_000000a0 < (char *)((long)unaff_x19 + unaff_x22 + unaff_x22 / 0xff + 8))) {
        in_stack_00000158 = in_stack_00000078;
        in_stack_00000148 = in_stack_000000e0;
        goto code_r0x000b4f20;
      }
      uVar37 = unaff_x22 - 0xf;
      if (unaff_x22 < 0xf) {
        *in_stack_000000b8 = (char)((int)unaff_x22 << 4);
        goto LAB_000b0408;
      }
      *in_stack_000000b8 = -0x10;
      if (uVar37 < 0xff) goto code_r0x000b0264;
      unaff_x21 = unaff_x22 - 0x10e;
      unaff_x24 = unaff_x21 / 0xff;
      *(ulong *)(unaff_x29 + -0x90) = uVar26;
      param_3 = unaff_x24 + 1;
      unaff_x27 = in_stack_000000b8;
      goto code_r0x000b0220;
    }
    uVar23 = (uint)uVar37;
    puStack00000000000000a8 = unaff_x20;
    puVar25 = unaff_x20;
    if ((ulong *)((long)puStack00000000000000c8 + 3U) <= unaff_x20) goto code_r0x000afb74;
    uVar44 = uVar26;
  } while (unaff_x20 < puStack00000000000000c8);
  if (in_stack_00000148 < puStack00000000000000c8) {
    iVar35 = (int)puStack00000000000000c8 - iVar35;
    uVar38 = iVar12 - iVar35;
    puVar18 = (ulong *)((long)in_stack_00000148 + (long)iVar35);
    uVar32 = uVar23;
    if (3 < (int)uVar38) {
      uVar32 = (uint)param_2;
    }
    param_2 = (ulong)uVar32;
    uVar32 = (uint)uVar53;
    if (3 < (int)uVar38) {
      uVar32 = uVar38;
    }
    param_1 = (ulong)uVar32;
    in_stack_00000148 = unaff_x20;
    if (3 < (int)uVar38) {
      in_stack_00000148 = puVar18;
    }
  }
  puVar18 = (ulong *)(in_stack_000000b8 + 1);
  uVar44 = (long)in_stack_000000e0 - (long)in_stack_00000078;
  if ((in_stack_00000168._4_4_ != 0) &&
     (in_stack_000000a0 < (char *)((long)puVar18 + uVar44 + uVar44 / 0xff + 8)))
  goto code_r0x000b4ed0;
  uVar45 = uVar44 - 0xf;
  if (uVar44 < 0xf) {
    *in_stack_000000b8 = (char)((int)uVar44 << 4);
  }
  else {
    *in_stack_000000b8 = -0x10;
    puVar25 = puVar18;
    if (0xfe < uVar45) {
      uVar45 = (uVar44 - 0x10e) / 0xff;
      *(uint *)(unaff_x29 + -0x90) = uVar23;
      _memset(puVar18,0xff,uVar45 + 1);
      uVar37 = (ulong)*(uint *)(unaff_x29 + -0x90);
      puVar25 = (ulong *)(in_stack_000000b8 + uVar45 + 2);
      uVar45 = (uVar44 - 0x10e) % 0xff;
    }
    puVar18 = (ulong *)((long)puVar25 + 1);
    *(char *)puVar25 = (char)uVar45;
  }
  puVar25 = (ulong *)((long)puVar18 + uVar44);
  puVar29 = (ulong *)((char *)((long)puVar18 + (long)in_stack_000000e0) + -(long)in_stack_00000078);
  if ((char *)((long)puVar18 + (long)in_stack_000000e0) + -(long)in_stack_00000078 <= puVar18 + 1) {
    puVar29 = puVar18 + 1;
  }
  puVar15 = in_stack_00000078;
  puVar55 = puVar18;
  if (((char *)((long)puVar29 + ~(ulong)puVar18) < &segment_command_00000020.vmaddr) ||
     ((ulong)((long)puVar18 - (long)in_stack_00000078) < 0x40)) goto code_r0x000affd0;
  uVar44 = ((long)puVar29 + ~(ulong)puVar18 >> 3) + 1;
  uVar43 = uVar44 & 0x3ffffffffffffff8;
  puVar29 = in_stack_00000078 + 4;
  puVar15 = puVar18 + 4;
  uVar45 = uVar43;
  do {
    uVar17 = puVar29[-4];
    uVar58 = puVar29[-1];
    uVar47 = puVar29[-2];
    uVar59 = puVar29[1];
    uVar49 = *puVar29;
    uVar61 = puVar29[3];
    uVar60 = puVar29[2];
    puVar15[-3] = puVar29[-3];
    puVar15[-4] = uVar17;
    puVar15[-1] = uVar58;
    puVar15[-2] = uVar47;
    puVar15[1] = uVar59;
    *puVar15 = uVar49;
    puVar15[3] = uVar61;
    puVar15[2] = uVar60;
    uVar45 = uVar45 - 8;
    puVar29 = puVar29 + 8;
    puVar15 = puVar15 + 8;
  } while (uVar45 != 0);
  puVar15 = in_stack_00000078 + uVar43;
  puVar55 = puVar18 + uVar43;
  if (uVar44 != uVar43) {
code_r0x000affd0:
    do {
      puVar29 = puVar55 + 1;
      *puVar55 = *puVar15;
      puVar15 = puVar15 + 1;
      puVar55 = puVar29;
    } while (puVar29 < puVar25);
  }
  pcVar50 = (char *)((long)puVar25 + 2);
  *(undefined2 *)puVar25 = uStack0000000000000118;
  uVar44 = lVar57 - 4;
  if ((in_stack_00000168._4_4_ != 0) && (in_stack_000000a0 < pcVar50 + uVar44 / 0xff + 6))
  goto code_r0x000b4ed0;
  if (uVar44 < 0xf) {
    *in_stack_000000b8 = *in_stack_000000b8 + (char)uVar44;
    lVar57 = *(long *)(unaff_x29 + -0x98);
  }
  else {
    *in_stack_000000b8 = *in_stack_000000b8 + '\x0f';
    uVar44 = lVar57 - 0x13;
    if (0x1fd < uVar44) {
      lVar56 = ((lVar57 - 0x211U) / 0x1fe) * 2;
      *(int *)(unaff_x29 + -0x90) = (int)uVar37;
      *(ulong **)(unaff_x29 + -0xa0) = puVar18;
      _memset(pcVar50,0xff,lVar56 + 2);
      uVar37 = (ulong)*(uint *)(unaff_x29 + -0x90);
      pcVar50 = (char *)((long)in_stack_000000e0 +
                        *(long *)(unaff_x29 + -0xa0) + (lVar56 - (long)in_stack_00000078) + 4);
      uVar44 = (lVar57 - 0x211U) % 0x1fe;
    }
    lVar57 = *(long *)(unaff_x29 + -0x98);
    pcVar51 = pcVar50;
    if (0xfe < uVar44) {
      pcVar51 = pcVar50 + 1;
      *pcVar50 = -1;
      uVar44 = uVar44 - 0xff;
    }
    pcVar50 = pcVar51 + 1;
    *pcVar51 = (char)uVar44;
  }
  param_2 = param_2 | param_1 << 0x20;
  puVar18 = in_stack_00000148;
  in_stack_000000b8 = pcVar50;
  goto code_r0x000adbb8;
code_r0x000afb74:
  if ((in_stack_00000148 < puStack00000000000000c8) &&
     (_uStack0000000000000050 = (long)in_stack_00000148 - (long)in_stack_000000e0,
     (long)_uStack0000000000000050 < 0x12)) {
    uVar38 = (iVar12 + (int)_uStack0000000000000050) - 4;
    if ((uint *)((long)in_stack_000000e0 + (long)(int)uVar32) <=
        (uint *)((long)in_stack_00000158 - 4U)) {
      uVar38 = uVar32;
    }
    _uStack0000000000000050 = (ulong)uVar38;
    uVar38 = uVar38 + (iVar46 - iVar35);
    uVar38 = uVar38 & ((int)uVar38 >> 0x1f ^ 0xffffffffU);
    param_1 = (ulong)(iVar12 - uVar38);
    in_stack_00000148 = (ulong *)((long)in_stack_00000148 + (ulong)uVar38);
  }
  puVar18 = (ulong *)(in_stack_000000b8 + 1);
  uVar44 = (long)in_stack_000000e0 - (long)in_stack_00000078;
  if ((in_stack_00000168._4_4_ != 0) &&
     (in_stack_000000a0 < (char *)((long)puVar18 + uVar44 + uVar44 / 0xff + 8)))
  goto code_r0x000b4ed0;
  uVar45 = uVar44 - 0xf;
  if (uVar44 < 0xf) {
    *in_stack_000000b8 = (char)((int)uVar44 << 4);
  }
  else {
    *in_stack_000000b8 = -0x10;
    puVar29 = puVar18;
    if (0xfe < uVar45) {
      *(ulong *)(unaff_x29 + -0xa0) = uVar44 - 0x10e;
      uVar45 = (uVar44 - 0x10e) / 0xff;
      *(uint *)(unaff_x29 + -0x90) = uVar23;
      _memset(puVar18,0xff,uVar45 + 1);
      uVar37 = (ulong)*(uint *)(unaff_x29 + -0x90);
      puVar29 = (ulong *)(in_stack_000000b8 + uVar45 + 2);
      uVar45 = uVar45 * -0xff + *(long *)(unaff_x29 + -0xa0);
    }
    puVar18 = (ulong *)((long)puVar29 + 1);
    *(char *)puVar29 = (char)uVar45;
  }
  puVar29 = (ulong *)((long)puVar18 + uVar44);
  puVar15 = (ulong *)((char *)((long)puVar18 + (long)in_stack_000000e0) + -(long)in_stack_00000078);
  if ((char *)((long)puVar18 + (long)in_stack_000000e0) + -(long)in_stack_00000078 <= puVar18 + 1) {
    puVar15 = puVar18 + 1;
  }
  puVar55 = in_stack_00000078;
  puVar30 = puVar18;
  if ((&segment_command_00000020.vmaddr <= (char *)((long)puVar15 + ~(ulong)puVar18)) &&
     (0x3f < (ulong)((long)puVar18 - (long)in_stack_00000078))) {
    uVar44 = ((long)puVar15 + ~(ulong)puVar18 >> 3) + 1;
    uVar43 = uVar44 & 0x3ffffffffffffff8;
    puVar15 = in_stack_00000078 + 4;
    puVar55 = puVar18 + 4;
    uVar45 = uVar43;
    do {
      uVar17 = puVar15[-4];
      uVar58 = puVar15[-1];
      uVar47 = puVar15[-2];
      uVar59 = puVar15[1];
      uVar49 = *puVar15;
      uVar61 = puVar15[3];
      uVar60 = puVar15[2];
      puVar55[-3] = puVar15[-3];
      puVar55[-4] = uVar17;
      puVar55[-1] = uVar58;
      puVar55[-2] = uVar47;
      puVar55[1] = uVar59;
      *puVar55 = uVar49;
      puVar55[3] = uVar61;
      puVar55[2] = uVar60;
      uVar45 = uVar45 - 8;
      puVar15 = puVar15 + 8;
      puVar55 = puVar55 + 8;
    } while (uVar45 != 0);
    puVar55 = in_stack_00000078 + uVar43;
    puVar30 = puVar18 + uVar43;
    if (uVar44 == uVar43) goto code_r0x000afd38;
  }
  do {
    puVar15 = puVar30 + 1;
    *puVar30 = *puVar55;
    puVar55 = puVar55 + 1;
    puVar30 = puVar15;
  } while (puVar15 < puVar29);
code_r0x000afd38:
  pcVar50 = (char *)((long)puVar29 + 2);
  *(undefined2 *)puVar29 = uStack0000000000000118;
  lVar57 = (long)(int)uStack0000000000000050;
  uVar44 = lVar57 - 4;
  if ((in_stack_00000168._4_4_ != 0) && (in_stack_000000a0 < pcVar50 + uVar44 / 0xff + 6))
  goto code_r0x000b4ed0;
  if (uVar44 < 0xf) {
    *in_stack_000000b8 = *in_stack_000000b8 + (char)uVar44;
  }
  else {
    *in_stack_000000b8 = *in_stack_000000b8 + '\x0f';
    uVar44 = lVar57 - 0x13;
    if (0x1fd < uVar44) {
      *(ulong *)(unaff_x29 + -0xa0) = lVar57 - 0x211U;
      uVar44 = (lVar57 - 0x211U) / 0x1fe;
      lVar56 = uVar44 * 2;
      *(int *)(unaff_x29 + -0x90) = (int)uVar37;
      *(ulong **)(unaff_x29 + -0xa8) = puVar18;
      _memset(pcVar50,0xff,lVar56 + 2);
      uVar37 = (ulong)*(uint *)(unaff_x29 + -0x90);
      pcVar50 = (char *)((long)in_stack_000000e0 +
                        *(long *)(unaff_x29 + -0xa8) + (lVar56 - (long)in_stack_00000078) + 4);
      uVar44 = *(long *)(unaff_x29 + -0xa0) + uVar44 * -0x1fe;
    }
    pcVar51 = pcVar50;
    if (0xfe < uVar44) {
      pcVar51 = pcVar50 + 1;
      *pcVar50 = -1;
      uVar44 = uVar44 - 0xff;
    }
    pcVar50 = pcVar51 + 1;
    *pcVar51 = (char)uVar44;
  }
  in_stack_00000078 = (ulong *)((long)in_stack_000000e0 + lVar57);
  _uStack0000000000000118 = param_2;
  _uStack0000000000000050 = param_1;
  in_stack_000000e0 = in_stack_00000148;
  in_stack_000000b8 = pcVar50;
  goto code_r0x000aeb94;
code_r0x000b4ed0:
  in_stack_00000158 = in_stack_00000078;
  in_stack_00000148 = in_stack_000000e0;
  goto code_r0x000b4f20;
}

