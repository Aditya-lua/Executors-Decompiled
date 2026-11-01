
long FUN_00503c0c(long param_1)

{
  long *******ppppppplVar1;
  long *****ppppplVar2;
  long ******pppppplVar3;
  uint uVar4;
  uint uVar5;
  code *pcVar6;
  bool bVar7;
  int iVar8;
  long *******ppppppplVar9;
  undefined1 *puVar10;
  ulong uVar11;
  ulong uVar12;
  long lVar13;
  long lVar14;
  undefined *puVar15;
  long lVar16;
  long ******pppppplVar17;
  undefined8 *puVar18;
  long lVar19;
  ulong unaff_x21;
  long unaff_x22;
  undefined8 uVar20;
  long unaff_x23;
  long lVar21;
  long ******pppppplVar22;
  long unaff_x28;
  long lVar23;
  undefined1 auVar24 [16];
  undefined1 auVar25 [16];
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000058;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000068;
  undefined8 in_stack_00000098;
  undefined8 in_stack_000001c0;
  undefined8 in_stack_000001c8;
  undefined8 in_stack_000001d0;
  undefined8 in_stack_000001d8;
  undefined8 in_stack_000001e0;
  long in_stack_000001f8;
  long in_stack_00000200;
  long in_stack_00000208;
  long in_stack_00000210;
  undefined1 auStack_7ffffffe [2147483270];
  long ******pppppplStack_178;
  undefined1 *puStack_170;
  long ******pppppplStack_168;
  long *****ppppplStack_160;
  long lStack_158;
  ulong uStack_150;
  long *****ppppplStack_148;
  long lStack_140;
  ulong uStack_138;
  undefined8 uStack_130;
  undefined8 uStack_128;
  undefined8 uStack_120;
  long ******pppppplStack_118;
  long ******pppppplStack_110;
  undefined8 uStack_108;
  undefined8 uStack_100;
  undefined8 uStack_f8;
  long *******ppppppplStack_f0;
  ulong uStack_e8;
  long *****ppppplStack_e0;
  long lStack_d8;
  ulong uStack_d0;
  long ******pppppplStack_c8;
  undefined *puStack_c0;
  long *******ppppppplStack_b8;
  undefined8 uStack_b0;
  undefined8 uStack_a8;
  long *******ppppppplStack_98;
  undefined *puStack_90;
  long *******ppppppplStack_88;
  undefined *puStack_80;
  long *****ppppplStack_78;
  undefined *puStack_70;
  
  if (param_1 != 0) {
    func_0x00187bd4(in_stack_000001c0,in_stack_00000040,8);
  }
  if (in_stack_000001f8 != 0) {
    func_0x00187bd4(in_stack_000001c8,in_stack_00000048,8);
  }
  if (in_stack_00000200 != 0) {
    func_0x00187bd4(in_stack_000001d0,in_stack_00000058,8);
  }
  if (in_stack_00000208 != 0) {
    func_0x00187bd4(in_stack_000001d8,in_stack_00000060,8);
  }
  if (in_stack_00000210 != 0) {
    func_0x00187bd4(in_stack_000001e0,in_stack_00000068,8);
  }
  if (unaff_x28 != 0) {
    func_0x00187bd4();
  }
  if (unaff_x22 != 0) {
    func_0x00187bd4();
  }
  func_0x004fe24c(auStack_7ffffffe + 0x800010ee);
  if ((unaff_x21 | 0x8000000000000000) != 0x8000000000000000) {
    func_0x00187bd4(in_stack_00000098);
  }
  if ((*(ulong *)(unaff_x23 + 0xb30) | 0x8000000000000000) == 0x8000000000000000) {
    __Unwind_Resume();
  }
  lVar14 = 1;
  func_0x00187bd4(*(undefined8 *)(unaff_x23 + 0xb38));
  __Unwind_Resume();
  auVar24 = func_0x007a2668();
  ppppppplVar9 = auVar24._0_8_;
  puVar10 = (undefined1 *)func_0x00187bd0(1,1);
  if (puVar10 == (undefined1 *)0x0) {
    auVar25 = func_0x007a1f00(1,1,&UNK_009e8960);
  }
  else {
    *puVar10 = 0x20;
    pppppplStack_178 = (long ******)0x1;
    pppppplStack_168 = (long ******)0x1;
    uVar4 = *(uint *)((long)ppppppplVar9 + 700);
    puStack_170 = puVar10;
    if (((uVar4 >> 0xc & 1) != 0) ||
       (((ulong)ppppppplVar9[0x58] & 0x3000) != 0 || (uVar4 & 0x2000) != 0)) {
      pppppplVar17 = ppppppplVar9[0x18];
joined_r0x00504104:
      if (pppppplVar17 != (long ******)0x0) {
        lVar21 = 0;
        uVar5 = *(uint *)(ppppppplVar9 + 0x58);
        pppppplVar22 = ppppppplVar9[0x17];
        do {
          if (*(long *)((long)pppppplVar22 + lVar21 + 0x238) == lVar14) {
            uVar20 = *(undefined8 *)((long)pppppplVar22 + lVar21 + 0x230);
            iVar8 = _memcmp(uVar20,auVar24._8_8_,lVar14);
            if (iVar8 == 0) {
              ppppplStack_160 = (long *****)0x0;
              lStack_158 = 1;
              uStack_150 = 0;
              if (lVar14 != 0) {
                func_0x007a5594(&ppppplStack_160,0,lVar14,1,1);
              }
              uVar11 = uStack_150;
              lVar19 = (long)pppppplVar22 + lVar21;
              _memcpy(lStack_158 + uStack_150,uVar20,lVar14);
              uStack_150 = uVar11 + lVar14;
              if (*(long ******)(lVar19 + 0x240) == (long *****)0x0) {
                iVar8 = *(int *)((long)pppppplVar22 + lVar21 + 0x2b8);
                if (iVar8 != 0x110000) {
LAB_00504120:
                  ppppplStack_e0 = (long *****)CONCAT44(ppppplStack_e0._4_4_,iVar8);
                  pppppplStack_c8 = &ppppplStack_e0;
                  puStack_c0 = &
                               __ZN43__LT_char_u20_as_u20_core__fmt__Display_GT_3fmt17ha5099e7a97893038E
                  ;
                  ppppppplStack_98 = (long *******)&UNK_009e8a88;
                  puStack_90 = (undefined *)0x1;
                  puStack_80 = (undefined *)0x1;
                  ppppplStack_78 = (long *****)0x0;
                  ppppppplStack_88 = &pppppplStack_c8;
                  iVar8 = func_0x0046849c(&ppppplStack_160,&UNK_009e88b0,&ppppppplStack_98);
                  if (iVar8 != 0) {
                    puVar15 = &UNK_009e8a98;
                    goto LAB_00504534;
                  }
                  goto LAB_00504168;
                }
              }
              else {
                lStack_d8 = *(long *)((long)pppppplVar22 + lVar21 + 0x248);
                pppppplStack_c8 = &ppppplStack_e0;
                puStack_c0 = &DAT_00519924;
                ppppppplStack_98 = (long *******)&UNK_009e8a60;
                puStack_90 = (undefined *)0x1;
                puStack_80 = (undefined *)0x1;
                ppppplStack_78 = (long *****)0x0;
                ppppppplStack_88 = &pppppplStack_c8;
                ppppplStack_e0 = *(long ******)(lVar19 + 0x240);
                uVar11 = func_0x0046849c(&ppppplStack_160,&UNK_009e88b0,&ppppppplStack_98);
                if ((uVar11 & 1) != 0) {
                  puVar15 = &UNK_009e8a70;
LAB_00504534:
                  func_0x007a2810(&UNK_008a4476,0x2b,&ppppppplStack_98,&UNK_009e8910,puVar15);
                  goto LAB_00504574;
                }
                iVar8 = *(int *)((long)pppppplVar22 + lVar21 + 0x2b8);
                if (iVar8 != 0x110000) goto LAB_00504120;
LAB_00504168:
                pppppplStack_c8 = &ppppplStack_160;
                puStack_c0 = &DAT_004fe494;
                ppppppplStack_98 = (long *******)&UNK_009e8ab0;
                puStack_90 = (undefined *)0x2;
                ppppppplStack_88 = &pppppplStack_c8;
                puStack_80 = (undefined *)0x1;
                ppppplStack_78 = (long *****)0x0;
                func_0x00459f08(&ppppplStack_148,&ppppppplStack_98);
                if (ppppplStack_160 != (long *****)0x0) {
                  func_0x00187bd4(lStack_158,ppppplStack_160,1);
                }
                lStack_158 = lStack_140;
                ppppplStack_160 = ppppplStack_148;
                uStack_150 = uStack_138;
              }
              if (ppppppplVar9[0x25] == (long ******)0x8000000000000000) {
                lVar13 = *(long *)((long)pppppplVar22 + lVar21 + 0x1e8);
                ppppplVar2 = ppppplStack_160;
                lVar14 = lStack_158;
                uVar11 = uStack_150;
              }
              else {
                ppppppplStack_98 = (long *******)&ppppppplStack_f0;
                puStack_90 = &DAT_00510bfc;
                ppppppplStack_88 = &pppppplStack_178;
                puStack_80 = &DAT_004fe494;
                ppppplStack_78 = (long *****)&ppppplStack_160;
                puStack_70 = &DAT_004fe494;
                pppppplStack_c8 = (long ******)&UNK_008a45e0;
                puStack_c0 = (undefined *)0x3;
                uStack_b0 = 3;
                uStack_a8 = 0;
                ppppppplStack_b8 = (long *******)&ppppppplStack_98;
                ppppppplStack_f0 = ppppppplVar9 + 0x25;
                func_0x00459f08(&ppppplStack_e0,&pppppplStack_c8);
                uVar11 = uStack_d0;
                lVar14 = lStack_d8;
                ppppplVar2 = ppppplStack_e0;
                if (ppppplStack_e0 == (long *****)0x8000000000000000) {
                  lVar13 = *(long *)((long)pppppplVar22 + lVar21 + 0x1e8);
                  ppppplVar2 = ppppplStack_160;
                  lVar14 = lStack_158;
                  uVar11 = uStack_150;
                }
                else {
                  if (ppppplStack_160 != (long *****)0x0) {
                    func_0x00187bd4(lStack_158,ppppplStack_160,1);
                  }
                  lVar13 = *(long *)((long)pppppplVar22 + lVar21 + 0x1e8);
                }
              }
              if ((lVar13 != -0x8000000000000000) && (lVar13 != 0)) {
                func_0x00187bd4(*(undefined8 *)((long)pppppplVar22 + lVar21 + 0x1f0),lVar13,1);
              }
              *(long ******)((long)pppppplVar22 + lVar21 + 0x1e8) = ppppplVar2;
              *(long *)((long)pppppplVar22 + lVar21 + 0x1f0) = lVar14;
              *(ulong *)((long)pppppplVar22 + lVar21 + 0x1f8) = uVar11;
              bVar7 = ppppppplVar9[0x25] != (long ******)0x8000000000000000;
              if (bVar7) {
                pppppplStack_118 = ppppppplVar9[0x26];
                pppppplStack_110 = ppppppplVar9[0x27];
                ppppppplStack_f0 = (long *******)&UNK_008a45d6;
              }
              else {
                pppppplStack_110 = (long ******)0x0;
                pppppplStack_118 = (long ******)0x1;
                ppppppplStack_f0 = (long *******)((long)&MACH_HEADER.magic + 1);
              }
              uStack_e8 = (ulong)bVar7;
              ppppplStack_e0 = *(long ******)(lVar19 + 0x230);
              lStack_d8 = *(long *)(lVar19 + 0x238);
              ppppppplStack_98 = &pppppplStack_118;
              puStack_90 = &DAT_00519924;
              ppppppplStack_88 = (long *******)&ppppppplStack_f0;
              puStack_80 = &DAT_00519924;
              ppppplStack_78 = (long *****)&ppppplStack_e0;
              puStack_70 = &DAT_00519924;
              pppppplStack_c8 = (long ******)&UNK_008a45e0;
              puStack_c0 = (undefined *)0x3;
              uStack_b0 = 3;
              uStack_a8 = 0;
              ppppppplStack_b8 = (long *******)&ppppppplStack_98;
              func_0x00459f08(&uStack_130,&pppppplStack_c8);
              lVar14 = *(long *)((long)pppppplVar22 + lVar21 + 0x128);
              if ((lVar14 != -0x8000000000000000) && (lVar14 != 0)) {
                func_0x00187bd4(*(undefined8 *)((long)pppppplVar22 + lVar21 + 0x130),lVar14,1);
              }
              *(undefined8 *)((long)pppppplVar22 + lVar21 + 0x130) = uStack_128;
              *(undefined8 *)((long)pppppplVar22 + lVar21 + 0x128) = uStack_130;
              *(undefined8 *)((long)pppppplVar22 + lVar21 + 0x138) = uStack_120;
              if (*(long *)((long)pppppplVar22 + lVar21 + 0x110) == -0x8000000000000000) {
                pppppplVar17 = ppppppplVar9[0x22];
                if (((uVar4 | uVar5) >> 0xb & 1) == 0) {
                  ppppppplVar1 = ppppppplVar9 + 0x47;
                  if (pppppplVar17 != (long ******)0x8000000000000000) {
                    ppppppplVar1 = ppppppplVar9 + 0x24;
                  }
                  pppppplStack_110 = *ppppppplVar1;
                  ppppppplVar1 = ppppppplVar9 + 0x46;
                  if (pppppplVar17 != (long ******)0x8000000000000000) {
                    ppppppplVar1 = ppppppplVar9 + 0x23;
                  }
                  pppppplStack_118 = *ppppppplVar1;
LAB_00504400:
                  uStack_e8 = (ulong)(pppppplStack_110 != (long ******)0x0);
                  ppppppplStack_f0 = (long *******)&UNK_008a4610;
                  if (pppppplStack_110 == (long ******)0x0) {
                    ppppppplStack_f0 = (long *******)((long)&MACH_HEADER.magic + 1);
                  }
                }
                else {
                  if (pppppplVar17 != (long ******)0x8000000000000000) {
                    pppppplStack_118 = ppppppplVar9[0x23];
                    pppppplStack_110 = ppppppplVar9[0x24];
                    goto LAB_00504400;
                  }
                  uStack_e8 = 0;
                  ppppppplStack_f0 = (long *******)((long)&MACH_HEADER.magic + 1);
                  pppppplStack_118 = (long ******)0x1;
                  pppppplStack_110 = (long ******)0x0;
                }
                ppppplStack_e0 = *(long ******)(lVar19 + 0x230);
                lStack_d8 = *(long *)(lVar19 + 0x238);
                ppppppplStack_98 = &pppppplStack_118;
                puStack_90 = &DAT_00519924;
                ppppppplStack_88 = (long *******)&ppppppplStack_f0;
                puStack_80 = &DAT_00519924;
                ppppplStack_78 = (long *****)&ppppplStack_e0;
                puStack_70 = &DAT_00519924;
                pppppplStack_c8 = (long ******)&UNK_008a45e0;
                puStack_c0 = (undefined *)0x3;
                uStack_b0 = 3;
                uStack_a8 = 0;
                ppppppplStack_b8 = (long *******)&ppppppplStack_98;
                func_0x00459f08(&uStack_108,&pppppplStack_c8);
                lVar14 = *(long *)((long)pppppplVar22 + lVar21 + 0x110);
                if ((lVar14 != -0x8000000000000000) && (lVar14 != 0)) {
                  func_0x00187bd4(*(undefined8 *)((long)pppppplVar22 + lVar21 + 0x118),lVar14,1);
                }
                *(undefined8 *)((long)pppppplVar22 + lVar21 + 0x118) = uStack_100;
                *(undefined8 *)((long)pppppplVar22 + lVar21 + 0x110) = uStack_108;
                *(undefined8 *)((long)pppppplVar22 + lVar21 + 0x120) = uStack_f8;
              }
              func_0x00500450(lVar19,0);
              goto LAB_005044a0;
            }
          }
          lVar21 = lVar21 + 0x2c8;
        } while ((long)pppppplVar17 * 0x2c8 != lVar21);
      }
      lVar19 = 0;
LAB_005044a0:
      if (pppppplStack_178 != (long ******)0x0) {
        func_0x00187bd4(puStack_170,pppppplStack_178,1);
      }
      return lVar19;
    }
    lVar19 = (long)ppppppplVar9[0x1e] << 4;
    pppppplVar17 = (long ******)0xffffffffffffffff;
    lVar21 = 0;
    pppppplVar22 = ppppppplVar9[0x1d];
    do {
      lVar13 = lVar21;
      if (lVar19 == 0) {
        puVar15 = (undefined *)0x0;
        goto LAB_00503f30;
      }
      ppppplVar2 = *pppppplVar22;
      pppppplVar3 = pppppplVar22 + 1;
      pppppplVar17 = (long ******)((long)pppppplVar17 + 1);
      lVar19 = lVar19 + -0x10;
      lVar21 = lVar13 + 0x20;
      pppppplVar22 = pppppplVar22 + 2;
    } while (ppppplVar2 != (long *****)0x1414db8803bc16e0 ||
             *pppppplVar3 != (long *****)0x4f7557bbe08e4383);
    auVar25._8_8_ = ppppppplVar9[0x21];
    auVar25._0_8_ = pppppplVar17;
    if (pppppplVar17 < ppppppplVar9[0x21]) {
      lVar21 = *(long *)((long)ppppppplVar9[0x20] + lVar13 + 8);
      puVar15 = (undefined *)
                (*(long *)((long)ppppppplVar9[0x20] + lVar13) +
                 (*(long *)(lVar21 + 0x10) - 1U & 0xfffffffffffffff0) + 0x10);
      auVar25 = (**(code **)(lVar21 + 0x18))(puVar15);
      if (auVar25._0_8_ == 0x1414db8803bc16e0 && auVar25._8_8_ == 0x4f7557bbe08e4383) {
LAB_00503f30:
        puStack_90 = &UNK_008a7b62;
        if (puVar15 != (undefined *)0x0) {
          puStack_90 = puVar15;
        }
        ppppppplStack_88 = (long *******)0x0;
        ppppppplStack_98 = ppppppplVar9;
        func_0x00528b6c(&ppppplStack_160,&ppppppplStack_98,8,0,0,1);
        uVar11 = uStack_150;
        lVar21 = lStack_158;
        if (uStack_150 != 0) {
          lVar23 = lStack_158 + uStack_150 * 0x18;
          lVar19 = lStack_158 + 0x18;
          lVar13 = lStack_158;
          do {
            lVar16 = lVar19;
            ppppplStack_e0 = (long *****)0x0;
            lStack_d8 = 1;
            uStack_d0 = 0;
            ppppppplStack_b8 = (long *******)0xe0000020;
            pppppplStack_c8 = &ppppplStack_e0;
            puStack_c0 = &UNK_009e88b0;
            ppppppplStack_98 = *(long ********)(lVar13 + 8);
            puStack_90 = *(undefined **)(lVar13 + 0x10);
            ppppppplStack_88 = (long *******)CONCAT71(ppppppplStack_88._1_7_,0xc);
            while( true ) {
              auVar25 = func_0x0051110c(&ppppppplStack_98,&ppppppplStack_88);
              uVar12 = uStack_d0;
              lVar19 = lStack_d8;
              ppppplVar2 = ppppplStack_e0;
              if (auVar25._0_8_ == 0) break;
              uVar12 = func_0x0046adc0(auVar25._0_8_,auVar25._8_8_,&pppppplStack_c8);
              if ((uVar12 & 1) != 0) {
                func_0x007a2810(&UNK_008a4358,0x37,&ppppppplStack_98,&UNK_009e8910,&UNK_009e88e0);
                goto LAB_00504574;
              }
            }
            if ((ulong)((long)pppppplStack_178 - (long)pppppplStack_168) < uStack_d0) {
              func_0x007a5594(&pppppplStack_178,pppppplStack_168,uStack_d0,1,1);
            }
            pppppplVar17 = pppppplStack_168;
            _memcpy(puStack_170 + (long)pppppplStack_168,lVar19,uVar12);
            pppppplStack_168 = (long ******)((long)pppppplVar17 + uVar12);
            if (ppppplVar2 != (long *****)0x0) {
              func_0x00187bd4(lVar19,ppppplVar2,1);
            }
            pppppplVar17 = pppppplStack_168;
            if (pppppplStack_178 == pppppplStack_168) {
              func_0x007a5594(&pppppplStack_178,pppppplStack_168,1,1,1);
            }
            puStack_170[(long)pppppplStack_168] = 0x20;
            pppppplStack_168 = (long ******)((long)pppppplVar17 + 1);
            bVar7 = lVar16 != lVar23;
            lVar19 = 0;
            if (bVar7) {
              lVar19 = 0x18;
            }
            lVar19 = lVar16 + lVar19;
            lVar13 = lVar16;
          } while (bVar7);
          puVar18 = (undefined8 *)(lVar21 + 8);
          do {
            if (puVar18[-1] != 0) {
              func_0x00187bd4(*puVar18,puVar18[-1],1);
            }
            puVar18 = puVar18 + 3;
            uVar11 = uVar11 - 1;
          } while (uVar11 != 0);
        }
        if (ppppplStack_160 != (long *****)0x0) {
          func_0x00187bd4(lVar21,(long)ppppplStack_160 * 0x18,8);
        }
        uVar4 = *(uint *)((long)ppppppplVar9 + 700);
        pppppplVar17 = ppppppplVar9[0x18];
        goto joined_r0x00504104;
      }
      func_0x007a23d8(&UNK_008a6820,0x22,&UNK_009e9990);
      goto LAB_00504574;
    }
  }
  func_0x007a2570(auVar25._0_8_,auVar25._8_8_,&UNK_009e9b68);
LAB_00504574:
                    /* WARNING: Does not return */
  pcVar6 = (code *)SoftwareBreakpoint(1,0x504578);
  (*pcVar6)();
}

