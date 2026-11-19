/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad5e5c
 */

int RSA_padding_add_PKCS1_type_2(uchar *to,int tlen,uchar *f,int fl)

{
  int iVar1;
  
  iVar1 = ossl_rsa_padding_add_PKCS1_type_2_ex(0,to,tlen,f,fl);
  return iVar1;
}

