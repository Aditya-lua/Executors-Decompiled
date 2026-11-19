/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c37ed0
 */

int PKCS8_pkey_set0(PKCS8_PRIV_KEY_INFO *priv,ASN1_OBJECT *aobj,int version,int ptype,void *pval,
                   uchar *penc,int penclen)

{
  int iVar1;
  
  iVar1 = PKCS8_pkey_set0(priv,aobj,version,ptype,pval,penc,penclen);
  return iVar1;
}

