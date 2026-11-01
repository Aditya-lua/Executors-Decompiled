
void FUN_000c7b88(long param_1,undefined1 param_2 [16],undefined1 param_3 [16],double param_4,
                 long param_5,long param_6,long param_7)

{
  float *pfVar1;
  int *piVar2;
  int *piVar3;
  short sVar4;
  bool bVar5;
  char cVar6;
  bool bVar7;
  undefined8 uVar8;
  int iVar9;
  long *plVar10;
  long in_x9;
  ulong uVar11;
  uint uVar12;
  int iVar13;
  long in_x10;
  int iVar14;
  long in_x11;
  uint uVar15;
  long in_x12;
  long lVar16;
  undefined4 in_w13;
  long in_x14;
  float in_w15;
  undefined2 in_w16;
  char *pcVar17;
  char *in_x17;
  long unaff_x20;
  long lVar18;
  long unaff_x22;
  long *plVar19;
  long unaff_x24;
  long unaff_x26;
  long unaff_x27;
  long unaff_x29;
  float fVar20;
  undefined1 auVar21 [16];
  float fVar22;
  float fVar23;
  float fVar24;
  float fVar25;
  float fVar26;
  int *in_stack_00000048;
  long in_stack_00000050;
  int *in_stack_00000058;
  
code_r0x000c7b88:
  *(short *)(param_7 + 0xf) = *(short *)(param_7 + 0xf) + 1;
  do {
    *(double *)(param_6 + -0x2d) = param_4;
    uVar8 = *(undefined8 *)(unaff_x22 + 0xe40);
    *(undefined8 *)(in_x10 + in_x11 + -0x2d) = uVar8;
    sVar4 = *(short *)(in_x10 + param_1 + 0xf);
    *(short *)(param_5 + 5) = sVar4;
    *(undefined4 *)(unaff_x22 + in_x12) = 0;
    fVar22 = (float)uVar8;
    fVar20 = (float)((ulong)uVar8 >> 0x20);
    *(bool *)(in_x10 + in_x9) = sVar4 == 2;
    cVar6 = *in_x17;
    while( true ) {
      while( true ) {
        if (cVar6 != '\0') {
          *(undefined1 *)(unaff_x24 + 0x493) = 0;
        }
        in_x9 = in_x9 + 1;
        param_1 = param_1 + 2;
        in_x11 = in_x11 + 8;
        in_x12 = in_x12 + 4;
        if (in_x9 == 5) {
          func_0x000c3cec();
          func_0x000c3560();
          lVar18 = lRam0000000000a334c0;
          pfVar1 = (float *)(&UNK_00004028 + lRam0000000000a334c0);
          if ((int)*(uint *)(&UNK_00004ad0 + lRam0000000000a334c0) < 1) goto code_r0x000c7cd4;
          uVar11 = (ulong)*(uint *)(&UNK_00004ad0 + lRam0000000000a334c0) + 1;
          goto code_r0x000c7cb8;
        }
        lVar18 = unaff_x22 + in_x12;
        if (*(char *)(unaff_x22 + in_x9 + 0xe48) != '\0') break;
        pcVar17 = (char *)(in_x10 + in_x9 + -5);
        *pcVar17 = '\0';
        *(undefined2 *)(in_x10 + param_1 + 5) = 0;
        fVar23 = *(float *)(lVar18 + -0x28);
        *(bool *)(in_x10 + in_x9 + 0x19) = 0.0 <= fVar23;
        *(float *)(lVar18 + -0x14) = fVar23;
        *(undefined4 *)(lVar18 + -0x28) = in_w13;
        *(undefined1 *)(in_x10 + in_x9) = 0;
        cVar6 = *pcVar17;
      }
      fVar23 = *(float *)(lVar18 + -0x28);
      in_x17 = (char *)(unaff_x22 + in_x9 + in_x14);
      *(bool *)(in_x10 + in_x9 + -5) = fVar23 < 0.0;
      param_5 = in_x10 + param_1;
      *(undefined2 *)(param_5 + 5) = 0;
      *(undefined1 *)(in_x10 + in_x9 + 0x19) = 0;
      *(float *)(lVar18 + -0x14) = fVar23;
      if (fVar23 < 0.0) break;
      *(float *)(lVar18 + -0x28) = fVar23 + *(float *)(unaff_x22 + 0x18);
      fVar23 = 0.0;
      bVar5 = true;
      bVar7 = false;
      if (in_w15 <= fVar22) {
        bVar5 = false;
        bVar7 = true;
        if (!NAN(fVar20) && !NAN(in_w15)) {
          bVar5 = fVar20 < in_w15;
          bVar7 = false;
        }
      }
      if (bVar5 == bVar7) {
        fVar23 = fVar22 - *(float *)(in_x10 + in_x11 + -0x2d);
        fVar26 = fVar20 - *(float *)(in_x10 + param_1 * 4 + -0x51);
        fVar23 = fVar26 * fVar26 + fVar23 * fVar23;
      }
      fVar26 = *(float *)(unaff_x22 + in_x12);
      if (*(float *)(unaff_x22 + in_x12) < fVar23) {
        fVar26 = fVar23;
      }
      *(float *)(unaff_x22 + in_x12) = fVar26;
      *(undefined1 *)(in_x10 + in_x9) = 0;
      cVar6 = *in_x17;
    }
    *(undefined4 *)(lVar18 + -0x28) = 0;
    param_4 = *(double *)(&UNK_00003f50 + unaff_x22);
    param_6 = in_x10 + in_x9 * 8;
    if ((float)(param_4 - *(double *)(param_6 + -0x2d)) < *(float *)(unaff_x22 + 100)) {
      fVar23 = 0.0;
      if (fVar22 < in_w15) {
        if (0.0 < *(float *)(unaff_x22 + 0x68) * *(float *)(unaff_x22 + 0x68)) break;
      }
      else {
        fVar26 = 0.0;
        if (in_w15 <= fVar20) {
          fVar23 = fVar22 - *(float *)(in_x10 + in_x11 + -0x2d);
          fVar26 = fVar20 - *(float *)(in_x10 + param_1 * 4 + -0x51);
        }
        if (fVar26 * fVar26 + fVar23 * fVar23 <
            *(float *)(unaff_x22 + 0x68) * *(float *)(unaff_x22 + 0x68)) break;
      }
    }
    *(undefined2 *)(in_x10 + param_1 + 0xf) = in_w16;
  } while( true );
  param_7 = in_x10 + param_1;
  goto code_r0x000c7b88;
  while (uVar11 = uVar11 - 1, 1 < uVar11) {
code_r0x000c7cb8:
    lVar16 = *(long *)(*(long *)(&UNK_00004ad8 + lRam0000000000a334c0) +
                       (ulong)((int)uVar11 - 2) * 0x38 + 8);
    if ((lVar16 != 0) && ((*(byte *)(lVar16 + 0x17) >> 3 & 1) != 0)) goto code_r0x000c7ce8;
  }
code_r0x000c7cd4:
  if ((*(long *)(&UNK_00004d10 + unaff_x26) == 0) || (*(float *)(unaff_x20 + 0x27c) <= 0.0)) {
    fVar20 = *(float *)(unaff_x20 + 0x298) + *(float *)(unaff_x26 + 0x18) * -10.0;
    if (fVar20 < 0.0) {
      fVar20 = 0.0;
    }
  }
  else {
code_r0x000c7ce8:
    fVar20 = (float)NEON_fminnm(*(float *)(unaff_x20 + 0x298) + *(float *)(unaff_x26 + 0x18) * 6.0,
                                0x3f800000);
  }
  *(float *)(unaff_x20 + 0x298) = fVar20;
  in_stack_00000048[0x30] = 0;
  *(undefined4 *)(unaff_x27 + 0x350) = 0xffffffff;
  *(undefined8 *)(&UNK_00006208 + unaff_x26) = 0xffffffffffffffff;
  uVar8 = *(undefined8 *)(unaff_x27 + 0x78);
  *(undefined8 *)(&UNK_00005f50 + unaff_x26) = *(undefined8 *)(unaff_x27 + 0x80);
  *(undefined8 *)(&UNK_00005f48 + unaff_x26) = uVar8;
  *(undefined1 *)(unaff_x27 + 0x78) = 0;
  plVar19 = *(long **)(&UNK_00004020 + lVar18);
  lVar16 = lVar18;
  if (plVar19 != (long *)0x0) {
    fVar20 = *(float *)(&UNK_00004038 + lVar18) - *(float *)(lVar18 + 0x18);
    *(float *)(&UNK_00004038 + lVar18) = fVar20;
    if ((((-256000.0 <= *(float *)(lVar18 + 0xe40)) && (-256000.0 <= *(float *)(lVar18 + 0xe44))) &&
        (fVar22 = *(float *)(lVar18 + 0xe40) - *pfVar1,
        fVar23 = *(float *)(lVar18 + 0xe44) - *(float *)(&UNK_0000402c + lVar18),
        *(float *)(lVar18 + 0x6c) * *(float *)(lVar18 + 0x6c) < fVar23 * fVar23 + fVar22 * fVar22))
       || (fVar20 <= 0.0)) {
      *(undefined4 *)(&UNK_00004038 + lVar18) = 0;
      if (((byte)(&UNK_0000603c)[lVar18] >> 6 & 1) != 0) {
        func_0x000bae48("[io] LockWheelingWindow() \"%s\"\n");
        lVar16 = lRam0000000000a334c0;
      }
      plVar19 = (long *)0x0;
      *(undefined8 *)(&UNK_00004020 + lVar18) = 0;
      *(undefined8 *)(&UNK_00004028 + lVar18) = *(undefined8 *)(lVar18 + 0xe40);
      *(undefined4 *)(&UNK_00004030 + lVar18) = 0xffffffff;
      *(undefined4 *)(&UNK_00004044 + lVar18) = 0;
      *(undefined4 *)(&UNK_00004048 + lVar18) = 0;
    }
  }
  fVar22 = 0.0;
  fVar20 = 0.0;
  plVar10 = plVar19;
  if (*(int *)(&UNK_000047c4 + lVar16) == -1) {
    fVar20 = *(float *)(lVar18 + 0xe54);
    if (*(int *)(&UNK_000047d0 + lVar16) == -1) goto code_r0x000c7e4c;
code_r0x000c7e30:
    if (plVar19 != (long *)0x0) goto code_r0x000c7e60;
code_r0x000c7e58:
    plVar10 = *(long **)(&UNK_00004008 + lVar18);
    if (*(long **)(&UNK_00004008 + lVar18) != (long *)0x0) goto code_r0x000c7e60;
  }
  else {
    if (*(int *)(&UNK_000047d0 + lVar16) != -1) goto code_r0x000c7e30;
code_r0x000c7e4c:
    fVar22 = *(float *)(lVar18 + 0xe50);
    if (plVar19 == (long *)0x0) goto code_r0x000c7e58;
code_r0x000c7e60:
    if (*(char *)((long)plVar10 + 0xc1) == '\0') {
      if (fVar22 == 0.0) {
        if (*(char *)(lVar18 + 0xe5c) == '\0') goto code_r0x000c82f8;
      }
      else if (*(char *)(lVar18 + 0xe5c) == '\0') {
code_r0x000c82f8:
        fVar23 = fVar22;
        if ((&UNK_0000388d)[lVar18] != '\0') {
          fVar23 = 0.0;
          fVar20 = fVar22;
        }
        fVar22 = (*(float *)(&UNK_00004044 + lVar18) - *(float *)(&UNK_00004044 + lVar18) / 30.0) +
                 ABS(fVar20) / 30.0;
        fVar26 = ABS(fVar23) / 30.0 +
                 (*(float *)(&UNK_00004048 + lVar18) - *(float *)(&UNK_00004048 + lVar18) / 30.0);
        *(float *)(&UNK_00004044 + lVar18) = fVar22;
        *(float *)(&UNK_00004048 + lVar18) = fVar26;
        fVar20 = fVar20 + *(float *)(&UNK_0000403c + lVar18);
        fVar23 = fVar23 + *(float *)(&UNK_00004040 + lVar18);
        *(undefined4 *)(&UNK_0000403c + lVar18) = 0;
        *(undefined4 *)(&UNK_00004040 + lVar18) = 0;
        lVar16 = lRam0000000000a334c0;
        if ((fVar20 != 0.0) || (fVar23 != 0.0)) {
          if (plVar19 == (long *)0x0) {
            if (fVar20 == 0.0) {
              if (fVar23 == 0.0) goto code_r0x000c7e68;
              plVar19 = (long *)0x0;
              plVar10 = *(long **)(&UNK_00004008 + lRam0000000000a334c0);
              uVar12 = *(uint *)((long)plVar10 + 0x14);
            }
            else {
              plVar10 = *(long **)(&UNK_00004008 + lRam0000000000a334c0);
              uVar12 = *(uint *)((long)plVar10 + 0x14);
              plVar19 = plVar10;
              if ((uVar12 >> 0x18 & 1) != 0) {
                uVar15 = uVar12;
                do {
                  if (((uVar15 & 0x210) != 0x10) && (*(float *)((long)plVar19 + 0x94) != 0.0))
                  break;
                  plVar19 = (long *)plVar19[0x6f];
                  uVar15 = *(uint *)((long)plVar19 + 0x14);
                } while ((uVar15 >> 0x18 & 1) != 0);
              }
              if (fVar23 == 0.0) goto code_r0x000c836c;
            }
            uVar15 = uVar12 & 0x1000000;
            while ((uVar15 != 0 &&
                   (((uVar12 & 0x210) == 0x10 || (*(float *)(plVar10 + 0x13) == 0.0))))) {
              plVar10 = (long *)plVar10[0x6f];
              uVar12 = *(uint *)((long)plVar10 + 0x14);
              uVar15 = uVar12 >> 0x18 & 1;
            }
            if ((fVar23 != 0.0 && plVar19 != (long *)0x0) && plVar19 != plVar10) {
              iVar9 = *(int *)(&UNK_00004030 + lRam0000000000a334c0);
              iVar13 = *(int *)(&UNK_00003f58 + lRam0000000000a334c0);
              if (iVar9 == -1) {
                *(int *)(&UNK_00004030 + lRam0000000000a334c0) = iVar13;
                iVar9 = iVar13;
              }
              if ((fVar20 == 0.0) || (iVar9 != iVar13)) {
                if (*(float *)(&UNK_00004044 + lVar16) != *(float *)(&UNK_00004048 + lVar16)) {
                  if (*(float *)(&UNK_00004044 + lVar16) <= *(float *)(&UNK_00004048 + lVar16)) {
                    plVar19 = plVar10;
                  }
                  goto code_r0x000c836c;
                }
              }
              *(float *)(&UNK_0000403c + lVar16) = fVar20;
              *(float *)(&UNK_00004040 + lVar16) = fVar23;
              goto code_r0x000c7e68;
            }
            plVar19 = plVar10;
          }
code_r0x000c836c:
          if ((*(ushort *)((long)plVar19 + 0x14) & 0x210) == 0) {
            if (fVar20 == 0.0) {
              cVar6 = false;
            }
            else {
              cVar6 = *(float *)((long)plVar19 + 0x94) != 0.0;
            }
            *(char *)(unaff_x29 + -0x78) = cVar6;
            if (fVar23 == 0.0) {
              *(undefined1 *)(unaff_x29 + -0x77) = 0;
            }
            else {
              fVar24 = *(float *)(plVar19 + 0x13);
              *(bool *)(unaff_x29 + -0x77) = fVar24 != 0.0;
              if (((bool)cVar6 != false) && (fVar24 != 0.0)) {
                *(undefined1 *)(unaff_x29 + -0x78 + (ulong)(fVar26 < fVar22)) = 0;
                cVar6 = *(char *)(unaff_x29 + -0x78);
              }
            }
            if (cVar6 != '\0') {
              func_0x000eb200(plVar19);
              fVar22 = (*(float *)(plVar19 + 0x42) - *(float *)(plVar19 + 0x41)) * 0.67;
              fVar26 = *(float *)(&UNK_00003d3c + *plVar19) * *(float *)(plVar19 + 0x54);
              if (plVar19[0x6f] != 0) {
                fVar26 = fVar26 * *(float *)(plVar19[0x6f] + 0x2a0);
              }
              fVar24 = fVar26 + fVar26;
              if (fVar22 <= fVar26 + fVar26) {
                fVar24 = fVar22;
              }
              *(float *)((long)plVar19 + 0x9c) =
                   *(float *)((long)plVar19 + 0x8c) - (float)(int)fVar24 * fVar20;
              *(undefined4 *)((long)plVar19 + 0xa4) = 0;
              *(undefined4 *)((long)plVar19 + 0xac) = 0;
              *(undefined4 *)(&UNK_00004034 + lVar18) = *(undefined4 *)(&UNK_00003f58 + lVar18);
            }
            if (*(char *)(unaff_x29 + -0x77) != '\0') {
              func_0x000eb200(plVar19);
              fVar20 = (*(float *)((long)plVar19 + 0x214) - *(float *)((long)plVar19 + 0x20c)) *
                       0.67;
              fVar22 = *(float *)(&UNK_00003d3c + *plVar19) * *(float *)(plVar19 + 0x54);
              if (plVar19[0x6f] != 0) {
                fVar22 = fVar22 * *(float *)(plVar19[0x6f] + 0x2a0);
              }
              fVar26 = fVar22 * 5.0;
              if (fVar20 <= fVar22 * 5.0) {
                fVar26 = fVar20;
              }
              *(float *)(plVar19 + 0x14) = *(float *)(plVar19 + 0x12) - (float)(int)fVar26 * fVar23;
              *(undefined4 *)(plVar19 + 0x15) = 0;
              *(undefined4 *)(plVar19 + 0x16) = 0;
              *(undefined4 *)(&UNK_00004034 + lVar18) = *(undefined4 *)(&UNK_00003f58 + lVar18);
            }
          }
        }
      }
      else if (*(char *)(lVar18 + 0x44) != '\0') {
        fVar20 = (float)NEON_fminnm(*(float *)(&UNK_00004038 + lVar16) + ABS(fVar22) * 0.7,
                                    0x3f333333);
        *(float *)(&UNK_00004038 + lVar16) = fVar20;
        if (*(long **)(&UNK_00004020 + lVar16) != plVar10) {
          if (((byte)(&UNK_0000603c)[lVar16] >> 6 & 1) != 0) {
            func_0x000bae48("[io] LockWheelingWindow() \"%s\"\n");
          }
          *(long **)(&UNK_00004020 + lVar16) = plVar10;
          *(undefined8 *)(&UNK_00004028 + lVar16) = *(undefined8 *)(lVar16 + 0xe40);
        }
        fVar22 = *(float *)(plVar10 + 0x54);
        fVar23 = fVar22 + *(float *)(lVar18 + 0xe50) * 0.1;
        fVar20 = 2.5;
        if (fVar23 <= 2.5) {
          fVar20 = fVar23;
        }
        fVar26 = 0.5;
        if (0.5 <= fVar23) {
          fVar26 = fVar20;
        }
        *(float *)(plVar10 + 0x54) = fVar26;
        if (plVar10 == (long *)plVar10[0x71]) {
          fVar26 = fVar26 / fVar22;
          fVar20 = (float)plVar10[6];
          fVar22 = (float)((ulong)plVar10[6] >> 0x20);
          uVar8 = *(undefined8 *)(lVar18 + 0xe40);
          fVar23 = (float)plVar10[5];
          fVar24 = (float)((ulong)plVar10[5] >> 0x20);
          *(uint *)(plVar10 + 0x1d) = *(uint *)(plVar10 + 0x1d) & 0xfffffff1;
          *(undefined8 *)((long)plVar10 + 0xec) = 0x7f7fffff7f7fffff;
          lVar18 = NEON_scvtf(CONCAT44((int)(fVar24 + (fVar22 * (1.0 - fVar26) *
                                                      ((float)((ulong)uVar8 >> 0x20) - fVar24)) /
                                                      fVar22),
                                       (int)(fVar23 + (fVar20 * (1.0 - fVar26) *
                                                      ((float)uVar8 - fVar23)) / fVar20)),4);
          plVar10[5] = lVar18;
          fVar23 = (float)lVar18 - fVar23;
          fVar24 = (float)((ulong)lVar18 >> 0x20) - fVar24;
          if ((fVar23 != 0.0) || (fVar24 != 0.0)) {
            if (((*(byte *)((long)plVar10 + 0x15) & 1) == 0) &&
               (*(float *)(&UNK_00005f5c + lRam0000000000a334c0) <= 0.0)) {
              *(float *)(&UNK_00005f5c + lRam0000000000a334c0) =
                   *(float *)(lRam0000000000a334c0 + 0x1c);
            }
            plVar10[0x22] =
                 CONCAT44(fVar24 + (float)((ulong)plVar10[0x22] >> 0x20),
                          fVar23 + (float)plVar10[0x22]);
            plVar10[0x26] =
                 CONCAT44(fVar24 + (float)((ulong)plVar10[0x26] >> 0x20),
                          fVar23 + (float)plVar10[0x26]);
            plVar10[0x25] =
                 CONCAT44(fVar24 + (float)((ulong)plVar10[0x25] >> 0x20),
                          fVar23 + (float)plVar10[0x25]);
            plVar10[0x24] =
                 CONCAT44(fVar24 + (float)((ulong)plVar10[0x24] >> 0x20),
                          fVar23 + (float)plVar10[0x24]);
          }
          auVar21._0_4_ = (int)(fVar20 * fVar26);
          auVar21._4_4_ = (int)(fVar22 * fVar26);
          auVar21._8_4_ = (int)((float)plVar10[7] * fVar26);
          auVar21._12_4_ = (int)((float)((ulong)plVar10[7] >> 0x20) * fVar26);
          auVar21 = NEON_scvtf(auVar21,4);
          plVar10[7] = auVar21._8_8_;
          plVar10[6] = auVar21._0_8_;
        }
      }
    }
  }
code_r0x000c7e68:
  if (*(char *)(in_stack_00000050 + 0x20b) == '\0') {
    if (0.0 <= *(float *)(unaff_x26 + 0x60)) {
      fVar20 = (float)*(double *)(&UNK_00003f50 + unaff_x26) - *(float *)(unaff_x26 + 0x60);
      iVar9 = *(int *)(&UNK_00003fa0 + unaff_x26);
    }
    else {
      fVar20 = 3.4028235e+38;
      iVar9 = *(int *)(&UNK_00003fa0 + unaff_x26);
    }
  }
  else {
    fVar20 = 3.4028235e+38;
    iVar9 = *(int *)(&UNK_00003fa0 + unaff_x26);
  }
  if (iVar9 != 0) {
    plVar19 = *(long **)(&UNK_00003fa8 + unaff_x26);
    lVar18 = (long)iVar9 << 3;
    do {
      lVar16 = *plVar19;
      cVar6 = *(char *)(lVar16 + 0xbe);
      *(char *)(lVar16 + 0xbf) = cVar6;
      *(undefined1 *)(lVar16 + 0xbe) = 0;
      *(undefined1 *)(lVar16 + 0xc0) = 0;
      *(undefined2 *)(lVar16 + 0xce) = *(undefined2 *)(lVar16 + 0xcc);
      *(undefined2 *)(lVar16 + 0xcc) = 0;
      if (((cVar6 == '\0') && (*(char *)(lVar16 + 0x3fc) == '\0')) &&
         (*(float *)(lVar16 + 0x274) < fVar20)) {
        func_0x000c1cc8();
      }
      plVar19 = plVar19 + 1;
      lVar18 = lVar18 + -8;
    } while (lVar18 != 0);
  }
  iVar9 = in_stack_00000048[0xe];
  if (0 < iVar9) {
    lVar16 = 0;
    lVar18 = 0;
    do {
      fVar22 = *(float *)(*(long *)(&UNK_00004e68 + unaff_x26) + lVar18 * 4);
      bVar5 = false;
      if ((0.0 <= fVar22) && (bVar5 = false, !NAN(fVar22) && !NAN(fVar20))) {
        bVar5 = fVar22 < fVar20;
      }
      if (bVar5) {
        func_0x00134464(*(long *)(&UNK_00004e40 + unaff_x26) + lVar16);
        iVar9 = in_stack_00000048[0xe];
      }
      lVar18 = lVar18 + 1;
      lVar16 = lVar16 + 0x250;
    } while (lVar18 < iVar9);
  }
  if (*in_stack_00000048 != 0) {
    lVar18 = *(long *)(&UNK_00004e30 + unaff_x26);
    lVar16 = (long)*in_stack_00000048 * 0x78;
    do {
      fVar22 = *(float *)(lVar18 + 4);
      bVar5 = false;
      if ((0.0 <= fVar22) && (bVar5 = false, !NAN(fVar22) && !NAN(fVar20))) {
        bVar5 = fVar22 < fVar20;
      }
      if (bVar5) {
        func_0x00134568(lVar18);
      }
      lVar18 = lVar18 + 0x78;
      lVar16 = lVar16 + -0x78;
    } while (lVar16 != 0);
  }
  if (*(char *)(in_stack_00000050 + 0x20b) != '\0') {
    func_0x000c1b38();
  }
  *(undefined1 *)(in_stack_00000050 + 0x20b) = 0;
  if ((*(long *)(&UNK_00004b18 + unaff_x26) == 0) ||
     (*(char *)(*(long *)(&UNK_00004b18 + unaff_x26) + 0xbf) != '\0')) {
    if (-1 < *(int *)(&UNK_00003fd4 + unaff_x26)) goto code_r0x000c8164;
code_r0x000c8278:
    func_0x000ee530(&UNK_00003fd0 + unaff_x26,0);
    *(undefined4 *)(&UNK_00003fd0 + unaff_x26) = 0;
    if (in_stack_00000058[0xd] < 0) goto code_r0x000c8294;
code_r0x000c8170:
    in_stack_00000058[0xc] = 0;
    iVar9 = in_stack_00000058[1];
    if (-1 < iVar9) goto code_r0x000c817c;
code_r0x000c82ac:
    func_0x000eb9f0(in_stack_00000058,0);
    iVar9 = in_stack_00000058[1];
    *in_stack_00000058 = 0;
  }
  else {
    if (0 < *(int *)(&UNK_00003fb0 + lRam0000000000a334c0)) {
      lVar18 = (ulong)(*(int *)(&UNK_00003fb0 + lRam0000000000a334c0) - 1) << 3;
      do {
        lVar16 = *(long *)(*(long *)(&UNK_00003fb8 + lRam0000000000a334c0) + lVar18);
        if (((lVar16 != 0) && (*(char *)(lVar16 + 0xbf) != '\0')) &&
           (((*(uint *)(lVar16 + 0x14) ^ 0xffffffff) & 0x10200) != 0)) {
          func_0x000c3098(lVar16,1);
          iVar9 = *(int *)(&UNK_00003fd4 + unaff_x26);
          goto joined_r0x000c8274;
        }
        bVar5 = lVar18 != 0;
        lVar18 = lVar18 + -8;
      } while (bVar5);
    }
    func_0x000c3098(0,1);
    iVar9 = *(int *)(&UNK_00003fd4 + unaff_x26);
joined_r0x000c8274:
    if (iVar9 < 0) goto code_r0x000c8278;
code_r0x000c8164:
    *(undefined4 *)(&UNK_00003fd0 + unaff_x26) = 0;
    if (-1 < in_stack_00000058[0xd]) goto code_r0x000c8170;
code_r0x000c8294:
    func_0x000eadcc(in_stack_00000058 + 0xc,0);
    in_stack_00000058[0xc] = 0;
    iVar9 = in_stack_00000058[1];
    if (iVar9 < 0) goto code_r0x000c82ac;
code_r0x000c817c:
    *in_stack_00000058 = 0;
  }
  iVar13 = 0;
  if (iVar9 == 0) {
    func_0x000eb9f0(in_stack_00000058,8);
    iVar13 = *in_stack_00000058;
  }
  *(undefined4 *)(*(long *)(&UNK_00004ab8 + unaff_x26) + (long)iVar13 * 4) = 0;
  *in_stack_00000058 = *in_stack_00000058 + 1;
  if (in_stack_00000058[5] < 0) {
    func_0x000eadcc(in_stack_00000058 + 4,0);
  }
  in_stack_00000058[4] = 0;
  lVar18 = lRam0000000000a334c0;
  pcVar17 = &UNK_00006075 + lRam0000000000a334c0;
  *(undefined4 *)(&UNK_00006078 + lRam0000000000a334c0) = 0;
  if (*pcVar17 != '\0') {
    iVar9 = *(int *)(&UNK_00004054 + lVar18);
    *(undefined4 *)(&UNK_00004ee8 + lVar18) = 7;
    if ((&UNK_00002f44)[lVar18] != '\0') {
      fVar20 = *(float *)(&UNK_00002f48 + lVar18);
      if (0.0 <= fVar20) {
        if (fVar20 == 0.0) goto code_r0x000c820c;
        fVar22 = *(float *)(lVar18 + 0x70);
        if ((fVar22 < fVar20) && (fVar23 = fVar20 - *(float *)(lVar18 + 0x18), fVar23 < fVar20)) {
          fVar26 = *(float *)(lVar18 + 0x74);
          if (fVar26 <= 0.0) {
            if ((fVar22 <= fVar20) && (fVar23 < fVar22)) goto code_r0x000c820c;
          }
          else {
            if (fVar22 <= fVar23) {
              iVar13 = (int)((fVar23 - fVar22) / fVar26);
            }
            else {
              iVar13 = -1;
            }
            if (fVar22 <= fVar20) {
              iVar14 = (int)((fVar20 - fVar22) / fVar26);
            }
            else {
              iVar14 = -1;
            }
            if (iVar13 < iVar14) {
code_r0x000c820c:
              if ((&UNK_00004184)[lVar18] == '\0') {
                *pcVar17 = '\0';
              }
            }
          }
        }
      }
    }
    iVar13 = *(int *)(lVar18 + 0xe60);
    if (iVar13 == 0x3000) {
      if (((*(char *)(lVar18 + 0xe48) != '\0') && (*(float *)(&UNK_00003890 + lVar18) == 0.0)) &&
         ((&UNK_00004790)[lVar18] == '\0')) {
        (&UNK_00006076)[lVar18] = 0;
      }
      if (((*(char *)(lVar18 + 0xe49) != '\0') && (*(float *)(&UNK_00003894 + lVar18) == 0.0)) &&
         ((&UNK_0000479c)[lVar18] == '\0')) {
        (&UNK_00006076)[lVar18] = 1;
      }
      if (((*(char *)(lVar18 + 0xe4a) != '\0') && (*(float *)(&UNK_00003898 + lVar18) == 0.0)) &&
         ((&UNK_000047a8)[lVar18] == '\0')) {
        (&UNK_00006076)[lVar18] = 2;
      }
    }
    else {
      uVar11 = (ulong)(byte)(&UNK_00006076)[lVar18];
      if ((*(char *)(lVar18 + uVar11 + 0xe48) != '\0') &&
         (*(float *)(&UNK_00003890 + lVar18 + uVar11 * 4) == 0.0)) {
        if ((byte)(&UNK_00006076)[lVar18] < 0xb) {
          bVar5 = (&UNK_00004790)[lVar18 + uVar11 * 0xc] == '\0';
        }
        else {
          bVar5 = true;
        }
        if ((bVar5) && (iVar9 != 0)) {
          *(int *)(&UNK_00006078 + lVar18) = iVar9;
          *pcVar17 = '\0';
        }
      }
    }
    *(uint *)(&UNK_000049f8 + lVar18) = *(uint *)(&UNK_000049f8 + lVar18) | 0x40;
    *(undefined4 *)(&UNK_00004a58 + lVar18) = 0x3f333333;
    func_0x000d8e98(0,0);
    func_0x0010adc0("HoveredId: 0x%08X");
    func_0x0010adc0("Press ESC to abort picking.");
    if (iVar13 == 0x3000) {
      func_0x0010adc0("Remap w/ Ctrl+Shift: click anywhere to select new mouse button.");
    }
    else {
      func_0x0010ae94(&UNK_000039cc + lRam0000000000a334c0 + (ulong)(iVar9 == 0) * 0x10,
                      "Click %s Button to break in debugger! (remap w/ Ctrl+Shift)");
    }
    func_0x000cea90();
    lVar18 = lRam0000000000a334c0;
  }
  piVar2 = (int *)(&UNK_0000404c + lVar18);
  *piVar2 = 0;
  if (*(int *)(&UNK_00003f58 + lVar18) != *(int *)(&UNK_000060a8 + lVar18) + 1)
  goto code_r0x000c8960;
  iVar9 = *(int *)(&UNK_00004054 + lVar18);
  if (iVar9 == 0) {
    iVar9 = *(int *)(&UNK_00004064 + lVar18);
    if (*(int *)(&UNK_000060b0 + lVar18) != iVar9) goto code_r0x000c88c8;
  }
  else if (*(int *)(&UNK_000060b0 + lVar18) != iVar9) {
code_r0x000c88c8:
    *(undefined4 *)(&UNK_000060ac + lVar18) = 0xffffffff;
    *(int *)(&UNK_000060b0 + lVar18) = iVar9;
    if (*(int *)(&UNK_000060bc + lVar18) < 0) {
      func_0x000eb834(&UNK_000060b8 + lVar18,0);
    }
    *(undefined4 *)(&UNK_000060b8 + lVar18) = 0;
  }
  if (iVar9 != 0) {
    uVar12 = *(uint *)(&UNK_000060ac + lVar18);
    if ((int)uVar12 < 0) {
      if (uVar12 == 0xffffffff) {
        *piVar2 = iVar9;
      }
    }
    else {
      if (((int)uVar12 < *(int *)(&UNK_000060b8 + lVar18)) &&
         ((lVar16 = *(long *)(&UNK_000060c0 + lVar18) + (ulong)uVar12 * 0x40,
          *(char *)(lVar16 + 5) != '\0' || ('\x02' < *(char *)(lVar16 + 4))))) {
        uVar12 = uVar12 + 1;
        *(uint *)(&UNK_000060ac + lVar18) = uVar12;
      }
      if ((int)uVar12 < *(int *)(&UNK_000060b8 + lVar18)) {
        piVar3 = (int *)(*(long *)(&UNK_000060c0 + lVar18) + (ulong)uVar12 * 0x40);
        *piVar2 = *piVar3;
        *(char *)(piVar3 + 1) = (char)piVar3[1] + '\x01';
      }
    }
  }
code_r0x000c8960:
  lVar18 = lRam0000000000a334c0;
  piVar2 = (int *)(&UNK_00004a6c + lRam0000000000a334c0);
  if (0.0 < *(float *)(&UNK_0000607c + lRam0000000000a334c0)) {
    fVar20 = (float)_cosf(*(float *)(&UNK_0000607c + lRam0000000000a334c0) * 6.0,0x40c00000);
    iVar9 = *piVar2;
    lVar16 = lVar18 + (long)iVar9 * 0x10;
    fVar22 = (float)_fmodf(fVar20 * 0.5 + 0.5,0x3f800000);
    fVar22 = fVar22 / 0.16666667;
    fVar23 = ((fVar22 - (float)(int)fVar22) * -0.5 + 1.0) * 0.5;
    fVar20 = 0.5;
    if ((uint)(int)fVar22 < 5) {
      fVar25 = ((1.0 - (fVar22 - (float)(int)fVar22)) * -0.5 + 1.0) * 0.5;
      fVar24 = 0.25;
      fVar26 = fVar25;
      switch((int)fVar22) {
      case 1:
        fVar26 = 0.5;
        fVar20 = fVar23;
        break;
      case 2:
        fVar26 = 0.5;
        fVar20 = 0.25;
        fVar24 = fVar25;
        break;
      case 3:
        fVar26 = fVar23;
        fVar20 = 0.25;
        fVar24 = 0.5;
        break;
      case 4:
        fVar26 = 0.25;
        fVar20 = fVar25;
        fVar24 = 0.5;
      }
    }
    else {
      fVar26 = 0.25;
      fVar24 = fVar23;
    }
    *(float *)(&UNK_000039cc + lVar16) = fVar20;
    *(float *)(&UNK_000039d0 + lVar16) = fVar26;
    *(float *)(&UNK_000039d4 + lVar16) = fVar24;
    *(undefined4 *)(&UNK_000039d8 + lVar18 + (long)iVar9 * 0x10) = 0x3f800000;
    fVar20 = *(float *)(&UNK_0000607c + lVar18) - *(float *)(lVar18 + 0x18);
    *(float *)(&UNK_0000607c + lVar18) = fVar20;
    if (fVar20 <= 0.0) {
      if (iVar9 != 0x35) {
        auVar21 = *(undefined1 (*) [16])(&UNK_00006080 + lVar18);
        *(long *)(&UNK_000039d4 + lVar16) = auVar21._8_8_;
        *(long *)(&UNK_000039cc + lVar16) = auVar21._0_8_;
      }
      *piVar2 = 0x35;
    }
  }
  cVar6 = *(char *)(unaff_x27 + 0x1ad);
  if ((cVar6 != '\0') && (*(char *)(unaff_x27 + 0x1ad) = cVar6 + -1, cVar6 == '\x01')) {
    *(undefined4 *)(in_stack_00000050 + 0xc24) = 0;
    *(undefined1 *)(unaff_x27 + 0x1ae) = 0;
  }
  cVar6 = *(char *)(unaff_x27 + 0x1ac);
  if (cVar6 != '\0') {
    *(char *)(unaff_x27 + 0x1ac) = cVar6 + -1;
    if (cVar6 == '\x01') {
      func_0x000bae48("(Debug Log: Auto-disabled some ImGuiDebugLogFlags after 2 frames)\n");
      *(uint *)(unaff_x27 + 0x17c) =
           *(uint *)(unaff_x27 + 0x17c) & (*(uint *)(unaff_x27 + 0x1a8) ^ 0xffffffff);
      *(undefined4 *)(unaff_x27 + 0x1a8) = 0;
      lVar18 = lRam0000000000a334c0;
    }
  }
  *(undefined1 *)(in_stack_00000050 + 0x209) = 1;
  *(uint *)(&UNK_000049f8 + lVar18) = *(uint *)(&UNK_000049f8 + lVar18) | 2;
  *(undefined8 *)(&UNK_00004a18 + lVar18) = 0x43c8000043c80000;
  *(undefined4 *)(&UNK_00004a00 + lVar18) = 4;
  func_0x000c9774("Debug##Default",0,0);
  if (*(char *)(unaff_x26 + 0x7a) == '\0') {
    *(undefined1 *)(unaff_x27 + 0x1b4) = 0xff;
    iVar9 = *(int *)(unaff_x27 + 0xe0);
  }
  else {
    iVar9 = (int)*(char *)(unaff_x27 + 0x1b4);
    if (iVar9 == -1) {
      *(undefined1 *)(unaff_x27 + 0x1b4) = 0;
      iVar9 = *(int *)(unaff_x27 + 0xe0);
    }
    else {
      if (((&UNK_00003f58)[unaff_x26] & 3) == 0) {
        iVar9 = *(char *)(unaff_x27 + 0x1b4) + 1;
      }
      *(char *)(unaff_x27 + 0x1b4) =
           (char)iVar9 + ((char)(iVar9 * 0x6667 >> 0x12) - (char)(iVar9 * 0x6667 >> 0x1f)) * -10;
      iVar9 = *(int *)(unaff_x27 + 0xe0);
    }
  }
  if (iVar9 != 0) {
    lVar18 = *(long *)(&UNK_00005fa8 + unaff_x26);
    lVar16 = (long)iVar9 << 5;
    do {
      if (*(int *)(lVar18 + 4) == 1) {
        (**(code **)(lVar18 + 0x10))();
      }
      lVar18 = lVar18 + 0x20;
      lVar16 = lVar16 + -0x20;
    } while (lVar16 != 0);
  }
  return;
}

