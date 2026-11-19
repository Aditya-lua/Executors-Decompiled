/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a7e6f8
 */

int ossl_ffc_params_FIPS186_2_gen_verify
              (undefined8 param_1,long *param_2,int param_3,undefined8 param_4,ulong param_5,
              ulong param_6,undefined4 *param_7,BN_GENCB *param_8)

{
  size_t __n;
  void *__src;
  char cVar1;
  bool bVar2;
  int iVar3;
  int iVar4;
  int iVar5;
  EVP_MD *type;
  BN_CTX *ctx;
  BIGNUM *dv;
  BIGNUM *a;
  BIGNUM *ret;
  BIGNUM *pBVar6;
  BIGNUM *pBVar7;
  BIGNUM *r;
  BIGNUM *pBVar8;
  undefined8 uVar9;
  char *pcVar10;
  ulong uVar11;
  undefined4 uVar12;
  long lVar13;
  long lVar14;
  long lVar15;
  undefined8 *puVar16;
  byte *pbVar17;
  undefined8 *puVar18;
  byte *pbVar19;
  ulong uVar20;
  uint uVar21;
  int len;
  ulong __n_00;
  int iVar22;
  ulong uVar23;
  BN_MONT_CTX *mont;
  undefined8 uVar24;
  undefined8 uVar25;
  undefined8 uVar26;
  undefined8 uVar27;
  undefined8 uVar28;
  undefined8 uVar29;
  undefined8 uVar30;
  undefined8 uVar31;
  int local_14c;
  undefined4 local_130;
  undefined4 local_12c;
  undefined1 auStack_128 [32];
  undefined1 auStack_108 [31];
  byte abStack_e9 [17];
  undefined8 auStack_d8 [6];
  byte local_a8 [16];
  undefined8 auStack_98 [7];
  
  local_130 = 0xffffffff;
  local_12c = 0;
  __src = (void *)param_2[4];
  uVar11 = param_2[5];
  uVar21 = 0;
  if (param_3 == 0) {
    uVar21 = *(uint *)(param_2 + 8);
  }
  *param_7 = 0;
  pcVar10 = (char *)param_2[9];
  uVar20 = param_6;
  if (pcVar10 == (char *)0x0) {
    uVar20 = 0x100;
    if (param_5 < 0x800) {
      uVar20 = 0xa0;
    }
    if (param_6 != 0) {
      uVar20 = param_6;
    }
    if (uVar20 == 0xa0) {
      pcVar10 = "SHA1";
      goto LAB_00a7e758;
    }
    if (uVar20 == 0x100) {
      pcVar10 = "SHA-256";
      goto LAB_00a7e758;
    }
    if (uVar20 == 0xe0) {
      pcVar10 = "SHA-224";
      goto LAB_00a7e758;
    }
    type = (EVP_MD *)0x0;
LAB_00a7e858:
    uVar12 = 0x20;
LAB_00a7e85c:
    iVar3 = 0;
    ctx = (BN_CTX *)0x0;
    mont = (BN_MONT_CTX *)0x0;
    *param_7 = uVar12;
    goto LAB_00a7e864;
  }
LAB_00a7e758:
  type = (EVP_MD *)EVP_MD_fetch(param_1,pcVar10,param_2[10]);
  if (type == (EVP_MD *)0x0) {
    iVar3 = 0;
    ctx = (BN_CTX *)0x0;
    mont = (BN_MONT_CTX *)0x0;
    goto LAB_00a7e864;
  }
  if (uVar20 == 0) {
    iVar3 = EVP_MD_get_size(type);
    uVar20 = (ulong)(iVar3 << 3);
    if (0x1ff < param_5) goto LAB_00a7e7ec;
LAB_00a7e778:
    uVar12 = 0x20000;
    goto LAB_00a7e85c;
  }
  if (param_5 < 0x200) goto LAB_00a7e778;
LAB_00a7e7ec:
  __n_00 = uVar20 >> 3;
  if ((0x20 < __n_00) || ((1L << (__n_00 & 0x3f) & 0x110100000U) == 0)) goto LAB_00a7e858;
  if (__src != (void *)0x0) {
    if (uVar11 < __n_00) {
      uVar12 = 0x40000;
      goto LAB_00a7e85c;
    }
    __n = __n_00;
    if (uVar11 <= __n_00) {
      __n = uVar11;
    }
    memcpy(auStack_108,__src,__n);
  }
  ctx = (BN_CTX *)BN_CTX_new_ex(param_1);
  if (ctx == (BN_CTX *)0x0) {
    iVar3 = 0;
    mont = (BN_MONT_CTX *)0x0;
    goto LAB_00a7e864;
  }
  BN_CTX_start(ctx);
  dv = BN_CTX_get(ctx);
  a = BN_CTX_get(ctx);
  ret = BN_CTX_get(ctx);
  pBVar6 = BN_CTX_get(ctx);
  pBVar7 = BN_CTX_get(ctx);
  r = BN_CTX_get(ctx);
  if (r == (BIGNUM *)0x0) {
LAB_00a7ee30:
    iVar3 = 0;
    mont = (BN_MONT_CTX *)0x0;
  }
  else {
    uVar23 = param_5 + 0x3f & 0xffffffffffffffc0;
    pBVar8 = BN_value_one();
    uVar11 = uVar23 - 1;
    iVar3 = BN_lshift(r,pBVar8,(int)uVar11);
    if (iVar3 == 0) goto LAB_00a7ee30;
    if (param_3 == 0) {
      if (((uVar21 & 1) == 0) || ((__src != (void *)0x0 && (-1 < (int)param_2[6])))) {
        if (((uVar21 >> 1 & 1) == 0) || (param_2[2] != 0)) goto LAB_00a7e9a4;
        uVar12 = 0x400;
      }
      else {
        uVar12 = 0x200;
      }
LAB_00a7ecfc:
      iVar3 = 0;
      mont = (BN_MONT_CTX *)0x0;
      *param_7 = uVar12;
    }
    else {
      if ((*param_2 != 0) != (param_2[1] != 0)) {
        uVar12 = 0x800;
        goto LAB_00a7ecfc;
      }
LAB_00a7e9a4:
      if (((uVar21 & 1) != 0) || ((BIGNUM *)*param_2 == (BIGNUM *)0x0)) {
        len = (int)__n_00;
        iVar22 = (int)uVar23;
        uVar23 = uVar20 >> 3 & 0xffffffff;
        uVar20 = uVar20 >> 3 & 0x1f;
        iVar5 = iVar22 * 4 + -1;
        lVar15 = uVar23 - uVar20;
        bVar2 = __src == (void *)0x0;
        local_14c = 0;
LAB_00a7eab8:
        uVar9 = ossl_bn_get_libctx(ctx);
        do {
          iVar3 = BN_GENCB_call(param_8,0,local_14c);
          if ((iVar3 == 0) ||
             ((bVar2 && (iVar3 = RAND_bytes_ex(uVar9,auStack_108,__n_00,0), iVar3 < 1))))
          goto LAB_00a7ee30;
          local_14c = local_14c + 1;
          memcpy(auStack_128,auStack_108,__n_00);
          memcpy(local_a8,auStack_108,__n_00);
          lVar13 = (long)len;
          do {
            if (lVar13 < 1) break;
            cVar1 = auStack_128[lVar13 + -1];
            auStack_128[lVar13 + -1] = cVar1 + '\x01';
            lVar13 = lVar13 + -1;
          } while ((char)(cVar1 + '\x01') == '\0');
          iVar3 = EVP_Digest(auStack_108,__n_00,abStack_e9 + 1,(uint *)0x0,type,(ENGINE *)0x0);
          if ((iVar3 == 0) ||
             (iVar3 = EVP_Digest(auStack_128,__n_00,local_a8,(uint *)0x0,type,(ENGINE *)0x0),
             iVar3 == 0)) goto LAB_00a7ee30;
          if (0 < len) {
            lVar13 = 0;
            if (0x1f < uVar23) {
              lVar13 = lVar15;
              puVar16 = auStack_d8;
              puVar18 = auStack_98;
              do {
                uVar25 = puVar18[-1];
                uVar24 = puVar18[-2];
                uVar27 = puVar18[1];
                uVar26 = *puVar18;
                uVar29 = puVar16[-1];
                uVar28 = puVar16[-2];
                uVar31 = puVar16[1];
                uVar30 = *puVar16;
                puVar18 = puVar18 + 4;
                lVar13 = lVar13 + -0x20;
                puVar16[-1] = CONCAT17((byte)((ulong)uVar29 >> 0x38) ^ (byte)((ulong)uVar25 >> 0x38)
                                       ,CONCAT16((byte)((ulong)uVar29 >> 0x30) ^
                                                 (byte)((ulong)uVar25 >> 0x30),
                                                 CONCAT15((byte)((ulong)uVar29 >> 0x28) ^
                                                          (byte)((ulong)uVar25 >> 0x28),
                                                          CONCAT14((byte)((ulong)uVar29 >> 0x20) ^
                                                                   (byte)((ulong)uVar25 >> 0x20),
                                                                   CONCAT13((byte)((ulong)uVar29 >>
                                                                                  0x18) ^
                                                                            (byte)((ulong)uVar25 >>
                                                                                  0x18),
                                                                            CONCAT12((byte)((ulong)
                                                  uVar29 >> 0x10) ^ (byte)((ulong)uVar25 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar29 >> 8) ^
                                                           (byte)((ulong)uVar25 >> 8),
                                                           (byte)uVar29 ^ (byte)uVar25)))))));
                puVar16[-2] = CONCAT17((byte)((ulong)uVar28 >> 0x38) ^ (byte)((ulong)uVar24 >> 0x38)
                                       ,CONCAT16((byte)((ulong)uVar28 >> 0x30) ^
                                                 (byte)((ulong)uVar24 >> 0x30),
                                                 CONCAT15((byte)((ulong)uVar28 >> 0x28) ^
                                                          (byte)((ulong)uVar24 >> 0x28),
                                                          CONCAT14((byte)((ulong)uVar28 >> 0x20) ^
                                                                   (byte)((ulong)uVar24 >> 0x20),
                                                                   CONCAT13((byte)((ulong)uVar28 >>
                                                                                  0x18) ^
                                                                            (byte)((ulong)uVar24 >>
                                                                                  0x18),
                                                                            CONCAT12((byte)((ulong)
                                                  uVar28 >> 0x10) ^ (byte)((ulong)uVar24 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar28 >> 8) ^
                                                           (byte)((ulong)uVar24 >> 8),
                                                           (byte)uVar28 ^ (byte)uVar24)))))));
                puVar16[1] = CONCAT17((byte)((ulong)uVar31 >> 0x38) ^ (byte)((ulong)uVar27 >> 0x38),
                                      CONCAT16((byte)((ulong)uVar31 >> 0x30) ^
                                               (byte)((ulong)uVar27 >> 0x30),
                                               CONCAT15((byte)((ulong)uVar31 >> 0x28) ^
                                                        (byte)((ulong)uVar27 >> 0x28),
                                                        CONCAT14((byte)((ulong)uVar31 >> 0x20) ^
                                                                 (byte)((ulong)uVar27 >> 0x20),
                                                                 CONCAT13((byte)((ulong)uVar31 >>
                                                                                0x18) ^
                                                                          (byte)((ulong)uVar27 >>
                                                                                0x18),
                                                                          CONCAT12((byte)((ulong)
                                                  uVar31 >> 0x10) ^ (byte)((ulong)uVar27 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar31 >> 8) ^
                                                           (byte)((ulong)uVar27 >> 8),
                                                           (byte)uVar31 ^ (byte)uVar27)))))));
                *puVar16 = CONCAT17((byte)((ulong)uVar30 >> 0x38) ^ (byte)((ulong)uVar26 >> 0x38),
                                    CONCAT16((byte)((ulong)uVar30 >> 0x30) ^
                                             (byte)((ulong)uVar26 >> 0x30),
                                             CONCAT15((byte)((ulong)uVar30 >> 0x28) ^
                                                      (byte)((ulong)uVar26 >> 0x28),
                                                      CONCAT14((byte)((ulong)uVar30 >> 0x20) ^
                                                               (byte)((ulong)uVar26 >> 0x20),
                                                               CONCAT13((byte)((ulong)uVar30 >> 0x18
                                                                              ) ^ (byte)((ulong)
                                                  uVar26 >> 0x18),
                                                  CONCAT12((byte)((ulong)uVar30 >> 0x10) ^
                                                           (byte)((ulong)uVar26 >> 0x10),
                                                           CONCAT11((byte)((ulong)uVar30 >> 8) ^
                                                                    (byte)((ulong)uVar26 >> 8),
                                                                    (byte)uVar30 ^ (byte)uVar26)))))
                                            ));
                puVar16 = puVar16 + 4;
              } while (lVar13 != 0);
              lVar13 = lVar15;
              if (uVar20 == 0) goto LAB_00a7ec0c;
            }
            lVar14 = uVar23 - lVar13;
            pbVar17 = abStack_e9 + lVar13 + 1;
            pbVar19 = local_a8 + lVar13;
            do {
              lVar14 = lVar14 + -1;
              *pbVar17 = *pbVar17 ^ *pbVar19;
              pbVar17 = pbVar17 + 1;
              pbVar19 = pbVar19 + 1;
            } while (lVar14 != 0);
          }
LAB_00a7ec0c:
          abStack_e9[1] = abStack_e9[1] | 0x80;
          abStack_e9[__n_00] = abStack_e9[__n_00] | 1;
          pBVar8 = BN_bin2bn(abStack_e9 + 1,len,ret);
          if (pBVar8 == (BIGNUM *)0x0) goto LAB_00a7ee30;
          iVar3 = BN_check_prime(ret,ctx,param_8);
          if (0 < iVar3) goto LAB_00a7ec64;
          bVar2 = true;
          if (iVar3 != 0) goto LAB_00a7ee30;
        } while( true );
      }
      ret = (BIGNUM *)param_2[1];
      pBVar6 = (BIGNUM *)*param_2;
