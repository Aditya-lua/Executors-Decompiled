/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a109b8
 */

ASN1_TYPE * ASN1_generate_v3(char *str,X509V3_CTX *cnf)

{
  int iVar1;
  ASN1_TYPE *pAVar2;
  int local_24;
  
  local_24 = 0;
  pAVar2 = (ASN1_TYPE *)FUN_00a10a24(str,cnf,0,&local_24);
  iVar1 = local_24;
  if (local_24 != 0) {
    ERR_new();
    ERR_set_debug("crypto/asn1/asn1_gen.c",0x5e,"ASN1_generate_v3");
    ERR_set_error(0xd,iVar1,0);
  }
  return pAVar2;
}

