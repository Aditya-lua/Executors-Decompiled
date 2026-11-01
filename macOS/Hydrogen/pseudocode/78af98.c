
/* WARNING: Removing unreachable block (ram,0x0078ada0) */
/* WARNING: Removing unreachable block (ram,0x0078ae00) */
/* WARNING: Removing unreachable block (ram,0x0078af40) */
/* WARNING: Removing unreachable block (ram,0x0078affc) */
/* WARNING: Removing unreachable block (ram,0x0078b020) */
/* WARNING: Removing unreachable block (ram,0x0078b044) */
/* WARNING: Removing unreachable block (ram,0x0078b06c) */
/* WARNING: Removing unreachable block (ram,0x0078b038) */
/* WARNING: Removing unreachable block (ram,0x0078b014) */
/* WARNING: Removing unreachable block (ram,0x0078af58) */
/* WARNING: Removing unreachable block (ram,0x0078ae18) */
/* WARNING: Removing unreachable block (ram,0x0078adc0) */
/* WARNING: Removing unreachable block (ram,0x0078b070) */
/* WARNING: Removing unreachable block (ram,0x0078b088) */

ulong FUN_0078af98(long param_1,undefined8 param_2,undefined8 param_3,dword *param_4,
                  undefined8 param_5)

{
  byte *pbVar1;
  byte bVar2;
  int iVar3;
  dword *pdVar4;
  long lVar5;
  long lVar6;
  byte *pbVar7;
  undefined1 *puVar8;
  undefined1 *puVar9;
  undefined1 *puVar10;
  undefined8 uVar11;
  uint uVar12;
  long *unaff_x19;
  uint uVar13;
  undefined8 unaff_x20;
  byte *pbVar14;
  byte *pbVar15;
  byte *unaff_x21;
  char *pcVar16;
  char *unaff_x22;
  dword *pdVar17;
  long unaff_x23;
  ulong uVar18;
  undefined8 uVar19;
  byte *unaff_x24;
  long unaff_x29;
  undefined1 auVar20 [16];
  long in_stack_00000008;
  long in_stack_00000010;
  long in_stack_00000018;
  undefined8 in_stack_00000020;
  long in_stack_00000028;
  long in_stack_00000030;
  byte *in_stack_00000038;
  long in_stack_00000040;
  long in_stack_00000048;
  undefined2 uStack0000000000000050;
  byte bStack0000000000000052;
  undefined5 uStack0000000000000053;
  undefined1 uStack0000000000000060;
  undefined1 uStack0000000000000080;
  undefined1 auStack_60 [32];
  byte *pbStack_40;
  ulong uStack_38;
  dword *pdStack_30;
  byte *pbStack_28;
  undefined8 uStack_20;
  long *plStack_18;
  
  lVar5 = (**(code **)(param_1 + 0x600))();
  uVar12 = (uint)param_5;
  if (lVar5 == 0) {
LAB_0078b2d0:
    uVar18 = 7;
    pbVar7 = unaff_x24;
  }
  else {
    pdVar4 = (dword *)_strcspn();
    uVar12 = (uint)param_5;
    unaff_x21 = unaff_x24 + (long)pdVar4;
    pdVar17 = (dword *)((long)unaff_x22 + (unaff_x23 - (long)unaff_x21));
    uVar13 = (uint)unaff_x20;
    pbVar7 = unaff_x24;
    if (pdVar4 == (dword *)0x0) {
      if ((uVar13 >> 10 & 1) != 0) {
        iVar3 = func_0x007408a0(&uStack0000000000000080,"");
        uVar12 = (uint)param_5;
        if (iVar3 == 0) goto code_r0x0078b094;
        goto LAB_0078b2d0;
      }
      uVar18 = 0xe;
    }
    else {
      param_5 = unaff_x20;
      uVar18 = func_0x00788d28();
      uVar12 = (uint)param_5;
      param_4 = pdVar4;
      if ((int)uVar18 == 0) {
code_r0x0078b094:
        unaff_x24 = (byte *)_strchr(unaff_x21,0x23);
        if (unaff_x24 == (byte *)0x0) {
code_r0x0078b0e4:
          param_4 = pdVar17;
          lVar6 = _memchr(unaff_x21,0x3f,pdVar17);
          unaff_x22 = (char *)pdVar17;
joined_r0x0078b0f4:
          if (lVar6 != 0) {
            pbVar7 = (byte *)((long)unaff_x22 + (long)unaff_x21);
            if (unaff_x24 != (byte *)0x0) {
              pbVar7 = unaff_x24;
            }
            unaff_x24 = pbVar7 + -lVar6;
            unaff_x22 = (char *)((long)unaff_x22 - (long)unaff_x24);
            bStack0000000000000052 = bStack0000000000000052 | 1;
            if (unaff_x24 < (byte *)((long)&MACH_HEADER.magic + 2)) {
              in_stack_00000040 = (*pcRam0000000000a2b600)("");
            }
            else {
              if ((uVar13 >> 7 & 1) != 0) {
                func_0x0074066c(&uStack0000000000000060,&UNK_007a1200);
                param_4 = (dword *)(unaff_x24 + -1);
                param_5 = 1;
                uVar18 = func_0x00789f10(&uStack0000000000000060,lVar6 + 1,param_4,1,1);
                uVar12 = (uint)param_5;
                if ((int)uVar18 != 0) goto code_r0x0078b240;
                in_stack_00000040 = func_0x00740a58(&uStack0000000000000060);
                goto code_r0x0078b158;
              }
              in_stack_00000040 = func_0x0077e93c(lVar6 + 1,unaff_x24 + -1);
            }
            uVar12 = (uint)param_5;
            if (in_stack_00000040 == 0) goto LAB_0078b2d0;
          }
code_r0x0078b158:
          uVar12 = (uint)param_5;
          pbVar7 = unaff_x24;
          if ((dword *)unaff_x22 != (dword *)0x0) {
            if ((uVar13 >> 7 & 1) != 0) {
              func_0x0074066c(&uStack0000000000000060,&UNK_007a1200);
              param_5 = 1;
              param_4 = (dword *)unaff_x22;
              uVar18 = func_0x00789f10(&uStack0000000000000060,unaff_x21,unaff_x22,1,0);
              uVar12 = (uint)param_5;
              if ((int)uVar18 != 0) goto code_r0x0078b240;
              unaff_x22 = (char *)func_0x00156654(&uStack0000000000000060);
              unaff_x21 = (byte *)func_0x00740a58(&uStack0000000000000060);
              in_stack_00000038 = unaff_x21;
            }
            uVar12 = (uint)param_5;
            if ((byte *)((long)&MACH_HEADER.magic + 1) < unaff_x22) {
              if (in_stack_00000038 == (byte *)0x0) {
                unaff_x21 = (byte *)func_0x0077e93c(unaff_x21,unaff_x22);
                uVar12 = (uint)param_5;
                in_stack_00000038 = unaff_x21;
                if (unaff_x21 == (byte *)0x0) goto LAB_0078b2d0;
              }
              else if ((uVar13 >> 7 & 1) != 0) {
                in_stack_00000038[(long)unaff_x22] = 0;
              }
              uVar12 = (uint)param_5;
              if ((uVar13 >> 4 & 1) == 0) {
                param_4 = (dword *)unaff_x22;
                lVar6 = _memchr(unaff_x21,0x2e,unaff_x22);
                uVar12 = (uint)param_5;
                if (lVar6 != 0) {
                  pbVar7 = (byte *)(*pcRam0000000000a2b5e8)((byte *)((long)unaff_x22 + 1));
                  uVar12 = (uint)param_5;
                  if (pbVar7 != (byte *)0x0) {
                    pbVar1 = unaff_x21 + (long)unaff_x22;
                    unaff_x22 = "./";
                    *pbVar7 = 0;
                    pbVar15 = pbVar7;
                    do {
                      bVar2 = *unaff_x21;
                      uVar18 = (ulong)bVar2;
                      if (bVar2 == 0x2e) {
                        param_4 = (dword *)((long)&MACH_HEADER.magic + 2);
                        iVar3 = _strncmp("./",unaff_x21,2);
                        if (iVar3 == 0) {
code_r0x0078b2d8:
                          unaff_x21 = unaff_x21 + 2;
                        }
                        else {
                          param_4 = (dword *)((long)&MACH_HEADER.magic + 3);
                          iVar3 = _strncmp("../",unaff_x21,3);
                          if (iVar3 != 0) {
                            iVar3 = _strcmp(".",unaff_x21);
                            uVar12 = (uint)param_5;
                            if (iVar3 != 0) {
                              iVar3 = _strcmp("..",unaff_x21);
                              uVar12 = (uint)param_5;
                              if (iVar3 != 0) {
                                param_4 = (dword *)((long)&MACH_HEADER.magic + 2);
                                iVar3 = _strncmp(".?",unaff_x21,2);
                                uVar12 = (uint)param_5;
                                if (iVar3 != 0) {
                                  param_4 = (dword *)((long)&MACH_HEADER.magic + 3);
                                  iVar3 = _strncmp("..?",unaff_x21,3);
                                  uVar12 = (uint)param_5;
                                  pbVar14 = pbVar15;
                                  if (iVar3 != 0) goto code_r0x0078b404;
                                }
                              }
                            }
                            *pbVar7 = 0;
                            break;
                          }
                          unaff_x21 = unaff_x21 + 3;
                        }
                      }
                      else {
                        pbVar14 = pbVar15;
                        if (bVar2 == 0x2f) {
                          param_4 = (dword *)((long)&MACH_HEADER.magic + 3);
                          iVar3 = _strncmp("/./",unaff_x21,3);
                          if (iVar3 == 0) goto code_r0x0078b2d8;
                          iVar3 = _strcmp("/.",unaff_x21);
                          uVar12 = (uint)param_5;
                          if (iVar3 == 0) goto code_r0x0078b460;
                          param_4 = (dword *)((long)&MACH_HEADER.magic + 3);
                          iVar3 = _strncmp("/.?",unaff_x21,3);
                          uVar12 = (uint)param_5;
                          if (iVar3 == 0) goto code_r0x0078b460;
                          param_4 = &MACH_HEADER.cputype;
                          iVar3 = _strncmp("/../",unaff_x21,4);
                          if (iVar3 != 0) {
                            iVar3 = _strcmp("/..",unaff_x21);
                            if (iVar3 != 0) {
                              param_4 = &MACH_HEADER.cputype;
                              iVar3 = _strncmp("/..?",unaff_x21,4);
                              if (iVar3 != 0) goto code_r0x0078b404;
                            }
                            goto code_r0x0078b458;
                          }
                          unaff_x21 = unaff_x21 + 3;
                          do {
                            if (pbVar15 <= pbVar7) break;
                            pbVar15 = pbVar15 + -1;
                          } while (*pbVar15 != 0x2f);
                        }
                        else {
code_r0x0078b404:
                          do {
                            pbVar15 = pbVar14 + 1;
                            *pbVar14 = (byte)uVar18;
                            unaff_x21 = unaff_x21 + 1;
                            uVar18 = (ulong)*unaff_x21;
                            pbVar14 = pbVar15;
                          } while (0x3f < *unaff_x21 ||
                                   (1L << (uVar18 & 0x3f) & 0x8000800000000001U) == 0);
                        }
                        *pbVar15 = 0;
                      }
                      uVar12 = (uint)param_5;
                    } while (unaff_x21 < pbVar1);
                    goto code_r0x0078b478;
                  }
                  goto LAB_0078b2d0;
                }
              }
            }
          }
          goto code_r0x0078b490;
        }
        unaff_x22 = (char *)(unaff_x24 + -(long)unaff_x21);
        uVar18 = (long)pdVar17 - (long)unaff_x22;
        bStack0000000000000052 = bStack0000000000000052 | 2;
        pdVar17 = (dword *)unaff_x22;
        if (uVar18 < 2) goto code_r0x0078b0e4;
        if ((uVar13 >> 7 & 1) == 0) {
          in_stack_00000048 = func_0x0077e93c(unaff_x24 + 1,uVar18 - 1);
          uVar12 = (uint)param_5;
          if (in_stack_00000048 == 0) goto LAB_0078b2d0;
          goto code_r0x0078b0e4;
        }
        func_0x0074066c(&uStack0000000000000060,&UNK_007a1200);
        param_4 = (dword *)(uVar18 - 1);
        param_5 = 1;
        uVar18 = func_0x00789f10(&uStack0000000000000060,unaff_x24 + 1,param_4,1,0);
        uVar12 = (uint)param_5;
        if ((int)uVar18 == 0) {
          in_stack_00000048 = func_0x00740a58(&uStack0000000000000060);
          param_4 = (dword *)unaff_x22;
          lVar6 = _memchr(unaff_x21,0x3f,unaff_x22);
          goto joined_r0x0078b0f4;
        }
code_r0x0078b240:
        pbVar7 = unaff_x24;
      }
    }
  }
  func_0x00740678(&uStack0000000000000080);
  unaff_x19 = (long *)0xa2b5f0;
  (*pcRam0000000000a2b5f0)(lVar5);
  (*pcRam0000000000a2b5f0)(in_stack_00000008);
  (*pcRam0000000000a2b5f0)(in_stack_00000010);
  (*pcRam0000000000a2b5f0)(in_stack_00000018);
  (*pcRam0000000000a2b5f0)(in_stack_00000020);
  (*pcRam0000000000a2b5f0)(in_stack_00000028);
  (*pcRam0000000000a2b5f0)(in_stack_00000030);
  (*pcRam0000000000a2b5f0)(in_stack_00000038);
  (*pcRam0000000000a2b5f0)(in_stack_00000040);
  (*pcRam0000000000a2b5f0)(in_stack_00000048);
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
    return uVar18;
  }
  goto code_r0x0078b558;
  while (pbVar15 = pbVar15 + -1, *pbVar15 != 0x2f) {
code_r0x0078b458:
    uVar12 = (uint)param_5;
    if (pbVar15 <= pbVar7) break;
  }
