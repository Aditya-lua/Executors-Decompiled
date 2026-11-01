
/* WARNING: Possible PIC construction at 0x0006eeec: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0006eef0) */
/* WARNING: Removing unreachable block (ram,0x0006ef00) */

ulong FUN_0006ecfc(long *param_1)

{
  bool bVar1;
  code *pcVar2;
  int iVar3;
  long *plVar4;
  undefined8 uVar5;
  long *plVar6;
  ulong uVar7;
  byte *******pppppppbVar8;
  char *******pppppppcVar9;
  char *pcVar10;
  dword *pdVar11;
  undefined8 *puVar12;
  long lVar13;
  char *pcVar14;
  char *******pppppppcVar15;
  char *pcVar17;
  char *pcVar16;
  ulong unaff_x19;
  long *unaff_x20;
  long *unaff_x21;
  ulong uVar18;
  ulong uVar19;
  ulong unaff_x23;
  undefined8 *unaff_x25;
  undefined8 *unaff_x26;
  dword *unaff_x27;
  ulong unaff_x28;
  long unaff_x29;
  char ******ppppppcVar20;
  char ******ppppppcVar21;
  char ******ppppppcVar22;
  char ******ppppppcVar23;
  char ******ppppppcVar24;
  char ******ppppppcVar25;
  char ******ppppppcVar26;
  undefined1 auVar27 [16];
  dword *in_stack_00000008;
  undefined8 uStack0000000000000010;
  undefined1 uStack0000000000000018;
  undefined8 *in_stack_00000020;
  ulong in_stack_00000030;
  short sStack0000000000000038;
  char cStack000000000000003a;
  undefined5 uStack000000000000003b;
  ulong in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 uStack0000000000000050;
  undefined8 uStack0000000000000058;
  dword dStack0000000000000060;
  undefined8 uStack0000000000000068;
  long lStack0000000000000070;
  long *in_stack_00000088;
  long lStack0000000000000090;
  long *in_stack_000000a8;
  undefined8 auStack_d8 [2];
  char cStack_c1;
  char *******pppppppcStack_c0;
  ulong uStack_b8;
  undefined8 uStack_b0;
  byte *******pppppppbStack_a8;
  ulong uStack_a0;
  undefined8 uStack_98;
  char *******pppppppcStack_90;
  ulong uStack_88;
  undefined8 uStack_80;
  undefined8 auStack_78 [3];
  
code_r0x0006ecfc:
  pdVar11 = &dStack0000000000000060;
  iVar3 = (**(code **)(*param_1 + 0x30))(param_1,&uStack0000000000000068,pdVar11);
  if (iVar3 != 0) goto LAB_0006ec88;
code_r0x0006ed14:
  bVar1 = false;
  if (in_stack_00000088 == &lStack0000000000000070) goto LAB_0006ed48;
code_r0x0006ed28:
  if (in_stack_00000088 == (long *)0x0) goto LAB_0006ed5c;
  lVar13 = 5;
  plVar6 = in_stack_00000088;
LAB_0006ed50:
  (**(code **)(*plVar6 + lVar13 * 8))();
LAB_0006ed5c:
  if (in_stack_000000a8 == &lStack0000000000000090) {
    plVar6 = &lStack0000000000000090;
    lVar13 = 4;
LAB_0006ed80:
    (**(code **)(*plVar6 + lVar13 * 8))();
  }
  else if (in_stack_000000a8 != (long *)0x0) {
    lVar13 = 5;
    plVar6 = in_stack_000000a8;
    goto LAB_0006ed80;
  }
  if ((bVar1) && (iVar3 = func_0x0005c298(&uStack0000000000000018), iVar3 != 0)) {
    if ((char)in_stack_00000048._7_1_ < '\0') {
      puVar12 = unaff_x25;
      if (in_stack_00000040 == 0) goto LAB_0006edc8;
LAB_0006edcc:
      iVar3 = _strcmp(*puVar12);
    }
    else {
      if (in_stack_00000048._7_1_ == 0) {
LAB_0006edc8:
        puVar12 = unaff_x26;
        goto LAB_0006edcc;
      }
      iVar3 = _strcmp();
    }
    if ((iVar3 != 0) || (uVar18 = func_0x0005c298(&uStack0000000000000018), (uVar18 & 1) == 0))
    goto LAB_0006ede8;
    if ((char)in_stack_00000048._7_1_ < '\0') {
      puVar12 = unaff_x25;
      if (in_stack_00000040 == 0) goto code_r0x0006ebf0;
code_r0x0006ebf4:
      pdVar11 = &MACH_HEADER.ncmds;
      unaff_x23 = _strtoul(*puVar12,&uStack0000000000000010,0x10);
      if (-1 < (char)in_stack_00000048._7_1_) goto code_r0x0006ebcc;
code_r0x0006ec10:
      puVar12 = unaff_x25;
      if (in_stack_00000040 == 0) goto code_r0x0006ec1c;
code_r0x0006ec20:
      if (uStack0000000000000010 == (undefined8 *)*puVar12) goto LAB_0006ede8;
    }
    else {
      if (in_stack_00000048._7_1_ == 0) {
code_r0x0006ebf0:
        puVar12 = unaff_x26;
        goto code_r0x0006ebf4;
      }
      pdVar11 = &MACH_HEADER.ncmds;
      unaff_x23 = _strtoul();
      if ((char)in_stack_00000048._7_1_ < '\0') goto code_r0x0006ec10;
code_r0x0006ebcc:
      if (in_stack_00000048._7_1_ == 0) {
code_r0x0006ec1c:
        puVar12 = unaff_x26;
        goto code_r0x0006ec20;
      }
      if (uStack0000000000000010 == unaff_x25) goto LAB_0006ede8;
    }
    if (unaff_x23 == 0xffffffffffffffff) goto LAB_0006ede8;
    if (unaff_x23 == 0) {
      iVar3 = func_0x0005c298(&uStack0000000000000018);
      uVar18 = in_stack_00000040;
      puVar12 = in_stack_00000020;
      if (iVar3 == 0) {
code_r0x0006ef04:
        uVar18 = 1;
        goto code_r0x0006edec;
      }
      if ((char)in_stack_00000048._7_1_ < '\0') {
        if (in_stack_00000040 == 0) goto code_r0x0006eebc;
        unaff_x25 = (undefined8 *)
                    CONCAT53(uStack000000000000003b,
                             CONCAT12(cStack000000000000003a,sStack0000000000000038));
        iVar3 = _strcmp(unaff_x25,"\r\n");
        if (iVar3 == 0) goto code_r0x0006ef04;
        if (0x2000 < uVar18) goto LAB_0006ede8;
        lVar13 = (long)unaff_x25 + uVar18;
code_r0x0006eee0:
        lVar13 = lVar13 + -2;
      }
      else {
        if (in_stack_00000048._7_1_ == 0) {
code_r0x0006eebc:
          iVar3 = _strcmp(in_stack_00000020,"\r\n");
          if (iVar3 == 0) goto code_r0x0006ef04;
          if (0x2000 < in_stack_00000030) goto LAB_0006ede8;
          lVar13 = (long)puVar12 + in_stack_00000030;
          unaff_x25 = puVar12;
          goto code_r0x0006eee0;
        }
        if (sStack0000000000000038 == 0xa0d && cStack000000000000003a == '\0')
        goto code_r0x0006ef04;
        lVar13 = (long)auStack_d8 + (ulong)in_stack_00000048._7_1_ + 0x10e;
      }
      auVar27._8_8_ = lVar13;
      auVar27._0_8_ = unaff_x25;
      goto LAB_0006efcc;
    }
    in_stack_000000a8 = (long *)0x0;
    plVar4 = (long *)unaff_x20[3];
    plVar6 = (long *)0x0;
    if (plVar4 == (long *)0x0) {
code_r0x0006ec5c:
      in_stack_00000088 = plVar6;
    }
    else {
      if (plVar4 != unaff_x20) {
        plVar6 = (long *)(**(code **)(*plVar4 + 0x10))();
        goto code_r0x0006ec5c;
      }
      in_stack_00000088 = &lStack0000000000000070;
      (**(code **)(*unaff_x20 + 0x18))();
    }
    unaff_x19 = 0;
    do {
      pdVar11 = (dword *)(unaff_x23 - unaff_x19);
      if (&UNK_00003fff < (dword *)(unaff_x23 - unaff_x19)) {
        pdVar11 = unaff_x27;
      }
      uVar18 = (**(code **)(*unaff_x21 + 0x28))();
      if ((long)uVar18 < 1) goto code_r0x0006ed14;
      uStack0000000000000050 = unaff_x23;
      uStack0000000000000058 = unaff_x19;
      _dStack0000000000000060 = uVar18;
      if (in_stack_00000088 == (long *)0x0) {
        func_0x00056004();
                    /* WARNING: Does not return */
        pcVar2 = (code *)SoftwareBreakpoint(1,0x6ef14);
        (*pcVar2)();
      }
      pdVar11 = &dStack0000000000000060;
      uStack0000000000000068 = unaff_x28;
      iVar3 = (**(code **)(*in_stack_00000088 + 0x30))
                        (in_stack_00000088,&uStack0000000000000068,pdVar11,&uStack0000000000000058,
                         &uStack0000000000000050);
      if (iVar3 == 0) goto code_r0x0006ed14;
      unaff_x19 = uVar18 + unaff_x19;
      if (in_stack_000000a8 != (long *)0x0) {
        param_1 = in_stack_000000a8;
        _dStack0000000000000060 = unaff_x23;
        uStack0000000000000068 = unaff_x19;
        goto code_r0x0006ecfc;
      }
LAB_0006ec88:
    } while (unaff_x19 < unaff_x23);
    bVar1 = true;
    if (in_stack_00000088 != &lStack0000000000000070) goto code_r0x0006ed28;
LAB_0006ed48:
    plVar6 = &lStack0000000000000070;
    lVar13 = 4;
    goto LAB_0006ed50;
  }
LAB_0006ede8:
  uVar18 = 0;
code_r0x0006edec:
  if ((char)in_stack_00000048._7_1_ < '\0') {
    __ZdlPv(CONCAT53(uStack000000000000003b,CONCAT12(cStack000000000000003a,sStack0000000000000038))
           );
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
    return uVar18;
  }
  uVar5 = ___stack_chk_fail();
  in_stack_00000008 = pdVar11;
  while ((char)in_stack_00000048._7_1_ < '\0') {
    __ZdlPv(CONCAT53(uStack000000000000003b,CONCAT12(cStack000000000000003a,sStack0000000000000038))
           );
    plVar6 = (long *)__Unwind_Resume(uVar5);
    (**(code **)(*plVar6 + 0x28))();
  }
  auVar27 = __Unwind_Resume(uVar5);
LAB_0006efcc:
  pcVar10 = auVar27._8_8_;
  pcVar16 = auVar27._0_8_;
  if (pcVar16 < pcVar10) {
    do {
      pcVar14 = pcVar10 + -1;
      if (*pcVar14 != ' ' && *pcVar14 != '\t') goto LAB_0006f024;
      pcVar10 = pcVar14;
    } while (pcVar16 < pcVar14);
    pcVar10 = pcVar16;
  }
LAB_0006f024:
  pcVar14 = pcVar16;
  if (pcVar16 < pcVar10) {
    lVar13 = (long)pcVar10 - (long)pcVar16;
    do {
      if (*pcVar14 == ':') goto code_r0x0006f054;
      pcVar14 = pcVar14 + 1;
      lVar13 = lVar13 + -1;
    } while (lVar13 != 0);
    pcVar14 = pcVar10;
  }
code_r0x0006f054:
  uVar18 = (long)pcVar14 - (long)pcVar16;
  if (0x7ffffffffffffff7 < uVar18) {
    func_0x0001748c(&pppppppcStack_90);
code_r0x0006f530:
    func_0x0001748c(&pppppppcStack_c0);
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x6f53c);
    (*pcVar2)();
  }
  if (uVar18 < 0x17) {
    uStack_80 = CONCAT17((char)uVar18,(undefined7)uStack_80);
    pppppppcVar9 = (char *******)&pppppppcStack_90;
  }
  else {
    uVar19 = (uVar18 & 0xfffffffffffffff8) + 8;
    if ((uVar18 | 7) != 0x17) {
      uVar19 = uVar18 | 7;
    }
    pppppppcVar9 = (char *******)__Znwm(uVar19 + 1);
    uStack_88 = uVar18;
    uStack_80 = uVar19 + 1 | 0x8000000000000000;
    pppppppcStack_90 = pppppppcVar9;
  }
  if (pcVar14 != pcVar16) {
    _memcpy(pppppppcVar9,pcVar16,uVar18);
    pppppppcVar9 = (char *******)((long)pppppppcVar9 + uVar18);
  }
  *(char *)pppppppcVar9 = '\0';
  if ((long)uStack_80 < 0) {
    uVar19 = 0;
    if (uStack_88 == 0) goto code_r0x0006f188;
    uVar19 = uStack_88;
    pppppppcVar9 = pppppppcStack_90;
  }
  else {
    if (uStack_80._7_1_ == 0) {
      return 0;
    }
    uVar19 = (ulong)uStack_80._7_1_;
    pppppppcVar9 = (char *******)&pppppppcStack_90;
  }
  do {
    uVar7 = func_0x00061674((long)*(char *)pppppppcVar9);
    if ((uVar7 & 1) == 0) goto code_r0x0006f184;
    uVar19 = uVar19 - 1;
    pppppppcVar9 = (char *******)((long)pppppppcVar9 + 1);
  } while (uVar19 != 0);
  if ((pcVar14 == pcVar10) || (*pcVar14 != ':')) {
code_r0x0006f184:
    uVar19 = 0;
code_r0x0006f188:
    if ((long)uStack_80 < 0) {
      __ZdlPv(pppppppcStack_90);
    }
    return uVar19;
  }
  pcVar17 = pcVar14 + 1;
  if (pcVar17 < pcVar10) {
    lVar13 = ((long)pcVar10 - (long)pcVar14) + -1;
    do {
      if (*pcVar17 != ' ' && *pcVar17 != '\t') goto code_r0x0006f15c;
      pcVar17 = pcVar17 + 1;
      lVar13 = lVar13 + -1;
    } while (lVar13 != 0);
    pcVar17 = pcVar14 + ((long)pcVar10 - (long)pcVar14);
  }
