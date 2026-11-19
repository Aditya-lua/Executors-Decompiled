/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0ec10
 */

ASN1_TIME * X509_gmtime_adj(ASN1_TIME *s,long adj)

{
  ASN1_UTCTIME *pAVar1;
  ASN1_TIME *pAVar2;
  ASN1_GENERALIZEDTIME *pAVar3;
  time_t local_28;
  
  time(&local_28);
  if ((s != (ASN1_TIME *)0x0) && (((byte)s->flags >> 6 & 1) == 0)) {
    if (s->type == 0x18) {
      pAVar3 = ASN1_GENERALIZEDTIME_adj(s,local_28,0,adj);
      return pAVar3;
    }
    if (s->type == 0x17) {
      pAVar1 = ASN1_UTCTIME_adj(s,local_28,0,adj);
      return pAVar1;
    }
  }
  pAVar2 = ASN1_TIME_adj(s,local_28,0,adj);
  return pAVar2;
}

