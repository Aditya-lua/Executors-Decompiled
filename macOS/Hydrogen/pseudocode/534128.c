
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined1  [16] FUN_00534128(void)

{
  ulong uVar1;
  code *pcVar2;
  int iVar3;
  int *piVar4;
  long lVar5;
  ulong uVar6;
  undefined8 *puVar7;
  undefined8 extraout_x8;
  long lVar8;
  undefined8 extraout_x8_00;
  undefined8 extraout_x9;
  byte bVar9;
  ulong uVar10;
  long *plVar11;
  ulong uVar12;
  int iVar13;
  long unaff_x29;
  byte bVar14;
  byte bVar15;
  byte bVar17;
  byte bVar18;
  byte bVar19;
  byte bVar20;
  byte bVar21;
  undefined8 uVar16;
  byte bVar22;
  double dVar23;
  undefined1 auVar24 [16];
  long in_stack_00000000;
  long in_stack_00000008;
  ulong in_stack_00000010;
  long in_stack_00000018;
  long in_stack_00000020;
  ulong in_stack_00000028;
  undefined8 uStack0000000000000030;
  ulong in_stack_00000038;
  long in_stack_00000040;
  long in_stack_00000048;
  undefined8 uStack0000000000000050;
  undefined8 in_stack_00000058;
  undefined8 uStack0000000000000068;
  long in_stack_00000070;
  long in_stack_00000078;
  long in_stack_00000080;
  undefined8 in_stack_00000088;
  undefined8 in_stack_00000090;
  undefined8 in_stack_00000098;
  undefined8 in_stack_000000a0;
  
  if ((in_stack_00000010 == in_stack_00000028) &&
     (iVar3 = _memcmp(in_stack_00000008,in_stack_00000020,in_stack_00000010), iVar3 == 0)) {
    dVar23 = 1.0;
  }
  else {
    pcVar2 = 
    ___ZN3std4hash6random11RandomState3new4KEYS29__u7b__u7b_constant_u7d__u7d_28__u7b__u7b_closure_u7d__u7d_3VAL17h3498d7596e36c0fdE
    ;
    dVar23 = 0.0;
    if ((1 < in_stack_00000010) && (1 < in_stack_00000028)) {
      piVar4 = (int *)(*
                      ___ZN3std4hash6random11RandomState3new4KEYS29__u7b__u7b_constant_u7d__u7d_28__u7b__u7b_closure_u7d__u7d_3VAL17h3498d7596e36c0fdE
                      )(&
                        __ZN3std4hash6random11RandomState3new4KEYS29__u7b__u7b_constant_u7d__u7d_28__u7b__u7b_closure_u7d__u7d_3VAL17h3498d7596e36c0fdE
                       );
      if (*piVar4 == 1) {
        lVar5 = (*pcVar2)(&
                          __ZN3std4hash6random11RandomState3new4KEYS29__u7b__u7b_constant_u7d__u7d_28__u7b__u7b_closure_u7d__u7d_3VAL17h3498d7596e36c0fdE
                         );
        uVar16 = *(undefined8 *)(lVar5 + 0x10);
      }
      else {
        uVar16 = func_0x0042b2b8();
        auVar24 = (*pcVar2)(uVar16,&
                                   __ZN3std4hash6random11RandomState3new4KEYS29__u7b__u7b_constant_u7d__u7d_28__u7b__u7b_closure_u7d__u7d_3VAL17h3498d7596e36c0fdE
                           );
        uVar16 = auVar24._8_8_;
        puVar7 = auVar24._0_8_;
        *puVar7 = 1;
        puVar7[1] = extraout_x8_00;
        puVar7[2] = uVar16;
      }
      auVar24 = (*pcVar2)(&
                          __ZN3std4hash6random11RandomState3new4KEYS29__u7b__u7b_constant_u7d__u7d_28__u7b__u7b_closure_u7d__u7d_3VAL17h3498d7596e36c0fdE
                          ,uVar16);
      in_stack_00000058 = auVar24._8_8_;
      *(undefined8 *)(auVar24._0_8_ + 8) = extraout_x9;
      in_stack_00000038 = _UNK_009ebaa0;
      uStack0000000000000030 = _UNK_009eba98;
      in_stack_00000048 = _UNK_009ebab0;
      in_stack_00000040 = _UNK_009ebaa8;
      in_stack_00000070 = in_stack_00000008 + in_stack_00000010;
      in_stack_00000098 = 0;
      in_stack_000000a0 = 0;
      uStack0000000000000068 = in_stack_00000008;
      in_stack_00000078 = in_stack_00000008;
      in_stack_00000088 = 1;
      in_stack_00000090 = 0;
      uStack0000000000000050 = extraout_x8;
      in_stack_00000080 = in_stack_00000070;
      auVar24 = func_0x00531638(&uStack0000000000000068);
      iVar3 = auVar24._0_4_;
      while (iVar3 != 0x110000) {
        iVar3 = auVar24._0_4_;
        iVar13 = auVar24._8_4_;
        *(int *)(unaff_x29 + -0x58) = iVar3;
        *(int *)(unaff_x29 + -0x54) = iVar13;
        uVar6 = func_0x0053467c(&uStack0000000000000050,unaff_x29 + -0x58);
        lVar5 = 0;
        bVar9 = (byte)(uVar6 >> 0x38);
        bVar15 = bVar9 >> 1;
        uVar10 = uVar6;
        while( true ) {
          uVar10 = uVar10 & in_stack_00000038;
          uVar16 = *(undefined8 *)((long)uStack0000000000000030 + uVar10);
          bVar14 = (byte)((ulong)uVar16 >> 8);
          bVar17 = (byte)((ulong)uVar16 >> 0x10);
          bVar18 = (byte)((ulong)uVar16 >> 0x18);
          bVar19 = (byte)((ulong)uVar16 >> 0x20);
          bVar20 = (byte)((ulong)uVar16 >> 0x28);
          bVar21 = (byte)((ulong)uVar16 >> 0x30);
          bVar22 = (byte)((ulong)uVar16 >> 0x38);
          for (uVar12 = CONCAT17(-(bVar22 == bVar15),
                                 CONCAT16(-(bVar21 == bVar15),
                                          CONCAT15(-(bVar20 == bVar15),
                                                   CONCAT14(-(bVar19 == bVar15),
                                                            CONCAT13(-(bVar18 == bVar15),
                                                                     CONCAT12(-(bVar17 == bVar15),
                                                                              CONCAT11(-(bVar14 ==
                                                                                        bVar15),-((
                                                  byte)uVar16 == bVar15)))))))) & 0x8080808080808080
              ; uVar12 != 0; uVar12 = uVar12 - 1 & uVar12) {
            uVar1 = (uVar12 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar12 >> 7 & 0xff00ff00ff00ff) << 8;
            uVar1 = (uVar1 & 0xffff0000ffff0000) >> 0x10 | (uVar1 & 0xffff0000ffff) << 0x10;
            plVar11 = uStack0000000000000030 +
                      (uVar10 + ((ulong)LZCOUNT(uVar1 >> 0x20 | uVar1 << 0x20) >> 3) &
                      in_stack_00000038) * -2;
            if ((int)plVar11[-2] == iVar3 && *(int *)((long)plVar11 + -0xc) == iVar13)
            goto code_r0x005342c0;
          }
          bVar14 = NEON_umaxv(CONCAT17(-(bVar22 == 0xff),
                                       CONCAT16(-(bVar21 == 0xff),
                                                CONCAT15(-(bVar20 == 0xff),
                                                         CONCAT14(-(bVar19 == 0xff),
                                                                  CONCAT13(-(bVar18 == 0xff),
                                                                           CONCAT12(-(bVar17 == 0xff
                                                                                     ),CONCAT11(-(
                                                  bVar14 == 0xff),-((byte)uVar16 == 0xff)))))))),1);
          if ((bVar14 & 1) != 0) break;
          lVar5 = lVar5 + 8;
          uVar10 = uVar10 + lVar5;
        }
        if (in_stack_00000040 == 0) {
          func_0x007a5690(&uStack0000000000000030,1,&uStack0000000000000050,1);
          iVar3 = *(int *)(unaff_x29 + -0x58);
          iVar13 = *(int *)(unaff_x29 + -0x54);
          uVar6 = in_stack_00000038 & uVar6;
          lVar5 = *(long *)((long)uStack0000000000000030 + uVar6);
          uVar10 = CONCAT17(-(lVar5 < 0),
                            CONCAT16(-((char)((ulong)lVar5 >> 0x30) < '\0'),
                                     CONCAT15(-((char)((ulong)lVar5 >> 0x28) < '\0'),
                                              CONCAT14(-((char)((ulong)lVar5 >> 0x20) < '\0'),
                                                       CONCAT13(-((char)((ulong)lVar5 >> 0x18) <
                                                                 '\0'),CONCAT12(-((char)((ulong)
                                                  lVar5 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar5 >> 8) < '\0'),
                                                           -((char)lVar5 < '\0'))))))));
        }
        else {
          uVar6 = in_stack_00000038 & uVar6;
          lVar5 = *(long *)((long)uStack0000000000000030 + uVar6);
          uVar10 = CONCAT17(-(lVar5 < 0),
                            CONCAT16(-((char)((ulong)lVar5 >> 0x30) < '\0'),
                                     CONCAT15(-((char)((ulong)lVar5 >> 0x28) < '\0'),
                                              CONCAT14(-((char)((ulong)lVar5 >> 0x20) < '\0'),
                                                       CONCAT13(-((char)((ulong)lVar5 >> 0x18) <
                                                                 '\0'),CONCAT12(-((char)((ulong)
                                                  lVar5 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar5 >> 8) < '\0'),
                                                           -((char)lVar5 < '\0'))))))));
        }
        if (uVar10 == 0) {
          lVar5 = 8;
          do {
            uVar6 = uVar6 + lVar5 & in_stack_00000038;
            lVar8 = *(long *)((long)uStack0000000000000030 + uVar6);
            uVar10 = CONCAT17(-(lVar8 < 0),
                              CONCAT16(-((char)((ulong)lVar8 >> 0x30) < '\0'),
                                       CONCAT15(-((char)((ulong)lVar8 >> 0x28) < '\0'),
                                                CONCAT14(-((char)((ulong)lVar8 >> 0x20) < '\0'),
                                                         CONCAT13(-((char)((ulong)lVar8 >> 0x18) <
                                                                   '\0'),CONCAT12(-((char)((ulong)
                                                  lVar8 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar8 >> 8) < '\0'),
                                                           -((char)lVar8 < '\0'))))))));
            lVar5 = lVar5 + 8;
          } while (uVar10 == 0);
        }
        uVar10 = (uVar10 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar10 & 0x5555555555555555) << 1;
        uVar10 = (uVar10 & 0xcccccccccccccccc) >> 2 | (uVar10 & 0x3333333333333333) << 2;
        uVar10 = (uVar10 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar10 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar10 = (uVar10 & 0xff00ff00ff00ff00) >> 8 | (uVar10 & 0xff00ff00ff00ff) << 8;
        uVar10 = (uVar10 & 0xffff0000ffff0000) >> 0x10 | (uVar10 & 0xffff0000ffff) << 0x10;
        uVar6 = uVar6 + ((ulong)LZCOUNT(uVar10 >> 0x20 | uVar10 << 0x20) >> 3) & in_stack_00000038;
        uVar10 = (ulong)*(char *)((long)uStack0000000000000030 + uVar6);
        if (-1 < *(char *)((long)uStack0000000000000030 + uVar6)) {
          lVar5 = *uStack0000000000000030;
          uVar10 = CONCAT17(-(lVar5 < 0),
                            CONCAT16(-((char)((ulong)lVar5 >> 0x30) < '\0'),
                                     CONCAT15(-((char)((ulong)lVar5 >> 0x28) < '\0'),
                                              CONCAT14(-((char)((ulong)lVar5 >> 0x20) < '\0'),
                                                       CONCAT13(-((char)((ulong)lVar5 >> 0x18) <
                                                                 '\0'),CONCAT12(-((char)((ulong)
                                                  lVar5 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar5 >> 8) < '\0'),
                                                           -((char)lVar5 < '\0'))))))));
          uVar10 = (uVar10 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar10 & 0x5555555555555555) << 1;
          uVar10 = (uVar10 & 0xcccccccccccccccc) >> 2 | (uVar10 & 0x3333333333333333) << 2;
          uVar10 = (uVar10 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar10 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar10 = (uVar10 & 0xff00ff00ff00ff00) >> 8 | (uVar10 & 0xff00ff00ff00ff) << 8;
          uVar10 = (uVar10 & 0xffff0000ffff0000) >> 0x10 | (uVar10 & 0xffff0000ffff) << 0x10;
          uVar6 = (ulong)LZCOUNT(uVar10 >> 0x20 | uVar10 << 0x20) >> 3;
          uVar10 = (ulong)*(byte *)((long)uStack0000000000000030 + uVar6);
        }
        *(byte *)((long)uStack0000000000000030 + uVar6) = bVar9 >> 1;
        *(byte *)((long)uStack0000000000000030 + (uVar6 - 8 & in_stack_00000038) + 8) = bVar9 >> 1;
        plVar11 = uStack0000000000000030 + uVar6 * -2;
        in_stack_00000040 = in_stack_00000040 - (uVar10 & 1);
        *(int *)(plVar11 + -2) = iVar3;
        *(int *)((long)plVar11 + -0xc) = iVar13;
        plVar11[-1] = 0;
        in_stack_00000048 = in_stack_00000048 + 1;
code_r0x005342c0:
        plVar11[-1] = plVar11[-1] + 1;
        auVar24 = func_0x00531638(&uStack0000000000000068);
        iVar3 = auVar24._0_4_;
      }
      in_stack_00000070 = in_stack_00000020 + in_stack_00000028;
      in_stack_00000098 = 0;
      in_stack_000000a0 = 0;
      in_stack_00000088 = 1;
      in_stack_00000090 = 0;
      uStack0000000000000068 = in_stack_00000020;
      in_stack_00000078 = in_stack_00000020;
      in_stack_00000080 = in_stack_00000070;
      auVar24 = func_0x00531638(&uStack0000000000000068);
      dVar23 = 0.0;
      if (auVar24._0_4_ != 0x110000) {
        lVar5 = 0;
        do {
          *(int *)(unaff_x29 + -0x58) = auVar24._0_4_;
          *(int *)(unaff_x29 + -0x54) = auVar24._8_4_;
          uVar10 = func_0x0053467c(&uStack0000000000000050,unaff_x29 + -0x58);
          lVar8 = 0;
          bVar9 = (byte)(uVar10 >> 0x39);
          while( true ) {
            uVar10 = uVar10 & in_stack_00000038;
            uVar16 = *(undefined8 *)((long)uStack0000000000000030 + uVar10);
            bVar15 = (byte)((ulong)uVar16 >> 8);
            bVar14 = (byte)((ulong)uVar16 >> 0x10);
            bVar17 = (byte)((ulong)uVar16 >> 0x18);
            bVar18 = (byte)((ulong)uVar16 >> 0x20);
            bVar19 = (byte)((ulong)uVar16 >> 0x28);
            bVar20 = (byte)((ulong)uVar16 >> 0x30);
            bVar21 = (byte)((ulong)uVar16 >> 0x38);
            for (uVar6 = CONCAT17(-(bVar21 == bVar9),
                                  CONCAT16(-(bVar20 == bVar9),
                                           CONCAT15(-(bVar19 == bVar9),
                                                    CONCAT14(-(bVar18 == bVar9),
                                                             CONCAT13(-(bVar17 == bVar9),
                                                                      CONCAT12(-(bVar14 == bVar9),
                                                                               CONCAT11(-(bVar15 ==
                                                                                         bVar9),-((
                                                  byte)uVar16 == bVar9)))))))) & 0x8080808080808080;
                uVar6 != 0; uVar6 = uVar6 - 1 & uVar6) {
              uVar12 = (uVar6 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar6 >> 7 & 0xff00ff00ff00ff) << 8
              ;
              uVar12 = (uVar12 & 0xffff0000ffff0000) >> 0x10 | (uVar12 & 0xffff0000ffff) << 0x10;
              uVar12 = uVar10 + ((ulong)LZCOUNT(uVar12 >> 0x20 | uVar12 << 0x20) >> 3) &
                       in_stack_00000038;
              if ((int)uStack0000000000000030[uVar12 * -2 + -2] == auVar24._0_4_ &&
                  *(int *)((long)uStack0000000000000030 + uVar12 * -0x10 + -0xc) == auVar24._8_4_) {
                if (uStack0000000000000030[uVar12 * -2 + -1] != 0) {
                  uStack0000000000000030[uVar12 * -2 + -1] =
                       uStack0000000000000030[uVar12 * -2 + -1] + -1;
                  lVar5 = lVar5 + 1;
                }
                goto code_r0x0053449c;
              }
            }
            bVar15 = NEON_umaxv(CONCAT17(-(bVar21 == 0xff),
                                         CONCAT16(-(bVar20 == 0xff),
                                                  CONCAT15(-(bVar19 == 0xff),
                                                           CONCAT14(-(bVar18 == 0xff),
                                                                    CONCAT13(-(bVar17 == 0xff),
                                                                             CONCAT12(-(bVar14 ==
                                                                                       0xff),
                                                  CONCAT11(-(bVar15 == 0xff),-((byte)uVar16 == 0xff)
                                                          ))))))),1);
            if ((bVar15 & 1) != 0) break;
            lVar8 = lVar8 + 8;
            uVar10 = uVar10 + lVar8;
          }
          if (in_stack_00000040 == 0) {
            func_0x007a5690(&uStack0000000000000030,1,&uStack0000000000000050,1);
          }
code_r0x0053449c:
          auVar24 = func_0x00531638(&uStack0000000000000068);
        } while (auVar24._0_4_ != 0x110000);
        dVar23 = (double)(ulong)(lVar5 << 1);
      }
      if ((in_stack_00000038 != 0) && (lVar5 = in_stack_00000038 * 0x11 + 0x19, lVar5 != 0)) {
        func_0x00187bd4(uStack0000000000000030 + in_stack_00000038 * -2 + -2,lVar5,8);
      }
      dVar23 = dVar23 / (double)((in_stack_00000028 + in_stack_00000010) - 2);
    }
  }
  if (in_stack_00000018 != 0) {
    func_0x00187bd4(in_stack_00000020,in_stack_00000018,1);
  }
  if (in_stack_00000000 != 0) {
    func_0x00187bd4(in_stack_00000008,in_stack_00000000,1);
  }
  auVar24._8_8_ = 0;
  auVar24._0_8_ = dVar23;
  return auVar24;
}

