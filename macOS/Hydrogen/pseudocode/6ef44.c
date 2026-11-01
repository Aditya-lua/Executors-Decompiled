
ulong FUN_0006ef44(undefined8 param_1,undefined8 param_2,long param_3)

{
  code *pcVar1;
  long *plVar2;
  ulong uVar3;
  byte *******pppppppbVar4;
  char *******pppppppcVar5;
  long lVar6;
  char *pcVar7;
  char *******pppppppcVar8;
  char *pcVar10;
  char *pcVar9;
  char *pcVar11;
  ulong uVar12;
  ulong uVar13;
  char ******ppppppcVar14;
  char ******ppppppcVar15;
  char ******ppppppcVar16;
  char ******ppppppcVar17;
  char ******ppppppcVar18;
  char ******ppppppcVar19;
  char ******ppppppcVar20;
  undefined1 auVar21 [16];
  undefined8 in_stack_00000038;
  long in_stack_00000048;
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
  
  if (in_stack_00000088 == &lStack0000000000000070) {
    lVar6 = 4;
    plVar2 = &lStack0000000000000070;
LAB_0006ef68:
    (**(code **)(*plVar2 + lVar6 * 8))();
  }
  else if (in_stack_00000088 != (long *)0x0) {
    lVar6 = 5;
    plVar2 = in_stack_00000088;
    goto LAB_0006ef68;
  }
  if (in_stack_000000a8 != &lStack0000000000000090) {
    plVar2 = in_stack_000000a8;
    if (in_stack_000000a8 != (long *)0x0) goto LAB_0006efac;
    goto joined_r0x0006ef98;
  }
  lVar6 = 4;
  plVar2 = &lStack0000000000000090;
  while( true ) {
    (**(code **)(*plVar2 + lVar6 * 8))();
joined_r0x0006ef98:
    if (-1 < in_stack_00000048) break;
    __ZdlPv(in_stack_00000038);
    plVar2 = (long *)__Unwind_Resume();
LAB_0006efac:
    lVar6 = 5;
  }
  auVar21 = __Unwind_Resume();
  pcVar11 = auVar21._8_8_;
  pcVar9 = auVar21._0_8_;
  if (pcVar9 < pcVar11) {
    do {
      pcVar7 = pcVar11 + -1;
      if (*pcVar7 != ' ' && *pcVar7 != '\t') goto LAB_0006f024;
      pcVar11 = pcVar7;
    } while (pcVar9 < pcVar7);
    pcVar11 = pcVar9;
  }
LAB_0006f024:
  pcVar7 = pcVar9;
  if (pcVar9 < pcVar11) {
    lVar6 = (long)pcVar11 - (long)pcVar9;
    do {
      if (*pcVar7 == ':') goto code_r0x0006f054;
      pcVar7 = pcVar7 + 1;
      lVar6 = lVar6 + -1;
    } while (lVar6 != 0);
    pcVar7 = pcVar11;
  }
code_r0x0006f054:
  uVar13 = (long)pcVar7 - (long)pcVar9;
  if (0x7ffffffffffffff7 < uVar13) {
    func_0x0001748c(&pppppppcStack_90);
code_r0x0006f530:
    func_0x0001748c(&pppppppcStack_c0);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x6f53c);
    (*pcVar1)();
  }
  if (uVar13 < 0x17) {
    uStack_80 = CONCAT17((char)uVar13,(undefined7)uStack_80);
    pppppppcVar5 = (char *******)&pppppppcStack_90;
  }
  else {
    uVar12 = (uVar13 & 0xfffffffffffffff8) + 8;
    if ((uVar13 | 7) != 0x17) {
      uVar12 = uVar13 | 7;
    }
    pppppppcVar5 = (char *******)__Znwm(uVar12 + 1);
    uStack_88 = uVar13;
    uStack_80 = uVar12 + 1 | 0x8000000000000000;
    pppppppcStack_90 = pppppppcVar5;
  }
  if (pcVar7 != pcVar9) {
    _memcpy(pppppppcVar5,pcVar9,uVar13);
    pppppppcVar5 = (char *******)((long)pppppppcVar5 + uVar13);
  }
  *(char *)pppppppcVar5 = '\0';
  if ((long)uStack_80 < 0) {
    uVar12 = 0;
    if (uStack_88 == 0) goto code_r0x0006f188;
    uVar12 = uStack_88;
    pppppppcVar5 = pppppppcStack_90;
  }
  else {
    if (uStack_80._7_1_ == 0) {
      return 0;
    }
    uVar12 = (ulong)uStack_80._7_1_;
    pppppppcVar5 = (char *******)&pppppppcStack_90;
  }
  do {
    uVar3 = func_0x00061674((long)*(char *)pppppppcVar5);
    if ((uVar3 & 1) == 0) goto code_r0x0006f184;
    uVar12 = uVar12 - 1;
    pppppppcVar5 = (char *******)((long)pppppppcVar5 + 1);
  } while (uVar12 != 0);
  if ((pcVar7 == pcVar11) || (*pcVar7 != ':')) {
code_r0x0006f184:
    uVar12 = 0;
    goto code_r0x0006f188;
  }
  pcVar10 = pcVar7 + 1;
  if (pcVar10 < pcVar11) {
    lVar6 = ((long)pcVar11 - (long)pcVar7) + -1;
    do {
      if (*pcVar10 != ' ' && *pcVar10 != '\t') goto code_r0x0006f15c;
      pcVar10 = pcVar10 + 1;
      lVar6 = lVar6 + -1;
    } while (lVar6 != 0);
    pcVar10 = pcVar7 + ((long)pcVar11 - (long)pcVar7);
  }
