/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009efec4
 */

ASN1_UTCTIME * ASN1_UTCTIME_set(ASN1_UTCTIME *s,time_t t)

{
  long lVar1;
  ASN1_UTCTIME *pAVar2;
  undefined1 auStack_58 [56];
  time_t local_18;
  
  local_18 = t;
  lVar1 = OPENSSL_gmtime(&local_18,auStack_58);
  pAVar2 = (ASN1_UTCTIME *)0x0;
  if (lVar1 != 0) {
    pAVar2 = (ASN1_UTCTIME *)ossl_asn1_time_from_tm(s,lVar1,0x17);
  }
  return pAVar2;
}

