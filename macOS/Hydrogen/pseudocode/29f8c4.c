
undefined8
FUN_0029f8c4(undefined8 param_1,undefined8 param_2,undefined8 param_3,ulong param_4,
            undefined8 param_5)

{
  bool bVar1;
  code *UNRECOVERED_JUMPTABLE;
  ulong uVar2;
  uint uVar3;
  long lVar4;
  long *plVar5;
  long *plVar6;
  undefined8 *puVar7;
  undefined8 uVar8;
  long lVar9;
  undefined4 uVar10;
  ulong uVar11;
  uint uVar12;
  ulong uVar13;
  ulong uVar14;
  ulong *puVar15;
  ulong *puVar16;
  ulong uVar17;
  int iVar18;
  undefined8 unaff_x19;
  ulong uVar19;
  long unaff_x20;
  ulong uVar20;
  long unaff_x21;
  long *unaff_x22;
  long *unaff_x23;
  long *unaff_x24;
  uint unaff_w27;
  ulong *puVar21;
  long *unaff_x28;
  ulong *puVar22;
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
  byte bVar36;
  byte bVar37;
  byte bVar38;
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
  ulong uVar52;
  ulong uVar53;
  ulong uVar54;
  
  lVar4 = func_0x0036e48c(param_1,unaff_x20 << 3);
  if (lVar4 == 0) {
    *(undefined2 *)(unaff_x21 + 0x28) = 0x101;
  }
  else {
    *(long *)(unaff_x21 + 8) = lVar4;
    *(long *)(unaff_x21 + 0x18) = unaff_x20;
    *(undefined8 *)(lVar4 + *(long *)(unaff_x21 + 0x10) * 8) = unaff_x19;
    *(long *)(unaff_x21 + 0x10) = *(long *)(unaff_x21 + 0x10) + 1;
  }
  if (((unaff_x28 == (long *)0x0) || (unaff_x28 == unaff_x23)) ||
     (plVar5 = unaff_x28, unaff_x28 == unaff_x22)) {
    plVar5 = (long *)func_0x0029e340();
  }
  if (((unaff_x24 == (long *)0x0) || (unaff_x24 == unaff_x23)) ||
     (plVar6 = unaff_x24, unaff_x24 == unaff_x22)) {
    plVar6 = (long *)func_0x0029e340();
  }
  puVar7 = (undefined8 *)func_0x0029e340();
  uVar8 = 0;
  if (((plVar5 != (long *)0x0) && (plVar6 != (long *)0x0)) &&
     ((puVar7 != (undefined8 *)0x0 &&
      (((uVar8 = func_0x0029afb8(plVar5,(long)(int)unaff_x23[1]), (int)uVar8 != 0 &&
        (uVar8 = func_0x0029afb8(plVar6,(long)(int)unaff_x22[1]), (int)uVar8 != 0)) &&
       (uVar8 = func_0x0029afb8(puVar7,(long)(int)unaff_x22[1]), (int)uVar8 != 0)))))) {
    uVar10 = 0;
    if ((int)unaff_x23[1] != 0) {
      _bzero(*plVar5,(long)(int)unaff_x23[1] << 3);
      uVar10 = (undefined4)unaff_x23[1];
    }
    *(undefined4 *)(plVar5 + 1) = uVar10;
    *(undefined4 *)(plVar5 + 2) = 0;
    uVar10 = 0;
    if ((int)unaff_x22[1] != 0) {
      _bzero(*plVar6,(long)(int)unaff_x22[1] << 3);
      uVar10 = (undefined4)unaff_x22[1];
    }
    *(undefined4 *)(plVar6 + 1) = uVar10;
    *(undefined4 *)(plVar6 + 2) = 0;
    uVar3 = func_0x0029bf0c();
    if (uVar3 < unaff_w27) goto code_r0x0029fc44;
    uVar3 = *(uint *)(unaff_x23 + 1);
    if (unaff_w27 == 0) {
code_r0x0029fa50:
      uVar12 = 0xffffffff;
    }
    else {
      uVar12 = unaff_w27 - 1 >> 6;
      if ((int)uVar3 <= (int)uVar12) {
        uVar12 = uVar3;
      }
      if (uVar12 == 0) goto code_r0x0029fa50;
      _memcpy(*plVar6,(*unaff_x23 + (long)(int)uVar3 * 8) -
                      (-(ulong)(uVar12 >> 0x1f) & 0xfffffff800000000 | (ulong)uVar12 << 3));
      uVar3 = *(uint *)(unaff_x23 + 1);
      uVar12 = ~uVar12;
    }
    uVar19 = (ulong)(uVar3 + uVar12);
    if (-1 < (int)(uVar3 + uVar12)) {
      do {
        uVar11 = 0x3f;
        do {
          lVar4 = *plVar6;
          lVar4 = func_0x00382c70(lVar4,lVar4,lVar4,(long)(int)unaff_x22[1]);
          puVar21 = (ulong *)*plVar6;
          *puVar21 = *puVar21 | *(ulong *)(*unaff_x23 + uVar19 * 8) >> (uVar11 & 0x3f) & 1;
          puVar22 = (ulong *)*puVar7;
          uVar3 = *(uint *)(unaff_x22 + 1);
          uVar20 = (ulong)(int)uVar3;
          param_4 = uVar20;
          lVar9 = func_0x00382cc0(puVar22,puVar21,*unaff_x22);
          uVar2 = lVar4 - lVar9;
          if (uVar2 != 0 && uVar2 != 0xffffffffffffffff) {
            uVar8 = func_0x0079dbb8();
            goto code_r0x0029fc18;
          }
          if (uVar3 != 0) {
            uVar13 = ~uVar2;
            if ((uVar3 < 8) || (puVar21 < puVar22 + uVar20 && puVar22 < puVar21 + uVar20)) {
              uVar14 = 0;
            }
            else {
              uVar14 = uVar20 & 0xfffffffffffffff8;
              puVar15 = puVar22 + 4;
              puVar16 = puVar21 + 4;
              uVar17 = uVar14;
              do {
                uVar40 = puVar16[-3];
                uVar39 = puVar16[-4];
                uVar42 = puVar16[-1];
                uVar41 = puVar16[-2];
                uVar44 = puVar16[1];
                uVar43 = *puVar16;
                uVar46 = puVar16[3];
                uVar45 = puVar16[2];
                uVar48 = puVar15[-3];
                uVar47 = puVar15[-4];
                uVar50 = puVar15[-1];
                uVar49 = puVar15[-2];
                uVar52 = puVar15[1];
                uVar51 = *puVar15;
                uVar54 = puVar15[3];
                uVar53 = puVar15[2];
                bVar23 = (byte)uVar2;
                bVar24 = (byte)(uVar2 >> 8);
                bVar25 = (byte)(uVar2 >> 0x10);
                bVar26 = (byte)(uVar2 >> 0x18);
                bVar27 = (byte)(uVar2 >> 0x20);
                bVar28 = (byte)(uVar2 >> 0x28);
                bVar29 = (byte)(uVar2 >> 0x30);
                bVar30 = (byte)(uVar2 >> 0x38);
                bVar31 = (byte)uVar13;
                bVar32 = (byte)(uVar13 >> 8);
                bVar33 = (byte)(uVar13 >> 0x10);
                bVar34 = (byte)(uVar13 >> 0x18);
                bVar35 = (byte)(uVar13 >> 0x20);
                bVar36 = (byte)(uVar13 >> 0x28);
                bVar37 = (byte)(uVar13 >> 0x30);
                bVar38 = (byte)(uVar13 >> 0x38);
                puVar16[-3] = CONCAT17((byte)(uVar48 >> 0x38) & bVar38 |
                                       (byte)(uVar40 >> 0x38) & bVar30,
                                       CONCAT16((byte)(uVar48 >> 0x30) & bVar37 |
                                                (byte)(uVar40 >> 0x30) & bVar29,
                                                CONCAT15((byte)(uVar48 >> 0x28) & bVar36 |
                                                         (byte)(uVar40 >> 0x28) & bVar28,
                                                         CONCAT14((byte)(uVar48 >> 0x20) & bVar35 |
                                                                  (byte)(uVar40 >> 0x20) & bVar27,
                                                                  CONCAT13((byte)(uVar48 >> 0x18) &
                                                                           bVar34 | (byte)(uVar40 >>
                                                                                          0x18) &
                                                                                    bVar26,
                                                                           CONCAT12((byte)(uVar48 >>
                                                                                          0x10) &
                                                                                    bVar33 | (byte)(
                                                  uVar40 >> 0x10) & bVar25,
                                                  CONCAT11((byte)(uVar48 >> 8) & bVar32 |
                                                           (byte)(uVar40 >> 8) & bVar24,
                                                           (byte)uVar48 & bVar31 |
                                                           (byte)uVar40 & bVar23)))))));
                puVar16[-4] = CONCAT17((byte)(uVar47 >> 0x38) & bVar38 |
                                       (byte)(uVar39 >> 0x38) & bVar30,
                                       CONCAT16((byte)(uVar47 >> 0x30) & bVar37 |
                                                (byte)(uVar39 >> 0x30) & bVar29,
                                                CONCAT15((byte)(uVar47 >> 0x28) & bVar36 |
                                                         (byte)(uVar39 >> 0x28) & bVar28,
                                                         CONCAT14((byte)(uVar47 >> 0x20) & bVar35 |
                                                                  (byte)(uVar39 >> 0x20) & bVar27,
                                                                  CONCAT13((byte)(uVar47 >> 0x18) &
                                                                           bVar34 | (byte)(uVar39 >>
                                                                                          0x18) &
                                                                                    bVar26,
                                                                           CONCAT12((byte)(uVar47 >>
                                                                                          0x10) &
                                                                                    bVar33 | (byte)(
                                                  uVar39 >> 0x10) & bVar25,
                                                  CONCAT11((byte)(uVar47 >> 8) & bVar32 |
                                                           (byte)(uVar39 >> 8) & bVar24,
                                                           (byte)uVar47 & bVar31 |
                                                           (byte)uVar39 & bVar23)))))));
                puVar16[-1] = CONCAT17((byte)(uVar50 >> 0x38) & bVar38 |
                                       (byte)(uVar42 >> 0x38) & bVar30,
                                       CONCAT16((byte)(uVar50 >> 0x30) & bVar37 |
                                                (byte)(uVar42 >> 0x30) & bVar29,
                                                CONCAT15((byte)(uVar50 >> 0x28) & bVar36 |
                                                         (byte)(uVar42 >> 0x28) & bVar28,
                                                         CONCAT14((byte)(uVar50 >> 0x20) & bVar35 |
                                                                  (byte)(uVar42 >> 0x20) & bVar27,
                                                                  CONCAT13((byte)(uVar50 >> 0x18) &
                                                                           bVar34 | (byte)(uVar42 >>
                                                                                          0x18) &
                                                                                    bVar26,
                                                                           CONCAT12((byte)(uVar50 >>
                                                                                          0x10) &
                                                                                    bVar33 | (byte)(
                                                  uVar42 >> 0x10) & bVar25,
                                                  CONCAT11((byte)(uVar50 >> 8) & bVar32 |
                                                           (byte)(uVar42 >> 8) & bVar24,
                                                           (byte)uVar50 & bVar31 |
                                                           (byte)uVar42 & bVar23)))))));
                puVar16[-2] = CONCAT17((byte)(uVar49 >> 0x38) & bVar38 |
                                       (byte)(uVar41 >> 0x38) & bVar30,
                                       CONCAT16((byte)(uVar49 >> 0x30) & bVar37 |
                                                (byte)(uVar41 >> 0x30) & bVar29,
                                                CONCAT15((byte)(uVar49 >> 0x28) & bVar36 |
                                                         (byte)(uVar41 >> 0x28) & bVar28,
                                                         CONCAT14((byte)(uVar49 >> 0x20) & bVar35 |
                                                                  (byte)(uVar41 >> 0x20) & bVar27,
                                                                  CONCAT13((byte)(uVar49 >> 0x18) &
                                                                           bVar34 | (byte)(uVar41 >>
                                                                                          0x18) &
                                                                                    bVar26,
                                                                           CONCAT12((byte)(uVar49 >>
                                                                                          0x10) &
                                                                                    bVar33 | (byte)(
                                                  uVar41 >> 0x10) & bVar25,
                                                  CONCAT11((byte)(uVar49 >> 8) & bVar32 |
                                                           (byte)(uVar41 >> 8) & bVar24,
                                                           (byte)uVar49 & bVar31 |
                                                           (byte)uVar41 & bVar23)))))));
                puVar16[1] = CONCAT17((byte)(uVar52 >> 0x38) & bVar38 |
                                      (byte)(uVar44 >> 0x38) & bVar30,
                                      CONCAT16((byte)(uVar52 >> 0x30) & bVar37 |
                                               (byte)(uVar44 >> 0x30) & bVar29,
                                               CONCAT15((byte)(uVar52 >> 0x28) & bVar36 |
                                                        (byte)(uVar44 >> 0x28) & bVar28,
                                                        CONCAT14((byte)(uVar52 >> 0x20) & bVar35 |
                                                                 (byte)(uVar44 >> 0x20) & bVar27,
                                                                 CONCAT13((byte)(uVar52 >> 0x18) &
                                                                          bVar34 | (byte)(uVar44 >>
                                                                                         0x18) &
                                                                                   bVar26,
                                                                          CONCAT12((byte)(uVar52 >>
                                                                                         0x10) &
                                                                                   bVar33 | (byte)(
                                                  uVar44 >> 0x10) & bVar25,
                                                  CONCAT11((byte)(uVar52 >> 8) & bVar32 |
                                                           (byte)(uVar44 >> 8) & bVar24,
                                                           (byte)uVar52 & bVar31 |
                                                           (byte)uVar44 & bVar23)))))));
                *puVar16 = CONCAT17((byte)(uVar51 >> 0x38) & bVar38 |
                                    (byte)(uVar43 >> 0x38) & bVar30,
                                    CONCAT16((byte)(uVar51 >> 0x30) & bVar37 |
                                             (byte)(uVar43 >> 0x30) & bVar29,
                                             CONCAT15((byte)(uVar51 >> 0x28) & bVar36 |
                                                      (byte)(uVar43 >> 0x28) & bVar28,
                                                      CONCAT14((byte)(uVar51 >> 0x20) & bVar35 |
                                                               (byte)(uVar43 >> 0x20) & bVar27,
                                                               CONCAT13((byte)(uVar51 >> 0x18) &
                                                                        bVar34 | (byte)(uVar43 >>
                                                                                       0x18) &
                                                                                 bVar26,
                                                                        CONCAT12((byte)(uVar51 >>
                                                                                       0x10) &
                                                                                 bVar33 | (byte)(
                                                  uVar43 >> 0x10) & bVar25,
                                                  CONCAT11((byte)(uVar51 >> 8) & bVar32 |
                                                           (byte)(uVar43 >> 8) & bVar24,
                                                           (byte)uVar51 & bVar31 |
                                                           (byte)uVar43 & bVar23)))))));
                puVar16[3] = CONCAT17((byte)(uVar54 >> 0x38) & bVar38 |
                                      (byte)(uVar46 >> 0x38) & bVar30,
                                      CONCAT16((byte)(uVar54 >> 0x30) & bVar37 |
                                               (byte)(uVar46 >> 0x30) & bVar29,
                                               CONCAT15((byte)(uVar54 >> 0x28) & bVar36 |
                                                        (byte)(uVar46 >> 0x28) & bVar28,
                                                        CONCAT14((byte)(uVar54 >> 0x20) & bVar35 |
                                                                 (byte)(uVar46 >> 0x20) & bVar27,
                                                                 CONCAT13((byte)(uVar54 >> 0x18) &
                                                                          bVar34 | (byte)(uVar46 >>
                                                                                         0x18) &
                                                                                   bVar26,
                                                                          CONCAT12((byte)(uVar54 >>
                                                                                         0x10) &
                                                                                   bVar33 | (byte)(
                                                  uVar46 >> 0x10) & bVar25,
                                                  CONCAT11((byte)(uVar54 >> 8) & bVar32 |
                                                           (byte)(uVar46 >> 8) & bVar24,
                                                           (byte)uVar54 & bVar31 |
                                                           (byte)uVar46 & bVar23)))))));
                puVar16[2] = CONCAT17((byte)(uVar53 >> 0x38) & bVar38 |
                                      (byte)(uVar45 >> 0x38) & bVar30,
                                      CONCAT16((byte)(uVar53 >> 0x30) & bVar37 |
                                               (byte)(uVar45 >> 0x30) & bVar29,
                                               CONCAT15((byte)(uVar53 >> 0x28) & bVar36 |
                                                        (byte)(uVar45 >> 0x28) & bVar28,
                                                        CONCAT14((byte)(uVar53 >> 0x20) & bVar35 |
                                                                 (byte)(uVar45 >> 0x20) & bVar27,
                                                                 CONCAT13((byte)(uVar53 >> 0x18) &
                                                                          bVar34 | (byte)(uVar45 >>
                                                                                         0x18) &
                                                                                   bVar26,
                                                                          CONCAT12((byte)(uVar53 >>
                                                                                         0x10) &
                                                                                   bVar33 | (byte)(
                                                  uVar45 >> 0x10) & bVar25,
                                                  CONCAT11((byte)(uVar53 >> 8) & bVar32 |
                                                           (byte)(uVar45 >> 8) & bVar24,
                                                           (byte)uVar53 & bVar31 |
                                                           (byte)uVar45 & bVar23)))))));
                uVar17 = uVar17 - 8;
                puVar15 = puVar15 + 8;
                puVar16 = puVar16 + 8;
              } while (uVar17 != 0);
              if (uVar14 == uVar20) goto code_r0x0029faa8;
            }
            lVar4 = uVar20 - uVar14;
            puVar22 = puVar22 + uVar14;
            puVar21 = puVar21 + uVar14;
            do {
              *puVar21 = *puVar22 & uVar13 | *puVar21 & uVar2;
              lVar4 = lVar4 + -1;
              puVar22 = puVar22 + 1;
              puVar21 = puVar21 + 1;
            } while (lVar4 != 0);
          }
code_r0x0029faa8:
          *(ulong *)(*plVar5 + uVar19 * 8) =
               *(ulong *)(*plVar5 + uVar19 * 8) | ((ulong)~(uint)uVar2 & 1) << (uVar11 & 0x3f);
          bVar1 = uVar11 != 0;
          uVar11 = uVar11 - 1;
        } while (bVar1);
        iVar18 = (int)uVar19;
        uVar19 = uVar19 - 1;
      } while (0 < iVar18);
    }
    if (unaff_x28 != (long *)0x0) {
      lVar4 = func_0x0029bd80(unaff_x28,plVar5);
      uVar8 = 0;
      if (lVar4 == 0) goto code_r0x0029fc18;
    }
    if (unaff_x24 != (long *)0x0) {
      lVar4 = func_0x0029bd80(unaff_x24,plVar6);
      uVar8 = 0;
      if (lVar4 == 0) goto code_r0x0029fc18;
    }
    uVar8 = 1;
  }
code_r0x0029fc18:
  if (*(char *)(unaff_x21 + 0x28) == '\0') {
    if (*(long *)(unaff_x21 + 0x10) == 0) {
      func_0x0079db4c(uVar8);
code_r0x0029fc44:
      lVar4 = func_0x0079dbdc();
      uVar8 = func_0x0029ac7c();
      if (((int)uVar8 != 0) &&
         (uVar8 = func_0x0029e4fc(0,lVar4,lVar4,param_4,param_5), (int)uVar8 != 0)) {
        if (*(int *)(lVar4 + 0x10) != 0) {
          UNRECOVERED_JUMPTABLE = (code *)&_aws_lc_0_24_0_BN_add;
          if (*(int *)(param_4 + 0x10) != 0) {
            UNRECOVERED_JUMPTABLE = (code *)&_aws_lc_0_24_0_BN_sub;
          }
                    /* WARNING: Could not recover jumptable at 0x0029fcc4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          uVar8 = (*UNRECOVERED_JUMPTABLE)(lVar4,lVar4,param_4);
          return uVar8;
        }
        uVar8 = 1;
      }
      return uVar8;
    }
    lVar4 = *(long *)(unaff_x21 + 0x10) + -1;
    *(long *)(unaff_x21 + 0x10) = lVar4;
    *(undefined8 *)(unaff_x21 + 0x20) = *(undefined8 *)(*(long *)(unaff_x21 + 8) + lVar4 * 8);
  }
  return uVar8;
}

