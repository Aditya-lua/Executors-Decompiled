/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a37f78
 */

bool ossl_ec_GFp_nist_field_sqr(long param_1,BIGNUM *param_2,BIGNUM *param_3,BN_CTX *param_4)

{
  bool bVar1;
  int iVar2;
  BN_CTX *c;
  
  if (((param_1 == 0) || (param_2 == (BIGNUM *)0x0)) || (param_3 == (BIGNUM *)0x0)) {
    ERR_new();
    ERR_set_debug("crypto/ec/ecp_nist.c",0xa0,"ossl_ec_GFp_nist_field_sqr");
    ERR_set_error(0x10,0x86,0);
    bVar1 = false;
    c = (BN_CTX *)0x0;
  }
  else {
    c = (BN_CTX *)0x0;
    if (((param_4 == (BN_CTX *)0x0) &&
        (c = (BN_CTX *)BN_CTX_new_ex(*(undefined8 *)(param_1 + 0xa8)), param_4 = c,
        c == (BN_CTX *)0x0)) || (iVar2 = BN_sqr(param_2,param_3,param_4), iVar2 == 0)) {
      bVar1 = false;
    }
    else {
      iVar2 = (**(code **)(param_1 + 0x88))(param_2,param_2,*(undefined8 *)(param_1 + 0x40),param_4)
      ;
      bVar1 = iVar2 != 0;
    }
  }
  BN_CTX_free(c);
  return bVar1;
}

