/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a35814
 */

undefined8
ossl_ecdh_simple_compute_key(undefined8 *param_1,long *param_2,EC_POINT *param_3,EC_KEY *param_4)

{
  uint uVar1;
  undefined4 uVar2;
  long lVar3;
  long lVar4;
  uint uVar5;
  int iVar6;
  BN_CTX *ctx;
  BIGNUM *cofactor;
  BIGNUM *b;
  EC_GROUP *group;
  EC_POINT *r;
  undefined8 uVar7;
  void *__s;
  
  ctx = (BN_CTX *)BN_CTX_new_ex(*(undefined8 *)(param_4 + 0x58));
  if (ctx == (BN_CTX *)0x0) {
    uVar7 = 0;
    cofactor = (BIGNUM *)0x0;
    r = (EC_POINT *)0x0;
  }
  else {
    BN_CTX_start(ctx);
    cofactor = BN_CTX_get(ctx);
    if (cofactor == (BIGNUM *)0x0) {
      ERR_new();
      uVar7 = 0x42;
LAB_00a359e4:
      ERR_set_debug("crypto/ec/ecdh_ossl.c",uVar7,"ossl_ecdh_simple_compute_key");
      uVar7 = 0xc0100;
    }
    else {
      b = EC_KEY_get0_private_key(param_4);
      if (b != (BIGNUM *)0x0) {
        group = EC_KEY_get0_group(param_4);
        uVar5 = EC_KEY_get_flags(param_4);
        if (((uVar5 >> 0xc & 1) == 0) ||
           ((iVar6 = EC_GROUP_get_cofactor(group,cofactor,(BN_CTX *)0x0), iVar6 != 0 &&
            (iVar6 = BN_mul(cofactor,cofactor,b,ctx), b = cofactor, iVar6 != 0)))) {
          r = EC_POINT_new(group);
          if (r == (EC_POINT *)0x0) {
            ERR_new();
            ERR_set_debug("crypto/ec/ecdh_ossl.c",0x5c,"ossl_ecdh_simple_compute_key");
            uVar7 = 0xc0100;
          }
          else {
            iVar6 = EC_POINT_mul(group,r,(BIGNUM *)0x0,param_3,b,ctx);
            if (iVar6 == 0) {
              ERR_new();
              uVar7 = 0x61;
            }
            else {
              iVar6 = EC_POINT_get_affine_coordinates(group,r,cofactor,0,ctx);
              if (iVar6 != 0) {
                iVar6 = EC_GROUP_get_degree(group);
                uVar5 = iVar6 + 0xe;
                if (-1 < (int)(iVar6 + 7U)) {
                  uVar5 = iVar6 + 7U;
                }
                iVar6 = BN_num_bits(cofactor);
                uVar1 = iVar6 + 0xe;
                if (-1 < (int)(iVar6 + 7U)) {
                  uVar1 = iVar6 + 7U;
                }
                if ((uint)((int)uVar1 >> 3) <= (uint)((int)uVar5 >> 3)) {
                  lVar3 = (long)((ulong)uVar5 << 0x20) >> 0x23;
                  __s = CRYPTO_malloc((int)uVar5 >> 3,"crypto/ec/ecdh_ossl.c",0x79);
                  if (__s == (void *)0x0) {
                    ERR_new();
                    ERR_set_debug("crypto/ec/ecdh_ossl.c",0x7a,"ossl_ecdh_simple_compute_key");
                    uVar2 = 0xc0100;
                  }
                  else {
                    lVar4 = (long)((ulong)uVar1 << 0x20) >> 0x23;
                    memset(__s,0,lVar3 - lVar4);
                    uVar5 = BN_bn2bin(cofactor,(uchar *)((long)__s + (lVar3 - lVar4)));
                    if ((int)uVar1 >> 3 == uVar5) {
                      *param_1 = __s;
                      *param_2 = lVar3;
                      uVar7 = 1;
                      goto LAB_00a35a80;
                    }
                    ERR_new();
                    ERR_set_debug("crypto/ec/ecdh_ossl.c",0x80,"ossl_ecdh_simple_compute_key");
                    uVar2 = 0x80003;
                  }
                  ERR_set_error(0x10,uVar2,0);
                  uVar7 = 0;
                  goto LAB_00a35a84;
                }
                ERR_new();
                ERR_set_debug("crypto/ec/ecdh_ossl.c",0x76,"ossl_ecdh_simple_compute_key");
                uVar7 = 0xc0103;
                goto LAB_00a35a74;
              }
              ERR_new();
              uVar7 = 0x6b;
            }
            ERR_set_debug("crypto/ec/ecdh_ossl.c",uVar7,"ossl_ecdh_simple_compute_key");
            uVar7 = 0x9b;
          }
LAB_00a35a74:
          ERR_set_error(0x10,uVar7,0);
          uVar7 = 0;
          goto LAB_00a35a80;
        }
        ERR_new();
        uVar7 = 0x55;
        goto LAB_00a359e4;
      }
      ERR_new();
      ERR_set_debug("crypto/ec/ecdh_ossl.c",0x48,"ossl_ecdh_simple_compute_key");
      uVar7 = 0x7d;
    }
    ERR_set_error(0x10,uVar7,0);
    uVar7 = 0;
    r = (EC_POINT *)0x0;
  }
LAB_00a35a80:
  __s = (void *)0x0;
LAB_00a35a84:
  BN_clear(cofactor);
  EC_POINT_clear_free(r);
  BN_CTX_end(ctx);
  BN_CTX_free(ctx);
  CRYPTO_free(__s);
  return uVar7;
}

