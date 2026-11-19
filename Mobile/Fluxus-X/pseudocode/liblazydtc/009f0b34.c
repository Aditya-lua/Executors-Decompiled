/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f0b34
 */

int ASN1_const_check_infinite_end(uchar **p,long len)

{
  uchar *puVar1;
  
  if (0 < len) {
    if (((len == 1) || (puVar1 = *p, *puVar1 != '\0')) || (puVar1[1] != '\0')) {
      return 0;
    }
    *p = puVar1 + 2;
  }
  return 1;
}

