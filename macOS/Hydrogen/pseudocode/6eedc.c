
/* WARNING: Possible PIC construction at 0x0006eeec: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0006eef0) */
/* WARNING: Removing unreachable block (ram,0x0006ee60) */
/* WARNING: Removing unreachable block (ram,0x0006ee90) */
/* WARNING: Removing unreachable block (ram,0x0006ee98) */
/* WARNING: Removing unreachable block (ram,0x0006eeac) */
/* WARNING: Removing unreachable block (ram,0x0006eeb4) */
/* WARNING: Removing unreachable block (ram,0x0006ee68) */
/* WARNING: Removing unreachable block (ram,0x0006eebc) */
/* WARNING: Removing unreachable block (ram,0x0006eed0) */
/* WARNING: Removing unreachable block (ram,0x0006ede8) */
/* WARNING: Removing unreachable block (ram,0x0006ee70) */
/* WARNING: Removing unreachable block (ram,0x0006ef04) */
/* WARNING: Removing unreachable block (ram,0x0006ee84) */
/* WARNING: Removing unreachable block (ram,0x0006ef00) */
/* WARNING: Removing unreachable block (ram,0x0006edec) */
/* WARNING: Removing unreachable block (ram,0x0006edf4) */
/* WARNING: Removing unreachable block (ram,0x0006edfc) */
/* WARNING: Removing unreachable block (ram,0x0006ef14) */
/* WARNING: Removing unreachable block (ram,0x0006ef2c) */
/* WARNING: Removing unreachable block (ram,0x0006ef38) */
/* WARNING: Removing unreachable block (ram,0x0006ef9c) */
/* WARNING: Removing unreachable block (ram,0x0006efc4) */
/* WARNING: Removing unreachable block (ram,0x0006ee14) */

ulong FUN_0006eedc(long param_1)

