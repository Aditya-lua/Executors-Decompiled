
long * FUN_0028ab28(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  uint uVar1;
  byte bVar2;
  bool bVar3;
  int iVar4;
  int iVar5;
  int iVar6;
  ulong uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  long lVar15;
  undefined8 uVar16;
  undefined8 *puVar17;
  long lVar18;
  ulong uVar19;
  ulong uVar20;
  ulong uVar21;
  ulong uVar22;
  byte *pbVar23;
  long lVar24;
  ulong uVar25;
  undefined8 *puVar26;
  byte *pbVar27;
  undefined8 unaff_x19;
  ulong *unaff_x20;
  int iVar28;
  int *unaff_x21;
  ulong unaff_x22;
  long unaff_x23;
  long *unaff_x24;
  ulong unaff_x25;
  long *plVar29;
  undefined8 uVar30;
  undefined8 uVar31;
  undefined8 uVar32;
  undefined8 uVar33;
  undefined8 uVar34;
  undefined8 uVar35;
  undefined8 uVar36;
  undefined8 uVar37;
  undefined8 uVar38;
  undefined8 uVar39;
  undefined8 uVar40;
  undefined8 uVar41;
  undefined8 uVar42;
  undefined8 uVar43;
  undefined8 uVar44;
  byte abStack_a0 [31];
  byte bStack_81;
  undefined8 auStack_80 [3];
  byte bStack_61;
  undefined8 auStack_60 [4];
  undefined8 auStack_40 [4];
  long lStack_20;
  
  uVar19 = unaff_x25 & 0xffffffff;
  lStack_20 = *(long *)PTR____stack_chk_guard_009b01e8;
  uVar7 = func_0x002c0d50(param_3);
  if (uVar19 < 0x201) {
    uVar19 = 0x200;
  }
  if (unaff_x23 != 0) {
    if (unaff_x22 < uVar7) {
      plVar29 = (long *)0x0;
      goto LAB_0028b22c;
    }
    if (uVar7 != 0) {
      ___memcpy_chk(auStack_40);
    }
  }
  lVar18 = func_0x0029e1d8();
  if (lVar18 != 0) {
    func_0x0029e284();
    uVar8 = func_0x0029e340(lVar18);
    uVar9 = func_0x0029e340(lVar18);
    uVar10 = func_0x0029e340(lVar18);
    uVar11 = func_0x0029e340(lVar18);
    uVar12 = func_0x0029e340(lVar18);
    uVar13 = func_0x0029e340(lVar18);
    uVar14 = func_0x0029e340(lVar18);
    lVar15 = func_0x0029e340(lVar18);
    if (lVar15 != 0) {
      uVar16 = func_0x0029be44();
      uVar19 = (uVar19 + 0x3f & 0xffffffffffffffc0) - 1;
      iVar4 = func_0x0029ed38(lVar15,uVar16,uVar19);
      if (iVar4 != 0) {
        uVar20 = uVar7 & 0xffffffffffffffc0;
        uVar21 = uVar7 & 0xfffffffffffffff8;
code_r0x0028ad04:
        do {
          iVar4 = func_0x002ac8b0(unaff_x19,0);
          if ((iVar4 == 0) ||
             ((unaff_x23 == 0 && (iVar4 = func_0x002afc8c(auStack_40,uVar7), iVar4 == 0))))
          goto LAB_0028b200;
          if (uVar7 != 0) {
            ___memcpy_chk(auStack_80,auStack_40,uVar7,0x20);
            ___memcpy_chk(abStack_a0,auStack_40,uVar7,0x20);
            uVar22 = uVar7;
            do {
              bVar2 = abStack_a0[uVar22 + 0x1f];
              abStack_a0[uVar22 + 0x1f] = (byte)(bVar2 + 1);
              if (bVar2 + 1 >> 8 == 0) break;
              uVar25 = uVar22 - 2;
              uVar22 = uVar22 - 1;
            } while (uVar25 < uVar7);
          }
          iVar4 = func_0x002c0d58(auStack_40,uVar7,auStack_60,0,param_3,0);
          if ((iVar4 == 0) ||
             (iVar4 = func_0x002c0d58(auStack_80,uVar7,abStack_a0,0,param_3,0), iVar4 == 0))
          goto LAB_0028b200;
          if (uVar7 != 0) {
            if (uVar7 < 8) {
              uVar22 = 0;
            }
            else {
              if (uVar7 < 0x40) {
                uVar22 = 0;
              }
              else {
                puVar17 = auStack_80;
                puVar26 = auStack_40;
                uVar22 = uVar20;
                do {
                  uVar31 = puVar17[-3];
                  uVar16 = puVar17[-4];
                  uVar32 = puVar17[-1];
                  uVar30 = puVar17[-2];
                  uVar34 = puVar17[1];
                  uVar33 = *puVar17;
                  uVar36 = puVar17[3];
                  uVar35 = puVar17[2];
                  uVar38 = puVar26[-3];
                  uVar37 = puVar26[-4];
                  uVar40 = puVar26[-1];
                  uVar39 = puVar26[-2];
                  uVar42 = puVar26[1];
                  uVar41 = *puVar26;
                  uVar44 = puVar26[3];
                  uVar43 = puVar26[2];
                  puVar26[-3] = CONCAT17((byte)((ulong)uVar38 >> 0x38) ^
                                         (byte)((ulong)uVar31 >> 0x38),
                                         CONCAT16((byte)((ulong)uVar38 >> 0x30) ^
                                                  (byte)((ulong)uVar31 >> 0x30),
                                                  CONCAT15((byte)((ulong)uVar38 >> 0x28) ^
                                                           (byte)((ulong)uVar31 >> 0x28),
                                                           CONCAT14((byte)((ulong)uVar38 >> 0x20) ^
                                                                    (byte)((ulong)uVar31 >> 0x20),
                                                                    CONCAT13((byte)((ulong)uVar38 >>
                                                                                   0x18) ^
                                                                             (byte)((ulong)uVar31 >>
                                                                                   0x18),
                                                                             CONCAT12((byte)((ulong)
                                                  uVar38 >> 0x10) ^ (byte)((ulong)uVar31 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar38 >> 8) ^
                                                           (byte)((ulong)uVar31 >> 8),
                                                           (byte)uVar38 ^ (byte)uVar31)))))));
                  puVar26[-4] = CONCAT17((byte)((ulong)uVar37 >> 0x38) ^
                                         (byte)((ulong)uVar16 >> 0x38),
                                         CONCAT16((byte)((ulong)uVar37 >> 0x30) ^
                                                  (byte)((ulong)uVar16 >> 0x30),
                                                  CONCAT15((byte)((ulong)uVar37 >> 0x28) ^
                                                           (byte)((ulong)uVar16 >> 0x28),
                                                           CONCAT14((byte)((ulong)uVar37 >> 0x20) ^
                                                                    (byte)((ulong)uVar16 >> 0x20),
                                                                    CONCAT13((byte)((ulong)uVar37 >>
                                                                                   0x18) ^
                                                                             (byte)((ulong)uVar16 >>
                                                                                   0x18),
                                                                             CONCAT12((byte)((ulong)
                                                  uVar37 >> 0x10) ^ (byte)((ulong)uVar16 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar37 >> 8) ^
                                                           (byte)((ulong)uVar16 >> 8),
                                                           (byte)uVar37 ^ (byte)uVar16)))))));
                  puVar26[-1] = CONCAT17((byte)((ulong)uVar40 >> 0x38) ^
                                         (byte)((ulong)uVar32 >> 0x38),
                                         CONCAT16((byte)((ulong)uVar40 >> 0x30) ^
                                                  (byte)((ulong)uVar32 >> 0x30),
                                                  CONCAT15((byte)((ulong)uVar40 >> 0x28) ^
                                                           (byte)((ulong)uVar32 >> 0x28),
                                                           CONCAT14((byte)((ulong)uVar40 >> 0x20) ^
                                                                    (byte)((ulong)uVar32 >> 0x20),
                                                                    CONCAT13((byte)((ulong)uVar40 >>
                                                                                   0x18) ^
                                                                             (byte)((ulong)uVar32 >>
                                                                                   0x18),
                                                                             CONCAT12((byte)((ulong)
                                                  uVar40 >> 0x10) ^ (byte)((ulong)uVar32 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar40 >> 8) ^
                                                           (byte)((ulong)uVar32 >> 8),
                                                           (byte)uVar40 ^ (byte)uVar32)))))));
                  puVar26[-2] = CONCAT17((byte)((ulong)uVar39 >> 0x38) ^
                                         (byte)((ulong)uVar30 >> 0x38),
                                         CONCAT16((byte)((ulong)uVar39 >> 0x30) ^
                                                  (byte)((ulong)uVar30 >> 0x30),
                                                  CONCAT15((byte)((ulong)uVar39 >> 0x28) ^
                                                           (byte)((ulong)uVar30 >> 0x28),
                                                           CONCAT14((byte)((ulong)uVar39 >> 0x20) ^
                                                                    (byte)((ulong)uVar30 >> 0x20),
                                                                    CONCAT13((byte)((ulong)uVar39 >>
                                                                                   0x18) ^
                                                                             (byte)((ulong)uVar30 >>
                                                                                   0x18),
                                                                             CONCAT12((byte)((ulong)
                                                  uVar39 >> 0x10) ^ (byte)((ulong)uVar30 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar39 >> 8) ^
                                                           (byte)((ulong)uVar30 >> 8),
                                                           (byte)uVar39 ^ (byte)uVar30)))))));
                  puVar26[1] = CONCAT17((byte)((ulong)uVar42 >> 0x38) ^
                                        (byte)((ulong)uVar34 >> 0x38),
                                        CONCAT16((byte)((ulong)uVar42 >> 0x30) ^
                                                 (byte)((ulong)uVar34 >> 0x30),
                                                 CONCAT15((byte)((ulong)uVar42 >> 0x28) ^
                                                          (byte)((ulong)uVar34 >> 0x28),
                                                          CONCAT14((byte)((ulong)uVar42 >> 0x20) ^
                                                                   (byte)((ulong)uVar34 >> 0x20),
                                                                   CONCAT13((byte)((ulong)uVar42 >>
                                                                                  0x18) ^
                                                                            (byte)((ulong)uVar34 >>
                                                                                  0x18),
                                                                            CONCAT12((byte)((ulong)
                                                  uVar42 >> 0x10) ^ (byte)((ulong)uVar34 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar42 >> 8) ^
                                                           (byte)((ulong)uVar34 >> 8),
                                                           (byte)uVar42 ^ (byte)uVar34)))))));
                  *puVar26 = CONCAT17((byte)((ulong)uVar41 >> 0x38) ^ (byte)((ulong)uVar33 >> 0x38),
                                      CONCAT16((byte)((ulong)uVar41 >> 0x30) ^
                                               (byte)((ulong)uVar33 >> 0x30),
                                               CONCAT15((byte)((ulong)uVar41 >> 0x28) ^
                                                        (byte)((ulong)uVar33 >> 0x28),
                                                        CONCAT14((byte)((ulong)uVar41 >> 0x20) ^
                                                                 (byte)((ulong)uVar33 >> 0x20),
                                                                 CONCAT13((byte)((ulong)uVar41 >>
                                                                                0x18) ^
                                                                          (byte)((ulong)uVar33 >>
                                                                                0x18),
                                                                          CONCAT12((byte)((ulong)
                                                  uVar41 >> 0x10) ^ (byte)((ulong)uVar33 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar41 >> 8) ^
                                                           (byte)((ulong)uVar33 >> 8),
                                                           (byte)uVar41 ^ (byte)uVar33)))))));
                  puVar26[3] = CONCAT17((byte)((ulong)uVar44 >> 0x38) ^
                                        (byte)((ulong)uVar36 >> 0x38),
                                        CONCAT16((byte)((ulong)uVar44 >> 0x30) ^
                                                 (byte)((ulong)uVar36 >> 0x30),
                                                 CONCAT15((byte)((ulong)uVar44 >> 0x28) ^
                                                          (byte)((ulong)uVar36 >> 0x28),
                                                          CONCAT14((byte)((ulong)uVar44 >> 0x20) ^
                                                                   (byte)((ulong)uVar36 >> 0x20),
                                                                   CONCAT13((byte)((ulong)uVar44 >>
                                                                                  0x18) ^
                                                                            (byte)((ulong)uVar36 >>
                                                                                  0x18),
                                                                            CONCAT12((byte)((ulong)
                                                  uVar44 >> 0x10) ^ (byte)((ulong)uVar36 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar44 >> 8) ^
                                                           (byte)((ulong)uVar36 >> 8),
                                                           (byte)uVar44 ^ (byte)uVar36)))))));
                  puVar26[2] = CONCAT17((byte)((ulong)uVar43 >> 0x38) ^
                                        (byte)((ulong)uVar35 >> 0x38),
                                        CONCAT16((byte)((ulong)uVar43 >> 0x30) ^
                                                 (byte)((ulong)uVar35 >> 0x30),
                                                 CONCAT15((byte)((ulong)uVar43 >> 0x28) ^
                                                          (byte)((ulong)uVar35 >> 0x28),
                                                          CONCAT14((byte)((ulong)uVar43 >> 0x20) ^
                                                                   (byte)((ulong)uVar35 >> 0x20),
                                                                   CONCAT13((byte)((ulong)uVar43 >>
                                                                                  0x18) ^
                                                                            (byte)((ulong)uVar35 >>
                                                                                  0x18),
                                                                            CONCAT12((byte)((ulong)
                                                  uVar43 >> 0x10) ^ (byte)((ulong)uVar35 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar43 >> 8) ^
                                                           (byte)((ulong)uVar35 >> 8),
                                                           (byte)uVar43 ^ (byte)uVar35)))))));
                  uVar22 = uVar22 - 0x40;
                  puVar17 = puVar17 + 8;
                  puVar26 = puVar26 + 8;
                } while (uVar22 != 0);
                if (uVar7 == uVar20) goto code_r0x0028aeb0;
                uVar22 = uVar20;
                if ((uVar7 & 0x38) == 0) goto code_r0x0028ae84;
              }
              lVar24 = uVar22 - uVar21;
              pbVar23 = abStack_a0 + uVar22;
              puVar17 = (undefined8 *)((long)auStack_60 + uVar22);
              do {
                uVar16 = *(undefined8 *)pbVar23;
                uVar31 = *puVar17;
                *puVar17 = CONCAT17((byte)((ulong)uVar31 >> 0x38) ^ (byte)((ulong)uVar16 >> 0x38),
                                    CONCAT16((byte)((ulong)uVar31 >> 0x30) ^
                                             (byte)((ulong)uVar16 >> 0x30),
                                             CONCAT15((byte)((ulong)uVar31 >> 0x28) ^
                                                      (byte)((ulong)uVar16 >> 0x28),
                                                      CONCAT14((byte)((ulong)uVar31 >> 0x20) ^
                                                               (byte)((ulong)uVar16 >> 0x20),
                                                               CONCAT13((byte)((ulong)uVar31 >> 0x18
                                                                              ) ^ (byte)((ulong)
                                                  uVar16 >> 0x18),
                                                  CONCAT12((byte)((ulong)uVar31 >> 0x10) ^
                                                           (byte)((ulong)uVar16 >> 0x10),
                                                           CONCAT11((byte)((ulong)uVar31 >> 8) ^
                                                                    (byte)((ulong)uVar16 >> 8),
                                                                    (byte)uVar31 ^ (byte)uVar16)))))
                                            ));
                lVar24 = lVar24 + 8;
                pbVar23 = pbVar23 + 8;
                puVar17 = puVar17 + 1;
              } while (lVar24 != 0);
              uVar22 = uVar21;
              if (uVar7 == uVar21) goto code_r0x0028aeb0;
            }
