/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0095c6e4
 */

/* WARNING: Removing unreachable block (ram,0x0095c950) */
/* WARNING: Removing unreachable block (ram,0x0095c9d4) */
/* WARNING: Removing unreachable block (ram,0x0095c994) */
/* WARNING: Removing unreachable block (ram,0x0095c908) */
/* WARNING: Removing unreachable block (ram,0x0095ca1c) */
/* WARNING: Type propagation algorithm not settling */

int FUN_0095c6e4(long param_1,undefined1 *param_2)

{
  char *pcVar1;
  char *__s;
  long *plVar2;
  byte *pbVar3;
  undefined4 uVar4;
  byte bVar5;
  long lVar6;
  bool bVar7;
  char cVar8;
  int iVar9;
  int iVar10;
  long lVar11;
  ulong uVar12;
  size_t sVar13;
  long lVar14;
  undefined4 *puVar15;
  ssize_t sVar16;
  undefined4 *puVar17;
  char *pcVar18;
  undefined *puVar19;
  long lVar20;
  byte *pbVar21;
  int *piVar22;
  long lVar23;
  int iVar24;
  int *piVar25;
  undefined8 *puVar26;
  char *__s_00;
  undefined8 uVar27;
  long lVar28;
  long lVar29;
  long lVar30;
  long lVar31;
  uint uVar33;
  uint uVar32;
  ulong uVar34;
  undefined4 *puVar35;
  undefined1 auVar36 [16];
  int local_10b4;
  long local_1090;
  undefined2 local_1084;
  byte local_1082;
  char *local_1080 [512];
  undefined4 local_80;
  undefined2 local_7c;
  ushort local_7a;
  int local_78;
  undefined2 local_74;
  ushort local_72;
  
  lVar6 = tpidr_el0;
  lVar20 = *(long *)(lVar6 + 0x28);
  lVar29 = *(long *)(param_1 + 0x20);
  uVar4 = *(undefined4 *)(lVar29 + 0x220);
  *param_2 = 1;
  lVar11 = (*(code *)PTR_calloc_00cc4690)(1,0x1ee8);
  if (lVar11 == 0) {
    iVar10 = 0x1b;
  }
  else {
    FUN_00904528(lVar11 + 0x1cb8,0xffff);
    *(long *)(param_1 + 0x1a0) = lVar11;
    *(undefined4 *)(lVar11 + 0x1cac) = 0;
    *(undefined4 *)(lVar11 + 0x814) = 1;
    *(undefined4 *)(lVar11 + 0x1414) = 1;
    *(undefined4 *)(lVar11 + 0x808) = 1;
    *(undefined8 *)(lVar11 + 0x1408) = 0x100000001;
    *(long *)(lVar11 + 0x1ed8) = lVar11 + 0x1cd8;
    *(undefined4 *)(lVar11 + 0x1884) = 1;
    piVar25 = *(int **)(param_1 + 0x1a0);
    if (*(long *)(param_1 + 0x12f0) == 0) {
LAB_0095c7ec:
      puVar26 = *(undefined8 **)(param_1 + 0x508);
      if (puVar26 != (undefined8 *)0x0) {
        do {
          __s_00 = (char *)*puVar26;
          pcVar18 = strchr(__s_00,0x3d);
          if (pcVar18 == (char *)0x0) {
            FUN_00904b80(param_1,"Syntax error in telnet option: %s",__s_00);
            iVar10 = 0x31;
            goto LAB_0095cae0;
          }
          __s = pcVar18 + 1;
          lVar11 = 1;
          do {
            pcVar1 = pcVar18 + lVar11;
            if (*pcVar1 == '\0') {
              switch((long)pcVar18 - (long)__s_00) {
              case 2:
                iVar10 = curl_strnequal(__s_00,&DAT_002a759e,2);
                if (iVar10 != 0) {
                  uVar34 = strtoul(__s,local_1080,10);
                  pcVar18 = local_1080[0];
                  if ((uVar34 - 1 < 0xffff) && (cVar8 = FUN_009416e0(*local_1080[0]), cVar8 == 'x'))
                  {
                    local_1080[0] = pcVar18 + 1;
                    uVar12 = strtoul(local_1080[0],(char **)0x0,10);
                    if (uVar12 - 1 < 0xffff) {
                      *(short *)(piVar25 + 0x72a) = (short)uVar34;
                      *(short *)((long)piVar25 + 0x1caa) = (short)uVar12;
                      piVar25[0x221] = 1;
                      goto LAB_0095c850;
                    }
                    if (uVar12 != 0) goto LAB_0095c850;
                  }
                  FUN_00904b80(param_1,"Syntax error in telnet option: %s",*puVar26);
                  iVar10 = 0x31;
                  goto LAB_0095ca44;
                }
                break;
              default:
                FUN_00904b80(param_1,"Unknown telnet option %s",__s_00);
                break;
              case 5:
                iVar10 = curl_strnequal(__s_00,"TTYPE",5);
                if ((iVar10 != 0) && (sVar13 = strlen(__s), sVar13 < 0x20)) {
                  strcpy((char *)(piVar25 + 0x702),__s);
                  piVar25[0x21a] = 1;
                  goto LAB_0095c850;
                }
                break;
              case 6:
                iVar10 = curl_strnequal(__s_00,"BINARY",6);
                if (iVar10 != 0) {
                  iVar10 = atoi(__s);
                  if (iVar10 != 1) {
                    piVar25[0x202] = 0;
                    piVar25[0x502] = 0;
                  }
                  goto LAB_0095c850;
                }
                break;
              case 7:
                iVar10 = curl_strnequal(__s_00,"NEW_ENV",7);
                if (iVar10 != 0) {
                  lVar11 = curl_slist_append(*(undefined8 *)(piVar25 + 0x72c),__s);
                  if (lVar11 == 0) {
                    iVar10 = 0x1b;
                    goto LAB_0095cae0;
                  }
                  *(long *)(piVar25 + 0x72c) = lVar11;
                  piVar25[0x229] = 1;
                  goto LAB_0095c850;
                }
                break;
              case 8:
                iVar10 = curl_strnequal(__s_00,"XDISPLOC",8);
                if ((iVar10 != 0) && (sVar13 = strlen(__s), sVar13 < 0x80)) {
                  strcpy((char *)(piVar25 + 0x70a),__s);
                  piVar25[0x225] = 1;
                  goto LAB_0095c850;
                }
              }
              iVar10 = 0x30;
              goto LAB_0095cae0;
            }
            lVar11 = lVar11 + 1;
          } while (-1 < *pcVar1);
LAB_0095c850:
          iVar10 = 0;
          puVar26 = (undefined8 *)puVar26[1];
        } while (puVar26 != (undefined8 *)0x0);
LAB_0095ca44:
        if (iVar10 != 0) {
LAB_0095cae0:
          curl_slist_free_all(*(undefined8 *)(piVar25 + 0x72c));
          piVar25[0x72c] = 0;
          piVar25[0x72d] = 0;
          goto LAB_0095df54;
        }
      }
      local_7c = 1;
      local_80 = uVar4;
      if ((*(byte *)(param_1 + 0xa82) >> 1 & 1) == 0) {
        local_78 = fileno(*(FILE **)(param_1 + 0x1168));
        local_74 = 1;
        bVar7 = local_78 < 0;
        if (bVar7) {
          FUN_00904b80(param_1,"cannot read input");
          iVar10 = 0x38;
        }
        else {
          iVar10 = 0;
        }
        bVar7 = !bVar7;
        iVar24 = 2;
        uVar27 = 1000;
      }
      else {
        iVar10 = 0;
        iVar24 = 1;
        uVar27 = 100;
        bVar7 = true;
      }
      lVar11 = 0;
      lVar30 = 0;
      plVar2 = (long *)(param_1 + 0x12a0);
      do {
        if (!bVar7) goto LAB_0095df4c;
        iVar9 = FUN_0093475c(&local_80,iVar24,uVar27);
        if (iVar9 == 0) {
          local_7a = 0;
          local_72 = 0;
LAB_0095cb8c:
          local_1090 = 0;
          if (iVar24 == 2) {
            if ((local_72 & 1) != 0) {
              local_1090 = read(local_78,local_1080,0x1000);
              goto joined_r0x0095cc1c;
            }
LAB_0095cbc4:
            bVar7 = local_1090 == 0;
            iVar9 = *(int *)(param_1 + 0x2e0);
          }
          else {
            iVar9 = (**(code **)(param_1 + 0x1160))
                              (local_1080,1,0x1000,*(undefined8 *)(param_1 + 0x1168));
            local_1090 = (long)iVar9;
            if (iVar9 != 0x10000000) {
              if (iVar9 == 0x10000001) goto LAB_0095cc48;
joined_r0x0095cc1c:
              if (local_1090 < 1) goto LAB_0095cbc4;
              iVar10 = FUN_0095dfd8(param_1,local_1080);
              if (iVar10 == 0) {
                lVar11 = local_1090 + lVar11;
                FUN_00931fec(param_1,lVar11);
                goto LAB_0095cc48;
              }
            }
LAB_0095cc7c:
            bVar7 = false;
            iVar9 = *(int *)(param_1 + 0x2e0);
          }
        }
        else {
          if (iVar9 == -1) goto LAB_0095df4c;
          if ((local_7a & 1) == 0) goto LAB_0095cb8c;
          iVar10 = FUN_0094358c(param_1,local_1080,0x1000,&local_1090);
          if (iVar10 == 0) {
            if (0 < local_1090) {
              lVar30 = local_1090 + lVar30;
              iVar10 = FUN_00931fe0(param_1,lVar30);
              lVar14 = local_1090;
              if (iVar10 == 0) {
                if (local_1090 != 0) {
                  puVar35 = *(undefined4 **)(param_1 + 0x1a0);
                  lVar31 = 0;
                  puVar17 = puVar35 + 0x736;
                  pbVar3 = (byte *)(puVar35 + 0x7b6);
                  local_10b4 = -1;
                  do {
                    if (8 < (uint)puVar35[0x72b]) goto LAB_0095dc84;
                    bVar5 = *(byte *)((long)local_1080 + lVar31);
                    uVar34 = (ulong)bVar5;
                    uVar32 = (uint)bVar5;
                    uVar33 = (uint)bVar5;
                    switch(puVar35[0x72b]) {
                    case 0:
                      if (uVar32 == 0xd) {
                        puVar35[0x72b] = 6;
                      }
                      else if (uVar33 == 0xff) {
                        puVar35[0x72b] = 1;
                        goto joined_r0x0095ceb4;
                      }
LAB_0095d918:
                      iVar10 = (int)lVar31;
                      if (-1 < local_10b4) {
                        iVar10 = local_10b4;
                      }
                      local_10b4 = iVar10;
                      break;
                    case 1:
switchD_0095cdcc_caseD_1:
                      switch(uVar33) {
                      case 0xfa:
                        *(undefined4 **)(puVar35 + 0x7b6) = puVar17;
                        goto LAB_0095d87c;
                      case 0xfb:
                        puVar35[0x72b] = 2;
                        break;
                      case 0xfc:
                        puVar35[0x72b] = 3;
                        break;
                      case 0xfd:
                        puVar35[0x72b] = 4;
                        break;
                      case 0xfe:
                        puVar35[0x72b] = 5;
                        break;
                      case 0xff:
                        puVar35[0x72b] = 0;
                        goto LAB_0095d918;
                      default:
                        puVar35[0x72b] = 0;
                        if ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) {
                          lVar28 = *plVar2;
                          if (uVar33 - 0xec < 0x14) {
                            if ((lVar28 == 0) || (0 < *(int *)(lVar28 + 8))) {
                              FUN_00904c98(param_1,"%s IAC %s",&DAT_002ad459,
                                           (&PTR_DAT_00c510e8)[(int)(uVar33 - 0xec)]);
                            }
                          }
                          else if ((lVar28 == 0) || (0 < *(int *)(lVar28 + 8))) {
                            FUN_00904c98(param_1,"%s IAC %d",&DAT_002ad459,uVar34);
                          }
                        }
                      }
                      break;
                    case 2:
                      if ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) {
                        if (uVar33 < 0x28) {
                          pcVar18 = (&PTR_s_BINARY_00c51188)[uVar34];
                        }
                        else {
                          if (uVar33 != 0xff) {
                            if ((*plVar2 == 0) || (0 < *(int *)(*plVar2 + 8))) {
                              FUN_00904c98(param_1,"%s %s %d",&DAT_002ad459,&DAT_002cf335,uVar34);
                            }
                            goto LAB_0095d31c;
                          }
                          pcVar18 = "EXOPL";
                        }
                        if ((*plVar2 == 0) || (0 < *(int *)(*plVar2 + 8))) {
                          FUN_00904c98(param_1,"%s %s %s",&DAT_002ad459,&DAT_002cf335,pcVar18);
                        }
                      }
LAB_0095d31c:
                      *puVar35 = 1;
                      lVar23 = *(long *)(param_1 + 0x1a0);
                      lVar28 = lVar23 + uVar34 * 4;
                      iVar10 = *(int *)(lVar28 + 0xc08);
                      piVar22 = (int *)(lVar28 + 0xc08);
                      if (iVar10 == 3) {
                        iVar10 = *(int *)(lVar28 + 0x1008);
                        if (iVar10 != 1) goto joined_r0x0095d544;
                        *piVar22 = 1;
                        *(undefined4 *)(lVar28 + 0x1008) = 0;
                      }
                      else if (iVar10 == 2) {
                        lVar23 = lVar23 + uVar34 * 4;
                        iVar10 = *(int *)(lVar23 + 0x1008);
                        if (iVar10 == 1) {
                          *piVar22 = 3;
                          *(undefined4 *)(lVar23 + 0x1008) = 0;
LAB_0095d758:
                          local_1084 = 0xfeff;
                          local_1082 = bVar5;
                          sVar16 = send(*(int *)(*(long *)(param_1 + 0x20) + 0x220),&local_1084,3,
                                        0x4000);
                          if (sVar16 < 0) {
                            puVar15 = (undefined4 *)__errno();
                            FUN_00904b80(param_1,"Sending data failed (%d)",*puVar15);
                          }
                          if ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) {
                            if (uVar33 < 0x28) {
                              pcVar18 = (&PTR_s_BINARY_00c51188)[uVar34];
                            }
                            else {
                              if (uVar33 != 0xff) {
                                if ((*plVar2 == 0) || (0 < *(int *)(*plVar2 + 8))) {
                                  puVar19 = &DAT_002c12cc;
                                  goto LAB_0095db44;
                                }
                                goto LAB_0095dc80;
                              }
                              pcVar18 = "EXOPL";
                            }
                            if ((*plVar2 == 0) || (0 < *(int *)(*plVar2 + 8))) {
                              FUN_00904c98(param_1,"%s %s %s",&DAT_002cf34b,&DAT_002c12cc,pcVar18);
                            }
                          }
                        }
                        else if (iVar10 == 0) {
                          *piVar22 = 1;
                        }
                      }
                      else if (iVar10 == 0) {
                        if (*(int *)(lVar23 + uVar34 * 4 + 0x1408) != 1) goto LAB_0095d758;
                        *piVar22 = 1;
                        local_1084 = 0xfdff;
                        local_1082 = bVar5;
                        sVar16 = send(*(int *)(*(long *)(param_1 + 0x20) + 0x220),&local_1084,3,
                                      0x4000);
                        if (sVar16 < 0) {
                          puVar15 = (undefined4 *)__errno();
                          FUN_00904b80(param_1,"Sending data failed (%d)",*puVar15);
                        }
                        if ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) {
                          if (0x27 < uVar32) goto LAB_0095d4f4;
                          goto LAB_0095d3b4;
                        }
                      }
                      goto LAB_0095dc80;
                    case 3:
                      if ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) {
                        if (uVar32 < 0x28) {
                          pcVar18 = (&PTR_s_BINARY_00c51188)[uVar34];
                        }
                        else {
                          if (uVar33 != 0xff) {
                            if ((*plVar2 == 0) || (0 < *(int *)(*plVar2 + 8))) {
                              FUN_00904c98(param_1,"%s %s %d",&DAT_002ad459,&DAT_002c5276,uVar34);
                            }
                            goto LAB_0095d448;
                          }
                          pcVar18 = "EXOPL";
                        }
                        if ((*plVar2 == 0) || (0 < *(int *)(*plVar2 + 8))) {
                          FUN_00904c98(param_1,"%s %s %s",&DAT_002ad459,&DAT_002c5276,pcVar18);
                        }
                      }
LAB_0095d448:
                      *puVar35 = 1;
                      lVar28 = *(long *)(param_1 + 0x1a0) + uVar34 * 4;
                      iVar10 = *(int *)(lVar28 + 0xc08);
                      piVar22 = (int *)(lVar28 + 0xc08);
                      if (iVar10 == 3) {
                        iVar10 = *(int *)(lVar28 + 0x1008);
                        if (iVar10 == 1) {
                          *piVar22 = 2;
                          *(undefined4 *)(lVar28 + 0x1008) = 0;
                          local_1084 = 0xfdff;
                          local_1082 = bVar5;
                          sVar16 = send(*(int *)(*(long *)(param_1 + 0x20) + 0x220),&local_1084,3,
                                        0x4000);
                          if (sVar16 < 0) {
                            puVar15 = (undefined4 *)__errno();
                            FUN_00904b80(param_1,"Sending data failed (%d)",*puVar15);
                          }
                          if ((*(byte *)(param_1 + 0xa85) >> 4 & 1) == 0) goto LAB_0095dc80;
                          if (uVar33 < 0x28) {
LAB_0095d3b4:
                            pcVar18 = (&PTR_s_BINARY_00c51188)[uVar34];
                          }
                          else {
LAB_0095d4f4:
                            if (uVar32 != 0xff) {
                              if ((*plVar2 == 0) || (0 < *(int *)(*plVar2 + 8))) {
                                puVar19 = &DAT_002c90e9;
                                goto LAB_0095db44;
                              }
                              goto LAB_0095dc80;
                            }
                            pcVar18 = "EXOPL";
                          }
                          if ((*plVar2 == 0) || (0 < *(int *)(*plVar2 + 8))) {
                            FUN_00904c98(param_1,"%s %s %s",&DAT_002cf34b,&DAT_002c90e9,pcVar18);
                          }
                          goto LAB_0095dc80;
                        }
                      }
                      else {
                        if (iVar10 != 2) {
                          if (iVar10 != 1) goto LAB_0095dc80;
                          *piVar22 = 0;
                          goto LAB_0095d758;
                        }
                        lVar28 = *(long *)(param_1 + 0x1a0) + uVar34 * 4;
                        iVar10 = *(int *)(lVar28 + 0x1008);
                        if (iVar10 == 1) {
                          puVar15 = (undefined4 *)(lVar28 + 0x1008);
                          goto LAB_0095d80c;
                        }
                      }
joined_r0x0095d544:
                      if (iVar10 == 0) {
                        *piVar22 = 0;
                      }
                      goto LAB_0095dc80;
                    case 4:
                      if ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) {
                        if (uVar32 < 0x28) {
                          pcVar18 = (&PTR_s_BINARY_00c51188)[uVar34];
                        }
                        else {
                          if (bVar5 != 0xff) {
                            if ((*plVar2 == 0) || (0 < *(int *)(*plVar2 + 8))) {
                              FUN_00904c98(param_1,"%s %s %d",&DAT_002ad459,&DAT_002c90e9,bVar5);
                            }
                            goto LAB_0095d184;
                          }
                          pcVar18 = "EXOPL";
                        }
                        if ((*plVar2 == 0) || (0 < *(int *)(*plVar2 + 8))) {
                          FUN_00904c98(param_1,"%s %s %s",&DAT_002ad459,&DAT_002c90e9,pcVar18);
                        }
                      }
LAB_0095d184:
                      *puVar35 = 1;
                      lVar23 = *(long *)(param_1 + 0x1a0);
                      lVar28 = lVar23 + uVar34 * 4;
                      piVar22 = (int *)(lVar28 + 8);
                      iVar10 = *piVar22;
                      if (iVar10 == 3) {
                        if (*(int *)(lVar28 + 0x408) == 1) {
                          *piVar22 = 1;
                          *(undefined4 *)(lVar28 + 0x408) = 0;
                        }
                        else if (*(int *)(lVar28 + 0x408) == 0) {
                          *piVar22 = 0;
                        }
                      }
                      else if (iVar10 == 2) {
                        lVar28 = lVar23 + uVar34 * 4;
                        iVar10 = *(int *)(lVar28 + 0x408);
                        if (iVar10 == 1) {
                          *piVar22 = 3;
                          *(undefined4 *)(lVar28 + 0x1008) = 0;
                          local_1084 = 0xfcff;
                          local_1082 = bVar5;
                          sVar16 = send(*(int *)(*(long *)(param_1 + 0x20) + 0x220),&local_1084,3,
                                        0x4000);
                          if (sVar16 < 0) {
                            puVar15 = (undefined4 *)__errno();
                            FUN_00904b80(param_1,"Sending data failed (%d)",*puVar15);
                          }
                          if ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) {
                            if (bVar5 < 0x28) {
LAB_0095d734:
                              pcVar18 = (&PTR_s_BINARY_00c51188)[uVar34];
                            }
                            else {
LAB_0095d980:
                              if (uVar33 != 0xff) {
                                if ((*plVar2 == 0) || (0 < *(int *)(*plVar2 + 8))) {
                                  FUN_00904c98(param_1,"%s %s %d",&DAT_002cf34b,&DAT_002c5276,uVar34
                                              );
                                }
                                goto LAB_0095dc80;
                              }
                              pcVar18 = "EXOPL";
                            }
                            if ((*plVar2 == 0) || (0 < *(int *)(*plVar2 + 8))) {
                              FUN_00904c98(param_1,"%s %s %s",&DAT_002cf34b,&DAT_002c5276,pcVar18);
                            }
                          }
                        }
                        else if (iVar10 == 0) {
                          *piVar22 = 1;
                          goto LAB_0095dc60;
                        }
                      }
                      else if (iVar10 == 0) {
                        lVar28 = lVar23 + uVar34 * 4;
                        if (*(int *)(lVar28 + 0x808) == 1) {
                          *piVar22 = 1;
                          local_1084 = 0xfbff;
                          local_1082 = bVar5;
                          sVar16 = send(*(int *)(*(long *)(param_1 + 0x20) + 0x220),&local_1084,3,
                                        0x4000);
                          if (sVar16 < 0) {
                            puVar15 = (undefined4 *)__errno();
                            FUN_00904b80(param_1,"Sending data failed (%d)",*puVar15);
                          }
                          if ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) {
                            if (uVar33 < 0x28) {
                              pcVar18 = (&PTR_s_BINARY_00c51188)[uVar34];
                            }
                            else {
                              if (uVar33 != 0xff) {
                                if ((*plVar2 == 0) || (0 < *(int *)(*plVar2 + 8))) {
                                  FUN_00904c98(param_1,"%s %s %d",&DAT_002cf34b,&DAT_002cf335,uVar34
                                              );
                                }
                                goto LAB_0095dc60;
                              }
                              pcVar18 = "EXOPL";
                            }
                            if ((*plVar2 == 0) || (0 < *(int *)(*plVar2 + 8))) {
                              FUN_00904c98(param_1,"%s %s %s",&DAT_002cf34b,&DAT_002cf335,pcVar18);
                            }
                          }
LAB_0095dc60:
                          if (*(int *)(lVar23 + uVar34 * 4 + 0x1808) == 1) goto LAB_0095dc70;
                        }
                        else if (*(int *)(lVar28 + 0x1808) == 1) {
                          *piVar22 = 1;
                          local_1084 = 0xfbff;
                          local_1082 = bVar5;
                          sVar16 = send(*(int *)(*(long *)(param_1 + 0x20) + 0x220),&local_1084,3,
                                        0x4000);
                          if (sVar16 < 0) {
                            puVar15 = (undefined4 *)__errno();
                            FUN_00904b80(param_1,"Sending data failed (%d)",*puVar15);
                          }
                          if ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) {
                            if (bVar5 < 0x28) {
                              pcVar18 = (&PTR_s_BINARY_00c51188)[uVar34];
                            }
                            else {
                              if (uVar33 != 0xff) {
                                if ((*plVar2 == 0) || (0 < *(int *)(*plVar2 + 8))) {
                                  FUN_00904c98(param_1,"%s %s %d",&DAT_002cf34b,&DAT_002cf335,uVar34
                                              );
                                }
                                goto LAB_0095dc70;
                              }
                              pcVar18 = "EXOPL";
                            }
                            if ((*plVar2 == 0) || (0 < *(int *)(*plVar2 + 8))) {
                              FUN_00904c98(param_1,"%s %s %s",&DAT_002cf34b,&DAT_002cf335,pcVar18);
                            }
                          }
LAB_0095dc70:
                          FUN_0095e42c(param_1,uVar34);
                        }
                        else {
                          local_1084 = 0xfcff;
                          local_1082 = bVar5;
                          sVar16 = send(*(int *)(*(long *)(param_1 + 0x20) + 0x220),&local_1084,3,
                                        0x4000);
                          if (sVar16 < 0) {
                            puVar15 = (undefined4 *)__errno();
                            FUN_00904b80(param_1,"Sending data failed (%d)",*puVar15);
                          }
                          if ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) {
                            if (bVar5 < 0x28) goto LAB_0095d734;
                            goto LAB_0095d980;
                          }
                        }
                      }
                      goto LAB_0095dc80;
                    case 5:
                      if ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) {
                        if (uVar33 < 0x28) {
                          pcVar18 = (&PTR_s_BINARY_00c51188)[uVar34];
                        }
                        else {
                          if (uVar33 != 0xff) {
                            if ((*plVar2 == 0) || (0 < *(int *)(*plVar2 + 8))) {
                              FUN_00904c98(param_1,"%s %s %d",&DAT_002ad459,&DAT_002c12cc,uVar34);
                            }
                            goto LAB_0095d58c;
                          }
                          pcVar18 = "EXOPL";
                        }
                        if ((*plVar2 == 0) || (0 < *(int *)(*plVar2 + 8))) {
                          FUN_00904c98(param_1,"%s %s %s",&DAT_002ad459,&DAT_002c12cc,pcVar18);
                        }
                      }
