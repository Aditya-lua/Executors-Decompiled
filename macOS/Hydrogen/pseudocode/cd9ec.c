
/* WARNING: Removing unreachable block (ram,0x000cb648) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_000cd9ec(undefined8 param_1,undefined8 param_2)

{
  float *pfVar1;
  char *pcVar2;
  byte *pbVar3;
  uint *puVar4;
  undefined4 *puVar5;
  int iVar6;
  ulong *puVar7;
  uint uVar8;
  byte bVar9;
  char cVar10;
  bool bVar11;
  undefined *puVar12;
  bool bVar13;
  undefined4 uVar14;
  long lVar15;
  char *pcVar16;
  long *plVar17;
  byte bVar18;
  ulong in_x9;
  uint uVar19;
  long in_x10;
  undefined *puVar20;
  uint uVar21;
  long lVar22;
  long unaff_x19;
  long *unaff_x20;
  long unaff_x21;
  ulong unaff_x22;
  float *pfVar23;
  float *unaff_x25;
  uint unaff_w26;
  int *piVar24;
  uint unaff_w28;
  float *pfVar25;
  long unaff_x29;
  float fVar26;
  float fVar27;
  float fVar28;
  float fVar29;
  undefined8 uVar30;
  undefined8 uVar31;
  int iVar32;
  float fVar33;
  int iVar35;
  ulong uVar34;
  float fVar36;
  float fVar37;
  float fVar38;
  ulong uVar39;
  float fVar40;
  ulong uVar41;
  ulong uVar42;
  float fVar43;
  float fVar44;
  ulong uVar45;
  undefined8 in_d7;
  float unaff_s8;
  float fVar46;
  float unaff_s10;
  float fVar47;
  float unaff_s11;
  float unaff_s12;
  float unaff_s15;
  float fVar48;
  float fVar49;
  long lVar50;
  undefined1 auVar51 [16];
  float in_stack_00000010;
  float in_stack_00000060;
  float in_stack_00000070;
  long in_stack_000000b8;
  undefined8 in_stack_000000c0;
  float *in_stack_000000d0;
  float *in_stack_000000e8;
  uint in_stack_000000f0;
  float *in_stack_00000108;
  undefined8 in_stack_00000110;
  float *in_stack_00000118;
  float in_stack_00000120;
  undefined8 in_stack_00000138;
  uint uStack0000000000000140;
  int iStack0000000000000144;
  int in_stack_00000148;
  undefined8 *in_stack_00000150;
  uint in_stack_00000158;
  char *in_stack_00000160;
  undefined1 *in_stack_00000168;
  int in_stack_00000170;
  int *in_stack_00000178;
  undefined8 in_stack_00000180;
  long in_stack_00000188;
  long in_stack_00000190;
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
  
  uVar34 = _uStack0000000000000140;
  fVar29 = *(float *)(in_x10 + 0x224);
  if (unaff_s15 <= *(float *)(in_x10 + 0x224)) {
    fVar29 = unaff_s15;
  }
  fVar38 = *(float *)(in_x10 + 0x21c);
  if (*(float *)(in_x10 + 0x21c) <= unaff_s15) {
    fVar38 = fVar29;
  }
  if ((in_x9 & 1) == 0) {
    fVar29 = (float)((ulong)param_1 >> 0x20);
    fVar33 = (float)param_2 + (float)param_1;
    fVar28 = (float)((ulong)param_2 >> 0x20) + fVar29;
    fVar40 = (float)in_d7;
    in_stack_00000070 = unaff_s8 + ((float)param_1 - unaff_s8) * fVar40;
    fVar33 = fVar33 + (unaff_s8 - fVar33) * fVar40;
    fVar44 = (float)((ulong)in_d7 >> 0x20);
    fVar48 = fVar38 + (fVar29 - fVar38) * fVar44;
    fVar46 = fVar33 - in_stack_00000070;
    fVar29 = (float)func_0x000d1c94();
    fVar46 = fVar29 - fVar46;
    if (fVar40 != 0.0) {
      fVar46 = 0.0;
    }
    in_stack_00000070 = in_stack_00000070 - fVar46;
    fVar38 = fVar33 - ((fVar28 + (fVar38 - fVar28) * fVar44) - fVar48);
    if (fVar44 != 0.0) {
      fVar38 = 0.0;
    }
    unaff_s10 = fVar48 - fVar38;
    *(float *)(unaff_x29 + -0xe8) = fVar29;
    *(float *)(unaff_x29 + -0xe4) = fVar33;
    unaff_x19 = in_stack_000001b8;
  }
  lVar50 = lRam0000000000a334c0;
  if (*(char *)(unaff_x29 + -0xb8) != '\0') {
    unaff_w28 = (uint)unaff_x22;
  }
  if (*(char *)(unaff_x29 + -0xc0) != '\0') {
    unaff_w26 = (uint)unaff_x22;
  }
  while (unaff_x22 = unaff_x22 + 1, unaff_x22 != 4) {
    if ((in_stack_000000f0 >> (ulong)((uint)unaff_x22 & 0x1f) & 1) != 0) {
                    /* WARNING: Could not recover jumptable at 0x000cd5f0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)(&UNK_000cd5f4 + (ulong)(byte)(&UNK_0080c3c0)[unaff_x22 & 0xffffffff] * 4))();
      return;
    }
  }
  *(int *)(*(long *)(lRam0000000000a334c0 + 0x4000) + 0x100) =
       *(int *)(*(long *)(lRam0000000000a334c0 + 0x4000) + 0x100) + -1;
  *(undefined4 *)(unaff_x20 + 0x2d) = 0;
  if ((*(long *)(&UNK_00004d10 + in_stack_000000b8) != 0) &&
     (*(long **)(*(long *)(&UNK_00004d10 + in_stack_000000b8) + 0x388) == unaff_x20)) {
    if (*(int *)(unaff_x21 + 0xb30) == 3) {
      puVar12 = &UNK_00003670;
      fVar29 = *(float *)(&UNK_00003650 + lVar50) - *(float *)(&UNK_00003640 + lVar50);
      puVar20 = &UNK_00003660;
code_r0x000cdb50:
      fVar38 = *(float *)(puVar12 + lVar50) - *(float *)(puVar20 + lVar50);
    }
    else {
      fVar29 = 0.0;
      if (*(int *)(unaff_x21 + 0xb30) == 2) {
        fVar38 = 0.0;
        if (*(char *)(in_stack_000000b8 + 0xe5d) != '\0') {
          puVar12 = &UNK_00002eb0;
          fVar29 = *(float *)(&UNK_00002e90 + lVar50) - *(float *)(&UNK_00002e80 + lVar50);
          puVar20 = &UNK_00002ea0;
          goto code_r0x000cdb50;
        }
      }
      else {
        fVar38 = 0.0;
      }
    }
    if ((fVar29 != 0.0) || (fVar38 != 0.0)) {
      fVar28 = *(float *)(in_stack_000000b8 + 0x50);
      if (*(float *)(in_stack_000000b8 + 0x54) <= *(float *)(in_stack_000000b8 + 0x50)) {
        fVar28 = *(float *)(in_stack_000000b8 + 0x54);
      }
      fVar28 = *(float *)(in_stack_000000b8 + 0x18) * 600.0 * fVar28;
      fVar29 = *in_stack_000000e8 + fVar29 * fVar28;
      fVar38 = in_stack_000000e8[1] + fVar38 * fVar28;
      *in_stack_000000e8 = fVar29;
      in_stack_000000e8[1] = fVar38;
      fVar28 = (in_stack_00000060 - *(float *)(unaff_x20 + 5)) - *(float *)(unaff_x20 + 6);
      fVar33 = (in_stack_00000010 - *(float *)((long)unaff_x20 + 0x2c)) -
               *(float *)((long)unaff_x20 + 0x34);
      if (fVar29 < fVar28) {
        fVar29 = fVar28;
      }
      if (fVar38 < fVar33) {
        fVar38 = fVar33;
      }
      *in_stack_000000e8 = fVar29;
      in_stack_000000e8[1] = fVar38;
      *(undefined1 *)(unaff_x21 + 0xcfc) = 0;
      *(undefined1 *)(unaff_x21 + 0xb47) = 1;
      uVar14 = func_0x000bba44(0x3f800000,0x20);
      *(undefined4 *)(unaff_x29 + -0xb0) = uVar14;
      if ((int)fVar29 != 0 || (int)fVar38 != 0) {
        fVar28 = (float)(int)fVar38;
        fVar38 = *(float *)((long)unaff_x20 + 0x3c) + fVar28;
        uVar14 = func_0x000d1c94();
        *(undefined4 *)(unaff_x29 + -0xe8) = uVar14;
        *(float *)(unaff_x29 + -0xe4) = fVar38;
        *in_stack_000000e8 = *in_stack_000000e8 - (float)(int)fVar29;
        in_stack_000000e8[1] = in_stack_000000e8[1] - fVar28;
        unaff_x19 = in_stack_000001b8;
      }
    }
  }
  fVar38 = *(float *)(unaff_x20 + 7);
  fVar28 = *(float *)(unaff_x29 + -0xe8);
  fVar29 = fVar38;
  if (fVar28 != 3.4028235e+38) {
    bVar13 = false;
    if ((*(float *)(unaff_x20 + 6) == fVar28) && (bVar13 = false, !NAN(fVar38) && !NAN(fVar28))) {
      bVar13 = fVar38 == fVar28;
    }
    if (!bVar13) {
      *(float *)(unaff_x20 + 7) = fVar28;
      *(float *)(unaff_x20 + 6) = fVar28;
      fVar29 = fVar28;
    }
  }
  fVar46 = *(float *)((long)unaff_x20 + 0x3c);
  fVar33 = *(float *)(unaff_x29 + -0xe4);
  fVar28 = fVar46;
  if (fVar33 != 3.4028235e+38) {
    bVar13 = false;
    if ((*(float *)((long)unaff_x20 + 0x34) == fVar33) &&
       (bVar13 = false, !NAN(fVar46) && !NAN(fVar33))) {
      bVar13 = fVar46 == fVar33;
    }
    if (!bVar13) {
      *(float *)((long)unaff_x20 + 0x3c) = fVar33;
      *(float *)((long)unaff_x20 + 0x34) = fVar33;
      fVar28 = fVar33;
    }
  }
  fVar44 = *(float *)(unaff_x20 + 5);
  fVar40 = *(float *)((long)unaff_x20 + 0x2c);
  fVar33 = fVar44;
  if ((in_stack_00000070 != 3.4028235e+38) &&
     (fVar48 = (float)(int)in_stack_00000070, fVar44 != fVar48)) {
    *in_stack_00000108 = fVar48;
    fVar33 = fVar48;
  }
  fVar48 = fVar40;
  if ((unaff_s10 != 3.4028235e+38) && (fVar49 = (float)(int)unaff_s10, fVar40 != fVar49)) {
    *unaff_x25 = fVar49;
    fVar48 = fVar49;
  }
  if (((((fVar44 != fVar33) || (fVar40 != fVar48)) || (fVar38 != fVar29)) || (fVar46 != fVar28)) &&
     (((*(byte *)((long)unaff_x20 + 0x15) & 1) == 0 &&
      (*(float *)(&UNK_00005f5c + lRam0000000000a334c0) <= 0.0)))) {
    *(float *)(&UNK_00005f5c + lRam0000000000a334c0) = *(float *)(lRam0000000000a334c0 + 0x1c);
  }
  if (unaff_w26 != 0xffffffff) {
    if (unaff_w26 < 4) {
      fVar40 = *(float *)((long)unaff_x20 + 0x2c);
      fVar38 = fVar33 + *(float *)(unaff_x20 + 6);
      fVar46 = fVar40 + *(float *)((long)unaff_x20 + 0x34);
      switch(unaff_w26) {
      case 0:
        fVar29 = fVar33 + -4.0;
        fVar28 = fVar40 + in_stack_00000120;
        fVar38 = fVar33 + 4.0;
        fVar46 = fVar46 - in_stack_00000120;
        break;
      case 1:
        fVar29 = fVar38 + -4.0;
        fVar28 = fVar40 + in_stack_00000120;
        fVar38 = fVar38 + 4.0;
        fVar46 = fVar46 - in_stack_00000120;
        break;
      case 2:
        fVar29 = fVar33 + in_stack_00000120;
        fVar28 = fVar40 + -4.0;
        fVar38 = fVar38 - in_stack_00000120;
        fVar46 = fVar40 + 4.0;
        break;
      case 3:
        fVar29 = fVar33 + in_stack_00000120;
        fVar28 = fVar46 + -4.0;
        fVar38 = fVar38 - in_stack_00000120;
        fVar46 = fVar46 + 4.0;
      }
    }
    else {
      fVar46 = 0.0;
      fVar38 = 0.0;
      fVar28 = 0.0;
      fVar29 = 0.0;
    }
    *in_stack_000000d0 = fVar29;
    in_stack_000000d0[1] = fVar28;
    in_stack_000000d0[2] = fVar38;
    in_stack_000000d0[3] = fVar46;
  }
  if ((in_stack_000000c0._4_4_ != 0) &&
     (uStack0000000000000140 = uStack0000000000000140 | in_stack_000000c0._4_4_,
     in_stack_000000c0._4_4_ != 1)) {
    in_stack_00000148 = 1;
  }
  *(char *)((long)unaff_x20 + 0xc9) = (char)unaff_w28;
  *(char *)((long)unaff_x20 + 0xca) = (char)unaff_w26;
  uStack00000000000001c8 = *(float *)(unaff_x20 + 7);
  if (*(char *)((long)unaff_x20 + 0xc1) == '\0') {
    fVar38 = 0.0;
    fVar29 = 0.0;
    if ((in_stack_00000198 & 0x100000000) == 0) {
      fVar38 = *(float *)(unaff_x20 + 0xb) + *(float *)(unaff_x20 + 0xb) + *(float *)(unaff_x20 + 8)
      ;
      fVar29 = *(float *)((long)unaff_x20 + 0x5c) + *(float *)((long)unaff_x20 + 0x5c) +
               *(float *)((long)unaff_x20 + 0x44);
    }
    if ((uStack0000000000000140 & 1) == 0) {
      uStack00000000000001c8 =
           unaff_s11 + (*(float *)(unaff_x20 + 0x42) - *(float *)(unaff_x20 + 0x41));
    }
    fVar28 = *(float *)((long)unaff_x20 + 0x3c) -
             (*(float *)((long)unaff_x20 + 0x6c) + *(float *)((long)unaff_x20 + 0x74));
    if (in_stack_00000148 == 0) {
      fVar28 = unaff_s12 +
               (*(float *)((long)unaff_x20 + 0x214) - *(float *)((long)unaff_x20 + 0x20c));
    }
    if ((in_stack_000001b0._4_4_ >> 0xe & 1) == 0) {
      uVar21 = in_stack_000001b0._4_4_ & 8;
      bVar13 = (in_stack_000001b0 & 0x800000000) == 0 && fVar28 < fVar29;
      *(bool *)((long)unaff_x20 + 0xbd) = bVar13;
      if ((in_stack_000001b0._4_4_ >> 0xf & 1) == 0) {
        if (bVar13) goto code_r0x000cb014;
        if (!(fVar38 <= uStack00000000000001c8 - 0.0 || (in_stack_000001b0 & 0x800000000) != 0))
        goto code_r0x000caf38;
code_r0x000cb030:
        uVar19 = 0;
        *(undefined1 *)((long)unaff_x20 + 0xbc) = 0;
      }
      else {
        uVar19 = 1;
        *(undefined1 *)((long)unaff_x20 + 0xbc) = 1;
        if (!bVar13) {
code_r0x000cb048:
          bVar13 = fVar28 < fVar29 && uVar21 == 0;
          *(bool *)((long)unaff_x20 + 0xbd) = bVar13;
          uVar19 = 1;
        }
      }
code_r0x000cb05c:
      if (bVar13) {
        fVar29 = *(float *)(&UNK_0000395c + unaff_x19);
      }
      else {
        fVar29 = 0.0;
      }
      if (uVar19 != 0) goto code_r0x000cb06c;
      fVar38 = 0.0;
    }
    else {
      *(undefined1 *)((long)unaff_x20 + 0xbd) = 1;
      if ((in_stack_000001b0._4_4_ >> 0xf & 1) == 0) {
code_r0x000cb014:
        bVar13 = true;
        if (!(uStack00000000000001c8 - *(float *)(&UNK_0000395c + unaff_x19) < fVar38 &&
             (in_stack_000001b0 & 0x800000000) == 0)) goto code_r0x000cb030;
code_r0x000caf38:
        uVar19 = (in_stack_000001b0._4_4_ & 0x800) >> 0xb;
        *(char *)((long)unaff_x20 + 0xbc) = (char)uVar19;
        bVar11 = bVar13;
        if ((in_stack_000001b0 & 0x80000000000) == 0) {
          bVar11 = true;
        }
        if (!bVar11) {
          uVar21 = 0;
          goto code_r0x000cb048;
        }
        goto code_r0x000cb05c;
      }
      *(undefined1 *)((long)unaff_x20 + 0xbc) = 1;
      fVar29 = *(float *)(&UNK_0000395c + unaff_x19);
code_r0x000cb06c:
      fVar38 = *(float *)(&UNK_0000395c + unaff_x19);
    }
    *(float *)((long)unaff_x20 + 0xb4) = fVar29;
    *(float *)(unaff_x20 + 0x17) = fVar38;
    *(float *)(unaff_x20 + 0xe) = fVar29 + *(float *)(unaff_x20 + 0xe);
    *(float *)((long)unaff_x20 + 0x74) = *(float *)((long)unaff_x20 + 0x74) + fVar38;
    uStack00000000000001c8 = *(float *)(unaff_x20 + 7);
  }
  if (in_stack_00000170 == 0x3000000) {
    in_stack_00000158 = 1;
  }
  puVar7 = &uStack00000000000001e0;
  if (in_stack_00000158 == 0) {
    puVar7 = (ulong *)(in_stack_00000188 + 0x248);
  }
  in_stack_000001d8 = puVar7[1];
  uVar45 = *puVar7;
  uStack00000000000001c0 = *(float *)(unaff_x20 + 5);
  fStack00000000000001c4 = *(float *)((long)unaff_x20 + 0x2c);
  fVar29 = (float)unaff_x20[6];
  fVar38 = uStack00000000000001c0 + fVar29;
  fVar28 = fStack00000000000001c4 + (float)((ulong)unaff_x20[6] >> 0x20);
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
  pfVar23 = (float *)((long)unaff_x20 + 100);
  fVar46 = *pfVar23;
  *(float *)((long)unaff_x20 + 0x1fc) = fStack00000000000001c4;
  *(float *)((long)unaff_x20 + 0x204) = fVar28;
  uStack00000000000001d0._0_4_ = (float)uVar45;
  uStack00000000000001d0._4_4_ = (float)(uVar45 >> 0x20);
  fVar33 = uStack00000000000001c0;
  if (uStack00000000000001c0 < (float)uStack00000000000001d0) {
    fVar33 = (float)uStack00000000000001d0;
  }
  fVar40 = fStack00000000000001c4;
  if (fStack00000000000001c4 < uStack00000000000001d0._4_4_) {
    fVar40 = uStack00000000000001d0._4_4_;
  }
  *(float *)(unaff_x20 + 0x3f) = fVar33;
  *(float *)((long)unaff_x20 + 0x1fc) = fVar40;
  fVar44 = (float)in_stack_000001d8;
  fVar48 = (float)(in_stack_000001d8 >> 0x20);
  unaff_x20[0x40] =
       in_stack_000001d8 ^
       (in_stack_000001d8 ^ CONCAT44(fVar28,fVar38)) &
       CONCAT44(-(uint)(fVar28 < fVar48),-(uint)(fVar38 < fVar44));
  fVar33 = uStack00000000000001c0 + (float)unaff_x20[0xd];
  fVar40 = fStack00000000000001c4 + (float)((ulong)unaff_x20[0xd] >> 0x20);
  fVar38 = fVar38 - (float)unaff_x20[0xe];
  fVar28 = fVar28 - (float)((ulong)unaff_x20[0xe] >> 0x20);
  in_stack_00000150[1] = CONCAT44(fVar28,fVar38);
  *in_stack_00000150 = CONCAT44(fVar40,fVar33);
  pfVar25 = pfVar23;
  if ((in_stack_000001b0._4_4_ & 0x401) != 1) {
    pfVar25 = (float *)(&UNK_00003930 + unaff_x19);
  }
  fVar49 = (float)(int)(*(float *)(unaff_x20 + 0xb) * 0.5);
  if ((float)(int)(*(float *)(unaff_x20 + 0xb) * 0.5) < fVar46) {
    fVar49 = fVar46;
  }
  uVar41 = NEON_scvtf(CONCAT44((int)(fVar40 + 0.5 + *pfVar25),(int)(fVar33 + 0.5 + fVar49)),4);
  fVar26 = (float)(uVar41 >> 0x20);
  *(float *)((long)unaff_x20 + 0x21c) = fVar26;
  uVar39 = NEON_scvtf(CONCAT44((int)((fVar28 + 0.5) - fVar46),(int)((fVar38 + 0.5) - fVar49)),4);
  fVar46 = (float)(uVar39 >> 0x20);
  *(float *)((long)unaff_x20 + 0x224) = fVar46;
  uVar42 = uVar41 ^ (uVar41 ^ in_stack_000001d8) &
                    CONCAT44(-(uint)(fVar48 < fVar26),-(uint)(fVar44 < (float)uVar41));
  unaff_x20[0x43] =
       uVar42 ^ (uVar42 ^ uVar45) &
                CONCAT44(-(uint)(fVar26 < uStack00000000000001d0._4_4_),
                         -(uint)((float)uVar41 < (float)uStack00000000000001d0));
  uVar41 = uVar39 ^ (uVar39 ^ in_stack_000001d8) &
                    CONCAT44(-(uint)(fVar48 < fVar46),-(uint)(fVar44 < (float)uVar39));
  unaff_x20[0x44] =
       uVar41 ^ (uVar41 ^ uVar45) &
                CONCAT44(-(uint)(fVar46 < uStack00000000000001d0._4_4_),
                         -(uint)((float)uVar39 < (float)uStack00000000000001d0));
  if ((((in_stack_000001b0._4_4_ >> 6 & 1) != 0) || (fVar29 <= 0.0)) ||
     ((in_stack_000001b0._4_4_ >> 0x19 & 1) != 0)) {
    fVar29 = *(float *)(&UNK_00003d38 + unaff_x19) * 16.0;
  }
  else {
    fVar29 = fVar29 * 0.65;
  }
  *(float *)(unaff_x20 + 0x4f) = (float)(int)fVar29;
  fVar29 = ((float)unaff_x20[8] + (float)unaff_x20[0xb] * 2.0) - (fVar38 - fVar33);
  fVar38 = ((float)((ulong)unaff_x20[8] >> 0x20) + (float)((ulong)unaff_x20[0xb] >> 0x20) * 2.0) -
           (fVar28 - fVar40);
  iVar32 = -(uint)(fVar29 <= 0.0);
  iVar35 = -(uint)(fVar38 <= 0.0);
  *(ulong *)((long)unaff_x20 + 0x94) =
       CONCAT17((byte)((uint)fVar38 >> 0x18) & ~(byte)((uint)iVar35 >> 0x18),
                CONCAT16((byte)((uint)fVar38 >> 0x10) & ~(byte)((uint)iVar35 >> 0x10),
                         CONCAT15((byte)((uint)fVar38 >> 8) & ~(byte)((uint)iVar35 >> 8),
                                  CONCAT14(SUB41(fVar38,0) & ~(byte)iVar35,
                                           CONCAT13((byte)((uint)fVar29 >> 0x18) &
                                                    ~(byte)((uint)iVar32 >> 0x18),
                                                    CONCAT12((byte)((uint)fVar29 >> 0x10) &
                                                             ~(byte)((uint)iVar32 >> 0x10),
                                                             CONCAT11((byte)((uint)fVar29 >> 8) &
                                                                      ~(byte)((uint)iVar32 >> 8),
                                                                      SUB41(fVar29,0) &
                                                                      ~(byte)iVar32)))))));
  uStack00000000000001d0 = uVar45;
  uVar14 = func_0x000d2840();
  *(undefined4 *)((long)unaff_x20 + 0x8c) = uVar14;
  *(int *)(unaff_x20 + 0x12) = iVar32;
  *(undefined8 *)((long)unaff_x20 + 0x9c) = 0x7f7fffff7f7fffff;
  unaff_x20[0xf] = 0;
  func_0x000f0b5c(unaff_x20[0x55],
                  *(undefined8 *)(*(long *)(*(long *)(&UNK_00003d30 + unaff_x19) + 0x40) + 8));
  lVar22 = *(long *)(lRam0000000000a334c0 + 0x4000);
  *(undefined1 *)(lVar22 + 0xc0) = 1;
  func_0x000f0930(*(undefined8 *)(lVar22 + 0x2a8),&uStack00000000000001d0,
                  (ulong)&uStack00000000000001d0 | 8,0);
  lVar50 = *(long *)(*(long *)(lVar22 + 0x2a8) + 0x60) +
           (long)*(int *)(*(long *)(lVar22 + 0x2a8) + 0x58) * 0x10;
  uVar30 = *(undefined8 *)(lVar50 + -0x10);
  *(undefined8 *)(lVar22 + 0x250) = *(undefined8 *)(lVar50 + -8);
  *(undefined8 *)(lVar22 + 0x248) = uVar30;
  if ((in_stack_00000158 & 1) == 0) {
    if ((*(int *)(in_stack_00000188 + 0x1a0) < 2) ||
       (lVar50 = *(long *)(*(long *)(in_stack_00000188 + 0x1a8) +
                          (ulong)(*(int *)(in_stack_00000188 + 0x1a0) - 2) * 8), lVar50 == 0)) {
      bVar13 = false;
    }
    else {
      bVar13 = false;
      if ((*(float *)((long)unaff_x20 + 0x2c) <
           *(float *)(lVar50 + 0x2c) + *(float *)(lVar50 + 0x34)) &&
         (*(float *)(lVar50 + 0x2c) <
          *(float *)((long)unaff_x20 + 0x2c) + *(float *)((long)unaff_x20 + 0x34))) {
        if (*(float *)(unaff_x20 + 5) < *(float *)(lVar50 + 0x28) + *(float *)(lVar50 + 0x30)) {
          bVar13 = *(float *)(lVar50 + 0x28) < *(float *)(unaff_x20 + 5) + *(float *)(unaff_x20 + 6)
          ;
        }
      }
    }
    bVar11 = false;
    if (((*(int *)(*(long *)((int *)unaff_x20[0x55] + 2) + (long)*(int *)unaff_x20[0x55] * 0x38 +
                  -0x18) == 0) && (*(int *)(*(long *)(in_stack_00000188 + 0x2a8) + 0x20) != 0)) &&
       (!bVar13)) {
      unaff_x20[0x55] = *(long *)(in_stack_00000188 + 0x2a8);
      bVar11 = true;
    }
  }
  else {
    bVar11 = false;
  }
  lVar50 = lRam0000000000a334c0;
  lVar22 = *(long *)(&UNK_00004d10 + in_stack_000001b8);
  if (lVar22 == 0) {
    lVar22 = *(long *)(&UNK_00004b18 + in_stack_000001b8);
    if ((uVar34 & 0x100000000) == 0) goto code_r0x000cb408;
code_r0x000cb3f4:
    bVar13 = true;
  }
  else {
    if ((uVar34 & 0x100000000) != 0) goto code_r0x000cb3f4;
code_r0x000cb408:
    if (lVar22 == 0) {
      bVar13 = false;
    }
    else {
      bVar13 = unaff_x20[0x73] == *(long *)(lVar22 + 0x398);
    }
  }
  pbVar3 = &UNK_000049f8 + lRam0000000000a334c0;
  uVar21 = *(uint *)((long)unaff_x20 + 0x14);
  *(undefined1 *)((long)unaff_x20 + 0xc3) = 0;
  fVar29 = *(float *)(unaff_x20 + 0xc);
  fVar38 = *(float *)((long)unaff_x20 + 100);
  if (*(char *)((long)unaff_x20 + 0xc1) == '\0') {
    if ((uVar21 >> 7 & 1) == 0) {
      lVar22 = 2;
      if ((uVar21 & 0x1000000) != 0) {
        lVar22 = 3;
      }
      if ((uVar21 & 0x6000000) != 0) {
        lVar22 = 4;
      }
      lVar22 = lVar22 * 0x10 + lVar50;
      fVar33 = *(float *)(&UNK_000038e8 + lVar22 + 0xe4);
      fVar46 = *(float *)(&UNK_000038e8 + lVar22 + 0xf0) * *(float *)(&UNK_000038e8 + lVar50);
      fVar28 = 1.0;
      if (fVar33 <= 1.0) {
        fVar28 = fVar33;
      }
      fVar44 = 0.0;
      fVar40 = 0.0;
      if (0.0 <= fVar33) {
        fVar40 = fVar28;
      }
      uVar34 = *(ulong *)(&UNK_000038e8 + lVar22 + 0xe8);
      uVar45 = NEON_fmov(0x3f800000,4);
      fVar28 = (float)(uVar34 >> 0x20);
      uVar45 = uVar45 ^ (uVar45 ^ uVar34) &
                        ~CONCAT44(-(uint)((float)(uVar45 >> 0x20) < fVar28),
                                  -(uint)((float)uVar45 < (float)uVar34));
      iVar32 = -(uint)((float)uVar34 < 0.0);
      iVar35 = -(uint)(fVar28 < 0.0);
      fVar28 = (float)CONCAT13((byte)(uVar45 >> 0x18) & ~(byte)((uint)iVar32 >> 0x18),
                               CONCAT12((byte)(uVar45 >> 0x10) & ~(byte)((uint)iVar32 >> 0x10),
                                        CONCAT11((byte)(uVar45 >> 8) & ~(byte)((uint)iVar32 >> 8),
                                                 (byte)uVar45 & ~(byte)iVar32)));
      uVar30 = NEON_ushl(CONCAT44((int)((float)(CONCAT17((byte)(uVar45 >> 0x38) &
                                                         ~(byte)((uint)iVar35 >> 0x18),
                                                         CONCAT16((byte)(uVar45 >> 0x30) &
                                                                  ~(byte)((uint)iVar35 >> 0x10),
                                                                  CONCAT15((byte)(uVar45 >> 0x28) &
                                                                           ~(byte)((uint)iVar35 >> 8
                                                                                  ),CONCAT14((byte)(
                                                  uVar45 >> 0x20) & ~(byte)iVar35,fVar28)))) >> 0x20
                                               ) * 255.0 + 0.5),(int)(fVar28 * 255.0 + 0.5)),
                         _UNK_0080c188,4);
      uVar19 = (uint)uVar30 | (int)(fVar40 * 255.0 + 0.5) | (uint)((ulong)uVar30 >> 0x20);
      fVar28 = 1.0;
      if (fVar46 <= 1.0) {
        fVar28 = fVar46;
      }
      fVar33 = 0.0;
      if (0.0 <= fVar46) {
        fVar33 = fVar28;
      }
      if ((*pbVar3 >> 6 & 1) == 0) {
        uVar19 = uVar19 | (int)(fVar33 * 255.0 + 0.5) << 0x18;
        lVar22 = unaff_x20[0x55];
        if ((uVar21 & 1) != 0) goto code_r0x000cb54c;
code_r0x000cb67c:
        fVar44 = *(float *)(&UNK_00003d3c + *unaff_x20) * *(float *)(unaff_x20 + 0x54);
        if (unaff_x20[0x6f] != 0) {
          fVar44 = fVar44 * *(float *)(unaff_x20[0x6f] + 0x2a0);
        }
        fVar44 = fVar44 + *(float *)(&UNK_00003928 + *unaff_x20) * 2.0;
        uVar30 = 0xc0;
      }
      else {
        fVar33 = *(float *)(&UNK_00004a58 + lVar50);
        fVar28 = 1.0;
        if (fVar33 <= 1.0) {
          fVar28 = fVar33;
        }
        fVar46 = 0.0;
        if (0.0 <= fVar33) {
          fVar46 = fVar28;
        }
        uVar19 = uVar19 & 0xffffff | (int)(fVar46 * 255.0 + 0.5) << 0x18;
        lVar22 = unaff_x20[0x55];
        if ((uVar21 & 1) == 0) goto code_r0x000cb67c;
code_r0x000cb54c:
        uVar30 = 0;
      }
      fVar28 = *(float *)((long)unaff_x20 + 0x2c);
      lVar15 = unaff_x20[5];
      *(float *)(unaff_x29 + -0xd8) = *(float *)(unaff_x20 + 5) + 0.0;
      *(float *)(unaff_x29 + -0xd4) = fVar44 + fVar28;
      *(ulong *)(unaff_x29 + -0xe8) =
           CONCAT44((float)((ulong)lVar15 >> 0x20) + (float)((ulong)unaff_x20[6] >> 0x20),
                    (float)lVar15 + (float)unaff_x20[6]);
      func_0x000f3bb0(fVar29,lVar22,unaff_x29 + -0xd8,unaff_x29 + -0xe8,uVar19,uVar30);
    }
    if ((uVar21 & 1) == 0) {
      lVar22 = 0xb0;
      if (!bVar13) {
        lVar22 = 0xa0;
      }
      lVar22 = lRam0000000000a334c0 + lVar22;
      fVar33 = *(float *)(&UNK_000038e8 + lVar22 + 0xe4);
      fVar46 = *(float *)(&UNK_000038e8 + lVar22 + 0xe8);
      fVar40 = *(float *)(&UNK_000038e8 + lVar22 + 0xec);
      fVar28 = 1.0;
      if (fVar33 <= 1.0) {
        fVar28 = fVar33;
      }
      fVar44 = 0.0;
      if (0.0 <= fVar33) {
        fVar44 = fVar28;
      }
      fVar33 = *(float *)(&UNK_000038e8 + lVar22 + 0xf0) *
               *(float *)(&UNK_000038e8 + lRam0000000000a334c0);
      fVar28 = 1.0;
      if (fVar46 <= 1.0) {
        fVar28 = fVar46;
      }
      fVar48 = 0.0;
      if (0.0 <= fVar46) {
        fVar48 = fVar28;
      }
      iVar32 = -(uint)(fVar40 < 0.0);
      iVar35 = -(uint)(fVar33 < 0.0);
      uVar34 = NEON_fmov(0x3f800000,4);
      uVar34 = uVar34 ^ (uVar34 ^ CONCAT44(fVar33,fVar40)) &
                        ~CONCAT44(-(uint)((float)(uVar34 >> 0x20) < fVar33),
                                  -(uint)((float)uVar34 < fVar40));
      fVar28 = (float)CONCAT13((byte)(uVar34 >> 0x18) & ~(byte)((uint)iVar32 >> 0x18),
                               CONCAT12((byte)(uVar34 >> 0x10) & ~(byte)((uint)iVar32 >> 0x10),
                                        CONCAT11((byte)(uVar34 >> 8) & ~(byte)((uint)iVar32 >> 8),
                                                 (byte)uVar34 & ~(byte)iVar32)));
      uVar30 = NEON_ushl(CONCAT44((int)((float)(CONCAT17((byte)(uVar34 >> 0x38) &
                                                         ~(byte)((uint)iVar35 >> 0x18),
                                                         CONCAT16((byte)(uVar34 >> 0x30) &
                                                                  ~(byte)((uint)iVar35 >> 0x10),
                                                                  CONCAT15((byte)(uVar34 >> 0x28) &
                                                                           ~(byte)((uint)iVar35 >> 8
                                                                                  ),CONCAT14((byte)(
                                                  uVar34 >> 0x20) & ~(byte)iVar35,fVar28)))) >> 0x20
                                               ) * 255.0 + 0.5),(int)(fVar28 * 255.0 + 0.5)),
                         _UNK_0080c190,4);
      func_0x000f3bb0(fVar29,unaff_x20[0x55],&uStack00000000000001c0,&uStack00000000000001c8,
                      (int)(fVar44 * 255.0 + 0.5) | (int)(fVar48 * 255.0 + 0.5) << 8 | (uint)uVar30
                      | (uint)((ulong)uVar30 >> 0x20),0x30);
    }
    if ((uVar21 >> 10 & 1) != 0) {
      fVar33 = 0.0;
      fVar28 = 0.0;
      if ((*(uint *)((long)unaff_x20 + 0x14) & 1) == 0) {
        fVar28 = *(float *)(&UNK_00003d3c + *unaff_x20) * *(float *)(unaff_x20 + 0x54);
        if (unaff_x20[0x6f] != 0) {
          fVar28 = fVar28 * *(float *)(unaff_x20[0x6f] + 0x2a0);
        }
        fVar28 = fVar28 + *(float *)(&UNK_00003928 + *unaff_x20) * 2.0;
      }
      fVar40 = *(float *)(unaff_x20 + 5);
      fVar46 = *(float *)((long)unaff_x20 + 0x2c);
      if ((*(uint *)((long)unaff_x20 + 0x14) >> 10 & 1) != 0) {
        fVar33 = *(float *)(&UNK_00003d3c + *unaff_x20) * *(float *)(unaff_x20 + 0x54);
        if (unaff_x20[0x6f] != 0) {
          fVar33 = fVar33 * *(float *)(unaff_x20[0x6f] + 0x2a0);
        }
        fVar33 = *(float *)(unaff_x20 + 0x2f) + fVar33 +
                 *(float *)(&UNK_00003928 + *unaff_x20) * 2.0;
      }
      fVar28 = fVar46 + fVar28;
      fVar48 = fVar46 + *(float *)((long)unaff_x20 + 0x34);
      fVar44 = fVar28;
      if (fVar28 < fVar46) {
        fVar44 = fVar46;
      }
      fVar46 = fVar40 + *(float *)(unaff_x20 + 7);
      if (fVar40 + *(float *)(unaff_x20 + 6) <= fVar40 + *(float *)(unaff_x20 + 7)) {
        fVar46 = fVar40 + *(float *)(unaff_x20 + 6);
      }
      fVar49 = fVar28 + fVar33;
      if (fVar48 <= fVar28 + fVar33) {
        fVar49 = fVar48;
      }
      lVar22 = unaff_x20[0x55];
      *(float *)(unaff_x29 + -0xd8) = fVar38 + fVar40;
      *(float *)(unaff_x29 + -0xd4) = fVar44 + 0.0;
      *(float *)(unaff_x29 + -0xe8) = fVar46 - fVar38;
      *(float *)(unaff_x29 + -0xe4) = fVar49;
      uVar30 = _UNK_0080c190;
      fVar33 = *(float *)(&UNK_00003a9c + lRam0000000000a334c0);
      fVar44 = *(float *)(&UNK_00003aa0 + lRam0000000000a334c0);
      fVar28 = 1.0;
      if (fVar33 <= 1.0) {
        fVar28 = fVar33;
      }
      fVar48 = 0.0;
      if (0.0 <= fVar33) {
        fVar48 = fVar28;
      }
      fVar33 = *(float *)(&UNK_00003aa8 + lRam0000000000a334c0) *
               *(float *)(&UNK_000038e8 + lRam0000000000a334c0);
      fVar26 = *(float *)(&UNK_00003aa4 + lRam0000000000a334c0);
      fVar28 = 1.0;
      if (fVar44 <= 1.0) {
        fVar28 = fVar44;
      }
      fVar27 = 0.0;
      if (0.0 <= fVar44) {
        fVar27 = fVar28;
      }
      iVar32 = -(uint)(fVar26 < 0.0);
      iVar35 = -(uint)(fVar33 < 0.0);
      uVar45 = NEON_fmov(0x3f800000,4);
      fVar44 = (float)(uVar45 >> 0x20);
      uVar34 = CONCAT44(fVar33,fVar26) ^
               (CONCAT44(fVar33,fVar26) ^ uVar45) &
               CONCAT44(-(uint)(fVar44 < fVar33),-(uint)((float)uVar45 < fVar26));
      fVar28 = (float)CONCAT13((byte)(uVar34 >> 0x18) & ~(byte)((uint)iVar32 >> 0x18),
                               CONCAT12((byte)(uVar34 >> 0x10) & ~(byte)((uint)iVar32 >> 0x10),
                                        CONCAT11((byte)(uVar34 >> 8) & ~(byte)((uint)iVar32 >> 8),
                                                 (byte)uVar34 & ~(byte)iVar32)));
      uVar31 = NEON_ushl(CONCAT44((int)((float)(CONCAT17((byte)(uVar34 >> 0x38) &
                                                         ~(byte)((uint)iVar35 >> 0x18),
                                                         CONCAT16((byte)(uVar34 >> 0x30) &
                                                                  ~(byte)((uint)iVar35 >> 0x10),
                                                                  CONCAT15((byte)(uVar34 >> 0x28) &
                                                                           ~(byte)((uint)iVar35 >> 8
                                                                                  ),CONCAT14((byte)(
                                                  uVar34 >> 0x20) & ~(byte)iVar35,fVar28)))) >> 0x20
                                               ) * 255.0 + 0.5),(int)(fVar28 * 255.0 + 0.5)),
                         _UNK_0080c190,4);
      fVar28 = 0.0;
      if ((uVar21 & 1) != 0) {
        fVar28 = fVar29;
      }
      func_0x000f3bb0(fVar28,lVar22,unaff_x29 + -0xd8,unaff_x29 + -0xe8,
                      (int)(fVar48 * 255.0 + 0.5) | (int)(fVar27 * 255.0 + 0.5) << 8 | (uint)uVar31
                      | (uint)((ulong)uVar31 >> 0x20),0x30);
      if ((0.0 < *(float *)(&UNK_00003930 + lVar50)) &&
         (fVar49 < *(float *)((long)unaff_x20 + 0x2c) + *(float *)((long)unaff_x20 + 0x34))) {
        lVar50 = unaff_x20[0x55];
        *(float *)(unaff_x29 + -0xd8) = fVar40;
        *(float *)(unaff_x29 + -0xd4) = fVar49;
        *(float *)(unaff_x29 + -0xe8) = fVar46;
        *(float *)(unaff_x29 + -0xe4) = fVar49;
        fVar33 = *(float *)(&UNK_00003a1c + lRam0000000000a334c0);
        fVar46 = *(float *)(&UNK_00003a20 + lRam0000000000a334c0);
        fVar40 = *(float *)(&UNK_00003a28 + lRam0000000000a334c0) *
                 *(float *)(&UNK_000038e8 + lRam0000000000a334c0);
        fVar28 = 1.0;
        if (fVar33 <= 1.0) {
          fVar28 = fVar33;
        }
        fVar48 = 0.0;
        if (0.0 <= fVar33) {
          fVar48 = fVar28;
        }
        fVar33 = *(float *)(&UNK_00003a24 + lRam0000000000a334c0);
        fVar28 = 1.0;
        if (fVar46 <= 1.0) {
          fVar28 = fVar46;
        }
        fVar49 = 0.0;
        if (0.0 <= fVar46) {
          fVar49 = fVar28;
        }
        iVar32 = -(uint)(fVar33 < 0.0);
        iVar35 = -(uint)(fVar40 < 0.0);
        uVar34 = CONCAT44(fVar40,fVar33) ^
                 (CONCAT44(fVar40,fVar33) ^ uVar45) &
                 CONCAT44(-(uint)(fVar44 < fVar40),-(uint)((float)uVar45 < fVar33));
        fVar28 = (float)CONCAT13((byte)(uVar34 >> 0x18) & ~(byte)((uint)iVar32 >> 0x18),
                                 CONCAT12((byte)(uVar34 >> 0x10) & ~(byte)((uint)iVar32 >> 0x10),
                                          CONCAT11((byte)(uVar34 >> 8) & ~(byte)((uint)iVar32 >> 8),
                                                   (byte)uVar34 & ~(byte)iVar32)));
        uVar30 = NEON_ushl(CONCAT44((int)((float)(CONCAT17((byte)(uVar34 >> 0x38) &
                                                           ~(byte)((uint)iVar35 >> 0x18),
                                                           CONCAT16((byte)(uVar34 >> 0x30) &
                                                                    ~(byte)((uint)iVar35 >> 0x10),
                                                                    CONCAT15((byte)(uVar34 >> 0x28)
                                                                             & ~(byte)((uint)iVar35
                                                                                      >> 8),
                                                                             CONCAT14((byte)(uVar34 
                                                  >> 0x20) & ~(byte)iVar35,fVar28)))) >> 0x20) *
                                          255.0 + 0.5),(int)(fVar28 * 255.0 + 0.5)),uVar30,4);
        func_0x000f397c(lVar50,unaff_x29 + -0xd8,unaff_x29 + -0xe8,
                        (int)(fVar48 * 255.0 + 0.5) | (int)(fVar49 * 255.0 + 0.5) << 8 |
                        (uint)uVar30 | (uint)((ulong)uVar30 >> 0x20));
      }
    }
    if (*(char *)((long)unaff_x20 + 0xbc) != '\0') {
      func_0x0010c5f4(0);
    }
    if (*(char *)((long)unaff_x20 + 0xbd) != '\0') {
      func_0x0010c5f4(1);
    }
    if ((in_stack_00000138._4_4_ != 0) && ((uVar21 >> 1 & 1) == 0)) {
      uVar34 = 0;
      pfVar25 = (float *)&UNK_0080c9ec;
      do {
        uVar21 = *(uint *)(unaff_x29 + -0xb0 + uVar34 * 4);
        if ((uVar21 & 0xff000000) != 0) {
          fVar40 = *(float *)(unaff_x20 + 5);
          fVar44 = *(float *)((long)unaff_x20 + 0x2c);
          fVar48 = *(float *)(unaff_x20 + 6);
          fVar46 = *(float *)((long)unaff_x20 + 0x34);
          fVar26 = pfVar25[-3];
          fVar49 = pfVar25[-2];
          lVar50 = unaff_x20[0x55];
          fVar33 = fVar38;
          fVar28 = (float)(int)in_stack_00000110._4_4_;
          if ((uVar34 & 1) != 0) {
            fVar33 = (float)(int)in_stack_00000110._4_4_;
            fVar28 = fVar38;
          }
          fVar27 = pfVar25[-1];
          fVar43 = *pfVar25;
          piVar24 = (int *)(lVar50 + 0x78);
          iVar32 = *piVar24;
          if (iVar32 == *(int *)(lVar50 + 0x7c)) {
            iVar35 = iVar32;
            if (iVar32 < 0) {
              iVar35 = iVar32 + 1;
            }
            iVar6 = 8;
            if (iVar32 != 0) {
              iVar6 = iVar32 + (iVar35 >> 1);
            }
            if (iVar6 <= iVar32 + 1) {
              iVar6 = iVar32 + 1;
            }
            func_0x000cef5c(piVar24,iVar6);
            iVar32 = *piVar24;
          }
          fVar40 = fVar40 + fVar26 * ((fVar40 + fVar48) - fVar40);
          fVar44 = fVar44 + fVar49 * ((fVar44 + fVar46) - fVar44);
          pfVar1 = (float *)(*(long *)(lVar50 + 0x80) + (long)iVar32 * 8);
          *pfVar1 = fVar40 + fVar28 * fVar27;
          pfVar1[1] = fVar44 + fVar33 * fVar43;
          *(int *)(lVar50 + 0x78) = *(int *)(lVar50 + 0x78) + 1;
          lVar50 = unaff_x20[0x55];
          piVar24 = (int *)(lVar50 + 0x78);
          iVar32 = *piVar24;
          if (iVar32 == *(int *)(lVar50 + 0x7c)) {
            iVar35 = iVar32;
            if (iVar32 < 0) {
              iVar35 = iVar32 + 1;
            }
            iVar6 = 8;
            if (iVar32 != 0) {
              iVar6 = iVar32 + (iVar35 >> 1);
            }
            if (iVar6 <= iVar32 + 1) {
              iVar6 = iVar32 + 1;
            }
            func_0x000cef5c(piVar24,iVar6);
            iVar32 = *piVar24;
          }
          pfVar1 = (float *)(*(long *)(lVar50 + 0x80) + (long)iVar32 * 8);
          *pfVar1 = fVar40 + fVar33 * fVar27;
          pfVar1[1] = fVar44 + fVar28 * fVar43;
          *(int *)(lVar50 + 0x78) = *(int *)(lVar50 + 0x78) + 1;
          lVar50 = unaff_x20[0x55];
          *(float *)(unaff_x29 + -0xd8) = fVar40 + (fVar29 + fVar38) * fVar27;
          *(float *)(unaff_x29 + -0xd4) = fVar44 + (fVar29 + fVar38) * fVar43;
          func_0x000f23c0(fVar29,lVar50,unaff_x29 + -0xd8,pfVar25[1],pfVar25[2]);
          lVar50 = unaff_x20[0x55];
          func_0x000f1888(lVar50,*(undefined8 *)(lVar50 + 0x80),*(undefined4 *)(lVar50 + 0x78),
                          uVar21);
          *(undefined4 *)(lVar50 + 0x78) = 0;
        }
        uVar34 = uVar34 + 1;
        pfVar25 = pfVar25 + 6;
      } while (in_stack_00000138._4_4_ != uVar34);
    }
    lVar50 = lRam0000000000a334c0;
    fVar40 = *pfVar23;
    fVar38 = *(float *)(&UNK_00003a1c + lRam0000000000a334c0);
    fVar28 = *(float *)(&UNK_00003a20 + lRam0000000000a334c0);
    fVar33 = *(float *)(&UNK_00003a24 + lRam0000000000a334c0);
    fVar46 = *(float *)(&UNK_00003a28 + lRam0000000000a334c0) *
             *(float *)(&UNK_000038e8 + lRam0000000000a334c0);
    fVar29 = 1.0;
    if (fVar38 <= 1.0) {
      fVar29 = fVar38;
    }
    fVar44 = 0.0;
    if (0.0 <= fVar38) {
      fVar44 = fVar29;
    }
    fVar29 = 1.0;
    if (fVar28 <= 1.0) {
      fVar29 = fVar28;
    }
    fVar38 = 0.0;
    if (0.0 <= fVar28) {
      fVar38 = fVar29;
    }
    fVar29 = 1.0;
    if (fVar33 <= 1.0) {
      fVar29 = fVar33;
    }
    fVar28 = 0.0;
    if (0.0 <= fVar33) {
      fVar28 = fVar29;
    }
    fVar29 = 1.0;
    if (fVar46 <= 1.0) {
      fVar29 = fVar46;
    }
    fVar33 = 0.0;
    if (0.0 <= fVar46) {
      fVar33 = fVar29;
    }
    uVar21 = (int)(fVar44 * 255.0 + 0.5) | (int)(fVar38 * 255.0 + 0.5) << 8 |
             (int)(fVar28 * 255.0 + 0.5) << 0x10 | (int)(fVar33 * 255.0 + 0.5) << 0x18;
    if (0.0 < fVar40) {
      if (*(char *)((long)unaff_x20 + 0x14) < '\0') {
        uVar19 = *(uint *)(unaff_x20 + 3);
        if ((uVar19 >> 2 & 1) != 0) {
          fVar28 = *(float *)(unaff_x20 + 0xc);
          fVar29 = *(float *)(unaff_x20 + 5) + *(float *)(unaff_x20 + 6) + -1.0;
          fVar38 = fVar28 + *(float *)((long)unaff_x20 + 0x2c);
          lVar22 = unaff_x20[0x55];
          fVar33 = ((*(float *)((long)unaff_x20 + 0x2c) + *(float *)((long)unaff_x20 + 0x34) + -1.0)
                   - fVar28) - fVar38;
          fVar29 = (fVar29 + (fVar29 - fVar29) + 0.5) - fVar28;
          *(float *)(unaff_x29 + -0xd8) = fVar29;
          *(float *)(unaff_x29 + -0xd4) = fVar28 * 0.0 + fVar38 + fVar33 * 0.0 + 0.5;
          func_0x000f249c(fVar28,0xbf490fdb,0,lVar22,unaff_x29 + -0xd8,0);
          lVar22 = unaff_x20[0x55];
          *(float *)(unaff_x29 + -0xd8) = fVar29;
          *(float *)(unaff_x29 + -0xd4) = fVar28 * 0.0 + fVar38 + fVar33 + 0.5;
          func_0x000f249c(fVar28,0,0x3f490fdb,lVar22,unaff_x29 + -0xd8,0);
          lVar22 = unaff_x20[0x55];
          func_0x000f0ff4(fVar40,lVar22,*(undefined8 *)(lVar22 + 0x80),
                          *(undefined4 *)(lVar22 + 0x78),uVar21,0);
          *(undefined4 *)(lVar22 + 0x78) = 0;
          uVar19 = *(uint *)(unaff_x20 + 3);
        }
        if ((uVar19 >> 3 & 1) != 0) {
          fVar28 = *(float *)(unaff_x20 + 0xc);
          fVar29 = *(float *)((long)unaff_x20 + 0x2c) + *(float *)((long)unaff_x20 + 0x34) + -1.0;
          fVar38 = fVar28 + *(float *)(unaff_x20 + 5);
          lVar22 = unaff_x20[0x55];
          fVar33 = ((*(float *)(unaff_x20 + 5) + *(float *)(unaff_x20 + 6) + -1.0) - fVar28) -
                   fVar38;
          fVar29 = (fVar29 + (fVar29 - fVar29) + 0.5) - fVar28;
          *(float *)(unaff_x29 + -0xd8) = fVar28 * 0.0 + fVar38 + fVar33 + 0.5;
          *(float *)(unaff_x29 + -0xd4) = fVar29;
          func_0x000f249c(fVar28,0x3f490fdb,0x3fc90fdb,lVar22,unaff_x29 + -0xd8,0);
          lVar22 = unaff_x20[0x55];
          *(float *)(unaff_x29 + -0xd8) = fVar28 * 0.0 + fVar38 + fVar33 * 0.0 + 0.5;
          *(float *)(unaff_x29 + -0xd4) = fVar29;
          func_0x000f249c(fVar28,0x3fc90fdb,0x4016cbe4,lVar22,unaff_x29 + -0xd8,0);
          lVar22 = unaff_x20[0x55];
          func_0x000f0ff4(fVar40,lVar22,*(undefined8 *)(lVar22 + 0x80),
                          *(undefined4 *)(lVar22 + 0x78),uVar21,0);
          *(undefined4 *)(lVar22 + 0x78) = 0;
        }
      }
      else {
        lVar22 = unaff_x20[0x55];
        *(ulong *)(unaff_x29 + -0xd8) =
             CONCAT44((float)((ulong)unaff_x20[5] >> 0x20) + (float)((ulong)unaff_x20[6] >> 0x20),
                      (float)unaff_x20[5] + (float)unaff_x20[6]);
        func_0x000f3af4((int)unaff_x20[0xc],fVar40,lVar22,in_stack_00000108,unaff_x29 + -0xd8,uVar21
                        ,0);
      }
    }
    bVar9 = *(byte *)((long)unaff_x20 + 0xca);
    if ((*(byte *)((long)unaff_x20 + 0xc9) == 0xff) && (bVar9 == 0xff)) {
      fVar29 = *(float *)(&UNK_00003930 + lVar50);
    }
    else {
      bVar18 = *(byte *)((long)unaff_x20 + 0xc9);
      if (bVar9 != 0xff) {
        bVar18 = bVar9;
      }
      lVar22 = 0x1c0;
      if (bVar9 != 0xff) {
        lVar22 = 0x1d0;
      }
      lVar22 = lVar22 + lRam0000000000a334c0;
      fVar38 = *(float *)(&UNK_000038e8 + lVar22 + 0xe4);
      fVar28 = *(float *)(&UNK_000038e8 + lVar22 + 0xe8);
      fVar33 = *(float *)(&UNK_000038e8 + lVar22 + 0xec);
      fVar46 = *(float *)(&UNK_000038e8 + lVar22 + 0xf0) *
               *(float *)(&UNK_000038e8 + lRam0000000000a334c0);
      fVar29 = 1.0;
      if (fVar38 <= 1.0) {
        fVar29 = fVar38;
      }
      fVar48 = 0.0;
      fVar44 = 0.0;
      if (0.0 <= fVar38) {
        fVar44 = fVar29;
      }
      fVar29 = 1.0;
      if (fVar28 <= 1.0) {
        fVar29 = fVar28;
      }
      fVar38 = 0.0;
      if (0.0 <= fVar28) {
        fVar38 = fVar29;
      }
      fVar29 = 1.0;
      if (fVar33 <= 1.0) {
        fVar29 = fVar33;
      }
      fVar28 = 0.0;
      if (0.0 <= fVar33) {
        fVar28 = fVar29;
      }
      fVar29 = 1.0;
      if (fVar46 <= 1.0) {
        fVar29 = fVar46;
      }
      fVar33 = 0.0;
      if (0.0 <= fVar46) {
        fVar33 = fVar29;
      }
      fVar46 = *(float *)(unaff_x20 + 0xc);
      fVar29 = 2.0;
      if (2.0 < *(float *)((long)unaff_x20 + 100)) {
        fVar29 = *(float *)((long)unaff_x20 + 100);
      }
      fVar27 = 0.0;
      fVar49 = 0.0;
      fVar26 = 0.0;
      if (bVar18 < 4) {
        fVar49 = *(float *)(unaff_x20 + 5);
        fVar26 = *(float *)((long)unaff_x20 + 0x2c);
        fVar27 = fVar49 + *(float *)(unaff_x20 + 6) + -1.0;
        fVar48 = fVar26 + *(float *)((long)unaff_x20 + 0x34) + -1.0;
        switch(bVar18) {
        case 0:
          fVar26 = fVar46 + fVar26;
          fVar27 = fVar49 + 0.0;
          fVar48 = fVar48 - fVar46;
          break;
        case 1:
          fVar26 = fVar46 + fVar26;
          fVar48 = fVar48 - fVar46;
          fVar49 = fVar27;
          break;
        case 2:
          fVar27 = fVar27 - fVar46;
          fVar48 = fVar26 + 0.0;
          fVar49 = fVar46 + fVar49;
          break;
        case 3:
          fVar27 = fVar27 - fVar46;
          fVar49 = fVar46 + fVar49;
          fVar26 = fVar48;
        }
      }
      lVar22 = (long)(int)(char)bVar18 * 0x1c;
      lVar15 = unaff_x20[0x55];
      fVar43 = *(float *)(&UNK_0080ca4c + lVar22);
      fVar36 = *(float *)(&UNK_0080ca40 + lVar22);
      fVar37 = *(float *)(&UNK_0080ca44 + lVar22);
      *(float *)(unaff_x29 + -0xd8) =
           fVar49 + *(float *)(&UNK_0080ca48 + lVar22) * (fVar27 - fVar49) + 0.5 + fVar46 * fVar36;
      *(float *)(unaff_x29 + -0xd4) = fVar26 + fVar43 * (fVar48 - fVar26) + 0.5 + fVar46 * fVar37;
      fVar47 = *(float *)(&UNK_0080ca58 + lVar22);
      func_0x000f249c(fVar46,fVar47 + -0.7853982,fVar47,lVar15,unaff_x29 + -0xd8,0);
      lVar15 = unaff_x20[0x55];
      lVar22 = (long)(int)(char)bVar18 * 0x1c;
      fVar43 = *(float *)(&UNK_0080ca54 + lVar22);
      *(float *)(unaff_x29 + -0xd8) =
           fVar46 * fVar36 + fVar49 + *(float *)(&UNK_0080ca50 + lVar22) * (fVar27 - fVar49) + 0.5;
      *(float *)(unaff_x29 + -0xd4) = fVar46 * fVar37 + fVar26 + fVar43 * (fVar48 - fVar26) + 0.5;
      func_0x000f249c(fVar46,fVar47,fVar47 + 0.7853982,lVar15,unaff_x29 + -0xd8,0);
      lVar22 = unaff_x20[0x55];
      func_0x000f0ff4(fVar29,lVar22,*(undefined8 *)(lVar22 + 0x80),*(undefined4 *)(lVar22 + 0x78),
                      (int)(fVar44 * 255.0 + 0.5) | (int)(fVar38 * 255.0 + 0.5) << 8 |
                      (int)(fVar28 * 255.0 + 0.5) << 0x10 | (int)(fVar33 * 255.0 + 0.5) << 0x18,0);
      *(undefined4 *)(lVar22 + 0x78) = 0;
      fVar29 = *(float *)(&UNK_00003930 + lVar50);
    }
    if ((0.0 < fVar29) && ((*(byte *)((long)unaff_x20 + 0x14) & 1) == 0)) {
      fVar29 = *(float *)(&UNK_00003d3c + *unaff_x20) * *(float *)(unaff_x20 + 0x54);
      if (unaff_x20[0x6f] != 0) {
        fVar29 = fVar29 * *(float *)(unaff_x20[0x6f] + 0x2a0);
      }
      fVar29 = *(float *)((long)unaff_x20 + 0x2c) +
               fVar29 + *(float *)(&UNK_00003928 + *unaff_x20) * 2.0 + -1.0;
      lVar50 = unaff_x20[0x55];
      fVar38 = *(float *)(unaff_x20 + 5);
      *(float *)(unaff_x29 + -0xd8) = fVar40 + fVar38;
      *(float *)(unaff_x29 + -0xd4) = fVar29;
      *(float *)(unaff_x29 + -0xe8) = (fVar38 + *(float *)(unaff_x20 + 6)) - fVar40;
      *(float *)(unaff_x29 + -0xe4) = fVar29;
      func_0x000f397c(lVar50,unaff_x29 + -0xd8,unaff_x29 + -0xe8,uVar21);
    }
  }
  else {
    uVar14 = *(undefined4 *)(&UNK_00003930 + lVar50);
    *(float *)(&UNK_00003930 + lVar50) = fVar38;
    if (bVar13) {
      lVar22 = 0xb;
      if ((&UNK_00004b7a)[lVar50] != '\0') {
        lVar22 = 0xc;
      }
    }
    else {
      lVar22 = 0xc;
    }
    lVar22 = lVar22 * 0x10 + lVar50;
    fVar28 = *(float *)(&UNK_000038e8 + lVar22 + 0xe4);
    fVar33 = *(float *)(&UNK_000038e8 + lVar22 + 0xe8);
    fVar38 = 1.0;
    if (fVar28 <= 1.0) {
      fVar38 = fVar28;
    }
    fVar46 = 0.0;
    if (0.0 <= fVar28) {
      fVar46 = fVar38;
    }
    fVar28 = *(float *)(&UNK_000038e8 + lVar22 + 0xec);
    fVar38 = 1.0;
    if (fVar33 <= 1.0) {
      fVar38 = fVar33;
    }
    fVar40 = 0.0;
    if (0.0 <= fVar33) {
      fVar40 = fVar38;
    }
    fVar38 = *(float *)(&UNK_000038e8 + lVar22 + 0xf0) * *(float *)(&UNK_000038e8 + lVar50);
    iVar32 = -(uint)(fVar28 < 0.0);
    iVar35 = -(uint)(fVar38 < 0.0);
    uVar34 = NEON_fmov(0x3f800000,4);
    uVar34 = uVar34 ^ (uVar34 ^ CONCAT44(fVar38,fVar28)) &
                      ~CONCAT44(-(uint)((float)(uVar34 >> 0x20) < fVar38),
                                -(uint)((float)uVar34 < fVar28));
    fVar38 = (float)CONCAT13((byte)(uVar34 >> 0x18) & ~(byte)((uint)iVar32 >> 0x18),
                             CONCAT12((byte)(uVar34 >> 0x10) & ~(byte)((uint)iVar32 >> 0x10),
                                      CONCAT11((byte)(uVar34 >> 8) & ~(byte)((uint)iVar32 >> 8),
                                               (byte)uVar34 & ~(byte)iVar32)));
    uVar30 = NEON_ushl(CONCAT44((int)((float)(CONCAT17((byte)(uVar34 >> 0x38) &
                                                       ~(byte)((uint)iVar35 >> 0x18),
                                                       CONCAT16((byte)(uVar34 >> 0x30) &
                                                                ~(byte)((uint)iVar35 >> 0x10),
                                                                CONCAT15((byte)(uVar34 >> 0x28) &
                                                                         ~(byte)((uint)iVar35 >> 8),
                                                                         CONCAT14((byte)(uVar34 >>
                                                                                        0x20) &
                                                                                  ~(byte)iVar35,
                                                                                  fVar38)))) >> 0x20
                                             ) * 255.0 + 0.5),(int)(fVar38 * 255.0 + 0.5)),
                       _UNK_0080c190,4);
    func_0x000bcf14(uStack00000000000001c0,fStack00000000000001c4,uStack00000000000001c8,
                    fStack00000000000001cc,fVar29,
                    (int)(fVar46 * 255.0 + 0.5) | (int)(fVar40 * 255.0 + 0.5) << 8 | (uint)uVar30 |
                    (uint)((ulong)uVar30 >> 0x20),1);
    *(undefined4 *)(&UNK_00003930 + lVar50) = uVar14;
  }
  if (bVar11) {
    unaff_x20[0x55] = (long)(unaff_x20 + 0x56);
    fVar29 = *(float *)(unaff_x20 + 10);
    if (fVar29 == 0.0) goto code_r0x000cc264;
code_r0x000cc300:
    fVar28 = *(float *)((long)unaff_x20 + 0x54);
    fVar38 = fVar29;
    if (fVar28 != 0.0) goto code_r0x000cc30c;
code_r0x000cc2b4:
    fVar33 = 0.0;
    if ((in_stack_000001b0._4_4_ >> 3 & 1) == 0) {
      fVar33 = *(float *)((long)unaff_x20 + 0x44);
    }
    fVar40 = *(float *)((long)unaff_x20 + 0x5c);
    fVar46 = *(float *)((long)unaff_x20 + 0x6c);
    fVar44 = (*(float *)((long)unaff_x20 + 0x34) + fVar40 * -2.0) -
             (fVar46 + *(float *)((long)unaff_x20 + 0x74));
    if (fVar33 < fVar44) {
      fVar33 = fVar44;
    }
  }
  else {
    fVar29 = *(float *)(unaff_x20 + 10);
    if (fVar29 != 0.0) goto code_r0x000cc300;
code_r0x000cc264:
    fVar38 = 0.0;
    if ((in_stack_000001b0._4_4_ & 0x808) == 0x800) {
      fVar38 = *in_stack_00000118;
    }
    fVar28 = (*(float *)(unaff_x20 + 6) + *(float *)(unaff_x20 + 0xb) * -2.0) -
             (*(float *)(unaff_x20 + 0xd) + *(float *)(unaff_x20 + 0xe));
    if (fVar38 < fVar28) {
      fVar38 = fVar28;
    }
    fVar28 = *(float *)((long)unaff_x20 + 0x54);
    if (fVar28 == 0.0) goto code_r0x000cc2b4;
code_r0x000cc30c:
    fVar40 = *(float *)((long)unaff_x20 + 0x5c);
    fVar46 = *(float *)((long)unaff_x20 + 0x6c);
    fVar33 = fVar28;
  }
  fVar48 = *(float *)(unaff_x20 + 0xb);
  fVar49 = (float)*(undefined8 *)((long)unaff_x20 + 0x8c);
  fVar26 = (float)((ulong)*(undefined8 *)((long)unaff_x20 + 0x8c) >> 0x20);
  fVar44 = *(float *)((long)unaff_x20 + 100);
  uVar34 = CONCAT44(fVar40,fVar48) ^
           (CONCAT44(fVar40,fVar48) ^ CONCAT44(fVar44,fVar44)) &
           ~CONCAT44(-(uint)(fVar44 <= fVar40),-(uint)(fVar44 <= fVar48));
  lVar50 = NEON_scvtf(CONCAT44((int)(((float)((ulong)unaff_x20[0x41] >> 0x20) - fVar26) +
                                    (float)(uVar34 >> 0x20)),
                               (int)(((float)unaff_x20[0x41] - fVar49) + (float)uVar34)),4);
  unaff_x20[0x45] = lVar50;
  unaff_x20[0x46] = CONCAT44(fVar33 + (float)((ulong)lVar50 >> 0x20),fVar38 + (float)lVar50);
  unaff_x20[0x48] = unaff_x20[0x46];
  unaff_x20[0x47] = unaff_x20[0x45];
  fVar38 = *(float *)(unaff_x20 + 0xd);
  fVar44 = fVar38 + fVar48 + (*(float *)(unaff_x20 + 5) - fVar49);
  *(float *)(unaff_x20 + 0x4b) = fVar44;
  fVar33 = fVar46 + fVar40 + (*(float *)((long)unaff_x20 + 0x2c) - fVar26);
  *(float *)((long)unaff_x20 + 0x25c) = fVar33;
  if (fVar29 == 0.0) {
    *(float *)(unaff_x20 + 0x4c) =
         fVar44 + ((*(float *)(unaff_x20 + 6) + fVar48 * -2.0) -
                  (fVar38 + *(float *)(unaff_x20 + 0xe)));
  }
  else {
    *(float *)(unaff_x20 + 0x4c) = fVar44 + fVar29;
  }
  if (fVar28 == 0.0) {
    fVar28 = (*(float *)((long)unaff_x20 + 0x34) + fVar40 * -2.0) -
             (fVar46 + *(float *)((long)unaff_x20 + 0x74));
  }
  *(float *)((long)unaff_x20 + 0x264) = fVar33 + fVar28;
  *(float *)((long)unaff_x20 + 0x154) = (fVar48 + fVar38) - fVar49;
  unaff_x20[0x2b] = 0;
  fVar29 = ((fVar48 + *(float *)(unaff_x20 + 5)) - fVar49) + fVar38 + 0.0;
  fVar46 = ((fVar40 + *(float *)((long)unaff_x20 + 0x2c)) - fVar26) + fVar46;
  *(float *)(unaff_x20 + 0x24) = fVar29;
  *(float *)((long)unaff_x20 + 0x124) = fVar46;
  *(float *)(unaff_x20 + 0x2c) = fVar29 - fVar29;
  *(float *)((long)unaff_x20 + 0x164) = fVar46 - fVar46;
  lVar50 = unaff_x20[0x24];
  unaff_x20[0x22] = lVar50;
  unaff_x20[0x23] = lVar50;
  unaff_x20[0x25] = lVar50;
  unaff_x20[0x26] = lVar50;
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
  uVar14 = 1;
  *(undefined4 *)((long)unaff_x20 + 0x1c4) = 1;
  if (in_stack_00000188 != 0) {
    uVar14 = *(undefined4 *)(in_stack_00000188 + 0x1c4);
  }
  *(undefined4 *)(unaff_x20 + 0x39) = uVar14;
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
  lVar50 = lRam0000000000a334c0;
  fVar29 = fStack00000000000001c4;
  fVar38 = fStack00000000000001cc;
  if (iStack0000000000000144 != 0) {
    func_0x000c3098();
    lVar50 = lRam0000000000a334c0;
    fVar29 = fStack00000000000001c4;
    fVar38 = fStack00000000000001cc;
    if (unaff_x20 == *(long **)(&UNK_00004b18 + in_stack_000001b8)) {
      func_0x000d0a00();
      lVar50 = lRam0000000000a334c0;
      fVar29 = fStack00000000000001c4;
      fVar38 = fStack00000000000001cc;
    }
  }
  lRam0000000000a334c0 = lVar50;
  fStack00000000000001c4 = fVar29;
  fStack00000000000001cc = fVar38;
  if ((in_stack_000001b0 & 0x100000000) == 0) {
    fVar28 = *(float *)((long)unaff_x20 + 100);
    uVar21 = *(uint *)((long)unaff_x20 + 0x14);
    if ((uVar21 >> 5 & 1) == 0) {
      bVar13 = *(int *)(&UNK_00003910 + lVar50) != -1;
    }
    else {
      bVar13 = false;
    }
    fVar40 = uStack00000000000001c8 - fVar28;
    puVar4 = (uint *)(&UNK_0000497c + lVar50);
    uVar19 = *puVar4;
    *puVar4 = uVar19 | 0x10;
    *(undefined4 *)(unaff_x20 + 0x2d) = 1;
    fVar46 = *(float *)(&UNK_00003924 + lVar50);
    fVar44 = *(float *)(&UNK_00003d38 + lVar50);
    *(undefined8 *)(unaff_x29 + -0xc0) = 0;
    *(undefined8 *)(unaff_x29 + -0xb8) = 0;
    fVar33 = fVar46;
    if (in_stack_00000168 != (undefined1 *)0x0) {
      fVar33 = *(float *)(&UNK_00003928 + lVar50);
      *(float *)(unaff_x29 + -0xb8) = (fVar40 - fVar46) - fVar44;
      *(float *)(unaff_x29 + -0xb4) = fVar29 + fVar33;
      fVar33 = fVar46 + fVar44 + *(float *)(&UNK_0000393c + lVar50);
    }
    fVar28 = uStack00000000000001c0 + fVar28;
    if (bVar13) {
      if (*(int *)(&UNK_00003910 + lVar50) == 0) {
        fVar48 = *(float *)(&UNK_00003928 + lVar50);
        *(float *)(unaff_x29 + -0xc0) = fVar28 + fVar46;
        *(float *)(unaff_x29 + -0xbc) = fVar29 + fVar48;
        fVar46 = fVar46 + fVar44 + *(float *)(&UNK_0000393c + lVar50);
      }
      else if (*(int *)(&UNK_00003910 + lVar50) == 1) {
        fVar48 = *(float *)(&UNK_00003928 + lVar50);
        *(float *)(unaff_x29 + -0xc0) = (fVar40 - fVar33) - fVar44;
        *(float *)(unaff_x29 + -0xbc) = fVar29 + fVar48;
        fVar33 = fVar33 + fVar44 + *(float *)(&UNK_0000393c + lVar50);
      }
      uVar8 = *(uint *)(unaff_x20[0x21] + (long)(int)unaff_x20[0x20] * 4 + -4);
      uVar8 = *(uint *)(&UNK_0080c404 + ((ulong)uVar8 & 0xff ^ 0xdc) * 4) ^ ~uVar8 >> 8;
      uVar8 = *(uint *)(&UNK_0080c404 + (ulong)(uVar8 & 0xff ^ 0x43) * 4) ^ uVar8 >> 8;
      uVar8 = *(uint *)(&UNK_0080c404 + (ulong)(uVar8 & 0xff ^ 0x4f) * 4) ^ uVar8 >> 8;
      uVar8 = *(uint *)(&UNK_0080c404 + (ulong)(uVar8 & 0xff ^ 0x4c) * 4) ^ uVar8 >> 8;
      uVar8 = *(uint *)(&UNK_0080c404 + (ulong)(uVar8 & 0xff ^ 0x4c) * 4) ^ uVar8 >> 8;
      uVar8 = *(uint *)(&UNK_0080c404 + (ulong)(uVar8 & 0xff ^ 0x41) * 4) ^ uVar8 >> 8;
      uVar8 = *(uint *)(&UNK_0080c404 + (ulong)(uVar8 & 0xff ^ 0x50) * 4) ^ uVar8 >> 8;
      uVar8 = *(uint *)(&UNK_0080c404 + (ulong)(uVar8 & 0xff ^ 0x53) * 4) ^ uVar8 >> 8;
      uVar8 = *(uint *)(&UNK_0080c404 + (ulong)(uVar8 & 0xff ^ 0x45) * 4) ^ uVar8 >> 8 ^ 0xffffffff;
      if (*(uint *)(&UNK_0000404c + *unaff_x20) == uVar8) {
        func_0x000c167c(uVar8,0xb,"#COLLAPSE",0);
      }
      iVar32 = func_0x0010c3ec(uVar8,unaff_x29 + -0xc0);
      if (iVar32 != 0) {
        *(undefined1 *)((long)unaff_x20 + 0xc2) = 1;
      }
    }
    if (in_stack_00000168 != (undefined1 *)0x0) {
      uVar8 = *(uint *)(unaff_x20[0x21] + (long)(int)unaff_x20[0x20] * 4 + -4);
      uVar8 = *(uint *)(&UNK_0080c404 + ((ulong)uVar8 & 0xff ^ 0xdc) * 4) ^ ~uVar8 >> 8;
      uVar8 = *(uint *)(&UNK_0080c404 + (ulong)(uVar8 & 0xff ^ 0x43) * 4) ^ uVar8 >> 8;
      uVar8 = *(uint *)(&UNK_0080c404 + (ulong)(uVar8 & 0xff ^ 0x4c) * 4) ^ uVar8 >> 8;
      uVar8 = *(uint *)(&UNK_0080c404 + (ulong)(uVar8 & 0xff ^ 0x4f) * 4) ^ uVar8 >> 8;
      uVar8 = *(uint *)(&UNK_0080c404 + (ulong)(uVar8 & 0xff ^ 0x53) * 4) ^ uVar8 >> 8;
      uVar8 = *(uint *)(&UNK_0080c404 + (ulong)(uVar8 & 0xff ^ 0x45) * 4) ^ uVar8 >> 8 ^ 0xffffffff;
      if (*(uint *)(&UNK_0000404c + *unaff_x20) == uVar8) {
        func_0x000c167c(uVar8,0xb,"#CLOSE",0);
      }
      iVar32 = func_0x0010c1d4(uVar8,unaff_x29 + -0xb8);
      if (iVar32 != 0) {
        *in_stack_00000168 = 0;
      }
    }
    *(undefined4 *)(unaff_x20 + 0x2d) = 0;
    *puVar4 = uVar19;
    fVar49 = 0.0;
    fVar48 = 0.0;
    if ((uVar21 & 0x40000) != 0) {
      fVar48 = fVar44 * 0.8;
    }
    if (in_stack_00000160 == (char *)0xffffffffffffffff) {
      fVar26 = *(float *)(&UNK_00003d38 + lRam0000000000a334c0);
    }
    else {
      pcVar16 = in_stack_00000160;
      do {
        if (*pcVar16 == '#') {
          if (pcVar16[1] == '#') break;
        }
        else if (*pcVar16 == '\0') break;
        pcVar2 = pcVar16 + 1;
        bVar13 = pcVar16 != (char *)0xfffffffffffffffe;
        pcVar16 = pcVar2;
      } while (bVar13);
      fVar26 = *(float *)(&UNK_00003d38 + lRam0000000000a334c0);
      if (pcVar16 == in_stack_00000160) {
        fVar49 = 0.0;
      }
      else {
        fVar49 = 3.4028235e+38;
        fVar27 = (float)func_0x00106300(fVar26,0x7f7fffff,0xbf800000,
                                        *(undefined8 *)(&UNK_00003d30 + lRam0000000000a334c0),
                                        in_stack_00000160,pcVar16,0);
        fVar26 = fVar49;
        fVar49 = (float)(int)(fVar27 + 0.99999);
      }
    }
    fVar48 = fVar48 + fVar49;
    *(float *)(unaff_x29 + -200) = fVar48;
    *(float *)(unaff_x29 + -0xc4) = fVar26 + 0.0;
    fVar49 = *(float *)(&UNK_00003924 + lVar50);
    if (fVar46 <= fVar49) {
      if (fVar49 < fVar33) goto code_r0x000ccc3c;
code_r0x000cc994:
      fVar49 = *(float *)(&UNK_00003908 + lVar50);
      bVar13 = false;
      if ((0.0 < fVar49) && (bVar13 = false, !NAN(fVar49))) {
        bVar13 = fVar49 < 1.0;
      }
      if (bVar13) {
code_r0x000cc9a8:
        fVar27 = ABS(fVar49 + -0.5) * -2.0 + 1.0;
        fVar26 = 1.0;
        if (fVar27 <= 1.0) {
          fVar26 = fVar27;
        }
        fVar43 = 0.0;
        if (0.0 <= fVar27) {
          fVar43 = fVar26;
        }
        fVar26 = fVar46;
        if (fVar46 < fVar33) {
          fVar26 = fVar33;
        }
        fVar27 = (((fVar40 - fVar28) - fVar46) - fVar33) - fVar48;
        if (fVar27 <= fVar26) {
          fVar26 = fVar27;
        }
        fVar26 = fVar26 * fVar43;
        if (fVar46 < fVar26) {
          fVar46 = fVar26;
        }
        if (fVar33 < fVar26) {
          fVar33 = fVar26;
        }
      }
    }
    else {
      fVar46 = fVar46 + *(float *)(&UNK_0000393c + lVar50);
      if (fVar33 <= fVar49) goto code_r0x000cc994;
code_r0x000ccc3c:
      fVar33 = fVar33 + *(float *)(&UNK_0000393c + lVar50);
      fVar49 = *(float *)(&UNK_00003908 + lVar50);
      bVar13 = false;
      if ((0.0 < fVar49) && (bVar13 = false, !NAN(fVar49))) {
        bVar13 = fVar49 < 1.0;
      }
      if (bVar13) goto code_r0x000cc9a8;
    }
    fVar28 = fVar28 + fVar46;
    fVar33 = fVar40 - fVar33;
    *(float *)(unaff_x29 + -0xd8) = fVar28;
    *(float *)(unaff_x29 + -0xd4) = fVar29;
    *(float *)(unaff_x29 + -0xd0) = fVar33;
    *(float *)(unaff_x29 + -0xcc) = fVar38;
    fVar46 = fVar33 + *(float *)(&UNK_0000393c + lVar50);
    if (fVar40 <= fVar33 + *(float *)(&UNK_0000393c + lVar50)) {
      fVar46 = fVar40;
    }
    *(float *)(unaff_x29 + -0xe8) = fVar28;
    *(float *)(unaff_x29 + -0xe4) = fVar29;
    *(float *)(unaff_x29 + -0xe0) = fVar46;
    *(float *)(unaff_x29 + -0xdc) = fVar38;
    if ((uVar21 >> 0x12 & 1) != 0) {
      fVar48 = fVar48 + fVar28 + fVar49 * ((fVar33 - fVar28) - fVar48);
      if (fVar48 <= fVar33) {
        fVar33 = fVar48;
      }
      fVar40 = fVar28;
      if (fVar28 <= fVar48) {
        fVar40 = fVar33;
      }
      if (fVar28 < fVar40) {
        fVar33 = *(float *)(&UNK_000039cc + lRam0000000000a334c0);
        fVar48 = *(float *)(&UNK_000039d0 + lRam0000000000a334c0);
        fVar49 = *(float *)(&UNK_000039d8 + lRam0000000000a334c0) *
                 *(float *)(&UNK_000038e8 + lRam0000000000a334c0);
        fVar28 = 1.0;
        if (fVar33 <= 1.0) {
          fVar28 = fVar33;
        }
        fVar26 = 0.0;
        if (0.0 <= fVar33) {
          fVar26 = fVar28;
        }
        fVar33 = *(float *)(&UNK_000039d4 + lRam0000000000a334c0);
        fVar28 = 1.0;
        if (fVar48 <= 1.0) {
          fVar28 = fVar48;
        }
        fVar27 = 0.0;
        if (0.0 <= fVar48) {
          fVar27 = fVar28;
        }
        iVar32 = -(uint)(fVar33 < 0.0);
        iVar35 = -(uint)(fVar49 < 0.0);
        uVar34 = NEON_fmov(0x3f800000,4);
        uVar34 = uVar34 ^ (uVar34 ^ CONCAT44(fVar49,fVar33)) &
                          ~CONCAT44(-(uint)((float)(uVar34 >> 0x20) < fVar49),
                                    -(uint)((float)uVar34 < fVar33));
        fVar28 = (float)CONCAT13((byte)(uVar34 >> 0x18) & ~(byte)((uint)iVar32 >> 0x18),
                                 CONCAT12((byte)(uVar34 >> 0x10) & ~(byte)((uint)iVar32 >> 0x10),
                                          CONCAT11((byte)(uVar34 >> 8) & ~(byte)((uint)iVar32 >> 8),
                                                   (byte)uVar34 & ~(byte)iVar32)));
        uVar30 = NEON_ushl(CONCAT44((int)((float)(CONCAT17((byte)(uVar34 >> 0x38) &
                                                           ~(byte)((uint)iVar35 >> 0x18),
                                                           CONCAT16((byte)(uVar34 >> 0x30) &
                                                                    ~(byte)((uint)iVar35 >> 0x10),
                                                                    CONCAT15((byte)(uVar34 >> 0x28)
                                                                             & ~(byte)((uint)iVar35
                                                                                      >> 8),
                                                                             CONCAT14((byte)(uVar34 
                                                  >> 0x20) & ~(byte)iVar35,fVar28)))) >> 0x20) *
                                          255.0 + 0.5),(int)(fVar28 * 255.0 + 0.5)),_UNK_0080c190,4)
        ;
        func_0x001069f4(fVar40,(fVar29 + fVar38) * 0.5,unaff_x20[0x55],
                        (int)(fVar26 * 255.0 + 0.5) | (int)(fVar27 * 255.0 + 0.5) << 8 |
                        (uint)uVar30 | (uint)((ulong)uVar30 >> 0x20));
        fVar40 = fVar40 - (float)(int)(fVar44 * 0.8 * 0.5);
        if (fVar40 <= fVar46) {
          fVar46 = fVar40;
        }
        *(float *)(unaff_x29 + -0xe0) = fVar46;
      }
    }
    lVar22 = lRam0000000000a334c0;
    if (in_stack_00000160 != (char *)0xffffffffffffffff) {
      pcVar16 = in_stack_00000160;
      do {
        if (*pcVar16 == '#') {
          if (pcVar16[1] == '#') break;
        }
        else if (*pcVar16 == '\0') break;
        pcVar2 = pcVar16 + 1;
        bVar13 = pcVar16 != (char *)0xfffffffffffffffe;
        pcVar16 = pcVar2;
      } while (bVar13);
      if (((int)pcVar16 != (int)in_stack_00000160) &&
         (func_0x000bc610(*(undefined8 *)(*(long *)(lRam0000000000a334c0 + 0x4000) + 0x2a8),
                          unaff_x29 + -0xd8,unaff_x29 + -0xd0,in_stack_00000160,pcVar16,
                          unaff_x29 + -200,&UNK_00003908 + lVar50,unaff_x29 + -0xe8),
         (&UNK_00005ff8)[lVar22] != '\0')) {
        func_0x000bc2c4(unaff_x29 + -0xd8,in_stack_00000160,pcVar16);
      }
    }
  }
  lVar50 = lRam0000000000a334c0;
  uVar21 = 0;
  puVar5 = (undefined4 *)(&UNK_000049a8 + lRam0000000000a334c0);
  *(undefined4 *)(unaff_x20 + 0x4d) = 0;
  uVar14 = *(undefined4 *)(in_stack_00000190 + 0xfd0);
  fVar29 = *(float *)(lVar50 + 0xe40);
  if (uStack00000000000001c0 - *(float *)(&UNK_0000394c + lVar50) <= fVar29) {
    fVar38 = *(float *)(&UNK_0000394c + lVar50) + uStack00000000000001c8;
    bVar13 = false;
    if ((fStack00000000000001c4 - *(float *)(&UNK_00003950 + lVar50) <= *(float *)(lVar50 + 0xe44))
       && (bVar13 = false, !NAN(fVar29) && !NAN(fVar38))) {
      bVar13 = fVar29 < fVar38;
    }
    if (bVar13) {
      uVar21 = (uint)(*(float *)(lVar50 + 0xe44) <
                     fStack00000000000001cc + *(float *)(&UNK_00003950 + lVar50));
    }
    else {
      uVar21 = 0;
    }
  }
  *puVar5 = *(undefined4 *)((long)unaff_x20 + 0x84);
  *(undefined4 *)(&UNK_000049ac + lVar50) = uVar14;
  *(uint *)(&UNK_000049b0 + lVar50) = uVar21;
  *(ulong *)(&UNK_000049cc + lVar50) = CONCAT44(fStack00000000000001cc,uStack00000000000001c8);
  *(ulong *)(&UNK_000049c4 + lVar50) = CONCAT44(fStack00000000000001c4,uStack00000000000001c0);
  *(ulong *)(&UNK_000049bc + lVar50) = CONCAT44(fStack00000000000001cc,uStack00000000000001c8);
  *(ulong *)(&UNK_000049b4 + lVar50) = CONCAT44(fStack00000000000001c4,uStack00000000000001c0);
  iVar32 = *(int *)(in_stack_00000190 + 0xfd4);
  if ((iVar32 != 0) &&
     ((*in_stack_00000178 == iVar32 || (*(int *)((long)unaff_x20 + 0x84) == iVar32)))) {
    func_0x000d2b3c();
    lVar50 = lRam0000000000a334c0;
  }
  lVar22 = *(long *)(lVar50 + 0x4000);
  plVar17 = unaff_x20 + 0x44;
  *(undefined1 *)(lVar22 + 0xc0) = 1;
  func_0x000f0930(*(undefined8 *)(lVar22 + 0x2a8),unaff_x20 + 0x43,plVar17,1);
  lVar50 = *(long *)(*(long *)(lVar22 + 0x2a8) + 0x60) +
           (long)*(int *)(*(long *)(lVar22 + 0x2a8) + 0x58) * 0x10;
  uVar30 = *(undefined8 *)(lVar50 + -0x10);
  *(undefined8 *)(lVar22 + 0x250) = *(undefined8 *)(lVar50 + -8);
  *(undefined8 *)(lVar22 + 0x248) = uVar30;
  *(undefined1 *)(unaff_x20 + 0x18) = 0;
  *(short *)((long)unaff_x20 + 0xcc) = *(short *)((long)unaff_x20 + 0xcc) + 1;
  *in_stack_000001a8 = 0;
  if (iStack00000000000001a0 != iStack00000000000001a4) {
    if ((in_stack_000001b0._4_4_ & 0x11000000) == 0x1000000) {
      if ((in_stack_000001b0._4_4_ >> 0x17 & 1) == 0) {
        bVar13 = false;
      }
      else {
        bVar13 = false;
        if (*(char *)(in_stack_000001a8 + 0x61) != '\0') {
          bVar13 = false;
          if (*(long *)(&UNK_00004b18 + in_stack_000001b8) != 0) {
            bVar13 = *(long *)(*(long *)(&UNK_00004b18 + in_stack_000001b8) + 0x3a0) ==
                     unaff_x20[0x74];
          }
        }
      }
      if ((((&UNK_00005ff8)[in_stack_000001b8] == '\0') && (!bVar13)) &&
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
          if (*(char *)(in_stack_00000188 + 0xe5) < '\x01') goto code_r0x000cce08;
        }
        else {
          *(undefined1 *)((long)unaff_x20 + 0xe4) = 1;
        }
        *(undefined1 *)((long)unaff_x20 + 0xe5) = 1;
      }
    }
code_r0x000cce08:
    if (*(float *)(&UNK_000038e8 + in_stack_000001b8) <= 0.0) {
      *(undefined1 *)((long)unaff_x20 + 0xe4) = 1;
      *(undefined1 *)((long)unaff_x20 + 0xc5) = 1;
      cVar10 = *(char *)((long)unaff_x20 + 0xe7);
joined_r0x000cce60:
      bVar9 = 1;
      bVar18 = 1;
    }
    else {
      if (('\0' < *(char *)((long)unaff_x20 + 0xe4)) || ('\0' < *(char *)((long)unaff_x20 + 0xe5)))
      {
        *(undefined1 *)((long)unaff_x20 + 0xc5) = 1;
        cVar10 = *(char *)((long)unaff_x20 + 0xe7);
        goto joined_r0x000cce60;
      }
      bVar18 = 0;
      bVar9 = 0;
      *(bool *)((long)unaff_x20 + 0xc5) = '\0' < *(char *)((long)unaff_x20 + 0xe6);
      cVar10 = *(char *)((long)unaff_x20 + 0xe7);
    }
    if ('\0' < cVar10) {
      *(char *)((long)unaff_x20 + 0xe7) = cVar10 + -1;
      *(uint *)((long)unaff_x20 + 0x14) = *(uint *)((long)unaff_x20 + 0x14) | 0x30200;
      bVar9 = bVar18;
    }
    if ((((*(char *)((long)unaff_x20 + 0xc1) == '\0') &&
         ((bool)(*(char *)((long)unaff_x20 + 0xbe) != '\0' & (bVar9 ^ 1)))) ||
        ('\0' < *(char *)((long)unaff_x20 + 0xdc))) || ('\0' < *(char *)((long)unaff_x20 + 0xdd))) {
      bVar13 = false;
    }
    else {
      bVar13 = *(char *)((long)unaff_x20 + 0xe5) < '\x01';
    }
    *(bool *)((long)unaff_x20 + 0xc3) = bVar13;
  }
  if (*(char *)((long)unaff_x20 + 0xc6) == '\0') {
    uVar21 = 0;
    if (*(char *)(in_stack_000001b8 + 0x79) != '\0') {
      uVar21 = in_stack_00000198._4_4_;
    }
    if (((uVar21 & 1) != 0) ||
       ((*(char *)(in_stack_000001b8 + 0x7a) != '\0' &&
        (*(int *)(&UNK_00003fd0 + in_stack_000001b8) ==
         (int)(char)(&UNK_00006074)[in_stack_000001b8])))) {
      if ('\0' < *(char *)((long)unaff_x20 + 0xdc)) {
        *(char *)((long)unaff_x20 + 0xdc) = *(char *)((long)unaff_x20 + 0xdc) + '\x01';
      }
      if (*(char *)((long)unaff_x20 + 0xdd) < '\x01') {
        bVar13 = false;
      }
      else {
        bVar13 = false;
        *(char *)((long)unaff_x20 + 0xdd) = *(char *)((long)unaff_x20 + 0xdd) + '\x01';
      }
      goto code_r0x000cced0;
    }
  }
  bVar13 = *(char *)((long)unaff_x20 + 0xc3) == '\0';
code_r0x000cced0:
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0xa0)) {
    return;
  }
  ___stack_chk_fail(bVar13);
  auVar51 = __Unwind_Resume();
  lVar22 = *(long *)(lRam0000000000a334c0 + 0x4000);
  *(undefined1 *)(lVar22 + 0xc0) = 1;
  func_0x000f0930(*(undefined8 *)(lVar22 + 0x2a8),auVar51._0_8_,auVar51._8_8_,plVar17);
  lVar50 = *(long *)(*(long *)(lVar22 + 0x2a8) + 0x60) +
           (long)*(int *)(*(long *)(lVar22 + 0x2a8) + 0x58) * 0x10;
  uVar30 = *(undefined8 *)(lVar50 + -0x10);
  *(undefined8 *)(lVar22 + 0x250) = *(undefined8 *)(lVar50 + -8);
  *(undefined8 *)(lVar22 + 0x248) = uVar30;
  return;
}

