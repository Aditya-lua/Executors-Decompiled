
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_000f8230(undefined8 param_1,undefined8 param_2,char *param_3,long param_4,long param_5)

{
  uint uVar1;
  char *pcVar2;
  char *pcVar3;
  char *pcVar4;
  undefined2 *puVar5;
  int iVar6;
  byte bVar7;
  uint uVar8;
  uint uVar9;
  bool bVar10;
  long lVar11;
  undefined8 uVar12;
  char *pcVar13;
  long lVar14;
  undefined8 extraout_x1;
  uint *extraout_x1_00;
  undefined2 uVar15;
  int iVar16;
  char *pcVar17;
  uint uVar18;
  char *pcVar19;
  ulong uVar20;
  char *pcVar21;
  ulong uVar22;
  ulong uVar23;
  ulong uVar24;
  char *unaff_x22;
  undefined8 *unaff_x23;
  long unaff_x24;
  uint *puVar25;
  long unaff_x29;
  float extraout_s0;
  float fVar26;
  float extraout_s0_00;
  undefined8 uVar27;
  undefined8 uVar28;
  undefined8 uVar29;
  undefined8 uVar30;
  undefined8 uVar31;
  undefined8 uVar32;
  undefined8 uVar33;
  unkbyte10 Var34;
  undefined8 uStack0000000000000020;
  undefined8 uStack0000000000000028;
  undefined8 uStack0000000000000030;
  undefined8 uStack0000000000000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000058;
  undefined8 uStack0000000000000060;
  undefined8 uStack0000000000000068;
  undefined8 uStack0000000000000070;
  undefined1 uStack000000000000007a;
  undefined8 uStack0000000000000078;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000088;
  undefined8 in_stack_00000090;
  undefined8 in_stack_00000098;
  undefined8 uStack_240;
  undefined8 uStack_238;
  undefined8 uStack_230;
  undefined8 uStack_228;
  undefined8 uStack_220;
  undefined6 uStack_218;
  undefined2 uStack_212;
  undefined6 uStack_210;
  undefined8 uStack_200;
  undefined8 uStack_1f8;
  undefined8 uStack_1f0;
  long lStack_1e8;
  undefined4 uStack_1e0;
  undefined7 uStack_1d8;
  float fStack_1d1;
  char *pcStack_1c8;
  uint uStack_1c0;
  undefined1 uStack_1bc;
  undefined7 uStack_1bb;
  float fStack_1b4;
  undefined8 uStack_1b0;
  undefined8 uStack_1a8;
  undefined8 uStack_1a0;
  undefined8 uStack_198;
  long lStack_190;
  undefined4 uStack_188;
  undefined4 uStack_184;
  undefined8 uStack_180;
  undefined8 uStack_178;
  undefined2 uStack_170;
  undefined8 uStack_16e;
  undefined8 uStack_166;
  undefined8 uStack_15e;
  undefined8 uStack_156;
  undefined8 uStack_14e;
  undefined6 uStack_146;
  undefined2 uStack_140;
  undefined6 uStack_13e;
  long lStack_138;
  undefined8 uStack_b0;
  undefined8 uStack_a8;
  undefined8 uStack_a0;
  undefined8 uStack_98;
  undefined8 uStack_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  long lStack_78;
  undefined8 uStack_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  undefined8 uStack_40;
  undefined8 uStack_38;
  undefined8 uStack_30;
  undefined8 uStack_28;
  long lStack_18;
  
  uStack0000000000000068 = unaff_x23[9];
  uStack0000000000000060 = unaff_x23[8];
  uVar12 = unaff_x23[0xb];
  uStack0000000000000070 = unaff_x23[10];
  uStack0000000000000028 = unaff_x23[1];
  uStack0000000000000020 = *unaff_x23;
  uStack0000000000000038 = unaff_x23[3];
  uStack0000000000000030 = unaff_x23[2];
  uStack000000000000007a = (char)((ulong)uVar12 >> 0x10);
  bVar10 = uStack000000000000007a == '\0';
  uStack0000000000000078 = uVar12;
  if (bVar10) {
    lVar11 = _strlen();
    pcVar19 = unaff_x22 + lVar11;
    while (unaff_x22 < pcVar19) {
      pcVar19 = pcVar19 + -1;
      if ((*pcVar19 == '\\') || (*pcVar19 == '/')) break;
    }
    param_3 = "%s, %.0fpx";
    func_0x000b875c(&uStack000000000000007a,0x28);
  }
  *(undefined8 *)(unaff_x24 + 0x98) = uStack0000000000000028;
  *(undefined8 *)(unaff_x24 + 0x90) = uStack0000000000000020;
  *(undefined8 *)(unaff_x24 + 0xa8) = uStack0000000000000038;
  *(undefined8 *)(unaff_x24 + 0xa0) = uStack0000000000000030;
  *(undefined8 *)(unaff_x24 + 0xf8) = in_stack_00000088;
  *(undefined8 *)(unaff_x24 + 0xf0) = in_stack_00000080;
  *(undefined8 *)(unaff_x24 + 0x108) = in_stack_00000098;
  *(undefined8 *)(unaff_x24 + 0x100) = in_stack_00000090;
  *(undefined8 *)(unaff_x24 + 0x118) = *(undefined8 *)(unaff_x24 + 0x88);
  *(undefined8 *)(unaff_x24 + 0x110) = *(undefined8 *)(unaff_x24 + 0x80);
  *(undefined8 *)(unaff_x24 + 0xb8) = in_stack_00000048;
  *(undefined8 *)(unaff_x24 + 0xb0) = in_stack_00000040;
  *(undefined8 *)(unaff_x24 + 200) = in_stack_00000058;
  *(undefined8 *)(unaff_x24 + 0xc0) = in_stack_00000050;
  *(undefined8 *)(unaff_x24 + 0xd8) = uStack0000000000000068;
  *(undefined8 *)(unaff_x24 + 0xd0) = uStack0000000000000060;
  *(undefined8 *)(unaff_x24 + 0xe8) = uStack0000000000000078;
  *(undefined8 *)(unaff_x24 + 0xe0) = uStack0000000000000070;
  func_0x000f7bac();
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x58)) {
    return;
  }
  uVar12 = ___stack_chk_fail();
  lStack_18 = *(long *)PTR____stack_chk_guard_009b01e8;
  if (param_4 == 0) {
    uStack_90 = 0;
    lStack_78 = 0;
    uStack_68 = 0;
    uStack_50 = 0;
    uStack_28 = 0;
    uStack_30 = 0;
    uStack_38 = 0;
    uStack_40 = 0;
    uStack_48 = 0;
    uStack_80 = 0;
    uStack_88 = 0;
    uStack_70 = 0x7f7fffff00000000;
    uStack_60 = NEON_fmov(0x3f800000,4);
    uStack_58 = 0xffff;
    uStack_a8 = CONCAT44(1,(int)param_3);
    fVar26 = extraout_s0;
    if (extraout_s0 <= 0.0) {
      fVar26 = 0.0;
    }
    uStack_a0 = (ulong)(uint)fVar26 << 0x20;
    uStack_98 = _UNK_0080c170;
  }
  else {
    uStack_48 = *(undefined8 *)(param_4 + 0x68);
    uStack_50 = *(undefined8 *)(param_4 + 0x60);
    uStack_38 = *(undefined8 *)(param_4 + 0x78);
    uStack_40 = *(undefined8 *)(param_4 + 0x70);
    uStack_28 = *(undefined8 *)(param_4 + 0x88);
    uStack_30 = *(undefined8 *)(param_4 + 0x80);
    uStack_88 = *(undefined8 *)(param_4 + 0x28);
    uStack_90 = *(undefined8 *)(param_4 + 0x20);
    lStack_78 = *(long *)(param_4 + 0x38);
    uStack_80 = *(undefined8 *)(param_4 + 0x30);
    uStack_68 = *(undefined8 *)(param_4 + 0x48);
    uStack_70 = *(undefined8 *)(param_4 + 0x40);
    uStack_58 = *(undefined8 *)(param_4 + 0x58);
    uStack_60 = *(undefined8 *)(param_4 + 0x50);
    uStack_98 = *(undefined8 *)(param_4 + 0x18);
    uStack_a0._4_4_ = (float)((ulong)*(undefined8 *)(param_4 + 0x10) >> 0x20);
    uStack_a8 = CONCAT44((int)((ulong)*(undefined8 *)(param_4 + 8) >> 0x20),(int)param_3);
    fVar26 = extraout_s0;
    if (extraout_s0 <= 0.0) {
      fVar26 = uStack_a0._4_4_;
    }
    uStack_a0 = CONCAT44(fVar26,(int)*(undefined8 *)(param_4 + 0x10));
  }
  if (param_5 != 0) {
    lStack_78 = param_5;
  }
  uStack_b0 = extraout_x1;
  func_0x000f7bac(uVar12,&uStack_b0);
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_18) {
    return;
  }
  uVar12 = ___stack_chk_fail();
  lStack_138 = *(long *)PTR____stack_chk_guard_009b01e8;
  uVar8 = (extraout_x1_00[2] & 0xff00ff00) >> 8 | (extraout_x1_00[2] & 0xff00ff) << 8;
  uVar8 = uVar8 >> 0x10 | uVar8 << 0x10;
  pcVar19 = (char *)func_0x000b810c(uVar8);
  uVar15 = SUB82(param_3,0);
  uVar18 = (*extraout_x1_00 & 0xff00ff00) >> 8 | (*extraout_x1_00 & 0xff00ff) << 8;
  if (((uVar18 >> 0x10 | uVar18 << 0x10) == 0x57bc0000) &&
     (uVar18 = (extraout_x1_00[1] & 0xff00ff00) >> 8 | (extraout_x1_00[1] & 0xff00ff) << 8,
     uVar18 >> 0x10 == 0 && (uVar18 & 0xffff) == 0)) {
    uVar18 = (extraout_x1_00[2] & 0xff00ff00) >> 8 | (extraout_x1_00[2] & 0xff00ff) << 8;
    pcVar3 = pcVar19 + (uVar18 >> 0x10 | uVar18 << 0x10);
    puVar25 = extraout_x1_00 + 4;
    pcVar2 = pcVar3 + 1;
    pcVar13 = pcVar19;
    puRam0000000000a39088 = extraout_x1_00;
    pcRam0000000000a39090 = pcVar3;
    pcRam0000000000a39098 = pcVar19;
    pcRam0000000000a390a0 = pcVar19;
    do {
      uVar15 = SUB82(param_3,0);
      bVar7 = (byte)*puVar25;
      uVar20 = (ulong)bVar7;
      uVar18 = (uint)bVar7;
      if (bVar7 < 0x20) {
        if (bVar7 < 0x18) {
          if (0xf < uVar18) {
            uVar9 = (uint)(*(ushort *)((long)puVar25 + 3) >> 8) |
                    (*(ushort *)((long)puVar25 + 3) & 0xff00ff) << 8;
            uVar1 = uVar9 + 1;
            uVar20 = (ulong)uVar1;
            pcRam0000000000a390a0 = pcVar13 + uVar20;
            if (pcVar13 + uVar20 <= pcVar3) {
              uVar18 = ((uint)*(byte *)((long)puVar25 + 2) | uVar18 << 0x10 |
                       (uint)*(byte *)((long)puVar25 + 1) << 8) - 0xfffff;
              pcVar21 = pcVar13 + -(ulong)uVar18;
              pcRam0000000000a390a0 = pcVar2;
              if (pcVar19 <= pcVar21) {
                if ((0x3e < uVar9) && (0x3f < uVar18)) {
                  uVar23 = uVar20 & 0x1ffc0;
                  pcRam0000000000a390a0 = pcVar13 + uVar23;
                  pcVar13 = pcVar13 + 0x20;
                  uVar22 = uVar23;
                  do {
                    pcVar17 = pcVar13 + -(ulong)uVar18;
                    uVar27 = *(undefined8 *)(pcVar17 + -0x20);
                    uVar29 = *(undefined8 *)(pcVar17 + -8);
                    uVar28 = *(undefined8 *)(pcVar17 + -0x10);
                    uVar31 = *(undefined8 *)(pcVar17 + 8);
                    uVar30 = *(undefined8 *)pcVar17;
                    uVar33 = *(undefined8 *)(pcVar17 + 0x18);
                    uVar32 = *(undefined8 *)(pcVar17 + 0x10);
                    *(undefined8 *)(pcVar13 + -0x18) = *(undefined8 *)(pcVar17 + -0x18);
                    *(undefined8 *)(pcVar13 + -0x20) = uVar27;
                    *(undefined8 *)(pcVar13 + -8) = uVar29;
                    *(undefined8 *)(pcVar13 + -0x10) = uVar28;
                    *(undefined8 *)(pcVar13 + 8) = uVar31;
                    *(undefined8 *)pcVar13 = uVar30;
                    *(undefined8 *)(pcVar13 + 0x18) = uVar33;
                    *(undefined8 *)(pcVar13 + 0x10) = uVar32;
                    uVar22 = uVar22 - 0x40;
                    pcVar13 = pcVar13 + 0x40;
                  } while (uVar22 != 0);
                  bVar10 = uVar23 == uVar20;
                  pcVar21 = pcVar21 + uVar23;
                  uVar20 = (ulong)(uVar1 - (int)uVar23);
                  pcVar13 = pcRam0000000000a390a0;
                  if (bVar10) goto code_r0x000f8c04;
                }
                do {
                  *pcVar13 = *pcVar21;
                  uVar18 = (int)uVar20 - 1;
                  uVar20 = (ulong)uVar18;
                  pcVar21 = pcVar21 + 1;
                  pcRam0000000000a390a0 = pcVar13 + 1;
                  pcVar13 = pcVar13 + 1;
                } while (uVar18 != 0);
              }
            }
code_r0x000f8c04:
            puVar25 = (uint *)((long)puVar25 + 5);
            goto code_r0x000f86a8;
          }
          if (7 < uVar18) {
            uVar18 = (uint)CONCAT11(bVar7,*(undefined1 *)((long)puVar25 + 1));
            param_3 = (char *)(ulong)(uVar18 - 0x7ff);
            pcVar13 = pcVar13 + (long)param_3;
            if (pcVar3 < pcVar13) {
code_r0x000f8a08:
              pcVar21 = pcVar13;
            }
            else {
              pcVar21 = pcVar2;
              if (extraout_x1_00 <= (uint *)((long)puVar25 + 2U)) {
                _memcpy();
                uVar18 = (uint)(ushort)((ushort)*puVar25 >> 8) | ((ushort)*puVar25 & 0xff00ff) << 8;
                goto code_r0x000f8a08;
              }
            }
            uVar15 = SUB82(param_3,0);
            lVar11 = (long)(int)(uVar18 - 0x7fd);
            pcRam0000000000a390a0 = pcVar21;
            if (lVar11 != 0) goto code_r0x000f8a20;
            break;
          }
          if (uVar18 == 4) {
            uVar1 = (uint)(ushort)((ushort)puVar25[1] >> 8) | ((ushort)puVar25[1] & 0xff00ff) << 8;
            uVar18 = uVar1 + 1;
            uVar20 = (ulong)uVar18;
            pcRam0000000000a390a0 = pcVar13 + uVar20;
            if (pcVar13 + uVar20 <= pcVar3) {
              uVar22 = (ulong)*(byte *)((long)puVar25 + 3) |
                       (ulong)*(byte *)((long)puVar25 + 1) << 0x10 |
                       (ulong)*(byte *)((long)puVar25 + 2) << 8;
              pcVar21 = pcVar13 + ~uVar22;
              pcRam0000000000a390a0 = pcVar2;
              if (pcVar19 <= pcVar21) {
                if ((0x3e < uVar1) && (0x3e < uVar22)) {
                  uVar24 = uVar20 & 0x1ffc0;
                  pcRam0000000000a390a0 = pcVar13 + uVar24;
                  pcVar13 = pcVar13 + 0x1f;
                  uVar23 = uVar24;
                  do {
                    pcVar17 = pcVar13 + -uVar22;
                    uVar27 = *(undefined8 *)(pcVar17 + -0x20);
                    uVar29 = *(undefined8 *)(pcVar17 + -8);
                    uVar28 = *(undefined8 *)(pcVar17 + -0x10);
                    uVar31 = *(undefined8 *)(pcVar17 + 8);
                    uVar30 = *(undefined8 *)pcVar17;
                    uVar33 = *(undefined8 *)(pcVar17 + 0x18);
                    uVar32 = *(undefined8 *)(pcVar17 + 0x10);
                    *(undefined8 *)(pcVar13 + -0x17) = *(undefined8 *)(pcVar17 + -0x18);
                    *(undefined8 *)(pcVar13 + -0x1f) = uVar27;
                    *(undefined8 *)(pcVar13 + -7) = uVar29;
                    *(undefined8 *)(pcVar13 + -0xf) = uVar28;
                    *(undefined8 *)(pcVar13 + 9) = uVar31;
                    *(undefined8 *)(pcVar13 + 1) = uVar30;
                    *(undefined8 *)(pcVar13 + 0x19) = uVar33;
                    *(undefined8 *)(pcVar13 + 0x11) = uVar32;
                    pcVar13 = pcVar13 + 0x40;
                    uVar23 = uVar23 - 0x40;
                  } while (uVar23 != 0);
                  bVar10 = uVar24 == uVar20;
                  pcVar21 = pcVar21 + uVar24;
                  pcVar13 = pcRam0000000000a390a0;
                  uVar20 = (ulong)(uVar18 - (int)uVar24);
                  if (bVar10) goto code_r0x000f8c78;
                }
                do {
                  pcRam0000000000a390a0 = pcVar13 + 1;
                  *pcVar13 = *pcVar21;
                  uVar18 = (int)uVar20 - 1;
                  uVar20 = (ulong)uVar18;
                  pcVar21 = pcVar21 + 1;
                  pcVar13 = pcRam0000000000a390a0;
                } while (uVar18 != 0);
              }
            }
code_r0x000f8c78:
            puVar25 = (uint *)((long)puVar25 + 6);
          }
          else {
            if (uVar18 == 6) {
              uVar20 = (ulong)(byte)puVar25[1] + 1;
              pcRam0000000000a390a0 = pcVar13 + uVar20;
              if (pcVar13 + uVar20 <= pcVar3) {
                uVar22 = (ulong)*(byte *)((long)puVar25 + 3) |
                         (ulong)*(byte *)((long)puVar25 + 1) << 0x10 |
                         (ulong)*(byte *)((long)puVar25 + 2) << 8;
                pcVar21 = pcVar13 + ~uVar22;
                pcRam0000000000a390a0 = pcVar2;
                if (pcVar19 <= pcVar21) {
                  if ((0x3e < (byte)puVar25[1]) && (0x3e < uVar22)) {
                    uVar22 = uVar20 & 0x1c0;
                    uVar27 = *(undefined8 *)pcVar21;
                    uVar29 = *(undefined8 *)(pcVar21 + 0x18);
                    uVar28 = *(undefined8 *)(pcVar21 + 0x10);
                    uVar31 = *(undefined8 *)(pcVar21 + 0x28);
                    uVar30 = *(undefined8 *)(pcVar21 + 0x20);
                    uVar33 = *(undefined8 *)(pcVar21 + 0x38);
                    uVar32 = *(undefined8 *)(pcVar21 + 0x30);
                    *(undefined8 *)(pcVar13 + 8) = *(undefined8 *)(pcVar21 + 8);
                    *(undefined8 *)pcVar13 = uVar27;
                    *(undefined8 *)(pcVar13 + 0x18) = uVar29;
                    *(undefined8 *)(pcVar13 + 0x10) = uVar28;
                    *(undefined8 *)(pcVar13 + 0x28) = uVar31;
                    *(undefined8 *)(pcVar13 + 0x20) = uVar30;
                    *(undefined8 *)(pcVar13 + 0x38) = uVar33;
                    *(undefined8 *)(pcVar13 + 0x30) = uVar32;
                    if (uVar22 != 0x40) {
                      uVar27 = *(undefined8 *)(pcVar21 + 0x40);
                      uVar29 = *(undefined8 *)(pcVar21 + 0x58);
                      uVar28 = *(undefined8 *)(pcVar21 + 0x50);
                      uVar31 = *(undefined8 *)(pcVar21 + 0x68);
                      uVar30 = *(undefined8 *)(pcVar21 + 0x60);
                      uVar33 = *(undefined8 *)(pcVar21 + 0x78);
                      uVar32 = *(undefined8 *)(pcVar21 + 0x70);
                      *(undefined8 *)(pcVar13 + 0x48) = *(undefined8 *)(pcVar21 + 0x48);
                      *(undefined8 *)(pcVar13 + 0x40) = uVar27;
                      *(undefined8 *)(pcVar13 + 0x58) = uVar29;
                      *(undefined8 *)(pcVar13 + 0x50) = uVar28;
                      *(undefined8 *)(pcVar13 + 0x68) = uVar31;
                      *(undefined8 *)(pcVar13 + 0x60) = uVar30;
                      *(undefined8 *)(pcVar13 + 0x78) = uVar33;
                      *(undefined8 *)(pcVar13 + 0x70) = uVar32;
                      if (uVar22 != 0x80) {
                        uVar27 = *(undefined8 *)(pcVar21 + 0x80);
                        uVar29 = *(undefined8 *)(pcVar21 + 0x98);
                        uVar28 = *(undefined8 *)(pcVar21 + 0x90);
                        uVar31 = *(undefined8 *)(pcVar21 + 0xa8);
                        uVar30 = *(undefined8 *)(pcVar21 + 0xa0);
                        uVar33 = *(undefined8 *)(pcVar21 + 0xb8);
                        uVar32 = *(undefined8 *)(pcVar21 + 0xb0);
                        *(undefined8 *)(pcVar13 + 0x88) = *(undefined8 *)(pcVar21 + 0x88);
                        *(undefined8 *)(pcVar13 + 0x80) = uVar27;
                        *(undefined8 *)(pcVar13 + 0x98) = uVar29;
                        *(undefined8 *)(pcVar13 + 0x90) = uVar28;
                        *(undefined8 *)(pcVar13 + 0xa8) = uVar31;
                        *(undefined8 *)(pcVar13 + 0xa0) = uVar30;
                        *(undefined8 *)(pcVar13 + 0xb8) = uVar33;
                        *(undefined8 *)(pcVar13 + 0xb0) = uVar32;
                        if (uVar22 != 0xc0) {
                          uVar27 = *(undefined8 *)(pcVar21 + 0xc0);
                          uVar29 = *(undefined8 *)(pcVar21 + 0xd8);
                          uVar28 = *(undefined8 *)(pcVar21 + 0xd0);
                          uVar31 = *(undefined8 *)(pcVar21 + 0xe8);
                          uVar30 = *(undefined8 *)(pcVar21 + 0xe0);
                          uVar33 = *(undefined8 *)(pcVar21 + 0xf8);
                          uVar32 = *(undefined8 *)(pcVar21 + 0xf0);
                          *(undefined8 *)(pcVar13 + 200) = *(undefined8 *)(pcVar21 + 200);
                          *(undefined8 *)(pcVar13 + 0xc0) = uVar27;
                          *(undefined8 *)(pcVar13 + 0xd8) = uVar29;
                          *(undefined8 *)(pcVar13 + 0xd0) = uVar28;
                          *(undefined8 *)(pcVar13 + 0xe8) = uVar31;
                          *(undefined8 *)(pcVar13 + 0xe0) = uVar30;
                          *(undefined8 *)(pcVar13 + 0xf8) = uVar33;
                          *(undefined8 *)(pcVar13 + 0xf0) = uVar32;
                        }
                      }
                    }
                    pcVar13 = pcVar13 + uVar22;
                    if (uVar22 == uVar20) {
                      pcRam0000000000a390a0 = pcVar13;
                      goto code_r0x000f8c04;
                    }
                    uVar20 = (ulong)(uint)((int)uVar20 - (int)uVar22);
                    pcVar21 = pcVar21 + uVar22;
                  }
                  do {
                    pcRam0000000000a390a0 = pcVar13 + 1;
                    *pcVar13 = *pcVar21;
                    uVar18 = (int)uVar20 - 1;
                    uVar20 = (ulong)uVar18;
                    pcVar21 = pcVar21 + 1;
                    pcVar13 = pcRam0000000000a390a0;
                  } while (uVar18 != 0);
                }
              }
              goto code_r0x000f8c04;
            }
            if (uVar18 != 7) break;
            uVar20 = (ulong)((uint)(*(ushort *)((long)puVar25 + 1) >> 8) |
                            (*(ushort *)((long)puVar25 + 1) & 0xff00ff) << 8);
            param_3 = (char *)(uVar20 + 1);
            pcVar13 = pcVar13 + (long)param_3;
            if (pcVar3 < pcVar13) {
code_r0x000f8a7c:
              pcVar21 = pcVar13;
            }
            else {
              pcVar21 = pcVar2;
              if (extraout_x1_00 <= (uint *)((long)puVar25 + 3U)) {
                _memcpy();
                uVar20 = (ulong)((uint)(*(ushort *)((long)puVar25 + 1) >> 8) |
                                (*(ushort *)((long)puVar25 + 1) & 0xff00ff) << 8);
                goto code_r0x000f8a7c;
              }
            }
            puVar25 = (uint *)((long)puVar25 + uVar20 + 4);
            pcRam0000000000a390a0 = pcVar21;
          }
          pcVar13 = pcRam0000000000a390a0;
          goto code_r0x000f86ac;
        }
        uVar20 = (ulong)*(byte *)((long)puVar25 + 3) + 1;
        pcRam0000000000a390a0 = pcVar13 + uVar20;
        if (pcVar13 + uVar20 <= pcVar3) {
          uVar18 = ((uint)*(byte *)((long)puVar25 + 2) | uVar18 << 0x10 |
                   (uint)*(byte *)((long)puVar25 + 1) << 8) - 0x17ffff;
          pcVar21 = pcVar13 + -(ulong)uVar18;
          pcRam0000000000a390a0 = pcVar2;
          if (pcVar19 <= pcVar21) {
            if ((0x3e < *(byte *)((long)puVar25 + 3)) && (0x3f < uVar18)) {
              uVar22 = uVar20 & 0x1c0;
              uVar27 = *(undefined8 *)pcVar21;
              uVar29 = *(undefined8 *)(pcVar21 + 0x18);
              uVar28 = *(undefined8 *)(pcVar21 + 0x10);
              uVar31 = *(undefined8 *)(pcVar21 + 0x28);
              uVar30 = *(undefined8 *)(pcVar21 + 0x20);
              uVar33 = *(undefined8 *)(pcVar21 + 0x38);
              uVar32 = *(undefined8 *)(pcVar21 + 0x30);
              *(undefined8 *)(pcVar13 + 8) = *(undefined8 *)(pcVar21 + 8);
              *(undefined8 *)pcVar13 = uVar27;
              *(undefined8 *)(pcVar13 + 0x18) = uVar29;
              *(undefined8 *)(pcVar13 + 0x10) = uVar28;
              *(undefined8 *)(pcVar13 + 0x28) = uVar31;
              *(undefined8 *)(pcVar13 + 0x20) = uVar30;
              *(undefined8 *)(pcVar13 + 0x38) = uVar33;
              *(undefined8 *)(pcVar13 + 0x30) = uVar32;
              if (uVar22 != 0x40) {
                uVar27 = *(undefined8 *)(pcVar21 + 0x40);
                uVar29 = *(undefined8 *)(pcVar21 + 0x58);
                uVar28 = *(undefined8 *)(pcVar21 + 0x50);
                uVar31 = *(undefined8 *)(pcVar21 + 0x68);
                uVar30 = *(undefined8 *)(pcVar21 + 0x60);
                uVar33 = *(undefined8 *)(pcVar21 + 0x78);
                uVar32 = *(undefined8 *)(pcVar21 + 0x70);
                *(undefined8 *)(pcVar13 + 0x48) = *(undefined8 *)(pcVar21 + 0x48);
                *(undefined8 *)(pcVar13 + 0x40) = uVar27;
                *(undefined8 *)(pcVar13 + 0x58) = uVar29;
                *(undefined8 *)(pcVar13 + 0x50) = uVar28;
                *(undefined8 *)(pcVar13 + 0x68) = uVar31;
                *(undefined8 *)(pcVar13 + 0x60) = uVar30;
                *(undefined8 *)(pcVar13 + 0x78) = uVar33;
                *(undefined8 *)(pcVar13 + 0x70) = uVar32;
                if (uVar22 != 0x80) {
                  uVar27 = *(undefined8 *)(pcVar21 + 0x80);
                  uVar29 = *(undefined8 *)(pcVar21 + 0x98);
                  uVar28 = *(undefined8 *)(pcVar21 + 0x90);
                  uVar31 = *(undefined8 *)(pcVar21 + 0xa8);
                  uVar30 = *(undefined8 *)(pcVar21 + 0xa0);
                  uVar33 = *(undefined8 *)(pcVar21 + 0xb8);
                  uVar32 = *(undefined8 *)(pcVar21 + 0xb0);
                  *(undefined8 *)(pcVar13 + 0x88) = *(undefined8 *)(pcVar21 + 0x88);
                  *(undefined8 *)(pcVar13 + 0x80) = uVar27;
                  *(undefined8 *)(pcVar13 + 0x98) = uVar29;
                  *(undefined8 *)(pcVar13 + 0x90) = uVar28;
                  *(undefined8 *)(pcVar13 + 0xa8) = uVar31;
                  *(undefined8 *)(pcVar13 + 0xa0) = uVar30;
                  *(undefined8 *)(pcVar13 + 0xb8) = uVar33;
                  *(undefined8 *)(pcVar13 + 0xb0) = uVar32;
                  if (uVar22 != 0xc0) {
                    uVar27 = *(undefined8 *)(pcVar21 + 0xc0);
                    uVar29 = *(undefined8 *)(pcVar21 + 0xd8);
                    uVar28 = *(undefined8 *)(pcVar21 + 0xd0);
                    uVar31 = *(undefined8 *)(pcVar21 + 0xe8);
                    uVar30 = *(undefined8 *)(pcVar21 + 0xe0);
                    uVar33 = *(undefined8 *)(pcVar21 + 0xf8);
                    uVar32 = *(undefined8 *)(pcVar21 + 0xf0);
                    *(undefined8 *)(pcVar13 + 200) = *(undefined8 *)(pcVar21 + 200);
                    *(undefined8 *)(pcVar13 + 0xc0) = uVar27;
                    *(undefined8 *)(pcVar13 + 0xd8) = uVar29;
                    *(undefined8 *)(pcVar13 + 0xd0) = uVar28;
                    *(undefined8 *)(pcVar13 + 0xe8) = uVar31;
                    *(undefined8 *)(pcVar13 + 0xe0) = uVar30;
                    *(undefined8 *)(pcVar13 + 0xf8) = uVar33;
                    *(undefined8 *)(pcVar13 + 0xf0) = uVar32;
                  }
                }
              }
              pcVar13 = pcVar13 + uVar22;
              if (uVar22 == uVar20) {
                pcRam0000000000a390a0 = pcVar13;
                goto code_r0x000f86a0;
              }
              uVar20 = (ulong)(uint)((int)uVar20 - (int)uVar22);
              pcVar21 = pcVar21 + uVar22;
            }
            do {
              pcRam0000000000a390a0 = pcVar13 + 1;
              *pcVar13 = *pcVar21;
              uVar18 = (int)uVar20 - 1;
              uVar20 = (ulong)uVar18;
              pcVar21 = pcVar21 + 1;
              pcVar13 = pcRam0000000000a390a0;
            } while (uVar18 != 0);
          }
        }
code_r0x000f86a0:
        puVar25 = puVar25 + 1;
code_r0x000f86a8:
        pcVar13 = pcRam0000000000a390a0;
      }
      else {
        uVar18 = (uint)bVar7;
        if ((char)bVar7 < '\0') {
          uVar18 = uVar18 - 0x7f;
          uVar20 = (ulong)uVar18;
          pcVar21 = pcVar13 + uVar20;
          if (pcVar3 < pcVar13 + uVar20) {
code_r0x000f8c28:
            pcVar13 = pcVar21;
            pcRam0000000000a390a0 = pcVar13;
          }
          else {
            bVar7 = *(byte *)((long)puVar25 + 1);
            pcVar17 = pcVar13 + ~(ulong)bVar7;
            pcVar21 = pcVar2;
            if (pcVar17 < pcVar19) goto code_r0x000f8c28;
            if (uVar18 != 0) {
              if ((0x3f < uVar18) && (0x3e < bVar7)) {
                uVar23 = uVar20 & 0xffffffc0;
                pcVar21 = pcVar13 + uVar23;
                uVar22 = uVar23;
                do {
                  pcVar4 = pcVar13 + (0x2f - (ulong)bVar7);
                  uVar27 = *(undefined8 *)(pcVar4 + -0x30);
                  uVar29 = *(undefined8 *)(pcVar4 + -0x18);
                  uVar28 = *(undefined8 *)(pcVar4 + -0x20);
                  uVar31 = *(undefined8 *)(pcVar4 + -8);
                  uVar30 = *(undefined8 *)(pcVar4 + -0x10);
                  uVar33 = *(undefined8 *)(pcVar4 + 8);
                  uVar32 = *(undefined8 *)pcVar4;
                  *(undefined8 *)(pcVar13 + 8) = *(undefined8 *)(pcVar4 + -0x28);
                  *(undefined8 *)pcVar13 = uVar27;
                  *(undefined8 *)(pcVar13 + 0x18) = uVar29;
                  *(undefined8 *)(pcVar13 + 0x10) = uVar28;
                  *(undefined8 *)(pcVar13 + 0x28) = uVar31;
                  *(undefined8 *)(pcVar13 + 0x20) = uVar30;
                  *(undefined8 *)(pcVar13 + 0x38) = uVar33;
                  *(undefined8 *)(pcVar13 + 0x30) = uVar32;
                  pcVar13 = pcVar13 + 0x40;
                  uVar22 = uVar22 - 0x40;
                } while (uVar22 != 0);
                bVar10 = uVar23 == uVar20;
                pcVar17 = pcVar17 + uVar23;
                pcVar13 = pcVar21;
                uVar20 = (ulong)(uVar18 - (int)uVar23);
                if (bVar10) goto code_r0x000f8c28;
              }
              do {
                *pcVar13 = *pcVar17;
                uVar18 = (int)uVar20 - 1;
                uVar20 = (ulong)uVar18;
                pcVar17 = pcVar17 + 1;
                pcVar21 = pcVar13 + 1;
                pcVar13 = pcVar13 + 1;
              } while (uVar18 != 0);
              goto code_r0x000f8c28;
            }
          }
          puVar25 = (uint *)((long)puVar25 + 2);
        }
        else {
          if (0x3f < uVar18) {
            uVar20 = (ulong)*(byte *)((long)puVar25 + 2) + 1;
            pcRam0000000000a390a0 = pcVar13 + uVar20;
            if (pcVar13 + uVar20 <= pcVar3) {
              uVar18 = CONCAT11(bVar7,*(undefined1 *)((long)puVar25 + 1)) - 0x3fff;
              pcVar21 = pcVar13 + -(ulong)uVar18;
              pcRam0000000000a390a0 = pcVar2;
              if (pcVar19 <= pcVar21) {
                if ((0x3e < *(byte *)((long)puVar25 + 2)) && (0x3f < uVar18)) {
                  uVar22 = uVar20 & 0x1c0;
                  uVar27 = *(undefined8 *)pcVar21;
                  uVar29 = *(undefined8 *)(pcVar21 + 0x18);
                  uVar28 = *(undefined8 *)(pcVar21 + 0x10);
                  uVar31 = *(undefined8 *)(pcVar21 + 0x28);
                  uVar30 = *(undefined8 *)(pcVar21 + 0x20);
                  uVar33 = *(undefined8 *)(pcVar21 + 0x38);
                  uVar32 = *(undefined8 *)(pcVar21 + 0x30);
                  *(undefined8 *)(pcVar13 + 8) = *(undefined8 *)(pcVar21 + 8);
                  *(undefined8 *)pcVar13 = uVar27;
                  *(undefined8 *)(pcVar13 + 0x18) = uVar29;
                  *(undefined8 *)(pcVar13 + 0x10) = uVar28;
                  *(undefined8 *)(pcVar13 + 0x28) = uVar31;
                  *(undefined8 *)(pcVar13 + 0x20) = uVar30;
                  *(undefined8 *)(pcVar13 + 0x38) = uVar33;
                  *(undefined8 *)(pcVar13 + 0x30) = uVar32;
                  if (uVar22 != 0x40) {
                    uVar27 = *(undefined8 *)(pcVar21 + 0x40);
                    uVar29 = *(undefined8 *)(pcVar21 + 0x58);
                    uVar28 = *(undefined8 *)(pcVar21 + 0x50);
                    uVar31 = *(undefined8 *)(pcVar21 + 0x68);
                    uVar30 = *(undefined8 *)(pcVar21 + 0x60);
                    uVar33 = *(undefined8 *)(pcVar21 + 0x78);
                    uVar32 = *(undefined8 *)(pcVar21 + 0x70);
                    *(undefined8 *)(pcVar13 + 0x48) = *(undefined8 *)(pcVar21 + 0x48);
                    *(undefined8 *)(pcVar13 + 0x40) = uVar27;
                    *(undefined8 *)(pcVar13 + 0x58) = uVar29;
                    *(undefined8 *)(pcVar13 + 0x50) = uVar28;
                    *(undefined8 *)(pcVar13 + 0x68) = uVar31;
                    *(undefined8 *)(pcVar13 + 0x60) = uVar30;
                    *(undefined8 *)(pcVar13 + 0x78) = uVar33;
                    *(undefined8 *)(pcVar13 + 0x70) = uVar32;
                    if (uVar22 != 0x80) {
                      uVar27 = *(undefined8 *)(pcVar21 + 0x80);
                      uVar29 = *(undefined8 *)(pcVar21 + 0x98);
                      uVar28 = *(undefined8 *)(pcVar21 + 0x90);
                      uVar31 = *(undefined8 *)(pcVar21 + 0xa8);
                      uVar30 = *(undefined8 *)(pcVar21 + 0xa0);
                      uVar33 = *(undefined8 *)(pcVar21 + 0xb8);
                      uVar32 = *(undefined8 *)(pcVar21 + 0xb0);
                      *(undefined8 *)(pcVar13 + 0x88) = *(undefined8 *)(pcVar21 + 0x88);
                      *(undefined8 *)(pcVar13 + 0x80) = uVar27;
                      *(undefined8 *)(pcVar13 + 0x98) = uVar29;
                      *(undefined8 *)(pcVar13 + 0x90) = uVar28;
                      *(undefined8 *)(pcVar13 + 0xa8) = uVar31;
                      *(undefined8 *)(pcVar13 + 0xa0) = uVar30;
                      *(undefined8 *)(pcVar13 + 0xb8) = uVar33;
                      *(undefined8 *)(pcVar13 + 0xb0) = uVar32;
                      if (uVar22 != 0xc0) {
                        uVar27 = *(undefined8 *)(pcVar21 + 0xc0);
                        uVar29 = *(undefined8 *)(pcVar21 + 0xd8);
                        uVar28 = *(undefined8 *)(pcVar21 + 0xd0);
                        uVar31 = *(undefined8 *)(pcVar21 + 0xe8);
                        uVar30 = *(undefined8 *)(pcVar21 + 0xe0);
                        uVar33 = *(undefined8 *)(pcVar21 + 0xf8);
                        uVar32 = *(undefined8 *)(pcVar21 + 0xf0);
                        *(undefined8 *)(pcVar13 + 200) = *(undefined8 *)(pcVar21 + 200);
                        *(undefined8 *)(pcVar13 + 0xc0) = uVar27;
                        *(undefined8 *)(pcVar13 + 0xd8) = uVar29;
                        *(undefined8 *)(pcVar13 + 0xd0) = uVar28;
                        *(undefined8 *)(pcVar13 + 0xe8) = uVar31;
                        *(undefined8 *)(pcVar13 + 0xe0) = uVar30;
                        *(undefined8 *)(pcVar13 + 0xf8) = uVar33;
                        *(undefined8 *)(pcVar13 + 0xf0) = uVar32;
                      }
                    }
                  }
                  pcVar13 = pcVar13 + uVar22;
                  if (uVar22 == uVar20) {
                    pcRam0000000000a390a0 = pcVar13;
                    goto code_r0x000f8c54;
                  }
                  uVar20 = (ulong)(uint)((int)uVar20 - (int)uVar22);
                  pcVar21 = pcVar21 + uVar22;
                }
                do {
                  pcRam0000000000a390a0 = pcVar13 + 1;
                  *pcVar13 = *pcVar21;
                  uVar18 = (int)uVar20 - 1;
                  uVar20 = (ulong)uVar18;
                  pcVar21 = pcVar21 + 1;
                  pcVar13 = pcRam0000000000a390a0;
                } while (uVar18 != 0);
              }
            }
code_r0x000f8c54:
            puVar25 = (uint *)((long)puVar25 + 3);
            goto code_r0x000f86a8;
          }
          param_3 = (char *)(ulong)(uVar18 - 0x1f);
          pcVar13 = pcVar13 + (long)param_3;
          if (pcVar3 < pcVar13) {
code_r0x000f89a8:
            pcVar21 = pcVar13;
          }
          else {
            pcVar21 = pcVar2;
            if (extraout_x1_00 <= (uint *)((long)puVar25 + 1U)) {
              _memcpy();
              uVar20 = (ulong)(byte)*puVar25;
              goto code_r0x000f89a8;
            }
          }
          uVar15 = SUB82(param_3,0);
          lVar11 = uVar20 - 0x1e;
          pcRam0000000000a390a0 = pcVar21;
          if (lVar11 == 0) break;
code_r0x000f8a20:
          puVar25 = (uint *)((long)puVar25 + lVar11);
          pcVar13 = pcRam0000000000a390a0;
        }
      }
code_r0x000f86ac:
      uVar15 = SUB82(param_3,0);
    } while (pcVar13 <= pcVar3);
  }
  if (param_4 == 0) {
    uStack_180 = 0;
    uStack_1d8 = 0;
    fStack_1d1 = 0.0;
    uStack_1f8 = 0;
    uStack_200 = 0;
    lStack_1e8 = 0;
    uStack_1f0 = 0;
    uStack_1e0 = 0;
    uStack_238 = 0;
    uStack_240 = 0;
    uStack_228 = 0;
    uStack_230 = 0;
    uStack_218 = 0;
    uStack_220 = 0;
    uStack_178 = NEON_fmov(0x3f800000,4);
    uStack_184 = 0x7f7fffff;
    uStack_170 = 0xffff;
    uStack_212 = 0;
    uStack_210 = 0;
    uStack_1b0 = _UNK_0080c170;
  }
  else {
    uStack_1d8 = (undefined7)*(undefined8 *)(param_4 + 0xd);
    fStack_1d1 = *(float *)(param_4 + 0x14);
    uStack_1f8 = *(undefined8 *)(param_4 + 0x28);
    uStack_200 = *(undefined8 *)(param_4 + 0x20);
    lStack_1e8 = *(long *)(param_4 + 0x38);
    uStack_1f0 = *(undefined8 *)(param_4 + 0x30);
    uStack_1e0 = *(undefined4 *)(param_4 + 0x40);
    uStack_184 = *(undefined4 *)(param_4 + 0x44);
    uStack_180 = *(undefined8 *)(param_4 + 0x48);
    uStack_178 = *(undefined8 *)(param_4 + 0x50);
    uStack_170 = *(undefined2 *)(param_4 + 0x58);
    uStack_238 = *(undefined8 *)(param_4 + 0x62);
    uStack_240 = *(undefined8 *)(param_4 + 0x5a);
    uStack_228 = *(undefined8 *)(param_4 + 0x72);
    uStack_230 = *(undefined8 *)(param_4 + 0x6a);
    uStack_220 = *(undefined8 *)(param_4 + 0x7a);
    uStack_210 = (undefined6)((ulong)*(undefined8 *)(param_4 + 0x88) >> 0x10);
    uStack_218 = (undefined6)*(undefined8 *)(param_4 + 0x82);
    uStack_212 = (undefined2)((ulong)*(undefined8 *)(param_4 + 0x82) >> 0x30);
    uStack_1b0 = *(undefined8 *)(param_4 + 0x18);
  }
  uStack_1bc = 1;
  uStack_1bb = uStack_1d8;
  uStack_1a0 = uStack_1f8;
  uStack_1a8 = uStack_200;
  lStack_190 = lStack_1e8;
  uStack_198 = uStack_1f0;
  uStack_188 = uStack_1e0;
  uStack_13e = uStack_210;
  uStack_146 = uStack_218;
  uStack_140 = uStack_212;
  uStack_14e = uStack_220;
  uStack_156 = uStack_228;
  uStack_15e = uStack_230;
  uStack_166 = uStack_238;
  uStack_16e = uStack_240;
  fStack_1b4 = extraout_s0_00;
  if (extraout_s0_00 <= 0.0) {
    fStack_1b4 = fStack_1d1;
  }
  if (param_5 != 0) {
    lStack_190 = param_5;
  }
  pcStack_1c8 = pcVar19;
  uStack_1c0 = uVar8;
  func_0x000f7bac(uVar12,&pcStack_1c8);
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_138) {
    return;
  }
  Var34 = ___stack_chk_fail();
  lVar11 = (long)Var34;
  iVar16 = *(int *)(lVar11 + 0x68);
  if (iVar16 == *(int *)(lVar11 + 0x6c)) {
    iVar6 = iVar16;
    if (iVar16 < 0) {
      iVar6 = iVar16 + 1;
    }
    uVar8 = 8;
    if (iVar16 != 0) {
      uVar8 = iVar16 + (iVar6 >> 1);
    }
    if ((int)uVar8 <= (int)(iVar16 + 1U)) {
      uVar8 = iVar16 + 1U;
    }
    lVar14 = func_0x000b810c(-(ulong)(uVar8 >> 0x1f) & 0xffffffe000000000 | (ulong)uVar8 << 5);
    if (*(long *)(lVar11 + 0x70) != 0) {
      _memcpy(lVar14,*(long *)(lVar11 + 0x70),(long)*(int *)(lVar11 + 0x68) << 5);
      func_0x000b83d4(*(undefined8 *)(lVar11 + 0x70));
    }
    *(long *)(lVar11 + 0x70) = lVar14;
    *(uint *)(lVar11 + 0x6c) = uVar8;
    iVar16 = *(int *)(lVar11 + 0x68);
  }
  else {
    lVar14 = *(long *)(lVar11 + 0x70);
  }
  puVar5 = (undefined2 *)(lVar14 + (long)iVar16 * 0x20);
  *puVar5 = (short)((unkuint10)Var34 >> 0x40);
  puVar5[1] = uVar15;
  *(undefined4 *)(puVar5 + 2) = 0xffffffff;
  *(undefined8 *)(puVar5 + 8) = 0;
  *(undefined8 *)(puVar5 + 0xc) = 0;
  *(undefined8 *)(puVar5 + 4) = 0;
  *(int *)(lVar11 + 0x68) = *(int *)(lVar11 + 0x68) + 1;
  return;
}

