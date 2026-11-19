/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af5688
 */

int i2a_ACCESS_DESCRIPTION(BIO *bp,ACCESS_DESCRIPTION *a)

{
  i2a_ASN1_OBJECT(bp,a->method);
  return 2;
}

