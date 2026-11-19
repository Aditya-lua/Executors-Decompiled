/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009cd0a0
 */

int ssl3_get_record(uint *param_1)

{
  ulong *puVar1;
  long lVar2;
  byte bVar3;
  byte bVar4;
  byte bVar5;
  byte bVar6;
  long lVar7;
  int iVar8;
  uint uVar9;
  int iVar10;
  COMP_CTX *ctx;
  uchar *out;
  undefined8 uVar11;
  undefined8 uVar12;
  byte *pbVar13;
  long lVar14;
  ulong uVar15;
  ulong uVar16;
  long lVar17;
  int *piVar18;
  long lVar19;
  ulong uVar20;
  long lVar21;
  uint uVar22;
  ulong uVar23;
  char *pcVar24;
  uint *puVar25;
  long lVar26;
  long lVar27;
  long lVar28;
  undefined8 *puVar29;
  long lVar30;
  undefined8 *ptr;
  undefined1 auStack_b0 [64];
  undefined1 auStack_68 [8];
  
  uVar23 = *(ulong *)(param_1 + 0x288);
  lVar14 = *(long *)(param_1 + 0x246);
  lVar26 = 0x12a8;
  lVar30 = 0;
  if (uVar23 == 0) {
    uVar23 = 1;
  }
  lVar27 = 0x12b0;
  uVar20 = 1;
  lVar2 = 0x12c8;
  lVar17 = 0x10;
  lVar7 = 0;
  do {
    lVar28 = lVar7;
    lVar21 = lVar17;
    lVar19 = lVar2;
    uVar15 = uVar20;
    if ((param_1[0x319] != 0xf1) || (*(ulong *)(param_1 + 0x72c) < 5)) {
      iVar8 = ssl3_read_n(param_1,5,*(undefined8 *)(param_1 + 0x322),0,uVar15 == 1,auStack_68);
      if (iVar8 < 1) {
        return iVar8;
      }
      uVar20 = *(ulong *)(param_1 + 0x72c);
      param_1[0x319] = 0xf1;
      if ((long)uVar20 < 0) {
        ERR_new();
        ERR_set_debug("ssl/record/ssl3_record.c",0xf1,"ssl3_get_record");
        uVar11 = 0x50;
      }
      else {
        if ((1 < uVar20) && (uVar20 != 2)) {
          pbVar13 = *(byte **)(param_1 + 0x72a);
          bVar3 = *pbVar13;
          bVar4 = pbVar13[1];
          if ((param_1[0xe] == 0) ||
             (((param_1[0x742] == 0 || (-1 < (char)bVar3)) || (pbVar13[2] != 1)))) {
            if (uVar20 - 3 < 2) {
              if (*(code **)(param_1 + 0x130) != (code *)0x0) {
                (**(code **)(param_1 + 0x130))
                          (0,0,0x100,pbVar13,5,param_1,*(undefined8 *)(param_1 + 0x132));
              }
              ERR_new();
              uVar11 = 0x123;
              goto LAB_009cda88;
            }
            bVar5 = pbVar13[3];
            bVar6 = pbVar13[4];
            uVar9 = (uint)CONCAT11(bVar4,pbVar13[2]);
            *(uint *)((long)param_1 + lVar28 + 0x12ac) = (uint)bVar3;
            *(ulong *)((long)param_1 + lVar28 + 0x12b0) = (ulong)CONCAT11(bVar5,bVar6);
            *(uint *)((long)param_1 + lVar26) = uVar9;
            if (*(code **)(param_1 + 0x130) != (code *)0x0) {
              (**(code **)(param_1 + 0x130))
                        (0,uVar9,0x100,pbVar13,5,param_1,*(undefined8 *)(param_1 + 0x132));
            }
            if ((param_1[0x282] == 0) &&
               (((((*(byte *)(*(long *)(*(int **)(param_1 + 2) + 0x30) + 0x60) >> 3 & 1) != 0 ||
                  (iVar8 = **(int **)(param_1 + 2), iVar8 < 0x304)) || (iVar8 == 0x10000)) &&
                ((param_1[0x23a] != 1 && (uVar9 != *param_1)))))) {
              if (((*param_1 & 0xff00) == (uint)bVar4 * 0x100) &&
                 ((*(long *)(param_1 + 0x21e) == 0 && (*(long *)(param_1 + 0x224) == 0)))) {
                if (*(int *)((long)param_1 + lVar28 + 0x12ac) == 0x15) {
                  ERR_new();
                  uVar11 = 0x143;
                  goto LAB_009cdb64;
                }
                *param_1 = uVar9;
              }
              ERR_new();
              uVar11 = 0x14c;
LAB_009cdfd4:
              ERR_set_debug("ssl/record/ssl3_record.c",uVar11,"ssl3_get_record");
              uVar11 = 0x46;
            }
            else {
              if (bVar4 != 3) {
                if (param_1[0x742] != 0) {
                  pcVar24 = *(char **)(param_1 + 0x72a);
                  iVar8 = strncmp(pcVar24,"GET ",4);
                  if ((((iVar8 == 0) || (iVar8 = strncmp(pcVar24,"POST ",5), iVar8 == 0)) ||
                      (iVar8 = strncmp(pcVar24,"HEAD ",5), iVar8 == 0)) ||
                     (iVar8 = strncmp(pcVar24,"PUT ",4), iVar8 == 0)) {
                    ERR_new();
                    ERR_set_debug("ssl/record/ssl3_record.c",0x159,"ssl3_get_record");
                    uVar11 = 0x9c;
                    goto LAB_009cdc70;
                  }
                  iVar8 = strncmp(pcVar24,"CONNE",5);
                  ERR_new();
                  if (iVar8 == 0) {
                    ERR_set_debug("ssl/record/ssl3_record.c",0x15d,"ssl3_get_record");
                    uVar11 = 0x9b;
                    goto LAB_009cdc70;
                  }
                  uVar11 = 0x163;
LAB_009cdb64:
                  ERR_set_debug("ssl/record/ssl3_record.c",uVar11,"ssl3_get_record");
                  uVar11 = 0x10b;
LAB_009cdc70:
                  ossl_statem_fatal(param_1,0xffffffff,uVar11,0);
                  return -1;
                }
                ERR_new();
                uVar11 = 0x167;
                goto LAB_009cdfd4;
              }
              if ((((*(byte *)(*(long *)(*(int **)(param_1 + 2) + 0x30) + 0x60) >> 3 & 1) != 0) ||
                  (iVar8 = **(int **)(param_1 + 2), iVar8 < 0x304)) ||
                 ((iVar8 == 0x10000 || (*(long *)(param_1 + 0x212) == 0)))) {
LAB_009cd2fc:
                if (*(ulong *)((long)param_1 + lVar28 + 0x12b0) <= *(long *)(param_1 + 0x322) - 5U)
                goto LAB_009cd310;
                ERR_new();
                uVar11 = 0x181;
                goto LAB_009cdd68;
              }
              iVar8 = *(int *)((long)param_1 + lVar28 + 0x12ac);
              if (iVar8 != 0x17) {
                if (iVar8 == 0x15) {
                  if (param_1[0x20] != 1) goto LAB_009cdda0;
                }
                else if ((iVar8 != 0x14) ||
                        ((*(long *)(param_1 + 0x90) != 0 && (*(long *)(param_1 + 0xb2) != 0)))) {
LAB_009cdda0:
                  ERR_new();
                  ERR_set_debug("ssl/record/ssl3_record.c",0x174,"ssl3_get_record");
                  uVar11 = 10;
                  uVar12 = 0x1bb;
                  goto LAB_009cdfe0;
                }
              }
              if (*(int *)((long)param_1 + lVar26) == 0x303) goto LAB_009cd2fc;
              ERR_new();
              ERR_set_debug("ssl/record/ssl3_record.c",0x179,"ssl3_get_record");
              uVar11 = 0x32;
            }
            uVar12 = 0x10b;
          }
          else {
            uVar20 = ((ulong)bVar3 & 0x7f) << 8 | (ulong)bVar4;
            *(undefined8 *)((long)param_1 + lVar26) = 0x1600000002;
            *(ulong *)((long)param_1 + lVar28 + 0x12b0) = uVar20;
            if (uVar20 <= *(long *)(param_1 + 0x322) - 2U) {
              if (8 < uVar20) goto LAB_009cd310;
              ERR_new();
              uVar11 = 0x116;
              goto LAB_009cdd90;
            }
            ERR_new();
            uVar11 = 0x111;
LAB_009cdd68:
            ERR_set_debug("ssl/record/ssl3_record.c",uVar11,"ssl3_get_record");
            uVar11 = 0x16;
            uVar12 = 0xc6;
          }
          goto LAB_009cdfe0;
        }
        ERR_new();
        uVar11 = 0xf7;
LAB_009cda88:
        ERR_set_debug("ssl/record/ssl3_record.c",uVar11,"ssl3_get_record");
        uVar11 = 0x32;
      }
      uVar12 = 0xc0103;
      goto LAB_009cdfe0;
    }
LAB_009cd310:
    if ((((*(byte *)(*(long *)(*(int **)(param_1 + 2) + 0x30) + 0x60) >> 3 & 1) == 0) &&
        (iVar8 = **(int **)(param_1 + 2), 0x303 < iVar8)) && (iVar8 != 0x10000)) {
      uVar16 = *(ulong *)((long)param_1 + lVar28 + 0x12b0);
      if (0x4100 < uVar16) {
        ERR_new();
        uVar11 = 0x18c;
        goto LAB_009cdcfc;
      }
      puVar25 = (uint *)((long)param_1 + lVar27);
    }
    else {
      uVar16 = *(ulong *)((long)param_1 + lVar28 + 0x12b0);
      uVar20 = 0x4140;
      if (*(long *)(param_1 + 0x21c) != 0) {
        uVar20 = 0x4540;
      }
      if (uVar20 < uVar16) {
        ERR_new();
        uVar11 = 0x1a1;
LAB_009cdcfc:
        ERR_set_debug("ssl/record/ssl3_record.c",uVar11,"ssl3_get_record");
        uVar11 = 0x16;
        uVar12 = 0x96;
        goto LAB_009cdfe0;
      }
      puVar25 = param_1 + lVar30 * 0x14 + 0x4ac;
    }
    iVar8 = *(int *)((long)param_1 + lVar26);
    uVar20 = uVar16 - 3;
    if (iVar8 != 2) {
      uVar20 = uVar16;
    }
    if (uVar20 != 0) {
      iVar8 = ssl3_read_n(param_1,uVar20,uVar20,1,0,auStack_68);
      if (iVar8 < 1) {
        return iVar8;
      }
      iVar8 = *(int *)((long)param_1 + lVar26);
    }
    param_1[0x319] = 0xf0;
    lVar17 = *(long *)(param_1 + 0x72a);
    lVar2 = 2;
    if (iVar8 != 2) {
      lVar2 = 5;
    }
    *(long *)((long)param_1 + lVar28 + 0x12d0) = lVar17 + lVar2;
    *(long *)((long)param_1 + lVar19) = lVar17 + lVar2;
    uVar11 = *(undefined8 *)puVar25;
    *(undefined4 *)((long)param_1 + lVar28 + 0x12e0) = 0;
    *(undefined8 *)((long)param_1 + lVar28 + 0x12b8) = uVar11;
    param_1[0x72c] = 0;
    param_1[0x72d] = 0;
    param_1[0x742] = 0;
    if (((uVar23 <= uVar15) || (*(int *)((long)param_1 + lVar28 + 0x12ac) != 0x17)) ||
       (((*(byte *)(*(long *)(*(long *)(param_1 + 2) + 0xc0) + 0x60) & 1) == 0 ||
        (*(long *)(param_1 + 0x212) == 0)))) break;
    EVP_CIPHER_CTX_get0_cipher();
    uVar9 = EVP_CIPHER_get_flags();
    if ((((uVar9 >> 0x17 & 1) == 0) || (*(long *)(param_1 + 0x31e) == 0)) ||
       ((*(ulong *)(param_1 + 0x326) < 5 ||
        (pcVar24 = (char *)(*(long *)(param_1 + 0x31e) + *(long *)(param_1 + 0x324)),
        *pcVar24 != '\x17')))) break;
    lVar30 = lVar30 + 1;
    lVar27 = lVar27 + 0x50;
    lVar26 = lVar26 + 0x50;
    uVar20 = uVar15 + 1;
    lVar2 = lVar19 + 0x50;
    lVar17 = lVar21 + 0x10;
    lVar7 = lVar28 + 0x50;
    if (*(ulong *)(param_1 + 0x326) < (ulong)CONCAT11(pcVar24[3],pcVar24[4]) + 5) break;
  } while( true );
  if (((uVar15 == 1) && (param_1[0x4ab] == 0x14)) &&
     (((((*(byte *)(*(long *)(*(int **)(param_1 + 2) + 0x30) + 0x60) >> 3 & 1) == 0 &&
        ((iVar8 = **(int **)(param_1 + 2), 0x303 < iVar8 && (iVar8 != 0x10000)))) ||
       (param_1[0x23a] != 0)) &&
      ((*(long *)(param_1 + 0x90) == 0 || (*(long *)(param_1 + 0xb2) == 0)))))) {
    if ((*(long *)puVar25 == 1) && (**(char **)((long)param_1 + lVar19) == '\x01')) {
      lVar30 = *(long *)(param_1 + 0x734);
      param_1[0x4ab] = 0x16;
      *(ulong *)(param_1 + 0x734) = lVar30 + 1U;
      if (lVar30 + 1U < 0x21) {
        *(undefined4 *)((long)param_1 + lVar28 + 0x12e0) = 1;
        param_1[0x31a] = 1;
        param_1[0x31b] = 0;
        return 1;
      }
      ERR_new();
      ERR_set_debug("ssl/record/ssl3_record.c",0x200,"ssl3_get_record");
      uVar11 = 10;
      uVar12 = 0x106;
    }
    else {
      ERR_new();
      ERR_set_debug("ssl/record/ssl3_record.c",500,"ssl3_get_record");
      uVar11 = 0x2f;
      uVar12 = 0x104;
    }
LAB_009cdfe0:
    ossl_statem_fatal(param_1,uVar11,uVar12,0);
    return -1;
  }
  if ((*(long *)(param_1 + 0x218) == 0) || (lVar30 = EVP_MD_CTX_get0_md(), lVar30 == 0)) {
    uVar23 = 0;
    bVar3 = *(byte *)((long)param_1 + 0xa9);
  }
  else {
    uVar9 = EVP_MD_get_size();
    if (0x40 < uVar9) {
      ERR_new();
      ERR_set_debug("ssl/record/ssl3_record.c",0x216,"ssl3_get_record");
      uVar11 = 0x50;
      uVar12 = 0x80006;
      goto LAB_009cdfe0;
    }
    uVar23 = (ulong)(int)uVar9;
    bVar3 = *(byte *)((long)param_1 + 0xa9);
  }
  if (((bVar3 & 1) == 0) || (*(long *)(param_1 + 0x218) == 0)) {
    if (uVar23 == 0) goto LAB_009cd5d0;
    ptr = (undefined8 *)CRYPTO_zalloc(lVar21,"ssl/record/ssl3_record.c",0x23c);
    if (ptr == (undefined8 *)0x0) {
      ERR_new();
      ERR_set_debug("ssl/record/ssl3_record.c",0x23e,"ssl3_get_record");
      uVar12 = 0xc0100;
      uVar11 = 0x50;
      goto LAB_009cdfe0;
    }
  }
  else {
    if (uVar15 != 0) {
      uVar20 = 0;
      puVar25 = param_1 + 0x4aa;
      do {
        lVar30 = *(ulong *)(puVar25 + 2) - uVar23;
        if (*(ulong *)(puVar25 + 2) < uVar23) {
          ERR_new();
          uVar11 = 0x228;
LAB_009cdd90:
          ERR_set_debug("ssl/record/ssl3_record.c",uVar11,"ssl3_get_record");
          uVar11 = 0x32;
          uVar12 = 0xa0;
          goto LAB_009cdfe0;
        }
        *(long *)(puVar25 + 2) = lVar30;
        lVar26 = *(long *)(puVar25 + 8);
        iVar8 = (**(code **)(*(long *)(*(long *)(param_1 + 2) + 0xc0) + 8))
                          (param_1,puVar25,auStack_b0,0);
        if ((iVar8 == 0) ||
           (iVar8 = CRYPTO_memcmp(auStack_b0,(void *)(lVar26 + lVar30),uVar23), iVar8 != 0)) {
          ERR_new();
          ERR_set_debug("ssl/record/ssl3_record.c",0x230,"ssl3_get_record");
          uVar11 = 0x14;
          uVar12 = 0x119;
          goto LAB_009cdfe0;
        }
        uVar20 = uVar20 + 1;
        puVar25 = puVar25 + 0x14;
      } while (uVar20 < uVar15);
    }
    uVar23 = 0;
LAB_009cd5d0:
    ptr = (undefined8 *)0x0;
  }
  ERR_set_mark();
  iVar8 = (*(code *)**(undefined8 **)(*(long *)(param_1 + 2) + 0xc0))
                    (param_1,param_1 + 0x4aa,uVar15,0,ptr,uVar23);
  if (iVar8 == 0) {
    iVar8 = ossl_statem_in_error(param_1);
    if (iVar8 == 0) {
      if ((uVar15 != 1) || (iVar8 = ossl_statem_skip_early_data(param_1), iVar8 == 0)) {
        ERR_clear_last_mark();
        ERR_new();
        uVar11 = 0x26f;
LAB_009cdc28:
        ERR_set_debug("ssl/record/ssl3_record.c",uVar11,"ssl3_get_record");
        ossl_statem_fatal(param_1,0x14,0x119,0);
        goto joined_r0x009cdc44;
      }
      ERR_pop_to_mark();
      iVar8 = early_data_count_ok(param_1,*(undefined8 *)(param_1 + 0x4ac),0x68,0);
      if (iVar8 == 0) goto joined_r0x009cdc44;
      param_1[0x4ac] = 0;
      param_1[0x4ad] = 0;
      param_1[0x4b8] = 1;
      param_1[0x31a] = 1;
      param_1[0x31b] = 0;
      RECORD_LAYER_reset_read_sequence(param_1 + 0x316);
      goto joined_r0x009cdc04;
    }
    ERR_clear_last_mark();
  }
  else {
    ERR_clear_last_mark();
    if ((((lVar14 != 0) && (*(long *)(param_1 + 0x212) != 0)) &&
        ((*(byte *)((long)param_1 + 0xa9) & 1) == 0)) &&
       ((lVar30 = EVP_MD_CTX_get0_md(*(undefined8 *)(param_1 + 0x218)), lVar30 != 0 && (uVar15 != 0)
        ))) {
      puVar25 = param_1 + 0x4aa;
      lVar30 = -1;
      puVar29 = ptr;
      do {
        iVar10 = (**(code **)(*(long *)(*(long *)(param_1 + 2) + 0xc0) + 8))
                           (param_1,puVar25,auStack_b0,0);
        if (((puVar29 == (undefined8 *)0x0) || (iVar10 == 0)) ||
           (((void *)*puVar29 == (void *)0x0 ||
            (iVar10 = CRYPTO_memcmp(auStack_b0,(void *)*puVar29,uVar23), iVar10 != 0)))) {
          iVar8 = 0;
        }
        puVar1 = (ulong *)(puVar25 + 2);
        lVar30 = lVar30 + 1;
        puVar29 = puVar29 + 2;
        puVar25 = puVar25 + 0x14;
        iVar10 = 0;
        if (*puVar1 <= uVar23 + 0x4400) {
          iVar10 = iVar8;
        }
        iVar8 = iVar10;
      } while (uVar15 - 1 != lVar30);
      if (iVar10 == 0) {
        iVar8 = ossl_statem_in_error(param_1);
        if (iVar8 == 0) {
          ERR_new();
          uVar11 = 0x299;
          goto LAB_009cdc28;
        }
joined_r0x009cdc44:
        iVar8 = -1;
        goto joined_r0x009cd948;
      }
    }
    if (uVar15 != 0) {
      uVar23 = 0;
      do {
        ctx = *(COMP_CTX **)(param_1 + 0x21c);
        if (ctx != (COMP_CTX *)0x0) {
          uVar20 = *(ulong *)(param_1 + uVar23 * 0x14 + 0x4ac);
          if (uVar20 < 0x4401) {
            out = *(uchar **)(param_1 + uVar23 * 0x14 + 0x4b6);
            if (out == (uchar *)0x0) {
              out = CRYPTO_malloc(0x4540,"ssl/record/ssl3_record.c",0x325);
              *(uchar **)(param_1 + uVar23 * 0x14 + 0x4b6) = out;
              if (out != (uchar *)0x0) {
                ctx = *(COMP_CTX **)(param_1 + 0x21c);
                uVar20 = *(ulong *)(param_1 + uVar23 * 0x14 + 0x4ac);
                goto LAB_009cd734;
              }
            }
            else {
LAB_009cd734:
              iVar8 = COMP_expand_block(ctx,out,0x4000,*(uchar **)(param_1 + uVar23 * 0x14 + 0x4b2),
                                        (int)uVar20);
              if (-1 < iVar8) {
                *(long *)(param_1 + uVar23 * 0x14 + 0x4ac) = (long)iVar8;
                *(undefined8 *)(param_1 + uVar23 * 0x14 + 0x4b2) =
                     *(undefined8 *)(param_1 + uVar23 * 0x14 + 0x4b6);
                goto LAB_009cd760;
              }
            }
            ERR_new();
            ERR_set_debug("ssl/record/ssl3_record.c",0x2ab,"ssl3_get_record");
            uVar11 = 0x1e;
            uVar12 = 0x6b;
          }
          else {
            ERR_new();
            ERR_set_debug("ssl/record/ssl3_record.c",0x2a6,"ssl3_get_record");
            uVar11 = 0x16;
            uVar12 = 0x8c;
          }
LAB_009cde24:
          ossl_statem_fatal(param_1,uVar11,uVar12,0);
          goto joined_r0x009cd948;
        }
LAB_009cd760:
        piVar18 = *(int **)(param_1 + 2);
        uVar9 = *(uint *)(*(long *)(piVar18 + 0x30) + 0x60);
        if (((((uVar9 >> 3 & 1) == 0) && (0x303 < *piVar18)) && (*piVar18 != 0x10000)) &&
           ((*(long *)(param_1 + 0x212) != 0 && (param_1[uVar23 * 0x14 + 0x4ab] != 0x15)))) {
          if ((param_1[uVar23 * 0x14 + 0x4ab] == 0x17) &&
             (lVar30 = *(long *)(param_1 + uVar23 * 0x14 + 0x4ac), lVar30 != 0)) {
            do {
              lVar30 = lVar30 + -1;
              if (lVar30 == 0) break;
            } while (*(char *)(*(long *)(param_1 + uVar23 * 0x14 + 0x4b2) + lVar30) == '\0');
            *(long *)(param_1 + uVar23 * 0x14 + 0x4ac) = lVar30;
            pbVar13 = (byte *)(*(long *)(param_1 + uVar23 * 0x14 + 0x4b2) + lVar30);
            uVar22 = (uint)*pbVar13;
            param_1[uVar23 * 0x14 + 0x4ab] = uVar22;
            if (uVar22 - 0x15 < 3) {
              if (*(code **)(param_1 + 0x130) != (code *)0x0) {
                (**(code **)(param_1 + 0x130))
                          (0,*param_1,0x101,pbVar13,1,param_1,*(undefined8 *)(param_1 + 0x132));
                piVar18 = *(int **)(param_1 + 2);
                uVar9 = *(uint *)(*(long *)(piVar18 + 0x30) + 0x60);
              }
              goto LAB_009cd828;
            }
            ERR_new();
            uVar11 = 0x2c5;
          }
          else {
            ERR_new();
            uVar11 = 0x2b7;
          }
          ERR_set_debug("ssl/record/ssl3_record.c",uVar11,"ssl3_get_record");
          uVar11 = 10;
          uVar12 = 0x1bb;
          goto LAB_009cde24;
        }
LAB_009cd828:
        if ((((uVar9 >> 3 & 1) == 0) && (0x303 < *piVar18)) &&
           ((*piVar18 != 0x10000 &&
            ((param_1[uVar23 * 0x14 + 0x4ab] - 0x15 < 2 &&
             (*(long *)(param_1 + uVar23 * 0x14 + 0x4ac) == 0)))))) {
          ERR_new();
          ERR_set_debug("ssl/record/ssl3_record.c",0x2d5,"ssl3_get_record");
          uVar11 = 10;
          uVar12 = 0x10f;
          goto LAB_009cde24;
        }
        uVar20 = *(ulong *)(param_1 + uVar23 * 0x14 + 0x4ac);
        if (0x4000 < uVar20) {
          ERR_new();
          uVar11 = 0x2e3;
LAB_009cde18:
          ERR_set_debug("ssl/record/ssl3_record.c",uVar11,"ssl3_get_record");
          uVar11 = 0x16;
          uVar12 = 0x92;
          goto LAB_009cde24;
        }
        if (((*(long *)(param_1 + 0x246) != 0) &&
            (uVar9 = *(byte *)(*(long *)(param_1 + 0x246) + 0x368) - 1, uVar9 < 4)) &&
           ((uint)(0x200 << (ulong)(uVar9 & 0x1f)) < uVar20)) {
          ERR_new();
          uVar11 = 0x2ee;
          goto LAB_009cde18;
        }
        (param_1 + uVar23 * 0x14 + 0x4b0)[0] = 0;
        (param_1 + uVar23 * 0x14 + 0x4b0)[1] = 0;
        if (uVar20 == 0) {
          lVar30 = *(long *)(param_1 + 0x734);
          *(ulong *)(param_1 + 0x734) = lVar30 + 1U;
          if (0x20 < lVar30 + 1U) {
            ERR_new();
            ERR_set_debug("ssl/record/ssl3_record.c",0x300,"ssl3_get_record");
            uVar11 = 10;
            uVar12 = 0x12a;
            goto LAB_009cde24;
          }
        }
        else {
          param_1[0x734] = 0;
          param_1[0x735] = 0;
        }
        uVar23 = uVar23 + 1;
      } while (uVar23 < uVar15);
    }
    if (((param_1[0x21] != 0xb) || (param_1[0x4ab] != 0x17)) ||
       (iVar8 = early_data_count_ok(param_1,*(undefined8 *)(param_1 + 0x4ac),0,0), iVar8 != 0)) {
      *(ulong *)(param_1 + 0x31a) = uVar15;
joined_r0x009cdc04:
      iVar8 = 1;
      goto joined_r0x009cd948;
    }
  }
joined_r0x009cd948:
  iVar8 = -1;
joined_r0x009cd948:
  if (ptr != (undefined8 *)0x0) {
    if (uVar15 != 0) {
      piVar18 = (int *)(ptr + 1);
      lVar30 = -1;
      do {
        if (*piVar18 != 0) {
          CRYPTO_free(*(void **)(piVar18 + -2));
        }
        lVar30 = lVar30 + 1;
        piVar18 = piVar18 + 4;
      } while (uVar15 - 1 != lVar30);
    }
    CRYPTO_free(ptr);
  }
  return iVar8;
}

