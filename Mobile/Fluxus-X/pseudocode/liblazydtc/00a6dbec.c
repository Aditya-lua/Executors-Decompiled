/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6dbec
 */

int EVP_PKEY_set1_DH(EVP_PKEY *pkey,dh_st *key)

{
  int iVar1;
  int iVar2;
  long lVar3;
  
  iVar1 = ossl_dh_is_named_safe_prime_group(key);
  iVar2 = 0x1c;
  if (iVar1 == 0) {
    lVar3 = DH_get0_q(key);
    iVar2 = 0x1c;
    if (lVar3 != 0) {
      iVar2 = 0x398;
    }
  }
  iVar2 = EVP_PKEY_assign(pkey,iVar2,key);
  if (iVar2 != 0) {
    DH_up_ref(key);
  }
  return iVar2;
}

