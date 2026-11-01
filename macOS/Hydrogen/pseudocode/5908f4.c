
undefined8
FUN_005908f4(long *param_1,undefined8 param_2,undefined8 param_3,undefined8 *param_4,
            undefined8 *param_5)

{
  ulong uVar1;
  long lVar2;
  ulong uVar3;
  code *pcVar4;
  long lVar5;
  long lVar6;
  long *plVar7;
  byte bVar8;
  ulong uVar9;
  ulong uVar10;
  undefined8 *puVar11;
  long *plVar12;
  undefined8 *puVar13;
  undefined8 *puVar14;
  byte bVar15;
  undefined8 uVar16;
  undefined1 auVar17 [16];
  undefined8 uStack0000000000000008;
  
  lVar5 = *param_1;
  *param_1 = lVar5 + -1;
  LORelease();
  if (lVar5 == 1) {
    func_0x005d2ac4(&uStack0000000000000008);
  }
  __Unwind_Resume();
  auVar17 = func_0x007a2668();
  lVar5 = auVar17._0_8_;
  puVar13 = *(undefined8 **)(lVar5 + 0x18);
  if (*(undefined8 **)(lVar5 + 8) != puVar13) {
    param_5 = (undefined8 *)*param_5;
    puVar11 = *(undefined8 **)(lVar5 + 8);
    do {
      puVar14 = puVar11 + 1;
      plVar12 = (long *)*puVar11;
      *(undefined8 **)(lVar5 + 8) = puVar14;
      plVar7 = (long *)param_5[1];
      if (plVar7[3] == 0) {
LAB_00590a74:
        func_0x007a23d8(&UNK_008adc1c,0x16,&UNK_009f13b0);
code_r0x00590a8c:
                    /* WARNING: Does not return */
        pcVar4 = (code *)SoftwareBreakpoint(1,0x590a90);
        (*pcVar4)();
      }
      lVar6 = 0;
      uVar9 = (*plVar12 + 8) * 0x517cc1b727220a95;
      lVar2 = *plVar7;
      uVar3 = plVar7[1];
      bVar8 = (byte)(uVar9 >> 0x39);
      uVar9 = uVar9 & uVar3;
      uVar16 = *(undefined8 *)(lVar2 + uVar9);
      uVar1 = CONCAT17(-((byte)((ulong)uVar16 >> 0x38) == bVar8),
                       CONCAT16(-((byte)((ulong)uVar16 >> 0x30) == bVar8),
                                CONCAT15(-((byte)((ulong)uVar16 >> 0x28) == bVar8),
                                         CONCAT14(-((byte)((ulong)uVar16 >> 0x20) == bVar8),
                                                  CONCAT13(-((byte)((ulong)uVar16 >> 0x18) == bVar8)
                                                           ,CONCAT12(-((byte)((ulong)uVar16 >> 0x10)
                                                                      == bVar8),
                                                                     CONCAT11(-((byte)((ulong)uVar16
                                                                                      >> 8) == bVar8
                                                                               ),-((byte)uVar16 ==
                                                                                  bVar8)))))))) &
              0x8080808080808080;
      while( true ) {
        while (uVar1 == 0) {
          bVar15 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar16 >> 0x38) == -1),
                                       CONCAT16(-((char)((ulong)uVar16 >> 0x30) == -1),
                                                CONCAT15(-((char)((ulong)uVar16 >> 0x28) == -1),
                                                         CONCAT14(-((char)((ulong)uVar16 >> 0x20) ==
                                                                   -1),CONCAT13(-((char)((ulong)
                                                  uVar16 >> 0x18) == -1),
                                                  CONCAT12(-((char)((ulong)uVar16 >> 0x10) == -1),
                                                           CONCAT11(-((char)((ulong)uVar16 >> 8) ==
                                                                     -1),-((char)uVar16 == -1)))))))
                                      ),1);
          if ((bVar15 & 1) != 0) goto LAB_00590a74;
          lVar6 = lVar6 + 8;
          uVar9 = uVar9 + lVar6 & uVar3;
          uVar16 = *(undefined8 *)(lVar2 + uVar9);
          uVar1 = CONCAT17(-((byte)((ulong)uVar16 >> 0x38) == bVar8),
                           CONCAT16(-((byte)((ulong)uVar16 >> 0x30) == bVar8),
                                    CONCAT15(-((byte)((ulong)uVar16 >> 0x28) == bVar8),
                                             CONCAT14(-((byte)((ulong)uVar16 >> 0x20) == bVar8),
                                                      CONCAT13(-((byte)((ulong)uVar16 >> 0x18) ==
                                                                bVar8),CONCAT12(-((byte)((ulong)
                                                  uVar16 >> 0x10) == bVar8),
                                                  CONCAT11(-((byte)((ulong)uVar16 >> 8) == bVar8),
                                                           -((byte)uVar16 == bVar8)))))))) &
                  0x8080808080808080;
        }
        uVar10 = (uVar1 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar1 >> 7 & 0xff00ff00ff00ff) << 8;
        uVar10 = (uVar10 & 0xffff0000ffff0000) >> 0x10 | (uVar10 & 0xffff0000ffff) << 0x10;
        uVar10 = uVar9 + ((ulong)LZCOUNT(uVar10 >> 0x20 | uVar10 << 0x20) >> 3) & uVar3;
        if (*plVar12 == *(long *)(lVar2 + -0x10 + uVar10 * -0x10)) break;
        uVar1 = uVar1 - 1 & uVar1;
      }
      puVar11 = param_4;
      if ((*(long *)(lVar2 + uVar10 * -0x10 + -8) == 1) &&
         (lVar6 = func_0x0057851c(*param_5,plVar12), lVar6 != 1)) {
        plVar12 = (long *)*plVar12;
        lVar6 = *plVar12;
        *plVar12 = lVar6 + 1;
        if (lVar6 < 0) {
          func_0x007a05dc();
          goto code_r0x00590a8c;
        }
        puVar11 = param_4 + 1;
        *param_4 = plVar12;
        puVar13 = *(undefined8 **)(lVar5 + 0x18);
        puVar14 = *(undefined8 **)(lVar5 + 8);
      }
      param_4 = puVar11;
      puVar11 = puVar14;
    } while (puVar14 != puVar13);
  }
  return auVar17._8_8_;
}

