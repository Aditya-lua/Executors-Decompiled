
long FUN_0067a61c(void)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  ulong *puVar4;
  long lVar5;
  ulong uVar6;
  long lVar7;
  ulong *puVar8;
  ulong *puVar9;
  ulong uVar10;
  uint uVar11;
  ulong uVar12;
  ulong uVar13;
  uint uVar14;
  ulong *puVar15;
  ulong uVar16;
  ulong uVar17;
  ulong *puVar18;
  ulong uVar19;
  int iVar20;
  long lVar21;
  long unaff_x20;
  int iVar22;
  ulong uVar23;
  long unaff_x22;
  ulong *puVar24;
  ulong *puVar25;
  uint uVar26;
  ulong uVar27;
  ulong uVar28;
  ulong uVar29;
  ulong uVar30;
  ulong uVar31;
  ulong uVar32;
  ulong uVar33;
  ulong uVar34;
  ulong uVar35;
  ulong uVar36;
  ulong uVar37;
  ulong uVar38;
  ulong uVar39;
  
  lVar21 = *(long *)(unaff_x20 + 0x80);
  uVar23 = lVar21 << 2;
  func_0x006108a0(uVar23);
  puVar4 = (ulong *)0x0;
  if (uVar23 != 0) {
    puVar4 = (ulong *)func_0x006115d0(lVar21 << 5);
  }
  uVar27 = *(ulong *)(unaff_x20 + 0x80);
  puVar25 = puVar4 + uVar27 * 2;
  if (uVar27 != 0) {
    _bzero(puVar4,uVar27 * 0x18);
  }
  puVar15 = puVar4 + uVar27 * 3;
  *puVar4 = 1;
  if (puVar25 != *(ulong **)(unaff_x22 + 0x18)) {
    _memcpy(puVar25,*(ulong **)(unaff_x22 + 0x18),*(long *)(unaff_x22 + 0x10) << 3);
  }
  puVar9 = puVar4 + uVar27;
  if (puVar15 != *(ulong **)(unaff_x20 + 0x88)) {
    _memcpy(puVar15,*(ulong **)(unaff_x20 + 0x88),*(long *)(unaff_x20 + 0x80) << 3);
  }
  uVar26 = 0;
  uVar12 = 1;
  puVar24 = puVar4;
