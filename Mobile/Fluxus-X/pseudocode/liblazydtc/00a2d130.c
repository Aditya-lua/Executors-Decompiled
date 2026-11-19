/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2d130
 */

bool BN_GF2m_mod_div(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                    BN_CTX *param_5)

{
  bool bVar1;
  int iVar2;
  BIGNUM *pBVar3;
  
  BN_CTX_start(param_5);
  pBVar3 = BN_CTX_get(param_5);
  if ((pBVar3 == (BIGNUM *)0x0) ||
     (iVar2 = BN_GF2m_mod_inv(pBVar3,param_3,param_4,param_5), iVar2 == 0)) {
    bVar1 = false;
  }
  else {
    iVar2 = BN_GF2m_mod_mul(param_1,param_2,pBVar3,param_4,param_5);
    bVar1 = iVar2 != 0;
  }
  BN_CTX_end(param_5);
  return bVar1;
}

