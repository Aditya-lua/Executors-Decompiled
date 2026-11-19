/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a38d64
 */

/* WARNING: Type propagation algorithm not settling */

BIGNUM * BN_mod_sqrt(BIGNUM *ret,BIGNUM *a,BIGNUM *n,BN_CTX *ctx)

{
  code *pcVar1;
  bool bVar2;
  int iVar3;
  BIGNUM *pBVar4;
  BIGNUM *r;
  BIGNUM *pBVar5;
  BIGNUM *pBVar6;
  BIGNUM *r_00;
  BIGNUM *r_01;
  BIGNUM *r_02;
  BIGNUM *pBVar7;
  undefined8 uVar8;
  uint uVar9;
  ulong w;
  uint n_00;
  uint local_74;
  
  iVar3 = BN_is_odd(n);
  pBVar4 = ret;
  if ((iVar3 == 0) || (iVar3 = BN_abs_is_word(n,1), iVar3 != 0)) {
    iVar3 = BN_abs_is_word(n,2);
    if (iVar3 == 0) {
      ERR_new();
      ERR_set_debug("crypto/bn/bn_sqrt.c",0x2b,"BN_mod_sqrt");
      ERR_set_error(3,0x70,0);
      return (BIGNUM *)0x0;
    }
    if ((ret != (BIGNUM *)0x0) || (pBVar4 = BN_new(), pBVar4 != (BIGNUM *)0x0)) {
      iVar3 = BN_is_bit_set(a,0);
LAB_00a38e48:
      iVar3 = BN_set_word(pBVar4,(long)iVar3);
      if (iVar3 != 0) {
        return pBVar4;
      }
      if (pBVar4 != ret) {
        BN_free(pBVar4);
      }
      return (BIGNUM *)0x0;
    }
LAB_00a38e90:
    pBVar4 = (BIGNUM *)0x0;
    bVar2 = false;
  }
  else {
    iVar3 = BN_is_zero(a);
    if ((iVar3 != 0) || (iVar3 = BN_is_one(a), iVar3 != 0)) {
      if ((ret != (BIGNUM *)0x0) || (pBVar4 = BN_new(), pBVar4 != (BIGNUM *)0x0)) {
        iVar3 = BN_is_one(a);
        goto LAB_00a38e48;
      }
      goto LAB_00a38e90;
    }
    BN_CTX_start(ctx);
    r = BN_CTX_get(ctx);
    pBVar5 = BN_CTX_get(ctx);
    pBVar6 = BN_CTX_get(ctx);
    r_00 = BN_CTX_get(ctx);
    r_01 = BN_CTX_get(ctx);
    r_02 = BN_CTX_get(ctx);
    if (r_02 == (BIGNUM *)0x0) {
      pBVar4 = (BIGNUM *)0x0;
      goto LAB_00a38eb4;
    }
    if (((ret == (BIGNUM *)0x0) && (pBVar4 = BN_new(), pBVar4 == (BIGNUM *)0x0)) ||
       (iVar3 = BN_nnmod(r,a,n,ctx), iVar3 == 0)) {
LAB_00a39238:
      bVar2 = true;
    }
    else {
      n_00 = 0;
      do {
        n_00 = n_00 + 1;
        iVar3 = BN_is_bit_set(n,n_00);
      } while (iVar3 == 0);
      if ((n_00 & 0x7fffffff) == 2) {
        iVar3 = BN_mod_lshift1_quick(r_00,r,n);
        if ((iVar3 != 0) && (iVar3 = BN_rshift(pBVar6,n,3), iVar3 != 0)) {
          pBVar6->neg = 0;
          iVar3 = BN_mod_exp(pBVar5,r_00,pBVar6,n,ctx);
          if ((iVar3 != 0) &&
             ((iVar3 = BN_mod_sqr(r_02,pBVar5,n,ctx), iVar3 != 0 &&
              (iVar3 = BN_mod_mul(r_00,r_00,r_02,n,ctx), iVar3 != 0)))) {
            bVar2 = true;
            iVar3 = BN_sub_word(r_00,1);
            if (iVar3 == 0) goto joined_r0x00a38e9c;
            iVar3 = BN_mod_mul(r_01,r,pBVar5,n,ctx);
            if ((iVar3 != 0) && (iVar3 = BN_mod_mul(r_01,r_01,r_00,n,ctx), iVar3 != 0)) {
              pBVar5 = BN_copy(pBVar4,r_01);
joined_r0x00a390f8:
              if (pBVar5 != (BIGNUM *)0x0) goto LAB_00a38fc0;
            }
          }
        }
        goto LAB_00a39238;
      }
      if ((n_00 & 0x7fffffff) != 1) {
        pBVar7 = BN_copy(pBVar6,n);
        if (pBVar7 != (BIGNUM *)0x0) {
          w = 2;
          pBVar6->neg = 0;
          do {
            if (w < 0x16) {
LAB_00a39198:
              iVar3 = BN_set_word(r_02,w);
              if (iVar3 == 0) goto LAB_00a39238;
            }
            else {
              iVar3 = BN_num_bits(n);
              iVar3 = BN_priv_rand_ex(r_02,iVar3,0,0,0,ctx);
              if (iVar3 == 0) goto LAB_00a39238;
              iVar3 = BN_ucmp(r_02,n);
              if (-1 < iVar3) {
                pcVar1 = BN_sub;
                if (n->neg != 0) {
                  pcVar1 = BN_add;
                }
                iVar3 = (*pcVar1)(r_02,r_02,n);
                if (iVar3 == 0) goto LAB_00a39238;
              }
              iVar3 = BN_is_zero(r_02);
              if (iVar3 != 0) goto LAB_00a39198;
            }
            iVar3 = BN_kronecker(r_02,pBVar6,ctx);
            if (iVar3 < -1) goto LAB_00a39238;
            if (iVar3 != 1) {
              if (iVar3 == -1) {
                iVar3 = BN_rshift(pBVar6,pBVar6,n_00);
                if ((iVar3 == 0) || (iVar3 = BN_mod_exp(r_02,r_02,pBVar6,n,ctx), iVar3 == 0))
                goto LAB_00a39238;
                iVar3 = BN_is_one(r_02);
                if (iVar3 == 0) {
                  iVar3 = BN_rshift1(r_00,pBVar6);
                  if (iVar3 == 0) goto LAB_00a39238;
                  iVar3 = BN_is_zero(r_00);
                  if (iVar3 == 0) {
                    iVar3 = BN_mod_exp(r_01,r,r_00,n,ctx);
                    if (iVar3 == 0) goto LAB_00a39238;
                    iVar3 = BN_is_zero(r_01);
                    if (iVar3 != 0) goto LAB_00a39320;
                  }
                  else {
                    iVar3 = BN_nnmod(r_00,r,n,ctx);
                    if (iVar3 == 0) goto LAB_00a39238;
                    iVar3 = BN_is_zero(r_00);
                    if (iVar3 != 0) {
LAB_00a39320:
                      BN_zero_ex(pBVar4);
                      goto LAB_00a38eb4;
                    }
                    bVar2 = true;
                    iVar3 = BN_set_word(r_01,1);
                    if (iVar3 == 0) goto joined_r0x00a38e9c;
                  }
                  iVar3 = BN_mod_sqr(pBVar5,r_01,n,ctx);
                  if (((iVar3 == 0) || (iVar3 = BN_mod_mul(pBVar5,pBVar5,r,n,ctx), iVar3 == 0)) ||
                     (iVar3 = BN_mod_mul(r_01,r_01,r,n,ctx), iVar3 == 0)) goto LAB_00a39238;
                  goto LAB_00a39378;
                }
                ERR_new();
                uVar8 = 0xe6;
              }
              else {
                if (iVar3 != 0) break;
                ERR_new();
                uVar8 = 0xcb;
              }
              ERR_set_debug("crypto/bn/bn_sqrt.c",uVar8,"BN_mod_sqrt");
              uVar8 = 0x70;
              goto LAB_00a39230;
            }
            w = w + 1;
          } while (w < 0x52);
          ERR_new();
          ERR_set_debug("crypto/bn/bn_sqrt.c",0xd7,"BN_mod_sqrt");
          uVar8 = 0x71;
LAB_00a39230:
          ERR_set_error(3,uVar8,0);
        }
        goto LAB_00a39238;
      }
      iVar3 = BN_rshift(pBVar6,n,2);
      if (iVar3 == 0) goto LAB_00a39238;
      pBVar6->neg = 0;
      bVar2 = true;
      iVar3 = BN_add_word(pBVar6,1);
      if (iVar3 != 0) {
        iVar3 = BN_mod_exp(pBVar4,r,pBVar6,n,ctx);
        if (iVar3 != 0) {
LAB_00a38fc0:
          iVar3 = BN_mod_sqr(r_01,pBVar4,n,ctx);
          if (iVar3 != 0) {
            iVar3 = BN_cmp(r_01,r);
            if (iVar3 == 0) goto LAB_00a38eb4;
            ERR_new();
            uVar8 = 0x161;
LAB_00a39004:
            ERR_set_debug("crypto/bn/bn_sqrt.c",uVar8,"BN_mod_sqrt");
            uVar8 = 0x6f;
            goto LAB_00a39230;
          }
        }
        goto LAB_00a39238;
      }
    }
  }
joined_r0x00a38e9c:
  if (pBVar4 != ret) {
    BN_clear_free(pBVar4);
  }
  pBVar4 = (BIGNUM *)0x0;
  if (!bVar2) {
    return (BIGNUM *)0x0;
  }
LAB_00a38eb4:
  BN_CTX_end(ctx);
  return pBVar4;
  while( true ) {
    local_74 = 1;
    uVar9 = n_00;
    while( true ) {
      if (local_74 == 1) {
        iVar3 = BN_mod_sqr(r_00,pBVar5,n,ctx);
      }
      else {
        iVar3 = BN_mod_mul(r_00,r_00,r_00,n,ctx);
      }
      if (iVar3 == 0) goto LAB_00a39238;
      iVar3 = BN_is_one(r_00);
      if (iVar3 != 0) break;
      uVar9 = uVar9 - 1;
      local_74 = local_74 + 1;
      if (n_00 <= local_74) goto LAB_00a3949c;
    }
    pBVar6 = BN_copy(r_00,r_02);
    if (pBVar6 == (BIGNUM *)0x0) goto LAB_00a39238;
    while (uVar9 = uVar9 - 1, 1 < (int)uVar9) {
      iVar3 = BN_mod_sqr(r_00,r_00,n,ctx);
      bVar2 = true;
      if (iVar3 == 0) goto joined_r0x00a38e9c;
    }
    iVar3 = BN_mod_mul(r_02,r_00,r_00,n,ctx);
    if ((iVar3 == 0) || (iVar3 = BN_mod_mul(r_01,r_01,r_00,n,ctx), iVar3 == 0)) goto LAB_00a39238;
    iVar3 = BN_mod_mul(pBVar5,pBVar5,r_02,n,ctx);
    bVar2 = true;
    n_00 = local_74;
    if (iVar3 == 0) break;
LAB_00a39378:
    iVar3 = BN_is_one(pBVar5);
    if (iVar3 != 0) {
      pBVar5 = BN_copy(pBVar4,r_01);
      goto joined_r0x00a390f8;
    }
    if (n_00 < 2) {
LAB_00a3949c:
      ERR_new();
      uVar8 = 0x142;
      goto LAB_00a39004;
    }
  }
  goto joined_r0x00a38e9c;
}

