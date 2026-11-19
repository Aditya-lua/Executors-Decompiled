/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c37ad0
 */

ASN1_UTCTIME * ASN1_UTCTIME_adj(ASN1_UTCTIME *s,time_t t,int offset_day,long offset_sec)

{
  ASN1_UTCTIME *pAVar1;
  
  pAVar1 = ASN1_UTCTIME_adj(s,t,offset_day,offset_sec);
  return pAVar1;
}

