/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009eee10
 */

ASN1_TIME * ASN1_TIME_adj(ASN1_TIME *s,time_t t,int offset_day,long offset_sec)

{
  int iVar1;
  long lVar2;
  ASN1_TIME *pAVar3;
  undefined1 auStack_70 [56];
  time_t local_38;
  
  local_38 = t;
  lVar2 = OPENSSL_gmtime(&local_38,auStack_70);
  if (lVar2 == 0) {
    ERR_new();
    ERR_set_debug("crypto/asn1/a_time.c",0x14c,"ASN1_TIME_adj");
    ERR_set_error(0xd,0xad,0);
  }
  else if (((offset_day == 0) && (offset_sec == 0)) ||
          (iVar1 = OPENSSL_gmtime_adj(lVar2,offset_day,offset_sec), iVar1 != 0)) {
    pAVar3 = (ASN1_TIME *)ossl_asn1_time_from_tm(s,lVar2,0xffffffff);
    return pAVar3;
  }
  return (ASN1_TIME *)0x0;
}

