/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009efad4
 */

int ASN1_TYPE_get(ASN1_TYPE *a)

{
  if (((a->type | 4U) == 5) || ((a->value).ptr != (char *)0x0)) {
    return a->type;
  }
  return 0;
}

