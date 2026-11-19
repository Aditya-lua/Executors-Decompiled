/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ada354
 */

bool ossl_rsa_get_lcm(BN_CTX *param_1,BIGNUM *param_2,BIGNUM *param_3,BIGNUM *param_4,
                     BIGNUM *param_5,BIGNUM *param_6,BIGNUM *param_7,BIGNUM *param_8)

{
  bool bVar1;
  int iVar2;
  BIGNUM *pBVar3;
  
  pBVar3 = BN_value_one();
  iVar2 = BN_sub(param_6,param_2,pBVar3);
  bVar1 = false;
  if (iVar2 != 0) {
    pBVar3 = BN_value_one();
    iVar2 = BN_sub(param_7,param_3,pBVar3);
    bVar1 = false;
    if (iVar2 != 0) {
      iVar2 = BN_mul(param_8,param_6,param_7,param_1);
      bVar1 = false;
      if (iVar2 != 0) {
        iVar2 = BN_gcd(param_5,param_6,param_7,param_1);
        bVar1 = false;
        if (iVar2 != 0) {
          iVar2 = BN_div(param_4,(BIGNUM *)0x0,param_8,param_5,param_1);
          bVar1 = iVar2 != 0;
        }
      }
    }
  }
  return bVar1;
}

