
ulong thunk_FUN_0006f0d0(void)

{
  code *pcVar1;
  ulong uVar2;
  byte *pbVar3;
  char *pcVar4;
  char *pcVar5;
  long lVar6;
  char *pcVar8;
  char *pcVar7;
  ulong uVar9;
  long unaff_x19;
  char *unaff_x20;
  undefined1 *unaff_x21;
  ulong uVar10;
  char *unaff_x22;
  ulong unaff_x23;
  ulong unaff_x25;
  char *unaff_x26;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000018;
  undefined8 uStack0000000000000020;
  ulong in_stack_00000028;
  undefined7 uStack0000000000000030;
  undefined8 uStack0000000000000038;
  ulong in_stack_00000040;
  undefined7 uStack0000000000000048;
  char cStack0000000000000050;
  ulong in_stack_00000058;
  long in_stack_00000060;
  undefined8 uStack0000000000000068;
  
  *unaff_x21 = 0;
  if (in_stack_00000060 < 0) {
    uVar10 = 0;
    if (in_stack_00000058 == 0) goto LAB_0006f188;
    uVar10 = in_stack_00000058;
    pcVar8 = _cStack0000000000000050;
  }
  else {
    if (in_stack_00000060._7_1_ == 0) {
      return 0;
    }
    uVar10 = (ulong)in_stack_00000060._7_1_;
    pcVar8 = &cStack0000000000000050;
  }
  do {
    uVar2 = func_0x00061674((long)*pcVar8);
    if ((uVar2 & 1) == 0) goto LAB_0006f184;
    uVar10 = uVar10 - 1;
    pcVar8 = pcVar8 + 1;
  } while (uVar10 != 0);
  if ((unaff_x26 == unaff_x20) || (*unaff_x26 != ':')) {
LAB_0006f184:
    uVar10 = 0;
    goto LAB_0006f188;
  }
  pcVar8 = unaff_x26 + 1;
  if (pcVar8 < unaff_x20) {
    lVar6 = ((long)unaff_x20 - (long)unaff_x26) + -1;
    do {
      if (*pcVar8 != ' ' && *pcVar8 != '\t') goto LAB_0006f15c;
      pcVar8 = pcVar8 + 1;
      lVar6 = lVar6 + -1;
    } while (lVar6 != 0);
    pcVar8 = unaff_x26 + ((long)unaff_x20 - (long)unaff_x26);
  }
LAB_0006f15c:
  uVar10 = 0;
  if ((unaff_x26 == unaff_x22) || (unaff_x20 < pcVar8)) goto LAB_0006f188;
  if (unaff_x23 < 0x17) {
    _uStack0000000000000048 = CONCAT17((char)unaff_x23,uStack0000000000000048);
    pbVar3 = (byte *)&uStack0000000000000038;
  }
  else {
    uVar10 = (unaff_x23 & 0xfffffffffffffff8) + 8;
    if ((unaff_x23 | 7) != 0x17) {
      uVar10 = unaff_x23 | 7;
    }
    pbVar3 = (byte *)__Znwm(uVar10 + 1);
    _uStack0000000000000048 = uVar10 + 1 | 0x8000000000000000;
    uStack0000000000000038 = pbVar3;
    in_stack_00000040 = unaff_x23;
  }
  _memcpy(pbVar3);
  pbVar3[unaff_x23] = 0;
  uVar10 = (long)unaff_x20 - (long)pcVar8;
  if (unaff_x25 < uVar10) {
    func_0x0001748c(&uStack0000000000000020);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x6f53c);
    (*pcVar1)();
  }
  if (uVar10 < 0x17) {
    _uStack0000000000000030 = CONCAT17((char)uVar10,uStack0000000000000030);
    pcVar4 = (char *)&uStack0000000000000020;
  }
  else {
    uVar2 = (uVar10 & 0xfffffffffffffff8) + 8;
    if ((uVar10 | 7) != 0x17) {
      uVar2 = uVar10 | 7;
    }
    pcVar4 = (char *)__Znwm(uVar2 + 1);
    _uStack0000000000000030 = uVar2 + 1 | 0x8000000000000000;
    uStack0000000000000020 = pcVar4;
    in_stack_00000028 = uVar10;
  }
  if (pcVar8 == unaff_x20) {
    pcVar5 = pcVar4;
  }
  else {
    uVar10 = (long)unaff_x20 - (long)pcVar8;
    if ((0x3f < uVar10) && (0x3f < (ulong)((long)pcVar4 - (long)pcVar8))) {
      uVar9 = uVar10 & 0xffffffffffffffc0;
      pcVar5 = pcVar4 + uVar9;
      pcVar7 = pcVar8 + 0x20;
      pcVar4 = pcVar4 + 0x20;
      uVar2 = uVar9;
      do {
        uVar11 = *(undefined8 *)(pcVar7 + -0x20);
        uVar13 = *(undefined8 *)(pcVar7 + -8);
        uVar12 = *(undefined8 *)(pcVar7 + -0x10);
        uVar15 = *(undefined8 *)(pcVar7 + 8);
        uVar14 = *(undefined8 *)pcVar7;
        uVar17 = *(undefined8 *)(pcVar7 + 0x18);
        uVar16 = *(undefined8 *)(pcVar7 + 0x10);
        *(undefined8 *)(pcVar4 + -0x18) = *(undefined8 *)(pcVar7 + -0x18);
        *(undefined8 *)(pcVar4 + -0x20) = uVar11;
        *(undefined8 *)(pcVar4 + -8) = uVar13;
        *(undefined8 *)(pcVar4 + -0x10) = uVar12;
        *(undefined8 *)(pcVar4 + 8) = uVar15;
        *(undefined8 *)pcVar4 = uVar14;
        *(undefined8 *)(pcVar4 + 0x18) = uVar17;
        *(undefined8 *)(pcVar4 + 0x10) = uVar16;
        uVar2 = uVar2 - 0x40;
        pcVar7 = pcVar7 + 0x40;
        pcVar4 = pcVar4 + 0x40;
      } while (uVar2 != 0);
      pcVar4 = pcVar5;
      pcVar8 = pcVar8 + uVar9;
      if (uVar10 == uVar9) goto code_r0x0006f2c8;
    }
    do {
      pcVar7 = pcVar8 + 1;
      *pcVar4 = *pcVar8;
      pcVar5 = pcVar4 + 1;
      pcVar4 = pcVar4 + 1;
      pcVar8 = pcVar7;
    } while (pcVar7 != unaff_x20);
  }
