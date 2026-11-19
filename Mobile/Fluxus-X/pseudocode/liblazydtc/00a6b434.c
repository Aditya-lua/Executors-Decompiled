/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6b434
 */

int PKCS5_PBKDF2_HMAC(char *pass,int passlen,uchar *salt,int saltlen,int iter,EVP_MD *digest,
                     int keylen,uchar *out)

{
  int iVar1;
  
  iVar1 = ossl_pkcs5_pbkdf2_hmac_ex((int)pass,passlen,salt,saltlen,iter,digest,keylen,out,0,0);
  return iVar1;
}

