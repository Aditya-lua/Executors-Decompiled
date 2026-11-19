/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a39604
 */

undefined8
ossl_ec_GFp_simple_group_set_curve
          (long *param_1,BIGNUM *param_2,BIGNUM *param_3,BIGNUM *param_4,BN_CTX *param_5)

{
  int iVar1;
  BIGNUM *r;
  BIGNUM *pBVar2;
  BN_CTX *c;
  undefined8 uVar3;
  
  iVar1 = BN_num_bits(param_2);
  if ((iVar1 < 3) || (iVar1 = BN_is_odd(param_2), iVar1 == 0)) {
    ERR_new();
    ERR_set_debug("crypto/ec/ecp_smpl.c",0x97,"ossl_ec_GFp_simple_group_set_curve");
    ERR_set_error(0x10,0x67,0);
    return 0;
  }
  c = (BN_CTX *)0x0;
  if ((param_5 == (BN_CTX *)0x0) &&
     (param_5 = (BN_CTX *)BN_CTX_new_ex(param_1[0x15]), c = param_5, param_5 == (BN_CTX *)0x0)) {
    return 0;
  }
  BN_CTX_start(param_5);
  r = BN_CTX_get(param_5);
  if ((r != (BIGNUM *)0x0) &&
     (pBVar2 = BN_copy((BIGNUM *)param_1[8],param_2), pBVar2 != (BIGNUM *)0x0)) {
    BN_set_negative((BIGNUM *)param_1[8],0);
    iVar1 = BN_nnmod(r,param_3,param_2,param_5);
    if (iVar1 != 0) {
      if (*(code **)(*param_1 + 0x118) == (code *)0x0) {
        pBVar2 = BN_copy((BIGNUM *)param_1[0xc],r);
        if (pBVar2 != (BIGNUM *)0x0) goto LAB_00a39720;
      }
      else {
        iVar1 = (**(code **)(*param_1 + 0x118))(param_1,(BIGNUM *)param_1[0xc],r,param_5);
        if (iVar1 != 0) {
LAB_00a39720:
          iVar1 = BN_nnmod((BIGNUM *)param_1[0xd],param_4,param_2,param_5);
          if ((iVar1 != 0) &&
             (((*(code **)(*param_1 + 0x118) == (code *)0x0 ||
               (iVar1 = (**(code **)(*param_1 + 0x118))(param_1,param_1[0xd],param_1[0xd],param_5),
               iVar1 != 0)) && (iVar1 = BN_add_word(r,3), iVar1 != 0)))) {
            iVar1 = BN_cmp(r,(BIGNUM *)param_1[8]);
            *(uint *)(param_1 + 0xe) = (uint)(iVar1 == 0);
            uVar3 = 1;
            goto LAB_00a39790;
          }
        }
      }
    }
  }
  uVar3 = 0;
LAB_00a39790:
  BN_CTX_end(param_5);
  BN_CTX_free(c);
  return uVar3;
}

