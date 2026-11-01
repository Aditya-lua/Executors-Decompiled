
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_000cc7f4(long param_1)

{
  char *pcVar1;
  undefined4 *puVar2;
  undefined4 uVar3;
  char cVar4;
  byte bVar5;
  bool bVar6;
  int iVar7;
  char *pcVar8;
  long *plVar9;
  byte bVar10;
  uint in_w9;
  long in_x10;
  uint uVar11;
  long *unaff_x20;
  long lVar12;
  long unaff_x22;
  long lVar13;
  uint unaff_w24;
  undefined4 *unaff_x25;
  undefined4 unaff_w26;
  long unaff_x29;
  float fVar14;
  float fVar15;
  float fVar16;
  int iVar18;
  undefined8 uVar17;
  float fVar19;
  float fVar20;
  float fVar21;
  ulong uVar22;
  float fVar23;
  float fVar24;
  float unaff_s8;
  float unaff_s9;
  float unaff_s10;
  float unaff_s11;
  float unaff_s12;
  float unaff_s13;
  float unaff_s14;
  undefined1 auVar25 [16];
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
  
  uVar11 = *(uint *)(in_x10 + param_1 * 4) ^ in_w9 >> 8;
  uVar11 = *(uint *)(in_x10 + (ulong)(uVar11 & 0xff ^ 0x43) * 4) ^ uVar11 >> 8;
  uVar11 = *(uint *)(in_x10 + (ulong)(uVar11 & 0xff ^ 0x4c) * 4) ^ uVar11 >> 8;
  uVar11 = *(uint *)(in_x10 + (ulong)(uVar11 & 0xff ^ 0x4f) * 4) ^ uVar11 >> 8;
  uVar11 = *(uint *)(in_x10 + (ulong)(uVar11 & 0xff ^ 0x53) * 4) ^ uVar11 >> 8;
  uVar11 = *(uint *)(in_x10 + (ulong)(uVar11 & 0xff ^ 0x45) * 4) ^ uVar11 >> 8 ^ 0xffffffff;
  if (*(uint *)(&UNK_0000404c + *unaff_x20) == uVar11) {
    func_0x000c167c(uVar11,0xb,"#CLOSE",0);
  }
  iVar7 = func_0x0010c1d4(uVar11,unaff_x29 + -0xb8);
  if (iVar7 != 0) {
    *in_stack_00000168 = 0;
  }
  *(undefined4 *)(unaff_x20 + 0x2d) = 0;
  *unaff_x25 = unaff_w26;
  fVar19 = 0.0;
  fVar20 = 0.0;
  if ((unaff_w24 & 0x40000) != 0) {
    fVar20 = unaff_s14 * 0.8;
  }
  if (in_stack_00000160 == (char *)0xffffffffffffffff) {
    fVar14 = *(float *)(&UNK_00003d38 + lRam0000000000a334c0);
  }
  else {
    pcVar8 = in_stack_00000160;
    do {
      if (*pcVar8 == '#') {
        if (pcVar8[1] == '#') break;
      }
      else if (*pcVar8 == '\0') break;
      pcVar1 = pcVar8 + 1;
      bVar6 = pcVar8 != (char *)0xfffffffffffffffe;
      pcVar8 = pcVar1;
    } while (bVar6);
    fVar14 = *(float *)(&UNK_00003d38 + lRam0000000000a334c0);
    if (pcVar8 == in_stack_00000160) {
      fVar19 = 0.0;
    }
    else {
      fVar19 = 3.4028235e+38;
      fVar15 = (float)func_0x00106300(fVar14,0x7f7fffff,0xbf800000,
                                      *(undefined8 *)(&UNK_00003d30 + lRam0000000000a334c0),
                                      in_stack_00000160,pcVar8,0);
      fVar14 = fVar19;
      fVar19 = (float)(int)(fVar15 + 0.99999);
    }
  }
  fVar20 = fVar20 + fVar19;
  *(float *)(unaff_x29 + -200) = fVar20;
  *(float *)(unaff_x29 + -0xc4) = fVar14 + 0.0;
  fVar19 = *(float *)(&UNK_00003924 + unaff_x22);
  if (unaff_s11 <= fVar19) {
    if (fVar19 < unaff_s12) goto code_r0x000ccc3c;
code_r0x000cc994:
    fVar19 = *(float *)(&UNK_00003908 + unaff_x22);
    bVar6 = false;
    if ((0.0 < fVar19) && (bVar6 = false, !NAN(fVar19))) {
      bVar6 = fVar19 < 1.0;
    }
    if (bVar6) {
code_r0x000cc9a8:
      fVar15 = ABS(fVar19 + -0.5) * -2.0 + 1.0;
      fVar14 = 1.0;
      if (fVar15 <= 1.0) {
        fVar14 = fVar15;
      }
      fVar21 = 0.0;
      if (0.0 <= fVar15) {
        fVar21 = fVar14;
      }
      fVar14 = unaff_s11;
      if (unaff_s11 < unaff_s12) {
        fVar14 = unaff_s12;
      }
      fVar15 = (((unaff_s8 - unaff_s13) - unaff_s11) - unaff_s12) - fVar20;
      if (fVar15 <= fVar14) {
        fVar14 = fVar15;
      }
      fVar14 = fVar14 * fVar21;
      if (unaff_s11 < fVar14) {
        unaff_s11 = fVar14;
      }
      if (unaff_s12 < fVar14) {
        unaff_s12 = fVar14;
      }
    }
  }
  else {
    unaff_s11 = unaff_s11 + *(float *)(&UNK_0000393c + unaff_x22);
    if (unaff_s12 <= fVar19) goto code_r0x000cc994;
code_r0x000ccc3c:
    unaff_s12 = unaff_s12 + *(float *)(&UNK_0000393c + unaff_x22);
    fVar19 = *(float *)(&UNK_00003908 + unaff_x22);
    bVar6 = false;
    if ((0.0 < fVar19) && (bVar6 = false, !NAN(fVar19))) {
      bVar6 = fVar19 < 1.0;
    }
    if (bVar6) goto code_r0x000cc9a8;
  }
  fVar21 = unaff_s13 + unaff_s11;
  fVar15 = unaff_s8 - unaff_s12;
  *(float *)(unaff_x29 + -0xd8) = fVar21;
  *(float *)(unaff_x29 + -0xd4) = unaff_s10;
  *(float *)(unaff_x29 + -0xd0) = fVar15;
  *(float *)(unaff_x29 + -0xcc) = unaff_s9;
  fVar14 = fVar15 + *(float *)(&UNK_0000393c + unaff_x22);
  if (unaff_s8 <= fVar15 + *(float *)(&UNK_0000393c + unaff_x22)) {
    fVar14 = unaff_s8;
  }
  *(float *)(unaff_x29 + -0xe8) = fVar21;
  *(float *)(unaff_x29 + -0xe4) = unaff_s10;
  *(float *)(unaff_x29 + -0xe0) = fVar14;
  *(float *)(unaff_x29 + -0xdc) = unaff_s9;
  if ((unaff_w24 >> 0x12 & 1) != 0) {
    fVar20 = fVar20 + fVar21 + fVar19 * ((fVar15 - fVar21) - fVar20);
    if (fVar20 <= fVar15) {
      fVar15 = fVar20;
    }
    fVar19 = fVar21;
    if (fVar21 <= fVar20) {
      fVar19 = fVar15;
    }
    if (fVar21 < fVar19) {
      fVar15 = *(float *)(&UNK_000039cc + lRam0000000000a334c0);
      fVar21 = *(float *)(&UNK_000039d0 + lRam0000000000a334c0);
      fVar23 = *(float *)(&UNK_000039d8 + lRam0000000000a334c0) *
               *(float *)(&UNK_000038e8 + lRam0000000000a334c0);
      fVar20 = 1.0;
      if (fVar15 <= 1.0) {
        fVar20 = fVar15;
      }
      fVar24 = 0.0;
      if (0.0 <= fVar15) {
        fVar24 = fVar20;
      }
      fVar15 = *(float *)(&UNK_000039d4 + lRam0000000000a334c0);
      fVar20 = 1.0;
      if (fVar21 <= 1.0) {
        fVar20 = fVar21;
      }
      fVar16 = 0.0;
      if (0.0 <= fVar21) {
        fVar16 = fVar20;
      }
      iVar7 = -(uint)(fVar15 < 0.0);
      iVar18 = -(uint)(fVar23 < 0.0);
      uVar22 = NEON_fmov(0x3f800000,4);
      uVar22 = uVar22 ^ (uVar22 ^ CONCAT44(fVar23,fVar15)) &
                        ~CONCAT44(-(uint)((float)(uVar22 >> 0x20) < fVar23),
                                  -(uint)((float)uVar22 < fVar15));
      fVar20 = (float)CONCAT13((byte)(uVar22 >> 0x18) & ~(byte)((uint)iVar7 >> 0x18),
                               CONCAT12((byte)(uVar22 >> 0x10) & ~(byte)((uint)iVar7 >> 0x10),
                                        CONCAT11((byte)(uVar22 >> 8) & ~(byte)((uint)iVar7 >> 8),
                                                 (byte)uVar22 & ~(byte)iVar7)));
      uVar17 = NEON_ushl(CONCAT44((int)((float)(CONCAT17((byte)(uVar22 >> 0x38) &
                                                         ~(byte)((uint)iVar18 >> 0x18),
                                                         CONCAT16((byte)(uVar22 >> 0x30) &
                                                                  ~(byte)((uint)iVar18 >> 0x10),
                                                                  CONCAT15((byte)(uVar22 >> 0x28) &
                                                                           ~(byte)((uint)iVar18 >> 8
                                                                                  ),CONCAT14((byte)(
                                                  uVar22 >> 0x20) & ~(byte)iVar18,fVar20)))) >> 0x20
                                               ) * 255.0 + 0.5),(int)(fVar20 * 255.0 + 0.5)),
                         _UNK_0080c190,4);
      func_0x001069f4(fVar19,(unaff_s10 + unaff_s9) * 0.5,unaff_x20[0x55],
                      (int)(fVar24 * 255.0 + 0.5) | (int)(fVar16 * 255.0 + 0.5) << 8 | (uint)uVar17
                      | (uint)((ulong)uVar17 >> 0x20));
      fVar19 = fVar19 - (float)(int)(unaff_s14 * 0.8 * 0.5);
      if (fVar19 <= fVar14) {
        fVar14 = fVar19;
      }
      *(float *)(unaff_x29 + -0xe0) = fVar14;
    }
  }
  lVar13 = lRam0000000000a334c0;
  if (in_stack_00000160 != (char *)0xffffffffffffffff) {
    pcVar8 = in_stack_00000160;
    do {
      if (*pcVar8 == '#') {
        if (pcVar8[1] == '#') break;
      }
      else if (*pcVar8 == '\0') break;
      pcVar1 = pcVar8 + 1;
      bVar6 = pcVar8 != (char *)0xfffffffffffffffe;
      pcVar8 = pcVar1;
    } while (bVar6);
    if (((int)pcVar8 != (int)in_stack_00000160) &&
       (func_0x000bc610(*(undefined8 *)(*(long *)(lRam0000000000a334c0 + 0x4000) + 0x2a8),
                        unaff_x29 + -0xd8,unaff_x29 + -0xd0,in_stack_00000160,pcVar8,
                        unaff_x29 + -200,&UNK_00003908 + unaff_x22,unaff_x29 + -0xe8),
       (&UNK_00005ff8)[lVar13] != '\0')) {
      func_0x000bc2c4(unaff_x29 + -0xd8,in_stack_00000160,pcVar8);
    }
  }
  lVar13 = lRam0000000000a334c0;
  uVar11 = 0;
  puVar2 = (undefined4 *)(&UNK_000049a8 + lRam0000000000a334c0);
  *(undefined4 *)(unaff_x20 + 0x4d) = 0;
  uVar3 = *(undefined4 *)(in_stack_00000190 + 0xfd0);
  fVar20 = *(float *)(lVar13 + 0xe40);
  if (fStack00000000000001c0 - *(float *)(&UNK_0000394c + lVar13) <= fVar20) {
    fVar19 = *(float *)(&UNK_0000394c + lVar13) + fStack00000000000001c8;
    bVar6 = false;
    if ((fStack00000000000001c4 - *(float *)(&UNK_00003950 + lVar13) <= *(float *)(lVar13 + 0xe44))
       && (bVar6 = false, !NAN(fVar20) && !NAN(fVar19))) {
      bVar6 = fVar20 < fVar19;
    }
    if (bVar6) {
      uVar11 = (uint)(*(float *)(lVar13 + 0xe44) <
                     fStack00000000000001cc + *(float *)(&UNK_00003950 + lVar13));
    }
    else {
      uVar11 = 0;
    }
  }
  *puVar2 = *(undefined4 *)((long)unaff_x20 + 0x84);
  *(undefined4 *)(&UNK_000049ac + lVar13) = uVar3;
  *(uint *)(&UNK_000049b0 + lVar13) = uVar11;
  *(undefined8 *)(&UNK_000049cc + lVar13) = _fStack00000000000001c8;
  *(undefined8 *)(&UNK_000049c4 + lVar13) = _fStack00000000000001c0;
  *(undefined8 *)(&UNK_000049bc + lVar13) = _fStack00000000000001c8;
  *(undefined8 *)(&UNK_000049b4 + lVar13) = _fStack00000000000001c0;
  iVar7 = *(int *)(in_stack_00000190 + 0xfd4);
  if ((iVar7 != 0) && ((*in_stack_00000178 == iVar7 || (*(int *)((long)unaff_x20 + 0x84) == iVar7)))
     ) {
    func_0x000d2b3c();
    lVar13 = lRam0000000000a334c0;
  }
  lVar12 = *(long *)(lVar13 + 0x4000);
  plVar9 = unaff_x20 + 0x44;
  *(undefined1 *)(lVar12 + 0xc0) = 1;
  func_0x000f0930(*(undefined8 *)(lVar12 + 0x2a8),unaff_x20 + 0x43,plVar9,1);
  lVar13 = *(long *)(*(long *)(lVar12 + 0x2a8) + 0x60) +
           (long)*(int *)(*(long *)(lVar12 + 0x2a8) + 0x58) * 0x10;
  uVar17 = *(undefined8 *)(lVar13 + -0x10);
  *(undefined8 *)(lVar12 + 0x250) = *(undefined8 *)(lVar13 + -8);
  *(undefined8 *)(lVar12 + 0x248) = uVar17;
  *(undefined1 *)(unaff_x20 + 0x18) = 0;
  *(short *)((long)unaff_x20 + 0xcc) = *(short *)((long)unaff_x20 + 0xcc) + 1;
  *in_stack_000001a8 = 0;
  if (iStack00000000000001a0 != iStack00000000000001a4) {
    if ((in_stack_000001b0._4_4_ & 0x11000000) == 0x1000000) {
      if ((in_stack_000001b0._4_4_ >> 0x17 & 1) == 0) {
        bVar6 = false;
      }
      else {
        bVar6 = false;
        if (*(char *)(in_stack_000001a8 + 0x61) != '\0') {
          bVar6 = false;
          if (*(long *)(&UNK_00004b18 + in_stack_000001b8) != 0) {
            bVar6 = *(long *)(*(long *)(&UNK_00004b18 + in_stack_000001b8) + 0x3a0) ==
                    unaff_x20[0x74];
          }
        }
      }
      if ((((&UNK_00005ff8)[in_stack_000001b8] == '\0') && (!bVar6)) &&
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
      cVar4 = *(char *)((long)unaff_x20 + 0xe7);
joined_r0x000cce60:
      bVar5 = 1;
      bVar10 = 1;
    }
    else {
      if (('\0' < *(char *)((long)unaff_x20 + 0xe4)) || ('\0' < *(char *)((long)unaff_x20 + 0xe5)))
      {
        *(undefined1 *)((long)unaff_x20 + 0xc5) = 1;
        cVar4 = *(char *)((long)unaff_x20 + 0xe7);
        goto joined_r0x000cce60;
      }
      bVar10 = 0;
      bVar5 = 0;
      *(bool *)((long)unaff_x20 + 0xc5) = '\0' < *(char *)((long)unaff_x20 + 0xe6);
      cVar4 = *(char *)((long)unaff_x20 + 0xe7);
    }
    if ('\0' < cVar4) {
      *(char *)((long)unaff_x20 + 0xe7) = cVar4 + -1;
      *(uint *)((long)unaff_x20 + 0x14) = *(uint *)((long)unaff_x20 + 0x14) | 0x30200;
      bVar5 = bVar10;
    }
    if ((((*(char *)((long)unaff_x20 + 0xc1) == '\0') &&
         ((bool)(*(char *)((long)unaff_x20 + 0xbe) != '\0' & (bVar5 ^ 1)))) ||
        ('\0' < *(char *)((long)unaff_x20 + 0xdc))) || ('\0' < *(char *)((long)unaff_x20 + 0xdd))) {
      bVar6 = false;
    }
    else {
      bVar6 = *(char *)((long)unaff_x20 + 0xe5) < '\x01';
    }
    *(bool *)((long)unaff_x20 + 0xc3) = bVar6;
  }
  if (*(char *)((long)unaff_x20 + 0xc6) == '\0') {
    uVar11 = 0;
    if (*(char *)(in_stack_000001b8 + 0x79) != '\0') {
      uVar11 = in_stack_00000198._4_4_;
    }
    if (((uVar11 & 1) != 0) ||
       ((*(char *)(in_stack_000001b8 + 0x7a) != '\0' &&
        (*(int *)(&UNK_00003fd0 + in_stack_000001b8) ==
         (int)(char)(&UNK_00006074)[in_stack_000001b8])))) {
      if ('\0' < *(char *)((long)unaff_x20 + 0xdc)) {
        *(char *)((long)unaff_x20 + 0xdc) = *(char *)((long)unaff_x20 + 0xdc) + '\x01';
      }
      if (*(char *)((long)unaff_x20 + 0xdd) < '\x01') {
        bVar6 = false;
      }
      else {
        bVar6 = false;
        *(char *)((long)unaff_x20 + 0xdd) = *(char *)((long)unaff_x20 + 0xdd) + '\x01';
      }
      goto LAB_000cced0;
    }
  }
  bVar6 = *(char *)((long)unaff_x20 + 0xc3) == '\0';
LAB_000cced0:
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0xa0)) {
    return;
  }
  ___stack_chk_fail(bVar6);
  auVar25 = __Unwind_Resume();
  lVar12 = *(long *)(lRam0000000000a334c0 + 0x4000);
  *(undefined1 *)(lVar12 + 0xc0) = 1;
  func_0x000f0930(*(undefined8 *)(lVar12 + 0x2a8),auVar25._0_8_,auVar25._8_8_,plVar9);
  lVar13 = *(long *)(*(long *)(lVar12 + 0x2a8) + 0x60) +
           (long)*(int *)(*(long *)(lVar12 + 0x2a8) + 0x58) * 0x10;
  uVar17 = *(undefined8 *)(lVar13 + -0x10);
  *(undefined8 *)(lVar12 + 0x250) = *(undefined8 *)(lVar13 + -8);
  *(undefined8 *)(lVar12 + 0x248) = uVar17;
  return;
}

