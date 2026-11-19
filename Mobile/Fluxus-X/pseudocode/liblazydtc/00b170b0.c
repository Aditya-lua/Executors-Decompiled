/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b170b0
 */

void NETSCAPE_SPKI_free(NETSCAPE_SPKI *a)

{
  ASN1_item_free((ASN1_VALUE *)a,(ASN1_ITEM *)&DAT_00c81e70);
  return;
}

