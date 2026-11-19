/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6b0cc
 */

int PKCS5_pbe_set0_algor(X509_ALGOR *algor,int alg,int iter,uchar *salt,int saltlen)

{
  int iVar1;
  
  iVar1 = PKCS5_pbe_set0_algor_ex((int)algor,alg,iter,salt,saltlen,0);
  return iVar1;
}

