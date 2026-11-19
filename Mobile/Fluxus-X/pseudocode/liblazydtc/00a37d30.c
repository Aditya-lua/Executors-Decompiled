/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a37d30
 */

undefined4
ossl_ec_GFp_nist_group_set_curve
          (long param_1,BIGNUM *param_2,undefined8 param_3,undefined8 param_4,BN_CTX *param_5)

{
  int iVar1;
  undefined4 uVar2;
  BIGNUM *pBVar3;
  code *pcVar4;
  BN_CTX *c;
  
  c = (BN_CTX *)0x0;
  if ((param_5 == (BN_CTX *)0x0) &&
     (param_5 = (BN_CTX *)BN_CTX_new_ex(*(undefined8 *)(param_1 + 0xa8)), c = param_5,
     param_5 == (BN_CTX *)0x0)) {
    return 0;
  }
  BN_CTX_start(param_5);
  pBVar3 = BN_get0_nist_prime_192();
  iVar1 = BN_ucmp(pBVar3,param_2);
  if (iVar1 == 0) {
    pcVar4 = BN_nist_mod_192;
  }
  else {
    pBVar3 = BN_get0_nist_prime_224();
    iVar1 = BN_ucmp(pBVar3,param_2);
    if (iVar1 == 0) {
      pcVar4 = BN_nist_mod_224;
    }
    else {
      pBVar3 = BN_get0_nist_prime_256();
      iVar1 = BN_ucmp(pBVar3,param_2);
      if (iVar1 == 0) {
        pcVar4 = BN_nist_mod_256;
      }
      else {
        pBVar3 = BN_get0_nist_prime_384();
        iVar1 = BN_ucmp(pBVar3,param_2);
        if (iVar1 == 0) {
          pcVar4 = BN_nist_mod_384;
        }
        else {
          pBVar3 = BN_get0_nist_prime_521();
          iVar1 = BN_ucmp(pBVar3,param_2);
          if (iVar1 != 0) {
            ERR_new();
            ERR_set_debug("crypto/ec/ecp_nist.c",0x74,"ossl_ec_GFp_nist_group_set_curve");
            ERR_set_error(0x10,0x87,0);
            uVar2 = 0;
            goto LAB_00a37e60;
          }
          pcVar4 = BN_nist_mod_521;
        }
      }
    }
  }
  *(code **)(param_1 + 0x88) = pcVar4;
  uVar2 = ossl_ec_GFp_simple_group_set_curve(param_1,param_2,param_3,param_4,param_5);
LAB_00a37e60:
  BN_CTX_end(param_5);
  BN_CTX_free(c);
  return uVar2;
}

