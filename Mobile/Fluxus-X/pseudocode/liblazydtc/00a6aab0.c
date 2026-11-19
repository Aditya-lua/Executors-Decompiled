/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6aab0
 */

X509_ALGOR *
PKCS5_pbe2_set_iv(EVP_CIPHER *cipher,int iter,uchar *salt,int saltlen,uchar *aiv,int prf_nid)

{
  X509_ALGOR *pXVar1;
  
  pXVar1 = (X509_ALGOR *)PKCS5_pbe2_set_iv_ex(cipher,iter,salt,saltlen,aiv,prf_nid,0);
  return pXVar1;
}

