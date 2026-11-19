/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6aac8
 */

X509_ALGOR * PKCS5_pbkdf2_set(int iter,uchar *salt,int saltlen,int prf_nid,int keylen)

{
  X509_ALGOR *pXVar1;
  
  pXVar1 = (X509_ALGOR *)PKCS5_pbkdf2_set_ex(iter,salt,saltlen,prf_nid,keylen,0);
  return pXVar1;
}

