/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a52850
 */

EVP_PKEY_ASN1_METHOD * ENGINE_get_pkey_asn1_meth(ENGINE *e,int nid)

{
  int iVar1;
  EVP_PKEY_ASN1_METHOD *local_18;
  
  if ((*(code **)(e + 0x50) == (code *)0x0) ||
     (iVar1 = (**(code **)(e + 0x50))(e,&local_18,0,nid), iVar1 == 0)) {
    ERR_new();
    ERR_set_debug("crypto/engine/tb_asnmth.c",0x5c,"ENGINE_get_pkey_asn1_meth");
    ERR_set_error(0x26,0x65,0);
    local_18 = (EVP_PKEY_ASN1_METHOD *)0x0;
  }
  return local_18;
}

