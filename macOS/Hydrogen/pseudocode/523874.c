
/* WARNING: Possible PIC construction at 0x00523dfc: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004e966c: Changing call to branch */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_00523874(void)

{
  long *plVar1;
  ulong uVar2;
  undefined1 *puVar3;
  int iVar4;
  dword *pdVar5;
  long lVar6;
  ulong uVar7;
  ulong *extraout_x8;
  ulong uVar8;
  undefined8 *puVar9;
  long lVar10;
  undefined8 *puVar11;
  undefined8 *puVar12;
  long *unaff_x19;
  undefined8 *puVar13;
  ulong uVar14;
  undefined8 *unaff_x21;
  long unaff_x22;
  ulong uVar15;
  long unaff_x23;
  undefined8 uVar16;
  ulong *unaff_x24;
  code *pcVar17;
  code *pcVar18;
  long *plVar19;
  long *unaff_x29;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  undefined8 uVar25;
  undefined1 auVar26 [16];
  long in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined1 auStack_130 [8];
  ulong uStack_128;
  dword *pdStack_120;
  ulong uStack_118;
  long lStack_110;
  undefined8 uStack_108;
  undefined8 uStack_100;
  undefined8 uStack_f8;
  undefined8 uStack_f0;
  undefined8 uStack_e8;
  undefined8 uStack_e0;
  undefined8 uStack_d8;
  undefined8 uStack_d0;
  long lStack_c8;
  long lStack_c0;
  long lStack_b8;
  long lStack_b0;
  long lStack_a8;
  long lStack_a0;
  long lStack_98;
  long lStack_90;
  long lStack_88;
  long alStack_80 [4];
  undefined *puStack_8;
  
  while( true ) {
    unaff_x23 = unaff_x23 + -0x60;
    if (unaff_x23 == 0) goto LAB_00523934;
    if ((*unaff_x19 == unaff_x22) && (iVar4 = _memcmp(unaff_x19[-1]), iVar4 == 0)) break;
    unaff_x19 = unaff_x19 + 0xc;
  }
  uVar14 = unaff_x19[-2];
  uVar15 = uVar14 * 0x10;
  if (uVar14 >> 0x3c == 0 && uVar15 < 0x7ffffffffffffff9) {
    if (uVar15 == 0) {
      uVar15 = 0;
      uVar14 = 0;
      unaff_x21 = (undefined8 *)0x8;
      goto LAB_00523d68;
    }
    puVar13 = (undefined8 *)unaff_x19[-3];
    uVar16 = 8;
    unaff_x21 = (undefined8 *)func_0x00187bd0(uVar15,8);
    if (unaff_x21 != (undefined8 *)0x0) {
      uVar15 = uVar14;
      if (uVar14 == 0) goto LAB_00523938;
      uVar8 = uVar14 - 1;
      uVar7 = uVar14;
      if (uVar8 <= uVar14) {
        uVar7 = uVar8;
      }
      if (7 < uVar7) {
        uVar2 = uVar14;
        if (uVar8 <= uVar14) {
          uVar2 = uVar8;
        }
        if ((puVar13 + uVar2 * 2 + 2 <= unaff_x21) || (unaff_x21 + uVar2 * 2 + 2 <= puVar13)) {
          uVar8 = uVar7 + 1 & 3;
          uVar2 = 4;
          if (uVar8 != 0) {
            uVar2 = uVar8;
          }
          lVar10 = (uVar7 + 1) - uVar2;
          uVar7 = uVar14 - lVar10;
          puVar9 = puVar13 + lVar10 * 2;
          puVar11 = unaff_x21 + 4;
          puVar12 = puVar13 + 4;
          lVar6 = lVar10;
          do {
            uVar20 = puVar12[-3];
            uVar16 = puVar12[-2];
            uVar21 = puVar12[-1];
            uVar22 = *puVar12;
            uVar24 = puVar12[1];
            uVar23 = puVar12[2];
            uVar25 = puVar12[3];
            puVar11[-4] = puVar12[-4];
            puVar11[-3] = uVar20;
            puVar11[-2] = uVar16;
            puVar11[-1] = uVar21;
            *puVar11 = uVar22;
            puVar11[1] = uVar24;
            puVar11[2] = uVar23;
            puVar11[3] = uVar25;
            puVar11 = puVar11 + 8;
            puVar12 = puVar12 + 8;
            lVar6 = lVar6 + -4;
          } while (lVar6 != 0);
LAB_00523cd0:
          puVar11 = unaff_x21 + lVar10 * 2 + 1;
          while (puVar9 != puVar13 + uVar14 * 2) {
            uVar16 = puVar9[1];
            puVar11[-1] = *puVar9;
            *puVar11 = uVar16;
            puVar11 = puVar11 + 2;
            uVar7 = uVar7 - 1;
            puVar9 = puVar9 + 2;
            if (uVar7 == 0) break;
          }
          goto LAB_00523d68;
        }
      }
      lVar10 = 0;
      uVar7 = uVar14;
      puVar9 = puVar13;
      goto LAB_00523cd0;
    }
  }
  else {
    uVar16 = 0;
  }
  uVar16 = func_0x007a1f00(uVar16,uVar15,&UNK_009e7fc8);
  if (in_stack_00000028 == 0) {
    lVar6 = __Unwind_Resume(uVar16);
    puStack_8 = (undefined *)0x523e08;
    if (((*(uint *)(lVar6 + 0x10) & 1) != 0) && (*(long *)(lVar6 + 0x20) == 0)) goto LAB_00523ef0;
    plVar19 = (long *)&
                      __ZN12clap_builder7builder3arg3Arg16get_value_parser7DEFAULT17h30dba9b248d4334fE
    ;
    if (*(long *)(lVar6 + 0x50) != 5) {
      plVar19 = (long *)(lVar6 + 0x50);
    }
    lVar6 = *plVar19;
    if (lVar6 < 2) {
      if (lVar6 == 0) {
        auVar26 = (*_UNK_009eab10)(1);
        lVar6 = auVar26._0_8_;
      }
      else {
        auVar26 = (*_UNK_009eab50)(1);
joined_r0x00523eec:
        lVar6 = auVar26._0_8_;
      }
    }
    else if (lVar6 == 2) {
      auVar26 = (*_UNK_009eab90)(1);
      lVar6 = auVar26._0_8_;
    }
    else {
      if (lVar6 != 3) {
        auVar26 = (**(code **)(plVar19[2] + 0x30))(plVar19[1]);
        goto joined_r0x00523eec;
      }
      auVar26 = (*_UNK_009eabd0)(1);
      lVar6 = auVar26._0_8_;
    }
    if (lVar6 == 0) {
LAB_00523ef0:
      *extraout_x8 = 0;
      extraout_x8[1] = 8;
      extraout_x8[2] = 0;
      return;
    }
    puVar13 = auVar26._8_8_;
    uVar16 = auVar26._0_8_;
    puVar3 = auStack_130;
    plVar19 = alStack_80 + 0xe;
    pcVar17 = (code *)puVar13[3];
    (*pcVar17)(&lStack_110);
    if (lStack_110 == -0x8000000000000000) {
      *extraout_x8 = 0;
      extraout_x8[1] = 8;
      extraout_x8[2] = 0;
      if ((code *)*puVar13 != (code *)0x0) {
        (*(code *)*puVar13)(uVar16);
      }
      lVar6 = puVar13[1];
      if (lVar6 == 0) {
        return;
      }
      uVar20 = puVar13[2];
      puVar3 = (undefined1 *)register0x00000008;
      plVar19 = unaff_x29;
    }
    else {
      pcVar18 = (code *)puVar13[4];
      (*pcVar18)(alStack_80,uVar16);
      uVar20 = 0;
      uStack_128 = alStack_80[0] + 1;
      if (alStack_80[0] == -1) {
        uStack_128 = 0xffffffffffffffff;
      }
      if (uStack_128 < 5) {
        uStack_128 = 4;
      }
      uVar15 = uStack_128 * 0x48;
      auVar26._8_8_ = 0;
      auVar26._0_8_ = uStack_128;
      if ((SUB168(auVar26 * ZEXT816(0x48),8) != 0) || (0x7ffffffffffffff8 < uVar15)) {
code_r0x004e96a0:
        func_0x007a1f00(uVar20,uVar15,&UNK_009ea460);
                    /* WARNING: Does not return */
        pcVar17 = (code *)SoftwareBreakpoint(1,0x4e96b4);
        (*pcVar17)();
      }
      if (uVar15 == 0) {
        uStack_128 = 0;
        pdVar5 = &MACH_HEADER.cpusubtype;
      }
      else {
        uVar20 = 8;
        pdVar5 = (dword *)func_0x00187bd0(uVar15,8);
        if (pdVar5 == (dword *)0x0) goto code_r0x004e96a0;
      }
      *(undefined8 *)(pdVar5 + 10) = uStack_e8;
      *(undefined8 *)(pdVar5 + 8) = uStack_f0;
      *(undefined8 *)(pdVar5 + 0xe) = uStack_d8;
      *(undefined8 *)(pdVar5 + 0xc) = uStack_e0;
      *(undefined8 *)(pdVar5 + 0x10) = uStack_d0;
      *(undefined8 *)(pdVar5 + 2) = uStack_108;
      *(long *)pdVar5 = lStack_110;
      *(undefined8 *)(pdVar5 + 6) = uStack_f8;
      *(undefined8 *)(pdVar5 + 4) = uStack_100;
      lVar6 = 0x48;
      uStack_118 = 1;
      pdStack_120 = pdVar5;
      while( true ) {
        uVar15 = uStack_118;
        (*pcVar17)(&lStack_c8,uVar16);
        if (lStack_c8 == -0x8000000000000000) break;
        if (uVar15 == uStack_128) {
          (*pcVar18)(alStack_80,uVar16);
          lVar10 = alStack_80[0] + 1;
          if (alStack_80[0] == -1) {
            lVar10 = -1;
          }
          func_0x007a5594(&uStack_128,uVar15,lVar10,8,0x48);
          pdVar5 = pdStack_120;
        }
        plVar1 = (long *)((long)pdVar5 + lVar6);
        plVar1[1] = lStack_c0;
        *plVar1 = lStack_c8;
        plVar1[8] = lStack_88;
        plVar1[5] = lStack_a0;
        plVar1[4] = lStack_a8;
        plVar1[7] = lStack_90;
        plVar1[6] = lStack_98;
        plVar1[3] = lStack_b0;
        plVar1[2] = lStack_b8;
        uStack_118 = uVar15 + 1;
        lVar6 = lVar6 + 0x48;
      }
      if ((code *)*puVar13 != (code *)0x0) {
        (*(code *)*puVar13)(uVar16);
      }
      lVar6 = puVar13[1];
      if (lVar6 == 0) {
        extraout_x8[1] = (ulong)pdStack_120;
        *extraout_x8 = uStack_128;
        extraout_x8[2] = uStack_118;
        return;
      }
      uVar20 = puVar13[2];
      puStack_8 = &UNK_004e9670;
    }
  }
  else {
    lVar6 = in_stack_00000028 << 4;
    uVar20 = 8;
    puStack_8 = (undefined *)0x523e00;
    puVar3 = (undefined1 *)register0x00000008;
    uVar16 = in_stack_00000030;
    plVar19 = unaff_x29;
  }
  *(long **)(puVar3 + -0x10) = plVar19;
  *(undefined **)(puVar3 + -8) = puStack_8;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(uVar16,lVar6,uVar20);
  return;
LAB_00523934:
  uVar15 = 0;
LAB_00523938:
  uVar14 = 0;
LAB_00523d68:
  *unaff_x24 = uVar14;
  unaff_x24[1] = (ulong)unaff_x21;
  unaff_x24[2] = uVar15;
  return;
}

