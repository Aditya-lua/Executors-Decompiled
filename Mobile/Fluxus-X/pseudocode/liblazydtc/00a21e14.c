/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a21e14
 */

DSA_SIG * d2i_DSA_SIG(DSA_SIG **v,uchar **pp,long length)

{
  long lVar1;
  BIGNUM *pBVar2;
  BIGNUM *pBVar3;
  DSA_SIG *ptr;
  
  if (-1 < length) {
    if (((v == (DSA_SIG **)0x0) || (ptr = *v, ptr == (DSA_SIG *)0x0)) &&
       (ptr = (DSA_SIG *)CRYPTO_zalloc(0x10,"crypto/dsa/dsa_sign.c",0x24), ptr == (DSA_SIG *)0x0)) {
      ERR_new();
      ERR_set_debug("crypto/dsa/dsa_sign.c",0x26,"DSA_SIG_new");
      ERR_set_error(10,0xc0100,0);
    }
    else {
      pBVar3 = ptr->r;
      if (pBVar3 == (BIGNUM *)0x0) {
        pBVar3 = BN_new();
        ptr->r = pBVar3;
        pBVar2 = ptr->s;
      }
      else {
        pBVar2 = ptr->s;
      }
      if (pBVar2 == (BIGNUM *)0x0) {
        pBVar2 = BN_new();
        pBVar3 = ptr->r;
        ptr->s = pBVar2;
      }
      if (((pBVar3 != (BIGNUM *)0x0) && (pBVar2 != (BIGNUM *)0x0)) &&
         (lVar1 = ossl_decode_der_dsa_sig(pBVar3,pBVar2,pp,length), lVar1 != 0)) {
        if ((v != (DSA_SIG **)0x0) && (*v == (DSA_SIG *)0x0)) {
          *v = ptr;
        }
        return ptr;
      }
      if ((v != (DSA_SIG **)0x0) && (*v != (DSA_SIG *)0x0)) {
        return (DSA_SIG *)0x0;
      }
      BN_clear_free(ptr->r);
      BN_clear_free(ptr->s);
      CRYPTO_free(ptr);
    }
  }
  return (DSA_SIG *)0x0;
}

