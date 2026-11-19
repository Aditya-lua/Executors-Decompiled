/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c3f4a0
 */

uchar * PKCS12_pbe_crypt(X509_ALGOR *algor,char *pass,int passlen,uchar *in,int inlen,uchar **data,
                        int *datalen,int en_de)

{
  uchar *puVar1;
  
  puVar1 = PKCS12_pbe_crypt(algor,pass,passlen,in,inlen,data,datalen,en_de);
  return puVar1;
}

