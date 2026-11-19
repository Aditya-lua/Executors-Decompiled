/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00962c10
 */

int FUN_00962c10(byte *param_1,undefined8 *param_2,uint param_3)

{
  long lVar1;
  bool bVar2;
  long lVar3;
  int iVar4;
  fde_table_entry *pfVar5;
  fde_table_entry *pfVar6;
  char *pcVar7;
  size_t sVar8;
  undefined *puVar9;
  long lVar10;
  void *pvVar11;
  byte *pbVar12;
  byte bVar13;
  byte *pbVar14;
  ulong uVar15;
  byte *pbVar16;
  byte *pbVar17;
  byte *pbVar18;
  undefined8 uVar19;
  long lVar20;
  long local_138;
  undefined8 local_130;
  undefined8 local_128;
  undefined8 local_120;
  undefined8 local_118;
  undefined8 local_110;
  undefined8 local_108;
  byte *local_100;
  long local_f8;
  long local_f0;
  byte local_e6;
  undefined1 auStack_e0 [32];
  undefined1 auStack_c0 [36];
  char local_9c [44];
  long local_70;
  
  lVar1 = tpidr_el0;
  local_70 = *(long *)(lVar1 + 0x28);
  memset(&local_138,0,0x58);
  FUN_00904528(auStack_c0,&fde_table_entry_007a1200);
  pfVar5 = (fde_table_entry *)strlen((char *)param_1);
  if (((&fde_table_entry_007a1200 < pfVar5) ||
      (pfVar6 = (fde_table_entry *)
                strcspn((char *)param_1,
                        "\x01\x02\x03\x04\x05\x06\a\b\t\n\v\f\r\x0e\x0f\x10\x11\x12\x13\x14\x15\x16\x17\x18\x19\x1a\x1b\x1c\x1d\x1e\x1f\x7f"
                       ), pfVar6 != pfVar5)) ||
     (((param_3 >> 0xb & 1) == 0 && (pcVar7 = strchr((char *)param_1,0x20), pcVar7 != (char *)0x0)))
     ) {
    iVar4 = 3;
    goto LAB_00962cb4;
  }
  local_9c[0] = '\0';
  if ((byte)((*param_1 & 0xdf) + 0xbf) < 0x1a) {
    uVar15 = 1;
    while( true ) {
      bVar13 = param_1[uVar15];
      if (bVar13 == 0) break;
      if (((9 < bVar13 - 0x30) && (0x19 < (byte)((bVar13 & 0xdf) + 0xbf))) &&
         ((0x2e < bVar13 || ((1L << ((ulong)bVar13 & 0x3f) & 0x680000000000U) == 0))))
      goto LAB_00962dec;
      uVar15 = uVar15 + 1;
      if (0x27 < uVar15) goto code_r0x00962de8;
    }
  }
LAB_00962e08:
  if ((param_3 & 0x204) == 0) {
    iVar4 = 0x1b;
    goto LAB_00962cb4;
  }
  pbVar18 = param_1;
  if ((param_3 >> 2 & 1) == 0) {
    bVar2 = false;
    uVar19 = 0;
LAB_00962e54:
    sVar8 = strcspn((char *)pbVar18,"/?#");
    pbVar12 = pbVar18 + sVar8;
    pbVar17 = param_1 + ((long)pfVar5 - (long)pbVar12);
    if (sVar8 == 0) {
      if ((param_3 >> 10 & 1) != 0) {
        iVar4 = FUN_00904728(auStack_c0,&DAT_002ab32c,0);
        if (iVar4 == 0) goto LAB_009631f4;
        goto LAB_009635b0;
      }
      iVar4 = 0xe;
    }
    else {
      iVar4 = FUN_00960ca0(&local_138,pbVar18,sVar8,param_3,auStack_c0,uVar19);
      if (iVar4 == 0) {
        if ((param_3 & 0x200) != 0 && !bVar2) {
          uVar19 = FUN_00904974(auStack_c0);
          iVar4 = curl_strnequal(uVar19,&DAT_002db5e9,4);
          if (iVar4 == 0) {
            iVar4 = curl_strnequal(uVar19,"dict.",5);
            if (iVar4 == 0) {
              iVar4 = curl_strnequal(uVar19,"ldap.",5);
              if (iVar4 == 0) {
                iVar4 = curl_strnequal(uVar19,"imap.",5);
                if (iVar4 == 0) {
                  iVar4 = curl_strnequal(uVar19,"smtp.",5);
                  if (iVar4 == 0) {
                    iVar4 = curl_strnequal(uVar19,"pop3.",5);
                    puVar9 = &DAT_002b3577;
                    if (iVar4 != 0) {
                      puVar9 = &DAT_0029d854;
                    }
                  }
                  else {
                    puVar9 = &DAT_002b38ea;
                  }
                }
                else {
                  puVar9 = &DAT_0029f819;
                }
              }
              else {
                puVar9 = &DAT_002b3969;
              }
            }
            else {
              puVar9 = &DAT_002d1119;
            }
          }
          else {
            puVar9 = &DAT_002a5355;
          }
          local_138 = (*(code *)PTR_strdup_00cc4688)(puVar9);
          if (local_138 == 0) goto LAB_009635b0;
          local_e6 = local_e6 | 4;
        }
LAB_009631f4:
        pbVar18 = (byte *)strchr((char *)pbVar12,0x23);
        if (pbVar18 != (byte *)0x0) {
          pbVar16 = pbVar18 + -(long)pbVar12;
          uVar15 = (long)pbVar17 - (long)pbVar16;
          local_e6 = local_e6 | 2;
          pbVar17 = pbVar16;
          if (1 < uVar15) {
            if ((param_3 >> 7 & 1) == 0) {
              local_f0 = FUN_00941948(pbVar18 + 1,uVar15 - 1);
              if (local_f0 == 0) goto LAB_009635b0;
            }
            else {
              FUN_00904528(auStack_e0,&fde_table_entry_007a1200);
              iVar4 = FUN_00961e58(auStack_e0,pbVar18 + 1,uVar15 - 1,1,0);
              if (iVar4 != 0) goto LAB_00962cb4;
              local_f0 = FUN_00904974(auStack_e0);
            }
          }
        }
        pvVar11 = memchr(pbVar12,0x3f,(size_t)pbVar17);
        if (pvVar11 != (void *)0x0) {
          if (pbVar18 == (byte *)0x0) {
            pbVar18 = pbVar12 + (long)pbVar17;
          }
          uVar15 = (long)pbVar18 - (long)pvVar11;
          pbVar17 = pbVar17 + -uVar15;
          local_e6 = local_e6 | 1;
          if (uVar15 < 2) {
            local_f8 = (*(code *)PTR_strdup_00cc4688)(&DAT_002ab32c);
          }
          else {
            if ((param_3 >> 7 & 1) != 0) {
              FUN_00904528(auStack_e0,&fde_table_entry_007a1200);
              iVar4 = FUN_00961e58(auStack_e0,(long)pvVar11 + 1,uVar15 - 1,1,1);
              if (iVar4 != 0) goto LAB_00962cb4;
              local_f8 = FUN_00904974(auStack_e0);
              goto LAB_00963340;
            }
            local_f8 = FUN_00941948((long)pvVar11 + 1,uVar15 - 1);
          }
          if (local_f8 == 0) goto LAB_009635b0;
        }
LAB_00963340:
        if (((param_3 >> 7 & 1) != 0) && (pbVar17 != (byte *)0x0)) {
          FUN_00904528(auStack_e0,&fde_table_entry_007a1200);
          iVar4 = FUN_00961e58(auStack_e0,pbVar12,pbVar17,1,0);
          if (iVar4 != 0) goto LAB_00962cb4;
          pbVar17 = (byte *)FUN_00904984(auStack_e0);
          pbVar12 = (byte *)FUN_00904974(auStack_e0);
          local_100 = pbVar12;
        }
        if ((byte *)0x1 < pbVar17) {
          if (local_100 == (byte *)0x0) {
            local_100 = (byte *)FUN_00941948(pbVar12,pbVar17);
            pbVar12 = local_100;
            if (local_100 == (byte *)0x0) goto LAB_009635b0;
          }
          else if ((param_3 >> 7 & 1) != 0) {
            local_100[(long)pbVar17] = 0;
          }
          if ((param_3 >> 4 & 1) == 0) {
            pvVar11 = memchr(pbVar12,0x2e,(size_t)pbVar17);
            if (pvVar11 != (void *)0x0) {
              pbVar18 = (byte *)(*(code *)PTR_malloc_00cc4670)(pbVar17 + 1);
              if (pbVar18 != (byte *)0x0) {
                pbVar17 = pbVar12 + (long)pbVar17;
                *pbVar18 = 0;
                pbVar16 = pbVar18;
                do {
                  while( true ) {
                    bVar13 = *pbVar12;
                    uVar15 = (ulong)bVar13;
                    if (bVar13 == 0x2e) break;
                    pbVar14 = pbVar16;
                    if (bVar13 == 0x2f) {
                      iVar4 = strncmp("/./",(char *)pbVar12,3);
                      if (iVar4 == 0) goto LAB_00963574;
                      iVar4 = strcmp("/.",(char *)pbVar12);
                      if ((iVar4 == 0) || (iVar4 = strncmp("/.?",(char *)pbVar12,3), iVar4 == 0))
                      goto LAB_009635cc;
                      iVar4 = strncmp("/../",(char *)pbVar12,4);
                      if (iVar4 != 0) {
                        iVar4 = strcmp("/..",(char *)pbVar12);
                        if (iVar4 != 0) {
                          iVar4 = strncmp("/..?",(char *)pbVar12,4);
                          if (iVar4 != 0) goto LAB_00963548;
                        }
                        goto LAB_009635b8;
                      }
                      pbVar12 = pbVar12 + 3;
                      do {
                        if (pbVar16 <= pbVar18) break;
                        pbVar16 = pbVar16 + -1;
                      } while (*pbVar16 != 0x2f);
                    }
                    else {
LAB_00963548:
                      do {
                        do {
                          pbVar16 = pbVar14 + 1;
                          *pbVar14 = (byte)uVar15;
                          pbVar12 = pbVar12 + 1;
                          uVar15 = (ulong)*pbVar12;
                          pbVar14 = pbVar16;
                        } while (0x3f < *pbVar12);
                      } while ((1L << (uVar15 & 0x3f) & 0x8000800000000001U) == 0);
                    }
                    *pbVar16 = 0;
joined_r0x0096357c:
                    if (pbVar17 <= pbVar12) goto LAB_009635e0;
                  }
                  iVar4 = strncmp("./",(char *)pbVar12,2);
                  if (iVar4 == 0) {
LAB_00963574:
                    pbVar12 = pbVar12 + 2;
                    goto joined_r0x0096357c;
                  }
                  iVar4 = strncmp("../",(char *)pbVar12,3);
                  if (iVar4 != 0) {
                    iVar4 = strcmp(".",(char *)pbVar12);
                    if (((iVar4 != 0) && (iVar4 = strcmp("..",(char *)pbVar12), iVar4 != 0)) &&
                       (iVar4 = strncmp(".?",(char *)pbVar12,2), iVar4 != 0)) {
                      iVar4 = strncmp("..?",(char *)pbVar12,3);
                      pbVar14 = pbVar16;
                      if (iVar4 != 0) goto LAB_00963548;
                    }
                    pbVar12 = pbVar18;
                    goto LAB_009635dc;
                  }
                  pbVar12 = pbVar12 + 3;
                } while (pbVar12 < pbVar17);
                goto LAB_009635e0;
              }
              goto LAB_009635b0;
            }
          }
        }
        goto LAB_009635f8;
      }
    }
  }
  else {
    uVar19 = 0;
    pcVar7 = "https";
LAB_00962e38:
    local_138 = (*(code *)PTR_strdup_00cc4688)(pcVar7);
    if (local_138 != 0) {
      bVar2 = true;
      goto LAB_00962e54;
    }
LAB_009635b0:
    iVar4 = 7;
  }
LAB_00962cb4:
  FUN_00904534(auStack_c0);
  (*(code *)PTR_free_00cc4678)(local_138);
  (*(code *)PTR_free_00cc4678)(local_130);
  (*(code *)PTR_free_00cc4678)(local_128);
  (*(code *)PTR_free_00cc4678)(local_120);
  (*(code *)PTR_free_00cc4678)(local_118);
  (*(code *)PTR_free_00cc4678)(local_110);
  (*(code *)PTR_free_00cc4678)(local_108);
  (*(code *)PTR_free_00cc4678)(local_100);
  (*(code *)PTR_free_00cc4678)(local_f8);
  (*(code *)PTR_free_00cc4678)(local_f0);
LAB_00962d3c:
  if (*(long *)(lVar1 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar4;
code_r0x00962de8:
  bVar13 = param_1[uVar15];
LAB_00962dec:
  if (bVar13 != 0x3a) goto LAB_00962e08;
  pbVar18 = param_1 + uVar15 + 1;
  if (((param_3 & 0x204) != 0) && (*pbVar18 != 0x2f)) goto LAB_00962e08;
  FUN_00941848(local_9c,param_1,uVar15);
  local_9c[uVar15] = '\0';
  iVar4 = strcmp(local_9c,"file");
  if (iVar4 != 0) {
    lVar20 = 0;
    if (*pbVar18 == 0x2f) {
      lVar10 = 0;
      do {
        lVar20 = lVar10 + 1;
        if (3 < (uint)lVar20) break;
        lVar3 = lVar10 + uVar15;
        lVar10 = lVar20;
      } while (param_1[lVar3 + 2] == 0x2f);
      pbVar18 = param_1 + lVar20 + uVar15 + 1;
    }
    lVar10 = FUN_00946e30(local_9c);
    if (((param_3 >> 3 & 1) != 0) || (lVar10 != 0)) {
      if (2 < (int)lVar20 - 1U) {
        iVar4 = 0x1c;
        goto LAB_00962cb4;
      }
      pcVar7 = local_9c;
      uVar19 = 1;
      goto LAB_00962e38;
    }
    iVar4 = 5;
    goto LAB_00962cb4;
  }
  if (pfVar5 < (fde_table_entry *)0x7) {
LAB_00962f88:
    iVar4 = 0x13;
    goto LAB_00962cb4;
  }
  local_138 = (*(code *)PTR_strdup_00cc4688)(&DAT_002d74d1);
  if (local_138 == 0) goto LAB_009635b0;
  pbVar12 = param_1 + 5;
  pbVar17 = (byte *)((long)&pfVar5[-1].initial_loc + 3);
  if ((*pbVar12 == 0x2f) && (param_1[6] == 0x2f)) {
    pbVar12 = param_1 + 7;
    if ((*pbVar12 != 0x2f) &&
       (((0x19 < (byte)((*pbVar12 & 0xdf) + 0xbf) || ((param_1[8] != 0x7c && (param_1[8] != 0x3a))))
        || ((bVar13 = param_1[9], bVar13 != 0 && ((bVar13 != 0x2f && (bVar13 != 0x5c)))))))) {
      iVar4 = curl_strnequal(pbVar12,"localhost/",10);
      if ((iVar4 == 0) && (iVar4 = curl_strnequal(pbVar12,"127.0.0.1/",10), iVar4 == 0))
      goto LAB_00962f88;
      pbVar12 = param_1 + 0x10;
    }
    pbVar17 = param_1 + ((long)pfVar5 - (long)pbVar12);
  }
  FUN_0090456c(auStack_c0);
  if (*pbVar12 == 0x2f) {
    if (((byte)((pbVar12[1] & 0xdf) + 0xbf) < 0x1a) &&
       ((pbVar12[2] == 0x7c || (pbVar12[2] == 0x3a)))) {
      bVar13 = pbVar12[3];
      goto joined_r0x00963144;
    }
  }
  else if (((byte)((*pbVar12 & 0xdf) + 0xbf) < 0x1a) &&
          ((pbVar12[1] == 0x7c || (pbVar12[1] == 0x3a)))) {
    bVar13 = pbVar12[2];
joined_r0x00963144:
    iVar4 = 0x13;
    if (((bVar13 == 0) || (iVar4 = 0x13, bVar13 == 0x2f)) || (bVar13 == 0x5c)) goto LAB_00962cb4;
  }
  goto LAB_009631f4;
  while (pbVar16 = pbVar16 + -1, *pbVar16 != 0x2f) {
LAB_009635b8:
    if (pbVar16 <= pbVar18) break;
  }
LAB_009635cc:
  *pbVar16 = 0x2f;
  pbVar12 = pbVar16 + 1;
LAB_009635dc:
  *pbVar12 = 0;
LAB_009635e0:
  (*(code *)PTR_free_00cc4678)(local_100);
  local_100 = pbVar18;
LAB_009635f8:
  local_118 = FUN_00904974(auStack_c0);
  (*(code *)PTR_free_00cc4678)(*param_2);
  (*(code *)PTR_free_00cc4678)(param_2[1]);
  (*(code *)PTR_free_00cc4678)(param_2[2]);
  (*(code *)PTR_free_00cc4678)(param_2[3]);
  (*(code *)PTR_free_00cc4678)(param_2[4]);
  (*(code *)PTR_free_00cc4678)(param_2[5]);
  (*(code *)PTR_free_00cc4678)(param_2[6]);
  (*(code *)PTR_free_00cc4678)(param_2[7]);
  (*(code *)PTR_free_00cc4678)(param_2[8]);
  (*(code *)PTR_free_00cc4678)(param_2[9]);
  memcpy(param_2,&local_138,0x58);
  iVar4 = 0;
  goto LAB_00962d3c;
}

