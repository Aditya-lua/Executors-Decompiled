/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009eed94
 */

ASN1_TIME * ASN1_TIME_set(ASN1_TIME *s,time_t t)

{
  long lVar1;
  ASN1_TIME *pAVar2;
  undefined1 auStack_58 [56];
  time_t local_18;
  
  local_18 = t;
  lVar1 = OPENSSL_gmtime(&local_18,auStack_58);
  if (lVar1 == 0) {
    ERR_new();
    ERR_set_debug("crypto/asn1/a_time.c",0x14c,"ASN1_TIME_adj");
    ERR_set_error(0xd,0xad,0);
    pAVar2 = (ASN1_TIME *)0x0;
  }
  else {
    pAVar2 = (ASN1_TIME *)ossl_asn1_time_from_tm(s,lVar1,0xffffffff);
  }
  return pAVar2;
}

