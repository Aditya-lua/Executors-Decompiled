/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0d7c0
 */

int X509_EXTENSION_set_data(X509_EXTENSION *ex,ASN1_OCTET_STRING *data)

{
  int iVar1;
  uint uVar2;
  
  uVar2 = 0;
  if (ex != (X509_EXTENSION *)0x0) {
    iVar1 = ASN1_OCTET_STRING_set((ASN1_STRING *)&ex->value,data->data,data->length);
    uVar2 = (uint)(iVar1 != 0);
  }
  return uVar2;
}

