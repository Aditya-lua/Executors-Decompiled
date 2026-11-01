
void FUN_005906b4(long param_1,undefined1 param_2 [16],undefined8 param_3)

{
  code *pcVar1;
  long lVar2;
  long *plVar3;
  long in_x9;
  long in_x10;
  ulong in_x11;
  byte bVar4;
  long in_x12;
  ulong in_x13;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  undefined8 *puVar8;
  undefined8 *unaff_x20;
  long unaff_x21;
  long *unaff_x22;
  undefined8 *unaff_x23;
  long unaff_x24;
  undefined8 *unaff_x25;
  long unaff_x26;
  undefined8 *puVar9;
  undefined8 *unaff_x27;
  byte bVar10;
  byte bVar11;
  byte bVar12;
  byte bVar13;
  byte bVar14;
  byte bVar15;
  byte bVar16;
  byte bVar17;
  undefined8 uVar18;
  
  bVar16 = param_2[7];
  bVar15 = param_2[6];
  bVar14 = param_2[5];
  bVar13 = param_2[4];
  bVar12 = param_2[3];
  bVar11 = param_2[2];
  bVar10 = param_2[1];
  bVar4 = param_2[0];
  do {
    uVar5 = in_x13 & in_x11;
    uVar18 = *(undefined8 *)(in_x10 + uVar5);
    for (uVar6 = CONCAT17(-((byte)((ulong)uVar18 >> 0x38) == bVar16),
                          CONCAT16(-((byte)((ulong)uVar18 >> 0x30) == bVar15),
                                   CONCAT15(-((byte)((ulong)uVar18 >> 0x28) == bVar14),
                                            CONCAT14(-((byte)((ulong)uVar18 >> 0x20) == bVar13),
                                                     CONCAT13(-((byte)((ulong)uVar18 >> 0x18) ==
                                                               bVar12),CONCAT12(-((byte)((ulong)
                                                  uVar18 >> 0x10) == bVar11),
                                                  CONCAT11(-((byte)((ulong)uVar18 >> 8) == bVar10),
                                                           -((byte)uVar18 == bVar4)))))))) &
                 0x8080808080808080; puVar8 = unaff_x20, puVar9 = unaff_x27, uVar6 != 0;
        uVar6 = uVar6 - 1 & uVar6) {
      while (uVar7 = (uVar6 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar6 >> 7 & 0xff00ff00ff00ff) << 8,
            uVar7 = (uVar7 & 0xffff0000ffff0000) >> 0x10 | (uVar7 & 0xffff0000ffff) << 0x10,
            uVar7 = uVar5 + ((ulong)LZCOUNT(uVar7 >> 0x20 | uVar7 << 0x20) >> 3) & in_x11,
            unaff_x20 = puVar8, in_x9 == *(long *)(in_x12 + uVar7 * -0x10)) {
        if ((*(long *)(in_x10 + uVar7 * -0x10 + -8) == 1) &&
           (lVar2 = func_0x0057851c(param_3,unaff_x22), lVar2 != 1)) {
          plVar3 = (long *)*unaff_x22;
          lVar2 = *plVar3;
          *plVar3 = lVar2 + unaff_x26;
          if (lVar2 < 0) {
            func_0x007a05dc();
            goto code_r0x00590720;
          }
          unaff_x20 = puVar8 + 1;
          *puVar8 = plVar3;
          unaff_x25 = *(undefined8 **)(unaff_x21 + 0x18);
          puVar9 = *(undefined8 **)(unaff_x21 + 8);
        }
        if (puVar9 == unaff_x25) {
          return;
        }
        unaff_x27 = puVar9 + 1;
        unaff_x22 = (long *)*puVar9;
        *(undefined8 **)(unaff_x21 + 8) = unaff_x27;
        plVar3 = (long *)unaff_x23[1];
        if (plVar3[3] == 0) goto code_r0x00590708;
        param_1 = 0;
        param_3 = *unaff_x23;
        in_x9 = *unaff_x22;
        uVar5 = (in_x9 + 8) * unaff_x24;
        in_x10 = *plVar3;
        in_x11 = plVar3[1];
        bVar4 = (byte)(uVar5 >> 0x39);
        in_x12 = in_x10 + -0x10;
        uVar5 = uVar5 & in_x11;
        uVar18 = *(undefined8 *)(in_x10 + uVar5);
        uVar6 = CONCAT17(-((byte)((ulong)uVar18 >> 0x38) == bVar4),
                         CONCAT16(-((byte)((ulong)uVar18 >> 0x30) == bVar4),
                                  CONCAT15(-((byte)((ulong)uVar18 >> 0x28) == bVar4),
                                           CONCAT14(-((byte)((ulong)uVar18 >> 0x20) == bVar4),
                                                    CONCAT13(-((byte)((ulong)uVar18 >> 0x18) ==
                                                              bVar4),CONCAT12(-((byte)((ulong)uVar18
                                                                                      >> 0x10) ==
                                                                               bVar4),CONCAT11(-((
                                                  byte)((ulong)uVar18 >> 8) == bVar4),
                                                  -((byte)uVar18 == bVar4)))))))) &
                0x8080808080808080;
        puVar8 = unaff_x20;
        puVar9 = unaff_x27;
        bVar10 = bVar4;
        bVar11 = bVar4;
        bVar12 = bVar4;
        bVar13 = bVar4;
        bVar14 = bVar4;
        bVar15 = bVar4;
        bVar16 = bVar4;
        if (uVar6 == 0) goto LAB_00590698;
      }
      unaff_x27 = puVar9;
    }
LAB_00590698:
    bVar17 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar18 >> 0x38) == -1),
                                 CONCAT16(-((char)((ulong)uVar18 >> 0x30) == -1),
                                          CONCAT15(-((char)((ulong)uVar18 >> 0x28) == -1),
                                                   CONCAT14(-((char)((ulong)uVar18 >> 0x20) == -1),
                                                            CONCAT13(-((char)((ulong)uVar18 >> 0x18)
                                                                      == -1),CONCAT12(-((char)((
                                                  ulong)uVar18 >> 0x10) == -1),
                                                  CONCAT11(-((char)((ulong)uVar18 >> 8) == -1),
                                                           -((char)uVar18 == -1)))))))),1);
    if ((bVar17 & 1) != 0) {
code_r0x00590708:
      func_0x007a23d8(&UNK_008adc1c,0x16,&UNK_009f1398);
code_r0x00590720:
                    /* WARNING: Does not return */
      pcVar1 = (code *)SoftwareBreakpoint(1,0x590724);
      (*pcVar1)();
    }
    param_1 = param_1 + 8;
    in_x13 = uVar5 + param_1;
  } while( true );
}

