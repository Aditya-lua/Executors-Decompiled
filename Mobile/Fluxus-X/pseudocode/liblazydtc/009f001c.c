/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f001c
 */

int ASN1_UTCTIME_print(BIO *fp,ASN1_UTCTIME *a)

{
  int iVar1;
  
  if (a->type == 0x17) {
    iVar1 = ASN1_TIME_print(fp,a);
    return iVar1;
  }
  return 0;
}

