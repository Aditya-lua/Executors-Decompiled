/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1e34c
 */

undefined4 ossl_dh_compute_key(undefined8 param_1,undefined8 param_2,long param_3)

{
  int iVar1;
  int iVar2;
  undefined4 uVar3;
  BIGNUM *a;
  BIGNUM *pBVar4;
  undefined8 uVar5;
  long lVar6;
  BN_CTX *ctx;
  BIGNUM *a_00;
  BN_MONT_CTX *pBVar7;
  
  iVar1 = BN_num_bits(*(BIGNUM **)(param_3 + 8));
  if (iVar1 < 0x2711) {
    if ((*(BIGNUM **)(param_3 + 0x10) != (BIGNUM *)0x0) &&
       (iVar1 = BN_num_bits(*(BIGNUM **)(param_3 + 0x10)), 10000 < iVar1)) {
      ERR_new();
      ERR_set_debug("crypto/dh/dh_key.c",0x36,"ossl_dh_compute_key");
      uVar5 = 0x82;
      goto LAB_00a1e3ec;
    }
    iVar1 = BN_num_bits(*(BIGNUM **)(param_3 + 8));
    if (iVar1 < 0x200) {
      ERR_new();
      ERR_set_debug("crypto/dh/dh_key.c",0x3b,"ossl_dh_compute_key");
      ERR_set_error(5,0x7e,0);
      return 0;
    }
    ctx = (BN_CTX *)BN_CTX_new_ex(*(undefined8 *)(param_3 + 0xb0));
    if (ctx == (BN_CTX *)0x0) goto LAB_00a1e3f8;
    BN_CTX_start(ctx);
    a = BN_CTX_get(ctx);
    a_00 = BN_CTX_get(ctx);
    if (a_00 != (BIGNUM *)0x0) {
      lVar6 = *(long *)(param_3 + 0x78);
      if (lVar6 == 0) {
        ERR_new();
        ERR_set_debug("crypto/dh/dh_key.c",0x49,"ossl_dh_compute_key");
        uVar5 = 100;
      }
      else {
        if ((*(byte *)(param_3 + 0x80) & 1) == 0) {
          pBVar7 = (BN_MONT_CTX *)0x0;
        }
        else {
          pBVar7 = BN_MONT_CTX_set_locked
                             ((BN_MONT_CTX **)(param_3 + 0x88),(int)*(undefined8 *)(param_3 + 0xc0),
                              *(BIGNUM **)(param_3 + 8),ctx);
          BN_set_flags(*(undefined8 *)(param_3 + 0x78),4);
          if (pBVar7 == (BN_MONT_CTX *)0x0) goto LAB_00a1e3fc;
          lVar6 = *(long *)(param_3 + 0x78);
        }
        iVar1 = (**(code **)(*(long *)(param_3 + 0xb8) + 0x18))
                          (param_3,a_00,param_2,lVar6,*(undefined8 *)(param_3 + 8),ctx,pBVar7);
        if (iVar1 == 0) {
          ERR_new();
          ERR_set_debug("crypto/dh/dh_key.c",0x58,"ossl_dh_compute_key");
          uVar5 = 0x80003;
        }
        else {
          pBVar4 = BN_copy(a,*(BIGNUM **)(param_3 + 8));
          if ((pBVar4 != (BIGNUM *)0x0) && (iVar1 = BN_sub_word(a,1), iVar1 != 0)) {
            pBVar4 = BN_value_one();
            iVar1 = BN_cmp(a_00,pBVar4);
            if ((0 < iVar1) && (iVar1 = BN_cmp(a_00,a), iVar1 != 0)) {
              iVar2 = BN_num_bits(*(BIGNUM **)(param_3 + 8));
              iVar1 = iVar2 + 0xe;
              if (-1 < iVar2 + 7) {
                iVar1 = iVar2 + 7;
              }
              uVar3 = BN_bn2binpad(a_00,param_1,iVar1 >> 3);
              goto LAB_00a1e400;
            }
          }
          ERR_new();
          ERR_set_debug("crypto/dh/dh_key.c",0x61,"ossl_dh_compute_key");
          uVar5 = 0x80;
        }
      }
      ERR_set_error(5,uVar5,0);
    }
  }
  else {
    ERR_new();
    ERR_set_debug("crypto/dh/dh_key.c",0x30,"ossl_dh_compute_key");
    uVar5 = 0x67;
LAB_00a1e3ec:
    ERR_set_error(5,uVar5,0);
    ctx = (BN_CTX *)0x0;
LAB_00a1e3f8:
    a_00 = (BIGNUM *)0x0;
  }
LAB_00a1e3fc:
  uVar3 = 0xffffffff;
LAB_00a1e400:
  BN_clear(a_00);
  BN_CTX_end(ctx);
  BN_CTX_free(ctx);
  return uVar3;
}

