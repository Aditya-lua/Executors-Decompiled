
undefined8
FUN_0029f96c(undefined8 *param_1,undefined8 param_2,undefined8 param_3,ulong param_4,
            undefined8 param_5)

{
  bool bVar1;
  code *UNRECOVERED_JUMPTABLE;
  ulong uVar2;
  uint uVar3;
  undefined8 uVar4;
  long lVar5;
  long lVar6;
  undefined4 uVar7;
  ulong uVar8;
  uint uVar9;
  ulong uVar10;
  ulong uVar11;
  ulong *puVar12;
  ulong *puVar13;
  ulong uVar14;
  int iVar15;
  ulong uVar16;
  ulong uVar17;
  long unaff_x21;
  undefined8 *unaff_x22;
  long *unaff_x23;
  long unaff_x24;
  undefined8 *unaff_x25;
  long *unaff_x26;
  uint unaff_w27;
  ulong *puVar18;
  long unaff_x28;
  ulong *puVar19;
  byte bVar20;
  byte bVar21;
  byte bVar22;
  byte bVar23;
  byte bVar24;
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
  ulong uVar36;
  ulong uVar37;
  ulong uVar38;
  ulong uVar39;
  ulong uVar40;
  ulong uVar41;
  ulong uVar42;
  ulong uVar43;
  ulong uVar44;
  ulong uVar45;
  ulong uVar46;
  ulong uVar47;
  ulong uVar48;
  ulong uVar49;
  ulong uVar50;
  ulong uVar51;
  undefined8 *puStack0000000000000018;
  
  uVar4 = 0;
  puStack0000000000000018 = param_1;
  if (((((unaff_x26 != (long *)0x0) && (unaff_x25 != (undefined8 *)0x0)) &&
       (param_1 != (undefined8 *)0x0)) &&
      ((uVar4 = func_0x0029afb8(), (int)uVar4 != 0 && (uVar4 = func_0x0029afb8(), (int)uVar4 != 0)))
      ) && (uVar4 = func_0x0029afb8(puStack0000000000000018,(long)*(int *)(unaff_x22 + 1)),
           (int)uVar4 != 0)) {
    uVar7 = 0;
    if ((int)unaff_x23[1] != 0) {
      _bzero(*unaff_x26,(long)(int)unaff_x23[1] << 3);
      uVar7 = (undefined4)unaff_x23[1];
    }
    *(undefined4 *)(unaff_x26 + 1) = uVar7;
    *(undefined4 *)(unaff_x26 + 2) = 0;
    uVar7 = 0;
    if (*(int *)(unaff_x22 + 1) != 0) {
      _bzero(*unaff_x25,(long)*(int *)(unaff_x22 + 1) << 3);
      uVar7 = *(undefined4 *)(unaff_x22 + 1);
    }
    *(undefined4 *)(unaff_x25 + 1) = uVar7;
    *(undefined4 *)(unaff_x25 + 2) = 0;
    uVar3 = func_0x0029bf0c();
    if (uVar3 < unaff_w27) goto LAB_0029fc44;
    uVar3 = *(uint *)(unaff_x23 + 1);
    if (unaff_w27 == 0) {
LAB_0029fa50:
      uVar9 = 0xffffffff;
    }
    else {
      uVar9 = unaff_w27 - 1 >> 6;
      if ((int)uVar3 <= (int)uVar9) {
        uVar9 = uVar3;
      }
      if (uVar9 == 0) goto LAB_0029fa50;
      _memcpy(*unaff_x25,
              (*unaff_x23 + (long)(int)uVar3 * 8) -
              (-(ulong)(uVar9 >> 0x1f) & 0xfffffff800000000 | (ulong)uVar9 << 3));
      uVar3 = *(uint *)(unaff_x23 + 1);
      uVar9 = ~uVar9;
    }
    uVar16 = (ulong)(uVar3 + uVar9);
    if (-1 < (int)(uVar3 + uVar9)) {
      do {
        uVar8 = 0x3f;
        do {
          uVar4 = *unaff_x25;
          lVar5 = func_0x00382c70(uVar4,uVar4,uVar4,(long)*(int *)(unaff_x22 + 1));
          puVar18 = (ulong *)*unaff_x25;
          *puVar18 = *puVar18 | *(ulong *)(*unaff_x23 + uVar16 * 8) >> (uVar8 & 0x3f) & 1;
          puVar19 = (ulong *)*puStack0000000000000018;
          uVar3 = *(uint *)(unaff_x22 + 1);
          uVar17 = (ulong)(int)uVar3;
          param_4 = uVar17;
          lVar6 = func_0x00382cc0(puVar19,puVar18,*unaff_x22);
          uVar2 = lVar5 - lVar6;
          if (uVar2 != 0 && uVar2 != 0xffffffffffffffff) {
            uVar4 = func_0x0079dbb8();
            goto LAB_0029fc18;
          }
          if (uVar3 != 0) {
            uVar10 = ~uVar2;
            if ((uVar3 < 8) || (puVar18 < puVar19 + uVar17 && puVar19 < puVar18 + uVar17)) {
              uVar11 = 0;
            }
            else {
              uVar11 = uVar17 & 0xfffffffffffffff8;
              puVar12 = puVar19 + 4;
              puVar13 = puVar18 + 4;
              uVar14 = uVar11;
              do {
                uVar37 = puVar13[-3];
                uVar36 = puVar13[-4];
                uVar39 = puVar13[-1];
                uVar38 = puVar13[-2];
                uVar41 = puVar13[1];
                uVar40 = *puVar13;
                uVar43 = puVar13[3];
                uVar42 = puVar13[2];
                uVar45 = puVar12[-3];
                uVar44 = puVar12[-4];
                uVar47 = puVar12[-1];
                uVar46 = puVar12[-2];
                uVar49 = puVar12[1];
                uVar48 = *puVar12;
                uVar51 = puVar12[3];
                uVar50 = puVar12[2];
                bVar20 = (byte)uVar2;
                bVar21 = (byte)(uVar2 >> 8);
                bVar22 = (byte)(uVar2 >> 0x10);
                bVar23 = (byte)(uVar2 >> 0x18);
                bVar24 = (byte)(uVar2 >> 0x20);
                bVar25 = (byte)(uVar2 >> 0x28);
                bVar26 = (byte)(uVar2 >> 0x30);
                bVar27 = (byte)(uVar2 >> 0x38);
                bVar28 = (byte)uVar10;
                bVar29 = (byte)(uVar10 >> 8);
                bVar30 = (byte)(uVar10 >> 0x10);
                bVar31 = (byte)(uVar10 >> 0x18);
                bVar32 = (byte)(uVar10 >> 0x20);
                bVar33 = (byte)(uVar10 >> 0x28);
                bVar34 = (byte)(uVar10 >> 0x30);
                bVar35 = (byte)(uVar10 >> 0x38);
                puVar13[-3] = CONCAT17((byte)(uVar45 >> 0x38) & bVar35 |
                                       (byte)(uVar37 >> 0x38) & bVar27,
                                       CONCAT16((byte)(uVar45 >> 0x30) & bVar34 |
                                                (byte)(uVar37 >> 0x30) & bVar26,
                                                CONCAT15((byte)(uVar45 >> 0x28) & bVar33 |
                                                         (byte)(uVar37 >> 0x28) & bVar25,
                                                         CONCAT14((byte)(uVar45 >> 0x20) & bVar32 |
                                                                  (byte)(uVar37 >> 0x20) & bVar24,
                                                                  CONCAT13((byte)(uVar45 >> 0x18) &
                                                                           bVar31 | (byte)(uVar37 >>
                                                                                          0x18) &
                                                                                    bVar23,
                                                                           CONCAT12((byte)(uVar45 >>
                                                                                          0x10) &
                                                                                    bVar30 | (byte)(
                                                  uVar37 >> 0x10) & bVar22,
                                                  CONCAT11((byte)(uVar45 >> 8) & bVar29 |
                                                           (byte)(uVar37 >> 8) & bVar21,
                                                           (byte)uVar45 & bVar28 |
                                                           (byte)uVar37 & bVar20)))))));
                puVar13[-4] = CONCAT17((byte)(uVar44 >> 0x38) & bVar35 |
                                       (byte)(uVar36 >> 0x38) & bVar27,
                                       CONCAT16((byte)(uVar44 >> 0x30) & bVar34 |
                                                (byte)(uVar36 >> 0x30) & bVar26,
                                                CONCAT15((byte)(uVar44 >> 0x28) & bVar33 |
                                                         (byte)(uVar36 >> 0x28) & bVar25,
                                                         CONCAT14((byte)(uVar44 >> 0x20) & bVar32 |
                                                                  (byte)(uVar36 >> 0x20) & bVar24,
                                                                  CONCAT13((byte)(uVar44 >> 0x18) &
                                                                           bVar31 | (byte)(uVar36 >>
                                                                                          0x18) &
                                                                                    bVar23,
                                                                           CONCAT12((byte)(uVar44 >>
                                                                                          0x10) &
                                                                                    bVar30 | (byte)(
                                                  uVar36 >> 0x10) & bVar22,
                                                  CONCAT11((byte)(uVar44 >> 8) & bVar29 |
                                                           (byte)(uVar36 >> 8) & bVar21,
                                                           (byte)uVar44 & bVar28 |
                                                           (byte)uVar36 & bVar20)))))));
                puVar13[-1] = CONCAT17((byte)(uVar47 >> 0x38) & bVar35 |
                                       (byte)(uVar39 >> 0x38) & bVar27,
                                       CONCAT16((byte)(uVar47 >> 0x30) & bVar34 |
                                                (byte)(uVar39 >> 0x30) & bVar26,
                                                CONCAT15((byte)(uVar47 >> 0x28) & bVar33 |
                                                         (byte)(uVar39 >> 0x28) & bVar25,
                                                         CONCAT14((byte)(uVar47 >> 0x20) & bVar32 |
                                                                  (byte)(uVar39 >> 0x20) & bVar24,
                                                                  CONCAT13((byte)(uVar47 >> 0x18) &
                                                                           bVar31 | (byte)(uVar39 >>
                                                                                          0x18) &
                                                                                    bVar23,
                                                                           CONCAT12((byte)(uVar47 >>
                                                                                          0x10) &
                                                                                    bVar30 | (byte)(
                                                  uVar39 >> 0x10) & bVar22,
                                                  CONCAT11((byte)(uVar47 >> 8) & bVar29 |
                                                           (byte)(uVar39 >> 8) & bVar21,
                                                           (byte)uVar47 & bVar28 |
                                                           (byte)uVar39 & bVar20)))))));
                puVar13[-2] = CONCAT17((byte)(uVar46 >> 0x38) & bVar35 |
                                       (byte)(uVar38 >> 0x38) & bVar27,
                                       CONCAT16((byte)(uVar46 >> 0x30) & bVar34 |
                                                (byte)(uVar38 >> 0x30) & bVar26,
                                                CONCAT15((byte)(uVar46 >> 0x28) & bVar33 |
                                                         (byte)(uVar38 >> 0x28) & bVar25,
                                                         CONCAT14((byte)(uVar46 >> 0x20) & bVar32 |
                                                                  (byte)(uVar38 >> 0x20) & bVar24,
                                                                  CONCAT13((byte)(uVar46 >> 0x18) &
                                                                           bVar31 | (byte)(uVar38 >>
                                                                                          0x18) &
                                                                                    bVar23,
                                                                           CONCAT12((byte)(uVar46 >>
                                                                                          0x10) &
                                                                                    bVar30 | (byte)(
                                                  uVar38 >> 0x10) & bVar22,
                                                  CONCAT11((byte)(uVar46 >> 8) & bVar29 |
                                                           (byte)(uVar38 >> 8) & bVar21,
                                                           (byte)uVar46 & bVar28 |
                                                           (byte)uVar38 & bVar20)))))));
                puVar13[1] = CONCAT17((byte)(uVar49 >> 0x38) & bVar35 |
                                      (byte)(uVar41 >> 0x38) & bVar27,
                                      CONCAT16((byte)(uVar49 >> 0x30) & bVar34 |
                                               (byte)(uVar41 >> 0x30) & bVar26,
                                               CONCAT15((byte)(uVar49 >> 0x28) & bVar33 |
                                                        (byte)(uVar41 >> 0x28) & bVar25,
                                                        CONCAT14((byte)(uVar49 >> 0x20) & bVar32 |
                                                                 (byte)(uVar41 >> 0x20) & bVar24,
                                                                 CONCAT13((byte)(uVar49 >> 0x18) &
                                                                          bVar31 | (byte)(uVar41 >>
                                                                                         0x18) &
                                                                                   bVar23,
                                                                          CONCAT12((byte)(uVar49 >>
                                                                                         0x10) &
                                                                                   bVar30 | (byte)(
                                                  uVar41 >> 0x10) & bVar22,
                                                  CONCAT11((byte)(uVar49 >> 8) & bVar29 |
                                                           (byte)(uVar41 >> 8) & bVar21,
                                                           (byte)uVar49 & bVar28 |
                                                           (byte)uVar41 & bVar20)))))));
                *puVar13 = CONCAT17((byte)(uVar48 >> 0x38) & bVar35 |
                                    (byte)(uVar40 >> 0x38) & bVar27,
                                    CONCAT16((byte)(uVar48 >> 0x30) & bVar34 |
                                             (byte)(uVar40 >> 0x30) & bVar26,
                                             CONCAT15((byte)(uVar48 >> 0x28) & bVar33 |
                                                      (byte)(uVar40 >> 0x28) & bVar25,
                                                      CONCAT14((byte)(uVar48 >> 0x20) & bVar32 |
                                                               (byte)(uVar40 >> 0x20) & bVar24,
                                                               CONCAT13((byte)(uVar48 >> 0x18) &
                                                                        bVar31 | (byte)(uVar40 >>
                                                                                       0x18) &
                                                                                 bVar23,
                                                                        CONCAT12((byte)(uVar48 >>
                                                                                       0x10) &
                                                                                 bVar30 | (byte)(
                                                  uVar40 >> 0x10) & bVar22,
                                                  CONCAT11((byte)(uVar48 >> 8) & bVar29 |
                                                           (byte)(uVar40 >> 8) & bVar21,
                                                           (byte)uVar48 & bVar28 |
                                                           (byte)uVar40 & bVar20)))))));
                puVar13[3] = CONCAT17((byte)(uVar51 >> 0x38) & bVar35 |
                                      (byte)(uVar43 >> 0x38) & bVar27,
                                      CONCAT16((byte)(uVar51 >> 0x30) & bVar34 |
                                               (byte)(uVar43 >> 0x30) & bVar26,
                                               CONCAT15((byte)(uVar51 >> 0x28) & bVar33 |
                                                        (byte)(uVar43 >> 0x28) & bVar25,
                                                        CONCAT14((byte)(uVar51 >> 0x20) & bVar32 |
                                                                 (byte)(uVar43 >> 0x20) & bVar24,
                                                                 CONCAT13((byte)(uVar51 >> 0x18) &
                                                                          bVar31 | (byte)(uVar43 >>
                                                                                         0x18) &
                                                                                   bVar23,
                                                                          CONCAT12((byte)(uVar51 >>
                                                                                         0x10) &
                                                                                   bVar30 | (byte)(
                                                  uVar43 >> 0x10) & bVar22,
                                                  CONCAT11((byte)(uVar51 >> 8) & bVar29 |
                                                           (byte)(uVar43 >> 8) & bVar21,
                                                           (byte)uVar51 & bVar28 |
                                                           (byte)uVar43 & bVar20)))))));
                puVar13[2] = CONCAT17((byte)(uVar50 >> 0x38) & bVar35 |
                                      (byte)(uVar42 >> 0x38) & bVar27,
                                      CONCAT16((byte)(uVar50 >> 0x30) & bVar34 |
                                               (byte)(uVar42 >> 0x30) & bVar26,
                                               CONCAT15((byte)(uVar50 >> 0x28) & bVar33 |
                                                        (byte)(uVar42 >> 0x28) & bVar25,
                                                        CONCAT14((byte)(uVar50 >> 0x20) & bVar32 |
                                                                 (byte)(uVar42 >> 0x20) & bVar24,
                                                                 CONCAT13((byte)(uVar50 >> 0x18) &
                                                                          bVar31 | (byte)(uVar42 >>
                                                                                         0x18) &
                                                                                   bVar23,
                                                                          CONCAT12((byte)(uVar50 >>
                                                                                         0x10) &
                                                                                   bVar30 | (byte)(
                                                  uVar42 >> 0x10) & bVar22,
                                                  CONCAT11((byte)(uVar50 >> 8) & bVar29 |
                                                           (byte)(uVar42 >> 8) & bVar21,
                                                           (byte)uVar50 & bVar28 |
                                                           (byte)uVar42 & bVar20)))))));
                uVar14 = uVar14 - 8;
                puVar12 = puVar12 + 8;
                puVar13 = puVar13 + 8;
              } while (uVar14 != 0);
              if (uVar11 == uVar17) goto LAB_0029faa8;
            }
            lVar5 = uVar17 - uVar11;
            puVar19 = puVar19 + uVar11;
            puVar18 = puVar18 + uVar11;
            do {
              *puVar18 = *puVar19 & uVar10 | *puVar18 & uVar2;
              lVar5 = lVar5 + -1;
              puVar19 = puVar19 + 1;
              puVar18 = puVar18 + 1;
            } while (lVar5 != 0);
          }
LAB_0029faa8:
          *(ulong *)(*unaff_x26 + uVar16 * 8) =
               *(ulong *)(*unaff_x26 + uVar16 * 8) | ((ulong)~(uint)uVar2 & 1) << (uVar8 & 0x3f);
          bVar1 = uVar8 != 0;
          uVar8 = uVar8 - 1;
        } while (bVar1);
        iVar15 = (int)uVar16;
        uVar16 = uVar16 - 1;
      } while (0 < iVar15);
    }
    if (unaff_x28 != 0) {
      lVar5 = func_0x0029bd80();
      uVar4 = 0;
      if (lVar5 == 0) goto LAB_0029fc18;
    }
    if (unaff_x24 != 0) {
      lVar5 = func_0x0029bd80();
      uVar4 = 0;
      if (lVar5 == 0) goto LAB_0029fc18;
    }
    uVar4 = 1;
  }
LAB_0029fc18:
  if (*(char *)(unaff_x21 + 0x28) == '\0') {
    if (*(long *)(unaff_x21 + 0x10) == 0) {
      func_0x0079db4c(uVar4);
LAB_0029fc44:
      lVar5 = func_0x0079dbdc();
      uVar4 = func_0x0029ac7c();
      if (((int)uVar4 != 0) &&
         (uVar4 = func_0x0029e4fc(0,lVar5,lVar5,param_4,param_5), (int)uVar4 != 0)) {
        if (*(int *)(lVar5 + 0x10) != 0) {
          UNRECOVERED_JUMPTABLE = (code *)&_aws_lc_0_24_0_BN_add;
          if (*(int *)(param_4 + 0x10) != 0) {
            UNRECOVERED_JUMPTABLE = (code *)&_aws_lc_0_24_0_BN_sub;
          }
                    /* WARNING: Could not recover jumptable at 0x0029fcc4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          uVar4 = (*UNRECOVERED_JUMPTABLE)(lVar5,lVar5,param_4);
          return uVar4;
        }
        uVar4 = 1;
      }
      return uVar4;
    }
    lVar5 = *(long *)(unaff_x21 + 0x10) + -1;
    *(long *)(unaff_x21 + 0x10) = lVar5;
    *(undefined8 *)(unaff_x21 + 0x20) = *(undefined8 *)(*(long *)(unaff_x21 + 8) + lVar5 * 8);
  }
  return uVar4;
}

