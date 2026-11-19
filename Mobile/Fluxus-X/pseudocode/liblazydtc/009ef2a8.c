/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ef2a8
 */

int ASN1_TIME_print(BIO *fp,ASN1_TIME *a)

{
  int iVar1;
  
  iVar1 = ossl_asn1_time_print_ex(fp,a,0);
  return (int)(0 < iVar1);
}

