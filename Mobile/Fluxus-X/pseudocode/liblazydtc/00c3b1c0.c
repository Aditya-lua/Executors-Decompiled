/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c3b1c0
 */

int ECDSA_verify(int type,uchar *dgst,int dgstlen,uchar *sig,int siglen,EC_KEY *eckey)

{
  int iVar1;
  
  iVar1 = ECDSA_verify(type,dgst,dgstlen,sig,siglen,eckey);
  return iVar1;
}