LAB_00a7e9bc:
      mont = BN_MONT_CTX_new();
      if ((mont == (BN_MONT_CTX *)0x0) || (iVar3 = BN_MONT_CTX_set(mont,pBVar6,ctx), iVar3 == 0)) {
LAB_00a7edf0:
        iVar3 = 0;
      }
      else {
        if (param_3 == 0) {
          if (((uVar21 >> 1 & 1) == 0) ||
             (iVar3 = ossl_ffc_params_validate_unverifiable_g
                                (ctx,mont,pBVar6,ret,param_2[2],pBVar7,param_7), iVar3 != 0))
          goto LAB_00a7ed38;
          goto LAB_00a7edf0;
        }
        pBVar8 = BN_value_one();
        iVar3 = BN_sub(r,pBVar6,pBVar8);
        if ((iVar3 == 0) ||
           ((iVar3 = BN_div(dv,(BIGNUM *)0x0,r,ret,ctx), iVar3 == 0 ||
            (iVar3 = FUN_00a7e5fc(ctx,mont,a,pBVar7,pBVar6,dv,r,&local_130), iVar3 == 0))))
        goto LAB_00a7edf0;
LAB_00a7ed38:
        iVar3 = BN_GENCB_call(param_8,3,1);
        if (iVar3 == 0) goto LAB_00a7edf0;
        if (param_3 != 0) {
          if (pBVar6 != (BIGNUM *)*param_2) {
            BN_free((BIGNUM *)*param_2);
            pBVar6 = BN_dup(pBVar6);
            *param_2 = (long)pBVar6;
          }
          if (ret != (BIGNUM *)param_2[1]) {
            BN_free((BIGNUM *)param_2[1]);
            pBVar6 = BN_dup(ret);
            param_2[1] = (long)pBVar6;
          }
          if (a != (BIGNUM *)param_2[2]) {
            BN_free((BIGNUM *)param_2[2]);
            a = BN_dup(a);
            param_2[2] = (long)a;
          }
          if ((((*param_2 == 0) || (param_2[1] == 0)) || (a == (BIGNUM *)0x0)) ||
             (iVar3 = ossl_ffc_params_set_validate_params(param_2,auStack_108,__n_00,local_12c),
             iVar3 == 0)) goto LAB_00a7edf0;
          *(undefined4 *)((long)param_2 + 0x3c) = local_130;
        }
LAB_00a7ede0:
        iVar3 = (uVar21 >> 1 & 1) + 1;
      }
    }
  }