code_r0x0006f15c:
  uVar12 = 0;
  if ((pcVar7 == pcVar9) || (pcVar11 < pcVar10)) goto code_r0x0006f188;
  if (uVar13 < 0x17) {
    uStack_98 = CONCAT17((char)uVar13,(undefined7)uStack_98);
    pppppppbVar4 = (byte *******)&pppppppbStack_a8;
  }
  else {
    uVar12 = (uVar13 & 0xfffffffffffffff8) + 8;
    if ((uVar13 | 7) != 0x17) {
      uVar12 = uVar13 | 7;
    }
    pppppppbVar4 = (byte *******)__Znwm(uVar12 + 1);
    uStack_98 = uVar12 + 1 | 0x8000000000000000;
    pppppppbStack_a8 = pppppppbVar4;
    uStack_a0 = uVar13;
  }
  _memcpy(pppppppbVar4,pcVar9,uVar13);
  *(byte *)((long)pppppppbVar4 + uVar13) = 0;
  uVar13 = (long)pcVar11 - (long)pcVar10;
  if (0x7ffffffffffffff7 < uVar13) goto code_r0x0006f530;
  if (uVar13 < 0x17) {
    uStack_b0 = CONCAT17((char)uVar13,(undefined7)uStack_b0);
    pppppppcVar5 = (char *******)&pppppppcStack_c0;
  }
  else {
    uVar12 = (uVar13 & 0xfffffffffffffff8) + 8;
    if ((uVar13 | 7) != 0x17) {
      uVar12 = uVar13 | 7;
    }
    pppppppcVar5 = (char *******)__Znwm(uVar12 + 1);
    uStack_b0 = uVar12 + 1 | 0x8000000000000000;
    pppppppcStack_c0 = pppppppcVar5;
    uStack_b8 = uVar13;
  }
  if (pcVar10 == pcVar11) {
    pppppppcVar8 = pppppppcVar5;
  }
  else {
    uVar13 = (long)pcVar11 - (long)pcVar10;
    if ((0x3f < uVar13) && (0x3f < (ulong)((long)pppppppcVar5 - (long)pcVar10))) {
      uVar3 = uVar13 & 0xffffffffffffffc0;
      pppppppcVar8 = (char *******)((long)pppppppcVar5 + uVar3);
      pcVar9 = pcVar10 + 0x20;
      pppppppcVar5 = pppppppcVar5 + 4;
      uVar12 = uVar3;
      do {
        ppppppcVar14 = *(char *******)(pcVar9 + -0x20);
        ppppppcVar16 = *(char *******)(pcVar9 + -8);
        ppppppcVar15 = *(char *******)(pcVar9 + -0x10);
        ppppppcVar18 = *(char *******)(pcVar9 + 8);
        ppppppcVar17 = *(char *******)pcVar9;
        ppppppcVar20 = *(char *******)(pcVar9 + 0x18);
        ppppppcVar19 = *(char *******)(pcVar9 + 0x10);
        pppppppcVar5[-3] = *(char *******)(pcVar9 + -0x18);
        pppppppcVar5[-4] = ppppppcVar14;
        pppppppcVar5[-1] = ppppppcVar16;
        pppppppcVar5[-2] = ppppppcVar15;
        pppppppcVar5[1] = ppppppcVar18;
        *pppppppcVar5 = ppppppcVar17;
        pppppppcVar5[3] = ppppppcVar20;
        pppppppcVar5[2] = ppppppcVar19;
        uVar12 = uVar12 - 0x40;
        pcVar9 = pcVar9 + 0x40;
        pppppppcVar5 = pppppppcVar5 + 8;
      } while (uVar12 != 0);
      pppppppcVar5 = pppppppcVar8;
      pcVar10 = pcVar10 + uVar3;
      if (uVar13 == uVar3) goto code_r0x0006f2c8;
    }
    do {
      pcVar9 = pcVar10 + 1;
      *(char *)pppppppcVar5 = *pcVar10;
      pppppppcVar8 = (char *******)((long)pppppppcVar5 + 1);
      pppppppcVar5 = (char *******)((long)pppppppcVar5 + 1);
      pcVar10 = pcVar9;
    } while (pcVar9 != pcVar11);
  }
