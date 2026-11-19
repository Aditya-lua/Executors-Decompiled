/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c3b1b0
 */

int ECDSA_sign_ex(int type,uchar *dgst,int dgstlen,uchar *sig,uint *siglen,BIGNUM *kinv,BIGNUM *rp,
                 EC_KEY *eckey)

{
  int iVar1;
  
  iVar1 = ECDSA_sign_ex(type,dgst,dgstlen,sig,siglen,kinv,rp,eckey);
  return iVar1;
}

