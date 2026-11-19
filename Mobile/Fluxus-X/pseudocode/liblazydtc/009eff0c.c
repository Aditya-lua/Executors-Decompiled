/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009eff0c
 */

ASN1_UTCTIME * ASN1_UTCTIME_adj(ASN1_UTCTIME *s,time_t t,int offset_day,long offset_sec)

{
  int iVar1;
  long lVar2;
  ASN1_UTCTIME *pAVar3;
  undefined1 auStack_70 [56];
  time_t local_38;
  
  local_38 = t;
  lVar2 = OPENSSL_gmtime(&local_38,auStack_70);
  pAVar3 = (ASN1_UTCTIME *)0x0;
  if (lVar2 != 0) {
    if (((offset_day == 0) && (offset_sec == 0)) ||
       (iVar1 = OPENSSL_gmtime_adj(lVar2,offset_day,offset_sec), iVar1 != 0)) {
      pAVar3 = (ASN1_UTCTIME *)ossl_asn1_time_from_tm(s,lVar2,0x17);
    }
    else {
      pAVar3 = (ASN1_UTCTIME *)0x0;
    }
  }
  return pAVar3;
}

