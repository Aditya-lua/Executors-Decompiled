
void FUN_00544480(void)

{
  long lVar1;
  long *plVar2;
  long *plVar3;
  code *pcVar4;
  long lVar5;
  qword qVar6;
  int iVar7;
  undefined8 uVar8;
  undefined8 *puVar9;
  qword *pqVar10;
  ulong uVar11;
  qword *pqVar12;
  undefined *puVar13;
  long lVar14;
  ulong uVar15;
  ulong uVar16;
  ulong uVar17;
  ulong uVar18;
  bool bVar19;
  long unaff_x21;
  ulong unaff_x22;
  long lVar20;
  long *plVar21;
  ulong uVar22;
  long lVar23;
  long *plVar24;
  ulong uVar25;
  ulong uVar26;
  ulong uVar27;
  undefined1 auVar28 [16];
  undefined8 uStack0000000000000018;
  long *in_stack_00000038;
  undefined1 uStack0000000000000040;
  long lStack_230;
  long lStack_228;
  long lStack_220;
  qword *pqStack_218;
  qword *pqStack_210;
  long lStack_208;
  undefined8 *puStack_200;
  undefined8 *puStack_1f8;
  undefined8 *puStack_1f0;
  undefined8 *puStack_1e8;
  long *plStack_1e0;
  qword *pqStack_1d8;
  qword *pqStack_1d0;
  qword *pqStack_1c8;
  qword *pqStack_1c0;
  qword *pqStack_1b8;
  long lStack_1b0;
  undefined8 uStack_1a8;
  undefined8 uStack_1a0;
  undefined8 uStack_198;
  long *plStack_c0;
  long *plStack_b8;
  long lStack_b0;
  undefined8 *puStack_a8;
  long lStack_a0;
  undefined8 *puStack_98;
  undefined8 *puStack_90;
  long lStack_88;
  undefined8 *puStack_80;
  long *plStack_78;
  long *aplStack_70 [2];
  
  uVar8 = func_0x007a2668();
  func_0x005845f4(&uStack0000000000000040);
  if ((unaff_x22 & 1) != 0) {
    lVar5 = *in_stack_00000038;
    *in_stack_00000038 = lVar5 + -1;
    LORelease();
    if (lVar5 == 1) {
      func_0x005d2ac4(unaff_x21 + 8);
    }
  }
  lVar5 = *uStack0000000000000018;
  *uStack0000000000000018 = lVar5 + -1;
  LORelease();
  if (lVar5 == 1) {
    func_0x005d2ac4(&uStack0000000000000018);
  }
  __Unwind_Resume(uVar8);
  func_0x007a2668();
  auVar28 = func_0x007a2668();
  lVar5 = auVar28._0_8_;
  lVar14 = *(long *)(lVar5 + 0xd8);
  uVar16 = *(ulong *)(lVar14 + 0x28);
  uVar25 = auVar28._8_8_ & 0xffffffff;
  if ((uVar25 < uVar16) &&
     (plVar24 = (long *)(*(long *)(lVar14 + 0x20) + uVar25 * 0x20), *plVar24 != -0x8000000000000000)
     ) {
    uVar22 = plVar24[2];
    if (uVar22 != 0) {
      uVar16 = 1;
      uVar27 = 0;
      while( true ) {
        uVar15 = uVar16;
        if ((*(ulong *)(*(long *)(lVar5 + 0xd8) + 0x28) <= uVar25) ||
           (plVar24 = (long *)(*(long *)(*(long *)(lVar5 + 0xd8) + 0x20) + uVar25 * 0x20),
           *plVar24 == -0x8000000000000000)) break;
        if ((ulong)plVar24[2] <= uVar27) {
          func_0x007a2570(uVar27,plVar24[2],&UNK_009ec8d8);
LAB_0054504c:
          puVar13 = &UNK_009ec8f0;
code_r0x00545004:
          func_0x007a23bc(puVar13);
          goto code_r0x005450f8;
        }
        lVar14 = plVar24[1] + uVar27 * 0x108;
        if (*(long *)(lVar14 + 0x18) == 0xf) {
          lStack_230 = 0;
          lStack_228 = 8;
          lStack_220 = 0;
          pqStack_1d0 = *(qword **)(lVar14 + 0x28);
          pqStack_1c8 = pqStack_1d0 + *(long *)(lVar14 + 0x30) * 3;
          pqStack_1c0 = (qword *)0x0;
          func_0x005593b8(&pqStack_218,&pqStack_1d0,&UNK_009ec388);
          lStack_1b0 = lVar14 + 0x20;
          pqStack_1b8 = pqStack_210 + lStack_208 * 2;
          pqStack_1d0 = pqStack_210;
          pqStack_1c8 = pqStack_210;
          pqStack_1c0 = pqStack_218;
          func_0x00556d44(&puStack_98,&pqStack_1d0,&UNK_009ec388);
          puStack_1e8 = puStack_90 + lStack_88 * 3;
          puStack_200 = puStack_90;
          puStack_1f8 = puStack_90;
          puStack_1f0 = puStack_98;
          puVar9 = puStack_90;
          if (lStack_88 != 0) {
            do {
              puStack_1f8 = puVar9 + 3;
              plVar24 = (long *)*puVar9;
              if (plVar24 == (long *)0x0) break;
              uVar8 = puVar9[1];
              pqVar10 = (qword *)puVar9[2];
              plStack_1e0 = plVar24;
              pqStack_1d8 = pqVar10;
              if (*(long *)(lVar5 + 0x30) != 0) {
                uVar16 = func_0x005787f4(*(undefined8 *)(lVar5 + 0x38),*(undefined8 *)(lVar5 + 0x40)
                                         ,plVar24);
                lVar14 = 0;
                uVar26 = uVar16 >> 0x39;
                while( true ) {
                  uVar16 = uVar16 & *(ulong *)(lVar5 + 0x20);
                  uVar17 = *(ulong *)(*(long *)(lVar5 + 0x18) + uVar16);
                  uVar18 = uVar17 ^ uVar26 * 0x101010101010101;
                  for (uVar18 = uVar18 + 0xfefefefefefefeff & (uVar18 ^ 0xffffffffffffffff) &
                                0x8080808080808080; uVar18 != 0; uVar18 = uVar18 - 1 & uVar18) {
                    uVar11 = (uVar18 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                             (uVar18 >> 7 & 0xff00ff00ff00ff) << 8;
                    uVar11 = (uVar11 & 0xffff0000ffff0000) >> 0x10 |
                             (uVar11 & 0xffff0000ffff) << 0x10;
                    uVar11 = *(ulong *)(*(long *)(lVar5 + 0x18) + -8 +
                                       (uVar16 + ((ulong)LZCOUNT(uVar11 >> 0x20 | uVar11 << 0x20) >>
                                                 3) & *(ulong *)(lVar5 + 0x20)) * -8);
                    auVar28._8_8_ = *(ulong *)(lVar5 + 0x10);
                    auVar28._0_8_ = uVar11;
                    if (*(ulong *)(lVar5 + 0x10) <= uVar11) goto code_r0x00545030;
                    if (plVar24 == *(long **)(*(long *)(lVar5 + 8) + uVar11 * 0x18))
                    goto code_r0x00544968;
                  }
                  if ((uVar17 & uVar17 << 1 & 0x8080808080808080) != 0) break;
                  lVar14 = lVar14 + 8;
                  uVar16 = lVar14 + uVar16;
                }
              }
              lVar14 = func_0x0057851c(lVar5,&pqStack_1d8);
              pqVar10 = pqStack_1d8;
              if (lVar14 == 1) {
code_r0x00544968:
                qVar6 = *pqVar10;
                *pqVar10 = qVar6 - 1;
                LORelease();
                if (qVar6 == 1) {
                  func_0x005d2ac4(&pqStack_1d8);
                }
              }
              else {
                qVar6 = *pqStack_1d8;
                *pqStack_1d8 = qVar6 + 1;
                if ((long)qVar6 < 0) {
code_r0x00544fd4:
                  func_0x007a05dc();
                  goto code_r0x005450f8;
                }
                pqStack_1d0 = pqStack_1d8;
                lVar14 = *plStack_1e0;
                *plStack_1e0 = lVar14 + 1;
                if (lVar14 < 0) {
                  func_0x007a05dc();
                  goto code_r0x005450f8;
                }
                uVar16 = func_0x005453d0(lVar5,pqStack_1d8,plStack_1e0);
                pqVar10 = pqStack_1d8;
                if ((uVar16 & 1) == 0) {
                  qVar6 = *pqStack_1d8;
                  *pqStack_1d8 = qVar6 + 1;
                  if ((long)qVar6 < 0) goto code_r0x00544fd4;
                  puVar9 = (undefined8 *)func_0x00544148(lVar5,pqStack_1d8);
                  uVar16 = *(ulong *)*puVar9;
                  *(ulong *)*puVar9 = uVar16 + 1;
                  if (0xfffffffffffffffe < uVar16) goto code_r0x005450f8;
                  plStack_c0 = (long *)*puVar9;
                  lVar14 = *plStack_1e0;
                  *plStack_1e0 = lVar14 + 1;
                  if (lVar14 < 0) {
                    func_0x007a05dc();
                    goto code_r0x005450f8;
                  }
                  puVar9 = (undefined8 *)func_0x00544148(lVar5);
                  uVar16 = *(ulong *)*puVar9;
                  *(ulong *)*puVar9 = uVar16 + 1;
                  if (0xfffffffffffffffe < uVar16) goto code_r0x005450f8;
                  plStack_b8 = (long *)*puVar9;
                  qVar6 = *pqVar10;
                  *pqVar10 = qVar6 + 1;
                  if ((long)qVar6 < 0) {
                    func_0x007a05dc();
                    goto code_r0x005450f8;
                  }
                  plVar24 = (long *)func_0x00547df0(lVar5,pqVar10);
                  lVar14 = *plVar24;
                  if (0x7ffffffffffffffe < *(ulong *)(lVar14 + 0x10)) {
                    func_0x007a2378(&UNK_009eca50);
                    goto code_r0x005450f8;
                  }
                  *(ulong *)(lVar14 + 0x10) = *(ulong *)(lVar14 + 0x10) + 1;
                  pqStack_1d0 = *(qword **)(lVar14 + 0x18);
                  pqStack_1b8 = (qword *)((long)pqStack_1d0 + *(long *)(lVar14 + 0x20) + 1);
                  qVar6 = *pqStack_1d0;
                  pqStack_1c0 = pqStack_1d0 + 1;
                  pqStack_1c8 = (qword *)(CONCAT17(-(-1 < (long)qVar6),
                                                   CONCAT16(-(-1 < (char)(qVar6 >> 0x30)),
                                                            CONCAT15(-(-1 < (char)(qVar6 >> 0x28)),
                                                                     CONCAT14(-(-1 < (char)(qVar6 >>
                                                                                           0x20)),
                                                                              CONCAT13(-(-1 < (char)
                                                  (qVar6 >> 0x18)),
                                                  CONCAT12(-(-1 < (char)(qVar6 >> 0x10)),
                                                           CONCAT11(-(-1 < (char)(qVar6 >> 8)),
                                                                    -(-1 < (char)qVar6)))))))) &
                                         0x8080808080808080);
                  lStack_1b0 = *(long *)(lVar14 + 0x30);
                  func_0x0055aac0(&lStack_b0,&pqStack_1d0,&UNK_009ec388);
                  *(long *)(lVar14 + 0x10) = *(long *)(lVar14 + 0x10) + -1;
                  puStack_80 = puStack_a8 + lStack_a0;
                  puStack_98 = puStack_a8;
                  puStack_90 = puStack_a8;
                  lStack_88 = lStack_b0;
                  puVar9 = puStack_a8;
                  if (lStack_a0 != 0) {
                    do {
                      puStack_90 = puVar9 + 1;
                      plStack_78 = (long *)*puVar9;
                      if ((((plStack_78 == plStack_1e0) || ((qword *)plStack_78 == pqStack_1d8)) ||
                          (iVar7 = func_0x00543f78(lVar5,plStack_78), iVar7 == 0)) ||
                         (iVar7 = func_0x005473b0(lVar5,pqStack_1d8,plStack_78), iVar7 == 0)) {
code_r0x00544e20:
                        lVar14 = *plStack_78;
                        *plStack_78 = lVar14 + -1;
                        LORelease();
                        if (lVar14 == 1) {
                          func_0x005d2ac4(&plStack_78);
                        }
                      }
                      else {
                        lVar14 = *plStack_78;
                        *plStack_78 = lVar14 + 1;
                        if (lVar14 < 0) {
                          func_0x007a05dc();
                          goto code_r0x005450f8;
                        }
                        puVar9 = (undefined8 *)func_0x00544148(lVar5,plStack_78);
                        plVar24 = plStack_c0;
                        uVar16 = *(ulong *)*puVar9;
                        *(ulong *)*puVar9 = uVar16 + 1;
                        if (0xfffffffffffffffe < uVar16) goto code_r0x005450f8;
                        plVar21 = (long *)*puVar9;
                        aplStack_70[0] = plVar21;
                        if (plStack_c0 != plVar21) {
                          if (0x7ffffffffffffffe < (ulong)plStack_c0[2]) goto code_r0x00545014;
                          plStack_c0[2] = plStack_c0[2] + 1;
                          if ((ulong)plVar21[2] < 0x7fffffffffffffff) {
                            plVar21[2] = plVar21[2] + 1;
                            uVar16 = func_0x00584344(plStack_c0 + 3,plVar21 + 3);
                            plVar21[2] = plVar21[2] + -1;
                            plVar24[2] = plVar24[2] + -1;
                            if ((uVar16 & 1) != 0) goto code_r0x00544c64;
                            goto code_r0x00544ccc;
                          }
                          func_0x007a2378(&UNK_009ec438);
                          goto code_r0x005450f8;
                        }
code_r0x00544c64:
                        plVar21 = plStack_b8;
                        plVar24 = plStack_c0;
                        if (plStack_c0 != plStack_b8) {
                          if (0x7ffffffffffffffe < (ulong)plStack_c0[2]) goto code_r0x00545014;
                          plStack_c0[2] = plStack_c0[2] + 1;
                          if (0x7ffffffffffffffe < (ulong)plStack_b8[2]) {
                            func_0x007a2378(&UNK_009ec438);
                            goto code_r0x005450f8;
                          }
                          plStack_b8[2] = plStack_b8[2] + 1;
                          iVar7 = func_0x00584344(plStack_c0 + 3,plStack_b8 + 3);
                          plVar21[2] = plVar21[2] + -1;
                          plVar24[2] = plVar24[2] + -1;
                          if (iVar7 != 0) goto code_r0x00544ccc;
                          pqStack_1d0 = (qword *)&UNK_009eca40;
                          pqStack_1c8 = (qword *)((long)&MACH_HEADER.magic + 1);
                          pqStack_1b8 = (qword *)0x0;
                          lStack_1b0 = 0;
                          pqStack_1c0 = (qword *)&MACH_HEADER.cpusubtype;
                          func_0x0041e264(&pqStack_1d0);
                          lVar14 = *aplStack_70[0];
                          *aplStack_70[0] = lVar14 + -1;
                          if (lVar14 + -1 == 0) {
                            func_0x0057e6ac(aplStack_70);
                          }
                          lVar14 = *plStack_78;
                          *plStack_78 = lVar14 + -1;
                          LORelease();
                          if (lVar14 == 1) {
                            func_0x005d2ac4(&plStack_78);
                          }
code_r0x00544edc:
                          func_0x005928cc(&puStack_98);
                          lVar14 = *plStack_b8;
                          *plStack_b8 = lVar14 + -1;
                          if (lVar14 + -1 == 0) {
                            func_0x0057e6ac(&plStack_b8);
                          }
                          lVar14 = *plStack_c0;
                          *plStack_c0 = lVar14 + -1;
                          if (lVar14 + -1 != 0) goto code_r0x005449b4;
                          bVar19 = true;
                          goto code_r0x00544b20;
                        }
code_r0x00544ccc:
                        plVar21 = plStack_b8;
                        plVar24 = plStack_c0;
                        if (plStack_b8 == plStack_c0) goto code_r0x00544e00;
                        if (0x7ffffffffffffffe < (ulong)plStack_b8[2]) goto code_r0x00545014;
                        plStack_b8[2] = plStack_b8[2] + 1;
                        if (0x7ffffffffffffffe < (ulong)plStack_c0[2]) {
                          func_0x007a2378(&UNK_009ec438);
                          goto code_r0x005450f8;
                        }
                        plStack_c0[2] = plStack_c0[2] + 1;
                        iVar7 = func_0x00584344(plStack_b8 + 3,plStack_c0 + 3);
                        plVar3 = aplStack_70[0];
                        plVar2 = plStack_b8;
                        plVar24[2] = plVar24[2] + -1;
                        plVar21[2] = plVar21[2] + -1;
                        if ((iVar7 != 0) || (plStack_b8 == aplStack_70[0])) {
code_r0x00544e00:
                          lVar14 = *aplStack_70[0];
                          *aplStack_70[0] = lVar14 + -1;
                          if (lVar14 + -1 == 0) {
                            func_0x0057e6ac(aplStack_70);
                          }
                          goto code_r0x00544e20;
                        }
                        if (0x7ffffffffffffffe < (ulong)plStack_b8[2]) {
code_r0x00545014:
                          func_0x007a2378(&UNK_009ec450);
                          goto code_r0x005450f8;
                        }
                        plStack_b8[2] = plStack_b8[2] + 1;
                        if (0x7ffffffffffffffe < (ulong)aplStack_70[0][2]) goto code_r0x005450b4;
                        aplStack_70[0][2] = aplStack_70[0][2] + 1;
                        uVar16 = func_0x00584344(plStack_b8 + 3,aplStack_70[0] + 3);
                        plVar21 = aplStack_70[0];
                        plVar24 = plStack_c0;
                        plVar3[2] = plVar3[2] + -1;
                        plVar2[2] = plVar2[2] + -1;
                        if (((uVar16 & 1) != 0) || (plStack_c0 == aplStack_70[0]))
                        goto code_r0x00544e00;
                        if (0x7ffffffffffffffe < (ulong)plStack_c0[2]) goto code_r0x00545014;
                        plStack_c0[2] = plStack_c0[2] + 1;
                        if (0x7ffffffffffffffe < (ulong)aplStack_70[0][2]) goto code_r0x005450ec;
                        aplStack_70[0][2] = aplStack_70[0][2] + 1;
                        uVar16 = func_0x00584344(plStack_c0 + 3,aplStack_70[0] + 3);
                        plVar21[2] = plVar21[2] + -1;
                        plVar24[2] = plVar24[2] + -1;
                        if ((uVar16 & 1) != 0) goto code_r0x00544e00;
                        qVar6 = *pqVar10;
                        *pqVar10 = qVar6 + 1;
                        if ((long)qVar6 < 0) {
                          func_0x007a05dc();
                          goto code_r0x005450f8;
                        }
                        uVar16 = func_0x005453d0(lVar5,pqVar10,plStack_78);
                        if ((uVar16 & 1) != 0) {
                          pqStack_1d0 = (qword *)&UNK_009eca40;
                          pqStack_1c8 = (qword *)((long)&MACH_HEADER.magic + 1);
                          pqStack_1b8 = (qword *)0x0;
                          lStack_1b0 = 0;
                          pqStack_1c0 = (qword *)&MACH_HEADER.cpusubtype;
                          func_0x0041e264(&pqStack_1d0);
                          lVar14 = *aplStack_70[0];
                          *aplStack_70[0] = lVar14 + -1;
                          if (lVar14 + -1 == 0) {
                            func_0x0057e6ac(aplStack_70);
                          }
                          goto code_r0x00544edc;
                        }
                        lVar14 = *aplStack_70[0];
                        *aplStack_70[0] = lVar14 + -1;
                        if (lVar14 + -1 == 0) {
                          func_0x0057e6ac(aplStack_70);
                        }
                      }
                      puVar9 = puStack_90;
                    } while (puStack_90 != puStack_80);
                  }
                  func_0x005928cc(&puStack_98);
                  lVar14 = *plStack_b8;
                  *plStack_b8 = lVar14 + -1;
                  if (lVar14 + -1 == 0) {
                    func_0x0057e6ac(&plStack_b8);
                  }
                  lVar14 = *plStack_c0;
                  *plStack_c0 = lVar14 + -1;
                  if (lVar14 + -1 == 0) {
                    bVar19 = false;
code_r0x00544b20:
                    func_0x0057e6ac(&plStack_c0);
                    if (bVar19) goto code_r0x005449b4;
                  }
                }
                else {
code_r0x005449b4:
                  lVar14 = lStack_220;
                  if (lStack_220 == lStack_230) {
                    func_0x005e25c0(&lStack_230,&UNK_009ec998);
                  }
                  *(undefined8 *)(lStack_228 + lVar14 * 8) = uVar8;
                  lStack_220 = lVar14 + 1;
                }
                qVar6 = *pqStack_1d8;
                *pqStack_1d8 = qVar6 - 1;
                LORelease();
                if (qVar6 == 1) {
                  func_0x005d2ac4(&pqStack_1d8);
                }
              }
              lVar14 = *plStack_1e0;
              *plStack_1e0 = lVar14 + -1;
              LORelease();
              if (lVar14 == 1) {
                func_0x005d2ac4(&plStack_1e0);
              }
              puVar9 = puStack_1f8;
            } while (puStack_1f8 != puStack_1e8);
          }
          func_0x00593268(&puStack_200);
          lVar1 = lStack_228;
          lVar14 = lStack_230;
          if ((*(ulong *)(*(long *)(lVar5 + 0xd8) + 0x28) <= uVar25) ||
             (plVar24 = (long *)(*(long *)(*(long *)(lVar5 + 0xd8) + 0x20) + uVar25 * 0x20),
             *plVar24 == -0x8000000000000000)) goto LAB_0054504c;
          if ((ulong)plVar24[2] <= uVar27) {
            func_0x007a2570(uVar27,plVar24[2],&UNK_009ec908);
            goto code_r0x005450f8;
          }
          lVar23 = plVar24[1] + uVar27 * 0x108;
          if (*(long *)(lVar23 + 0x18) != 0xf) {
            puVar13 = &UNK_009ec920;
            goto code_r0x00545004;
          }
          if (lStack_220 != 0) {
            lVar20 = lStack_220 << 3;
            do {
              uVar16 = *(ulong *)(lVar1 + lVar20 + -8);
              uVar26 = *(ulong *)(lVar23 + 0x30);
              if (uVar26 <= uVar16) {
                puVar13 = &UNK_009ec968;
code_r0x00544fc0:
                func_0x007a2080(uVar16,uVar26,puVar13);
                goto code_r0x005450f8;
              }
              puVar9 = (undefined8 *)(*(long *)(lVar23 + 0x28) + uVar16 * 0x18);
              pqStack_1c0 = (qword *)puVar9[2];
              pqStack_1c8 = (qword *)puVar9[1];
              pqStack_1d0 = (qword *)*puVar9;
              _memmove(puVar9,puVar9 + 3,(uVar26 + ~uVar16) * 0x18);
              pqVar10 = pqStack_1c8;
              *(ulong *)(lVar23 + 0x30) = uVar26 - 1;
              uVar26 = (ulong)pqStack_1d0 ^ 0x8000000000000000;
              if (2 < uVar26) {
                uVar26 = 1;
              }
              if (uVar26 == 0) {
                qVar6 = *pqStack_1c8;
                *pqStack_1c8 = qVar6 - 1;
                LORelease();
                if (qVar6 == 1) {
                  func_0x005d2ac4(&pqStack_1c8);
                }
              }
              else {
                if (uVar26 == 1) {
                  if (pqStack_1d0 == (qword *)0x0) goto LAB_00544798;
                  uVar8 = 1;
                  pqVar12 = pqStack_1d0;
                }
                else {
                  func_0x0053ceac(pqStack_1c8);
                  func_0x00187bd4(pqVar10,0x40,8);
                  pqVar10 = pqStack_1c0;
                  func_0x0053ceac(pqStack_1c0);
                  pqVar12 = &segment_command_00000020.vmsize;
                  uVar8 = 8;
                }
                func_0x00187bd4(pqVar10,pqVar12,uVar8);
              }
LAB_00544798:
              uVar26 = *(ulong *)(lVar23 + 0x48);
              if (uVar26 <= uVar16) {
                puVar13 = &UNK_009ec980;
                goto code_r0x00544fc0;
              }
              puVar9 = (undefined8 *)(*(long *)(lVar23 + 0x40) + uVar16 * 0x40);
              uStack_1a8 = puVar9[5];
              lStack_1b0 = puVar9[4];
              uStack_198 = puVar9[7];
              uStack_1a0 = puVar9[6];
              pqStack_1c8 = (qword *)puVar9[1];
              pqStack_1d0 = (qword *)*puVar9;
              pqStack_1b8 = (qword *)puVar9[3];
              pqStack_1c0 = (qword *)puVar9[2];
              _memmove(puVar9,puVar9 + 8,(uVar26 + ~uVar16) * 0x40);
              *(ulong *)(lVar23 + 0x48) = uVar26 - 1;
              func_0x0053ceac(&pqStack_1d0);
              lVar20 = lVar20 + -8;
            } while (lVar20 != 0);
          }
          if (lVar14 != 0) {
            func_0x00187bd4(lVar1,lVar14 << 3,8);
          }
          if (*(long *)(lVar23 + 0x30) == 0) {
            if ((uVar25 < *(ulong *)(*(long *)(lVar5 + 0xd8) + 0x28)) &&
               (plVar24 = (long *)(*(long *)(*(long *)(lVar5 + 0xd8) + 0x20) + uVar25 * 0x20),
               *plVar24 != -0x8000000000000000)) {
              pqStack_1b8 = (qword *)&MACH_HEADER.filetype;
              if (uVar27 < (ulong)plVar24[2]) {
                lVar14 = plVar24[1] + uVar27 * 0x108;
                func_0x0053d360(lVar14);
                _memcpy(lVar14,&pqStack_1d0,0x108);
                goto LAB_0054455c;
              }
              func_0x007a2570(uVar27,plVar24[2],&UNK_009ec950);
            }
            else {
              func_0x007a23bc(&UNK_009ec938);
code_r0x005450b4:
              func_0x007a2378(&UNK_009ec438);
            }
            goto code_r0x005450f8;
          }
        }
LAB_0054455c:
        if (uVar22 <= uVar15) {
          lVar14 = *(long *)(lVar5 + 0xd8);
          uVar16 = *(ulong *)(lVar14 + 0x28);
          goto LAB_00544f68;
        }
        uVar16 = uVar15 + 1;
        uVar27 = uVar15;
      }
      auVar28 = func_0x007a23bc(&UNK_009ec8c0);
code_r0x00545030:
      func_0x007a2570(auVar28._0_8_,auVar28._8_8_,&UNK_009f0c60);
      goto code_r0x005450f8;
    }
LAB_00544f68:
    if ((uVar25 < uVar16) &&
       (*(long *)(*(long *)(lVar14 + 0x20) + uVar25 * 0x20) != -0x8000000000000000)) {
      func_0x00556794();
      return;
    }
  }
  else {
    func_0x007a23bc(&UNK_009ec890);
  }
  func_0x007a23bc(&UNK_009ec8a8);
code_r0x005450ec:
  func_0x007a2378(&UNK_009ec438);
code_r0x005450f8:
                    /* WARNING: Does not return */
  pcVar4 = (code *)SoftwareBreakpoint(1,0x5450fc);
  (*pcVar4)();
}

