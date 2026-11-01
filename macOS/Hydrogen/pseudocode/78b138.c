
ulong FUN_0078b138(undefined8 param_1,undefined8 param_2,char *param_3,undefined8 param_4)

{
  byte *pbVar1;
  byte bVar2;
  int iVar3;
  long lVar4;
  ulong uVar5;
  long lVar6;
  byte *pbVar7;
  undefined8 uVar8;
  undefined1 *puVar9;
  undefined1 *puVar10;
  undefined1 *puVar11;
  undefined8 uVar12;
  uint uVar13;
  undefined8 *unaff_x19;
  uint uVar14;
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
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined1 uStack0000000000000060;
  undefined1 uStack0000000000000080;
  undefined1 auStack_60 [32];
  byte *pbStack_40;
  ulong uStack_38;
  char *pcStack_30;
  byte *pbStack_28;
  undefined8 uStack_20;
  undefined8 *puStack_18;
  
  lVar4 = (*pcRam0000000000a2b600)("");
  uVar13 = (uint)param_4;
  if (lVar4 != 0) {
    pbVar7 = unaff_x24;
    if (unaff_x22 != (char *)0x0) {
      uVar14 = (uint)unaff_x20;
      if ((uVar14 >> 7 & 1) != 0) {
        func_0x0074066c(&uStack0000000000000060,&UNK_007a1200);
        param_4 = 1;
        param_3 = unaff_x22;
        uVar5 = func_0x00789f10(&uStack0000000000000060);
        uVar13 = (uint)param_4;
        if ((int)uVar5 == 0) {
          unaff_x22 = (char *)func_0x00156654(&uStack0000000000000060);
          unaff_x21 = (byte *)func_0x00740a58(&uStack0000000000000060);
          in_stack_00000038 = unaff_x21;
          goto LAB_0078b1a8;
        }
        goto LAB_0078ab20;
      }
LAB_0078b1a8:
      uVar13 = (uint)param_4;
      if ((char *)0x1 < unaff_x22) {
        if (in_stack_00000038 == (byte *)0x0) {
          unaff_x21 = (byte *)func_0x0077e93c(unaff_x21,unaff_x22);
          uVar13 = (uint)param_4;
          in_stack_00000038 = unaff_x21;
          if (unaff_x21 == (byte *)0x0) goto LAB_0078b2d0;
        }
        else if ((uVar14 >> 7 & 1) != 0) {
          in_stack_00000038[(long)unaff_x22] = 0;
        }
        uVar13 = (uint)param_4;
        if ((uVar14 >> 4 & 1) == 0) {
          param_3 = unaff_x22;
          lVar6 = _memchr(unaff_x21,0x2e,unaff_x22);
          uVar13 = (uint)param_4;
          if (lVar6 != 0) {
            pbVar7 = (byte *)(*pcRam0000000000a2b5e8)(unaff_x22 + 1);
            uVar13 = (uint)param_4;
            if (pbVar7 != (byte *)0x0) {
              pbVar1 = unaff_x21 + (long)unaff_x22;
              unaff_x22 = "./";
              *pbVar7 = 0;
              pbVar16 = pbVar7;
              do {
                bVar2 = *unaff_x21;
                uVar5 = (ulong)bVar2;
                if (bVar2 == 0x2e) {
                  param_3 = (char *)0x2;
                  iVar3 = _strncmp("./",unaff_x21,2);
                  if (iVar3 == 0) {
LAB_0078b2d8:
                    unaff_x21 = unaff_x21 + 2;
                  }
                  else {
                    param_3 = (char *)0x3;
                    iVar3 = _strncmp("../",unaff_x21,3);
                    if (iVar3 != 0) {
                      iVar3 = _strcmp(".",unaff_x21);
                      uVar13 = (uint)param_4;
                      if (iVar3 != 0) {
                        iVar3 = _strcmp("..",unaff_x21);
                        uVar13 = (uint)param_4;
                        if (iVar3 != 0) {
                          param_3 = (char *)0x2;
                          iVar3 = _strncmp(".?",unaff_x21,2);
                          uVar13 = (uint)param_4;
                          if (iVar3 != 0) {
                            param_3 = (char *)0x3;
                            iVar3 = _strncmp("..?",unaff_x21,3);
                            uVar13 = (uint)param_4;
                            pbVar15 = pbVar16;
                            if (iVar3 != 0) goto LAB_0078b404;
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
                  pbVar15 = pbVar16;
                  if (bVar2 == 0x2f) {
                    param_3 = (char *)0x3;
                    iVar3 = _strncmp("/./",unaff_x21,3);
                    if (iVar3 == 0) goto LAB_0078b2d8;
                    iVar3 = _strcmp("/.",unaff_x21);
                    uVar13 = (uint)param_4;
                    if (iVar3 == 0) goto code_r0x0078b460;
                    param_3 = (char *)0x3;
                    iVar3 = _strncmp("/.?",unaff_x21,3);
                    uVar13 = (uint)param_4;
                    if (iVar3 == 0) goto code_r0x0078b460;
                    param_3 = "\f";
                    iVar3 = _strncmp("/../",unaff_x21,4);
                    if (iVar3 != 0) {
                      iVar3 = _strcmp("/..",unaff_x21);
                      if (iVar3 != 0) {
                        param_3 = "\f";
                        iVar3 = _strncmp("/..?",unaff_x21,4);
                        if (iVar3 != 0) goto LAB_0078b404;
                      }
                      goto code_r0x0078b458;
                    }
                    unaff_x21 = unaff_x21 + 3;
                    do {
                      if (pbVar16 <= pbVar7) break;
                      pbVar16 = pbVar16 + -1;
                    } while (*pbVar16 != 0x2f);
                  }
                  else {
LAB_0078b404:
                    do {
                      pbVar16 = pbVar15 + 1;
                      *pbVar15 = (byte)uVar5;
                      unaff_x21 = unaff_x21 + 1;
                      uVar5 = (ulong)*unaff_x21;
                      pbVar15 = pbVar16;
                    } while (0x3f < *unaff_x21 || (1L << (uVar5 & 0x3f) & 0x8000800000000001U) == 0)
                    ;
                  }
                  *pbVar16 = 0;
                }
                uVar13 = (uint)param_4;
              } while (unaff_x21 < pbVar1);
              goto LAB_0078b478;
            }
            goto LAB_0078b2d0;
          }
        }
      }
    }
    goto LAB_0078b490;
  }
LAB_0078b2d0:
  uVar5 = 7;
LAB_0078ab20:
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
  (*pcRam0000000000a2b5f0)(lVar4);
  (*pcRam0000000000a2b5f0)(in_stack_00000048);
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
    return uVar5;
  }
  goto code_r0x0078b558;
  while (pbVar16 = pbVar16 + -1, *pbVar16 != 0x2f) {
code_r0x0078b458:
    uVar13 = (uint)param_4;
    if (pbVar16 <= pbVar7) break;
  }
code_r0x0078b460:
  *pbVar16 = 0x2f;
  pbVar16[1] = 0;
LAB_0078b478:
  (*pcRam0000000000a2b5f0)(in_stack_00000038);
  in_stack_00000038 = pbVar7;
LAB_0078b490:
  uVar8 = func_0x00740a58(&uStack0000000000000080);
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
  unaff_x19[4] = uVar8;
  unaff_x19[7] = in_stack_00000038;
  unaff_x19[6] = in_stack_00000030;
  unaff_x19[9] = in_stack_00000048;
  unaff_x19[8] = lVar4;
  unaff_x19[10] = in_stack_00000050;
  unaff_x19[1] = in_stack_00000008;
  *unaff_x19 = in_stack_00000000;
  unaff_x19[3] = in_stack_00000018;
  unaff_x19[2] = in_stack_00000010;
  unaff_x24 = pbVar7;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
    return 0;
  }
code_r0x0078b558:
  auVar18 = ___stack_chk_fail();
  pcVar17 = auVar18._8_8_;
  puVar9 = auVar18._0_8_;
  pbStack_40 = unaff_x24;
  uStack_38 = uVar5;
  pcStack_30 = unaff_x22;
  pbStack_28 = unaff_x21;
  uStack_20 = unaff_x20;
  puStack_18 = unaff_x19;
  lVar4 = _strstr(puVar9,"//");
  puVar11 = puVar9;
  if (lVar4 != 0) {
    puVar11 = (undefined1 *)(lVar4 + 2);
  }
  if (*pcVar17 == '#') {
    puVar11 = (undefined1 *)_strchr(puVar11,0x23);
joined_r0x0078b5d8:
    if (puVar11 != (undefined1 *)0x0) {
      *puVar11 = 0;
    }
  }
  else {
    if (*pcVar17 == '/') {
      if (pcVar17[1] == '/') {
        uVar8 = 0;
        *puVar11 = 0;
        pcVar17 = pcVar17 + 2;
        goto code_r0x0078b640;
      }
      puVar11 = (undefined1 *)_strchr(puVar11,0x2f);
      goto joined_r0x0078b5d8;
    }
    puVar10 = (undefined1 *)_strchr(puVar11,0x3f);
    if ((puVar10 != (undefined1 *)0x0) ||
       (puVar10 = (undefined1 *)_strchr(puVar11,0x23), puVar10 != (undefined1 *)0x0)) {
      *puVar10 = 0;
    }
    if ((*pcVar17 != '?') && (lVar4 = _strrchr(puVar11,0x2f), lVar4 != 0)) {
      *(undefined1 *)(lVar4 + 1) = 0;
    }
  }
  uVar8 = 1;
code_r0x0078b640:
  func_0x0074066c(auStack_60,&UNK_007a1200);
  iVar3 = func_0x007408a0(auStack_60,puVar9);
  if (iVar3 == 0) {
    uVar12 = _strlen(pcVar17);
    uVar5 = func_0x00789f10(auStack_60,pcVar17,uVar12,uVar8,0);
    if ((int)uVar5 == 0) {
      uVar8 = func_0x00740a58(auStack_60);
      uVar5 = func_0x0078aa74(uVar8,param_3,uVar13 & 0xffffffef);
    }
    func_0x00740678(auStack_60);
  }
  else {
    uVar13 = 0x1f;
    if (iVar3 != 100) {
      uVar13 = 7;
    }
    uVar5 = (ulong)uVar13;
  }
  return uVar5;
}

