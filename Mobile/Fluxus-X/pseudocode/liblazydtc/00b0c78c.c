/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0c78c
 */

bool X509_set1_notBefore(long param_1,ASN1_STRING *param_2)

{
  bool bVar1;
  
  bVar1 = false;
  if (param_1 != 0) {
    if ((*(ASN1_STRING **)(param_1 + 0x38) != param_2) &&
       (param_2 = ASN1_STRING_dup(param_2), param_2 != (ASN1_STRING *)0x0)) {
      ASN1_TIME_free(*(ASN1_TIME **)(param_1 + 0x38));
      *(ASN1_STRING **)(param_1 + 0x38) = param_2;
    }
    bVar1 = param_2 != (ASN1_STRING *)0x0;
  }
  return bVar1;
}

