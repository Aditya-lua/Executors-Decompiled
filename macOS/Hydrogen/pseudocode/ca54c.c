
/* WARNING: Removing unreachable block (ram,0x000cb648) */
/* WARNING: Removing unreachable block (ram,0x000cdda4) */
/* WARNING: Removing unreachable block (ram,0x000cddf4) */
/* WARNING: Removing unreachable block (ram,0x000cddac) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_000ca54c(void)

{
  float *pfVar1;
  float *pfVar2;
  char *pcVar3;
  byte *pbVar4;
  uint *puVar5;
  undefined4 *puVar6;
  int iVar7;
  int iVar8;
  ulong *puVar9;
  uint uVar10;
  byte bVar11;
  char cVar12;
  bool bVar13;
  bool bVar14;
  bool bVar15;
  int iVar16;
  char *pcVar17;
  long *plVar18;
  uint uVar19;
  undefined *puVar20;
  byte bVar21;
  uint uVar22;
  long lVar23;
  undefined *puVar24;
  long *unaff_x20;
  uint uVar25;
  undefined4 *unaff_x21;
  undefined8 *unaff_x22;
  long lVar26;
  uint unaff_w23;
  float *pfVar27;
  long lVar28;
  long lVar29;
  uint unaff_w25;
  uint uVar30;
  uint unaff_w27;
  int *piVar31;
  undefined8 *puVar32;
  long lVar33;
  float *pfVar34;
  long unaff_x29;
  float fVar35;
  undefined4 uVar36;
  float fVar37;
  float fVar38;
  undefined8 uVar39;
  undefined8 uVar40;
  float fVar41;
  undefined4 uVar42;
  float fVar43;
  float fVar44;
  int iVar45;
  float fVar46;
  ulong uVar47;
  ulong uVar48;
  float fVar49;
  float fVar50;
  float fVar52;
  ulong uVar51;
  float fVar53;
  ulong uVar54;
  ulong uVar55;
  float fVar56;
  float fVar57;
  float fVar58;
  float fVar59;
  float fVar60;
  float fVar61;
  undefined1 auVar62 [16];
  undefined8 uStack0000000000000070;
  ulong uStack00000000000000a0;
  uint uStack00000000000000c4;
  float *pfStack0000000000000108;
  float fStack0000000000000114;
  undefined8 in_stack_00000138;
  uint uStack0000000000000140;
  uint uStack0000000000000144;
  uint uStack0000000000000148;
  char *in_stack_00000160;
  undefined1 *in_stack_00000168;
  int *in_stack_00000170;
  int *in_stack_00000178;
  undefined8 in_stack_00000180;
  long in_stack_00000188;
  ulong *in_stack_00000190;
  ulong in_stack_00000198;
  int iStack00000000000001a0;
  int iStack00000000000001a4;
  undefined4 *in_stack_000001a8;
  ulong in_stack_000001b0;
  long in_stack_000001b8;
  undefined4 uStack00000000000001c0;
  float fStack00000000000001c4;
  undefined4 uStack00000000000001c8;
  float fStack00000000000001cc;
  undefined8 uStack00000000000001d0;
  ulong in_stack_000001d8;
  ulong uStack00000000000001e0;
  float in_stack_000001e8;
  float fStack00000000000001ec;
  
  *(undefined4 *)(unaff_x22 + 0x3e) = 0;
  *(undefined4 *)((long)unaff_x22 + 0x1ec) = 0;
  if ((*(long *)(&UNK_00004d20 + in_stack_000001b8) != 0) &&
     ((in_stack_00000198 & 0x100000000) == 0 && (*(byte *)((long)unaff_x20 + 0x16) & 2) == 0)) {
    lVar28 = unaff_x20[1];
    iVar16 = _strcmp(in_stack_00000160,lVar28);
    if (iVar16 != 0) {
      *(long *)(unaff_x29 + -0xd8) = (long)(int)unaff_x20[0x10];
      lVar28 = func_0x000b81dc(lVar28,unaff_x29 + -0xd8,in_stack_00000160);
      unaff_x20[1] = lVar28;
      *(int *)(unaff_x20 + 0x10) = (int)*(undefined8 *)(unaff_x29 + -0xd8);
      unaff_x21 = in_stack_000001a8;
    }
  }
  pfVar2 = (float *)(unaff_x20 + 8);
  func_0x000d18dc();
  if ('\0' < *(char *)((long)unaff_x20 + 0xe4)) {
    *(char *)((long)unaff_x20 + 0xe4) = *(char *)((long)unaff_x20 + 0xe4) + -1;
  }
  if ('\0' < *(char *)((long)unaff_x20 + 0xe5)) {
    *(char *)((long)unaff_x20 + 0xe5) = *(char *)((long)unaff_x20 + 0xe5) + -1;
  }
  if ('\0' < *(char *)((long)unaff_x20 + 0xe6)) {
    *(char *)((long)unaff_x20 + 0xe6) = *(char *)((long)unaff_x20 + 0xe6) + -1;
  }
  if ((in_stack_00000198._4_4_ != 0) && ((unaff_w23 & unaff_w27 & 1) == 0)) {
    *(undefined1 *)((long)unaff_x20 + 0xe5) = 1;
  }
  uVar25 = 0;
  if ((in_stack_000001b0 & 0x600000000000000) != 0) {
    uVar25 = in_stack_00000180._4_4_;
  }
  if ((uVar25 == 1) &&
     (*(undefined1 *)((long)unaff_x20 + 0xe5) = 1, (in_stack_000001b0._4_4_ >> 6 & 1) != 0)) {
    if ((unaff_w23 & 1) == 0) {
      *(undefined4 *)(unaff_x20 + 7) = 0;
      *(undefined4 *)(unaff_x20 + 6) = 0;
    }
    if ((unaff_w27 & 1) == 0) {
      *(undefined4 *)((long)unaff_x20 + 0x3c) = 0;
      *(undefined4 *)((long)unaff_x20 + 0x34) = 0;
    }
    pfVar2[0] = 0.0;
    pfVar2[1] = 0.0;
    unaff_x20[9] = 0;
  }
  lVar28 = lRam0000000000a334c0;
  lVar33 = **(long **)(&UNK_00004b10 + lRam0000000000a334c0);
  unaff_x20[4] = lVar33;
  *(long **)(lVar28 + 0x4000) = unaff_x20;
  if ((int)unaff_x20[0x38] == -1) {
    lVar23 = 0;
  }
  else {
    lVar23 = *(long *)(&UNK_00004e40 + lVar28) + (long)(int)unaff_x20[0x38] * 0x250;
  }
  *(long *)(&UNK_00004e18 + lVar28) = lVar23;
  lVar29 = *unaff_x20;
  fVar56 = *(float *)(unaff_x20 + 0x54);
  fVar35 = *(float *)(&UNK_00003d3c + lVar29) * fVar56;
  lVar26 = unaff_x20[0x6f];
  if (lVar26 != 0) {
    fVar35 = fVar35 * *(float *)(lVar26 + 0x2a0);
  }
  *(float *)(&UNK_00003d50 + lVar28) = fVar35;
  *(float *)(&UNK_00003d38 + lVar28) = fVar35;
  if (lVar23 == 0) {
    *(bool *)(unaff_x20 + 0x2e) = unaff_x20[0x37] == 0;
    if ((in_stack_000001b0._4_4_ >> 0x18 & 1) == 0) goto LAB_000ca7ac;
code_r0x000ca71c:
    fVar41 = *(float *)(&UNK_00003918 + in_stack_000001b8);
    *(float *)((long)unaff_x20 + 100) = fVar41;
    lVar23 = *(long *)(&UNK_000038f0 + in_stack_000001b8);
    unaff_x20[0xb] = lVar23;
    fVar35 = (float)lVar23;
    if ((in_stack_000001b0._4_4_ & 0x5000000) == 0x1000000) {
      bVar15 = false;
      if (((*(byte *)(unaff_x20 + 3) >> 1 & 1) == 0) && (fVar41 == 0.0)) {
        fVar35 = 0.0;
        uVar42 = 0;
        if ((in_stack_000001b0._4_4_ >> 10 & 1) != 0) {
          uVar42 = *(undefined4 *)(&UNK_000038f4 + in_stack_000001b8);
        }
        bVar15 = false;
        *(undefined4 *)(unaff_x20 + 0xb) = 0;
        *(undefined4 *)((long)unaff_x20 + 0x5c) = uVar42;
      }
    }
    else {
      bVar15 = true;
    }
  }
  else {
    *(undefined1 *)(unaff_x20 + 0x2e) = 0;
    if ((in_stack_000001b0._4_4_ >> 0x18 & 1) != 0) goto code_r0x000ca71c;
LAB_000ca7ac:
    puVar20 = &UNK_00003920;
    if ((in_stack_000001b0 & 0x800000000000000) != 0 || (in_stack_000001b0 & 0x600000000000000) == 0
       ) {
      puVar20 = &UNK_000038fc;
    }
    *(undefined4 *)((long)unaff_x20 + 100) = *(undefined4 *)(puVar20 + in_stack_000001b8);
    lVar23 = *(long *)(&UNK_000038f0 + in_stack_000001b8);
    unaff_x20[0xb] = lVar23;
    fVar35 = (float)lVar23;
    bVar15 = true;
  }
  if (fVar35 < *(float *)(&UNK_00003934 + in_stack_000001b8)) {
    fVar35 = *(float *)(&UNK_00003934 + in_stack_000001b8);
  }
  if (fVar35 < (float)unaff_x21[0x19]) {
    fVar35 = (float)unaff_x21[0x19];
  }
  *(float *)((long)unaff_x20 + 0x174) = fVar35;
  fVar35 = (float)unaff_x21[0x1a];
  *(float *)(unaff_x20 + 0x2f) = fVar35;
  uStack0000000000000144 = unaff_w27;
  if ((in_stack_000001b0 & 0x2100000000) == 0) {
    fVar57 = *(float *)(unaff_x20 + 7);
    fVar43 = *(float *)(unaff_x20 + 5);
    fVar41 = *(float *)((long)unaff_x20 + 0x2c);
    fVar59 = 0.0;
    uVar25 = *(uint *)((long)unaff_x20 + 0x14);
    if ((uVar25 & 1) == 0) {
      fVar59 = *(float *)(&UNK_00003d3c + lVar29) * fVar56;
      if (lVar26 != 0) {
        fVar59 = fVar59 * *(float *)(lVar26 + 0x2a0);
      }
      fVar59 = fVar59 + *(float *)(&UNK_00003928 + lVar29) * 2.0;
    }
    *(float *)(unaff_x29 + -0xd8) = fVar43;
    *(float *)(unaff_x29 + -0xd4) = fVar41;
    *(float *)(unaff_x29 + -0xd0) = fVar43 + fVar57;
    *(float *)(unaff_x29 + -0xcc) = fVar41 + fVar59;
    if ((((*(long **)(&UNK_00004008 + in_stack_000001b8) == unaff_x20) &&
         (*(int *)((long)in_stack_00000190 + 0x6a4) == 0)) && ((int)in_stack_00000190[0xd5] == 0))
       && ((iVar16 = func_0x000c2af4(unaff_x29 + -0xd8,unaff_x29 + -0xd0,1), iVar16 != 0 &&
           (*(short *)(&UNK_0000386a + in_stack_000001b8) == 2)))) {
      *(undefined1 *)((long)unaff_x20 + 0xc2) = 1;
    }
    uStack0000000000000148 = in_stack_00000198._4_4_;
    if (*(char *)((long)unaff_x20 + 0xc2) != '\0') {
      bVar11 = *(byte *)((long)unaff_x20 + 0xc1);
      *(byte *)((long)unaff_x20 + 0xc1) = bVar11 ^ 1;
      if (bVar11 != 0) {
        uStack0000000000000148 = 1;
      }
      if (((uVar25 >> 8 & 1) == 0) && (*(float *)(&UNK_00005f5c + lVar28) <= 0.0)) {
        *(float *)(&UNK_00005f5c + lVar28) = *(float *)(lVar28 + 0x1c);
      }
    }
  }
  else {
    *(undefined1 *)((long)unaff_x20 + 0xc1) = 0;
    uVar25 = *(uint *)((long)unaff_x20 + 0x14);
    uStack0000000000000148 = in_stack_00000198._4_4_;
  }
  *(undefined1 *)((long)unaff_x20 + 0xc2) = 0;
  fVar57 = *(float *)((long)unaff_x20 + 0xb4);
  fVar59 = *(float *)(unaff_x20 + 0x17);
  *(undefined4 *)(unaff_x20 + 0xd) = 0;
  fVar43 = 0.0;
  fVar41 = 0.0;
  *(undefined4 *)(unaff_x20 + 0xe) = 0;
  if ((uVar25 & 1) == 0) {
    fVar41 = *(float *)(&UNK_00003d3c + lVar29) * fVar56;
    if (lVar26 != 0) {
      fVar41 = fVar41 * *(float *)(lVar26 + 0x2a0);
    }
    fVar41 = fVar41 + *(float *)(&UNK_00003928 + lVar29) * 2.0;
  }
  if ((uVar25 >> 10 & 1) != 0) {
    fVar56 = *(float *)(&UNK_00003d3c + lVar29) * fVar56;
    if (lVar26 != 0) {
      fVar56 = fVar56 * *(float *)(lVar26 + 0x2a0);
    }
    fVar43 = fVar35 + fVar56 + *(float *)(&UNK_00003928 + lVar29) * 2.0;
  }
  *(float *)((long)unaff_x20 + 0x6c) = fVar41 + fVar43;
  *(undefined4 *)((long)unaff_x20 + 0x74) = 0;
  *(undefined4 *)((long)unaff_x20 + 0xb4) = 0;
  *(undefined4 *)(unaff_x20 + 0x17) = 0;
  fVar35 = (float)func_0x000d1a10();
  uStack0000000000000140 = in_stack_00000198._4_4_;
  if (((in_stack_000001b0._4_4_ >> 6 & 1) == 0) || (*(char *)((long)unaff_x20 + 0xc1) != '\0')) {
    if (*(char *)((long)unaff_x20 + 0xdc) < '\x01') {
      if (*(char *)((long)unaff_x20 + 0xdd) < '\x01') {
        goto code_r0x000caaa4;
      }
    }
    else if ((unaff_w23 & 1) == 0) {
      fVar56 = fVar35;
      if ((*(char *)((long)unaff_x20 + 0xde) != '\0') &&
         (fVar56 = *(float *)(unaff_x20 + 7), *(float *)(unaff_x20 + 7) < fVar35)) {
        fVar56 = fVar35;
      }
      *(float *)(unaff_x20 + 7) = fVar56;
      uStack0000000000000140 = 1;
    }
    if (((uStack0000000000000144 & 1) == 0) && ('\0' < *(char *)((long)unaff_x20 + 0xdd))) {
      fVar35 = fVar43;
      if ((*(char *)((long)unaff_x20 + 0xde) != '\0') &&
         (fVar35 = *(float *)((long)unaff_x20 + 0x3c), *(float *)((long)unaff_x20 + 0x3c) < fVar43))
      {
        fVar35 = fVar43;
      }
      *(float *)((long)unaff_x20 + 0x3c) = fVar35;
      uStack0000000000000148 = 1;
    }
    if (((*(char *)((long)unaff_x20 + 0xc1) == '\0') &&
        ((*(byte *)((long)unaff_x20 + 0x15) & 1) == 0)) &&
       (*(float *)(&UNK_00005f5c + lRam0000000000a334c0) <= 0.0)) {
      *(float *)(&UNK_00005f5c + lRam0000000000a334c0) = *(float *)(lRam0000000000a334c0 + 0x1c);
    }
  }
  else {
    if ((unaff_w23 & 1) == 0) {
      *(float *)(unaff_x20 + 7) = fVar35;
      uStack0000000000000140 = 1;
    }
    if ((uStack0000000000000144 & 1) == 0) {
      *(float *)((long)unaff_x20 + 0x3c) = fVar43;
      uStack0000000000000148 = 1;
    }
  }
code_r0x000caaa4:
  fVar35 = (float)func_0x000d1c94();
  uVar25 = in_stack_000001b0._4_4_ >> 0x18 & 1;
  *(float *)(unaff_x20 + 7) = fVar35;
  *(float *)((long)unaff_x20 + 0x3c) = fVar43;
  if (*(char *)((long)unaff_x20 + 0xc1) == '\0') {
    uVar25 = 1;
  }
  if (uVar25 == 0) {
    fVar56 = 0.0;
    if ((*(byte *)((long)unaff_x20 + 0x14) & 1) == 0) {
      fVar56 = *(float *)(&UNK_00003d3c + *unaff_x20) * *(float *)(unaff_x20 + 0x54);
      if (unaff_x20[0x6f] != 0) {
        fVar56 = fVar56 * *(float *)(unaff_x20[0x6f] + 0x2a0);
      }
      fVar56 = fVar56 + *(float *)(&UNK_00003928 + *unaff_x20) * 2.0;
    }
    *(float *)(unaff_x20 + 6) = (fVar35 + *(float *)(unaff_x20 + 5)) - *(float *)(unaff_x20 + 5);
    *(float *)((long)unaff_x20 + 0x34) =
         (*(float *)((long)unaff_x20 + 0x2c) + fVar56) - *(float *)((long)unaff_x20 + 0x2c);
  }
  else {
    *(float *)(unaff_x20 + 6) = fVar35;
    *(float *)((long)unaff_x20 + 0x34) = fVar43;
  }
  if (in_stack_00000180._4_4_ != 0) {
    *(undefined4 *)(unaff_x20 + 0x1c) = 0xffffffff;
    uVar25 = unaff_w25;
    if ((in_stack_000001b0._4_4_ & 0xc000000) != 0x4000000) {
      uVar25 = 1;
    }
    if ((uVar25 & 1) == 0) {
      unaff_x20[5] = *(long *)(*(long *)(&UNK_00004ae8 + in_stack_000001b8) +
                               (long)*in_stack_00000170 * 0x38 + -0x14);
    }
  }
  uVar25 = in_stack_000001b0._4_4_ & 0x3000000;
  uVar22 = in_stack_000001b0._4_4_ >> 0x1a & 1;
  if ((in_stack_000001b0._4_4_ >> 0x18 & 1) != 0) {
    iVar16 = *(int *)(in_stack_00000188 + 0x1a0);
    *(short *)(unaff_x20 + 0x1a) = (short)iVar16;
    if (iVar16 == *(int *)(in_stack_00000188 + 0x1a4)) {
      if (iVar16 == 0) {
        iVar45 = 8;
      }
      else {
        iVar45 = iVar16;
        if (iVar16 < 0) {
          iVar45 = iVar16 + 1;
        }
        iVar45 = iVar16 + (iVar45 >> 1);
      }
      if (iVar45 <= iVar16 + 1) {
        iVar45 = iVar16 + 1;
      }
      func_0x000cef5c((int *)(in_stack_00000188 + 0x1a0),iVar45);
      iVar16 = *(int *)(in_stack_00000188 + 0x1a0);
    }
    *(long **)(*(long *)(in_stack_00000188 + 0x1a8) + (long)iVar16 * 8) = unaff_x20;
    *(int *)(in_stack_00000188 + 0x1a0) = *(int *)(in_stack_00000188 + 0x1a0) + 1;
    if (((unaff_w25 & 1) == 0 && uVar22 == 0) && (uVar25 != 0x3000000)) {
      unaff_x20[5] = *(long *)(in_stack_00000188 + 0x110);
    }
  }
  fVar35 = *(float *)((long)unaff_x20 + 0xec);
  uVar42 = 0x7f7fffff;
  if ((fVar35 == 3.4028235e+38) || (*(char *)((long)unaff_x20 + 0xe5) != '\0')) {
    if ((in_stack_000001b0._4_4_ >> 0x1c & 1) == 0) {
      uVar19 = unaff_w25;
      if ((in_stack_000001b0 & 0x400000000000000) == 0) {
        uVar19 = 1;
      }
      if (((uVar19 & 1) != 0) || ((int)in_stack_00000138._4_4_ < 1)) {
        uVar19 = unaff_w25;
        if ((in_stack_000001b0 & 0x200000000000000) == 0) {
          uVar19 = 1;
        }
        if (((uVar19 & 1) != 0) || (uVar25 == 0x3000000)) goto code_r0x000cac7c;
      }
    }
    uVar36 = func_0x000d2410();
    *(undefined4 *)(unaff_x20 + 5) = uVar36;
    *(undefined4 *)((long)unaff_x20 + 0x2c) = uVar42;
  }
  else {
    *(undefined8 *)((long)unaff_x20 + 0xec) = 0x7f7fffff7f7fffff;
    lVar23 = unaff_x20[5];
    *(uint *)(unaff_x20 + 0x1d) = *(uint *)(unaff_x20 + 0x1d) & 0xfffffff1;
    lVar28 = NEON_scvtf(CONCAT44((int)(*(float *)(unaff_x20 + 0x1e) -
                                      (float)((ulong)unaff_x20[6] >> 0x20) *
                                      (float)((ulong)*(undefined8 *)((long)unaff_x20 + 0xf4) >> 0x20
                                             )),
                                 (int)(fVar35 - (float)unaff_x20[6] *
                                                (float)*(undefined8 *)((long)unaff_x20 + 0xf4))),4);
    unaff_x20[5] = lVar28;
    fVar35 = (float)lVar28 - (float)lVar23;
    fVar56 = (float)((ulong)lVar28 >> 0x20) - (float)((ulong)lVar23 >> 0x20);
    if ((fVar35 != 0.0) || (fVar56 != 0.0)) {
      if (((*(byte *)((long)unaff_x20 + 0x15) & 1) == 0) &&
         (*(float *)(&UNK_00005f5c + lRam0000000000a334c0) <= 0.0)) {
        *(float *)(&UNK_00005f5c + lRam0000000000a334c0) = *(float *)(lRam0000000000a334c0 + 0x1c);
      }
      unaff_x20[0x22] =
           CONCAT44(fVar56 + (float)((ulong)unaff_x20[0x22] >> 0x20),fVar35 + (float)unaff_x20[0x22]
                   );
      unaff_x20[0x26] =
           CONCAT44(fVar56 + (float)((ulong)unaff_x20[0x26] >> 0x20),fVar35 + (float)unaff_x20[0x26]
                   );
      unaff_x20[0x25] =
           CONCAT44(fVar56 + (float)((ulong)unaff_x20[0x25] >> 0x20),fVar35 + (float)unaff_x20[0x25]
                   );
      unaff_x20[0x24] =
           CONCAT44(fVar56 + (float)((ulong)unaff_x20[0x24] >> 0x20),fVar35 + (float)unaff_x20[0x24]
                   );
    }
  }
code_r0x000cac7c:
  uStack00000000000001e0._0_4_ = *(float *)(lVar33 + 4);
  uStack00000000000001e0._4_4_ = *(float *)(lVar33 + 8);
  in_stack_000001e8 = (float)uStack00000000000001e0 + *(float *)(lVar33 + 0xc);
  fStack00000000000001ec = uStack00000000000001e0._4_4_ + *(float *)(lVar33 + 0x10);
  fVar56 = (float)*(undefined8 *)(lVar33 + 0x14);
  fVar43 = (float)((ulong)*(undefined8 *)(lVar33 + 0x14) >> 0x20);
  uVar54 = *in_stack_00000190;
  uVar55 = in_stack_00000190[1];
  uVar54 = uVar54 ^ (uVar54 ^ uVar55) &
                    ~CONCAT44(-(uint)((float)(uVar55 >> 0x20) <= (float)(uVar54 >> 0x20)),
                              -(uint)((float)uVar55 <= (float)uVar54));
  fVar50 = (float)uVar54;
  fVar41 = fVar56 + fVar50;
  fVar52 = (float)(uVar54 >> 0x20);
  fVar35 = fVar43 + fVar52;
  fVar50 = (fVar56 + (float)*(undefined8 *)(lVar33 + 0x1c)) - fVar50;
  fVar52 = (fVar43 + (float)((ulong)*(undefined8 *)(lVar33 + 0x1c) >> 0x20)) - fVar52;
  uVar54 = CONCAT44(fVar52,fVar50);
  if ((((unaff_w25 | (in_stack_000001b0._4_4_ & 0x1000000) >> 0x18) == 1) ||
      (in_stack_000001e8 - (float)uStack00000000000001e0 <= 0.0)) ||
     (fStack00000000000001ec - uStack00000000000001e0._4_4_ <= 0.0)) {
    lVar28 = unaff_x20[5];
    lVar28 = NEON_scvtf(CONCAT44((int)(float)((ulong)lVar28 >> 0x20),(int)(float)lVar28),4);
    unaff_x20[5] = lVar28;
    if ((in_stack_000001b0._4_4_ >> 0x18 & 1) == 0) goto code_r0x000cad88;
    puVar20 = &UNK_00003914;
  }
  else {
    fVar56 = *(float *)((long)unaff_x20 + 0x34);
    if ((*(char *)(lRam0000000000a334c0 + 0x5f) != '\0') &&
       ((*(byte *)((long)unaff_x20 + 0x14) & 1) == 0)) {
      fVar56 = *(float *)(&UNK_00003d3c + *unaff_x20) * *(float *)(unaff_x20 + 0x54);
      if (unaff_x20[0x6f] != 0) {
        fVar56 = fVar56 * *(float *)(unaff_x20[0x6f] + 0x2a0);
      }
      fVar56 = fVar56 + *(float *)(&UNK_00003928 + *unaff_x20) * 2.0;
    }
    uVar47 = unaff_x20[5];
    uVar55 = CONCAT44(fVar35 - fVar56,fVar41 - *(float *)(unaff_x20 + 6));
    fVar43 = (float)(uVar47 >> 0x20);
    uVar55 = uVar55 ^ (uVar55 ^ uVar47 ^ (uVar47 ^ uVar54) &
                                         CONCAT44(-(uint)(fVar52 < fVar43),
                                                  -(uint)(fVar50 < (float)uVar47))) &
                      ~CONCAT44(-(uint)(fVar43 < fVar35 - fVar56),
                                -(uint)((float)uVar47 < fVar41 - *(float *)(unaff_x20 + 6)));
    uVar55 = NEON_scvtf(CONCAT44((int)(float)(uVar55 >> 0x20),(int)(float)uVar55),4);
    unaff_x20[5] = uVar55;
code_r0x000cad88:
    if ((in_stack_000001b0._4_4_ & 0xc000000) == 0x4000000) {
      puVar20 = &UNK_0000391c;
    }
    else {
      puVar20 = &UNK_000038f8;
    }
  }
  pfStack0000000000000108 = (float *)(unaff_x20 + 5);
  fVar56 = *(float *)(puVar20 + in_stack_000001b8);
  *(float *)(unaff_x20 + 0xc) = fVar56;
  uVar19 = in_stack_00000180._4_4_ ^ 1 | (in_stack_000001b0._4_4_ & 0x1000) >> 0xc;
  uStack0000000000000144 = uVar19 ^ 1;
  if (uVar19 == 0 && uVar22 == 0) {
    uStack0000000000000144 = (uint)((in_stack_000001b0 & 0x300000000000000) == 0);
  }
  *(undefined8 *)(unaff_x29 + -0xb0) = 0;
  *(undefined8 *)(unaff_x29 + -0xa8) = 0;
  lVar28 = lRam0000000000a334c0;
  uVar22 = *(uint *)((long)unaff_x20 + 0x14);
  if ((uVar22 >> 0x18 & 1) == 0) {
    in_stack_00000138._4_4_ = 1;
    if (*(char *)(in_stack_000001b8 + 0x5e) != '\0') {
      in_stack_00000138._4_4_ = 2;
    }
  }
  else {
    in_stack_00000138._4_4_ = 0;
  }
  fStack0000000000000114 = *(float *)(&UNK_00003d38 + in_stack_000001b8) * 1.1;
  fVar56 = fVar56 + 1.0;
  fVar43 = fVar56 + *(float *)(&UNK_00003d38 + in_stack_000001b8) * 0.2;
  if (fStack0000000000000114 < fVar43) {
    fStack0000000000000114 = fVar43;
  }
  if (((*(char *)((long)unaff_x20 + 0xc1) == '\0') && ((uVar22 & 0x42) == 0)) &&
     ((*(char *)((long)unaff_x20 + 0xdc) < '\x01' &&
      ((*(char *)((long)unaff_x20 + 0xdd) < '\x01' && (*(char *)((long)unaff_x20 + 0xbf) != '\0'))))
     )) {
    fVar43 = *(float *)(&UNK_00003d38 + lRam0000000000a334c0) * 1.35;
    fVar56 = fVar56 + *(float *)(&UNK_00003d38 + lRam0000000000a334c0) * 0.2;
    if (fVar43 < fVar56) {
      fVar43 = fVar56;
    }
    fVar56 = 0.0;
    if (*(char *)(lRam0000000000a334c0 + 0x5e) != '\0') {
      fVar56 = 4.0;
    }
    uVar19 = (uint)(*(char *)(lRam0000000000a334c0 + 0x5f) == '\0');
    if ((uVar22 & 1) == 0 && uVar19 == 0) {
      fVar50 = *(float *)(&UNK_00003d3c + *unaff_x20) * *(float *)(unaff_x20 + 0x54);
      if (unaff_x20[0x6f] != 0) {
        fVar50 = fVar50 * *(float *)(unaff_x20[0x6f] + 0x2a0);
      }
      fVar35 = fVar35 - (fVar50 + *(float *)(&UNK_00003928 + *unaff_x20) * 2.0);
    }
    *(undefined4 *)(unaff_x29 + -0xe4) = 0x7f7fffff;
    *(undefined4 *)(unaff_x20 + 0x2d) = 1;
    func_0x000d4e10("#RESIZE");
    pfVar27 = (float *)(&UNK_00004d40 + lVar28);
    fVar43 = (float)(int)((float)(int)fVar43 * 0.75);
    if (in_stack_00000138._4_4_ == 0) {
      uStack00000000000000c4 = 0;
      uStack0000000000000070 = 0x7f7fffff7f7fffff;
      fVar50 = 3.4028235e+38;
    }
    else {
      uVar55 = 0;
      uStack00000000000000c4 = 0;
      puVar32 = (undefined8 *)&UNK_0080c9e8;
      uStack0000000000000070 = 0x7f7fffff7f7fffff;
      uStack00000000000000a0 = 0x7f7fffff;
      fVar50 = 3.4028235e+38;
      do {
        fVar37 = (float)unaff_x20[5];
        fVar38 = (float)((ulong)unaff_x20[5] >> 0x20);
        fVar53 = (float)puVar32[-1];
        fVar46 = (float)((ulong)puVar32[-1] >> 0x20);
        fVar37 = fVar37 + fVar53 * ((fVar37 + (float)unaff_x20[6]) - fVar37);
        fVar38 = fVar38 + fVar46 * ((fVar38 + (float)((ulong)unaff_x20[6] >> 0x20)) - fVar38);
        fVar60 = (float)*puVar32;
        fVar49 = fVar60 * fVar56;
        fVar61 = (float)((ulong)*puVar32 >> 0x20);
        fVar58 = fVar61 * fVar56;
        fVar52 = fVar37 - fVar49;
        fVar44 = fVar38 - fVar58;
        fVar37 = fVar37 + fVar60 * fVar43;
        fVar38 = fVar38 + fVar61 * fVar43;
        *(ulong *)(unaff_x29 + -0xd8) = CONCAT44(fVar44,fVar52);
        *(ulong *)(unaff_x29 + -0xd0) = CONCAT44(fVar38,fVar37);
        if (fVar37 < fVar52) {
          *(float *)(unaff_x29 + -0xd8) = fVar37;
          *(float *)(unaff_x29 + -0xd0) = fVar52;
        }
        uVar47 = (ulong)(uint)fVar38;
        if (fVar38 < fVar44) {
          *(float *)(unaff_x29 + -0xd4) = fVar38;
          *(float *)(unaff_x29 + -0xcc) = fVar44;
        }
        uVar10 = *(uint *)(unaff_x20[0x21] + (long)(int)unaff_x20[0x20] * 4 + -4);
        uVar30 = (uint)uVar55;
        uVar10 = *(uint *)(&UNK_0080c404 + (ulong)((uVar10 ^ uVar30 ^ 0xffffffff) & 0xff) * 4) ^
                 ~uVar10 >> 8;
        uVar10 = *(uint *)(&UNK_0080c404 + (ulong)((uVar10 ^ uVar30 >> 8) & 0xff) * 4) ^ uVar10 >> 8
        ;
        uVar10 = *(uint *)(&UNK_0080c404 + (ulong)((uVar10 ^ uVar30 >> 0x10) & 0xff) * 4) ^
                 uVar10 >> 8;
        uVar10 = *(uint *)(&UNK_0080c404 + (ulong)(uVar10 & 0xff ^ uVar30 >> 0x18) * 4) ^
                 uVar10 >> 8 ^ 0xffffffff;
        if (*(uint *)(&UNK_0000404c + *unaff_x20) == uVar10) {
          func_0x000c167c(uVar10,4,uVar55,0);
        }
        func_0x000d0e24(unaff_x29 + -0xd8,uVar10,0,8);
        func_0x0010b53c(unaff_x29 + -0xd8,uVar10,&uStack00000000000001d0,&uStack00000000000001c0,
                        &UNK_00040800);
        if ((char)uStack00000000000001d0 != '\0' || (char)uStack00000000000001c0 != '\0') {
          uVar42 = 5;
          if ((uVar55 & 1) == 0) {
            uVar42 = 6;
          }
          *(undefined4 *)(&UNK_00004ee8 + lVar28) = uVar42;
          if ((char)uStack00000000000001c0 != '\0') {
            if ((&UNK_00003865)[lVar28] == '\0') {
              uVar51 = CONCAT44(-(uint)(fVar46 == 0.0),-(uint)(fVar53 == 0.0));
              uVar48 = CONCAT44(fVar35,0xff7fffff) ^
                       (CONCAT44(fVar35,0xff7fffff) ^ CONCAT44(0xff7fffff,fVar41)) &
                       CONCAT44(-(uint)((int)(((uint)(fVar46 != 1.0) &
                                              (uVar22 | uVar19 | (uint)(fVar46 != 0.0))) << 0x1f) <
                                       0),-(uint)((int)((uint)(fVar53 == 1.0) << 0x1f) < 0));
              uVar47 = (uVar54 ^ 0x7f7fffff7f7fffff) & uVar51 ^ 0x7f7fffff7f7fffff;
              fVar50 = fVar49 + fVar53 * (fVar60 * -fVar43 - fVar49) +
                       ((float)*(undefined8 *)(lVar28 + 0xe40) -
                       (float)*(undefined8 *)(&UNK_00004078 + lVar28));
              fVar52 = fVar58 + fVar46 * (fVar61 * -fVar43 - fVar58) +
                       ((float)((ulong)*(undefined8 *)(lVar28 + 0xe40) >> 0x20) -
                       (float)((ulong)*(undefined8 *)(&UNK_00004078 + lVar28) >> 0x20));
              uVar47 = CONCAT44(fVar52,fVar50) ^
                       (CONCAT44(fVar52,fVar50) ^ uVar47) &
                       CONCAT44(-(uint)((float)(uVar47 >> 0x20) < fVar52),
                                -(uint)((float)uVar47 < fVar50));
              uVar47 = uVar47 ^ (uVar47 ^ uVar48) &
                                CONCAT44(-(uint)(fVar52 < (float)(uVar48 >> 0x20)),
                                         -(uint)(fVar50 < (float)uVar48));
              fVar50 = (float)unaff_x20[5];
              fVar38 = (float)uVar47;
              fVar44 = (float)((ulong)unaff_x20[5] >> 0x20);
              fVar58 = (float)(uVar47 >> 0x20);
              fVar52 = fVar50 + (float)unaff_x20[6];
              fVar37 = fVar44 + (float)((ulong)unaff_x20[6] >> 0x20);
              fVar49 = fVar38 + fVar53 * (fVar50 - fVar38);
              fVar44 = fVar58 + fVar46 * (fVar44 - fVar58);
              fVar52 = fVar52 + fVar53 * (fVar38 - fVar52);
              fVar37 = fVar37 + fVar46 * (fVar58 - fVar37);
              uStack00000000000000a0 = CONCAT44(fVar37,fVar52);
              fVar50 = (float)func_0x000d1c94();
              uVar51 = CONCAT44((float)uStack00000000000000a0 - (fVar37 - fVar44),
                                fVar50 - (fVar52 - fVar49)) & uVar51;
              uStack0000000000000070 =
                   CONCAT44(fVar44 - (float)(uVar51 >> 0x20),fVar49 - (float)uVar51);
            }
            else {
              fVar50 = (float)func_0x000d1c94();
              func_0x000c23ac(0,0);
              uStack00000000000000c4 = 3;
              uStack00000000000000a0 = uVar47;
            }
          }
        }
        if (((uVar55 == 0) || (((uint)uStack00000000000001c0 & 0xff) != 0)) ||
           ((char)uStack00000000000001d0 != '\0')) {
          lVar33 = 0x1e;
          if ((char)uStack00000000000001d0 != '\0') {
            lVar33 = 0x1f;
          }
          if (((uint)uStack00000000000001c0 & 0xff) != 0) {
            lVar33 = 0x20;
          }
          lVar33 = lVar33 * 0x10 + lRam0000000000a334c0;
          fVar44 = *(float *)(&UNK_000038e8 + lVar33 + 0xe4);
          fVar37 = *(float *)(&UNK_000038e8 + lVar33 + 0xe8);
          fVar38 = *(float *)(&UNK_000038e8 + lVar33 + 0xec);
          fVar52 = 1.0;
          if (fVar44 <= 1.0) {
            fVar52 = fVar44;
          }
          fVar53 = 0.0;
          if (0.0 <= fVar44) {
            fVar53 = fVar52;
          }
          fVar44 = *(float *)(&UNK_000038e8 + lVar33 + 0xf0) *
                   *(float *)(&UNK_000038e8 + lRam0000000000a334c0);
          fVar52 = 1.0;
          if (fVar37 <= 1.0) {
            fVar52 = fVar37;
          }
          fVar46 = 0.0;
          if (0.0 <= fVar37) {
            fVar46 = fVar52;
          }
          iVar16 = -(uint)(fVar38 < 0.0);
          iVar45 = -(uint)(fVar44 < 0.0);
          uVar47 = NEON_fmov(0x3f800000,4);
          uVar47 = uVar47 ^ (uVar47 ^ CONCAT44(fVar44,fVar38)) &
                            ~CONCAT44(-(uint)((float)(uVar47 >> 0x20) < fVar44),
                                      -(uint)((float)uVar47 < fVar38));
          fVar52 = (float)CONCAT13((byte)(uVar47 >> 0x18) & ~(byte)((uint)iVar16 >> 0x18),
                                   CONCAT12((byte)(uVar47 >> 0x10) & ~(byte)((uint)iVar16 >> 0x10),
                                            CONCAT11((byte)(uVar47 >> 8) &
                                                     ~(byte)((uint)iVar16 >> 8),
                                                     (byte)uVar47 & ~(byte)iVar16)));
          uVar39 = NEON_ushl(CONCAT44((int)((float)(CONCAT17((byte)(uVar47 >> 0x38) &
                                                             ~(byte)((uint)iVar45 >> 0x18),
                                                             CONCAT16((byte)(uVar47 >> 0x30) &
                                                                      ~(byte)((uint)iVar45 >> 0x10),
                                                                      CONCAT15((byte)(uVar47 >> 0x28
                                                                                     ) & ~(byte)((
                                                  uint)iVar45 >> 8),
                                                  CONCAT14((byte)(uVar47 >> 0x20) & ~(byte)iVar45,
                                                           fVar52)))) >> 0x20) * 255.0 + 0.5),
                                      (int)(fVar52 * 255.0 + 0.5)),_UNK_0080c190,4);
          *(uint *)(unaff_x29 + -0xb0 + uVar55 * 4) =
               (int)(fVar53 * 255.0 + 0.5) | (int)(fVar46 * 255.0 + 0.5) << 8 | (uint)uVar39 |
               (uint)((ulong)uVar39 >> 0x20);
        }
        uVar55 = uVar55 + 1;
        puVar32 = puVar32 + 3;
      } while (in_stack_00000138._4_4_ != uVar55);
      *(int *)(unaff_x29 + -0xe4) = (int)uStack00000000000000a0;
    }
    *(float *)(unaff_x29 + -0xe8) = fVar50;
    lVar33 = lRam0000000000a334c0;
    if ((*(byte *)((long)unaff_x20 + 0x17) & 1) == 0) {
      uVar22 = 0;
      if (*(char *)(lVar28 + 0x5e) != '\0') {
        uVar22 = 0xf;
      }
    }
    else {
      uVar22 = *(uint *)(unaff_x20 + 3) >> 1 & 2 | *(uint *)(unaff_x20 + 3) & 8;
    }
    uVar54 = 0;
    fVar56 = (float)((ulong)uStack0000000000000070 >> 0x20);
    do {
      if ((uVar22 >> (ulong)((uint)uVar54 & 0x1f) & 1) != 0) {
                    /* WARNING: Could not recover jumptable at 0x000cd5f0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(code *)(&UNK_000cd5f4 + (ulong)(byte)(&UNK_0080c3c0)[uVar54 & 0xffffffff] * 4))();
        return;
      }
      uVar54 = uVar54 + 1;
    } while (uVar54 != 4);
    *(int *)(*(long *)(lRam0000000000a334c0 + 0x4000) + 0x100) =
         *(int *)(*(long *)(lRam0000000000a334c0 + 0x4000) + 0x100) + -1;
    *(undefined4 *)(unaff_x20 + 0x2d) = 0;
    if ((*(long *)(&UNK_00004d10 + lVar28) != 0) &&
       (*(long **)(*(long *)(&UNK_00004d10 + lVar28) + 0x388) == unaff_x20)) {
      if (*(int *)(&UNK_00004b64 + lVar28) == 3) {
        puVar20 = &UNK_00003670;
        fVar43 = *(float *)(&UNK_00003650 + lVar33) - *(float *)(&UNK_00003640 + lVar33);
        puVar24 = &UNK_00003660;
code_r0x000cdb50:
        fVar50 = *(float *)(puVar20 + lVar33) - *(float *)(puVar24 + lVar33);
      }
      else {
        fVar43 = 0.0;
        if (*(int *)(&UNK_00004b64 + lVar28) == 2) {
          fVar50 = 0.0;
          if (*(char *)(lVar28 + 0xe5d) != '\0') {
            puVar20 = &UNK_00002eb0;
            fVar43 = *(float *)(&UNK_00002e90 + lVar33) - *(float *)(&UNK_00002e80 + lVar33);
            puVar24 = &UNK_00002ea0;
            goto code_r0x000cdb50;
          }
        }
        else {
          fVar50 = 0.0;
        }
      }
      if ((fVar43 != 0.0) || (fVar50 != 0.0)) {
        fVar52 = *(float *)(lVar28 + 0x50);
        if (*(float *)(lVar28 + 0x54) <= *(float *)(lVar28 + 0x50)) {
          fVar52 = *(float *)(lVar28 + 0x54);
        }
        fVar52 = *(float *)(lVar28 + 0x18) * 600.0 * fVar52;
        fVar43 = *pfVar27 + fVar43 * fVar52;
        fVar50 = *(float *)(&UNK_00004d44 + lVar28) + fVar50 * fVar52;
        *pfVar27 = fVar43;
        *(float *)(&UNK_00004d44 + lVar28) = fVar50;
        fVar41 = (fVar41 - *(float *)(unaff_x20 + 5)) - *(float *)(unaff_x20 + 6);
        fVar35 = (fVar35 - *(float *)((long)unaff_x20 + 0x2c)) - *(float *)((long)unaff_x20 + 0x34);
        if (fVar43 < fVar41) {
          fVar43 = fVar41;
        }
        if (fVar50 < fVar35) {
          fVar50 = fVar35;
        }
        *pfVar27 = fVar43;
        *(float *)(&UNK_00004d44 + lVar28) = fVar50;
        (&UNK_00004d30)[lVar28] = 0;
        (&UNK_00004b7b)[lVar28] = 1;
        uVar42 = func_0x000bba44(0x3f800000,0x20);
        *(undefined4 *)(unaff_x29 + -0xb0) = uVar42;
        if ((int)fVar43 != 0 || (int)fVar50 != 0) {
          fVar41 = (float)(int)fVar50;
          fVar35 = *(float *)((long)unaff_x20 + 0x3c) + fVar41;
          uVar42 = func_0x000d1c94();
          *(undefined4 *)(unaff_x29 + -0xe8) = uVar42;
          *(float *)(unaff_x29 + -0xe4) = fVar35;
          *pfVar27 = *pfVar27 - (float)(int)fVar43;
          *(float *)(&UNK_00004d44 + lVar28) = *(float *)(&UNK_00004d44 + lVar28) - fVar41;
        }
      }
    }
    fVar41 = *(float *)(unaff_x20 + 7);
    fVar43 = *(float *)(unaff_x29 + -0xe8);
    fVar35 = fVar41;
    if (fVar43 != 3.4028235e+38) {
      bVar14 = false;
      if ((*(float *)(unaff_x20 + 6) == fVar43) && (bVar14 = false, !NAN(fVar41) && !NAN(fVar43))) {
        bVar14 = fVar41 == fVar43;
      }
      if (!bVar14) {
        *(float *)(unaff_x20 + 7) = fVar43;
        *(float *)(unaff_x20 + 6) = fVar43;
        fVar35 = fVar43;
      }
    }
    fVar52 = *(float *)((long)unaff_x20 + 0x3c);
    fVar50 = *(float *)(unaff_x29 + -0xe4);
    fVar43 = fVar52;
    if (fVar50 != 3.4028235e+38) {
      bVar14 = false;
      if ((*(float *)((long)unaff_x20 + 0x34) == fVar50) &&
         (bVar14 = false, !NAN(fVar52) && !NAN(fVar50))) {
        bVar14 = fVar52 == fVar50;
      }
      if (!bVar14) {
        *(float *)((long)unaff_x20 + 0x3c) = fVar50;
        *(float *)((long)unaff_x20 + 0x34) = fVar50;
        fVar43 = fVar50;
      }
    }
    fVar37 = *(float *)(unaff_x20 + 5);
    fVar44 = *(float *)((long)unaff_x20 + 0x2c);
    fVar50 = fVar37;
    if (((float)uStack0000000000000070 != 3.4028235e+38) &&
       (fVar38 = (float)(int)(float)uStack0000000000000070, fVar37 != fVar38)) {
      *pfStack0000000000000108 = fVar38;
      fVar50 = fVar38;
    }
    fVar38 = fVar44;
    if ((fVar56 != 3.4028235e+38) && (fVar56 = (float)(int)fVar56, fVar44 != fVar56)) {
      *(float *)((long)unaff_x20 + 0x2c) = fVar56;
      fVar38 = fVar56;
    }
    if (((((fVar37 != fVar50) || (fVar44 != fVar38)) || (fVar41 != fVar35)) || (fVar52 != fVar43))
       && (((*(byte *)((long)unaff_x20 + 0x15) & 1) == 0 &&
           (*(float *)(&UNK_00005f5c + lRam0000000000a334c0) <= 0.0)))) {
      *(float *)(&UNK_00005f5c + lRam0000000000a334c0) = *(float *)(lRam0000000000a334c0 + 0x1c);
    }
    if ((uStack00000000000000c4 != 0) &&
       (uStack0000000000000140 = uStack0000000000000140 | uStack00000000000000c4,
       uStack00000000000000c4 != 1)) {
      uStack0000000000000148 = 1;
    }
  }
  *(undefined1 *)((long)unaff_x20 + 0xc9) = 0xff;
  *(undefined1 *)((long)unaff_x20 + 0xca) = 0xff;
  uStack00000000000001c8 = *(float *)(unaff_x20 + 7);
  if (*(char *)((long)unaff_x20 + 0xc1) == '\0') {
    fVar56 = 0.0;
    fVar35 = 0.0;
    if ((in_stack_00000198 & 0x100000000) == 0) {
      fVar56 = *(float *)(unaff_x20 + 0xb) + *(float *)(unaff_x20 + 0xb) + *(float *)(unaff_x20 + 8)
      ;
      fVar35 = *(float *)((long)unaff_x20 + 0x5c) + *(float *)((long)unaff_x20 + 0x5c) +
               *(float *)((long)unaff_x20 + 0x44);
    }
    if ((uStack0000000000000140 & 1) == 0) {
      uStack00000000000001c8 =
           fVar57 + (*(float *)(unaff_x20 + 0x42) - *(float *)(unaff_x20 + 0x41));
    }
    fVar41 = *(float *)((long)unaff_x20 + 0x3c) -
             (*(float *)((long)unaff_x20 + 0x6c) + *(float *)((long)unaff_x20 + 0x74));
    if (uStack0000000000000148 == 0) {
      fVar41 = fVar59 + (*(float *)((long)unaff_x20 + 0x214) - *(float *)((long)unaff_x20 + 0x20c));
    }
    if ((in_stack_000001b0._4_4_ >> 0xe & 1) == 0) {
      uVar22 = in_stack_000001b0._4_4_ & 8;
      bVar14 = (in_stack_000001b0 & 0x800000000) == 0 && fVar41 < fVar35;
      *(bool *)((long)unaff_x20 + 0xbd) = bVar14;
      if ((in_stack_000001b0._4_4_ >> 0xf & 1) == 0) {
        if (bVar14) goto code_r0x000cb014;
        if (!(fVar56 <= uStack00000000000001c8 - 0.0 || (in_stack_000001b0 & 0x800000000) != 0))
        goto code_r0x000caf38;
code_r0x000cb030:
        uVar19 = 0;
        *(undefined1 *)((long)unaff_x20 + 0xbc) = 0;
      }
      else {
        uVar19 = 1;
        *(undefined1 *)((long)unaff_x20 + 0xbc) = 1;
        if (!bVar14) {
code_r0x000cb048:
          bVar14 = fVar41 < fVar35 && uVar22 == 0;
          *(bool *)((long)unaff_x20 + 0xbd) = bVar14;
          uVar19 = 1;
        }
      }
code_r0x000cb05c:
      if (bVar14) {
        fVar35 = *(float *)(&UNK_0000395c + in_stack_000001b8);
      }
      else {
        fVar35 = 0.0;
      }
      if (uVar19 != 0) goto code_r0x000cb06c;
      fVar56 = 0.0;
    }
    else {
      *(undefined1 *)((long)unaff_x20 + 0xbd) = 1;
      if ((in_stack_000001b0._4_4_ >> 0xf & 1) == 0) {
code_r0x000cb014:
        bVar14 = true;
        if (!(uStack00000000000001c8 - *(float *)(&UNK_0000395c + in_stack_000001b8) < fVar56 &&
             (in_stack_000001b0 & 0x800000000) == 0)) goto code_r0x000cb030;
code_r0x000caf38:
        uVar19 = (in_stack_000001b0._4_4_ & 0x800) >> 0xb;
        *(char *)((long)unaff_x20 + 0xbc) = (char)uVar19;
        bVar13 = bVar14;
        if ((in_stack_000001b0 & 0x80000000000) == 0) {
          bVar13 = true;
        }
        if (!bVar13) {
          uVar22 = 0;
          goto code_r0x000cb048;
        }
        goto code_r0x000cb05c;
      }
      *(undefined1 *)((long)unaff_x20 + 0xbc) = 1;
      fVar35 = *(float *)(&UNK_0000395c + in_stack_000001b8);
code_r0x000cb06c:
      fVar56 = *(float *)(&UNK_0000395c + in_stack_000001b8);
    }
    *(float *)((long)unaff_x20 + 0xb4) = fVar35;
    *(float *)(unaff_x20 + 0x17) = fVar56;
    *(float *)(unaff_x20 + 0xe) = fVar35 + *(float *)(unaff_x20 + 0xe);
    *(float *)((long)unaff_x20 + 0x74) = *(float *)((long)unaff_x20 + 0x74) + fVar56;
    uStack00000000000001c8 = *(float *)(unaff_x20 + 7);
  }
  if (uVar25 == 0x3000000) {
    bVar15 = true;
  }
  puVar9 = &uStack00000000000001e0;
  if (!bVar15) {
    puVar9 = (ulong *)(in_stack_00000188 + 0x248);
  }
  in_stack_000001d8 = puVar9[1];
  uVar54 = *puVar9;
  uStack00000000000001c0 = *(float *)(unaff_x20 + 5);
  fStack00000000000001c4 = *(float *)((long)unaff_x20 + 0x2c);
  fVar35 = (float)unaff_x20[6];
  fVar56 = uStack00000000000001c0 + fVar35;
  fVar41 = fStack00000000000001c4 + (float)((ulong)unaff_x20[6] >> 0x20);
  fStack00000000000001cc = 0.0;
  if ((*(byte *)((long)unaff_x20 + 0x14) & 1) == 0) {
    fStack00000000000001cc = *(float *)(&UNK_00003d3c + *unaff_x20) * *(float *)(unaff_x20 + 0x54);
    if (unaff_x20[0x6f] != 0) {
      fStack00000000000001cc = fStack00000000000001cc * *(float *)(unaff_x20[0x6f] + 0x2a0);
    }
    fStack00000000000001cc = fStack00000000000001cc + *(float *)(&UNK_00003928 + *unaff_x20) * 2.0;
  }
  uStack00000000000001c8 = uStack00000000000001c0 + uStack00000000000001c8;
  fStack00000000000001cc = fStack00000000000001c4 + fStack00000000000001cc;
  pfVar27 = (float *)((long)unaff_x20 + 100);
  fVar57 = *pfVar27;
  *(float *)((long)unaff_x20 + 0x1fc) = fStack00000000000001c4;
  *(float *)((long)unaff_x20 + 0x204) = fVar41;
  uStack00000000000001d0._0_4_ = (float)uVar54;
  uStack00000000000001d0._4_4_ = (float)(uVar54 >> 0x20);
  fVar43 = uStack00000000000001c0;
  if (uStack00000000000001c0 < (float)uStack00000000000001d0) {
    fVar43 = (float)uStack00000000000001d0;
  }
  fVar59 = fStack00000000000001c4;
  if (fStack00000000000001c4 < uStack00000000000001d0._4_4_) {
    fVar59 = uStack00000000000001d0._4_4_;
  }
  *(float *)(unaff_x20 + 0x3f) = fVar43;
  *(float *)((long)unaff_x20 + 0x1fc) = fVar59;
  fVar50 = (float)in_stack_000001d8;
  fVar52 = (float)(in_stack_000001d8 >> 0x20);
  unaff_x20[0x40] =
       in_stack_000001d8 ^
       (in_stack_000001d8 ^ CONCAT44(fVar41,fVar56)) &
       CONCAT44(-(uint)(fVar41 < fVar52),-(uint)(fVar56 < fVar50));
  fVar43 = uStack00000000000001c0 + (float)unaff_x20[0xd];
  fVar59 = fStack00000000000001c4 + (float)((ulong)unaff_x20[0xd] >> 0x20);
  fVar56 = fVar56 - (float)unaff_x20[0xe];
  fVar41 = fVar41 - (float)((ulong)unaff_x20[0xe] >> 0x20);
  unaff_x22[1] = CONCAT44(fVar41,fVar56);
  *unaff_x22 = CONCAT44(fVar59,fVar43);
  pfVar34 = pfVar27;
  if ((in_stack_000001b0._4_4_ & 0x401) != 1) {
    pfVar34 = (float *)(&UNK_00003930 + in_stack_000001b8);
  }
  fVar44 = (float)(int)(*(float *)(unaff_x20 + 0xb) * 0.5);
  if ((float)(int)(*(float *)(unaff_x20 + 0xb) * 0.5) < fVar57) {
    fVar44 = fVar57;
  }
  uVar47 = NEON_scvtf(CONCAT44((int)(fVar59 + 0.5 + *pfVar34),(int)(fVar43 + 0.5 + fVar44)),4);
  fVar37 = (float)(uVar47 >> 0x20);
  *(float *)((long)unaff_x20 + 0x21c) = fVar37;
  uVar55 = NEON_scvtf(CONCAT44((int)((fVar41 + 0.5) - fVar57),(int)((fVar56 + 0.5) - fVar44)),4);
  fVar57 = (float)(uVar55 >> 0x20);
  *(float *)((long)unaff_x20 + 0x224) = fVar57;
  uVar51 = uVar47 ^ (uVar47 ^ in_stack_000001d8) &
                    CONCAT44(-(uint)(fVar52 < fVar37),-(uint)(fVar50 < (float)uVar47));
  unaff_x20[0x43] =
       uVar51 ^ (uVar51 ^ uVar54) &
                CONCAT44(-(uint)(fVar37 < uStack00000000000001d0._4_4_),
                         -(uint)((float)uVar47 < (float)uStack00000000000001d0));
  uVar47 = uVar55 ^ (uVar55 ^ in_stack_000001d8) &
                    CONCAT44(-(uint)(fVar52 < fVar57),-(uint)(fVar50 < (float)uVar55));
  unaff_x20[0x44] =
       uVar47 ^ (uVar47 ^ uVar54) &
                CONCAT44(-(uint)(fVar57 < uStack00000000000001d0._4_4_),
                         -(uint)((float)uVar55 < (float)uStack00000000000001d0));
  if ((((in_stack_000001b0._4_4_ >> 6 & 1) != 0) || (fVar35 <= 0.0)) ||
     ((in_stack_000001b0._4_4_ >> 0x19 & 1) != 0)) {
    fVar35 = *(float *)(&UNK_00003d38 + in_stack_000001b8) * 16.0;
  }
  else {
    fVar35 = fVar35 * 0.65;
  }
  *(float *)(unaff_x20 + 0x4f) = (float)(int)fVar35;
  fVar35 = ((float)unaff_x20[8] + (float)unaff_x20[0xb] * 2.0) - (fVar56 - fVar43);
  fVar56 = ((float)((ulong)unaff_x20[8] >> 0x20) + (float)((ulong)unaff_x20[0xb] >> 0x20) * 2.0) -
           (fVar41 - fVar59);
  iVar16 = -(uint)(fVar35 <= 0.0);
  iVar45 = -(uint)(fVar56 <= 0.0);
  *(ulong *)((long)unaff_x20 + 0x94) =
       CONCAT17((byte)((uint)fVar56 >> 0x18) & ~(byte)((uint)iVar45 >> 0x18),
                CONCAT16((byte)((uint)fVar56 >> 0x10) & ~(byte)((uint)iVar45 >> 0x10),
                         CONCAT15((byte)((uint)fVar56 >> 8) & ~(byte)((uint)iVar45 >> 8),
                                  CONCAT14(SUB41(fVar56,0) & ~(byte)iVar45,
                                           CONCAT13((byte)((uint)fVar35 >> 0x18) &
                                                    ~(byte)((uint)iVar16 >> 0x18),
                                                    CONCAT12((byte)((uint)fVar35 >> 0x10) &
                                                             ~(byte)((uint)iVar16 >> 0x10),
                                                             CONCAT11((byte)((uint)fVar35 >> 8) &
                                                                      ~(byte)((uint)iVar16 >> 8),
                                                                      SUB41(fVar35,0) &
                                                                      ~(byte)iVar16)))))));
  uStack00000000000001d0 = uVar54;
  uVar42 = func_0x000d2840();
  *(undefined4 *)((long)unaff_x20 + 0x8c) = uVar42;
  *(int *)(unaff_x20 + 0x12) = iVar16;
  *(undefined8 *)((long)unaff_x20 + 0x9c) = 0x7f7fffff7f7fffff;
  unaff_x20[0xf] = 0;
  func_0x000f0b5c(unaff_x20[0x55],
                  *(undefined8 *)
                   (*(long *)(*(long *)(&UNK_00003d30 + in_stack_000001b8) + 0x40) + 8));
  lVar33 = *(long *)(lRam0000000000a334c0 + 0x4000);
  *(undefined1 *)(lVar33 + 0xc0) = 1;
  func_0x000f0930(*(undefined8 *)(lVar33 + 0x2a8),&uStack00000000000001d0,
                  (ulong)&uStack00000000000001d0 | 8,0);
  lVar28 = *(long *)(*(long *)(lVar33 + 0x2a8) + 0x60) +
           (long)*(int *)(*(long *)(lVar33 + 0x2a8) + 0x58) * 0x10;
  uVar39 = *(undefined8 *)(lVar28 + -0x10);
  *(undefined8 *)(lVar33 + 0x250) = *(undefined8 *)(lVar28 + -8);
  *(undefined8 *)(lVar33 + 0x248) = uVar39;
  if (bVar15) {
    bVar14 = false;
  }
  else {
    if ((*(int *)(in_stack_00000188 + 0x1a0) < 2) ||
       (lVar28 = *(long *)(*(long *)(in_stack_00000188 + 0x1a8) +
                          (ulong)(*(int *)(in_stack_00000188 + 0x1a0) - 2) * 8), lVar28 == 0)) {
      bVar15 = false;
    }
    else {
      bVar15 = false;
      if ((*(float *)((long)unaff_x20 + 0x2c) <
           *(float *)(lVar28 + 0x2c) + *(float *)(lVar28 + 0x34)) &&
         (*(float *)(lVar28 + 0x2c) <
          *(float *)((long)unaff_x20 + 0x2c) + *(float *)((long)unaff_x20 + 0x34))) {
        if (*(float *)(unaff_x20 + 5) < *(float *)(lVar28 + 0x28) + *(float *)(lVar28 + 0x30)) {
          bVar15 = *(float *)(lVar28 + 0x28) < *(float *)(unaff_x20 + 5) + *(float *)(unaff_x20 + 6)
          ;
        }
      }
    }
    bVar14 = false;
    if (((*(int *)(*(long *)((int *)unaff_x20[0x55] + 2) + (long)*(int *)unaff_x20[0x55] * 0x38 +
                  -0x18) == 0) && (*(int *)(*(long *)(in_stack_00000188 + 0x2a8) + 0x20) != 0)) &&
       (!bVar15)) {
      unaff_x20[0x55] = *(long *)(in_stack_00000188 + 0x2a8);
      bVar14 = true;
    }
  }
  lVar28 = lRam0000000000a334c0;
  lVar33 = *(long *)(&UNK_00004d10 + in_stack_000001b8);
  if (lVar33 == 0) {
    lVar33 = *(long *)(&UNK_00004b18 + in_stack_000001b8);
    if ((uStack0000000000000144 & 1) == 0) goto code_r0x000cb408;
code_r0x000cb3f4:
    bVar15 = true;
  }
  else {
    if ((uStack0000000000000144 & 1) != 0) goto code_r0x000cb3f4;
code_r0x000cb408:
    if (lVar33 == 0) {
      bVar15 = false;
    }
    else {
      bVar15 = unaff_x20[0x73] == *(long *)(lVar33 + 0x398);
    }
  }
  pbVar4 = &UNK_000049f8 + lRam0000000000a334c0;
  uVar25 = *(uint *)((long)unaff_x20 + 0x14);
  *(undefined1 *)((long)unaff_x20 + 0xc3) = 0;
  fVar35 = *(float *)(unaff_x20 + 0xc);
  fVar56 = *(float *)((long)unaff_x20 + 100);
  if (*(char *)((long)unaff_x20 + 0xc1) == '\0') {
    if ((uVar25 >> 7 & 1) == 0) {
      lVar33 = 2;
      if ((uVar25 & 0x1000000) != 0) {
        lVar33 = 3;
      }
      if ((uVar25 & 0x6000000) != 0) {
        lVar33 = 4;
      }
      lVar33 = lVar33 * 0x10 + lVar28;
      fVar43 = *(float *)(&UNK_000038e8 + lVar33 + 0xe4);
      fVar57 = *(float *)(&UNK_000038e8 + lVar33 + 0xf0) * *(float *)(&UNK_000038e8 + lVar28);
      fVar41 = 1.0;
      if (fVar43 <= 1.0) {
        fVar41 = fVar43;
      }
      fVar50 = 0.0;
      fVar59 = 0.0;
      if (0.0 <= fVar43) {
        fVar59 = fVar41;
      }
      uVar54 = *(ulong *)(&UNK_000038e8 + lVar33 + 0xe8);
      uVar55 = NEON_fmov(0x3f800000,4);
      fVar41 = (float)(uVar54 >> 0x20);
      uVar55 = uVar55 ^ (uVar55 ^ uVar54) &
                        ~CONCAT44(-(uint)((float)(uVar55 >> 0x20) < fVar41),
                                  -(uint)((float)uVar55 < (float)uVar54));
      iVar16 = -(uint)((float)uVar54 < 0.0);
      iVar45 = -(uint)(fVar41 < 0.0);
      fVar41 = (float)CONCAT13((byte)(uVar55 >> 0x18) & ~(byte)((uint)iVar16 >> 0x18),
                               CONCAT12((byte)(uVar55 >> 0x10) & ~(byte)((uint)iVar16 >> 0x10),
                                        CONCAT11((byte)(uVar55 >> 8) & ~(byte)((uint)iVar16 >> 8),
                                                 (byte)uVar55 & ~(byte)iVar16)));
      uVar39 = NEON_ushl(CONCAT44((int)((float)(CONCAT17((byte)(uVar55 >> 0x38) &
                                                         ~(byte)((uint)iVar45 >> 0x18),
                                                         CONCAT16((byte)(uVar55 >> 0x30) &
                                                                  ~(byte)((uint)iVar45 >> 0x10),
                                                                  CONCAT15((byte)(uVar55 >> 0x28) &
                                                                           ~(byte)((uint)iVar45 >> 8
                                                                                  ),CONCAT14((byte)(
                                                  uVar55 >> 0x20) & ~(byte)iVar45,fVar41)))) >> 0x20
                                               ) * 255.0 + 0.5),(int)(fVar41 * 255.0 + 0.5)),
                         _UNK_0080c188,4);
      uVar22 = (uint)uVar39 | (int)(fVar59 * 255.0 + 0.5) | (uint)((ulong)uVar39 >> 0x20);
      fVar41 = 1.0;
      if (fVar57 <= 1.0) {
        fVar41 = fVar57;
      }
      fVar43 = 0.0;
      if (0.0 <= fVar57) {
        fVar43 = fVar41;
      }
      if ((*pbVar4 >> 6 & 1) == 0) {
        uVar22 = uVar22 | (int)(fVar43 * 255.0 + 0.5) << 0x18;
        lVar33 = unaff_x20[0x55];
        if ((uVar25 & 1) != 0) goto code_r0x000cb54c;
code_r0x000cb67c:
        fVar50 = *(float *)(&UNK_00003d3c + *unaff_x20) * *(float *)(unaff_x20 + 0x54);
        if (unaff_x20[0x6f] != 0) {
          fVar50 = fVar50 * *(float *)(unaff_x20[0x6f] + 0x2a0);
        }
        fVar50 = fVar50 + *(float *)(&UNK_00003928 + *unaff_x20) * 2.0;
        uVar39 = 0xc0;
      }
      else {
        fVar43 = *(float *)(&UNK_00004a58 + lVar28);
        fVar41 = 1.0;
        if (fVar43 <= 1.0) {
          fVar41 = fVar43;
        }
        fVar57 = 0.0;
        if (0.0 <= fVar43) {
          fVar57 = fVar41;
        }
        uVar22 = uVar22 & 0xffffff | (int)(fVar57 * 255.0 + 0.5) << 0x18;
        lVar33 = unaff_x20[0x55];
        if ((uVar25 & 1) == 0) goto code_r0x000cb67c;
code_r0x000cb54c:
        uVar39 = 0;
      }
      fVar41 = *(float *)((long)unaff_x20 + 0x2c);
      lVar23 = unaff_x20[5];
      *(float *)(unaff_x29 + -0xd8) = *(float *)(unaff_x20 + 5) + 0.0;
      *(float *)(unaff_x29 + -0xd4) = fVar50 + fVar41;
      *(ulong *)(unaff_x29 + -0xe8) =
           CONCAT44((float)((ulong)lVar23 >> 0x20) + (float)((ulong)unaff_x20[6] >> 0x20),
                    (float)lVar23 + (float)unaff_x20[6]);
      func_0x000f3bb0(fVar35,lVar33,unaff_x29 + -0xd8,unaff_x29 + -0xe8,uVar22,uVar39);
    }
    if ((uVar25 & 1) == 0) {
      lVar33 = 0xb0;
      if (!bVar15) {
        lVar33 = 0xa0;
      }
      lVar33 = lRam0000000000a334c0 + lVar33;
      fVar43 = *(float *)(&UNK_000038e8 + lVar33 + 0xe4);
      fVar57 = *(float *)(&UNK_000038e8 + lVar33 + 0xe8);
      fVar59 = *(float *)(&UNK_000038e8 + lVar33 + 0xec);
      fVar41 = 1.0;
      if (fVar43 <= 1.0) {
        fVar41 = fVar43;
      }
      fVar50 = 0.0;
      if (0.0 <= fVar43) {
        fVar50 = fVar41;
      }
      fVar43 = *(float *)(&UNK_000038e8 + lVar33 + 0xf0) *
               *(float *)(&UNK_000038e8 + lRam0000000000a334c0);
      fVar41 = 1.0;
      if (fVar57 <= 1.0) {
        fVar41 = fVar57;
      }
      fVar52 = 0.0;
      if (0.0 <= fVar57) {
        fVar52 = fVar41;
      }
      iVar16 = -(uint)(fVar59 < 0.0);
      iVar45 = -(uint)(fVar43 < 0.0);
      uVar54 = NEON_fmov(0x3f800000,4);
      uVar54 = uVar54 ^ (uVar54 ^ CONCAT44(fVar43,fVar59)) &
                        ~CONCAT44(-(uint)((float)(uVar54 >> 0x20) < fVar43),
                                  -(uint)((float)uVar54 < fVar59));
      fVar41 = (float)CONCAT13((byte)(uVar54 >> 0x18) & ~(byte)((uint)iVar16 >> 0x18),
                               CONCAT12((byte)(uVar54 >> 0x10) & ~(byte)((uint)iVar16 >> 0x10),
                                        CONCAT11((byte)(uVar54 >> 8) & ~(byte)((uint)iVar16 >> 8),
                                                 (byte)uVar54 & ~(byte)iVar16)));
      uVar39 = NEON_ushl(CONCAT44((int)((float)(CONCAT17((byte)(uVar54 >> 0x38) &
                                                         ~(byte)((uint)iVar45 >> 0x18),
                                                         CONCAT16((byte)(uVar54 >> 0x30) &
                                                                  ~(byte)((uint)iVar45 >> 0x10),
                                                                  CONCAT15((byte)(uVar54 >> 0x28) &
                                                                           ~(byte)((uint)iVar45 >> 8
                                                                                  ),CONCAT14((byte)(
                                                  uVar54 >> 0x20) & ~(byte)iVar45,fVar41)))) >> 0x20
                                               ) * 255.0 + 0.5),(int)(fVar41 * 255.0 + 0.5)),
                         _UNK_0080c190,4);
      func_0x000f3bb0(fVar35,unaff_x20[0x55],&uStack00000000000001c0,&uStack00000000000001c8,
                      (int)(fVar50 * 255.0 + 0.5) | (int)(fVar52 * 255.0 + 0.5) << 8 | (uint)uVar39
                      | (uint)((ulong)uVar39 >> 0x20),0x30);
    }
    if ((uVar25 >> 10 & 1) != 0) {
      fVar43 = 0.0;
      fVar41 = 0.0;
      if ((*(uint *)((long)unaff_x20 + 0x14) & 1) == 0) {
        fVar41 = *(float *)(&UNK_00003d3c + *unaff_x20) * *(float *)(unaff_x20 + 0x54);
        if (unaff_x20[0x6f] != 0) {
          fVar41 = fVar41 * *(float *)(unaff_x20[0x6f] + 0x2a0);
        }
        fVar41 = fVar41 + *(float *)(&UNK_00003928 + *unaff_x20) * 2.0;
      }
      fVar59 = *(float *)(unaff_x20 + 5);
      fVar57 = *(float *)((long)unaff_x20 + 0x2c);
      if ((*(uint *)((long)unaff_x20 + 0x14) >> 10 & 1) != 0) {
        fVar43 = *(float *)(&UNK_00003d3c + *unaff_x20) * *(float *)(unaff_x20 + 0x54);
        if (unaff_x20[0x6f] != 0) {
          fVar43 = fVar43 * *(float *)(unaff_x20[0x6f] + 0x2a0);
        }
        fVar43 = *(float *)(unaff_x20 + 0x2f) + fVar43 +
                 *(float *)(&UNK_00003928 + *unaff_x20) * 2.0;
      }
      fVar41 = fVar57 + fVar41;
      fVar52 = fVar57 + *(float *)((long)unaff_x20 + 0x34);
      fVar50 = fVar41;
      if (fVar41 < fVar57) {
        fVar50 = fVar57;
      }
      fVar57 = fVar59 + *(float *)(unaff_x20 + 7);
      if (fVar59 + *(float *)(unaff_x20 + 6) <= fVar59 + *(float *)(unaff_x20 + 7)) {
        fVar57 = fVar59 + *(float *)(unaff_x20 + 6);
      }
      fVar44 = fVar41 + fVar43;
      if (fVar52 <= fVar41 + fVar43) {
        fVar44 = fVar52;
      }
      lVar33 = unaff_x20[0x55];
      *(float *)(unaff_x29 + -0xd8) = fVar56 + fVar59;
      *(float *)(unaff_x29 + -0xd4) = fVar50 + 0.0;
      *(float *)(unaff_x29 + -0xe8) = fVar57 - fVar56;
      *(float *)(unaff_x29 + -0xe4) = fVar44;
      uVar39 = _UNK_0080c190;
      fVar43 = *(float *)(&UNK_00003a9c + lRam0000000000a334c0);
      fVar50 = *(float *)(&UNK_00003aa0 + lRam0000000000a334c0);
      fVar41 = 1.0;
      if (fVar43 <= 1.0) {
        fVar41 = fVar43;
      }
      fVar52 = 0.0;
      if (0.0 <= fVar43) {
        fVar52 = fVar41;
      }
      fVar43 = *(float *)(&UNK_00003aa8 + lRam0000000000a334c0) *
               *(float *)(&UNK_000038e8 + lRam0000000000a334c0);
      fVar37 = *(float *)(&UNK_00003aa4 + lRam0000000000a334c0);
      fVar41 = 1.0;
      if (fVar50 <= 1.0) {
        fVar41 = fVar50;
      }
      fVar38 = 0.0;
      if (0.0 <= fVar50) {
        fVar38 = fVar41;
      }
      iVar16 = -(uint)(fVar37 < 0.0);
      iVar45 = -(uint)(fVar43 < 0.0);
      uVar55 = NEON_fmov(0x3f800000,4);
      fVar50 = (float)(uVar55 >> 0x20);
      uVar54 = CONCAT44(fVar43,fVar37) ^
               (CONCAT44(fVar43,fVar37) ^ uVar55) &
               CONCAT44(-(uint)(fVar50 < fVar43),-(uint)((float)uVar55 < fVar37));
      fVar41 = (float)CONCAT13((byte)(uVar54 >> 0x18) & ~(byte)((uint)iVar16 >> 0x18),
                               CONCAT12((byte)(uVar54 >> 0x10) & ~(byte)((uint)iVar16 >> 0x10),
                                        CONCAT11((byte)(uVar54 >> 8) & ~(byte)((uint)iVar16 >> 8),
                                                 (byte)uVar54 & ~(byte)iVar16)));
      uVar40 = NEON_ushl(CONCAT44((int)((float)(CONCAT17((byte)(uVar54 >> 0x38) &
                                                         ~(byte)((uint)iVar45 >> 0x18),
                                                         CONCAT16((byte)(uVar54 >> 0x30) &
                                                                  ~(byte)((uint)iVar45 >> 0x10),
                                                                  CONCAT15((byte)(uVar54 >> 0x28) &
                                                                           ~(byte)((uint)iVar45 >> 8
                                                                                  ),CONCAT14((byte)(
                                                  uVar54 >> 0x20) & ~(byte)iVar45,fVar41)))) >> 0x20
                                               ) * 255.0 + 0.5),(int)(fVar41 * 255.0 + 0.5)),
                         _UNK_0080c190,4);
      fVar41 = 0.0;
      if ((uVar25 & 1) != 0) {
        fVar41 = fVar35;
      }
      func_0x000f3bb0(fVar41,lVar33,unaff_x29 + -0xd8,unaff_x29 + -0xe8,
                      (int)(fVar52 * 255.0 + 0.5) | (int)(fVar38 * 255.0 + 0.5) << 8 | (uint)uVar40
                      | (uint)((ulong)uVar40 >> 0x20),0x30);
      if ((0.0 < *(float *)(&UNK_00003930 + lVar28)) &&
         (fVar44 < *(float *)((long)unaff_x20 + 0x2c) + *(float *)((long)unaff_x20 + 0x34))) {
        lVar28 = unaff_x20[0x55];
        *(float *)(unaff_x29 + -0xd8) = fVar59;
        *(float *)(unaff_x29 + -0xd4) = fVar44;
        *(float *)(unaff_x29 + -0xe8) = fVar57;
        *(float *)(unaff_x29 + -0xe4) = fVar44;
        fVar43 = *(float *)(&UNK_00003a1c + lRam0000000000a334c0);
        fVar57 = *(float *)(&UNK_00003a20 + lRam0000000000a334c0);
        fVar59 = *(float *)(&UNK_00003a28 + lRam0000000000a334c0) *
                 *(float *)(&UNK_000038e8 + lRam0000000000a334c0);
        fVar41 = 1.0;
        if (fVar43 <= 1.0) {
          fVar41 = fVar43;
        }
        fVar52 = 0.0;
        if (0.0 <= fVar43) {
          fVar52 = fVar41;
        }
        fVar43 = *(float *)(&UNK_00003a24 + lRam0000000000a334c0);
        fVar41 = 1.0;
        if (fVar57 <= 1.0) {
          fVar41 = fVar57;
        }
        fVar44 = 0.0;
        if (0.0 <= fVar57) {
          fVar44 = fVar41;
        }
        iVar16 = -(uint)(fVar43 < 0.0);
        iVar45 = -(uint)(fVar59 < 0.0);
        uVar54 = CONCAT44(fVar59,fVar43) ^
                 (CONCAT44(fVar59,fVar43) ^ uVar55) &
                 CONCAT44(-(uint)(fVar50 < fVar59),-(uint)((float)uVar55 < fVar43));
        fVar41 = (float)CONCAT13((byte)(uVar54 >> 0x18) & ~(byte)((uint)iVar16 >> 0x18),
                                 CONCAT12((byte)(uVar54 >> 0x10) & ~(byte)((uint)iVar16 >> 0x10),
                                          CONCAT11((byte)(uVar54 >> 8) & ~(byte)((uint)iVar16 >> 8),
                                                   (byte)uVar54 & ~(byte)iVar16)));
        uVar39 = NEON_ushl(CONCAT44((int)((float)(CONCAT17((byte)(uVar54 >> 0x38) &
                                                           ~(byte)((uint)iVar45 >> 0x18),
                                                           CONCAT16((byte)(uVar54 >> 0x30) &
                                                                    ~(byte)((uint)iVar45 >> 0x10),
                                                                    CONCAT15((byte)(uVar54 >> 0x28)
                                                                             & ~(byte)((uint)iVar45
                                                                                      >> 8),
                                                                             CONCAT14((byte)(uVar54 
                                                  >> 0x20) & ~(byte)iVar45,fVar41)))) >> 0x20) *
                                          255.0 + 0.5),(int)(fVar41 * 255.0 + 0.5)),uVar39,4);
        func_0x000f397c(lVar28,unaff_x29 + -0xd8,unaff_x29 + -0xe8,
                        (int)(fVar52 * 255.0 + 0.5) | (int)(fVar44 * 255.0 + 0.5) << 8 |
                        (uint)uVar39 | (uint)((ulong)uVar39 >> 0x20));
      }
    }
    if (*(char *)((long)unaff_x20 + 0xbc) != '\0') {
      func_0x0010c5f4(0);
    }
    if (*(char *)((long)unaff_x20 + 0xbd) != '\0') {
      func_0x0010c5f4(1);
    }
    if ((in_stack_00000138._4_4_ != 0) && ((uVar25 >> 1 & 1) == 0)) {
      uVar54 = 0;
      iVar16 = (int)fStack0000000000000114;
      pfVar34 = (float *)&UNK_0080c9ec;
      do {
        uVar25 = *(uint *)(unaff_x29 + -0xb0 + uVar54 * 4);
        if ((uVar25 & 0xff000000) != 0) {
          fVar59 = *(float *)(unaff_x20 + 5);
          fVar50 = *(float *)((long)unaff_x20 + 0x2c);
          fVar52 = *(float *)(unaff_x20 + 6);
          fVar57 = *(float *)((long)unaff_x20 + 0x34);
          fVar37 = pfVar34[-3];
          fVar44 = pfVar34[-2];
          lVar28 = unaff_x20[0x55];
          fVar43 = fVar56;
          fVar41 = (float)iVar16;
          if ((uVar54 & 1) != 0) {
            fVar43 = (float)iVar16;
            fVar41 = fVar56;
          }
          fVar38 = pfVar34[-1];
          fVar53 = *pfVar34;
          piVar31 = (int *)(lVar28 + 0x78);
          iVar45 = *piVar31;
          if (iVar45 == *(int *)(lVar28 + 0x7c)) {
            iVar7 = iVar45;
            if (iVar45 < 0) {
              iVar7 = iVar45 + 1;
            }
            iVar8 = 8;
            if (iVar45 != 0) {
              iVar8 = iVar45 + (iVar7 >> 1);
            }
            if (iVar8 <= iVar45 + 1) {
              iVar8 = iVar45 + 1;
            }
            func_0x000cef5c(piVar31,iVar8);
            iVar45 = *piVar31;
          }
          fVar59 = fVar59 + fVar37 * ((fVar59 + fVar52) - fVar59);
          fVar50 = fVar50 + fVar44 * ((fVar50 + fVar57) - fVar50);
          pfVar1 = (float *)(*(long *)(lVar28 + 0x80) + (long)iVar45 * 8);
          *pfVar1 = fVar59 + fVar41 * fVar38;
          pfVar1[1] = fVar50 + fVar43 * fVar53;
          *(int *)(lVar28 + 0x78) = *(int *)(lVar28 + 0x78) + 1;
          lVar28 = unaff_x20[0x55];
          piVar31 = (int *)(lVar28 + 0x78);
          iVar45 = *piVar31;
          if (iVar45 == *(int *)(lVar28 + 0x7c)) {
            iVar7 = iVar45;
            if (iVar45 < 0) {
              iVar7 = iVar45 + 1;
            }
            iVar8 = 8;
            if (iVar45 != 0) {
              iVar8 = iVar45 + (iVar7 >> 1);
            }
            if (iVar8 <= iVar45 + 1) {
              iVar8 = iVar45 + 1;
            }
            func_0x000cef5c(piVar31,iVar8);
            iVar45 = *piVar31;
          }
          pfVar1 = (float *)(*(long *)(lVar28 + 0x80) + (long)iVar45 * 8);
          *pfVar1 = fVar59 + fVar43 * fVar38;
          pfVar1[1] = fVar50 + fVar41 * fVar53;
          *(int *)(lVar28 + 0x78) = *(int *)(lVar28 + 0x78) + 1;
          lVar28 = unaff_x20[0x55];
          *(float *)(unaff_x29 + -0xd8) = fVar59 + (fVar35 + fVar56) * fVar38;
          *(float *)(unaff_x29 + -0xd4) = fVar50 + (fVar35 + fVar56) * fVar53;
          func_0x000f23c0(fVar35,lVar28,unaff_x29 + -0xd8,pfVar34[1],pfVar34[2]);
          lVar28 = unaff_x20[0x55];
          func_0x000f1888(lVar28,*(undefined8 *)(lVar28 + 0x80),*(undefined4 *)(lVar28 + 0x78),
                          uVar25);
          *(undefined4 *)(lVar28 + 0x78) = 0;
        }
        uVar54 = uVar54 + 1;
        pfVar34 = pfVar34 + 6;
      } while (in_stack_00000138._4_4_ != uVar54);
    }
    lVar28 = lRam0000000000a334c0;
    fVar59 = *pfVar27;
    fVar56 = *(float *)(&UNK_00003a1c + lRam0000000000a334c0);
    fVar41 = *(float *)(&UNK_00003a20 + lRam0000000000a334c0);
    fVar43 = *(float *)(&UNK_00003a24 + lRam0000000000a334c0);
    fVar57 = *(float *)(&UNK_00003a28 + lRam0000000000a334c0) *
             *(float *)(&UNK_000038e8 + lRam0000000000a334c0);
    fVar35 = 1.0;
    if (fVar56 <= 1.0) {
      fVar35 = fVar56;
    }
    fVar50 = 0.0;
    if (0.0 <= fVar56) {
      fVar50 = fVar35;
    }
    fVar35 = 1.0;
    if (fVar41 <= 1.0) {
      fVar35 = fVar41;
    }
    fVar56 = 0.0;
    if (0.0 <= fVar41) {
      fVar56 = fVar35;
    }
    fVar35 = 1.0;
    if (fVar43 <= 1.0) {
      fVar35 = fVar43;
    }
    fVar41 = 0.0;
    if (0.0 <= fVar43) {
      fVar41 = fVar35;
    }
    fVar35 = 1.0;
    if (fVar57 <= 1.0) {
      fVar35 = fVar57;
    }
    fVar43 = 0.0;
    if (0.0 <= fVar57) {
      fVar43 = fVar35;
    }
    uVar25 = (int)(fVar50 * 255.0 + 0.5) | (int)(fVar56 * 255.0 + 0.5) << 8 |
             (int)(fVar41 * 255.0 + 0.5) << 0x10 | (int)(fVar43 * 255.0 + 0.5) << 0x18;
    if (0.0 < fVar59) {
      if (*(char *)((long)unaff_x20 + 0x14) < '\0') {
        uVar22 = *(uint *)(unaff_x20 + 3);
        if ((uVar22 >> 2 & 1) != 0) {
          fVar41 = *(float *)(unaff_x20 + 0xc);
          fVar35 = *(float *)(unaff_x20 + 5) + *(float *)(unaff_x20 + 6) + -1.0;
          fVar56 = fVar41 + *(float *)((long)unaff_x20 + 0x2c);
          lVar33 = unaff_x20[0x55];
          fVar43 = ((*(float *)((long)unaff_x20 + 0x2c) + *(float *)((long)unaff_x20 + 0x34) + -1.0)
                   - fVar41) - fVar56;
          fVar35 = (fVar35 + (fVar35 - fVar35) + 0.5) - fVar41;
          *(float *)(unaff_x29 + -0xd8) = fVar35;
          *(float *)(unaff_x29 + -0xd4) = fVar41 * 0.0 + fVar56 + fVar43 * 0.0 + 0.5;
          func_0x000f249c(fVar41,0xbf490fdb,0,lVar33,unaff_x29 + -0xd8,0);
          lVar33 = unaff_x20[0x55];
          *(float *)(unaff_x29 + -0xd8) = fVar35;
          *(float *)(unaff_x29 + -0xd4) = fVar41 * 0.0 + fVar56 + fVar43 + 0.5;
          func_0x000f249c(fVar41,0,0x3f490fdb,lVar33,unaff_x29 + -0xd8,0);
          lVar33 = unaff_x20[0x55];
          func_0x000f0ff4(fVar59,lVar33,*(undefined8 *)(lVar33 + 0x80),
                          *(undefined4 *)(lVar33 + 0x78),uVar25,0);
          *(undefined4 *)(lVar33 + 0x78) = 0;
          uVar22 = *(uint *)(unaff_x20 + 3);
        }
        if ((uVar22 >> 3 & 1) != 0) {
          fVar41 = *(float *)(unaff_x20 + 0xc);
          fVar35 = *(float *)((long)unaff_x20 + 0x2c) + *(float *)((long)unaff_x20 + 0x34) + -1.0;
          fVar56 = fVar41 + *(float *)(unaff_x20 + 5);
          lVar33 = unaff_x20[0x55];
          fVar43 = ((*(float *)(unaff_x20 + 5) + *(float *)(unaff_x20 + 6) + -1.0) - fVar41) -
                   fVar56;
          fVar35 = (fVar35 + (fVar35 - fVar35) + 0.5) - fVar41;
          *(float *)(unaff_x29 + -0xd8) = fVar41 * 0.0 + fVar56 + fVar43 + 0.5;
          *(float *)(unaff_x29 + -0xd4) = fVar35;
          func_0x000f249c(fVar41,0x3f490fdb,0x3fc90fdb,lVar33,unaff_x29 + -0xd8,0);
          lVar33 = unaff_x20[0x55];
          *(float *)(unaff_x29 + -0xd8) = fVar41 * 0.0 + fVar56 + fVar43 * 0.0 + 0.5;
          *(float *)(unaff_x29 + -0xd4) = fVar35;
          func_0x000f249c(fVar41,0x3fc90fdb,0x4016cbe4,lVar33,unaff_x29 + -0xd8,0);
          lVar33 = unaff_x20[0x55];
          func_0x000f0ff4(fVar59,lVar33,*(undefined8 *)(lVar33 + 0x80),
                          *(undefined4 *)(lVar33 + 0x78),uVar25,0);
          *(undefined4 *)(lVar33 + 0x78) = 0;
        }
      }
      else {
        lVar33 = unaff_x20[0x55];
        *(ulong *)(unaff_x29 + -0xd8) =
             CONCAT44((float)((ulong)unaff_x20[5] >> 0x20) + (float)((ulong)unaff_x20[6] >> 0x20),
                      (float)unaff_x20[5] + (float)unaff_x20[6]);
        func_0x000f3af4((int)unaff_x20[0xc],fVar59,lVar33,pfStack0000000000000108,unaff_x29 + -0xd8,
                        uVar25,0);
      }
    }
    bVar11 = *(byte *)((long)unaff_x20 + 0xca);
    if ((*(byte *)((long)unaff_x20 + 0xc9) == 0xff) && (bVar11 == 0xff)) {
      fVar35 = *(float *)(&UNK_00003930 + lVar28);
    }
    else {
      bVar21 = *(byte *)((long)unaff_x20 + 0xc9);
      if (bVar11 != 0xff) {
        bVar21 = bVar11;
      }
      lVar33 = 0x1c0;
      if (bVar11 != 0xff) {
        lVar33 = 0x1d0;
      }
      lVar33 = lVar33 + lRam0000000000a334c0;
      fVar56 = *(float *)(&UNK_000038e8 + lVar33 + 0xe4);
      fVar41 = *(float *)(&UNK_000038e8 + lVar33 + 0xe8);
      fVar43 = *(float *)(&UNK_000038e8 + lVar33 + 0xec);
      fVar57 = *(float *)(&UNK_000038e8 + lVar33 + 0xf0) *
               *(float *)(&UNK_000038e8 + lRam0000000000a334c0);
      fVar35 = 1.0;
      if (fVar56 <= 1.0) {
        fVar35 = fVar56;
      }
      fVar52 = 0.0;
      fVar50 = 0.0;
      if (0.0 <= fVar56) {
        fVar50 = fVar35;
      }
      fVar35 = 1.0;
      if (fVar41 <= 1.0) {
        fVar35 = fVar41;
      }
      fVar56 = 0.0;
      if (0.0 <= fVar41) {
        fVar56 = fVar35;
      }
      fVar35 = 1.0;
      if (fVar43 <= 1.0) {
        fVar35 = fVar43;
      }
      fVar41 = 0.0;
      if (0.0 <= fVar43) {
        fVar41 = fVar35;
      }
      fVar35 = 1.0;
      if (fVar57 <= 1.0) {
        fVar35 = fVar57;
      }
      fVar43 = 0.0;
      if (0.0 <= fVar57) {
        fVar43 = fVar35;
      }
      fVar57 = *(float *)(unaff_x20 + 0xc);
      fVar35 = 2.0;
      if (2.0 < *(float *)((long)unaff_x20 + 100)) {
        fVar35 = *(float *)((long)unaff_x20 + 100);
      }
      fVar38 = 0.0;
      fVar44 = 0.0;
      fVar37 = 0.0;
      if (bVar21 < 4) {
        fVar44 = *(float *)(unaff_x20 + 5);
        fVar37 = *(float *)((long)unaff_x20 + 0x2c);
        fVar38 = fVar44 + *(float *)(unaff_x20 + 6) + -1.0;
        fVar52 = fVar37 + *(float *)((long)unaff_x20 + 0x34) + -1.0;
        switch(bVar21) {
        case 0:
          fVar37 = fVar57 + fVar37;
          fVar38 = fVar44 + 0.0;
          fVar52 = fVar52 - fVar57;
          break;
        case 1:
          fVar37 = fVar57 + fVar37;
          fVar52 = fVar52 - fVar57;
          fVar44 = fVar38;
          break;
        case 2:
          fVar38 = fVar38 - fVar57;
          fVar52 = fVar37 + 0.0;
          fVar44 = fVar57 + fVar44;
          break;
        case 3:
          fVar38 = fVar38 - fVar57;
          fVar44 = fVar57 + fVar44;
          fVar37 = fVar52;
        }
      }
      lVar33 = (long)(int)(char)bVar21 * 0x1c;
      lVar23 = unaff_x20[0x55];
      fVar53 = *(float *)(&UNK_0080ca4c + lVar33);
      fVar46 = *(float *)(&UNK_0080ca40 + lVar33);
      fVar49 = *(float *)(&UNK_0080ca44 + lVar33);
      *(float *)(unaff_x29 + -0xd8) =
           fVar44 + *(float *)(&UNK_0080ca48 + lVar33) * (fVar38 - fVar44) + 0.5 + fVar57 * fVar46;
      *(float *)(unaff_x29 + -0xd4) = fVar37 + fVar53 * (fVar52 - fVar37) + 0.5 + fVar57 * fVar49;
      fVar58 = *(float *)(&UNK_0080ca58 + lVar33);
      func_0x000f249c(fVar57,fVar58 + -0.7853982,fVar58,lVar23,unaff_x29 + -0xd8,0);
      lVar23 = unaff_x20[0x55];
      lVar33 = (long)(int)(char)bVar21 * 0x1c;
      fVar53 = *(float *)(&UNK_0080ca54 + lVar33);
      *(float *)(unaff_x29 + -0xd8) =
           fVar57 * fVar46 + fVar44 + *(float *)(&UNK_0080ca50 + lVar33) * (fVar38 - fVar44) + 0.5;
      *(float *)(unaff_x29 + -0xd4) = fVar57 * fVar49 + fVar37 + fVar53 * (fVar52 - fVar37) + 0.5;
      func_0x000f249c(fVar57,fVar58,fVar58 + 0.7853982,lVar23,unaff_x29 + -0xd8,0);
      lVar33 = unaff_x20[0x55];
      func_0x000f0ff4(fVar35,lVar33,*(undefined8 *)(lVar33 + 0x80),*(undefined4 *)(lVar33 + 0x78),
                      (int)(fVar50 * 255.0 + 0.5) | (int)(fVar56 * 255.0 + 0.5) << 8 |
                      (int)(fVar41 * 255.0 + 0.5) << 0x10 | (int)(fVar43 * 255.0 + 0.5) << 0x18,0);
      *(undefined4 *)(lVar33 + 0x78) = 0;
      fVar35 = *(float *)(&UNK_00003930 + lVar28);
    }
    if ((0.0 < fVar35) && ((*(byte *)((long)unaff_x20 + 0x14) & 1) == 0)) {
      fVar35 = *(float *)(&UNK_00003d3c + *unaff_x20) * *(float *)(unaff_x20 + 0x54);
      if (unaff_x20[0x6f] != 0) {
        fVar35 = fVar35 * *(float *)(unaff_x20[0x6f] + 0x2a0);
      }
      fVar35 = *(float *)((long)unaff_x20 + 0x2c) +
               fVar35 + *(float *)(&UNK_00003928 + *unaff_x20) * 2.0 + -1.0;
      lVar28 = unaff_x20[0x55];
      fVar56 = *(float *)(unaff_x20 + 5);
      *(float *)(unaff_x29 + -0xd8) = fVar59 + fVar56;
      *(float *)(unaff_x29 + -0xd4) = fVar35;
      *(float *)(unaff_x29 + -0xe8) = (fVar56 + *(float *)(unaff_x20 + 6)) - fVar59;
      *(float *)(unaff_x29 + -0xe4) = fVar35;
      func_0x000f397c(lVar28,unaff_x29 + -0xd8,unaff_x29 + -0xe8,uVar25);
    }
  }
  else {
    uVar42 = *(undefined4 *)(&UNK_00003930 + lVar28);
    *(float *)(&UNK_00003930 + lVar28) = fVar56;
    if (bVar15) {
      lVar33 = 0xb;
      if ((&UNK_00004b7a)[lVar28] != '\0') {
        lVar33 = 0xc;
      }
    }
    else {
      lVar33 = 0xc;
    }
    lVar33 = lVar33 * 0x10 + lVar28;
    fVar41 = *(float *)(&UNK_000038e8 + lVar33 + 0xe4);
    fVar43 = *(float *)(&UNK_000038e8 + lVar33 + 0xe8);
    fVar56 = 1.0;
    if (fVar41 <= 1.0) {
      fVar56 = fVar41;
    }
    fVar57 = 0.0;
    if (0.0 <= fVar41) {
      fVar57 = fVar56;
    }
    fVar41 = *(float *)(&UNK_000038e8 + lVar33 + 0xec);
    fVar56 = 1.0;
    if (fVar43 <= 1.0) {
      fVar56 = fVar43;
    }
    fVar59 = 0.0;
    if (0.0 <= fVar43) {
      fVar59 = fVar56;
    }
    fVar56 = *(float *)(&UNK_000038e8 + lVar33 + 0xf0) * *(float *)(&UNK_000038e8 + lVar28);
    iVar16 = -(uint)(fVar41 < 0.0);
    iVar45 = -(uint)(fVar56 < 0.0);
    uVar54 = NEON_fmov(0x3f800000,4);
    uVar54 = uVar54 ^ (uVar54 ^ CONCAT44(fVar56,fVar41)) &
                      ~CONCAT44(-(uint)((float)(uVar54 >> 0x20) < fVar56),
                                -(uint)((float)uVar54 < fVar41));
    fVar56 = (float)CONCAT13((byte)(uVar54 >> 0x18) & ~(byte)((uint)iVar16 >> 0x18),
                             CONCAT12((byte)(uVar54 >> 0x10) & ~(byte)((uint)iVar16 >> 0x10),
                                      CONCAT11((byte)(uVar54 >> 8) & ~(byte)((uint)iVar16 >> 8),
                                               (byte)uVar54 & ~(byte)iVar16)));
    uVar39 = NEON_ushl(CONCAT44((int)((float)(CONCAT17((byte)(uVar54 >> 0x38) &
                                                       ~(byte)((uint)iVar45 >> 0x18),
                                                       CONCAT16((byte)(uVar54 >> 0x30) &
                                                                ~(byte)((uint)iVar45 >> 0x10),
                                                                CONCAT15((byte)(uVar54 >> 0x28) &
                                                                         ~(byte)((uint)iVar45 >> 8),
                                                                         CONCAT14((byte)(uVar54 >>
                                                                                        0x20) &
                                                                                  ~(byte)iVar45,
                                                                                  fVar56)))) >> 0x20
                                             ) * 255.0 + 0.5),(int)(fVar56 * 255.0 + 0.5)),
                       _UNK_0080c190,4);
    func_0x000bcf14(uStack00000000000001c0,fStack00000000000001c4,uStack00000000000001c8,
                    fStack00000000000001cc,fVar35,
                    (int)(fVar57 * 255.0 + 0.5) | (int)(fVar59 * 255.0 + 0.5) << 8 | (uint)uVar39 |
                    (uint)((ulong)uVar39 >> 0x20),1);
    *(undefined4 *)(&UNK_00003930 + lVar28) = uVar42;
  }
  if (bVar14) {
    unaff_x20[0x55] = (long)(unaff_x20 + 0x56);
    fVar35 = *(float *)(unaff_x20 + 10);
    if (fVar35 == 0.0) goto code_r0x000cc264;
code_r0x000cc300:
    fVar41 = *(float *)((long)unaff_x20 + 0x54);
    fVar56 = fVar35;
    if (fVar41 != 0.0) goto code_r0x000cc30c;
code_r0x000cc2b4:
    fVar43 = 0.0;
    if ((in_stack_000001b0._4_4_ >> 3 & 1) == 0) {
      fVar43 = *(float *)((long)unaff_x20 + 0x44);
    }
    fVar59 = *(float *)((long)unaff_x20 + 0x5c);
    fVar57 = *(float *)((long)unaff_x20 + 0x6c);
    fVar50 = (*(float *)((long)unaff_x20 + 0x34) + fVar59 * -2.0) -
             (fVar57 + *(float *)((long)unaff_x20 + 0x74));
    if (fVar43 < fVar50) {
      fVar43 = fVar50;
    }
  }
  else {
    fVar35 = *(float *)(unaff_x20 + 10);
    if (fVar35 != 0.0) goto code_r0x000cc300;
code_r0x000cc264:
    fVar56 = 0.0;
    if ((in_stack_000001b0._4_4_ & 0x808) == 0x800) {
      fVar56 = *pfVar2;
    }
    fVar41 = (*(float *)(unaff_x20 + 6) + *(float *)(unaff_x20 + 0xb) * -2.0) -
             (*(float *)(unaff_x20 + 0xd) + *(float *)(unaff_x20 + 0xe));
    if (fVar56 < fVar41) {
      fVar56 = fVar41;
    }
    fVar41 = *(float *)((long)unaff_x20 + 0x54);
    if (fVar41 == 0.0) goto code_r0x000cc2b4;
code_r0x000cc30c:
    fVar59 = *(float *)((long)unaff_x20 + 0x5c);
    fVar57 = *(float *)((long)unaff_x20 + 0x6c);
    fVar43 = fVar41;
  }
  fVar52 = *(float *)(unaff_x20 + 0xb);
  fVar44 = (float)*(undefined8 *)((long)unaff_x20 + 0x8c);
  fVar37 = (float)((ulong)*(undefined8 *)((long)unaff_x20 + 0x8c) >> 0x20);
  fVar50 = *(float *)((long)unaff_x20 + 100);
  uVar54 = CONCAT44(fVar59,fVar52) ^
           (CONCAT44(fVar59,fVar52) ^ CONCAT44(fVar50,fVar50)) &
           ~CONCAT44(-(uint)(fVar50 <= fVar59),-(uint)(fVar50 <= fVar52));
  lVar28 = NEON_scvtf(CONCAT44((int)(((float)((ulong)unaff_x20[0x41] >> 0x20) - fVar37) +
                                    (float)(uVar54 >> 0x20)),
                               (int)(((float)unaff_x20[0x41] - fVar44) + (float)uVar54)),4);
  unaff_x20[0x45] = lVar28;
  unaff_x20[0x46] = CONCAT44(fVar43 + (float)((ulong)lVar28 >> 0x20),fVar56 + (float)lVar28);
  unaff_x20[0x48] = unaff_x20[0x46];
  unaff_x20[0x47] = unaff_x20[0x45];
  fVar56 = *(float *)(unaff_x20 + 0xd);
  fVar50 = fVar56 + fVar52 + (*(float *)(unaff_x20 + 5) - fVar44);
  *(float *)(unaff_x20 + 0x4b) = fVar50;
  fVar43 = fVar57 + fVar59 + (*(float *)((long)unaff_x20 + 0x2c) - fVar37);
  *(float *)((long)unaff_x20 + 0x25c) = fVar43;
  if (fVar35 == 0.0) {
    *(float *)(unaff_x20 + 0x4c) =
         fVar50 + ((*(float *)(unaff_x20 + 6) + fVar52 * -2.0) -
                  (fVar56 + *(float *)(unaff_x20 + 0xe)));
  }
  else {
    *(float *)(unaff_x20 + 0x4c) = fVar50 + fVar35;
  }
  if (fVar41 == 0.0) {
    fVar41 = (*(float *)((long)unaff_x20 + 0x34) + fVar59 * -2.0) -
             (fVar57 + *(float *)((long)unaff_x20 + 0x74));
  }
  *(float *)((long)unaff_x20 + 0x264) = fVar43 + fVar41;
  *(float *)((long)unaff_x20 + 0x154) = (fVar52 + fVar56) - fVar44;
  unaff_x20[0x2b] = 0;
  fVar35 = ((fVar52 + *(float *)(unaff_x20 + 5)) - fVar44) + fVar56 + 0.0;
  fVar57 = ((fVar59 + *(float *)((long)unaff_x20 + 0x2c)) - fVar37) + fVar57;
  *(float *)(unaff_x20 + 0x24) = fVar35;
  *(float *)((long)unaff_x20 + 0x124) = fVar57;
  *(float *)(unaff_x20 + 0x2c) = fVar35 - fVar35;
  *(float *)((long)unaff_x20 + 0x164) = fVar57 - fVar57;
  lVar28 = unaff_x20[0x24];
  unaff_x20[0x22] = lVar28;
  unaff_x20[0x23] = lVar28;
  unaff_x20[0x25] = lVar28;
  unaff_x20[0x26] = lVar28;
  *(undefined4 *)(unaff_x20 + 0x2d) = 0;
  unaff_x20[0x28] = 0;
  unaff_x20[0x29] = 0;
  unaff_x20[0x27] = 0;
  *(undefined2 *)(unaff_x20 + 0x2a) = 0;
  *(undefined2 *)((long)unaff_x20 + 0x16c) = *(undefined2 *)((long)unaff_x20 + 0x16e);
  *(undefined4 *)((long)unaff_x20 + 0x16e) = 0x10000;
  *(bool *)((long)unaff_x20 + 0x172) = 0.0 < *(float *)(unaff_x20 + 0x13);
  *(undefined1 *)((long)unaff_x20 + 0x173) = 0;
  func_0x00124fb4(*(undefined4 *)(&UNK_00003934 + in_stack_000001b8),(long)unaff_x20 + 0x17c,
                  in_stack_00000180._4_4_);
  unaff_x20[0x33] = 0;
  if (*(int *)((long)unaff_x20 + 0x1a4) < 0) {
    func_0x000cef5c(unaff_x20 + 0x34,0);
  }
  *(undefined4 *)(unaff_x20 + 0x34) = 0;
  unaff_x20[0x36] = (long)(unaff_x20 + 0x50);
  unaff_x20[0x37] = 0;
  uVar42 = 1;
  *(undefined4 *)((long)unaff_x20 + 0x1c4) = 1;
  if (in_stack_00000188 != 0) {
    uVar42 = *(undefined4 *)(in_stack_00000188 + 0x1c4);
  }
  *(undefined4 *)(unaff_x20 + 0x39) = uVar42;
  *(int *)((long)unaff_x20 + 0x1cc) = (int)unaff_x20[0x4f];
  *(undefined4 *)(unaff_x20 + 0x3a) = 0xbf800000;
  if (*(int *)((long)unaff_x20 + 0x1dc) < 0) {
    func_0x000eb9f0(unaff_x20 + 0x3b,0);
  }
  *(undefined4 *)(unaff_x20 + 0x3b) = 0;
  if (*(int *)((long)unaff_x20 + 0x1ec) < 0) {
    func_0x000eb9f0(unaff_x20 + 0x3d,0);
  }
  *(undefined4 *)(unaff_x20 + 0x3d) = 0;
  if ('\0' < *(char *)((long)unaff_x20 + 0xdc)) {
    *(char *)((long)unaff_x20 + 0xdc) = *(char *)((long)unaff_x20 + 0xdc) + -1;
  }
  if ('\0' < *(char *)((long)unaff_x20 + 0xdd)) {
    *(char *)((long)unaff_x20 + 0xdd) = *(char *)((long)unaff_x20 + 0xdd) + -1;
  }
  lVar28 = lRam0000000000a334c0;
  fVar35 = fStack00000000000001c4;
  fVar56 = fStack00000000000001cc;
  if (uStack0000000000000144 != 0) {
    func_0x000c3098();
    lVar28 = lRam0000000000a334c0;
    fVar35 = fStack00000000000001c4;
    fVar56 = fStack00000000000001cc;
    if (unaff_x20 == *(long **)(&UNK_00004b18 + in_stack_000001b8)) {
      func_0x000d0a00();
      lVar28 = lRam0000000000a334c0;
      fVar35 = fStack00000000000001c4;
      fVar56 = fStack00000000000001cc;
    }
  }
  lRam0000000000a334c0 = lVar28;
  fStack00000000000001c4 = fVar35;
  fStack00000000000001cc = fVar56;
  if ((in_stack_000001b0 & 0x100000000) == 0) {
    fVar41 = *(float *)((long)unaff_x20 + 100);
    uVar25 = *(uint *)((long)unaff_x20 + 0x14);
    if ((uVar25 >> 5 & 1) == 0) {
      bVar15 = *(int *)(&UNK_00003910 + lVar28) != -1;
    }
    else {
      bVar15 = false;
    }
    fVar59 = uStack00000000000001c8 - fVar41;
    puVar5 = (uint *)(&UNK_0000497c + lVar28);
    uVar22 = *puVar5;
    *puVar5 = uVar22 | 0x10;
    *(undefined4 *)(unaff_x20 + 0x2d) = 1;
    fVar57 = *(float *)(&UNK_00003924 + lVar28);
    fVar50 = *(float *)(&UNK_00003d38 + lVar28);
    *(undefined8 *)(unaff_x29 + -0xc0) = 0;
    *(undefined8 *)(unaff_x29 + -0xb8) = 0;
    fVar43 = fVar57;
    if (in_stack_00000168 != (undefined1 *)0x0) {
      fVar43 = *(float *)(&UNK_00003928 + lVar28);
      *(float *)(unaff_x29 + -0xb8) = (fVar59 - fVar57) - fVar50;
      *(float *)(unaff_x29 + -0xb4) = fVar35 + fVar43;
      fVar43 = fVar57 + fVar50 + *(float *)(&UNK_0000393c + lVar28);
    }
    fVar41 = uStack00000000000001c0 + fVar41;
    if (bVar15) {
      if (*(int *)(&UNK_00003910 + lVar28) == 0) {
        fVar52 = *(float *)(&UNK_00003928 + lVar28);
        *(float *)(unaff_x29 + -0xc0) = fVar41 + fVar57;
        *(float *)(unaff_x29 + -0xbc) = fVar35 + fVar52;
        fVar57 = fVar57 + fVar50 + *(float *)(&UNK_0000393c + lVar28);
      }
      else if (*(int *)(&UNK_00003910 + lVar28) == 1) {
        fVar52 = *(float *)(&UNK_00003928 + lVar28);
        *(float *)(unaff_x29 + -0xc0) = (fVar59 - fVar43) - fVar50;
        *(float *)(unaff_x29 + -0xbc) = fVar35 + fVar52;
        fVar43 = fVar43 + fVar50 + *(float *)(&UNK_0000393c + lVar28);
      }
      uVar19 = *(uint *)(unaff_x20[0x21] + (long)(int)unaff_x20[0x20] * 4 + -4);
      uVar19 = *(uint *)(&UNK_0080c404 + ((ulong)uVar19 & 0xff ^ 0xdc) * 4) ^ ~uVar19 >> 8;
      uVar19 = *(uint *)(&UNK_0080c404 + (ulong)(uVar19 & 0xff ^ 0x43) * 4) ^ uVar19 >> 8;
      uVar19 = *(uint *)(&UNK_0080c404 + (ulong)(uVar19 & 0xff ^ 0x4f) * 4) ^ uVar19 >> 8;
      uVar19 = *(uint *)(&UNK_0080c404 + (ulong)(uVar19 & 0xff ^ 0x4c) * 4) ^ uVar19 >> 8;
      uVar19 = *(uint *)(&UNK_0080c404 + (ulong)(uVar19 & 0xff ^ 0x4c) * 4) ^ uVar19 >> 8;
      uVar19 = *(uint *)(&UNK_0080c404 + (ulong)(uVar19 & 0xff ^ 0x41) * 4) ^ uVar19 >> 8;
      uVar19 = *(uint *)(&UNK_0080c404 + (ulong)(uVar19 & 0xff ^ 0x50) * 4) ^ uVar19 >> 8;
      uVar19 = *(uint *)(&UNK_0080c404 + (ulong)(uVar19 & 0xff ^ 0x53) * 4) ^ uVar19 >> 8;
      uVar19 = *(uint *)(&UNK_0080c404 + (ulong)(uVar19 & 0xff ^ 0x45) * 4) ^
               uVar19 >> 8 ^ 0xffffffff;
      if (*(uint *)(&UNK_0000404c + *unaff_x20) == uVar19) {
        func_0x000c167c(uVar19,0xb,"#COLLAPSE",0);
      }
      iVar16 = func_0x0010c3ec(uVar19,unaff_x29 + -0xc0);
      if (iVar16 != 0) {
        *(undefined1 *)((long)unaff_x20 + 0xc2) = 1;
      }
    }
    if (in_stack_00000168 != (undefined1 *)0x0) {
      uVar19 = *(uint *)(unaff_x20[0x21] + (long)(int)unaff_x20[0x20] * 4 + -4);
      uVar19 = *(uint *)(&UNK_0080c404 + ((ulong)uVar19 & 0xff ^ 0xdc) * 4) ^ ~uVar19 >> 8;
      uVar19 = *(uint *)(&UNK_0080c404 + (ulong)(uVar19 & 0xff ^ 0x43) * 4) ^ uVar19 >> 8;
      uVar19 = *(uint *)(&UNK_0080c404 + (ulong)(uVar19 & 0xff ^ 0x4c) * 4) ^ uVar19 >> 8;
      uVar19 = *(uint *)(&UNK_0080c404 + (ulong)(uVar19 & 0xff ^ 0x4f) * 4) ^ uVar19 >> 8;
      uVar19 = *(uint *)(&UNK_0080c404 + (ulong)(uVar19 & 0xff ^ 0x53) * 4) ^ uVar19 >> 8;
      uVar19 = *(uint *)(&UNK_0080c404 + (ulong)(uVar19 & 0xff ^ 0x45) * 4) ^
               uVar19 >> 8 ^ 0xffffffff;
      if (*(uint *)(&UNK_0000404c + *unaff_x20) == uVar19) {
        func_0x000c167c(uVar19,0xb,"#CLOSE",0);
      }
      iVar16 = func_0x0010c1d4(uVar19,unaff_x29 + -0xb8);
      if (iVar16 != 0) {
        *in_stack_00000168 = 0;
      }
    }
    *(undefined4 *)(unaff_x20 + 0x2d) = 0;
    *puVar5 = uVar22;
    fVar44 = 0.0;
    fVar52 = 0.0;
    if ((uVar25 & 0x40000) != 0) {
      fVar52 = fVar50 * 0.8;
    }
    if (in_stack_00000160 == (char *)0xffffffffffffffff) {
      fVar37 = *(float *)(&UNK_00003d38 + lRam0000000000a334c0);
    }
    else {
      pcVar17 = in_stack_00000160;
      do {
        if (*pcVar17 == '#') {
          if (pcVar17[1] == '#') break;
        }
        else if (*pcVar17 == '\0') break;
        pcVar3 = pcVar17 + 1;
        bVar15 = pcVar17 != (char *)0xfffffffffffffffe;
        pcVar17 = pcVar3;
      } while (bVar15);
      fVar37 = *(float *)(&UNK_00003d38 + lRam0000000000a334c0);
      if (pcVar17 == in_stack_00000160) {
        fVar44 = 0.0;
      }
      else {
        fVar44 = 3.4028235e+38;
        fVar38 = (float)func_0x00106300(fVar37,0x7f7fffff,0xbf800000,
                                        *(undefined8 *)(&UNK_00003d30 + lRam0000000000a334c0),
                                        in_stack_00000160,pcVar17,0);
        fVar37 = fVar44;
        fVar44 = (float)(int)(fVar38 + 0.99999);
      }
    }
    fVar52 = fVar52 + fVar44;
    *(float *)(unaff_x29 + -200) = fVar52;
    *(float *)(unaff_x29 + -0xc4) = fVar37 + 0.0;
    fVar44 = *(float *)(&UNK_00003924 + lVar28);
    if (fVar57 <= fVar44) {
      if (fVar44 < fVar43) goto code_r0x000ccc3c;
code_r0x000cc994:
      fVar44 = *(float *)(&UNK_00003908 + lVar28);
      bVar15 = false;
      if ((0.0 < fVar44) && (bVar15 = false, !NAN(fVar44))) {
        bVar15 = fVar44 < 1.0;
      }
      if (bVar15) {
code_r0x000cc9a8:
        fVar38 = ABS(fVar44 + -0.5) * -2.0 + 1.0;
        fVar37 = 1.0;
        if (fVar38 <= 1.0) {
          fVar37 = fVar38;
        }
        fVar53 = 0.0;
        if (0.0 <= fVar38) {
          fVar53 = fVar37;
        }
        fVar37 = fVar57;
        if (fVar57 < fVar43) {
          fVar37 = fVar43;
        }
        fVar38 = (((fVar59 - fVar41) - fVar57) - fVar43) - fVar52;
        if (fVar38 <= fVar37) {
          fVar37 = fVar38;
        }
        fVar37 = fVar37 * fVar53;
        if (fVar57 < fVar37) {
          fVar57 = fVar37;
        }
        if (fVar43 < fVar37) {
          fVar43 = fVar37;
        }
      }
    }
    else {
      fVar57 = fVar57 + *(float *)(&UNK_0000393c + lVar28);
      if (fVar43 <= fVar44) goto code_r0x000cc994;
code_r0x000ccc3c:
      fVar43 = fVar43 + *(float *)(&UNK_0000393c + lVar28);
      fVar44 = *(float *)(&UNK_00003908 + lVar28);
      bVar15 = false;
      if ((0.0 < fVar44) && (bVar15 = false, !NAN(fVar44))) {
        bVar15 = fVar44 < 1.0;
      }
      if (bVar15) goto code_r0x000cc9a8;
    }
    fVar41 = fVar41 + fVar57;
    fVar43 = fVar59 - fVar43;
    *(float *)(unaff_x29 + -0xd8) = fVar41;
    *(float *)(unaff_x29 + -0xd4) = fVar35;
    *(float *)(unaff_x29 + -0xd0) = fVar43;
    *(float *)(unaff_x29 + -0xcc) = fVar56;
    fVar57 = fVar43 + *(float *)(&UNK_0000393c + lVar28);
    if (fVar59 <= fVar43 + *(float *)(&UNK_0000393c + lVar28)) {
      fVar57 = fVar59;
    }
    *(float *)(unaff_x29 + -0xe8) = fVar41;
    *(float *)(unaff_x29 + -0xe4) = fVar35;
    *(float *)(unaff_x29 + -0xe0) = fVar57;
    *(float *)(unaff_x29 + -0xdc) = fVar56;
    if ((uVar25 >> 0x12 & 1) != 0) {
      fVar52 = fVar52 + fVar41 + fVar44 * ((fVar43 - fVar41) - fVar52);
      if (fVar52 <= fVar43) {
        fVar43 = fVar52;
      }
      fVar59 = fVar41;
      if (fVar41 <= fVar52) {
        fVar59 = fVar43;
      }
      if (fVar41 < fVar59) {
        fVar43 = *(float *)(&UNK_000039cc + lRam0000000000a334c0);
        fVar52 = *(float *)(&UNK_000039d0 + lRam0000000000a334c0);
        fVar44 = *(float *)(&UNK_000039d8 + lRam0000000000a334c0) *
                 *(float *)(&UNK_000038e8 + lRam0000000000a334c0);
        fVar41 = 1.0;
        if (fVar43 <= 1.0) {
          fVar41 = fVar43;
        }
        fVar37 = 0.0;
        if (0.0 <= fVar43) {
          fVar37 = fVar41;
        }
        fVar43 = *(float *)(&UNK_000039d4 + lRam0000000000a334c0);
        fVar41 = 1.0;
        if (fVar52 <= 1.0) {
          fVar41 = fVar52;
        }
        fVar38 = 0.0;
        if (0.0 <= fVar52) {
          fVar38 = fVar41;
        }
        iVar16 = -(uint)(fVar43 < 0.0);
        iVar45 = -(uint)(fVar44 < 0.0);
        uVar54 = NEON_fmov(0x3f800000,4);
        uVar54 = uVar54 ^ (uVar54 ^ CONCAT44(fVar44,fVar43)) &
                          ~CONCAT44(-(uint)((float)(uVar54 >> 0x20) < fVar44),
                                    -(uint)((float)uVar54 < fVar43));
        fVar41 = (float)CONCAT13((byte)(uVar54 >> 0x18) & ~(byte)((uint)iVar16 >> 0x18),
                                 CONCAT12((byte)(uVar54 >> 0x10) & ~(byte)((uint)iVar16 >> 0x10),
                                          CONCAT11((byte)(uVar54 >> 8) & ~(byte)((uint)iVar16 >> 8),
                                                   (byte)uVar54 & ~(byte)iVar16)));
        uVar39 = NEON_ushl(CONCAT44((int)((float)(CONCAT17((byte)(uVar54 >> 0x38) &
                                                           ~(byte)((uint)iVar45 >> 0x18),
                                                           CONCAT16((byte)(uVar54 >> 0x30) &
                                                                    ~(byte)((uint)iVar45 >> 0x10),
                                                                    CONCAT15((byte)(uVar54 >> 0x28)
                                                                             & ~(byte)((uint)iVar45
                                                                                      >> 8),
                                                                             CONCAT14((byte)(uVar54 
                                                  >> 0x20) & ~(byte)iVar45,fVar41)))) >> 0x20) *
                                          255.0 + 0.5),(int)(fVar41 * 255.0 + 0.5)),_UNK_0080c190,4)
        ;
        func_0x001069f4(fVar59,(fVar35 + fVar56) * 0.5,unaff_x20[0x55],
                        (int)(fVar37 * 255.0 + 0.5) | (int)(fVar38 * 255.0 + 0.5) << 8 |
                        (uint)uVar39 | (uint)((ulong)uVar39 >> 0x20));
        fVar59 = fVar59 - (float)(int)(fVar50 * 0.8 * 0.5);
        if (fVar59 <= fVar57) {
          fVar57 = fVar59;
        }
        *(float *)(unaff_x29 + -0xe0) = fVar57;
      }
    }
    lVar33 = lRam0000000000a334c0;
    if (in_stack_00000160 != (char *)0xffffffffffffffff) {
      pcVar17 = in_stack_00000160;
      do {
        if (*pcVar17 == '#') {
          if (pcVar17[1] == '#') break;
        }
        else if (*pcVar17 == '\0') break;
        pcVar3 = pcVar17 + 1;
        bVar15 = pcVar17 != (char *)0xfffffffffffffffe;
        pcVar17 = pcVar3;
      } while (bVar15);
      if (((int)pcVar17 != (int)in_stack_00000160) &&
         (func_0x000bc610(*(undefined8 *)(*(long *)(lRam0000000000a334c0 + 0x4000) + 0x2a8),
                          unaff_x29 + -0xd8,unaff_x29 + -0xd0,in_stack_00000160,pcVar17,
                          unaff_x29 + -200,&UNK_00003908 + lVar28,unaff_x29 + -0xe8),
         (&UNK_00005ff8)[lVar33] != '\0')) {
        func_0x000bc2c4(unaff_x29 + -0xd8,in_stack_00000160,pcVar17);
      }
    }
  }
  lVar28 = lRam0000000000a334c0;
  uVar25 = 0;
  puVar6 = (undefined4 *)(&UNK_000049a8 + lRam0000000000a334c0);
  *(undefined4 *)(unaff_x20 + 0x4d) = 0;
  uVar54 = in_stack_00000190[0x1fa];
  fVar35 = *(float *)(lVar28 + 0xe40);
  if (uStack00000000000001c0 - *(float *)(&UNK_0000394c + lVar28) <= fVar35) {
    fVar56 = *(float *)(&UNK_0000394c + lVar28) + uStack00000000000001c8;
    bVar15 = false;
    if ((fStack00000000000001c4 - *(float *)(&UNK_00003950 + lVar28) <= *(float *)(lVar28 + 0xe44))
       && (bVar15 = false, !NAN(fVar35) && !NAN(fVar56))) {
      bVar15 = fVar35 < fVar56;
    }
    if (bVar15) {
      uVar25 = (uint)(*(float *)(lVar28 + 0xe44) <
                     fStack00000000000001cc + *(float *)(&UNK_00003950 + lVar28));
    }
    else {
      uVar25 = 0;
    }
  }
  *puVar6 = *(undefined4 *)((long)unaff_x20 + 0x84);
  *(int *)(&UNK_000049ac + lVar28) = (int)uVar54;
  *(uint *)(&UNK_000049b0 + lVar28) = uVar25;
  *(ulong *)(&UNK_000049cc + lVar28) = CONCAT44(fStack00000000000001cc,uStack00000000000001c8);
  *(ulong *)(&UNK_000049c4 + lVar28) = CONCAT44(fStack00000000000001c4,uStack00000000000001c0);
  *(ulong *)(&UNK_000049bc + lVar28) = CONCAT44(fStack00000000000001cc,uStack00000000000001c8);
  *(ulong *)(&UNK_000049b4 + lVar28) = CONCAT44(fStack00000000000001c4,uStack00000000000001c0);
  iVar16 = *(int *)((long)in_stack_00000190 + 0xfd4);
  if ((iVar16 != 0) &&
     ((*in_stack_00000178 == iVar16 || (*(int *)((long)unaff_x20 + 0x84) == iVar16)))) {
    func_0x000d2b3c();
    lVar28 = lRam0000000000a334c0;
  }
  lVar33 = *(long *)(lVar28 + 0x4000);
  plVar18 = unaff_x20 + 0x44;
  *(undefined1 *)(lVar33 + 0xc0) = 1;
  func_0x000f0930(*(undefined8 *)(lVar33 + 0x2a8),unaff_x20 + 0x43,plVar18,1);
  lVar28 = *(long *)(*(long *)(lVar33 + 0x2a8) + 0x60) +
           (long)*(int *)(*(long *)(lVar33 + 0x2a8) + 0x58) * 0x10;
  uVar39 = *(undefined8 *)(lVar28 + -0x10);
  *(undefined8 *)(lVar33 + 0x250) = *(undefined8 *)(lVar28 + -8);
  *(undefined8 *)(lVar33 + 0x248) = uVar39;
  *(undefined1 *)(unaff_x20 + 0x18) = 0;
  *(short *)((long)unaff_x20 + 0xcc) = *(short *)((long)unaff_x20 + 0xcc) + 1;
  *in_stack_000001a8 = 0;
  if (iStack00000000000001a0 != iStack00000000000001a4) {
    if ((in_stack_000001b0._4_4_ & 0x11000000) == 0x1000000) {
      if ((in_stack_000001b0._4_4_ >> 0x17 & 1) == 0) {
        bVar15 = false;
      }
      else {
        bVar15 = false;
        if (*(char *)(in_stack_000001a8 + 0x61) != '\0') {
          bVar15 = false;
          if (*(long *)(&UNK_00004b18 + in_stack_000001b8) != 0) {
            bVar15 = *(long *)(*(long *)(&UNK_00004b18 + in_stack_000001b8) + 0x3a0) ==
                     unaff_x20[0x74];
          }
        }
      }
      if ((((&UNK_00005ff8)[in_stack_000001b8] == '\0') && (!bVar15)) &&
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
      cVar12 = *(char *)((long)unaff_x20 + 0xe7);
joined_r0x000cce60:
      bVar11 = 1;
      bVar21 = 1;
    }
    else {
      if (('\0' < *(char *)((long)unaff_x20 + 0xe4)) || ('\0' < *(char *)((long)unaff_x20 + 0xe5)))
      {
        *(undefined1 *)((long)unaff_x20 + 0xc5) = 1;
        cVar12 = *(char *)((long)unaff_x20 + 0xe7);
        goto joined_r0x000cce60;
      }
      bVar21 = 0;
      bVar11 = 0;
      *(bool *)((long)unaff_x20 + 0xc5) = '\0' < *(char *)((long)unaff_x20 + 0xe6);
      cVar12 = *(char *)((long)unaff_x20 + 0xe7);
    }
    if ('\0' < cVar12) {
      *(char *)((long)unaff_x20 + 0xe7) = cVar12 + -1;
      *(uint *)((long)unaff_x20 + 0x14) = *(uint *)((long)unaff_x20 + 0x14) | 0x30200;
      bVar11 = bVar21;
    }
    if ((((*(char *)((long)unaff_x20 + 0xc1) == '\0') &&
         ((bool)(*(char *)((long)unaff_x20 + 0xbe) != '\0' & (bVar11 ^ 1)))) ||
        ('\0' < *(char *)((long)unaff_x20 + 0xdc))) || ('\0' < *(char *)((long)unaff_x20 + 0xdd))) {
      bVar15 = false;
    }
    else {
      bVar15 = *(char *)((long)unaff_x20 + 0xe5) < '\x01';
    }
    *(bool *)((long)unaff_x20 + 0xc3) = bVar15;
  }
  if (*(char *)((long)unaff_x20 + 0xc6) == '\0') {
    uVar25 = 0;
    if (*(char *)(in_stack_000001b8 + 0x79) != '\0') {
      uVar25 = in_stack_00000198._4_4_;
    }
    if (((uVar25 & 1) != 0) ||
       ((*(char *)(in_stack_000001b8 + 0x7a) != '\0' &&
        (*(int *)(&UNK_00003fd0 + in_stack_000001b8) ==
         (int)(char)(&UNK_00006074)[in_stack_000001b8])))) {
      if ('\0' < *(char *)((long)unaff_x20 + 0xdc)) {
        *(char *)((long)unaff_x20 + 0xdc) = *(char *)((long)unaff_x20 + 0xdc) + '\x01';
      }
      if (*(char *)((long)unaff_x20 + 0xdd) < '\x01') {
        bVar15 = false;
      }
      else {
        bVar15 = false;
        *(char *)((long)unaff_x20 + 0xdd) = *(char *)((long)unaff_x20 + 0xdd) + '\x01';
      }
      goto LAB_000cced0;
    }
  }
  bVar15 = *(char *)((long)unaff_x20 + 0xc3) == '\0';
LAB_000cced0:
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0xa0)) {
    return;
  }
  ___stack_chk_fail(bVar15);
  auVar62 = __Unwind_Resume();
  lVar33 = *(long *)(lRam0000000000a334c0 + 0x4000);
  *(undefined1 *)(lVar33 + 0xc0) = 1;
  func_0x000f0930(*(undefined8 *)(lVar33 + 0x2a8),auVar62._0_8_,auVar62._8_8_,plVar18);
  lVar28 = *(long *)(*(long *)(lVar33 + 0x2a8) + 0x60) +
           (long)*(int *)(*(long *)(lVar33 + 0x2a8) + 0x58) * 0x10;
  uVar39 = *(undefined8 *)(lVar28 + -0x10);
  *(undefined8 *)(lVar33 + 0x250) = *(undefined8 *)(lVar28 + -8);
  *(undefined8 *)(lVar33 + 0x248) = uVar39;
  return;
}

