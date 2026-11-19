/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c37eb0
 */

int PKCS8_pkey_get0(ASN1_OBJECT **ppkalg,uchar **pk,int *ppklen,X509_ALGOR **pa,
                   PKCS8_PRIV_KEY_INFO *p8)

{
  int iVar1;
  
  iVar1 = PKCS8_pkey_get0(ppkalg,pk,ppklen,pa,p8);
  return iVar1;
}

