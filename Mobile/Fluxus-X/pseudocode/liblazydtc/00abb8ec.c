/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abb8ec
 */

uchar * PKCS12_pbe_crypt(X509_ALGOR *algor,char *pass,int passlen,uchar *in,int inlen,uchar **data,
                        int *datalen,int en_de)

{
  uchar *puVar1;
  
  puVar1 = (uchar *)PKCS12_pbe_crypt_ex(algor,pass,passlen,in,inlen,data,datalen,en_de,0,0);
  return puVar1;
}

