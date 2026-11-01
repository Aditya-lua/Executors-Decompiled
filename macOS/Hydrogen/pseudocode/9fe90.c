
int FUN_0009fe90(undefined8 param_1,undefined8 param_2,long param_3,long param_4,ulong *param_5,
                ulong *param_6,ulong *param_7)

{
  char *pcVar1;
  long lVar2;
  char cVar3;
  ulong *puVar4;
  short *psVar5;
  ulong *puVar6;
  uint uVar7;
  ulong *puVar8;
  uint uVar9;
  ulong *puVar10;
  uint uVar11;
  uint uVar12;
  uint uVar13;
  ulong *puVar14;
  ulong *puVar15;
  ulong *puVar16;
  ulong uVar17;
  ulong *puVar18;
  int iVar19;
  long unaff_x19;
  ulong uVar20;
  ulong uVar21;
  long unaff_x21;
  uint unaff_w22;
  ulong uVar22;
  ulong *puVar23;
  short *unaff_x24;
  ulong uVar24;
  ulong unaff_x25;
  ulong unaff_x26;
  short *psVar25;
  long unaff_x29;
  ulong uVar26;
  ulong uVar27;
  ulong uVar28;
  ulong uVar29;
  ulong uVar30;
  ulong *in_stack_00000018;
  ulong *in_stack_00000020;
  long in_stack_00000060;
  int in_stack_00000068;
  long in_stack_00000070;
  undefined8 in_stack_00000078;
  ulong *in_stack_00000080;
  long in_stack_00000088;
  
code_r0x0009fe90:
  _memset(unaff_x24,0xff,param_3);
  puVar4 = *(ulong **)(unaff_x29 + -0x70);
  uVar7 = *(uint *)(unaff_x29 + -100);
  puVar6 = *(ulong **)(unaff_x29 + -0x60);
  uVar12 = unaff_w22 + (int)unaff_x25 * -0x3fc;
  psVar5 = (short *)((long)unaff_x24 + unaff_x26);
code_r0x0009feec:
  uVar13 = (uVar12 & 0xffff) / 0xff;
  pcVar1 = (char *)((long)psVar5 + (ulong)uVar13);
  *pcVar1 = (char)uVar12 + (char)uVar13;
  psVar25 = (short *)(pcVar1 + 1);
joined_r0x0009ff0c:
  if (param_5 <= param_7) {
code_r0x000a0ad0:
    uVar24 = in_stack_00000088 - (long)param_7;
    uVar20 = uVar24 - 0xf;
    if (uVar24 < 0xf) {
      *(char *)psVar25 = (char)((int)uVar24 << 4);
    }
    else {
      psVar5 = (short *)((long)psVar25 + 1);
      *(char *)psVar25 = -0x10;
      if (0xfe < uVar20) {
        uVar20 = (long)puVar6 + (in_stack_00000060 - (long)param_7) + -0x10e;
        uVar21 = uVar20 / 0xff;
        _memset(psVar5,0xff,uVar21 + 1);
        uVar20 = uVar20 % 0xff;
        psVar5 = (short *)((long)psVar25 + uVar21 + 2);
      }
      *(char *)psVar5 = (char)uVar20;
      psVar25 = psVar5;
    }
    _memcpy((char *)((long)psVar25 + 1),param_7,uVar24);
    *(undefined8 *)(unaff_x21 + 0x4000) = *(undefined8 *)(unaff_x29 + -0x60);
    *(undefined4 *)(in_stack_00000070 + 8) = in_stack_00000078._4_4_;
    return ((int)(char *)((long)psVar25 + 1) + (int)uVar24) - in_stack_00000068;
  }
  iVar19 = (int)unaff_x19;
  *(int *)(unaff_x21 +
          ((ulong)(*(long *)((long)param_7 + -2) * -0x30e4432345000000) >> 0x32 & 0x3ffc)) =
       (int)(long *)((long)param_7 + -2) - iVar19;
  uVar13 = (int)param_7 - iVar19;
  uVar20 = *param_7 * -0x30e4432345000000 >> 0x32 & 0x3ffc;
  uVar12 = *(uint *)(unaff_x21 + uVar20);
  puVar16 = puVar4;
  lVar2 = param_4;
  if (uVar7 <= uVar12) {
    puVar16 = puVar6;
    lVar2 = unaff_x19;
  }
  *(uint *)(unaff_x21 + uVar20) = uVar13;
  if ((uVar12 + 0xffff < uVar13) ||
     (puVar23 = (ulong *)(lVar2 + (ulong)uVar12), (int)*puVar23 != (int)*param_7)) {
    uVar12 = (int)(ulong *)((long)param_7 + 1U) - iVar19;
    if ((ulong *)((long)param_7 + 2U) <= param_5) {
      uVar24 = *(ulong *)((long)param_7 + 1);
      uVar21 = 1;
      uVar20 = 0x41;
      puVar4 = (ulong *)((long)param_7 + 2U);
      puVar8 = (ulong *)((long)param_7 + 1U);
      do {
        puVar16 = puVar4;
        uVar17 = uVar24 * -0x30e4432345000000 >> 0x32 & 0x3ffc;
        uVar13 = *(uint *)(unaff_x21 + uVar17);
        uVar22 = (ulong)uVar13;
        uVar24 = *puVar16;
        *(uint *)(unaff_x21 + uVar17) = uVar12;
        if (uVar12 <= uVar13 + 0xffff) {
          lVar2 = param_4;
          if (uVar7 <= uVar13) {
            lVar2 = unaff_x19;
          }
          if (*(int *)(lVar2 + uVar22) == (int)*puVar8) goto code_r0x0009fc04;
        }
        uVar12 = (int)puVar16 - iVar19;
        puVar4 = (ulong *)((long)puVar16 + uVar21);
        uVar21 = uVar20 >> 6;
        uVar20 = uVar20 + 1;
        puVar8 = puVar16;
        if (param_5 < puVar4) break;
      } while( true );
    }
    goto code_r0x000a0ad0;
  }
  puVar10 = (ulong *)((long)psVar25 + 1);
  *(char *)psVar25 = '\0';
  psVar5 = (short *)((long)psVar25 + 3);
  *(short *)puVar10 = (short)uVar13 - (short)uVar12;
  puVar8 = param_7;
  if (puVar16 != puVar4) goto code_r0x0009fd6c;
  goto code_r0x0009ff5c;
code_r0x0009fc04:
  puVar16 = *(ulong **)(unaff_x29 + -0x70);
  if (uVar7 <= uVar13) {
    puVar16 = puVar6;
  }
  puVar23 = (ulong *)(lVar2 + uVar22);
  if ((puVar16 < puVar23) && (*(char *)((long)puVar8 - 1) == *(char *)((long)puVar23 - 1))) {
    puVar4 = (ulong *)((long)puVar8 - 1);
    puVar10 = (ulong *)(lVar2 + uVar22 + -1);
    do {
      puVar23 = puVar10;
      puVar8 = puVar4;
      if ((puVar23 <= puVar16) || (puVar8 <= param_7)) break;
      puVar4 = (ulong *)((long)puVar8 + -1);
      puVar10 = (ulong *)((long)puVar23 + -1);
    } while (*(char *)((long)puVar8 + -1) == *(char *)((long)puVar23 + -1));
  }
  puVar4 = (ulong *)((long)psVar25 + 1);
  uVar11 = (uint)((long)puVar8 - (long)param_7);
  uVar9 = uVar11 - 0xf;
  if (uVar11 < 0xf) {
    *(char *)psVar25 = (char)(uVar11 << 4);
  }
  else {
    *(char *)psVar25 = -0x10;
    puVar10 = puVar4;
    if (0xfe < uVar9) {
      uVar9 = ((int)puVar8 - (int)param_7) - 0x10e;
      uVar20 = (ulong)uVar9 / 0xff;
      _memset(puVar4,0xff,uVar20 + 1);
      uVar7 = *(uint *)(unaff_x29 + -100);
      puVar6 = *(ulong **)(unaff_x29 + -0x60);
      uVar9 = uVar9 + (int)uVar20;
      puVar10 = (ulong *)((long)psVar25 + uVar20 + 2);
    }
    puVar4 = (ulong *)((long)puVar10 + 1);
    *(char *)puVar10 = (char)uVar9;
  }
  puVar10 = (ulong *)((long)puVar4 + ((long)puVar8 - (long)param_7 & 0xffffffffU));
  puVar14 = puVar10;
  if (puVar10 <= puVar4 + 1) {
    puVar14 = puVar4 + 1;
  }
  if (((char *)((long)puVar14 + ~(ulong)puVar4) < &segment_command_00000020.vmaddr) ||
     ((ulong)((long)puVar4 - (long)param_7) < 0x40)) {
code_r0x0009fd3c:
    do {
      puVar14 = puVar4 + 1;
      *puVar4 = *param_7;
      param_7 = param_7 + 1;
      puVar4 = puVar14;
    } while (puVar14 < puVar10);
  }
  else {
    uVar20 = ((long)puVar14 + ~(ulong)puVar4 >> 3) + 1;
    uVar21 = uVar20 & 0x3ffffffffffffff8;
    puVar14 = param_7 + 4;
    puVar15 = puVar4 + 4;
    uVar24 = uVar21;
    do {
      uVar17 = puVar14[-4];
      uVar26 = puVar14[-1];
      uVar22 = puVar14[-2];
      uVar28 = puVar14[1];
      uVar27 = *puVar14;
      uVar30 = puVar14[3];
      uVar29 = puVar14[2];
      puVar15[-3] = puVar14[-3];
      puVar15[-4] = uVar17;
      puVar15[-1] = uVar26;
      puVar15[-2] = uVar22;
      puVar15[1] = uVar28;
      *puVar15 = uVar27;
      puVar15[3] = uVar30;
      puVar15[2] = uVar29;
      uVar24 = uVar24 - 8;
      puVar14 = puVar14 + 8;
      puVar15 = puVar15 + 8;
    } while (uVar24 != 0);
    param_7 = param_7 + uVar21;
    puVar4 = puVar4 + uVar21;
    if (uVar20 != uVar21) goto code_r0x0009fd3c;
  }
  puVar4 = *(ulong **)(unaff_x29 + -0x70);
  psVar5 = (short *)((long)puVar10 + 2);
  *(short *)puVar10 = (short)uVar12 - (short)uVar13;
  param_7 = puVar8;
  if (puVar16 != puVar4) {
code_r0x0009fd6c:
    puVar16 = (ulong *)((long)puVar8 + 4);
    puVar15 = (ulong *)((long)puVar23 + 4);
    puVar14 = puVar16;
    if (puVar16 < param_6) {
      uVar20 = *puVar16 ^ *puVar15;
      if (uVar20 == 0) {
        puVar15 = (ulong *)((long)puVar23 + 0xc);
        puVar14 = (ulong *)((long)puVar8 + 0xc);
        goto joined_r0x0009ff54;
      }
      uVar20 = (uVar20 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar20 & 0x5555555555555555) << 1;
      uVar20 = (uVar20 & 0xcccccccccccccccc) >> 2 | (uVar20 & 0x3333333333333333) << 2;
      uVar20 = (uVar20 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar20 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar20 = (uVar20 & 0xff00ff00ff00ff00) >> 8 | (uVar20 & 0xff00ff00ff00ff) << 8;
      uVar20 = (uVar20 & 0xffff0000ffff0000) >> 0x10 | (uVar20 & 0xffff0000ffff) << 0x10;
      uVar20 = (ulong)LZCOUNT(uVar20 >> 0x20 | uVar20 << 0x20) >> 3;
    }
    else {
joined_r0x0009ff54:
      if (puVar14 < param_6) {
        iVar19 = ((int)puVar14 - (int)puVar8) + -4;
        do {
          uVar20 = *puVar14 ^ *puVar15;
          if (uVar20 != 0) {
            uVar20 = (uVar20 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar20 & 0x5555555555555555) << 1;
            uVar20 = (uVar20 & 0xcccccccccccccccc) >> 2 | (uVar20 & 0x3333333333333333) << 2;
            uVar20 = (uVar20 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar20 & 0xf0f0f0f0f0f0f0f) << 4;
            uVar20 = (uVar20 & 0xff00ff00ff00ff00) >> 8 | (uVar20 & 0xff00ff00ff00ff) << 8;
            uVar20 = (uVar20 & 0xffff0000ffff0000) >> 0x10 | (uVar20 & 0xffff0000ffff) << 0x10;
            uVar20 = (ulong)(uint)((int)((ulong)LZCOUNT(uVar20 >> 0x20 | uVar20 << 0x20) >> 3) +
                                  iVar19);
            goto code_r0x0009fe44;
          }
          puVar14 = puVar14 + 1;
          puVar15 = puVar15 + 1;
          iVar19 = iVar19 + 8;
        } while (puVar14 < param_6);
      }
      if (puVar14 < in_stack_00000020) {
        if ((int)*puVar15 == (int)*puVar14) {
          puVar14 = (ulong *)((long)puVar14 + 4);
          puVar15 = (ulong *)((long)puVar15 + 4);
        }
        if (in_stack_00000018 <= puVar14) goto code_r0x0009fe0c;
code_r0x0009ff20:
        if ((short)*puVar15 == (short)*puVar14) {
          puVar14 = (ulong *)((long)puVar14 + 2);
          puVar15 = (ulong *)((long)puVar15 + 2);
        }
        if (puVar14 < *(ulong **)(unaff_x29 + -0x78)) {
code_r0x0009fe18:
          if ((char)*puVar15 == (char)*puVar14) {
            puVar14 = (ulong *)((long)puVar14 + 1);
          }
        }
      }
      else {
        if (puVar14 < in_stack_00000018) goto code_r0x0009ff20;
code_r0x0009fe0c:
        if (puVar14 < *(ulong **)(unaff_x29 + -0x78)) goto code_r0x0009fe18;
      }
      uVar20 = (ulong)(uint)((int)puVar14 - (int)puVar16);
    }
code_r0x0009fe44:
    cVar3 = (char)*psVar25;
    uVar13 = (uint)uVar20;
    param_7 = (ulong *)((long)puVar8 + uVar20 + 4);
    goto joined_r0x000a01f8;
  }
code_r0x0009ff5c:
  puVar16 = (ulong *)((long)param_7 + (*(long *)(unaff_x29 + -0x80) - (long)puVar23));
  puVar8 = *(ulong **)(unaff_x29 + -0x78);
  if (puVar16 <= *(ulong **)(unaff_x29 + -0x78)) {
    puVar8 = puVar16;
  }
  puVar16 = (ulong *)((long)param_7 + 4);
  puVar15 = (ulong *)((long)puVar23 + 4);
  puVar18 = (ulong *)((long)puVar8 - 7);
  puVar14 = puVar16;
  if (puVar16 < puVar18) {
    uVar20 = *puVar16 ^ *puVar15;
    if (uVar20 == 0) {
      puVar15 = (ulong *)((long)puVar23 + 0xc);
      puVar14 = (ulong *)((long)param_7 + 0xc);
      goto joined_r0x000a0274;
    }
    uVar20 = (uVar20 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar20 & 0x5555555555555555) << 1;
    uVar20 = (uVar20 & 0xcccccccccccccccc) >> 2 | (uVar20 & 0x3333333333333333) << 2;
    uVar20 = (uVar20 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar20 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar20 = (uVar20 & 0xff00ff00ff00ff00) >> 8 | (uVar20 & 0xff00ff00ff00ff) << 8;
    uVar20 = (uVar20 & 0xffff0000ffff0000) >> 0x10 | (uVar20 & 0xffff0000ffff) << 0x10;
    uVar20 = (ulong)LZCOUNT(uVar20 >> 0x20 | uVar20 << 0x20) >> 3;
  }
  else {
joined_r0x000a0274:
    if (puVar14 < puVar18) {
      iVar19 = ((int)puVar14 - (int)param_7) + -4;
      do {
        uVar20 = *puVar14 ^ *puVar15;
        if (uVar20 != 0) {
          uVar20 = (uVar20 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar20 & 0x5555555555555555) << 1;
          uVar20 = (uVar20 & 0xcccccccccccccccc) >> 2 | (uVar20 & 0x3333333333333333) << 2;
          uVar20 = (uVar20 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar20 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar20 = (uVar20 & 0xff00ff00ff00ff00) >> 8 | (uVar20 & 0xff00ff00ff00ff) << 8;
          uVar20 = (uVar20 & 0xffff0000ffff0000) >> 0x10 | (uVar20 & 0xffff0000ffff) << 0x10;
          uVar20 = (ulong)(uint)((int)((ulong)LZCOUNT(uVar20 >> 0x20 | uVar20 << 0x20) >> 3) +
                                iVar19);
          goto code_r0x000a0048;
        }
        puVar14 = puVar14 + 1;
        puVar15 = puVar15 + 1;
        iVar19 = iVar19 + 8;
      } while (puVar14 < puVar18);
    }
    if (puVar14 < (ulong *)((long)puVar8 - 3U)) {
      if ((int)*puVar15 == (int)*puVar14) {
        puVar14 = (ulong *)((long)puVar14 + 4);
        puVar15 = (ulong *)((long)puVar15 + 4);
      }
      if (puVar14 < (ulong *)((long)puVar8 - 1U)) goto code_r0x000a020c;
    }
    else if (puVar14 < (ulong *)((long)puVar8 - 1U)) {
code_r0x000a020c:
      if ((short)*puVar15 == (short)*puVar14) {
        puVar14 = (ulong *)((long)puVar14 + 2);
        puVar15 = (ulong *)((long)puVar15 + 2);
      }
    }
    if (puVar14 < puVar8) {
      if ((char)*puVar15 == (char)*puVar14) {
        puVar14 = (ulong *)((long)puVar14 + 1);
      }
    }
    uVar20 = (ulong)(uint)((int)puVar14 - (int)puVar16);
  }
code_r0x000a0048:
  uVar13 = (uint)uVar20;
  puVar16 = (ulong *)((long)param_7 + uVar20 + 4);
  if (puVar16 != puVar8) {
    cVar3 = (char)*psVar25;
    param_7 = puVar16;
    goto joined_r0x000a01f8;
  }
  puVar16 = puVar8;
  puVar14 = puVar6;
  if (puVar8 < param_6) {
    uVar20 = *puVar8 ^ *puVar6;
    if (uVar20 == 0) {
      puVar16 = puVar8 + 1;
      puVar14 = in_stack_00000080;
      goto code_r0x000a0138;
    }
    uVar20 = (uVar20 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar20 & 0x5555555555555555) << 1;
    uVar20 = (uVar20 & 0xcccccccccccccccc) >> 2 | (uVar20 & 0x3333333333333333) << 2;
    uVar20 = (uVar20 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar20 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar20 = (uVar20 & 0xff00ff00ff00ff00) >> 8 | (uVar20 & 0xff00ff00ff00ff) << 8;
    uVar20 = (uVar20 & 0xffff0000ffff0000) >> 0x10 | (uVar20 & 0xffff0000ffff) << 0x10;
    uVar12 = (uint)((ulong)LZCOUNT(uVar20 >> 0x20 | uVar20 << 0x20) >> 3);
  }
  else {
code_r0x000a0138:
    if (puVar16 < param_6) {
      uVar20 = (long)param_7 + (*(long *)(unaff_x29 + -0x80) - (long)puVar23);
      if (*(ulong *)(unaff_x29 + -0x78) <= uVar20) {
        uVar20 = *(ulong *)(unaff_x29 + -0x78);
      }
      iVar19 = (int)puVar16 - (int)uVar20;
      do {
        uVar20 = *puVar16 ^ *puVar14;
        if (uVar20 != 0) {
          uVar20 = (uVar20 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar20 & 0x5555555555555555) << 1;
          uVar20 = (uVar20 & 0xcccccccccccccccc) >> 2 | (uVar20 & 0x3333333333333333) << 2;
          uVar20 = (uVar20 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar20 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar20 = (uVar20 & 0xff00ff00ff00ff00) >> 8 | (uVar20 & 0xff00ff00ff00ff) << 8;
          uVar20 = (uVar20 & 0xffff0000ffff0000) >> 0x10 | (uVar20 & 0xffff0000ffff) << 0x10;
          uVar12 = (int)((ulong)LZCOUNT(uVar20 >> 0x20 | uVar20 << 0x20) >> 3) + iVar19;
          goto code_r0x000a01e8;
        }
        puVar16 = puVar16 + 1;
        puVar14 = puVar14 + 1;
        iVar19 = iVar19 + 8;
      } while (puVar16 < param_6);
    }
    if (puVar16 < in_stack_00000020) {
      if ((int)*puVar14 == (int)*puVar16) {
        puVar16 = (ulong *)((long)puVar16 + 4);
        puVar14 = (ulong *)((long)puVar14 + 4);
      }
      if (in_stack_00000018 <= puVar16) goto code_r0x000a01b0;
code_r0x000a0240:
      if ((short)*puVar14 == (short)*puVar16) {
        puVar16 = (ulong *)((long)puVar16 + 2);
        puVar14 = (ulong *)((long)puVar14 + 2);
      }
      if (puVar16 < *(ulong **)(unaff_x29 + -0x78)) {
code_r0x000a01bc:
        if ((char)*puVar14 == (char)*puVar16) {
          puVar16 = (ulong *)((long)puVar16 + 1);
        }
      }
    }
    else {
      if (puVar16 < in_stack_00000018) goto code_r0x000a0240;
code_r0x000a01b0:
      if (puVar16 < *(ulong **)(unaff_x29 + -0x78)) goto code_r0x000a01bc;
    }
    uVar12 = (int)puVar16 - (int)puVar8;
  }
code_r0x000a01e8:
  uVar13 = uVar12 + uVar13;
  cVar3 = (char)*psVar25;
  param_7 = (ulong *)((long)puVar8 + (ulong)uVar12);
joined_r0x000a01f8:
  if (0xe < uVar13) goto code_r0x0009fe58;
  *(char *)psVar25 = cVar3 + (char)uVar13;
  psVar25 = psVar5;
  goto joined_r0x0009ff0c;
code_r0x0009fe58:
  uVar12 = uVar13 - 0xf;
  *(char *)psVar25 = cVar3 + '\x0f';
  psVar5[0] = -1;
  psVar5[1] = -1;
  if (0x3fb < uVar12) goto code_r0x0009fe70;
  goto code_r0x0009feec;
code_r0x0009fe70:
  unaff_x24 = (short *)((long)puVar10 + 6);
  unaff_w22 = uVar13 - 0x40b;
  unaff_x25 = (ulong)unaff_w22 / 0x3fc;
  unaff_x26 = (ulong)(unaff_w22 / 0x3fc << 2);
  param_3 = unaff_x26 + 4;
  goto code_r0x0009fe90;
}

