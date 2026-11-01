
void FUN_000fec58(long param_1,undefined1 param_2 [16],undefined1 param_3 [16],
                 undefined1 param_4 [16],undefined1 param_5 [16],long param_6)

{
  undefined4 uVar1;
  int in_w4;
  long in_x5;
  char in_w6;
  undefined4 in_w7;
  undefined8 *in_x9;
  long in_x10;
  long in_x11;
  long in_x12;
  long in_x13;
  undefined8 *in_x14;
  long lVar2;
  char cVar3;
  char cVar4;
  char cVar5;
  char cVar6;
  char cVar7;
  char cVar8;
  char cVar9;
  char cVar10;
  byte bVar11;
  byte bVar12;
  byte bVar13;
  byte bVar14;
  byte bVar15;
  byte bVar16;
  byte bVar17;
  byte bVar18;
  byte bVar19;
  byte bVar20;
  byte bVar21;
  byte bVar22;
  byte bVar23;
  byte bVar24;
  byte bVar25;
  byte bVar26;
  byte bVar27;
  undefined8 uVar28;
  byte bVar29;
  byte bVar30;
  byte bVar31;
  byte bVar32;
  byte bVar33;
  byte bVar34;
  byte bVar35;
  byte bVar36;
  byte bVar37;
  undefined8 uVar38;
  byte bVar39;
  byte bVar40;
  byte bVar41;
  byte bVar42;
  byte bVar43;
  byte bVar44;
  
  bVar36 = param_5[0xf];
  bVar44 = param_5[0xe];
  bVar43 = param_5[0xd];
  bVar42 = param_5[0xc];
  bVar34 = param_5[0xb];
  bVar41 = param_5[10];
  bVar40 = param_5[9];
  bVar37 = param_5[8];
  bVar35 = param_5[7];
  bVar39 = param_5[6];
  bVar33 = param_5[5];
  bVar32 = param_5[4];
  bVar31 = param_5[3];
  bVar30 = param_5[2];
  bVar29 = param_5[1];
  bVar27 = param_5[0];
  uVar38 = param_4._8_8_;
  uVar28 = param_4._0_8_;
  bVar26 = param_3[0xf];
  bVar25 = param_3[0xe];
  bVar24 = param_3[0xd];
  bVar23 = param_3[0xc];
  bVar22 = param_3[0xb];
  bVar21 = param_3[10];
  bVar20 = param_3[9];
  bVar19 = param_3[8];
  bVar18 = param_3[7];
  bVar17 = param_3[6];
  bVar16 = param_3[5];
  bVar15 = param_3[4];
  bVar14 = param_3[3];
  bVar13 = param_3[2];
  bVar12 = param_3[1];
  bVar11 = param_3[0];
  cVar10 = param_2[7];
  cVar9 = param_2[6];
  cVar8 = param_2[5];
  cVar7 = param_2[4];
  cVar6 = param_2[3];
  cVar5 = param_2[2];
  cVar4 = param_2[1];
  cVar3 = param_2[0];
  do {
    in_x9[0xd] = uVar38;
    in_x9[0xc] = uVar28;
    in_x9[0xf] = CONCAT17(bVar36,CONCAT16(bVar44,CONCAT15(bVar43,CONCAT14(bVar42,CONCAT13(bVar34,
                                                  CONCAT12(bVar41,CONCAT11(bVar40,bVar37)))))));
    in_x9[0xe] = CONCAT17(bVar35,CONCAT16(bVar39,CONCAT15(bVar33,CONCAT14(bVar32,CONCAT13(bVar31,
                                                  CONCAT12(bVar30,CONCAT11(bVar29,bVar27)))))));
    if (in_x12 != 0x20) {
      uVar28 = in_x14[4];
      bVar27 = -((char)uVar28 == cVar3);
      bVar29 = -((char)((ulong)uVar28 >> 8) == cVar4);
      bVar30 = -((char)((ulong)uVar28 >> 0x10) == cVar5);
      bVar31 = -((char)((ulong)uVar28 >> 0x18) == cVar6);
      bVar32 = -((char)((ulong)uVar28 >> 0x20) == cVar7);
      bVar33 = -((char)((ulong)uVar28 >> 0x28) == cVar8);
      bVar35 = -((char)((ulong)uVar28 >> 0x30) == cVar9);
      bVar37 = -((char)((ulong)uVar28 >> 0x38) == cVar10);
      bVar39 = (char)bVar29 >> 7;
      bVar40 = (char)bVar31 >> 7;
      in_x9[0x11] = CONCAT17(bVar26 & bVar40,
                             CONCAT16(bVar25 & bVar40,
                                      CONCAT15(bVar24 & bVar40,
                                               CONCAT14(bVar23 & bVar31,
                                                        CONCAT13(bVar22 & (byte)((uint)(int)(short)(
                                                  char)bVar30 >> 0x18),
                                                  CONCAT12(bVar21 & (byte)((uint)(int)(short)(char)
                                                  bVar30 >> 0x10),
                                                  CONCAT11(bVar20 & (char)bVar30 >> 7,
                                                           bVar19 & bVar30)))))));
      in_x9[0x10] = CONCAT17(bVar18 & bVar39,
                             CONCAT16(bVar17 & bVar39,
                                      CONCAT15(bVar16 & bVar39,
                                               CONCAT14(bVar15 & bVar29,
                                                        CONCAT13(bVar14 & (byte)((uint)(int)(short)(
                                                  char)bVar27 >> 0x18),
                                                  CONCAT12(bVar13 & (byte)((uint)(int)(short)(char)
                                                  bVar27 >> 0x10),
                                                  CONCAT11(bVar12 & (char)bVar27 >> 7,
                                                           bVar11 & bVar27)))))));
      in_x9[0x13] = CONCAT17(bVar26 & (byte)((uint)(int)(short)(char)bVar37 >> 0x18),
                             CONCAT16(bVar25 & (byte)((uint)(int)(short)(char)bVar37 >> 0x10),
                                      CONCAT15(bVar24 & (char)bVar37 >> 7,
                                               CONCAT14(bVar23 & bVar37,
                                                        CONCAT13(bVar22 & (byte)((uint)(int)(short)(
                                                  char)bVar35 >> 0x18),
                                                  CONCAT12(bVar21 & (byte)((uint)(int)(short)(char)
                                                  bVar35 >> 0x10),
                                                  CONCAT11(bVar20 & (char)bVar35 >> 7,
                                                           bVar19 & bVar35)))))));
      in_x9[0x12] = CONCAT17(bVar18 & (byte)((uint)(int)(short)(char)bVar33 >> 0x18),
                             CONCAT16(bVar17 & (byte)((uint)(int)(short)(char)bVar33 >> 0x10),
                                      CONCAT15(bVar16 & (char)bVar33 >> 7,
                                               CONCAT14(bVar15 & bVar33,
                                                        CONCAT13(bVar14 & (byte)((uint)(int)(short)(
                                                  char)bVar32 >> 0x18),
                                                  CONCAT12(bVar13 & (byte)((uint)(int)(short)(char)
                                                  bVar32 >> 0x10),
                                                  CONCAT11(bVar12 & (char)bVar32 >> 7,
                                                           bVar11 & bVar32)))))));
      if (in_x12 != 0x28) {
        uVar28 = in_x14[5];
        bVar27 = -((char)uVar28 == cVar3);
        bVar29 = -((char)((ulong)uVar28 >> 8) == cVar4);
        bVar30 = -((char)((ulong)uVar28 >> 0x10) == cVar5);
        bVar31 = -((char)((ulong)uVar28 >> 0x18) == cVar6);
        bVar32 = -((char)((ulong)uVar28 >> 0x20) == cVar7);
        bVar33 = -((char)((ulong)uVar28 >> 0x28) == cVar8);
        bVar35 = -((char)((ulong)uVar28 >> 0x30) == cVar9);
        bVar37 = -((char)((ulong)uVar28 >> 0x38) == cVar10);
        bVar39 = (char)bVar29 >> 7;
        bVar40 = (char)bVar31 >> 7;
        in_x9[0x15] = CONCAT17(bVar26 & bVar40,
                               CONCAT16(bVar25 & bVar40,
                                        CONCAT15(bVar24 & bVar40,
                                                 CONCAT14(bVar23 & bVar31,
                                                          CONCAT13(bVar22 & (byte)((uint)(int)(short
                                                  )(char)bVar30 >> 0x18),
                                                  CONCAT12(bVar21 & (byte)((uint)(int)(short)(char)
                                                  bVar30 >> 0x10),
                                                  CONCAT11(bVar20 & (char)bVar30 >> 7,
                                                           bVar19 & bVar30)))))));
        in_x9[0x14] = CONCAT17(bVar18 & bVar39,
                               CONCAT16(bVar17 & bVar39,
                                        CONCAT15(bVar16 & bVar39,
                                                 CONCAT14(bVar15 & bVar29,
                                                          CONCAT13(bVar14 & (byte)((uint)(int)(short
                                                  )(char)bVar27 >> 0x18),
                                                  CONCAT12(bVar13 & (byte)((uint)(int)(short)(char)
                                                  bVar27 >> 0x10),
                                                  CONCAT11(bVar12 & (char)bVar27 >> 7,
                                                           bVar11 & bVar27)))))));
        in_x9[0x17] = CONCAT17(bVar26 & (byte)((uint)(int)(short)(char)bVar37 >> 0x18),
                               CONCAT16(bVar25 & (byte)((uint)(int)(short)(char)bVar37 >> 0x10),
                                        CONCAT15(bVar24 & (char)bVar37 >> 7,
                                                 CONCAT14(bVar23 & bVar37,
                                                          CONCAT13(bVar22 & (byte)((uint)(int)(short
                                                  )(char)bVar35 >> 0x18),
                                                  CONCAT12(bVar21 & (byte)((uint)(int)(short)(char)
                                                  bVar35 >> 0x10),
                                                  CONCAT11(bVar20 & (char)bVar35 >> 7,
                                                           bVar19 & bVar35)))))));
        in_x9[0x16] = CONCAT17(bVar18 & (byte)((uint)(int)(short)(char)bVar33 >> 0x18),
                               CONCAT16(bVar17 & (byte)((uint)(int)(short)(char)bVar33 >> 0x10),
                                        CONCAT15(bVar16 & (char)bVar33 >> 7,
                                                 CONCAT14(bVar15 & bVar33,
                                                          CONCAT13(bVar14 & (byte)((uint)(int)(short
                                                  )(char)bVar32 >> 0x18),
                                                  CONCAT12(bVar13 & (byte)((uint)(int)(short)(char)
                                                  bVar32 >> 0x10),
                                                  CONCAT11(bVar12 & (char)bVar32 >> 7,
                                                           bVar11 & bVar32)))))));
        if (in_x12 != 0x30) {
          uVar28 = in_x14[6];
          bVar27 = -((char)uVar28 == cVar3);
          bVar29 = -((char)((ulong)uVar28 >> 8) == cVar4);
          bVar30 = -((char)((ulong)uVar28 >> 0x10) == cVar5);
          bVar31 = -((char)((ulong)uVar28 >> 0x18) == cVar6);
          bVar32 = -((char)((ulong)uVar28 >> 0x20) == cVar7);
          bVar33 = -((char)((ulong)uVar28 >> 0x28) == cVar8);
          bVar35 = -((char)((ulong)uVar28 >> 0x30) == cVar9);
          bVar37 = -((char)((ulong)uVar28 >> 0x38) == cVar10);
          bVar39 = (char)bVar29 >> 7;
          bVar40 = (char)bVar31 >> 7;
          in_x9[0x19] = CONCAT17(bVar26 & bVar40,
                                 CONCAT16(bVar25 & bVar40,
                                          CONCAT15(bVar24 & bVar40,
                                                   CONCAT14(bVar23 & bVar31,
                                                            CONCAT13(bVar22 & (byte)((uint)(int)(
                                                  short)(char)bVar30 >> 0x18),
                                                  CONCAT12(bVar21 & (byte)((uint)(int)(short)(char)
                                                  bVar30 >> 0x10),
                                                  CONCAT11(bVar20 & (char)bVar30 >> 7,
                                                           bVar19 & bVar30)))))));
          in_x9[0x18] = CONCAT17(bVar18 & bVar39,
                                 CONCAT16(bVar17 & bVar39,
                                          CONCAT15(bVar16 & bVar39,
                                                   CONCAT14(bVar15 & bVar29,
                                                            CONCAT13(bVar14 & (byte)((uint)(int)(
                                                  short)(char)bVar27 >> 0x18),
                                                  CONCAT12(bVar13 & (byte)((uint)(int)(short)(char)
                                                  bVar27 >> 0x10),
                                                  CONCAT11(bVar12 & (char)bVar27 >> 7,
                                                           bVar11 & bVar27)))))));
          in_x9[0x1b] = CONCAT17(bVar26 & (byte)((uint)(int)(short)(char)bVar37 >> 0x18),
                                 CONCAT16(bVar25 & (byte)((uint)(int)(short)(char)bVar37 >> 0x10),
                                          CONCAT15(bVar24 & (char)bVar37 >> 7,
                                                   CONCAT14(bVar23 & bVar37,
                                                            CONCAT13(bVar22 & (byte)((uint)(int)(
                                                  short)(char)bVar35 >> 0x18),
                                                  CONCAT12(bVar21 & (byte)((uint)(int)(short)(char)
                                                  bVar35 >> 0x10),
                                                  CONCAT11(bVar20 & (char)bVar35 >> 7,
                                                           bVar19 & bVar35)))))));
          in_x9[0x1a] = CONCAT17(bVar18 & (byte)((uint)(int)(short)(char)bVar33 >> 0x18),
                                 CONCAT16(bVar17 & (byte)((uint)(int)(short)(char)bVar33 >> 0x10),
                                          CONCAT15(bVar16 & (char)bVar33 >> 7,
                                                   CONCAT14(bVar15 & bVar33,
                                                            CONCAT13(bVar14 & (byte)((uint)(int)(
                                                  short)(char)bVar32 >> 0x18),
                                                  CONCAT12(bVar13 & (byte)((uint)(int)(short)(char)
                                                  bVar32 >> 0x10),
                                                  CONCAT11(bVar12 & (char)bVar32 >> 7,
                                                           bVar11 & bVar32)))))));
        }
      }
    }
    do {
      do {
        do {
          while( true ) {
            in_x13 = in_x13 + 1;
            in_x9 = (undefined8 *)((long)in_x9 + (long)*(int *)(param_6 + 0x40) * 4);
            in_x14 = (undefined8 *)((long)in_x14 + param_1);
            if ((int)in_x13 == in_w4) {
              return;
            }
            if ((undefined8 *)(in_x5 + in_x10 + in_x13 * param_1) <= in_x9 ||
                (undefined8 *)((long)in_x9 + in_x11) <= in_x14) break;
            lVar2 = 0;
            do {
              uVar1 = in_w7;
              if (*(char *)((long)in_x14 + lVar2) != in_w6) {
                uVar1 = 0;
              }
              *(undefined4 *)((long)in_x9 + lVar2 * 4) = uVar1;
              lVar2 = lVar2 + 1;
            } while (in_x10 != lVar2);
          }
          uVar28 = *in_x14;
          bVar27 = -((char)uVar28 == cVar3);
          bVar29 = -((char)((ulong)uVar28 >> 8) == cVar4);
          bVar30 = -((char)((ulong)uVar28 >> 0x10) == cVar5);
          bVar31 = -((char)((ulong)uVar28 >> 0x18) == cVar6);
          bVar32 = -((char)((ulong)uVar28 >> 0x20) == cVar7);
          bVar33 = -((char)((ulong)uVar28 >> 0x28) == cVar8);
          bVar35 = -((char)((ulong)uVar28 >> 0x30) == cVar9);
          bVar37 = -((char)((ulong)uVar28 >> 0x38) == cVar10);
          bVar39 = (char)bVar29 >> 7;
          bVar40 = (char)bVar31 >> 7;
          in_x9[1] = CONCAT17(bVar26 & bVar40,
                              CONCAT16(bVar25 & bVar40,
                                       CONCAT15(bVar24 & bVar40,
                                                CONCAT14(bVar23 & bVar31,
                                                         CONCAT13(bVar22 & (byte)((uint)(int)(short)
                                                  (char)bVar30 >> 0x18),
                                                  CONCAT12(bVar21 & (byte)((uint)(int)(short)(char)
                                                  bVar30 >> 0x10),
                                                  CONCAT11(bVar20 & (char)bVar30 >> 7,
                                                           bVar19 & bVar30)))))));
          *in_x9 = CONCAT17(bVar18 & bVar39,
                            CONCAT16(bVar17 & bVar39,
                                     CONCAT15(bVar16 & bVar39,
                                              CONCAT14(bVar15 & bVar29,
                                                       CONCAT13(bVar14 & (byte)((uint)(int)(short)(
                                                  char)bVar27 >> 0x18),
                                                  CONCAT12(bVar13 & (byte)((uint)(int)(short)(char)
                                                  bVar27 >> 0x10),
                                                  CONCAT11(bVar12 & (char)bVar27 >> 7,
                                                           bVar11 & bVar27)))))));
          in_x9[3] = CONCAT17(bVar26 & (byte)((uint)(int)(short)(char)bVar37 >> 0x18),
                              CONCAT16(bVar25 & (byte)((uint)(int)(short)(char)bVar37 >> 0x10),
                                       CONCAT15(bVar24 & (char)bVar37 >> 7,
                                                CONCAT14(bVar23 & bVar37,
                                                         CONCAT13(bVar22 & (byte)((uint)(int)(short)
                                                  (char)bVar35 >> 0x18),
                                                  CONCAT12(bVar21 & (byte)((uint)(int)(short)(char)
                                                  bVar35 >> 0x10),
                                                  CONCAT11(bVar20 & (char)bVar35 >> 7,
                                                           bVar19 & bVar35)))))));
          in_x9[2] = CONCAT17(bVar18 & (byte)((uint)(int)(short)(char)bVar33 >> 0x18),
                              CONCAT16(bVar17 & (byte)((uint)(int)(short)(char)bVar33 >> 0x10),
                                       CONCAT15(bVar16 & (char)bVar33 >> 7,
                                                CONCAT14(bVar15 & bVar33,
                                                         CONCAT13(bVar14 & (byte)((uint)(int)(short)
                                                  (char)bVar32 >> 0x18),
                                                  CONCAT12(bVar13 & (byte)((uint)(int)(short)(char)
                                                  bVar32 >> 0x10),
                                                  CONCAT11(bVar12 & (char)bVar32 >> 7,
                                                           bVar11 & bVar32)))))));
        } while (in_x12 == 8);
        uVar28 = in_x14[1];
        bVar27 = -((char)uVar28 == cVar3);
        bVar29 = -((char)((ulong)uVar28 >> 8) == cVar4);
        bVar30 = -((char)((ulong)uVar28 >> 0x10) == cVar5);
        bVar31 = -((char)((ulong)uVar28 >> 0x18) == cVar6);
        bVar32 = -((char)((ulong)uVar28 >> 0x20) == cVar7);
        bVar33 = -((char)((ulong)uVar28 >> 0x28) == cVar8);
        bVar35 = -((char)((ulong)uVar28 >> 0x30) == cVar9);
        bVar37 = -((char)((ulong)uVar28 >> 0x38) == cVar10);
        bVar39 = (char)bVar29 >> 7;
        bVar40 = (char)bVar31 >> 7;
        in_x9[5] = CONCAT17(bVar26 & bVar40,
                            CONCAT16(bVar25 & bVar40,
                                     CONCAT15(bVar24 & bVar40,
                                              CONCAT14(bVar23 & bVar31,
                                                       CONCAT13(bVar22 & (byte)((uint)(int)(short)(
                                                  char)bVar30 >> 0x18),
                                                  CONCAT12(bVar21 & (byte)((uint)(int)(short)(char)
                                                  bVar30 >> 0x10),
                                                  CONCAT11(bVar20 & (char)bVar30 >> 7,
                                                           bVar19 & bVar30)))))));
        in_x9[4] = CONCAT17(bVar18 & bVar39,
                            CONCAT16(bVar17 & bVar39,
                                     CONCAT15(bVar16 & bVar39,
                                              CONCAT14(bVar15 & bVar29,
                                                       CONCAT13(bVar14 & (byte)((uint)(int)(short)(
                                                  char)bVar27 >> 0x18),
                                                  CONCAT12(bVar13 & (byte)((uint)(int)(short)(char)
                                                  bVar27 >> 0x10),
                                                  CONCAT11(bVar12 & (char)bVar27 >> 7,
                                                           bVar11 & bVar27)))))));
        in_x9[7] = CONCAT17(bVar26 & (byte)((uint)(int)(short)(char)bVar37 >> 0x18),
                            CONCAT16(bVar25 & (byte)((uint)(int)(short)(char)bVar37 >> 0x10),
                                     CONCAT15(bVar24 & (char)bVar37 >> 7,
                                              CONCAT14(bVar23 & bVar37,
                                                       CONCAT13(bVar22 & (byte)((uint)(int)(short)(
                                                  char)bVar35 >> 0x18),
                                                  CONCAT12(bVar21 & (byte)((uint)(int)(short)(char)
                                                  bVar35 >> 0x10),
                                                  CONCAT11(bVar20 & (char)bVar35 >> 7,
                                                           bVar19 & bVar35)))))));
        in_x9[6] = CONCAT17(bVar18 & (byte)((uint)(int)(short)(char)bVar33 >> 0x18),
                            CONCAT16(bVar17 & (byte)((uint)(int)(short)(char)bVar33 >> 0x10),
                                     CONCAT15(bVar16 & (char)bVar33 >> 7,
                                              CONCAT14(bVar15 & bVar33,
                                                       CONCAT13(bVar14 & (byte)((uint)(int)(short)(
                                                  char)bVar32 >> 0x18),
                                                  CONCAT12(bVar13 & (byte)((uint)(int)(short)(char)
                                                  bVar32 >> 0x10),
                                                  CONCAT11(bVar12 & (char)bVar32 >> 7,
                                                           bVar11 & bVar32)))))));
      } while (in_x12 == 0x10);
      uVar28 = in_x14[2];
      bVar27 = -((char)uVar28 == cVar3);
      bVar29 = -((char)((ulong)uVar28 >> 8) == cVar4);
      bVar30 = -((char)((ulong)uVar28 >> 0x10) == cVar5);
      bVar31 = -((char)((ulong)uVar28 >> 0x18) == cVar6);
      bVar32 = -((char)((ulong)uVar28 >> 0x20) == cVar7);
      bVar33 = -((char)((ulong)uVar28 >> 0x28) == cVar8);
      bVar35 = -((char)((ulong)uVar28 >> 0x30) == cVar9);
      bVar37 = -((char)((ulong)uVar28 >> 0x38) == cVar10);
      bVar39 = (char)bVar29 >> 7;
      bVar40 = (char)bVar31 >> 7;
      in_x9[9] = CONCAT17(bVar26 & bVar40,
                          CONCAT16(bVar25 & bVar40,
                                   CONCAT15(bVar24 & bVar40,
                                            CONCAT14(bVar23 & bVar31,
                                                     CONCAT13(bVar22 & (byte)((uint)(int)(short)(
                                                  char)bVar30 >> 0x18),
                                                  CONCAT12(bVar21 & (byte)((uint)(int)(short)(char)
                                                  bVar30 >> 0x10),
                                                  CONCAT11(bVar20 & (char)bVar30 >> 7,
                                                           bVar19 & bVar30)))))));
      in_x9[8] = CONCAT17(bVar18 & bVar39,
                          CONCAT16(bVar17 & bVar39,
                                   CONCAT15(bVar16 & bVar39,
                                            CONCAT14(bVar15 & bVar29,
                                                     CONCAT13(bVar14 & (byte)((uint)(int)(short)(
                                                  char)bVar27 >> 0x18),
                                                  CONCAT12(bVar13 & (byte)((uint)(int)(short)(char)
                                                  bVar27 >> 0x10),
                                                  CONCAT11(bVar12 & (char)bVar27 >> 7,
                                                           bVar11 & bVar27)))))));
      in_x9[0xb] = CONCAT17(bVar26 & (byte)((uint)(int)(short)(char)bVar37 >> 0x18),
                            CONCAT16(bVar25 & (byte)((uint)(int)(short)(char)bVar37 >> 0x10),
                                     CONCAT15(bVar24 & (char)bVar37 >> 7,
                                              CONCAT14(bVar23 & bVar37,
                                                       CONCAT13(bVar22 & (byte)((uint)(int)(short)(
                                                  char)bVar35 >> 0x18),
                                                  CONCAT12(bVar21 & (byte)((uint)(int)(short)(char)
                                                  bVar35 >> 0x10),
                                                  CONCAT11(bVar20 & (char)bVar35 >> 7,
                                                           bVar19 & bVar35)))))));
      in_x9[10] = CONCAT17(bVar18 & (byte)((uint)(int)(short)(char)bVar33 >> 0x18),
                           CONCAT16(bVar17 & (byte)((uint)(int)(short)(char)bVar33 >> 0x10),
                                    CONCAT15(bVar16 & (char)bVar33 >> 7,
                                             CONCAT14(bVar15 & bVar33,
                                                      CONCAT13(bVar14 & (byte)((uint)(int)(short)(
                                                  char)bVar32 >> 0x18),
                                                  CONCAT12(bVar13 & (byte)((uint)(int)(short)(char)
                                                  bVar32 >> 0x10),
                                                  CONCAT11(bVar12 & (char)bVar32 >> 7,
                                                           bVar11 & bVar32)))))));
    } while (in_x12 == 0x18);
    uVar28 = in_x14[3];
    bVar27 = -((char)uVar28 == cVar3);
    bVar29 = -((char)((ulong)uVar28 >> 8) == cVar4);
    bVar30 = -((char)((ulong)uVar28 >> 0x10) == cVar5);
    bVar31 = -((char)((ulong)uVar28 >> 0x18) == cVar6);
    bVar32 = -((char)((ulong)uVar28 >> 0x20) == cVar7);
    bVar35 = -((char)((ulong)uVar28 >> 0x28) == cVar8);
    bVar34 = -((char)((ulong)uVar28 >> 0x30) == cVar9);
    bVar36 = -((char)((ulong)uVar28 >> 0x38) == cVar10);
    bVar33 = (char)bVar29 >> 7;
    uVar28 = CONCAT17(bVar18 & bVar33,
                      CONCAT16(bVar17 & bVar33,
                               CONCAT15(bVar16 & bVar33,
                                        CONCAT14(bVar15 & bVar29,
                                                 CONCAT13(bVar14 & (byte)((uint)(int)(short)(char)
                                                  bVar27 >> 0x18),
                                                  CONCAT12(bVar13 & (byte)((uint)(int)(short)(char)
                                                  bVar27 >> 0x10),
                                                  CONCAT11(bVar12 & (char)bVar27 >> 7,
                                                           bVar11 & bVar27)))))));
    bVar27 = (char)bVar31 >> 7;
    uVar38 = CONCAT17(bVar26 & bVar27,
                      CONCAT16(bVar25 & bVar27,
                               CONCAT15(bVar24 & bVar27,
                                        CONCAT14(bVar23 & bVar31,
                                                 CONCAT13(bVar22 & (byte)((uint)(int)(short)(char)
                                                  bVar30 >> 0x18),
                                                  CONCAT12(bVar21 & (byte)((uint)(int)(short)(char)
                                                  bVar30 >> 0x10),
                                                  CONCAT11(bVar20 & (char)bVar30 >> 7,
                                                           bVar19 & bVar30)))))));
    bVar27 = bVar11 & bVar32;
    bVar29 = bVar12 & (char)bVar32 >> 7;
    bVar30 = bVar13 & (byte)((uint)(int)(short)(char)bVar32 >> 0x10);
    bVar31 = bVar14 & (byte)((uint)(int)(short)(char)bVar32 >> 0x18);
    bVar32 = bVar15 & bVar35;
    bVar33 = bVar16 & (char)bVar35 >> 7;
    bVar39 = bVar17 & (byte)((uint)(int)(short)(char)bVar35 >> 0x10);
    bVar35 = bVar18 & (byte)((uint)(int)(short)(char)bVar35 >> 0x18);
    bVar37 = bVar19 & bVar34;
    bVar40 = bVar20 & (char)bVar34 >> 7;
    bVar41 = bVar21 & (byte)((uint)(int)(short)(char)bVar34 >> 0x10);
    bVar34 = bVar22 & (byte)((uint)(int)(short)(char)bVar34 >> 0x18);
    bVar42 = bVar23 & bVar36;
    bVar43 = bVar24 & (char)bVar36 >> 7;
    bVar44 = bVar25 & (byte)((uint)(int)(short)(char)bVar36 >> 0x10);
    bVar36 = bVar26 & (byte)((uint)(int)(short)(char)bVar36 >> 0x18);
  } while( true );
}