LAB_0095d58c:
                      *puVar35 = 1;
                      lVar28 = *(long *)(param_1 + 0x1a0) + uVar34 * 4;
                      piVar22 = (int *)(lVar28 + 8);
                      iVar10 = *piVar22;
                      if (iVar10 == 3) {
                        iVar10 = *(int *)(lVar28 + 0x408);
                        if (iVar10 != 1) goto joined_r0x0095d544;
                        *piVar22 = 2;
                        *(undefined4 *)(lVar28 + 0x408) = 0;
                        local_1084 = 0xfbff;
                        local_1082 = bVar5;
                        sVar16 = send(*(int *)(*(long *)(param_1 + 0x20) + 0x220),&local_1084,3,
                                      0x4000);
                        if (sVar16 < 0) {
                          puVar15 = (undefined4 *)__errno();
                          FUN_00904b80(param_1,"Sending data failed (%d)",*puVar15);
                        }
                        if ((*(byte *)(param_1 + 0xa85) >> 4 & 1) == 0) goto LAB_0095dc80;
                        if (uVar33 < 0x28) {
                          pcVar18 = (&PTR_s_BINARY_00c51188)[uVar34];
                        }
                        else {
                          if (uVar33 != 0xff) {
                            if ((*plVar2 != 0) && (*(int *)(*plVar2 + 8) < 1)) goto LAB_0095dc80;
                            puVar19 = &DAT_002cf335;
LAB_0095db44:
                            FUN_00904c98(param_1,"%s %s %d",&DAT_002cf34b,puVar19,uVar34);
                            goto LAB_0095dc80;
                          }
                          pcVar18 = "EXOPL";
                        }
                        if ((*plVar2 == 0) || (0 < *(int *)(*plVar2 + 8))) {
                          FUN_00904c98(param_1,"%s %s %s",&DAT_002cf34b,&DAT_002cf335,pcVar18);
                        }
                      }
                      else {
                        if (iVar10 != 2) {
                          if (iVar10 == 1) {
                            *piVar22 = 0;
                            local_1084 = 0xfcff;
                            local_1082 = bVar5;
                            sVar16 = send(*(int *)(*(long *)(param_1 + 0x20) + 0x220),&local_1084,3,
                                          0x4000);
                            if (sVar16 < 0) {
                              puVar15 = (undefined4 *)__errno();
                              FUN_00904b80(param_1,"Sending data failed (%d)",*puVar15);
                            }
                            if ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) {
                              if (uVar33 < 0x28) {
                                pcVar18 = (&PTR_s_BINARY_00c51188)[uVar34];
                              }
                              else {
                                if (uVar32 != 0xff) {
                                  if ((*plVar2 == 0) || (0 < *(int *)(*plVar2 + 8))) {
                                    puVar19 = &DAT_002c5276;
                                    goto LAB_0095db44;
                                  }
                                  goto LAB_0095dc80;
                                }
                                pcVar18 = "EXOPL";
                              }
                              if ((*plVar2 == 0) || (0 < *(int *)(*plVar2 + 8))) {
                                FUN_00904c98(param_1,"%s %s %s",&DAT_002cf34b,&DAT_002c5276,pcVar18)
                                ;
                              }
                            }
                          }
                          goto LAB_0095dc80;
                        }
                        lVar28 = *(long *)(param_1 + 0x1a0) + uVar34 * 4;
                        iVar10 = *(int *)(lVar28 + 0x408);
                        if (iVar10 != 1) goto joined_r0x0095d544;
                        puVar15 = (undefined4 *)(lVar28 + 0x408);