code_r0x0078b460:
  *pbVar15 = 0x2f;
  pbVar15[1] = 0;
code_r0x0078b478:
  (*pcRam0000000000a2b5f0)(in_stack_00000038);
  in_stack_00000038 = pbVar7;
code_r0x0078b490:
  lVar6 = func_0x00740a58(&uStack0000000000000080);
  unaff_x20 = 0xa2b5f0;
  (*pcRam0000000000a2b5f0)(*unaff_x19);
  (*pcRam0000000000a2b5f0)(unaff_x19[1]);
  (*pcRam0000000000a2b5f0)(unaff_x19[2]);
  (*pcRam0000000000a2b5f0)(unaff_x19[3]);
  (*pcRam0000000000a2b5f0)(unaff_x19[4]);
  (*pcRam0000000000a2b5f0)(unaff_x19[5]);
  (*pcRam0000000000a2b5f0)(unaff_x19[6]);
  (*pcRam0000000000a2b5f0)(unaff_x19[7]);
  (*pcRam0000000000a2b5f0)(unaff_x19[8]);
  (*pcRam0000000000a2b5f0)(unaff_x19[9]);
  uVar18 = 0;
  unaff_x19[5] = in_stack_00000028;
  unaff_x19[4] = lVar6;
  unaff_x19[7] = (long)in_stack_00000038;
  unaff_x19[6] = in_stack_00000030;
  unaff_x19[9] = in_stack_00000048;
  unaff_x19[8] = in_stack_00000040;
  unaff_x19[10] =
       CONCAT53(uStack0000000000000053,CONCAT12(bStack0000000000000052,uStack0000000000000050));
  unaff_x19[1] = in_stack_00000008;
  *unaff_x19 = lVar5;
  unaff_x19[3] = in_stack_00000018;
  unaff_x19[2] = in_stack_00000010;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
    return 0;
  }
