/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ef818
 */

int ASN1_GENERALIZEDTIME_print(BIO *fp,ASN1_GENERALIZEDTIME *a)

{
  int iVar1;
  
  if (a->type == 0x18) {
    iVar1 = ASN1_TIME_print(fp,a);
    return iVar1;
  }
  return 0;
}

