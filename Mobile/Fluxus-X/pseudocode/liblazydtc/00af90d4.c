/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af90d4
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

AUTHORITY_KEYID * AUTHORITY_KEYID_new(void)

{
  AUTHORITY_KEYID *pAVar1;
  
  pAVar1 = (AUTHORITY_KEYID *)ASN1_item_new((ASN1_ITEM *)&DAT_00c7eaa0);
  return pAVar1;
}

