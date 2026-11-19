/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c374b0
 */

ASN1_GENERALIZEDTIME *
ASN1_GENERALIZEDTIME_adj(ASN1_GENERALIZEDTIME *s,time_t t,int offset_day,long offset_sec)

{
  ASN1_GENERALIZEDTIME *pAVar1;
  
  pAVar1 = ASN1_GENERALIZEDTIME_adj(s,t,offset_day,offset_sec);
  return pAVar1;
}

