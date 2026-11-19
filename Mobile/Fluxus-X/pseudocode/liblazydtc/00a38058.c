/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a38058
 */

bool ossl_ec_GFp_simple_set_compressed_coordinates
               (long *param_1,undefined8 param_2,BIGNUM *param_3,int param_4,BN_CTX *param_5)

{
  bool bVar1;
  int iVar2;
  uint uVar3;
  BIGNUM *pBVar4;
  BIGNUM *r;
  BIGNUM *r_00;
  BIGNUM *ret;
  ulong uVar5;
  undefined8 uVar6;
  code *pcVar7;
  BN_CTX *c;
  
  c = (BN_CTX *)0x0;
  if ((param_5 == (BN_CTX *)0x0) &&
     (c = (BN_CTX *)BN_CTX_new_ex(param_1[0x15]), param_5 = c, c == (BN_CTX *)0x0)) {
    return false;
  }
  BN_CTX_start(param_5);
  pBVar4 = BN_CTX_get(param_5);
  r = BN_CTX_get(param_5);
  r_00 = BN_CTX_get(param_5);
  ret = BN_CTX_get(param_5);
  if ((ret != (BIGNUM *)0x0) &&
     (iVar2 = BN_nnmod(r_00,param_3,(BIGNUM *)param_1[8],param_5), iVar2 != 0)) {
    if (*(long *)(*param_1 + 0x120) == 0) {
      iVar2 = (**(code **)(*param_1 + 0x100))(param_1,r,param_3,param_5);
      if (iVar2 != 0) {
        iVar2 = (**(code **)(*param_1 + 0xf8))(param_1,pBVar4,r,param_3,param_5);
        goto joined_r0x00a381d4;
      }
    }
    else {
      iVar2 = BN_mod_sqr(r,param_3,(BIGNUM *)param_1[8],param_5);
      if (iVar2 != 0) {
        iVar2 = BN_mod_mul(pBVar4,r,param_3,(BIGNUM *)param_1[8],param_5);
joined_r0x00a381d4:
        if (iVar2 != 0) {
          if ((int)param_1[0xe] == 0) {
            pcVar7 = *(code **)(*param_1 + 0x120);
            if (pcVar7 == (code *)0x0) {
              iVar2 = (**(code **)(*param_1 + 0xf8))(param_1,r,param_1[0xc],r_00,param_5);
            }
            else {
              iVar2 = (*pcVar7)(param_1,r,param_1[0xc],param_5);
              if (iVar2 == 0) goto LAB_00a38440;
              iVar2 = BN_mod_mul(r,r,r_00,(BIGNUM *)param_1[8],param_5);
            }
            if (iVar2 != 0) {
              iVar2 = BN_mod_add_quick(pBVar4,pBVar4,r,(BIGNUM *)param_1[8]);
              goto joined_r0x00a38254;
            }
          }
          else {
            iVar2 = BN_mod_lshift1_quick(r,r_00,(BIGNUM *)param_1[8]);
            if ((iVar2 != 0) &&
               (iVar2 = BN_mod_add_quick(r,r,r_00,(BIGNUM *)param_1[8]), iVar2 != 0)) {
              iVar2 = BN_mod_sub_quick(pBVar4,pBVar4,r,(BIGNUM *)param_1[8]);
joined_r0x00a38254:
              if (iVar2 != 0) {
                if (*(code **)(*param_1 + 0x120) == (code *)0x0) {
                  iVar2 = BN_mod_add_quick(pBVar4,pBVar4,(BIGNUM *)param_1[0xd],(BIGNUM *)param_1[8]
                                          );
                }
                else {
                  iVar2 = (**(code **)(*param_1 + 0x120))(param_1,r,(BIGNUM *)param_1[0xd],param_5);
                  if (iVar2 == 0) goto LAB_00a38440;
                  iVar2 = BN_mod_add_quick(pBVar4,pBVar4,r,(BIGNUM *)param_1[8]);
                }
                if (iVar2 != 0) {
                  ERR_set_mark();
                  pBVar4 = BN_mod_sqrt(ret,pBVar4,(BIGNUM *)param_1[8],param_5);
                  if (pBVar4 == (BIGNUM *)0x0) {
                    uVar5 = ERR_peek_last_error();
                    if (((uVar5 & 0xff800000) == 0x1800000) &&
                       ((((int)(uint)uVar5 >> 0x1f & 0x7f800000U | 0x7fffff) & (uint)uVar5) == 0x6f)
                       ) {
                      iVar2 = ERR_pop_to_mark();
                      ERR_new(iVar2);
                      uVar6 = 0x70;
LAB_00a3842c:
                      ERR_set_debug("crypto/ec/ecp_oct.c",uVar6,
                                    "ossl_ec_GFp_simple_set_compressed_coordinates");
                      uVar6 = 0x6e;
                    }
                    else {
                      ERR_clear_last_mark();
                      ERR_new();
                      ERR_set_debug("crypto/ec/ecp_oct.c",0x75,
                                    "ossl_ec_GFp_simple_set_compressed_coordinates");
                      uVar6 = 0x80003;
                    }
                  }
                  else {
                    ERR_clear_last_mark();
                    uVar3 = BN_is_odd(ret);
                    if (uVar3 != (param_4 != 0)) {
                      iVar2 = BN_is_zero(ret);
                      if (iVar2 != 0) {
                        iVar2 = BN_kronecker(r_00,(BIGNUM *)param_1[8],param_5);
                        bVar1 = false;
                        if (iVar2 == -2) goto LAB_00a38444;
                        ERR_new();
                        if (iVar2 != 1) {
                          uVar6 = 0x89;
                          goto LAB_00a3842c;
                        }
                        ERR_set_debug("crypto/ec/ecp_oct.c",0x84,
                                      "ossl_ec_GFp_simple_set_compressed_coordinates");
                        uVar6 = 0x6d;
                        goto LAB_00a38438;
                      }
                      iVar2 = BN_usub(ret,(BIGNUM *)param_1[8],ret);
                      if (iVar2 == 0) goto LAB_00a38440;
                    }
                    uVar3 = BN_is_odd(ret);
                    if (uVar3 == (param_4 != 0)) {
                      iVar2 = EC_POINT_set_affine_coordinates(param_1,param_2,r_00,ret,param_5);
                      bVar1 = iVar2 != 0;
                      goto LAB_00a38444;
                    }
                    ERR_new();
                    ERR_set_debug("crypto/ec/ecp_oct.c",0x90,
                                  "ossl_ec_GFp_simple_set_compressed_coordinates");
                    uVar6 = 0xc0103;
                  }
LAB_00a38438:
                  ERR_set_error(0x10,uVar6,0);
                }
              }
            }
          }
        }
      }
    }
  }
LAB_00a38440:
  bVar1 = false;
LAB_00a38444:
  BN_CTX_end(param_5);
  BN_CTX_free(c);
  return bVar1;
}