{
  code *pcVar1;
  ulong uVar2;
  byte *******pppppppbVar3;
  char *******pppppppcVar4;
  char *pcVar5;
  char *pcVar6;
  long lVar7;
  char *******pppppppcVar8;
  char *pcVar9;
  char *unaff_x21;
  ulong uVar10;
  ulong uVar11;
  long unaff_x24;
  char ******ppppppcVar12;
  char ******ppppppcVar13;
  char ******ppppppcVar14;
  char ******ppppppcVar15;
  char ******ppppppcVar16;
  char ******ppppppcVar17;
  char ******ppppppcVar18;
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
  
  pcVar5 = unaff_x21 + param_1 + -2;
  if (unaff_x21 < pcVar5) {
    do {
      pcVar6 = pcVar5 + -1;
      if (*pcVar6 != ' ' && *pcVar6 != '\t') goto code_r0x0006f024;
      pcVar5 = pcVar6;
    } while (unaff_x21 < pcVar6);
    pcVar5 = unaff_x21;
  }
code_r0x0006f024:
  pcVar6 = unaff_x21;
  if (unaff_x21 < pcVar5) {
    lVar7 = (long)pcVar5 - (long)unaff_x21;
    do {
      if (*pcVar6 == ':') goto code_r0x0006f054;
      pcVar6 = pcVar6 + 1;
      lVar7 = lVar7 + -1;
    } while (lVar7 != 0);
    pcVar6 = pcVar5;
  }
code_r0x0006f054:
  uVar11 = (long)pcVar6 - (long)unaff_x21;
  if (0x7ffffffffffffff7 < uVar11) {
    func_0x0001748c(&pppppppcStack_90);
code_r0x0006f530:
    func_0x0001748c(&pppppppcStack_c0);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x6f53c);
    (*pcVar1)();
  }
  if (uVar11 < 0x17) {
    uStack_80 = CONCAT17((char)uVar11,(undefined7)uStack_80);
    pppppppcVar4 = (char *******)&pppppppcStack_90;
  }
  else {
    uVar10 = (uVar11 & 0xfffffffffffffff8) + 8;
    if ((uVar11 | 7) != 0x17) {
      uVar10 = uVar11 | 7;
    }
    pppppppcVar4 = (char *******)__Znwm(uVar10 + 1);
    uStack_88 = uVar11;
    uStack_80 = uVar10 + 1 | 0x8000000000000000;
    pppppppcStack_90 = pppppppcVar4;
  }
  if (pcVar6 != unaff_x21) {
    _memcpy(pppppppcVar4);
    pppppppcVar4 = (char *******)((long)pppppppcVar4 + uVar11);
  }
  *(char *)pppppppcVar4 = '\0';
  if ((long)uStack_80 < 0) {
    uVar10 = 0;
    if (uStack_88 == 0) goto code_r0x0006f188;
    uVar10 = uStack_88;
    pppppppcVar4 = pppppppcStack_90;
  }
  else {
    if (uStack_80._7_1_ == 0) {
      return 0;
    }
    uVar10 = (ulong)uStack_80._7_1_;
    pppppppcVar4 = (char *******)&pppppppcStack_90;
  }
  do {
    uVar2 = func_0x00061674((long)*(char *)pppppppcVar4);
    if ((uVar2 & 1) == 0) goto code_r0x0006f184;
    uVar10 = uVar10 - 1;
    pppppppcVar4 = (char *******)((long)pppppppcVar4 + 1);
  } while (uVar10 != 0);
  if ((pcVar6 == pcVar5) || (*pcVar6 != ':')) {
code_r0x0006f184:
    uVar10 = 0;
    goto code_r0x0006f188;
  }
  pcVar9 = pcVar6 + 1;
  if (pcVar9 < pcVar5) {
    lVar7 = ((long)pcVar5 - (long)pcVar6) + -1;
    do {
      if (*pcVar9 != ' ' && *pcVar9 != '\t') goto code_r0x0006f15c;
      pcVar9 = pcVar9 + 1;
      lVar7 = lVar7 + -1;
    } while (lVar7 != 0);
    pcVar9 = pcVar6 + ((long)pcVar5 - (long)pcVar6);
  }
