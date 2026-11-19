/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0eb5c
 */

ASN1_TIME * X509_time_adj(ASN1_TIME *s,long adj,time_t *t)

{
  ASN1_TIME *pAVar1;
  
  pAVar1 = X509_time_adj_ex(s,0,adj,t);
  return pAVar1;
}