LAB_0095d80c:
                        *piVar22 = 0;
                        *puVar15 = 0;
                      }
LAB_0095dc80:
                      puVar35[0x72b] = 0;
                      break;
                    case 6:
                      puVar35[0x72b] = 0;
                      if (uVar32 != 0) goto LAB_0095d918;
joined_r0x0095ceb4:
                      if ((-1 < local_10b4) &&
                         (iVar10 = FUN_00934dd0(param_1,1,(long)local_1080 + (long)local_10b4,
                                                (long)((int)lVar31 - local_10b4)), iVar10 != 0))
                      goto LAB_0095dcc0;
                      local_10b4 = -1;
                      break;
                    case 7:
                      if (uVar32 == 0xff) {
                        puVar35[0x72b] = 8;
                      }
                      else {
                        pbVar21 = *(byte **)(puVar35 + 0x7b6);
                        if (pbVar21 < pbVar3) {
                          *(byte **)(puVar35 + 0x7b6) = pbVar21 + 1;
                          *pbVar21 = bVar5;
                        }
                      }
                      break;
                    case 8:
                      if (uVar33 == 0xf0) {
                        pbVar21 = *(byte **)(puVar35 + 0x7b6);
                        if (pbVar21 < pbVar3) {
                          *(byte **)(puVar35 + 0x7b6) = pbVar21 + 1;
                          *pbVar21 = 0xff;
                          pbVar21 = *(byte **)(puVar35 + 0x7b6);
                        }
                        if (pbVar21 < pbVar3) {
                          *(byte **)(puVar35 + 0x7b6) = pbVar21 + 1;
                          *pbVar21 = 0xf0;
                          pbVar21 = *(byte **)(puVar35 + 0x7b6);
                        }
                        *(byte **)(puVar35 + 0x7b8) = pbVar21 + -2;
                        *(undefined4 **)(puVar35 + 0x7b6) = puVar17;
                        FUN_0095e178(param_1);
                        goto LAB_0095dc80;
                      }
                      pbVar21 = *(byte **)(puVar35 + 0x7b6);
                      if (uVar33 != 0xff) {
                        if (pbVar21 < pbVar3) {
                          *(byte **)(puVar35 + 0x7b6) = pbVar21 + 1;
                          *pbVar21 = 0xff;
                          pbVar21 = *(byte **)(puVar35 + 0x7b6);
                        }
                        if (pbVar21 < pbVar3) {
                          *(byte **)(puVar35 + 0x7b6) = pbVar21 + 1;
                          *pbVar21 = bVar5;
                          pbVar21 = *(byte **)(puVar35 + 0x7b6);
                        }
                        *(byte **)(puVar35 + 0x7b8) = pbVar21 + -2;
                        *(undefined4 **)(puVar35 + 0x7b6) = puVar17;
                        if ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) {
                          lVar28 = *plVar2;
                          if (uVar32 - 0xec < 0x14) {
                            if ((lVar28 == 0) || (0 < *(int *)(lVar28 + 8))) {
                              FUN_00904c98(param_1,"%s IAC %s","In SUBOPTION processing, RCVD",
                                           (&PTR_DAT_00c510e8)[(int)(uVar32 - 0xec)]);
                            }
                          }
                          else if ((lVar28 == 0) || (0 < *(int *)(lVar28 + 8))) {
                            FUN_00904c98(param_1,"%s IAC %d","In SUBOPTION processing, RCVD",uVar34)
                            ;
                          }
                        }
                        FUN_0095e178(param_1);
                        puVar35[0x72b] = 1;
                        goto switchD_0095cdcc_caseD_1;
                      }
                      if (pbVar21 < pbVar3) {
                        *(byte **)(puVar35 + 0x7b6) = pbVar21 + 1;
                        *pbVar21 = 0xff;
                      }
