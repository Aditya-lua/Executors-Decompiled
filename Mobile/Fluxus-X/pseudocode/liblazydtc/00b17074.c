/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b17074
 */

void NETSCAPE_SPKAC_free(NETSCAPE_SPKAC *a)

{
  ASN1_item_free((ASN1_VALUE *)a,(ASN1_ITEM *)&DAT_00c81e38);
  return;
}

