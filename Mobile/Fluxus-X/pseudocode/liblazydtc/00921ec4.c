/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00921ec4
 */

int FUN_00921ec4(long param_1)

{
  undefined1 *puVar1;
  long lVar2;
  byte *pbVar3;
  bool bVar4;
  bool bVar5;
  int iVar6;
  long lVar7;
  char *pcVar8;
  size_t sVar9;
  time_t tVar10;
  size_t sVar11;
  long *plVar12;
  long *plVar13;
  byte *pbVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  long lVar19;
  long *plVar20;
  byte *pbVar21;
  undefined8 *puVar22;
  char cVar23;
  byte bVar24;
  char *pcVar25;
  long lVar26;
  size_t *psVar27;
  char *pcVar28;
  undefined1 *puVar29;
  uint uVar30;
  ulong uVar31;
  long *plVar32;
  char *pcVar33;
  undefined1 *puVar34;
  uint uVar35;
  long *plVar36;
  undefined8 local_860;
  int local_854;
  undefined1 auStack_850 [32];
  undefined1 auStack_830 [32];
  undefined1 auStack_810 [32];
  undefined1 auStack_7f0 [32];
  tm tStack_7d0;
  undefined8 local_798;
  undefined8 uStack_790;
  undefined8 uStack_788;
  undefined8 uStack_780;
  undefined8 local_778;
  undefined8 uStack_770;
  undefined8 uStack_768;
  undefined8 uStack_760;
  char local_758 [152];
  char local_6c0 [80];
  undefined1 auStack_670 [32];
  undefined8 local_650;
  undefined8 uStack_648;
  undefined8 auStack_640 [2];
  char local_630 [68];
  char local_5ec [68];
  char local_5a8 [68];
  char local_564 [68];
  undefined8 local_520;
  undefined1 local_518;
  char local_4c0 [72];
  size_t local_478 [131];
  
  lVar2 = tpidr_el0;
  lVar19 = *(long *)(lVar2 + 0x28);
  lVar26 = *(long *)(param_1 + 0x20);
  memset(local_564,0,0x41);
  memset(local_5a8,0,0x41);
  memset(local_5ec,0,0x41);
  memset(local_630,0,0x41);
  pcVar28 = *(char **)(lVar26 + 0x50);
  local_860 = 0;
  memset(local_758,0,0x97);
  uStack_770 = 0;
  local_778 = 0;
  uStack_760 = 0;
  uStack_768 = 0;
  puVar1 = &DAT_002ab32c;
  if (*(undefined1 **)(param_1 + 0x12f0) != (undefined1 *)0x0) {
    puVar1 = *(undefined1 **)(param_1 + 0x12f0);
  }
  uStack_790 = 0;
  local_798 = 0;
  uStack_780 = 0;
  uStack_788 = 0;
  lVar7 = FUN_00941e8c(param_1,"Authorization",0xd);
  iVar6 = 0;
  if (lVar7 != 0) goto LAB_009223dc;
  FUN_00904528(auStack_7f0,0x19000);
  FUN_00904528(auStack_830,0x19000);
  FUN_00904528(auStack_810,0x19000);
  FUN_00904528(auStack_850,0x19000);
  pcVar8 = "aws:amz";
  if (*(char **)(param_1 + 0x958) != (char *)0x0) {
    pcVar8 = *(char **)(param_1 + 0x958);
  }
  sscanf(pcVar8,"%64[^:]:%64[^:]:%64[^:]:%64s",local_564,local_5a8,local_5ec,local_630);
  if (local_564[0] == '\0') {
    FUN_00904b80(param_1,"first aws-sigv4 provider cannot be empty");
    puVar29 = (undefined1 *)0x0;
    pcVar28 = (char *)0x0;
    pcVar8 = (char *)0x0;
    lVar26 = 0;
    pcVar25 = (char *)0x0;
    pcVar33 = (char *)0x0;
    iVar6 = 0x2b;
  }
  else if (local_5a8[0] == '\0') {
    strcpy(local_5a8,local_564);
    if (local_630[0] == '\0') goto LAB_00922060;
LAB_0092211c:
    FUN_0091b138(param_1,lVar26,&local_860,&local_854);
    iVar6 = curl_strequal(local_564,&DAT_002c4fb0);
    if (iVar6 == 0) {
      bVar4 = false;
    }
    else {
      iVar6 = curl_strequal(local_630,&DAT_002a36bb);
      bVar4 = iVar6 != 0;
    }
    iVar6 = curl_msnprintf(local_478,0x52,"x-%s-content-sha256",local_5a8);
    pcVar8 = (char *)FUN_00941e8c(param_1,local_478,(long)iVar6);
    if (pcVar8 == (char *)0x0) {
LAB_009221e8:
      if (bVar4) {
        bVar4 = true;
        if ((local_854 != 0) && (local_854 != 5)) {
          bVar4 = *(long *)(param_1 + 0x310) == 0;
        }
        bVar5 = false;
        if (local_854 == 1) {
          bVar5 = *(long *)(param_1 + 0x208) != 0;
        }
        if ((bool)(bVar4 | bVar5)) {
          pcVar8 = *(char **)(param_1 + 0x208);
          if (pcVar8 == (char *)0x0) {
            sVar9 = 0;
          }
          else {
            sVar9 = *(size_t *)(param_1 + 0x218);
            if ((long)sVar9 < 0) {
              sVar9 = strlen(pcVar8);
            }
          }
          iVar6 = FUN_0093efe0(auStack_670,pcVar8,sVar9);
          if (iVar6 != 0) goto LAB_00922354;
          FUN_009159e4(auStack_670,0x20,local_6c0,0x41);
        }
        else {
          builtin_strncpy(local_6c0,"UNSIGNED-PAYLOAD",0x11);
        }
        curl_msnprintf(local_758,0x95,"x-%s-content-sha256: %s",local_5a8,local_6c0);
LAB_0092232c:
        pcVar8 = local_6c0;
        sVar9 = strlen(local_6c0);
        goto LAB_0092233c;
      }
      pcVar8 = *(char **)(param_1 + 0x208);
      if (pcVar8 == (char *)0x0) {
        sVar9 = 0;
      }
      else {
        sVar9 = *(size_t *)(param_1 + 0x218);
        if ((long)sVar9 < 0) {
          sVar9 = strlen(pcVar8);
        }
      }
      iVar6 = FUN_0093efe0(auStack_670,pcVar8,sVar9);
      if (iVar6 == 0) {
        FUN_009159e4(auStack_670,0x20,local_6c0,0x41);
        goto LAB_0092232c;
      }
LAB_00922354:
      puVar29 = (undefined1 *)0x0;
    }
    else {
      pcVar8 = strchr(pcVar8,0x3a);
      if (pcVar8 == (char *)0x0) goto LAB_009221e8;
      do {
        do {
          pcVar25 = pcVar8;
          pcVar8 = pcVar25 + 1;
        } while (*pcVar8 == '\t');
      } while (*pcVar8 == ' ');
      pcVar8 = pcVar25 + 1;
      for (sVar9 = strlen(pcVar8);
          (sVar9 != 0 && ((pcVar25[sVar9] == ' ' || (pcVar25[sVar9] == '\t')))); sVar9 = sVar9 - 1)
      {
      }
LAB_0092233c:
      tVar10 = time((time_t *)0x0);
      iVar6 = FUN_00931434(tVar10,&tStack_7d0);
      if (iVar6 != 0) goto LAB_00922354;
      sVar11 = strftime((char *)&local_650,0x11,"%Y%m%dT%H%M%SZ",&tStack_7d0);
      if (sVar11 == 0) {
        puVar29 = (undefined1 *)0x0;
        pcVar28 = (char *)0x0;
LAB_009224dc:
        pcVar8 = (char *)0x0;
LAB_009224e0:
        lVar26 = 0;
LAB_009224e4:
        pcVar25 = (char *)0x0;
        pcVar33 = (char *)0x0;
        iVar6 = 0x1b;
        goto LAB_0092236c;
      }
      sVar11 = strlen(local_5a8);
      FUN_00941848(local_5a8,local_5a8,sVar11);
      local_5a8[0] = FUN_009416cc(local_5a8[0]);
      curl_msnprintf(local_4c0,0x48,"X-%s-Date",local_5a8);
      FUN_00941848(local_5a8,local_5a8,1);
      curl_msnprintf(&local_520,0x5a,"x-%s-date:%s",local_5a8,&local_650);
      lVar26 = FUN_00941e8c(param_1,&DAT_002ad152,4);
      plVar36 = (long *)0x0;
      if (lVar26 == 0) {
        pcVar25 = *(char **)(param_1 + 0x12d0);
        if (pcVar25 == (char *)0x0) {
          sVar11 = strlen(pcVar28);
          if (sVar11 < 0x100) {
            curl_msnprintf(local_478,0x105,"host:%s",pcVar28);
            goto LAB_00922884;
          }
        }
        else {
          sVar11 = strlen(pcVar25);
          if (sVar11 < 0x106) {
            strcpy((char *)local_478,pcVar25);
            sVar11 = strcspn((char *)local_478,"\n\r");
            *(undefined1 *)((long)local_478 + sVar11) = 0;
LAB_00922884:
            plVar36 = (long *)curl_slist_append(0,local_478);
            if (plVar36 != (long *)0x0) goto LAB_009224b4;
            goto LAB_009229b4;
          }
        }
        puVar29 = (undefined1 *)0x0;
        plVar12 = (long *)0x0;
        iVar6 = 3;
      }
      else {
LAB_009224b4:
        if (local_758[0] == '\0') {
          plVar12 = plVar36;
LAB_00922540:
          plVar36 = *(long **)(param_1 + 0x340);
          if (plVar36 != (long *)0x0) {
            do {
              pcVar25 = (char *)*plVar36;
              pcVar28 = strchr(pcVar25,0x3a);
              if (((pcVar28 == (char *)0x0) &&
                  (pcVar28 = strchr(pcVar25,0x3b), pcVar28 == (char *)0x0)) ||
                 ((*pcVar28 == ':' && (pcVar28[1] == '\0')))) {
LAB_009225d0:
                plVar13 = plVar12;
              }
              else {
                lVar26 = 1;
                while (((bVar24 = pcVar28[lVar26], bVar24 == 9 || (bVar24 == 0x20)) ||
                       (bVar24 - 10 < 4))) {
                  lVar26 = lVar26 + 1;
                }
                if ((lVar26 != 1) && (bVar24 == 0)) goto LAB_009225d0;
                lVar26 = (*(code *)PTR_strdup_00cc4688)(pcVar25);
                if (lVar26 == 0) {
LAB_0092285c:
                  puVar29 = (undefined1 *)0x0;
                  iVar6 = 0x1b;
                  goto LAB_009229bc;
                }
                pcVar28[lVar26 - *plVar36] = ':';
                plVar13 = (long *)FUN_0093f6d8(plVar12,lVar26);
                if (plVar13 == (long *)0x0) {
                  (*(code *)PTR_free_00cc4678)(lVar26);
                  goto LAB_0092285c;
                }
              }
              plVar12 = plVar13;
              plVar36 = (long *)plVar36[1];
            } while (plVar36 != (long *)0x0);
          }
          if (plVar12 != (long *)0x0) {
            plVar36 = plVar12;
            do {
              pcVar28 = (char *)*plVar36;
              sVar11 = strcspn(pcVar28,":");
              FUN_00941848(pcVar28,pcVar28,sVar11);
              if (*(char *)(*plVar36 + sVar11) != '\0') {
                pcVar28 = (char *)(*plVar36 + sVar11) + 1;
                for (pcVar25 = pcVar28; (cVar23 = *pcVar25, cVar23 == '\t' || (cVar23 == ' '));
                    pcVar25 = pcVar25 + 1) {
                }
                while (cVar23 != '\0') {
                  lVar26 = 0;
                  while ((cVar23 == ' ' || (cVar23 == '\t'))) {
                    lVar7 = lVar26 + 1;
                    lVar26 = lVar26 + 1;
                    cVar23 = pcVar25[lVar7];
                  }
                  pcVar25 = pcVar25 + lVar26;
                  if ((int)lVar26 == 0) {
                    pcVar25 = pcVar25 + 1;
LAB_009226d0:
                    pcVar33 = pcVar28 + 1;
                    *pcVar28 = cVar23;
                  }
                  else {
                    pcVar33 = pcVar28;
                    if (cVar23 != '\0') {
                      cVar23 = ' ';
                      goto LAB_009226d0;
                    }
                  }
                  pcVar28 = pcVar33;
                  cVar23 = *pcVar25;
                }
                *pcVar28 = '\0';
              }
              plVar36 = (long *)plVar36[1];
            } while (plVar36 != (long *)0x0);
          }
          sVar11 = strlen(local_4c0);
          pcVar28 = (char *)FUN_00941e8c(param_1,local_4c0,sVar11);
          plVar36 = plVar12;
          if ((pcVar28 == (char *)0x0) &&
             (pcVar28 = (char *)FUN_00941e8c(param_1,&DAT_002b6ef6,4), pcVar28 == (char *)0x0)) {
            plVar12 = (long *)curl_slist_append(plVar12,&local_520);
            if (plVar12 != (long *)0x0) {
              puVar29 = (undefined1 *)curl_maprintf("%s: %s\r\n",local_4c0,&local_650);
              plVar36 = (long *)plVar12[1];
              goto joined_r0x009228d8;
            }
          }
          else {
            pbVar14 = (byte *)strchr(pcVar28,0x3a);
            if (pbVar14 != (byte *)0x0) {
              do {
                do {
                  pbVar3 = pbVar14;
                  pbVar14 = pbVar3 + 1;
                  bVar24 = *pbVar14;
                } while (bVar24 == 9);
              } while (bVar24 == 0x20);
              pbVar21 = pbVar14;
              if (bVar24 != 0) {
                do {
                  if ((9 < (byte)(bVar24 - 0x30)) && (0x19 < (byte)((bVar24 & 0xdf) + 0xbf))) break;
                  pbVar21 = pbVar21 + 1;
                  bVar24 = *pbVar21;
                } while (bVar24 != 0);
              }
              puVar22 = &local_650;
              if ((long)pbVar21 - (long)pbVar14 == 0x10) {
                uStack_648 = *(undefined8 *)(pbVar3 + 9);
                local_650 = *(undefined8 *)pbVar14;
                puVar22 = auStack_640;
              }
              *(undefined1 *)puVar22 = 0;
              if (plVar12 == (long *)0x0) {
                puVar29 = (undefined1 *)0x0;
              }
              else {
                puVar29 = (undefined1 *)0x0;
                plVar36 = (long *)plVar12[1];
                if (plVar36 != (long *)0x0) {
                  do {
                    bVar4 = false;
                    plVar13 = plVar36;
                    plVar32 = plVar12;
                    pcVar28 = (char *)*plVar12;
                    do {
                      plVar20 = plVar13;
                      pcVar25 = (char *)*plVar20;
                      iVar6 = strcmp(pcVar28,pcVar25);
                      if (0 < iVar6) {
                        bVar4 = true;
                        *plVar32 = (long)pcVar25;
                        *plVar20 = (long)pcVar28;
                        pcVar25 = pcVar28;
                      }
                      plVar13 = (long *)plVar20[1];
                      plVar32 = plVar20;
                      pcVar28 = pcVar25;
                    } while ((long *)plVar20[1] != (long *)0x0);
                    if (!bVar4) break;
joined_r0x009228d8:
                  } while (plVar36 != (long *)0x0);
                }
                plVar36 = plVar12;
                do {
                  iVar6 = FUN_00904728(auStack_7f0,*plVar36);
                  if ((iVar6 != 0) || (iVar6 = FUN_00904728(auStack_7f0,&DAT_002c4dae), iVar6 != 0))
                  goto LAB_009229b8;
                  pcVar28 = strchr((char *)*plVar36,0x3a);
                  if (pcVar28 != (char *)0x0) {
                    *pcVar28 = '\0';
                  }
                  if (((plVar36 != plVar12) &&
                      (iVar6 = FUN_00904728(auStack_810,&DAT_002b529b), iVar6 != 0)) ||
                     (iVar6 = FUN_00904728(auStack_810,*plVar36), iVar6 != 0)) goto LAB_009229b8;
                  plVar36 = (long *)plVar36[1];
                } while (plVar36 != (long *)0x0);
              }
              iVar6 = 0;
              goto LAB_009229bc;
            }
          }
        }
        else {
          plVar12 = (long *)curl_slist_append(plVar36,local_758);
          if (plVar12 != (long *)0x0) goto LAB_00922540;
        }
LAB_009229b4:
        plVar12 = plVar36;
        puVar29 = (undefined1 *)0x0;
LAB_009229b8:
        iVar6 = 0x1b;
      }
LAB_009229bc:
      curl_slist_free_all(plVar12);
      if (iVar6 != 0) {
        pcVar28 = (char *)0x0;
        pcVar8 = (char *)0x0;
        lVar26 = 0;
        pcVar25 = (char *)0x0;
        pcVar33 = (char *)0x0;
        goto LAB_0092236c;
      }
      if (local_758[0] != '\0') {
        sVar11 = strlen(local_758);
        local_758[sVar11 + 2] = '\0';
        (local_758 + sVar11)[0] = '\r';
        (local_758 + sVar11)[1] = '\n';
      }
      local_518 = 0;
      local_520 = local_650;
      pcVar28 = *(char **)(param_1 + 0x11b0);
      if (pcVar28 == (char *)0x0) {
LAB_00922b50:
        pcVar28 = *(char **)(param_1 + 0x11a8);
        sVar11 = strlen(pcVar28);
        iVar6 = FUN_00922e7c(pcVar28,sVar11,auStack_850,0);
        uVar18 = local_860;
        if (iVar6 == 0) {
          uVar15 = FUN_00904974(auStack_850);
          lVar26 = FUN_00904974(auStack_830);
          puVar34 = &DAT_002ab32c;
          if (lVar26 != 0) {
            puVar34 = (undefined1 *)FUN_00904974(auStack_830);
          }
          uVar16 = FUN_00904974(auStack_7f0);
          uVar17 = FUN_00904974(auStack_810);
          pcVar28 = (char *)curl_maprintf("%s\n%s\n%s\n%s\n%s\n%.*s",uVar18,uVar15,puVar34,uVar16,
                                          uVar17,sVar9 & 0xffffffff,pcVar8);
          if (pcVar28 == (char *)0x0) goto LAB_009224dc;
          sVar9 = strlen(local_564);
          FUN_00941848(local_564,local_564,sVar9);
          pcVar8 = (char *)curl_maprintf("%s4_request",local_564);
          if (pcVar8 == (char *)0x0) goto LAB_009224e0;
          lVar26 = curl_maprintf("%s/%s/%s/%s",&local_520,local_5ec,local_630,pcVar8);
          if (lVar26 != 0) {
            sVar9 = strlen(pcVar28);
            iVar6 = FUN_0093efe0(auStack_670,pcVar28,sVar9);
            if (iVar6 == 0) {
              FUN_009159e4(auStack_670,0x20,local_6c0,0x41);
              sVar9 = strlen(local_564);
              FUN_00941814(local_564,local_564,sVar9);
              pcVar25 = (char *)curl_maprintf("%s4-HMAC-SHA256\n%s\n%s\n%s",local_564,&local_650,
                                              lVar26,local_6c0);
              if (pcVar25 != (char *)0x0) {
                puVar34 = &DAT_002ab32c;
                if (*(undefined1 **)(param_1 + 0x12f8) != (undefined1 *)0x0) {
                  puVar34 = *(undefined1 **)(param_1 + 0x12f8);
                }
                pcVar33 = (char *)curl_maprintf("%s4%s",local_564,puVar34);
                if (pcVar33 == (char *)0x0) {
                  iVar6 = 0x1b;
                }
                else {
                  sVar9 = strlen(pcVar33);
                  sVar11 = strlen((char *)&local_520);
                  iVar6 = FUN_00923334(&PTR_FUN_00c4fc78,pcVar33,sVar9,&local_520,sVar11,&local_778)
                  ;
                  if (iVar6 == 0) {
                    sVar9 = strlen(local_5ec);
                    iVar6 = FUN_00923334(&PTR_FUN_00c4fc78,&local_778,0x20,local_5ec,sVar9,
                                         &local_798);
                    if (iVar6 == 0) {
                      sVar9 = strlen(local_630);
                      iVar6 = FUN_00923334(&PTR_FUN_00c4fc78,&local_798,0x20,local_630,sVar9,
                                           &local_778);
                      if (iVar6 == 0) {
                        sVar9 = strlen(pcVar8);
                        iVar6 = FUN_00923334(&PTR_FUN_00c4fc78,&local_778,0x20,pcVar8,sVar9,
                                             &local_798);
                        if (iVar6 == 0) {
                          sVar9 = strlen(pcVar25);
                          iVar6 = FUN_00923334(&PTR_FUN_00c4fc78,&local_798,0x20,pcVar25,sVar9,
                                               &local_778);
                          if (iVar6 == 0) {
                            FUN_009159e4(&local_778,0x20,local_6c0,0x41);
                            uVar18 = FUN_00904974(auStack_810);
                            puVar34 = &DAT_002ab32c;
                            if (puVar29 != (undefined1 *)0x0) {
                              puVar34 = puVar29;
                            }
                            lVar7 = curl_maprintf("Authorization: %s4-HMAC-SHA256 Credential=%s/%s, SignedHeaders=%s, Signature=%s\r\n%s%s"
                                                  ,local_564,puVar1,lVar26,uVar18,local_6c0,puVar34,
                                                  local_758);
                            if (lVar7 == 0) {
                              iVar6 = 0;
                            }
                            else {
                              (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x12b8));
                              iVar6 = 0;
                              *(long *)(param_1 + 0x12b8) = lVar7;
                              *(byte *)(param_1 + 0xd68) = *(byte *)(param_1 + 0xd68) | 1;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                goto LAB_0092236c;
              }
            }
          }
          goto LAB_009224e4;
        }
      }
      else {
        lVar26 = 0;
        psVar27 = local_478 + 1;
        do {
          lVar7 = lVar26;
          psVar27[-1] = (size_t)pcVar28;
          pcVar25 = strchr(pcVar28,0x26);
          if (pcVar25 == (char *)0x0) {
            sVar11 = strlen(pcVar28);
            *psVar27 = sVar11;
            break;
          }
          *psVar27 = (long)pcVar25 - (long)pcVar28;
          pcVar28 = pcVar25 + 1;
          lVar26 = lVar7 + 1;
          psVar27 = psVar27 + 2;
        } while ((uint)(lVar7 + 1) < 0x40);
        uVar35 = (uint)lVar7;
        if (uVar35 == 0x3f) {
          FUN_00904b80(param_1,"aws-sigv4: too many query pairs in URL");
          goto LAB_009220b8;
        }
        psVar27 = local_478;
        qsort(local_478,lVar7 + 1,0x10,(__compar_fn_t)&LAB_0092309c);
        uVar30 = 0;
        do {
          local_4c0[0] = '\0';
          if (psVar27[1] == 0) {
            iVar6 = 0;
          }
          else {
            iVar6 = FUN_00922e7c(*psVar27,psVar27[1],auStack_830,local_4c0);
            if ((iVar6 == 0) && (local_4c0[0] == '\0')) {
              iVar6 = FUN_009045fc(auStack_830,&DAT_002c4dac,1);
            }
            if ((uVar30 < uVar35) && (iVar6 == 0)) {
              iVar6 = FUN_009045fc(auStack_830,&DAT_002af0ff,1);
            }
          }
          if (uVar35 <= uVar30) break;
          uVar30 = uVar30 + 1;
          psVar27 = psVar27 + 2;
        } while (iVar6 == 0);
        if (iVar6 == 0) goto LAB_00922b50;
      }
    }
    pcVar28 = (char *)0x0;
    pcVar8 = (char *)0x0;
    lVar26 = 0;
    pcVar25 = (char *)0x0;
    pcVar33 = (char *)0x0;
  }
  else {
    if (local_630[0] != '\0') goto LAB_0092211c;
LAB_00922060:
    pcVar8 = strchr(pcVar28,0x2e);
    if (pcVar8 == (char *)0x0) {
      FUN_00904b80(param_1,"aws-sigv4: service missing in parameters and hostname");
      puVar29 = (undefined1 *)0x0;
    }
    else {
      uVar31 = (long)pcVar8 - (long)pcVar28;
      if (uVar31 < 0x41) {
        memcpy(local_630,pcVar28,uVar31);
        local_630[uVar31] = '\0';
        if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
           ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8)))))
        {
          FUN_00904c98(param_1,"aws_sigv4: picked service %s from host",local_630);
        }
        if (local_5ec[0] != '\0') goto LAB_0092211c;
        pcVar8 = pcVar8 + 1;
        pcVar25 = strchr(pcVar8,0x2e);
        if (pcVar25 == (char *)0x0) {
          pcVar28 = "aws-sigv4: region missing in parameters and hostname";
        }
        else {
          uVar31 = (long)pcVar25 - (long)pcVar8;
          if (uVar31 < 0x41) {
            memcpy(local_5ec,pcVar8,uVar31);
            local_5ec[uVar31] = '\0';
            if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
               ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))
                ))) {
              FUN_00904c98(param_1,"aws_sigv4: picked region %s from host",local_5ec);
            }
            goto LAB_0092211c;
          }
          pcVar28 = "aws-sigv4: region too long in hostname";
        }
      }
      else {
        pcVar28 = "aws-sigv4: service too long in hostname";
      }
      FUN_00904b80(param_1,pcVar28);
      puVar29 = (undefined1 *)0x0;
    }
LAB_009220b8:
    pcVar8 = (char *)0x0;
    pcVar28 = (char *)0x0;
    lVar26 = 0;
    pcVar25 = (char *)0x0;
    pcVar33 = (char *)0x0;
    iVar6 = 3;
  }
LAB_0092236c:
  FUN_00904534(auStack_830);
  FUN_00904534(auStack_850);
  FUN_00904534(auStack_7f0);
  FUN_00904534(auStack_810);
  (*(code *)PTR_free_00cc4678)(pcVar28);
  (*(code *)PTR_free_00cc4678)(pcVar8);
  (*(code *)PTR_free_00cc4678)(lVar26);
  (*(code *)PTR_free_00cc4678)(pcVar25);
  (*(code *)PTR_free_00cc4678)(pcVar33);
  (*(code *)PTR_free_00cc4678)(puVar29);
LAB_009223dc:
  if (*(long *)(lVar2 + 0x28) != lVar19) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar6;
}

