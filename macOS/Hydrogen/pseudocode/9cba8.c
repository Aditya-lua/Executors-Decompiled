
int FUN_0009cba8(ulong *param_1,ulong *param_2,long param_3,uint param_4,char *param_5,
                ulong *param_6,ulong *param_7,long param_8,undefined8 param_9,undefined8 param_10,
                long param_11,ulong *param_12,ulong *param_13)

{
  char *pcVar1;
  uint uVar2;
  uint in_w8;
  ulong uVar3;
  ulong uVar4;
  ulong *puVar5;
  uint uVar6;
  uint uVar7;
  ulong in_x11;
  ulong *puVar8;
  ulong uVar9;
  ulong *puVar10;
  ulong *puVar11;
  ulong *puVar12;
  ulong *puVar13;
  ulong *in_x16;
  uint unaff_w19;
  ulong unaff_x20;
  long unaff_x21;
  ulong *unaff_x22;
  ulong *unaff_x23;
  ulong *unaff_x24;
  ulong *unaff_x25;
  short *unaff_x26;
  short *psVar14;
  long lVar15;
  int iVar16;
  undefined4 uVar17;
  long unaff_x27;
  int unaff_w28;
  long unaff_x29;
  uint unaff_w30;
  ulong uVar18;
  ulong uVar19;
  ulong uVar20;
  ulong uVar21;
  ulong uVar22;
  ulong uVar23;
  ulong uVar24;
  long in_stack_00000060;
  ulong *in_stack_00000068;
  uint in_stack_00000070;
  int in_stack_00000078;
  undefined8 in_stack_00000080;
  long in_stack_00000088;
  ulong *in_stack_00000090;
  
code_r0x0009cba8:
  puVar5 = param_1;
  if (0xfe < in_w8) {
    uVar6 = ((int)unaff_x23 - (int)in_x16) - 0x10e;
    uVar3 = (ulong)uVar6 * (ulong)unaff_w30;
    uVar4 = uVar3 >> 0x27;
    _memset(param_1,0xff,uVar4 + 1);
    unaff_w30 = 0x80808081;
    unaff_w28 = 0xffff;
    param_5 = *(char **)(unaff_x29 + -0x88);
    param_3 = -0x30e4432345000000;
    param_2 = *(ulong **)(unaff_x29 + -0x60);
    in_w8 = uVar6 + (uint)(uVar3 >> 0x27);
    puVar5 = (ulong *)((long)unaff_x26 + uVar4 + 2);
  }
  param_1 = (ulong *)((long)puVar5 + 1);
  *(char *)puVar5 = (char)in_w8;
LAB_0009cc3c:
  puVar5 = (ulong *)((long)param_1 + in_x11);
  puVar12 = puVar5;
  if (puVar5 <= param_1 + 1) {
    puVar12 = param_1 + 1;
  }
  if ((&segment_command_00000020.vmaddr <= (char *)((long)puVar12 + ~(ulong)param_1)) &&
     (0x3f < (ulong)((long)param_1 - (long)in_x16))) {
    uVar3 = ((long)puVar12 + ~(ulong)param_1 >> 3) + 1;
    uVar9 = uVar3 & 0x3ffffffffffffff8;
    puVar12 = in_x16 + 4;
    puVar8 = param_1 + 4;
    uVar4 = uVar9;
    do {
      uVar18 = puVar12[-4];
      uVar20 = puVar12[-1];
      uVar19 = puVar12[-2];
      uVar22 = puVar12[1];
      uVar21 = *puVar12;
      uVar24 = puVar12[3];
      uVar23 = puVar12[2];
      puVar8[-3] = puVar12[-3];
      puVar8[-4] = uVar18;
      puVar8[-1] = uVar20;
      puVar8[-2] = uVar19;
      puVar8[1] = uVar22;
      *puVar8 = uVar21;
      puVar8[3] = uVar24;
      puVar8[2] = uVar23;
      uVar4 = uVar4 - 8;
      puVar12 = puVar12 + 8;
      puVar8 = puVar8 + 8;
    } while (uVar4 != 0);
    in_x16 = in_x16 + uVar9;
    param_1 = param_1 + uVar9;
    if (uVar3 == uVar9) goto code_r0x0009ccc8;
  }
  do {
    puVar12 = param_1 + 1;
    *param_1 = *in_x16;
    in_x16 = in_x16 + 1;
    param_1 = puVar12;
  } while (puVar12 < puVar5);
code_r0x0009ccc8:
  psVar14 = (short *)((long)puVar5 + 2);
  *(short *)puVar5 = (short)unaff_w19 - (short)unaff_x20;
  in_x16 = unaff_x23;
  if (unaff_x22 == param_6) goto code_r0x0009ce28;
  do {
    puVar12 = (ulong *)((long)in_x16 + 4);
    puVar10 = (ulong *)((long)unaff_x24 + 4);
    puVar8 = puVar12;
    if (puVar12 < unaff_x25) {
      uVar3 = *puVar12 ^ *puVar10;
      if (uVar3 == 0) {
        puVar10 = (ulong *)((long)unaff_x24 + 0xc);
        puVar8 = (ulong *)((long)in_x16 + 0xc);
        goto joined_r0x0009ce20;
      }
      uVar3 = (uVar3 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar3 & 0x5555555555555555) << 1;
      uVar3 = (uVar3 & 0xcccccccccccccccc) >> 2 | (uVar3 & 0x3333333333333333) << 2;
      uVar3 = (uVar3 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar3 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar3 = (uVar3 & 0xff00ff00ff00ff00) >> 8 | (uVar3 & 0xff00ff00ff00ff) << 8;
      uVar3 = (uVar3 & 0xffff0000ffff0000) >> 0x10 | (uVar3 & 0xffff0000ffff) << 0x10;
      uVar3 = (ulong)LZCOUNT(uVar3 >> 0x20 | uVar3 << 0x20) >> 3;
    }
    else {
joined_r0x0009ce20:
      if (puVar8 < unaff_x25) {
        iVar16 = ((int)puVar8 - (int)in_x16) + -4;
        do {
          uVar3 = *puVar8 ^ *puVar10;
          if (uVar3 != 0) {
            uVar3 = (uVar3 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar3 & 0x5555555555555555) << 1;
            uVar3 = (uVar3 & 0xcccccccccccccccc) >> 2 | (uVar3 & 0x3333333333333333) << 2;
            uVar3 = (uVar3 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar3 & 0xf0f0f0f0f0f0f0f) << 4;
            uVar3 = (uVar3 & 0xff00ff00ff00ff00) >> 8 | (uVar3 & 0xff00ff00ff00ff) << 8;
            uVar3 = (uVar3 & 0xffff0000ffff0000) >> 0x10 | (uVar3 & 0xffff0000ffff) << 0x10;
            uVar3 = (ulong)(uint)((int)((ulong)LZCOUNT(uVar3 >> 0x20 | uVar3 << 0x20) >> 3) + iVar16
                                 );
            goto code_r0x0009cdbc;
          }
          puVar8 = puVar8 + 1;
          puVar10 = puVar10 + 1;
          iVar16 = iVar16 + 8;
        } while (puVar8 < unaff_x25);
      }
      if (puVar8 < param_13) {
        if ((int)*puVar10 == (int)*puVar8) {
          puVar8 = (ulong *)((long)puVar8 + 4);
          puVar10 = (ulong *)((long)puVar10 + 4);
        }
        if (puVar8 < param_12) goto code_r0x0009cdec;
code_r0x0009cd84:
        if (puVar8 < *(ulong **)(unaff_x29 + -0x78)) {
code_r0x0009cd90:
          if ((char)*puVar10 == (char)*puVar8) {
            puVar8 = (ulong *)((long)puVar8 + 1);
          }
        }
      }
      else {
        if (param_12 <= puVar8) goto code_r0x0009cd84;
code_r0x0009cdec:
        if ((short)*puVar10 == (short)*puVar8) {
          puVar8 = (ulong *)((long)puVar8 + 2);
          puVar10 = (ulong *)((long)puVar10 + 2);
        }
        if (puVar8 < *(ulong **)(unaff_x29 + -0x78)) goto code_r0x0009cd90;
      }
      uVar3 = (ulong)(uint)((int)puVar8 - (int)puVar12);
    }
code_r0x0009cdbc:
    in_x16 = (ulong *)((long)in_x16 + uVar3 + 4);
    if (param_5 < (char *)((long)puVar5 +
                          ((ulong)((int)uVar3 + 0xf0) * (ulong)unaff_w30 >> 0x27) + 8))
    goto code_r0x0009d2b8;
    while( true ) {
      uVar7 = (uint)uVar3;
      uVar6 = uVar7 - 0xf;
      if (uVar7 < 0xf) {
        *(char *)unaff_x26 = (char)*unaff_x26 + (char)uVar3;
        unaff_x26 = psVar14;
      }
      else {
        *(char *)unaff_x26 = (char)*unaff_x26 + '\x0f';
        psVar14[0] = -1;
        psVar14[1] = -1;
        if (0x3fb < uVar6) {
          uVar6 = (uint)((ulong)(uVar7 - 0x40b) * (ulong)unaff_w30 >> 0x29);
          uVar3 = (ulong)(uVar6 << 2);
          _memset((short *)((long)puVar5 + 6),0xff,uVar3 + 4);
          unaff_w30 = 0x80808081;
          unaff_w28 = 0xffff;
          param_5 = *(char **)(unaff_x29 + -0x88);
          param_3 = -0x30e4432345000000;
          param_2 = *(ulong **)(unaff_x29 + -0x60);
          uVar6 = (uVar7 - 0x40b) + uVar6 * -0x3fc;
          psVar14 = (short *)((long)puVar5 + 6 + uVar3);
          unaff_x25 = in_stack_00000090;
          unaff_x27 = in_stack_00000088;
        }
        uVar7 = (uVar6 & 0xffff) / 0xff;
        pcVar1 = (char *)((long)psVar14 + (ulong)uVar7);
        unaff_x26 = (short *)(pcVar1 + 1);
        *pcVar1 = (char)uVar6 + (char)uVar7;
      }
      if (param_7 <= in_x16) goto code_r0x0009d28c;
      iVar16 = (int)unaff_x27;
      *(int *)(unaff_x21 + ((ulong)(*(long *)((long)in_x16 + -2) * param_3) >> 0x32 & 0x3ffc)) =
           (int)(long *)((long)in_x16 + -2) - iVar16;
      uVar7 = (int)in_x16 - iVar16;
      uVar3 = *in_x16 * param_3 >> 0x32 & 0x3ffc;
      uVar6 = *(uint *)(unaff_x21 + uVar3);
      puVar12 = param_6;
      lVar15 = param_8;
      if (param_4 <= uVar6) {
        puVar12 = param_2;
        lVar15 = unaff_x27;
      }
      *(uint *)(unaff_x21 + uVar3) = uVar7;
      if ((uVar6 + unaff_w28 < uVar7) ||
         (unaff_x24 = (ulong *)(lVar15 + (ulong)uVar6), (int)*unaff_x24 != (int)*in_x16)) {
        unaff_w19 = (int)(ulong *)((long)in_x16 + 1U) - iVar16;
        if (param_7 < (ulong *)((long)in_x16 + 2U)) goto code_r0x0009d28c;
        uVar3 = *(ulong *)((long)in_x16 + 1);
        puVar5 = (ulong *)((long)in_x16 + 2U);
        unaff_x23 = (ulong *)((long)in_x16 + 1U);
        uVar7 = in_stack_00000080._4_4_;
        uVar6 = in_stack_00000070;
        goto code_r0x0009cb10;
      }
      puVar5 = (ulong *)((long)unaff_x26 + 1);
      *(char *)unaff_x26 = '\0';
      psVar14 = (short *)((long)unaff_x26 + 3);
      *(short *)puVar5 = (short)uVar7 - (short)uVar6;
      if (puVar12 != param_6) break;
code_r0x0009ce28:
      puVar12 = (ulong *)((long)in_x16 + (*(long *)(unaff_x29 + -0x80) - (long)unaff_x24));
      puVar8 = *(ulong **)(unaff_x29 + -0x78);
      if (puVar12 <= *(ulong **)(unaff_x29 + -0x78)) {
        puVar8 = puVar12;
      }
      puVar12 = (ulong *)((long)in_x16 + 4);
      puVar10 = (ulong *)((long)unaff_x24 + 4);
      puVar13 = (ulong *)((long)puVar8 - 7);
      if (puVar12 < puVar13) {
        uVar3 = *puVar12 ^ *puVar10;
        if (uVar3 == 0) {
          puVar11 = (ulong *)((long)in_x16 + 0xc);
          puVar10 = (ulong *)((long)unaff_x24 + 0xc);
          if (puVar11 < puVar13) goto code_r0x0009ce80;
          goto code_r0x0009d204;
        }
        uVar3 = (uVar3 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar3 & 0x5555555555555555) << 1;
        uVar3 = (uVar3 & 0xcccccccccccccccc) >> 2 | (uVar3 & 0x3333333333333333) << 2;
        uVar3 = (uVar3 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar3 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar3 = (uVar3 & 0xff00ff00ff00ff00) >> 8 | (uVar3 & 0xff00ff00ff00ff) << 8;
        uVar3 = (uVar3 & 0xffff0000ffff0000) >> 0x10 | (uVar3 & 0xffff0000ffff) << 0x10;
        uVar3 = (ulong)LZCOUNT(uVar3 >> 0x20 | uVar3 << 0x20) >> 3;
      }
      else {
        puVar11 = puVar12;
        if (puVar12 < puVar13) {
code_r0x0009ce80:
          iVar16 = ((int)puVar11 - (int)in_x16) + -4;
          do {
            uVar3 = *puVar11 ^ *puVar10;
            if (uVar3 != 0) {
              uVar3 = (uVar3 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar3 & 0x5555555555555555) << 1;
              uVar3 = (uVar3 & 0xcccccccccccccccc) >> 2 | (uVar3 & 0x3333333333333333) << 2;
              uVar3 = (uVar3 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar3 & 0xf0f0f0f0f0f0f0f) << 4;
              uVar3 = (uVar3 & 0xff00ff00ff00ff00) >> 8 | (uVar3 & 0xff00ff00ff00ff) << 8;
              uVar3 = (uVar3 & 0xffff0000ffff0000) >> 0x10 | (uVar3 & 0xffff0000ffff) << 0x10;
              uVar3 = (ulong)(uint)((int)((ulong)LZCOUNT(uVar3 >> 0x20 | uVar3 << 0x20) >> 3) +
                                   iVar16);
              goto code_r0x0009cf20;
            }
            puVar11 = puVar11 + 1;
            puVar10 = puVar10 + 1;
            iVar16 = iVar16 + 8;
          } while (puVar11 < puVar13);
          if ((ulong *)((long)puVar8 - 3U) <= puVar11) goto code_r0x0009d214;
code_r0x0009cebc:
          if ((int)*puVar10 == (int)*puVar11) {
            puVar11 = (ulong *)((long)puVar11 + 4);
            puVar10 = (ulong *)((long)puVar10 + 4);
          }
          if (puVar11 < (ulong *)((long)puVar8 - 1U)) {
code_r0x0009d220:
            if ((short)*puVar10 == (short)*puVar11) {
              puVar11 = (ulong *)((long)puVar11 + 2);
              puVar10 = (ulong *)((long)puVar10 + 2);
            }
          }
        }
        else {
code_r0x0009d204:
          if (puVar11 < (ulong *)((long)puVar8 - 3U)) goto code_r0x0009cebc;
code_r0x0009d214:
          if (puVar11 < (ulong *)((long)puVar8 - 1U)) goto code_r0x0009d220;
        }
        if (puVar11 < puVar8) {
          if ((char)*puVar10 == (char)*puVar11) {
            puVar11 = (ulong *)((long)puVar11 + 1);
          }
        }
        uVar3 = (ulong)(uint)((int)puVar11 - (int)puVar12);
      }
code_r0x0009cf20:
      puVar12 = (ulong *)((long)in_x16 + uVar3 + 4);
      if (puVar12 == puVar8) {
        puVar12 = puVar8;
        puVar10 = param_2;
        if (puVar8 < unaff_x25) {
          uVar4 = *puVar8 ^ *param_2;
          if (uVar4 == 0) {
            puVar12 = puVar8 + 1;
            puVar10 = in_stack_00000068;
            goto code_r0x0009cf88;
          }
          uVar4 = (uVar4 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar4 & 0x5555555555555555) << 1;
          uVar4 = (uVar4 & 0xcccccccccccccccc) >> 2 | (uVar4 & 0x3333333333333333) << 2;
          uVar4 = (uVar4 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar4 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar4 = (uVar4 & 0xff00ff00ff00ff00) >> 8 | (uVar4 & 0xff00ff00ff00ff) << 8;
          uVar4 = (uVar4 & 0xffff0000ffff0000) >> 0x10 | (uVar4 & 0xffff0000ffff) << 0x10;
          uVar6 = (uint)((ulong)LZCOUNT(uVar4 >> 0x20 | uVar4 << 0x20) >> 3);
        }
        else {
code_r0x0009cf88:
          if (puVar12 < unaff_x25) {
            uVar4 = (long)in_x16 + (*(long *)(unaff_x29 + -0x80) - (long)unaff_x24);
            if (*(ulong *)(unaff_x29 + -0x78) <= uVar4) {
              uVar4 = *(ulong *)(unaff_x29 + -0x78);
            }
            iVar16 = (int)puVar12 - (int)uVar4;
            do {
              uVar4 = *puVar12 ^ *puVar10;
              if (uVar4 != 0) {
                uVar4 = (uVar4 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar4 & 0x5555555555555555) << 1;
                uVar4 = (uVar4 & 0xcccccccccccccccc) >> 2 | (uVar4 & 0x3333333333333333) << 2;
                uVar4 = (uVar4 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar4 & 0xf0f0f0f0f0f0f0f) << 4;
                uVar4 = (uVar4 & 0xff00ff00ff00ff00) >> 8 | (uVar4 & 0xff00ff00ff00ff) << 8;
                uVar4 = (uVar4 & 0xffff0000ffff0000) >> 0x10 | (uVar4 & 0xffff0000ffff) << 0x10;
                uVar6 = (int)((ulong)LZCOUNT(uVar4 >> 0x20 | uVar4 << 0x20) >> 3) + iVar16;
                goto code_r0x0009d038;
              }
              puVar12 = puVar12 + 1;
              puVar10 = puVar10 + 1;
              iVar16 = iVar16 + 8;
            } while (puVar12 < unaff_x25);
          }
          if (puVar12 < param_13) {
            if ((int)*puVar10 == (int)*puVar12) {
              puVar12 = (ulong *)((long)puVar12 + 4);
              puVar10 = (ulong *)((long)puVar10 + 4);
            }
            if (puVar12 < param_12) goto code_r0x0009d1cc;
code_r0x0009d000:
            if (puVar12 < *(ulong **)(unaff_x29 + -0x78)) {
code_r0x0009d00c:
              if ((char)*puVar10 == (char)*puVar12) {
                puVar12 = (ulong *)((long)puVar12 + 1);
              }
            }
          }
          else {
            if (param_12 <= puVar12) goto code_r0x0009d000;
code_r0x0009d1cc:
            if ((short)*puVar10 == (short)*puVar12) {
              puVar12 = (ulong *)((long)puVar12 + 2);
              puVar10 = (ulong *)((long)puVar10 + 2);
            }
            if (puVar12 < *(ulong **)(unaff_x29 + -0x78)) goto code_r0x0009d00c;
          }
          uVar6 = (int)puVar12 - (int)puVar8;
        }
code_r0x0009d038:
        uVar7 = uVar6 + (int)uVar3;
        uVar3 = (ulong)uVar7;
        uVar4 = (ulong)(uVar7 + 0xf0) * (ulong)unaff_w30;
        in_x16 = (ulong *)((long)puVar8 + (ulong)uVar6);
      }
      else {
        uVar4 = (ulong)((int)uVar3 + 0xf0) * (ulong)unaff_w30;
        in_x16 = puVar12;
      }
      if (param_5 < (char *)((long)puVar5 + (uVar4 >> 0x27) + 8)) goto code_r0x0009d2b8;
    }
  } while( true );
code_r0x0009cb10:
  puVar12 = puVar5;
  uVar4 = uVar3 * param_3 >> 0x32 & 0x3ffc;
  uVar2 = *(uint *)(unaff_x21 + uVar4);
  unaff_x20 = (ulong)uVar2;
  uVar3 = *puVar12;
  *(uint *)(unaff_x21 + uVar4) = unaff_w19;
  if (unaff_w19 <= uVar2 + unaff_w28) {
    lVar15 = param_8;
    if (param_4 <= uVar2) {
      lVar15 = unaff_x27;
    }
    if (*(int *)(lVar15 + unaff_x20) == (int)*unaff_x23) goto code_r0x0009cb50;
  }
  unaff_w19 = (int)puVar12 - iVar16;
  uVar4 = (ulong)uVar7;
  uVar7 = uVar6 >> 6;
  uVar6 = uVar6 + 1;
  puVar5 = (ulong *)((long)puVar12 + uVar4);
  unaff_x23 = puVar12;
  if (param_7 < (ulong *)((long)puVar12 + uVar4)) goto code_r0x0009d28c;
  goto code_r0x0009cb10;
code_r0x0009cb50:
  unaff_x22 = param_6;
  if (param_4 <= uVar2) {
    unaff_x22 = param_2;
  }
  unaff_x24 = (ulong *)(lVar15 + unaff_x20);
  if ((unaff_x22 < unaff_x24) && (*(char *)((long)unaff_x23 - 1) == *(char *)((long)unaff_x24 - 1)))
  {
    puVar5 = (ulong *)((long)unaff_x23 - 1);
    puVar12 = (ulong *)(lVar15 + unaff_x20 + -1);
    do {
      unaff_x24 = puVar12;
      unaff_x23 = puVar5;
      if ((unaff_x24 <= unaff_x22) || (unaff_x23 <= in_x16)) break;
      puVar5 = (ulong *)((long)unaff_x23 + -1);
      puVar12 = (ulong *)((long)unaff_x24 + -1);
    } while (*(char *)((long)unaff_x23 + -1) == *(char *)((long)unaff_x24 + -1));
  }
  param_1 = (ulong *)((long)unaff_x26 + 1);
  in_x11 = (long)unaff_x23 - (long)in_x16 & 0xffffffff;
  if ((char *)((long)param_1 + (in_x11 * unaff_w30 >> 0x27) + in_x11 + 8) <= param_5) {
    uVar6 = (uint)((long)unaff_x23 - (long)in_x16);
    in_w8 = uVar6 - 0xf;
    if (0xe < uVar6) goto code_r0x0009cba0;
    *(char *)unaff_x26 = (char)(uVar6 << 4);
    goto LAB_0009cc3c;
  }
  goto code_r0x0009d2b8;
code_r0x0009cba0:
  *(char *)unaff_x26 = -0x10;
  goto code_r0x0009cba8;
code_r0x0009d28c:
  uVar3 = in_stack_00000060 - (long)in_x16;
  if ((char *)((long)unaff_x26 + (uVar3 + 0xf0) / 0xff + uVar3 + 1) <= param_5) {
    uVar4 = uVar3 - 0xf;
    if (uVar3 < 0xf) {
      *(char *)unaff_x26 = (char)((int)uVar3 << 4);
      uVar17 = *(undefined4 *)(unaff_x29 + -0x70);
    }
    else {
      psVar14 = (short *)((long)unaff_x26 + 1);
      *(char *)unaff_x26 = -0x10;
      if (0xfe < uVar4) {
        uVar4 = (long)param_2 + (param_11 - (long)in_x16) + -0x10e;
        uVar9 = uVar4 / 0xff;
        _memset(psVar14,0xff,uVar9 + 1);
        uVar4 = uVar4 % 0xff;
        psVar14 = (short *)((long)unaff_x26 + uVar9 + 2);
      }
      uVar17 = *(undefined4 *)(unaff_x29 + -0x70);
      *(char *)psVar14 = (char)uVar4;
      unaff_x26 = psVar14;
    }
    _memcpy((char *)((long)unaff_x26 + 1),in_x16,uVar3);
    in_stack_00000078 = ((int)(char *)((long)unaff_x26 + 1) + (int)uVar3) - in_stack_00000078;
    lVar15 = *(long *)(unaff_x29 + -0x68);
    param_2 = *(ulong **)(unaff_x29 + -0x60);
    goto LAB_0009f8a0;
  }
code_r0x0009d2b8:
  in_stack_00000078 = 0;
  uVar17 = *(undefined4 *)(unaff_x29 + -0x70);
  lVar15 = *(long *)(unaff_x29 + -0x68);
LAB_0009f8a0:
  *(ulong **)(unaff_x21 + 0x4000) = param_2;
  *(undefined4 *)(lVar15 + 8) = uVar17;
  return in_stack_00000078;
}

