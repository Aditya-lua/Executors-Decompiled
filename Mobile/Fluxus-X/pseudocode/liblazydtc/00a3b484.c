/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a3b484
 */

bool ossl_ec_GFp_simple_field_inv(long *param_1,BIGNUM *param_2,undefined8 param_3,BN_CTX *param_4)

{
  bool bVar1;
  int iVar2;
  BIGNUM *pBVar3;
  BIGNUM *pBVar4;
  BN_CTX *c;
  
  c = (BN_CTX *)0x0;
  if ((param_4 == (BN_CTX *)0x0) &&
     (param_4 = (BN_CTX *)BN_CTX_secure_new_ex(param_1[0x15]), c = param_4, param_4 == (BN_CTX *)0x0
     )) {
    return false;
  }
  BN_CTX_start(param_4);
  pBVar3 = BN_CTX_get(param_4);
  if (pBVar3 != (BIGNUM *)0x0) {
    do {
      iVar2 = BN_priv_rand_range_ex(pBVar3,param_1[8],0,param_4);
      if (iVar2 == 0) goto LAB_00a3b59c;
      iVar2 = BN_is_zero(pBVar3);
    } while (iVar2 != 0);
    iVar2 = (**(code **)(*param_1 + 0xf8))(param_1,param_2,param_3,pBVar3,param_4);
    if (iVar2 != 0) {
      pBVar4 = BN_mod_inverse(param_2,param_2,(BIGNUM *)param_1[8],param_4);
      if (pBVar4 != (BIGNUM *)0x0) {
        iVar2 = (**(code **)(*param_1 + 0xf8))(param_1,param_2,param_2,pBVar3,param_4);
        bVar1 = iVar2 != 0;
        goto LAB_00a3b5a0;
      }
      ERR_new();
      ERR_set_debug("crypto/ec/ecp_smpl.c",0x580,"ossl_ec_GFp_simple_field_inv");
      ERR_set_error(0x10,0xa5,0);
    }
  }
LAB_00a3b59c:
  bVar1 = false;
LAB_00a3b5a0:
  BN_CTX_end(param_4);
  BN_CTX_free(c);
  return bVar1;
}

