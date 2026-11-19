/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af90e0
 */

void AUTHORITY_KEYID_free(AUTHORITY_KEYID *a)

{
  ASN1_item_free((ASN1_VALUE *)a,(ASN1_ITEM *)&DAT_00c7eaa0);
  return;
}

