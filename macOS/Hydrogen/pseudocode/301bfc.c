
undefined8 FUN_00301bfc(undefined1 *param_1,undefined1 *param_2)

{
  ulong uVar1;
  int iVar2;
  int iVar3;
  ulong uVar4;
  ulong uVar5;
  byte *pbVar6;
  undefined8 *puVar7;
  long lVar8;
  undefined8 *puVar9;
  byte *pbVar10;
  undefined8 uVar11;
  ulong unaff_x22;
  long unaff_x23;
  undefined8 *unaff_x24;
  undefined8 *unaff_x26;
  ulong unaff_x27;
  long unaff_x29;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  undefined8 uVar25;
  undefined8 uVar26;
  undefined8 *in_stack_00000000;
  undefined8 *in_stack_00000008;
  undefined8 *in_stack_00000010;
  undefined8 *in_stack_00000018;
  undefined8 *in_stack_00000020;
  undefined1 uStack0000000000000050;
  undefined1 uStack0000000000000090;
  undefined1 uStack00000000000000d0;
  long in_stack_00000370;
  long in_stack_00000378;
  byte in_stack_00000608;
  long in_stack_00000610;
  long in_stack_00000618;
  byte in_stack_000008a8;
  undefined1 auStack_7ffffffe [2147483646];
  
  while ((_memcpy(param_1,param_2,0x2a0), in_stack_000008a8 - 1 < 2 &&
         (iVar2 = (**(code **)(in_stack_00000618 + 0x18))(), iVar2 != 0))) {
    if (unaff_x27 < unaff_x22) {
      _memcpy(auStack_7ffffffe + 0x8000036e,auStack_7ffffffe + 0x8000060e,0x2a0);
    }
    iVar2 = (**(code **)(in_stack_00000618 + 0x18))();
    if (((iVar2 == 0) || (iVar2 = (**(code **)(in_stack_00000618 + 0x18))(), iVar2 == 0)) ||
       (iVar2 = (**(code **)(in_stack_00000618 + 0x18))(), iVar2 == 0)) break;
    iVar2 = *(int *)(in_stack_00000610 + 4);
    iVar3 = (**(code **)(in_stack_00000618 + 0x20))(unaff_x29 + -0xa0);
    if (iVar3 == 0) break;
    uVar12 = in_stack_00000020[8];
    uVar13 = in_stack_00000020[0xb];
    uVar11 = in_stack_00000020[10];
    unaff_x24[9] = in_stack_00000020[9];
    unaff_x24[8] = uVar12;
    unaff_x24[0xb] = uVar13;
    unaff_x24[10] = uVar11;
    uVar12 = in_stack_00000020[4];
    uVar13 = in_stack_00000020[7];
    uVar11 = in_stack_00000020[6];
    unaff_x24[5] = in_stack_00000020[5];
    unaff_x24[4] = uVar12;
    unaff_x24[7] = uVar13;
    unaff_x24[6] = uVar11;
    uVar12 = in_stack_00000020[0x10];
    uVar13 = in_stack_00000020[0x13];
    uVar11 = in_stack_00000020[0x12];
    unaff_x24[0x11] = in_stack_00000020[0x11];
    unaff_x24[0x10] = uVar12;
    unaff_x24[0x13] = uVar13;
    unaff_x24[0x12] = uVar11;
    uVar12 = in_stack_00000020[0xc];
    uVar13 = in_stack_00000020[0xf];
    uVar11 = in_stack_00000020[0xe];
    unaff_x24[0xd] = in_stack_00000020[0xd];
    unaff_x24[0xc] = uVar12;
    unaff_x24[0xf] = uVar13;
    unaff_x24[0xe] = uVar11;
    unaff_x24[0x1a] = in_stack_00000020[0x1a];
    uVar15 = in_stack_00000020[0x19];
    uVar14 = in_stack_00000020[0x18];
    uVar12 = in_stack_00000020[0x15];
    uVar13 = in_stack_00000020[0x14];
    uVar11 = in_stack_00000020[0x16];
    unaff_x24[0x17] = in_stack_00000020[0x17];
    unaff_x24[0x16] = uVar11;
    unaff_x24[0x19] = uVar15;
    unaff_x24[0x18] = uVar14;
    unaff_x24[0x15] = uVar12;
    unaff_x24[0x14] = uVar13;
    uVar11 = *in_stack_00000020;
    uVar12 = in_stack_00000020[3];
    uVar13 = in_stack_00000020[2];
    unaff_x24[1] = in_stack_00000020[1];
    *unaff_x24 = uVar11;
    unaff_x24[3] = uVar12;
    unaff_x24[2] = uVar13;
    iVar3 = (**(code **)(in_stack_00000618 + 0x18))();
    if (iVar3 == 0) break;
    iVar3 = (**(code **)(in_stack_00000618 + 0x20))(&uStack0000000000000050);
    uVar11 = unaff_x26[0x14];
    uVar12 = unaff_x26[0x17];
    uVar13 = unaff_x26[0x16];
    unaff_x24[0x15] = unaff_x26[0x15];
    unaff_x24[0x14] = uVar11;
    unaff_x24[0x17] = uVar12;
    unaff_x24[0x16] = uVar13;
    uVar11 = unaff_x26[0x18];
    unaff_x24[0x19] = unaff_x26[0x19];
    unaff_x24[0x18] = uVar11;
    unaff_x24[0x1a] = unaff_x26[0x1a];
    uVar11 = unaff_x26[0xc];
    uVar12 = unaff_x26[0xf];
    uVar13 = unaff_x26[0xe];
    unaff_x24[0xd] = unaff_x26[0xd];
    unaff_x24[0xc] = uVar11;
    unaff_x24[0xf] = uVar12;
    unaff_x24[0xe] = uVar13;
    uVar11 = unaff_x26[0x10];
    uVar12 = unaff_x26[0x13];
    uVar13 = unaff_x26[0x12];
    unaff_x24[0x11] = unaff_x26[0x11];
    unaff_x24[0x10] = uVar11;
    unaff_x24[0x13] = uVar12;
    unaff_x24[0x12] = uVar13;
    uVar11 = unaff_x26[4];
    uVar12 = unaff_x26[7];
    uVar13 = unaff_x26[6];
    unaff_x24[5] = unaff_x26[5];
    unaff_x24[4] = uVar11;
    unaff_x24[7] = uVar12;
    unaff_x24[6] = uVar13;
    uVar11 = unaff_x26[8];
    uVar12 = unaff_x26[0xb];
    uVar13 = unaff_x26[10];
    unaff_x24[9] = unaff_x26[9];
    unaff_x24[8] = uVar11;
    unaff_x24[0xb] = uVar12;
    unaff_x24[10] = uVar13;
    uVar11 = *unaff_x26;
    uVar12 = unaff_x26[3];
    uVar13 = unaff_x26[2];
    unaff_x24[1] = unaff_x26[1];
    *unaff_x24 = uVar11;
    unaff_x24[3] = uVar12;
    unaff_x24[2] = uVar13;
    in_stack_000008a8 = 3;
    if (iVar3 == 0) break;
    if ((int)unaff_x27 != iVar2) {
      func_0x0079f220();
      goto _aws_lc_0_24_0_CRYPTO_library_init;
    }
    uVar1 = unaff_x22;
    if (unaff_x27 <= unaff_x22) {
      uVar1 = unaff_x27;
    }
    if (uVar1 != 0) {
      if (uVar1 < 8) {
        uVar4 = 0;
      }
      else {
        if (uVar1 < 0x40) {
          uVar5 = 0;
        }
        else {
          uVar4 = uVar1 & 0xffffffc0;
          puVar7 = (undefined8 *)(unaff_x23 + 0x20);
          puVar9 = in_stack_00000000;
          uVar5 = uVar4;
          do {
            uVar13 = puVar9[-3];
            uVar11 = puVar9[-4];
            uVar14 = puVar9[-1];
            uVar12 = puVar9[-2];
            uVar16 = puVar9[1];
            uVar15 = *puVar9;
            uVar18 = puVar9[3];
            uVar17 = puVar9[2];
            uVar20 = puVar7[-3];
            uVar19 = puVar7[-4];
            uVar22 = puVar7[-1];
            uVar21 = puVar7[-2];
            uVar24 = puVar7[1];
            uVar23 = *puVar7;
            uVar26 = puVar7[3];
            uVar25 = puVar7[2];
            puVar7[-3] = CONCAT17((byte)((ulong)uVar20 >> 0x38) ^ (byte)((ulong)uVar13 >> 0x38),
                                  CONCAT16((byte)((ulong)uVar20 >> 0x30) ^
                                           (byte)((ulong)uVar13 >> 0x30),
                                           CONCAT15((byte)((ulong)uVar20 >> 0x28) ^
                                                    (byte)((ulong)uVar13 >> 0x28),
                                                    CONCAT14((byte)((ulong)uVar20 >> 0x20) ^
                                                             (byte)((ulong)uVar13 >> 0x20),
                                                             CONCAT13((byte)((ulong)uVar20 >> 0x18)
                                                                      ^ (byte)((ulong)uVar13 >> 0x18
                                                                              ),
                                                                      CONCAT12((byte)((ulong)uVar20
                                                                                     >> 0x10) ^
                                                                               (byte)((ulong)uVar13
                                                                                     >> 0x10),
                                                                               CONCAT11((byte)((
                                                  ulong)uVar20 >> 8) ^ (byte)((ulong)uVar13 >> 8),
                                                  (byte)uVar20 ^ (byte)uVar13)))))));
            puVar7[-4] = CONCAT17((byte)((ulong)uVar19 >> 0x38) ^ (byte)((ulong)uVar11 >> 0x38),
                                  CONCAT16((byte)((ulong)uVar19 >> 0x30) ^
                                           (byte)((ulong)uVar11 >> 0x30),
                                           CONCAT15((byte)((ulong)uVar19 >> 0x28) ^
                                                    (byte)((ulong)uVar11 >> 0x28),
                                                    CONCAT14((byte)((ulong)uVar19 >> 0x20) ^
                                                             (byte)((ulong)uVar11 >> 0x20),
                                                             CONCAT13((byte)((ulong)uVar19 >> 0x18)
                                                                      ^ (byte)((ulong)uVar11 >> 0x18
                                                                              ),
                                                                      CONCAT12((byte)((ulong)uVar19
                                                                                     >> 0x10) ^
                                                                               (byte)((ulong)uVar11
                                                                                     >> 0x10),
                                                                               CONCAT11((byte)((
                                                  ulong)uVar19 >> 8) ^ (byte)((ulong)uVar11 >> 8),
                                                  (byte)uVar19 ^ (byte)uVar11)))))));
            puVar7[-1] = CONCAT17((byte)((ulong)uVar22 >> 0x38) ^ (byte)((ulong)uVar14 >> 0x38),
                                  CONCAT16((byte)((ulong)uVar22 >> 0x30) ^
                                           (byte)((ulong)uVar14 >> 0x30),
                                           CONCAT15((byte)((ulong)uVar22 >> 0x28) ^
                                                    (byte)((ulong)uVar14 >> 0x28),
                                                    CONCAT14((byte)((ulong)uVar22 >> 0x20) ^
                                                             (byte)((ulong)uVar14 >> 0x20),
                                                             CONCAT13((byte)((ulong)uVar22 >> 0x18)
                                                                      ^ (byte)((ulong)uVar14 >> 0x18
                                                                              ),
                                                                      CONCAT12((byte)((ulong)uVar22
                                                                                     >> 0x10) ^
                                                                               (byte)((ulong)uVar14
                                                                                     >> 0x10),
                                                                               CONCAT11((byte)((
                                                  ulong)uVar22 >> 8) ^ (byte)((ulong)uVar14 >> 8),
                                                  (byte)uVar22 ^ (byte)uVar14)))))));
            puVar7[-2] = CONCAT17((byte)((ulong)uVar21 >> 0x38) ^ (byte)((ulong)uVar12 >> 0x38),
                                  CONCAT16((byte)((ulong)uVar21 >> 0x30) ^
                                           (byte)((ulong)uVar12 >> 0x30),
                                           CONCAT15((byte)((ulong)uVar21 >> 0x28) ^
                                                    (byte)((ulong)uVar12 >> 0x28),
                                                    CONCAT14((byte)((ulong)uVar21 >> 0x20) ^
                                                             (byte)((ulong)uVar12 >> 0x20),
                                                             CONCAT13((byte)((ulong)uVar21 >> 0x18)
                                                                      ^ (byte)((ulong)uVar12 >> 0x18
                                                                              ),
                                                                      CONCAT12((byte)((ulong)uVar21
                                                                                     >> 0x10) ^
                                                                               (byte)((ulong)uVar12
                                                                                     >> 0x10),
                                                                               CONCAT11((byte)((
                                                  ulong)uVar21 >> 8) ^ (byte)((ulong)uVar12 >> 8),
                                                  (byte)uVar21 ^ (byte)uVar12)))))));
            puVar7[1] = CONCAT17((byte)((ulong)uVar24 >> 0x38) ^ (byte)((ulong)uVar16 >> 0x38),
                                 CONCAT16((byte)((ulong)uVar24 >> 0x30) ^
                                          (byte)((ulong)uVar16 >> 0x30),
                                          CONCAT15((byte)((ulong)uVar24 >> 0x28) ^
                                                   (byte)((ulong)uVar16 >> 0x28),
                                                   CONCAT14((byte)((ulong)uVar24 >> 0x20) ^
                                                            (byte)((ulong)uVar16 >> 0x20),
                                                            CONCAT13((byte)((ulong)uVar24 >> 0x18) ^
                                                                     (byte)((ulong)uVar16 >> 0x18),
                                                                     CONCAT12((byte)((ulong)uVar24
                                                                                    >> 0x10) ^
                                                                              (byte)((ulong)uVar16
                                                                                    >> 0x10),
                                                                              CONCAT11((byte)((ulong
                                                  )uVar24 >> 8) ^ (byte)((ulong)uVar16 >> 8),
                                                  (byte)uVar24 ^ (byte)uVar16)))))));
            *puVar7 = CONCAT17((byte)((ulong)uVar23 >> 0x38) ^ (byte)((ulong)uVar15 >> 0x38),
                               CONCAT16((byte)((ulong)uVar23 >> 0x30) ^
                                        (byte)((ulong)uVar15 >> 0x30),
                                        CONCAT15((byte)((ulong)uVar23 >> 0x28) ^
                                                 (byte)((ulong)uVar15 >> 0x28),
                                                 CONCAT14((byte)((ulong)uVar23 >> 0x20) ^
                                                          (byte)((ulong)uVar15 >> 0x20),
                                                          CONCAT13((byte)((ulong)uVar23 >> 0x18) ^
                                                                   (byte)((ulong)uVar15 >> 0x18),
                                                                   CONCAT12((byte)((ulong)uVar23 >>
                                                                                  0x10) ^
                                                                            (byte)((ulong)uVar15 >>
                                                                                  0x10),
                                                                            CONCAT11((byte)((ulong)
                                                  uVar23 >> 8) ^ (byte)((ulong)uVar15 >> 8),
                                                  (byte)uVar23 ^ (byte)uVar15)))))));
            puVar7[3] = CONCAT17((byte)((ulong)uVar26 >> 0x38) ^ (byte)((ulong)uVar18 >> 0x38),
                                 CONCAT16((byte)((ulong)uVar26 >> 0x30) ^
                                          (byte)((ulong)uVar18 >> 0x30),
                                          CONCAT15((byte)((ulong)uVar26 >> 0x28) ^
                                                   (byte)((ulong)uVar18 >> 0x28),
                                                   CONCAT14((byte)((ulong)uVar26 >> 0x20) ^
                                                            (byte)((ulong)uVar18 >> 0x20),
                                                            CONCAT13((byte)((ulong)uVar26 >> 0x18) ^
                                                                     (byte)((ulong)uVar18 >> 0x18),
                                                                     CONCAT12((byte)((ulong)uVar26
                                                                                    >> 0x10) ^
                                                                              (byte)((ulong)uVar18
                                                                                    >> 0x10),
                                                                              CONCAT11((byte)((ulong
                                                  )uVar26 >> 8) ^ (byte)((ulong)uVar18 >> 8),
                                                  (byte)uVar26 ^ (byte)uVar18)))))));
            puVar7[2] = CONCAT17((byte)((ulong)uVar25 >> 0x38) ^ (byte)((ulong)uVar17 >> 0x38),
                                 CONCAT16((byte)((ulong)uVar25 >> 0x30) ^
                                          (byte)((ulong)uVar17 >> 0x30),
                                          CONCAT15((byte)((ulong)uVar25 >> 0x28) ^
                                                   (byte)((ulong)uVar17 >> 0x28),
                                                   CONCAT14((byte)((ulong)uVar25 >> 0x20) ^
                                                            (byte)((ulong)uVar17 >> 0x20),
                                                            CONCAT13((byte)((ulong)uVar25 >> 0x18) ^
                                                                     (byte)((ulong)uVar17 >> 0x18),
                                                                     CONCAT12((byte)((ulong)uVar25
                                                                                    >> 0x10) ^
                                                                              (byte)((ulong)uVar17
                                                                                    >> 0x10),
                                                                              CONCAT11((byte)((ulong
                                                  )uVar25 >> 8) ^ (byte)((ulong)uVar17 >> 8),
                                                  (byte)uVar25 ^ (byte)uVar17)))))));
            uVar5 = uVar5 - 0x40;
            puVar7 = puVar7 + 8;
            puVar9 = puVar9 + 8;
          } while (uVar5 != 0);
          if (uVar1 == uVar4) goto code_r0x00301adc;
          uVar5 = uVar4;
          if ((uVar1 & 0x38) == 0) goto code_r0x00301ab4;
        }
        uVar4 = uVar1 & 0xfffffff8;
        lVar8 = uVar5 - uVar4;
        puVar7 = (undefined8 *)(auStack_7ffffffe + uVar5 + 0x8000004e);
        puVar9 = (undefined8 *)(unaff_x23 + uVar5);
        do {
          uVar11 = *puVar7;
          uVar13 = *puVar9;
          *puVar9 = CONCAT17((byte)((ulong)uVar13 >> 0x38) ^ (byte)((ulong)uVar11 >> 0x38),
                             CONCAT16((byte)((ulong)uVar13 >> 0x30) ^ (byte)((ulong)uVar11 >> 0x30),
                                      CONCAT15((byte)((ulong)uVar13 >> 0x28) ^
                                               (byte)((ulong)uVar11 >> 0x28),
                                               CONCAT14((byte)((ulong)uVar13 >> 0x20) ^
                                                        (byte)((ulong)uVar11 >> 0x20),
                                                        CONCAT13((byte)((ulong)uVar13 >> 0x18) ^
                                                                 (byte)((ulong)uVar11 >> 0x18),
                                                                 CONCAT12((byte)((ulong)uVar13 >>
                                                                                0x10) ^
                                                                          (byte)((ulong)uVar11 >>
                                                                                0x10),
                                                                          CONCAT11((byte)((ulong)
                                                  uVar13 >> 8) ^ (byte)((ulong)uVar11 >> 8),
                                                  (byte)uVar13 ^ (byte)uVar11)))))));
          lVar8 = lVar8 + 8;
          puVar7 = puVar7 + 1;
          puVar9 = puVar9 + 1;
        } while (lVar8 != 0);
        if (uVar1 == uVar4) goto code_r0x00301adc;
      }
code_r0x00301ab4:
      lVar8 = uVar1 - uVar4;
      pbVar6 = auStack_7ffffffe + uVar4 + 0x8000004e;
      pbVar10 = (byte *)(unaff_x23 + uVar4);
      do {
        *pbVar10 = *pbVar10 ^ *pbVar6;
        lVar8 = lVar8 + -1;
        pbVar6 = pbVar6 + 1;
        pbVar10 = pbVar10 + 1;
      } while (lVar8 != 0);
    }
code_r0x00301adc:
    unaff_x22 = unaff_x22 - uVar1;
    if (unaff_x22 == 0) {
      uVar11 = 1;
      goto code_r0x00301c20;
    }
    if (1 < in_stack_00000608 - 1) break;
    iVar2 = *(int *)(in_stack_00000370 + 4);
    iVar3 = (**(code **)(in_stack_00000378 + 0x20))(unaff_x29 + -0xa0,in_stack_00000018);
    if (iVar3 == 0) break;
    uVar12 = in_stack_00000010[8];
    uVar13 = in_stack_00000010[0xb];
    uVar11 = in_stack_00000010[10];
    in_stack_00000018[9] = in_stack_00000010[9];
    in_stack_00000018[8] = uVar12;
    in_stack_00000018[0xb] = uVar13;
    in_stack_00000018[10] = uVar11;
    uVar12 = in_stack_00000010[4];
    uVar13 = in_stack_00000010[7];
    uVar11 = in_stack_00000010[6];
    in_stack_00000018[5] = in_stack_00000010[5];
    in_stack_00000018[4] = uVar12;
    in_stack_00000018[7] = uVar13;
    in_stack_00000018[6] = uVar11;
    uVar12 = in_stack_00000010[0x10];
    uVar13 = in_stack_00000010[0x13];
    uVar11 = in_stack_00000010[0x12];
    in_stack_00000018[0x11] = in_stack_00000010[0x11];
    in_stack_00000018[0x10] = uVar12;
    in_stack_00000018[0x13] = uVar13;
    in_stack_00000018[0x12] = uVar11;
    uVar12 = in_stack_00000010[0xc];
    uVar13 = in_stack_00000010[0xf];
    uVar11 = in_stack_00000010[0xe];
    in_stack_00000018[0xd] = in_stack_00000010[0xd];
    in_stack_00000018[0xc] = uVar12;
    in_stack_00000018[0xf] = uVar13;
    in_stack_00000018[0xe] = uVar11;
    in_stack_00000018[0x1a] = in_stack_00000010[0x1a];
    uVar15 = in_stack_00000010[0x19];
    uVar14 = in_stack_00000010[0x18];
    uVar12 = in_stack_00000010[0x15];
    uVar13 = in_stack_00000010[0x14];
    uVar11 = in_stack_00000010[0x16];
    in_stack_00000018[0x17] = in_stack_00000010[0x17];
    in_stack_00000018[0x16] = uVar11;
    in_stack_00000018[0x19] = uVar15;
    in_stack_00000018[0x18] = uVar14;
    in_stack_00000018[0x15] = uVar12;
    in_stack_00000018[0x14] = uVar13;
    uVar11 = *in_stack_00000010;
    uVar12 = in_stack_00000010[3];
    uVar13 = in_stack_00000010[2];
    in_stack_00000018[1] = in_stack_00000010[1];
    *in_stack_00000018 = uVar11;
    in_stack_00000018[3] = uVar12;
    in_stack_00000018[2] = uVar13;
    iVar2 = (**(code **)(in_stack_00000378 + 0x18))(in_stack_00000018,unaff_x29 + -0xa0,(long)iVar2)
    ;
    if (iVar2 == 0) break;
    iVar2 = (**(code **)(in_stack_00000378 + 0x20))(&uStack0000000000000090,in_stack_00000018);
    uVar11 = in_stack_00000008[0x14];
    uVar12 = in_stack_00000008[0x17];
    uVar13 = in_stack_00000008[0x16];
    in_stack_00000018[0x15] = in_stack_00000008[0x15];
    in_stack_00000018[0x14] = uVar11;
    in_stack_00000018[0x17] = uVar12;
    in_stack_00000018[0x16] = uVar13;
    uVar11 = in_stack_00000008[0x18];
    in_stack_00000018[0x19] = in_stack_00000008[0x19];
    in_stack_00000018[0x18] = uVar11;
    in_stack_00000018[0x1a] = in_stack_00000008[0x1a];
    uVar11 = in_stack_00000008[0xc];
    uVar12 = in_stack_00000008[0xf];
    uVar13 = in_stack_00000008[0xe];
    in_stack_00000018[0xd] = in_stack_00000008[0xd];
    in_stack_00000018[0xc] = uVar11;
    in_stack_00000018[0xf] = uVar12;
    in_stack_00000018[0xe] = uVar13;
    uVar11 = in_stack_00000008[0x10];
    uVar12 = in_stack_00000008[0x13];
    uVar13 = in_stack_00000008[0x12];
    in_stack_00000018[0x11] = in_stack_00000008[0x11];
    in_stack_00000018[0x10] = uVar11;
    in_stack_00000018[0x13] = uVar12;
    in_stack_00000018[0x12] = uVar13;
    uVar11 = in_stack_00000008[4];
    uVar12 = in_stack_00000008[7];
    uVar13 = in_stack_00000008[6];
    in_stack_00000018[5] = in_stack_00000008[5];
    in_stack_00000018[4] = uVar11;
    in_stack_00000018[7] = uVar12;
    in_stack_00000018[6] = uVar13;
    uVar11 = in_stack_00000008[8];
    uVar12 = in_stack_00000008[0xb];
    uVar13 = in_stack_00000008[10];
    in_stack_00000018[9] = in_stack_00000008[9];
    in_stack_00000018[8] = uVar11;
    in_stack_00000018[0xb] = uVar12;
    in_stack_00000018[10] = uVar13;
    uVar11 = *in_stack_00000008;
    uVar12 = in_stack_00000008[3];
    uVar13 = in_stack_00000008[2];
    in_stack_00000018[1] = in_stack_00000008[1];
    *in_stack_00000018 = uVar11;
    in_stack_00000018[3] = uVar12;
    in_stack_00000018[2] = uVar13;
    in_stack_00000608 = 3;
    if (iVar2 == 0) break;
    unaff_x23 = unaff_x23 + uVar1;
    param_1 = auStack_7ffffffe + 0x8000060e;
    param_2 = &uStack00000000000000d0;
  }
  uVar11 = 0;
code_r0x00301c20:
  func_0x0036e464(&uStack0000000000000090,0x40);
  func_0x0036e464(auStack_7ffffffe + 0x8000060e,0x2a0);
  func_0x0036e464(auStack_7ffffffe + 0x8000036e,0x2a0);
  func_0x0036e464(&uStack00000000000000d0,0x2a0);
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
    return uVar11;
  }
_aws_lc_0_24_0_CRYPTO_library_init:
  uVar11 = ___stack_chk_fail();
  return uVar11;
}

