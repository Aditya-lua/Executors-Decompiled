/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0c73c
 */

bool ossl_x509_set1_time(undefined8 *param_1,ASN1_STRING *param_2)

{
  if (((ASN1_STRING *)*param_1 != param_2) &&
     (param_2 = ASN1_STRING_dup(param_2), param_2 != (ASN1_STRING *)0x0)) {
    ASN1_TIME_free((ASN1_TIME *)*param_1);
    *param_1 = param_2;
  }
  return param_2 != (ASN1_STRING *)0x0;
}

