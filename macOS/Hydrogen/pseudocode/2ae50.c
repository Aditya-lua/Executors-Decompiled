
/* WARNING: Possible PIC construction at 0x0002b634: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0002b764: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0002b7ec: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0002b91c: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0002b7f0) */
/* WARNING: Removing unreachable block (ram,0x0002b7f4) */
/* WARNING: Removing unreachable block (ram,0x0002b800) */
/* WARNING: Removing unreachable block (ram,0x0002b768) */
/* WARNING: Removing unreachable block (ram,0x0002b638) */
/* WARNING: Removing unreachable block (ram,0x0002b63c) */
/* WARNING: Removing unreachable block (ram,0x0002b648) */
/* WARNING: Removing unreachable block (ram,0x0002b920) */

char * FUN_0002ae50(void)

{
  uint uVar1;
  undefined1 auVar2 [16];
  undefined1 *puVar3;
  undefined1 *puVar4;
  long *plVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  char *pcVar8;
  undefined8 *puVar9;
  char *pcVar10;
  undefined8 *puVar11;
  char *pcVar12;
  char *pcVar13;
  int in_w8;
  long lVar14;
  long lVar15;
  char *unaff_x19;
  long unaff_x20;
  char *unaff_x21;
  long *unaff_x22;
  undefined8 *unaff_x23;
  long lVar16;
  ulong uVar17;
  long unaff_x24;
  long lVar18;
  undefined *puVar19;
  undefined *puVar20;
  undefined *puVar21;
  undefined *puVar22;
  undefined *puVar23;
  undefined *puVar24;
  undefined1 auVar25 [16];
  undefined *in_stack_00000000;
  undefined *in_stack_00000008;
  undefined *in_stack_00000010;
  undefined *in_stack_00000018;
  undefined *in_stack_00000020;
  ulong in_stack_00000028;
  char *in_stack_00000030;
  char *in_stack_00000038;
  long in_stack_00000040;
  char *in_stack_00000048;
  undefined8 uStack0000000000000050;
  undefined *in_stack_00000058;
  undefined1 uStack0000000000000060;
  
  puVar20 = in_stack_00000018;
  puVar21 = in_stack_00000010;
  puVar22 = in_stack_00000008;
  puVar23 = in_stack_00000000;
  auVar2._8_8_ = in_stack_00000030;
  auVar2._0_8_ = in_stack_00000040;
  auVar25._8_8_ = unaff_x21;
  auVar25._0_8_ = unaff_x20;
  pcVar12 = unaff_x19;
  pcVar8 = in_stack_00000038;
  puVar19 = in_stack_00000020;
  if (in_w8 < 0x40) {
    if (in_w8 == 0) {
      pcVar8 = (char *)func_0x0002bb80();
      if (pcVar8 == unaff_x21) {
        plVar5 = (long *)__Znwm(0x10);
        lVar18 = *(long *)(unaff_x20 + 0x38);
        lVar16 = *(long *)(lVar18 + 8);
        *plVar5 = unaff_x24 + 0x10;
        plVar5[1] = lVar16;
        *(long **)(lVar18 + 8) = plVar5;
        *(undefined8 *)(unaff_x20 + 0x38) = *(undefined8 *)(*(long *)(unaff_x20 + 0x38) + 8);
      }
      if (pcVar8 != unaff_x19) {
        do {
          if (*pcVar8 != '|') {
            return pcVar8;
          }
          lVar18 = *(long *)(unaff_x20 + 0x38);
          pcVar12 = pcVar8 + 1;
          pcVar8 = (char *)func_0x0002bb80();
          if (pcVar8 == pcVar12) {
            plVar5 = (long *)__Znwm(0x10);
            lVar16 = *(long *)(unaff_x20 + 0x38);
            lVar14 = *(long *)(lVar16 + 8);
            *plVar5 = unaff_x24 + 0x10;
            plVar5[1] = lVar14;
            *(long **)(lVar16 + 8) = plVar5;
            *(undefined8 *)(unaff_x20 + 0x38) = *(undefined8 *)(*(long *)(unaff_x20 + 0x38) + 8);
          }
          puVar9 = (undefined8 *)__Znwm(0x18);
          uVar6 = *(undefined8 *)(lVar18 + 8);
          puVar9[1] = unaff_x23[1];
          puVar9[2] = uVar6;
          *puVar9 = &UNK_009b3548;
          unaff_x23[1] = puVar9;
          *(undefined8 *)(lVar18 + 8) = 0;
          plVar5 = (long *)__Znwm(0x10);
          lVar16 = *(long *)(*(long *)(unaff_x20 + 0x38) + 8);
          *plVar5 = unaff_x24 + 0x10;
          plVar5[1] = lVar16;
          *(long **)(lVar18 + 8) = plVar5;
          *(undefined8 *)(*(long *)(unaff_x20 + 0x38) + 8) = 0;
          puVar9 = (undefined8 *)__Znwm(0x10);
          uVar6 = *(undefined8 *)(lVar18 + 8);
          *puVar9 = &UNK_009b3590;
          puVar9[1] = uVar6;
          *(undefined8 **)(*(long *)(unaff_x20 + 0x38) + 8) = puVar9;
          *(undefined8 *)(unaff_x20 + 0x38) = *(undefined8 *)(lVar18 + 8);
        } while (pcVar8 != unaff_x19);
      }
      return unaff_x19;
    }
    if (in_w8 == 0x10) {
      puVar3 = &uStack0000000000000060;
      pcVar13 = in_stack_00000048;
      pcVar12 = in_stack_00000038;
      uVar17 = in_stack_00000028;
      puVar9 = uStack0000000000000050;
      puVar24 = in_stack_00000058;
      goto LAB_0002b2f0;
    }
    if (in_w8 != 0x20) {
LAB_0002b0ac:
      uVar6 = func_0x0002b944();
      *unaff_x23 = &UNK_009b3050;
      __ZdlPv();
      __ZdlPv();
      lVar18 = *unaff_x22;
      (**(code **)(lVar18 + 8))();
      uVar6 = __Unwind_Resume(uVar6);
      (**(code **)(lVar18 + 8))();
      __Unwind_Resume(uVar6);
      uVar6 = ___cxa_allocate_exception(0x18);
      __ZNSt3__111regex_errorC1ENS_15regex_constants10error_typeE(uVar6,0x11);
      pcVar12 = PTR___ZNSt3__111regex_errorD1Ev_009b0070;
      uVar7 = ___cxa_throw(uVar6,PTR___ZTINSt3__111regex_errorE_009b00f0);
      ___cxa_free_exception(uVar6);
      auVar25 = __Unwind_Resume(uVar7);
      lVar18 = auVar25._0_8_;
      lVar16 = *(long *)(lVar18 + 0x38);
      pcVar8 = auVar25._8_8_;
      do {
        pcVar13 = pcVar8;
        pcVar8 = (char *)func_0x0002bc20(lVar18,pcVar13,pcVar12);
      } while (pcVar8 != pcVar13);
      if (pcVar13 == auVar25._8_8_) {
        puVar9 = (undefined8 *)__Znwm(0x10);
        lVar14 = *(long *)(lVar18 + 0x38);
        uVar6 = *(undefined8 *)(lVar14 + 8);
        *puVar9 = &UNK_009b2fd8;
        puVar9[1] = uVar6;
        *(undefined8 **)(lVar14 + 8) = puVar9;
        *(undefined8 *)(lVar18 + 0x38) = *(undefined8 *)(*(long *)(lVar18 + 0x38) + 8);
      }
      while( true ) {
        if (pcVar13 == pcVar12) {
          return pcVar12;
        }
        if (*pcVar13 != '|') break;
        lVar14 = *(long *)(lVar18 + 0x38);
        pcVar8 = pcVar13 + 1;
        pcVar10 = pcVar8;
        do {
          pcVar13 = pcVar10;
          pcVar10 = (char *)func_0x0002bc20(lVar18,pcVar13,pcVar12);
        } while (pcVar10 != pcVar13);
        if (pcVar13 == pcVar8) {
          puVar9 = (undefined8 *)__Znwm(0x10);
          lVar15 = *(long *)(lVar18 + 0x38);
          uVar6 = *(undefined8 *)(lVar15 + 8);
          *puVar9 = &UNK_009b2fd8;
          puVar9[1] = uVar6;
          *(undefined8 **)(lVar15 + 8) = puVar9;
          *(undefined8 *)(lVar18 + 0x38) = *(undefined8 *)(*(long *)(lVar18 + 0x38) + 8);
        }
        puVar9 = (undefined8 *)__Znwm(0x18);
        uVar6 = *(undefined8 *)(lVar14 + 8);
        puVar9[1] = *(undefined8 *)(lVar16 + 8);
        puVar9[2] = uVar6;
        *puVar9 = &UNK_009b3548;
        *(undefined8 **)(lVar16 + 8) = puVar9;
        *(undefined8 *)(lVar14 + 8) = 0;
        puVar9 = (undefined8 *)__Znwm(0x10);
        uVar6 = *(undefined8 *)(*(long *)(lVar18 + 0x38) + 8);
        *puVar9 = &UNK_009b2fd8;
        puVar9[1] = uVar6;
        *(undefined8 **)(lVar14 + 8) = puVar9;
        *(undefined8 *)(*(long *)(lVar18 + 0x38) + 8) = 0;
        puVar9 = (undefined8 *)__Znwm(0x10);
        uVar6 = *(undefined8 *)(lVar14 + 8);
        *puVar9 = &UNK_009b3590;
        puVar9[1] = uVar6;
        *(undefined8 **)(*(long *)(lVar18 + 0x38) + 8) = puVar9;
        *(undefined8 *)(lVar18 + 0x38) = *(undefined8 *)(lVar14 + 8);
      }
      return pcVar13;
    }
  }
  else if (in_w8 != 0x40) {
    if (in_w8 == 0x80) {
      puVar4 = &uStack0000000000000060;
      pcVar13 = unaff_x19;
      pcVar12 = in_stack_00000048;
      unaff_x20 = in_stack_00000040;
      unaff_x21 = in_stack_00000030;
      uVar17 = in_stack_00000028;
      puVar9 = uStack0000000000000050;
      puVar24 = in_stack_00000058;
      goto code_r0x0002b5d4;
    }
    if (in_w8 != 0x100) goto LAB_0002b0ac;
    puVar9 = &uStack0000000000000050;
    uVar17 = *(ulong *)(unaff_x20 + 0x38);
    pcVar8 = (char *)_memchr();
    if (pcVar8 != (char *)0x0) {
      pcVar12 = pcVar8;
    }
    puVar19 = &UNK_009b2fc8;
    lVar18 = unaff_x20;
    if (pcVar12 == unaff_x21) {
      puVar11 = (undefined8 *)__Znwm(0x10);
      uVar6 = *(undefined8 *)(uVar17 + 8);
      *puVar11 = &UNK_009b2fd8;
      puVar11[1] = uVar6;
      *(undefined8 **)(uVar17 + 8) = puVar11;
      *(undefined8 *)(unaff_x20 + 0x38) = *(undefined8 *)(*(long *)(unaff_x20 + 0x38) + 8);
      if (pcVar12 != unaff_x19) {
        pcVar12 = pcVar12 + 1;
      }
      if (pcVar12 != unaff_x19) {
        puVar20 = *(undefined **)(unaff_x20 + 0x38);
        puVar21 = &UNK_009b2fd8;
        puVar22 = &UNK_009b3548;
        puVar23 = &UNK_009b3590;
        unaff_x21 = pcVar12;
        do {
          pcVar8 = (char *)_memchr(unaff_x21,10,(long)unaff_x19 - (long)unaff_x21);
          pcVar12 = unaff_x19;
          if (pcVar8 != (char *)0x0) {
            pcVar12 = pcVar8;
          }
          if (pcVar12 != unaff_x21) {
            puVar24 = &UNK_0002b920;
            pcVar8 = pcVar12;
            pcVar13 = unaff_x21;
            goto code_r0x0002b468;
          }
          puVar11 = (undefined8 *)__Znwm(0x10);
          uVar6 = *(undefined8 *)(puVar20 + 8);
          *puVar11 = &UNK_009b2fd8;
          puVar11[1] = uVar6;
          *(undefined8 **)(puVar20 + 8) = puVar11;
          *(undefined8 *)(unaff_x20 + 0x38) = *(undefined8 *)(*(long *)(unaff_x20 + 0x38) + 8);
          puVar11 = (undefined8 *)__Znwm(0x18);
          uVar6 = *(undefined8 *)(puVar20 + 8);
          puVar11[1] = *(undefined8 *)(uVar17 + 8);
          puVar11[2] = uVar6;
          *puVar11 = &UNK_009b3548;
          *(undefined8 **)(uVar17 + 8) = puVar11;
          *(undefined8 *)(puVar20 + 8) = 0;
          puVar11 = (undefined8 *)__Znwm(0x10);
          uVar6 = *(undefined8 *)(*(long *)(unaff_x20 + 0x38) + 8);
          *puVar11 = &UNK_009b2fd8;
          puVar11[1] = uVar6;
          *(undefined8 **)(puVar20 + 8) = puVar11;
          *(undefined8 *)(*(long *)(unaff_x20 + 0x38) + 8) = 0;
          puVar11 = (undefined8 *)__Znwm(0x10);
          uVar6 = *(undefined8 *)(puVar20 + 8);
          *puVar11 = &UNK_009b3590;
          puVar11[1] = uVar6;
          *(undefined8 **)(*(long *)(unaff_x20 + 0x38) + 8) = puVar11;
          puVar20 = *(undefined **)(puVar20 + 8);
          *(undefined **)(unaff_x20 + 0x38) = puVar20;
          if (pcVar12 != unaff_x19) {
            pcVar12 = pcVar12 + 1;
          }
          unaff_x21 = pcVar12;
        } while (pcVar12 != unaff_x19);
      }
      return unaff_x19;
    }
    puVar24 = &UNK_0002b7f0;
    pcVar8 = pcVar12;
    pcVar13 = unaff_x21;
    goto code_r0x0002b468;
  }
  register0x00000008 = (BADSPACEBASE *)&uStack0000000000000060;
  unaff_x19 = in_stack_00000048;
  lVar18 = in_stack_00000040;
  pcVar13 = in_stack_00000030;
  uVar17 = in_stack_00000028;
  puVar9 = uStack0000000000000050;
  puVar24 = in_stack_00000058;
code_r0x0002b468:
  do {
    puVar4 = (undefined1 *)((long)register0x00000008 + -0x60);
    *(undefined **)((long)register0x00000008 + -0x60) = puVar23;
    *(undefined **)((long)register0x00000008 + -0x58) = puVar22;
    *(undefined **)((long)register0x00000008 + -0x50) = puVar21;
    *(undefined **)((long)register0x00000008 + -0x48) = puVar20;
    *(undefined **)((long)register0x00000008 + -0x40) = puVar19;
    *(ulong *)((long)register0x00000008 + -0x38) = uVar17;
    *(char **)((long)register0x00000008 + -0x30) = pcVar13;
    *(char **)((long)register0x00000008 + -0x28) = pcVar8;
    *(long *)((long)register0x00000008 + -0x20) = lVar18;
    *(char **)((long)register0x00000008 + -0x18) = unaff_x19;
    *(undefined8 **)((long)register0x00000008 + -0x10) = puVar9;
    *(undefined **)((long)register0x00000008 + -8) = puVar24;
    uVar17 = *(ulong *)(unaff_x20 + 0x38);
    pcVar13 = pcVar12;
    pcVar10 = (char *)func_0x00034144();
    if (pcVar10 != unaff_x21) {
      do {
        pcVar8 = pcVar10;
        pcVar13 = pcVar12;
        pcVar10 = (char *)func_0x00034144(unaff_x20,pcVar8);
      } while (pcVar10 != pcVar8);
      if (pcVar8 != unaff_x21) {
        if (pcVar8 == pcVar12) {
          return pcVar12;
        }
        puVar19 = &UNK_009b3548;
        puVar20 = &UNK_009b2fd8;
        puVar21 = &UNK_009b3590;
        while( true ) {
          if (*pcVar8 != '|') {
            return pcVar8;
          }
          puVar22 = *(undefined **)(unaff_x20 + 0x38);
          unaff_x21 = pcVar8 + 1;
          pcVar13 = pcVar12;
          pcVar10 = (char *)func_0x00034144(unaff_x20,unaff_x21);
          if (pcVar10 == unaff_x21) break;
          do {
            pcVar8 = pcVar10;
            pcVar13 = pcVar12;
            pcVar10 = (char *)func_0x00034144(unaff_x20,pcVar8);
          } while (pcVar10 != pcVar8);
          if (pcVar8 == unaff_x21) break;
          puVar9 = (undefined8 *)__Znwm(0x18);
          uVar6 = *(undefined8 *)(puVar22 + 8);
          puVar9[1] = *(undefined8 *)(uVar17 + 8);
          puVar9[2] = uVar6;
          *puVar9 = &UNK_009b3548;
          *(undefined8 **)(uVar17 + 8) = puVar9;
          *(undefined8 *)(puVar22 + 8) = 0;
          puVar9 = (undefined8 *)__Znwm(0x10);
          uVar6 = *(undefined8 *)(*(long *)(unaff_x20 + 0x38) + 8);
          *puVar9 = &UNK_009b2fd8;
          puVar9[1] = uVar6;
          *(undefined8 **)(puVar22 + 8) = puVar9;
          *(undefined8 *)(*(long *)(unaff_x20 + 0x38) + 8) = 0;
          puVar9 = (undefined8 *)__Znwm(0x10);
          uVar6 = *(undefined8 *)(puVar22 + 8);
          *puVar9 = &UNK_009b3590;
          puVar9[1] = uVar6;
          *(undefined8 **)(*(long *)(unaff_x20 + 0x38) + 8) = puVar9;
          *(undefined8 *)(unaff_x20 + 0x38) = *(undefined8 *)(puVar22 + 8);
          if (pcVar8 == pcVar12) {
            return pcVar12;
          }
        }
      }
    }
    auVar25 = func_0x000339f8();
    puVar9 = (undefined8 *)((long)register0x00000008 + -0x10);
    puVar24 = &LAB_0002b5d4;
code_r0x0002b5d4:
    pcVar10 = auVar25._8_8_;
    lVar18 = auVar25._0_8_;
    puVar3 = puVar4 + -0x60;
    *(undefined **)(puVar4 + -0x60) = puVar23;
    *(undefined **)(puVar4 + -0x58) = puVar22;
    *(undefined **)(puVar4 + -0x50) = puVar21;
    *(undefined **)(puVar4 + -0x48) = puVar20;
    *(undefined **)(puVar4 + -0x40) = puVar19;
    *(ulong *)(puVar4 + -0x38) = uVar17;
    *(char **)(puVar4 + -0x30) = unaff_x21;
    *(char **)(puVar4 + -0x28) = pcVar8;
    *(long *)(puVar4 + -0x20) = unaff_x20;
    *(char **)(puVar4 + -0x18) = pcVar12;
    *(undefined8 **)(puVar4 + -0x10) = puVar9;
    *(undefined **)(puVar4 + -8) = puVar24;
    uVar17 = *(ulong *)(lVar18 + 0x38);
    pcVar8 = (char *)_memchr(pcVar10,10,(long)pcVar13 - (long)pcVar10);
    unaff_x19 = pcVar13;
    if (pcVar8 != (char *)0x0) {
      unaff_x19 = pcVar8;
    }
    puVar19 = &UNK_009b2fc8;
    puVar9 = (undefined8 *)(puVar4 + -0x10);
    if (unaff_x19 == pcVar10) {
      puVar11 = (undefined8 *)__Znwm(0x10);
      uVar6 = *(undefined8 *)(uVar17 + 8);
      *puVar11 = &UNK_009b2fd8;
      puVar11[1] = uVar6;
      *(undefined8 **)(uVar17 + 8) = puVar11;
      *(undefined8 *)(lVar18 + 0x38) = *(undefined8 *)(*(long *)(lVar18 + 0x38) + 8);
      if (unaff_x19 != pcVar13) {
        unaff_x19 = unaff_x19 + 1;
      }
      if (unaff_x19 == pcVar13) {
        return pcVar13;
      }
      puVar20 = *(undefined **)(lVar18 + 0x38);
      pcVar8 = unaff_x19;
      while( true ) {
        auVar25._8_8_ = pcVar8;
        auVar25._0_8_ = lVar18;
        auVar2._8_8_ = pcVar8;
        auVar2._0_8_ = lVar18;
        pcVar12 = (char *)_memchr(pcVar8,10,(long)pcVar13 - (long)pcVar8);
        unaff_x19 = pcVar13;
        if (pcVar12 != (char *)0x0) {
          unaff_x19 = pcVar12;
        }
        if (unaff_x19 != pcVar8) break;
        puVar11 = (undefined8 *)__Znwm(0x10);
        uVar6 = *(undefined8 *)(puVar20 + 8);
        *puVar11 = &UNK_009b2fd8;
        puVar11[1] = uVar6;
        *(undefined8 **)(puVar20 + 8) = puVar11;
        *(undefined8 *)(lVar18 + 0x38) = *(undefined8 *)(*(long *)(lVar18 + 0x38) + 8);
        puVar11 = (undefined8 *)__Znwm(0x18);
        uVar6 = *(undefined8 *)(puVar20 + 8);
        puVar11[1] = *(undefined8 *)(uVar17 + 8);
        puVar11[2] = uVar6;
        *puVar11 = &UNK_009b3548;
        *(undefined8 **)(uVar17 + 8) = puVar11;
        *(undefined8 *)(puVar20 + 8) = 0;
        puVar11 = (undefined8 *)__Znwm(0x10);
        uVar6 = *(undefined8 *)(*(long *)(lVar18 + 0x38) + 8);
        *puVar11 = &UNK_009b2fd8;
        puVar11[1] = uVar6;
        *(undefined8 **)(puVar20 + 8) = puVar11;
        *(undefined8 *)(*(long *)(lVar18 + 0x38) + 8) = 0;
        puVar11 = (undefined8 *)__Znwm(0x10);
        uVar6 = *(undefined8 *)(puVar20 + 8);
        *puVar11 = &UNK_009b3590;
        puVar11[1] = uVar6;
        *(undefined8 **)(*(long *)(lVar18 + 0x38) + 8) = puVar11;
        puVar20 = *(undefined **)(puVar20 + 8);
        *(undefined **)(lVar18 + 0x38) = puVar20;
        if (unaff_x19 != pcVar13) {
          unaff_x19 = unaff_x19 + 1;
        }
        pcVar8 = unaff_x19;
        if (unaff_x19 == pcVar13) {
          return pcVar13;
        }
      }
      pcVar12 = unaff_x19;
      puVar21 = &UNK_009b2fd8;
      puVar22 = &UNK_009b3548;
      puVar23 = &UNK_009b3590;
      puVar24 = &UNK_0002b768;
    }
    else {
      puVar3 = puVar4 + -0x60;
      pcVar12 = unaff_x19;
      puVar24 = &UNK_0002b638;
      auVar2 = auVar25;
    }
LAB_0002b2f0:
    pcVar8 = auVar25._8_8_;
    lVar18 = auVar25._0_8_;
    register0x00000008 = (BADSPACEBASE *)(puVar3 + -0x40);
    *(undefined **)(puVar3 + -0x40) = puVar19;
    *(ulong *)(puVar3 + -0x38) = uVar17;
    *(long *)(puVar3 + -0x30) = auVar2._8_8_;
    *(char **)(puVar3 + -0x28) = pcVar12;
    *(long *)(puVar3 + -0x20) = auVar2._0_8_;
    *(char **)(puVar3 + -0x18) = pcVar13;
    *(undefined8 **)(puVar3 + -0x10) = puVar9;
    *(undefined **)(puVar3 + -8) = puVar24;
    puVar9 = (undefined8 *)(puVar3 + -0x10);
    if (pcVar8 == unaff_x19) {
      return pcVar8;
    }
    if (*pcVar8 == '^') {
      puVar11 = (undefined8 *)__Znwm(0x18);
      uVar1 = *(uint *)(lVar18 + 0x18);
      lVar16 = *(long *)(lVar18 + 0x38);
      uVar6 = *(undefined8 *)(lVar16 + 8);
      *puVar11 = &UNK_009b3080;
      puVar11[1] = uVar6;
      *(bool *)(puVar11 + 2) = (uVar1 & 0x5f0) == 0x400;
      *(undefined8 **)(lVar16 + 8) = puVar11;
      *(undefined8 *)(lVar18 + 0x38) = *(undefined8 *)(*(long *)(lVar18 + 0x38) + 8);
      pcVar8 = pcVar8 + 1;
    }
    if (pcVar8 == unaff_x19) {
      return unaff_x19;
    }
    do {
      pcVar13 = pcVar8;
      if (pcVar13 == unaff_x19) {
        return unaff_x19;
      }
      pcVar8 = *(char **)(lVar18 + 0x38);
      uVar1 = *(uint *)(lVar18 + 0x1c);
      uVar17 = (ulong)uVar1;
      pcVar12 = unaff_x19;
      pcVar10 = (char *)func_0x00033a44(lVar18,pcVar13);
    } while ((pcVar10 != pcVar13) &&
            (pcVar12 = unaff_x19,
            pcVar8 = (char *)func_0x00033c68(lVar18,pcVar10,unaff_x19,pcVar8,uVar1 + 1,
                                             *(int *)(lVar18 + 0x1c) + 1), pcVar8 != pcVar13));
    if ((pcVar13 + 1 == unaff_x19) && (*pcVar13 == '$')) {
      puVar9 = (undefined8 *)__Znwm(0x18);
      uVar1 = *(uint *)(lVar18 + 0x18);
      lVar16 = *(long *)(lVar18 + 0x38);
      uVar6 = *(undefined8 *)(lVar16 + 8);
      *puVar9 = &UNK_009b30c8;
      puVar9[1] = uVar6;
      *(bool *)(puVar9 + 2) = (uVar1 & 0x5f0) == 0x400;
      *(undefined8 **)(lVar16 + 8) = puVar9;
      *(undefined8 *)(lVar18 + 0x38) = *(undefined8 *)(*(long *)(lVar18 + 0x38) + 8);
      return unaff_x19;
    }
    puVar24 = &LAB_0002b468;
    auVar25 = func_0x000339f8();
    unaff_x21 = auVar25._8_8_;
    unaff_x20 = auVar25._0_8_;
  } while( true );
}

