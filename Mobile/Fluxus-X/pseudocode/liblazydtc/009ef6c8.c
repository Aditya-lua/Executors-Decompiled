/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ef6c8
 */

int ASN1_GENERALIZEDTIME_check(ASN1_GENERALIZEDTIME *a)

{
  int iVar1;
  
  if (a->type == 0x18) {
    iVar1 = ossl_asn1_time_to_tm(0,a);
    return iVar1;
  }
  return 0;
}

