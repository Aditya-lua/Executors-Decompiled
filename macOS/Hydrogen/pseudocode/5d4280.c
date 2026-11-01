
/* WARNING: Possible PIC construction at 0x005d4730: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005d48ac: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x005d4734) */
/* WARNING: Removing unreachable block (ram,0x005d48b0) */
/* WARNING: Removing unreachable block (ram,0x005d48bc) */
/* WARNING: Removing unreachable block (ram,0x005d48c8) */
/* WARNING: Removing unreachable block (ram,0x005d48d4) */
/* WARNING: Removing unreachable block (ram,0x005d4900) */
/* WARNING: Removing unreachable block (ram,0x005d48e0) */
/* WARNING: Removing unreachable block (ram,0x005d4928) */
/* WARNING: Removing unreachable block (ram,0x005d48fc) */
/* WARNING: Removing unreachable block (ram,0x005d4938) */
/* WARNING: Removing unreachable block (ram,0x005d4964) */
/* WARNING: Removing unreachable block (ram,0x005d4738) */
/* WARNING: Removing unreachable block (ram,0x005d4744) */
/* WARNING: Removing unreachable block (ram,0x005d4754) */
/* WARNING: Removing unreachable block (ram,0x005d4760) */
/* WARNING: Removing unreachable block (ram,0x005d478c) */
/* WARNING: Removing unreachable block (ram,0x005d476c) */
/* WARNING: Removing unreachable block (ram,0x005d4788) */
/* WARNING: Removing unreachable block (ram,0x005d47b4) */
/* WARNING: Removing unreachable block (ram,0x005d4380) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined4 FUN_005d4280(void)

{
  uint *puVar1;
  uint uVar2;
  uint uVar3;
  ulong uVar4;
  undefined1 *puVar5;
  long lVar6;
  long lVar7;
  undefined4 uVar8;
  long *plVar9;
  char *pcVar10;
  undefined8 extraout_x1;
  byte bVar11;
  long lVar12;
  ulong uVar13;
  undefined8 *puVar14;
  ulong uVar15;
  long *plVar16;
  dword *pdVar17;
  ulong uVar18;
  dword *pdVar19;
  ulong unaff_x19;
  undefined8 unaff_x20;
  long unaff_x21;
  long unaff_x22;
  long unaff_x23;
  ulong unaff_x24;
  dword *unaff_x25;
  int iVar20;
  dword *unaff_x26;
  dword *unaff_x27;
  ulong unaff_x28;
  undefined1 *unaff_x29;
  code *pcVar21;
  char cVar22;
  undefined8 in_xzr;
  byte bVar23;
  byte bVar25;
  byte bVar26;
  byte bVar27;
  byte bVar28;
  byte bVar29;
  undefined8 uVar24;
  byte bVar30;
  long lVar31;
  long lVar32;
  long lVar33;
  long lVar34;
  long lVar35;
  long lVar36;
  undefined8 unaff_d8;
  undefined8 unaff_d9;
  undefined1 auVar37 [16];
  
  pcVar21 = FUN_005d4280 + 4;
  auVar37 = __Unwind_Resume();
  plVar16 = auVar37._8_8_;
  lVar7 = auVar37._0_8_;
  puVar5 = (undefined1 *)register0x00000008;
LAB_005d4284:
  *(undefined8 *)(puVar5 + -0x70) = unaff_d9;
  *(undefined8 *)(puVar5 + -0x68) = unaff_d8;
  *(ulong *)(puVar5 + -0x60) = unaff_x28;
  *(dword **)(puVar5 + -0x58) = unaff_x27;
  *(dword **)(puVar5 + -0x50) = unaff_x26;
  *(dword **)(puVar5 + -0x48) = unaff_x25;
  *(ulong *)(puVar5 + -0x40) = unaff_x24;
  *(long *)(puVar5 + -0x38) = unaff_x23;
  *(long *)(puVar5 + -0x30) = unaff_x22;
  *(long *)(puVar5 + -0x28) = unaff_x21;
  *(undefined8 *)(puVar5 + -0x20) = unaff_x20;
  *(ulong *)(puVar5 + -0x18) = unaff_x19;
  *(undefined1 **)(puVar5 + -0x10) = unaff_x29;
  *(code **)(puVar5 + -8) = pcVar21;
  unaff_x29 = puVar5 + -0x10;
  *(long **)(puVar5 + -0xe8) = plVar16;
  lVar6 = *plVar16;
  *plVar16 = lVar6 + 1;
  if (-1 < lVar6) {
    uVar8 = func_0x005c4434();
    *(undefined4 *)(puVar5 + -0xec) = uVar8;
    lVar6 = **(long **)(puVar5 + -0xe8);
    **(long **)(puVar5 + -0xe8) = lVar6 + 1;
    if (-1 < lVar6) {
      func_0x005c5640(lVar7 + 0x78,*(undefined8 *)(puVar5 + -0xe8),*(undefined4 *)(puVar5 + -0xec));
      lVar6 = *(long *)(puVar5 + -0xe8);
      pcVar10 = (char *)(lVar6 + 8);
      if (*pcVar10 == '\0') {
        *pcVar10 = '\x01';
      }
      else {
        func_0x007aff64(pcVar10,extraout_x1,1000000000);
      }
      cVar22 = (char)in_xzr;
      *(char **)(puVar5 + -0x110) = pcVar10;
      lVar12 = *(long *)(lVar6 + 0x20);
      if (lVar12 == 0) {
LAB_005d4a88:
        pcVar10 = *(char **)(puVar5 + -0x110);
        if (*pcVar10 == '\x01') {
          *pcVar10 = cVar22;
        }
        else {
          func_0x007b05dc(pcVar10,0);
        }
        lVar7 = **(long **)(puVar5 + -0xe8);
        **(long **)(puVar5 + -0xe8) = lVar7 + -1;
        LORelease();
        if (lVar7 == 1) {
          func_0x005d2c74(puVar5 + -0xe8);
        }
        return *(undefined4 *)(puVar5 + -0xec);
      }
      unaff_x22 = 0;
      unaff_x23 = *(long *)(lVar6 + 0x18);
      *(ulong *)(puVar5 + -0x108) = (ulong)*(uint *)(puVar5 + -0xec);
      *(long *)(puVar5 + -0x100) = unaff_x23 + lVar12 * 0x108;
      unaff_x19 = (ulong)*(uint *)(puVar5 + -0xec) * 0x517cc1b727220a95;
      *(ulong *)(puVar5 + -0xf8) = unaff_x19 >> 0x39;
      bVar11 = (byte)(unaff_x19 >> 0x39);
      unaff_d8 = CONCAT17(bVar11,CONCAT16(bVar11,CONCAT15(bVar11,CONCAT14(bVar11,CONCAT13(bVar11,
                                                  CONCAT12(bVar11,CONCAT11(bVar11,bVar11)))))));
      *(undefined8 *)(puVar5 + -0x118) = _UNK_008848d8;
      *(undefined8 *)(puVar5 + -0x120) = _UNK_008848d0;
      *(undefined8 *)(puVar5 + -0x128) = _UNK_008ae598;
      *(undefined8 *)(puVar5 + -0x130) = _UNK_008ae590;
      *(undefined8 *)(puVar5 + -0x138) = _UNK_008ae5a8;
      *(undefined8 *)(puVar5 + -0x140) = _UNK_008ae5a0;
      *(undefined8 *)(puVar5 + -0x148) = _UNK_008ae5b8;
      *(undefined8 *)(puVar5 + -0x150) = _UNK_008ae5b0;
LAB_005d43b4:
      lVar6 = *(long *)(unaff_x23 + 0x18);
      unaff_x21 = lVar7;
      if (lVar6 == 0x17 || lVar6 == 0x1a) {
LAB_005d4424:
        if (lVar6 < 0x14) goto code_r0x005d4704;
code_r0x005d442c:
        if (lVar6 == 0x14) goto code_r0x005d4714;
        if (lVar6 == 0x17) {
          puVar14 = (undefined8 *)(unaff_x23 + 0xe8);
          plVar16 = (long *)*puVar14;
          goto code_r0x005d471c;
        }
        if (lVar6 == 0x1a) {
          puVar14 = (undefined8 *)(unaff_x23 + 0x50);
          plVar16 = (long *)*puVar14;
          goto code_r0x005d471c;
        }
      }
      else {
        uVar13 = lVar6 - 0xc;
        if (0x14 < uVar13) {
          uVar13 = 9;
        }
        if ((long)uVar13 < 0xb) {
          if (3 < (long)uVar13) {
            if (uVar13 - 4 < 5) {
LAB_005d441c:
              *(undefined8 *)(puVar5 + -0xe0) = 0;
              lVar6 = *(long *)(unaff_x23 + 0x18);
              goto LAB_005d4424;
            }
            if (uVar13 != 9) {
              if (*(long *)(unaff_x23 + 0xa0) != -0x8000000000000000) {
                unaff_x24 = 0;
                goto code_r0x005d4a0c;
              }
              unaff_x26 = (dword *)func_0x00187bd0(8,8);
              if (unaff_x26 == (dword *)0x0) goto code_r0x005d4b3c;
              *(long *)unaff_x26 = unaff_x23 + 0xa8;
              unaff_x24 = 1;
              uVar15 = 1;
              goto code_r0x005d453c;
            }
            func_0x005da864(puVar5 + -0xe0,unaff_x23);
code_r0x005d4530:
            unaff_x26 = *(dword **)(puVar5 + -0xd8);
            uVar15 = *(ulong *)(puVar5 + -0xd0);
            unaff_x24 = *(ulong *)(puVar5 + -0xe0);
code_r0x005d453c:
            if (uVar15 != 0) {
              unaff_x27 = unaff_x26 + uVar15 * 2;
              goto code_r0x005d4544;
            }
            goto code_r0x005d46e4;
          }
          if (2 < uVar13) {
            lVar6 = *(long *)(unaff_x23 + 0x28);
            lVar12 = *(long *)(unaff_x23 + 0x30);
            *(undefined8 *)(puVar5 + -200) = 0;
            *(undefined8 *)(puVar5 + -0xa8) = 0;
            *(long *)(puVar5 + -0x88) = lVar6;
            *(long *)(puVar5 + -0x80) = lVar6 + lVar12 * 0x18;
            func_0x005a11d0(puVar5 + -0xe0,puVar5 + -200,&UNK_009f3020);
            goto code_r0x005d4530;
          }
        }
        else {
          if (0xd < (long)uVar13) {
            if (uVar13 - 0xf < 6) goto LAB_005d441c;
            unaff_x24 = *(ulong *)(unaff_x23 + 0x30);
            if (unaff_x24 == 0) {
code_r0x005d4a0c:
              uVar15 = 0;
              unaff_x26 = &MACH_HEADER.cpusubtype;
              goto code_r0x005d453c;
            }
            unaff_x25 = *(dword **)(unaff_x23 + 0x28);
            unaff_x27 = (dword *)(unaff_x24 << 3);
            unaff_x26 = (dword *)func_0x00187bd0(unaff_x27,8);
            if (unaff_x26 == (dword *)0x0) {
              func_0x007a1f00(8,unaff_x27,&UNK_009f30a0);
              goto code_r0x005d4b7c;
            }
            uVar13 = unaff_x24 - 1 & 0x1fffffffffffffff;
            if (uVar13 < 7) {
              uVar15 = 0;
              pdVar17 = unaff_x25;
            }
            else {
              uVar13 = uVar13 + 1;
              uVar15 = uVar13 & 0x3ffffffffffffff8;
              pdVar17 = unaff_x25 + uVar15 * 2;
              lVar32 = *(long *)(puVar5 + -0x128);
              lVar31 = *(long *)(puVar5 + -0x130);
              lVar12 = *(long *)(puVar5 + -0x118);
              lVar6 = *(long *)(puVar5 + -0x120);
              lVar36 = *(long *)(puVar5 + -0x148);
              lVar35 = *(long *)(puVar5 + -0x150);
              lVar34 = *(long *)(puVar5 + -0x138);
              lVar33 = *(long *)(puVar5 + -0x140);
              plVar16 = (long *)(unaff_x26 + 8);
              uVar18 = uVar15;
              pdVar19 = unaff_x25;
              do {
                plVar16[-3] = (long)pdVar19 + lVar12;
                plVar16[-4] = (long)pdVar19 + lVar6;
                plVar16[-1] = (long)pdVar19 + lVar32;
                plVar16[-2] = (long)pdVar19 + lVar31;
                plVar16[1] = (long)pdVar19 + lVar34;
                *plVar16 = (long)pdVar19 + lVar33;
                plVar16[3] = (long)pdVar19 + lVar36;
                plVar16[2] = (long)pdVar19 + lVar35;
                pdVar19 = pdVar19 + 0x10;
                uVar18 = uVar18 - 8;
                plVar16 = plVar16 + 8;
              } while (uVar18 != 0);
              if (uVar13 == uVar15) goto code_r0x005d453c;
            }
            do {
              *(dword **)(unaff_x26 + uVar15 * 2) = pdVar17;
              pdVar17 = pdVar17 + 2;
              uVar15 = uVar15 + 1;
            } while (pdVar17 != unaff_x25 + unaff_x24 * 2);
            goto code_r0x005d453c;
          }
          if (uVar13 != 0xb) {
            if (uVar13 == 0xc) {
              lVar6 = *(long *)(unaff_x23 + 0x28);
              lVar12 = *(long *)(unaff_x23 + 0x30);
              *(undefined8 *)(puVar5 + -200) = 0;
              *(undefined8 *)(puVar5 + -0xa8) = 0;
              *(long *)(puVar5 + -0x88) = lVar6;
              *(long *)(puVar5 + -0x80) = lVar6 + lVar12 * 0x18;
              func_0x005a11d0(puVar5 + -0xe0,puVar5 + -200,&UNK_009f3020);
            }
            else {
              lVar6 = *(long *)(unaff_x23 + 0xa8);
              lVar12 = *(long *)(unaff_x23 + 0xb0);
              *(undefined8 *)(puVar5 + -200) = 0;
              *(undefined8 *)(puVar5 + -0xa8) = 0;
              *(long *)(puVar5 + -0x88) = lVar6;
              *(long *)(puVar5 + -0x80) = lVar6 + lVar12 * 0x18;
              func_0x005a11d0(puVar5 + -0xe0,puVar5 + -200,&UNK_009f30a0);
            }
            goto code_r0x005d4530;
          }
          unaff_x26 = (dword *)func_0x00187bd0(8,8);
          if (unaff_x26 == (dword *)0x0) {
code_r0x005d4b3c:
            func_0x007a1f18(8,8);
            goto code_r0x005d4b7c;
          }
          unaff_x27 = unaff_x26 + 2;
          *(long *)unaff_x26 = unaff_x23 + 0xe0;
          unaff_x24 = 1;
code_r0x005d4544:
          pdVar19 = unaff_x26;
          do {
            unaff_x25 = pdVar19 + 2;
            puVar14 = *(undefined8 **)pdVar19;
            plVar16 = (long *)*puVar14;
            lVar6 = *plVar16;
            *plVar16 = lVar6 + 1;
            if (lVar6 < 0) {
              func_0x007a05dc();
              goto code_r0x005d4b7c;
            }
            func_0x005bf1b8(puVar5 + -200,lVar7 + 0x30,*puVar14);
            plVar9 = (long *)func_0x005bf3ec(puVar5 + -200);
            lVar6 = 0;
            plVar16 = (long *)*plVar9;
            uVar15 = plVar9[1];
            uVar13 = unaff_x19;
            while( true ) {
              uVar13 = uVar13 & uVar15;
              uVar24 = *(undefined8 *)((long)plVar16 + uVar13);
              bVar23 = (byte)((ulong)uVar24 >> 8);
              bVar25 = (byte)((ulong)uVar24 >> 0x10);
              bVar26 = (byte)((ulong)uVar24 >> 0x18);
              bVar27 = (byte)((ulong)uVar24 >> 0x20);
              bVar28 = (byte)((ulong)uVar24 >> 0x28);
              bVar29 = (byte)((ulong)uVar24 >> 0x30);
              bVar30 = (byte)((ulong)uVar24 >> 0x38);
              for (uVar18 = CONCAT17(-(bVar30 == bVar11),
                                     CONCAT16(-(bVar29 == bVar11),
                                              CONCAT15(-(bVar28 == bVar11),
                                                       CONCAT14(-(bVar27 == bVar11),
                                                                CONCAT13(-(bVar26 == bVar11),
                                                                         CONCAT12(-(bVar25 == bVar11
                                                                                   ),CONCAT11(-(
                                                  bVar23 == bVar11),-((byte)uVar24 == bVar11))))))))
                            & 0x8080808080808080; uVar18 != 0; uVar18 = uVar18 - 1 & uVar18) {
                uVar4 = (uVar18 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                        (uVar18 >> 7 & 0xff00ff00ff00ff) << 8;
                uVar4 = (uVar4 & 0xffff0000ffff0000) >> 0x10 | (uVar4 & 0xffff0000ffff) << 0x10;
                if ((int)plVar16[(uVar13 + ((ulong)LZCOUNT(uVar4 >> 0x20 | uVar4 << 0x20) >> 3) &
                                 uVar15) * -2 + -2] == *(int *)(puVar5 + -0xec))
                goto code_r0x005d462c;
              }
              bVar23 = NEON_umaxv(CONCAT17(-(bVar30 == 0xff),
                                           CONCAT16(-(bVar29 == 0xff),
                                                    CONCAT15(-(bVar28 == 0xff),
                                                             CONCAT14(-(bVar27 == 0xff),
                                                                      CONCAT13(-(bVar26 == 0xff),
                                                                               CONCAT12(-(bVar25 ==
                                                                                         0xff),
                                                  CONCAT11(-(bVar23 == 0xff),-((byte)uVar24 == 0xff)
                                                          ))))))),1);
              if ((bVar23 & 1) != 0) break;
              lVar6 = lVar6 + 8;
              uVar13 = uVar13 + lVar6;
            }
            if (plVar9[2] == 0) {
              *(long **)(puVar5 + -0x158) = plVar9;
              func_0x007adc58(plVar9,1,plVar9 + 4,1);
              plVar9 = *(long **)(puVar5 + -0x158);
              plVar16 = (long *)*plVar9;
              uVar15 = plVar9[1];
              uVar13 = uVar15 & unaff_x19;
              lVar6 = *(long *)((long)plVar16 + uVar13);
              uVar18 = CONCAT17(-(lVar6 < 0),
                                CONCAT16(-((char)((ulong)lVar6 >> 0x30) < '\0'),
                                         CONCAT15(-((char)((ulong)lVar6 >> 0x28) < '\0'),
                                                  CONCAT14(-((char)((ulong)lVar6 >> 0x20) < '\0'),
                                                           CONCAT13(-((char)((ulong)lVar6 >> 0x18) <
                                                                     '\0'),CONCAT12(-((char)((ulong)
                                                  lVar6 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar6 >> 8) < '\0'),
                                                           -((char)lVar6 < '\0'))))))));
            }
            else {
              uVar13 = uVar15 & unaff_x19;
              lVar6 = *(long *)((long)plVar16 + uVar13);
              uVar18 = CONCAT17(-(lVar6 < 0),
                                CONCAT16(-((char)((ulong)lVar6 >> 0x30) < '\0'),
                                         CONCAT15(-((char)((ulong)lVar6 >> 0x28) < '\0'),
                                                  CONCAT14(-((char)((ulong)lVar6 >> 0x20) < '\0'),
                                                           CONCAT13(-((char)((ulong)lVar6 >> 0x18) <
                                                                     '\0'),CONCAT12(-((char)((ulong)
                                                  lVar6 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar6 >> 8) < '\0'),
                                                           -((char)lVar6 < '\0'))))))));
            }
            if (uVar18 == 0) {
              lVar6 = 8;
              do {
                uVar13 = uVar13 + lVar6 & uVar15;
                lVar12 = *(long *)((long)plVar16 + uVar13);
                uVar18 = CONCAT17(-(lVar12 < 0),
                                  CONCAT16(-((char)((ulong)lVar12 >> 0x30) < '\0'),
                                           CONCAT15(-((char)((ulong)lVar12 >> 0x28) < '\0'),
                                                    CONCAT14(-((char)((ulong)lVar12 >> 0x20) < '\0')
                                                             ,CONCAT13(-((char)((ulong)lVar12 >>
                                                                               0x18) < '\0'),
                                                                       CONCAT12(-((char)((ulong)
                                                  lVar12 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar12 >> 8) < '\0'),
                                                           -((char)lVar12 < '\0'))))))));
                lVar6 = lVar6 + 8;
              } while (uVar18 == 0);
            }
            uVar18 = (uVar18 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar18 & 0x5555555555555555) << 1;
            uVar18 = (uVar18 & 0xcccccccccccccccc) >> 2 | (uVar18 & 0x3333333333333333) << 2;
            uVar18 = (uVar18 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar18 & 0xf0f0f0f0f0f0f0f) << 4;
            uVar18 = (uVar18 & 0xff00ff00ff00ff00) >> 8 | (uVar18 & 0xff00ff00ff00ff) << 8;
            uVar18 = (uVar18 & 0xffff0000ffff0000) >> 0x10 | (uVar18 & 0xffff0000ffff) << 0x10;
            uVar13 = uVar13 + ((ulong)LZCOUNT(uVar18 >> 0x20 | uVar18 << 0x20) >> 3) & uVar15;
            uVar18 = (ulong)*(char *)((long)plVar16 + uVar13);
            if (-1 < *(char *)((long)plVar16 + uVar13)) {
              lVar6 = *plVar16;
              uVar13 = CONCAT17(-(lVar6 < 0),
                                CONCAT16(-((char)((ulong)lVar6 >> 0x30) < '\0'),
                                         CONCAT15(-((char)((ulong)lVar6 >> 0x28) < '\0'),
                                                  CONCAT14(-((char)((ulong)lVar6 >> 0x20) < '\0'),
                                                           CONCAT13(-((char)((ulong)lVar6 >> 0x18) <
                                                                     '\0'),CONCAT12(-((char)((ulong)
                                                  lVar6 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar6 >> 8) < '\0'),
                                                           -((char)lVar6 < '\0'))))))));
              uVar13 = (uVar13 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar13 & 0x5555555555555555) << 1;
              uVar13 = (uVar13 & 0xcccccccccccccccc) >> 2 | (uVar13 & 0x3333333333333333) << 2;
              uVar13 = (uVar13 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar13 & 0xf0f0f0f0f0f0f0f) << 4;
              uVar13 = (uVar13 & 0xff00ff00ff00ff00) >> 8 | (uVar13 & 0xff00ff00ff00ff) << 8;
              uVar13 = (uVar13 & 0xffff0000ffff0000) >> 0x10 | (uVar13 & 0xffff0000ffff) << 0x10;
              uVar13 = (ulong)LZCOUNT(uVar13 >> 0x20 | uVar13 << 0x20) >> 3;
              uVar18 = (ulong)*(byte *)((long)plVar16 + uVar13);
            }
            uVar24 = *(undefined8 *)(puVar5 + -0xf8);
            *(char *)((long)plVar16 + uVar13) = (char)uVar24;
            *(char *)((long)plVar16 + (uVar13 - 8 & uVar15) + 8) = (char)uVar24;
            plVar9[2] = plVar9[2] - (uVar18 & 1);
            *(undefined4 *)(plVar16 + uVar13 * -2 + -2) = *(undefined4 *)(puVar5 + -0xec);
            plVar16[uVar13 * -2 + -1] = unaff_x22;
            plVar9[3] = plVar9[3] + 1;
code_r0x005d462c:
            pdVar19 = unaff_x25;
          } while (unaff_x25 != unaff_x27);
code_r0x005d46e4:
          if (unaff_x24 != 0) {
            func_0x00187bd4(unaff_x26,unaff_x24 << 3,8);
          }
        }
        lVar6 = *(long *)(unaff_x23 + 0x18);
        if (0x13 < lVar6) goto code_r0x005d442c;
code_r0x005d4704:
        unaff_x20 = 1;
        if (lVar6 == 0x10) {
          unaff_x27 = (dword *)func_0x005c4434(lVar7,0,unaff_x22);
          unaff_x26 = *(dword **)(lVar7 + 0x28);
          iVar20 = (int)unaff_x26;
          if (iVar20 == -1) {
            func_0x007a247c(&UNK_008b5451,0x58,&UNK_009f25c8);
            goto code_r0x005d4b7c;
          }
          unaff_x25 = (dword *)((ulong)unaff_x27 & 0xffffffff);
          pdVar19 = unaff_x25;
          if (unaff_x25 <= *(dword **)(puVar5 + -0x108)) {
            pdVar19 = *(dword **)(puVar5 + -0x108);
          }
          if (*(long **)(lVar7 + 0x10) <= pdVar19) {
            func_0x007a11c0(&UNK_008b54a9,0x2b,&UNK_009f25f8);
            goto code_r0x005d4b7c;
          }
          lVar6 = *(long *)(lVar7 + 8);
          if (*(int *)(puVar5 + -0xec) == (int)unaff_x27) {
            lVar6 = lVar6 + (long)unaff_x25 * 0x18;
            uVar2 = *(uint *)(lVar6 + 0x10);
            uVar3 = *(uint *)(lVar6 + 0x14);
            *(int *)(lVar6 + 0x10) = iVar20;
            *(int *)(lVar6 + 0x14) = iVar20;
            plVar16 = *(long **)(lVar7 + 0x18);
          }
          else {
            lVar12 = lVar6 + (*(ulong *)(puVar5 + -0x108) & 0xffffffff) * 0x18;
            uVar2 = *(uint *)(lVar12 + 0x10);
            lVar6 = lVar6 + (long)unaff_x25 * 0x18;
            uVar3 = *(uint *)(lVar6 + 0x14);
            *(int *)(lVar12 + 0x10) = iVar20;
            *(int *)(lVar6 + 0x14) = iVar20;
            plVar16 = *(long **)(lVar7 + 0x18);
          }
          unaff_x24 = (ulong)uVar3;
          unaff_x28 = (ulong)uVar2;
          if (unaff_x26 == (dword *)plVar16) {
            func_0x005bd21c(lVar7 + 0x18,&UNK_009f25e0);
          }
          uVar13 = *(ulong *)(puVar5 + -0x108);
          puVar1 = (uint *)(*(long *)(lVar7 + 0x20) + (long)unaff_x26 * 0x10);
          *puVar1 = uVar2;
          puVar1[1] = uVar3;
          *(ulong *)(puVar1 + 2) = uVar13 | (long)unaff_x27 << 0x20;
          *(undefined1 **)(lVar7 + 0x28) = (undefined1 *)((long)unaff_x26 + 1);
          lVar6 = **(long **)(unaff_x23 + 0x60);
          **(long **)(unaff_x23 + 0x60) = lVar6 + 1;
          if (lVar6 < 0) goto code_r0x005d4b0c;
          plVar16 = *(long **)(unaff_x23 + 0x60);
          pcVar21 = (code *)&UNK_005d48b0;
          puVar5 = puVar5 + -0x160;
          goto LAB_005d4284;
        }
        if (lVar6 == 0x13) goto code_r0x005d4714;
      }
      cVar22 = (char)in_xzr;
      unaff_x23 = unaff_x23 + 0x108;
      unaff_x22 = unaff_x22 + 1;
      if (unaff_x23 == *(long *)(puVar5 + -0x100)) goto LAB_005d4a88;
      goto LAB_005d43b4;
    }
  }
  func_0x007a05dc();
code_r0x005d4b7c:
                    /* WARNING: Does not return */
  pcVar21 = (code *)SoftwareBreakpoint(1,0x5d4b80);
  (*pcVar21)();
code_r0x005d4714:
  puVar14 = (undefined8 *)(unaff_x23 + 0x60);
  plVar16 = (long *)*puVar14;
code_r0x005d471c:
  unaff_x20 = 1;
  lVar6 = *plVar16;
  *plVar16 = lVar6 + 1;
  if (lVar6 < 0) {
code_r0x005d4b0c:
    func_0x007a05dc();
    goto code_r0x005d4b7c;
  }
  plVar16 = (long *)*puVar14;
  pcVar21 = (code *)&UNK_005d4734;
  puVar5 = puVar5 + -0x160;
  goto LAB_005d4284;
}