code_r0x0067a6b8:
  do {
    uVar19 = *puVar25;
    if (uVar19 == 0) {
      uVar17 = (ulong)(uVar27 != 0);
      uVar16 = uVar12;
      do {
        if (uVar27 != 0) {
          if (uVar27 != 1) {
            lVar21 = 0;
            lVar7 = 1;
            lVar5 = uVar27 - uVar17;
            puVar8 = puVar25;
            do {
              *puVar8 = puVar25[lVar7];
              lVar21 = lVar21 + 1;
              lVar7 = lVar21 + uVar17;
              lVar5 = lVar5 + -1;
              puVar8 = puVar8 + 1;
            } while (lVar5 != 0);
          }
          puVar25[uVar27 - (uVar27 != 0)] = 0;
        }
        uVar19 = (ulong)(puVar9[uVar16 - 1] != 0);
        uVar12 = uVar16;
        if (puVar9[uVar16 - 1] != 0) {
          uVar12 = uVar16 + 1;
        }
        uVar10 = (ulong)(uVar12 != 0);
        if (uVar12 != 0) {
          uVar6 = uVar12 - 1;
          if (uVar10 <= uVar6) {
            uVar13 = (uVar16 - 1) + uVar19;
            if (0x29 < uVar13) {
              uVar19 = (uVar16 + uVar19) - 2;
              puVar8 = puVar9 + (uVar12 - 1);
              if ((puVar8 + -uVar19 <= puVar8 && puVar8 + -1 + -uVar19 <= puVar8 + -1) &&
                  uVar19 >> 0x3d == 0) {
                uVar16 = uVar13 & 0xfffffffffffffff8;
                uVar6 = uVar6 - uVar16;
                puVar8 = puVar9 + (uVar12 - 4);
                uVar19 = uVar16;
                do {
                  puVar18 = puVar8 + -uVar10;
                  uVar30 = *puVar18;
                  uVar29 = puVar18[3];
                  uVar28 = puVar18[2];
                  uVar34 = puVar18[-3];
                  uVar33 = puVar18[-4];
                  uVar32 = puVar18[-1];
                  uVar31 = puVar18[-2];
                  puVar8[1] = puVar18[1];
                  *puVar8 = uVar30;
                  puVar8[3] = uVar29;
                  puVar8[2] = uVar28;
                  puVar8[-3] = uVar34;
                  puVar8[-4] = uVar33;
                  puVar8[-1] = uVar32;
                  puVar8[-2] = uVar31;
                  puVar8 = puVar8 + -8;
                  uVar19 = uVar19 - 8;
                } while (uVar19 != 0);
                if (uVar13 == uVar16) goto code_r0x0067a918;
              }
            }
            do {
              puVar9[uVar6] = puVar9[uVar6 - uVar10];
              uVar6 = uVar6 - 1;
            } while (uVar10 <= uVar6);
          }
code_r0x0067a918:
          *puVar9 = 0;
        }
        uVar26 = uVar26 + 0x40;
        uVar19 = *puVar25;
        uVar16 = uVar12;
      } while (uVar19 == 0);
    }
    uVar11 = 0;
    if ((uVar19 & 1) == 0) {
      uVar16 = uVar19;
      do {
        uVar19 = uVar16 >> 1;
        uVar11 = uVar11 + 1;
        uVar14 = (uint)uVar16;
        uVar16 = uVar19;
      } while ((uVar14 >> 1 & 1) == 0);
    }
    uVar26 = uVar11 + uVar26;
    if (uVar19 == 1) {
      uVar19 = uVar27;
      do {
        if (uVar19 == 0) goto code_r0x0067a710;
        uVar16 = uVar19 - 1;
        lVar21 = uVar19 - 1;
        uVar19 = uVar16;
      } while (puVar25[lVar21] == 0);
      if (uVar16 == 0) break;
    }
code_r0x0067a710:
    if (uVar11 == 1) {
      if (uVar27 != 0) {
        uVar16 = 0;
        uVar19 = uVar27;
        do {
          uVar17 = puVar25[uVar19 - 1];
          puVar25[uVar19 - 1] = uVar16 | uVar17 >> 1;
          uVar16 = uVar17 << 0x3f;
          uVar19 = uVar19 - 1;
        } while (uVar19 != 0);
      }
      if (uVar12 != 0) {
        uVar16 = 0;
        puVar8 = puVar9;
        uVar19 = uVar12;
        do {
          uVar17 = *puVar8;
          *puVar8 = uVar16 | uVar17 << 1;
          uVar16 = uVar17 >> 0x3f;
          uVar19 = uVar19 - 1;
          puVar8 = puVar8 + 1;
        } while (uVar19 != 0);
        goto code_r0x0067a7e4;
      }
      uVar12 = 0;
      uVar19 = puVar25[uVar27 - 1];
    }
    else {
      if ((uVar27 != 0) && (uVar11 != 0)) {
        uVar16 = 0;
        uVar19 = uVar27;
        do {
          uVar17 = puVar25[uVar19 - 1] >> ((ulong)uVar11 & 0x3f) | uVar16;
          uVar16 = puVar25[uVar19 - 1] << ((ulong)(0x40 - uVar11) & 0x3f);
          puVar25[uVar19 - 1] = uVar17;
          uVar19 = uVar19 - 1;
        } while (uVar19 != 0);
      }
      if ((uVar12 != 0) && (uVar11 != 0)) {
        uVar16 = 0;
        puVar8 = puVar9;
        uVar19 = uVar12;
        do {
          uVar17 = *puVar8;
          *puVar8 = uVar17 << ((ulong)uVar11 & 0x3f) | uVar16;
          uVar16 = uVar17 >> ((ulong)(0x40 - uVar11) & 0x3f);
          uVar19 = uVar19 - 1;
          puVar8 = puVar8 + 1;
        } while (uVar19 != 0);
code_r0x0067a7e4:
        if (uVar16 != 0) {
          puVar9[uVar12] = uVar16;
          uVar12 = uVar12 + 1;
          uVar19 = puVar25[uVar27 - 1];
          goto joined_r0x0067aa38;
        }
      }
      uVar19 = puVar25[uVar27 - 1];
    }
joined_r0x0067aa38:
    lVar21 = uVar27 - 1;
    uVar16 = uVar27;
    if (uVar19 == 0) {
      uVar16 = uVar27 - 1;
      if (puVar15[uVar27 - 1] != 0) {
        uVar16 = uVar27;
      }
      lVar21 = uVar16 - 1;
      uVar19 = puVar25[lVar21];
    }
    puVar8 = puVar15;
    puVar18 = puVar9;
    if (uVar19 < puVar15[lVar21]) {
      puVar8 = puVar25;
      puVar25 = puVar15;
      puVar18 = puVar24;
      puVar24 = puVar9;
    }
    puVar9 = puVar18;
    if (uVar16 != 0) {
      if ((uVar16 < 8) || ((puVar25 < puVar8 + uVar16 && (puVar8 < puVar25 + uVar16)))) {
        uVar27 = 0;
      }
      else {
        uVar27 = uVar16 & 0xfffffffffffffff8;
        puVar15 = puVar8 + 4;
        puVar18 = puVar25 + 4;
        uVar19 = uVar27;
        do {
          uVar10 = puVar15[-3];
          uVar17 = puVar15[-4];
          uVar13 = puVar15[-1];
          uVar6 = puVar15[-2];
          uVar29 = puVar15[1];
          uVar28 = *puVar15;
          uVar31 = puVar15[3];
          uVar30 = puVar15[2];
          uVar33 = puVar18[-3];
          uVar32 = puVar18[-4];
          uVar35 = puVar18[-1];
          uVar34 = puVar18[-2];
          uVar37 = puVar18[1];
          uVar36 = *puVar18;
          uVar39 = puVar18[3];
          uVar38 = puVar18[2];
          puVar18[-3] = CONCAT17((byte)(uVar33 >> 0x38) ^ (byte)(uVar10 >> 0x38),
                                 CONCAT16((byte)(uVar33 >> 0x30) ^ (byte)(uVar10 >> 0x30),
                                          CONCAT15((byte)(uVar33 >> 0x28) ^ (byte)(uVar10 >> 0x28),
                                                   CONCAT14((byte)(uVar33 >> 0x20) ^
                                                            (byte)(uVar10 >> 0x20),
                                                            CONCAT13((byte)(uVar33 >> 0x18) ^
                                                                     (byte)(uVar10 >> 0x18),
                                                                     CONCAT12((byte)(uVar33 >> 0x10)
                                                                              ^ (byte)(uVar10 >>
                                                                                      0x10),
                                                                              CONCAT11((byte)(uVar33
                                                                                             >> 8) ^
                                                                                       (byte)(uVar10
                                                                                             >> 8),
                                                                                       (byte)uVar33
                                                                                       ^ (byte)
                                                  uVar10)))))));
          puVar18[-4] = CONCAT17((byte)(uVar32 >> 0x38) ^ (byte)(uVar17 >> 0x38),
                                 CONCAT16((byte)(uVar32 >> 0x30) ^ (byte)(uVar17 >> 0x30),
                                          CONCAT15((byte)(uVar32 >> 0x28) ^ (byte)(uVar17 >> 0x28),
                                                   CONCAT14((byte)(uVar32 >> 0x20) ^
                                                            (byte)(uVar17 >> 0x20),
                                                            CONCAT13((byte)(uVar32 >> 0x18) ^
                                                                     (byte)(uVar17 >> 0x18),
                                                                     CONCAT12((byte)(uVar32 >> 0x10)
                                                                              ^ (byte)(uVar17 >>
                                                                                      0x10),
                                                                              CONCAT11((byte)(uVar32
                                                                                             >> 8) ^
                                                                                       (byte)(uVar17
                                                                                             >> 8),
                                                                                       (byte)uVar32
                                                                                       ^ (byte)
                                                  uVar17)))))));
          puVar18[-1] = CONCAT17((byte)(uVar35 >> 0x38) ^ (byte)(uVar13 >> 0x38),
                                 CONCAT16((byte)(uVar35 >> 0x30) ^ (byte)(uVar13 >> 0x30),
                                          CONCAT15((byte)(uVar35 >> 0x28) ^ (byte)(uVar13 >> 0x28),
                                                   CONCAT14((byte)(uVar35 >> 0x20) ^
                                                            (byte)(uVar13 >> 0x20),
                                                            CONCAT13((byte)(uVar35 >> 0x18) ^
                                                                     (byte)(uVar13 >> 0x18),
                                                                     CONCAT12((byte)(uVar35 >> 0x10)
                                                                              ^ (byte)(uVar13 >>
                                                                                      0x10),
                                                                              CONCAT11((byte)(uVar35
                                                                                             >> 8) ^
                                                                                       (byte)(uVar13
                                                                                             >> 8),
                                                                                       (byte)uVar35
                                                                                       ^ (byte)
                                                  uVar13)))))));
          puVar18[-2] = CONCAT17((byte)(uVar34 >> 0x38) ^ (byte)(uVar6 >> 0x38),
                                 CONCAT16((byte)(uVar34 >> 0x30) ^ (byte)(uVar6 >> 0x30),
                                          CONCAT15((byte)(uVar34 >> 0x28) ^ (byte)(uVar6 >> 0x28),
                                                   CONCAT14((byte)(uVar34 >> 0x20) ^
                                                            (byte)(uVar6 >> 0x20),
                                                            CONCAT13((byte)(uVar34 >> 0x18) ^
                                                                     (byte)(uVar6 >> 0x18),
                                                                     CONCAT12((byte)(uVar34 >> 0x10)
                                                                              ^ (byte)(uVar6 >> 0x10
                                                                                      ),
                                                                              CONCAT11((byte)(uVar34
                                                                                             >> 8) ^
                                                                                       (byte)(uVar6 
                                                  >> 8),(byte)uVar34 ^ (byte)uVar6)))))));
          puVar18[1] = CONCAT17((byte)(uVar37 >> 0x38) ^ (byte)(uVar29 >> 0x38),
                                CONCAT16((byte)(uVar37 >> 0x30) ^ (byte)(uVar29 >> 0x30),
                                         CONCAT15((byte)(uVar37 >> 0x28) ^ (byte)(uVar29 >> 0x28),
                                                  CONCAT14((byte)(uVar37 >> 0x20) ^
                                                           (byte)(uVar29 >> 0x20),
                                                           CONCAT13((byte)(uVar37 >> 0x18) ^
                                                                    (byte)(uVar29 >> 0x18),
                                                                    CONCAT12((byte)(uVar37 >> 0x10)
                                                                             ^ (byte)(uVar29 >> 0x10
                                                                                     ),
                                                                             CONCAT11((byte)(uVar37 
                                                  >> 8) ^ (byte)(uVar29 >> 8),
                                                  (byte)uVar37 ^ (byte)uVar29)))))));
          *puVar18 = CONCAT17((byte)(uVar36 >> 0x38) ^ (byte)(uVar28 >> 0x38),
                              CONCAT16((byte)(uVar36 >> 0x30) ^ (byte)(uVar28 >> 0x30),
                                       CONCAT15((byte)(uVar36 >> 0x28) ^ (byte)(uVar28 >> 0x28),
                                                CONCAT14((byte)(uVar36 >> 0x20) ^
                                                         (byte)(uVar28 >> 0x20),
                                                         CONCAT13((byte)(uVar36 >> 0x18) ^
                                                                  (byte)(uVar28 >> 0x18),
                                                                  CONCAT12((byte)(uVar36 >> 0x10) ^
                                                                           (byte)(uVar28 >> 0x10),
                                                                           CONCAT11((byte)(uVar36 >>
                                                                                          8) ^
                                                                                    (byte)(uVar28 >>
                                                                                          8),(byte)
                                                  uVar36 ^ (byte)uVar28)))))));
          puVar18[3] = CONCAT17((byte)(uVar39 >> 0x38) ^ (byte)(uVar31 >> 0x38),
                                CONCAT16((byte)(uVar39 >> 0x30) ^ (byte)(uVar31 >> 0x30),
                                         CONCAT15((byte)(uVar39 >> 0x28) ^ (byte)(uVar31 >> 0x28),
                                                  CONCAT14((byte)(uVar39 >> 0x20) ^
                                                           (byte)(uVar31 >> 0x20),
                                                           CONCAT13((byte)(uVar39 >> 0x18) ^
                                                                    (byte)(uVar31 >> 0x18),
                                                                    CONCAT12((byte)(uVar39 >> 0x10)
                                                                             ^ (byte)(uVar31 >> 0x10
                                                                                     ),
                                                                             CONCAT11((byte)(uVar39 
                                                  >> 8) ^ (byte)(uVar31 >> 8),
                                                  (byte)uVar39 ^ (byte)uVar31)))))));
          puVar18[2] = CONCAT17((byte)(uVar38 >> 0x38) ^ (byte)(uVar30 >> 0x38),
                                CONCAT16((byte)(uVar38 >> 0x30) ^ (byte)(uVar30 >> 0x30),
                                         CONCAT15((byte)(uVar38 >> 0x28) ^ (byte)(uVar30 >> 0x28),
                                                  CONCAT14((byte)(uVar38 >> 0x20) ^
                                                           (byte)(uVar30 >> 0x20),
                                                           CONCAT13((byte)(uVar38 >> 0x18) ^
                                                                    (byte)(uVar30 >> 0x18),
                                                                    CONCAT12((byte)(uVar38 >> 0x10)
                                                                             ^ (byte)(uVar30 >> 0x10
                                                                                     ),
                                                                             CONCAT11((byte)(uVar38 
                                                  >> 8) ^ (byte)(uVar30 >> 8),
                                                  (byte)uVar38 ^ (byte)uVar30)))))));
          uVar19 = uVar19 - 8;
          puVar15 = puVar15 + 8;
          puVar18 = puVar18 + 8;
        } while (uVar19 != 0);
        if (uVar16 == uVar27) goto code_r0x0067a890;
      }
      lVar21 = uVar16 - uVar27;
      puVar15 = puVar25 + uVar27;
      puVar18 = puVar8 + uVar27;
      do {
        *puVar15 = *puVar15 ^ *puVar18;
        lVar21 = lVar21 + -1;
        puVar15 = puVar15 + 1;
        puVar18 = puVar18 + 1;
      } while (lVar21 != 0);
    }
code_r0x0067a890:
    puVar15 = puVar8;
    uVar27 = uVar16;
    if (uVar12 != 0) {
      if ((uVar12 < 8) || ((puVar24 < puVar9 + uVar12 && (puVar9 < puVar24 + uVar12)))) {
        uVar19 = 0;
      }
      else {
        uVar19 = uVar12 & 0xfffffffffffffff8;
        puVar8 = puVar9 + 4;
        puVar18 = puVar24 + 4;
        uVar16 = uVar19;
        do {
          uVar10 = puVar8[-3];
          uVar17 = puVar8[-4];
          uVar13 = puVar8[-1];
          uVar6 = puVar8[-2];
          uVar29 = puVar8[1];
          uVar28 = *puVar8;
          uVar31 = puVar8[3];
          uVar30 = puVar8[2];
          uVar33 = puVar18[-3];
          uVar32 = puVar18[-4];
          uVar35 = puVar18[-1];
          uVar34 = puVar18[-2];
          uVar37 = puVar18[1];
          uVar36 = *puVar18;
          uVar39 = puVar18[3];
          uVar38 = puVar18[2];
          puVar18[-3] = CONCAT17((byte)(uVar33 >> 0x38) ^ (byte)(uVar10 >> 0x38),
                                 CONCAT16((byte)(uVar33 >> 0x30) ^ (byte)(uVar10 >> 0x30),
                                          CONCAT15((byte)(uVar33 >> 0x28) ^ (byte)(uVar10 >> 0x28),
                                                   CONCAT14((byte)(uVar33 >> 0x20) ^
                                                            (byte)(uVar10 >> 0x20),
                                                            CONCAT13((byte)(uVar33 >> 0x18) ^
                                                                     (byte)(uVar10 >> 0x18),
                                                                     CONCAT12((byte)(uVar33 >> 0x10)
                                                                              ^ (byte)(uVar10 >>
                                                                                      0x10),
                                                                              CONCAT11((byte)(uVar33
                                                                                             >> 8) ^
                                                                                       (byte)(uVar10
                                                                                             >> 8),
                                                                                       (byte)uVar33
                                                                                       ^ (byte)
                                                  uVar10)))))));
          puVar18[-4] = CONCAT17((byte)(uVar32 >> 0x38) ^ (byte)(uVar17 >> 0x38),
                                 CONCAT16((byte)(uVar32 >> 0x30) ^ (byte)(uVar17 >> 0x30),
                                          CONCAT15((byte)(uVar32 >> 0x28) ^ (byte)(uVar17 >> 0x28),
                                                   CONCAT14((byte)(uVar32 >> 0x20) ^
                                                            (byte)(uVar17 >> 0x20),
                                                            CONCAT13((byte)(uVar32 >> 0x18) ^
                                                                     (byte)(uVar17 >> 0x18),
                                                                     CONCAT12((byte)(uVar32 >> 0x10)
                                                                              ^ (byte)(uVar17 >>
                                                                                      0x10),
                                                                              CONCAT11((byte)(uVar32
                                                                                             >> 8) ^
                                                                                       (byte)(uVar17
                                                                                             >> 8),
                                                                                       (byte)uVar32
                                                                                       ^ (byte)
                                                  uVar17)))))));
          puVar18[-1] = CONCAT17((byte)(uVar35 >> 0x38) ^ (byte)(uVar13 >> 0x38),
                                 CONCAT16((byte)(uVar35 >> 0x30) ^ (byte)(uVar13 >> 0x30),
                                          CONCAT15((byte)(uVar35 >> 0x28) ^ (byte)(uVar13 >> 0x28),
                                                   CONCAT14((byte)(uVar35 >> 0x20) ^
                                                            (byte)(uVar13 >> 0x20),
                                                            CONCAT13((byte)(uVar35 >> 0x18) ^
                                                                     (byte)(uVar13 >> 0x18),
                                                                     CONCAT12((byte)(uVar35 >> 0x10)
                                                                              ^ (byte)(uVar13 >>
                                                                                      0x10),
                                                                              CONCAT11((byte)(uVar35
                                                                                             >> 8) ^
                                                                                       (byte)(uVar13
                                                                                             >> 8),
                                                                                       (byte)uVar35
                                                                                       ^ (byte)
                                                  uVar13)))))));
          puVar18[-2] = CONCAT17((byte)(uVar34 >> 0x38) ^ (byte)(uVar6 >> 0x38),
                                 CONCAT16((byte)(uVar34 >> 0x30) ^ (byte)(uVar6 >> 0x30),
                                          CONCAT15((byte)(uVar34 >> 0x28) ^ (byte)(uVar6 >> 0x28),
                                                   CONCAT14((byte)(uVar34 >> 0x20) ^
                                                            (byte)(uVar6 >> 0x20),
                                                            CONCAT13((byte)(uVar34 >> 0x18) ^
                                                                     (byte)(uVar6 >> 0x18),
                                                                     CONCAT12((byte)(uVar34 >> 0x10)
                                                                              ^ (byte)(uVar6 >> 0x10
                                                                                      ),
                                                                              CONCAT11((byte)(uVar34
                                                                                             >> 8) ^
                                                                                       (byte)(uVar6 
                                                  >> 8),(byte)uVar34 ^ (byte)uVar6)))))));
          puVar18[1] = CONCAT17((byte)(uVar37 >> 0x38) ^ (byte)(uVar29 >> 0x38),
                                CONCAT16((byte)(uVar37 >> 0x30) ^ (byte)(uVar29 >> 0x30),
                                         CONCAT15((byte)(uVar37 >> 0x28) ^ (byte)(uVar29 >> 0x28),
                                                  CONCAT14((byte)(uVar37 >> 0x20) ^
                                                           (byte)(uVar29 >> 0x20),
                                                           CONCAT13((byte)(uVar37 >> 0x18) ^
                                                                    (byte)(uVar29 >> 0x18),
                                                                    CONCAT12((byte)(uVar37 >> 0x10)
                                                                             ^ (byte)(uVar29 >> 0x10
                                                                                     ),
                                                                             CONCAT11((byte)(uVar37 
                                                  >> 8) ^ (byte)(uVar29 >> 8),
                                                  (byte)uVar37 ^ (byte)uVar29)))))));
          *puVar18 = CONCAT17((byte)(uVar36 >> 0x38) ^ (byte)(uVar28 >> 0x38),
                              CONCAT16((byte)(uVar36 >> 0x30) ^ (byte)(uVar28 >> 0x30),
                                       CONCAT15((byte)(uVar36 >> 0x28) ^ (byte)(uVar28 >> 0x28),
                                                CONCAT14((byte)(uVar36 >> 0x20) ^
                                                         (byte)(uVar28 >> 0x20),
                                                         CONCAT13((byte)(uVar36 >> 0x18) ^
                                                                  (byte)(uVar28 >> 0x18),
                                                                  CONCAT12((byte)(uVar36 >> 0x10) ^
                                                                           (byte)(uVar28 >> 0x10),
                                                                           CONCAT11((byte)(uVar36 >>
                                                                                          8) ^
                                                                                    (byte)(uVar28 >>
                                                                                          8),(byte)
                                                  uVar36 ^ (byte)uVar28)))))));
          puVar18[3] = CONCAT17((byte)(uVar39 >> 0x38) ^ (byte)(uVar31 >> 0x38),
                                CONCAT16((byte)(uVar39 >> 0x30) ^ (byte)(uVar31 >> 0x30),
                                         CONCAT15((byte)(uVar39 >> 0x28) ^ (byte)(uVar31 >> 0x28),
                                                  CONCAT14((byte)(uVar39 >> 0x20) ^
                                                           (byte)(uVar31 >> 0x20),
                                                           CONCAT13((byte)(uVar39 >> 0x18) ^
                                                                    (byte)(uVar31 >> 0x18),
                                                                    CONCAT12((byte)(uVar39 >> 0x10)
                                                                             ^ (byte)(uVar31 >> 0x10
                                                                                     ),
                                                                             CONCAT11((byte)(uVar39 
                                                  >> 8) ^ (byte)(uVar31 >> 8),
                                                  (byte)uVar39 ^ (byte)uVar31)))))));
          puVar18[2] = CONCAT17((byte)(uVar38 >> 0x38) ^ (byte)(uVar30 >> 0x38),
                                CONCAT16((byte)(uVar38 >> 0x30) ^ (byte)(uVar30 >> 0x30),
                                         CONCAT15((byte)(uVar38 >> 0x28) ^ (byte)(uVar30 >> 0x28),
                                                  CONCAT14((byte)(uVar38 >> 0x20) ^
                                                           (byte)(uVar30 >> 0x20),
                                                           CONCAT13((byte)(uVar38 >> 0x18) ^
                                                                    (byte)(uVar30 >> 0x18),
                                                                    CONCAT12((byte)(uVar38 >> 0x10)
                                                                             ^ (byte)(uVar30 >> 0x10
                                                                                     ),
                                                                             CONCAT11((byte)(uVar38 
                                                  >> 8) ^ (byte)(uVar30 >> 8),
                                                  (byte)uVar38 ^ (byte)uVar30)))))));
          uVar16 = uVar16 - 8;
          puVar8 = puVar8 + 8;
          puVar18 = puVar18 + 8;
        } while (uVar16 != 0);
        if (uVar12 == uVar19) goto code_r0x0067a6b8;
      }
      lVar21 = uVar12 - uVar19;
      puVar8 = puVar24 + uVar19;
      puVar18 = puVar9 + uVar19;
      do {
        *puVar8 = *puVar8 ^ *puVar18;
        lVar21 = lVar21 + -1;
        puVar8 = puVar8 + 1;
        puVar18 = puVar18 + 1;
      } while (lVar21 != 0);
    }
  } while( true );
  if (0x3f < uVar26) {
    uVar14 = *(uint *)(unaff_x20 + 0x90);
    uVar27 = (ulong)uVar14 + 0x3f >> 6;
    lVar21 = uVar27 - 1;
    uVar1 = *(uint *)(unaff_x20 + 0x98);
    uVar16 = (ulong)uVar1 & 0x3f;
    uVar2 = uVar1 >> 6;
    uVar12 = (ulong)(uVar2 - 1);
    uVar11 = 0x40 - uVar1;
    iVar22 = (int)uVar16;
    uVar19 = (ulong)*(uint *)(unaff_x20 + 0x94) & 0x3f;
    uVar3 = *(uint *)(unaff_x20 + 0x94) >> 6;
    puVar25 = puVar24 + (uVar3 - 1);
    iVar20 = (int)uVar19;
    puVar15 = puVar24 + uVar3;
    if (uVar27 < 3) {
      uVar27 = 2;
    }
    if (uVar11 < 2) {
      uVar11 = 1;
    }
    puVar9 = (ulong *)(uVar12 * 8);
    do {
      while( true ) {
        uVar17 = *puVar24;
        if (0x40 < uVar14) {
          _memmove(puVar9,puVar24,puVar24 + 1,uVar27 * 8 + -8);
        }
        puVar24[lVar21] = 0;
        if (uVar1 < 0x40) {
          uVar10 = 0;
          do {
            uVar6 = uVar1 + uVar10;
            uVar13 = (uVar17 >> (uVar10 & 0x3f) & 1) << (uVar6 & 0x3f);
            if (0x3f < (uint)uVar6) {
              uVar13 = 0;
            }
            uVar17 = uVar13 ^ uVar17;
            uVar10 = uVar10 + 1;
          } while (uVar11 != uVar10);
        }
        else {
          puVar24[uVar12] = puVar24[uVar12] ^ uVar17 << uVar16;
        }
        if (iVar22 != 0) {
          puVar24[uVar2] = puVar24[uVar2] ^ uVar17 >> ((ulong)(0x40 - iVar22) & 0x3f);
        }
        if (iVar20 != 0) break;
        *puVar25 = *puVar25 ^ uVar17;
        uVar26 = uVar26 - 0x40;
        puVar9 = puVar25;
        if (uVar26 < 0x40) goto code_r0x0067ac58;
      }
      *puVar25 = *puVar25 ^ uVar17 << uVar19;
      *puVar15 = *puVar15 ^ uVar17 >> ((ulong)(0x40 - iVar20) & 0x3f);
      uVar26 = uVar26 - 0x40;
      puVar9 = puVar15;
    } while (0x3f < uVar26);
  }
