/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00912f88
 */

long * FUN_00912f88(long param_1,long param_2,ulong param_3,uint param_4,char *param_5,char *param_6
                   ,char *param_7,uint param_8)

{
  byte *pbVar1;
  long *plVar2;
  char cVar3;
  long lVar4;
  bool bVar5;
  bool bVar6;
  int iVar7;
  time_t tVar8;
  size_t sVar9;
  size_t sVar10;
  void *pvVar11;
  long lVar12;
  char *pcVar13;
  ulong uVar14;
  char *pcVar15;
  byte bVar16;
  long lVar17;
  size_t sVar18;
  size_t __n;
  ulong __n_00;
  long *plVar19;
  ulong uVar20;
  long *plVar21;
  long *plVar22;
  long *plVar23;
  long *plVar24;
  long *__dest;
  char *local_100;
  char *local_f0 [16];
  long local_70;
  
  lVar4 = tpidr_el0;
  local_70 = *(long *)(lVar4 + 0x28);
  tVar8 = time((time_t *)0x0);
  plVar24 = (long *)0x0;
  if (0x31 < *(byte *)(param_1 + 0x1b0)) goto LAB_00914160;
  plVar24 = (long *)(*(code *)PTR_calloc_00cc4690)(1,0x48);
  if (plVar24 != (long *)0x0) {
    if ((param_3 & 1) == 0) {
      local_f0[0] = (char *)0x0;
      iVar7 = strncmp(param_5,"#HttpOnly_",10);
      if (iVar7 == 0) {
        param_5 = param_5 + 10;
        *(undefined1 *)((long)plVar24 + 0x3b) = 1;
      }
      if (*param_5 != '#') {
        pcVar13 = strchr(param_5,0xd);
        if (pcVar13 != (char *)0x0) {
          *pcVar13 = '\0';
        }
        pcVar13 = strchr(param_5,10);
        if (pcVar13 != (char *)0x0) {
          *pcVar13 = '\0';
        }
        pcVar13 = strtok_r(param_5,"\t",local_f0);
        if (pcVar13 != (char *)0x0) {
          iVar7 = 0;
          bVar5 = false;
          do {
            switch(iVar7) {
            case 0:
              pcVar15 = pcVar13 + 1;
              if (*pcVar13 != '.') {
                pcVar15 = pcVar13;
              }
              lVar12 = (*(code *)PTR_strdup_00cc4688)(pcVar15);
              iVar7 = 0;
              plVar24[5] = lVar12;
              bVar5 = (bool)(bVar5 | lVar12 == 0);
              break;
            case 1:
              iVar7 = curl_strequal(pcVar13,&DAT_002c8db8);
              *(bool *)(plVar24 + 7) = iVar7 != 0;
              iVar7 = 1;
              break;
            case 2:
              iVar7 = strcmp("TRUE",pcVar13);
              if ((iVar7 == 0) || (iVar7 = strcmp("FALSE",pcVar13), iVar7 == 0)) {
                lVar12 = (*(code *)PTR_strdup_00cc4688)(&DAT_002a91de);
                plVar24[3] = lVar12;
                lVar17 = (*(code *)PTR_strdup_00cc4688)(&DAT_002a91de);
                bVar5 = (bool)(bVar5 | lVar12 == 0 | lVar17 == 0);
                plVar24[4] = lVar17;
                goto switchD_009138ec_caseD_3;
              }
              lVar12 = (*(code *)PTR_strdup_00cc4688)(pcVar13);
              plVar24[3] = lVar12;
              if (lVar12 == 0) {
                iVar7 = 2;
                bVar5 = true;
              }
              else {
                pcVar13 = (char *)(*(code *)PTR_strdup_00cc4688)();
                if (pcVar13 != (char *)0x0) {
                  sVar9 = strlen(pcVar13);
                  if (*pcVar13 == '\"') {
                    memmove(pcVar13,pcVar13 + 1,sVar9);
                    sVar9 = sVar9 - 1;
                  }
                  if ((sVar9 != 0) && (sVar18 = sVar9 - 1, pcVar13[sVar18] == '\"')) {
                    pcVar13[sVar18] = '\0';
                    sVar9 = sVar18;
                  }
                  if (*pcVar13 == '/') {
                    if ((sVar9 != 0) && (pcVar13[sVar9 - 1] == '/')) {
                      pcVar13[sVar9 - 1] = '\0';
                    }
                  }
                  else {
                    (*(code *)PTR_free_00cc4678)(pcVar13);
                    pcVar13 = (char *)FUN_00941948(&DAT_002a91de,1);
                  }
                }
                plVar24[4] = (long)pcVar13;
                bVar5 = (bool)(bVar5 | pcVar13 == (char *)0x0);
                iVar7 = 2;
              }
              break;
            case 3:
switchD_009138ec_caseD_3:
              *(undefined1 *)((long)plVar24 + 0x39) = 0;
              iVar7 = curl_strequal(pcVar13,&DAT_002c8db8);
              if (iVar7 != 0) {
                if (((param_8 & 1) == 0) && (*(char *)(param_2 + 0x208) == '\0')) {
                  iVar7 = 3;
                  bVar5 = true;
                  break;
                }
                *(undefined1 *)((long)plVar24 + 0x39) = 1;
              }
              iVar7 = 3;
              break;
            case 4:
              iVar7 = FUN_00941b6c(pcVar13,0,10,plVar24 + 6);
              bVar5 = (bool)(bVar5 | iVar7 != 0);
              iVar7 = 4;
              break;
            case 5:
              lVar12 = (*(code *)PTR_strdup_00cc4688)(pcVar13);
              plVar24[1] = lVar12;
              if (lVar12 == 0) {
                iVar7 = 5;
                bVar5 = true;
              }
              else {
                iVar7 = curl_strnequal("__Secure-",lVar12,9);
                if (iVar7 == 0) {
                  iVar7 = curl_strnequal("__Host-",plVar24[1],7);
                  if (iVar7 == 0) {
                    iVar7 = 5;
                    break;
                  }
                  bVar16 = *(byte *)(plVar24 + 8) | 2;
                }
                else {
                  bVar16 = *(byte *)(plVar24 + 8) | 1;
                }
                *(byte *)(plVar24 + 8) = bVar16;
                iVar7 = 5;
              }
              break;
            case 6:
              lVar12 = (*(code *)PTR_strdup_00cc4688)(pcVar13);
              bVar5 = (bool)(bVar5 | lVar12 == 0);
              iVar7 = 6;
              plVar24[2] = lVar12;
            }
            pcVar13 = strtok_r((char *)0x0,"\t",local_f0);
            iVar7 = iVar7 + 1;
          } while ((pcVar13 != (char *)0x0) && (!bVar5));
          if (iVar7 == 6) {
            lVar12 = (*(code *)PTR_strdup_00cc4688)(&DAT_002ab32c);
            bVar5 = (bool)(bVar5 | lVar12 == 0);
            iVar7 = 6;
            if (lVar12 != 0) {
              iVar7 = 7;
            }
            plVar24[2] = lVar12;
          }
          if ((bVar5) || (iVar7 != 7)) goto LAB_0091410c;
          bVar16 = *(byte *)(plVar24 + 8);
          goto joined_r0x00913bec;
        }
        goto LAB_0091410c;
      }
    }
    else {
      sVar9 = strlen(param_5);
      if (sVar9 < 0x1389) {
        pbVar1 = (byte *)(plVar24 + 8);
        plVar2 = plVar24 + 6;
        bVar5 = false;
        local_100 = param_6;
LAB_00913064:
        for (pcVar13 = param_5; (cVar3 = *pcVar13, cVar3 == ' ' || (cVar3 == '\t'));
            pcVar13 = pcVar13 + 1) {
        }
        sVar9 = strcspn(pcVar13,";\t\r\n=");
        if (sVar9 != 0) {
          param_5 = pcVar13 + sVar9;
          sVar18 = sVar9;
          do {
            if ((pcVar13[sVar18 - 1] != ' ') && (pcVar13[sVar18 - 1] != '\t')) break;
            sVar18 = sVar18 - 1;
          } while (sVar18 != 0);
          if (*param_5 == '=') {
            pcVar15 = pcVar13 + sVar9 + 1;
            sVar10 = strcspn(pcVar15,";\r\n");
            if (sVar10 == 0) {
              __n = 0;
            }
            else {
              __n = sVar10;
              do {
                if ((pcVar13[__n + sVar9] != '\t') && (pcVar13[__n + sVar9] != ' '))
                goto LAB_009131dc;
                __n = __n - 1;
              } while (__n != 0);
            }
            goto LAB_0091314c;
          }
          __n = 0;
          bVar6 = false;
          pcVar15 = (char *)0x0;
          if (sVar18 < 0xfff) goto LAB_00913178;
          goto LAB_00913ef4;
        }
        param_5 = pcVar13;
        goto LAB_00913768;
      }
    }
LAB_00914154:
    (*(code *)PTR_free_00cc4678)(plVar24);
  }
LAB_0091415c:
  plVar24 = (long *)0x0;
  goto LAB_00914160;
  while( true ) {
    __n = __n - 1;
    pcVar15 = pcVar15 + 1;
    if (__n == 0) break;
LAB_009131dc:
    if ((*pcVar15 != ' ') && (*pcVar15 != '\t')) break;
  }
LAB_0091314c:
  pvVar11 = memchr(pcVar15,9,__n);
  if (pvVar11 != (void *)0x0) {
    (*(code *)PTR_free_00cc4678)(plVar24[5]);
    (*(code *)PTR_free_00cc4678)(plVar24[3]);
    (*(code *)PTR_free_00cc4678)(plVar24[4]);
    (*(code *)PTR_free_00cc4678)(plVar24[1]);
    (*(code *)PTR_free_00cc4678)(plVar24[2]);
    (*(code *)PTR_free_00cc4678)(plVar24);
    plVar24 = (long *)0x0;
    if ((*(byte *)(param_1 + 0xa85) >> 4 & 1) == 0) goto LAB_00914160;
    if ((*(long *)(param_1 + 0x12a0) == 0) || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))) {
      FUN_00904c98(param_1,"cookie contains TAB, dropping");
    }
    goto LAB_0091415c;
  }
  param_5 = pcVar13 + sVar9 + sVar10 + 1;
  bVar6 = true;
  if (0xffe < sVar18) {
LAB_00913ef4:
    (*(code *)PTR_free_00cc4678)(plVar24[5]);
    (*(code *)PTR_free_00cc4678)(plVar24[3]);
    (*(code *)PTR_free_00cc4678)(plVar24[4]);
    (*(code *)PTR_free_00cc4678)(plVar24[1]);
    (*(code *)PTR_free_00cc4678)(plVar24[2]);
    (*(code *)PTR_free_00cc4678)(plVar24);
    plVar24 = (long *)0x0;
    if ((*(byte *)(param_1 + 0xa85) >> 4 & 1) == 0) goto LAB_00914160;
    if ((*(long *)(param_1 + 0x12a0) == 0) || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))) {
      FUN_00904c98(param_1,"oversized cookie dropped, name/val %zu + %zu bytes",sVar18,__n);
    }
    goto LAB_0091415c;
  }
