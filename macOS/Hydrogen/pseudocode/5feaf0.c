
void FUN_005feaf0(long param_1)

{
  uint uVar1;
  long *plVar2;
  uint uVar3;
  long lVar4;
  ulong uVar5;
  ulong in_x9;
  ulong uVar6;
  uint uVar7;
  ulong uVar8;
  long *plVar9;
  ulong unaff_x19;
  long unaff_x20;
  long *unaff_x21;
  ulong uVar10;
  long unaff_x23;
  ulong *puVar11;
  long lVar12;
  long lVar13;
  long lVar14;
  long lVar15;
  long lVar16;
  long lVar17;
  long lVar18;
  byte in_stack_00000008;
  
  if (in_x9 < 0x108) {
    uVar10 = 0x20;
  }
  else if (in_x9 < 0x208) {
    uVar10 = 0x40;
  }
  else {
    uVar7 = 0;
    uVar10 = 0x40;
    do {
      uVar3 = uVar7 + (uint)uVar10 >> 1;
      uVar1 = uVar3;
      if (param_1 - 1U >> ((ulong)uVar3 & 0x3f) != 0) {
        uVar1 = (uint)uVar10;
        uVar7 = uVar3;
      }
      uVar10 = (ulong)uVar1;
    } while (1 < uVar1 - uVar7);
    uVar10 = 1L << (uVar10 & 0x3f);
  }
  puVar11 = (ulong *)(unaff_x23 + 0x10);
  uVar5 = *puVar11;
  lVar4 = *(long *)(unaff_x23 + 0x18);
  if (uVar5 != uVar10) {
    if (lVar4 != 0) {
      if (uVar5 != 0) {
        do {
          *(undefined8 *)(lVar4 + -8 + uVar5 * 8) = 0;
          uVar5 = uVar5 - 1;
        } while (uVar5 != 0);
      }
      func_0x00611644();
    }
    func_0x006108a0(uVar10);
    if (uVar10 == 0) {
      *puVar11 = 0;
      *(undefined8 *)(unaff_x23 + 0x18) = 0;
      *(undefined8 *)(unaff_x23 + 8) = 0x1fffffffffffffff;
      goto joined_r0x005fe918;
    }
    lVar4 = func_0x006115d0(uVar10 << 3);
  }
  *(ulong *)(unaff_x23 + 0x10) = uVar10;
  *(long *)(unaff_x23 + 0x18) = lVar4;
  if (lVar4 != 0) {
    _bzero(lVar4,uVar10 << 3);
  }
  *(undefined8 *)(unaff_x23 + 8) = 0x1fffffffffffffff;
joined_r0x005fe918:
  if (unaff_x19 != 0) {
    uVar5 = unaff_x19 * 8;
    uVar10 = unaff_x19;
    do {
      uVar5 = uVar5 - 8;
      uVar10 = uVar10 - 1;
      (**(code **)(*unaff_x21 + 0xa8))();
      *(ulong *)(*(long *)(unaff_x23 + 0x18) + (uVar10 & 0xfffffffffffffff8)) =
           *(ulong *)(*(long *)(unaff_x23 + 0x18) + (uVar10 & 0xfffffffffffffff8)) |
           (ulong)in_stack_00000008 << (uVar5 & 0x38);
    } while (uVar10 != 0);
  }
  if (*(int *)(unaff_x20 + 0x28) == 1) {
    uVar10 = *(ulong *)(unaff_x23 + 0x10);
    plVar2 = *(long **)(unaff_x23 + 0x18);
    if (unaff_x19 < uVar10 << 3) {
      uVar5 = unaff_x19 << 3;
      do {
        *(ulong *)((long)plVar2 + (unaff_x19 & 0xfffffffffffffff8)) =
             *(ulong *)((long)plVar2 + (unaff_x19 & 0xfffffffffffffff8)) | 0xffL << (uVar5 & 0x38);
        unaff_x19 = unaff_x19 + 1;
        uVar10 = *puVar11;
        uVar5 = uVar5 + 8;
      } while (unaff_x19 < uVar10 << 3);
    }
    lVar4 = *plVar2;
    *plVar2 = lVar4 + -1;
    if ((uVar10 < 2) || (lVar4 != 0)) {
      if (uVar10 == 0) {
        return;
      }
    }
    else {
      uVar5 = 2;
      uVar8 = 1;
      do {
        uVar6 = uVar5;
        lVar4 = plVar2[uVar8];
        plVar2[uVar8] = lVar4 + -1;
        uVar5 = (ulong)((int)uVar6 + 1);
        uVar8 = uVar6;
      } while ((lVar4 == 0 && uVar6 <= uVar10) && (lVar4 != 0 || uVar10 != uVar6));
    }
    if (uVar10 < 10) {
      uVar5 = 0;
      uVar7 = 0;
    }
    else {
      uVar7 = 0;
      uVar5 = 0;
      if (((int)(uVar10 - 1) != -1) && (uVar10 - 1 >> 0x20 == 0)) {
        uVar5 = uVar10 & 0xfffffffffffffff8;
        uVar7 = (uint)uVar5;
        plVar9 = plVar2 + 4;
        uVar8 = uVar5;
        do {
          lVar12 = plVar9[-3];
          lVar4 = plVar9[-4];
          lVar14 = plVar9[-1];
          lVar13 = plVar9[-2];
          lVar16 = plVar9[1];
          lVar15 = *plVar9;
          lVar18 = plVar9[3];
          lVar17 = plVar9[2];
          plVar9[-3] = CONCAT17(~(byte)((ulong)lVar12 >> 0x38),
                                CONCAT16(~(byte)((ulong)lVar12 >> 0x30),
                                         CONCAT15(~(byte)((ulong)lVar12 >> 0x28),
                                                  CONCAT14(~(byte)((ulong)lVar12 >> 0x20),
                                                           CONCAT13(~(byte)((ulong)lVar12 >> 0x18),
                                                                    CONCAT12(~(byte)((ulong)lVar12
                                                                                    >> 0x10),
                                                                             CONCAT11(~(byte)((ulong
                                                  )lVar12 >> 8),~(byte)lVar12)))))));
          plVar9[-4] = CONCAT17(~(byte)((ulong)lVar4 >> 0x38),
                                CONCAT16(~(byte)((ulong)lVar4 >> 0x30),
                                         CONCAT15(~(byte)((ulong)lVar4 >> 0x28),
                                                  CONCAT14(~(byte)((ulong)lVar4 >> 0x20),
                                                           CONCAT13(~(byte)((ulong)lVar4 >> 0x18),
                                                                    CONCAT12(~(byte)((ulong)lVar4 >>
                                                                                    0x10),
                                                                             CONCAT11(~(byte)((ulong
                                                  )lVar4 >> 8),~(byte)lVar4)))))));
          plVar9[-1] = CONCAT17(~(byte)((ulong)lVar14 >> 0x38),
                                CONCAT16(~(byte)((ulong)lVar14 >> 0x30),
                                         CONCAT15(~(byte)((ulong)lVar14 >> 0x28),
                                                  CONCAT14(~(byte)((ulong)lVar14 >> 0x20),
                                                           CONCAT13(~(byte)((ulong)lVar14 >> 0x18),
                                                                    CONCAT12(~(byte)((ulong)lVar14
                                                                                    >> 0x10),
                                                                             CONCAT11(~(byte)((ulong
                                                  )lVar14 >> 8),~(byte)lVar14)))))));
          plVar9[-2] = CONCAT17(~(byte)((ulong)lVar13 >> 0x38),
                                CONCAT16(~(byte)((ulong)lVar13 >> 0x30),
                                         CONCAT15(~(byte)((ulong)lVar13 >> 0x28),
                                                  CONCAT14(~(byte)((ulong)lVar13 >> 0x20),
                                                           CONCAT13(~(byte)((ulong)lVar13 >> 0x18),
                                                                    CONCAT12(~(byte)((ulong)lVar13
                                                                                    >> 0x10),
                                                                             CONCAT11(~(byte)((ulong
                                                  )lVar13 >> 8),~(byte)lVar13)))))));
          plVar9[1] = CONCAT17(~(byte)((ulong)lVar16 >> 0x38),
                               CONCAT16(~(byte)((ulong)lVar16 >> 0x30),
                                        CONCAT15(~(byte)((ulong)lVar16 >> 0x28),
                                                 CONCAT14(~(byte)((ulong)lVar16 >> 0x20),
                                                          CONCAT13(~(byte)((ulong)lVar16 >> 0x18),
                                                                   CONCAT12(~(byte)((ulong)lVar16 >>
                                                                                   0x10),
                                                                            CONCAT11(~(byte)((ulong)
                                                  lVar16 >> 8),~(byte)lVar16)))))));
          *plVar9 = CONCAT17(~(byte)((ulong)lVar15 >> 0x38),
                             CONCAT16(~(byte)((ulong)lVar15 >> 0x30),
                                      CONCAT15(~(byte)((ulong)lVar15 >> 0x28),
                                               CONCAT14(~(byte)((ulong)lVar15 >> 0x20),
                                                        CONCAT13(~(byte)((ulong)lVar15 >> 0x18),
                                                                 CONCAT12(~(byte)((ulong)lVar15 >>
                                                                                 0x10),
                                                                          CONCAT11(~(byte)((ulong)
                                                  lVar15 >> 8),~(byte)lVar15)))))));
          plVar9[3] = CONCAT17(~(byte)((ulong)lVar18 >> 0x38),
                               CONCAT16(~(byte)((ulong)lVar18 >> 0x30),
                                        CONCAT15(~(byte)((ulong)lVar18 >> 0x28),
                                                 CONCAT14(~(byte)((ulong)lVar18 >> 0x20),
                                                          CONCAT13(~(byte)((ulong)lVar18 >> 0x18),
                                                                   CONCAT12(~(byte)((ulong)lVar18 >>
                                                                                   0x10),
                                                                            CONCAT11(~(byte)((ulong)
                                                  lVar18 >> 8),~(byte)lVar18)))))));
          plVar9[2] = CONCAT17(~(byte)((ulong)lVar17 >> 0x38),
                               CONCAT16(~(byte)((ulong)lVar17 >> 0x30),
                                        CONCAT15(~(byte)((ulong)lVar17 >> 0x28),
                                                 CONCAT14(~(byte)((ulong)lVar17 >> 0x20),
                                                          CONCAT13(~(byte)((ulong)lVar17 >> 0x18),
                                                                   CONCAT12(~(byte)((ulong)lVar17 >>
                                                                                   0x10),
                                                                            CONCAT11(~(byte)((ulong)
                                                  lVar17 >> 8),~(byte)lVar17)))))));
          uVar8 = uVar8 - 8;
          plVar9 = plVar9 + 8;
        } while (uVar8 != 0);
        if (uVar10 == uVar5) {
          return;
        }
      }
    }
    do {
      uVar7 = uVar7 + 1;
      plVar2[uVar5] = ~plVar2[uVar5];
      uVar5 = (ulong)uVar7;
    } while (uVar5 < uVar10);
  }
  return;
}

