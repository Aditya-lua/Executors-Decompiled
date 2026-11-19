/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c3b180
 */

ECDSA_SIG * ECDSA_do_sign_ex(uchar *dgst,int dgstlen,BIGNUM *kinv,BIGNUM *rp,EC_KEY *eckey)

{
  ECDSA_SIG *pEVar1;
  
  pEVar1 = ECDSA_do_sign_ex(dgst,dgstlen,kinv,rp,eckey);
  return pEVar1;
}