LAB_0095d87c:
                      puVar35[0x72b] = 7;
                    }
LAB_0095dc84:
                    lVar31 = lVar31 + 1;
                  } while (lVar14 != lVar31);
                  if ((-1 < local_10b4) &&
                     (iVar10 = FUN_00934dd0(param_1,1,(long)local_1080 + (long)local_10b4,
                                            (long)((int)lVar31 - local_10b4)), iVar10 != 0)) {
LAB_0095dcc0:
                    bVar7 = false;
                    iVar9 = *(int *)(param_1 + 0x2e0);
                    goto joined_r0x0095cbd0;
                  }
                }
                if (*piVar25 != 0) {
                  if (piVar25[1] != 0) {
                    iVar10 = 0;
                    goto LAB_0095cb8c;
                  }
                  lVar28 = *(long *)(param_1 + 0x1a0);
                  lVar14 = 0;
                  lVar31 = 0xc08;
                  do {
                    if (lVar14 != 1) {
                      if (*(int *)(lVar28 + lVar14 * 4 + 0x808) == 1) {
                        lVar23 = *(long *)(param_1 + 0x1a0) + lVar14 * 4;
                        iVar10 = *(int *)(lVar23 + 8);
                        if (iVar10 == 3) {
                          if (*(int *)(lVar23 + 0x408) == 0) {
                            *(undefined4 *)(lVar23 + 0x408) = 1;
                          }
                        }
                        else if (iVar10 == 2) {
                          lVar23 = *(long *)(param_1 + 0x1a0) + lVar14 * 4;
                          if (*(int *)(lVar23 + 0x408) == 1) {
                            *(undefined4 *)(lVar23 + 0x408) = 0;
                          }
                        }
                        else if (iVar10 == 0) {
                          *(undefined4 *)(lVar23 + 8) = 2;
                          local_1084 = 0xfbff;
                          local_1082 = (byte)lVar14;
                          sVar16 = send(*(int *)(*(long *)(param_1 + 0x20) + 0x220),&local_1084,3,
                                        0x4000);
                          if (sVar16 < 0) {
                            puVar17 = (undefined4 *)__errno();
                            FUN_00904b80(param_1,"Sending data failed (%d)",*puVar17);
                          }
                          if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
                             ((*plVar2 == 0 || (0 < *(int *)(*plVar2 + 8))))) {
                            FUN_00904c98(param_1,"%s %s %s",&DAT_002cf34b,&DAT_002cf335,
                                         (&PTR_s_BINARY_00c51188)[lVar14]);
                          }
                        }
                      }
                      if (*(int *)(lVar28 + 0x1408 + lVar14 * 4) == 1) {
                        lVar23 = *(long *)(param_1 + 0x1a0);
                        iVar10 = *(int *)(lVar23 + lVar31);
                        if (iVar10 == 3) {
                          if (*(int *)(lVar23 + lVar31 + 0x400) == 0) {
                            *(undefined4 *)(lVar23 + lVar31 + 0x400) = 1;
                          }
                        }
                        else if (iVar10 == 2) {
                          if (*(int *)(lVar23 + lVar31 + 0x400) == 1) {
                            *(undefined4 *)(lVar23 + lVar31 + 0x400) = 0;
                          }
                        }
                        else if (iVar10 == 0) {
                          *(undefined4 *)(lVar23 + lVar31) = 2;
                          local_1084 = 0xfdff;
                          local_1082 = (byte)lVar14;
                          sVar16 = send(*(int *)(*(long *)(param_1 + 0x20) + 0x220),&local_1084,3,
                                        0x4000);
                          if (sVar16 < 0) {
                            puVar17 = (undefined4 *)__errno();
                            FUN_00904b80(param_1,"Sending data failed (%d)",*puVar17);
                          }
                          if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
                             ((*plVar2 == 0 || (0 < *(int *)(*plVar2 + 8))))) {
                            FUN_00904c98(param_1,"%s %s %s",&DAT_002cf34b,&DAT_002c90e9,
                                         (&PTR_s_BINARY_00c51188)[lVar14]);
                          }
                        }
                      }
                    }
                    lVar14 = lVar14 + 1;
                    lVar31 = lVar31 + 4;
                  } while (lVar14 != 0x28);
                  piVar25[1] = 1;
                }
                iVar10 = 0;
                goto LAB_0095cb8c;
              }
              goto LAB_0095cc7c;
            }
            bVar7 = false;
            iVar10 = 0;
            iVar9 = *(int *)(param_1 + 0x2e0);
          }
          else {
            if (iVar10 != 0x51) goto LAB_0095cc7c;
LAB_0095cc48:
            bVar7 = true;
            iVar9 = *(int *)(param_1 + 0x2e0);
          }
        }
