/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1eeb8
 */

void X509_set0_distinguishing_id(long param_1,undefined8 param_2)

{
  ASN1_OCTET_STRING_free(*(ASN1_STRING **)(param_1 + 0x168));
  *(undefined8 *)(param_1 + 0x168) = param_2;
  return;
}

