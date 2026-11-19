/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a20c1c
 */

DSA_SIG * ossl_dsa_do_sign_int(uchar *param_1,int param_2,long param_3)

{
  bool bVar1;
  int iVar2;
  int iVar3;
  DSA_SIG *a;
  BIGNUM *pBVar4;
  BN_CTX *ctx;
  BIGNUM *a_00;
  BIGNUM *r;
  BIGNUM *r_00;
  BIGNUM *pBVar5;
  BIGNUM *pBVar6;
  undefined4 uVar7;
  uint uVar8;
  BIGNUM *local_68;
  
  local_68 = (BIGNUM *)0x0;
  if (((*(long *)(param_3 + 8) == 0) || (*(long *)(param_3 + 0x10) == 0)) ||
     (*(long *)(param_3 + 0x18) == 0)) {
    ctx = (BN_CTX *)0x0;
    a = (DSA_SIG *)0x0;
    uVar7 = 0x65;
  }
  else if (*(long *)(param_3 + 0x70) == 0) {
    ctx = (BN_CTX *)0x0;
    a = (DSA_SIG *)0x0;
    uVar7 = 0x6f;
  }
  else {
    uVar7 = 0x80003;
    a = DSA_SIG_new();
    if (a != (DSA_SIG *)0x0) {
      pBVar4 = BN_new();
      a->r = pBVar4;
      pBVar4 = BN_new();
      a->s = pBVar4;
      if ((pBVar4 != (BIGNUM *)0x0) && (a->r != (BIGNUM *)0x0)) {
        ctx = (BN_CTX *)BN_CTX_new_ex(*(undefined8 *)(param_3 + 0xb8));
        if (ctx != (BN_CTX *)0x0) {
          pBVar4 = BN_CTX_get(ctx);
          a_00 = BN_CTX_get(ctx);
          r = BN_CTX_get(ctx);
          r_00 = BN_CTX_get(ctx);
          if (r_00 != (BIGNUM *)0x0) {
            uVar8 = 0;
            do {
              iVar2 = FUN_00a20f4c(param_3,ctx,&local_68,a,param_1,param_2);
              if (iVar2 == 0) goto LAB_00a20ec4;
              iVar3 = BN_num_bits(*(BIGNUM **)(param_3 + 0x10));
              iVar2 = iVar3 + 0xe;
              if (-1 < iVar3 + 7) {
                iVar2 = iVar3 + 7;
              }
              if (iVar2 >> 3 < param_2) {
                iVar2 = BN_num_bits(*(BIGNUM **)(param_3 + 0x10));
                param_2 = iVar2 + 0xe;
                if (-1 < iVar2 + 7) {
                  param_2 = iVar2 + 7;
                }
                param_2 = param_2 >> 3;
              }
              pBVar5 = BN_bin2bn(param_1,param_2,pBVar4);
              if (pBVar5 == (BIGNUM *)0x0) goto LAB_00a20ec4;
              do {
                iVar2 = BN_num_bits(*(BIGNUM **)(param_3 + 0x10));
                iVar2 = BN_priv_rand_ex(a_00,iVar2 + -1,0xffffffff,0,0,ctx);
                if (iVar2 == 0) goto LAB_00a20ec4;
                iVar2 = BN_is_zero(a_00);
              } while (iVar2 != 0);
              BN_set_flags(a_00,4);
              BN_set_flags(r,4);
              BN_set_flags(r_00,4);
              iVar2 = BN_mod_mul(r_00,a_00,*(BIGNUM **)(param_3 + 0x70),*(BIGNUM **)(param_3 + 0x10)
                                 ,ctx);
              if (iVar2 == 0) goto LAB_00a20ec4;
              iVar2 = BN_mod_mul(r_00,r_00,a->r,*(BIGNUM **)(param_3 + 0x10),ctx);
              if (iVar2 == 0) goto LAB_00a20ec4;
              iVar2 = BN_mod_mul(r,a_00,pBVar4,*(BIGNUM **)(param_3 + 0x10),ctx);
              if (iVar2 == 0) goto LAB_00a20ec4;
              iVar2 = BN_mod_add_quick(a->s,r_00,r,*(BIGNUM **)(param_3 + 0x10));
              pBVar5 = local_68;
              if (iVar2 == 0) goto LAB_00a20ec4;
              iVar2 = BN_mod_mul(a->s,a->s,local_68,*(BIGNUM **)(param_3 + 0x10),ctx);
              if ((iVar2 == 0) ||
                 (pBVar6 = BN_mod_inverse(a_00,a_00,*(BIGNUM **)(param_3 + 0x10),ctx),
                 pBVar6 == (BIGNUM *)0x0)) goto LAB_00a20ec4;
              iVar2 = BN_mod_mul(a->s,a->s,a_00,*(BIGNUM **)(param_3 + 0x10),ctx);
              if (iVar2 == 0) goto LAB_00a20ec4;
              iVar2 = BN_is_zero(a->r);
              if ((iVar2 == 0) && (iVar2 = BN_is_zero(a->s), iVar2 == 0)) goto LAB_00a20f00;
              bVar1 = uVar8 < 9;
              uVar8 = uVar8 + 1;
            } while (bVar1);
            uVar7 = 0x74;
          }
        }
        goto LAB_00a20ec4;
      }
    }
    ctx = (BN_CTX *)0x0;
  }
LAB_00a20ec4:
  ERR_new();
  ERR_set_debug("crypto/dsa/dsa_ossl.c",0xbd,"ossl_dsa_do_sign_int");
  ERR_set_error(10,uVar7,0);
  DSA_SIG_free(a);
  a = (DSA_SIG *)0x0;
  pBVar5 = local_68;
LAB_00a20f00:
  BN_CTX_free(ctx);
  BN_clear_free(pBVar5);
  return a;
}

