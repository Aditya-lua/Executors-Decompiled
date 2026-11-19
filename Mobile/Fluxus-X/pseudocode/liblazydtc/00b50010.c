/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b50010
 */

undefined8 ossl_sm2_key_private_check(EC_KEY *param_1)

{
  int iVar1;
  EC_GROUP *pEVar2;
  BIGNUM *a;
  BIGNUM *pBVar3;
  BIGNUM *b;
  undefined8 uVar4;
  
  if ((((param_1 == (EC_KEY *)0x0) ||
       (pEVar2 = EC_KEY_get0_group(param_1), pEVar2 == (EC_GROUP *)0x0)) ||
      (a = EC_KEY_get0_private_key(param_1), a == (BIGNUM *)0x0)) ||
     (pBVar3 = (BIGNUM *)EC_GROUP_get0_order(pEVar2), pBVar3 == (BIGNUM *)0x0)) {
    ERR_new();
    ERR_set_debug("crypto/sm2/sm2_key.c",0x21,"ossl_sm2_key_private_check");
    ERR_set_error(0x35,0xc0102,0);
    return 0;
  }
  pBVar3 = BN_dup(pBVar3);
  if ((pBVar3 != (BIGNUM *)0x0) && (iVar1 = BN_sub_word(pBVar3,1), iVar1 != 0)) {
    b = BN_value_one();
    iVar1 = BN_cmp(a,b);
    if ((-1 < iVar1) && (iVar1 = BN_cmp(a,pBVar3), iVar1 < 0)) {
      uVar4 = 1;
      goto LAB_00b500bc;
    }
    ERR_new();
    ERR_set_debug("crypto/sm2/sm2_key.c",0x2b,"ossl_sm2_key_private_check");
    ERR_set_error(0x35,0x71,0);
  }
  uVar4 = 0;
LAB_00b500bc:
  BN_free(pBVar3);
  return uVar4;
}

