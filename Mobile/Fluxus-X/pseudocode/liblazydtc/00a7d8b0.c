/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a7d8b0
 */

undefined4
ossl_ffc_params_FIPS186_4_gen_verify
          (undefined8 param_1,long *param_2,int param_3,int param_4,ulong param_5,ulong param_6,
          uint *param_7,BN_GENCB *param_8)

{
  byte *__s;
  ulong uVar1;
  size_t count;
  bool bVar2;
  byte *s;
  int iVar3;
  int iVar4;
  int iVar5;
  int iVar6;
  EVP_MD *type;
  undefined8 uVar7;
  long lVar8;
  BN_CTX *ctx;
  BIGNUM *pBVar9;
  BIGNUM *dv;
  BIGNUM *pBVar10;
  BIGNUM *ret;
  EVP_MD_CTX *ctx_00;
  BIGNUM *a;
  char *pcVar11;
  undefined8 uVar12;
  undefined4 uVar13;
  long lVar14;
  void *data;
  int len;
  ulong uVar15;
  BIGNUM *ret_00;
  uint uVar16;
  void *__dest;
  uint uVar17;
  ulong uVar18;
  BN_MONT_CTX *mont;
  int local_154;
  void *local_140;
  BIGNUM *local_f0;
  BIGNUM *local_e8;
  undefined8 local_b0;
  byte local_a8 [72];
  
  uVar16 = 0;
  local_b0 = 0;
  if (param_3 == 0) {
    uVar16 = *(uint *)(param_2 + 8);
  }
  *param_7 = 0;
  pcVar11 = (char *)param_2[9];
  uVar15 = param_6;
  if (pcVar11 == (char *)0x0) {
    uVar15 = 0x100;
    if (param_5 < 0x800) {
      uVar15 = 0xa0;
    }
    if (param_6 != 0) {
      uVar15 = param_6;
    }
    if (uVar15 == 0xa0) {
      pcVar11 = "SHA1";
      goto LAB_00a7d90c;
    }
    if (uVar15 == 0x100) {
      pcVar11 = "SHA-256";
      goto LAB_00a7d90c;
    }
    if (uVar15 == 0xe0) {
      pcVar11 = "SHA-224";
      goto LAB_00a7d90c;
    }
    uVar16 = 0x20;
    type = (EVP_MD *)0x0;
LAB_00a7dba8:
    mont = (BN_MONT_CTX *)0x0;
    lVar8 = 0;
    __dest = (void *)0x0;
    ctx = (BN_CTX *)0x0;
    data = (void *)0x0;
    goto LAB_00a7dbb0;
  }
LAB_00a7d90c:
  type = (EVP_MD *)EVP_MD_fetch(param_1,pcVar11,param_2[10]);
  if ((type == (EVP_MD *)0x0) || (iVar3 = EVP_MD_get_size(type), iVar3 < 1)) {
LAB_00a7dafc:
    mont = (BN_MONT_CTX *)0x0;
    __dest = (void *)0x0;
    ctx = (BN_CTX *)0x0;
    lVar8 = 0;
    data = (void *)0x0;
    uVar13 = 0;
    goto LAB_00a7dbb4;
  }
  uVar18 = (ulong)(iVar3 << 3);
  uVar1 = uVar18;
  if (uVar15 != 0) {
    uVar1 = uVar15;
  }
  if (param_5 <= uVar1) {
LAB_00a7db94:
    uVar16 = 0x20000;
    goto LAB_00a7dba8;
  }
  if (param_4 == 0) {
    if ((((param_5 < 0xc00) || (uVar1 < 0x100)) && ((param_5 < 0x800 || (uVar1 < 0xe0)))) &&
       ((param_5 < 0x400 || (uVar1 < 0xa0)))) {
      ERR_new();
      ERR_set_debug("crypto/ffc/ffc_params_generate.c",0x57,"ffc_validate_LN");
      uVar7 = 10;
      uVar12 = 0x72;
LAB_00a7db8c:
      ERR_set_error(uVar7,uVar12,0);
      goto LAB_00a7db94;
    }
  }
  else {
    if (param_4 != 1) goto LAB_00a7db94;
    if (((param_5 != 0x400) || (uVar1 != 0xa0)) &&
       ((param_5 != 0x800 || ((uVar1 != 0xe0 && (uVar1 != 0x100)))))) {
      ERR_new();
      ERR_set_debug("crypto/ffc/ffc_params_generate.c",0x4d,"ffc_validate_LN");
      uVar7 = 5;
      uVar12 = 0x7f;
      goto LAB_00a7db8c;
    }
  }
  lVar8 = EVP_MD_CTX_new();
  if (lVar8 == 0) goto LAB_00a7dafc;
  ctx = (BN_CTX *)BN_CTX_new_ex(param_1);
  if (ctx == (BN_CTX *)0x0) {
LAB_00a7db18:
    mont = (BN_MONT_CTX *)0x0;
    __dest = (void *)0x0;
    data = (void *)0x0;
  }
  else {
    BN_CTX_start(ctx);
    local_e8 = BN_CTX_get(ctx);
    pBVar9 = BN_CTX_get(ctx);
    dv = BN_CTX_get(ctx);
    pBVar10 = BN_CTX_get(ctx);
    ret = BN_CTX_get(ctx);
    if (ret == (BIGNUM *)0x0) goto LAB_00a7db18;
    data = (void *)param_2[4];
    count = (long)iVar3;
    if (param_2[5] != 0) {
      count = param_2[5];
    }
    if (param_3 == 0) {
      if (((uVar16 & 1) == 0) || ((data != (void *)0x0 && (-1 < (int)param_2[6])))) {
        if (((uVar16 >> 1 & 1) == 0) || (param_2[2] != 0)) goto LAB_00a7dc3c;
        mont = (BN_MONT_CTX *)0x0;
        __dest = (void *)0x0;
        uVar16 = 0x400;
      }
      else {
        __dest = (void *)0x0;
LAB_00a7de58:
        mont = (BN_MONT_CTX *)0x0;
        uVar16 = 0x200;
      }
LAB_00a7dbb0:
      uVar13 = 0;
      *param_7 = uVar16;
      goto LAB_00a7dbb4;
    }
    if ((*param_2 == 0) != (param_2[1] == 0)) {
      mont = (BN_MONT_CTX *)0x0;
      __dest = (void *)0x0;
      uVar16 = 0x800;
      goto LAB_00a7dbb0;
    }
LAB_00a7dc3c:
    if (((uVar16 & 1) != 0) || (local_f0 = (BIGNUM *)*param_2, local_f0 == (BIGNUM *)0x0)) {
      local_f0 = BN_CTX_get(ctx);
      ret_00 = BN_CTX_get(ctx);
      if (ret_00 == (BIGNUM *)0x0) {
        mont = (BN_MONT_CTX *)0x0;
        __dest = (void *)0x0;
        goto LAB_00a7db24;
      }
      if (uVar1 <= count << 3) {
        __dest = CRYPTO_malloc((int)count,"crypto/ffc/ffc_params_generate.c",0x283);
        if (__dest != (void *)0x0) {
          iVar3 = (int)param_5;
          if (data == (void *)0x0) {
            if (param_3 == 0) {
              data = (void *)0x0;
              goto LAB_00a7de58;
            }
            data = CRYPTO_malloc((int)count,"crypto/ffc/ffc_params_generate.c",0x28e);
            if (data == (void *)0x0) goto LAB_00a7e30c;
            local_154 = iVar3 * 4 + -1;
          }
          else {
            iVar4 = iVar3 * 4 + -1;
            if (param_3 == 0) {
              local_154 = (int)param_2[6];
              if (iVar4 < local_154) {
                mont = (BN_MONT_CTX *)0x0;
                uVar16 = 0x1000;
                goto LAB_00a7dbb0;
              }
            }
            else {
              local_154 = iVar4;
            }
          }
          a = BN_value_one();
          iVar4 = BN_lshift(pBVar10,a,(int)(param_5 - 1));
          if (iVar4 != 0) {
            local_140 = (void *)param_2[4];
            uVar15 = 0;
            if (uVar18 != 0) {
              uVar15 = (param_5 - 1) / uVar18;
            }
            len = (int)(uVar1 >> 3);
            lVar14 = (long)(((uVar1 >> 3) << 0x20) + -0x100000000) >> 0x20;
            iVar4 = 0;
            do {
              iVar5 = EVP_MD_get_size(type);
              uVar7 = ossl_bn_get_libctx(ctx);
              __s = local_a8 + iVar5;
              s = __s + -(long)len;
              if (iVar5 <= len) {
                s = local_a8;
              }
              while( true ) {
                iVar6 = BN_GENCB_call(param_8,0,iVar4);
                if ((iVar6 == 0) ||
                   (((data != local_140 && (iVar6 = RAND_bytes_ex(uVar7,data,count,0), iVar6 < 1))
                    || (iVar6 = EVP_Digest(data,count,local_a8,(uint *)0x0,type,(ENGINE *)0x0),
                       iVar6 == 0)))) goto LAB_00a7e30c;
                if (iVar5 < len) {
                  memset(__s,0,(long)(len - iVar5));
                }
                *s = *s | 0x80;
                s[lVar14] = s[lVar14] | 1;
                pBVar10 = BN_bin2bn(s,len,ret_00);
                if (pBVar10 == (BIGNUM *)0x0) goto LAB_00a7e30c;
                iVar6 = BN_check_prime(ret_00,ctx,param_8);
                if (0 < iVar6) break;
                if (data == local_140) {
                  mont = (BN_MONT_CTX *)0x0;
                  *param_7 = *param_7 | 0x10;
                  goto LAB_00a7db24;
                }
                iVar4 = iVar4 + 1;
                if (iVar6 != 0) goto LAB_00a7e30c;
              }
              if ((param_3 == 0) && (iVar5 = BN_cmp(ret_00,(BIGNUM *)param_2[1]), iVar5 != 0)) {
                mont = (BN_MONT_CTX *)0x0;
                uVar16 = 0x4000;
                goto LAB_00a7dbb0;
              }
              iVar5 = BN_GENCB_call(param_8,2,0);
              if ((iVar5 == 0) || (iVar5 = BN_GENCB_call(param_8,3,0), iVar5 == 0))
              goto LAB_00a7e30c;
              memcpy(__dest,data,count);
              iVar5 = FUN_00a7e31c(ctx,type,local_154,uVar15,__dest,count,ret_00,local_f0,iVar3,
                                   param_8,(long)&local_b0 + 4,param_7);
              if (0 < iVar5) {
                iVar3 = BN_GENCB_call(param_8,2,1);
                if ((iVar3 == 0) ||
                   ((param_3 == 0 &&
                    ((local_b0._4_4_ != local_154 ||
                     (iVar3 = BN_cmp(local_f0,(BIGNUM *)*param_2), iVar3 != 0))))))
                goto LAB_00a7e30c;
                if ((uVar16 & 3) != 1) goto LAB_00a7dc5c;
                mont = (BN_MONT_CTX *)0x0;
                bVar2 = false;
                goto LAB_00a7e21c;
              }
              if (iVar5 < 0) goto LAB_00a7e30c;
              local_140 = (void *)param_2[4];
              iVar4 = iVar4 + 1;
            } while (data != local_140);
            mont = (BN_MONT_CTX *)0x0;
            uVar16 = 1;
            goto LAB_00a7dbb0;
          }
        }
LAB_00a7e30c:
        mont = (BN_MONT_CTX *)0x0;
        goto LAB_00a7db24;
      }
      mont = (BN_MONT_CTX *)0x0;
      __dest = (void *)0x0;
      uVar16 = 0x40000;
      goto LAB_00a7dbb0;
    }
    ret_00 = (BIGNUM *)param_2[1];
    __dest = (void *)0x0;
LAB_00a7dc5c:
    mont = BN_MONT_CTX_new();
    if (((mont == (BN_MONT_CTX *)0x0) || (iVar3 = BN_MONT_CTX_set(mont,local_f0,ctx), iVar3 == 0))
       || (((uVar16 >> 1 & 1) != 0 &&
           (iVar3 = ossl_ffc_params_validate_unverifiable_g
                              (ctx,mont,local_f0,ret_00,param_2[2],ret,param_7), iVar3 == 0)))) {
LAB_00a7e230:
      uVar13 = 0;
      goto LAB_00a7dbb4;
    }
    pBVar10 = BN_value_one();
    iVar3 = BN_sub(pBVar9,local_f0,pBVar10);
    if ((iVar3 == 0) || (iVar3 = BN_div(dv,(BIGNUM *)0x0,pBVar9,ret_00,ctx), iVar3 == 0))
    goto LAB_00a7e230;
    if ((data != (void *)0x0) && (lVar14 = param_2[7], (int)lVar14 != -1)) {
      iVar3 = EVP_MD_get_size(type);
      if ((0 < iVar3) && (ctx_00 = (EVP_MD_CTX *)EVP_MD_CTX_new(), ctx_00 != (EVP_MD_CTX *)0x0)) {
        uVar17 = 1;
        do {
          local_a8[0] = (byte)lVar14;
          local_a8[1] = (byte)(uVar17 >> 8);
          local_a8[2] = (byte)uVar17;
          iVar4 = EVP_DigestInit_ex(ctx_00,type,(ENGINE *)0x0);
          if (((((iVar4 == 0) || (iVar4 = EVP_DigestUpdate(ctx_00,data,count), iVar4 == 0)) ||
               (iVar4 = EVP_DigestUpdate(ctx_00,&DAT_00766b70,4), iVar4 == 0)) ||
              ((iVar4 = EVP_DigestUpdate(ctx_00,local_a8,3), iVar4 == 0 ||
               (iVar4 = EVP_DigestFinal_ex(ctx_00,local_a8,(uint *)0x0), iVar4 == 0)))) ||
             ((pBVar9 = BN_bin2bn(local_a8,iVar3,ret), pBVar9 == (BIGNUM *)0x0 ||
              (iVar4 = BN_mod_exp_mont(local_e8,ret,dv,local_f0,ctx,mont), iVar4 == 0)))) break;
          pBVar9 = BN_value_one();
          iVar4 = BN_cmp(local_e8,pBVar9);
          if (0 < iVar4) {
            EVP_MD_CTX_free(ctx_00);
            if ((param_3 != 0) || (iVar3 = BN_cmp(local_e8,(BIGNUM *)param_2[2]), iVar3 == 0)) {
              bVar2 = true;
              goto LAB_00a7e15c;
            }
            uVar16 = 0x8000;
            goto LAB_00a7dbb0;
          }
          uVar17 = uVar17 + 1;
        } while ((uVar17 & 0xffff0000) == 0);
        EVP_MD_CTX_free(ctx_00);
      }
      uVar16 = 0x400;
      goto LAB_00a7dbb0;
    }
    if (param_3 == 0) {
      bVar2 = false;
    }
    else {
      iVar3 = FUN_00a7e5fc(ctx,mont,local_e8,ret,local_f0,dv,pBVar9,&local_b0);
      bVar2 = false;
      if (iVar3 == 0) goto LAB_00a7e230;
    }
LAB_00a7e15c:
    iVar3 = BN_GENCB_call(param_8,3,1);
    if (iVar3 == 0) goto LAB_00a7e230;
    if (param_3 == 0) {
LAB_00a7e21c:
      uVar13 = 1;
      if (!bVar2 && (uVar16 & 2) != 0) {
        uVar13 = 2;
      }
      goto LAB_00a7dbb4;
    }
    if (local_f0 != (BIGNUM *)*param_2) {
      BN_free((BIGNUM *)*param_2);
      pBVar9 = BN_dup(local_f0);
      *param_2 = (long)pBVar9;
    }
    if (ret_00 != (BIGNUM *)param_2[1]) {
      BN_free((BIGNUM *)param_2[1]);
      pBVar9 = BN_dup(ret_00);
      param_2[1] = (long)pBVar9;
    }
    if (local_e8 != (BIGNUM *)param_2[2]) {
      BN_free((BIGNUM *)param_2[2]);
      local_e8 = BN_dup(local_e8);
      param_2[2] = (long)local_e8;
    }
    if (*param_2 == 0) goto LAB_00a7e230;
    if ((param_2[1] != 0) && (local_e8 != (BIGNUM *)0x0)) {
      iVar3 = ossl_ffc_params_set_validate_params(param_2,data,count,local_b0._4_4_);
      if (iVar3 != 0) {
        *(undefined4 *)((long)param_2 + 0x3c) = (undefined4)local_b0;
        goto LAB_00a7e21c;
      }
    }
  }
LAB_00a7db24:
  uVar13 = 0;
LAB_00a7dbb4:
  if (data != (void *)param_2[4]) {
    CRYPTO_free(data);
  }
  CRYPTO_free(__dest);
  if (ctx != (BN_CTX *)0x0) {
    BN_CTX_end(ctx);
  }
  BN_CTX_free(ctx);
  BN_MONT_CTX_free(mont);
  EVP_MD_CTX_free(lVar8);
  EVP_MD_free(type);
  return uVar13;
}