code_r0x0028ae84:
            lVar24 = uVar7 - uVar22;
            pbVar23 = (byte *)((long)auStack_60 + uVar22);
            pbVar27 = abStack_a0 + uVar22;
            do {
              *pbVar23 = *pbVar23 ^ *pbVar27;
              lVar24 = lVar24 + -1;
              pbVar23 = pbVar23 + 1;
              pbVar27 = pbVar27 + 1;
            } while (lVar24 != 0);
          }
code_r0x0028aeb0:
          auStack_60[0]._0_1_ = (byte)auStack_60[0] | 0x80;
          *(byte *)((long)auStack_60 + (uVar7 - 1)) = *(byte *)((long)auStack_60 + (uVar7 - 1)) | 1;
          lVar24 = func_0x0029c764(auStack_60,uVar7,uVar11);
          if (lVar24 == 0) goto LAB_0028b200;
          iVar4 = func_0x002ad650(uVar11,0x32,lVar18,unaff_x23 == 0,unaff_x19);
          if (0 < iVar4) {
            iVar4 = func_0x002ac8b0(unaff_x19,2,0);
            if ((iVar4 == 0) || (iVar4 = func_0x002ac8b0(unaff_x19,3,0), iVar4 == 0))
            goto LAB_0028b200;
            iVar4 = 0;
            do {
              if ((iVar4 != 0) && (iVar5 = func_0x002ac8b0(unaff_x19,0,iVar4), iVar5 == 0))
              goto LAB_0028b200;
              func_0x0029c0a4(uVar10);
              iVar5 = (int)(uVar19 / 0xa0);
              if (-1 < iVar5) {
                uVar22 = uVar7;
                iVar28 = 0;
code_r0x0028af74:
                do {
                  if (uVar22 - 1 < uVar7) {
                    uVar1 = *(byte *)((long)auStack_80 + (uVar22 - 1)) + 1;
                    *(char *)((long)auStack_80 + (uVar22 - 1)) = (char)uVar1;
                    uVar22 = uVar22 - 1;
                    if (uVar1 >> 8 != 0) goto code_r0x0028af74;
                  }
                  iVar6 = func_0x002c0d58(auStack_80,uVar7,auStack_60,0,param_3,0);
                  if ((((iVar6 == 0) ||
                       (lVar24 = func_0x0029c764(auStack_60,uVar7,uVar8), lVar24 == 0)) ||
                      (iVar6 = func_0x0029ed38(uVar8,uVar8,(int)uVar7 * 8 * iVar28), iVar6 == 0)) ||
                     (iVar6 = func_0x0029ac7c(uVar10,uVar10,uVar8), iVar6 == 0)) goto LAB_0028b200;
                  bVar3 = iVar28 != iVar5;
                  uVar22 = uVar7;
                  iVar28 = iVar28 + 1;
                } while (bVar3);
              }
              iVar5 = func_0x002b07e8(uVar10,uVar19);
              if (((iVar5 == 0) || (lVar24 = func_0x0029bd80(uVar12,uVar10), lVar24 == 0)) ||
                 ((iVar5 = func_0x0029ac7c(uVar12,uVar12,lVar15), iVar5 == 0 ||
                  ((iVar5 = func_0x002a1158(uVar8,uVar11), iVar5 == 0 ||
                   (iVar5 = func_0x0029e4fc(0,uVar13,uVar12,uVar8,lVar18), iVar5 == 0))))))
              goto LAB_0028b200;
              uVar16 = func_0x0029be44();
              iVar5 = func_0x0029b6ec(uVar8,uVar13,uVar16);
              if ((iVar5 == 0) || (iVar5 = func_0x0029b6ec(uVar14,uVar12,uVar8), iVar5 == 0))
              goto LAB_0028b200;
              iVar5 = func_0x0029db84(uVar14,lVar15);
              if (-1 < iVar5) {
                iVar5 = func_0x002ad650(uVar14,0x32,lVar18,1,unaff_x19);
                if (0 < iVar5) {
                  iVar5 = func_0x002ac8b0(unaff_x19,2,1);
                  if (iVar5 == 0) goto LAB_0028b200;
                  uVar10 = func_0x0029be44();
                  iVar5 = func_0x0029b6ec(lVar15,uVar14,uVar10);
                  if ((iVar5 == 0) ||
                     (iVar5 = func_0x0029e4fc(uVar8,0,lVar15,uVar11,lVar18), iVar5 == 0))
                  goto LAB_0028b200;
                  lVar24 = func_0x002a4fe0(uVar14,lVar18);
                  if ((lVar24 == 0) ||
                     ((iVar5 = func_0x0029b3b0(lVar15,2), iVar5 == 0 ||
                      (iVar5 = func_0x002a27b4(uVar9,lVar15,uVar8,uVar14,lVar18,lVar24), iVar5 == 0)
                      ))) goto LAB_0028b308;
                  uVar19 = 2;
                  goto LAB_0028b1b4;
                }
                if (iVar5 != 0) goto LAB_0028b200;
              }
              iVar4 = iVar4 + 1;
            } while (iVar4 != 0x1000);
            unaff_x23 = 0;
            goto code_r0x0028ad04;
          }
          unaff_x23 = 0;
          plVar29 = (long *)0x0;
          lVar24 = 0;
        } while (iVar4 == 0);
        goto LAB_0028b208;
      }
    }
