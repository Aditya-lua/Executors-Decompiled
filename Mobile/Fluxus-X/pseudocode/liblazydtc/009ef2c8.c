/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ef2c8
 */

bool ASN1_TIME_print_ex(void)

{
  int iVar1;
  
  iVar1 = ossl_asn1_time_print_ex();
  return 0 < iVar1;
}

