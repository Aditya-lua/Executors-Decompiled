/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f11dc
 */

void ASN1_STRING_free(ASN1_STRING *a)

{
  uint uVar1;
  
  if (a != (ASN1_STRING *)0x0) {
    uVar1 = (uint)a->flags;
    if ((uVar1 >> 4 & 1) == 0) {
      CRYPTO_free(a->data);
    }
    if ((uVar1 >> 7 & 1) == 0) {
      CRYPTO_free(a);
      return;
    }
  }
  return;
}

