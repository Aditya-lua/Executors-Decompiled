/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ce3b0
 */

/* WARNING: Type propagation algorithm not settling */

ulong tls1_enc(undefined4 *param_1,long param_2,ulong param_3,int param_4,long param_5,long param_6)

{
  char *pcVar1;
  char *pcVar2;
  undefined4 *ptr;
  undefined4 uVar3;
  char cVar4;
  undefined2 uVar5;
  int iVar6;
  int iVar7;
  uint uVar8;
  int iVar9;
  int iVar10;
  uint uVar11;
  uint uVar12;
  long lVar13;
  long lVar14;
  undefined8 uVar15;
  undefined8 *puVar16;
  ulong uVar17;
  ulong uVar18;
  long lVar19;
  undefined8 *puVar20;
  ulong uVar21;
  ulong uVar22;
  ulong uVar23;
  long *plVar24;
  ulong *puVar25;
  EVP_CIPHER_CTX *ctx;
  long lVar26;
  long lVar27;
  long lVar28;
  undefined8 local_488;
  undefined8 uStack_480;
  undefined8 local_478;
  undefined8 uStack_470;
  undefined8 local_468;
  undefined8 local_460;
  undefined8 uStack_458;
  undefined8 uStack_450;
  undefined8 uStack_448;
  undefined8 local_440;
  undefined8 local_438;
  undefined8 uStack_430;
  undefined8 local_428;
  undefined8 uStack_420;
  undefined8 local_418;
  int local_40c;
  undefined8 local_408 [32];
  undefined8 local_308;
  undefined1 local_300 [408];
  ulong local_168 [33];
  
  uVar11 = 8;
  if (param_4 == 0) {
    uVar11 = 4;
  }
  if (param_3 != 0) {
    uVar12 = param_1[0x150];
    if (param_4 == 0) {
      lVar13 = EVP_MD_CTX_get0_md(*(undefined8 *)(param_1 + 0x218));
      if (lVar13 != 0) {
        EVP_MD_CTX_get0_md(*(undefined8 *)(param_1 + 0x218));
        iVar6 = EVP_MD_get_size();
        if (iVar6 < 0) {
          ERR_new();
          uVar15 = 0x409;
          goto LAB_009ce4f8;
        }
      }
      ctx = *(EVP_CIPHER_CTX **)(param_1 + 0x212);
      if (ctx == (EVP_CIPHER_CTX *)0x0) goto LAB_009cea38;
      lVar13 = EVP_CIPHER_CTX_get0_cipher(ctx);
    }
    else {
      lVar13 = EVP_MD_CTX_get0_md(*(undefined8 *)(param_1 + 0x224));
      if (lVar13 != 0) {
        EVP_MD_CTX_get0_md(*(undefined8 *)(param_1 + 0x224));
        iVar6 = EVP_MD_get_size();
        if (iVar6 < 0) {
          ERR_new();
          uVar15 = 0x3e3;
          goto LAB_009ce4f8;
        }
      }
      ctx = *(EVP_CIPHER_CTX **)(param_1 + 0x21e);
      if (ctx == (EVP_CIPHER_CTX *)0x0) goto LAB_009cea38;
      lVar13 = EVP_CIPHER_CTX_get0_cipher(ctx);
      if ((((*(byte *)(*(long *)(*(long *)(param_1 + 2) + 0xc0) + 0x60) & 1) != 0) &&
          (iVar6 = EVP_CIPHER_get_mode(), iVar6 == 2)) &&
         (iVar6 = EVP_CIPHER_get_iv_length(lVar13), 1 < iVar6)) {
        uVar22 = 0;
        plVar24 = (long *)(param_2 + 0x28);
        do {
          if (plVar24[-1] != *plVar24) {
            ERR_new();
            uVar15 = 0x3fb;
            goto LAB_009cec1c;
          }
          iVar7 = RAND_bytes_ex(**(undefined8 **)(param_1 + 0x26a),plVar24[-1],(long)iVar6,0);
          if (iVar7 < 1) {
            ERR_new();
            uVar15 = 0x3ff;
            goto LAB_009cec1c;
          }
          uVar22 = uVar22 + 1;
          plVar24 = plVar24 + 10;
        } while (uVar22 < param_3);
      }
    }
    if (((lVar13 == 0) || (ctx == (EVP_CIPHER_CTX *)0x0)) || (*(long *)(param_1 + 0x246) == 0)) {
LAB_009cea38:
      puVar16 = (undefined8 *)(param_2 + 0x28);
      do {
        memmove((void *)puVar16[-1],(void *)*puVar16,puVar16[-4]);
        param_3 = param_3 - 1;
        *puVar16 = puVar16[-1];
        puVar16 = puVar16 + 10;
      } while (param_3 != 0);
      return 1;
    }
    lVar14 = EVP_CIPHER_get0_provider();
    EVP_CIPHER_CTX_get0_cipher(ctx);
    iVar6 = EVP_CIPHER_get_block_size();
    if (1 < param_3) {
      EVP_CIPHER_CTX_get0_cipher(ctx);
      uVar8 = EVP_CIPHER_get_flags();
      if ((uVar8 >> 0x17 & 1) == 0) {
        ERR_new();
        ERR_set_debug("ssl/record/ssl3_record.c",0x425,"tls1_enc");
        uVar15 = 0x196;
        goto LAB_009ce50c;
      }
    }
    uVar22 = (ulong)iVar6;
    pcVar2 = (char *)(param_1 + 0x740);
    if (param_4 == 0) {
      pcVar2 = (char *)(param_1 + 0x73e);
    }
    iVar7 = 0;
    uVar23 = 0;
    pcVar1 = pcVar2 + 2;
LAB_009ce63c:
    puVar25 = (ulong *)(param_2 + uVar23 * 0x50 + 8);
    local_168[uVar23] = *puVar25;
    EVP_CIPHER_CTX_get0_cipher(ctx);
    uVar8 = EVP_CIPHER_get_flags();
    if ((uVar8 >> 0x15 & 1) == 0) {
      if (lVar14 == 0 && (param_4 != 0 && iVar6 != 1)) {
        uVar18 = local_168[uVar23];
        uVar17 = 0;
        if (uVar22 != 0) {
          uVar17 = uVar18 / uVar22;
        }
        uVar17 = uVar22 - (uVar18 - uVar17 * uVar22);
        if (0x100 < uVar17) {
          ERR_new();
          uVar15 = 0x45f;
LAB_009cec1c:
          ERR_set_debug("ssl/record/ssl3_record.c",uVar15,"tls1_enc");
          uVar15 = 0xc0103;
          goto LAB_009ce50c;
        }
        uVar21 = uVar18 + uVar17;
        if (uVar18 < uVar21) {
          do {
            *(char *)(*(long *)(param_2 + uVar23 * 0x50 + 0x28) + uVar18) = (char)uVar17 + -1;
            uVar18 = uVar18 + 1;
            uVar21 = local_168[uVar23] + uVar17;
          } while (uVar18 < uVar21);
        }
        local_168[uVar23] = uVar21;
        *puVar25 = *puVar25 + uVar17;
      }
      if (param_4 == 0) {
LAB_009ce854:
        uVar18 = local_168[uVar23];
        if (uVar18 == 0) {
          return 0;
        }
        uVar17 = 0;
        if (uVar22 != 0) {
          uVar17 = uVar18 / uVar22;
        }
        if (uVar18 != uVar17 * uVar22) {
          return 0;
        }
      }
    }
    else {
      if ((*(byte *)(*(long *)(*(long *)(param_1 + 2) + 0xc0) + 0x60) >> 3 & 1) == 0) {
        uVar15 = *(undefined8 *)pcVar2;
        puVar16 = (undefined8 *)((long)local_408 + uVar23 * 0xd + 0x100);
        *puVar16 = uVar15;
        cVar4 = pcVar2[7];
        pcVar2[7] = cVar4 + '\x01';
        if ((((char)(cVar4 + '\x01') == '\0') &&
            (cVar4 = pcVar2[6], pcVar2[6] = cVar4 + '\x01', (char)(cVar4 + '\x01') == '\0')) &&
           ((cVar4 = pcVar2[5], pcVar2[5] = cVar4 + '\x01', (char)(cVar4 + '\x01') == '\0' &&
            ((((cVar4 = pcVar2[4], pcVar2[4] = cVar4 + '\x01', (char)(cVar4 + '\x01') == '\0' &&
               (cVar4 = pcVar2[3], pcVar2[3] = cVar4 + '\x01', (char)(cVar4 + '\x01') == '\0')) &&
              (cVar4 = *pcVar1, *pcVar1 = cVar4 + '\x01', (char)(cVar4 + '\x01') == '\0')) &&
             (cVar4 = pcVar2[1], pcVar2[1] = cVar4 + '\x01', (char)(cVar4 + '\x01') == '\0')))))) {
          *pcVar2 = (char)uVar15 + '\x01';
        }
      }
      else {
        uVar5 = *(undefined2 *)(*(long *)(param_1 + 0x744) + (ulong)(param_4 != 0) * 2);
        lVar19 = uVar23 * 0xd;
        puVar16 = (undefined8 *)((long)local_408 + lVar19 + 0x100);
        *(char *)puVar16 = (char)((ushort)uVar5 >> 8);
        *(char *)((long)local_408 + lVar19 + 0x101) = (char)uVar5;
        *(undefined2 *)(local_300 + lVar19 + -2) = *(undefined2 *)(pcVar2 + 6);
        *(undefined4 *)((long)local_408 + lVar19 + 0x102) = *(undefined4 *)pcVar1;
      }
      lVar19 = uVar23 * 0xd;
      local_300[lVar19] = (char)*(undefined4 *)(param_2 + uVar23 * 0x50 + 4);
      uVar3 = *param_1;
      local_300[lVar19 + 2] = (char)uVar3;
      local_300[lVar19 + 1] = (char)((uint)uVar3 >> 8);
      uVar18 = *puVar25;
      local_300[lVar19 + 3] = (char)(uVar18 >> 8);
      local_300[lVar19 + 4] = (char)uVar18;
      iVar7 = EVP_CIPHER_CTX_ctrl(ctx,0x16,0xd,puVar16);
      if (iVar7 < 1) {
        ERR_new();
        uVar15 = 0x44c;
        goto LAB_009cec1c;
      }
      if (param_4 == 0) goto LAB_009ce854;
      local_168[uVar23] = local_168[uVar23] + (long)iVar7;
      *puVar25 = *puVar25 + (long)iVar7;
    }
    uVar23 = uVar23 + 1;
    if (param_3 <= uVar23) goto code_r0x009ce878;
    goto LAB_009ce63c;
  }
  ERR_new();
  uVar15 = 0x3db;
LAB_009ce4f8:
  ERR_set_debug("ssl/record/ssl3_record.c",uVar15,"tls1_enc");
  uVar15 = 0xc0103;
  goto LAB_009ce50c;
code_r0x009ce878:
  if (1 < param_3) {
    uVar18 = param_3 & 0xfffffffffffffffe;
    puVar16 = local_408 + 1;
    puVar20 = (undefined8 *)(param_2 + 0x70);
    uVar23 = uVar18;
    do {
      uVar15 = *puVar20;
      uVar23 = uVar23 - 2;
      puVar16[-1] = puVar20[-10];
      *puVar16 = uVar15;
      puVar16 = puVar16 + 2;
      puVar20 = puVar20 + 0x14;
    } while (uVar23 != 0);
    if (uVar18 != param_3) {
      lVar19 = param_3 - uVar18;
      puVar16 = (undefined8 *)(param_2 + uVar18 * 0x50 + 0x20);
      puVar20 = local_408 + uVar18;
      do {
        lVar19 = lVar19 + -1;
        *puVar20 = *puVar16;
        puVar16 = puVar16 + 10;
        puVar20 = puVar20 + 1;
      } while (lVar19 != 0);
    }
    iVar10 = (int)param_3;
    iVar9 = EVP_CIPHER_CTX_ctrl(ctx,0x22,iVar10,local_408);
    if (iVar9 < 1) {
      ERR_new();
      uVar15 = 0x478;
    }
    else {
      uVar23 = 0;
      if (param_3 < 2) {
LAB_009ce940:
        lVar19 = param_3 - uVar23;
        puVar16 = (undefined8 *)(param_2 + uVar23 * 0x50 + 0x28);
        puVar20 = local_408 + uVar23;
        do {
          lVar19 = lVar19 + -1;
          *puVar20 = *puVar16;
          puVar16 = puVar16 + 10;
          puVar20 = puVar20 + 1;
        } while (lVar19 != 0);
      }
      else {
        uVar23 = param_3 & 0xfffffffffffffffe;
        puVar16 = local_408 + 1;
        puVar20 = (undefined8 *)(param_2 + 0x78);
        uVar18 = uVar23;
        do {
          uVar15 = *puVar20;
          uVar18 = uVar18 - 2;
          puVar16[-1] = puVar20[-10];
          *puVar16 = uVar15;
          puVar16 = puVar16 + 2;
          puVar20 = puVar20 + 0x14;
        } while (uVar18 != 0);
        if (uVar23 != param_3) goto LAB_009ce940;
      }
      iVar9 = EVP_CIPHER_CTX_ctrl(ctx,0x23,iVar10,local_408);
      if ((0 < iVar9) && (iVar10 = EVP_CIPHER_CTX_ctrl(ctx,0x24,iVar10,local_168), 0 < iVar10))
      goto LAB_009ce9a0;
      ERR_new();
      uVar15 = 0x483;
    }
    ERR_set_debug("ssl/record/ssl3_record.c",uVar15,"tls1_enc");
    uVar15 = 0x196;
LAB_009ce50c:
    ossl_statem_fatal(param_1,0x50,uVar15,0);
    return 0;
  }
LAB_009ce9a0:
  if (((uVar12 & uVar11) != 0) &&
     ((*(uint *)(*(long *)(*(long *)(param_1 + 2) + 0xc0) + 0x60) >> 3 & 1) == 0)) {
    ptr = param_1 + 0x73e;
    if (param_4 == 0) {
      uVar11 = 0;
    }
    else {
      uVar11 = ((uint)param_1[0x2a] >> 10 ^ 0xffffffff) & 1;
      ptr = param_1 + 0x740;
    }
    iVar10 = EVP_CIPHER_CTX_ctrl(ctx,0x2a,uVar11,ptr);
    if (iVar10 < 1) {
      ERR_new();
      ERR_set_debug("ssl/record/ssl3_record.c",0x497,"tls1_enc");
      uVar15 = 0xc0103;
      goto LAB_009ce50c;
    }
  }
  if (lVar14 == 0) {
    uVar11 = EVP_Cipher(ctx,*(uchar **)(param_2 + 0x20),*(uchar **)(param_2 + 0x28),
                        (uint)local_168[0]);
    EVP_CIPHER_CTX_get0_cipher(ctx);
    uVar12 = EVP_CIPHER_get_flags();
    if ((uVar12 >> 0x14 & 1) == 0) {
      if (param_4 != 0) {
        return (ulong)(uVar11 != 0);
      }
      if (uVar11 == 0) {
        return 0;
      }
    }
    else {
      uVar23 = (ulong)(uVar11 >> 0x1f ^ 1);
      if (param_4 != 0) {
        return uVar23;
      }
      if ((int)uVar11 < 0) {
        return uVar23;
      }
    }
    if (iVar7 != 0) {
      param_6 = (long)iVar7;
    }
    uVar23 = 0;
    plVar24 = (long *)(param_2 + 0x20);
    lVar14 = param_5;
    do {
      iVar7 = EVP_CIPHER_get_mode(lVar13);
      if (iVar7 == 6) {
        lVar26 = plVar24[1];
        lVar28 = *plVar24;
        lVar19 = plVar24[-3];
LAB_009cecd4:
        plVar24[1] = lVar26 + 8;
        *plVar24 = lVar28 + 8;
        plVar24[-3] = lVar19 + -8;
      }
      else {
        iVar7 = EVP_CIPHER_get_mode(lVar13);
        if (iVar7 == 7) {
          lVar26 = plVar24[1];
          lVar28 = *plVar24;
          lVar19 = plVar24[-3];
          goto LAB_009cecd4;
        }
        if ((iVar6 != 1) && ((*(byte *)(*(long *)(*(long *)(param_1 + 2) + 0xc0) + 0x60) & 1) != 0))
        {
          if ((ulong)plVar24[-3] < uVar22) {
            return 0;
          }
          plVar24[-3] = plVar24[-3] - uVar22;
          *plVar24 = *plVar24 + uVar22;
          plVar24[1] = plVar24[1] + uVar22;
          plVar24[-2] = plVar24[-2] - uVar22;
        }
      }
      lVar26 = plVar24[-2];
      lVar27 = *plVar24;
      lVar19 = lVar14 + 8;
      lVar28 = lVar14;
      if (param_5 == 0) {
        lVar28 = 0;
        lVar19 = 0;
      }
      uVar11 = EVP_CIPHER_get_flags(lVar13);
      uVar18 = tls1_cbc_remove_padding_and_mac
                         (plVar24 + -3,lVar26,lVar27,lVar28,lVar19,uVar22,param_6,uVar11 >> 0x15 & 1
                          ,**(undefined8 **)(param_1 + 0x26a));
      if ((int)uVar18 == 0) {
        return uVar18;
      }
      uVar23 = uVar23 + 1;
      plVar24 = plVar24 + 10;
      lVar14 = lVar14 + 0x10;
      if (param_3 <= uVar23) {
        return 1;
      }
    } while( true );
  }
  if (1 < param_3) {
    ERR_new();
    uVar15 = 0x4a1;
    goto LAB_009ceb30;
  }
  iVar7 = EVP_CipherUpdate(ctx,*(uchar **)(param_2 + 0x20),&local_40c,*(uchar **)(param_2 + 0x28),
                           (uint)local_168[0]);
  if (iVar7 == 0) {
    return 0;
  }
  *(long *)(param_2 + 8) = (long)local_40c;
  if (param_4 != 0) {
    return 1;
  }
  iVar7 = EVP_CIPHER_get_mode(lVar13);
  if (iVar7 == 6) {
    lVar14 = *(long *)(param_2 + 0x28);
    lVar13 = *(long *)(param_2 + 0x20);
LAB_009cede0:
    *(long *)(param_2 + 0x28) = lVar14 + 8;
    *(long *)(param_2 + 0x20) = lVar13 + 8;
  }
  else {
    iVar7 = EVP_CIPHER_get_mode(lVar13);
    if (iVar7 == 7) {
      lVar14 = *(long *)(param_2 + 0x28);
      lVar13 = *(long *)(param_2 + 0x20);
      goto LAB_009cede0;
    }
    if ((iVar6 != 1) && ((*(byte *)(*(long *)(*(long *)(param_1 + 2) + 0xc0) + 0x60) & 1) != 0)) {
      *(ulong *)(param_2 + 0x20) = *(long *)(param_2 + 0x20) + uVar22;
      *(ulong *)(param_2 + 0x28) = *(long *)(param_2 + 0x28) + uVar22;
      *(ulong *)(param_2 + 0x10) = *(long *)(param_2 + 0x10) - uVar22;
    }
  }
  if (param_5 == 0) {
    return 1;
  }
  *(undefined4 *)(param_5 + 8) = 0;
  OSSL_PARAM_construct_octet_ptr(&local_488,"tls-mac",param_5,param_6);
  local_440 = local_468;
  uStack_458 = uStack_480;
  local_460 = local_488;
  uStack_448 = uStack_470;
  uStack_450 = local_478;
  OSSL_PARAM_construct_end(&local_488);
  local_418 = local_468;
  uStack_420 = uStack_470;
  local_428 = local_478;
  uStack_430 = uStack_480;
  local_438 = local_488;
  iVar6 = EVP_CIPHER_CTX_get_params(ctx,&local_460);
  if (iVar6 != 0) {
    return 1;
  }
  ERR_new();
  uVar15 = 0x4cb;
LAB_009ceb30:
  ERR_set_debug("ssl/record/ssl3_record.c",uVar15,"tls1_enc");
  ossl_statem_fatal(param_1,0x50,0xc0103,0);
  return 0;
}

