/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0c700
 */

int X509_set_serialNumber(X509 *x,ASN1_INTEGER *serial)

{
  int iVar1;
  
  iVar1 = 0;
  if (x != (X509 *)0x0) {
    if ((ASN1_INTEGER *)&x->sig_alg != serial) {
      iVar1 = ASN1_STRING_copy((ASN1_STRING *)&x->sig_alg,serial);
      return iVar1;
    }
    iVar1 = 1;
  }
  return iVar1;
}

