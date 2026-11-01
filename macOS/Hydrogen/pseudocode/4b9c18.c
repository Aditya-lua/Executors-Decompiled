
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_004b9c18(long param_1)

{
  ulong uVar1;
  byte bVar2;
  bool bVar3;
  undefined *puVar4;
  code *pcVar5;
  char cVar6;
  int iVar7;
  dword *pdVar8;
  dword *pdVar9;
  byte *pbVar10;
  undefined8 uVar11;
  ulong in_x9;
  ulong uVar12;
  ulong extraout_x9;
  uint uVar13;
  uint extraout_w10;
  ulong in_x10;
  ulong uVar14;
  long lVar15;
  long lVar16;
  undefined8 *unaff_x19;
  dword *pdVar17;
  dword *pdVar18;
  dword *pdVar19;
  dword *unaff_x24;
  dword *pdVar20;
  dword *unaff_x26;
  dword *unaff_x27;
  dword *in_stack_00000008;
  undefined8 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  dword *in_stack_00000020;
  dword *in_stack_00000028;
  undefined8 uStack0000000000000030;
  undefined8 uStack0000000000000038;
  undefined8 in_stack_00000040;
  undefined8 uStack0000000000000048;
  undefined8 in_stack_00000050;
  undefined8 uStack0000000000000060;
  undefined8 in_stack_00000068;
  long in_stack_00000070;
  undefined8 uStack0000000000000078;
  long *in_stack_00000080;
  undefined8 in_stack_00000088;
  undefined8 in_stack_00000090;
  undefined8 in_stack_00000098;
  
  if (unaff_x26 == (dword *)((long)&MACH_HEADER.magic + 3)) {
LAB_004b9b68:
    uVar11 = 0;
    param_1 = 1;
LAB_004b9b70:
    unaff_x19[1] = uVar11;
    unaff_x19[2] = param_1;
    unaff_x27 = (dword *)(segment_command_00000020.segname + 7);
code_r0x004b9b7c:
    uVar11 = 1;
    lVar16 = 0x20;
    lVar15 = 0x18;
  }
  else {
    uVar1 = in_x9 & 0x3fff | (in_x10 & 0x7f) << 0xe;
    uVar12 = in_x9 & 0xffffffffffe00000 | uVar1;
    uVar14 = (ulong)*(char *)(param_1 + 3);
    if (*(char *)(param_1 + 3) < '\0') {
      if (unaff_x26 == &MACH_HEADER.cputype) goto LAB_004b9b68;
      uVar1 = uVar1 | (uVar14 & 0x7f) << 0x15;
      uVar12 = in_x9 & 0xfffffffff0000000 | uVar1;
      uVar14 = (ulong)*(char *)(param_1 + 4);
      if (*(char *)(param_1 + 4) < '\0') {
        if (unaff_x26 == (dword *)((long)&MACH_HEADER.cputype + 1)) goto LAB_004b9b68;
        uVar12 = in_x9 & 0xfffffff800000000 | uVar1 | (uVar14 & 0x7f) << 0x1c;
        cVar6 = *(char *)(param_1 + 5);
        uVar14 = (ulong)cVar6;
        uVar13 = (uint)cVar6;
        if (cVar6 < '\0') goto LAB_004b9cd0;
        pdVar20 = (dword *)((long)&MACH_HEADER.cputype + 2);
        lVar16 = 0x23;
      }
      else {
        pdVar20 = (dword *)((long)&MACH_HEADER.cputype + 1);
        lVar16 = 0x1c;
      }
    }
    else {
      pdVar20 = &MACH_HEADER.cputype;
      lVar16 = 0x15;
    }
    while (pdVar18 = (dword *)((long)unaff_x26 - (long)pdVar20), unaff_x26 < pdVar20) {
      param_1 = func_0x007a28a4(pdVar20);
      uVar12 = extraout_x9;
      uVar13 = extraout_w10;
LAB_004b9cd0:
      if (unaff_x26 == (dword *)((long)&MACH_HEADER.cputype + 2)) goto LAB_004b9b68;
      uVar12 = uVar12 | (ulong)(uVar13 & 0x7f) << 0x23;
      cVar6 = *(char *)(param_1 + 6);
      uVar14 = (ulong)cVar6;
      if (cVar6 < 0) {
        if (unaff_x26 == (dword *)((long)&MACH_HEADER.cputype + 3)) goto LAB_004b9b68;
        uVar12 = uVar12 | (ulong)((int)cVar6 & 0x7f) << 0x2a;
        cVar6 = *(char *)(param_1 + 7);
        uVar14 = (ulong)cVar6;
        if (cVar6 < 0) {
          if (unaff_x26 == &MACH_HEADER.cpusubtype) goto LAB_004b9b68;
          uVar12 = uVar12 | (ulong)((int)cVar6 & 0x7f) << 0x31;
          cVar6 = *(char *)(param_1 + 8);
          uVar14 = (ulong)cVar6;
          if (cVar6 < 0) {
            if (unaff_x26 == (dword *)((long)&MACH_HEADER.cpusubtype + 1)) goto LAB_004b9b68;
            uVar14 = (ulong)*(char *)(param_1 + 9);
            if (*(char *)(param_1 + 9) < '\0') goto LAB_004b9d9c;
            uVar12 = uVar12 | (ulong)((int)cVar6 & 0x7f) << 0x38;
            pdVar20 = (dword *)((long)&MACH_HEADER.cpusubtype + 2);
            lVar16 = 0x3f;
          }
          else {
            pdVar20 = (dword *)((long)&MACH_HEADER.cpusubtype + 1);
            lVar16 = 0x38;
          }
        }
        else {
          pdVar20 = &MACH_HEADER.cpusubtype;
          lVar16 = 0x31;
        }
      }
      else {
        pdVar20 = (dword *)((long)&MACH_HEADER.cputype + 3);
        lVar16 = 0x2a;
      }
    }
    pdVar20 = (dword *)((long)pdVar20 + param_1);
    pdVar19 = (dword *)((long)(int)uVar14 << lVar16 | uVar12);
    pdVar9 = pdVar19;
    if (section_00000aa8.sectname + 1 < pdVar19) {
      pdVar9 = (dword *)(section_00000aa8.sectname + 2);
    }
    if (pdVar19 == (dword *)0x0) {
      unaff_x27 = (dword *)0x0;
      uStack0000000000000018 = (dword *)0x0;
      in_stack_00000020 = &MACH_HEADER.cpusubtype;
    }
    else {
      pdVar8 = (dword *)func_0x00187bd0((long)pdVar9 * 0x18,8);
      if (pdVar8 == (dword *)0x0) {
        param_1 = func_0x007a1f00(8,(long)pdVar9 * 0x18,&UNK_009e55f8);
LAB_004b9d9c:
        uVar11 = 1;
        goto LAB_004b9b70;
      }
      uStack0000000000000010 = 1;
      in_stack_00000028 = (dword *)0x0;
      pdVar17 = pdVar20;
      uStack0000000000000018 = pdVar9;
      in_stack_00000020 = pdVar8;
      do {
        uVar1 = ___ZN12tracing_core8metadata9MAX_LEVEL17h4f715bd39d097130E;
        if (___ZN12tracing_core8metadata9MAX_LEVEL17h4f715bd39d097130E < 3) {
          if ((___ZN12tracing_core8metadata9MAX_LEVEL17h4f715bd39d097130E < 3) &&
             (((bRam0000000000a2a7c8 - 1 < 2 ||
               ((bRam0000000000a2a7c8 != 0 && (cVar6 = func_0x007b1274(0xa2a7b8), cVar6 != '\0'))))
              && (iVar7 = func_0x005e7964(lRam0000000000a2a7b8), iVar7 != 0)))) {
            in_stack_00000070 = lRam0000000000a2a7b8 + 0x30;
            uStack0000000000000060 = 8;
            in_stack_00000068 = 0;
            func_0x005e699c(&uStack0000000000000078,lRam0000000000a2a7b8,&uStack0000000000000060);
          }
          else {
            uStack0000000000000078 = (undefined *)0x2;
            in_stack_00000098 = 0;
          }
          uStack0000000000000038 = in_stack_00000080;
          uStack0000000000000030 = uStack0000000000000078;
          uStack0000000000000048 = in_stack_00000090;
          in_stack_00000040 = in_stack_00000088;
          in_stack_00000050 = in_stack_00000098;
          if (uStack0000000000000078 != (undefined *)0x2) {
            func_0x005ec344(&uStack0000000000000030,&uStack0000000000000048);
          }
        }
        if (pdVar18 == (dword *)0x0) goto code_r0x004b9908;
        uVar12 = (ulong)(byte)*pdVar17;
        if ((char)(byte)*pdVar17 < '\0') {
          if (pdVar18 != (dword *)((long)&MACH_HEADER.magic + 1)) {
            uVar14 = uVar12 & 0x7f;
            uVar12 = (ulong)*(byte *)((long)pdVar17 + 1);
            if ((char)*(byte *)((long)pdVar17 + 1) < '\0') {
              if (pdVar18 == (dword *)((long)&MACH_HEADER.magic + 2)) {
code_r0x004b9908:
                pdVar20 = (dword *)0x0;
                pdVar17 = (dword *)((long)&MACH_HEADER.magic + 1);
                pdVar18 = unaff_x26;
                if (uVar1 < 3 && uStack0000000000000030 != (undefined *)0x2) goto code_r0x004b9920;
                goto code_r0x004b9b00;
              }
              uVar14 = uVar14 | (uVar12 & 0x7f) << 7;
              uVar12 = (ulong)*(byte *)((long)pdVar17 + 2);
              if ((char)*(byte *)((long)pdVar17 + 2) < '\0') {
                if (pdVar18 == (dword *)((long)&MACH_HEADER.magic + 3)) goto code_r0x004b9908;
                uVar14 = uVar14 | (uVar12 & 0x7f) << 0xe;
                uVar12 = (ulong)*(byte *)((long)pdVar17 + 3);
                if ((char)*(byte *)((long)pdVar17 + 3) < '\0') {
                  if (pdVar18 == &MACH_HEADER.cputype) goto code_r0x004b9908;
                  uVar14 = uVar14 | (uVar12 & 0x7f) << 0x15;
                  uVar12 = (ulong)(byte)pdVar17[1];
                  if ((char)(byte)pdVar17[1] < '\0') {
                    if (pdVar18 == (dword *)((long)&MACH_HEADER.cputype + 1)) goto code_r0x004b9908;
                    uVar14 = uVar14 | (uVar12 & 0x7f) << 0x1c;
                    bVar2 = *(byte *)((long)pdVar17 + 5);
                    uVar12 = (ulong)bVar2;
                    if ((char)bVar2 < '\0') {
                      if (pdVar18 == (dword *)((long)&MACH_HEADER.cputype + 2))
                      goto code_r0x004b9908;
                      uVar14 = uVar14 | (ulong)(bVar2 & 0x7f) << 0x23;
                      bVar2 = *(byte *)((long)pdVar17 + 6);
                      uVar12 = (ulong)bVar2;
                      if ((char)bVar2 < '\0') {
                        if (pdVar18 == (dword *)((long)&MACH_HEADER.cputype + 3))
                        goto code_r0x004b9908;
                        uVar14 = uVar14 | (ulong)(bVar2 & 0x7f) << 0x2a;
                        bVar2 = *(byte *)((long)pdVar17 + 7);
                        uVar12 = (ulong)bVar2;
                        if ((char)bVar2 < '\0') {
                          if (pdVar18 == &MACH_HEADER.cpusubtype) goto code_r0x004b9908;
                          uVar14 = uVar14 | (ulong)(bVar2 & 0x7f) << 0x31;
                          bVar2 = (byte)pdVar17[2];
                          uVar12 = (ulong)bVar2;
                          if ((char)bVar2 < '\0') {
                            if (pdVar18 == (dword *)((long)&MACH_HEADER.cpusubtype + 1))
                            goto code_r0x004b9908;
                            if ((char)*(byte *)((long)pdVar17 + 9) < '\0') {
                              unaff_x27 = (dword *)((ulong)in_stack_00000008 & 0xffffffffffffff00 |
                                                   0x2f);
                              pdVar20 = (dword *)((long)&MACH_HEADER.magic + 1);
                              unaff_x26 = pdVar18;
                              in_stack_00000008 = unaff_x27;
                              if (uVar1 < 3 && uStack0000000000000030 != (undefined *)0x2)
                              goto code_r0x004b9920;
                              goto code_r0x004b9b00;
                            }
                            uVar14 = uVar14 | (ulong)(bVar2 & 0x7f) << 0x38;
                            uVar12 = (ulong)*(byte *)((long)pdVar17 + 9);
                            lVar16 = 0x3f;
                            pdVar20 = (dword *)((long)&MACH_HEADER.cpusubtype + 2);
                          }
                          else {
                            lVar16 = 0x38;
                            pdVar20 = (dword *)((long)&MACH_HEADER.cpusubtype + 1);
                          }
                        }
                        else {
                          lVar16 = 0x31;
                          pdVar20 = &MACH_HEADER.cpusubtype;
                        }
                      }
                      else {
                        lVar16 = 0x2a;
                        pdVar20 = (dword *)((long)&MACH_HEADER.cputype + 3);
                      }
                    }
                    else {
                      lVar16 = 0x23;
                      pdVar20 = (dword *)((long)&MACH_HEADER.cputype + 2);
                    }
                  }
                  else {
                    lVar16 = 0x1c;
                    pdVar20 = (dword *)((long)&MACH_HEADER.cputype + 1);
                  }
                }
                else {
                  lVar16 = 0x15;
                  pdVar20 = &MACH_HEADER.cputype;
                }
              }
              else {
                lVar16 = 0xe;
                pdVar20 = (dword *)((long)&MACH_HEADER.magic + 3);
              }
            }
            else {
              lVar16 = 7;
              pdVar20 = (dword *)((long)&MACH_HEADER.magic + 2);
            }
            goto code_r0x004b97c4;
          }
          pdVar20 = (dword *)0x0;
          pdVar17 = pdVar18;
          pdVar18 = unaff_x26;
          if (uVar1 < 3 && uStack0000000000000030 != (undefined *)0x2) {
code_r0x004b9920:
            func_0x005ec378(&uStack0000000000000030,&uStack0000000000000048);
            puVar4 = uStack0000000000000030;
            unaff_x26 = pdVar18;
            if ((uStack0000000000000030 != (undefined *)0x2) &&
               (func_0x005ec3ac(&uStack0000000000000030,uStack0000000000000048),
               puVar4 != (undefined *)0x0)) {
              lVar16 = *uStack0000000000000038;
              *uStack0000000000000038 = lVar16 + -1;
              LORelease();
              if (lVar16 == 1) {
                bVar3 = true;
code_r0x004b9960:
                DataMemoryBarrier(2,1);
                func_0x005e80f0(&uStack0000000000000038);
                pdVar18 = pdVar17;
                if (!bVar3) goto code_r0x004b9970;
              }
            }
          }
          else {
            pdVar17 = (dword *)((long)&MACH_HEADER.magic + 1);
          }
code_r0x004b9b00:
          if (in_stack_00000028 != (dword *)0x0) {
            pdVar18 = in_stack_00000020 + 2;
            pdVar9 = in_stack_00000028;
            do {
              if (*(long *)(pdVar18 + -2) != 0) {
                func_0x00187bd4(*(undefined8 *)pdVar18,*(long *)(pdVar18 + -2),1);
              }
              pdVar18 = pdVar18 + 6;
              pdVar9 = (dword *)((long)pdVar9 + -1);
            } while (pdVar9 != (dword *)0x0);
          }
          if (uStack0000000000000018 != (dword *)0x0) {
            func_0x00187bd4(in_stack_00000020,(long)uStack0000000000000018 * 0x18,8);
          }
          unaff_x19[1] = pdVar20;
          unaff_x19[2] = pdVar17;
          goto code_r0x004b9b7c;
        }
        uVar14 = 0;
        lVar16 = 0;
        pdVar20 = (dword *)((long)&MACH_HEADER.magic + 1);
code_r0x004b97c4:
        unaff_x26 = (dword *)((long)pdVar18 - (long)pdVar20);
        if (pdVar18 < pdVar20) {
          func_0x007a28a4(pdVar20,pdVar18,&UNK_009e4938);
          goto code_r0x004b9d84;
        }
        pbVar10 = (byte *)(uVar12 << lVar16 | uVar14);
        pdVar18 = unaff_x26;
        if (pbVar10 <= unaff_x26) {
          pdVar18 = (dword *)0x0;
        }
        pdVar17 = (dword *)((long)pdVar17 + (long)pdVar20);
        if (unaff_x26 < pbVar10) {
          pdVar20 = (dword *)((long)&MACH_HEADER.magic + 1);
          unaff_x27 = (dword *)((long)&MACH_HEADER.sizeofcmds + 3);
          pdVar18 = unaff_x26;
          if (uVar1 < 3 && uStack0000000000000030 != (undefined *)0x2) goto code_r0x004b9920;
          goto code_r0x004b9b00;
        }
        unaff_x24 = (dword *)(pbVar10 + -(long)pdVar18);
        pdVar18 = (dword *)((long)unaff_x26 - (long)unaff_x24);
        if (unaff_x26 < unaff_x24) {
          uStack0000000000000078 = &UNK_009e56c8;
          in_stack_00000080 = (long *)((long)&MACH_HEADER.magic + 1);
          in_stack_00000090 = 0;
          in_stack_00000098 = 0;
          in_stack_00000088 = 8;
          func_0x007a2420(&uStack0000000000000078,&UNK_009e56f8);
          goto code_r0x004b9d84;
        }
        if ((long)unaff_x24 < 0) {
          uStack0000000000000010 = 0;
code_r0x004b9d70:
          func_0x007a1f00(uStack0000000000000010,pdVar9,&UNK_009e5710);
code_r0x004b9d84:
                    /* WARNING: Does not return */
          pcVar5 = (code *)SoftwareBreakpoint(1,0x4b9d88);
          (*pcVar5)();
        }
        if (unaff_x24 == (dword *)0x0) {
          pdVar9 = (dword *)((long)&MACH_HEADER.magic + 1);
        }
        else {
          pdVar9 = (dword *)func_0x00187bd0(unaff_x24,1);
          if (pdVar9 == (dword *)0x0) {
            pdVar9 = unaff_x24;
            goto code_r0x004b9d70;
          }
        }
        pdVar20 = (dword *)((long)pdVar17 + (long)unaff_x24);
        _memcpy(pdVar9,pdVar17,unaff_x24);
        unaff_x26 = unaff_x24;
        unaff_x27 = pdVar9;
        if ((uVar1 < 3) && (uStack0000000000000030 != (undefined *)0x2)) {
          func_0x005ec378(&uStack0000000000000030,&uStack0000000000000048);
          puVar4 = uStack0000000000000030;
          if ((uStack0000000000000030 != (undefined *)0x2) &&
             (func_0x005ec3ac(&uStack0000000000000030,uStack0000000000000048),
             puVar4 != (undefined *)0x0)) {
            lVar16 = *uStack0000000000000038;
            *uStack0000000000000038 = lVar16 + -1;
            LORelease();
            if (lVar16 == 1) {
              bVar3 = false;
              pdVar17 = pdVar18;
              goto code_r0x004b9960;
            }
          }
        }
code_r0x004b9970:
        pdVar8 = in_stack_00000028;
        if (in_stack_00000028 == uStack0000000000000018) {
          func_0x004aae30(&uStack0000000000000018,&UNK_009e5610);
        }
        pdVar17 = in_stack_00000020 + (long)pdVar8 * 6;
        *(dword **)pdVar17 = unaff_x26;
        *(dword **)(pdVar17 + 2) = unaff_x27;
        *(dword **)(pdVar17 + 4) = unaff_x24;
        unaff_x27 = (dword *)((long)pdVar8 + 1);
        pdVar19 = (dword *)((long)pdVar19 + -1);
        pdVar17 = pdVar20;
        in_stack_00000028 = unaff_x27;
      } while (pdVar19 != (dword *)0x0);
    }
    uVar11 = 0;
    unaff_x19[1] = pdVar20;
    unaff_x19[2] = pdVar18;
    lVar16 = 0x28;
    lVar15 = 0x20;
    unaff_x19[3] = uStack0000000000000018;
    unaff_x26 = in_stack_00000020;
  }
  *(dword **)((long)unaff_x19 + lVar15) = unaff_x26;
  *(dword **)((long)unaff_x19 + lVar16) = unaff_x27;
  *unaff_x19 = uVar11;
  return;
}