code_r0x0078b558:
  auVar20 = ___stack_chk_fail();
  pcVar16 = auVar20._8_8_;
  puVar8 = auVar20._0_8_;
  pbStack_40 = pbVar7;
  uStack_38 = uVar18;
  pdStack_30 = (dword *)unaff_x22;
  pbStack_28 = unaff_x21;
  uStack_20 = unaff_x20;
  plStack_18 = unaff_x19;
  lVar5 = _strstr(puVar8,"//");
  puVar10 = puVar8;
  if (lVar5 != 0) {
    puVar10 = (undefined1 *)(lVar5 + 2);
  }
  if (*pcVar16 == '#') {
    puVar10 = (undefined1 *)_strchr(puVar10,0x23);
joined_r0x0078b5d8:
    if (puVar10 != (undefined1 *)0x0) {
      *puVar10 = 0;
    }
  }
  else {
    if (*pcVar16 == '/') {
      if (pcVar16[1] == '/') {
        uVar19 = 0;
        *puVar10 = 0;
        pcVar16 = pcVar16 + 2;
        goto code_r0x0078b640;
      }
      puVar10 = (undefined1 *)_strchr(puVar10,0x2f);
      goto joined_r0x0078b5d8;
    }
    puVar9 = (undefined1 *)_strchr(puVar10,0x3f);
    if ((puVar9 != (undefined1 *)0x0) ||
       (puVar9 = (undefined1 *)_strchr(puVar10,0x23), puVar9 != (undefined1 *)0x0)) {
      *puVar9 = 0;
    }
    if ((*pcVar16 != '?') && (lVar5 = _strrchr(puVar10,0x2f), lVar5 != 0)) {
      *(undefined1 *)(lVar5 + 1) = 0;
    }
  }
  uVar19 = 1;
code_r0x0078b640:
  func_0x0074066c(auStack_60,&UNK_007a1200);
  iVar3 = func_0x007408a0(auStack_60,puVar8);
  if (iVar3 == 0) {
    uVar11 = _strlen(pcVar16);
    uVar18 = func_0x00789f10(auStack_60,pcVar16,uVar11,uVar19,0);
    if ((int)uVar18 == 0) {
      uVar19 = func_0x00740a58(auStack_60);
      uVar18 = func_0x0078aa74(uVar19,param_4,uVar12 & 0xffffffef);
    }
    func_0x00740678(auStack_60);
  }
  else {
    uVar12 = 0x1f;
    if (iVar3 != 100) {
      uVar12 = 7;
    }
    uVar18 = (ulong)uVar12;
  }
  return uVar18;
}

