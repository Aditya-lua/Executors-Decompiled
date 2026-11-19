/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c378f0
 */

ASN1_TIME * ASN1_TIME_adj(ASN1_TIME *s,time_t t,int offset_day,long offset_sec)

{
  ASN1_TIME *pAVar1;
  
  pAVar1 = ASN1_TIME_adj(s,t,offset_day,offset_sec);
  return pAVar1;
}

