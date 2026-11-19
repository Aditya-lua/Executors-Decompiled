/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b08d48
 */

int X509_issuer_and_serial_cmp(X509 *a,X509 *b)

{
  int iVar1;
  uint uVar2;
  
  if (b == (X509 *)0x0) {
    uVar2 = (uint)(a != (X509 *)0x0);
  }
  else if (a == (X509 *)0x0) {
    uVar2 = 0xffffffff;
  }
  else {
    iVar1 = ASN1_INTEGER_cmp((ASN1_INTEGER *)&a->sig_alg,(ASN1_INTEGER *)&b->sig_alg);
    if (iVar1 == 0) {
      iVar1 = X509_NAME_cmp(*(X509_NAME **)&(a->ex_data).dummy,*(X509_NAME **)&(b->ex_data).dummy);
      return iVar1;
    }
    uVar2 = iVar1 >> 0x1f | 1;
  }
  return uVar2;
}

