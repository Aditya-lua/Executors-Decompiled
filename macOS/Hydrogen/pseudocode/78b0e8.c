
ulong FUN_0078b0e8(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  byte *pbVar1;
  byte bVar2;
  int iVar3;
  long lVar4;
  ulong uVar5;
  byte *pbVar6;
  undefined8 uVar7;
  undefined1 *puVar8;
  undefined1 *puVar9;
  undefined1 *puVar10;
  undefined8 uVar11;
  dword *pdVar12;
  uint uVar13;
  uint uVar14;
  undefined8 *unaff_x19;
  undefined8 unaff_x20;
  byte *pbVar15;
  byte *pbVar16;
  byte *unaff_x21;
  char *pcVar17;
  char *unaff_x22;
  byte *unaff_x24;
  long unaff_x29;
  undefined1 auVar18 [16];
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  byte *in_stack_00000038;
  long in_stack_00000040;
  undefined8 in_stack_00000048;
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
  undefined8 *puStack_18;
  
  pdVar12 = (dword *)unaff_x22;
  lVar4 = _memchr(param_1,0x3f);
  uVar14 = (uint)unaff_x20;
  if (lVar4 == 0) {
LAB_0078b158:
    uVar13 = (uint)param_4;
    pbVar6 = unaff_x24;
    if ((dword *)unaff_x22 != (dword *)0x0) {
      if ((uVar14 >> 7 & 1) != 0) {
        func_0x0074066c(&uStack0000000000000060,&UNK_007a1200);
        param_4 = 1;
        pdVar12 = (dword *)unaff_x22;
        uVar5 = func_0x00789f10(&uStack0000000000000060);
        uVar13 = (uint)param_4;
        if ((int)uVar5 != 0) goto code_r0x0078b240;
        unaff_x22 = (char *)func_0x00156654(&uStack0000000000000060);
        unaff_x21 = (byte *)func_0x00740a58(&uStack0000000000000060);
        in_stack_00000038 = unaff_x21;
      }
      uVar13 = (uint)param_4;
      if ((byte *)((long)&MACH_HEADER.magic + 1) < unaff_x22) {
        if (in_stack_00000038 == (byte *)0x0) {
          unaff_x21 = (byte *)func_0x0077e93c(unaff_x21,unaff_x22);
          uVar13 = (uint)param_4;
          in_stack_00000038 = unaff_x21;
          if (unaff_x21 == (byte *)0x0) goto code_r0x0078b2d0;
        }
        else if ((uVar14 >> 7 & 1) != 0) {
          in_stack_00000038[(long)unaff_x22] = 0;
        }
        uVar13 = (uint)param_4;
        if ((uVar14 >> 4 & 1) == 0) {
          pdVar12 = (dword *)unaff_x22;
          lVar4 = _memchr(unaff_x21,0x2e,unaff_x22);
          uVar13 = (uint)param_4;
          if (lVar4 != 0) {
            pbVar6 = (byte *)(*pcRam0000000000a2b5e8)((byte *)((long)unaff_x22 + 1));
            uVar13 = (uint)param_4;
            if (pbVar6 == (byte *)0x0) goto code_r0x0078b2d0;
            pbVar1 = unaff_x21 + (long)unaff_x22;
            unaff_x22 = "./";
            *pbVar6 = 0;
            pbVar16 = pbVar6;
            do {
              bVar2 = *unaff_x21;
              uVar5 = (ulong)bVar2;
              if (bVar2 == 0x2e) {
                pdVar12 = (dword *)((long)&MACH_HEADER.magic + 2);
                iVar3 = _strncmp("./",unaff_x21,2);
                if (iVar3 == 0) {
code_r0x0078b2d8:
                  unaff_x21 = unaff_x21 + 2;
                }
                else {
                  pdVar12 = (dword *)((long)&MACH_HEADER.magic + 3);
                  iVar3 = _strncmp("../",unaff_x21,3);
                  if (iVar3 != 0) {
                    iVar3 = _strcmp(".",unaff_x21);
                    uVar13 = (uint)param_4;
                    if (iVar3 != 0) {
                      iVar3 = _strcmp("..",unaff_x21);
                      uVar13 = (uint)param_4;
                      if (iVar3 != 0) {
                        pdVar12 = (dword *)((long)&MACH_HEADER.magic + 2);
                        iVar3 = _strncmp(".?",unaff_x21,2);
                        uVar13 = (uint)param_4;
                        if (iVar3 != 0) {
                          pdVar12 = (dword *)((long)&MACH_HEADER.magic + 3);
                          iVar3 = _strncmp("..?",unaff_x21,3);
                          uVar13 = (uint)param_4;
                          pbVar15 = pbVar16;
                          if (iVar3 != 0) goto code_r0x0078b404;
                        }
                      }
                    }
                    *pbVar6 = 0;
                    break;
                  }
                  unaff_x21 = unaff_x21 + 3;
                }
              }
              else {
                pbVar15 = pbVar16;
                if (bVar2 == 0x2f) {
                  pdVar12 = (dword *)((long)&MACH_HEADER.magic + 3);
                  iVar3 = _strncmp("/./",unaff_x21,3);
                  if (iVar3 == 0) goto code_r0x0078b2d8;
                  iVar3 = _strcmp("/.",unaff_x21);
                  uVar13 = (uint)param_4;
                  if (iVar3 == 0) goto code_r0x0078b460;
                  pdVar12 = (dword *)((long)&MACH_HEADER.magic + 3);
                  iVar3 = _strncmp("/.?",unaff_x21,3);
                  uVar13 = (uint)param_4;
                  if (iVar3 == 0) goto code_r0x0078b460;
                  pdVar12 = &MACH_HEADER.cputype;
                  iVar3 = _strncmp("/../",unaff_x21,4);
                  if (iVar3 != 0) {
                    iVar3 = _strcmp("/..",unaff_x21);
                    if (iVar3 != 0) {
                      pdVar12 = &MACH_HEADER.cputype;
                      iVar3 = _strncmp("/..?",unaff_x21,4);
                      if (iVar3 != 0) goto code_r0x0078b404;
                    }
                    goto code_r0x0078b458;
                  }
                  unaff_x21 = unaff_x21 + 3;
                  do {
                    if (pbVar16 <= pbVar6) break;
                    pbVar16 = pbVar16 + -1;
                  } while (*pbVar16 != 0x2f);
                }
                else {
code_r0x0078b404:
                  do {
                    pbVar16 = pbVar15 + 1;
                    *pbVar15 = (byte)uVar5;
                    unaff_x21 = unaff_x21 + 1;
                    uVar5 = (ulong)*unaff_x21;
                    pbVar15 = pbVar16;
                  } while (0x3f < *unaff_x21 || (1L << (uVar5 & 0x3f) & 0x8000800000000001U) == 0);
                }
                *pbVar16 = 0;
              }
              uVar13 = (uint)param_4;
            } while (unaff_x21 < pbVar1);
            goto code_r0x0078b478;
          }
        }
      }
    }
    goto code_r0x0078b490;
  }
  pbVar6 = (byte *)((long)unaff_x22 + (long)unaff_x21);
  if (unaff_x24 != (byte *)0x0) {
    pbVar6 = unaff_x24;
  }
  unaff_x24 = pbVar6 + -lVar4;
  unaff_x22 = (char *)((long)unaff_x22 - (long)unaff_x24);
  bStack0000000000000052 = bStack0000000000000052 | 1;
  if (unaff_x24 < (byte *)((long)&MACH_HEADER.magic + 2)) {
    in_stack_00000040 = (*pcRam0000000000a2b600)("");
LAB_0078b150:
    uVar13 = (uint)param_4;
    if (in_stack_00000040 != 0) goto LAB_0078b158;
code_r0x0078b2d0:
    uVar5 = 7;
    pbVar6 = unaff_x24;
  }
  else {
    if ((uVar14 >> 7 & 1) == 0) {
      in_stack_00000040 = func_0x0077e93c(lVar4 + 1,unaff_x24 + -1);
      goto LAB_0078b150;
    }
    func_0x0074066c(&uStack0000000000000060,&UNK_007a1200);
    pdVar12 = (dword *)(unaff_x24 + -1);
    param_4 = 1;
    uVar5 = func_0x00789f10(&uStack0000000000000060,lVar4 + 1,pdVar12,1,1);
    uVar13 = (uint)param_4;
    if ((int)uVar5 == 0) {
      in_stack_00000040 = func_0x00740a58(&uStack0000000000000060);
      goto LAB_0078b158;
    }
code_r0x0078b240:
    pbVar6 = unaff_x24;
  }
  func_0x00740678(&uStack0000000000000080);
  unaff_x19 = (undefined8 *)0xa2b5f0;
  (*pcRam0000000000a2b5f0)(in_stack_00000000);
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
    return uVar5;
  }
  goto code_r0x0078b558;
  while (pbVar16 = pbVar16 + -1, *pbVar16 != 0x2f) {
code_r0x0078b458:
    uVar13 = (uint)param_4;
    if (pbVar16 <= pbVar6) break;
  }
