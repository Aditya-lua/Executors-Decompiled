/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c32be0
 */

int X509_PUBKEY_get0_param
              (ASN1_OBJECT **ppkalg,uchar **pk,int *ppklen,X509_ALGOR **pa,X509_PUBKEY *pub)

{
  int iVar1;
  
  iVar1 = X509_PUBKEY_get0_param(ppkalg,pk,ppklen,pa,pub);
  return iVar1;
}

