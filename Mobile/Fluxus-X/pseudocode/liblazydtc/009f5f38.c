/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f5f38
 */

int ASN1_BIT_STRING_get_bit(ASN1_BIT_STRING *a,int n)

{
  uint uVar1;
  
  if (n < 0) {
    return 0;
  }
  if (a == (ASN1_BIT_STRING *)0x0) {
    return 0;
  }
  uVar1 = 0;
  if (((int)((uint)n >> 3) < a->length) && (uVar1 = 0, a->data != (uchar *)0x0)) {
    uVar1 = (uint)((1 << (ulong)(~n & 7) & (uint)a->data[(uint)n >> 3]) != 0);
  }
  return uVar1;
}