LAB_0028b200:
    plVar29 = (long *)0x0;
    lVar24 = 0;
    goto LAB_0028b208;
  }
  plVar29 = (long *)0x0;
  lVar24 = 0;
  goto code_r0x0028b218;
  while( true ) {
    uVar10 = func_0x0029be44();
    iVar5 = func_0x0029ac7c(lVar15,lVar15,uVar10);
    if (iVar5 == 0) break;
    uVar19 = (ulong)((int)uVar19 + 1);
    iVar5 = func_0x002a27b4(uVar9,lVar15,uVar8,uVar14,lVar18,lVar24);
    if (iVar5 == 0) break;
LAB_0028b1b4:
    iVar5 = func_0x0029dd44(uVar9);
    if (iVar5 == 0) {
      iVar5 = func_0x002ac8b0(unaff_x19,3,1);
      if (iVar5 != 0) {
        func_0x0029bc0c(*unaff_x24);
        func_0x0029bc0c(unaff_x24[1]);
        func_0x0029bc0c(unaff_x24[2]);
        lVar15 = func_0x0029bca4(uVar14);
        *unaff_x24 = lVar15;
        lVar15 = func_0x0029bca4(uVar11);
        unaff_x24[1] = lVar15;
        lVar15 = func_0x0029bca4(uVar9);
        unaff_x24[2] = lVar15;
        if (*unaff_x24 != 0) {
          plVar29 = (long *)0x0;
          if ((unaff_x24[1] != 0) && (lVar15 != 0)) {
            if (unaff_x21 != (int *)0x0) {
              *unaff_x21 = iVar4;
            }
            if (unaff_x20 != (ulong *)0x0) {
              *unaff_x20 = uVar19;
            }
            plVar29 = (long *)((long)&MACH_HEADER.magic + 1);
          }
          goto LAB_0028b208;
        }
      }
      break;
    }
  }
LAB_0028b308:
  plVar29 = (long *)0x0;
LAB_0028b208:
  func_0x0029e4bc(lVar18);
  func_0x0029e220(lVar18);
code_r0x0028b218:
  func_0x002a34e0(lVar24);
  func_0x0036e464(auStack_40,0x20);
LAB_0028b22c:
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_20) {
    return plVar29;
  }
  puVar17 = (undefined8 *)___stack_chk_fail();
  plVar29 = (long *)func_0x0036e31c(0x110);
  if (plVar29 != (long *)0x0) {
    *(undefined4 *)(plVar29 + 0x20) = 1;
    func_0x00373d98(plVar29 + 5);
    func_0x0029668c(plVar29 + 0x21);
    lVar18 = func_0x0029bca4(*puVar17);
    *plVar29 = lVar18;
    lVar18 = func_0x0029bca4(puVar17[1]);
    plVar29[1] = lVar18;
    lVar18 = func_0x0029bca4(puVar17[2]);
    plVar29[2] = lVar18;
    if (((*plVar29 == 0) || (plVar29[1] == 0)) || (lVar18 == 0)) {
      func_0x0028a730(plVar29);
      return (long *)0x0;
    }
  }
  return plVar29;
}

