/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f1238
 */

void ASN1_STRING_set0(ASN1_STRING *str,void *data,int len)

{
  CRYPTO_free(str->data);
  str->data = data;
  str->length = len;
  return;
}

