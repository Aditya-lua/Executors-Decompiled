
void FUN_004157d0(undefined8 param_1)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  ulong extraout_x8;
  undefined8 *puVar4;
  ulong unaff_x19;
  ulong *unaff_x20;
  ulong unaff_x21;
  byte bVar6;
  byte bVar7;
  byte bVar8;
  byte bVar9;
  byte bVar10;
  byte bVar11;
  undefined8 uVar5;
  byte bVar12;
  byte bVar14;
  byte bVar15;
  byte bVar16;
  byte bVar17;
  byte bVar18;
  byte bVar19;
  undefined8 uVar13;
  byte bVar20;
  byte bVar23;
  byte bVar24;
  byte bVar25;
  byte bVar26;
  byte bVar27;
  byte bVar28;
  undefined8 uVar21;
  byte bVar29;
  ulong uVar22;
  byte bVar31;
  byte bVar32;
  byte bVar33;
  byte bVar34;
  byte bVar35;
  byte bVar36;
  undefined8 uVar30;
  byte bVar37;
  byte bVar39;
  byte bVar40;
  byte bVar41;
  byte bVar42;
  byte bVar43;
  byte bVar44;
  undefined8 uVar38;
  byte bVar45;
  byte bVar47;
  byte bVar48;
  byte bVar49;
  byte bVar50;
  byte bVar51;
  byte bVar52;
  undefined8 uVar46;
  byte bVar53;
  byte bVar55;
  byte bVar56;
  byte bVar57;
  byte bVar58;
  byte bVar59;
  byte bVar60;
  undefined8 uVar54;
  byte bVar61;
  byte bVar63;
  byte bVar64;
  byte bVar65;
  byte bVar66;
  byte bVar67;
  byte bVar68;
  undefined8 uVar62;
  byte bVar69;
  
  uVar1 = func_0x00187bd0();
  if (uVar1 == 0) {
    func_0x007a1f00(1);
    uVar2 = extraout_x8;
  }
  else {
    _memcpy(uVar1,param_1);
    unaff_x21 = uVar1;
    if (unaff_x19 < 8) {
      uVar2 = 0;
    }
    else {
      if (unaff_x19 < 0x40) {
        uVar3 = 0;
LAB_004158ac:
        uVar2 = unaff_x19 & 0x7ffffffffffffff8;
        do {
          uVar5 = *(undefined8 *)(uVar1 + uVar3);
          bVar6 = (byte)((ulong)uVar5 >> 8);
          bVar7 = (byte)((ulong)uVar5 >> 0x10);
          bVar8 = (byte)((ulong)uVar5 >> 0x18);
          bVar9 = (byte)((ulong)uVar5 >> 0x20);
          bVar10 = (byte)((ulong)uVar5 >> 0x28);
          bVar11 = (byte)((ulong)uVar5 >> 0x30);
          bVar12 = (byte)((ulong)uVar5 >> 0x38);
          uVar22 = CONCAT17(-((byte)(bVar12 + 0x9f) < 0x1a),
                            CONCAT16(-((byte)(bVar11 + 0x9f) < 0x1a),
                                     CONCAT15(-((byte)(bVar10 + 0x9f) < 0x1a),
                                              CONCAT14(-((byte)(bVar9 + 0x9f) < 0x1a),
                                                       CONCAT13(-((byte)(bVar8 + 0x9f) < 0x1a),
                                                                CONCAT12(-((byte)(bVar7 + 0x9f) <
                                                                          0x1a),CONCAT11(-((byte)(
                                                  bVar6 + 0x9f) < 0x1a),
                                                  -((byte)((byte)uVar5 + 0x9f) < 0x1a)))))))) &
                   0x2020202020202020;
          *(ulong *)(uVar1 + uVar3) =
               CONCAT17((byte)(uVar22 >> 0x38) ^ bVar12,
                        CONCAT16((byte)(uVar22 >> 0x30) ^ bVar11,
                                 CONCAT15((byte)(uVar22 >> 0x28) ^ bVar10,
                                          CONCAT14((byte)(uVar22 >> 0x20) ^ bVar9,
                                                   CONCAT13((byte)(uVar22 >> 0x18) ^ bVar8,
                                                            CONCAT12((byte)(uVar22 >> 0x10) ^ bVar7,
                                                                     CONCAT11((byte)(uVar22 >> 8) ^
                                                                              bVar6,(byte)uVar22 ^
                                                                                    (byte)uVar5)))))
                                ));
          uVar3 = uVar3 + 8;
          if (uVar2 == uVar3) goto LAB_0041591c;
        } while( true );
      }
      uVar2 = unaff_x19 & 0x7fffffffffffffc0;
      puVar4 = (undefined8 *)(uVar1 + 0x20);
      uVar3 = uVar2;
      do {
        uVar13 = puVar4[-3];
        uVar5 = puVar4[-4];
        uVar30 = puVar4[-1];
        uVar21 = puVar4[-2];
        uVar46 = puVar4[1];
        uVar38 = *puVar4;
        uVar62 = puVar4[3];
        uVar54 = puVar4[2];
        bVar6 = (byte)((ulong)uVar5 >> 8);
        bVar7 = (byte)((ulong)uVar5 >> 0x10);
        bVar8 = (byte)((ulong)uVar5 >> 0x18);
        bVar9 = (byte)((ulong)uVar5 >> 0x20);
        bVar10 = (byte)((ulong)uVar5 >> 0x28);
        bVar11 = (byte)((ulong)uVar5 >> 0x30);
        bVar12 = (byte)((ulong)uVar5 >> 0x38);
        bVar14 = (byte)((ulong)uVar13 >> 8);
        bVar15 = (byte)((ulong)uVar13 >> 0x10);
        bVar16 = (byte)((ulong)uVar13 >> 0x18);
        bVar17 = (byte)((ulong)uVar13 >> 0x20);
        bVar18 = (byte)((ulong)uVar13 >> 0x28);
        bVar19 = (byte)((ulong)uVar13 >> 0x30);
        bVar20 = (byte)((ulong)uVar13 >> 0x38);
        bVar23 = (byte)((ulong)uVar21 >> 8);
        bVar24 = (byte)((ulong)uVar21 >> 0x10);
        bVar25 = (byte)((ulong)uVar21 >> 0x18);
        bVar26 = (byte)((ulong)uVar21 >> 0x20);
        bVar27 = (byte)((ulong)uVar21 >> 0x28);
        bVar28 = (byte)((ulong)uVar21 >> 0x30);
        bVar29 = (byte)((ulong)uVar21 >> 0x38);
        bVar31 = (byte)((ulong)uVar30 >> 8);
        bVar32 = (byte)((ulong)uVar30 >> 0x10);
        bVar33 = (byte)((ulong)uVar30 >> 0x18);
        bVar34 = (byte)((ulong)uVar30 >> 0x20);
        bVar35 = (byte)((ulong)uVar30 >> 0x28);
        bVar36 = (byte)((ulong)uVar30 >> 0x30);
        bVar37 = (byte)((ulong)uVar30 >> 0x38);
        bVar39 = (byte)((ulong)uVar38 >> 8);
        bVar40 = (byte)((ulong)uVar38 >> 0x10);
        bVar41 = (byte)((ulong)uVar38 >> 0x18);
        bVar42 = (byte)((ulong)uVar38 >> 0x20);
        bVar43 = (byte)((ulong)uVar38 >> 0x28);
        bVar44 = (byte)((ulong)uVar38 >> 0x30);
        bVar45 = (byte)((ulong)uVar38 >> 0x38);
        bVar47 = (byte)((ulong)uVar46 >> 8);
        bVar48 = (byte)((ulong)uVar46 >> 0x10);
        bVar49 = (byte)((ulong)uVar46 >> 0x18);
        bVar50 = (byte)((ulong)uVar46 >> 0x20);
        bVar51 = (byte)((ulong)uVar46 >> 0x28);
        bVar52 = (byte)((ulong)uVar46 >> 0x30);
        bVar53 = (byte)((ulong)uVar46 >> 0x38);
        bVar55 = (byte)((ulong)uVar54 >> 8);
        bVar56 = (byte)((ulong)uVar54 >> 0x10);
        bVar57 = (byte)((ulong)uVar54 >> 0x18);
        bVar58 = (byte)((ulong)uVar54 >> 0x20);
        bVar59 = (byte)((ulong)uVar54 >> 0x28);
        bVar60 = (byte)((ulong)uVar54 >> 0x30);
        bVar61 = (byte)((ulong)uVar54 >> 0x38);
        bVar63 = (byte)((ulong)uVar62 >> 8);
        bVar64 = (byte)((ulong)uVar62 >> 0x10);
        bVar65 = (byte)((ulong)uVar62 >> 0x18);
        bVar66 = (byte)((ulong)uVar62 >> 0x20);
        bVar67 = (byte)((ulong)uVar62 >> 0x28);
        bVar68 = (byte)((ulong)uVar62 >> 0x30);
        bVar69 = (byte)((ulong)uVar62 >> 0x38);
        puVar4[-3] = CONCAT17(-((byte)(bVar20 + 0x9f) < 0x1a) & 0x20U ^ bVar20,
                              CONCAT16(-((byte)(bVar19 + 0x9f) < 0x1a) & 0x20U ^ bVar19,
                                       CONCAT15(-((byte)(bVar18 + 0x9f) < 0x1a) & 0x20U ^ bVar18,
                                                CONCAT14(-((byte)(bVar17 + 0x9f) < 0x1a) & 0x20U ^
                                                         bVar17,CONCAT13(-((byte)(bVar16 + 0x9f) <
                                                                          0x1a) & 0x20U ^ bVar16,
                                                                         CONCAT12(-((byte)(bVar15 + 
                                                  0x9f) < 0x1a) & 0x20U ^ bVar15,
                                                  CONCAT11(-((byte)(bVar14 + 0x9f) < 0x1a) & 0x20U ^
                                                           bVar14,-((byte)((byte)uVar13 + 0x9f) <
                                                                   0x1a) & 0x20U ^ (byte)uVar13)))))
                                      ));
        puVar4[-4] = CONCAT17(-((byte)(bVar12 + 0x9f) < 0x1a) & 0x20U ^ bVar12,
                              CONCAT16(-((byte)(bVar11 + 0x9f) < 0x1a) & 0x20U ^ bVar11,
                                       CONCAT15(-((byte)(bVar10 + 0x9f) < 0x1a) & 0x20U ^ bVar10,
                                                CONCAT14(-((byte)(bVar9 + 0x9f) < 0x1a) & 0x20U ^
                                                         bVar9,CONCAT13(-((byte)(bVar8 + 0x9f) <
                                                                         0x1a) & 0x20U ^ bVar8,
                                                                        CONCAT12(-((byte)(bVar7 + 
                                                  0x9f) < 0x1a) & 0x20U ^ bVar7,
                                                  CONCAT11(-((byte)(bVar6 + 0x9f) < 0x1a) & 0x20U ^
                                                           bVar6,-((byte)((byte)uVar5 + 0x9f) < 0x1a
                                                                  ) & 0x20U ^ (byte)uVar5)))))));
        puVar4[-1] = CONCAT17(-((byte)(bVar37 + 0x9f) < 0x1a) & 0x20U ^ bVar37,
                              CONCAT16(-((byte)(bVar36 + 0x9f) < 0x1a) & 0x20U ^ bVar36,
                                       CONCAT15(-((byte)(bVar35 + 0x9f) < 0x1a) & 0x20U ^ bVar35,
                                                CONCAT14(-((byte)(bVar34 + 0x9f) < 0x1a) & 0x20U ^
                                                         bVar34,CONCAT13(-((byte)(bVar33 + 0x9f) <
                                                                          0x1a) & 0x20U ^ bVar33,
                                                                         CONCAT12(-((byte)(bVar32 + 
                                                  0x9f) < 0x1a) & 0x20U ^ bVar32,
                                                  CONCAT11(-((byte)(bVar31 + 0x9f) < 0x1a) & 0x20U ^
                                                           bVar31,-((byte)((byte)uVar30 + 0x9f) <
                                                                   0x1a) & 0x20U ^ (byte)uVar30)))))
                                      ));
        puVar4[-2] = CONCAT17(-((byte)(bVar29 + 0x9f) < 0x1a) & 0x20U ^ bVar29,
                              CONCAT16(-((byte)(bVar28 + 0x9f) < 0x1a) & 0x20U ^ bVar28,
                                       CONCAT15(-((byte)(bVar27 + 0x9f) < 0x1a) & 0x20U ^ bVar27,
                                                CONCAT14(-((byte)(bVar26 + 0x9f) < 0x1a) & 0x20U ^
                                                         bVar26,CONCAT13(-((byte)(bVar25 + 0x9f) <
                                                                          0x1a) & 0x20U ^ bVar25,
                                                                         CONCAT12(-((byte)(bVar24 + 
                                                  0x9f) < 0x1a) & 0x20U ^ bVar24,
                                                  CONCAT11(-((byte)(bVar23 + 0x9f) < 0x1a) & 0x20U ^
                                                           bVar23,-((byte)((byte)uVar21 + 0x9f) <
                                                                   0x1a) & 0x20U ^ (byte)uVar21)))))
                                      ));
        puVar4[1] = CONCAT17(-((byte)(bVar53 + 0x9f) < 0x1a) & 0x20U ^ bVar53,
                             CONCAT16(-((byte)(bVar52 + 0x9f) < 0x1a) & 0x20U ^ bVar52,
                                      CONCAT15(-((byte)(bVar51 + 0x9f) < 0x1a) & 0x20U ^ bVar51,
                                               CONCAT14(-((byte)(bVar50 + 0x9f) < 0x1a) & 0x20U ^
                                                        bVar50,CONCAT13(-((byte)(bVar49 + 0x9f) <
                                                                         0x1a) & 0x20U ^ bVar49,
                                                                        CONCAT12(-((byte)(bVar48 + 
                                                  0x9f) < 0x1a) & 0x20U ^ bVar48,
                                                  CONCAT11(-((byte)(bVar47 + 0x9f) < 0x1a) & 0x20U ^
                                                           bVar47,-((byte)((byte)uVar46 + 0x9f) <
                                                                   0x1a) & 0x20U ^ (byte)uVar46)))))
                                     ));
        *puVar4 = CONCAT17(-((byte)(bVar45 + 0x9f) < 0x1a) & 0x20U ^ bVar45,
                           CONCAT16(-((byte)(bVar44 + 0x9f) < 0x1a) & 0x20U ^ bVar44,
                                    CONCAT15(-((byte)(bVar43 + 0x9f) < 0x1a) & 0x20U ^ bVar43,
                                             CONCAT14(-((byte)(bVar42 + 0x9f) < 0x1a) & 0x20U ^
                                                      bVar42,CONCAT13(-((byte)(bVar41 + 0x9f) < 0x1a
                                                                       ) & 0x20U ^ bVar41,
                                                                      CONCAT12(-((byte)(bVar40 + 
                                                  0x9f) < 0x1a) & 0x20U ^ bVar40,
                                                  CONCAT11(-((byte)(bVar39 + 0x9f) < 0x1a) & 0x20U ^
                                                           bVar39,-((byte)((byte)uVar38 + 0x9f) <
                                                                   0x1a) & 0x20U ^ (byte)uVar38)))))
                                   ));
        puVar4[3] = CONCAT17(-((byte)(bVar69 + 0x9f) < 0x1a) & 0x20U ^ bVar69,
                             CONCAT16(-((byte)(bVar68 + 0x9f) < 0x1a) & 0x20U ^ bVar68,
                                      CONCAT15(-((byte)(bVar67 + 0x9f) < 0x1a) & 0x20U ^ bVar67,
                                               CONCAT14(-((byte)(bVar66 + 0x9f) < 0x1a) & 0x20U ^
                                                        bVar66,CONCAT13(-((byte)(bVar65 + 0x9f) <
                                                                         0x1a) & 0x20U ^ bVar65,
                                                                        CONCAT12(-((byte)(bVar64 + 
                                                  0x9f) < 0x1a) & 0x20U ^ bVar64,
                                                  CONCAT11(-((byte)(bVar63 + 0x9f) < 0x1a) & 0x20U ^
                                                           bVar63,-((byte)((byte)uVar62 + 0x9f) <
                                                                   0x1a) & 0x20U ^ (byte)uVar62)))))
                                     ));
        puVar4[2] = CONCAT17(-((byte)(bVar61 + 0x9f) < 0x1a) & 0x20U ^ bVar61,
                             CONCAT16(-((byte)(bVar60 + 0x9f) < 0x1a) & 0x20U ^ bVar60,
                                      CONCAT15(-((byte)(bVar59 + 0x9f) < 0x1a) & 0x20U ^ bVar59,
                                               CONCAT14(-((byte)(bVar58 + 0x9f) < 0x1a) & 0x20U ^
                                                        bVar58,CONCAT13(-((byte)(bVar57 + 0x9f) <
                                                                         0x1a) & 0x20U ^ bVar57,
                                                                        CONCAT12(-((byte)(bVar56 + 
                                                  0x9f) < 0x1a) & 0x20U ^ bVar56,
                                                  CONCAT11(-((byte)(bVar55 + 0x9f) < 0x1a) & 0x20U ^
                                                           bVar55,-((byte)((byte)uVar54 + 0x9f) <
                                                                   0x1a) & 0x20U ^ (byte)uVar54)))))
                                     ));
        uVar3 = uVar3 - 0x40;
        puVar4 = puVar4 + 8;
      } while (uVar3 != 0);
      if (unaff_x19 == uVar2) goto LAB_00415924;
      uVar3 = uVar2;
      if ((unaff_x19 & 0x38) != 0) goto LAB_004158ac;
    }
  }
  do {
    *(byte *)(unaff_x21 + uVar2) =
         *(byte *)(unaff_x21 + uVar2) ^ (*(byte *)(unaff_x21 + uVar2) - 0x61 < 0x1a) << 5;
    uVar2 = uVar2 + 1;
    uVar1 = unaff_x21;
LAB_0041591c:
    unaff_x21 = uVar1;
  } while (unaff_x19 != uVar2);
LAB_00415924:
  *unaff_x20 = unaff_x19;
  unaff_x20[1] = uVar1;
  unaff_x20[2] = unaff_x19;
  return;
}