code_r0x0067ac58:
  if (uVar26 != 0) {
    uVar27 = *puVar24 << ((ulong)-uVar26 & 0x3f);
    if (*(uint *)(unaff_x20 + 0x90) != 0) {
      uVar19 = 0;
      uVar12 = (ulong)*(uint *)(unaff_x20 + 0x90) + 0x3f >> 3 & 0x3ffffff8;
      do {
        uVar16 = *(ulong *)((long)puVar24 + (uVar12 - 8));
        *(ulong *)((long)puVar24 + (uVar12 - 8)) = uVar16 >> ((ulong)uVar26 & 0x3f) | uVar19;
        uVar19 = uVar16 << ((ulong)(0x40 - uVar26) & 0x3f);
        uVar12 = uVar12 - 8;
      } while (uVar12 != 0);
    }
    uVar26 = *(uint *)(unaff_x20 + 0x98);
    uVar12 = (ulong)uVar26;
    if (uVar26 < 0x40) {
      uVar19 = 0;
      do {
        uVar16 = (uVar27 >> (uVar19 & 0x3f) & 1) << (uVar12 + uVar19 & 0x3f);
        if (0x3f < (uint)(uVar12 + uVar19)) {
          uVar16 = 0;
        }
        uVar27 = uVar16 ^ uVar27;
        uVar19 = uVar19 + 1;
      } while (0x40 - uVar12 != uVar19);
    }
    else {
      uVar11 = (uVar26 >> 6) - 1;
      puVar24[uVar11] = puVar24[uVar11] ^ uVar27 << (uVar12 & 0x3f);
    }
    if ((uVar26 & 0x3f) != 0) {
      uVar12 = (ulong)(uVar26 >> 3) & 0x1ffffff8;
      *(ulong *)((long)puVar24 + uVar12) =
           *(ulong *)((long)puVar24 + uVar12) ^ uVar27 >> ((ulong)-(uVar26 & 0x3f) & 0x3f);
    }
    uVar26 = *(uint *)(unaff_x20 + 0x94);
    uVar11 = uVar26 & 0x3f;
    if (uVar11 == 0) {
      uVar26 = (uVar26 >> 6) - 1;
    }
    else {
      uVar26 = uVar26 >> 6;
      puVar24[uVar26 - 1] = puVar24[uVar26 - 1] ^ uVar27 << uVar11;
      uVar27 = uVar27 >> ((ulong)-uVar11 & 0x3f);
    }
    puVar24[uVar26] = puVar24[uVar26] ^ uVar27;
  }
  if (*(ulong **)(unaff_x20 + 0xb8) != puVar24) {
    _memcpy(*(ulong **)(unaff_x20 + 0xb8),puVar24,*(long *)(unaff_x20 + 0xb0) << 3);
  }
  if (0x1ffffffffffffffe < uVar23) {
    uVar23 = 0x1fffffffffffffff;
  }
  for (; uVar23 != 0; uVar23 = uVar23 - 1) {
    puVar4[uVar23 - 1] = 0;
  }
  func_0x00611644(puVar4);
  return unaff_x20 + 0xa0;
}

