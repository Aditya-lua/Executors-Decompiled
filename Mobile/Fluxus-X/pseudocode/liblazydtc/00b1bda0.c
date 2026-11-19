/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1bda0
 */

int X509_NAME_set(X509_NAME **xn,X509_NAME *name)

{
  uint uVar1;
  X509_NAME *pXVar2;
  
  if (*xn == name) {
    uVar1 = (uint)(name != (X509_NAME *)0x0);
  }
  else {
    pXVar2 = ASN1_item_dup((ASN1_ITEM *)&DAT_00c824b0,name);
    uVar1 = 0;
    if (pXVar2 != (X509_NAME *)0x0) {
      ASN1_item_free((ASN1_VALUE *)*xn,(ASN1_ITEM *)&DAT_00c824b0);
      uVar1 = 1;
      *xn = pXVar2;
    }
  }
  return uVar1;
}

