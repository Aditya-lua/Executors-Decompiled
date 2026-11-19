/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a26528
 */

ECDSA_SIG * d2i_ECDSA_SIG(ECDSA_SIG **sig,uchar **pp,long len)

{
  long lVar1;
  BIGNUM *pBVar2;
  BIGNUM *pBVar3;
  ECDSA_SIG *ptr;
  
  if (-1 < len) {
    if (((sig == (ECDSA_SIG **)0x0) || (ptr = *sig, ptr == (ECDSA_SIG *)0x0)) &&
       (ptr = (ECDSA_SIG *)CRYPTO_zalloc(0x10,"crypto/ec/ec_asn1.c",0x4b4), ptr == (ECDSA_SIG *)0x0)
       ) {
      ERR_new();
      ERR_set_debug("crypto/ec/ec_asn1.c",0x4b6,"ECDSA_SIG_new");
      ERR_set_error(0x10,0xc0100,0);
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
         (lVar1 = ossl_decode_der_dsa_sig(pBVar3,pBVar2,pp,len), lVar1 != 0)) {
        if ((sig != (ECDSA_SIG **)0x0) && (*sig == (ECDSA_SIG *)0x0)) {
          *sig = ptr;
        }
        return ptr;
      }
      if ((sig != (ECDSA_SIG **)0x0) && (*sig != (ECDSA_SIG *)0x0)) {
        return (ECDSA_SIG *)0x0;
      }
      BN_clear_free(ptr->r);
      BN_clear_free(ptr->s);
      CRYPTO_free(ptr);
    }
  }
  return (ECDSA_SIG *)0x0;
}

