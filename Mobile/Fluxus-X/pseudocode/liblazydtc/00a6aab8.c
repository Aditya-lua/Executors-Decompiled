/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6aab8
 */

X509_ALGOR * PKCS5_pbe2_set(EVP_CIPHER *cipher,int iter,uchar *salt,int saltlen)

{
  X509_ALGOR *pXVar1;
  
  pXVar1 = (X509_ALGOR *)PKCS5_pbe2_set_iv_ex(cipher,iter,salt,saltlen,0,0xffffffff,0);
  return pXVar1;
}