code_r0x0006f15c:
  uVar19 = 0;
  if ((pcVar14 == pcVar16) || (pcVar10 < pcVar17)) goto code_r0x0006f188;
  if (uVar18 < 0x17) {
    uStack_98 = CONCAT17((char)uVar18,(undefined7)uStack_98);
    pppppppbVar8 = (byte *******)&pppppppbStack_a8;
  }
  else {
    uVar19 = (uVar18 & 0xfffffffffffffff8) + 8;
    if ((uVar18 | 7) != 0x17) {
      uVar19 = uVar18 | 7;
    }
    pppppppbVar8 = (byte *******)__Znwm(uVar19 + 1);
    uStack_98 = uVar19 + 1 | 0x8000000000000000;
    pppppppbStack_a8 = pppppppbVar8;
    uStack_a0 = uVar18;
  }
  _memcpy(pppppppbVar8,pcVar16,uVar18);
  *(byte *)((long)pppppppbVar8 + uVar18) = 0;
  uVar18 = (long)pcVar10 - (long)pcVar17;
  if (0x7ffffffffffffff7 < uVar18) goto code_r0x0006f530;
  if (uVar18 < 0x17) {
    uStack_b0 = CONCAT17((char)uVar18,(undefined7)uStack_b0);
    pppppppcVar9 = (char *******)&pppppppcStack_c0;
  }
  else {
    uVar19 = (uVar18 & 0xfffffffffffffff8) + 8;
    if ((uVar18 | 7) != 0x17) {
      uVar19 = uVar18 | 7;
    }
    pppppppcVar9 = (char *******)__Znwm(uVar19 + 1);
    uStack_b0 = uVar19 + 1 | 0x8000000000000000;
    pppppppcStack_c0 = pppppppcVar9;
    uStack_b8 = uVar18;
  }
  if (pcVar17 == pcVar10) {
    pppppppcVar15 = pppppppcVar9;
  }
  else {
    uVar18 = (long)pcVar10 - (long)pcVar17;
    if ((0x3f < uVar18) && (0x3f < (ulong)((long)pppppppcVar9 - (long)pcVar17))) {
      uVar7 = uVar18 & 0xffffffffffffffc0;
      pppppppcVar15 = (char *******)((long)pppppppcVar9 + uVar7);
      pcVar16 = pcVar17 + 0x20;
      pppppppcVar9 = pppppppcVar9 + 4;
      uVar19 = uVar7;
      do {
        ppppppcVar20 = *(char *******)(pcVar16 + -0x20);
        ppppppcVar22 = *(char *******)(pcVar16 + -8);
        ppppppcVar21 = *(char *******)(pcVar16 + -0x10);
        ppppppcVar24 = *(char *******)(pcVar16 + 8);
        ppppppcVar23 = *(char *******)pcVar16;
        ppppppcVar26 = *(char *******)(pcVar16 + 0x18);
        ppppppcVar25 = *(char *******)(pcVar16 + 0x10);
        pppppppcVar9[-3] = *(char *******)(pcVar16 + -0x18);
        pppppppcVar9[-4] = ppppppcVar20;
        pppppppcVar9[-1] = ppppppcVar22;
        pppppppcVar9[-2] = ppppppcVar21;
        pppppppcVar9[1] = ppppppcVar24;
        *pppppppcVar9 = ppppppcVar23;
        pppppppcVar9[3] = ppppppcVar26;
        pppppppcVar9[2] = ppppppcVar25;
        uVar19 = uVar19 - 0x40;
        pcVar16 = pcVar16 + 0x40;
        pppppppcVar9 = pppppppcVar9 + 8;
      } while (uVar19 != 0);
      pppppppcVar9 = pppppppcVar15;
      pcVar17 = pcVar17 + uVar7;
      if (uVar18 == uVar7) goto code_r0x0006f2c8;
    }
    do {
      pcVar16 = pcVar17 + 1;
      *(char *)pppppppcVar9 = *pcVar17;
      pppppppcVar15 = (char *******)((long)pppppppcVar9 + 1);
      pppppppcVar9 = (char *******)((long)pppppppcVar9 + 1);
      pcVar17 = pcVar16;
    } while (pcVar16 != pcVar10);
  }