LAB_00a7ee38:
  BN_CTX_end(ctx);
LAB_00a7e864:
  BN_CTX_free(ctx);
  BN_MONT_CTX_free(mont);
  EVP_MD_free(type);
  return iVar3;
LAB_00a7ec64:
  iVar3 = BN_GENCB_call(param_8,2,0);
  if ((iVar3 == 0) || (iVar3 = BN_GENCB_call(param_8,3,0), iVar3 == 0)) goto LAB_00a7ee30;
  iVar3 = iVar5;
  if ((param_3 == 0) && (iVar3 = (int)param_2[6], iVar5 < iVar3)) {
    uVar12 = 0x1000;
    goto LAB_00a7ecfc;
  }
  iVar4 = FUN_00a7e31c(ctx,type,iVar3,uVar11 / 0xa0,auStack_128,__n_00,ret,pBVar6,iVar22,param_8,
                       &local_12c,param_7);
  if (0 < iVar4) {
    iVar5 = BN_GENCB_call(param_8,2,1);
    if (iVar5 == 0) goto LAB_00a7ee30;
    if (param_3 == 0) {
      if (local_12c != iVar3) {
        uVar12 = 0x10000;
        goto LAB_00a7ecfc;
      }
      iVar3 = BN_cmp(pBVar6,(BIGNUM *)*param_2);
      if (iVar3 != 0) {
        uVar12 = 0x2000;
        goto LAB_00a7ecfc;
      }
    }
    mont = (BN_MONT_CTX *)0x0;
    if ((uVar21 & 3) != 1) goto LAB_00a7e9bc;
    goto LAB_00a7ede0;
  }
  iVar3 = 0;
  mont = (BN_MONT_CTX *)0x0;
  bVar2 = true;
  if (iVar4 == -1) goto LAB_00a7ee38;
  goto LAB_00a7eab8;
}

