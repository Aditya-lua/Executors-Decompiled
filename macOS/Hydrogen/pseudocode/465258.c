
undefined8
FUN_00465258(ulong param_1,undefined1 param_2 [16],undefined1 param_3 [16],undefined1 param_4 [16],
            undefined1 param_5 [16],undefined1 param_6 [16])

{
  undefined1 in_ZR;
  bool bVar1;
  ulong uVar2;
  ulong uVar3;
  long in_x9;
  undefined8 *puVar4;
  ulong in_x12;
  long unaff_x20;
  bool bVar5;
  byte *unaff_x23;
  ulong unaff_x24;
  ulong unaff_x25;
  ulong unaff_x26;
  ulong uVar6;
  ulong unaff_x27;
  byte bVar8;
  byte bVar9;
  byte bVar10;
  byte bVar11;
  byte bVar12;
  byte bVar13;
  undefined8 uVar7;
  byte bVar14;
  byte bVar16;
  byte bVar17;
  byte bVar18;
  byte bVar19;
  byte bVar20;
  byte bVar21;
  undefined8 uVar15;
  byte bVar22;
  long lVar23;
  long lVar24;
  byte bVar25;
  byte bVar26;
  byte bVar27;
  byte bVar28;
  byte bVar29;
  byte bVar30;
  byte bVar31;
  byte bVar32;
  byte bVar33;
  byte bVar34;
  byte bVar35;
  byte bVar36;
  byte bVar37;
  byte bVar38;
  byte bVar39;
  byte bVar40;
  long lVar41;
  long lVar42;
  undefined8 uVar43;
  undefined8 uVar44;
  long in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  long in_stack_00000020;
  long in_stack_00000028;
  long in_stack_00000038;
  
  uVar44 = param_6._8_8_;
  uVar43 = param_6._0_8_;
  lVar42 = param_5._8_8_;
  lVar41 = param_5._0_8_;
  bVar40 = param_4[0xf];
  bVar39 = param_4[0xe];
  bVar38 = param_4[0xd];
  bVar37 = param_4[0xc];
  bVar36 = param_4[0xb];
  bVar35 = param_4[10];
  bVar34 = param_4[9];
  bVar33 = param_4[8];
  bVar32 = param_4[7];
  bVar31 = param_4[6];
  bVar30 = param_4[5];
  bVar29 = param_4[4];
  bVar28 = param_4[3];
  bVar27 = param_4[2];
  bVar26 = param_4[1];
  bVar25 = param_4[0];
code_r0x00465258:
  uVar2 = in_x12;
  if (!(bool)in_ZR) {
    do {
      uVar6 = unaff_x26;
      if (*(char *)(in_x9 + uVar2) == '\n') goto LAB_00465278;
      uVar2 = uVar2 + 1;
    } while (param_1 != uVar2);
  }
LAB_004652b0:
  unaff_x26 = unaff_x24;
code_r0x004652b4:
  do {
    if (unaff_x24 == unaff_x25) {
      return 0;
    }
    bVar5 = true;
    bVar25 = *unaff_x23;
    uVar3 = unaff_x25;
    uVar2 = unaff_x25;
    uVar6 = unaff_x24;
    while( true ) {
      unaff_x25 = uVar3;
      if (((bVar25 & 1) != 0) &&
         (uVar3 = (**(code **)(in_stack_00000038 + 0x18))(), (uVar3 & 1) != 0)) {
        return 1;
      }
      if (uVar6 == uVar2) {
        bVar1 = false;
      }
      else {
        bVar1 = *(char *)(in_stack_00000008 + uVar6) == '\n';
      }
      *unaff_x23 = bVar1;
      uVar2 = (**(code **)(in_stack_00000038 + 0x18))();
      bVar25 = 10;
      bVar26 = 10;
      bVar27 = 10;
      bVar28 = 10;
      bVar29 = 10;
      bVar30 = 10;
      bVar31 = 10;
      bVar32 = 10;
      bVar33 = 10;
      bVar34 = 10;
      bVar35 = 10;
      bVar36 = 10;
      bVar37 = 10;
      bVar38 = 10;
      bVar39 = 10;
      bVar40 = 10;
      if ((uVar2 & 1) != 0) {
        return 1;
      }
      if (bVar5) {
        return 0;
      }
      lVar41 = in_stack_00000020;
      lVar42 = in_stack_00000028;
      uVar43 = in_stack_00000010;
      uVar44 = in_stack_00000018;
      if (unaff_x24 < unaff_x26) break;
      while( true ) {
        param_1 = unaff_x24 - unaff_x26;
        in_x9 = unaff_x20 + unaff_x26;
        uVar6 = unaff_x26;
        if (param_1 < 0x10) {
          if (unaff_x24 == unaff_x26) goto LAB_004652b0;
          uVar2 = 0;
          while (*(char *)(in_x9 + uVar2) != '\n') {
            uVar2 = uVar2 + 1;
            if (param_1 == uVar2) goto LAB_004652b0;
          }
        }
        else {
          puVar4 = (undefined8 *)(in_x9 + 7U & 0xfffffffffffffff8);
          in_x12 = (long)puVar4 - in_x9;
          if (in_x12 == 0) goto code_r0x0046521c;
          uVar2 = 0;
          while (*(char *)(in_x9 + uVar2) != '\n') {
            uVar2 = uVar2 + 1;
            if (in_x12 == uVar2) goto code_r0x00465214;
          }
        }
LAB_00465278:
        unaff_x26 = uVar6 + uVar2 + 1;
        if ((uVar6 + uVar2 < unaff_x24) && (*(char *)(unaff_x20 + uVar6 + uVar2) == '\n')) break;
        if (unaff_x24 < unaff_x26) goto code_r0x004652b4;
      }
      bVar5 = false;
      bVar25 = *unaff_x23;
      uVar3 = unaff_x26;
      uVar2 = unaff_x25;
      uVar6 = unaff_x26;
    }
  } while( true );
code_r0x00465214:
  if (param_1 - 0x10 < in_x12) goto code_r0x00465250;
code_r0x0046521c:
  uVar15 = puVar4[1];
  uVar7 = *puVar4;
  bVar8 = (byte)((ulong)uVar7 >> 8);
  bVar9 = (byte)((ulong)uVar7 >> 0x10);
  bVar10 = (byte)((ulong)uVar7 >> 0x18);
  bVar11 = (byte)((ulong)uVar7 >> 0x20);
  bVar12 = (byte)((ulong)uVar7 >> 0x28);
  bVar13 = (byte)((ulong)uVar7 >> 0x30);
  bVar14 = (byte)((ulong)uVar7 >> 0x38);
  bVar16 = (byte)((ulong)uVar15 >> 8);
  bVar17 = (byte)((ulong)uVar15 >> 0x10);
  bVar18 = (byte)((ulong)uVar15 >> 0x18);
  bVar19 = (byte)((ulong)uVar15 >> 0x20);
  bVar20 = (byte)((ulong)uVar15 >> 0x28);
  bVar21 = (byte)((ulong)uVar15 >> 0x30);
  bVar22 = (byte)((ulong)uVar15 >> 0x38);
  lVar23 = lVar41 - CONCAT17(bVar14 ^ bVar32,
                             CONCAT16(bVar13 ^ bVar31,
                                      CONCAT15(bVar12 ^ bVar30,
                                               CONCAT14(bVar11 ^ bVar29,
                                                        CONCAT13(bVar10 ^ bVar28,
                                                                 CONCAT12(bVar9 ^ bVar27,
                                                                          CONCAT11(bVar8 ^ bVar26,
                                                                                   (byte)uVar7 ^
                                                                                   bVar25)))))));
  lVar24 = lVar42 - CONCAT17(bVar22 ^ bVar40,
                             CONCAT16(bVar21 ^ bVar39,
                                      CONCAT15(bVar20 ^ bVar38,
                                               CONCAT14(bVar19 ^ bVar37,
                                                        CONCAT13(bVar18 ^ bVar36,
                                                                 CONCAT12(bVar17 ^ bVar35,
                                                                          CONCAT11(bVar16 ^ bVar34,
                                                                                   (byte)uVar15 ^
                                                                                   bVar33)))))));
  if ((unaff_x27 &
      (CONCAT17((byte)((ulong)lVar23 >> 0x38) | bVar14 ^ (byte)((ulong)uVar43 >> 0x38),
                CONCAT16((byte)((ulong)lVar23 >> 0x30) | bVar13 ^ (byte)((ulong)uVar43 >> 0x30),
                         CONCAT15((byte)((ulong)lVar23 >> 0x28) |
                                  bVar12 ^ (byte)((ulong)uVar43 >> 0x28),
                                  CONCAT14((byte)((ulong)lVar23 >> 0x20) |
                                           bVar11 ^ (byte)((ulong)uVar43 >> 0x20),
                                           CONCAT13((byte)((ulong)lVar23 >> 0x18) |
                                                    bVar10 ^ (byte)((ulong)uVar43 >> 0x18),
                                                    CONCAT12((byte)((ulong)lVar23 >> 0x10) |
                                                             bVar9 ^ (byte)((ulong)uVar43 >> 0x10),
                                                             CONCAT11((byte)((ulong)lVar23 >> 8) |
                                                                      bVar8 ^ (byte)((ulong)uVar43
                                                                                    >> 8),
                                                                      (byte)lVar23 |
                                                                      (byte)uVar7 ^ (byte)uVar43))))
                                 ))) &
       CONCAT17((byte)((ulong)lVar24 >> 0x38) | bVar22 ^ (byte)((ulong)uVar44 >> 0x38),
                CONCAT16((byte)((ulong)lVar24 >> 0x30) | bVar21 ^ (byte)((ulong)uVar44 >> 0x30),
                         CONCAT15((byte)((ulong)lVar24 >> 0x28) |
                                  bVar20 ^ (byte)((ulong)uVar44 >> 0x28),
                                  CONCAT14((byte)((ulong)lVar24 >> 0x20) |
                                           bVar19 ^ (byte)((ulong)uVar44 >> 0x20),
                                           CONCAT13((byte)((ulong)lVar24 >> 0x18) |
                                                    bVar18 ^ (byte)((ulong)uVar44 >> 0x18),
                                                    CONCAT12((byte)((ulong)lVar24 >> 0x10) |
                                                             bVar17 ^ (byte)((ulong)uVar44 >> 0x10),
                                                             CONCAT11((byte)((ulong)lVar24 >> 8) |
                                                                      bVar16 ^ (byte)((ulong)uVar44
                                                                                     >> 8),
                                                                      (byte)lVar24 |
                                                                      (byte)uVar15 ^ (byte)uVar44)))
                                          )))) ^ 0xffffffffffffffff)) != 0) goto code_r0x00465250;
  in_x12 = in_x12 + 0x10;
  puVar4 = puVar4 + 2;
  goto code_r0x00465214;
code_r0x00465250:
  in_ZR = param_1 == in_x12;
  goto code_r0x00465258;
}

