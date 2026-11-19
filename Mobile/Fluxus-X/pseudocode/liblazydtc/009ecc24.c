/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ecc24
 */

void ASN1_OBJECT_free(ASN1_OBJECT *a)

{
  uint uVar1;
  
  if (a != (ASN1_OBJECT *)0x0) {
    uVar1 = a->flags;
    if ((uVar1 >> 2 & 1) != 0) {
      CRYPTO_free(a->sn);
      CRYPTO_free(a->ln);
      uVar1 = a->flags;
      a->sn = (char *)0x0;
      a->ln = (char **)0x0;
    }
    if ((uVar1 >> 3 & 1) != 0) {
      CRYPTO_free(a->data);
      uVar1 = a->flags;
      a->data = (uchar *)0x0;
      a->length = 0;
    }
    if ((uVar1 & 1) != 0) {
      CRYPTO_free(a);
      return;
    }
  }
  return;
}

