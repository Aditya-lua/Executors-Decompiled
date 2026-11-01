
void FUN_001309d4(undefined1 param_1 [16],undefined8 *param_2,float *param_3,long param_4,
                 undefined8 param_5,undefined8 param_6,ulong param_7)

{
  uint uVar1;
  uint uVar2;
  byte bVar3;
  ushort uVar4;
  byte bVar5;
  uint uVar6;
  bool bVar7;
  ulong uVar8;
  undefined8 *puVar9;
  undefined4 *puVar10;
  undefined4 *puVar11;
  ulong uVar12;
  float *pfVar13;
  uint *puVar14;
  undefined8 *puVar15;
  ulong uVar16;
  long lVar17;
  undefined8 *puVar18;
  int iVar19;
  float *pfVar20;
  ulong uVar21;
  long lVar22;
  float *pfVar23;
  uint in_w8;
  long in_x9;
  ulong in_x10;
  uint uVar24;
  int iVar25;
  long in_x11;
  uint in_w12;
  ulong in_x13;
  long in_x14;
  ulong uVar26;
  uint *puVar27;
  int in_w15;
  undefined2 in_w16;
  long in_x17;
  long unaff_x19;
  ulong unaff_x21;
  long unaff_x23;
  int unaff_w24;
  int unaff_w25;
  int unaff_w26;
  long unaff_x28;
  long unaff_x29;
  undefined4 uVar28;
  undefined8 uVar29;
  float fVar30;
  float fVar31;
  undefined8 uVar32;
  undefined8 uVar33;
  float fVar34;
  float fVar35;
  float fVar36;
  float fVar37;
  float fVar38;
  float fVar39;
  undefined8 uVar40;
  undefined8 uVar41;
  undefined8 uVar42;
  undefined8 uVar43;
  undefined8 uVar44;
  undefined8 uVar45;
  undefined8 uVar46;
  undefined8 uVar47;
  undefined8 uVar48;
  undefined8 uVar49;
  undefined8 uVar50;
  undefined8 uVar51;
  undefined8 uVar52;
  uint *in_stack_00000010;
  long in_stack_00000018;
  int in_stack_00000020;
  long in_stack_00000028;
  undefined1 uStack0000000000000030;
  undefined1 uStack0000000000000034;
  undefined1 uStack0000000000000038;
  undefined1 uStack000000000000003c;
  undefined1 uStack0000000000000040;
  undefined1 uStack0000000000000048;
  
code_r0x001309d4:
  do {
    in_w8 = in_w15 << (ulong)((uint)param_7 & 0x1f) | in_w8;
    do {
      do {
        do {
          if (0 < unaff_w24) {
            uVar4 = *(ushort *)(param_2 + 0xc);
            puVar27 = (uint *)(param_4 + (ulong)uVar4 * 0x20);
            uVar24 = *puVar27;
            uVar6 = uVar24 - 1;
            if (0 < (int)uVar24) {
              pfVar13 = *(float **)(puVar27 + 2);
              if ((*(int *)((long)pfVar13 + (ulong)uVar6 * (in_x13 & 0xffffffff) + 0x20) == 0) &&
                 (*(long *)((long)pfVar13 + (ulong)uVar6 * (in_x13 & 0xffffffff) + 0x28) == 0)) {
                *puVar27 = uVar6;
                uVar24 = uVar6;
              }
              if (uVar24 == 1) {
                if ((*(byte *)((long)param_2 + 1) & 1) == 0) {
                  fVar30 = *param_3;
                  if (unaff_w24 < 1) {
                    if (fVar30 < *(float *)(param_2 + 9)) {
                      fVar30 = *(float *)(param_2 + 9);
                    }
                    if (fVar30 <= *(float *)(param_2 + 5)) goto LAB_00130a6c;
                  }
                  else if (fVar30 <= *(float *)(param_2 + 5)) goto LAB_00130a6c;
                }
                else {
LAB_00130a6c:
                  if (unaff_w25 < 1) {
                    uVar8 = 3;
                    param_3 = (float *)(in_x14 + 0x60);
                    pfVar20 = (float *)(in_x14 + 0x70);
                    fVar30 = *pfVar20;
                    if (fVar30 != 0.0) goto LAB_00130a98;
LAB_00130abc:
                    *(long *)(param_3 + 2) = param_1._8_8_;
                    *(long *)param_3 = param_1._0_8_;
                    fVar31 = 3.4028235e+38;
                  }
                  else {
                    uVar8 = (ulong)((long)in_x10 < (long)*(short *)(unaff_x19 + 0x22c) ^ 1 | 2);
                    param_3 = (float *)(in_x14 + uVar8 * 0x20);
                    pfVar20 = param_3 + 4;
                    fVar30 = *pfVar20;
                    if (fVar30 == 0.0) goto LAB_00130abc;
LAB_00130a98:
                    fVar31 = *param_3;
                  }
                  lVar22 = *(long *)(in_x14 + uVar8 * 0x20 + 0x18);
                  uVar16 = (ulong)(uVar4 >> 3) & 0x1ffc;
                  *(uint *)(lVar22 + uVar16) =
                       *(uint *)(lVar22 + uVar16) | in_w15 << (ulong)(uVar4 & 0x1f);
                  *pfVar20 = (float)((int)fVar30 + 1);
                  if (fVar31 <= *pfVar13) {
                    fVar34 = pfVar13[1];
                    fVar31 = pfVar13[2];
                    fVar30 = pfVar13[3];
                    if (param_3[1] <= fVar34) goto LAB_00130b14;
LAB_00130b48:
                    param_3[1] = fVar34;
                    if (param_3[2] < fVar31) goto LAB_00130b20;
LAB_00130b58:
                    if (param_3[3] < fVar30) goto LAB_00130b64;
                  }
                  else {
                    *param_3 = *pfVar13;
                    fVar34 = pfVar13[1];
                    fVar31 = pfVar13[2];
                    fVar30 = pfVar13[3];
                    if (fVar34 < param_3[1]) goto LAB_00130b48;
LAB_00130b14:
                    if (fVar31 <= param_3[2]) goto LAB_00130b58;
LAB_00130b20:
                    param_3[2] = fVar31;
                    if (param_3[3] < fVar30) {
LAB_00130b64:
                      param_3[3] = fVar30;
                    }
                  }
                  param_2 = (undefined8 *)(ulong)(uint)(in_w15 << uVar8);
                  in_w8 = in_w15 << uVar8 | in_w8;
                }
              }
            }
          }
          *(undefined2 *)(in_x17 + in_x9 + 0x5c) = in_w16;
          do {
            in_x10 = in_x10 + 1;
            in_x9 = in_x9 + 0x70;
            if ((long)*(int *)(unaff_x19 + 0x6c) <= (long)in_x10) {
              if (in_w8 == 0) {
                if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
                  return;
                }
              }
              else {
                iVar25 = *(int *)(unaff_x23 + 4);
                uVar6 = iVar25 - 2;
                uVar24 = in_stack_00000010[1];
                if ((int)uVar24 < (int)uVar6) {
                  uVar1 = uVar24;
                  if ((int)uVar24 < 0) {
                    uVar1 = uVar24 + 1;
                  }
                  uVar2 = 8;
                  if (uVar24 != 0) {
                    uVar2 = uVar24 + ((int)uVar1 >> 1);
                  }
                  if ((int)uVar2 <= (int)uVar6) {
                    uVar2 = uVar6;
                  }
                  puVar9 = (undefined8 *)
                           func_0x000b810c(-(ulong)(uVar2 >> 0x1f) & 0xffffffe000000000 |
                                           (ulong)uVar2 << 5);
                  if (*(long *)(&UNK_00004e78 + in_stack_00000028) != 0) {
                    _memcpy(puVar9,*(long *)(&UNK_00004e78 + in_stack_00000028),
                            (long)(int)*in_stack_00000010 << 5);
                    func_0x000b83d4(*(undefined8 *)(&UNK_00004e78 + in_stack_00000028));
                  }
                  *(undefined8 **)(&UNK_00004e78 + in_stack_00000028) = puVar9;
                  in_stack_00000010[1] = uVar2;
                  iVar25 = *(int *)(unaff_x23 + 4);
                  *in_stack_00000010 = uVar6;
                }
                else {
                  puVar9 = *(undefined8 **)(&UNK_00004e78 + in_stack_00000028);
                  *in_stack_00000010 = uVar6;
                }
                if (2 < iVar25) {
                  uVar24 = 2;
                  do {
                    iVar19 = 0x20;
                    if ((int)(iVar25 - 1U) <= (int)(uVar24 | 0x1f)) {
                      iVar19 = (iVar25 - 1U & 0x1f) + 1;
                    }
                    uVar8 = -(ulong)((uint)((int)uVar24 >> 5) >> 0x1f) & 0xfffffffc00000000 |
                            (ulong)(uint)((int)uVar24 >> 5) << 2;
                    *(uint *)(unaff_x21 + uVar8) =
                         -1 << (ulong)(uVar24 & 0x1f) & ((uint)(-1L << iVar19) ^ 0xffffffff) |
                         *(uint *)(unaff_x21 + uVar8);
                    uVar24 = (uVar24 & 0xffffffe0) + 0x20;
                  } while ((int)uVar24 < iVar25);
                }
                uVar8 = 0;
                uVar16 = (ulong)(*(ushort *)(unaff_x19 + 0x234) >> 3) & 0x1ffc;
                *(uint *)(unaff_x21 + uVar16) =
                     *(uint *)(unaff_x21 + uVar16) &
                     (1 << (ulong)(*(ushort *)(unaff_x19 + 0x234) & 0x1f) ^ 0xffffffffU);
                iVar25 = -3;
                if (unaff_w24 < 1) {
                  iVar25 = -2;
                }
                iVar25 = *(int *)(unaff_x23 + 4) + iVar25;
                fVar30 = *(float *)(unaff_x19 + 0x160);
                fVar31 = *(float *)(unaff_x19 + 0x164);
                fVar34 = *(float *)(unaff_x19 + 0x168);
                fVar35 = *(float *)(unaff_x19 + 0x16c);
                uVar24 = in_stack_00000020 >> 5;
                if ((int)uVar24 < 2) {
                  uVar24 = 1;
                }
                uVar16 = (ulong)uVar24;
                uVar26 = uVar16 & 0x3fffff0;
                do {
                  lVar22 = uVar8 * 0x20;
                  uVar6 = *(uint *)(&uStack0000000000000040 + lVar22);
                  param_2 = (undefined8 *)(ulong)uVar6;
                  if (uVar6 != 0) {
                    bVar7 = (uVar8 & 1) != 0;
                    fVar37 = *(float *)(&uStack0000000000000030 + lVar22);
                    fVar36 = *(float *)(&uStack000000000000003c + lVar22);
                    fVar38 = fVar37;
                    if (fVar30 <= fVar37) {
                      fVar38 = fVar30;
                    }
                    if (0 < unaff_w25 && bVar7) {
                      fVar38 = fVar37;
                    }
                    uVar1 = (uint)(0 < unaff_w24) & (uint)uVar8 >> 1;
                    if (*(float *)(&uStack0000000000000034 + lVar22) < fVar31) {
                      uVar1 = 1;
                    }
                    fVar37 = *(float *)(&uStack0000000000000034 + lVar22);
                    if (uVar1 == 0) {
                      fVar37 = fVar31;
                    }
                    fVar39 = *(float *)(&uStack0000000000000038 + lVar22);
                    if (*(float *)(&uStack0000000000000038 + lVar22) < fVar34 && bVar7) {
                      fVar39 = fVar34;
                    }
                    if (((((uint)uVar8 >> 1 & 1) != 0) && ((*(byte *)(unaff_x19 + 6) >> 1 & 1) == 0)
                        ) && (fVar36 < fVar35)) {
                      fVar36 = fVar35;
                    }
                    if (-2 < unaff_w26) {
                      uVar12 = *(ulong *)(&uStack0000000000000048 + uVar8 * 0x20);
                      if ((uVar24 < 0x10) ||
                         ((unaff_x21 < uVar12 + uVar16 * 4 &&
                          (uVar12 < unaff_x28 + uVar16 * 4 + in_stack_00000018)))) {
                        uVar21 = 0;
                      }
                      else {
                        puVar15 = (undefined8 *)(uVar12 + 0x20);
                        puVar18 = (undefined8 *)(unaff_x28 + in_stack_00000018 + 0x20);
                        uVar21 = uVar26;
                        do {
                          uVar32 = puVar15[-3];
                          uVar29 = puVar15[-4];
                          uVar40 = puVar15[-1];
                          uVar33 = puVar15[-2];
                          uVar42 = puVar15[1];
                          uVar41 = *puVar15;
                          uVar44 = puVar15[3];
                          uVar43 = puVar15[2];
                          uVar46 = puVar18[-3];
                          uVar45 = puVar18[-4];
                          uVar48 = puVar18[-1];
                          uVar47 = puVar18[-2];
                          uVar50 = puVar18[1];
                          uVar49 = *puVar18;
                          uVar52 = puVar18[3];
                          uVar51 = puVar18[2];
                          puVar18[-3] = CONCAT17((byte)((ulong)uVar46 >> 0x38) &
                                                 ~(byte)((ulong)uVar32 >> 0x38),
                                                 CONCAT16((byte)((ulong)uVar46 >> 0x30) &
                                                          ~(byte)((ulong)uVar32 >> 0x30),
                                                          CONCAT15((byte)((ulong)uVar46 >> 0x28) &
                                                                   ~(byte)((ulong)uVar32 >> 0x28),
                                                                   CONCAT14((byte)((ulong)uVar46 >>
                                                                                  0x20) &
                                                                            ~(byte)((ulong)uVar32 >>
                                                                                   0x20),
                                                                            CONCAT13((byte)((ulong)
                                                  uVar46 >> 0x18) & ~(byte)((ulong)uVar32 >> 0x18),
                                                  CONCAT12((byte)((ulong)uVar46 >> 0x10) &
                                                           ~(byte)((ulong)uVar32 >> 0x10),
                                                           CONCAT11((byte)((ulong)uVar46 >> 8) &
                                                                    ~(byte)((ulong)uVar32 >> 8),
                                                                    (byte)uVar46 & ~(byte)uVar32))))
                                                  )));
                          puVar18[-4] = CONCAT17((byte)((ulong)uVar45 >> 0x38) &
                                                 ~(byte)((ulong)uVar29 >> 0x38),
                                                 CONCAT16((byte)((ulong)uVar45 >> 0x30) &
                                                          ~(byte)((ulong)uVar29 >> 0x30),
                                                          CONCAT15((byte)((ulong)uVar45 >> 0x28) &
                                                                   ~(byte)((ulong)uVar29 >> 0x28),
                                                                   CONCAT14((byte)((ulong)uVar45 >>
                                                                                  0x20) &
                                                                            ~(byte)((ulong)uVar29 >>
                                                                                   0x20),
                                                                            CONCAT13((byte)((ulong)
                                                  uVar45 >> 0x18) & ~(byte)((ulong)uVar29 >> 0x18),
                                                  CONCAT12((byte)((ulong)uVar45 >> 0x10) &
                                                           ~(byte)((ulong)uVar29 >> 0x10),
                                                           CONCAT11((byte)((ulong)uVar45 >> 8) &
                                                                    ~(byte)((ulong)uVar29 >> 8),
                                                                    (byte)uVar45 & ~(byte)uVar29))))
                                                  )));
                          puVar18[-1] = CONCAT17((byte)((ulong)uVar48 >> 0x38) &
                                                 ~(byte)((ulong)uVar40 >> 0x38),
                                                 CONCAT16((byte)((ulong)uVar48 >> 0x30) &
                                                          ~(byte)((ulong)uVar40 >> 0x30),
                                                          CONCAT15((byte)((ulong)uVar48 >> 0x28) &
                                                                   ~(byte)((ulong)uVar40 >> 0x28),
                                                                   CONCAT14((byte)((ulong)uVar48 >>
                                                                                  0x20) &
                                                                            ~(byte)((ulong)uVar40 >>
                                                                                   0x20),
                                                                            CONCAT13((byte)((ulong)
                                                  uVar48 >> 0x18) & ~(byte)((ulong)uVar40 >> 0x18),
                                                  CONCAT12((byte)((ulong)uVar48 >> 0x10) &
                                                           ~(byte)((ulong)uVar40 >> 0x10),
                                                           CONCAT11((byte)((ulong)uVar48 >> 8) &
                                                                    ~(byte)((ulong)uVar40 >> 8),
                                                                    (byte)uVar48 & ~(byte)uVar40))))
                                                  )));
                          puVar18[-2] = CONCAT17((byte)((ulong)uVar47 >> 0x38) &
                                                 ~(byte)((ulong)uVar33 >> 0x38),
                                                 CONCAT16((byte)((ulong)uVar47 >> 0x30) &
                                                          ~(byte)((ulong)uVar33 >> 0x30),
                                                          CONCAT15((byte)((ulong)uVar47 >> 0x28) &
                                                                   ~(byte)((ulong)uVar33 >> 0x28),
                                                                   CONCAT14((byte)((ulong)uVar47 >>
                                                                                  0x20) &
                                                                            ~(byte)((ulong)uVar33 >>
                                                                                   0x20),
                                                                            CONCAT13((byte)((ulong)
                                                  uVar47 >> 0x18) & ~(byte)((ulong)uVar33 >> 0x18),
                                                  CONCAT12((byte)((ulong)uVar47 >> 0x10) &
                                                           ~(byte)((ulong)uVar33 >> 0x10),
                                                           CONCAT11((byte)((ulong)uVar47 >> 8) &
                                                                    ~(byte)((ulong)uVar33 >> 8),
                                                                    (byte)uVar47 & ~(byte)uVar33))))
                                                  )));
                          puVar18[1] = CONCAT17((byte)((ulong)uVar50 >> 0x38) &
                                                ~(byte)((ulong)uVar42 >> 0x38),
                                                CONCAT16((byte)((ulong)uVar50 >> 0x30) &
                                                         ~(byte)((ulong)uVar42 >> 0x30),
                                                         CONCAT15((byte)((ulong)uVar50 >> 0x28) &
                                                                  ~(byte)((ulong)uVar42 >> 0x28),
                                                                  CONCAT14((byte)((ulong)uVar50 >>
                                                                                 0x20) &
                                                                           ~(byte)((ulong)uVar42 >>
                                                                                  0x20),
                                                                           CONCAT13((byte)((ulong)
                                                  uVar50 >> 0x18) & ~(byte)((ulong)uVar42 >> 0x18),
                                                  CONCAT12((byte)((ulong)uVar50 >> 0x10) &
                                                           ~(byte)((ulong)uVar42 >> 0x10),
                                                           CONCAT11((byte)((ulong)uVar50 >> 8) &
                                                                    ~(byte)((ulong)uVar42 >> 8),
                                                                    (byte)uVar50 & ~(byte)uVar42))))
                                                  )));
                          *puVar18 = CONCAT17((byte)((ulong)uVar49 >> 0x38) &
                                              ~(byte)((ulong)uVar41 >> 0x38),
                                              CONCAT16((byte)((ulong)uVar49 >> 0x30) &
                                                       ~(byte)((ulong)uVar41 >> 0x30),
                                                       CONCAT15((byte)((ulong)uVar49 >> 0x28) &
                                                                ~(byte)((ulong)uVar41 >> 0x28),
                                                                CONCAT14((byte)((ulong)uVar49 >>
                                                                               0x20) &
                                                                         ~(byte)((ulong)uVar41 >>
                                                                                0x20),
                                                                         CONCAT13((byte)((ulong)
                                                  uVar49 >> 0x18) & ~(byte)((ulong)uVar41 >> 0x18),
                                                  CONCAT12((byte)((ulong)uVar49 >> 0x10) &
                                                           ~(byte)((ulong)uVar41 >> 0x10),
                                                           CONCAT11((byte)((ulong)uVar49 >> 8) &
                                                                    ~(byte)((ulong)uVar41 >> 8),
                                                                    (byte)uVar49 & ~(byte)uVar41))))
                                                  )));
                          puVar18[3] = CONCAT17((byte)((ulong)uVar52 >> 0x38) &
                                                ~(byte)((ulong)uVar44 >> 0x38),
                                                CONCAT16((byte)((ulong)uVar52 >> 0x30) &
                                                         ~(byte)((ulong)uVar44 >> 0x30),
                                                         CONCAT15((byte)((ulong)uVar52 >> 0x28) &
                                                                  ~(byte)((ulong)uVar44 >> 0x28),
                                                                  CONCAT14((byte)((ulong)uVar52 >>
                                                                                 0x20) &
                                                                           ~(byte)((ulong)uVar44 >>
                                                                                  0x20),
                                                                           CONCAT13((byte)((ulong)
                                                  uVar52 >> 0x18) & ~(byte)((ulong)uVar44 >> 0x18),
                                                  CONCAT12((byte)((ulong)uVar52 >> 0x10) &
                                                           ~(byte)((ulong)uVar44 >> 0x10),
                                                           CONCAT11((byte)((ulong)uVar52 >> 8) &
                                                                    ~(byte)((ulong)uVar44 >> 8),
                                                                    (byte)uVar52 & ~(byte)uVar44))))
                                                  )));
                          puVar18[2] = CONCAT17((byte)((ulong)uVar51 >> 0x38) &
                                                ~(byte)((ulong)uVar43 >> 0x38),
                                                CONCAT16((byte)((ulong)uVar51 >> 0x30) &
                                                         ~(byte)((ulong)uVar43 >> 0x30),
                                                         CONCAT15((byte)((ulong)uVar51 >> 0x28) &
                                                                  ~(byte)((ulong)uVar43 >> 0x28),
                                                                  CONCAT14((byte)((ulong)uVar51 >>
                                                                                 0x20) &
                                                                           ~(byte)((ulong)uVar43 >>
                                                                                  0x20),
                                                                           CONCAT13((byte)((ulong)
                                                  uVar51 >> 0x18) & ~(byte)((ulong)uVar43 >> 0x18),
                                                  CONCAT12((byte)((ulong)uVar51 >> 0x10) &
                                                           ~(byte)((ulong)uVar43 >> 0x10),
                                                           CONCAT11((byte)((ulong)uVar51 >> 8) &
                                                                    ~(byte)((ulong)uVar43 >> 8),
                                                                    (byte)uVar51 & ~(byte)uVar43))))
                                                  )));
                          uVar21 = uVar21 - 0x10;
                          puVar15 = puVar15 + 8;
                          puVar18 = puVar18 + 8;
                        } while (uVar21 != 0);
                        uVar21 = uVar26;
                        if (uVar26 == uVar16) goto code_r0x00130df8;
                      }
                      lVar22 = uVar16 - uVar21;
                      puVar27 = (uint *)(uVar12 + uVar21 * 4);
                      puVar14 = (uint *)(unaff_x28 + in_stack_00000018 + uVar21 * 4);
                      do {
                        *puVar14 = *puVar14 & (*puVar27 ^ 0xffffffff);
                        lVar22 = lVar22 + -1;
                        puVar27 = puVar27 + 1;
                        puVar14 = puVar14 + 1;
                      } while (lVar22 != 0);
                    }
code_r0x00130df8:
                    iVar25 = iVar25 - uVar6;
                    iVar19 = *(int *)(unaff_x23 + 4);
                    if (0 < iVar19) {
                      lVar22 = 0;
                      uVar12 = 0;
                      lVar17 = *(long *)(&uStack0000000000000048 + uVar8 * 0x20);
                      puVar15 = puVar9;
                      do {
                        uVar21 = uVar12 >> 5 & 0x7ffffff;
                        uVar6 = *(uint *)(lVar17 + uVar21 * 4);
                        uVar1 = 1 << (ulong)((uint)uVar12 & 0x1f);
                        puVar9 = puVar15;
                        if ((uVar6 & uVar1) != 0) {
                          *(uint *)(lVar17 + uVar21 * 4) = uVar6 & (uVar1 ^ 0xffffffff);
                          param_2 = (undefined8 *)(ulong)((int)param_2 - 1);
                          puVar18 = (undefined8 *)(*(long *)(unaff_x23 + 0x10) + lVar22);
                          pfVar13 = (float *)puVar18[1];
                          *pfVar13 = fVar38;
                          pfVar13[1] = fVar37;
                          pfVar13[2] = fVar39;
                          pfVar13[3] = fVar36;
                          uVar29 = *puVar18;
                          uVar33 = puVar18[3];
                          uVar32 = puVar18[2];
                          puVar9 = puVar15 + 4;
                          puVar15[1] = puVar18[1];
                          *puVar15 = uVar29;
                          puVar15[3] = uVar33;
                          puVar15[2] = uVar32;
                          iVar19 = *(int *)(unaff_x23 + 4);
                        }
                        uVar12 = uVar12 + 1;
                      } while (((long)uVar12 < (long)iVar19) &&
                              (lVar22 = lVar22 + 0x20, puVar15 = puVar9, (int)param_2 != 0));
                    }
                  }
                  puVar15 = puVar9;
                  if ((uVar8 == 1) && (0 < unaff_w24)) {
                    param_2 = (undefined8 *)
                              (*(long *)(unaff_x23 + 0x10) +
                              (ulong)*(ushort *)(unaff_x19 + 0x234) * 0x20);
                    uVar29 = *param_2;
                    uVar33 = param_2[3];
                    uVar32 = param_2[2];
                    puVar15 = puVar9 + 4;
                    puVar9[1] = param_2[1];
                    *puVar9 = uVar29;
                    puVar9[3] = uVar33;
                    puVar9[2] = uVar32;
                  }
                  uVar8 = uVar8 + 1;
                  puVar9 = puVar15;
                } while (uVar8 != 4);
                iVar19 = *(int *)(unaff_x23 + 4);
                if (0 < iVar19 && iVar25 != 0) {
                  lVar22 = 0;
                  uVar8 = 0;
                  do {
                    puVar9 = puVar15;
                    if ((*(uint *)(unaff_x21 + (uVar8 >> 5 & 0x7ffffff) * 4) >>
                         (ulong)((uint)uVar8 & 0x1f) & 1) != 0) {
                      puVar18 = (undefined8 *)(*(long *)(unaff_x23 + 0x10) + lVar22);
                      uVar29 = *puVar18;
                      uVar33 = puVar18[3];
                      uVar32 = puVar18[2];
                      puVar9 = puVar15 + 4;
                      puVar15[1] = puVar18[1];
                      *puVar15 = uVar29;
                      puVar15[3] = uVar33;
                      puVar15[2] = uVar32;
                      iVar25 = iVar25 + -1;
                      iVar19 = *(int *)(unaff_x23 + 4);
                    }
                    uVar8 = uVar8 + 1;
                  } while (((long)uVar8 < (long)iVar19) &&
                          (lVar22 = lVar22 + 0x20, puVar15 = puVar9, iVar25 != 0));
                }
                param_3 = *(float **)(&UNK_00004e78 + in_stack_00000028);
                if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
                    /* WARNING: Could not recover jumptable at 0x007b382c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
                  (*(code *)PTR__memcpy_00a250b8)
                            (*(long *)(unaff_x23 + 0x10) + 0x40,param_3,
                             -(ulong)(iVar19 - 2U >> 0x1f) & 0xffffffe000000000 |
                             (ulong)(iVar19 - 2U) << 5);
                  return;
                }
              }
              puVar10 = (undefined4 *)___stack_chk_fail(param_2,param_3);
              *(undefined1 *)((long)puVar10 + 0x23e) = 0;
              lVar22 = lRam0000000000a334c0;
              if ((*(byte *)(puVar10 + 1) >> 4 & 1) != 0) {
                return;
              }
              if (puVar10[0x19] == -1) {
                iVar25 = puVar10[0x1b];
              }
              else {
                puVar11 = (undefined4 *)
                          (*(long *)(&UNK_00005f98 + lRam0000000000a334c0) +
                          (long)(int)puVar10[0x19]);
                iVar25 = puVar10[0x1b];
                if (iVar25 <= *(short *)((long)puVar11 + 0xe)) goto code_r0x00131008;
                *puVar11 = 0;
              }
              puVar11 = (undefined4 *)func_0x001339dc(*puVar10,iVar25);
              puVar10[0x19] = (int)puVar11 - *(int *)(&UNK_00005f98 + lVar22);
              iVar25 = puVar10[0x1b];
code_r0x00131008:
              *(short *)(puVar11 + 3) = (short)iVar25;
              puVar27 = *(uint **)(puVar10 + 6);
              uVar28 = 0;
              puVar11[1] = 0;
              if (0 < iVar25) {
                iVar25 = 0;
                bVar7 = false;
                pfVar13 = (float *)(puVar11 + 5);
                do {
                  lVar22 = 0x10;
                  if ((*puVar27 & 8) != 0) {
                    lVar22 = 0x18;
                  }
                  fVar30 = *(float *)((long)puVar27 + lVar22);
                  *pfVar13 = fVar30;
                  *(short *)(pfVar13 + 2) = (short)iVar25;
                  *(undefined2 *)((long)pfVar13 + 10) = *(undefined2 *)((long)puVar27 + 0x52);
                  *(undefined2 *)(pfVar13 + 3) = *(undefined2 *)((long)puVar27 + 0x5a);
                  bVar3 = *(byte *)((long)pfVar13 + 0xe);
                  bVar5 = *(byte *)((long)puVar27 + 0x6d) & 3;
                  *(byte *)((long)pfVar13 + 0xe) = bVar3 & 0xfc | bVar5;
                  bVar5 = bVar3 & 0xf8 | bVar5 | *(char *)((long)puVar27 + 99) << 2;
                  *(byte *)((long)pfVar13 + 0xe) = bVar5;
                  *(byte *)((long)pfVar13 + 0xe) = (byte)*puVar27 & 8 | bVar5 & 0xf7;
                  uVar24 = *puVar27;
                  if (fVar30 != (float)puVar27[7]) {
                    puVar11[1] = puVar11[1] | 1;
                  }
                  if (iVar25 != *(short *)((long)puVar27 + 0x52)) {
                    puVar11[1] = puVar11[1] | 2;
                  }
                  if (*(short *)((long)puVar27 + 0x5a) != -1) {
                    puVar11[1] = puVar11[1] | 8;
                  }
                  if (((uVar24 >> 1 ^ 0xffffffff) & 1) != (uint)*(byte *)((long)puVar27 + 99)) {
                    puVar11[1] = puVar11[1] | 4;
                  }
                  bVar7 = (bool)((uVar24 & 8) == 0 | bVar7);
                  iVar25 = iVar25 + 1;
                  puVar27 = puVar27 + 0x1c;
                  pfVar13 = pfVar13 + 4;
                } while (iVar25 < (int)puVar10[0x1b]);
                puVar11[1] = puVar11[1] & puVar10[1];
                if (bVar7) {
                  uVar28 = puVar10[0x39];
                }
              }
              puVar11[2] = uVar28;
              if (*(float *)(&UNK_00005f5c + lRam0000000000a334c0) <= 0.0) {
                *(float *)(&UNK_00005f5c + lRam0000000000a334c0) =
                     *(float *)(lRam0000000000a334c0 + 0x1c);
              }
              return;
            }
            uVar24 = *(uint *)(in_x11 + (in_x10 >> 5 & 0x7ffffff) * 4) >>
                     (ulong)((uint)in_x10 & 0x1f);
            param_2 = (undefined8 *)(ulong)uVar24;
          } while ((uVar24 & 1) == 0);
          in_x17 = *(long *)(unaff_x19 + 0x18);
          param_2 = (undefined8 *)(in_x17 + in_x9);
          param_4 = *(long *)(unaff_x23 + 0x10);
          param_3 = (float *)((long)param_2 + 0x44);
          uVar4 = *(ushort *)((long)param_2 + 0x5e);
          puVar27 = (uint *)(param_4 + (ulong)uVar4 * 0x20);
          uVar24 = *puVar27;
        } while ((int)uVar24 < 1);
        pfVar13 = *(float **)(puVar27 + 2);
        uVar6 = uVar24 - 1;
        if ((*(int *)((long)pfVar13 + (ulong)uVar6 * (in_x13 & 0xffffffff) + 0x20) == 0) &&
           (*(long *)((long)pfVar13 + (ulong)uVar6 * (in_x13 & 0xffffffff) + 0x28) == 0)) {
          *puVar27 = uVar6;
          uVar24 = uVar6;
        }
      } while (uVar24 != 1);
      if ((*(byte *)((long)param_2 + 1) & 1) != 0) break;
      pfVar20 = (float *)(param_2 + 8);
      if (unaff_w24 < 1) {
        pfVar20 = param_3;
      }
      fVar30 = *pfVar20;
      if (*pfVar20 < *(float *)(param_2 + 9)) {
        fVar30 = *(float *)(param_2 + 9);
      }
    } while (*(float *)(param_2 + 5) < fVar30);
    if (unaff_w25 < 1) {
      param_7 = (ulong)(in_w12 | 1);
      pfVar20 = (float *)(in_x14 + param_7 * 0x20);
      pfVar23 = pfVar20 + 4;
      fVar30 = *pfVar23;
      if (fVar30 != 0.0) goto code_r0x001308f0;
code_r0x00130928:
      *(long *)(pfVar20 + 2) = param_1._8_8_;
      *(long *)pfVar20 = param_1._0_8_;
      fVar31 = 3.4028235e+38;
    }
    else {
      param_7 = (ulong)(in_w12 | (long)in_x10 < (long)*(short *)(unaff_x19 + 0x22c) ^ 1);
      pfVar20 = (float *)(in_x14 + param_7 * 0x20);
      pfVar23 = pfVar20 + 4;
      fVar30 = *pfVar23;
      if (fVar30 == 0.0) goto code_r0x00130928;
code_r0x001308f0:
      fVar31 = *pfVar20;
    }
    lVar22 = *(long *)(in_x14 + param_7 * 0x20 + 0x18);
    uVar8 = (ulong)(uVar4 >> 3) & 0x1ffc;
    *(uint *)(lVar22 + uVar8) = *(uint *)(lVar22 + uVar8) | in_w15 << (ulong)(uVar4 & 0x1f);
    *pfVar23 = (float)((int)fVar30 + 1);
    if (*pfVar13 < fVar31) {
      *pfVar20 = *pfVar13;
      fVar34 = pfVar13[1];
      fVar31 = pfVar13[2];
      fVar30 = pfVar13[3];
      if (fVar34 < pfVar20[1]) goto code_r0x001309b4;
code_r0x00130980:
      if (fVar31 <= pfVar20[2]) goto code_r0x001309c4;
code_r0x0013098c:
      pfVar20[2] = fVar31;
      if (pfVar20[3] < fVar30) {
code_r0x001309d0:
        pfVar20[3] = fVar30;
      }
      goto code_r0x001309d4;
    }
    fVar34 = pfVar13[1];
    fVar31 = pfVar13[2];
    fVar30 = pfVar13[3];
    if (pfVar20[1] <= fVar34) goto code_r0x00130980;
code_r0x001309b4:
    pfVar20[1] = fVar34;
    if (pfVar20[2] < fVar31) goto code_r0x0013098c;
code_r0x001309c4:
    if (pfVar20[3] < fVar30) goto code_r0x001309d0;
  } while( true );
}

