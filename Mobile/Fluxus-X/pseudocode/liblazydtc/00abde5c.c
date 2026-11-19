/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abde5c
 */

PKCS7 * d2i_PKCS7(PKCS7 **a,uchar **in,long len)

{
  PKCS7 *pPVar1;
  
  pPVar1 = (PKCS7 *)ASN1_item_d2i_ex();
  if (pPVar1 != (PKCS7 *)0x0) {
    ossl_pkcs7_resolve_libctx(pPVar1);
  }
  return pPVar1;
}

