/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c3d8b0
 */

int PKCS5_PBKDF2_HMAC(char *pass,int passlen,uchar *salt,int saltlen,int iter,EVP_MD *digest,
                     int keylen,uchar *out)

{
  int iVar1;
  
  iVar1 = PKCS5_PBKDF2_HMAC(pass,passlen,salt,saltlen,iter,digest,keylen,out);
  return iVar1;
}