LAB_00913178:
  if ((0xffe < __n) || (0x1000 < __n + sVar18)) goto LAB_00913ef4;
  if ((cVar3 == '_') && ((6 < sVar18 && (pcVar13[1] == '_')))) {
    iVar7 = curl_strnequal("__Secure-",pcVar13,9);
    if (iVar7 == 0) {
      iVar7 = curl_strnequal("__Host-",pcVar13,7);
      if (iVar7 == 0) goto LAB_00913228;
      bVar16 = *pbVar1 | 2;
    }
    else {
      bVar16 = *pbVar1 | 1;
    }
    *pbVar1 = bVar16;
  }
LAB_00913228:
  if (plVar24[1] == 0) {
    if (!bVar6) goto LAB_00914374;
    (*(code *)PTR_free_00cc4678)(0);
    lVar12 = FUN_00941948(pcVar13,sVar18);
    plVar24[1] = lVar12;
    (*(code *)PTR_free_00cc4678)(plVar24[2]);
    pcVar13 = (char *)FUN_00941948(pcVar15,__n);
    plVar24[2] = (long)pcVar13;
    if ((pcVar13 == (char *)0x0) || (pcVar15 = (char *)plVar24[1], pcVar15 == (char *)0x0))
    goto LAB_00914374;
    sVar9 = strcspn(pcVar13,
                    "\x01\x02\x03\x04\x05\x06\a\b\n\v\f\r\x0e\x0f\x10\x11\x12\x13\x14\x15\x16\x17\x18\x19\x1a\x1b\x1c\x1d\x1e\x1f\x7f"
                   );
    if ((pcVar13[sVar9] != '\0') ||
       (sVar9 = strcspn(pcVar15,
                        "\x01\x02\x03\x04\x05\x06\a\b\n\v\f\r\x0e\x0f\x10\x11\x12\x13\x14\x15\x16\x17\x18\x19\x1a\x1b\x1c\x1d\x1e\x1f\x7f"
                       ), pcVar15[sVar9] != '\0')) {
      if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
         ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
        FUN_00904c98(param_1,"invalid octets in name/value, cookie dropped");
      }
      goto LAB_00914374;
    }
    goto LAB_00913768;
  }
  if (__n == 0) {
    if (sVar18 == 8) {
      iVar7 = curl_strnequal("httponly",pcVar13,8);
      if (iVar7 != 0) {
        *(undefined1 *)((long)plVar24 + 0x3b) = 1;
        goto LAB_00913768;
      }
    }
    else if ((sVar18 == 6) && (iVar7 = curl_strnequal("secure",pcVar13,6), iVar7 != 0)) {
      if (((param_8 & 1) == 0) && (*(char *)(param_2 + 0x208) != '\0')) goto LAB_00914374;
      *(undefined1 *)((long)plVar24 + 0x39) = 1;
      goto LAB_00913768;
    }
    if (!bVar6) goto LAB_00913768;
  }
  if (sVar18 == 7) {
    iVar7 = curl_strnequal("version",pcVar13,7);
    if (iVar7 != 0) goto LAB_00913768;
    iVar7 = curl_strnequal("max-age",pcVar13,7);
    if (iVar7 == 0) {
      iVar7 = curl_strnequal("expires",pcVar13,7);
      if (((iVar7 == 0) || (0x7f < __n)) || (*plVar2 != 0)) goto LAB_00913768;
      memcpy(local_f0,pcVar15,__n);
      *(undefined1 *)((long)local_f0 + __n) = 0;
      lVar12 = FUN_009313b8(local_f0);
      *plVar2 = lVar12;
      if (lVar12 != 0) {
        if (lVar12 < 0) {
          *plVar2 = 0;
        }
        goto LAB_00913768;
      }
LAB_009136a8:
      *plVar2 = 1;
    }
    else {
      pcVar13 = pcVar15 + 1;
      if (*pcVar15 != '\"') {
        pcVar13 = pcVar15;
      }
      iVar7 = FUN_00941b6c(pcVar13,0,10,plVar2);
      if (iVar7 == 0) {
        lVar12 = *plVar2;
        if (lVar12 == 0) {
          *plVar2 = 1;
          goto LAB_00913768;
        }
        if (lVar12 <= 0x7fffffffffffffff - tVar8) {
          *plVar2 = lVar12 + tVar8;
          goto LAB_00913768;
        }
      }
      else {
        if (iVar7 == 2) goto LAB_009136a8;
        if (iVar7 != 1) goto LAB_00913768;
      }
      *plVar2 = 0x7fffffffffffffff;
    }
    goto LAB_00913768;
  }
  if (sVar18 != 6) {
    if ((sVar18 == 4) && (iVar7 = curl_strnequal(&DAT_002c4e25,pcVar13,4), iVar7 != 0)) {
      (*(code *)PTR_free_00cc4678)(plVar24[3]);
      lVar12 = FUN_00941948(pcVar15,__n);
      plVar24[3] = lVar12;
      if (lVar12 == 0) goto LAB_00914374;
      (*(code *)PTR_free_00cc4678)(plVar24[4]);
      pcVar13 = (char *)(*(code *)PTR_strdup_00cc4688)(plVar24[3]);
      if (pcVar13 == (char *)0x0) goto LAB_00914308;
      sVar9 = strlen(pcVar13);
      if (*pcVar13 == '\"') {
        memmove(pcVar13,pcVar13 + 1,sVar9);
        sVar9 = sVar9 - 1;
      }
      if ((sVar9 != 0) && (sVar18 = sVar9 - 1, pcVar13[sVar18] == '\"')) {
        pcVar13[sVar18] = '\0';
        sVar9 = sVar18;
      }
      if (*pcVar13 == '/') {
        if ((sVar9 != 0) && (pcVar13[sVar9 - 1] == '/')) {
          pcVar13[sVar9 - 1] = '\0';
        }
        plVar24[4] = (long)pcVar13;
      }
      else {
        (*(code *)PTR_free_00cc4678)(pcVar13);
        lVar12 = FUN_00941948(&DAT_002a91de,1);
        plVar24[4] = lVar12;
        if (lVar12 == 0) goto LAB_00914374;
      }
    }
    goto LAB_00913768;
  }
  iVar7 = curl_strnequal("domain",pcVar13,6);
  if ((__n == 0) || (iVar7 == 0)) goto LAB_00913768;
  __n_00 = __n - (*pcVar15 == '.');
  pcVar13 = pcVar15 + 1;
  if (*pcVar15 != '.') {
    pcVar13 = pcVar15;
  }
  if (((__n_00 == 9) && (iVar7 = curl_strnequal(pcVar13,"localhost",9), iVar7 != 0)) ||
     ((pvVar11 = memchr(pcVar13,0x2e,__n_00), pvVar11 != (void *)0x0 &&
      ((char *)0x1 < pcVar13 + (__n_00 - (long)pvVar11))))) {
    pcVar15 = local_100;
    if (local_100 == (char *)0x0) {
      pcVar15 = pcVar13;
    }
    uVar14 = FUN_009172dc(pcVar15);
    uVar20 = uVar14 & 0xffffffff;
    if (local_100 != (char *)0x0) goto joined_r0x0091359c;
    local_100 = (char *)0x0;
LAB_00913650:
    (*(code *)PTR_free_00cc4678)(plVar24[5]);
    lVar12 = FUN_00941948(pcVar13,__n_00);
    plVar24[5] = lVar12;
    if (((uVar20 & 1) == 0) && (lVar12 != 0)) {
      *(undefined1 *)(plVar24 + 7) = 1;
    }
    else {
      if (lVar12 == 0) {
        bVar5 = true;
        iVar7 = 6;
        goto LAB_00913794;
      }
      bVar5 = (bool)(bVar5 | lVar12 == 0);
    }
  }
  else {
    local_100 = ":";
    uVar14 = FUN_009172dc(&DAT_002bcda4);
joined_r0x0091359c:
    if ((uVar14 & 1) == 0) {
      sVar9 = strlen(local_100);
      if (__n_00 <= sVar9) {
        iVar7 = curl_strnequal(pcVar13,local_100 + (sVar9 - __n_00),__n_00);
        if (iVar7 != 0) {
          if (sVar9 == __n_00) {
            uVar20 = 0;
          }
          else {
            uVar20 = 0;
            if ((local_100 + (sVar9 - __n_00))[-1] != '.') goto LAB_00913704;
          }
          goto LAB_00913650;
        }
      }
    }
    else {
      iVar7 = strncmp(pcVar13,local_100,__n_00);
      if ((iVar7 == 0) && (sVar9 = strlen(local_100), __n_00 == sVar9)) {
        uVar20 = 1;
        goto LAB_00913650;
      }
    }
LAB_00913704:
    if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
       ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
      FUN_00904c98(param_1,"skipped cookie with bad tailmatch domain: %s",pcVar13);
    }
    bVar5 = true;
  }