code_r0x0006f2c8:
  *(char *)pppppppcVar8 = '\0';
  uVar12 = func_0x000616fc(&pppppppcStack_c0);
  if ((uVar12 & 1) != 0) {
    uVar13 = uStack_a0;
    if (-1 < (long)uStack_98) {
      uVar13 = uStack_98 >> 0x38;
    }
    if (uVar13 == 7) {
      pppppppbVar4 = pppppppbStack_a8;
      if (-1 < (long)uStack_98) {
        pppppppbVar4 = (byte *******)&pppppppbStack_a8;
      }
      if (((ulong)*pppppppbVar4 & 0xdf) == 0x52) {
        pppppppbVar4 = pppppppbStack_a8;
        if (-1 < (long)uStack_98) {
          pppppppbVar4 = (byte *******)&pppppppbStack_a8;
        }
        if (((ulong)*pppppppbVar4 & 0xdf00) == 0x4500) {
          pppppppbVar4 = pppppppbStack_a8;
          if (-1 < (long)uStack_98) {
            pppppppbVar4 = (byte *******)&pppppppbStack_a8;
          }
          if (((ulong)*pppppppbVar4 & 0xdf0000) == 0x460000) {
            pppppppbVar4 = pppppppbStack_a8;
            if (-1 < (long)uStack_98) {
              pppppppbVar4 = (byte *******)&pppppppbStack_a8;
            }
            if (((ulong)*pppppppbVar4 & 0xdf000000) == 0x45000000) {
              pppppppbVar4 = pppppppbStack_a8;
              if (-1 < (long)uStack_98) {
                pppppppbVar4 = (byte *******)&pppppppbStack_a8;
              }
              if (((ulong)*pppppppbVar4 & 0xdf00000000) == 0x5200000000) {
                pppppppbVar4 = pppppppbStack_a8;
                if (-1 < (long)uStack_98) {
                  pppppppbVar4 = (byte *******)&pppppppbStack_a8;
                }
                if (((ulong)*pppppppbVar4 & 0xdf0000000000) == 0x450000000000) {
                  pppppppbVar4 = pppppppbStack_a8;
                  if (-1 < (long)uStack_98) {
                    pppppppbVar4 = (byte *******)&pppppppbStack_a8;
                  }
                  if (((ulong)*pppppppbVar4 & 0xdf000000000000) == 0x52000000000000) {
code_r0x0006f498:
                    func_0x00061844(auStack_78,param_3 + 0x48,&pppppppbStack_a8,&pppppppcStack_c0);
                    func_0x0005eb38(param_3 + 0x48,auStack_78[0]);
                    goto code_r0x0006f504;
                  }
                }
              }
            }
          }
        }
      }
    }
    else if (uVar13 == 8) {
      pppppppbVar4 = pppppppbStack_a8;
      if (-1 < (long)uStack_98) {
        pppppppbVar4 = (byte *******)&pppppppbStack_a8;
      }
      if (((ulong)*pppppppbVar4 & 0xdf) == 0x4c) {
        pppppppbVar4 = pppppppbStack_a8;
        if (-1 < (long)uStack_98) {
          pppppppbVar4 = (byte *******)&pppppppbStack_a8;
        }
        if (((ulong)*pppppppbVar4 & 0xdf00) == 0x4f00) {
          pppppppbVar4 = pppppppbStack_a8;
          if (-1 < (long)uStack_98) {
            pppppppbVar4 = (byte *******)&pppppppbStack_a8;
          }
          if (((ulong)*pppppppbVar4 & 0xdf0000) == 0x430000) {
            pppppppbVar4 = pppppppbStack_a8;
            if (-1 < (long)uStack_98) {
              pppppppbVar4 = (byte *******)&pppppppbStack_a8;
            }
            if (((ulong)*pppppppbVar4 & 0xdf000000) == 0x41000000) {
              pppppppbVar4 = pppppppbStack_a8;
              if (-1 < (long)uStack_98) {
                pppppppbVar4 = (byte *******)&pppppppbStack_a8;
              }
              if (((ulong)*pppppppbVar4 & 0xdf00000000) == 0x5400000000) {
                pppppppbVar4 = pppppppbStack_a8;
                if (-1 < (long)uStack_98) {
                  pppppppbVar4 = (byte *******)&pppppppbStack_a8;
                }
                if (((ulong)*pppppppbVar4 & 0xdf0000000000) == 0x490000000000) {
                  pppppppbVar4 = pppppppbStack_a8;
                  if (-1 < (long)uStack_98) {
                    pppppppbVar4 = (byte *******)&pppppppbStack_a8;
                  }
                  if (((ulong)*pppppppbVar4 & 0xdf000000000000) == 0x4f000000000000) {
                    pppppppbVar4 = pppppppbStack_a8;
                    if (-1 < (long)uStack_98) {
                      pppppppbVar4 = (byte *******)&pppppppbStack_a8;
                    }
                    if (((ulong)*pppppppbVar4 & 0xdf00000000000000) == 0x4e00000000000000)
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
    func_0x00061844(auStack_78,param_3 + 0x48,&pppppppbStack_a8,auStack_d8);
    func_0x0005eb38(param_3 + 0x48,auStack_78[0]);
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
code_r0x0006f188:
  if ((long)uStack_80 < 0) {
    __ZdlPv(pppppppcStack_90);
  }
  return uVar12;
}

