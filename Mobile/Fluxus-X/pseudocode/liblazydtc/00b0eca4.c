/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0eca4
 */

ASN1_TIME * X509_time_adj_ex(ASN1_TIME *s,int offset_day,long offset_sec,time_t *t)

{
  ASN1_UTCTIME *pAVar1;
  ASN1_TIME *pAVar2;
  ASN1_GENERALIZEDTIME *pAVar3;
  time_t local_28;
  
  if (t == (time_t *)0x0) {
    time(&local_28);
  }
  else {
    local_28 = *t;
  }
  if ((s != (ASN1_TIME *)0x0) && (((byte)s->flags >> 6 & 1) == 0)) {
    if (s->type == 0x18) {
      pAVar3 = ASN1_GENERALIZEDTIME_adj(s,local_28,offset_day,offset_sec);
      return pAVar3;
    }
    if (s->type == 0x17) {
      pAVar1 = ASN1_UTCTIME_adj(s,local_28,offset_day,offset_sec);
      return pAVar1;
    }
  }
  pAVar2 = ASN1_TIME_adj(s,local_28,offset_day,offset_sec);
  return pAVar2;
}

