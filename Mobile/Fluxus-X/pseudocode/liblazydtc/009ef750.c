/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ef750
 */

ASN1_GENERALIZEDTIME * ASN1_GENERALIZEDTIME_set(ASN1_GENERALIZEDTIME *s,time_t t)

{
  long lVar1;
  ASN1_GENERALIZEDTIME *pAVar2;
  undefined1 auStack_58 [56];
  time_t local_18;
  
  local_18 = t;
  lVar1 = OPENSSL_gmtime(&local_18,auStack_58);
  pAVar2 = (ASN1_GENERALIZEDTIME *)0x0;
  if (lVar1 != 0) {
    pAVar2 = (ASN1_GENERALIZEDTIME *)ossl_asn1_time_from_tm(s,lVar1,0x18);
  }
  return pAVar2;
}

