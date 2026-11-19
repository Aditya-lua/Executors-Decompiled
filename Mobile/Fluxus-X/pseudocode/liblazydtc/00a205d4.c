/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a205d4
 */

DH * DSA_dup_DH(DSA *r)

{
  int iVar1;
  DH *dh;
  undefined8 uVar2;
  BIGNUM *pBVar3;
  BIGNUM *a;
  
  if (r == (DSA *)0x0) {
    dh = (DH *)0x0;
    a = (BIGNUM *)0x0;
    pBVar3 = (BIGNUM *)0x0;
    goto LAB_00a2064c;
  }
  dh = DH_new();
  if (dh != (DH *)0x0) {
    uVar2 = ossl_dh_get0_params(dh);
    iVar1 = ossl_ffc_params_copy(uVar2,&r->version);
    if (iVar1 != 0) {
      pBVar3 = (BIGNUM *)(r->ex_data).sk;
      if (pBVar3 == (BIGNUM *)0x0) {
        a = (BIGNUM *)0x0;
        pBVar3 = (BIGNUM *)0x0;
        if (*(long *)&(r->ex_data).dummy == 0) {
          return dh;
        }
      }
      else {
        a = BN_dup(pBVar3);
        if (a == (BIGNUM *)0x0) {
          pBVar3 = (BIGNUM *)0x0;
        }
        else {
          pBVar3 = *(BIGNUM **)&(r->ex_data).dummy;
          if (pBVar3 == (BIGNUM *)0x0) {
            pBVar3 = (BIGNUM *)0x0;
          }
          else {
            pBVar3 = BN_dup(pBVar3);
            if (pBVar3 == (BIGNUM *)0x0) goto LAB_00a2064c;
          }
          iVar1 = DH_set0_key(dh,a,pBVar3);
          if (iVar1 != 0) {
            return dh;
          }
        }
      }
      goto LAB_00a2064c;
    }
  }
  a = (BIGNUM *)0x0;
  pBVar3 = (BIGNUM *)0x0;
LAB_00a2064c:
  BN_free(a);
  BN_free(pBVar3);
  DH_free(dh);
  return (DH *)0x0;
}

