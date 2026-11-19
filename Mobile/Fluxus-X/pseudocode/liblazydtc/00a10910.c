/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a10910
 */

ASN1_TYPE * ASN1_generate_nconf(char *str,CONF *nconf)

{
  int iVar1;
  ASN1_TYPE *pAVar2;
  X509V3_CTX local_68;
  int local_24;
  
  if (nconf == (CONF *)0x0) {
    local_68.flags = 0;
    pAVar2 = (ASN1_TYPE *)FUN_00a10a24(str,0,0,&local_68);
    iVar1 = local_68.flags;
  }
  else {
    X509V3_set_nconf(&local_68,nconf);
    local_24 = 0;
    pAVar2 = (ASN1_TYPE *)FUN_00a10a24(str,&local_68,0,&local_24);
    iVar1 = local_24;
  }
  if (iVar1 != 0) {
    ERR_new();
    ERR_set_debug("crypto/asn1/asn1_gen.c",0x5e,"ASN1_generate_v3");
    ERR_set_error(0xd,iVar1,0);
  }
  return pAVar2;
}