joined_r0x0095cbd0:
        if (iVar9 != 0) {
          auVar36 = FUN_00941cb8();
          lVar14 = FUN_00941d54(auVar36._0_8_,auVar36._8_8_,*(undefined8 *)(lVar29 + 0x200),
                                *(undefined8 *)(lVar29 + 0x208));
          if ((long)(ulong)*(uint *)(param_1 + 0x2e0) <= lVar14) {
            FUN_00904b80(param_1,"Time-out");
            bVar7 = false;
            iVar10 = 0x1c;
          }
        }
        iVar9 = FUN_009314dc(param_1);
      } while (iVar9 == 0);
      iVar10 = 0x2a;
LAB_0095df4c:
      FUN_00943194(param_1);
    }
    else {
      pcVar18 = *(char **)(*(long *)(param_1 + 0x20) + 0x1c8);
      do {
        cVar8 = *pcVar18;
        if (cVar8 == '\0') {
          curl_msnprintf(local_1080,0x100,"USER,%s");
          lVar11 = curl_slist_append(*(undefined8 *)(piVar25 + 0x72c),local_1080);
          if (lVar11 == 0) {
            curl_slist_free_all(*(undefined8 *)(piVar25 + 0x72c));
            piVar25[0x72c] = 0;
            piVar25[0x72d] = 0;
            iVar10 = 0x1b;
            goto LAB_0095df54;
          }
          *(long *)(piVar25 + 0x72c) = lVar11;
          piVar25[0x229] = 1;
          goto LAB_0095c7ec;
        }
        pcVar18 = pcVar18 + 1;
      } while (-1 < cVar8);
      iVar10 = 0x2b;
    }
  }
LAB_0095df54:
  if (*(long *)(lVar6 + 0x28) != lVar20) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar10;
}

