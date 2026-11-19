/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2d1cc
 */

bool BN_GF2m_mod_div_arr(undefined8 param_1,undefined8 param_2,undefined8 param_3,int *param_4,
                        BN_CTX *param_5)

{
  bool bVar1;
  int iVar2;
  BIGNUM *a;
  BIGNUM *pBVar3;
  
  BN_CTX_start(param_5);
  a = BN_CTX_get(param_5);
  if (a == (BIGNUM *)0x0) {
LAB_00a2d288:
    bVar1 = false;
  }
  else {
    BN_zero_ex();
    iVar2 = *param_4;
    if (iVar2 != -1) {
      do {
        param_4 = param_4 + 1;
        iVar2 = BN_set_bit(a,iVar2);
        if (iVar2 == 0) goto LAB_00a2d288;
        iVar2 = *param_4;
      } while (iVar2 != -1);
    }
    BN_CTX_start(param_5);
    pBVar3 = BN_CTX_get(param_5);
    if ((pBVar3 == (BIGNUM *)0x0) || (iVar2 = BN_GF2m_mod_inv(pBVar3,param_3,a,param_5), iVar2 == 0)
       ) {
      bVar1 = false;
    }
    else {
      iVar2 = BN_GF2m_mod_mul(param_1,param_2,pBVar3,a,param_5);
      bVar1 = iVar2 != 0;
    }
    BN_CTX_end(param_5);
  }
  BN_CTX_end(param_5);
  return bVar1;
}

