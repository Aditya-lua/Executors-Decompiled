/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad4e54
 */

int RSA_padding_add_PKCS1_OAEP(uchar *to,int tlen,uchar *f,int fl,uchar *p,int pl)

{
  int iVar1;
  
  iVar1 = ossl_rsa_padding_add_PKCS1_OAEP_mgf1_ex(0,to,tlen,f,fl,p,pl,0,0);
  return iVar1;
}

