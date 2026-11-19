/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6b454
 */

int PKCS5_PBKDF2_HMAC_SHA1
              (char *pass,int passlen,uchar *salt,int saltlen,int iter,int keylen,uchar *out)

{
  int iVar1;
  long lVar2;
  
  lVar2 = EVP_MD_fetch(0,&DAT_002d142e,0,saltlen,iter,keylen);
  if (lVar2 == 0) {
    iVar1 = 0;
  }
  else {
    iVar1 = ossl_pkcs5_pbkdf2_hmac_ex(pass,passlen,salt,saltlen,iter,lVar2,keylen,out,0,0);
  }
  EVP_MD_free(lVar2);
  return iVar1;
}

