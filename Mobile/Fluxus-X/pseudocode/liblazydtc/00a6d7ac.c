/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6d7ac
 */

int EVP_PKEY_type(int type)

{
  EVP_PKEY_ASN1_METHOD *pEVar1;
  int iVar2;
  ENGINE *local_18;
  
  pEVar1 = EVP_PKEY_asn1_find(&local_18,type);
  if (pEVar1 == (EVP_PKEY_ASN1_METHOD *)0x0) {
    iVar2 = 0;
  }
  else {
    iVar2 = *(int *)pEVar1;
  }
  ENGINE_finish(local_18);
  return iVar2;
}

