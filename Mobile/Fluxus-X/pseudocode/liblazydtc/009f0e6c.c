/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f0e6c
 */

int ASN1_put_eoc(uchar **pp)

{
  uchar *puVar1;
  
  puVar1 = *pp;
  puVar1[0] = '\0';
  puVar1[1] = '\0';
  *pp = puVar1 + 2;
  return 2;
}