code_r0x0006f2c8:
  *pcVar5 = '\0';
  uVar10 = func_0x000616fc(&uStack0000000000000020);
  if ((uVar10 & 1) != 0) {
    if (-1 < (long)_uStack0000000000000048) {
      in_stack_00000040 = _uStack0000000000000048 >> 0x38;
    }
    if (in_stack_00000040 == 7) {
      pbVar3 = uStack0000000000000038;
      if (-1 < (long)_uStack0000000000000048) {
        pbVar3 = (byte *)&uStack0000000000000038;
      }
      if ((*pbVar3 & 0xdf) == 0x52) {
        pbVar3 = uStack0000000000000038;
        if (-1 < (long)_uStack0000000000000048) {
          pbVar3 = (byte *)&uStack0000000000000038;
        }
        if ((pbVar3[1] & 0xdf) == 0x45) {
          pbVar3 = uStack0000000000000038;
          if (-1 < (long)_uStack0000000000000048) {
            pbVar3 = (byte *)&uStack0000000000000038;
          }
          if ((pbVar3[2] & 0xdf) == 0x46) {
            pbVar3 = uStack0000000000000038;
            if (-1 < (long)_uStack0000000000000048) {
              pbVar3 = (byte *)&uStack0000000000000038;
            }
            if ((pbVar3[3] & 0xdf) == 0x45) {
              pbVar3 = uStack0000000000000038;
              if (-1 < (long)_uStack0000000000000048) {
                pbVar3 = (byte *)&uStack0000000000000038;
              }
              if ((pbVar3[4] & 0xdf) == 0x52) {
                pbVar3 = uStack0000000000000038;
                if (-1 < (long)_uStack0000000000000048) {
                  pbVar3 = (byte *)&uStack0000000000000038;
                }
                if ((pbVar3[5] & 0xdf) == 0x45) {
                  pbVar3 = uStack0000000000000038;
                  if (-1 < (long)_uStack0000000000000048) {
                    pbVar3 = (byte *)&uStack0000000000000038;
                  }
                  if ((pbVar3[6] & 0xdf) == 0x52) {
code_r0x0006f498:
                    func_0x00061844(&uStack0000000000000068,unaff_x19 + 0x48,&uStack0000000000000038
                                    ,&uStack0000000000000020);
                    func_0x0005eb38(unaff_x19 + 0x48,uStack0000000000000068);
                    goto code_r0x0006f504;
                  }
                }
              }
            }
          }
        }
      }
    }
    else if (in_stack_00000040 == 8) {
      pbVar3 = uStack0000000000000038;
      if (-1 < (long)_uStack0000000000000048) {
        pbVar3 = (byte *)&uStack0000000000000038;
      }
      if ((*pbVar3 & 0xdf) == 0x4c) {
        pbVar3 = uStack0000000000000038;
        if (-1 < (long)_uStack0000000000000048) {
          pbVar3 = (byte *)&uStack0000000000000038;
        }
        if ((pbVar3[1] & 0xdf) == 0x4f) {
          pbVar3 = uStack0000000000000038;
          if (-1 < (long)_uStack0000000000000048) {
            pbVar3 = (byte *)&uStack0000000000000038;
          }
          if ((pbVar3[2] & 0xdf) == 0x43) {
            pbVar3 = uStack0000000000000038;
            if (-1 < (long)_uStack0000000000000048) {
              pbVar3 = (byte *)&uStack0000000000000038;
            }
            if ((pbVar3[3] & 0xdf) == 0x41) {
              pbVar3 = uStack0000000000000038;
              if (-1 < (long)_uStack0000000000000048) {
                pbVar3 = (byte *)&uStack0000000000000038;
              }
              if ((pbVar3[4] & 0xdf) == 0x54) {
                pbVar3 = uStack0000000000000038;
                if (-1 < (long)_uStack0000000000000048) {
                  pbVar3 = (byte *)&uStack0000000000000038;
                }
                if ((pbVar3[5] & 0xdf) == 0x49) {
                  pbVar3 = uStack0000000000000038;
                  if (-1 < (long)_uStack0000000000000048) {
                    pbVar3 = (byte *)&uStack0000000000000038;
                  }
                  if ((pbVar3[6] & 0xdf) == 0x4f) {
                    pbVar3 = uStack0000000000000038;
                    if (-1 < (long)_uStack0000000000000048) {
                      pbVar3 = (byte *)&uStack0000000000000038;
                    }
                    if ((pbVar3[7] & 0xdf) == 0x4e) goto code_r0x0006f498;
                  }
                }
              }
            }
          }
        }
      }
    }
    func_0x00060210(&uStack0000000000000008,&uStack0000000000000020,0);
    func_0x00061844(&uStack0000000000000068,unaff_x19 + 0x48,&uStack0000000000000038,
                    &uStack0000000000000008);
    func_0x0005eb38(unaff_x19 + 0x48,uStack0000000000000068);
    if (in_stack_00000018._7_1_ < '\0') {
      __ZdlPv(uStack0000000000000008);
    }
  }
code_r0x0006f504:
  if ((long)_uStack0000000000000030 < 0) {
    __ZdlPv(uStack0000000000000020);
  }
  if ((long)_uStack0000000000000048 < 0) {
    __ZdlPv(uStack0000000000000038);
  }
LAB_0006f188:
  if ((char)in_stack_00000060._7_1_ < '\0') {
    __ZdlPv(_cStack0000000000000050);
  }
  return uVar10;
}

