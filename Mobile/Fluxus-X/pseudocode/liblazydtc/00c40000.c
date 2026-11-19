/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c40000
 */

int RSA_sign_ASN1_OCTET_STRING(int type,uchar *m,uint m_length,uchar *sigret,uint *siglen,RSA *rsa)

{
  int iVar1;
  
  iVar1 = RSA_sign_ASN1_OCTET_STRING(type,m,m_length,sigret,siglen,rsa);
  return iVar1;
}

