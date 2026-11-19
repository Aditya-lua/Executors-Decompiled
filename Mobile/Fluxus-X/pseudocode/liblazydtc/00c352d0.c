/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c352d0
 */

int EVP_PKEY_asn1_get0_info
              (int *ppkey_id,int *pkey_base_id,int *ppkey_flags,char **pinfo,char **ppem_str,
              EVP_PKEY_ASN1_METHOD *ameth)

{
  int iVar1;
  
  iVar1 = EVP_PKEY_asn1_get0_info(ppkey_id,pkey_base_id,ppkey_flags,pinfo,ppem_str,ameth);
  return iVar1;
}

