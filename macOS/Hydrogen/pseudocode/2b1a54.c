
bool FUN_002b1a54(ulong param_1)

{
  bool bVar1;
  int iVar2;
  undefined1 *puVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  uint uVar6;
  ulong uVar7;
  ulong in_x9;
  long *plVar8;
  ulong in_x10;
  long lVar9;
  ulong in_x11;
  long in_x12;
  long *in_x13;
  undefined8 *puVar10;
  ulong *in_x14;
  ulong *puVar11;
  ulong uVar12;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  ulong *unaff_x22;
  ulong *unaff_x23;
  undefined8 *unaff_x24;
  undefined8 *unaff_x26;
  uint unaff_w27;
  ulong uVar13;
  ulong uVar14;
  ulong uVar15;
  ulong uVar16;
  ulong uVar17;
  ulong uVar18;
  ulong uVar19;
  ulong uVar20;
  ulong uVar21;
  ulong uVar22;
  ulong uVar23;
  ulong uVar24;
  ulong uVar25;
  ulong uVar26;
  ulong uVar27;
  
  do {
    do {
      *in_x14 = (ulong)in_x13[-1] >> 1 | *in_x13 << 0x3f;
      in_x13 = in_x13 + 1;
      in_x12 = in_x12 + -1;
      in_x14 = in_x14 + 1;
    } while (in_x12 != 0);
    do {
      do {
        *(ulong *)(in_x9 + in_x11 * 8) = *(ulong *)(in_x10 + in_x11 * 8) >> 1;
        puVar10 = unaff_x24;
        do {
          unaff_x24 = unaff_x26;
          unaff_x26 = puVar10;
          *(int *)(unaff_x22 + 2) = (int)unaff_x23[2];
          uVar6 = (uint)param_1;
          plVar8 = (long *)(in_x9 + param_1 * 8);
          do {
            plVar8 = plVar8 + -1;
            iVar2 = (int)param_1;
            param_1 = (ulong)(iVar2 - 1);
            if (iVar2 < 1) {
              *(uint *)(unaff_x22 + 1) = uVar6 & (int)uVar6 >> 0x1f;
              if (-1 < (int)uVar6) {
                *(undefined4 *)(unaff_x22 + 2) = 0;
              }
              goto LAB_002b1abc;
            }
          } while (*plVar8 == 0);
          *(int *)(unaff_x22 + 1) = iVar2;
LAB_002b1abc:
          iVar2 = func_0x002ac168();
          if (iVar2 == 0) {
LAB_002b1b88:
            uVar4 = 3;
            uVar5 = 0x1d4;
LAB_002b1ba0:
            func_0x0028f83c(3,0,uVar4,"/aws-lc/crypto/fipsmodule/bn/sqrt.c",uVar5);
            bVar1 = false;
LAB_002b1ba8:
            if (*(char *)(unaff_x19 + 0x28) == '\0') {
              if (*(long *)(unaff_x19 + 0x10) == 0) {
                puVar3 = (undefined1 *)func_0x0079db4c(bVar1);
                return (bool)*puVar3;
              }
              lVar9 = *(long *)(unaff_x19 + 0x10) + -1;
              *(long *)(unaff_x19 + 0x10) = lVar9;
              *(undefined8 *)(unaff_x19 + 0x20) =
                   *(undefined8 *)(*(long *)(unaff_x19 + 8) + lVar9 * 8);
            }
            return bVar1;
          }
          uVar6 = (uint)unaff_x23[1];
          uVar7 = (ulong)uVar6;
          lVar9 = uVar7 * 8;
          do {
            lVar9 = lVar9 + -8;
            iVar2 = (int)uVar7;
            uVar7 = (ulong)(iVar2 - 1);
            if (iVar2 < 1) {
              *(uint *)(unaff_x23 + 1) = uVar6 & (int)uVar6 >> 0x1f;
              if (-1 < (int)uVar6) {
                *(undefined4 *)(unaff_x23 + 2) = 0;
              }
              goto LAB_002b1b14;
            }
          } while (*(long *)(*unaff_x23 + lVar9) == 0);
          *(int *)(unaff_x23 + 1) = iVar2;
LAB_002b1b14:
          iVar2 = func_0x0029b6ec(unaff_x26);
          if (iVar2 == 0) goto LAB_002b1b88;
          *(undefined4 *)(unaff_x26 + 2) = 0;
          if (((unaff_w27 & 1) == 0 && unaff_x24 != (undefined8 *)0x0) &&
             ((*(int *)(unaff_x24 + 2) != 0 ||
              (iVar2 = func_0x0029d99c(*unaff_x26,(long)*(int *)(unaff_x26 + 1),*unaff_x24,
                                       (long)*(int *)(unaff_x24 + 1)), -1 < iVar2)))) {
            iVar2 = func_0x0029db84();
            if (iVar2 == 0) {
              if (unaff_x21 == unaff_x20) {
                lVar9 = func_0x0029bd80();
                bVar1 = lVar9 != 0;
              }
              else {
                bVar1 = true;
              }
              goto LAB_002b1ba8;
            }
            uVar4 = 0x6e;
            uVar5 = 0x1e8;
            goto LAB_002b1ba0;
          }
          iVar2 = func_0x0029e4fc();
          unaff_w27 = 0;
          if (((iVar2 == 0) || (iVar2 = func_0x0029ac7c(), iVar2 == 0)) ||
             (iVar2 = func_0x0029afb8(), iVar2 == 0)) goto LAB_002b1b88;
          in_x9 = *unaff_x22;
          uVar6 = (uint)unaff_x23[1];
          param_1 = (ulong)uVar6;
          puVar10 = unaff_x24;
        } while (uVar6 == 0);
        in_x10 = *unaff_x23;
        lVar9 = (long)(int)uVar6;
        in_x11 = lVar9 - 1;
      } while (in_x11 == 0);
      if ((uVar6 < 9) || (in_x9 < in_x10 + lVar9 * 8 && in_x10 < (in_x9 + lVar9 * 8) - 8)) {
        uVar7 = 0;
        break;
      }
      uVar7 = in_x11 & 0xfffffffffffffff8;
      puVar11 = (ulong *)(in_x10 + 0x20);
      puVar10 = (undefined8 *)(in_x9 + 0x20);
      uVar12 = uVar7;
      do {
        uVar14 = puVar11[-3];
        uVar13 = puVar11[-4];
        uVar16 = puVar11[-1];
        uVar15 = puVar11[-2];
        uVar18 = puVar11[1];
        uVar17 = *puVar11;
        uVar20 = puVar11[3];
        uVar19 = puVar11[2];
        uVar21 = puVar11[-3];
        uVar23 = *puVar11;
        uVar22 = puVar11[-1];
        uVar25 = puVar11[2];
        uVar24 = puVar11[1];
        uVar27 = puVar11[4];
        uVar26 = puVar11[3];
        puVar10[-3] = CONCAT17((byte)((puVar11[-2] << 0x3f) >> 0x38) | (byte)(uVar14 >> 0x39),
                               CONCAT16((char)(uVar14 >> 0x31),
                                        CONCAT15((char)(uVar14 >> 0x29),
                                                 CONCAT14((char)(uVar14 >> 0x21),
                                                          CONCAT13((char)(uVar14 >> 0x19),
                                                                   CONCAT12((char)(uVar14 >> 0x11),
                                                                            CONCAT11((char)(uVar14 
                                                  >> 9),(char)(uVar14 >> 1))))))));
        puVar10[-4] = CONCAT17((byte)((uVar21 << 0x3f) >> 0x38) | (byte)(uVar13 >> 0x39),
                               CONCAT16((char)(uVar13 >> 0x31),
                                        CONCAT15((char)(uVar13 >> 0x29),
                                                 CONCAT14((char)(uVar13 >> 0x21),
                                                          CONCAT13((char)(uVar13 >> 0x19),
                                                                   CONCAT12((char)(uVar13 >> 0x11),
                                                                            CONCAT11((char)(uVar13 
                                                  >> 9),(char)(uVar13 >> 1))))))));
        puVar10[-1] = CONCAT17((byte)((uVar23 << 0x3f) >> 0x38) | (byte)(uVar16 >> 0x39),
                               CONCAT16((char)(uVar16 >> 0x31),
                                        CONCAT15((char)(uVar16 >> 0x29),
                                                 CONCAT14((char)(uVar16 >> 0x21),
                                                          CONCAT13((char)(uVar16 >> 0x19),
                                                                   CONCAT12((char)(uVar16 >> 0x11),
                                                                            CONCAT11((char)(uVar16 
                                                  >> 9),(char)(uVar16 >> 1))))))));
        puVar10[-2] = CONCAT17((byte)((uVar22 << 0x3f) >> 0x38) | (byte)(uVar15 >> 0x39),
                               CONCAT16((char)(uVar15 >> 0x31),
                                        CONCAT15((char)(uVar15 >> 0x29),
                                                 CONCAT14((char)(uVar15 >> 0x21),
                                                          CONCAT13((char)(uVar15 >> 0x19),
                                                                   CONCAT12((char)(uVar15 >> 0x11),
                                                                            CONCAT11((char)(uVar15 
                                                  >> 9),(char)(uVar15 >> 1))))))));
        puVar10[1] = CONCAT17((byte)((uVar25 << 0x3f) >> 0x38) | (byte)(uVar18 >> 0x39),
                              CONCAT16((char)(uVar18 >> 0x31),
                                       CONCAT15((char)(uVar18 >> 0x29),
                                                CONCAT14((char)(uVar18 >> 0x21),
                                                         CONCAT13((char)(uVar18 >> 0x19),
                                                                  CONCAT12((char)(uVar18 >> 0x11),
                                                                           CONCAT11((char)(uVar18 >>
                                                                                          9),(char)(
                                                  uVar18 >> 1))))))));
        *puVar10 = CONCAT17((byte)((uVar24 << 0x3f) >> 0x38) | (byte)(uVar17 >> 0x39),
                            CONCAT16((char)(uVar17 >> 0x31),
                                     CONCAT15((char)(uVar17 >> 0x29),
                                              CONCAT14((char)(uVar17 >> 0x21),
                                                       CONCAT13((char)(uVar17 >> 0x19),
                                                                CONCAT12((char)(uVar17 >> 0x11),
                                                                         CONCAT11((char)(uVar17 >> 9
                                                                                        ),(char)(
                                                  uVar17 >> 1))))))));
        puVar10[3] = CONCAT17((byte)((uVar27 << 0x3f) >> 0x38) | (byte)(uVar20 >> 0x39),
                              CONCAT16((char)(uVar20 >> 0x31),
                                       CONCAT15((char)(uVar20 >> 0x29),
                                                CONCAT14((char)(uVar20 >> 0x21),
                                                         CONCAT13((char)(uVar20 >> 0x19),
                                                                  CONCAT12((char)(uVar20 >> 0x11),
                                                                           CONCAT11((char)(uVar20 >>
                                                                                          9),(char)(
                                                  uVar20 >> 1))))))));
        puVar10[2] = CONCAT17((byte)((uVar26 << 0x3f) >> 0x38) | (byte)(uVar19 >> 0x39),
                              CONCAT16((char)(uVar19 >> 0x31),
                                       CONCAT15((char)(uVar19 >> 0x29),
                                                CONCAT14((char)(uVar19 >> 0x21),
                                                         CONCAT13((char)(uVar19 >> 0x19),
                                                                  CONCAT12((char)(uVar19 >> 0x11),
                                                                           CONCAT11((char)(uVar19 >>
                                                                                          9),(char)(
                                                  uVar19 >> 1))))))));
        puVar11 = puVar11 + 8;
        uVar12 = uVar12 - 8;
        puVar10 = puVar10 + 8;
      } while (uVar12 != 0);
    } while (in_x11 == uVar7);
    in_x14 = (ulong *)(in_x9 + uVar7 * 8);
    in_x12 = ~uVar7 + lVar9;
    in_x13 = (long *)(in_x10 + uVar7 * 8 + 8);
  } while( true );
}