code_r0x0006f15c:
  uVar10 = 0;
  if ((pcVar6 == unaff_x21) || (pcVar5 < pcVar9)) goto code_r0x0006f188;
  if (uVar11 < 0x17) {
    uStack_98 = CONCAT17((char)uVar11,(undefined7)uStack_98);
    pppppppbVar3 = (byte *******)&pppppppbStack_a8;
  }
  else {
    uVar10 = (uVar11 & 0xfffffffffffffff8) + 8;
    if ((uVar11 | 7) != 0x17) {
      uVar10 = uVar11 | 7;
    }
    pppppppbVar3 = (byte *******)__Znwm(uVar10 + 1);
    uStack_98 = uVar10 + 1 | 0x8000000000000000;
    pppppppbStack_a8 = pppppppbVar3;
    uStack_a0 = uVar11;
  }
  _memcpy(pppppppbVar3);
  *(byte *)((long)pppppppbVar3 + uVar11) = 0;
  uVar11 = (long)pcVar5 - (long)pcVar9;
  if (0x7ffffffffffffff7 < uVar11) goto code_r0x0006f530;
  if (uVar11 < 0x17) {
    uStack_b0 = CONCAT17((char)uVar11,(undefined7)uStack_b0);
    pppppppcVar4 = (char *******)&pppppppcStack_c0;
  }
  else {
    uVar10 = (uVar11 & 0xfffffffffffffff8) + 8;
    if ((uVar11 | 7) != 0x17) {
      uVar10 = uVar11 | 7;
    }
    pppppppcVar4 = (char *******)__Znwm(uVar10 + 1);
    uStack_b0 = uVar10 + 1 | 0x8000000000000000;
    pppppppcStack_c0 = pppppppcVar4;
    uStack_b8 = uVar11;
  }
  if (pcVar9 == pcVar5) {
    pppppppcVar8 = pppppppcVar4;
  }
  else {
    uVar11 = (long)pcVar5 - (long)pcVar9;
    if ((0x3f < uVar11) && (0x3f < (ulong)((long)pppppppcVar4 - (long)pcVar9))) {
      uVar2 = uVar11 & 0xffffffffffffffc0;
      pppppppcVar8 = (char *******)((long)pppppppcVar4 + uVar2);
      pcVar6 = pcVar9 + 0x20;
      pppppppcVar4 = pppppppcVar4 + 4;
      uVar10 = uVar2;
      do {
        ppppppcVar12 = *(char *******)(pcVar6 + -0x20);
        ppppppcVar14 = *(char *******)(pcVar6 + -8);
        ppppppcVar13 = *(char *******)(pcVar6 + -0x10);
        ppppppcVar16 = *(char *******)(pcVar6 + 8);
        ppppppcVar15 = *(char *******)pcVar6;
        ppppppcVar18 = *(char *******)(pcVar6 + 0x18);
        ppppppcVar17 = *(char *******)(pcVar6 + 0x10);
        pppppppcVar4[-3] = *(char *******)(pcVar6 + -0x18);
        pppppppcVar4[-4] = ppppppcVar12;
        pppppppcVar4[-1] = ppppppcVar14;
        pppppppcVar4[-2] = ppppppcVar13;
        pppppppcVar4[1] = ppppppcVar16;
        *pppppppcVar4 = ppppppcVar15;
        pppppppcVar4[3] = ppppppcVar18;
        pppppppcVar4[2] = ppppppcVar17;
        uVar10 = uVar10 - 0x40;
        pcVar6 = pcVar6 + 0x40;
        pppppppcVar4 = pppppppcVar4 + 8;
      } while (uVar10 != 0);
      pppppppcVar4 = pppppppcVar8;
      pcVar9 = pcVar9 + uVar2;
      if (uVar11 == uVar2) goto code_r0x0006f2c8;
    }
    do {
      pcVar6 = pcVar9 + 1;
      *(char *)pppppppcVar4 = *pcVar9;
      pppppppcVar8 = (char *******)((long)pppppppcVar4 + 1);
      pppppppcVar4 = (char *******)((long)pppppppcVar4 + 1);
      pcVar9 = pcVar6;
    } while (pcVar6 != pcVar5);
  }
