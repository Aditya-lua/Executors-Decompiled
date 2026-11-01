
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_0058e67c(long *param_1,ulong param_2,long *param_3)

{
  long lVar1;
  code *pcVar2;
  long *plVar3;
  ulong uVar4;
  ulong uVar5;
  ulong uVar6;
  long *plVar7;
  long *plVar8;
  ulong unaff_x21;
  ulong unaff_x22;
  long *unaff_x23;
  ulong uVar9;
  long *unaff_x24;
  ulong uVar10;
  undefined8 *puVar11;
  ulong unaff_x28;
  byte bVar12;
  byte bVar13;
  long lVar14;
  long lVar15;
  undefined8 uVar16;
  long lVar17;
  char cVar18;
  char cVar19;
  char cVar20;
  char cVar21;
  char cVar22;
  char cVar23;
  char cVar24;
  char cVar25;
  undefined8 unaff_d8;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  long *in_stack_00000018;
  long *in_stack_00000020;
  undefined8 uStack0000000000000060;
  ulong in_stack_00000068;
  long in_stack_00000078;
  undefined8 uStack0000000000000080;
  long in_stack_00000088;
  long in_stack_00000098;
  undefined8 uStack0000000000000160;
  long in_stack_00000168;
  long *in_stack_00000170;
  long *in_stack_00000178;
  ulong in_stack_00000180;
  long *in_stack_00000188;
  long in_stack_00000190;
  long in_stack_00000198;
  
  do {
    func_0x007ae680(param_1,param_2,param_3,1);
    param_3 = unaff_x24;
    do {
      lVar15 = _UNK_009ee250;
      lVar1 = _UNK_009ee248;
      lVar14 = _UNK_009ee238;
      uVar10 = unaff_x23[-0xd];
      in_stack_00000170 = (long *)unaff_x23[-0xe];
      in_stack_00000168 = unaff_x23[-0xf];
      uStack0000000000000160 = (long *)unaff_x23[-0x10];
      unaff_x23[-0xf] = _UNK_009ee240;
      unaff_x23[-0x10] = lVar14;
      unaff_x23[-0xd] = lVar15;
      unaff_x23[-0xe] = lVar1;
      in_stack_00000178 = (long *)uVar10;
      if ((ulong)unaff_x23[-2] < uVar10) {
        func_0x007ae680(param_3,uVar10,unaff_x23,1);
      }
      lVar1 = in_stack_00000168;
      plVar7 = uStack0000000000000160 + 1;
      lVar14 = *uStack0000000000000160;
      uVar9 = CONCAT17(-(-1 < lVar14),
                       CONCAT16(-(-1 < (char)((ulong)lVar14 >> 0x30)),
                                CONCAT15(-(-1 < (char)((ulong)lVar14 >> 0x28)),
                                         CONCAT14(-(-1 < (char)((ulong)lVar14 >> 0x20)),
                                                  CONCAT13(-(-1 < (char)((ulong)lVar14 >> 0x18)),
                                                           CONCAT12(-(-1 < (char)((ulong)lVar14 >>
                                                                                 0x10)),
                                                                    CONCAT11(-(-1 < (char)((ulong)
                                                  lVar14 >> 8)),-(-1 < (char)lVar14)))))))) &
              0x8080808080808080;
      lVar14 = in_stack_00000168 * 9 + 0x11;
      plVar3 = uStack0000000000000160 + (-1 - in_stack_00000168);
      plVar8 = uStack0000000000000160;
      while( true ) {
        cVar18 = (char)unaff_d8;
        cVar19 = (char)((ulong)unaff_d8 >> 8);
        cVar20 = (char)((ulong)unaff_d8 >> 0x10);
        cVar21 = (char)((ulong)unaff_d8 >> 0x18);
        cVar22 = (char)((ulong)unaff_d8 >> 0x20);
        cVar23 = (char)((ulong)unaff_d8 >> 0x28);
        cVar24 = (char)((ulong)unaff_d8 >> 0x30);
        cVar25 = (char)((ulong)unaff_d8 >> 0x38);
        if (uVar10 == 0) break;
        while (uVar9 == 0) {
          lVar15 = *plVar7;
          plVar8 = plVar8 + -8;
          plVar7 = plVar7 + 1;
          uVar9 = CONCAT17(-(-1 < lVar15),
                           CONCAT16(-(-1 < (char)((ulong)lVar15 >> 0x30)),
                                    CONCAT15(-(-1 < (char)((ulong)lVar15 >> 0x28)),
                                             CONCAT14(-(-1 < (char)((ulong)lVar15 >> 0x20)),
                                                      CONCAT13(-(-1 < (char)((ulong)lVar15 >> 0x18))
                                                               ,CONCAT12(-(-1 < (char)((ulong)lVar15
                                                                                      >> 0x10)),
                                                                         CONCAT11(-(-1 < (char)((
                                                  ulong)lVar15 >> 8)),-(-1 < (char)lVar15)))))))) &
                  0x8080808080808080;
        }
        if (in_stack_00000078 == 0) {
code_r0x0058e6a0:
          func_0x007a23bc(&UNK_009f1020);
          goto code_r0x0058e75c;
        }
        lVar15 = 0;
        uVar6 = (uVar9 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar9 >> 7 & 0xff00ff00ff00ff) << 8;
        uVar6 = (uVar6 & 0xffff0000ffff0000) >> 0x10 | (uVar6 & 0xffff0000ffff) << 0x10;
        uVar9 = uVar9 - 1 & uVar9;
        uVar10 = uVar10 - 1;
        puVar11 = *(undefined8 **)
                   ((long)plVar8 + (-8 - (LZCOUNT(uVar6 >> 0x20 | uVar6 << 0x20) & 0x78U)));
        uVar4 = unaff_x28 & in_stack_00000068;
        uVar16 = *(undefined8 *)((long)uStack0000000000000060 + uVar4);
        uVar6 = CONCAT17(-((char)((ulong)uVar16 >> 0x38) == cVar25),
                         CONCAT16(-((char)((ulong)uVar16 >> 0x30) == cVar24),
                                  CONCAT15(-((char)((ulong)uVar16 >> 0x28) == cVar23),
                                           CONCAT14(-((char)((ulong)uVar16 >> 0x20) == cVar22),
                                                    CONCAT13(-((char)((ulong)uVar16 >> 0x18) ==
                                                              cVar21),CONCAT12(-((char)((ulong)
                                                  uVar16 >> 0x10) == cVar20),
                                                  CONCAT11(-((char)((ulong)uVar16 >> 8) == cVar19),
                                                           -((char)uVar16 == cVar18)))))))) &
                0x8080808080808080;
        while( true ) {
          while (uVar6 == 0) {
            bVar13 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar16 >> 0x38) == -1),
                                         CONCAT16(-((char)((ulong)uVar16 >> 0x30) == -1),
                                                  CONCAT15(-((char)((ulong)uVar16 >> 0x28) == -1),
                                                           CONCAT14(-((char)((ulong)uVar16 >> 0x20)
                                                                     == -1),CONCAT13(-((char)((ulong
                                                  )uVar16 >> 0x18) == -1),
                                                  CONCAT12(-((char)((ulong)uVar16 >> 0x10) == -1),
                                                           CONCAT11(-((char)((ulong)uVar16 >> 8) ==
                                                                     -1),-((char)uVar16 == -1)))))))
                                        ),1);
            if ((bVar13 & 1) != 0) goto code_r0x0058e6a0;
            lVar15 = lVar15 + 8;
            uVar4 = uVar4 + lVar15 & in_stack_00000068;
            uVar16 = *(undefined8 *)((long)uStack0000000000000060 + uVar4);
            uVar6 = CONCAT17(-((char)((ulong)uVar16 >> 0x38) == cVar25),
                             CONCAT16(-((char)((ulong)uVar16 >> 0x30) == cVar24),
                                      CONCAT15(-((char)((ulong)uVar16 >> 0x28) == cVar23),
                                               CONCAT14(-((char)((ulong)uVar16 >> 0x20) == cVar22),
                                                        CONCAT13(-((char)((ulong)uVar16 >> 0x18) ==
                                                                  cVar21),CONCAT12(-((char)((ulong)
                                                  uVar16 >> 0x10) == cVar20),
                                                  CONCAT11(-((char)((ulong)uVar16 >> 8) == cVar19),
                                                           -((char)uVar16 == cVar18)))))))) &
                    0x8080808080808080;
          }
          uVar5 = (uVar6 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar6 >> 7 & 0xff00ff00ff00ff) << 8;
          uVar5 = (uVar5 & 0xffff0000ffff0000) >> 0x10 | (uVar5 & 0xffff0000ffff) << 0x10;
          uVar5 = uVar4 + ((ulong)LZCOUNT(uVar5 >> 0x20 | uVar5 << 0x20) >> 3) & in_stack_00000068;
          if ((int)uStack0000000000000060[uVar5 * -0x19 + -0x19] == (int)unaff_x22) break;
          uVar6 = uVar6 - 1 & uVar6;
        }
        lVar15 = *(long *)*puVar11;
        *(long *)*puVar11 = lVar15 + 1;
        if (lVar15 < 0) {
          func_0x007a05dc();
          goto code_r0x0058e75c;
        }
        func_0x00563744(uStack0000000000000060 + uVar5 * -0x19 + -4,*puVar11);
        func_0x0058d248(&uStack0000000000000060,in_stack_00000008,unaff_x22,puVar11);
      }
      if ((lVar1 != 0) && (lVar14 != 0)) {
        func_0x00187bd4(plVar3,lVar14,8);
      }
      if (in_stack_00000078 == 0) {
code_r0x0058e738:
        func_0x007a23bc(&UNK_009f1008);
code_r0x0058e75c:
                    /* WARNING: Does not return */
        pcVar2 = (code *)SoftwareBreakpoint(1,0x58e760);
        (*pcVar2)();
      }
      lVar14 = 0;
      uVar9 = unaff_x28 & in_stack_00000068;
      uVar16 = *(undefined8 *)((long)uStack0000000000000060 + uVar9);
      uVar10 = CONCAT17(-((char)((ulong)uVar16 >> 0x38) == cVar25),
                        CONCAT16(-((char)((ulong)uVar16 >> 0x30) == cVar24),
                                 CONCAT15(-((char)((ulong)uVar16 >> 0x28) == cVar23),
                                          CONCAT14(-((char)((ulong)uVar16 >> 0x20) == cVar22),
                                                   CONCAT13(-((char)((ulong)uVar16 >> 0x18) ==
                                                             cVar21),CONCAT12(-((char)((ulong)uVar16
                                                                                      >> 0x10) ==
                                                                               cVar20),CONCAT11(-((
                                                  char)((ulong)uVar16 >> 8) == cVar19),
                                                  -((char)uVar16 == cVar18)))))))) &
               0x8080808080808080;
      while( true ) {
        while (uVar10 == 0) {
          bVar13 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar16 >> 0x38) == -1),
                                       CONCAT16(-((char)((ulong)uVar16 >> 0x30) == -1),
                                                CONCAT15(-((char)((ulong)uVar16 >> 0x28) == -1),
                                                         CONCAT14(-((char)((ulong)uVar16 >> 0x20) ==
                                                                   -1),CONCAT13(-((char)((ulong)
                                                  uVar16 >> 0x18) == -1),
                                                  CONCAT12(-((char)((ulong)uVar16 >> 0x10) == -1),
                                                           CONCAT11(-((char)((ulong)uVar16 >> 8) ==
                                                                     -1),-((char)uVar16 == -1)))))))
                                      ),1);
          if ((bVar13 & 1) != 0) goto code_r0x0058e738;
          lVar14 = lVar14 + 8;
          uVar9 = uVar9 + lVar14 & in_stack_00000068;
          uVar16 = *(undefined8 *)((long)uStack0000000000000060 + uVar9);
          uVar10 = CONCAT17(-((char)((ulong)uVar16 >> 0x38) == cVar25),
                            CONCAT16(-((char)((ulong)uVar16 >> 0x30) == cVar24),
                                     CONCAT15(-((char)((ulong)uVar16 >> 0x28) == cVar23),
                                              CONCAT14(-((char)((ulong)uVar16 >> 0x20) == cVar22),
                                                       CONCAT13(-((char)((ulong)uVar16 >> 0x18) ==
                                                                 cVar21),CONCAT12(-((char)((ulong)
                                                  uVar16 >> 0x10) == cVar20),
                                                  CONCAT11(-((char)((ulong)uVar16 >> 8) == cVar19),
                                                           -((char)uVar16 == cVar18)))))))) &
                   0x8080808080808080;
        }
        uVar6 = (uVar10 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar10 >> 7 & 0xff00ff00ff00ff) << 8;
        uVar6 = (uVar6 & 0xffff0000ffff0000) >> 0x10 | (uVar6 & 0xffff0000ffff) << 0x10;
        uVar6 = uVar9 + ((ulong)LZCOUNT(uVar6 >> 0x20 | uVar6 << 0x20) >> 3) & in_stack_00000068;
        if ((int)uStack0000000000000060[uVar6 * -0x19 + -0x19] == (int)unaff_x22) break;
        uVar10 = uVar10 - 1 & uVar10;
      }
      func_0x0053a0dc(&uStack0000000000000080,uStack0000000000000060 + uVar6 * -0x19 + -0x18);
      lVar1 = in_stack_00000088;
      plVar8 = uStack0000000000000080 + 1;
      lVar14 = *uStack0000000000000080;
      uVar10 = CONCAT17(-(-1 < lVar14),
                        CONCAT16(-(-1 < (char)((ulong)lVar14 >> 0x30)),
                                 CONCAT15(-(-1 < (char)((ulong)lVar14 >> 0x28)),
                                          CONCAT14(-(-1 < (char)((ulong)lVar14 >> 0x20)),
                                                   CONCAT13(-(-1 < (char)((ulong)lVar14 >> 0x18)),
                                                            CONCAT12(-(-1 < (char)((ulong)lVar14 >>
                                                                                  0x10)),
                                                                     CONCAT11(-(-1 < (char)((ulong)
                                                  lVar14 >> 8)),-(-1 < (char)lVar14)))))))) &
               0x8080808080808080;
      lVar14 = in_stack_00000088 * 9 + 0x11;
      plVar3 = uStack0000000000000080 + (-1 - in_stack_00000088);
      plVar7 = uStack0000000000000080;
      for (lVar15 = in_stack_00000098; lVar15 != 0; lVar15 = lVar15 + -1) {
        while (uVar10 == 0) {
          lVar17 = *plVar8;
          plVar7 = plVar7 + -8;
          plVar8 = plVar8 + 1;
          uVar10 = CONCAT17(-(-1 < lVar17),
                            CONCAT16(-(-1 < (char)((ulong)lVar17 >> 0x30)),
                                     CONCAT15(-(-1 < (char)((ulong)lVar17 >> 0x28)),
                                              CONCAT14(-(-1 < (char)((ulong)lVar17 >> 0x20)),
                                                       CONCAT13(-(-1 < (char)((ulong)lVar17 >> 0x18)
                                                                 ),CONCAT12(-(-1 < (char)((ulong)
                                                  lVar17 >> 0x10)),
                                                  CONCAT11(-(-1 < (char)((ulong)lVar17 >> 8)),
                                                           -(-1 < (char)lVar17)))))))) &
                   0x8080808080808080;
        }
        uVar9 = (uVar10 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar10 >> 7 & 0xff00ff00ff00ff) << 8;
        uVar9 = (uVar9 & 0xffff0000ffff0000) >> 0x10 | (uVar9 & 0xffff0000ffff) << 0x10;
        uVar10 = uVar10 - 1 & uVar10;
        func_0x0058d248(&uStack0000000000000060,in_stack_00000008,unaff_x22,
                        *(undefined8 *)
                         ((long)plVar7 + (-8 - (LZCOUNT(uVar9 >> 0x20 | uVar9 << 0x20) & 0x78U))));
      }
      if ((lVar1 != 0) && (lVar14 != 0)) {
        func_0x00187bd4(plVar3,lVar14,8);
      }
      do {
        unaff_x22 = unaff_x21;
        if (in_stack_00000020 == in_stack_00000018) {
          in_stack_00000190 = (long)uStack0000000000000060 + in_stack_00000068 + 1;
          in_stack_00000188 = uStack0000000000000060 + 1;
          lVar14 = *uStack0000000000000060;
          in_stack_00000180 =
               CONCAT17(-(-1 < lVar14),
                        CONCAT16(-(-1 < (char)((ulong)lVar14 >> 0x30)),
                                 CONCAT15(-(-1 < (char)((ulong)lVar14 >> 0x28)),
                                          CONCAT14(-(-1 < (char)((ulong)lVar14 >> 0x20)),
                                                   CONCAT13(-(-1 < (char)((ulong)lVar14 >> 0x18)),
                                                            CONCAT12(-(-1 < (char)((ulong)lVar14 >>
                                                                                  0x10)),
                                                                     CONCAT11(-(-1 < (char)((ulong)
                                                  lVar14 >> 8)),-(-1 < (char)lVar14)))))))) &
               0x8080808080808080;
          in_stack_00000168 = in_stack_00000068 * 0xc9 + 0xd1;
          in_stack_00000170 = uStack0000000000000060 + in_stack_00000068 * -0x19 + -0x19;
          in_stack_00000198 = in_stack_00000078;
          uStack0000000000000160 = (long *)((ulong)(in_stack_00000068 != 0) << 3);
          in_stack_00000178 = uStack0000000000000060;
          func_0x00574964(in_stack_00000000,&uStack0000000000000160);
          return;
        }
        plVar7 = in_stack_00000020 + 4;
        lVar14 = *in_stack_00000020;
        unaff_x21 = unaff_x22 + 1;
        in_stack_00000020 = plVar7;
      } while (lVar14 == -0x8000000000000000);
      if (in_stack_00000078 == 0) {
code_r0x0058e260:
        func_0x007a23bc(&UNK_009f0ff0);
        goto code_r0x0058e75c;
      }
      lVar14 = 0;
      unaff_x28 = (unaff_x22 & 0xffffffff) * 0x517cc1b727220a95;
      bVar13 = (byte)(unaff_x28 >> 0x39);
      unaff_d8 = CONCAT17(bVar13,CONCAT16(bVar13,CONCAT15(bVar13,CONCAT14(bVar13,CONCAT13(bVar13,
                                                  CONCAT12(bVar13,CONCAT11(bVar13,bVar13)))))));
      uVar9 = unaff_x28 & in_stack_00000068;
      uVar16 = *(undefined8 *)((long)uStack0000000000000060 + uVar9);
      uVar10 = CONCAT17(-((byte)((ulong)uVar16 >> 0x38) == bVar13),
                        CONCAT16(-((byte)((ulong)uVar16 >> 0x30) == bVar13),
                                 CONCAT15(-((byte)((ulong)uVar16 >> 0x28) == bVar13),
                                          CONCAT14(-((byte)((ulong)uVar16 >> 0x20) == bVar13),
                                                   CONCAT13(-((byte)((ulong)uVar16 >> 0x18) ==
                                                             bVar13),CONCAT12(-((byte)((ulong)uVar16
                                                                                      >> 0x10) ==
                                                                               bVar13),CONCAT11(-((
                                                  byte)((ulong)uVar16 >> 8) == bVar13),
                                                  -((byte)uVar16 == bVar13)))))))) &
               0x8080808080808080;
      while( true ) {
        while (uVar10 == 0) {
          bVar12 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar16 >> 0x38) == -1),
                                       CONCAT16(-((char)((ulong)uVar16 >> 0x30) == -1),
                                                CONCAT15(-((char)((ulong)uVar16 >> 0x28) == -1),
                                                         CONCAT14(-((char)((ulong)uVar16 >> 0x20) ==
                                                                   -1),CONCAT13(-((char)((ulong)
                                                  uVar16 >> 0x18) == -1),
                                                  CONCAT12(-((char)((ulong)uVar16 >> 0x10) == -1),
                                                           CONCAT11(-((char)((ulong)uVar16 >> 8) ==
                                                                     -1),-((char)uVar16 == -1)))))))
                                      ),1);
          if ((bVar12 & 1) != 0) goto code_r0x0058e260;
          lVar14 = lVar14 + 8;
          uVar9 = uVar9 + lVar14 & in_stack_00000068;
          uVar16 = *(undefined8 *)((long)uStack0000000000000060 + uVar9);
          uVar10 = CONCAT17(-((byte)((ulong)uVar16 >> 0x38) == bVar13),
                            CONCAT16(-((byte)((ulong)uVar16 >> 0x30) == bVar13),
                                     CONCAT15(-((byte)((ulong)uVar16 >> 0x28) == bVar13),
                                              CONCAT14(-((byte)((ulong)uVar16 >> 0x20) == bVar13),
                                                       CONCAT13(-((byte)((ulong)uVar16 >> 0x18) ==
                                                                 bVar13),CONCAT12(-((byte)((ulong)
                                                  uVar16 >> 0x10) == bVar13),
                                                  CONCAT11(-((byte)((ulong)uVar16 >> 8) == bVar13),
                                                           -((byte)uVar16 == bVar13)))))))) &
                   0x8080808080808080;
        }
        uVar6 = (uVar10 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar10 >> 7 & 0xff00ff00ff00ff) << 8;
        uVar6 = (uVar6 & 0xffff0000ffff0000) >> 0x10 | (uVar6 & 0xffff0000ffff) << 0x10;
        uVar6 = uVar9 + ((ulong)LZCOUNT(uVar6 >> 0x20 | uVar6 << 0x20) >> 3) & in_stack_00000068;
        if ((int)uStack0000000000000060[uVar6 * -0x19 + -0x19] == (int)unaff_x22) break;
        uVar10 = uVar10 - 1 & uVar10;
      }
      unaff_x23 = uStack0000000000000060 + uVar6 * -0x19;
      lVar14 = 0;
      if ((ulong)unaff_x23[-0x11] <= (ulong)unaff_x23[-0x15]) {
        lVar14 = unaff_x23[-0x15] - unaff_x23[-0x11];
      }
      param_3 = unaff_x23 + -4;
      param_2 = lVar14 + unaff_x23[-9];
    } while (param_2 <= (ulong)unaff_x23[-6]);
    param_1 = unaff_x23 + -8;
    unaff_x24 = param_3;
  } while( true );
}