LAB_00913768:
  for (; (cVar3 = *param_5, cVar3 == ' ' || (cVar3 == '\t')); param_5 = param_5 + 1) {
  }
  iVar7 = 0;
  if (cVar3 == ';') {
    param_5 = param_5 + 1;
  }
  else {
    iVar7 = 6;
  }
  if (iVar7 != 0) goto LAB_00913794;
  goto LAB_00913064;
LAB_00913794:
  if (iVar7 == 6) {
    if (bVar5) goto LAB_00914374;
    if ((local_100 != (char *)0x0) && (plVar24[5] == 0)) {
      lVar12 = (*(code *)PTR_strdup_00cc4688)(local_100);
      plVar24[5] = lVar12;
      if (lVar12 == 0) goto LAB_00914374;
    }
    if ((param_7 == (char *)0x0) || (plVar24[3] != 0)) {
LAB_0091433c:
      if (plVar24[1] != 0) {
LAB_00914344:
        *(char *)(param_1 + 0x1b0) = *(char *)(param_1 + 0x1b0) + '\x01';
        bVar16 = *pbVar1;
joined_r0x00913bec:
        if (((((bVar16 & 1) == 0) || (*(char *)((long)plVar24 + 0x39) != '\0')) &&
            (((bVar16 >> 1 & 1) == 0 ||
             ((((*(char *)((long)plVar24 + 0x39) != '\0' && ((char *)plVar24[3] != (char *)0x0)) &&
               (iVar7 = strcmp((char *)plVar24[3],"/"), iVar7 == 0)) && ((char)plVar24[7] == '\0')))
             ))) && (((*(char *)(param_2 + 0x208) != '\0' || (*(char *)(param_2 + 0x209) == '\0'))
                     || (plVar24[6] != 0)))) {
          *(char *)((long)plVar24 + 0x3a) = *(char *)(param_2 + 0x208);
          iVar7 = *(int *)(param_2 + 0x204) + 1;
          *(int *)(param_2 + 0x204) = iVar7;
          *(int *)((long)plVar24 + 0x3c) = iVar7;
          if ((param_4 & 1) == 0) {
            tVar8 = time((time_t *)0x0);
            if ((*(long *)(param_2 + 0x1f8) <= tVar8) ||
               (*(long *)(param_2 + 0x1f8) == 0x7fffffffffffffff)) {
              *(undefined8 *)(param_2 + 0x1f8) = 0x7fffffffffffffff;
              lVar12 = 0;
              do {
                plVar2 = (long *)(param_2 + lVar12 * 8);
                plVar22 = (long *)*plVar2;
                if (plVar22 != (long *)0x0) {
                  plVar21 = (long *)0x0;
                  do {
                    while( true ) {
                      plVar23 = plVar22;
                      lVar17 = plVar23[6];
                      plVar22 = (long *)*plVar23;
                      if ((lVar17 == 0) || (tVar8 <= lVar17)) break;
                      plVar19 = plVar2;
                      if (plVar21 != (long *)0x0) {
                        plVar19 = plVar21;
                      }
                      *plVar19 = (long)plVar22;
                      *(int *)(param_2 + 0x200) = *(int *)(param_2 + 0x200) + -1;
                      (*(code *)PTR_free_00cc4678)(plVar23[5]);
                      (*(code *)PTR_free_00cc4678)(plVar23[3]);
                      (*(code *)PTR_free_00cc4678)(plVar23[4]);
                      (*(code *)PTR_free_00cc4678)(plVar23[1]);
                      (*(code *)PTR_free_00cc4678)(plVar23[2]);
                      (*(code *)PTR_free_00cc4678)(plVar23);
                      if (plVar22 == (long *)0x0) goto LAB_00913d08;
                    }
                    if ((lVar17 != 0) && (lVar17 < *(long *)(param_2 + 0x1f8))) {
                      *(long *)(param_2 + 0x1f8) = lVar17;
                    }
                    plVar21 = plVar23;
                  } while (plVar22 != (long *)0x0);
                }
LAB_00913d08:
                lVar12 = lVar12 + 1;
              } while (lVar12 != 0x3f);
            }
          }
          lVar12 = FUN_009143c8(plVar24[5]);
          plVar2 = (long *)(param_2 + lVar12 * 8);
          plVar22 = (long *)*plVar2;
          if (plVar22 == (long *)0x0) {
            plVar21 = (long *)0x0;
            bVar5 = false;
          }
          else {
            bVar5 = false;
            plVar19 = (long *)0x0;
            plVar23 = (long *)0x0;
            __dest = (long *)0x0;
LAB_00913d38:
            do {
              plVar21 = plVar22;
              iVar7 = curl_strequal(plVar21[1],plVar24[1]);
              if (iVar7 != 0) {
                if (plVar21[5] == 0) {
                  if (plVar24[5] == 0) goto LAB_00913d64;
                }
                else if ((plVar24[5] != 0) && (iVar7 = curl_strequal(), iVar7 != 0)) {
LAB_00913d64:
                  pcVar13 = (char *)plVar21[4];
                  if (((pcVar13 != (char *)0x0) &&
                      (((lVar12 = plVar24[4], lVar12 != 0 &&
                        (*(char *)((long)plVar21 + 0x39) != '\0')) &&
                       (*(char *)((long)plVar24 + 0x39) == '\0')))) && ((param_8 & 1) == 0)) {
                    pcVar15 = strchr(pcVar13 + 1,0x2f);
                    if (pcVar15 == (char *)0x0) {
                      sVar9 = strlen(pcVar13);
                    }
                    else {
                      sVar9 = (long)pcVar15 - (long)pcVar13;
                    }
                    iVar7 = curl_strnequal(pcVar13,lVar12,sVar9);
                    if (iVar7 != 0) {
                      if (((param_1 != 0) && ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
                         ((*(long *)(param_1 + 0x12a0) == 0 ||
                          (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
                        FUN_00904c98(param_1,
                                     "cookie \'%s\' for domain \'%s\' dropped, would overlay an existing cookie"
                                     ,plVar24[1],plVar24[5]);
                      }
                      goto LAB_00914374;
                    }
                  }
                }
              }
              if (plVar23 != (long *)0x0) {
                plVar22 = (long *)*plVar21;
joined_r0x00913e54:
                if (plVar22 == (long *)0x0) break;
                goto LAB_00913d38;
              }
              iVar7 = curl_strequal(plVar21[1],plVar24[1]);
              if (iVar7 == 0) {
LAB_00913e4c:
                plVar23 = (long *)0x0;
                plVar22 = (long *)*plVar21;
                goto joined_r0x00913e54;
              }
              if (plVar21[5] != 0) {
                if ((plVar24[5] != 0) && (iVar7 = curl_strequal(), iVar7 != 0)) {
                  bVar6 = (char)plVar21[7] == (char)plVar24[7];
                  goto LAB_00913dfc;
                }
                if (bVar5) goto LAB_00913e08;
LAB_00913e48:
                bVar5 = false;
                goto LAB_00913e4c;
              }
              bVar6 = plVar24[5] == 0;
LAB_00913dfc:
              if (!bVar5 && !bVar6) goto LAB_00913e48;
LAB_00913e08:
              if (plVar21[4] == 0) {
                if (plVar24[4] == 0) goto LAB_00913e64;
                goto LAB_00913e48;
              }
              if (plVar24[4] == 0) {
                if (plVar24[4] != 0) goto LAB_00913e64;
                goto LAB_00913e48;
              }
              iVar7 = curl_strequal();
              if ((iVar7 == 0) || ((plVar21[4] == 0) != (plVar24[4] == 0))) goto LAB_00913e48;
LAB_00913e64:
              if ((*(char *)((long)plVar24 + 0x3a) == '\0') &&
                 (*(char *)((long)plVar21 + 0x3a) != '\0')) goto LAB_00914374;
              bVar5 = true;
              plVar22 = (long *)*plVar21;
              plVar19 = plVar24;
              plVar23 = plVar24;
              __dest = plVar21;
            } while ((long *)*plVar21 != (long *)0x0);
            if (plVar23 != (long *)0x0) {
              *plVar23 = *__dest;
              *(undefined4 *)((long)plVar23 + 0x3c) = *(undefined4 *)((long)__dest + 0x3c);
              (*(code *)PTR_free_00cc4678)(__dest[1]);
              (*(code *)PTR_free_00cc4678)(__dest[2]);
              (*(code *)PTR_free_00cc4678)(__dest[5]);
              (*(code *)PTR_free_00cc4678)(__dest[3]);
              (*(code *)PTR_free_00cc4678)(__dest[4]);
              memcpy(__dest,plVar19,0x48);
              (*(code *)PTR_free_00cc4678)(plVar19);
              plVar24 = __dest;
            }
          }
          if ((((param_1 != 0) && (*(char *)(param_2 + 0x208) != '\0')) &&
              ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
             ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))
             ) {
            pcVar13 = "Replaced";
            if (!bVar5) {
              pcVar13 = "Added";
            }
            FUN_00904c98(param_1,"%s cookie %s=\"%s\" for domain %s, path %s, expire %ld",pcVar13,
                         plVar24[1],plVar24[2],plVar24[5],plVar24[3],plVar24[6]);
          }
          if (!bVar5) {
            if (plVar21 != (long *)0x0) {
              plVar2 = plVar21;
            }
            *plVar2 = (long)plVar24;
            *(int *)(param_2 + 0x200) = *(int *)(param_2 + 0x200) + 1;
          }
          lVar12 = plVar24[6];
          if ((lVar12 != 0) && (lVar12 < *(long *)(param_2 + 0x1f8))) {
            *(long *)(param_2 + 0x1f8) = lVar12;
          }
          goto LAB_00914160;
        }
LAB_0091410c:
        (*(code *)PTR_free_00cc4678)(plVar24[5]);
        (*(code *)PTR_free_00cc4678)(plVar24[3]);
        (*(code *)PTR_free_00cc4678)(plVar24[4]);
        (*(code *)PTR_free_00cc4678)(plVar24[1]);
        (*(code *)PTR_free_00cc4678)(plVar24[2]);
        goto LAB_00914154;
      }
    }
    else {
      pcVar13 = strchr(param_7,0x3f);
      if (pcVar13 == (char *)0x0) {
        pcVar13 = strrchr(param_7,0x2f);
        if (pcVar13 != (char *)0x0) goto LAB_00914254;
        goto LAB_0091433c;
      }
      pcVar13 = memrchr(param_7,0x2f,(long)pcVar13 - (long)param_7);
      if (pcVar13 == (char *)0x0) goto LAB_0091433c;
LAB_00914254:
      lVar12 = FUN_00941948(param_7,pcVar13 + (1 - (long)param_7));
      plVar24[3] = lVar12;
      if (lVar12 != 0) {
        pcVar13 = (char *)(*(code *)PTR_strdup_00cc4688)();
        if (pcVar13 == (char *)0x0) {
LAB_00914308:
          plVar24[4] = 0;
          goto LAB_00914374;
        }
        sVar9 = strlen(pcVar13);
        if (*pcVar13 == '\"') {
          memmove(pcVar13,pcVar13 + 1,sVar9);
          sVar9 = sVar9 - 1;
        }
        if ((sVar9 != 0) && (sVar18 = sVar9 - 1, pcVar13[sVar18] == '\"')) {
          pcVar13[sVar18] = '\0';
          sVar9 = sVar18;
        }
        if (*pcVar13 != '/') {
          (*(code *)PTR_free_00cc4678)(pcVar13);
          lVar12 = FUN_00941948(&DAT_002a91de,1);
          plVar24[4] = lVar12;
          if (lVar12 != 0) goto LAB_0091433c;
          goto LAB_00914374;
        }
        if ((sVar9 != 0) && (pcVar13[sVar9 - 1] == '/')) {
          pcVar13[sVar9 - 1] = '\0';
        }
        plVar24[4] = (long)pcVar13;
        if (plVar24[1] == 0) goto LAB_00914374;
        goto LAB_00914344;
      }
    }
LAB_00914374:
    (*(code *)PTR_free_00cc4678)(plVar24[5]);
    (*(code *)PTR_free_00cc4678)(plVar24[3]);
    (*(code *)PTR_free_00cc4678)(plVar24[4]);
    (*(code *)PTR_free_00cc4678)(plVar24[1]);
    (*(code *)PTR_free_00cc4678)(plVar24[2]);
    (*(code *)PTR_free_00cc4678)(plVar24);
  }
  plVar24 = (long *)0x0;
LAB_00914160:
  if (*(long *)(lVar4 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return plVar24;
}