code_r0x0006f2c8:
  *(char *)pppppppcVar8 = '\0';
  uVar10 = func_0x000616fc(&pppppppcStack_c0);
  if ((uVar10 & 1) != 0) {
    uVar11 = uStack_a0;
    if (-1 < (long)uStack_98) {
      uVar11 = uStack_98 >> 0x38;
    }
    if (uVar11 == 7) {
      pppppppbVar3 = pppppppbStack_a8;
      if (-1 < (long)uStack_98) {
        pppppppbVar3 = (byte *******)&pppppppbStack_a8;
      }
      if (((ulong)*pppppppbVar3 & 0xdf) == 0x52) {
        pppppppbVar3 = pppppppbStack_a8;
        if (-1 < (long)uStack_98) {
          pppppppbVar3 = (byte *******)&pppppppbStack_a8;
        }
        if (((ulong)*pppppppbVar3 & 0xdf00) == 0x4500) {
          pppppppbVar3 = pppppppbStack_a8;
          if (-1 < (long)uStack_98) {
            pppppppbVar3 = (byte *******)&pppppppbStack_a8;
          }
          if (((ulong)*pppppppbVar3 & 0xdf0000) == 0x460000) {
            pppppppbVar3 = pppppppbStack_a8;
            if (-1 < (long)uStack_98) {
              pppppppbVar3 = (byte *******)&pppppppbStack_a8;
            }
            if (((ulong)*pppppppbVar3 & 0xdf000000) == 0x45000000) {
              pppppppbVar3 = pppppppbStack_a8;
              if (-1 < (long)uStack_98) {
                pppppppbVar3 = (byte *******)&pppppppbStack_a8;
              }
              if (((ulong)*pppppppbVar3 & 0xdf00000000) == 0x5200000000) {
                pppppppbVar3 = pppppppbStack_a8;
                if (-1 < (long)uStack_98) {
                  pppppppbVar3 = (byte *******)&pppppppbStack_a8;
                }
                if (((ulong)*pppppppbVar3 & 0xdf0000000000) == 0x450000000000) {
                  pppppppbVar3 = pppppppbStack_a8;
                  if (-1 < (long)uStack_98) {
                    pppppppbVar3 = (byte *******)&pppppppbStack_a8;
                  }
                  if (((ulong)*pppppppbVar3 & 0xdf000000000000) == 0x52000000000000) {
code_r0x0006f498:
                    func_0x00061844(auStack_78,unaff_x24 + 0x48,&pppppppbStack_a8,&pppppppcStack_c0)
                    ;
                    func_0x0005eb38(unaff_x24 + 0x48,auStack_78[0]);
                    goto code_r0x0006f504;
                  }
                }
              }
            }
          }
        }
      }
    }
    else if (uVar11 == 8) {
      pppppppbVar3 = pppppppbStack_a8;
      if (-1 < (long)uStack_98) {
        pppppppbVar3 = (byte *******)&pppppppbStack_a8;
      }
      if (((ulong)*pppppppbVar3 & 0xdf) == 0x4c) {
        pppppppbVar3 = pppppppbStack_a8;
        if (-1 < (long)uStack_98) {
          pppppppbVar3 = (byte *******)&pppppppbStack_a8;
        }
        if (((ulong)*pppppppbVar3 & 0xdf00) == 0x4f00) {
          pppppppbVar3 = pppppppbStack_a8;
          if (-1 < (long)uStack_98) {
            pppppppbVar3 = (byte *******)&pppppppbStack_a8;
          }
          if (((ulong)*pppppppbVar3 & 0xdf0000) == 0x430000) {
            pppppppbVar3 = pppppppbStack_a8;
            if (-1 < (long)uStack_98) {
              pppppppbVar3 = (byte *******)&pppppppbStack_a8;
            }
            if (((ulong)*pppppppbVar3 & 0xdf000000) == 0x41000000) {
              pppppppbVar3 = pppppppbStack_a8;
              if (-1 < (long)uStack_98) {
                pppppppbVar3 = (byte *******)&pppppppbStack_a8;
              }
              if (((ulong)*pppppppbVar3 & 0xdf00000000) == 0x5400000000) {
                pppppppbVar3 = pppppppbStack_a8;
                if (-1 < (long)uStack_98) {
                  pppppppbVar3 = (byte *******)&pppppppbStack_a8;
                }
                if (((ulong)*pppppppbVar3 & 0xdf0000000000) == 0x490000000000) {
                  pppppppbVar3 = pppppppbStack_a8;
                  if (-1 < (long)uStack_98) {
                    pppppppbVar3 = (byte *******)&pppppppbStack_a8;
                  }
                  if (((ulong)*pppppppbVar3 & 0xdf000000000000) == 0x4f000000000000) {
                    pppppppbVar3 = pppppppbStack_a8;
                    if (-1 < (long)uStack_98) {
                      pppppppbVar3 = (byte *******)&pppppppbStack_a8;
                    }
                    if (((ulong)*pppppppbVar3 & 0xdf00000000000000) == 0x4e00000000000000)
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
    func_0x00061844(auStack_78,unaff_x24 + 0x48,&pppppppbStack_a8,auStack_d8);
    func_0x0005eb38(unaff_x24 + 0x48,auStack_78[0]);
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
  return uVar10;
}