code_r0x0006f2c8:
  *(char *)pppppppcVar15 = '\0';
  uVar19 = func_0x000616fc(&pppppppcStack_c0);
  if ((uVar19 & 1) != 0) {
    uVar18 = uStack_a0;
    if (-1 < (long)uStack_98) {
      uVar18 = uStack_98 >> 0x38;
    }
    if (uVar18 == 7) {
      pppppppbVar8 = pppppppbStack_a8;
      if (-1 < (long)uStack_98) {
        pppppppbVar8 = (byte *******)&pppppppbStack_a8;
      }
      if (((ulong)*pppppppbVar8 & 0xdf) == 0x52) {
        pppppppbVar8 = pppppppbStack_a8;
        if (-1 < (long)uStack_98) {
          pppppppbVar8 = (byte *******)&pppppppbStack_a8;
        }
        if (((ulong)*pppppppbVar8 & 0xdf00) == 0x4500) {
          pppppppbVar8 = pppppppbStack_a8;
          if (-1 < (long)uStack_98) {
            pppppppbVar8 = (byte *******)&pppppppbStack_a8;
          }
          if (((ulong)*pppppppbVar8 & 0xdf0000) == 0x460000) {
            pppppppbVar8 = pppppppbStack_a8;
            if (-1 < (long)uStack_98) {
              pppppppbVar8 = (byte *******)&pppppppbStack_a8;
            }
            if (((ulong)*pppppppbVar8 & 0xdf000000) == 0x45000000) {
              pppppppbVar8 = pppppppbStack_a8;
              if (-1 < (long)uStack_98) {
                pppppppbVar8 = (byte *******)&pppppppbStack_a8;
              }
              if (((ulong)*pppppppbVar8 & 0xdf00000000) == 0x5200000000) {
                pppppppbVar8 = pppppppbStack_a8;
                if (-1 < (long)uStack_98) {
                  pppppppbVar8 = (byte *******)&pppppppbStack_a8;
                }
                if (((ulong)*pppppppbVar8 & 0xdf0000000000) == 0x450000000000) {
                  pppppppbVar8 = pppppppbStack_a8;
                  if (-1 < (long)uStack_98) {
                    pppppppbVar8 = (byte *******)&pppppppbStack_a8;
                  }
                  if (((ulong)*pppppppbVar8 & 0xdf000000000000) == 0x52000000000000) {
code_r0x0006f498:
                    func_0x00061844(auStack_78,in_stack_00000008 + 0x12,&pppppppbStack_a8,
                                    &pppppppcStack_c0);
                    func_0x0005eb38(in_stack_00000008 + 0x12,auStack_78[0]);
                    goto code_r0x0006f504;
                  }
                }
              }
            }
          }
        }
      }
    }
    else if (uVar18 == 8) {
      pppppppbVar8 = pppppppbStack_a8;
      if (-1 < (long)uStack_98) {
        pppppppbVar8 = (byte *******)&pppppppbStack_a8;
      }
      if (((ulong)*pppppppbVar8 & 0xdf) == 0x4c) {
        pppppppbVar8 = pppppppbStack_a8;
        if (-1 < (long)uStack_98) {
          pppppppbVar8 = (byte *******)&pppppppbStack_a8;
        }
        if (((ulong)*pppppppbVar8 & 0xdf00) == 0x4f00) {
          pppppppbVar8 = pppppppbStack_a8;
          if (-1 < (long)uStack_98) {
            pppppppbVar8 = (byte *******)&pppppppbStack_a8;
          }
          if (((ulong)*pppppppbVar8 & 0xdf0000) == 0x430000) {
            pppppppbVar8 = pppppppbStack_a8;
            if (-1 < (long)uStack_98) {
              pppppppbVar8 = (byte *******)&pppppppbStack_a8;
            }
            if (((ulong)*pppppppbVar8 & 0xdf000000) == 0x41000000) {
              pppppppbVar8 = pppppppbStack_a8;
              if (-1 < (long)uStack_98) {
                pppppppbVar8 = (byte *******)&pppppppbStack_a8;
              }
              if (((ulong)*pppppppbVar8 & 0xdf00000000) == 0x5400000000) {
                pppppppbVar8 = pppppppbStack_a8;
                if (-1 < (long)uStack_98) {
                  pppppppbVar8 = (byte *******)&pppppppbStack_a8;
                }
                if (((ulong)*pppppppbVar8 & 0xdf0000000000) == 0x490000000000) {
                  pppppppbVar8 = pppppppbStack_a8;
                  if (-1 < (long)uStack_98) {
                    pppppppbVar8 = (byte *******)&pppppppbStack_a8;
                  }
                  if (((ulong)*pppppppbVar8 & 0xdf000000000000) == 0x4f000000000000) {
                    pppppppbVar8 = pppppppbStack_a8;
                    if (-1 < (long)uStack_98) {
                      pppppppbVar8 = (byte *******)&pppppppbStack_a8;
                    }
                    if (((ulong)*pppppppbVar8 & 0xdf00000000000000) == 0x4e00000000000000)
                    goto code_r0x0006f498;
                  }
                }
              }
            }
          }
        }
      }
    }
    func_0x00060210(auStack_d8,&pppppppcStack_c0,0);
    func_0x00061844(auStack_78,in_stack_00000008 + 0x12,&pppppppbStack_a8,auStack_d8);
    func_0x0005eb38(in_stack_00000008 + 0x12,auStack_78[0]);
    if (cStack_c1 < '\0') {
      __ZdlPv(auStack_d8[0]);
    }
  }
code_r0x0006f504:
  if ((long)uStack_b0 < 0) {
    __ZdlPv(pppppppcStack_c0);
  }
  if ((long)uStack_98 < 0) {
    __ZdlPv(pppppppbStack_a8);
  }
  goto code_r0x0006f188;
}

