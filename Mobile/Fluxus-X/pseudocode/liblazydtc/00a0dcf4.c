/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0dcf4
 */

undefined8 FUN_00a0dcf4(CONF *param_1,BIO *param_2,long *param_3)

{
  CONF *pCVar1;
  CONF *pCVar2;
  long lVar3;
  ushort uVar4;
  byte bVar5;
  byte bVar6;
  bool bVar7;
  char *__s;
  bool bVar8;
  int iVar9;
  BUF_MEM *str;
  byte *pbVar10;
  size_t sVar11;
  char *pcVar12;
  CONF_VALUE *section;
  size_t sVar13;
  char *__s_00;
  undefined4 *puVar14;
  BIO *pBVar15;
  undefined4 uVar16;
  CONF *pCVar17;
  undefined8 uVar18;
  int iVar19;
  ulong uVar20;
  ulong uVar21;
  void *pvVar22;
  byte bVar23;
  byte *pbVar24;
  byte *pbVar25;
  CONF_VALUE *pCVar26;
  ulong uVar27;
  char *ptr;
  long lVar28;
  byte *pbVar29;
  CONF_VALUE *value;
  lhash_st_CONF_VALUE *plVar30;
  byte *local_140;
  CONF_VALUE *local_128;
  long local_108;
  char *local_100;
  long local_f8;
  byte *local_f0;
  char acStack_e8 [16];
  uint local_d8;
  
  local_f8 = 0;
  local_f0 = (byte *)0x0;
  plVar30 = param_1->data;
  str = BUF_MEM_new();
  if (str == (BUF_MEM *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/conf/conf_def.c",0xea,"def_load_bio");
    ERR_set_error(0xe,0x80007,0);
  }
  else {
    pbVar10 = (byte *)CRYPTO_strdup("default","crypto/conf/conf_def.c",0xee);
    local_f0 = pbVar10;
    if (pbVar10 == (byte *)0x0) {
      ERR_new();
      uVar18 = 0xf0;
    }
    else {
      iVar9 = _CONF_new_data(param_1);
      if (iVar9 != 0) {
        local_128 = _CONF_new_section(param_1,(char *)pbVar10);
        if (local_128 != (CONF_VALUE *)0x0) {
          iVar9 = BUF_MEM_grow(str,0x200);
          if (iVar9 != 0) {
            pCVar1 = param_1 + 1;
            pCVar2 = (CONF *)((long)&param_1[1].meth + 4);
            lVar28 = 0;
            local_108 = 0;
            ptr = (char *)0x0;
            bVar8 = true;
LAB_00a0ddb4:
            uVar27 = 0;
            bVar7 = false;
LAB_00a0ddc0:
            pcVar12 = str->data + (int)uVar27;
            *pcVar12 = '\0';
            while( true ) {
              if ((param_2 != (BIO *)0x0) && (iVar9 = BIO_gets(param_2,pcVar12,0x1ff), iVar9 < 0))
              goto LAB_00a0ef8c;
              pcVar12[0x1ff] = '\0';
              sVar11 = strlen(pcVar12);
              if ((bVar8) &&
                 ((2 < (int)sVar11 && (iVar9 = memcmp(pcVar12,&DAT_00752074,3), iVar9 == 0)))) {
                sVar11 = (long)(int)sVar11 - 3;
                memmove(pcVar12,pcVar12 + 3,sVar11);
                pcVar12[sVar11] = '\0';
              }
              iVar9 = (int)sVar11;
              if (iVar9 != 0 || bVar7) break;
              if (local_f8 == 0) {
LAB_00a0de90:
                pBVar15 = (BIO *)OPENSSL_sk_pop(lVar28);
                if (pBVar15 == (BIO *)0x0) {
                  BUF_MEM_free(str);
                  CRYPTO_free(local_f0);
                  OPENSSL_sk_free(lVar28);
                  return 1;
                }
              }
              else {
                pBVar15 = (BIO *)FUN_00a0f0ec(ptr,&local_f8);
                if (pBVar15 == (BIO *)0x0) {
                  CRYPTO_free(ptr);
                  ptr = (char *)0x0;
                  goto LAB_00a0de90;
                }
              }
              BIO_vfree(param_2);
              bVar8 = false;
              param_2 = pBVar15;
            }
            uVar21 = sVar11 & 0xffffffff;
            if (0 < iVar9) {
              uVar20 = (long)iVar9;
              do {
                if ((pcVar12[uVar20 - 1] != '\r') && (uVar21 = uVar20, pcVar12[uVar20 - 1] != '\n'))
                break;
                uVar21 = uVar20 - 1;
                bVar8 = 1 < (long)uVar20;
                uVar20 = uVar21;
              } while (bVar8);
            }
            iVar19 = (int)uVar21;
            if ((iVar9 == 0) || (iVar19 != iVar9)) {
              bVar8 = false;
              pcVar12[iVar19] = '\0';
              local_108 = local_108 + 1;
            }
            else {
              bVar8 = true;
            }
            uVar21 = (long)(int)uVar27 + (long)iVar19;
            if ((int)uVar21 < 1) {
LAB_00a0df3c:
              if (!bVar8) {
                pvVar22 = param_1->meth_data;
                pbVar10 = (byte *)str->data;
                bVar23 = *pbVar10;
                pbVar24 = pbVar10;
                while (-1 < (char)bVar23) {
                  uVar4 = *(ushort *)((long)pvVar22 + (ulong)bVar23 * 2);
                  if ((uVar4 >> 0xb & 1) != 0) goto LAB_00a0e09c;
                  if ((uVar4 >> 4 & 1) == 0) break;
                  pbVar24 = pbVar24 + 1;
                  bVar23 = *pbVar24;
                }
                do {
                  if ((char)bVar23 < '\0') {
LAB_00a0dfac:
                    pbVar29 = pbVar24 + 1;
                  }
                  else {
                    uVar4 = *(ushort *)((long)pvVar22 + (ulong)bVar23 * 2);
                    if ((uVar4 >> 7 & 1) != 0) goto LAB_00a0e09c;
                    if ((uVar4 >> 10 & 1) == 0) {
                      if ((uVar4 >> 6 & 1) == 0) {
                        if ((uVar4 >> 5 & 1) != 0) {
                          bVar23 = pbVar24[1];
                          if (((char)bVar23 < '\0') ||
                             (pbVar29 = pbVar24 + 1,
                             (*(byte *)((long)pvVar22 + (ulong)bVar23 * 2) >> 3 & 1) == 0)) {
                            pbVar29 = pbVar24 + 2;
                          }
                          goto LAB_00a0df80;
                        }
                        if ((uVar4 >> 3 & 1) == 0) goto LAB_00a0dfac;
                        goto LAB_00a0e0a0;
                      }
                      do {
                        while( true ) {
                          pbVar29 = pbVar24;
                          pbVar25 = pbVar29 + 1;
                          bVar6 = *pbVar25;
                          pbVar24 = pbVar25;
                          if ((char)bVar6 < '\0') break;
                          bVar5 = bVar6;
                          if ((bVar6 == bVar23) ||
                             (uVar4 = *(ushort *)((long)pvVar22 + (ulong)bVar6 * 2),
                             (uVar4 >> 3 & 1) != 0)) goto LAB_00a0e06c;
                          if ((uVar4 >> 5 & 1) != 0) {
                            pbVar24 = pbVar29 + 2;
                            if (-1 < (char)*pbVar24) {
                              pbVar29 = pbVar24;
                              if ((*(byte *)((long)pvVar22 + (ulong)*pbVar24 * 2) >> 3 & 1) != 0)
                              goto LAB_00a0df80;
                            }
                          }
                        }
                        bVar5 = bVar23;
                      } while (bVar6 != bVar23);
                    }
                    else {
                      do {
                        do {
                          pbVar29 = pbVar24;
                          pbVar25 = pbVar29 + 1;
                          bVar5 = *pbVar25;
                          if ((-1 < (char)bVar5) &&
                             ((*(byte *)((long)pvVar22 + (ulong)bVar5 * 2) >> 3 & 1) != 0))
                          goto LAB_00a0e06c;
                          pbVar24 = pbVar25;
                        } while (bVar5 != bVar23);
                        pbVar24 = pbVar29 + 2;
                        bVar5 = bVar23;
                      } while (pbVar29[2] == bVar23);
                    }
LAB_00a0e06c:
                    pbVar29 = pbVar29 + 2;
                    if (bVar5 != bVar23) {
                      pbVar29 = pbVar25;
                    }
                  }
LAB_00a0df80:
                  pbVar24 = pbVar29;
                  bVar23 = *pbVar24;
                } while( true );
              }
              bVar7 = true;
              uVar27 = uVar21 & 0xffffffff;
            }
            else {
              uVar27 = uVar21 - 1;
              bVar23 = str->data[uVar27];
              if ((((char)bVar23 < '\0') ||
                  ((*(byte *)((long)param_1->meth_data + (ulong)bVar23 * 2) >> 5 & 1) == 0)) ||
                 ((1 < (int)uVar21 &&
                  ((*(byte *)((long)param_1->meth_data + (ulong)(byte)(str->data + uVar27)[-1] * 2)
                    >> 5 & 1) != 0)))) goto LAB_00a0df3c;
              bVar7 = true;
            }
            goto LAB_00a0e510;
          }
          lVar28 = 0;
          ptr = (char *)0x0;
          local_108 = 0;
LAB_00a0ec8c:
          ERR_new();
          ERR_set_debug("crypto/conf/conf_def.c",0x103,"def_load_bio");
          uVar18 = 0x80007;
LAB_00a0ecb4:
          ERR_set_error(0xe,uVar18,0);
LAB_00a0ef8c:
          value = (CONF_VALUE *)0x0;
          pCVar26 = (CONF_VALUE *)0x0;
          goto LAB_00a0eb1c;
        }
        ERR_new();
        ERR_set_debug("crypto/conf/conf_def.c",0xfb,"def_load_bio");
        ERR_set_error(0xe,0x67,0);
        goto LAB_00a0eb18;
      }
      ERR_new();
      uVar18 = 0xf5;
    }
    ERR_set_debug("crypto/conf/conf_def.c",uVar18,"def_load_bio");
    ERR_set_error(0xe,0xc0100,0);
  }
LAB_00a0eb18:
  pCVar26 = (CONF_VALUE *)0x0;
  local_108 = 0;
  value = (CONF_VALUE *)0x0;
  ptr = (char *)0x0;
  lVar28 = 0;
LAB_00a0eb1c:
  BUF_MEM_free(str);
  CRYPTO_free(local_f0);
  iVar9 = OPENSSL_sk_num(lVar28);
  while (0 < iVar9) {
    pBVar15 = (BIO *)OPENSSL_sk_pop(lVar28);
    BIO_vfree(param_2);
    iVar9 = OPENSSL_sk_num(lVar28);
    param_2 = pBVar15;
  }
  OPENSSL_sk_free(lVar28);
  CRYPTO_free(ptr);
  if (local_f8 != 0) {
    OPENSSL_DIR_end(&local_f8);
  }
  if (param_3 != (long *)0x0) {
    *param_3 = local_108;
  }
  BIO_snprintf(acStack_e8,0x18,"%ld");
  ERR_add_error_data(2,"line ",acStack_e8);
  if (plVar30 != param_1->data) {
    CONF_free(param_1->data);
    param_1->data = (lhash_st_CONF_VALUE *)0x0;
  }
  if (pCVar26 != (CONF_VALUE *)0x0) {
    CRYPTO_free(pCVar26->name);
    CRYPTO_free(pCVar26->value);
    CRYPTO_free(value);
  }
  return 0;
LAB_00a0e09c:
  *pbVar24 = 0;
LAB_00a0e0a0:
  bVar23 = *pbVar10;
  if (-1 < (char)bVar23) {
    pvVar22 = param_1->meth_data;
LAB_00a0e0b0:
    pbVar24 = pbVar10 + 1;
    uVar4 = *(ushort *)((long)pvVar22 + (ulong)bVar23 * 2);
    if ((uVar4 & 0x18) == 0x10) goto code_r0x00a0e0c4;
    bVar7 = false;
    uVar27 = 0;
    if ((uVar4 >> 3 & 1) != 0) goto LAB_00a0e510;
    if (bVar23 == 0x5b) {
      bVar23 = *pbVar24;
      while ((-1 < (char)bVar23 && ((*(ushort *)((long)pvVar22 + (ulong)bVar23 * 2) & 0x18) == 0x10)
             )) {
        pbVar24 = pbVar24 + 1;
        bVar23 = *pbVar24;
      }
      do {
        pbVar29 = pbVar24;
        pbVar10 = pbVar24;
        if (-1 < (char)bVar23) {
          while (uVar4 = *(ushort *)((long)pvVar22 + (ulong)bVar23 * 2), (uVar4 >> 5 & 1) != 0) {
            bVar23 = pbVar29[1];
            if (((char)bVar23 < '\0') ||
               (pbVar10 = pbVar29 + 1, (*(byte *)((long)pvVar22 + (ulong)bVar23 * 2) >> 3 & 1) == 0)
               ) {
              pbVar10 = pbVar29 + 2;
            }
LAB_00a0e958:
            pbVar29 = pbVar10;
            bVar23 = *pbVar29;
            pbVar10 = pbVar29;
            if ((char)bVar23 < '\0') goto joined_r0x00a0e9d0;
          }
          if (((uVar4 & 0x307) != 0) || ((*(int *)&pCVar1->meth != 0 && ((uVar4 >> 0xc & 1) != 0))))
          {
            pbVar10 = pbVar29 + 1;
            goto LAB_00a0e958;
          }
          pbVar10 = pbVar29;
          if ((uVar4 & 0x18) != 0x10) {
            if (bVar23 != 0) goto LAB_00a0e97c;
LAB_00a0ee14:
            ERR_new();
            ERR_set_debug("crypto/conf/conf_def.c",0x171,"def_load_bio");
            uVar18 = 100;
            goto LAB_00a0ecb4;
          }
          while( true ) {
            pbVar10 = pbVar10 + 1;
            bVar23 = *pbVar10;
            if ((char)bVar23 < '\0') break;
            if ((*(ushort *)((long)pvVar22 + (ulong)bVar23 * 2) & 0x18) != 0x10) break;
          }
        }
joined_r0x00a0e9d0:
        if (bVar23 == 0) goto LAB_00a0ee14;
LAB_00a0e97c:
        if (bVar23 == 0x5d) {
          *pbVar29 = 0;
          iVar9 = FUN_00a0f2a8(param_1,0,&local_f0);
          pbVar10 = local_f0;
          if (iVar9 != 0) {
            local_128 = _CONF_get_section(param_1,(char *)local_f0);
            if ((local_128 == (CONF_VALUE *)0x0) &&
               (local_128 = _CONF_new_section(param_1,(char *)pbVar10),
               local_128 == (CONF_VALUE *)0x0)) {
              ERR_new();
              ERR_set_debug("crypto/conf/conf_def.c",0x17a,"def_load_bio");
              ERR_set_error(0xe,0x67,0);
              goto LAB_00a0ef8c;
            }
            iVar9 = BUF_MEM_grow(str,0x200);
            goto joined_r0x00a0ea6c;
          }
          goto LAB_00a0ef8c;
        }
        bVar8 = pbVar24 == pbVar10;
        pbVar24 = pbVar10;
        if (bVar8) goto LAB_00a0ee14;
      } while( true );
    }
    pbVar24 = pbVar10;
    goto LAB_00a0e2b8;
  }
LAB_00a0e0d0:
  pbVar29 = pbVar10;
  goto LAB_00a0e0d4;
code_r0x00a0e0c4:
  bVar23 = *pbVar24;
  pbVar10 = pbVar24;
  if ((char)bVar23 < '\0') goto LAB_00a0e0d0;
  goto LAB_00a0e0b0;
  while( true ) {
    bVar23 = *pbVar29;
    pbVar24 = pbVar29;
    if ((char)bVar23 < '\0') break;
LAB_00a0e2b8:
    uVar4 = *(ushort *)((long)param_1->meth_data + (ulong)bVar23 * 2);
    if ((uVar4 >> 5 & 1) == 0) {
      if (((uVar4 & 0x307) == 0) && ((*(int *)&param_1[1].meth == 0 || ((uVar4 >> 0xc & 1) == 0))))
      {
        if (bVar23 == 0x3a) {
          if (pbVar24[1] == 0x3a) {
            *pbVar24 = 0;
            pbVar24 = pbVar24 + 2;
            bVar23 = *pbVar24;
            local_140 = pbVar10;
            pbVar10 = pbVar24;
            if ((char)bVar23 < '\0') {
              pbVar29 = pbVar24;
              goto LAB_00a0e0e4;
            }
            goto LAB_00a0e56c;
          }
          bVar23 = 0x3a;
        }
        local_140 = local_f0;
        goto LAB_00a0e5d0;
      }
      pbVar29 = pbVar24 + 1;
    }
    else {
      pbVar29 = pbVar24 + 1;
      if (((char)*pbVar29 < '\0') ||
         ((*(byte *)((long)param_1->meth_data + (ulong)*pbVar29 * 2) >> 3 & 1) == 0)) {
        pbVar29 = pbVar24 + 2;
      }
    }
  }
LAB_00a0e0d4:
  local_140 = local_f0;
LAB_00a0e0e0:
  pbVar24 = pbVar29;
LAB_00a0e0e4:
  iVar9 = strncmp((char *)pbVar10,".pragma",7);
  if (iVar9 != 0) {
LAB_00a0e100:
    iVar9 = strncmp((char *)pbVar10,".include",8);
    if (iVar9 == 0) goto LAB_00a0e60c;
    if (bVar23 != 0x3d) goto LAB_00a0ecf4;
    *pbVar24 = 0;
    pbVar29 = pbVar29 + 1;
    bVar23 = *pbVar29;
    pvVar22 = param_1->meth_data;
    while ((-1 < (char)bVar23 && ((*(ushort *)((long)pvVar22 + (ulong)bVar23 * 2) & 0x18) == 0x10)))
    {
      pbVar29 = pbVar29 + 1;
      bVar23 = *pbVar29;
    }
    pbVar24 = pbVar29 + -1;
    pbVar25 = pbVar29;
    if (-1 < (char)bVar23) goto LAB_00a0e178;
    do {
      do {
        pbVar25 = pbVar25 + 1;
        bVar23 = *pbVar25;
        pbVar24 = pbVar24 + 1;
      } while ((char)bVar23 < '\0');
LAB_00a0e178:
    } while ((*(byte *)((long)pvVar22 + (ulong)bVar23 * 2) >> 3 & 1) == 0);
    do {
      pbVar25 = pbVar24;
      if ((pbVar25 < pbVar29) || ((char)*pbVar25 < '\0')) break;
      pbVar24 = pbVar25 + -1;
    } while ((*(byte *)((long)pvVar22 + (ulong)*pbVar25 * 2) >> 4 & 1) != 0);
    pbVar25[1] = 0;
    value = CRYPTO_malloc(0x18,"crypto/conf/conf_def.c",0x21b);
    if (value == (CONF_VALUE *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/conf/conf_def.c",0x21c,"def_load_bio");
      ERR_set_error(0xe,0xc0100,0);
      pCVar26 = (CONF_VALUE *)0x0;
      goto LAB_00a0eb1c;
    }
    pcVar12 = CRYPTO_strdup((char *)pbVar10,"crypto/conf/conf_def.c",0x21f);
    value->value = (char *)0x0;
    value->name = pcVar12;
    pCVar26 = value;
    if (pcVar12 == (char *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/conf/conf_def.c",0x222,"def_load_bio");
      ERR_set_error(0xe,0xc0100,0);
      goto LAB_00a0eb1c;
    }
    iVar9 = FUN_00a0f2a8(param_1,local_140,&value->value,pbVar29);
    if (iVar9 == 0) goto LAB_00a0eb1c;
    iVar9 = strcmp((char *)local_140,(char *)local_f0);
    section = local_128;
    if (((iVar9 != 0) &&
        (section = _CONF_get_section(param_1,(char *)local_140), section == (CONF_VALUE *)0x0)) &&
       (section = _CONF_new_section(param_1,(char *)local_140), section == (CONF_VALUE *)0x0)) {
      ERR_new();
      ERR_set_debug("crypto/conf/conf_def.c",0x22e,"def_load_bio");
      ERR_set_error(0xe,0x67,0);
      goto LAB_00a0eb1c;
    }
    iVar9 = _CONF_add_string(param_1,section,value);
    bVar7 = false;
    uVar27 = 0;
    if (iVar9 == 0) {
      ERR_new();
      ERR_set_debug("crypto/conf/conf_def.c",0x234,"def_load_bio");
      ERR_set_error(0xe,0xc0100,0);
      goto LAB_00a0eb1c;
    }
    goto LAB_00a0e510;
  }
  if (pbVar29 == pbVar10 + 7) {
    if (bVar23 != 0x3d) goto LAB_00a0e100;
LAB_00a0e334:
    pbVar29 = pbVar29 + 1;
    bVar23 = *pbVar29;
    if (-1 < (char)bVar23) {
      do {
        if ((*(ushort *)((long)param_1->meth_data + (ulong)bVar23 * 2) & 0x18) != 0x10) break;
        pbVar29 = pbVar29 + 1;
        bVar23 = *pbVar29;
      } while (-1 < (char)bVar23);
    }
  }
  else if (bVar23 == 0x3d) goto LAB_00a0e334;
  pbVar24 = pbVar29 + -1;
  pbVar10 = pbVar24;
  pbVar25 = pbVar29;
  if (-1 < (char)bVar23) goto LAB_00a0e384;
  do {
    do {
      pbVar25 = pbVar25 + 1;
      bVar23 = *pbVar25;
      pbVar10 = pbVar10 + 1;
    } while ((char)bVar23 < '\0');
LAB_00a0e384:
  } while ((*(byte *)((long)param_1->meth_data + (ulong)bVar23 * 2) >> 3 & 1) == 0);
  do {
    pbVar25 = pbVar10;
    if ((pbVar25 < pbVar29) || ((char)*pbVar25 < '\0')) break;
    pbVar10 = pbVar25 + -1;
  } while ((*(byte *)((long)param_1->meth_data + (ulong)*pbVar25 * 2) >> 4 & 1) != 0);
  pbVar25[1] = 0;
  pbVar10 = (byte *)strchr((char *)pbVar29,0x3a);
  if (((pbVar10 == (byte *)0x0) || (pbVar10 == pbVar29)) || (pbVar25 = pbVar10 + 1, *pbVar25 == 0))
  {
    ERR_new();
    ERR_set_debug("crypto/conf/conf_def.c",0x198,"def_load_bio");
    ERR_set_error(0xe,0x7a,0);
    goto LAB_00a0ef8c;
  }
  *pbVar10 = 0;
  pbVar10 = pbVar29;
  while (((char)*pbVar10 < '\0' ||
         ((*(byte *)((long)param_1->meth_data + (ulong)*pbVar10 * 2) >> 3 & 1) == 0))) {
    pbVar10 = pbVar10 + 1;
    pbVar24 = pbVar24 + 1;
  }
  do {
    pbVar10 = pbVar24;
    if ((pbVar10 < pbVar29) || ((char)*pbVar10 < '\0')) break;
    pbVar24 = pbVar10 + -1;
  } while ((*(byte *)((long)param_1->meth_data + (ulong)*pbVar10 * 2) >> 4 & 1) != 0);
  pbVar10[1] = 0;
  bVar23 = *pbVar25;
  if (-1 < (char)bVar23) {
    do {
      if ((*(ushort *)((long)param_1->meth_data + (ulong)bVar23 * 2) & 0x18) != 0x10) break;
      pbVar25 = pbVar25 + 1;
      bVar23 = *pbVar25;
    } while (-1 < (char)bVar23);
  }
  iVar9 = strcmp((char *)pbVar29,"dollarid");
  if (iVar9 == 0) {
    pCVar17 = pCVar1;
  }
  else {
    iVar9 = strcmp((char *)pbVar29,"abspath");
    if (iVar9 != 0) {
      iVar9 = strcmp((char *)pbVar29,"includedir");
      bVar7 = false;
      uVar27 = 0;
      if (iVar9 == 0) {
        CRYPTO_free(param_1[1].meth_data);
        pcVar12 = CRYPTO_strdup((char *)pbVar25,"crypto/conf/conf_def.c",0x1af);
        bVar7 = false;
        uVar27 = 0;
        param_1[1].meth_data = pcVar12;
        if (pcVar12 == (char *)0x0) {
          ERR_new();
          ERR_set_debug("crypto/conf/conf_def.c",0x1b0,"def_load_bio");
          ERR_set_error(0xe,0xc0100,0);
          goto LAB_00a0ef8c;
        }
      }
      goto LAB_00a0e510;
    }
    pCVar17 = pCVar2;
  }
  iVar9 = FUN_00a0f7cc(pbVar25,pCVar17);
  bVar7 = false;
  uVar27 = 0;
  if (iVar9 == 0) goto LAB_00a0ef8c;
LAB_00a0e510:
  iVar9 = BUF_MEM_grow(str,(long)((int)uVar27 + 0x200));
  bVar8 = false;
  if (iVar9 == 0) goto LAB_00a0ec8c;
  goto LAB_00a0ddc0;
LAB_00a0e56c:
  do {
    uVar4 = *(ushort *)((long)param_1->meth_data + (ulong)bVar23 * 2);
    if ((uVar4 >> 5 & 1) == 0) {
      if (((uVar4 & 0x307) == 0) && ((*(int *)&pCVar1->meth == 0 || ((uVar4 >> 0xc & 1) == 0))))
      goto LAB_00a0e5d0;
      pbVar29 = pbVar24 + 1;
    }
    else {
      pbVar29 = pbVar24 + 1;
      if (((char)*pbVar29 < '\0') ||
         ((*(byte *)((long)param_1->meth_data + (ulong)*pbVar29 * 2) >> 3 & 1) == 0)) {
        pbVar29 = pbVar24 + 2;
      }
    }
    bVar23 = *pbVar29;
    pbVar24 = pbVar29;
  } while (-1 < (char)bVar23);
  goto LAB_00a0e0e0;
LAB_00a0e5d0:
  pbVar29 = pbVar24;
  do {
    if ((*(ushort *)((long)param_1->meth_data + (ulong)bVar23 * 2) & 0x18) != 0x10) break;
    pbVar29 = pbVar29 + 1;
    bVar23 = *pbVar29;
  } while (-1 < (char)bVar23);
  goto LAB_00a0e0e4;
LAB_00a0e60c:
  if ((pbVar29 == pbVar10 + 8) && (bVar23 != 0x3d)) {
LAB_00a0ecf4:
    ERR_new();
    ERR_set_debug("crypto/conf/conf_def.c",0x212,"def_load_bio");
    ERR_set_error(0xe,0x65,"HERE-->%s",pbVar29);
    goto LAB_00a0ef8c;
  }
  local_100 = (char *)0x0;
  pcVar12 = (char *)ossl_safe_getenv("OPENSSL_CONF_INCLUDE");
  if (pcVar12 == (char *)0x0) {
    pcVar12 = param_1[1].meth_data;
  }
  bVar23 = *pbVar29;
  if (bVar23 == 0x3d) {
    pbVar29 = pbVar29 + 1;
    bVar23 = *pbVar29;
    if (-1 < (char)bVar23) {
      do {
        if ((*(ushort *)((long)param_1->meth_data + (ulong)bVar23 * 2) & 0x18) != 0x10) break;
        pbVar29 = pbVar29 + 1;
        bVar23 = *pbVar29;
      } while (-1 < (char)bVar23);
    }
  }
  pbVar10 = pbVar29 + -1;
  pbVar24 = pbVar29;
  if (-1 < (char)bVar23) goto LAB_00a0e6a4;
  do {
    do {
      pbVar24 = pbVar24 + 1;
      bVar23 = *pbVar24;
      pbVar10 = pbVar10 + 1;
    } while ((char)bVar23 < '\0');
LAB_00a0e6a4:
  } while ((*(byte *)((long)param_1->meth_data + (ulong)bVar23 * 2) >> 3 & 1) == 0);
  do {
    pbVar24 = pbVar10;
    if ((pbVar24 < pbVar29) || ((char)*pbVar24 < '\0')) break;
    pbVar10 = pbVar24 + -1;
  } while ((*(byte *)((long)param_1->meth_data + (ulong)*pbVar24 * 2) >> 4 & 1) != 0);
  pbVar24[1] = 0;
  iVar9 = FUN_00a0f2a8(param_1,local_140,&local_100,pbVar29);
  __s = local_100;
  if (iVar9 == 0) goto LAB_00a0ef8c;
  if ((pcVar12 == (char *)0x0) || (*local_100 == '/')) {
    __s_00 = local_100;
  }
  else {
    sVar11 = strlen(pcVar12);
    sVar13 = strlen(__s);
    lVar3 = sVar11 + sVar13 + 2;
    __s_00 = CRYPTO_malloc((int)lVar3,"crypto/conf/conf_def.c",0x1dc);
    if (__s_00 == (char *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/conf/conf_def.c",0x1de,"def_load_bio");
      ERR_set_error(0xe,0xc0100,0);
      CRYPTO_free(__s);
      goto LAB_00a0ef8c;
    }
    OPENSSL_strlcpy(__s_00,pcVar12,lVar3);
    if ((*__s_00 == '\0') || (sVar11 = strlen(__s_00), __s_00[sVar11 - 1] != '/')) {
      OPENSSL_strlcat(__s_00,&DAT_002a91de,lVar3);
    }
    OPENSSL_strlcat(__s_00,__s,lVar3);
    CRYPTO_free(__s);
  }
  if ((*(int *)&pCVar2->meth != 0) && (*__s_00 != '/')) {
    ERR_new();
    ERR_set_debug("crypto/conf/conf_def.c",0x1ee,"def_load_bio");
    ERR_set_error(0xe,0x7d,0);
    CRYPTO_free(__s_00);
    goto LAB_00a0ef8c;
  }
  iVar9 = stat(__s_00,(stat *)acStack_e8);
  if (iVar9 < 0) {
    ERR_new();
    ERR_set_debug("crypto/conf/conf_def.c",0x336,"process_include");
    puVar14 = (undefined4 *)__errno();
    uVar16 = *puVar14;
    uVar18 = 2;
    pcVar12 = "calling stat(%s)";
LAB_00a0e840:
    ERR_set_error(uVar18,uVar16,pcVar12,__s_00);
    pBVar15 = (BIO *)0x0;
  }
  else if ((local_d8 & 0xf000) == 0x4000) {
    if (local_f8 != 0) {
      ERR_new();
      ERR_set_debug("crypto/conf/conf_def.c",0x33d,"process_include");
      uVar18 = 0xe;
      uVar16 = 0x6f;
      pcVar12 = "%s";
      goto LAB_00a0e840;
    }
    pBVar15 = (BIO *)FUN_00a0f0ec(__s_00,&local_f8);
    if (pBVar15 != (BIO *)0x0) {
      ptr = __s_00;
    }
  }
  else {
    pBVar15 = BIO_new_file(__s_00,"r");
  }
  if (__s_00 != ptr) {
    CRYPTO_free(__s_00);
  }
  if (pBVar15 == (BIO *)0x0) {
LAB_00a0e898:
    iVar9 = BUF_MEM_grow(str,0x200);
joined_r0x00a0ea6c:
    bVar8 = false;
    if (iVar9 == 0) goto LAB_00a0ec8c;
    goto LAB_00a0ddb4;
  }
  if ((lVar28 == 0) && (lVar28 = OPENSSL_sk_new_null(), lVar28 == 0)) {
    ERR_new();
    uVar18 = 0x203;
  }
  else {
    iVar9 = OPENSSL_sk_push(lVar28,param_2);
    if (iVar9 != 0) {
      param_2 = pBVar15;
      goto LAB_00a0e898;
    }
    ERR_new();
    uVar18 = 0x209;
  }
  ERR_set_debug("crypto/conf/conf_def.c",uVar18,"def_load_bio");
  ERR_set_error(0xe,0xc0100,0);
  BIO_free(pBVar15);
  goto LAB_00a0ef8c;
}