code_r0x0078b460:
  *pbVar16 = 0x2f;
  pbVar16[1] = 0;
code_r0x0078b478:
  (*pcRam0000000000a2b5f0)(in_stack_00000038);
  in_stack_00000038 = pbVar6;
code_r0x0078b490:
  uVar7 = func_0x00740a58(&uStack0000000000000080);
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
  uVar5 = 0;
  unaff_x19[5] = in_stack_00000028;
  unaff_x19[4] = uVar7;
  unaff_x19[7] = in_stack_00000038;
  unaff_x19[6] = in_stack_00000030;
  unaff_x19[9] = in_stack_00000048;
  unaff_x19[8] = in_stack_00000040;
  unaff_x19[10] =
       CONCAT53(uStack0000000000000053,CONCAT12(bStack0000000000000052,uStack0000000000000050));
  unaff_x19[1] = in_stack_00000008;
  *unaff_x19 = in_stack_00000000;
  unaff_x19[3] = in_stack_00000018;
  unaff_x19[2] = in_stack_00000010;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
    return 0;
  }
code_r0x0078b558:
  auVar18 = ___stack_chk_fail();
  pcVar17 = auVar18._8_8_;
  puVar8 = auVar18._0_8_;
  pbStack_40 = pbVar6;
  uStack_38 = uVar5;
  pdStack_30 = (dword *)unaff_x22;
  pbStack_28 = unaff_x21;
  uStack_20 = unaff_x20;
  puStack_18 = unaff_x19;
  lVar4 = _strstr(puVar8,"//");
  puVar10 = puVar8;
  if (lVar4 != 0) {
    puVar10 = (undefined1 *)(lVar4 + 2);
  }
  if (*pcVar17 == '#') {
    puVar10 = (undefined1 *)_strchr(puVar10,0x23);
joined_r0x0078b5d8:
    if (puVar10 != (undefined1 *)0x0) {
      *puVar10 = 0;
    }
  }
  else {
    if (*pcVar17 == '/') {
      if (pcVar17[1] == '/') {
        uVar7 = 0;
        *puVar10 = 0;
        pcVar17 = pcVar17 + 2;
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
    if ((*pcVar17 != '?') && (lVar4 = _strrchr(puVar10,0x2f), lVar4 != 0)) {
      *(undefined1 *)(lVar4 + 1) = 0;
    }
  }
  uVar7 = 1;
code_r0x0078b640:
  func_0x0074066c(auStack_60,&UNK_007a1200);
  iVar3 = func_0x007408a0(auStack_60,puVar8);
  if (iVar3 == 0) {
    uVar11 = _strlen(pcVar17);
    uVar5 = func_0x00789f10(auStack_60,pcVar17,uVar11,uVar7,0);
    if ((int)uVar5 == 0) {
      uVar7 = func_0x00740a58(auStack_60);
      uVar5 = func_0x0078aa74(uVar7,pdVar12,uVar13 & 0xffffffef);
    }
    func_0x00740678(auStack_60);
  }
  else {
    uVar14 = 0x1f;
    if (iVar3 != 100) {
      uVar14 = 7;
    }
    uVar5 = (ulong)uVar14;
  }
  return uVar5;
}

