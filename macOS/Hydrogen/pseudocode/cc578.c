
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_000cc578(float param_1,float param_2,float param_3)

{
  char *pcVar1;
  uint *puVar2;
  undefined4 *puVar3;
  undefined4 uVar4;
  uint uVar5;
  char cVar6;
  byte bVar7;
  bool bVar8;
  int iVar9;
  char *pcVar10;
  long *plVar11;
  byte bVar12;
  uint uVar13;
  long *unaff_x20;
  long lVar14;
  long unaff_x22;
  long lVar15;
  uint unaff_w24;
  long unaff_x29;
  float fVar16;
  float fVar17;
  float fVar18;
  int iVar20;
  undefined8 uVar19;
  float fVar21;
  float fVar22;
  ulong uVar23;
  float fVar24;
  float fVar25;
  float unaff_s9;
  float fVar26;
  float fVar27;
  undefined1 auVar28 [16];
  char *in_stack_00000160;
  undefined1 *in_stack_00000168;
  int *in_stack_00000178;
  long in_stack_00000188;
  long in_stack_00000190;
  undefined8 in_stack_00000198;
  int iStack00000000000001a0;
  int iStack00000000000001a4;
  undefined4 *in_stack_000001a8;
  undefined8 in_stack_000001b0;
  long in_stack_000001b8;
  float fStack00000000000001c0;
  float fStack00000000000001c4;
  float fStack00000000000001c8;
  float fStack00000000000001cc;
  
  iVar9 = *(int *)(&UNK_00003910 + unaff_x22);
  param_3 = param_3 - param_2;
  puVar2 = (uint *)(&UNK_0000497c + unaff_x22);
  uVar13 = *puVar2;
  *puVar2 = uVar13 | 0x10;
  *(undefined4 *)(unaff_x20 + 0x2d) = 1;
  fVar26 = *(float *)(&UNK_00003924 + unaff_x22);
  fVar27 = *(float *)(&UNK_00003d38 + unaff_x22);
  *(undefined8 *)(unaff_x29 + -0xc0) = 0;
  *(undefined8 *)(unaff_x29 + -0xb8) = 0;
  fVar24 = fVar26;
  if (in_stack_00000168 != (undefined1 *)0x0) {
    fVar24 = *(float *)(&UNK_00003928 + unaff_x22);
    *(float *)(unaff_x29 + -0xb8) = (param_3 - fVar26) - fVar27;
    *(float *)(unaff_x29 + -0xb4) = fStack00000000000001c4 + fVar24;
    fVar24 = fVar26 + fVar27 + *(float *)(&UNK_0000393c + unaff_x22);
  }
  param_1 = param_1 + param_2;
  if (iVar9 != -1) {
    if (*(int *)(&UNK_00003910 + unaff_x22) == 0) {
      fVar21 = *(float *)(&UNK_00003928 + unaff_x22);
      *(float *)(unaff_x29 + -0xc0) = param_1 + fVar26;
      *(float *)(unaff_x29 + -0xbc) = fStack00000000000001c4 + fVar21;
      fVar26 = fVar26 + fVar27 + *(float *)(&UNK_0000393c + unaff_x22);
    }
    else if (*(int *)(&UNK_00003910 + unaff_x22) == 1) {
      fVar21 = *(float *)(&UNK_00003928 + unaff_x22);
      *(float *)(unaff_x29 + -0xc0) = (param_3 - fVar24) - fVar27;
      *(float *)(unaff_x29 + -0xbc) = fStack00000000000001c4 + fVar21;
      fVar24 = fVar24 + fVar27 + *(float *)(&UNK_0000393c + unaff_x22);
    }
    uVar5 = *(uint *)(unaff_x20[0x21] + (long)(int)unaff_x20[0x20] * 4 + -4);
    uVar5 = *(uint *)(&UNK_0080c404 + ((ulong)uVar5 & 0xff ^ 0xdc) * 4) ^ ~uVar5 >> 8;
    uVar5 = *(uint *)(&UNK_0080c404 + (ulong)(uVar5 & 0xff ^ 0x43) * 4) ^ uVar5 >> 8;
    uVar5 = *(uint *)(&UNK_0080c404 + (ulong)(uVar5 & 0xff ^ 0x4f) * 4) ^ uVar5 >> 8;
    uVar5 = *(uint *)(&UNK_0080c404 + (ulong)(uVar5 & 0xff ^ 0x4c) * 4) ^ uVar5 >> 8;
    uVar5 = *(uint *)(&UNK_0080c404 + (ulong)(uVar5 & 0xff ^ 0x4c) * 4) ^ uVar5 >> 8;
    uVar5 = *(uint *)(&UNK_0080c404 + (ulong)(uVar5 & 0xff ^ 0x41) * 4) ^ uVar5 >> 8;
    uVar5 = *(uint *)(&UNK_0080c404 + (ulong)(uVar5 & 0xff ^ 0x50) * 4) ^ uVar5 >> 8;
    uVar5 = *(uint *)(&UNK_0080c404 + (ulong)(uVar5 & 0xff ^ 0x53) * 4) ^ uVar5 >> 8;
    uVar5 = *(uint *)(&UNK_0080c404 + (ulong)(uVar5 & 0xff ^ 0x45) * 4) ^ uVar5 >> 8 ^ 0xffffffff;
    if (*(uint *)(&UNK_0000404c + *unaff_x20) == uVar5) {
      func_0x000c167c(uVar5,0xb,"#COLLAPSE",0);
    }
    iVar9 = func_0x0010c3ec(uVar5,unaff_x29 + -0xc0);
    if (iVar9 != 0) {
      *(undefined1 *)((long)unaff_x20 + 0xc2) = 1;
    }
  }
  if (in_stack_00000168 != (undefined1 *)0x0) {
    uVar5 = *(uint *)(unaff_x20[0x21] + (long)(int)unaff_x20[0x20] * 4 + -4);
    uVar5 = *(uint *)(&UNK_0080c404 + ((ulong)uVar5 & 0xff ^ 0xdc) * 4) ^ ~uVar5 >> 8;
    uVar5 = *(uint *)(&UNK_0080c404 + (ulong)(uVar5 & 0xff ^ 0x43) * 4) ^ uVar5 >> 8;
    uVar5 = *(uint *)(&UNK_0080c404 + (ulong)(uVar5 & 0xff ^ 0x4c) * 4) ^ uVar5 >> 8;
    uVar5 = *(uint *)(&UNK_0080c404 + (ulong)(uVar5 & 0xff ^ 0x4f) * 4) ^ uVar5 >> 8;
    uVar5 = *(uint *)(&UNK_0080c404 + (ulong)(uVar5 & 0xff ^ 0x53) * 4) ^ uVar5 >> 8;
    uVar5 = *(uint *)(&UNK_0080c404 + (ulong)(uVar5 & 0xff ^ 0x45) * 4) ^ uVar5 >> 8 ^ 0xffffffff;
    if (*(uint *)(&UNK_0000404c + *unaff_x20) == uVar5) {
      func_0x000c167c(uVar5,0xb,"#CLOSE",0);
    }
    iVar9 = func_0x0010c1d4(uVar5,unaff_x29 + -0xb8);
    if (iVar9 != 0) {
      *in_stack_00000168 = 0;
    }
  }
  *(undefined4 *)(unaff_x20 + 0x2d) = 0;
  *puVar2 = uVar13;
  fVar22 = 0.0;
  fVar21 = 0.0;
  if ((unaff_w24 & 0x40000) != 0) {
    fVar21 = fVar27 * 0.8;
  }
  if (in_stack_00000160 == (char *)0xffffffffffffffff) {
    fVar16 = *(float *)(&UNK_00003d38 + lRam0000000000a334c0);
  }
  else {
    pcVar10 = in_stack_00000160;
    do {
      if (*pcVar10 == '#') {
        if (pcVar10[1] == '#') break;
      }
      else if (*pcVar10 == '\0') break;
      pcVar1 = pcVar10 + 1;
      bVar8 = pcVar10 != (char *)0xfffffffffffffffe;
      pcVar10 = pcVar1;
    } while (bVar8);
    fVar16 = *(float *)(&UNK_00003d38 + lRam0000000000a334c0);
    if (pcVar10 == in_stack_00000160) {
      fVar22 = 0.0;
    }
    else {
      fVar22 = 3.4028235e+38;
      fVar17 = (float)func_0x00106300(fVar16,0x7f7fffff,0xbf800000,
                                      *(undefined8 *)(&UNK_00003d30 + lRam0000000000a334c0),
                                      in_stack_00000160,pcVar10,0);
      fVar16 = fVar22;
      fVar22 = (float)(int)(fVar17 + 0.99999);
    }
  }
  fVar21 = fVar21 + fVar22;
  *(float *)(unaff_x29 + -200) = fVar21;
  *(float *)(unaff_x29 + -0xc4) = fVar16 + 0.0;
  fVar22 = *(float *)(&UNK_00003924 + unaff_x22);
  if (fVar26 <= fVar22) {
    if (fVar24 <= fVar22) goto code_r0x000cc994;
code_r0x000ccc3c:
    fVar24 = fVar24 + *(float *)(&UNK_0000393c + unaff_x22);
    fVar22 = *(float *)(&UNK_00003908 + unaff_x22);
    bVar8 = false;
    if ((0.0 < fVar22) && (bVar8 = false, !NAN(fVar22))) {
      bVar8 = fVar22 < 1.0;
    }
    if (bVar8) {
code_r0x000cc9a8:
      fVar17 = ABS(fVar22 + -0.5) * -2.0 + 1.0;
      fVar16 = 1.0;
      if (fVar17 <= 1.0) {
        fVar16 = fVar17;
      }
      fVar25 = 0.0;
      if (0.0 <= fVar17) {
        fVar25 = fVar16;
      }
      fVar16 = fVar26;
      if (fVar26 < fVar24) {
        fVar16 = fVar24;
      }
      fVar17 = (((param_3 - param_1) - fVar26) - fVar24) - fVar21;
      if (fVar17 <= fVar16) {
        fVar16 = fVar17;
      }
      fVar16 = fVar16 * fVar25;
      if (fVar26 < fVar16) {
        fVar26 = fVar16;
      }
      if (fVar24 < fVar16) {
        fVar24 = fVar16;
      }
    }
  }
  else {
    fVar26 = fVar26 + *(float *)(&UNK_0000393c + unaff_x22);
    if (fVar22 < fVar24) goto code_r0x000ccc3c;
code_r0x000cc994:
    fVar22 = *(float *)(&UNK_00003908 + unaff_x22);
    bVar8 = false;
    if ((0.0 < fVar22) && (bVar8 = false, !NAN(fVar22))) {
      bVar8 = fVar22 < 1.0;
    }
    if (bVar8) goto code_r0x000cc9a8;
  }
  param_1 = param_1 + fVar26;
  fVar24 = param_3 - fVar24;
  *(float *)(unaff_x29 + -0xd8) = param_1;
  *(float *)(unaff_x29 + -0xd4) = fStack00000000000001c4;
  *(float *)(unaff_x29 + -0xd0) = fVar24;
  *(float *)(unaff_x29 + -0xcc) = unaff_s9;
  fVar26 = fVar24 + *(float *)(&UNK_0000393c + unaff_x22);
  if (param_3 <= fVar24 + *(float *)(&UNK_0000393c + unaff_x22)) {
    fVar26 = param_3;
  }
  *(float *)(unaff_x29 + -0xe8) = param_1;
  *(float *)(unaff_x29 + -0xe4) = fStack00000000000001c4;
  *(float *)(unaff_x29 + -0xe0) = fVar26;
  *(float *)(unaff_x29 + -0xdc) = unaff_s9;
  if ((unaff_w24 >> 0x12 & 1) != 0) {
    fVar21 = fVar21 + param_1 + fVar22 * ((fVar24 - param_1) - fVar21);
    if (fVar21 <= fVar24) {
      fVar24 = fVar21;
    }
    fVar22 = param_1;
    if (param_1 <= fVar21) {
      fVar22 = fVar24;
    }
    if (param_1 < fVar22) {
      fVar21 = *(float *)(&UNK_000039cc + lRam0000000000a334c0);
      fVar16 = *(float *)(&UNK_000039d0 + lRam0000000000a334c0);
      fVar17 = *(float *)(&UNK_000039d8 + lRam0000000000a334c0) *
               *(float *)(&UNK_000038e8 + lRam0000000000a334c0);
      fVar24 = 1.0;
      if (fVar21 <= 1.0) {
        fVar24 = fVar21;
      }
      fVar25 = 0.0;
      if (0.0 <= fVar21) {
        fVar25 = fVar24;
      }
      fVar21 = *(float *)(&UNK_000039d4 + lRam0000000000a334c0);
      fVar24 = 1.0;
      if (fVar16 <= 1.0) {
        fVar24 = fVar16;
      }
      fVar18 = 0.0;
      if (0.0 <= fVar16) {
        fVar18 = fVar24;
      }
      iVar9 = -(uint)(fVar21 < 0.0);
      iVar20 = -(uint)(fVar17 < 0.0);
      uVar23 = NEON_fmov(0x3f800000,4);
      uVar23 = uVar23 ^ (uVar23 ^ CONCAT44(fVar17,fVar21)) &
                        ~CONCAT44(-(uint)((float)(uVar23 >> 0x20) < fVar17),
                                  -(uint)((float)uVar23 < fVar21));
      fVar24 = (float)CONCAT13((byte)(uVar23 >> 0x18) & ~(byte)((uint)iVar9 >> 0x18),
                               CONCAT12((byte)(uVar23 >> 0x10) & ~(byte)((uint)iVar9 >> 0x10),
                                        CONCAT11((byte)(uVar23 >> 8) & ~(byte)((uint)iVar9 >> 8),
                                                 (byte)uVar23 & ~(byte)iVar9)));
      uVar19 = NEON_ushl(CONCAT44((int)((float)(CONCAT17((byte)(uVar23 >> 0x38) &
                                                         ~(byte)((uint)iVar20 >> 0x18),
                                                         CONCAT16((byte)(uVar23 >> 0x30) &
                                                                  ~(byte)((uint)iVar20 >> 0x10),
                                                                  CONCAT15((byte)(uVar23 >> 0x28) &
                                                                           ~(byte)((uint)iVar20 >> 8
                                                                                  ),CONCAT14((byte)(
                                                  uVar23 >> 0x20) & ~(byte)iVar20,fVar24)))) >> 0x20
                                               ) * 255.0 + 0.5),(int)(fVar24 * 255.0 + 0.5)),
                         _UNK_0080c190,4);
      func_0x001069f4(fVar22,(fStack00000000000001c4 + unaff_s9) * 0.5,unaff_x20[0x55],
                      (int)(fVar25 * 255.0 + 0.5) | (int)(fVar18 * 255.0 + 0.5) << 8 | (uint)uVar19
                      | (uint)((ulong)uVar19 >> 0x20));
      fVar22 = fVar22 - (float)(int)(fVar27 * 0.8 * 0.5);
      if (fVar22 <= fVar26) {
        fVar26 = fVar22;
      }
      *(float *)(unaff_x29 + -0xe0) = fVar26;
    }
  }
  lVar15 = lRam0000000000a334c0;
  if (in_stack_00000160 != (char *)0xffffffffffffffff) {
    pcVar10 = in_stack_00000160;
    do {
      if (*pcVar10 == '#') {
        if (pcVar10[1] == '#') break;
      }
      else if (*pcVar10 == '\0') break;
      pcVar1 = pcVar10 + 1;
      bVar8 = pcVar10 != (char *)0xfffffffffffffffe;
      pcVar10 = pcVar1;
    } while (bVar8);
    if (((int)pcVar10 != (int)in_stack_00000160) &&
       (func_0x000bc610(*(undefined8 *)(*(long *)(lRam0000000000a334c0 + 0x4000) + 0x2a8),
                        unaff_x29 + -0xd8,unaff_x29 + -0xd0,in_stack_00000160,pcVar10,
                        unaff_x29 + -200,&UNK_00003908 + unaff_x22,unaff_x29 + -0xe8),
       (&UNK_00005ff8)[lVar15] != '\0')) {
      func_0x000bc2c4(unaff_x29 + -0xd8,in_stack_00000160,pcVar10);
    }
  }
  lVar15 = lRam0000000000a334c0;
  uVar13 = 0;
  puVar3 = (undefined4 *)(&UNK_000049a8 + lRam0000000000a334c0);
  *(undefined4 *)(unaff_x20 + 0x4d) = 0;
  uVar4 = *(undefined4 *)(in_stack_00000190 + 0xfd0);
  fVar24 = *(float *)(lVar15 + 0xe40);
  if (fStack00000000000001c0 - *(float *)(&UNK_0000394c + lVar15) <= fVar24) {
    fVar26 = *(float *)(&UNK_0000394c + lVar15) + fStack00000000000001c8;
    bVar8 = false;
    if ((fStack00000000000001c4 - *(float *)(&UNK_00003950 + lVar15) <= *(float *)(lVar15 + 0xe44))
       && (bVar8 = false, !NAN(fVar24) && !NAN(fVar26))) {
      bVar8 = fVar24 < fVar26;
    }
    if (bVar8) {
      uVar13 = (uint)(*(float *)(lVar15 + 0xe44) <
                     fStack00000000000001cc + *(float *)(&UNK_00003950 + lVar15));
    }
    else {
      uVar13 = 0;
    }
  }
  *puVar3 = *(undefined4 *)((long)unaff_x20 + 0x84);
  *(undefined4 *)(&UNK_000049ac + lVar15) = uVar4;
  *(uint *)(&UNK_000049b0 + lVar15) = uVar13;
  *(undefined8 *)(&UNK_000049cc + lVar15) = _fStack00000000000001c8;
  *(undefined8 *)(&UNK_000049c4 + lVar15) = _fStack00000000000001c0;
  *(undefined8 *)(&UNK_000049bc + lVar15) = _fStack00000000000001c8;
  *(undefined8 *)(&UNK_000049b4 + lVar15) = _fStack00000000000001c0;
  iVar9 = *(int *)(in_stack_00000190 + 0xfd4);
  if ((iVar9 != 0) && ((*in_stack_00000178 == iVar9 || (*(int *)((long)unaff_x20 + 0x84) == iVar9)))
     ) {
    func_0x000d2b3c();
    lVar15 = lRam0000000000a334c0;
  }
  lVar14 = *(long *)(lVar15 + 0x4000);
  plVar11 = unaff_x20 + 0x44;
  *(undefined1 *)(lVar14 + 0xc0) = 1;
  func_0x000f0930(*(undefined8 *)(lVar14 + 0x2a8),unaff_x20 + 0x43,plVar11,1);
  lVar15 = *(long *)(*(long *)(lVar14 + 0x2a8) + 0x60) +
           (long)*(int *)(*(long *)(lVar14 + 0x2a8) + 0x58) * 0x10;
  uVar19 = *(undefined8 *)(lVar15 + -0x10);
  *(undefined8 *)(lVar14 + 0x250) = *(undefined8 *)(lVar15 + -8);
  *(undefined8 *)(lVar14 + 0x248) = uVar19;
  *(undefined1 *)(unaff_x20 + 0x18) = 0;
  *(short *)((long)unaff_x20 + 0xcc) = *(short *)((long)unaff_x20 + 0xcc) + 1;
  *in_stack_000001a8 = 0;
  if (iStack00000000000001a0 != iStack00000000000001a4) {
    if ((in_stack_000001b0._4_4_ & 0x11000000) == 0x1000000) {
      if ((in_stack_000001b0._4_4_ >> 0x17 & 1) == 0) {
        bVar8 = false;
      }
      else {
        bVar8 = false;
        if (*(char *)(in_stack_000001a8 + 0x61) != '\0') {
          bVar8 = false;
          if (*(long *)(&UNK_00004b18 + in_stack_000001b8) != 0) {
            bVar8 = *(long *)(*(long *)(&UNK_00004b18 + in_stack_000001b8) + 0x3a0) ==
                    unaff_x20[0x74];
          }
        }
      }
      if ((((&UNK_00005ff8)[in_stack_000001b8] == '\0') && (!bVar8)) &&
         ((*(float *)(unaff_x20 + 0x40) <= *(float *)(unaff_x20 + 0x3f) ||
          (*(float *)((long)unaff_x20 + 0x204) <= *(float *)((long)unaff_x20 + 0x1fc))))) {
        if ((*(char *)((long)unaff_x20 + 0xdc) < '\x01') &&
           (*(char *)((long)unaff_x20 + 0xdd) < '\x01')) {
          *(undefined1 *)((long)unaff_x20 + 0xe4) = 1;
        }
        else {
          *(undefined1 *)((long)unaff_x20 + 0xe5) = 1;
        }
      }
      if (in_stack_00000188 != 0) {
        if (*(char *)(in_stack_00000188 + 0xc1) == '\0') {
          if ('\0' < *(char *)(in_stack_00000188 + 0xe4)) {
            *(undefined1 *)((long)unaff_x20 + 0xe4) = 1;
          }
          if (*(char *)(in_stack_00000188 + 0xe5) < '\x01') goto LAB_000cce08;
        }
        else {
          *(undefined1 *)((long)unaff_x20 + 0xe4) = 1;
        }
        *(undefined1 *)((long)unaff_x20 + 0xe5) = 1;
      }
    }
LAB_000cce08:
    if (*(float *)(&UNK_000038e8 + in_stack_000001b8) <= 0.0) {
      *(undefined1 *)((long)unaff_x20 + 0xe4) = 1;
      *(undefined1 *)((long)unaff_x20 + 0xc5) = 1;
      cVar6 = *(char *)((long)unaff_x20 + 0xe7);
joined_r0x000cce60:
      bVar7 = 1;
      bVar12 = 1;
    }
    else {
      if (('\0' < *(char *)((long)unaff_x20 + 0xe4)) || ('\0' < *(char *)((long)unaff_x20 + 0xe5)))
      {
        *(undefined1 *)((long)unaff_x20 + 0xc5) = 1;
        cVar6 = *(char *)((long)unaff_x20 + 0xe7);
        goto joined_r0x000cce60;
      }
      bVar12 = 0;
      bVar7 = 0;
      *(bool *)((long)unaff_x20 + 0xc5) = '\0' < *(char *)((long)unaff_x20 + 0xe6);
      cVar6 = *(char *)((long)unaff_x20 + 0xe7);
    }
    if ('\0' < cVar6) {
      *(char *)((long)unaff_x20 + 0xe7) = cVar6 + -1;
      *(uint *)((long)unaff_x20 + 0x14) = *(uint *)((long)unaff_x20 + 0x14) | 0x30200;
      bVar7 = bVar12;
    }
    if ((((*(char *)((long)unaff_x20 + 0xc1) == '\0') &&
         ((bool)(*(char *)((long)unaff_x20 + 0xbe) != '\0' & (bVar7 ^ 1)))) ||
        ('\0' < *(char *)((long)unaff_x20 + 0xdc))) || ('\0' < *(char *)((long)unaff_x20 + 0xdd))) {
      bVar8 = false;
    }
    else {
      bVar8 = *(char *)((long)unaff_x20 + 0xe5) < '\x01';
    }
    *(bool *)((long)unaff_x20 + 0xc3) = bVar8;
  }
  if (*(char *)((long)unaff_x20 + 0xc6) == '\0') {
    uVar13 = 0;
    if (*(char *)(in_stack_000001b8 + 0x79) != '\0') {
      uVar13 = in_stack_00000198._4_4_;
    }
    if (((uVar13 & 1) != 0) ||
       ((*(char *)(in_stack_000001b8 + 0x7a) != '\0' &&
        (*(int *)(&UNK_00003fd0 + in_stack_000001b8) ==
         (int)(char)(&UNK_00006074)[in_stack_000001b8])))) {
      if ('\0' < *(char *)((long)unaff_x20 + 0xdc)) {
        *(char *)((long)unaff_x20 + 0xdc) = *(char *)((long)unaff_x20 + 0xdc) + '\x01';
      }
      if (*(char *)((long)unaff_x20 + 0xdd) < '\x01') {
        bVar8 = false;
      }
      else {
        bVar8 = false;
        *(char *)((long)unaff_x20 + 0xdd) = *(char *)((long)unaff_x20 + 0xdd) + '\x01';
      }
      goto LAB_000cced0;
    }
  }
  bVar8 = *(char *)((long)unaff_x20 + 0xc3) == '\0';
LAB_000cced0:
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0xa0)) {
    return;
  }
  ___stack_chk_fail(bVar8);
  auVar28 = __Unwind_Resume();
  lVar14 = *(long *)(lRam0000000000a334c0 + 0x4000);
  *(undefined1 *)(lVar14 + 0xc0) = 1;
  func_0x000f0930(*(undefined8 *)(lVar14 + 0x2a8),auVar28._0_8_,auVar28._8_8_,plVar11);
  lVar15 = *(long *)(*(long *)(lVar14 + 0x2a8) + 0x60) +
           (long)*(int *)(*(long *)(lVar14 + 0x2a8) + 0x58) * 0x10;
  uVar19 = *(undefined8 *)(lVar15 + -0x10);
  *(undefined8 *)(lVar14 + 0x250) = *(undefined8 *)(lVar15 + -8);
  *(undefined8 *)(lVar14 + 0x248) = uVar19;
  return;
}

