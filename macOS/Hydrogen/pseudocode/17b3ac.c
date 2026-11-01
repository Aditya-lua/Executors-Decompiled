
/* WARNING: Removing unreachable block (ram,0x0017a80c) */
/* WARNING: Removing unreachable block (ram,0x0017a8b0) */
/* WARNING: Removing unreachable block (ram,0x0017a814) */
/* WARNING: Removing unreachable block (ram,0x0017a82c) */
/* WARNING: Removing unreachable block (ram,0x0017a834) */
/* WARNING: Removing unreachable block (ram,0x0017a84c) */
/* WARNING: Removing unreachable block (ram,0x0017a858) */

long * FUN_0017b3ac(undefined8 *param_1,long param_2,ulong param_3)

{
  ushort *puVar1;
  code *pcVar2;
  undefined8 uVar3;
  ulong uVar4;
  code *pcVar5;
  int iVar6;
  uint uVar7;
  undefined8 uVar8;
  int *piVar9;
  undefined8 uVar10;
  ulong *puVar11;
  ulong uVar12;
  ulong uVar13;
  ulong uVar14;
  undefined8 *puVar15;
  long lVar16;
  long *plVar17;
  long *plVar18;
  long lVar19;
  undefined *puVar20;
  undefined8 *puVar21;
  ulong uVar22;
  ulong uVar23;
  ulong uVar24;
  undefined1 auVar25 [16];
  undefined1 uStack0000000000000008;
  undefined8 uStack_1a8;
  long ****pppplStack_1a0;
  undefined *puStack_198;
  ulong uStack_188;
  uint uStack_17c;
  ulong uStack_178;
  int aiStack_170 [2];
  ulong uStack_168;
  ulong uStack_158;
  ulong uStack_150;
  ulong uStack_148;
  long ***ppplStack_f0;
  undefined *puStack_e8;
  ulong uStack_d8;
  code *pcStack_d0;
  undefined *puStack_c8;
  undefined8 uStack_c0;
  ulong uStack_b8;
  long lStack_b0;
  undefined8 uStack_a8;
  long **pplStack_a0;
  undefined *puStack_98;
  undefined1 uStack_81;
  long lStack_80;
  undefined8 *puStack_78;
  long *plStack_70;
  undefined *puStack_68;
  long lStack_58;
  ulong uStack_50;
  ulong uStack_48;
  code *pcStack_40;
  undefined *puStack_38;
  undefined8 uStack_30;
  ulong uStack_28;
  long lStack_20;
  undefined8 *puStack_18;
  long alStack_10 [2];
  
  if (param_3 != 0) {
    pcVar5 = *(code **)*param_1;
    uVar8 = ((undefined8 *)*param_1)[1];
    puVar20 = &UNK_009beb98;
    do {
      while( true ) {
        _uStack0000000000000008 = 0;
        uVar7 = (*pcVar5)(uVar8,param_2,param_3,&uStack0000000000000008);
        if (uVar7 != 0) break;
        if (_uStack0000000000000008 == 0) {
LAB_0017b434:
          uVar12 = param_1[1];
          if ((uVar12 & 3) == 1) {
            uVar8 = *(undefined8 *)(uVar12 - 1);
            puVar15 = *(undefined8 **)(uVar12 + 7);
            if ((code *)*puVar15 != (code *)0x0) {
              (*(code *)*puVar15)(uVar8);
            }
            if (puVar15[1] != 0) {
              func_0x00187bd4(uVar8,puVar15[1],puVar15[2]);
            }
            func_0x00187bd4((undefined8 *)(uVar12 - 1),0x18,8);
          }
          param_1[1] = puVar20;
          return (long *)((long)&MACH_HEADER.magic + 1);
        }
        uVar12 = param_3 - _uStack0000000000000008;
        if (param_3 < _uStack0000000000000008) {
          uVar8 = func_0x007a28a4(_uStack0000000000000008,param_3,&UNK_009bebb0);
          if (*(long *)(pcVar5 + 8) != 0) {
            func_0x00187bd4(param_3,*(long *)(pcVar5 + 8),*(undefined8 *)(pcVar5 + 0x10));
          }
          uVar12 = 8;
          func_0x00187bd4(param_2,0x18);
          param_1[1] = &UNK_009beb98;
          auVar25 = __Unwind_Resume(uVar8);
          lVar16 = auVar25._8_8_;
          puVar15 = auVar25._0_8_;
          puStack_38 = &UNK_009beb98;
          alStack_10[1] = 0x17b4e8;
          if (uVar12 == 0) {
            return (long *)0x0;
          }
          pcVar2 = *(code **)*puVar15;
          uVar10 = ((undefined8 *)*puVar15)[1];
          puVar20 = &UNK_009beb98;
          pcStack_40 = pcVar5;
          uStack_30 = uVar8;
          uStack_28 = param_3;
          lStack_20 = param_2;
          puStack_18 = param_1;
          alStack_10[0] = (long)register0x00000008 + 0x40;
          goto LAB_0017b530;
        }
        param_2 = param_2 + _uStack0000000000000008;
        param_3 = uVar12;
        if (uVar12 == 0) {
          return (long *)0x0;
        }
      }
      if (uVar7 != 4) {
        puVar20 = (undefined *)((ulong)uVar7 << 0x20 | 2);
        goto LAB_0017b434;
      }
    } while (param_3 != 0);
  }
  return (long *)0x0;
LAB_0017b530:
  uStack_48 = 0;
  lStack_58 = lVar16;
  uStack_50 = uVar12;
  uVar7 = (*pcVar2)(uVar10,&lStack_58,1,&uStack_48);
  if (uVar7 == 0) {
    if (uStack_48 == 0) goto LAB_0017b57c;
    if (uVar12 < uStack_48) {
      uVar8 = func_0x007a28a4(uStack_48,uVar12,&UNK_009bebb0);
      if (*(long *)(pcVar2 + 8) != 0) {
        func_0x00187bd4(uVar12,*(long *)(pcVar2 + 8),*(undefined8 *)(pcVar2 + 0x10));
      }
      uVar13 = 8;
      func_0x00187bd4(lVar16,0x18);
      puVar15[1] = &UNK_009beb98;
      piVar9 = (int *)__Unwind_Resume(uVar8);
      puStack_68 = &DAT_0017b630;
      pplStack_a0 = &plStack_70;
      if (*(long *)(piVar9 + 0x10) == 0) {
        return (long *)0x0;
      }
      *(long *)(piVar9 + 0x10) = *(long *)(piVar9 + 0x10) + -1;
      lStack_80 = lVar16;
      puStack_78 = puVar15;
      plStack_70 = alStack_10;
      if (*piVar9 != 1) {
        uVar10 = func_0x007a23bc(&UNK_009beb80);
        func_0x007a200c(&uStack_81);
        __Unwind_Resume(uVar10);
        auVar25 = func_0x007a2668();
        lVar19 = auVar25._8_8_;
        puStack_c8 = &UNK_009beb98;
        puStack_98 = &DAT_0017b768;
        if (uVar13 == 0) {
          return (long *)0x0;
        }
        pcVar5 = (code *)*auVar25._0_8_;
        uVar3 = auVar25._0_8_[1];
        pcStack_d0 = pcVar2;
        uStack_c0 = uVar8;
        uStack_b8 = uVar12;
        lStack_b0 = lVar16;
        uStack_a8 = uVar10;
        goto code_r0x0017b7a0;
      }
      plVar17 = *(long **)(piVar9 + 2);
      if (plVar17 != (long *)0x0) {
        lVar16 = *(long *)(piVar9 + 4);
        uVar12 = *(ulong *)(piVar9 + 6);
        if (*(ushort *)((long)plVar17 + 0x37a) <= uVar12) goto code_r0x0017b6b4;
        goto code_r0x0017b674;
      }
      plVar17 = *(long **)(piVar9 + 4);
      for (lVar16 = *(long *)(piVar9 + 6); lVar16 != 0; lVar16 = lVar16 + -1) {
        plVar17 = (long *)plVar17[0x70];
      }
      uVar12 = 0;
      lVar16 = 0;
      piVar9[0] = 1;
      piVar9[1] = 0;
      *(long **)(piVar9 + 2) = plVar17;
      piVar9[4] = 0;
      piVar9[5] = 0;
      piVar9[6] = 0;
      piVar9[7] = 0;
      if (*(short *)((long)plVar17 + 0x37a) == 0) {
code_r0x0017b6b4:
        do {
          plVar18 = (long *)*plVar17;
          if (plVar18 == (long *)0x0) {
            func_0x007a23bc(&UNK_009bec78);
                    /* WARNING: Does not return */
            pcVar5 = (code *)SoftwareBreakpoint(1,0x17b744);
            (*pcVar5)();
          }
          lVar16 = lVar16 + 1;
          puVar1 = (ushort *)(plVar17 + 0x6f);
          uVar12 = (ulong)*puVar1;
          plVar17 = plVar18;
        } while (*(ushort *)((long)plVar18 + 0x37a) <= *puVar1);
      }
      else {
code_r0x0017b674:
        plVar18 = plVar17;
      }
      lVar19 = uVar12 + 1;
      if (lVar16 == 0) {
        plVar17 = plVar18;
      }
      else {
        plVar17 = plVar18 + lVar19;
        do {
          plVar17 = (long *)plVar17[0x70];
          lVar16 = lVar16 + -1;
        } while (lVar16 != 0);
        lVar19 = 0;
      }
      *(long **)(piVar9 + 2) = plVar17;
      piVar9[4] = 0;
      piVar9[5] = 0;
      *(long *)(piVar9 + 6) = lVar19;
      return plVar18 + uVar12 * 3 + 1;
    }
    lVar16 = lVar16 + uStack_48;
    uVar12 = uVar12 - uStack_48;
  }
  else if (uVar7 != 4) {
    puVar20 = (undefined *)((ulong)uVar7 << 0x20 | 2);
LAB_0017b57c:
    uVar12 = puVar15[1];
    if ((uVar12 & 3) == 1) {
      uVar8 = *(undefined8 *)(uVar12 - 1);
      puVar21 = *(undefined8 **)(uVar12 + 7);
      if ((code *)*puVar21 != (code *)0x0) {
        (*(code *)*puVar21)(uVar8);
      }
      if (puVar21[1] != 0) {
        func_0x00187bd4(uVar8,puVar21[1],puVar21[2]);
      }
      func_0x00187bd4((undefined8 *)(uVar12 - 1),0x18,8);
    }
    puVar15[1] = puVar20;
    return (long *)((long)&MACH_HEADER.magic + 1);
  }
  if (uVar12 == 0) {
    return (long *)0x0;
  }
  goto LAB_0017b530;
code_r0x0017b7a0:
  uStack_d8 = 0;
  uVar7 = (*pcVar5)(uVar3,lVar19,uVar13);
  uVar12 = uVar13;
  if (uVar7 != 4) {
    if (uVar7 != 0) {
      return (long *)((ulong)uVar7 << 0x20 | 2);
    }
    if (uStack_d8 == 0) {
      return (long *)&UNK_009beb08;
    }
    uVar12 = uVar13 - uStack_d8;
    if (uVar13 < uStack_d8) {
      auVar25 = func_0x007a28a4(uStack_d8,uVar13,&UNK_009beb20);
      puVar11 = auVar25._8_8_;
      puVar15 = auVar25._0_8_;
      puStack_e8 = &DAT_0017b81c;
      uStack_188 = puVar11[2];
      uVar12 = *puVar11;
      uStack_17c = 1;
      uStack_178 = 0x2000;
      ppplStack_f0 = &pplStack_a0;
      if (uVar12 - uStack_188 < 0x20) {
        auVar25 = func_0x0017a660(*puVar15,puVar15[1],puVar11);
        if ((auVar25._0_8_ & 1) != 0) goto code_r0x0017aa2c;
        if (auVar25._8_8_ == 0) {
          return (long *)0x0;
        }
        uVar13 = puVar11[2];
        uVar22 = *puVar11;
      }
      else {
        uVar22 = uVar12;
        uVar13 = uStack_188;
      }
      lVar16 = 0;
      pcVar5 = (code *)*puVar15;
      uVar8 = puVar15[1];
      goto code_r0x0017a8d4;
    }
    lVar19 = lVar19 + uStack_d8;
  }
  uVar13 = uVar12;
  if (uVar12 == 0) {
    return (long *)0x0;
  }
  goto code_r0x0017b7a0;
code_r0x0017a8d4:
  uVar23 = uVar22;
  if ((uVar13 == uVar22) && (uVar22 == uVar12)) {
    auVar25 = func_0x0017a660(pcVar5,uVar8,puVar11);
    if ((auVar25._0_8_ & 1) != 0) goto code_r0x0017aa2c;
    uVar13 = puVar11[2];
    if (auVar25._8_8_ == 0) {
      return (long *)0x0;
    }
    uVar23 = *puVar11;
  }
  uVar22 = uVar23;
  if (uVar13 == uVar23) {
    uVar22 = uVar23 + 0x20;
    if (uVar23 + 0x20 <= uVar23 * 2) {
      uVar22 = uVar23 * 2;
    }
    if ((long)uVar22 < 0) {
code_r0x0017aa2c:
      return (long *)((long)&MACH_HEADER.magic + 1);
    }
    if (uVar23 != 0) {
      uStack_158 = puVar11[1];
      uStack_148 = uVar23;
    }
    uStack_150 = (ulong)(uVar23 != 0);
    func_0x0079a108(aiStack_170,1,uVar22,&uStack_158);
    if (aiStack_170[0] == 1) goto code_r0x0017aa2c;
    *puVar11 = uVar22;
    puVar11[1] = uStack_168;
  }
  uVar14 = puVar11[1];
  uVar24 = uVar22 - uVar13;
  uVar23 = uStack_178;
  if (uVar24 <= uStack_178) {
    uVar23 = uVar24;
  }
  _bzero(uVar14 + uVar13 + lVar16,uVar23 - lVar16);
  while( true ) {
    uStack_158 = 0;
    iVar6 = (*pcVar5)(uVar8,uVar14 + uVar13,uVar23,&uStack_158);
    if (iVar6 == 0) break;
    if (iVar6 != 4) {
      puVar11[2] = uVar13;
      goto code_r0x0017aa2c;
    }
  }
  lVar16 = uVar23 - uStack_158;
  if (uVar23 < uStack_158) {
    puVar20 = &UNK_009beb50;
    auVar25 = func_0x007a247c(&UNK_008175b6,0x29);
    puStack_198 = &DAT_0017aa78;
    puVar15 = (undefined8 *)(auVar25._8_8_ + -0x10);
    lVar16 = (long)puVar20 << 4;
    uVar8 = 1;
    goto code_r0x0017aa90;
  }
  uVar13 = uVar13 + uStack_158;
  puVar11[2] = uVar13;
  if (uStack_158 == 0) {
    return (long *)0x0;
  }
  if ((uStack_17c & 1) != 0) {
    uVar14 = uStack_178 << 1;
    if ((long)uStack_178 < 0) {
      uVar14 = 0xffffffffffffffff;
    }
    uVar4 = uStack_178;
    if (uVar23 == uStack_158) {
      uVar4 = uVar14;
    }
    if (uStack_178 <= uVar24) {
      uStack_178 = uVar4;
    }
  }
  goto code_r0x0017a8d4;
  while( true ) {
    lVar19 = puVar15[3];
    puVar15 = puVar15 + 2;
    lVar16 = lVar16 + -0x10;
    if (lVar19 != 0) break;
code_r0x0017aa90:
    if (lVar16 == 0) {
      lVar19 = 0;
      goto code_r0x0017aab0;
    }
  }
  uVar8 = *puVar15;
code_r0x0017aab0:
  uStack_1a8 = 0;
  pppplStack_1a0 = &ppplStack_f0;
  iVar6 = (*(code *)*auVar25._0_8_)(auVar25._0_8_[1],uVar8,lVar19,&uStack_1a8);
  return (long *)(ulong)(iVar6 != 0);
}

