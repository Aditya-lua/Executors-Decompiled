/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009efe3c
 */

int ASN1_UTCTIME_check(ASN1_UTCTIME *a)

{
  int iVar1;
  
  if (a->type == 0x17) {
    iVar1 = ossl_asn1_time_to_tm(0,a);
    return iVar1;
  }
  return 0;
}

