/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b5248c
 */

bool FUN_00b5248c(undefined8 param_1,undefined8 param_2,uint param_3)

{
  bool bVar1;
  bool bVar2;
  int iVar3;
  BIGNUM *pBVar4;
  BIGNUM *pBVar5;
  bool bVar6;
  
  iVar3 = ossl_prov_is_running();
  if (iVar3 == 0) {
    return false;
  }
  pBVar4 = (BIGNUM *)RSA_get0_e(param_1);
  pBVar5 = (BIGNUM *)RSA_get0_e(param_2);
  iVar3 = BN_cmp(pBVar4,pBVar5);
  bVar2 = iVar3 == 0;
  if ((param_3 & 3) == 0) {
    return bVar2;
  }
  bVar6 = false;
  if ((param_3 >> 1 & 1) == 0) {
LAB_00b524ec:
    if (((param_3 & 1) == 0) || (bVar6)) goto LAB_00b5258c;
    pBVar5 = (BIGNUM *)RSA_get0_d(param_1);
    pBVar4 = (BIGNUM *)RSA_get0_d(param_2);
    if ((pBVar5 == (BIGNUM *)0x0) || (pBVar4 == (BIGNUM *)0x0)) {
      bVar6 = false;
      goto LAB_00b5258c;
    }
    if (bVar2) goto LAB_00b52574;
  }
  else {
    pBVar5 = (BIGNUM *)RSA_get0_n(param_1);
    pBVar4 = (BIGNUM *)RSA_get0_n(param_2);
    bVar1 = pBVar5 == (BIGNUM *)0x0 || pBVar4 == (BIGNUM *)0x0;
    bVar6 = pBVar5 != (BIGNUM *)0x0 && pBVar4 != (BIGNUM *)0x0;
    bVar2 = iVar3 == 0 && bVar1;
    if ((bVar1) || (iVar3 != 0)) goto LAB_00b524ec;
LAB_00b52574:
    iVar3 = BN_cmp(pBVar5,pBVar4);
    bVar2 = iVar3 == 0;
  }
  bVar6 = true;
LAB_00b5258c:
  return bVar6 && bVar2;
}

