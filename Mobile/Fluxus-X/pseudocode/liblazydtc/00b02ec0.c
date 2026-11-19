/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b02ec0
 */

int X509_check_issued(X509 *issuer,X509 *subject)

{
  int iVar1;
  
  iVar1 = ossl_x509_likely_issued();
  if (iVar1 == 0) {
    if ((*(byte *)((long)&subject[1].name + 1) >> 2 & 1) == 0) {
      if (((*(uint *)&issuer[1].name >> 1 & 1) != 0) &&
         ((*(byte *)((long)&issuer[1].name + 4) >> 2 & 1) == 0)) {
        return 0x20;
      }
    }
    else if (((*(uint *)&issuer[1].name >> 1 & 1) != 0) &&
            (-1 < *(char *)((long)&issuer[1].name + 4))) {
      return 0x27;
    }
    iVar1 = 0;
  }
  return iVar1;
}

