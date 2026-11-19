/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c3f2d0
 */

X509_SIG *
PKCS8_encrypt(int pbe_nid,EVP_CIPHER *cipher,char *pass,int passlen,uchar *salt,int saltlen,int iter
             ,PKCS8_PRIV_KEY_INFO *p8)

{
  X509_SIG *pXVar1;
  
  pXVar1 = PKCS8_encrypt(pbe_nid,cipher,pass,passlen,salt,saltlen,iter,p8);
  return pXVar1;
}

