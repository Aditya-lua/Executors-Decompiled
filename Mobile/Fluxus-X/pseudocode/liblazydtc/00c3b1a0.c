/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c3b1a0
 */

int ECDSA_sign(int type,uchar *dgst,int dgstlen,uchar *sig,uint *siglen,EC_KEY *eckey)

{
  int iVar1;
  
  iVar1 = ECDSA_sign(type,dgst,dgstlen,sig,siglen,eckey);
  return iVar1;
}

