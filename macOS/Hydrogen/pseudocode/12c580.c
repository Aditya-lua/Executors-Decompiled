
undefined8 FUN_0012c580(void)

{
  undefined8 *puVar1;
  undefined8 uVar2;
  double dVar3;
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  int iVar6;
  undefined1 auVar7 [16];
  undefined8 uVar8;
  undefined1 auVar9 [16];
  undefined8 uVar10;
  undefined1 auVar11 [16];
  undefined8 uVar12;
  undefined8 uVar13;
  undefined4 uVar14;
  long lVar15;
  undefined8 uVar16;
  long lVar17;
  long lVar18;
  int in_w8;
  uint uVar19;
  int iVar20;
  undefined8 *puVar21;
  long lVar22;
  ulong uVar23;
  byte bVar24;
  int in_w9;
  float *pfVar25;
  ulong uVar26;
  long lVar27;
  ulong uVar28;
  ulong uVar29;
  long unaff_x19;
  uint unaff_w20;
  long lVar30;
  uint uVar31;
  int unaff_w24;
  int iVar32;
  ulong unaff_x25;
  long unaff_x26;
  uint unaff_w27;
  long unaff_x28;
  ulong uVar33;
  long unaff_x29;
  float fVar34;
  float fVar35;
  undefined8 uVar36;
  undefined1 auVar37 [16];
  undefined1 auVar38 [16];
  undefined2 uVar39;
  undefined2 uVar40;
  short sVar41;
  short sVar42;
  short sVar43;
  float fVar44;
  float fVar45;
  float unaff_s8;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  int in_stack_00000018;
  long in_stack_00000020;
  uint in_stack_00000028;
  long in_stack_00000030;
  long in_stack_00000038;
  undefined8 uStack0000000000000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000058;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000068;
  undefined4 uStack0000000000000070;
  undefined4 uStack0000000000000074;
  undefined4 uStack0000000000000078;
  undefined4 uStack000000000000007c;
  
  if (in_w8 <= in_w9) {
    in_w8 = in_w9;
  }
  lVar15 = func_0x000b810c((long)in_w8 * 0x18);
  if (*(long *)(unaff_x19 + 0x1c8) != 0) {
    _memcpy(lVar15,*(long *)(unaff_x19 + 0x1c8),(long)*(int *)(unaff_x19 + 0x1c0) * 0x18);
    func_0x000b83d4(*(undefined8 *)(unaff_x19 + 0x1c8));
  }
  *(long *)(unaff_x19 + 0x1c8) = lVar15;
  *(int *)(unaff_x19 + 0x1c4) = in_w8;
  puVar21 = (undefined8 *)(lVar15 + (long)*(int *)(unaff_x19 + 0x1c0) * 0x18);
  *puVar21 = 0;
  puVar21[1] = 0;
  puVar21[2] = 0xffffffffffffffff;
  *(int *)(unaff_x19 + 0x1c0) = *(int *)(unaff_x19 + 0x1c0) + 1;
  func_0x000d5210("##Instances",0);
  uVar16 = func_0x000d533c();
  if (*(short *)(unaff_x19 + 0x78) == 0) {
    *(int *)(unaff_x19 + 0x1a8) = (int)uVar16;
    if (in_stack_00000018 == 0) goto code_r0x0012c550;
code_r0x0012c634:
    if (((uint)(0.0 < unaff_s8) & (unaff_w20 & 0x1000000) >> 0x18) == 0) {
      unaff_s8 = 3.4028235e+38;
    }
    if ((unaff_s8 != 3.4028235e+38) || ((unaff_w20 & 0x3000000) == 0x1000000)) {
      if (unaff_s8 == 3.4028235e+38) {
        unaff_s8 = 0.0;
      }
      uVar14 = 0x800000;
      if ((unaff_w20 & 0x3000000) != 0x1000000) {
        uVar14 = 0;
      }
      uStack0000000000000040 = CONCAT44(uVar14,unaff_s8);
      func_0x000d4234(&uStack0000000000000040);
    }
    if ((in_stack_00000028 & 0x3000000) == 0) {
      uStack0000000000000040 = 0;
      func_0x000d4260(&uStack0000000000000040);
    }
    uStack0000000000000040 =
         CONCAT44((float)((ulong)*(undefined8 *)(unaff_x29 + -0x70) >> 0x20) -
                  (float)((ulong)*(undefined8 *)(unaff_x29 + -0x78) >> 0x20),
                  (float)*(undefined8 *)(unaff_x29 + -0x70) -
                  (float)*(undefined8 *)(unaff_x29 + -0x78));
    func_0x000d01b4(in_stack_00000008,uVar16,&uStack0000000000000040,0,
                    (unaff_w20 & 0x1000000) >> 0xd);
    lVar15 = *(long *)(unaff_x26 + 0x4000);
    *(long *)(unaff_x19 + 0x188) = lVar15;
    uVar2 = *(undefined8 *)(lVar15 + 0x228);
    *(undefined8 *)(unaff_x19 + 0x118) = *(undefined8 *)(lVar15 + 0x230);
    *(undefined8 *)(unaff_x19 + 0x110) = uVar2;
    uVar2 = *(undefined8 *)(lVar15 + 0x28);
    uVar36 = *(undefined8 *)(lVar15 + 0x30);
    *(undefined8 *)(unaff_x19 + 0xf0) = uVar2;
    *(ulong *)(unaff_x19 + 0xf8) =
         CONCAT44((float)((ulong)uVar2 >> 0x20) + (float)((ulong)uVar36 >> 0x20),
                  (float)uVar2 + (float)uVar36);
    uVar2 = *(undefined8 *)(lVar15 + 0x208);
    *(undefined8 *)(unaff_x19 + 0x108) = *(undefined8 *)(lVar15 + 0x210);
    *(undefined8 *)(unaff_x19 + 0x100) = uVar2;
    iVar32 = 0;
    if (*(char *)(lVar15 + 0xc3) != '\0') {
      iVar32 = in_stack_00000000._4_4_;
    }
    if (iVar32 == 1) {
      *(undefined1 *)(lVar15 + 0xc3) = 0;
    }
    bVar24 = *(byte *)(unaff_x19 + 0x246);
    if (unaff_w24 == 0) {
      *(byte *)(unaff_x19 + 0x247) = bVar24;
      *(undefined1 *)(unaff_x19 + 0x246) = 0;
      bVar24 = 0;
    }
    *(byte *)(unaff_x19 + 0x246) = bVar24 | *(byte *)(lVar15 + 0xbd);
    func_0x000d5164();
  }
  else {
    *(int *)(*(long *)(unaff_x19 + 0x1c8) + (long)(int)*(short *)(unaff_x19 + 0x78) * 0x18 + -0x18)
         = (int)uVar16;
    if (in_stack_00000018 != 0) goto code_r0x0012c634;
code_r0x0012c550:
    uVar36 = *(undefined8 *)(unaff_x29 + -0x70);
    uVar2 = *(undefined8 *)(unaff_x29 + -0x78);
    *(undefined8 *)(unaff_x19 + 0xf8) = uVar36;
    *(undefined8 *)(unaff_x19 + 0xf0) = uVar2;
    *(undefined8 *)(unaff_x19 + 0x108) = uVar36;
    *(undefined8 *)(unaff_x19 + 0x100) = uVar2;
    *(undefined8 *)(unaff_x19 + 0x118) = uVar36;
    *(undefined8 *)(unaff_x19 + 0x110) = uVar2;
    func_0x000d5164();
  }
  if (0 < unaff_w24) {
    func_0x000d5164(uVar16);
  }
  lVar30 = *(long *)(unaff_x19 + 0x188);
  *(undefined4 *)(unaff_x19 + 0xb4) = *(undefined4 *)(lVar30 + 0x154);
  uVar16 = *(undefined8 *)(lVar30 + 0x248);
  *(undefined8 *)(unaff_x19 + 0x168) = *(undefined8 *)(lVar30 + 0x250);
  *(undefined8 *)(unaff_x19 + 0x160) = uVar16;
  *(undefined1 *)(unaff_x19 + 0x249) = *(undefined1 *)(lVar30 + 0xc3);
  lVar15 = in_stack_00000030 + in_stack_00000020 * 0x78;
  uVar16 = *(undefined8 *)(lVar30 + 0x228);
  *(undefined8 *)(lVar15 + 0x38) = *(undefined8 *)(lVar30 + 0x230);
  *(undefined8 *)(lVar15 + 0x30) = uVar16;
  uVar16 = *(undefined8 *)(lVar30 + 0x238);
  *(undefined8 *)(lVar15 + 0x48) = *(undefined8 *)(lVar30 + 0x240);
  *(undefined8 *)(lVar15 + 0x40) = uVar16;
  *(undefined4 *)(lVar15 + 0x68) = *(undefined4 *)(unaff_x28 + 0x158);
  *(undefined8 *)(lVar15 + 0x50) = *(undefined8 *)(lVar30 + 0x140);
  *(undefined8 *)(lVar15 + 0x58) = *(undefined8 *)(lVar30 + 0x138);
  *(undefined8 *)(lVar15 + 0x60) = *(undefined8 *)(lVar30 + 0x128);
  *(undefined4 *)(lVar15 + 0x6c) = *(undefined4 *)(unaff_x28 + 0x1cc);
  *(undefined4 *)(lVar15 + 0x70) = *(undefined4 *)(unaff_x28 + 0x1d8);
  *(undefined8 *)(lVar30 + 0x138) = 0;
  *(undefined8 *)(lVar30 + 0x140) = 0;
  if (lVar30 != unaff_x28) {
    if ((unaff_w20 >> 10 & 1) != 0) {
      fVar34 = *(float *)(unaff_x19 + 0x160) + 1.0;
      if (*(float *)(unaff_x19 + 0x168) <= fVar34) {
        fVar34 = *(float *)(unaff_x19 + 0x168);
      }
      *(float *)(unaff_x19 + 0x160) = fVar34;
    }
    if ((unaff_w20 >> 8 & 1) != 0) {
      fVar34 = *(float *)(unaff_x19 + 0x164) + 1.0;
      if (*(float *)(unaff_x19 + 0x16c) <= fVar34) {
        fVar34 = *(float *)(unaff_x19 + 0x16c);
      }
      *(float *)(unaff_x19 + 0x164) = fVar34;
    }
  }
  fVar34 = 0.0;
  fVar35 = 0.0;
  if ((unaff_w20 & 0x200) != 0) {
    fVar35 = 1.0;
  }
  if ((unaff_w20 & 0x800200) == 0x200) {
    fVar34 = *(float *)(&UNK_00003944 + unaff_x26);
code_r0x0012c864:
    uVar39 = 0;
    uVar40 = 0;
  }
  else {
    if ((unaff_w20 & 0x800200) != 0) goto code_r0x0012c864;
    uVar39 = (undefined2)*(undefined4 *)(&UNK_00003944 + unaff_x26);
    uVar40 = (undefined2)((uint)*(undefined4 *)(&UNK_00003944 + unaff_x26) >> 0x10);
  }
  *(float *)(unaff_x19 + 0xc4) = fVar35 + (float)CONCAT22(uVar40,uVar39);
  *(uint *)(unaff_x19 + 200) = CONCAT22(uVar40,uVar39);
  *(float *)(unaff_x19 + 0xc0) = fVar34;
  uVar39 = 0;
  uVar40 = 0;
  fVar35 = 0.0;
  if ((unaff_w20 & 0x400) != 0) {
    fVar35 = 1.0;
  }
  if ((unaff_w20 & 0x200400) != 0 && (unaff_w20 & 0x400000) == 0) {
    uVar39 = (undefined2)*(undefined4 *)(&UNK_00003944 + unaff_x26);
    uVar40 = (undefined2)((uint)*(undefined4 *)(&UNK_00003944 + unaff_x26) >> 0x10);
  }
  *(float *)(unaff_x19 + 0xbc) = (fVar35 + (float)CONCAT22(uVar40,uVar39)) - fVar34;
  *(undefined8 *)(unaff_x19 + 0x70) = 0xffffffffffffffff;
  *(uint *)(unaff_x19 + 0x94) = (uint)*(ushort *)(unaff_x19 + 0x94);
  *(undefined4 *)(unaff_x19 + 0x98) = 0;
  puVar21 = (undefined8 *)(unaff_x19 + 0x110);
  if (lVar30 != unaff_x28) {
    puVar21 = (undefined8 *)(lVar30 + 0x248);
  }
  uVar16 = *puVar21;
  *(undefined8 *)(unaff_x19 + 0x128) = puVar21[1];
  *(undefined8 *)(unaff_x19 + 0x120) = uVar16;
  fVar34 = (float)((ulong)*(undefined8 *)(unaff_x19 + 0x118) >> 0x20);
  uVar16 = *(undefined8 *)*(undefined1 (*) [12])(unaff_x19 + 0x110);
  fVar35 = (float)((ulong)uVar16 >> 0x20);
  auVar37 = *(undefined1 (*) [16])(unaff_x19 + 0x120);
  sVar41 = -(ushort)(fVar35 <= auVar37._4_4_);
  sVar42 = -(ushort)(auVar37._8_4_ < (float)*(undefined8 *)(unaff_x19 + 0x118));
  sVar43 = -(ushort)(auVar37._12_4_ < fVar34);
  uVar36 = *(undefined8 *)(unaff_x19 + 0x160);
  fVar44 = (float)uVar36;
  fVar45 = (float)((ulong)uVar36 >> 0x20);
  uVar2 = *(undefined8 *)(unaff_x19 + 0x168);
  auVar38._12_4_ = fVar34;
  auVar38._0_12_ = *(undefined1 (*) [12])(unaff_x19 + 0x110);
  auVar4._4_2_ = sVar41;
  auVar4._0_4_ = (int)(short)-(ushort)((float)uVar16 <= auVar37._0_4_);
  auVar4._6_2_ = sVar41 >> 0xf;
  auVar4._8_2_ = sVar42;
  auVar4._10_2_ = sVar42 >> 0xf;
  auVar4._12_2_ = sVar43;
  auVar4._14_2_ = sVar43 >> 0xf;
  auVar37 = auVar37 ^ (auVar37 ^ auVar38) & ~auVar4;
  iVar32 = -(uint)(auVar37._4_4_ < fVar45);
  iVar20 = -(uint)(auVar37._8_4_ < fVar44);
  iVar6 = -(uint)(auVar37._12_4_ < fVar45);
  fVar34 = (float)((ulong)uVar2 >> 0x20);
  auVar7._8_2_ = (short)uVar2;
  auVar7._0_8_ = uVar2;
  auVar7._10_2_ = (short)((ulong)uVar2 >> 0x10);
  auVar7._12_2_ = (short)((ulong)uVar2 >> 0x20);
  auVar7._14_2_ = (short)((ulong)uVar2 >> 0x30);
  auVar11._4_4_ = -(uint)(fVar34 < auVar37._4_4_);
  auVar11._0_4_ = -(uint)((float)uVar2 < auVar37._0_4_);
  auVar11._8_4_ = -(uint)((float)uVar2 < auVar37._8_4_);
  auVar11._12_4_ = -(uint)(fVar34 < auVar37._12_4_);
  auVar38 = auVar37 ^ (auVar37 ^ auVar7) & auVar11;
  auVar9._8_4_ = fVar44;
  auVar9._0_8_ = uVar36;
  auVar9._12_4_ = fVar45;
  auVar5._4_2_ = (short)iVar32;
  auVar5._0_4_ = -(uint)(auVar37._0_4_ < fVar44);
  auVar5._6_2_ = (short)((uint)iVar32 >> 0x10);
  auVar5._8_2_ = (short)iVar20;
  auVar5._10_2_ = (short)((uint)iVar20 >> 0x10);
  auVar5._12_2_ = (short)iVar6;
  auVar5._14_2_ = (short)((uint)iVar6 >> 0x10);
  auVar38 = auVar38 ^ (auVar38 ^ auVar9) & auVar5;
  *(long *)(unaff_x19 + 0x128) = auVar38._8_8_;
  *(long *)(unaff_x19 + 0x120) = auVar38._0_8_;
  if ((unaff_w20 >> 0x11 & 1) == 0) {
    fVar34 = *(float *)(lVar30 + 0x254);
  }
  else {
    fVar34 = auVar38._12_4_;
    if (*(float *)(lVar30 + 0x234) <= auVar38._12_4_) {
      fVar34 = *(float *)(lVar30 + 0x234);
    }
  }
  *(float *)(unaff_x19 + 300) = fVar34;
  *(ulong *)(unaff_x19 + 0x7c) = CONCAT44(fVar35,fVar35);
  *(undefined8 *)(unaff_x19 + 0x88) = 0;
  *(undefined8 *)(unaff_x19 + 0x226) = 0;
  *(undefined1 *)(unaff_x19 + 0x242) = 1;
  *(undefined4 *)(unaff_x19 + 0x206) = 0;
  if (in_stack_00000010._4_4_ + 1 < *(int *)(&UNK_00003f58 + unaff_x26)) {
    *(undefined1 *)(unaff_x19 + 0x245) = 0;
  }
  *(undefined4 *)(in_stack_00000030 + in_stack_00000020 * 0x78 + 8) = 0;
  uVar14 = func_0x000bba44(0x3f800000,0x2b);
  *(undefined4 *)(unaff_x19 + 0xa4) = uVar14;
  uVar14 = func_0x000bba44(0x3f800000,0x2c);
  *(undefined4 *)(unaff_x19 + 0xa8) = uVar14;
  *(long *)(&UNK_00004e18 + unaff_x26) = unaff_x19;
  *(undefined1 *)(unaff_x28 + 0x170) = 0;
  iVar32 = (int)unaff_x25;
  *(int *)(unaff_x28 + 0x1c0) = iVar32;
  if (lVar30 != unaff_x28) {
    *(int *)(lVar30 + 0x1c0) = iVar32;
  }
  if (((in_stack_00000028 >> 1 & 1) != 0) && ((unaff_w20 >> 1 & 1) == 0)) {
    *(undefined1 *)(unaff_x19 + 0x241) = 1;
  }
  iVar20 = *(int *)(in_stack_00000038 + 0x40);
  if (iVar20 <= iVar32) {
    uVar31 = iVar32 + 1;
    iVar6 = *(int *)(in_stack_00000038 + 0x44);
    if (iVar6 <= iVar32) {
      if (iVar6 == 0) {
        uVar19 = 8;
      }
      else {
        iVar20 = iVar6;
        if (iVar6 < 0) {
          iVar20 = iVar6 + 1;
        }
        uVar19 = iVar6 + (iVar20 >> 1);
      }
      if ((int)uVar19 <= (int)uVar31) {
        uVar19 = uVar31;
      }
      uVar16 = func_0x000b810c(-(ulong)(uVar19 >> 0x1f) & 0xfffffffc00000000 | (ulong)uVar19 << 2);
      if (*(long *)(&UNK_00004e68 + unaff_x26) != 0) {
        _memcpy(uVar16,*(long *)(&UNK_00004e68 + unaff_x26),
                (long)*(int *)(in_stack_00000038 + 0x40) << 2);
        func_0x000b83d4(*(undefined8 *)(&UNK_00004e68 + unaff_x26));
      }
      *(undefined8 *)(&UNK_00004e68 + unaff_x26) = uVar16;
      *(uint *)(in_stack_00000038 + 0x44) = uVar19;
      iVar20 = *(int *)(in_stack_00000038 + 0x40);
    }
    if (iVar20 <= iVar32) {
      lVar15 = (long)iVar20;
      do {
        *(undefined4 *)(*(long *)(&UNK_00004e68 + unaff_x26) + lVar15 * 4) = 0xbf800000;
        lVar15 = lVar15 + 1;
      } while ((int)uVar31 != lVar15);
    }
    *(uint *)(in_stack_00000038 + 0x40) = uVar31;
  }
  dVar3 = *(double *)(&UNK_00003f50 + unaff_x26);
  *(float *)(*(long *)(&UNK_00004e68 + unaff_x26) +
            (-(unaff_x25 >> 0x1f & 1) & 0xfffffffc00000000 | (unaff_x25 & 0xffffffff) << 2)) =
       (float)dVar3;
  *(float *)(in_stack_00000030 + in_stack_00000020 * 0x78 + 4) = (float)dVar3;
  *(undefined1 *)(unaff_x19 + 0x248) = 0;
  uVar31 = (int)(*(long *)(unaff_x19 + 0x20) - *(long *)(unaff_x19 + 0x18) >> 4) * -0x49249249;
  lVar15 = *(long *)(unaff_x19 + 8);
  if (uVar31 == 0 || uVar31 == unaff_w27) {
    lVar22 = 0;
    lVar17 = 0;
    lVar27 = 0;
    lVar18 = 0;
    if (lVar15 == 0) goto code_r0x0012cb00;
    if (*(char *)(unaff_x19 + 0x240) == '\0') goto code_r0x0012cbd4;
code_r0x0012cad8:
    *(undefined1 *)(unaff_x19 + 0x238) = 1;
    *(undefined1 *)(unaff_x19 + 0x240) = 0;
    *(undefined2 *)(unaff_x19 + 0x23d) = 0x100;
    *(undefined4 *)(unaff_x19 + 0x60) = 0;
code_r0x0012cbdc:
    *(undefined4 *)(unaff_x19 + 100) = 0xffffffff;
    *(undefined1 *)(unaff_x19 + 0x239) = 1;
    *(undefined2 *)(unaff_x19 + 0x7a) = 0xffff;
    *(undefined2 *)(unaff_x19 + 0x224) = 0xffff;
    *(undefined2 *)(unaff_x19 + 0x214) = 0xffff;
    *(undefined2 *)(unaff_x19 + 0x218) = 0xffff;
    *(undefined4 *)(unaff_x19 + 0x210) = 0xffffffff;
    *(undefined4 *)(unaff_x19 + 0x20a) = 0xffffffff;
    if (0 < (int)unaff_w27) {
      lVar27 = 0;
      lVar15 = 0;
      do {
        lVar18 = *(long *)(unaff_x19 + 0x18);
        puVar21 = (undefined8 *)(lVar18 + lVar27);
        if ((lVar22 == 0) || ((int)uVar31 <= lVar15)) {
          in_stack_00000048 = 0;
          uStack0000000000000040 = 0;
          in_stack_00000058 = 0;
          in_stack_00000050 = 0;
          in_stack_00000068 = 0;
          in_stack_00000060 = 0;
          uStack0000000000000070 = 0;
          uStack0000000000000074 = 0xffffffff;
          uStack0000000000000078 = 0xffffffff;
          uStack000000000000007c = 0xffffffff;
          *puVar21 = 0;
          puVar21[1] = 0;
          *(undefined4 *)(puVar21 + 2) = 0xbf800000;
          *(undefined4 *)(puVar21 + 3) = 0xbf800000;
          *(undefined8 *)((long)puVar21 + 0x24) = 0;
          *(undefined8 *)((long)puVar21 + 0x1c) = 0;
          *(undefined8 *)((long)puVar21 + 0x34) = 0;
          *(undefined8 *)((long)puVar21 + 0x2c) = 0;
          *(undefined8 *)((long)puVar21 + 0x44) = 0;
          *(undefined8 *)((long)puVar21 + 0x3c) = 0;
          *(undefined8 *)((long)puVar21 + 0x54) = 0xffffffffffffffff;
          *(undefined8 *)((long)puVar21 + 0x4c) = 0xffffffff00000000;
          *(undefined4 *)((long)puVar21 + 0x5c) = 0xff00ff;
          *(undefined2 *)(puVar21 + 0xc) = 0xff;
          *(undefined8 *)((long)puVar21 + 0x67) = 0;
          *(undefined8 *)((long)puVar21 + 0x62) = 0;
          *(undefined4 *)((long)puVar21 + 0x14) = *(undefined4 *)((long)puVar21 + 0x14);
          *(undefined1 *)((long)puVar21 + 0x69) = 1;
          *(undefined1 *)((long)puVar21 + 100) = 1;
          *(undefined2 *)((long)puVar21 + 0x62) = 0x101;
        }
        else {
          puVar1 = (undefined8 *)(lVar22 + lVar27);
          uVar8 = *puVar1;
          uVar10 = puVar1[1];
          uVar16 = puVar1[2];
          uVar36 = puVar1[5];
          uVar2 = puVar1[4];
          puVar21[3] = puVar1[3];
          puVar21[2] = uVar16;
          puVar21[5] = uVar36;
          puVar21[4] = uVar2;
          puVar21[1] = uVar10;
          *puVar21 = uVar8;
          uVar12 = puVar1[6];
          uVar13 = puVar1[7];
          uVar2 = puVar1[9];
          uVar16 = puVar1[8];
          uVar8 = puVar1[0xb];
          uVar36 = puVar1[10];
          uVar10 = *(undefined8 *)((long)puVar1 + 0x5f);
          *(undefined8 *)((long)puVar21 + 0x67) = *(undefined8 *)((long)puVar1 + 0x67);
          *(undefined8 *)((long)puVar21 + 0x5f) = uVar10;
          puVar21[9] = uVar2;
          puVar21[8] = uVar16;
          puVar21[0xb] = uVar8;
          puVar21[10] = uVar36;
          puVar21[7] = uVar13;
          puVar21[6] = uVar12;
        }
        *(short *)(*(long *)(unaff_x19 + 0x28) + lVar15 * 2) = (short)lVar15;
        *(short *)(lVar18 + lVar27 + 0x52) = (short)lVar15;
        lVar15 = lVar15 + 1;
        lVar27 = lVar27 + 0x70;
      } while ((ulong)unaff_w27 * 0x70 != lVar27);
    }
  }
  else {
    *(undefined8 *)(unaff_x19 + 8) = 0;
    lVar27 = *(long *)(unaff_x19 + 0x18);
    lVar18 = lVar15;
code_r0x0012cb00:
    lVar17 = lVar18;
    lVar22 = lVar27;
    uVar26 = (ulong)(int)(unaff_w27 * 0x72 + 3);
    uVar29 = uVar26 + (long)(int)(unaff_w27 << 3);
    uVar28 = (long)((ulong)(unaff_w27 + 0x1f) << 0x20) >> 0x23 & 0xfffffffffffffffc;
    uVar23 = uVar28 + (long)(int)uVar29;
    uVar33 = uVar28 + (long)(int)uVar23 & 0xfffffffffffffffc;
    lVar15 = (long)((int)uVar33 + (int)uVar28);
    uVar16 = func_0x000b810c(lVar15);
    *(undefined8 *)(unaff_x19 + 8) = uVar16;
    _bzero(uVar16,lVar15);
    lVar27 = *(long *)(unaff_x19 + 8);
    lVar15 = lVar27 + (int)(unaff_w27 * 0x70);
    *(long *)(unaff_x19 + 0x18) = lVar27;
    *(long *)(unaff_x19 + 0x20) = lVar15;
    *(long *)(unaff_x19 + 0x28) = lVar15;
    *(long *)(unaff_x19 + 0x30) = lVar15 + (int)(unaff_w27 * 2);
    lVar15 = lVar27 + (uVar26 & 0xfffffffffffffffc);
    *(long *)(unaff_x19 + 0x38) = lVar15;
    *(long *)(unaff_x19 + 0x40) = lVar15 + (int)(unaff_w27 << 3);
    *(ulong *)(unaff_x19 + 0x48) = lVar27 + (uVar29 & 0xfffffffffffffffc);
    *(ulong *)(unaff_x19 + 0x50) = lVar27 + (uVar23 & 0xfffffffffffffffc);
    *(ulong *)(unaff_x19 + 0x58) = lVar27 + uVar33;
    *(undefined1 *)(unaff_x19 + 0x23d) = 1;
    *(undefined1 *)(unaff_x19 + 0x238) = 1;
    if (*(char *)(unaff_x19 + 0x240) != '\0') goto code_r0x0012cad8;
code_r0x0012cbd4:
    if (*(char *)(unaff_x19 + 0x238) != '\0') goto code_r0x0012cbdc;
  }
  if (lVar17 != 0) {
    func_0x000b83d4();
  }
  if (*(char *)(unaff_x19 + 0x23d) != '\0') {
    func_0x0012d0f4();
  }
  fVar34 = *(float *)(&UNK_00003d38 + unaff_x26);
  fVar35 = *(float *)(unaff_x19 + 0xe4);
  if (((fVar35 != 0.0) && (fVar35 != fVar34)) && (0 < (int)unaff_w27)) {
    lVar15 = *(long *)(unaff_x19 + 0x18);
    uVar23 = (ulong)unaff_w27;
    fVar35 = fVar34 / fVar35;
    if (unaff_w27 < 4) {
      uVar28 = 0;
    }
    else {
      uVar28 = uVar23 & 0xfffffffc;
      pfVar25 = (float *)(lVar15 + 0xf0);
      uVar29 = uVar28;
      do {
        pfVar25[-0x38] = fVar35 * pfVar25[-0x38];
        pfVar25[-0x1c] = fVar35 * pfVar25[-0x1c];
        *pfVar25 = fVar35 * *pfVar25;
        pfVar25[0x1c] = fVar35 * pfVar25[0x1c];
        pfVar25 = pfVar25 + 0x70;
        uVar29 = uVar29 - 4;
      } while (uVar29 != 0);
      if (uVar28 == uVar23) goto code_r0x0012cddc;
    }
    lVar27 = uVar23 - uVar28;
    pfVar25 = (float *)(lVar15 + uVar28 * 0x70 + 0x10);
    do {
      *pfVar25 = fVar35 * *pfVar25;
      lVar27 = lVar27 + -1;
      pfVar25 = pfVar25 + 0x1c;
    } while (lVar27 != 0);
  }
code_r0x0012cddc:
  *(float *)(unaff_x19 + 0xe4) = fVar34;
  *(undefined1 *)(lVar30 + 0xc3) = 1;
  if (0 < *(int *)(unaff_x19 + 400)) {
    if (*(int *)(unaff_x19 + 0x194) < 0) {
      uVar16 = func_0x000b810c(0);
      if (*(long *)(unaff_x19 + 0x198) != 0) {
        _memcpy(uVar16,*(long *)(unaff_x19 + 0x198),(long)*(int *)(unaff_x19 + 400));
        func_0x000b83d4(*(undefined8 *)(unaff_x19 + 0x198));
      }
      *(undefined8 *)(unaff_x19 + 0x198) = uVar16;
      *(undefined4 *)(unaff_x19 + 0x194) = 0;
    }
    *(undefined4 *)(unaff_x19 + 400) = 0;
  }
  func_0x0012d354();
  return 1;
}

