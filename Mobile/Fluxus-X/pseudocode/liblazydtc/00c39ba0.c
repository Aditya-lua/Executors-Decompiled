/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c39ba0
 */

int X509_PUBKEY_set0_param
              (X509_PUBKEY *pub,ASN1_OBJECT *aobj,int ptype,void *pval,uchar *penc,int penclen)

{
  int iVar1;
  
  iVar1 = X509_PUBKEY_set0_param(pub,aobj,ptype,pval,penc,penclen);
  return iVar1;
}

