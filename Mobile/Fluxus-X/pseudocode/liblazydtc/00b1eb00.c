/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1eb00
 */

X509 * X509_dup(X509 *x509)

{
  X509 *pXVar1;
  
  pXVar1 = ASN1_item_dup((ASN1_ITEM *)&DAT_00c82968,x509);
  return pXVar1;
}

