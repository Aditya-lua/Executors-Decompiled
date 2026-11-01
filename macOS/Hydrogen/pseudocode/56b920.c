
void FUN_0056b920(long param_1,undefined8 param_2,undefined8 param_3,ulong param_4)

{
  ulong uVar1;
  int iVar2;
  code *pcVar3;
  long *in_x9;
  ulong in_x10;
  long in_x11;
  long in_x12;
  long in_x13;
  long in_x14;
  long *in_x15;
  long in_x16;
  long in_x17;
  long *unaff_x19;
  long lVar4;
  undefined8 *unaff_x20;
  long lVar5;
  long unaff_x21;
  long *plVar6;
  long unaff_x22;
  long *plVar7;
  ulong unaff_x23;
  ulong uVar8;
  long lVar9;
  byte bVar10;
  char cVar12;
  char cVar13;
  char cVar14;
  char cVar15;
  char cVar16;
  char cVar17;
  undefined8 uVar11;
  char cVar18;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 uStack0000000000000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000058;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000078;
  
LAB_0056b8a0:
  do {
    param_4 = param_4 & in_x10;
    uVar11 = *(undefined8 *)(in_x11 + param_4);
    cVar12 = (char)((ulong)uVar11 >> 8);
    cVar13 = (char)((ulong)uVar11 >> 0x10);
    cVar14 = (char)((ulong)uVar11 >> 0x18);
    cVar15 = (char)((ulong)uVar11 >> 0x20);
    cVar16 = (char)((ulong)uVar11 >> 0x28);
    cVar17 = (char)((ulong)uVar11 >> 0x30);
    cVar18 = (char)((ulong)uVar11 >> 0x38);
    for (uVar8 = CONCAT17(-(cVar18 == (char)((ulong)param_3 >> 0x38)),
                          CONCAT16(-(cVar17 == (char)((ulong)param_3 >> 0x30)),
                                   CONCAT15(-(cVar16 == (char)((ulong)param_3 >> 0x28)),
                                            CONCAT14(-(cVar15 == (char)((ulong)param_3 >> 0x20)),
                                                     CONCAT13(-(cVar14 ==
                                                               (char)((ulong)param_3 >> 0x18)),
                                                              CONCAT12(-(cVar13 ==
                                                                        (char)((ulong)param_3 >>
                                                                              0x10)),
                                                                       CONCAT11(-(cVar12 ==
                                                                                 (char)((ulong)
                                                  param_3 >> 8)),-((char)uVar11 == (char)param_3))))
                                                  )))) & 0x8080808080808080; uVar8 != 0;
        uVar8 = uVar8 - 1 & uVar8) {
      uVar1 = (uVar8 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar8 >> 7 & 0xff00ff00ff00ff) << 8;
      uVar1 = (uVar1 & 0xffff0000ffff0000) >> 0x10 | (uVar1 & 0xffff0000ffff) << 0x10;
      if (in_x17 == *(long *)(in_x12 - (param_4 + ((ulong)LZCOUNT(uVar1 >> 0x20 | uVar1 << 0x20) >>
                                                  3) & in_x10) * in_x14)) {
        if (in_x15 != in_x9) {
          in_x16 = 0;
          in_x17 = *in_x15;
          param_4 = (in_x17 + 8) * in_x13;
          bVar10 = (byte)(param_4 >> 0x39);
          param_3 = CONCAT17(bVar10,CONCAT16(bVar10,CONCAT15(bVar10,CONCAT14(bVar10,CONCAT13(bVar10,
                                                  CONCAT12(bVar10,CONCAT11(bVar10,bVar10)))))));
          in_x15 = in_x15 + 9;
          goto LAB_0056b8a0;
        }
        if ((unaff_x23 < *(ulong *)(unaff_x21 + 0x28)) &&
           (plVar6 = (long *)(*(long *)(unaff_x21 + 0x20) + unaff_x23 * 0x20),
           *plVar6 != -0x8000000000000000)) {
          if (((((plVar6[2] != 1) || (lVar4 = plVar6[1], *(long *)(lVar4 + 0x18) != 0xf)) ||
               (*(long *)(lVar4 + 0x30) != 1)) || ((*(long *)(lVar4 + 0x48) != 1 || (param_1 != 1)))
              ) || ((**(long **)(lVar4 + 0x28) != -0x8000000000000000 || unaff_x19[3] != 1 ||
                    ((*(long *)(unaff_x22 + 8) != 0 ||
                     (*(long *)(unaff_x22 + 0x10) != (*(long **)(lVar4 + 0x28))[1]))))))
          goto code_r0x0056b9b8;
          func_0x00566040();
          lVar4 = func_0x005670a4();
          if (lVar4 != 0) {
            func_0x00566040(&uStack0000000000000040,lVar4 + 8);
            unaff_x20[1] = in_stack_00000008;
            *unaff_x20 = in_stack_00000000;
            unaff_x20[3] = in_stack_00000018;
            unaff_x20[2] = in_stack_00000010;
            unaff_x20[5] = in_stack_00000028;
            unaff_x20[4] = in_stack_00000020;
            unaff_x20[7] = in_stack_00000038;
            unaff_x20[6] = in_stack_00000030;
            unaff_x20[10] = in_stack_00000048;
            unaff_x20[9] = uStack0000000000000040;
            unaff_x20[0xc] = in_stack_00000058;
            unaff_x20[0xb] = in_stack_00000050;
            unaff_x20[0xe] = in_stack_00000068;
            unaff_x20[0xd] = in_stack_00000060;
            unaff_x20[0x10] = in_stack_00000078;
            unaff_x20[0xf] = in_stack_00000070;
            unaff_x20[8] = unaff_x22;
            goto DAT_0053a8e0;
          }
          func_0x007a23d8(&UNK_008abfe7,0x16,&UNK_009eec98);
        }
        else {
          func_0x007a23bc(&UNK_009eec80);
        }
                    /* WARNING: Does not return */
        pcVar3 = (code *)SoftwareBreakpoint(1,0x56ba68);
        (*pcVar3)();
      }
    }
    bVar10 = NEON_umaxv(CONCAT17(-(cVar18 == (char)((ulong)param_2 >> 0x38)),
                                 CONCAT16(-(cVar17 == (char)((ulong)param_2 >> 0x30)),
                                          CONCAT15(-(cVar16 == (char)((ulong)param_2 >> 0x28)),
                                                   CONCAT14(-(cVar15 ==
                                                             (char)((ulong)param_2 >> 0x20)),
                                                            CONCAT13(-(cVar14 ==
                                                                      (char)((ulong)param_2 >> 0x18)
                                                                      ),CONCAT12(-(cVar13 ==
                                                                                  (char)((ulong)
                                                  param_2 >> 0x10)),
                                                  CONCAT11(-(cVar12 == (char)((ulong)param_2 >> 8)),
                                                           -((char)uVar11 == (char)param_2)))))))),1
                       );
    if ((bVar10 & 1) != 0) {
code_r0x0056b9b8:
      *unaff_x20 = 0xc;
DAT_0053a8e0:
      lVar4 = unaff_x19[1];
      if (lVar4 != 0) {
        lVar5 = unaff_x19[3];
        if (lVar5 != 0) {
          plVar6 = (long *)*unaff_x19;
          plVar7 = plVar6 + 1;
          lVar9 = *plVar6;
          uVar8 = CONCAT17(-(-1 < lVar9),
                           CONCAT16(-(-1 < (char)((ulong)lVar9 >> 0x30)),
                                    CONCAT15(-(-1 < (char)((ulong)lVar9 >> 0x28)),
                                             CONCAT14(-(-1 < (char)((ulong)lVar9 >> 0x20)),
                                                      CONCAT13(-(-1 < (char)((ulong)lVar9 >> 0x18)),
                                                               CONCAT12(-(-1 < (char)((ulong)lVar9
                                                                                     >> 0x10)),
                                                                        CONCAT11(-(-1 < (char)((
                                                  ulong)lVar9 >> 8)),-(-1 < (char)lVar9)))))))) &
                  0x8080808080808080;
          do {
            while (uVar8 == 0) {
              lVar9 = *plVar7;
              plVar6 = plVar6 + -0x48;
              plVar7 = plVar7 + 1;
              uVar8 = CONCAT17(-(-1 < lVar9),
                               CONCAT16(-(-1 < (char)((ulong)lVar9 >> 0x30)),
                                        CONCAT15(-(-1 < (char)((ulong)lVar9 >> 0x28)),
                                                 CONCAT14(-(-1 < (char)((ulong)lVar9 >> 0x20)),
                                                          CONCAT13(-(-1 < (char)((ulong)lVar9 >>
                                                                                0x18)),
                                                                   CONCAT12(-(-1 < (char)((ulong)
                                                  lVar9 >> 0x10)),
                                                  CONCAT11(-(-1 < (char)((ulong)lVar9 >> 8)),
                                                           -(-1 < (char)lVar9)))))))) &
                      0x8080808080808080;
            }
            uVar1 = (uVar8 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar8 >> 7 & 0xff00ff00ff00ff) << 8;
            uVar1 = (uVar1 & 0xffff0000ffff0000) >> 0x10 | (uVar1 & 0xffff0000ffff) << 0x10;
            iVar2 = (int)((ulong)LZCOUNT(uVar1 >> 0x20 | uVar1 << 0x20) >> 3);
            lVar9 = *(long *)plVar6[(long)-iVar2 * 9 + -9];
            *(long *)plVar6[(long)-iVar2 * 9 + -9] = lVar9 + -1;
            LORelease();
            if (lVar9 == 1) {
              func_0x005d2ac4();
            }
            uVar8 = uVar8 - 1 & uVar8;
            lVar5 = lVar5 + -1;
            func_0x00539694(plVar6 + (long)-iVar2 * 9 + -8);
          } while (lVar5 != 0);
        }
        lVar5 = lVar4 * 0x49 + 0x51;
        if (lVar5 != 0) {
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          (*(code *)PTR__free_00a24e58)(*unaff_x19 + lVar4 * -0x48 + -0x48,lVar5,8);
          return;
        }
      }
      return;
    }
    in_x16 = in_x16 + 8;
    param_4 = param_4 + in_x16;
  } while( true );
}

